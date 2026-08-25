package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible(emulated = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ImmutableMultimap<K, V> extends com.google.common.collect.BaseImmutableMultimap<K, V> implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    public final transient com.google.common.collect.ImmutableMap<K, ? extends com.google.common.collect.ImmutableCollection<V>> map;
    public final transient int size;

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableMultimap$1, reason: invalid class name */
    class AnonymousClass1 extends com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<java.lang.Object, java.lang.Object>> {
        public final java.util.Iterator<? extends java.util.Map.Entry<java.lang.Object, ? extends com.google.common.collect.ImmutableCollection<java.lang.Object>>> asMapItr;

        @javax.annotation.CheckForNull
        public java.lang.Object currentKey;
        public java.util.Iterator<java.lang.Object> valueItr;

        public AnonymousClass1(com.google.common.collect.ImmutableMultimap r1) {
                r0 = this;
                r0.<init>()
                com.google.common.collect.ImmutableMap<K, ? extends com.google.common.collect.ImmutableCollection<V>> r1 = r1.map
                com.google.common.collect.ImmutableSet r1 = r1.entrySet()
                com.google.common.collect.UnmodifiableIterator r1 = r1.iterator()
                r0.asMapItr = r1
                r1 = 0
                r0.currentKey = r1
                com.google.common.collect.UnmodifiableListIterator<java.lang.Object> r1 = com.google.common.collect.Iterators.ArrayItr.EMPTY
                r0.valueItr = r1
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                java.util.Iterator<java.lang.Object> r0 = r1.valueItr
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L13
                java.util.Iterator<? extends java.util.Map$Entry<java.lang.Object, ? extends com.google.common.collect.ImmutableCollection<java.lang.Object>>> r0 = r1.asMapItr
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
        public /* bridge */ /* synthetic */ java.lang.Object next() {
                r1 = this;
                java.util.Map$Entry r0 = r1.next()
                return r0
        }

        @Override // java.util.Iterator
        public java.util.Map.Entry<java.lang.Object, java.lang.Object> next() {
                r2 = this;
                java.util.Iterator<java.lang.Object> r0 = r2.valueItr
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L22
                java.util.Iterator<? extends java.util.Map$Entry<java.lang.Object, ? extends com.google.common.collect.ImmutableCollection<java.lang.Object>>> r0 = r2.asMapItr
                java.lang.Object r0 = r0.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getKey()
                r2.currentKey = r1
                java.lang.Object r0 = r0.getValue()
                com.google.common.collect.ImmutableCollection r0 = (com.google.common.collect.ImmutableCollection) r0
                com.google.common.collect.UnmodifiableIterator r0 = r0.iterator()
                r2.valueItr = r0
            L22:
                java.lang.Object r0 = r2.currentKey
                java.util.Objects.requireNonNull(r0)
                java.util.Iterator<java.lang.Object> r1 = r2.valueItr
                java.lang.Object r1 = r1.next()
                java.util.Map$Entry r0 = com.google.common.collect.Maps.immutableEntry(r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableMultimap$2, reason: invalid class name */
    class AnonymousClass2 extends com.google.common.collect.UnmodifiableIterator<java.lang.Object> {
        public java.util.Iterator<? extends com.google.common.collect.ImmutableCollection<java.lang.Object>> valueCollectionItr;
        public java.util.Iterator<java.lang.Object> valueItr;

        public AnonymousClass2(com.google.common.collect.ImmutableMultimap r1) {
                r0 = this;
                r0.<init>()
                com.google.common.collect.ImmutableMap<K, ? extends com.google.common.collect.ImmutableCollection<V>> r1 = r1.map
                com.google.common.collect.ImmutableCollection r1 = r1.values()
                com.google.common.collect.UnmodifiableIterator r1 = r1.iterator()
                r0.valueCollectionItr = r1
                com.google.common.collect.UnmodifiableListIterator<java.lang.Object> r1 = com.google.common.collect.Iterators.ArrayItr.EMPTY
                r0.valueItr = r1
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                java.util.Iterator<java.lang.Object> r0 = r1.valueItr
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L13
                java.util.Iterator<? extends com.google.common.collect.ImmutableCollection<java.lang.Object>> r0 = r1.valueCollectionItr
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
        public java.lang.Object next() {
                r1 = this;
                java.util.Iterator<java.lang.Object> r0 = r1.valueItr
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L16
                java.util.Iterator<? extends com.google.common.collect.ImmutableCollection<java.lang.Object>> r0 = r1.valueCollectionItr
                java.lang.Object r0 = r0.next()
                com.google.common.collect.ImmutableCollection r0 = (com.google.common.collect.ImmutableCollection) r0
                com.google.common.collect.UnmodifiableIterator r0 = r0.iterator()
                r1.valueItr = r0
            L16:
                java.util.Iterator<java.lang.Object> r0 = r1.valueItr
                java.lang.Object r0 = r0.next()
                return r0
        }
    }

    @com.google.errorprone.annotations.DoNotMock
    public static class Builder<K, V> {
        public final java.util.Map<K, java.util.Collection<V>> builderMap;

        @javax.annotation.CheckForNull
        public java.util.Comparator<? super K> keyComparator;

        @javax.annotation.CheckForNull
        public java.util.Comparator<? super V> valueComparator;

        public Builder() {
                r1 = this;
                r1.<init>()
                com.google.common.collect.CompactHashMap r0 = com.google.common.collect.CompactHashMap.create()
                r1.builderMap = r0
                return
        }

        public com.google.common.collect.ImmutableMultimap<K, V> build() {
                r2 = this;
                java.util.Map<K, java.util.Collection<V>> r0 = r2.builderMap
                java.util.Set r0 = r0.entrySet()
                java.util.Comparator<? super K> r1 = r2.keyComparator
                if (r1 == 0) goto L16
                com.google.common.collect.Ordering r1 = com.google.common.collect.Ordering.from(r1)
                com.google.common.collect.Ordering r1 = r1.onKeys()
                com.google.common.collect.ImmutableList r0 = r1.immutableSortedCopy(r0)
            L16:
                java.util.Comparator<? super V> r1 = r2.valueComparator
                com.google.common.collect.ImmutableListMultimap r0 = com.google.common.collect.ImmutableListMultimap.fromMapEntries(r0, r1)
                return r0
        }

        public java.util.Collection<V> newMutableValueCollection() {
                r1 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableMultimap.Builder<K, V> orderKeysBy(java.util.Comparator<? super K> r1) {
                r0 = this;
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.util.Comparator r1 = (java.util.Comparator) r1
                r0.keyComparator = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableMultimap.Builder<K, V> orderValuesBy(java.util.Comparator<? super V> r1) {
                r0 = this;
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.util.Comparator r1 = (java.util.Comparator) r1
                r0.valueComparator = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableMultimap.Builder<K, V> put(K r3, V r4) {
                r2 = this;
                com.google.common.collect.CollectPreconditions.checkEntryNotNull(r3, r4)
                java.util.Map<K, java.util.Collection<V>> r0 = r2.builderMap
                java.lang.Object r0 = r0.get(r3)
                java.util.Collection r0 = (java.util.Collection) r0
                if (r0 != 0) goto L17
                java.util.Map<K, java.util.Collection<V>> r0 = r2.builderMap
                java.util.Collection r1 = r2.newMutableValueCollection()
                r0.put(r3, r1)
                r0 = r1
            L17:
                r0.add(r4)
                return r2
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableMultimap.Builder<K, V> put(java.util.Map.Entry<? extends K, ? extends V> r2) {
                r1 = this;
                java.lang.Object r0 = r2.getKey()
                java.lang.Object r2 = r2.getValue()
                com.google.common.collect.ImmutableMultimap$Builder r2 = r1.put(r0, r2)
                return r2
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableMultimap.Builder<K, V> putAll(com.google.common.collect.Multimap<? extends K, ? extends V> r3) {
                r2 = this;
                java.util.Map r3 = r3.asMap()
                java.util.Set r3 = r3.entrySet()
                java.util.Iterator r3 = r3.iterator()
            Lc:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L26
                java.lang.Object r0 = r3.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getKey()
                java.lang.Object r0 = r0.getValue()
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                r2.putAll(r1, r0)
                goto Lc
            L26:
                return r2
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @com.google.common.annotations.Beta
        public com.google.common.collect.ImmutableMultimap.Builder<K, V> putAll(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> r2) {
                r1 = this;
                java.util.Iterator r2 = r2.iterator()
            L4:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L14
                java.lang.Object r0 = r2.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                r1.put(r0)
                goto L4
            L14:
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableMultimap.Builder<K, V> putAll(K r3, java.lang.Iterable<? extends V> r4) {
                r2 = this;
                if (r3 != 0) goto L22
                java.lang.NullPointerException r3 = new java.lang.NullPointerException
                java.lang.String r0 = "null key in entry: null="
                java.lang.String r4 = com.google.common.collect.Iterables.toString(r4)
                java.lang.String r4 = java.lang.String.valueOf(r4)
                int r1 = r4.length()
                if (r1 == 0) goto L19
                java.lang.String r4 = r0.concat(r4)
                goto L1e
            L19:
                java.lang.String r4 = new java.lang.String
                r4.<init>(r0)
            L1e:
                r3.<init>(r4)
                throw r3
            L22:
                java.util.Map<K, java.util.Collection<V>> r0 = r2.builderMap
                java.lang.Object r0 = r0.get(r3)
                java.util.Collection r0 = (java.util.Collection) r0
                if (r0 == 0) goto L42
                java.util.Iterator r4 = r4.iterator()
            L30:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L41
                java.lang.Object r1 = r4.next()
                com.google.common.collect.CollectPreconditions.checkEntryNotNull(r3, r1)
                r0.add(r1)
                goto L30
            L41:
                return r2
            L42:
                java.util.Iterator r4 = r4.iterator()
                boolean r0 = r4.hasNext()
                if (r0 != 0) goto L4d
                return r2
            L4d:
                java.util.Collection r0 = r2.newMutableValueCollection()
            L51:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L62
                java.lang.Object r1 = r4.next()
                com.google.common.collect.CollectPreconditions.checkEntryNotNull(r3, r1)
                r0.add(r1)
                goto L51
            L62:
                java.util.Map<K, java.util.Collection<V>> r4 = r2.builderMap
                r4.put(r3, r0)
                return r2
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableMultimap.Builder<K, V> putAll(K r1, V... r2) {
                r0 = this;
                java.util.List r2 = java.util.Arrays.asList(r2)
                com.google.common.collect.ImmutableMultimap$Builder r1 = r0.putAll(r1, r2)
                return r1
        }
    }

    public static class EntryCollection<K, V> extends com.google.common.collect.ImmutableCollection<java.util.Map.Entry<K, V>> {
        private static final long serialVersionUID = 0;

        @com.google.j2objc.annotations.Weak
        public final com.google.common.collect.ImmutableMultimap<K, V> multimap;

        public EntryCollection(com.google.common.collect.ImmutableMultimap<K, V> r1) {
                r0 = this;
                r0.<init>()
                r0.multimap = r1
                return
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object r3) {
                r2 = this;
                boolean r0 = r3 instanceof java.util.Map.Entry
                if (r0 == 0) goto L15
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                com.google.common.collect.ImmutableMultimap<K, V> r0 = r2.multimap
                java.lang.Object r1 = r3.getKey()
                java.lang.Object r3 = r3.getValue()
                boolean r3 = r0.containsEntry(r1, r3)
                return r3
            L15:
                r3 = 0
                return r3
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean isPartialView() {
                r1 = this;
                com.google.common.collect.ImmutableMultimap<K, V> r0 = r1.multimap
                boolean r0 = r0.isPartialView()
                return r0
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, V>> iterator() {
                r2 = this;
                com.google.common.collect.ImmutableMultimap<K, V> r0 = r2.multimap
                java.util.Objects.requireNonNull(r0)
                com.google.common.collect.ImmutableMultimap$1 r1 = new com.google.common.collect.ImmutableMultimap$1
                r1.<init>(r0)
                return r1
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
                r1 = this;
                com.google.common.collect.UnmodifiableIterator r0 = r1.iterator()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
                r1 = this;
                com.google.common.collect.ImmutableMultimap<K, V> r0 = r1.multimap
                int r0 = r0.size()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @com.google.common.annotations.GwtIncompatible
    public static class FieldSettersHolder {
        public static final com.google.common.collect.Serialization.FieldSetter<com.google.common.collect.ImmutableMultimap> MAP_FIELD_SETTER = null;
        public static final com.google.common.collect.Serialization.FieldSetter<com.google.common.collect.ImmutableMultimap> SIZE_FIELD_SETTER = null;

        static {
                java.lang.Class<com.google.common.collect.ImmutableMultimap> r0 = com.google.common.collect.ImmutableMultimap.class
                java.lang.String r1 = "map"
                com.google.common.collect.Serialization$FieldSetter r0 = com.google.common.collect.Serialization.getFieldSetter(r0, r1)
                com.google.common.collect.ImmutableMultimap.FieldSettersHolder.MAP_FIELD_SETTER = r0
                java.lang.Class<com.google.common.collect.ImmutableMultimap> r0 = com.google.common.collect.ImmutableMultimap.class
                java.lang.String r1 = "size"
                com.google.common.collect.Serialization$FieldSetter r0 = com.google.common.collect.Serialization.getFieldSetter(r0, r1)
                com.google.common.collect.ImmutableMultimap.FieldSettersHolder.SIZE_FIELD_SETTER = r0
                return
        }

        public FieldSettersHolder() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public class Keys extends com.google.common.collect.ImmutableMultiset<K> {
        public final /* synthetic */ com.google.common.collect.ImmutableMultimap this$0;

        public Keys(com.google.common.collect.ImmutableMultimap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.ImmutableMultimap r0 = r1.this$0
                boolean r2 = r0.containsKey(r2)
                return r2
        }

        @Override // com.google.common.collect.Multiset
        public int count(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.ImmutableMultimap r0 = r1.this$0
                com.google.common.collect.ImmutableMap<K, ? extends com.google.common.collect.ImmutableCollection<V>> r0 = r0.map
                java.lang.Object r2 = r0.get(r2)
                java.util.Collection r2 = (java.util.Collection) r2
                if (r2 != 0) goto Le
                r2 = 0
                goto L12
            Le:
                int r2 = r2.size()
            L12:
                return r2
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
        public com.google.common.collect.ImmutableSet<K> elementSet() {
                r1 = this;
                com.google.common.collect.ImmutableMultimap r0 = r1.this$0
                com.google.common.collect.ImmutableSet r0 = r0.keySet()
                return r0
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
        public /* bridge */ /* synthetic */ java.util.Set elementSet() {
                r1 = this;
                com.google.common.collect.ImmutableSet r0 = r1.elementSet()
                return r0
        }

        @Override // com.google.common.collect.ImmutableMultiset
        public final com.google.common.collect.Multiset.Entry<K> getEntry(int r2) {
                r1 = this;
                com.google.common.collect.ImmutableMultimap r0 = r1.this$0
                com.google.common.collect.ImmutableMap<K, ? extends com.google.common.collect.ImmutableCollection<V>> r0 = r0.map
                com.google.common.collect.ImmutableSet r0 = r0.entrySet()
                com.google.common.collect.ImmutableList r0 = r0.asList()
                java.lang.Object r2 = r0.get(r2)
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                java.lang.Object r0 = r2.getKey()
                java.lang.Object r2 = r2.getValue()
                java.util.Collection r2 = (java.util.Collection) r2
                int r2 = r2.size()
                com.google.common.collect.Multiset$Entry r2 = com.google.common.collect.Multisets.immutableEntry(r0, r2)
                return r2
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean isPartialView() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public int size() {
                r1 = this;
                com.google.common.collect.ImmutableMultimap r0 = r1.this$0
                int r0 = r0.size()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @com.google.common.annotations.GwtIncompatible
    public static final class KeysSerializedForm implements java.io.Serializable {
    }

    public static final class Values<K, V> extends com.google.common.collect.ImmutableCollection<V> {
        private static final long serialVersionUID = 0;

        @com.google.j2objc.annotations.Weak
        private final transient com.google.common.collect.ImmutableMultimap<K, V> multimap;

        public Values(com.google.common.collect.ImmutableMultimap<K, V> r1) {
                r0 = this;
                r0.<init>()
                r0.multimap = r1
                return
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.ImmutableMultimap<K, V> r0 = r1.multimap
                boolean r2 = r0.containsValue(r2)
                return r2
        }

        @Override // com.google.common.collect.ImmutableCollection
        @com.google.common.annotations.GwtIncompatible
        public final int copyIntoArray(java.lang.Object[] r3, int r4) {
                r2 = this;
                com.google.common.collect.ImmutableMultimap<K, V> r0 = r2.multimap
                com.google.common.collect.ImmutableMap<K, ? extends com.google.common.collect.ImmutableCollection<V>> r0 = r0.map
                com.google.common.collect.ImmutableCollection r0 = r0.values()
                com.google.common.collect.UnmodifiableIterator r0 = r0.iterator()
            Lc:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1d
                java.lang.Object r1 = r0.next()
                com.google.common.collect.ImmutableCollection r1 = (com.google.common.collect.ImmutableCollection) r1
                int r4 = r1.copyIntoArray(r3, r4)
                goto Lc
            L1d:
                return r4
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean isPartialView() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public com.google.common.collect.UnmodifiableIterator<V> iterator() {
                r2 = this;
                com.google.common.collect.ImmutableMultimap<K, V> r0 = r2.multimap
                java.util.Objects.requireNonNull(r0)
                com.google.common.collect.ImmutableMultimap$2 r1 = new com.google.common.collect.ImmutableMultimap$2
                r1.<init>(r0)
                return r1
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
                r1 = this;
                com.google.common.collect.UnmodifiableIterator r0 = r1.iterator()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
                r1 = this;
                com.google.common.collect.ImmutableMultimap<K, V> r0 = r1.multimap
                int r0 = r0.size()
                return r0
        }
    }

    public ImmutableMultimap(com.google.common.collect.ImmutableMap<K, ? extends com.google.common.collect.ImmutableCollection<V>> r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.map = r1
            r0.size = r2
            return
    }

    public static <K, V> com.google.common.collect.ImmutableMultimap.Builder<K, V> builder() {
            com.google.common.collect.ImmutableMultimap$Builder r0 = new com.google.common.collect.ImmutableMultimap$Builder
            r0.<init>()
            return r0
    }

    public static <K, V> com.google.common.collect.ImmutableMultimap<K, V> copyOf(com.google.common.collect.Multimap<? extends K, ? extends V> r2) {
            boolean r0 = r2 instanceof com.google.common.collect.ImmutableMultimap
            if (r0 == 0) goto Le
            r0 = r2
            com.google.common.collect.ImmutableMultimap r0 = (com.google.common.collect.ImmutableMultimap) r0
            boolean r1 = r0.isPartialView()
            if (r1 != 0) goto Le
            return r0
        Le:
            com.google.common.collect.ImmutableListMultimap r2 = com.google.common.collect.ImmutableListMultimap.copyOf(r2)
            return r2
    }

    @com.google.common.annotations.Beta
    public static <K, V> com.google.common.collect.ImmutableMultimap<K, V> copyOf(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> r0) {
            com.google.common.collect.ImmutableListMultimap r0 = com.google.common.collect.ImmutableListMultimap.copyOf(r0)
            return r0
    }

    public static <K, V> com.google.common.collect.ImmutableMultimap<K, V> of() {
            com.google.common.collect.ImmutableListMultimap r0 = com.google.common.collect.ImmutableListMultimap.of()
            return r0
    }

    public static <K, V> com.google.common.collect.ImmutableMultimap<K, V> of(K r0, V r1) {
            com.google.common.collect.ImmutableListMultimap r0 = com.google.common.collect.ImmutableListMultimap.of(r0, r1)
            return r0
    }

    public static <K, V> com.google.common.collect.ImmutableMultimap<K, V> of(K r0, V r1, K r2, V r3) {
            com.google.common.collect.ImmutableListMultimap r0 = com.google.common.collect.ImmutableListMultimap.of(r0, r1, r2, r3)
            return r0
    }

    public static <K, V> com.google.common.collect.ImmutableMultimap<K, V> of(K r0, V r1, K r2, V r3, K r4, V r5) {
            com.google.common.collect.ImmutableListMultimap r0 = com.google.common.collect.ImmutableListMultimap.of(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static <K, V> com.google.common.collect.ImmutableMultimap<K, V> of(K r0, V r1, K r2, V r3, K r4, V r5, K r6, V r7) {
            com.google.common.collect.ImmutableListMultimap r0 = com.google.common.collect.ImmutableListMultimap.of(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    public static <K, V> com.google.common.collect.ImmutableMultimap<K, V> of(K r0, V r1, K r2, V r3, K r4, V r5, K r6, V r7, K r8, V r9) {
            com.google.common.collect.ImmutableListMultimap r0 = com.google.common.collect.ImmutableListMultimap.of(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public com.google.common.collect.ImmutableMap<K, java.util.Collection<V>> asMap() {
            r1 = this;
            com.google.common.collect.ImmutableMap<K, ? extends com.google.common.collect.ImmutableCollection<V>> r0 = r1.map
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ java.util.Map asMap() {
            r1 = this;
            com.google.common.collect.ImmutableMap r0 = r1.asMap()
            return r0
    }

    @Override // com.google.common.collect.Multimap
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public final void clear() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean containsEntry(@javax.annotation.CheckForNull java.lang.Object r1, @javax.annotation.CheckForNull java.lang.Object r2) {
            r0 = this;
            boolean r1 = super.containsEntry(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            com.google.common.collect.ImmutableMap<K, ? extends com.google.common.collect.ImmutableCollection<V>> r0 = r1.map
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
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

    @Override // com.google.common.collect.AbstractMultimap
    public final java.util.Map<K, java.util.Collection<V>> createAsMap() {
            r2 = this;
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "should never be called"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final java.util.Collection createEntries() {
            r1 = this;
            com.google.common.collect.ImmutableMultimap$EntryCollection r0 = new com.google.common.collect.ImmutableMultimap$EntryCollection
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final java.util.Set<K> createKeySet() {
            r2 = this;
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "unreachable"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final com.google.common.collect.Multiset createKeys() {
            r1 = this;
            com.google.common.collect.ImmutableMultimap$Keys r0 = new com.google.common.collect.ImmutableMultimap$Keys
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final java.util.Collection createValues() {
            r1 = this;
            com.google.common.collect.ImmutableMultimap$Values r0 = new com.google.common.collect.ImmutableMultimap$Values
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public com.google.common.collect.ImmutableCollection<java.util.Map.Entry<K, V>> entries() {
            r1 = this;
            java.util.Collection r0 = super.entries()
            com.google.common.collect.ImmutableCollection r0 = (com.google.common.collect.ImmutableCollection) r0
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Collection entries() {
            r1 = this;
            com.google.common.collect.ImmutableCollection r0 = r1.entries()
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final java.util.Iterator entryIterator() {
            r1 = this;
            com.google.common.collect.ImmutableMultimap$1 r0 = new com.google.common.collect.ImmutableMultimap$1
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ boolean equals(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.equals(r1)
            return r1
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public abstract com.google.common.collect.ImmutableCollection<V> get(K r1);

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ java.util.Collection get(java.lang.Object r1) {
            r0 = this;
            com.google.common.collect.ImmutableCollection r1 = r0.get(r1)
            return r1
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ int hashCode() {
            r1 = this;
            int r0 = super.hashCode()
            return r0
    }

    public abstract com.google.common.collect.ImmutableMultimap<V, K> inverse();

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean isEmpty() {
            r1 = this;
            boolean r0 = super.isEmpty()
            return r0
    }

    public final boolean isPartialView() {
            r1 = this;
            com.google.common.collect.ImmutableMap<K, ? extends com.google.common.collect.ImmutableCollection<V>> r0 = r1.map
            boolean r0 = r0.isPartialView()
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public com.google.common.collect.ImmutableSet<K> keySet() {
            r1 = this;
            com.google.common.collect.ImmutableMap<K, ? extends com.google.common.collect.ImmutableCollection<V>> r0 = r1.map
            com.google.common.collect.ImmutableSet r0 = r0.keySet()
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Set keySet() {
            r1 = this;
            com.google.common.collect.ImmutableSet r0 = r1.keySet()
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public com.google.common.collect.ImmutableMultiset<K> keys() {
            r1 = this;
            com.google.common.collect.Multiset r0 = super.keys()
            com.google.common.collect.ImmutableMultiset r0 = (com.google.common.collect.ImmutableMultiset) r0
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ com.google.common.collect.Multiset keys() {
            r1 = this;
            com.google.common.collect.ImmutableMultiset r0 = r1.keys()
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public final boolean put(K r1, V r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public final boolean putAll(com.google.common.collect.Multimap<? extends K, ? extends V> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public final boolean putAll(K r1, java.lang.Iterable<? extends V> r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public final boolean remove(@javax.annotation.CheckForNull java.lang.Object r1, @javax.annotation.CheckForNull java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public com.google.common.collect.ImmutableCollection<V> removeAll(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ java.util.Collection removeAll(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            com.google.common.collect.ImmutableCollection r1 = r0.removeAll(r1)
            return r1
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public com.google.common.collect.ImmutableCollection<V> replaceValues(K r1, java.lang.Iterable<? extends V> r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ java.util.Collection replaceValues(java.lang.Object r1, java.lang.Iterable r2) {
            r0 = this;
            com.google.common.collect.ImmutableCollection r1 = r0.replaceValues(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
            r1 = this;
            int r0 = r1.size
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap
    public /* bridge */ /* synthetic */ java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = super.toString()
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final java.util.Iterator valueIterator() {
            r1 = this;
            com.google.common.collect.ImmutableMultimap$2 r0 = new com.google.common.collect.ImmutableMultimap$2
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public com.google.common.collect.ImmutableCollection<V> values() {
            r1 = this;
            java.util.Collection r0 = super.values()
            com.google.common.collect.ImmutableCollection r0 = (com.google.common.collect.ImmutableCollection) r0
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Collection values() {
            r1 = this;
            com.google.common.collect.ImmutableCollection r0 = r1.values()
            return r0
    }
}
