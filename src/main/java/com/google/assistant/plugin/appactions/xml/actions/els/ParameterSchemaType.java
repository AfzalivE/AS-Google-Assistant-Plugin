package com.google.assistant.plugin.appactions.xml.actions.els;

import com.intellij.util.xml.NamedEnum;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ParameterSchemaType.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018��2\b\u0012\u0004\u0012\u00020��0\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n��j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/google/assistant/plugin/appactions/xml/actions/els/ParameterSchemaType;", "", "Lcom/intellij/util/xml/NamedEnum;", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "PARAMETER_SCHEMA_TYPE_TEXT", "PARAMETER_SCHEMA_TYPE_DATE", "PARAMETER_SCHEMA_TYPE_TIME", "PARAMETER_SCHEMA_TYPE_NUMBER", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/xml/actions/els/ParameterSchemaType.class */
public enum ParameterSchemaType implements NamedEnum {
    PARAMETER_SCHEMA_TYPE_TEXT("https://schema.org/Text"),
    PARAMETER_SCHEMA_TYPE_DATE("https://schema.org/Date"),
    PARAMETER_SCHEMA_TYPE_TIME("https://schema.org/Time"),
    PARAMETER_SCHEMA_TYPE_NUMBER("https://schema.org/Number");
    
    private final String value;

    ParameterSchemaType(String value) {
        this.value = value;
    }

    @NotNull
    public String getValue() {
        return this.value;
    }
}
