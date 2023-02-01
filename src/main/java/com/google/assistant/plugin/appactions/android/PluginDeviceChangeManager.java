package com.google.assistant.plugin.appactions.android;

import com.android.ddmlib.AndroidDebugBridge;
import com.android.ddmlib.IDevice;
import com.google.assistant.plugin.appactions.state.OnlineDevicesStateSubject;
import com.intellij.openapi.application.Application;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.util.messages.MessageBus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PluginDeviceChangeManager.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��\u001a\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018��2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n��R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/google/assistant/plugin/appactions/android/PluginDeviceChangeManager;", "", "()V", "listener", "Lcom/google/assistant/plugin/appactions/android/PluginDeviceChangeListener;", "stateSubject", "Lcom/google/assistant/plugin/appactions/state/OnlineDevicesStateSubject;", "getStateSubject", "()Lcom/google/assistant/plugin/appactions/state/OnlineDevicesStateSubject;", "MyDebugBridgeChangeListener", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/android/PluginDeviceChangeManager.class */
public final class PluginDeviceChangeManager {
    @NotNull
    private final OnlineDevicesStateSubject stateSubject;
    private PluginDeviceChangeListener listener;

    public PluginDeviceChangeManager() {
        Application application = ApplicationManager.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "ApplicationManager.getApplication()");
        MessageBus bus = application.getMessageBus();
        Intrinsics.checkNotNullExpressionValue(bus, "ApplicationManager.getApplication().messageBus");
        this.stateSubject = new OnlineDevicesStateSubject(bus);
        this.listener = new PluginDeviceChangeListener(this.stateSubject);
        AndroidDebugBridge.addDebugBridgeChangeListener(new MyDebugBridgeChangeListener());
        AndroidDebugBridge.addDeviceChangeListener(this.listener);
    }

    @NotNull
    public final OnlineDevicesStateSubject getStateSubject() {
        return this.stateSubject;
    }

    /* compiled from: PluginDeviceChangeManager.kt */
    @Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\b\u0082\u0004\u0018��2\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/google/assistant/plugin/appactions/android/PluginDeviceChangeManager$MyDebugBridgeChangeListener;", "Lcom/android/ddmlib/AndroidDebugBridge$IDebugBridgeChangeListener;", "(Lcom/google/assistant/plugin/appactions/android/PluginDeviceChangeManager;)V", "bridgeChanged", "", "bridge", "Lcom/android/ddmlib/AndroidDebugBridge;", "app-actions-test-tool-kotlin"})
    /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/android/PluginDeviceChangeManager$MyDebugBridgeChangeListener.class */
    private final class MyDebugBridgeChangeListener implements AndroidDebugBridge.IDebugBridgeChangeListener {
        public MyDebugBridgeChangeListener() {
        }

        public void bridgeChanged(@Nullable AndroidDebugBridge bridge) {
            if (bridge == null) {
                PluginDeviceChangeManager.this.listener.setDevices(new IDevice[0]);
                return;
            }
            IDevice[] initialDevices = bridge.getDevices();
            PluginDeviceChangeListener pluginDeviceChangeListener = PluginDeviceChangeManager.this.listener;
            Intrinsics.checkNotNullExpressionValue(initialDevices, "initialDevices");
            pluginDeviceChangeListener.setDevices(initialDevices);
        }
    }
}
