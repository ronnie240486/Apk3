package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class Multisets {





    /* JADX INFO: renamed from: com.google.common.collect.Multisets$5, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    class AnonymousClass5 extends com.google.common.collect.TransformedIterator<com.google.common.collect.Multiset.Entry<java.lang.Object>, java.lang.Object> {
        public AnonymousClass5(java.util.Iterator r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.collect.TransformedIterator
        @com.google.common.collect.ParametricNullness
        public final java.lang.Object transform(com.google.common.collect.Multiset.Entry<java.lang.Object> r1) {
                r0 = this;
                com.google.common.collect.Multiset$Entry r1 = (com.google.common.collect.Multiset.Entry) r1
                java.lang.Object r1 = r1.getElement()
                return r1
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static abstract class AbstractEntry<E> implements com.google.common.collect.Multiset.Entry<E> {
        public AbstractEntry() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.collect.Multiset.Entry
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof com.google.common.collect.Multiset.Entry
                r1 = 0
                if (r0 == 0) goto L20
                com.google.common.collect.Multiset$Entry r4 = (com.google.common.collect.Multiset.Entry) r4
                int r0 = r3.getCount()
                int r2 = r4.getCount()
                if (r0 != r2) goto L20
                java.lang.Object r0 = r3.getElement()
                java.lang.Object r4 = r4.getElement()
                boolean r4 = com.google.common.base.Objects.equal(r0, r4)
                if (r4 == 0) goto L20
                r1 = 1
            L20:
                return r1
        }

        @Override // com.google.common.collect.Multiset.Entry
        public int hashCode() {
                r2 = this;
                java.lang.Object r0 = r2.getElement()
                if (r0 != 0) goto L8
                r0 = 0
                goto Lc
            L8:
                int r0 = r0.hashCode()
            Lc:
                int r1 = r2.getCount()
                r0 = r0 ^ r1
                return r0
        }

        @Override // com.google.common.collect.Multiset.Entry
        public java.lang.String toString() {
                r4 = this;
                java.lang.Object r0 = r4.getElement()
                java.lang.String r0 = java.lang.String.valueOf(r0)
                int r1 = r4.getCount()
                r2 = 1
                if (r1 != r2) goto L10
                goto L2a
            L10:
                int r2 = r0.length()
                int r2 = r2 + 14
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>(r2)
                r3.append(r0)
                java.lang.String r0 = " x "
                r3.append(r0)
                r3.append(r1)
                java.lang.String r0 = r3.toString()
            L2a:
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class DecreasingCount implements java.util.Comparator<com.google.common.collect.Multiset.Entry<?>> {
        public static final com.google.common.collect.Multisets.DecreasingCount INSTANCE = null;

        static {
                com.google.common.collect.Multisets$DecreasingCount r0 = new com.google.common.collect.Multisets$DecreasingCount
                r0.<init>()
                com.google.common.collect.Multisets.DecreasingCount.INSTANCE = r0
                return
        }

        private DecreasingCount() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(com.google.common.collect.Multiset.Entry<?> r1, com.google.common.collect.Multiset.Entry<?> r2) {
                r0 = this;
                int r2 = r2.getCount()
                int r1 = r1.getCount()
                int r2 = r2 - r1
                return r2
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(com.google.common.collect.Multiset.Entry<?> r1, com.google.common.collect.Multiset.Entry<?> r2) {
                r0 = this;
                com.google.common.collect.Multiset$Entry r1 = (com.google.common.collect.Multiset.Entry) r1
                com.google.common.collect.Multiset$Entry r2 = (com.google.common.collect.Multiset.Entry) r2
                int r1 = r0.compare2(r1, r2)
                return r1
        }
    }

    public static abstract class ElementSet<E> extends com.google.common.collect.Sets.ImprovedAbstractSet<E> {
        public ElementSet() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
                r1 = this;
                com.google.common.collect.Multiset r0 = r1.multiset()
                r0.clear()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.Multiset r0 = r1.multiset()
                boolean r2 = r0.contains(r2)
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(java.util.Collection<?> r2) {
                r1 = this;
                com.google.common.collect.Multiset r0 = r1.multiset()
                boolean r2 = r0.containsAll(r2)
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
                r1 = this;
                com.google.common.collect.Multiset r0 = r1.multiset()
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public abstract java.util.Iterator<E> iterator();

        public abstract com.google.common.collect.Multiset<E> multiset();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@javax.annotation.CheckForNull java.lang.Object r3) {
                r2 = this;
                com.google.common.collect.Multiset r0 = r2.multiset()
                r1 = 2147483647(0x7fffffff, float:NaN)
                int r3 = r0.remove(r3, r1)
                if (r3 <= 0) goto Lf
                r3 = 1
                goto L10
            Lf:
                r3 = 0
            L10:
                return r3
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                com.google.common.collect.Multiset r0 = r1.multiset()
                java.util.Set r0 = r0.entrySet()
                int r0 = r0.size()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static abstract class EntrySet<E> extends com.google.common.collect.Sets.ImprovedAbstractSet<com.google.common.collect.Multiset.Entry<E>> {
        public EntrySet() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
                r1 = this;
                com.google.common.collect.Multiset r0 = r1.multiset()
                r0.clear()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof com.google.common.collect.Multiset.Entry
                r1 = 0
                if (r0 == 0) goto L21
                com.google.common.collect.Multiset$Entry r4 = (com.google.common.collect.Multiset.Entry) r4
                int r0 = r4.getCount()
                if (r0 > 0) goto Le
                return r1
            Le:
                com.google.common.collect.Multiset r0 = r3.multiset()
                java.lang.Object r2 = r4.getElement()
                int r0 = r0.count(r2)
                int r4 = r4.getCount()
                if (r0 != r4) goto L21
                r1 = 1
            L21:
                return r1
        }

        public abstract com.google.common.collect.Multiset<E> multiset();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@javax.annotation.CheckForNull java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof com.google.common.collect.Multiset.Entry
                r1 = 0
                if (r0 == 0) goto L1a
                com.google.common.collect.Multiset$Entry r4 = (com.google.common.collect.Multiset.Entry) r4
                java.lang.Object r0 = r4.getElement()
                int r4 = r4.getCount()
                if (r4 == 0) goto L1a
                com.google.common.collect.Multiset r2 = r3.multiset()
                boolean r4 = r2.setCount(r0, r4, r1)
                return r4
            L1a:
                return r1
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class FilteredMultiset<E> extends com.google.common.collect.Multisets.ViewMultiset<E> {
        public final com.google.common.base.Predicate<? super E> predicate;
        public final com.google.common.collect.Multiset<E> unfiltered;


        public FilteredMultiset(com.google.common.collect.Multiset<E> r2, com.google.common.base.Predicate<? super E> r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
                com.google.common.collect.Multiset r2 = (com.google.common.collect.Multiset) r2
                r1.unfiltered = r2
                java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r3)
                com.google.common.base.Predicate r2 = (com.google.common.base.Predicate) r2
                r1.predicate = r2
                return
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public int add(@com.google.common.collect.ParametricNullness E r4, int r5) {
                r3 = this;
                com.google.common.base.Predicate<? super E> r0 = r3.predicate
                boolean r0 = r0.apply(r4)
                com.google.common.base.Predicate<? super E> r1 = r3.predicate
                java.lang.String r2 = "Element %s does not match predicate %s"
                com.google.common.base.Preconditions.checkArgument(r0, r2, r4, r1)
                com.google.common.collect.Multiset<E> r0 = r3.unfiltered
                int r4 = r0.add(r4, r5)
                return r4
        }

        @Override // com.google.common.collect.Multiset
        public int count(@javax.annotation.CheckForNull java.lang.Object r4) {
                r3 = this;
                com.google.common.collect.Multiset<E> r0 = r3.unfiltered
                int r0 = r0.count(r4)
                r1 = 0
                if (r0 <= 0) goto L14
                com.google.common.base.Predicate<? super E> r2 = r3.predicate
                boolean r4 = r2.apply(r4)
                if (r4 == 0) goto L12
                goto L13
            L12:
                r0 = 0
            L13:
                return r0
            L14:
                return r1
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final java.util.Set<E> createElementSet() {
                r2 = this;
                com.google.common.collect.Multiset<E> r0 = r2.unfiltered
                java.util.Set r0 = r0.elementSet()
                com.google.common.base.Predicate<? super E> r1 = r2.predicate
                java.util.Set r0 = com.google.common.collect.Sets.filter(r0, r1)
                return r0
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final java.util.Set<com.google.common.collect.Multiset.Entry<E>> createEntrySet() {
                r2 = this;
                com.google.common.collect.Multiset<E> r0 = r2.unfiltered
                java.util.Set r0 = r0.entrySet()
                com.google.common.collect.Multisets$FilteredMultiset$1 r1 = new com.google.common.collect.Multisets$FilteredMultiset$1
                r1.<init>(r2)
                java.util.Set r0 = com.google.common.collect.Sets.filter(r0, r1)
                return r0
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final java.util.Iterator<E> elementIterator() {
                r2 = this;
                java.lang.AssertionError r0 = new java.lang.AssertionError
                java.lang.String r1 = "should never be called"
                r0.<init>(r1)
                throw r0
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> entryIterator() {
                r2 = this;
                java.lang.AssertionError r0 = new java.lang.AssertionError
                java.lang.String r1 = "should never be called"
                r0.<init>(r1)
                throw r0
        }

        @Override // com.google.common.collect.Multisets.ViewMultiset, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
        public com.google.common.collect.UnmodifiableIterator<E> iterator() {
                r2 = this;
                com.google.common.collect.Multiset<E> r0 = r2.unfiltered
                java.util.Iterator r0 = r0.iterator()
                com.google.common.base.Predicate<? super E> r1 = r2.predicate
                com.google.common.collect.UnmodifiableIterator r0 = com.google.common.collect.Iterators.filter(r0, r1)
                return r0
        }

        @Override // com.google.common.collect.Multisets.ViewMultiset, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
        public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
                r1 = this;
                com.google.common.collect.UnmodifiableIterator r0 = r1.iterator()
                return r0
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public int remove(@javax.annotation.CheckForNull java.lang.Object r2, int r3) {
                r1 = this;
                java.lang.String r0 = "occurrences"
                com.google.common.collect.CollectPreconditions.checkNonnegative(r3, r0)
                if (r3 != 0) goto Lc
                int r2 = r1.count(r2)
                return r2
            Lc:
                boolean r0 = r1.contains(r2)
                if (r0 == 0) goto L19
                com.google.common.collect.Multiset<E> r0 = r1.unfiltered
                int r2 = r0.remove(r2, r3)
                goto L1a
            L19:
                r2 = 0
            L1a:
                return r2
        }
    }

    public static class ImmutableEntry<E> extends com.google.common.collect.Multisets.AbstractEntry<E> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final int count;

        @com.google.common.collect.ParametricNullness
        private final E element;

        public ImmutableEntry(@com.google.common.collect.ParametricNullness E r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.element = r1
                r0.count = r2
                java.lang.String r1 = "count"
                com.google.common.collect.CollectPreconditions.checkNonnegative(r2, r1)
                return
        }

        @Override // com.google.common.collect.Multiset.Entry
        public final int getCount() {
                r1 = this;
                int r0 = r1.count
                return r0
        }

        @Override // com.google.common.collect.Multiset.Entry
        @com.google.common.collect.ParametricNullness
        public final E getElement() {
                r1 = this;
                E r0 = r1.element
                return r0
        }

        @javax.annotation.CheckForNull
        public com.google.common.collect.Multisets.ImmutableEntry<E> nextInBucket() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class MultisetIteratorImpl<E> implements java.util.Iterator<E> {
        private boolean canRemove;

        @javax.annotation.CheckForNull
        private com.google.common.collect.Multiset.Entry<E> currentEntry;
        private final java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> entryIterator;
        private int laterCount;
        private final com.google.common.collect.Multiset<E> multiset;
        private int totalCount;

        public MultisetIteratorImpl(com.google.common.collect.Multiset<E> r1, java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> r2) {
                r0 = this;
                r0.<init>()
                r0.multiset = r1
                r0.entryIterator = r2
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                int r0 = r1.laterCount
                if (r0 > 0) goto Lf
                java.util.Iterator<com.google.common.collect.Multiset$Entry<E>> r0 = r1.entryIterator
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto Ld
                goto Lf
            Ld:
                r0 = 0
                goto L10
            Lf:
                r0 = 1
            L10:
                return r0
        }

        @Override // java.util.Iterator
        @com.google.common.collect.ParametricNullness
        public E next() {
                r2 = this;
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L30
                int r0 = r2.laterCount
                if (r0 != 0) goto L1c
                java.util.Iterator<com.google.common.collect.Multiset$Entry<E>> r0 = r2.entryIterator
                java.lang.Object r0 = r0.next()
                com.google.common.collect.Multiset$Entry r0 = (com.google.common.collect.Multiset.Entry) r0
                r2.currentEntry = r0
                int r0 = r0.getCount()
                r2.laterCount = r0
                r2.totalCount = r0
            L1c:
                int r0 = r2.laterCount
                r1 = 1
                int r0 = r0 - r1
                r2.laterCount = r0
                r2.canRemove = r1
                com.google.common.collect.Multiset$Entry<E> r0 = r2.currentEntry
                java.util.Objects.requireNonNull(r0)
                com.google.common.collect.Multiset$Entry r0 = (com.google.common.collect.Multiset.Entry) r0
                java.lang.Object r0 = r0.getElement()
                return r0
            L30:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r3 = this;
                boolean r0 = r3.canRemove
                com.google.common.collect.CollectPreconditions.checkRemove(r0)
                int r0 = r3.totalCount
                r1 = 1
                if (r0 != r1) goto L10
                java.util.Iterator<com.google.common.collect.Multiset$Entry<E>> r0 = r3.entryIterator
                r0.remove()
                goto L20
            L10:
                com.google.common.collect.Multiset<E> r0 = r3.multiset
                com.google.common.collect.Multiset$Entry<E> r2 = r3.currentEntry
                java.util.Objects.requireNonNull(r2)
                com.google.common.collect.Multiset$Entry r2 = (com.google.common.collect.Multiset.Entry) r2
                java.lang.Object r2 = r2.getElement()
                r0.remove(r2)
            L20:
                int r0 = r3.totalCount
                int r0 = r0 - r1
                r3.totalCount = r0
                r0 = 0
                r3.canRemove = r0
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class UnmodifiableMultiset<E> extends com.google.common.collect.ForwardingMultiset<E> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        public final com.google.common.collect.Multiset<? extends E> delegate;

        @javax.annotation.CheckForNull
        public transient java.util.Set<E> elementSet;

        @javax.annotation.CheckForNull
        public transient java.util.Set<com.google.common.collect.Multiset.Entry<E>> entrySet;

        public UnmodifiableMultiset(com.google.common.collect.Multiset<? extends E> r1) {
                r0 = this;
                r0.<init>()
                r0.delegate = r1
                return
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public int add(@com.google.common.collect.ParametricNullness E r1, int r2) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
        public boolean add(@com.google.common.collect.ParametricNullness E r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public boolean addAll(java.util.Collection<? extends E> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public void clear() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        public java.util.Set<E> createElementSet() {
                r1 = this;
                com.google.common.collect.Multiset<? extends E> r0 = r1.delegate
                java.util.Set r0 = r0.elementSet()
                java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
                return r0
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public com.google.common.collect.Multiset<E> delegate() {
                r1 = this;
                com.google.common.collect.Multiset<? extends E> r0 = r1.delegate
                return r0
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ java.lang.Object delegate() {
                r1 = this;
                com.google.common.collect.Multiset r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ java.util.Collection delegate() {
                r1 = this;
                com.google.common.collect.Multiset r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public java.util.Set<E> elementSet() {
                r1 = this;
                java.util.Set<E> r0 = r1.elementSet
                if (r0 != 0) goto La
                java.util.Set r0 = r1.createElementSet()
                r1.elementSet = r0
            La:
                return r0
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public java.util.Set<com.google.common.collect.Multiset.Entry<E>> entrySet() {
                r1 = this;
                java.util.Set<com.google.common.collect.Multiset$Entry<E>> r0 = r1.entrySet
                if (r0 != 0) goto L10
                com.google.common.collect.Multiset<? extends E> r0 = r1.delegate
                java.util.Set r0 = r0.entrySet()
                java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
                r1.entrySet = r0
            L10:
                return r0
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<E> iterator() {
                r1 = this;
                com.google.common.collect.Multiset<? extends E> r0 = r1.delegate
                java.util.Iterator r0 = r0.iterator()
                com.google.common.collect.UnmodifiableIterator r0 = com.google.common.collect.Iterators.unmodifiableIterator(r0)
                return r0
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public int remove(@javax.annotation.CheckForNull java.lang.Object r1, int r2) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean remove(@javax.annotation.CheckForNull java.lang.Object r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean removeAll(java.util.Collection<?> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean retainAll(java.util.Collection<?> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public int setCount(@com.google.common.collect.ParametricNullness E r1, int r2) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public boolean setCount(@com.google.common.collect.ParametricNullness E r1, int r2, int r3) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }
    }

    public static abstract class ViewMultiset<E> extends com.google.common.collect.AbstractMultiset<E> {
        private ViewMultiset() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ ViewMultiset(com.google.common.collect.Multisets.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
        public void clear() {
                r1 = this;
                java.util.Set r0 = r1.elementSet()
                r0.clear()
                return
        }

        @Override // com.google.common.collect.AbstractMultiset
        public int distinctElements() {
                r1 = this;
                java.util.Set r0 = r1.elementSet()
                int r0 = r0.size()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
        public java.util.Iterator<E> iterator() {
                r1 = this;
                java.util.Iterator r0 = com.google.common.collect.Multisets.iteratorImpl(r1)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public int size() {
                r5 = this;
                java.util.Set r0 = r5.entrySet()
                java.util.Iterator r0 = r0.iterator()
                r1 = 0
            La:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L1d
                java.lang.Object r3 = r0.next()
                com.google.common.collect.Multiset$Entry r3 = (com.google.common.collect.Multiset.Entry) r3
                int r3 = r3.getCount()
                long r3 = (long) r3
                long r1 = r1 + r3
                goto La
            L1d:
                int r0 = com.google.common.primitives.Ints.saturatedCast(r1)
                return r0
        }
    }

    private Multisets() {
            r0 = this;
            r0.<init>()
            return
    }

    private static <E> boolean addAllImpl(com.google.common.collect.Multiset<E> r3, com.google.common.collect.AbstractMapBasedMultiset<? extends E> r4) {
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L8
            r3 = 0
            return r3
        L8:
            com.google.common.base.Preconditions.checkNotNull(r3)
            com.google.common.collect.ObjectCountHashMap<E> r0 = r4.backingMap
            int r0 = r0.firstIndex()
        L11:
            if (r0 < 0) goto L29
            com.google.common.collect.ObjectCountHashMap<E> r1 = r4.backingMap
            java.lang.Object r1 = r1.getKey(r0)
            com.google.common.collect.ObjectCountHashMap<E> r2 = r4.backingMap
            int r2 = r2.getValue(r0)
            r3.add(r1, r2)
            com.google.common.collect.ObjectCountHashMap<E> r1 = r4.backingMap
            int r0 = r1.nextIndex(r0)
            goto L11
        L29:
            r3 = 1
            return r3
    }

    private static <E> boolean addAllImpl(com.google.common.collect.Multiset<E> r2, com.google.common.collect.Multiset<? extends E> r3) {
            boolean r0 = r3 instanceof com.google.common.collect.AbstractMapBasedMultiset
            if (r0 == 0) goto Lb
            com.google.common.collect.AbstractMapBasedMultiset r3 = (com.google.common.collect.AbstractMapBasedMultiset) r3
            boolean r2 = addAllImpl(r2, r3)
            return r2
        Lb:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L13
            r2 = 0
            return r2
        L13:
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L1b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L33
            java.lang.Object r0 = r3.next()
            com.google.common.collect.Multiset$Entry r0 = (com.google.common.collect.Multiset.Entry) r0
            java.lang.Object r1 = r0.getElement()
            int r0 = r0.getCount()
            r2.add(r1, r0)
            goto L1b
        L33:
            r2 = 1
            return r2
    }

    public static <E> boolean addAllImpl(com.google.common.collect.Multiset<E> r1, java.util.Collection<? extends E> r2) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Preconditions.checkNotNull(r2)
            boolean r0 = r2 instanceof com.google.common.collect.Multiset
            if (r0 == 0) goto L11
            com.google.common.collect.Multiset r2 = (com.google.common.collect.Multiset) r2
            boolean r1 = addAllImpl(r1, r2)
            return r1
        L11:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L19
            r1 = 0
            return r1
        L19:
            java.util.Iterator r2 = r2.iterator()
            boolean r1 = com.google.common.collect.Iterators.addAll(r1, r2)
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static boolean containsOccurrences(com.google.common.collect.Multiset<?> r2, com.google.common.collect.Multiset<?> r3) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.base.Preconditions.checkNotNull(r3)
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        Le:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r3.next()
            com.google.common.collect.Multiset$Entry r0 = (com.google.common.collect.Multiset.Entry) r0
            java.lang.Object r1 = r0.getElement()
            int r1 = r2.count(r1)
            int r0 = r0.getCount()
            if (r1 >= r0) goto Le
            r2 = 0
            return r2
        L2a:
            r2 = 1
            return r2
    }

    @com.google.common.annotations.Beta
    public static <E> com.google.common.collect.ImmutableMultiset<E> copyHighestCountFirst(com.google.common.collect.Multiset<E> r3) {
            java.util.Set r3 = r3.entrySet()
            r0 = 0
            com.google.common.collect.Multiset$Entry[] r0 = new com.google.common.collect.Multiset.Entry[r0]
            java.lang.Object[] r3 = r3.toArray(r0)
            com.google.common.collect.Multiset$Entry[] r3 = (com.google.common.collect.Multiset.Entry[]) r3
            com.google.common.collect.Multisets$DecreasingCount r0 = com.google.common.collect.Multisets.DecreasingCount.INSTANCE
            java.util.Arrays.sort(r3, r0)
            java.util.List r3 = java.util.Arrays.asList(r3)
            int r0 = com.google.common.collect.ImmutableMultiset.$r8$clinit
            com.google.common.collect.ImmutableMultiset$Builder r0 = new com.google.common.collect.ImmutableMultiset$Builder
            int r1 = r3.size()
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L25:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r3.next()
            com.google.common.collect.Multiset$Entry r1 = (com.google.common.collect.Multiset.Entry) r1
            java.lang.Object r2 = r1.getElement()
            int r1 = r1.getCount()
            r0.addCopies(r2, r1)
            goto L25
        L3d:
            com.google.common.collect.ImmutableMultiset r3 = r0.build()
            return r3
    }

    @com.google.common.annotations.Beta
    public static <E> com.google.common.collect.Multiset<E> difference(com.google.common.collect.Multiset<E> r1, com.google.common.collect.Multiset<?> r2) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.collect.Multisets$4 r0 = new com.google.common.collect.Multisets$4
            r0.<init>(r1, r2)
            return r0
    }

    public static boolean equalsImpl(com.google.common.collect.Multiset<?> r4, @javax.annotation.CheckForNull java.lang.Object r5) {
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.common.collect.Multiset
            r2 = 0
            if (r1 == 0) goto L4c
            com.google.common.collect.Multiset r5 = (com.google.common.collect.Multiset) r5
            int r1 = r4.size()
            int r3 = r5.size()
            if (r1 != r3) goto L4c
            java.util.Set r1 = r4.entrySet()
            int r1 = r1.size()
            java.util.Set r3 = r5.entrySet()
            int r3 = r3.size()
            if (r1 == r3) goto L28
            goto L4c
        L28:
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L30:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L4b
            java.lang.Object r1 = r5.next()
            com.google.common.collect.Multiset$Entry r1 = (com.google.common.collect.Multiset.Entry) r1
            java.lang.Object r3 = r1.getElement()
            int r3 = r4.count(r3)
            int r1 = r1.getCount()
            if (r3 == r1) goto L30
            return r2
        L4b:
            return r0
        L4c:
            return r2
    }

    @com.google.common.annotations.Beta
    public static <E> com.google.common.collect.Multiset<E> filter(com.google.common.collect.Multiset<E> r1, com.google.common.base.Predicate<? super E> r2) {
            boolean r0 = r1 instanceof com.google.common.collect.Multisets.FilteredMultiset
            if (r0 == 0) goto L14
            com.google.common.collect.Multisets$FilteredMultiset r1 = (com.google.common.collect.Multisets.FilteredMultiset) r1
            com.google.common.base.Predicate<? super E> r0 = r1.predicate
            com.google.common.base.Predicate r2 = com.google.common.base.Predicates.and(r0, r2)
            com.google.common.collect.Multisets$FilteredMultiset r0 = new com.google.common.collect.Multisets$FilteredMultiset
            com.google.common.collect.Multiset<E> r1 = r1.unfiltered
            r0.<init>(r1, r2)
            return r0
        L14:
            com.google.common.collect.Multisets$FilteredMultiset r0 = new com.google.common.collect.Multisets$FilteredMultiset
            r0.<init>(r1, r2)
            return r0
    }

    public static <E> com.google.common.collect.Multiset.Entry<E> immutableEntry(@com.google.common.collect.ParametricNullness E r1, int r2) {
            com.google.common.collect.Multisets$ImmutableEntry r0 = new com.google.common.collect.Multisets$ImmutableEntry
            r0.<init>(r1, r2)
            return r0
    }

    public static int inferDistinctElements(java.lang.Iterable<?> r1) {
            boolean r0 = r1 instanceof com.google.common.collect.Multiset
            if (r0 == 0) goto Lf
            com.google.common.collect.Multiset r1 = (com.google.common.collect.Multiset) r1
            java.util.Set r1 = r1.elementSet()
            int r1 = r1.size()
            return r1
        Lf:
            r1 = 11
            return r1
    }

    public static <E> com.google.common.collect.Multiset<E> intersection(com.google.common.collect.Multiset<E> r1, com.google.common.collect.Multiset<?> r2) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.collect.Multisets$2 r0 = new com.google.common.collect.Multisets$2
            r0.<init>(r1, r2)
            return r0
    }

    public static <E> java.util.Iterator<E> iteratorImpl(com.google.common.collect.Multiset<E> r2) {
            com.google.common.collect.Multisets$MultisetIteratorImpl r0 = new com.google.common.collect.Multisets$MultisetIteratorImpl
            java.util.Set r1 = r2.entrySet()
            java.util.Iterator r1 = r1.iterator()
            r0.<init>(r2, r1)
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static boolean removeOccurrences(com.google.common.collect.Multiset<?> r6, com.google.common.collect.Multiset<?> r7) {
            com.google.common.base.Preconditions.checkNotNull(r6)
            com.google.common.base.Preconditions.checkNotNull(r7)
            java.util.Set r0 = r6.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        Lf:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L39
            java.lang.Object r2 = r0.next()
            com.google.common.collect.Multiset$Entry r2 = (com.google.common.collect.Multiset.Entry) r2
            java.lang.Object r3 = r2.getElement()
            int r3 = r7.count(r3)
            int r4 = r2.getCount()
            r5 = 1
            if (r3 < r4) goto L2f
            r0.remove()
        L2d:
            r1 = 1
            goto Lf
        L2f:
            if (r3 <= 0) goto Lf
            java.lang.Object r1 = r2.getElement()
            r6.remove(r1, r3)
            goto L2d
        L39:
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static boolean removeOccurrences(com.google.common.collect.Multiset<?> r2, java.lang.Iterable<?> r3) {
            boolean r0 = r3 instanceof com.google.common.collect.Multiset
            if (r0 == 0) goto Lb
            com.google.common.collect.Multiset r3 = (com.google.common.collect.Multiset) r3
            boolean r2 = removeOccurrences(r2, r3)
            return r2
        Lb:
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.base.Preconditions.checkNotNull(r3)
            r0 = 0
            java.util.Iterator r3 = r3.iterator()
        L16:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r3.next()
            boolean r1 = r2.remove(r1)
            r0 = r0 | r1
            goto L16
        L26:
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static boolean retainOccurrences(com.google.common.collect.Multiset<?> r0, com.google.common.collect.Multiset<?> r1) {
            boolean r0 = retainOccurrencesImpl(r0, r1)
            return r0
    }

    private static <E> boolean retainOccurrencesImpl(com.google.common.collect.Multiset<E> r6, com.google.common.collect.Multiset<?> r7) {
            com.google.common.base.Preconditions.checkNotNull(r6)
            com.google.common.base.Preconditions.checkNotNull(r7)
            java.util.Set r0 = r6.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        Lf:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L39
            java.lang.Object r2 = r0.next()
            com.google.common.collect.Multiset$Entry r2 = (com.google.common.collect.Multiset.Entry) r2
            java.lang.Object r3 = r2.getElement()
            int r3 = r7.count(r3)
            r4 = 1
            if (r3 != 0) goto L2b
            r0.remove()
        L29:
            r1 = 1
            goto Lf
        L2b:
            int r5 = r2.getCount()
            if (r3 >= r5) goto Lf
            java.lang.Object r1 = r2.getElement()
            r6.setCount(r1, r3)
            goto L29
        L39:
            return r1
    }

    @com.google.common.annotations.Beta
    public static <E> com.google.common.collect.Multiset<E> sum(com.google.common.collect.Multiset<? extends E> r1, com.google.common.collect.Multiset<? extends E> r2) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.collect.Multisets$3 r0 = new com.google.common.collect.Multisets$3
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.common.annotations.Beta
    public static <E> com.google.common.collect.Multiset<E> union(com.google.common.collect.Multiset<? extends E> r1, com.google.common.collect.Multiset<? extends E> r2) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.collect.Multisets$1 r0 = new com.google.common.collect.Multisets$1
            r0.<init>(r1, r2)
            return r0
    }

    @java.lang.Deprecated
    public static <E> com.google.common.collect.Multiset<E> unmodifiableMultiset(com.google.common.collect.ImmutableMultiset<E> r0) {
            java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r0)
            com.google.common.collect.Multiset r0 = (com.google.common.collect.Multiset) r0
            return r0
    }

    public static <E> com.google.common.collect.Multiset<E> unmodifiableMultiset(com.google.common.collect.Multiset<? extends E> r1) {
            boolean r0 = r1 instanceof com.google.common.collect.Multisets.UnmodifiableMultiset
            if (r0 != 0) goto L15
            boolean r0 = r1 instanceof com.google.common.collect.ImmutableMultiset
            if (r0 == 0) goto L9
            goto L15
        L9:
            com.google.common.collect.Multisets$UnmodifiableMultiset r0 = new com.google.common.collect.Multisets$UnmodifiableMultiset
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.collect.Multiset r1 = (com.google.common.collect.Multiset) r1
            r0.<init>(r1)
            return r0
        L15:
            return r1
    }

    @com.google.common.annotations.Beta
    public static <E> com.google.common.collect.SortedMultiset<E> unmodifiableSortedMultiset(com.google.common.collect.SortedMultiset<E> r1) {
            com.google.common.collect.UnmodifiableSortedMultiset r0 = new com.google.common.collect.UnmodifiableSortedMultiset
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.collect.SortedMultiset r1 = (com.google.common.collect.SortedMultiset) r1
            r0.<init>(r1)
            return r0
    }
}
