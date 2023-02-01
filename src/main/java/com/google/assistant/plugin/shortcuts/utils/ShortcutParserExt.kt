package com.google.assistant.plugin.shortcuts.utils

import android.content.Intent
import com.google.assistant.plugin.shortcuts.models.DisplayIntent
import com.google.assistant.plugin.shortcuts.models.DisplayShortcut
import com.google.common.collect.ImmutableList
import org.json.JSONException
import org.json.JSONObject

public fun parseIcingJson(jsonString: String, packageName: String): DisplayShortcut? {
    return try {
        val jsonObj = JSONObject(jsonString)
        val id = getJsonProperty("id", jsonObj)
        val shortLabel = getJsonProperty("shortcutLabel", jsonObj)
        val longLabel = getJsonProperty("shortcutDescription", jsonObj)
        val url = getJsonProperty("shortcutUrl", jsonObj)
        val smIntent = Intent.parseUri(url, 1)
        val intents: ImmutableList<DisplayIntent> = ImmutableList.of(convertIcingIntent(smIntent))
        val of: ImmutableList<String> = ImmutableList.of()
        val of2: ImmutableList<String> = ImmutableList.of()
        DisplayShortcut(id, true, packageName, shortLabel, longLabel, null, intents, of, of2)
    } catch (e: JSONException) {
        null
    }
}

private fun getJsonProperty(key: String, jsonObj: JSONObject): String {
    return jsonObj[key].toString().removeSurrounding("[", "]")
}

private fun convertIcingIntent(smIntent: Intent): DisplayIntent {
    val action = smIntent.action
    val data = smIntent.data
    val data2 = data?.toString()
    val type = smIntent.type
    val component = smIntent.component
    val component2 = component?.flattenToString()
    return DisplayIntent(action, data2, type, component2)
}