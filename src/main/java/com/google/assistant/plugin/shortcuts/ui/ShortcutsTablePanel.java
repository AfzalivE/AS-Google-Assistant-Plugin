package com.google.assistant.plugin.shortcuts.ui;

import com.google.assistant.plugin.shortcuts.models.ShortcutsTableModel;
import com.intellij.ui.components.JBScrollPane;
import com.intellij.ui.table.JBTable;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ShortcutsTablePanel.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��4\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018��2\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\nH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��¨\u0006\u0011"}, d2 = {"Lcom/google/assistant/plugin/shortcuts/ui/ShortcutsTablePanel;", "Ljavax/swing/Box;", "shortcutsTableModel", "Lcom/google/assistant/plugin/shortcuts/models/ShortcutsTableModel;", "(Lcom/google/assistant/plugin/shortcuts/models/ShortcutsTableModel;)V", "scrollPane", "Lcom/intellij/ui/components/JBScrollPane;", "shortcutsTable", "Lcom/intellij/ui/table/JBTable;", "addRowSelectListener", "", "listener", "Ljavax/swing/event/ListSelectionListener;", "resetSelection", "e", "Ljavax/swing/event/TableModelEvent;", "setColumnWidths", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/shortcuts/ui/ShortcutsTablePanel.class */
public final class ShortcutsTablePanel extends Box {
    private final JBTable shortcutsTable;
    private final JBScrollPane scrollPane;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortcutsTablePanel(@NotNull ShortcutsTableModel shortcutsTableModel) {
        super(1);
        Intrinsics.checkNotNullParameter(shortcutsTableModel, "shortcutsTableModel");
        this.shortcutsTable = new JBTable((TableModel) shortcutsTableModel);
        this.scrollPane = new JBScrollPane(this.shortcutsTable);
        final Function1 anonymousClass1 = (Function1<TableModelEvent, Unit>) tableModelEvent -> {
            resetSelection(tableModelEvent);
            return Unit.INSTANCE;
        };
        shortcutsTableModel.addTableModelListener(new TableModelListener() { // from class: com.google.assistant.plugin.shortcuts.ui.ShortcutsTablePanel$sam$javax_swing_event_TableModelListener$0
            public final /* synthetic */ void tableChanged(TableModelEvent p0) {
                Intrinsics.checkNotNullExpressionValue(anonymousClass1.invoke(p0), "invoke(...)");
            }
        });
        this.shortcutsTable.setSelectionMode(0);
        setColumnWidths();
        setBorder(BorderFactory.createEmptyBorder(10, 0, 5, 0));
        setAlignmentX(0.0f);
        this.scrollPane.setMaximumSize(new Dimension(Integer.MAX_VALUE, 150));
        setMinimumSize(new Dimension(50, 150));
        add((Component) this.scrollPane);
    }

    public final void addRowSelectListener(@NotNull ListSelectionListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.shortcutsTable.getSelectionModel().addListSelectionListener(listener);
    }

    private final void setColumnWidths() {
        TableColumnModel columnModel = this.shortcutsTable.getColumnModel();
        TableColumn column = columnModel.getColumn(0);
        Intrinsics.checkNotNullExpressionValue(column, "columnModel.getColumn(0)");
        column.setPreferredWidth(50);
        TableColumn column2 = columnModel.getColumn(1);
        Intrinsics.checkNotNullExpressionValue(column2, "columnModel.getColumn(1)");
        column2.setPreferredWidth(150);
        TableColumn column3 = columnModel.getColumn(2);
        Intrinsics.checkNotNullExpressionValue(column3, "columnModel.getColumn(2)");
        column3.setPreferredWidth(100);
        TableColumn column4 = columnModel.getColumn(3);
        Intrinsics.checkNotNullExpressionValue(column4, "columnModel.getColumn(3)");
        column4.setPreferredWidth(180);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetSelection(TableModelEvent e) {
        this.shortcutsTable.getSelectionModel().clearSelection();
    }
}
