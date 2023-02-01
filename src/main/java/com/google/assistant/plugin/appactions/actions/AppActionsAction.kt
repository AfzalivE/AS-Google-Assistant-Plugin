package com.google.assistant.plugin.appactions.actions

import com.google.assistant.plugin.appactions.Constants
import com.google.assistant.plugin.common.utils.ProjectUtils
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import kotlin.jvm.internal.Intrinsics

/* compiled from: AppActionsAction.kt */
 /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/actions/AppActionsAction.class */
class AppActionsAction : AnAction() {
    override fun actionPerformed(event: AnActionEvent) {
        Intrinsics.checkNotNullParameter(event, "event")
        ProjectUtils.INSTANCE.getToolwindowAction(Constants.TOOLWINDOW_ID).actionPerformed(event)
    }
}
