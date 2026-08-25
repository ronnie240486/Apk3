package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtCompatible(emulated = true)
public final class MoreExecutors {



    /* JADX INFO: renamed from: com.google.common.util.concurrent.MoreExecutors$3, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    class AnonymousClass3 extends com.google.common.util.concurrent.WrappingExecutorService {
        @Override // com.google.common.util.concurrent.WrappingExecutorService
        public final java.lang.Runnable wrapTask(java.lang.Runnable r2) {
                r1 = this;
                r0 = 0
                java.lang.Runnable r2 = com.google.common.util.concurrent.Callables.threadRenaming(r2, r0)
                return r2
        }

        @Override // com.google.common.util.concurrent.WrappingExecutorService
        public final <T> java.util.concurrent.Callable<T> wrapTask(java.util.concurrent.Callable<T> r3) {
                r2 = this;
                r0 = 0
                com.google.common.base.Preconditions.checkNotNull(r0)
                com.google.common.base.Preconditions.checkNotNull(r3)
                com.google.common.util.concurrent.Callables$3 r1 = new com.google.common.util.concurrent.Callables$3
                r1.<init>(r0, r3)
                return r1
        }
    }



    /* JADX INFO: loaded from: classes.dex */
    @com.google.common.annotations.VisibleForTesting
    @com.google.common.annotations.GwtIncompatible
    public static class Application {


        public Application() {
                r0 = this;
                r0.<init>()
                return
        }

        public final void addDelayedShutdownHook(java.util.concurrent.ExecutorService r4, long r5, java.util.concurrent.TimeUnit r7) {
                r3 = this;
                com.google.common.base.Preconditions.checkNotNull(r4)
                com.google.common.base.Preconditions.checkNotNull(r7)
                java.lang.String r0 = java.lang.String.valueOf(r4)
                int r1 = r0.length()
                int r1 = r1 + 24
                java.lang.String r2 = "DelayedShutdownHook-for-"
                java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r0)
                com.google.common.util.concurrent.MoreExecutors$Application$1 r1 = new com.google.common.util.concurrent.MoreExecutors$Application$1
                r1.<init>(r4, r5, r7)
                java.lang.Thread r4 = com.google.common.util.concurrent.MoreExecutors.newThread(r0, r1)
                java.lang.Runtime r5 = java.lang.Runtime.getRuntime()
                r5.addShutdownHook(r4)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @com.google.common.annotations.GwtIncompatible
    public static final class DirectExecutorService extends com.google.common.util.concurrent.AbstractListeningExecutorService {
        private final java.lang.Object lock;

        @com.google.errorprone.annotations.concurrent.GuardedBy("lock")
        private int runningTasks;

        @com.google.errorprone.annotations.concurrent.GuardedBy("lock")
        private boolean shutdown;

        private DirectExecutorService() {
                r1 = this;
                r1.<init>()
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                r1.lock = r0
                r0 = 0
                r1.runningTasks = r0
                r1.shutdown = r0
                return
        }

        public /* synthetic */ DirectExecutorService(com.google.common.util.concurrent.MoreExecutors.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        private void endTask() {
                r2 = this;
                java.lang.Object r0 = r2.lock
                monitor-enter(r0)
                int r1 = r2.runningTasks     // Catch: java.lang.Throwable -> L12
                int r1 = r1 + (-1)
                r2.runningTasks = r1     // Catch: java.lang.Throwable -> L12
                if (r1 != 0) goto L10
                java.lang.Object r1 = r2.lock     // Catch: java.lang.Throwable -> L12
                r1.notifyAll()     // Catch: java.lang.Throwable -> L12
            L10:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
                return
            L12:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
                throw r1
        }

        private void startTask() {
                r3 = this;
                java.lang.Object r0 = r3.lock
                monitor-enter(r0)
                boolean r1 = r3.shutdown     // Catch: java.lang.Throwable -> L17
                if (r1 != 0) goto Lf
                int r1 = r3.runningTasks     // Catch: java.lang.Throwable -> L17
                int r1 = r1 + 1
                r3.runningTasks = r1     // Catch: java.lang.Throwable -> L17
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
                return
            Lf:
                java.util.concurrent.RejectedExecutionException r1 = new java.util.concurrent.RejectedExecutionException     // Catch: java.lang.Throwable -> L17
                java.lang.String r2 = "Executor already shutdown"
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L17
                throw r1     // Catch: java.lang.Throwable -> L17
            L17:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
                throw r1
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean awaitTermination(long r5, java.util.concurrent.TimeUnit r7) throws java.lang.InterruptedException {
                r4 = this;
                long r5 = r7.toNanos(r5)
                java.lang.Object r7 = r4.lock
                monitor-enter(r7)
            L7:
                boolean r0 = r4.shutdown     // Catch: java.lang.Throwable -> L2d
                if (r0 == 0) goto L12
                int r0 = r4.runningTasks     // Catch: java.lang.Throwable -> L2d
                if (r0 != 0) goto L12
                r5 = 1
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L2d
                return r5
            L12:
                r0 = 0
                int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r2 > 0) goto L1b
                r5 = 0
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L2d
                return r5
            L1b:
                long r0 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L2d
                java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L2d
                java.lang.Object r3 = r4.lock     // Catch: java.lang.Throwable -> L2d
                r2.timedWait(r3, r5)     // Catch: java.lang.Throwable -> L2d
                long r2 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L2d
                long r2 = r2 - r0
                long r5 = r5 - r2
                goto L7
            L2d:
                r5 = move-exception
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L2d
                throw r5
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable r1) {
                r0 = this;
                r0.startTask()
                r1.run()     // Catch: java.lang.Throwable -> La
                r0.endTask()
                return
            La:
                r1 = move-exception
                r0.endTask()
                throw r1
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isShutdown() {
                r2 = this;
                java.lang.Object r0 = r2.lock
                monitor-enter(r0)
                boolean r1 = r2.shutdown     // Catch: java.lang.Throwable -> L7
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
                return r1
            L7:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
                throw r1
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isTerminated() {
                r2 = this;
                java.lang.Object r0 = r2.lock
                monitor-enter(r0)
                boolean r1 = r2.shutdown     // Catch: java.lang.Throwable -> L10
                if (r1 == 0) goto Ld
                int r1 = r2.runningTasks     // Catch: java.lang.Throwable -> L10
                if (r1 != 0) goto Ld
                r1 = 1
                goto Le
            Ld:
                r1 = 0
            Le:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
                return r1
            L10:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
                throw r1
        }

        @Override // java.util.concurrent.ExecutorService
        public void shutdown() {
                r2 = this;
                java.lang.Object r0 = r2.lock
                monitor-enter(r0)
                r1 = 1
                r2.shutdown = r1     // Catch: java.lang.Throwable -> L11
                int r1 = r2.runningTasks     // Catch: java.lang.Throwable -> L11
                if (r1 != 0) goto Lf
                java.lang.Object r1 = r2.lock     // Catch: java.lang.Throwable -> L11
                r1.notifyAll()     // Catch: java.lang.Throwable -> L11
            Lf:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
                return
            L11:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
                throw r1
        }

        @Override // java.util.concurrent.ExecutorService
        public java.util.List<java.lang.Runnable> shutdownNow() {
                r1 = this;
                r1.shutdown()
                java.util.List r0 = java.util.Collections.emptyList()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @com.google.common.annotations.GwtIncompatible
    public static class ListeningDecorator extends com.google.common.util.concurrent.AbstractListeningExecutorService {
        private final java.util.concurrent.ExecutorService delegate;

        public ListeningDecorator(java.util.concurrent.ExecutorService r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.util.concurrent.ExecutorService r1 = (java.util.concurrent.ExecutorService) r1
                r0.delegate = r1
                return
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
                r0.execute(r2)
                return
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

        public final java.lang.String toString() {
                r5 = this;
                java.lang.String r0 = super.toString()
                java.util.concurrent.ExecutorService r1 = r5.delegate
                java.lang.String r1 = java.lang.String.valueOf(r1)
                r2 = 2
                int r2 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r2)
                int r3 = r1.length()
                int r3 = r3 + r2
                java.lang.String r2 = "["
                java.lang.String r4 = "]"
                java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r3, r0, r2, r1, r4)
                return r0
        }
    }

    @com.google.common.annotations.GwtIncompatible
    public static final class ScheduledListeningDecorator extends com.google.common.util.concurrent.MoreExecutors.ListeningDecorator implements com.google.common.util.concurrent.ListeningScheduledExecutorService {
        public final java.util.concurrent.ScheduledExecutorService delegate;

        /* JADX INFO: loaded from: classes.dex */
        public static final class ListenableScheduledTask<V> extends com.google.common.util.concurrent.ForwardingListenableFuture.SimpleForwardingListenableFuture<V> implements com.google.common.util.concurrent.ListenableScheduledFuture<V> {
            private final java.util.concurrent.ScheduledFuture<?> scheduledDelegate;

            public ListenableScheduledTask(com.google.common.util.concurrent.ListenableFuture<V> r1, java.util.concurrent.ScheduledFuture<?> r2) {
                    r0 = this;
                    r0.<init>(r1)
                    r0.scheduledDelegate = r2
                    return
            }

            @Override // com.google.common.util.concurrent.ForwardingFuture, java.util.concurrent.Future
            public boolean cancel(boolean r3) {
                    r2 = this;
                    boolean r0 = super.cancel(r3)
                    if (r0 == 0) goto Lb
                    java.util.concurrent.ScheduledFuture<?> r1 = r2.scheduledDelegate
                    r1.cancel(r3)
                Lb:
                    return r0
            }

            @Override // java.lang.Comparable
            public /* bridge */ /* synthetic */ int compareTo(java.util.concurrent.Delayed r1) {
                    r0 = this;
                    java.util.concurrent.Delayed r1 = (java.util.concurrent.Delayed) r1
                    int r1 = r0.compareTo2(r1)
                    return r1
            }

            /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
            public int compareTo2(java.util.concurrent.Delayed r2) {
                    r1 = this;
                    java.util.concurrent.ScheduledFuture<?> r0 = r1.scheduledDelegate
                    int r2 = r0.compareTo(r2)
                    return r2
            }

            @Override // java.util.concurrent.Delayed
            public long getDelay(java.util.concurrent.TimeUnit r3) {
                    r2 = this;
                    java.util.concurrent.ScheduledFuture<?> r0 = r2.scheduledDelegate
                    long r0 = r0.getDelay(r3)
                    return r0
            }
        }

        @com.google.common.annotations.GwtIncompatible
        public static final class NeverSuccessfulListenableFutureTask extends com.google.common.util.concurrent.AbstractFuture.TrustedFuture<java.lang.Void> implements java.lang.Runnable {
            private final java.lang.Runnable delegate;

            public NeverSuccessfulListenableFutureTask(java.lang.Runnable r1) {
                    r0 = this;
                    r0.<init>()
                    java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                    java.lang.Runnable r1 = (java.lang.Runnable) r1
                    r0.delegate = r1
                    return
            }

            @Override // com.google.common.util.concurrent.AbstractFuture
            public final java.lang.String pendingToString() {
                    r4 = this;
                    java.lang.Runnable r0 = r4.delegate
                    java.lang.String r0 = java.lang.String.valueOf(r0)
                    int r1 = r0.length()
                    int r1 = r1 + 7
                    java.lang.String r2 = "task=["
                    java.lang.String r3 = "]"
                    java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r0, r3)
                    return r0
            }

            @Override // java.lang.Runnable
            public void run() {
                    r1 = this;
                    java.lang.Runnable r0 = r1.delegate     // Catch: java.lang.Throwable -> L6
                    r0.run()     // Catch: java.lang.Throwable -> L6
                    return
                L6:
                    r0 = move-exception
                    r1.setException(r0)
                    java.lang.RuntimeException r0 = com.google.common.base.Throwables.propagate(r0)
                    throw r0
            }
        }

        public ScheduledListeningDecorator(java.util.concurrent.ScheduledExecutorService r1) {
                r0 = this;
                r0.<init>(r1)
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.util.concurrent.ScheduledExecutorService r1 = (java.util.concurrent.ScheduledExecutorService) r1
                r0.delegate = r1
                return
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public com.google.common.util.concurrent.ListenableScheduledFuture<?> schedule(java.lang.Runnable r2, long r3, java.util.concurrent.TimeUnit r5) {
                r1 = this;
                r0 = 0
                com.google.common.util.concurrent.TrustedListenableFutureTask r2 = com.google.common.util.concurrent.TrustedListenableFutureTask.create(r2, r0)
                java.util.concurrent.ScheduledExecutorService r0 = r1.delegate
                java.util.concurrent.ScheduledFuture r3 = r0.schedule(r2, r3, r5)
                com.google.common.util.concurrent.MoreExecutors$ScheduledListeningDecorator$ListenableScheduledTask r4 = new com.google.common.util.concurrent.MoreExecutors$ScheduledListeningDecorator$ListenableScheduledTask
                r4.<init>(r2, r3)
                return r4
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public <V> com.google.common.util.concurrent.ListenableScheduledFuture<V> schedule(java.util.concurrent.Callable<V> r2, long r3, java.util.concurrent.TimeUnit r5) {
                r1 = this;
                com.google.common.util.concurrent.TrustedListenableFutureTask r0 = new com.google.common.util.concurrent.TrustedListenableFutureTask
                r0.<init>(r2)
                java.util.concurrent.ScheduledExecutorService r2 = r1.delegate
                java.util.concurrent.ScheduledFuture r2 = r2.schedule(r0, r3, r5)
                com.google.common.util.concurrent.MoreExecutors$ScheduledListeningDecorator$ListenableScheduledTask r3 = new com.google.common.util.concurrent.MoreExecutors$ScheduledListeningDecorator$ListenableScheduledTask
                r3.<init>(r0, r2)
                return r3
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture schedule(java.lang.Runnable r1, long r2, java.util.concurrent.TimeUnit r4) {
                r0 = this;
                com.google.common.util.concurrent.ListenableScheduledFuture r1 = r0.schedule(r1, r2, r4)
                return r1
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture schedule(java.util.concurrent.Callable r1, long r2, java.util.concurrent.TimeUnit r4) {
                r0 = this;
                com.google.common.util.concurrent.ListenableScheduledFuture r1 = r0.schedule(r1, r2, r4)
                return r1
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public com.google.common.util.concurrent.ListenableScheduledFuture<?> scheduleAtFixedRate(java.lang.Runnable r9, long r10, long r12, java.util.concurrent.TimeUnit r14) {
                r8 = this;
                com.google.common.util.concurrent.MoreExecutors$ScheduledListeningDecorator$NeverSuccessfulListenableFutureTask r7 = new com.google.common.util.concurrent.MoreExecutors$ScheduledListeningDecorator$NeverSuccessfulListenableFutureTask
                r7.<init>(r9)
                java.util.concurrent.ScheduledExecutorService r0 = r8.delegate
                r1 = r7
                r2 = r10
                r4 = r12
                r6 = r14
                java.util.concurrent.ScheduledFuture r9 = r0.scheduleAtFixedRate(r1, r2, r4, r6)
                com.google.common.util.concurrent.MoreExecutors$ScheduledListeningDecorator$ListenableScheduledTask r10 = new com.google.common.util.concurrent.MoreExecutors$ScheduledListeningDecorator$ListenableScheduledTask
                r10.<init>(r7, r9)
                return r10
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture scheduleAtFixedRate(java.lang.Runnable r1, long r2, long r4, java.util.concurrent.TimeUnit r6) {
                r0 = this;
                com.google.common.util.concurrent.ListenableScheduledFuture r1 = r0.scheduleAtFixedRate(r1, r2, r4, r6)
                return r1
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public com.google.common.util.concurrent.ListenableScheduledFuture<?> scheduleWithFixedDelay(java.lang.Runnable r9, long r10, long r12, java.util.concurrent.TimeUnit r14) {
                r8 = this;
                com.google.common.util.concurrent.MoreExecutors$ScheduledListeningDecorator$NeverSuccessfulListenableFutureTask r7 = new com.google.common.util.concurrent.MoreExecutors$ScheduledListeningDecorator$NeverSuccessfulListenableFutureTask
                r7.<init>(r9)
                java.util.concurrent.ScheduledExecutorService r0 = r8.delegate
                r1 = r7
                r2 = r10
                r4 = r12
                r6 = r14
                java.util.concurrent.ScheduledFuture r9 = r0.scheduleWithFixedDelay(r1, r2, r4, r6)
                com.google.common.util.concurrent.MoreExecutors$ScheduledListeningDecorator$ListenableScheduledTask r10 = new com.google.common.util.concurrent.MoreExecutors$ScheduledListeningDecorator$ListenableScheduledTask
                r10.<init>(r7, r9)
                return r10
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture scheduleWithFixedDelay(java.lang.Runnable r1, long r2, long r4, java.util.concurrent.TimeUnit r6) {
                r0 = this;
                com.google.common.util.concurrent.ListenableScheduledFuture r1 = r0.scheduleWithFixedDelay(r1, r2, r4, r6)
                return r1
        }
    }

    private MoreExecutors() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void access$000(java.util.concurrent.ThreadPoolExecutor r0) {
            useDaemonThreadFactory(r0)
            return
    }

    @com.google.common.annotations.Beta
    @com.google.common.annotations.GwtIncompatible
    public static void addDelayedShutdownHook(java.util.concurrent.ExecutorService r1, long r2, java.util.concurrent.TimeUnit r4) {
            com.google.common.util.concurrent.MoreExecutors$Application r0 = new com.google.common.util.concurrent.MoreExecutors$Application
            r0.<init>()
            r0.addDelayedShutdownHook(r1, r2, r4)
            return
    }

    public static java.util.concurrent.Executor directExecutor() {
            com.google.common.util.concurrent.DirectExecutor r0 = com.google.common.util.concurrent.DirectExecutor.INSTANCE
            return r0
    }

    @com.google.common.annotations.Beta
    @com.google.common.annotations.GwtIncompatible
    public static java.util.concurrent.ExecutorService getExitingExecutorService(java.util.concurrent.ThreadPoolExecutor r5) {
            com.google.common.util.concurrent.MoreExecutors$Application r0 = new com.google.common.util.concurrent.MoreExecutors$Application
            r0.<init>()
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            access$000(r5)
            java.util.concurrent.ExecutorService r2 = java.util.concurrent.Executors.unconfigurableExecutorService(r5)
            r3 = 120(0x78, double:5.93E-322)
            r0.addDelayedShutdownHook(r5, r3, r1)
            return r2
    }

    @com.google.common.annotations.Beta
    @com.google.common.annotations.GwtIncompatible
    public static java.util.concurrent.ExecutorService getExitingExecutorService(java.util.concurrent.ThreadPoolExecutor r2, long r3, java.util.concurrent.TimeUnit r5) {
            com.google.common.util.concurrent.MoreExecutors$Application r0 = new com.google.common.util.concurrent.MoreExecutors$Application
            r0.<init>()
            access$000(r2)
            java.util.concurrent.ExecutorService r1 = java.util.concurrent.Executors.unconfigurableExecutorService(r2)
            r0.addDelayedShutdownHook(r2, r3, r5)
            return r1
    }

    @com.google.common.annotations.Beta
    @com.google.common.annotations.GwtIncompatible
    public static java.util.concurrent.ScheduledExecutorService getExitingScheduledExecutorService(java.util.concurrent.ScheduledThreadPoolExecutor r5) {
            com.google.common.util.concurrent.MoreExecutors$Application r0 = new com.google.common.util.concurrent.MoreExecutors$Application
            r0.<init>()
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            access$000(r5)
            java.util.concurrent.ScheduledExecutorService r2 = java.util.concurrent.Executors.unconfigurableScheduledExecutorService(r5)
            r3 = 120(0x78, double:5.93E-322)
            r0.addDelayedShutdownHook(r5, r3, r1)
            return r2
    }

    @com.google.common.annotations.Beta
    @com.google.common.annotations.GwtIncompatible
    public static java.util.concurrent.ScheduledExecutorService getExitingScheduledExecutorService(java.util.concurrent.ScheduledThreadPoolExecutor r2, long r3, java.util.concurrent.TimeUnit r5) {
            com.google.common.util.concurrent.MoreExecutors$Application r0 = new com.google.common.util.concurrent.MoreExecutors$Application
            r0.<init>()
            access$000(r2)
            java.util.concurrent.ScheduledExecutorService r1 = java.util.concurrent.Executors.unconfigurableScheduledExecutorService(r2)
            r0.addDelayedShutdownHook(r2, r3, r5)
            return r1
    }

    @com.google.common.annotations.GwtIncompatible
    private static boolean isAppEngineWithApiClasses() {
            java.lang.String r0 = "com.google.appengine.runtime.environment"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            java.lang.String r0 = "com.google.appengine.api.utils.SystemProperty"
            java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = "com.google.apphosting.api.ApiProxy"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = "getCurrentEnvironment"
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L27
            java.lang.reflect.Method r0 = r0.getMethod(r2, r3)     // Catch: java.lang.Throwable -> L27
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L27
            java.lang.Object r0 = r0.invoke(r2, r3)     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L27
            r1 = 1
        L27:
            return r1
    }

    @com.google.common.annotations.GwtIncompatible
    public static com.google.common.util.concurrent.ListeningExecutorService listeningDecorator(java.util.concurrent.ExecutorService r1) {
            boolean r0 = r1 instanceof com.google.common.util.concurrent.ListeningExecutorService
            if (r0 == 0) goto L7
            com.google.common.util.concurrent.ListeningExecutorService r1 = (com.google.common.util.concurrent.ListeningExecutorService) r1
            goto L19
        L7:
            boolean r0 = r1 instanceof java.util.concurrent.ScheduledExecutorService
            if (r0 == 0) goto L13
            com.google.common.util.concurrent.MoreExecutors$ScheduledListeningDecorator r0 = new com.google.common.util.concurrent.MoreExecutors$ScheduledListeningDecorator
            java.util.concurrent.ScheduledExecutorService r1 = (java.util.concurrent.ScheduledExecutorService) r1
            r0.<init>(r1)
            goto L18
        L13:
            com.google.common.util.concurrent.MoreExecutors$ListeningDecorator r0 = new com.google.common.util.concurrent.MoreExecutors$ListeningDecorator
            r0.<init>(r1)
        L18:
            r1 = r0
        L19:
            return r1
    }

    @com.google.common.annotations.GwtIncompatible
    public static com.google.common.util.concurrent.ListeningScheduledExecutorService listeningDecorator(java.util.concurrent.ScheduledExecutorService r1) {
            boolean r0 = r1 instanceof com.google.common.util.concurrent.ListeningScheduledExecutorService
            if (r0 == 0) goto L7
            com.google.common.util.concurrent.ListeningScheduledExecutorService r1 = (com.google.common.util.concurrent.ListeningScheduledExecutorService) r1
            goto Ld
        L7:
            com.google.common.util.concurrent.MoreExecutors$ScheduledListeningDecorator r0 = new com.google.common.util.concurrent.MoreExecutors$ScheduledListeningDecorator
            r0.<init>(r1)
            r1 = r0
        Ld:
            return r1
    }

    @com.google.common.annotations.GwtIncompatible
    public static com.google.common.util.concurrent.ListeningExecutorService newDirectExecutorService() {
            com.google.common.util.concurrent.MoreExecutors$DirectExecutorService r0 = new com.google.common.util.concurrent.MoreExecutors$DirectExecutorService
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    @com.google.common.annotations.Beta
    @com.google.common.annotations.GwtIncompatible
    public static java.util.concurrent.Executor newSequentialExecutor(java.util.concurrent.Executor r1) {
            com.google.common.util.concurrent.SequentialExecutor r0 = new com.google.common.util.concurrent.SequentialExecutor
            r0.<init>(r1)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static java.lang.Thread newThread(java.lang.String r1, java.lang.Runnable r2) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Preconditions.checkNotNull(r2)
            java.util.concurrent.ThreadFactory r0 = platformThreadFactory()
            java.lang.Thread r2 = r0.newThread(r2)
            r2.setName(r1)     // Catch: java.lang.SecurityException -> L11
        L11:
            return r2
    }

    @com.google.common.annotations.Beta
    @com.google.common.annotations.GwtIncompatible
    public static java.util.concurrent.ThreadFactory platformThreadFactory() {
            java.lang.String r0 = "Couldn't invoke ThreadManager.currentRequestThreadFactory"
            boolean r1 = isAppEngineWithApiClasses()
            if (r1 != 0) goto Ld
            java.util.concurrent.ThreadFactory r0 = java.util.concurrent.Executors.defaultThreadFactory()
            return r0
        Ld:
            java.lang.String r1 = "com.google.appengine.api.ThreadManager"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.NoSuchMethodException -> L30 java.lang.ClassNotFoundException -> L37 java.lang.IllegalAccessException -> L3e
            java.lang.String r2 = "currentRequestThreadFactory"
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.NoSuchMethodException -> L30 java.lang.ClassNotFoundException -> L37 java.lang.IllegalAccessException -> L3e
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.NoSuchMethodException -> L30 java.lang.ClassNotFoundException -> L37 java.lang.IllegalAccessException -> L3e
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.NoSuchMethodException -> L30 java.lang.ClassNotFoundException -> L37 java.lang.IllegalAccessException -> L3e
            java.lang.Object r1 = r1.invoke(r2, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.NoSuchMethodException -> L30 java.lang.ClassNotFoundException -> L37 java.lang.IllegalAccessException -> L3e
            java.util.concurrent.ThreadFactory r1 = (java.util.concurrent.ThreadFactory) r1     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.NoSuchMethodException -> L30 java.lang.ClassNotFoundException -> L37 java.lang.IllegalAccessException -> L3e
            return r1
        L26:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getCause()
            java.lang.RuntimeException r0 = com.google.common.base.Throwables.propagate(r0)
            throw r0
        L30:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0, r1)
            throw r2
        L37:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0, r1)
            throw r2
        L3e:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0, r1)
            throw r2
    }

    public static java.util.concurrent.Executor rejectionPropagatingExecutor(java.util.concurrent.Executor r1, com.google.common.util.concurrent.AbstractFuture<?> r2) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Preconditions.checkNotNull(r2)
            java.util.concurrent.Executor r0 = directExecutor()
            if (r1 != r0) goto Ld
            return r1
        Ld:
            com.google.common.util.concurrent.MoreExecutors$5 r0 = new com.google.common.util.concurrent.MoreExecutors$5
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static java.util.concurrent.Executor renamingDecorator(java.util.concurrent.Executor r1, com.google.common.base.Supplier<java.lang.String> r2) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.util.concurrent.MoreExecutors$2 r0 = new com.google.common.util.concurrent.MoreExecutors$2
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.common.annotations.Beta
    @com.google.common.annotations.GwtIncompatible
    public static boolean shutdownAndAwaitTermination(java.util.concurrent.ExecutorService r2, long r3, java.util.concurrent.TimeUnit r5) {
            long r3 = r5.toNanos(r3)
            r0 = 2
            long r3 = r3 / r0
            r2.shutdown()
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.InterruptedException -> L19
            boolean r0 = r2.awaitTermination(r3, r5)     // Catch: java.lang.InterruptedException -> L19
            if (r0 != 0) goto L23
            r2.shutdownNow()     // Catch: java.lang.InterruptedException -> L19
            r2.awaitTermination(r3, r5)     // Catch: java.lang.InterruptedException -> L19
            goto L23
        L19:
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            r3.interrupt()
            r2.shutdownNow()
        L23:
            boolean r2 = r2.isTerminated()
            return r2
    }

    @com.google.common.annotations.GwtIncompatible
    private static <T> com.google.common.util.concurrent.ListenableFuture<T> submitAndAddQueueListener(com.google.common.util.concurrent.ListeningExecutorService r0, java.util.concurrent.Callable<T> r1, java.util.concurrent.BlockingQueue<java.util.concurrent.Future<T>> r2) {
            com.google.common.util.concurrent.ListenableFuture r0 = r0.submit(r1)
            com.google.common.util.concurrent.MoreExecutors$1 r1 = new com.google.common.util.concurrent.MoreExecutors$1
            r1.<init>(r2, r0)
            java.util.concurrent.Executor r2 = directExecutor()
            r0.addListener(r1, r2)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    private static void useDaemonThreadFactory(java.util.concurrent.ThreadPoolExecutor r2) {
            com.google.common.util.concurrent.ThreadFactoryBuilder r0 = new com.google.common.util.concurrent.ThreadFactoryBuilder
            r0.<init>()
            r1 = 1
            com.google.common.util.concurrent.ThreadFactoryBuilder r0 = r0.setDaemon(r1)
            java.util.concurrent.ThreadFactory r1 = r2.getThreadFactory()
            com.google.common.util.concurrent.ThreadFactoryBuilder r0 = r0.setThreadFactory(r1)
            java.util.concurrent.ThreadFactory r0 = r0.build()
            r2.setThreadFactory(r0)
            return
    }
}
