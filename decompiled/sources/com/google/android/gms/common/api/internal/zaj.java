package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
final class zaj implements com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener {
    public final int zaa;
    public final com.google.android.gms.common.api.GoogleApiClient zab;

    @androidx.annotation.Nullable
    public final com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener zac;
    public final /* synthetic */ com.google.android.gms.common.api.internal.zak zad;

    public zaj(com.google.android.gms.common.api.internal.zak r1, int r2, @androidx.annotation.Nullable com.google.android.gms.common.api.GoogleApiClient r3, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r4) {
            r0 = this;
            r0.zad = r1
            r0.<init>()
            r0.zaa = r2
            r0.zab = r3
            r0.zac = r4
            return
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(@androidx.annotation.NonNull com.google.android.gms.common.ConnectionResult r3) {
            r2 = this;
            java.lang.String r0 = java.lang.String.valueOf(r3)
            java.lang.String r1 = "beginFailureResolution for "
            java.lang.String r0 = r1.concat(r0)
            java.lang.String r1 = "AutoManageHelper"
            android.util.Log.d(r1, r0)
            com.google.android.gms.common.api.internal.zak r0 = r2.zad
            int r1 = r2.zaa
            r0.zah(r3, r1)
            return
    }
}
