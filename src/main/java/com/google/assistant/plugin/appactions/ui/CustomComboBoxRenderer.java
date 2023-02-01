package com.google.assistant.plugin.appactions.ui;

import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CustomComboBoxRenderer.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010��\n��\n\u0002\u0010\b\n��\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0016\u0018��2\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000e"}, d2 = {"Lcom/google/assistant/plugin/appactions/ui/CustomComboBoxRenderer;", "Ljavax/swing/DefaultListCellRenderer;", "()V", "getListCellRendererComponent", "Ljava/awt/Component;", "jList", "Ljavax/swing/JList;", "o", "", "i", "", "isSelected", "", "cellHasFocus", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/ui/CustomComboBoxRenderer.class */
public class CustomComboBoxRenderer extends DefaultListCellRenderer {
    @NotNull
    public JLabel getListCellRendererComponent(@NotNull JList<?> jList, @Nullable Object o, int i, boolean isSelected, boolean cellHasFocus) {
        Intrinsics.checkNotNullParameter(jList, "jList");
        Component component = super.getListCellRendererComponent(jList, o, i, isSelected, cellHasFocus);
        if (!(component instanceof JLabel)) {
            component = super.getListCellRendererComponent(jList, o, i, isSelected, cellHasFocus);
        }
        Component component2 = component;
        if (component2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type javax.swing.JLabel");
        }
        JLabel component3 = (JLabel) component2;
        component3.setOpaque(true);
        component3.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        if (isSelected || cellHasFocus) {
            component3.setBackground(jList.getSelectionBackground());
            component3.setForeground(jList.getSelectionForeground());
        } else {
            component3.setBackground(jList.getBackground());
            component3.setForeground(jList.getForeground());
        }
        return component3;
    }
}
