package com.google.android.gms.net;

/* JADX INFO: compiled from: com.google.android.gms:play-services-cronet@@17.0.1 */
/* JADX INFO: loaded from: classes.dex */
public class CronetProviderInstaller {

    @androidx.annotation.NonNull
    public static final java.lang.String PROVIDER_NAME = "Google-Play-Services-Cronet-Provider";
    private static final java.lang.String zza = "CronetProviderInstaller";
    private static final com.google.android.gms.common.GoogleApiAvailabilityLight zzb = null;
    private static final java.lang.Object zzc = null;

    @androidx.annotation.Nullable
    @javax.annotation.concurrent.GuardedBy("lock")
    private static com.google.android.gms.dynamite.DynamiteModule zzd;

    @javax.annotation.concurrent.GuardedBy("lock")
    private static java.lang.String zze;

    static {
            com.google.android.gms.common.GoogleApiAvailabilityLight r0 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance()
            com.google.android.gms.net.CronetProviderInstaller.zzb = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.net.CronetProviderInstaller.zzc = r0
            r0 = 0
            com.google.android.gms.net.CronetProviderInstaller.zzd = r0
            java.lang.String r0 = "0"
            com.google.android.gms.net.CronetProviderInstaller.zze = r0
            return
    }

    private CronetProviderInstaller() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static com.google.android.gms.tasks.Task<java.lang.Void> installProvider(@androidx.annotation.NonNull android.content.Context r3) {
            java.lang.String r0 = "Context must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
            com.google.android.gms.tasks.TaskCompletionSource r0 = new com.google.android.gms.tasks.TaskCompletionSource
            r0.<init>()
            boolean r1 = isInstalled()
            if (r1 == 0) goto L19
            r3 = 0
            r0.setResult(r3)
            com.google.android.gms.tasks.Task r3 = r0.getTask()
            return r3
        L19:
            java.lang.Thread r1 = new java.lang.Thread
            com.google.android.gms.net.zza r2 = new com.google.android.gms.net.zza
            r2.<init>(r3, r0)
            r1.<init>(r2)
            r1.start()
            com.google.android.gms.tasks.Task r3 = r0.getTask()
            return r3
    }

    public static boolean isInstalled() {
            java.lang.Object r0 = com.google.android.gms.net.CronetProviderInstaller.zzc
            monitor-enter(r0)
            com.google.android.gms.dynamite.DynamiteModule r1 = com.google.android.gms.net.CronetProviderInstaller.zzd     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
        Lc:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    @androidx.annotation.Nullable
    public static com.google.android.gms.dynamite.DynamiteModule zza() {
            java.lang.Object r0 = com.google.android.gms.net.CronetProviderInstaller.zzc
            monitor-enter(r0)
            com.google.android.gms.dynamite.DynamiteModule r1 = com.google.android.gms.net.CronetProviderInstaller.zzd     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public static java.lang.String zzb() {
            java.lang.Object r0 = com.google.android.gms.net.CronetProviderInstaller.zzc
            monitor-enter(r0)
            java.lang.String r1 = com.google.android.gms.net.CronetProviderInstaller.zze     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    @com.google.android.gms.common.internal.ShowFirstParty
    @java.lang.Deprecated
    public static void zzc(@androidx.annotation.NonNull android.content.Context r10) throws com.google.android.gms.common.GooglePlayServicesNotAvailableException, com.google.android.gms.common.GooglePlayServicesRepairableException {
            java.lang.Class<com.google.android.gms.net.CronetProviderInstaller> r0 = com.google.android.gms.net.CronetProviderInstaller.class
            java.lang.Object r1 = com.google.android.gms.net.CronetProviderInstaller.zzc
            monitor-enter(r1)
            boolean r2 = isInstalled()     // Catch: java.lang.Throwable -> L11d
            if (r2 == 0) goto Ld
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11d
            return
        Ld:
            java.lang.String r2 = "Context must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r10, r2)     // Catch: java.lang.Throwable -> L11d
            java.lang.ClassLoader r2 = r0.getClassLoader()     // Catch: java.lang.Throwable -> L11d
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)     // Catch: java.lang.Throwable -> L11d
            java.lang.ClassLoader r2 = (java.lang.ClassLoader) r2     // Catch: java.lang.Throwable -> L11d
            java.lang.String r3 = "org.chromium.net.CronetEngine"
            r2.loadClass(r3)     // Catch: java.lang.ClassNotFoundException -> L107 java.lang.Throwable -> L11d
            int r2 = org.chromium.net.ApiVersion.getApiLevel()     // Catch: java.lang.ClassNotFoundException -> L107 java.lang.Throwable -> L11d
            com.google.android.gms.common.GoogleApiAvailabilityLight r3 = com.google.android.gms.net.CronetProviderInstaller.zzb     // Catch: java.lang.Throwable -> L11d
            r4 = 11925000(0xb5f608, float:1.6710484E-38)
            r3.verifyGooglePlayServicesIsAvailable(r10, r4)     // Catch: java.lang.Throwable -> L11d
            r4 = 8
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy r5 = com.google.android.gms.dynamite.DynamiteModule.PREFER_REMOTE     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lf3 java.lang.Throwable -> L11d
            java.lang.String r6 = "com.google.android.gms.cronet_dynamite"
            com.google.android.gms.dynamite.DynamiteModule r5 = com.google.android.gms.dynamite.DynamiteModule.load(r10, r5, r6)     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lf3 java.lang.Throwable -> L11d
            android.content.Context r6 = r5.getModuleContext()     // Catch: java.lang.Exception -> Ldf java.lang.Throwable -> L11d
            java.lang.ClassLoader r6 = r6.getClassLoader()     // Catch: java.lang.Exception -> Ldf java.lang.Throwable -> L11d
            java.lang.String r7 = "org.chromium.net.impl.ImplVersion"
            java.lang.Class r6 = r6.loadClass(r7)     // Catch: java.lang.Exception -> Ldf java.lang.Throwable -> L11d
            java.lang.ClassLoader r7 = r6.getClassLoader()     // Catch: java.lang.Exception -> Ldf java.lang.Throwable -> L11d
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Exception -> Ldf java.lang.Throwable -> L11d
            if (r7 == r0) goto Ld2
            java.lang.String r0 = "getApiLevel"
            r7 = 0
            java.lang.Class[] r8 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> Ldf java.lang.Throwable -> L11d
            java.lang.reflect.Method r0 = r6.getMethod(r0, r8)     // Catch: java.lang.Exception -> Ldf java.lang.Throwable -> L11d
            java.lang.String r8 = "getCronetVersion"
            java.lang.Class[] r9 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> Ldf java.lang.Throwable -> L11d
            java.lang.reflect.Method r6 = r6.getMethod(r8, r9)     // Catch: java.lang.Exception -> Ldf java.lang.Throwable -> L11d
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> Ldf java.lang.Throwable -> L11d
            r9 = 0
            java.lang.Object r0 = r0.invoke(r9, r8)     // Catch: java.lang.Exception -> Ldf java.lang.Throwable -> L11d
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Exception -> Ldf java.lang.Throwable -> L11d
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch: java.lang.Exception -> Ldf java.lang.Throwable -> L11d
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Exception -> Ldf java.lang.Throwable -> L11d
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> Ldf java.lang.Throwable -> L11d
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> Ldf java.lang.Throwable -> L11d
            java.lang.Object r6 = r6.invoke(r9, r7)     // Catch: java.lang.Exception -> Ldf java.lang.Throwable -> L11d
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> Ldf java.lang.Throwable -> L11d
            java.lang.Object r6 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)     // Catch: java.lang.Exception -> Ldf java.lang.Throwable -> L11d
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> Ldf java.lang.Throwable -> L11d
            com.google.android.gms.net.CronetProviderInstaller.zze = r6     // Catch: java.lang.Exception -> Ldf java.lang.Throwable -> L11d
            if (r2 <= r0) goto Lce
            java.lang.String r4 = "cr"
            r5 = 2
            android.content.Intent r10 = r3.getErrorResolutionIntent(r10, r5, r4)     // Catch: java.lang.Throwable -> L11d
            if (r10 != 0) goto L9b
            java.lang.String r10 = com.google.android.gms.net.CronetProviderInstaller.zza     // Catch: java.lang.Throwable -> L11d
            java.lang.String r0 = "Unable to fetch error resolution intent"
            android.util.Log.e(r10, r0)     // Catch: java.lang.Throwable -> L11d
            com.google.android.gms.common.GooglePlayServicesNotAvailableException r10 = new com.google.android.gms.common.GooglePlayServicesNotAvailableException     // Catch: java.lang.Throwable -> L11d
            r10.<init>(r5)     // Catch: java.lang.Throwable -> L11d
            throw r10     // Catch: java.lang.Throwable -> L11d
        L9b:
            com.google.android.gms.common.GooglePlayServicesRepairableException r3 = new com.google.android.gms.common.GooglePlayServicesRepairableException     // Catch: java.lang.Throwable -> L11d
            java.lang.String r4 = com.google.android.gms.net.CronetProviderInstaller.zze     // Catch: java.lang.Throwable -> L11d
            java.lang.String r6 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L11d
            int r6 = r6.length()     // Catch: java.lang.Throwable -> L11d
            int r6 = r6 + 174
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11d
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L11d
            java.lang.String r6 = "Google Play Services update is required. The API Level of the client is "
            r7.append(r6)     // Catch: java.lang.Throwable -> L11d
            r7.append(r2)     // Catch: java.lang.Throwable -> L11d
            java.lang.String r2 = ". The API Level of the implementation is "
            r7.append(r2)     // Catch: java.lang.Throwable -> L11d
            r7.append(r0)     // Catch: java.lang.Throwable -> L11d
            java.lang.String r0 = ". The Cronet implementation version is "
            r7.append(r0)     // Catch: java.lang.Throwable -> L11d
            r7.append(r4)     // Catch: java.lang.Throwable -> L11d
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> L11d
            r3.<init>(r5, r0, r10)     // Catch: java.lang.Throwable -> L11d
            throw r3     // Catch: java.lang.Throwable -> L11d
        Lce:
            com.google.android.gms.net.CronetProviderInstaller.zzd = r5     // Catch: java.lang.Throwable -> L11d
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11d
            return
        Ld2:
            java.lang.String r10 = com.google.android.gms.net.CronetProviderInstaller.zza     // Catch: java.lang.Exception -> Ldf java.lang.Throwable -> L11d
            java.lang.String r0 = "ImplVersion class is missing from Cronet module."
            android.util.Log.e(r10, r0)     // Catch: java.lang.Exception -> Ldf java.lang.Throwable -> L11d
            com.google.android.gms.common.GooglePlayServicesNotAvailableException r10 = new com.google.android.gms.common.GooglePlayServicesNotAvailableException     // Catch: java.lang.Exception -> Ldf java.lang.Throwable -> L11d
            r10.<init>(r4)     // Catch: java.lang.Exception -> Ldf java.lang.Throwable -> L11d
            throw r10     // Catch: java.lang.Exception -> Ldf java.lang.Throwable -> L11d
        Ldf:
            r10 = move-exception
            java.lang.String r0 = com.google.android.gms.net.CronetProviderInstaller.zza     // Catch: java.lang.Throwable -> L11d
            java.lang.String r2 = "Unable to read Cronet version from the Cronet module "
            android.util.Log.e(r0, r2, r10)     // Catch: java.lang.Throwable -> L11d
            com.google.android.gms.common.GooglePlayServicesNotAvailableException r0 = new com.google.android.gms.common.GooglePlayServicesNotAvailableException     // Catch: java.lang.Throwable -> L11d
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L11d
            java.lang.Throwable r10 = r0.initCause(r10)     // Catch: java.lang.Throwable -> L11d
            com.google.android.gms.common.GooglePlayServicesNotAvailableException r10 = (com.google.android.gms.common.GooglePlayServicesNotAvailableException) r10     // Catch: java.lang.Throwable -> L11d
            throw r10     // Catch: java.lang.Throwable -> L11d
        Lf3:
            r10 = move-exception
            java.lang.String r0 = com.google.android.gms.net.CronetProviderInstaller.zza     // Catch: java.lang.Throwable -> L11d
            java.lang.String r2 = "Unable to load Cronet module"
            android.util.Log.e(r0, r2, r10)     // Catch: java.lang.Throwable -> L11d
            com.google.android.gms.common.GooglePlayServicesNotAvailableException r0 = new com.google.android.gms.common.GooglePlayServicesNotAvailableException     // Catch: java.lang.Throwable -> L11d
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L11d
            java.lang.Throwable r10 = r0.initCause(r10)     // Catch: java.lang.Throwable -> L11d
            com.google.android.gms.common.GooglePlayServicesNotAvailableException r10 = (com.google.android.gms.common.GooglePlayServicesNotAvailableException) r10     // Catch: java.lang.Throwable -> L11d
            throw r10     // Catch: java.lang.Throwable -> L11d
        L107:
            r10 = move-exception
            java.lang.String r0 = com.google.android.gms.net.CronetProviderInstaller.zza     // Catch: java.lang.Throwable -> L11d
            java.lang.String r2 = "Cronet API is not available. Have you included all required dependencies?"
            android.util.Log.e(r0, r2)     // Catch: java.lang.Throwable -> L11d
            com.google.android.gms.common.GooglePlayServicesNotAvailableException r0 = new com.google.android.gms.common.GooglePlayServicesNotAvailableException     // Catch: java.lang.Throwable -> L11d
            r2 = 10
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L11d
            java.lang.Throwable r10 = r0.initCause(r10)     // Catch: java.lang.Throwable -> L11d
            com.google.android.gms.common.GooglePlayServicesNotAvailableException r10 = (com.google.android.gms.common.GooglePlayServicesNotAvailableException) r10     // Catch: java.lang.Throwable -> L11d
            throw r10     // Catch: java.lang.Throwable -> L11d
        L11d:
            r10 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11d
            throw r10
    }
}
