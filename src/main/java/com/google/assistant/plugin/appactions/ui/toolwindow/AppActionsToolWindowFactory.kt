package com.google.assistant.plugin.appactions.ui.toolwindow

import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowFactory
import com.intellij.ui.content.ContentFactory

/* compiled from: AppActionsToolWindowFactory.kt */ /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/ui/toolwindow/AppActionsToolWindowFactory.class */
class AppActionsToolWindowFactory() : ToolWindowFactory {
    private var appActionsToolWindowPanel: AppActionsPanel? = null

    constructor(appActionsToolWindowPanel: AppActionsPanel) : this() {
        this.appActionsToolWindowPanel = appActionsToolWindowPanel
    }

    override fun createToolWindowContent(project: Project, toolWindow: ToolWindow) {
        val contentFactory = ContentFactory.getInstance()
        val content = contentFactory.createContent(appActionsToolWindowPanel, "", false)
        toolWindow.contentManager.removeAllContents(true)
        toolWindow.contentManager.addContent(content)
    }
}
