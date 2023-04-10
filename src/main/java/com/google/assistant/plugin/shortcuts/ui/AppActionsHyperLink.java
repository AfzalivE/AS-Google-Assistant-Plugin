package com.google.assistant.plugin.shortcuts.ui;

import com.intellij.util.ui.JBUI;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.JButton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppActionsHyperLink.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018��2\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/assistant/plugin/shortcuts/ui/AppActionsHyperLink;", "Ljavax/swing/JButton;", "()V", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/shortcuts/ui/AppActionsHyperLink.class */
public final class AppActionsHyperLink extends JButton {
    public AppActionsHyperLink() {
        Color linkColor = JBUI.CurrentTheme.Link.Foreground.ENABLED;
        Intrinsics.checkNotNullExpressionValue(linkColor, "JBUI.CurrentTheme.Link.linkColor()");
        String hexString = Integer.toHexString(linkColor.getRGB());
        Intrinsics.checkNotNullExpressionValue(hexString, "Integer.toHexString(JBUI…eme.Link.linkColor().rgb)");
        if (hexString == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String linkColor2 = hexString.substring(2);
        Intrinsics.checkNotNullExpressionValue(linkColor2, "(this as java.lang.String).substring(startIndex)");
        setText("<HTML>To test shortcut by voice query on device, create or update preview on the <FONT color=\"#" + linkColor2 + "\"><U>App Actions Test Tool</U></FONT>");
        setFont(new Font((String) null, 0, 13));
        setForeground(Color.GRAY);
        setHorizontalAlignment(2);
        setBorderPainted(false);
        setOpaque(false);
        setContentAreaFilled(false);
        setCursor(Cursor.getPredefinedCursor(12));
    }
}
