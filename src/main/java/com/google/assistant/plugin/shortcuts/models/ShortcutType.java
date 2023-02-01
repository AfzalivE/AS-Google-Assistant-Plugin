package com.google.assistant.plugin.shortcuts.models;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Types.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n��\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018��2\b\u0012\u0004\u0012\u00020��0\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/google/assistant/plugin/shortcuts/models/ShortcutType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "STATIC", "DYNAMIC", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/shortcuts/models/ShortcutType.class */
public enum ShortcutType {
    STATIC("Static"),
    DYNAMIC("Dynamic");
    
    @NotNull
    private final String value;

    @NotNull
    public final String getValue() {
        return this.value;
    }

    ShortcutType(String value) {
        this.value = value;
    }
}
