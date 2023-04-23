package com.google.assistant.plugin.appactions.api;

import actions.Plugin;
import actions.PreviewSettings;
import actions.UpdateAndroidActionPackageV2Request;
import com.google.assistant.plugin.appactions.Constants;
import com.google.assistant.plugin.appactions.exceptions.ActionsBuilderException;
import com.google.assistant.plugin.common.utils.LoggingUtils;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import java.io.IOException;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpClient.kt */
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/api/HttpClient.class */
public final class HttpClient {
    private final OkHttpClient client;
    private final String updatePreviewV2Url;
    private final String deletePreviewUrl;
    private final String getPreviewV2Url;
    private final String logDevExEventUrl;

    public HttpClient(@NotNull String updatePreviewV2Url, @NotNull String deletePreviewUrl, @NotNull String getPreviewV2Url, @NotNull String logDevExEventUrl) {
        Intrinsics.checkNotNullParameter(updatePreviewV2Url, "updatePreviewV2Url");
        Intrinsics.checkNotNullParameter(deletePreviewUrl, "deletePreviewUrl");
        Intrinsics.checkNotNullParameter(getPreviewV2Url, "getPreviewV2Url");
        Intrinsics.checkNotNullParameter(logDevExEventUrl, "logDevExEventUrl");
        this.updatePreviewV2Url = updatePreviewV2Url;
        this.deletePreviewUrl = deletePreviewUrl;
        this.getPreviewV2Url = getPreviewV2Url;
        this.logDevExEventUrl = logDevExEventUrl;
        OkHttpClient build = new OkHttpClient.Builder().connectTimeout(10L, TimeUnit.SECONDS).writeTimeout(10L, TimeUnit.SECONDS).readTimeout(90L, TimeUnit.SECONDS).build();
        Intrinsics.checkNotNullExpressionValue(build, "OkHttpClient.Builder()\n …SECONDS)\n        .build()");
        this.client = build;
    }

    public HttpClient() {
        this("https://actions.googleapis.com/v2/v2/androidApps/PACKAGE_NAME/versions/preview", "https://actions.googleapis.com/v2/androidApps/PACKAGE_NAME/versions/preview", "https://actions.googleapis.com/v2/v2/androidApps/PACKAGE_NAME/versions/preview", "https://actions.googleapis.com/v2/androidApps/PACKAGE_NAME/versions/metrics:log");
    }

    public final void logDevExEvent(@NotNull String accessToken, @NotNull String packageName, @NotNull Plugin.DevExMetricsClientEventType.Id eventId, boolean isInternalUser) throws ActionsBuilderException {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Plugin.LogAndroidActionPackageDevelopmentEventRequest requestProto = Plugin.LogAndroidActionPackageDevelopmentEventRequest.newBuilder().setName(packageName).setClientEventType(eventId).setIsInternalUser(isInternalUser).build();
        Response fetchResponse = null;
        try {
            String json = JsonFormat.printer().print(requestProto);
            RequestBody body = RequestBody.create(HttpClientKt.access$getJSON$p(), json);
            Request logDevExEventRequest = new Request.Builder().url(HttpClientKt.access$buildEndpointUrl(this.logDevExEventUrl, packageName)).post(body).addHeader("Authorization", "Bearer " + accessToken).build();
            fetchResponse = this.client.newCall(logDevExEventRequest).execute();
            if (fetchResponse == null) {
                return;
            }
            fetchResponse.close();
        } catch (IOException e) {
            Response response = fetchResponse;
            if (response != null) {
                response.close();
            }
        } catch (Throwable th) {
            Response response2 = fetchResponse;
            if (response2 != null) {
                response2.close();
            }
            throw th;
        }
    }

    @Nullable
    public final Plugin.AndroidActionPackageResponse getPreviewV2(@NotNull String accessToken, @NotNull String packageName) throws ActionsBuilderException {
        Response fetchResponse = null;
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        String failureResponseErrorJson = null;
        String userFriendlyErrorMessage = null;
        Request getAndroidActionPackageV2Request = new Request.Builder().url(HttpClientKt.access$buildEndpointUrl(this.getPreviewV2Url, packageName)).addHeader("Authorization", "Bearer " + accessToken).get().build();
        Response fetchResponse2 = null;
        try {
            try {
                fetchResponse = this.client.newCall(getAndroidActionPackageV2Request).execute();
                Intrinsics.checkNotNullExpressionValue(fetchResponse, "fetchResponse");
            } catch (IOException e) {
                userFriendlyErrorMessage = e.getMessage();
                if (fetchResponse2 != null) {
                    fetchResponse2.close();
                }
            }
            if (!fetchResponse.isSuccessful() && fetchResponse.code() == 404) {
                LoggingUtils.INSTANCE.info("No preview was found.");
                fetchResponse.close();
                return null;
            }
            if (fetchResponse.body() == null) {
                userFriendlyErrorMessage = "Could not read response from Google when fetching preview.";
            } else if (fetchResponse.isSuccessful()) {
                ResponseBody body = fetchResponse.body();
                Intrinsics.checkNotNull(body);
                String responseString = body.string();
                LoggingUtils.INSTANCE.info("Get preview response = " + responseString);
                Plugin.AndroidActionPackageResponse.Builder builder = Plugin.AndroidActionPackageResponse.newBuilder();
                JsonFormat.parser().ignoringUnknownFields().merge(responseString, builder);
                Intrinsics.checkNotNullExpressionValue(builder, "builder");
                PreviewSettings previewSettings = builder.getPreviewSettings();
                Intrinsics.checkNotNullExpressionValue(previewSettings, "builder.previewSettings");
                String locale = previewSettings.getLocale();
                Intrinsics.checkNotNullExpressionValue(locale, "builder.previewSettings.locale");
                if (locale.length() == 0) {
                    PreviewSettings.Builder previewSettingsBuilder = builder.getPreviewSettingsBuilder();
                    Intrinsics.checkNotNullExpressionValue(previewSettingsBuilder, "builder.previewSettingsBuilder");
                    previewSettingsBuilder.setLocale(Constants.DEFAULT_LOCALE);
                }
                Plugin.AndroidActionPackageResponse build = builder.build();
                fetchResponse.close();
                return build;
            } else {
                ResponseBody body2 = fetchResponse.body();
                Intrinsics.checkNotNull(body2);
                failureResponseErrorJson = body2.string();
            }
            fetchResponse.close();
            throw new ActionsBuilderException(HttpClientKt.access$formatErrorMessage("Preview Fetch", userFriendlyErrorMessage, failureResponseErrorJson));
        } catch (Throwable th) {
            if (fetchResponse2 != null) {
                fetchResponse2.close();
            }
            try {
                throw th;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @NotNull
    public final Plugin.AndroidActionPackageResponse updatePreviewV2(@NotNull String accessToken, @NotNull String packageName, @Nullable String invocationName, @NotNull byte[] xmlContent, @NotNull UpdateAndroidActionPackageV2Request.XmlContentType xmlContentType, @NotNull Collection<UpdateAndroidActionPackageV2Request.LocalizedResource> collection, @NotNull String locale) throws ActionsBuilderException {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(xmlContent, "xmlContent");
        Intrinsics.checkNotNullParameter(xmlContentType, "xmlContentType");
        Intrinsics.checkNotNullParameter(collection, "resources");
        Intrinsics.checkNotNullParameter(locale, "locale");
        UpdateAndroidActionPackageV2Request.Builder requestProtoBuilder = UpdateAndroidActionPackageV2Request.newBuilder().setName("androidActionPackages/" + packageName + "/versions/preview").setActionsXmlContents(ByteString.copyFrom(xmlContent)).setXmlContentType(xmlContentType).addAllLocalizedResources(collection);
        PreviewSettings.Builder previewSettingsBuilder = PreviewSettings.newBuilder();
        if (invocationName != null) {
            Intrinsics.checkNotNullExpressionValue(previewSettingsBuilder, "previewSettingsBuilder");
            previewSettingsBuilder.setInvocationName(invocationName);
        }
        Intrinsics.checkNotNullExpressionValue(previewSettingsBuilder, "previewSettingsBuilder");
        previewSettingsBuilder.setLocale(locale);
        requestProtoBuilder.setPreviewSettings(previewSettingsBuilder);
        Response submitResponse = null;
        String failureResponseErrorJson = null;
        String userFriendlyErrorMessage = null;
        try {
            try {
                String json = JsonFormat.printer().print(requestProtoBuilder.build());
                LoggingUtils.INSTANCE.info("Update Preview Request = " + json);
                RequestBody body = RequestBody.create(HttpClientKt.access$getJSON$p(), json);
                Request updateAndroidActionPackageRequest = new Request.Builder().url(HttpClientKt.access$buildEndpointUrl(this.updatePreviewV2Url, packageName)).put(body).addHeader("Authorization", "Bearer " + accessToken).build();
                Response submitResponse2 = this.client.newCall(updateAndroidActionPackageRequest).execute();
                if (submitResponse2.body() == null) {
                    userFriendlyErrorMessage = "Could not read response from Google when submitting preview.";
                } else {
                    Intrinsics.checkNotNullExpressionValue(submitResponse2, "submitResponse");
                    if (submitResponse2.isSuccessful()) {
                        ResponseBody body2 = submitResponse2.body();
                        Intrinsics.checkNotNull(body2);
                        String responseString = body2.string();
                        LoggingUtils.INSTANCE.info("\nSuccessful Submit Actions Response:\n" + responseString);
                        Plugin.AndroidActionPackageResponse.Builder builder = Plugin.AndroidActionPackageResponse.newBuilder();
                        JsonFormat.parser().ignoringUnknownFields().merge(responseString, builder);
                        Intrinsics.checkNotNullExpressionValue(builder, "builder");
                        PreviewSettings previewSettings = builder.getPreviewSettings();
                        Intrinsics.checkNotNullExpressionValue(previewSettings, "builder.previewSettings");
                        String locale2 = previewSettings.getLocale();
                        Intrinsics.checkNotNullExpressionValue(locale2, "builder.previewSettings.locale");
                        if (locale2.length() == 0) {
                            PreviewSettings.Builder previewSettingsBuilder2 = builder.getPreviewSettingsBuilder();
                            Intrinsics.checkNotNullExpressionValue(previewSettingsBuilder2, "builder.previewSettingsBuilder");
                            previewSettingsBuilder2.setLocale(Constants.DEFAULT_LOCALE);
                        }
                        Plugin.AndroidActionPackageResponse build = builder.build();
                        Intrinsics.checkNotNullExpressionValue(build, "builder.build()");
                        submitResponse2.close();
                        return build;
                    }
                    ResponseBody body3 = submitResponse2.body();
                    Intrinsics.checkNotNull(body3);
                    failureResponseErrorJson = body3.string();
                    Intrinsics.checkNotNullExpressionValue(failureResponseErrorJson, "failureResponseErrorJson");
                    if (StringsKt.contains(failureResponseErrorJson, "is not authorized for preview", false) || StringsKt.contains(failureResponseErrorJson, "The caller does not have permission", false)) {
                        throw new ActionsBuilderException(Constants.NO_TOS_ACCEPTED_MSG);
                    }
                }
                if (submitResponse2 != null) {
                    submitResponse2.close();
                }
            } catch (IOException e) {
                userFriendlyErrorMessage = e.getMessage();
                if (submitResponse != null) {
                    submitResponse.close();
                }
            }
            throw new ActionsBuilderException(HttpClientKt.access$formatErrorMessage("Preview Creation", userFriendlyErrorMessage, failureResponseErrorJson));
        } catch (Throwable th) {
            if (submitResponse != null) {
                submitResponse.close();
            }
            throw th;
        }
    }

    public final void deletePreview(@NotNull String accessToken, @NotNull String packageName) throws ActionsBuilderException {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Plugin.DeleteAndroidActionPackageRequest requestProto = Plugin.DeleteAndroidActionPackageRequest.newBuilder().setName("androidActionPackages/" + packageName + "/versions/preview").build();
        Response deletePreviewResponse = null;
        String failureResponseErrorJson = null;
        String userFriendlyErrorMessage = null;
        try {
            try {
                String json = JsonFormat.printer().print(requestProto);
                LoggingUtils.INSTANCE.info("Delete preview request = " + json);
                RequestBody body = RequestBody.create(HttpClientKt.access$getJSON$p(), json);
                Request deletePreviewRequest = new Request.Builder().url(HttpClientKt.access$buildEndpointUrl(this.deletePreviewUrl, packageName)).addHeader("Authorization", "Bearer " + accessToken).delete(body).build();
                deletePreviewResponse = this.client.newCall(deletePreviewRequest).execute();
                if (deletePreviewResponse.body() == null) {
                    userFriendlyErrorMessage = "Preview could not be deleted. Could not read response from Google.";
                } else {
                    Intrinsics.checkNotNullExpressionValue(deletePreviewResponse, "deletePreviewResponse");
                    if (deletePreviewResponse.isSuccessful()) {
                        deletePreviewResponse.close();
                        return;
                    }
                    ResponseBody body2 = deletePreviewResponse.body();
                    Intrinsics.checkNotNull(body2);
                    failureResponseErrorJson = body2.string();
                }
                if (deletePreviewResponse != null) {
                    deletePreviewResponse.close();
                }
            } catch (IOException e) {
                userFriendlyErrorMessage = e.getMessage();
                Response response = deletePreviewResponse;
                if (response != null) {
                    response.close();
                }
            }
            throw new ActionsBuilderException(HttpClientKt.access$formatErrorMessage("Preview Deletion", userFriendlyErrorMessage, failureResponseErrorJson));
        } catch (Throwable th) {
            Response response2 = deletePreviewResponse;
            if (response2 != null) {
                response2.close();
            }
            throw th;
        }
    }

    public final void acceptPluginToS(@NotNull String accessToken) throws ActionsBuilderException {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Plugin.AcceptAssistantPluginToSRequest requestProto = Plugin.AcceptAssistantPluginToSRequest.getDefaultInstance();
        String json = null;
        try {
            json = JsonFormat.printer().print(requestProto);
        } catch (InvalidProtocolBufferException e) {
            throw new RuntimeException(e);
        }
        RequestBody body = RequestBody.create(HttpClientKt.access$getJSON$p(), json);
        Request acceptAssistantPluginToSRequest = new Request.Builder().url("https://actions.googleapis.com/v2/pluginTos:accept").addHeader("Authorization", "Bearer " + accessToken).post(body).build();
        String failureResponseErrorJson = null;
        String userFriendlyErrorMessage = null;
        Response acceptTosResponse = null;
        try {
            try {
                acceptTosResponse = this.client.newCall(acceptAssistantPluginToSRequest).execute();
                if (acceptTosResponse.body() == null) {
                    userFriendlyErrorMessage = "Unable to complete Term of service. Could not read response from Google. Please check your network connection or try again later.";
                } else {
                    Intrinsics.checkNotNullExpressionValue(acceptTosResponse, "acceptTosResponse");
                    if (acceptTosResponse.isSuccessful()) {
                        acceptTosResponse.close();
                        return;
                    }
                    ResponseBody body2 = acceptTosResponse.body();
                    Intrinsics.checkNotNull(body2);
                    failureResponseErrorJson = body2.string();
                }
                if (acceptTosResponse != null) {
                    acceptTosResponse.close();
                }
            } catch (IOException e) {
                userFriendlyErrorMessage = e.getMessage();
                Response response = acceptTosResponse;
                if (response != null) {
                    response.close();
                }
            }
            throw new ActionsBuilderException(HttpClientKt.access$formatErrorMessage("Accept Plugin ToS", userFriendlyErrorMessage, failureResponseErrorJson));
        } catch (Throwable th) {
            Response response2 = acceptTosResponse;
            if (response2 != null) {
                response2.close();
            }
            throw th;
        }
    }
}
