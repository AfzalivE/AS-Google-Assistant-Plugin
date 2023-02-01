package com.google.assistant.plugin.appactions.xml.shortcuts.els.capability;

import com.google.assistant.plugin.appactions.Constants;
import com.intellij.util.xml.Attribute;
import com.intellij.util.xml.Required;
import kotlin.Metadata;
import org.jetbrains.android.dom.AndroidAttributeValue;
import org.jetbrains.android.dom.AndroidDomElement;
import org.jetbrains.annotations.NotNull;

/* compiled from: UrlTemplate.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018��2\u00020\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/google/assistant/plugin/appactions/xml/shortcuts/els/capability/UrlTemplate;", "Lorg/jetbrains/android/dom/AndroidDomElement;", "androidValue", "Lorg/jetbrains/android/dom/AndroidAttributeValue;", "", "getAndroidValue", "()Lorg/jetbrains/android/dom/AndroidAttributeValue;", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/xml/shortcuts/els/capability/UrlTemplate.class */
public interface UrlTemplate extends AndroidDomElement {
    @Required
    @Attribute(Constants.ANDROID_VALUE_ATTRIBUTE)
    @NotNull
    AndroidAttributeValue<String> getAndroidValue();
}
