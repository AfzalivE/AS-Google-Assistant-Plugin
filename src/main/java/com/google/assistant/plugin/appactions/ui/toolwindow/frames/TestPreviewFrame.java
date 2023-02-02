package com.google.assistant.plugin.appactions.ui.toolwindow.frames;

import actions.Plugin;
import com.android.ddmlib.AdbCommandRejectedException;
import com.android.ddmlib.ShellCommandUnresponsiveException;
import com.android.ddmlib.TimeoutException;
import com.google.assistant.plugin.appactions.Constants;
import com.google.assistant.plugin.appactions.PluginSingletons;
import com.google.assistant.plugin.appactions.exceptions.ActionsBuilderException;
import com.google.assistant.plugin.appactions.models.Model;
import com.google.assistant.plugin.appactions.state.AndroidAppState;
import com.google.assistant.plugin.appactions.state.DeviceProperties;
import com.google.assistant.plugin.appactions.state.DeviceType;
import com.google.assistant.plugin.appactions.ui.AdbCommandPanel;
import com.google.assistant.plugin.appactions.ui.AppDataPanel;
import com.google.assistant.plugin.appactions.ui.ConfigStepPanel;
import com.google.assistant.plugin.appactions.ui.DeviceSelectionPanel;
import com.google.assistant.plugin.appactions.ui.toolwindow.AppActionsPanel;
import com.google.assistant.plugin.appactions.ui.toolwindow.AppActionsTaskBackgroundable;
import com.google.assistant.plugin.common.utils.AdbUtils;
import com.google.assistant.plugin.common.utils.DialogUtils;
import com.google.assistant.plugin.common.utils.IntentDefinitionHelper;
import com.google.assistant.plugin.common.utils.LoggingUtils;
import com.google.gct.login.GoogleLogin;
import com.intellij.openapi.Disposable;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.Box;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: TestPreviewFrame.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018��2\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u0014\u0010\u001a\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u001b\u001a\u00020\nH\u0002J\b\u0010\u001c\u001a\u00020\u0019H\u0002J\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\nH\u0002J\u0010\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\tH\u0002J\u0010\u0010!\u001a\u00020\t2\u0006\u0010 \u001a\u00020\tH\u0002J\b\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020\t2\u0006\u0010 \u001a\u00020\tH\u0002J\u0012\u0010%\u001a\u00020\n2\b\b\u0002\u0010&\u001a\u00020\nH\u0002J\b\u0010'\u001a\u00020\u0019H\u0002J\b\u0010(\u001a\u00020\u0019H\u0002J\b\u0010)\u001a\u00020\u0019H\u0002J\u0010\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020,H\u0002J\u0012\u0010-\u001a\u00020\u00192\b\u0010.\u001a\u0004\u0018\u00010/H\u0002J\b\u00100\u001a\u00020\u0019H\u0002J\b\u00101\u001a\u00020\u0019H\u0002J\b\u00102\u001a\u00020\u0019H\u0002J\b\u00103\u001a\u00020\u0019H\u0002J\u0014\u00104\u001a\u00020\u00192\f\u00105\u001a\b\u0012\u0004\u0012\u00020706J\u000e\u00108\u001a\u00020\u00192\u0006\u00109\u001a\u00020\nJ\b\u0010:\u001a\u00020\u0019H\u0002J\b\u0010;\u001a\u00020\u0019H\u0002J\b\u0010<\u001a\u00020\u0019H\u0002R*\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n��\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n��\u001a\u0004\b\u0016\u0010\u0017¨\u0006="}, d2 = {"Lcom/google/assistant/plugin/appactions/ui/toolwindow/frames/TestPreviewFrame;", "Lcom/google/assistant/plugin/appactions/ui/toolwindow/frames/AppActionsFrame;", "model", "Lcom/google/assistant/plugin/appactions/models/Model;", "mainPanel", "Lcom/google/assistant/plugin/appactions/ui/toolwindow/AppActionsPanel;", "(Lcom/google/assistant/plugin/appactions/models/Model;Lcom/google/assistant/plugin/appactions/ui/toolwindow/AppActionsPanel;)V", "aapCache", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "adbCommandPanel", "Lcom/google/assistant/plugin/appactions/ui/AdbCommandPanel;", "appDataPanel", "Lcom/google/assistant/plugin/appactions/ui/AppDataPanel;", "deviceSelectionPanel", "Lcom/google/assistant/plugin/appactions/ui/DeviceSelectionPanel;", "intentConfigPanel", "Lcom/google/assistant/plugin/appactions/ui/ConfigStepPanel;", "getMainPanel", "()Lcom/google/assistant/plugin/appactions/ui/toolwindow/AppActionsPanel;", "getModel", "()Lcom/google/assistant/plugin/appactions/models/Model;", "clearPreview", "", "constructActionLink", "checkAapConnection", "disableAdbCommand", "enableInputFields", "enable", "generateAapLink", "assistantLink", "generateAutoLink", "getDeletePreviewTask", "Lcom/google/assistant/plugin/appactions/ui/toolwindow/AppActionsTaskBackgroundable;", "getUidPath", "hasAapConnection", "forceCheck", "onCopyAdbCommandClicked", "onDeletePreviewClicked", "onDeletePreviewFinish", "onDeletePreviewRun", "progressIndicator", "Lcom/intellij/openapi/progress/ProgressIndicator;", "onDeviceSelectionChanged", "device", "Lcom/google/assistant/plugin/appactions/state/DeviceProperties;", "onIntentSelectionChanged", "onRunAdbCommandClicked", "onUpdatePreviewClicked", "resetIntentConfigUi", "setIntentConfigPanelIntents", "intents", "", "Lplugin/actions/Plugin$AndroidActionPackageResponse$SupportedIntent;", "setUpdatePreviewPanelPreviewInSync", "inSync", "subscribeToEvents", "updateAdbCommand", "updateAppDataPanel", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/ui/toolwindow/frames/TestPreviewFrame.class */
public final class TestPreviewFrame extends AppActionsFrame {
    private final AppDataPanel appDataPanel;
    private final ConfigStepPanel intentConfigPanel;
    private final DeviceSelectionPanel deviceSelectionPanel;
    private final AdbCommandPanel adbCommandPanel;
    private final HashMap<String, Boolean> aapCache;
    @NotNull
    private final Model model;
    @NotNull
    private final AppActionsPanel mainPanel;

    @Override // com.google.assistant.plugin.appactions.ui.toolwindow.frames.AppActionsFrame
    @NotNull
    public Model getModel() {
        return this.model;
    }

    @Override // com.google.assistant.plugin.appactions.ui.toolwindow.frames.AppActionsFrame
    @NotNull
    public AppActionsPanel getMainPanel() {
        return this.mainPanel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TestPreviewFrame(@NotNull Model model, @NotNull AppActionsPanel mainPanel) {
        super(model, mainPanel);
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(mainPanel, "mainPanel");
        this.model = model;
        this.mainPanel = mainPanel;
        this.appDataPanel = new AppDataPanel(getModel());
        this.intentConfigPanel = new ConfigStepPanel();
        this.deviceSelectionPanel = new DeviceSelectionPanel(null, 1, null);
        this.adbCommandPanel = new AdbCommandPanel();
        this.aapCache = new HashMap<>();
        subscribeToEvents();
        setLayout((LayoutManager) new BorderLayout());
        Box box = new Box(1);
        box.add(this.appDataPanel);
        box.add(this.intentConfigPanel);
        box.add(this.deviceSelectionPanel);
        box.add(this.adbCommandPanel);
        add((Component) box, "North");
    }

    private final void subscribeToEvents() {
        this.appDataPanel.setOnUpdatePreviewClicked(() -> {
            onUpdatePreviewClicked();
            return Unit.INSTANCE;
        });
        this.appDataPanel.setOnDeletePreviewClicked(() -> {
            onDeletePreviewClicked();
            return Unit.INSTANCE;
        });
        this.adbCommandPanel.setOnCopyAdbCommandClicked(() -> {
            onCopyAdbCommandClicked();
            return Unit.INSTANCE;
        });
        this.adbCommandPanel.setOnRunAdbCommandClicked(() -> {
            onRunAdbCommandClicked();
            return Unit.INSTANCE;
        });
        this.intentConfigPanel.setOnIntentSelectionChangedListener(() -> {
            onIntentSelectionChanged();
            return Unit.INSTANCE;
        });
        this.intentConfigPanel.setOnIntentParameterChangedListener(() -> {
            updateAdbCommand();
            return Unit.INSTANCE;
        });
        this.deviceSelectionPanel.setOnDeviceSelectionChangedListener(deviceProperties -> {
            onDeviceSelectionChanged(deviceProperties);
            return Unit.INSTANCE;
        });
        PluginSingletons.getOnlineDevicesStateSubject().subscribe(getModel().getProject(), (onlineDevicesState, t2) -> {
            List<DeviceProperties> deviceProperties = TestPreviewFrame_subscribeToEvents_8Kt.subscribeToEvents(onlineDevicesState, t2);
            deviceSelectionPanel.setDevices(deviceProperties);
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onIntentSelectionChanged() {
        Plugin.AndroidActionPackageResponse.SupportedIntent selectedIntent = this.intentConfigPanel.getSelectedIntent();
        if (selectedIntent != null) {
            getModel().setSelectedIntent(selectedIntent);
        }
        updateAppDataPanel();
        updateAdbCommand();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAppDataPanel() {
        this.appDataPanel.setAppName(getModel().getInvocationName());
        this.appDataPanel.setLocale(getModel().getLocale());
        AppDataPanel appDataPanel = this.appDataPanel;
        AndroidAppState selectedAndroidAppState = getModel().getSelectedAndroidAppState();
        appDataPanel.setModuleName(selectedAndroidAppState != null ? selectedAndroidAppState.moduleName : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAdbCommand() {
        Plugin.AndroidActionPackageResponse.SupportedIntent selectedIntent = getModel().getSelectedIntent();
        DeviceProperties selectedDevice = getModel().getSelectedDevice();
        GoogleLogin googleLogin = GoogleLogin.getInstance();
        if (googleLogin.isLoggedIn() && selectedIntent != null && !getModel().getSupportedIntents().isEmpty() && selectedDevice != null) {
            Plugin.AndroidActionPackageResponse.SupportedIntent.SupportedIntentCapabilities supportedIntentCapabilities = selectedIntent.getSupportedIntentCapabilities();
            Intrinsics.checkNotNullExpressionValue(supportedIntentCapabilities, "selectedIntent.supportedIntentCapabilities");
            if (!supportedIntentCapabilities.getHasWebInventory()) {
                Map enteredFieldInputs = this.intentConfigPanel.getParametersForIntent(selectedIntent);
                String urlSuffix = IntentDefinitionHelper.INSTANCE.buildIntentParameterUrlSuffix(enteredFieldInputs);
                getModel().setUrlSuffix(urlSuffix);
                String actionLink = constructActionLink$default(this, false, 1, null);
                if (actionLink != null) {
                    this.adbCommandPanel.setUiEnabled(true);
                    this.adbCommandPanel.setAdbCommand(AdbUtils.INSTANCE.constructFullUrlTriggerCommand(selectedDevice, actionLink));
                    return;
                }
                return;
            }
        }
        disableAdbCommand();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDeviceSelectionChanged(DeviceProperties device) {
        getModel().setSelectedDevice(device);
        updateAppDataPanel();
        updateAdbCommand();
    }

    private final void disableAdbCommand() {
        this.adbCommandPanel.setUiEnabled(false);
        this.adbCommandPanel.setAdbCommand("N/A");
    }

    static /* synthetic */ String constructActionLink$default(TestPreviewFrame testPreviewFrame, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return testPreviewFrame.constructActionLink(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String constructActionLink(boolean checkAapConnection) {
        String urlSuffix;
        String assistantLink = getModel().getAssistantLink();
        Plugin.AndroidActionPackageResponse.SupportedIntent selectedIntent = getModel().getSelectedIntent();
        DeviceProperties selectedDevice = getModel().getSelectedDevice();
        DeviceType selectedDeviceType = selectedDevice != null ? selectedDevice.getDeviceType() : null;
        if (assistantLink == null || selectedIntent == null) {
            return null;
        }
        if (selectedDeviceType != null) {
            switch (selectedDeviceType) {
                case AUTOMOTIVE:
                    assistantLink = generateAutoLink(assistantLink);
                    break;
            }
            urlSuffix = getModel().getUrlSuffix();
            if (urlSuffix == null) {
                urlSuffix = "";
            }
            String urlSuffix2 = urlSuffix;
            return assistantLink + "?intent=" + selectedIntent.getName() + urlSuffix2;
        }
        if (hasAapConnection(checkAapConnection)) {
            assistantLink = generateAapLink(assistantLink);
        }
        urlSuffix = getModel().getUrlSuffix();
        if (urlSuffix == null) {
        }
        String urlSuffix22 = urlSuffix;
        return assistantLink + "?intent=" + selectedIntent.getName() + urlSuffix22;
    }

    private final String generateAutoLink(String assistantLink) {
        String uidPath = getUidPath(assistantLink);
        return "googleassistant://plugin/services/invoke/" + uidPath;
    }

    private final String generateAapLink(String assistantLink) {
        String uidPath = getUidPath(assistantLink);
        return "https://assistant.google.com/aap/services/invoke/" + uidPath;
    }

    private final String getUidPath(String assistantLink) {
        MatchResult result = new Regex("uid\\/[\\w\\d]+").find(assistantLink, 0);
        if (result != null) {
            String value = result.getValue();
            if (value != null) {
                return value;
            }
        }
        return "";
    }

    private final void clearPreview() {
        getModel().clearPreview();
        this.intentConfigPanel.setIntents(new ArrayList());
        disableAdbCommand();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetIntentConfigUi() {
        this.intentConfigPanel.setIntents(getModel().getSupportedIntents());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onUpdatePreviewClicked() {
        AppActionsTaskBackgroundable createPreviewAndFetchIntentsTask$default = AppActionsFrame.createPreviewAndFetchIntentsTask$default(this, null, 1, null);
        enableInputFields(false);
        createPreviewAndFetchIntentsTask$default.setOnFinishedHandler(() -> {
            resetIntentConfigUi();
            updateAppDataPanel();
            updateAdbCommand();
            enableInputFields(true);
            return Unit.INSTANCE;
        });
        ProgressManager.getInstance().run(createPreviewAndFetchIntentsTask$default);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDeletePreviewClicked() {
        ProgressManager.getInstance().run(getDeletePreviewTask());
    }

    private final AppActionsTaskBackgroundable getDeletePreviewTask() {
        AppActionsTaskBackgroundable task = new AppActionsTaskBackgroundable("Deleting preview...", getModel(), getMainPanel());
        task.setOnRunHandler(progressIndicator -> {
            TestPreviewFrame_getDeletePreviewTask_1Kt.deletePreview(this, progressIndicator);
            return Unit.INSTANCE;
        });
        task.setOnFinishedHandler(() -> {
            onDeletePreviewFinish();
            return Unit.INSTANCE;
        });
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDeletePreviewRun(ProgressIndicator progressIndicator) throws ActionsBuilderException, IOException {
        enableInputFields(false);
        GoogleLogin googleLogin = GoogleLogin.getInstance();
        if (!googleLogin.isLoggedIn()) {
            throw new ActionsBuilderException("User is not logged in.");
        }
        GoogleLogin googleLogin2 = GoogleLogin.getInstance();
        if (googleLogin2.getActiveUser() == null) {
            throw new ActionsBuilderException("Failed to obtain user credentials.");
        }
        getMainPanel().setProgressBarVisible(true);
        progressIndicator.setText("Deleting preview...");
        AndroidAppState selectedAndroidAppState = getModel().getSelectedAndroidAppState();
        if (selectedAndroidAppState == null) {
            throw new ActionsBuilderException("Changes made before deleting preview.");
        }
        String accessToken = GoogleLogin.getInstance().fetchOAuth2Token();
        String packageName = selectedAndroidAppState.applicationId;
        if (accessToken != null) {
            httpClient.deletePreview(accessToken, packageName);
            DialogUtils.INSTANCE.showInfoMessage("Preview deleted successfully for package " + packageName);
            return;
        }
        throw new ActionsBuilderException("Failed to obtain user credentials.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDeletePreviewFinish() {
        getModel().clearPreview();
        clearPreview();
        this.appDataPanel.cancelPreviewExpirationTimer();
        getMainPanel().setProgressBarVisible(false);
        enableInputFields(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCopyAdbCommandClicked() {
        DeviceProperties selectedDevice = getModel().getSelectedDevice();
        String assistantLink = getModel().getAssistantLink();
        String actionLink = constructActionLink(true);
        if (selectedDevice == null || assistantLink == null || actionLink == null) {
            return;
        }
        String adbCommand = AdbUtils.INSTANCE.constructFullUrlTriggerCommand(selectedDevice, actionLink);
        int urlIndex = StringsKt.indexOf(adbCommand, assistantLink, 0, false);
        StringBuilder sb = new StringBuilder();
        if (adbCommand == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String substring = adbCommand.substring(0, urlIndex);
        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        StringBuilder append = sb.append(substring);
        if (adbCommand == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String substring2 = adbCommand.substring(urlIndex);
        Intrinsics.checkNotNullExpressionValue(substring2, "(this as java.lang.String).substring(startIndex)");
        String escapedCommand = append.append(StringsKt.replace(substring2, "&", "\\&", false)).toString();
        Transferable stringSelection = new StringSelection(escapedCommand);
        Toolkit defaultToolkit = Toolkit.getDefaultToolkit();
        Intrinsics.checkNotNullExpressionValue(defaultToolkit, "Toolkit.getDefaultToolkit()");
        Clipboard clipboard = defaultToolkit.getSystemClipboard();
        clipboard.setContents(stringSelection, (ClipboardOwner) null);
        this.adbCommandPanel.selectAdbCommand();
    }

    static /* synthetic */ boolean hasAapConnection$default(TestPreviewFrame testPreviewFrame, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return testPreviewFrame.hasAapConnection(z);
    }

    private final boolean hasAapConnection(boolean forceCheck) {
        DeviceProperties selectedDevice = getModel().getSelectedDevice();
        if (selectedDevice != null) {
            if (forceCheck || !this.aapCache.containsKey(selectedDevice.getSerialNumber())) {
                String output = null;
                try {
                    output = AdbUtils.INSTANCE.executeAdbShellCommand(selectedDevice, "content query --uri content://com.google.android.googlequicksearchbox.GsaPublicContentProvider/publicvalue/google_assistant_plugin_aap_availability");
                } catch (TimeoutException | AdbCommandRejectedException | ShellCommandUnresponsiveException |
                         IOException | InterruptedException e) {
                    throw new RuntimeException(e);
                }
                boolean hasAap = StringsKt.contains(output, "value=true", false);
                this.aapCache.put(selectedDevice.getSerialNumber(), hasAap);
                return hasAap;
            } else if (this.aapCache.containsKey(selectedDevice.getSerialNumber())) {
                Boolean bool = this.aapCache.get(selectedDevice.getSerialNumber());
                Intrinsics.checkNotNull(bool);
                return bool.booleanValue();
            } else {
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRunAdbCommandClicked() {
        try {
            TestPreviewFrame$onRunAdbCommandClicked$task$1 task = new TestPreviewFrame$onRunAdbCommandClicked$task$1(this, getModel().getProject(), Constants.PLUGIN_NAME, false);
            ProgressManager.getInstance().run(task);
        } catch (Exception e) {
            LoggingUtils.INSTANCE.error("Failed to run adb command.", e);
            DialogUtils.INSTANCE.showErrorMessage("Failed to run adb command: " + e.getMessage());
        }
    }

    public final void setIntentConfigPanelIntents(@NotNull List<Plugin.AndroidActionPackageResponse.SupportedIntent> list) {
        Intrinsics.checkNotNullParameter(list, "intents");
        this.intentConfigPanel.setIntents(list);
    }

    public final void setUpdatePreviewPanelPreviewInSync(boolean inSync) {
        this.appDataPanel.setPreviewInSync(inSync);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enableInputFields(boolean enable) {
        this.appDataPanel.enableInputFields(enable);
        this.intentConfigPanel.enableInputFields(enable);
        this.deviceSelectionPanel.enableInputFields(enable);
        this.adbCommandPanel.enableInputFields(enable);
    }
}
