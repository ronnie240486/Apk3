package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes3.dex */
@com.google.errorprone.annotations.CanIgnoreReturnValue
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
abstract class WrappingScheduledExecutorService extends com.google.common.util.concurrent.WrappingExecutorService implements java.util.concurrent.ScheduledExecutorService {
    public final java.util.concurrent.ScheduledExecutorService delegate;

    public WrappingScheduledExecutorService(java.util.concurrent.ScheduledExecutorService r1) {
            r0 = this;
            r0.<init>(r1)
            r0.delegate = r1
            return
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final java.util.concurrent.ScheduledFuture<?> schedule(java.lang.Runnable r2, long r3, java.util.concurrent.TimeUnit r5) {
            r1 = this;
            java.util.concurrent.ScheduledExecutorService r0 = r1.delegate
            java.lang.Runnable r2 = r1.wrapTask(r2)
            java.util.concurrent.ScheduledFuture r2 = r0.schedule(r2, r3, r5)
            return r2
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final <V> java.util.concurrent.ScheduledFuture<V> schedule(java.util.concurrent.Callable<V> r2, long r3, java.util.concurrent.TimeUnit r5) {
            r1 = this;
            java.util.concurrent.ScheduledExecutorService r0 = r1.delegate
            java.util.concurrent.Callable r2 = r1.wrapTask(r2)
            java.util.concurrent.ScheduledFuture r2 = r0.schedule(r2, r3, r5)
            return r2
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final java.util.concurrent.ScheduledFuture<?> scheduleAtFixedRate(java.lang.Runnable r8, long r9, long r11, java.util.concurrent.TimeUnit r13) {
            r7 = this;
            java.util.concurrent.ScheduledExecutorService r0 = r7.delegate
            java.lang.Runnable r1 = r7.wrapTask(r8)
            r2 = r9
            r4 = r11
            r6 = r13
            java.util.concurrent.ScheduledFuture r8 = r0.scheduleAtFixedRate(r1, r2, r4, r6)
            return r8
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final java.util.concurrent.ScheduledFuture<?> scheduleWithFixedDelay(java.lang.Runnable r8, long r9, long r11, java.util.concurrent.TimeUnit r13) {
            r7 = this;
            java.util.concurrent.ScheduledExecutorService r0 = r7.delegate
            java.lang.Runnable r1 = r7.wrapTask(r8)
            r2 = r9
            r4 = r11
            r6 = r13
            java.util.concurrent.ScheduledFuture r8 = r0.scheduleWithFixedDelay(r1, r2, r4, r6)
            return r8
    }
}
