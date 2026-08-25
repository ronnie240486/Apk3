package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public class ApiExceptionMapper implements com.google.android.gms.common.api.internal.StatusExceptionMapper {
    public ApiExceptionMapper() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.internal.StatusExceptionMapper
    @androidx.annotation.NonNull
    public final java.lang.Exception getException(@androidx.annotation.NonNull com.google.android.gms.common.api.Status r1) {
            r0 = this;
            com.google.android.gms.common.api.ApiException r1 = com.google.android.gms.common.internal.ApiExceptionUtil.fromStatus(r1)
            return r1
    }
}
