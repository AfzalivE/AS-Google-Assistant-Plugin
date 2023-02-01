package com.google.assistant.plugin.appactions.state

import com.android.ide.common.rendering.api.ResourceNamespace
import com.android.ide.common.rendering.api.ResourceValue
import com.android.ide.common.rendering.api.ResourceValueImpl
import com.android.ide.common.resources.ResourceItem
import com.android.resources.ResourceFolderType
import com.android.resources.ResourceType
import com.android.tools.idea.concurrency.addCallback
import com.android.tools.idea.concurrency.executeOnPooledThread
import com.android.tools.idea.model.AndroidModel
import com.android.tools.idea.model.MergedManifestManager.Companion.getMergedManifest
import com.android.tools.idea.model.MergedManifestSnapshot
import com.android.tools.idea.projectsystem.PROJECT_SYSTEM_SYNC_TOPIC
import com.android.tools.idea.projectsystem.ProjectSystemSyncManager.SyncResult
import com.android.tools.idea.projectsystem.ProjectSystemSyncManager.SyncResultListener
import com.android.tools.idea.res.LocalResourceRepository
import com.android.tools.idea.res.ResourceRepositoryManager
import com.google.assistant.plugin.appactions.state.AppActionsState.*
import com.google.assistant.plugin.common.utils.LoggingUtils
import com.intellij.openapi.module.Module
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.openapi.vfs.VirtualFileManager
import com.intellij.openapi.vfs.newvfs.BulkFileListener
import com.intellij.openapi.vfs.newvfs.events.VFileEvent
import com.intellij.psi.PsiManager
import com.intellij.psi.xml.XmlFile
import com.intellij.util.concurrency.EdtExecutorService
import org.jetbrains.android.dom.manifest.ManifestDomFileDescription
import org.jetbrains.android.facet.AndroidFacet
import org.jetbrains.android.facet.SourceProviderManager
import org.jetbrains.kotlin.idea.util.projectStructure.allModules
import org.jetbrains.kotlin.idea.util.projectStructure.getModule
import org.w3c.dom.Document
import org.w3c.dom.NodeList
import java.util.concurrent.Executor
import javax.xml.xpath.XPathConstants
import javax.xml.xpath.XPathExpression
import javax.xml.xpath.XPathFactory
import kotlin.jvm.internal.Intrinsics

/* compiled from: ProjectStateManager.kt */
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/state/ProjectStateManager.class */
class ProjectStateManager(project: Project) {
    private val stateSubject: ProjectStateSubject
    private val actionsMetaDataExpression: XPathExpression
    private val shortcutsMetaDataExpression: XPathExpression
    private val allAppModules: MutableList<String?> = ArrayList()
    private val androidAppStates: MutableList<AndroidAppState?> = ArrayList()
    private val project: Project

    init {
        this.project = project
        val messageBus = this.project.messageBus
        Intrinsics.checkNotNullExpressionValue(messageBus, "project.messageBus")
        stateSubject = ProjectStateSubject(messageBus)
        actionsMetaDataExpression = XPathFactory.newInstance().newXPath()
            .compile("//manifest/application/meta-data[@*[namespace-uri()='http://schemas.android.com/apk/res/android' and local-name()='name']='com.google.android.actions']")
        shortcutsMetaDataExpression = XPathFactory.newInstance().newXPath()
            .compile("//manifest/application/activity/meta-data[@*[namespace-uri()='http://schemas.android.com/apk/res/android' and local-name()='name']='android.app.shortcuts']")
        startListeningProjectSync()
    }

    val stateObservable: ProjectStateSubject
        get() = stateSubject

    private fun startListeningProjectSync() {
        clearAppStates()
        listenVfsChanges()
    }

    private fun clearAppStates() {
        project.messageBus.connect()
            .subscribe<SyncResultListener>(PROJECT_SYSTEM_SYNC_TOPIC, object : SyncResultListener {
                // from class: com.google.assistant.plugin.appactions.state.ProjectStateManager$clearAppStates$1
                override fun syncEnded(result: SyncResult) {
                    allAppModules.clear()
                    androidAppStates.clear()
                    val projectStateSubject: ProjectStateSubject = stateSubject
                    projectStateSubject.state =
                        ProjectState(
                            ProjectSyncStatus.Synchronizing,
                            emptyMap()
                        )
                    ingestAllAndroidFacets()
                }
            })
    }

    private fun listenVfsChanges() {
        project.messageBus.connect(project).subscribe(VirtualFileManager.VFS_CHANGES, object : BulkFileListener {
            // from class: com.google.assistant.plugin.appactions.state.ProjectStateManager$listenVfsChanges$1
            override fun after(list: List<VFileEvent>) {
                var isRelevant: Boolean
                for (fileEvent in list) {
                    val file = fileEvent.file
                    if (file != null) {
                        val project = this@ProjectStateManager.project
                        val module = file.getModule(project)
                        module?.let {
                            val facet = AndroidFacet.getInstance(it) ?: return

                            isRelevant = this@ProjectStateManager.isRelevant(file, facet)
                            if (isRelevant) {
                                ingestAllAndroidFacets()
                                return
                            }
                        }
                    }
                }
            }
        })
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun ingestAllAndroidFacets() {
        val `$this$forEach$iv`: Iterable<*> = project.allModules()
        for (`element$iv` in `$this$forEach$iv`) {
            val module = `element$iv` as Module?
            val facet = AndroidFacet.getInstance(module!!)
            facet?.let { ingestAndroidFacet(it) }
        }
    }

    private fun ingestAndroidFacet(facet: AndroidFacet) {
        var appId: String?
        val configuration = facet.configuration
        if (!configuration.isAppProject) {
            return
        }
        val module = facet.module
        val androidModel = AndroidModel.get(facet)
        androidModel?.let {
            val appId = androidModel.applicationId
            val list = allAppModules
            val name = module.name
            list.add(name)
            val listenableFuture = executeOnPooledThread { getMergedManifest(module).get() }
            val edtExecutorService: Executor = EdtExecutorService.getInstance()
            listenableFuture.addCallback(
                edtExecutorService,
                { mergedManifestSnapshot ->
                    continueWithMergedManifest(facet, appId, mergedManifestSnapshot!!)
                },
                { throwable ->
                    if (throwable != null) {
                        LoggingUtils.INSTANCE.error("Failed to get merged manifest", throwable)
                        updateAndroidAppsState(module.name, appId, ErrorMergingManifest(throwable))
                    }
                }
            )
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun continueWithMergedManifest(facet: AndroidFacet, appId: String, snapshot: MergedManifestSnapshot) {
        val module = facet.module
        val moduleName = module.name
        val document = snapshot.document
        if (document == null) {
            updateAndroidAppsState(moduleName, appId, MissingMergedManifest.INSTANCE)
            return
        }
        val actionsResourceRef = getMetadataResource(document)
        if (actionsResourceRef == null) {
            updateAndroidAppsState(moduleName, appId, AppActionsState.MissingManifestMetadata.INSTANCE)
        } else if (!actionsResourceRef.startsWith("@xml/", false)) {
            updateAndroidAppsState(moduleName, appId, InvalidActionsResource(actionsResourceRef))
        } else {
            val actionsResourceName = actionsResourceRef.substring("@xml/".length)
            Intrinsics.checkNotNullExpressionValue(
                actionsResourceName,
                "(this as java.lang.String).substring(startIndex)"
            )
            val projectResources: LocalResourceRepository = ResourceRepositoryManager.getProjectResources(facet)
            Intrinsics.checkNotNullExpressionValue(
                projectResources,
                "ResourceRepositoryManage…etProjectResources(facet)"
            )
            val xmlResources: List<*> =
                projectResources.getResources(ResourceNamespace.TODO(), ResourceType.XML, actionsResourceName)
            Intrinsics.checkNotNullExpressionValue(xmlResources, "projectResources.getReso…onsResourceName\n        )")
            if (xmlResources.isEmpty()) {
                updateAndroidAppsState(moduleName, appId, MissingAppActionsXml(actionsResourceName))
                return
            }
            val obj = xmlResources[0]!!
            Intrinsics.checkNotNullExpressionValue(obj, "xmlResources[0]")
            val resourceValue: ResourceValue = (obj as ResourceItem).resourceValue
            if (resourceValue !is ResourceItem && resourceValue !is ResourceValueImpl) {
                Intrinsics.checkNotNullExpressionValue(resourceValue, "resourceValue")
                updateAndroidAppsState(moduleName, appId, UnexpectedAppActionsResource(resourceValue))
                return
            }
            updateAndroidAppsState(moduleName, appId, AppActionsState.Ready(resourceValue))
        }
    }

    /* JADX INFO: Access modifiers changed from: private */ /* JADX WARN: Code restructure failed: missing block: B:66:0x018d, code lost:
        if (r0 == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01b9, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r0, r1.getParent()) != false) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ec  */ /* JADX WARN: Removed duplicated region for block: B:64:0x0186 A[LOOP:1: B:48:0x0125->B:64:0x0186, LOOP_END] */ /* JADX WARN: Removed duplicated region for block: B:81:0x01c4 A[SYNTHETIC] */ /* JADX WARN: Removed duplicated region for block: B:86:0x0182 A[SYNTHETIC] */ /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    fun isRelevant(file: VirtualFile, facet: AndroidFacet): Boolean {
        val z: Boolean
        val `$this$any$iv`: Iterable<*>
        var z2: Boolean
        var z3: Boolean
        var z4: Boolean
        var findFile = PsiManager.getInstance(project).findFile(file)
        if (findFile !is XmlFile) {
            findFile = null
            return false
        }
        val xmlFile = findFile as XmlFile
        if (Intrinsics.areEqual(file.name, "AndroidManifest.xml")) {
            return ManifestDomFileDescription.isManifestFile(xmlFile, facet)
        }
        val couldBeNavigationFile = !(file.isDirectory || file.parent == null || !isRelevant(file.parent))
        if (file.isDirectory || couldBeNavigationFile) {
            if (isRelevant(file)) {
                val children = file.children
                Intrinsics.checkNotNullExpressionValue(children, "file.children")
                if (children.isNotEmpty()) {
                    z = true
                    `$this$any$iv` = SourceProviderManager.getInstance(facet).sources.resDirectories
                    if (`$this$any$iv` is Collection<*> || !(`$this$any$iv` as Collection<*>).isEmpty()) {
                        for (`element$iv` in `$this$any$iv`) {
                            val resDir = `element$iv`
                            if (Intrinsics.areEqual(resDir, file)) {
                                val children2 = resDir.children
                                Intrinsics.checkNotNullExpressionValue(children2, "resDir.children")
                                val length = children2.size
                                var i = 0
                                while (true) {
                                    if (i < length) {
                                        val virtualFile = children2[i]
                                        Intrinsics.checkNotNullExpressionValue(virtualFile, "it")
                                        if (isRelevant(virtualFile)) {
                                            val children3 = virtualFile.children
                                            Intrinsics.checkNotNullExpressionValue(children3, "it.children")
                                            if (children3.isNotEmpty()) {
                                                z4 = true
                                                if (!z4) {
                                                    z3 = true
                                                    break
                                                }
                                                i++
                                            }
                                        }
                                        z4 = false
                                        if (!z4) {
                                        }
                                    } else {
                                        z3 = false
                                        break
                                    }
                                }
                            }
                            if (!z || !Intrinsics.areEqual(resDir, file.parent)) {
                                if (couldBeNavigationFile) {
                                    val parent2 = file.parent
                                    Intrinsics.checkNotNullExpressionValue(parent2, "file.parent")
                                }
                                z2 = false
                                continue
                                if (z2) {
                                    return true
                                }
                            }
                            z2 = true
                            continue
                            if (z2) {
                            }
                        }
                        return false
                    }
                    return false
                }
            }
            z = false
            val couldBeRelevantNavigationFolder2 = z
            `$this$any$iv` = SourceProviderManager.getInstance(facet).sources.resDirectories
            if (`$this$any$iv` is Collection<*>) {
            }
            //            while (r0.hasNext()) {
//            }
            return false
        }
        return false
    }

    private fun getMetadataResource(document: Document): String? {
        val evaluate = actionsMetaDataExpression.evaluate(document, XPathConstants.NODESET)
            ?: throw NullPointerException("null cannot be cast to non-null type org.w3c.dom.NodeList")
        val resultActions = evaluate as NodeList
        val actionsMetadataResource = getActionsOrShortcutsMetadataString(resultActions)
        if (actionsMetadataResource.length > 0) {
            return actionsMetadataResource
        }
        val evaluate2 = shortcutsMetaDataExpression.evaluate(document, XPathConstants.NODESET)
            ?: throw NullPointerException("null cannot be cast to non-null type org.w3c.dom.NodeList")
        val resultShortcuts = evaluate2 as NodeList
        val shortcutsMetadataResource = getActionsOrShortcutsMetadataString(resultShortcuts)
        return if (shortcutsMetadataResource.length > 0) {
            shortcutsMetadataResource
        } else null
    }

    private fun getActionsOrShortcutsMetadataString(xmlNode: NodeList): String {
        val lengthReference = xmlNode.length
        if (lengthReference > 0) {
            val item = xmlNode.item(0)
            Intrinsics.checkNotNullExpressionValue(item, "xmlNode.item(0)")
            val item2 = item.attributes.getNamedItemNS("http://schemas.android.com/apk/res/android", "resource")
            Intrinsics.checkNotNullExpressionValue(item2, "item")
            val nodeValue = item2.nodeValue
            Intrinsics.checkNotNullExpressionValue(nodeValue, "item.nodeValue")
            return nodeValue
        }
        return ""
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun updateAndroidAppsState(moduleName: String, appId: String, appActionsState: AppActionsState) {
        val newState = AndroidAppState(
            moduleName,
            appId,
            appActionsState
        )
        androidAppStates.add(newState)
        if (androidAppStates.size == allAppModules.size) {
            val projectStateSubject = stateSubject
            val state = stateSubject.state
            val projectSyncStatus = ProjectSyncStatus.Complete
            val `$this$associateBy$iv`: Iterable<*> = androidAppStates
            val `destination$iv$iv`: MutableMap<String, AndroidAppState> = LinkedHashMap()
            for (`element$iv$iv` in `$this$associateBy$iv`) {
                val state2 = `element$iv$iv` as AndroidAppState
                `destination$iv$iv`[state2.moduleName] = `element$iv$iv`
            }
            projectStateSubject.state = state.copy(projectSyncStatus, `destination$iv$iv`)
        }
    }

    private fun isRelevant(couldBeNavigatorFolder: VirtualFile): Boolean {
        return couldBeNavigatorFolder.isDirectory && couldBeNavigatorFolder.parent != null && ResourceFolderType.getFolderType(
            couldBeNavigatorFolder.name
        ) == ResourceFolderType.NAVIGATION
    }
}
