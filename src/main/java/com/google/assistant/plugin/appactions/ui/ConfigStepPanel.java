package com.google.assistant.plugin.appactions.ui;

import actions.Plugin;
import com.google.assistant.plugin.appactions.Constants;
import com.intellij.json.JsonFileType;
import com.intellij.json.JsonLanguage;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.EditorFactory;
import com.intellij.openapi.editor.EditorSettings;
import com.intellij.openapi.editor.event.DocumentEvent;
import com.intellij.openapi.editor.event.DocumentListener;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.ComboBox;
import com.intellij.psi.codeStyle.CommonCodeStyleSettings;
import com.intellij.ui.ContextHelpLabel;
import com.intellij.ui.JBColor;
import com.intellij.ui.components.JBLabel;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

import org.json.JSONException;
import org.json.JSONObject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ConfigStepPanel.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\u0018��2\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u0005H\u0002J\u000e\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020%J\u0010\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u0019H\u0002J\u0012\u0010(\u001a\u00020\u00052\b\u0010)\u001a\u0004\u0018\u00010\u0005H\u0002J\u001c\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00042\u0006\u0010+\u001a\u00020\rH\u0002J\u001a\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00050-2\u0006\u0010+\u001a\u00020\rJ\b\u0010.\u001a\u00020\u0010H\u0002J\b\u0010/\u001a\u00020\u0010H\u0002J\u001a\u00100\u001a\u00020\u00102\b\u0010+\u001a\u0004\u0018\u00010\r2\u0006\u0010'\u001a\u00020\u0019H\u0002J\u0016\u00101\u001a\u00020\u00102\f\u00102\u001a\b\u0012\u0004\u0012\u00020\r03H\u0002J\u0014\u00104\u001a\u00020\u00102\f\u00102\u001a\b\u0012\u0004\u0012\u00020\r03R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u000e¢\u0006\u0002\n��R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bX\u0082\u0004¢\u0006\u0002\n��R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R&\u0010\u0018\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00040\u0004X\u0082\u0004¢\u0006\u0002\n��R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u001f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010 \u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n��¨\u00065"}, d2 = {"Lcom/google/assistant/plugin/appactions/ui/ConfigStepPanel;", "Ljavax/swing/JPanel;", "()V", "cardPanels", "Ljava/util/HashMap;", "", "Ljavax/swing/Box;", "exampleParameterComboBox", "Lcom/intellij/openapi/ui/ComboBox;", "Lcom/google/assistant/plugin/appactions/ui/ExampleParameter;", "helpLabel", "Lcom/intellij/ui/components/JBLabel;", "intentComboBox", "Lplugin/actions/Plugin$AndroidActionPackageResponse$SupportedIntent;", "onIntentParameterChangedListener", "Lkotlin/Function0;", "", "getOnIntentParameterChangedListener", "()Lkotlin/jvm/functions/Function0;", "setOnIntentParameterChangedListener", "(Lkotlin/jvm/functions/Function0;)V", "onIntentSelectionChangedListener", "getOnIntentSelectionChangedListener", "setOnIntentSelectionChangedListener", "paramTextAreas", "Lplugin/actions/Plugin$AndroidActionPackageResponse$SupportedIntent$SupportedParameter;", "Lcom/intellij/openapi/editor/Editor;", "selectedIntent", "getSelectedIntent", "()Lplugin/actions/Plugin$AndroidActionPackageResponse$SupportedIntent;", "titleBox", "titleLabel", "visibleCardPanel", "createEditorComponent", "formattedExample", "enableInputFields", "enable", "", "formatExample", "supportedParameter", "formatJson", "exampleValue", "getIntentParameterTextAreas", "intent", "getParametersForIntent", "", "onExampleParameterChanged", "onIntentSelectionChanged", "populateExampleParameterComboBox", "populateUi", "intents", "", "setIntents", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/ui/ConfigStepPanel.class */
public final class ConfigStepPanel extends JPanel {
    private final ComboBox<Plugin.AndroidActionPackageResponse.SupportedIntent> intentComboBox;
    private final ComboBox<ExampleParameter> exampleParameterComboBox;
    private Box visibleCardPanel;
    private HashMap<String, Box> cardPanels;
    private final HashMap<Plugin.AndroidActionPackageResponse.SupportedIntent, HashMap<Plugin.AndroidActionPackageResponse.SupportedIntent.SupportedParameter, Editor>> paramTextAreas;
    @Nullable
    private Function0<Unit> onIntentSelectionChangedListener;
    @Nullable
    private Function0<Unit> onIntentParameterChangedListener;
    private final JBLabel helpLabel;
    private final JBLabel titleLabel;
    private final JPanel titleBox;

    public ConfigStepPanel() {
        super(new BorderLayout());
        this.intentComboBox = new ComboBox<>();
        this.exampleParameterComboBox = new ComboBox<>();
        Box $this$apply = new Box(1);
        $this$apply.setBorder(BorderFactory.createEmptyBorder(0, 3, 0, 3));
        Unit unit = Unit.INSTANCE;
        this.visibleCardPanel = $this$apply;
        this.cardPanels = new HashMap<>();
        this.paramTextAreas = new HashMap<>();
        JBLabel createWithLink = ContextHelpLabel.createWithLink((String) null, "Test the App Action by clicking Run App Action, or executing the generated adb shell command. Plugin-specific logs may be found in the Android Studio log files.", "Learn more", ConfigStepPanel$helpLabel$1.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(createWithLink, "ContextHelpLabel.createW…til.browse(linkUrl)\n    }");
        this.helpLabel = createWithLink;
        JBLabel $this$apply2 = new JBLabel("1) Select an intent and configure parameters ");
        $this$apply2.setFont(new Font((String) null, 1, 13));
        $this$apply2.setAlignmentX(0.0f);
        Unit unit2 = Unit.INSTANCE;
        this.titleLabel = $this$apply2;
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel, 0));
        jPanel.setBorder(Constants.INSTANCE.getTITLE_PANEL_BORDER());
        jPanel.add(this.titleLabel);
        jPanel.add(this.helpLabel);
        Unit unit3 = Unit.INSTANCE;
        this.titleBox = jPanel;
        setBorder(BorderFactory.createEmptyBorder(15, 10, 15, 10));
        Box box = new Box(1);
        ComboBox $this$apply3 = this.intentComboBox;
        $this$apply3.addActionListener(new ActionListener() { // from class: com.google.assistant.plugin.appactions.ui.ConfigStepPanel$$special$$inlined$apply$lambda$1
            public final void actionPerformed(ActionEvent it) {
                ConfigStepPanel.this.onIntentSelectionChanged();
            }
        });
        $this$apply3.setAlignmentX(0.0f);
        $this$apply3.setEditable(false);
        $this$apply3.setRenderer(new CustomComboBoxRenderer() { // from class: com.google.assistant.plugin.appactions.ui.ConfigStepPanel$1$2
            @Override // com.google.assistant.plugin.appactions.ui.CustomComboBoxRenderer
            @NotNull
            public JLabel getListCellRendererComponent(@NotNull JList<?> jList, @Nullable Object o, int i, boolean isSelected, boolean cellHasFocus) {
                Intrinsics.checkNotNullParameter(jList, "jList");
                Plugin.AndroidActionPackageResponse.SupportedIntent intent = (Plugin.AndroidActionPackageResponse.SupportedIntent) o;
                JLabel component = super.getListCellRendererComponent(jList, intent, i, isSelected, cellHasFocus);
                if (component == null) {
                    throw new NullPointerException("null cannot be cast to non-null type javax.swing.JLabel");
                }
                JLabel component2 = (JLabel) component;
                if (intent != null) {
                    component2.setText(intent.getName());
                }
                return component2;
            }
        });
        this.visibleCardPanel.setAlignmentX(0.0f);
        JPanel jPanel2 = new JPanel(new BorderLayout());
        jPanel2.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
        jPanel2.add(this.titleBox);
        Unit unit4 = Unit.INSTANCE;
        box.add(jPanel2);
        JPanel jPanel3 = new JPanel(new BorderLayout());
        jPanel3.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
        jPanel3.add(this.intentComboBox, "Center");
        Unit unit5 = Unit.INSTANCE;
        box.add(jPanel3);
        JPanel jPanel4 = new JPanel(new BorderLayout());
        jPanel4.add(this.visibleCardPanel, "Center");
        Unit unit6 = Unit.INSTANCE;
        box.add(jPanel4);
        add((Component) box);
    }

    @Nullable
    public final Plugin.AndroidActionPackageResponse.SupportedIntent getSelectedIntent() {
        return (Plugin.AndroidActionPackageResponse.SupportedIntent) this.intentComboBox.getSelectedItem();
    }

    @Nullable
    public final Function0<Unit> getOnIntentSelectionChangedListener() {
        return this.onIntentSelectionChangedListener;
    }

    public final void setOnIntentSelectionChangedListener(@Nullable Function0<Unit> function0) {
        this.onIntentSelectionChangedListener = function0;
    }

    @Nullable
    public final Function0<Unit> getOnIntentParameterChangedListener() {
        return this.onIntentParameterChangedListener;
    }

    public final void setOnIntentParameterChangedListener(@Nullable Function0<Unit> function0) {
        this.onIntentParameterChangedListener = function0;
    }

    @NotNull
    public final Map<Plugin.AndroidActionPackageResponse.SupportedIntent.SupportedParameter, String> getParametersForIntent(@NotNull Plugin.AndroidActionPackageResponse.SupportedIntent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        HashMap<Plugin.AndroidActionPackageResponse.SupportedIntent.SupportedParameter, String> enteredFieldInputsMap = new HashMap();
        HashMap<Plugin.AndroidActionPackageResponse.SupportedIntent.SupportedParameter, Editor> fieldToTextAreaMap = this.paramTextAreas.get(intent);
        if (fieldToTextAreaMap != null) {
            for (Map.Entry<Plugin.AndroidActionPackageResponse.SupportedIntent.SupportedParameter, Editor> entry : fieldToTextAreaMap.entrySet()) {
                Plugin.AndroidActionPackageResponse.SupportedIntent.SupportedParameter key = entry.getKey();
                Editor value = entry.getValue();
                Document document = value.getDocument();
                Intrinsics.checkNotNullExpressionValue(document, "value.document");
                String text = document.getText();
                Intrinsics.checkNotNullExpressionValue(text, "value.document.text");
                enteredFieldInputsMap.put(key, text);
            }
        }
        return enteredFieldInputsMap;
    }

    public final void setIntents(@NotNull List<Plugin.AndroidActionPackageResponse.SupportedIntent> list) {
        Intrinsics.checkNotNullParameter(list, "intents");
        populateUi(list);
        Function0<Unit> function0 = this.onIntentSelectionChangedListener;
        if (function0 != null) {
            Unit unit = (Unit) function0.invoke();
        }
    }

    private final void populateUi(List<Plugin.AndroidActionPackageResponse.SupportedIntent> list) {
        this.intentComboBox.removeAllItems();
        this.cardPanels.clear();
        ComboBox<Plugin.AndroidActionPackageResponse.SupportedIntent> comboBox = this.intentComboBox;
        List<Plugin.AndroidActionPackageResponse.SupportedIntent> $this$toTypedArray$iv = list;
        Object[] array = $this$toTypedArray$iv.toArray(new Plugin.AndroidActionPackageResponse.SupportedIntent[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        comboBox.setModel(new DefaultComboBoxModel(array));
        for (Plugin.AndroidActionPackageResponse.SupportedIntent intent : list) {
            Box card = new Box(1);
            String intentName = intent.getName();
            if (intent.getSupportedParametersCount() == 0) {
                card.add(new JLabel("No parameters to set."));
            } else {
                for (Plugin.AndroidActionPackageResponse.SupportedIntent.SupportedParameter supportedParameter : intent.getSupportedParametersList()) {
                    StringBuilder sb = new StringBuilder();
                    Intrinsics.checkNotNullExpressionValue(supportedParameter, "supportedParameter");
                    JBLabel jBLabel = new JBLabel(sb.append(supportedParameter.getName()).append(":").toString());
                    jBLabel.setHorizontalAlignment(2);
                    if (supportedParameter.getExampleValuesList().size() <= 1) {
                        jBLabel.setBorder(new EmptyBorder(10, 0, 0, 0));
                        JPanel jPanel = new JPanel(new BorderLayout());
                        jPanel.add(jBLabel, "West");
                        jPanel.setBorder(BorderFactory.createEmptyBorder(0, 5, 5, 5));
                        card.add(jPanel);
                    } else {
                        populateExampleParameterComboBox(intent, supportedParameter);
                        card.add(this.exampleParameterComboBox);
                    }
                    String formattedExample = formatExample(supportedParameter);
                    Editor editor = createEditorComponent(formattedExample);
                    jBLabel.setLabelFor(editor.getComponent());
                    Box box = new Box(1);
                    box.add(editor.getComponent());
                    box.setBorder(Constants.INSTANCE.getSUBELEMENT_PANEL_BORDER());
                    card.add(box);
                    getIntentParameterTextAreas(intent).put(supportedParameter, editor);
                }
            }
            Intrinsics.checkNotNullExpressionValue(intentName, "intentName");
            this.cardPanels.put(intentName, card);
        }
        if (!list.isEmpty()) {
            this.intentComboBox.setSelectedIndex(0);
        }
    }

    private final HashMap<Plugin.AndroidActionPackageResponse.SupportedIntent.SupportedParameter, Editor> getIntentParameterTextAreas(Plugin.AndroidActionPackageResponse.SupportedIntent intent) {
        HashMap parameterTextAreas;
        if (!this.paramTextAreas.containsKey(intent)) {
            parameterTextAreas = new HashMap();
            this.paramTextAreas.put(intent, parameterTextAreas);
        } else {
            HashMap hashMap = this.paramTextAreas.get(intent);
            Intrinsics.checkNotNull(hashMap);
            parameterTextAreas = hashMap;
        }
        return parameterTextAreas;
    }

    private final Editor createEditorComponent(String formattedExample) {
        Document document = EditorFactory.getInstance().createDocument(formattedExample);
        Intrinsics.checkNotNullExpressionValue(document, "EditorFactory.getInstanc…ocument(formattedExample)");
        Editor editor = EditorFactory.getInstance().createEditor(document, (Project) null, JsonFileType.INSTANCE, false);
        Intrinsics.checkNotNullExpressionValue(editor, "EditorFactory.getInstanc…FileType.INSTANCE, false)");
        EditorSettings $this$apply = editor.getSettings();
        $this$apply.setLineNumbersShown(false);
        $this$apply.setFoldingOutlineShown(false);
        $this$apply.setAdditionalPageAtBottom(false);
        $this$apply.setAutoCodeFoldingEnabled(false);
        $this$apply.setUseSoftWraps(false);
        $this$apply.setAllowSingleLogicalLineFolding(false);
        $this$apply.setBlockCursor(false);
        $this$apply.setCaretRowShown(false);
        $this$apply.setDndEnabled(false);
        $this$apply.setInnerWhitespaceShown(false);
        $this$apply.setWhitespacesShown(false);
        $this$apply.setLeadingWhitespaceShown(false);
        $this$apply.setTrailingWhitespaceShown(false);
        $this$apply.setGutterIconsShown(false);
        $this$apply.setAdditionalLinesCount(0);
        editor.setBorder(new CompoundBorder(BorderFactory.createLineBorder(JBColor.LIGHT_GRAY), BorderFactory.createEmptyBorder(4, 4, 4, 4)));
        editor.getDocument().addDocumentListener(new DocumentListener() { // from class: com.google.assistant.plugin.appactions.ui.ConfigStepPanel$createEditorComponent$2
            public void documentChanged(@NotNull DocumentEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
                Function0<Unit> onIntentParameterChangedListener = ConfigStepPanel.this.getOnIntentParameterChangedListener();
                if (onIntentParameterChangedListener != null) {
                    Unit unit = (Unit) onIntentParameterChangedListener.invoke();
                }
            }
        });
        return editor;
    }

    private final String formatExample(Plugin.AndroidActionPackageResponse.SupportedIntent.SupportedParameter supportedParameter) {
        String exampleValues;
        if (supportedParameter.getExampleValuesList().isEmpty()) {
            exampleValues = "\"\"";
        } else {
            exampleValues = supportedParameter.getExampleValues(0);
        }
        String formattedExample = exampleValues;
        return formatJson(formattedExample);
    }

    private final String formatJson(String exampleValue) {
        String formattedExample = exampleValue;
        try {
            CommonCodeStyleSettings.IndentOptions indentOptions = new CommonCodeStyleSettings(JsonLanguage.INSTANCE).getIndentOptions();
            int tabSize = 4;
            if (indentOptions != null) {
                tabSize = indentOptions.TAB_SIZE;
            }
            JSONObject exampleValueJson = new JSONObject(exampleValue);
            formattedExample = exampleValueJson.toString(tabSize);
        } catch (JSONException e) {
        }
        String str = formattedExample;
        Intrinsics.checkNotNull(str);
        String formattedExample2 = new Regex("\\\\").replace(str, "");
        return formattedExample2;
    }

    private final void populateExampleParameterComboBox(Plugin.AndroidActionPackageResponse.SupportedIntent intent, Plugin.AndroidActionPackageResponse.SupportedIntent.SupportedParameter supportedParameter) {
        this.exampleParameterComboBox.removeAll();
        this.exampleParameterComboBox.setAlignmentX(0.0f);
        this.exampleParameterComboBox.setEditable(false);
        this.exampleParameterComboBox.addActionListener(new ActionListener() { // from class: com.google.assistant.plugin.appactions.ui.ConfigStepPanel$populateExampleParameterComboBox$1
            public final void actionPerformed(ActionEvent it) {
                ConfigStepPanel.this.onExampleParameterChanged();
            }
        });
        ArrayList exampleParameterList = new ArrayList();
        int index = 1;
        for (String exampleParameter : supportedParameter.getExampleValuesList()) {
            Intrinsics.checkNotNullExpressionValue(exampleParameter, "exampleParameter");
            exampleParameterList.add(new ExampleParameter(supportedParameter.getName() + " sample #" + index, exampleParameter, intent, supportedParameter));
            index++;
        }
        ComboBox<ExampleParameter> comboBox = this.exampleParameterComboBox;
        ArrayList $this$toTypedArray$iv = exampleParameterList;
        Object[] array = $this$toTypedArray$iv.toArray(new ExampleParameter[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        comboBox.setModel(new DefaultComboBoxModel(array));
        this.exampleParameterComboBox.setSelectedIndex(0);
        this.exampleParameterComboBox.setEnabled(true);
        this.exampleParameterComboBox.setRenderer(new CustomComboBoxRenderer() { // from class: com.google.assistant.plugin.appactions.ui.ConfigStepPanel$populateExampleParameterComboBox$2
            @Override // com.google.assistant.plugin.appactions.ui.CustomComboBoxRenderer
            @NotNull
            public JLabel getListCellRendererComponent(@NotNull JList<?> jList, @Nullable Object o, int i, boolean isSelected, boolean cellHasFocus) {
                Intrinsics.checkNotNullParameter(jList, "jList");
                ExampleParameter exampleParameter2 = (ExampleParameter) o;
                Component component = super.getListCellRendererComponent(jList, exampleParameter2, i, isSelected, cellHasFocus);
                if (component == null) {
                    throw new NullPointerException("null cannot be cast to non-null type javax.swing.JLabel");
                }
                JLabel component2 = (JLabel) component;
                if (exampleParameter2 != null) {
                    component2.setText(exampleParameter2.getName());
                }
                return component2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onIntentSelectionChanged() {
        Component component;
        this.visibleCardPanel.removeAll();
        Plugin.AndroidActionPackageResponse.SupportedIntent intent = (Plugin.AndroidActionPackageResponse.SupportedIntent) this.intentComboBox.getSelectedItem();
        if (intent != null && (component = (Box) this.cardPanels.get(intent.getName())) != null) {
            this.visibleCardPanel.add(component);
        }
        revalidate();
        Function0<Unit> function0 = this.onIntentSelectionChangedListener;
        if (function0 != null) {
            Unit unit = (Unit) function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onExampleParameterChanged() {
        HashMap<Plugin.AndroidActionPackageResponse.SupportedIntent.SupportedParameter, Editor> parameterTextAreas;
        ExampleParameter exampleParameter = (ExampleParameter) this.exampleParameterComboBox.getSelectedItem();
        if (exampleParameter == null || (parameterTextAreas = this.paramTextAreas.get(exampleParameter.getIntent())) == null) {
            return;
        }
        Editor editor = parameterTextAreas.get(exampleParameter.getSupportedParameter());
        if (editor != null) {
            Document document = editor.getDocument();
            if (document != null) {
                document.setText(formatJson(exampleParameter.getJson()));
            }
        }
    }

    public final void enableInputFields(boolean enable) {
        this.intentComboBox.setEnabled(enable);
    }
}
