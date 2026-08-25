package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaf implements com.google.android.gms.tasks.zzae {
    private final java.lang.Object zza;
    private final int zzb;
    private final com.google.android.gms.tasks.zzw<java.lang.Void> zzc;

    @javax.annotation.concurrent.GuardedBy("mLock")
    private int zzd;

    @javax.annotation.concurrent.GuardedBy("mLock")
    private int zze;

    @javax.annotation.concurrent.GuardedBy("mLock")
    private int zzf;

    @javax.annotation.concurrent.GuardedBy("mLock")
    private java.lang.Exception zzg;

    @javax.annotation.concurrent.GuardedBy("mLock")
    private boolean zzh;

    public zzaf(int r2, com.google.android.gms.tasks.zzw<java.lang.Void> r3) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.zza = r0
            r1.zzb = r2
            r1.zzc = r3
            return
    }

    @javax.annotation.concurrent.GuardedBy("mLock")
    private final void zza() {
            r6 = this;
            int r0 = r6.zzd
            int r1 = r6.zze
            int r0 = r0 + r1
            int r1 = r6.zzf
            int r0 = r0 + r1
            int r1 = r6.zzb
            if (r0 != r1) goto L4c
            java.lang.Exception r0 = r6.zzg
            if (r0 == 0) goto L3c
            com.google.android.gms.tasks.zzw<java.lang.Void> r0 = r6.zzc
            java.util.concurrent.ExecutionException r1 = new java.util.concurrent.ExecutionException
            int r2 = r6.zze
            int r3 = r6.zzb
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 54
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = " out of "
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = " underlying tasks failed"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.Exception r3 = r6.zzg
            r1.<init>(r2, r3)
            r0.zza(r1)
            return
        L3c:
            boolean r0 = r6.zzh
            if (r0 == 0) goto L46
            com.google.android.gms.tasks.zzw<java.lang.Void> r0 = r6.zzc
            r0.zzc()
            return
        L46:
            com.google.android.gms.tasks.zzw<java.lang.Void> r0 = r6.zzc
            r1 = 0
            r0.zzb(r1)
        L4c:
            return
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
            r3 = this;
            java.lang.Object r0 = r3.zza
            monitor-enter(r0)
            int r1 = r3.zzf     // Catch: java.lang.Throwable -> L10
            r2 = 1
            int r1 = r1 + r2
            r3.zzf = r1     // Catch: java.lang.Throwable -> L10
            r3.zzh = r2     // Catch: java.lang.Throwable -> L10
            r3.zza()     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(@androidx.annotation.NonNull java.lang.Exception r3) {
            r2 = this;
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            int r1 = r2.zze     // Catch: java.lang.Throwable -> L10
            int r1 = r1 + 1
            r2.zze = r1     // Catch: java.lang.Throwable -> L10
            r2.zzg = r3     // Catch: java.lang.Throwable -> L10
            r2.zza()     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r3
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(java.lang.Object r2) {
            r1 = this;
            java.lang.Object r2 = r1.zza
            monitor-enter(r2)
            int r0 = r1.zzd     // Catch: java.lang.Throwable -> Le
            int r0 = r0 + 1
            r1.zzd = r0     // Catch: java.lang.Throwable -> Le
            r1.zza()     // Catch: java.lang.Throwable -> Le
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            throw r0
    }
}
