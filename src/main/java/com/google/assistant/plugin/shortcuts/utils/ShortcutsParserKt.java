package com.google.assistant.plugin.shortcuts.utils;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import com.google.assistant.plugin.shortcuts.models.DisplayIntent;
import com.google.assistant.plugin.shortcuts.models.DisplayShortcut;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ShortcutsParser.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 2, d1 = {"��B\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0010\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u001a\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u001a\u0014\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002\u001a\u0012\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u001a\u0012\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002\u001a\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002\u001a\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002\u001a\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002\u001a\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u001a\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002\u001a\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0018H\u0002\u001a\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u001a\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u001a\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0002\u001a\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010 \u001a\u0012\u0010!\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u001a\u0012\u0010\"\u001a\u0004\u0018\u00010\u000b2\u0006\u0010#\u001a\u00020\u0006H\u0002\u001a\u001a\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0006H\u0002\u001a\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020%0\u00052\u0006\u0010#\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0006\u001a\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020%0\u00052\u0006\u0010#\u001a\u00020\u0006¨\u0006*"}, d2 = {"convertIcingIntent", "Lcom/google/assistant/plugin/shortcuts/models/DisplayIntent;", "smIntent", "Landroid/content/Intent;", "getCategories", "", "", "shortcutBlock", "getExtras", "getId", "idLine", "Lkotlin/text/MatchResult;", "getIdLine", "getIntentAction", "intentBlock", "getIntentComponent", "getIntentData", "getIntentType", "getIntents", "getIsDynamic", "", "getJsonProperty", "key", "jsonObj", "Lorg/json/JSONObject;", "getLongLabel", "getPackageName", "getProperty", "block", "pattern", "getRank", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "getShortLabel", "getShortcutBlocks", "output", "parseIcingJson", "Lcom/google/assistant/plugin/shortcuts/models/DisplayShortcut;", "jsonString", "packageName", "parseIcingOutput", "parseShortcutsOutput", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/shortcuts/utils/ShortcutsParserKt.class */
public final class ShortcutsParserKt {
    @NotNull
    public static final List<DisplayShortcut> parseShortcutsOutput(@NotNull String output) {
        Intrinsics.checkNotNullParameter(output, "output");
        List shortcutList = new ArrayList();
        MatchResult shortcutBlocks = getShortcutBlocks(output);
        while (true) {
            MatchResult matchResult = shortcutBlocks;
            if (matchResult != null) {
                String shortcutBlock = (String) matchResult.getGroupValues().get(1);
                MatchResult idLine = getIdLine(shortcutBlock);
                String id = getId(idLine);
                boolean isDynamic = getIsDynamic(idLine);
                String packageName = getPackageName(shortcutBlock);
                String shortLabel = getShortLabel(shortcutBlock);
                String longLabel = getLongLabel(shortcutBlock);
                ImmutableList intents = ImmutableList.copyOf(getIntents(shortcutBlock));
                Integer rank = getRank(shortcutBlock);
                ImmutableList categories = ImmutableList.copyOf(getCategories(shortcutBlock));
                ImmutableList extras = ImmutableList.copyOf(getExtras(shortcutBlock));
                if (id != null && packageName != null && shortLabel != null) {
                    Intrinsics.checkNotNullExpressionValue(intents, "intents");
                    Intrinsics.checkNotNullExpressionValue(categories, "categories");
                    Intrinsics.checkNotNullExpressionValue(extras, "extras");
                    shortcutList.add(new DisplayShortcut(id, isDynamic, packageName, shortLabel, longLabel, rank, intents, categories, extras));
                }
                shortcutBlocks = matchResult.next();
            } else {
                return shortcutList;
            }
        }
    }

    @NotNull
    public static final List<DisplayShortcut> parseIcingOutput(@NotNull String output, @NotNull String packageName) {
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Regex regex = new Regex("(\\{.+?})", RegexOption.DOT_MATCHES_ALL);
        ArrayList<DisplayShortcut> shortcutList = new ArrayList<>();
        for (MatchResult result = regex.find(output, 0); result != null; result = result.next()) {
            DisplayShortcut shortcut = ShortcutParserExtKt.parseIcingJson(result.getGroupValues().get(1), packageName);
            if (shortcut != null) {
                shortcutList.add(shortcut);
            }
        }
        return shortcutList;
    }

    private static final MatchResult getShortcutBlocks(String output) {
        return new Regex("ShortcutInfo \\{(.+?bitmapPath=.+?)}", RegexOption.DOT_MATCHES_ALL).find(output, 0);
    }

    private static final MatchResult getIdLine(String shortcutBlock) {
        return new Regex("id=(.+?), flags=.+? \\[(.+?)]").find(shortcutBlock, 0);
    }

    private static final String getId(MatchResult idLine) {
        if (idLine != null) {
            return (String) idLine.getGroupValues().get(1);
        }
        return null;
    }

    private static final boolean getIsDynamic(MatchResult idLine) {
        if (idLine != null) {
            List flags = new Regex("(?=\\p{Upper})").split((CharSequence) idLine.getGroupValues().get(2), 0);
            return flags.contains("D") || flags.contains("Dyn");
        }
        return false;
    }

    private static final String getPackageName(String shortcutBlock) {
        return getProperty(shortcutBlock, "packageName=(.+?)(?:, |[\\n\\r])");
    }

    private static final String getShortLabel(String shortcutBlock) {
        return getProperty(shortcutBlock, "shortLabel=(.+?)(?:, |[\\n\\r])");
    }

    private static final String getLongLabel(String shortcutBlock) {
        return getProperty(shortcutBlock, "longLabel=(.+?)(?:, |[\\n\\r])");
    }

    private static final Integer getRank(String shortcutBlock) {
        String property = getProperty(shortcutBlock, "rank=(.+?)(?:, |[\\n\\r])");
        if (property != null) {
            return Integer.valueOf(Integer.parseInt(property));
        }
        return null;
    }

    private static final List<String> getCategories(String shortcutBlock) {
        String categoriesString = getProperty(shortcutBlock, "categories=\\{(.+?)}(?:, |[\\n\\r])");
        if (categoriesString != null) {
            return StringsKt.split(categoriesString, new String[]{", "}, false, 0);
        }
        return CollectionsKt.emptyList();
    }

    private static final List<String> getExtras(String shortcutBlock) {
        String extrasString = getProperty(shortcutBlock, "extras=PersistableBundle\\[\\{(.+?)}](?:, |[\\n\\r])");
        if (extrasString != null) {
            return StringsKt.split(extrasString, new String[]{", "}, false, 0);
        }
        return CollectionsKt.emptyList();
    }

    private static final String getIntentAction(String intentBlock) {
        return getProperty(intentBlock, "act=([^ ]+?) ");
    }

    private static final String getIntentData(String intentBlock) {
        return getProperty(intentBlock, "dat=([^ ]+?) ");
    }

    private static final String getIntentType(String intentBlock) {
        return getProperty(intentBlock, "typ=([^ ]+?) ");
    }

    private static final String getIntentComponent(String intentBlock) {
        return getProperty(intentBlock, "cmp=([^ ]+?) ");
    }

    private static final String getProperty(String block, String pattern) {
        String str;
        String property;
        Regex regex = new Regex(pattern);
        MatchResult result = regex.find(block, 0);
        if (result != null) {
            List groupValues = result.getGroupValues();
            if (groupValues != null) {
                str = (String) groupValues.get(1);
                property = str;
                if (property != null || Intrinsics.areEqual(property, "null")) {
                    return null;
                }
                return property;
            }
        }
        str = null;
        property = str;
        if (property != null) {
        }
        return null;
    }

    private static final List<DisplayIntent> getIntents(String shortcutBlock) {
        List intentList = new ArrayList();
        for (MatchResult intentResult = new Regex("Intent \\{(.+?)}", RegexOption.DOT_MATCHES_ALL).find(shortcutBlock, 0); intentResult != null; intentResult = intentResult.next()) {
            String intentBlock = (String) intentResult.getGroupValues().get(1);
            String action = getIntentAction(intentBlock);
            String data = getIntentData(intentBlock);
            String type = getIntentType(intentBlock);
            String component = getIntentComponent(intentBlock);
            intentList.add(new DisplayIntent(action, data, type, component));
        }
        return intentList;
    }
}
