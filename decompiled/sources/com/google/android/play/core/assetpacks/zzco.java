package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzco {
    private final java.util.Map zza;

    public zzco() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zza = r0
            return
    }

    public final synchronized double zza(java.lang.String r3) {
            r2 = this;
            monitor-enter(r2)
            java.util.Map r0 = r2.zza     // Catch: java.lang.Throwable -> L15
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L15
            java.lang.Double r3 = (java.lang.Double) r3     // Catch: java.lang.Throwable -> L15
            if (r3 != 0) goto Lf
            r0 = 0
            monitor-exit(r2)
            return r0
        Lf:
            double r0 = r3.doubleValue()     // Catch: java.lang.Throwable -> L15
            monitor-exit(r2)
            return r0
        L15:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    public final synchronized double zzb(java.lang.String r5, com.google.android.play.core.assetpacks.zzdg r6) {
            r4 = this;
            monitor-enter(r4)
            r0 = r6
            com.google.android.play.core.assetpacks.zzce r0 = (com.google.android.play.core.assetpacks.zzce) r0     // Catch: java.lang.Throwable -> L1b
            int r0 = r0.zzf     // Catch: java.lang.Throwable -> L1b
            double r0 = (double) r0     // Catch: java.lang.Throwable -> L1b
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 + r2
            com.google.android.play.core.assetpacks.zzce r6 = (com.google.android.play.core.assetpacks.zzce) r6     // Catch: java.lang.Throwable -> L1b
            int r6 = r6.zzg     // Catch: java.lang.Throwable -> L1b
            double r2 = (double) r6     // Catch: java.lang.Throwable -> L1b
            double r0 = r0 / r2
            java.util.Map r6 = r4.zza     // Catch: java.lang.Throwable -> L1b
            java.lang.Double r2 = java.lang.Double.valueOf(r0)     // Catch: java.lang.Throwable -> L1b
            r6.put(r5, r2)     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r4)
            return r0
        L1b:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    public final synchronized void zzc(java.lang.String r4) {
            r3 = this;
            monitor-enter(r3)
            java.util.Map r0 = r3.zza     // Catch: java.lang.Throwable -> Le
            r1 = 0
            java.lang.Double r1 = java.lang.Double.valueOf(r1)     // Catch: java.lang.Throwable -> Le
            r0.put(r4, r1)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r3)
            return
        Le:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }
}
