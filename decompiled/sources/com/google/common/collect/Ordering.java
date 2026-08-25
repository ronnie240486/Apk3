package com.google.common.collect;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class Ordering<T> implements java.util.Comparator<T> {

    /* JADX INFO: loaded from: classes.dex */
    @com.google.common.annotations.VisibleForTesting
    public static class ArbitraryOrdering extends com.google.common.collect.Ordering<java.lang.Object> {
        private final java.util.concurrent.atomic.AtomicInteger counter;
        private final java.util.concurrent.ConcurrentMap<java.lang.Object, java.lang.Integer> uids;

        public ArbitraryOrdering() {
                r2 = this;
                r2.<init>()
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r1 = 0
                r0.<init>(r1)
                r2.counter = r0
                com.google.common.collect.MapMaker r0 = new com.google.common.collect.MapMaker
                r0.<init>()
                com.google.common.collect.MapMaker r0 = r0.weakKeys()
                java.util.concurrent.ConcurrentMap r0 = r0.makeMap()
                r2.uids = r0
                return
        }

        private java.lang.Integer getUid(java.lang.Object r3) {
                r2 = this;
                java.util.concurrent.ConcurrentMap<java.lang.Object, java.lang.Integer> r0 = r2.uids
                java.lang.Object r0 = r0.get(r3)
                java.lang.Integer r0 = (java.lang.Integer) r0
                if (r0 != 0) goto L1f
                java.util.concurrent.atomic.AtomicInteger r0 = r2.counter
                int r0 = r0.getAndIncrement()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.util.concurrent.ConcurrentMap<java.lang.Object, java.lang.Integer> r1 = r2.uids
                java.lang.Object r3 = r1.putIfAbsent(r3, r0)
                java.lang.Integer r3 = (java.lang.Integer) r3
                if (r3 == 0) goto L1f
                r0 = r3
            L1f:
                return r0
        }

        @Override // com.google.common.collect.Ordering, java.util.Comparator
        public int compare(@javax.annotation.CheckForNull java.lang.Object r5, @javax.annotation.CheckForNull java.lang.Object r6) {
                r4 = this;
                if (r5 != r6) goto L4
                r5 = 0
                return r5
            L4:
                r0 = -1
                if (r5 != 0) goto L8
                return r0
            L8:
                r1 = 1
                if (r6 != 0) goto Lc
                return r1
            Lc:
                int r2 = java.lang.System.identityHashCode(r5)
                int r3 = java.lang.System.identityHashCode(r6)
                if (r2 == r3) goto L1b
                if (r2 >= r3) goto L19
                goto L1a
            L19:
                r0 = 1
            L1a:
                return r0
            L1b:
                java.lang.Integer r5 = r4.getUid(r5)
                java.lang.Integer r6 = r4.getUid(r6)
                int r5 = r5.compareTo(r6)
                if (r5 == 0) goto L2a
                return r5
            L2a:
                java.lang.AssertionError r5 = new java.lang.AssertionError
                r5.<init>()
                throw r5
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "Ordering.arbitrary()"
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class ArbitraryOrderingHolder {
        public static final com.google.common.collect.Ordering<java.lang.Object> ARBITRARY_ORDERING = null;

        static {
                com.google.common.collect.Ordering$ArbitraryOrdering r0 = new com.google.common.collect.Ordering$ArbitraryOrdering
                r0.<init>()
                com.google.common.collect.Ordering.ArbitraryOrderingHolder.ARBITRARY_ORDERING = r0
                return
        }

        private ArbitraryOrderingHolder() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @com.google.common.annotations.VisibleForTesting
    public static class IncomparableValueException extends java.lang.ClassCastException {
        private static final long serialVersionUID = 0;
        public final java.lang.Object value;

        public IncomparableValueException(java.lang.Object r4) {
                r3 = this;
                java.lang.String r0 = java.lang.String.valueOf(r4)
                int r1 = r0.length()
                int r1 = r1 + 22
                java.lang.String r2 = "Cannot compare value: "
                java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r0)
                r3.<init>(r0)
                r3.value = r4
                return
        }
    }

    public Ordering() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.common.annotations.GwtCompatible(serializable = true)
    public static com.google.common.collect.Ordering<java.lang.Object> allEqual() {
            com.google.common.collect.AllEqualOrdering r0 = com.google.common.collect.AllEqualOrdering.INSTANCE
            return r0
    }

    public static com.google.common.collect.Ordering<java.lang.Object> arbitrary() {
            com.google.common.collect.Ordering<java.lang.Object> r0 = com.google.common.collect.Ordering.ArbitraryOrderingHolder.ARBITRARY_ORDERING
            return r0
    }

    @com.google.common.annotations.GwtCompatible(serializable = true)
    public static <T> com.google.common.collect.Ordering<T> compound(java.lang.Iterable<? extends java.util.Comparator<? super T>> r1) {
            com.google.common.collect.CompoundOrdering r0 = new com.google.common.collect.CompoundOrdering
            r0.<init>(r1)
            return r0
    }

    @com.google.common.annotations.GwtCompatible(serializable = true)
    public static <T> com.google.common.collect.Ordering<T> explicit(T r0, T... r1) {
            java.util.List r0 = com.google.common.collect.Lists.asList(r0, r1)
            com.google.common.collect.Ordering r0 = explicit(r0)
            return r0
    }

    @com.google.common.annotations.GwtCompatible(serializable = true)
    public static <T> com.google.common.collect.Ordering<T> explicit(java.util.List<T> r1) {
            com.google.common.collect.ExplicitOrdering r0 = new com.google.common.collect.ExplicitOrdering
            r0.<init>(r1)
            return r0
    }

    @com.google.common.annotations.GwtCompatible(serializable = true)
    @java.lang.Deprecated
    public static <T> com.google.common.collect.Ordering<T> from(com.google.common.collect.Ordering<T> r0) {
            java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r0)
            com.google.common.collect.Ordering r0 = (com.google.common.collect.Ordering) r0
            return r0
    }

    @com.google.common.annotations.GwtCompatible(serializable = true)
    public static <T> com.google.common.collect.Ordering<T> from(java.util.Comparator<T> r1) {
            boolean r0 = r1 instanceof com.google.common.collect.Ordering
            if (r0 == 0) goto L7
            com.google.common.collect.Ordering r1 = (com.google.common.collect.Ordering) r1
            goto Ld
        L7:
            com.google.common.collect.ComparatorOrdering r0 = new com.google.common.collect.ComparatorOrdering
            r0.<init>(r1)
            r1 = r0
        Ld:
            return r1
    }

    @com.google.common.annotations.GwtCompatible(serializable = true)
    public static <C extends java.lang.Comparable> com.google.common.collect.Ordering<C> natural() {
            com.google.common.collect.NaturalOrdering r0 = com.google.common.collect.NaturalOrdering.INSTANCE
            return r0
    }

    @com.google.common.annotations.GwtCompatible(serializable = true)
    public static com.google.common.collect.Ordering<java.lang.Object> usingToString() {
            com.google.common.collect.UsingToStringOrdering r0 = com.google.common.collect.UsingToStringOrdering.INSTANCE
            return r0
    }

    @java.lang.Deprecated
    public int binarySearch(java.util.List<? extends T> r1, @com.google.common.collect.ParametricNullness T r2) {
            r0 = this;
            int r1 = java.util.Collections.binarySearch(r1, r2, r0)
            return r1
    }

    @Override // java.util.Comparator
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public abstract int compare(@com.google.common.collect.ParametricNullness T r1, @com.google.common.collect.ParametricNullness T r2);

    @com.google.common.annotations.GwtCompatible(serializable = true)
    public <U extends T> com.google.common.collect.Ordering<U> compound(java.util.Comparator<? super U> r2) {
            r1 = this;
            com.google.common.collect.CompoundOrdering r0 = new com.google.common.collect.CompoundOrdering
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            java.util.Comparator r2 = (java.util.Comparator) r2
            r0.<init>(r1, r2)
            return r0
    }

    public <E extends T> java.util.List<E> greatestOf(java.lang.Iterable<E> r2, int r3) {
            r1 = this;
            com.google.common.collect.Ordering r0 = r1.reverse()
            java.util.List r2 = r0.leastOf(r2, r3)
            return r2
    }

    public <E extends T> java.util.List<E> greatestOf(java.util.Iterator<E> r2, int r3) {
            r1 = this;
            com.google.common.collect.Ordering r0 = r1.reverse()
            java.util.List r2 = r0.leastOf(r2, r3)
            return r2
    }

    public <E extends T> com.google.common.collect.ImmutableList<E> immutableSortedCopy(java.lang.Iterable<E> r1) {
            r0 = this;
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.sortedCopyOf(r0, r1)
            return r1
    }

    public boolean isOrdered(java.lang.Iterable<? extends T> r3) {
            r2 = this;
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r3.next()
        Le:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r3.next()
            int r0 = r2.compare(r0, r1)
            if (r0 <= 0) goto L20
            r3 = 0
            return r3
        L20:
            r0 = r1
            goto Le
        L22:
            r3 = 1
            return r3
    }

    public boolean isStrictlyOrdered(java.lang.Iterable<? extends T> r3) {
            r2 = this;
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r3.next()
        Le:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r3.next()
            int r0 = r2.compare(r0, r1)
            if (r0 < 0) goto L20
            r3 = 0
            return r3
        L20:
            r0 = r1
            goto Le
        L22:
            r3 = 1
            return r3
    }

    public <E extends T> java.util.List<E> leastOf(java.lang.Iterable<E> r8, int r9) {
            r7 = this;
            boolean r0 = r8 instanceof java.util.Collection
            if (r0 == 0) goto L2c
            r0 = r8
            java.util.Collection r0 = (java.util.Collection) r0
            int r1 = r0.size()
            long r1 = (long) r1
            r3 = 2
            long r5 = (long) r9
            long r5 = r5 * r3
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 > 0) goto L2c
            java.lang.Object[] r8 = r0.toArray()
            java.util.Arrays.sort(r8, r7)
            int r0 = r8.length
            if (r0 <= r9) goto L23
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r9)
        L23:
            java.util.List r8 = java.util.Arrays.asList(r8)
            java.util.List r8 = java.util.Collections.unmodifiableList(r8)
            return r8
        L2c:
            java.util.Iterator r8 = r8.iterator()
            java.util.List r8 = r7.leastOf(r8, r9)
            return r8
    }

    public <E extends T> java.util.List<E> leastOf(java.util.Iterator<E> r2, int r3) {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r2)
            java.lang.String r0 = "k"
            com.google.common.collect.CollectPreconditions.checkNonnegative(r3, r0)
            if (r3 == 0) goto L42
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto L11
            goto L42
        L11:
            r0 = 1073741823(0x3fffffff, float:1.9999999)
            if (r3 < r0) goto L36
            java.util.ArrayList r2 = com.google.common.collect.Lists.newArrayList(r2)
            java.util.Collections.sort(r2, r1)
            int r0 = r2.size()
            if (r0 <= r3) goto L2e
            int r0 = r2.size()
            java.util.List r3 = r2.subList(r3, r0)
            r3.clear()
        L2e:
            r2.trimToSize()
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            return r2
        L36:
            com.google.common.collect.TopKSelector r3 = com.google.common.collect.TopKSelector.least(r3, r1)
            r3.offerAll(r2)
            java.util.List r2 = r3.topK()
            return r2
        L42:
            java.util.List r2 = java.util.Collections.emptyList()
            return r2
    }

    @com.google.common.annotations.GwtCompatible(serializable = true)
    public <S extends T> com.google.common.collect.Ordering<java.lang.Iterable<S>> lexicographical() {
            r1 = this;
            com.google.common.collect.LexicographicalOrdering r0 = new com.google.common.collect.LexicographicalOrdering
            r0.<init>(r1)
            return r0
    }

    @com.google.common.collect.ParametricNullness
    public <E extends T> E max(java.lang.Iterable<E> r1) {
            r0 = this;
            java.util.Iterator r1 = r1.iterator()
            java.lang.Object r1 = r0.max(r1)
            return r1
    }

    @com.google.common.collect.ParametricNullness
    public <E extends T> E max(@com.google.common.collect.ParametricNullness E r2, @com.google.common.collect.ParametricNullness E r3) {
            r1 = this;
            int r0 = r1.compare(r2, r3)
            if (r0 < 0) goto L7
            goto L8
        L7:
            r2 = r3
        L8:
            return r2
    }

    @com.google.common.collect.ParametricNullness
    public <E extends T> E max(@com.google.common.collect.ParametricNullness E r2, @com.google.common.collect.ParametricNullness E r3, @com.google.common.collect.ParametricNullness E r4, E... r5) {
            r1 = this;
            java.lang.Object r2 = r1.max(r2, r3)
            java.lang.Object r2 = r1.max(r2, r4)
            int r3 = r5.length
            r4 = 0
        La:
            if (r4 >= r3) goto L15
            r0 = r5[r4]
            java.lang.Object r2 = r1.max(r2, r0)
            int r4 = r4 + 1
            goto La
        L15:
            return r2
    }

    @com.google.common.collect.ParametricNullness
    public <E extends T> E max(java.util.Iterator<E> r3) {
            r2 = this;
            java.lang.Object r0 = r3.next()
        L4:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L13
            java.lang.Object r1 = r3.next()
            java.lang.Object r0 = r2.max(r0, r1)
            goto L4
        L13:
            return r0
    }

    @com.google.common.collect.ParametricNullness
    public <E extends T> E min(java.lang.Iterable<E> r1) {
            r0 = this;
            java.util.Iterator r1 = r1.iterator()
            java.lang.Object r1 = r0.min(r1)
            return r1
    }

    @com.google.common.collect.ParametricNullness
    public <E extends T> E min(@com.google.common.collect.ParametricNullness E r2, @com.google.common.collect.ParametricNullness E r3) {
            r1 = this;
            int r0 = r1.compare(r2, r3)
            if (r0 > 0) goto L7
            goto L8
        L7:
            r2 = r3
        L8:
            return r2
    }

    @com.google.common.collect.ParametricNullness
    public <E extends T> E min(@com.google.common.collect.ParametricNullness E r2, @com.google.common.collect.ParametricNullness E r3, @com.google.common.collect.ParametricNullness E r4, E... r5) {
            r1 = this;
            java.lang.Object r2 = r1.min(r2, r3)
            java.lang.Object r2 = r1.min(r2, r4)
            int r3 = r5.length
            r4 = 0
        La:
            if (r4 >= r3) goto L15
            r0 = r5[r4]
            java.lang.Object r2 = r1.min(r2, r0)
            int r4 = r4 + 1
            goto La
        L15:
            return r2
    }

    @com.google.common.collect.ParametricNullness
    public <E extends T> E min(java.util.Iterator<E> r3) {
            r2 = this;
            java.lang.Object r0 = r3.next()
        L4:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L13
            java.lang.Object r1 = r3.next()
            java.lang.Object r0 = r2.min(r0, r1)
            goto L4
        L13:
            return r0
    }

    @com.google.common.annotations.GwtCompatible(serializable = true)
    public <S extends T> com.google.common.collect.Ordering<S> nullsFirst() {
            r1 = this;
            com.google.common.collect.NullsFirstOrdering r0 = new com.google.common.collect.NullsFirstOrdering
            r0.<init>(r1)
            return r0
    }

    @com.google.common.annotations.GwtCompatible(serializable = true)
    public <S extends T> com.google.common.collect.Ordering<S> nullsLast() {
            r1 = this;
            com.google.common.collect.NullsLastOrdering r0 = new com.google.common.collect.NullsLastOrdering
            r0.<init>(r1)
            return r0
    }

    public final <T2 extends T> com.google.common.collect.Ordering<java.util.Map.Entry<T2, ?>> onKeys() {
            r1 = this;
            com.google.common.collect.Maps$EntryFunction r0 = com.google.common.collect.Maps.EntryFunction.KEY
            com.google.common.collect.Ordering r0 = r1.onResultOf(r0)
            return r0
    }

    @com.google.common.annotations.GwtCompatible(serializable = true)
    public <F> com.google.common.collect.Ordering<F> onResultOf(com.google.common.base.Function<F, ? extends T> r2) {
            r1 = this;
            com.google.common.collect.ByFunctionOrdering r0 = new com.google.common.collect.ByFunctionOrdering
            r0.<init>(r2, r1)
            return r0
    }

    @com.google.common.annotations.GwtCompatible(serializable = true)
    public <S extends T> com.google.common.collect.Ordering<S> reverse() {
            r1 = this;
            com.google.common.collect.ReverseOrdering r0 = new com.google.common.collect.ReverseOrdering
            r0.<init>(r1)
            return r0
    }

    public <E extends T> java.util.List<E> sortedCopy(java.lang.Iterable<E> r1) {
            r0 = this;
            java.lang.Object[] r1 = com.google.common.collect.Iterables.toArray(r1)
            java.util.Arrays.sort(r1, r0)
            java.util.List r1 = java.util.Arrays.asList(r1)
            java.util.ArrayList r1 = com.google.common.collect.Lists.newArrayList(r1)
            return r1
    }
}
