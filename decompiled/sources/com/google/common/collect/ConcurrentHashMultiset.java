package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtIncompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class ConcurrentHashMultiset<E> extends com.google.common.collect.AbstractMultiset<E> implements java.io.Serializable {
    private static final long serialVersionUID = 1;
    private final transient java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> countMap;




    /* JADX INFO: loaded from: classes2.dex */
    public class EntrySet extends com.google.common.collect.AbstractMultiset<E>.EntrySet {
        public final /* synthetic */ com.google.common.collect.ConcurrentHashMultiset this$0;

        private EntrySet(com.google.common.collect.ConcurrentHashMultiset r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        public /* synthetic */ EntrySet(com.google.common.collect.ConcurrentHashMultiset r1, com.google.common.collect.ConcurrentHashMultiset.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private java.util.List<com.google.common.collect.Multiset.Entry<E>> snapshot() {
                r2 = this;
                int r0 = r2.size()
                java.util.ArrayList r0 = com.google.common.collect.Lists.newArrayListWithExpectedSize(r0)
                java.util.Iterator r1 = r2.iterator()
                com.google.common.collect.Iterators.addAll(r0, r1)
                return r0
        }

        @Override // com.google.common.collect.AbstractMultiset.EntrySet, com.google.common.collect.Multisets.EntrySet
        public final com.google.common.collect.Multiset multiset() {
                r1 = this;
                com.google.common.collect.ConcurrentHashMultiset r0 = r1.this$0
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public java.lang.Object[] toArray() {
                r1 = this;
                java.util.List r0 = r1.snapshot()
                java.lang.Object[] r0 = r0.toArray()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] r2) {
                r1 = this;
                java.util.List r0 = r1.snapshot()
                java.lang.Object[] r2 = r0.toArray(r2)
                return r2
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class FieldSettersHolder {
        public static final com.google.common.collect.Serialization.FieldSetter<com.google.common.collect.ConcurrentHashMultiset> COUNT_MAP_FIELD_SETTER = null;

        static {
                java.lang.Class<com.google.common.collect.ConcurrentHashMultiset> r0 = com.google.common.collect.ConcurrentHashMultiset.class
                java.lang.String r1 = "countMap"
                com.google.common.collect.Serialization$FieldSetter r0 = com.google.common.collect.Serialization.getFieldSetter(r0, r1)
                com.google.common.collect.ConcurrentHashMultiset.FieldSettersHolder.COUNT_MAP_FIELD_SETTER = r0
                return
        }

        private FieldSettersHolder() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    @com.google.common.annotations.VisibleForTesting
    public ConcurrentHashMultiset(java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r3) {
            r2 = this;
            r2.<init>()
            boolean r0 = r3.isEmpty()
            java.lang.String r1 = "the backing map (%s) must be empty"
            com.google.common.base.Preconditions.checkArgument(r0, r1, r3)
            r2.countMap = r3
            return
    }

    public static /* synthetic */ java.util.concurrent.ConcurrentMap access$100(com.google.common.collect.ConcurrentHashMultiset r0) {
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r0 = r0.countMap
            return r0
    }

    public static <E> com.google.common.collect.ConcurrentHashMultiset<E> create() {
            com.google.common.collect.ConcurrentHashMultiset r0 = new com.google.common.collect.ConcurrentHashMultiset
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r0.<init>(r1)
            return r0
    }

    public static <E> com.google.common.collect.ConcurrentHashMultiset<E> create(java.lang.Iterable<? extends E> r1) {
            com.google.common.collect.ConcurrentHashMultiset r0 = create()
            com.google.common.collect.Iterables.addAll(r0, r1)
            return r0
    }

    @com.google.common.annotations.Beta
    public static <E> com.google.common.collect.ConcurrentHashMultiset<E> create(java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r1) {
            com.google.common.collect.ConcurrentHashMultiset r0 = new com.google.common.collect.ConcurrentHashMultiset
            r0.<init>(r1)
            return r0
    }

    private void readObject(java.io.ObjectInputStream r2) throws java.io.IOException, java.lang.ClassNotFoundException {
            r1 = this;
            r2.defaultReadObject()
            java.lang.Object r2 = r2.readObject()
            java.util.concurrent.ConcurrentMap r2 = (java.util.concurrent.ConcurrentMap) r2
            com.google.common.collect.Serialization$FieldSetter<com.google.common.collect.ConcurrentHashMultiset> r0 = com.google.common.collect.ConcurrentHashMultiset.FieldSettersHolder.COUNT_MAP_FIELD_SETTER
            r0.set(r1, r2)
            return
    }

    private java.util.List<E> snapshot() {
            r4 = this;
            int r0 = r4.size()
            java.util.ArrayList r0 = com.google.common.collect.Lists.newArrayListWithExpectedSize(r0)
            java.util.Set r1 = r4.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L10:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r1.next()
            com.google.common.collect.Multiset$Entry r2 = (com.google.common.collect.Multiset.Entry) r2
            java.lang.Object r3 = r2.getElement()
            int r2 = r2.getCount()
        L24:
            if (r2 <= 0) goto L10
            r0.add(r3)
            int r2 = r2 + (-1)
            goto L24
        L2c:
            return r0
    }

    private void writeObject(java.io.ObjectOutputStream r2) throws java.io.IOException {
            r1 = this;
            r2.defaultWriteObject()
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r0 = r1.countMap
            r2.writeObject(r0)
            return
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public int add(E r5, int r6) {
            r4 = this;
            com.google.common.base.Preconditions.checkNotNull(r5)
            if (r6 != 0) goto La
            int r5 = r4.count(r5)
            return r5
        La:
            java.lang.String r0 = "occurrences"
            com.google.common.collect.CollectPreconditions.checkPositive(r6, r0)
        Lf:
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r0 = r4.countMap
            java.lang.Object r0 = com.google.common.collect.Maps.safeGet(r0, r5)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            r1 = 0
            if (r0 != 0) goto L2a
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r0 = r4.countMap
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>(r6)
            java.lang.Object r0 = r0.putIfAbsent(r5, r2)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            if (r0 != 0) goto L2a
            return r1
        L2a:
            int r2 = r0.get()
            if (r2 == 0) goto L5c
            int r3 = com.google.common.math.IntMath.checkedAdd(r2, r6)     // Catch: java.lang.ArithmeticException -> L3b
            boolean r3 = r0.compareAndSet(r2, r3)     // Catch: java.lang.ArithmeticException -> L3b
            if (r3 == 0) goto L2a
            return r2
        L3b:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r0 = 65
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Overflow adding "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r6 = " occurrences to a count of "
            r1.append(r6)
            r1.append(r2)
            java.lang.String r6 = r1.toString()
            r5.<init>(r6)
            throw r5
        L5c:
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>(r6)
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r3 = r4.countMap
            java.lang.Object r3 = r3.putIfAbsent(r5, r2)
            if (r3 == 0) goto L71
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r3 = r4.countMap
            boolean r0 = r3.replace(r5, r0, r2)
            if (r0 == 0) goto Lf
        L71:
            return r1
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public void clear() {
            r1 = this;
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r0 = r1.countMap
            r0.clear()
            return
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ boolean contains(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.contains(r1)
            return r1
    }

    @Override // com.google.common.collect.Multiset
    public int count(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r0 = r1.countMap
            java.lang.Object r2 = com.google.common.collect.Maps.safeGet(r0, r2)
            java.util.concurrent.atomic.AtomicInteger r2 = (java.util.concurrent.atomic.AtomicInteger) r2
            if (r2 != 0) goto Lc
            r2 = 0
            goto L10
        Lc:
            int r2 = r2.get()
        L10:
            return r2
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final java.util.Set<E> createElementSet() {
            r2 = this;
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r0 = r2.countMap
            java.util.Set r0 = r0.keySet()
            com.google.common.collect.ConcurrentHashMultiset$1 r1 = new com.google.common.collect.ConcurrentHashMultiset$1
            r1.<init>(r0)
            return r1
    }

    @Override // com.google.common.collect.AbstractMultiset
    @java.lang.Deprecated
    public java.util.Set<com.google.common.collect.Multiset.Entry<E>> createEntrySet() {
            r2 = this;
            com.google.common.collect.ConcurrentHashMultiset$EntrySet r0 = new com.google.common.collect.ConcurrentHashMultiset$EntrySet
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final int distinctElements() {
            r1 = this;
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r0 = r1.countMap
            int r0 = r0.size()
            return r0
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final java.util.Iterator<E> elementIterator() {
            r2 = this;
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "should never be called"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ java.util.Set elementSet() {
            r1 = this;
            java.util.Set r0 = super.elementSet()
            return r0
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> entryIterator() {
            r2 = this;
            com.google.common.collect.ConcurrentHashMultiset$2 r0 = new com.google.common.collect.ConcurrentHashMultiset$2
            r0.<init>(r2)
            com.google.common.collect.ConcurrentHashMultiset$3 r1 = new com.google.common.collect.ConcurrentHashMultiset$3
            r1.<init>(r2, r0)
            return r1
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ java.util.Set entrySet() {
            r1 = this;
            java.util.Set r0 = super.entrySet()
            return r0
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r0 = r1.countMap
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public java.util.Iterator<E> iterator() {
            r1 = this;
            java.util.Iterator r0 = com.google.common.collect.Multisets.iteratorImpl(r1)
            return r0
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public int remove(@javax.annotation.CheckForNull java.lang.Object r6, int r7) {
            r5 = this;
            if (r7 != 0) goto L7
            int r6 = r5.count(r6)
            return r6
        L7:
            java.lang.String r0 = "occurrences"
            com.google.common.collect.CollectPreconditions.checkPositive(r7, r0)
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r0 = r5.countMap
            java.lang.Object r0 = com.google.common.collect.Maps.safeGet(r0, r6)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            r1 = 0
            if (r0 != 0) goto L18
            return r1
        L18:
            int r2 = r0.get()
            if (r2 == 0) goto L32
            int r3 = r2 - r7
            int r3 = java.lang.Math.max(r1, r3)
            boolean r4 = r0.compareAndSet(r2, r3)
            if (r4 == 0) goto L18
            if (r3 != 0) goto L31
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r7 = r5.countMap
            r7.remove(r6, r0)
        L31:
            return r2
        L32:
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean removeExactly(@javax.annotation.CheckForNull java.lang.Object r6, int r7) {
            r5 = this;
            r0 = 1
            if (r7 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "occurrences"
            com.google.common.collect.CollectPreconditions.checkPositive(r7, r1)
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r1 = r5.countMap
            java.lang.Object r1 = com.google.common.collect.Maps.safeGet(r1, r6)
            java.util.concurrent.atomic.AtomicInteger r1 = (java.util.concurrent.atomic.AtomicInteger) r1
            r2 = 0
            if (r1 != 0) goto L15
            return r2
        L15:
            int r3 = r1.get()
            if (r3 >= r7) goto L1c
            return r2
        L1c:
            int r4 = r3 - r7
            boolean r3 = r1.compareAndSet(r3, r4)
            if (r3 == 0) goto L15
            if (r4 != 0) goto L2b
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r7 = r5.countMap
            r7.remove(r6, r1)
        L2b:
            return r0
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public int setCount(E r5, int r6) {
            r4 = this;
            com.google.common.base.Preconditions.checkNotNull(r5)
            java.lang.String r0 = "count"
            com.google.common.collect.CollectPreconditions.checkNonnegative(r6, r0)
        L8:
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r0 = r4.countMap
            java.lang.Object r0 = com.google.common.collect.Maps.safeGet(r0, r5)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            r1 = 0
            if (r0 != 0) goto L26
            if (r6 != 0) goto L16
            return r1
        L16:
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r0 = r4.countMap
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>(r6)
            java.lang.Object r0 = r0.putIfAbsent(r5, r2)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            if (r0 != 0) goto L26
            return r1
        L26:
            int r2 = r0.get()
            if (r2 != 0) goto L45
            if (r6 != 0) goto L2f
            return r1
        L2f:
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>(r6)
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r3 = r4.countMap
            java.lang.Object r3 = r3.putIfAbsent(r5, r2)
            if (r3 == 0) goto L44
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r3 = r4.countMap
            boolean r0 = r3.replace(r5, r0, r2)
            if (r0 == 0) goto L8
        L44:
            return r1
        L45:
            boolean r3 = r0.compareAndSet(r2, r6)
            if (r3 == 0) goto L26
            if (r6 != 0) goto L52
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r6 = r4.countMap
            r6.remove(r5, r0)
        L52:
            return r2
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean setCount(E r5, int r6, int r7) {
            r4 = this;
            com.google.common.base.Preconditions.checkNotNull(r5)
            java.lang.String r0 = "oldCount"
            com.google.common.collect.CollectPreconditions.checkNonnegative(r6, r0)
            java.lang.String r0 = "newCount"
            com.google.common.collect.CollectPreconditions.checkNonnegative(r7, r0)
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r0 = r4.countMap
            java.lang.Object r0 = com.google.common.collect.Maps.safeGet(r0, r5)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L2e
            if (r6 == 0) goto L1c
            return r1
        L1c:
            if (r7 != 0) goto L1f
            return r2
        L1f:
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r6 = r4.countMap
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>(r7)
            java.lang.Object r5 = r6.putIfAbsent(r5, r0)
            if (r5 != 0) goto L2d
            r1 = 1
        L2d:
            return r1
        L2e:
            int r3 = r0.get()
            if (r3 != r6) goto L63
            if (r3 != 0) goto L55
            if (r7 != 0) goto L3e
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r6 = r4.countMap
            r6.remove(r5, r0)
            return r2
        L3e:
            java.util.concurrent.atomic.AtomicInteger r6 = new java.util.concurrent.atomic.AtomicInteger
            r6.<init>(r7)
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r7 = r4.countMap
            java.lang.Object r7 = r7.putIfAbsent(r5, r6)
            if (r7 == 0) goto L53
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r7 = r4.countMap
            boolean r5 = r7.replace(r5, r0, r6)
            if (r5 == 0) goto L54
        L53:
            r1 = 1
        L54:
            return r1
        L55:
            boolean r6 = r0.compareAndSet(r3, r7)
            if (r6 == 0) goto L63
            if (r7 != 0) goto L62
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r6 = r4.countMap
            r6.remove(r5, r0)
        L62:
            return r2
        L63:
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
            r5 = this;
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r0 = r5.countMap
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        Lc:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L1f
            java.lang.Object r3 = r0.next()
            java.util.concurrent.atomic.AtomicInteger r3 = (java.util.concurrent.atomic.AtomicInteger) r3
            int r3 = r3.get()
            long r3 = (long) r3
            long r1 = r1 + r3
            goto Lc
        L1f:
            int r0 = com.google.common.primitives.Ints.saturatedCast(r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public java.lang.Object[] toArray() {
            r1 = this;
            java.util.List r0 = r1.snapshot()
            java.lang.Object[] r0 = r0.toArray()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public <T> T[] toArray(T[] r2) {
            r1 = this;
            java.util.List r0 = r1.snapshot()
            java.lang.Object[] r2 = r0.toArray(r2)
            return r2
    }
}
