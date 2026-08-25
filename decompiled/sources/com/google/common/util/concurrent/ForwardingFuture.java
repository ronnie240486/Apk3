package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtCompatible
@com.google.errorprone.annotations.CanIgnoreReturnValue
public abstract class ForwardingFuture<V> extends com.google.common.collect.ForwardingObject implements java.util.concurrent.Future<V> {

    public static abstract class SimpleForwardingFuture<V> extends com.google.common.util.concurrent.ForwardingFuture<V> {
        private final java.util.concurrent.Future<V> delegate;

        @Override // com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
        public final java.lang.Object delegate() {
                r1 = this;
                java.util.concurrent.Future<V> r0 = r1.delegate
                return r0
        }

        @Override // com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
        public final java.util.concurrent.Future<V> delegate() {
                r1 = this;
                java.util.concurrent.Future<V> r0 = r1.delegate
                return r0
        }
    }

    public ForwardingFuture() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean r2) {
            r1 = this;
            java.util.concurrent.Future r0 = r1.delegate()
            boolean r2 = r0.cancel(r2)
            return r2
    }

    @Override // com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            java.util.concurrent.Future r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingObject
    public abstract java.util.concurrent.Future<? extends V> delegate();

    @Override // java.util.concurrent.Future
    @com.google.common.util.concurrent.ParametricNullness
    public V get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
            r1 = this;
            java.util.concurrent.Future r0 = r1.delegate()
            java.lang.Object r0 = r0.get()
            return r0
    }

    @Override // java.util.concurrent.Future
    @com.google.common.util.concurrent.ParametricNullness
    public V get(long r2, java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
            r1 = this;
            java.util.concurrent.Future r0 = r1.delegate()
            java.lang.Object r2 = r0.get(r2, r4)
            return r2
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
            r1 = this;
            java.util.concurrent.Future r0 = r1.delegate()
            boolean r0 = r0.isCancelled()
            return r0
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
            r1 = this;
            java.util.concurrent.Future r0 = r1.delegate()
            boolean r0 = r0.isDone()
            return r0
    }
}
