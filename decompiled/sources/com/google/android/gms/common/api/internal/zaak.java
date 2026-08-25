package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
final class zaak implements java.lang.Runnable {
    public final /* synthetic */ com.google.android.gms.common.api.internal.zaaw zaa;

    public zaak(com.google.android.gms.common.api.internal.zaaw r1) {
            r0 = this;
            r0.zaa = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            com.google.android.gms.common.api.internal.zaaw r0 = r2.zaa
            com.google.android.gms.common.GoogleApiAvailabilityLight r1 = com.google.android.gms.common.api.internal.zaaw.zaf(r0)
            android.content.Context r0 = com.google.android.gms.common.api.internal.zaaw.zac(r0)
            r1.cancelAvailabilityErrorNotifications(r0)
            return
    }
}
