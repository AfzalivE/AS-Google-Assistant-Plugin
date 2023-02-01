package com.google.assistant.plugin.appactions.extensions;

import com.google.assistant.plugin.appactions.Constants;
import com.intellij.ide.BrowserUtil;
import com.intellij.ide.plugins.IdeaPluginDescriptor;
import com.intellij.ide.plugins.PluginManagerCore;
import com.intellij.openapi.application.ApplicationInfo;
import com.intellij.openapi.diagnostic.ErrorReportSubmitter;
import com.intellij.openapi.diagnostic.IdeaLoggingEvent;
import com.intellij.openapi.diagnostic.SubmittedReportInfo;
import com.intellij.openapi.extensions.PluginId;
import com.intellij.util.Consumer;
import java.awt.Component;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AppActionsErrorReporter.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��6\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n��\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018��2\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u0004H\u0016J=\u0010\u000b\u001a\u00020\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/google/assistant/plugin/appactions/extensions/AppActionsErrorReporter;", "Lcom/intellij/openapi/diagnostic/ErrorReportSubmitter;", "()V", "getDescription", "", "events", "", "Lcom/intellij/openapi/diagnostic/IdeaLoggingEvent;", "additionalInfo", "([Lcom/intellij/openapi/diagnostic/IdeaLoggingEvent;Ljava/lang/String;)Ljava/lang/String;", "getReportActionText", "submit", "", "parentComponent", "Ljava/awt/Component;", "consumer", "Lcom/intellij/util/Consumer;", "Lcom/intellij/openapi/diagnostic/SubmittedReportInfo;", "([Lcom/intellij/openapi/diagnostic/IdeaLoggingEvent;Ljava/lang/String;Ljava/awt/Component;Lcom/intellij/util/Consumer;)Z", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/extensions/AppActionsErrorReporter.class */
public final class AppActionsErrorReporter extends ErrorReportSubmitter {
    @NotNull
    public String getReportActionText() {
        return "Report to Google";
    }

    @Override
    public boolean submit(@NotNull IdeaLoggingEvent[] events, @Nullable String additionalInfo, @Nullable Component parentComponent, @NotNull Consumer<? super SubmittedReportInfo> consumer) {
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        HttpUrl publicComponentUri = new HttpUrl.Builder().scheme(Constants.SCHEME).host(Constants.PUBLIC_COMPONENT_HOST).addPathSegments(Constants.PATH).addQueryParameter("component", Constants.APP_ACTIONS_COMPONENT_ID).addQueryParameter("template", Constants.GENERAL_TEMPLATE).addQueryParameter("title", "Google Assistant plugin Crash Report").addQueryParameter("description", getDescription(events, additionalInfo)).build();
        BrowserUtil.browse(publicComponentUri.toString());
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0064, code lost:
        if (r0 != null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String getDescription(IdeaLoggingEvent[] events, String additionalInfo) {
        String str;
        StringBuilder stacktrace = new StringBuilder();
        for (IdeaLoggingEvent ideaLoggingEvent : events) {
            if (ideaLoggingEvent.getMessage() != null) {
                stacktrace.append("Message: ").append(ideaLoggingEvent.getMessage()).append('\n');
            }
            stacktrace.append(ideaLoggingEvent.getThrowableText()).append('\n');
        }
        IdeaPluginDescriptor plugin2 = PluginManagerCore.getPlugin(PluginId.getId(Constants.PLUGIN_ID));
        if (plugin2 != null) {
            str = plugin2.getVersion();
        }
        str = "Unknown";
        String pluginVersion = str;
        StringBuilder sb = new StringBuilder();
        ApplicationInfo applicationInfo = ApplicationInfo.getInstance();
        Intrinsics.checkNotNullExpressionValue(applicationInfo, "ApplicationInfo.getInstance()");
        StringBuilder append = sb.append(applicationInfo.getFullVersion()).append(" (");
        ApplicationInfo applicationInfo2 = ApplicationInfo.getInstance();
        Intrinsics.checkNotNullExpressionValue(applicationInfo2, "ApplicationInfo.getInstance()");
        String androidVersion = append.append(applicationInfo2.getBuild()).append(")").toString();
        StringBuilder append2 = new StringBuilder().append("\n            |#### Runtime\n            |* **AATT version:** ").append(pluginVersion).append("\n            |* **Android version:** ").append(androidVersion).append("\n            |* **Additional info:** ");
        String str2 = additionalInfo;
        if (str2 == null) {
            str2 = "N/A";
        }
        return StringsKt.trimMargin(append2.append(str2).append("\n            |#### Stacktrace\n            |```\n            |").append((Object) stacktrace).append("\n            |```\n            |").toString(), null);
    }
}
