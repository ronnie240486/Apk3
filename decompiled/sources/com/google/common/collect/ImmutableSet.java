package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible(emulated = true, serializable = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ImmutableSet<E> extends com.google.common.collect.ImmutableCollection<E> implements java.util.Set<E> {
    private static final int CUTOFF = 751619276;
    private static final double DESIRED_LOAD_FACTOR = 0.7d;

    @com.google.j2objc.annotations.RetainedWith
    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.ImmutableList<E> asList;

    public static class Builder<E> extends com.google.common.collect.ImmutableCollection.ArrayBasedBuilder<E> {
        private int hashCode;

        @com.google.common.annotations.VisibleForTesting
        @javax.annotation.CheckForNull
        public java.lang.Object[] hashTable;

        public Builder() {
                r1 = this;
                r0 = 4
                r1.<init>(r0)
                return
        }

        public Builder(int r1) {
                r0 = this;
                r0.<init>(r1)
                int r1 = com.google.common.collect.ImmutableSet.chooseTableSize(r1)
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r0.hashTable = r1
                return
        }

        private void addDeduping(E r6) {
                r5 = this;
                java.lang.Object[] r0 = r5.hashTable
                java.util.Objects.requireNonNull(r0)
                java.lang.Object[] r0 = r5.hashTable
                int r0 = r0.length
                int r0 = r0 + (-1)
                int r1 = r6.hashCode()
                int r2 = com.google.common.collect.Hashing.smear(r1)
            L12:
                r2 = r2 & r0
                java.lang.Object[] r3 = r5.hashTable
                r4 = r3[r2]
                if (r4 != 0) goto L24
                r3[r2] = r6
                int r0 = r5.hashCode
                int r0 = r0 + r1
                r5.hashCode = r0
                super.add(r6)
                return
            L24:
                boolean r3 = r4.equals(r6)
                if (r3 == 0) goto L2b
                return
            L2b:
                int r2 = r2 + 1
                goto L12
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection.ArrayBasedBuilder add(java.lang.Object r1) {
                r0 = this;
                com.google.common.collect.ImmutableSet$Builder r1 = r0.add(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection.Builder add(java.lang.Object r1) {
                r0 = this;
                com.google.common.collect.ImmutableSet$Builder r1 = r0.add(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection.Builder add(java.lang.Object[] r1) {
                r0 = this;
                com.google.common.collect.ImmutableSet$Builder r1 = r0.add(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableSet.Builder<E> add(E r3) {
                r2 = this;
                com.google.common.base.Preconditions.checkNotNull(r3)
                java.lang.Object[] r0 = r2.hashTable
                if (r0 == 0) goto L16
                int r0 = r2.size
                int r0 = com.google.common.collect.ImmutableSet.chooseTableSize(r0)
                java.lang.Object[] r1 = r2.hashTable
                int r1 = r1.length
                if (r0 > r1) goto L16
                r2.addDeduping(r3)
                return r2
            L16:
                r0 = 0
                r2.hashTable = r0
                super.add(r3)
                return r2
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableSet.Builder<E> add(E... r4) {
                r3 = this;
                java.lang.Object[] r0 = r3.hashTable
                if (r0 == 0) goto L10
                int r0 = r4.length
                r1 = 0
            L6:
                if (r1 >= r0) goto L13
                r2 = r4[r1]
                r3.add(r2)
                int r1 = r1 + 1
                goto L6
            L10:
                super.add(r4)
            L13:
                return r3
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection.Builder addAll(java.lang.Iterable r1) {
                r0 = this;
                com.google.common.collect.ImmutableSet$Builder r1 = r0.addAll(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection.Builder addAll(java.util.Iterator r1) {
                r0 = this;
                com.google.common.collect.ImmutableSet$Builder r1 = r0.addAll(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableSet.Builder<E> addAll(java.lang.Iterable<? extends E> r2) {
                r1 = this;
                com.google.common.base.Preconditions.checkNotNull(r2)
                java.lang.Object[] r0 = r1.hashTable
                if (r0 == 0) goto L19
                java.util.Iterator r2 = r2.iterator()
            Lb:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L1c
                java.lang.Object r0 = r2.next()
                r1.add(r0)
                goto Lb
            L19:
                super.addAll(r2)
            L1c:
                return r1
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableSet.Builder<E> addAll(java.util.Iterator<? extends E> r2) {
                r1 = this;
                com.google.common.base.Preconditions.checkNotNull(r2)
            L3:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L11
                java.lang.Object r0 = r2.next()
                r1.add(r0)
                goto L3
            L11:
                return r1
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection build() {
                r1 = this;
                com.google.common.collect.ImmutableSet r0 = r1.build()
                return r0
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public com.google.common.collect.ImmutableSet<E> build() {
                r8 = this;
                int r0 = r8.size
                if (r0 == 0) goto L5c
                r1 = 1
                if (r0 == r1) goto L4f
                java.lang.Object[] r2 = r8.hashTable
                if (r2 == 0) goto L3b
                int r0 = com.google.common.collect.ImmutableSet.chooseTableSize(r0)
                java.lang.Object[] r2 = r8.hashTable
                int r2 = r2.length
                if (r0 != r2) goto L3b
                int r0 = r8.size
                java.lang.Object[] r2 = r8.contents
                int r2 = r2.length
                boolean r0 = com.google.common.collect.ImmutableSet.access$000(r0, r2)
                if (r0 == 0) goto L28
                java.lang.Object[] r0 = r8.contents
                int r2 = r8.size
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
                goto L2a
            L28:
                java.lang.Object[] r0 = r8.contents
            L2a:
                r3 = r0
                com.google.common.collect.RegularImmutableSet r0 = new com.google.common.collect.RegularImmutableSet
                int r4 = r8.hashCode
                java.lang.Object[] r5 = r8.hashTable
                int r2 = r5.length
                int r6 = r2 + (-1)
                int r7 = r8.size
                r2 = r0
                r2.<init>(r3, r4, r5, r6, r7)
                goto L49
            L3b:
                int r0 = r8.size
                java.lang.Object[] r2 = r8.contents
                com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.access$100(r0, r2)
                int r2 = r0.size()
                r8.size = r2
            L49:
                r8.forceCopy = r1
                r1 = 0
                r8.hashTable = r1
                return r0
            L4f:
                java.lang.Object[] r0 = r8.contents
                r1 = 0
                r0 = r0[r1]
                java.util.Objects.requireNonNull(r0)
                com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.of(r0)
                return r0
            L5c:
                com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.of()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class SerializedForm implements java.io.Serializable {
        private static final long serialVersionUID = 0;
    }

    public ImmutableSet() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ boolean access$000(int r0, int r1) {
            boolean r0 = shouldTrim(r0, r1)
            return r0
    }

    public static /* synthetic */ com.google.common.collect.ImmutableSet access$100(int r0, java.lang.Object[] r1) {
            com.google.common.collect.ImmutableSet r0 = construct(r0, r1)
            return r0
    }

    public static <E> com.google.common.collect.ImmutableSet.Builder<E> builder() {
            com.google.common.collect.ImmutableSet$Builder r0 = new com.google.common.collect.ImmutableSet$Builder
            r0.<init>()
            return r0
    }

    @com.google.common.annotations.Beta
    public static <E> com.google.common.collect.ImmutableSet.Builder<E> builderWithExpectedSize(int r1) {
            java.lang.String r0 = "expectedSize"
            com.google.common.collect.CollectPreconditions.checkNonnegative(r1, r0)
            com.google.common.collect.ImmutableSet$Builder r0 = new com.google.common.collect.ImmutableSet$Builder
            r0.<init>(r1)
            return r0
    }

    @com.google.common.annotations.VisibleForTesting
    static int chooseTableSize(int r6) {
            r0 = 2
            int r6 = java.lang.Math.max(r6, r0)
            r0 = 1
            r1 = 751619276(0x2ccccccc, float:5.8207657E-12)
            if (r6 >= r1) goto L24
            int r1 = r6 + (-1)
            int r1 = java.lang.Integer.highestOneBit(r1)
            int r0 = r1 << 1
        L13:
            double r1 = (double) r0
            r3 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            double r1 = r1 * r3
            double r3 = (double) r6
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L23
            int r0 = r0 << 1
            goto L13
        L23:
            return r0
        L24:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r6 >= r1) goto L29
            goto L2a
        L29:
            r0 = 0
        L2a:
            java.lang.String r6 = "collection too large"
            com.google.common.base.Preconditions.checkArgument(r0, r6)
            return r1
    }

    private static <E> com.google.common.collect.ImmutableSet<E> construct(int r13, java.lang.Object... r14) {
            if (r13 == 0) goto L76
            r0 = 0
            r1 = 1
            if (r13 == r1) goto L6c
            int r2 = chooseTableSize(r13)
            java.lang.Object[] r6 = new java.lang.Object[r2]
            int r7 = r2 + (-1)
            r3 = 0
            r5 = 0
            r8 = 0
        L11:
            if (r3 >= r13) goto L3b
            r4 = r14[r3]
            com.google.common.collect.ObjectArrays.checkElementNotNull(r4, r3)
            int r9 = r4.hashCode()
            int r10 = com.google.common.collect.Hashing.smear(r9)
        L20:
            r11 = r10 & r7
            r12 = r6[r11]
            if (r12 != 0) goto L2f
            int r10 = r8 + 1
            r14[r8] = r4
            r6[r11] = r4
            int r5 = r5 + r9
            r8 = r10
            goto L35
        L2f:
            boolean r11 = r12.equals(r4)
            if (r11 == 0) goto L38
        L35:
            int r3 = r3 + 1
            goto L11
        L38:
            int r10 = r10 + 1
            goto L20
        L3b:
            r3 = 0
            java.util.Arrays.fill(r14, r8, r13, r3)
            if (r8 != r1) goto L4c
            r13 = r14[r0]
            java.util.Objects.requireNonNull(r13)
            com.google.common.collect.SingletonImmutableSet r14 = new com.google.common.collect.SingletonImmutableSet
            r14.<init>(r13)
            return r14
        L4c:
            int r13 = chooseTableSize(r8)
            int r2 = r2 / 2
            if (r13 >= r2) goto L59
            com.google.common.collect.ImmutableSet r13 = construct(r8, r14)
            return r13
        L59:
            int r13 = r14.length
            boolean r13 = shouldTrim(r8, r13)
            if (r13 == 0) goto L64
            java.lang.Object[] r14 = java.util.Arrays.copyOf(r14, r8)
        L64:
            r4 = r14
            com.google.common.collect.RegularImmutableSet r13 = new com.google.common.collect.RegularImmutableSet
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            return r13
        L6c:
            r13 = r14[r0]
            java.util.Objects.requireNonNull(r13)
            com.google.common.collect.ImmutableSet r13 = of(r13)
            return r13
        L76:
            com.google.common.collect.ImmutableSet r13 = of()
            return r13
    }

    public static <E> com.google.common.collect.ImmutableSet<E> copyOf(java.lang.Iterable<? extends E> r1) {
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto Lb
            java.util.Collection r1 = (java.util.Collection) r1
            com.google.common.collect.ImmutableSet r1 = copyOf(r1)
            goto L13
        Lb:
            java.util.Iterator r1 = r1.iterator()
            com.google.common.collect.ImmutableSet r1 = copyOf(r1)
        L13:
            return r1
    }

    public static <E> com.google.common.collect.ImmutableSet<E> copyOf(java.util.Collection<? extends E> r2) {
            boolean r0 = r2 instanceof com.google.common.collect.ImmutableSet
            if (r0 == 0) goto L12
            boolean r0 = r2 instanceof java.util.SortedSet
            if (r0 != 0) goto L12
            r0 = r2
            com.google.common.collect.ImmutableSet r0 = (com.google.common.collect.ImmutableSet) r0
            boolean r1 = r0.isPartialView()
            if (r1 != 0) goto L12
            return r0
        L12:
            java.lang.Object[] r2 = r2.toArray()
            int r0 = r2.length
            com.google.common.collect.ImmutableSet r2 = construct(r0, r2)
            return r2
    }

    public static <E> com.google.common.collect.ImmutableSet<E> copyOf(java.util.Iterator<? extends E> r2) {
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto Lb
            com.google.common.collect.ImmutableSet r2 = of()
            return r2
        Lb:
            java.lang.Object r0 = r2.next()
            boolean r1 = r2.hasNext()
            if (r1 != 0) goto L1a
            com.google.common.collect.ImmutableSet r2 = of(r0)
            return r2
        L1a:
            com.google.common.collect.ImmutableSet$Builder r1 = new com.google.common.collect.ImmutableSet$Builder
            r1.<init>()
            com.google.common.collect.ImmutableSet$Builder r0 = r1.add(r0)
            com.google.common.collect.ImmutableSet$Builder r2 = r0.addAll(r2)
            com.google.common.collect.ImmutableSet r2 = r2.build()
            return r2
    }

    public static <E> com.google.common.collect.ImmutableSet<E> copyOf(E[] r2) {
            int r0 = r2.length
            if (r0 == 0) goto L1a
            r1 = 1
            if (r0 == r1) goto L12
            int r0 = r2.length
            java.lang.Object r2 = r2.clone()
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            com.google.common.collect.ImmutableSet r2 = construct(r0, r2)
            return r2
        L12:
            r0 = 0
            r2 = r2[r0]
            com.google.common.collect.ImmutableSet r2 = of(r2)
            return r2
        L1a:
            com.google.common.collect.ImmutableSet r2 = of()
            return r2
    }

    public static <E> com.google.common.collect.ImmutableSet<E> of() {
            com.google.common.collect.RegularImmutableSet<java.lang.Object> r0 = com.google.common.collect.RegularImmutableSet.EMPTY
            return r0
    }

    public static <E> com.google.common.collect.ImmutableSet<E> of(E r1) {
            com.google.common.collect.SingletonImmutableSet r0 = new com.google.common.collect.SingletonImmutableSet
            r0.<init>(r1)
            return r0
    }

    public static <E> com.google.common.collect.ImmutableSet<E> of(E r3, E r4) {
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            com.google.common.collect.ImmutableSet r3 = construct(r0, r1)
            return r3
    }

    public static <E> com.google.common.collect.ImmutableSet<E> of(E r3, E r4, E r5) {
            r0 = 3
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r3 = 2
            r1[r3] = r5
            com.google.common.collect.ImmutableSet r3 = construct(r0, r1)
            return r3
    }

    public static <E> com.google.common.collect.ImmutableSet<E> of(E r3, E r4, E r5, E r6) {
            r0 = 4
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r3 = 2
            r1[r3] = r5
            r3 = 3
            r1[r3] = r6
            com.google.common.collect.ImmutableSet r3 = construct(r0, r1)
            return r3
    }

    public static <E> com.google.common.collect.ImmutableSet<E> of(E r3, E r4, E r5, E r6, E r7) {
            r0 = 5
            java.lang.Object[] r1 = new java.lang.Object[r0]
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
            com.google.common.collect.ImmutableSet r3 = construct(r0, r1)
            return r3
    }

    @java.lang.SafeVarargs
    public static <E> com.google.common.collect.ImmutableSet<E> of(E r5, E r6, E r7, E r8, E r9, E r10, E... r11) {
            int r0 = r11.length
            r1 = 1
            r2 = 0
            r3 = 2147483641(0x7ffffff9, float:NaN)
            if (r0 > r3) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            java.lang.String r3 = "the total number of elements must fit in an int"
            com.google.common.base.Preconditions.checkArgument(r0, r3)
            int r0 = r11.length
            r3 = 6
            int r0 = r0 + r3
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r4[r2] = r5
            r4[r1] = r6
            r5 = 2
            r4[r5] = r7
            r5 = 3
            r4[r5] = r8
            r5 = 4
            r4[r5] = r9
            r5 = 5
            r4[r5] = r10
            int r5 = r11.length
            java.lang.System.arraycopy(r11, r2, r4, r3, r5)
            com.google.common.collect.ImmutableSet r5 = construct(r0, r4)
            return r5
    }

    private static boolean shouldTrim(int r1, int r2) {
            int r0 = r2 >> 1
            int r2 = r2 >> 2
            int r0 = r0 + r2
            if (r1 >= r0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    @Override // com.google.common.collect.ImmutableCollection
    public com.google.common.collect.ImmutableList<E> asList() {
            r1 = this;
            com.google.common.collect.ImmutableList<E> r0 = r1.asList
            if (r0 != 0) goto La
            com.google.common.collect.ImmutableList r0 = r1.createAsList()
            r1.asList = r0
        La:
            return r0
    }

    public com.google.common.collect.ImmutableList<E> createAsList() {
            r2 = this;
            java.lang.Object[] r0 = r2.toArray()
            int r1 = com.google.common.collect.ImmutableList.$r8$clinit
            int r1 = r0.length
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.asImmutableList(r0, r1)
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object r3) {
            r2 = this;
            if (r3 != r2) goto L4
            r3 = 1
            return r3
        L4:
            boolean r0 = r3 instanceof com.google.common.collect.ImmutableSet
            if (r0 == 0) goto L23
            boolean r0 = r2.isHashCodeFast()
            if (r0 == 0) goto L23
            r0 = r3
            com.google.common.collect.ImmutableSet r0 = (com.google.common.collect.ImmutableSet) r0
            boolean r0 = r0.isHashCodeFast()
            if (r0 == 0) goto L23
            int r0 = r2.hashCode()
            int r1 = r3.hashCode()
            if (r0 == r1) goto L23
            r3 = 0
            return r3
        L23:
            boolean r3 = com.google.common.collect.Sets.equalsImpl(r2, r3)
            return r3
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
            r1 = this;
            int r0 = com.google.common.collect.Sets.hashCodeImpl(r1)
            return r0
    }

    public boolean isHashCodeFast() {
            r0 = this;
            boolean r0 = r0 instanceof com.google.common.collect.EmptyContiguousSet
            return r0
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public abstract com.google.common.collect.UnmodifiableIterator<E> iterator();

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            com.google.common.collect.UnmodifiableIterator r0 = r1.iterator()
            return r0
    }
}
