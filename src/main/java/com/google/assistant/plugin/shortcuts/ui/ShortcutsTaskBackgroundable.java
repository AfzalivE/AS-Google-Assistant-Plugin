package com.google.assistant.plugin.shortcuts.ui;

import com.google.assistant.plugin.common.utils.DialogUtils;
import com.google.assistant.plugin.common.utils.LoggingUtils;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.project.Project;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ShortcutsTaskBackgroundable.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018��2\u00020\u0001Bj\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012%\b\u0002\u0010\u0006\u001a\u001f\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\fH\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH\u0016R\u000e\u0010\u0010\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000eX\u0082\u0004¢\u0006\u0002\n��R+\u0010\u0006\u001a\u001f\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000eX\u0082\u0004¢\u0006\u0002\n��¨\u0006\u0017"}, d2 = {"Lcom/google/assistant/plugin/shortcuts/ui/ShortcutsTaskBackgroundable;", "Lcom/intellij/openapi/progress/Task$Backgroundable;", "title", "", "currentProject", "Lcom/intellij/openapi/project/Project;", "onRunHandler", "Lkotlin/Function1;", "Lcom/intellij/openapi/progress/ProgressIndicator;", "Lkotlin/ParameterName;", "name", "progressIndicator", "", "onFinishedHandler", "Lkotlin/Function0;", "onThrowableHandler", "errorMessage", "(Ljava/lang/String;Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)V", "onFinished", "onThrowable", "e", "", "run", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/shortcuts/ui/ShortcutsTaskBackgroundable.class */
public final class ShortcutsTaskBackgroundable extends Task.Backgroundable {
    private final Function1<ProgressIndicator, Unit> onRunHandler;
    private final Function0<Unit> onFinishedHandler;
    private final Function0<Unit> onThrowableHandler;
    private final String errorMessage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortcutsTaskBackgroundable(@NotNull String title, @NotNull Project currentProject, @Nullable Function1<ProgressIndicator, Unit> function1, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function02, @NotNull String errorMessage) {
        super(currentProject, title);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(currentProject, "currentProject");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.onRunHandler = function1;
        this.onFinishedHandler = function0;
        this.onThrowableHandler = function02;
        this.errorMessage = errorMessage;
    }

    public /* synthetic */ ShortcutsTaskBackgroundable(String str, Project project, Function1 function1, Function0 function0, Function0 function02, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, project, (i & 4) != 0 ? null : function1, (i & 8) != 0 ? null : function0, (i & 16) != 0 ? null : function02, (i & 32) != 0 ? ShortcutsTaskBackgroundableKt.DEFAULT_ERROR_MESSAGE : str2);
    }

    public void run(@NotNull ProgressIndicator progressIndicator) {
        Intrinsics.checkNotNullParameter(progressIndicator, "progressIndicator");
        Function1<ProgressIndicator, Unit> function1 = this.onRunHandler;
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
    }

    public void onThrowable(@NotNull Throwable e) {
        Intrinsics.checkNotNullParameter(e, "e");
        super.onThrowable(e);
        String message = e.getMessage();
        if (message == null) {
            message = this.errorMessage;
        }
        String message2 = message;
        LoggingUtils.INSTANCE.error(this.errorMessage, e);
        DialogUtils.INSTANCE.showErrorMessage(message2);
        Function0<Unit> function0 = this.onThrowableHandler;
        if (function0 != null) {
            Unit unit = (Unit) function0.invoke();
        }
    }
}
