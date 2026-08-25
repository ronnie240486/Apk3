package com.google.common.collect;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.annotations.GwtCompatible(emulated = true, serializable = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class SingletonImmutableSet<E> extends com.google.common.collect.ImmutableSet<E> {
    public final transient E element;

    public SingletonImmutableSet(E r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            r0.element = r1
            return
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public com.google.common.collect.ImmutableList<E> asList() {
            r1 = this;
            E r0 = r1.element
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of(r0)
            return r0
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            E r0 = r1.element
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int copyIntoArray(java.lang.Object[] r2, int r3) {
            r1 = this;
            E r0 = r1.element
            r2[r3] = r0
            int r3 = r3 + 1
            return r3
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
            r1 = this;
            E r0 = r1.element
            int r0 = r0.hashCode()
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
            E r0 = r1.element
            com.google.common.collect.UnmodifiableIterator r0 = com.google.common.collect.Iterators.singletonIterator(r0)
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
            r0 = 1
            return r0
    }

    @Override // java.util.AbstractCollection
    public java.lang.String toString() {
            r3 = this;
            E r0 = r3.element
            java.lang.String r0 = r0.toString()
            r1 = 2
            int r1 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r1 = 91
            r2.append(r1)
            r2.append(r0)
            r0 = 93
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
    }
}
