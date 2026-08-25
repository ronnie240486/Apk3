package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
final class zaap extends com.google.android.gms.common.api.internal.zaav {
    public final /* synthetic */ com.google.android.gms.common.api.internal.zaaw zaa;
    private final java.util.ArrayList<com.google.android.gms.common.api.Api.Client> zac;

    public zaap(com.google.android.gms.common.api.internal.zaaw r1, java.util.ArrayList<com.google.android.gms.common.api.Api.Client> r2) {
            r0 = this;
            r0.zaa = r1
            r0.<init>(r1)
            r0.zac = r2
            return
    }

    @Override // com.google.android.gms.common.api.internal.zaav
    @androidx.annotation.WorkerThread
    public final void zaa() {
            r6 = this;
            com.google.android.gms.common.api.internal.zaaw r0 = r6.zaa
            com.google.android.gms.common.api.internal.zabi r1 = com.google.android.gms.common.api.internal.zaaw.zak(r0)
            com.google.android.gms.common.api.internal.zabe r1 = r1.zag
            java.util.Set r0 = com.google.android.gms.common.api.internal.zaaw.zao(r0)
            r1.zad = r0
            java.util.ArrayList<com.google.android.gms.common.api.Api$Client> r0 = r6.zac
            int r1 = r0.size()
            r2 = 0
        L15:
            if (r2 >= r1) goto L31
            java.lang.Object r3 = r0.get(r2)
            com.google.android.gms.common.api.Api$Client r3 = (com.google.android.gms.common.api.Api.Client) r3
            com.google.android.gms.common.api.internal.zaaw r4 = r6.zaa
            com.google.android.gms.common.internal.IAccountAccessor r5 = com.google.android.gms.common.api.internal.zaaw.zam(r4)
            com.google.android.gms.common.api.internal.zabi r4 = com.google.android.gms.common.api.internal.zaaw.zak(r4)
            com.google.android.gms.common.api.internal.zabe r4 = r4.zag
            java.util.Set<com.google.android.gms.common.api.Scope> r4 = r4.zad
            r3.getRemoteService(r5, r4)
            int r2 = r2 + 1
            goto L15
        L31:
            return
    }
}
