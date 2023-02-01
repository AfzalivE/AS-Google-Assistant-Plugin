package com.google.assistant.plugin.appactions.xml.actions.els;

import com.intellij.util.xml.NamedEnum;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: FulfillmentMode.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018��2\b\u0012\u0004\u0012\u00020��0\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n��j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/google/assistant/plugin/appactions/xml/actions/els/FulfillmentMode;", "", "Lcom/intellij/util/xml/NamedEnum;", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "ACTIONS_FULFILLMENT_DEEPLINK", "ACTIONS_FULFILLMENT_SLICE", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/xml/actions/els/FulfillmentMode.class */
public enum FulfillmentMode implements NamedEnum {
    ACTIONS_FULFILLMENT_DEEPLINK("actions.fulfillment.DEEPLINK"),
    ACTIONS_FULFILLMENT_SLICE("actions.fulfillment.SLICE");
    
    private final String value;

    FulfillmentMode(String value) {
        this.value = value;
    }

    @NotNull
    public String getValue() {
        return this.value;
    }
}
