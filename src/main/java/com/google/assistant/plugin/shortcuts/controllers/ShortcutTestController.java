package com.google.assistant.plugin.shortcuts.controllers;

import com.google.assistant.plugin.shortcuts.utils.ShortcutsAdbUtils;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ShortcutTestController.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\u0018��2\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n��¨\u0006\t"}, d2 = {"Lcom/google/assistant/plugin/shortcuts/controllers/ShortcutTestController;", "Ljava/awt/event/ActionListener;", "shortcutsAdbUtils", "Lcom/google/assistant/plugin/shortcuts/utils/ShortcutsAdbUtils;", "(Lcom/google/assistant/plugin/shortcuts/utils/ShortcutsAdbUtils;)V", "actionPerformed", "", "e", "Ljava/awt/event/ActionEvent;", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/shortcuts/controllers/ShortcutTestController.class */
public final class ShortcutTestController implements ActionListener {
    private final ShortcutsAdbUtils shortcutsAdbUtils;

    public ShortcutTestController(@NotNull ShortcutsAdbUtils shortcutsAdbUtils) {
        Intrinsics.checkNotNullParameter(shortcutsAdbUtils, "shortcutsAdbUtils");
        this.shortcutsAdbUtils = shortcutsAdbUtils;
    }

    public void actionPerformed(@NotNull ActionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        this.shortcutsAdbUtils.triggerCurrentShortcutIntent();
    }
}
