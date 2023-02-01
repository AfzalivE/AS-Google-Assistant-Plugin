package com.google.assistant.plugin.appactions.state

import com.intellij.openapi.project.Project
import kotlin.jvm.internal.Intrinsics

/* compiled from: AllProjectStateManagers.kt */ /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/state/AllProjectStateManagers.class */
class AllProjectStateManagers private constructor() {
    fun add(project: Project) {
        allProjectStateManagers[project] = ProjectStateManager(project)
    }

    fun remove(project: Project) {
        allProjectStateManagers.remove(project)
    }

    operator fun get(project: Project): ProjectStateManager? {
        return allProjectStateManagers[project]
    }

    companion object {
        @JvmField
        val INSTANCE = AllProjectStateManagers()
        private val allProjectStateManagers: MutableMap<Project?, ProjectStateManager?> = LinkedHashMap()
    }
}
