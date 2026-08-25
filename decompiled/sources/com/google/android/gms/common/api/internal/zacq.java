package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
final class zacq implements java.lang.Runnable {
    public final /* synthetic */ com.google.android.gms.common.api.internal.zact zaa;

    public zacq(com.google.android.gms.common.api.internal.zact r1) {
            r0 = this;
            r0.zaa = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            com.google.android.gms.common.api.internal.zact r0 = r3.zaa
            com.google.android.gms.common.api.internal.zacs r0 = com.google.android.gms.common.api.internal.zact.zac(r0)
            com.google.android.gms.common.ConnectionResult r1 = new com.google.android.gms.common.ConnectionResult
            r2 = 4
            r1.<init>(r2)
            r0.zae(r1)
            return
    }
}
