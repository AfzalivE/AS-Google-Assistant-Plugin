package com.google.assistant.plugin.appactions.actions;

import com.android.tools.analytics.UsageTracker;
import com.android.tools.idea.assistant.OpenAssistSidePanelAction;
import com.google.wireless.android.sdk.stats.AndroidStudioEvent;
import com.google.wireless.android.sdk.stats.ConnectionAssistantEvent;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.Presentation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AppActionsAssistantSidePanelAction.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018��2\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"Lcom/google/assistant/plugin/appactions/actions/AppActionsAssistantSidePanelAction;", "Lcom/android/tools/idea/assistant/OpenAssistSidePanelAction;", "()V", "actionPerformed", "", "event", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "update", "e", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/actions/AppActionsAssistantSidePanelAction.class */
public final class AppActionsAssistantSidePanelAction extends OpenAssistSidePanelAction {
    public void update(@NotNull AnActionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        Presentation presentation = e.getPresentation();
        Intrinsics.checkNotNullExpressionValue(presentation, "e.presentation");
        presentation.setVisible(true);
    }

    public void actionPerformed(@NotNull AnActionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.actionPerformed(event);
        AndroidStudioEvent.Builder connectionAssistantEvent = AndroidStudioEvent.newBuilder().setKind(AndroidStudioEvent.EventKind.CONNECTION_ASSISTANT_EVENT).setConnectionAssistantEvent(ConnectionAssistantEvent.newBuilder().setType(ConnectionAssistantEvent.ConnectionAssistantEventType.OPEN));
        Intrinsics.checkNotNullExpressionValue(connectionAssistantEvent, "AndroidStudioEvent.newBu…tType.OPEN)\n            )");
        UsageTracker.log(connectionAssistantEvent);
    }
}
