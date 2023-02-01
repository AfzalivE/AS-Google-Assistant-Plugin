package com.google.assistant.plugin.appactions.ui;

import com.google.assistant.plugin.appactions.Constants;
import com.google.assistant.plugin.appactions.models.Model;
import com.google.assistant.plugin.common.utils.PluginUtils;
import com.intellij.ui.JBColor;
import com.intellij.ui.components.JBTextArea;
import com.intellij.ui.components.JBTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AppDataPanel.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n��\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\u0018��2\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010/\u001a\u00020#J\u000e\u00100\u001a\u00020#2\u0006\u00101\u001a\u00020\u0006J\b\u00102\u001a\u00020#H\u0002J\u0010\u00103\u001a\u00020#2\u0006\u00104\u001a\u00020\u0006H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n��R(\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n��R$\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R(\u0010\u0016\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u000b\"\u0004\b\u0018\u0010\rR\u000e\u0010\u0019\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n��R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u0004R(\u0010\u001d\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u000b\"\u0004\b\u001f\u0010\rR\u000e\u0010 \u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n��R\"\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010(\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u0082\u000e¢\u0006\u0002\n��R\u000e\u0010-\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010.\u001a\u00020\u0001X\u0082\u000e¢\u0006\u0002\n��¨\u00065"}, d2 = {"Lcom/google/assistant/plugin/appactions/ui/AppDataPanel;", "Ljavax/swing/JPanel;", "model", "Lcom/google/assistant/plugin/appactions/models/Model;", "(Lcom/google/assistant/plugin/appactions/models/Model;)V", "_isPreviewInSync", "", "value", "", "appName", "getAppName", "()Ljava/lang/String;", "setAppName", "(Ljava/lang/String;)V", "appNameTextField", "Lcom/intellij/ui/components/JBTextField;", "deletePreviewButton", "Ljavax/swing/JButton;", "isPreviewInSync", "()Z", "setPreviewInSync", "(Z)V", "locale", "getLocale", "setLocale", "localeTextField", "getModel", "()Lcom/google/assistant/plugin/appactions/models/Model;", "setModel", "moduleName", "getModuleName", "setModuleName", "moduleNameField", "onDeletePreviewClicked", "Lkotlin/Function0;", "", "getOnDeletePreviewClicked", "()Lkotlin/jvm/functions/Function0;", "setOnDeletePreviewClicked", "(Lkotlin/jvm/functions/Function0;)V", "onUpdatePreviewClicked", "getOnUpdatePreviewClicked", "setOnUpdatePreviewClicked", "previewTimerTask", "Ljava/util/TimerTask;", "updatePreviewButton", "verticalPanel", "cancelPreviewExpirationTimer", "enableInputFields", "enable", "startPreviewExpirationTimer", "updatePreviewState", "isInSyncState", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/ui/AppDataPanel.class */
public final class AppDataPanel extends JPanel {
    private JPanel verticalPanel;
    private final JBTextField appNameTextField;
    private JBTextField localeTextField;
    private final JBTextField moduleNameField;
    private final JButton updatePreviewButton;
    private final JButton deletePreviewButton;
    private TimerTask previewTimerTask;
    @Nullable
    private Function0<Unit> onDeletePreviewClicked;
    @Nullable
    private Function0<Unit> onUpdatePreviewClicked;
    private boolean _isPreviewInSync;
    @NotNull
    private Model model;

    @NotNull
    public final Model getModel() {
        return this.model;
    }

    public final void setModel(@NotNull Model model) {
        Intrinsics.checkNotNullParameter(model, "<set-?>");
        this.model = model;
    }

    public AppDataPanel(@NotNull Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.model = model;
        JPanel jPanel = new JPanel();
        jPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(5, 10, 5, 10, JBColor.PanelBackground), ""));
        jPanel.setLayout(new BoxLayout(jPanel, 3));
        jPanel.setBackground(JBColor.PanelBackground);
        Unit unit = Unit.INSTANCE;
        this.verticalPanel = jPanel;
        JBTextField $this$apply = new JBTextField("App name: test app action");
        $this$apply.setEditable(false);
        $this$apply.setToolTipText("To edit the Preview properties, delete the preview");
        Unit unit2 = Unit.INSTANCE;
        this.appNameTextField = $this$apply;
        JBTextField $this$apply2 = new JBTextField();
        $this$apply2.setEditable(false);
        Unit unit3 = Unit.INSTANCE;
        this.localeTextField = $this$apply2;
        JBTextField $this$apply3 = new JBTextField();
        $this$apply3.setEditable(false);
        Unit unit4 = Unit.INSTANCE;
        this.moduleNameField = $this$apply3;
        JButton $this$apply4 = new JButton("Update");
        $this$apply4.addActionListener(new ActionListener() { // from class: com.google.assistant.plugin.appactions.ui.AppDataPanel$$special$$inlined$apply$lambda$1
            public final void actionPerformed(ActionEvent it) {
                Function0<Unit> onUpdatePreviewClicked = AppDataPanel.this.getOnUpdatePreviewClicked();
                if (onUpdatePreviewClicked != null) {
                    Unit unit5 = (Unit) onUpdatePreviewClicked.invoke();
                }
            }
        });
        Unit unit5 = Unit.INSTANCE;
        this.updatePreviewButton = $this$apply4;
        JButton $this$apply5 = new JButton("Delete preview");
        $this$apply5.addActionListener(new ActionListener() { // from class: com.google.assistant.plugin.appactions.ui.AppDataPanel$$special$$inlined$apply$lambda$2
            public final void actionPerformed(ActionEvent it) {
                Function0<Unit> onDeletePreviewClicked = AppDataPanel.this.getOnDeletePreviewClicked();
                if (onDeletePreviewClicked != null) {
                    Unit unit6 = (Unit) onDeletePreviewClicked.invoke();
                }
            }
        });
        Unit unit6 = Unit.INSTANCE;
        this.deletePreviewButton = $this$apply5;
        setLayout((LayoutManager) new BoxLayout((Container) this, 3));
        Box box = new Box(0);
        box.setOpaque(true);
        box.add(this.moduleNameField);
        Box box2 = new Box(0);
        box2.setOpaque(true);
        box2.add(this.appNameTextField);
        Box box3 = new Box(0);
        box3.setOpaque(true);
        box3.add(this.localeTextField);
        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new BoxLayout((Container) jPanel2, 0));
        jPanel2.add(this.updatePreviewButton);
        jPanel2.add(this.deletePreviewButton);
        jPanel2.setAlignmentX(0.0f);
        jPanel2.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        JPanel $this$apply6 = this.verticalPanel;
        $this$apply6.add(box2);
        $this$apply6.add(box3);
        if (this.model.getAndroidAppsArrayList().size() > 1) {
            $this$apply6.add(box);
        }
        add((Component) this.verticalPanel);
        add((Component) new JSeparator(0));
        JPanel $this$apply7 = new JPanel(new BorderLayout());
        $this$apply7.add(jPanel2);
        Unit unit7 = Unit.INSTANCE;
        add((Component) $this$apply7);
        JPanel $this$apply8 = new JPanel(new BorderLayout());
        $this$apply8.setBorder(BorderFactory.createEmptyBorder(0, 10, 5, 10));
        JBTextArea jBTextArea = new JBTextArea("Apply changes from shortcuts.xml and update preview");
        jBTextArea.setForeground(Color.DARK_GRAY);
        jBTextArea.setFont(new Font((String) null, 0, 13));
        jBTextArea.setAlignmentX(0.0f);
        jBTextArea.setBackground(JBColor.PanelBackground);
        jBTextArea.setEditable(false);
        jBTextArea.setLineWrap(true);
        jBTextArea.setWrapStyleWord(true);
        jBTextArea.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 0));
        Unit unit8 = Unit.INSTANCE;
        $this$apply8.add(jBTextArea);
        Unit unit9 = Unit.INSTANCE;
        add((Component) $this$apply8);
        updatePreviewState(false);
    }

    @Nullable
    public final String getAppName() {
        return this.appNameTextField.getText();
    }

    public final void setAppName(@Nullable String value) {
        this.appNameTextField.setText("App name: " + value);
    }

//    @Nullable
//    public final String getLocale() {
//        return this.localeTextField.getText();
//    }

    public final void setLocale(@Nullable String value) {
        this.localeTextField.setText("Locale: " + value);
    }

    @Nullable
    public final String getModuleName() {
        return this.moduleNameField.getText();
    }

    public final void setModuleName(@Nullable String value) {
        if (value != null) {
            int index = StringsKt.indexOf(value, ".", 0, false);
            JBTextField jBTextField = this.moduleNameField;
            StringBuilder append = new StringBuilder().append("Module: ");
            String substring = value.substring(index + 1);
            Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
            jBTextField.setText(append.append(substring).toString());
        }
    }

    @Nullable
    public final Function0<Unit> getOnDeletePreviewClicked() {
        return this.onDeletePreviewClicked;
    }

    public final void setOnDeletePreviewClicked(@Nullable Function0<Unit> function0) {
        this.onDeletePreviewClicked = function0;
    }

    @Nullable
    public final Function0<Unit> getOnUpdatePreviewClicked() {
        return this.onUpdatePreviewClicked;
    }

    public final void setOnUpdatePreviewClicked(@Nullable Function0<Unit> function0) {
        this.onUpdatePreviewClicked = function0;
    }

    public final boolean isPreviewInSync() {
        return this._isPreviewInSync;
    }

    public final void setPreviewInSync(boolean value) {
        this._isPreviewInSync = true;
        updatePreviewState(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updatePreviewState(boolean isInSyncState) {
        if (isInSyncState) {
            this.updatePreviewButton.setIcon(PluginUtils.INSTANCE.inSyncIcon);
            this.updatePreviewButton.setForeground(JBColor.foreground());
            JButton jButton = this.updatePreviewButton;
            Object[] objArr = {Long.valueOf(TimeUnit.MILLISECONDS.toHours(Constants.INSTANCE.getPreviewExpirationTime()))};
            String format = String.format(Constants.IN_SYNC_PREVIEW_MESSAGE, Arrays.copyOf(objArr, objArr.length));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            jButton.setToolTipText(format);
            startPreviewExpirationTimer();
            return;
        }
        this.updatePreviewButton.setIcon(PluginUtils.INSTANCE.outOfSyncIcon);
        Color outOfSyncColor = new Color(204, 96, 99);
        this.updatePreviewButton.setForeground(new JBColor(outOfSyncColor, outOfSyncColor));
        this.updatePreviewButton.setToolTipText(Constants.OUT_OF_SYNC_PREVIEW_MESSAGE);
    }

    private final void startPreviewExpirationTimer() {
        cancelPreviewExpirationTimer();
        this.previewTimerTask = new TimerTask() { // from class: com.google.assistant.plugin.appactions.ui.AppDataPanel$startPreviewExpirationTimer$1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                AppDataPanel.this.updatePreviewState(false);
            }
        };
        new Timer().schedule(this.previewTimerTask, Constants.INSTANCE.getPreviewExpirationTime());
    }

    public final void cancelPreviewExpirationTimer() {
        if (this.previewTimerTask != null) {
            TimerTask timerTask = this.previewTimerTask;
            Intrinsics.checkNotNull(timerTask);
            timerTask.cancel();
        }
    }

    public final void enableInputFields(boolean enable) {
        this.updatePreviewButton.setEnabled(enable);
        this.deletePreviewButton.setEnabled(enable);
    }
}
