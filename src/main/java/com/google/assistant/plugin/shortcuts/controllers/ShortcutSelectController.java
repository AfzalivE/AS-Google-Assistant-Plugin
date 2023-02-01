package com.google.assistant.plugin.shortcuts.controllers;

import com.google.assistant.plugin.shortcuts.models.DisplayShortcut;
import com.google.assistant.plugin.shortcuts.models.Model;
import com.google.assistant.plugin.shortcuts.models.ShortcutsTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ShortcutSelectController.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\u0018��2\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n��¨\u0006\u000b"}, d2 = {"Lcom/google/assistant/plugin/shortcuts/controllers/ShortcutSelectController;", "Ljavax/swing/event/ListSelectionListener;", "model", "Lcom/google/assistant/plugin/shortcuts/models/Model;", "shortcutsTableModel", "Lcom/google/assistant/plugin/shortcuts/models/ShortcutsTableModel;", "(Lcom/google/assistant/plugin/shortcuts/models/Model;Lcom/google/assistant/plugin/shortcuts/models/ShortcutsTableModel;)V", "valueChanged", "", "e", "Ljavax/swing/event/ListSelectionEvent;", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/shortcuts/controllers/ShortcutSelectController.class */
public final class ShortcutSelectController implements ListSelectionListener {
    private final Model model;
    private final ShortcutsTableModel shortcutsTableModel;

    public ShortcutSelectController(@NotNull Model model, @NotNull ShortcutsTableModel shortcutsTableModel) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(shortcutsTableModel, "shortcutsTableModel");
        this.model = model;
        this.shortcutsTableModel = shortcutsTableModel;
    }

    public void valueChanged(@NotNull ListSelectionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        if (!e.getValueIsAdjusting() && (e.getSource() instanceof ListSelectionModel)) {
            Object source = e.getSource();
            if (source == null) {
                throw new NullPointerException("null cannot be cast to non-null type javax.swing.ListSelectionModel");
            }
            ListSelectionModel listSelectionModel = (ListSelectionModel) source;
            DisplayShortcut selectedShortcut = this.shortcutsTableModel.getShortcutFromIndex(listSelectionModel.getMinSelectionIndex());
            this.model.setSelectedShortcut(selectedShortcut);
        }
    }
}
