package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.DoNotMock("Use TestingExecutors.sameThreadScheduledExecutor, or wrap a real Executor from java.util.concurrent.Executors with MoreExecutors.listeningDecorator")
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
public interface ListeningExecutorService extends java.util.concurrent.ExecutorService {

    /* JADX INFO: renamed from: com.google.common.util.concurrent.ListeningExecutorService$-CC, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public final /* synthetic */ class CC {
        public static /* bridge */ /* synthetic */ java.util.concurrent.Future $default$submit(com.google.common.util.concurrent.ListeningExecutorService r0, java.lang.Runnable r1) {
                com.google.common.util.concurrent.ListenableFuture r0 = r0.submit(r1)
                return r0
        }

        public static /* bridge */ /* synthetic */ java.util.concurrent.Future $default$submit(com.google.common.util.concurrent.ListeningExecutorService r0, java.lang.Runnable r1, @com.google.common.util.concurrent.ParametricNullness java.lang.Object r2) {
                com.google.common.util.concurrent.ListenableFuture r0 = r0.submit(r1, r2)
                return r0
        }

        public static /* bridge */ /* synthetic */ java.util.concurrent.Future $default$submit(com.google.common.util.concurrent.ListeningExecutorService r0, java.util.concurrent.Callable r1) {
                com.google.common.util.concurrent.ListenableFuture r0 = r0.submit(r1)
                return r0
        }
    }

    @Override // java.util.concurrent.ExecutorService
    <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> r1) throws java.lang.InterruptedException;

    @Override // java.util.concurrent.ExecutorService
    <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> r1, long r2, java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException;

    com.google.common.util.concurrent.ListenableFuture<?> submit(java.lang.Runnable r1);

    <T> com.google.common.util.concurrent.ListenableFuture<T> submit(java.lang.Runnable r1, @com.google.common.util.concurrent.ParametricNullness T r2);

    <T> com.google.common.util.concurrent.ListenableFuture<T> submit(java.util.concurrent.Callable<T> r1);

    /* bridge */ /* synthetic */ java.util.concurrent.Future submit(java.lang.Runnable r1);

    /* bridge */ /* synthetic */ java.util.concurrent.Future submit(java.lang.Runnable r1, @com.google.common.util.concurrent.ParametricNullness java.lang.Object r2);

    /* bridge */ /* synthetic */ java.util.concurrent.Future submit(java.util.concurrent.Callable r1);
}
