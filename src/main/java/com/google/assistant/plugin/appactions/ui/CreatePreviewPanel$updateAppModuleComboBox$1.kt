package com.google.assistant.plugin.appactions.ui

import com.google.assistant.plugin.appactions.state.AndroidAppState
import com.google.assistant.plugin.appactions.state.AppActionsState
import com.google.assistant.plugin.appactions.state.ProjectState
import com.google.assistant.plugin.common.utils.LoggingUtils
import com.intellij.openapi.ui.ComboBox
import javax.swing.DefaultComboBoxModel
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.Intrinsics
import kotlin.jvm.internal.Lambda

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: CreatePreviewPanel.kt */
fun CreatePreviewPanel.updateAppModuleComboBox(projectState: ProjectState, oldState: ProjectState?) {
    val comboBox: ComboBox<*>
    val comboBox2: ComboBox<*>
    Intrinsics.checkNotNullParameter(projectState, "projectState")
    comboBox = this.androidAppComboBox
    comboBox.removeAllItems()
    val lastSize: Int = this.model.androidAppsArrayList.size
    this.model.androidAppsArrayList.clear()
    for ((moduleName, androidAppState) in projectState.androidApps) {
        if (androidAppState.appActionsState is AppActionsState.Ready) {
            this.model.androidAppsArrayList.add(androidAppState)
        } else {
            when (androidAppState.appActionsState) {
                // Ignore missing app actions because it might just be a module that doesn't have app actions.
                is AppActionsState.MissingManifestMetadata,
                is AppActionsState.MissingAppActionsXml -> {}
                else -> {
                    LoggingUtils.INSTANCE.error("Module $moduleName doesn't have App Actions correctly configured, ${androidAppState.appActionsState}")
                }
            }
        }
    }
    if (lastSize <= 1 && this.model
            .androidAppsArrayList.size > 1 || lastSize > 1 && this.model
            .androidAppsArrayList.size <= 1
    ) {
        this.refresh()
    }
    comboBox2 = this.androidAppComboBox
    val typedArray = this.model.androidAppsArrayList.toTypedArray()
    comboBox2.model = DefaultComboBoxModel(typedArray)
}
