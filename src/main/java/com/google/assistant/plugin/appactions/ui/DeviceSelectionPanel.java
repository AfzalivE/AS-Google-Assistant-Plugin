package com.google.assistant.plugin.appactions.ui;

import com.google.assistant.plugin.appactions.Constants;
import com.google.assistant.plugin.appactions.state.DeviceProperties;
import com.intellij.openapi.ui.ComboBox;
import com.intellij.ui.ContextHelpLabel;
import com.intellij.ui.JBColor;
import com.intellij.ui.components.JBLabel;
import com.intellij.ui.components.JBTextArea;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DeviceSelectionPanel.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n��\u0018��2\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0019J\u0014\u0010\u001a\u001a\u00020\u000f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u001cR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n��R9\u0010\n\u001a!\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001d"}, d2 = {"Lcom/google/assistant/plugin/appactions/ui/DeviceSelectionPanel;", "Ljavax/swing/Box;", "panelTitle", "", "(Ljava/lang/String;)V", "deviceSelectionComboBox", "Lcom/intellij/openapi/ui/ComboBox;", "Lcom/google/assistant/plugin/appactions/state/DeviceProperties;", "helpLabel", "Lcom/intellij/ui/components/JBLabel;", "onDeviceSelectionChangedListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "selection", "", "getOnDeviceSelectionChangedListener", "()Lkotlin/jvm/functions/Function1;", "setOnDeviceSelectionChangedListener", "(Lkotlin/jvm/functions/Function1;)V", "selectedDevice", "getSelectedDevice", "()Lcom/google/assistant/plugin/appactions/state/DeviceProperties;", "enableInputFields", "enable", "", "setDevices", "devices", "", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/ui/DeviceSelectionPanel.class */
public final class DeviceSelectionPanel extends Box {
    private final ComboBox<DeviceProperties> deviceSelectionComboBox;
    @Nullable
    private Function1<DeviceProperties, Unit> onDeviceSelectionChangedListener;
    private final JBLabel helpLabel;

    public DeviceSelectionPanel() {
        this(null, 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceSelectionPanel(@NotNull String panelTitle) {
        super(1);
        Intrinsics.checkNotNullParameter(panelTitle, "panelTitle");
        this.deviceSelectionComboBox = new ComboBox<>();
        JBLabel createWithLink = ContextHelpLabel.createWithLink((String) null, "Select the virtual or physical device connected to Android Studio to trigger the App Action on. Note: App Actions can only be tested on virtual devices that have Play Store support, and are running on an emulator.", "Learn more", DeviceSelectionPanel$helpLabel$1.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(createWithLink, "ContextHelpLabel.createW…til.browse(linkUrl)\n    }");
        this.helpLabel = createWithLink;
        setBorder(BorderFactory.createEmptyBorder(15, 10, 15, 10));
        Component jLabel = new JLabel(panelTitle);
        jLabel.setFont(new Font((String) null, 1, 13));
        Box createHorizontalBox = Box.createHorizontalBox();
        createHorizontalBox.setBorder(Constants.INSTANCE.getTITLE_PANEL_BORDER());
        createHorizontalBox.setAlignmentX(0.0f);
        createHorizontalBox.add(jLabel);
        createHorizontalBox.add(this.helpLabel);
        this.deviceSelectionComboBox.setAlignmentX(0.0f);
        this.deviceSelectionComboBox.setEditable(false);
        this.deviceSelectionComboBox.addActionListener(new ActionListener() { // from class: com.google.assistant.plugin.appactions.ui.DeviceSelectionPanel.1
            public final void actionPerformed(ActionEvent it) {
                Function1<DeviceProperties, Unit> onDeviceSelectionChangedListener = DeviceSelectionPanel.this.getOnDeviceSelectionChangedListener();
                if (onDeviceSelectionChangedListener != null) {
                    Unit unit = (Unit) onDeviceSelectionChangedListener.invoke(DeviceSelectionPanel.this.getSelectedDevice());
                }
            }
        });
        this.deviceSelectionComboBox.setRenderer(new CustomComboBoxRenderer() { // from class: com.google.assistant.plugin.appactions.ui.DeviceSelectionPanel.2
            @Override // com.google.assistant.plugin.appactions.ui.CustomComboBoxRenderer
            @NotNull
            public JLabel getListCellRendererComponent(@NotNull JList<?> jList, @Nullable Object o, int i, boolean isSelected, boolean cellHasFocus) {
                Intrinsics.checkNotNullParameter(jList, "jList");
                Component component = super.getListCellRendererComponent(jList, o, i, isSelected, cellHasFocus);
                if (component == null) {
                    throw new NullPointerException("null cannot be cast to non-null type javax.swing.JLabel");
                }
                JLabel component2 = (JLabel) component;
                if (o != null && (o instanceof DeviceProperties)) {
                    component2.setText(((DeviceProperties) o).getModel() + " (" + ((DeviceProperties) o).getSerialNumber() + ')');
                }
                return component2;
            }
        });
        if (!StringsKt.isBlank(panelTitle)) {
            JPanel $this$apply = new JPanel(new BorderLayout());
            $this$apply.add(createHorizontalBox);
            Unit unit = Unit.INSTANCE;
            add((Component) $this$apply);
        }
        JPanel $this$apply2 = new JPanel(new BorderLayout());
        $this$apply2.add(this.deviceSelectionComboBox);
        Unit unit2 = Unit.INSTANCE;
        add((Component) $this$apply2);
        JPanel $this$apply3 = new JPanel(new BorderLayout());
        $this$apply3.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 0));
        JBTextArea jBTextArea = new JBTextArea("Test only on running device with Play Store support");
        jBTextArea.setForeground(JBColor.DARK_GRAY);
        jBTextArea.setFont(new Font((String) null, 0, 13));
        jBTextArea.setAlignmentX(0.0f);
        jBTextArea.setBackground(JBColor.PanelBackground);
        jBTextArea.setEditable(false);
        jBTextArea.setLineWrap(true);
        jBTextArea.setWrapStyleWord(true);
        Unit unit3 = Unit.INSTANCE;
        $this$apply3.add(jBTextArea);
        Unit unit4 = Unit.INSTANCE;
        add((Component) $this$apply3);
    }

    public /* synthetic */ DeviceSelectionPanel(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "2) Select target device " : str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceProperties getSelectedDevice() {
        return (DeviceProperties) this.deviceSelectionComboBox.getSelectedItem();
    }

    @Nullable
    public final Function1<DeviceProperties, Unit> getOnDeviceSelectionChangedListener() {
        return this.onDeviceSelectionChangedListener;
    }

    public final void setOnDeviceSelectionChangedListener(@Nullable Function1<DeviceProperties, Unit> function1) {
        this.onDeviceSelectionChangedListener = function1;
    }

    public final void setDevices(@NotNull List<DeviceProperties> list) {
        Intrinsics.checkNotNullParameter(list, "devices");
        if (list.isEmpty()) {
            this.deviceSelectionComboBox.setEnabled(false);
            this.deviceSelectionComboBox.removeAllItems();
            return;
        }
        ComboBox<DeviceProperties> comboBox = this.deviceSelectionComboBox;
        List<DeviceProperties> $this$toTypedArray$iv = list;
        Object[] array = $this$toTypedArray$iv.toArray(new DeviceProperties[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        comboBox.setModel(new DefaultComboBoxModel(array));
        this.deviceSelectionComboBox.setEnabled(true);
        Function1<? super DeviceProperties, Unit> function1 = this.onDeviceSelectionChangedListener;
        if (function1 != null) {
            Unit unit = (Unit) function1.invoke(getSelectedDevice());
        }
    }

    public final void enableInputFields(boolean enable) {
        this.deviceSelectionComboBox.setEnabled(enable);
    }
}
