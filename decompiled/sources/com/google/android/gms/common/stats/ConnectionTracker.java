package com.google.android.gms.common.stats;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public class ConnectionTracker {
    private static final java.lang.Object zzb = null;

    @javax.annotation.Nullable
    private static volatile com.google.android.gms.common.stats.ConnectionTracker zzc;

    @androidx.annotation.NonNull
    @com.google.android.gms.common.util.VisibleForTesting
    public java.util.concurrent.ConcurrentHashMap<android.content.ServiceConnection, android.content.ServiceConnection> zza;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.common.stats.ConnectionTracker.zzb = r0
            return
    }

    private ConnectionTracker() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.zza = r0
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.common.stats.ConnectionTracker getInstance() {
            com.google.android.gms.common.stats.ConnectionTracker r0 = com.google.android.gms.common.stats.ConnectionTracker.zzc
            if (r0 != 0) goto L17
            java.lang.Object r0 = com.google.android.gms.common.stats.ConnectionTracker.zzb
            monitor-enter(r0)
            com.google.android.gms.common.stats.ConnectionTracker r1 = com.google.android.gms.common.stats.ConnectionTracker.zzc     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L12
            com.google.android.gms.common.stats.ConnectionTracker r1 = new com.google.android.gms.common.stats.ConnectionTracker     // Catch: java.lang.Throwable -> L14
            r1.<init>()     // Catch: java.lang.Throwable -> L14
            com.google.android.gms.common.stats.ConnectionTracker.zzc = r1     // Catch: java.lang.Throwable -> L14
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
        L17:
            com.google.android.gms.common.stats.ConnectionTracker r0 = com.google.android.gms.common.stats.ConnectionTracker.zzc
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            return r0
    }

    private static void zzb(android.content.Context r0, android.content.ServiceConnection r1) {
            r0.unbindService(r1)     // Catch: java.lang.Throwable -> L3
        L3:
            return
    }

    private final boolean zzc(android.content.Context r4, java.lang.String r5, android.content.Intent r6, android.content.ServiceConnection r7, int r8, boolean r9, @javax.annotation.Nullable java.util.concurrent.Executor r10) {
            r3 = this;
            android.content.ComponentName r9 = r6.getComponent()
            java.lang.String r0 = "ConnectionTracker"
            r1 = 0
            if (r9 != 0) goto La
            goto L29
        La:
            java.lang.String r9 = r9.getPackageName()
            java.lang.String r2 = "com.google.android.gms"
            r2.equals(r9)
            com.google.android.gms.common.wrappers.PackageManagerWrapper r2 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L28
            android.content.pm.ApplicationInfo r9 = r2.getApplicationInfo(r9, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L28
            int r9 = r9.flags     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L28
            r2 = 2097152(0x200000, float:2.938736E-39)
            r9 = r9 & r2
            if (r9 == 0) goto L29
            java.lang.String r4 = "Attempted to bind to a service in a STOPPED package."
            android.util.Log.w(r0, r4)
            return r1
        L28:
        L29:
            boolean r9 = zzd(r7)
            if (r9 == 0) goto L67
            java.util.concurrent.ConcurrentHashMap<android.content.ServiceConnection, android.content.ServiceConnection> r9 = r3.zza
            java.lang.Object r9 = r9.putIfAbsent(r7, r7)
            android.content.ServiceConnection r9 = (android.content.ServiceConnection) r9
            if (r9 == 0) goto L53
            if (r7 == r9) goto L53
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r9[r1] = r7
            r2 = 1
            r9[r2] = r5
            r5 = 2
            java.lang.String r2 = r6.getAction()
            r9[r5] = r2
            java.lang.String r5 = "Duplicate binding with the same ServiceConnection: %s, %s, %s."
            java.lang.String r5 = java.lang.String.format(r5, r9)
            android.util.Log.w(r0, r5)
        L53:
            boolean r4 = zze(r4, r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L60
            if (r4 == 0) goto L5a
            goto L6b
        L5a:
            java.util.concurrent.ConcurrentHashMap<android.content.ServiceConnection, android.content.ServiceConnection> r4 = r3.zza
            r4.remove(r7, r7)
            return r1
        L60:
            r4 = move-exception
            java.util.concurrent.ConcurrentHashMap<android.content.ServiceConnection, android.content.ServiceConnection> r5 = r3.zza
            r5.remove(r7, r7)
            throw r4
        L67:
            boolean r4 = zze(r4, r6, r7, r8, r10)
        L6b:
            return r4
    }

    private static boolean zzd(android.content.ServiceConnection r0) {
            boolean r0 = r0 instanceof com.google.android.gms.common.internal.zzs
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    private static final boolean zze(android.content.Context r1, android.content.Intent r2, android.content.ServiceConnection r3, int r4, @javax.annotation.Nullable java.util.concurrent.Executor r5) {
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastQ()
            if (r0 == 0) goto Ld
            if (r5 == 0) goto Ld
            boolean r1 = r1.bindService(r2, r4, r5, r3)
            return r1
        Ld:
            boolean r1 = r1.bindService(r2, r3, r4)
            return r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean bindService(@androidx.annotation.NonNull android.content.Context r10, @androidx.annotation.NonNull android.content.Intent r11, @androidx.annotation.NonNull android.content.ServiceConnection r12, int r13) {
            r9 = this;
            java.lang.Class r0 = r10.getClass()
            java.lang.String r3 = r0.getName()
            r7 = 1
            r8 = 0
            r1 = r9
            r2 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            boolean r10 = r1.zzc(r2, r3, r4, r5, r6, r7, r8)
            return r10
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void unbindService(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull android.content.ServiceConnection r3) {
            r1 = this;
            boolean r0 = zzd(r3)
            if (r0 == 0) goto L26
            java.util.concurrent.ConcurrentHashMap<android.content.ServiceConnection, android.content.ServiceConnection> r0 = r1.zza
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L26
            java.util.concurrent.ConcurrentHashMap<android.content.ServiceConnection, android.content.ServiceConnection> r0 = r1.zza     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L1f
            android.content.ServiceConnection r0 = (android.content.ServiceConnection) r0     // Catch: java.lang.Throwable -> L1f
            zzb(r2, r0)     // Catch: java.lang.Throwable -> L1f
            java.util.concurrent.ConcurrentHashMap<android.content.ServiceConnection, android.content.ServiceConnection> r2 = r1.zza
            r2.remove(r3)
            return
        L1f:
            r2 = move-exception
            java.util.concurrent.ConcurrentHashMap<android.content.ServiceConnection, android.content.ServiceConnection> r0 = r1.zza
            r0.remove(r3)
            throw r2
        L26:
            zzb(r2, r3)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void unbindServiceSafe(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull android.content.ServiceConnection r2) {
            r0 = this;
            r0.unbindService(r1, r2)     // Catch: java.lang.IllegalArgumentException -> L3
        L3:
            return
    }

    public final boolean zza(@androidx.annotation.NonNull android.content.Context r9, @androidx.annotation.NonNull java.lang.String r10, @androidx.annotation.NonNull android.content.Intent r11, @androidx.annotation.NonNull android.content.ServiceConnection r12, int r13, @javax.annotation.Nullable java.util.concurrent.Executor r14) {
            r8 = this;
            r6 = 1
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r7 = r14
            boolean r9 = r0.zzc(r1, r2, r3, r4, r5, r6, r7)
            return r9
    }
}
