package com.google.android.gms.common.providers;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.annotation.KeepForSdk
@java.lang.Deprecated
public class PooledExecutorsProvider {
    private static com.google.android.gms.common.providers.PooledExecutorsProvider.PooledExecutorFactory zza;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    /* JADX INFO: loaded from: classes3.dex */
    public interface PooledExecutorFactory {
        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        @java.lang.Deprecated
        java.util.concurrent.ScheduledExecutorService newSingleThreadScheduledExecutor();
    }

    private PooledExecutorsProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public static synchronized com.google.android.gms.common.providers.PooledExecutorsProvider.PooledExecutorFactory getInstance() {
            java.lang.Class<com.google.android.gms.common.providers.PooledExecutorsProvider> r0 = com.google.android.gms.common.providers.PooledExecutorsProvider.class
            monitor-enter(r0)
            com.google.android.gms.common.providers.PooledExecutorsProvider$PooledExecutorFactory r1 = com.google.android.gms.common.providers.PooledExecutorsProvider.zza     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto Le
            com.google.android.gms.common.providers.zza r1 = new com.google.android.gms.common.providers.zza     // Catch: java.lang.Throwable -> L12
            r1.<init>()     // Catch: java.lang.Throwable -> L12
            com.google.android.gms.common.providers.PooledExecutorsProvider.zza = r1     // Catch: java.lang.Throwable -> L12
        Le:
            com.google.android.gms.common.providers.PooledExecutorsProvider$PooledExecutorFactory r1 = com.google.android.gms.common.providers.PooledExecutorsProvider.zza     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)
            return r1
        L12:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }
}
