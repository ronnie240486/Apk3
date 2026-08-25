package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.Beta
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
public final class ExecutionSequencer {
    private com.google.common.util.concurrent.ExecutionSequencer.ThreadConfinedTaskQueue latestTaskQueue;
    private final java.util.concurrent.atomic.AtomicReference<com.google.common.util.concurrent.ListenableFuture<java.lang.Void>> ref;




    /* JADX INFO: loaded from: classes.dex */
    public static final enum RunningState extends java.lang.Enum<com.google.common.util.concurrent.ExecutionSequencer.RunningState> {
        private static final /* synthetic */ com.google.common.util.concurrent.ExecutionSequencer.RunningState[] $VALUES = null;
        public static final com.google.common.util.concurrent.ExecutionSequencer.RunningState CANCELLED = null;
        public static final com.google.common.util.concurrent.ExecutionSequencer.RunningState NOT_RUN = null;
        public static final com.google.common.util.concurrent.ExecutionSequencer.RunningState STARTED = null;

        private static /* synthetic */ com.google.common.util.concurrent.ExecutionSequencer.RunningState[] $values() {
                r0 = 3
                com.google.common.util.concurrent.ExecutionSequencer$RunningState[] r0 = new com.google.common.util.concurrent.ExecutionSequencer.RunningState[r0]
                com.google.common.util.concurrent.ExecutionSequencer$RunningState r1 = com.google.common.util.concurrent.ExecutionSequencer.RunningState.NOT_RUN
                r2 = 0
                r0[r2] = r1
                com.google.common.util.concurrent.ExecutionSequencer$RunningState r1 = com.google.common.util.concurrent.ExecutionSequencer.RunningState.CANCELLED
                r2 = 1
                r0[r2] = r1
                com.google.common.util.concurrent.ExecutionSequencer$RunningState r1 = com.google.common.util.concurrent.ExecutionSequencer.RunningState.STARTED
                r2 = 2
                r0[r2] = r1
                return r0
        }

        static {
                com.google.common.util.concurrent.ExecutionSequencer$RunningState r0 = new com.google.common.util.concurrent.ExecutionSequencer$RunningState
                java.lang.String r1 = "NOT_RUN"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.common.util.concurrent.ExecutionSequencer.RunningState.NOT_RUN = r0
                com.google.common.util.concurrent.ExecutionSequencer$RunningState r0 = new com.google.common.util.concurrent.ExecutionSequencer$RunningState
                java.lang.String r1 = "CANCELLED"
                r2 = 1
                r0.<init>(r1, r2)
                com.google.common.util.concurrent.ExecutionSequencer.RunningState.CANCELLED = r0
                com.google.common.util.concurrent.ExecutionSequencer$RunningState r0 = new com.google.common.util.concurrent.ExecutionSequencer$RunningState
                java.lang.String r1 = "STARTED"
                r2 = 2
                r0.<init>(r1, r2)
                com.google.common.util.concurrent.ExecutionSequencer.RunningState.STARTED = r0
                com.google.common.util.concurrent.ExecutionSequencer$RunningState[] r0 = $values()
                com.google.common.util.concurrent.ExecutionSequencer.RunningState.$VALUES = r0
                return
        }

        private RunningState(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.util.concurrent.ExecutionSequencer.RunningState valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.util.concurrent.ExecutionSequencer$RunningState> r0 = com.google.common.util.concurrent.ExecutionSequencer.RunningState.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.util.concurrent.ExecutionSequencer$RunningState r1 = (com.google.common.util.concurrent.ExecutionSequencer.RunningState) r1
                return r1
        }

        public static com.google.common.util.concurrent.ExecutionSequencer.RunningState[] values() {
                com.google.common.util.concurrent.ExecutionSequencer$RunningState[] r0 = com.google.common.util.concurrent.ExecutionSequencer.RunningState.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.util.concurrent.ExecutionSequencer$RunningState[] r0 = (com.google.common.util.concurrent.ExecutionSequencer.RunningState[]) r0
                return r0
        }
    }

    public static final class TaskNonReentrantExecutor extends java.util.concurrent.atomic.AtomicReference<com.google.common.util.concurrent.ExecutionSequencer.RunningState> implements java.util.concurrent.Executor, java.lang.Runnable {

        @javax.annotation.CheckForNull
        public java.util.concurrent.Executor delegate;

        @javax.annotation.CheckForNull
        public com.google.common.util.concurrent.ExecutionSequencer sequencer;

        @javax.annotation.CheckForNull
        public java.lang.Thread submitting;

        @javax.annotation.CheckForNull
        public java.lang.Runnable task;

        private TaskNonReentrantExecutor(java.util.concurrent.Executor r2, com.google.common.util.concurrent.ExecutionSequencer r3) {
                r1 = this;
                com.google.common.util.concurrent.ExecutionSequencer$RunningState r0 = com.google.common.util.concurrent.ExecutionSequencer.RunningState.NOT_RUN
                r1.<init>(r0)
                r1.delegate = r2
                r1.sequencer = r3
                return
        }

        public /* synthetic */ TaskNonReentrantExecutor(java.util.concurrent.Executor r1, com.google.common.util.concurrent.ExecutionSequencer r2, com.google.common.util.concurrent.ExecutionSequencer.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static /* synthetic */ boolean access$200(com.google.common.util.concurrent.ExecutionSequencer.TaskNonReentrantExecutor r0) {
                boolean r0 = r0.trySetStarted()
                return r0
        }

        public static /* synthetic */ boolean access$300(com.google.common.util.concurrent.ExecutionSequencer.TaskNonReentrantExecutor r0) {
                boolean r0 = r0.trySetCancelled()
                return r0
        }

        private boolean trySetCancelled() {
                r2 = this;
                com.google.common.util.concurrent.ExecutionSequencer$RunningState r0 = com.google.common.util.concurrent.ExecutionSequencer.RunningState.NOT_RUN
                com.google.common.util.concurrent.ExecutionSequencer$RunningState r1 = com.google.common.util.concurrent.ExecutionSequencer.RunningState.CANCELLED
                boolean r0 = r2.compareAndSet(r0, r1)
                return r0
        }

        private boolean trySetStarted() {
                r2 = this;
                com.google.common.util.concurrent.ExecutionSequencer$RunningState r0 = com.google.common.util.concurrent.ExecutionSequencer.RunningState.NOT_RUN
                com.google.common.util.concurrent.ExecutionSequencer$RunningState r1 = com.google.common.util.concurrent.ExecutionSequencer.RunningState.STARTED
                boolean r0 = r2.compareAndSet(r0, r1)
                return r0
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable r5) {
                r4 = this;
                java.lang.Object r0 = r4.get()
                com.google.common.util.concurrent.ExecutionSequencer$RunningState r1 = com.google.common.util.concurrent.ExecutionSequencer.RunningState.CANCELLED
                r2 = 0
                if (r0 != r1) goto Le
                r4.delegate = r2
                r4.sequencer = r2
                return
            Le:
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r4.submitting = r0
                com.google.common.util.concurrent.ExecutionSequencer r0 = r4.sequencer     // Catch: java.lang.Throwable -> L4e
                java.util.Objects.requireNonNull(r0)     // Catch: java.lang.Throwable -> L4e
                com.google.common.util.concurrent.ExecutionSequencer$ThreadConfinedTaskQueue r0 = com.google.common.util.concurrent.ExecutionSequencer.access$400(r0)     // Catch: java.lang.Throwable -> L4e
                java.lang.Thread r1 = r0.thread     // Catch: java.lang.Throwable -> L4e
                java.lang.Thread r3 = r4.submitting     // Catch: java.lang.Throwable -> L4e
                if (r1 != r3) goto L3d
                r4.sequencer = r2     // Catch: java.lang.Throwable -> L4e
                java.lang.Runnable r1 = r0.nextTask     // Catch: java.lang.Throwable -> L4e
                if (r1 != 0) goto L2b
                r1 = 1
                goto L2c
            L2b:
                r1 = 0
            L2c:
                com.google.common.base.Preconditions.checkState(r1)     // Catch: java.lang.Throwable -> L4e
                r0.nextTask = r5     // Catch: java.lang.Throwable -> L4e
                java.util.concurrent.Executor r5 = r4.delegate     // Catch: java.lang.Throwable -> L4e
                java.util.Objects.requireNonNull(r5)     // Catch: java.lang.Throwable -> L4e
                java.util.concurrent.Executor r5 = (java.util.concurrent.Executor) r5     // Catch: java.lang.Throwable -> L4e
                r0.nextExecutor = r5     // Catch: java.lang.Throwable -> L4e
                r4.delegate = r2     // Catch: java.lang.Throwable -> L4e
                goto L4b
            L3d:
                java.util.concurrent.Executor r0 = r4.delegate     // Catch: java.lang.Throwable -> L4e
                java.util.Objects.requireNonNull(r0)     // Catch: java.lang.Throwable -> L4e
                java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0     // Catch: java.lang.Throwable -> L4e
                r4.delegate = r2     // Catch: java.lang.Throwable -> L4e
                r4.task = r5     // Catch: java.lang.Throwable -> L4e
                r0.execute(r4)     // Catch: java.lang.Throwable -> L4e
            L4b:
                r4.submitting = r2
                return
            L4e:
                r5 = move-exception
                r4.submitting = r2
                throw r5
        }

        @Override // java.lang.Runnable
        public void run() {
                r7 = this;
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                java.lang.Thread r1 = r7.submitting
                r2 = 0
                if (r0 == r1) goto L16
                java.lang.Runnable r0 = r7.task
                java.util.Objects.requireNonNull(r0)
                java.lang.Runnable r0 = (java.lang.Runnable) r0
                r7.task = r2
                r0.run()
                return
            L16:
                com.google.common.util.concurrent.ExecutionSequencer$ThreadConfinedTaskQueue r1 = new com.google.common.util.concurrent.ExecutionSequencer$ThreadConfinedTaskQueue
                r1.<init>(r2)
                r1.thread = r0
                com.google.common.util.concurrent.ExecutionSequencer r0 = r7.sequencer
                java.util.Objects.requireNonNull(r0)
                com.google.common.util.concurrent.ExecutionSequencer.access$402(r0, r1)
                r7.sequencer = r2
                java.lang.Runnable r0 = r7.task     // Catch: java.lang.Throwable -> L50
                java.util.Objects.requireNonNull(r0)     // Catch: java.lang.Throwable -> L50
                java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch: java.lang.Throwable -> L50
                r7.task = r2     // Catch: java.lang.Throwable -> L50
                r0.run()     // Catch: java.lang.Throwable -> L50
            L33:
                java.lang.Runnable r0 = r1.nextTask     // Catch: java.lang.Throwable -> L50
                r3 = 1
                r4 = 0
                if (r0 == 0) goto L3b
                r5 = 1
                goto L3c
            L3b:
                r5 = 0
            L3c:
                java.util.concurrent.Executor r6 = r1.nextExecutor     // Catch: java.lang.Throwable -> L50
                if (r6 == 0) goto L41
                goto L42
            L41:
                r3 = 0
            L42:
                r3 = r3 & r5
                if (r3 == 0) goto L4d
                r1.nextTask = r2     // Catch: java.lang.Throwable -> L50
                r1.nextExecutor = r2     // Catch: java.lang.Throwable -> L50
                r6.execute(r0)     // Catch: java.lang.Throwable -> L50
                goto L33
            L4d:
                r1.thread = r2
                return
            L50:
                r0 = move-exception
                r1.thread = r2
                throw r0
        }
    }

    public static final class ThreadConfinedTaskQueue {

        @javax.annotation.CheckForNull
        public java.util.concurrent.Executor nextExecutor;

        @javax.annotation.CheckForNull
        public java.lang.Runnable nextTask;

        @javax.annotation.CheckForNull
        public java.lang.Thread thread;

        private ThreadConfinedTaskQueue() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ ThreadConfinedTaskQueue(com.google.common.util.concurrent.ExecutionSequencer.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    private ExecutionSequencer() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            com.google.common.util.concurrent.ListenableFuture r1 = com.google.common.util.concurrent.Futures.immediateVoidFuture()
            r0.<init>(r1)
            r2.ref = r0
            com.google.common.util.concurrent.ExecutionSequencer$ThreadConfinedTaskQueue r0 = new com.google.common.util.concurrent.ExecutionSequencer$ThreadConfinedTaskQueue
            r1 = 0
            r0.<init>(r1)
            r2.latestTaskQueue = r0
            return
    }

    public static /* synthetic */ com.google.common.util.concurrent.ExecutionSequencer.ThreadConfinedTaskQueue access$400(com.google.common.util.concurrent.ExecutionSequencer r0) {
            com.google.common.util.concurrent.ExecutionSequencer$ThreadConfinedTaskQueue r0 = r0.latestTaskQueue
            return r0
    }

    public static /* synthetic */ com.google.common.util.concurrent.ExecutionSequencer.ThreadConfinedTaskQueue access$402(com.google.common.util.concurrent.ExecutionSequencer r0, com.google.common.util.concurrent.ExecutionSequencer.ThreadConfinedTaskQueue r1) {
            r0.latestTaskQueue = r1
            return r1
    }

    public static com.google.common.util.concurrent.ExecutionSequencer create() {
            com.google.common.util.concurrent.ExecutionSequencer r0 = new com.google.common.util.concurrent.ExecutionSequencer
            r0.<init>()
            return r0
    }

    public <T> com.google.common.util.concurrent.ListenableFuture<T> submit(java.util.concurrent.Callable<T> r2, java.util.concurrent.Executor r3) {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.base.Preconditions.checkNotNull(r3)
            com.google.common.util.concurrent.ExecutionSequencer$1 r0 = new com.google.common.util.concurrent.ExecutionSequencer$1
            r0.<init>(r2)
            com.google.common.util.concurrent.ListenableFuture r2 = r1.submitAsync(r0, r3)
            return r2
    }

    public <T> com.google.common.util.concurrent.ListenableFuture<T> submitAsync(com.google.common.util.concurrent.AsyncCallable<T> r8, java.util.concurrent.Executor r9) {
            r7 = this;
            com.google.common.base.Preconditions.checkNotNull(r8)
            com.google.common.base.Preconditions.checkNotNull(r9)
            com.google.common.util.concurrent.ExecutionSequencer$TaskNonReentrantExecutor r5 = new com.google.common.util.concurrent.ExecutionSequencer$TaskNonReentrantExecutor
            r0 = 0
            r5.<init>(r9, r7, r0)
            com.google.common.util.concurrent.ExecutionSequencer$2 r9 = new com.google.common.util.concurrent.ExecutionSequencer$2
            r9.<init>(r5, r8)
            com.google.common.util.concurrent.SettableFuture r2 = com.google.common.util.concurrent.SettableFuture.create()
            java.util.concurrent.atomic.AtomicReference<com.google.common.util.concurrent.ListenableFuture<java.lang.Void>> r8 = r7.ref
            java.lang.Object r8 = r8.getAndSet(r2)
            r3 = r8
            com.google.common.util.concurrent.ListenableFuture r3 = (com.google.common.util.concurrent.ListenableFuture) r3
            com.google.common.util.concurrent.TrustedListenableFutureTask r8 = new com.google.common.util.concurrent.TrustedListenableFutureTask
            r8.<init>(r9)
            r3.addListener(r8, r5)
            com.google.common.util.concurrent.ListenableFuture r9 = com.google.common.util.concurrent.Futures.nonCancellationPropagating(r8)
            com.google.common.util.concurrent.ExecutionSequencer$3 r6 = new com.google.common.util.concurrent.ExecutionSequencer$3
            r0 = r6
            r1 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.concurrent.Executor r0 = com.google.common.util.concurrent.MoreExecutors.directExecutor()
            r9.addListener(r6, r0)
            java.util.concurrent.Executor r0 = com.google.common.util.concurrent.MoreExecutors.directExecutor()
            r8.addListener(r6, r0)
            return r9
    }
}
