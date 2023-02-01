package com.google.assistant.plugin.appactions.xml.shortcuts.els.capability;

import com.google.assistant.plugin.appactions.Constants;
import com.intellij.util.xml.Attribute;
import com.intellij.util.xml.Required;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.android.dom.AndroidAttributeValue;
import org.jetbrains.android.dom.AndroidDomElement;
import org.jetbrains.annotations.NotNull;

/* compiled from: Parameter.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018��2\u00020\u0001J\b\u0010\u0014\u001a\u00020\u0011H&R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/google/assistant/plugin/appactions/xml/shortcuts/els/capability/Parameter;", "Lorg/jetbrains/android/dom/AndroidDomElement;", "androidKey", "Lorg/jetbrains/android/dom/AndroidAttributeValue;", "", "getAndroidKey", "()Lorg/jetbrains/android/dom/AndroidAttributeValue;", "androidMimeType", "getAndroidMimeType", "androidName", "getAndroidName", "androidRequired", "getAndroidRequired", "appShortcutMatchRequired", "getAppShortcutMatchRequired", "datas", "", "Lcom/google/assistant/plugin/appactions/xml/shortcuts/els/capability/Data;", "getDatas", "()Ljava/util/List;", "addData", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/xml/shortcuts/els/capability/Parameter.class */
public interface Parameter extends AndroidDomElement {
    @NotNull
    List<Data> getDatas();

    @NotNull
    Data addData();

    @Required
    @Attribute(Constants.ANDROID_NAME_ATTRIBUTE)
    @NotNull
    AndroidAttributeValue<String> getAndroidName();

    @Required
    @Attribute(Constants.ANDROID_KEY_ATTRIBUTE)
    @NotNull
    AndroidAttributeValue<String> getAndroidKey();

    @Attribute("android:mimeType")
    @NotNull
    AndroidAttributeValue<String> getAndroidMimeType();

    @Attribute(Constants.ANDROID_REQUIRED_ATTRIBUTE)
    @NotNull
    AndroidAttributeValue<String> getAndroidRequired();

    @Attribute("app:shortcutMatchRequired")
    @NotNull
    AndroidAttributeValue<String> getAppShortcutMatchRequired();
}
