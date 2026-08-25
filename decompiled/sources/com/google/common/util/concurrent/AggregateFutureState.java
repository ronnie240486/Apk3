package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtCompatible(emulated = true)
@com.google.j2objc.annotations.ReflectionSupport(com.google.j2objc.annotations.ReflectionSupport.Level.FULL)
abstract class AggregateFutureState<OutputT> extends com.google.common.util.concurrent.AbstractFuture.TrustedFuture<OutputT> {
    private static final com.google.common.util.concurrent.AggregateFutureState.AtomicHelper ATOMIC_HELPER = null;
    private static final java.util.logging.Logger log = null;
    private volatile int remaining;

    @javax.annotation.CheckForNull
    private volatile java.util.Set<java.lang.Throwable> seenExceptions;

    /* JADX INFO: renamed from: com.google.common.util.concurrent.AggregateFutureState$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes.dex */
    public static abstract class AtomicHelper {
        private AtomicHelper() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ AtomicHelper(com.google.common.util.concurrent.AggregateFutureState.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract void compareAndSetSeenExceptions(com.google.common.util.concurrent.AggregateFutureState r1, java.util.Set r2);

        public abstract int decrementAndGetRemainingCount(com.google.common.util.concurrent.AggregateFutureState<?> r1);
    }

    public static final class SafeAtomicHelper extends com.google.common.util.concurrent.AggregateFutureState.AtomicHelper {
        public final java.util.concurrent.atomic.AtomicIntegerFieldUpdater<com.google.common.util.concurrent.AggregateFutureState<?>> remainingCountUpdater;
        public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.common.util.concurrent.AggregateFutureState<?>, java.util.Set<java.lang.Throwable>> seenExceptionsUpdater;

        public SafeAtomicHelper(java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2, java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.seenExceptionsUpdater = r2
                r1.remainingCountUpdater = r3
                return
        }

        @Override // com.google.common.util.concurrent.AggregateFutureState.AtomicHelper
        public final void compareAndSetSeenExceptions(com.google.common.util.concurrent.AggregateFutureState r3, java.util.Set r4) {
                r2 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.common.util.concurrent.AggregateFutureState<?>, java.util.Set<java.lang.Throwable>> r0 = r2.seenExceptionsUpdater
            L2:
                r1 = 0
                boolean r1 = r0.compareAndSet(r3, r1, r4)
                if (r1 == 0) goto La
                goto L10
            La:
                java.lang.Object r1 = r0.get(r3)
                if (r1 == 0) goto L2
            L10:
                return
        }

        @Override // com.google.common.util.concurrent.AggregateFutureState.AtomicHelper
        public final int decrementAndGetRemainingCount(com.google.common.util.concurrent.AggregateFutureState<?> r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater<com.google.common.util.concurrent.AggregateFutureState<?>> r0 = r1.remainingCountUpdater
                int r2 = r0.decrementAndGet(r2)
                return r2
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class SynchronizedAtomicHelper extends com.google.common.util.concurrent.AggregateFutureState.AtomicHelper {
        private SynchronizedAtomicHelper() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        public /* synthetic */ SynchronizedAtomicHelper(com.google.common.util.concurrent.AggregateFutureState.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.util.concurrent.AggregateFutureState.AtomicHelper
        public final void compareAndSetSeenExceptions(com.google.common.util.concurrent.AggregateFutureState r2, java.util.Set r3) {
                r1 = this;
                monitor-enter(r2)
                java.util.Set r0 = com.google.common.util.concurrent.AggregateFutureState.access$200(r2)     // Catch: java.lang.Throwable -> Lc
                if (r0 != 0) goto La
                com.google.common.util.concurrent.AggregateFutureState.access$202(r2, r3)     // Catch: java.lang.Throwable -> Lc
            La:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
                return
            Lc:
                r3 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
                throw r3
        }

        @Override // com.google.common.util.concurrent.AggregateFutureState.AtomicHelper
        public final int decrementAndGetRemainingCount(com.google.common.util.concurrent.AggregateFutureState<?> r2) {
                r1 = this;
                monitor-enter(r2)
                int r0 = com.google.common.util.concurrent.AggregateFutureState.access$306(r2)     // Catch: java.lang.Throwable -> L7
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7
                return r0
            L7:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7
                throw r0
        }
    }

    static {
            java.lang.Class<com.google.common.util.concurrent.AggregateFutureState> r0 = com.google.common.util.concurrent.AggregateFutureState.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.common.util.concurrent.AggregateFutureState.log = r0
            r0 = 0
            com.google.common.util.concurrent.AggregateFutureState$SafeAtomicHelper r1 = new com.google.common.util.concurrent.AggregateFutureState$SafeAtomicHelper     // Catch: java.lang.Throwable -> L26
            java.lang.Class<com.google.common.util.concurrent.AggregateFutureState> r2 = com.google.common.util.concurrent.AggregateFutureState.class
            java.lang.Class<java.util.Set> r3 = java.util.Set.class
            java.lang.String r4 = "seenExceptions"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r3, r4)     // Catch: java.lang.Throwable -> L26
            java.lang.Class<com.google.common.util.concurrent.AggregateFutureState> r3 = com.google.common.util.concurrent.AggregateFutureState.class
            java.lang.String r4 = "remaining"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r3, r4)     // Catch: java.lang.Throwable -> L26
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L26
            goto L2e
        L26:
            r1 = move-exception
            com.google.common.util.concurrent.AggregateFutureState$SynchronizedAtomicHelper r2 = new com.google.common.util.concurrent.AggregateFutureState$SynchronizedAtomicHelper
            r2.<init>(r0)
            r0 = r1
            r1 = r2
        L2e:
            com.google.common.util.concurrent.AggregateFutureState.ATOMIC_HELPER = r1
            if (r0 == 0) goto L3b
            java.util.logging.Logger r1 = com.google.common.util.concurrent.AggregateFutureState.log
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L3b:
            return
    }

    public AggregateFutureState(int r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.seenExceptions = r0
            r1.remaining = r2
            return
    }

    public static /* synthetic */ java.util.Set access$200(com.google.common.util.concurrent.AggregateFutureState r0) {
            java.util.Set<java.lang.Throwable> r0 = r0.seenExceptions
            return r0
    }

    public static /* synthetic */ java.util.Set access$202(com.google.common.util.concurrent.AggregateFutureState r0, java.util.Set r1) {
            r0.seenExceptions = r1
            return r1
    }

    public static /* synthetic */ int access$306(com.google.common.util.concurrent.AggregateFutureState r1) {
            int r0 = r1.remaining
            int r0 = r0 + (-1)
            r1.remaining = r0
            return r0
    }

    public abstract void addInitialException(java.util.Set<java.lang.Throwable> r1);

    public final void clearSeenExceptions() {
            r1 = this;
            r0 = 0
            r1.seenExceptions = r0
            return
    }

    public final int decrementRemainingAndGet() {
            r1 = this;
            com.google.common.util.concurrent.AggregateFutureState$AtomicHelper r0 = com.google.common.util.concurrent.AggregateFutureState.ATOMIC_HELPER
            int r0 = r0.decrementAndGetRemainingCount(r1)
            return r0
    }

    public final java.util.Set<java.lang.Throwable> getOrInitSeenExceptions() {
            r2 = this;
            java.util.Set<java.lang.Throwable> r0 = r2.seenExceptions
            if (r0 != 0) goto L15
            java.util.Set r0 = com.google.common.collect.Sets.newConcurrentHashSet()
            r2.addInitialException(r0)
            com.google.common.util.concurrent.AggregateFutureState$AtomicHelper r1 = com.google.common.util.concurrent.AggregateFutureState.ATOMIC_HELPER
            r1.compareAndSetSeenExceptions(r2, r0)
            java.util.Set<java.lang.Throwable> r0 = r2.seenExceptions
            java.util.Objects.requireNonNull(r0)
        L15:
            return r0
    }
}
