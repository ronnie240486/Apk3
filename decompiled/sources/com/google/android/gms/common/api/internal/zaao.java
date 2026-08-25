package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
final class zaao extends com.google.android.gms.common.api.internal.zaav {
    public final /* synthetic */ com.google.android.gms.common.api.internal.zaaw zaa;
    private final java.util.Map<com.google.android.gms.common.api.Api.Client, com.google.android.gms.common.api.internal.zaal> zac;

    public zaao(com.google.android.gms.common.api.internal.zaaw r1, java.util.Map<com.google.android.gms.common.api.Api.Client, com.google.android.gms.common.api.internal.zaal> r2) {
            r0 = this;
            r0.zaa = r1
            r0.<init>(r1)
            r0.zac = r2
            return
    }

    @Override // com.google.android.gms.common.api.internal.zaav
    @javax.annotation.concurrent.GuardedBy("mLock")
    @androidx.annotation.WorkerThread
    public final void zaa() {
            r6 = this;
            com.google.android.gms.common.internal.zal r0 = new com.google.android.gms.common.internal.zal
            com.google.android.gms.common.api.internal.zaaw r1 = r6.zaa
            com.google.android.gms.common.GoogleApiAvailabilityLight r1 = com.google.android.gms.common.api.internal.zaaw.zaf(r1)
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Map<com.google.android.gms.common.api.Api$Client, com.google.android.gms.common.api.internal.zaal> r3 = r6.zac
            java.util.Set r3 = r3.keySet()
            java.util.Iterator r3 = r3.iterator()
        L1f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L47
            java.lang.Object r4 = r3.next()
            com.google.android.gms.common.api.Api$Client r4 = (com.google.android.gms.common.api.Api.Client) r4
            boolean r5 = r4.requiresGooglePlayServices()
            if (r5 == 0) goto L43
            java.util.Map<com.google.android.gms.common.api.Api$Client, com.google.android.gms.common.api.internal.zaal> r5 = r6.zac
            java.lang.Object r5 = r5.get(r4)
            com.google.android.gms.common.api.internal.zaal r5 = (com.google.android.gms.common.api.internal.zaal) r5
            boolean r5 = com.google.android.gms.common.api.internal.zaal.zaa(r5)
            if (r5 != 0) goto L43
            r1.add(r4)
            goto L1f
        L43:
            r2.add(r4)
            goto L1f
        L47:
            boolean r3 = r1.isEmpty()
            r4 = -1
            r5 = 0
            if (r3 == 0) goto L6a
            int r1 = r2.size()
        L53:
            if (r5 >= r1) goto L84
            java.lang.Object r3 = r2.get(r5)
            com.google.android.gms.common.api.Api$Client r3 = (com.google.android.gms.common.api.Api.Client) r3
            com.google.android.gms.common.api.internal.zaaw r4 = r6.zaa
            android.content.Context r4 = com.google.android.gms.common.api.internal.zaaw.zac(r4)
            int r4 = r0.zab(r4, r3)
            int r5 = r5 + 1
            if (r4 != 0) goto L53
            goto L84
        L6a:
            int r2 = r1.size()
        L6e:
            if (r5 >= r2) goto L84
            java.lang.Object r3 = r1.get(r5)
            com.google.android.gms.common.api.Api$Client r3 = (com.google.android.gms.common.api.Api.Client) r3
            com.google.android.gms.common.api.internal.zaaw r4 = r6.zaa
            android.content.Context r4 = com.google.android.gms.common.api.internal.zaaw.zac(r4)
            int r4 = r0.zab(r4, r3)
            int r5 = r5 + 1
            if (r4 == 0) goto L6e
        L84:
            if (r4 == 0) goto L9b
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            r1 = 0
            r0.<init>(r4, r1)
            com.google.android.gms.common.api.internal.zaaw r1 = r6.zaa
            com.google.android.gms.common.api.internal.zabi r2 = com.google.android.gms.common.api.internal.zaaw.zak(r1)
            com.google.android.gms.common.api.internal.zaam r3 = new com.google.android.gms.common.api.internal.zaam
            r3.<init>(r6, r1, r0)
            r2.zal(r3)
            return
        L9b:
            com.google.android.gms.common.api.internal.zaaw r1 = r6.zaa
            boolean r2 = com.google.android.gms.common.api.internal.zaaw.zav(r1)
            if (r2 == 0) goto Lb0
            com.google.android.gms.signin.zae r2 = com.google.android.gms.common.api.internal.zaaw.zan(r1)
            if (r2 == 0) goto Lb0
            com.google.android.gms.signin.zae r1 = com.google.android.gms.common.api.internal.zaaw.zan(r1)
            r1.zab()
        Lb0:
            java.util.Map<com.google.android.gms.common.api.Api$Client, com.google.android.gms.common.api.internal.zaal> r1 = r6.zac
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        Lba:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lf3
            java.lang.Object r2 = r1.next()
            com.google.android.gms.common.api.Api$Client r2 = (com.google.android.gms.common.api.Api.Client) r2
            java.util.Map<com.google.android.gms.common.api.Api$Client, com.google.android.gms.common.api.internal.zaal> r3 = r6.zac
            java.lang.Object r3 = r3.get(r2)
            com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks r3 = (com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks) r3
            boolean r4 = r2.requiresGooglePlayServices()
            if (r4 == 0) goto Lef
            com.google.android.gms.common.api.internal.zaaw r4 = r6.zaa
            android.content.Context r4 = com.google.android.gms.common.api.internal.zaaw.zac(r4)
            int r4 = r0.zab(r4, r2)
            if (r4 == 0) goto Lef
            com.google.android.gms.common.api.internal.zaaw r2 = r6.zaa
            com.google.android.gms.common.api.internal.zabi r4 = com.google.android.gms.common.api.internal.zaaw.zak(r2)
            com.google.android.gms.common.api.internal.zaan r5 = new com.google.android.gms.common.api.internal.zaan
            r5.<init>(r2, r3)
            r4.zal(r5)
            goto Lba
        Lef:
            r2.connect(r3)
            goto Lba
        Lf3:
            return
    }
}
