package com.google.assistant.plugin.appactions.android;

import com.android.ddmlib.AndroidDebugBridge;
import com.android.ddmlib.IDevice;
import com.google.assistant.plugin.appactions.state.DeviceProperties;
import com.google.assistant.plugin.appactions.state.DeviceType;
import com.google.assistant.plugin.appactions.state.OnlineDevicesState;
import com.google.assistant.plugin.appactions.state.OnlineDevicesStateSubject;
import com.intellij.openapi.application.Application;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.util.concurrency.SequentialTaskExecutor;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: PluginDeviceChangeListener.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\b��\u0018��2\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0012H\u0002J\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u000bH\u0016J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u000bH\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u000bH\u0002J\u0019\u0010\u001b\u001a\u00020\u00102\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001d¢\u0006\u0002\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u000bH\u0002R*\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b`\tX\u0082\u0004¢\u0006\u0002\n��R*\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b`\tX\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n��R\u0013\u0010\f\u001a\u00070\r¢\u0006\u0002\b\u000eX\u0082\u0004¢\u0006\u0002\n��¨\u0006 "}, d2 = {"Lcom/google/assistant/plugin/appactions/android/PluginDeviceChangeListener;", "Lcom/android/ddmlib/AndroidDebugBridge$IDeviceChangeListener;", "stateSubject", "Lcom/google/assistant/plugin/appactions/state/OnlineDevicesStateSubject;", "(Lcom/google/assistant/plugin/appactions/state/OnlineDevicesStateSubject;)V", "onlineDeviceProperties", "Ljava/util/HashMap;", "", "Lcom/google/assistant/plugin/appactions/state/DeviceProperties;", "Lkotlin/collections/HashMap;", "onlineDevices", "Lcom/android/ddmlib/IDevice;", "taskExecutor", "Ljava/util/concurrent/ExecutorService;", "Lorg/jetbrains/annotations/NotNull;", "broadcastDeviceProperties", "", "map", "", "deviceChanged", "device", "changeMask", "", "deviceConnected", "deviceDisconnected", "isAutomotiveDevice", "", "setDevices", "devices", "", "([Lcom/android/ddmlib/IDevice;)V", "trackDeviceIfOnline", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/android/PluginDeviceChangeListener.class */
public final class PluginDeviceChangeListener implements AndroidDebugBridge.IDeviceChangeListener {
    private final HashMap<String, IDevice> onlineDevices;
    private final HashMap<String, DeviceProperties> onlineDeviceProperties;
    private final ExecutorService taskExecutor;
    private final OnlineDevicesStateSubject stateSubject;

    public PluginDeviceChangeListener(@NotNull OnlineDevicesStateSubject stateSubject) {
        Intrinsics.checkNotNullParameter(stateSubject, "stateSubject");
        this.stateSubject = stateSubject;
        this.onlineDevices = new HashMap<>();
        this.onlineDeviceProperties = new HashMap<>();
        ExecutorService createSequentialApplicationPoolExecutor = SequentialTaskExecutor.createSequentialApplicationPoolExecutor("DeviceNamePropertiesFetcher");
        Intrinsics.checkNotNullExpressionValue(createSequentialApplicationPoolExecutor, "SequentialTaskExecutor.c…ceNamePropertiesFetcher\")");
        this.taskExecutor = createSequentialApplicationPoolExecutor;
    }

    public final void setDevices(@NotNull IDevice[] devices) {
        Intrinsics.checkNotNullParameter(devices, "devices");
        synchronized (this.onlineDevices) {
            this.onlineDevices.clear();
            this.onlineDeviceProperties.clear();
            Unit unit = Unit.INSTANCE;
        }
        for (IDevice iDevice : devices) {
            trackDeviceIfOnline(iDevice);
        }
    }

    public void deviceConnected(@NotNull IDevice device) {
        Intrinsics.checkNotNullParameter(device, "device");
        trackDeviceIfOnline(device);
    }

    public void deviceChanged(@NotNull IDevice device, int changeMask) {
        Intrinsics.checkNotNullParameter(device, "device");
        trackDeviceIfOnline(device);
    }

    public void deviceDisconnected(@NotNull IDevice device) {
        Intrinsics.checkNotNullParameter(device, "device");
        trackDeviceIfOnline(device);
    }

    private final void trackDeviceIfOnline(IDevice device) {
        String serialNumber = device.getSerialNumber();
        IDevice.DeviceState state = device.getState();
        Map map = null;
        synchronized (this.onlineDevices) {
            boolean isTracked = this.onlineDevices.containsKey(serialNumber);
            boolean isOnline = state == IDevice.DeviceState.ONLINE;
            if (!isTracked && isOnline) {
                Intrinsics.checkNotNullExpressionValue(serialNumber, "serialNumber");
                this.onlineDevices.put(serialNumber, device);
                DeviceType deviceType = DeviceType.MOBILE;
                if (isAutomotiveDevice(device)) {
                    deviceType = DeviceType.AUTOMOTIVE;
                } else if (device.supportsFeature(IDevice.HardwareFeature.WATCH)) {
                    deviceType = DeviceType.WATCH;
                }
                this.onlineDeviceProperties.put(serialNumber, new DeviceProperties(serialNumber, "Android device", deviceType));
                new Pair(this.onlineDeviceProperties, device);
                map = MapsKt.toMap(this.onlineDeviceProperties);
            } else if (isTracked && !isOnline) {
                this.onlineDevices.remove(device.getSerialNumber());
                this.onlineDeviceProperties.remove(device.getSerialNumber());
                map = MapsKt.toMap(this.onlineDeviceProperties);
            }
            Unit unit = Unit.INSTANCE;
        }
        Map it = map;
        if (it != null) {
            broadcastDeviceProperties(it);
        }
    }

    private final void broadcastDeviceProperties(Map<String, DeviceProperties> map) {
        Application app = ApplicationManager.getApplication();
        final OnlineDevicesState updatedDevices = new OnlineDevicesState(map);
        Intrinsics.checkNotNullExpressionValue(app, "app");
        if (!app.isDispatchThread()) {
            ApplicationManager.getApplication().invokeLater(new Runnable() { // from class: com.google.assistant.plugin.appactions.android.PluginDeviceChangeListener$broadcastDeviceProperties$1
                @Override // java.lang.Runnable
                public final void run() {
                    OnlineDevicesStateSubject onlineDevicesStateSubject;
                    onlineDevicesStateSubject = PluginDeviceChangeListener.this.stateSubject;
                    onlineDevicesStateSubject.setState(updatedDevices);
                }
            });
        } else {
            this.stateSubject.setState(updatedDevices);
        }
    }

    private final boolean isAutomotiveDevice(IDevice device) {
        boolean isUsingIhuEmulator = Intrinsics.areEqual("ihu_emulator", device.getProperty("ro.build.product"));
        String property = device.getProperty("boot.car_service_created");
        boolean hasCarService = !(property == null || property.length() == 0);
        boolean hasAutoHardware = device.supportsFeature(IDevice.HardwareFeature.AUTOMOTIVE);
        if (isUsingIhuEmulator || hasCarService || hasAutoHardware) {
            return true;
        }
        return false;
    }
}
