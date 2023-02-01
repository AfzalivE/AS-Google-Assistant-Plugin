package com.google.assistant.plugin.appactions.extensions;

import com.google.assistant.plugin.appactions.xml.actions.checks.EntityValidation;
import com.google.assistant.plugin.appactions.xml.actions.checks.UrlFilterValidation;
import com.google.assistant.plugin.appactions.xml.actions.els.Action;
import com.google.assistant.plugin.appactions.xml.actions.els.Actions;
import com.google.assistant.plugin.appactions.xml.actions.els.Entity;
import com.google.assistant.plugin.appactions.xml.actions.els.EntitySetReference;
import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.highlighting.BasicDomElementsInspection;
import com.intellij.util.xml.highlighting.DomElementAnnotationHolder;
import com.intellij.util.xml.highlighting.DomElementProblemDescriptor;
import com.intellij.util.xml.highlighting.DomHighlightingHelper;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: ActionXmlDomInspection.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��6\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n��¨\u0006\u0011"}, d2 = {"Lcom/google/assistant/plugin/appactions/extensions/ActionXmlDomInspection;", "Lcom/intellij/util/xml/highlighting/BasicDomElementsInspection;", "Lcom/google/assistant/plugin/appactions/xml/actions/els/Actions;", "()V", "entityValidation", "Lcom/google/assistant/plugin/appactions/xml/actions/checks/EntityValidation;", "urlFilterValidation", "Lcom/google/assistant/plugin/appactions/xml/actions/checks/UrlFilterValidation;", "checkDomElement", "", "element", "Lcom/intellij/util/xml/DomElement;", "holder", "Lcom/intellij/util/xml/highlighting/DomElementAnnotationHolder;", "helper", "Lcom/intellij/util/xml/highlighting/DomHighlightingHelper;", "removeIntentNameProblems", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/extensions/ActionXmlDomInspection.class */
public final class ActionXmlDomInspection extends BasicDomElementsInspection<Actions> {
    private final UrlFilterValidation urlFilterValidation;
    private final EntityValidation entityValidation;

    public ActionXmlDomInspection() {
        super(Actions.class, new Class[0]);
        this.urlFilterValidation = new UrlFilterValidation();
        this.entityValidation = new EntityValidation();
    }

    protected void checkDomElement(@NotNull DomElement element, @NotNull DomElementAnnotationHolder holder, @NotNull DomHighlightingHelper helper) {
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(helper, "helper");
        super.checkDomElement(element, holder, helper);
        if (element instanceof EntitySetReference) {
            this.urlFilterValidation.validateElement((EntitySetReference) element, holder);
        } else if (element instanceof Entity) {
            this.entityValidation.validateElement((Entity) element, holder);
        }
        removeIntentNameProblems(holder);
    }

    private final void removeIntentNameProblems(DomElementAnnotationHolder holder) {
        Iterator problemsIterator = holder.iterator();
        while (problemsIterator.hasNext()) {
            DomElementProblemDescriptor problemDescriptor = (DomElementProblemDescriptor) problemsIterator.next();
            Intrinsics.checkNotNullExpressionValue(problemDescriptor, "problemDescriptor");
            DomElement domElement = problemDescriptor.getDomElement();
            Intrinsics.checkNotNullExpressionValue(domElement, "problemDescriptor.domElement");
            String elementName = domElement.getXmlElementName();
            Intrinsics.checkNotNullExpressionValue(elementName, "problemDescriptor.domElement.xmlElementName");
            DomElement domElement2 = problemDescriptor.getDomElement();
            Intrinsics.checkNotNullExpressionValue(domElement2, "problemDescriptor.domElement");
            DomElement parentElement = domElement2.getParent();
            if (StringsKt.equals(elementName, "intentName", true) && (parentElement instanceof Action)) {
                problemsIterator.remove();
            }
        }
    }
}
