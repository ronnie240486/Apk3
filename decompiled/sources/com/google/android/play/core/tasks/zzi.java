package com.google.android.play.core.tasks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzi {
    private final com.google.android.play.core.tasks.zzm zza;

    public zzi() {
            r1 = this;
            r1.<init>()
            com.google.android.play.core.tasks.zzm r0 = new com.google.android.play.core.tasks.zzm
            r0.<init>()
            r1.zza = r0
            return
    }

    public final com.google.android.play.core.tasks.Task zza() {
            r1 = this;
            com.google.android.play.core.tasks.zzm r0 = r1.zza
            return r0
    }

    public final void zzb(java.lang.Exception r2) {
            r1 = this;
            com.google.android.play.core.tasks.zzm r0 = r1.zza
            r0.zza(r2)
            return
    }

    public final void zzc(java.lang.Object r2) {
            r1 = this;
            com.google.android.play.core.tasks.zzm r0 = r1.zza
            r0.zzb(r2)
            return
    }

    public final boolean zzd(java.lang.Exception r2) {
            r1 = this;
            com.google.android.play.core.tasks.zzm r0 = r1.zza
            boolean r2 = r0.zzc(r2)
            return r2
    }

    public final boolean zze(java.lang.Object r2) {
            r1 = this;
            com.google.android.play.core.tasks.zzm r0 = r1.zza
            boolean r2 = r0.zzd(r2)
            return r2
    }
}
