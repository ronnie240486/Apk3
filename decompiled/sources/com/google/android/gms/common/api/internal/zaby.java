package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class zaby extends com.google.android.gms.internal.base.zaa implements com.google.android.gms.common.api.internal.IStatusCallback {
    public zaby(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.common.api.internal.IStatusCallback"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(com.google.android.gms.common.api.Status r1) throws android.os.RemoteException {
            r0 = this;
            r1 = 0
            throw r1
    }
}
