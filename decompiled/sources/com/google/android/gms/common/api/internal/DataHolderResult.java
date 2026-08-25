package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public abstract class DataHolderResult implements com.google.android.gms.common.api.Result, com.google.android.gms.common.api.Releasable {
    @Override // com.google.android.gms.common.api.Result
    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.android.gms.common.api.Status getStatus() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.common.api.Releasable
    @com.google.android.gms.common.annotation.KeepForSdk
    public void release() {
            r0 = this;
            return
    }
}
