package com.google.assistant.plugin.common.utils

import com.google.assistant.plugin.appactions.Constants
import com.google.common.html.HtmlEscapers
import com.intellij.ide.BrowserUtil
import com.intellij.notification.Notification
import com.intellij.notification.NotificationAction
import com.intellij.notification.NotificationType
import com.intellij.notification.Notifications
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.application.ApplicationInfo
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.Intrinsics

/* compiled from: DialogUtils.kt */
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/common/utils/DialogUtils.class */
class DialogUtils private constructor() {
    fun showErrorMessage(message: String, anAction: AnAction) {
        Intrinsics.checkNotNullParameter(message, "message")
        Intrinsics.checkNotNullParameter(anAction, "anAction")
        val replacedMessage = HtmlEscapers.htmlEscaper().escape(message)
        val notification =
            Notification(Constants.PLUGIN_NAME, PluginUtils.INSTANCE.appName, replacedMessage, NotificationType.ERROR)
        notification.addAction(anAction)
        Notifications.Bus.notify(notification)
    }

    fun showErrorMessage(message: String) {
        Intrinsics.checkNotNullParameter(message, "message")
        val append = StringBuilder().append(Constants.ANDROID_STUDIO_LOG)
        val applicationInfo = ApplicationInfo.getInstance()
        Intrinsics.checkNotNullExpressionValue(applicationInfo, "ApplicationInfo.getInstance()")
        Notifications.Bus.notify(
            Notification(
                Constants.PLUGIN_NAME,
                append.append(applicationInfo.strictVersion).append(", ").append(PluginUtils.INSTANCE.appName)
                    .toString(),
                message,
                NotificationType.ERROR
            )
        )
    }

    fun showInfoMessage(message: String) {
        Intrinsics.checkNotNullParameter(message, "message")
        Notifications.Bus.notify(
            Notification(
                Constants.PLUGIN_NAME,
                PluginUtils.INSTANCE.appName,
                message,
                NotificationType.INFORMATION
            )
        )
    }

    fun showWarningMessage(message: String) {
        Intrinsics.checkNotNullParameter(message, "message")
        val notification = Notification(
            Constants.PLUGIN_NAME,
            PluginUtils.INSTANCE.appName,
            message,
            NotificationType.WARNING
        ).addAction(
            ProjectUtils.INSTANCE.getToolwindowAction(
                Constants.TOOLWINDOW_ID
            )
        )
        Intrinsics.checkNotNullExpressionValue(notification, "Notification(\n          …Constants.TOOLWINDOW_ID))")
        Notifications.Bus.notify(notification)
    }

    fun showNluValidationMessage() {
        Notifications.Bus.notify(
            Notification(
                Constants.PLUGIN_NAME,
                PluginUtils.INSTANCE.appName,
                "There are NLU validation warnings for your App Actions. Refer to the Android Studio event log for more details.",
                NotificationType.WARNING
            )
        )
    }

    fun showNluValidationResults(message: String, list: List<String>) {
        Intrinsics.checkNotNullParameter(message, "message")
        Intrinsics.checkNotNullParameter(list, "paths")
        val notification = Notification(
            Constants.PLUGIN_NAME, PluginUtils.INSTANCE.appName, message + "\n" + list.joinToString(), NotificationType.WARNING
        )
        Notifications.Bus.notify(notification)
        notification.hideBalloon()
    }

    fun showActionsXmlDeprecationMessage() {
        val notification = `DialogUtils$showActionsXmlDeprecationMessage$notification$1`(
            Constants.PLUGIN_NAME,
            Constants.ACTIONS_XML_DEPRECATION_MSG_TITLE,
            Constants.ACTIONS_XML_DEPRECATION_MSG_CONTENT,
            NotificationType.INFORMATION
        )
        val notificationAction = createOpenBrowserAction(
            Constants.ACTIONS_XML_MIGRATION_GUIDE_TEXT,
            Constants.ACTIONS_XML_MIGRATION_GUIDE_LINK
        )
        notification.addAction(notificationAction)
        Notifications.Bus.notify(notification)
    }

    fun createOpenBrowserAction(title: String, url: String): AnAction {
        Intrinsics.checkNotNullParameter(title, "title")
        Intrinsics.checkNotNullParameter(url, "url")
        return object : NotificationAction(title) {
            // from class: com.google.assistant.plugin.common.utils.DialogUtils$createOpenBrowserAction$1
            override fun actionPerformed(anActionEvent: AnActionEvent, notification: Notification) {
                Intrinsics.checkNotNullParameter(anActionEvent, "anActionEvent")
                Intrinsics.checkNotNullParameter(notification, "notification")
                BrowserUtil.browse(url)
            }
        }
    }

    companion object {
        @JvmField
        val INSTANCE = DialogUtils()
    }
}
