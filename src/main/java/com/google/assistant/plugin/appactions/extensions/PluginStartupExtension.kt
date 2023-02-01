package com.google.assistant.plugin.appactions.extensions

import com.google.assistant.plugin.appactions.Constants
import com.google.assistant.plugin.appactions.state.AllProjectStateManagers
import com.google.assistant.plugin.appactions.ui.toolwindow.AppActionsPanel
import com.google.assistant.plugin.appactions.ui.toolwindow.AppActionsToolWindowFactory
import com.intellij.openapi.Disposable
import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.project.DumbAware
import com.intellij.openapi.project.Project
import com.intellij.openapi.project.ProjectManager
import com.intellij.openapi.project.ProjectManagerListener
import com.intellij.openapi.startup.StartupActivity
import com.intellij.openapi.util.IconLoader
import com.intellij.openapi.wm.RegisterToolWindowTask
import com.intellij.openapi.wm.ToolWindowAnchor
import com.intellij.openapi.wm.ToolWindowManager.Companion.getInstance
import java.util.function.Supplier
import kotlin.jvm.internal.Intrinsics

/* compiled from: PluginStartupExtension.kt */ /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/extensions/PluginStartupExtension.class */
class PluginStartupExtension : StartupActivity, DumbAware {
    override fun runActivity(project: Project) {
        AllProjectStateManagers.INSTANCE.add(project)
        project.messageBus.connect((project as Disposable))
            .subscribe(ProjectManager.TOPIC, object : ProjectManagerListener {
                // from class: com.google.assistant.plugin.appactions.extensions.PluginStartupExtension$runActivity$1
                override fun projectClosing(project2: Project) {
                    AllProjectStateManagers.INSTANCE.remove(project2)
                }
            })
        startToolWindow(project)
    }

    private fun startToolWindow(project: Project) {
        val test = actions.Plugin.getDescriptor()
        println(test)
        val appActionsPanel =
            AppActionsPanel(project)
        val supplier: Supplier<String> = `PluginStartupExtension$startToolWindow$supplier$1`.INSTANCE
        val toolWindowAnchor: ToolWindowAnchor = ToolWindowAnchor.RIGHT
        Intrinsics.checkNotNullExpressionValue(toolWindowAnchor, "ToolWindowAnchor.RIGHT")
        val toolWindowTask = RegisterToolWindowTask(
            Constants.TOOLWINDOW_ID,
            toolWindowAnchor,
            appActionsPanel,
            false,
            false,
            true,
            true,
            AppActionsToolWindowFactory(appActionsPanel),
            IconLoader.findIcon("/appactions/assistant_13dp.svg"),
            supplier
        )
        ApplicationManager.getApplication().invokeLater {
            val toolWindow = getInstance(project).registerToolWindow(toolWindowTask)
            toolWindow.show()
        }
    }
}
