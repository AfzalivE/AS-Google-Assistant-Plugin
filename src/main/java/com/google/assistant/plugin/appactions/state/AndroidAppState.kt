package com.google.assistant.plugin.appactions.state

import kotlin.jvm.internal.Intrinsics

/* compiled from: ProjectStateSubject.kt */
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/state/AndroidAppState.class */
class AndroidAppState(moduleName: String, applicationId: String, appActionsState: AppActionsState) {
    val index: Int
    @JvmField
    val moduleName: String
    @JvmField
    val applicationId: String
    val appActionsState: AppActionsState
    operator fun component1(): String {
        return moduleName
    }

    operator fun component2(): String {
        return applicationId
    }

    operator fun component3(): AppActionsState {
        return appActionsState
    }

    fun copy(moduleName: String, applicationId: String, appActionsState: AppActionsState): AndroidAppState {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName")
        Intrinsics.checkNotNullParameter(applicationId, "applicationId")
        Intrinsics.checkNotNullParameter(appActionsState, "appActionsState")
        return AndroidAppState(moduleName, applicationId, appActionsState)
    }

    override fun hashCode(): Int {
        val str = moduleName
        val hashCode = (str?.hashCode() ?: 0) * 31
        val str2 = applicationId
        val hashCode2 = (hashCode + (str2?.hashCode() ?: 0)) * 31
        val appActionsState = appActionsState
        return hashCode2 + (appActionsState?.hashCode() ?: 0)
    }

    override fun equals(obj: Any?): Boolean {
        if (this !== obj) {
            if (obj is AndroidAppState) {
                val androidAppState = obj
                return Intrinsics.areEqual(moduleName, androidAppState.moduleName) && Intrinsics.areEqual(
                    applicationId, androidAppState.applicationId
                ) && Intrinsics.areEqual(
                    appActionsState, androidAppState.appActionsState
                )
            }
            return false
        }
        return true
    }

    init {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName")
        Intrinsics.checkNotNullParameter(applicationId, "applicationId")
        Intrinsics.checkNotNullParameter(appActionsState, "appActionsState")
        this.moduleName = moduleName
        this.applicationId = applicationId
        this.appActionsState = appActionsState
        index = this.moduleName.indexOf(".", 0, false)
    }

    override fun toString(): String {
        val str = moduleName
        val i = index + 1
        if (str == null) {
            throw NullPointerException("null cannot be cast to non-null type java.lang.String")
        }
        val substring = str.substring(i)
        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)")
        return substring
    }

    companion object {
        fun  /* synthetic */`copy$default`(
            androidAppState: AndroidAppState,
            str: String,
            str2: String,
            appActionsState: AppActionsState,
            i: Int,
            obj: Any?
        ): AndroidAppState {
            var str = str
            var str2 = str2
            var appActionsState = appActionsState
            if (i and 1 != 0) {
                str = androidAppState.moduleName
            }
            if (i and 2 != 0) {
                str2 = androidAppState.applicationId
            }
            if (i and 4 != 0) {
                appActionsState = androidAppState.appActionsState
            }
            return androidAppState.copy(str, str2, appActionsState)
        }
    }
}
