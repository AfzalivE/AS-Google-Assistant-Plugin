package com.google.assistant.plugin.shortcuts.ui;

import com.google.assistant.plugin.shortcuts.listeners.ShortcutUpdateListener;
import com.google.assistant.plugin.shortcuts.models.DisplayShortcut;
import com.google.assistant.plugin.shortcuts.models.Model;
import javax.swing.JButton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ShortcutsTestButton.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\u0018��2\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n��¨\u0006\t"}, d2 = {"Lcom/google/assistant/plugin/shortcuts/ui/ShortcutsTestButton;", "Ljavax/swing/JButton;", "shortcutsModel", "Lcom/google/assistant/plugin/shortcuts/models/Model;", "(Lcom/google/assistant/plugin/shortcuts/models/Model;)V", "onShortcutChange", "", "shortcut", "Lcom/google/assistant/plugin/shortcuts/models/DisplayShortcut;", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/shortcuts/ui/ShortcutsTestButton.class */
public final class ShortcutsTestButton extends JButton {
    private final Model shortcutsModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortcutsTestButton(@NotNull Model shortcutsModel) {
        super("Test Shortcut");
        Intrinsics.checkNotNullParameter(shortcutsModel, "shortcutsModel");
        this.shortcutsModel = shortcutsModel;
        this.shortcutsModel.addShortcutListener(new ShortcutUpdateListener(displayShortcut -> {
            onShortcutChange(displayShortcut);
            return Unit.INSTANCE;
        }));
        setEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onShortcutChange(DisplayShortcut shortcut) {
        setEnabled(shortcut != null && this.shortcutsModel.getSelectedDevice() != null);
    }
}
