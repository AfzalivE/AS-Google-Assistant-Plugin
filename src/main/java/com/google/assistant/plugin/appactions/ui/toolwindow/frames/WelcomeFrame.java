package com.google.assistant.plugin.appactions.ui.toolwindow.frames;

import com.google.assistant.plugin.appactions.Constants;
import com.google.assistant.plugin.appactions.models.Model;
import com.google.assistant.plugin.appactions.models.PluginState;
import com.google.assistant.plugin.appactions.ui.CreatePreviewPanel;
import com.google.assistant.plugin.appactions.ui.LinkPanel;
import com.google.assistant.plugin.appactions.ui.toolwindow.AppActionsPanel;
import com.google.assistant.plugin.common.utils.LoggingUtils;
import com.google.gct.login.GoogleLogin;
import com.google.gct.login.IGoogleLoginCompletedCallback;
import com.google.gct.login.InvalidThreadTypeException;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.application.ModalityState;
import com.intellij.ui.JBColor;
import com.intellij.ui.components.JBLabel;
import com.intellij.ui.components.JBTextArea;
import com.intellij.ui.components.labels.LinkLabel;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: WelcomeFrame.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018��2\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0002J\b\u0010\u001d\u001a\u00020\u001bH\u0002J\b\u0010\u001e\u001a\u00020\u001bH\u0002J\b\u0010\u001f\u001a\u00020\u001bH\u0002J\b\u0010 \u001a\u00020!H\u0002J\u0006\u0010\"\u001a\u00020!R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n��R\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\rX\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n��\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n��\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n��¨\u0006#"}, d2 = {"Lcom/google/assistant/plugin/appactions/ui/toolwindow/frames/WelcomeFrame;", "Lcom/google/assistant/plugin/appactions/ui/toolwindow/frames/AppActionsFrame;", "model", "Lcom/google/assistant/plugin/appactions/models/Model;", "mainPanel", "Lcom/google/assistant/plugin/appactions/ui/toolwindow/AppActionsPanel;", "(Lcom/google/assistant/plugin/appactions/models/Model;Lcom/google/assistant/plugin/appactions/ui/toolwindow/AppActionsPanel;)V", "createPreviewPanel", "Lcom/google/assistant/plugin/appactions/ui/CreatePreviewPanel;", "descriptionLabel1", "Ljavax/swing/JLabel;", "descriptionLabel2", "helpLink", "Lcom/intellij/ui/components/labels/LinkLabel;", "", "kotlin.jvm.PlatformType", "linkPanel", "Lcom/google/assistant/plugin/appactions/ui/LinkPanel;", "getMainPanel", "()Lcom/google/assistant/plugin/appactions/ui/toolwindow/AppActionsPanel;", "getModel", "()Lcom/google/assistant/plugin/appactions/models/Model;", "signInButton", "Ljavax/swing/JButton;", "signLabel", "Lcom/intellij/ui/components/JBTextArea;", "getDescriptionSection", "Ljavax/swing/JPanel;", "getRequirementSteps", "getRequirementTitle", "getSignInSection", "getWelcomeTitle", "login", "", "refresh", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/ui/toolwindow/frames/WelcomeFrame.class */
public final class WelcomeFrame extends AppActionsFrame {
    private final JBTextArea signLabel;
    private final JButton signInButton;
    private final LinkLabel<Object> helpLink;
    private final CreatePreviewPanel createPreviewPanel;
    private final JLabel descriptionLabel1;
    private final JLabel descriptionLabel2;
    private final LinkPanel linkPanel;
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
    public WelcomeFrame(@NotNull Model model, @NotNull AppActionsPanel mainPanel) {
        super(model, mainPanel);
        String str;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(mainPanel, "mainPanel");
        this.model = model;
        this.mainPanel = mainPanel;
        JBTextArea $this$apply = new JBTextArea();
        str = WelcomeFrameKt.NOT_SIGNED_IN_LABEL_TEXT;
        $this$apply.setText(str);
        $this$apply.setAlignmentX(0.0f);
        $this$apply.setBackground(JBColor.PanelBackground);
        $this$apply.setEditable(false);
        $this$apply.setLineWrap(true);
        $this$apply.setWrapStyleWord(true);
        $this$apply.setFont(new Font("Dialog", 0, 12));
        Unit unit = Unit.INSTANCE;
        this.signLabel = $this$apply;
        JButton $this$apply2 = new JButton("Sign In");
        $this$apply2.addActionListener(new ActionListener() { // from class: com.google.assistant.plugin.appactions.ui.toolwindow.frames.WelcomeFrame$$special$$inlined$apply$lambda$1
            public final void actionPerformed(ActionEvent it) {
                WelcomeFrame.this.login();
            }
        });
        $this$apply2.setMargin(new Insets(0, 0, 0, 0));
        Unit unit2 = Unit.INSTANCE;
        this.signInButton = $this$apply2;
        LinkLabel $this$apply3 = new LinkLabel("Learn more", (Icon) null, WelcomeFrame$helpLink$1.INSTANCE);
        $this$apply3.setFont(new Font("Dialog", 0, 12));
        Unit unit3 = Unit.INSTANCE;
        this.helpLink = $this$apply3;
        this.createPreviewPanel = new CreatePreviewPanel(getModel(), getMainPanel());
        JLabel $this$apply4 = new JLabel();
        $this$apply4.setText("Test your App Action intents and how");
        $this$apply4.setFont(new Font("Dialog", 0, 12));
        $this$apply4.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        $this$apply4.setHorizontalAlignment(0);
        Unit unit4 = Unit.INSTANCE;
        this.descriptionLabel1 = $this$apply4;
        JLabel $this$apply5 = new JLabel();
        $this$apply5.setText("it handles various parameters.");
        $this$apply5.setFont(new Font("Dialog", 0, 12));
        $this$apply5.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        $this$apply5.setHorizontalAlignment(0);
        Unit unit5 = Unit.INSTANCE;
        this.descriptionLabel2 = $this$apply5;
        this.linkPanel = new LinkPanel();
        refresh();
    }

    public final void refresh() {
        removeAll();
        JPanel internalVerticalPanel = new JPanel(new GridBagLayout());
        setLayout((LayoutManager) new BorderLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.gridy++;
        c.gridx = 0;
        c.fill = 2;
        c.weightx = 1.0d;
        c.anchor = 11;
        internalVerticalPanel.add(getWelcomeTitle(), c);
        c.gridy++;
        c.fill = 0;
        c.gridwidth = 0;
        JPanel jPanel = new JPanel(new BorderLayout());
        jPanel.add(getDescriptionSection(), "Center");
        Unit unit = Unit.INSTANCE;
        internalVerticalPanel.add(jPanel, c);
        c.gridy++;
        JPanel jPanel2 = new JPanel(new BorderLayout());
        jPanel2.add(this.helpLink, "Center");
        jPanel2.setBorder(BorderFactory.createEmptyBorder(0, 0, 40, 0));
        Unit unit2 = Unit.INSTANCE;
        internalVerticalPanel.add(jPanel2, c);
        GoogleLogin googleLogin = GoogleLogin.getInstance();
        Intrinsics.checkNotNullExpressionValue(googleLogin, "GoogleLogin.getInstance()");
        if (googleLogin.isLoggedIn()) {
            c.gridy++;
            c.gridx = 0;
            c.fill = 1;
            c.weightx = 1.0d;
            JPanel jPanel3 = new JPanel(new BorderLayout());
            jPanel3.add(this.createPreviewPanel, "Center");
            Unit unit3 = Unit.INSTANCE;
            internalVerticalPanel.add(jPanel3, c);
        }
        c.gridy++;
        c.gridx = 0;
        c.fill = 1;
        c.weightx = 1.0d;
        c.anchor = 21;
        internalVerticalPanel.add(getSignInSection(), c);
        c.gridy++;
        c.gridx = 0;
        c.fill = 1;
        c.weightx = 1.0d;
        JPanel jPanel4 = new JPanel(new BorderLayout());
        jPanel4.add(getRequirementTitle(), "West");
        jPanel4.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
        Unit unit4 = Unit.INSTANCE;
        internalVerticalPanel.add(jPanel4, c);
        c.gridy++;
        c.fill = 1;
        c.fill = 1;
        JPanel jPanel5 = new JPanel(new BorderLayout());
        jPanel5.add(getRequirementSteps(), "South");
        Unit unit5 = Unit.INSTANCE;
        internalVerticalPanel.add(jPanel5, c);
        add((Component) internalVerticalPanel, "North");
        add((Component) this.linkPanel, "South");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void login() {
        try {
            getModel().setState(PluginState.LOGGED_IN_NO_PREVIEW);
            getMainPanel().refreshState();
            GoogleLogin.promptToLogIn((String) null, new IGoogleLoginCompletedCallback() { // from class: com.google.assistant.plugin.appactions.ui.toolwindow.frames.WelcomeFrame$login$1
                public final void onLoginCompleted() {
                    ApplicationManager.getApplication().invokeLater(new Runnable() { // from class: com.google.assistant.plugin.appactions.ui.toolwindow.frames.WelcomeFrame$login$1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            GoogleLogin googleLogin = GoogleLogin.getInstance();
                            Intrinsics.checkNotNullExpressionValue(googleLogin, "GoogleLogin.getInstance()");
                            if (!googleLogin.isLoggedIn()) {
                                WelcomeFrame.this.getModel().setState(PluginState.WELCOME_PAGE);
                            } else {
                                if ((!WelcomeFrame.this.getModel().getSupportedIntents().isEmpty()) && WelcomeFrame.this.getModel().getAssistantLink() != null) {
                                    WelcomeFrame.this.getModel().setState(PluginState.LOGGED_IN_PREVIEW_EXISTS);
                                } else {
                                    WelcomeFrame.this.getModel().setState(PluginState.LOGGED_IN_NO_PREVIEW);
                                }
                            }
                            WelcomeFrame.this.getMainPanel().refreshState();
                        }
                    }, ModalityState.any());
                }
            });
        } catch (InvalidThreadTypeException e) {
            LoggingUtils.INSTANCE.error("Something went wrong when attempting to login", e);
            e.printStackTrace();
        }
    }

    private final JPanel getWelcomeTitle() {
        JPanel titlePanel = new JPanel();
        JLabel jLabel = new JLabel(Constants.APP_NAME);
        jLabel.setFont(new Font((String) null, 1, 15));
        jLabel.setBorder(BorderFactory.createEmptyBorder(30, 0, 0, 0));
        titlePanel.add(jLabel);
        return titlePanel;
    }

    private final JPanel getDescriptionSection() {
        JPanel $this$apply = new JPanel(new BorderLayout());
        $this$apply.add(this.descriptionLabel1, "North");
        $this$apply.add(this.descriptionLabel2, "Center");
        return $this$apply;
    }

    private final JPanel getRequirementTitle() {
        JBLabel jBLabel = new JBLabel("Requirements");
        jBLabel.setFont(new Font((String) null, 1, 14));
        jBLabel.setHorizontalAlignment(2);
        JPanel $this$apply = new JPanel(new BorderLayout());
        $this$apply.setBorder(BorderFactory.createEmptyBorder());
        $this$apply.add(jBLabel, "Center");
        return $this$apply;
    }

    private final JPanel getRequirementSteps() {
        String str;
        JBTextArea jBTextArea = new JBTextArea();
        str = WelcomeFrameKt.REQUIREMENTS_LABEL;
        jBTextArea.setText(str);
        jBTextArea.setBackground(JBColor.PanelBackground);
        jBTextArea.setEditable(false);
        jBTextArea.setLineWrap(true);
        jBTextArea.setWrapStyleWord(true);
        jBTextArea.setBorder(BorderFactory.createEmptyBorder());
        jBTextArea.setFont(new Font("Dialog", 0, 12));
        jBTextArea.setMaximumSize(new Dimension(200, 60));
        JPanel $this$apply = new JPanel();
        $this$apply.setLayout(new BorderLayout());
        $this$apply.add(jBTextArea);
        $this$apply.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
        return $this$apply;
    }

    private final JPanel getSignInSection() {
        String str;
        StringBuilder append = new StringBuilder().append("\n            Signed in as ");
        GoogleLogin googleLogin = GoogleLogin.getInstance();
        Intrinsics.checkNotNullExpressionValue(googleLogin, "GoogleLogin.getInstance()");
        String signedInLabelText = StringsKt.trimIndent(append.append(googleLogin.getEmail()).append(" in Android Studio.\n        ").toString());
        Box box = Box.createVerticalBox();
        GoogleLogin googleLogin2 = GoogleLogin.getInstance();
        Intrinsics.checkNotNullExpressionValue(googleLogin2, "GoogleLogin.getInstance()");
        if (googleLogin2.isLoggedIn()) {
            this.signLabel.setText(signedInLabelText);
            box.add(this.signLabel);
        } else {
            JBTextArea jBTextArea = this.signLabel;
            str = WelcomeFrameKt.NOT_SIGNED_IN_LABEL_TEXT;
            jBTextArea.setText(str);
            box.add(this.signLabel);
            box.add(this.signInButton);
        }
        JPanel borderPanel = new JPanel(new BorderLayout());
        borderPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        borderPanel.add(box, "Center");
        return borderPanel;
    }
}
