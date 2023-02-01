package com.google.assistant.plugin.appactions.extensions

import com.android.tools.idea.assistant.AssistantBundleCreator
import com.android.tools.idea.assistant.datamodel.TutorialBundleData
import com.intellij.openapi.project.Project
import java.net.URL

/* compiled from: AppActionsAssistantBundleCreator.kt */ /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/extensions/AppActionsAssistantBundleCreator.class */
class AppActionsAssistantBundleCreator : AssistantBundleCreator {
    override fun getBundleId(): String = "GoogleAssistantHelpSidePanel"

    override fun getBundle(project: Project): TutorialBundleData? {
        return null
    }

    override fun getConfig(): URL? {
        return javaClass.getResource("/appactions_assistant_bundle.xml")
    }
    
    companion object {
        private const val BUNDLE_ID = "GoogleAssistantHelpSidePanel"
        private const val TUTORIAL_CONFIG_FILENAME = "/appactions_assistant_bundle.xml"
    }
}
