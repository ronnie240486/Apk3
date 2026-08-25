package com.google.android.play.core.listener;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzc {
    public final com.google.android.play.core.internal.zzag zza;
    public final java.util.HashSet zzb;
    private final android.content.IntentFilter zzc;
    private final android.content.Context zzd;

    @androidx.annotation.Nullable
    private com.google.android.play.core.listener.zzb zze;
    private volatile boolean zzf;

    public zzc(com.google.android.play.core.internal.zzag r2, android.content.IntentFilter r3, android.content.Context r4) {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.zzb = r0
            r0 = 0
            r1.zze = r0
            r0 = 0
            r1.zzf = r0
            r1.zza = r2
            r1.zzc = r3
            android.content.Context r2 = com.google.android.play.core.internal.zzce.zza(r4)
            r1.zzd = r2
            return
    }

    private final void zzb() {
            r3 = this;
            boolean r0 = r3.zzf
            if (r0 != 0) goto Lc
            java.util.HashSet r0 = r3.zzb
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1e
        Lc:
            com.google.android.play.core.listener.zzb r0 = r3.zze
            if (r0 != 0) goto L1e
            com.google.android.play.core.listener.zzb r0 = new com.google.android.play.core.listener.zzb
            r0.<init>(r3)
            r3.zze = r0
            android.content.Context r1 = r3.zzd
            android.content.IntentFilter r2 = r3.zzc
            r1.registerReceiver(r0, r2)
        L1e:
            boolean r0 = r3.zzf
            if (r0 != 0) goto L36
            java.util.HashSet r0 = r3.zzb
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L36
            com.google.android.play.core.listener.zzb r0 = r3.zze
            if (r0 == 0) goto L36
            android.content.Context r1 = r3.zzd
            r1.unregisterReceiver(r0)
            r0 = 0
            r3.zze = r0
        L36:
            return
    }

    public abstract void zza(android.content.Context r1, android.content.Intent r2);

    public final synchronized void zze() {
            r3 = this;
            monitor-enter(r3)
            com.google.android.play.core.internal.zzag r0 = r3.zza     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = "clearListeners"
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L15
            r0.zzd(r1, r2)     // Catch: java.lang.Throwable -> L15
            java.util.HashSet r0 = r3.zzb     // Catch: java.lang.Throwable -> L15
            r0.clear()     // Catch: java.lang.Throwable -> L15
            r3.zzb()     // Catch: java.lang.Throwable -> L15
            monitor-exit(r3)
            return
        L15:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    public final synchronized void zzf(com.google.android.play.core.listener.StateUpdatedListener r4) {
            r3 = this;
            monitor-enter(r3)
            com.google.android.play.core.internal.zzag r0 = r3.zza     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = "registerListener"
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L1a
            r0.zzd(r1, r2)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r0 = "Registered Play Core listener should not be null."
            com.google.android.play.core.internal.zzci.zza(r4, r0)     // Catch: java.lang.Throwable -> L1a
            java.util.HashSet r0 = r3.zzb     // Catch: java.lang.Throwable -> L1a
            r0.add(r4)     // Catch: java.lang.Throwable -> L1a
            r3.zzb()     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r3)
            return
        L1a:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    public final synchronized void zzg(boolean r1) {
            r0 = this;
            monitor-enter(r0)
            r0.zzf = r1     // Catch: java.lang.Throwable -> L8
            r0.zzb()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)
            return
        L8:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final synchronized void zzh(com.google.android.play.core.listener.StateUpdatedListener r4) {
            r3 = this;
            monitor-enter(r3)
            com.google.android.play.core.internal.zzag r0 = r3.zza     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = "unregisterListener"
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L1b
            r0.zzd(r1, r2)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = "Unregistered Play Core listener should not be null."
            com.google.android.play.core.internal.zzci.zza(r4, r0)     // Catch: java.lang.Throwable -> L1b
            java.util.HashSet r0 = r3.zzb     // Catch: java.lang.Throwable -> L1b
            r0.remove(r4)     // Catch: java.lang.Throwable -> L1b
            r3.zzb()     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r3)
            return
        L1b:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    public final synchronized void zzi(java.lang.Object r3) {
            r2 = this;
            monitor-enter(r2)
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Throwable -> L1e
            java.util.HashSet r1 = r2.zzb     // Catch: java.lang.Throwable -> L1e
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1e
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1e
        Lc:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L1e
            com.google.android.play.core.listener.StateUpdatedListener r1 = (com.google.android.play.core.listener.StateUpdatedListener) r1     // Catch: java.lang.Throwable -> L1e
            r1.onStateUpdate(r3)     // Catch: java.lang.Throwable -> L1e
            goto Lc
        L1c:
            monitor-exit(r2)
            return
        L1e:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    public final synchronized boolean zzj() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.play.core.listener.zzb r0 = r1.zze     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L8
            r0 = 1
        L6:
            monitor-exit(r1)
            return r0
        L8:
            r0 = 0
            goto L6
        La:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }
}
