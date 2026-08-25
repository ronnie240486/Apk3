package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
abstract class AbstractMultiset<E> extends java.util.AbstractCollection<E> implements com.google.common.collect.Multiset<E> {

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Set<E> elementSet;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Set<com.google.common.collect.Multiset.Entry<E>> entrySet;

    /* JADX INFO: loaded from: classes2.dex */
    public class ElementSet extends com.google.common.collect.Multisets.ElementSet<E> {
        public final /* synthetic */ com.google.common.collect.AbstractMultiset this$0;

        public ElementSet(com.google.common.collect.AbstractMultiset r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // com.google.common.collect.Multisets.ElementSet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<E> iterator() {
                r1 = this;
                com.google.common.collect.AbstractMultiset r0 = r1.this$0
                java.util.Iterator r0 = r0.elementIterator()
                return r0
        }

        @Override // com.google.common.collect.Multisets.ElementSet
        public final com.google.common.collect.Multiset<E> multiset() {
                r1 = this;
                com.google.common.collect.AbstractMultiset r0 = r1.this$0
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class EntrySet extends com.google.common.collect.Multisets.EntrySet<E> {
        public final /* synthetic */ com.google.common.collect.AbstractMultiset this$0;

        public EntrySet(com.google.common.collect.AbstractMultiset r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> iterator() {
                r1 = this;
                com.google.common.collect.AbstractMultiset r0 = r1.this$0
                java.util.Iterator r0 = r0.entryIterator()
                return r0
        }

        @Override // com.google.common.collect.Multisets.EntrySet
        public com.google.common.collect.Multiset<E> multiset() {
                r1 = this;
                com.google.common.collect.AbstractMultiset r0 = r1.this$0
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                com.google.common.collect.AbstractMultiset r0 = r1.this$0
                int r0 = r0.distinctElements()
                return r0
        }
    }

    public AbstractMultiset() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public int add(@com.google.common.collect.ParametricNullness E r1, int r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final boolean add(@com.google.common.collect.ParametricNullness E r2) {
            r1 = this;
            r0 = 1
            r1.add(r2, r0)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final boolean addAll(java.util.Collection<? extends E> r1) {
            r0 = this;
            boolean r1 = com.google.common.collect.Multisets.addAllImpl(r0, r1)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract void clear();

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public boolean contains(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            int r1 = r0.count(r1)
            if (r1 <= 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    public java.util.Set<E> createElementSet() {
            r1 = this;
            com.google.common.collect.AbstractMultiset$ElementSet r0 = new com.google.common.collect.AbstractMultiset$ElementSet
            r0.<init>(r1)
            return r0
    }

    public java.util.Set<com.google.common.collect.Multiset.Entry<E>> createEntrySet() {
            r1 = this;
            com.google.common.collect.AbstractMultiset$EntrySet r0 = new com.google.common.collect.AbstractMultiset$EntrySet
            r0.<init>(r1)
            return r0
    }

    public abstract int distinctElements();

    public abstract java.util.Iterator<E> elementIterator();

    @Override // com.google.common.collect.Multiset
    public java.util.Set<E> elementSet() {
            r1 = this;
            java.util.Set<E> r0 = r1.elementSet
            if (r0 != 0) goto La
            java.util.Set r0 = r1.createElementSet()
            r1.elementSet = r0
        La:
            return r0
    }

    public abstract java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> entryIterator();

    @Override // com.google.common.collect.Multiset
    public java.util.Set<com.google.common.collect.Multiset.Entry<E>> entrySet() {
            r1 = this;
            java.util.Set<com.google.common.collect.Multiset$Entry<E>> r0 = r1.entrySet
            if (r0 != 0) goto La
            java.util.Set r0 = r1.createEntrySet()
            r1.entrySet = r0
        La:
            return r0
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            boolean r1 = com.google.common.collect.Multisets.equalsImpl(r0, r1)
            return r1
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public final int hashCode() {
            r1 = this;
            java.util.Set r0 = r1.entrySet()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            java.util.Set r0 = r1.entrySet()
            boolean r0 = r0.isEmpty()
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public int remove(@javax.annotation.CheckForNull java.lang.Object r1, int r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final boolean remove(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            r0 = 1
            int r2 = r1.remove(r2, r0)
            if (r2 <= 0) goto L8
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final boolean removeAll(java.util.Collection<?> r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.common.collect.Multiset
            if (r0 == 0) goto La
            com.google.common.collect.Multiset r2 = (com.google.common.collect.Multiset) r2
            java.util.Set r2 = r2.elementSet()
        La:
            java.util.Set r0 = r1.elementSet()
            boolean r2 = r0.removeAll(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final boolean retainAll(java.util.Collection<?> r2) {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r2)
            boolean r0 = r2 instanceof com.google.common.collect.Multiset
            if (r0 == 0) goto Ld
            com.google.common.collect.Multiset r2 = (com.google.common.collect.Multiset) r2
            java.util.Set r2 = r2.elementSet()
        Ld:
            java.util.Set r0 = r1.elementSet()
            boolean r2 = r0.retainAll(r2)
            return r2
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public int setCount(@com.google.common.collect.ParametricNullness E r2, int r3) {
            r1 = this;
            java.lang.String r0 = "count"
            com.google.common.collect.CollectPreconditions.checkNonnegative(r3, r0)
            int r0 = r1.count(r2)
            int r3 = r3 - r0
            if (r3 <= 0) goto L10
            r1.add(r2, r3)
            goto L16
        L10:
            if (r3 >= 0) goto L16
            int r3 = -r3
            r1.remove(r2, r3)
        L16:
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean setCount(@com.google.common.collect.ParametricNullness E r2, int r3, int r4) {
            r1 = this;
            java.lang.String r0 = "oldCount"
            com.google.common.collect.CollectPreconditions.checkNonnegative(r3, r0)
            java.lang.String r0 = "newCount"
            com.google.common.collect.CollectPreconditions.checkNonnegative(r4, r0)
            int r0 = r1.count(r2)
            if (r0 != r3) goto L15
            r1.setCount(r2, r4)
            r2 = 1
            goto L16
        L15:
            r2 = 0
        L16:
            return r2
    }

    @Override // java.util.AbstractCollection, com.google.common.collect.Multiset
    public final java.lang.String toString() {
            r1 = this;
            java.util.Set r0 = r1.entrySet()
            java.lang.String r0 = r0.toString()
            return r0
    }
}
