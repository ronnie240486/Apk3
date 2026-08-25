package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes2.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public abstract class GmsClientSupervisor {

    @androidx.annotation.Nullable
    @com.google.android.gms.common.util.VisibleForTesting
    public static android.os.HandlerThread zza = null;
    private static int zzb = 4225;
    private static final java.lang.Object zzc = null;

    @androidx.annotation.Nullable
    private static com.google.android.gms.common.internal.zzr zzd;
    private static boolean zze;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.common.internal.GmsClientSupervisor.zzc = r0
            return
    }

    public GmsClientSupervisor() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static int getDefaultBindFlags() {
            int r0 = com.google.android.gms.common.internal.GmsClientSupervisor.zzb
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.common.internal.GmsClientSupervisor getInstance(@androidx.annotation.NonNull android.content.Context r4) {
            java.lang.Object r0 = com.google.android.gms.common.internal.GmsClientSupervisor.zzc
            monitor-enter(r0)
            com.google.android.gms.common.internal.zzr r1 = com.google.android.gms.common.internal.GmsClientSupervisor.zzd     // Catch: java.lang.Throwable -> L27
            if (r1 != 0) goto L23
            com.google.android.gms.common.internal.zzr r1 = new com.google.android.gms.common.internal.zzr     // Catch: java.lang.Throwable -> L27
            android.content.Context r2 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L27
            boolean r3 = com.google.android.gms.common.internal.GmsClientSupervisor.zze     // Catch: java.lang.Throwable -> L27
            if (r3 == 0) goto L1a
            android.os.HandlerThread r4 = getOrStartHandlerThread()     // Catch: java.lang.Throwable -> L27
            android.os.Looper r4 = r4.getLooper()     // Catch: java.lang.Throwable -> L27
            goto L1e
        L1a:
            android.os.Looper r4 = r4.getMainLooper()     // Catch: java.lang.Throwable -> L27
        L1e:
            r1.<init>(r2, r4)     // Catch: java.lang.Throwable -> L27
            com.google.android.gms.common.internal.GmsClientSupervisor.zzd = r1     // Catch: java.lang.Throwable -> L27
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            com.google.android.gms.common.internal.zzr r4 = com.google.android.gms.common.internal.GmsClientSupervisor.zzd
            return r4
        L27:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            throw r4
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static android.os.HandlerThread getOrStartHandlerThread() {
            java.lang.Object r0 = com.google.android.gms.common.internal.GmsClientSupervisor.zzc
            monitor-enter(r0)
            android.os.HandlerThread r1 = com.google.android.gms.common.internal.GmsClientSupervisor.zza     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return r1
        L9:
            android.os.HandlerThread r1 = new android.os.HandlerThread     // Catch: java.lang.Throwable -> L1b
            java.lang.String r2 = "GoogleApiHandler"
            r3 = 9
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L1b
            com.google.android.gms.common.internal.GmsClientSupervisor.zza = r1     // Catch: java.lang.Throwable -> L1b
            r1.start()     // Catch: java.lang.Throwable -> L1b
            android.os.HandlerThread r1 = com.google.android.gms.common.internal.GmsClientSupervisor.zza     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return r1
        L1b:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void setUseHandlerThreadForCallbacks() {
            java.lang.Object r0 = com.google.android.gms.common.internal.GmsClientSupervisor.zzc
            monitor-enter(r0)
            com.google.android.gms.common.internal.zzr r1 = com.google.android.gms.common.internal.GmsClientSupervisor.zzd     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L16
            boolean r2 = com.google.android.gms.common.internal.GmsClientSupervisor.zze     // Catch: java.lang.Throwable -> L1b
            if (r2 != 0) goto L16
            android.os.HandlerThread r2 = getOrStartHandlerThread()     // Catch: java.lang.Throwable -> L1b
            android.os.Looper r2 = r2.getLooper()     // Catch: java.lang.Throwable -> L1b
            r1.zzi(r2)     // Catch: java.lang.Throwable -> L1b
        L16:
            r1 = 1
            com.google.android.gms.common.internal.GmsClientSupervisor.zze = r1     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return
        L1b:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean bindService(@androidx.annotation.NonNull android.content.ComponentName r3, @androidx.annotation.NonNull android.content.ServiceConnection r4, @androidx.annotation.NonNull java.lang.String r5) {
            r2 = this;
            com.google.android.gms.common.internal.zzn r0 = new com.google.android.gms.common.internal.zzn
            int r1 = getDefaultBindFlags()
            r0.<init>(r3, r1)
            r3 = 0
            boolean r3 = r2.zzc(r0, r4, r5, r3)
            return r3
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean bindService(@androidx.annotation.NonNull java.lang.String r4, @androidx.annotation.NonNull android.content.ServiceConnection r5, @androidx.annotation.NonNull java.lang.String r6) {
            r3 = this;
            com.google.android.gms.common.internal.zzn r0 = new com.google.android.gms.common.internal.zzn
            int r1 = getDefaultBindFlags()
            r2 = 0
            r0.<init>(r4, r1, r2)
            r4 = 0
            boolean r4 = r3.zzc(r0, r5, r6, r4)
            return r4
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void unbindService(@androidx.annotation.NonNull android.content.ComponentName r3, @androidx.annotation.NonNull android.content.ServiceConnection r4, @androidx.annotation.NonNull java.lang.String r5) {
            r2 = this;
            com.google.android.gms.common.internal.zzn r0 = new com.google.android.gms.common.internal.zzn
            int r1 = getDefaultBindFlags()
            r0.<init>(r3, r1)
            r2.zza(r0, r4, r5)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void unbindService(@androidx.annotation.NonNull java.lang.String r4, @androidx.annotation.NonNull android.content.ServiceConnection r5, @androidx.annotation.NonNull java.lang.String r6) {
            r3 = this;
            com.google.android.gms.common.internal.zzn r0 = new com.google.android.gms.common.internal.zzn
            int r1 = getDefaultBindFlags()
            r2 = 0
            r0.<init>(r4, r1, r2)
            r3.zza(r0, r5, r6)
            return
    }

    public abstract void zza(com.google.android.gms.common.internal.zzn r1, android.content.ServiceConnection r2, java.lang.String r3);

    public final void zzb(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.String r3, int r4, @androidx.annotation.NonNull android.content.ServiceConnection r5, @androidx.annotation.NonNull java.lang.String r6, boolean r7) {
            r1 = this;
            com.google.android.gms.common.internal.zzn r0 = new com.google.android.gms.common.internal.zzn
            r0.<init>(r2, r3, r4, r7)
            r1.zza(r0, r5, r6)
            return
    }

    public abstract boolean zzc(com.google.android.gms.common.internal.zzn r1, android.content.ServiceConnection r2, java.lang.String r3, @androidx.annotation.Nullable java.util.concurrent.Executor r4);
}
