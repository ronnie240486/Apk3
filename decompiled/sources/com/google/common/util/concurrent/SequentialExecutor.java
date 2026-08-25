package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
final class SequentialExecutor implements java.util.concurrent.Executor {
    private static final java.util.logging.Logger log = null;
    private final java.util.concurrent.Executor executor;

    @com.google.errorprone.annotations.concurrent.GuardedBy("queue")
    private final java.util.Deque<java.lang.Runnable> queue;

    @com.google.j2objc.annotations.RetainedWith
    private final com.google.common.util.concurrent.SequentialExecutor.QueueWorker worker;

    @com.google.errorprone.annotations.concurrent.GuardedBy("queue")
    private long workerRunCount;

    @com.google.errorprone.annotations.concurrent.GuardedBy("queue")
    private com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState workerRunningState;


    public final class QueueWorker implements java.lang.Runnable {

        @javax.annotation.CheckForNull
        public java.lang.Runnable task;
        public final /* synthetic */ com.google.common.util.concurrent.SequentialExecutor this$0;

        private QueueWorker(com.google.common.util.concurrent.SequentialExecutor r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ QueueWorker(com.google.common.util.concurrent.SequentialExecutor r1, com.google.common.util.concurrent.SequentialExecutor.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private void workOnQueue() {
                r9 = this;
                r0 = 0
                r1 = 0
            L2:
                com.google.common.util.concurrent.SequentialExecutor r2 = r9.this$0     // Catch: java.lang.Throwable -> L8c
                java.util.Deque r2 = com.google.common.util.concurrent.SequentialExecutor.access$100(r2)     // Catch: java.lang.Throwable -> L8c
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L8c
                if (r0 != 0) goto L2b
                com.google.common.util.concurrent.SequentialExecutor r0 = r9.this$0     // Catch: java.lang.Throwable -> L89
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r0 = com.google.common.util.concurrent.SequentialExecutor.access$200(r0)     // Catch: java.lang.Throwable -> L89
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r3 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.RUNNING     // Catch: java.lang.Throwable -> L89
                if (r0 != r3) goto L20
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L89
                if (r1 == 0) goto L1f
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L1f:
                return
            L20:
                com.google.common.util.concurrent.SequentialExecutor r0 = r9.this$0     // Catch: java.lang.Throwable -> L89
                com.google.common.util.concurrent.SequentialExecutor.access$308(r0)     // Catch: java.lang.Throwable -> L89
                com.google.common.util.concurrent.SequentialExecutor r0 = r9.this$0     // Catch: java.lang.Throwable -> L89
                com.google.common.util.concurrent.SequentialExecutor.access$202(r0, r3)     // Catch: java.lang.Throwable -> L89
                r0 = 1
            L2b:
                com.google.common.util.concurrent.SequentialExecutor r3 = r9.this$0     // Catch: java.lang.Throwable -> L89
                java.util.Deque r3 = com.google.common.util.concurrent.SequentialExecutor.access$100(r3)     // Catch: java.lang.Throwable -> L89
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L89
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L89
                r9.task = r3     // Catch: java.lang.Throwable -> L89
                if (r3 != 0) goto L4d
                com.google.common.util.concurrent.SequentialExecutor r0 = r9.this$0     // Catch: java.lang.Throwable -> L89
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r3 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.IDLE     // Catch: java.lang.Throwable -> L89
                com.google.common.util.concurrent.SequentialExecutor.access$202(r0, r3)     // Catch: java.lang.Throwable -> L89
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L89
                if (r1 == 0) goto L4c
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L4c:
                return
            L4d:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L89
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L8c
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r9.task     // Catch: java.lang.Throwable -> L5c java.lang.RuntimeException -> L5e
                r3.run()     // Catch: java.lang.Throwable -> L5c java.lang.RuntimeException -> L5e
            L59:
                r9.task = r2     // Catch: java.lang.Throwable -> L8c
                goto L2
            L5c:
                r0 = move-exception
                goto L86
            L5e:
                r3 = move-exception
                java.util.logging.Logger r4 = com.google.common.util.concurrent.SequentialExecutor.access$400()     // Catch: java.lang.Throwable -> L5c
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5c
                java.lang.Runnable r6 = r9.task     // Catch: java.lang.Throwable -> L5c
                java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L5c
                int r7 = r6.length()     // Catch: java.lang.Throwable -> L5c
                int r7 = r7 + 35
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
                r8.<init>(r7)     // Catch: java.lang.Throwable -> L5c
                java.lang.String r7 = "Exception while executing runnable "
                r8.append(r7)     // Catch: java.lang.Throwable -> L5c
                r8.append(r6)     // Catch: java.lang.Throwable -> L5c
                java.lang.String r6 = r8.toString()     // Catch: java.lang.Throwable -> L5c
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5c
                goto L59
            L86:
                r9.task = r2     // Catch: java.lang.Throwable -> L8c
                throw r0     // Catch: java.lang.Throwable -> L8c
            L89:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L89
                throw r0     // Catch: java.lang.Throwable -> L8c
            L8c:
                r0 = move-exception
                if (r1 == 0) goto L96
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L96:
                throw r0
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                r4.workOnQueue()     // Catch: java.lang.Error -> L4
                return
            L4:
                r0 = move-exception
                com.google.common.util.concurrent.SequentialExecutor r1 = r4.this$0
                java.util.Deque r1 = com.google.common.util.concurrent.SequentialExecutor.access$100(r1)
                monitor-enter(r1)
                com.google.common.util.concurrent.SequentialExecutor r2 = r4.this$0     // Catch: java.lang.Throwable -> L15
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r3 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.IDLE     // Catch: java.lang.Throwable -> L15
                com.google.common.util.concurrent.SequentialExecutor.access$202(r2, r3)     // Catch: java.lang.Throwable -> L15
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
                throw r0
            L15:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
                throw r0
        }

        public java.lang.String toString() {
                r4 = this;
                java.lang.Runnable r0 = r4.task
                java.lang.String r1 = "}"
                if (r0 == 0) goto L18
                java.lang.String r0 = java.lang.String.valueOf(r0)
                int r2 = r0.length()
                int r2 = r2 + 34
                java.lang.String r3 = "SequentialExecutorWorker{running="
                java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r2, r3, r0, r1)
                return r0
            L18:
                com.google.common.util.concurrent.SequentialExecutor r0 = r4.this$0
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r0 = com.google.common.util.concurrent.SequentialExecutor.access$200(r0)
                java.lang.String r0 = java.lang.String.valueOf(r0)
                int r2 = r0.length()
                int r2 = r2 + 32
                java.lang.String r3 = "SequentialExecutorWorker{state="
                java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r2, r3, r0, r1)
                return r0
        }
    }

    public static final enum WorkerRunningState extends java.lang.Enum<com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState> {
        private static final /* synthetic */ com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState[] $VALUES = null;
        public static final com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState IDLE = null;
        public static final com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState QUEUED = null;
        public static final com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState QUEUING = null;
        public static final com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState RUNNING = null;

        private static /* synthetic */ com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState[] $values() {
                r0 = 4
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState[] r0 = new com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState[r0]
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r1 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.IDLE
                r2 = 0
                r0[r2] = r1
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r1 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.QUEUING
                r2 = 1
                r0[r2] = r1
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r1 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.QUEUED
                r2 = 2
                r0[r2] = r1
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r1 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.RUNNING
                r2 = 3
                r0[r2] = r1
                return r0
        }

        static {
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r0 = new com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState
                java.lang.String r1 = "IDLE"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.IDLE = r0
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r0 = new com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState
                java.lang.String r1 = "QUEUING"
                r2 = 1
                r0.<init>(r1, r2)
                com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.QUEUING = r0
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r0 = new com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState
                java.lang.String r1 = "QUEUED"
                r2 = 2
                r0.<init>(r1, r2)
                com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.QUEUED = r0
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r0 = new com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState
                java.lang.String r1 = "RUNNING"
                r2 = 3
                r0.<init>(r1, r2)
                com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.RUNNING = r0
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState[] r0 = $values()
                com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.$VALUES = r0
                return
        }

        private WorkerRunningState(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState> r0 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r1 = (com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState) r1
                return r1
        }

        public static com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState[] values() {
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState[] r0 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState[] r0 = (com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState[]) r0
                return r0
        }
    }

    static {
            java.lang.Class<com.google.common.util.concurrent.SequentialExecutor> r0 = com.google.common.util.concurrent.SequentialExecutor.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.common.util.concurrent.SequentialExecutor.log = r0
            return
    }

    public SequentialExecutor(java.util.concurrent.Executor r3) {
            r2 = this;
            r2.<init>()
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r2.queue = r0
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r0 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.IDLE
            r2.workerRunningState = r0
            r0 = 0
            r2.workerRunCount = r0
            com.google.common.util.concurrent.SequentialExecutor$QueueWorker r0 = new com.google.common.util.concurrent.SequentialExecutor$QueueWorker
            r1 = 0
            r0.<init>(r2, r1)
            r2.worker = r0
            java.lang.Object r3 = com.google.common.base.Preconditions.checkNotNull(r3)
            java.util.concurrent.Executor r3 = (java.util.concurrent.Executor) r3
            r2.executor = r3
            return
    }

    public static /* synthetic */ java.util.Deque access$100(com.google.common.util.concurrent.SequentialExecutor r0) {
            java.util.Deque<java.lang.Runnable> r0 = r0.queue
            return r0
    }

    public static /* synthetic */ com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState access$200(com.google.common.util.concurrent.SequentialExecutor r0) {
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r0 = r0.workerRunningState
            return r0
    }

    public static /* synthetic */ com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState access$202(com.google.common.util.concurrent.SequentialExecutor r0, com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState r1) {
            r0.workerRunningState = r1
            return r1
    }

    public static /* synthetic */ long access$308(com.google.common.util.concurrent.SequentialExecutor r4) {
            long r0 = r4.workerRunCount
            r2 = 1
            long r2 = r2 + r0
            r4.workerRunCount = r2
            return r0
    }

    public static /* synthetic */ java.util.logging.Logger access$400() {
            java.util.logging.Logger r0 = com.google.common.util.concurrent.SequentialExecutor.log
            return r0
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable r9) {
            r8 = this;
            com.google.common.base.Preconditions.checkNotNull(r9)
            java.util.Deque<java.lang.Runnable> r0 = r8.queue
            monitor-enter(r0)
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r1 = r8.workerRunningState     // Catch: java.lang.Throwable -> L75
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r2 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.RUNNING     // Catch: java.lang.Throwable -> L75
            if (r1 == r2) goto L6e
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r2 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.QUEUED     // Catch: java.lang.Throwable -> L75
            if (r1 != r2) goto L11
            goto L6e
        L11:
            long r3 = r8.workerRunCount     // Catch: java.lang.Throwable -> L75
            com.google.common.util.concurrent.SequentialExecutor$1 r1 = new com.google.common.util.concurrent.SequentialExecutor$1     // Catch: java.lang.Throwable -> L75
            r1.<init>(r9)     // Catch: java.lang.Throwable -> L75
            java.util.Deque<java.lang.Runnable> r9 = r8.queue     // Catch: java.lang.Throwable -> L75
            r9.add(r1)     // Catch: java.lang.Throwable -> L75
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r9 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.QUEUING     // Catch: java.lang.Throwable -> L75
            r8.workerRunningState = r9     // Catch: java.lang.Throwable -> L75
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L75
            r0 = 1
            r5 = 0
            java.util.concurrent.Executor r6 = r8.executor     // Catch: java.lang.Error -> L48 java.lang.RuntimeException -> L4a
            com.google.common.util.concurrent.SequentialExecutor$QueueWorker r7 = r8.worker     // Catch: java.lang.Error -> L48 java.lang.RuntimeException -> L4a
            r6.execute(r7)     // Catch: java.lang.Error -> L48 java.lang.RuntimeException -> L4a
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r1 = r8.workerRunningState
            if (r1 == r9) goto L30
            goto L31
        L30:
            r0 = 0
        L31:
            if (r0 == 0) goto L34
            return
        L34:
            java.util.Deque<java.lang.Runnable> r6 = r8.queue
            monitor-enter(r6)
            long r0 = r8.workerRunCount     // Catch: java.lang.Throwable -> L45
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto L43
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r0 = r8.workerRunningState     // Catch: java.lang.Throwable -> L45
            if (r0 != r9) goto L43
            r8.workerRunningState = r2     // Catch: java.lang.Throwable -> L45
        L43:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L45
            return
        L45:
            r9 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L45
            throw r9
        L48:
            r9 = move-exception
            goto L4b
        L4a:
            r9 = move-exception
        L4b:
            java.util.Deque<java.lang.Runnable> r2 = r8.queue
            monitor-enter(r2)
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r3 = r8.workerRunningState     // Catch: java.lang.Throwable -> L6b
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r4 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.IDLE     // Catch: java.lang.Throwable -> L6b
            if (r3 == r4) goto L58
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r4 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.QUEUING     // Catch: java.lang.Throwable -> L6b
            if (r3 != r4) goto L61
        L58:
            java.util.Deque<java.lang.Runnable> r3 = r8.queue     // Catch: java.lang.Throwable -> L6b
            boolean r1 = r3.removeLastOccurrence(r1)     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L61
            goto L62
        L61:
            r0 = 0
        L62:
            boolean r1 = r9 instanceof java.util.concurrent.RejectedExecutionException     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L6a
            if (r0 != 0) goto L6a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6b
            return
        L6a:
            throw r9     // Catch: java.lang.Throwable -> L6b
        L6b:
            r9 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6b
            throw r9
        L6e:
            java.util.Deque<java.lang.Runnable> r1 = r8.queue     // Catch: java.lang.Throwable -> L75
            r1.add(r9)     // Catch: java.lang.Throwable -> L75
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L75
            return
        L75:
            r9 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L75
            throw r9
    }

    public java.lang.String toString() {
            r4 = this;
            int r0 = java.lang.System.identityHashCode(r4)
            java.util.concurrent.Executor r1 = r4.executor
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r1.length()
            int r2 = r2 + 32
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "SequentialExecutor@"
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = "{"
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = "}"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            return r0
    }
}
