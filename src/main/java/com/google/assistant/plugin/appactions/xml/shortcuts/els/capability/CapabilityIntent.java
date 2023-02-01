package com.google.assistant.plugin.appactions.xml.shortcuts.els.capability;

import com.google.assistant.plugin.appactions.Constants;
import com.intellij.util.xml.Attribute;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.android.dom.AndroidAttributeValue;
import org.jetbrains.android.dom.AndroidDomElement;
import org.jetbrains.annotations.NotNull;

/* compiled from: CapabilityIntent.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��2\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018��2\u00020\u0001J\b\u0010\u0018\u001a\u00020\u000fH&J\b\u0010\u0019\u001a\u00020\u0013H&J\b\u0010\u001a\u001a\u00020\u0016H&R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0011R\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/google/assistant/plugin/appactions/xml/shortcuts/els/capability/CapabilityIntent;", "Lorg/jetbrains/android/dom/AndroidDomElement;", "androidAction", "Lorg/jetbrains/android/dom/AndroidAttributeValue;", "", "getAndroidAction", "()Lorg/jetbrains/android/dom/AndroidAttributeValue;", "androidData", "getAndroidData", "androidTargetClass", "getAndroidTargetClass", "androidTargetPackage", "getAndroidTargetPackage", "extras", "", "Lcom/google/assistant/plugin/appactions/xml/shortcuts/els/capability/CapabilityExtra;", "getExtras", "()Ljava/util/List;", "parameters", "Lcom/google/assistant/plugin/appactions/xml/shortcuts/els/capability/Parameter;", "getParameters", "urlTemplates", "Lcom/google/assistant/plugin/appactions/xml/shortcuts/els/capability/UrlTemplate;", "getUrlTemplates", "addExtra", "addParameter", "addUrlTemplate", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/xml/shortcuts/els/capability/CapabilityIntent.class */
public interface CapabilityIntent extends AndroidDomElement {
    @NotNull
    List<UrlTemplate> getUrlTemplates();

    @NotNull
    UrlTemplate addUrlTemplate();

    @NotNull
    List<CapabilityExtra> getExtras();

    @NotNull
    CapabilityExtra addExtra();

    @NotNull
    List<Parameter> getParameters();

    @NotNull
    Parameter addParameter();

    @Attribute("android:action")
    @NotNull
    AndroidAttributeValue<String> getAndroidAction();

    @Attribute(Constants.ANDROID_TARGET_CLASS_ATTRIBUTE)
    @NotNull
    AndroidAttributeValue<String> getAndroidTargetClass();

    @Attribute("android:targetPackage")
    @NotNull
    AndroidAttributeValue<String> getAndroidTargetPackage();

    @Attribute("android:data")
    @NotNull
    AndroidAttributeValue<String> getAndroidData();
}
