package com.google.android.play.core.splitinstall;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzx extends com.google.android.play.core.listener.zzc {

    @androidx.annotation.Nullable
    private static com.google.android.play.core.splitinstall.zzx zzc;
    private final android.os.Handler zzd;
    private final com.google.android.play.core.splitinstall.zzg zze;
    private final java.util.Set zzf;

    @androidx.annotation.VisibleForTesting
    public zzx(android.content.Context r4, com.google.android.play.core.splitinstall.zzg r5) {
            r3 = this;
            com.google.android.play.core.internal.zzag r0 = new com.google.android.play.core.internal.zzag
            java.lang.String r1 = "SplitInstallListenerRegistry"
            r0.<init>(r1)
            android.content.IntentFilter r1 = new android.content.IntentFilter
            java.lang.String r2 = "com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"
            r1.<init>(r2)
            r3.<init>(r0, r1, r4)
            android.os.Handler r4 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r4.<init>(r0)
            r3.zzd = r4
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            r3.zzf = r4
            r3.zze = r5
            return
    }

    public static synchronized com.google.android.play.core.splitinstall.zzx zzc(android.content.Context r3) {
            java.lang.Class<com.google.android.play.core.splitinstall.zzx> r0 = com.google.android.play.core.splitinstall.zzx.class
            monitor-enter(r0)
            com.google.android.play.core.splitinstall.zzx r1 = com.google.android.play.core.splitinstall.zzx.zzc     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L10
            com.google.android.play.core.splitinstall.zzx r1 = new com.google.android.play.core.splitinstall.zzx     // Catch: java.lang.Throwable -> L14
            com.google.android.play.core.splitinstall.zzo r2 = com.google.android.play.core.splitinstall.zzo.zza     // Catch: java.lang.Throwable -> L14
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L14
            com.google.android.play.core.splitinstall.zzx.zzc = r1     // Catch: java.lang.Throwable -> L14
        L10:
            com.google.android.play.core.splitinstall.zzx r3 = com.google.android.play.core.splitinstall.zzx.zzc     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)
            return r3
        L14:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    public static /* bridge */ /* synthetic */ void zzd(com.google.android.play.core.splitinstall.zzx r2, com.google.android.play.core.splitinstall.SplitInstallSessionState r3, int r4, int r5) {
            android.os.Handler r0 = r2.zzd
            com.google.android.play.core.splitinstall.zzw r1 = new com.google.android.play.core.splitinstall.zzw
            r1.<init>(r2, r3, r4, r5)
            r0.post(r1)
            return
    }

    @Override // com.google.android.play.core.listener.zzc
    public final void zza(android.content.Context r5, android.content.Intent r6) {
            r4 = this;
            java.lang.String r0 = "session_state"
            android.os.Bundle r0 = r6.getBundleExtra(r0)
            if (r0 != 0) goto La
            return
        La:
            com.google.android.play.core.splitinstall.SplitInstallSessionState r0 = com.google.android.play.core.splitinstall.SplitInstallSessionState.zzd(r0)
            com.google.android.play.core.internal.zzag r1 = r4.zza
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            java.lang.String r3 = "ListenerRegistryBroadcastReceiver.onReceive: %s"
            r1.zza(r3, r2)
            com.google.android.play.core.splitinstall.zzg r1 = r4.zze
            com.google.android.play.core.splitinstall.zzh r1 = r1.zza()
            int r2 = r0.status()
            r3 = 3
            if (r2 != r3) goto L37
            if (r1 == 0) goto L37
            java.util.List r2 = r0.zzc()
            com.google.android.play.core.splitinstall.zzv r3 = new com.google.android.play.core.splitinstall.zzv
            r3.<init>(r4, r0, r6, r5)
            r1.zzd(r2, r3)
            return
        L37:
            r4.zzm(r0)
            return
    }

    public final synchronized void zzk(com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Set r0 = r1.zzf     // Catch: java.lang.Throwable -> L8
            r0.add(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final synchronized void zzl(com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Set r0 = r1.zzf     // Catch: java.lang.Throwable -> L8
            r0.remove(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final synchronized void zzm(com.google.android.play.core.splitinstall.SplitInstallSessionState r3) {
            r2 = this;
            monitor-enter(r2)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L21
            java.util.Set r1 = r2.zzf     // Catch: java.lang.Throwable -> L21
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L21
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L21
        Lc:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L21
            com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener r1 = (com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener) r1     // Catch: java.lang.Throwable -> L21
            r1.onStateUpdate(r3)     // Catch: java.lang.Throwable -> L21
            goto Lc
        L1c:
            super.zzi(r3)     // Catch: java.lang.Throwable -> L21
            monitor-exit(r2)
            return
        L21:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }
}
