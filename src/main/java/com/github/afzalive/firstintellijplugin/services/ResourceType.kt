package com.github.afzalive.firstintellijplugin.services

enum class ResourceType(
    /**
     * Returns the resource type name, as used by XML files.
     */
    //$NON-NLS-1$ //$NON-NLS-2$
    val enumName: String,
    /**
     * Returns a translated display name for the resource type.
     */
    val displayName: String, vararg alternateXmlNames: String
) {
    ANIM("anim", "Animation"),  //$NON-NLS-1$
    ANIMATOR("animator", "Animator"),  //$NON-NLS-1$
    ARRAY("array", "Array", "string-array", "integer-array"),  //$NON-NLS-1$ //$NON-NLS-3$ //$NON-NLS-4$
    ATTR("attr", "Attr"),  //$NON-NLS-1$
    BOOL("bool", "Boolean"),  //$NON-NLS-1$
    COLOR("color", "Color"),  //$NON-NLS-1$
    DECLARE_STYLEABLE("declare-styleable", "Declare Stylable"),  //$NON-NLS-1$
    DIMEN("dimen", "Dimension"),  //$NON-NLS-1$
    DRAWABLE("drawable", "Drawable"),  //$NON-NLS-1$
    FRACTION("fraction", "Fraction"),  //$NON-NLS-1$
    ID("id", "ID"),  //$NON-NLS-1$
    INTEGER("integer", "Integer"),  //$NON-NLS-1$
    INTERPOLATOR("interpolator", "Interpolator"),  //$NON-NLS-1$
    LAYOUT("layout", "Layout"),  //$NON-NLS-1$
    MENU("menu", "Menu"),  //$NON-NLS-1$
    PLURALS("plurals", "Plurals"),  //$NON-NLS-1$
    RAW("raw", "Raw"),  //$NON-NLS-1$
    STRING("string", "String"),  //$NON-NLS-1$
    STYLE("style", "Style"),  //$NON-NLS-1$
    STYLEABLE("styleable", "Styleable"),  //$NON-NLS-1$
    XML("xml", "XML"),  //$NON-NLS-1$

    // this is not actually used. Only there because they get parsed and since we want to
    // detect new resource type, we need to have this one exist.
    PUBLIC("public", "###");

    private val mAlternateXmlNames: Array<out String>?

    init {
        mAlternateXmlNames = alternateXmlNames
    }

    override fun toString(): String {
        return enumName
    }

    companion object {
        /**
         * Returns the enum by its name as it appears in the XML or the R class.
         * @param name name of the resource
         * @return the matching [ResourceType] or `null` if no match was found.
         */
        fun getEnum(name: String): ResourceType? {
            for (rType in values()) {
                if (rType.enumName == name) {
                    return rType
                } else if (rType.mAlternateXmlNames != null) {
                    // if there are alternate Xml Names, we test those too
                    for (alternate in rType.mAlternateXmlNames) {
                        if (alternate == name) {
                            return rType
                        }
                    }
                }
            }
            return null
        }

        /**
         * Returns an array with all the names defined by this enum.
         */
        val names: Array<String?>
            get() {
                val values = values()
                val names = arrayOfNulls<String>(values.size)
                for (i in values.indices.reversed()) {
                    names[i] = values[i].enumName
                }
                return names
            }
    }
}