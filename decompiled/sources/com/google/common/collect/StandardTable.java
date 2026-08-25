package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
class StandardTable<R, C, V> extends com.google.common.collect.AbstractTable<R, C, V> implements java.io.Serializable {
    private static final long serialVersionUID = 0;

    @com.google.common.collect.GwtTransient
    public final java.util.Map<R, java.util.Map<C, V>> backingMap;

    @javax.annotation.CheckForNull
    private transient java.util.Set<C> columnKeySet;

    @javax.annotation.CheckForNull
    private transient com.google.common.collect.StandardTable<R, C, V>.ColumnMap columnMap;

    @com.google.common.collect.GwtTransient
    public final com.google.common.base.Supplier<? extends java.util.Map<C, V>> factory;

    @javax.annotation.CheckForNull
    private transient java.util.Map<R, java.util.Map<C, V>> rowMap;

    /* JADX INFO: renamed from: com.google.common.collect.StandardTable$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes.dex */
    public class CellIterator implements java.util.Iterator<com.google.common.collect.Table.Cell<R, C, V>> {
        public java.util.Iterator<java.util.Map.Entry<C, V>> columnIterator;

        @javax.annotation.CheckForNull
        public java.util.Map.Entry<R, java.util.Map<C, V>> rowEntry;
        public final java.util.Iterator<java.util.Map.Entry<R, java.util.Map<C, V>>> rowIterator;

        private CellIterator(com.google.common.collect.StandardTable r1) {
                r0 = this;
                r0.<init>()
                java.util.Map<R, java.util.Map<C, V>> r1 = r1.backingMap
                java.util.Set r1 = r1.entrySet()
                java.util.Iterator r1 = r1.iterator()
                r0.rowIterator = r1
                com.google.common.collect.Iterators$EmptyModifiableIterator r1 = com.google.common.collect.Iterators.EmptyModifiableIterator.INSTANCE
                r0.columnIterator = r1
                return
        }

        public /* synthetic */ CellIterator(com.google.common.collect.StandardTable r1, com.google.common.collect.StandardTable.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                java.util.Iterator<java.util.Map$Entry<R, java.util.Map<C, V>>> r0 = r1.rowIterator
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L13
                java.util.Iterator<java.util.Map$Entry<C, V>> r0 = r1.columnIterator
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L11
                goto L13
            L11:
                r0 = 0
                goto L14
            L13:
                r0 = 1
            L14:
                return r0
        }

        @Override // java.util.Iterator
        public com.google.common.collect.Table.Cell<R, C, V> next() {
                r3 = this;
                java.util.Iterator<java.util.Map$Entry<C, V>> r0 = r3.columnIterator
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L22
                java.util.Iterator<java.util.Map$Entry<R, java.util.Map<C, V>>> r0 = r3.rowIterator
                java.lang.Object r0 = r0.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                r3.rowEntry = r0
                java.lang.Object r0 = r0.getValue()
                java.util.Map r0 = (java.util.Map) r0
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
                r3.columnIterator = r0
            L22:
                java.util.Map$Entry<R, java.util.Map<C, V>> r0 = r3.rowEntry
                java.util.Objects.requireNonNull(r0)
                java.util.Iterator<java.util.Map$Entry<C, V>> r0 = r3.columnIterator
                java.lang.Object r0 = r0.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.util.Map$Entry<R, java.util.Map<C, V>> r1 = r3.rowEntry
                java.lang.Object r1 = r1.getKey()
                java.lang.Object r2 = r0.getKey()
                java.lang.Object r0 = r0.getValue()
                com.google.common.collect.Table$Cell r0 = com.google.common.collect.Tables.immutableCell(r1, r2, r0)
                return r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Object next() {
                r1 = this;
                com.google.common.collect.Table$Cell r0 = r1.next()
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r1 = this;
                java.util.Iterator<java.util.Map$Entry<C, V>> r0 = r1.columnIterator
                r0.remove()
                java.util.Map$Entry<R, java.util.Map<C, V>> r0 = r1.rowEntry
                java.util.Objects.requireNonNull(r0)
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r0 = r0.getValue()
                java.util.Map r0 = (java.util.Map) r0
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L20
                java.util.Iterator<java.util.Map$Entry<R, java.util.Map<C, V>>> r0 = r1.rowIterator
                r0.remove()
                r0 = 0
                r1.rowEntry = r0
            L20:
                return
        }
    }

    public class Column extends com.google.common.collect.Maps.ViewCachingAbstractMap<R, V> {
        public final C columnKey;
        public final /* synthetic */ com.google.common.collect.StandardTable this$0;

        public class EntrySet extends com.google.common.collect.Sets.ImprovedAbstractSet<java.util.Map.Entry<R, V>> {
            public final /* synthetic */ com.google.common.collect.StandardTable.Column this$1;

            private EntrySet(com.google.common.collect.StandardTable.Column r1) {
                    r0 = this;
                    r0.this$1 = r1
                    r0.<init>()
                    return
            }

            public /* synthetic */ EntrySet(com.google.common.collect.StandardTable.Column r1, com.google.common.collect.StandardTable.AnonymousClass1 r2) {
                    r0 = this;
                    r0.<init>(r1)
                    return
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public void clear() {
                    r2 = this;
                    com.google.common.collect.StandardTable$Column r0 = r2.this$1
                    com.google.common.base.Predicate r1 = com.google.common.base.Predicates.alwaysTrue()
                    r0.removeFromColumnIf(r1)
                    return
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@javax.annotation.CheckForNull java.lang.Object r4) {
                    r3 = this;
                    boolean r0 = r4 instanceof java.util.Map.Entry
                    if (r0 == 0) goto L1b
                    java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                    com.google.common.collect.StandardTable$Column r0 = r3.this$1
                    com.google.common.collect.StandardTable r0 = r0.this$0
                    java.lang.Object r1 = r4.getKey()
                    com.google.common.collect.StandardTable$Column r2 = r3.this$1
                    C r2 = r2.columnKey
                    java.lang.Object r4 = r4.getValue()
                    boolean r4 = com.google.common.collect.StandardTable.access$300(r0, r1, r2, r4)
                    return r4
                L1b:
                    r4 = 0
                    return r4
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
                    r2 = this;
                    com.google.common.collect.StandardTable$Column r0 = r2.this$1
                    com.google.common.collect.StandardTable r1 = r0.this$0
                    C r0 = r0.columnKey
                    boolean r0 = r1.containsColumn(r0)
                    r0 = r0 ^ 1
                    return r0
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public java.util.Iterator<java.util.Map.Entry<R, V>> iterator() {
                    r3 = this;
                    com.google.common.collect.StandardTable$Column$EntrySetIterator r0 = new com.google.common.collect.StandardTable$Column$EntrySetIterator
                    com.google.common.collect.StandardTable$Column r1 = r3.this$1
                    r2 = 0
                    r0.<init>(r1, r2)
                    return r0
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@javax.annotation.CheckForNull java.lang.Object r4) {
                    r3 = this;
                    boolean r0 = r4 instanceof java.util.Map.Entry
                    if (r0 == 0) goto L1b
                    java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                    com.google.common.collect.StandardTable$Column r0 = r3.this$1
                    com.google.common.collect.StandardTable r0 = r0.this$0
                    java.lang.Object r1 = r4.getKey()
                    com.google.common.collect.StandardTable$Column r2 = r3.this$1
                    C r2 = r2.columnKey
                    java.lang.Object r4 = r4.getValue()
                    boolean r4 = com.google.common.collect.StandardTable.access$400(r0, r1, r2, r4)
                    return r4
                L1b:
                    r4 = 0
                    return r4
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(java.util.Collection<?> r2) {
                    r1 = this;
                    com.google.common.collect.StandardTable$Column r0 = r1.this$1
                    com.google.common.base.Predicate r2 = com.google.common.base.Predicates.in(r2)
                    com.google.common.base.Predicate r2 = com.google.common.base.Predicates.not(r2)
                    boolean r2 = r0.removeFromColumnIf(r2)
                    return r2
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                    r4 = this;
                    com.google.common.collect.StandardTable$Column r0 = r4.this$1
                    com.google.common.collect.StandardTable r0 = r0.this$0
                    java.util.Map<R, java.util.Map<C, V>> r0 = r0.backingMap
                    java.util.Collection r0 = r0.values()
                    java.util.Iterator r0 = r0.iterator()
                    r1 = 0
                Lf:
                    boolean r2 = r0.hasNext()
                    if (r2 == 0) goto L28
                    java.lang.Object r2 = r0.next()
                    java.util.Map r2 = (java.util.Map) r2
                    com.google.common.collect.StandardTable$Column r3 = r4.this$1
                    C r3 = r3.columnKey
                    boolean r2 = r2.containsKey(r3)
                    if (r2 == 0) goto Lf
                    int r1 = r1 + 1
                    goto Lf
                L28:
                    return r1
            }
        }

        /* JADX INFO: loaded from: classes.dex */
        public class EntrySetIterator extends com.google.common.collect.AbstractIterator<java.util.Map.Entry<R, V>> {
            public final java.util.Iterator<java.util.Map.Entry<R, java.util.Map<C, V>>> iterator;
            public final /* synthetic */ com.google.common.collect.StandardTable.Column this$1;


            private EntrySetIterator(com.google.common.collect.StandardTable.Column r1) {
                    r0 = this;
                    r0.this$1 = r1
                    r0.<init>()
                    com.google.common.collect.StandardTable r1 = r1.this$0
                    java.util.Map<R, java.util.Map<C, V>> r1 = r1.backingMap
                    java.util.Set r1 = r1.entrySet()
                    java.util.Iterator r1 = r1.iterator()
                    r0.iterator = r1
                    return
            }

            public /* synthetic */ EntrySetIterator(com.google.common.collect.StandardTable.Column r1, com.google.common.collect.StandardTable.AnonymousClass1 r2) {
                    r0 = this;
                    r0.<init>(r1)
                    return
            }

            @Override // com.google.common.collect.AbstractIterator
            @javax.annotation.CheckForNull
            public final java.lang.Object computeNext() {
                    r3 = this;
                L0:
                    java.util.Iterator<java.util.Map$Entry<R, java.util.Map<C, V>>> r0 = r3.iterator
                    boolean r0 = r0.hasNext()
                    if (r0 == 0) goto L26
                    java.util.Iterator<java.util.Map$Entry<R, java.util.Map<C, V>>> r0 = r3.iterator
                    java.lang.Object r0 = r0.next()
                    java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                    java.lang.Object r1 = r0.getValue()
                    java.util.Map r1 = (java.util.Map) r1
                    com.google.common.collect.StandardTable$Column r2 = r3.this$1
                    C r2 = r2.columnKey
                    boolean r1 = r1.containsKey(r2)
                    if (r1 == 0) goto L0
                    com.google.common.collect.StandardTable$Column$EntrySetIterator$1EntryImpl r1 = new com.google.common.collect.StandardTable$Column$EntrySetIterator$1EntryImpl
                    r1.<init>(r3, r0)
                    goto L2a
                L26:
                    r3.endOfData()
                    r1 = 0
                L2a:
                    return r1
            }
        }

        public class KeySet extends com.google.common.collect.Maps.KeySet<R, V> {
            public final /* synthetic */ com.google.common.collect.StandardTable.Column this$1;

            public KeySet(com.google.common.collect.StandardTable.Column r1) {
                    r0 = this;
                    r0.this$1 = r1
                    r0.<init>(r1)
                    return
            }

            @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@javax.annotation.CheckForNull java.lang.Object r3) {
                    r2 = this;
                    com.google.common.collect.StandardTable$Column r0 = r2.this$1
                    com.google.common.collect.StandardTable r1 = r0.this$0
                    C r0 = r0.columnKey
                    boolean r3 = r1.contains(r3, r0)
                    return r3
            }

            @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@javax.annotation.CheckForNull java.lang.Object r3) {
                    r2 = this;
                    com.google.common.collect.StandardTable$Column r0 = r2.this$1
                    com.google.common.collect.StandardTable r1 = r0.this$0
                    C r0 = r0.columnKey
                    java.lang.Object r3 = r1.remove(r3, r0)
                    if (r3 == 0) goto Le
                    r3 = 1
                    goto Lf
                Le:
                    r3 = 0
                Lf:
                    return r3
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(java.util.Collection<?> r2) {
                    r1 = this;
                    com.google.common.collect.StandardTable$Column r0 = r1.this$1
                    com.google.common.base.Predicate r2 = com.google.common.base.Predicates.in(r2)
                    com.google.common.base.Predicate r2 = com.google.common.base.Predicates.not(r2)
                    com.google.common.base.Predicate r2 = com.google.common.collect.Maps.keyPredicateOnEntries(r2)
                    boolean r2 = r0.removeFromColumnIf(r2)
                    return r2
            }
        }

        /* JADX INFO: loaded from: classes3.dex */
        public class Values extends com.google.common.collect.Maps.Values<R, V> {
            public final /* synthetic */ com.google.common.collect.StandardTable.Column this$1;

            public Values(com.google.common.collect.StandardTable.Column r1) {
                    r0 = this;
                    r0.this$1 = r1
                    r0.<init>(r1)
                    return
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public boolean remove(@javax.annotation.CheckForNull java.lang.Object r2) {
                    r1 = this;
                    if (r2 == 0) goto L14
                    com.google.common.collect.StandardTable$Column r0 = r1.this$1
                    com.google.common.base.Predicate r2 = com.google.common.base.Predicates.equalTo(r2)
                    com.google.common.base.Predicate r2 = com.google.common.collect.Maps.valuePredicateOnEntries(r2)
                    boolean r2 = r0.removeFromColumnIf(r2)
                    if (r2 == 0) goto L14
                    r2 = 1
                    goto L15
                L14:
                    r2 = 0
                L15:
                    return r2
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(java.util.Collection<?> r2) {
                    r1 = this;
                    com.google.common.collect.StandardTable$Column r0 = r1.this$1
                    com.google.common.base.Predicate r2 = com.google.common.base.Predicates.in(r2)
                    com.google.common.base.Predicate r2 = com.google.common.collect.Maps.valuePredicateOnEntries(r2)
                    boolean r2 = r0.removeFromColumnIf(r2)
                    return r2
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(java.util.Collection<?> r2) {
                    r1 = this;
                    com.google.common.collect.StandardTable$Column r0 = r1.this$1
                    com.google.common.base.Predicate r2 = com.google.common.base.Predicates.in(r2)
                    com.google.common.base.Predicate r2 = com.google.common.base.Predicates.not(r2)
                    com.google.common.base.Predicate r2 = com.google.common.collect.Maps.valuePredicateOnEntries(r2)
                    boolean r2 = r0.removeFromColumnIf(r2)
                    return r2
            }
        }

        public Column(com.google.common.collect.StandardTable r1, C r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                r0.columnKey = r1
                return
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object r3) {
                r2 = this;
                com.google.common.collect.StandardTable r0 = r2.this$0
                C r1 = r2.columnKey
                boolean r3 = r0.contains(r3, r1)
                return r3
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final java.util.Set<java.util.Map.Entry<R, V>> createEntrySet() {
                r2 = this;
                com.google.common.collect.StandardTable$Column$EntrySet r0 = new com.google.common.collect.StandardTable$Column$EntrySet
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final java.util.Set<R> createKeySet() {
                r1 = this;
                com.google.common.collect.StandardTable$Column$KeySet r0 = new com.google.common.collect.StandardTable$Column$KeySet
                r0.<init>(r1)
                return r0
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final java.util.Collection<V> createValues() {
                r1 = this;
                com.google.common.collect.StandardTable$Column$Values r0 = new com.google.common.collect.StandardTable$Column$Values
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public V get(@javax.annotation.CheckForNull java.lang.Object r3) {
                r2 = this;
                com.google.common.collect.StandardTable r0 = r2.this$0
                C r1 = r2.columnKey
                java.lang.Object r3 = r0.get(r3, r1)
                return r3
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public V put(R r3, V r4) {
                r2 = this;
                com.google.common.collect.StandardTable r0 = r2.this$0
                C r1 = r2.columnKey
                java.lang.Object r3 = r0.put(r3, r1, r4)
                return r3
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public V remove(@javax.annotation.CheckForNull java.lang.Object r3) {
                r2 = this;
                com.google.common.collect.StandardTable r0 = r2.this$0
                C r1 = r2.columnKey
                java.lang.Object r3 = r0.remove(r3, r1)
                return r3
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public final boolean removeFromColumnIf(com.google.common.base.Predicate<? super java.util.Map.Entry<R, V>> r6) {
                r5 = this;
                com.google.common.collect.StandardTable r0 = r5.this$0
                java.util.Map<R, java.util.Map<C, V>> r0 = r0.backingMap
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
                r1 = 0
            Ld:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L45
                java.lang.Object r2 = r0.next()
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                java.lang.Object r3 = r2.getValue()
                java.util.Map r3 = (java.util.Map) r3
                C r4 = r5.columnKey
                java.lang.Object r4 = r3.get(r4)
                if (r4 == 0) goto Ld
                java.lang.Object r2 = r2.getKey()
                java.util.Map$Entry r2 = com.google.common.collect.Maps.immutableEntry(r2, r4)
                boolean r2 = r6.apply(r2)
                if (r2 == 0) goto Ld
                C r1 = r5.columnKey
                r3.remove(r1)
                r1 = 1
                boolean r2 = r3.isEmpty()
                if (r2 == 0) goto Ld
                r0.remove()
                goto Ld
            L45:
                return r1
        }
    }

    public class ColumnKeyIterator extends com.google.common.collect.AbstractIterator<C> {
        public java.util.Iterator<java.util.Map.Entry<C, V>> entryIterator;
        public final java.util.Iterator<java.util.Map<C, V>> mapIterator;
        public final java.util.Map<C, V> seen;

        private ColumnKeyIterator(com.google.common.collect.StandardTable r2) {
                r1 = this;
                r1.<init>()
                com.google.common.base.Supplier<? extends java.util.Map<C, V>> r0 = r2.factory
                java.lang.Object r0 = r0.get()
                java.util.Map r0 = (java.util.Map) r0
                r1.seen = r0
                java.util.Map<R, java.util.Map<C, V>> r2 = r2.backingMap
                java.util.Collection r2 = r2.values()
                java.util.Iterator r2 = r2.iterator()
                r1.mapIterator = r2
                com.google.common.collect.UnmodifiableListIterator<java.lang.Object> r2 = com.google.common.collect.Iterators.ArrayItr.EMPTY
                r1.entryIterator = r2
                return
        }

        public /* synthetic */ ColumnKeyIterator(com.google.common.collect.StandardTable r1, com.google.common.collect.StandardTable.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.collect.AbstractIterator
        @javax.annotation.CheckForNull
        public final C computeNext() {
                r4 = this;
            L0:
                java.util.Iterator<java.util.Map$Entry<C, V>> r0 = r4.entryIterator
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L2e
                java.util.Iterator<java.util.Map$Entry<C, V>> r0 = r4.entryIterator
                java.lang.Object r0 = r0.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.util.Map<C, V> r1 = r4.seen
                java.lang.Object r2 = r0.getKey()
                boolean r1 = r1.containsKey(r2)
                if (r1 != 0) goto L0
                java.util.Map<C, V> r1 = r4.seen
                java.lang.Object r2 = r0.getKey()
                java.lang.Object r3 = r0.getValue()
                r1.put(r2, r3)
                java.lang.Object r0 = r0.getKey()
                return r0
            L2e:
                java.util.Iterator<java.util.Map<C, V>> r0 = r4.mapIterator
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L49
                java.util.Iterator<java.util.Map<C, V>> r0 = r4.mapIterator
                java.lang.Object r0 = r0.next()
                java.util.Map r0 = (java.util.Map) r0
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
                r4.entryIterator = r0
                goto L0
            L49:
                r4.endOfData()
                r0 = 0
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public class ColumnKeySet extends com.google.common.collect.StandardTable<R, C, V>.TableSet<C> {
        public final /* synthetic */ com.google.common.collect.StandardTable this$0;

        private ColumnKeySet(com.google.common.collect.StandardTable r2) {
                r1 = this;
                r1.this$0 = r2
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        public /* synthetic */ ColumnKeySet(com.google.common.collect.StandardTable r1, com.google.common.collect.StandardTable.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.StandardTable r0 = r1.this$0
                boolean r2 = r0.containsColumn(r2)
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<C> iterator() {
                r1 = this;
                com.google.common.collect.StandardTable r0 = r1.this$0
                java.util.Iterator r0 = r0.createColumnKeyIterator()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@javax.annotation.CheckForNull java.lang.Object r5) {
                r4 = this;
                r0 = 0
                if (r5 != 0) goto L4
                return r0
            L4:
                com.google.common.collect.StandardTable r1 = r4.this$0
                java.util.Map<R, java.util.Map<C, V>> r1 = r1.backingMap
                java.util.Collection r1 = r1.values()
                java.util.Iterator r1 = r1.iterator()
            L10:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L31
                java.lang.Object r2 = r1.next()
                java.util.Map r2 = (java.util.Map) r2
                java.util.Set r3 = r2.keySet()
                boolean r3 = r3.remove(r5)
                if (r3 == 0) goto L10
                r0 = 1
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L10
                r1.remove()
                goto L10
            L31:
                return r0
        }

        @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(java.util.Collection<?> r5) {
                r4 = this;
                com.google.common.base.Preconditions.checkNotNull(r5)
                com.google.common.collect.StandardTable r0 = r4.this$0
                java.util.Map<R, java.util.Map<C, V>> r0 = r0.backingMap
                java.util.Collection r0 = r0.values()
                java.util.Iterator r0 = r0.iterator()
                r1 = 0
            L10:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L35
                java.lang.Object r2 = r0.next()
                java.util.Map r2 = (java.util.Map) r2
                java.util.Set r3 = r2.keySet()
                java.util.Iterator r3 = r3.iterator()
                boolean r3 = com.google.common.collect.Iterators.removeAll(r3, r5)
                if (r3 == 0) goto L10
                r1 = 1
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L10
                r0.remove()
                goto L10
            L35:
                return r1
        }

        @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(java.util.Collection<?> r5) {
                r4 = this;
                com.google.common.base.Preconditions.checkNotNull(r5)
                com.google.common.collect.StandardTable r0 = r4.this$0
                java.util.Map<R, java.util.Map<C, V>> r0 = r0.backingMap
                java.util.Collection r0 = r0.values()
                java.util.Iterator r0 = r0.iterator()
                r1 = 0
            L10:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L31
                java.lang.Object r2 = r0.next()
                java.util.Map r2 = (java.util.Map) r2
                java.util.Set r3 = r2.keySet()
                boolean r3 = r3.retainAll(r5)
                if (r3 == 0) goto L10
                r1 = 1
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L10
                r0.remove()
                goto L10
            L31:
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                java.util.Iterator r0 = r1.iterator()
                int r0 = com.google.common.collect.Iterators.size(r0)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public class ColumnMap extends com.google.common.collect.Maps.ViewCachingAbstractMap<C, java.util.Map<R, V>> {
        public final /* synthetic */ com.google.common.collect.StandardTable this$0;

        /* JADX INFO: loaded from: classes2.dex */
        public class ColumnMapEntrySet extends com.google.common.collect.StandardTable<R, C, V>.TableSet<java.util.Map.Entry<C, java.util.Map<R, V>>> {
            public final /* synthetic */ com.google.common.collect.StandardTable.ColumnMap this$1;


            public ColumnMapEntrySet(com.google.common.collect.StandardTable.ColumnMap r2) {
                    r1 = this;
                    r1.this$1 = r2
                    com.google.common.collect.StandardTable r2 = r2.this$0
                    r0 = 0
                    r1.<init>(r2, r0)
                    return
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@javax.annotation.CheckForNull java.lang.Object r3) {
                    r2 = this;
                    boolean r0 = r3 instanceof java.util.Map.Entry
                    if (r0 == 0) goto L2c
                    java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                    com.google.common.collect.StandardTable$ColumnMap r0 = r2.this$1
                    com.google.common.collect.StandardTable r0 = r0.this$0
                    java.lang.Object r1 = r3.getKey()
                    boolean r0 = r0.containsColumn(r1)
                    if (r0 == 0) goto L2c
                    com.google.common.collect.StandardTable$ColumnMap r0 = r2.this$1
                    java.lang.Object r1 = r3.getKey()
                    java.util.Map r0 = r0.get(r1)
                    java.util.Objects.requireNonNull(r0)
                    java.util.Map r0 = (java.util.Map) r0
                    java.lang.Object r3 = r3.getValue()
                    boolean r3 = r0.equals(r3)
                    return r3
                L2c:
                    r3 = 0
                    return r3
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public java.util.Iterator<java.util.Map.Entry<C, java.util.Map<R, V>>> iterator() {
                    r2 = this;
                    com.google.common.collect.StandardTable$ColumnMap r0 = r2.this$1
                    com.google.common.collect.StandardTable r0 = r0.this$0
                    java.util.Set r0 = r0.columnKeySet()
                    com.google.common.collect.StandardTable$ColumnMap$ColumnMapEntrySet$1 r1 = new com.google.common.collect.StandardTable$ColumnMap$ColumnMapEntrySet$1
                    r1.<init>(r2)
                    java.util.Iterator r0 = com.google.common.collect.Maps.asMapEntryIterator(r0, r1)
                    return r0
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@javax.annotation.CheckForNull java.lang.Object r2) {
                    r1 = this;
                    boolean r0 = r1.contains(r2)
                    if (r0 == 0) goto L19
                    boolean r0 = r2 instanceof java.util.Map.Entry
                    if (r0 == 0) goto L19
                    java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                    com.google.common.collect.StandardTable$ColumnMap r0 = r1.this$1
                    com.google.common.collect.StandardTable r0 = r0.this$0
                    java.lang.Object r2 = r2.getKey()
                    com.google.common.collect.StandardTable.access$900(r0, r2)
                    r2 = 1
                    return r2
                L19:
                    r2 = 0
                    return r2
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(java.util.Collection<?> r1) {
                    r0 = this;
                    com.google.common.base.Preconditions.checkNotNull(r1)
                    java.util.Iterator r1 = r1.iterator()
                    boolean r1 = com.google.common.collect.Sets.removeAllImpl(r0, r1)
                    return r1
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(java.util.Collection<?> r5) {
                    r4 = this;
                    com.google.common.base.Preconditions.checkNotNull(r5)
                    com.google.common.collect.StandardTable$ColumnMap r0 = r4.this$1
                    com.google.common.collect.StandardTable r0 = r0.this$0
                    java.util.Set r0 = r0.columnKeySet()
                    java.util.Iterator r0 = r0.iterator()
                    java.util.ArrayList r0 = com.google.common.collect.Lists.newArrayList(r0)
                    java.util.Iterator r0 = r0.iterator()
                    r1 = 0
                L18:
                    boolean r2 = r0.hasNext()
                    if (r2 == 0) goto L3d
                    java.lang.Object r2 = r0.next()
                    com.google.common.collect.StandardTable$ColumnMap r3 = r4.this$1
                    com.google.common.collect.StandardTable r3 = r3.this$0
                    java.util.Map r3 = r3.column(r2)
                    java.util.Map$Entry r3 = com.google.common.collect.Maps.immutableEntry(r2, r3)
                    boolean r3 = r5.contains(r3)
                    if (r3 != 0) goto L18
                    com.google.common.collect.StandardTable$ColumnMap r1 = r4.this$1
                    com.google.common.collect.StandardTable r1 = r1.this$0
                    com.google.common.collect.StandardTable.access$900(r1, r2)
                    r1 = 1
                    goto L18
                L3d:
                    return r1
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                    r1 = this;
                    com.google.common.collect.StandardTable$ColumnMap r0 = r1.this$1
                    com.google.common.collect.StandardTable r0 = r0.this$0
                    java.util.Set r0 = r0.columnKeySet()
                    int r0 = r0.size()
                    return r0
            }
        }

        public class ColumnMapValues extends com.google.common.collect.Maps.Values<C, java.util.Map<R, V>> {
            public final /* synthetic */ com.google.common.collect.StandardTable.ColumnMap this$1;

            public ColumnMapValues(com.google.common.collect.StandardTable.ColumnMap r1) {
                    r0 = this;
                    r0.this$1 = r1
                    r0.<init>(r1)
                    return
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public boolean remove(@javax.annotation.CheckForNull java.lang.Object r4) {
                    r3 = this;
                    com.google.common.collect.StandardTable$ColumnMap r0 = r3.this$1
                    java.util.Set r0 = r0.entrySet()
                    java.util.Iterator r0 = r0.iterator()
                La:
                    boolean r1 = r0.hasNext()
                    if (r1 == 0) goto L2f
                    java.lang.Object r1 = r0.next()
                    java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                    java.lang.Object r2 = r1.getValue()
                    java.util.Map r2 = (java.util.Map) r2
                    boolean r2 = r2.equals(r4)
                    if (r2 == 0) goto La
                    com.google.common.collect.StandardTable$ColumnMap r4 = r3.this$1
                    com.google.common.collect.StandardTable r4 = r4.this$0
                    java.lang.Object r0 = r1.getKey()
                    com.google.common.collect.StandardTable.access$900(r4, r0)
                    r4 = 1
                    return r4
                L2f:
                    r4 = 0
                    return r4
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(java.util.Collection<?> r5) {
                    r4 = this;
                    com.google.common.base.Preconditions.checkNotNull(r5)
                    com.google.common.collect.StandardTable$ColumnMap r0 = r4.this$1
                    com.google.common.collect.StandardTable r0 = r0.this$0
                    java.util.Set r0 = r0.columnKeySet()
                    java.util.Iterator r0 = r0.iterator()
                    java.util.ArrayList r0 = com.google.common.collect.Lists.newArrayList(r0)
                    java.util.Iterator r0 = r0.iterator()
                    r1 = 0
                L18:
                    boolean r2 = r0.hasNext()
                    if (r2 == 0) goto L39
                    java.lang.Object r2 = r0.next()
                    com.google.common.collect.StandardTable$ColumnMap r3 = r4.this$1
                    com.google.common.collect.StandardTable r3 = r3.this$0
                    java.util.Map r3 = r3.column(r2)
                    boolean r3 = r5.contains(r3)
                    if (r3 == 0) goto L18
                    com.google.common.collect.StandardTable$ColumnMap r1 = r4.this$1
                    com.google.common.collect.StandardTable r1 = r1.this$0
                    com.google.common.collect.StandardTable.access$900(r1, r2)
                    r1 = 1
                    goto L18
                L39:
                    return r1
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(java.util.Collection<?> r5) {
                    r4 = this;
                    com.google.common.base.Preconditions.checkNotNull(r5)
                    com.google.common.collect.StandardTable$ColumnMap r0 = r4.this$1
                    com.google.common.collect.StandardTable r0 = r0.this$0
                    java.util.Set r0 = r0.columnKeySet()
                    java.util.Iterator r0 = r0.iterator()
                    java.util.ArrayList r0 = com.google.common.collect.Lists.newArrayList(r0)
                    java.util.Iterator r0 = r0.iterator()
                    r1 = 0
                L18:
                    boolean r2 = r0.hasNext()
                    if (r2 == 0) goto L39
                    java.lang.Object r2 = r0.next()
                    com.google.common.collect.StandardTable$ColumnMap r3 = r4.this$1
                    com.google.common.collect.StandardTable r3 = r3.this$0
                    java.util.Map r3 = r3.column(r2)
                    boolean r3 = r5.contains(r3)
                    if (r3 != 0) goto L18
                    com.google.common.collect.StandardTable$ColumnMap r1 = r4.this$1
                    com.google.common.collect.StandardTable r1 = r1.this$0
                    com.google.common.collect.StandardTable.access$900(r1, r2)
                    r1 = 1
                    goto L18
                L39:
                    return r1
            }
        }

        private ColumnMap(com.google.common.collect.StandardTable r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ ColumnMap(com.google.common.collect.StandardTable r1, com.google.common.collect.StandardTable.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.StandardTable r0 = r1.this$0
                boolean r2 = r0.containsColumn(r2)
                return r2
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public java.util.Set<java.util.Map.Entry<C, java.util.Map<R, V>>> createEntrySet() {
                r1 = this;
                com.google.common.collect.StandardTable$ColumnMap$ColumnMapEntrySet r0 = new com.google.common.collect.StandardTable$ColumnMap$ColumnMapEntrySet
                r0.<init>(r1)
                return r0
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final java.util.Collection<java.util.Map<R, V>> createValues() {
                r1 = this;
                com.google.common.collect.StandardTable$ColumnMap$ColumnMapValues r0 = new com.google.common.collect.StandardTable$ColumnMap$ColumnMapValues
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public /* bridge */ /* synthetic */ java.lang.Object get(@javax.annotation.CheckForNull java.lang.Object r1) {
                r0 = this;
                java.util.Map r1 = r0.get(r1)
                return r1
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public java.util.Map<R, V> get(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.StandardTable r0 = r1.this$0
                boolean r0 = r0.containsColumn(r2)
                if (r0 == 0) goto L12
                com.google.common.collect.StandardTable r0 = r1.this$0
                java.util.Objects.requireNonNull(r2)
                java.util.Map r2 = r0.column(r2)
                goto L13
            L12:
                r2 = 0
            L13:
                return r2
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public java.util.Set<C> keySet() {
                r1 = this;
                com.google.common.collect.StandardTable r0 = r1.this$0
                java.util.Set r0 = r0.columnKeySet()
                return r0
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public /* bridge */ /* synthetic */ java.lang.Object remove(@javax.annotation.CheckForNull java.lang.Object r1) {
                r0 = this;
                java.util.Map r1 = r0.remove(r1)
                return r1
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public java.util.Map<R, V> remove(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.StandardTable r0 = r1.this$0
                boolean r0 = r0.containsColumn(r2)
                if (r0 == 0) goto Lf
                com.google.common.collect.StandardTable r0 = r1.this$0
                java.util.Map r2 = com.google.common.collect.StandardTable.access$900(r0, r2)
                goto L10
            Lf:
                r2 = 0
            L10:
                return r2
        }
    }

    public class Row extends com.google.common.collect.Maps.IteratorBasedAbstractMap<C, V> {

        @javax.annotation.CheckForNull
        public java.util.Map<C, V> backingRowMap;
        public final R rowKey;
        public final /* synthetic */ com.google.common.collect.StandardTable this$0;



        public Row(com.google.common.collect.StandardTable r1, R r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                r0.rowKey = r1
                return
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public void clear() {
                r1 = this;
                r1.updateBackingRowMapField()
                java.util.Map<C, V> r0 = r1.backingRowMap
                if (r0 == 0) goto La
                r0.clear()
            La:
                r1.maintainEmptyInvariant()
                return
        }

        @javax.annotation.CheckForNull
        public java.util.Map<C, V> computeBackingRowMap() {
                r2 = this;
                com.google.common.collect.StandardTable r0 = r2.this$0
                java.util.Map<R, java.util.Map<C, V>> r0 = r0.backingMap
                R r1 = r2.rowKey
                java.lang.Object r0 = r0.get(r1)
                java.util.Map r0 = (java.util.Map) r0
                return r0
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                r1.updateBackingRowMapField()
                if (r2 == 0) goto L11
                java.util.Map<C, V> r0 = r1.backingRowMap
                if (r0 == 0) goto L11
                boolean r2 = com.google.common.collect.Maps.safeContainsKey(r0, r2)
                if (r2 == 0) goto L11
                r2 = 1
                goto L12
            L11:
                r2 = 0
            L12:
                return r2
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public final java.util.Iterator<java.util.Map.Entry<C, V>> entryIterator() {
                r2 = this;
                r2.updateBackingRowMapField()
                java.util.Map<C, V> r0 = r2.backingRowMap
                if (r0 != 0) goto La
                com.google.common.collect.Iterators$EmptyModifiableIterator r0 = com.google.common.collect.Iterators.EmptyModifiableIterator.INSTANCE
                return r0
            La:
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
                com.google.common.collect.StandardTable$Row$1 r1 = new com.google.common.collect.StandardTable$Row$1
                r1.<init>(r2, r0)
                return r1
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public V get(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                r1.updateBackingRowMapField()
                if (r2 == 0) goto Le
                java.util.Map<C, V> r0 = r1.backingRowMap
                if (r0 == 0) goto Le
                java.lang.Object r2 = com.google.common.collect.Maps.safeGet(r0, r2)
                goto Lf
            Le:
                r2 = 0
            Lf:
                return r2
        }

        public void maintainEmptyInvariant() {
                r2 = this;
                r2.updateBackingRowMapField()
                java.util.Map<C, V> r0 = r2.backingRowMap
                if (r0 == 0) goto L19
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L19
                com.google.common.collect.StandardTable r0 = r2.this$0
                java.util.Map<R, java.util.Map<C, V>> r0 = r0.backingMap
                R r1 = r2.rowKey
                r0.remove(r1)
                r0 = 0
                r2.backingRowMap = r0
            L19:
                return
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public V put(C r3, V r4) {
                r2 = this;
                com.google.common.base.Preconditions.checkNotNull(r3)
                com.google.common.base.Preconditions.checkNotNull(r4)
                java.util.Map<C, V> r0 = r2.backingRowMap
                if (r0 == 0) goto L17
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L17
                java.util.Map<C, V> r0 = r2.backingRowMap
                java.lang.Object r3 = r0.put(r3, r4)
                return r3
            L17:
                com.google.common.collect.StandardTable r0 = r2.this$0
                R r1 = r2.rowKey
                java.lang.Object r3 = r0.put(r1, r3, r4)
                return r3
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public V remove(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                r1.updateBackingRowMapField()
                java.util.Map<C, V> r0 = r1.backingRowMap
                if (r0 != 0) goto L9
                r2 = 0
                return r2
            L9:
                java.lang.Object r2 = com.google.common.collect.Maps.safeRemove(r0, r2)
                r1.maintainEmptyInvariant()
                return r2
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
                r1 = this;
                r1.updateBackingRowMapField()
                java.util.Map<C, V> r0 = r1.backingRowMap
                if (r0 != 0) goto L9
                r0 = 0
                goto Ld
            L9:
                int r0 = r0.size()
            Ld:
                return r0
        }

        public final void updateBackingRowMapField() {
                r2 = this;
                java.util.Map<C, V> r0 = r2.backingRowMap
                if (r0 == 0) goto L16
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L1c
                com.google.common.collect.StandardTable r0 = r2.this$0
                java.util.Map<R, java.util.Map<C, V>> r0 = r0.backingMap
                R r1 = r2.rowKey
                boolean r0 = r0.containsKey(r1)
                if (r0 == 0) goto L1c
            L16:
                java.util.Map r0 = r2.computeBackingRowMap()
                r2.backingRowMap = r0
            L1c:
                return
        }
    }

    public class RowMap extends com.google.common.collect.Maps.ViewCachingAbstractMap<R, java.util.Map<C, V>> {
        public final /* synthetic */ com.google.common.collect.StandardTable this$0;

        /* JADX INFO: loaded from: classes.dex */
        public class EntrySet extends com.google.common.collect.StandardTable<R, C, V>.TableSet<java.util.Map.Entry<R, java.util.Map<C, V>>> {
            public final /* synthetic */ com.google.common.collect.StandardTable.RowMap this$1;


            public EntrySet(com.google.common.collect.StandardTable.RowMap r2) {
                    r1 = this;
                    r1.this$1 = r2
                    com.google.common.collect.StandardTable r2 = r2.this$0
                    r0 = 0
                    r1.<init>(r2, r0)
                    return
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@javax.annotation.CheckForNull java.lang.Object r3) {
                    r2 = this;
                    boolean r0 = r3 instanceof java.util.Map.Entry
                    r1 = 0
                    if (r0 == 0) goto L26
                    java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                    java.lang.Object r0 = r3.getKey()
                    if (r0 == 0) goto L26
                    java.lang.Object r0 = r3.getValue()
                    boolean r0 = r0 instanceof java.util.Map
                    if (r0 == 0) goto L26
                    com.google.common.collect.StandardTable$RowMap r0 = r2.this$1
                    com.google.common.collect.StandardTable r0 = r0.this$0
                    java.util.Map<R, java.util.Map<C, V>> r0 = r0.backingMap
                    java.util.Set r0 = r0.entrySet()
                    boolean r3 = com.google.common.collect.Collections2.safeContains(r0, r3)
                    if (r3 == 0) goto L26
                    r1 = 1
                L26:
                    return r1
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public java.util.Iterator<java.util.Map.Entry<R, java.util.Map<C, V>>> iterator() {
                    r2 = this;
                    com.google.common.collect.StandardTable$RowMap r0 = r2.this$1
                    com.google.common.collect.StandardTable r0 = r0.this$0
                    java.util.Map<R, java.util.Map<C, V>> r0 = r0.backingMap
                    java.util.Set r0 = r0.keySet()
                    com.google.common.collect.StandardTable$RowMap$EntrySet$1 r1 = new com.google.common.collect.StandardTable$RowMap$EntrySet$1
                    r1.<init>(r2)
                    java.util.Iterator r0 = com.google.common.collect.Maps.asMapEntryIterator(r0, r1)
                    return r0
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@javax.annotation.CheckForNull java.lang.Object r3) {
                    r2 = this;
                    boolean r0 = r3 instanceof java.util.Map.Entry
                    r1 = 0
                    if (r0 == 0) goto L26
                    java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                    java.lang.Object r0 = r3.getKey()
                    if (r0 == 0) goto L26
                    java.lang.Object r0 = r3.getValue()
                    boolean r0 = r0 instanceof java.util.Map
                    if (r0 == 0) goto L26
                    com.google.common.collect.StandardTable$RowMap r0 = r2.this$1
                    com.google.common.collect.StandardTable r0 = r0.this$0
                    java.util.Map<R, java.util.Map<C, V>> r0 = r0.backingMap
                    java.util.Set r0 = r0.entrySet()
                    boolean r3 = r0.remove(r3)
                    if (r3 == 0) goto L26
                    r1 = 1
                L26:
                    return r1
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                    r1 = this;
                    com.google.common.collect.StandardTable$RowMap r0 = r1.this$1
                    com.google.common.collect.StandardTable r0 = r0.this$0
                    java.util.Map<R, java.util.Map<C, V>> r0 = r0.backingMap
                    int r0 = r0.size()
                    return r0
            }
        }

        public RowMap(com.google.common.collect.StandardTable r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.StandardTable r0 = r1.this$0
                boolean r2 = r0.containsRow(r2)
                return r2
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final java.util.Set<java.util.Map.Entry<R, java.util.Map<C, V>>> createEntrySet() {
                r1 = this;
                com.google.common.collect.StandardTable$RowMap$EntrySet r0 = new com.google.common.collect.StandardTable$RowMap$EntrySet
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public /* bridge */ /* synthetic */ java.lang.Object get(@javax.annotation.CheckForNull java.lang.Object r1) {
                r0 = this;
                java.util.Map r1 = r0.get(r1)
                return r1
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public java.util.Map<C, V> get(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.StandardTable r0 = r1.this$0
                boolean r0 = r0.containsRow(r2)
                if (r0 == 0) goto L12
                com.google.common.collect.StandardTable r0 = r1.this$0
                java.util.Objects.requireNonNull(r2)
                java.util.Map r2 = r0.row(r2)
                goto L13
            L12:
                r2 = 0
            L13:
                return r2
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public /* bridge */ /* synthetic */ java.lang.Object remove(@javax.annotation.CheckForNull java.lang.Object r1) {
                r0 = this;
                java.util.Map r1 = r0.remove(r1)
                return r1
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public java.util.Map<C, V> remove(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                if (r2 != 0) goto L4
                r2 = 0
                goto Le
            L4:
                com.google.common.collect.StandardTable r0 = r1.this$0
                java.util.Map<R, java.util.Map<C, V>> r0 = r0.backingMap
                java.lang.Object r2 = r0.remove(r2)
                java.util.Map r2 = (java.util.Map) r2
            Le:
                return r2
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public abstract class TableSet<T> extends com.google.common.collect.Sets.ImprovedAbstractSet<T> {
        public final /* synthetic */ com.google.common.collect.StandardTable this$0;

        private TableSet(com.google.common.collect.StandardTable r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ TableSet(com.google.common.collect.StandardTable r1, com.google.common.collect.StandardTable.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
                r1 = this;
                com.google.common.collect.StandardTable r0 = r1.this$0
                java.util.Map<R, java.util.Map<C, V>> r0 = r0.backingMap
                r0.clear()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
                r1 = this;
                com.google.common.collect.StandardTable r0 = r1.this$0
                java.util.Map<R, java.util.Map<C, V>> r0 = r0.backingMap
                boolean r0 = r0.isEmpty()
                return r0
        }
    }

    public StandardTable(java.util.Map<R, java.util.Map<C, V>> r1, com.google.common.base.Supplier<? extends java.util.Map<C, V>> r2) {
            r0 = this;
            r0.<init>()
            r0.backingMap = r1
            r0.factory = r2
            return
    }

    public static /* synthetic */ boolean access$300(com.google.common.collect.StandardTable r0, java.lang.Object r1, java.lang.Object r2, java.lang.Object r3) {
            boolean r0 = r0.containsMapping(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ boolean access$400(com.google.common.collect.StandardTable r0, java.lang.Object r1, java.lang.Object r2, java.lang.Object r3) {
            boolean r0 = r0.removeMapping(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ java.util.Map access$900(com.google.common.collect.StandardTable r0, java.lang.Object r1) {
            java.util.Map r0 = r0.removeColumn(r1)
            return r0
    }

    private boolean containsMapping(@javax.annotation.CheckForNull java.lang.Object r1, @javax.annotation.CheckForNull java.lang.Object r2, @javax.annotation.CheckForNull java.lang.Object r3) {
            r0 = this;
            if (r3 == 0) goto Le
            java.lang.Object r1 = r0.get(r1, r2)
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    private java.util.Map<C, V> getOrCreate(R r3) {
            r2 = this;
            java.util.Map<R, java.util.Map<C, V>> r0 = r2.backingMap
            java.lang.Object r0 = r0.get(r3)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L17
            com.google.common.base.Supplier<? extends java.util.Map<C, V>> r0 = r2.factory
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            java.util.Map<R, java.util.Map<C, V>> r1 = r2.backingMap
            r1.put(r3, r0)
        L17:
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    private java.util.Map<R, V> removeColumn(@javax.annotation.CheckForNull java.lang.Object r6) {
            r5 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map<R, java.util.Map<C, V>> r1 = r5.backingMap
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r3 = r3.remove(r6)
            if (r3 == 0) goto Lf
            java.lang.Object r4 = r2.getKey()
            r0.put(r4, r3)
            java.lang.Object r2 = r2.getValue()
            java.util.Map r2 = (java.util.Map) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto Lf
            r1.remove()
            goto Lf
        L3e:
            return r0
    }

    private boolean removeMapping(@javax.annotation.CheckForNull java.lang.Object r1, @javax.annotation.CheckForNull java.lang.Object r2, @javax.annotation.CheckForNull java.lang.Object r3) {
            r0 = this;
            boolean r3 = r0.containsMapping(r1, r2, r3)
            if (r3 == 0) goto Lb
            r0.remove(r1, r2)
            r1 = 1
            return r1
        Lb:
            r1 = 0
            return r1
    }

    @Override // com.google.common.collect.AbstractTable
    public final java.util.Iterator<com.google.common.collect.Table.Cell<R, C, V>> cellIterator() {
            r2 = this;
            com.google.common.collect.StandardTable$CellIterator r0 = new com.google.common.collect.StandardTable$CellIterator
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public java.util.Set<com.google.common.collect.Table.Cell<R, C, V>> cellSet() {
            r1 = this;
            java.util.Set r0 = super.cellSet()
            return r0
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public void clear() {
            r1 = this;
            java.util.Map<R, java.util.Map<C, V>> r0 = r1.backingMap
            r0.clear()
            return
    }

    @Override // com.google.common.collect.Table
    public java.util.Map<R, V> column(C r2) {
            r1 = this;
            com.google.common.collect.StandardTable$Column r0 = new com.google.common.collect.StandardTable$Column
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public java.util.Set<C> columnKeySet() {
            r2 = this;
            java.util.Set<C> r0 = r2.columnKeySet
            if (r0 != 0) goto Lc
            com.google.common.collect.StandardTable$ColumnKeySet r0 = new com.google.common.collect.StandardTable$ColumnKeySet
            r1 = 0
            r0.<init>(r2, r1)
            r2.columnKeySet = r0
        Lc:
            return r0
    }

    @Override // com.google.common.collect.Table
    public java.util.Map<C, java.util.Map<R, V>> columnMap() {
            r2 = this;
            com.google.common.collect.StandardTable<R, C, V>$ColumnMap r0 = r2.columnMap
            if (r0 != 0) goto Lc
            com.google.common.collect.StandardTable$ColumnMap r0 = new com.google.common.collect.StandardTable$ColumnMap
            r1 = 0
            r0.<init>(r2, r1)
            r2.columnMap = r0
        Lc:
            return r0
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean contains(@javax.annotation.CheckForNull java.lang.Object r1, @javax.annotation.CheckForNull java.lang.Object r2) {
            r0 = this;
            if (r1 == 0) goto Lc
            if (r2 == 0) goto Lc
            boolean r1 = super.contains(r1, r2)
            if (r1 == 0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            return r1
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean containsColumn(@javax.annotation.CheckForNull java.lang.Object r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.util.Map<R, java.util.Map<C, V>> r1 = r3.backingMap
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        Le:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L22
            java.lang.Object r2 = r1.next()
            java.util.Map r2 = (java.util.Map) r2
            boolean r2 = com.google.common.collect.Maps.safeContainsKey(r2, r4)
            if (r2 == 0) goto Le
            r4 = 1
            return r4
        L22:
            return r0
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean containsRow(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            if (r2 == 0) goto Lc
            java.util.Map<R, java.util.Map<C, V>> r0 = r1.backingMap
            boolean r2 = com.google.common.collect.Maps.safeContainsKey(r0, r2)
            if (r2 == 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean containsValue(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            if (r1 == 0) goto La
            boolean r1 = super.containsValue(r1)
            if (r1 == 0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    public java.util.Iterator<C> createColumnKeyIterator() {
            r2 = this;
            com.google.common.collect.StandardTable$ColumnKeyIterator r0 = new com.google.common.collect.StandardTable$ColumnKeyIterator
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public java.util.Map<R, java.util.Map<C, V>> createRowMap() {
            r1 = this;
            com.google.common.collect.StandardTable$RowMap r0 = new com.google.common.collect.StandardTable$RowMap
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @javax.annotation.CheckForNull
    public V get(@javax.annotation.CheckForNull java.lang.Object r1, @javax.annotation.CheckForNull java.lang.Object r2) {
            r0 = this;
            if (r1 == 0) goto La
            if (r2 != 0) goto L5
            goto La
        L5:
            java.lang.Object r1 = super.get(r1, r2)
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean isEmpty() {
            r1 = this;
            java.util.Map<R, java.util.Map<C, V>> r0 = r1.backingMap
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    public V put(R r1, C r2, V r3) {
            r0 = this;
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.base.Preconditions.checkNotNull(r3)
            java.util.Map r1 = r0.getOrCreate(r1)
            java.lang.Object r1 = r1.put(r2, r3)
            return r1
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    public V remove(@javax.annotation.CheckForNull java.lang.Object r3, @javax.annotation.CheckForNull java.lang.Object r4) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L21
            if (r4 != 0) goto L6
            goto L21
        L6:
            java.util.Map<R, java.util.Map<C, V>> r1 = r2.backingMap
            java.lang.Object r1 = com.google.common.collect.Maps.safeGet(r1, r3)
            java.util.Map r1 = (java.util.Map) r1
            if (r1 != 0) goto L11
            return r0
        L11:
            java.lang.Object r4 = r1.remove(r4)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L20
            java.util.Map<R, java.util.Map<C, V>> r0 = r2.backingMap
            r0.remove(r3)
        L20:
            return r4
        L21:
            return r0
    }

    @Override // com.google.common.collect.Table
    public java.util.Map<C, V> row(R r2) {
            r1 = this;
            com.google.common.collect.StandardTable$Row r0 = new com.google.common.collect.StandardTable$Row
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public java.util.Set<R> rowKeySet() {
            r1 = this;
            java.util.Map r0 = r1.rowMap()
            java.util.Set r0 = r0.keySet()
            return r0
    }

    @Override // com.google.common.collect.Table
    public java.util.Map<R, java.util.Map<C, V>> rowMap() {
            r1 = this;
            java.util.Map<R, java.util.Map<C, V>> r0 = r1.rowMap
            if (r0 != 0) goto La
            java.util.Map r0 = r1.createRowMap()
            r1.rowMap = r0
        La:
            return r0
    }

    @Override // com.google.common.collect.Table
    public int size() {
            r3 = this;
            java.util.Map<R, java.util.Map<C, V>> r0 = r3.backingMap
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        Lb:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1d
            java.lang.Object r2 = r0.next()
            java.util.Map r2 = (java.util.Map) r2
            int r2 = r2.size()
            int r1 = r1 + r2
            goto Lb
        L1d:
            return r1
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public java.util.Collection<V> values() {
            r1 = this;
            java.util.Collection r0 = super.values()
            return r0
    }
}
