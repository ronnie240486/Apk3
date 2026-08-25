package com.google.common.collect;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.annotations.GwtCompatible(emulated = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
class RegularImmutableAsList<E> extends com.google.common.collect.ImmutableAsList<E> {
    private final com.google.common.collect.ImmutableCollection<E> delegate;
    private final com.google.common.collect.ImmutableList<? extends E> delegateList;

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    @com.google.common.annotations.GwtIncompatible
    public final int copyIntoArray(java.lang.Object[] r2, int r3) {
            r1 = this;
            com.google.common.collect.ImmutableList<? extends E> r0 = r1.delegateList
            int r2 = r0.copyIntoArray(r2, r3)
            return r2
    }

    @Override // com.google.common.collect.ImmutableAsList
    public final com.google.common.collect.ImmutableCollection<E> delegateCollection() {
            r1 = this;
            com.google.common.collect.ImmutableCollection<E> r0 = r1.delegate
            return r0
    }

    @Override // java.util.List
    public E get(int r2) {
            r1 = this;
            com.google.common.collect.ImmutableList<? extends E> r0 = r1.delegateList
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // com.google.common.collect.ImmutableCollection
    @javax.annotation.CheckForNull
    public final java.lang.Object[] internalArray() {
            r1 = this;
            com.google.common.collect.ImmutableList<? extends E> r0 = r1.delegateList
            java.lang.Object[] r0 = r0.internalArray()
            return r0
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int internalArrayEnd() {
            r1 = this;
            com.google.common.collect.ImmutableList<? extends E> r0 = r1.delegateList
            int r0 = r0.internalArrayEnd()
            return r0
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int internalArrayStart() {
            r1 = this;
            com.google.common.collect.ImmutableList<? extends E> r0 = r1.delegateList
            int r0 = r0.internalArrayStart()
            return r0
    }

    @Override // com.google.common.collect.ImmutableList, java.util.List
    public com.google.common.collect.UnmodifiableListIterator<E> listIterator(int r2) {
            r1 = this;
            com.google.common.collect.ImmutableList<? extends E> r0 = r1.delegateList
            com.google.common.collect.UnmodifiableListIterator r2 = r0.listIterator(r2)
            return r2
    }

    @Override // com.google.common.collect.ImmutableList, java.util.List
    public /* bridge */ /* synthetic */ java.util.ListIterator listIterator(int r1) {
            r0 = this;
            com.google.common.collect.UnmodifiableListIterator r1 = r0.listIterator(r1)
            return r1
    }
}
