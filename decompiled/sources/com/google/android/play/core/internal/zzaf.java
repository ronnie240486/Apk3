package com.google.android.play.core.internal;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaf {

    @androidx.annotation.GuardedBy("this")
    public final java.util.HashSet zza;

    public zzaf() {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.zza = r0
            return
    }

    public final synchronized void zza(com.google.android.play.core.listener.StateUpdatedListener r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.HashSet r0 = r1.zza     // Catch: java.lang.Throwable -> L8
            r0.add(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final synchronized void zzb(com.google.android.play.core.listener.StateUpdatedListener r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.HashSet r0 = r1.zza     // Catch: java.lang.Throwable -> L8
            r0.remove(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final synchronized void zzc(java.lang.Object r3) {
            r2 = this;
            monitor-enter(r2)
            java.util.HashSet r0 = r2.zza     // Catch: java.lang.Throwable -> L19
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L19
        L7:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L17
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L19
            com.google.android.play.core.listener.StateUpdatedListener r1 = (com.google.android.play.core.listener.StateUpdatedListener) r1     // Catch: java.lang.Throwable -> L19
            r1.onStateUpdate(r3)     // Catch: java.lang.Throwable -> L19
            goto L7
        L17:
            monitor-exit(r2)
            return
        L19:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }
}
