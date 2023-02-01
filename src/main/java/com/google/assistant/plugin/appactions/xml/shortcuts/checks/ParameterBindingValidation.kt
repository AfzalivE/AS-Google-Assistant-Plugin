package com.google.assistant.plugin.appactions.xml.shortcuts.checks

import com.android.ide.common.rendering.api.ArrayResourceValue
import com.android.ide.common.resources.ResourceItem
import com.google.assistant.plugin.appactions.Constants
import com.google.assistant.plugin.appactions.xml.shortcuts.els.shortcut.ParameterBinding
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.openapi.module.Module
import com.intellij.util.xml.DomElement
import com.intellij.util.xml.highlighting.DomElementAnnotationHolder
import kotlin.jvm.internal.Intrinsics

/* compiled from: ParameterBindingValidation.kt */
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/xml/shortcuts/checks/ParameterBindingValidation.class */
class ParameterBindingValidation : DomValidation<ParameterBinding?> {
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
    override fun validateElement(element: ParameterBinding, holder: DomElementAnnotationHolder) {
        var str: String?
        Intrinsics.checkNotNullParameter(element, "element")
        Intrinsics.checkNotNullParameter(holder, "holder")
        val xmlTag = element.xmlTag
        if (xmlTag != null) {
            val attribute = xmlTag.getAttribute(Constants.ANDROID_VALUE_ATTRIBUTE)
            if (attribute != null) {
                str = attribute.value
                val bindingValue = str
                validateInlineInventory(element, holder, bindingValue)
            }
        }
        str = null
        val bindingValue2 = str
        validateInlineInventory(element, holder, bindingValue2)
    }

    private fun validateInlineInventory(
        element: ParameterBinding,
        holder: DomElementAnnotationHolder,
        bindingValue: String?
    ) {
        if (bindingValue != null && element.module != null && bindingValue.startsWith(
                Constants.ANDROID_ARRAY_RESOURCE_TYPE,
                false
            )
        ) {
            val module = element.module
            Intrinsics.checkNotNull(module)
            Intrinsics.checkNotNullExpressionValue(module, "element.module!!")
            val foundResources = getAppResource(bindingValue, module!!)
            for (foundResource in foundResources) {
                val entryCounts: HashMap<String, Int> = hashMapOf()
                val locale = getArrayResourceLocale(foundResource)
                val resourceValue = foundResource.resourceValue as ArrayResourceValue
                    ?: throw NullPointerException("null cannot be cast to non-null type com.android.ide.common.rendering.api.ArrayResourceValue")
                for (inventoryItem in resourceValue) {
                    Intrinsics.checkNotNullExpressionValue(inventoryItem, "inventoryItem")
                    if (inventoryItem == null) {
                        throw NullPointerException("null cannot be cast to non-null type kotlin.CharSequence")
                    }
                    val entry = inventoryItem.trim()
                    if (entry.isNotEmpty()) {
                        if (entry.isNotBlank()) {
                            entryCounts[entry] = entryCounts.getOrDefault(entry, 0) + 1
                        }
                    }
                }
                for ((key, value) in entryCounts) {
                    if ((value as Number).toInt() > 1) {
                        holder.createProblem(
                            (element as DomElement),
                            HighlightSeverity.ERROR,
                            "Inline inventory '" + bindingValue + "' for '" + locale + "' locale has multiple entries with the same value: '" + key as String + '\''
                        )
                    }
                }
            }
        }
    }
}
