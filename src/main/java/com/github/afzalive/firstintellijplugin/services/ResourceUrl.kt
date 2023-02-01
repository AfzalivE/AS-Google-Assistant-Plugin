package com.github.afzalive.firstintellijplugin.services

import com.android.SdkConstants.*
import com.android.annotations.NonNull
import com.android.annotations.Nullable

class ResourceUrl(
    /** Type of resource */
    val type: ResourceType,
    /** Name of resource  */
    val name: String,
    /** If true, the resource is in the android: framework  */
    val framework: Boolean,
    /** Whether an id resource is of the form `@+id` rather than just `@id`  */
    val create: Boolean,
    /** Whether this is a theme resource reference  */
    val theme: Boolean
) {

    companion object {
        @Nullable
        fun parse(@NonNull url: String): ResourceUrl? {
            return parse(url, false)
        }

        /**
         * Return the resource type of the given url, and the resource name.
         *
         * @param url the resource url to be parsed
         * @param forceFramework force the returned value to be a framework resource.
         * @return a pair of the resource type and the resource name
         */
        @Nullable
        fun parse(@NonNull url: String, forceFramework: Boolean): ResourceUrl? {
            var url = url
            var isTheme = false
            // Handle theme references
            if (url.startsWith(PREFIX_THEME_REF)) {
                isTheme = true
                var remainder = url.substring(PREFIX_THEME_REF.length)
                if (url.startsWith(ATTR_REF_PREFIX)) {
                    url = PREFIX_RESOURCE_REF + url.substring(PREFIX_THEME_REF.length)
                } else {
                    val colon = url.indexOf(':')
                    if (colon != -1) {
                        // Convert from ?android:progressBarStyleBig to ?android:attr/progressBarStyleBig
                        if (remainder.indexOf('/', colon) == -1) {
                            remainder =
                                (remainder.substring(0, colon) + RESOURCE_CLZ_ATTR + '/' + remainder.substring(colon))
                        }
                        url = PREFIX_RESOURCE_REF + remainder
                    } else {
                        val slash = url.indexOf('/')
                        if (slash == -1) {
                            url = "$PREFIX_RESOURCE_REF$RESOURCE_CLZ_ATTR/$remainder"
                        }
                    }
                }
            }
            if (!url.startsWith(PREFIX_RESOURCE_REF) || url.isEmpty()) {
                return null
            }
            val typeEnd = url.indexOf('/', 1)
            if (typeEnd == -1) {
                return null
            }
            val nameBegin = typeEnd + 1
            // Skip @ and @+
            val create = url.startsWith("@+")
            var typeBegin = if (create) 2 else 1
            val colon = url.lastIndexOf(':', typeEnd)
            var framework = forceFramework
            if (colon != -1) {
                if (url.startsWith(ANDROID_NS_NAME, typeBegin)) {
                    framework = true
                }
                typeBegin = colon + 1
            }
            val typeName = url.substring(typeBegin, typeEnd)
            val type: ResourceType = ResourceType.getEnum(typeName) ?: return null
            val name = url.substring(nameBegin)
            return ResourceUrl(type, name, framework, create, isTheme)
        }
    }
}
