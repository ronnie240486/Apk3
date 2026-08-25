package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtCompatible
final class CombinedFuture<V> extends com.google.common.util.concurrent.AggregateFuture<java.lang.Object, V> {

    @javax.annotation.CheckForNull
    private com.google.common.util.concurrent.CombinedFuture<V>.CombinedFutureInterruptibleTask<?> task;

    public final class AsyncCallableInterruptibleTask extends com.google.common.util.concurrent.CombinedFuture<V>.CombinedFutureInterruptibleTask<com.google.common.util.concurrent.ListenableFuture<V>> {
        private final com.google.common.util.concurrent.AsyncCallable<V> callable;
        public final /* synthetic */ com.google.common.util.concurrent.CombinedFuture this$0;

        public AsyncCallableInterruptibleTask(com.google.common.util.concurrent.CombinedFuture r1, com.google.common.util.concurrent.AsyncCallable<V> r2, java.util.concurrent.Executor r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1, r3)
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                com.google.common.util.concurrent.AsyncCallable r1 = (com.google.common.util.concurrent.AsyncCallable) r1
                r0.callable = r1
                return
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

        @Override // com.google.common.util.concurrent.CombinedFuture.CombinedFutureInterruptibleTask
        public final void setValue(java.lang.Object r2) {
                r1 = this;
                com.google.common.util.concurrent.ListenableFuture r2 = (com.google.common.util.concurrent.ListenableFuture) r2
                com.google.common.util.concurrent.CombinedFuture r0 = r1.this$0
                r0.setFuture(r2)
                return
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final java.lang.String toPendingString() {
                r1 = this;
                com.google.common.util.concurrent.AsyncCallable<V> r0 = r1.callable
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public final class CallableInterruptibleTask extends com.google.common.util.concurrent.CombinedFuture<V>.CombinedFutureInterruptibleTask<V> {
        private final java.util.concurrent.Callable<V> callable;
        public final /* synthetic */ com.google.common.util.concurrent.CombinedFuture this$0;

        public CallableInterruptibleTask(com.google.common.util.concurrent.CombinedFuture r1, java.util.concurrent.Callable<V> r2, java.util.concurrent.Executor r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1, r3)
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                java.util.concurrent.Callable r1 = (java.util.concurrent.Callable) r1
                r0.callable = r1
                return
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        @com.google.common.util.concurrent.ParametricNullness
        public final V runInterruptibly() throws java.lang.Exception {
                r1 = this;
                java.util.concurrent.Callable<V> r0 = r1.callable
                java.lang.Object r0 = r0.call()
                return r0
        }

        @Override // com.google.common.util.concurrent.CombinedFuture.CombinedFutureInterruptibleTask
        public final void setValue(@com.google.common.util.concurrent.ParametricNullness V r2) {
                r1 = this;
                com.google.common.util.concurrent.CombinedFuture r0 = r1.this$0
                r0.set(r2)
                return
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final java.lang.String toPendingString() {
                r1 = this;
                java.util.concurrent.Callable<V> r0 = r1.callable
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public abstract class CombinedFutureInterruptibleTask<T> extends com.google.common.util.concurrent.InterruptibleTask<T> {
        private final java.util.concurrent.Executor listenerExecutor;
        public final /* synthetic */ com.google.common.util.concurrent.CombinedFuture this$0;

        public CombinedFutureInterruptibleTask(com.google.common.util.concurrent.CombinedFuture r1, java.util.concurrent.Executor r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
                r0.listenerExecutor = r1
                return
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final void afterRanInterruptiblyFailure(java.lang.Throwable r2) {
                r1 = this;
                com.google.common.util.concurrent.CombinedFuture r0 = r1.this$0
                com.google.common.util.concurrent.CombinedFuture.access$002(r0)
                boolean r0 = r2 instanceof java.util.concurrent.ExecutionException
                if (r0 == 0) goto L15
                com.google.common.util.concurrent.CombinedFuture r0 = r1.this$0
                java.util.concurrent.ExecutionException r2 = (java.util.concurrent.ExecutionException) r2
                java.lang.Throwable r2 = r2.getCause()
                r0.setException(r2)
                goto L25
            L15:
                boolean r0 = r2 instanceof java.util.concurrent.CancellationException
                if (r0 == 0) goto L20
                com.google.common.util.concurrent.CombinedFuture r2 = r1.this$0
                r0 = 0
                r2.cancel(r0)
                goto L25
            L20:
                com.google.common.util.concurrent.CombinedFuture r0 = r1.this$0
                r0.setException(r2)
            L25:
                return
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final void afterRanInterruptiblySuccess(@com.google.common.util.concurrent.ParametricNullness T r2) {
                r1 = this;
                com.google.common.util.concurrent.CombinedFuture r0 = r1.this$0
                com.google.common.util.concurrent.CombinedFuture.access$002(r0)
                r1.setValue(r2)
                return
        }

        public final void execute() {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.listenerExecutor     // Catch: java.util.concurrent.RejectedExecutionException -> L6
                r0.execute(r2)     // Catch: java.util.concurrent.RejectedExecutionException -> L6
                goto Lc
            L6:
                r0 = move-exception
                com.google.common.util.concurrent.CombinedFuture r1 = r2.this$0
                r1.setException(r0)
            Lc:
                return
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final boolean isDone() {
                r1 = this;
                com.google.common.util.concurrent.CombinedFuture r0 = r1.this$0
                boolean r0 = r0.isDone()
                return r0
        }

        public abstract void setValue(@com.google.common.util.concurrent.ParametricNullness T r1);
    }

    public CombinedFuture(com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<?>> r2, boolean r3, java.util.concurrent.Executor r4, com.google.common.util.concurrent.AsyncCallable<V> r5) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            com.google.common.util.concurrent.CombinedFuture$AsyncCallableInterruptibleTask r2 = new com.google.common.util.concurrent.CombinedFuture$AsyncCallableInterruptibleTask
            r2.<init>(r1, r5, r4)
            r1.task = r2
            r1.init()
            return
    }

    public CombinedFuture(com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<?>> r2, boolean r3, java.util.concurrent.Executor r4, java.util.concurrent.Callable<V> r5) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            com.google.common.util.concurrent.CombinedFuture$CallableInterruptibleTask r2 = new com.google.common.util.concurrent.CombinedFuture$CallableInterruptibleTask
            r2.<init>(r1, r5, r4)
            r1.task = r2
            r1.init()
            return
    }

    public static /* synthetic */ void access$002(com.google.common.util.concurrent.CombinedFuture r1) {
            r0 = 0
            r1.task = r0
            return
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    public final void collectOneValue(int r1, @javax.annotation.CheckForNull java.lang.Object r2) {
            r0 = this;
            return
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    public final void handleAllCompleted() {
            r1 = this;
            com.google.common.util.concurrent.CombinedFuture<V>$CombinedFutureInterruptibleTask<?> r0 = r1.task
            if (r0 == 0) goto L7
            r0.execute()
        L7:
            return
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void interruptTask() {
            r1 = this;
            com.google.common.util.concurrent.CombinedFuture<V>$CombinedFutureInterruptibleTask<?> r0 = r1.task
            if (r0 == 0) goto L7
            r0.interruptTask()
        L7:
            return
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    public final void releaseResources(com.google.common.util.concurrent.AggregateFuture.ReleaseResourcesReason r2) {
            r1 = this;
            super.releaseResources(r2)
            com.google.common.util.concurrent.AggregateFuture$ReleaseResourcesReason r0 = com.google.common.util.concurrent.AggregateFuture.ReleaseResourcesReason.OUTPUT_FUTURE_DONE
            if (r2 != r0) goto La
            r2 = 0
            r1.task = r2
        La:
            return
    }
}
