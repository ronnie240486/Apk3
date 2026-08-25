package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible(emulated = true, serializable = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class RegularImmutableSet<E> extends com.google.common.collect.ImmutableSet<E> {
    public static final com.google.common.collect.RegularImmutableSet<java.lang.Object> EMPTY = null;
    private static final java.lang.Object[] EMPTY_ARRAY = null;

    @com.google.common.annotations.VisibleForTesting
    public final transient java.lang.Object[] elements;
    private final transient int hashCode;
    private final transient int mask;
    private final transient int size;

    @com.google.common.annotations.VisibleForTesting
    public final transient java.lang.Object[] table;

    static {
            r0 = 0
            java.lang.Object[] r4 = new java.lang.Object[r0]
            com.google.common.collect.RegularImmutableSet.EMPTY_ARRAY = r4
            com.google.common.collect.RegularImmutableSet r0 = new com.google.common.collect.RegularImmutableSet
            r3 = 0
            r5 = 0
            r6 = 0
            r1 = r0
            r2 = r4
            r1.<init>(r2, r3, r4, r5, r6)
            com.google.common.collect.RegularImmutableSet.EMPTY = r0
            return
    }

    public RegularImmutableSet(java.lang.Object[] r1, int r2, java.lang.Object[] r3, int r4, int r5) {
            r0 = this;
            r0.<init>()
            r0.elements = r1
            r0.hashCode = r2
            r0.table = r3
            r0.mask = r4
            r0.size = r5
            return
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@javax.annotation.CheckForNull java.lang.Object r5) {
            r4 = this;
            java.lang.Object[] r0 = r4.table
            r1 = 0
            if (r5 == 0) goto L20
            int r2 = r0.length
            if (r2 != 0) goto L9
            goto L20
        L9:
            int r2 = com.google.common.collect.Hashing.smearedHash(r5)
        Ld:
            int r3 = r4.mask
            r2 = r2 & r3
            r3 = r0[r2]
            if (r3 != 0) goto L15
            return r1
        L15:
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L1d
            r5 = 1
            return r5
        L1d:
            int r2 = r2 + 1
            goto Ld
        L20:
            return r1
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int copyIntoArray(java.lang.Object[] r4, int r5) {
            r3 = this;
            java.lang.Object[] r0 = r3.elements
            int r1 = r3.size
            r2 = 0
            java.lang.System.arraycopy(r0, r2, r4, r5, r1)
            int r4 = r3.size
            int r5 = r5 + r4
            return r5
    }

    @Override // com.google.common.collect.ImmutableSet
    public final com.google.common.collect.ImmutableList<E> createAsList() {
            r2 = this;
            java.lang.Object[] r0 = r2.elements
            int r1 = r2.size
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.asImmutableList(r0, r1)
            return r0
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
            r1 = this;
            int r0 = r1.hashCode
            return r0
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final java.lang.Object[] internalArray() {
            r1 = this;
            java.lang.Object[] r0 = r1.elements
            return r0
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int internalArrayEnd() {
            r1 = this;
            int r0 = r1.size
            return r0
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int internalArrayStart() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.common.collect.ImmutableSet
    public final boolean isHashCodeFast() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean isPartialView() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public com.google.common.collect.UnmodifiableIterator<E> iterator() {
            r1 = this;
            com.google.common.collect.ImmutableList r0 = r1.asList()
            com.google.common.collect.UnmodifiableIterator r0 = r0.iterator()
            return r0
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            com.google.common.collect.UnmodifiableIterator r0 = r1.iterator()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
            r1 = this;
            int r0 = r1.size
            return r0
    }
}
