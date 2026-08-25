package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible(emulated = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class FluentIterable<E> implements java.lang.Iterable<E> {
    private final com.google.common.base.Optional<java.lang.Iterable<E>> iterableDelegate;




    public static class FromIterableFunction<E> implements com.google.common.base.Function<java.lang.Iterable<E>, com.google.common.collect.FluentIterable<E>> {
        private FromIterableFunction() {
                r0 = this;
                r0.<init>()
                return
        }

        public com.google.common.collect.FluentIterable<E> apply(java.lang.Iterable<E> r1) {
                r0 = this;
                com.google.common.collect.FluentIterable r1 = com.google.common.collect.FluentIterable.from(r1)
                return r1
        }

        @Override // com.google.common.base.Function
        public /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r1) {
                r0 = this;
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                com.google.common.collect.FluentIterable r1 = r0.apply(r1)
                return r1
        }
    }

    public FluentIterable() {
            r1 = this;
            r1.<init>()
            com.google.common.base.Optional r0 = com.google.common.base.Optional.absent()
            r1.iterableDelegate = r0
            return
    }

    public FluentIterable(java.lang.Iterable<E> r1) {
            r0 = this;
            r0.<init>()
            com.google.common.base.Optional r1 = com.google.common.base.Optional.of(r1)
            r0.iterableDelegate = r1
            return
    }

    @com.google.common.annotations.Beta
    public static <T> com.google.common.collect.FluentIterable<T> concat(java.lang.Iterable<? extends java.lang.Iterable<? extends T>> r1) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.collect.FluentIterable$2 r0 = new com.google.common.collect.FluentIterable$2
            r0.<init>(r1)
            return r0
    }

    @com.google.common.annotations.Beta
    public static <T> com.google.common.collect.FluentIterable<T> concat(java.lang.Iterable<? extends T> r2, java.lang.Iterable<? extends T> r3) {
            r0 = 2
            java.lang.Iterable[] r0 = new java.lang.Iterable[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            com.google.common.collect.FluentIterable r2 = concatNoDefensiveCopy(r0)
            return r2
    }

    @com.google.common.annotations.Beta
    public static <T> com.google.common.collect.FluentIterable<T> concat(java.lang.Iterable<? extends T> r2, java.lang.Iterable<? extends T> r3, java.lang.Iterable<? extends T> r4) {
            r0 = 3
            java.lang.Iterable[] r0 = new java.lang.Iterable[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            com.google.common.collect.FluentIterable r2 = concatNoDefensiveCopy(r0)
            return r2
    }

    @com.google.common.annotations.Beta
    public static <T> com.google.common.collect.FluentIterable<T> concat(java.lang.Iterable<? extends T> r2, java.lang.Iterable<? extends T> r3, java.lang.Iterable<? extends T> r4, java.lang.Iterable<? extends T> r5) {
            r0 = 4
            java.lang.Iterable[] r0 = new java.lang.Iterable[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            r2 = 3
            r0[r2] = r5
            com.google.common.collect.FluentIterable r2 = concatNoDefensiveCopy(r0)
            return r2
    }

    @com.google.common.annotations.Beta
    public static <T> com.google.common.collect.FluentIterable<T> concat(java.lang.Iterable<? extends T>... r1) {
            int r0 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            java.lang.Iterable[] r1 = (java.lang.Iterable[]) r1
            com.google.common.collect.FluentIterable r1 = concatNoDefensiveCopy(r1)
            return r1
    }

    private static <T> com.google.common.collect.FluentIterable<T> concatNoDefensiveCopy(java.lang.Iterable<? extends T>... r3) {
            int r0 = r3.length
            r1 = 0
        L2:
            if (r1 >= r0) goto Lc
            r2 = r3[r1]
            com.google.common.base.Preconditions.checkNotNull(r2)
            int r1 = r1 + 1
            goto L2
        Lc:
            com.google.common.collect.FluentIterable$3 r0 = new com.google.common.collect.FluentIterable$3
            r0.<init>(r3)
            return r0
    }

    @com.google.errorprone.annotations.InlineMe(replacement = "checkNotNull(iterable)", staticImports = {"com.google.common.base.Preconditions.checkNotNull"})
    @java.lang.Deprecated
    public static <E> com.google.common.collect.FluentIterable<E> from(com.google.common.collect.FluentIterable<E> r0) {
            java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r0)
            com.google.common.collect.FluentIterable r0 = (com.google.common.collect.FluentIterable) r0
            return r0
    }

    public static <E> com.google.common.collect.FluentIterable<E> from(java.lang.Iterable<E> r1) {
            boolean r0 = r1 instanceof com.google.common.collect.FluentIterable
            if (r0 == 0) goto L7
            com.google.common.collect.FluentIterable r1 = (com.google.common.collect.FluentIterable) r1
            goto Ld
        L7:
            com.google.common.collect.FluentIterable$1 r0 = new com.google.common.collect.FluentIterable$1
            r0.<init>(r1, r1)
            r1 = r0
        Ld:
            return r1
    }

    @com.google.common.annotations.Beta
    public static <E> com.google.common.collect.FluentIterable<E> from(E[] r0) {
            java.util.List r0 = java.util.Arrays.asList(r0)
            com.google.common.collect.FluentIterable r0 = from(r0)
            return r0
    }

    private java.lang.Iterable<E> getDelegate() {
            r1 = this;
            com.google.common.base.Optional<java.lang.Iterable<E>> r0 = r1.iterableDelegate
            java.lang.Object r0 = r0.or(r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            return r0
    }

    @com.google.common.annotations.Beta
    public static <E> com.google.common.collect.FluentIterable<E> of() {
            java.util.List r0 = java.util.Collections.emptyList()
            com.google.common.collect.FluentIterable r0 = from(r0)
            return r0
    }

    @com.google.common.annotations.Beta
    public static <E> com.google.common.collect.FluentIterable<E> of(@com.google.common.collect.ParametricNullness E r0, E... r1) {
            java.util.List r0 = com.google.common.collect.Lists.asList(r0, r1)
            com.google.common.collect.FluentIterable r0 = from(r0)
            return r0
    }

    public final boolean allMatch(com.google.common.base.Predicate<? super E> r2) {
            r1 = this;
            java.lang.Iterable r0 = r1.getDelegate()
            boolean r2 = com.google.common.collect.Iterables.all(r0, r2)
            return r2
    }

    public final boolean anyMatch(com.google.common.base.Predicate<? super E> r2) {
            r1 = this;
            java.lang.Iterable r0 = r1.getDelegate()
            boolean r2 = com.google.common.collect.Iterables.any(r0, r2)
            return r2
    }

    @com.google.common.annotations.Beta
    public final com.google.common.collect.FluentIterable<E> append(java.lang.Iterable<? extends E> r2) {
            r1 = this;
            java.lang.Iterable r0 = r1.getDelegate()
            com.google.common.collect.FluentIterable r2 = concat(r0, r2)
            return r2
    }

    @com.google.common.annotations.Beta
    public final com.google.common.collect.FluentIterable<E> append(E... r2) {
            r1 = this;
            java.lang.Iterable r0 = r1.getDelegate()
            java.util.List r2 = java.util.Arrays.asList(r2)
            com.google.common.collect.FluentIterable r2 = concat(r0, r2)
            return r2
    }

    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            java.lang.Iterable r0 = r1.getDelegate()
            boolean r2 = com.google.common.collect.Iterables.contains(r0, r2)
            return r2
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final <C extends java.util.Collection<? super E>> C copyInto(C r3) {
            r2 = this;
            com.google.common.base.Preconditions.checkNotNull(r3)
            java.lang.Iterable r0 = r2.getDelegate()
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L11
            java.util.Collection r0 = (java.util.Collection) r0
            r3.addAll(r0)
            goto L23
        L11:
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            r3.add(r1)
            goto L15
        L23:
            return r3
    }

    public final com.google.common.collect.FluentIterable<E> cycle() {
            r1 = this;
            java.lang.Iterable r0 = r1.getDelegate()
            java.lang.Iterable r0 = com.google.common.collect.Iterables.cycle(r0)
            com.google.common.collect.FluentIterable r0 = from(r0)
            return r0
    }

    public final com.google.common.collect.FluentIterable<E> filter(com.google.common.base.Predicate<? super E> r2) {
            r1 = this;
            java.lang.Iterable r0 = r1.getDelegate()
            java.lang.Iterable r2 = com.google.common.collect.Iterables.filter(r0, r2)
            com.google.common.collect.FluentIterable r2 = from(r2)
            return r2
    }

    @com.google.common.annotations.GwtIncompatible
    public final <T> com.google.common.collect.FluentIterable<T> filter(java.lang.Class<T> r2) {
            r1 = this;
            java.lang.Iterable r0 = r1.getDelegate()
            java.lang.Iterable r2 = com.google.common.collect.Iterables.filter(r0, r2)
            com.google.common.collect.FluentIterable r2 = from(r2)
            return r2
    }

    public final com.google.common.base.Optional<E> first() {
            r2 = this;
            java.lang.Iterable r0 = r2.getDelegate()
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L17
            java.lang.Object r0 = r0.next()
            com.google.common.base.Optional r0 = com.google.common.base.Optional.of(r0)
            goto L1b
        L17:
            com.google.common.base.Optional r0 = com.google.common.base.Optional.absent()
        L1b:
            return r0
    }

    public final com.google.common.base.Optional<E> firstMatch(com.google.common.base.Predicate<? super E> r2) {
            r1 = this;
            java.lang.Iterable r0 = r1.getDelegate()
            com.google.common.base.Optional r2 = com.google.common.collect.Iterables.tryFind(r0, r2)
            return r2
    }

    @com.google.common.collect.ParametricNullness
    public final E get(int r2) {
            r1 = this;
            java.lang.Iterable r0 = r1.getDelegate()
            java.lang.Object r2 = com.google.common.collect.Iterables.get(r0, r2)
            return r2
    }

    public final <K> com.google.common.collect.ImmutableListMultimap<K, E> index(com.google.common.base.Function<? super E, K> r2) {
            r1 = this;
            java.lang.Iterable r0 = r1.getDelegate()
            com.google.common.collect.ImmutableListMultimap r2 = com.google.common.collect.Multimaps.index(r0, r2)
            return r2
    }

    public final boolean isEmpty() {
            r1 = this;
            java.lang.Iterable r0 = r1.getDelegate()
            java.util.Iterator r0 = r0.iterator()
            boolean r0 = r0.hasNext()
            r0 = r0 ^ 1
            return r0
    }

    @com.google.common.annotations.Beta
    public final java.lang.String join(com.google.common.base.Joiner r1) {
            r0 = this;
            java.lang.String r1 = r1.join(r0)
            return r1
    }

    public final com.google.common.base.Optional<E> last() {
            r3 = this;
            java.lang.Iterable r0 = r3.getDelegate()
            boolean r1 = r0 instanceof java.util.List
            if (r1 == 0) goto L24
            java.util.List r0 = (java.util.List) r0
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L15
            com.google.common.base.Optional r0 = com.google.common.base.Optional.absent()
            return r0
        L15:
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            com.google.common.base.Optional r0 = com.google.common.base.Optional.of(r0)
            return r0
        L24:
            java.util.Iterator r1 = r0.iterator()
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L33
            com.google.common.base.Optional r0 = com.google.common.base.Optional.absent()
            return r0
        L33:
            boolean r2 = r0 instanceof java.util.SortedSet
            if (r2 == 0) goto L42
            java.util.SortedSet r0 = (java.util.SortedSet) r0
            java.lang.Object r0 = r0.last()
            com.google.common.base.Optional r0 = com.google.common.base.Optional.of(r0)
            return r0
        L42:
            java.lang.Object r0 = r1.next()
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L42
            com.google.common.base.Optional r0 = com.google.common.base.Optional.of(r0)
            return r0
    }

    public final com.google.common.collect.FluentIterable<E> limit(int r2) {
            r1 = this;
            java.lang.Iterable r0 = r1.getDelegate()
            java.lang.Iterable r2 = com.google.common.collect.Iterables.limit(r0, r2)
            com.google.common.collect.FluentIterable r2 = from(r2)
            return r2
    }

    public final int size() {
            r1 = this;
            java.lang.Iterable r0 = r1.getDelegate()
            int r0 = com.google.common.collect.Iterables.size(r0)
            return r0
    }

    public final com.google.common.collect.FluentIterable<E> skip(int r2) {
            r1 = this;
            java.lang.Iterable r0 = r1.getDelegate()
            java.lang.Iterable r2 = com.google.common.collect.Iterables.skip(r0, r2)
            com.google.common.collect.FluentIterable r2 = from(r2)
            return r2
    }

    @com.google.common.annotations.GwtIncompatible
    public final E[] toArray(java.lang.Class<E> r2) {
            r1 = this;
            java.lang.Iterable r0 = r1.getDelegate()
            java.lang.Object[] r2 = com.google.common.collect.Iterables.toArray(r0, r2)
            return r2
    }

    public final com.google.common.collect.ImmutableList<E> toList() {
            r1 = this;
            java.lang.Iterable r0 = r1.getDelegate()
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf(r0)
            return r0
    }

    public final <V> com.google.common.collect.ImmutableMap<E, V> toMap(com.google.common.base.Function<? super E, V> r2) {
            r1 = this;
            java.lang.Iterable r0 = r1.getDelegate()
            com.google.common.collect.ImmutableMap r2 = com.google.common.collect.Maps.toMap(r0, r2)
            return r2
    }

    public final com.google.common.collect.ImmutableMultiset<E> toMultiset() {
            r1 = this;
            java.lang.Iterable r0 = r1.getDelegate()
            com.google.common.collect.ImmutableMultiset r0 = com.google.common.collect.ImmutableMultiset.copyOf(r0)
            return r0
    }

    public final com.google.common.collect.ImmutableSet<E> toSet() {
            r1 = this;
            java.lang.Iterable r0 = r1.getDelegate()
            com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.copyOf(r0)
            return r0
    }

    public final com.google.common.collect.ImmutableList<E> toSortedList(java.util.Comparator<? super E> r2) {
            r1 = this;
            com.google.common.collect.Ordering r2 = com.google.common.collect.Ordering.from(r2)
            java.lang.Iterable r0 = r1.getDelegate()
            com.google.common.collect.ImmutableList r2 = r2.immutableSortedCopy(r0)
            return r2
    }

    public final com.google.common.collect.ImmutableSortedSet<E> toSortedSet(java.util.Comparator<? super E> r2) {
            r1 = this;
            java.lang.Iterable r0 = r1.getDelegate()
            com.google.common.collect.ImmutableSortedSet r2 = com.google.common.collect.ImmutableSortedSet.copyOf(r2, r0)
            return r2
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.Iterable r0 = r1.getDelegate()
            java.lang.String r0 = com.google.common.collect.Iterables.toString(r0)
            return r0
    }

    public final <T> com.google.common.collect.FluentIterable<T> transform(com.google.common.base.Function<? super E, T> r2) {
            r1 = this;
            java.lang.Iterable r0 = r1.getDelegate()
            java.lang.Iterable r2 = com.google.common.collect.Iterables.transform(r0, r2)
            com.google.common.collect.FluentIterable r2 = from(r2)
            return r2
    }

    public <T> com.google.common.collect.FluentIterable<T> transformAndConcat(com.google.common.base.Function<? super E, ? extends java.lang.Iterable<? extends T>> r1) {
            r0 = this;
            com.google.common.collect.FluentIterable r1 = r0.transform(r1)
            com.google.common.collect.FluentIterable r1 = concat(r1)
            return r1
    }

    public final <K> com.google.common.collect.ImmutableMap<K, E> uniqueIndex(com.google.common.base.Function<? super E, K> r2) {
            r1 = this;
            java.lang.Iterable r0 = r1.getDelegate()
            com.google.common.collect.ImmutableMap r2 = com.google.common.collect.Maps.uniqueIndex(r0, r2)
            return r2
    }
}
