package com.google.assistant.plugin.appactions.xml.actions.checks;

import com.google.assistant.plugin.appactions.xml.actions.els.EntitySetReference;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.util.xml.highlighting.DomElementAnnotationHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: UrlFilterValidation.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/google/assistant/plugin/appactions/xml/actions/checks/UrlFilterValidation;", "Lcom/google/assistant/plugin/appactions/xml/actions/checks/DomValidation;", "Lcom/google/assistant/plugin/appactions/xml/actions/els/EntitySetReference;", "()V", "validateElement", "", "element", "holder", "Lcom/intellij/util/xml/highlighting/DomElementAnnotationHolder;", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/xml/actions/checks/UrlFilterValidation.class */
public final class UrlFilterValidation implements DomValidation<EntitySetReference> {
    @Override // com.google.assistant.plugin.appactions.xml.actions.checks.DomValidation
    public void validateElement(@NotNull EntitySetReference element, @NotNull DomElementAnnotationHolder holder) {
        boolean isValidUrlFilter;
        boolean isValidDomainAndScheme;
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(holder, "holder");
        String urlFilter = (String) element.getUrlFilter().getValue();
        if (urlFilter != null) {
            isValidUrlFilter = UrlFilterValidationKt.isValidUrlFilter(urlFilter);
            if (!isValidUrlFilter) {
                holder.createProblem(element.getUrlFilter(), HighlightSeverity.ERROR, "Replace .+ with .* patterns.");
            }
            isValidDomainAndScheme = UrlFilterValidationKt.isValidDomainAndScheme(urlFilter);
            if (!isValidDomainAndScheme) {
                holder.createProblem(element.getUrlFilter(), HighlightSeverity.ERROR, "Invalid domain or scheme.");
            }
        }
    }
}
