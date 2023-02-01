package com.google.assistant.plugin.appactions.xml.actions.els;

import com.intellij.util.xml.Attribute;
import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.GenericAttributeValue;
import com.intellij.util.xml.JavaNameStrategy;
import com.intellij.util.xml.NameStrategyForAttributes;
import com.intellij.util.xml.NameValue;
import com.intellij.util.xml.Required;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ParameterMapping.kt */
@NameStrategyForAttributes(JavaNameStrategy.class)
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018��2\u00020\u0001R\u001a\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u001c\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0006R\u001a\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006R\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0006R\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0006R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0006¨\u0006\u0017"}, d2 = {"Lcom/google/assistant/plugin/appactions/xml/actions/els/ParameterMapping;", "Lcom/intellij/util/xml/DomElement;", "entityMatchRequired", "Lcom/intellij/util/xml/GenericAttributeValue;", "Lcom/google/assistant/plugin/appactions/xml/actions/els/EntityMatchRequired;", "getEntityMatchRequired", "()Lcom/intellij/util/xml/GenericAttributeValue;", "entityMatchRequiredAttr", "getEntityMatchRequiredAttr", "intentParameter", "", "getIntentParameter", "intentParameterAttr", "getIntentParameterAttr", "required", "Lcom/intellij/util/xml/Required;", "getRequired", "requiredAttr", "getRequiredAttr", "urlParameter", "getUrlParameter", "urlParameterAttr", "getUrlParameterAttr", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/xml/actions/els/ParameterMapping.class */
public interface ParameterMapping extends DomElement {
    @Attribute("urlParameter")
    @NotNull
    @Required
    @NameValue
    GenericAttributeValue<String> getUrlParameterAttr();

    @Required
    @Attribute("intentParameter")
    @NotNull
    GenericAttributeValue<String> getIntentParameterAttr();

    @Attribute("required")
    @NotNull
    GenericAttributeValue<Required> getRequiredAttr();

    @Attribute("entityMatchRequired")
    @NotNull
    GenericAttributeValue<EntityMatchRequired> getEntityMatchRequiredAttr();

    @Required
    @NotNull
    GenericAttributeValue<String> getUrlParameter();

    @Required
    @NotNull
    GenericAttributeValue<String> getIntentParameter();

    @NotNull
    GenericAttributeValue<Required> getRequired();

    @NotNull
    GenericAttributeValue<EntityMatchRequired> getEntityMatchRequired();
}
