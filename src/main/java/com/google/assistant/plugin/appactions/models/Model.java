package com.google.assistant.plugin.appactions.models;

import actions.Plugin;
import com.google.assistant.plugin.appactions.Constants;
import com.google.assistant.plugin.appactions.state.AndroidAppState;
import com.google.assistant.plugin.appactions.state.DeviceProperties;
import com.intellij.openapi.project.Project;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Model.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��N\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018��2\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u00107\u001a\u000208J\u000e\u00109\u001a\u0002082\u0006\u0010\u000f\u001a\u00020\u000bJ\u001e\u0010:\u001a\u0002082\f\u0010.\u001a\b\u0012\u0004\u0012\u00020#0/2\b\u0010\f\u001a\u0004\u0018\u00010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n��\u001a\u0004\b\b\u0010\tR\"\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b@BX\u0086\u000e¢\u0006\b\n��\u001a\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b@BX\u0086\u000e¢\u0006\b\n��\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R \u0010.\u001a\b\u0012\u0004\u0012\u00020#0/X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001c\u00104\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b5\u0010\u000e\"\u0004\b6\u0010\u0014¨\u0006;"}, d2 = {"Lcom/google/assistant/plugin/appactions/models/Model;", "", "project", "Lcom/intellij/openapi/project/Project;", "(Lcom/intellij/openapi/project/Project;)V", "androidAppsArrayList", "Ljava/util/ArrayList;", "Lcom/google/assistant/plugin/appactions/state/AndroidAppState;", "getAndroidAppsArrayList", "()Ljava/util/ArrayList;", "<set-?>", "", "assistantLink", "getAssistantLink", "()Ljava/lang/String;", "invocationName", "getInvocationName", "locale", "getLocale", "setLocale", "(Ljava/lang/String;)V", "getProject", "()Lcom/intellij/openapi/project/Project;", "selectedAndroidAppState", "getSelectedAndroidAppState", "()Lcom/google/assistant/plugin/appactions/state/AndroidAppState;", "setSelectedAndroidAppState", "(Lcom/google/assistant/plugin/appactions/state/AndroidAppState;)V", "selectedDevice", "Lcom/google/assistant/plugin/appactions/state/DeviceProperties;", "getSelectedDevice", "()Lcom/google/assistant/plugin/appactions/state/DeviceProperties;", "setSelectedDevice", "(Lcom/google/assistant/plugin/appactions/state/DeviceProperties;)V", "selectedIntent", "Lplugin/actions/Plugin$AndroidActionPackageResponse$SupportedIntent;", "getSelectedIntent", "()Lplugin/actions/Plugin$AndroidActionPackageResponse$SupportedIntent;", "setSelectedIntent", "(Lplugin/actions/Plugin$AndroidActionPackageResponse$SupportedIntent;)V", "state", "Lcom/google/assistant/plugin/appactions/models/PluginState;", "getState", "()Lcom/google/assistant/plugin/appactions/models/PluginState;", "setState", "(Lcom/google/assistant/plugin/appactions/models/PluginState;)V", "supportedIntents", "", "getSupportedIntents", "()Ljava/util/List;", "setSupportedIntents", "(Ljava/util/List;)V", "urlSuffix", "getUrlSuffix", "setUrlSuffix", "clearPreview", "", "setInvocationName", "setPreview", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/models/Model.class */
public final class Model {
    @NotNull
    private PluginState state;
    @Nullable
    private Plugin.AndroidActionPackageResponse.SupportedIntent selectedIntent;
    @Nullable
    private DeviceProperties selectedDevice;
    @Nullable
    private String assistantLink;
    @Nullable
    private String invocationName;
    @Nullable
    private String urlSuffix;
    @NotNull
    private List<Plugin.AndroidActionPackageResponse.SupportedIntent> supportedIntents;
    @NotNull
    private String locale;
    @Nullable
    private AndroidAppState selectedAndroidAppState;
    @NotNull
    private final ArrayList<AndroidAppState> androidAppsArrayList;
    @NotNull
    private final Project project;

    @NotNull
    public final Project getProject() {
        return this.project;
    }

    public Model(@NotNull Project project) {
        Intrinsics.checkNotNullParameter(project, "project");
        this.project = project;
        this.state = PluginState.WELCOME_PAGE;
        this.supportedIntents = new ArrayList();
        this.locale = Constants.DEFAULT_LOCALE;
        this.androidAppsArrayList = new ArrayList<>();
    }

    @NotNull
    public final PluginState getState() {
        return this.state;
    }

    public final void setState(@NotNull PluginState pluginState) {
        Intrinsics.checkNotNullParameter(pluginState, "<set-?>");
        this.state = pluginState;
    }

    @Nullable
    public final Plugin.AndroidActionPackageResponse.SupportedIntent getSelectedIntent() {
        return this.selectedIntent;
    }

    public final void setSelectedIntent(@Nullable Plugin.AndroidActionPackageResponse.SupportedIntent supportedIntent) {
        this.selectedIntent = supportedIntent;
    }

    @Nullable
    public final DeviceProperties getSelectedDevice() {
        return this.selectedDevice;
    }

    public final void setSelectedDevice(@Nullable DeviceProperties deviceProperties) {
        this.selectedDevice = deviceProperties;
    }

    @Nullable
    public final String getAssistantLink() {
        return this.assistantLink;
    }

    @Nullable
    public final String getInvocationName() {
        return this.invocationName;
    }

    @Nullable
    public final String getUrlSuffix() {
        return this.urlSuffix;
    }

    public final void setUrlSuffix(@Nullable String str) {
        this.urlSuffix = str;
    }

    @NotNull
    public final List<Plugin.AndroidActionPackageResponse.SupportedIntent> getSupportedIntents() {
        return this.supportedIntents;
    }

    public final void setSupportedIntents(@NotNull List<Plugin.AndroidActionPackageResponse.SupportedIntent> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.supportedIntents = list;
    }

    @NotNull
    public final String getLocale() {
        return this.locale;
    }

    public final void setLocale(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.locale = str;
    }

    @Nullable
    public final AndroidAppState getSelectedAndroidAppState() {
        return this.selectedAndroidAppState;
    }

    public final void setSelectedAndroidAppState(@Nullable AndroidAppState androidAppState) {
        this.selectedAndroidAppState = androidAppState;
    }

    @NotNull
    public final ArrayList<AndroidAppState> getAndroidAppsArrayList() {
        return this.androidAppsArrayList;
    }

    public final void setInvocationName(@NotNull String invocationName) {
        Intrinsics.checkNotNullParameter(invocationName, "invocationName");
        this.invocationName = Intrinsics.areEqual(invocationName, "") ? Constants.DEFAULT_INVOCATION_NAME : invocationName;
    }

    public final void clearPreview() {
        this.assistantLink = null;
        this.selectedIntent = null;
        this.urlSuffix = null;
        this.supportedIntents = new ArrayList();
    }

    public final void setPreview(@NotNull List<Plugin.AndroidActionPackageResponse.SupportedIntent> list, @Nullable String assistantLink) {
        Intrinsics.checkNotNullParameter(list, "supportedIntents");
        this.supportedIntents = list;
        this.assistantLink = assistantLink;
    }
}
