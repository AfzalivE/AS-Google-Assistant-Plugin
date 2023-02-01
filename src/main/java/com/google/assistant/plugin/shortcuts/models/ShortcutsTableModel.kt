package com.google.assistant.plugin.shortcuts.models

import com.google.assistant.plugin.shortcuts.models.ShortcutsTableModelExt.COLUMN_NAMES
import com.google.assistant.plugin.shortcuts.models.ShortcutsTableModelExt.getShortcutProperty
import javax.swing.table.AbstractTableModel
import kotlin.jvm.internal.Intrinsics

/* compiled from: ShortcutsTableModel.kt */
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/shortcuts/models/ShortcutsTableModel.class */
class ShortcutsTableModel : AbstractTableModel() {
    private var selectedPackageName: String? = null
    var sourceData = emptyList<DisplayShortcut>()
        set(value) {
            field = value
            filterData()
        }
    private var selectedType = ShortcutType.DYNAMIC
    private var filteredData = sourceData
    fun getSelectedType(): ShortcutType {
        return selectedType
    }

    fun setSelectedType(value: ShortcutType) {
        Intrinsics.checkNotNullParameter(value, "value")
        selectedType = value
        filterData()
    }

    fun getSelectedPackageName(): String? {
        return selectedPackageName
    }

    fun setSelectedPackageName(value: String?) {
        selectedPackageName = value
        filterData()
    }

    fun getShortcutFromIndex(index: Int): DisplayShortcut? {
        return filteredData.getOrNull(index)
    }

    private fun filterData() {
        val shortcutsTableModel: ShortcutsTableModel
        val arrayList: ArrayList<DisplayShortcut>
        if (selectedType == ShortcutType.DYNAMIC) {
            val `$this$filter$iv`: Iterable<DisplayShortcut> = sourceData
            val `destination$iv$iv`: ArrayList<DisplayShortcut> = arrayListOf()
            for (`element$iv$iv` in `$this$filter$iv`) {
                val (_, isDynamic, packageName) = `element$iv$iv`
                if (isDynamic && Intrinsics.areEqual(packageName, selectedPackageName)) {
                    `destination$iv$iv`.add(`element$iv$iv`)
                }
            }
            shortcutsTableModel = this
            arrayList = `destination$iv$iv`
        } else {
            val `$this$filter$iv2`: Iterable<DisplayShortcut> = sourceData
            val `destination$iv$iv2`: ArrayList<DisplayShortcut> = arrayListOf()
            for (`element$iv$iv2` in `$this$filter$iv2`) {
                val (_, isDynamic, packageName) = `element$iv$iv2`
                if (!isDynamic && Intrinsics.areEqual(packageName, selectedPackageName)) {
                    `destination$iv$iv2`.add(`element$iv$iv2`)
                }
            }
            shortcutsTableModel = this
            arrayList = `destination$iv$iv2`
        }
        shortcutsTableModel.filteredData = arrayList
        val `$this$sortedBy$iv`: Iterable<DisplayShortcut> = filteredData
        filteredData = `$this$sortedBy$iv`.sortedWith { t, t2 ->
            // from class: com.google.assistant.plugin.shortcuts.models.ShortcutsTableModel$filterData$$inlined$sortedBy$1
            // java.util.Comparator
            compareValues(t.rank, t2.rank)
        }
        fireTableDataChanged()
    }

    override fun getColumnName(column: Int): String {
        val strArr: Array<String>
        strArr = COLUMN_NAMES
        return strArr[column]
    }

    override fun getRowCount(): Int {
        return filteredData.size
    }

    override fun getColumnCount(): Int {
        val strArr: Array<String> = COLUMN_NAMES
        return strArr.size
    }

    /* renamed from: getValueAt */ override fun getValueAt(row: Int, col: Int): String {
        val shortcutProperty: String? = getShortcutProperty(filteredData[row], col)
        return shortcutProperty ?: ""
    }
}
