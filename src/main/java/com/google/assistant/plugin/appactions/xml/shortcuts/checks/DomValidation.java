package com.google.assistant.plugin.appactions.xml.shortcuts.checks;

import com.android.ide.common.rendering.api.ResourceNamespace;
import com.android.ide.common.resources.ResourceItem;
import com.android.resources.ResourceType;
import com.android.tools.idea.res.LocalResourceRepository;
import com.google.assistant.plugin.appactions.Constants;
import com.google.assistant.plugin.common.utils.ProjectUtils;
import com.intellij.openapi.module.Module;
import com.intellij.util.xml.highlighting.DomElementAnnotationHolder;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.android.dom.AndroidDomElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DomValidation.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��@\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010 \n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018��*\b\b��\u0010\u0001*\u00020\u00022\u00020\u0003J\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\bH\u0016J\u001d\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00028��2\u0006\u0010\u0013\u001a\u00020\u0014H&¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/google/assistant/plugin/appactions/xml/shortcuts/checks/DomValidation;", "T", "Lorg/jetbrains/android/dom/AndroidDomElement;", "", "getAppResource", "", "Lcom/android/ide/common/resources/ResourceItem;", "resourceName", "", "module", "Lcom/intellij/openapi/module/Module;", "getArrayResourceLocale", "resource", "isCustomIntent", "", "intentName", "validateElement", "", "element", "holder", "Lcom/intellij/util/xml/highlighting/DomElementAnnotationHolder;", "(Lorg/jetbrains/android/dom/AndroidDomElement;Lcom/intellij/util/xml/highlighting/DomElementAnnotationHolder;)V", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/xml/shortcuts/checks/DomValidation.class */
public interface DomValidation<T extends AndroidDomElement> {
    void validateElement(@NotNull T t, @NotNull DomElementAnnotationHolder domElementAnnotationHolder);

    @NotNull
    List<ResourceItem> getAppResource(@NotNull String str, @NotNull Module module);

    @NotNull
    String getArrayResourceLocale(@NotNull ResourceItem resourceItem);

    boolean isCustomIntent(@Nullable String str);

    /* compiled from: DomValidation.kt */
    @Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 3)
    /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/xml/shortcuts/checks/DomValidation$DefaultImpls.class */
    public static final class DefaultImpls {
        @NotNull
        public static <T extends AndroidDomElement> List<ResourceItem> getAppResource(@NotNull DomValidation<T> domValidation, @NotNull String resourceName, @NotNull Module module) {
            Intrinsics.checkNotNullParameter(resourceName, "resourceName");
            Intrinsics.checkNotNullParameter(module, "module");
            LocalResourceRepository appResources = ProjectUtils.INSTANCE.getAppResources(module);
            ResourceType resourceType = ResourceType.RAW;
            if (StringsKt.startsWith(resourceName, Constants.ANDROID_STRING_RESOURCE_TYPE, false)) {
                resourceType = ResourceType.STRING;
            } else if (StringsKt.startsWith(resourceName, Constants.ANDROID_ARRAY_RESOURCE_TYPE, false)) {
                resourceType = ResourceType.ARRAY;
            }
            List<ResourceItem> resources = appResources.getResources(ResourceNamespace.RES_AUTO, resourceType, StringsKt.substringAfter(resourceName, '/', ""));
            Intrinsics.checkNotNullExpressionValue(resources, "appResources.getResource…Name.substringAfter('/'))");
            return resources;
        }

        @NotNull
        public static <T extends AndroidDomElement> String getArrayResourceLocale(@NotNull DomValidation<T> domValidation, @NotNull ResourceItem resource) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            String key = resource.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "resource.key");
            String resourceKey = StringsKt.substringBefore(key, '/', "");
            return Intrinsics.areEqual(resourceKey, "array") ? "default" : StringsKt.substringAfter(resourceKey, "array-", "");
        }

        public static <T extends AndroidDomElement> boolean isCustomIntent(@NotNull DomValidation<T> domValidation, @Nullable String intentName) {
            return (intentName == null || StringsKt.startsWith(intentName, Constants.BUILT_IN_INTENT_PREFIX, false)) ? false : true;
        }
    }
}
