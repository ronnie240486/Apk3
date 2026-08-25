package com.google.android.play.core.splitinstall.testing;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public class FakeSplitInstallManager implements com.google.android.play.core.splitinstall.SplitInstallManager {
    public static final /* synthetic */ int zza = 0;
    private static final long zzb = 0;
    private final android.os.Handler zzc;
    private final android.content.Context zzd;
    private final com.google.android.play.core.splitinstall.zzs zze;
    private final com.google.android.play.core.internal.zzco zzf;
    private final com.google.android.play.core.internal.zzcf zzg;
    private final com.google.android.play.core.internal.zzaf zzh;
    private final com.google.android.play.core.internal.zzaf zzi;
    private final java.util.concurrent.Executor zzj;
    private final com.google.android.play.core.splitinstall.zzg zzk;
    private final java.io.File zzl;
    private final java.util.concurrent.atomic.AtomicReference zzm;
    private final java.util.Set zzn;
    private final java.util.Set zzo;
    private final java.util.concurrent.atomic.AtomicBoolean zzp;
    private final com.google.android.play.core.splitinstall.testing.zzd zzq;

    static {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r1 = 1
            long r0 = r0.toMillis(r1)
            com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager.zzb = r0
            return
    }

    @java.lang.Deprecated
    public FakeSplitInstallManager(android.content.Context r3, java.io.File r4) {
            r2 = this;
            com.google.android.play.core.splitinstall.zzs r0 = new com.google.android.play.core.splitinstall.zzs
            java.lang.String r1 = r3.getPackageName()
            r0.<init>(r3, r1)
            com.google.android.play.core.splitinstall.testing.zzj r1 = com.google.android.play.core.splitinstall.testing.zzj.zza
            r2.<init>(r3, r4, r0, r1)
            return
    }

    public FakeSplitInstallManager(android.content.Context r6, @androidx.annotation.Nullable java.io.File r7, com.google.android.play.core.splitinstall.zzs r8, com.google.android.play.core.internal.zzco r9) {
            r5 = this;
            java.util.concurrent.Executor r0 = com.google.android.play.core.splitcompat.zzd.zza()
            com.google.android.play.core.internal.zzcf r1 = new com.google.android.play.core.internal.zzcf
            r1.<init>(r6)
            com.google.android.play.core.splitinstall.testing.zzd r2 = com.google.android.play.core.splitinstall.testing.zzd.zza
            r5.<init>()
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            r3.<init>(r4)
            r5.zzc = r3
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference
            r3.<init>()
            r5.zzm = r3
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.Set r3 = java.util.Collections.synchronizedSet(r3)
            r5.zzn = r3
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.Set r3 = java.util.Collections.synchronizedSet(r3)
            r5.zzo = r3
            java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean
            r4 = 0
            r3.<init>(r4)
            r5.zzp = r3
            r5.zzd = r6
            r5.zzl = r7
            r5.zze = r8
            r5.zzf = r9
            r5.zzj = r0
            r5.zzg = r1
            r5.zzq = r2
            com.google.android.play.core.internal.zzaf r6 = new com.google.android.play.core.internal.zzaf
            r6.<init>()
            r5.zzi = r6
            com.google.android.play.core.internal.zzaf r6 = new com.google.android.play.core.internal.zzaf
            r6.<init>()
            r5.zzh = r6
            com.google.android.play.core.splitinstall.zzo r6 = com.google.android.play.core.splitinstall.zzo.zza
            r5.zzk = r6
            return
    }

    public static /* bridge */ /* synthetic */ void zzd(com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager r7, java.util.List r8, java.util.List r9, java.util.List r10, long r11) {
            r6 = 1
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.zzp(r1, r2, r3, r4, r6)
            return
    }

    public static /* bridge */ /* synthetic */ void zze(com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager r0, java.util.List r1, java.util.List r2, long r3) {
            r0.zzr(r1, r2, r3)
            return
    }

    public static /* synthetic */ boolean zzj(com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager r8, int r9) {
            r1 = 6
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = r8
            r2 = r9
            boolean r8 = r0.zzs(r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    private final com.google.android.play.core.splitinstall.zzk zzk() {
            r2 = this;
            com.google.android.play.core.splitinstall.zzs r0 = r2.zze
            com.google.android.play.core.splitinstall.zzk r0 = r0.zza()
            if (r0 == 0) goto L9
            return r0
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Language information could not be found. Make sure you are using the target application context, not the tests context, and the app is built as a bundle."
            r0.<init>(r1)
            throw r0
    }

    @androidx.annotation.Nullable
    private final com.google.android.play.core.splitinstall.SplitInstallSessionState zzl() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r1.zzm
            java.lang.Object r0 = r0.get()
            com.google.android.play.core.splitinstall.SplitInstallSessionState r0 = (com.google.android.play.core.splitinstall.SplitInstallSessionState) r0
            return r0
    }

    @androidx.annotation.Nullable
    private final synchronized com.google.android.play.core.splitinstall.SplitInstallSessionState zzm(com.google.android.play.core.splitinstall.testing.zzp r3) {
            r2 = this;
            monitor-enter(r2)
            com.google.android.play.core.splitinstall.SplitInstallSessionState r0 = r2.zzl()     // Catch: java.lang.Throwable -> L16
            com.google.android.play.core.splitinstall.SplitInstallSessionState r3 = r3.zza(r0)     // Catch: java.lang.Throwable -> L16
            java.util.concurrent.atomic.AtomicReference r1 = r2.zzm     // Catch: java.lang.Throwable -> L16
            boolean r0 = r1.compareAndSet(r0, r3)     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L13
            monitor-exit(r2)
            return r3
        L13:
            r3 = 0
            monitor-exit(r2)
            return r3
        L16:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    private final com.google.android.play.core.tasks.Task zzn(@com.google.android.play.core.splitinstall.model.SplitInstallErrorCode int r2) {
            r1 = this;
            com.google.android.play.core.splitinstall.testing.zzg r0 = new com.google.android.play.core.splitinstall.testing.zzg
            r0.<init>(r2)
            r1.zzm(r0)
            com.google.android.play.core.splitinstall.SplitInstallException r0 = new com.google.android.play.core.splitinstall.SplitInstallException
            r0.<init>(r2)
            com.google.android.play.core.tasks.Task r2 = com.google.android.play.core.tasks.Tasks.zza(r0)
            return r2
    }

    private static java.lang.String zzo(java.lang.String r2) {
            java.lang.String r0 = "\\.config\\."
            r1 = 2
            java.lang.String[] r2 = r2.split(r0, r1)
            r0 = 0
            r2 = r2[r0]
            return r2
    }

    private final void zzp(java.util.List r12, java.util.List r13, java.util.List r14, long r15, boolean r17) {
            r11 = this;
            r8 = r11
            com.google.android.play.core.splitinstall.zzg r0 = r8.zzk
            com.google.android.play.core.splitinstall.zzh r9 = r0.zza()
            com.google.android.play.core.splitinstall.testing.zzo r10 = new com.google.android.play.core.splitinstall.testing.zzo
            r0 = r10
            r1 = r11
            r2 = r13
            r3 = r14
            r4 = r15
            r6 = r17
            r7 = r12
            r0.<init>(r1, r2, r3, r4, r6, r7)
            r0 = r12
            r9.zzd(r12, r10)
            return
    }

    private final void zzq(com.google.android.play.core.splitinstall.SplitInstallSessionState r3) {
            r2 = this;
            android.os.Handler r0 = r2.zzc
            com.google.android.play.core.splitinstall.testing.zzm r1 = new com.google.android.play.core.splitinstall.testing.zzm
            r1.<init>(r2, r3)
            r0.post(r1)
            return
    }

    private final void zzr(java.util.List r9, java.util.List r10, long r11) {
            r8 = this;
            java.util.Set r0 = r8.zzn
            r0.addAll(r9)
            java.util.Set r9 = r8.zzo
            r9.addAll(r10)
            java.lang.Long r4 = java.lang.Long.valueOf(r11)
            r1 = 5
            r2 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = r8
            r3 = r4
            r0.zzs(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    private final boolean zzs(int r11, int r12, @androidx.annotation.Nullable java.lang.Long r13, @androidx.annotation.Nullable java.lang.Long r14, @androidx.annotation.Nullable java.util.List r15, @androidx.annotation.Nullable java.lang.Integer r16, @androidx.annotation.Nullable java.util.List r17) {
            r10 = this;
            r0 = r10
            com.google.android.play.core.splitinstall.testing.zzi r9 = new com.google.android.play.core.splitinstall.testing.zzi
            r1 = r9
            r2 = r16
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            com.google.android.play.core.splitinstall.SplitInstallSessionState r1 = r10.zzm(r9)
            if (r1 == 0) goto L1b
            r10.zzq(r1)
            r1 = 1
            return r1
        L1b:
            r1 = 0
            return r1
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final com.google.android.play.core.tasks.Task<java.lang.Void> cancelInstall(int r2) {
            r1 = this;
            com.google.android.play.core.splitinstall.testing.zzf r0 = new com.google.android.play.core.splitinstall.testing.zzf     // Catch: com.google.android.play.core.splitinstall.SplitInstallException -> L14
            r0.<init>(r2)     // Catch: com.google.android.play.core.splitinstall.SplitInstallException -> L14
            com.google.android.play.core.splitinstall.SplitInstallSessionState r2 = r1.zzm(r0)     // Catch: com.google.android.play.core.splitinstall.SplitInstallException -> L14
            if (r2 == 0) goto Le
            r1.zzq(r2)     // Catch: com.google.android.play.core.splitinstall.SplitInstallException -> L14
        Le:
            r2 = 0
            com.google.android.play.core.tasks.Task r2 = com.google.android.play.core.tasks.Tasks.zzb(r2)     // Catch: com.google.android.play.core.splitinstall.SplitInstallException -> L14
            return r2
        L14:
            r2 = move-exception
            com.google.android.play.core.tasks.Task r2 = com.google.android.play.core.tasks.Tasks.zza(r2)
            return r2
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final com.google.android.play.core.tasks.Task<java.lang.Void> deferredInstall(java.util.List<java.lang.String> r2) {
            r1 = this;
            com.google.android.play.core.splitinstall.SplitInstallException r2 = new com.google.android.play.core.splitinstall.SplitInstallException
            r0 = -5
            r2.<init>(r0)
            com.google.android.play.core.tasks.Task r2 = com.google.android.play.core.tasks.Tasks.zza(r2)
            return r2
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final com.google.android.play.core.tasks.Task<java.lang.Void> deferredLanguageInstall(java.util.List<java.util.Locale> r2) {
            r1 = this;
            com.google.android.play.core.splitinstall.SplitInstallException r2 = new com.google.android.play.core.splitinstall.SplitInstallException
            r0 = -5
            r2.<init>(r0)
            com.google.android.play.core.tasks.Task r2 = com.google.android.play.core.tasks.Tasks.zza(r2)
            return r2
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final com.google.android.play.core.tasks.Task<java.lang.Void> deferredLanguageUninstall(java.util.List<java.util.Locale> r2) {
            r1 = this;
            com.google.android.play.core.splitinstall.SplitInstallException r2 = new com.google.android.play.core.splitinstall.SplitInstallException
            r0 = -5
            r2.<init>(r0)
            com.google.android.play.core.tasks.Task r2 = com.google.android.play.core.tasks.Tasks.zza(r2)
            return r2
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final com.google.android.play.core.tasks.Task<java.lang.Void> deferredUninstall(java.util.List<java.lang.String> r2) {
            r1 = this;
            com.google.android.play.core.splitinstall.SplitInstallException r2 = new com.google.android.play.core.splitinstall.SplitInstallException
            r0 = -5
            r2.<init>(r0)
            com.google.android.play.core.tasks.Task r2 = com.google.android.play.core.tasks.Tasks.zza(r2)
            return r2
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final java.util.Set<java.lang.String> getInstalledLanguages() {
            r2 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            com.google.android.play.core.splitinstall.zzs r1 = r2.zze
            java.util.Set r1 = r1.zzd()
            if (r1 == 0) goto L16
            com.google.android.play.core.splitinstall.zzs r1 = r2.zze
            java.util.Set r1 = r1.zzd()
            r0.addAll(r1)
        L16:
            java.util.Set r1 = r2.zzo
            r0.addAll(r1)
            return r0
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final java.util.Set<java.lang.String> getInstalledModules() {
            r2 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            com.google.android.play.core.splitinstall.zzs r1 = r2.zze
            java.util.Set r1 = r1.zzc()
            r0.addAll(r1)
            java.util.Set r1 = r2.zzn
            r0.addAll(r1)
            return r0
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final com.google.android.play.core.tasks.Task<com.google.android.play.core.splitinstall.SplitInstallSessionState> getSessionState(int r3) {
            r2 = this;
            com.google.android.play.core.splitinstall.SplitInstallSessionState r0 = r2.zzl()
            if (r0 == 0) goto L12
            int r1 = r0.sessionId()
            if (r1 == r3) goto Ld
            goto L12
        Ld:
            com.google.android.play.core.tasks.Task r3 = com.google.android.play.core.tasks.Tasks.zzb(r0)
            return r3
        L12:
            com.google.android.play.core.splitinstall.SplitInstallException r3 = new com.google.android.play.core.splitinstall.SplitInstallException
            r0 = -4
            r3.<init>(r0)
            com.google.android.play.core.tasks.Task r3 = com.google.android.play.core.tasks.Tasks.zza(r3)
            return r3
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final com.google.android.play.core.tasks.Task<java.util.List<com.google.android.play.core.splitinstall.SplitInstallSessionState>> getSessionStates() {
            r1 = this;
            com.google.android.play.core.splitinstall.SplitInstallSessionState r0 = r1.zzl()
            if (r0 == 0) goto Lb
            java.util.List r0 = java.util.Collections.singletonList(r0)
            goto Lf
        Lb:
            java.util.List r0 = java.util.Collections.emptyList()
        Lf:
            com.google.android.play.core.tasks.Task r0 = com.google.android.play.core.tasks.Tasks.zzb(r0)
            return r0
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void registerListener(com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener r2) {
            r1 = this;
            com.google.android.play.core.internal.zzaf r0 = r1.zzi
            r0.zza(r2)
            return
    }

    public void setShouldNetworkError(boolean r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.zzp
            r0.set(r2)
            return
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final boolean startConfirmationDialogForResult(com.google.android.play.core.splitinstall.SplitInstallSessionState r1, android.app.Activity r2, int r3) throws android.content.IntentSender.SendIntentException {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final boolean startConfirmationDialogForResult(com.google.android.play.core.splitinstall.SplitInstallSessionState r1, com.google.android.play.core.common.IntentSenderForResultStarter r2, int r3) throws android.content.IntentSender.SendIntentException {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final com.google.android.play.core.tasks.Task<java.lang.Integer> startInstall(com.google.android.play.core.splitinstall.SplitInstallRequest r21) {
            r20 = this;
            r9 = r20
            com.google.android.play.core.splitinstall.testing.zzh r0 = new com.google.android.play.core.splitinstall.testing.zzh     // Catch: com.google.android.play.core.splitinstall.SplitInstallException -> L248
            r1 = r21
            r0.<init>(r1)     // Catch: com.google.android.play.core.splitinstall.SplitInstallException -> L248
            com.google.android.play.core.splitinstall.SplitInstallSessionState r0 = r9.zzm(r0)     // Catch: com.google.android.play.core.splitinstall.SplitInstallException -> L248
            if (r0 == 0) goto L241
            int r0 = r0.sessionId()     // Catch: com.google.android.play.core.splitinstall.SplitInstallException -> L248
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.List r2 = r21.getLanguages()
            java.util.Iterator r2 = r2.iterator()
        L20:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L34
            java.lang.Object r3 = r2.next()
            java.util.Locale r3 = (java.util.Locale) r3
            java.lang.String r3 = r3.getLanguage()
            r10.add(r3)
            goto L20
        L34:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.io.File r3 = r9.zzl
            com.google.android.play.core.splitinstall.testing.zzk r4 = com.google.android.play.core.splitinstall.testing.zzk.zza
            java.io.File[] r3 = r3.listFiles(r4)
            java.lang.String r4 = "FakeSplitInstallManager"
            if (r3 != 0) goto L55
            java.lang.String r0 = "Specified splits directory does not exist."
            android.util.Log.w(r4, r0)
            r0 = -5
            com.google.android.play.core.tasks.Task r0 = r9.zzn(r0)
            return r0
        L55:
            int r5 = r3.length
            r6 = 0
            r7 = 0
        L59:
            if (r6 >= r5) goto L19a
            r12 = r3[r6]
            java.lang.String r13 = com.google.android.play.core.internal.zzcj.zza(r12)
            java.lang.String r14 = zzo(r13)
            r2.add(r13)
            java.util.List r15 = r21.getModuleNames()
            boolean r14 = r15.contains(r14)
            if (r14 == 0) goto L133
            java.lang.String r14 = zzo(r13)
            java.util.HashSet r15 = new java.util.HashSet
            com.google.android.play.core.internal.zzcf r1 = r9.zzg
            java.util.List r1 = r1.zza()
            r15.<init>(r1)
            com.google.android.play.core.splitinstall.zzk r1 = r20.zzk()
            r16 = r3
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r17 = 0
            r3[r17] = r14
            java.util.List r3 = java.util.Arrays.asList(r3)
            java.util.Map r1 = r1.zza(r3)
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.Collection r14 = r1.values()
            java.util.Iterator r14 = r14.iterator()
        La3:
            boolean r17 = r14.hasNext()
            if (r17 == 0) goto Lb9
            java.lang.Object r17 = r14.next()
            r18 = r5
            r5 = r17
            java.util.Set r5 = (java.util.Set) r5
            r3.addAll(r5)
            r5 = r18
            goto La3
        Lb9:
            r18 = r5
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.Iterator r14 = r15.iterator()
        Lc4:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto Lef
            java.lang.Object r15 = r14.next()
            java.lang.String r15 = (java.lang.String) r15
            r17 = r14
            java.lang.String r14 = "_"
            boolean r19 = r15.contains(r14)
            if (r19 == 0) goto Le5
            r19 = r0
            r0 = -1
            java.lang.String[] r0 = r15.split(r14, r0)
            r14 = 0
            r15 = r0[r14]
            goto Le7
        Le5:
            r19 = r0
        Le7:
            r5.add(r15)
            r14 = r17
            r0 = r19
            goto Lc4
        Lef:
            r19 = r0
            java.util.Set r0 = r9.zzo
            r5.addAll(r0)
            r5.addAll(r10)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L106:
            boolean r14 = r1.hasNext()
            if (r14 == 0) goto L126
            java.lang.Object r14 = r1.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            java.lang.Object r15 = r14.getKey()
            boolean r15 = r5.contains(r15)
            if (r15 == 0) goto L106
            java.lang.Object r14 = r14.getValue()
            java.util.Collection r14 = (java.util.Collection) r14
            r0.addAll(r14)
            goto L106
        L126:
            boolean r1 = r3.contains(r13)
            if (r1 == 0) goto L185
            boolean r0 = r0.contains(r13)
            if (r0 == 0) goto L139
            goto L185
        L133:
            r19 = r0
            r16 = r3
            r18 = r5
        L139:
            java.util.List r0 = r21.getLanguages()
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Set r3 = r9.zzn
            r1.<init>(r3)
            java.lang.String r3 = ""
            java.lang.String r5 = "base"
            java.lang.String[] r3 = new java.lang.String[]{r3, r5}
            java.util.List r3 = java.util.Arrays.asList(r3)
            r1.addAll(r3)
            com.google.android.play.core.splitinstall.zzk r3 = r20.zzk()
            java.util.Map r1 = r3.zza(r1)
            java.util.Iterator r0 = r0.iterator()
        L15f:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L18e
            java.lang.Object r3 = r0.next()
            java.util.Locale r3 = (java.util.Locale) r3
            java.lang.String r5 = r3.getLanguage()
            boolean r5 = r1.containsKey(r5)
            if (r5 == 0) goto L15f
            java.lang.String r3 = r3.getLanguage()
            java.lang.Object r3 = r1.get(r3)
            java.util.Set r3 = (java.util.Set) r3
            boolean r3 = r3.contains(r13)
            if (r3 == 0) goto L15f
        L185:
            long r0 = r12.length()
            long r0 = r0 + r7
            r11.add(r12)
            r7 = r0
        L18e:
            int r6 = r6 + 1
            r1 = r21
            r3 = r16
            r5 = r18
            r0 = r19
            goto L59
        L19a:
            r19 = r0
            java.lang.String r0 = r2.toString()
            java.util.List r1 = r21.getModuleNames()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r3 = r1.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r6 = r0.length()
            int r6 = r6 + 22
            int r6 = r6 + r3
            r5.<init>(r6)
            java.lang.String r3 = "availableSplits "
            java.lang.String r6 = " want "
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5, r3, r0, r6, r1)
            android.util.Log.i(r4, r0)
            java.util.List r0 = r21.getModuleNames()
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L1eb
            com.google.android.play.core.internal.zzco r0 = r9.zzf
            java.lang.Object r0 = r0.zza()
            com.google.android.play.core.splitinstall.testing.zzt r0 = (com.google.android.play.core.splitinstall.testing.zzt) r0
            java.util.Map r0 = r0.zzb()
            java.util.List r1 = r21.getModuleNames()
            r3 = 0
            java.lang.Object r1 = r1.get(r3)
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L1f7
        L1eb:
            com.google.android.play.core.internal.zzco r0 = r9.zzf
            java.lang.Object r0 = r0.zza()
            com.google.android.play.core.splitinstall.testing.zzt r0 = (com.google.android.play.core.splitinstall.testing.zzt) r0
            java.lang.Integer r0 = r0.zza()
        L1f7:
            if (r0 == 0) goto L202
            int r0 = r0.intValue()
            com.google.android.play.core.tasks.Task r0 = r9.zzn(r0)
            return r0
        L202:
            java.util.HashSet r0 = new java.util.HashSet
            java.util.List r1 = r21.getModuleNames()
            r0.<init>(r1)
            boolean r0 = r2.containsAll(r0)
            if (r0 != 0) goto L217
            r0 = -2
            com.google.android.play.core.tasks.Task r0 = r9.zzn(r0)
            return r0
        L217:
            r0 = 0
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            java.lang.Long r5 = java.lang.Long.valueOf(r7)
            java.util.List r6 = r21.getModuleNames()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r19)
            r2 = 1
            r3 = 0
            r1 = r20
            r7 = r0
            r8 = r10
            r1.zzs(r2, r3, r4, r5, r6, r7, r8)
            java.util.concurrent.Executor r1 = r9.zzj
            com.google.android.play.core.splitinstall.testing.zzn r2 = new com.google.android.play.core.splitinstall.testing.zzn
            r2.<init>(r9, r11, r10)
            r1.execute(r2)
            com.google.android.play.core.tasks.Task r0 = com.google.android.play.core.tasks.Tasks.zzb(r0)
            return r0
        L241:
            r0 = -100
            com.google.android.play.core.tasks.Task r0 = r9.zzn(r0)     // Catch: com.google.android.play.core.splitinstall.SplitInstallException -> L248
            return r0
        L248:
            r0 = move-exception
            int r0 = r0.getErrorCode()
            com.google.android.play.core.tasks.Task r0 = r9.zzn(r0)
            return r0
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void unregisterListener(com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener r2) {
            r1 = this;
            com.google.android.play.core.internal.zzaf r0 = r1.zzi
            r0.zzb(r2)
            return
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void zza(com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener r2) {
            r1 = this;
            com.google.android.play.core.internal.zzaf r0 = r1.zzh
            r0.zza(r2)
            return
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void zzb(com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener r2) {
            r1 = this;
            com.google.android.play.core.internal.zzaf r0 = r1.zzh
            r0.zzb(r2)
            return
    }

    public final java.io.File zzc() {
            r1 = this;
            java.io.File r0 = r1.zzl
            return r0
    }

    public final /* synthetic */ void zzf(long r16, java.util.List r18, java.util.List r19, java.util.List r20) {
            r15 = this;
            r5 = r16
            r0 = 3
            long r0 = r5 / r0
            r2 = 0
            r4 = 0
        L9:
            r7 = 3
            if (r4 >= r7) goto L46
            long r2 = r2 + r0
            long r2 = java.lang.Math.min(r5, r2)
            r8 = 2
            r9 = 0
            java.lang.Long r10 = java.lang.Long.valueOf(r2)
            java.lang.Long r11 = java.lang.Long.valueOf(r16)
            r12 = 0
            r13 = 0
            r14 = 0
            r7 = r15
            r7.zzs(r8, r9, r10, r11, r12, r13, r14)
            long r7 = com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager.zzb
            android.os.SystemClock.sleep(r7)
            com.google.android.play.core.splitinstall.SplitInstallSessionState r7 = r15.zzl()
            int r8 = r7.status()
            r9 = 9
            if (r8 == r9) goto L45
            int r8 = r7.status()
            r9 = 7
            if (r8 == r9) goto L45
            int r7 = r7.status()
            r8 = 6
            if (r7 != r8) goto L42
            goto L45
        L42:
            int r4 = r4 + 1
            goto L9
        L45:
            return
        L46:
            r7 = r15
            java.util.concurrent.Executor r8 = r7.zzj
            com.google.android.play.core.splitinstall.testing.zze r9 = new com.google.android.play.core.splitinstall.testing.zze
            r0 = r9
            r1 = r15
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            r8.execute(r9)
            return
    }

    public final /* synthetic */ void zzg(com.google.android.play.core.splitinstall.SplitInstallSessionState r2) {
            r1 = this;
            com.google.android.play.core.internal.zzaf r0 = r1.zzh
            r0.zzc(r2)
            com.google.android.play.core.internal.zzaf r0 = r1.zzi
            r0.zzc(r2)
            return
    }

    public final /* synthetic */ void zzh(java.util.List r10, java.util.List r11, java.util.List r12, long r13) {
            r9 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.zzp
            boolean r0 = r0.get()
            if (r0 == 0) goto L14
            r2 = 6
            r3 = -6
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r1 = r9
            r1.zzs(r2, r3, r4, r5, r6, r7, r8)
            return
        L14:
            com.google.android.play.core.splitinstall.zzg r0 = r9.zzk
            com.google.android.play.core.splitinstall.zzh r0 = r0.zza()
            if (r0 == 0) goto L26
            r7 = 0
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r1.zzp(r2, r3, r4, r5, r7)
            return
        L26:
            r9.zzr(r11, r12, r13)
            return
    }

    public final /* synthetic */ void zzi(java.util.List r9, java.util.List r10) {
            r8 = this;
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r9 = r9.iterator()
        Le:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L58
            java.lang.Object r0 = r9.next()
            java.io.File r0 = (java.io.File) r0
            java.lang.String r1 = com.google.android.play.core.internal.zzcj.zza(r0)
            android.net.Uri r2 = android.net.Uri.fromFile(r0)
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r6 = "android.intent.action.VIEW"
            r3.<init>(r6)
            android.content.Context r6 = r8.zzd
            android.content.ContentResolver r6 = r6.getContentResolver()
            java.lang.String r6 = r6.getType(r2)
            r3.setDataAndType(r2, r6)
            r2 = 1
            r3.addFlags(r2)
            java.lang.String r2 = zzo(r1)
            java.lang.String r6 = "module_name"
            r3.putExtra(r6, r2)
            java.lang.String r2 = "split_id"
            r3.putExtra(r2, r1)
            r4.add(r3)
            java.lang.String r0 = com.google.android.play.core.internal.zzcj.zza(r0)
            java.lang.String r0 = zzo(r0)
            r5.add(r0)
            goto Le
        L58:
            com.google.android.play.core.splitinstall.SplitInstallSessionState r9 = r8.zzl()
            if (r9 != 0) goto L5f
            return
        L5f:
            long r2 = r9.totalBytesToDownload()
            java.util.concurrent.Executor r9 = r8.zzj
            com.google.android.play.core.splitinstall.testing.zzl r7 = new com.google.android.play.core.splitinstall.testing.zzl
            r0 = r7
            r1 = r8
            r6 = r10
            r0.<init>(r1, r2, r4, r5, r6)
            r9.execute(r7)
            return
    }
}
