package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* JADX INFO: loaded from: classes3.dex */
final class zzv extends com.google.android.gms.common.api.internal.LifecycleCallback {
    private final java.util.List<java.lang.ref.WeakReference<com.google.android.gms.tasks.zzq<?>>> zza;

    private zzv(com.google.android.gms.common.api.internal.LifecycleFragment r2) {
            r1 = this;
            r1.<init>(r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.zza = r0
            java.lang.String r0 = "TaskOnStopCallback"
            r2.addCallback(r0, r1)
            return
    }

    public static com.google.android.gms.tasks.zzv zza(android.app.Activity r2) {
            com.google.android.gms.common.api.internal.LifecycleFragment r2 = com.google.android.gms.common.api.internal.LifecycleCallback.getFragment(r2)
            java.lang.Class<com.google.android.gms.tasks.zzv> r0 = com.google.android.gms.tasks.zzv.class
            java.lang.String r1 = "TaskOnStopCallback"
            com.google.android.gms.common.api.internal.LifecycleCallback r0 = r2.getCallbackOrNull(r1, r0)
            com.google.android.gms.tasks.zzv r0 = (com.google.android.gms.tasks.zzv) r0
            if (r0 != 0) goto L15
            com.google.android.gms.tasks.zzv r0 = new com.google.android.gms.tasks.zzv
            r0.<init>(r2)
        L15:
            return r0
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    @androidx.annotation.MainThread
    public final void onStop() {
            r3 = this;
            java.util.List<java.lang.ref.WeakReference<com.google.android.gms.tasks.zzq<?>>> r0 = r3.zza
            monitor-enter(r0)
            java.util.List<java.lang.ref.WeakReference<com.google.android.gms.tasks.zzq<?>>> r1 = r3.zza     // Catch: java.lang.Throwable -> L28
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L28
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L28
            if (r2 == 0) goto L21
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L28
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch: java.lang.Throwable -> L28
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L28
            com.google.android.gms.tasks.zzq r2 = (com.google.android.gms.tasks.zzq) r2     // Catch: java.lang.Throwable -> L28
            if (r2 == 0) goto L9
            r2.zzc()     // Catch: java.lang.Throwable -> L28
            goto L9
        L21:
            java.util.List<java.lang.ref.WeakReference<com.google.android.gms.tasks.zzq<?>>> r1 = r3.zza     // Catch: java.lang.Throwable -> L28
            r1.clear()     // Catch: java.lang.Throwable -> L28
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            return
        L28:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            throw r1
    }

    public final <T> void zzb(com.google.android.gms.tasks.zzq<T> r4) {
            r3 = this;
            java.util.List<java.lang.ref.WeakReference<com.google.android.gms.tasks.zzq<?>>> r0 = r3.zza
            monitor-enter(r0)
            java.util.List<java.lang.ref.WeakReference<com.google.android.gms.tasks.zzq<?>>> r1 = r3.zza     // Catch: java.lang.Throwable -> Lf
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> Lf
            r2.<init>(r4)     // Catch: java.lang.Throwable -> Lf
            r1.add(r2)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r4
    }
}
