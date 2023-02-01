package com.google.assistant.plugin.appactions.xml.shortcuts.els.capability;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.android.dom.AndroidDomElement;
import org.jetbrains.annotations.NotNull;

/* compiled from: ShortcutFulfillment.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\bf\u0018��2\u00020\u0001J\b\u0010\u0007\u001a\u00020\bH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/google/assistant/plugin/appactions/xml/shortcuts/els/capability/ShortcutFulfillment;", "Lorg/jetbrains/android/dom/AndroidDomElement;", "parameters", "", "Lcom/google/assistant/plugin/appactions/xml/shortcuts/els/capability/ShortcutFulfilmentParameter;", "getParameters", "()Ljava/util/List;", "addParameter", "Lcom/google/assistant/plugin/appactions/xml/shortcuts/els/capability/Parameter;", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/xml/shortcuts/els/capability/ShortcutFulfillment.class */
public interface ShortcutFulfillment extends AndroidDomElement {
    @NotNull
    List<ShortcutFulfilmentParameter> getParameters();

    @NotNull
    Parameter addParameter();
}
