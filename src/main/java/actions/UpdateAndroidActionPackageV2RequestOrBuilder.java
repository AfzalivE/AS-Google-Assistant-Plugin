package actions;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

import java.util.List;

/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:plugin/actions/Plugin$UpdateAndroidActionPackageV2RequestOrBuilder.class */
    public interface UpdateAndroidActionPackageV2RequestOrBuilder extends MessageOrBuilder {
        String getName();

        ByteString getNameBytes();

        ByteString getActionsXmlContents();

        int getXmlContentTypeValue();

        UpdateAndroidActionPackageV2Request.XmlContentType getXmlContentType();

        boolean hasPreviewSettings();

        PreviewSettings getPreviewSettings();

        PreviewSettingsOrBuilder getPreviewSettingsOrBuilder();

        List<UpdateAndroidActionPackageV2Request.LocalizedResource> getLocalizedResourcesList();

        UpdateAndroidActionPackageV2Request.LocalizedResource getLocalizedResources(int i);

        int getLocalizedResourcesCount();

        List<? extends UpdateAndroidActionPackageV2Request.LocalizedResourceOrBuilder> getLocalizedResourcesOrBuilderList();

        UpdateAndroidActionPackageV2Request.LocalizedResourceOrBuilder getLocalizedResourcesOrBuilder(int i);
    }