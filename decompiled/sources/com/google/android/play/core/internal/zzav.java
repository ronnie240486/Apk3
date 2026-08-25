package com.google.android.play.core.internal;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzav implements java.lang.Runnable {
    public final /* synthetic */ java.util.List zza;
    public final /* synthetic */ com.google.android.play.core.splitinstall.zzf zzb;
    public final /* synthetic */ com.google.android.play.core.internal.zzaw zzc;

    public zzav(com.google.android.play.core.internal.zzaw r1, java.util.List r2, com.google.android.play.core.splitinstall.zzf r3) {
            r0 = this;
            r0.zzc = r1
            r0.zza = r2
            r0.zzb = r3
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            com.google.android.play.core.internal.zzaw r0 = r3.zzc     // Catch: java.lang.Exception -> L20
            com.google.android.play.core.internal.zzay r0 = com.google.android.play.core.internal.zzaw.zza(r0)     // Catch: java.lang.Exception -> L20
            java.util.List r1 = r3.zza     // Catch: java.lang.Exception -> L20
            boolean r0 = r0.zzb(r1)     // Catch: java.lang.Exception -> L20
            if (r0 == 0) goto L16
            com.google.android.play.core.internal.zzaw r0 = r3.zzc
            com.google.android.play.core.splitinstall.zzf r1 = r3.zzb
            com.google.android.play.core.internal.zzaw.zzc(r0, r1)
            return
        L16:
            com.google.android.play.core.internal.zzaw r0 = r3.zzc
            java.util.List r1 = r3.zza
            com.google.android.play.core.splitinstall.zzf r2 = r3.zzb
            com.google.android.play.core.internal.zzaw.zzb(r0, r1, r2)
            return
        L20:
            r0 = move-exception
            java.lang.String r1 = "SplitCompat"
            java.lang.String r2 = "Error checking verified files."
            android.util.Log.e(r1, r2, r0)
            com.google.android.play.core.splitinstall.zzf r0 = r3.zzb
            r1 = -11
            r0.zzb(r1)
            return
    }
}
