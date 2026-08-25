package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible(emulated = true, serializable = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
class RegularImmutableList<E> extends com.google.common.collect.ImmutableList<E> {
    public static final com.google.common.collect.ImmutableList<java.lang.Object> EMPTY = null;

    @com.google.common.annotations.VisibleForTesting
    public final transient java.lang.Object[] array;
    private final transient int size;

    static {
            com.google.common.collect.RegularImmutableList r0 = new com.google.common.collect.RegularImmutableList
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r0.<init>(r2, r1)
            com.google.common.collect.RegularImmutableList.EMPTY = r0
            return
    }

    public RegularImmutableList(java.lang.Object[] r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.array = r1
            r0.size = r2
            return
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    public final int copyIntoArray(java.lang.Object[] r4, int r5) {
            r3 = this;
            java.lang.Object[] r0 = r3.array
            int r1 = r3.size
            r2 = 0
            java.lang.System.arraycopy(r0, r2, r4, r5, r1)
            int r4 = r3.size
            int r5 = r5 + r4
            return r5
    }

    @Override // java.util.List
    public E get(int r2) {
            r1 = this;
            int r0 = r1.size
            com.google.common.base.Preconditions.checkElementIndex(r2, r0)
            java.lang.Object[] r0 = r1.array
            r2 = r0[r2]
            java.util.Objects.requireNonNull(r2)
            return r2
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final java.lang.Object[] internalArray() {
            r1 = this;
            java.lang.Object[] r0 = r1.array
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

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean isPartialView() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
            r1 = this;
            int r0 = r1.size
            return r0
    }
}
