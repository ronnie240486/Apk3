package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
final class zabt implements java.lang.Runnable {
    public final /* synthetic */ com.google.android.gms.common.ConnectionResult zaa;
    public final /* synthetic */ com.google.android.gms.common.api.internal.zabu zab;

    public zabt(com.google.android.gms.common.api.internal.zabu r1, com.google.android.gms.common.ConnectionResult r2) {
            r0 = this;
            r0.zab = r1
            r0.zaa = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            com.google.android.gms.common.api.internal.zabu r0 = r5.zab
            com.google.android.gms.common.api.internal.GoogleApiManager r1 = r0.zaa
            java.util.Map r1 = com.google.android.gms.common.api.internal.GoogleApiManager.zat(r1)
            com.google.android.gms.common.api.internal.ApiKey r0 = com.google.android.gms.common.api.internal.zabu.zab(r0)
            java.lang.Object r0 = r1.get(r0)
            com.google.android.gms.common.api.internal.zabq r0 = (com.google.android.gms.common.api.internal.zabq) r0
            if (r0 != 0) goto L15
            return
        L15:
            com.google.android.gms.common.ConnectionResult r1 = r5.zaa
            boolean r1 = r1.isSuccess()
            r2 = 0
            if (r1 == 0) goto L65
            com.google.android.gms.common.api.internal.zabu r1 = r5.zab
            com.google.android.gms.common.api.internal.zabu.zac(r1)
            com.google.android.gms.common.api.internal.zabu r1 = r5.zab
            com.google.android.gms.common.api.Api$Client r1 = com.google.android.gms.common.api.internal.zabu.zaa(r1)
            boolean r1 = r1.requiresSignIn()
            if (r1 == 0) goto L35
            com.google.android.gms.common.api.internal.zabu r0 = r5.zab
            com.google.android.gms.common.api.internal.zabu.zad(r0)
            return
        L35:
            com.google.android.gms.common.api.internal.zabu r1 = r5.zab     // Catch: java.lang.SecurityException -> L47
            com.google.android.gms.common.api.Api$Client r3 = com.google.android.gms.common.api.internal.zabu.zaa(r1)     // Catch: java.lang.SecurityException -> L47
            com.google.android.gms.common.api.Api$Client r1 = com.google.android.gms.common.api.internal.zabu.zaa(r1)     // Catch: java.lang.SecurityException -> L47
            java.util.Set r1 = r1.getScopesForConnectionlessNonSignIn()     // Catch: java.lang.SecurityException -> L47
            r3.getRemoteService(r2, r1)     // Catch: java.lang.SecurityException -> L47
            return
        L47:
            r1 = move-exception
            java.lang.String r3 = "GoogleApiManager"
            java.lang.String r4 = "Failed to get service from broker. "
            android.util.Log.e(r3, r4, r1)
            com.google.android.gms.common.api.internal.zabu r1 = r5.zab
            com.google.android.gms.common.api.Api$Client r1 = com.google.android.gms.common.api.internal.zabu.zaa(r1)
            java.lang.String r3 = "Failed to get service from broker."
            r1.disconnect(r3)
            com.google.android.gms.common.ConnectionResult r1 = new com.google.android.gms.common.ConnectionResult
            r3 = 10
            r1.<init>(r3)
            r0.zar(r1, r2)
            return
        L65:
            com.google.android.gms.common.ConnectionResult r1 = r5.zaa
            r0.zar(r1, r2)
            return
    }
}
