package com.google.assistant.plugin.shortcuts.ui.common;

import java.awt.Component;
import java.awt.Graphics;
import javax.swing.Icon;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CircleIcon.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018��2\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J(\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n��¨\u0006\u000f"}, d2 = {"Lcom/google/assistant/plugin/shortcuts/ui/common/CircleIcon;", "Ljavax/swing/Icon;", "radius", "", "(I)V", "getIconHeight", "getIconWidth", "paintIcon", "", "c", "Ljava/awt/Component;", "g", "Ljava/awt/Graphics;", "x", "y", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/shortcuts/ui/common/CircleIcon.class */
public final class CircleIcon implements Icon {
    private final int radius;

    public CircleIcon(int radius) {
        this.radius = radius;
    }

    public int getIconHeight() {
        return (2 * this.radius) + 1;
    }

    public int getIconWidth() {
        return (2 * this.radius) + 1;
    }

    public void paintIcon(@NotNull Component c, @NotNull Graphics g, int x, int y) {
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(g, "g");
        g.drawOval(x, y, 2 * this.radius, 2 * this.radius);
    }
}
