package com.google.assistant.plugin.common.utils;

import java.awt.Desktop;
import java.net.URI;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: BrowserUtils.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��\u0018\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0010\u0002\n��\n\u0002\u0010\u000e\n��\bÆ\u0002\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/google/assistant/plugin/common/utils/BrowserUtils;", "", "()V", "openUrl", "", "url", "", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/common/utils/BrowserUtils.class */
public final class BrowserUtils {
    @NotNull
    public static final BrowserUtils INSTANCE = new BrowserUtils();

    private BrowserUtils() {
    }

    public final void openUrl(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            Desktop.getDesktop().browse(URI.create(url));
        } catch (Exception e) {
            LoggingUtils.INSTANCE.error("Can't browse url: " + url, e);
        }
    }
}
