package com.google.assistant.plugin.appactions.xml.shortcuts.checks;

import com.android.ide.common.resources.ResourceItem;
import com.google.assistant.plugin.appactions.Constants;
import com.google.assistant.plugin.appactions.xml.shortcuts.els.capability.CapabilityIntent;
import com.google.assistant.plugin.appactions.xml.shortcuts.els.capability.Parameter;
import com.google.assistant.plugin.common.utils.ProjectUtils;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.project.Project;
import com.intellij.psi.JavaPsiFacade;
import com.intellij.psi.PsiClass;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.xml.XmlAttribute;
import com.intellij.psi.xml.XmlTag;
import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.highlighting.DomElementAnnotationHolder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.android.dom.AndroidAttributeValue;
import org.jetbrains.android.dom.manifest.Activity;
import org.jetbrains.android.dom.manifest.Application;
import org.jetbrains.android.dom.manifest.Manifest;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CapabilityIntentValidation.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016J\"\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0002J\"\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002¨\u0006\u000e"}, d2 = {"Lcom/google/assistant/plugin/appactions/xml/shortcuts/checks/CapabilityIntentValidation;", "Lcom/google/assistant/plugin/appactions/xml/shortcuts/checks/DomValidation;", "Lcom/google/assistant/plugin/appactions/xml/shortcuts/els/capability/CapabilityIntent;", "()V", "validateElement", "", "element", "holder", "Lcom/intellij/util/xml/highlighting/DomElementAnnotationHolder;", "validateExportedActivity", "targetClass", "", "validateParameters", "validateTargetClass", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/xml/shortcuts/checks/CapabilityIntentValidation.class */
public final class CapabilityIntentValidation implements DomValidation<CapabilityIntent> {
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
    public void validateElement(@NotNull CapabilityIntent element, @NotNull DomElementAnnotationHolder holder) {
        String str;
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(holder, "holder");
        XmlTag xmlTag = element.getXmlTag();
        if (xmlTag != null) {
            XmlAttribute attribute = xmlTag.getAttribute(Constants.ANDROID_TARGET_CLASS_ATTRIBUTE);
            if (attribute != null) {
                str = attribute.getValue();
                String targetClass = str;
                validateTargetClass(element, holder, targetClass);
                validateExportedActivity(element, holder, targetClass);
                validateParameters(element, holder);
            }
        }
        str = null;
        String targetClass2 = str;
        validateTargetClass(element, holder, targetClass2);
        validateExportedActivity(element, holder, targetClass2);
        validateParameters(element, holder);
    }

    private final void validateTargetClass(CapabilityIntent element, DomElementAnnotationHolder holder, String targetClass) {
        Project project;
        if (targetClass != null) {
            if (StringsKt.startsWith(targetClass, '.', false)) {
                holder.createProblem((DomElement) element, HighlightSeverity.ERROR, "Target class '" + targetClass + "' cannot use shorthand notation");
                return;
            }
            Module module = element.getModule();
            if (module == null || (project = module.getProject()) == null) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue(project, "element.module?.project ?: return");
            PsiClass psiClass = JavaPsiFacade.getInstance(project).findClass(targetClass, GlobalSearchScope.projectScope(project));
            if (psiClass == null) {
                holder.createProblem((DomElement) element, HighlightSeverity.ERROR, "Target class '" + targetClass + "' not found in app");
            }
        }
    }

    private final void validateExportedActivity(CapabilityIntent element, DomElementAnnotationHolder holder, String targetClass) {
        List<Activity> activities;
        if (targetClass != null && element.getModule() != null) {
            ProjectUtils projectUtils = ProjectUtils.INSTANCE;
            Module module = element.getModule();
            Intrinsics.checkNotNull(module);
            Intrinsics.checkNotNullExpressionValue(module, "element.module!!");
            Manifest manifest = projectUtils.getManifest(module);
            if (manifest != null) {
                Application application = manifest.getApplication();
                if (application == null || (activities = application.getActivities()) == null) {
                    return;
                }
                for (Activity activity : activities) {
                    Intrinsics.checkNotNullExpressionValue(activity, "activity");
                    AndroidAttributeValue activityClass = activity.getActivityClass();
                    Intrinsics.checkNotNullExpressionValue(activityClass, "activity.activityClass");
                    if (Intrinsics.areEqual(activityClass.getRawText(), targetClass)) {
                        AndroidAttributeValue exported = activity.getExported();
                        Intrinsics.checkNotNullExpressionValue(exported, "activity.exported");
                        if (Intrinsics.areEqual((String) exported.getValue(), "false")) {
                            holder.createProblem((DomElement) element, HighlightSeverity.ERROR, "Activity '" + targetClass + "' for attribute 'android:targetClass' is not exported");
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0052 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0015 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void validateParameters(CapabilityIntent element, DomElementAnnotationHolder holder) {
        String str;
        String parameterName;
        HashMap<String, Integer> parameterNameCounts = new HashMap();
        for (Parameter parameter : element.getParameters()) {
            XmlTag xmlTag = parameter.getXmlTag();
            if (xmlTag != null) {
                XmlAttribute attribute = xmlTag.getAttribute(Constants.ANDROID_NAME_ATTRIBUTE);
                if (attribute != null) {
                    str = attribute.getValue();
                    parameterName = str;
                    if (parameterName == null) {
                        parameterNameCounts.put(parameterName, Integer.valueOf(((Number) parameterNameCounts.getOrDefault(parameterName, 0)).intValue() + 1));
                    }
                }
            }
            str = null;
            parameterName = str;
            if (parameterName == null) {
            }
        }
        for (Map.Entry parameterNameCount : parameterNameCounts.entrySet()) {
            if (((Number) parameterNameCount.getValue()).intValue() > 1) {
                holder.createProblem((DomElement) element, HighlightSeverity.ERROR, "Intent has multiple parameters with the same name: '" + ((String) parameterNameCount.getKey()) + '\'');
            }
        }
    }
}
