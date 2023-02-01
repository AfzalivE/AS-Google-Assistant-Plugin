package com.google.assistant.plugin.appactions.extensions

import com.google.assistant.plugin.appactions.PluginSingletons
import com.intellij.ide.AppLifecycleListener
import com.intellij.openapi.project.Project

/* compiled from: AppEventListener.kt */ /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/extensions/AppEventListener.class */
class AppEventListener : AppLifecycleListener {
    override fun appStarted() {
        PluginSingletons.init()
    }
}
