package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.CanIgnoreReturnValue
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
public abstract class ForwardingExecutorService extends com.google.common.collect.ForwardingObject implements java.util.concurrent.ExecutorService {
    public ForwardingExecutorService() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long r2, java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate()
            boolean r2 = r0.awaitTermination(r2, r4)
            return r2
    }

    @Override // com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingObject
    public abstract java.util.concurrent.ExecutorService delegate();

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable r2) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate()
            r0.execute(r2)
            return
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> r2) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate()
            java.util.List r2 = r0.invokeAll(r2)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> r2, long r3, java.util.concurrent.TimeUnit r5) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate()
            java.util.List r2 = r0.invokeAll(r2, r3, r5)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(java.util.Collection<? extends java.util.concurrent.Callable<T>> r2) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate()
            java.lang.Object r2 = r0.invokeAny(r2)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(java.util.Collection<? extends java.util.concurrent.Callable<T>> r2, long r3, java.util.concurrent.TimeUnit r5) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate()
            java.lang.Object r2 = r0.invokeAny(r2, r3, r5)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate()
            boolean r0 = r0.isShutdown()
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate()
            boolean r0 = r0.isTerminated()
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate()
            r0.shutdown()
            return
    }

    @Override // java.util.concurrent.ExecutorService
    public java.util.List<java.lang.Runnable> shutdownNow() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate()
            java.util.List r0 = r0.shutdownNow()
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public java.util.concurrent.Future<?> submit(java.lang.Runnable r2) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate()
            java.util.concurrent.Future r2 = r0.submit(r2)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> java.util.concurrent.Future<T> submit(java.lang.Runnable r2, @com.google.common.util.concurrent.ParametricNullness T r3) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate()
            java.util.concurrent.Future r2 = r0.submit(r2, r3)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> java.util.concurrent.Future<T> submit(java.util.concurrent.Callable<T> r2) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate()
            java.util.concurrent.Future r2 = r0.submit(r2)
            return r2
    }
}
