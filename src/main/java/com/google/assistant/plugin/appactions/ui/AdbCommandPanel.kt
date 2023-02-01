package com.google.assistant.plugin.appactions.ui

import com.google.assistant.plugin.appactions.Constants
import com.intellij.ide.BrowserUtil
import com.intellij.ui.ContextHelpLabel
import com.intellij.ui.JBColor
import com.intellij.ui.components.JBLabel
import com.intellij.util.ui.UIUtil
import java.awt.*
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.imageio.ImageIO
import javax.swing.*
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.Intrinsics

/* compiled from: AdbCommandPanel.kt */
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/ui/AdbCommandPanel.class */
class AdbCommandPanel() : JPanel() {
    private val adbTextField: JTextField
    private val runButton: JButton
    private val runButtonPanel: JPanel
    private var copyIcon: ImageIcon
    private val copyButton: JButton
    private val helpLabel: JBLabel
    var onRunAdbCommandClicked: Function0<Unit>? = null
    var onCopyAdbCommandClicked: Function0<Unit>? = null
    private val title: JLabel
    private val titleBox: JPanel

    init {
        val `$this$apply` = JTextField()
        `$this$apply`.isEditable = false
        `$this$apply`.columns = 30
        `$this$apply`.isEnabled = false
        `$this$apply`.background = JBColor.PanelBackground
        val unit = Unit
        adbTextField = `$this$apply`
        val `$this$apply2` = JButton("Run App Action")
        `$this$apply2`.addActionListener(ActionListener
        // from class: com.google.assistant.plugin.appactions.ui.AdbCommandPanel$$special$$inlined$apply$lambda$1
        {
            val onRunAdbCommandClicked = onRunAdbCommandClicked
            if (onRunAdbCommandClicked != null) {
                val unit2 = onRunAdbCommandClicked.invoke()
            }
        })
        `$this$apply2`.alignmentX = 0.0f
        val unit2 = Unit
        runButton = `$this$apply2`
        val `$this$apply3` = JPanel(BorderLayout())
        `$this$apply3`.add(runButton, "West")
        `$this$apply3`.border = BorderFactory.createEmptyBorder(5, 0, 5, 0)
        val unit3 = Unit
        runButtonPanel = `$this$apply3`
        copyIcon = ImageIcon(ImageIO.read(javaClass.getResourceAsStream(Constants.COPY_ICON)))
        val `$this$apply4` = JButton(copyIcon)
        `$this$apply4`.addActionListener(object : ActionListener {
            // from class: com.google.assistant.plugin.appactions.ui.AdbCommandPanel$$special$$inlined$apply$lambda$2
            override fun actionPerformed(it: ActionEvent) {
                val onCopyAdbCommandClicked = onCopyAdbCommandClicked
                if (onCopyAdbCommandClicked != null) {
                    val unit4 = onCopyAdbCommandClicked.invoke()
                }
            }
        })
        `$this$apply4`.toolTipText = "Copy adb command"
        val unit4 = Unit
        copyButton = `$this$apply4`
        val `$this$apply5` = JLabel("3) Test App Action ")
        `$this$apply5`.font = Font(null as String?, 1, 13)
        `$this$apply5`.alignmentX = 0.0f
        val unit5 = Unit
        title = `$this$apply5`
        val jPanel = JPanel()
        jPanel.layout = BoxLayout(jPanel, 0)
        val unit6 = Unit
        titleBox = jPanel
        layout = BoxLayout(this as Container?, 3)
        border = BorderFactory.createEmptyBorder(15, 10, 15, 10)
        if (UIUtil.isUnderDarcula()) {
            copyIcon = ImageIcon(ImageIO.read(javaClass.getResourceAsStream(Constants.COPY_DARK_ICON)))
        }
        val createWithLink: JBLabel = ContextHelpLabel.createWithLink(
            null as String?,
            "Test the App Action by clicking Run App Action, or executing the generated adb shell command. Plugin-specific logs may be found in the Android Studio log files.",
            "Learn more",
            AnonymousClass1.INSTANCE
        )
        Intrinsics.checkNotNullExpressionValue(createWithLink, "ContextHelpLabel.createW…browse(linkUrl)\n        }")
        helpLabel = createWithLink
        val `$this$apply6` = titleBox
        `$this$apply6`.border = Constants.INSTANCE.titlE_PANEL_BORDER
        `$this$apply6`.add(title)
        `$this$apply6`.add(helpLabel)
        val `$this$apply7` = JPanel(BorderLayout())
        `$this$apply7`.add(titleBox)
        val `$this$apply8` = JPanel(BorderLayout())
        `$this$apply8`.border = BorderFactory.createEmptyBorder(0, 0, 5, 0)
        val box = Box(0)
        box.add(adbTextField)
        box.add(copyButton)
        val unit7 = Unit
        `$this$apply8`.add(box)
        add(`$this$apply7` as Component)
        add(`$this$apply8` as Component)
        add(runButtonPanel as Component)
    }

    var uiEnabled: Boolean
        get() = copyButton.isEnabled
        set(value) {
            copyButton.isEnabled = value
            runButton.isEnabled = value
            adbTextField.isEnabled = value
        }
    var adbCommand: String?
        get() = adbTextField.text
        set(value) {
            adbTextField.text = value
            adbTextField.caretPosition = 0
        }

    /* compiled from: AdbCommandPanel.kt */
    /* renamed from: com.google.assistant.plugin.appactions.ui.AdbCommandPanel$1  reason: invalid class name */ /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/ui/AdbCommandPanel$1.class */
    internal class AnonymousClass1() : Runnable {
        // java.lang.Runnable
        override fun run() {
            BrowserUtil.browse("https://developers.google.com/assistant/app/test-tool#android_studio_logging")
        }

        companion object {
            val INSTANCE = AnonymousClass1()
        }
    }

    fun selectAdbCommand() {
        adbTextField.requestFocus()
        adbTextField.selectAll()
    }

    fun enableInputFields(enable: Boolean) {
        runButton.isEnabled = enable
        copyButton.isEnabled = enable
    }
}
