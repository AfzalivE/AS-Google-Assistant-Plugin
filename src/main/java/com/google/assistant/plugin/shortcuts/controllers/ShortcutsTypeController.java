package com.google.assistant.plugin.shortcuts.controllers;

import com.google.assistant.plugin.shortcuts.models.ShortcutType;
import com.google.assistant.plugin.shortcuts.models.ShortcutsTableModel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ShortcutsTypeController.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\u0018��2\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n��¨\u0006\t"}, d2 = {"Lcom/google/assistant/plugin/shortcuts/controllers/ShortcutsTypeController;", "Ljava/awt/event/ItemListener;", "model", "Lcom/google/assistant/plugin/shortcuts/models/ShortcutsTableModel;", "(Lcom/google/assistant/plugin/shortcuts/models/ShortcutsTableModel;)V", "itemStateChanged", "", "e", "Ljava/awt/event/ItemEvent;", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/shortcuts/controllers/ShortcutsTypeController.class */
public final class ShortcutsTypeController implements ItemListener {
    private final ShortcutsTableModel model;

    public ShortcutsTypeController(@NotNull ShortcutsTableModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.model = model;
    }

    public void itemStateChanged(@NotNull ItemEvent e) {
        ShortcutType shortcutType;
        Intrinsics.checkNotNullParameter(e, "e");
        Object item = e.getItem();
        if (e.getStateChange() == 1 && (item instanceof String)) {
            ShortcutType[] values = ShortcutType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    shortcutType = null;
                    break;
                }
                ShortcutType it = values[i];
                if (Intrinsics.areEqual(it.getValue(), item)) {
                    shortcutType = it;
                    break;
                }
                i++;
            }
            ShortcutType shortcutType2 = shortcutType;
            ShortcutsTableModel shortcutsTableModel = this.model;
            Intrinsics.checkNotNull(shortcutType2);
            shortcutsTableModel.setSelectedType(shortcutType2);
        }
    }
}
