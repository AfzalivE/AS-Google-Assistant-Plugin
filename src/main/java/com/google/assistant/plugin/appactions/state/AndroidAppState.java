package com.google.assistant.plugin.appactions.state;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ProjectStateSubject.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��*\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018��2\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J'\u0010\u0014\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\rHÖ\u0001J\b\u0010\u0019\u001a\u00020\u0003H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n��\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/google/assistant/plugin/appactions/state/AndroidAppState;", "", "moduleName", "", "applicationId", "appActionsState", "Lcom/google/assistant/plugin/appactions/state/AppActionsState;", "(Ljava/lang/String;Ljava/lang/String;Lcom/google/assistant/plugin/appactions/state/AppActionsState;)V", "getAppActionsState", "()Lcom/google/assistant/plugin/appactions/state/AppActionsState;", "getApplicationId", "()Ljava/lang/String;", "index", "", "getIndex", "()I", "getModuleName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/state/AndroidAppState.class */
public final class AndroidAppState {
    private final int index;
    @NotNull
    private final String moduleName;
    @NotNull
    private final String applicationId;
    @NotNull
    private final AppActionsState appActionsState;

    @NotNull
    public final String component1() {
        return this.moduleName;
    }

    @NotNull
    public final String component2() {
        return this.applicationId;
    }

    @NotNull
    public final AppActionsState component3() {
        return this.appActionsState;
    }

    @NotNull
    public final AndroidAppState copy(@NotNull String moduleName, @NotNull String applicationId, @NotNull AppActionsState appActionsState) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(appActionsState, "appActionsState");
        return new AndroidAppState(moduleName, applicationId, appActionsState);
    }

    public static /* synthetic */ AndroidAppState copy$default(AndroidAppState androidAppState, String str, String str2, AppActionsState appActionsState, int i, Object obj) {
        if ((i & 1) != 0) {
            str = androidAppState.moduleName;
        }
        if ((i & 2) != 0) {
            str2 = androidAppState.applicationId;
        }
        if ((i & 4) != 0) {
            appActionsState = androidAppState.appActionsState;
        }
        return androidAppState.copy(str, str2, appActionsState);
    }

    public int hashCode() {
        String str = this.moduleName;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.applicationId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        AppActionsState appActionsState = this.appActionsState;
        return hashCode2 + (appActionsState != null ? appActionsState.hashCode() : 0);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof AndroidAppState) {
                AndroidAppState androidAppState = (AndroidAppState) obj;
                return Intrinsics.areEqual(this.moduleName, androidAppState.moduleName) && Intrinsics.areEqual(this.applicationId, androidAppState.applicationId) && Intrinsics.areEqual(this.appActionsState, androidAppState.appActionsState);
            }
            return false;
        }
        return true;
    }

    public AndroidAppState(@NotNull String moduleName, @NotNull String applicationId, @NotNull AppActionsState appActionsState) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(appActionsState, "appActionsState");
        this.moduleName = moduleName;
        this.applicationId = applicationId;
        this.appActionsState = appActionsState;
        this.index = StringsKt.indexOf(this.moduleName, ".", 0, false);
    }

    @NotNull
    public final String getModuleName() {
        return this.moduleName;
    }

    @NotNull
    public final String getApplicationId() {
        return this.applicationId;
    }

    @NotNull
    public final AppActionsState getAppActionsState() {
        return this.appActionsState;
    }

    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public String toString() {
        String str = this.moduleName;
        int i = this.index + 1;
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String substring = str.substring(i);
        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }
}
