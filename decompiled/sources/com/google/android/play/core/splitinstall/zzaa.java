package com.google.android.play.core.splitinstall;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaa implements com.google.android.play.core.splitinstall.SplitInstallManager {
    private final com.google.android.play.core.splitinstall.zzbc zza;
    private final com.google.android.play.core.splitinstall.zzx zzb;
    private final com.google.android.play.core.splitinstall.zzs zzc;
    private final com.google.android.play.core.splitinstall.zzbe zzd;
    private final android.os.Handler zze;

    public zzaa(com.google.android.play.core.splitinstall.zzbc r3, com.google.android.play.core.splitinstall.zzx r4, com.google.android.play.core.splitinstall.zzs r5, com.google.android.play.core.splitinstall.zzbe r6) {
            r2 = this;
            r2.<init>()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.zze = r0
            r2.zza = r3
            r2.zzb = r4
            r2.zzc = r5
            r2.zzd = r6
            return
    }

    public static /* bridge */ /* synthetic */ com.google.android.play.core.splitinstall.zzx zzc(com.google.android.play.core.splitinstall.zzaa r0) {
            com.google.android.play.core.splitinstall.zzx r0 = r0.zzb
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.List zzd(java.util.List r0) {
            java.util.List r0 = zze(r0)
            return r0
    }

    private static java.util.List zze(java.util.List r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r2.size()
            r0.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
        Ld:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r2.next()
            java.util.Locale r1 = (java.util.Locale) r1
            java.lang.String r1 = r1.toLanguageTag()
            r0.add(r1)
            goto Ld
        L21:
            return r0
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final com.google.android.play.core.tasks.Task<java.lang.Void> cancelInstall(int r2) {
            r1 = this;
            com.google.android.play.core.splitinstall.zzbc r0 = r1.zza
            com.google.android.play.core.tasks.Task r2 = r0.zzc(r2)
            return r2
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final com.google.android.play.core.tasks.Task<java.lang.Void> deferredInstall(java.util.List<java.lang.String> r2) {
            r1 = this;
            com.google.android.play.core.splitinstall.zzbc r0 = r1.zza
            com.google.android.play.core.tasks.Task r2 = r0.zzd(r2)
            return r2
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final com.google.android.play.core.tasks.Task<java.lang.Void> deferredLanguageInstall(java.util.List<java.util.Locale> r2) {
            r1 = this;
            com.google.android.play.core.splitinstall.zzbc r0 = r1.zza
            java.util.List r2 = zze(r2)
            com.google.android.play.core.tasks.Task r2 = r0.zze(r2)
            return r2
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final com.google.android.play.core.tasks.Task<java.lang.Void> deferredLanguageUninstall(java.util.List<java.util.Locale> r2) {
            r1 = this;
            com.google.android.play.core.splitinstall.zzbc r0 = r1.zza
            java.util.List r2 = zze(r2)
            com.google.android.play.core.tasks.Task r2 = r0.zzf(r2)
            return r2
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final com.google.android.play.core.tasks.Task<java.lang.Void> deferredUninstall(java.util.List<java.lang.String> r2) {
            r1 = this;
            com.google.android.play.core.splitinstall.zzbe r0 = r1.zzd
            r0.zzc(r2)
            com.google.android.play.core.splitinstall.zzbc r0 = r1.zza
            com.google.android.play.core.tasks.Task r2 = r0.zzg(r2)
            return r2
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final java.util.Set<java.lang.String> getInstalledLanguages() {
            r1 = this;
            com.google.android.play.core.splitinstall.zzs r0 = r1.zzc
            java.util.Set r0 = r0.zzd()
            if (r0 != 0) goto Lc
            java.util.Set r0 = java.util.Collections.emptySet()
        Lc:
            return r0
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final java.util.Set<java.lang.String> getInstalledModules() {
            r1 = this;
            com.google.android.play.core.splitinstall.zzs r0 = r1.zzc
            java.util.Set r0 = r0.zzc()
            return r0
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final com.google.android.play.core.tasks.Task<com.google.android.play.core.splitinstall.SplitInstallSessionState> getSessionState(int r2) {
            r1 = this;
            com.google.android.play.core.splitinstall.zzbc r0 = r1.zza
            com.google.android.play.core.tasks.Task r2 = r0.zzh(r2)
            return r2
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final com.google.android.play.core.tasks.Task<java.util.List<com.google.android.play.core.splitinstall.SplitInstallSessionState>> getSessionStates() {
            r1 = this;
            com.google.android.play.core.splitinstall.zzbc r0 = r1.zza
            com.google.android.play.core.tasks.Task r0 = r0.zzi()
            return r0
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final synchronized void registerListener(com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener r2) {
            r1 = this;
            monitor-enter(r1)
            com.google.android.play.core.splitinstall.zzx r0 = r1.zzb     // Catch: java.lang.Throwable -> L8
            r0.zzf(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final boolean startConfirmationDialogForResult(com.google.android.play.core.splitinstall.SplitInstallSessionState r2, android.app.Activity r3, int r4) throws android.content.IntentSender.SendIntentException {
            r1 = this;
            com.google.android.play.core.splitinstall.zzz r0 = new com.google.android.play.core.splitinstall.zzz
            r0.<init>(r3)
            boolean r2 = r1.startConfirmationDialogForResult(r2, r0, r4)
            return r2
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final boolean startConfirmationDialogForResult(com.google.android.play.core.splitinstall.SplitInstallSessionState r9, com.google.android.play.core.common.IntentSenderForResultStarter r10, int r11) throws android.content.IntentSender.SendIntentException {
            r8 = this;
            int r0 = r9.status()
            r1 = 8
            if (r0 != r1) goto L23
            android.app.PendingIntent r0 = r9.resolutionIntent()
            if (r0 != 0) goto Lf
            goto L23
        Lf:
            android.app.PendingIntent r9 = r9.resolutionIntent()
            android.content.IntentSender r1 = r9.getIntentSender()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = r10
            r2 = r11
            r0.startIntentSenderForResult(r1, r2, r3, r4, r5, r6, r7)
            r9 = 1
            return r9
        L23:
            r9 = 0
            return r9
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final com.google.android.play.core.tasks.Task<java.lang.Integer> startInstall(com.google.android.play.core.splitinstall.SplitInstallRequest r5) {
            r4 = this;
            java.util.List r0 = r5.getLanguages()
            boolean r0 = r0.isEmpty()
            java.util.List r0 = r5.getLanguages()
            com.google.android.play.core.splitinstall.zzs r1 = r4.zzc
            java.util.Set r1 = r1.zzd()
            if (r1 != 0) goto L15
            goto L38
        L15:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L1e:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L32
            java.lang.Object r3 = r0.next()
            java.util.Locale r3 = (java.util.Locale) r3
            java.lang.String r3 = r3.getLanguage()
            r2.add(r3)
            goto L1e
        L32:
            boolean r0 = r1.containsAll(r2)
            if (r0 == 0) goto L6d
        L38:
            java.util.List r0 = r5.getModuleNames()
            com.google.android.play.core.splitinstall.zzs r1 = r4.zzc
            java.util.Set r1 = r1.zzc()
            boolean r0 = r1.containsAll(r0)
            if (r0 == 0) goto L6d
            java.util.List r0 = r5.getModuleNames()
            com.google.android.play.core.splitinstall.zzbe r1 = r4.zzd
            java.util.Set r1 = r1.zza()
            boolean r0 = java.util.Collections.disjoint(r0, r1)
            if (r0 != 0) goto L59
            goto L6d
        L59:
            android.os.Handler r0 = r4.zze
            com.google.android.play.core.splitinstall.zzy r1 = new com.google.android.play.core.splitinstall.zzy
            r1.<init>(r4, r5)
            r0.post(r1)
            r5 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            com.google.android.play.core.tasks.Task r5 = com.google.android.play.core.tasks.Tasks.zzb(r5)
            return r5
        L6d:
            com.google.android.play.core.splitinstall.zzbe r0 = r4.zzd
            java.util.List r1 = r5.getModuleNames()
            r0.zzd(r1)
            com.google.android.play.core.splitinstall.zzbc r0 = r4.zza
            java.util.List r1 = r5.getModuleNames()
            java.util.List r5 = r5.getLanguages()
            java.util.List r5 = zze(r5)
            com.google.android.play.core.tasks.Task r5 = r0.zzj(r1, r5)
            return r5
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final synchronized void unregisterListener(com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener r2) {
            r1 = this;
            monitor-enter(r1)
            com.google.android.play.core.splitinstall.zzx r0 = r1.zzb     // Catch: java.lang.Throwable -> L8
            r0.zzh(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final synchronized void zza(com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener r2) {
            r1 = this;
            monitor-enter(r1)
            com.google.android.play.core.splitinstall.zzx r0 = r1.zzb     // Catch: java.lang.Throwable -> L8
            r0.zzk(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final synchronized void zzb(com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener r2) {
            r1 = this;
            monitor-enter(r1)
            com.google.android.play.core.splitinstall.zzx r0 = r1.zzb     // Catch: java.lang.Throwable -> L8
            r0.zzl(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }
}
