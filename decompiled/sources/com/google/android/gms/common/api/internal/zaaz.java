package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
final class zaaz implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks {
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference zaa;
    public final /* synthetic */ com.google.android.gms.common.api.internal.StatusPendingResult zab;
    public final /* synthetic */ com.google.android.gms.common.api.internal.zabe zac;

    public zaaz(com.google.android.gms.common.api.internal.zabe r1, java.util.concurrent.atomic.AtomicReference r2, com.google.android.gms.common.api.internal.StatusPendingResult r3) {
            r0 = this;
            r0.zac = r1
            r0.zaa = r2
            r0.zab = r3
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(@androidx.annotation.Nullable android.os.Bundle r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.zabe r3 = r2.zac
            java.util.concurrent.atomic.AtomicReference r0 = r2.zaa
            java.lang.Object r0 = r0.get()
            com.google.android.gms.common.api.GoogleApiClient r0 = (com.google.android.gms.common.api.GoogleApiClient) r0
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.common.api.GoogleApiClient r0 = (com.google.android.gms.common.api.GoogleApiClient) r0
            com.google.android.gms.common.api.internal.StatusPendingResult r1 = r2.zab
            com.google.android.gms.common.api.internal.zabe.zah(r3, r0, r1)
            return
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int r1) {
            r0 = this;
            return
    }
}
