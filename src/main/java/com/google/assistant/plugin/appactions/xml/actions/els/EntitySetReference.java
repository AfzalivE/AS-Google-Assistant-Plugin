package com.google.assistant.plugin.appactions.xml.actions.els;

import com.intellij.util.xml.Attribute;
import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.GenericAttributeValue;
import com.intellij.util.xml.JavaNameStrategy;
import com.intellij.util.xml.NameStrategy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: EntitySetReference.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\bg\u0018��2\u00020\u0001R\u001a\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/google/assistant/plugin/appactions/xml/actions/els/EntitySetReference;", "Lcom/intellij/util/xml/DomElement;", "entitySetId", "Lcom/intellij/util/xml/GenericAttributeValue;", "", "getEntitySetId", "()Lcom/intellij/util/xml/GenericAttributeValue;", "entitySetIdAttr", "getEntitySetIdAttr", "urlFilter", "getUrlFilter", "urlFilterAttr", "getUrlFilterAttr", "app-actions-test-tool-kotlin"})
@NameStrategy(JavaNameStrategy.class)
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/xml/actions/els/EntitySetReference.class */
public interface EntitySetReference extends DomElement {
    @Attribute("entitySetId")
    @NotNull
    GenericAttributeValue<String> getEntitySetIdAttr();

    @Attribute("urlFilter")
    @NotNull
    GenericAttributeValue<String> getUrlFilterAttr();

    @NotNull
    GenericAttributeValue<String> getEntitySetId();

    @NotNull
    GenericAttributeValue<String> getUrlFilter();
}
