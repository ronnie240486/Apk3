package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.Beta
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.errorprone.annotations.DoNotMock("Use ClosingFuture.from(Futures.immediate*Future)")
public final class ClosingFuture<V> {
    private static final java.util.logging.Logger logger = null;
    private final com.google.common.util.concurrent.ClosingFuture.CloseableList closeables;
    private final com.google.common.util.concurrent.FluentFuture<V> future;
    private final java.util.concurrent.atomic.AtomicReference<com.google.common.util.concurrent.ClosingFuture.State> state;




    /* JADX INFO: renamed from: com.google.common.util.concurrent.ClosingFuture$12, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass12 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$common$util$concurrent$ClosingFuture$State = null;

        static {
                com.google.common.util.concurrent.ClosingFuture$State[] r0 = com.google.common.util.concurrent.ClosingFuture.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.common.util.concurrent.ClosingFuture.AnonymousClass12.$SwitchMap$com$google$common$util$concurrent$ClosingFuture$State = r0
                com.google.common.util.concurrent.ClosingFuture$State r1 = com.google.common.util.concurrent.ClosingFuture.State.SUBSUMED     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.common.util.concurrent.ClosingFuture.AnonymousClass12.$SwitchMap$com$google$common$util$concurrent$ClosingFuture$State     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.common.util.concurrent.ClosingFuture$State r1 = com.google.common.util.concurrent.ClosingFuture.State.WILL_CREATE_VALUE_AND_CLOSER     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.common.util.concurrent.ClosingFuture.AnonymousClass12.$SwitchMap$com$google$common$util$concurrent$ClosingFuture$State     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.common.util.concurrent.ClosingFuture$State r1 = com.google.common.util.concurrent.ClosingFuture.State.WILL_CLOSE     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.google.common.util.concurrent.ClosingFuture.AnonymousClass12.$SwitchMap$com$google$common$util$concurrent$ClosingFuture$State     // Catch: java.lang.NoSuchFieldError -> L33
                com.google.common.util.concurrent.ClosingFuture$State r1 = com.google.common.util.concurrent.ClosingFuture.State.CLOSING     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.google.common.util.concurrent.ClosingFuture.AnonymousClass12.$SwitchMap$com$google$common$util$concurrent$ClosingFuture$State     // Catch: java.lang.NoSuchFieldError -> L3e
                com.google.common.util.concurrent.ClosingFuture$State r1 = com.google.common.util.concurrent.ClosingFuture.State.CLOSED     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.google.common.util.concurrent.ClosingFuture.AnonymousClass12.$SwitchMap$com$google$common$util$concurrent$ClosingFuture$State     // Catch: java.lang.NoSuchFieldError -> L49
                com.google.common.util.concurrent.ClosingFuture$State r1 = com.google.common.util.concurrent.ClosingFuture.State.OPEN     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                return
        }
    }









    public interface AsyncClosingCallable<V> {
        com.google.common.util.concurrent.ClosingFuture<V> call(com.google.common.util.concurrent.ClosingFuture.DeferredCloser r1) throws java.lang.Exception;
    }

    public interface AsyncClosingFunction<T, U> {
        com.google.common.util.concurrent.ClosingFuture<U> apply(com.google.common.util.concurrent.ClosingFuture.DeferredCloser r1, @com.google.common.util.concurrent.ParametricNullness T r2) throws java.lang.Exception;
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class CloseableList extends java.util.IdentityHashMap<java.io.Closeable, java.util.concurrent.Executor> implements java.io.Closeable {
        private volatile boolean closed;
        private final com.google.common.util.concurrent.ClosingFuture.DeferredCloser closer;

        @javax.annotation.CheckForNull
        private volatile java.util.concurrent.CountDownLatch whenClosed;

        private CloseableList() {
                r1 = this;
                r1.<init>()
                com.google.common.util.concurrent.ClosingFuture$DeferredCloser r0 = new com.google.common.util.concurrent.ClosingFuture$DeferredCloser
                r0.<init>(r1)
                r1.closer = r0
                return
        }

        public /* synthetic */ CloseableList(com.google.common.util.concurrent.ClosingFuture.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static /* synthetic */ com.google.common.util.concurrent.ClosingFuture.DeferredCloser access$300(com.google.common.util.concurrent.ClosingFuture.CloseableList r0) {
                com.google.common.util.concurrent.ClosingFuture$DeferredCloser r0 = r0.closer
                return r0
        }

        public final void add(@javax.annotation.CheckForNull java.io.Closeable r2, java.util.concurrent.Executor r3) {
                r1 = this;
                com.google.common.base.Preconditions.checkNotNull(r3)
                if (r2 != 0) goto L6
                return
            L6:
                monitor-enter(r1)
                boolean r0 = r1.closed     // Catch: java.lang.Throwable -> L15
                if (r0 != 0) goto L10
                r1.put(r2, r3)     // Catch: java.lang.Throwable -> L15
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
                return
            L10:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
                com.google.common.util.concurrent.ClosingFuture.access$3300(r2, r3)
                return
            L15:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
                throw r2
        }

        public final <V, U> com.google.common.util.concurrent.FluentFuture<U> applyAsyncClosingFunction(com.google.common.util.concurrent.ClosingFuture.AsyncClosingFunction<V, U> r3, @com.google.common.util.concurrent.ParametricNullness V r4) throws java.lang.Exception {
                r2 = this;
                com.google.common.util.concurrent.ClosingFuture$CloseableList r0 = new com.google.common.util.concurrent.ClosingFuture$CloseableList
                r0.<init>()
                com.google.common.util.concurrent.ClosingFuture$DeferredCloser r1 = r0.closer     // Catch: java.lang.Throwable -> L1a
                com.google.common.util.concurrent.ClosingFuture r3 = r3.apply(r1, r4)     // Catch: java.lang.Throwable -> L1a
                com.google.common.util.concurrent.ClosingFuture.access$1000(r3, r0)     // Catch: java.lang.Throwable -> L1a
                com.google.common.util.concurrent.FluentFuture r3 = com.google.common.util.concurrent.ClosingFuture.access$000(r3)     // Catch: java.lang.Throwable -> L1a
                java.util.concurrent.Executor r4 = com.google.common.util.concurrent.MoreExecutors.directExecutor()
                r2.add(r0, r4)
                return r3
            L1a:
                r3 = move-exception
                java.util.concurrent.Executor r4 = com.google.common.util.concurrent.MoreExecutors.directExecutor()
                r2.add(r0, r4)
                throw r3
        }

        public final <V, U> com.google.common.util.concurrent.ListenableFuture<U> applyClosingFunction(com.google.common.util.concurrent.ClosingFuture.ClosingFunction<? super V, U> r3, @com.google.common.util.concurrent.ParametricNullness V r4) throws java.lang.Exception {
                r2 = this;
                com.google.common.util.concurrent.ClosingFuture$CloseableList r0 = new com.google.common.util.concurrent.ClosingFuture$CloseableList
                r0.<init>()
                com.google.common.util.concurrent.ClosingFuture$DeferredCloser r1 = r0.closer     // Catch: java.lang.Throwable -> L17
                java.lang.Object r3 = r3.apply(r1, r4)     // Catch: java.lang.Throwable -> L17
                com.google.common.util.concurrent.ListenableFuture r3 = com.google.common.util.concurrent.Futures.immediateFuture(r3)     // Catch: java.lang.Throwable -> L17
                java.util.concurrent.Executor r4 = com.google.common.util.concurrent.MoreExecutors.directExecutor()
                r2.add(r0, r4)
                return r3
            L17:
                r3 = move-exception
                java.util.concurrent.Executor r4 = com.google.common.util.concurrent.MoreExecutors.directExecutor()
                r2.add(r0, r4)
                throw r3
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r3 = this;
                boolean r0 = r3.closed
                if (r0 == 0) goto L5
                return
            L5:
                monitor-enter(r3)
                boolean r0 = r3.closed     // Catch: java.lang.Throwable -> L41
                if (r0 == 0) goto Lc
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L41
                return
            Lc:
                r0 = 1
                r3.closed = r0     // Catch: java.lang.Throwable -> L41
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L41
                java.util.Set r0 = r3.entrySet()
                java.util.Iterator r0 = r0.iterator()
            L18:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L34
                java.lang.Object r1 = r0.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                java.io.Closeable r2 = (java.io.Closeable) r2
                java.lang.Object r1 = r1.getValue()
                java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
                com.google.common.util.concurrent.ClosingFuture.access$3300(r2, r1)
                goto L18
            L34:
                r3.clear()
                java.util.concurrent.CountDownLatch r0 = r3.whenClosed
                if (r0 == 0) goto L40
                java.util.concurrent.CountDownLatch r0 = r3.whenClosed
                r0.countDown()
            L40:
                return
            L41:
                r0 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L41
                throw r0
        }
    }

    public interface ClosingCallable<V> {
        @com.google.common.util.concurrent.ParametricNullness
        V call(com.google.common.util.concurrent.ClosingFuture.DeferredCloser r1) throws java.lang.Exception;
    }

    public interface ClosingFunction<T, U> {
        @com.google.common.util.concurrent.ParametricNullness
        U apply(com.google.common.util.concurrent.ClosingFuture.DeferredCloser r1, @com.google.common.util.concurrent.ParametricNullness T r2) throws java.lang.Exception;
    }

    @com.google.errorprone.annotations.DoNotMock("Use ClosingFuture.whenAllSucceed() or .whenAllComplete() instead.")
    public static class Combiner {
        private static final com.google.common.base.Function<com.google.common.util.concurrent.ClosingFuture<?>, com.google.common.util.concurrent.FluentFuture<?>> INNER_FUTURE = null;
        private final boolean allMustSucceed;
        private final com.google.common.util.concurrent.ClosingFuture.CloseableList closeables;
        public final com.google.common.collect.ImmutableList<com.google.common.util.concurrent.ClosingFuture<?>> inputs;




        /* JADX INFO: loaded from: classes2.dex */
        public interface AsyncCombiningCallable<V> {
            com.google.common.util.concurrent.ClosingFuture<V> call(com.google.common.util.concurrent.ClosingFuture.DeferredCloser r1, com.google.common.util.concurrent.ClosingFuture.Peeker r2) throws java.lang.Exception;
        }

        /* JADX INFO: loaded from: classes2.dex */
        public interface CombiningCallable<V> {
            @com.google.common.util.concurrent.ParametricNullness
            V call(com.google.common.util.concurrent.ClosingFuture.DeferredCloser r1, com.google.common.util.concurrent.ClosingFuture.Peeker r2) throws java.lang.Exception;
        }

        static {
                com.google.common.util.concurrent.ClosingFuture$Combiner$3 r0 = new com.google.common.util.concurrent.ClosingFuture$Combiner$3
                r0.<init>()
                com.google.common.util.concurrent.ClosingFuture.Combiner.INNER_FUTURE = r0
                return
        }

        private Combiner(boolean r3, java.lang.Iterable<? extends com.google.common.util.concurrent.ClosingFuture<?>> r4) {
                r2 = this;
                r2.<init>()
                com.google.common.util.concurrent.ClosingFuture$CloseableList r0 = new com.google.common.util.concurrent.ClosingFuture$CloseableList
                r1 = 0
                r0.<init>(r1)
                r2.closeables = r0
                r2.allMustSucceed = r3
                com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.copyOf(r4)
                r2.inputs = r3
                java.util.Iterator r3 = r4.iterator()
            L17:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L29
                java.lang.Object r4 = r3.next()
                com.google.common.util.concurrent.ClosingFuture r4 = (com.google.common.util.concurrent.ClosingFuture) r4
                com.google.common.util.concurrent.ClosingFuture$CloseableList r0 = r2.closeables
                com.google.common.util.concurrent.ClosingFuture.access$1000(r4, r0)
                goto L17
            L29:
                return
        }

        public /* synthetic */ Combiner(boolean r1, java.lang.Iterable r2, com.google.common.util.concurrent.ClosingFuture.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static /* synthetic */ com.google.common.util.concurrent.ClosingFuture.CloseableList access$1300(com.google.common.util.concurrent.ClosingFuture.Combiner r0) {
                com.google.common.util.concurrent.ClosingFuture$CloseableList r0 = r0.closeables
                return r0
        }

        private com.google.common.util.concurrent.Futures.FutureCombiner<java.lang.Object> futureCombiner() {
                r1 = this;
                boolean r0 = r1.allMustSucceed
                if (r0 == 0) goto Ld
                com.google.common.collect.ImmutableList r0 = r1.inputFutures()
                com.google.common.util.concurrent.Futures$FutureCombiner r0 = com.google.common.util.concurrent.Futures.whenAllSucceed(r0)
                goto L15
            Ld:
                com.google.common.collect.ImmutableList r0 = r1.inputFutures()
                com.google.common.util.concurrent.Futures$FutureCombiner r0 = com.google.common.util.concurrent.Futures.whenAllComplete(r0)
            L15:
                return r0
        }

        private com.google.common.collect.ImmutableList<com.google.common.util.concurrent.FluentFuture<?>> inputFutures() {
                r2 = this;
                com.google.common.collect.ImmutableList<com.google.common.util.concurrent.ClosingFuture<?>> r0 = r2.inputs
                com.google.common.collect.FluentIterable r0 = com.google.common.collect.FluentIterable.from(r0)
                com.google.common.base.Function<com.google.common.util.concurrent.ClosingFuture<?>, com.google.common.util.concurrent.FluentFuture<?>> r1 = com.google.common.util.concurrent.ClosingFuture.Combiner.INNER_FUTURE
                com.google.common.collect.FluentIterable r0 = r0.transform(r1)
                com.google.common.collect.ImmutableList r0 = r0.toList()
                return r0
        }

        public <V> com.google.common.util.concurrent.ClosingFuture<V> call(com.google.common.util.concurrent.ClosingFuture.Combiner.CombiningCallable<V> r3, java.util.concurrent.Executor r4) {
                r2 = this;
                com.google.common.util.concurrent.ClosingFuture$Combiner$1 r0 = new com.google.common.util.concurrent.ClosingFuture$Combiner$1
                r0.<init>(r2, r3)
                com.google.common.util.concurrent.ClosingFuture r3 = new com.google.common.util.concurrent.ClosingFuture
                com.google.common.util.concurrent.Futures$FutureCombiner r1 = r2.futureCombiner()
                com.google.common.util.concurrent.ListenableFuture r4 = r1.call(r0, r4)
                r0 = 0
                r3.<init>(r4, r0)
                com.google.common.util.concurrent.ClosingFuture$CloseableList r4 = com.google.common.util.concurrent.ClosingFuture.access$200(r3)
                com.google.common.util.concurrent.ClosingFuture$CloseableList r0 = r2.closeables
                java.util.concurrent.Executor r1 = com.google.common.util.concurrent.MoreExecutors.directExecutor()
                r4.add(r0, r1)
                return r3
        }

        public <V> com.google.common.util.concurrent.ClosingFuture<V> callAsync(com.google.common.util.concurrent.ClosingFuture.Combiner.AsyncCombiningCallable<V> r3, java.util.concurrent.Executor r4) {
                r2 = this;
                com.google.common.util.concurrent.ClosingFuture$Combiner$2 r0 = new com.google.common.util.concurrent.ClosingFuture$Combiner$2
                r0.<init>(r2, r3)
                com.google.common.util.concurrent.ClosingFuture r3 = new com.google.common.util.concurrent.ClosingFuture
                com.google.common.util.concurrent.Futures$FutureCombiner r1 = r2.futureCombiner()
                com.google.common.util.concurrent.ListenableFuture r4 = r1.callAsync(r0, r4)
                r0 = 0
                r3.<init>(r4, r0)
                com.google.common.util.concurrent.ClosingFuture$CloseableList r4 = com.google.common.util.concurrent.ClosingFuture.access$200(r3)
                com.google.common.util.concurrent.ClosingFuture$CloseableList r0 = r2.closeables
                java.util.concurrent.Executor r1 = com.google.common.util.concurrent.MoreExecutors.directExecutor()
                r4.add(r0, r1)
                return r3
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class Combiner2<V1, V2> extends com.google.common.util.concurrent.ClosingFuture.Combiner {
        private final com.google.common.util.concurrent.ClosingFuture<V1> future1;
        private final com.google.common.util.concurrent.ClosingFuture<V2> future2;



        /* JADX INFO: loaded from: classes.dex */
        public interface AsyncClosingFunction2<V1, V2, U> {
            com.google.common.util.concurrent.ClosingFuture<U> apply(com.google.common.util.concurrent.ClosingFuture.DeferredCloser r1, @com.google.common.util.concurrent.ParametricNullness V1 r2, @com.google.common.util.concurrent.ParametricNullness V2 r3) throws java.lang.Exception;
        }

        /* JADX INFO: loaded from: classes.dex */
        public interface ClosingFunction2<V1, V2, U> {
            @com.google.common.util.concurrent.ParametricNullness
            U apply(com.google.common.util.concurrent.ClosingFuture.DeferredCloser r1, @com.google.common.util.concurrent.ParametricNullness V1 r2, @com.google.common.util.concurrent.ParametricNullness V2 r3) throws java.lang.Exception;
        }

        private Combiner2(com.google.common.util.concurrent.ClosingFuture<V1> r4, com.google.common.util.concurrent.ClosingFuture<V2> r5) {
                r3 = this;
                com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of(r4, r5)
                r1 = 1
                r2 = 0
                r3.<init>(r1, r0, r2)
                r3.future1 = r4
                r3.future2 = r5
                return
        }

        public /* synthetic */ Combiner2(com.google.common.util.concurrent.ClosingFuture r1, com.google.common.util.concurrent.ClosingFuture r2, com.google.common.util.concurrent.ClosingFuture.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static /* synthetic */ com.google.common.util.concurrent.ClosingFuture access$1800(com.google.common.util.concurrent.ClosingFuture.Combiner2 r0) {
                com.google.common.util.concurrent.ClosingFuture<V1> r0 = r0.future1
                return r0
        }

        public static /* synthetic */ com.google.common.util.concurrent.ClosingFuture access$1900(com.google.common.util.concurrent.ClosingFuture.Combiner2 r0) {
                com.google.common.util.concurrent.ClosingFuture<V2> r0 = r0.future2
                return r0
        }

        public <U> com.google.common.util.concurrent.ClosingFuture<U> call(com.google.common.util.concurrent.ClosingFuture.Combiner2.ClosingFunction2<V1, V2, U> r2, java.util.concurrent.Executor r3) {
                r1 = this;
                com.google.common.util.concurrent.ClosingFuture$Combiner2$1 r0 = new com.google.common.util.concurrent.ClosingFuture$Combiner2$1
                r0.<init>(r1, r2)
                com.google.common.util.concurrent.ClosingFuture r2 = r1.call(r0, r3)
                return r2
        }

        public <U> com.google.common.util.concurrent.ClosingFuture<U> callAsync(com.google.common.util.concurrent.ClosingFuture.Combiner2.AsyncClosingFunction2<V1, V2, U> r2, java.util.concurrent.Executor r3) {
                r1 = this;
                com.google.common.util.concurrent.ClosingFuture$Combiner2$2 r0 = new com.google.common.util.concurrent.ClosingFuture$Combiner2$2
                r0.<init>(r1, r2)
                com.google.common.util.concurrent.ClosingFuture r2 = r1.callAsync(r0, r3)
                return r2
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class Combiner3<V1, V2, V3> extends com.google.common.util.concurrent.ClosingFuture.Combiner {
        private final com.google.common.util.concurrent.ClosingFuture<V1> future1;
        private final com.google.common.util.concurrent.ClosingFuture<V2> future2;
        private final com.google.common.util.concurrent.ClosingFuture<V3> future3;



        /* JADX INFO: loaded from: classes.dex */
        public interface AsyncClosingFunction3<V1, V2, V3, U> {
            com.google.common.util.concurrent.ClosingFuture<U> apply(com.google.common.util.concurrent.ClosingFuture.DeferredCloser r1, @com.google.common.util.concurrent.ParametricNullness V1 r2, @com.google.common.util.concurrent.ParametricNullness V2 r3, @com.google.common.util.concurrent.ParametricNullness V3 r4) throws java.lang.Exception;
        }

        /* JADX INFO: loaded from: classes.dex */
        public interface ClosingFunction3<V1, V2, V3, U> {
            @com.google.common.util.concurrent.ParametricNullness
            U apply(com.google.common.util.concurrent.ClosingFuture.DeferredCloser r1, @com.google.common.util.concurrent.ParametricNullness V1 r2, @com.google.common.util.concurrent.ParametricNullness V2 r3, @com.google.common.util.concurrent.ParametricNullness V3 r4) throws java.lang.Exception;
        }

        private Combiner3(com.google.common.util.concurrent.ClosingFuture<V1> r4, com.google.common.util.concurrent.ClosingFuture<V2> r5, com.google.common.util.concurrent.ClosingFuture<V3> r6) {
                r3 = this;
                com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of(r4, r5, r6)
                r1 = 1
                r2 = 0
                r3.<init>(r1, r0, r2)
                r3.future1 = r4
                r3.future2 = r5
                r3.future3 = r6
                return
        }

        public /* synthetic */ Combiner3(com.google.common.util.concurrent.ClosingFuture r1, com.google.common.util.concurrent.ClosingFuture r2, com.google.common.util.concurrent.ClosingFuture r3, com.google.common.util.concurrent.ClosingFuture.AnonymousClass1 r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        public static /* synthetic */ com.google.common.util.concurrent.ClosingFuture access$2000(com.google.common.util.concurrent.ClosingFuture.Combiner3 r0) {
                com.google.common.util.concurrent.ClosingFuture<V1> r0 = r0.future1
                return r0
        }

        public static /* synthetic */ com.google.common.util.concurrent.ClosingFuture access$2100(com.google.common.util.concurrent.ClosingFuture.Combiner3 r0) {
                com.google.common.util.concurrent.ClosingFuture<V2> r0 = r0.future2
                return r0
        }

        public static /* synthetic */ com.google.common.util.concurrent.ClosingFuture access$2200(com.google.common.util.concurrent.ClosingFuture.Combiner3 r0) {
                com.google.common.util.concurrent.ClosingFuture<V3> r0 = r0.future3
                return r0
        }

        public <U> com.google.common.util.concurrent.ClosingFuture<U> call(com.google.common.util.concurrent.ClosingFuture.Combiner3.ClosingFunction3<V1, V2, V3, U> r2, java.util.concurrent.Executor r3) {
                r1 = this;
                com.google.common.util.concurrent.ClosingFuture$Combiner3$1 r0 = new com.google.common.util.concurrent.ClosingFuture$Combiner3$1
                r0.<init>(r1, r2)
                com.google.common.util.concurrent.ClosingFuture r2 = r1.call(r0, r3)
                return r2
        }

        public <U> com.google.common.util.concurrent.ClosingFuture<U> callAsync(com.google.common.util.concurrent.ClosingFuture.Combiner3.AsyncClosingFunction3<V1, V2, V3, U> r2, java.util.concurrent.Executor r3) {
                r1 = this;
                com.google.common.util.concurrent.ClosingFuture$Combiner3$2 r0 = new com.google.common.util.concurrent.ClosingFuture$Combiner3$2
                r0.<init>(r1, r2)
                com.google.common.util.concurrent.ClosingFuture r2 = r1.callAsync(r0, r3)
                return r2
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class Combiner4<V1, V2, V3, V4> extends com.google.common.util.concurrent.ClosingFuture.Combiner {
        private final com.google.common.util.concurrent.ClosingFuture<V1> future1;
        private final com.google.common.util.concurrent.ClosingFuture<V2> future2;
        private final com.google.common.util.concurrent.ClosingFuture<V3> future3;
        private final com.google.common.util.concurrent.ClosingFuture<V4> future4;



        /* JADX INFO: loaded from: classes.dex */
        public interface AsyncClosingFunction4<V1, V2, V3, V4, U> {
            com.google.common.util.concurrent.ClosingFuture<U> apply(com.google.common.util.concurrent.ClosingFuture.DeferredCloser r1, @com.google.common.util.concurrent.ParametricNullness V1 r2, @com.google.common.util.concurrent.ParametricNullness V2 r3, @com.google.common.util.concurrent.ParametricNullness V3 r4, @com.google.common.util.concurrent.ParametricNullness V4 r5) throws java.lang.Exception;
        }

        /* JADX INFO: loaded from: classes.dex */
        public interface ClosingFunction4<V1, V2, V3, V4, U> {
            @com.google.common.util.concurrent.ParametricNullness
            U apply(com.google.common.util.concurrent.ClosingFuture.DeferredCloser r1, @com.google.common.util.concurrent.ParametricNullness V1 r2, @com.google.common.util.concurrent.ParametricNullness V2 r3, @com.google.common.util.concurrent.ParametricNullness V3 r4, @com.google.common.util.concurrent.ParametricNullness V4 r5) throws java.lang.Exception;
        }

        private Combiner4(com.google.common.util.concurrent.ClosingFuture<V1> r4, com.google.common.util.concurrent.ClosingFuture<V2> r5, com.google.common.util.concurrent.ClosingFuture<V3> r6, com.google.common.util.concurrent.ClosingFuture<V4> r7) {
                r3 = this;
                com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of(r4, r5, r6, r7)
                r1 = 1
                r2 = 0
                r3.<init>(r1, r0, r2)
                r3.future1 = r4
                r3.future2 = r5
                r3.future3 = r6
                r3.future4 = r7
                return
        }

        public /* synthetic */ Combiner4(com.google.common.util.concurrent.ClosingFuture r1, com.google.common.util.concurrent.ClosingFuture r2, com.google.common.util.concurrent.ClosingFuture r3, com.google.common.util.concurrent.ClosingFuture r4, com.google.common.util.concurrent.ClosingFuture.AnonymousClass1 r5) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        public static /* synthetic */ com.google.common.util.concurrent.ClosingFuture access$2300(com.google.common.util.concurrent.ClosingFuture.Combiner4 r0) {
                com.google.common.util.concurrent.ClosingFuture<V1> r0 = r0.future1
                return r0
        }

        public static /* synthetic */ com.google.common.util.concurrent.ClosingFuture access$2400(com.google.common.util.concurrent.ClosingFuture.Combiner4 r0) {
                com.google.common.util.concurrent.ClosingFuture<V2> r0 = r0.future2
                return r0
        }

        public static /* synthetic */ com.google.common.util.concurrent.ClosingFuture access$2500(com.google.common.util.concurrent.ClosingFuture.Combiner4 r0) {
                com.google.common.util.concurrent.ClosingFuture<V3> r0 = r0.future3
                return r0
        }

        public static /* synthetic */ com.google.common.util.concurrent.ClosingFuture access$2600(com.google.common.util.concurrent.ClosingFuture.Combiner4 r0) {
                com.google.common.util.concurrent.ClosingFuture<V4> r0 = r0.future4
                return r0
        }

        public <U> com.google.common.util.concurrent.ClosingFuture<U> call(com.google.common.util.concurrent.ClosingFuture.Combiner4.ClosingFunction4<V1, V2, V3, V4, U> r2, java.util.concurrent.Executor r3) {
                r1 = this;
                com.google.common.util.concurrent.ClosingFuture$Combiner4$1 r0 = new com.google.common.util.concurrent.ClosingFuture$Combiner4$1
                r0.<init>(r1, r2)
                com.google.common.util.concurrent.ClosingFuture r2 = r1.call(r0, r3)
                return r2
        }

        public <U> com.google.common.util.concurrent.ClosingFuture<U> callAsync(com.google.common.util.concurrent.ClosingFuture.Combiner4.AsyncClosingFunction4<V1, V2, V3, V4, U> r2, java.util.concurrent.Executor r3) {
                r1 = this;
                com.google.common.util.concurrent.ClosingFuture$Combiner4$2 r0 = new com.google.common.util.concurrent.ClosingFuture$Combiner4$2
                r0.<init>(r1, r2)
                com.google.common.util.concurrent.ClosingFuture r2 = r1.callAsync(r0, r3)
                return r2
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class Combiner5<V1, V2, V3, V4, V5> extends com.google.common.util.concurrent.ClosingFuture.Combiner {
        private final com.google.common.util.concurrent.ClosingFuture<V1> future1;
        private final com.google.common.util.concurrent.ClosingFuture<V2> future2;
        private final com.google.common.util.concurrent.ClosingFuture<V3> future3;
        private final com.google.common.util.concurrent.ClosingFuture<V4> future4;
        private final com.google.common.util.concurrent.ClosingFuture<V5> future5;



        public interface AsyncClosingFunction5<V1, V2, V3, V4, V5, U> {
            com.google.common.util.concurrent.ClosingFuture<U> apply(com.google.common.util.concurrent.ClosingFuture.DeferredCloser r1, @com.google.common.util.concurrent.ParametricNullness V1 r2, @com.google.common.util.concurrent.ParametricNullness V2 r3, @com.google.common.util.concurrent.ParametricNullness V3 r4, @com.google.common.util.concurrent.ParametricNullness V4 r5, @com.google.common.util.concurrent.ParametricNullness V5 r6) throws java.lang.Exception;
        }

        public interface ClosingFunction5<V1, V2, V3, V4, V5, U> {
            @com.google.common.util.concurrent.ParametricNullness
            U apply(com.google.common.util.concurrent.ClosingFuture.DeferredCloser r1, @com.google.common.util.concurrent.ParametricNullness V1 r2, @com.google.common.util.concurrent.ParametricNullness V2 r3, @com.google.common.util.concurrent.ParametricNullness V3 r4, @com.google.common.util.concurrent.ParametricNullness V4 r5, @com.google.common.util.concurrent.ParametricNullness V5 r6) throws java.lang.Exception;
        }

        private Combiner5(com.google.common.util.concurrent.ClosingFuture<V1> r4, com.google.common.util.concurrent.ClosingFuture<V2> r5, com.google.common.util.concurrent.ClosingFuture<V3> r6, com.google.common.util.concurrent.ClosingFuture<V4> r7, com.google.common.util.concurrent.ClosingFuture<V5> r8) {
                r3 = this;
                com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of(r4, r5, r6, r7, r8)
                r1 = 1
                r2 = 0
                r3.<init>(r1, r0, r2)
                r3.future1 = r4
                r3.future2 = r5
                r3.future3 = r6
                r3.future4 = r7
                r3.future5 = r8
                return
        }

        public /* synthetic */ Combiner5(com.google.common.util.concurrent.ClosingFuture r1, com.google.common.util.concurrent.ClosingFuture r2, com.google.common.util.concurrent.ClosingFuture r3, com.google.common.util.concurrent.ClosingFuture r4, com.google.common.util.concurrent.ClosingFuture r5, com.google.common.util.concurrent.ClosingFuture.AnonymousClass1 r6) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        public static /* synthetic */ com.google.common.util.concurrent.ClosingFuture access$2700(com.google.common.util.concurrent.ClosingFuture.Combiner5 r0) {
                com.google.common.util.concurrent.ClosingFuture<V1> r0 = r0.future1
                return r0
        }

        public static /* synthetic */ com.google.common.util.concurrent.ClosingFuture access$2800(com.google.common.util.concurrent.ClosingFuture.Combiner5 r0) {
                com.google.common.util.concurrent.ClosingFuture<V2> r0 = r0.future2
                return r0
        }

        public static /* synthetic */ com.google.common.util.concurrent.ClosingFuture access$2900(com.google.common.util.concurrent.ClosingFuture.Combiner5 r0) {
                com.google.common.util.concurrent.ClosingFuture<V3> r0 = r0.future3
                return r0
        }

        public static /* synthetic */ com.google.common.util.concurrent.ClosingFuture access$3000(com.google.common.util.concurrent.ClosingFuture.Combiner5 r0) {
                com.google.common.util.concurrent.ClosingFuture<V4> r0 = r0.future4
                return r0
        }

        public static /* synthetic */ com.google.common.util.concurrent.ClosingFuture access$3100(com.google.common.util.concurrent.ClosingFuture.Combiner5 r0) {
                com.google.common.util.concurrent.ClosingFuture<V5> r0 = r0.future5
                return r0
        }

        public <U> com.google.common.util.concurrent.ClosingFuture<U> call(com.google.common.util.concurrent.ClosingFuture.Combiner5.ClosingFunction5<V1, V2, V3, V4, V5, U> r2, java.util.concurrent.Executor r3) {
                r1 = this;
                com.google.common.util.concurrent.ClosingFuture$Combiner5$1 r0 = new com.google.common.util.concurrent.ClosingFuture$Combiner5$1
                r0.<init>(r1, r2)
                com.google.common.util.concurrent.ClosingFuture r2 = r1.call(r0, r3)
                return r2
        }

        public <U> com.google.common.util.concurrent.ClosingFuture<U> callAsync(com.google.common.util.concurrent.ClosingFuture.Combiner5.AsyncClosingFunction5<V1, V2, V3, V4, V5, U> r2, java.util.concurrent.Executor r3) {
                r1 = this;
                com.google.common.util.concurrent.ClosingFuture$Combiner5$2 r0 = new com.google.common.util.concurrent.ClosingFuture$Combiner5$2
                r0.<init>(r1, r2)
                com.google.common.util.concurrent.ClosingFuture r2 = r1.callAsync(r0, r3)
                return r2
        }
    }

    public static final class DeferredCloser {

        @com.google.j2objc.annotations.RetainedWith
        private final com.google.common.util.concurrent.ClosingFuture.CloseableList list;

        public DeferredCloser(com.google.common.util.concurrent.ClosingFuture.CloseableList r1) {
                r0 = this;
                r0.<init>()
                r0.list = r1
                return
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @com.google.common.util.concurrent.ParametricNullness
        public <C extends java.io.Closeable> C eventuallyClose(@com.google.common.util.concurrent.ParametricNullness C r3, java.util.concurrent.Executor r4) {
                r2 = this;
                com.google.common.base.Preconditions.checkNotNull(r4)
                if (r3 == 0) goto Ld
                com.google.common.util.concurrent.ClosingFuture$CloseableList r0 = r2.list
                r1 = r3
                java.io.Closeable r1 = (java.io.Closeable) r1
                r0.add(r1, r4)
            Ld:
                return r3
        }
    }

    public static final class Peeker {
        private volatile boolean beingCalled;
        private final com.google.common.collect.ImmutableList<com.google.common.util.concurrent.ClosingFuture<?>> futures;

        private Peeker(com.google.common.collect.ImmutableList<com.google.common.util.concurrent.ClosingFuture<?>> r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.collect.ImmutableList r1 = (com.google.common.collect.ImmutableList) r1
                r0.futures = r1
                return
        }

        public /* synthetic */ Peeker(com.google.common.collect.ImmutableList r1, com.google.common.util.concurrent.ClosingFuture.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public static /* synthetic */ java.lang.Object access$1500(com.google.common.util.concurrent.ClosingFuture.Peeker r0, com.google.common.util.concurrent.ClosingFuture.Combiner.CombiningCallable r1, com.google.common.util.concurrent.ClosingFuture.CloseableList r2) throws java.lang.Exception {
                java.lang.Object r0 = r0.call(r1, r2)
                return r0
        }

        public static /* synthetic */ com.google.common.util.concurrent.FluentFuture access$1700(com.google.common.util.concurrent.ClosingFuture.Peeker r0, com.google.common.util.concurrent.ClosingFuture.Combiner.AsyncCombiningCallable r1, com.google.common.util.concurrent.ClosingFuture.CloseableList r2) throws java.lang.Exception {
                com.google.common.util.concurrent.FluentFuture r0 = r0.callAsync(r1, r2)
                return r0
        }

        @com.google.common.util.concurrent.ParametricNullness
        private <V> V call(com.google.common.util.concurrent.ClosingFuture.Combiner.CombiningCallable<V> r4, com.google.common.util.concurrent.ClosingFuture.CloseableList r5) throws java.lang.Exception {
                r3 = this;
                r0 = 1
                r3.beingCalled = r0
                com.google.common.util.concurrent.ClosingFuture$CloseableList r0 = new com.google.common.util.concurrent.ClosingFuture$CloseableList
                r1 = 0
                r0.<init>(r1)
                r1 = 0
                com.google.common.util.concurrent.ClosingFuture$DeferredCloser r2 = com.google.common.util.concurrent.ClosingFuture.CloseableList.access$300(r0)     // Catch: java.lang.Throwable -> L1c
                java.lang.Object r4 = r4.call(r2, r3)     // Catch: java.lang.Throwable -> L1c
                java.util.concurrent.Executor r2 = com.google.common.util.concurrent.MoreExecutors.directExecutor()
                r5.add(r0, r2)
                r3.beingCalled = r1
                return r4
            L1c:
                r4 = move-exception
                java.util.concurrent.Executor r2 = com.google.common.util.concurrent.MoreExecutors.directExecutor()
                r5.add(r0, r2)
                r3.beingCalled = r1
                throw r4
        }

        private <V> com.google.common.util.concurrent.FluentFuture<V> callAsync(com.google.common.util.concurrent.ClosingFuture.Combiner.AsyncCombiningCallable<V> r4, com.google.common.util.concurrent.ClosingFuture.CloseableList r5) throws java.lang.Exception {
                r3 = this;
                r0 = 1
                r3.beingCalled = r0
                com.google.common.util.concurrent.ClosingFuture$CloseableList r0 = new com.google.common.util.concurrent.ClosingFuture$CloseableList
                r1 = 0
                r0.<init>(r1)
                r1 = 0
                com.google.common.util.concurrent.ClosingFuture$DeferredCloser r2 = com.google.common.util.concurrent.ClosingFuture.CloseableList.access$300(r0)     // Catch: java.lang.Throwable -> L23
                com.google.common.util.concurrent.ClosingFuture r4 = r4.call(r2, r3)     // Catch: java.lang.Throwable -> L23
                com.google.common.util.concurrent.ClosingFuture.access$1000(r4, r5)     // Catch: java.lang.Throwable -> L23
                com.google.common.util.concurrent.FluentFuture r4 = com.google.common.util.concurrent.ClosingFuture.access$000(r4)     // Catch: java.lang.Throwable -> L23
                java.util.concurrent.Executor r2 = com.google.common.util.concurrent.MoreExecutors.directExecutor()
                r5.add(r0, r2)
                r3.beingCalled = r1
                return r4
            L23:
                r4 = move-exception
                java.util.concurrent.Executor r2 = com.google.common.util.concurrent.MoreExecutors.directExecutor()
                r5.add(r0, r2)
                r3.beingCalled = r1
                throw r4
        }

        @com.google.common.util.concurrent.ParametricNullness
        public final <D> D getDone(com.google.common.util.concurrent.ClosingFuture<D> r2) throws java.util.concurrent.ExecutionException {
                r1 = this;
                boolean r0 = r1.beingCalled
                com.google.common.base.Preconditions.checkState(r0)
                com.google.common.collect.ImmutableList<com.google.common.util.concurrent.ClosingFuture<?>> r0 = r1.futures
                boolean r0 = r0.contains(r2)
                com.google.common.base.Preconditions.checkArgument(r0)
                com.google.common.util.concurrent.FluentFuture r2 = com.google.common.util.concurrent.ClosingFuture.access$000(r2)
                java.lang.Object r2 = com.google.common.util.concurrent.Futures.getDone(r2)
                return r2
        }
    }

    public static final enum State extends java.lang.Enum<com.google.common.util.concurrent.ClosingFuture.State> {
        private static final /* synthetic */ com.google.common.util.concurrent.ClosingFuture.State[] $VALUES = null;
        public static final com.google.common.util.concurrent.ClosingFuture.State CLOSED = null;
        public static final com.google.common.util.concurrent.ClosingFuture.State CLOSING = null;
        public static final com.google.common.util.concurrent.ClosingFuture.State OPEN = null;
        public static final com.google.common.util.concurrent.ClosingFuture.State SUBSUMED = null;
        public static final com.google.common.util.concurrent.ClosingFuture.State WILL_CLOSE = null;
        public static final com.google.common.util.concurrent.ClosingFuture.State WILL_CREATE_VALUE_AND_CLOSER = null;

        private static /* synthetic */ com.google.common.util.concurrent.ClosingFuture.State[] $values() {
                r0 = 6
                com.google.common.util.concurrent.ClosingFuture$State[] r0 = new com.google.common.util.concurrent.ClosingFuture.State[r0]
                com.google.common.util.concurrent.ClosingFuture$State r1 = com.google.common.util.concurrent.ClosingFuture.State.OPEN
                r2 = 0
                r0[r2] = r1
                com.google.common.util.concurrent.ClosingFuture$State r1 = com.google.common.util.concurrent.ClosingFuture.State.SUBSUMED
                r2 = 1
                r0[r2] = r1
                com.google.common.util.concurrent.ClosingFuture$State r1 = com.google.common.util.concurrent.ClosingFuture.State.WILL_CLOSE
                r2 = 2
                r0[r2] = r1
                com.google.common.util.concurrent.ClosingFuture$State r1 = com.google.common.util.concurrent.ClosingFuture.State.CLOSING
                r2 = 3
                r0[r2] = r1
                com.google.common.util.concurrent.ClosingFuture$State r1 = com.google.common.util.concurrent.ClosingFuture.State.CLOSED
                r2 = 4
                r0[r2] = r1
                com.google.common.util.concurrent.ClosingFuture$State r1 = com.google.common.util.concurrent.ClosingFuture.State.WILL_CREATE_VALUE_AND_CLOSER
                r2 = 5
                r0[r2] = r1
                return r0
        }

        static {
                com.google.common.util.concurrent.ClosingFuture$State r0 = new com.google.common.util.concurrent.ClosingFuture$State
                java.lang.String r1 = "OPEN"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.common.util.concurrent.ClosingFuture.State.OPEN = r0
                com.google.common.util.concurrent.ClosingFuture$State r0 = new com.google.common.util.concurrent.ClosingFuture$State
                java.lang.String r1 = "SUBSUMED"
                r2 = 1
                r0.<init>(r1, r2)
                com.google.common.util.concurrent.ClosingFuture.State.SUBSUMED = r0
                com.google.common.util.concurrent.ClosingFuture$State r0 = new com.google.common.util.concurrent.ClosingFuture$State
                java.lang.String r1 = "WILL_CLOSE"
                r2 = 2
                r0.<init>(r1, r2)
                com.google.common.util.concurrent.ClosingFuture.State.WILL_CLOSE = r0
                com.google.common.util.concurrent.ClosingFuture$State r0 = new com.google.common.util.concurrent.ClosingFuture$State
                java.lang.String r1 = "CLOSING"
                r2 = 3
                r0.<init>(r1, r2)
                com.google.common.util.concurrent.ClosingFuture.State.CLOSING = r0
                com.google.common.util.concurrent.ClosingFuture$State r0 = new com.google.common.util.concurrent.ClosingFuture$State
                java.lang.String r1 = "CLOSED"
                r2 = 4
                r0.<init>(r1, r2)
                com.google.common.util.concurrent.ClosingFuture.State.CLOSED = r0
                com.google.common.util.concurrent.ClosingFuture$State r0 = new com.google.common.util.concurrent.ClosingFuture$State
                java.lang.String r1 = "WILL_CREATE_VALUE_AND_CLOSER"
                r2 = 5
                r0.<init>(r1, r2)
                com.google.common.util.concurrent.ClosingFuture.State.WILL_CREATE_VALUE_AND_CLOSER = r0
                com.google.common.util.concurrent.ClosingFuture$State[] r0 = $values()
                com.google.common.util.concurrent.ClosingFuture.State.$VALUES = r0
                return
        }

        private State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.util.concurrent.ClosingFuture.State valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.util.concurrent.ClosingFuture$State> r0 = com.google.common.util.concurrent.ClosingFuture.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.util.concurrent.ClosingFuture$State r1 = (com.google.common.util.concurrent.ClosingFuture.State) r1
                return r1
        }

        public static com.google.common.util.concurrent.ClosingFuture.State[] values() {
                com.google.common.util.concurrent.ClosingFuture$State[] r0 = com.google.common.util.concurrent.ClosingFuture.State.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.util.concurrent.ClosingFuture$State[] r0 = (com.google.common.util.concurrent.ClosingFuture.State[]) r0
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class ValueAndCloser<V> {
        private final com.google.common.util.concurrent.ClosingFuture<? extends V> closingFuture;

        public ValueAndCloser(com.google.common.util.concurrent.ClosingFuture<? extends V> r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.util.concurrent.ClosingFuture r1 = (com.google.common.util.concurrent.ClosingFuture) r1
                r0.closingFuture = r1
                return
        }

        public void closeAsync() {
                r1 = this;
                com.google.common.util.concurrent.ClosingFuture<? extends V> r0 = r1.closingFuture
                com.google.common.util.concurrent.ClosingFuture.access$100(r0)
                return
        }

        @com.google.common.util.concurrent.ParametricNullness
        public V get() throws java.util.concurrent.ExecutionException {
                r1 = this;
                com.google.common.util.concurrent.ClosingFuture<? extends V> r0 = r1.closingFuture
                com.google.common.util.concurrent.FluentFuture r0 = com.google.common.util.concurrent.ClosingFuture.access$000(r0)
                java.lang.Object r0 = com.google.common.util.concurrent.Futures.getDone(r0)
                return r0
        }
    }

    public interface ValueAndCloserConsumer<V> {
        void accept(com.google.common.util.concurrent.ClosingFuture.ValueAndCloser<V> r1);
    }

    static {
            java.lang.Class<com.google.common.util.concurrent.ClosingFuture> r0 = com.google.common.util.concurrent.ClosingFuture.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.common.util.concurrent.ClosingFuture.logger = r0
            return
    }

    private ClosingFuture(com.google.common.util.concurrent.ClosingFuture.AsyncClosingCallable<V> r3, java.util.concurrent.Executor r4) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            com.google.common.util.concurrent.ClosingFuture$State r1 = com.google.common.util.concurrent.ClosingFuture.State.OPEN
            r0.<init>(r1)
            r2.state = r0
            com.google.common.util.concurrent.ClosingFuture$CloseableList r0 = new com.google.common.util.concurrent.ClosingFuture$CloseableList
            r1 = 0
            r0.<init>(r1)
            r2.closeables = r0
            com.google.common.base.Preconditions.checkNotNull(r3)
            com.google.common.util.concurrent.ClosingFuture$3 r0 = new com.google.common.util.concurrent.ClosingFuture$3
            r0.<init>(r2, r3)
            com.google.common.util.concurrent.TrustedListenableFutureTask r3 = new com.google.common.util.concurrent.TrustedListenableFutureTask
            r3.<init>(r0)
            r4.execute(r3)
            r2.future = r3
            return
    }

    private ClosingFuture(com.google.common.util.concurrent.ClosingFuture.ClosingCallable<V> r3, java.util.concurrent.Executor r4) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            com.google.common.util.concurrent.ClosingFuture$State r1 = com.google.common.util.concurrent.ClosingFuture.State.OPEN
            r0.<init>(r1)
            r2.state = r0
            com.google.common.util.concurrent.ClosingFuture$CloseableList r0 = new com.google.common.util.concurrent.ClosingFuture$CloseableList
            r1 = 0
            r0.<init>(r1)
            r2.closeables = r0
            com.google.common.base.Preconditions.checkNotNull(r3)
            com.google.common.util.concurrent.ClosingFuture$2 r0 = new com.google.common.util.concurrent.ClosingFuture$2
            r0.<init>(r2, r3)
            com.google.common.util.concurrent.TrustedListenableFutureTask r3 = new com.google.common.util.concurrent.TrustedListenableFutureTask
            r3.<init>(r0)
            r4.execute(r3)
            r2.future = r3
            return
    }

    private ClosingFuture(com.google.common.util.concurrent.ListenableFuture<V> r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            com.google.common.util.concurrent.ClosingFuture$State r1 = com.google.common.util.concurrent.ClosingFuture.State.OPEN
            r0.<init>(r1)
            r2.state = r0
            com.google.common.util.concurrent.ClosingFuture$CloseableList r0 = new com.google.common.util.concurrent.ClosingFuture$CloseableList
            r1 = 0
            r0.<init>(r1)
            r2.closeables = r0
            com.google.common.util.concurrent.FluentFuture r3 = com.google.common.util.concurrent.FluentFuture.from(r3)
            r2.future = r3
            return
    }

    public /* synthetic */ ClosingFuture(com.google.common.util.concurrent.ListenableFuture r1, com.google.common.util.concurrent.ClosingFuture.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static /* synthetic */ com.google.common.util.concurrent.FluentFuture access$000(com.google.common.util.concurrent.ClosingFuture r0) {
            com.google.common.util.concurrent.FluentFuture<V> r0 = r0.future
            return r0
    }

    public static /* synthetic */ void access$100(com.google.common.util.concurrent.ClosingFuture r0) {
            r0.close()
            return
    }

    public static /* synthetic */ void access$1000(com.google.common.util.concurrent.ClosingFuture r0, com.google.common.util.concurrent.ClosingFuture.CloseableList r1) {
            r0.becomeSubsumedInto(r1)
            return
    }

    public static /* synthetic */ void access$1100(com.google.common.util.concurrent.ClosingFuture r0, com.google.common.util.concurrent.ClosingFuture.State r1, com.google.common.util.concurrent.ClosingFuture.State r2) {
            r0.checkAndUpdateState(r1, r2)
            return
    }

    public static /* synthetic */ void access$1200(com.google.common.util.concurrent.ClosingFuture.ValueAndCloserConsumer r0, com.google.common.util.concurrent.ClosingFuture r1) {
            provideValueAndCloser(r0, r1)
            return
    }

    public static /* synthetic */ com.google.common.util.concurrent.ClosingFuture.CloseableList access$200(com.google.common.util.concurrent.ClosingFuture r0) {
            com.google.common.util.concurrent.ClosingFuture$CloseableList r0 = r0.closeables
            return r0
    }

    public static /* synthetic */ java.util.logging.Logger access$3200() {
            java.util.logging.Logger r0 = com.google.common.util.concurrent.ClosingFuture.logger
            return r0
    }

    public static /* synthetic */ void access$3300(java.io.Closeable r0, java.util.concurrent.Executor r1) {
            closeQuietly(r0, r1)
            return
    }

    private void becomeSubsumedInto(com.google.common.util.concurrent.ClosingFuture.CloseableList r3) {
            r2 = this;
            com.google.common.util.concurrent.ClosingFuture$State r0 = com.google.common.util.concurrent.ClosingFuture.State.OPEN
            com.google.common.util.concurrent.ClosingFuture$State r1 = com.google.common.util.concurrent.ClosingFuture.State.SUBSUMED
            r2.checkAndUpdateState(r0, r1)
            com.google.common.util.concurrent.ClosingFuture$CloseableList r0 = r2.closeables
            java.util.concurrent.Executor r1 = com.google.common.util.concurrent.MoreExecutors.directExecutor()
            r3.add(r0, r1)
            return
    }

    private <X extends java.lang.Throwable, W extends V> com.google.common.util.concurrent.ClosingFuture<V> catchingAsyncMoreGeneric(java.lang.Class<X> r2, com.google.common.util.concurrent.ClosingFuture.AsyncClosingFunction<? super X, W> r3, java.util.concurrent.Executor r4) {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r3)
            com.google.common.util.concurrent.ClosingFuture$8 r0 = new com.google.common.util.concurrent.ClosingFuture$8
            r0.<init>(r1, r3)
            com.google.common.util.concurrent.FluentFuture<V> r3 = r1.future
            com.google.common.util.concurrent.FluentFuture r2 = r3.catchingAsync(r2, r0, r4)
            com.google.common.util.concurrent.ClosingFuture r2 = r1.derive(r2)
            return r2
    }

    private <X extends java.lang.Throwable, W extends V> com.google.common.util.concurrent.ClosingFuture<V> catchingMoreGeneric(java.lang.Class<X> r2, com.google.common.util.concurrent.ClosingFuture.ClosingFunction<? super X, W> r3, java.util.concurrent.Executor r4) {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r3)
            com.google.common.util.concurrent.ClosingFuture$7 r0 = new com.google.common.util.concurrent.ClosingFuture$7
            r0.<init>(r1, r3)
            com.google.common.util.concurrent.FluentFuture<V> r3 = r1.future
            com.google.common.util.concurrent.FluentFuture r2 = r3.catchingAsync(r2, r0, r4)
            com.google.common.util.concurrent.ClosingFuture r2 = r1.derive(r2)
            return r2
    }

    private void checkAndUpdateState(com.google.common.util.concurrent.ClosingFuture.State r3, com.google.common.util.concurrent.ClosingFuture.State r4) {
            r2 = this;
            boolean r0 = r2.compareAndUpdateState(r3, r4)
            java.lang.String r1 = "Expected state to be %s, but it was %s"
            com.google.common.base.Preconditions.checkState(r0, r1, r3, r4)
            return
    }

    private void close() {
            r3 = this;
            java.util.logging.Logger r0 = com.google.common.util.concurrent.ClosingFuture.logger
            java.util.logging.Level r1 = java.util.logging.Level.FINER
            java.lang.String r2 = "closing {0}"
            r0.log(r1, r2, r3)
            com.google.common.util.concurrent.ClosingFuture$CloseableList r0 = r3.closeables
            r0.close()
            return
    }

    private static void closeQuietly(@javax.annotation.CheckForNull java.io.Closeable r5, java.util.concurrent.Executor r6) {
            if (r5 != 0) goto L3
            return
        L3:
            com.google.common.util.concurrent.ClosingFuture$11 r0 = new com.google.common.util.concurrent.ClosingFuture$11     // Catch: java.util.concurrent.RejectedExecutionException -> Lc
            r0.<init>(r5)     // Catch: java.util.concurrent.RejectedExecutionException -> Lc
            r6.execute(r0)     // Catch: java.util.concurrent.RejectedExecutionException -> Lc
            goto L2e
        Lc:
            r0 = move-exception
            java.util.logging.Logger r1 = com.google.common.util.concurrent.ClosingFuture.logger
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            boolean r3 = r1.isLoggable(r2)
            if (r3 == 0) goto L27
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r6
            java.lang.String r6 = "while submitting close to %s; will close inline"
            java.lang.String r6 = java.lang.String.format(r6, r3)
            r1.log(r2, r6, r0)
        L27:
            java.util.concurrent.Executor r6 = com.google.common.util.concurrent.MoreExecutors.directExecutor()
            closeQuietly(r5, r6)
        L2e:
            return
    }

    private boolean compareAndUpdateState(com.google.common.util.concurrent.ClosingFuture.State r2, com.google.common.util.concurrent.ClosingFuture.State r3) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<com.google.common.util.concurrent.ClosingFuture$State> r0 = r1.state
            boolean r2 = r0.compareAndSet(r2, r3)
            return r2
    }

    private <U> com.google.common.util.concurrent.ClosingFuture<U> derive(com.google.common.util.concurrent.FluentFuture<U> r2) {
            r1 = this;
            com.google.common.util.concurrent.ClosingFuture r0 = new com.google.common.util.concurrent.ClosingFuture
            r0.<init>(r2)
            com.google.common.util.concurrent.ClosingFuture$CloseableList r2 = r0.closeables
            r1.becomeSubsumedInto(r2)
            return r0
    }

    @java.lang.Deprecated
    public static <C extends java.io.Closeable> com.google.common.util.concurrent.ClosingFuture<C> eventuallyClosing(com.google.common.util.concurrent.ListenableFuture<C> r2, java.util.concurrent.Executor r3) {
            com.google.common.base.Preconditions.checkNotNull(r3)
            com.google.common.util.concurrent.ClosingFuture r0 = new com.google.common.util.concurrent.ClosingFuture
            com.google.common.util.concurrent.ListenableFuture r1 = com.google.common.util.concurrent.Futures.nonCancellationPropagating(r2)
            r0.<init>(r1)
            com.google.common.util.concurrent.ClosingFuture$1 r1 = new com.google.common.util.concurrent.ClosingFuture$1
            r1.<init>(r0, r3)
            java.util.concurrent.Executor r3 = com.google.common.util.concurrent.MoreExecutors.directExecutor()
            com.google.common.util.concurrent.Futures.addCallback(r2, r1, r3)
            return r0
    }

    public static <V> com.google.common.util.concurrent.ClosingFuture<V> from(com.google.common.util.concurrent.ListenableFuture<V> r1) {
            com.google.common.util.concurrent.ClosingFuture r0 = new com.google.common.util.concurrent.ClosingFuture
            r0.<init>(r1)
            return r0
    }

    private static <C, V extends C> void provideValueAndCloser(com.google.common.util.concurrent.ClosingFuture.ValueAndCloserConsumer<C> r1, com.google.common.util.concurrent.ClosingFuture<V> r2) {
            com.google.common.util.concurrent.ClosingFuture$ValueAndCloser r0 = new com.google.common.util.concurrent.ClosingFuture$ValueAndCloser
            r0.<init>(r2)
            r1.accept(r0)
            return
    }

    public static <V> com.google.common.util.concurrent.ClosingFuture<V> submit(com.google.common.util.concurrent.ClosingFuture.ClosingCallable<V> r1, java.util.concurrent.Executor r2) {
            com.google.common.util.concurrent.ClosingFuture r0 = new com.google.common.util.concurrent.ClosingFuture
            r0.<init>(r1, r2)
            return r0
    }

    public static <V> com.google.common.util.concurrent.ClosingFuture<V> submitAsync(com.google.common.util.concurrent.ClosingFuture.AsyncClosingCallable<V> r1, java.util.concurrent.Executor r2) {
            com.google.common.util.concurrent.ClosingFuture r0 = new com.google.common.util.concurrent.ClosingFuture
            r0.<init>(r1, r2)
            return r0
    }

    public static com.google.common.util.concurrent.ClosingFuture.Combiner whenAllComplete(com.google.common.util.concurrent.ClosingFuture<?> r0, com.google.common.util.concurrent.ClosingFuture<?>... r1) {
            java.util.List r0 = com.google.common.collect.Lists.asList(r0, r1)
            com.google.common.util.concurrent.ClosingFuture$Combiner r0 = whenAllComplete(r0)
            return r0
    }

    public static com.google.common.util.concurrent.ClosingFuture.Combiner whenAllComplete(java.lang.Iterable<? extends com.google.common.util.concurrent.ClosingFuture<?>> r3) {
            com.google.common.util.concurrent.ClosingFuture$Combiner r0 = new com.google.common.util.concurrent.ClosingFuture$Combiner
            r1 = 0
            r2 = 0
            r0.<init>(r1, r3, r2)
            return r0
    }

    public static <V1, V2> com.google.common.util.concurrent.ClosingFuture.Combiner2<V1, V2> whenAllSucceed(com.google.common.util.concurrent.ClosingFuture<V1> r2, com.google.common.util.concurrent.ClosingFuture<V2> r3) {
            com.google.common.util.concurrent.ClosingFuture$Combiner2 r0 = new com.google.common.util.concurrent.ClosingFuture$Combiner2
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static <V1, V2, V3> com.google.common.util.concurrent.ClosingFuture.Combiner3<V1, V2, V3> whenAllSucceed(com.google.common.util.concurrent.ClosingFuture<V1> r2, com.google.common.util.concurrent.ClosingFuture<V2> r3, com.google.common.util.concurrent.ClosingFuture<V3> r4) {
            com.google.common.util.concurrent.ClosingFuture$Combiner3 r0 = new com.google.common.util.concurrent.ClosingFuture$Combiner3
            r1 = 0
            r0.<init>(r2, r3, r4, r1)
            return r0
    }

    public static <V1, V2, V3, V4> com.google.common.util.concurrent.ClosingFuture.Combiner4<V1, V2, V3, V4> whenAllSucceed(com.google.common.util.concurrent.ClosingFuture<V1> r7, com.google.common.util.concurrent.ClosingFuture<V2> r8, com.google.common.util.concurrent.ClosingFuture<V3> r9, com.google.common.util.concurrent.ClosingFuture<V4> r10) {
            com.google.common.util.concurrent.ClosingFuture$Combiner4 r6 = new com.google.common.util.concurrent.ClosingFuture$Combiner4
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    public static <V1, V2, V3, V4, V5> com.google.common.util.concurrent.ClosingFuture.Combiner5<V1, V2, V3, V4, V5> whenAllSucceed(com.google.common.util.concurrent.ClosingFuture<V1> r8, com.google.common.util.concurrent.ClosingFuture<V2> r9, com.google.common.util.concurrent.ClosingFuture<V3> r10, com.google.common.util.concurrent.ClosingFuture<V4> r11, com.google.common.util.concurrent.ClosingFuture<V5> r12) {
            com.google.common.util.concurrent.ClosingFuture$Combiner5 r7 = new com.google.common.util.concurrent.ClosingFuture$Combiner5
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static com.google.common.util.concurrent.ClosingFuture.Combiner whenAllSucceed(com.google.common.util.concurrent.ClosingFuture<?> r2, com.google.common.util.concurrent.ClosingFuture<?> r3, com.google.common.util.concurrent.ClosingFuture<?> r4, com.google.common.util.concurrent.ClosingFuture<?> r5, com.google.common.util.concurrent.ClosingFuture<?> r6, com.google.common.util.concurrent.ClosingFuture<?> r7, com.google.common.util.concurrent.ClosingFuture<?>... r8) {
            r0 = 5
            com.google.common.util.concurrent.ClosingFuture[] r0 = new com.google.common.util.concurrent.ClosingFuture[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            r3 = 3
            r0[r3] = r6
            r3 = 4
            r0[r3] = r7
            com.google.common.collect.FluentIterable r2 = com.google.common.collect.FluentIterable.of(r2, r0)
            com.google.common.collect.FluentIterable r2 = r2.append(r8)
            com.google.common.util.concurrent.ClosingFuture$Combiner r2 = whenAllSucceed(r2)
            return r2
    }

    public static com.google.common.util.concurrent.ClosingFuture.Combiner whenAllSucceed(java.lang.Iterable<? extends com.google.common.util.concurrent.ClosingFuture<?>> r3) {
            com.google.common.util.concurrent.ClosingFuture$Combiner r0 = new com.google.common.util.concurrent.ClosingFuture$Combiner
            r1 = 1
            r2 = 0
            r0.<init>(r1, r3, r2)
            return r0
    }

    public static <V, U> com.google.common.util.concurrent.ClosingFuture.AsyncClosingFunction<V, U> withoutCloser(com.google.common.util.concurrent.AsyncFunction<V, U> r1) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.util.concurrent.ClosingFuture$6 r0 = new com.google.common.util.concurrent.ClosingFuture$6
            r0.<init>(r1)
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean cancel(boolean r4) {
            r3 = this;
            java.util.logging.Logger r0 = com.google.common.util.concurrent.ClosingFuture.logger
            java.util.logging.Level r1 = java.util.logging.Level.FINER
            java.lang.String r2 = "cancelling {0}"
            r0.log(r1, r2, r3)
            com.google.common.util.concurrent.FluentFuture<V> r0 = r3.future
            boolean r4 = r0.cancel(r4)
            if (r4 == 0) goto L14
            r3.close()
        L14:
            return r4
    }

    public <X extends java.lang.Throwable> com.google.common.util.concurrent.ClosingFuture<V> catching(java.lang.Class<X> r1, com.google.common.util.concurrent.ClosingFuture.ClosingFunction<? super X, ? extends V> r2, java.util.concurrent.Executor r3) {
            r0 = this;
            com.google.common.util.concurrent.ClosingFuture r1 = r0.catchingMoreGeneric(r1, r2, r3)
            return r1
    }

    public <X extends java.lang.Throwable> com.google.common.util.concurrent.ClosingFuture<V> catchingAsync(java.lang.Class<X> r1, com.google.common.util.concurrent.ClosingFuture.AsyncClosingFunction<? super X, ? extends V> r2, java.util.concurrent.Executor r3) {
            r0 = this;
            com.google.common.util.concurrent.ClosingFuture r1 = r0.catchingAsyncMoreGeneric(r1, r2, r3)
            return r1
    }

    public final void finalize() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReference<com.google.common.util.concurrent.ClosingFuture$State> r0 = r3.state
            java.lang.Object r0 = r0.get()
            com.google.common.util.concurrent.ClosingFuture$State r0 = (com.google.common.util.concurrent.ClosingFuture.State) r0
            com.google.common.util.concurrent.ClosingFuture$State r1 = com.google.common.util.concurrent.ClosingFuture.State.OPEN
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1c
            java.util.logging.Logger r0 = com.google.common.util.concurrent.ClosingFuture.logger
            java.util.logging.Level r1 = java.util.logging.Level.SEVERE
            java.lang.String r2 = "Uh oh! An open ClosingFuture has leaked and will close: {0}"
            r0.log(r1, r2, r3)
            r3.finishToFuture()
        L1c:
            return
    }

    public com.google.common.util.concurrent.FluentFuture<V> finishToFuture() {
            r3 = this;
            com.google.common.util.concurrent.ClosingFuture$State r0 = com.google.common.util.concurrent.ClosingFuture.State.OPEN
            com.google.common.util.concurrent.ClosingFuture$State r1 = com.google.common.util.concurrent.ClosingFuture.State.WILL_CLOSE
            boolean r0 = r3.compareAndUpdateState(r0, r1)
            if (r0 == 0) goto L23
            java.util.logging.Logger r0 = com.google.common.util.concurrent.ClosingFuture.logger
            java.util.logging.Level r1 = java.util.logging.Level.FINER
            java.lang.String r2 = "will close {0}"
            r0.log(r1, r2, r3)
            com.google.common.util.concurrent.FluentFuture<V> r0 = r3.future
            com.google.common.util.concurrent.ClosingFuture$9 r1 = new com.google.common.util.concurrent.ClosingFuture$9
            r1.<init>(r3)
            java.util.concurrent.Executor r2 = com.google.common.util.concurrent.MoreExecutors.directExecutor()
            r0.addListener(r1, r2)
            goto L55
        L23:
            int[] r0 = com.google.common.util.concurrent.ClosingFuture.AnonymousClass12.$SwitchMap$com$google$common$util$concurrent$ClosingFuture$State
            java.util.concurrent.atomic.AtomicReference<com.google.common.util.concurrent.ClosingFuture$State> r1 = r3.state
            java.lang.Object r1 = r1.get()
            com.google.common.util.concurrent.ClosingFuture$State r1 = (com.google.common.util.concurrent.ClosingFuture.State) r1
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L4d;
                case 2: goto L45;
                case 3: goto L3d;
                case 4: goto L3d;
                case 5: goto L3d;
                case 6: goto L37;
                default: goto L36;
            }
        L36:
            goto L55
        L37:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L3d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot call finishToFuture() twice"
            r0.<init>(r1)
            throw r0
        L45:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot call finishToFuture() after calling finishToValueAndCloser()"
            r0.<init>(r1)
            throw r0
        L4d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot call finishToFuture() after deriving another step"
            r0.<init>(r1)
            throw r0
        L55:
            com.google.common.util.concurrent.FluentFuture<V> r0 = r3.future
            return r0
    }

    public void finishToValueAndCloser(com.google.common.util.concurrent.ClosingFuture.ValueAndCloserConsumer<? super V> r3, java.util.concurrent.Executor r4) {
            r2 = this;
            com.google.common.base.Preconditions.checkNotNull(r3)
            com.google.common.util.concurrent.ClosingFuture$State r0 = com.google.common.util.concurrent.ClosingFuture.State.OPEN
            com.google.common.util.concurrent.ClosingFuture$State r1 = com.google.common.util.concurrent.ClosingFuture.State.WILL_CREATE_VALUE_AND_CLOSER
            boolean r0 = r2.compareAndUpdateState(r0, r1)
            if (r0 != 0) goto L4c
            int[] r3 = com.google.common.util.concurrent.ClosingFuture.AnonymousClass12.$SwitchMap$com$google$common$util$concurrent$ClosingFuture$State
            java.util.concurrent.atomic.AtomicReference<com.google.common.util.concurrent.ClosingFuture$State> r4 = r2.state
            java.lang.Object r4 = r4.get()
            com.google.common.util.concurrent.ClosingFuture$State r4 = (com.google.common.util.concurrent.ClosingFuture.State) r4
            int r4 = r4.ordinal()
            r3 = r3[r4]
            r4 = 1
            if (r3 == r4) goto L44
            r4 = 2
            if (r3 == r4) goto L3c
            r4 = 3
            if (r3 == r4) goto L34
            r4 = 4
            if (r3 == r4) goto L34
            r4 = 5
            if (r3 == r4) goto L34
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.util.concurrent.atomic.AtomicReference<com.google.common.util.concurrent.ClosingFuture$State> r4 = r2.state
            r3.<init>(r4)
            throw r3
        L34:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Cannot call finishToValueAndCloser() after calling finishToFuture()"
            r3.<init>(r4)
            throw r3
        L3c:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Cannot call finishToValueAndCloser() twice"
            r3.<init>(r4)
            throw r3
        L44:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Cannot call finishToValueAndCloser() after deriving another step"
            r3.<init>(r4)
            throw r3
        L4c:
            com.google.common.util.concurrent.FluentFuture<V> r0 = r2.future
            com.google.common.util.concurrent.ClosingFuture$10 r1 = new com.google.common.util.concurrent.ClosingFuture$10
            r1.<init>(r2, r3)
            r0.addListener(r1, r4)
            return
    }

    public com.google.common.util.concurrent.ListenableFuture<?> statusFuture() {
            r3 = this;
            com.google.common.util.concurrent.FluentFuture<V> r0 = r3.future
            r1 = 0
            com.google.common.base.Function r1 = com.google.common.base.Functions.constant(r1)
            java.util.concurrent.Executor r2 = com.google.common.util.concurrent.MoreExecutors.directExecutor()
            com.google.common.util.concurrent.FluentFuture r0 = r0.transform(r1, r2)
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.common.util.concurrent.Futures.nonCancellationPropagating(r0)
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            com.google.common.base.MoreObjects$ToStringHelper r0 = com.google.common.base.MoreObjects.toStringHelper(r3)
            java.util.concurrent.atomic.AtomicReference<com.google.common.util.concurrent.ClosingFuture$State> r1 = r3.state
            java.lang.Object r1 = r1.get()
            java.lang.String r2 = "state"
            com.google.common.base.MoreObjects$ToStringHelper r0 = r0.add(r2, r1)
            com.google.common.util.concurrent.FluentFuture<V> r1 = r3.future
            com.google.common.base.MoreObjects$ToStringHelper r0 = r0.addValue(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public <U> com.google.common.util.concurrent.ClosingFuture<U> transform(com.google.common.util.concurrent.ClosingFuture.ClosingFunction<? super V, U> r2, java.util.concurrent.Executor r3) {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.util.concurrent.ClosingFuture$4 r0 = new com.google.common.util.concurrent.ClosingFuture$4
            r0.<init>(r1, r2)
            com.google.common.util.concurrent.FluentFuture<V> r2 = r1.future
            com.google.common.util.concurrent.FluentFuture r2 = r2.transformAsync(r0, r3)
            com.google.common.util.concurrent.ClosingFuture r2 = r1.derive(r2)
            return r2
    }

    public <U> com.google.common.util.concurrent.ClosingFuture<U> transformAsync(com.google.common.util.concurrent.ClosingFuture.AsyncClosingFunction<? super V, U> r2, java.util.concurrent.Executor r3) {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.util.concurrent.ClosingFuture$5 r0 = new com.google.common.util.concurrent.ClosingFuture$5
            r0.<init>(r1, r2)
            com.google.common.util.concurrent.FluentFuture<V> r2 = r1.future
            com.google.common.util.concurrent.FluentFuture r2 = r2.transformAsync(r0, r3)
            com.google.common.util.concurrent.ClosingFuture r2 = r1.derive(r2)
            return r2
    }
}
