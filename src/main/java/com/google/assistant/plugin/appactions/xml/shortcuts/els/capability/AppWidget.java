package com.google.assistant.plugin.appactions.xml.shortcuts.els.capability;

import com.google.assistant.plugin.appactions.Constants;
import com.intellij.util.xml.Attribute;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.android.dom.AndroidAttributeValue;
import org.jetbrains.android.dom.AndroidDomElement;
import org.jetbrains.annotations.NotNull;

/* compiled from: AppWidget.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018��2\u00020\u0001J\b\u0010\u0011\u001a\u00020\u000bH&J\b\u0010\u0012\u001a\u00020\u000fH&R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/google/assistant/plugin/appactions/xml/shortcuts/els/capability/AppWidget;", "Lorg/jetbrains/android/dom/AndroidDomElement;", "androidIdentifier", "Lorg/jetbrains/android/dom/AndroidAttributeValue;", "", "getAndroidIdentifier", "()Lorg/jetbrains/android/dom/AndroidAttributeValue;", "androidTargetClass", "getAndroidTargetClass", "extras", "", "Lcom/google/assistant/plugin/appactions/xml/shortcuts/els/capability/CapabilityExtra;", "getExtras", "()Ljava/util/List;", "parameters", "Lcom/google/assistant/plugin/appactions/xml/shortcuts/els/capability/Parameter;", "getParameters", "addExtra", "addParameter", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/xml/shortcuts/els/capability/AppWidget.class */
public interface AppWidget extends AndroidDomElement {
    @NotNull
    List<Parameter> getParameters();

    @NotNull
    Parameter addParameter();

    @NotNull
    List<CapabilityExtra> getExtras();

    @NotNull
    CapabilityExtra addExtra();

    @Attribute("android:identifier")
    @NotNull
    AndroidAttributeValue<String> getAndroidIdentifier();

    @Attribute(Constants.ANDROID_TARGET_CLASS_ATTRIBUTE)
    @NotNull
    AndroidAttributeValue<String> getAndroidTargetClass();
}
