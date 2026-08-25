package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.VisibleForTesting(otherwise = 2)
final class zaa extends com.google.android.gms.common.api.internal.LifecycleCallback {
    private java.util.List<java.lang.Runnable> zaa;

    private zaa(com.google.android.gms.common.api.internal.LifecycleFragment r2) {
            r1 = this;
            r1.<init>(r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.zaa = r0
            java.lang.String r0 = "LifecycleObserverOnStop"
            r2.addCallback(r0, r1)
            return
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.api.internal.zaa zaa(android.app.Activity r3) {
            monitor-enter(r3)
            com.google.android.gms.common.api.internal.LifecycleFragment r0 = com.google.android.gms.common.api.internal.LifecycleCallback.getFragment(r3)     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = "LifecycleObserverOnStop"
            java.lang.Class<com.google.android.gms.common.api.internal.zaa> r2 = com.google.android.gms.common.api.internal.zaa.class
            com.google.android.gms.common.api.internal.LifecycleCallback r1 = r0.getCallbackOrNull(r1, r2)     // Catch: java.lang.Throwable -> L18
            com.google.android.gms.common.api.internal.zaa r1 = (com.google.android.gms.common.api.internal.zaa) r1     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L16
            com.google.android.gms.common.api.internal.zaa r1 = new com.google.android.gms.common.api.internal.zaa     // Catch: java.lang.Throwable -> L18
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L18
        L16:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L18
            return r1
        L18:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L18
            throw r0
    }

    public static /* bridge */ /* synthetic */ void zab(com.google.android.gms.common.api.internal.zaa r0, java.lang.Runnable r1) {
            r0.zac(r1)
            return
    }

    private final synchronized void zac(java.lang.Runnable r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.List<java.lang.Runnable> r0 = r1.zaa     // Catch: java.lang.Throwable -> L8
            r0.add(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    @androidx.annotation.MainThread
    public final void onStop() {
            r2 = this;
            monitor-enter(r2)
            java.util.List<java.lang.Runnable> r0 = r2.zaa     // Catch: java.lang.Throwable -> L20
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L20
            r1.<init>()     // Catch: java.lang.Throwable -> L20
            r2.zaa = r1     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r1.run()
            goto Lf
        L1f:
            return
        L20:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r0
    }
}
