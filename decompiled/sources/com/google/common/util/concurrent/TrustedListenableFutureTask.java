package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtCompatible
class TrustedListenableFutureTask<V> extends com.google.common.util.concurrent.FluentFuture.TrustedFuture<V> implements java.util.concurrent.RunnableFuture<V> {

    @javax.annotation.CheckForNull
    private volatile com.google.common.util.concurrent.InterruptibleTask<?> task;

    public final class TrustedFutureInterruptibleAsyncTask extends com.google.common.util.concurrent.InterruptibleTask<com.google.common.util.concurrent.ListenableFuture<V>> {
        private final com.google.common.util.concurrent.AsyncCallable<V> callable;
        public final /* synthetic */ com.google.common.util.concurrent.TrustedListenableFutureTask this$0;

        public TrustedFutureInterruptibleAsyncTask(com.google.common.util.concurrent.TrustedListenableFutureTask r1, com.google.common.util.concurrent.AsyncCallable<V> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                com.google.common.util.concurrent.AsyncCallable r1 = (com.google.common.util.concurrent.AsyncCallable) r1
                r0.callable = r1
                return
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final void afterRanInterruptiblyFailure(java.lang.Throwable r2) {
                r1 = this;
                com.google.common.util.concurrent.TrustedListenableFutureTask r0 = r1.this$0
                r0.setException(r2)
                return
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final void afterRanInterruptiblySuccess(java.lang.Object r2) {
                r1 = this;
                com.google.common.util.concurrent.ListenableFuture r2 = (com.google.common.util.concurrent.ListenableFuture) r2
                com.google.common.util.concurrent.TrustedListenableFutureTask r0 = r1.this$0
                r0.setFuture(r2)
                return
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final boolean isDone() {
                r1 = this;
                com.google.common.util.concurrent.TrustedListenableFutureTask r0 = r1.this$0
                boolean r0 = r0.isDone()
                return r0
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final java.lang.Object runInterruptibly() throws java.lang.Exception {
                r3 = this;
                com.google.common.util.concurrent.AsyncCallable<V> r0 = r3.callable
                com.google.common.util.concurrent.ListenableFuture r0 = r0.call()
                com.google.common.util.concurrent.AsyncCallable<V> r1 = r3.callable
                java.lang.String r2 = "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s"
                java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r0, r2, r1)
                com.google.common.util.concurrent.ListenableFuture r0 = (com.google.common.util.concurrent.ListenableFuture) r0
                return r0
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final java.lang.String toPendingString() {
                r1 = this;
                com.google.common.util.concurrent.AsyncCallable<V> r0 = r1.callable
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public final class TrustedFutureInterruptibleTask extends com.google.common.util.concurrent.InterruptibleTask<V> {
        private final java.util.concurrent.Callable<V> callable;
        public final /* synthetic */ com.google.common.util.concurrent.TrustedListenableFutureTask this$0;

        public TrustedFutureInterruptibleTask(com.google.common.util.concurrent.TrustedListenableFutureTask r1, java.util.concurrent.Callable<V> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                java.util.concurrent.Callable r1 = (java.util.concurrent.Callable) r1
                r0.callable = r1
                return
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final void afterRanInterruptiblyFailure(java.lang.Throwable r2) {
                r1 = this;
                com.google.common.util.concurrent.TrustedListenableFutureTask r0 = r1.this$0
                r0.setException(r2)
                return
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final void afterRanInterruptiblySuccess(@com.google.common.util.concurrent.ParametricNullness V r2) {
                r1 = this;
                com.google.common.util.concurrent.TrustedListenableFutureTask r0 = r1.this$0
                r0.set(r2)
                return
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final boolean isDone() {
                r1 = this;
                com.google.common.util.concurrent.TrustedListenableFutureTask r0 = r1.this$0
                boolean r0 = r0.isDone()
                return r0
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        @com.google.common.util.concurrent.ParametricNullness
        public final V runInterruptibly() throws java.lang.Exception {
                r1 = this;
                java.util.concurrent.Callable<V> r0 = r1.callable
                java.lang.Object r0 = r0.call()
                return r0
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final java.lang.String toPendingString() {
                r1 = this;
                java.util.concurrent.Callable<V> r0 = r1.callable
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public TrustedListenableFutureTask(com.google.common.util.concurrent.AsyncCallable<V> r2) {
            r1 = this;
            r1.<init>()
            com.google.common.util.concurrent.TrustedListenableFutureTask$TrustedFutureInterruptibleAsyncTask r0 = new com.google.common.util.concurrent.TrustedListenableFutureTask$TrustedFutureInterruptibleAsyncTask
            r0.<init>(r1, r2)
            r1.task = r0
            return
    }

    public TrustedListenableFutureTask(java.util.concurrent.Callable<V> r2) {
            r1 = this;
            r1.<init>()
            com.google.common.util.concurrent.TrustedListenableFutureTask$TrustedFutureInterruptibleTask r0 = new com.google.common.util.concurrent.TrustedListenableFutureTask$TrustedFutureInterruptibleTask
            r0.<init>(r1, r2)
            r1.task = r0
            return
    }

    public static <V> com.google.common.util.concurrent.TrustedListenableFutureTask<V> create(java.lang.Runnable r1, @com.google.common.util.concurrent.ParametricNullness V r2) {
            com.google.common.util.concurrent.TrustedListenableFutureTask r0 = new com.google.common.util.concurrent.TrustedListenableFutureTask
            java.util.concurrent.Callable r1 = java.util.concurrent.Executors.callable(r1, r2)
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void afterDone() {
            r1 = this;
            boolean r0 = r1.wasInterrupted()
            if (r0 == 0) goto Ld
            com.google.common.util.concurrent.InterruptibleTask<?> r0 = r1.task
            if (r0 == 0) goto Ld
            r0.interruptTask()
        Ld:
            r0 = 0
            r1.task = r0
            return
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    @javax.annotation.CheckForNull
    public final java.lang.String pendingToString() {
            r4 = this;
            com.google.common.util.concurrent.InterruptibleTask<?> r0 = r4.task
            if (r0 == 0) goto L18
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            int r1 = r1 + 7
            java.lang.String r2 = "task=["
            java.lang.String r3 = "]"
            java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r0, r3)
            return r0
        L18:
            java.lang.String r0 = super.pendingToString()
            return r0
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
            r1 = this;
            com.google.common.util.concurrent.InterruptibleTask<?> r0 = r1.task
            if (r0 == 0) goto L7
            r0.run()
        L7:
            r0 = 0
            r1.task = r0
            return
    }
}
