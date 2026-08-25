package com.google.android.gms.common.providers;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zza implements com.google.android.gms.common.providers.PooledExecutorsProvider.PooledExecutorFactory {
    public zza() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.providers.PooledExecutorsProvider.PooledExecutorFactory
    public final java.util.concurrent.ScheduledExecutorService newSingleThreadScheduledExecutor() {
            r1 = this;
            com.google.android.gms.internal.common.zzh.zza()
            r0 = 1
            java.util.concurrent.ScheduledExecutorService r0 = java.util.concurrent.Executors.newScheduledThreadPool(r0)
            java.util.concurrent.ScheduledExecutorService r0 = java.util.concurrent.Executors.unconfigurableScheduledExecutorService(r0)
            return r0
    }
}
