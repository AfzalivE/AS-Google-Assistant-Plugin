package com.google.assistant.plugin.shortcuts.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Types.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��\"\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018��2\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020��2\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n��\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n��\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n��\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n��\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/google/assistant/plugin/shortcuts/models/DisplayIntent;", "", "action", "", "data", "type", "component", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "getComponent", "getData", "getType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/shortcuts/models/DisplayIntent.class */
public final class DisplayIntent {
    @Nullable
    private final String action;
    @Nullable
    private final String data;
    @Nullable
    private final String type;
    @Nullable
    private final String component;

    @Nullable
    public final String component1() {
        return this.action;
    }

    @Nullable
    public final String component2() {
        return this.data;
    }

    @Nullable
    public final String component3() {
        return this.type;
    }

    @Nullable
    public final String component4() {
        return this.component;
    }

    @NotNull
    public final DisplayIntent copy(@Nullable String action, @Nullable String data, @Nullable String type, @Nullable String component) {
        return new DisplayIntent(action, data, type, component);
    }

    public static /* synthetic */ DisplayIntent copy$default(DisplayIntent displayIntent, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = displayIntent.action;
        }
        if ((i & 2) != 0) {
            str2 = displayIntent.data;
        }
        if ((i & 4) != 0) {
            str3 = displayIntent.type;
        }
        if ((i & 8) != 0) {
            str4 = displayIntent.component;
        }
        return displayIntent.copy(str, str2, str3, str4);
    }

    @NotNull
    public String toString() {
        return "DisplayIntent(action=" + this.action + ", data=" + this.data + ", type=" + this.type + ", component=" + this.component + ")";
    }

    public int hashCode() {
        String str = this.action;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.data;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.type;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.component;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof DisplayIntent) {
                DisplayIntent displayIntent = (DisplayIntent) obj;
                return Intrinsics.areEqual(this.action, displayIntent.action) && Intrinsics.areEqual(this.data, displayIntent.data) && Intrinsics.areEqual(this.type, displayIntent.type) && Intrinsics.areEqual(this.component, displayIntent.component);
            }
            return false;
        }
        return true;
    }

    public DisplayIntent(@Nullable String action, @Nullable String data, @Nullable String type, @Nullable String component) {
        this.action = action;
        this.data = data;
        this.type = type;
        this.component = component;
    }

    @Nullable
    public final String getAction() {
        return this.action;
    }

    @Nullable
    public final String getData() {
        return this.data;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getComponent() {
        return this.component;
    }
}
