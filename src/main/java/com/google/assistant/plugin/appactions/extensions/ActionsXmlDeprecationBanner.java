package com.google.assistant.plugin.appactions.extensions;

import com.google.assistant.plugin.appactions.Constants;
import com.google.assistant.plugin.common.utils.ProjectUtils;
import com.intellij.openapi.fileEditor.FileEditor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.Key;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.ui.EditorNotificationPanel;
import com.intellij.ui.EditorNotifications;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ActionsXmlDeprecationBanner.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��2\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\"\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016R!\u0010\u0004\u001a\u0015\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00020\u00020\u0005¢\u0006\u0002\b\u0007X\u0082\u0004¢\u0006\u0002\n��¨\u0006\u0010"}, d2 = {"Lcom/google/assistant/plugin/appactions/extensions/ActionsXmlDeprecationBanner;", "Lcom/intellij/ui/EditorNotifications$Provider;", "Lcom/intellij/ui/EditorNotificationPanel;", "()V", "key", "Lcom/intellij/openapi/util/Key;", "kotlin.jvm.PlatformType", "Lorg/jetbrains/annotations/NotNull;", "createNotificationPanel", "file", "Lcom/intellij/openapi/vfs/VirtualFile;", "fileEditor", "Lcom/intellij/openapi/fileEditor/FileEditor;", "project", "Lcom/intellij/openapi/project/Project;", "getKey", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/extensions/ActionsXmlDeprecationBanner.class */
public final class ActionsXmlDeprecationBanner extends EditorNotifications.Provider<EditorNotificationPanel> {
    private final Key<EditorNotificationPanel> key;

    public ActionsXmlDeprecationBanner() {
        Key<EditorNotificationPanel> create = Key.create(Constants.ACTIONS_XML_DEPRECATION_MSG_TITLE);
        Intrinsics.checkNotNullExpressionValue(create, "Key.create<EditorNotific…ML_DEPRECATION_MSG_TITLE)");
        this.key = create;
    }

    @NotNull
    public Key<EditorNotificationPanel> getKey() {
        return this.key;
    }

    @Nullable
    /* renamed from: createNotificationPanel */
    public EditorNotificationPanel m3createNotificationPanel(@NotNull VirtualFile file, @NotNull FileEditor fileEditor, @NotNull Project project) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(fileEditor, "fileEditor");
        Intrinsics.checkNotNullParameter(project, "project");
        if (!ProjectUtils.INSTANCE.isFileActionsXml(file, project)) {
            return null;
        }
        EditorNotificationPanel panel = new EditorNotificationPanel();
        panel.setText("<html><p>The actions.xml configuration is deprecated and will stop working after May 2023. Please migrate your App Actions configuration to shortcuts.xml.</p></html>");
        panel.createActionLabel(Constants.ACTIONS_XML_MIGRATION_GUIDE_TEXT, ActionsXmlDeprecationBanner$createNotificationPanel$1.INSTANCE);
        return panel;
    }
}
