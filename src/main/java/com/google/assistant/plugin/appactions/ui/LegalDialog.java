package com.google.assistant.plugin.appactions.ui;

import com.intellij.openapi.ui.DialogWrapper;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.io.IOUtils;
import org.jetbrains.annotations.NotNull;

/* compiled from: LegalDialog.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\u0018��2\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0014¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0014J\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n��¨\u0006\r"}, d2 = {"Lcom/google/assistant/plugin/appactions/ui/LegalDialog;", "Lcom/intellij/openapi/ui/DialogWrapper;", "()V", "legalMessageTextArea", "Ljavax/swing/JTextArea;", "createActions", "", "Ljavax/swing/Action;", "()[Ljavax/swing/Action;", "createCenterPanel", "Ljavax/swing/JComponent;", "loadLegalMessage", "", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/ui/LegalDialog.class */
public final class LegalDialog extends DialogWrapper {
    private JTextArea legalMessageTextArea;

    public LegalDialog() {
        super(false);
        init();
    }

    @NotNull
    protected Action[] createActions() {
        Action oKAction = getOKAction();
        Intrinsics.checkNotNullExpressionValue(oKAction, "okAction");
        return new Action[]{oKAction};
    }

    public final void loadLegalMessage() throws IOException {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("legal_notices.txt");
        if (inputStream == null) {
            throw new FileNotFoundException();
        }
        String legalMessage = IOUtils.toString(inputStream, Charset.defaultCharset());
        JTextArea jTextArea = this.legalMessageTextArea;
        if (jTextArea == null) {
            Intrinsics.throwUninitializedPropertyAccessException("legalMessageTextArea");
        }
        jTextArea.setText(legalMessage);
        JTextArea jTextArea2 = this.legalMessageTextArea;
        if (jTextArea2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("legalMessageTextArea");
        }
        jTextArea2.setCaretPosition(0);
    }

    @NotNull
    protected JComponent createCenterPanel() {
        setTitle("Legal Notices");
        setSize(550, 500);
        JTextArea jTextArea = new JTextArea("");
        jTextArea.setEditable(false);
        Component jScrollPane = new JScrollPane(jTextArea);
        this.legalMessageTextArea = jTextArea;
        JComponent jPanel = new JPanel(new BorderLayout());
        jPanel.setPreferredSize(new Dimension(550, 450));
        jPanel.add(jScrollPane, "Center");
        return jPanel;
    }
}
