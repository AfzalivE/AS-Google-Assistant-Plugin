package com.google.assistant.plugin.appactions.xml.shortcuts.checks

import com.android.ide.common.resources.ResourceItem
import com.google.assistant.plugin.appactions.Constants
import com.google.assistant.plugin.appactions.xml.shortcuts.els.capability.UrlTemplate
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.openapi.module.Module
import com.intellij.util.xml.DomElement
import com.intellij.util.xml.highlighting.DomElementAnnotationHolder
import kotlin.jvm.internal.Intrinsics

/* compiled from: UrlTemplateValidation.kt */
class UrlTemplateValidation : DomValidation<UrlTemplate?> {
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

    // com.google.assistant.plugin.appactions.xml.shortcuts.checks.DomValidation
    override fun validateElement(element: UrlTemplate, holder: DomElementAnnotationHolder) {
        var str: String?
        Intrinsics.checkNotNullParameter(element, "element")
        Intrinsics.checkNotNullParameter(holder, "holder")
        val xmlTag = element.xmlTag
        if (xmlTag != null) {
            val attribute = xmlTag.getAttribute(Constants.ANDROID_VALUE_ATTRIBUTE)
            if (attribute != null) {
                str = attribute.value
                val urlTemplate = str
                validateParameters(element, holder, urlTemplate)
            }
        }
        str = null
        val urlTemplate2 = str
        validateParameters(element, holder, urlTemplate2)
    }

    private fun validateParameters(element: UrlTemplate, holder: DomElementAnnotationHolder, urlTemplate: String?) {
        if (urlTemplate != null) {
            val parameterCounts: HashMap<String?, Int?> = hashMapOf()
            val regexMatches = Regex("\\{([?&#]?(.*))\\}").findAll(urlTemplate, 0)
            for (match in regexMatches) {
                val parameters: List<String> = (match.groupValues[2]).split(',', ignoreCase = false)
                for (parameter in parameters) {
                    parameterCounts[parameter] =
                        Integer.valueOf((parameterCounts.getOrDefault(parameter, 0) as Number?)!!.toInt() + 1)
                }
            }
            for ((key, value) in parameterCounts) {
                if ((value as Number).toInt() > 1) {
                    holder.createProblem(
                        (element as DomElement),
                        HighlightSeverity.ERROR,
                        "There are multiple parameters with the same key: '" + key as String + '\''
                    )
                }
            }
        }
    }
}
