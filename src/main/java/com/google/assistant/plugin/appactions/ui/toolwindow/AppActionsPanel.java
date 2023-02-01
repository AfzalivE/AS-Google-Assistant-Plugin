package com.google.assistant.plugin.appactions.ui.toolwindow;

import com.google.assistant.plugin.appactions.models.Model;
import com.google.assistant.plugin.appactions.models.PluginState;
import com.google.assistant.plugin.appactions.state.AndroidAppState;
import com.google.assistant.plugin.appactions.ui.ProgressBarPanel;
import com.google.assistant.plugin.appactions.ui.toolwindow.frames.AppActionsFrame;
import com.google.assistant.plugin.appactions.ui.toolwindow.frames.TestPreviewFrame;
import com.google.assistant.plugin.appactions.ui.toolwindow.frames.WelcomeFrame;
import com.google.assistant.plugin.common.utils.DialogUtils;
import com.google.assistant.plugin.common.utils.LoggingUtils;
import com.google.assistant.plugin.common.utils.ProjectUtils;
import com.google.gct.login.GoogleLogin;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFileManager;
import com.intellij.openapi.vfs.newvfs.BulkFileListener;
import com.intellij.openapi.vfs.newvfs.events.VFileEvent;
import com.intellij.ui.components.JBScrollPane;
import com.intellij.util.messages.MessageBusConnection;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Panel;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.OverlayLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AppActionsPanel.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018��2\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u001b\u001a\u00020\u001cJ\b\u0010\u001d\u001a\u00020\u001cH\u0002J\u000e\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\nJ\b\u0010 \u001a\u00020\u001cH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n��R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n��\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n��R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n��¨\u0006!"}, d2 = {"Lcom/google/assistant/plugin/appactions/ui/toolwindow/AppActionsPanel;", "Ljavax/swing/JPanel;", "project", "Lcom/intellij/openapi/project/Project;", "(Lcom/intellij/openapi/project/Project;)V", "activePanel", "Lcom/google/assistant/plugin/appactions/ui/toolwindow/frames/AppActionsFrame;", "appActionsInScrollPanel", "Lcom/intellij/ui/components/JBScrollPane;", "value", "", "isProgressBarVisible", "()Z", "setProgressBarVisible", "(Z)V", "model", "Lcom/google/assistant/plugin/appactions/models/Model;", "getModel", "()Lcom/google/assistant/plugin/appactions/models/Model;", "overlayLayoutPanel", "Ljava/awt/Panel;", "progressBarPanel", "Lcom/google/assistant/plugin/appactions/ui/ProgressBarPanel;", "testPreviewFrame", "Lcom/google/assistant/plugin/appactions/ui/toolwindow/frames/TestPreviewFrame;", "welcomeFrame", "Lcom/google/assistant/plugin/appactions/ui/toolwindow/frames/WelcomeFrame;", "refreshState", "", "resetIntentConfigUi", "setTestPreviewFramePreviewInSync", "inSync", "startObservingActionsConfig", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/ui/toolwindow/AppActionsPanel.class */
public final class AppActionsPanel extends JPanel {
    @NotNull
    private final Model model;
    private final ProgressBarPanel progressBarPanel;
    private final WelcomeFrame welcomeFrame;
    private TestPreviewFrame testPreviewFrame;
    private AppActionsFrame activePanel;
    private final JBScrollPane appActionsInScrollPanel;
    private final Panel overlayLayoutPanel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppActionsPanel(@NotNull Project project) {
        super(new BorderLayout());
        Intrinsics.checkNotNullParameter(project, "project");
        this.model = new Model(project);
        this.progressBarPanel = new ProgressBarPanel();
        this.welcomeFrame = new WelcomeFrame(this.model, this);
        this.testPreviewFrame = new TestPreviewFrame(this.model, this);
        JBScrollPane $this$apply = new JBScrollPane();
        $this$apply.setVerticalScrollBarPolicy(20);
        $this$apply.setHorizontalScrollBarPolicy(31);
        Unit unit = Unit.INSTANCE;
        this.appActionsInScrollPanel = $this$apply;
        Panel panel = new Panel();
        panel.setLayout(new OverlayLayout(panel));
        Unit unit2 = Unit.INSTANCE;
        this.overlayLayoutPanel = panel;
        setEnabled(false);
        GoogleLogin googleLogin = GoogleLogin.getInstance();
        Intrinsics.checkNotNullExpressionValue(googleLogin, "GoogleLogin.getInstance()");
        if (!googleLogin.isLoggedIn()) {
            this.model.setState(PluginState.WELCOME_PAGE);
        } else {
            if (!this.model.getSupportedIntents().isEmpty()) {
                this.model.setState(PluginState.LOGGED_IN_PREVIEW_EXISTS);
            } else {
                this.model.setState(PluginState.WELCOME_PAGE);
            }
        }
        LoggingUtils.INSTANCE.info("STATE OF THE MODEL = " + this.model.getState());
        refreshState();
        resetIntentConfigUi();
        startObservingActionsConfig();
    }

    @NotNull
    public final Model getModel() {
        return this.model;
    }

    public final boolean isProgressBarVisible() {
        return this.progressBarPanel.getProgressBarVisible();
    }

    public final void setProgressBarVisible(boolean value) {
        this.progressBarPanel.setProgressBarVisible(value);
    }

    public final void refreshState() {
        LoggingUtils.INSTANCE.info("refreshing state, current state = " + this.model.getState());
        this.overlayLayoutPanel.removeAll();
        setEnabled(false);
        removeAll();
        switch (this.model.getState()) {
            case WELCOME_PAGE:
                this.welcomeFrame.refresh();
                this.welcomeFrame.setEnabled(true);
                this.activePanel = this.welcomeFrame;
                break;
            case LOGGED_IN_NO_PREVIEW:
                this.welcomeFrame.refresh();
                this.welcomeFrame.setEnabled(true);
                this.activePanel = this.welcomeFrame;
                break;
            case LOGGED_IN_PREVIEW_EXISTS:
                this.testPreviewFrame = new TestPreviewFrame(this.model, this);
                this.testPreviewFrame.setUpdatePreviewPanelPreviewInSync(true);
                resetIntentConfigUi();
                this.testPreviewFrame.setEnabled(true);
                this.activePanel = this.testPreviewFrame;
                break;
        }
        this.appActionsInScrollPanel.getViewport().add(this.activePanel);
        this.overlayLayoutPanel.add(this.progressBarPanel);
        this.overlayLayoutPanel.add(this.appActionsInScrollPanel, "Center");
        add((Component) this.overlayLayoutPanel);
        revalidate();
        repaint();
        setEnabled(true);
    }

    private final void resetIntentConfigUi() {
        this.testPreviewFrame.setIntentConfigPanelIntents(this.model.getSupportedIntents());
    }

    private final void startObservingActionsConfig() {
        MessageBusConnection messageBusConnection = this.model.getProject().getMessageBus().connect(this.model.getProject());
        Intrinsics.checkNotNullExpressionValue(messageBusConnection, "model.project.messageBus.connect(model.project)");
        messageBusConnection.subscribe(VirtualFileManager.VFS_CHANGES, new BulkFileListener() { // from class: com.google.assistant.plugin.appactions.ui.toolwindow.AppActionsPanel$startObservingActionsConfig$1
            public void after(@NotNull List<? extends VFileEvent> list) {
                Module actionModule;
                Intrinsics.checkNotNullParameter(list, "events");
                try {
                    AndroidAppState selectedAndroidAppState = AppActionsPanel.this.getModel().getSelectedAndroidAppState();
                    if (selectedAndroidAppState == null || (actionModule = ModuleManager.getInstance(AppActionsPanel.this.getModel().getProject()).findModuleByName(selectedAndroidAppState.getModuleName())) == null) {
                        return;
                    }
                    Intrinsics.checkNotNullExpressionValue(actionModule, "ModuleManager.getInstanc…ate.moduleName) ?: return");
                    for (VFileEvent file : list) {
                        if (ProjectUtils.INSTANCE.isActionRelevantPath(file, actionModule)) {
                            DialogUtils.INSTANCE.showWarningMessage("Changes in this file may require to update the preview.");
                            AppActionsPanel.this.setTestPreviewFramePreviewInSync(false);
                        }
                    }
                } catch (Exception e) {
                    LoggingUtils.INSTANCE.error("Problem with actions.xml", e);
                }
            }
        });
    }

    public final void setTestPreviewFramePreviewInSync(boolean inSync) {
        this.testPreviewFrame.setUpdatePreviewPanelPreviewInSync(inSync);
    }
}
