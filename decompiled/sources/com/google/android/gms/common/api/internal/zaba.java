package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
final class zaba implements com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener {
    public final /* synthetic */ com.google.android.gms.common.api.internal.StatusPendingResult zaa;

    public zaba(com.google.android.gms.common.api.internal.StatusPendingResult r1) {
            r0 = this;
            r0.zaa = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(@androidx.annotation.NonNull com.google.android.gms.common.ConnectionResult r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.StatusPendingResult r3 = r2.zaa
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 8
            r0.<init>(r1)
            r3.setResult(r0)
            return
    }
}
