package com.google.assistant.plugin.common.utils;

import com.android.ddmlib.AdbCommandRejectedException;
import com.android.ddmlib.AndroidDebugBridge;
import com.android.ddmlib.CollectingOutputReceiver;
import com.android.ddmlib.IDevice;
import com.android.ddmlib.IShellOutputReceiver;
import com.android.ddmlib.ShellCommandUnresponsiveException;
import com.android.ddmlib.TimeoutException;
import com.google.assistant.plugin.appactions.state.DeviceProperties;
import com.google.assistant.plugin.appactions.state.DeviceType;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AdbUtils.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��$\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0016\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004J\u0016\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u000e"}, d2 = {"Lcom/google/assistant/plugin/common/utils/AdbUtils;", "", "()V", "buildLaunchShellCommand", "", "url", "deviceType", "Lcom/google/assistant/plugin/appactions/state/DeviceType;", "constructFullUrlTriggerCommand", "targetDevice", "Lcom/google/assistant/plugin/appactions/state/DeviceProperties;", "executeAdbShellCommand", "shellCommand", "triggerUrlOnDevice", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/common/utils/AdbUtils.class */
public final class AdbUtils {
    @NotNull
    public static final AdbUtils INSTANCE = new AdbUtils();

    private AdbUtils() {
    }

    @NotNull
    public final String executeAdbShellCommand(@NotNull DeviceProperties targetDevice, @NotNull String shellCommand) throws TimeoutException, AdbCommandRejectedException, ShellCommandUnresponsiveException, IOException, InterruptedException {
        IDevice iDevice;
        Intrinsics.checkNotNullParameter(targetDevice, "targetDevice");
        Intrinsics.checkNotNullParameter(shellCommand, "shellCommand");
        AndroidDebugBridge adb = AndroidDebugBridge.getBridge();
        if (adb != null) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            CollectingOutputReceiver collectingOutputReceiver = new CollectingOutputReceiver(countDownLatch);
            IDevice[] devices = adb.getDevices();
            Intrinsics.checkNotNullExpressionValue(devices, "adb.devices");
            int length = devices.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    iDevice = null;
                    break;
                }
                IDevice it = devices[i];
                Intrinsics.checkNotNullExpressionValue(it, "it");
                if (Intrinsics.areEqual(it.getSerialNumber(), targetDevice.getSerialNumber())) {
                    iDevice = it;
                    break;
                }
                i++;
            }
            IDevice iDevice2 = iDevice;
            if (iDevice2 != null) {
                iDevice2.executeShellCommand(shellCommand, collectingOutputReceiver);
            }
            countDownLatch.await();
            String output = collectingOutputReceiver.getOutput();
            Intrinsics.checkNotNullExpressionValue(output, "receiver.output");
            return output;
        }
        return "?";
    }

    @NotNull
    public final String triggerUrlOnDevice(@NotNull DeviceProperties targetDevice, @NotNull String url) throws InterruptedException, TimeoutException, AdbCommandRejectedException, ShellCommandUnresponsiveException, IOException {
        Intrinsics.checkNotNullParameter(targetDevice, "targetDevice");
        Intrinsics.checkNotNullParameter(url, "url");
        return executeAdbShellCommand(targetDevice, buildLaunchShellCommand(url, targetDevice.getDeviceType()));
    }

    @NotNull
    public final String constructFullUrlTriggerCommand(@NotNull DeviceProperties targetDevice, @NotNull String url) {
        Intrinsics.checkNotNullParameter(targetDevice, "targetDevice");
        Intrinsics.checkNotNullParameter(url, "url");
        return "adb -s " + targetDevice.getSerialNumber() + " shell " + buildLaunchShellCommand(url, targetDevice.getDeviceType());
    }

    private final String buildLaunchShellCommand(String url, DeviceType deviceType) {
        switch (deviceType) {
            case WATCH:
                return "am broadcast -a android.intent.action.VIEW -d \"" + url + '\"';
            default:
                return "am start -a android.intent.action.VIEW -d \"" + url + '\"';
        }
    }
}
