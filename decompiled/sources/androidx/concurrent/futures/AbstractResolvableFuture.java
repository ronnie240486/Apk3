package androidx.concurrent.futures;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class AbstractResolvableFuture<V> implements com.google.common.util.concurrent.ListenableFuture<V> {
    public static final androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper ATOMIC_HELPER = null;
    public static final boolean GENERATE_CANCELLATION_CAUSES = false;
    private static final java.lang.Object NULL = null;
    private static final long SPIN_THRESHOLD_NANOS = 1000;
    private static final java.util.logging.Logger log = null;

    @androidx.annotation.Nullable
    public volatile androidx.concurrent.futures.AbstractResolvableFuture.Listener listeners;

    @androidx.annotation.Nullable
    public volatile java.lang.Object value;

    @androidx.annotation.Nullable
    public volatile androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiters;

    /* JADX INFO: renamed from: androidx.concurrent.futures.AbstractResolvableFuture$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static abstract class AtomicHelper {
        private AtomicHelper() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ AtomicHelper(androidx.concurrent.futures.AbstractResolvableFuture.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract boolean casListeners(androidx.concurrent.futures.AbstractResolvableFuture<?> r1, androidx.concurrent.futures.AbstractResolvableFuture.Listener r2, androidx.concurrent.futures.AbstractResolvableFuture.Listener r3);

        public abstract boolean casValue(androidx.concurrent.futures.AbstractResolvableFuture<?> r1, java.lang.Object r2, java.lang.Object r3);

        public abstract boolean casWaiters(androidx.concurrent.futures.AbstractResolvableFuture<?> r1, androidx.concurrent.futures.AbstractResolvableFuture.Waiter r2, androidx.concurrent.futures.AbstractResolvableFuture.Waiter r3);

        public abstract void putNext(androidx.concurrent.futures.AbstractResolvableFuture.Waiter r1, androidx.concurrent.futures.AbstractResolvableFuture.Waiter r2);

        public abstract void putThread(androidx.concurrent.futures.AbstractResolvableFuture.Waiter r1, java.lang.Thread r2);
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class Cancellation {
        public static final androidx.concurrent.futures.AbstractResolvableFuture.Cancellation CAUSELESS_CANCELLED = null;
        public static final androidx.concurrent.futures.AbstractResolvableFuture.Cancellation CAUSELESS_INTERRUPTED = null;

        @androidx.annotation.Nullable
        public final java.lang.Throwable cause;
        public final boolean wasInterrupted;

        static {
                boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture.GENERATE_CANCELLATION_CAUSES
                r1 = 0
                if (r0 == 0) goto La
                androidx.concurrent.futures.AbstractResolvableFuture.Cancellation.CAUSELESS_CANCELLED = r1
                androidx.concurrent.futures.AbstractResolvableFuture.Cancellation.CAUSELESS_INTERRUPTED = r1
                goto L1a
            La:
                androidx.concurrent.futures.AbstractResolvableFuture$Cancellation r0 = new androidx.concurrent.futures.AbstractResolvableFuture$Cancellation
                r2 = 0
                r0.<init>(r2, r1)
                androidx.concurrent.futures.AbstractResolvableFuture.Cancellation.CAUSELESS_CANCELLED = r0
                androidx.concurrent.futures.AbstractResolvableFuture$Cancellation r0 = new androidx.concurrent.futures.AbstractResolvableFuture$Cancellation
                r2 = 1
                r0.<init>(r2, r1)
                androidx.concurrent.futures.AbstractResolvableFuture.Cancellation.CAUSELESS_INTERRUPTED = r0
            L1a:
                return
        }

        public Cancellation(boolean r1, @androidx.annotation.Nullable java.lang.Throwable r2) {
                r0 = this;
                r0.<init>()
                r0.wasInterrupted = r1
                r0.cause = r2
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class Failure {
        public static final androidx.concurrent.futures.AbstractResolvableFuture.Failure FALLBACK_INSTANCE = null;
        public final java.lang.Throwable exception;


        static {
                androidx.concurrent.futures.AbstractResolvableFuture$Failure r0 = new androidx.concurrent.futures.AbstractResolvableFuture$Failure
                androidx.concurrent.futures.AbstractResolvableFuture$Failure$1 r1 = new androidx.concurrent.futures.AbstractResolvableFuture$Failure$1
                r1.<init>()
                r0.<init>(r1)
                androidx.concurrent.futures.AbstractResolvableFuture.Failure.FALLBACK_INSTANCE = r0
                return
        }

        public Failure(java.lang.Throwable r2) {
                r1 = this;
                r1.<init>()
                boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture.GENERATE_CANCELLATION_CAUSES
                java.util.Objects.requireNonNull(r2)
                r1.exception = r2
                return
        }
    }

    public static final class Listener {
        public static final androidx.concurrent.futures.AbstractResolvableFuture.Listener TOMBSTONE = null;
        public final java.util.concurrent.Executor executor;

        @androidx.annotation.Nullable
        public androidx.concurrent.futures.AbstractResolvableFuture.Listener next;
        public final java.lang.Runnable task;

        static {
                androidx.concurrent.futures.AbstractResolvableFuture$Listener r0 = new androidx.concurrent.futures.AbstractResolvableFuture$Listener
                r1 = 0
                r0.<init>(r1, r1)
                androidx.concurrent.futures.AbstractResolvableFuture.Listener.TOMBSTONE = r0
                return
        }

        public Listener(java.lang.Runnable r1, java.util.concurrent.Executor r2) {
                r0 = this;
                r0.<init>()
                r0.task = r1
                r0.executor = r2
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class SafeAtomicHelper extends androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper {
        public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture, androidx.concurrent.futures.AbstractResolvableFuture.Listener> listenersUpdater;
        public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture, java.lang.Object> valueUpdater;
        public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture.Waiter, androidx.concurrent.futures.AbstractResolvableFuture.Waiter> waiterNextUpdater;
        public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture.Waiter, java.lang.Thread> waiterThreadUpdater;
        public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture, androidx.concurrent.futures.AbstractResolvableFuture.Waiter> waitersUpdater;

        public SafeAtomicHelper(java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture.Waiter, java.lang.Thread> r2, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture.Waiter, androidx.concurrent.futures.AbstractResolvableFuture.Waiter> r3, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture, androidx.concurrent.futures.AbstractResolvableFuture.Waiter> r4, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture, androidx.concurrent.futures.AbstractResolvableFuture.Listener> r5, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture, java.lang.Object> r6) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.waiterThreadUpdater = r2
                r1.waiterNextUpdater = r3
                r1.waitersUpdater = r4
                r1.listenersUpdater = r5
                r1.valueUpdater = r6
                return
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        public final boolean casListeners(androidx.concurrent.futures.AbstractResolvableFuture<?> r3, androidx.concurrent.futures.AbstractResolvableFuture.Listener r4, androidx.concurrent.futures.AbstractResolvableFuture.Listener r5) {
                r2 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture, androidx.concurrent.futures.AbstractResolvableFuture$Listener> r0 = r2.listenersUpdater
            L2:
                boolean r1 = r0.compareAndSet(r3, r4, r5)
                if (r1 == 0) goto La
                r3 = 1
                goto L11
            La:
                java.lang.Object r1 = r0.get(r3)
                if (r1 == r4) goto L2
                r3 = 0
            L11:
                return r3
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        public final boolean casValue(androidx.concurrent.futures.AbstractResolvableFuture<?> r3, java.lang.Object r4, java.lang.Object r5) {
                r2 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture, java.lang.Object> r0 = r2.valueUpdater
            L2:
                boolean r1 = r0.compareAndSet(r3, r4, r5)
                if (r1 == 0) goto La
                r3 = 1
                goto L11
            La:
                java.lang.Object r1 = r0.get(r3)
                if (r1 == r4) goto L2
                r3 = 0
            L11:
                return r3
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        public final boolean casWaiters(androidx.concurrent.futures.AbstractResolvableFuture<?> r3, androidx.concurrent.futures.AbstractResolvableFuture.Waiter r4, androidx.concurrent.futures.AbstractResolvableFuture.Waiter r5) {
                r2 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture, androidx.concurrent.futures.AbstractResolvableFuture$Waiter> r0 = r2.waitersUpdater
            L2:
                boolean r1 = r0.compareAndSet(r3, r4, r5)
                if (r1 == 0) goto La
                r3 = 1
                goto L11
            La:
                java.lang.Object r1 = r0.get(r3)
                if (r1 == r4) goto L2
                r3 = 0
            L11:
                return r3
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        public final void putNext(androidx.concurrent.futures.AbstractResolvableFuture.Waiter r2, androidx.concurrent.futures.AbstractResolvableFuture.Waiter r3) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture$Waiter, androidx.concurrent.futures.AbstractResolvableFuture$Waiter> r0 = r1.waiterNextUpdater
                r0.lazySet(r2, r3)
                return
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        public final void putThread(androidx.concurrent.futures.AbstractResolvableFuture.Waiter r2, java.lang.Thread r3) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture$Waiter, java.lang.Thread> r0 = r1.waiterThreadUpdater
                r0.lazySet(r2, r3)
                return
        }
    }

    public static final class SetFuture<V> implements java.lang.Runnable {
        public final com.google.common.util.concurrent.ListenableFuture<? extends V> future;
        public final androidx.concurrent.futures.AbstractResolvableFuture<V> owner;

        public SetFuture(androidx.concurrent.futures.AbstractResolvableFuture<V> r1, com.google.common.util.concurrent.ListenableFuture<? extends V> r2) {
                r0 = this;
                r0.<init>()
                r0.owner = r1
                r0.future = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                androidx.concurrent.futures.AbstractResolvableFuture<V> r0 = r3.owner
                java.lang.Object r0 = r0.value
                if (r0 == r3) goto L7
                return
            L7:
                com.google.common.util.concurrent.ListenableFuture<? extends V> r0 = r3.future
                java.lang.Object r0 = androidx.concurrent.futures.AbstractResolvableFuture.getFutureValue(r0)
                androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper r1 = androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER
                androidx.concurrent.futures.AbstractResolvableFuture<V> r2 = r3.owner
                boolean r0 = r1.casValue(r2, r3, r0)
                if (r0 == 0) goto L1c
                androidx.concurrent.futures.AbstractResolvableFuture<V> r0 = r3.owner
                androidx.concurrent.futures.AbstractResolvableFuture.complete(r0)
            L1c:
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class SynchronizedHelper extends androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper {
        public SynchronizedHelper() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        public final boolean casListeners(androidx.concurrent.futures.AbstractResolvableFuture<?> r2, androidx.concurrent.futures.AbstractResolvableFuture.Listener r3, androidx.concurrent.futures.AbstractResolvableFuture.Listener r4) {
                r1 = this;
                monitor-enter(r2)
                androidx.concurrent.futures.AbstractResolvableFuture$Listener r0 = r2.listeners     // Catch: java.lang.Throwable -> Ld
                if (r0 != r3) goto La
                r2.listeners = r4     // Catch: java.lang.Throwable -> Ld
                r3 = 1
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                return r3
            La:
                r3 = 0
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        public final boolean casValue(androidx.concurrent.futures.AbstractResolvableFuture<?> r2, java.lang.Object r3, java.lang.Object r4) {
                r1 = this;
                monitor-enter(r2)
                java.lang.Object r0 = r2.value     // Catch: java.lang.Throwable -> Ld
                if (r0 != r3) goto La
                r2.value = r4     // Catch: java.lang.Throwable -> Ld
                r3 = 1
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                return r3
            La:
                r3 = 0
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        public final boolean casWaiters(androidx.concurrent.futures.AbstractResolvableFuture<?> r2, androidx.concurrent.futures.AbstractResolvableFuture.Waiter r3, androidx.concurrent.futures.AbstractResolvableFuture.Waiter r4) {
                r1 = this;
                monitor-enter(r2)
                androidx.concurrent.futures.AbstractResolvableFuture$Waiter r0 = r2.waiters     // Catch: java.lang.Throwable -> Ld
                if (r0 != r3) goto La
                r2.waiters = r4     // Catch: java.lang.Throwable -> Ld
                r3 = 1
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                return r3
            La:
                r3 = 0
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        public final void putNext(androidx.concurrent.futures.AbstractResolvableFuture.Waiter r1, androidx.concurrent.futures.AbstractResolvableFuture.Waiter r2) {
                r0 = this;
                r1.next = r2
                return
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        public final void putThread(androidx.concurrent.futures.AbstractResolvableFuture.Waiter r1, java.lang.Thread r2) {
                r0 = this;
                r1.thread = r2
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Waiter {
        public static final androidx.concurrent.futures.AbstractResolvableFuture.Waiter TOMBSTONE = null;

        @androidx.annotation.Nullable
        public volatile androidx.concurrent.futures.AbstractResolvableFuture.Waiter next;

        @androidx.annotation.Nullable
        public volatile java.lang.Thread thread;

        static {
                androidx.concurrent.futures.AbstractResolvableFuture$Waiter r0 = new androidx.concurrent.futures.AbstractResolvableFuture$Waiter
                r1 = 0
                r0.<init>(r1)
                androidx.concurrent.futures.AbstractResolvableFuture.Waiter.TOMBSTONE = r0
                return
        }

        public Waiter() {
                r2 = this;
                r2.<init>()
                androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper r0 = androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r0.putThread(r2, r1)
                return
        }

        public Waiter(boolean r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            java.lang.Class<androidx.concurrent.futures.AbstractResolvableFuture$Waiter> r0 = androidx.concurrent.futures.AbstractResolvableFuture.Waiter.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            androidx.concurrent.futures.AbstractResolvableFuture.GENERATE_CANCELLATION_CAUSES = r1
            java.lang.Class<androidx.concurrent.futures.AbstractResolvableFuture> r1 = androidx.concurrent.futures.AbstractResolvableFuture.class
            java.lang.String r1 = r1.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            androidx.concurrent.futures.AbstractResolvableFuture.log = r1
            androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper r1 = new androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper     // Catch: java.lang.Throwable -> L51
            java.lang.Class<java.lang.Thread> r2 = java.lang.Thread.class
            java.lang.String r3 = "thread"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r3)     // Catch: java.lang.Throwable -> L51
            java.lang.String r2 = "next"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r2)     // Catch: java.lang.Throwable -> L51
            java.lang.Class<androidx.concurrent.futures.AbstractResolvableFuture> r2 = androidx.concurrent.futures.AbstractResolvableFuture.class
            java.lang.String r5 = "waiters"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r5)     // Catch: java.lang.Throwable -> L51
            java.lang.Class<androidx.concurrent.futures.AbstractResolvableFuture> r0 = androidx.concurrent.futures.AbstractResolvableFuture.class
            java.lang.Class<androidx.concurrent.futures.AbstractResolvableFuture$Listener> r2 = androidx.concurrent.futures.AbstractResolvableFuture.Listener.class
            java.lang.String r6 = "listeners"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r6)     // Catch: java.lang.Throwable -> L51
            java.lang.Class<androidx.concurrent.futures.AbstractResolvableFuture> r0 = androidx.concurrent.futures.AbstractResolvableFuture.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.String r7 = "value"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r7)     // Catch: java.lang.Throwable -> L51
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L51
            r0 = 0
            goto L57
        L51:
            r0 = move-exception
            androidx.concurrent.futures.AbstractResolvableFuture$SynchronizedHelper r1 = new androidx.concurrent.futures.AbstractResolvableFuture$SynchronizedHelper
            r1.<init>()
        L57:
            androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER = r1
            java.lang.Class<java.util.concurrent.locks.LockSupport> r1 = java.util.concurrent.locks.LockSupport.class
            if (r0 == 0) goto L66
            java.util.logging.Logger r1 = androidx.concurrent.futures.AbstractResolvableFuture.log
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L66:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.concurrent.futures.AbstractResolvableFuture.NULL = r0
            return
    }

    public AbstractResolvableFuture() {
            r0 = this;
            r0.<init>()
            return
    }

    private void addDoneString(java.lang.StringBuilder r4) {
            r3 = this;
            java.lang.String r0 = "]"
            java.lang.Object r1 = getUninterruptibly(r3)     // Catch: java.lang.RuntimeException -> L16 java.util.concurrent.CancellationException -> L29 java.util.concurrent.ExecutionException -> L2f
            java.lang.String r2 = "SUCCESS, result=["
            r4.append(r2)     // Catch: java.lang.RuntimeException -> L16 java.util.concurrent.CancellationException -> L29 java.util.concurrent.ExecutionException -> L2f
            java.lang.String r1 = r3.userObjectToString(r1)     // Catch: java.lang.RuntimeException -> L16 java.util.concurrent.CancellationException -> L29 java.util.concurrent.ExecutionException -> L2f
            r4.append(r1)     // Catch: java.lang.RuntimeException -> L16 java.util.concurrent.CancellationException -> L29 java.util.concurrent.ExecutionException -> L2f
            r4.append(r0)     // Catch: java.lang.RuntimeException -> L16 java.util.concurrent.CancellationException -> L29 java.util.concurrent.ExecutionException -> L2f
            goto L3f
        L16:
            r0 = move-exception
            java.lang.String r1 = "UNKNOWN, cause=["
            r4.append(r1)
            java.lang.Class r0 = r0.getClass()
            r4.append(r0)
            java.lang.String r0 = " thrown from get()]"
            r4.append(r0)
            goto L3f
        L29:
            java.lang.String r0 = "CANCELLED"
            r4.append(r0)
            goto L3f
        L2f:
            r1 = move-exception
            java.lang.String r2 = "FAILURE, cause=["
            r4.append(r2)
            java.lang.Throwable r1 = r1.getCause()
            r4.append(r1)
            r4.append(r0)
        L3f:
            return
    }

    private static java.util.concurrent.CancellationException cancellationExceptionWithCause(@androidx.annotation.Nullable java.lang.String r1, @androidx.annotation.Nullable java.lang.Throwable r2) {
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            r0.<init>(r1)
            r0.initCause(r2)
            return r0
    }

    private androidx.concurrent.futures.AbstractResolvableFuture.Listener clearListeners(androidx.concurrent.futures.AbstractResolvableFuture.Listener r5) {
            r4 = this;
        L0:
            androidx.concurrent.futures.AbstractResolvableFuture$Listener r0 = r4.listeners
            androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper r1 = androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER
            androidx.concurrent.futures.AbstractResolvableFuture$Listener r2 = androidx.concurrent.futures.AbstractResolvableFuture.Listener.TOMBSTONE
            boolean r1 = r1.casListeners(r4, r0, r2)
            if (r1 == 0) goto L0
            r3 = r0
            r0 = r5
            r5 = r3
        Lf:
            if (r5 == 0) goto L18
            androidx.concurrent.futures.AbstractResolvableFuture$Listener r1 = r5.next
            r5.next = r0
            r0 = r5
            r5 = r1
            goto Lf
        L18:
            return r0
    }

    public static void complete(androidx.concurrent.futures.AbstractResolvableFuture<?> r4) {
            r0 = 0
        L1:
            r4.releaseWaiters()
            androidx.concurrent.futures.AbstractResolvableFuture$Listener r4 = r4.clearListeners(r0)
        L8:
            if (r4 == 0) goto L30
            androidx.concurrent.futures.AbstractResolvableFuture$Listener r0 = r4.next
            java.lang.Runnable r1 = r4.task
            boolean r2 = r1 instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture
            if (r2 == 0) goto L29
            androidx.concurrent.futures.AbstractResolvableFuture$SetFuture r1 = (androidx.concurrent.futures.AbstractResolvableFuture.SetFuture) r1
            androidx.concurrent.futures.AbstractResolvableFuture<V> r4 = r1.owner
            java.lang.Object r2 = r4.value
            if (r2 != r1) goto L2e
            com.google.common.util.concurrent.ListenableFuture<? extends V> r2 = r1.future
            java.lang.Object r2 = getFutureValue(r2)
            androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper r3 = androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER
            boolean r1 = r3.casValue(r4, r1, r2)
            if (r1 == 0) goto L2e
            goto L1
        L29:
            java.util.concurrent.Executor r4 = r4.executor
            executeListener(r1, r4)
        L2e:
            r4 = r0
            goto L8
        L30:
            return
    }

    private static void executeListener(java.lang.Runnable r5, java.util.concurrent.Executor r6) {
            r6.execute(r5)     // Catch: java.lang.RuntimeException -> L4
            goto L25
        L4:
            r0 = move-exception
            java.util.logging.Logger r1 = androidx.concurrent.futures.AbstractResolvableFuture.log
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "RuntimeException while executing runnable "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r5 = " with executor "
            r3.append(r5)
            r3.append(r6)
            java.lang.String r5 = r3.toString()
            r1.log(r2, r5, r0)
        L25:
            return
    }

    private V getDoneValue(java.lang.Object r2) throws java.util.concurrent.ExecutionException {
            r1 = this;
            boolean r0 = r2 instanceof androidx.concurrent.futures.AbstractResolvableFuture.Cancellation
            if (r0 != 0) goto L18
            boolean r0 = r2 instanceof androidx.concurrent.futures.AbstractResolvableFuture.Failure
            if (r0 != 0) goto Le
            java.lang.Object r0 = androidx.concurrent.futures.AbstractResolvableFuture.NULL
            if (r2 != r0) goto Ld
            r2 = 0
        Ld:
            return r2
        Le:
            java.util.concurrent.ExecutionException r0 = new java.util.concurrent.ExecutionException
            androidx.concurrent.futures.AbstractResolvableFuture$Failure r2 = (androidx.concurrent.futures.AbstractResolvableFuture.Failure) r2
            java.lang.Throwable r2 = r2.exception
            r0.<init>(r2)
            throw r0
        L18:
            androidx.concurrent.futures.AbstractResolvableFuture$Cancellation r2 = (androidx.concurrent.futures.AbstractResolvableFuture.Cancellation) r2
            java.lang.Throwable r2 = r2.cause
            java.lang.String r0 = "Task was cancelled."
            java.util.concurrent.CancellationException r2 = cancellationExceptionWithCause(r0, r2)
            throw r2
    }

    public static java.lang.Object getFutureValue(com.google.common.util.concurrent.ListenableFuture<?> r5) {
            boolean r0 = r5 instanceof androidx.concurrent.futures.AbstractResolvableFuture
            r1 = 0
            if (r0 == 0) goto L23
            androidx.concurrent.futures.AbstractResolvableFuture r5 = (androidx.concurrent.futures.AbstractResolvableFuture) r5
            java.lang.Object r5 = r5.value
            boolean r0 = r5 instanceof androidx.concurrent.futures.AbstractResolvableFuture.Cancellation
            if (r0 == 0) goto L22
            r0 = r5
            androidx.concurrent.futures.AbstractResolvableFuture$Cancellation r0 = (androidx.concurrent.futures.AbstractResolvableFuture.Cancellation) r0
            boolean r2 = r0.wasInterrupted
            if (r2 == 0) goto L22
            java.lang.Throwable r5 = r0.cause
            if (r5 == 0) goto L20
            androidx.concurrent.futures.AbstractResolvableFuture$Cancellation r5 = new androidx.concurrent.futures.AbstractResolvableFuture$Cancellation
            java.lang.Throwable r0 = r0.cause
            r5.<init>(r1, r0)
            goto L22
        L20:
            androidx.concurrent.futures.AbstractResolvableFuture$Cancellation r5 = androidx.concurrent.futures.AbstractResolvableFuture.Cancellation.CAUSELESS_CANCELLED
        L22:
            return r5
        L23:
            boolean r0 = r5.isCancelled()
            boolean r2 = androidx.concurrent.futures.AbstractResolvableFuture.GENERATE_CANCELLATION_CAUSES
            r2 = r2 ^ 1
            r2 = r2 & r0
            if (r2 == 0) goto L31
            androidx.concurrent.futures.AbstractResolvableFuture$Cancellation r5 = androidx.concurrent.futures.AbstractResolvableFuture.Cancellation.CAUSELESS_CANCELLED
            return r5
        L31:
            java.lang.Object r2 = getUninterruptibly(r5)     // Catch: java.lang.Throwable -> L3a java.util.concurrent.CancellationException -> L41 java.util.concurrent.ExecutionException -> L66
            if (r2 != 0) goto L39
            java.lang.Object r2 = androidx.concurrent.futures.AbstractResolvableFuture.NULL     // Catch: java.lang.Throwable -> L3a java.util.concurrent.CancellationException -> L41 java.util.concurrent.ExecutionException -> L66
        L39:
            return r2
        L3a:
            r5 = move-exception
            androidx.concurrent.futures.AbstractResolvableFuture$Failure r0 = new androidx.concurrent.futures.AbstractResolvableFuture$Failure
            r0.<init>(r5)
            return r0
        L41:
            r2 = move-exception
            if (r0 != 0) goto L60
            androidx.concurrent.futures.AbstractResolvableFuture$Failure r0 = new androidx.concurrent.futures.AbstractResolvableFuture$Failure
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "get() threw CancellationException, despite reporting isCancelled() == false: "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            r1.<init>(r5, r2)
            r0.<init>(r1)
            return r0
        L60:
            androidx.concurrent.futures.AbstractResolvableFuture$Cancellation r5 = new androidx.concurrent.futures.AbstractResolvableFuture$Cancellation
            r5.<init>(r1, r2)
            return r5
        L66:
            r5 = move-exception
            androidx.concurrent.futures.AbstractResolvableFuture$Failure r0 = new androidx.concurrent.futures.AbstractResolvableFuture$Failure
            java.lang.Throwable r5 = r5.getCause()
            r0.<init>(r5)
            return r0
    }

    private static <V> V getUninterruptibly(java.util.concurrent.Future<V> r1) throws java.util.concurrent.ExecutionException {
            r0 = 0
        L1:
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> Lf java.lang.InterruptedException -> L1a
            if (r0 == 0) goto Le
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        Le:
            return r1
        Lf:
            r1 = move-exception
            if (r0 == 0) goto L19
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L19:
            throw r1
        L1a:
            r0 = 1
            goto L1
    }

    private void releaseWaiters() {
            r3 = this;
        L0:
            androidx.concurrent.futures.AbstractResolvableFuture$Waiter r0 = r3.waiters
            androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper r1 = androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER
            androidx.concurrent.futures.AbstractResolvableFuture$Waiter r2 = androidx.concurrent.futures.AbstractResolvableFuture.Waiter.TOMBSTONE
            boolean r1 = r1.casWaiters(r3, r0, r2)
            if (r1 == 0) goto L0
        Lc:
            if (r0 == 0) goto L1b
            java.lang.Thread r1 = r0.thread
            if (r1 == 0) goto L18
            r2 = 0
            r0.thread = r2
            java.util.concurrent.locks.LockSupport.unpark(r1)
        L18:
            androidx.concurrent.futures.AbstractResolvableFuture$Waiter r0 = r0.next
            goto Lc
        L1b:
            return
    }

    private void removeWaiter(androidx.concurrent.futures.AbstractResolvableFuture.Waiter r5) {
            r4 = this;
            r0 = 0
            r5.thread = r0
        L3:
            androidx.concurrent.futures.AbstractResolvableFuture$Waiter r5 = r4.waiters
            androidx.concurrent.futures.AbstractResolvableFuture$Waiter r1 = androidx.concurrent.futures.AbstractResolvableFuture.Waiter.TOMBSTONE
            if (r5 != r1) goto La
            return
        La:
            r1 = r0
        Lb:
            if (r5 == 0) goto L29
            androidx.concurrent.futures.AbstractResolvableFuture$Waiter r2 = r5.next
            java.lang.Thread r3 = r5.thread
            if (r3 == 0) goto L15
            r1 = r5
            goto L27
        L15:
            if (r1 == 0) goto L1e
            r1.next = r2
            java.lang.Thread r5 = r1.thread
            if (r5 != 0) goto L27
            goto L3
        L1e:
            androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper r3 = androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER
            boolean r5 = r3.casWaiters(r4, r5, r2)
            if (r5 != 0) goto L27
            goto L3
        L27:
            r5 = r2
            goto Lb
        L29:
            return
    }

    private java.lang.String userObjectToString(java.lang.Object r1) {
            r0 = this;
            if (r1 != r0) goto L6
            java.lang.String r1 = "this future"
            return r1
        L6:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            return r1
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(java.lang.Runnable r4, java.util.concurrent.Executor r5) {
            r3 = this;
            java.util.Objects.requireNonNull(r4)
            java.util.Objects.requireNonNull(r5)
            androidx.concurrent.futures.AbstractResolvableFuture$Listener r0 = r3.listeners
            androidx.concurrent.futures.AbstractResolvableFuture$Listener r1 = androidx.concurrent.futures.AbstractResolvableFuture.Listener.TOMBSTONE
            if (r0 == r1) goto L22
            androidx.concurrent.futures.AbstractResolvableFuture$Listener r1 = new androidx.concurrent.futures.AbstractResolvableFuture$Listener
            r1.<init>(r4, r5)
        L11:
            r1.next = r0
            androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper r2 = androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER
            boolean r0 = r2.casListeners(r3, r0, r1)
            if (r0 == 0) goto L1c
            return
        L1c:
            androidx.concurrent.futures.AbstractResolvableFuture$Listener r0 = r3.listeners
            androidx.concurrent.futures.AbstractResolvableFuture$Listener r2 = androidx.concurrent.futures.AbstractResolvableFuture.Listener.TOMBSTONE
            if (r0 != r2) goto L11
        L22:
            executeListener(r4, r5)
            return
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean r8) {
            r7 = this;
            java.lang.Object r0 = r7.value
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L8
            r3 = 1
            goto L9
        L8:
            r3 = 0
        L9:
            boolean r4 = r0 instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture
            r3 = r3 | r4
            if (r3 == 0) goto L5c
            boolean r3 = androidx.concurrent.futures.AbstractResolvableFuture.GENERATE_CANCELLATION_CAUSES
            if (r3 == 0) goto L1f
            androidx.concurrent.futures.AbstractResolvableFuture$Cancellation r3 = new androidx.concurrent.futures.AbstractResolvableFuture$Cancellation
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L26
        L1f:
            if (r8 == 0) goto L24
            androidx.concurrent.futures.AbstractResolvableFuture$Cancellation r3 = androidx.concurrent.futures.AbstractResolvableFuture.Cancellation.CAUSELESS_INTERRUPTED
            goto L26
        L24:
            androidx.concurrent.futures.AbstractResolvableFuture$Cancellation r3 = androidx.concurrent.futures.AbstractResolvableFuture.Cancellation.CAUSELESS_CANCELLED
        L26:
            r5 = 0
            r4 = r7
        L28:
            androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper r6 = androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER
            boolean r6 = r6.casValue(r4, r0, r3)
            if (r6 == 0) goto L54
            complete(r4)
            boolean r4 = r0 instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture
            if (r4 == 0) goto L5d
            androidx.concurrent.futures.AbstractResolvableFuture$SetFuture r0 = (androidx.concurrent.futures.AbstractResolvableFuture.SetFuture) r0
            com.google.common.util.concurrent.ListenableFuture<? extends V> r0 = r0.future
            boolean r4 = r0 instanceof androidx.concurrent.futures.AbstractResolvableFuture
            if (r4 == 0) goto L50
            r4 = r0
            androidx.concurrent.futures.AbstractResolvableFuture r4 = (androidx.concurrent.futures.AbstractResolvableFuture) r4
            java.lang.Object r0 = r4.value
            if (r0 != 0) goto L48
            r5 = 1
            goto L49
        L48:
            r5 = 0
        L49:
            boolean r6 = r0 instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture
            r5 = r5 | r6
            if (r5 == 0) goto L5d
            r5 = 1
            goto L28
        L50:
            r0.cancel(r8)
            goto L5d
        L54:
            java.lang.Object r0 = r4.value
            boolean r6 = r0 instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture
            if (r6 != 0) goto L28
            r1 = r5
            goto L5d
        L5c:
            r1 = 0
        L5d:
            return r1
    }

    @Override // java.util.concurrent.Future
    public final V get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
            r6 = this;
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L61
            java.lang.Object r0 = r6.value
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Le
            r3 = 1
            goto Lf
        Le:
            r3 = 0
        Lf:
            boolean r4 = r0 instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture
            r4 = r4 ^ r2
            r3 = r3 & r4
            if (r3 == 0) goto L1a
            java.lang.Object r0 = r6.getDoneValue(r0)
            return r0
        L1a:
            androidx.concurrent.futures.AbstractResolvableFuture$Waiter r0 = r6.waiters
            androidx.concurrent.futures.AbstractResolvableFuture$Waiter r3 = androidx.concurrent.futures.AbstractResolvableFuture.Waiter.TOMBSTONE
            if (r0 == r3) goto L5a
            androidx.concurrent.futures.AbstractResolvableFuture$Waiter r3 = new androidx.concurrent.futures.AbstractResolvableFuture$Waiter
            r3.<init>()
        L25:
            androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper r4 = androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER
            r4.putNext(r3, r0)
            boolean r0 = r4.casWaiters(r6, r0, r3)
            if (r0 == 0) goto L54
        L30:
            java.util.concurrent.locks.LockSupport.park(r6)
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L4b
            java.lang.Object r0 = r6.value
            if (r0 == 0) goto L3f
            r4 = 1
            goto L40
        L3f:
            r4 = 0
        L40:
            boolean r5 = r0 instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture
            r5 = r5 ^ r2
            r4 = r4 & r5
            if (r4 == 0) goto L30
            java.lang.Object r0 = r6.getDoneValue(r0)
            return r0
        L4b:
            r6.removeWaiter(r3)
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L54:
            androidx.concurrent.futures.AbstractResolvableFuture$Waiter r0 = r6.waiters
            androidx.concurrent.futures.AbstractResolvableFuture$Waiter r4 = androidx.concurrent.futures.AbstractResolvableFuture.Waiter.TOMBSTONE
            if (r0 != r4) goto L25
        L5a:
            java.lang.Object r0 = r6.value
            java.lang.Object r0 = r6.getDoneValue(r0)
            return r0
        L61:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
    }

    @Override // java.util.concurrent.Future
    public final V get(long r13, java.util.concurrent.TimeUnit r15) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException, java.util.concurrent.ExecutionException {
            r12 = this;
            long r0 = r15.toNanos(r13)
            boolean r2 = java.lang.Thread.interrupted()
            if (r2 != 0) goto L160
            java.lang.Object r2 = r12.value
            if (r2 == 0) goto L10
            r3 = 1
            goto L11
        L10:
            r3 = 0
        L11:
            boolean r4 = r2 instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture
            r4 = r4 ^ 1
            r3 = r3 & r4
            if (r3 == 0) goto L1d
            java.lang.Object r13 = r12.getDoneValue(r2)
            return r13
        L1d:
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L29
            long r4 = java.lang.System.nanoTime()
            long r4 = r4 + r0
            goto L2a
        L29:
            r4 = r2
        L2a:
            r6 = 1000(0x3e8, double:4.94E-321)
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 < 0) goto L86
            androidx.concurrent.futures.AbstractResolvableFuture$Waiter r8 = r12.waiters
            androidx.concurrent.futures.AbstractResolvableFuture$Waiter r9 = androidx.concurrent.futures.AbstractResolvableFuture.Waiter.TOMBSTONE
            if (r8 == r9) goto L7f
            androidx.concurrent.futures.AbstractResolvableFuture$Waiter r9 = new androidx.concurrent.futures.AbstractResolvableFuture$Waiter
            r9.<init>()
        L3b:
            androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper r10 = androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER
            r10.putNext(r9, r8)
            boolean r8 = r10.casWaiters(r12, r8, r9)
            if (r8 == 0) goto L79
        L46:
            java.util.concurrent.locks.LockSupport.parkNanos(r12, r0)
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L70
            java.lang.Object r0 = r12.value
            if (r0 == 0) goto L55
            r1 = 1
            goto L56
        L55:
            r1 = 0
        L56:
            boolean r8 = r0 instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture
            r8 = r8 ^ 1
            r1 = r1 & r8
            if (r1 == 0) goto L62
            java.lang.Object r13 = r12.getDoneValue(r0)
            return r13
        L62:
            long r0 = java.lang.System.nanoTime()
            long r0 = r4 - r0
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 >= 0) goto L46
            r12.removeWaiter(r9)
            goto L86
        L70:
            r12.removeWaiter(r9)
            java.lang.InterruptedException r13 = new java.lang.InterruptedException
            r13.<init>()
            throw r13
        L79:
            androidx.concurrent.futures.AbstractResolvableFuture$Waiter r8 = r12.waiters
            androidx.concurrent.futures.AbstractResolvableFuture$Waiter r10 = androidx.concurrent.futures.AbstractResolvableFuture.Waiter.TOMBSTONE
            if (r8 != r10) goto L3b
        L7f:
            java.lang.Object r13 = r12.value
            java.lang.Object r13 = r12.getDoneValue(r13)
            return r13
        L86:
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 <= 0) goto Lb0
            java.lang.Object r0 = r12.value
            if (r0 == 0) goto L90
            r1 = 1
            goto L91
        L90:
            r1 = 0
        L91:
            boolean r8 = r0 instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture
            r8 = r8 ^ 1
            r1 = r1 & r8
            if (r1 == 0) goto L9d
            java.lang.Object r13 = r12.getDoneValue(r0)
            return r13
        L9d:
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto Laa
            long r0 = java.lang.System.nanoTime()
            long r0 = r4 - r0
            goto L86
        Laa:
            java.lang.InterruptedException r13 = new java.lang.InterruptedException
            r13.<init>()
            throw r13
        Lb0:
            java.lang.String r4 = r12.toString()
            java.lang.String r5 = r15.toString()
            java.util.Locale r8 = java.util.Locale.ROOT
            java.lang.String r5 = r5.toLowerCase(r8)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Waited "
            r9.append(r10)
            r9.append(r13)
            java.lang.String r13 = " "
            r9.append(r13)
            java.lang.String r14 = r15.toString()
            java.lang.String r14 = r14.toLowerCase(r8)
            r9.append(r14)
            java.lang.String r14 = r9.toString()
            long r8 = r0 + r6
            int r10 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r10 >= 0) goto L142
            java.lang.String r8 = " (plus "
            java.lang.String r14 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r14, r8)
            long r0 = -r0
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r8 = r15.convert(r0, r8)
            long r10 = r15.toNanos(r8)
            long r0 = r0 - r10
            int r15 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r15 == 0) goto L102
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 <= 0) goto L100
            goto L102
        L100:
            r2 = 0
            goto L103
        L102:
            r2 = 1
        L103:
            if (r15 <= 0) goto L126
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r14)
            r15.append(r8)
            r15.append(r13)
            r15.append(r5)
            java.lang.String r14 = r15.toString()
            if (r2 == 0) goto L122
            java.lang.String r15 = ","
            java.lang.String r14 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r14, r15)
        L122:
            java.lang.String r14 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r14, r13)
        L126:
            if (r2 == 0) goto L13c
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r14)
            r13.append(r0)
            java.lang.String r14 = " nanoseconds "
            r13.append(r14)
            java.lang.String r14 = r13.toString()
        L13c:
            java.lang.String r13 = "delay)"
            java.lang.String r14 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r14, r13)
        L142:
            boolean r13 = r12.isDone()
            if (r13 == 0) goto L154
            java.util.concurrent.TimeoutException r13 = new java.util.concurrent.TimeoutException
            java.lang.String r15 = " but future completed as timeout expired"
            java.lang.String r14 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r14, r15)
            r13.<init>(r14)
            throw r13
        L154:
            java.util.concurrent.TimeoutException r13 = new java.util.concurrent.TimeoutException
            java.lang.String r15 = " for "
            java.lang.String r14 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r14, r15, r4)
            r13.<init>(r14)
            throw r13
        L160:
            java.lang.InterruptedException r13 = new java.lang.InterruptedException
            r13.<init>()
            throw r13
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
            r1 = this;
            java.lang.Object r0 = r1.value
            boolean r0 = r0 instanceof androidx.concurrent.futures.AbstractResolvableFuture.Cancellation
            return r0
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
            r3 = this;
            java.lang.Object r0 = r3.value
            r1 = 1
            if (r0 == 0) goto L7
            r2 = 1
            goto L8
        L7:
            r2 = 0
        L8:
            boolean r0 = r0 instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture
            r0 = r0 ^ r1
            r0 = r0 & r2
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.String pendingToString() {
            r3 = this;
            java.lang.Object r0 = r3.value
            boolean r1 = r0 instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture
            if (r1 == 0) goto L1c
            java.lang.String r1 = "setFuture=["
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            androidx.concurrent.futures.AbstractResolvableFuture$SetFuture r0 = (androidx.concurrent.futures.AbstractResolvableFuture.SetFuture) r0
            com.google.common.util.concurrent.ListenableFuture<? extends V> r0 = r0.future
            java.lang.String r0 = r3.userObjectToString(r0)
            java.lang.String r2 = "]"
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r0, r2)
            return r0
        L1c:
            boolean r0 = r3 instanceof java.util.concurrent.ScheduledFuture
            if (r0 == 0) goto L3d
            java.lang.String r0 = "remaining delay=["
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            r1 = r3
            java.util.concurrent.ScheduledFuture r1 = (java.util.concurrent.ScheduledFuture) r1
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = r1.getDelay(r2)
            r0.append(r1)
            java.lang.String r1 = " ms]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L3d:
            r0 = 0
            return r0
    }

    public boolean set(@androidx.annotation.Nullable V r3) {
            r2 = this;
            if (r3 != 0) goto L4
            java.lang.Object r3 = androidx.concurrent.futures.AbstractResolvableFuture.NULL
        L4:
            androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper r0 = androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER
            r1 = 0
            boolean r3 = r0.casValue(r2, r1, r3)
            if (r3 == 0) goto L12
            complete(r2)
            r3 = 1
            return r3
        L12:
            r3 = 0
            return r3
    }

    public boolean setException(java.lang.Throwable r3) {
            r2 = this;
            androidx.concurrent.futures.AbstractResolvableFuture$Failure r0 = new androidx.concurrent.futures.AbstractResolvableFuture$Failure
            java.util.Objects.requireNonNull(r3)
            r0.<init>(r3)
            androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper r3 = androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER
            r1 = 0
            boolean r3 = r3.casValue(r2, r1, r0)
            if (r3 == 0) goto L16
            complete(r2)
            r3 = 1
            return r3
        L16:
            r3 = 0
            return r3
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = "[status="
            r0.append(r1)
            boolean r1 = r4.isCancelled()
            java.lang.String r2 = "]"
            if (r1 == 0) goto L1f
            java.lang.String r1 = "CANCELLED"
            r0.append(r1)
            goto L63
        L1f:
            boolean r1 = r4.isDone()
            if (r1 == 0) goto L29
            r4.addDoneString(r0)
            goto L63
        L29:
            java.lang.String r1 = r4.pendingToString()     // Catch: java.lang.RuntimeException -> L2e
            goto L40
        L2e:
            r1 = move-exception
            java.lang.String r3 = "Exception thrown from implementation: "
            java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
            java.lang.Class r1 = r1.getClass()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
        L40:
            if (r1 == 0) goto L54
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L54
            java.lang.String r3 = "PENDING, info=["
            r0.append(r3)
            r0.append(r1)
            r0.append(r2)
            goto L63
        L54:
            boolean r1 = r4.isDone()
            if (r1 == 0) goto L5e
            r4.addDoneString(r0)
            goto L63
        L5e:
            java.lang.String r1 = "PENDING"
            r0.append(r1)
        L63:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
