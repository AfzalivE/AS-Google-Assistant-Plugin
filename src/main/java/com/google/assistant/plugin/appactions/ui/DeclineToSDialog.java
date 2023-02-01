package com.google.assistant.plugin.appactions.ui;

import com.intellij.icons.AllIcons;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.ui.components.JBLabel;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DeclineToSDialog.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\u0018��2\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0014¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\t"}, d2 = {"Lcom/google/assistant/plugin/appactions/ui/DeclineToSDialog;", "Lcom/intellij/openapi/ui/DialogWrapper;", "()V", "createActions", "", "Ljavax/swing/Action;", "()[Ljavax/swing/Action;", "createCenterPanel", "Ljavax/swing/JComponent;", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/ui/DeclineToSDialog.class */
public final class DeclineToSDialog extends DialogWrapper {
    public DeclineToSDialog() {
        super(false);
        init();
    }

    @NotNull
    protected Action[] createActions() {
        Action oKAction = getOKAction();
        Intrinsics.checkNotNullExpressionValue(oKAction, "okAction");
        return new Action[]{oKAction};
    }

    @NotNull
    protected JComponent createCenterPanel() {
        Component jLabel = new JLabel("<html>Please review the policies and accept the Actions of Google Terms of Services before proceeding with Preview Creation.</html>");
        Component jBLabel = new JBLabel(AllIcons.General.ErrorDialog);
        jBLabel.setPreferredSize(new Dimension(70, 50));
        jLabel.setPreferredSize(new Dimension(330, 50));
        JComponent jPanel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        jPanel.setPreferredSize(new Dimension(400, 100));
        c.gridx = 0;
        c.anchor = 21;
        jPanel.add(jBLabel, c);
        c.gridx++;
        jPanel.add(jLabel, c);
        return jPanel;
    }
}
