package com.google.android.gms.common.config;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public abstract class GservicesValue<T> {
    private static final java.lang.Object zzc = null;

    @androidx.annotation.NonNull
    public final java.lang.String zza;

    @androidx.annotation.NonNull
    public final T zzb;

    @androidx.annotation.Nullable
    private T zzd;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.common.config.GservicesValue.zzc = r0
            return
    }

    public GservicesValue(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull T r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zzd = r0
            r1.zza = r2
            r1.zzb = r3
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isInitialized() {
            java.lang.Object r0 = com.google.android.gms.common.config.GservicesValue.zzc
            monitor-enter(r0)
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6
            r0 = 0
            return r0
        L6:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6
            throw r1
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.common.config.GservicesValue<java.lang.Float> value(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.lang.Float r2) {
            com.google.android.gms.common.config.zzd r0 = new com.google.android.gms.common.config.zzd
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.common.config.GservicesValue<java.lang.Integer> value(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.lang.Integer r2) {
            com.google.android.gms.common.config.zzc r0 = new com.google.android.gms.common.config.zzc
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.common.config.GservicesValue<java.lang.Long> value(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.lang.Long r2) {
            com.google.android.gms.common.config.zzb r0 = new com.google.android.gms.common.config.zzb
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.common.config.GservicesValue<java.lang.String> value(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.lang.String r2) {
            com.google.android.gms.common.config.zze r0 = new com.google.android.gms.common.config.zze
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.common.config.GservicesValue<java.lang.Boolean> value(@androidx.annotation.NonNull java.lang.String r1, boolean r2) {
            com.google.android.gms.common.config.zza r0 = new com.google.android.gms.common.config.zza
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public final T get() {
            r4 = this;
            T r0 = r4.zzd
            if (r0 == 0) goto L5
            return r0
        L5:
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()
            java.lang.Object r1 = com.google.android.gms.common.config.GservicesValue.zzc
            monitor-enter(r1)
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L34
            monitor-enter(r1)
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L31
            java.lang.Object r1 = r4.zza()     // Catch: java.lang.Throwable -> L17 java.lang.SecurityException -> L19
            android.os.StrictMode.setThreadPolicy(r0)
            return r1
        L17:
            r1 = move-exception
            goto L2d
        L19:
            long r1 = android.os.Binder.clearCallingIdentity()     // Catch: java.lang.Throwable -> L17
            java.lang.Object r3 = r4.zza()     // Catch: java.lang.Throwable -> L28
            android.os.Binder.restoreCallingIdentity(r1)     // Catch: java.lang.Throwable -> L17
            android.os.StrictMode.setThreadPolicy(r0)
            return r3
        L28:
            r3 = move-exception
            android.os.Binder.restoreCallingIdentity(r1)     // Catch: java.lang.Throwable -> L17
            throw r3     // Catch: java.lang.Throwable -> L17
        L2d:
            android.os.StrictMode.setThreadPolicy(r0)
            throw r1
        L31:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L31
            throw r0
        L34:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L34
            throw r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public final T getBinderSafe() {
            r1 = this;
            java.lang.Object r0 = r1.get()
            return r0
    }

    @com.google.android.gms.common.util.VisibleForTesting
    @com.google.android.gms.common.annotation.KeepForSdk
    public void override(@androidx.annotation.NonNull T r3) {
            r2 = this;
            java.lang.String r0 = "GservicesValue"
            java.lang.String r1 = "GservicesValue.override(): test should probably call initForTests() first"
            android.util.Log.w(r0, r1)
            r2.zzd = r3
            java.lang.Object r3 = com.google.android.gms.common.config.GservicesValue.zzc
            monitor-enter(r3)
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L13
            return
        L10:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L10
            throw r0     // Catch: java.lang.Throwable -> L13
        L13:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L13
            throw r0
    }

    @com.google.android.gms.common.util.VisibleForTesting
    @com.google.android.gms.common.annotation.KeepForSdk
    public void resetOverride() {
            r1 = this;
            r0 = 0
            r1.zzd = r0
            return
    }

    @androidx.annotation.NonNull
    public abstract java.lang.Object zza();
}
