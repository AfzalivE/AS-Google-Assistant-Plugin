package com.google.assistant.plugin.common.utils;

import com.android.ide.common.resources.configuration.LocaleQualifier;
import com.google.assistant.plugin.appactions.Constants;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: LocalizedResourcesBuilder.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 3, d1 = {"��\u000e\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n��\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "localeQualifier", "Lcom/android/ide/common/resources/configuration/LocaleQualifier;", "test"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/common/utils/LocalizedResourcesBuilder$buildLocaleResourceResolverMap$filteredLocales$1.class */
final class LocalizedResourcesBuilder$buildLocaleResourceResolverMap$filteredLocales$1<T> implements Predicate<LocaleQualifier> {
    public static final LocalizedResourcesBuilder$buildLocaleResourceResolverMap$filteredLocales$1 INSTANCE = new LocalizedResourcesBuilder$buildLocaleResourceResolverMap$filteredLocales$1();

    LocalizedResourcesBuilder$buildLocaleResourceResolverMap$filteredLocales$1() {
    }

    @Override // java.util.function.Predicate
    public final boolean test(@NotNull LocaleQualifier localeQualifier) {
        Intrinsics.checkNotNullParameter(localeQualifier, "localeQualifier");
        Set<String> supported_lang_prefixes = Constants.INSTANCE.getSUPPORTED_LANG_PREFIXES();
        String language = localeQualifier.getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "localeQualifier.language");
        if (language == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase = language.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
        return supported_lang_prefixes.contains(lowerCase);
    }
}
