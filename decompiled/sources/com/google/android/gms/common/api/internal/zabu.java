package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
final class zabu implements com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks, com.google.android.gms.common.api.internal.zacs {
    public final /* synthetic */ com.google.android.gms.common.api.internal.GoogleApiManager zaa;
    private final com.google.android.gms.common.api.Api.Client zab;
    private final com.google.android.gms.common.api.internal.ApiKey<?> zac;

    @androidx.annotation.Nullable
    private com.google.android.gms.common.internal.IAccountAccessor zad;

    @androidx.annotation.Nullable
    private java.util.Set<com.google.android.gms.common.api.Scope> zae;
    private boolean zaf;

    public zabu(com.google.android.gms.common.api.internal.GoogleApiManager r1, com.google.android.gms.common.api.Api.Client r2, com.google.android.gms.common.api.internal.ApiKey<?> r3) {
            r0 = this;
            r0.zaa = r1
            r0.<init>()
            r1 = 0
            r0.zad = r1
            r0.zae = r1
            r1 = 0
            r0.zaf = r1
            r0.zab = r2
            r0.zac = r3
            return
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.api.Api.Client zaa(com.google.android.gms.common.api.internal.zabu r0) {
            com.google.android.gms.common.api.Api$Client r0 = r0.zab
            return r0
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.api.internal.ApiKey zab(com.google.android.gms.common.api.internal.zabu r0) {
            com.google.android.gms.common.api.internal.ApiKey<?> r0 = r0.zac
            return r0
    }

    public static /* bridge */ /* synthetic */ void zac(com.google.android.gms.common.api.internal.zabu r1) {
            r0 = 1
            r1.zaf = r0
            return
    }

    public static /* bridge */ /* synthetic */ void zad(com.google.android.gms.common.api.internal.zabu r0) {
            r0.zag()
            return
    }

    @androidx.annotation.WorkerThread
    private final void zag() {
            r3 = this;
            boolean r0 = r3.zaf
            if (r0 == 0) goto Lf
            com.google.android.gms.common.internal.IAccountAccessor r0 = r3.zad
            if (r0 == 0) goto Lf
            com.google.android.gms.common.api.Api$Client r1 = r3.zab
            java.util.Set<com.google.android.gms.common.api.Scope> r2 = r3.zae
            r1.getRemoteService(r0, r2)
        Lf:
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
    public final void onReportServiceBinding(@androidx.annotation.NonNull com.google.android.gms.common.ConnectionResult r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r2.zaa
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zaf(r0)
            com.google.android.gms.common.api.internal.zabt r1 = new com.google.android.gms.common.api.internal.zabt
            r1.<init>(r2, r3)
            r0.post(r1)
            return
    }

    @Override // com.google.android.gms.common.api.internal.zacs
    @androidx.annotation.WorkerThread
    public final void zae(com.google.android.gms.common.ConnectionResult r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r2.zaa
            java.util.Map r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zat(r0)
            com.google.android.gms.common.api.internal.ApiKey<?> r1 = r2.zac
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.common.api.internal.zabq r0 = (com.google.android.gms.common.api.internal.zabq) r0
            if (r0 == 0) goto L13
            r0.zas(r3)
        L13:
            return
    }

    @Override // com.google.android.gms.common.api.internal.zacs
    @androidx.annotation.WorkerThread
    public final void zaf(@androidx.annotation.Nullable com.google.android.gms.common.internal.IAccountAccessor r2, @androidx.annotation.Nullable java.util.Set<com.google.android.gms.common.api.Scope> r3) {
            r1 = this;
            if (r2 == 0) goto Ld
            if (r3 != 0) goto L5
            goto Ld
        L5:
            r1.zad = r2
            r1.zae = r3
            r1.zag()
            return
        Ld:
            java.lang.Exception r2 = new java.lang.Exception
            r2.<init>()
            java.lang.String r3 = "GoogleApiManager"
            java.lang.String r0 = "Received null response from onSignInSuccess"
            android.util.Log.wtf(r3, r0, r2)
            com.google.android.gms.common.ConnectionResult r2 = new com.google.android.gms.common.ConnectionResult
            r3 = 4
            r2.<init>(r3)
            r1.zae(r2)
            return
    }
}
