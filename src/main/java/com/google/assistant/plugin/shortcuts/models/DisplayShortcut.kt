package com.google.assistant.plugin.shortcuts.models

import com.google.common.collect.ImmutableList
import kotlin.jvm.internal.Intrinsics

/* compiled from: Types.kt */
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/shortcuts/models/DisplayShortcut.class */
data class DisplayShortcut(
    @JvmField
    val id: String,
    @JvmField
    val isDynamic: Boolean,
    @JvmField
    val packageName: String,
    @JvmField
    val shortLabel: String,
    @JvmField
    val longLabel: String?,
    @JvmField
    val rank: Int?,
    @JvmField
    val intents: ImmutableList<DisplayIntent>,
    @JvmField
    val categories: ImmutableList<String>,
    @JvmField
    val extras: ImmutableList<String>
)
