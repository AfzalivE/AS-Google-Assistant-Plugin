package com.google.assistant.plugin.shortcuts.listeners;

import com.google.assistant.plugin.shortcuts.models.DisplayShortcut;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ShortcutsListeners.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��\"\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018��2\u00020\u0001B*\u0012#\u0010\u0002\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0002\u0010\tR.\u0010\u0002\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n��\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/google/assistant/plugin/shortcuts/listeners/ShortcutUpdateListener;", "", "onUpdate", "Lkotlin/Function1;", "Lcom/google/assistant/plugin/shortcuts/models/DisplayShortcut;", "Lkotlin/ParameterName;", "name", "shortcut", "", "(Lkotlin/jvm/functions/Function1;)V", "getOnUpdate", "()Lkotlin/jvm/functions/Function1;", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/shortcuts/listeners/ShortcutUpdateListener.class */
public final class ShortcutUpdateListener {
    @NotNull
    private final Function1<DisplayShortcut, Unit> onUpdate;

    @NotNull
    public final Function1<DisplayShortcut, Unit> getOnUpdate() {
        return this.onUpdate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShortcutUpdateListener(@NotNull Function1<DisplayShortcut, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "onUpdate");
        this.onUpdate = function1;
    }
}
