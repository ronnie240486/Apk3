package com.google.android.gms.security;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class ProviderInstaller {

    @androidx.annotation.NonNull
    public static final java.lang.String PROVIDER_NAME = "GmsCore_OpenSSL";
    private static final com.google.android.gms.common.GoogleApiAvailabilityLight zza = null;
    private static final java.lang.Object zzb = null;

    @androidx.annotation.GuardedBy("ProviderInstaller.lock")
    private static java.lang.reflect.Method zzc;

    @androidx.annotation.GuardedBy("ProviderInstaller.lock")
    private static java.lang.reflect.Method zzd;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public interface ProviderInstallListener {
        void onProviderInstallFailed(int r1, @androidx.annotation.Nullable android.content.Intent r2);

        void onProviderInstalled();
    }

    static {
            com.google.android.gms.common.GoogleApiAvailabilityLight r0 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance()
            com.google.android.gms.security.ProviderInstaller.zza = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.security.ProviderInstaller.zzb = r0
            r0 = 0
            com.google.android.gms.security.ProviderInstaller.zzc = r0
            com.google.android.gms.security.ProviderInstaller.zzd = r0
            return
    }

    public ProviderInstaller() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void installIfNeeded(@androidx.annotation.NonNull android.content.Context r14) throws com.google.android.gms.common.GooglePlayServicesRepairableException, com.google.android.gms.common.GooglePlayServicesNotAvailableException {
            java.lang.String r0 = "Context must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r14, r0)
            com.google.android.gms.common.GoogleApiAvailabilityLight r0 = com.google.android.gms.security.ProviderInstaller.zza
            r1 = 11925000(0xb5f608, float:1.6710484E-38)
            r0.verifyGooglePlayServicesIsAvailable(r14, r1)
            java.lang.Object r0 = com.google.android.gms.security.ProviderInstaller.zzb
            monitor-enter(r0)
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> Lc3
            r3 = 0
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy r4 = com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L22 java.lang.Throwable -> Lc3
            java.lang.String r5 = "com.google.android.gms.providerinstaller.dynamite"
            com.google.android.gms.dynamite.DynamiteModule r4 = com.google.android.gms.dynamite.DynamiteModule.load(r14, r4, r5)     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L22 java.lang.Throwable -> Lc3
            android.content.Context r4 = r4.getModuleContext()     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L22 java.lang.Throwable -> Lc3
            goto L43
        L22:
            r4 = move-exception
            java.lang.String r5 = "ProviderInstaller"
            java.lang.String r6 = "Failed to load providerinstaller module: "
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> Lc3
            int r7 = r4.length()     // Catch: java.lang.Throwable -> Lc3
            if (r7 == 0) goto L3a
            java.lang.String r4 = r6.concat(r4)     // Catch: java.lang.Throwable -> Lc3
            goto L3f
        L3a:
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> Lc3
            r4.<init>(r6)     // Catch: java.lang.Throwable -> Lc3
        L3f:
            android.util.Log.w(r5, r4)     // Catch: java.lang.Throwable -> Lc3
            r4 = r3
        L43:
            if (r4 != 0) goto Lbc
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> Lc3
            android.content.Context r6 = com.google.android.gms.common.GooglePlayServicesUtilLight.getRemoteContext(r14)     // Catch: java.lang.Throwable -> Lc3
            if (r6 == 0) goto La4
            java.lang.reflect.Method r7 = com.google.android.gms.security.ProviderInstaller.zzd     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> Lc3
            r8 = 2
            r9 = 1
            r10 = 0
            r11 = 3
            if (r7 != 0) goto L6e
            java.lang.Class[] r7 = new java.lang.Class[r11]     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> Lc3
            java.lang.Class<android.content.Context> r12 = android.content.Context.class
            r7[r10] = r12     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> Lc3
            java.lang.Class r12 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> Lc3
            r7[r9] = r12     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> Lc3
            r7[r8] = r12     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> Lc3
            java.lang.String r12 = "com.google.android.gms.common.security.ProviderInstallerImpl"
            java.lang.String r13 = "reportRequestStats"
            java.lang.reflect.Method r7 = zzb(r6, r12, r13, r7)     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> Lc3
            com.google.android.gms.security.ProviderInstaller.zzd = r7     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> Lc3
        L6e:
            java.lang.reflect.Method r7 = com.google.android.gms.security.ProviderInstaller.zzd     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> Lc3
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> Lc3
            r11[r10] = r14     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> Lc3
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> Lc3
            r11[r9] = r1     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> Lc3
            java.lang.Long r1 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> Lc3
            r11[r8] = r1     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> Lc3
            r7.invoke(r3, r11)     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> Lc3
            goto La4
        L84:
            r1 = move-exception
            java.lang.String r2 = "ProviderInstaller"
            java.lang.String r3 = "Failed to report request stats: "
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Lc3
            int r4 = r1.length()     // Catch: java.lang.Throwable -> Lc3
            if (r4 == 0) goto L9c
            java.lang.String r1 = r3.concat(r1)     // Catch: java.lang.Throwable -> Lc3
            goto La1
        L9c:
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> Lc3
            r1.<init>(r3)     // Catch: java.lang.Throwable -> Lc3
        La1:
            android.util.Log.w(r2, r1)     // Catch: java.lang.Throwable -> Lc3
        La4:
            if (r6 == 0) goto Lad
            java.lang.String r1 = "com.google.android.gms.common.security.ProviderInstallerImpl"
            zzc(r6, r14, r1)     // Catch: java.lang.Throwable -> Lc3
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc3
            return
        Lad:
            java.lang.String r14 = "ProviderInstaller"
            java.lang.String r1 = "Failed to get remote context"
            android.util.Log.e(r14, r1)     // Catch: java.lang.Throwable -> Lc3
            com.google.android.gms.common.GooglePlayServicesNotAvailableException r14 = new com.google.android.gms.common.GooglePlayServicesNotAvailableException     // Catch: java.lang.Throwable -> Lc3
            r1 = 8
            r14.<init>(r1)     // Catch: java.lang.Throwable -> Lc3
            throw r14     // Catch: java.lang.Throwable -> Lc3
        Lbc:
            java.lang.String r1 = "com.google.android.gms.providerinstaller.ProviderInstallerImpl"
            zzc(r4, r14, r1)     // Catch: java.lang.Throwable -> Lc3
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc3
            return
        Lc3:
            r14 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc3
            throw r14
    }

    public static void installIfNeededAsync(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull com.google.android.gms.security.ProviderInstaller.ProviderInstallListener r2) {
            java.lang.String r0 = "Context must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1, r0)
            java.lang.String r0 = "Listener must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            java.lang.String r0 = "Must be called on the UI thread"
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            com.google.android.gms.security.zza r0 = new com.google.android.gms.security.zza
            r0.<init>(r1, r2)
            r1 = 0
            java.lang.Void[] r1 = new java.lang.Void[r1]
            r0.execute(r1)
            return
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.GoogleApiAvailabilityLight zza() {
            com.google.android.gms.common.GoogleApiAvailabilityLight r0 = com.google.android.gms.security.ProviderInstaller.zza
            return r0
    }

    private static java.lang.reflect.Method zzb(android.content.Context r0, java.lang.String r1, java.lang.String r2, java.lang.Class[] r3) throws java.lang.ClassNotFoundException, java.lang.NoSuchMethodException {
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.Class r0 = r0.loadClass(r1)
            java.lang.reflect.Method r0 = r0.getMethod(r2, r3)
            return r0
    }

    @androidx.annotation.GuardedBy("ProviderInstaller.lock")
    private static void zzc(android.content.Context r3, android.content.Context r4, java.lang.String r5) throws com.google.android.gms.common.GooglePlayServicesNotAvailableException {
            java.lang.reflect.Method r4 = com.google.android.gms.security.ProviderInstaller.zzc     // Catch: java.lang.Exception -> L1f
            r0 = 0
            r1 = 1
            if (r4 != 0) goto L14
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L1f
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r4[r0] = r2     // Catch: java.lang.Exception -> L1f
            java.lang.String r2 = "insertProvider"
            java.lang.reflect.Method r4 = zzb(r3, r5, r2, r4)     // Catch: java.lang.Exception -> L1f
            com.google.android.gms.security.ProviderInstaller.zzc = r4     // Catch: java.lang.Exception -> L1f
        L14:
            java.lang.reflect.Method r4 = com.google.android.gms.security.ProviderInstaller.zzc     // Catch: java.lang.Exception -> L1f
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L1f
            r5[r0] = r3     // Catch: java.lang.Exception -> L1f
            r3 = 0
            r4.invoke(r3, r5)     // Catch: java.lang.Exception -> L1f
            return
        L1f:
            r3 = move-exception
            java.lang.Throwable r4 = r3.getCause()
            r5 = 6
            java.lang.String r0 = "ProviderInstaller"
            boolean r5 = android.util.Log.isLoggable(r0, r5)
            if (r5 == 0) goto L51
            if (r4 != 0) goto L34
            java.lang.String r3 = r3.getMessage()
            goto L38
        L34:
            java.lang.String r3 = r4.getMessage()
        L38:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "Failed to install provider: "
            int r5 = r3.length()
            if (r5 == 0) goto L49
            java.lang.String r3 = r4.concat(r3)
            goto L4e
        L49:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r4)
        L4e:
            android.util.Log.e(r0, r3)
        L51:
            com.google.android.gms.common.GooglePlayServicesNotAvailableException r3 = new com.google.android.gms.common.GooglePlayServicesNotAvailableException
            r4 = 8
            r3.<init>(r4)
            throw r3
    }
}
