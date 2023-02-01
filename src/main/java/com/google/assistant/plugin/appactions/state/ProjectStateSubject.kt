package com.google.assistant.plugin.appactions.state

import com.google.assistant.plugin.common.observable.BaseIntellijStateSubject
import com.intellij.util.messages.MessageBus

/* compiled from: ProjectStateSubject.kt */
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/state/ProjectStateSubject.class */
class ProjectStateSubject(bus: MessageBus) : BaseIntellijStateSubject<ProjectState>(
    ProjectStateSubject::class.java.canonicalName, bus,
    ProjectState(null, null, 3, null)
)
