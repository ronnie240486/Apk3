package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzd {
    private static com.google.android.play.core.assetpacks.zza zza;

    public static synchronized com.google.android.play.core.assetpacks.zza zza(android.content.Context r3) {
            java.lang.Class<com.google.android.play.core.assetpacks.zzd> r0 = com.google.android.play.core.assetpacks.zzd.class
            monitor-enter(r0)
            com.google.android.play.core.assetpacks.zza r1 = com.google.android.play.core.assetpacks.zzd.zza     // Catch: java.lang.Throwable -> L23
            if (r1 != 0) goto L1f
            com.google.android.play.core.assetpacks.zzcb r1 = new com.google.android.play.core.assetpacks.zzcb     // Catch: java.lang.Throwable -> L23
            r2 = 0
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L23
            com.google.android.play.core.assetpacks.zzp r2 = new com.google.android.play.core.assetpacks.zzp     // Catch: java.lang.Throwable -> L23
            android.content.Context r3 = com.google.android.play.core.internal.zzce.zza(r3)     // Catch: java.lang.Throwable -> L23
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L23
            r1.zzb(r2)     // Catch: java.lang.Throwable -> L23
            com.google.android.play.core.assetpacks.zza r3 = r1.zza()     // Catch: java.lang.Throwable -> L23
            com.google.android.play.core.assetpacks.zzd.zza = r3     // Catch: java.lang.Throwable -> L23
        L1f:
            com.google.android.play.core.assetpacks.zza r3 = com.google.android.play.core.assetpacks.zzd.zza     // Catch: java.lang.Throwable -> L23
            monitor-exit(r0)
            return r3
        L23:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }
}
