package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.Beta
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
public abstract class Striped<L> {
    private static final int ALL_SET = -1;
    private static final int LARGE_LAZY_CUTOFF = 1024;
    private static final com.google.common.base.Supplier<java.util.concurrent.locks.ReadWriteLock> READ_WRITE_LOCK_SUPPLIER = null;
    private static final com.google.common.base.Supplier<java.util.concurrent.locks.ReadWriteLock> WEAK_SAFE_READ_WRITE_LOCK_SUPPLIER = null;







    public static class CompactStriped<L> extends com.google.common.util.concurrent.Striped.PowerOfTwoStriped<L> {
        private final java.lang.Object[] array;

        private CompactStriped(int r4, com.google.common.base.Supplier<L> r5) {
                r3 = this;
                r3.<init>(r4)
                r0 = 0
                r1 = 1
                r2 = 1073741824(0x40000000, float:2.0)
                if (r4 > r2) goto Lb
                r4 = 1
                goto Lc
            Lb:
                r4 = 0
            Lc:
                java.lang.String r2 = "Stripes must be <= 2^30)"
                com.google.common.base.Preconditions.checkArgument(r4, r2)
                int r4 = r3.mask
                int r4 = r4 + r1
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r3.array = r4
            L18:
                java.lang.Object[] r4 = r3.array
                int r1 = r4.length
                if (r0 >= r1) goto L26
                java.lang.Object r1 = r5.get()
                r4[r0] = r1
                int r0 = r0 + 1
                goto L18
            L26:
                return
        }

        public /* synthetic */ CompactStriped(int r1, com.google.common.base.Supplier r2, com.google.common.util.concurrent.Striped.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // com.google.common.util.concurrent.Striped
        public L getAt(int r2) {
                r1 = this;
                java.lang.Object[] r0 = r1.array
                r2 = r0[r2]
                return r2
        }

        @Override // com.google.common.util.concurrent.Striped
        public int size() {
                r1 = this;
                java.lang.Object[] r0 = r1.array
                int r0 = r0.length
                return r0
        }
    }

    @com.google.common.annotations.VisibleForTesting
    public static class LargeLazyStriped<L> extends com.google.common.util.concurrent.Striped.PowerOfTwoStriped<L> {
        public final java.util.concurrent.ConcurrentMap<java.lang.Integer, L> locks;
        public final int size;
        public final com.google.common.base.Supplier<L> supplier;

        public LargeLazyStriped(int r2, com.google.common.base.Supplier<L> r3) {
                r1 = this;
                r1.<init>(r2)
                int r2 = r1.mask
                r0 = -1
                if (r2 != r0) goto Lc
                r2 = 2147483647(0x7fffffff, float:NaN)
                goto Le
            Lc:
                int r2 = r2 + 1
            Le:
                r1.size = r2
                r1.supplier = r3
                com.google.common.collect.MapMaker r2 = new com.google.common.collect.MapMaker
                r2.<init>()
                com.google.common.collect.MapMaker r2 = r2.weakValues()
                java.util.concurrent.ConcurrentMap r2 = r2.makeMap()
                r1.locks = r2
                return
        }

        @Override // com.google.common.util.concurrent.Striped
        public L getAt(int r3) {
                r2 = this;
                int r0 = r2.size
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r0 == r1) goto Le
                int r0 = r2.size()
                com.google.common.base.Preconditions.checkElementIndex(r3, r0)
            Le:
                java.util.concurrent.ConcurrentMap<java.lang.Integer, L> r0 = r2.locks
                java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
                java.lang.Object r0 = r0.get(r1)
                if (r0 == 0) goto L1b
                return r0
            L1b:
                com.google.common.base.Supplier<L> r0 = r2.supplier
                java.lang.Object r0 = r0.get()
                java.util.concurrent.ConcurrentMap<java.lang.Integer, L> r1 = r2.locks
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.Object r3 = r1.putIfAbsent(r3, r0)
                java.lang.Object r3 = com.google.common.base.MoreObjects.firstNonNull(r3, r0)
                return r3
        }

        @Override // com.google.common.util.concurrent.Striped
        public int size() {
                r1 = this;
                int r0 = r1.size
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class PaddedLock extends java.util.concurrent.locks.ReentrantLock {
        public PaddedLock() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }
    }

    public static class PaddedSemaphore extends java.util.concurrent.Semaphore {
        public PaddedSemaphore(int r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static abstract class PowerOfTwoStriped<L> extends com.google.common.util.concurrent.Striped<L> {
        public final int mask;

        public PowerOfTwoStriped(int r4) {
                r3 = this;
                r0 = 0
                r3.<init>(r0)
                r0 = 1
                if (r4 <= 0) goto L9
                r1 = 1
                goto La
            L9:
                r1 = 0
            La:
                java.lang.String r2 = "Stripes must be positive"
                com.google.common.base.Preconditions.checkArgument(r1, r2)
                r1 = 1073741824(0x40000000, float:2.0)
                if (r4 <= r1) goto L15
                r4 = -1
                goto L1a
            L15:
                int r4 = com.google.common.util.concurrent.Striped.access$200(r4)
                int r4 = r4 - r0
            L1a:
                r3.mask = r4
                return
        }

        @Override // com.google.common.util.concurrent.Striped
        public final L get(java.lang.Object r2) {
                r1 = this;
                int r2 = r2.hashCode()
                int r2 = com.google.common.util.concurrent.Striped.access$300(r2)
                int r0 = r1.mask
                r2 = r2 & r0
                java.lang.Object r2 = r1.getAt(r2)
                return r2
        }

        @Override // com.google.common.util.concurrent.Striped
        public final int indexFor(java.lang.Object r2) {
                r1 = this;
                int r2 = r2.hashCode()
                int r2 = com.google.common.util.concurrent.Striped.access$300(r2)
                int r0 = r1.mask
                r2 = r2 & r0
                return r2
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @com.google.common.annotations.VisibleForTesting
    public static class SmallLazyStriped<L> extends com.google.common.util.concurrent.Striped.PowerOfTwoStriped<L> {
        public final java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.util.concurrent.Striped.SmallLazyStriped.ArrayReference<? extends L>> locks;
        public final java.lang.ref.ReferenceQueue<L> queue;
        public final int size;
        public final com.google.common.base.Supplier<L> supplier;

        public static final class ArrayReference<L> extends java.lang.ref.WeakReference<L> {
            public final int index;

            public ArrayReference(L r1, int r2, java.lang.ref.ReferenceQueue<L> r3) {
                    r0 = this;
                    r0.<init>(r1, r3)
                    r0.index = r2
                    return
            }
        }

        public SmallLazyStriped(int r2, com.google.common.base.Supplier<L> r3) {
                r1 = this;
                r1.<init>(r2)
                java.lang.ref.ReferenceQueue r2 = new java.lang.ref.ReferenceQueue
                r2.<init>()
                r1.queue = r2
                int r2 = r1.mask
                r0 = -1
                if (r2 != r0) goto L13
                r2 = 2147483647(0x7fffffff, float:NaN)
                goto L15
            L13:
                int r2 = r2 + 1
            L15:
                r1.size = r2
                java.util.concurrent.atomic.AtomicReferenceArray r0 = new java.util.concurrent.atomic.AtomicReferenceArray
                r0.<init>(r2)
                r1.locks = r0
                r1.supplier = r3
                return
        }

        private void drainQueue() {
                r4 = this;
            L0:
                java.lang.ref.ReferenceQueue<L> r0 = r4.queue
                java.lang.ref.Reference r0 = r0.poll()
                if (r0 == 0) goto L13
                com.google.common.util.concurrent.Striped$SmallLazyStriped$ArrayReference r0 = (com.google.common.util.concurrent.Striped.SmallLazyStriped.ArrayReference) r0
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.util.concurrent.Striped$SmallLazyStriped$ArrayReference<? extends L>> r1 = r4.locks
                int r2 = r0.index
                r3 = 0
                r1.compareAndSet(r2, r0, r3)
                goto L0
            L13:
                return
        }

        @Override // com.google.common.util.concurrent.Striped
        public L getAt(int r6) {
                r5 = this;
                int r0 = r5.size
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r0 == r1) goto Le
                int r0 = r5.size()
                com.google.common.base.Preconditions.checkElementIndex(r6, r0)
            Le:
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.util.concurrent.Striped$SmallLazyStriped$ArrayReference<? extends L>> r0 = r5.locks
                java.lang.Object r0 = r0.get(r6)
                com.google.common.util.concurrent.Striped$SmallLazyStriped$ArrayReference r0 = (com.google.common.util.concurrent.Striped.SmallLazyStriped.ArrayReference) r0
                r1 = 0
                if (r0 != 0) goto L1b
                r2 = r1
                goto L1f
            L1b:
                java.lang.Object r2 = r0.get()
            L1f:
                if (r2 == 0) goto L22
                return r2
            L22:
                com.google.common.base.Supplier<L> r2 = r5.supplier
                java.lang.Object r2 = r2.get()
                com.google.common.util.concurrent.Striped$SmallLazyStriped$ArrayReference r3 = new com.google.common.util.concurrent.Striped$SmallLazyStriped$ArrayReference
                java.lang.ref.ReferenceQueue<L> r4 = r5.queue
                r3.<init>(r2, r6, r4)
            L2f:
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.util.concurrent.Striped$SmallLazyStriped$ArrayReference<? extends L>> r4 = r5.locks
                boolean r0 = r4.compareAndSet(r6, r0, r3)
                if (r0 != 0) goto L4a
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.util.concurrent.Striped$SmallLazyStriped$ArrayReference<? extends L>> r0 = r5.locks
                java.lang.Object r0 = r0.get(r6)
                com.google.common.util.concurrent.Striped$SmallLazyStriped$ArrayReference r0 = (com.google.common.util.concurrent.Striped.SmallLazyStriped.ArrayReference) r0
                if (r0 != 0) goto L43
                r4 = r1
                goto L47
            L43:
                java.lang.Object r4 = r0.get()
            L47:
                if (r4 == 0) goto L2f
                return r4
            L4a:
                r5.drainQueue()
                return r2
        }

        @Override // com.google.common.util.concurrent.Striped
        public int size() {
                r1 = this;
                int r0 = r1.size
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class WeakSafeCondition extends com.google.common.util.concurrent.ForwardingCondition {
        private final java.util.concurrent.locks.Condition delegate;
        private final com.google.common.util.concurrent.Striped.WeakSafeReadWriteLock strongReference;

        public WeakSafeCondition(java.util.concurrent.locks.Condition r1, com.google.common.util.concurrent.Striped.WeakSafeReadWriteLock r2) {
                r0 = this;
                r0.<init>()
                r0.delegate = r1
                r0.strongReference = r2
                return
        }

        @Override // com.google.common.util.concurrent.ForwardingCondition
        public final java.util.concurrent.locks.Condition delegate() {
                r1 = this;
                java.util.concurrent.locks.Condition r0 = r1.delegate
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class WeakSafeLock extends com.google.common.util.concurrent.ForwardingLock {
        private final java.util.concurrent.locks.Lock delegate;
        private final com.google.common.util.concurrent.Striped.WeakSafeReadWriteLock strongReference;

        public WeakSafeLock(java.util.concurrent.locks.Lock r1, com.google.common.util.concurrent.Striped.WeakSafeReadWriteLock r2) {
                r0 = this;
                r0.<init>()
                r0.delegate = r1
                r0.strongReference = r2
                return
        }

        @Override // com.google.common.util.concurrent.ForwardingLock
        public final java.util.concurrent.locks.Lock delegate() {
                r1 = this;
                java.util.concurrent.locks.Lock r0 = r1.delegate
                return r0
        }

        @Override // com.google.common.util.concurrent.ForwardingLock, java.util.concurrent.locks.Lock
        public java.util.concurrent.locks.Condition newCondition() {
                r3 = this;
                com.google.common.util.concurrent.Striped$WeakSafeCondition r0 = new com.google.common.util.concurrent.Striped$WeakSafeCondition
                java.util.concurrent.locks.Lock r1 = r3.delegate
                java.util.concurrent.locks.Condition r1 = r1.newCondition()
                com.google.common.util.concurrent.Striped$WeakSafeReadWriteLock r2 = r3.strongReference
                r0.<init>(r1, r2)
                return r0
        }
    }

    public static final class WeakSafeReadWriteLock implements java.util.concurrent.locks.ReadWriteLock {
        private final java.util.concurrent.locks.ReadWriteLock delegate;

        public WeakSafeReadWriteLock() {
                r1 = this;
                r1.<init>()
                java.util.concurrent.locks.ReentrantReadWriteLock r0 = new java.util.concurrent.locks.ReentrantReadWriteLock
                r0.<init>()
                r1.delegate = r0
                return
        }

        @Override // java.util.concurrent.locks.ReadWriteLock
        public java.util.concurrent.locks.Lock readLock() {
                r2 = this;
                com.google.common.util.concurrent.Striped$WeakSafeLock r0 = new com.google.common.util.concurrent.Striped$WeakSafeLock
                java.util.concurrent.locks.ReadWriteLock r1 = r2.delegate
                java.util.concurrent.locks.Lock r1 = r1.readLock()
                r0.<init>(r1, r2)
                return r0
        }

        @Override // java.util.concurrent.locks.ReadWriteLock
        public java.util.concurrent.locks.Lock writeLock() {
                r2 = this;
                com.google.common.util.concurrent.Striped$WeakSafeLock r0 = new com.google.common.util.concurrent.Striped$WeakSafeLock
                java.util.concurrent.locks.ReadWriteLock r1 = r2.delegate
                java.util.concurrent.locks.Lock r1 = r1.writeLock()
                r0.<init>(r1, r2)
                return r0
        }
    }

    static {
            com.google.common.util.concurrent.Striped$5 r0 = new com.google.common.util.concurrent.Striped$5
            r0.<init>()
            com.google.common.util.concurrent.Striped.READ_WRITE_LOCK_SUPPLIER = r0
            com.google.common.util.concurrent.Striped$6 r0 = new com.google.common.util.concurrent.Striped$6
            r0.<init>()
            com.google.common.util.concurrent.Striped.WEAK_SAFE_READ_WRITE_LOCK_SUPPLIER = r0
            return
    }

    private Striped() {
            r0 = this;
            r0.<init>()
            return
    }

    public /* synthetic */ Striped(com.google.common.util.concurrent.Striped.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ int access$200(int r0) {
            int r0 = ceilToPowerOfTwo(r0)
            return r0
    }

    public static /* synthetic */ int access$300(int r0) {
            int r0 = smear(r0)
            return r0
    }

    private static int ceilToPowerOfTwo(int r1) {
            java.math.RoundingMode r0 = java.math.RoundingMode.CEILING
            int r1 = com.google.common.math.IntMath.log2(r1, r0)
            r0 = 1
            int r1 = r0 << r1
            return r1
    }

    public static <L> com.google.common.util.concurrent.Striped<L> custom(int r2, com.google.common.base.Supplier<L> r3) {
            com.google.common.util.concurrent.Striped$CompactStriped r0 = new com.google.common.util.concurrent.Striped$CompactStriped
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    private static <L> com.google.common.util.concurrent.Striped<L> lazy(int r1, com.google.common.base.Supplier<L> r2) {
            r0 = 1024(0x400, float:1.435E-42)
            if (r1 >= r0) goto La
            com.google.common.util.concurrent.Striped$SmallLazyStriped r0 = new com.google.common.util.concurrent.Striped$SmallLazyStriped
            r0.<init>(r1, r2)
            goto Lf
        La:
            com.google.common.util.concurrent.Striped$LargeLazyStriped r0 = new com.google.common.util.concurrent.Striped$LargeLazyStriped
            r0.<init>(r1, r2)
        Lf:
            return r0
    }

    public static com.google.common.util.concurrent.Striped<java.util.concurrent.locks.Lock> lazyWeakLock(int r1) {
            com.google.common.util.concurrent.Striped$2 r0 = new com.google.common.util.concurrent.Striped$2
            r0.<init>()
            com.google.common.util.concurrent.Striped r1 = lazy(r1, r0)
            return r1
    }

    public static com.google.common.util.concurrent.Striped<java.util.concurrent.locks.ReadWriteLock> lazyWeakReadWriteLock(int r1) {
            com.google.common.base.Supplier<java.util.concurrent.locks.ReadWriteLock> r0 = com.google.common.util.concurrent.Striped.WEAK_SAFE_READ_WRITE_LOCK_SUPPLIER
            com.google.common.util.concurrent.Striped r1 = lazy(r1, r0)
            return r1
    }

    public static com.google.common.util.concurrent.Striped<java.util.concurrent.Semaphore> lazyWeakSemaphore(int r1, int r2) {
            com.google.common.util.concurrent.Striped$4 r0 = new com.google.common.util.concurrent.Striped$4
            r0.<init>(r2)
            com.google.common.util.concurrent.Striped r1 = lazy(r1, r0)
            return r1
    }

    public static com.google.common.util.concurrent.Striped<java.util.concurrent.locks.Lock> lock(int r1) {
            com.google.common.util.concurrent.Striped$1 r0 = new com.google.common.util.concurrent.Striped$1
            r0.<init>()
            com.google.common.util.concurrent.Striped r1 = custom(r1, r0)
            return r1
    }

    public static com.google.common.util.concurrent.Striped<java.util.concurrent.locks.ReadWriteLock> readWriteLock(int r1) {
            com.google.common.base.Supplier<java.util.concurrent.locks.ReadWriteLock> r0 = com.google.common.util.concurrent.Striped.READ_WRITE_LOCK_SUPPLIER
            com.google.common.util.concurrent.Striped r1 = custom(r1, r0)
            return r1
    }

    public static com.google.common.util.concurrent.Striped<java.util.concurrent.Semaphore> semaphore(int r1, int r2) {
            com.google.common.util.concurrent.Striped$3 r0 = new com.google.common.util.concurrent.Striped$3
            r0.<init>(r2)
            com.google.common.util.concurrent.Striped r1 = custom(r1, r0)
            return r1
    }

    private static int smear(int r2) {
            int r0 = r2 >>> 20
            int r1 = r2 >>> 12
            r0 = r0 ^ r1
            r2 = r2 ^ r0
            int r0 = r2 >>> 7
            r0 = r0 ^ r2
            int r2 = r2 >>> 4
            r2 = r2 ^ r0
            return r2
    }

    public java.lang.Iterable<L> bulkGet(java.lang.Iterable<? extends java.lang.Object> r5) {
            r4 = this;
            java.util.ArrayList r5 = com.google.common.collect.Lists.newArrayList(r5)
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto Lf
            com.google.common.collect.ImmutableList r5 = com.google.common.collect.ImmutableList.of()
            return r5
        Lf:
            int r0 = r5.size()
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 0
        L17:
            int r3 = r5.size()
            if (r2 >= r3) goto L2a
            java.lang.Object r3 = r5.get(r2)
            int r3 = r4.indexFor(r3)
            r0[r2] = r3
            int r2 = r2 + 1
            goto L17
        L2a:
            java.util.Arrays.sort(r0)
            r2 = r0[r1]
            java.lang.Object r3 = r4.getAt(r2)
            r5.set(r1, r3)
            r1 = 1
        L37:
            int r3 = r5.size()
            if (r1 >= r3) goto L56
            r3 = r0[r1]
            if (r3 != r2) goto L4b
            int r3 = r1 + (-1)
            java.lang.Object r3 = r5.get(r3)
            r5.set(r1, r3)
            goto L53
        L4b:
            java.lang.Object r2 = r4.getAt(r3)
            r5.set(r1, r2)
            r2 = r3
        L53:
            int r1 = r1 + 1
            goto L37
        L56:
            java.util.List r5 = java.util.Collections.unmodifiableList(r5)
            return r5
    }

    public abstract L get(java.lang.Object r1);

    public abstract L getAt(int r1);

    public abstract int indexFor(java.lang.Object r1);

    public abstract int size();
}
