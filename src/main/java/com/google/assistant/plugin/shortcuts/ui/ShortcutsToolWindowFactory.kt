package com.google.assistant.plugin.shortcuts.ui

import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowFactory
import com.intellij.ui.components.JBScrollPane
import com.intellij.ui.content.ContentFactory
import java.awt.Component
import javax.swing.JComponent

/* compiled from: ShortcutsToolWindowFactory.kt */
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/shortcuts/ui/ShortcutsToolWindowFactory.class */
class ShortcutsToolWindowFactory : ToolWindowFactory {
    override fun createToolWindowContent(project: Project, toolWindow: ToolWindow) {
        val shortcutsPanel = ShortcutsPanel(project)
        val jBScrollPane: JComponent = JBScrollPane(shortcutsPanel as Component, 20, 31)
        val contentFactory = ContentFactory.SERVICE.getInstance()
        val content = contentFactory.createContent(jBScrollPane, "", false)
        content.setDisposer(shortcutsPanel)
        toolWindow.contentManager.addContent(content)
    }
}
