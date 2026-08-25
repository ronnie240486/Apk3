package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
final class zaat implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener {
    public final /* synthetic */ com.google.android.gms.common.api.internal.zaaw zaa;

    public /* synthetic */ zaat(com.google.android.gms.common.api.internal.zaaw r1) {
            r0 = this;
            r0.zaa = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(@androidx.annotation.Nullable android.os.Bundle r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.zaaw r3 = r2.zaa
            com.google.android.gms.common.internal.ClientSettings r3 = com.google.android.gms.common.api.internal.zaaw.zal(r3)
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            com.google.android.gms.common.internal.ClientSettings r3 = (com.google.android.gms.common.internal.ClientSettings) r3
            com.google.android.gms.common.api.internal.zaaw r3 = r2.zaa
            com.google.android.gms.signin.zae r3 = com.google.android.gms.common.api.internal.zaaw.zan(r3)
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            com.google.android.gms.signin.zae r3 = (com.google.android.gms.signin.zae) r3
            com.google.android.gms.common.api.internal.zaar r0 = new com.google.android.gms.common.api.internal.zaar
            com.google.android.gms.common.api.internal.zaaw r1 = r2.zaa
            r0.<init>(r1)
            r3.zad(r0)
            return
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(@androidx.annotation.NonNull com.google.android.gms.common.ConnectionResult r2) {
            r1 = this;
            com.google.android.gms.common.api.internal.zaaw r0 = r1.zaa
            java.util.concurrent.locks.Lock r0 = com.google.android.gms.common.api.internal.zaaw.zap(r0)
            r0.lock()
            com.google.android.gms.common.api.internal.zaaw r0 = r1.zaa     // Catch: java.lang.Throwable -> L2b
            boolean r0 = com.google.android.gms.common.api.internal.zaaw.zay(r0, r2)     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L1c
            com.google.android.gms.common.api.internal.zaaw r2 = r1.zaa     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.common.api.internal.zaaw.zaq(r2)     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.common.api.internal.zaaw r2 = r1.zaa     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.common.api.internal.zaaw.zau(r2)     // Catch: java.lang.Throwable -> L2b
            goto L21
        L1c:
            com.google.android.gms.common.api.internal.zaaw r0 = r1.zaa     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.common.api.internal.zaaw.zas(r0, r2)     // Catch: java.lang.Throwable -> L2b
        L21:
            com.google.android.gms.common.api.internal.zaaw r2 = r1.zaa
            java.util.concurrent.locks.Lock r2 = com.google.android.gms.common.api.internal.zaaw.zap(r2)
            r2.unlock()
            return
        L2b:
            r2 = move-exception
            com.google.android.gms.common.api.internal.zaaw r0 = r1.zaa
            java.util.concurrent.locks.Lock r0 = com.google.android.gms.common.api.internal.zaaw.zap(r0)
            r0.unlock()
            throw r2
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int r1) {
            r0 = this;
            return
    }
}
