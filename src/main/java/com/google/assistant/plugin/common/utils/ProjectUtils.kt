package com.google.assistant.plugin.common.utils

import actions.UpdateAndroidActionPackageV2Request.XmlContentType
import com.android.ide.common.rendering.api.ResourceNamespace
import com.android.ide.common.resources.ResourceItem
import com.android.ide.common.util.FileSystemRegistry
import com.android.ide.common.util.PathString
import com.android.resources.ResourceType
import com.android.resources.ResourceUrl
import com.android.tools.idea.editors.manifest.ManifestUtils
import com.android.tools.idea.model.AndroidModel
import com.android.tools.idea.res.LocalResourceRepository
import com.android.tools.idea.res.ResourceRepositoryManager
import com.google.assistant.plugin.appactions.Constants
import com.google.assistant.plugin.appactions.exceptions.AASProjectConfigurationException
import com.google.assistant.plugin.appactions.state.AndroidAppState
import com.google.assistant.plugin.appactions.state.AppActionsState
import com.google.gct.login.GoogleLogin
import com.intellij.ide.actions.ActivateToolWindowAction
import com.intellij.openapi.actionSystem.ActionManager
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.module.Module
import com.intellij.openapi.module.ModuleManager
import com.intellij.openapi.project.Project
import com.intellij.openapi.util.ThrowableComputable
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.openapi.vfs.newvfs.events.VFileEvent
import com.intellij.psi.PsiManager
import com.intellij.psi.xml.XmlFile
import org.jetbrains.android.dom.manifest.*
import org.jetbrains.android.facet.AndroidFacet
import org.jetbrains.android.facet.AndroidRootUtil
import org.jetbrains.android.util.AndroidUtils
import java.io.IOException
import java.util.*
import java.util.function.Predicate
import kotlin.jvm.internal.Intrinsics


/* compiled from: ProjectUtils.kt */
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/common/utils/ProjectUtils.class */
class ProjectUtils private constructor() {
    private fun getXmlResourceUrl(module: Module): ResourceUrl? {
        val manifest = getManifest(module)
        if (manifest != null) {
            val actionsResourceUrl = getActionResourceUrl(manifest)
            val shortcutsResourceUrl = getShortcutResourceUrl(manifest)
            return actionsResourceUrl ?: shortcutsResourceUrl
        }
        return null
    }

    fun getManifest(module: Module): Manifest? {
        val facet = AndroidFacet.getInstance(module)
        if (facet != null) {
            return try {
                val xmlFile = getMainManifest(facet)
                AndroidUtils.loadDomElement(facet.module, xmlFile.virtualFile, Manifest::class.java)
            } catch (e: AssertionError) {
                null
            } catch (e2: Exception) {
                null
            }
        }
        return null
    }

    // TODO Use ManifestUtils Records
    fun getMainManifest(facet: AndroidFacet): XmlFile {
        val manifestFile = AndroidRootUtil.getPrimaryManifestFile(facet)!!
        val psiFile = PsiManager.getInstance(facet.module.project).findFile(
            manifestFile
        )!!
        return psiFile as XmlFile
    }

    private fun getActionResourceUrl(manifest: Manifest): ResourceUrl? {
        val application = manifest.application
        for (manifestElement: MetaData in application.metaDatas) {
            val xmlTag = manifestElement.xmlTag
            if (xmlTag != null) {
                val nameAttrVal = xmlTag.getAttributeValue(Constants.ANDROID_NAME_ATTRIBUTE)
                if (nameAttrVal != null) {
                    val resAttrVal = xmlTag.getAttributeValue("android:resource")
                    if (resAttrVal != null) {
                        if (nameAttrVal.equals(Constants.ACTIONS_METADATA_NAME, true)) {
                            return ResourceUrl.parse(resAttrVal)
                        }
                    } else {
                        continue
                    }
                } else {
                    continue
                }
            }
        }
        return null
    }

    private fun getShortcutResourceUrl(manifest: Manifest): ResourceUrl? {
        val application = manifest.application
        for (manifestElement: Activity in application.activities) {
            for (intentFilter: IntentFilter in manifestElement.intentFilters) {
                if (hasMainAndLauncherActivity(intentFilter)) {
                    val metaDatas = manifestElement.metaDatas
                    val retrieveShortcutAndroidResource = retrieveShortcutAndroidResource(metaDatas)
                    if (retrieveShortcutAndroidResource != null) {
                        return retrieveShortcutAndroidResource
                    }
                }
            }
        }
        val application2 = manifest.application
        for (activityAlias: ActivityAlias in application2.activityAliases) {
            for (intentFilter2: IntentFilter in activityAlias.intentFilters) {
                if (hasMainAndLauncherActivity(intentFilter2)) {
                    val metaDatas2 = activityAlias.metaDatas
                    val retrieveShortcutAndroidResource2 = retrieveShortcutAndroidResource(metaDatas2)
                    if (retrieveShortcutAndroidResource2 != null) {
                        return retrieveShortcutAndroidResource2
                    }
                }
            }
        }
        return null
    }

    private fun hasMainAndLauncherActivity(intentFilter: IntentFilter): Boolean {
        val actions = intentFilter.actions
        if (hasMainIntentAction(actions)) {
            val categories = intentFilter.categories
            if (hasLauncherCategory(categories)) {
                return true
            }
        }
        return false
    }

    private fun hasMainIntentAction(list: List<Action>): Boolean {
        for (action: Action in list) {
            val xmlTag = action.xmlTag
            if (xmlTag != null) {
                val nameAttrVal = xmlTag.getAttributeValue(Constants.ANDROID_NAME_ATTRIBUTE)
                if (nameAttrVal != null) {
                    if (nameAttrVal == "android.intent.action.MAIN") {
                        return true
                    }
                } else {
                    continue
                }
            }
        }
        return false
    }

    private fun hasLauncherCategory(list: List<Category>): Boolean {
        for (category: Category in list) {
            val xmlTag = category.xmlTag
            if (xmlTag != null) {
                Intrinsics.checkNotNullExpressionValue(xmlTag, "category.xmlTag ?: continue")
                val nameAttrVal = xmlTag.getAttributeValue(Constants.ANDROID_NAME_ATTRIBUTE)
                if (nameAttrVal != null) {
                    Intrinsics.checkNotNullExpressionValue(
                        nameAttrVal,
                        "xmlTag.getAttributeValue…ndroid:name\") ?: continue"
                    )
                    if (Intrinsics.areEqual(nameAttrVal, "android.intent.category.LAUNCHER")) {
                        return true
                    }
                } else {
                    continue
                }
            }
        }
        return false
    }

    private fun retrieveShortcutAndroidResource(list: List<MetaData>): ResourceUrl? {
        for (metaDataElement: MetaData in list) {
            val xmlTag = metaDataElement.xmlTag
            if (xmlTag != null) {
                Intrinsics.checkNotNullExpressionValue(xmlTag, "metaDataElement.xmlTag ?: continue")
                val nameAttrVal = xmlTag.getAttributeValue(Constants.ANDROID_NAME_ATTRIBUTE)
                if (nameAttrVal != null) {
                    Intrinsics.checkNotNullExpressionValue(
                        nameAttrVal,
                        "xmlTag.getAttributeValue…ndroid:name\") ?: continue"
                    )
                    val resAttrVal = xmlTag.getAttributeValue("android:resource")
                    if (resAttrVal != null) {
                        Intrinsics.checkNotNullExpressionValue(
                            resAttrVal,
                            "xmlTag.getAttributeValue…id:resource\") ?: continue"
                        )
                        if (Intrinsics.areEqual(nameAttrVal, Constants.SHORTCUTS_METADATA_NAME)) {
                            return ResourceUrl.parse(resAttrVal)
                        }
                    } else {
                        continue
                    }
                } else {
                    continue
                }
            }
        }
        return null
    }

    @Throws(AASProjectConfigurationException::class)
    fun getActionModule(project: Project): Module {
        val str: String
        val str2: String
        Intrinsics.checkNotNullParameter(project, "project")
        val modules: List<*> = getActionsModules(project)
        if (modules.isEmpty()) {
            val dialogUtils = DialogUtils.INSTANCE
            str = NO_MODULE_WITH_ACTIONS_ERROR_MSG
            dialogUtils.showErrorMessage(str)
            str2 = NO_MODULE_WITH_ACTIONS_ERROR_MSG
            throw AASProjectConfigurationException(str2)
        }
        return modules[0] as Module
    }

    private fun getActionsModules(project: Project): List<Module> {
        var modules: Array<Module?>
        val distinctModuleList: ArrayList<Module> = arrayListOf()
        val filePathSet: HashSet<String> = hashSetOf()
        val moduleManager = ModuleManager.getInstance(project)
        for (module: Module in moduleManager.modules) {
            val xmlResourceUrl = getXmlResourceUrl(module)
            val repositoryManager = ResourceRepositoryManager.getInstance(module)
            if (repositoryManager != null && xmlResourceUrl != null) {
                val appResources = repositoryManager.appResources
                Intrinsics.checkNotNullExpressionValue(appResources, "repositoryManager.appResources")
                val xmlPath = getXmlPath(module, appResources)
                if (xmlPath != null) {
                    if (!filePathSet.contains(xmlPath.rawPath)) {
                        distinctModuleList.add(module)
                    }
                    filePathSet.add(xmlPath.rawPath)
                }
            }
        }
        return distinctModuleList
    }

    @Throws(IOException::class)
    fun getXmlPath(module: Module, appResources: LocalResourceRepository): PathString? {
        Intrinsics.checkNotNullParameter(module, "module")
        Intrinsics.checkNotNullParameter(appResources, "appResources")
        val xmlResourceUrl = getXmlResourceUrl(module)
        if (xmlResourceUrl != null) {
            val resources: List<*> =
                appResources.getResources(ResourceNamespace.TODO(), ResourceType.XML, xmlResourceUrl.name)
            Intrinsics.checkNotNullExpressionValue(resources, "appResources.getResource…esourceUrl.name\n        )")
            if (resources.isEmpty()) {
                return null
            }
            val obj = (resources[0])!!
            Intrinsics.checkNotNullExpressionValue(obj, "resources[0]")
            return (obj as ResourceItem).source
        }
        return null
    }

    fun getXmlBytes(androidAppState: AndroidAppState): ByteArray? {
        Intrinsics.checkNotNullParameter(androidAppState, "androidAppState")
        var bytes: ByteArray? = null
        if (androidAppState.appActionsState is AppActionsState.Ready) {
            val actionsXmlResource =
                (androidAppState.appActionsState as AppActionsState.Ready).actionsResourceItem.value
            try {
                val fileSystemRegistry = FileSystemRegistry
                Intrinsics.checkNotNullExpressionValue(actionsXmlResource, "actionsXmlResource")
                val inputStream = fileSystemRegistry.open(PathString(actionsXmlResource))
                bytes = inputStream.readBytes()
            } catch (e: Exception) {
                LoggingUtils.INSTANCE.error(e.message)
            }
        }
        return bytes
    }

    @Throws(IOException::class, AASProjectConfigurationException::class)
    fun getXmlContentType(module: Module): XmlContentType {
        Intrinsics.checkNotNullParameter(module, "module")
        val facet = AndroidFacet.getInstance(module)
        if (facet != null) {
            Intrinsics.checkNotNullExpressionValue(facet, "AndroidFacet.getInstance…rn XmlContentType.ACTIONS")
            try {
                val xmlFile = getMainManifest(facet)
                val manifest = AndroidUtils.loadDomElement(facet.module, xmlFile.virtualFile, Manifest::class.java)
                    ?: return XmlContentType.ACTIONS
                Intrinsics.checkNotNullExpressionValue(manifest, "AndroidUtils.loadDomElem…rn XmlContentType.ACTIONS")
                val actionsResourceUrl = getActionResourceUrl(manifest)
                val shortcutsResourceUrl = getShortcutResourceUrl(manifest)
                if (actionsResourceUrl != null) {
                    return XmlContentType.ACTIONS
                }
                return if (shortcutsResourceUrl != null) {
                    XmlContentType.SHORTCUTS
                } else XmlContentType.ACTIONS
            } catch (e: AssertionError) {
                return XmlContentType.ACTIONS
            } catch (e2: Exception) {
                return XmlContentType.ACTIONS
            }
        }
        return XmlContentType.ACTIONS
    }

    fun getAppResources(module: Module): LocalResourceRepository {
        Intrinsics.checkNotNullParameter(module, "module")
        val resourceRepositoryManager = ResourceRepositoryManager.getInstance(module)
        Intrinsics.checkNotNull(resourceRepositoryManager)
        Intrinsics.checkNotNullExpressionValue(
            resourceRepositoryManager,
            "ResourceRepositoryManager.getInstance(module)!!"
        )
        val appResources = resourceRepositoryManager!!.appResources
        Intrinsics.checkNotNullExpressionValue(appResources, "ResourceRepositoryManage…ce(module)!!.appResources")
        return appResources
    }

    @Throws(AASProjectConfigurationException::class)
    fun getPackageNameFromModule(module: Module): String {
        Intrinsics.checkNotNullParameter(module, "module")
        if (AndroidFacet.getInstance(module) == null) {
            throw AASProjectConfigurationException("This is not an Android module.")
        }
        val model = AndroidModel.get(module)
            ?: throw AASProjectConfigurationException("Could not read package name from the build file.")
        Intrinsics.checkNotNullExpressionValue(model, "AndroidModel.get(module)…me from the build file.\")")
        val applicationId = model.applicationId
        Intrinsics.checkNotNullExpressionValue(applicationId, "model.applicationId")
        return applicationId
    }

    @Throws(AASProjectConfigurationException::class, IOException::class)
    fun isActionRelevantPath(file: VFileEvent, actionModule: Module): Boolean {
        Intrinsics.checkNotNullParameter(file, "file")
        Intrinsics.checkNotNullParameter(actionModule, "actionModule")
        val actionXmlPath = getXmlPath(actionModule, getAppResources(actionModule))
        if (actionXmlPath != null) {
            val file2 = file.file
            Intrinsics.checkNotNull(file2)
            Intrinsics.checkNotNullExpressionValue(file2, "file.file!!")
            val path = file2!!.path
            Intrinsics.checkNotNullExpressionValue(path, "file.file!!.path")
            return checkIfPathEndsWithAnyFilenames(
                path,
                Constants.INSTANCE.actionS_XML_RELATED_FILENAMES
            ) || isSamePath(file, actionXmlPath)
        }
        return false
    }

    private fun isSamePath(file: VFileEvent, filePath: PathString): Boolean {
        val file2 = file.file
        Intrinsics.checkNotNull(file2)
        Intrinsics.checkNotNullExpressionValue(file2, "file.file!!")
        return Intrinsics.areEqual(file2!!.path, filePath.portablePath)
    }

    private fun checkIfPathEndsWithAnyFilenames(path: String, fileName: Array<String>): Boolean {
        return Arrays.stream(fileName).anyMatch(Predicate { entry ->
            path.endsWith(entry, false)
        })
    }

    fun isActionsXmlInProject(project: Project): Boolean {
        Intrinsics.checkNotNullParameter(project, "project")
        val xmlResourcePath = getXmlResourcePath(project)
        return xmlResourcePath.endsWith(Constants.ACTIONS_XML_FILE_NAME, false)
    }

    fun isFileActionsXml(file: VirtualFile, project: Project): Boolean {
        Intrinsics.checkNotNullParameter(file, "file")
        Intrinsics.checkNotNullParameter(project, "project")
        val xmlResourcePath = getXmlResourcePath(project)
        if (Intrinsics.areEqual(file.path, xmlResourcePath)) {
            val path = file.path
            Intrinsics.checkNotNullExpressionValue(path, "file.path")
            if (path.endsWith(Constants.ACTIONS_XML_FILE_NAME, false)) {
                return true
            }
        }
        return false
    }

    private fun getXmlResourcePath(project: Project): String {
        val runReadAction: Any = ApplicationManager.getApplication().runReadAction(
            ThrowableComputable<String, AASProjectConfigurationException?>
            // from class: com.google.assistant.plugin.common.utils.ProjectUtils$getXmlResourcePath$1
            {
                val actionModule = INSTANCE.getActionModule(project)
                val xmlPath = INSTANCE.getXmlPath(actionModule, INSTANCE.getAppResources(actionModule))
                if (xmlPath != null) {
                    val rawPath: String = xmlPath.rawPath
                    if (rawPath != null) {
                        return@ThrowableComputable rawPath
                    }
                }
                ""
            })
        Intrinsics.checkNotNullExpressionValue(runReadAction, "ApplicationManager.getAp…\"\n            }\n        )")
        return runReadAction as String
    }

    fun getToolwindowAction(toolwindowId: String): AnAction {
        return ActionManager.getInstance().getAction(ActivateToolWindowAction.getActionIdForToolWindow(toolwindowId))
    }

    fun readPackageNameSafely(project: Project): String {
        Intrinsics.checkNotNullParameter(project, "project")
        val runReadAction: Any = ApplicationManager.getApplication().runReadAction(
            ThrowableComputable<String, AASProjectConfigurationException?>
            // from class: com.google.assistant.plugin.common.utils.ProjectUtils$readPackageNameSafely$1
            {
                val actionModule = INSTANCE.getActionModule(project)
                INSTANCE.getPackageNameFromModule(actionModule)
            })
        return runReadAction as String
    }

    val isInternalUser: Boolean
        get() {
            val googleLogin = GoogleLogin.getInstance()
            val email = googleLogin.email
            return email?.contains("@google.com") ?: false
        }

    companion object {
        private const val NO_MODULE_WITH_ACTIONS_ERROR_MSG =
            "There are no resources listed in your Android Manifest matching to shortcuts.xml or actions.xml."
        @JvmField
        val INSTANCE = ProjectUtils()
    }
}
