package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtCompatible
abstract class AggregateFuture<InputT, OutputT> extends com.google.common.util.concurrent.AggregateFutureState<OutputT> {
    private static final java.util.logging.Logger logger = null;
    private final boolean allMustSucceed;
    private final boolean collectsValues;

    @javax.annotation.CheckForNull
    private com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<? extends InputT>> futures;



    /* JADX INFO: loaded from: classes2.dex */
    public static final enum ReleaseResourcesReason extends java.lang.Enum<com.google.common.util.concurrent.AggregateFuture.ReleaseResourcesReason> {
        private static final /* synthetic */ com.google.common.util.concurrent.AggregateFuture.ReleaseResourcesReason[] $VALUES = null;
        public static final com.google.common.util.concurrent.AggregateFuture.ReleaseResourcesReason ALL_INPUT_FUTURES_PROCESSED = null;
        public static final com.google.common.util.concurrent.AggregateFuture.ReleaseResourcesReason OUTPUT_FUTURE_DONE = null;

        private static /* synthetic */ com.google.common.util.concurrent.AggregateFuture.ReleaseResourcesReason[] $values() {
                r0 = 2
                com.google.common.util.concurrent.AggregateFuture$ReleaseResourcesReason[] r0 = new com.google.common.util.concurrent.AggregateFuture.ReleaseResourcesReason[r0]
                com.google.common.util.concurrent.AggregateFuture$ReleaseResourcesReason r1 = com.google.common.util.concurrent.AggregateFuture.ReleaseResourcesReason.OUTPUT_FUTURE_DONE
                r2 = 0
                r0[r2] = r1
                com.google.common.util.concurrent.AggregateFuture$ReleaseResourcesReason r1 = com.google.common.util.concurrent.AggregateFuture.ReleaseResourcesReason.ALL_INPUT_FUTURES_PROCESSED
                r2 = 1
                r0[r2] = r1
                return r0
        }

        static {
                com.google.common.util.concurrent.AggregateFuture$ReleaseResourcesReason r0 = new com.google.common.util.concurrent.AggregateFuture$ReleaseResourcesReason
                java.lang.String r1 = "OUTPUT_FUTURE_DONE"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.common.util.concurrent.AggregateFuture.ReleaseResourcesReason.OUTPUT_FUTURE_DONE = r0
                com.google.common.util.concurrent.AggregateFuture$ReleaseResourcesReason r0 = new com.google.common.util.concurrent.AggregateFuture$ReleaseResourcesReason
                java.lang.String r1 = "ALL_INPUT_FUTURES_PROCESSED"
                r2 = 1
                r0.<init>(r1, r2)
                com.google.common.util.concurrent.AggregateFuture.ReleaseResourcesReason.ALL_INPUT_FUTURES_PROCESSED = r0
                com.google.common.util.concurrent.AggregateFuture$ReleaseResourcesReason[] r0 = $values()
                com.google.common.util.concurrent.AggregateFuture.ReleaseResourcesReason.$VALUES = r0
                return
        }

        private ReleaseResourcesReason(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.util.concurrent.AggregateFuture.ReleaseResourcesReason valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.util.concurrent.AggregateFuture$ReleaseResourcesReason> r0 = com.google.common.util.concurrent.AggregateFuture.ReleaseResourcesReason.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.util.concurrent.AggregateFuture$ReleaseResourcesReason r1 = (com.google.common.util.concurrent.AggregateFuture.ReleaseResourcesReason) r1
                return r1
        }

        public static com.google.common.util.concurrent.AggregateFuture.ReleaseResourcesReason[] values() {
                com.google.common.util.concurrent.AggregateFuture$ReleaseResourcesReason[] r0 = com.google.common.util.concurrent.AggregateFuture.ReleaseResourcesReason.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.util.concurrent.AggregateFuture$ReleaseResourcesReason[] r0 = (com.google.common.util.concurrent.AggregateFuture.ReleaseResourcesReason[]) r0
                return r0
        }
    }

    static {
            java.lang.Class<com.google.common.util.concurrent.AggregateFuture> r0 = com.google.common.util.concurrent.AggregateFuture.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.common.util.concurrent.AggregateFuture.logger = r0
            return
    }

    public AggregateFuture(com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<? extends InputT>> r2, boolean r3, boolean r4) {
            r1 = this;
            int r0 = r2.size()
            r1.<init>(r0)
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.collect.ImmutableCollection r2 = (com.google.common.collect.ImmutableCollection) r2
            r1.futures = r2
            r1.allMustSucceed = r3
            r1.collectsValues = r4
            return
    }

    public static /* synthetic */ void access$002(com.google.common.util.concurrent.AggregateFuture r1) {
            r0 = 0
            r1.futures = r0
            return
    }

    public static /* synthetic */ void access$100(com.google.common.util.concurrent.AggregateFuture r0, int r1, java.util.concurrent.Future r2) {
            r0.collectValueFromNonCancelledFuture(r1, r2)
            return
    }

    public static /* synthetic */ void access$200(com.google.common.util.concurrent.AggregateFuture r0, com.google.common.collect.ImmutableCollection r1) {
            r0.decrementCountAndMaybeComplete(r1)
            return
    }

    private static boolean addCausalChain(java.util.Set<java.lang.Throwable> r1, java.lang.Throwable r2) {
        L0:
            if (r2 == 0) goto Lf
            boolean r0 = r1.add(r2)
            if (r0 != 0) goto La
            r1 = 0
            return r1
        La:
            java.lang.Throwable r2 = r2.getCause()
            goto L0
        Lf:
            r1 = 1
            return r1
    }

    private void collectValueFromNonCancelledFuture(int r1, java.util.concurrent.Future<? extends InputT> r2) {
            r0 = this;
            java.lang.Object r2 = com.google.common.util.concurrent.Futures.getDone(r2)     // Catch: java.lang.Throwable -> L8 java.util.concurrent.ExecutionException -> Ld
            r0.collectOneValue(r1, r2)     // Catch: java.lang.Throwable -> L8 java.util.concurrent.ExecutionException -> Ld
            goto L15
        L8:
            r1 = move-exception
            r0.handleException(r1)
            goto L15
        Ld:
            r1 = move-exception
            java.lang.Throwable r1 = r1.getCause()
            r0.handleException(r1)
        L15:
            return
    }

    private void decrementCountAndMaybeComplete(@javax.annotation.CheckForNull com.google.common.collect.ImmutableCollection<? extends java.util.concurrent.Future<? extends InputT>> r4) {
            r3 = this;
            int r0 = r3.decrementRemainingAndGet()
            if (r0 < 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            java.lang.String r2 = "Less than 0 remaining futures"
            com.google.common.base.Preconditions.checkState(r1, r2)
            if (r0 != 0) goto L13
            r3.processCompleted(r4)
        L13:
            return
    }

    private void handleException(java.lang.Throwable r2) {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r2)
            boolean r0 = r1.allMustSucceed
            if (r0 == 0) goto L1b
            boolean r0 = r1.setException(r2)
            if (r0 != 0) goto L1b
            java.util.Set r0 = r1.getOrInitSeenExceptions()
            boolean r0 = addCausalChain(r0, r2)
            if (r0 == 0) goto L1b
            log(r2)
            return
        L1b:
            boolean r0 = r2 instanceof java.lang.Error
            if (r0 == 0) goto L22
            log(r2)
        L22:
            return
    }

    private static void log(java.lang.Throwable r3) {
            boolean r0 = r3 instanceof java.lang.Error
            if (r0 == 0) goto L7
            java.lang.String r0 = "Input Future failed with Error"
            goto L9
        L7:
            java.lang.String r0 = "Got more than one input Future failure. Logging failures after the first"
        L9:
            java.util.logging.Logger r1 = com.google.common.util.concurrent.AggregateFuture.logger
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            r1.log(r2, r0, r3)
            return
    }

    private void processCompleted(@javax.annotation.CheckForNull com.google.common.collect.ImmutableCollection<? extends java.util.concurrent.Future<? extends InputT>> r4) {
            r3 = this;
            if (r4 == 0) goto L1f
            r0 = 0
            com.google.common.collect.UnmodifiableIterator r4 = r4.iterator()
        L7:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r4.next()
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1
            boolean r2 = r1.isCancelled()
            if (r2 != 0) goto L1c
            r3.collectValueFromNonCancelledFuture(r0, r1)
        L1c:
            int r0 = r0 + 1
            goto L7
        L1f:
            r3.clearSeenExceptions()
            r3.handleAllCompleted()
            com.google.common.util.concurrent.AggregateFuture$ReleaseResourcesReason r4 = com.google.common.util.concurrent.AggregateFuture.ReleaseResourcesReason.ALL_INPUT_FUTURES_PROCESSED
            r3.releaseResources(r4)
            return
    }

    @Override // com.google.common.util.concurrent.AggregateFutureState
    public final void addInitialException(java.util.Set<java.lang.Throwable> r3) {
            r2 = this;
            com.google.common.base.Preconditions.checkNotNull(r3)
            boolean r0 = r2.isCancelled()
            if (r0 != 0) goto L16
            java.lang.Throwable r0 = r2.tryInternalFastPathGetFailure()
            java.util.Objects.requireNonNull(r0)
            r1 = r0
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            addCausalChain(r3, r0)
        L16:
            return
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void afterDone() {
            r3 = this;
            com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<? extends InputT>> r0 = r3.futures
            com.google.common.util.concurrent.AggregateFuture$ReleaseResourcesReason r1 = com.google.common.util.concurrent.AggregateFuture.ReleaseResourcesReason.OUTPUT_FUTURE_DONE
            r3.releaseResources(r1)
            boolean r1 = r3.isCancelled()
            if (r0 == 0) goto Lf
            r2 = 1
            goto L10
        Lf:
            r2 = 0
        L10:
            r1 = r1 & r2
            if (r1 == 0) goto L2b
            boolean r1 = r3.wasInterrupted()
            com.google.common.collect.UnmodifiableIterator r0 = r0.iterator()
        L1b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2b
            java.lang.Object r2 = r0.next()
            java.util.concurrent.Future r2 = (java.util.concurrent.Future) r2
            r2.cancel(r1)
            goto L1b
        L2b:
            return
    }

    public abstract void collectOneValue(int r1, @com.google.common.util.concurrent.ParametricNullness InputT r2);

    public abstract void handleAllCompleted();

    public final void init() {
            r5 = this;
            com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<? extends InputT>> r0 = r5.futures
            java.util.Objects.requireNonNull(r0)
            com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<? extends InputT>> r0 = r5.futures
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L11
            r5.handleAllCompleted()
            return
        L11:
            boolean r0 = r5.allMustSucceed
            if (r0 == 0) goto L38
            r0 = 0
            com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<? extends InputT>> r1 = r5.futures
            com.google.common.collect.UnmodifiableIterator r1 = r1.iterator()
        L1c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L5f
            java.lang.Object r2 = r1.next()
            com.google.common.util.concurrent.ListenableFuture r2 = (com.google.common.util.concurrent.ListenableFuture) r2
            int r3 = r0 + 1
            com.google.common.util.concurrent.AggregateFuture$1 r4 = new com.google.common.util.concurrent.AggregateFuture$1
            r4.<init>(r5, r2, r0)
            java.util.concurrent.Executor r0 = com.google.common.util.concurrent.MoreExecutors.directExecutor()
            r2.addListener(r4, r0)
            r0 = r3
            goto L1c
        L38:
            boolean r0 = r5.collectsValues
            if (r0 == 0) goto L3f
            com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<? extends InputT>> r0 = r5.futures
            goto L40
        L3f:
            r0 = 0
        L40:
            com.google.common.util.concurrent.AggregateFuture$2 r1 = new com.google.common.util.concurrent.AggregateFuture$2
            r1.<init>(r5, r0)
            com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<? extends InputT>> r0 = r5.futures
            com.google.common.collect.UnmodifiableIterator r0 = r0.iterator()
        L4b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L5f
            java.lang.Object r2 = r0.next()
            com.google.common.util.concurrent.ListenableFuture r2 = (com.google.common.util.concurrent.ListenableFuture) r2
            java.util.concurrent.Executor r3 = com.google.common.util.concurrent.MoreExecutors.directExecutor()
            r2.addListener(r1, r3)
            goto L4b
        L5f:
            return
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    @javax.annotation.CheckForNull
    public final java.lang.String pendingToString() {
            r3 = this;
            com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<? extends InputT>> r0 = r3.futures
            if (r0 == 0) goto L15
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            int r1 = r1 + 8
            java.lang.String r2 = "futures="
            java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r0)
            return r0
        L15:
            java.lang.String r0 = super.pendingToString()
            return r0
    }

    @com.google.errorprone.annotations.ForOverride
    @com.google.errorprone.annotations.OverridingMethodsMustInvokeSuper
    public void releaseResources(com.google.common.util.concurrent.AggregateFuture.ReleaseResourcesReason r1) {
            r0 = this;
            com.google.common.base.Preconditions.checkNotNull(r1)
            r1 = 0
            r0.futures = r1
            return
    }
}
