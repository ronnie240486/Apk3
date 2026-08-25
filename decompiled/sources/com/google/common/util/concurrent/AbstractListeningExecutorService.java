package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.Beta
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
@com.google.errorprone.annotations.CanIgnoreReturnValue
public abstract class AbstractListeningExecutorService extends java.util.concurrent.AbstractExecutorService implements com.google.common.util.concurrent.ListeningExecutorService {
    public AbstractListeningExecutorService() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final <T> java.util.concurrent.RunnableFuture<T> newTaskFor(java.lang.Runnable r1, @com.google.common.util.concurrent.ParametricNullness T r2) {
            r0 = this;
            com.google.common.util.concurrent.TrustedListenableFutureTask r1 = com.google.common.util.concurrent.TrustedListenableFutureTask.create(r1, r2)
            return r1
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final <T> java.util.concurrent.RunnableFuture<T> newTaskFor(java.util.concurrent.Callable<T> r2) {
            r1 = this;
            com.google.common.util.concurrent.TrustedListenableFutureTask r0 = new com.google.common.util.concurrent.TrustedListenableFutureTask
            r0.<init>(r2)
            return r0
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.common.util.concurrent.ListeningExecutorService
    public com.google.common.util.concurrent.ListenableFuture<?> submit(java.lang.Runnable r1) {
            r0 = this;
            java.util.concurrent.Future r1 = super.submit(r1)
            com.google.common.util.concurrent.ListenableFuture r1 = (com.google.common.util.concurrent.ListenableFuture) r1
            return r1
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.common.util.concurrent.ListeningExecutorService
    public <T> com.google.common.util.concurrent.ListenableFuture<T> submit(java.lang.Runnable r1, @com.google.common.util.concurrent.ParametricNullness T r2) {
            r0 = this;
            java.util.concurrent.Future r1 = super.submit(r1, r2)
            com.google.common.util.concurrent.ListenableFuture r1 = (com.google.common.util.concurrent.ListenableFuture) r1
            return r1
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.common.util.concurrent.ListeningExecutorService
    public <T> com.google.common.util.concurrent.ListenableFuture<T> submit(java.util.concurrent.Callable<T> r1) {
            r0 = this;
            java.util.concurrent.Future r1 = super.submit(r1)
            com.google.common.util.concurrent.ListenableFuture r1 = (com.google.common.util.concurrent.ListenableFuture) r1
            return r1
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.common.util.concurrent.ListeningExecutorService
    public /* bridge */ /* synthetic */ java.util.concurrent.Future submit(java.lang.Runnable r1) {
            r0 = this;
            com.google.common.util.concurrent.ListenableFuture r1 = r0.submit(r1)
            return r1
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.common.util.concurrent.ListeningExecutorService
    public /* bridge */ /* synthetic */ java.util.concurrent.Future submit(java.lang.Runnable r1, @com.google.common.util.concurrent.ParametricNullness java.lang.Object r2) {
            r0 = this;
            com.google.common.util.concurrent.ListenableFuture r1 = r0.submit(r1, r2)
            return r1
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.common.util.concurrent.ListeningExecutorService
    public /* bridge */ /* synthetic */ java.util.concurrent.Future submit(java.util.concurrent.Callable r1) {
            r0 = this;
            com.google.common.util.concurrent.ListenableFuture r1 = r0.submit(r1)
            return r1
    }
}
