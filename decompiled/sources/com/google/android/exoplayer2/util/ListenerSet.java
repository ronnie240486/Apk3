package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes2.dex */
public final class ListenerSet<T> {
    private static final int MSG_ITERATION_FINISHED = 0;
    private final com.google.android.exoplayer2.util.Clock clock;
    private final java.util.ArrayDeque<java.lang.Runnable> flushingEvents;
    private final com.google.android.exoplayer2.util.HandlerWrapper handler;
    private final com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent<T> iterationFinishedEvent;
    private final java.util.concurrent.CopyOnWriteArraySet<com.google.android.exoplayer2.util.ListenerSet.ListenerHolder<T>> listeners;
    private final java.util.ArrayDeque<java.lang.Runnable> queuedEvents;

    @androidx.annotation.GuardedBy("releasedLock")
    private boolean released;
    private final java.lang.Object releasedLock;
    private boolean throwsWhenUsingWrongThread;

    /* JADX INFO: loaded from: classes.dex */
    public interface Event<T> {
        void invoke(T r1);
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface IterationFinishedEvent<T> {
        void invoke(T r1, com.google.android.exoplayer2.util.FlagSet r2);
    }

    public static final class ListenerHolder<T> {
        private com.google.android.exoplayer2.util.FlagSet.Builder flagsBuilder;
        public final T listener;
        private boolean needsIterationFinishedEvent;
        private boolean released;

        public ListenerHolder(T r1) {
                r0 = this;
                r0.<init>()
                r0.listener = r1
                com.google.android.exoplayer2.util.FlagSet$Builder r1 = new com.google.android.exoplayer2.util.FlagSet$Builder
                r1.<init>()
                r0.flagsBuilder = r1
                return
        }

        public boolean equals(@androidx.annotation.Nullable java.lang.Object r3) {
                r2 = this;
                if (r2 != r3) goto L4
                r3 = 1
                return r3
            L4:
                if (r3 == 0) goto L1a
                java.lang.Class<com.google.android.exoplayer2.util.ListenerSet$ListenerHolder> r0 = com.google.android.exoplayer2.util.ListenerSet.ListenerHolder.class
                java.lang.Class r1 = r3.getClass()
                if (r0 == r1) goto Lf
                goto L1a
            Lf:
                T r0 = r2.listener
                com.google.android.exoplayer2.util.ListenerSet$ListenerHolder r3 = (com.google.android.exoplayer2.util.ListenerSet.ListenerHolder) r3
                T r3 = r3.listener
                boolean r3 = r0.equals(r3)
                return r3
            L1a:
                r3 = 0
                return r3
        }

        public int hashCode() {
                r1 = this;
                T r0 = r1.listener
                int r0 = r0.hashCode()
                return r0
        }

        public void invoke(int r2, com.google.android.exoplayer2.util.ListenerSet.Event<T> r3) {
                r1 = this;
                boolean r0 = r1.released
                if (r0 != 0) goto L14
                r0 = -1
                if (r2 == r0) goto Lc
                com.google.android.exoplayer2.util.FlagSet$Builder r0 = r1.flagsBuilder
                r0.add(r2)
            Lc:
                r2 = 1
                r1.needsIterationFinishedEvent = r2
                T r2 = r1.listener
                r3.invoke(r2)
            L14:
                return
        }

        public void iterationFinished(com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent<T> r3) {
                r2 = this;
                boolean r0 = r2.released
                if (r0 != 0) goto L1d
                boolean r0 = r2.needsIterationFinishedEvent
                if (r0 == 0) goto L1d
                com.google.android.exoplayer2.util.FlagSet$Builder r0 = r2.flagsBuilder
                com.google.android.exoplayer2.util.FlagSet r0 = r0.build()
                com.google.android.exoplayer2.util.FlagSet$Builder r1 = new com.google.android.exoplayer2.util.FlagSet$Builder
                r1.<init>()
                r2.flagsBuilder = r1
                r1 = 0
                r2.needsIterationFinishedEvent = r1
                T r1 = r2.listener
                r3.invoke(r1, r0)
            L1d:
                return
        }

        public void release(com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent<T> r3) {
                r2 = this;
                r0 = 1
                r2.released = r0
                boolean r0 = r2.needsIterationFinishedEvent
                if (r0 == 0) goto L15
                r0 = 0
                r2.needsIterationFinishedEvent = r0
                T r0 = r2.listener
                com.google.android.exoplayer2.util.FlagSet$Builder r1 = r2.flagsBuilder
                com.google.android.exoplayer2.util.FlagSet r1 = r1.build()
                r3.invoke(r0, r1)
            L15:
                return
        }
    }

    public static /* synthetic */ void $r8$lambda$NbKDn9xtItiyMgYZmjIx_Sv1FFQ(java.util.concurrent.CopyOnWriteArraySet r0, int r1, com.google.android.exoplayer2.util.ListenerSet.Event r2) {
            lambda$queueEvent$0(r0, r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$eEvjP-IE0x3J2lRvKfFbbjRFRvc, reason: not valid java name */
    public static /* synthetic */ boolean m273$r8$lambda$eEvjPIE0x3J2lRvKfFbbjRFRvc(com.google.android.exoplayer2.util.ListenerSet r0, android.os.Message r1) {
            boolean r0 = r0.handleMessage(r1)
            return r0
    }

    public ListenerSet(android.os.Looper r2, com.google.android.exoplayer2.util.Clock r3, com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent<T> r4) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
            r0.<init>()
            r1.<init>(r0, r2, r3, r4)
            return
    }

    private ListenerSet(java.util.concurrent.CopyOnWriteArraySet<com.google.android.exoplayer2.util.ListenerSet.ListenerHolder<T>> r1, android.os.Looper r2, com.google.android.exoplayer2.util.Clock r3, com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent<T> r4) {
            r0 = this;
            r0.<init>()
            r0.clock = r3
            r0.listeners = r1
            r0.iterationFinishedEvent = r4
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.releasedLock = r1
            java.util.ArrayDeque r1 = new java.util.ArrayDeque
            r1.<init>()
            r0.flushingEvents = r1
            java.util.ArrayDeque r1 = new java.util.ArrayDeque
            r1.<init>()
            r0.queuedEvents = r1
            com.google.android.exoplayer2.util.ListenerSet$$ExternalSyntheticLambda0 r1 = new com.google.android.exoplayer2.util.ListenerSet$$ExternalSyntheticLambda0
            r1.<init>(r0)
            com.google.android.exoplayer2.util.HandlerWrapper r1 = r3.createHandler(r2, r1)
            r0.handler = r1
            r1 = 1
            r0.throwsWhenUsingWrongThread = r1
            return
    }

    private boolean handleMessage(android.os.Message r3) {
            r2 = this;
            java.util.concurrent.CopyOnWriteArraySet<com.google.android.exoplayer2.util.ListenerSet$ListenerHolder<T>> r3 = r2.listeners
            java.util.Iterator r3 = r3.iterator()
        L6:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L20
            java.lang.Object r0 = r3.next()
            com.google.android.exoplayer2.util.ListenerSet$ListenerHolder r0 = (com.google.android.exoplayer2.util.ListenerSet.ListenerHolder) r0
            com.google.android.exoplayer2.util.ListenerSet$IterationFinishedEvent<T> r1 = r2.iterationFinishedEvent
            r0.iterationFinished(r1)
            com.google.android.exoplayer2.util.HandlerWrapper r0 = r2.handler
            r1 = 0
            boolean r0 = r0.hasMessages(r1)
            if (r0 == 0) goto L6
        L20:
            r3 = 1
            return r3
    }

    private static /* synthetic */ void lambda$queueEvent$0(java.util.concurrent.CopyOnWriteArraySet r1, int r2, com.google.android.exoplayer2.util.ListenerSet.Event r3) {
            java.util.Iterator r1 = r1.iterator()
        L4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L14
            java.lang.Object r0 = r1.next()
            com.google.android.exoplayer2.util.ListenerSet$ListenerHolder r0 = (com.google.android.exoplayer2.util.ListenerSet.ListenerHolder) r0
            r0.invoke(r2, r3)
            goto L4
        L14:
            return
    }

    private void verifyCurrentThread() {
            r2 = this;
            boolean r0 = r2.throwsWhenUsingWrongThread
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            com.google.android.exoplayer2.util.HandlerWrapper r1 = r2.handler
            android.os.Looper r1 = r1.getLooper()
            java.lang.Thread r1 = r1.getThread()
            if (r0 != r1) goto L17
            r0 = 1
            goto L18
        L17:
            r0 = 0
        L18:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            return
    }

    public void add(T r4) {
            r3 = this;
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r4)
            java.lang.Object r0 = r3.releasedLock
            monitor-enter(r0)
            boolean r1 = r3.released     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return
        Lc:
            java.util.concurrent.CopyOnWriteArraySet<com.google.android.exoplayer2.util.ListenerSet$ListenerHolder<T>> r1 = r3.listeners     // Catch: java.lang.Throwable -> L18
            com.google.android.exoplayer2.util.ListenerSet$ListenerHolder r2 = new com.google.android.exoplayer2.util.ListenerSet$ListenerHolder     // Catch: java.lang.Throwable -> L18
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L18
            r1.add(r2)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return
        L18:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r4
    }

    public void clear() {
            r1 = this;
            r1.verifyCurrentThread()
            java.util.concurrent.CopyOnWriteArraySet<com.google.android.exoplayer2.util.ListenerSet$ListenerHolder<T>> r0 = r1.listeners
            r0.clear()
            return
    }

    @androidx.annotation.CheckResult
    public com.google.android.exoplayer2.util.ListenerSet<T> copy(android.os.Looper r3, com.google.android.exoplayer2.util.Clock r4, com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent<T> r5) {
            r2 = this;
            com.google.android.exoplayer2.util.ListenerSet r0 = new com.google.android.exoplayer2.util.ListenerSet
            java.util.concurrent.CopyOnWriteArraySet<com.google.android.exoplayer2.util.ListenerSet$ListenerHolder<T>> r1 = r2.listeners
            r0.<init>(r1, r3, r4, r5)
            return r0
    }

    @androidx.annotation.CheckResult
    public com.google.android.exoplayer2.util.ListenerSet<T> copy(android.os.Looper r2, com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent<T> r3) {
            r1 = this;
            com.google.android.exoplayer2.util.Clock r0 = r1.clock
            com.google.android.exoplayer2.util.ListenerSet r2 = r1.copy(r2, r0, r3)
            return r2
    }

    public void flushEvents() {
            r3 = this;
            r3.verifyCurrentThread()
            java.util.ArrayDeque<java.lang.Runnable> r0 = r3.queuedEvents
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lc
            return
        Lc:
            com.google.android.exoplayer2.util.HandlerWrapper r0 = r3.handler
            r1 = 0
            boolean r0 = r0.hasMessages(r1)
            if (r0 != 0) goto L1e
            com.google.android.exoplayer2.util.HandlerWrapper r0 = r3.handler
            com.google.android.exoplayer2.util.HandlerWrapper$Message r1 = r0.obtainMessage(r1)
            r0.sendMessageAtFrontOfQueue(r1)
        L1e:
            java.util.ArrayDeque<java.lang.Runnable> r0 = r3.flushingEvents
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            java.util.ArrayDeque<java.lang.Runnable> r1 = r3.flushingEvents
            java.util.ArrayDeque<java.lang.Runnable> r2 = r3.queuedEvents
            r1.addAll(r2)
            java.util.ArrayDeque<java.lang.Runnable> r1 = r3.queuedEvents
            r1.clear()
            if (r0 == 0) goto L35
            return
        L35:
            java.util.ArrayDeque<java.lang.Runnable> r0 = r3.flushingEvents
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L4e
            java.util.ArrayDeque<java.lang.Runnable> r0 = r3.flushingEvents
            java.lang.Object r0 = r0.peekFirst()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            java.util.ArrayDeque<java.lang.Runnable> r0 = r3.flushingEvents
            r0.removeFirst()
            goto L35
        L4e:
            return
    }

    public void queueEvent(int r4, com.google.android.exoplayer2.util.ListenerSet.Event<T> r5) {
            r3 = this;
            r3.verifyCurrentThread()
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
            java.util.concurrent.CopyOnWriteArraySet<com.google.android.exoplayer2.util.ListenerSet$ListenerHolder<T>> r1 = r3.listeners
            r0.<init>(r1)
            java.util.ArrayDeque<java.lang.Runnable> r1 = r3.queuedEvents
            com.google.android.exoplayer2.util.ListenerSet$$ExternalSyntheticLambda1 r2 = new com.google.android.exoplayer2.util.ListenerSet$$ExternalSyntheticLambda1
            r2.<init>(r0, r4, r5)
            r1.add(r2)
            return
    }

    public void release() {
            r3 = this;
            r3.verifyCurrentThread()
            java.lang.Object r0 = r3.releasedLock
            monitor-enter(r0)
            r1 = 1
            r3.released = r1     // Catch: java.lang.Throwable -> L28
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            java.util.concurrent.CopyOnWriteArraySet<com.google.android.exoplayer2.util.ListenerSet$ListenerHolder<T>> r0 = r3.listeners
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            com.google.android.exoplayer2.util.ListenerSet$ListenerHolder r1 = (com.google.android.exoplayer2.util.ListenerSet.ListenerHolder) r1
            com.google.android.exoplayer2.util.ListenerSet$IterationFinishedEvent<T> r2 = r3.iterationFinishedEvent
            r1.release(r2)
            goto L10
        L22:
            java.util.concurrent.CopyOnWriteArraySet<com.google.android.exoplayer2.util.ListenerSet$ListenerHolder<T>> r0 = r3.listeners
            r0.clear()
            return
        L28:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            throw r1
    }

    public void remove(T r4) {
            r3 = this;
            r3.verifyCurrentThread()
            java.util.concurrent.CopyOnWriteArraySet<com.google.android.exoplayer2.util.ListenerSet$ListenerHolder<T>> r0 = r3.listeners
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r0.next()
            com.google.android.exoplayer2.util.ListenerSet$ListenerHolder r1 = (com.google.android.exoplayer2.util.ListenerSet.ListenerHolder) r1
            T r2 = r1.listener
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L9
            com.google.android.exoplayer2.util.ListenerSet$IterationFinishedEvent<T> r2 = r3.iterationFinishedEvent
            r1.release(r2)
            java.util.concurrent.CopyOnWriteArraySet<com.google.android.exoplayer2.util.ListenerSet$ListenerHolder<T>> r2 = r3.listeners
            r2.remove(r1)
            goto L9
        L28:
            return
    }

    public void sendEvent(int r1, com.google.android.exoplayer2.util.ListenerSet.Event<T> r2) {
            r0 = this;
            r0.queueEvent(r1, r2)
            r0.flushEvents()
            return
    }

    @java.lang.Deprecated
    public void setThrowsWhenUsingWrongThread(boolean r1) {
            r0 = this;
            r0.throwsWhenUsingWrongThread = r1
            return
    }

    public int size() {
            r1 = this;
            r1.verifyCurrentThread()
            java.util.concurrent.CopyOnWriteArraySet<com.google.android.exoplayer2.util.ListenerSet$ListenerHolder<T>> r0 = r1.listeners
            int r0 = r0.size()
            return r0
    }
}
