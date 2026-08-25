package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes3.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public class StatusPendingResult extends com.google.android.gms.common.api.internal.BasePendingResult<com.google.android.gms.common.api.Status> {
    @java.lang.Deprecated
    public StatusPendingResult(@androidx.annotation.NonNull android.os.Looper r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public StatusPendingResult(@androidx.annotation.NonNull com.google.android.gms.common.api.GoogleApiClient r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    @androidx.annotation.NonNull
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(@androidx.annotation.NonNull com.google.android.gms.common.api.Status r1) {
            r0 = this;
            return r1
    }
}
