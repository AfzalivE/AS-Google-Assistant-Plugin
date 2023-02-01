package com.google.assistant.plugin.appactions.ui.toolwindow;

import com.google.assistant.plugin.appactions.Constants;
import com.google.assistant.plugin.appactions.models.Model;
import com.google.assistant.plugin.appactions.models.PluginState;
import com.google.assistant.plugin.common.utils.DialogUtils;
import com.google.assistant.plugin.common.utils.LoggingUtils;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.Task;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AppActionsTaskBackgroundable.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0016\u0018��2\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u001d\u001a\u00020\rH\u0016J\b\u0010\u001e\u001a\u00020\rH\u0002J\u0010\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0014H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n��R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n��\u001a\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R7\u0010\u0012\u001a\u001f\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\r\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n��¨\u0006#"}, d2 = {"Lcom/google/assistant/plugin/appactions/ui/toolwindow/AppActionsTaskBackgroundable;", "Lcom/intellij/openapi/progress/Task$Backgroundable;", "title", "", "model", "Lcom/google/assistant/plugin/appactions/models/Model;", "mainPanel", "Lcom/google/assistant/plugin/appactions/ui/toolwindow/AppActionsPanel;", "(Ljava/lang/String;Lcom/google/assistant/plugin/appactions/models/Model;Lcom/google/assistant/plugin/appactions/ui/toolwindow/AppActionsPanel;)V", "getModel", "()Lcom/google/assistant/plugin/appactions/models/Model;", "onFinishedHandler", "Lkotlin/Function0;", "", "getOnFinishedHandler", "()Lkotlin/jvm/functions/Function0;", "setOnFinishedHandler", "(Lkotlin/jvm/functions/Function0;)V", "onRunHandler", "Lkotlin/Function1;", "Lcom/intellij/openapi/progress/ProgressIndicator;", "Lkotlin/ParameterName;", "name", "progressIndicator", "getOnRunHandler", "()Lkotlin/jvm/functions/Function1;", "setOnRunHandler", "(Lkotlin/jvm/functions/Function1;)V", "onThrowableHandler", "onFinished", "onFinishedCommon", "onThrowable", "e", "", "run", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/ui/toolwindow/AppActionsTaskBackgroundable.class */
public class AppActionsTaskBackgroundable extends Task.Backgroundable {
    @Nullable
    private Function1<ProgressIndicator, Unit> onRunHandler;
    @Nullable
    private Function0<Unit> onFinishedHandler;
    private Function0<Unit> onThrowableHandler;
    @NotNull
    private final Model model;
    private final AppActionsPanel mainPanel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppActionsTaskBackgroundable(@NotNull String title, @NotNull Model model, @NotNull AppActionsPanel mainPanel) {
        super(model.getProject(), title);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(mainPanel, "mainPanel");
        this.model = model;
        this.mainPanel = mainPanel;
    }

    @NotNull
    public final Model getModel() {
        return this.model;
    }

    @Nullable
    public final Function1<ProgressIndicator, Unit> getOnRunHandler() {
        return this.onRunHandler;
    }

    public final void setOnRunHandler(@Nullable Function1<ProgressIndicator, Unit> function1) {
        this.onRunHandler = function1;
    }

    @Nullable
    public final Function0<Unit> getOnFinishedHandler() {
        return this.onFinishedHandler;
    }

    public final void setOnFinishedHandler(@Nullable Function0<Unit> function0) {
        this.onFinishedHandler = function0;
    }

    public void run(@NotNull ProgressIndicator progressIndicator) {
        Intrinsics.checkNotNullParameter(progressIndicator, "progressIndicator");
        Function1<? super ProgressIndicator, Unit> function1 = this.onRunHandler;
        if (function1 != null) {
            Unit unit = (Unit) function1.invoke(progressIndicator);
        }
    }

    public void onFinished() {
        super.onFinished();
        Function0<Unit> function0 = this.onFinishedHandler;
        if (function0 != null) {
            Unit unit = (Unit) function0.invoke();
        }
        onFinishedCommon();
    }

    public void onThrowable(@NotNull Throwable e) {
        Intrinsics.checkNotNullParameter(e, "e");
        super.onThrowable(e);
        this.model.clearPreview();
        String message = e.getMessage();
        if (message == null) {
            message = "Can't create preview";
        }
        String message2 = message;
        LoggingUtils.INSTANCE.error("Can't create preview", e);
        DialogUtils.INSTANCE.showErrorMessage(message2, DialogUtils.INSTANCE.createOpenBrowserAction(Constants.CREATE_ACTIONS_XML_ACTION_TITLE, Constants.CREATE_ACTIONS_XML_ACTION_URL));
        AppActionsPanel $this$apply = this.mainPanel;
        $this$apply.setProgressBarVisible(false);
        Function0<Unit> function0 = this.onThrowableHandler;
        if (function0 != null) {
            Unit unit = (Unit) function0.invoke();
        }
    }

    private final void onFinishedCommon() {
        this.mainPanel.setTestPreviewFramePreviewInSync(true);
        if (!this.model.getSupportedIntents().isEmpty()) {
            this.model.setState(PluginState.LOGGED_IN_PREVIEW_EXISTS);
        } else {
            this.model.setState(PluginState.WELCOME_PAGE);
        }
        this.mainPanel.refreshState();
    }
}
