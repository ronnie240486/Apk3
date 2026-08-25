package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes3.dex */
@com.google.errorprone.annotations.CanIgnoreReturnValue
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
public abstract class ForwardingListeningExecutorService extends com.google.common.util.concurrent.ForwardingExecutorService implements com.google.common.util.concurrent.ListeningExecutorService {
    public ForwardingListeningExecutorService() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.common.util.concurrent.ForwardingExecutorService, com.google.common.collect.ForwardingObject
    public abstract com.google.common.util.concurrent.ListeningExecutorService delegate();

    @Override // com.google.common.util.concurrent.ForwardingExecutorService, com.google.common.collect.ForwardingObject
    public final /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            com.google.common.util.concurrent.ListeningExecutorService r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.util.concurrent.ForwardingExecutorService, com.google.common.collect.ForwardingObject
    public final /* bridge */ /* synthetic */ java.util.concurrent.ExecutorService delegate() {
            r1 = this;
            com.google.common.util.concurrent.ListeningExecutorService r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.util.concurrent.ForwardingExecutorService, java.util.concurrent.ExecutorService
    public com.google.common.util.concurrent.ListenableFuture<?> submit(java.lang.Runnable r2) {
            r1 = this;
            com.google.common.util.concurrent.ListeningExecutorService r0 = r1.delegate()
            com.google.common.util.concurrent.ListenableFuture r2 = r0.submit(r2)
            return r2
    }

    @Override // com.google.common.util.concurrent.ForwardingExecutorService, java.util.concurrent.ExecutorService
    public <T> com.google.common.util.concurrent.ListenableFuture<T> submit(java.lang.Runnable r2, @com.google.common.util.concurrent.ParametricNullness T r3) {
            r1 = this;
            com.google.common.util.concurrent.ListeningExecutorService r0 = r1.delegate()
            com.google.common.util.concurrent.ListenableFuture r2 = r0.submit(r2, r3)
            return r2
    }

    @Override // com.google.common.util.concurrent.ForwardingExecutorService, java.util.concurrent.ExecutorService
    public <T> com.google.common.util.concurrent.ListenableFuture<T> submit(java.util.concurrent.Callable<T> r2) {
            r1 = this;
            com.google.common.util.concurrent.ListeningExecutorService r0 = r1.delegate()
            com.google.common.util.concurrent.ListenableFuture r2 = r0.submit(r2)
            return r2
    }

    @Override // com.google.common.util.concurrent.ForwardingExecutorService, java.util.concurrent.ExecutorService
    public /* bridge */ /* synthetic */ java.util.concurrent.Future submit(java.lang.Runnable r1) {
            r0 = this;
            com.google.common.util.concurrent.ListenableFuture r1 = r0.submit(r1)
            return r1
    }

    @Override // com.google.common.util.concurrent.ForwardingExecutorService, java.util.concurrent.ExecutorService
    public /* bridge */ /* synthetic */ java.util.concurrent.Future submit(java.lang.Runnable r1, @com.google.common.util.concurrent.ParametricNullness java.lang.Object r2) {
            r0 = this;
            com.google.common.util.concurrent.ListenableFuture r1 = r0.submit(r1, r2)
            return r1
    }

    @Override // com.google.common.util.concurrent.ForwardingExecutorService, java.util.concurrent.ExecutorService
    public /* bridge */ /* synthetic */ java.util.concurrent.Future submit(java.util.concurrent.Callable r1) {
            r0 = this;
            com.google.common.util.concurrent.ListenableFuture r1 = r0.submit(r1)
            return r1
    }
}
