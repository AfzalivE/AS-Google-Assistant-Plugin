package com.google.assistant.plugin.common.utils

import com.google.assistant.plugin.appactions.Constants
import com.intellij.ide.plugins.PluginManager
import com.intellij.ide.plugins.PluginManagerCore
import java.util.*
import javax.imageio.ImageIO
import javax.swing.ImageIcon
import kotlin.jvm.internal.Intrinsics

/* compiled from: PluginUtils.kt */
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/common/utils/PluginUtils.class */
class PluginUtils private constructor() {
    private val pluginVersion: String
        private get() {
            val descriptor = PluginManagerCore.getPlugin(
                PluginManager.getPluginByClassName(
                    PluginUtils::class.java.name
                )
            )
            if (descriptor != null) {
                val version = descriptor.version
                Intrinsics.checkNotNullExpressionValue(version, "descriptor.version")
                return version
            }
            return "0.1.0"
        }
    val appName: String
        get() = Companion.appName
//    val inSyncIcon: ImageIcon
//        get() = Companion.inSyncIcon
//    val outOfSyncIcon: ImageIcon
//        get() = Companion.outOfSyncIcon

    companion object {
        private var appName: String = ""
        @JvmField
        var inSyncIcon: ImageIcon? = null
        @JvmField
        var outOfSyncIcon: ImageIcon? = null
        @JvmField
        val INSTANCE: PluginUtils = PluginUtils()

        init {
            val pluginUtils = INSTANCE
            val objArr = arrayOf<Any>(pluginUtils.pluginVersion)
            val format = String.format(Constants.PLUGIN_NAME_VERSION, *Arrays.copyOf(objArr, objArr.size))
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)")
            appName = format
            inSyncIcon = ImageIcon(ImageIO.read(pluginUtils.javaClass.getResourceAsStream(Constants.IN_SYNC_PREVIEW_ICON)))
            outOfSyncIcon = ImageIcon(ImageIO.read(pluginUtils.javaClass.getResourceAsStream(Constants.OUT_OF_SYNC_PREVIEW_ICON)))
        }
    }
}
