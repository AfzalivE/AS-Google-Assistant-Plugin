package com.google.assistant.plugin.appactions.ui;

import actions.Plugin;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ConfigStepPanel.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��0\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018��2\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J3\u0010\u0015\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n��\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n��\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/google/assistant/plugin/appactions/ui/ExampleParameter;", "", "name", "", "json", "intent", "Lplugin/actions/Plugin$AndroidActionPackageResponse$SupportedIntent;", "supportedParameter", "Lplugin/actions/Plugin$AndroidActionPackageResponse$SupportedIntent$SupportedParameter;", "(Ljava/lang/String;Ljava/lang/String;Lplugin/actions/Plugin$AndroidActionPackageResponse$SupportedIntent;Lplugin/actions/Plugin$AndroidActionPackageResponse$SupportedIntent$SupportedParameter;)V", "getIntent", "()Lplugin/actions/Plugin$AndroidActionPackageResponse$SupportedIntent;", "getJson", "()Ljava/lang/String;", "getName", "getSupportedParameter", "()Lplugin/actions/Plugin$AndroidActionPackageResponse$SupportedIntent$SupportedParameter;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/ui/ExampleParameter.class */
public final class ExampleParameter {
    @NotNull
    private final String name;
    @NotNull
    private final String json;
    @Nullable
    private final Plugin.AndroidActionPackageResponse.SupportedIntent intent;
    @NotNull
    private final Plugin.AndroidActionPackageResponse.SupportedIntent.SupportedParameter supportedParameter;

    @NotNull
    public final String component1() {
        return this.name;
    }

    @NotNull
    public final String component2() {
        return this.json;
    }

    @Nullable
    public final Plugin.AndroidActionPackageResponse.SupportedIntent component3() {
        return this.intent;
    }

    @NotNull
    public final Plugin.AndroidActionPackageResponse.SupportedIntent.SupportedParameter component4() {
        return this.supportedParameter;
    }

    @NotNull
    public final ExampleParameter copy(@NotNull String name, @NotNull String json, @Nullable Plugin.AndroidActionPackageResponse.SupportedIntent intent, @NotNull Plugin.AndroidActionPackageResponse.SupportedIntent.SupportedParameter supportedParameter) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(supportedParameter, "supportedParameter");
        return new ExampleParameter(name, json, intent, supportedParameter);
    }

    public static /* synthetic */ ExampleParameter copy$default(ExampleParameter exampleParameter, String str, String str2, Plugin.AndroidActionPackageResponse.SupportedIntent supportedIntent, Plugin.AndroidActionPackageResponse.SupportedIntent.SupportedParameter supportedParameter, int i, Object obj) {
        if ((i & 1) != 0) {
            str = exampleParameter.name;
        }
        if ((i & 2) != 0) {
            str2 = exampleParameter.json;
        }
        if ((i & 4) != 0) {
            supportedIntent = exampleParameter.intent;
        }
        if ((i & 8) != 0) {
            supportedParameter = exampleParameter.supportedParameter;
        }
        return exampleParameter.copy(str, str2, supportedIntent, supportedParameter);
    }

    @NotNull
    public String toString() {
        return "ExampleParameter(name=" + this.name + ", json=" + this.json + ", intent=" + this.intent + ", supportedParameter=" + this.supportedParameter + ")";
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.json;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Plugin.AndroidActionPackageResponse.SupportedIntent supportedIntent = this.intent;
        int hashCode3 = (hashCode2 + (supportedIntent != null ? supportedIntent.hashCode() : 0)) * 31;
        Plugin.AndroidActionPackageResponse.SupportedIntent.SupportedParameter supportedParameter = this.supportedParameter;
        return hashCode3 + (supportedParameter != null ? supportedParameter.hashCode() : 0);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof ExampleParameter) {
                ExampleParameter exampleParameter = (ExampleParameter) obj;
                return Intrinsics.areEqual(this.name, exampleParameter.name) && Intrinsics.areEqual(this.json, exampleParameter.json) && Intrinsics.areEqual(this.intent, exampleParameter.intent) && Intrinsics.areEqual(this.supportedParameter, exampleParameter.supportedParameter);
            }
            return false;
        }
        return true;
    }

    public ExampleParameter(@NotNull String name, @NotNull String json, @Nullable Plugin.AndroidActionPackageResponse.SupportedIntent intent, @NotNull Plugin.AndroidActionPackageResponse.SupportedIntent.SupportedParameter supportedParameter) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(supportedParameter, "supportedParameter");
        this.name = name;
        this.json = json;
        this.intent = intent;
        this.supportedParameter = supportedParameter;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getJson() {
        return this.json;
    }

    @Nullable
    public final Plugin.AndroidActionPackageResponse.SupportedIntent getIntent() {
        return this.intent;
    }

    @NotNull
    public final Plugin.AndroidActionPackageResponse.SupportedIntent.SupportedParameter getSupportedParameter() {
        return this.supportedParameter;
    }
}
