package com.google.assistant.plugin.appactions;

import java.time.Duration;
import java.util.Set;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Constants.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��<\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\bÆ\u0002\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u0019\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010 \u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010!\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010\"\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010#\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010$\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010%\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010&\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010'\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010(\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010)\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010*\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010+\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010,\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010-\u001a\u00020.X\u0086T¢\u0006\u0002\n��R\u000e\u0010/\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u00100\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u00101\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u00102\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u00103\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u00104\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u00105\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u00106\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u00107\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u00108\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u00109\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010:\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010;\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010<\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u0011\u0010=\u001a\u00020>¢\u0006\b\n��\u001a\u0004\b?\u0010@R\u0017\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00040B¢\u0006\b\n��\u001a\u0004\bC\u0010DR\u0011\u0010E\u001a\u00020>¢\u0006\b\n��\u001a\u0004\bF\u0010@R\u000e\u0010G\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010H\u001a\u00020.X\u0086T¢\u0006\u0002\n��R\u0011\u0010I\u001a\u00020J¢\u0006\b\n��\u001a\u0004\bK\u0010L¨\u0006M"}, d2 = {"Lcom/google/assistant/plugin/appactions/Constants;", "", "()V", "ACTIONS_METADATA_NAME", "", "ACTIONS_XML_DEPRECATION_MSG_CONTENT", "ACTIONS_XML_DEPRECATION_MSG_TITLE", "ACTIONS_XML_FILE_NAME", "ACTIONS_XML_MIGRATION_GUIDE_LINK", "ACTIONS_XML_MIGRATION_GUIDE_TEXT", "ACTIONS_XML_RELATED_FILENAMES", "", "getACTIONS_XML_RELATED_FILENAMES", "()[Ljava/lang/String;", "[Ljava/lang/String;", "ACTIONS_XML_ROOT_TAG", "ANDROID_4_BUILD_VERSION", "ANDROID_ARRAY_RESOURCE_TYPE", "ANDROID_KEY_ATTRIBUTE", "ANDROID_NAME_ATTRIBUTE", "ANDROID_REQUIRED_ATTRIBUTE", "ANDROID_STRING_RESOURCE_TYPE", "ANDROID_STUDIO_LOG", "ANDROID_TARGET_CLASS_ATTRIBUTE", "ANDROID_VALUE_ATTRIBUTE", "APP_ACTIONS_COMPONENT_ID", "APP_ACTIONS_PLURAL", "APP_ACTION_SINGULAR", "APP_NAME", "APP_NAME_DESCRIPTION", "APP_NAME_LABEL", "APP_NAME_LINK_TEXT", "APP_NAME_LINK_URL", "APP_QUERY_PATTERNS_ATTRIBUTE", "ASSISTANT_ICON", "BUILT_IN_INTENT_PREFIX", "COPY_DARK_ICON", "COPY_ICON", "CREATE_ACTIONS_XML_ACTION_TITLE", "CREATE_ACTIONS_XML_ACTION_URL", "DEFAULT_INVOCATION_NAME", "DEFAULT_LOCALE", "GENERAL_TEMPLATE", "IN_SYNC_PREVIEW_ICON", "IN_SYNC_PREVIEW_MESSAGE", "LEFT_RIGHT_SPACE_PANEL", "", "LOCALE_DESCRIPTION", "LOCALE_LINK_TEXT", "LOCALE_LINK_URL", "NO_TOS_ACCEPTED_MSG", "OUT_OF_SYNC_PREVIEW_ICON", "OUT_OF_SYNC_PREVIEW_MESSAGE", "PATH", "PLUGIN_ID", "PLUGIN_NAME", "PLUGIN_NAME_VERSION", "PUBLIC_COMPONENT_HOST", "SCHEME", "SHORTCUTS_METADATA_NAME", "SHORTCUTS_XML_ROOT_TAG", "SUBELEMENT_PANEL_BORDER", "Ljavax/swing/border/Border;", "getSUBELEMENT_PANEL_BORDER", "()Ljavax/swing/border/Border;", "SUPPORTED_LANG_PREFIXES", "", "getSUPPORTED_LANG_PREFIXES", "()Ljava/util/Set;", "TITLE_PANEL_BORDER", "getTITLE_PANEL_BORDER", "TOOLWINDOW_ID", "TOP_BOTTOM_SPACE_PANEL", "previewExpirationTime", "", "getPreviewExpirationTime", "()J", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/Constants.class */
public final class Constants {
    @NotNull
    public static final String PLUGIN_NAME = "Google Assistant plugin";
    @NotNull
    public static final String APP_NAME = "App Actions Test Tool";
    @NotNull
    public static final String PLUGIN_NAME_VERSION = "Google Assistant plugin v%s";
    @NotNull
    public static final String DEFAULT_INVOCATION_NAME = "test app action";
    @NotNull
    public static final String ANDROID_STUDIO_LOG = "Android Studio v";
    @NotNull
    public static final String IN_SYNC_PREVIEW_MESSAGE = "Shortcuts.xml in sync. Previews expire after %s hours.";
    @NotNull
    public static final String IN_SYNC_PREVIEW_ICON = "/appactions/in-sync-icon.png";
    @NotNull
    public static final String OUT_OF_SYNC_PREVIEW_MESSAGE = "Files out of sync. Update preview to sync.";
    @NotNull
    public static final String OUT_OF_SYNC_PREVIEW_ICON = "/appactions/out-of-sync-icon.png";
    @NotNull
    public static final String CREATE_ACTIONS_XML_ACTION_TITLE = "Create shortcuts.xml";
    @NotNull
    public static final String CREATE_ACTIONS_XML_ACTION_URL = "https://developers.google.com/assistant/app/action-schema";
    @NotNull
    public static final String ACTIONS_XML_ROOT_TAG = "actions";
    @NotNull
    public static final String SHORTCUTS_XML_ROOT_TAG = "shortcuts";
    @NotNull
    public static final String SCHEME = "https";
    @NotNull
    public static final String PUBLIC_COMPONENT_HOST = "issuetracker.google.com";
    @NotNull
    public static final String PATH = "issues/new";
    @NotNull
    public static final String APP_ACTIONS_COMPONENT_ID = "617864";
    @NotNull
    public static final String GENERAL_TEMPLATE = "1257475";
    @NotNull
    public static final String ANDROID_4_BUILD_VERSION = "AI-193.*";
    @NotNull
    public static final String PLUGIN_ID = "com.google.assistant.plugin";
    @NotNull
    public static final String TOOLWINDOW_ID = "App Actions";
    @NotNull
    public static final String APP_NAME_LABEL = "App name";
    @NotNull
    public static final String APP_ACTION_SINGULAR = "App Action";
    @NotNull
    public static final String APP_ACTIONS_PLURAL = "App Action";
    @NotNull
    public static final String APP_NAME_DESCRIPTION = "Choose a name to trigger your App Action during testing. For example, if you use \"ExampleApp\" as the app name you could say, \"Hey Google, start my exercise using ExampleApp\" to launch the App Action.";
    @NotNull
    public static final String APP_NAME_LINK_TEXT = "Learn more";
    @NotNull
    public static final String APP_NAME_LINK_URL = "https://developers.google.com/assistant/app/test-tool#what_it_does";
    @NotNull
    public static final String LOCALE_DESCRIPTION = "Choose a locale to test the App Action for that specific locale. The locale should match the language of the Google Assistant app on the test device. Locale support for each built-in intent is listed in the reference documentation.";
    @NotNull
    public static final String LOCALE_LINK_TEXT = "Learn more";
    @NotNull
    public static final String LOCALE_LINK_URL = "https://developers.google.com/assistant/app/test-tool#locale_support";
    @NotNull
    public static final String COPY_ICON = "/appactions/copy.png";
    @NotNull
    public static final String COPY_DARK_ICON = "/appactions/copy_dark.png";
    @NotNull
    private static final Border TITLE_PANEL_BORDER;
    @NotNull
    private static final Border SUBELEMENT_PANEL_BORDER;
    public static final int LEFT_RIGHT_SPACE_PANEL = 10;
    public static final int TOP_BOTTOM_SPACE_PANEL = 15;
    @NotNull
    public static final String ACTIONS_XML_FILE_NAME = "actions.xml";
    @NotNull
    public static final String ACTIONS_XML_DEPRECATION_MSG_TITLE = "App Actions now uses shortcuts.xml for configuration";
    @NotNull
    public static final String ACTIONS_XML_DEPRECATION_MSG_CONTENT = "The actions.xml configuration is deprecated and will stop working after May 2023. Please migrate your App Actions configuration to shortcuts.xml.";
    @NotNull
    public static final String ACTIONS_XML_MIGRATION_GUIDE_TEXT = "View Migration Guide";
    @NotNull
    public static final String ACTIONS_XML_MIGRATION_GUIDE_LINK = "https://developers.google.com/assistant/app/legacy/migration-guide";
    @NotNull
    public static final String ANDROID_NAME_ATTRIBUTE = "android:name";
    @NotNull
    public static final String ANDROID_KEY_ATTRIBUTE = "android:key";
    @NotNull
    public static final String ANDROID_VALUE_ATTRIBUTE = "android:value";
    @NotNull
    public static final String ANDROID_REQUIRED_ATTRIBUTE = "android:required";
    @NotNull
    public static final String ANDROID_TARGET_CLASS_ATTRIBUTE = "android:targetClass";
    @NotNull
    public static final String APP_QUERY_PATTERNS_ATTRIBUTE = "app:queryPatterns";
    @NotNull
    public static final String ANDROID_STRING_RESOURCE_TYPE = "@string/";
    @NotNull
    public static final String ANDROID_ARRAY_RESOURCE_TYPE = "@array/";
    @NotNull
    public static final String BUILT_IN_INTENT_PREFIX = "actions.intent.";
    @NotNull
    public static final String ACTIONS_METADATA_NAME = "com.google.android.actions";
    @NotNull
    public static final String SHORTCUTS_METADATA_NAME = "android.app.shortcuts";
    @NotNull
    public static final String NO_TOS_ACCEPTED_MSG = "Please accept Terms of Service before creating a preview.";
    @NotNull
    public static final String ASSISTANT_ICON = "/appactions/assistant_48dp.png";
    @NotNull
    public static final Constants INSTANCE = new Constants();
    @NotNull
    public static final String DEFAULT_LOCALE = "en";
    @NotNull
    private static final Set<String> SUPPORTED_LANG_PREFIXES = SetsKt.setOf(new String[]{DEFAULT_LOCALE, "pt", "id", "es"});
    private static final long previewExpirationTime = Duration.ofHours(5).plusMinutes(55).toMillis();
    @NotNull
    private static final String[] ACTIONS_XML_RELATED_FILENAMES = {"/strings.xml", "/arrays.xml"};

    private Constants() {
    }

    static {
        Border createEmptyBorder = BorderFactory.createEmptyBorder(5, 0, 10, 0);
        Intrinsics.checkNotNullExpressionValue(createEmptyBorder, "BorderFactory.createEmptyBorder(5, 0, 10, 0)");
        TITLE_PANEL_BORDER = createEmptyBorder;
        Border createEmptyBorder2 = BorderFactory.createEmptyBorder(5, 0, 5, 0);
        Intrinsics.checkNotNullExpressionValue(createEmptyBorder2, "BorderFactory.createEmptyBorder(5, 0, 5, 0)");
        SUBELEMENT_PANEL_BORDER = createEmptyBorder2;
    }

    @NotNull
    public final Set<String> getSUPPORTED_LANG_PREFIXES() {
        return SUPPORTED_LANG_PREFIXES;
    }

    public final long getPreviewExpirationTime() {
        return previewExpirationTime;
    }

    @NotNull
    public final String[] getACTIONS_XML_RELATED_FILENAMES() {
        return ACTIONS_XML_RELATED_FILENAMES;
    }

    @NotNull
    public final Border getTITLE_PANEL_BORDER() {
        return TITLE_PANEL_BORDER;
    }

    @NotNull
    public final Border getSUBELEMENT_PANEL_BORDER() {
        return SUBELEMENT_PANEL_BORDER;
    }
}
