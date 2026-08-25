package com.google.android.play.core.tasks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzf implements com.google.android.play.core.tasks.zzg {
    private final java.util.concurrent.Executor zza;
    private final java.lang.Object zzb;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("lock")
    private final com.google.android.play.core.tasks.OnSuccessListener zzc;

    public zzf(java.util.concurrent.Executor r2, com.google.android.play.core.tasks.OnSuccessListener r3) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.zzb = r0
            r1.zza = r2
            r1.zzc = r3
            return
    }

    public static /* bridge */ /* synthetic */ com.google.android.play.core.tasks.OnSuccessListener zza(com.google.android.play.core.tasks.zzf r0) {
            com.google.android.play.core.tasks.OnSuccessListener r0 = r0.zzc
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.Object zzb(com.google.android.play.core.tasks.zzf r0) {
            java.lang.Object r0 = r0.zzb
            return r0
    }

    @Override // com.google.android.play.core.tasks.zzg
    public final void zzc(com.google.android.play.core.tasks.Task r3) {
            r2 = this;
            boolean r0 = r3.isSuccessful()
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r2.zzb
            monitor-enter(r0)
            com.google.android.play.core.tasks.OnSuccessListener r1 = r2.zzc     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return
        Lf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            java.util.concurrent.Executor r0 = r2.zza
            com.google.android.play.core.tasks.zze r1 = new com.google.android.play.core.tasks.zze
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
        L1b:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r3
        L1e:
            return
    }
}
