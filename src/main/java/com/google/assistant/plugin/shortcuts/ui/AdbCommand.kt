package com.google.assistant.plugin.shortcuts.ui

import com.google.assistant.plugin.appactions.Constants
import com.google.assistant.plugin.shortcuts.listeners.ShortcutUpdateListener
import com.google.assistant.plugin.shortcuts.models.DisplayShortcut
import com.google.assistant.plugin.shortcuts.models.Model
import com.intellij.ui.components.JBScrollPane
import java.awt.Color
import java.awt.Component
import java.awt.Dimension
import java.awt.Toolkit
import java.awt.datatransfer.ClipboardOwner
import java.awt.datatransfer.StringSelection
import java.awt.datatransfer.Transferable
import javax.imageio.ImageIO
import javax.swing.*
import kotlin.jvm.internal.Intrinsics

/* compiled from: AdbCommand.kt */
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/shortcuts/ui/AdbCommand.class */
class AdbCommand(model: Model) : Box(2) {
    private val commandBox: JTextField
    private val copyIconEnabled: ImageIcon
    private val copyIconDisabled: ImageIcon
    private val copyButton: JButton
    private val model: Model

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        Intrinsics.checkNotNullParameter(model, "model")
        this.model = model
        val `$this$apply` = JTextField("No adb command")
        `$this$apply`.isEditable = false
        `$this$apply`.foreground = Color(153, 153, 153)
        `$this$apply`.border = BorderFactory.createEmptyBorder()
        `$this$apply`.isEnabled = false
        val unit = Unit
        commandBox = `$this$apply`
        copyIconEnabled = ImageIcon(ImageIO.read(javaClass.getResourceAsStream(Constants.COPY_ICON)))
        copyIconDisabled = ImageIcon(ImageIO.read(javaClass.getResourceAsStream(Constants.COPY_DARK_ICON)))
        val `$this$apply2` = JButton(copyIconDisabled)
        `$this$apply2`.addActionListener { onCopyAdbCommandClicked() }
        `$this$apply2`.toolTipText = "Copy adb command"
        `$this$apply2`.preferredSize = Dimension(30, 50)
        `$this$apply2`.isEnabled = false
        val unit2 = Unit
        copyButton = `$this$apply2`
        this.model.addShortcutListener(ShortcutUpdateListener { displayShortcut: DisplayShortcut? ->
            onShortcutChange(displayShortcut)
            Unit
        })
        alignmentX = 0.0f
        val scroll = JBScrollPane(commandBox, 21, 31)
        scroll.maximumSize = Dimension(Int.MAX_VALUE, 28)
        border = BorderFactory.createEmptyBorder(10, 0, 10, 0)
        add(scroll as Component)
        add(createRigidArea(Dimension(10, 0)))
        add(copyButton as Component)
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun onShortcutChange(shortcut: DisplayShortcut?) {
        commandBox.text = "No adb command"
        val command = model.shortcutTestCommand
        copyButton.icon = copyIconDisabled
        copyButton.isEnabled = false
        if (command != null) {
            commandBox.text = command
            copyButton.icon = copyIconEnabled
            copyButton.isEnabled = true
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun onCopyAdbCommandClicked() {
        val command = model.shortcutTestCommand
        val stringSelection: Transferable = StringSelection(command)
        val defaultToolkit = Toolkit.getDefaultToolkit()
        Intrinsics.checkNotNullExpressionValue(defaultToolkit, "Toolkit.getDefaultToolkit()")
        val clipboard = defaultToolkit.systemClipboard
        clipboard.setContents(stringSelection, null as ClipboardOwner?)
        selectAdbCommand()
    }

    private fun selectAdbCommand() {
        commandBox.requestFocus()
        commandBox.selectAll()
    }
}
