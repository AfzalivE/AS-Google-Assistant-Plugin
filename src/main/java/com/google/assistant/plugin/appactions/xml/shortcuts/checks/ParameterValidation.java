package com.google.assistant.plugin.appactions.xml.shortcuts.checks;

import com.android.ide.common.resources.ResourceItem;
import com.google.assistant.plugin.appactions.Constants;
import com.google.assistant.plugin.appactions.xml.shortcuts.els.capability.Capability;
import com.google.assistant.plugin.appactions.xml.shortcuts.els.capability.CapabilityIntent;
import com.google.assistant.plugin.appactions.xml.shortcuts.els.capability.Parameter;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.openapi.module.Module;
import com.intellij.psi.xml.XmlAttribute;
import com.intellij.psi.xml.XmlTag;
import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.highlighting.DomElementAnnotationHolder;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ParameterValidation.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J,\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0002J,\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0002¨\u0006\u000f"}, d2 = {"Lcom/google/assistant/plugin/appactions/xml/shortcuts/checks/ParameterValidation;", "Lcom/google/assistant/plugin/appactions/xml/shortcuts/checks/DomValidation;", "Lcom/google/assistant/plugin/appactions/xml/shortcuts/els/capability/Parameter;", "()V", "getIntentName", "", "element", "validateElement", "", "holder", "Lcom/intellij/util/xml/highlighting/DomElementAnnotationHolder;", "validateParameterName", "parameterName", "intentName", "validateWebInventory", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/xml/shortcuts/checks/ParameterValidation.class */
public final class ParameterValidation implements DomValidation<Parameter> {
    @Override // com.google.assistant.plugin.appactions.xml.shortcuts.checks.DomValidation
    @NotNull
    public List<ResourceItem> getAppResource(@NotNull String resourceName, @NotNull Module module) {
        Intrinsics.checkNotNullParameter(resourceName, "resourceName");
        Intrinsics.checkNotNullParameter(module, "module");
        return DefaultImpls.getAppResource(this, resourceName, module);
    }

    @Override // com.google.assistant.plugin.appactions.xml.shortcuts.checks.DomValidation
    @NotNull
    public String getArrayResourceLocale(@NotNull ResourceItem resource) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        return DefaultImpls.getArrayResourceLocale(this, resource);
    }

    @Override // com.google.assistant.plugin.appactions.xml.shortcuts.checks.DomValidation
    public boolean isCustomIntent(@Nullable String intentName) {
        return DefaultImpls.isCustomIntent(this, intentName);
    }

    @Override // com.google.assistant.plugin.appactions.xml.shortcuts.checks.DomValidation
    public void validateElement(@NotNull Parameter element, @NotNull DomElementAnnotationHolder holder) {
        String str;
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(holder, "holder");
        XmlTag xmlTag = element.getXmlTag();
        if (xmlTag != null) {
            XmlAttribute attribute = xmlTag.getAttribute(Constants.ANDROID_NAME_ATTRIBUTE);
            if (attribute != null) {
                str = attribute.getValue();
                String parameterName = str;
                String intentName = getIntentName(element);
                validateParameterName(element, holder, parameterName, intentName);
                validateWebInventory(element, holder, parameterName, intentName);
            }
        }
        str = null;
        String parameterName2 = str;
        String intentName2 = getIntentName(element);
        validateParameterName(element, holder, parameterName2, intentName2);
        validateWebInventory(element, holder, parameterName2, intentName2);
    }

    private final void validateParameterName(Parameter element, DomElementAnnotationHolder holder, String parameterName, String intentName) {
        if (isCustomIntent(intentName) && parameterName != null && StringsKt.contains(parameterName, '.', false)) {
            holder.createProblem((DomElement) element, HighlightSeverity.ERROR, "Parameter '" + parameterName + "' for custom intent '" + intentName + "' cannot use dot notation");
        }
    }

    private final void validateWebInventory(Parameter element, DomElementAnnotationHolder holder, String parameterName, String intentName) {
        if (isCustomIntent(intentName)) {
            if (!element.getDatas().isEmpty()) {
                holder.createProblem((DomElement) element, HighlightSeverity.ERROR, "Parameter '" + parameterName + "' for custom intent '" + intentName + "' cannot use data element for web inventory");
            }
        }
    }

    private final String getIntentName(Parameter element) {
        DomElement parent;
        DomElement parent2 = element.getParent();
        if (parent2 == null || !(parent2 instanceof CapabilityIntent) || (parent = parent2.getParent()) == null || !(parent instanceof Capability)) {
            return null;
        }
        XmlTag xmlTag = parent.getXmlTag();
        if (xmlTag != null) {
            XmlAttribute attribute = xmlTag.getAttribute(Constants.ANDROID_NAME_ATTRIBUTE);
            if (attribute != null) {
                return attribute.getValue();
            }
        }
        return null;
    }
}
