package com.google.assistant.plugin.appactions.xml.actions.els;

import com.intellij.util.xml.Attribute;
import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.GenericAttributeValue;
import com.intellij.util.xml.HyphenNameStrategy;
import com.intellij.util.xml.JavaNameStrategy;
import com.intellij.util.xml.NameStrategy;
import com.intellij.util.xml.NameStrategyForAttributes;
import com.intellij.util.xml.Required;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Fulfillment.kt */
@NameStrategyForAttributes(JavaNameStrategy.class)
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\bg\u0018��2\u00020\u0001J\n\u0010\u0015\u001a\u0004\u0018\u00010\u000bH&R\u001a\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006R\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0006R\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0006¨\u0006\u0016"}, d2 = {"Lcom/google/assistant/plugin/appactions/xml/actions/els/Fulfillment;", "Lcom/intellij/util/xml/DomElement;", "fulfillmentMode", "Lcom/intellij/util/xml/GenericAttributeValue;", "Lcom/google/assistant/plugin/appactions/xml/actions/els/FulfillmentMode;", "getFulfillmentMode", "()Lcom/intellij/util/xml/GenericAttributeValue;", "fulfillmentModeAttr", "getFulfillmentModeAttr", "parameterMappings", "", "Lcom/google/assistant/plugin/appactions/xml/actions/els/ParameterMapping;", "getParameterMappings", "()Ljava/util/List;", "requiredForegroundActivity", "", "getRequiredForegroundActivity", "urlTemplate", "getUrlTemplate", "urlTemplateAttr", "getUrlTemplateAttr", "addParameterMapping", "app-actions-test-tool-kotlin"})
@NameStrategy(HyphenNameStrategy.class)
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/xml/actions/els/Fulfillment.class */
public interface Fulfillment extends DomElement {
    @Required
    @Attribute("urlTemplate")
    @NotNull
    GenericAttributeValue<String> getUrlTemplateAttr();

    @Attribute("fulfillmentMode")
    @NotNull
    GenericAttributeValue<FulfillmentMode> getFulfillmentModeAttr();

    @NotNull
    GenericAttributeValue<String> getRequiredForegroundActivity();

    @NotNull
    List<ParameterMapping> getParameterMappings();

    @Nullable
    ParameterMapping addParameterMapping();

    @Required
    @NotNull
    GenericAttributeValue<String> getUrlTemplate();

    @NotNull
    GenericAttributeValue<FulfillmentMode> getFulfillmentMode();
}
