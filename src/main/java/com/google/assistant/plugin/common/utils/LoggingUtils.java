package com.google.assistant.plugin.common.utils;

import com.intellij.ide.plugins.PluginManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LoggingUtils.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"�� \n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0010\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010\u0003\n\u0002\b\u0002\bÆ\u0002\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\n"}, d2 = {"Lcom/google/assistant/plugin/common/utils/LoggingUtils;", "", "()V", "error", "", "message", "", "e", "", "info", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/common/utils/LoggingUtils.class */
public final class LoggingUtils {
    @NotNull
    public static final LoggingUtils INSTANCE = new LoggingUtils();

    private LoggingUtils() {
    }

    public final void info(@Nullable String message) {
        PluginManager.getLogger().info(message);
    }

    public final void error(@Nullable String message) {
        PluginManager.getLogger().error(message);
    }

    public final void error(@Nullable String message, @Nullable Throwable e) {
        PluginManager.getLogger().error(message, e);
    }
}
