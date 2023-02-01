package com.google.assistant.plugin.shortcuts.utils

import com.google.assistant.plugin.appactions.Constants
import com.google.assistant.plugin.common.utils.AdbUtils
import com.google.assistant.plugin.shortcuts.models.DisplayShortcut
import com.google.assistant.plugin.shortcuts.models.Model
import com.google.assistant.plugin.shortcuts.models.ShortcutsTableModel
import com.google.assistant.plugin.shortcuts.ui.ShortcutsTaskBackgroundable
import com.google.common.collect.ImmutableList
import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.progress.ProgressIndicator
import com.intellij.openapi.progress.ProgressManager
import com.intellij.openapi.project.Project
import com.intellij.openapi.util.ThrowableComputable
import kotlin.collections.distinct
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.Intrinsics

/* compiled from: ShortcutsAdbUtils.kt */
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/shortcuts/utils/ShortcutsAdbUtils.class */
class ShortcutsAdbUtils(project: Project, model: Model, shortcutsTableModel: ShortcutsTableModel) {
    private val project: Project
    private val model: Model
    private val shortcutsTableModel: ShortcutsTableModel

    init {
        Intrinsics.checkNotNullParameter(project, "project")
        Intrinsics.checkNotNullParameter(model, "model")
        Intrinsics.checkNotNullParameter(shortcutsTableModel, "shortcutsTableModel")
        this.project = project
        this.model = model
        this.shortcutsTableModel = shortcutsTableModel
    }

    fun fetchShortcuts() {
        ProgressManager.getInstance()
            .run(ShortcutsTaskBackgroundable(Constants.APP_NAME, project, { o: ProgressIndicator? ->
                runShortcutsAdbCommand()
                Unit
            }, null, null, "An error has occurred while fetching shortcuts"))
    }

    fun triggerCurrentShortcutIntent() {
        ProgressManager.getInstance()
            .run(ShortcutsTaskBackgroundable(Constants.APP_NAME, project, { o: ProgressIndicator? ->
                runTriggerShortcutIntentCommand()
                Unit
            }, null, null, "An error has occurred while triggering the shortcut intent"))
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun generateIcingAdbCommand(): String {
        return "dumpsys activity provider .IndexApiContentProvider dumpIndexables " + model.packageName + " Thing id,shortcutLabel,shortcutDescription,shortcutUrl"
    }

    /* JADX INFO: Access modifiers changed from: private */
    private fun onRun(progressIndicator: ProgressIndicator, function0: Function0<ThrowableComputable<Unit, Exception?>?>) {
        progressIndicator.isIndeterminate = true
        progressIndicator.text = "Running ADB command"
        ApplicationManager.getApplication().runReadAction {
            function0.invoke()
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun runShortcutsAdbCommand() {
        val model: Model
        val generateIcingAdbCommand: String
        var emptyList: List<*>
        var shortcutsTableModel: ShortcutsTableModel
        var model2: Model
        val model3: Model
        val model4: Model
        model = this@ShortcutsAdbUtils.model
        val selectedDevice = model.selectedDevice
        if (selectedDevice != null) {
            val smOutput = AdbUtils.INSTANCE.executeAdbShellCommand(
                selectedDevice,
                "dumpsys shortcut"
            )
            val adbUtils = AdbUtils.INSTANCE
            generateIcingAdbCommand = generateIcingAdbCommand()
            val icingOutput = adbUtils.executeAdbShellCommand(selectedDevice, generateIcingAdbCommand)
            val smList =
                if (smOutput.length > 0) ShortcutsParserKt.parseShortcutsOutput(smOutput) else emptyList<Any>()
            if (icingOutput.length > 0) {
                model3 = this@ShortcutsAdbUtils.model
                if (model3.packageName != null) {
                    model4 = this@ShortcutsAdbUtils.model
                    val packageName = model4.packageName
                    Intrinsics.checkNotNull(packageName)
                    emptyList = ShortcutsParserKt.parseIcingOutput(icingOutput, packageName!!)
                    val icingList = emptyList
                    val `$this$distinctBy$iv`: Iterable<*> = smList.plus(icingList)
                    val `set$iv`: HashSet<String> = hashSetOf()
                    val `list$iv`: ArrayList<DisplayShortcut> = arrayListOf()
                    for (t in `$this$distinctBy$iv`) {
                        val it = t as DisplayShortcut
                        if (`set$iv`.add(it.id)) {
                            `list$iv`.add(t)
                        }
                    }
                    val `destination$iv$iv`: MutableCollection<String> = arrayListOf()
                    for (`item$iv$iv` in `list$iv`) {
                        `destination$iv$iv`.add(`item$iv$iv`.packageName)
                    }
                    val appList = (`destination$iv$iv`).distinct()
                    shortcutsTableModel = this@ShortcutsAdbUtils.shortcutsTableModel
                    shortcutsTableModel.sourceData = ImmutableList.copyOf(`list$iv`)
                    model2 = this@ShortcutsAdbUtils.model
                    model2.packageNameList = ImmutableList.copyOf(appList)
                }
            }
            emptyList = emptyList<Any>()
            val icingList2 = emptyList
            val `$this$distinctBy$iv2`: Iterable<*> = smList.plus<Any>(icingList2)
            val `set$iv2`: HashSet<*> = HashSet<Any?>()
            val `list$iv2`: ArrayList<DisplayShortcut> = arrayListOf()
            val `destination$iv$iv2`: MutableCollection<String> = arrayListOf()
            val appList2: List<String> = (`destination$iv$iv2`).distinct()
            shortcutsTableModel = this@ShortcutsAdbUtils.shortcutsTableModel
            ImmutableList.copyOf(`list$iv2`)
            shortcutsTableModel.sourceData = ImmutableList.copyOf(`list$iv2`)
            model2 = this@ShortcutsAdbUtils.model
            val copyOf22: ImmutableList<String> = ImmutableList.copyOf<String>(appList2)
            Intrinsics.checkNotNullExpressionValue(copyOf22, "ImmutableList.copyOf(appList)")
            model2.packageNameList = copyOf22
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun runTriggerShortcutIntentCommand() {
        val model: Model
        val model2: Model
        model = this@ShortcutsAdbUtils.model
        val command = model.shortcutTestCommand
        if (command != null) {
            model2 = this@ShortcutsAdbUtils.model
            val selectedDevice = model2.selectedDevice
            if (selectedDevice != null) {
                AdbUtils.INSTANCE.executeAdbShellCommand(selectedDevice, command)
            }
        }
    }
}
