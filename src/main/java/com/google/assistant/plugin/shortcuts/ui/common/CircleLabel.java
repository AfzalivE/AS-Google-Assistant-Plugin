package com.google.assistant.plugin.shortcuts.ui.common;

import java.awt.Font;
import javax.swing.JLabel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CircleLabel.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n��\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018��2\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/google/assistant/plugin/shortcuts/ui/common/CircleLabel;", "Ljavax/swing/JLabel;", "radius", "", "labelText", "", "(ILjava/lang/String;)V", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/shortcuts/ui/common/CircleLabel.class */
public final class CircleLabel extends JLabel {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleLabel(int radius, @NotNull String labelText) {
        super(new CircleIcon(radius));
        Intrinsics.checkNotNullParameter(labelText, "labelText");
        setText(labelText);
        Font font = getFont();
        Intrinsics.checkNotNullExpressionValue(font, "font");
        Font newFont = new Font(font.getFamily(), 0, 10);
        setFont(newFont);
        setHorizontalTextPosition(0);
        setVerticalTextPosition(0);
    }
}
