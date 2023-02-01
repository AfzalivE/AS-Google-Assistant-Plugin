package com.google.assistant.plugin.appactions.state;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: OnlineDevicesStateSubject.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��*\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018��2\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001f\u0010\n\u001a\u00020��2\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n��\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/google/assistant/plugin/appactions/state/OnlineDevicesState;", "", "onlineDevices", "", "", "Lcom/google/assistant/plugin/appactions/state/DeviceProperties;", "(Ljava/util/Map;)V", "getOnlineDevices", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/state/OnlineDevicesState.class */
public final class OnlineDevicesState {
    @NotNull
    private final Map<String, DeviceProperties> onlineDevices;

    @NotNull
    public final Map<String, DeviceProperties> component1() {
        return this.onlineDevices;
    }

    @NotNull
    public final OnlineDevicesState copy(@NotNull Map<String, DeviceProperties> map) {
        Intrinsics.checkNotNullParameter(map, "onlineDevices");
        return new OnlineDevicesState(map);
    }

    public static /* synthetic */ OnlineDevicesState copy$default(OnlineDevicesState onlineDevicesState, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = onlineDevicesState.onlineDevices;
        }
        return onlineDevicesState.copy(map);
    }

    @NotNull
    public String toString() {
        return "OnlineDevicesState(onlineDevices=" + this.onlineDevices + ")";
    }

    public int hashCode() {
        Map<String, DeviceProperties> map = this.onlineDevices;
        if (map != null) {
            return map.hashCode();
        }
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof OnlineDevicesState) && Intrinsics.areEqual(this.onlineDevices, ((OnlineDevicesState) obj).onlineDevices);
        }
        return true;
    }

    public OnlineDevicesState(@NotNull Map<String, DeviceProperties> map) {
        Intrinsics.checkNotNullParameter(map, "onlineDevices");
        this.onlineDevices = map;
    }

    @NotNull
    public final Map<String, DeviceProperties> getOnlineDevices() {
        return this.onlineDevices;
    }
}
