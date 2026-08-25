package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes2.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public final class BackgroundDetector implements android.app.Application.ActivityLifecycleCallbacks, android.content.ComponentCallbacks2 {
    private static final com.google.android.gms.common.api.internal.BackgroundDetector zza = null;
    private final java.util.concurrent.atomic.AtomicBoolean zzb;
    private final java.util.concurrent.atomic.AtomicBoolean zzc;

    @javax.annotation.concurrent.GuardedBy("sInstance")
    private final java.util.ArrayList<com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener> zzd;

    @javax.annotation.concurrent.GuardedBy("sInstance")
    private boolean zze;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    /* JADX INFO: loaded from: classes.dex */
    @com.google.android.gms.common.annotation.KeepForSdk
    public interface BackgroundStateChangeListener {
        @com.google.android.gms.common.annotation.KeepForSdk
        void onBackgroundStateChanged(boolean r1);
    }

    static {
            com.google.android.gms.common.api.internal.BackgroundDetector r0 = new com.google.android.gms.common.api.internal.BackgroundDetector
            r0.<init>()
            com.google.android.gms.common.api.internal.BackgroundDetector.zza = r0
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    private BackgroundDetector() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r1.zzb = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r1.zzc = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.zzd = r0
            r0 = 0
            r1.zze = r0
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.common.api.internal.BackgroundDetector getInstance() {
            com.google.android.gms.common.api.internal.BackgroundDetector r0 = com.google.android.gms.common.api.internal.BackgroundDetector.zza
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void initialize(@androidx.annotation.NonNull android.app.Application r2) {
            com.google.android.gms.common.api.internal.BackgroundDetector r0 = com.google.android.gms.common.api.internal.BackgroundDetector.zza
            monitor-enter(r0)
            boolean r1 = r0.zze     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L10
            r2.registerActivityLifecycleCallbacks(r0)     // Catch: java.lang.Throwable -> L12
            r2.registerComponentCallbacks(r0)     // Catch: java.lang.Throwable -> L12
            r2 = 1
            r0.zze = r2     // Catch: java.lang.Throwable -> L12
        L10:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r2
    }

    private final void zza(boolean r4) {
            r3 = this;
            com.google.android.gms.common.api.internal.BackgroundDetector r0 = com.google.android.gms.common.api.internal.BackgroundDetector.zza
            monitor-enter(r0)
            java.util.ArrayList<com.google.android.gms.common.api.internal.BackgroundDetector$BackgroundStateChangeListener> r1 = r3.zzd     // Catch: java.lang.Throwable -> L1b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1b
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L19
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L1b
            com.google.android.gms.common.api.internal.BackgroundDetector$BackgroundStateChangeListener r2 = (com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener) r2     // Catch: java.lang.Throwable -> L1b
            r2.onBackgroundStateChanged(r4)     // Catch: java.lang.Throwable -> L1b
            goto L9
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return
        L1b:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r4
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void addListener(@androidx.annotation.NonNull com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.BackgroundDetector r0 = com.google.android.gms.common.api.internal.BackgroundDetector.zza
            monitor-enter(r0)
            java.util.ArrayList<com.google.android.gms.common.api.internal.BackgroundDetector$BackgroundStateChangeListener> r1 = r2.zzd     // Catch: java.lang.Throwable -> La
            r1.add(r3)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean isInBackground() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.zzb
            boolean r0 = r0.get()
            return r0
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@androidx.annotation.NonNull android.app.Activity r3, @androidx.annotation.Nullable android.os.Bundle r4) {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r3 = r2.zzb
            r4 = 1
            r0 = 0
            boolean r3 = r3.compareAndSet(r4, r0)
            java.util.concurrent.atomic.AtomicBoolean r1 = r2.zzc
            r1.set(r4)
            if (r3 == 0) goto L12
            r2.zza(r0)
        L12:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@androidx.annotation.NonNull android.app.Activity r1) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@androidx.annotation.NonNull android.app.Activity r1) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@androidx.annotation.NonNull android.app.Activity r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r4 = r3.zzb
            r0 = 1
            r1 = 0
            boolean r4 = r4.compareAndSet(r0, r1)
            java.util.concurrent.atomic.AtomicBoolean r2 = r3.zzc
            r2.set(r0)
            if (r4 == 0) goto L12
            r3.zza(r1)
        L12:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@androidx.annotation.NonNull android.app.Activity r1, @androidx.annotation.NonNull android.os.Bundle r2) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@androidx.annotation.NonNull android.app.Activity r1) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@androidx.annotation.NonNull android.app.Activity r1) {
            r0 = this;
            return
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(@androidx.annotation.NonNull android.content.res.Configuration r1) {
            r0 = this;
            return
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
            r0 = this;
            return
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int r3) {
            r2 = this;
            r0 = 20
            if (r3 != r0) goto L16
            java.util.concurrent.atomic.AtomicBoolean r3 = r2.zzb
            r0 = 0
            r1 = 1
            boolean r3 = r3.compareAndSet(r0, r1)
            if (r3 == 0) goto L16
            java.util.concurrent.atomic.AtomicBoolean r3 = r2.zzc
            r3.set(r1)
            r2.zza(r1)
        L16:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @android.annotation.TargetApi(16)
    public boolean readCurrentStateIfPossible(boolean r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.zzc
            boolean r0 = r0.get()
            if (r0 != 0) goto L2c
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBean()
            if (r0 == 0) goto L2b
            android.app.ActivityManager$RunningAppProcessInfo r3 = new android.app.ActivityManager$RunningAppProcessInfo
            r3.<init>()
            android.app.ActivityManager.getMyMemoryState(r3)
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.zzc
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 != 0) goto L2c
            int r3 = r3.importance
            r0 = 100
            if (r3 <= r0) goto L2c
            java.util.concurrent.atomic.AtomicBoolean r3 = r2.zzb
            r3.set(r1)
            goto L2c
        L2b:
            return r3
        L2c:
            boolean r3 = r2.isInBackground()
            return r3
    }
}
