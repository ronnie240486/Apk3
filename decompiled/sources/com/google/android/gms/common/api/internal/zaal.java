package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
final class zaal implements com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks {
    private final java.lang.ref.WeakReference<com.google.android.gms.common.api.internal.zaaw> zaa;
    private final com.google.android.gms.common.api.Api<?> zab;
    private final boolean zac;

    public zaal(com.google.android.gms.common.api.internal.zaaw r2, com.google.android.gms.common.api.Api<?> r3, boolean r4) {
            r1 = this;
            r1.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.zaa = r0
            r1.zab = r3
            r1.zac = r4
            return
    }

    public static /* bridge */ /* synthetic */ boolean zaa(com.google.android.gms.common.api.internal.zaal r0) {
            boolean r0 = r0.zac
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
    public final void onReportServiceBinding(@androidx.annotation.NonNull com.google.android.gms.common.ConnectionResult r4) {
            r3 = this;
            java.lang.ref.WeakReference<com.google.android.gms.common.api.internal.zaaw> r0 = r3.zaa
            java.lang.Object r0 = r0.get()
            com.google.android.gms.common.api.internal.zaaw r0 = (com.google.android.gms.common.api.internal.zaaw) r0
            if (r0 != 0) goto Lb
            return
        Lb:
            android.os.Looper r1 = android.os.Looper.myLooper()
            com.google.android.gms.common.api.internal.zabi r2 = com.google.android.gms.common.api.internal.zaaw.zak(r0)
            com.google.android.gms.common.api.internal.zabe r2 = r2.zag
            android.os.Looper r2 = r2.getLooper()
            if (r1 != r2) goto L1d
            r1 = 1
            goto L1e
        L1d:
            r1 = 0
        L1e:
            java.lang.String r2 = "onReportServiceBinding must be called on the GoogleApiClient handler thread"
            com.google.android.gms.common.internal.Preconditions.checkState(r1, r2)
            java.util.concurrent.locks.Lock r1 = com.google.android.gms.common.api.internal.zaaw.zap(r0)
            r1.lock()
            boolean r1 = com.google.android.gms.common.api.internal.zaaw.zaw(r0)     // Catch: java.lang.Throwable -> L53
            if (r1 != 0) goto L35
            java.util.concurrent.locks.Lock r4 = com.google.android.gms.common.api.internal.zaaw.zap(r0)
            goto L4f
        L35:
            boolean r1 = r4.isSuccess()     // Catch: java.lang.Throwable -> L53
            if (r1 != 0) goto L42
            com.google.android.gms.common.api.Api<?> r1 = r3.zab     // Catch: java.lang.Throwable -> L53
            boolean r2 = r3.zac     // Catch: java.lang.Throwable -> L53
            com.google.android.gms.common.api.internal.zaaw.zat(r0, r4, r1, r2)     // Catch: java.lang.Throwable -> L53
        L42:
            boolean r4 = com.google.android.gms.common.api.internal.zaaw.zax(r0)     // Catch: java.lang.Throwable -> L53
            if (r4 == 0) goto L4b
            com.google.android.gms.common.api.internal.zaaw.zau(r0)     // Catch: java.lang.Throwable -> L53
        L4b:
            java.util.concurrent.locks.Lock r4 = com.google.android.gms.common.api.internal.zaaw.zap(r0)
        L4f:
            r4.unlock()
            return
        L53:
            r4 = move-exception
            java.util.concurrent.locks.Lock r0 = com.google.android.gms.common.api.internal.zaaw.zap(r0)
            r0.unlock()
            throw r4
    }
}
