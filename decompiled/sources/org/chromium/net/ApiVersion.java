package org.chromium.net;

/* JADX INFO: loaded from: classes3.dex */
public class ApiVersion {
    private static final int API_LEVEL = 12;
    private static final java.lang.String CRONET_VERSION = "72.0.3626.96";
    private static final java.lang.String LAST_CHANGE = "84098ee7ef8622a9defc2ef043cd8930b617b10e-refs/branch-heads/3626@{#836}";
    private static final int MIN_COMPATIBLE_API_LEVEL = 3;

    private ApiVersion() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getApiLevel() {
            r0 = 3
            return r0
    }

    public static java.lang.String getCronetVersion() {
            java.lang.String r0 = "72.0.3626.96"
            return r0
    }

    public static java.lang.String getCronetVersionWithLastChange() {
            java.lang.String r0 = "72.0.3626.96@84098ee7"
            return r0
    }

    public static java.lang.String getLastChange() {
            java.lang.String r0 = "84098ee7ef8622a9defc2ef043cd8930b617b10e-refs/branch-heads/3626@{#836}"
            return r0
    }

    public static int getMaximumAvailableApiLevel() {
            r0 = 12
            return r0
    }
}
