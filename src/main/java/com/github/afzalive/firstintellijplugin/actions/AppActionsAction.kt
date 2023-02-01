package com.github.afzalive.firstintellijplugin.actions

import com.android.tools.idea.editors.manifest.ManifestUtils
import com.android.tools.idea.model.AndroidModel
import com.github.afzalive.firstintellijplugin.services.MyProjectService
import com.github.afzalive.firstintellijplugin.services.ResourceUrl
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.module.Module
import com.intellij.openapi.module.ModuleManager
import com.intellij.openapi.project.Project
import com.intellij.openapi.util.ThrowableComputable
import com.intellij.openapi.wm.ToolWindowManager
import org.jetbrains.android.dom.manifest.Manifest
import org.jetbrains.android.facet.AndroidFacet
import org.jetbrains.android.util.AndroidUtils
import org.jetbrains.annotations.NotNull

val MORE_THAN_ONE_MODULE_WITH_ACTIONS_ERROR_MSG =
    "More than one Android module with action references found.\nThe App Actions Test tool currently supports projects with exactly\none Android module with actions file references."
private val NO_MODULE_WITH_ACTIONS_ERROR_MSG =
    "There are no resources listed in your Android Manifest matching to shortcuts.xml or actions.xml."


class AppActionsAction : AnAction() {
    var projectService: MyProjectService? = null

    override fun actionPerformed(anActionEvent: AnActionEvent) {
        val project = anActionEvent.project
        projectService = MyProjectService(project!!)
        println("package name: ${readPackageNameSafely(project)}")

        ToolWindowManager.getInstance(project).getToolWindow("AppActions")!!.show()
    }

    @NotNull
    @Throws(MyProjectService.AASProjectConfigurationException::class)
    fun readPackageNameSafely(project: Project): String {
        val runReadAction: Any = ApplicationManager.getApplication().runReadAction(ThrowableComputable {
            getPackageNameFromModule(
                getActionModule(project)
            )
        })
        return runReadAction as String
    }

    @Throws(MyProjectService.AASProjectConfigurationException::class)
    fun getActionModule(project: Project): Module {
        val str: String
        val str2: String
        val str3: String
        var moduleWithAction: Module? = null
        val instance = ModuleManager.getInstance(project)
        val modules = instance.modules
        for (module in modules) {
            if (getXmlResourceUrl(module) != null) {
                if (moduleWithAction != null) {
                    str3 = MORE_THAN_ONE_MODULE_WITH_ACTIONS_ERROR_MSG
                    throw MyProjectService.AASProjectConfigurationException(str3)
                }
                moduleWithAction = module
            }
        }
        if (moduleWithAction != null) {
            return moduleWithAction
        }

        throw MyProjectService.AASProjectConfigurationException("str2")
    }



    private fun getXmlResourceUrl(module: Module): ResourceUrl? {
        val facet = AndroidFacet.getInstance(module) ?: return null
        return try {
            val xmlFile = ManifestUtils.getMainManifest(facet)
            val manifest = AndroidUtils.loadDomElement(
                facet.module, xmlFile.virtualFile,
                Manifest::class.java
            ) as Manifest? ?: return null
            val actionsResourceUrl = getActionResourceUrl(manifest)
            actionsResourceUrl ?: projectService!!.getShortcutResourceUrl(manifest)
        } catch (e: AssertionError) {
            null
        } catch (e2: Exception) {
            null
        }
    }


    private fun getActionResourceUrl(manifest: Manifest): ResourceUrl? {
        val application = manifest.application
        for (manifestElement in application.metaDatas) {
            val xmlTag = manifestElement.xmlTag
            if (xmlTag != null) {
                val nameAttrVal = xmlTag.getAttributeValue("android:name")
                if (nameAttrVal != null) {
                    val resAttrVal = xmlTag.getAttributeValue("android:resource")
                    if (resAttrVal != null) {
                        if (nameAttrVal.equals("com.google.android.actions", true)) {
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

    @Throws(MyProjectService.AASProjectConfigurationException::class)
    fun getPackageNameFromModule(module: Module): String {
        if (AndroidFacet.getInstance(module) != null) {
            val model = AndroidModel.get(module)
            if (model != null) {
                return model.applicationId
            }
            throw MyProjectService.AASProjectConfigurationException("Could not read package name from the build file.")
        }
        throw MyProjectService.AASProjectConfigurationException("This is not an Android module.")
    }

}