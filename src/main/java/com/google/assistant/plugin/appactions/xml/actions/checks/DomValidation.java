package com.google.assistant.plugin.appactions.xml.actions.checks;

import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.highlighting.DomElementAnnotationHolder;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: DomValidation.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"�� \n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018��*\b\b��\u0010\u0001*\u00020\u00022\u00020\u0003J\u001d\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028��2\u0006\u0010\u0007\u001a\u00020\bH&¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/google/assistant/plugin/appactions/xml/actions/checks/DomValidation;", "T", "Lcom/intellij/util/xml/DomElement;", "", "validateElement", "", "element", "holder", "Lcom/intellij/util/xml/highlighting/DomElementAnnotationHolder;", "(Lcom/intellij/util/xml/DomElement;Lcom/intellij/util/xml/highlighting/DomElementAnnotationHolder;)V", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/xml/actions/checks/DomValidation.class */
public interface DomValidation<T extends DomElement> {
    void validateElement(@NotNull T t, @NotNull DomElementAnnotationHolder domElementAnnotationHolder);
}
