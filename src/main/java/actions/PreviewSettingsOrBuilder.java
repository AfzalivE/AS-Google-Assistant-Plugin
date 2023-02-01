package actions;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:plugin/actions/Plugin$PreviewSettingsOrBuilder.class */
    public interface PreviewSettingsOrBuilder extends MessageOrBuilder {
        String getInvocationName();

        ByteString getInvocationNameBytes();

        String getLocale();

        ByteString getLocaleBytes();
    }