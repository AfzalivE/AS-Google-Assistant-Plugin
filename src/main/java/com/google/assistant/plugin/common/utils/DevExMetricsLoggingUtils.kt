package com.google.assistant.plugin.common.utils

import actions.Plugin.DevExMetricsClientEventType
import com.google.assistant.plugin.appactions.api.HttpClient
import com.google.assistant.plugin.appactions.exceptions.ActionsBuilderException
import com.google.gct.login.GoogleLogin
import com.intellij.openapi.project.Project
import kotlinx.coroutines.*
import kotlin.coroutines.intrinsics.COROUTINE_SUSPENDED
import kotlin.jvm.internal.Intrinsics
import kotlin.jvm.internal.Ref

/* compiled from: DevExMetricsLoggingUtils.kt */
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/common/utils/DevExMetricsLoggingUtils.class */
class DevExMetricsLoggingUtils(project: Project) {
    private val httpClient: HttpClient
    private val project: Project

    init {
        Intrinsics.checkNotNullParameter(project, "project")
        this.project = project
        httpClient = HttpClient()
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun logDevExEvent(eventType: DevExMetricsClientEventType.Id?) {
        val accessToken = GoogleLogin.instance.fetchOAuth2Token()
            ?: throw ActionsBuilderException("Devex metrics logging failed when obtaining access token.")
        val packageName = ProjectUtils.INSTANCE.readPackageNameSafely(project)
        httpClient.logDevExEvent(accessToken, packageName, eventType!!, ProjectUtils.INSTANCE.isInternalUser)
    }

    private fun throttleFirst(
        skipMs: Long,
        function1: (DevExMetricsClientEventType.Id?) -> Unit
    ): (DevExMetricsClientEventType.Id) -> Unit {
        val scope = CoroutineScope(CoroutineName("DevExLoggingScope"))
//        return `DevExMetricsLoggingUtils$throttleFirst$1`(throttleJob, scope, function1, skipMs)

        return { eventType: DevExMetricsClientEventType.Id ->
            scope.launch {
                throttleFirst(skipMs, eventType, function1)
            }
        }
    }

    val throttledLog: Function1<DevExMetricsClientEventType.Id, Unit>
        get() = throttleFirst(100000L) { id: DevExMetricsClientEventType.Id? ->
            logDevExEvent(id)
            Unit
        }

    suspend fun throttleFirst(
        skipMs: Long,
        eventType: DevExMetricsClientEventType.Id,
        destinationFunction: (DevExMetricsClientEventType.Id?) -> Unit
    ) {
        delay(skipMs)
        destinationFunction(eventType)
    }
}
