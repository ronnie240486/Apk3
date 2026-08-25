package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public class StatusCallback extends com.google.android.gms.common.api.internal.IStatusCallback.Stub {

    @com.google.android.gms.common.annotation.KeepForSdk
    private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> mResultHolder;

    @com.google.android.gms.common.annotation.KeepForSdk
    public StatusCallback(@androidx.annotation.NonNull com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> r1) {
            r0 = this;
            r0.<init>()
            r0.mResultHolder = r1
            return
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    @com.google.android.gms.common.annotation.KeepForSdk
    public void onResult(@androidx.annotation.NonNull com.google.android.gms.common.api.Status r2) {
            r1 = this;
            com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder<com.google.android.gms.common.api.Status> r0 = r1.mResultHolder
            r0.setResult(r2)
            return
    }
}
