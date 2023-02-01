package com.google.assistant.plugin.appactions.xml.shortcuts.checks

import com.android.ide.common.rendering.api.ArrayResourceValue
import com.android.ide.common.resources.ResourceItem
import com.google.assistant.plugin.appactions.Constants
import com.google.assistant.plugin.appactions.xml.actions.els.IntentName
import com.google.assistant.plugin.appactions.xml.shortcuts.els.capability.Capability
import com.google.assistant.plugin.appactions.xml.shortcuts.els.capability.Parameter
import com.google.assistant.plugin.common.utils.ProjectUtils
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.openapi.module.Module
import com.intellij.psi.xml.XmlTag
import com.intellij.util.xml.DomElement
import com.intellij.util.xml.highlighting.DomElementAnnotationHolder
import org.jetbrains.android.dom.AndroidAttributeValue
import kotlin.jvm.internal.Intrinsics
import kotlin.text.contains

/* compiled from: CapabilityValidation.kt */
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/xml/shortcuts/checks/CapabilityValidation.class */
class CapabilityValidation : DomValidation<Capability?> {
    override fun getAppResource(resourceName: String, module: Module): List<ResourceItem> {
        Intrinsics.checkNotNullParameter(resourceName, "resourceName")
        Intrinsics.checkNotNullParameter(module, "module")
        return DomValidation.DefaultImpls.getAppResource(this, resourceName, module)
    }

    override fun getArrayResourceLocale(resource: ResourceItem): String {
        Intrinsics.checkNotNullParameter(resource, "resource")
        return DomValidation.DefaultImpls.getArrayResourceLocale(this, resource)
    }

    // com.google.assistant.plugin.appactions.xml.shortcuts.checks.DomValidation
    override fun isCustomIntent(intentName: String?): Boolean {
        return DomValidation.DefaultImpls.isCustomIntent(this, intentName)
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    // com.google.assistant.plugin.appactions.xml.shortcuts.checks.DomValidation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */ override fun validateElement(element: Capability, holder: DomElementAnnotationHolder) {
        var str: String?
        var xmlTag: XmlTag?
        var str2: String?
        Intrinsics.checkNotNullParameter(element, "element")
        Intrinsics.checkNotNullParameter(holder, "holder")
        val xmlTag2 = element.xmlTag
        if (xmlTag2 != null) {
            val attribute = xmlTag2.getAttribute(Constants.ANDROID_NAME_ATTRIBUTE)
            if (attribute != null) {
                str = attribute.value
                val intentName = str
                xmlTag = element.xmlTag
                if (xmlTag != null) {
                    val attribute2 = xmlTag.getAttribute(Constants.APP_QUERY_PATTERNS_ATTRIBUTE)
                    if (attribute2 != null) {
                        str2 = attribute2.value
                        val intentQueryPatterns = str2
                        validateOpenAppFeature(element, holder, intentName)
                        validateFallbackFulfillment(element, holder, intentName)
                        validateQueryPatternsAttribute(element, holder, intentName, intentQueryPatterns)
                        validateQueryPatterns(element, holder, intentQueryPatterns)
                    }
                }
                str2 = null
                val intentQueryPatterns2 = str2
                validateOpenAppFeature(element, holder, intentName)
                validateFallbackFulfillment(element, holder, intentName)
                validateQueryPatternsAttribute(element, holder, intentName, intentQueryPatterns2)
                validateQueryPatterns(element, holder, intentQueryPatterns2)
            }
        }
        str = null
        val intentName2 = str
        xmlTag = element.xmlTag
        if (xmlTag != null) {
        }
        str2 = null
        val intentQueryPatterns22 = str2
        validateOpenAppFeature(element, holder, intentName2)
        validateFallbackFulfillment(element, holder, intentName2)
        validateQueryPatternsAttribute(element, holder, intentName2, intentQueryPatterns22)
        validateQueryPatterns(element, holder, intentQueryPatterns22)
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1 A[SYNTHETIC] */ /* JADX WARN: Removed duplicated region for block: B:29:0x005d A[SYNTHETIC] */ /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private fun validateOpenAppFeature(element: Capability, holder: DomElementAnnotationHolder, intentName: String?) {
        var str: String?
        var parameterName: String?
        if (Intrinsics.areEqual(intentName, IntentName.ACTIONS_INTENT_OPEN_APP_FEATURE.value)) {
            for (intent in element.intents) {
                if (intent.parameters.isEmpty()) {
                    holder.createProblem(
                        (element as DomElement),
                        HighlightSeverity.ERROR,
                        "Intent 'actions.intent.OPEN_APP_FEATURE' must have 'feature' parameter"
                    )
                }
                for (parameter in intent.parameters) {
                    val xmlTag = parameter.xmlTag
                    if (xmlTag != null) {
                        val attribute = xmlTag.getAttribute(Constants.ANDROID_NAME_ATTRIBUTE)
                        if (attribute != null) {
                            str = attribute.value
                            parameterName = str
                            if (!!Intrinsics.areEqual(parameterName, "feature")) {
                                holder.createProblem(
                                    (element as DomElement),
                                    HighlightSeverity.ERROR,
                                    "Parameter name '$parameterName' is invalid for intent 'actions.intent.OPEN_APP_FEATURE'"
                                )
                            }
                        }
                    }
                    str = null
                    parameterName = str
                    if (!!Intrinsics.areEqual(parameterName, "feature")) {
                    }
                }
            }
        }
    }

    private fun validateFallbackFulfillment(
        element: Capability,
        holder: DomElementAnnotationHolder,
        intentName: String?
    ) {
        var str: String?
        var required: String?
        var intentHasRequiredParameter = false
        var intentHasFallbackFulfillment = false
        for (intent in element.intents) {
            var requiredParameterFound = false
            val it: Iterator<Parameter> = intent.parameters.iterator()
            while (true) {
                if (!it.hasNext()) {
                    break
                }
                val parameter = it.next()
                val xmlTag = parameter.xmlTag
                if (xmlTag != null) {
                    val attribute = xmlTag.getAttribute(Constants.ANDROID_REQUIRED_ATTRIBUTE)
                    if (attribute != null) {
                        str = attribute.value
                        required = str
                        if (required == null && Intrinsics.areEqual(required, "true")) {
                            requiredParameterFound = true
                            if (!intentHasRequiredParameter) {
                                intentHasRequiredParameter = true
                            }
                        }
                    }
                }
                str = null
                required = str
                if (required == null) {
                }
            }
            if (!requiredParameterFound && !intentHasFallbackFulfillment) {
                intentHasFallbackFulfillment = true
            }
        }
        if (intentHasRequiredParameter && !intentHasFallbackFulfillment) {
            holder.createProblem(
                (element as DomElement),
                HighlightSeverity.ERROR,
                "Intent '$intentName' has at least one required parameter but no fallback fulfillment"
            )
        }
    }

    private fun validateQueryPatternsAttribute(
        element: Capability,
        holder: DomElementAnnotationHolder,
        intentName: String?,
        intentQueryPatterns: String?
    ) {
        if (intentName != null && !intentName.startsWith(
                Constants.BUILT_IN_INTENT_PREFIX,
                false,
            ) && intentQueryPatterns == null
        ) {
            holder.createProblem(
                (element as DomElement),
                HighlightSeverity.ERROR,
                "Custom intent '$intentName' within a <capability> tag is missing the 'app:queryPatterns' attribute"
            )
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c5  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private fun validateQueryPatterns(
        element: Capability,
        holder: DomElementAnnotationHolder,
        intentQueryPatterns: String?
    ) {
        var str: String?
        if (intentQueryPatterns == null) {
            return
        }
        if (!intentQueryPatterns.startsWith(Constants.ANDROID_ARRAY_RESOURCE_TYPE, false)) {
            holder.createProblem(
                (element as DomElement),
                HighlightSeverity.ERROR,
                "'$intentQueryPatterns' is not a valid array resource for the 'app:queryPatterns' attribute"
            )
        } else if (element.module != null) {
            val projectUtils = ProjectUtils.INSTANCE
            val module = element.module
            Intrinsics.checkNotNull(module)
            Intrinsics.checkNotNullExpressionValue(module, "element.module!!")
            val manifest = projectUtils.getManifest(module!!)
            if (manifest != null) {
                val application = manifest.application
                if (application != null) {
                    val name: AndroidAttributeValue<*>? = application.name
                    if (name != null) {
                        val rawText = name.rawText
                        if (rawText != null) {
                            str = rawText.substringAfterLast('.')
                            val applicationName = str
                            val intentParameters: Set<String> = getIntentParameters(element)
                            val module2 = element.module
                            Intrinsics.checkNotNull(module2)
                            Intrinsics.checkNotNullExpressionValue(module2, "element.module!!")
                            val foundResources = getAppResource(intentQueryPatterns, module2!!)
                            for (foundResource in foundResources) {
                                var applicationNameFound = false
                                val queryPatternParameters: MutableSet<String> = mutableSetOf()
                                val locale = getArrayResourceLocale(foundResource)
                                val resourceValue = foundResource.resourceValue
                                    ?: throw NullPointerException("null cannot be cast to non-null type com.android.ide.common.rendering.api.ArrayResourceValue")
                                val queryPatterns = resourceValue as ArrayResourceValue
                                for (queryPattern in queryPatterns) {
                                    if (!applicationNameFound && applicationName != null) {
                                        Intrinsics.checkNotNullExpressionValue(queryPattern, "queryPattern")
                                        if (queryPattern.contains(applicationName, false)) {
                                            holder.createProblem(
                                                (element as DomElement),
                                                HighlightSeverity.WARNING,
                                                "Query patterns '$intentQueryPatterns' for '$locale' locale should not use application name '$applicationName'"
                                            )
                                            applicationNameFound = true
                                        }
                                    }
                                    Intrinsics.checkNotNullExpressionValue(queryPattern, "queryPattern")
                                    findQueryPatternParameters(queryPattern, queryPatternParameters)
                                }
                                compareParameters(
                                    element,
                                    holder,
                                    intentQueryPatterns,
                                    locale,
                                    intentParameters,
                                    queryPatternParameters
                                )
                            }
                        }
                    }
                }
            }
            str = null
            val applicationName2 = str
            val intentParameters2: Set<*> = getIntentParameters(element)
            val module22 = element.module
            Intrinsics.checkNotNull(module22)
            Intrinsics.checkNotNullExpressionValue(module22, "element.module!!")
            val foundResources2: List<*> = getAppResource(intentQueryPatterns, module22!!)
            //            while (r0.hasNext()) {
//            }
        }
    }

    private fun getIntentParameters(element: Capability): Set<String> {
        var str: String?
        var parameterKey: String?
        val intentParameters: HashSet<String> = hashSetOf()
        for (intent in element.intents) {
            for (parameter in intent.parameters) {
                val xmlTag = parameter.xmlTag
                if (xmlTag != null) {
                    val attribute = xmlTag.getAttribute(Constants.ANDROID_KEY_ATTRIBUTE)
                    if (attribute != null) {
                        str = attribute.value
                        parameterKey = str
                        if (parameterKey != null && !intentParameters.contains(parameterKey)) {
                            intentParameters.add(parameterKey)
                        }
                    }
                }
                str = null
                parameterKey = str
                if (parameterKey != null) {
                    intentParameters.add(parameterKey)
                }
            }
        }
        return intentParameters
    }

    private fun findQueryPatternParameters(queryPattern: String, set: MutableSet<String>) {
        val regexMatches = Regex("\\$\\w+").findAll(queryPattern, 0)
        for (match in regexMatches) {
            val queryPatternParameter = match.value.substringAfter('$', (null as String?)!!)
            if (!set.contains(queryPatternParameter)) {
                set.add(queryPatternParameter)
            }
        }
    }

    private fun compareParameters(
        element: Capability,
        holder: DomElementAnnotationHolder,
        intentQueryPatterns: String,
        locale: String,
        set: Set<String>,
        set2: Set<String>
    ) {
        for (intentParameter in set) {
            if (!set2.contains(intentParameter)) {
                holder.createProblem(
                    (element as DomElement),
                    HighlightSeverity.ERROR,
                    "Parameter '$intentParameter' is not referenced in query patterns '$intentQueryPatterns' for '$locale' locale"
                )
            }
        }
        for (queryPatternParameter in set2) {
            if (!set.contains(queryPatternParameter)) {
                holder.createProblem(
                    (element as DomElement),
                    HighlightSeverity.ERROR,
                    "Parameter '$queryPatternParameter' in query patterns '$intentQueryPatterns' for '$locale' locale is not a valid intent parameter"
                )
            }
        }
    }
}
