package com.google.assistant.plugin.appactions.ui.toolwindow.frames;

import com.intellij.ide.BrowserUtil;
import com.intellij.ui.components.labels.LinkLabel;
import com.intellij.ui.components.labels.LinkListener;
import kotlin.Metadata;

/* compiled from: WelcomeFrame.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 3, d1 = {"��\u0014\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0003\u0010��\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/intellij/ui/components/labels/LinkLabel;", "", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "linkSelected"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/ui/toolwindow/frames/WelcomeFrame$helpLink$1.class */
final class WelcomeFrame$helpLink$1<T> implements LinkListener<Object> {
    public static final WelcomeFrame$helpLink$1 INSTANCE = new WelcomeFrame$helpLink$1();

    WelcomeFrame$helpLink$1() {
    }

    public final void linkSelected(LinkLabel<Object> linkLabel, Object $noName_1) {
        BrowserUtil.browse("https://developers.google.com/assistant/app/overview");
    }
}
