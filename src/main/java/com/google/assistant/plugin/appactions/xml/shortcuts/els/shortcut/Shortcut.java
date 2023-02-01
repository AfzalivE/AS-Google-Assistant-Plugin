package com.google.assistant.plugin.appactions.xml.shortcuts.els.shortcut;

import com.intellij.util.xml.Attribute;
import com.intellij.util.xml.Required;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.android.dom.AndroidAttributeValue;
import org.jetbrains.android.dom.AndroidDomElement;
import org.jetbrains.annotations.NotNull;

/* compiled from: Shortcut.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��2\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018��2\u00020\u0001J\b\u0010\u001a\u001a\u00020\u0011H&J\b\u0010\u001b\u001a\u00020\u0015H&J\b\u0010\u001c\u001a\u00020\u0018H&R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013R\u0018\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0013¨\u0006\u001d"}, d2 = {"Lcom/google/assistant/plugin/appactions/xml/shortcuts/els/shortcut/Shortcut;", "Lorg/jetbrains/android/dom/AndroidDomElement;", "androidEnabled", "Lorg/jetbrains/android/dom/AndroidAttributeValue;", "", "getAndroidEnabled", "()Lorg/jetbrains/android/dom/AndroidAttributeValue;", "androidIcon", "getAndroidIcon", "androidShortcutId", "getAndroidShortcutId", "androidShortcutLongLabel", "getAndroidShortcutLongLabel", "androidShortcutShortLabel", "getAndroidShortcutShortLabel", "capabilityBindings", "", "Lcom/google/assistant/plugin/appactions/xml/shortcuts/els/shortcut/CapabilityBinding;", "getCapabilityBindings", "()Ljava/util/List;", "extras", "Lcom/google/assistant/plugin/appactions/xml/shortcuts/els/shortcut/ShortcutExtra;", "getExtras", "intents", "Lcom/google/assistant/plugin/appactions/xml/shortcuts/els/shortcut/ShortcutIntent;", "getIntents", "addCapabilityBinding", "addExtra", "addIntent", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/xml/shortcuts/els/shortcut/Shortcut.class */
public interface Shortcut extends AndroidDomElement {
    @NotNull
    List<ShortcutIntent> getIntents();

    @NotNull
    ShortcutIntent addIntent();

    @NotNull
    List<CapabilityBinding> getCapabilityBindings();

    @NotNull
    CapabilityBinding addCapabilityBinding();

    @NotNull
    List<ShortcutExtra> getExtras();

    @NotNull
    ShortcutExtra addExtra();

    @Required
    @Attribute("android:shortcutId")
    @NotNull
    AndroidAttributeValue<String> getAndroidShortcutId();

    @Required
    @Attribute("android:shortcutShortLabel")
    @NotNull
    AndroidAttributeValue<String> getAndroidShortcutShortLabel();

    @Attribute("android:shortcutLongLabel")
    @NotNull
    AndroidAttributeValue<String> getAndroidShortcutLongLabel();

    @Attribute("android:icon")
    @NotNull
    AndroidAttributeValue<String> getAndroidIcon();

    @Attribute("android:enabled")
    @NotNull
    AndroidAttributeValue<String> getAndroidEnabled();
}
