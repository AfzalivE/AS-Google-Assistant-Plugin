package com.google.assistant.plugin.shortcuts.ui;

import java.awt.Dimension;
import javax.swing.JComboBox;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ShortcutTypeDropdown.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n��\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/google/assistant/plugin/shortcuts/ui/ShortcutDropdown;", "Ljavax/swing/JComboBox;", "", "list", "", "([Ljava/lang/String;)V", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/shortcuts/ui/ShortcutDropdown.class */
public final class ShortcutDropdown extends JComboBox<String> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortcutDropdown(@NotNull String[] list) {
        super(list);
        Intrinsics.checkNotNullParameter(list, "list");
        setMaximumSize(new Dimension(100, 30));
        setAlignmentX(0.0f);
    }
}
