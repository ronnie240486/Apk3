package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
final class zah implements com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks {
    public final /* synthetic */ com.google.android.gms.common.api.internal.ConnectionCallbacks zaa;

    public zah(com.google.android.gms.common.api.internal.ConnectionCallbacks r1) {
            r0 = this;
            r0.zaa = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@androidx.annotation.Nullable android.os.Bundle r2) {
            r1 = this;
            com.google.android.gms.common.api.internal.ConnectionCallbacks r0 = r1.zaa
            r0.onConnected(r2)
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int r2) {
            r1 = this;
            com.google.android.gms.common.api.internal.ConnectionCallbacks r0 = r1.zaa
            r0.onConnectionSuspended(r2)
            return
    }
}
