package com.google.assistant.plugin.appactions

import com.google.assistant.plugin.appactions.android.PluginDeviceChangeManager
import com.google.assistant.plugin.appactions.state.OnlineDevicesStateSubject
import kotlin.jvm.internal.Intrinsics

/* compiled from: PluginSingletons.kt */ /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/PluginSingletons.class */
object PluginSingletons {
    private var onlineDevicesStateSubject: OnlineDevicesStateSubject? = null
    private var isInitialized = false

    /* compiled from: PluginSingletons.kt */
    /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/PluginSingletons$Companion.class */
    @JvmStatic
    fun getOnlineDevicesStateSubject(): OnlineDevicesStateSubject {
        val onlineDevicesStateSubject = onlineDevicesStateSubject
        if (onlineDevicesStateSubject == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onlineDevicesStateSubject")
        }
        return onlineDevicesStateSubject!!
    }
    @JvmStatic
    fun setOnlineDevicesStateSubject(onlineDevicesStateSubject: OnlineDevicesStateSubject) {
        Intrinsics.checkNotNullParameter(onlineDevicesStateSubject, "<set-?>")
        PluginSingletons.onlineDevicesStateSubject = onlineDevicesStateSubject
    }

    fun init() {
        if (!isInitialized) {
            isInitialized = true
            setOnlineDevicesStateSubject(PluginDeviceChangeManager().stateSubject)
        }
    }
}
