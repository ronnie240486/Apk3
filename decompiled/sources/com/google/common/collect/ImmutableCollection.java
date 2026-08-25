package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible(emulated = true)
@com.google.errorprone.annotations.DoNotMock("Use ImmutableList.of or another implementation")
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ImmutableCollection<E> extends java.util.AbstractCollection<E> implements java.io.Serializable {
    private static final java.lang.Object[] EMPTY_ARRAY = null;

    public static abstract class ArrayBasedBuilder<E> extends com.google.common.collect.ImmutableCollection.Builder<E> {
        public java.lang.Object[] contents;
        public boolean forceCopy;
        public int size;

        public ArrayBasedBuilder(int r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "initialCapacity"
                com.google.common.collect.CollectPreconditions.checkNonnegative(r2, r0)
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r1.contents = r2
                r2 = 0
                r1.size = r2
                return
        }

        private void getReadyToExpandTo(int r4) {
                r3 = this;
                java.lang.Object[] r0 = r3.contents
                int r1 = r0.length
                r2 = 0
                if (r1 >= r4) goto L14
                int r1 = r0.length
                int r4 = com.google.common.collect.ImmutableCollection.Builder.expandedCapacity(r1, r4)
                java.lang.Object[] r4 = java.util.Arrays.copyOf(r0, r4)
                r3.contents = r4
                r3.forceCopy = r2
                goto L22
            L14:
                boolean r4 = r3.forceCopy
                if (r4 == 0) goto L22
                java.lang.Object r4 = r0.clone()
                java.lang.Object[] r4 = (java.lang.Object[]) r4
                r3.contents = r4
                r3.forceCopy = r2
            L22:
                return
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableCollection.ArrayBasedBuilder<E> add(E r4) {
                r3 = this;
                com.google.common.base.Preconditions.checkNotNull(r4)
                int r0 = r3.size
                int r0 = r0 + 1
                r3.getReadyToExpandTo(r0)
                java.lang.Object[] r0 = r3.contents
                int r1 = r3.size
                int r2 = r1 + 1
                r3.size = r2
                r0[r1] = r4
                return r3
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection.Builder add(java.lang.Object r1) {
                r0 = this;
                com.google.common.collect.ImmutableCollection$ArrayBasedBuilder r1 = r0.add(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableCollection.Builder<E> add(E... r5) {
                r4 = this;
                int r0 = r5.length
                com.google.common.collect.ObjectArrays.checkElementsNotNull(r5, r0)
                int r1 = r4.size
                int r1 = r1 + r0
                r4.getReadyToExpandTo(r1)
                java.lang.Object[] r1 = r4.contents
                int r2 = r4.size
                r3 = 0
                java.lang.System.arraycopy(r5, r3, r1, r2, r0)
                int r5 = r4.size
                int r5 = r5 + r0
                r4.size = r5
                return r4
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableCollection.Builder<E> addAll(java.lang.Iterable<? extends E> r4) {
                r3 = this;
                boolean r0 = r4 instanceof java.util.Collection
                if (r0 == 0) goto L22
                r0 = r4
                java.util.Collection r0 = (java.util.Collection) r0
                int r1 = r3.size
                int r2 = r0.size()
                int r2 = r2 + r1
                r3.getReadyToExpandTo(r2)
                boolean r1 = r0 instanceof com.google.common.collect.ImmutableCollection
                if (r1 == 0) goto L22
                com.google.common.collect.ImmutableCollection r0 = (com.google.common.collect.ImmutableCollection) r0
                java.lang.Object[] r4 = r3.contents
                int r1 = r3.size
                int r4 = r0.copyIntoArray(r4, r1)
                r3.size = r4
                return r3
            L22:
                super.addAll(r4)
                return r3
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @com.google.errorprone.annotations.DoNotMock
    public static abstract class Builder<E> {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public static int expandedCapacity(int r1, int r2) {
                if (r2 < 0) goto L17
                int r0 = r1 >> 1
                int r1 = r1 + r0
                int r1 = r1 + 1
                if (r1 >= r2) goto L11
                int r2 = r2 + (-1)
                int r1 = java.lang.Integer.highestOneBit(r2)
                int r1 = r1 << 1
            L11:
                if (r1 >= 0) goto L16
                r1 = 2147483647(0x7fffffff, float:NaN)
            L16:
                return r1
            L17:
                java.lang.AssertionError r1 = new java.lang.AssertionError
                java.lang.String r2 = "cannot store more than MAX_VALUE elements"
                r1.<init>(r2)
                throw r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public abstract com.google.common.collect.ImmutableCollection.Builder<E> add(E r1);

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableCollection.Builder<E> add(E... r4) {
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

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableCollection.Builder<E> addAll(java.lang.Iterable<? extends E> r2) {
                r1 = this;
                java.util.Iterator r2 = r2.iterator()
            L4:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L12
                java.lang.Object r0 = r2.next()
                r1.add(r0)
                goto L4
            L12:
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableCollection.Builder<E> addAll(java.util.Iterator<? extends E> r2) {
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

        public abstract com.google.common.collect.ImmutableCollection<E> build();
    }

    static {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.google.common.collect.ImmutableCollection.EMPTY_ARRAY = r0
            return
    }

    public ImmutableCollection() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public final boolean add(E r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public final boolean addAll(java.util.Collection<? extends E> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    public com.google.common.collect.ImmutableList<E> asList() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Lb
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()
            goto L16
        Lb:
            java.lang.Object[] r0 = r2.toArray()
            int r1 = com.google.common.collect.ImmutableList.$r8$clinit
            int r1 = r0.length
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.asImmutableList(r0, r1)
        L16:
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public final void clear() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(@javax.annotation.CheckForNull java.lang.Object r1);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public int copyIntoArray(java.lang.Object[] r4, int r5) {
            r3 = this;
            com.google.common.collect.UnmodifiableIterator r0 = r3.iterator()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L14
            java.lang.Object r1 = r0.next()
            int r2 = r5 + 1
            r4[r5] = r1
            r5 = r2
            goto L4
        L14:
            return r5
    }

    @javax.annotation.CheckForNull
    public java.lang.Object[] internalArray() {
            r1 = this;
            r0 = 0
            return r0
    }

    public int internalArrayEnd() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public int internalArrayStart() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public abstract boolean isPartialView();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public abstract com.google.common.collect.UnmodifiableIterator<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            com.google.common.collect.UnmodifiableIterator r0 = r1.iterator()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public final boolean remove(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public final boolean removeAll(java.util.Collection<?> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public final boolean retainAll(java.util.Collection<?> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray() {
            r1 = this;
            java.lang.Object[] r0 = com.google.common.collect.ImmutableCollection.EMPTY_ARRAY
            java.lang.Object[] r0 = r1.toArray(r0)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final <T> T[] toArray(T[] r4) {
            r3 = this;
            com.google.common.base.Preconditions.checkNotNull(r4)
            int r0 = r3.size()
            int r1 = r4.length
            if (r1 >= r0) goto L26
            java.lang.Object[] r1 = r3.internalArray()
            if (r1 == 0) goto L21
            int r0 = r3.internalArrayStart()
            int r2 = r3.internalArrayEnd()
            java.lang.Class r4 = r4.getClass()
            java.lang.Object[] r4 = java.util.Arrays.copyOfRange(r1, r0, r2, r4)
            return r4
        L21:
            java.lang.Object[] r4 = com.google.common.collect.ObjectArrays.newArray(r4, r0)
            goto L2c
        L26:
            int r1 = r4.length
            if (r1 <= r0) goto L2c
            r1 = 0
            r4[r0] = r1
        L2c:
            r0 = 0
            r3.copyIntoArray(r4, r0)
            return r4
    }
}
