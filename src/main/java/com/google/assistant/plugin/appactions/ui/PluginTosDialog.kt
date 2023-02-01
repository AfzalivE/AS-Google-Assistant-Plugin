package com.google.assistant.plugin.appactions.ui

import com.google.assistant.plugin.appactions.Constants
import com.google.assistant.plugin.appactions.api.HttpClient
import com.google.assistant.plugin.appactions.exceptions.ActionsBuilderException
import com.google.gct.login.GoogleLogin
import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.ui.DialogWrapper
import com.intellij.ui.components.JBLabel
import java.awt.*
import java.awt.event.ActionListener
import java.awt.event.MouseEvent
import java.awt.event.MouseListener
import javax.imageio.ImageIO
import javax.swing.*
import javax.swing.text.Document
import javax.swing.text.html.HTMLEditorKit
import javax.swing.text.html.StyleSheet
import kotlin.jvm.internal.Intrinsics
import kotlin.jvm.internal.Ref

/* compiled from: PluginTosDialog.kt */
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/ui/PluginTosDialog.class */
class PluginTosDialog : DialogWrapper(false) {
    private val httpClient: HttpClient

    init {
        httpClient = HttpClient()
        init()
    }

    override fun doOKAction() {
        val accessToken = GoogleLogin.getInstance().fetchAccessToken()
        if (accessToken != null) {
            Intrinsics.checkNotNullExpressionValue(accessToken, "GoogleLogin.getInstance(…SS_TOKEN_FAILURE_MESSAGE)")
            httpClient.acceptPluginToS(accessToken)
            super.doOKAction()
            return
        }
        throw ActionsBuilderException("ToS check failed when obtaining access token.")
    }

    override fun doCancelAction() {
        ApplicationManager.getApplication().invokeLater(`PluginTosDialog$doCancelAction$1`.INSTANCE)
        super.doCancelAction()
    }

    override fun createActions(): Array<Action> {
        setOKButtonText("Accept")
        isOKActionEnabled = false
        setCancelButtonText("Decline")
        val oKAction = okAction
        Intrinsics.checkNotNullExpressionValue(oKAction, "okAction")
        val cancelAction = cancelAction
        Intrinsics.checkNotNullExpressionValue(cancelAction, "cancelAction")
        return arrayOf(oKAction, cancelAction)
    }

    override fun createCenterPanel(): JComponent {
        val jBLabel = JBLabel(ImageIcon(ImageIO.read(javaClass.getResourceAsStream(Constants.ASSISTANT_ICON))))
        val isEnabled = Ref.BooleanRef()
        isEnabled.element = false
        jBLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 10))
        val jCheckBox = JCheckBox()
        jCheckBox.addActionListener(ActionListener
        // from class: com.google.assistant.plugin.appactions.ui.PluginTosDialog$createCenterPanel$1
        {
            isEnabled.element = !isEnabled.element
            this@PluginTosDialog.isOKActionEnabled = isEnabled.element
        })
        val jBLabel2 = JBLabel("Integrate my services with App Actions using Actions on Google")
        jBLabel2.addMouseListener(object : MouseListener {
            // from class: com.google.assistant.plugin.appactions.ui.PluginTosDialog$createCenterPanel$2
            override fun mouseClicked(p0: MouseEvent?) {
                isEnabled.element = !isEnabled.element
                this@PluginTosDialog.isOKActionEnabled = isEnabled.element
                jCheckBox.setSelected(!jCheckBox.isSelected())
            }

            override fun mousePressed(p0: MouseEvent?) {}
            override fun mouseReleased(p0: MouseEvent?) {}
            override fun mouseEntered(p0: MouseEvent?) {}
            override fun mouseExited(p0: MouseEvent?) {}
        })
        val jLabel = JLabel("Policies and Terms of Service")
        val font = jLabel.font
        Intrinsics.checkNotNullExpressionValue(font, "title.font")
        val fontName = font.fontName
        val font2 = jLabel.font
        Intrinsics.checkNotNullExpressionValue(font2, "title.font")
        val boldTitle = Font(fontName, 1, font2.size)
        jLabel.font = boldTitle
        val hTMLEditorKit = HTMLEditorKit()
        val jEditorPane = JEditorPane()
        jEditorPane.editorKit = hTMLEditorKit
        val stylesheet: StyleSheet = hTMLEditorKit.styleSheet
        stylesheet.addRule("a { text-decoration: none; color: '#2470B3' } p { font-family: 'SF Pro Text, Segoe UI'; font-size: '9px'; margin: 0; }")
        jEditorPane.isEditable = false
        jEditorPane.isOpaque = false
        jEditorPane.addHyperlinkListener(`PluginTosDialog$createCenterPanel$3`.INSTANCE)
        val doc: Document = hTMLEditorKit.createDefaultDocument()
        jEditorPane.document = doc
        jEditorPane.text = "<p>I have reviewed the <a href='https://developers.google.com/assistant/console/policies/general-policies'>policies</a> and accept the Google Assistant Plugin <a href='https://play.google.com/about/actions-on-google-terms.html'>Terms of Service.</a> <a href='https://developers.google.com/assistant/app'>Learn more</a></p>"
        val jPanel: JComponent = JPanel(GridBagLayout())
        jPanel.preferredSize = Dimension(500, 100)
        val jPanel2 = JPanel(BorderLayout())
        jPanel2.add(jCheckBox, "Center")
        jPanel2.add(jBLabel2, "After")
        val c = GridBagConstraints()
        c.gridx = 0
        c.gridy = 0
        jPanel.add(jBLabel, c)
        c.gridx++
        c.anchor = 21
        jPanel.add(jLabel, c)
        c.gridy++
        jPanel.add(jPanel2, c)
        c.gridy++
        c.fill = 2
        c.insets = Insets(12, 0, 12, 0)
        jPanel.add(jEditorPane, c)
        return jPanel
    }
}
