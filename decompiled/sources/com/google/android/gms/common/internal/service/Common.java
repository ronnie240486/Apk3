package com.google.android.gms.common.internal.service;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
public final class Common {

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> API = null;

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.common.internal.service.zah> CLIENT_KEY = null;
    public static final com.google.android.gms.common.internal.service.zae zaa = null;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.common.internal.service.zah, com.google.android.gms.common.api.Api.ApiOptions.NoOptions> zab = null;

    static {
            com.google.android.gms.common.api.Api$ClientKey r0 = new com.google.android.gms.common.api.Api$ClientKey
            r0.<init>()
            com.google.android.gms.common.internal.service.Common.CLIENT_KEY = r0
            com.google.android.gms.common.internal.service.zab r1 = new com.google.android.gms.common.internal.service.zab
            r1.<init>()
            com.google.android.gms.common.internal.service.Common.zab = r1
            com.google.android.gms.common.api.Api r2 = new com.google.android.gms.common.api.Api
            java.lang.String r3 = "Common.API"
            r2.<init>(r3, r1, r0)
            com.google.android.gms.common.internal.service.Common.API = r2
            com.google.android.gms.common.internal.service.zae r0 = new com.google.android.gms.common.internal.service.zae
            r0.<init>()
            com.google.android.gms.common.internal.service.Common.zaa = r0
            return
    }

    public Common() {
            r0 = this;
            r0.<init>()
            return
    }
}
