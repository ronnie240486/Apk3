package com.google.android.play.core.splitcompat;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzp implements java.lang.Runnable {
    public final /* synthetic */ com.google.android.play.core.splitcompat.SplitCompat zza;

    public zzp(com.google.android.play.core.splitcompat.SplitCompat r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            com.google.android.play.core.splitcompat.SplitCompat r0 = r3.zza     // Catch: java.lang.Exception -> La
            com.google.android.play.core.splitcompat.zze r0 = com.google.android.play.core.splitcompat.SplitCompat.zza(r0)     // Catch: java.lang.Exception -> La
            r0.zzk()     // Catch: java.lang.Exception -> La
            return
        La:
            r0 = move-exception
            java.lang.String r1 = "SplitCompat"
            java.lang.String r2 = "Failed to cleanup splitcompat storage"
            android.util.Log.e(r1, r2, r0)
            return
    }
}
