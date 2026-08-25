package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.CanIgnoreReturnValue
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
abstract class WrappingExecutorService implements java.util.concurrent.ExecutorService {
    private final java.util.concurrent.ExecutorService delegate;


    public WrappingExecutorService(java.util.concurrent.ExecutorService r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.util.concurrent.ExecutorService r1 = (java.util.concurrent.ExecutorService) r1
            r0.delegate = r1
            return
    }

    private <T> com.google.common.collect.ImmutableList<java.util.concurrent.Callable<T>> wrapTasks(java.util.Collection<? extends java.util.concurrent.Callable<T>> r3) {
            r2 = this;
            com.google.common.collect.ImmutableList$Builder r0 = com.google.common.collect.ImmutableList.builder()
            java.util.Iterator r3 = r3.iterator()
        L8:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r3.next()
            java.util.concurrent.Callable r1 = (java.util.concurrent.Callable) r1
            java.util.concurrent.Callable r1 = r2.wrapTask(r1)
            r0.add(r1)
            goto L8
        L1c:
            com.google.common.collect.ImmutableList r3 = r0.build()
            return r3
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long r2, java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            boolean r2 = r0.awaitTermination(r2, r4)
            return r2
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r2) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            java.lang.Runnable r2 = r1.wrapTask(r2)
            r0.execute(r2)
            return
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> r2) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            com.google.common.collect.ImmutableList r2 = r1.wrapTasks(r2)
            java.util.List r2 = r0.invokeAll(r2)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> r2, long r3, java.util.concurrent.TimeUnit r5) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            com.google.common.collect.ImmutableList r2 = r1.wrapTasks(r2)
            java.util.List r2 = r0.invokeAll(r2, r3, r5)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(java.util.Collection<? extends java.util.concurrent.Callable<T>> r2) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            com.google.common.collect.ImmutableList r2 = r1.wrapTasks(r2)
            java.lang.Object r2 = r0.invokeAny(r2)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(java.util.Collection<? extends java.util.concurrent.Callable<T>> r2, long r3, java.util.concurrent.TimeUnit r5) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            com.google.common.collect.ImmutableList r2 = r1.wrapTasks(r2)
            java.lang.Object r2 = r0.invokeAny(r2, r3, r5)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            boolean r0 = r0.isShutdown()
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            boolean r0 = r0.isTerminated()
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            r0.shutdown()
            return
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List<java.lang.Runnable> shutdownNow() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            java.util.List r0 = r0.shutdownNow()
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.concurrent.Future<?> submit(java.lang.Runnable r2) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            java.lang.Runnable r2 = r1.wrapTask(r2)
            java.util.concurrent.Future r2 = r0.submit(r2)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> java.util.concurrent.Future<T> submit(java.lang.Runnable r2, @com.google.common.util.concurrent.ParametricNullness T r3) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            java.lang.Runnable r2 = r1.wrapTask(r2)
            java.util.concurrent.Future r2 = r0.submit(r2, r3)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> java.util.concurrent.Future<T> submit(java.util.concurrent.Callable<T> r2) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            java.util.concurrent.Callable r2 = (java.util.concurrent.Callable) r2
            java.util.concurrent.Callable r2 = r1.wrapTask(r2)
            java.util.concurrent.Future r2 = r0.submit(r2)
            return r2
    }

    public java.lang.Runnable wrapTask(java.lang.Runnable r2) {
            r1 = this;
            r0 = 0
            java.util.concurrent.Callable r2 = java.util.concurrent.Executors.callable(r2, r0)
            java.util.concurrent.Callable r2 = r1.wrapTask(r2)
            com.google.common.util.concurrent.WrappingExecutorService$1 r0 = new com.google.common.util.concurrent.WrappingExecutorService$1
            r0.<init>(r2)
            return r0
    }

    public abstract <T> java.util.concurrent.Callable<T> wrapTask(java.util.concurrent.Callable<T> r1);
}
