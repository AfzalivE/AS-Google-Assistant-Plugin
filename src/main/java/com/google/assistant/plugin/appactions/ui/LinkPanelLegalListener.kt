package com.google.assistant.plugin.appactions.ui

import com.intellij.ui.components.labels.LinkLabel
import com.intellij.ui.components.labels.LinkListener

/* compiled from: LinkPanel.kt */
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/ui/LinkPanel$legal$1.class */
internal class LinkPanelLegalListener<T> : LinkListener<T> {
    override fun linkSelected(linkLabel: LinkLabel<T>, ignored: T) {
        val legalDialog = LegalDialog()
        legalDialog.loadLegalMessage()
        legalDialog.show()
    }

    companion object {
        @JvmField
        val INSTANCE: LinkPanelLegalListener<*> = LinkPanelLegalListener<Any?>()
    }
}
