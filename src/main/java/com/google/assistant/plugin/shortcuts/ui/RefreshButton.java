package com.google.assistant.plugin.shortcuts.ui;

import com.google.assistant.plugin.shortcuts.ui.common.ConstantsKt;
import com.intellij.openapi.util.IconLoader;
import java.awt.Cursor;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import kotlin.Metadata;

/* compiled from: RefreshButton.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018��2\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/assistant/plugin/shortcuts/ui/RefreshButton;", "Ljavax/swing/JButton;", "()V", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/shortcuts/ui/RefreshButton.class */
public final class RefreshButton extends JButton {
    public RefreshButton() {
        setIcon(IconLoader.findIcon(ConstantsKt.REFRESH_ICON, ConstantsKt.class));
        setContentAreaFilled(false);
        setBorder(BorderFactory.createEmptyBorder());
        Dimension dimension = new Dimension(24, 24);
        setPreferredSize(dimension);
        setSize(dimension);
        setMaximumSize(dimension);
        setCursor(Cursor.getPredefinedCursor(12));
    }
}
