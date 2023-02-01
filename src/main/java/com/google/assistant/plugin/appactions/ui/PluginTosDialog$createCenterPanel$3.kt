package com.google.assistant.plugin.appactions.ui

import java.awt.Desktop
import javax.swing.event.HyperlinkEvent
import javax.swing.event.HyperlinkListener
import kotlin.jvm.internal.Intrinsics

/* compiled from: PluginTosDialog.kt */ /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/ui/PluginTosDialog$createCenterPanel$3.class */
internal class `PluginTosDialog$createCenterPanel$3` : HyperlinkListener {
    override fun hyperlinkUpdate(it: HyperlinkEvent) {
        Intrinsics.checkNotNullExpressionValue(it, "it")
        if (Intrinsics.areEqual(it.eventType, HyperlinkEvent.EventType.ACTIVATED)) {
            Desktop.getDesktop().browse(it.url.toURI())
        }
    }

    companion object {
        @JvmField
        val INSTANCE = `PluginTosDialog$createCenterPanel$3`()
    }
}
