package com.google.assistant.plugin.appactions.ui.toolwindow.frames

import com.intellij.openapi.progress.ProgressIndicator
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.Intrinsics
import kotlin.jvm.internal.Lambda

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: TestPreviewFrame.kt */
fun TestPreviewFrame.deletePreview(progressIndicator: ProgressIndicator) {
    Intrinsics.checkNotNullParameter(progressIndicator, "progressIndicator")
    onDeletePreviewRun(progressIndicator)
}