package com.google.assistant.plugin.appactions.extensions;

import com.google.assistant.plugin.common.utils.DialogUtils;
import com.google.assistant.plugin.common.utils.ProjectUtils;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.startup.StartupActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ActionsXmlDeprecationActivity.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\u0018��2\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/google/assistant/plugin/appactions/extensions/ActionsXmlDeprecationActivity;", "Lcom/intellij/openapi/startup/StartupActivity$RequiredForSmartMode;", "()V", "runActivity", "", "project", "Lcom/intellij/openapi/project/Project;", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/extensions/ActionsXmlDeprecationActivity.class */
public final class ActionsXmlDeprecationActivity implements StartupActivity.RequiredForSmartMode {
    public void runActivity(@NotNull Project project) {
        Intrinsics.checkNotNullParameter(project, "project");
        if (ProjectUtils.INSTANCE.isActionsXmlInProject(project)) {
            DialogUtils.INSTANCE.showActionsXmlDeprecationMessage();
        }
    }
}
