package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
final class zaz implements com.google.android.gms.common.api.internal.zabz {
    public final /* synthetic */ com.google.android.gms.common.api.internal.zaaa zaa;

    public /* synthetic */ zaz(com.google.android.gms.common.api.internal.zaaa r1) {
            r0 = this;
            r0.zaa = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zaa(@androidx.annotation.NonNull com.google.android.gms.common.ConnectionResult r2) {
            r1 = this;
            com.google.android.gms.common.api.internal.zaaa r0 = r1.zaa
            java.util.concurrent.locks.Lock r0 = com.google.android.gms.common.api.internal.zaaa.zaj(r0)
            r0.lock()
            com.google.android.gms.common.api.internal.zaaa r0 = r1.zaa     // Catch: java.lang.Throwable -> L1d
            com.google.android.gms.common.api.internal.zaaa.zal(r0, r2)     // Catch: java.lang.Throwable -> L1d
            com.google.android.gms.common.api.internal.zaaa r2 = r1.zaa     // Catch: java.lang.Throwable -> L1d
            com.google.android.gms.common.api.internal.zaaa.zap(r2)     // Catch: java.lang.Throwable -> L1d
            com.google.android.gms.common.api.internal.zaaa r2 = r1.zaa
            java.util.concurrent.locks.Lock r2 = com.google.android.gms.common.api.internal.zaaa.zaj(r2)
            r2.unlock()
            return
        L1d:
            r2 = move-exception
            com.google.android.gms.common.api.internal.zaaa r0 = r1.zaa
            java.util.concurrent.locks.Lock r0 = com.google.android.gms.common.api.internal.zaaa.zaj(r0)
            r0.unlock()
            throw r2
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zab(@androidx.annotation.Nullable android.os.Bundle r2) {
            r1 = this;
            com.google.android.gms.common.api.internal.zaaa r2 = r1.zaa
            java.util.concurrent.locks.Lock r2 = com.google.android.gms.common.api.internal.zaaa.zaj(r2)
            r2.lock()
            com.google.android.gms.common.api.internal.zaaa r2 = r1.zaa     // Catch: java.lang.Throwable -> L1f
            com.google.android.gms.common.ConnectionResult r0 = com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS     // Catch: java.lang.Throwable -> L1f
            com.google.android.gms.common.api.internal.zaaa.zal(r2, r0)     // Catch: java.lang.Throwable -> L1f
            com.google.android.gms.common.api.internal.zaaa r2 = r1.zaa     // Catch: java.lang.Throwable -> L1f
            com.google.android.gms.common.api.internal.zaaa.zap(r2)     // Catch: java.lang.Throwable -> L1f
            com.google.android.gms.common.api.internal.zaaa r2 = r1.zaa
            java.util.concurrent.locks.Lock r2 = com.google.android.gms.common.api.internal.zaaa.zaj(r2)
            r2.unlock()
            return
        L1f:
            r2 = move-exception
            com.google.android.gms.common.api.internal.zaaa r0 = r1.zaa
            java.util.concurrent.locks.Lock r0 = com.google.android.gms.common.api.internal.zaaa.zaj(r0)
            r0.unlock()
            throw r2
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zac(int r3, boolean r4) {
            r2 = this;
            com.google.android.gms.common.api.internal.zaaa r0 = r2.zaa
            java.util.concurrent.locks.Lock r0 = com.google.android.gms.common.api.internal.zaaa.zaj(r0)
            r0.lock()
            com.google.android.gms.common.api.internal.zaaa r0 = r2.zaa     // Catch: java.lang.Throwable -> L38
            boolean r1 = com.google.android.gms.common.api.internal.zaaa.zav(r0)     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L24
            r1 = 0
            com.google.android.gms.common.api.internal.zaaa.zam(r0, r1)     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.common.api.internal.zaaa r0 = r2.zaa     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.common.api.internal.zaaa.zan(r0, r3, r4)     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.common.api.internal.zaaa r3 = r2.zaa
            java.util.concurrent.locks.Lock r3 = com.google.android.gms.common.api.internal.zaaa.zaj(r3)
        L20:
            r3.unlock()
            return
        L24:
            r4 = 1
            com.google.android.gms.common.api.internal.zaaa.zam(r0, r4)     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.common.api.internal.zaaa r4 = r2.zaa     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.common.api.internal.zabi r4 = com.google.android.gms.common.api.internal.zaaa.zah(r4)     // Catch: java.lang.Throwable -> L38
            r4.onConnectionSuspended(r3)     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.common.api.internal.zaaa r3 = r2.zaa
            java.util.concurrent.locks.Lock r3 = com.google.android.gms.common.api.internal.zaaa.zaj(r3)
            goto L20
        L38:
            r3 = move-exception
            com.google.android.gms.common.api.internal.zaaa r4 = r2.zaa
            java.util.concurrent.locks.Lock r4 = com.google.android.gms.common.api.internal.zaaa.zaj(r4)
            r4.unlock()
            throw r3
    }
}
