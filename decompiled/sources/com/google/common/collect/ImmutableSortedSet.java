package com.google.common.collect;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.annotations.GwtCompatible(emulated = true, serializable = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ImmutableSortedSet<E> extends com.google.common.collect.ImmutableSortedSetFauxverideShim<E> implements java.util.NavigableSet<E>, com.google.common.collect.SortedIterable<E> {
    public final transient java.util.Comparator<? super E> comparator;

    @javax.annotation.CheckForNull
    @com.google.common.annotations.GwtIncompatible
    @com.google.errorprone.annotations.concurrent.LazyInit
    public transient com.google.common.collect.ImmutableSortedSet<E> descendingSet;

    /* JADX INFO: loaded from: classes.dex */
    public static final class Builder<E> extends com.google.common.collect.ImmutableSet.Builder<E> {
        private final java.util.Comparator<? super E> comparator;

        public Builder(java.util.Comparator<? super E> r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.util.Comparator r1 = (java.util.Comparator) r1
                r0.comparator = r1
                return
        }

        @Override // com.google.common.collect.ImmutableSet.Builder, com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection.ArrayBasedBuilder add(java.lang.Object r1) {
                r0 = this;
                com.google.common.collect.ImmutableSortedSet$Builder r1 = r0.add(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableSet.Builder, com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection.Builder add(java.lang.Object r1) {
                r0 = this;
                com.google.common.collect.ImmutableSortedSet$Builder r1 = r0.add(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableSet.Builder, com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection.Builder add(java.lang.Object[] r1) {
                r0 = this;
                com.google.common.collect.ImmutableSortedSet$Builder r1 = r0.add(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableSet.Builder, com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableSet.Builder add(java.lang.Object r1) {
                r0 = this;
                com.google.common.collect.ImmutableSortedSet$Builder r1 = r0.add(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableSet.Builder, com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableSet.Builder add(java.lang.Object[] r1) {
                r0 = this;
                com.google.common.collect.ImmutableSortedSet$Builder r1 = r0.add(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableSet.Builder, com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableSortedSet.Builder<E> add(E r1) {
                r0 = this;
                super.add(r1)
                return r0
        }

        @Override // com.google.common.collect.ImmutableSet.Builder, com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableSortedSet.Builder<E> add(E... r1) {
                r0 = this;
                super.add(r1)
                return r0
        }

        @Override // com.google.common.collect.ImmutableSet.Builder, com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection.Builder addAll(java.lang.Iterable r1) {
                r0 = this;
                com.google.common.collect.ImmutableSortedSet$Builder r1 = r0.addAll(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableSet.Builder, com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection.Builder addAll(java.util.Iterator r1) {
                r0 = this;
                com.google.common.collect.ImmutableSortedSet$Builder r1 = r0.addAll(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableSet.Builder, com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableSet.Builder addAll(java.lang.Iterable r1) {
                r0 = this;
                com.google.common.collect.ImmutableSortedSet$Builder r1 = r0.addAll(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableSet.Builder, com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableSet.Builder addAll(java.util.Iterator r1) {
                r0 = this;
                com.google.common.collect.ImmutableSortedSet$Builder r1 = r0.addAll(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableSet.Builder, com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableSortedSet.Builder<E> addAll(java.lang.Iterable<? extends E> r1) {
                r0 = this;
                super.addAll(r1)
                return r0
        }

        @Override // com.google.common.collect.ImmutableSet.Builder, com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableSortedSet.Builder<E> addAll(java.util.Iterator<? extends E> r1) {
                r0 = this;
                super.addAll(r1)
                return r0
        }

        @Override // com.google.common.collect.ImmutableSet.Builder, com.google.common.collect.ImmutableCollection.Builder
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection build() {
                r1 = this;
                com.google.common.collect.ImmutableSortedSet r0 = r1.build()
                return r0
        }

        @Override // com.google.common.collect.ImmutableSet.Builder, com.google.common.collect.ImmutableCollection.Builder
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableSet build() {
                r1 = this;
                com.google.common.collect.ImmutableSortedSet r0 = r1.build()
                return r0
        }

        @Override // com.google.common.collect.ImmutableSet.Builder, com.google.common.collect.ImmutableCollection.Builder
        public com.google.common.collect.ImmutableSortedSet<E> build() {
                r3 = this;
                java.lang.Object[] r0 = r3.contents
                java.util.Comparator<? super E> r1 = r3.comparator
                int r2 = r3.size
                com.google.common.collect.ImmutableSortedSet r0 = com.google.common.collect.ImmutableSortedSet.construct(r1, r2, r0)
                int r1 = r0.size()
                r3.size = r1
                r1 = 1
                r3.forceCopy = r1
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class SerializedForm<E> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        public final java.lang.Object[] elements;

        public SerializedForm(java.util.Comparator<? super E> r1, java.lang.Object[] r2) {
                r0 = this;
                r0.<init>()
                r0.elements = r2
                return
        }
    }

    public ImmutableSortedSet(java.util.Comparator<? super E> r1) {
            r0 = this;
            r0.<init>()
            r0.comparator = r1
            return
    }

    public static <E> com.google.common.collect.ImmutableSortedSet<E> construct(java.util.Comparator<? super E> r4, int r5, E... r6) {
            if (r5 != 0) goto L7
            com.google.common.collect.RegularImmutableSortedSet r4 = emptySet(r4)
            return r4
        L7:
            com.google.common.collect.ObjectArrays.checkElementsNotNull(r6, r5)
            r0 = 0
            java.util.Arrays.sort(r6, r0, r5, r4)
            r0 = 1
            r1 = 1
        L10:
            if (r0 >= r5) goto L26
            r2 = r6[r0]
            int r3 = r1 + (-1)
            r3 = r6[r3]
            int r3 = r4.compare(r2, r3)
            if (r3 == 0) goto L23
            int r3 = r1 + 1
            r6[r1] = r2
            r1 = r3
        L23:
            int r0 = r0 + 1
            goto L10
        L26:
            r0 = 0
            java.util.Arrays.fill(r6, r1, r5, r0)
            int r5 = r6.length
            int r5 = r5 / 2
            if (r1 >= r5) goto L33
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r1)
        L33:
            com.google.common.collect.RegularImmutableSortedSet r5 = new com.google.common.collect.RegularImmutableSortedSet
            com.google.common.collect.ImmutableList r6 = com.google.common.collect.ImmutableList.asImmutableList(r6, r1)
            r5.<init>(r6, r4)
            return r5
    }

    public static <E> com.google.common.collect.ImmutableSortedSet<E> copyOf(java.lang.Iterable<? extends E> r1) {
            com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.natural()
            com.google.common.collect.ImmutableSortedSet r1 = copyOf(r0, r1)
            return r1
    }

    public static <E> com.google.common.collect.ImmutableSortedSet<E> copyOf(java.util.Collection<? extends E> r1) {
            com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.natural()
            com.google.common.collect.ImmutableSortedSet r1 = copyOf(r0, r1)
            return r1
    }

    public static <E> com.google.common.collect.ImmutableSortedSet<E> copyOf(java.util.Comparator<? super E> r2, java.lang.Iterable<? extends E> r3) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            boolean r0 = com.google.common.collect.SortedIterables.hasSameComparator(r2, r3)
            if (r0 == 0) goto L17
            boolean r0 = r3 instanceof com.google.common.collect.ImmutableSortedSet
            if (r0 == 0) goto L17
            r0 = r3
            com.google.common.collect.ImmutableSortedSet r0 = (com.google.common.collect.ImmutableSortedSet) r0
            boolean r1 = r0.isPartialView()
            if (r1 != 0) goto L17
            return r0
        L17:
            java.lang.Object[] r3 = com.google.common.collect.Iterables.toArray(r3)
            int r0 = r3.length
            com.google.common.collect.ImmutableSortedSet r2 = construct(r2, r0, r3)
            return r2
    }

    public static <E> com.google.common.collect.ImmutableSortedSet<E> copyOf(java.util.Comparator<? super E> r0, java.util.Collection<? extends E> r1) {
            com.google.common.collect.ImmutableSortedSet r0 = copyOf(r0, r1)
            return r0
    }

    public static <E> com.google.common.collect.ImmutableSortedSet<E> copyOf(java.util.Comparator<? super E> r1, java.util.Iterator<? extends E> r2) {
            com.google.common.collect.ImmutableSortedSet$Builder r0 = new com.google.common.collect.ImmutableSortedSet$Builder
            r0.<init>(r1)
            com.google.common.collect.ImmutableSortedSet$Builder r1 = r0.addAll(r2)
            com.google.common.collect.ImmutableSortedSet r1 = r1.build()
            return r1
    }

    public static <E> com.google.common.collect.ImmutableSortedSet<E> copyOf(java.util.Iterator<? extends E> r1) {
            com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.natural()
            com.google.common.collect.ImmutableSortedSet r1 = copyOf(r0, r1)
            return r1
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>([TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    public static com.google.common.collect.ImmutableSortedSet copyOf(java.lang.Comparable[] r2) {
            com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.natural()
            int r1 = r2.length
            java.lang.Object r2 = r2.clone()
            java.lang.Comparable[] r2 = (java.lang.Comparable[]) r2
            com.google.common.collect.ImmutableSortedSet r2 = construct(r0, r1, r2)
            return r2
    }

    public static <E> com.google.common.collect.ImmutableSortedSet<E> copyOfSorted(java.util.SortedSet<E> r2) {
            java.util.Comparator r0 = com.google.common.collect.SortedIterables.comparator(r2)
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.copyOf(r2)
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L13
            com.google.common.collect.RegularImmutableSortedSet r2 = emptySet(r0)
            return r2
        L13:
            com.google.common.collect.RegularImmutableSortedSet r1 = new com.google.common.collect.RegularImmutableSortedSet
            r1.<init>(r2, r0)
            return r1
    }

    public static <E> com.google.common.collect.RegularImmutableSortedSet<E> emptySet(java.util.Comparator<? super E> r2) {
            com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.natural()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Ld
            com.google.common.collect.RegularImmutableSortedSet<java.lang.Comparable> r2 = com.google.common.collect.RegularImmutableSortedSet.NATURAL_EMPTY_SET
            return r2
        Ld:
            com.google.common.collect.RegularImmutableSortedSet r0 = new com.google.common.collect.RegularImmutableSortedSet
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of()
            r0.<init>(r1, r2)
            return r0
    }

    public static <E extends java.lang.Comparable<?>> com.google.common.collect.ImmutableSortedSet.Builder<E> naturalOrder() {
            com.google.common.collect.ImmutableSortedSet$Builder r0 = new com.google.common.collect.ImmutableSortedSet$Builder
            com.google.common.collect.Ordering r1 = com.google.common.collect.Ordering.natural()
            r0.<init>(r1)
            return r0
    }

    public static <E> com.google.common.collect.ImmutableSortedSet<E> of() {
            com.google.common.collect.RegularImmutableSortedSet<java.lang.Comparable> r0 = com.google.common.collect.RegularImmutableSortedSet.NATURAL_EMPTY_SET
            return r0
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    public static com.google.common.collect.ImmutableSortedSet of(java.lang.Comparable r2) {
            com.google.common.collect.RegularImmutableSortedSet r0 = new com.google.common.collect.RegularImmutableSortedSet
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.of(r2)
            com.google.common.collect.Ordering r1 = com.google.common.collect.Ordering.natural()
            r0.<init>(r2, r1)
            return r0
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    public static com.google.common.collect.ImmutableSortedSet of(java.lang.Comparable r4, java.lang.Comparable r5) {
            com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.natural()
            r1 = 2
            java.lang.Comparable[] r2 = new java.lang.Comparable[r1]
            r3 = 0
            r2[r3] = r4
            r4 = 1
            r2[r4] = r5
            com.google.common.collect.ImmutableSortedSet r4 = construct(r0, r1, r2)
            return r4
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    public static com.google.common.collect.ImmutableSortedSet of(java.lang.Comparable r4, java.lang.Comparable r5, java.lang.Comparable r6) {
            com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.natural()
            r1 = 3
            java.lang.Comparable[] r2 = new java.lang.Comparable[r1]
            r3 = 0
            r2[r3] = r4
            r4 = 1
            r2[r4] = r5
            r4 = 2
            r2[r4] = r6
            com.google.common.collect.ImmutableSortedSet r4 = construct(r0, r1, r2)
            return r4
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    public static com.google.common.collect.ImmutableSortedSet of(java.lang.Comparable r4, java.lang.Comparable r5, java.lang.Comparable r6, java.lang.Comparable r7) {
            com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.natural()
            r1 = 4
            java.lang.Comparable[] r2 = new java.lang.Comparable[r1]
            r3 = 0
            r2[r3] = r4
            r4 = 1
            r2[r4] = r5
            r4 = 2
            r2[r4] = r6
            r4 = 3
            r2[r4] = r7
            com.google.common.collect.ImmutableSortedSet r4 = construct(r0, r1, r2)
            return r4
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    public static com.google.common.collect.ImmutableSortedSet of(java.lang.Comparable r4, java.lang.Comparable r5, java.lang.Comparable r6, java.lang.Comparable r7, java.lang.Comparable r8) {
            com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.natural()
            r1 = 5
            java.lang.Comparable[] r2 = new java.lang.Comparable[r1]
            r3 = 0
            r2[r3] = r4
            r4 = 1
            r2[r4] = r5
            r4 = 2
            r2[r4] = r6
            r4 = 3
            r2[r4] = r7
            r4 = 4
            r2[r4] = r8
            com.google.common.collect.ImmutableSortedSet r4 = construct(r0, r1, r2)
            return r4
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;TE;[TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    public static com.google.common.collect.ImmutableSortedSet of(java.lang.Comparable r4, java.lang.Comparable r5, java.lang.Comparable r6, java.lang.Comparable r7, java.lang.Comparable r8, java.lang.Comparable r9, java.lang.Comparable... r10) {
            int r0 = r10.length
            r1 = 6
            int r0 = r0 + r1
            java.lang.Comparable[] r2 = new java.lang.Comparable[r0]
            r3 = 0
            r2[r3] = r4
            r4 = 1
            r2[r4] = r5
            r4 = 2
            r2[r4] = r6
            r4 = 3
            r2[r4] = r7
            r4 = 4
            r2[r4] = r8
            r4 = 5
            r2[r4] = r9
            int r4 = r10.length
            java.lang.System.arraycopy(r10, r3, r2, r1, r4)
            com.google.common.collect.Ordering r4 = com.google.common.collect.Ordering.natural()
            com.google.common.collect.ImmutableSortedSet r4 = construct(r4, r0, r2)
            return r4
    }

    public static <E> com.google.common.collect.ImmutableSortedSet.Builder<E> orderedBy(java.util.Comparator<E> r1) {
            com.google.common.collect.ImmutableSortedSet$Builder r0 = new com.google.common.collect.ImmutableSortedSet$Builder
            r0.<init>(r1)
            return r0
    }

    private void readObject(java.io.ObjectInputStream r2) throws java.io.InvalidObjectException {
            r1 = this;
            java.io.InvalidObjectException r2 = new java.io.InvalidObjectException
            java.lang.String r0 = "Use SerializedForm"
            r2.<init>(r0)
            throw r2
    }

    public static <E extends java.lang.Comparable<?>> com.google.common.collect.ImmutableSortedSet.Builder<E> reverseOrder() {
            com.google.common.collect.ImmutableSortedSet$Builder r0 = new com.google.common.collect.ImmutableSortedSet$Builder
            java.util.Comparator r1 = java.util.Collections.reverseOrder()
            r0.<init>(r1)
            return r0
    }

    @javax.annotation.CheckForNull
    public E ceiling(E r2) {
            r1 = this;
            r0 = 1
            com.google.common.collect.ImmutableSortedSet r2 = r1.tailSet(r2, r0)
            r0 = 0
            java.lang.Object r2 = com.google.common.collect.Iterables.getFirst(r2, r0)
            return r2
    }

    @Override // java.util.SortedSet, com.google.common.collect.SortedIterable
    public java.util.Comparator<? super E> comparator() {
            r1 = this;
            java.util.Comparator<? super E> r0 = r1.comparator
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public abstract com.google.common.collect.ImmutableSortedSet<E> createDescendingSet();

    @com.google.common.annotations.GwtIncompatible
    public abstract com.google.common.collect.UnmodifiableIterator<E> descendingIterator();

    @com.google.common.annotations.GwtIncompatible
    public /* bridge */ /* synthetic */ java.util.Iterator descendingIterator() {
            r1 = this;
            com.google.common.collect.UnmodifiableIterator r0 = r1.descendingIterator()
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public com.google.common.collect.ImmutableSortedSet<E> descendingSet() {
            r1 = this;
            com.google.common.collect.ImmutableSortedSet<E> r0 = r1.descendingSet
            if (r0 != 0) goto Lc
            com.google.common.collect.ImmutableSortedSet r0 = r1.createDescendingSet()
            r1.descendingSet = r0
            r0.descendingSet = r1
        Lc:
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public /* bridge */ /* synthetic */ java.util.NavigableSet descendingSet() {
            r1 = this;
            com.google.common.collect.ImmutableSortedSet r0 = r1.descendingSet()
            return r0
    }

    public E first() {
            r1 = this;
            com.google.common.collect.UnmodifiableIterator r0 = r1.iterator()
            java.lang.Object r0 = r0.next()
            return r0
    }

    @javax.annotation.CheckForNull
    public E floor(E r2) {
            r1 = this;
            r0 = 1
            com.google.common.collect.ImmutableSortedSet r2 = r1.headSet(r2, r0)
            com.google.common.collect.UnmodifiableIterator r2 = r2.descendingIterator()
            r0 = 0
            java.lang.Object r2 = com.google.common.collect.Iterators.getNext(r2, r0)
            return r2
    }

    public com.google.common.collect.ImmutableSortedSet<E> headSet(E r2) {
            r1 = this;
            r0 = 0
            com.google.common.collect.ImmutableSortedSet r2 = r1.headSet(r2, r0)
            return r2
    }

    public com.google.common.collect.ImmutableSortedSet<E> headSet(E r1, boolean r2) {
            r0 = this;
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.collect.ImmutableSortedSet r1 = r0.headSetImpl(r1, r2)
            return r1
    }

    public /* bridge */ /* synthetic */ java.util.NavigableSet headSet(java.lang.Object r1, boolean r2) {
            r0 = this;
            com.google.common.collect.ImmutableSortedSet r1 = r0.headSet(r1, r2)
            return r1
    }

    public /* bridge */ /* synthetic */ java.util.SortedSet headSet(java.lang.Object r1) {
            r0 = this;
            com.google.common.collect.ImmutableSortedSet r1 = r0.headSet(r1)
            return r1
    }

    public abstract com.google.common.collect.ImmutableSortedSet<E> headSetImpl(E r1, boolean r2);

    @javax.annotation.CheckForNull
    @com.google.common.annotations.GwtIncompatible
    public E higher(E r2) {
            r1 = this;
            r0 = 0
            com.google.common.collect.ImmutableSortedSet r2 = r1.tailSet(r2, r0)
            r0 = 0
            java.lang.Object r2 = com.google.common.collect.Iterables.getFirst(r2, r0)
            return r2
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public abstract com.google.common.collect.UnmodifiableIterator<E> iterator();

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            com.google.common.collect.UnmodifiableIterator r0 = r1.iterator()
            return r0
    }

    public E last() {
            r1 = this;
            com.google.common.collect.UnmodifiableIterator r0 = r1.descendingIterator()
            java.lang.Object r0 = r0.next()
            return r0
    }

    @javax.annotation.CheckForNull
    @com.google.common.annotations.GwtIncompatible
    public E lower(E r2) {
            r1 = this;
            r0 = 0
            com.google.common.collect.ImmutableSortedSet r2 = r1.headSet(r2, r0)
            com.google.common.collect.UnmodifiableIterator r2 = r2.descendingIterator()
            r0 = 0
            java.lang.Object r2 = com.google.common.collect.Iterators.getNext(r2, r0)
            return r2
    }

    @Override // java.util.NavigableSet
    @javax.annotation.CheckForNull
    @com.google.common.annotations.GwtIncompatible
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final E pollFirst() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.NavigableSet
    @javax.annotation.CheckForNull
    @com.google.common.annotations.GwtIncompatible
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final E pollLast() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public com.google.common.collect.ImmutableSortedSet<E> subSet(E r3, E r4) {
            r2 = this;
            r0 = 1
            r1 = 0
            com.google.common.collect.ImmutableSortedSet r3 = r2.subSet(r3, r0, r4, r1)
            return r3
    }

    @com.google.common.annotations.GwtIncompatible
    public com.google.common.collect.ImmutableSortedSet<E> subSet(E r2, boolean r3, E r4, boolean r5) {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.base.Preconditions.checkNotNull(r4)
            java.util.Comparator<? super E> r0 = r1.comparator
            int r0 = r0.compare(r2, r4)
            if (r0 > 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            com.google.common.base.Preconditions.checkArgument(r0)
            com.google.common.collect.ImmutableSortedSet r2 = r1.subSetImpl(r2, r3, r4, r5)
            return r2
    }

    @com.google.common.annotations.GwtIncompatible
    public /* bridge */ /* synthetic */ java.util.NavigableSet subSet(java.lang.Object r1, boolean r2, java.lang.Object r3, boolean r4) {
            r0 = this;
            com.google.common.collect.ImmutableSortedSet r1 = r0.subSet(r1, r2, r3, r4)
            return r1
    }

    public /* bridge */ /* synthetic */ java.util.SortedSet subSet(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            com.google.common.collect.ImmutableSortedSet r1 = r0.subSet(r1, r2)
            return r1
    }

    public abstract com.google.common.collect.ImmutableSortedSet<E> subSetImpl(E r1, boolean r2, E r3, boolean r4);

    public com.google.common.collect.ImmutableSortedSet<E> tailSet(E r2) {
            r1 = this;
            r0 = 1
            com.google.common.collect.ImmutableSortedSet r2 = r1.tailSet(r2, r0)
            return r2
    }

    public com.google.common.collect.ImmutableSortedSet<E> tailSet(E r1, boolean r2) {
            r0 = this;
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.collect.ImmutableSortedSet r1 = r0.tailSetImpl(r1, r2)
            return r1
    }

    public /* bridge */ /* synthetic */ java.util.NavigableSet tailSet(java.lang.Object r1, boolean r2) {
            r0 = this;
            com.google.common.collect.ImmutableSortedSet r1 = r0.tailSet(r1, r2)
            return r1
    }

    public /* bridge */ /* synthetic */ java.util.SortedSet tailSet(java.lang.Object r1) {
            r0 = this;
            com.google.common.collect.ImmutableSortedSet r1 = r0.tailSet(r1)
            return r1
    }

    public abstract com.google.common.collect.ImmutableSortedSet<E> tailSetImpl(E r1, boolean r2);
}
