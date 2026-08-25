package com.google.common.collect;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.annotations.GwtCompatible(emulated = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class Iterables {


    /* JADX INFO: renamed from: com.google.common.collect.Iterables$10, reason: invalid class name */
    class AnonymousClass10 implements com.google.common.base.Function<java.lang.Iterable<java.lang.Object>, java.util.Iterator<java.lang.Object>> {
        public AnonymousClass10() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.base.Function
        public /* bridge */ /* synthetic */ java.util.Iterator<java.lang.Object> apply(java.lang.Iterable<java.lang.Object> r1) {
                r0 = this;
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Iterator r1 = r0.apply2(r1)
                return r1
        }

        /* JADX INFO: renamed from: apply, reason: avoid collision after fix types in other method */
        public java.util.Iterator<java.lang.Object> apply2(java.lang.Iterable<java.lang.Object> r1) {
                r0 = this;
                java.util.Iterator r1 = r1.iterator()
                return r1
        }
    }









    /* JADX INFO: loaded from: classes.dex */
    public static final class UnmodifiableIterable<T> extends com.google.common.collect.FluentIterable<T> {
        private final java.lang.Iterable<? extends T> iterable;

        private UnmodifiableIterable(java.lang.Iterable<? extends T> r1) {
                r0 = this;
                r0.<init>()
                r0.iterable = r1
                return
        }

        public /* synthetic */ UnmodifiableIterable(java.lang.Iterable r1, com.google.common.collect.Iterables.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.lang.Iterable
        public java.util.Iterator<T> iterator() {
                r1 = this;
                java.lang.Iterable<? extends T> r0 = r1.iterable
                java.util.Iterator r0 = r0.iterator()
                com.google.common.collect.UnmodifiableIterator r0 = com.google.common.collect.Iterators.unmodifiableIterator(r0)
                return r0
        }

        @Override // com.google.common.collect.FluentIterable
        public java.lang.String toString() {
                r1 = this;
                java.lang.Iterable<? extends T> r0 = r1.iterable
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    private Iterables() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static <T> boolean addAll(java.util.Collection<T> r1, java.lang.Iterable<? extends T> r2) {
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto Lb
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r1 = r1.addAll(r2)
            return r1
        Lb:
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
            boolean r1 = com.google.common.collect.Iterators.addAll(r1, r2)
            return r1
    }

    public static <T> boolean all(java.lang.Iterable<T> r0, com.google.common.base.Predicate<? super T> r1) {
            java.util.Iterator r0 = r0.iterator()
            boolean r0 = com.google.common.collect.Iterators.all(r0, r1)
            return r0
    }

    public static <T> boolean any(java.lang.Iterable<T> r0, com.google.common.base.Predicate<? super T> r1) {
            java.util.Iterator r0 = r0.iterator()
            boolean r0 = com.google.common.collect.Iterators.any(r0, r1)
            return r0
    }

    private static <E> java.util.Collection<E> castOrCopyToCollection(java.lang.Iterable<E> r1) {
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L7
            java.util.Collection r1 = (java.util.Collection) r1
            goto Lf
        L7:
            java.util.Iterator r1 = r1.iterator()
            java.util.ArrayList r1 = com.google.common.collect.Lists.newArrayList(r1)
        Lf:
            return r1
    }

    public static <T> java.lang.Iterable<T> concat(java.lang.Iterable<? extends java.lang.Iterable<? extends T>> r0) {
            com.google.common.collect.FluentIterable r0 = com.google.common.collect.FluentIterable.concat(r0)
            return r0
    }

    public static <T> java.lang.Iterable<T> concat(java.lang.Iterable<? extends T> r0, java.lang.Iterable<? extends T> r1) {
            com.google.common.collect.FluentIterable r0 = com.google.common.collect.FluentIterable.concat(r0, r1)
            return r0
    }

    public static <T> java.lang.Iterable<T> concat(java.lang.Iterable<? extends T> r0, java.lang.Iterable<? extends T> r1, java.lang.Iterable<? extends T> r2) {
            com.google.common.collect.FluentIterable r0 = com.google.common.collect.FluentIterable.concat(r0, r1, r2)
            return r0
    }

    public static <T> java.lang.Iterable<T> concat(java.lang.Iterable<? extends T> r0, java.lang.Iterable<? extends T> r1, java.lang.Iterable<? extends T> r2, java.lang.Iterable<? extends T> r3) {
            com.google.common.collect.FluentIterable r0 = com.google.common.collect.FluentIterable.concat(r0, r1, r2, r3)
            return r0
    }

    @java.lang.SafeVarargs
    public static <T> java.lang.Iterable<T> concat(java.lang.Iterable<? extends T>... r0) {
            com.google.common.collect.FluentIterable r0 = com.google.common.collect.FluentIterable.concat(r0)
            return r0
    }

    public static <T> java.lang.Iterable<T> consumingIterable(java.lang.Iterable<T> r1) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.collect.Iterables$8 r0 = new com.google.common.collect.Iterables$8
            r0.<init>(r1)
            return r0
    }

    public static boolean contains(java.lang.Iterable<? extends java.lang.Object> r1, @javax.annotation.CheckForNull java.lang.Object r2) {
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto Lb
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = com.google.common.collect.Collections2.safeContains(r1, r2)
            return r1
        Lb:
            java.util.Iterator r1 = r1.iterator()
            boolean r1 = com.google.common.collect.Iterators.contains(r1, r2)
            return r1
    }

    public static <T> java.lang.Iterable<T> cycle(java.lang.Iterable<T> r1) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.collect.Iterables$1 r0 = new com.google.common.collect.Iterables$1
            r0.<init>(r1)
            return r0
    }

    @java.lang.SafeVarargs
    public static <T> java.lang.Iterable<T> cycle(T... r0) {
            java.util.ArrayList r0 = com.google.common.collect.Lists.newArrayList(r0)
            java.lang.Iterable r0 = cycle(r0)
            return r0
    }

    public static boolean elementsEqual(java.lang.Iterable<?> r2, java.lang.Iterable<?> r3) {
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L1a
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L1a
            r0 = r2
            java.util.Collection r0 = (java.util.Collection) r0
            r1 = r3
            java.util.Collection r1 = (java.util.Collection) r1
            int r0 = r0.size()
            int r1 = r1.size()
            if (r0 == r1) goto L1a
            r2 = 0
            return r2
        L1a:
            java.util.Iterator r2 = r2.iterator()
            java.util.Iterator r3 = r3.iterator()
            boolean r2 = com.google.common.collect.Iterators.elementsEqual(r2, r3)
            return r2
    }

    public static <T> java.lang.Iterable<T> filter(java.lang.Iterable<T> r1, com.google.common.base.Predicate<? super T> r2) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.collect.Iterables$4 r0 = new com.google.common.collect.Iterables$4
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static <T> java.lang.Iterable<T> filter(java.lang.Iterable<?> r0, java.lang.Class<T> r1) {
            com.google.common.base.Preconditions.checkNotNull(r0)
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Predicate r1 = com.google.common.base.Predicates.instanceOf(r1)
            java.lang.Iterable r0 = filter(r0, r1)
            return r0
    }

    @com.google.common.collect.ParametricNullness
    public static <T> T find(java.lang.Iterable<T> r0, com.google.common.base.Predicate<? super T> r1) {
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = com.google.common.collect.Iterators.find(r0, r1)
            return r0
    }

    @javax.annotation.CheckForNull
    public static <T> T find(java.lang.Iterable<? extends T> r0, com.google.common.base.Predicate<? super T> r1, @javax.annotation.CheckForNull T r2) {
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = com.google.common.collect.Iterators.find(r0, r1, r2)
            return r0
    }

    public static int frequency(java.lang.Iterable<?> r1, @javax.annotation.CheckForNull java.lang.Object r2) {
            boolean r0 = r1 instanceof com.google.common.collect.Multiset
            if (r0 == 0) goto Lb
            com.google.common.collect.Multiset r1 = (com.google.common.collect.Multiset) r1
            int r1 = r1.count(r2)
            return r1
        Lb:
            boolean r0 = r1 instanceof java.util.Set
            if (r0 == 0) goto L16
            java.util.Set r1 = (java.util.Set) r1
            boolean r1 = r1.contains(r2)
            return r1
        L16:
            java.util.Iterator r1 = r1.iterator()
            int r1 = com.google.common.collect.Iterators.frequency(r1, r2)
            return r1
    }

    @com.google.common.collect.ParametricNullness
    public static <T> T get(java.lang.Iterable<T> r1, int r2) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto Le
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r1.get(r2)
            goto L16
        Le:
            java.util.Iterator r1 = r1.iterator()
            java.lang.Object r1 = com.google.common.collect.Iterators.get(r1, r2)
        L16:
            return r1
    }

    @com.google.common.collect.ParametricNullness
    public static <T> T get(java.lang.Iterable<? extends T> r1, int r2, @com.google.common.collect.ParametricNullness T r3) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.collect.Iterators.checkNonnegative(r2)
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto L17
            java.util.List r1 = (java.util.List) r1
            int r0 = r1.size()
            if (r2 >= r0) goto L16
            java.lang.Object r3 = r1.get(r2)
        L16:
            return r3
        L17:
            java.util.Iterator r1 = r1.iterator()
            com.google.common.collect.Iterators.advance(r1, r2)
            java.lang.Object r1 = com.google.common.collect.Iterators.getNext(r1, r3)
            return r1
    }

    @com.google.common.collect.ParametricNullness
    public static <T> T getFirst(java.lang.Iterable<? extends T> r0, @com.google.common.collect.ParametricNullness T r1) {
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = com.google.common.collect.Iterators.getNext(r0, r1)
            return r0
    }

    @com.google.common.collect.ParametricNullness
    public static <T> T getLast(java.lang.Iterable<T> r1) {
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto L17
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L11
            java.lang.Object r1 = getLastInNonemptyList(r1)
            return r1
        L11:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            r1.<init>()
            throw r1
        L17:
            java.util.Iterator r1 = r1.iterator()
            java.lang.Object r1 = com.google.common.collect.Iterators.getLast(r1)
            return r1
    }

    @com.google.common.collect.ParametricNullness
    public static <T> T getLast(java.lang.Iterable<? extends T> r1, @com.google.common.collect.ParametricNullness T r2) {
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L19
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Le
            return r2
        Le:
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto L19
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = getLastInNonemptyList(r1)
            return r1
        L19:
            java.util.Iterator r1 = r1.iterator()
            java.lang.Object r1 = com.google.common.collect.Iterators.getLast(r1, r2)
            return r1
    }

    @com.google.common.collect.ParametricNullness
    private static <T> T getLastInNonemptyList(java.util.List<T> r1) {
            int r0 = r1.size()
            int r0 = r0 + (-1)
            java.lang.Object r1 = r1.get(r0)
            return r1
    }

    @com.google.common.collect.ParametricNullness
    public static <T> T getOnlyElement(java.lang.Iterable<T> r0) {
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = com.google.common.collect.Iterators.getOnlyElement(r0)
            return r0
    }

    @com.google.common.collect.ParametricNullness
    public static <T> T getOnlyElement(java.lang.Iterable<? extends T> r0, @com.google.common.collect.ParametricNullness T r1) {
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = com.google.common.collect.Iterators.getOnlyElement(r0, r1)
            return r0
    }

    public static <T> int indexOf(java.lang.Iterable<T> r0, com.google.common.base.Predicate<? super T> r1) {
            java.util.Iterator r0 = r0.iterator()
            int r0 = com.google.common.collect.Iterators.indexOf(r0, r1)
            return r0
    }

    public static boolean isEmpty(java.lang.Iterable<?> r1) {
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto Lb
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            return r1
        Lb:
            java.util.Iterator r1 = r1.iterator()
            boolean r1 = r1.hasNext()
            r1 = r1 ^ 1
            return r1
    }

    public static <T> java.lang.Iterable<T> limit(java.lang.Iterable<T> r2, int r3) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            if (r3 < 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            java.lang.String r1 = "limit is negative"
            com.google.common.base.Preconditions.checkArgument(r0, r1)
            com.google.common.collect.Iterables$7 r0 = new com.google.common.collect.Iterables$7
            r0.<init>(r2, r3)
            return r0
    }

    @com.google.common.annotations.Beta
    public static <T> java.lang.Iterable<T> mergeSorted(java.lang.Iterable<? extends java.lang.Iterable<? extends T>> r1, java.util.Comparator<? super T> r2) {
            java.lang.String r0 = "iterables"
            com.google.common.base.Preconditions.checkNotNull(r1, r0)
            java.lang.String r0 = "comparator"
            com.google.common.base.Preconditions.checkNotNull(r2, r0)
            com.google.common.collect.Iterables$9 r0 = new com.google.common.collect.Iterables$9
            r0.<init>(r1, r2)
            com.google.common.collect.Iterables$UnmodifiableIterable r1 = new com.google.common.collect.Iterables$UnmodifiableIterable
            r2 = 0
            r1.<init>(r0, r2)
            return r1
    }

    public static <T> java.lang.Iterable<java.util.List<T>> paddedPartition(java.lang.Iterable<T> r1, int r2) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            if (r2 <= 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            com.google.common.base.Preconditions.checkArgument(r0)
            com.google.common.collect.Iterables$3 r0 = new com.google.common.collect.Iterables$3
            r0.<init>(r1, r2)
            return r0
    }

    public static <T> java.lang.Iterable<java.util.List<T>> partition(java.lang.Iterable<T> r1, int r2) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            if (r2 <= 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            com.google.common.base.Preconditions.checkArgument(r0)
            com.google.common.collect.Iterables$2 r0 = new com.google.common.collect.Iterables$2
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static boolean removeAll(java.lang.Iterable<?> r1, java.util.Collection<?> r2) {
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L11
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r1 = r1.removeAll(r2)
            goto L19
        L11:
            java.util.Iterator r1 = r1.iterator()
            boolean r1 = com.google.common.collect.Iterators.removeAll(r1, r2)
        L19:
            return r1
    }

    @javax.annotation.CheckForNull
    public static <T> T removeFirstMatching(java.lang.Iterable<T> r2, com.google.common.base.Predicate<? super T> r3) {
            com.google.common.base.Preconditions.checkNotNull(r3)
            java.util.Iterator r2 = r2.iterator()
        L7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1b
            java.lang.Object r0 = r2.next()
            boolean r1 = r3.apply(r0)
            if (r1 == 0) goto L7
            r2.remove()
            return r0
        L1b:
            r2 = 0
            return r2
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static <T> boolean removeIf(java.lang.Iterable<T> r1, com.google.common.base.Predicate<? super T> r2) {
            boolean r0 = r1 instanceof java.util.RandomAccess
            if (r0 == 0) goto L15
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto L15
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.base.Predicate r2 = (com.google.common.base.Predicate) r2
            boolean r1 = removeIfFromRandomAccessList(r1, r2)
            return r1
        L15:
            java.util.Iterator r1 = r1.iterator()
            boolean r1 = com.google.common.collect.Iterators.removeIf(r1, r2)
            return r1
    }

    private static <T> boolean removeIfFromRandomAccessList(java.util.List<T> r6, com.google.common.base.Predicate<? super T> r7) {
            r0 = 0
            r1 = 0
            r2 = 0
        L3:
            int r3 = r6.size()
            r4 = 1
            if (r1 >= r3) goto L27
            java.lang.Object r3 = r6.get(r1)
            boolean r5 = r7.apply(r3)
            if (r5 != 0) goto L24
            if (r1 <= r2) goto L22
            r6.set(r2, r3)     // Catch: java.lang.IllegalArgumentException -> L1a java.lang.UnsupportedOperationException -> L1e
            goto L22
        L1a:
            slowRemoveIfForRemainingElements(r6, r7, r2, r1)
            return r4
        L1e:
            slowRemoveIfForRemainingElements(r6, r7, r2, r1)
            return r4
        L22:
            int r2 = r2 + 1
        L24:
            int r1 = r1 + 1
            goto L3
        L27:
            int r7 = r6.size()
            java.util.List r6 = r6.subList(r2, r7)
            r6.clear()
            if (r1 == r2) goto L35
            r0 = 1
        L35:
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static boolean retainAll(java.lang.Iterable<?> r1, java.util.Collection<?> r2) {
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L11
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r1 = r1.retainAll(r2)
            goto L19
        L11:
            java.util.Iterator r1 = r1.iterator()
            boolean r1 = com.google.common.collect.Iterators.retainAll(r1, r2)
        L19:
            return r1
    }

    public static int size(java.lang.Iterable<?> r1) {
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto Lb
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            goto L13
        Lb:
            java.util.Iterator r1 = r1.iterator()
            int r1 = com.google.common.collect.Iterators.size(r1)
        L13:
            return r1
    }

    public static <T> java.lang.Iterable<T> skip(java.lang.Iterable<T> r2, int r3) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            if (r3 < 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            java.lang.String r1 = "number to skip cannot be negative"
            com.google.common.base.Preconditions.checkArgument(r0, r1)
            com.google.common.collect.Iterables$6 r0 = new com.google.common.collect.Iterables$6
            r0.<init>(r2, r3)
            return r0
    }

    private static <T> void slowRemoveIfForRemainingElements(java.util.List<T> r2, com.google.common.base.Predicate<? super T> r3, int r4, int r5) {
            int r0 = r2.size()
            int r0 = r0 + (-1)
        L6:
            if (r0 <= r5) goto L18
            java.lang.Object r1 = r2.get(r0)
            boolean r1 = r3.apply(r1)
            if (r1 == 0) goto L15
            r2.remove(r0)
        L15:
            int r0 = r0 + (-1)
            goto L6
        L18:
            int r5 = r5 + (-1)
        L1a:
            if (r5 < r4) goto L22
            r2.remove(r5)
            int r5 = r5 + (-1)
            goto L1a
        L22:
            return
    }

    public static java.lang.Object[] toArray(java.lang.Iterable<?> r0) {
            java.util.Collection r0 = castOrCopyToCollection(r0)
            java.lang.Object[] r0 = r0.toArray()
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static <T> T[] toArray(java.lang.Iterable<? extends T> r1, java.lang.Class<T> r2) {
            r0 = 0
            java.lang.Object[] r2 = com.google.common.collect.ObjectArrays.newArray(r2, r0)
            java.lang.Object[] r1 = toArray(r1, r2)
            return r1
    }

    public static <T> T[] toArray(java.lang.Iterable<? extends T> r0, T[] r1) {
            java.util.Collection r0 = castOrCopyToCollection(r0)
            java.lang.Object[] r0 = r0.toArray(r1)
            return r0
    }

    public static java.lang.String toString(java.lang.Iterable<?> r0) {
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r0 = com.google.common.collect.Iterators.toString(r0)
            return r0
    }

    public static <F, T> java.lang.Iterable<T> transform(java.lang.Iterable<F> r1, com.google.common.base.Function<? super F, ? extends T> r2) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.collect.Iterables$5 r0 = new com.google.common.collect.Iterables$5
            r0.<init>(r1, r2)
            return r0
    }

    public static <T> com.google.common.base.Optional<T> tryFind(java.lang.Iterable<T> r0, com.google.common.base.Predicate<? super T> r1) {
            java.util.Iterator r0 = r0.iterator()
            com.google.common.base.Optional r0 = com.google.common.collect.Iterators.tryFind(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static <E> java.lang.Iterable<E> unmodifiableIterable(com.google.common.collect.ImmutableCollection<E> r0) {
            java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            return r0
    }

    public static <T> java.lang.Iterable<T> unmodifiableIterable(java.lang.Iterable<? extends T> r2) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            boolean r0 = r2 instanceof com.google.common.collect.Iterables.UnmodifiableIterable
            if (r0 != 0) goto L13
            boolean r0 = r2 instanceof com.google.common.collect.ImmutableCollection
            if (r0 == 0) goto Lc
            goto L13
        Lc:
            com.google.common.collect.Iterables$UnmodifiableIterable r0 = new com.google.common.collect.Iterables$UnmodifiableIterable
            r1 = 0
            r0.<init>(r2, r1)
            return r0
        L13:
            return r2
    }
}
