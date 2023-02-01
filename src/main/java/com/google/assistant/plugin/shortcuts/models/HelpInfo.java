package com.google.assistant.plugin.shortcuts.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Types.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��\"\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018��2\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/google/assistant/plugin/shortcuts/models/HelpInfo;", "", "text", "", "linkText", "linkUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLinkText", "()Ljava/lang/String;", "getLinkUrl", "getText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/shortcuts/models/HelpInfo.class */
public final class HelpInfo {
    @NotNull
    private final String text;
    @NotNull
    private final String linkText;
    @NotNull
    private final String linkUrl;

    @NotNull
    public final String component1() {
        return this.text;
    }

    @NotNull
    public final String component2() {
        return this.linkText;
    }

    @NotNull
    public final String component3() {
        return this.linkUrl;
    }

    @NotNull
    public final HelpInfo copy(@NotNull String text, @NotNull String linkText, @NotNull String linkUrl) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(linkText, "linkText");
        Intrinsics.checkNotNullParameter(linkUrl, "linkUrl");
        return new HelpInfo(text, linkText, linkUrl);
    }

    public static /* synthetic */ HelpInfo copy$default(HelpInfo helpInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = helpInfo.text;
        }
        if ((i & 2) != 0) {
            str2 = helpInfo.linkText;
        }
        if ((i & 4) != 0) {
            str3 = helpInfo.linkUrl;
        }
        return helpInfo.copy(str, str2, str3);
    }

    @NotNull
    public String toString() {
        return "HelpInfo(text=" + this.text + ", linkText=" + this.linkText + ", linkUrl=" + this.linkUrl + ")";
    }

    public int hashCode() {
        String str = this.text;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.linkText;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.linkUrl;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof HelpInfo) {
                HelpInfo helpInfo = (HelpInfo) obj;
                return Intrinsics.areEqual(this.text, helpInfo.text) && Intrinsics.areEqual(this.linkText, helpInfo.linkText) && Intrinsics.areEqual(this.linkUrl, helpInfo.linkUrl);
            }
            return false;
        }
        return true;
    }

    public HelpInfo(@NotNull String text, @NotNull String linkText, @NotNull String linkUrl) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(linkText, "linkText");
        Intrinsics.checkNotNullParameter(linkUrl, "linkUrl");
        this.text = text;
        this.linkText = linkText;
        this.linkUrl = linkUrl;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final String getLinkText() {
        return this.linkText;
    }

    @NotNull
    public final String getLinkUrl() {
        return this.linkUrl;
    }
}
