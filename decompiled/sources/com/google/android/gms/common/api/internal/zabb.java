package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
final class zabb implements com.google.android.gms.common.api.ResultCallback<com.google.android.gms.common.api.Status> {
    public final /* synthetic */ com.google.android.gms.common.api.internal.StatusPendingResult zaa;
    public final /* synthetic */ boolean zab;
    public final /* synthetic */ com.google.android.gms.common.api.GoogleApiClient zac;
    public final /* synthetic */ com.google.android.gms.common.api.internal.zabe zad;

    public zabb(com.google.android.gms.common.api.internal.zabe r1, com.google.android.gms.common.api.internal.StatusPendingResult r2, boolean r3, com.google.android.gms.common.api.GoogleApiClient r4) {
            r0 = this;
            r0.zad = r1
            r0.zaa = r2
            r0.zab = r3
            r0.zac = r4
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.ResultCallback
    public final /* bridge */ /* synthetic */ void onResult(@androidx.annotation.NonNull com.google.android.gms.common.api.Result r2) {
            r1 = this;
            com.google.android.gms.common.api.Status r2 = (com.google.android.gms.common.api.Status) r2
            com.google.android.gms.common.api.internal.zabe r0 = r1.zad
            android.content.Context r0 = com.google.android.gms.common.api.internal.zabe.zae(r0)
            com.google.android.gms.auth.api.signin.internal.Storage r0 = com.google.android.gms.auth.api.signin.internal.Storage.getInstance(r0)
            r0.zac()
            boolean r0 = r2.isSuccess()
            if (r0 == 0) goto L25
            com.google.android.gms.common.api.internal.zabe r0 = r1.zad
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L25
            com.google.android.gms.common.api.internal.zabe r0 = r1.zad
            r0.disconnect()
            r0.connect()
        L25:
            com.google.android.gms.common.api.internal.StatusPendingResult r0 = r1.zaa
            r0.setResult(r2)
            boolean r2 = r1.zab
            if (r2 == 0) goto L33
            com.google.android.gms.common.api.GoogleApiClient r2 = r1.zac
            r2.disconnect()
        L33:
            return
    }
}
