package com.google.assistant.plugin.appactions.extensions;

import com.google.assistant.plugin.appactions.xml.shortcuts.checks.CapabilityIntentValidation;
import com.google.assistant.plugin.appactions.xml.shortcuts.checks.CapabilityValidation;
import com.google.assistant.plugin.appactions.xml.shortcuts.checks.ParameterBindingValidation;
import com.google.assistant.plugin.appactions.xml.shortcuts.checks.ParameterValidation;
import com.google.assistant.plugin.appactions.xml.shortcuts.checks.UrlTemplateValidation;
import com.google.assistant.plugin.appactions.xml.shortcuts.els.Shortcuts;
import com.google.assistant.plugin.appactions.xml.shortcuts.els.capability.Capability;
import com.google.assistant.plugin.appactions.xml.shortcuts.els.capability.CapabilityIntent;
import com.google.assistant.plugin.appactions.xml.shortcuts.els.capability.Parameter;
import com.google.assistant.plugin.appactions.xml.shortcuts.els.capability.UrlTemplate;
import com.google.assistant.plugin.appactions.xml.shortcuts.els.shortcut.CapabilityBinding;
import com.google.assistant.plugin.appactions.xml.shortcuts.els.shortcut.ParameterBinding;
import com.google.assistant.plugin.appactions.xml.shortcuts.els.shortcut.Shortcut;
import com.google.assistant.plugin.common.utils.DevExMetricsLoggingUtils;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.project.Project;
import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.highlighting.BasicDomElementsInspection;
import com.intellij.util.xml.highlighting.DomElementAnnotationHolder;
import com.intellij.util.xml.highlighting.DomHighlightingHelper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import actions.Plugin;

/* compiled from: ShortcutsXmlDomInspection.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J \u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n��R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n��R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n��R\u001c\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n��R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n��¨\u0006\u001b"}, d2 = {"Lcom/google/assistant/plugin/appactions/extensions/ShortcutsXmlDomInspection;", "Lcom/intellij/util/xml/highlighting/BasicDomElementsInspection;", "Lcom/google/assistant/plugin/appactions/xml/shortcuts/els/Shortcuts;", "()V", "capabilityValidation", "Lcom/google/assistant/plugin/appactions/xml/shortcuts/checks/CapabilityValidation;", "intentValidation", "Lcom/google/assistant/plugin/appactions/xml/shortcuts/checks/CapabilityIntentValidation;", "metricsLoggingUtil", "Lcom/google/assistant/plugin/common/utils/DevExMetricsLoggingUtils;", "parameterBindingValidation", "Lcom/google/assistant/plugin/appactions/xml/shortcuts/checks/ParameterBindingValidation;", "parameterValidation", "Lcom/google/assistant/plugin/appactions/xml/shortcuts/checks/ParameterValidation;", "throttledLog", "Lkotlin/Function1;", "Lplugin/actions/Plugin$DevExMetricsClientEventType$Id;", "", "urlTemplateValidation", "Lcom/google/assistant/plugin/appactions/xml/shortcuts/checks/UrlTemplateValidation;", "checkDomElement", "element", "Lcom/intellij/util/xml/DomElement;", "holder", "Lcom/intellij/util/xml/highlighting/DomElementAnnotationHolder;", "helper", "Lcom/intellij/util/xml/highlighting/DomHighlightingHelper;", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/extensions/ShortcutsXmlDomInspection.class */
public final class ShortcutsXmlDomInspection extends BasicDomElementsInspection<Shortcuts> {
    private final CapabilityValidation capabilityValidation;
    private final CapabilityIntentValidation intentValidation;
    private final UrlTemplateValidation urlTemplateValidation;
    private final ParameterValidation parameterValidation;
    private final ParameterBindingValidation parameterBindingValidation;
    private DevExMetricsLoggingUtils metricsLoggingUtil;
    private Function1<? super Plugin.DevExMetricsClientEventType.Id, Unit> throttledLog;

    public ShortcutsXmlDomInspection() {
        super(Shortcuts.class, new Class[0]);
        this.capabilityValidation = new CapabilityValidation();
        this.intentValidation = new CapabilityIntentValidation();
        this.urlTemplateValidation = new UrlTemplateValidation();
        this.parameterValidation = new ParameterValidation();
        this.parameterBindingValidation = new ParameterBindingValidation();
    }

    protected void checkDomElement(@NotNull DomElement element, @NotNull DomElementAnnotationHolder holder, @NotNull DomHighlightingHelper helper) {
        Function1<Plugin.DevExMetricsClientEventType.Id, Unit> function1;
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(helper, "helper");
        super.checkDomElement(element, holder, helper);
        if (element instanceof Capability) {
            this.capabilityValidation.validateElement((Capability) element, holder);
        } else if (element instanceof CapabilityIntent) {
            this.intentValidation.validateElement((CapabilityIntent) element, holder);
        } else if (element instanceof UrlTemplate) {
            this.urlTemplateValidation.validateElement((UrlTemplate) element, holder);
        } else if (element instanceof Parameter) {
            this.parameterValidation.validateElement((Parameter) element, holder);
        } else if (element instanceof ParameterBinding) {
            this.parameterBindingValidation.validateElement((ParameterBinding) element, holder);
        }
        if (((element instanceof Capability) || ((element instanceof CapabilityBinding) && (((CapabilityBinding) element).getParent() instanceof Shortcut))) && element.getModule() != null) {
            if (this.metricsLoggingUtil == null) {
                Module module = element.getModule();
                Intrinsics.checkNotNull(module);
                Intrinsics.checkNotNullExpressionValue(module, "element.module!!");
                Project project = module.getProject();
                Intrinsics.checkNotNullExpressionValue(project, "element.module!!.project");
                this.metricsLoggingUtil = new DevExMetricsLoggingUtils(project);
                ShortcutsXmlDomInspection shortcutsXmlDomInspection = this;
                DevExMetricsLoggingUtils it = this.metricsLoggingUtil;
                if (it != null) {
                    shortcutsXmlDomInspection = shortcutsXmlDomInspection;
                    function1 = it.getThrottledLog();
                } else {
                    function1 = null;
                }
                shortcutsXmlDomInspection.throttledLog = function1;
            }
            Function1<? super Plugin.DevExMetricsClientEventType.Id, Unit> function12 = this.throttledLog;
            if (function12 != null) {
                Unit unit = (Unit) function12.invoke(Plugin.DevExMetricsClientEventType.Id.SHORTCUTS_DEVELOPER_EDIT);
            }
        }
    }
}
