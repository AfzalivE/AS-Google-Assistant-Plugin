package com.google.assistant.plugin.shortcuts.models

import kotlin.jvm.internal.Intrinsics

/* compiled from: ShortcutsTableModel.kt */
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/shortcuts/models/ShortcutsTableModelKt.class */
object ShortcutsTableModelExt {
    @JvmStatic
    val COLUMN_NAMES = arrayOf("Rank", "ID", "Short Label", "Intent")
    private const val ANDROID_CATEGORY_PREFIX = "android.shortcut"

    /* JADX INFO: Access modifiers changed from: private */
    @JvmStatic
    fun getShortcutProperty(shortcut: DisplayShortcut, col: Int): String? {
        return when (col) {
            0 -> {
                val rank = shortcut.rank
                rank?.toString()
            }

            1 -> shortcut.id
            2 -> shortcut.shortLabel
            3 -> getShortcutVoiceIntent(shortcut)
            else -> throw IllegalArgumentException("Invalid table column")
        }
    }

    private fun getShortcutVoiceIntent(shortcut: DisplayShortcut): String? {
        val obj: Any?
        var z: Boolean
        val it: Iterator<*> = shortcut.categories.iterator()
        while (true) {
            if (!it.hasNext()) {
                obj = null
                break
            }
            val next = it.next()!!
            val it2 = next as String
            Intrinsics.checkNotNullExpressionValue(it2, "it")
            if (it2.startsWith(ANDROID_CATEGORY_PREFIX, false)) {
                z = false
                continue
            } else {
                z = true
                continue
            }
            if (z) {
                obj = next
                break
            }
        }
        return obj as String?
    }
}
