package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible(emulated = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
abstract class AbstractSortedMultiset<E> extends com.google.common.collect.AbstractMultiset<E> implements com.google.common.collect.SortedMultiset<E> {

    @com.google.common.collect.GwtTransient
    public final java.util.Comparator<? super E> comparator;

    @javax.annotation.CheckForNull
    private transient com.google.common.collect.SortedMultiset<E> descendingMultiset;


    public AbstractSortedMultiset() {
            r1 = this;
            com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.natural()
            r1.<init>(r0)
            return
    }

    public AbstractSortedMultiset(java.util.Comparator<? super E> r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.util.Comparator r1 = (java.util.Comparator) r1
            r0.comparator = r1
            return
    }

    @Override // com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public java.util.Comparator<? super E> comparator() {
            r1 = this;
            java.util.Comparator<? super E> r0 = r1.comparator
            return r0
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final java.util.Set createElementSet() {
            r1 = this;
            com.google.common.collect.SortedMultisets$NavigableElementSet r0 = new com.google.common.collect.SortedMultisets$NavigableElementSet
            r0.<init>(r1)
            return r0
    }

    public abstract java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> descendingEntryIterator();

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.SortedMultiset<E> descendingMultiset() {
            r1 = this;
            com.google.common.collect.SortedMultiset<E> r0 = r1.descendingMultiset
            if (r0 != 0) goto Lb
            com.google.common.collect.AbstractSortedMultiset$1DescendingMultisetImpl r0 = new com.google.common.collect.AbstractSortedMultiset$1DescendingMultisetImpl
            r0.<init>(r1)
            r1.descendingMultiset = r0
        Lb:
            return r0
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public java.util.NavigableSet<E> elementSet() {
            r1 = this;
            java.util.Set r0 = super.elementSet()
            java.util.NavigableSet r0 = (java.util.NavigableSet) r0
            return r0
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ java.util.Set elementSet() {
            r1 = this;
            java.util.NavigableSet r0 = r1.elementSet()
            return r0
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ java.util.SortedSet elementSet() {
            r1 = this;
            java.util.NavigableSet r0 = r1.elementSet()
            return r0
    }

    @Override // com.google.common.collect.SortedMultiset
    @javax.annotation.CheckForNull
    public com.google.common.collect.Multiset.Entry<E> firstEntry() {
            r2 = this;
            java.util.Iterator r0 = r2.entryIterator()
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L11
            java.lang.Object r0 = r0.next()
            com.google.common.collect.Multiset$Entry r0 = (com.google.common.collect.Multiset.Entry) r0
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }

    @Override // com.google.common.collect.SortedMultiset
    @javax.annotation.CheckForNull
    public com.google.common.collect.Multiset.Entry<E> lastEntry() {
            r2 = this;
            java.util.Iterator r0 = r2.descendingEntryIterator()
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L11
            java.lang.Object r0 = r0.next()
            com.google.common.collect.Multiset$Entry r0 = (com.google.common.collect.Multiset.Entry) r0
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }

    @Override // com.google.common.collect.SortedMultiset
    @javax.annotation.CheckForNull
    public com.google.common.collect.Multiset.Entry<E> pollFirstEntry() {
            r3 = this;
            java.util.Iterator r0 = r3.entryIterator()
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            com.google.common.collect.Multiset$Entry r1 = (com.google.common.collect.Multiset.Entry) r1
            java.lang.Object r2 = r1.getElement()
            int r1 = r1.getCount()
            com.google.common.collect.Multiset$Entry r1 = com.google.common.collect.Multisets.immutableEntry(r2, r1)
            r0.remove()
            return r1
        L20:
            r0 = 0
            return r0
    }

    @Override // com.google.common.collect.SortedMultiset
    @javax.annotation.CheckForNull
    public com.google.common.collect.Multiset.Entry<E> pollLastEntry() {
            r3 = this;
            java.util.Iterator r0 = r3.descendingEntryIterator()
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            com.google.common.collect.Multiset$Entry r1 = (com.google.common.collect.Multiset.Entry) r1
            java.lang.Object r2 = r1.getElement()
            int r1 = r1.getCount()
            com.google.common.collect.Multiset$Entry r1 = com.google.common.collect.Multisets.immutableEntry(r2, r1)
            r0.remove()
            return r1
        L20:
            r0 = 0
            return r0
    }

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.SortedMultiset<E> subMultiset(@com.google.common.collect.ParametricNullness E r1, com.google.common.collect.BoundType r2, @com.google.common.collect.ParametricNullness E r3, com.google.common.collect.BoundType r4) {
            r0 = this;
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.base.Preconditions.checkNotNull(r4)
            com.google.common.collect.SortedMultiset r1 = r0.tailMultiset(r1, r2)
            com.google.common.collect.SortedMultiset r1 = r1.headMultiset(r3, r4)
            return r1
    }
}
