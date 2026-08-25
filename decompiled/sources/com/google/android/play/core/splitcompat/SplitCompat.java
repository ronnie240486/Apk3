package com.google.android.play.core.splitcompat;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public class SplitCompat {
    public static final /* synthetic */ int zza = 0;
    private static final java.util.concurrent.atomic.AtomicReference zzb = null;
    private final com.google.android.play.core.splitcompat.zze zzc;
    private final com.google.android.play.core.splitinstall.zzbe zzd;

    @androidx.annotation.GuardedBy("emulatedSplits")
    private final java.util.Set zze;
    private final com.google.android.play.core.splitcompat.zza zzf;

    static {
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r1 = 0
            r0.<init>(r1)
            com.google.android.play.core.splitcompat.SplitCompat.zzb = r0
            return
    }

    private SplitCompat(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r2.zze = r0
            com.google.android.play.core.splitcompat.zze r0 = new com.google.android.play.core.splitcompat.zze     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            r0.<init>(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            r2.zzc = r0     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            com.google.android.play.core.splitcompat.zza r1 = new com.google.android.play.core.splitcompat.zza
            r1.<init>(r0)
            r2.zzf = r1
            com.google.android.play.core.splitinstall.zzbe r0 = new com.google.android.play.core.splitinstall.zzbe
            r0.<init>(r3)
            r2.zzd = r0
            return
        L20:
            r3 = move-exception
            com.google.android.play.core.internal.zzbt r0 = new com.google.android.play.core.internal.zzbt
            java.lang.String r1 = "Failed to initialize FileStorage"
            r0.<init>(r1, r3)
            throw r0
    }

    public static boolean install(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = 0
            boolean r1 = zzi(r1, r0)
            return r1
    }

    public static boolean installActivity(@androidx.annotation.NonNull android.content.Context r2) {
            boolean r0 = zzj()
            if (r0 == 0) goto L8
            r2 = 0
            return r2
        L8:
            java.util.concurrent.atomic.AtomicReference r0 = com.google.android.play.core.splitcompat.SplitCompat.zzb
            java.lang.Object r0 = r0.get()
            com.google.android.play.core.splitcompat.SplitCompat r0 = (com.google.android.play.core.splitcompat.SplitCompat) r0
            if (r0 != 0) goto L24
            android.content.Context r0 = r2.getApplicationContext()
            if (r0 == 0) goto L1f
            android.content.Context r0 = r2.getApplicationContext()
            install(r0)
        L1f:
            boolean r2 = install(r2)
            return r2
        L24:
            com.google.android.play.core.splitcompat.zza r1 = r0.zzf
            java.util.Set r0 = r0.zzf()
            boolean r2 = r1.zzb(r2, r0)
            return r2
    }

    public static /* bridge */ /* synthetic */ com.google.android.play.core.splitcompat.zze zza(com.google.android.play.core.splitcompat.SplitCompat r0) {
            com.google.android.play.core.splitcompat.zze r0 = r0.zzc
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.Set zzb(com.google.android.play.core.splitcompat.SplitCompat r0) {
            java.util.Set r0 = r0.zzf()
            return r0
    }

    public static /* bridge */ /* synthetic */ void zzc(com.google.android.play.core.splitcompat.SplitCompat r0, java.util.Set r1) {
            r0.zzg(r1)
            return
    }

    public static boolean zzd(android.content.Context r1) {
            r0 = 1
            boolean r1 = zzi(r1, r0)
            return r1
    }

    public static boolean zze() {
            java.util.concurrent.atomic.AtomicReference r0 = com.google.android.play.core.splitcompat.SplitCompat.zzb
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    private final java.util.Set zzf() {
            r3 = this;
            java.util.Set r0 = r3.zze
            monitor-enter(r0)
            java.util.HashSet r1 = new java.util.HashSet     // Catch: java.lang.Throwable -> Lc
            java.util.Set r2 = r3.zze     // Catch: java.lang.Throwable -> Lc
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return r1
        Lc:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    private final void zzg(java.util.Set r3) throws java.io.IOException {
            r2 = this;
            java.util.Iterator r3 = r3.iterator()
        L4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            com.google.android.play.core.splitcompat.zze r1 = r2.zzc
            java.io.File r0 = r1.zzg(r0)
            com.google.android.play.core.splitcompat.zze.zzl(r0)
            goto L4
        L1a:
            com.google.android.play.core.splitinstall.zzbe r3 = r2.zzd
            r3.zzb()
            return
    }

    @androidx.annotation.RequiresApi(21)
    private final synchronized void zzh(android.content.Context r9, boolean r10) throws java.io.IOException {
            r8 = this;
            monitor-enter(r8)
            if (r10 == 0) goto L9
            com.google.android.play.core.splitcompat.zze r0 = r8.zzc     // Catch: java.lang.Throwable -> L22b
            r0.zzk()     // Catch: java.lang.Throwable -> L22b
            goto L15
        L9:
            java.util.concurrent.Executor r0 = com.google.android.play.core.splitcompat.zzd.zza()     // Catch: java.lang.Throwable -> L22b
            com.google.android.play.core.splitcompat.zzp r1 = new com.google.android.play.core.splitcompat.zzp     // Catch: java.lang.Throwable -> L22b
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L22b
            r0.execute(r1)     // Catch: java.lang.Throwable -> L22b
        L15:
            java.lang.String r0 = r9.getPackageName()     // Catch: java.lang.Throwable -> L22b
            r1 = 0
            android.content.pm.PackageManager r2 = r9.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L219 java.lang.Throwable -> L22b
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L219 java.lang.Throwable -> L22b
            java.lang.String[] r2 = r2.splitNames     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L219 java.lang.Throwable -> L22b
            if (r2 != 0) goto L2c
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L219 java.lang.Throwable -> L22b
            r2.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L219 java.lang.Throwable -> L22b
            goto L30
        L2c:
            java.util.List r2 = java.util.Arrays.asList(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L219 java.lang.Throwable -> L22b
        L30:
            com.google.android.play.core.splitcompat.zze r0 = r8.zzc     // Catch: java.lang.Throwable -> L22b
            java.util.Set r0 = r0.zzj()     // Catch: java.lang.Throwable -> L22b
            com.google.android.play.core.splitinstall.zzbe r1 = r8.zzd     // Catch: java.lang.Throwable -> L22b
            java.util.Set r1 = r1.zza()     // Catch: java.lang.Throwable -> L22b
            java.util.HashSet r3 = new java.util.HashSet     // Catch: java.lang.Throwable -> L22b
            r3.<init>()     // Catch: java.lang.Throwable -> L22b
            java.util.HashSet r0 = (java.util.HashSet) r0     // Catch: java.lang.Throwable -> L22b
            java.util.Iterator r4 = r0.iterator()     // Catch: java.lang.Throwable -> L22b
        L47:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L22b
            if (r5 == 0) goto L6e
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L22b
            com.google.android.play.core.splitcompat.zzs r5 = (com.google.android.play.core.splitcompat.zzs) r5     // Catch: java.lang.Throwable -> L22b
            java.lang.String r5 = r5.zzb()     // Catch: java.lang.Throwable -> L22b
            boolean r6 = r2.contains(r5)     // Catch: java.lang.Throwable -> L22b
            if (r6 != 0) goto L67
            java.lang.String r6 = com.google.android.play.core.splitinstall.zzs.zzb(r5)     // Catch: java.lang.Throwable -> L22b
            boolean r6 = r1.contains(r6)     // Catch: java.lang.Throwable -> L22b
            if (r6 == 0) goto L47
        L67:
            r3.add(r5)     // Catch: java.lang.Throwable -> L22b
            r4.remove()     // Catch: java.lang.Throwable -> L22b
            goto L47
        L6e:
            if (r10 == 0) goto L74
            r8.zzg(r3)     // Catch: java.lang.Throwable -> L22b
            goto L86
        L74:
            boolean r1 = r3.isEmpty()     // Catch: java.lang.Throwable -> L22b
            if (r1 != 0) goto L86
            java.util.concurrent.Executor r1 = com.google.android.play.core.splitcompat.zzd.zza()     // Catch: java.lang.Throwable -> L22b
            com.google.android.play.core.splitcompat.zzq r4 = new com.google.android.play.core.splitcompat.zzq     // Catch: java.lang.Throwable -> L22b
            r4.<init>(r8, r3)     // Catch: java.lang.Throwable -> L22b
            r1.execute(r4)     // Catch: java.lang.Throwable -> L22b
        L86:
            java.util.HashSet r1 = new java.util.HashSet     // Catch: java.lang.Throwable -> L22b
            r1.<init>()     // Catch: java.lang.Throwable -> L22b
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L22b
        L8f:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L22b
            if (r4 == 0) goto La9
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L22b
            com.google.android.play.core.splitcompat.zzs r4 = (com.google.android.play.core.splitcompat.zzs) r4     // Catch: java.lang.Throwable -> L22b
            java.lang.String r4 = r4.zzb()     // Catch: java.lang.Throwable -> L22b
            boolean r5 = com.google.android.play.core.splitinstall.zzs.zzf(r4)     // Catch: java.lang.Throwable -> L22b
            if (r5 != 0) goto L8f
            r1.add(r4)     // Catch: java.lang.Throwable -> L22b
            goto L8f
        La9:
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L22b
        Lad:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L22b
            if (r3 == 0) goto Lc3
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L22b
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L22b
            boolean r4 = com.google.android.play.core.splitinstall.zzs.zzf(r3)     // Catch: java.lang.Throwable -> L22b
            if (r4 != 0) goto Lad
            r1.add(r3)     // Catch: java.lang.Throwable -> L22b
            goto Lad
        Lc3:
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> L22b
            int r3 = r0.size()     // Catch: java.lang.Throwable -> L22b
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L22b
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L22b
        Ld0:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L22b
            if (r3 == 0) goto Lf8
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L22b
            com.google.android.play.core.splitcompat.zzs r3 = (com.google.android.play.core.splitcompat.zzs) r3     // Catch: java.lang.Throwable -> L22b
            java.lang.String r4 = r3.zzb()     // Catch: java.lang.Throwable -> L22b
            boolean r4 = com.google.android.play.core.splitinstall.zzs.zze(r4)     // Catch: java.lang.Throwable -> L22b
            if (r4 != 0) goto Lf4
            java.lang.String r4 = r3.zzb()     // Catch: java.lang.Throwable -> L22b
            java.lang.String r4 = com.google.android.play.core.splitinstall.zzs.zzb(r4)     // Catch: java.lang.Throwable -> L22b
            boolean r4 = r1.contains(r4)     // Catch: java.lang.Throwable -> L22b
            if (r4 == 0) goto Ld0
        Lf4:
            r2.add(r3)     // Catch: java.lang.Throwable -> L22b
            goto Ld0
        Lf8:
            com.google.android.play.core.splitcompat.zzm r0 = new com.google.android.play.core.splitcompat.zzm     // Catch: java.lang.Throwable -> L22b
            com.google.android.play.core.splitcompat.zze r1 = r8.zzc     // Catch: java.lang.Throwable -> L22b
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L22b
            com.google.android.play.core.internal.zzaz r1 = com.google.android.play.core.internal.zzba.zza()     // Catch: java.lang.Throwable -> L22b
            java.lang.ClassLoader r3 = r9.getClassLoader()     // Catch: java.lang.Throwable -> L22b
            if (r10 == 0) goto L111
            java.util.Set r0 = r0.zzc()     // Catch: java.lang.Throwable -> L22b
            r1.zza(r3, r0)     // Catch: java.lang.Throwable -> L22b
            goto L12f
        L111:
            java.util.Iterator r4 = r2.iterator()     // Catch: java.lang.Throwable -> L22b
        L115:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L22b
            if (r5 == 0) goto L12f
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L22b
            com.google.android.play.core.splitcompat.zzs r5 = (com.google.android.play.core.splitcompat.zzs) r5     // Catch: java.lang.Throwable -> L22b
            java.util.Set r5 = r0.zzb(r5)     // Catch: java.lang.Throwable -> L22b
            if (r5 != 0) goto L12b
            r4.remove()     // Catch: java.lang.Throwable -> L22b
            goto L115
        L12b:
            r1.zza(r3, r5)     // Catch: java.lang.Throwable -> L22b
            goto L115
        L12f:
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Throwable -> L22b
            r0.<init>()     // Catch: java.lang.Throwable -> L22b
            java.util.Iterator r4 = r2.iterator()     // Catch: java.lang.Throwable -> L22b
        L138:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L22b
            if (r5 == 0) goto L194
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L22b
            com.google.android.play.core.splitcompat.zzs r5 = (com.google.android.play.core.splitcompat.zzs) r5     // Catch: java.lang.Throwable -> L22b
            java.util.zip.ZipFile r6 = new java.util.zip.ZipFile     // Catch: java.io.IOException -> L18c java.lang.Throwable -> L22b
            java.io.File r7 = r5.zza()     // Catch: java.io.IOException -> L18c java.lang.Throwable -> L22b
            r6.<init>(r7)     // Catch: java.io.IOException -> L18c java.lang.Throwable -> L22b
            java.lang.String r7 = "classes.dex"
            java.util.zip.ZipEntry r7 = r6.getEntry(r7)     // Catch: java.io.IOException -> L18a java.lang.Throwable -> L22b
            r6.close()     // Catch: java.io.IOException -> L18a java.lang.Throwable -> L22b
            if (r7 == 0) goto L182
            com.google.android.play.core.splitcompat.zze r6 = r8.zzc     // Catch: java.lang.Throwable -> L22b
            java.lang.String r7 = r5.zzb()     // Catch: java.lang.Throwable -> L22b
            java.io.File r6 = r6.zza(r7)     // Catch: java.lang.Throwable -> L22b
            java.io.File r7 = r5.zza()     // Catch: java.lang.Throwable -> L22b
            boolean r6 = r1.zzb(r3, r6, r7, r10)     // Catch: java.lang.Throwable -> L22b
            if (r6 == 0) goto L16d
            goto L182
        L16d:
            java.lang.String r6 = "SplitCompat"
            java.lang.String r7 = "split was not installed "
            java.io.File r5 = r5.zza()     // Catch: java.lang.Throwable -> L22b
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L22b
            java.lang.String r5 = r7.concat(r5)     // Catch: java.lang.Throwable -> L22b
            android.util.Log.w(r6, r5)     // Catch: java.lang.Throwable -> L22b
            goto L138
        L182:
            java.io.File r5 = r5.zza()     // Catch: java.lang.Throwable -> L22b
            r0.add(r5)     // Catch: java.lang.Throwable -> L22b
            goto L138
        L18a:
            r9 = move-exception
            goto L18e
        L18c:
            r9 = move-exception
            r6 = 0
        L18e:
            if (r6 == 0) goto L193
            r6.close()     // Catch: java.io.IOException -> L193 java.lang.Throwable -> L22b
        L193:
            throw r9     // Catch: java.lang.Throwable -> L22b
        L194:
            com.google.android.play.core.splitcompat.zza r10 = r8.zzf     // Catch: java.lang.Throwable -> L22b
            r10.zza(r9, r0)     // Catch: java.lang.Throwable -> L22b
            java.util.HashSet r9 = new java.util.HashSet     // Catch: java.lang.Throwable -> L22b
            r9.<init>()     // Catch: java.lang.Throwable -> L22b
            java.util.Iterator r10 = r2.iterator()     // Catch: java.lang.Throwable -> L22b
        L1a2:
            boolean r1 = r10.hasNext()     // Catch: java.lang.Throwable -> L22b
            if (r1 == 0) goto L20b
            java.lang.Object r1 = r10.next()     // Catch: java.lang.Throwable -> L22b
            com.google.android.play.core.splitcompat.zzs r1 = (com.google.android.play.core.splitcompat.zzs) r1     // Catch: java.lang.Throwable -> L22b
            java.io.File r2 = r1.zza()     // Catch: java.lang.Throwable -> L22b
            boolean r2 = r0.contains(r2)     // Catch: java.lang.Throwable -> L22b
            if (r2 == 0) goto L1e5
            java.lang.String r2 = r1.zzb()     // Catch: java.lang.Throwable -> L22b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22b
            int r4 = r2.length()     // Catch: java.lang.Throwable -> L22b
            int r4 = r4 + 30
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L22b
            java.lang.String r4 = "Split '"
            r3.append(r4)     // Catch: java.lang.Throwable -> L22b
            r3.append(r2)     // Catch: java.lang.Throwable -> L22b
            java.lang.String r2 = "' installation emulated"
            r3.append(r2)     // Catch: java.lang.Throwable -> L22b
            java.lang.String r2 = "SplitCompat"
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L22b
            android.util.Log.d(r2, r3)     // Catch: java.lang.Throwable -> L22b
            java.lang.String r1 = r1.zzb()     // Catch: java.lang.Throwable -> L22b
            r9.add(r1)     // Catch: java.lang.Throwable -> L22b
            goto L1a2
        L1e5:
            java.lang.String r1 = r1.zzb()     // Catch: java.lang.Throwable -> L22b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22b
            int r3 = r1.length()     // Catch: java.lang.Throwable -> L22b
            int r3 = r3 + 35
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L22b
            java.lang.String r3 = "Split '"
            r2.append(r3)     // Catch: java.lang.Throwable -> L22b
            r2.append(r1)     // Catch: java.lang.Throwable -> L22b
            java.lang.String r1 = "' installation not emulated."
            r2.append(r1)     // Catch: java.lang.Throwable -> L22b
            java.lang.String r1 = "SplitCompat"
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L22b
            android.util.Log.d(r1, r2)     // Catch: java.lang.Throwable -> L22b
            goto L1a2
        L20b:
            java.util.Set r10 = r8.zze     // Catch: java.lang.Throwable -> L22b
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L22b
            java.util.Set r0 = r8.zze     // Catch: java.lang.Throwable -> L216
            r0.addAll(r9)     // Catch: java.lang.Throwable -> L216
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L216
            monitor-exit(r8)
            return
        L216:
            r9 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L216
            throw r9     // Catch: java.lang.Throwable -> L22b
        L219:
            r9 = move-exception
            java.io.IOException r10 = new java.io.IOException     // Catch: java.lang.Throwable -> L22b
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L22b
            r2[r1] = r0     // Catch: java.lang.Throwable -> L22b
            java.lang.String r0 = "Cannot load data for application '%s'"
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch: java.lang.Throwable -> L22b
            r10.<init>(r0, r9)     // Catch: java.lang.Throwable -> L22b
            throw r10     // Catch: java.lang.Throwable -> L22b
        L22b:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
    }

    private static boolean zzi(android.content.Context r11, boolean r12) {
            boolean r0 = zzj()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.concurrent.atomic.AtomicReference r0 = com.google.android.play.core.splitcompat.SplitCompat.zzb
            com.google.android.play.core.splitcompat.SplitCompat r2 = new com.google.android.play.core.splitcompat.SplitCompat
            r2.<init>(r11)
            r3 = 0
            boolean r2 = r0.compareAndSet(r3, r2)
            java.lang.Object r0 = r0.get()
            com.google.android.play.core.splitcompat.SplitCompat r0 = (com.google.android.play.core.splitcompat.SplitCompat) r0
            if (r2 == 0) goto L54
            com.google.android.play.core.splitinstall.zzo r2 = com.google.android.play.core.splitinstall.zzo.zza
            com.google.android.play.core.internal.zzaw r10 = new com.google.android.play.core.internal.zzaw
            java.util.concurrent.Executor r5 = com.google.android.play.core.splitcompat.zzd.zza()
            com.google.android.play.core.internal.zzay r6 = new com.google.android.play.core.internal.zzay
            com.google.android.play.core.splitcompat.zze r3 = r0.zzc
            com.google.android.play.core.internal.zzau r4 = new com.google.android.play.core.internal.zzau
            r4.<init>()
            r6.<init>(r11, r3, r4)
            com.google.android.play.core.splitcompat.zze r7 = r0.zzc
            com.google.android.play.core.splitcompat.zzr r8 = new com.google.android.play.core.splitcompat.zzr
            r8.<init>()
            r9 = 0
            r3 = r10
            r4 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r2.zzb(r10)
            com.google.android.play.core.splitcompat.zzo r2 = new com.google.android.play.core.splitcompat.zzo
            r2.<init>(r0)
            com.google.android.play.core.splitinstall.zzr.zzb(r2)
            java.util.concurrent.Executor r2 = com.google.android.play.core.splitcompat.zzd.zza()
            com.google.android.play.core.splitcompat.zzn r3 = new com.google.android.play.core.splitcompat.zzn
            r3.<init>(r11)
            r2.execute(r3)
        L54:
            r0.zzh(r11, r12)     // Catch: java.lang.Exception -> L59
            r11 = 1
            return r11
        L59:
            r11 = move-exception
            java.lang.String r12 = "SplitCompat"
            java.lang.String r0 = "Error installing additional splits"
            android.util.Log.e(r12, r0, r11)
            return r1
    }

    private static boolean zzj() {
            r0 = 0
            return r0
    }
}
