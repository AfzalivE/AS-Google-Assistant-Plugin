package com.google.assistant.plugin.shortcuts.ui;

import java.awt.Component;
import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.JButton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ShortcutsTableControl.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018��2\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/google/assistant/plugin/shortcuts/ui/ShortcutsTableControl;", "Ljavax/swing/Box;", "refreshButton", "Ljavax/swing/JButton;", "shortcutDropdown", "Lcom/google/assistant/plugin/shortcuts/ui/ShortcutDropdown;", "packageNameDropdown", "Lcom/google/assistant/plugin/shortcuts/ui/PackageNameDropdown;", "(Ljavax/swing/JButton;Lcom/google/assistant/plugin/shortcuts/ui/ShortcutDropdown;Lcom/google/assistant/plugin/shortcuts/ui/PackageNameDropdown;)V", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/shortcuts/ui/ShortcutsTableControl.class */
public final class ShortcutsTableControl extends Box {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortcutsTableControl(@NotNull JButton refreshButton, @NotNull ShortcutDropdown shortcutDropdown, @NotNull PackageNameDropdown packageNameDropdown) {
        super(0);
        Intrinsics.checkNotNullParameter(refreshButton, "refreshButton");
        Intrinsics.checkNotNullParameter(shortcutDropdown, "shortcutDropdown");
        Intrinsics.checkNotNullParameter(packageNameDropdown, "packageNameDropdown");
        add((Component) refreshButton);
        add(Box.createRigidArea(new Dimension(10, 0)));
        add((Component) shortcutDropdown);
        add(Box.createRigidArea(new Dimension(10, 0)));
        add((Component) packageNameDropdown);
        setAlignmentX(0.0f);
    }
}
