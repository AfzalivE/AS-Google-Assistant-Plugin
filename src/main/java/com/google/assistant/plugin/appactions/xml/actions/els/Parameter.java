package com.google.assistant.plugin.appactions.xml.actions.els;

import com.intellij.util.xml.Attribute;
import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.GenericAttributeValue;
import com.intellij.util.xml.Required;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Parameter.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018��2\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00078gX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00078gX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00078gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/google/assistant/plugin/appactions/xml/actions/els/Parameter;", "Lcom/intellij/util/xml/DomElement;", "entitySetReference", "Lcom/google/assistant/plugin/appactions/xml/actions/els/EntitySetReference;", "getEntitySetReference", "()Lcom/google/assistant/plugin/appactions/xml/actions/els/EntitySetReference;", "name", "Lcom/intellij/util/xml/GenericAttributeValue;", "", "getName", "()Lcom/intellij/util/xml/GenericAttributeValue;", "nameAttr", "getNameAttr", "typeAttr", "Lcom/google/assistant/plugin/appactions/xml/actions/els/ParameterSchemaType;", "getTypeAttr", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/xml/actions/els/Parameter.class */
public interface Parameter extends DomElement {
    @Required
    @Attribute("name")
    @NotNull
    GenericAttributeValue<String> getNameAttr();

    @Required
    @NotNull
    EntitySetReference getEntitySetReference();

    @Required
    @NotNull
    GenericAttributeValue<String> getName();

    @Attribute("type")
    @NotNull
    GenericAttributeValue<ParameterSchemaType> getTypeAttr();
}
