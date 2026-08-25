package com.google.android.play.core.splitcompat;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzq implements java.lang.Runnable {
    public final /* synthetic */ java.util.Set zza;
    public final /* synthetic */ com.google.android.play.core.splitcompat.SplitCompat zzb;

    public zzq(com.google.android.play.core.splitcompat.SplitCompat r1, java.util.Set r2) {
            r0 = this;
            r0.zzb = r1
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            com.google.android.play.core.splitcompat.SplitCompat r0 = r3.zzb     // Catch: java.lang.Exception -> L8
            java.util.Set r1 = r3.zza     // Catch: java.lang.Exception -> L8
            com.google.android.play.core.splitcompat.SplitCompat.zzc(r0, r1)     // Catch: java.lang.Exception -> L8
            return
        L8:
            r0 = move-exception
            java.lang.String r1 = "SplitCompat"
            java.lang.String r2 = "Failed to remove from splitcompat storage split that is already installed"
            android.util.Log.e(r1, r2, r0)
            return
    }
}
