package com.google.assistant.plugin.appactions.ui.toolwindow.frames

import com.google.assistant.plugin.common.utils.AdbUtils
import com.google.assistant.plugin.common.utils.LoggingUtils
import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.progress.ProgressIndicator
import com.intellij.openapi.progress.Task
import com.intellij.openapi.project.Project
import com.intellij.openapi.util.ThrowableComputable
import kotlin.jvm.internal.Intrinsics

/* compiled from: TestPreviewFrame.kt */
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/ui/toolwindow/frames/TestPreviewFrame$onRunAdbCommandClicked$task$1.class */
/* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
class `TestPreviewFrame$onRunAdbCommandClicked$task$1`(/* synthetic */
                                                       val `this$0`: TestPreviewFrame,
                                                       `$super_call_param$1`: Project?,
                                                       `$super_call_param$2`: String?,
                                                       `$super_call_param$3`: Boolean
) : Task.WithResult<Unit, Exception?>(`$super_call_param$1`, `$super_call_param$2`!!, `$super_call_param$3`) {
    /* renamed from: compute  reason: collision with other method in class */
    /* bridge */ /* synthetic */ fun m32compute(progressIndicator: ProgressIndicator): Any {
        compute(progressIndicator)
        return Unit
    }

    @Throws(Exception::class)
    override fun compute(progressIndicator: ProgressIndicator) {
        Intrinsics.checkNotNullParameter(progressIndicator, "progressIndicator")
        progressIndicator.isIndeterminate = true
        progressIndicator.text = "Running ADB command"
        Intrinsics.checkNotNullExpressionValue(
            ApplicationManager.getApplication().runReadAction(object : ThrowableComputable<Unit, Exception?> {
                // from class: com.google.assistant.plugin.appactions.ui.toolwindow.frames.TestPreviewFrame$onRunAdbCommandClicked$task$1$compute$1
                /* bridge */ /* synthetic */ override fun compute() {
                    m33compute()
                    return Unit
                }

                /* renamed from: compute  reason: collision with other method in class */
                fun m33compute() {
                    val actionLink: String?
                    val selectedDevice =
                        this@`TestPreviewFrame$onRunAdbCommandClicked$task$1`.`this$0`.model.selectedDevice
                    actionLink =
                        this@`TestPreviewFrame$onRunAdbCommandClicked$task$1`.`this$0`.constructActionLink(true)
                    if (selectedDevice != null && actionLink != null) {
                        val output = AdbUtils.INSTANCE.triggerUrlOnDevice(selectedDevice, actionLink)
                        LoggingUtils.INSTANCE.info("adb command output: $output")
                    }
                }
            }), "ApplicationManager.getAp…                       })"
        )
    }
}
