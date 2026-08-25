package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
final class ListenerCallQueue<L> {
    private static final java.util.logging.Logger logger = null;
    private final java.util.List<com.google.common.util.concurrent.ListenerCallQueue.PerListenerQueue<L>> listeners;

    /* JADX INFO: loaded from: classes.dex */
    public interface Event<L> {
        void call(L r1);
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class PerListenerQueue<L> implements java.lang.Runnable {
        public final java.util.concurrent.Executor executor;

        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        public boolean isThreadScheduled;

        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        public final java.util.Queue<java.lang.Object> labelQueue;
        public final L listener;

        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        public final java.util.Queue<com.google.common.util.concurrent.ListenerCallQueue.Event<L>> waitQueue;

        public PerListenerQueue(L r2, java.util.concurrent.Executor r3) {
                r1 = this;
                r1.<init>()
                java.util.ArrayDeque r0 = com.google.common.collect.Queues.newArrayDeque()
                r1.waitQueue = r0
                java.util.ArrayDeque r0 = com.google.common.collect.Queues.newArrayDeque()
                r1.labelQueue = r0
                java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
                r1.listener = r2
                java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r3)
                java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
                r1.executor = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r10 = this;
            L0:
                r0 = 1
                r1 = 0
                monitor-enter(r10)     // Catch: java.lang.Throwable -> L6b
                boolean r2 = r10.isThreadScheduled     // Catch: java.lang.Throwable -> L5f
                com.google.common.base.Preconditions.checkState(r2)     // Catch: java.lang.Throwable -> L5f
                java.util.Queue<com.google.common.util.concurrent.ListenerCallQueue$Event<L>> r2 = r10.waitQueue     // Catch: java.lang.Throwable -> L5f
                java.lang.Object r2 = r2.poll()     // Catch: java.lang.Throwable -> L5f
                com.google.common.util.concurrent.ListenerCallQueue$Event r2 = (com.google.common.util.concurrent.ListenerCallQueue.Event) r2     // Catch: java.lang.Throwable -> L5f
                java.util.Queue<java.lang.Object> r3 = r10.labelQueue     // Catch: java.lang.Throwable -> L5f
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L5f
                if (r2 != 0) goto L1f
                r10.isThreadScheduled = r1     // Catch: java.lang.Throwable -> L5f
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L1c
                return
            L1c:
                r0 = move-exception
                r2 = 0
                goto L62
            L1f:
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L5f
                L r4 = r10.listener     // Catch: java.lang.RuntimeException -> L26 java.lang.Throwable -> L6b
                r2.call(r4)     // Catch: java.lang.RuntimeException -> L26 java.lang.Throwable -> L6b
                goto L0
            L26:
                r2 = move-exception
                java.util.logging.Logger r4 = com.google.common.util.concurrent.ListenerCallQueue.access$000()     // Catch: java.lang.Throwable -> L6b
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L6b
                L r6 = r10.listener     // Catch: java.lang.Throwable -> L6b
                java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L6b
                java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L6b
                int r7 = r6.length()     // Catch: java.lang.Throwable -> L6b
                int r7 = r7 + 37
                int r8 = r3.length()     // Catch: java.lang.Throwable -> L6b
                int r7 = r7 + r8
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6b
                r8.<init>(r7)     // Catch: java.lang.Throwable -> L6b
                java.lang.String r7 = "Exception while executing callback: "
                r8.append(r7)     // Catch: java.lang.Throwable -> L6b
                r8.append(r6)     // Catch: java.lang.Throwable -> L6b
                java.lang.String r6 = " "
                r8.append(r6)     // Catch: java.lang.Throwable -> L6b
                r8.append(r3)     // Catch: java.lang.Throwable -> L6b
                java.lang.String r3 = r8.toString()     // Catch: java.lang.Throwable -> L6b
                r4.log(r5, r3, r2)     // Catch: java.lang.Throwable -> L6b
                goto L0
            L5f:
                r2 = move-exception
                r0 = r2
                r2 = 1
            L62:
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L69
                throw r0     // Catch: java.lang.Throwable -> L64
            L64:
                r0 = move-exception
                r9 = r2
                r2 = r0
                r0 = r9
                goto L6c
            L69:
                r0 = move-exception
                goto L62
            L6b:
                r2 = move-exception
            L6c:
                if (r0 == 0) goto L76
                monitor-enter(r10)
                r10.isThreadScheduled = r1     // Catch: java.lang.Throwable -> L73
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L73
                goto L76
            L73:
                r0 = move-exception
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L73
                throw r0
            L76:
                throw r2
        }
    }

    static {
            java.lang.Class<com.google.common.util.concurrent.ListenerCallQueue> r0 = com.google.common.util.concurrent.ListenerCallQueue.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.common.util.concurrent.ListenerCallQueue.logger = r0
            return
    }

    public ListenerCallQueue() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = java.util.Collections.synchronizedList(r0)
            r1.listeners = r0
            return
    }

    public static /* synthetic */ java.util.logging.Logger access$000() {
            java.util.logging.Logger r0 = com.google.common.util.concurrent.ListenerCallQueue.logger
            return r0
    }

    private void enqueueHelper(com.google.common.util.concurrent.ListenerCallQueue.Event<L> r5, java.lang.Object r6) {
            r4 = this;
            java.lang.String r0 = "event"
            com.google.common.base.Preconditions.checkNotNull(r5, r0)
            java.lang.String r0 = "label"
            com.google.common.base.Preconditions.checkNotNull(r6, r0)
            java.util.List<com.google.common.util.concurrent.ListenerCallQueue$PerListenerQueue<L>> r0 = r4.listeners
            monitor-enter(r0)
            java.util.List<com.google.common.util.concurrent.ListenerCallQueue$PerListenerQueue<L>> r1 = r4.listeners     // Catch: java.lang.Throwable -> L31
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L31
        L13:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L31
            com.google.common.util.concurrent.ListenerCallQueue$PerListenerQueue r2 = (com.google.common.util.concurrent.ListenerCallQueue.PerListenerQueue) r2     // Catch: java.lang.Throwable -> L31
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L31
            java.util.Queue<com.google.common.util.concurrent.ListenerCallQueue$Event<L>> r3 = r2.waitQueue     // Catch: java.lang.Throwable -> L2c
            r3.add(r5)     // Catch: java.lang.Throwable -> L2c
            java.util.Queue<java.lang.Object> r3 = r2.labelQueue     // Catch: java.lang.Throwable -> L2c
            r3.add(r6)     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L31
            goto L13
        L2c:
            r5 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L31
            throw r5     // Catch: java.lang.Throwable -> L31
        L2f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            return
        L31:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            throw r5
    }

    public void addListener(L r3, java.util.concurrent.Executor r4) {
            r2 = this;
            java.lang.String r0 = "listener"
            com.google.common.base.Preconditions.checkNotNull(r3, r0)
            java.lang.String r0 = "executor"
            com.google.common.base.Preconditions.checkNotNull(r4, r0)
            java.util.List<com.google.common.util.concurrent.ListenerCallQueue$PerListenerQueue<L>> r0 = r2.listeners
            com.google.common.util.concurrent.ListenerCallQueue$PerListenerQueue r1 = new com.google.common.util.concurrent.ListenerCallQueue$PerListenerQueue
            r1.<init>(r3, r4)
            r0.add(r1)
            return
    }

    public void dispatch() {
            r8 = this;
            r0 = 0
            r1 = 0
        L2:
            java.util.List<com.google.common.util.concurrent.ListenerCallQueue$PerListenerQueue<L>> r2 = r8.listeners
            int r2 = r2.size()
            if (r1 >= r2) goto L5c
            java.util.List<com.google.common.util.concurrent.ListenerCallQueue$PerListenerQueue<L>> r2 = r8.listeners
            java.lang.Object r2 = r2.get(r1)
            com.google.common.util.concurrent.ListenerCallQueue$PerListenerQueue r2 = (com.google.common.util.concurrent.ListenerCallQueue.PerListenerQueue) r2
            monitor-enter(r2)
            boolean r3 = r2.isThreadScheduled     // Catch: java.lang.Throwable -> L59
            r4 = 1
            if (r3 != 0) goto L1b
            r2.isThreadScheduled = r4     // Catch: java.lang.Throwable -> L59
            goto L1c
        L1b:
            r4 = 0
        L1c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L59
            if (r4 == 0) goto L56
            java.util.concurrent.Executor r3 = r2.executor     // Catch: java.lang.RuntimeException -> L25
            r3.execute(r2)     // Catch: java.lang.RuntimeException -> L25
            goto L56
        L25:
            r1 = move-exception
            monitor-enter(r2)
            r2.isThreadScheduled = r0     // Catch: java.lang.Throwable -> L53
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L53
            java.util.logging.Logger r0 = access$000()
            java.util.logging.Level r3 = java.util.logging.Level.SEVERE
            L r4 = r2.listener
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.util.concurrent.Executor r2 = r2.executor
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r5 = r4.length()
            int r5 = r5 + 42
            int r6 = r2.length()
            int r6 = r6 + r5
            java.lang.String r5 = "Exception while running callbacks for "
            java.lang.String r7 = " on "
            java.lang.String r2 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r6, r5, r4, r7, r2)
            r0.log(r3, r2, r1)
            throw r1
        L53:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L53
            throw r0
        L56:
            int r1 = r1 + 1
            goto L2
        L59:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L59
            throw r0
        L5c:
            return
    }

    public void enqueue(com.google.common.util.concurrent.ListenerCallQueue.Event<L> r1) {
            r0 = this;
            r0.enqueueHelper(r1, r1)
            return
    }

    public void enqueue(com.google.common.util.concurrent.ListenerCallQueue.Event<L> r1, java.lang.String r2) {
            r0 = this;
            r0.enqueueHelper(r1, r2)
            return
    }
}
