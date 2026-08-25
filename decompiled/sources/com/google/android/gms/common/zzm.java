package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzm {
    public static final com.google.android.gms.common.zze zza = null;
    public static final com.google.android.gms.common.zzf zzb = null;
    public static final com.google.android.gms.common.zzg zzc = null;
    public static final com.google.android.gms.common.zzh zzd = null;
    private static volatile com.google.android.gms.common.internal.zzaf zze;
    private static final java.lang.Object zzf = null;
    private static android.content.Context zzg;

    static {
            com.google.android.gms.common.zze r0 = new com.google.android.gms.common.zze
            java.lang.String r1 = "0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"
            byte[] r1 = com.google.android.gms.common.zzi.zze(r1)
            r0.<init>(r1)
            com.google.android.gms.common.zzm.zza = r0
            com.google.android.gms.common.zzf r0 = new com.google.android.gms.common.zzf
            java.lang.String r1 = "0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"
            byte[] r1 = com.google.android.gms.common.zzi.zze(r1)
            r0.<init>(r1)
            com.google.android.gms.common.zzm.zzb = r0
            com.google.android.gms.common.zzg r0 = new com.google.android.gms.common.zzg
            java.lang.String r1 = "0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"
            byte[] r1 = com.google.android.gms.common.zzi.zze(r1)
            r0.<init>(r1)
            com.google.android.gms.common.zzm.zzc = r0
            com.google.android.gms.common.zzh r0 = new com.google.android.gms.common.zzh
            java.lang.String r1 = "0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"
            byte[] r1 = com.google.android.gms.common.zzi.zze(r1)
            r0.<init>(r1)
            com.google.android.gms.common.zzm.zzd = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.common.zzm.zzf = r0
            return
    }

    public static com.google.android.gms.common.zzw zza(java.lang.String r1, com.google.android.gms.common.zzi r2, boolean r3, boolean r4) {
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()
            com.google.android.gms.common.zzw r1 = zzf(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> Lc
            android.os.StrictMode.setThreadPolicy(r0)
            return r1
        Lc:
            r1 = move-exception
            android.os.StrictMode.setThreadPolicy(r0)
            throw r1
    }

    public static com.google.android.gms.common.zzw zzb(java.lang.String r10, boolean r11) {
            java.lang.String r0 = "Failed to get Google certificates from remote"
            java.lang.String r1 = "GoogleCertificates"
            android.os.StrictMode$ThreadPolicy r2 = android.os.StrictMode.allowThreadDiskReads()
            android.content.Context r3 = com.google.android.gms.common.zzm.zzg     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch: java.lang.Throwable -> L82
            zzg()     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L5b java.lang.Throwable -> L82
            com.google.android.gms.common.zzn r3 = new com.google.android.gms.common.zzn     // Catch: java.lang.Throwable -> L82
            r7 = 0
            android.content.Context r4 = com.google.android.gms.common.zzm.zzg     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.dynamic.IObjectWrapper r8 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r4)     // Catch: java.lang.Throwable -> L82
            r9 = 0
            r4 = r3
            r5 = r10
            r6 = r11
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.common.internal.zzaf r10 = com.google.android.gms.common.zzm.zze     // Catch: android.os.RemoteException -> L50 java.lang.Throwable -> L82
            com.google.android.gms.common.zzq r10 = r10.zze(r3)     // Catch: android.os.RemoteException -> L50 java.lang.Throwable -> L82
            boolean r11 = r10.zzb()     // Catch: java.lang.Throwable -> L82
            if (r11 == 0) goto L31
            com.google.android.gms.common.zzw r10 = com.google.android.gms.common.zzw.zzb()     // Catch: java.lang.Throwable -> L82
            goto L7e
        L31:
            java.lang.String r11 = r10.zza()     // Catch: java.lang.Throwable -> L82
            java.lang.String r0 = "error checking package certificate"
            if (r11 != 0) goto L3a
            r11 = r0
        L3a:
            int r10 = r10.zzc()     // Catch: java.lang.Throwable -> L82
            r0 = 4
            if (r10 != r0) goto L4b
            android.content.pm.PackageManager$NameNotFoundException r10 = new android.content.pm.PackageManager$NameNotFoundException     // Catch: java.lang.Throwable -> L82
            r10.<init>()     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.common.zzw r10 = com.google.android.gms.common.zzw.zzd(r11, r10)     // Catch: java.lang.Throwable -> L82
            goto L7e
        L4b:
            com.google.android.gms.common.zzw r10 = com.google.android.gms.common.zzw.zzc(r11)     // Catch: java.lang.Throwable -> L82
            goto L7e
        L50:
            r10 = move-exception
            android.util.Log.e(r1, r0, r10)     // Catch: java.lang.Throwable -> L82
            java.lang.String r11 = "module call"
            com.google.android.gms.common.zzw r10 = com.google.android.gms.common.zzw.zzd(r11, r10)     // Catch: java.lang.Throwable -> L82
            goto L7e
        L5b:
            r10 = move-exception
            android.util.Log.e(r1, r0, r10)     // Catch: java.lang.Throwable -> L82
            java.lang.String r11 = "module init: "
            java.lang.String r0 = r10.getMessage()     // Catch: java.lang.Throwable -> L82
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L82
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L82
            if (r1 == 0) goto L74
            java.lang.String r11 = r11.concat(r0)     // Catch: java.lang.Throwable -> L82
            goto L7a
        L74:
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L82
            r0.<init>(r11)     // Catch: java.lang.Throwable -> L82
            r11 = r0
        L7a:
            com.google.android.gms.common.zzw r10 = com.google.android.gms.common.zzw.zzd(r11, r10)     // Catch: java.lang.Throwable -> L82
        L7e:
            android.os.StrictMode.setThreadPolicy(r2)
            return r10
        L82:
            r10 = move-exception
            android.os.StrictMode.setThreadPolicy(r2)
            throw r10
    }

    public static /* synthetic */ java.lang.String zzc(boolean r4, java.lang.String r5, com.google.android.gms.common.zzi r6) throws java.lang.Exception {
            r0 = 1
            r1 = 0
            if (r4 != 0) goto Le
            com.google.android.gms.common.zzw r2 = zzf(r5, r6, r0, r1)
            boolean r2 = r2.zza
            if (r2 == 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            if (r0 == r2) goto L14
            java.lang.String r2 = "not allowed"
            goto L16
        L14:
            java.lang.String r2 = "debug cert rejected"
        L16:
            r3 = 5
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r1] = r2
            r3[r0] = r5
            java.lang.String r5 = "SHA-1"
            java.security.MessageDigest r5 = com.google.android.gms.common.util.AndroidUtilsLight.zza(r5)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            r0 = 2
            byte[] r6 = r6.zzf()
            byte[] r5 = r5.digest(r6)
            java.lang.String r5 = com.google.android.gms.common.util.Hex.bytesToStringLowercase(r5)
            r3[r0] = r5
            r5 = 3
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r3[r5] = r4
            r4 = 4
            java.lang.String r5 = "12451000.false"
            r3[r4] = r5
            java.lang.String r4 = "%s: pkg=%s, sha1=%s, atk=%s, ver=%s"
            java.lang.String r4 = java.lang.String.format(r4, r3)
            return r4
    }

    public static synchronized void zzd(android.content.Context r2) {
            java.lang.Class<com.google.android.gms.common.zzm> r0 = com.google.android.gms.common.zzm.class
            monitor-enter(r0)
            android.content.Context r1 = com.google.android.gms.common.zzm.zzg     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L13
            if (r2 == 0) goto L11
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L1c
            com.google.android.gms.common.zzm.zzg = r2     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)
            return
        L11:
            monitor-exit(r0)
            return
        L13:
            java.lang.String r2 = "GoogleCertificates"
            java.lang.String r1 = "GoogleCertificates has been initialized already"
            android.util.Log.w(r2, r1)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)
            return
        L1c:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    public static boolean zze() {
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()
            zzg()     // Catch: java.lang.Throwable -> L11 android.os.RemoteException -> L13 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L15
            com.google.android.gms.common.internal.zzaf r1 = com.google.android.gms.common.zzm.zze     // Catch: java.lang.Throwable -> L11 android.os.RemoteException -> L13 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L15
            boolean r1 = r1.zzg()     // Catch: java.lang.Throwable -> L11 android.os.RemoteException -> L13 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L15
            android.os.StrictMode.setThreadPolicy(r0)
            return r1
        L11:
            r1 = move-exception
            goto L22
        L13:
            r1 = move-exception
            goto L16
        L15:
            r1 = move-exception
        L16:
            java.lang.String r2 = "GoogleCertificates"
            java.lang.String r3 = "Failed to get Google certificates from remote"
            android.util.Log.e(r2, r3, r1)     // Catch: java.lang.Throwable -> L11
            android.os.StrictMode.setThreadPolicy(r0)
            r0 = 0
            return r0
        L22:
            android.os.StrictMode.setThreadPolicy(r0)
            throw r1
    }

    private static com.google.android.gms.common.zzw zzf(java.lang.String r4, com.google.android.gms.common.zzi r5, boolean r6, boolean r7) {
            java.lang.String r0 = "Failed to get Google certificates from remote"
            java.lang.String r1 = "GoogleCertificates"
            zzg()     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L3e
            android.content.Context r2 = com.google.android.gms.common.zzm.zzg
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            com.google.android.gms.common.zzs r2 = new com.google.android.gms.common.zzs
            r2.<init>(r4, r5, r6, r7)
            com.google.android.gms.common.internal.zzaf r7 = com.google.android.gms.common.zzm.zze     // Catch: android.os.RemoteException -> L33
            android.content.Context r3 = com.google.android.gms.common.zzm.zzg     // Catch: android.os.RemoteException -> L33
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: android.os.RemoteException -> L33
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r3)     // Catch: android.os.RemoteException -> L33
            boolean r7 = r7.zzf(r2, r3)     // Catch: android.os.RemoteException -> L33
            if (r7 == 0) goto L28
            com.google.android.gms.common.zzw r4 = com.google.android.gms.common.zzw.zzb()
            return r4
        L28:
            com.google.android.gms.common.zzd r7 = new com.google.android.gms.common.zzd
            r7.<init>(r6, r4, r5)
            com.google.android.gms.common.zzv r4 = new com.google.android.gms.common.zzv
            r4.<init>(r7)
            return r4
        L33:
            r4 = move-exception
            android.util.Log.e(r1, r0, r4)
            java.lang.String r5 = "module call"
            com.google.android.gms.common.zzw r4 = com.google.android.gms.common.zzw.zzd(r5, r4)
            return r4
        L3e:
            r4 = move-exception
            android.util.Log.e(r1, r0, r4)
            java.lang.String r5 = r4.getMessage()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r6 = "module init: "
            int r7 = r5.length()
            if (r7 == 0) goto L57
            java.lang.String r5 = r6.concat(r5)
            goto L5c
        L57:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r6)
        L5c:
            com.google.android.gms.common.zzw r4 = com.google.android.gms.common.zzw.zzd(r5, r4)
            return r4
    }

    private static void zzg() throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
            com.google.android.gms.common.internal.zzaf r0 = com.google.android.gms.common.zzm.zze
            if (r0 == 0) goto L5
            return
        L5:
            android.content.Context r0 = com.google.android.gms.common.zzm.zzg
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.lang.Object r0 = com.google.android.gms.common.zzm.zzf
            monitor-enter(r0)
            com.google.android.gms.common.internal.zzaf r1 = com.google.android.gms.common.zzm.zze     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto L27
            android.content.Context r1 = com.google.android.gms.common.zzm.zzg     // Catch: java.lang.Throwable -> L29
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy r2 = com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING     // Catch: java.lang.Throwable -> L29
            java.lang.String r3 = "com.google.android.gms.googlecertificates"
            com.google.android.gms.dynamite.DynamiteModule r1 = com.google.android.gms.dynamite.DynamiteModule.load(r1, r2, r3)     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = "com.google.android.gms.common.GoogleCertificatesImpl"
            android.os.IBinder r1 = r1.instantiate(r2)     // Catch: java.lang.Throwable -> L29
            com.google.android.gms.common.internal.zzaf r1 = com.google.android.gms.common.internal.zzae.zzb(r1)     // Catch: java.lang.Throwable -> L29
            com.google.android.gms.common.zzm.zze = r1     // Catch: java.lang.Throwable -> L29
        L27:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            return
        L29:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            throw r1
    }
}
