package com.google.assistant.plugin.appactions.extensions;

import com.google.assistant.plugin.appactions.Constants;
import java.util.function.Supplier;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: PluginStartupExtension.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 3, d1 = {"��\b\n��\n\u0002\u0010\u000e\n��\u0010��\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "get"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/extensions/PluginStartupExtension$startToolWindow$supplier$1.class */
final class PluginStartupExtension$startToolWindow$supplier$1<T> implements Supplier<String> {
    public static final PluginStartupExtension$startToolWindow$supplier$1 INSTANCE = new PluginStartupExtension$startToolWindow$supplier$1();

    PluginStartupExtension$startToolWindow$supplier$1() {
    }

    @Override // java.util.function.Supplier
    @NotNull
    public final String get() {
        return Constants.TOOLWINDOW_ID;
    }
}
