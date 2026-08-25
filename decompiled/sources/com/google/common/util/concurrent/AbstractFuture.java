package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtCompatible(emulated = true)
@com.google.j2objc.annotations.ReflectionSupport(com.google.j2objc.annotations.ReflectionSupport.Level.FULL)
public abstract class AbstractFuture<V> extends com.google.common.util.concurrent.internal.InternalFutureFailureAccess implements com.google.common.util.concurrent.ListenableFuture<V> {
    private static final com.google.common.util.concurrent.AbstractFuture.AtomicHelper ATOMIC_HELPER = null;
    private static final boolean GENERATE_CANCELLATION_CAUSES = false;
    private static final java.lang.Object NULL = null;
    private static final long SPIN_THRESHOLD_NANOS = 1000;
    private static final java.util.logging.Logger log = null;

    @javax.annotation.CheckForNull
    private volatile com.google.common.util.concurrent.AbstractFuture.Listener listeners;

    @javax.annotation.CheckForNull
    private volatile java.lang.Object value;

    @javax.annotation.CheckForNull
    private volatile com.google.common.util.concurrent.AbstractFuture.Waiter waiters;

    /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractFuture$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class AtomicHelper {
        private AtomicHelper() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ AtomicHelper(com.google.common.util.concurrent.AbstractFuture.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract boolean casListeners(com.google.common.util.concurrent.AbstractFuture<?> r1, @javax.annotation.CheckForNull com.google.common.util.concurrent.AbstractFuture.Listener r2, com.google.common.util.concurrent.AbstractFuture.Listener r3);

        public abstract boolean casValue(com.google.common.util.concurrent.AbstractFuture<?> r1, @javax.annotation.CheckForNull java.lang.Object r2, java.lang.Object r3);

        public abstract boolean casWaiters(com.google.common.util.concurrent.AbstractFuture<?> r1, @javax.annotation.CheckForNull com.google.common.util.concurrent.AbstractFuture.Waiter r2, @javax.annotation.CheckForNull com.google.common.util.concurrent.AbstractFuture.Waiter r3);

        public abstract void putNext(com.google.common.util.concurrent.AbstractFuture.Waiter r1, @javax.annotation.CheckForNull com.google.common.util.concurrent.AbstractFuture.Waiter r2);

        public abstract void putThread(com.google.common.util.concurrent.AbstractFuture.Waiter r1, java.lang.Thread r2);
    }

    public static final class Cancellation {

        @javax.annotation.CheckForNull
        public static final com.google.common.util.concurrent.AbstractFuture.Cancellation CAUSELESS_CANCELLED = null;

        @javax.annotation.CheckForNull
        public static final com.google.common.util.concurrent.AbstractFuture.Cancellation CAUSELESS_INTERRUPTED = null;

        @javax.annotation.CheckForNull
        public final java.lang.Throwable cause;
        public final boolean wasInterrupted;

        static {
                boolean r0 = com.google.common.util.concurrent.AbstractFuture.access$300()
                r1 = 0
                if (r0 == 0) goto Lc
                com.google.common.util.concurrent.AbstractFuture.Cancellation.CAUSELESS_CANCELLED = r1
                com.google.common.util.concurrent.AbstractFuture.Cancellation.CAUSELESS_INTERRUPTED = r1
                goto L1c
            Lc:
                com.google.common.util.concurrent.AbstractFuture$Cancellation r0 = new com.google.common.util.concurrent.AbstractFuture$Cancellation
                r2 = 0
                r0.<init>(r2, r1)
                com.google.common.util.concurrent.AbstractFuture.Cancellation.CAUSELESS_CANCELLED = r0
                com.google.common.util.concurrent.AbstractFuture$Cancellation r0 = new com.google.common.util.concurrent.AbstractFuture$Cancellation
                r2 = 1
                r0.<init>(r2, r1)
                com.google.common.util.concurrent.AbstractFuture.Cancellation.CAUSELESS_INTERRUPTED = r0
            L1c:
                return
        }

        public Cancellation(boolean r1, @javax.annotation.CheckForNull java.lang.Throwable r2) {
                r0 = this;
                r0.<init>()
                r0.wasInterrupted = r1
                r0.cause = r2
                return
        }
    }

    public static final class Failure {
        public static final com.google.common.util.concurrent.AbstractFuture.Failure FALLBACK_INSTANCE = null;
        public final java.lang.Throwable exception;


        static {
                com.google.common.util.concurrent.AbstractFuture$Failure r0 = new com.google.common.util.concurrent.AbstractFuture$Failure
                com.google.common.util.concurrent.AbstractFuture$Failure$1 r1 = new com.google.common.util.concurrent.AbstractFuture$Failure$1
                r1.<init>()
                r0.<init>(r1)
                com.google.common.util.concurrent.AbstractFuture.Failure.FALLBACK_INSTANCE = r0
                return
        }

        public Failure(java.lang.Throwable r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.exception = r1
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class Listener {
        public static final com.google.common.util.concurrent.AbstractFuture.Listener TOMBSTONE = null;

        @javax.annotation.CheckForNull
        public final java.util.concurrent.Executor executor;

        @javax.annotation.CheckForNull
        public com.google.common.util.concurrent.AbstractFuture.Listener next;

        @javax.annotation.CheckForNull
        public final java.lang.Runnable task;

        static {
                com.google.common.util.concurrent.AbstractFuture$Listener r0 = new com.google.common.util.concurrent.AbstractFuture$Listener
                r0.<init>()
                com.google.common.util.concurrent.AbstractFuture.Listener.TOMBSTONE = r0
                return
        }

        public Listener() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.task = r0
                r1.executor = r0
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

    /* JADX INFO: loaded from: classes2.dex */
    public static final class SafeAtomicHelper extends com.google.common.util.concurrent.AbstractFuture.AtomicHelper {
        public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.common.util.concurrent.AbstractFuture, com.google.common.util.concurrent.AbstractFuture.Listener> listenersUpdater;
        public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.common.util.concurrent.AbstractFuture, java.lang.Object> valueUpdater;
        public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.common.util.concurrent.AbstractFuture.Waiter, com.google.common.util.concurrent.AbstractFuture.Waiter> waiterNextUpdater;
        public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.common.util.concurrent.AbstractFuture.Waiter, java.lang.Thread> waiterThreadUpdater;
        public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.common.util.concurrent.AbstractFuture, com.google.common.util.concurrent.AbstractFuture.Waiter> waitersUpdater;

        public SafeAtomicHelper(java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.common.util.concurrent.AbstractFuture.Waiter, java.lang.Thread> r2, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.common.util.concurrent.AbstractFuture.Waiter, com.google.common.util.concurrent.AbstractFuture.Waiter> r3, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.common.util.concurrent.AbstractFuture, com.google.common.util.concurrent.AbstractFuture.Waiter> r4, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.common.util.concurrent.AbstractFuture, com.google.common.util.concurrent.AbstractFuture.Listener> r5, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.common.util.concurrent.AbstractFuture, java.lang.Object> r6) {
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

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final boolean casListeners(com.google.common.util.concurrent.AbstractFuture<?> r3, @javax.annotation.CheckForNull com.google.common.util.concurrent.AbstractFuture.Listener r4, com.google.common.util.concurrent.AbstractFuture.Listener r5) {
                r2 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.common.util.concurrent.AbstractFuture, com.google.common.util.concurrent.AbstractFuture$Listener> r0 = r2.listenersUpdater
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

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final boolean casValue(com.google.common.util.concurrent.AbstractFuture<?> r3, @javax.annotation.CheckForNull java.lang.Object r4, java.lang.Object r5) {
                r2 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.common.util.concurrent.AbstractFuture, java.lang.Object> r0 = r2.valueUpdater
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

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final boolean casWaiters(com.google.common.util.concurrent.AbstractFuture<?> r3, @javax.annotation.CheckForNull com.google.common.util.concurrent.AbstractFuture.Waiter r4, @javax.annotation.CheckForNull com.google.common.util.concurrent.AbstractFuture.Waiter r5) {
                r2 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.common.util.concurrent.AbstractFuture, com.google.common.util.concurrent.AbstractFuture$Waiter> r0 = r2.waitersUpdater
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

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final void putNext(com.google.common.util.concurrent.AbstractFuture.Waiter r2, @javax.annotation.CheckForNull com.google.common.util.concurrent.AbstractFuture.Waiter r3) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.common.util.concurrent.AbstractFuture$Waiter, com.google.common.util.concurrent.AbstractFuture$Waiter> r0 = r1.waiterNextUpdater
                r0.lazySet(r2, r3)
                return
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final void putThread(com.google.common.util.concurrent.AbstractFuture.Waiter r2, java.lang.Thread r3) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.common.util.concurrent.AbstractFuture$Waiter, java.lang.Thread> r0 = r1.waiterThreadUpdater
                r0.lazySet(r2, r3)
                return
        }
    }

    public static final class SetFuture<V> implements java.lang.Runnable {
        public final com.google.common.util.concurrent.ListenableFuture<? extends V> future;
        public final com.google.common.util.concurrent.AbstractFuture<V> owner;

        public SetFuture(com.google.common.util.concurrent.AbstractFuture<V> r1, com.google.common.util.concurrent.ListenableFuture<? extends V> r2) {
                r0 = this;
                r0.<init>()
                r0.owner = r1
                r0.future = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                com.google.common.util.concurrent.AbstractFuture<V> r0 = r3.owner
                java.lang.Object r0 = com.google.common.util.concurrent.AbstractFuture.access$400(r0)
                if (r0 == r3) goto L9
                return
            L9:
                com.google.common.util.concurrent.ListenableFuture<? extends V> r0 = r3.future
                java.lang.Object r0 = com.google.common.util.concurrent.AbstractFuture.access$500(r0)
                com.google.common.util.concurrent.AbstractFuture$AtomicHelper r1 = com.google.common.util.concurrent.AbstractFuture.access$200()
                com.google.common.util.concurrent.AbstractFuture<V> r2 = r3.owner
                boolean r0 = r1.casValue(r2, r3, r0)
                if (r0 == 0) goto L20
                com.google.common.util.concurrent.AbstractFuture<V> r0 = r3.owner
                com.google.common.util.concurrent.AbstractFuture.access$600(r0)
            L20:
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class SynchronizedHelper extends com.google.common.util.concurrent.AbstractFuture.AtomicHelper {
        private SynchronizedHelper() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        public /* synthetic */ SynchronizedHelper(com.google.common.util.concurrent.AbstractFuture.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final boolean casListeners(com.google.common.util.concurrent.AbstractFuture<?> r2, @javax.annotation.CheckForNull com.google.common.util.concurrent.AbstractFuture.Listener r3, com.google.common.util.concurrent.AbstractFuture.Listener r4) {
                r1 = this;
                monitor-enter(r2)
                com.google.common.util.concurrent.AbstractFuture$Listener r0 = com.google.common.util.concurrent.AbstractFuture.access$900(r2)     // Catch: java.lang.Throwable -> L10
                if (r0 != r3) goto Ld
                com.google.common.util.concurrent.AbstractFuture.access$902(r2, r4)     // Catch: java.lang.Throwable -> L10
                r3 = 1
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L10
                return r3
            Ld:
                r3 = 0
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L10
                return r3
            L10:
                r3 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L10
                throw r3
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final boolean casValue(com.google.common.util.concurrent.AbstractFuture<?> r2, @javax.annotation.CheckForNull java.lang.Object r3, java.lang.Object r4) {
                r1 = this;
                monitor-enter(r2)
                java.lang.Object r0 = com.google.common.util.concurrent.AbstractFuture.access$400(r2)     // Catch: java.lang.Throwable -> L10
                if (r0 != r3) goto Ld
                com.google.common.util.concurrent.AbstractFuture.access$402(r2, r4)     // Catch: java.lang.Throwable -> L10
                r3 = 1
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L10
                return r3
            Ld:
                r3 = 0
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L10
                return r3
            L10:
                r3 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L10
                throw r3
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final boolean casWaiters(com.google.common.util.concurrent.AbstractFuture<?> r2, @javax.annotation.CheckForNull com.google.common.util.concurrent.AbstractFuture.Waiter r3, @javax.annotation.CheckForNull com.google.common.util.concurrent.AbstractFuture.Waiter r4) {
                r1 = this;
                monitor-enter(r2)
                com.google.common.util.concurrent.AbstractFuture$Waiter r0 = com.google.common.util.concurrent.AbstractFuture.access$800(r2)     // Catch: java.lang.Throwable -> L10
                if (r0 != r3) goto Ld
                com.google.common.util.concurrent.AbstractFuture.access$802(r2, r4)     // Catch: java.lang.Throwable -> L10
                r3 = 1
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L10
                return r3
            Ld:
                r3 = 0
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L10
                return r3
            L10:
                r3 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L10
                throw r3
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final void putNext(com.google.common.util.concurrent.AbstractFuture.Waiter r1, @javax.annotation.CheckForNull com.google.common.util.concurrent.AbstractFuture.Waiter r2) {
                r0 = this;
                r1.next = r2
                return
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final void putThread(com.google.common.util.concurrent.AbstractFuture.Waiter r1, java.lang.Thread r2) {
                r0 = this;
                r1.thread = r2
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface Trusted<V> extends com.google.common.util.concurrent.ListenableFuture<V> {
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static abstract class TrustedFuture<V> extends com.google.common.util.concurrent.AbstractFuture<V> implements com.google.common.util.concurrent.AbstractFuture.Trusted<V> {
        public TrustedFuture() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, com.google.common.util.concurrent.ListenableFuture
        public void addListener(java.lang.Runnable r1, java.util.concurrent.Executor r2) {
                r0 = this;
                super.addListener(r1, r2)
                return
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public boolean cancel(boolean r1) {
                r0 = this;
                boolean r1 = super.cancel(r1)
                return r1
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @com.google.common.util.concurrent.ParametricNullness
        public V get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
                r1 = this;
                java.lang.Object r0 = super.get()
                return r0
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @com.google.common.util.concurrent.ParametricNullness
        public final V get(long r1, java.util.concurrent.TimeUnit r3) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
                r0 = this;
                java.lang.Object r1 = super.get(r1, r3)
                return r1
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public boolean isCancelled() {
                r1 = this;
                boolean r0 = super.isCancelled()
                return r0
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean isDone() {
                r1 = this;
                boolean r0 = super.isDone()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class UnsafeAtomicHelper extends com.google.common.util.concurrent.AbstractFuture.AtomicHelper {
        public static final long LISTENERS_OFFSET = 0;
        public static final sun.misc.Unsafe UNSAFE = null;
        public static final long VALUE_OFFSET = 0;
        public static final long WAITERS_OFFSET = 0;
        public static final long WAITER_NEXT_OFFSET = 0;
        public static final long WAITER_THREAD_OFFSET = 0;


        static {
                java.lang.Class<com.google.common.util.concurrent.AbstractFuture$Waiter> r0 = com.google.common.util.concurrent.AbstractFuture.Waiter.class
                sun.misc.Unsafe r1 = sun.misc.Unsafe.getUnsafe()     // Catch: java.lang.SecurityException -> L7
                goto L12
            L7:
                com.google.common.util.concurrent.AbstractFuture$UnsafeAtomicHelper$1 r1 = new com.google.common.util.concurrent.AbstractFuture$UnsafeAtomicHelper$1     // Catch: java.security.PrivilegedActionException -> L5d
                r1.<init>()     // Catch: java.security.PrivilegedActionException -> L5d
                java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)     // Catch: java.security.PrivilegedActionException -> L5d
                sun.misc.Unsafe r1 = (sun.misc.Unsafe) r1     // Catch: java.security.PrivilegedActionException -> L5d
            L12:
                java.lang.Class<com.google.common.util.concurrent.AbstractFuture> r2 = com.google.common.util.concurrent.AbstractFuture.class
                java.lang.String r3 = "waiters"
                java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch: java.lang.Exception -> L53
                long r3 = r1.objectFieldOffset(r3)     // Catch: java.lang.Exception -> L53
                com.google.common.util.concurrent.AbstractFuture.UnsafeAtomicHelper.WAITERS_OFFSET = r3     // Catch: java.lang.Exception -> L53
                java.lang.String r3 = "listeners"
                java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch: java.lang.Exception -> L53
                long r3 = r1.objectFieldOffset(r3)     // Catch: java.lang.Exception -> L53
                com.google.common.util.concurrent.AbstractFuture.UnsafeAtomicHelper.LISTENERS_OFFSET = r3     // Catch: java.lang.Exception -> L53
                java.lang.String r3 = "value"
                java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.Exception -> L53
                long r2 = r1.objectFieldOffset(r2)     // Catch: java.lang.Exception -> L53
                com.google.common.util.concurrent.AbstractFuture.UnsafeAtomicHelper.VALUE_OFFSET = r2     // Catch: java.lang.Exception -> L53
                java.lang.String r2 = "thread"
                java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch: java.lang.Exception -> L53
                long r2 = r1.objectFieldOffset(r2)     // Catch: java.lang.Exception -> L53
                com.google.common.util.concurrent.AbstractFuture.UnsafeAtomicHelper.WAITER_THREAD_OFFSET = r2     // Catch: java.lang.Exception -> L53
                java.lang.String r2 = "next"
                java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch: java.lang.Exception -> L53
                long r2 = r1.objectFieldOffset(r0)     // Catch: java.lang.Exception -> L53
                com.google.common.util.concurrent.AbstractFuture.UnsafeAtomicHelper.WAITER_NEXT_OFFSET = r2     // Catch: java.lang.Exception -> L53
                com.google.common.util.concurrent.AbstractFuture.UnsafeAtomicHelper.UNSAFE = r1     // Catch: java.lang.Exception -> L53
                return
            L53:
                r0 = move-exception
                com.google.common.base.Throwables.throwIfUnchecked(r0)
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r0)
                throw r1
            L5d:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.Throwable r0 = r0.getCause()
                java.lang.String r2 = "Could not initialize intrinsics"
                r1.<init>(r2, r0)
                throw r1
        }

        private UnsafeAtomicHelper() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        public /* synthetic */ UnsafeAtomicHelper(com.google.common.util.concurrent.AbstractFuture.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final boolean casListeners(com.google.common.util.concurrent.AbstractFuture<?> r7, @javax.annotation.CheckForNull com.google.common.util.concurrent.AbstractFuture.Listener r8, com.google.common.util.concurrent.AbstractFuture.Listener r9) {
                r6 = this;
                sun.misc.Unsafe r0 = com.google.common.util.concurrent.AbstractFuture.UnsafeAtomicHelper.UNSAFE
                long r2 = com.google.common.util.concurrent.AbstractFuture.UnsafeAtomicHelper.LISTENERS_OFFSET
                r1 = r7
                r4 = r8
                r5 = r9
                boolean r7 = com.google.common.util.concurrent.AbstractFuture$UnsafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r1, r2, r4, r5)
                return r7
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final boolean casValue(com.google.common.util.concurrent.AbstractFuture<?> r7, @javax.annotation.CheckForNull java.lang.Object r8, java.lang.Object r9) {
                r6 = this;
                sun.misc.Unsafe r0 = com.google.common.util.concurrent.AbstractFuture.UnsafeAtomicHelper.UNSAFE
                long r2 = com.google.common.util.concurrent.AbstractFuture.UnsafeAtomicHelper.VALUE_OFFSET
                r1 = r7
                r4 = r8
                r5 = r9
                boolean r7 = com.google.common.util.concurrent.AbstractFuture$UnsafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r1, r2, r4, r5)
                return r7
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final boolean casWaiters(com.google.common.util.concurrent.AbstractFuture<?> r7, @javax.annotation.CheckForNull com.google.common.util.concurrent.AbstractFuture.Waiter r8, @javax.annotation.CheckForNull com.google.common.util.concurrent.AbstractFuture.Waiter r9) {
                r6 = this;
                sun.misc.Unsafe r0 = com.google.common.util.concurrent.AbstractFuture.UnsafeAtomicHelper.UNSAFE
                long r2 = com.google.common.util.concurrent.AbstractFuture.UnsafeAtomicHelper.WAITERS_OFFSET
                r1 = r7
                r4 = r8
                r5 = r9
                boolean r7 = com.google.common.util.concurrent.AbstractFuture$UnsafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r1, r2, r4, r5)
                return r7
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final void putNext(com.google.common.util.concurrent.AbstractFuture.Waiter r4, @javax.annotation.CheckForNull com.google.common.util.concurrent.AbstractFuture.Waiter r5) {
                r3 = this;
                sun.misc.Unsafe r0 = com.google.common.util.concurrent.AbstractFuture.UnsafeAtomicHelper.UNSAFE
                long r1 = com.google.common.util.concurrent.AbstractFuture.UnsafeAtomicHelper.WAITER_NEXT_OFFSET
                r0.putObject(r4, r1, r5)
                return
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final void putThread(com.google.common.util.concurrent.AbstractFuture.Waiter r4, java.lang.Thread r5) {
                r3 = this;
                sun.misc.Unsafe r0 = com.google.common.util.concurrent.AbstractFuture.UnsafeAtomicHelper.UNSAFE
                long r1 = com.google.common.util.concurrent.AbstractFuture.UnsafeAtomicHelper.WAITER_THREAD_OFFSET
                r0.putObject(r4, r1, r5)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class Waiter {
        public static final com.google.common.util.concurrent.AbstractFuture.Waiter TOMBSTONE = null;

        @javax.annotation.CheckForNull
        public volatile com.google.common.util.concurrent.AbstractFuture.Waiter next;

        @javax.annotation.CheckForNull
        public volatile java.lang.Thread thread;

        static {
                com.google.common.util.concurrent.AbstractFuture$Waiter r0 = new com.google.common.util.concurrent.AbstractFuture$Waiter
                r1 = 0
                r0.<init>(r1)
                com.google.common.util.concurrent.AbstractFuture.Waiter.TOMBSTONE = r0
                return
        }

        public Waiter() {
                r2 = this;
                r2.<init>()
                com.google.common.util.concurrent.AbstractFuture$AtomicHelper r0 = com.google.common.util.concurrent.AbstractFuture.access$200()
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
            java.lang.Class<com.google.common.util.concurrent.AbstractFuture$Waiter> r0 = com.google.common.util.concurrent.AbstractFuture.Waiter.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)     // Catch: java.lang.SecurityException -> Lf
            boolean r1 = java.lang.Boolean.parseBoolean(r1)     // Catch: java.lang.SecurityException -> Lf
            goto L10
        Lf:
            r1 = 0
        L10:
            com.google.common.util.concurrent.AbstractFuture.GENERATE_CANCELLATION_CAUSES = r1
            java.lang.Class<com.google.common.util.concurrent.AbstractFuture> r1 = com.google.common.util.concurrent.AbstractFuture.class
            java.lang.String r1 = r1.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            com.google.common.util.concurrent.AbstractFuture.log = r1
            r1 = 0
            com.google.common.util.concurrent.AbstractFuture$UnsafeAtomicHelper r2 = new com.google.common.util.concurrent.AbstractFuture$UnsafeAtomicHelper     // Catch: java.lang.Throwable -> L27
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L27
            r3 = r2
            r2 = r1
            goto L64
        L27:
            r2 = move-exception
            com.google.common.util.concurrent.AbstractFuture$SafeAtomicHelper r9 = new com.google.common.util.concurrent.AbstractFuture$SafeAtomicHelper     // Catch: java.lang.Throwable -> L5d
            java.lang.Class<java.lang.Thread> r3 = java.lang.Thread.class
            java.lang.String r4 = "thread"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r3, r4)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r3 = "next"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r3)     // Catch: java.lang.Throwable -> L5d
            java.lang.Class<com.google.common.util.concurrent.AbstractFuture> r3 = com.google.common.util.concurrent.AbstractFuture.class
            java.lang.String r6 = "waiters"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r0, r6)     // Catch: java.lang.Throwable -> L5d
            java.lang.Class<com.google.common.util.concurrent.AbstractFuture> r0 = com.google.common.util.concurrent.AbstractFuture.class
            java.lang.Class<com.google.common.util.concurrent.AbstractFuture$Listener> r3 = com.google.common.util.concurrent.AbstractFuture.Listener.class
            java.lang.String r7 = "listeners"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r3, r7)     // Catch: java.lang.Throwable -> L5d
            java.lang.Class<com.google.common.util.concurrent.AbstractFuture> r0 = com.google.common.util.concurrent.AbstractFuture.class
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            java.lang.String r8 = "value"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r3, r8)     // Catch: java.lang.Throwable -> L5d
            r3 = r9
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L5d
            r3 = r9
            goto L64
        L5d:
            r0 = move-exception
            com.google.common.util.concurrent.AbstractFuture$SynchronizedHelper r3 = new com.google.common.util.concurrent.AbstractFuture$SynchronizedHelper
            r3.<init>(r1)
            r1 = r0
        L64:
            com.google.common.util.concurrent.AbstractFuture.ATOMIC_HELPER = r3
            java.lang.Class<java.util.concurrent.locks.LockSupport> r0 = java.util.concurrent.locks.LockSupport.class
            if (r1 == 0) goto L78
            java.util.logging.Logger r0 = com.google.common.util.concurrent.AbstractFuture.log
            java.util.logging.Level r3 = java.util.logging.Level.SEVERE
            java.lang.String r4 = "UnsafeAtomicHelper is broken!"
            r0.log(r3, r4, r2)
            java.lang.String r2 = "SafeAtomicHelper is broken!"
            r0.log(r3, r2, r1)
        L78:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.common.util.concurrent.AbstractFuture.NULL = r0
            return
    }

    public AbstractFuture() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ com.google.common.util.concurrent.AbstractFuture.AtomicHelper access$200() {
            com.google.common.util.concurrent.AbstractFuture$AtomicHelper r0 = com.google.common.util.concurrent.AbstractFuture.ATOMIC_HELPER
            return r0
    }

    public static /* synthetic */ boolean access$300() {
            boolean r0 = com.google.common.util.concurrent.AbstractFuture.GENERATE_CANCELLATION_CAUSES
            return r0
    }

    public static /* synthetic */ java.lang.Object access$400(com.google.common.util.concurrent.AbstractFuture r0) {
            java.lang.Object r0 = r0.value
            return r0
    }

    public static /* synthetic */ java.lang.Object access$402(com.google.common.util.concurrent.AbstractFuture r0, java.lang.Object r1) {
            r0.value = r1
            return r1
    }

    public static /* synthetic */ java.lang.Object access$500(com.google.common.util.concurrent.ListenableFuture r0) {
            java.lang.Object r0 = getFutureValue(r0)
            return r0
    }

    public static /* synthetic */ void access$600(com.google.common.util.concurrent.AbstractFuture r0) {
            complete(r0)
            return
    }

    public static /* synthetic */ com.google.common.util.concurrent.AbstractFuture.Waiter access$800(com.google.common.util.concurrent.AbstractFuture r0) {
            com.google.common.util.concurrent.AbstractFuture$Waiter r0 = r0.waiters
            return r0
    }

    public static /* synthetic */ com.google.common.util.concurrent.AbstractFuture.Waiter access$802(com.google.common.util.concurrent.AbstractFuture r0, com.google.common.util.concurrent.AbstractFuture.Waiter r1) {
            r0.waiters = r1
            return r1
    }

    public static /* synthetic */ com.google.common.util.concurrent.AbstractFuture.Listener access$900(com.google.common.util.concurrent.AbstractFuture r0) {
            com.google.common.util.concurrent.AbstractFuture$Listener r0 = r0.listeners
            return r0
    }

    public static /* synthetic */ com.google.common.util.concurrent.AbstractFuture.Listener access$902(com.google.common.util.concurrent.AbstractFuture r0, com.google.common.util.concurrent.AbstractFuture.Listener r1) {
            r0.listeners = r1
            return r1
    }

    private void addDoneString(java.lang.StringBuilder r4) {
            r3 = this;
            java.lang.String r0 = "]"
            java.lang.Object r1 = getUninterruptibly(r3)     // Catch: java.lang.RuntimeException -> L12 java.util.concurrent.CancellationException -> L25 java.util.concurrent.ExecutionException -> L2b
            java.lang.String r2 = "SUCCESS, result=["
            r4.append(r2)     // Catch: java.lang.RuntimeException -> L12 java.util.concurrent.CancellationException -> L25 java.util.concurrent.ExecutionException -> L2b
            r3.appendResultObject(r4, r1)     // Catch: java.lang.RuntimeException -> L12 java.util.concurrent.CancellationException -> L25 java.util.concurrent.ExecutionException -> L2b
            r4.append(r0)     // Catch: java.lang.RuntimeException -> L12 java.util.concurrent.CancellationException -> L25 java.util.concurrent.ExecutionException -> L2b
            goto L3b
        L12:
            r0 = move-exception
            java.lang.String r1 = "UNKNOWN, cause=["
            r4.append(r1)
            java.lang.Class r0 = r0.getClass()
            r4.append(r0)
            java.lang.String r0 = " thrown from get()]"
            r4.append(r0)
            goto L3b
        L25:
            java.lang.String r0 = "CANCELLED"
            r4.append(r0)
            goto L3b
        L2b:
            r1 = move-exception
            java.lang.String r2 = "FAILURE, cause=["
            r4.append(r2)
            java.lang.Throwable r1 = r1.getCause()
            r4.append(r1)
            r4.append(r0)
        L3b:
            return
    }

    private void addPendingString(java.lang.StringBuilder r6) {
            r5 = this;
            int r0 = r6.length()
            java.lang.String r1 = "PENDING"
            r6.append(r1)
            java.lang.Object r1 = r5.value
            boolean r2 = r1 instanceof com.google.common.util.concurrent.AbstractFuture.SetFuture
            java.lang.String r3 = "]"
            if (r2 == 0) goto L21
            java.lang.String r2 = ", setFuture=["
            r6.append(r2)
            com.google.common.util.concurrent.AbstractFuture$SetFuture r1 = (com.google.common.util.concurrent.AbstractFuture.SetFuture) r1
            com.google.common.util.concurrent.ListenableFuture<? extends V> r1 = r1.future
            r5.appendUserObject(r6, r1)
            r6.append(r3)
            goto L4e
        L21:
            java.lang.String r1 = r5.pendingToString()     // Catch: java.lang.StackOverflowError -> L2a java.lang.RuntimeException -> L2c
            java.lang.String r1 = com.google.common.base.Strings.emptyToNull(r1)     // Catch: java.lang.StackOverflowError -> L2a java.lang.RuntimeException -> L2c
            goto L41
        L2a:
            r1 = move-exception
            goto L2d
        L2c:
            r1 = move-exception
        L2d:
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r1.length()
            int r2 = r2 + 38
            java.lang.String r4 = "Exception thrown from implementation: "
            java.lang.String r1 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r2, r4, r1)
        L41:
            if (r1 == 0) goto L4e
            java.lang.String r2 = ", info=["
            r6.append(r2)
            r6.append(r1)
            r6.append(r3)
        L4e:
            boolean r1 = r5.isDone()
            if (r1 == 0) goto L5e
            int r1 = r6.length()
            r6.delete(r0, r1)
            r5.addDoneString(r6)
        L5e:
            return
    }

    private void appendResultObject(java.lang.StringBuilder r2, @javax.annotation.CheckForNull java.lang.Object r3) {
            r1 = this;
            if (r3 != 0) goto L8
            java.lang.String r3 = "null"
            r2.append(r3)
            goto L2c
        L8:
            if (r3 != r1) goto L11
            java.lang.String r3 = "this future"
            r2.append(r3)
            goto L2c
        L11:
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            r2.append(r0)
            java.lang.String r0 = "@"
            r2.append(r0)
            int r3 = java.lang.System.identityHashCode(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
        L2c:
            return
    }

    private void appendUserObject(java.lang.StringBuilder r2, @javax.annotation.CheckForNull java.lang.Object r3) {
            r1 = this;
            if (r3 != r1) goto L9
            java.lang.String r3 = "this future"
            r2.append(r3)     // Catch: java.lang.StackOverflowError -> Ld java.lang.RuntimeException -> Lf
            goto L1c
        L9:
            r2.append(r3)     // Catch: java.lang.StackOverflowError -> Ld java.lang.RuntimeException -> Lf
            goto L1c
        Ld:
            r3 = move-exception
            goto L10
        Lf:
            r3 = move-exception
        L10:
            java.lang.String r0 = "Exception thrown from implementation: "
            r2.append(r0)
            java.lang.Class r3 = r3.getClass()
            r2.append(r3)
        L1c:
            return
    }

    private static java.util.concurrent.CancellationException cancellationExceptionWithCause(java.lang.String r1, @javax.annotation.CheckForNull java.lang.Throwable r2) {
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            r0.<init>(r1)
            r0.initCause(r2)
            return r0
    }

    @javax.annotation.CheckForNull
    private com.google.common.util.concurrent.AbstractFuture.Listener clearListeners(@javax.annotation.CheckForNull com.google.common.util.concurrent.AbstractFuture.Listener r5) {
            r4 = this;
        L0:
            com.google.common.util.concurrent.AbstractFuture$Listener r0 = r4.listeners
            com.google.common.util.concurrent.AbstractFuture$AtomicHelper r1 = com.google.common.util.concurrent.AbstractFuture.ATOMIC_HELPER
            com.google.common.util.concurrent.AbstractFuture$Listener r2 = com.google.common.util.concurrent.AbstractFuture.Listener.TOMBSTONE
            boolean r1 = r1.casListeners(r4, r0, r2)
            if (r1 == 0) goto L0
            r3 = r0
            r0 = r5
            r5 = r3
        Lf:
            if (r5 == 0) goto L18
            com.google.common.util.concurrent.AbstractFuture$Listener r1 = r5.next
            r5.next = r0
            r0 = r5
            r5 = r1
            goto Lf
        L18:
            return r0
    }

    private static void complete(com.google.common.util.concurrent.AbstractFuture<?> r4) {
            r0 = 0
        L1:
            r4.releaseWaiters()
            r4.afterDone()
            com.google.common.util.concurrent.AbstractFuture$Listener r4 = r4.clearListeners(r0)
        Lb:
            if (r4 == 0) goto L3d
            com.google.common.util.concurrent.AbstractFuture$Listener r0 = r4.next
            java.lang.Runnable r1 = r4.task
            java.util.Objects.requireNonNull(r1)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            boolean r2 = r1 instanceof com.google.common.util.concurrent.AbstractFuture.SetFuture
            if (r2 == 0) goto L31
            com.google.common.util.concurrent.AbstractFuture$SetFuture r1 = (com.google.common.util.concurrent.AbstractFuture.SetFuture) r1
            com.google.common.util.concurrent.AbstractFuture<V> r4 = r1.owner
            java.lang.Object r2 = r4.value
            if (r2 != r1) goto L3b
            com.google.common.util.concurrent.ListenableFuture<? extends V> r2 = r1.future
            java.lang.Object r2 = getFutureValue(r2)
            com.google.common.util.concurrent.AbstractFuture$AtomicHelper r3 = com.google.common.util.concurrent.AbstractFuture.ATOMIC_HELPER
            boolean r1 = r3.casValue(r4, r1, r2)
            if (r1 == 0) goto L3b
            goto L1
        L31:
            java.util.concurrent.Executor r4 = r4.executor
            java.util.Objects.requireNonNull(r4)
            java.util.concurrent.Executor r4 = (java.util.concurrent.Executor) r4
            executeListener(r1, r4)
        L3b:
            r4 = r0
            goto Lb
        L3d:
            return
    }

    private static void executeListener(java.lang.Runnable r6, java.util.concurrent.Executor r7) {
            r7.execute(r6)     // Catch: java.lang.RuntimeException -> L4
            goto L27
        L4:
            r0 = move-exception
            java.util.logging.Logger r1 = com.google.common.util.concurrent.AbstractFuture.log
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            int r3 = r6.length()
            int r3 = r3 + 57
            int r4 = r7.length()
            int r4 = r4 + r3
            java.lang.String r3 = "RuntimeException while executing runnable "
            java.lang.String r5 = " with executor "
            java.lang.String r6 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r4, r3, r6, r5, r7)
            r1.log(r2, r6, r0)
        L27:
            return
    }

    @com.google.common.util.concurrent.ParametricNullness
    private V getDoneValue(java.lang.Object r2) throws java.util.concurrent.ExecutionException {
            r1 = this;
            boolean r0 = r2 instanceof com.google.common.util.concurrent.AbstractFuture.Cancellation
            if (r0 != 0) goto L18
            boolean r0 = r2 instanceof com.google.common.util.concurrent.AbstractFuture.Failure
            if (r0 != 0) goto Le
            java.lang.Object r0 = com.google.common.util.concurrent.AbstractFuture.NULL
            if (r2 != r0) goto Ld
            r2 = 0
        Ld:
            return r2
        Le:
            java.util.concurrent.ExecutionException r0 = new java.util.concurrent.ExecutionException
            com.google.common.util.concurrent.AbstractFuture$Failure r2 = (com.google.common.util.concurrent.AbstractFuture.Failure) r2
            java.lang.Throwable r2 = r2.exception
            r0.<init>(r2)
            throw r0
        L18:
            com.google.common.util.concurrent.AbstractFuture$Cancellation r2 = (com.google.common.util.concurrent.AbstractFuture.Cancellation) r2
            java.lang.Throwable r2 = r2.cause
            java.lang.String r0 = "Task was cancelled."
            java.util.concurrent.CancellationException r2 = cancellationExceptionWithCause(r0, r2)
            throw r2
    }

    private static java.lang.Object getFutureValue(com.google.common.util.concurrent.ListenableFuture<?> r8) {
            java.lang.String r0 = "get() did not throw CancellationException, despite reporting isCancelled() == true: "
            boolean r1 = r8 instanceof com.google.common.util.concurrent.AbstractFuture.Trusted
            r2 = 0
            if (r1 == 0) goto L28
            com.google.common.util.concurrent.AbstractFuture r8 = (com.google.common.util.concurrent.AbstractFuture) r8
            java.lang.Object r8 = r8.value
            boolean r0 = r8 instanceof com.google.common.util.concurrent.AbstractFuture.Cancellation
            if (r0 == 0) goto L24
            r0 = r8
            com.google.common.util.concurrent.AbstractFuture$Cancellation r0 = (com.google.common.util.concurrent.AbstractFuture.Cancellation) r0
            boolean r1 = r0.wasInterrupted
            if (r1 == 0) goto L24
            java.lang.Throwable r8 = r0.cause
            if (r8 == 0) goto L22
            com.google.common.util.concurrent.AbstractFuture$Cancellation r8 = new com.google.common.util.concurrent.AbstractFuture$Cancellation
            java.lang.Throwable r0 = r0.cause
            r8.<init>(r2, r0)
            goto L24
        L22:
            com.google.common.util.concurrent.AbstractFuture$Cancellation r8 = com.google.common.util.concurrent.AbstractFuture.Cancellation.CAUSELESS_CANCELLED
        L24:
            java.util.Objects.requireNonNull(r8)
            return r8
        L28:
            boolean r1 = r8 instanceof com.google.common.util.concurrent.internal.InternalFutureFailureAccess
            if (r1 == 0) goto L3b
            r1 = r8
            com.google.common.util.concurrent.internal.InternalFutureFailureAccess r1 = (com.google.common.util.concurrent.internal.InternalFutureFailureAccess) r1
            java.lang.Throwable r1 = com.google.common.util.concurrent.internal.InternalFutures.tryInternalFastPathGetFailure(r1)
            if (r1 == 0) goto L3b
            com.google.common.util.concurrent.AbstractFuture$Failure r8 = new com.google.common.util.concurrent.AbstractFuture$Failure
            r8.<init>(r1)
            return r8
        L3b:
            boolean r1 = r8.isCancelled()
            boolean r3 = com.google.common.util.concurrent.AbstractFuture.GENERATE_CANCELLATION_CAUSES
            r3 = r3 ^ 1
            r3 = r3 & r1
            if (r3 == 0) goto L4c
            com.google.common.util.concurrent.AbstractFuture$Cancellation r8 = com.google.common.util.concurrent.AbstractFuture.Cancellation.CAUSELESS_CANCELLED
            java.util.Objects.requireNonNull(r8)
            return r8
        L4c:
            java.lang.Object r3 = getUninterruptibly(r8)     // Catch: java.lang.Throwable -> L7b java.util.concurrent.CancellationException -> L82 java.util.concurrent.ExecutionException -> La6
            if (r1 == 0) goto L76
            com.google.common.util.concurrent.AbstractFuture$Cancellation r3 = new com.google.common.util.concurrent.AbstractFuture$Cancellation     // Catch: java.lang.Throwable -> L7b java.util.concurrent.CancellationException -> L82 java.util.concurrent.ExecutionException -> La6
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L7b java.util.concurrent.CancellationException -> L82 java.util.concurrent.ExecutionException -> La6
            java.lang.String r5 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L7b java.util.concurrent.CancellationException -> L82 java.util.concurrent.ExecutionException -> La6
            int r6 = r5.length()     // Catch: java.lang.Throwable -> L7b java.util.concurrent.CancellationException -> L82 java.util.concurrent.ExecutionException -> La6
            int r6 = r6 + 84
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7b java.util.concurrent.CancellationException -> L82 java.util.concurrent.ExecutionException -> La6
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L7b java.util.concurrent.CancellationException -> L82 java.util.concurrent.ExecutionException -> La6
            r7.append(r0)     // Catch: java.lang.Throwable -> L7b java.util.concurrent.CancellationException -> L82 java.util.concurrent.ExecutionException -> La6
            r7.append(r5)     // Catch: java.lang.Throwable -> L7b java.util.concurrent.CancellationException -> L82 java.util.concurrent.ExecutionException -> La6
            java.lang.String r5 = r7.toString()     // Catch: java.lang.Throwable -> L7b java.util.concurrent.CancellationException -> L82 java.util.concurrent.ExecutionException -> La6
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L7b java.util.concurrent.CancellationException -> L82 java.util.concurrent.ExecutionException -> La6
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L7b java.util.concurrent.CancellationException -> L82 java.util.concurrent.ExecutionException -> La6
            return r3
        L76:
            if (r3 != 0) goto L7a
            java.lang.Object r3 = com.google.common.util.concurrent.AbstractFuture.NULL     // Catch: java.lang.Throwable -> L7b java.util.concurrent.CancellationException -> L82 java.util.concurrent.ExecutionException -> La6
        L7a:
            return r3
        L7b:
            r8 = move-exception
            com.google.common.util.concurrent.AbstractFuture$Failure r0 = new com.google.common.util.concurrent.AbstractFuture$Failure
            r0.<init>(r8)
            return r0
        L82:
            r0 = move-exception
            if (r1 != 0) goto La0
            com.google.common.util.concurrent.AbstractFuture$Failure r1 = new com.google.common.util.concurrent.AbstractFuture$Failure
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r3 = r8.length()
            int r3 = r3 + 77
            java.lang.String r4 = "get() threw CancellationException, despite reporting isCancelled() == false: "
            java.lang.String r8 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r3, r4, r8)
            r2.<init>(r8, r0)
            r1.<init>(r2)
            return r1
        La0:
            com.google.common.util.concurrent.AbstractFuture$Cancellation r8 = new com.google.common.util.concurrent.AbstractFuture$Cancellation
            r8.<init>(r2, r0)
            return r8
        La6:
            r3 = move-exception
            if (r1 == 0) goto Lc2
            com.google.common.util.concurrent.AbstractFuture$Cancellation r1 = new com.google.common.util.concurrent.AbstractFuture$Cancellation
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r5 = r8.length()
            int r5 = r5 + 84
            java.lang.String r8 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r5, r0, r8)
            r4.<init>(r8, r3)
            r1.<init>(r2, r4)
            return r1
        Lc2:
            com.google.common.util.concurrent.AbstractFuture$Failure r8 = new com.google.common.util.concurrent.AbstractFuture$Failure
            java.lang.Throwable r0 = r3.getCause()
            r8.<init>(r0)
            return r8
    }

    @com.google.common.util.concurrent.ParametricNullness
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
            com.google.common.util.concurrent.AbstractFuture$Waiter r0 = r3.waiters
            com.google.common.util.concurrent.AbstractFuture$AtomicHelper r1 = com.google.common.util.concurrent.AbstractFuture.ATOMIC_HELPER
            com.google.common.util.concurrent.AbstractFuture$Waiter r2 = com.google.common.util.concurrent.AbstractFuture.Waiter.TOMBSTONE
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
            com.google.common.util.concurrent.AbstractFuture$Waiter r0 = r0.next
            goto Lc
        L1b:
            return
    }

    private void removeWaiter(com.google.common.util.concurrent.AbstractFuture.Waiter r5) {
            r4 = this;
            r0 = 0
            r5.thread = r0
        L3:
            com.google.common.util.concurrent.AbstractFuture$Waiter r5 = r4.waiters
            com.google.common.util.concurrent.AbstractFuture$Waiter r1 = com.google.common.util.concurrent.AbstractFuture.Waiter.TOMBSTONE
            if (r5 != r1) goto La
            return
        La:
            r1 = r0
        Lb:
            if (r5 == 0) goto L29
            com.google.common.util.concurrent.AbstractFuture$Waiter r2 = r5.next
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
            com.google.common.util.concurrent.AbstractFuture$AtomicHelper r3 = com.google.common.util.concurrent.AbstractFuture.ATOMIC_HELPER
            boolean r5 = r3.casWaiters(r4, r5, r2)
            if (r5 != 0) goto L27
            goto L3
        L27:
            r5 = r2
            goto Lb
        L29:
            return
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(java.lang.Runnable r4, java.util.concurrent.Executor r5) {
            r3 = this;
            java.lang.String r0 = "Runnable was null."
            com.google.common.base.Preconditions.checkNotNull(r4, r0)
            java.lang.String r0 = "Executor was null."
            com.google.common.base.Preconditions.checkNotNull(r5, r0)
            boolean r0 = r3.isDone()
            if (r0 != 0) goto L2c
            com.google.common.util.concurrent.AbstractFuture$Listener r0 = r3.listeners
            com.google.common.util.concurrent.AbstractFuture$Listener r1 = com.google.common.util.concurrent.AbstractFuture.Listener.TOMBSTONE
            if (r0 == r1) goto L2c
            com.google.common.util.concurrent.AbstractFuture$Listener r1 = new com.google.common.util.concurrent.AbstractFuture$Listener
            r1.<init>(r4, r5)
        L1b:
            r1.next = r0
            com.google.common.util.concurrent.AbstractFuture$AtomicHelper r2 = com.google.common.util.concurrent.AbstractFuture.ATOMIC_HELPER
            boolean r0 = r2.casListeners(r3, r0, r1)
            if (r0 == 0) goto L26
            return
        L26:
            com.google.common.util.concurrent.AbstractFuture$Listener r0 = r3.listeners
            com.google.common.util.concurrent.AbstractFuture$Listener r2 = com.google.common.util.concurrent.AbstractFuture.Listener.TOMBSTONE
            if (r0 != r2) goto L1b
        L2c:
            executeListener(r4, r5)
            return
    }

    @com.google.common.annotations.Beta
    @com.google.errorprone.annotations.ForOverride
    public void afterDone() {
            r0 = this;
            return
    }

    @Override // java.util.concurrent.Future
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean cancel(boolean r8) {
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
            boolean r4 = r0 instanceof com.google.common.util.concurrent.AbstractFuture.SetFuture
            r3 = r3 | r4
            if (r3 == 0) goto L64
            boolean r3 = com.google.common.util.concurrent.AbstractFuture.GENERATE_CANCELLATION_CAUSES
            if (r3 == 0) goto L1f
            com.google.common.util.concurrent.AbstractFuture$Cancellation r3 = new com.google.common.util.concurrent.AbstractFuture$Cancellation
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L29
        L1f:
            if (r8 == 0) goto L24
            com.google.common.util.concurrent.AbstractFuture$Cancellation r3 = com.google.common.util.concurrent.AbstractFuture.Cancellation.CAUSELESS_INTERRUPTED
            goto L26
        L24:
            com.google.common.util.concurrent.AbstractFuture$Cancellation r3 = com.google.common.util.concurrent.AbstractFuture.Cancellation.CAUSELESS_CANCELLED
        L26:
            java.util.Objects.requireNonNull(r3)
        L29:
            r5 = 0
            r4 = r7
        L2b:
            com.google.common.util.concurrent.AbstractFuture$AtomicHelper r6 = com.google.common.util.concurrent.AbstractFuture.ATOMIC_HELPER
            boolean r6 = r6.casValue(r4, r0, r3)
            if (r6 == 0) goto L5c
            if (r8 == 0) goto L38
            r4.interruptTask()
        L38:
            complete(r4)
            boolean r4 = r0 instanceof com.google.common.util.concurrent.AbstractFuture.SetFuture
            if (r4 == 0) goto L65
            com.google.common.util.concurrent.AbstractFuture$SetFuture r0 = (com.google.common.util.concurrent.AbstractFuture.SetFuture) r0
            com.google.common.util.concurrent.ListenableFuture<? extends V> r0 = r0.future
            boolean r4 = r0 instanceof com.google.common.util.concurrent.AbstractFuture.Trusted
            if (r4 == 0) goto L58
            r4 = r0
            com.google.common.util.concurrent.AbstractFuture r4 = (com.google.common.util.concurrent.AbstractFuture) r4
            java.lang.Object r0 = r4.value
            if (r0 != 0) goto L50
            r5 = 1
            goto L51
        L50:
            r5 = 0
        L51:
            boolean r6 = r0 instanceof com.google.common.util.concurrent.AbstractFuture.SetFuture
            r5 = r5 | r6
            if (r5 == 0) goto L65
            r5 = 1
            goto L2b
        L58:
            r0.cancel(r8)
            goto L65
        L5c:
            java.lang.Object r0 = r4.value
            boolean r6 = r0 instanceof com.google.common.util.concurrent.AbstractFuture.SetFuture
            if (r6 != 0) goto L2b
            r1 = r5
            goto L65
        L64:
            r1 = 0
        L65:
            return r1
    }

    @Override // java.util.concurrent.Future
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.common.util.concurrent.ParametricNullness
    public V get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
            r6 = this;
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L68
            java.lang.Object r0 = r6.value
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Le
            r3 = 1
            goto Lf
        Le:
            r3 = 0
        Lf:
            boolean r4 = r0 instanceof com.google.common.util.concurrent.AbstractFuture.SetFuture
            r4 = r4 ^ r2
            r3 = r3 & r4
            if (r3 == 0) goto L1a
            java.lang.Object r0 = r6.getDoneValue(r0)
            return r0
        L1a:
            com.google.common.util.concurrent.AbstractFuture$Waiter r0 = r6.waiters
            com.google.common.util.concurrent.AbstractFuture$Waiter r3 = com.google.common.util.concurrent.AbstractFuture.Waiter.TOMBSTONE
            if (r0 == r3) goto L5e
            com.google.common.util.concurrent.AbstractFuture$Waiter r3 = new com.google.common.util.concurrent.AbstractFuture$Waiter
            r3.<init>()
        L25:
            com.google.common.util.concurrent.AbstractFuture$AtomicHelper r4 = access$200()
            r4.putNext(r3, r0)
            com.google.common.util.concurrent.AbstractFuture$AtomicHelper r4 = com.google.common.util.concurrent.AbstractFuture.ATOMIC_HELPER
            boolean r0 = r4.casWaiters(r6, r0, r3)
            if (r0 == 0) goto L58
        L34:
            java.util.concurrent.locks.LockSupport.park(r6)
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L4f
            java.lang.Object r0 = r6.value
            if (r0 == 0) goto L43
            r4 = 1
            goto L44
        L43:
            r4 = 0
        L44:
            boolean r5 = r0 instanceof com.google.common.util.concurrent.AbstractFuture.SetFuture
            r5 = r5 ^ r2
            r4 = r4 & r5
            if (r4 == 0) goto L34
            java.lang.Object r0 = r6.getDoneValue(r0)
            return r0
        L4f:
            r6.removeWaiter(r3)
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L58:
            com.google.common.util.concurrent.AbstractFuture$Waiter r0 = r6.waiters
            com.google.common.util.concurrent.AbstractFuture$Waiter r4 = com.google.common.util.concurrent.AbstractFuture.Waiter.TOMBSTONE
            if (r0 != r4) goto L25
        L5e:
            java.lang.Object r0 = r6.value
            java.util.Objects.requireNonNull(r0)
            java.lang.Object r0 = r6.getDoneValue(r0)
            return r0
        L68:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
    }

    @Override // java.util.concurrent.Future
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.common.util.concurrent.ParametricNullness
    public V get(long r13, java.util.concurrent.TimeUnit r15) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException, java.util.concurrent.ExecutionException {
            r12 = this;
            long r0 = r15.toNanos(r13)
            boolean r2 = java.lang.Thread.interrupted()
            if (r2 != 0) goto L1ab
            java.lang.Object r2 = r12.value
            if (r2 == 0) goto L10
            r3 = 1
            goto L11
        L10:
            r3 = 0
        L11:
            boolean r4 = r2 instanceof com.google.common.util.concurrent.AbstractFuture.SetFuture
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
            if (r8 < 0) goto L96
            com.google.common.util.concurrent.AbstractFuture$Waiter r8 = r12.waiters
            com.google.common.util.concurrent.AbstractFuture$Waiter r9 = com.google.common.util.concurrent.AbstractFuture.Waiter.TOMBSTONE
            if (r8 == r9) goto L8c
            com.google.common.util.concurrent.AbstractFuture$Waiter r9 = new com.google.common.util.concurrent.AbstractFuture$Waiter
            r9.<init>()
        L3b:
            com.google.common.util.concurrent.AbstractFuture$AtomicHelper r10 = access$200()
            r10.putNext(r9, r8)
            com.google.common.util.concurrent.AbstractFuture$AtomicHelper r10 = com.google.common.util.concurrent.AbstractFuture.ATOMIC_HELPER
            boolean r8 = r10.casWaiters(r12, r8, r9)
            if (r8 == 0) goto L86
        L4a:
            r10 = 2147483647999999999(0x1dcd64ffffffffff, double:3.98785104510193E-165)
            long r0 = java.lang.Math.min(r0, r10)
            java.util.concurrent.locks.LockSupport.parkNanos(r12, r0)
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L7d
            java.lang.Object r0 = r12.value
            if (r0 == 0) goto L62
            r1 = 1
            goto L63
        L62:
            r1 = 0
        L63:
            boolean r8 = r0 instanceof com.google.common.util.concurrent.AbstractFuture.SetFuture
            r8 = r8 ^ 1
            r1 = r1 & r8
            if (r1 == 0) goto L6f
            java.lang.Object r13 = r12.getDoneValue(r0)
            return r13
        L6f:
            long r0 = java.lang.System.nanoTime()
            long r0 = r4 - r0
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 >= 0) goto L4a
            r12.removeWaiter(r9)
            goto L96
        L7d:
            r12.removeWaiter(r9)
            java.lang.InterruptedException r13 = new java.lang.InterruptedException
            r13.<init>()
            throw r13
        L86:
            com.google.common.util.concurrent.AbstractFuture$Waiter r8 = r12.waiters
            com.google.common.util.concurrent.AbstractFuture$Waiter r10 = com.google.common.util.concurrent.AbstractFuture.Waiter.TOMBSTONE
            if (r8 != r10) goto L3b
        L8c:
            java.lang.Object r13 = r12.value
            java.util.Objects.requireNonNull(r13)
            java.lang.Object r13 = r12.getDoneValue(r13)
            return r13
        L96:
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 <= 0) goto Lc0
            java.lang.Object r0 = r12.value
            if (r0 == 0) goto La0
            r1 = 1
            goto La1
        La0:
            r1 = 0
        La1:
            boolean r8 = r0 instanceof com.google.common.util.concurrent.AbstractFuture.SetFuture
            r8 = r8 ^ 1
            r1 = r1 & r8
            if (r1 == 0) goto Lad
            java.lang.Object r13 = r12.getDoneValue(r0)
            return r13
        Lad:
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto Lba
            long r0 = java.lang.System.nanoTime()
            long r0 = r4 - r0
            goto L96
        Lba:
            java.lang.InterruptedException r13 = new java.lang.InterruptedException
            r13.<init>()
            throw r13
        Lc0:
            java.lang.String r4 = r12.toString()
            java.lang.String r5 = r15.toString()
            java.util.Locale r8 = java.util.Locale.ROOT
            java.lang.String r5 = r5.toLowerCase(r8)
            java.lang.String r9 = r15.toString()
            java.lang.String r8 = r9.toLowerCase(r8)
            r9 = 28
            int r9 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r8, r9)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r9)
            java.lang.String r9 = "Waited "
            r10.append(r9)
            r10.append(r13)
            java.lang.String r13 = " "
            r10.append(r13)
            r10.append(r8)
            java.lang.String r14 = r10.toString()
            long r8 = r0 + r6
            int r10 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r10 >= 0) goto L180
            java.lang.String r14 = java.lang.String.valueOf(r14)
            java.lang.String r8 = " (plus "
            java.lang.String r14 = r14.concat(r8)
            long r0 = -r0
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r8 = r15.convert(r0, r8)
            long r10 = r15.toNanos(r8)
            long r0 = r0 - r10
            int r15 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r15 == 0) goto L11c
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 <= 0) goto L11a
            goto L11c
        L11a:
            r2 = 0
            goto L11d
        L11c:
            r2 = 1
        L11d:
            if (r15 <= 0) goto L156
            java.lang.String r14 = java.lang.String.valueOf(r14)
            int r15 = r14.length()
            int r15 = r15 + 21
            int r15 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r5, r15)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r15)
            r3.append(r14)
            r3.append(r8)
            r3.append(r13)
            r3.append(r5)
            java.lang.String r14 = r3.toString()
            if (r2 == 0) goto L14e
            java.lang.String r14 = java.lang.String.valueOf(r14)
            java.lang.String r15 = ","
            java.lang.String r14 = r14.concat(r15)
        L14e:
            java.lang.String r14 = java.lang.String.valueOf(r14)
            java.lang.String r14 = r14.concat(r13)
        L156:
            if (r2 == 0) goto L176
            java.lang.String r13 = java.lang.String.valueOf(r14)
            int r14 = r13.length()
            int r14 = r14 + 33
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>(r14)
            r15.append(r13)
            r15.append(r0)
            java.lang.String r13 = " nanoseconds "
            r15.append(r13)
            java.lang.String r14 = r15.toString()
        L176:
            java.lang.String r13 = java.lang.String.valueOf(r14)
            java.lang.String r14 = "delay)"
            java.lang.String r14 = r13.concat(r14)
        L180:
            boolean r13 = r12.isDone()
            if (r13 == 0) goto L196
            java.util.concurrent.TimeoutException r13 = new java.util.concurrent.TimeoutException
            java.lang.String r14 = java.lang.String.valueOf(r14)
            java.lang.String r15 = " but future completed as timeout expired"
            java.lang.String r14 = r14.concat(r15)
            r13.<init>(r14)
            throw r13
        L196:
            java.util.concurrent.TimeoutException r13 = new java.util.concurrent.TimeoutException
            r15 = 5
            int r15 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r14, r15)
            int r15 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r4, r15)
            java.lang.String r0 = " for "
            java.lang.String r14 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r15, r14, r0, r4)
            r13.<init>(r14)
            throw r13
        L1ab:
            java.lang.InterruptedException r13 = new java.lang.InterruptedException
            r13.<init>()
            throw r13
    }

    public void interruptTask() {
            r0 = this;
            return
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
            r1 = this;
            java.lang.Object r0 = r1.value
            boolean r0 = r0 instanceof com.google.common.util.concurrent.AbstractFuture.Cancellation
            return r0
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
            r3 = this;
            java.lang.Object r0 = r3.value
            r1 = 1
            if (r0 == 0) goto L7
            r2 = 1
            goto L8
        L7:
            r2 = 0
        L8:
            boolean r0 = r0 instanceof com.google.common.util.concurrent.AbstractFuture.SetFuture
            r0 = r0 ^ r1
            r0 = r0 & r2
            return r0
    }

    public final void maybePropagateCancellationTo(@javax.annotation.CheckForNull java.util.concurrent.Future<?> r3) {
            r2 = this;
            if (r3 == 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            boolean r1 = r2.isCancelled()
            r0 = r0 & r1
            if (r0 == 0) goto L13
            boolean r0 = r2.wasInterrupted()
            r3.cancel(r0)
        L13:
            return
    }

    @javax.annotation.CheckForNull
    public java.lang.String pendingToString() {
            r4 = this;
            boolean r0 = r4 instanceof java.util.concurrent.ScheduledFuture
            if (r0 == 0) goto L26
            r0 = r4
            java.util.concurrent.ScheduledFuture r0 = (java.util.concurrent.ScheduledFuture) r0
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r0.getDelay(r1)
            r2 = 41
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "remaining delay=["
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = " ms]"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            return r0
        L26:
            r0 = 0
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean set(@com.google.common.util.concurrent.ParametricNullness V r3) {
            r2 = this;
            if (r3 != 0) goto L4
            java.lang.Object r3 = com.google.common.util.concurrent.AbstractFuture.NULL
        L4:
            com.google.common.util.concurrent.AbstractFuture$AtomicHelper r0 = com.google.common.util.concurrent.AbstractFuture.ATOMIC_HELPER
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

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean setException(java.lang.Throwable r3) {
            r2 = this;
            com.google.common.util.concurrent.AbstractFuture$Failure r0 = new com.google.common.util.concurrent.AbstractFuture$Failure
            java.lang.Object r3 = com.google.common.base.Preconditions.checkNotNull(r3)
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r0.<init>(r3)
            com.google.common.util.concurrent.AbstractFuture$AtomicHelper r3 = com.google.common.util.concurrent.AbstractFuture.ATOMIC_HELPER
            r1 = 0
            boolean r3 = r3.casValue(r2, r1, r0)
            if (r3 == 0) goto L19
            complete(r2)
            r3 = 1
            return r3
        L19:
            r3 = 0
            return r3
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean setFuture(com.google.common.util.concurrent.ListenableFuture<? extends V> r6) {
            r5 = this;
            com.google.common.base.Preconditions.checkNotNull(r6)
            java.lang.Object r0 = r5.value
            r1 = 0
            if (r0 != 0) goto L45
            boolean r0 = r6.isDone()
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L21
            java.lang.Object r6 = getFutureValue(r6)
            com.google.common.util.concurrent.AbstractFuture$AtomicHelper r0 = com.google.common.util.concurrent.AbstractFuture.ATOMIC_HELPER
            boolean r6 = r0.casValue(r5, r3, r6)
            if (r6 == 0) goto L20
            complete(r5)
            return r2
        L20:
            return r1
        L21:
            com.google.common.util.concurrent.AbstractFuture$SetFuture r0 = new com.google.common.util.concurrent.AbstractFuture$SetFuture
            r0.<init>(r5, r6)
            com.google.common.util.concurrent.AbstractFuture$AtomicHelper r4 = com.google.common.util.concurrent.AbstractFuture.ATOMIC_HELPER
            boolean r3 = r4.casValue(r5, r3, r0)
            if (r3 == 0) goto L43
            com.google.common.util.concurrent.DirectExecutor r1 = com.google.common.util.concurrent.DirectExecutor.INSTANCE     // Catch: java.lang.Throwable -> L34
            r6.addListener(r0, r1)     // Catch: java.lang.Throwable -> L34
            goto L42
        L34:
            r6 = move-exception
            com.google.common.util.concurrent.AbstractFuture$Failure r1 = new com.google.common.util.concurrent.AbstractFuture$Failure     // Catch: java.lang.Throwable -> L3b
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L3b
            goto L3d
        L3b:
            com.google.common.util.concurrent.AbstractFuture$Failure r1 = com.google.common.util.concurrent.AbstractFuture.Failure.FALLBACK_INSTANCE
        L3d:
            com.google.common.util.concurrent.AbstractFuture$AtomicHelper r6 = com.google.common.util.concurrent.AbstractFuture.ATOMIC_HELPER
            r6.casValue(r5, r0, r1)
        L42:
            return r2
        L43:
            java.lang.Object r0 = r5.value
        L45:
            boolean r2 = r0 instanceof com.google.common.util.concurrent.AbstractFuture.Cancellation
            if (r2 == 0) goto L50
            com.google.common.util.concurrent.AbstractFuture$Cancellation r0 = (com.google.common.util.concurrent.AbstractFuture.Cancellation) r0
            boolean r0 = r0.wasInterrupted
            r6.cancel(r0)
        L50:
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r3.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "com.google.common.util.concurrent."
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L21
            java.lang.Class r1 = r3.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            goto L2c
        L21:
            java.lang.Class r1 = r3.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
        L2c:
            r1 = 64
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r3)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "[status="
            r0.append(r1)
            boolean r1 = r3.isCancelled()
            if (r1 == 0) goto L4d
            java.lang.String r1 = "CANCELLED"
            r0.append(r1)
            goto L5a
        L4d:
            boolean r1 = r3.isDone()
            if (r1 == 0) goto L57
            r3.addDoneString(r0)
            goto L5a
        L57:
            r3.addPendingString(r0)
        L5a:
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.google.common.util.concurrent.internal.InternalFutureFailureAccess
    @javax.annotation.CheckForNull
    public final java.lang.Throwable tryInternalFastPathGetFailure() {
            r2 = this;
            boolean r0 = r2 instanceof com.google.common.util.concurrent.AbstractFuture.Trusted
            if (r0 == 0) goto Lf
            java.lang.Object r0 = r2.value
            boolean r1 = r0 instanceof com.google.common.util.concurrent.AbstractFuture.Failure
            if (r1 == 0) goto Lf
            com.google.common.util.concurrent.AbstractFuture$Failure r0 = (com.google.common.util.concurrent.AbstractFuture.Failure) r0
            java.lang.Throwable r0 = r0.exception
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public final boolean wasInterrupted() {
            r2 = this;
            java.lang.Object r0 = r2.value
            boolean r1 = r0 instanceof com.google.common.util.concurrent.AbstractFuture.Cancellation
            if (r1 == 0) goto Le
            com.google.common.util.concurrent.AbstractFuture$Cancellation r0 = (com.google.common.util.concurrent.AbstractFuture.Cancellation) r0
            boolean r0 = r0.wasInterrupted
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }
}
