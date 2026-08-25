package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
final class zabn implements java.lang.Runnable {
    public final /* synthetic */ int zaa;
    public final /* synthetic */ com.google.android.gms.common.api.internal.zabq zab;

    public zabn(com.google.android.gms.common.api.internal.zabq r1, int r2) {
            r0 = this;
            r0.zab = r1
            r0.zaa = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            com.google.android.gms.common.api.internal.zabq r0 = r2.zab
            int r1 = r2.zaa
            com.google.android.gms.common.api.internal.zabq.zak(r0, r1)
            return
    }
}
