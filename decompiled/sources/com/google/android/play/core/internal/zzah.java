package com.google.android.play.core.internal;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzah implements java.lang.Runnable {

    @androidx.annotation.Nullable
    private final com.google.android.play.core.tasks.zzi zza;

    public zzah() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zza = r0
            return
    }

    public zzah(@androidx.annotation.Nullable com.google.android.play.core.tasks.zzi r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            r1.zza()     // Catch: java.lang.Exception -> L4
            return
        L4:
            r0 = move-exception
            r1.zzc(r0)
            return
    }

    public abstract void zza();

    @androidx.annotation.Nullable
    public final com.google.android.play.core.tasks.zzi zzb() {
            r1 = this;
            com.google.android.play.core.tasks.zzi r0 = r1.zza
            return r0
    }

    public final void zzc(java.lang.Exception r2) {
            r1 = this;
            com.google.android.play.core.tasks.zzi r0 = r1.zza
            if (r0 == 0) goto L7
            r0.zzd(r2)
        L7:
            return
    }
}
