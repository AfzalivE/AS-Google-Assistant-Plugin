package com.google.assistant.plugin.shortcuts.ui

import com.google.assistant.plugin.appactions.state.DeviceProperties
import com.google.assistant.plugin.appactions.state.OnlineDevicesState
import org.jetbrains.annotations.Nullable
import kotlin.jvm.internal.Intrinsics

fun ShortcutsPanel.onDeviceStateUpdate(newState: OnlineDevicesState, @Nullable oldState: OnlineDevicesState) {
    Intrinsics.checkNotNullParameter(newState, "newState")
    val deviceList: MutableList<DeviceProperties> = newState.onlineDevices.values.toMutableList()
    if (deviceList.size > 1) {
        deviceList.sortWith { t, t2 ->

            // from class: com.google.assistant.plugin.shortcuts.ui.ShortcutsPanel$2$$special$$inlined$sortBy$1
            // java.util.Comparator
            val item = t as DeviceProperties
            val item2 = t2 as DeviceProperties
            compareValues(item.serialNumber, item2.serialNumber)
        }
    }
    deviceSelectionPanel.setDevices(deviceList)
}