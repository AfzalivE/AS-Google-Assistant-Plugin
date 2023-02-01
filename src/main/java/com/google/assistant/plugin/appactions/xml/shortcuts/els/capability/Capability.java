package com.google.assistant.plugin.appactions.xml.shortcuts.els.capability;

import com.google.assistant.plugin.appactions.Constants;
import com.intellij.util.xml.Attribute;
import com.intellij.util.xml.Required;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.android.dom.AndroidAttributeValue;
import org.jetbrains.android.dom.AndroidDomElement;
import org.jetbrains.annotations.NotNull;

/* compiled from: Capability.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018��2\u00020\u0001J\b\u0010\u0017\u001a\u00020\u000bH&J\b\u0010\u0018\u001a\u00020\u000fH&J\b\u0010\u0019\u001a\u00020\u0012H&J\b\u0010\u001a\u001a\u00020\u0015H&R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\rR\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/google/assistant/plugin/appactions/xml/shortcuts/els/capability/Capability;", "Lorg/jetbrains/android/dom/AndroidDomElement;", "androidName", "Lorg/jetbrains/android/dom/AndroidAttributeValue;", "", "getAndroidName", "()Lorg/jetbrains/android/dom/AndroidAttributeValue;", "appQueryPatterns", "getAppQueryPatterns", "appWidgets", "", "Lcom/google/assistant/plugin/appactions/xml/shortcuts/els/capability/AppWidget;", "getAppWidgets", "()Ljava/util/List;", "intents", "Lcom/google/assistant/plugin/appactions/xml/shortcuts/els/capability/CapabilityIntent;", "getIntents", "shortcutFulfillments", "Lcom/google/assistant/plugin/appactions/xml/shortcuts/els/capability/ShortcutFulfillment;", "getShortcutFulfillments", "slices", "Lcom/google/assistant/plugin/appactions/xml/shortcuts/els/capability/Slice;", "getSlices", "addAppWidget", "addIntent", "addShortcutFulfillment", "addSlice", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/xml/shortcuts/els/capability/Capability.class */
public interface Capability extends AndroidDomElement {
    @NotNull
    List<CapabilityIntent> getIntents();

    @NotNull
    CapabilityIntent addIntent();

    @NotNull
    List<ShortcutFulfillment> getShortcutFulfillments();

    @NotNull
    ShortcutFulfillment addShortcutFulfillment();

    @NotNull
    List<Slice> getSlices();

    @NotNull
    Slice addSlice();

    @NotNull
    List<AppWidget> getAppWidgets();

    @NotNull
    AppWidget addAppWidget();

    @Required
    @Attribute(Constants.ANDROID_NAME_ATTRIBUTE)
    @NotNull
    AndroidAttributeValue<String> getAndroidName();

    @Attribute(Constants.APP_QUERY_PATTERNS_ATTRIBUTE)
    @NotNull
    AndroidAttributeValue<String> getAppQueryPatterns();
}
