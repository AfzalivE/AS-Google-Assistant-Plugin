package com.google.assistant.plugin.appactions.ui;

import com.google.assistant.plugin.appactions.Constants;
import com.google.assistant.plugin.appactions.models.Model;
import com.google.assistant.plugin.appactions.state.AllProjectStateManagers;
import com.google.assistant.plugin.appactions.state.AndroidAppState;
import com.google.assistant.plugin.appactions.state.ProjectStateManager;
import com.google.assistant.plugin.appactions.ui.toolwindow.AppActionsPanel;
import com.google.assistant.plugin.appactions.ui.toolwindow.AppActionsTaskBackgroundable;
import com.google.assistant.plugin.appactions.ui.toolwindow.frames.AppActionsFrame;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.ui.ComboBox;
import com.intellij.ui.ContextHelpLabel;
import com.intellij.ui.JBColor;
import com.intellij.ui.components.JBLabel;
import com.intellij.ui.components.JBTextField;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jdesktop.swingx.prompt.PromptSupport;
import org.jetbrains.annotations.NotNull;

/* compiled from: CreatePreviewPanel.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n��\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\u0018��2\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u001dH\u0002J@\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\u0006\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*H\u0002J\b\u0010,\u001a\u00020\u001dH\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e¢\u0006\u0002\n��R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n��R\u000e\u0010\u0012\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0013\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0014\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0015\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n��\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n��\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u001b\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n��¨\u0006-"}, d2 = {"Lcom/google/assistant/plugin/appactions/ui/CreatePreviewPanel;", "Lcom/google/assistant/plugin/appactions/ui/toolwindow/frames/AppActionsFrame;", "model", "Lcom/google/assistant/plugin/appactions/models/Model;", "mainPanel", "Lcom/google/assistant/plugin/appactions/ui/toolwindow/AppActionsPanel;", "(Lcom/google/assistant/plugin/appactions/models/Model;Lcom/google/assistant/plugin/appactions/ui/toolwindow/AppActionsPanel;)V", "androidAppComboBox", "Lcom/intellij/openapi/ui/ComboBox;", "Lcom/google/assistant/plugin/appactions/state/AndroidAppState;", "appNameBalloon", "Lcom/intellij/ui/components/JBLabel;", "appNameField", "Lcom/intellij/ui/components/JBTextField;", "appNameLabel", "Ljavax/swing/JLabel;", "createPreviewPromptButton", "Ljavax/swing/JButton;", "createPreviewPromptLabel", "localeBalloon", "localeField", "localeLabel", "getMainPanel", "()Lcom/google/assistant/plugin/appactions/ui/toolwindow/AppActionsPanel;", "getModel", "()Lcom/google/assistant/plugin/appactions/models/Model;", "moduleLabel", "previewBalloon", "enableInputFields", "", "enable", "", "refresh", "specifyGridBagConstraints", "c", "Ljava/awt/GridBagConstraints;", "anchor", "", "gridy", "gridx", "fill", "weightx", "", "weighty", "updateAppModuleComboBox", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/ui/CreatePreviewPanel.class */
public final class CreatePreviewPanel extends AppActionsFrame {
    private final JLabel appNameLabel;
    private final JBTextField appNameField;
    protected ComboBox<AndroidAppState> androidAppComboBox;
    private final JBLabel appNameBalloon;
    private final JBTextField localeField;
    private final JBLabel localeBalloon;
    private final JBLabel createPreviewPromptLabel;
    private JButton createPreviewPromptButton;
    private final JBLabel previewBalloon;
    private final JLabel localeLabel;
    private final JBLabel moduleLabel;
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
    public CreatePreviewPanel(@NotNull Model model, @NotNull AppActionsPanel mainPanel) {
        super(model, mainPanel);
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(mainPanel, "mainPanel");
        this.model = model;
        this.mainPanel = mainPanel;
        this.appNameLabel = new JLabel("App name (optional) ");
        JBTextField $this$apply = new JBTextField("");
        $this$apply.setBorder(BorderFactory.createLineBorder(JBColor.LIGHT_GRAY));
        Unit unit = Unit.INSTANCE;
        this.appNameField = $this$apply;
        this.androidAppComboBox = new ComboBox<>();
        JBLabel createWithLink = ContextHelpLabel.createWithLink((String) null, Constants.APP_NAME_DESCRIPTION, "Learn more", CreatePreviewPanel$appNameBalloon$1.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(createWithLink, "ContextHelpLabel.createW….APP_NAME_LINK_URL)\n    }");
        this.appNameBalloon = createWithLink;
        JBTextField $this$apply2 = new JBTextField("");
        $this$apply2.setBorder(BorderFactory.createLineBorder(JBColor.LIGHT_GRAY));
        Unit unit2 = Unit.INSTANCE;
        this.localeField = $this$apply2;
        JBLabel createWithLink2 = ContextHelpLabel.createWithLink((String) null, Constants.LOCALE_DESCRIPTION, "Learn more", CreatePreviewPanel$localeBalloon$1.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(createWithLink2, "ContextHelpLabel.createW…ts.LOCALE_LINK_URL)\n    }");
        this.localeBalloon = createWithLink2;
        JBLabel $this$apply3 = new JBLabel();
        $this$apply3.setText("Create a preview to test your App Actions ");
        $this$apply3.setBackground(JBColor.PanelBackground);
        $this$apply3.setBorder(BorderFactory.createEmptyBorder());
        $this$apply3.setFont(new Font((String) null, 1, 13));
        Unit unit3 = Unit.INSTANCE;
        this.createPreviewPromptLabel = $this$apply3;
        this.createPreviewPromptButton = new JButton("Create Preview");
        JBLabel createWithLink3 = ContextHelpLabel.createWithLink((String) null, "Create a preview of your App Actions to test how Assistant handles your App Action with various parameters before submitting your app for review. Previews are only accessible to your individual Google account. Note: This plugin requires Internet connectivity to create previews.", "Learn more", CreatePreviewPanel$previewBalloon$1.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(createWithLink3, "ContextHelpLabel.createW…wse(previewLinkUrl)\n    }");
        this.previewBalloon = createWithLink3;
        this.localeLabel = new JLabel("Locale (optional) ");
        this.moduleLabel = new JBLabel("Module");
        refresh();
        updateAppModuleComboBox();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refresh() {
        removeAll();
        this.appNameLabel.setFont(new Font((String) null, 0, 13));
        this.localeLabel.setFont(new Font((String) null, 0, 13));
        setBorder(BorderFactory.createEmptyBorder(0, 10, 40, 10));
        PromptSupport.setPrompt(Constants.DEFAULT_INVOCATION_NAME, this.appNameField);
        PromptSupport.setPrompt(Constants.DEFAULT_LOCALE, this.localeField);
        this.androidAppComboBox = new ComboBox<>();
        this.androidAppComboBox.addActionListener(new ActionListener() { // from class: com.google.assistant.plugin.appactions.ui.CreatePreviewPanel$refresh$1
            public final void actionPerformed(ActionEvent it) {
                ComboBox comboBox;
                Model model = CreatePreviewPanel.this.getModel();
                comboBox = CreatePreviewPanel.this.androidAppComboBox;
                model.setSelectedAndroidAppState((AndroidAppState) comboBox.getSelectedItem());
            }
        });
        this.createPreviewPromptButton = new JButton("Create Preview");
        this.createPreviewPromptButton.addActionListener(new ActionListener() { // from class: com.google.assistant.plugin.appactions.ui.CreatePreviewPanel$refresh$2
            public final void actionPerformed(ActionEvent it) {
                JBTextField jBTextField;
                JBTextField jBTextField2;
                String str;
                ComboBox comboBox;
                CreatePreviewPanel.this.enableInputFields(false);
                Model model = CreatePreviewPanel.this.getModel();
                jBTextField = CreatePreviewPanel.this.appNameField;
                String text = jBTextField.getText();
                Intrinsics.checkNotNullExpressionValue(text, "appNameField.text");
                model.setInvocationName(text);
                Model model2 = CreatePreviewPanel.this.getModel();
                jBTextField2 = CreatePreviewPanel.this.localeField;
                String text2 = jBTextField2.getText();
                if (text2.length() == 0) {
                    model2 = model2;
                    str = Constants.DEFAULT_LOCALE;
                } else {
                    str = text2;
                }
                model2.setLocale(str);
                if (CreatePreviewPanel.this.getModel().getAndroidAppsArrayList().size() >= 1) {
                    Model model3 = CreatePreviewPanel.this.getModel();
                    comboBox = CreatePreviewPanel.this.androidAppComboBox;
                    model3.setSelectedAndroidAppState((AndroidAppState) comboBox.getSelectedItem());
                }
                AppActionsTaskBackgroundable createPreviewAndFetchIntentsTask$default = AppActionsFrame.createPreviewAndFetchIntentsTask$default(CreatePreviewPanel.this, null, 1, null);
                ProgressManager.getInstance().run(createPreviewAndFetchIntentsTask$default);
                createPreviewAndFetchIntentsTask$default.setOnFinishedHandler(() -> {
                    enableInputFields(true);
                    return Unit.INSTANCE;
                });
            }
        });
        setLayout((LayoutManager) new BorderLayout());
        JPanel box = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        specifyGridBagConstraints(c, 21, 0, 0, 2, 1.0d, 0.0d);
        Box box2 = new Box(0);
        box2.setBorder(BorderFactory.createEmptyBorder(15, 0, 5, 0));
        box2.add(this.createPreviewPromptLabel);
        box2.add(this.previewBalloon);
        Unit unit = Unit.INSTANCE;
        box.add(box2, c);
        int gridy = 0 + 1;
        specifyGridBagConstraints(c, 21, gridy, 0, 2, 1.0d, 0.0d);
        Box box3 = new Box(0);
        box3.setBorder(BorderFactory.createEmptyBorder(15, 0, 5, 0));
        box3.add(this.appNameLabel);
        box3.add(this.appNameBalloon);
        Unit unit2 = Unit.INSTANCE;
        box.add(box3, c);
        int gridy2 = gridy + 1;
        specifyGridBagConstraints(c, 21, gridy2, 0, 2, 1.0d, 0.0d);
        box.add(this.appNameField, c);
        int gridy3 = gridy2 + 1;
        specifyGridBagConstraints(c, 21, gridy3, 0, 2, 1.0d, 0.0d);
        Box box4 = new Box(0);
        box4.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));
        box4.add(this.localeLabel);
        box4.add(this.localeBalloon);
        Unit unit3 = Unit.INSTANCE;
        box.add(box4, c);
        int gridy4 = gridy3 + 1;
        specifyGridBagConstraints(c, 21, gridy4, 0, 2, 1.0d, 0.0d);
        Box box5 = new Box(0);
        box5.add(this.localeField);
        Unit unit4 = Unit.INSTANCE;
        box.add(box5, c);
        if (getModel().getAndroidAppsArrayList().size() > 1) {
            int gridy5 = gridy4 + 1;
            specifyGridBagConstraints(c, 21, gridy5, 0, 2, 1.0d, 0.0d);
            Box box6 = new Box(0);
            box6.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));
            box6.add(this.moduleLabel);
            Unit unit5 = Unit.INSTANCE;
            box.add(box6, c);
            gridy4 = gridy5 + 1;
            specifyGridBagConstraints(c, 21, gridy4, 0, 2, 1.0d, 0.0d);
            Box box7 = new Box(0);
            box7.add(this.androidAppComboBox);
            Unit unit6 = Unit.INSTANCE;
            box.add(box7, c);
        }
        specifyGridBagConstraints(c, 21, gridy4 + 1, 0, 2, 1.0d, 0.0d);
        Box box8 = new Box(0);
        box8.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));
        box8.add(this.createPreviewPromptButton);
        Unit unit7 = Unit.INSTANCE;
        box.add(box8, c);
        add((Component) box, "North");
    }

    private final void specifyGridBagConstraints(GridBagConstraints c, int anchor, int gridy, int gridx, int fill, double weightx, double weighty) {
        c.anchor = anchor;
        c.gridy = gridy;
        c.gridx = gridx;
        c.fill = fill;
        c.weightx = weightx;
        c.weighty = weighty;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enableInputFields(boolean enable) {
        this.localeField.setEnabled(enable);
        this.appNameField.setEnabled(enable);
        this.createPreviewPromptButton.setEnabled(enable);
        this.androidAppComboBox.setEnabled(enable);
    }

    private final void updateAppModuleComboBox() {
        ProjectStateManager projectStateManager = AllProjectStateManagers.INSTANCE.get(getModel().getProject());
        if (projectStateManager != null) {
            projectStateManager.getStateObservable().subscribe(getModel().getProject(), (projectState, t2) -> {
                CreatePreviewPanel_updateAppModuleComboBox_1Kt.updateAppModuleComboBox(this, projectState, t2);
            });
        }
    }
}
