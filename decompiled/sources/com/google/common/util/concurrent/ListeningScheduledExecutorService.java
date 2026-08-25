package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
public interface ListeningScheduledExecutorService extends java.util.concurrent.ScheduledExecutorService, com.google.common.util.concurrent.ListeningExecutorService {

    /* JADX INFO: renamed from: com.google.common.util.concurrent.ListeningScheduledExecutorService$-CC, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public final /* synthetic */ class CC {
        public static /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture $default$schedule(com.google.common.util.concurrent.ListeningScheduledExecutorService r0, java.lang.Runnable r1, long r2, java.util.concurrent.TimeUnit r4) {
                com.google.common.util.concurrent.ListenableScheduledFuture r0 = r0.schedule(r1, r2, r4)
                return r0
        }

        public static /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture $default$schedule(com.google.common.util.concurrent.ListeningScheduledExecutorService r0, java.util.concurrent.Callable r1, long r2, java.util.concurrent.TimeUnit r4) {
                com.google.common.util.concurrent.ListenableScheduledFuture r0 = r0.schedule(r1, r2, r4)
                return r0
        }

        public static /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture $default$scheduleAtFixedRate(com.google.common.util.concurrent.ListeningScheduledExecutorService r0, java.lang.Runnable r1, long r2, long r4, java.util.concurrent.TimeUnit r6) {
                com.google.common.util.concurrent.ListenableScheduledFuture r0 = r0.scheduleAtFixedRate(r1, r2, r4, r6)
                return r0
        }

        public static /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture $default$scheduleWithFixedDelay(com.google.common.util.concurrent.ListeningScheduledExecutorService r0, java.lang.Runnable r1, long r2, long r4, java.util.concurrent.TimeUnit r6) {
                com.google.common.util.concurrent.ListenableScheduledFuture r0 = r0.scheduleWithFixedDelay(r1, r2, r4, r6)
                return r0
        }
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    com.google.common.util.concurrent.ListenableScheduledFuture<?> schedule(java.lang.Runnable r1, long r2, java.util.concurrent.TimeUnit r4);

    @Override // java.util.concurrent.ScheduledExecutorService
    <V> com.google.common.util.concurrent.ListenableScheduledFuture<V> schedule(java.util.concurrent.Callable<V> r1, long r2, java.util.concurrent.TimeUnit r4);

    @Override // java.util.concurrent.ScheduledExecutorService
    /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture schedule(java.lang.Runnable r1, long r2, java.util.concurrent.TimeUnit r4);

    @Override // java.util.concurrent.ScheduledExecutorService
    /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture schedule(java.util.concurrent.Callable r1, long r2, java.util.concurrent.TimeUnit r4);

    @Override // java.util.concurrent.ScheduledExecutorService
    com.google.common.util.concurrent.ListenableScheduledFuture<?> scheduleAtFixedRate(java.lang.Runnable r1, long r2, long r4, java.util.concurrent.TimeUnit r6);

    @Override // java.util.concurrent.ScheduledExecutorService
    /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture scheduleAtFixedRate(java.lang.Runnable r1, long r2, long r4, java.util.concurrent.TimeUnit r6);

    @Override // java.util.concurrent.ScheduledExecutorService
    com.google.common.util.concurrent.ListenableScheduledFuture<?> scheduleWithFixedDelay(java.lang.Runnable r1, long r2, long r4, java.util.concurrent.TimeUnit r6);

    @Override // java.util.concurrent.ScheduledExecutorService
    /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture scheduleWithFixedDelay(java.lang.Runnable r1, long r2, long r4, java.util.concurrent.TimeUnit r6);
}
