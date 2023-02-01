package com.google.assistant.plugin.appactions.xml.actions.checks;

import android.net.Uri;
import com.google.assistant.plugin.appactions.Constants;
import com.google.common.base.Strings;
import com.google.common.net.InternetDomainName;
import java.net.IDN;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: UrlFilterValidation.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 2, d1 = {"��\u0016\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u0010\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0003H\u0002¨\u0006\n"}, d2 = {"createInternetDomainName", "Lcom/google/common/net/InternetDomainName;", "domain", "", "isValidDomain", "", "isValidDomainAndScheme", "urlFilter", "isValidUrlFilter", "s", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/xml/actions/checks/UrlFilterValidationKt.class */
public final class UrlFilterValidationKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isValidUrlFilter(String s) {
        Pattern pattern = Pattern.compile("^((?!\\.\\+).)*$");
        Matcher matcher = pattern.matcher(s);
        return matcher.find();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isValidDomainAndScheme(String urlFilter) {
        Uri parsedUri = Uri.parse(urlFilter);
        Intrinsics.checkNotNullExpressionValue(parsedUri, "parsedUri");
        String host = parsedUri.getHost();
        Intrinsics.checkNotNullExpressionValue(host, "parsedUri.host");
        if ((host.length() > 0) && !Strings.isNullOrEmpty(parsedUri.getScheme()) && (StringsKt.equals(parsedUri.getScheme(), "http", true) || StringsKt.equals(parsedUri.getScheme(), Constants.SCHEME, true))) {
            String host2 = parsedUri.getHost();
            Intrinsics.checkNotNullExpressionValue(host2, "parsedUri.host");
            if (isValidDomain(host2)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean isValidDomain(String domain) {
        boolean z;
        try {
            createInternetDomainName(domain);
            z = true;
        } catch (IllegalArgumentException e) {
            z = false;
        }
        return z;
    }

    private static final InternetDomainName createInternetDomainName(String domain) {
        IDN.toASCII(domain);
        InternetDomainName from = InternetDomainName.from(domain);
        Intrinsics.checkNotNullExpressionValue(from, "InternetDomainName.from(domain)");
        return from;
    }
}
