package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible(emulated = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class Multimaps {

    /* JADX INFO: loaded from: classes.dex */
    public static final class AsMap<K, V> extends com.google.common.collect.Maps.ViewCachingAbstractMap<K, java.util.Collection<V>> {

        @com.google.j2objc.annotations.Weak
        private final com.google.common.collect.Multimap<K, V> multimap;

        /* JADX INFO: loaded from: classes2.dex */
        public class EntrySet extends com.google.common.collect.Maps.EntrySet<K, java.util.Collection<V>> {
            public final /* synthetic */ com.google.common.collect.Multimaps.AsMap this$0;


            public EntrySet(com.google.common.collect.Multimaps.AsMap r1) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    return
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public java.util.Iterator<java.util.Map.Entry<K, java.util.Collection<V>>> iterator() {
                    r2 = this;
                    com.google.common.collect.Multimaps$AsMap r0 = r2.this$0
                    com.google.common.collect.Multimap r0 = com.google.common.collect.Multimaps.AsMap.access$200(r0)
                    java.util.Set r0 = r0.keySet()
                    com.google.common.collect.Multimaps$AsMap$EntrySet$1 r1 = new com.google.common.collect.Multimaps$AsMap$EntrySet$1
                    r1.<init>(r2)
                    java.util.Iterator r0 = com.google.common.collect.Maps.asMapEntryIterator(r0, r1)
                    return r0
            }

            @Override // com.google.common.collect.Maps.EntrySet
            public final java.util.Map<K, java.util.Collection<V>> map() {
                    r1 = this;
                    com.google.common.collect.Multimaps$AsMap r0 = r1.this$0
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
                    com.google.common.collect.Multimaps$AsMap r0 = r1.this$0
                    java.lang.Object r2 = r2.getKey()
                    r0.removeValuesForKey(r2)
                    r2 = 1
                    return r2
            }
        }

        public AsMap(com.google.common.collect.Multimap<K, V> r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.collect.Multimap r1 = (com.google.common.collect.Multimap) r1
                r0.multimap = r1
                return
        }

        public static /* synthetic */ com.google.common.collect.Multimap access$200(com.google.common.collect.Multimaps.AsMap r0) {
                com.google.common.collect.Multimap<K, V> r0 = r0.multimap
                return r0
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
                r1 = this;
                com.google.common.collect.Multimap<K, V> r0 = r1.multimap
                r0.clear()
                return
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.Multimap<K, V> r0 = r1.multimap
                boolean r2 = r0.containsKey(r2)
                return r2
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final java.util.Set<java.util.Map.Entry<K, java.util.Collection<V>>> createEntrySet() {
                r1 = this;
                com.google.common.collect.Multimaps$AsMap$EntrySet r0 = new com.google.common.collect.Multimaps$AsMap$EntrySet
                r0.<init>(r1)
                return r0
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
        public java.util.Collection<V> get(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                boolean r0 = r1.containsKey(r2)
                if (r0 == 0) goto Ld
                com.google.common.collect.Multimap<K, V> r0 = r1.multimap
                java.util.Collection r2 = r0.get(r2)
                goto Le
            Ld:
                r2 = 0
            Le:
                return r2
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
                r1 = this;
                com.google.common.collect.Multimap<K, V> r0 = r1.multimap
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public java.util.Set<K> keySet() {
                r1 = this;
                com.google.common.collect.Multimap<K, V> r0 = r1.multimap
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
        public java.util.Collection<V> remove(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                boolean r0 = r1.containsKey(r2)
                if (r0 == 0) goto Ld
                com.google.common.collect.Multimap<K, V> r0 = r1.multimap
                java.util.Collection r2 = r0.removeAll(r2)
                goto Le
            Ld:
                r2 = 0
            Le:
                return r2
        }

        public final void removeValuesForKey(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.Multimap<K, V> r0 = r1.multimap
                java.util.Set r0 = r0.keySet()
                r0.remove(r2)
                return
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
                r1 = this;
                com.google.common.collect.Multimap<K, V> r0 = r1.multimap
                java.util.Set r0 = r0.keySet()
                int r0 = r0.size()
                return r0
        }
    }

    public static class CustomListMultimap<K, V> extends com.google.common.collect.AbstractListMultimap<K, V> {

        @com.google.common.annotations.GwtIncompatible
        private static final long serialVersionUID = 0;
        public transient com.google.common.base.Supplier<? extends java.util.List<V>> factory;

        public CustomListMultimap(java.util.Map<K, java.util.Collection<V>> r1, com.google.common.base.Supplier<? extends java.util.List<V>> r2) {
                r0 = this;
                r0.<init>(r1)
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                com.google.common.base.Supplier r1 = (com.google.common.base.Supplier) r1
                r0.factory = r1
                return
        }

        @com.google.common.annotations.GwtIncompatible
        private void readObject(java.io.ObjectInputStream r2) throws java.io.IOException, java.lang.ClassNotFoundException {
                r1 = this;
                r2.defaultReadObject()
                java.lang.Object r0 = r2.readObject()
                com.google.common.base.Supplier r0 = (com.google.common.base.Supplier) r0
                r1.factory = r0
                java.lang.Object r2 = r2.readObject()
                java.util.Map r2 = (java.util.Map) r2
                r1.setMap(r2)
                return
        }

        @com.google.common.annotations.GwtIncompatible
        private void writeObject(java.io.ObjectOutputStream r2) throws java.io.IOException {
                r1 = this;
                r2.defaultWriteObject()
                com.google.common.base.Supplier<? extends java.util.List<V>> r0 = r1.factory
                r2.writeObject(r0)
                java.util.Map r0 = r1.backingMap()
                r2.writeObject(r0)
                return
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        public final java.util.Map<K, java.util.Collection<V>> createAsMap() {
                r1 = this;
                java.util.Map r0 = r1.createMaybeNavigableAsMap()
                return r0
        }

        @Override // com.google.common.collect.AbstractListMultimap, com.google.common.collect.AbstractMapBasedMultimap
        public final java.util.Collection createCollection() {
                r1 = this;
                com.google.common.base.Supplier<? extends java.util.List<V>> r0 = r1.factory
                java.lang.Object r0 = r0.get()
                java.util.List r0 = (java.util.List) r0
                return r0
        }

        @Override // com.google.common.collect.AbstractListMultimap, com.google.common.collect.AbstractMapBasedMultimap
        public final java.util.List<V> createCollection() {
                r1 = this;
                com.google.common.base.Supplier<? extends java.util.List<V>> r0 = r1.factory
                java.lang.Object r0 = r0.get()
                java.util.List r0 = (java.util.List) r0
                return r0
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        public final java.util.Set<K> createKeySet() {
                r1 = this;
                java.util.Set r0 = r1.createMaybeNavigableKeySet()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class CustomMultimap<K, V> extends com.google.common.collect.AbstractMapBasedMultimap<K, V> {

        @com.google.common.annotations.GwtIncompatible
        private static final long serialVersionUID = 0;
        public transient com.google.common.base.Supplier<? extends java.util.Collection<V>> factory;

        public CustomMultimap(java.util.Map<K, java.util.Collection<V>> r1, com.google.common.base.Supplier<? extends java.util.Collection<V>> r2) {
                r0 = this;
                r0.<init>(r1)
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                com.google.common.base.Supplier r1 = (com.google.common.base.Supplier) r1
                r0.factory = r1
                return
        }

        @com.google.common.annotations.GwtIncompatible
        private void readObject(java.io.ObjectInputStream r2) throws java.io.IOException, java.lang.ClassNotFoundException {
                r1 = this;
                r2.defaultReadObject()
                java.lang.Object r0 = r2.readObject()
                com.google.common.base.Supplier r0 = (com.google.common.base.Supplier) r0
                r1.factory = r0
                java.lang.Object r2 = r2.readObject()
                java.util.Map r2 = (java.util.Map) r2
                r1.setMap(r2)
                return
        }

        @com.google.common.annotations.GwtIncompatible
        private void writeObject(java.io.ObjectOutputStream r2) throws java.io.IOException {
                r1 = this;
                r2.defaultWriteObject()
                com.google.common.base.Supplier<? extends java.util.Collection<V>> r0 = r1.factory
                r2.writeObject(r0)
                java.util.Map r0 = r1.backingMap()
                r2.writeObject(r0)
                return
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        public final java.util.Map<K, java.util.Collection<V>> createAsMap() {
                r1 = this;
                java.util.Map r0 = r1.createMaybeNavigableAsMap()
                return r0
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap
        public final java.util.Collection<V> createCollection() {
                r1 = this;
                com.google.common.base.Supplier<? extends java.util.Collection<V>> r0 = r1.factory
                java.lang.Object r0 = r0.get()
                java.util.Collection r0 = (java.util.Collection) r0
                return r0
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        public final java.util.Set<K> createKeySet() {
                r1 = this;
                java.util.Set r0 = r1.createMaybeNavigableKeySet()
                return r0
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap
        public final <E> java.util.Collection<E> unmodifiableCollectionSubclass(java.util.Collection<E> r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.util.NavigableSet
                if (r0 == 0) goto Lb
                java.util.NavigableSet r2 = (java.util.NavigableSet) r2
                java.util.NavigableSet r2 = com.google.common.collect.Sets.unmodifiableNavigableSet(r2)
                return r2
            Lb:
                boolean r0 = r2 instanceof java.util.SortedSet
                if (r0 == 0) goto L16
                java.util.SortedSet r2 = (java.util.SortedSet) r2
                java.util.SortedSet r2 = java.util.Collections.unmodifiableSortedSet(r2)
                return r2
            L16:
                boolean r0 = r2 instanceof java.util.Set
                if (r0 == 0) goto L21
                java.util.Set r2 = (java.util.Set) r2
                java.util.Set r2 = java.util.Collections.unmodifiableSet(r2)
                return r2
            L21:
                boolean r0 = r2 instanceof java.util.List
                if (r0 == 0) goto L2c
                java.util.List r2 = (java.util.List) r2
                java.util.List r2 = java.util.Collections.unmodifiableList(r2)
                return r2
            L2c:
                java.util.Collection r2 = java.util.Collections.unmodifiableCollection(r2)
                return r2
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap
        public final java.util.Collection<V> wrapCollection(@com.google.common.collect.ParametricNullness K r3, java.util.Collection<V> r4) {
                r2 = this;
                boolean r0 = r4 instanceof java.util.List
                r1 = 0
                if (r0 == 0) goto Lc
                java.util.List r4 = (java.util.List) r4
                java.util.List r3 = r2.wrapList(r3, r4, r1)
                return r3
            Lc:
                boolean r0 = r4 instanceof java.util.NavigableSet
                if (r0 == 0) goto L18
                com.google.common.collect.AbstractMapBasedMultimap$WrappedNavigableSet r0 = new com.google.common.collect.AbstractMapBasedMultimap$WrappedNavigableSet
                java.util.NavigableSet r4 = (java.util.NavigableSet) r4
                r0.<init>(r2, r3, r4, r1)
                return r0
            L18:
                boolean r0 = r4 instanceof java.util.SortedSet
                if (r0 == 0) goto L24
                com.google.common.collect.AbstractMapBasedMultimap$WrappedSortedSet r0 = new com.google.common.collect.AbstractMapBasedMultimap$WrappedSortedSet
                java.util.SortedSet r4 = (java.util.SortedSet) r4
                r0.<init>(r2, r3, r4, r1)
                return r0
            L24:
                boolean r0 = r4 instanceof java.util.Set
                if (r0 == 0) goto L30
                com.google.common.collect.AbstractMapBasedMultimap$WrappedSet r0 = new com.google.common.collect.AbstractMapBasedMultimap$WrappedSet
                java.util.Set r4 = (java.util.Set) r4
                r0.<init>(r2, r3, r4)
                return r0
            L30:
                com.google.common.collect.AbstractMapBasedMultimap$WrappedCollection r0 = new com.google.common.collect.AbstractMapBasedMultimap$WrappedCollection
                r0.<init>(r2, r3, r4, r1)
                return r0
        }
    }

    public static class CustomSetMultimap<K, V> extends com.google.common.collect.AbstractSetMultimap<K, V> {

        @com.google.common.annotations.GwtIncompatible
        private static final long serialVersionUID = 0;
        public transient com.google.common.base.Supplier<? extends java.util.Set<V>> factory;

        public CustomSetMultimap(java.util.Map<K, java.util.Collection<V>> r1, com.google.common.base.Supplier<? extends java.util.Set<V>> r2) {
                r0 = this;
                r0.<init>(r1)
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                com.google.common.base.Supplier r1 = (com.google.common.base.Supplier) r1
                r0.factory = r1
                return
        }

        @com.google.common.annotations.GwtIncompatible
        private void readObject(java.io.ObjectInputStream r2) throws java.io.IOException, java.lang.ClassNotFoundException {
                r1 = this;
                r2.defaultReadObject()
                java.lang.Object r0 = r2.readObject()
                com.google.common.base.Supplier r0 = (com.google.common.base.Supplier) r0
                r1.factory = r0
                java.lang.Object r2 = r2.readObject()
                java.util.Map r2 = (java.util.Map) r2
                r1.setMap(r2)
                return
        }

        @com.google.common.annotations.GwtIncompatible
        private void writeObject(java.io.ObjectOutputStream r2) throws java.io.IOException {
                r1 = this;
                r2.defaultWriteObject()
                com.google.common.base.Supplier<? extends java.util.Set<V>> r0 = r1.factory
                r2.writeObject(r0)
                java.util.Map r0 = r1.backingMap()
                r2.writeObject(r0)
                return
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        public final java.util.Map<K, java.util.Collection<V>> createAsMap() {
                r1 = this;
                java.util.Map r0 = r1.createMaybeNavigableAsMap()
                return r0
        }

        @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        public final java.util.Collection createCollection() {
                r1 = this;
                com.google.common.base.Supplier<? extends java.util.Set<V>> r0 = r1.factory
                java.lang.Object r0 = r0.get()
                java.util.Set r0 = (java.util.Set) r0
                return r0
        }

        @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        public final java.util.Set<V> createCollection() {
                r1 = this;
                com.google.common.base.Supplier<? extends java.util.Set<V>> r0 = r1.factory
                java.lang.Object r0 = r0.get()
                java.util.Set r0 = (java.util.Set) r0
                return r0
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        public final java.util.Set<K> createKeySet() {
                r1 = this;
                java.util.Set r0 = r1.createMaybeNavigableKeySet()
                return r0
        }

        @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        public final <E> java.util.Collection<E> unmodifiableCollectionSubclass(java.util.Collection<E> r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.util.NavigableSet
                if (r0 == 0) goto Lb
                java.util.NavigableSet r2 = (java.util.NavigableSet) r2
                java.util.NavigableSet r2 = com.google.common.collect.Sets.unmodifiableNavigableSet(r2)
                return r2
            Lb:
                boolean r0 = r2 instanceof java.util.SortedSet
                if (r0 == 0) goto L16
                java.util.SortedSet r2 = (java.util.SortedSet) r2
                java.util.SortedSet r2 = java.util.Collections.unmodifiableSortedSet(r2)
                return r2
            L16:
                java.util.Set r2 = (java.util.Set) r2
                java.util.Set r2 = java.util.Collections.unmodifiableSet(r2)
                return r2
        }

        @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        public final java.util.Collection<V> wrapCollection(@com.google.common.collect.ParametricNullness K r3, java.util.Collection<V> r4) {
                r2 = this;
                boolean r0 = r4 instanceof java.util.NavigableSet
                r1 = 0
                if (r0 == 0) goto Ld
                com.google.common.collect.AbstractMapBasedMultimap$WrappedNavigableSet r0 = new com.google.common.collect.AbstractMapBasedMultimap$WrappedNavigableSet
                java.util.NavigableSet r4 = (java.util.NavigableSet) r4
                r0.<init>(r2, r3, r4, r1)
                return r0
            Ld:
                boolean r0 = r4 instanceof java.util.SortedSet
                if (r0 == 0) goto L19
                com.google.common.collect.AbstractMapBasedMultimap$WrappedSortedSet r0 = new com.google.common.collect.AbstractMapBasedMultimap$WrappedSortedSet
                java.util.SortedSet r4 = (java.util.SortedSet) r4
                r0.<init>(r2, r3, r4, r1)
                return r0
            L19:
                com.google.common.collect.AbstractMapBasedMultimap$WrappedSet r0 = new com.google.common.collect.AbstractMapBasedMultimap$WrappedSet
                java.util.Set r4 = (java.util.Set) r4
                r0.<init>(r2, r3, r4)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class CustomSortedSetMultimap<K, V> extends com.google.common.collect.AbstractSortedSetMultimap<K, V> {

        @com.google.common.annotations.GwtIncompatible
        private static final long serialVersionUID = 0;
        public transient com.google.common.base.Supplier<? extends java.util.SortedSet<V>> factory;

        @javax.annotation.CheckForNull
        public transient java.util.Comparator<? super V> valueComparator;

        public CustomSortedSetMultimap(java.util.Map<K, java.util.Collection<V>> r1, com.google.common.base.Supplier<? extends java.util.SortedSet<V>> r2) {
                r0 = this;
                r0.<init>(r1)
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                com.google.common.base.Supplier r1 = (com.google.common.base.Supplier) r1
                r0.factory = r1
                java.lang.Object r1 = r2.get()
                java.util.SortedSet r1 = (java.util.SortedSet) r1
                java.util.Comparator r1 = r1.comparator()
                r0.valueComparator = r1
                return
        }

        @com.google.common.annotations.GwtIncompatible
        private void readObject(java.io.ObjectInputStream r2) throws java.io.IOException, java.lang.ClassNotFoundException {
                r1 = this;
                r2.defaultReadObject()
                java.lang.Object r0 = r2.readObject()
                com.google.common.base.Supplier r0 = (com.google.common.base.Supplier) r0
                r1.factory = r0
                java.lang.Object r0 = r0.get()
                java.util.SortedSet r0 = (java.util.SortedSet) r0
                java.util.Comparator r0 = r0.comparator()
                r1.valueComparator = r0
                java.lang.Object r2 = r2.readObject()
                java.util.Map r2 = (java.util.Map) r2
                r1.setMap(r2)
                return
        }

        @com.google.common.annotations.GwtIncompatible
        private void writeObject(java.io.ObjectOutputStream r2) throws java.io.IOException {
                r1 = this;
                r2.defaultWriteObject()
                com.google.common.base.Supplier<? extends java.util.SortedSet<V>> r0 = r1.factory
                r2.writeObject(r0)
                java.util.Map r0 = r1.backingMap()
                r2.writeObject(r0)
                return
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        public final java.util.Map<K, java.util.Collection<V>> createAsMap() {
                r1 = this;
                java.util.Map r0 = r1.createMaybeNavigableAsMap()
                return r0
        }

        @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        public final /* bridge */ /* synthetic */ java.util.Collection createCollection() {
                r1 = this;
                java.util.SortedSet r0 = r1.createCollection()
                return r0
        }

        @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        public final /* bridge */ /* synthetic */ java.util.Set createCollection() {
                r1 = this;
                java.util.SortedSet r0 = r1.createCollection()
                return r0
        }

        @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        public final java.util.SortedSet<V> createCollection() {
                r1 = this;
                com.google.common.base.Supplier<? extends java.util.SortedSet<V>> r0 = r1.factory
                java.lang.Object r0 = r0.get()
                java.util.SortedSet r0 = (java.util.SortedSet) r0
                return r0
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        public final java.util.Set<K> createKeySet() {
                r1 = this;
                java.util.Set r0 = r1.createMaybeNavigableKeySet()
                return r0
        }

        @Override // com.google.common.collect.SortedSetMultimap
        @javax.annotation.CheckForNull
        public java.util.Comparator<? super V> valueComparator() {
                r1 = this;
                java.util.Comparator<? super V> r0 = r1.valueComparator
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static abstract class Entries<K, V> extends java.util.AbstractCollection<java.util.Map.Entry<K, V>> {
        public Entries() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
                r1 = this;
                com.google.common.collect.Multimap r0 = r1.multimap()
                r0.clear()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object r3) {
                r2 = this;
                boolean r0 = r3 instanceof java.util.Map.Entry
                if (r0 == 0) goto L17
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                com.google.common.collect.Multimap r0 = r2.multimap()
                java.lang.Object r1 = r3.getKey()
                java.lang.Object r3 = r3.getValue()
                boolean r3 = r0.containsEntry(r1, r3)
                return r3
            L17:
                r3 = 0
                return r3
        }

        public abstract com.google.common.collect.Multimap<K, V> multimap();

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(@javax.annotation.CheckForNull java.lang.Object r3) {
                r2 = this;
                boolean r0 = r3 instanceof java.util.Map.Entry
                if (r0 == 0) goto L17
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                com.google.common.collect.Multimap r0 = r2.multimap()
                java.lang.Object r1 = r3.getKey()
                java.lang.Object r3 = r3.getValue()
                boolean r3 = r0.remove(r1, r3)
                return r3
            L17:
                r3 = 0
                return r3
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
                r1 = this;
                com.google.common.collect.Multimap r0 = r1.multimap()
                int r0 = r0.size()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class Keys<K, V> extends com.google.common.collect.AbstractMultiset<K> {

        @com.google.j2objc.annotations.Weak
        public final com.google.common.collect.Multimap<K, V> multimap;


        public Keys(com.google.common.collect.Multimap<K, V> r1) {
                r0 = this;
                r0.<init>()
                r0.multimap = r1
                return
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
        public void clear() {
                r1 = this;
                com.google.common.collect.Multimap<K, V> r0 = r1.multimap
                r0.clear()
                return
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.Multimap<K, V> r0 = r1.multimap
                boolean r2 = r0.containsKey(r2)
                return r2
        }

        @Override // com.google.common.collect.Multiset
        public int count(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.Multimap<K, V> r0 = r1.multimap
                java.util.Map r0 = r0.asMap()
                java.lang.Object r2 = com.google.common.collect.Maps.safeGet(r0, r2)
                java.util.Collection r2 = (java.util.Collection) r2
                if (r2 != 0) goto L10
                r2 = 0
                goto L14
            L10:
                int r2 = r2.size()
            L14:
                return r2
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final int distinctElements() {
                r1 = this;
                com.google.common.collect.Multimap<K, V> r0 = r1.multimap
                java.util.Map r0 = r0.asMap()
                int r0 = r0.size()
                return r0
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final java.util.Iterator<K> elementIterator() {
                r2 = this;
                java.lang.AssertionError r0 = new java.lang.AssertionError
                java.lang.String r1 = "should never be called"
                r0.<init>(r1)
                throw r0
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public java.util.Set<K> elementSet() {
                r1 = this;
                com.google.common.collect.Multimap<K, V> r0 = r1.multimap
                java.util.Set r0 = r0.keySet()
                return r0
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final java.util.Iterator<com.google.common.collect.Multiset.Entry<K>> entryIterator() {
                r2 = this;
                com.google.common.collect.Multimaps$Keys$1 r0 = new com.google.common.collect.Multimaps$Keys$1
                com.google.common.collect.Multimap<K, V> r1 = r2.multimap
                java.util.Map r1 = r1.asMap()
                java.util.Set r1 = r1.entrySet()
                java.util.Iterator r1 = r1.iterator()
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
        public java.util.Iterator<K> iterator() {
                r2 = this;
                com.google.common.collect.Multimap<K, V> r0 = r2.multimap
                java.util.Collection r0 = r0.entries()
                java.util.Iterator r0 = r0.iterator()
                com.google.common.collect.Maps$1 r1 = new com.google.common.collect.Maps$1
                r1.<init>(r0)
                return r1
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public int remove(@javax.annotation.CheckForNull java.lang.Object r3, int r4) {
                r2 = this;
                java.lang.String r0 = "occurrences"
                com.google.common.collect.CollectPreconditions.checkNonnegative(r4, r0)
                if (r4 != 0) goto Lc
                int r3 = r2.count(r3)
                return r3
            Lc:
                com.google.common.collect.Multimap<K, V> r0 = r2.multimap
                java.util.Map r0 = r0.asMap()
                java.lang.Object r3 = com.google.common.collect.Maps.safeGet(r0, r3)
                java.util.Collection r3 = (java.util.Collection) r3
                r0 = 0
                if (r3 != 0) goto L1c
                return r0
            L1c:
                int r1 = r3.size()
                if (r4 < r1) goto L26
                r3.clear()
                goto L35
            L26:
                java.util.Iterator r3 = r3.iterator()
            L2a:
                if (r0 >= r4) goto L35
                r3.next()
                r3.remove()
                int r0 = r0 + 1
                goto L2a
            L35:
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public int size() {
                r1 = this;
                com.google.common.collect.Multimap<K, V> r0 = r1.multimap
                int r0 = r0.size()
                return r0
        }
    }

    public static class MapMultimap<K, V> extends com.google.common.collect.AbstractMultimap<K, V> implements com.google.common.collect.SetMultimap<K, V>, java.io.Serializable {
        private static final long serialVersionUID = 7845222491160860175L;
        public final java.util.Map<K, V> map;


        public MapMultimap(java.util.Map<K, V> r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.util.Map r1 = (java.util.Map) r1
                r0.map = r1
                return
        }

        @Override // com.google.common.collect.Multimap
        public void clear() {
                r1 = this;
                java.util.Map<K, V> r0 = r1.map
                r0.clear()
                return
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean containsEntry(@javax.annotation.CheckForNull java.lang.Object r2, @javax.annotation.CheckForNull java.lang.Object r3) {
                r1 = this;
                java.util.Map<K, V> r0 = r1.map
                java.util.Set r0 = r0.entrySet()
                java.util.Map$Entry r2 = com.google.common.collect.Maps.immutableEntry(r2, r3)
                boolean r2 = r0.contains(r2)
                return r2
        }

        @Override // com.google.common.collect.Multimap
        public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                java.util.Map<K, V> r0 = r1.map
                boolean r2 = r0.containsKey(r2)
                return r2
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean containsValue(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                java.util.Map<K, V> r0 = r1.map
                boolean r2 = r0.containsValue(r2)
                return r2
        }

        @Override // com.google.common.collect.AbstractMultimap
        public final java.util.Map<K, java.util.Collection<V>> createAsMap() {
                r1 = this;
                com.google.common.collect.Multimaps$AsMap r0 = new com.google.common.collect.Multimaps$AsMap
                r0.<init>(r1)
                return r0
        }

        @Override // com.google.common.collect.AbstractMultimap
        public final java.util.Collection<java.util.Map.Entry<K, V>> createEntries() {
                r2 = this;
                java.lang.AssertionError r0 = new java.lang.AssertionError
                java.lang.String r1 = "unreachable"
                r0.<init>(r1)
                throw r0
        }

        @Override // com.google.common.collect.AbstractMultimap
        public final java.util.Set<K> createKeySet() {
                r1 = this;
                java.util.Map<K, V> r0 = r1.map
                java.util.Set r0 = r0.keySet()
                return r0
        }

        @Override // com.google.common.collect.AbstractMultimap
        public final com.google.common.collect.Multiset<K> createKeys() {
                r1 = this;
                com.google.common.collect.Multimaps$Keys r0 = new com.google.common.collect.Multimaps$Keys
                r0.<init>(r1)
                return r0
        }

        @Override // com.google.common.collect.AbstractMultimap
        public final java.util.Collection<V> createValues() {
                r1 = this;
                java.util.Map<K, V> r0 = r1.map
                java.util.Collection r0 = r0.values()
                return r0
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public /* bridge */ /* synthetic */ java.util.Collection entries() {
                r1 = this;
                java.util.Set r0 = r1.entries()
                return r0
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public java.util.Set<java.util.Map.Entry<K, V>> entries() {
                r1 = this;
                java.util.Map<K, V> r0 = r1.map
                java.util.Set r0 = r0.entrySet()
                return r0
        }

        @Override // com.google.common.collect.AbstractMultimap
        public final java.util.Iterator<java.util.Map.Entry<K, V>> entryIterator() {
                r1 = this;
                java.util.Map<K, V> r0 = r1.map
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
                return r0
        }

        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public /* bridge */ /* synthetic */ java.util.Collection get(@com.google.common.collect.ParametricNullness java.lang.Object r1) {
                r0 = this;
                java.util.Set r1 = r0.get(r1)
                return r1
        }

        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.Set<V> get(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                com.google.common.collect.Multimaps$MapMultimap$1 r0 = new com.google.common.collect.Multimaps$MapMultimap$1
                r0.<init>(r1, r2)
                return r0
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public int hashCode() {
                r1 = this;
                java.util.Map<K, V> r0 = r1.map
                int r0 = r0.hashCode()
                return r0
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean put(@com.google.common.collect.ParametricNullness K r1, @com.google.common.collect.ParametricNullness V r2) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean putAll(com.google.common.collect.Multimap<? extends K, ? extends V> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean putAll(@com.google.common.collect.ParametricNullness K r1, java.lang.Iterable<? extends V> r2) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean remove(@javax.annotation.CheckForNull java.lang.Object r2, @javax.annotation.CheckForNull java.lang.Object r3) {
                r1 = this;
                java.util.Map<K, V> r0 = r1.map
                java.util.Set r0 = r0.entrySet()
                java.util.Map$Entry r2 = com.google.common.collect.Maps.immutableEntry(r2, r3)
                boolean r2 = r0.remove(r2)
                return r2
        }

        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public /* bridge */ /* synthetic */ java.util.Collection removeAll(@javax.annotation.CheckForNull java.lang.Object r1) {
                r0 = this;
                java.util.Set r1 = r0.removeAll(r1)
                return r1
        }

        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.Set<V> removeAll(@javax.annotation.CheckForNull java.lang.Object r3) {
                r2 = this;
                java.util.HashSet r0 = new java.util.HashSet
                r1 = 2
                r0.<init>(r1)
                java.util.Map<K, V> r1 = r2.map
                boolean r1 = r1.containsKey(r3)
                if (r1 != 0) goto Lf
                return r0
            Lf:
                java.util.Map<K, V> r1 = r2.map
                java.lang.Object r3 = r1.remove(r3)
                r0.add(r3)
                return r0
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public /* bridge */ /* synthetic */ java.util.Collection replaceValues(@com.google.common.collect.ParametricNullness java.lang.Object r1, java.lang.Iterable r2) {
                r0 = this;
                java.util.Set r1 = r0.replaceValues(r1, r2)
                return r1
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.Set<V> replaceValues(@com.google.common.collect.ParametricNullness K r1, java.lang.Iterable<? extends V> r2) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.collect.Multimap
        public int size() {
                r1 = this;
                java.util.Map<K, V> r0 = r1.map
                int r0 = r0.size()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class TransformedEntriesListMultimap<K, V1, V2> extends com.google.common.collect.Multimaps.TransformedEntriesMultimap<K, V1, V2> implements com.google.common.collect.ListMultimap<K, V2> {
        public TransformedEntriesListMultimap(com.google.common.collect.ListMultimap<K, V1> r1, com.google.common.collect.Maps.EntryTransformer<? super K, ? super V1, V2> r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // com.google.common.collect.Multimaps.TransformedEntriesMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public /* bridge */ /* synthetic */ java.util.Collection get(@com.google.common.collect.ParametricNullness java.lang.Object r1) {
                r0 = this;
                java.util.List r1 = r0.get(r1)
                return r1
        }

        @Override // com.google.common.collect.Multimaps.TransformedEntriesMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.List<V2> get(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                com.google.common.collect.Multimap<K, V1> r0 = r1.fromMultimap
                java.util.Collection r0 = r0.get(r2)
                java.util.List r2 = r1.transform(r2, r0)
                return r2
        }

        @Override // com.google.common.collect.Multimaps.TransformedEntriesMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public /* bridge */ /* synthetic */ java.util.Collection removeAll(@javax.annotation.CheckForNull java.lang.Object r1) {
                r0 = this;
                java.util.List r1 = r0.removeAll(r1)
                return r1
        }

        @Override // com.google.common.collect.Multimaps.TransformedEntriesMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.List<V2> removeAll(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.Multimap<K, V1> r0 = r1.fromMultimap
                java.util.Collection r0 = r0.removeAll(r2)
                java.util.List r2 = r1.transform(r2, r0)
                return r2
        }

        @Override // com.google.common.collect.Multimaps.TransformedEntriesMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public /* bridge */ /* synthetic */ java.util.Collection replaceValues(@com.google.common.collect.ParametricNullness java.lang.Object r1, java.lang.Iterable r2) {
                r0 = this;
                java.util.List r1 = r0.replaceValues(r1, r2)
                return r1
        }

        @Override // com.google.common.collect.Multimaps.TransformedEntriesMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.List<V2> replaceValues(@com.google.common.collect.ParametricNullness K r1, java.lang.Iterable<? extends V2> r2) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.collect.Multimaps.TransformedEntriesMultimap
        public final /* bridge */ /* synthetic */ java.util.Collection transform(@com.google.common.collect.ParametricNullness java.lang.Object r1, java.util.Collection r2) {
                r0 = this;
                java.util.List r1 = r0.transform(r1, r2)
                return r1
        }

        @Override // com.google.common.collect.Multimaps.TransformedEntriesMultimap
        public final java.util.List<V2> transform(@com.google.common.collect.ParametricNullness K r3, java.util.Collection<V1> r4) {
                r2 = this;
                java.util.List r4 = (java.util.List) r4
                com.google.common.collect.Maps$EntryTransformer<? super K, ? super V1, V2> r0 = r2.transformer
                com.google.common.base.Preconditions.checkNotNull(r0)
                com.google.common.collect.Maps$10 r1 = new com.google.common.collect.Maps$10
                r1.<init>(r0, r3)
                java.util.List r3 = com.google.common.collect.Lists.transform(r4, r1)
                return r3
        }
    }

    public static class TransformedEntriesMultimap<K, V1, V2> extends com.google.common.collect.AbstractMultimap<K, V2> {
        public final com.google.common.collect.Multimap<K, V1> fromMultimap;
        public final com.google.common.collect.Maps.EntryTransformer<? super K, ? super V1, V2> transformer;


        public TransformedEntriesMultimap(com.google.common.collect.Multimap<K, V1> r1, com.google.common.collect.Maps.EntryTransformer<? super K, ? super V1, V2> r2) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.collect.Multimap r1 = (com.google.common.collect.Multimap) r1
                r0.fromMultimap = r1
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                com.google.common.collect.Maps$EntryTransformer r1 = (com.google.common.collect.Maps.EntryTransformer) r1
                r0.transformer = r1
                return
        }

        @Override // com.google.common.collect.Multimap
        public void clear() {
                r1 = this;
                com.google.common.collect.Multimap<K, V1> r0 = r1.fromMultimap
                r0.clear()
                return
        }

        @Override // com.google.common.collect.Multimap
        public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.Multimap<K, V1> r0 = r1.fromMultimap
                boolean r2 = r0.containsKey(r2)
                return r2
        }

        @Override // com.google.common.collect.AbstractMultimap
        public final java.util.Map<K, java.util.Collection<V2>> createAsMap() {
                r2 = this;
                com.google.common.collect.Multimap<K, V1> r0 = r2.fromMultimap
                java.util.Map r0 = r0.asMap()
                com.google.common.collect.Multimaps$TransformedEntriesMultimap$1 r1 = new com.google.common.collect.Multimaps$TransformedEntriesMultimap$1
                r1.<init>(r2)
                java.util.Map r0 = com.google.common.collect.Maps.transformEntries(r0, r1)
                return r0
        }

        @Override // com.google.common.collect.AbstractMultimap
        public final java.util.Collection<java.util.Map.Entry<K, V2>> createEntries() {
                r1 = this;
                com.google.common.collect.AbstractMultimap$Entries r0 = new com.google.common.collect.AbstractMultimap$Entries
                r0.<init>(r1)
                return r0
        }

        @Override // com.google.common.collect.AbstractMultimap
        public final java.util.Set<K> createKeySet() {
                r1 = this;
                com.google.common.collect.Multimap<K, V1> r0 = r1.fromMultimap
                java.util.Set r0 = r0.keySet()
                return r0
        }

        @Override // com.google.common.collect.AbstractMultimap
        public final com.google.common.collect.Multiset<K> createKeys() {
                r1 = this;
                com.google.common.collect.Multimap<K, V1> r0 = r1.fromMultimap
                com.google.common.collect.Multiset r0 = r0.keys()
                return r0
        }

        @Override // com.google.common.collect.AbstractMultimap
        public final java.util.Collection<V2> createValues() {
                r3 = this;
                com.google.common.collect.Multimap<K, V1> r0 = r3.fromMultimap
                java.util.Collection r0 = r0.entries()
                com.google.common.collect.Maps$EntryTransformer<? super K, ? super V1, V2> r1 = r3.transformer
                com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.collect.Maps$11 r2 = new com.google.common.collect.Maps$11
                r2.<init>(r1)
                java.util.Collection r0 = com.google.common.collect.Collections2.transform(r0, r2)
                return r0
        }

        @Override // com.google.common.collect.AbstractMultimap
        public final java.util.Iterator<java.util.Map.Entry<K, V2>> entryIterator() {
                r3 = this;
                com.google.common.collect.Multimap<K, V1> r0 = r3.fromMultimap
                java.util.Collection r0 = r0.entries()
                java.util.Iterator r0 = r0.iterator()
                com.google.common.collect.Maps$EntryTransformer<? super K, ? super V1, V2> r1 = r3.transformer
                com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.collect.Maps$13 r2 = new com.google.common.collect.Maps$13
                r2.<init>(r1)
                java.util.Iterator r0 = com.google.common.collect.Iterators.transform(r0, r2)
                return r0
        }

        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.Collection<V2> get(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                com.google.common.collect.Multimap<K, V1> r0 = r1.fromMultimap
                java.util.Collection r0 = r0.get(r2)
                java.util.Collection r2 = r1.transform(r2, r0)
                return r2
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean isEmpty() {
                r1 = this;
                com.google.common.collect.Multimap<K, V1> r0 = r1.fromMultimap
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean put(@com.google.common.collect.ParametricNullness K r1, @com.google.common.collect.ParametricNullness V2 r2) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean putAll(com.google.common.collect.Multimap<? extends K, ? extends V2> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean putAll(@com.google.common.collect.ParametricNullness K r1, java.lang.Iterable<? extends V2> r2) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean remove(@javax.annotation.CheckForNull java.lang.Object r1, @javax.annotation.CheckForNull java.lang.Object r2) {
                r0 = this;
                java.util.Collection r1 = r0.get(r1)
                boolean r1 = r1.remove(r2)
                return r1
        }

        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.Collection<V2> removeAll(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.Multimap<K, V1> r0 = r1.fromMultimap
                java.util.Collection r0 = r0.removeAll(r2)
                java.util.Collection r2 = r1.transform(r2, r0)
                return r2
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.Collection<V2> replaceValues(@com.google.common.collect.ParametricNullness K r1, java.lang.Iterable<? extends V2> r2) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.collect.Multimap
        public int size() {
                r1 = this;
                com.google.common.collect.Multimap<K, V1> r0 = r1.fromMultimap
                int r0 = r0.size()
                return r0
        }

        public java.util.Collection<V2> transform(@com.google.common.collect.ParametricNullness K r3, java.util.Collection<V1> r4) {
                r2 = this;
                com.google.common.collect.Maps$EntryTransformer<? super K, ? super V1, V2> r0 = r2.transformer
                com.google.common.base.Preconditions.checkNotNull(r0)
                com.google.common.collect.Maps$10 r1 = new com.google.common.collect.Maps$10
                r1.<init>(r0, r3)
                boolean r3 = r4 instanceof java.util.List
                if (r3 == 0) goto L15
                java.util.List r4 = (java.util.List) r4
                java.util.List r3 = com.google.common.collect.Lists.transform(r4, r1)
                return r3
            L15:
                java.util.Collection r3 = com.google.common.collect.Collections2.transform(r4, r1)
                return r3
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class UnmodifiableListMultimap<K, V> extends com.google.common.collect.Multimaps.UnmodifiableMultimap<K, V> implements com.google.common.collect.ListMultimap<K, V> {
        private static final long serialVersionUID = 0;

        public UnmodifiableListMultimap(com.google.common.collect.ListMultimap<K, V> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
        public com.google.common.collect.ListMultimap<K, V> delegate() {
                r1 = this;
                com.google.common.collect.Multimap<K, V> r0 = r1.delegate
                com.google.common.collect.ListMultimap r0 = (com.google.common.collect.ListMultimap) r0
                return r0
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ com.google.common.collect.Multimap delegate() {
                r1 = this;
                com.google.common.collect.ListMultimap r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ java.lang.Object delegate() {
                r1 = this;
                com.google.common.collect.ListMultimap r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public /* bridge */ /* synthetic */ java.util.Collection get(@com.google.common.collect.ParametricNullness java.lang.Object r1) {
                r0 = this;
                java.util.List r1 = r0.get(r1)
                return r1
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.List<V> get(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                com.google.common.collect.ListMultimap r0 = r1.delegate()
                java.util.List r2 = r0.get(r2)
                java.util.List r2 = java.util.Collections.unmodifiableList(r2)
                return r2
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public /* bridge */ /* synthetic */ java.util.Collection removeAll(@javax.annotation.CheckForNull java.lang.Object r1) {
                r0 = this;
                java.util.List r1 = r0.removeAll(r1)
                return r1
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.List<V> removeAll(@javax.annotation.CheckForNull java.lang.Object r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public /* bridge */ /* synthetic */ java.util.Collection replaceValues(@com.google.common.collect.ParametricNullness java.lang.Object r1, java.lang.Iterable r2) {
                r0 = this;
                java.util.List r1 = r0.replaceValues(r1, r2)
                return r1
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.List<V> replaceValues(@com.google.common.collect.ParametricNullness K r1, java.lang.Iterable<? extends V> r2) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class UnmodifiableMultimap<K, V> extends com.google.common.collect.ForwardingMultimap<K, V> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        public final com.google.common.collect.Multimap<K, V> delegate;

        @javax.annotation.CheckForNull
        @com.google.errorprone.annotations.concurrent.LazyInit
        public transient java.util.Collection<java.util.Map.Entry<K, V>> entries;

        @javax.annotation.CheckForNull
        @com.google.errorprone.annotations.concurrent.LazyInit
        public transient java.util.Set<K> keySet;

        @javax.annotation.CheckForNull
        @com.google.errorprone.annotations.concurrent.LazyInit
        public transient com.google.common.collect.Multiset<K> keys;

        @javax.annotation.CheckForNull
        @com.google.errorprone.annotations.concurrent.LazyInit
        public transient java.util.Map<K, java.util.Collection<V>> map;

        @javax.annotation.CheckForNull
        @com.google.errorprone.annotations.concurrent.LazyInit
        public transient java.util.Collection<V> values;


        public UnmodifiableMultimap(com.google.common.collect.Multimap<K, V> r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.collect.Multimap r1 = (com.google.common.collect.Multimap) r1
                r0.delegate = r1
                return
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.Map<K, java.util.Collection<V>> asMap() {
                r2 = this;
                java.util.Map<K, java.util.Collection<V>> r0 = r2.map
                if (r0 != 0) goto L19
                com.google.common.collect.Multimap<K, V> r0 = r2.delegate
                java.util.Map r0 = r0.asMap()
                com.google.common.collect.Multimaps$UnmodifiableMultimap$1 r1 = new com.google.common.collect.Multimaps$UnmodifiableMultimap$1
                r1.<init>()
                java.util.Map r0 = com.google.common.collect.Maps.transformValues(r0, r1)
                java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
                r2.map = r0
            L19:
                return r0
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public void clear() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
        public com.google.common.collect.Multimap<K, V> delegate() {
                r1 = this;
                com.google.common.collect.Multimap<K, V> r0 = r1.delegate
                return r0
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ java.lang.Object delegate() {
                r1 = this;
                com.google.common.collect.Multimap r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public java.util.Collection<java.util.Map.Entry<K, V>> entries() {
                r1 = this;
                java.util.Collection<java.util.Map$Entry<K, V>> r0 = r1.entries
                if (r0 != 0) goto L10
                com.google.common.collect.Multimap<K, V> r0 = r1.delegate
                java.util.Collection r0 = r0.entries()
                java.util.Collection r0 = com.google.common.collect.Multimaps.access$100(r0)
                r1.entries = r0
            L10:
                return r0
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.Collection<V> get(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                com.google.common.collect.Multimap<K, V> r0 = r1.delegate
                java.util.Collection r2 = r0.get(r2)
                java.util.Collection r2 = com.google.common.collect.Multimaps.access$000(r2)
                return r2
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public java.util.Set<K> keySet() {
                r1 = this;
                java.util.Set<K> r0 = r1.keySet
                if (r0 != 0) goto L10
                com.google.common.collect.Multimap<K, V> r0 = r1.delegate
                java.util.Set r0 = r0.keySet()
                java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
                r1.keySet = r0
            L10:
                return r0
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public com.google.common.collect.Multiset<K> keys() {
                r1 = this;
                com.google.common.collect.Multiset<K> r0 = r1.keys
                if (r0 != 0) goto L10
                com.google.common.collect.Multimap<K, V> r0 = r1.delegate
                com.google.common.collect.Multiset r0 = r0.keys()
                com.google.common.collect.Multiset r0 = com.google.common.collect.Multisets.unmodifiableMultiset(r0)
                r1.keys = r0
            L10:
                return r0
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public boolean put(@com.google.common.collect.ParametricNullness K r1, @com.google.common.collect.ParametricNullness V r2) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public boolean putAll(com.google.common.collect.Multimap<? extends K, ? extends V> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public boolean putAll(@com.google.common.collect.ParametricNullness K r1, java.lang.Iterable<? extends V> r2) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public boolean remove(@javax.annotation.CheckForNull java.lang.Object r1, @javax.annotation.CheckForNull java.lang.Object r2) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.Collection<V> removeAll(@javax.annotation.CheckForNull java.lang.Object r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.Collection<V> replaceValues(@com.google.common.collect.ParametricNullness K r1, java.lang.Iterable<? extends V> r2) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public java.util.Collection<V> values() {
                r1 = this;
                java.util.Collection<V> r0 = r1.values
                if (r0 != 0) goto L10
                com.google.common.collect.Multimap<K, V> r0 = r1.delegate
                java.util.Collection r0 = r0.values()
                java.util.Collection r0 = java.util.Collections.unmodifiableCollection(r0)
                r1.values = r0
            L10:
                return r0
        }
    }

    public static class UnmodifiableSetMultimap<K, V> extends com.google.common.collect.Multimaps.UnmodifiableMultimap<K, V> implements com.google.common.collect.SetMultimap<K, V> {
        private static final long serialVersionUID = 0;

        public UnmodifiableSetMultimap(com.google.common.collect.SetMultimap<K, V> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ com.google.common.collect.Multimap delegate() {
                r1 = this;
                com.google.common.collect.SetMultimap r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
        public com.google.common.collect.SetMultimap<K, V> delegate() {
                r1 = this;
                com.google.common.collect.Multimap<K, V> r0 = r1.delegate
                com.google.common.collect.SetMultimap r0 = (com.google.common.collect.SetMultimap) r0
                return r0
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ java.lang.Object delegate() {
                r1 = this;
                com.google.common.collect.SetMultimap r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public /* bridge */ /* synthetic */ java.util.Collection entries() {
                r1 = this;
                java.util.Set r0 = r1.entries()
                return r0
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public java.util.Set<java.util.Map.Entry<K, V>> entries() {
                r2 = this;
                com.google.common.collect.SetMultimap r0 = r2.delegate()
                java.util.Set r0 = r0.entries()
                com.google.common.collect.Maps$UnmodifiableEntrySet r1 = new com.google.common.collect.Maps$UnmodifiableEntrySet
                java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
                r1.<init>(r0)
                return r1
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public /* bridge */ /* synthetic */ java.util.Collection get(@com.google.common.collect.ParametricNullness java.lang.Object r1) {
                r0 = this;
                java.util.Set r1 = r0.get(r1)
                return r1
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.Set<V> get(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                com.google.common.collect.SetMultimap r0 = r1.delegate()
                java.util.Set r2 = r0.get(r2)
                java.util.Set r2 = java.util.Collections.unmodifiableSet(r2)
                return r2
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public /* bridge */ /* synthetic */ java.util.Collection removeAll(@javax.annotation.CheckForNull java.lang.Object r1) {
                r0 = this;
                java.util.Set r1 = r0.removeAll(r1)
                return r1
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.Set<V> removeAll(@javax.annotation.CheckForNull java.lang.Object r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public /* bridge */ /* synthetic */ java.util.Collection replaceValues(@com.google.common.collect.ParametricNullness java.lang.Object r1, java.lang.Iterable r2) {
                r0 = this;
                java.util.Set r1 = r0.replaceValues(r1, r2)
                return r1
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.Set<V> replaceValues(@com.google.common.collect.ParametricNullness K r1, java.lang.Iterable<? extends V> r2) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class UnmodifiableSortedSetMultimap<K, V> extends com.google.common.collect.Multimaps.UnmodifiableSetMultimap<K, V> implements com.google.common.collect.SortedSetMultimap<K, V> {
        private static final long serialVersionUID = 0;

        public UnmodifiableSortedSetMultimap(com.google.common.collect.SortedSetMultimap<K, V> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ com.google.common.collect.Multimap delegate() {
                r1 = this;
                com.google.common.collect.SortedSetMultimap r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ com.google.common.collect.SetMultimap delegate() {
                r1 = this;
                com.google.common.collect.SortedSetMultimap r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
        public com.google.common.collect.SortedSetMultimap<K, V> delegate() {
                r1 = this;
                com.google.common.collect.SetMultimap r0 = super.delegate()
                com.google.common.collect.SortedSetMultimap r0 = (com.google.common.collect.SortedSetMultimap) r0
                return r0
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ java.lang.Object delegate() {
                r1 = this;
                com.google.common.collect.SortedSetMultimap r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public /* bridge */ /* synthetic */ java.util.Collection get(@com.google.common.collect.ParametricNullness java.lang.Object r1) {
                r0 = this;
                java.util.SortedSet r1 = r0.get(r1)
                return r1
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public /* bridge */ /* synthetic */ java.util.Set get(@com.google.common.collect.ParametricNullness java.lang.Object r1) {
                r0 = this;
                java.util.SortedSet r1 = r0.get(r1)
                return r1
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.SortedSet<V> get(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                com.google.common.collect.SortedSetMultimap r0 = r1.delegate()
                java.util.SortedSet r2 = r0.get(r2)
                java.util.SortedSet r2 = java.util.Collections.unmodifiableSortedSet(r2)
                return r2
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public /* bridge */ /* synthetic */ java.util.Collection removeAll(@javax.annotation.CheckForNull java.lang.Object r1) {
                r0 = this;
                java.util.SortedSet r1 = r0.removeAll(r1)
                return r1
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public /* bridge */ /* synthetic */ java.util.Set removeAll(@javax.annotation.CheckForNull java.lang.Object r1) {
                r0 = this;
                java.util.SortedSet r1 = r0.removeAll(r1)
                return r1
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.SortedSet<V> removeAll(@javax.annotation.CheckForNull java.lang.Object r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public /* bridge */ /* synthetic */ java.util.Collection replaceValues(@com.google.common.collect.ParametricNullness java.lang.Object r1, java.lang.Iterable r2) {
                r0 = this;
                java.util.SortedSet r1 = r0.replaceValues(r1, r2)
                return r1
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public /* bridge */ /* synthetic */ java.util.Set replaceValues(@com.google.common.collect.ParametricNullness java.lang.Object r1, java.lang.Iterable r2) {
                r0 = this;
                java.util.SortedSet r1 = r0.replaceValues(r1, r2)
                return r1
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.SortedSet<V> replaceValues(@com.google.common.collect.ParametricNullness K r1, java.lang.Iterable<? extends V> r2) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.collect.SortedSetMultimap
        @javax.annotation.CheckForNull
        public java.util.Comparator<? super V> valueComparator() {
                r1 = this;
                com.google.common.collect.SortedSetMultimap r0 = r1.delegate()
                java.util.Comparator r0 = r0.valueComparator()
                return r0
        }
    }

    private Multimaps() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ java.util.Collection access$000(java.util.Collection r0) {
            java.util.Collection r0 = unmodifiableValueCollection(r0)
            return r0
    }

    public static /* synthetic */ java.util.Collection access$100(java.util.Collection r0) {
            java.util.Collection r0 = unmodifiableEntries(r0)
            return r0
    }

    @com.google.common.annotations.Beta
    public static <K, V> java.util.Map<K, java.util.List<V>> asMap(com.google.common.collect.ListMultimap<K, V> r0) {
            java.util.Map r0 = r0.asMap()
            return r0
    }

    @com.google.common.annotations.Beta
    public static <K, V> java.util.Map<K, java.util.Collection<V>> asMap(com.google.common.collect.Multimap<K, V> r0) {
            java.util.Map r0 = r0.asMap()
            return r0
    }

    @com.google.common.annotations.Beta
    public static <K, V> java.util.Map<K, java.util.Set<V>> asMap(com.google.common.collect.SetMultimap<K, V> r0) {
            java.util.Map r0 = r0.asMap()
            return r0
    }

    @com.google.common.annotations.Beta
    public static <K, V> java.util.Map<K, java.util.SortedSet<V>> asMap(com.google.common.collect.SortedSetMultimap<K, V> r0) {
            java.util.Map r0 = r0.asMap()
            return r0
    }

    public static <K, V> com.google.common.collect.Multimap<K, V> filterEntries(com.google.common.collect.Multimap<K, V> r1, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> r2) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            boolean r0 = r1 instanceof com.google.common.collect.SetMultimap
            if (r0 == 0) goto Le
            com.google.common.collect.SetMultimap r1 = (com.google.common.collect.SetMultimap) r1
            com.google.common.collect.SetMultimap r1 = filterEntries(r1, r2)
            return r1
        Le:
            boolean r0 = r1 instanceof com.google.common.collect.FilteredMultimap
            if (r0 == 0) goto L19
            com.google.common.collect.FilteredMultimap r1 = (com.google.common.collect.FilteredMultimap) r1
            com.google.common.collect.Multimap r1 = filterFiltered(r1, r2)
            goto L25
        L19:
            com.google.common.collect.FilteredEntryMultimap r0 = new com.google.common.collect.FilteredEntryMultimap
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.collect.Multimap r1 = (com.google.common.collect.Multimap) r1
            r0.<init>(r1, r2)
            r1 = r0
        L25:
            return r1
    }

    public static <K, V> com.google.common.collect.SetMultimap<K, V> filterEntries(com.google.common.collect.SetMultimap<K, V> r1, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> r2) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            boolean r0 = r1 instanceof com.google.common.collect.FilteredSetMultimap
            if (r0 == 0) goto Le
            com.google.common.collect.FilteredSetMultimap r1 = (com.google.common.collect.FilteredSetMultimap) r1
            com.google.common.collect.SetMultimap r1 = filterFiltered(r1, r2)
            goto L1a
        Le:
            com.google.common.collect.FilteredEntrySetMultimap r0 = new com.google.common.collect.FilteredEntrySetMultimap
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.collect.SetMultimap r1 = (com.google.common.collect.SetMultimap) r1
            r0.<init>(r1, r2)
            r1 = r0
        L1a:
            return r1
    }

    private static <K, V> com.google.common.collect.Multimap<K, V> filterFiltered(com.google.common.collect.FilteredMultimap<K, V> r1, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> r2) {
            com.google.common.base.Predicate r0 = r1.entryPredicate()
            com.google.common.base.Predicate r2 = com.google.common.base.Predicates.and(r0, r2)
            com.google.common.collect.FilteredEntryMultimap r0 = new com.google.common.collect.FilteredEntryMultimap
            com.google.common.collect.Multimap r1 = r1.unfiltered()
            r0.<init>(r1, r2)
            return r0
    }

    private static <K, V> com.google.common.collect.SetMultimap<K, V> filterFiltered(com.google.common.collect.FilteredSetMultimap<K, V> r1, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> r2) {
            com.google.common.base.Predicate r0 = r1.entryPredicate()
            com.google.common.base.Predicate r2 = com.google.common.base.Predicates.and(r0, r2)
            com.google.common.collect.FilteredEntrySetMultimap r0 = new com.google.common.collect.FilteredEntrySetMultimap
            com.google.common.collect.SetMultimap r1 = r1.unfiltered()
            r0.<init>(r1, r2)
            return r0
    }

    public static <K, V> com.google.common.collect.ListMultimap<K, V> filterKeys(com.google.common.collect.ListMultimap<K, V> r2, com.google.common.base.Predicate<? super K> r3) {
            boolean r0 = r2 instanceof com.google.common.collect.FilteredKeyListMultimap
            if (r0 == 0) goto L16
            com.google.common.collect.FilteredKeyListMultimap r2 = (com.google.common.collect.FilteredKeyListMultimap) r2
            com.google.common.collect.FilteredKeyListMultimap r0 = new com.google.common.collect.FilteredKeyListMultimap
            com.google.common.collect.ListMultimap r1 = r2.unfiltered()
            com.google.common.base.Predicate<? super K> r2 = r2.keyPredicate
            com.google.common.base.Predicate r2 = com.google.common.base.Predicates.and(r2, r3)
            r0.<init>(r1, r2)
            return r0
        L16:
            com.google.common.collect.FilteredKeyListMultimap r0 = new com.google.common.collect.FilteredKeyListMultimap
            r0.<init>(r2, r3)
            return r0
    }

    public static <K, V> com.google.common.collect.Multimap<K, V> filterKeys(com.google.common.collect.Multimap<K, V> r2, com.google.common.base.Predicate<? super K> r3) {
            boolean r0 = r2 instanceof com.google.common.collect.SetMultimap
            if (r0 == 0) goto Lb
            com.google.common.collect.SetMultimap r2 = (com.google.common.collect.SetMultimap) r2
            com.google.common.collect.SetMultimap r2 = filterKeys(r2, r3)
            return r2
        Lb:
            boolean r0 = r2 instanceof com.google.common.collect.ListMultimap
            if (r0 == 0) goto L16
            com.google.common.collect.ListMultimap r2 = (com.google.common.collect.ListMultimap) r2
            com.google.common.collect.ListMultimap r2 = filterKeys(r2, r3)
            return r2
        L16:
            boolean r0 = r2 instanceof com.google.common.collect.FilteredKeyMultimap
            if (r0 == 0) goto L2a
            com.google.common.collect.FilteredKeyMultimap r2 = (com.google.common.collect.FilteredKeyMultimap) r2
            com.google.common.collect.FilteredKeyMultimap r0 = new com.google.common.collect.FilteredKeyMultimap
            com.google.common.collect.Multimap<K, V> r1 = r2.unfiltered
            com.google.common.base.Predicate<? super K> r2 = r2.keyPredicate
            com.google.common.base.Predicate r2 = com.google.common.base.Predicates.and(r2, r3)
            r0.<init>(r1, r2)
            return r0
        L2a:
            boolean r0 = r2 instanceof com.google.common.collect.FilteredMultimap
            if (r0 == 0) goto L39
            com.google.common.collect.FilteredMultimap r2 = (com.google.common.collect.FilteredMultimap) r2
            com.google.common.base.Predicate r3 = com.google.common.collect.Maps.keyPredicateOnEntries(r3)
            com.google.common.collect.Multimap r2 = filterFiltered(r2, r3)
            return r2
        L39:
            com.google.common.collect.FilteredKeyMultimap r0 = new com.google.common.collect.FilteredKeyMultimap
            r0.<init>(r2, r3)
            return r0
    }

    public static <K, V> com.google.common.collect.SetMultimap<K, V> filterKeys(com.google.common.collect.SetMultimap<K, V> r2, com.google.common.base.Predicate<? super K> r3) {
            boolean r0 = r2 instanceof com.google.common.collect.FilteredKeySetMultimap
            if (r0 == 0) goto L16
            com.google.common.collect.FilteredKeySetMultimap r2 = (com.google.common.collect.FilteredKeySetMultimap) r2
            com.google.common.collect.FilteredKeySetMultimap r0 = new com.google.common.collect.FilteredKeySetMultimap
            com.google.common.collect.SetMultimap r1 = r2.unfiltered()
            com.google.common.base.Predicate<? super K> r2 = r2.keyPredicate
            com.google.common.base.Predicate r2 = com.google.common.base.Predicates.and(r2, r3)
            r0.<init>(r1, r2)
            return r0
        L16:
            boolean r0 = r2 instanceof com.google.common.collect.FilteredSetMultimap
            if (r0 == 0) goto L25
            com.google.common.collect.FilteredSetMultimap r2 = (com.google.common.collect.FilteredSetMultimap) r2
            com.google.common.base.Predicate r3 = com.google.common.collect.Maps.keyPredicateOnEntries(r3)
            com.google.common.collect.SetMultimap r2 = filterFiltered(r2, r3)
            return r2
        L25:
            com.google.common.collect.FilteredKeySetMultimap r0 = new com.google.common.collect.FilteredKeySetMultimap
            r0.<init>(r2, r3)
            return r0
    }

    public static <K, V> com.google.common.collect.Multimap<K, V> filterValues(com.google.common.collect.Multimap<K, V> r0, com.google.common.base.Predicate<? super V> r1) {
            com.google.common.base.Predicate r1 = com.google.common.collect.Maps.valuePredicateOnEntries(r1)
            com.google.common.collect.Multimap r0 = filterEntries(r0, r1)
            return r0
    }

    public static <K, V> com.google.common.collect.SetMultimap<K, V> filterValues(com.google.common.collect.SetMultimap<K, V> r0, com.google.common.base.Predicate<? super V> r1) {
            com.google.common.base.Predicate r1 = com.google.common.collect.Maps.valuePredicateOnEntries(r1)
            com.google.common.collect.SetMultimap r0 = filterEntries(r0, r1)
            return r0
    }

    public static <K, V> com.google.common.collect.SetMultimap<K, V> forMap(java.util.Map<K, V> r1) {
            com.google.common.collect.Multimaps$MapMultimap r0 = new com.google.common.collect.Multimaps$MapMultimap
            r0.<init>(r1)
            return r0
    }

    public static <K, V> com.google.common.collect.ImmutableListMultimap<K, V> index(java.lang.Iterable<V> r0, com.google.common.base.Function<? super V, K> r1) {
            java.util.Iterator r0 = r0.iterator()
            com.google.common.collect.ImmutableListMultimap r0 = index(r0, r1)
            return r0
    }

    public static <K, V> com.google.common.collect.ImmutableListMultimap<K, V> index(java.util.Iterator<V> r3, com.google.common.base.Function<? super V, K> r4) {
            com.google.common.base.Preconditions.checkNotNull(r4)
            com.google.common.collect.ImmutableListMultimap$Builder r0 = com.google.common.collect.ImmutableListMultimap.builder()
        L7:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r3.next()
            com.google.common.base.Preconditions.checkNotNull(r1, r3)
            java.lang.Object r2 = r4.apply(r1)
            r0.put(r2, r1)
            goto L7
        L1c:
            com.google.common.collect.ImmutableListMultimap r3 = r0.build()
            return r3
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static <K, V, M extends com.google.common.collect.Multimap<K, V>> M invertFrom(com.google.common.collect.Multimap<? extends V, ? extends K> r2, M r3) {
            com.google.common.base.Preconditions.checkNotNull(r3)
            java.util.Collection r2 = r2.entries()
            java.util.Iterator r2 = r2.iterator()
        Lb:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getValue()
            java.lang.Object r0 = r0.getKey()
            r3.put(r1, r0)
            goto Lb
        L23:
            return r3
    }

    public static <K, V> com.google.common.collect.ListMultimap<K, V> newListMultimap(java.util.Map<K, java.util.Collection<V>> r1, com.google.common.base.Supplier<? extends java.util.List<V>> r2) {
            com.google.common.collect.Multimaps$CustomListMultimap r0 = new com.google.common.collect.Multimaps$CustomListMultimap
            r0.<init>(r1, r2)
            return r0
    }

    public static <K, V> com.google.common.collect.Multimap<K, V> newMultimap(java.util.Map<K, java.util.Collection<V>> r1, com.google.common.base.Supplier<? extends java.util.Collection<V>> r2) {
            com.google.common.collect.Multimaps$CustomMultimap r0 = new com.google.common.collect.Multimaps$CustomMultimap
            r0.<init>(r1, r2)
            return r0
    }

    public static <K, V> com.google.common.collect.SetMultimap<K, V> newSetMultimap(java.util.Map<K, java.util.Collection<V>> r1, com.google.common.base.Supplier<? extends java.util.Set<V>> r2) {
            com.google.common.collect.Multimaps$CustomSetMultimap r0 = new com.google.common.collect.Multimaps$CustomSetMultimap
            r0.<init>(r1, r2)
            return r0
    }

    public static <K, V> com.google.common.collect.SortedSetMultimap<K, V> newSortedSetMultimap(java.util.Map<K, java.util.Collection<V>> r1, com.google.common.base.Supplier<? extends java.util.SortedSet<V>> r2) {
            com.google.common.collect.Multimaps$CustomSortedSetMultimap r0 = new com.google.common.collect.Multimaps$CustomSortedSetMultimap
            r0.<init>(r1, r2)
            return r0
    }

    public static <K, V> com.google.common.collect.ListMultimap<K, V> synchronizedListMultimap(com.google.common.collect.ListMultimap<K, V> r1) {
            boolean r0 = r1 instanceof com.google.common.collect.Synchronized.SynchronizedListMultimap
            if (r0 != 0) goto Lf
            boolean r0 = r1 instanceof com.google.common.collect.BaseImmutableMultimap
            if (r0 == 0) goto L9
            goto Lf
        L9:
            com.google.common.collect.Synchronized$SynchronizedListMultimap r0 = new com.google.common.collect.Synchronized$SynchronizedListMultimap
            r0.<init>(r1)
            r1 = r0
        Lf:
            return r1
    }

    public static <K, V> com.google.common.collect.Multimap<K, V> synchronizedMultimap(com.google.common.collect.Multimap<K, V> r1) {
            boolean r0 = r1 instanceof com.google.common.collect.Synchronized.SynchronizedMultimap
            if (r0 != 0) goto Lf
            boolean r0 = r1 instanceof com.google.common.collect.BaseImmutableMultimap
            if (r0 == 0) goto L9
            goto Lf
        L9:
            com.google.common.collect.Synchronized$SynchronizedMultimap r0 = new com.google.common.collect.Synchronized$SynchronizedMultimap
            r0.<init>(r1)
            r1 = r0
        Lf:
            return r1
    }

    public static <K, V> com.google.common.collect.SetMultimap<K, V> synchronizedSetMultimap(com.google.common.collect.SetMultimap<K, V> r1) {
            boolean r0 = r1 instanceof com.google.common.collect.Synchronized.SynchronizedSetMultimap
            if (r0 != 0) goto Lf
            boolean r0 = r1 instanceof com.google.common.collect.BaseImmutableMultimap
            if (r0 == 0) goto L9
            goto Lf
        L9:
            com.google.common.collect.Synchronized$SynchronizedSetMultimap r0 = new com.google.common.collect.Synchronized$SynchronizedSetMultimap
            r0.<init>(r1)
            r1 = r0
        Lf:
            return r1
    }

    public static <K, V> com.google.common.collect.SortedSetMultimap<K, V> synchronizedSortedSetMultimap(com.google.common.collect.SortedSetMultimap<K, V> r1) {
            boolean r0 = r1 instanceof com.google.common.collect.Synchronized.SynchronizedSortedSetMultimap
            if (r0 == 0) goto L5
            goto Lb
        L5:
            com.google.common.collect.Synchronized$SynchronizedSortedSetMultimap r0 = new com.google.common.collect.Synchronized$SynchronizedSortedSetMultimap
            r0.<init>(r1)
            r1 = r0
        Lb:
            return r1
    }

    public static <K, V1, V2> com.google.common.collect.ListMultimap<K, V2> transformEntries(com.google.common.collect.ListMultimap<K, V1> r1, com.google.common.collect.Maps.EntryTransformer<? super K, ? super V1, V2> r2) {
            com.google.common.collect.Multimaps$TransformedEntriesListMultimap r0 = new com.google.common.collect.Multimaps$TransformedEntriesListMultimap
            r0.<init>(r1, r2)
            return r0
    }

    public static <K, V1, V2> com.google.common.collect.Multimap<K, V2> transformEntries(com.google.common.collect.Multimap<K, V1> r1, com.google.common.collect.Maps.EntryTransformer<? super K, ? super V1, V2> r2) {
            com.google.common.collect.Multimaps$TransformedEntriesMultimap r0 = new com.google.common.collect.Multimaps$TransformedEntriesMultimap
            r0.<init>(r1, r2)
            return r0
    }

    public static <K, V1, V2> com.google.common.collect.ListMultimap<K, V2> transformValues(com.google.common.collect.ListMultimap<K, V1> r0, com.google.common.base.Function<? super V1, V2> r1) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.collect.Maps$EntryTransformer r1 = com.google.common.collect.Maps.asEntryTransformer(r1)
            com.google.common.collect.ListMultimap r0 = transformEntries(r0, r1)
            return r0
    }

    public static <K, V1, V2> com.google.common.collect.Multimap<K, V2> transformValues(com.google.common.collect.Multimap<K, V1> r0, com.google.common.base.Function<? super V1, V2> r1) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.collect.Maps$EntryTransformer r1 = com.google.common.collect.Maps.asEntryTransformer(r1)
            com.google.common.collect.Multimap r0 = transformEntries(r0, r1)
            return r0
    }

    private static <K, V> java.util.Collection<java.util.Map.Entry<K, V>> unmodifiableEntries(java.util.Collection<java.util.Map.Entry<K, V>> r1) {
            boolean r0 = r1 instanceof java.util.Set
            if (r0 == 0) goto L10
            java.util.Set r1 = (java.util.Set) r1
            com.google.common.collect.Maps$UnmodifiableEntrySet r0 = new com.google.common.collect.Maps$UnmodifiableEntrySet
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r1)
            r0.<init>(r1)
            return r0
        L10:
            com.google.common.collect.Maps$UnmodifiableEntries r0 = new com.google.common.collect.Maps$UnmodifiableEntries
            java.util.Collection r1 = java.util.Collections.unmodifiableCollection(r1)
            r0.<init>(r1)
            return r0
    }

    @java.lang.Deprecated
    public static <K, V> com.google.common.collect.ListMultimap<K, V> unmodifiableListMultimap(com.google.common.collect.ImmutableListMultimap<K, V> r0) {
            java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r0)
            com.google.common.collect.ListMultimap r0 = (com.google.common.collect.ListMultimap) r0
            return r0
    }

    public static <K, V> com.google.common.collect.ListMultimap<K, V> unmodifiableListMultimap(com.google.common.collect.ListMultimap<K, V> r1) {
            boolean r0 = r1 instanceof com.google.common.collect.Multimaps.UnmodifiableListMultimap
            if (r0 != 0) goto Lf
            boolean r0 = r1 instanceof com.google.common.collect.ImmutableListMultimap
            if (r0 == 0) goto L9
            goto Lf
        L9:
            com.google.common.collect.Multimaps$UnmodifiableListMultimap r0 = new com.google.common.collect.Multimaps$UnmodifiableListMultimap
            r0.<init>(r1)
            return r0
        Lf:
            return r1
    }

    @java.lang.Deprecated
    public static <K, V> com.google.common.collect.Multimap<K, V> unmodifiableMultimap(com.google.common.collect.ImmutableMultimap<K, V> r0) {
            java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r0)
            com.google.common.collect.Multimap r0 = (com.google.common.collect.Multimap) r0
            return r0
    }

    public static <K, V> com.google.common.collect.Multimap<K, V> unmodifiableMultimap(com.google.common.collect.Multimap<K, V> r1) {
            boolean r0 = r1 instanceof com.google.common.collect.Multimaps.UnmodifiableMultimap
            if (r0 != 0) goto Lf
            boolean r0 = r1 instanceof com.google.common.collect.ImmutableMultimap
            if (r0 == 0) goto L9
            goto Lf
        L9:
            com.google.common.collect.Multimaps$UnmodifiableMultimap r0 = new com.google.common.collect.Multimaps$UnmodifiableMultimap
            r0.<init>(r1)
            return r0
        Lf:
            return r1
    }

    @java.lang.Deprecated
    public static <K, V> com.google.common.collect.SetMultimap<K, V> unmodifiableSetMultimap(com.google.common.collect.ImmutableSetMultimap<K, V> r0) {
            java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r0)
            com.google.common.collect.SetMultimap r0 = (com.google.common.collect.SetMultimap) r0
            return r0
    }

    public static <K, V> com.google.common.collect.SetMultimap<K, V> unmodifiableSetMultimap(com.google.common.collect.SetMultimap<K, V> r1) {
            boolean r0 = r1 instanceof com.google.common.collect.Multimaps.UnmodifiableSetMultimap
            if (r0 != 0) goto Lf
            boolean r0 = r1 instanceof com.google.common.collect.ImmutableSetMultimap
            if (r0 == 0) goto L9
            goto Lf
        L9:
            com.google.common.collect.Multimaps$UnmodifiableSetMultimap r0 = new com.google.common.collect.Multimaps$UnmodifiableSetMultimap
            r0.<init>(r1)
            return r0
        Lf:
            return r1
    }

    public static <K, V> com.google.common.collect.SortedSetMultimap<K, V> unmodifiableSortedSetMultimap(com.google.common.collect.SortedSetMultimap<K, V> r1) {
            boolean r0 = r1 instanceof com.google.common.collect.Multimaps.UnmodifiableSortedSetMultimap
            if (r0 == 0) goto L5
            return r1
        L5:
            com.google.common.collect.Multimaps$UnmodifiableSortedSetMultimap r0 = new com.google.common.collect.Multimaps$UnmodifiableSortedSetMultimap
            r0.<init>(r1)
            return r0
    }

    private static <V> java.util.Collection<V> unmodifiableValueCollection(java.util.Collection<V> r1) {
            boolean r0 = r1 instanceof java.util.SortedSet
            if (r0 == 0) goto Lb
            java.util.SortedSet r1 = (java.util.SortedSet) r1
            java.util.SortedSet r1 = java.util.Collections.unmodifiableSortedSet(r1)
            return r1
        Lb:
            boolean r0 = r1 instanceof java.util.Set
            if (r0 == 0) goto L16
            java.util.Set r1 = (java.util.Set) r1
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r1)
            return r1
        L16:
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto L21
            java.util.List r1 = (java.util.List) r1
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            return r1
        L21:
            java.util.Collection r1 = java.util.Collections.unmodifiableCollection(r1)
            return r1
    }
}
