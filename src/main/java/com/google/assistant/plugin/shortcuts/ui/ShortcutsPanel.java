package com.google.assistant.plugin.shortcuts.ui;

import com.google.assistant.plugin.appactions.Constants;
import com.google.assistant.plugin.appactions.PluginSingletons;
import com.google.assistant.plugin.appactions.exceptions.AASProjectConfigurationException;
import com.google.assistant.plugin.appactions.state.DeviceProperties;
import com.google.assistant.plugin.appactions.state.OnlineDevicesState;
import com.google.assistant.plugin.appactions.ui.DeviceSelectionPanel;
import com.google.assistant.plugin.common.utils.ProjectUtils;
import com.google.assistant.plugin.shortcuts.controllers.PackageNameSelectController;
import com.google.assistant.plugin.shortcuts.controllers.ShortcutSelectController;
import com.google.assistant.plugin.shortcuts.controllers.ShortcutTestController;
import com.google.assistant.plugin.shortcuts.controllers.ShortcutsTypeController;
import com.google.assistant.plugin.shortcuts.models.HelpInfo;
import com.google.assistant.plugin.shortcuts.models.Model;
import com.google.assistant.plugin.shortcuts.models.ShortcutType;
import com.google.assistant.plugin.shortcuts.models.ShortcutsTableModel;
import com.google.assistant.plugin.shortcuts.ui.common.ConstantsKt;
import com.google.assistant.plugin.shortcuts.ui.common.NumberedLabel;
import com.google.assistant.plugin.shortcuts.utils.ShortcutsAdbUtils;
import com.google.common.collect.ImmutableList;
import com.intellij.openapi.Disposable;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowManager;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Comparator;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ShortcutsPanel.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018��2\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010$\u001a\u00020%H\u0016J\u0012\u0010&\u001a\u00020%2\b\u0010'\u001a\u0004\u0018\u00010(H\u0002J\b\u0010)\u001a\u00020%H\u0002J\u0010\u0010*\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n��¨\u0006+"}, d2 = {"Lcom/google/assistant/plugin/shortcuts/ui/ShortcutsPanel;", "Ljavax/swing/JPanel;", "Lcom/intellij/openapi/Disposable;", "project", "Lcom/intellij/openapi/project/Project;", "(Lcom/intellij/openapi/project/Project;)V", "adbCommand", "Lcom/google/assistant/plugin/shortcuts/ui/AdbCommand;", "appNameSelectController", "Lcom/google/assistant/plugin/shortcuts/controllers/PackageNameSelectController;", "appNotFoundLabel", "Ljavax/swing/JLabel;", "deviceSelectionPanel", "Lcom/google/assistant/plugin/appactions/ui/DeviceSelectionPanel;", "model", "Lcom/google/assistant/plugin/shortcuts/models/Model;", "packageNameDropdown", "Lcom/google/assistant/plugin/shortcuts/ui/PackageNameDropdown;", "shortcutDetails", "Lcom/google/assistant/plugin/shortcuts/ui/ShortcutDetails;", "shortcutSelectController", "Lcom/google/assistant/plugin/shortcuts/controllers/ShortcutSelectController;", "shortcutTestController", "Lcom/google/assistant/plugin/shortcuts/controllers/ShortcutTestController;", "shortcutsAdbUtils", "Lcom/google/assistant/plugin/shortcuts/utils/ShortcutsAdbUtils;", "shortcutsTableModel", "Lcom/google/assistant/plugin/shortcuts/models/ShortcutsTableModel;", "shortcutsTablePanel", "Lcom/google/assistant/plugin/shortcuts/ui/ShortcutsTablePanel;", "shortcutsTypeController", "Lcom/google/assistant/plugin/shortcuts/controllers/ShortcutsTypeController;", "testShortcutButton", "Lcom/google/assistant/plugin/shortcuts/ui/ShortcutsTestButton;", "toolWindowManager", "Lcom/intellij/openapi/wm/ToolWindowManager;", "dispose", "", "onDeviceSelectionChanged", "device", "Lcom/google/assistant/plugin/appactions/state/DeviceProperties;", "openAppActionsToolWindow", "setPackageName", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/shortcuts/ui/ShortcutsPanel.class */
public final class ShortcutsPanel extends JPanel implements Disposable {
    private final Model model;
    private final ShortcutsTableModel shortcutsTableModel;
    private final ToolWindowManager toolWindowManager;
    private final ShortcutsAdbUtils shortcutsAdbUtils;
    protected final DeviceSelectionPanel deviceSelectionPanel;
    private final PackageNameDropdown packageNameDropdown;
    private final JLabel appNotFoundLabel;
    private final ShortcutsTablePanel shortcutsTablePanel;
    private final ShortcutDetails shortcutDetails;
    private final AdbCommand adbCommand;
    private final ShortcutsTestButton testShortcutButton;
    private final ShortcutsTypeController shortcutsTypeController;
    private final ShortcutSelectController shortcutSelectController;
    private final ShortcutTestController shortcutTestController;
    private final PackageNameSelectController appNameSelectController;

    public ShortcutsPanel(@NotNull final Project project) {
        Intrinsics.checkNotNullParameter(project, "project");
        this.model = new Model();
        this.shortcutsTableModel = new ShortcutsTableModel();
        this.toolWindowManager = ToolWindowManager.Companion.getInstance(project);
        this.shortcutsAdbUtils = new ShortcutsAdbUtils(project, this.model, this.shortcutsTableModel);
        this.deviceSelectionPanel = new DeviceSelectionPanel("");
        this.packageNameDropdown = new PackageNameDropdown(this.model, this.shortcutsTableModel);
        this.appNotFoundLabel = new JLabel("Could not read package name from the build file");
        this.shortcutsTablePanel = new ShortcutsTablePanel(this.shortcutsTableModel);
        this.shortcutDetails = new ShortcutDetails(this.model);
        this.adbCommand = new AdbCommand(this.model);
        this.testShortcutButton = new ShortcutsTestButton(this.model);
        this.shortcutsTypeController = new ShortcutsTypeController(this.shortcutsTableModel);
        this.shortcutSelectController = new ShortcutSelectController(this.model, this.shortcutsTableModel);
        this.shortcutTestController = new ShortcutTestController(this.shortcutsAdbUtils);
        this.appNameSelectController = new PackageNameSelectController(this.shortcutsTableModel);
        setEnabled(false);
        setPackageName(project);
        setLayout((LayoutManager) new BoxLayout((Container) this, 1));
        setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
        this.deviceSelectionPanel.setOnDeviceSelectionChangedListener(deviceProperties -> {
            onDeviceSelectionChanged(deviceProperties);
            return Unit.INSTANCE;
        });
        PluginSingletons.getOnlineDevicesStateSubject().subscribe(this, (onlineDevicesState, t2) -> {
            ShortcutsPanelExtKt.onDeviceStateUpdate(this, onlineDevicesState, t2);
        });
        HelpInfo deviceSelectHelpInfo = new HelpInfo(ConstantsKt.DEVICE_SELECT_HELP_TEXT, "Learn more", "https://www.google.com");
        NumberedLabel deviceLabel = new NumberedLabel(1, "Select device", deviceSelectHelpInfo);
        add((Component) deviceLabel);
        this.deviceSelectionPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 30, 10));
        this.deviceSelectionPanel.setMaximumSize(new Dimension(400, 70));
        this.deviceSelectionPanel.setAlignmentX(0.0f);
        add((Component) this.deviceSelectionPanel);
        HelpInfo shortcutSelectHelpInfo = new HelpInfo(ConstantsKt.SHORTCUT_SELECT_HELP_TEXT, "Learn more", "https://www.google.com");
        NumberedLabel shortcutsTableLabel = new NumberedLabel(2, "Select a shortcut to view details and test", shortcutSelectHelpInfo);
        add((Component) shortcutsTableLabel);
        RefreshButton refreshButton = new RefreshButton();
        refreshButton.addActionListener(new ActionListener() { // from class: com.google.assistant.plugin.shortcuts.ui.ShortcutsPanel.3
            public final void actionPerformed(ActionEvent it) {
                ShortcutsPanel.this.setPackageName(project);
                ShortcutsPanel.this.shortcutsAdbUtils.fetchShortcuts();
            }
        });
        ShortcutDropdown shortcutTypeDropdown = new ShortcutDropdown(new String[]{ShortcutType.DYNAMIC.getValue(), ShortcutType.STATIC.getValue()});
        shortcutTypeDropdown.setSelectedItem(this.shortcutsTableModel.getSelectedType().getValue());
        shortcutTypeDropdown.addItemListener(this.shortcutsTypeController);
        this.packageNameDropdown.addItemListener(this.appNameSelectController);
        ShortcutsTableControl shortcutsTableControl = new ShortcutsTableControl(refreshButton, shortcutTypeDropdown, this.packageNameDropdown);
        add((Component) shortcutsTableControl);
        this.appNotFoundLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
        add((Component) this.appNotFoundLabel);
        this.shortcutsTablePanel.addRowSelectListener(this.shortcutSelectController);
        add((Component) this.shortcutsTablePanel);
        add((Component) this.shortcutDetails);
        HelpInfo shortcutTestHelpInfo = new HelpInfo(ConstantsKt.SHORTCUT_TEST_HELP_TEXT, "Learn more", "https://www.google.com");
        NumberedLabel shortcutsTestLabel = new NumberedLabel(3, "Test Shortcut", shortcutTestHelpInfo);
        add((Component) shortcutsTestLabel);
        add((Component) this.adbCommand);
        this.testShortcutButton.addActionListener(this.shortcutTestController);
        add((Component) this.testShortcutButton);
        AppActionsHyperLink appActionsLink = new AppActionsHyperLink();
        appActionsLink.addActionListener(new ActionListener() { // from class: com.google.assistant.plugin.shortcuts.ui.ShortcutsPanel.4
            public final void actionPerformed(ActionEvent it) {
                ShortcutsPanel.this.openAppActionsToolWindow();
            }
        });
        add((Component) appActionsLink);
        setEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDeviceSelectionChanged(DeviceProperties device) {
        this.model.setSelectedDevice(device);
        if (device != null) {
            this.shortcutsAdbUtils.fetchShortcuts();
            return;
        }
        this.shortcutsTableModel.setSourceData(CollectionsKt.emptyList());
        Model model = this.model;
        ImmutableList<String> of = ImmutableList.of();
        Intrinsics.checkNotNullExpressionValue(of, "ImmutableList.of()");
        model.setPackageNameList(of);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPackageName(Project project) {
        this.appNotFoundLabel.setVisible(false);
        this.model.setPackageName(ProjectUtils.INSTANCE.readPackageNameSafely(project));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openAppActionsToolWindow() {
        ToolWindow appActionsToolWindow = this.toolWindowManager.getToolWindow(Constants.TOOLWINDOW_ID);
        if (appActionsToolWindow != null) {
            appActionsToolWindow.show();
        }
    }

    public void dispose() {
        this.model.clearAllListeners();
    }
}
