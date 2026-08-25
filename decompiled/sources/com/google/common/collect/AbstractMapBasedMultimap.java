package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
abstract class AbstractMapBasedMultimap<K, V> extends com.google.common.collect.AbstractMultimap<K, V> implements java.io.Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    private transient java.util.Map<K, java.util.Collection<V>> map;
    private transient int totalSize;



    /* JADX INFO: loaded from: classes2.dex */
    public class AsMap extends com.google.common.collect.Maps.ViewCachingAbstractMap<K, java.util.Collection<V>> {
        public final transient java.util.Map<K, java.util.Collection<V>> submap;
        public final /* synthetic */ com.google.common.collect.AbstractMapBasedMultimap this$0;

        /* JADX INFO: loaded from: classes.dex */
        public class AsMapEntries extends com.google.common.collect.Maps.EntrySet<K, java.util.Collection<V>> {
            public final /* synthetic */ com.google.common.collect.AbstractMapBasedMultimap.AsMap this$1;

            public AsMapEntries(com.google.common.collect.AbstractMapBasedMultimap.AsMap r1) {
                    r0 = this;
                    r0.this$1 = r1
                    r0.<init>()
                    return
            }

            @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@javax.annotation.CheckForNull java.lang.Object r2) {
                    r1 = this;
                    com.google.common.collect.AbstractMapBasedMultimap$AsMap r0 = r1.this$1
                    java.util.Map<K, java.util.Collection<V>> r0 = r0.submap
                    java.util.Set r0 = r0.entrySet()
                    boolean r2 = com.google.common.collect.Collections2.safeContains(r0, r2)
                    return r2
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public java.util.Iterator<java.util.Map.Entry<K, java.util.Collection<V>>> iterator() {
                    r2 = this;
                    com.google.common.collect.AbstractMapBasedMultimap$AsMap$AsMapIterator r0 = new com.google.common.collect.AbstractMapBasedMultimap$AsMap$AsMapIterator
                    com.google.common.collect.AbstractMapBasedMultimap$AsMap r1 = r2.this$1
                    r0.<init>(r1)
                    return r0
            }

            @Override // com.google.common.collect.Maps.EntrySet
            public final java.util.Map<K, java.util.Collection<V>> map() {
                    r1 = this;
                    com.google.common.collect.AbstractMapBasedMultimap$AsMap r0 = r1.this$1
                    return r0
            }

            @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@javax.annotation.CheckForNull java.lang.Object r2) {
                    r1 = this;
                    boolean r0 = r1.contains(r2)
                    if (r0 != 0) goto L8
                    r2 = 0
                    return r2
                L8:
                    java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                    java.util.Objects.requireNonNull(r2)
                    java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                    com.google.common.collect.AbstractMapBasedMultimap$AsMap r0 = r1.this$1
                    com.google.common.collect.AbstractMapBasedMultimap r0 = r0.this$0
                    java.lang.Object r2 = r2.getKey()
                    com.google.common.collect.AbstractMapBasedMultimap.access$300(r0, r2)
                    r2 = 1
                    return r2
            }
        }

        /* JADX INFO: loaded from: classes.dex */
        public class AsMapIterator implements java.util.Iterator<java.util.Map.Entry<K, java.util.Collection<V>>> {

            @javax.annotation.CheckForNull
            public java.util.Collection<V> collection;
            public final java.util.Iterator<java.util.Map.Entry<K, java.util.Collection<V>>> delegateIterator;
            public final /* synthetic */ com.google.common.collect.AbstractMapBasedMultimap.AsMap this$1;

            public AsMapIterator(com.google.common.collect.AbstractMapBasedMultimap.AsMap r1) {
                    r0 = this;
                    r0.this$1 = r1
                    r0.<init>()
                    java.util.Map<K, java.util.Collection<V>> r1 = r1.submap
                    java.util.Set r1 = r1.entrySet()
                    java.util.Iterator r1 = r1.iterator()
                    r0.delegateIterator = r1
                    return
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                    r1 = this;
                    java.util.Iterator<java.util.Map$Entry<K, java.util.Collection<V>>> r0 = r1.delegateIterator
                    boolean r0 = r0.hasNext()
                    return r0
            }

            @Override // java.util.Iterator
            public /* bridge */ /* synthetic */ java.lang.Object next() {
                    r1 = this;
                    java.util.Map$Entry r0 = r1.next()
                    return r0
            }

            @Override // java.util.Iterator
            public java.util.Map.Entry<K, java.util.Collection<V>> next() {
                    r2 = this;
                    java.util.Iterator<java.util.Map$Entry<K, java.util.Collection<V>>> r0 = r2.delegateIterator
                    java.lang.Object r0 = r0.next()
                    java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                    java.lang.Object r1 = r0.getValue()
                    java.util.Collection r1 = (java.util.Collection) r1
                    r2.collection = r1
                    com.google.common.collect.AbstractMapBasedMultimap$AsMap r1 = r2.this$1
                    java.util.Map$Entry r0 = r1.wrapEntry(r0)
                    return r0
            }

            @Override // java.util.Iterator
            public void remove() {
                    r2 = this;
                    java.util.Collection<V> r0 = r2.collection
                    if (r0 == 0) goto L6
                    r0 = 1
                    goto L7
                L6:
                    r0 = 0
                L7:
                    java.lang.String r1 = "no calls to next() since the last call to remove()"
                    com.google.common.base.Preconditions.checkState(r0, r1)
                    java.util.Iterator<java.util.Map$Entry<K, java.util.Collection<V>>> r0 = r2.delegateIterator
                    r0.remove()
                    com.google.common.collect.AbstractMapBasedMultimap$AsMap r0 = r2.this$1
                    com.google.common.collect.AbstractMapBasedMultimap r0 = r0.this$0
                    java.util.Collection<V> r1 = r2.collection
                    int r1 = r1.size()
                    com.google.common.collect.AbstractMapBasedMultimap.access$220(r0, r1)
                    java.util.Collection<V> r0 = r2.collection
                    r0.clear()
                    r0 = 0
                    r2.collection = r0
                    return
            }
        }

        public AsMap(com.google.common.collect.AbstractMapBasedMultimap r1, java.util.Map<K, java.util.Collection<V>> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.submap = r2
                return
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
                r2 = this;
                java.util.Map<K, java.util.Collection<V>> r0 = r2.submap
                com.google.common.collect.AbstractMapBasedMultimap r1 = r2.this$0
                java.util.Map r1 = com.google.common.collect.AbstractMapBasedMultimap.access$000(r1)
                if (r0 != r1) goto L10
                com.google.common.collect.AbstractMapBasedMultimap r0 = r2.this$0
                r0.clear()
                goto L18
            L10:
                com.google.common.collect.AbstractMapBasedMultimap$AsMap$AsMapIterator r0 = new com.google.common.collect.AbstractMapBasedMultimap$AsMap$AsMapIterator
                r0.<init>(r2)
                com.google.common.collect.Iterators.clear(r0)
            L18:
                return
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                java.util.Map<K, java.util.Collection<V>> r0 = r1.submap
                boolean r2 = com.google.common.collect.Maps.safeContainsKey(r0, r2)
                return r2
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final java.util.Set<java.util.Map.Entry<K, java.util.Collection<V>>> createEntrySet() {
                r1 = this;
                com.google.common.collect.AbstractMapBasedMultimap$AsMap$AsMapEntries r0 = new com.google.common.collect.AbstractMapBasedMultimap$AsMap$AsMapEntries
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                if (r1 == r2) goto Ld
                java.util.Map<K, java.util.Collection<V>> r0 = r1.submap
                boolean r2 = r0.equals(r2)
                if (r2 == 0) goto Lb
                goto Ld
            Lb:
                r2 = 0
                goto Le
            Ld:
                r2 = 1
            Le:
                return r2
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public /* bridge */ /* synthetic */ java.lang.Object get(@javax.annotation.CheckForNull java.lang.Object r1) {
                r0 = this;
                java.util.Collection r1 = r0.get(r1)
                return r1
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public java.util.Collection<V> get(@javax.annotation.CheckForNull java.lang.Object r3) {
                r2 = this;
                java.util.Map<K, java.util.Collection<V>> r0 = r2.submap
                java.lang.Object r0 = com.google.common.collect.Maps.safeGet(r0, r3)
                java.util.Collection r0 = (java.util.Collection) r0
                if (r0 != 0) goto Lc
                r3 = 0
                return r3
            Lc:
                com.google.common.collect.AbstractMapBasedMultimap r1 = r2.this$0
                java.util.Collection r3 = r1.wrapCollection(r3, r0)
                return r3
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
                r1 = this;
                java.util.Map<K, java.util.Collection<V>> r0 = r1.submap
                int r0 = r0.hashCode()
                return r0
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public java.util.Set<K> keySet() {
                r1 = this;
                com.google.common.collect.AbstractMapBasedMultimap r0 = r1.this$0
                java.util.Set r0 = r0.keySet()
                return r0
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public /* bridge */ /* synthetic */ java.lang.Object remove(@javax.annotation.CheckForNull java.lang.Object r1) {
                r0 = this;
                java.util.Collection r1 = r0.remove(r1)
                return r1
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public java.util.Collection<V> remove(@javax.annotation.CheckForNull java.lang.Object r4) {
                r3 = this;
                java.util.Map<K, java.util.Collection<V>> r0 = r3.submap
                java.lang.Object r4 = r0.remove(r4)
                java.util.Collection r4 = (java.util.Collection) r4
                if (r4 != 0) goto Lc
                r4 = 0
                return r4
            Lc:
                com.google.common.collect.AbstractMapBasedMultimap r0 = r3.this$0
                java.util.Collection r0 = r0.createCollection()
                r0.addAll(r4)
                com.google.common.collect.AbstractMapBasedMultimap r1 = r3.this$0
                int r2 = r4.size()
                com.google.common.collect.AbstractMapBasedMultimap.access$220(r1, r2)
                r4.clear()
                return r0
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
                r1 = this;
                java.util.Map<K, java.util.Collection<V>> r0 = r1.submap
                int r0 = r0.size()
                return r0
        }

        @Override // java.util.AbstractMap
        public java.lang.String toString() {
                r1 = this;
                java.util.Map<K, java.util.Collection<V>> r0 = r1.submap
                java.lang.String r0 = r0.toString()
                return r0
        }

        public final java.util.Map.Entry<K, java.util.Collection<V>> wrapEntry(java.util.Map.Entry<K, java.util.Collection<V>> r3) {
                r2 = this;
                java.lang.Object r0 = r3.getKey()
                com.google.common.collect.AbstractMapBasedMultimap r1 = r2.this$0
                java.lang.Object r3 = r3.getValue()
                java.util.Collection r3 = (java.util.Collection) r3
                java.util.Collection r3 = r1.wrapCollection(r0, r3)
                java.util.Map$Entry r3 = com.google.common.collect.Maps.immutableEntry(r0, r3)
                return r3
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public abstract class Itr<T> implements java.util.Iterator<T> {

        @javax.annotation.CheckForNull
        public java.util.Collection<V> collection;

        @javax.annotation.CheckForNull
        public K key;
        public final java.util.Iterator<java.util.Map.Entry<K, java.util.Collection<V>>> keyIterator;
        public final /* synthetic */ com.google.common.collect.AbstractMapBasedMultimap this$0;
        public java.util.Iterator<V> valueIterator;

        public Itr(com.google.common.collect.AbstractMapBasedMultimap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.util.Map r1 = com.google.common.collect.AbstractMapBasedMultimap.access$000(r1)
                java.util.Set r1 = r1.entrySet()
                java.util.Iterator r1 = r1.iterator()
                r0.keyIterator = r1
                r1 = 0
                r0.key = r1
                r0.collection = r1
                com.google.common.collect.Iterators$EmptyModifiableIterator r1 = com.google.common.collect.Iterators.EmptyModifiableIterator.INSTANCE
                r0.valueIterator = r1
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                java.util.Iterator<java.util.Map$Entry<K, java.util.Collection<V>>> r0 = r1.keyIterator
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L13
                java.util.Iterator<V> r0 = r1.valueIterator
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
        public T next() {
                r2 = this;
                java.util.Iterator<V> r0 = r2.valueIterator
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L24
                java.util.Iterator<java.util.Map$Entry<K, java.util.Collection<V>>> r0 = r2.keyIterator
                java.lang.Object r0 = r0.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getKey()
                r2.key = r1
                java.lang.Object r0 = r0.getValue()
                java.util.Collection r0 = (java.util.Collection) r0
                r2.collection = r0
                java.util.Iterator r0 = r0.iterator()
                r2.valueIterator = r0
            L24:
                K r0 = r2.key
                java.util.Iterator<V> r1 = r2.valueIterator
                java.lang.Object r1 = r1.next()
                java.lang.Object r0 = r2.output(r0, r1)
                return r0
        }

        public abstract T output(@com.google.common.collect.ParametricNullness K r1, @com.google.common.collect.ParametricNullness V r2);

        @Override // java.util.Iterator
        public void remove() {
                r1 = this;
                java.util.Iterator<V> r0 = r1.valueIterator
                r0.remove()
                java.util.Collection<V> r0 = r1.collection
                java.util.Objects.requireNonNull(r0)
                java.util.Collection r0 = (java.util.Collection) r0
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L17
                java.util.Iterator<java.util.Map$Entry<K, java.util.Collection<V>>> r0 = r1.keyIterator
                r0.remove()
            L17:
                com.google.common.collect.AbstractMapBasedMultimap r0 = r1.this$0
                com.google.common.collect.AbstractMapBasedMultimap.access$210(r0)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class KeySet extends com.google.common.collect.Maps.KeySet<K, java.util.Collection<V>> {
        public final /* synthetic */ com.google.common.collect.AbstractMapBasedMultimap this$0;


        public KeySet(com.google.common.collect.AbstractMapBasedMultimap r1, java.util.Map<K, java.util.Collection<V>> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
                r1 = this;
                java.util.Iterator r0 = r1.iterator()
                com.google.common.collect.Iterators.clear(r0)
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(java.util.Collection<?> r2) {
                r1 = this;
                java.util.Map<K, V> r0 = r1.map
                java.util.Set r0 = r0.keySet()
                boolean r2 = r0.containsAll(r2)
                return r2
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                if (r1 == r2) goto L11
                java.util.Map<K, V> r0 = r1.map
                java.util.Set r0 = r0.keySet()
                boolean r2 = r0.equals(r2)
                if (r2 == 0) goto Lf
                goto L11
            Lf:
                r2 = 0
                goto L12
            L11:
                r2 = 1
            L12:
                return r2
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
                r1 = this;
                java.util.Map<K, V> r0 = r1.map
                java.util.Set r0 = r0.keySet()
                int r0 = r0.hashCode()
                return r0
        }

        @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<K> iterator() {
                r2 = this;
                java.util.Map<K, V> r0 = r2.map
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
                com.google.common.collect.AbstractMapBasedMultimap$KeySet$1 r1 = new com.google.common.collect.AbstractMapBasedMultimap$KeySet$1
                r1.<init>(r2, r0)
                return r1
        }

        @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@javax.annotation.CheckForNull java.lang.Object r3) {
                r2 = this;
                java.util.Map<K, V> r0 = r2.map
                java.lang.Object r3 = r0.remove(r3)
                java.util.Collection r3 = (java.util.Collection) r3
                r0 = 0
                if (r3 == 0) goto L18
                int r1 = r3.size()
                r3.clear()
                com.google.common.collect.AbstractMapBasedMultimap r3 = r2.this$0
                com.google.common.collect.AbstractMapBasedMultimap.access$220(r3, r1)
                goto L19
            L18:
                r1 = 0
            L19:
                if (r1 <= 0) goto L1c
                r0 = 1
            L1c:
                return r0
        }
    }

    public class NavigableAsMap extends com.google.common.collect.AbstractMapBasedMultimap<K, V>.SortedAsMap implements java.util.NavigableMap<K, java.util.Collection<V>> {
        public final /* synthetic */ com.google.common.collect.AbstractMapBasedMultimap this$0;

        public NavigableAsMap(com.google.common.collect.AbstractMapBasedMultimap r1, java.util.NavigableMap<K, java.util.Collection<V>> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1, r2)
                return
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, java.util.Collection<V>> ceilingEntry(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                java.util.NavigableMap r0 = r1.sortedMap()
                java.util.Map$Entry r2 = r0.ceilingEntry(r2)
                if (r2 != 0) goto Lc
                r2 = 0
                goto L10
            Lc:
                java.util.Map$Entry r2 = r1.wrapEntry(r2)
            L10:
                return r2
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public K ceilingKey(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                java.util.NavigableMap r0 = r1.sortedMap()
                java.lang.Object r2 = r0.ceilingKey(r2)
                return r2
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, com.google.common.collect.Maps.ViewCachingAbstractMap
        public final java.util.Set createKeySet() {
                r3 = this;
                com.google.common.collect.AbstractMapBasedMultimap$NavigableKeySet r0 = new com.google.common.collect.AbstractMapBasedMultimap$NavigableKeySet
                com.google.common.collect.AbstractMapBasedMultimap r1 = r3.this$0
                java.util.NavigableMap r2 = r3.sortedMap()
                r0.<init>(r1, r2)
                return r0
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, com.google.common.collect.Maps.ViewCachingAbstractMap
        public final java.util.SortedSet createKeySet() {
                r3 = this;
                com.google.common.collect.AbstractMapBasedMultimap$NavigableKeySet r0 = new com.google.common.collect.AbstractMapBasedMultimap$NavigableKeySet
                com.google.common.collect.AbstractMapBasedMultimap r1 = r3.this$0
                java.util.NavigableMap r2 = r3.sortedMap()
                r0.<init>(r1, r2)
                return r0
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableSet<K> descendingKeySet() {
                r1 = this;
                java.util.NavigableMap r0 = r1.descendingMap()
                java.util.NavigableSet r0 = r0.navigableKeySet()
                return r0
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, java.util.Collection<V>> descendingMap() {
                r3 = this;
                com.google.common.collect.AbstractMapBasedMultimap$NavigableAsMap r0 = new com.google.common.collect.AbstractMapBasedMultimap$NavigableAsMap
                com.google.common.collect.AbstractMapBasedMultimap r1 = r3.this$0
                java.util.NavigableMap r2 = r3.sortedMap()
                java.util.NavigableMap r2 = r2.descendingMap()
                r0.<init>(r1, r2)
                return r0
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, java.util.Collection<V>> firstEntry() {
                r1 = this;
                java.util.NavigableMap r0 = r1.sortedMap()
                java.util.Map$Entry r0 = r0.firstEntry()
                if (r0 != 0) goto Lc
                r0 = 0
                goto L10
            Lc:
                java.util.Map$Entry r0 = r1.wrapEntry(r0)
            L10:
                return r0
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, java.util.Collection<V>> floorEntry(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                java.util.NavigableMap r0 = r1.sortedMap()
                java.util.Map$Entry r2 = r0.floorEntry(r2)
                if (r2 != 0) goto Lc
                r2 = 0
                goto L10
            Lc:
                java.util.Map$Entry r2 = r1.wrapEntry(r2)
            L10:
                return r2
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public K floorKey(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                java.util.NavigableMap r0 = r1.sortedMap()
                java.lang.Object r2 = r0.floorKey(r2)
                return r2
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public java.util.NavigableMap<K, java.util.Collection<V>> headMap(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                r0 = 0
                java.util.NavigableMap r2 = r1.headMap(r2, r0)
                return r2
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, java.util.Collection<V>> headMap(@com.google.common.collect.ParametricNullness K r4, boolean r5) {
                r3 = this;
                com.google.common.collect.AbstractMapBasedMultimap$NavigableAsMap r0 = new com.google.common.collect.AbstractMapBasedMultimap$NavigableAsMap
                com.google.common.collect.AbstractMapBasedMultimap r1 = r3.this$0
                java.util.NavigableMap r2 = r3.sortedMap()
                java.util.NavigableMap r4 = r2.headMap(r4, r5)
                r0.<init>(r1, r4)
                return r0
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public /* bridge */ /* synthetic */ java.util.SortedMap headMap(@com.google.common.collect.ParametricNullness java.lang.Object r1) {
                r0 = this;
                java.util.NavigableMap r1 = r0.headMap(r1)
                return r1
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, java.util.Collection<V>> higherEntry(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                java.util.NavigableMap r0 = r1.sortedMap()
                java.util.Map$Entry r2 = r0.higherEntry(r2)
                if (r2 != 0) goto Lc
                r2 = 0
                goto L10
            Lc:
                java.util.Map$Entry r2 = r1.wrapEntry(r2)
            L10:
                return r2
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public K higherKey(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                java.util.NavigableMap r0 = r1.sortedMap()
                java.lang.Object r2 = r0.higherKey(r2)
                return r2
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, com.google.common.collect.AbstractMapBasedMultimap.AsMap, com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public java.util.NavigableSet<K> keySet() {
                r1 = this;
                java.util.SortedSet r0 = super.keySet()
                java.util.NavigableSet r0 = (java.util.NavigableSet) r0
                return r0
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, com.google.common.collect.AbstractMapBasedMultimap.AsMap, com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ java.util.Set keySet() {
                r1 = this;
                java.util.NavigableSet r0 = r1.keySet()
                return r0
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, com.google.common.collect.AbstractMapBasedMultimap.AsMap, com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ java.util.SortedSet keySet() {
                r1 = this;
                java.util.NavigableSet r0 = r1.keySet()
                return r0
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, java.util.Collection<V>> lastEntry() {
                r1 = this;
                java.util.NavigableMap r0 = r1.sortedMap()
                java.util.Map$Entry r0 = r0.lastEntry()
                if (r0 != 0) goto Lc
                r0 = 0
                goto L10
            Lc:
                java.util.Map$Entry r0 = r1.wrapEntry(r0)
            L10:
                return r0
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, java.util.Collection<V>> lowerEntry(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                java.util.NavigableMap r0 = r1.sortedMap()
                java.util.Map$Entry r2 = r0.lowerEntry(r2)
                if (r2 != 0) goto Lc
                r2 = 0
                goto L10
            Lc:
                java.util.Map$Entry r2 = r1.wrapEntry(r2)
            L10:
                return r2
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public K lowerKey(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                java.util.NavigableMap r0 = r1.sortedMap()
                java.lang.Object r2 = r0.lowerKey(r2)
                return r2
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableSet<K> navigableKeySet() {
                r1 = this;
                java.util.NavigableSet r0 = r1.keySet()
                return r0
        }

        @javax.annotation.CheckForNull
        public final java.util.Map.Entry<K, java.util.Collection<V>> pollAsMapEntry(java.util.Iterator<java.util.Map.Entry<K, java.util.Collection<V>>> r4) {
                r3 = this;
                boolean r0 = r4.hasNext()
                if (r0 != 0) goto L8
                r4 = 0
                return r4
            L8:
                java.lang.Object r0 = r4.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                com.google.common.collect.AbstractMapBasedMultimap r1 = r3.this$0
                java.util.Collection r1 = r1.createCollection()
                java.lang.Object r2 = r0.getValue()
                java.util.Collection r2 = (java.util.Collection) r2
                r1.addAll(r2)
                r4.remove()
                java.lang.Object r4 = r0.getKey()
                com.google.common.collect.AbstractMapBasedMultimap r0 = r3.this$0
                java.util.Collection r0 = r0.unmodifiableCollectionSubclass(r1)
                java.util.Map$Entry r4 = com.google.common.collect.Maps.immutableEntry(r4, r0)
                return r4
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, java.util.Collection<V>> pollFirstEntry() {
                r1 = this;
                java.util.Set r0 = r1.entrySet()
                java.util.Iterator r0 = r0.iterator()
                java.util.Map$Entry r0 = r1.pollAsMapEntry(r0)
                return r0
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, java.util.Collection<V>> pollLastEntry() {
                r1 = this;
                java.util.NavigableMap r0 = r1.descendingMap()
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
                java.util.Map$Entry r0 = r1.pollAsMapEntry(r0)
                return r0
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap
        public final java.util.NavigableMap<K, java.util.Collection<V>> sortedMap() {
                r1 = this;
                java.util.Map<K, java.util.Collection<V>> r0 = r1.submap
                java.util.SortedMap r0 = (java.util.SortedMap) r0
                java.util.NavigableMap r0 = (java.util.NavigableMap) r0
                return r0
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap
        public final /* bridge */ /* synthetic */ java.util.SortedMap sortedMap() {
                r1 = this;
                java.util.NavigableMap r0 = r1.sortedMap()
                return r0
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public java.util.NavigableMap<K, java.util.Collection<V>> subMap(@com.google.common.collect.ParametricNullness K r3, @com.google.common.collect.ParametricNullness K r4) {
                r2 = this;
                r0 = 1
                r1 = 0
                java.util.NavigableMap r3 = r2.subMap(r3, r0, r4, r1)
                return r3
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, java.util.Collection<V>> subMap(@com.google.common.collect.ParametricNullness K r4, boolean r5, @com.google.common.collect.ParametricNullness K r6, boolean r7) {
                r3 = this;
                com.google.common.collect.AbstractMapBasedMultimap$NavigableAsMap r0 = new com.google.common.collect.AbstractMapBasedMultimap$NavigableAsMap
                com.google.common.collect.AbstractMapBasedMultimap r1 = r3.this$0
                java.util.NavigableMap r2 = r3.sortedMap()
                java.util.NavigableMap r4 = r2.subMap(r4, r5, r6, r7)
                r0.<init>(r1, r4)
                return r0
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public /* bridge */ /* synthetic */ java.util.SortedMap subMap(@com.google.common.collect.ParametricNullness java.lang.Object r1, @com.google.common.collect.ParametricNullness java.lang.Object r2) {
                r0 = this;
                java.util.NavigableMap r1 = r0.subMap(r1, r2)
                return r1
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public java.util.NavigableMap<K, java.util.Collection<V>> tailMap(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                r0 = 1
                java.util.NavigableMap r2 = r1.tailMap(r2, r0)
                return r2
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, java.util.Collection<V>> tailMap(@com.google.common.collect.ParametricNullness K r4, boolean r5) {
                r3 = this;
                com.google.common.collect.AbstractMapBasedMultimap$NavigableAsMap r0 = new com.google.common.collect.AbstractMapBasedMultimap$NavigableAsMap
                com.google.common.collect.AbstractMapBasedMultimap r1 = r3.this$0
                java.util.NavigableMap r2 = r3.sortedMap()
                java.util.NavigableMap r4 = r2.tailMap(r4, r5)
                r0.<init>(r1, r4)
                return r0
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public /* bridge */ /* synthetic */ java.util.SortedMap tailMap(@com.google.common.collect.ParametricNullness java.lang.Object r1) {
                r0 = this;
                java.util.NavigableMap r1 = r0.tailMap(r1)
                return r1
        }
    }

    public class NavigableKeySet extends com.google.common.collect.AbstractMapBasedMultimap<K, V>.SortedKeySet implements java.util.NavigableSet<K> {
        public final /* synthetic */ com.google.common.collect.AbstractMapBasedMultimap this$0;

        public NavigableKeySet(com.google.common.collect.AbstractMapBasedMultimap r1, java.util.NavigableMap<K, java.util.Collection<V>> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1, r2)
                return
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public K ceiling(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                java.util.NavigableMap r0 = r1.sortedMap()
                java.lang.Object r2 = r0.ceilingKey(r2)
                return r2
        }

        @Override // java.util.NavigableSet
        public java.util.Iterator<K> descendingIterator() {
                r1 = this;
                java.util.NavigableSet r0 = r1.descendingSet()
                java.util.Iterator r0 = r0.iterator()
                return r0
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<K> descendingSet() {
                r3 = this;
                com.google.common.collect.AbstractMapBasedMultimap$NavigableKeySet r0 = new com.google.common.collect.AbstractMapBasedMultimap$NavigableKeySet
                com.google.common.collect.AbstractMapBasedMultimap r1 = r3.this$0
                java.util.NavigableMap r2 = r3.sortedMap()
                java.util.NavigableMap r2 = r2.descendingMap()
                r0.<init>(r1, r2)
                return r0
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public K floor(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                java.util.NavigableMap r0 = r1.sortedMap()
                java.lang.Object r2 = r0.floorKey(r2)
                return r2
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public java.util.NavigableSet<K> headSet(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                r0 = 0
                java.util.NavigableSet r2 = r1.headSet(r2, r0)
                return r2
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<K> headSet(@com.google.common.collect.ParametricNullness K r4, boolean r5) {
                r3 = this;
                com.google.common.collect.AbstractMapBasedMultimap$NavigableKeySet r0 = new com.google.common.collect.AbstractMapBasedMultimap$NavigableKeySet
                com.google.common.collect.AbstractMapBasedMultimap r1 = r3.this$0
                java.util.NavigableMap r2 = r3.sortedMap()
                java.util.NavigableMap r4 = r2.headMap(r4, r5)
                r0.<init>(r1, r4)
                return r0
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public /* bridge */ /* synthetic */ java.util.SortedSet headSet(@com.google.common.collect.ParametricNullness java.lang.Object r1) {
                r0 = this;
                java.util.NavigableSet r1 = r0.headSet(r1)
                return r1
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public K higher(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                java.util.NavigableMap r0 = r1.sortedMap()
                java.lang.Object r2 = r0.higherKey(r2)
                return r2
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public K lower(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                java.util.NavigableMap r0 = r1.sortedMap()
                java.lang.Object r2 = r0.lowerKey(r2)
                return r2
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public K pollFirst() {
                r1 = this;
                java.util.Iterator r0 = r1.iterator()
                java.lang.Object r0 = com.google.common.collect.Iterators.pollNext(r0)
                return r0
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public K pollLast() {
                r1 = this;
                java.util.Iterator r0 = r1.descendingIterator()
                java.lang.Object r0 = com.google.common.collect.Iterators.pollNext(r0)
                return r0
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet
        public final java.util.NavigableMap<K, java.util.Collection<V>> sortedMap() {
                r1 = this;
                java.util.Map<K, V> r0 = r1.map
                java.util.SortedMap r0 = (java.util.SortedMap) r0
                java.util.NavigableMap r0 = (java.util.NavigableMap) r0
                return r0
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet
        public final /* bridge */ /* synthetic */ java.util.SortedMap sortedMap() {
                r1 = this;
                java.util.NavigableMap r0 = r1.sortedMap()
                return r0
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public java.util.NavigableSet<K> subSet(@com.google.common.collect.ParametricNullness K r3, @com.google.common.collect.ParametricNullness K r4) {
                r2 = this;
                r0 = 1
                r1 = 0
                java.util.NavigableSet r3 = r2.subSet(r3, r0, r4, r1)
                return r3
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<K> subSet(@com.google.common.collect.ParametricNullness K r4, boolean r5, @com.google.common.collect.ParametricNullness K r6, boolean r7) {
                r3 = this;
                com.google.common.collect.AbstractMapBasedMultimap$NavigableKeySet r0 = new com.google.common.collect.AbstractMapBasedMultimap$NavigableKeySet
                com.google.common.collect.AbstractMapBasedMultimap r1 = r3.this$0
                java.util.NavigableMap r2 = r3.sortedMap()
                java.util.NavigableMap r4 = r2.subMap(r4, r5, r6, r7)
                r0.<init>(r1, r4)
                return r0
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public /* bridge */ /* synthetic */ java.util.SortedSet subSet(@com.google.common.collect.ParametricNullness java.lang.Object r1, @com.google.common.collect.ParametricNullness java.lang.Object r2) {
                r0 = this;
                java.util.NavigableSet r1 = r0.subSet(r1, r2)
                return r1
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public java.util.NavigableSet<K> tailSet(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                r0 = 1
                java.util.NavigableSet r2 = r1.tailSet(r2, r0)
                return r2
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<K> tailSet(@com.google.common.collect.ParametricNullness K r4, boolean r5) {
                r3 = this;
                com.google.common.collect.AbstractMapBasedMultimap$NavigableKeySet r0 = new com.google.common.collect.AbstractMapBasedMultimap$NavigableKeySet
                com.google.common.collect.AbstractMapBasedMultimap r1 = r3.this$0
                java.util.NavigableMap r2 = r3.sortedMap()
                java.util.NavigableMap r4 = r2.tailMap(r4, r5)
                r0.<init>(r1, r4)
                return r0
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public /* bridge */ /* synthetic */ java.util.SortedSet tailSet(@com.google.common.collect.ParametricNullness java.lang.Object r1) {
                r0 = this;
                java.util.NavigableSet r1 = r0.tailSet(r1)
                return r1
        }
    }

    public class RandomAccessWrappedList extends com.google.common.collect.AbstractMapBasedMultimap<K, V>.WrappedList implements java.util.RandomAccess {
        public RandomAccessWrappedList(@com.google.common.collect.ParametricNullness com.google.common.collect.AbstractMapBasedMultimap r1, K r2, @javax.annotation.CheckForNull java.util.List<V> r3, com.google.common.collect.AbstractMapBasedMultimap<K, V>.WrappedCollection r4) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class SortedAsMap extends com.google.common.collect.AbstractMapBasedMultimap<K, V>.AsMap implements java.util.SortedMap<K, java.util.Collection<V>> {

        @javax.annotation.CheckForNull
        public java.util.SortedSet<K> sortedKeySet;
        public final /* synthetic */ com.google.common.collect.AbstractMapBasedMultimap this$0;

        public SortedAsMap(com.google.common.collect.AbstractMapBasedMultimap r1, java.util.SortedMap<K, java.util.Collection<V>> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1, r2)
                return
        }

        @Override // java.util.SortedMap
        @javax.annotation.CheckForNull
        public java.util.Comparator<? super K> comparator() {
                r1 = this;
                java.util.SortedMap r0 = r1.sortedMap()
                java.util.Comparator r0 = r0.comparator()
                return r0
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public /* bridge */ /* synthetic */ java.util.Set createKeySet() {
                r1 = this;
                java.util.SortedSet r0 = r1.createKeySet()
                return r0
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public java.util.SortedSet<K> createKeySet() {
                r3 = this;
                com.google.common.collect.AbstractMapBasedMultimap$SortedKeySet r0 = new com.google.common.collect.AbstractMapBasedMultimap$SortedKeySet
                com.google.common.collect.AbstractMapBasedMultimap r1 = r3.this$0
                java.util.SortedMap r2 = r3.sortedMap()
                r0.<init>(r1, r2)
                return r0
        }

        @Override // java.util.SortedMap
        @com.google.common.collect.ParametricNullness
        public K firstKey() {
                r1 = this;
                java.util.SortedMap r0 = r1.sortedMap()
                java.lang.Object r0 = r0.firstKey()
                return r0
        }

        public java.util.SortedMap<K, java.util.Collection<V>> headMap(@com.google.common.collect.ParametricNullness K r4) {
                r3 = this;
                com.google.common.collect.AbstractMapBasedMultimap$SortedAsMap r0 = new com.google.common.collect.AbstractMapBasedMultimap$SortedAsMap
                com.google.common.collect.AbstractMapBasedMultimap r1 = r3.this$0
                java.util.SortedMap r2 = r3.sortedMap()
                java.util.SortedMap r4 = r2.headMap(r4)
                r0.<init>(r1, r4)
                return r0
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.AsMap, com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ java.util.Set keySet() {
                r1 = this;
                java.util.SortedSet r0 = r1.keySet()
                return r0
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.AsMap, com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public java.util.SortedSet<K> keySet() {
                r1 = this;
                java.util.SortedSet<K> r0 = r1.sortedKeySet
                if (r0 != 0) goto La
                java.util.SortedSet r0 = r1.createKeySet()
                r1.sortedKeySet = r0
            La:
                return r0
        }

        @Override // java.util.SortedMap
        @com.google.common.collect.ParametricNullness
        public K lastKey() {
                r1 = this;
                java.util.SortedMap r0 = r1.sortedMap()
                java.lang.Object r0 = r0.lastKey()
                return r0
        }

        public java.util.SortedMap<K, java.util.Collection<V>> sortedMap() {
                r1 = this;
                java.util.Map<K, java.util.Collection<V>> r0 = r1.submap
                java.util.SortedMap r0 = (java.util.SortedMap) r0
                return r0
        }

        public java.util.SortedMap<K, java.util.Collection<V>> subMap(@com.google.common.collect.ParametricNullness K r4, @com.google.common.collect.ParametricNullness K r5) {
                r3 = this;
                com.google.common.collect.AbstractMapBasedMultimap$SortedAsMap r0 = new com.google.common.collect.AbstractMapBasedMultimap$SortedAsMap
                com.google.common.collect.AbstractMapBasedMultimap r1 = r3.this$0
                java.util.SortedMap r2 = r3.sortedMap()
                java.util.SortedMap r4 = r2.subMap(r4, r5)
                r0.<init>(r1, r4)
                return r0
        }

        public java.util.SortedMap<K, java.util.Collection<V>> tailMap(@com.google.common.collect.ParametricNullness K r4) {
                r3 = this;
                com.google.common.collect.AbstractMapBasedMultimap$SortedAsMap r0 = new com.google.common.collect.AbstractMapBasedMultimap$SortedAsMap
                com.google.common.collect.AbstractMapBasedMultimap r1 = r3.this$0
                java.util.SortedMap r2 = r3.sortedMap()
                java.util.SortedMap r4 = r2.tailMap(r4)
                r0.<init>(r1, r4)
                return r0
        }
    }

    public class SortedKeySet extends com.google.common.collect.AbstractMapBasedMultimap<K, V>.KeySet implements java.util.SortedSet<K> {
        public final /* synthetic */ com.google.common.collect.AbstractMapBasedMultimap this$0;

        public SortedKeySet(com.google.common.collect.AbstractMapBasedMultimap r1, java.util.SortedMap<K, java.util.Collection<V>> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1, r2)
                return
        }

        @Override // java.util.SortedSet
        @javax.annotation.CheckForNull
        public java.util.Comparator<? super K> comparator() {
                r1 = this;
                java.util.SortedMap r0 = r1.sortedMap()
                java.util.Comparator r0 = r0.comparator()
                return r0
        }

        @Override // java.util.SortedSet
        @com.google.common.collect.ParametricNullness
        public K first() {
                r1 = this;
                java.util.SortedMap r0 = r1.sortedMap()
                java.lang.Object r0 = r0.firstKey()
                return r0
        }

        public java.util.SortedSet<K> headSet(@com.google.common.collect.ParametricNullness K r4) {
                r3 = this;
                com.google.common.collect.AbstractMapBasedMultimap$SortedKeySet r0 = new com.google.common.collect.AbstractMapBasedMultimap$SortedKeySet
                com.google.common.collect.AbstractMapBasedMultimap r1 = r3.this$0
                java.util.SortedMap r2 = r3.sortedMap()
                java.util.SortedMap r4 = r2.headMap(r4)
                r0.<init>(r1, r4)
                return r0
        }

        @Override // java.util.SortedSet
        @com.google.common.collect.ParametricNullness
        public K last() {
                r1 = this;
                java.util.SortedMap r0 = r1.sortedMap()
                java.lang.Object r0 = r0.lastKey()
                return r0
        }

        public java.util.SortedMap<K, java.util.Collection<V>> sortedMap() {
                r1 = this;
                java.util.Map<K, V> r0 = r1.map
                java.util.SortedMap r0 = (java.util.SortedMap) r0
                return r0
        }

        public java.util.SortedSet<K> subSet(@com.google.common.collect.ParametricNullness K r4, @com.google.common.collect.ParametricNullness K r5) {
                r3 = this;
                com.google.common.collect.AbstractMapBasedMultimap$SortedKeySet r0 = new com.google.common.collect.AbstractMapBasedMultimap$SortedKeySet
                com.google.common.collect.AbstractMapBasedMultimap r1 = r3.this$0
                java.util.SortedMap r2 = r3.sortedMap()
                java.util.SortedMap r4 = r2.subMap(r4, r5)
                r0.<init>(r1, r4)
                return r0
        }

        public java.util.SortedSet<K> tailSet(@com.google.common.collect.ParametricNullness K r4) {
                r3 = this;
                com.google.common.collect.AbstractMapBasedMultimap$SortedKeySet r0 = new com.google.common.collect.AbstractMapBasedMultimap$SortedKeySet
                com.google.common.collect.AbstractMapBasedMultimap r1 = r3.this$0
                java.util.SortedMap r2 = r3.sortedMap()
                java.util.SortedMap r4 = r2.tailMap(r4)
                r0.<init>(r1, r4)
                return r0
        }
    }

    public class WrappedCollection extends java.util.AbstractCollection<V> {

        @javax.annotation.CheckForNull
        public final com.google.common.collect.AbstractMapBasedMultimap<K, V>.WrappedCollection ancestor;

        @javax.annotation.CheckForNull
        public final java.util.Collection<V> ancestorDelegate;
        public java.util.Collection<V> delegate;

        @com.google.common.collect.ParametricNullness
        public final K key;
        public final /* synthetic */ com.google.common.collect.AbstractMapBasedMultimap this$0;

        public class WrappedIterator implements java.util.Iterator<V> {
            public final java.util.Iterator<V> delegateIterator;
            public final java.util.Collection<V> originalDelegate;
            public final /* synthetic */ com.google.common.collect.AbstractMapBasedMultimap.WrappedCollection this$1;

            public WrappedIterator(com.google.common.collect.AbstractMapBasedMultimap.WrappedCollection r1) {
                    r0 = this;
                    r0.this$1 = r1
                    r0.<init>()
                    java.util.Collection<V> r1 = r1.delegate
                    r0.originalDelegate = r1
                    java.util.Iterator r1 = com.google.common.collect.AbstractMapBasedMultimap.access$100(r1)
                    r0.delegateIterator = r1
                    return
            }

            public WrappedIterator(com.google.common.collect.AbstractMapBasedMultimap.WrappedCollection r1, java.util.Iterator<V> r2) {
                    r0 = this;
                    r0.this$1 = r1
                    r0.<init>()
                    java.util.Collection<V> r1 = r1.delegate
                    r0.originalDelegate = r1
                    r0.delegateIterator = r2
                    return
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                    r1 = this;
                    r1.validateIterator()
                    java.util.Iterator<V> r0 = r1.delegateIterator
                    boolean r0 = r0.hasNext()
                    return r0
            }

            @Override // java.util.Iterator
            @com.google.common.collect.ParametricNullness
            public V next() {
                    r1 = this;
                    r1.validateIterator()
                    java.util.Iterator<V> r0 = r1.delegateIterator
                    java.lang.Object r0 = r0.next()
                    return r0
            }

            @Override // java.util.Iterator
            public void remove() {
                    r1 = this;
                    java.util.Iterator<V> r0 = r1.delegateIterator
                    r0.remove()
                    com.google.common.collect.AbstractMapBasedMultimap$WrappedCollection r0 = r1.this$1
                    com.google.common.collect.AbstractMapBasedMultimap r0 = r0.this$0
                    com.google.common.collect.AbstractMapBasedMultimap.access$210(r0)
                    com.google.common.collect.AbstractMapBasedMultimap$WrappedCollection r0 = r1.this$1
                    r0.removeIfEmpty()
                    return
            }

            public final void validateIterator() {
                    r2 = this;
                    com.google.common.collect.AbstractMapBasedMultimap$WrappedCollection r0 = r2.this$1
                    r0.refreshIfEmpty()
                    com.google.common.collect.AbstractMapBasedMultimap$WrappedCollection r0 = r2.this$1
                    java.util.Collection<V> r0 = r0.delegate
                    java.util.Collection<V> r1 = r2.originalDelegate
                    if (r0 != r1) goto Le
                    return
                Le:
                    java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
                    r0.<init>()
                    throw r0
            }
        }

        public WrappedCollection(@com.google.common.collect.ParametricNullness com.google.common.collect.AbstractMapBasedMultimap r1, K r2, @javax.annotation.CheckForNull java.util.Collection<V> r3, com.google.common.collect.AbstractMapBasedMultimap<K, V>.WrappedCollection r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.key = r2
                r0.delegate = r3
                r0.ancestor = r4
                if (r4 != 0) goto Lf
                r1 = 0
                goto L11
            Lf:
                java.util.Collection<V> r1 = r4.delegate
            L11:
                r0.ancestorDelegate = r1
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(@com.google.common.collect.ParametricNullness V r3) {
                r2 = this;
                r2.refreshIfEmpty()
                java.util.Collection<V> r0 = r2.delegate
                boolean r0 = r0.isEmpty()
                java.util.Collection<V> r1 = r2.delegate
                boolean r3 = r1.add(r3)
                if (r3 == 0) goto L1b
                com.google.common.collect.AbstractMapBasedMultimap r1 = r2.this$0
                com.google.common.collect.AbstractMapBasedMultimap.access$208(r1)
                if (r0 == 0) goto L1b
                r2.addToMap()
            L1b:
                return r3
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(java.util.Collection<? extends V> r4) {
                r3 = this;
                boolean r0 = r4.isEmpty()
                if (r0 == 0) goto L8
                r4 = 0
                return r4
            L8:
                int r0 = r3.size()
                java.util.Collection<V> r1 = r3.delegate
                boolean r4 = r1.addAll(r4)
                if (r4 == 0) goto L25
                java.util.Collection<V> r1 = r3.delegate
                int r1 = r1.size()
                com.google.common.collect.AbstractMapBasedMultimap r2 = r3.this$0
                int r1 = r1 - r0
                com.google.common.collect.AbstractMapBasedMultimap.access$212(r2, r1)
                if (r0 != 0) goto L25
                r3.addToMap()
            L25:
                return r4
        }

        public final void addToMap() {
                r3 = this;
                com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection r0 = r3.ancestor
                if (r0 == 0) goto L8
                r0.addToMap()
                goto L15
            L8:
                com.google.common.collect.AbstractMapBasedMultimap r0 = r3.this$0
                java.util.Map r0 = com.google.common.collect.AbstractMapBasedMultimap.access$000(r0)
                K r1 = r3.key
                java.util.Collection<V> r2 = r3.delegate
                r0.put(r1, r2)
            L15:
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
                r2 = this;
                int r0 = r2.size()
                if (r0 != 0) goto L7
                return
            L7:
                java.util.Collection<V> r1 = r2.delegate
                r1.clear()
                com.google.common.collect.AbstractMapBasedMultimap r1 = r2.this$0
                com.google.common.collect.AbstractMapBasedMultimap.access$220(r1, r0)
                r2.removeIfEmpty()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                r1.refreshIfEmpty()
                java.util.Collection<V> r0 = r1.delegate
                boolean r2 = r0.contains(r2)
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(java.util.Collection<?> r2) {
                r1 = this;
                r1.refreshIfEmpty()
                java.util.Collection<V> r0 = r1.delegate
                boolean r2 = r0.containsAll(r2)
                return r2
        }

        @Override // java.util.Collection
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                if (r2 != r1) goto L4
                r2 = 1
                return r2
            L4:
                r1.refreshIfEmpty()
                java.util.Collection<V> r0 = r1.delegate
                boolean r2 = r0.equals(r2)
                return r2
        }

        @Override // java.util.Collection
        public int hashCode() {
                r1 = this;
                r1.refreshIfEmpty()
                java.util.Collection<V> r0 = r1.delegate
                int r0 = r0.hashCode()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<V> iterator() {
                r1 = this;
                r1.refreshIfEmpty()
                com.google.common.collect.AbstractMapBasedMultimap$WrappedCollection$WrappedIterator r0 = new com.google.common.collect.AbstractMapBasedMultimap$WrappedCollection$WrappedIterator
                r0.<init>(r1)
                return r0
        }

        public final void refreshIfEmpty() {
                r2 = this;
                com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection r0 = r2.ancestor
                if (r0 == 0) goto L16
                r0.refreshIfEmpty()
                com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection r0 = r2.ancestor
                java.util.Collection<V> r0 = r0.delegate
                java.util.Collection<V> r1 = r2.ancestorDelegate
                if (r0 != r1) goto L10
                goto L30
            L10:
                java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
                r0.<init>()
                throw r0
            L16:
                java.util.Collection<V> r0 = r2.delegate
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L30
                com.google.common.collect.AbstractMapBasedMultimap r0 = r2.this$0
                java.util.Map r0 = com.google.common.collect.AbstractMapBasedMultimap.access$000(r0)
                K r1 = r2.key
                java.lang.Object r0 = r0.get(r1)
                java.util.Collection r0 = (java.util.Collection) r0
                if (r0 == 0) goto L30
                r2.delegate = r0
            L30:
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                r1.refreshIfEmpty()
                java.util.Collection<V> r0 = r1.delegate
                boolean r2 = r0.remove(r2)
                if (r2 == 0) goto L13
                com.google.common.collect.AbstractMapBasedMultimap r0 = r1.this$0
                com.google.common.collect.AbstractMapBasedMultimap.access$210(r0)
                r1.removeIfEmpty()
            L13:
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(java.util.Collection<?> r4) {
                r3 = this;
                boolean r0 = r4.isEmpty()
                if (r0 == 0) goto L8
                r4 = 0
                return r4
            L8:
                int r0 = r3.size()
                java.util.Collection<V> r1 = r3.delegate
                boolean r4 = r1.removeAll(r4)
                if (r4 == 0) goto L23
                java.util.Collection<V> r1 = r3.delegate
                int r1 = r1.size()
                com.google.common.collect.AbstractMapBasedMultimap r2 = r3.this$0
                int r1 = r1 - r0
                com.google.common.collect.AbstractMapBasedMultimap.access$212(r2, r1)
                r3.removeIfEmpty()
            L23:
                return r4
        }

        public final void removeIfEmpty() {
                r2 = this;
                com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection r0 = r2.ancestor
                if (r0 == 0) goto L8
                r0.removeIfEmpty()
                goto L1b
            L8:
                java.util.Collection<V> r0 = r2.delegate
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L1b
                com.google.common.collect.AbstractMapBasedMultimap r0 = r2.this$0
                java.util.Map r0 = com.google.common.collect.AbstractMapBasedMultimap.access$000(r0)
                K r1 = r2.key
                r0.remove(r1)
            L1b:
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(java.util.Collection<?> r4) {
                r3 = this;
                com.google.common.base.Preconditions.checkNotNull(r4)
                int r0 = r3.size()
                java.util.Collection<V> r1 = r3.delegate
                boolean r4 = r1.retainAll(r4)
                if (r4 == 0) goto L1e
                java.util.Collection<V> r1 = r3.delegate
                int r1 = r1.size()
                com.google.common.collect.AbstractMapBasedMultimap r2 = r3.this$0
                int r1 = r1 - r0
                com.google.common.collect.AbstractMapBasedMultimap.access$212(r2, r1)
                r3.removeIfEmpty()
            L1e:
                return r4
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
                r1 = this;
                r1.refreshIfEmpty()
                java.util.Collection<V> r0 = r1.delegate
                int r0 = r0.size()
                return r0
        }

        @Override // java.util.AbstractCollection
        public java.lang.String toString() {
                r1 = this;
                r1.refreshIfEmpty()
                java.util.Collection<V> r0 = r1.delegate
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class WrappedList extends com.google.common.collect.AbstractMapBasedMultimap<K, V>.WrappedCollection implements java.util.List<V> {
        public final /* synthetic */ com.google.common.collect.AbstractMapBasedMultimap this$0;

        /* JADX INFO: loaded from: classes.dex */
        public class WrappedListIterator extends com.google.common.collect.AbstractMapBasedMultimap<K, V>.WrappedCollection.WrappedIterator implements java.util.ListIterator<V> {
            public final /* synthetic */ com.google.common.collect.AbstractMapBasedMultimap.WrappedList this$1;

            public WrappedListIterator(com.google.common.collect.AbstractMapBasedMultimap.WrappedList r1) {
                    r0 = this;
                    r0.this$1 = r1
                    r0.<init>(r1)
                    return
            }

            public WrappedListIterator(com.google.common.collect.AbstractMapBasedMultimap.WrappedList r2, int r3) {
                    r1 = this;
                    r1.this$1 = r2
                    java.util.Collection<V> r0 = r2.delegate
                    java.util.List r0 = (java.util.List) r0
                    java.util.ListIterator r3 = r0.listIterator(r3)
                    r1.<init>(r2, r3)
                    return
            }

            private java.util.ListIterator<V> getDelegateListIterator() {
                    r1 = this;
                    r1.validateIterator()
                    java.util.Iterator<V> r0 = r1.delegateIterator
                    java.util.ListIterator r0 = (java.util.ListIterator) r0
                    return r0
            }

            @Override // java.util.ListIterator
            public void add(@com.google.common.collect.ParametricNullness V r3) {
                    r2 = this;
                    com.google.common.collect.AbstractMapBasedMultimap$WrappedList r0 = r2.this$1
                    boolean r0 = r0.isEmpty()
                    java.util.ListIterator r1 = r2.getDelegateListIterator()
                    r1.add(r3)
                    com.google.common.collect.AbstractMapBasedMultimap$WrappedList r3 = r2.this$1
                    com.google.common.collect.AbstractMapBasedMultimap r3 = r3.this$0
                    com.google.common.collect.AbstractMapBasedMultimap.access$208(r3)
                    if (r0 == 0) goto L1b
                    com.google.common.collect.AbstractMapBasedMultimap$WrappedList r3 = r2.this$1
                    r3.addToMap()
                L1b:
                    return
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                    r1 = this;
                    java.util.ListIterator r0 = r1.getDelegateListIterator()
                    boolean r0 = r0.hasPrevious()
                    return r0
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                    r1 = this;
                    java.util.ListIterator r0 = r1.getDelegateListIterator()
                    int r0 = r0.nextIndex()
                    return r0
            }

            @Override // java.util.ListIterator
            @com.google.common.collect.ParametricNullness
            public V previous() {
                    r1 = this;
                    java.util.ListIterator r0 = r1.getDelegateListIterator()
                    java.lang.Object r0 = r0.previous()
                    return r0
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                    r1 = this;
                    java.util.ListIterator r0 = r1.getDelegateListIterator()
                    int r0 = r0.previousIndex()
                    return r0
            }

            @Override // java.util.ListIterator
            public void set(@com.google.common.collect.ParametricNullness V r2) {
                    r1 = this;
                    java.util.ListIterator r0 = r1.getDelegateListIterator()
                    r0.set(r2)
                    return
            }
        }

        public WrappedList(@com.google.common.collect.ParametricNullness com.google.common.collect.AbstractMapBasedMultimap r1, K r2, @javax.annotation.CheckForNull java.util.List<V> r3, com.google.common.collect.AbstractMapBasedMultimap<K, V>.WrappedCollection r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // java.util.List
        public void add(int r3, @com.google.common.collect.ParametricNullness V r4) {
                r2 = this;
                r2.refreshIfEmpty()
                java.util.Collection<V> r0 = r2.delegate
                boolean r0 = r0.isEmpty()
                java.util.Collection<V> r1 = r2.delegate
                java.util.List r1 = (java.util.List) r1
                r1.add(r3, r4)
                com.google.common.collect.AbstractMapBasedMultimap r3 = r2.this$0
                com.google.common.collect.AbstractMapBasedMultimap.access$208(r3)
                if (r0 == 0) goto L1a
                r2.addToMap()
            L1a:
                return
        }

        @Override // java.util.List
        public boolean addAll(int r3, java.util.Collection<? extends V> r4) {
                r2 = this;
                boolean r0 = r4.isEmpty()
                if (r0 == 0) goto L8
                r3 = 0
                return r3
            L8:
                int r0 = r2.size()
                java.util.Collection<V> r1 = r2.delegate
                java.util.List r1 = (java.util.List) r1
                boolean r3 = r1.addAll(r3, r4)
                if (r3 == 0) goto L27
                java.util.Collection<V> r4 = r2.delegate
                int r4 = r4.size()
                com.google.common.collect.AbstractMapBasedMultimap r1 = r2.this$0
                int r4 = r4 - r0
                com.google.common.collect.AbstractMapBasedMultimap.access$212(r1, r4)
                if (r0 != 0) goto L27
                r2.addToMap()
            L27:
                return r3
        }

        @Override // java.util.List
        @com.google.common.collect.ParametricNullness
        public V get(int r2) {
                r1 = this;
                r1.refreshIfEmpty()
                java.util.Collection<V> r0 = r1.delegate
                java.util.List r0 = (java.util.List) r0
                java.lang.Object r2 = r0.get(r2)
                return r2
        }

        @Override // java.util.List
        public int indexOf(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                r1.refreshIfEmpty()
                java.util.Collection<V> r0 = r1.delegate
                java.util.List r0 = (java.util.List) r0
                int r2 = r0.indexOf(r2)
                return r2
        }

        @Override // java.util.List
        public int lastIndexOf(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                r1.refreshIfEmpty()
                java.util.Collection<V> r0 = r1.delegate
                java.util.List r0 = (java.util.List) r0
                int r2 = r0.lastIndexOf(r2)
                return r2
        }

        @Override // java.util.List
        public java.util.ListIterator<V> listIterator() {
                r1 = this;
                r1.refreshIfEmpty()
                com.google.common.collect.AbstractMapBasedMultimap$WrappedList$WrappedListIterator r0 = new com.google.common.collect.AbstractMapBasedMultimap$WrappedList$WrappedListIterator
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.List
        public java.util.ListIterator<V> listIterator(int r2) {
                r1 = this;
                r1.refreshIfEmpty()
                com.google.common.collect.AbstractMapBasedMultimap$WrappedList$WrappedListIterator r0 = new com.google.common.collect.AbstractMapBasedMultimap$WrappedList$WrappedListIterator
                r0.<init>(r1, r2)
                return r0
        }

        @Override // java.util.List
        @com.google.common.collect.ParametricNullness
        public V remove(int r2) {
                r1 = this;
                r1.refreshIfEmpty()
                java.util.Collection<V> r0 = r1.delegate
                java.util.List r0 = (java.util.List) r0
                java.lang.Object r2 = r0.remove(r2)
                com.google.common.collect.AbstractMapBasedMultimap r0 = r1.this$0
                com.google.common.collect.AbstractMapBasedMultimap.access$210(r0)
                r1.removeIfEmpty()
                return r2
        }

        @Override // java.util.List
        @com.google.common.collect.ParametricNullness
        public V set(int r2, @com.google.common.collect.ParametricNullness V r3) {
                r1 = this;
                r1.refreshIfEmpty()
                java.util.Collection<V> r0 = r1.delegate
                java.util.List r0 = (java.util.List) r0
                java.lang.Object r2 = r0.set(r2, r3)
                return r2
        }

        @Override // java.util.List
        public java.util.List<V> subList(int r4, int r5) {
                r3 = this;
                r3.refreshIfEmpty()
                com.google.common.collect.AbstractMapBasedMultimap r0 = r3.this$0
                K r1 = r3.key
                java.util.Collection<V> r2 = r3.delegate
                java.util.List r2 = (java.util.List) r2
                java.util.List r4 = r2.subList(r4, r5)
                com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection r5 = r3.ancestor
                if (r5 != 0) goto L14
                r5 = r3
            L14:
                java.util.List r4 = r0.wrapList(r1, r4, r5)
                return r4
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class WrappedNavigableSet extends com.google.common.collect.AbstractMapBasedMultimap<K, V>.WrappedSortedSet implements java.util.NavigableSet<V> {
        public final /* synthetic */ com.google.common.collect.AbstractMapBasedMultimap this$0;

        public WrappedNavigableSet(@com.google.common.collect.ParametricNullness com.google.common.collect.AbstractMapBasedMultimap r1, K r2, @javax.annotation.CheckForNull java.util.NavigableSet<V> r3, com.google.common.collect.AbstractMapBasedMultimap<K, V>.WrappedCollection r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1, r2, r3, r4)
                return
        }

        private java.util.NavigableSet<V> wrap(java.util.NavigableSet<V> r5) {
                r4 = this;
                com.google.common.collect.AbstractMapBasedMultimap$WrappedNavigableSet r0 = new com.google.common.collect.AbstractMapBasedMultimap$WrappedNavigableSet
                com.google.common.collect.AbstractMapBasedMultimap r1 = r4.this$0
                K r2 = r4.key
                com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection r3 = r4.ancestor
                if (r3 != 0) goto Lb
                r3 = r4
            Lb:
                r0.<init>(r1, r2, r5, r3)
                return r0
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public V ceiling(@com.google.common.collect.ParametricNullness V r2) {
                r1 = this;
                java.util.NavigableSet r0 = r1.getSortedSetDelegate()
                java.lang.Object r2 = r0.ceiling(r2)
                return r2
        }

        @Override // java.util.NavigableSet
        public java.util.Iterator<V> descendingIterator() {
                r2 = this;
                com.google.common.collect.AbstractMapBasedMultimap$WrappedCollection$WrappedIterator r0 = new com.google.common.collect.AbstractMapBasedMultimap$WrappedCollection$WrappedIterator
                java.util.NavigableSet r1 = r2.getSortedSetDelegate()
                java.util.Iterator r1 = r1.descendingIterator()
                r0.<init>(r2, r1)
                return r0
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<V> descendingSet() {
                r1 = this;
                java.util.NavigableSet r0 = r1.getSortedSetDelegate()
                java.util.NavigableSet r0 = r0.descendingSet()
                java.util.NavigableSet r0 = r1.wrap(r0)
                return r0
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public V floor(@com.google.common.collect.ParametricNullness V r2) {
                r1 = this;
                java.util.NavigableSet r0 = r1.getSortedSetDelegate()
                java.lang.Object r2 = r0.floor(r2)
                return r2
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.WrappedSortedSet
        public final java.util.NavigableSet<V> getSortedSetDelegate() {
                r1 = this;
                java.util.Collection<V> r0 = r1.delegate
                java.util.SortedSet r0 = (java.util.SortedSet) r0
                java.util.NavigableSet r0 = (java.util.NavigableSet) r0
                return r0
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.WrappedSortedSet
        public final /* bridge */ /* synthetic */ java.util.SortedSet getSortedSetDelegate() {
                r1 = this;
                java.util.NavigableSet r0 = r1.getSortedSetDelegate()
                return r0
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<V> headSet(@com.google.common.collect.ParametricNullness V r2, boolean r3) {
                r1 = this;
                java.util.NavigableSet r0 = r1.getSortedSetDelegate()
                java.util.NavigableSet r2 = r0.headSet(r2, r3)
                java.util.NavigableSet r2 = r1.wrap(r2)
                return r2
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public V higher(@com.google.common.collect.ParametricNullness V r2) {
                r1 = this;
                java.util.NavigableSet r0 = r1.getSortedSetDelegate()
                java.lang.Object r2 = r0.higher(r2)
                return r2
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public V lower(@com.google.common.collect.ParametricNullness V r2) {
                r1 = this;
                java.util.NavigableSet r0 = r1.getSortedSetDelegate()
                java.lang.Object r2 = r0.lower(r2)
                return r2
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public V pollFirst() {
                r1 = this;
                java.util.Iterator r0 = r1.iterator()
                java.lang.Object r0 = com.google.common.collect.Iterators.pollNext(r0)
                return r0
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public V pollLast() {
                r1 = this;
                java.util.Iterator r0 = r1.descendingIterator()
                java.lang.Object r0 = com.google.common.collect.Iterators.pollNext(r0)
                return r0
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<V> subSet(@com.google.common.collect.ParametricNullness V r2, boolean r3, @com.google.common.collect.ParametricNullness V r4, boolean r5) {
                r1 = this;
                java.util.NavigableSet r0 = r1.getSortedSetDelegate()
                java.util.NavigableSet r2 = r0.subSet(r2, r3, r4, r5)
                java.util.NavigableSet r2 = r1.wrap(r2)
                return r2
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<V> tailSet(@com.google.common.collect.ParametricNullness V r2, boolean r3) {
                r1 = this;
                java.util.NavigableSet r0 = r1.getSortedSetDelegate()
                java.util.NavigableSet r2 = r0.tailSet(r2, r3)
                java.util.NavigableSet r2 = r1.wrap(r2)
                return r2
        }
    }

    public class WrappedSet extends com.google.common.collect.AbstractMapBasedMultimap<K, V>.WrappedCollection implements java.util.Set<V> {
        public final /* synthetic */ com.google.common.collect.AbstractMapBasedMultimap this$0;

        public WrappedSet(@com.google.common.collect.ParametricNullness com.google.common.collect.AbstractMapBasedMultimap r2, K r3, java.util.Set<V> r4) {
                r1 = this;
                r1.this$0 = r2
                r0 = 0
                r1.<init>(r2, r3, r4, r0)
                return
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.WrappedCollection, java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(java.util.Collection<?> r4) {
                r3 = this;
                boolean r0 = r4.isEmpty()
                if (r0 == 0) goto L8
                r4 = 0
                return r4
            L8:
                int r0 = r3.size()
                java.util.Collection<V> r1 = r3.delegate
                java.util.Set r1 = (java.util.Set) r1
                boolean r4 = com.google.common.collect.Sets.removeAllImpl(r1, r4)
                if (r4 == 0) goto L25
                java.util.Collection<V> r1 = r3.delegate
                int r1 = r1.size()
                com.google.common.collect.AbstractMapBasedMultimap r2 = r3.this$0
                int r1 = r1 - r0
                com.google.common.collect.AbstractMapBasedMultimap.access$212(r2, r1)
                r3.removeIfEmpty()
            L25:
                return r4
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class WrappedSortedSet extends com.google.common.collect.AbstractMapBasedMultimap<K, V>.WrappedCollection implements java.util.SortedSet<V> {
        public final /* synthetic */ com.google.common.collect.AbstractMapBasedMultimap this$0;

        public WrappedSortedSet(@com.google.common.collect.ParametricNullness com.google.common.collect.AbstractMapBasedMultimap r1, K r2, @javax.annotation.CheckForNull java.util.SortedSet<V> r3, com.google.common.collect.AbstractMapBasedMultimap<K, V>.WrappedCollection r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // java.util.SortedSet
        @javax.annotation.CheckForNull
        public java.util.Comparator<? super V> comparator() {
                r1 = this;
                java.util.SortedSet r0 = r1.getSortedSetDelegate()
                java.util.Comparator r0 = r0.comparator()
                return r0
        }

        @Override // java.util.SortedSet
        @com.google.common.collect.ParametricNullness
        public V first() {
                r1 = this;
                r1.refreshIfEmpty()
                java.util.SortedSet r0 = r1.getSortedSetDelegate()
                java.lang.Object r0 = r0.first()
                return r0
        }

        public java.util.SortedSet<V> getSortedSetDelegate() {
                r1 = this;
                java.util.Collection<V> r0 = r1.delegate
                java.util.SortedSet r0 = (java.util.SortedSet) r0
                return r0
        }

        @Override // java.util.SortedSet
        public java.util.SortedSet<V> headSet(@com.google.common.collect.ParametricNullness V r5) {
                r4 = this;
                r4.refreshIfEmpty()
                com.google.common.collect.AbstractMapBasedMultimap$WrappedSortedSet r0 = new com.google.common.collect.AbstractMapBasedMultimap$WrappedSortedSet
                com.google.common.collect.AbstractMapBasedMultimap r1 = r4.this$0
                K r2 = r4.key
                java.util.SortedSet r3 = r4.getSortedSetDelegate()
                java.util.SortedSet r5 = r3.headSet(r5)
                com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection r3 = r4.ancestor
                if (r3 != 0) goto L16
                r3 = r4
            L16:
                r0.<init>(r1, r2, r5, r3)
                return r0
        }

        @Override // java.util.SortedSet
        @com.google.common.collect.ParametricNullness
        public V last() {
                r1 = this;
                r1.refreshIfEmpty()
                java.util.SortedSet r0 = r1.getSortedSetDelegate()
                java.lang.Object r0 = r0.last()
                return r0
        }

        @Override // java.util.SortedSet
        public java.util.SortedSet<V> subSet(@com.google.common.collect.ParametricNullness V r5, @com.google.common.collect.ParametricNullness V r6) {
                r4 = this;
                r4.refreshIfEmpty()
                com.google.common.collect.AbstractMapBasedMultimap$WrappedSortedSet r0 = new com.google.common.collect.AbstractMapBasedMultimap$WrappedSortedSet
                com.google.common.collect.AbstractMapBasedMultimap r1 = r4.this$0
                K r2 = r4.key
                java.util.SortedSet r3 = r4.getSortedSetDelegate()
                java.util.SortedSet r5 = r3.subSet(r5, r6)
                com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection r6 = r4.ancestor
                if (r6 != 0) goto L16
                r6 = r4
            L16:
                r0.<init>(r1, r2, r5, r6)
                return r0
        }

        @Override // java.util.SortedSet
        public java.util.SortedSet<V> tailSet(@com.google.common.collect.ParametricNullness V r5) {
                r4 = this;
                r4.refreshIfEmpty()
                com.google.common.collect.AbstractMapBasedMultimap$WrappedSortedSet r0 = new com.google.common.collect.AbstractMapBasedMultimap$WrappedSortedSet
                com.google.common.collect.AbstractMapBasedMultimap r1 = r4.this$0
                K r2 = r4.key
                java.util.SortedSet r3 = r4.getSortedSetDelegate()
                java.util.SortedSet r5 = r3.tailSet(r5)
                com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection r3 = r4.ancestor
                if (r3 != 0) goto L16
                r3 = r4
            L16:
                r0.<init>(r1, r2, r5, r3)
                return r0
        }
    }

    public AbstractMapBasedMultimap(java.util.Map<K, java.util.Collection<V>> r2) {
            r1 = this;
            r1.<init>()
            boolean r0 = r2.isEmpty()
            com.google.common.base.Preconditions.checkArgument(r0)
            r1.map = r2
            return
    }

    public static /* synthetic */ java.util.Map access$000(com.google.common.collect.AbstractMapBasedMultimap r0) {
            java.util.Map<K, java.util.Collection<V>> r0 = r0.map
            return r0
    }

    public static /* synthetic */ java.util.Iterator access$100(java.util.Collection r0) {
            java.util.Iterator r0 = iteratorOrListIterator(r0)
            return r0
    }

    public static /* synthetic */ int access$208(com.google.common.collect.AbstractMapBasedMultimap r2) {
            int r0 = r2.totalSize
            int r1 = r0 + 1
            r2.totalSize = r1
            return r0
    }

    public static /* synthetic */ int access$210(com.google.common.collect.AbstractMapBasedMultimap r2) {
            int r0 = r2.totalSize
            int r1 = r0 + (-1)
            r2.totalSize = r1
            return r0
    }

    public static /* synthetic */ int access$212(com.google.common.collect.AbstractMapBasedMultimap r1, int r2) {
            int r0 = r1.totalSize
            int r0 = r0 + r2
            r1.totalSize = r0
            return r0
    }

    public static /* synthetic */ int access$220(com.google.common.collect.AbstractMapBasedMultimap r1, int r2) {
            int r0 = r1.totalSize
            int r0 = r0 - r2
            r1.totalSize = r0
            return r0
    }

    public static /* synthetic */ void access$300(com.google.common.collect.AbstractMapBasedMultimap r0, java.lang.Object r1) {
            r0.removeValuesForKey(r1)
            return
    }

    private java.util.Collection<V> getOrCreateCollection(@com.google.common.collect.ParametricNullness K r3) {
            r2 = this;
            java.util.Map<K, java.util.Collection<V>> r0 = r2.map
            java.lang.Object r0 = r0.get(r3)
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 != 0) goto L13
            java.util.Collection r0 = r2.createCollection(r3)
            java.util.Map<K, java.util.Collection<V>> r1 = r2.map
            r1.put(r3, r0)
        L13:
            return r0
    }

    private static <E> java.util.Iterator<E> iteratorOrListIterator(java.util.Collection<E> r1) {
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto Lb
            java.util.List r1 = (java.util.List) r1
            java.util.ListIterator r1 = r1.listIterator()
            goto Lf
        Lb:
            java.util.Iterator r1 = r1.iterator()
        Lf:
            return r1
    }

    private void removeValuesForKey(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            java.util.Map<K, java.util.Collection<V>> r0 = r1.map
            java.lang.Object r2 = com.google.common.collect.Maps.safeRemove(r0, r2)
            java.util.Collection r2 = (java.util.Collection) r2
            if (r2 == 0) goto L16
            int r0 = r2.size()
            r2.clear()
            int r2 = r1.totalSize
            int r2 = r2 - r0
            r1.totalSize = r2
        L16:
            return
    }

    public final java.util.Map<K, java.util.Collection<V>> backingMap() {
            r1 = this;
            java.util.Map<K, java.util.Collection<V>> r0 = r1.map
            return r0
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
            r2 = this;
            java.util.Map<K, java.util.Collection<V>> r0 = r2.map
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            java.util.Collection r1 = (java.util.Collection) r1
            r1.clear()
            goto La
        L1a:
            java.util.Map<K, java.util.Collection<V>> r0 = r2.map
            r0.clear()
            r0 = 0
            r2.totalSize = r0
            return
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            java.util.Map<K, java.util.Collection<V>> r0 = r1.map
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // com.google.common.collect.AbstractMultimap
    public java.util.Map<K, java.util.Collection<V>> createAsMap() {
            r2 = this;
            com.google.common.collect.AbstractMapBasedMultimap$AsMap r0 = new com.google.common.collect.AbstractMapBasedMultimap$AsMap
            java.util.Map<K, java.util.Collection<V>> r1 = r2.map
            r0.<init>(r2, r1)
            return r0
    }

    public abstract java.util.Collection<V> createCollection();

    public java.util.Collection<V> createCollection(@com.google.common.collect.ParametricNullness K r1) {
            r0 = this;
            java.util.Collection r1 = r0.createCollection()
            return r1
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final java.util.Collection<java.util.Map.Entry<K, V>> createEntries() {
            r1 = this;
            boolean r0 = r1 instanceof com.google.common.collect.SetMultimap
            if (r0 == 0) goto La
            com.google.common.collect.AbstractMultimap$EntrySet r0 = new com.google.common.collect.AbstractMultimap$EntrySet
            r0.<init>(r1)
            return r0
        La:
            com.google.common.collect.AbstractMultimap$Entries r0 = new com.google.common.collect.AbstractMultimap$Entries
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap
    public java.util.Set<K> createKeySet() {
            r2 = this;
            com.google.common.collect.AbstractMapBasedMultimap$KeySet r0 = new com.google.common.collect.AbstractMapBasedMultimap$KeySet
            java.util.Map<K, java.util.Collection<V>> r1 = r2.map
            r0.<init>(r2, r1)
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final com.google.common.collect.Multiset<K> createKeys() {
            r1 = this;
            com.google.common.collect.Multimaps$Keys r0 = new com.google.common.collect.Multimaps$Keys
            r0.<init>(r1)
            return r0
    }

    public final java.util.Map<K, java.util.Collection<V>> createMaybeNavigableAsMap() {
            r2 = this;
            java.util.Map<K, java.util.Collection<V>> r0 = r2.map
            boolean r1 = r0 instanceof java.util.NavigableMap
            if (r1 == 0) goto L10
            com.google.common.collect.AbstractMapBasedMultimap$NavigableAsMap r0 = new com.google.common.collect.AbstractMapBasedMultimap$NavigableAsMap
            java.util.Map<K, java.util.Collection<V>> r1 = r2.map
            java.util.NavigableMap r1 = (java.util.NavigableMap) r1
            r0.<init>(r2, r1)
            return r0
        L10:
            boolean r0 = r0 instanceof java.util.SortedMap
            if (r0 == 0) goto L1e
            com.google.common.collect.AbstractMapBasedMultimap$SortedAsMap r0 = new com.google.common.collect.AbstractMapBasedMultimap$SortedAsMap
            java.util.Map<K, java.util.Collection<V>> r1 = r2.map
            java.util.SortedMap r1 = (java.util.SortedMap) r1
            r0.<init>(r2, r1)
            return r0
        L1e:
            com.google.common.collect.AbstractMapBasedMultimap$AsMap r0 = new com.google.common.collect.AbstractMapBasedMultimap$AsMap
            java.util.Map<K, java.util.Collection<V>> r1 = r2.map
            r0.<init>(r2, r1)
            return r0
    }

    public final java.util.Set<K> createMaybeNavigableKeySet() {
            r2 = this;
            java.util.Map<K, java.util.Collection<V>> r0 = r2.map
            boolean r1 = r0 instanceof java.util.NavigableMap
            if (r1 == 0) goto L10
            com.google.common.collect.AbstractMapBasedMultimap$NavigableKeySet r0 = new com.google.common.collect.AbstractMapBasedMultimap$NavigableKeySet
            java.util.Map<K, java.util.Collection<V>> r1 = r2.map
            java.util.NavigableMap r1 = (java.util.NavigableMap) r1
            r0.<init>(r2, r1)
            return r0
        L10:
            boolean r0 = r0 instanceof java.util.SortedMap
            if (r0 == 0) goto L1e
            com.google.common.collect.AbstractMapBasedMultimap$SortedKeySet r0 = new com.google.common.collect.AbstractMapBasedMultimap$SortedKeySet
            java.util.Map<K, java.util.Collection<V>> r1 = r2.map
            java.util.SortedMap r1 = (java.util.SortedMap) r1
            r0.<init>(r2, r1)
            return r0
        L1e:
            com.google.common.collect.AbstractMapBasedMultimap$KeySet r0 = new com.google.common.collect.AbstractMapBasedMultimap$KeySet
            java.util.Map<K, java.util.Collection<V>> r1 = r2.map
            r0.<init>(r2, r1)
            return r0
    }

    public java.util.Collection<V> createUnmodifiableEmptyCollection() {
            r1 = this;
            java.util.Collection r0 = r1.createCollection()
            java.util.Collection r0 = r1.unmodifiableCollectionSubclass(r0)
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final java.util.Collection<V> createValues() {
            r1 = this;
            com.google.common.collect.AbstractMultimap$Values r0 = new com.google.common.collect.AbstractMultimap$Values
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public java.util.Collection<java.util.Map.Entry<K, V>> entries() {
            r1 = this;
            java.util.Collection r0 = super.entries()
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap
    public java.util.Iterator<java.util.Map.Entry<K, V>> entryIterator() {
            r1 = this;
            com.google.common.collect.AbstractMapBasedMultimap$2 r0 = new com.google.common.collect.AbstractMapBasedMultimap$2
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.Collection<V> get(@com.google.common.collect.ParametricNullness K r2) {
            r1 = this;
            java.util.Map<K, java.util.Collection<V>> r0 = r1.map
            java.lang.Object r0 = r0.get(r2)
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 != 0) goto Le
            java.util.Collection r0 = r1.createCollection(r2)
        Le:
            java.util.Collection r2 = r1.wrapCollection(r2, r0)
            return r2
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public boolean put(@com.google.common.collect.ParametricNullness K r3, @com.google.common.collect.ParametricNullness V r4) {
            r2 = this;
            java.util.Map<K, java.util.Collection<V>> r0 = r2.map
            java.lang.Object r0 = r0.get(r3)
            java.util.Collection r0 = (java.util.Collection) r0
            r1 = 1
            if (r0 != 0) goto L28
            java.util.Collection r0 = r2.createCollection(r3)
            boolean r4 = r0.add(r4)
            if (r4 == 0) goto L20
            int r4 = r2.totalSize
            int r4 = r4 + r1
            r2.totalSize = r4
            java.util.Map<K, java.util.Collection<V>> r4 = r2.map
            r4.put(r3, r0)
            return r1
        L20:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.String r4 = "New Collection violated the Collection spec"
            r3.<init>(r4)
            throw r3
        L28:
            boolean r3 = r0.add(r4)
            if (r3 == 0) goto L34
            int r3 = r2.totalSize
            int r3 = r3 + r1
            r2.totalSize = r3
            return r1
        L34:
            r3 = 0
            return r3
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.Collection<V> removeAll(@javax.annotation.CheckForNull java.lang.Object r4) {
            r3 = this;
            java.util.Map<K, java.util.Collection<V>> r0 = r3.map
            java.lang.Object r4 = r0.remove(r4)
            java.util.Collection r4 = (java.util.Collection) r4
            if (r4 != 0) goto Lf
            java.util.Collection r4 = r3.createUnmodifiableEmptyCollection()
            return r4
        Lf:
            java.util.Collection r0 = r3.createCollection()
            r0.addAll(r4)
            int r1 = r3.totalSize
            int r2 = r4.size()
            int r1 = r1 - r2
            r3.totalSize = r1
            r4.clear()
            java.util.Collection r4 = r3.unmodifiableCollectionSubclass(r0)
            return r4
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.Collection<V> replaceValues(@com.google.common.collect.ParametricNullness K r4, java.lang.Iterable<? extends V> r5) {
            r3 = this;
            java.util.Iterator r5 = r5.iterator()
            boolean r0 = r5.hasNext()
            if (r0 != 0) goto Lf
            java.util.Collection r4 = r3.removeAll(r4)
            return r4
        Lf:
            java.util.Collection r4 = r3.getOrCreateCollection(r4)
            java.util.Collection r0 = r3.createCollection()
            r0.addAll(r4)
            int r1 = r3.totalSize
            int r2 = r4.size()
            int r1 = r1 - r2
            r3.totalSize = r1
            r4.clear()
        L26:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r5.next()
            boolean r1 = r4.add(r1)
            if (r1 == 0) goto L26
            int r1 = r3.totalSize
            int r1 = r1 + 1
            r3.totalSize = r1
            goto L26
        L3d:
            java.util.Collection r4 = r3.unmodifiableCollectionSubclass(r0)
            return r4
    }

    public final void setMap(java.util.Map<K, java.util.Collection<V>> r3) {
            r2 = this;
            r2.map = r3
            r0 = 0
            r2.totalSize = r0
            java.util.Collection r3 = r3.values()
            java.util.Iterator r3 = r3.iterator()
        Ld:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r3.next()
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r1 = r0.isEmpty()
            r1 = r1 ^ 1
            com.google.common.base.Preconditions.checkArgument(r1)
            int r1 = r2.totalSize
            int r0 = r0.size()
            int r0 = r0 + r1
            r2.totalSize = r0
            goto Ld
        L2c:
            return
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
            r1 = this;
            int r0 = r1.totalSize
            return r0
    }

    public <E> java.util.Collection<E> unmodifiableCollectionSubclass(java.util.Collection<E> r1) {
            r0 = this;
            java.util.Collection r1 = java.util.Collections.unmodifiableCollection(r1)
            return r1
    }

    @Override // com.google.common.collect.AbstractMultimap
    public java.util.Iterator<V> valueIterator() {
            r1 = this;
            com.google.common.collect.AbstractMapBasedMultimap$1 r0 = new com.google.common.collect.AbstractMapBasedMultimap$1
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public java.util.Collection<V> values() {
            r1 = this;
            java.util.Collection r0 = super.values()
            return r0
    }

    public java.util.Collection<V> wrapCollection(@com.google.common.collect.ParametricNullness K r3, java.util.Collection<V> r4) {
            r2 = this;
            com.google.common.collect.AbstractMapBasedMultimap$WrappedCollection r0 = new com.google.common.collect.AbstractMapBasedMultimap$WrappedCollection
            r1 = 0
            r0.<init>(r2, r3, r4, r1)
            return r0
    }

    public final java.util.List<V> wrapList(@com.google.common.collect.ParametricNullness K r2, java.util.List<V> r3, @javax.annotation.CheckForNull com.google.common.collect.AbstractMapBasedMultimap<K, V>.WrappedCollection r4) {
            r1 = this;
            boolean r0 = r3 instanceof java.util.RandomAccess
            if (r0 == 0) goto La
            com.google.common.collect.AbstractMapBasedMultimap$RandomAccessWrappedList r0 = new com.google.common.collect.AbstractMapBasedMultimap$RandomAccessWrappedList
            r0.<init>(r1, r2, r3, r4)
            goto Lf
        La:
            com.google.common.collect.AbstractMapBasedMultimap$WrappedList r0 = new com.google.common.collect.AbstractMapBasedMultimap$WrappedList
            r0.<init>(r1, r2, r3, r4)
        Lf:
            return r0
    }
}
