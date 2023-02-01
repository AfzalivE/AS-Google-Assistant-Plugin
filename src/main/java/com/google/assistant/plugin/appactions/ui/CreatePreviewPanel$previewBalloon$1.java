package com.google.assistant.plugin.appactions.ui;

import com.intellij.ide.BrowserUtil;
import kotlin.Metadata;

/* compiled from: CreatePreviewPanel.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 3, d1 = {"��\b\n��\n\u0002\u0010\u0002\n��\u0010��\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/ui/CreatePreviewPanel$previewBalloon$1.class */
final class CreatePreviewPanel$previewBalloon$1 implements Runnable {
    public static final CreatePreviewPanel$previewBalloon$1 INSTANCE = new CreatePreviewPanel$previewBalloon$1();

    CreatePreviewPanel$previewBalloon$1() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        BrowserUtil.browse("https://developers.google.com/assistant/app/test-tool#creating_updating_and_deleting_previews");
    }
}
