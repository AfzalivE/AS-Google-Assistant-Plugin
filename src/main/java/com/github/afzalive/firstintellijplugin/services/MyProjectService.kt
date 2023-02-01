package com.github.afzalive.firstintellijplugin.services

import com.android.tools.idea.editors.manifest.ManifestUtils
import com.github.afzalive.firstintellijplugin.MyBundle
import com.github.afzalive.firstintellijplugin.ui.AppActionsToolWindowFactory
import com.google.assistant.plugin.common.utils.ProjectUtils
import com.intellij.openapi.module.ModuleManager
import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.RegisterToolWindowTask
import com.intellij.openapi.wm.ToolWindowAnchor
import com.intellij.openapi.wm.ToolWindowManager
import org.jetbrains.android.dom.manifest.*
import org.jetbrains.android.facet.AndroidFacet
import org.jetbrains.android.util.AndroidUtils


class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
        val appModule = ModuleManager.getInstance(project).modules.first {
            it.name.contains("-app")
        }
        val facet = AndroidFacet.getInstance(appModule)!!
        val xml = ProjectUtils.INSTANCE.getMainManifest(facet)
        val manifest = AndroidUtils.loadDomElement(facet.module, xml.virtualFile, Manifest::class.java)!!
        val resourceUrl = getShortcutResourceUrl(manifest)
        println("resourceUrl: ${resourceUrl?.name}")
    }


    fun getShortcutResourceUrl(manifest: Manifest): ResourceUrl? {
        val application = manifest.application
        for (manifestElement in application.activities) {
            for (intentFilter in manifestElement.intentFilters) {
                if (hasMainAndLauncherActivity(intentFilter)) {
                    val metaDatas: List<MetaData> = manifestElement.metaDatas
                    val retrieveShortcutAndroidResource = retrieveShortcutAndroidResource(metaDatas)
                    if (retrieveShortcutAndroidResource != null) {
                        return retrieveShortcutAndroidResource
                    }
                }
            }
        }
        val application2 = manifest.application
        for (activityAlias in application2.activityAliases) {
            for (intentFilter2 in activityAlias.intentFilters) {
                if (hasMainAndLauncherActivity(intentFilter2)) {
                    val metaDatas2: List<MetaData> = activityAlias.metaDatas
                    val retrieveShortcutAndroidResource2 = retrieveShortcutAndroidResource(metaDatas2)
                    if (retrieveShortcutAndroidResource2 != null) {
                        return retrieveShortcutAndroidResource2
                    }
                }
            }
        }
        return null
    }

    private fun retrieveShortcutAndroidResource(list: List<MetaData>): ResourceUrl? {
        for (metaDataElement in list) {
            val xmlTag = metaDataElement.xmlTag
            if (xmlTag != null) {
                val nameAttrVal = xmlTag.getAttributeValue("android:name")
                if (nameAttrVal != null) {
                    val resAttrVal = xmlTag.getAttributeValue("android:resource")
                    if (resAttrVal != null) {
                        if (nameAttrVal == "android.app.shortcuts") {
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

    private fun hasMainAndLauncherActivity(intentFilter: IntentFilter): Boolean {
        val actions: List<Action> = intentFilter.actions
        if (hasMainIntentAction(actions)) {
            val categories: List<Category> = intentFilter.categories
            if (hasLauncherCategory(categories)) {
                return true
            }
        }
        return false
    }

    private fun hasMainIntentAction(list: List<Action>): Boolean {
        for (action in list) {
            val xmlTag = action.xmlTag
            if (xmlTag != null) {
                val nameAttrVal = xmlTag.getAttributeValue("android:name")
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
        for (category in list) {
            val xmlTag = category.xmlTag
            if (xmlTag != null) {
                val nameAttrVal = xmlTag.getAttributeValue("android:name")
                if (nameAttrVal != null) {
                    if (nameAttrVal == "android.intent.category.LAUNCHER") {
                        return true
                    }
                } else {
                    continue
                }
            }
        }
        return false
    }

    class AASProjectConfigurationException(message: String) : Exception(message)
}
