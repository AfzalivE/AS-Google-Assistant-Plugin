package com.google.assistant.plugin.shortcuts.ui

import com.google.assistant.plugin.shortcuts.listeners.ShortcutUpdateListener
import com.google.assistant.plugin.shortcuts.models.DisplayIntent
import com.google.assistant.plugin.shortcuts.models.DisplayShortcut
import com.google.assistant.plugin.shortcuts.models.Model
import com.google.common.collect.ImmutableList
import com.intellij.ui.components.JBScrollPane
import com.intellij.util.ui.UIUtil
import java.awt.Color
import java.awt.Component
import java.awt.Dimension
import javax.swing.BorderFactory
import javax.swing.Box
import javax.swing.JTextArea
import kotlin.collections.joinToString
import kotlin.jvm.internal.Intrinsics

/* compiled from: ShortcutDetails.kt */
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/shortcuts/ui/ShortcutDetails.class */
class ShortcutDetails(model: Model) : Box(1) {
    private val textArea: JTextArea
    private val scrollPane: JBScrollPane

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        Intrinsics.checkNotNullParameter(model, "model")
        textArea = JTextArea()
        scrollPane = JBScrollPane(textArea)
        model.addShortcutListener(ShortcutUpdateListener { displayShortcut: DisplayShortcut? ->
            onShortcutChange(displayShortcut)
            Unit
        })
        textArea.isEditable = false
        textArea.border =
            BorderFactory.createCompoundBorder(textArea.border, BorderFactory.createEmptyBorder(10, 10, 10, 10))
        textArea.background = UIUtil.getPanelBackground()
        updateTextArea(model.selectedShortcut)
        scrollPane.minimumSize = Dimension(0, 100)
        scrollPane.maximumSize = Dimension(Int.MAX_VALUE, 150)
        add(scrollPane as Component)
        alignmentX = 0.0f
        border = BorderFactory.createEmptyBorder(0, 0, 20, 0)
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun onShortcutChange(shortcut: DisplayShortcut?) {
        updateTextArea(shortcut)
    }

    private fun updateTextArea(shortcut: DisplayShortcut?) {
        textArea.text = null as String?
        if (shortcut != null) {
            textArea.foreground = null as Color?
            val append = StringBuilder().append("LongLabel=")
            var longLabel = shortcut.longLabel
            if (longLabel == null) {
                longLabel = ""
            }
            `addLine$default`(this, append.append(longLabel).toString(), 0, 2, null)
            `addLine$default`(
                this,
                "Categories=" + shortcut.categories.joinToString(", ", "", "", 0),
                0,
                2,
                null
            )
            `addLine$default`(this, "Intent=", 0, 2, null)
            val `$this$forEach$iv`: Iterable<*> = shortcut.intents
            for (`element$iv` in `$this$forEach$iv`) {
                val intent = `element$iv` as DisplayIntent
                addLine("action=" + intent.action, 1)
                if (intent.data != null) {
                    addLine("data=" + intent.data, 2)
                }
                if (intent.type != null) {
                    addLine("type=" + intent.type, 2)
                }
                if (intent.component != null) {
                    addLine("component=" + intent.component, 2)
                }
            }
            val extras = shortcut.extras
            if (!extras.isEmpty()) {
                `addLine$default`(this, "Extras=", 0, 2, null)
                val `$this$forEach$iv2`: Iterable<*> = extras
                for (`element$iv2` in `$this$forEach$iv2`) {
                    val it = `element$iv2` as String
                    Intrinsics.checkNotNullExpressionValue(it, "it")
                    addLine(it, 1)
                }
                return
            }
            return
        }
        textArea.text = "Select shortcut to view details"
        textArea.foreground = Color.GRAY
    }

    private fun addLine(text: String, numIndents: Int) {
        textArea.append("  ".repeat(numIndents))
        textArea.append(text)
        textArea.append("\n")
    }

    companion object {
        fun  /* synthetic */`addLine$default`(
            shortcutDetails: ShortcutDetails,
            str: String,
            i: Int,
            i2: Int,
            obj: Any?
        ) {
            var i = i
            if (i2 and 2 != 0) {
                i = 0
            }
            shortcutDetails.addLine(str, i)
        }
    }
}
