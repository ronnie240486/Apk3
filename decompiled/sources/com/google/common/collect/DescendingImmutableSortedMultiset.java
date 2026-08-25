package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtIncompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class DescendingImmutableSortedMultiset<E> extends com.google.common.collect.ImmutableSortedMultiset<E> {
    private final transient com.google.common.collect.ImmutableSortedMultiset<E> forward;

    public DescendingImmutableSortedMultiset(com.google.common.collect.ImmutableSortedMultiset<E> r1) {
            r0 = this;
            r0.<init>()
            r0.forward = r1
            return
    }

    @Override // com.google.common.collect.Multiset
    public int count(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            com.google.common.collect.ImmutableSortedMultiset<E> r0 = r1.forward
            int r2 = r0.count(r2)
            return r2
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public com.google.common.collect.ImmutableSortedMultiset<E> descendingMultiset() {
            r1 = this;
            com.google.common.collect.ImmutableSortedMultiset<E> r0 = r1.forward
            return r0
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ com.google.common.collect.SortedMultiset descendingMultiset() {
            r1 = this;
            com.google.common.collect.ImmutableSortedMultiset r0 = r1.descendingMultiset()
            return r0
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableSet elementSet() {
            r1 = this;
            com.google.common.collect.ImmutableSortedSet r0 = r1.elementSet()
            return r0
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public com.google.common.collect.ImmutableSortedSet<E> elementSet() {
            r1 = this;
            com.google.common.collect.ImmutableSortedMultiset<E> r0 = r1.forward
            com.google.common.collect.ImmutableSortedSet r0 = r0.elementSet()
            com.google.common.collect.ImmutableSortedSet r0 = r0.descendingSet()
            return r0
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ java.util.NavigableSet elementSet() {
            r1 = this;
            com.google.common.collect.ImmutableSortedSet r0 = r1.elementSet()
            return r0
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ java.util.Set elementSet() {
            r1 = this;
            com.google.common.collect.ImmutableSortedSet r0 = r1.elementSet()
            return r0
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ java.util.SortedSet elementSet() {
            r1 = this;
            com.google.common.collect.ImmutableSortedSet r0 = r1.elementSet()
            return r0
    }

    @Override // com.google.common.collect.SortedMultiset
    @javax.annotation.CheckForNull
    public com.google.common.collect.Multiset.Entry<E> firstEntry() {
            r1 = this;
            com.google.common.collect.ImmutableSortedMultiset<E> r0 = r1.forward
            com.google.common.collect.Multiset$Entry r0 = r0.lastEntry()
            return r0
    }

    @Override // com.google.common.collect.ImmutableMultiset
    public final com.google.common.collect.Multiset.Entry<E> getEntry(int r2) {
            r1 = this;
            com.google.common.collect.ImmutableSortedMultiset<E> r0 = r1.forward
            com.google.common.collect.ImmutableSet r0 = r0.entrySet()
            com.google.common.collect.ImmutableList r0 = r0.asList()
            com.google.common.collect.ImmutableList r0 = r0.reverse()
            java.lang.Object r2 = r0.get(r2)
            com.google.common.collect.Multiset$Entry r2 = (com.google.common.collect.Multiset.Entry) r2
            return r2
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public com.google.common.collect.ImmutableSortedMultiset<E> headMultiset(E r2, com.google.common.collect.BoundType r3) {
            r1 = this;
            com.google.common.collect.ImmutableSortedMultiset<E> r0 = r1.forward
            com.google.common.collect.ImmutableSortedMultiset r2 = r0.tailMultiset(r2, r3)
            com.google.common.collect.ImmutableSortedMultiset r2 = r2.descendingMultiset()
            return r2
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ com.google.common.collect.SortedMultiset headMultiset(java.lang.Object r1, com.google.common.collect.BoundType r2) {
            r0 = this;
            com.google.common.collect.ImmutableSortedMultiset r1 = r0.headMultiset(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean isPartialView() {
            r1 = this;
            com.google.common.collect.ImmutableSortedMultiset<E> r0 = r1.forward
            boolean r0 = r0.isPartialView()
            return r0
    }

    @Override // com.google.common.collect.SortedMultiset
    @javax.annotation.CheckForNull
    public com.google.common.collect.Multiset.Entry<E> lastEntry() {
            r1 = this;
            com.google.common.collect.ImmutableSortedMultiset<E> r0 = r1.forward
            com.google.common.collect.Multiset$Entry r0 = r0.firstEntry()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
            r1 = this;
            com.google.common.collect.ImmutableSortedMultiset<E> r0 = r1.forward
            int r0 = r0.size()
            return r0
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public com.google.common.collect.ImmutableSortedMultiset<E> tailMultiset(E r2, com.google.common.collect.BoundType r3) {
            r1 = this;
            com.google.common.collect.ImmutableSortedMultiset<E> r0 = r1.forward
            com.google.common.collect.ImmutableSortedMultiset r2 = r0.headMultiset(r2, r3)
            com.google.common.collect.ImmutableSortedMultiset r2 = r2.descendingMultiset()
            return r2
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ com.google.common.collect.SortedMultiset tailMultiset(java.lang.Object r1, com.google.common.collect.BoundType r2) {
            r0 = this;
            com.google.common.collect.ImmutableSortedMultiset r1 = r0.tailMultiset(r1, r2)
            return r1
    }
}
