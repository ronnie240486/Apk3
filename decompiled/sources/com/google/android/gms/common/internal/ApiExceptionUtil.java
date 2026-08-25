package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public class ApiExceptionUtil {
    public ApiExceptionUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.common.api.ApiException fromStatus(@androidx.annotation.NonNull com.google.android.gms.common.api.Status r1) {
            boolean r0 = r1.hasResolution()
            if (r0 == 0) goto Lc
            com.google.android.gms.common.api.ResolvableApiException r0 = new com.google.android.gms.common.api.ResolvableApiException
            r0.<init>(r1)
            return r0
        Lc:
            com.google.android.gms.common.api.ApiException r0 = new com.google.android.gms.common.api.ApiException
            r0.<init>(r1)
            return r0
    }
}
