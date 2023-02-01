package com.google.assistant.plugin.appactions.ui.toolwindow.frames

import com.google.assistant.plugin.appactions.state.DeviceProperties
import com.google.assistant.plugin.appactions.state.OnlineDevicesState
import com.google.assistant.plugin.appactions.ui.DeviceSelectionPanel
import kotlin.collections.sortWith
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.Intrinsics
import kotlin.jvm.internal.Lambda

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: TestPreviewFrame.kt */
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/ui/toolwindow/frames/TestPreviewFrame$subscribeToEvents$8.class */
fun subscribeToEvents(newState: OnlineDevicesState, oldState: OnlineDevicesState?): MutableList<DeviceProperties> {
    val deviceList: MutableList<DeviceProperties> = newState.onlineDevices.values.toMutableList()
    if (deviceList.size > 1) {
        deviceList.sortWith { t, t2 ->

            // from class: com.google.assistant.plugin.appactions.ui.toolwindow.frames.TestPreviewFrame$subscribeToEvents$8$$special$$inlined$sortBy$1
            // java.util.Comparator
            val item = t as DeviceProperties
            val item2 = t2 as DeviceProperties
            compareValues(item.serialNumber, item2.serialNumber)
        }
    }

    return deviceList
}