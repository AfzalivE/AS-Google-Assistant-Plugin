package com.github.afzalive.firstintellijplugin.ui;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import org.jetbrains.annotations.NotNull;

public final class AppActionsToolWindowFactory implements ToolWindowFactory {
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        Content content = ContentFactory.getInstance().createContent(new AppActionsPanel(project), "", false);
        toolWindow.getContentManager().addContent(content);
    }
}