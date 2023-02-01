package com.google.assistant.plugin.appactions.xml.shortcuts.els.shortcut;

import com.google.assistant.plugin.appactions.Constants;
import com.intellij.util.xml.Attribute;
import com.intellij.util.xml.Required;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.android.dom.AndroidAttributeValue;
import org.jetbrains.android.dom.AndroidDomElement;
import org.jetbrains.annotations.NotNull;

/* compiled from: CapabilityBinding.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018��2\u00020\u0001J\b\u0010\f\u001a\u00020\tH&R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/google/assistant/plugin/appactions/xml/shortcuts/els/shortcut/CapabilityBinding;", "Lorg/jetbrains/android/dom/AndroidDomElement;", "androidKey", "Lorg/jetbrains/android/dom/AndroidAttributeValue;", "", "getAndroidKey", "()Lorg/jetbrains/android/dom/AndroidAttributeValue;", "parameterBindings", "", "Lcom/google/assistant/plugin/appactions/xml/shortcuts/els/shortcut/ParameterBinding;", "getParameterBindings", "()Ljava/util/List;", "addParameterBinding", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/xml/shortcuts/els/shortcut/CapabilityBinding.class */
public interface CapabilityBinding extends AndroidDomElement {
    @NotNull
    List<ParameterBinding> getParameterBindings();

    @NotNull
    ParameterBinding addParameterBinding();

    @Required
    @Attribute(Constants.ANDROID_KEY_ATTRIBUTE)
    @NotNull
    AndroidAttributeValue<String> getAndroidKey();
}
