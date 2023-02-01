package com.google.assistant.plugin.shortcuts;

import com.google.assistant.plugin.common.utils.ProjectUtils;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ShortcutsTestToolAction.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\u0018��2\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/google/assistant/plugin/shortcuts/ShortcutsTestToolAction;", "Lcom/intellij/openapi/actionSystem/AnAction;", "()V", "actionPerformed", "", "event", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/shortcuts/ShortcutsTestToolAction.class */
public final class ShortcutsTestToolAction extends AnAction {
    public void actionPerformed(@NotNull AnActionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ProjectUtils.INSTANCE.getToolwindowAction("Shortcuts Test Tool").actionPerformed(event);
    }
}
