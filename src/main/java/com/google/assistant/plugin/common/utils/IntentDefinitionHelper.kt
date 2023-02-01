package com.google.assistant.plugin.common.utils

import actions.Plugin.AndroidActionPackageResponse.SupportedIntent.SupportedParameter
import java.net.URLEncoder
import kotlin.jvm.internal.Intrinsics

/* compiled from: IntentDefinitionHelper.kt */
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/common/utils/IntentDefinitionHelper.class */
class IntentDefinitionHelper private constructor() {
    fun buildIntentParameterUrlSuffix(map: Map<SupportedParameter, String>): String {
        Intrinsics.checkNotNullParameter(map, "enteredFieldInputsMap")
        val urlSuffixBuilder = StringBuilder()
        for ((key, value) in map) {
            if (value.isNotEmpty()) {
                urlSuffixBuilder.append("&param.").append(key.name).append("=")
                    .append(URLEncoder.encode(value, "UTF-8"))
            }
        }
        val sb = urlSuffixBuilder.toString()
        Intrinsics.checkNotNullExpressionValue(sb, "urlSuffixBuilder.toString()")
        return sb
    }

    companion object {
        @JvmField
        val INSTANCE = IntentDefinitionHelper()
    }
}
