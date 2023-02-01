package com.google.assistant.plugin.appactions.xml.shortcuts.els;

import com.google.assistant.plugin.appactions.Constants;
import com.google.assistant.plugin.appactions.xml.shortcuts.els.capability.Capability;
import com.google.assistant.plugin.appactions.xml.shortcuts.els.shortcut.Shortcut;
import com.intellij.util.xml.DefinesXml;
import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.Required;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Shortcuts.kt */
@DefinesXml
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018��2\u00020\u0001J\b\u0010\n\u001a\u00020\u0004H&J\b\u0010\u000b\u001a\u00020\bH&R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/google/assistant/plugin/appactions/xml/shortcuts/els/Shortcuts;", "Lcom/intellij/util/xml/DomElement;", "capabilities", "", "Lcom/google/assistant/plugin/appactions/xml/shortcuts/els/capability/Capability;", "getCapabilities", "()Ljava/util/List;", Constants.SHORTCUTS_XML_ROOT_TAG, "Lcom/google/assistant/plugin/appactions/xml/shortcuts/els/shortcut/Shortcut;", "getShortcuts", "addCapability", "addShortcut", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/xml/shortcuts/els/Shortcuts.class */
public interface Shortcuts extends DomElement {
    @Required
    @NotNull
    List<Capability> getCapabilities();

    @NotNull
    Capability addCapability();

    @NotNull
    List<Shortcut> getShortcuts();

    @NotNull
    Shortcut addShortcut();
}
