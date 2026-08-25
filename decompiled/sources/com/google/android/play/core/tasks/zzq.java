package com.google.android.play.core.tasks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzq implements com.google.android.play.core.tasks.zzp {
    private final java.lang.Object zza;
    private final int zzb;
    private final com.google.android.play.core.tasks.zzm zzc;

    @androidx.annotation.GuardedBy("lock")
    private int zzd;

    @androidx.annotation.GuardedBy("lock")
    private int zze;

    @androidx.annotation.GuardedBy("lock")
    private java.lang.Exception zzf;

    public zzq(int r2, com.google.android.play.core.tasks.zzm r3) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.zza = r0
            r1.zzb = r2
            r1.zzc = r3
            return
    }

    @androidx.annotation.GuardedBy("lock")
    private final void zza() {
            r6 = this;
            int r0 = r6.zzd
            int r1 = r6.zze
            int r0 = r0 + r1
            int r1 = r6.zzb
            if (r0 != r1) goto L3f
            java.lang.Exception r0 = r6.zzf
            if (r0 == 0) goto L39
            com.google.android.play.core.tasks.zzm r0 = r6.zzc
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
            java.lang.Exception r3 = r6.zzf
            r1.<init>(r2, r3)
            r0.zza(r1)
            return
        L39:
            com.google.android.play.core.tasks.zzm r0 = r6.zzc
            r1 = 0
            r0.zzb(r1)
        L3f:
            return
    }

    @Override // com.google.android.play.core.tasks.OnFailureListener
    public final void onFailure(@androidx.annotation.NonNull java.lang.Exception r3) {
            r2 = this;
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            int r1 = r2.zze     // Catch: java.lang.Throwable -> L10
            int r1 = r1 + 1
            r2.zze = r1     // Catch: java.lang.Throwable -> L10
            r2.zzf = r3     // Catch: java.lang.Throwable -> L10
            r2.zza()     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r3
    }

    @Override // com.google.android.play.core.tasks.OnSuccessListener
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
