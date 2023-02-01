package com.google.assistant.plugin.appactions.xml.actions.els;

import com.intellij.util.xml.Attribute;
import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.GenericAttributeValue;
import com.intellij.util.xml.Required;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EntitySet.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018��2\u00020\u0001J\n\u0010\u000e\u001a\u0004\u0018\u00010\u0004H&R\u001c\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/google/assistant/plugin/appactions/xml/actions/els/EntitySet;", "Lcom/intellij/util/xml/DomElement;", "entities", "", "Lcom/google/assistant/plugin/appactions/xml/actions/els/Entity;", "getEntities", "()Ljava/util/List;", "entitySetId", "Lcom/intellij/util/xml/GenericAttributeValue;", "", "getEntitySetId", "()Lcom/intellij/util/xml/GenericAttributeValue;", "entitySetIdAttr", "getEntitySetIdAttr", "addEntity", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/xml/actions/els/EntitySet.class */
public interface EntitySet extends DomElement {
    @Required
    @Attribute("entitySetId")
    @NotNull
    GenericAttributeValue<String> getEntitySetIdAttr();

    @Required
    @NotNull
    List<Entity> getEntities();

    @Nullable
    Entity addEntity();

    @NotNull
    GenericAttributeValue<String> getEntitySetId();
}
