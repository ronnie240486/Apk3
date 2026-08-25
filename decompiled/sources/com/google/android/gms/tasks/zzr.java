package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* JADX INFO: loaded from: classes3.dex */
final class zzr<TResult> {
    private final java.lang.Object zza;

    @javax.annotation.concurrent.GuardedBy("mLock")
    private java.util.Queue<com.google.android.gms.tasks.zzq<TResult>> zzb;

    @javax.annotation.concurrent.GuardedBy("mLock")
    private boolean zzc;

    public zzr() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.zza = r0
            return
    }

    public final void zza(@androidx.annotation.NonNull com.google.android.gms.tasks.zzq<TResult> r3) {
            r2 = this;
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            java.util.Queue<com.google.android.gms.tasks.zzq<TResult>> r1 = r2.zzb     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto Le
            java.util.ArrayDeque r1 = new java.util.ArrayDeque     // Catch: java.lang.Throwable -> L15
            r1.<init>()     // Catch: java.lang.Throwable -> L15
            r2.zzb = r1     // Catch: java.lang.Throwable -> L15
        Le:
            java.util.Queue<com.google.android.gms.tasks.zzq<TResult>> r1 = r2.zzb     // Catch: java.lang.Throwable -> L15
            r1.add(r3)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return
        L15:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r3
    }

    public final void zzb(@androidx.annotation.NonNull com.google.android.gms.tasks.Task<TResult> r3) {
            r2 = this;
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            java.util.Queue<com.google.android.gms.tasks.zzq<TResult>> r1 = r2.zzb     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L2a
            boolean r1 = r2.zzc     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto Lc
            goto L2a
        Lc:
            r1 = 1
            r2.zzc = r1     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
        L10:
            java.lang.Object r1 = r2.zza
            monitor-enter(r1)
            java.util.Queue<com.google.android.gms.tasks.zzq<TResult>> r0 = r2.zzb     // Catch: java.lang.Throwable -> L27
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L27
            com.google.android.gms.tasks.zzq r0 = (com.google.android.gms.tasks.zzq) r0     // Catch: java.lang.Throwable -> L27
            if (r0 != 0) goto L22
            r3 = 0
            r2.zzc = r3     // Catch: java.lang.Throwable -> L27
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L27
            return
        L22:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L27
            r0.zzd(r3)
            goto L10
        L27:
            r3 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L27
            throw r3
        L2a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            return
        L2c:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            throw r3
    }
}
