package com.google.assistant.plugin.appactions.ui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import kotlin.Metadata;
import kotlin.Unit;

/* compiled from: ProgressBarPanel.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018��2\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n��R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/google/assistant/plugin/appactions/ui/ProgressBarPanel;", "Ljavax/swing/JPanel;", "()V", "progressBar", "Ljavax/swing/JProgressBar;", "value", "", "progressBarVisible", "getProgressBarVisible", "()Z", "setProgressBarVisible", "(Z)V", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/ui/ProgressBarPanel.class */
public final class ProgressBarPanel extends JPanel {
    private final JProgressBar progressBar;

    public ProgressBarPanel() {
        super(new BorderLayout());
        JProgressBar $this$apply = new JProgressBar(0);
        $this$apply.setIndeterminate(true);
        $this$apply.setVisible(false);
        $this$apply.setString("");
        $this$apply.setPreferredSize(new Dimension(200, 4));
        Unit unit = Unit.INSTANCE;
        this.progressBar = $this$apply;
        setOpaque(false);
        add((Component) this.progressBar, "North");
    }

    public final boolean getProgressBarVisible() {
        return this.progressBar.isVisible();
    }

    public final void setProgressBarVisible(boolean value) {
        this.progressBar.setVisible(value);
    }
}
