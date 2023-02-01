package com.google.assistant.plugin.appactions.state;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: OnlineDevicesStateSubject.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��*\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018��2\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/google/assistant/plugin/appactions/state/DeviceProperties;", "", "serialNumber", "", "model", "deviceType", "Lcom/google/assistant/plugin/appactions/state/DeviceType;", "(Ljava/lang/String;Ljava/lang/String;Lcom/google/assistant/plugin/appactions/state/DeviceType;)V", "getDeviceType", "()Lcom/google/assistant/plugin/appactions/state/DeviceType;", "getModel", "()Ljava/lang/String;", "getSerialNumber", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/state/DeviceProperties.class */
public final class DeviceProperties {
    @NotNull
    private final String serialNumber;
    @NotNull
    private final String model;
    @NotNull
    private final DeviceType deviceType;

    @NotNull
    public final String component1() {
        return this.serialNumber;
    }

    @NotNull
    public final String component2() {
        return this.model;
    }

    @NotNull
    public final DeviceType component3() {
        return this.deviceType;
    }

    @NotNull
    public final DeviceProperties copy(@NotNull String serialNumber, @NotNull String model, @NotNull DeviceType deviceType) {
        Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        return new DeviceProperties(serialNumber, model, deviceType);
    }

    public static /* synthetic */ DeviceProperties copy$default(DeviceProperties deviceProperties, String str, String str2, DeviceType deviceType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceProperties.serialNumber;
        }
        if ((i & 2) != 0) {
            str2 = deviceProperties.model;
        }
        if ((i & 4) != 0) {
            deviceType = deviceProperties.deviceType;
        }
        return deviceProperties.copy(str, str2, deviceType);
    }

    @NotNull
    public String toString() {
        return "DeviceProperties(serialNumber=" + this.serialNumber + ", model=" + this.model + ", deviceType=" + this.deviceType + ")";
    }

    public int hashCode() {
        String str = this.serialNumber;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.model;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        DeviceType deviceType = this.deviceType;
        return hashCode2 + (deviceType != null ? deviceType.hashCode() : 0);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof DeviceProperties) {
                DeviceProperties deviceProperties = (DeviceProperties) obj;
                return Intrinsics.areEqual(this.serialNumber, deviceProperties.serialNumber) && Intrinsics.areEqual(this.model, deviceProperties.model) && Intrinsics.areEqual(this.deviceType, deviceProperties.deviceType);
            }
            return false;
        }
        return true;
    }

    public DeviceProperties(@NotNull String serialNumber, @NotNull String model, @NotNull DeviceType deviceType) {
        Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        this.serialNumber = serialNumber;
        this.model = model;
        this.deviceType = deviceType;
    }

    @NotNull
    public final String getSerialNumber() {
        return this.serialNumber;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    @NotNull
    public final DeviceType getDeviceType() {
        return this.deviceType;
    }
}
