package com.google.assistant.plugin.appactions.api;

import com.google.assistant.plugin.common.utils.LoggingUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.MediaType;

/* compiled from: HttpClient.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 2, d1 = {"��\u0012\n��\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0018\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001H\u0002\u001a$\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\b\u0010\r\u001a\u0004\u0018\u00010\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0002\"\u000e\u0010��\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n��\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��¨\u0006\u000f"}, d2 = {"ACCEPT_PLUGIN_TOS_URL", "", "DELETE_PREVIEW_ENDPOINT_URL", "GET_PREVIEW_V2_URL", "JSON", "Lokhttp3/MediaType;", "LOG_DEVEX_EVENT_URL", "UPDATE_PREVIEW_V2_URL", "buildEndpointUrl", "endpoint", "packageName", "formatErrorMessage", "taskName", "userFriendlyErrorMessage", "failureResponseErrorJson", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/api/HttpClientKt.class */
public final class HttpClientKt {
    private static final String UPDATE_PREVIEW_V2_URL = "https://actions.googleapis.com/v2/v2/androidApps/PACKAGE_NAME/versions/preview";
    private static final String DELETE_PREVIEW_ENDPOINT_URL = "https://actions.googleapis.com/v2/androidApps/PACKAGE_NAME/versions/preview";
    private static final String GET_PREVIEW_V2_URL = "https://actions.googleapis.com/v2/v2/androidApps/PACKAGE_NAME/versions/preview";
    private static final String LOG_DEVEX_EVENT_URL = "https://actions.googleapis.com/v2/androidApps/PACKAGE_NAME/versions/metrics:log";
    private static final String ACCEPT_PLUGIN_TOS_URL = "https://actions.googleapis.com/v2/pluginTos:accept";
    private static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    public static final /* synthetic */ MediaType access$getJSON$p() {
        return JSON;
    }

    public static final /* synthetic */ String access$buildEndpointUrl(String endpoint, String packageName) {
        return buildEndpointUrl(endpoint, packageName);
    }

    public static final /* synthetic */ String access$formatErrorMessage(String taskName, String userFriendlyErrorMessage, String failureResponseErrorJson) {
        return formatErrorMessage(taskName, userFriendlyErrorMessage, failureResponseErrorJson);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String formatErrorMessage(String taskName, String userFriendlyErrorMessage, String failureResponseErrorJson) {
        StringBuilder formattedMessage = new StringBuilder(taskName).append(" Error\n\n");
        if (userFriendlyErrorMessage != null) {
            formattedMessage.append(userFriendlyErrorMessage).append("\n");
        }
        if (failureResponseErrorJson != null) {
            if (!(failureResponseErrorJson.length() == 0)) {
                try {
                    JSONObject errorObject = new JSONObject(failureResponseErrorJson).getJSONObject("error");
                    if (errorObject.has("code")) {
                        formattedMessage.append("Status Code: ").append(errorObject.getInt("code")).append("\n");
                    }
                    if (errorObject.has("message")) {
                        formattedMessage.append("Message: ").append(errorObject.getString("message")).append("\n\n");
                    }
                    JSONArray detailsArr = errorObject.getJSONArray("details");
                    int length = detailsArr.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject detailsObject = detailsArr.getJSONObject(i);
                        if (detailsObject.has("violations")) {
                            JSONArray violations = detailsObject.getJSONArray("violations");
                            int length2 = violations.length();
                            for (int j = 0; j < length2; j++) {
                                JSONObject violationsObject = violations.getJSONObject(j);
                                if (violationsObject.has("description")) {
                                    formattedMessage.append("- ").append(violationsObject.getString("description")).append("\n\n");
                                }
                            }
                        }
                    }
                    String sb = formattedMessage.toString();
                    Intrinsics.checkNotNullExpressionValue(sb, "formattedMessage.toString()");
                    return sb;
                } catch (JSONException e) {
                    LoggingUtils.INSTANCE.info(e.getMessage());
                    String sb2 = formattedMessage.toString();
                    Intrinsics.checkNotNullExpressionValue(sb2, "formattedMessage.toString()");
                    return sb2;
                }
            }
        }
        String sb3 = formattedMessage.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "formattedMessage.toString()");
        return sb3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String buildEndpointUrl(String endpoint, String packageName) {
        return StringsKt.replace(endpoint, "PACKAGE_NAME", packageName, false);
    }
}
