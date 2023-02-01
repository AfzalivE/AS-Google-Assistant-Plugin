package com.google.assistant.plugin.shortcuts.listeners;

import com.google.common.collect.ImmutableList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ShortcutsListeners.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��&\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018��2\u00020\u0001B.\u0012'\u0010\u0002\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\u0002\u0010\nR2\u0010\u0002\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\b\n��\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/google/assistant/plugin/shortcuts/listeners/PackageNameListListener;", "", "onUpdate", "Lkotlin/Function1;", "Lcom/google/common/collect/ImmutableList;", "", "Lkotlin/ParameterName;", "name", "list", "", "(Lkotlin/jvm/functions/Function1;)V", "getOnUpdate", "()Lkotlin/jvm/functions/Function1;", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/shortcuts/listeners/PackageNameListListener.class */
public final class PackageNameListListener {
    @NotNull
    private final Function1<ImmutableList<String>, Unit> onUpdate;

    @NotNull
    public final Function1<ImmutableList<String>, Unit> getOnUpdate() {
        return this.onUpdate;
    }

    public PackageNameListListener(@NotNull Function1<ImmutableList<String>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "onUpdate");
        this.onUpdate = function1;
    }
}
