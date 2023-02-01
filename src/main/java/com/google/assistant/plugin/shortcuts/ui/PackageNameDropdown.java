package com.google.assistant.plugin.shortcuts.ui;

import com.google.assistant.plugin.shortcuts.listeners.PackageNameListListener;
import com.google.assistant.plugin.shortcuts.models.Model;
import com.google.assistant.plugin.shortcuts.models.ShortcutsTableModel;
import java.awt.Dimension;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: PackageNameDropdown.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n��\n\u0002\u0010 \n\u0002\b\u0002\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0016\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n��¨\u0006\u000f"}, d2 = {"Lcom/google/assistant/plugin/shortcuts/ui/PackageNameDropdown;", "Ljavax/swing/JComboBox;", "", "pluginModel", "Lcom/google/assistant/plugin/shortcuts/models/Model;", "shortcutsTableModel", "Lcom/google/assistant/plugin/shortcuts/models/ShortcutsTableModel;", "(Lcom/google/assistant/plugin/shortcuts/models/Model;Lcom/google/assistant/plugin/shortcuts/models/ShortcutsTableModel;)V", "find", "packageName", "onPackageNameListChanged", "", "list", "", "setDefaultOption", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/shortcuts/ui/PackageNameDropdown.class */
public final class PackageNameDropdown extends JComboBox<String> {
    private final Model pluginModel;
    private final ShortcutsTableModel shortcutsTableModel;

    public PackageNameDropdown(@NotNull Model pluginModel, @NotNull ShortcutsTableModel shortcutsTableModel) {
        Intrinsics.checkNotNullParameter(pluginModel, "pluginModel");
        Intrinsics.checkNotNullParameter(shortcutsTableModel, "shortcutsTableModel");
        this.pluginModel = pluginModel;
        this.shortcutsTableModel = shortcutsTableModel;
        this.pluginModel.addPackageNameListListener(new PackageNameListListener(strings -> {
            onPackageNameListChanged(strings);
            return Unit.INSTANCE;
        }));
        setMaximumSize(new Dimension(200, 30));
        setAlignmentX(0.0f);
        setDefaultOption();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPackageNameListChanged(List<String> list) {
        String packageName = this.pluginModel.getPackageName();
        if (!(!list.isEmpty())) {
            setDefaultOption();
            return;
        }
        List<String> $this$toTypedArray$iv = list;
        Object[] array = $this$toTypedArray$iv.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        setModel((ComboBoxModel) new DefaultComboBoxModel(array));
        setEnabled(true);
        if (packageName != null) {
            String selectedItem = find(packageName);
            ComboBoxModel model = getModel();
            Intrinsics.checkNotNullExpressionValue(model, "model");
            model.setSelectedItem(selectedItem);
            this.shortcutsTableModel.setSelectedPackageName(selectedItem);
            return;
        }
        ComboBoxModel model2 = getModel();
        Intrinsics.checkNotNullExpressionValue(model2, "model");
        model2.setSelectedItem(list.get(0));
        this.shortcutsTableModel.setSelectedPackageName(list.get(0));
    }

    private final void setDefaultOption() {
        setModel((ComboBoxModel) new DefaultComboBoxModel(new String[]{"No apps found"}));
        setEnabled(false);
    }

    private final String find(String packageName) {
        ComboBoxModel model = getModel();
        Intrinsics.checkNotNullExpressionValue(model, "model");
        int size = model.getSize();
        for (int i = 0; i < size; i++) {
            String item = (String) getModel().getElementAt(i);
            if (Intrinsics.areEqual(item, packageName)) {
                return item;
            }
        }
        Object elementAt = getModel().getElementAt(0);
        Intrinsics.checkNotNullExpressionValue(elementAt, "model.getElementAt(0)");
        return (String) elementAt;
    }
}
