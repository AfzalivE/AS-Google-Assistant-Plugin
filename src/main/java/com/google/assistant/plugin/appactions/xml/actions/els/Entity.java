package com.google.assistant.plugin.appactions.xml.actions.els;

import com.intellij.util.xml.Attribute;
import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.GenericAttributeValue;
import com.intellij.util.xml.JavaNameStrategy;
import com.intellij.util.xml.NameStrategy;
import com.intellij.util.xml.Required;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Entity.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\bg\u0018��2\u00020\u0001R\u001a\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u001a\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006R\u001a\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0006R\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0006R\u001a\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0006¨\u0006\u0017"}, d2 = {"Lcom/google/assistant/plugin/appactions/xml/actions/els/Entity;", "Lcom/intellij/util/xml/DomElement;", "alternateName", "Lcom/intellij/util/xml/GenericAttributeValue;", "", "getAlternateName", "()Lcom/intellij/util/xml/GenericAttributeValue;", "alternateNameAttr", "getAlternateNameAttr", "identifier", "getIdentifier", "identifierAttr", "getIdentifierAttr", "name", "getName", "nameAttr", "getNameAttr", "sameAs", "getSameAs", "sameAsAttr", "getSameAsAttr", "url", "getUrl", "app-actions-test-tool-kotlin"})
@NameStrategy(JavaNameStrategy.class)
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/xml/actions/els/Entity.class */
public interface Entity extends DomElement {
    @Attribute("identifier")
    @NotNull
    GenericAttributeValue<String> getIdentifierAttr();

    @Required
    @Attribute("name")
    @NotNull
    GenericAttributeValue<String> getNameAttr();

    @Attribute("alternateName")
    @NotNull
    GenericAttributeValue<String> getAlternateNameAttr();

    @Attribute("sameAs")
    @NotNull
    GenericAttributeValue<String> getSameAsAttr();

    @NotNull
    GenericAttributeValue<String> getUrl();

    @NotNull
    GenericAttributeValue<String> getIdentifier();

    @NotNull
    GenericAttributeValue<String> getName();

    @NotNull
    GenericAttributeValue<String> getAlternateName();

    @NotNull
    GenericAttributeValue<String> getSameAs();
}
