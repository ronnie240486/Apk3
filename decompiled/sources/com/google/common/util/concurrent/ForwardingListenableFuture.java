package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtCompatible
@com.google.errorprone.annotations.CanIgnoreReturnValue
public abstract class ForwardingListenableFuture<V> extends com.google.common.util.concurrent.ForwardingFuture<V> implements com.google.common.util.concurrent.ListenableFuture<V> {

    public static abstract class SimpleForwardingListenableFuture<V> extends com.google.common.util.concurrent.ForwardingListenableFuture<V> {
        private final com.google.common.util.concurrent.ListenableFuture<V> delegate;

        public SimpleForwardingListenableFuture(com.google.common.util.concurrent.ListenableFuture<V> r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.util.concurrent.ListenableFuture r1 = (com.google.common.util.concurrent.ListenableFuture) r1
                r0.delegate = r1
                return
        }

        @Override // com.google.common.util.concurrent.ForwardingListenableFuture, com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
        public final com.google.common.util.concurrent.ListenableFuture<V> delegate() {
                r1 = this;
                com.google.common.util.concurrent.ListenableFuture<V> r0 = r1.delegate
                return r0
        }

        @Override // com.google.common.util.concurrent.ForwardingListenableFuture, com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
        public final java.lang.Object delegate() {
                r1 = this;
                com.google.common.util.concurrent.ListenableFuture<V> r0 = r1.delegate
                return r0
        }

        @Override // com.google.common.util.concurrent.ForwardingListenableFuture, com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
        public final java.util.concurrent.Future delegate() {
                r1 = this;
                com.google.common.util.concurrent.ListenableFuture<V> r0 = r1.delegate
                return r0
        }
    }

    public ForwardingListenableFuture() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(java.lang.Runnable r2, java.util.concurrent.Executor r3) {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture r0 = r1.delegate()
            r0.addListener(r2, r3)
            return
    }

    @Override // com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
    public abstract com.google.common.util.concurrent.ListenableFuture<? extends V> delegate();

    @Override // com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ java.util.concurrent.Future delegate() {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture r0 = r1.delegate()
            return r0
    }
}
