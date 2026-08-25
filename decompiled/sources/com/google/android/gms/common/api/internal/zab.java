package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class zab extends com.google.android.gms.common.api.internal.ActivityLifecycleObserver {
    private final java.lang.ref.WeakReference<com.google.android.gms.common.api.internal.zaa> zaa;

    @androidx.annotation.VisibleForTesting(otherwise = 2)
    public zab(com.google.android.gms.common.api.internal.zaa r2) {
            r1 = this;
            r1.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.zaa = r0
            return
    }

    @Override // com.google.android.gms.common.api.internal.ActivityLifecycleObserver
    public final com.google.android.gms.common.api.internal.ActivityLifecycleObserver onStopCallOnce(java.lang.Runnable r2) {
            r1 = this;
            java.lang.ref.WeakReference<com.google.android.gms.common.api.internal.zaa> r0 = r1.zaa
            java.lang.Object r0 = r0.get()
            com.google.android.gms.common.api.internal.zaa r0 = (com.google.android.gms.common.api.internal.zaa) r0
            if (r0 == 0) goto Le
            com.google.android.gms.common.api.internal.zaa.zab(r0, r2)
            return r1
        Le:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "The target activity has already been GC'd"
            r2.<init>(r0)
            throw r2
    }
}
