package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtIncompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ImmutableSortedMultiset<E> extends com.google.common.collect.ImmutableSortedMultisetFauxverideShim<E> implements com.google.common.collect.SortedMultiset<E> {

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    public transient com.google.common.collect.ImmutableSortedMultiset<E> descendingMultiset;

    /* JADX INFO: loaded from: classes3.dex */
    public static class Builder<E> extends com.google.common.collect.ImmutableMultiset.Builder<E> {
        private final java.util.Comparator<? super E> comparator;
        private int[] counts;

        @com.google.common.annotations.VisibleForTesting
        public E[] elements;
        private boolean forceCopyElements;
        private int length;

        public Builder(java.util.Comparator<? super E> r2) {
                r1 = this;
                r0 = 1
                r1.<init>(r0)
                java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
                java.util.Comparator r2 = (java.util.Comparator) r2
                r1.comparator = r2
                r2 = 4
                java.lang.Object[] r0 = new java.lang.Object[r2]
                r1.elements = r0
                int[] r2 = new int[r2]
                r1.counts = r2
                return
        }

        private void dedupAndCoalesce(boolean r8) {
                r7 = this;
                int r0 = r7.length
                if (r0 != 0) goto L5
                return
            L5:
                E[] r1 = r7.elements
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
                java.util.Comparator<? super E> r1 = r7.comparator
                java.util.Arrays.sort(r0, r1)
                r1 = 1
                r2 = 1
                r3 = 1
            L13:
                int r4 = r0.length
                if (r2 >= r4) goto L2d
                java.util.Comparator<? super E> r4 = r7.comparator
                int r5 = r3 + (-1)
                r5 = r0[r5]
                r6 = r0[r2]
                int r4 = r4.compare(r5, r6)
                if (r4 >= 0) goto L2a
                r4 = r0[r2]
                r0[r3] = r4
                int r3 = r3 + 1
            L2a:
                int r2 = r2 + 1
                goto L13
            L2d:
                int r2 = r7.length
                r4 = 0
                java.util.Arrays.fill(r0, r3, r2, r4)
                if (r8 == 0) goto L48
                int r8 = r3 * 4
                int r2 = r7.length
                int r4 = r2 * 3
                if (r8 <= r4) goto L48
                int r8 = r2 / 2
                int r8 = r8 + r1
                int r8 = com.google.common.math.IntMath.saturatedAdd(r2, r8)
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r8)
            L48:
                int r8 = r0.length
                int[] r8 = new int[r8]
                r1 = 0
                r2 = 0
            L4d:
                int r4 = r7.length
                if (r2 >= r4) goto L71
                E[] r4 = r7.elements
                r4 = r4[r2]
                java.util.Comparator<? super E> r5 = r7.comparator
                int r4 = java.util.Arrays.binarySearch(r0, r1, r3, r4, r5)
                int[] r5 = r7.counts
                r6 = r5[r2]
                if (r6 < 0) goto L69
                r6 = r8[r4]
                r5 = r5[r2]
                int r6 = r6 + r5
                r8[r4] = r6
                goto L6e
            L69:
                r5 = r5[r2]
                int r5 = ~r5
                r8[r4] = r5
            L6e:
                int r2 = r2 + 1
                goto L4d
            L71:
                r7.elements = r0
                r7.counts = r8
                r7.length = r3
                return
        }

        private void dedupAndCoalesceAndDeleteEmpty() {
                r6 = this;
                r0 = 0
                r6.dedupAndCoalesce(r0)
                r1 = 0
                r2 = 0
            L6:
                int r3 = r6.length
                if (r1 >= r3) goto L1f
                int[] r3 = r6.counts
                r4 = r3[r1]
                if (r4 <= 0) goto L1c
                E[] r4 = r6.elements
                r5 = r4[r1]
                r4[r2] = r5
                r4 = r3[r1]
                r3[r2] = r4
                int r2 = r2 + 1
            L1c:
                int r1 = r1 + 1
                goto L6
            L1f:
                E[] r1 = r6.elements
                r4 = 0
                java.util.Arrays.fill(r1, r2, r3, r4)
                int[] r1 = r6.counts
                int r3 = r6.length
                java.util.Arrays.fill(r1, r2, r3, r0)
                r6.length = r2
                return
        }

        private void maintenance() {
                r3 = this;
                int r0 = r3.length
                E[] r1 = r3.elements
                int r2 = r1.length
                if (r0 != r2) goto Lc
                r0 = 1
                r3.dedupAndCoalesce(r0)
                goto L17
            Lc:
                boolean r0 = r3.forceCopyElements
                if (r0 == 0) goto L17
                int r0 = r1.length
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
                r3.elements = r0
            L17:
                r0 = 0
                r3.forceCopyElements = r0
                return
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder, com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection.Builder add(java.lang.Object r1) {
                r0 = this;
                com.google.common.collect.ImmutableSortedMultiset$Builder r1 = r0.add(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder, com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection.Builder add(java.lang.Object[] r1) {
                r0 = this;
                com.google.common.collect.ImmutableSortedMultiset$Builder r1 = r0.add(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder, com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultiset.Builder add(java.lang.Object r1) {
                r0 = this;
                com.google.common.collect.ImmutableSortedMultiset$Builder r1 = r0.add(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder, com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultiset.Builder add(java.lang.Object[] r1) {
                r0 = this;
                com.google.common.collect.ImmutableSortedMultiset$Builder r1 = r0.add(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder, com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableSortedMultiset.Builder<E> add(E r2) {
                r1 = this;
                r0 = 1
                com.google.common.collect.ImmutableSortedMultiset$Builder r2 = r1.addCopies(r2, r0)
                return r2
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder, com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableSortedMultiset.Builder<E> add(E... r4) {
                r3 = this;
                int r0 = r4.length
                r1 = 0
            L2:
                if (r1 >= r0) goto Lc
                r2 = r4[r1]
                r3.add(r2)
                int r1 = r1 + 1
                goto L2
            Lc:
                return r3
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder, com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection.Builder addAll(java.lang.Iterable r1) {
                r0 = this;
                com.google.common.collect.ImmutableSortedMultiset$Builder r1 = r0.addAll(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder, com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection.Builder addAll(java.util.Iterator r1) {
                r0 = this;
                com.google.common.collect.ImmutableSortedMultiset$Builder r1 = r0.addAll(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder, com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultiset.Builder addAll(java.lang.Iterable r1) {
                r0 = this;
                com.google.common.collect.ImmutableSortedMultiset$Builder r1 = r0.addAll(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder, com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultiset.Builder addAll(java.util.Iterator r1) {
                r0 = this;
                com.google.common.collect.ImmutableSortedMultiset$Builder r1 = r0.addAll(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder, com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableSortedMultiset.Builder<E> addAll(java.lang.Iterable<? extends E> r3) {
                r2 = this;
                boolean r0 = r3 instanceof com.google.common.collect.Multiset
                if (r0 == 0) goto L26
                com.google.common.collect.Multiset r3 = (com.google.common.collect.Multiset) r3
                java.util.Set r3 = r3.entrySet()
                java.util.Iterator r3 = r3.iterator()
            Le:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L38
                java.lang.Object r0 = r3.next()
                com.google.common.collect.Multiset$Entry r0 = (com.google.common.collect.Multiset.Entry) r0
                java.lang.Object r1 = r0.getElement()
                int r0 = r0.getCount()
                r2.addCopies(r1, r0)
                goto Le
            L26:
                java.util.Iterator r3 = r3.iterator()
            L2a:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L38
                java.lang.Object r0 = r3.next()
                r2.add(r0)
                goto L2a
            L38:
                return r2
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder, com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableSortedMultiset.Builder<E> addAll(java.util.Iterator<? extends E> r2) {
                r1 = this;
            L0:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto Le
                java.lang.Object r0 = r2.next()
                r1.add(r0)
                goto L0
            Le:
                return r1
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultiset.Builder addCopies(java.lang.Object r1, int r2) {
                r0 = this;
                com.google.common.collect.ImmutableSortedMultiset$Builder r1 = r0.addCopies(r1, r2)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableSortedMultiset.Builder<E> addCopies(E r3, int r4) {
                r2 = this;
                com.google.common.base.Preconditions.checkNotNull(r3)
                java.lang.String r0 = "occurrences"
                com.google.common.collect.CollectPreconditions.checkNonnegative(r4, r0)
                if (r4 != 0) goto Lb
                return r2
            Lb:
                r2.maintenance()
                E[] r0 = r2.elements
                int r1 = r2.length
                r0[r1] = r3
                int[] r3 = r2.counts
                r3[r1] = r4
                int r1 = r1 + 1
                r2.length = r1
                return r2
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder, com.google.common.collect.ImmutableCollection.Builder
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection build() {
                r1 = this;
                com.google.common.collect.ImmutableSortedMultiset r0 = r1.build()
                return r0
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder, com.google.common.collect.ImmutableCollection.Builder
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultiset build() {
                r1 = this;
                com.google.common.collect.ImmutableSortedMultiset r0 = r1.build()
                return r0
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder, com.google.common.collect.ImmutableCollection.Builder
        public com.google.common.collect.ImmutableSortedMultiset<E> build() {
                r10 = this;
                r10.dedupAndCoalesceAndDeleteEmpty()
                int r0 = r10.length
                if (r0 != 0) goto Le
                java.util.Comparator<? super E> r0 = r10.comparator
                com.google.common.collect.ImmutableSortedMultiset r0 = com.google.common.collect.ImmutableSortedMultiset.emptyMultiset(r0)
                return r0
            Le:
                java.util.Comparator<? super E> r1 = r10.comparator
                E[] r2 = r10.elements
                com.google.common.collect.ImmutableSortedSet r0 = com.google.common.collect.ImmutableSortedSet.construct(r1, r0, r2)
                com.google.common.collect.RegularImmutableSortedSet r0 = (com.google.common.collect.RegularImmutableSortedSet) r0
                int r1 = r10.length
                r2 = 1
                int r1 = r1 + r2
                long[] r1 = new long[r1]
                r3 = 0
                r4 = 0
            L20:
                int r5 = r10.length
                if (r4 >= r5) goto L32
                int r5 = r4 + 1
                r6 = r1[r4]
                int[] r8 = r10.counts
                r4 = r8[r4]
                long r8 = (long) r4
                long r6 = r6 + r8
                r1[r5] = r6
                r4 = r5
                goto L20
            L32:
                r10.forceCopyElements = r2
                com.google.common.collect.RegularImmutableSortedMultiset r2 = new com.google.common.collect.RegularImmutableSortedMultiset
                int r4 = r10.length
                r2.<init>(r0, r1, r3, r4)
                return r2
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultiset.Builder setCount(java.lang.Object r1, int r2) {
                r0 = this;
                com.google.common.collect.ImmutableSortedMultiset$Builder r1 = r0.setCount(r1, r2)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableSortedMultiset.Builder<E> setCount(E r3, int r4) {
                r2 = this;
                com.google.common.base.Preconditions.checkNotNull(r3)
                java.lang.String r0 = "count"
                com.google.common.collect.CollectPreconditions.checkNonnegative(r4, r0)
                r2.maintenance()
                E[] r0 = r2.elements
                int r1 = r2.length
                r0[r1] = r3
                int[] r3 = r2.counts
                int r4 = ~r4
                r3[r1] = r4
                int r1 = r1 + 1
                r2.length = r1
                return r2
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class SerializedForm<E> implements java.io.Serializable {
    }

    public ImmutableSortedMultiset() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <E> com.google.common.collect.ImmutableSortedMultiset<E> copyOf(java.lang.Iterable<? extends E> r1) {
            com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.natural()
            com.google.common.collect.ImmutableSortedMultiset r1 = copyOf(r0, r1)
            return r1
    }

    public static <E> com.google.common.collect.ImmutableSortedMultiset<E> copyOf(java.util.Comparator<? super E> r2, java.lang.Iterable<? extends E> r3) {
            boolean r0 = r3 instanceof com.google.common.collect.ImmutableSortedMultiset
            if (r0 == 0) goto L25
            r0 = r3
            com.google.common.collect.ImmutableSortedMultiset r0 = (com.google.common.collect.ImmutableSortedMultiset) r0
            java.util.Comparator r1 = r0.comparator()
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L25
            boolean r3 = r0.isPartialView()
            if (r3 == 0) goto L24
            com.google.common.collect.ImmutableSet r3 = r0.entrySet()
            com.google.common.collect.ImmutableList r3 = r3.asList()
            com.google.common.collect.ImmutableSortedMultiset r2 = copyOfSortedEntries(r2, r3)
            return r2
        L24:
            return r0
        L25:
            com.google.common.collect.ImmutableSortedMultiset$Builder r0 = new com.google.common.collect.ImmutableSortedMultiset$Builder
            r0.<init>(r2)
            com.google.common.collect.ImmutableSortedMultiset$Builder r2 = r0.addAll(r3)
            com.google.common.collect.ImmutableSortedMultiset r2 = r2.build()
            return r2
    }

    public static <E> com.google.common.collect.ImmutableSortedMultiset<E> copyOf(java.util.Comparator<? super E> r1, java.util.Iterator<? extends E> r2) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.collect.ImmutableSortedMultiset$Builder r0 = new com.google.common.collect.ImmutableSortedMultiset$Builder
            r0.<init>(r1)
            com.google.common.collect.ImmutableSortedMultiset$Builder r1 = r0.addAll(r2)
            com.google.common.collect.ImmutableSortedMultiset r1 = r1.build()
            return r1
    }

    public static <E> com.google.common.collect.ImmutableSortedMultiset<E> copyOf(java.util.Iterator<? extends E> r1) {
            com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.natural()
            com.google.common.collect.ImmutableSortedMultiset r1 = copyOf(r0, r1)
            return r1
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>([TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static com.google.common.collect.ImmutableSortedMultiset copyOf(java.lang.Comparable[] r1) {
            com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.natural()
            java.util.List r1 = java.util.Arrays.asList(r1)
            com.google.common.collect.ImmutableSortedMultiset r1 = copyOf(r0, r1)
            return r1
    }

    public static <E> com.google.common.collect.ImmutableSortedMultiset<E> copyOfSorted(com.google.common.collect.SortedMultiset<E> r1) {
            java.util.Comparator r0 = r1.comparator()
            java.util.Set r1 = r1.entrySet()
            java.util.ArrayList r1 = com.google.common.collect.Lists.newArrayList(r1)
            com.google.common.collect.ImmutableSortedMultiset r1 = copyOfSortedEntries(r0, r1)
            return r1
    }

    private static <E> com.google.common.collect.ImmutableSortedMultiset<E> copyOfSortedEntries(java.util.Comparator<? super E> r9, java.util.Collection<com.google.common.collect.Multiset.Entry<E>> r10) {
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto Lb
            com.google.common.collect.ImmutableSortedMultiset r9 = emptyMultiset(r9)
            return r9
        Lb:
            com.google.common.collect.ImmutableList$Builder r0 = new com.google.common.collect.ImmutableList$Builder
            int r1 = r10.size()
            r0.<init>(r1)
            int r1 = r10.size()
            int r1 = r1 + 1
            long[] r1 = new long[r1]
            java.util.Iterator r2 = r10.iterator()
            r3 = 0
            r4 = 0
        L22:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L43
            java.lang.Object r5 = r2.next()
            com.google.common.collect.Multiset$Entry r5 = (com.google.common.collect.Multiset.Entry) r5
            java.lang.Object r6 = r5.getElement()
            r0.add(r6)
            int r6 = r4 + 1
            r7 = r1[r4]
            int r4 = r5.getCount()
            long r4 = (long) r4
            long r7 = r7 + r4
            r1[r6] = r7
            r4 = r6
            goto L22
        L43:
            com.google.common.collect.RegularImmutableSortedMultiset r2 = new com.google.common.collect.RegularImmutableSortedMultiset
            com.google.common.collect.RegularImmutableSortedSet r4 = new com.google.common.collect.RegularImmutableSortedSet
            com.google.common.collect.ImmutableList r0 = r0.build()
            r4.<init>(r0, r9)
            int r9 = r10.size()
            r2.<init>(r4, r1, r3, r9)
            return r2
    }

    public static <E> com.google.common.collect.ImmutableSortedMultiset<E> emptyMultiset(java.util.Comparator<? super E> r1) {
            com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.natural()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Ld
            com.google.common.collect.ImmutableSortedMultiset<java.lang.Comparable> r1 = com.google.common.collect.RegularImmutableSortedMultiset.NATURAL_EMPTY_MULTISET
            return r1
        Ld:
            com.google.common.collect.RegularImmutableSortedMultiset r0 = new com.google.common.collect.RegularImmutableSortedMultiset
            r0.<init>(r1)
            return r0
    }

    public static <E extends java.lang.Comparable<?>> com.google.common.collect.ImmutableSortedMultiset.Builder<E> naturalOrder() {
            com.google.common.collect.ImmutableSortedMultiset$Builder r0 = new com.google.common.collect.ImmutableSortedMultiset$Builder
            com.google.common.collect.Ordering r1 = com.google.common.collect.Ordering.natural()
            r0.<init>(r1)
            return r0
    }

    public static <E> com.google.common.collect.ImmutableSortedMultiset<E> of() {
            com.google.common.collect.ImmutableSortedMultiset<java.lang.Comparable> r0 = com.google.common.collect.RegularImmutableSortedMultiset.NATURAL_EMPTY_MULTISET
            return r0
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static com.google.common.collect.ImmutableSortedMultiset of(java.lang.Comparable r4) {
            com.google.common.collect.ImmutableSortedSet r4 = com.google.common.collect.ImmutableSortedSet.of(r4)
            com.google.common.collect.RegularImmutableSortedSet r4 = (com.google.common.collect.RegularImmutableSortedSet) r4
            r0 = 2
            long[] r0 = new long[r0]
            r0 = {x0014: FILL_ARRAY_DATA , data: [0, 1} // fill-array
            com.google.common.collect.RegularImmutableSortedMultiset r1 = new com.google.common.collect.RegularImmutableSortedMultiset
            r2 = 0
            r3 = 1
            r1.<init>(r4, r0, r2, r3)
            return r1
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static com.google.common.collect.ImmutableSortedMultiset of(java.lang.Comparable r3, java.lang.Comparable r4) {
            com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.natural()
            r1 = 2
            java.lang.Comparable[] r1 = new java.lang.Comparable[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            java.util.List r3 = java.util.Arrays.asList(r1)
            com.google.common.collect.ImmutableSortedMultiset r3 = copyOf(r0, r3)
            return r3
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static com.google.common.collect.ImmutableSortedMultiset of(java.lang.Comparable r3, java.lang.Comparable r4, java.lang.Comparable r5) {
            com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.natural()
            r1 = 3
            java.lang.Comparable[] r1 = new java.lang.Comparable[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r3 = 2
            r1[r3] = r5
            java.util.List r3 = java.util.Arrays.asList(r1)
            com.google.common.collect.ImmutableSortedMultiset r3 = copyOf(r0, r3)
            return r3
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static com.google.common.collect.ImmutableSortedMultiset of(java.lang.Comparable r3, java.lang.Comparable r4, java.lang.Comparable r5, java.lang.Comparable r6) {
            com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.natural()
            r1 = 4
            java.lang.Comparable[] r1 = new java.lang.Comparable[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r3 = 2
            r1[r3] = r5
            r3 = 3
            r1[r3] = r6
            java.util.List r3 = java.util.Arrays.asList(r1)
            com.google.common.collect.ImmutableSortedMultiset r3 = copyOf(r0, r3)
            return r3
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static com.google.common.collect.ImmutableSortedMultiset of(java.lang.Comparable r3, java.lang.Comparable r4, java.lang.Comparable r5, java.lang.Comparable r6, java.lang.Comparable r7) {
            com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.natural()
            r1 = 5
            java.lang.Comparable[] r1 = new java.lang.Comparable[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r3 = 2
            r1[r3] = r5
            r3 = 3
            r1[r3] = r6
            r3 = 4
            r1[r3] = r7
            java.util.List r3 = java.util.Arrays.asList(r1)
            com.google.common.collect.ImmutableSortedMultiset r3 = copyOf(r0, r3)
            return r3
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;TE;[TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static com.google.common.collect.ImmutableSortedMultiset of(java.lang.Comparable r3, java.lang.Comparable r4, java.lang.Comparable r5, java.lang.Comparable r6, java.lang.Comparable r7, java.lang.Comparable r8, java.lang.Comparable... r9) {
            int r0 = r9.length
            r1 = 6
            int r0 = r0 + r1
            java.util.ArrayList r0 = com.google.common.collect.Lists.newArrayListWithCapacity(r0)
            java.lang.Comparable[] r1 = new java.lang.Comparable[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r3 = 2
            r1[r3] = r5
            r3 = 3
            r1[r3] = r6
            r3 = 4
            r1[r3] = r7
            r3 = 5
            r1[r3] = r8
            java.util.Collections.addAll(r0, r1)
            java.util.Collections.addAll(r0, r9)
            com.google.common.collect.Ordering r3 = com.google.common.collect.Ordering.natural()
            com.google.common.collect.ImmutableSortedMultiset r3 = copyOf(r3, r0)
            return r3
    }

    public static <E> com.google.common.collect.ImmutableSortedMultiset.Builder<E> orderedBy(java.util.Comparator<E> r1) {
            com.google.common.collect.ImmutableSortedMultiset$Builder r0 = new com.google.common.collect.ImmutableSortedMultiset$Builder
            r0.<init>(r1)
            return r0
    }

    public static <E extends java.lang.Comparable<?>> com.google.common.collect.ImmutableSortedMultiset.Builder<E> reverseOrder() {
            com.google.common.collect.ImmutableSortedMultiset$Builder r0 = new com.google.common.collect.ImmutableSortedMultiset$Builder
            com.google.common.collect.Ordering r1 = com.google.common.collect.Ordering.natural()
            com.google.common.collect.Ordering r1 = r1.reverse()
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public final java.util.Comparator<? super E> comparator() {
            r1 = this;
            com.google.common.collect.ImmutableSortedSet r0 = r1.elementSet()
            java.util.Comparator r0 = r0.comparator()
            return r0
    }

    public com.google.common.collect.ImmutableSortedMultiset<E> descendingMultiset() {
            r1 = this;
            com.google.common.collect.ImmutableSortedMultiset<E> r0 = r1.descendingMultiset
            if (r0 != 0) goto L22
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L1b
            java.util.Comparator r0 = r1.comparator()
            com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.from(r0)
            com.google.common.collect.Ordering r0 = r0.reverse()
            com.google.common.collect.ImmutableSortedMultiset r0 = emptyMultiset(r0)
            goto L20
        L1b:
            com.google.common.collect.DescendingImmutableSortedMultiset r0 = new com.google.common.collect.DescendingImmutableSortedMultiset
            r0.<init>(r1)
        L20:
            r1.descendingMultiset = r0
        L22:
            return r0
    }

    public /* bridge */ /* synthetic */ com.google.common.collect.SortedMultiset descendingMultiset() {
            r1 = this;
            com.google.common.collect.ImmutableSortedMultiset r0 = r1.descendingMultiset()
            return r0
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableSet elementSet() {
            r1 = this;
            com.google.common.collect.ImmutableSortedSet r0 = r1.elementSet()
            return r0
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public abstract com.google.common.collect.ImmutableSortedSet<E> elementSet();

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ java.util.NavigableSet elementSet() {
            r1 = this;
            com.google.common.collect.ImmutableSortedSet r0 = r1.elementSet()
            return r0
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ java.util.Set elementSet() {
            r1 = this;
            com.google.common.collect.ImmutableSortedSet r0 = r1.elementSet()
            return r0
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ java.util.SortedSet elementSet() {
            r1 = this;
            com.google.common.collect.ImmutableSortedSet r0 = r1.elementSet()
            return r0
    }

    public abstract com.google.common.collect.ImmutableSortedMultiset<E> headMultiset(E r1, com.google.common.collect.BoundType r2);

    public /* bridge */ /* synthetic */ com.google.common.collect.SortedMultiset headMultiset(java.lang.Object r1, com.google.common.collect.BoundType r2) {
            r0 = this;
            com.google.common.collect.ImmutableSortedMultiset r1 = r0.headMultiset(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.SortedMultiset
    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final com.google.common.collect.Multiset.Entry<E> pollFirstEntry() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // com.google.common.collect.SortedMultiset
    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final com.google.common.collect.Multiset.Entry<E> pollLastEntry() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.ImmutableSortedMultiset<E> subMultiset(E r3, com.google.common.collect.BoundType r4, E r5, com.google.common.collect.BoundType r6) {
            r2 = this;
            java.util.Comparator r0 = r2.comparator()
            int r0 = r0.compare(r3, r5)
            if (r0 > 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            java.lang.String r1 = "Expected lowerBound <= upperBound but %s > %s"
            com.google.common.base.Preconditions.checkArgument(r0, r1, r3, r5)
            com.google.common.collect.ImmutableSortedMultiset r3 = r2.tailMultiset(r3, r4)
            com.google.common.collect.ImmutableSortedMultiset r3 = r3.headMultiset(r5, r6)
            return r3
    }

    @Override // com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ com.google.common.collect.SortedMultiset subMultiset(java.lang.Object r1, com.google.common.collect.BoundType r2, java.lang.Object r3, com.google.common.collect.BoundType r4) {
            r0 = this;
            com.google.common.collect.ImmutableSortedMultiset r1 = r0.subMultiset(r1, r2, r3, r4)
            return r1
    }

    public abstract com.google.common.collect.ImmutableSortedMultiset<E> tailMultiset(E r1, com.google.common.collect.BoundType r2);

    public /* bridge */ /* synthetic */ com.google.common.collect.SortedMultiset tailMultiset(java.lang.Object r1, com.google.common.collect.BoundType r2) {
            r0 = this;
            com.google.common.collect.ImmutableSortedMultiset r1 = r0.tailMultiset(r1, r2)
            return r1
    }
}
