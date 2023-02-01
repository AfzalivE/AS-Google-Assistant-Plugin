package com.google.assistant.plugin.appactions.xml.actions.els;

import com.intellij.util.xml.Attribute;
import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.ElementPresentation;
import com.intellij.util.xml.GenericAttributeValue;
import com.intellij.util.xml.JavaNameStrategy;
import com.intellij.util.xml.NameStrategy;
import com.intellij.util.xml.Required;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Action.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��8\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n��\bg\u0018��2\u00020\u0001J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0004H&J\n\u0010\u0013\u001a\u0004\u0018\u00010\rH&J\b\u0010\u0014\u001a\u00020\u0015H&R\u001c\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\b8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/google/assistant/plugin/appactions/xml/actions/els/Action;", "Lcom/intellij/util/xml/DomElement;", "fulfillments", "", "Lcom/google/assistant/plugin/appactions/xml/actions/els/Fulfillment;", "getFulfillments", "()Ljava/util/List;", "intentName", "Lcom/intellij/util/xml/GenericAttributeValue;", "Lcom/google/assistant/plugin/appactions/xml/actions/els/IntentName;", "getIntentName", "()Lcom/intellij/util/xml/GenericAttributeValue;", "parameters", "Lcom/google/assistant/plugin/appactions/xml/actions/els/Parameter;", "getParameters", "queryPatternsAttr", "", "getQueryPatternsAttr", "addFulfillment", "addParameter", "getPresentation", "Lcom/intellij/util/xml/ElementPresentation;", "app-actions-test-tool-kotlin"})
@NameStrategy(JavaNameStrategy.class)
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/xml/actions/els/Action.class */
public interface Action extends DomElement {
    @Required
    @NotNull
    List<Fulfillment> getFulfillments();

    @Nullable
    Fulfillment addFulfillment();

    @NotNull
    List<Parameter> getParameters();

    @Nullable
    Parameter addParameter();

    @Required
    @Attribute("intentName")
    @NotNull
    GenericAttributeValue<IntentName> getIntentName();

    @NotNull
    ElementPresentation getPresentation();

    @Attribute("queryPatterns")
    @NotNull
    GenericAttributeValue<String> getQueryPatternsAttr();
}
