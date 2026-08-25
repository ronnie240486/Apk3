package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible(emulated = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class Maps {

    /* JADX INFO: renamed from: com.google.common.collect.Maps$1, reason: invalid class name */
    class AnonymousClass1 extends com.google.common.collect.TransformedIterator<java.util.Map.Entry<java.lang.Object, java.lang.Object>, java.lang.Object> {
        public AnonymousClass1(java.util.Iterator r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.collect.TransformedIterator
        @com.google.common.collect.ParametricNullness
        public final java.lang.Object transform(java.util.Map.Entry<java.lang.Object, java.lang.Object> r1) {
                r0 = this;
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r1 = r1.getKey()
                return r1
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Maps$10, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    class AnonymousClass10 implements com.google.common.base.Function<java.lang.Object, java.lang.Object> {
        public final /* synthetic */ java.lang.Object val$key;
        public final /* synthetic */ com.google.common.collect.Maps.EntryTransformer val$transformer;

        public AnonymousClass10(com.google.common.collect.Maps.EntryTransformer r1, java.lang.Object r2) {
                r0 = this;
                r0.val$transformer = r1
                r0.val$key = r2
                r0.<init>()
                return
        }

        @Override // com.google.common.base.Function
        @com.google.common.collect.ParametricNullness
        public java.lang.Object apply(@com.google.common.collect.ParametricNullness java.lang.Object r3) {
                r2 = this;
                com.google.common.collect.Maps$EntryTransformer r0 = r2.val$transformer
                java.lang.Object r1 = r2.val$key
                java.lang.Object r3 = r0.transformEntry(r1, r3)
                return r3
        }
    }


    /* JADX INFO: renamed from: com.google.common.collect.Maps$12, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    class AnonymousClass12 extends com.google.common.collect.AbstractMapEntry<java.lang.Object, java.lang.Object> {
        public final /* synthetic */ java.util.Map.Entry val$entry;
        public final /* synthetic */ com.google.common.collect.Maps.EntryTransformer val$transformer;

        public AnonymousClass12(java.util.Map.Entry r1, com.google.common.collect.Maps.EntryTransformer r2) {
                r0 = this;
                r0.val$entry = r1
                r0.val$transformer = r2
                r0.<init>()
                return
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @com.google.common.collect.ParametricNullness
        public java.lang.Object getKey() {
                r1 = this;
                java.util.Map$Entry r0 = r1.val$entry
                java.lang.Object r0 = r0.getKey()
                return r0
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @com.google.common.collect.ParametricNullness
        public java.lang.Object getValue() {
                r3 = this;
                com.google.common.collect.Maps$EntryTransformer r0 = r3.val$transformer
                java.util.Map$Entry r1 = r3.val$entry
                java.lang.Object r1 = r1.getKey()
                java.util.Map$Entry r2 = r3.val$entry
                java.lang.Object r2 = r2.getValue()
                java.lang.Object r0 = r0.transformEntry(r1, r2)
                return r0
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Maps$13, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    class AnonymousClass13 implements com.google.common.base.Function<java.util.Map.Entry<java.lang.Object, java.lang.Object>, java.util.Map.Entry<java.lang.Object, java.lang.Object>> {
        public final /* synthetic */ com.google.common.collect.Maps.EntryTransformer val$transformer;

        public AnonymousClass13(com.google.common.collect.Maps.EntryTransformer r1) {
                r0 = this;
                r0.val$transformer = r1
                r0.<init>()
                return
        }

        @Override // com.google.common.base.Function
        public /* bridge */ /* synthetic */ java.util.Map.Entry<java.lang.Object, java.lang.Object> apply(java.util.Map.Entry<java.lang.Object, java.lang.Object> r1) {
                r0 = this;
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.util.Map$Entry r1 = r0.apply2(r1)
                return r1
        }

        /* JADX INFO: renamed from: apply, reason: avoid collision after fix types in other method */
        public java.util.Map.Entry<java.lang.Object, java.lang.Object> apply2(java.util.Map.Entry<java.lang.Object, java.lang.Object> r3) {
                r2 = this;
                com.google.common.collect.Maps$EntryTransformer r0 = r2.val$transformer
                com.google.common.base.Preconditions.checkNotNull(r0)
                com.google.common.base.Preconditions.checkNotNull(r3)
                com.google.common.collect.Maps$12 r1 = new com.google.common.collect.Maps$12
                r1.<init>(r3, r0)
                return r1
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Maps$2, reason: invalid class name */
    class AnonymousClass2 extends com.google.common.collect.TransformedIterator<java.util.Map.Entry<java.lang.Object, java.lang.Object>, java.lang.Object> {
        public AnonymousClass2(java.util.Iterator r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.collect.TransformedIterator
        @com.google.common.collect.ParametricNullness
        public final java.lang.Object transform(java.util.Map.Entry<java.lang.Object, java.lang.Object> r1) {
                r0 = this;
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r1 = r1.getValue()
                return r1
        }
    }






    /* JADX INFO: renamed from: com.google.common.collect.Maps$8, reason: invalid class name */
    class AnonymousClass8 extends com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<java.lang.Object, java.lang.Object>> {
        public final /* synthetic */ java.util.Iterator val$entryIterator;

        public AnonymousClass8(java.util.Iterator r1) {
                r0 = this;
                r0.val$entryIterator = r1
                r0.<init>()
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                java.util.Iterator r0 = r1.val$entryIterator
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
        public java.util.Map.Entry<java.lang.Object, java.lang.Object> next() {
                r1 = this;
                java.util.Iterator r0 = r1.val$entryIterator
                java.lang.Object r0 = r0.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.util.Map$Entry r0 = com.google.common.collect.Maps.unmodifiableEntry(r0)
                return r0
        }
    }


    public static abstract class AbstractFilteredMap<K, V> extends com.google.common.collect.Maps.ViewCachingAbstractMap<K, V> {
        public final com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> predicate;
        public final java.util.Map<K, V> unfiltered;

        public AbstractFilteredMap(java.util.Map<K, V> r1, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> r2) {
                r0 = this;
                r0.<init>()
                r0.unfiltered = r1
                r0.predicate = r2
                return
        }

        public final boolean apply(@javax.annotation.CheckForNull java.lang.Object r2, @com.google.common.collect.ParametricNullness V r3) {
                r1 = this;
                com.google.common.base.Predicate<? super java.util.Map$Entry<K, V>> r0 = r1.predicate
                java.util.Map$Entry r2 = com.google.common.collect.Maps.immutableEntry(r2, r3)
                boolean r2 = r0.apply(r2)
                return r2
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                java.util.Map<K, V> r0 = r1.unfiltered
                boolean r0 = r0.containsKey(r2)
                if (r0 == 0) goto L16
                java.util.Map<K, V> r0 = r1.unfiltered
                java.lang.Object r0 = r0.get(r2)
                boolean r2 = r1.apply(r2, r0)
                if (r2 == 0) goto L16
                r2 = 1
                goto L17
            L16:
                r2 = 0
            L17:
                return r2
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final java.util.Collection<V> createValues() {
                r3 = this;
                com.google.common.collect.Maps$FilteredMapValues r0 = new com.google.common.collect.Maps$FilteredMapValues
                java.util.Map<K, V> r1 = r3.unfiltered
                com.google.common.base.Predicate<? super java.util.Map$Entry<K, V>> r2 = r3.predicate
                r0.<init>(r3, r1, r2)
                return r0
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public V get(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                java.util.Map<K, V> r0 = r1.unfiltered
                java.lang.Object r0 = r0.get(r2)
                if (r0 == 0) goto Lf
                boolean r2 = r1.apply(r2, r0)
                if (r2 == 0) goto Lf
                goto L10
            Lf:
                r0 = 0
            L10:
                return r0
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
                r1 = this;
                java.util.Set r0 = r1.entrySet()
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public V put(@com.google.common.collect.ParametricNullness K r2, @com.google.common.collect.ParametricNullness V r3) {
                r1 = this;
                boolean r0 = r1.apply(r2, r3)
                com.google.common.base.Preconditions.checkArgument(r0)
                java.util.Map<K, V> r0 = r1.unfiltered
                java.lang.Object r2 = r0.put(r2, r3)
                return r2
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void putAll(java.util.Map<? extends K, ? extends V> r4) {
                r3 = this;
                java.util.Set r0 = r4.entrySet()
                java.util.Iterator r0 = r0.iterator()
            L8:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L24
                java.lang.Object r1 = r0.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                java.lang.Object r1 = r1.getValue()
                boolean r1 = r3.apply(r2, r1)
                com.google.common.base.Preconditions.checkArgument(r1)
                goto L8
            L24:
                java.util.Map<K, V> r0 = r3.unfiltered
                r0.putAll(r4)
                return
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public V remove(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                boolean r0 = r1.containsKey(r2)
                if (r0 == 0) goto Ld
                java.util.Map<K, V> r0 = r1.unfiltered
                java.lang.Object r2 = r0.remove(r2)
                goto Le
            Ld:
                r2 = 0
            Le:
                return r2
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class AsMapView<K, V> extends com.google.common.collect.Maps.ViewCachingAbstractMap<K, V> {
        public final com.google.common.base.Function<? super K, V> function;
        private final java.util.Set<K> set;


        public AsMapView(java.util.Set<K> r1, com.google.common.base.Function<? super K, V> r2) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.util.Set r1 = (java.util.Set) r1
                r0.set = r1
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                com.google.common.base.Function r1 = (com.google.common.base.Function) r1
                r0.function = r1
                return
        }

        public java.util.Set<K> backingSet() {
                r1 = this;
                java.util.Set<K> r0 = r1.set
                return r0
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
                r1 = this;
                java.util.Set r0 = r1.backingSet()
                r0.clear()
                return
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                java.util.Set r0 = r1.backingSet()
                boolean r2 = r0.contains(r2)
                return r2
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final java.util.Set<java.util.Map.Entry<K, V>> createEntrySet() {
                r1 = this;
                com.google.common.collect.Maps$AsMapView$1EntrySetImpl r0 = new com.google.common.collect.Maps$AsMapView$1EntrySetImpl
                r0.<init>(r1)
                return r0
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public java.util.Set<K> createKeySet() {
                r1 = this;
                java.util.Set r0 = r1.backingSet()
                java.util.Set r0 = com.google.common.collect.Maps.access$200(r0)
                return r0
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final java.util.Collection<V> createValues() {
                r2 = this;
                java.util.Set<K> r0 = r2.set
                com.google.common.base.Function<? super K, V> r1 = r2.function
                java.util.Collection r0 = com.google.common.collect.Collections2.transform(r0, r1)
                return r0
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public V get(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                java.util.Set r0 = r1.backingSet()
                boolean r0 = com.google.common.collect.Collections2.safeContains(r0, r2)
                if (r0 == 0) goto L11
                com.google.common.base.Function<? super K, V> r0 = r1.function
                java.lang.Object r2 = r0.apply(r2)
                return r2
            L11:
                r2 = 0
                return r2
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public V remove(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                java.util.Set r0 = r1.backingSet()
                boolean r0 = r0.remove(r2)
                if (r0 == 0) goto L11
                com.google.common.base.Function<? super K, V> r0 = r1.function
                java.lang.Object r2 = r0.apply(r2)
                return r2
            L11:
                r2 = 0
                return r2
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
                r1 = this;
                java.util.Set r0 = r1.backingSet()
                int r0 = r0.size()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class BiMapConverter<A, B> extends com.google.common.base.Converter<A, B> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final com.google.common.collect.BiMap<A, B> bimap;

        public BiMapConverter(com.google.common.collect.BiMap<A, B> r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.collect.BiMap r1 = (com.google.common.collect.BiMap) r1
                r0.bimap = r1
                return
        }

        private static <X, Y> Y convert(com.google.common.collect.BiMap<X, Y> r2, X r3) {
                java.lang.Object r2 = r2.get(r3)
                if (r2 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                java.lang.String r1 = "No non-null mapping present for input: %s"
                com.google.common.base.Preconditions.checkArgument(r0, r1, r3)
                return r2
        }

        @Override // com.google.common.base.Converter
        public final A doBackward(B r2) {
                r1 = this;
                com.google.common.collect.BiMap<A, B> r0 = r1.bimap
                com.google.common.collect.BiMap r0 = r0.inverse()
                java.lang.Object r2 = convert(r0, r2)
                return r2
        }

        @Override // com.google.common.base.Converter
        public final B doForward(A r2) {
                r1 = this;
                com.google.common.collect.BiMap<A, B> r0 = r1.bimap
                java.lang.Object r2 = convert(r0, r2)
                return r2
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof com.google.common.collect.Maps.BiMapConverter
                if (r0 == 0) goto Lf
                com.google.common.collect.Maps$BiMapConverter r2 = (com.google.common.collect.Maps.BiMapConverter) r2
                com.google.common.collect.BiMap<A, B> r0 = r1.bimap
                com.google.common.collect.BiMap<A, B> r2 = r2.bimap
                boolean r2 = r0.equals(r2)
                return r2
            Lf:
                r2 = 0
                return r2
        }

        public int hashCode() {
                r1 = this;
                com.google.common.collect.BiMap<A, B> r0 = r1.bimap
                int r0 = r0.hashCode()
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                com.google.common.collect.BiMap<A, B> r0 = r4.bimap
                java.lang.String r0 = java.lang.String.valueOf(r0)
                int r1 = r0.length()
                int r1 = r1 + 18
                java.lang.String r2 = "Maps.asConverter("
                java.lang.String r3 = ")"
                java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r0, r3)
                return r0
        }
    }

    @com.google.common.annotations.GwtIncompatible
    public static abstract class DescendingMap<K, V> extends com.google.common.collect.ForwardingMap<K, V> implements java.util.NavigableMap<K, V> {

        @javax.annotation.CheckForNull
        private transient java.util.Comparator<? super K> comparator;

        @javax.annotation.CheckForNull
        private transient java.util.Set<java.util.Map.Entry<K, V>> entrySet;

        @javax.annotation.CheckForNull
        private transient java.util.NavigableSet<K> navigableKeySet;


        public DescendingMap() {
                r0 = this;
                r0.<init>()
                return
        }

        private static <T> com.google.common.collect.Ordering<T> reverse(java.util.Comparator<T> r0) {
                com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.from(r0)
                com.google.common.collect.Ordering r0 = r0.reverse()
                return r0
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V> ceilingEntry(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                java.util.NavigableMap r0 = r1.forward()
                java.util.Map$Entry r2 = r0.floorEntry(r2)
                return r2
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public K ceilingKey(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                java.util.NavigableMap r0 = r1.forward()
                java.lang.Object r2 = r0.floorKey(r2)
                return r2
        }

        @Override // java.util.SortedMap
        public java.util.Comparator<? super K> comparator() {
                r1 = this;
                java.util.Comparator<? super K> r0 = r1.comparator
                if (r0 != 0) goto L18
                java.util.NavigableMap r0 = r1.forward()
                java.util.Comparator r0 = r0.comparator()
                if (r0 != 0) goto L12
                com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.natural()
            L12:
                com.google.common.collect.Ordering r0 = reverse(r0)
                r1.comparator = r0
            L18:
                return r0
        }

        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public final java.lang.Object delegate() {
                r1 = this;
                java.util.NavigableMap r0 = r1.forward()
                return r0
        }

        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public final java.util.Map<K, V> delegate() {
                r1 = this;
                java.util.NavigableMap r0 = r1.forward()
                return r0
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableSet<K> descendingKeySet() {
                r1 = this;
                java.util.NavigableMap r0 = r1.forward()
                java.util.NavigableSet r0 = r0.navigableKeySet()
                return r0
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, V> descendingMap() {
                r1 = this;
                java.util.NavigableMap r0 = r1.forward()
                return r0
        }

        public abstract java.util.Iterator<java.util.Map.Entry<K, V>> entryIterator();

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
                r1 = this;
                java.util.Set<java.util.Map$Entry<K, V>> r0 = r1.entrySet
                if (r0 != 0) goto Lb
                com.google.common.collect.Maps$DescendingMap$1EntrySetImpl r0 = new com.google.common.collect.Maps$DescendingMap$1EntrySetImpl
                r0.<init>(r1)
                r1.entrySet = r0
            Lb:
                return r0
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V> firstEntry() {
                r1 = this;
                java.util.NavigableMap r0 = r1.forward()
                java.util.Map$Entry r0 = r0.lastEntry()
                return r0
        }

        @Override // java.util.SortedMap
        @com.google.common.collect.ParametricNullness
        public K firstKey() {
                r1 = this;
                java.util.NavigableMap r0 = r1.forward()
                java.lang.Object r0 = r0.lastKey()
                return r0
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V> floorEntry(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                java.util.NavigableMap r0 = r1.forward()
                java.util.Map$Entry r2 = r0.ceilingEntry(r2)
                return r2
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public K floorKey(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                java.util.NavigableMap r0 = r1.forward()
                java.lang.Object r2 = r0.ceilingKey(r2)
                return r2
        }

        public abstract java.util.NavigableMap<K, V> forward();

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, V> headMap(@com.google.common.collect.ParametricNullness K r2, boolean r3) {
                r1 = this;
                java.util.NavigableMap r0 = r1.forward()
                java.util.NavigableMap r2 = r0.tailMap(r2, r3)
                java.util.NavigableMap r2 = r2.descendingMap()
                return r2
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public java.util.SortedMap<K, V> headMap(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                r0 = 0
                java.util.NavigableMap r2 = r1.headMap(r2, r0)
                return r2
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V> higherEntry(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                java.util.NavigableMap r0 = r1.forward()
                java.util.Map$Entry r2 = r0.lowerEntry(r2)
                return r2
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public K higherKey(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                java.util.NavigableMap r0 = r1.forward()
                java.lang.Object r2 = r0.lowerKey(r2)
                return r2
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public java.util.Set<K> keySet() {
                r1 = this;
                java.util.NavigableSet r0 = r1.navigableKeySet()
                return r0
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V> lastEntry() {
                r1 = this;
                java.util.NavigableMap r0 = r1.forward()
                java.util.Map$Entry r0 = r0.firstEntry()
                return r0
        }

        @Override // java.util.SortedMap
        @com.google.common.collect.ParametricNullness
        public K lastKey() {
                r1 = this;
                java.util.NavigableMap r0 = r1.forward()
                java.lang.Object r0 = r0.firstKey()
                return r0
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V> lowerEntry(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                java.util.NavigableMap r0 = r1.forward()
                java.util.Map$Entry r2 = r0.higherEntry(r2)
                return r2
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public K lowerKey(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                java.util.NavigableMap r0 = r1.forward()
                java.lang.Object r2 = r0.higherKey(r2)
                return r2
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableSet<K> navigableKeySet() {
                r1 = this;
                java.util.NavigableSet<K> r0 = r1.navigableKeySet
                if (r0 != 0) goto Lb
                com.google.common.collect.Maps$NavigableKeySet r0 = new com.google.common.collect.Maps$NavigableKeySet
                r0.<init>(r1)
                r1.navigableKeySet = r0
            Lb:
                return r0
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V> pollFirstEntry() {
                r1 = this;
                java.util.NavigableMap r0 = r1.forward()
                java.util.Map$Entry r0 = r0.pollLastEntry()
                return r0
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V> pollLastEntry() {
                r1 = this;
                java.util.NavigableMap r0 = r1.forward()
                java.util.Map$Entry r0 = r0.pollFirstEntry()
                return r0
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, V> subMap(@com.google.common.collect.ParametricNullness K r2, boolean r3, @com.google.common.collect.ParametricNullness K r4, boolean r5) {
                r1 = this;
                java.util.NavigableMap r0 = r1.forward()
                java.util.NavigableMap r2 = r0.subMap(r4, r5, r2, r3)
                java.util.NavigableMap r2 = r2.descendingMap()
                return r2
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public java.util.SortedMap<K, V> subMap(@com.google.common.collect.ParametricNullness K r3, @com.google.common.collect.ParametricNullness K r4) {
                r2 = this;
                r0 = 1
                r1 = 0
                java.util.NavigableMap r3 = r2.subMap(r3, r0, r4, r1)
                return r3
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, V> tailMap(@com.google.common.collect.ParametricNullness K r2, boolean r3) {
                r1 = this;
                java.util.NavigableMap r0 = r1.forward()
                java.util.NavigableMap r2 = r0.headMap(r2, r3)
                java.util.NavigableMap r2 = r2.descendingMap()
                return r2
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public java.util.SortedMap<K, V> tailMap(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                r0 = 1
                java.util.NavigableMap r2 = r1.tailMap(r2, r0)
                return r2
        }

        @Override // com.google.common.collect.ForwardingObject
        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = com.google.common.collect.Maps.toStringImpl(r1)
                return r0
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
        public java.util.Collection<V> values() {
                r1 = this;
                com.google.common.collect.Maps$Values r0 = new com.google.common.collect.Maps$Values
                r0.<init>(r1)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static abstract enum EntryFunction extends java.lang.Enum<com.google.common.collect.Maps.EntryFunction> implements com.google.common.base.Function<java.util.Map.Entry<?, ?>, java.lang.Object> {
        private static final /* synthetic */ com.google.common.collect.Maps.EntryFunction[] $VALUES = null;
        public static final com.google.common.collect.Maps.EntryFunction KEY = null;
        public static final com.google.common.collect.Maps.EntryFunction VALUE = null;



        private static /* synthetic */ com.google.common.collect.Maps.EntryFunction[] $values() {
                r0 = 2
                com.google.common.collect.Maps$EntryFunction[] r0 = new com.google.common.collect.Maps.EntryFunction[r0]
                com.google.common.collect.Maps$EntryFunction r1 = com.google.common.collect.Maps.EntryFunction.KEY
                r2 = 0
                r0[r2] = r1
                com.google.common.collect.Maps$EntryFunction r1 = com.google.common.collect.Maps.EntryFunction.VALUE
                r2 = 1
                r0[r2] = r1
                return r0
        }

        static {
                com.google.common.collect.Maps$EntryFunction$1 r0 = new com.google.common.collect.Maps$EntryFunction$1
                r0.<init>()
                com.google.common.collect.Maps.EntryFunction.KEY = r0
                com.google.common.collect.Maps$EntryFunction$2 r0 = new com.google.common.collect.Maps$EntryFunction$2
                r0.<init>()
                com.google.common.collect.Maps.EntryFunction.VALUE = r0
                com.google.common.collect.Maps$EntryFunction[] r0 = $values()
                com.google.common.collect.Maps.EntryFunction.$VALUES = r0
                return
        }

        private EntryFunction(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public /* synthetic */ EntryFunction(java.lang.String r1, int r2, com.google.common.collect.Maps.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.collect.Maps.EntryFunction valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.collect.Maps$EntryFunction> r0 = com.google.common.collect.Maps.EntryFunction.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.collect.Maps$EntryFunction r1 = (com.google.common.collect.Maps.EntryFunction) r1
                return r1
        }

        public static com.google.common.collect.Maps.EntryFunction[] values() {
                com.google.common.collect.Maps$EntryFunction[] r0 = com.google.common.collect.Maps.EntryFunction.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.collect.Maps$EntryFunction[] r0 = (com.google.common.collect.Maps.EntryFunction[]) r0
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class EntrySet<K, V> extends com.google.common.collect.Sets.ImprovedAbstractSet<java.util.Map.Entry<K, V>> {
        public EntrySet() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
                r1 = this;
                java.util.Map r0 = r1.map()
                r0.clear()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L2a
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r0 = r4.getKey()
                java.util.Map r2 = r3.map()
                java.lang.Object r2 = com.google.common.collect.Maps.safeGet(r2, r0)
                java.lang.Object r4 = r4.getValue()
                boolean r4 = com.google.common.base.Objects.equal(r2, r4)
                if (r4 == 0) goto L2a
                if (r2 != 0) goto L29
                java.util.Map r4 = r3.map()
                boolean r4 = r4.containsKey(r0)
                if (r4 == 0) goto L2a
            L29:
                r1 = 1
            L2a:
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
                r1 = this;
                java.util.Map r0 = r1.map()
                boolean r0 = r0.isEmpty()
                return r0
        }

        public abstract java.util.Map<K, V> map();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                boolean r0 = r1.contains(r2)
                if (r0 == 0) goto L1d
                boolean r0 = r2 instanceof java.util.Map.Entry
                if (r0 == 0) goto L1d
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                java.util.Map r0 = r1.map()
                java.util.Set r0 = r0.keySet()
                java.lang.Object r2 = r2.getKey()
                boolean r2 = r0.remove(r2)
                return r2
            L1d:
                r2 = 0
                return r2
        }

        @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(java.util.Collection<?> r2) {
                r1 = this;
                java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r2)     // Catch: java.lang.UnsupportedOperationException -> Lb
                java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.UnsupportedOperationException -> Lb
                boolean r2 = super.removeAll(r0)     // Catch: java.lang.UnsupportedOperationException -> Lb
                return r2
            Lb:
                java.util.Iterator r2 = r2.iterator()
                boolean r2 = com.google.common.collect.Sets.removeAllImpl(r1, r2)
                return r2
        }

        @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(java.util.Collection<?> r4) {
                r3 = this;
                java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r4)     // Catch: java.lang.UnsupportedOperationException -> Lb
                java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.UnsupportedOperationException -> Lb
                boolean r4 = super.retainAll(r0)     // Catch: java.lang.UnsupportedOperationException -> Lb
                return r4
            Lb:
                int r0 = r4.size()
                java.util.HashSet r0 = com.google.common.collect.Sets.newHashSetWithExpectedSize(r0)
                java.util.Iterator r4 = r4.iterator()
            L17:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L35
                java.lang.Object r1 = r4.next()
                boolean r2 = r3.contains(r1)
                if (r2 == 0) goto L17
                boolean r2 = r1 instanceof java.util.Map.Entry
                if (r2 == 0) goto L17
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r1 = r1.getKey()
                r0.add(r1)
                goto L17
            L35:
                java.util.Map r4 = r3.map()
                java.util.Set r4 = r4.keySet()
                boolean r4 = r4.retainAll(r0)
                return r4
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                java.util.Map r0 = r1.map()
                int r0 = r0.size()
                return r0
        }
    }

    public interface EntryTransformer<K, V1, V2> {
        V2 transformEntry(@com.google.common.collect.ParametricNullness K r1, @com.google.common.collect.ParametricNullness V1 r2);
    }

    public static final class FilteredEntryBiMap<K, V> extends com.google.common.collect.Maps.FilteredEntryMap<K, V> implements com.google.common.collect.BiMap<K, V> {

        @com.google.j2objc.annotations.RetainedWith
        private final com.google.common.collect.BiMap<V, K> inverse;


        public FilteredEntryBiMap(com.google.common.collect.BiMap<K, V> r2, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> r3) {
                r1 = this;
                r1.<init>(r2, r3)
                com.google.common.collect.Maps$FilteredEntryBiMap r0 = new com.google.common.collect.Maps$FilteredEntryBiMap
                com.google.common.collect.BiMap r2 = r2.inverse()
                com.google.common.base.Predicate r3 = inversePredicate(r3)
                r0.<init>(r2, r3, r1)
                r1.inverse = r0
                return
        }

        private FilteredEntryBiMap(com.google.common.collect.BiMap<K, V> r1, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> r2, com.google.common.collect.BiMap<V, K> r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.inverse = r3
                return
        }

        private static <K, V> com.google.common.base.Predicate<java.util.Map.Entry<V, K>> inversePredicate(com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> r1) {
                com.google.common.collect.Maps$FilteredEntryBiMap$1 r0 = new com.google.common.collect.Maps$FilteredEntryBiMap$1
                r0.<init>(r1)
                return r0
        }

        @Override // com.google.common.collect.BiMap
        @javax.annotation.CheckForNull
        public V forcePut(@com.google.common.collect.ParametricNullness K r2, @com.google.common.collect.ParametricNullness V r3) {
                r1 = this;
                boolean r0 = r1.apply(r2, r3)
                com.google.common.base.Preconditions.checkArgument(r0)
                java.util.Map<K, V> r0 = r1.unfiltered
                com.google.common.collect.BiMap r0 = (com.google.common.collect.BiMap) r0
                java.lang.Object r2 = r0.forcePut(r2, r3)
                return r2
        }

        @Override // com.google.common.collect.BiMap
        public com.google.common.collect.BiMap<V, K> inverse() {
                r1 = this;
                com.google.common.collect.BiMap<V, K> r0 = r1.inverse
                return r0
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        public /* bridge */ /* synthetic */ java.util.Collection values() {
                r1 = this;
                java.util.Set r0 = r1.values()
                return r0
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        public java.util.Set<V> values() {
                r1 = this;
                com.google.common.collect.BiMap<V, K> r0 = r1.inverse
                java.util.Set r0 = r0.keySet()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class FilteredEntryMap<K, V> extends com.google.common.collect.Maps.AbstractFilteredMap<K, V> {
        public final java.util.Set<java.util.Map.Entry<K, V>> filteredEntrySet;

        public class EntrySet extends com.google.common.collect.ForwardingSet<java.util.Map.Entry<K, V>> {
            public final /* synthetic */ com.google.common.collect.Maps.FilteredEntryMap this$0;


            private EntrySet(com.google.common.collect.Maps.FilteredEntryMap r1) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    return
            }

            public /* synthetic */ EntrySet(com.google.common.collect.Maps.FilteredEntryMap r1, com.google.common.collect.Maps.AnonymousClass1 r2) {
                    r0 = this;
                    r0.<init>(r1)
                    return
            }

            @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
            public final java.lang.Object delegate() {
                    r1 = this;
                    com.google.common.collect.Maps$FilteredEntryMap r0 = r1.this$0
                    java.util.Set<java.util.Map$Entry<K, V>> r0 = r0.filteredEntrySet
                    return r0
            }

            @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
            public final java.util.Collection delegate() {
                    r1 = this;
                    com.google.common.collect.Maps$FilteredEntryMap r0 = r1.this$0
                    java.util.Set<java.util.Map$Entry<K, V>> r0 = r0.filteredEntrySet
                    return r0
            }

            @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
            public final java.util.Set<java.util.Map.Entry<K, V>> delegate() {
                    r1 = this;
                    com.google.common.collect.Maps$FilteredEntryMap r0 = r1.this$0
                    java.util.Set<java.util.Map$Entry<K, V>> r0 = r0.filteredEntrySet
                    return r0
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
                    r2 = this;
                    com.google.common.collect.Maps$FilteredEntryMap$EntrySet$1 r0 = new com.google.common.collect.Maps$FilteredEntryMap$EntrySet$1
                    com.google.common.collect.Maps$FilteredEntryMap r1 = r2.this$0
                    java.util.Set<java.util.Map$Entry<K, V>> r1 = r1.filteredEntrySet
                    java.util.Iterator r1 = r1.iterator()
                    r0.<init>(r2, r1)
                    return r0
            }
        }

        public class KeySet extends com.google.common.collect.Maps.KeySet<K, V> {
            public final /* synthetic */ com.google.common.collect.Maps.FilteredEntryMap this$0;

            public KeySet(com.google.common.collect.Maps.FilteredEntryMap r1) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>(r1)
                    return
            }

            @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@javax.annotation.CheckForNull java.lang.Object r2) {
                    r1 = this;
                    com.google.common.collect.Maps$FilteredEntryMap r0 = r1.this$0
                    boolean r0 = r0.containsKey(r2)
                    if (r0 == 0) goto L11
                    com.google.common.collect.Maps$FilteredEntryMap r0 = r1.this$0
                    java.util.Map<K, V> r0 = r0.unfiltered
                    r0.remove(r2)
                    r2 = 1
                    return r2
                L11:
                    r2 = 0
                    return r2
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(java.util.Collection<?> r3) {
                    r2 = this;
                    com.google.common.collect.Maps$FilteredEntryMap r0 = r2.this$0
                    java.util.Map<K, V> r1 = r0.unfiltered
                    com.google.common.base.Predicate<? super java.util.Map$Entry<K, V>> r0 = r0.predicate
                    boolean r3 = com.google.common.collect.Maps.FilteredEntryMap.removeAllKeys(r1, r0, r3)
                    return r3
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(java.util.Collection<?> r3) {
                    r2 = this;
                    com.google.common.collect.Maps$FilteredEntryMap r0 = r2.this$0
                    java.util.Map<K, V> r1 = r0.unfiltered
                    com.google.common.base.Predicate<? super java.util.Map$Entry<K, V>> r0 = r0.predicate
                    boolean r3 = com.google.common.collect.Maps.FilteredEntryMap.retainAllKeys(r1, r0, r3)
                    return r3
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public java.lang.Object[] toArray() {
                    r1 = this;
                    java.util.Iterator r0 = r1.iterator()
                    java.util.ArrayList r0 = com.google.common.collect.Lists.newArrayList(r0)
                    java.lang.Object[] r0 = r0.toArray()
                    return r0
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public <T> T[] toArray(T[] r2) {
                    r1 = this;
                    java.util.Iterator r0 = r1.iterator()
                    java.util.ArrayList r0 = com.google.common.collect.Lists.newArrayList(r0)
                    java.lang.Object[] r2 = r0.toArray(r2)
                    return r2
            }
        }

        public FilteredEntryMap(java.util.Map<K, V> r1, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> r2) {
                r0 = this;
                r0.<init>(r1, r2)
                java.util.Set r1 = r1.entrySet()
                com.google.common.base.Predicate<? super java.util.Map$Entry<K, V>> r2 = r0.predicate
                java.util.Set r1 = com.google.common.collect.Sets.filter(r1, r2)
                r0.filteredEntrySet = r1
                return
        }

        public static <K, V> boolean removeAllKeys(java.util.Map<K, V> r3, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> r4, java.util.Collection<?> r5) {
                java.util.Set r3 = r3.entrySet()
                java.util.Iterator r3 = r3.iterator()
                r0 = 0
            L9:
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L2a
                java.lang.Object r1 = r3.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                boolean r2 = r4.apply(r1)
                if (r2 == 0) goto L9
                java.lang.Object r1 = r1.getKey()
                boolean r1 = r5.contains(r1)
                if (r1 == 0) goto L9
                r3.remove()
                r0 = 1
                goto L9
            L2a:
                return r0
        }

        public static <K, V> boolean retainAllKeys(java.util.Map<K, V> r3, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> r4, java.util.Collection<?> r5) {
                java.util.Set r3 = r3.entrySet()
                java.util.Iterator r3 = r3.iterator()
                r0 = 0
            L9:
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L2a
                java.lang.Object r1 = r3.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                boolean r2 = r4.apply(r1)
                if (r2 == 0) goto L9
                java.lang.Object r1 = r1.getKey()
                boolean r1 = r5.contains(r1)
                if (r1 != 0) goto L9
                r3.remove()
                r0 = 1
                goto L9
            L2a:
                return r0
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final java.util.Set<java.util.Map.Entry<K, V>> createEntrySet() {
                r2 = this;
                com.google.common.collect.Maps$FilteredEntryMap$EntrySet r0 = new com.google.common.collect.Maps$FilteredEntryMap$EntrySet
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public java.util.Set<K> createKeySet() {
                r1 = this;
                com.google.common.collect.Maps$FilteredEntryMap$KeySet r0 = new com.google.common.collect.Maps$FilteredEntryMap$KeySet
                r0.<init>(r1)
                return r0
        }
    }

    @com.google.common.annotations.GwtIncompatible
    public static class FilteredEntryNavigableMap<K, V> extends com.google.common.collect.AbstractNavigableMap<K, V> {
        private final com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> entryPredicate;
        private final java.util.Map<K, V> filteredDelegate;
        private final java.util.NavigableMap<K, V> unfiltered;


        public FilteredEntryNavigableMap(java.util.NavigableMap<K, V> r2, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> r3) {
                r1 = this;
                r1.<init>()
                java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r2)
                java.util.NavigableMap r0 = (java.util.NavigableMap) r0
                r1.unfiltered = r0
                r1.entryPredicate = r3
                com.google.common.collect.Maps$FilteredEntryMap r0 = new com.google.common.collect.Maps$FilteredEntryMap
                r0.<init>(r2, r3)
                r1.filteredDelegate = r0
                return
        }

        public static /* synthetic */ com.google.common.base.Predicate access$500(com.google.common.collect.Maps.FilteredEntryNavigableMap r0) {
                com.google.common.base.Predicate<? super java.util.Map$Entry<K, V>> r0 = r0.entryPredicate
                return r0
        }

        public static /* synthetic */ java.util.NavigableMap access$600(com.google.common.collect.Maps.FilteredEntryNavigableMap r0) {
                java.util.NavigableMap<K, V> r0 = r0.unfiltered
                return r0
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public void clear() {
                r1 = this;
                java.util.Map<K, V> r0 = r1.filteredDelegate
                r0.clear()
                return
        }

        @Override // java.util.SortedMap
        @javax.annotation.CheckForNull
        public java.util.Comparator<? super K> comparator() {
                r1 = this;
                java.util.NavigableMap<K, V> r0 = r1.unfiltered
                java.util.Comparator r0 = r0.comparator()
                return r0
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                java.util.Map<K, V> r0 = r1.filteredDelegate
                boolean r2 = r0.containsKey(r2)
                return r2
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        public final java.util.Iterator<java.util.Map.Entry<K, V>> descendingEntryIterator() {
                r2 = this;
                java.util.NavigableMap<K, V> r0 = r2.unfiltered
                java.util.NavigableMap r0 = r0.descendingMap()
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
                com.google.common.base.Predicate<? super java.util.Map$Entry<K, V>> r1 = r2.entryPredicate
                com.google.common.collect.UnmodifiableIterator r0 = com.google.common.collect.Iterators.filter(r0, r1)
                return r0
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public java.util.NavigableMap<K, V> descendingMap() {
                r2 = this;
                java.util.NavigableMap<K, V> r0 = r2.unfiltered
                java.util.NavigableMap r0 = r0.descendingMap()
                com.google.common.base.Predicate<? super java.util.Map$Entry<K, V>> r1 = r2.entryPredicate
                java.util.NavigableMap r0 = com.google.common.collect.Maps.filterEntries(r0, r1)
                return r0
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public final java.util.Iterator<java.util.Map.Entry<K, V>> entryIterator() {
                r2 = this;
                java.util.NavigableMap<K, V> r0 = r2.unfiltered
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
                com.google.common.base.Predicate<? super java.util.Map$Entry<K, V>> r1 = r2.entryPredicate
                com.google.common.collect.UnmodifiableIterator r0 = com.google.common.collect.Iterators.filter(r0, r1)
                return r0
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
                r1 = this;
                java.util.Map<K, V> r0 = r1.filteredDelegate
                java.util.Set r0 = r0.entrySet()
                return r0
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public V get(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                java.util.Map<K, V> r0 = r1.filteredDelegate
                java.lang.Object r2 = r0.get(r2)
                return r2
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, V> headMap(@com.google.common.collect.ParametricNullness K r2, boolean r3) {
                r1 = this;
                java.util.NavigableMap<K, V> r0 = r1.unfiltered
                java.util.NavigableMap r2 = r0.headMap(r2, r3)
                com.google.common.base.Predicate<? super java.util.Map$Entry<K, V>> r3 = r1.entryPredicate
                java.util.NavigableMap r2 = com.google.common.collect.Maps.filterEntries(r2, r3)
                return r2
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
                r2 = this;
                java.util.NavigableMap<K, V> r0 = r2.unfiltered
                java.util.Set r0 = r0.entrySet()
                com.google.common.base.Predicate<? super java.util.Map$Entry<K, V>> r1 = r2.entryPredicate
                boolean r0 = com.google.common.collect.Iterables.any(r0, r1)
                r0 = r0 ^ 1
                return r0
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public java.util.NavigableSet<K> navigableKeySet() {
                r1 = this;
                com.google.common.collect.Maps$FilteredEntryNavigableMap$1 r0 = new com.google.common.collect.Maps$FilteredEntryNavigableMap$1
                r0.<init>(r1, r1)
                return r0
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V> pollFirstEntry() {
                r2 = this;
                java.util.NavigableMap<K, V> r0 = r2.unfiltered
                java.util.Set r0 = r0.entrySet()
                com.google.common.base.Predicate<? super java.util.Map$Entry<K, V>> r1 = r2.entryPredicate
                java.lang.Object r0 = com.google.common.collect.Iterables.removeFirstMatching(r0, r1)
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                return r0
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V> pollLastEntry() {
                r2 = this;
                java.util.NavigableMap<K, V> r0 = r2.unfiltered
                java.util.NavigableMap r0 = r0.descendingMap()
                java.util.Set r0 = r0.entrySet()
                com.google.common.base.Predicate<? super java.util.Map$Entry<K, V>> r1 = r2.entryPredicate
                java.lang.Object r0 = com.google.common.collect.Iterables.removeFirstMatching(r0, r1)
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                return r0
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public V put(@com.google.common.collect.ParametricNullness K r2, @com.google.common.collect.ParametricNullness V r3) {
                r1 = this;
                java.util.Map<K, V> r0 = r1.filteredDelegate
                java.lang.Object r2 = r0.put(r2, r3)
                return r2
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void putAll(java.util.Map<? extends K, ? extends V> r2) {
                r1 = this;
                java.util.Map<K, V> r0 = r1.filteredDelegate
                r0.putAll(r2)
                return
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public V remove(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                java.util.Map<K, V> r0 = r1.filteredDelegate
                java.lang.Object r2 = r0.remove(r2)
                return r2
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
                r1 = this;
                java.util.Map<K, V> r0 = r1.filteredDelegate
                int r0 = r0.size()
                return r0
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, V> subMap(@com.google.common.collect.ParametricNullness K r2, boolean r3, @com.google.common.collect.ParametricNullness K r4, boolean r5) {
                r1 = this;
                java.util.NavigableMap<K, V> r0 = r1.unfiltered
                java.util.NavigableMap r2 = r0.subMap(r2, r3, r4, r5)
                com.google.common.base.Predicate<? super java.util.Map$Entry<K, V>> r3 = r1.entryPredicate
                java.util.NavigableMap r2 = com.google.common.collect.Maps.filterEntries(r2, r3)
                return r2
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, V> tailMap(@com.google.common.collect.ParametricNullness K r2, boolean r3) {
                r1 = this;
                java.util.NavigableMap<K, V> r0 = r1.unfiltered
                java.util.NavigableMap r2 = r0.tailMap(r2, r3)
                com.google.common.base.Predicate<? super java.util.Map$Entry<K, V>> r3 = r1.entryPredicate
                java.util.NavigableMap r2 = com.google.common.collect.Maps.filterEntries(r2, r3)
                return r2
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public java.util.Collection<V> values() {
                r3 = this;
                com.google.common.collect.Maps$FilteredMapValues r0 = new com.google.common.collect.Maps$FilteredMapValues
                java.util.NavigableMap<K, V> r1 = r3.unfiltered
                com.google.common.base.Predicate<? super java.util.Map$Entry<K, V>> r2 = r3.entryPredicate
                r0.<init>(r3, r1, r2)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class FilteredEntrySortedMap<K, V> extends com.google.common.collect.Maps.FilteredEntryMap<K, V> implements java.util.SortedMap<K, V> {

        /* JADX INFO: loaded from: classes.dex */
        public class SortedKeySet extends com.google.common.collect.Maps.FilteredEntryMap<K, V>.KeySet implements java.util.SortedSet<K> {
            public final /* synthetic */ com.google.common.collect.Maps.FilteredEntrySortedMap this$0;

            public SortedKeySet(com.google.common.collect.Maps.FilteredEntrySortedMap r1) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>(r1)
                    return
            }

            @Override // java.util.SortedSet
            @javax.annotation.CheckForNull
            public java.util.Comparator<? super K> comparator() {
                    r1 = this;
                    com.google.common.collect.Maps$FilteredEntrySortedMap r0 = r1.this$0
                    java.util.Map<K, V> r0 = r0.unfiltered
                    java.util.SortedMap r0 = (java.util.SortedMap) r0
                    java.util.Comparator r0 = r0.comparator()
                    return r0
            }

            @Override // java.util.SortedSet
            @com.google.common.collect.ParametricNullness
            public K first() {
                    r1 = this;
                    com.google.common.collect.Maps$FilteredEntrySortedMap r0 = r1.this$0
                    java.lang.Object r0 = r0.firstKey()
                    return r0
            }

            @Override // java.util.SortedSet
            public java.util.SortedSet<K> headSet(@com.google.common.collect.ParametricNullness K r2) {
                    r1 = this;
                    com.google.common.collect.Maps$FilteredEntrySortedMap r0 = r1.this$0
                    java.util.SortedMap r2 = r0.headMap(r2)
                    java.util.Set r2 = r2.keySet()
                    java.util.SortedSet r2 = (java.util.SortedSet) r2
                    return r2
            }

            @Override // java.util.SortedSet
            @com.google.common.collect.ParametricNullness
            public K last() {
                    r1 = this;
                    com.google.common.collect.Maps$FilteredEntrySortedMap r0 = r1.this$0
                    java.lang.Object r0 = r0.lastKey()
                    return r0
            }

            @Override // java.util.SortedSet
            public java.util.SortedSet<K> subSet(@com.google.common.collect.ParametricNullness K r2, @com.google.common.collect.ParametricNullness K r3) {
                    r1 = this;
                    com.google.common.collect.Maps$FilteredEntrySortedMap r0 = r1.this$0
                    java.util.SortedMap r2 = r0.subMap(r2, r3)
                    java.util.Set r2 = r2.keySet()
                    java.util.SortedSet r2 = (java.util.SortedSet) r2
                    return r2
            }

            @Override // java.util.SortedSet
            public java.util.SortedSet<K> tailSet(@com.google.common.collect.ParametricNullness K r2) {
                    r1 = this;
                    com.google.common.collect.Maps$FilteredEntrySortedMap r0 = r1.this$0
                    java.util.SortedMap r2 = r0.tailMap(r2)
                    java.util.Set r2 = r2.keySet()
                    java.util.SortedSet r2 = (java.util.SortedSet) r2
                    return r2
            }
        }

        public FilteredEntrySortedMap(java.util.SortedMap<K, V> r1, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // java.util.SortedMap
        @javax.annotation.CheckForNull
        public java.util.Comparator<? super K> comparator() {
                r1 = this;
                java.util.Map<K, V> r0 = r1.unfiltered
                java.util.SortedMap r0 = (java.util.SortedMap) r0
                java.util.Comparator r0 = r0.comparator()
                return r0
        }

        @Override // com.google.common.collect.Maps.FilteredEntryMap, com.google.common.collect.Maps.ViewCachingAbstractMap
        public final java.util.Set createKeySet() {
                r1 = this;
                com.google.common.collect.Maps$FilteredEntrySortedMap$SortedKeySet r0 = new com.google.common.collect.Maps$FilteredEntrySortedMap$SortedKeySet
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.SortedMap
        @com.google.common.collect.ParametricNullness
        public K firstKey() {
                r1 = this;
                java.util.SortedSet r0 = r1.keySet()
                java.util.Iterator r0 = r0.iterator()
                java.lang.Object r0 = r0.next()
                return r0
        }

        @Override // java.util.SortedMap
        public java.util.SortedMap<K, V> headMap(@com.google.common.collect.ParametricNullness K r3) {
                r2 = this;
                com.google.common.collect.Maps$FilteredEntrySortedMap r0 = new com.google.common.collect.Maps$FilteredEntrySortedMap
                java.util.Map<K, V> r1 = r2.unfiltered
                java.util.SortedMap r1 = (java.util.SortedMap) r1
                java.util.SortedMap r3 = r1.headMap(r3)
                com.google.common.base.Predicate<? super java.util.Map$Entry<K, V>> r1 = r2.predicate
                r0.<init>(r3, r1)
                return r0
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ java.util.Set keySet() {
                r1 = this;
                java.util.SortedSet r0 = r1.keySet()
                return r0
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public java.util.SortedSet<K> keySet() {
                r1 = this;
                java.util.Set r0 = super.keySet()
                java.util.SortedSet r0 = (java.util.SortedSet) r0
                return r0
        }

        @Override // java.util.SortedMap
        @com.google.common.collect.ParametricNullness
        public K lastKey() {
                r2 = this;
                java.util.Map<K, V> r0 = r2.unfiltered
                java.util.SortedMap r0 = (java.util.SortedMap) r0
            L4:
                java.lang.Object r0 = r0.lastKey()
                java.util.Map<K, V> r1 = r2.unfiltered
                java.lang.Object r1 = r1.get(r0)
                boolean r1 = r2.apply(r0, r1)
                if (r1 == 0) goto L15
                return r0
            L15:
                java.util.Map<K, V> r1 = r2.unfiltered
                java.util.SortedMap r1 = (java.util.SortedMap) r1
                java.util.SortedMap r0 = r1.headMap(r0)
                goto L4
        }

        @Override // java.util.SortedMap
        public java.util.SortedMap<K, V> subMap(@com.google.common.collect.ParametricNullness K r3, @com.google.common.collect.ParametricNullness K r4) {
                r2 = this;
                com.google.common.collect.Maps$FilteredEntrySortedMap r0 = new com.google.common.collect.Maps$FilteredEntrySortedMap
                java.util.Map<K, V> r1 = r2.unfiltered
                java.util.SortedMap r1 = (java.util.SortedMap) r1
                java.util.SortedMap r3 = r1.subMap(r3, r4)
                com.google.common.base.Predicate<? super java.util.Map$Entry<K, V>> r4 = r2.predicate
                r0.<init>(r3, r4)
                return r0
        }

        @Override // java.util.SortedMap
        public java.util.SortedMap<K, V> tailMap(@com.google.common.collect.ParametricNullness K r3) {
                r2 = this;
                com.google.common.collect.Maps$FilteredEntrySortedMap r0 = new com.google.common.collect.Maps$FilteredEntrySortedMap
                java.util.Map<K, V> r1 = r2.unfiltered
                java.util.SortedMap r1 = (java.util.SortedMap) r1
                java.util.SortedMap r3 = r1.tailMap(r3)
                com.google.common.base.Predicate<? super java.util.Map$Entry<K, V>> r1 = r2.predicate
                r0.<init>(r3, r1)
                return r0
        }
    }

    public static class FilteredKeyMap<K, V> extends com.google.common.collect.Maps.AbstractFilteredMap<K, V> {
        public final com.google.common.base.Predicate<? super K> keyPredicate;

        public FilteredKeyMap(java.util.Map<K, V> r1, com.google.common.base.Predicate<? super K> r2, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> r3) {
                r0 = this;
                r0.<init>(r1, r3)
                r0.keyPredicate = r2
                return
        }

        @Override // com.google.common.collect.Maps.AbstractFilteredMap, java.util.AbstractMap, java.util.Map
        public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                java.util.Map<K, V> r0 = r1.unfiltered
                boolean r0 = r0.containsKey(r2)
                if (r0 == 0) goto L12
                com.google.common.base.Predicate<? super K> r0 = r1.keyPredicate
                boolean r2 = r0.apply(r2)
                if (r2 == 0) goto L12
                r2 = 1
                goto L13
            L12:
                r2 = 0
            L13:
                return r2
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final java.util.Set<java.util.Map.Entry<K, V>> createEntrySet() {
                r2 = this;
                java.util.Map<K, V> r0 = r2.unfiltered
                java.util.Set r0 = r0.entrySet()
                com.google.common.base.Predicate<? super java.util.Map$Entry<K, V>> r1 = r2.predicate
                java.util.Set r0 = com.google.common.collect.Sets.filter(r0, r1)
                return r0
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final java.util.Set<K> createKeySet() {
                r2 = this;
                java.util.Map<K, V> r0 = r2.unfiltered
                java.util.Set r0 = r0.keySet()
                com.google.common.base.Predicate<? super K> r1 = r2.keyPredicate
                java.util.Set r0 = com.google.common.collect.Sets.filter(r0, r1)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class FilteredMapValues<K, V> extends com.google.common.collect.Maps.Values<K, V> {
        public final com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> predicate;
        public final java.util.Map<K, V> unfiltered;

        public FilteredMapValues(java.util.Map<K, V> r1, java.util.Map<K, V> r2, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> r3) {
                r0 = this;
                r0.<init>(r1)
                r0.unfiltered = r2
                r0.predicate = r3
                return
        }

        @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
        public boolean remove(@javax.annotation.CheckForNull java.lang.Object r4) {
                r3 = this;
                java.util.Map<K, V> r0 = r3.unfiltered
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
            La:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L2d
                java.lang.Object r1 = r0.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                com.google.common.base.Predicate<? super java.util.Map$Entry<K, V>> r2 = r3.predicate
                boolean r2 = r2.apply(r1)
                if (r2 == 0) goto La
                java.lang.Object r1 = r1.getValue()
                boolean r1 = com.google.common.base.Objects.equal(r1, r4)
                if (r1 == 0) goto La
                r0.remove()
                r4 = 1
                return r4
            L2d:
                r4 = 0
                return r4
        }

        @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(java.util.Collection<?> r5) {
                r4 = this;
                java.util.Map<K, V> r0 = r4.unfiltered
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
                r1 = 0
            Lb:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L2e
                java.lang.Object r2 = r0.next()
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                com.google.common.base.Predicate<? super java.util.Map$Entry<K, V>> r3 = r4.predicate
                boolean r3 = r3.apply(r2)
                if (r3 == 0) goto Lb
                java.lang.Object r2 = r2.getValue()
                boolean r2 = r5.contains(r2)
                if (r2 == 0) goto Lb
                r0.remove()
                r1 = 1
                goto Lb
            L2e:
                return r1
        }

        @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(java.util.Collection<?> r5) {
                r4 = this;
                java.util.Map<K, V> r0 = r4.unfiltered
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
                r1 = 0
            Lb:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L2e
                java.lang.Object r2 = r0.next()
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                com.google.common.base.Predicate<? super java.util.Map$Entry<K, V>> r3 = r4.predicate
                boolean r3 = r3.apply(r2)
                if (r3 == 0) goto Lb
                java.lang.Object r2 = r2.getValue()
                boolean r2 = r5.contains(r2)
                if (r2 != 0) goto Lb
                r0.remove()
                r1 = 1
                goto Lb
            L2e:
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public java.lang.Object[] toArray() {
                r1 = this;
                java.util.Iterator r0 = r1.iterator()
                java.util.ArrayList r0 = com.google.common.collect.Lists.newArrayList(r0)
                java.lang.Object[] r0 = r0.toArray()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] r2) {
                r1 = this;
                java.util.Iterator r0 = r1.iterator()
                java.util.ArrayList r0 = com.google.common.collect.Lists.newArrayList(r0)
                java.lang.Object[] r2 = r0.toArray(r2)
                return r2
        }
    }

    public static abstract class IteratorBasedAbstractMap<K, V> extends java.util.AbstractMap<K, V> {


        public IteratorBasedAbstractMap() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
                r1 = this;
                java.util.Iterator r0 = r1.entryIterator()
                com.google.common.collect.Iterators.clear(r0)
                return
        }

        public abstract java.util.Iterator<java.util.Map.Entry<K, V>> entryIterator();

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
                r1 = this;
                com.google.common.collect.Maps$IteratorBasedAbstractMap$1 r0 = new com.google.common.collect.Maps$IteratorBasedAbstractMap$1
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.AbstractMap, java.util.Map
        public abstract int size();
    }

    public static class KeySet<K, V> extends com.google.common.collect.Sets.ImprovedAbstractSet<K> {

        @com.google.j2objc.annotations.Weak
        public final java.util.Map<K, V> map;

        public KeySet(java.util.Map<K, V> r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.util.Map r1 = (java.util.Map) r1
                r0.map = r1
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
                r1 = this;
                java.util.Map r0 = r1.map()
                r0.clear()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                java.util.Map r0 = r1.map()
                boolean r2 = r0.containsKey(r2)
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
                r1 = this;
                java.util.Map r0 = r1.map()
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<K> iterator() {
                r2 = this;
                java.util.Map r0 = r2.map()
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
                com.google.common.collect.Maps$1 r1 = new com.google.common.collect.Maps$1
                r1.<init>(r0)
                return r1
        }

        public java.util.Map<K, V> map() {
                r1 = this;
                java.util.Map<K, V> r0 = r1.map
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                boolean r0 = r1.contains(r2)
                if (r0 == 0) goto Lf
                java.util.Map r0 = r1.map()
                r0.remove(r2)
                r2 = 1
                return r2
            Lf:
                r2 = 0
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                java.util.Map r0 = r1.map()
                int r0 = r0.size()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class MapDifferenceImpl<K, V> implements com.google.common.collect.MapDifference<K, V> {
        public final java.util.Map<K, com.google.common.collect.MapDifference.ValueDifference<V>> differences;
        public final java.util.Map<K, V> onBoth;
        public final java.util.Map<K, V> onlyOnLeft;
        public final java.util.Map<K, V> onlyOnRight;

        public MapDifferenceImpl(java.util.Map<K, V> r1, java.util.Map<K, V> r2, java.util.Map<K, V> r3, java.util.Map<K, com.google.common.collect.MapDifference.ValueDifference<V>> r4) {
                r0 = this;
                r0.<init>()
                java.util.Map r1 = com.google.common.collect.Maps.access$100(r1)
                r0.onlyOnLeft = r1
                java.util.Map r1 = com.google.common.collect.Maps.access$100(r2)
                r0.onlyOnRight = r1
                java.util.Map r1 = com.google.common.collect.Maps.access$100(r3)
                r0.onBoth = r1
                java.util.Map r1 = com.google.common.collect.Maps.access$100(r4)
                r0.differences = r1
                return
        }

        @Override // com.google.common.collect.MapDifference
        public boolean areEqual() {
                r1 = this;
                java.util.Map<K, V> r0 = r1.onlyOnLeft
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L1a
                java.util.Map<K, V> r0 = r1.onlyOnRight
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L1a
                java.util.Map<K, com.google.common.collect.MapDifference$ValueDifference<V>> r0 = r1.differences
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L1a
                r0 = 1
                goto L1b
            L1a:
                r0 = 0
            L1b:
                return r0
        }

        @Override // com.google.common.collect.MapDifference
        public java.util.Map<K, com.google.common.collect.MapDifference.ValueDifference<V>> entriesDiffering() {
                r1 = this;
                java.util.Map<K, com.google.common.collect.MapDifference$ValueDifference<V>> r0 = r1.differences
                return r0
        }

        @Override // com.google.common.collect.MapDifference
        public java.util.Map<K, V> entriesInCommon() {
                r1 = this;
                java.util.Map<K, V> r0 = r1.onBoth
                return r0
        }

        @Override // com.google.common.collect.MapDifference
        public java.util.Map<K, V> entriesOnlyOnLeft() {
                r1 = this;
                java.util.Map<K, V> r0 = r1.onlyOnLeft
                return r0
        }

        @Override // com.google.common.collect.MapDifference
        public java.util.Map<K, V> entriesOnlyOnRight() {
                r1 = this;
                java.util.Map<K, V> r0 = r1.onlyOnRight
                return r0
        }

        @Override // com.google.common.collect.MapDifference
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r5 != r4) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof com.google.common.collect.MapDifference
                r2 = 0
                if (r1 == 0) goto L46
                com.google.common.collect.MapDifference r5 = (com.google.common.collect.MapDifference) r5
                java.util.Map r1 = r4.entriesOnlyOnLeft()
                java.util.Map r3 = r5.entriesOnlyOnLeft()
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L44
                java.util.Map r1 = r4.entriesOnlyOnRight()
                java.util.Map r3 = r5.entriesOnlyOnRight()
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L44
                java.util.Map r1 = r4.entriesInCommon()
                java.util.Map r3 = r5.entriesInCommon()
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L44
                java.util.Map r1 = r4.entriesDiffering()
                java.util.Map r5 = r5.entriesDiffering()
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L44
                goto L45
            L44:
                r0 = 0
            L45:
                return r0
            L46:
                return r2
        }

        @Override // com.google.common.collect.MapDifference
        public int hashCode() {
                r3 = this;
                r0 = 4
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.util.Map r1 = r3.entriesOnlyOnLeft()
                r2 = 0
                r0[r2] = r1
                java.util.Map r1 = r3.entriesOnlyOnRight()
                r2 = 1
                r0[r2] = r1
                java.util.Map r1 = r3.entriesInCommon()
                r2 = 2
                r0[r2] = r1
                java.util.Map r1 = r3.entriesDiffering()
                r2 = 3
                r0[r2] = r1
                int r0 = com.google.common.base.Objects.hashCode(r0)
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                boolean r0 = r2.areEqual()
                if (r0 == 0) goto L9
                java.lang.String r0 = "equal"
                return r0
            L9:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "not equal"
                r0.<init>(r1)
                java.util.Map<K, V> r1 = r2.onlyOnLeft
                boolean r1 = r1.isEmpty()
                if (r1 != 0) goto L22
                java.lang.String r1 = ": only on left="
                r0.append(r1)
                java.util.Map<K, V> r1 = r2.onlyOnLeft
                r0.append(r1)
            L22:
                java.util.Map<K, V> r1 = r2.onlyOnRight
                boolean r1 = r1.isEmpty()
                if (r1 != 0) goto L34
                java.lang.String r1 = ": only on right="
                r0.append(r1)
                java.util.Map<K, V> r1 = r2.onlyOnRight
                r0.append(r1)
            L34:
                java.util.Map<K, com.google.common.collect.MapDifference$ValueDifference<V>> r1 = r2.differences
                boolean r1 = r1.isEmpty()
                if (r1 != 0) goto L46
                java.lang.String r1 = ": value differences="
                r0.append(r1)
                java.util.Map<K, com.google.common.collect.MapDifference$ValueDifference<V>> r1 = r2.differences
                r0.append(r1)
            L46:
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @com.google.common.annotations.GwtIncompatible
    public static final class NavigableAsMapView<K, V> extends com.google.common.collect.AbstractNavigableMap<K, V> {
        private final com.google.common.base.Function<? super K, V> function;
        private final java.util.NavigableSet<K> set;

        public NavigableAsMapView(java.util.NavigableSet<K> r1, com.google.common.base.Function<? super K, V> r2) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.util.NavigableSet r1 = (java.util.NavigableSet) r1
                r0.set = r1
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                com.google.common.base.Function r1 = (com.google.common.base.Function) r1
                r0.function = r1
                return
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public void clear() {
                r1 = this;
                java.util.NavigableSet<K> r0 = r1.set
                r0.clear()
                return
        }

        @Override // java.util.SortedMap
        @javax.annotation.CheckForNull
        public java.util.Comparator<? super K> comparator() {
                r1 = this;
                java.util.NavigableSet<K> r0 = r1.set
                java.util.Comparator r0 = r0.comparator()
                return r0
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        public final java.util.Iterator<java.util.Map.Entry<K, V>> descendingEntryIterator() {
                r1 = this;
                java.util.NavigableMap r0 = r1.descendingMap()
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
                return r0
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public java.util.NavigableMap<K, V> descendingMap() {
                r2 = this;
                java.util.NavigableSet<K> r0 = r2.set
                java.util.NavigableSet r0 = r0.descendingSet()
                com.google.common.base.Function<? super K, V> r1 = r2.function
                java.util.NavigableMap r0 = com.google.common.collect.Maps.asMap(r0, r1)
                return r0
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public final java.util.Iterator<java.util.Map.Entry<K, V>> entryIterator() {
                r2 = this;
                java.util.NavigableSet<K> r0 = r2.set
                com.google.common.base.Function<? super K, V> r1 = r2.function
                java.util.Iterator r0 = com.google.common.collect.Maps.asMapEntryIterator(r0, r1)
                return r0
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public V get(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                java.util.NavigableSet<K> r0 = r1.set
                boolean r0 = com.google.common.collect.Collections2.safeContains(r0, r2)
                if (r0 == 0) goto Lf
                com.google.common.base.Function<? super K, V> r0 = r1.function
                java.lang.Object r2 = r0.apply(r2)
                return r2
            Lf:
                r2 = 0
                return r2
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, V> headMap(@com.google.common.collect.ParametricNullness K r2, boolean r3) {
                r1 = this;
                java.util.NavigableSet<K> r0 = r1.set
                java.util.NavigableSet r2 = r0.headSet(r2, r3)
                com.google.common.base.Function<? super K, V> r3 = r1.function
                java.util.NavigableMap r2 = com.google.common.collect.Maps.asMap(r2, r3)
                return r2
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public java.util.NavigableSet<K> navigableKeySet() {
                r1 = this;
                java.util.NavigableSet<K> r0 = r1.set
                java.util.NavigableSet r0 = com.google.common.collect.Maps.access$400(r0)
                return r0
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
                r1 = this;
                java.util.NavigableSet<K> r0 = r1.set
                int r0 = r0.size()
                return r0
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, V> subMap(@com.google.common.collect.ParametricNullness K r2, boolean r3, @com.google.common.collect.ParametricNullness K r4, boolean r5) {
                r1 = this;
                java.util.NavigableSet<K> r0 = r1.set
                java.util.NavigableSet r2 = r0.subSet(r2, r3, r4, r5)
                com.google.common.base.Function<? super K, V> r3 = r1.function
                java.util.NavigableMap r2 = com.google.common.collect.Maps.asMap(r2, r3)
                return r2
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, V> tailMap(@com.google.common.collect.ParametricNullness K r2, boolean r3) {
                r1 = this;
                java.util.NavigableSet<K> r0 = r1.set
                java.util.NavigableSet r2 = r0.tailSet(r2, r3)
                com.google.common.base.Function<? super K, V> r3 = r1.function
                java.util.NavigableMap r2 = com.google.common.collect.Maps.asMap(r2, r3)
                return r2
        }
    }

    @com.google.common.annotations.GwtIncompatible
    public static class NavigableKeySet<K, V> extends com.google.common.collect.Maps.SortedKeySet<K, V> implements java.util.NavigableSet<K> {
        public NavigableKeySet(java.util.NavigableMap<K, V> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public K ceiling(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                java.util.Map<K, V> r0 = r1.map
                java.util.NavigableMap r0 = (java.util.NavigableMap) r0
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
                r1 = this;
                java.util.Map<K, V> r0 = r1.map
                java.util.NavigableMap r0 = (java.util.NavigableMap) r0
                java.util.NavigableSet r0 = r0.descendingKeySet()
                return r0
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public K floor(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                java.util.Map<K, V> r0 = r1.map
                java.util.NavigableMap r0 = (java.util.NavigableMap) r0
                java.lang.Object r2 = r0.floorKey(r2)
                return r2
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<K> headSet(@com.google.common.collect.ParametricNullness K r2, boolean r3) {
                r1 = this;
                java.util.Map<K, V> r0 = r1.map
                java.util.NavigableMap r0 = (java.util.NavigableMap) r0
                java.util.NavigableMap r2 = r0.headMap(r2, r3)
                java.util.NavigableSet r2 = r2.navigableKeySet()
                return r2
        }

        @Override // com.google.common.collect.Maps.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public java.util.SortedSet<K> headSet(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                r0 = 0
                java.util.NavigableSet r2 = r1.headSet(r2, r0)
                return r2
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public K higher(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                java.util.Map<K, V> r0 = r1.map
                java.util.NavigableMap r0 = (java.util.NavigableMap) r0
                java.lang.Object r2 = r0.higherKey(r2)
                return r2
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public K lower(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                java.util.Map<K, V> r0 = r1.map
                java.util.NavigableMap r0 = (java.util.NavigableMap) r0
                java.lang.Object r2 = r0.lowerKey(r2)
                return r2
        }

        @Override // com.google.common.collect.Maps.SortedKeySet, com.google.common.collect.Maps.KeySet
        public final java.util.Map map() {
                r1 = this;
                java.util.Map<K, V> r0 = r1.map
                java.util.NavigableMap r0 = (java.util.NavigableMap) r0
                return r0
        }

        @Override // com.google.common.collect.Maps.SortedKeySet, com.google.common.collect.Maps.KeySet
        public final java.util.SortedMap map() {
                r1 = this;
                java.util.Map<K, V> r0 = r1.map
                java.util.NavigableMap r0 = (java.util.NavigableMap) r0
                return r0
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public K pollFirst() {
                r1 = this;
                java.util.Map<K, V> r0 = r1.map
                java.util.NavigableMap r0 = (java.util.NavigableMap) r0
                java.util.Map$Entry r0 = r0.pollFirstEntry()
                java.lang.Object r0 = com.google.common.collect.Maps.keyOrNull(r0)
                return r0
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public K pollLast() {
                r1 = this;
                java.util.Map<K, V> r0 = r1.map
                java.util.NavigableMap r0 = (java.util.NavigableMap) r0
                java.util.Map$Entry r0 = r0.pollLastEntry()
                java.lang.Object r0 = com.google.common.collect.Maps.keyOrNull(r0)
                return r0
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<K> subSet(@com.google.common.collect.ParametricNullness K r2, boolean r3, @com.google.common.collect.ParametricNullness K r4, boolean r5) {
                r1 = this;
                java.util.Map<K, V> r0 = r1.map
                java.util.NavigableMap r0 = (java.util.NavigableMap) r0
                java.util.NavigableMap r2 = r0.subMap(r2, r3, r4, r5)
                java.util.NavigableSet r2 = r2.navigableKeySet()
                return r2
        }

        @Override // com.google.common.collect.Maps.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public java.util.SortedSet<K> subSet(@com.google.common.collect.ParametricNullness K r3, @com.google.common.collect.ParametricNullness K r4) {
                r2 = this;
                r0 = 1
                r1 = 0
                java.util.NavigableSet r3 = r2.subSet(r3, r0, r4, r1)
                return r3
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<K> tailSet(@com.google.common.collect.ParametricNullness K r2, boolean r3) {
                r1 = this;
                java.util.Map<K, V> r0 = r1.map
                java.util.NavigableMap r0 = (java.util.NavigableMap) r0
                java.util.NavigableMap r2 = r0.tailMap(r2, r3)
                java.util.NavigableSet r2 = r2.navigableKeySet()
                return r2
        }

        @Override // com.google.common.collect.Maps.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public java.util.SortedSet<K> tailSet(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                r0 = 1
                java.util.NavigableSet r2 = r1.tailSet(r2, r0)
                return r2
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class SortedAsMapView<K, V> extends com.google.common.collect.Maps.AsMapView<K, V> implements java.util.SortedMap<K, V> {
        public SortedAsMapView(java.util.SortedSet<K> r1, com.google.common.base.Function<? super K, V> r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // com.google.common.collect.Maps.AsMapView
        public final /* bridge */ /* synthetic */ java.util.Set backingSet() {
                r1 = this;
                java.util.SortedSet r0 = r1.backingSet()
                return r0
        }

        @Override // com.google.common.collect.Maps.AsMapView
        public final java.util.SortedSet<K> backingSet() {
                r1 = this;
                java.util.Set r0 = super.backingSet()
                java.util.SortedSet r0 = (java.util.SortedSet) r0
                return r0
        }

        @Override // java.util.SortedMap
        @javax.annotation.CheckForNull
        public java.util.Comparator<? super K> comparator() {
                r1 = this;
                java.util.SortedSet r0 = r1.backingSet()
                java.util.Comparator r0 = r0.comparator()
                return r0
        }

        @Override // java.util.SortedMap
        @com.google.common.collect.ParametricNullness
        public K firstKey() {
                r1 = this;
                java.util.SortedSet r0 = r1.backingSet()
                java.lang.Object r0 = r0.first()
                return r0
        }

        @Override // java.util.SortedMap
        public java.util.SortedMap<K, V> headMap(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                java.util.SortedSet r0 = r1.backingSet()
                java.util.SortedSet r2 = r0.headSet(r2)
                com.google.common.base.Function<? super K, V> r0 = r1.function
                java.util.SortedMap r2 = com.google.common.collect.Maps.asMap(r2, r0)
                return r2
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public java.util.Set<K> keySet() {
                r1 = this;
                java.util.SortedSet r0 = r1.backingSet()
                java.util.SortedSet r0 = com.google.common.collect.Maps.access$300(r0)
                return r0
        }

        @Override // java.util.SortedMap
        @com.google.common.collect.ParametricNullness
        public K lastKey() {
                r1 = this;
                java.util.SortedSet r0 = r1.backingSet()
                java.lang.Object r0 = r0.last()
                return r0
        }

        @Override // java.util.SortedMap
        public java.util.SortedMap<K, V> subMap(@com.google.common.collect.ParametricNullness K r2, @com.google.common.collect.ParametricNullness K r3) {
                r1 = this;
                java.util.SortedSet r0 = r1.backingSet()
                java.util.SortedSet r2 = r0.subSet(r2, r3)
                com.google.common.base.Function<? super K, V> r3 = r1.function
                java.util.SortedMap r2 = com.google.common.collect.Maps.asMap(r2, r3)
                return r2
        }

        @Override // java.util.SortedMap
        public java.util.SortedMap<K, V> tailMap(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                java.util.SortedSet r0 = r1.backingSet()
                java.util.SortedSet r2 = r0.tailSet(r2)
                com.google.common.base.Function<? super K, V> r0 = r1.function
                java.util.SortedMap r2 = com.google.common.collect.Maps.asMap(r2, r0)
                return r2
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class SortedKeySet<K, V> extends com.google.common.collect.Maps.KeySet<K, V> implements java.util.SortedSet<K> {
        public SortedKeySet(java.util.SortedMap<K, V> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.util.SortedSet
        @javax.annotation.CheckForNull
        public java.util.Comparator<? super K> comparator() {
                r1 = this;
                java.util.SortedMap r0 = r1.map()
                java.util.Comparator r0 = r0.comparator()
                return r0
        }

        @Override // java.util.SortedSet
        @com.google.common.collect.ParametricNullness
        public K first() {
                r1 = this;
                java.util.SortedMap r0 = r1.map()
                java.lang.Object r0 = r0.firstKey()
                return r0
        }

        public java.util.SortedSet<K> headSet(@com.google.common.collect.ParametricNullness K r3) {
                r2 = this;
                com.google.common.collect.Maps$SortedKeySet r0 = new com.google.common.collect.Maps$SortedKeySet
                java.util.SortedMap r1 = r2.map()
                java.util.SortedMap r3 = r1.headMap(r3)
                r0.<init>(r3)
                return r0
        }

        @Override // java.util.SortedSet
        @com.google.common.collect.ParametricNullness
        public K last() {
                r1 = this;
                java.util.SortedMap r0 = r1.map()
                java.lang.Object r0 = r0.lastKey()
                return r0
        }

        @Override // com.google.common.collect.Maps.KeySet
        public /* bridge */ /* synthetic */ java.util.Map map() {
                r1 = this;
                java.util.SortedMap r0 = r1.map()
                return r0
        }

        @Override // com.google.common.collect.Maps.KeySet
        public java.util.SortedMap<K, V> map() {
                r1 = this;
                java.util.Map<K, V> r0 = r1.map
                java.util.SortedMap r0 = (java.util.SortedMap) r0
                return r0
        }

        public java.util.SortedSet<K> subSet(@com.google.common.collect.ParametricNullness K r3, @com.google.common.collect.ParametricNullness K r4) {
                r2 = this;
                com.google.common.collect.Maps$SortedKeySet r0 = new com.google.common.collect.Maps$SortedKeySet
                java.util.SortedMap r1 = r2.map()
                java.util.SortedMap r3 = r1.subMap(r3, r4)
                r0.<init>(r3)
                return r0
        }

        public java.util.SortedSet<K> tailSet(@com.google.common.collect.ParametricNullness K r3) {
                r2 = this;
                com.google.common.collect.Maps$SortedKeySet r0 = new com.google.common.collect.Maps$SortedKeySet
                java.util.SortedMap r1 = r2.map()
                java.util.SortedMap r3 = r1.tailMap(r3)
                r0.<init>(r3)
                return r0
        }
    }

    public static class SortedMapDifferenceImpl<K, V> extends com.google.common.collect.Maps.MapDifferenceImpl<K, V> implements com.google.common.collect.SortedMapDifference<K, V> {
        public SortedMapDifferenceImpl(java.util.SortedMap<K, V> r1, java.util.SortedMap<K, V> r2, java.util.SortedMap<K, V> r3, java.util.SortedMap<K, com.google.common.collect.MapDifference.ValueDifference<V>> r4) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // com.google.common.collect.Maps.MapDifferenceImpl, com.google.common.collect.MapDifference
        public /* bridge */ /* synthetic */ java.util.Map entriesDiffering() {
                r1 = this;
                java.util.SortedMap r0 = r1.entriesDiffering()
                return r0
        }

        @Override // com.google.common.collect.Maps.MapDifferenceImpl, com.google.common.collect.MapDifference
        public java.util.SortedMap<K, com.google.common.collect.MapDifference.ValueDifference<V>> entriesDiffering() {
                r1 = this;
                java.util.Map r0 = super.entriesDiffering()
                java.util.SortedMap r0 = (java.util.SortedMap) r0
                return r0
        }

        @Override // com.google.common.collect.Maps.MapDifferenceImpl, com.google.common.collect.MapDifference
        public /* bridge */ /* synthetic */ java.util.Map entriesInCommon() {
                r1 = this;
                java.util.SortedMap r0 = r1.entriesInCommon()
                return r0
        }

        @Override // com.google.common.collect.Maps.MapDifferenceImpl, com.google.common.collect.MapDifference
        public java.util.SortedMap<K, V> entriesInCommon() {
                r1 = this;
                java.util.Map r0 = super.entriesInCommon()
                java.util.SortedMap r0 = (java.util.SortedMap) r0
                return r0
        }

        @Override // com.google.common.collect.Maps.MapDifferenceImpl, com.google.common.collect.MapDifference
        public /* bridge */ /* synthetic */ java.util.Map entriesOnlyOnLeft() {
                r1 = this;
                java.util.SortedMap r0 = r1.entriesOnlyOnLeft()
                return r0
        }

        @Override // com.google.common.collect.Maps.MapDifferenceImpl, com.google.common.collect.MapDifference
        public java.util.SortedMap<K, V> entriesOnlyOnLeft() {
                r1 = this;
                java.util.Map r0 = super.entriesOnlyOnLeft()
                java.util.SortedMap r0 = (java.util.SortedMap) r0
                return r0
        }

        @Override // com.google.common.collect.Maps.MapDifferenceImpl, com.google.common.collect.MapDifference
        public /* bridge */ /* synthetic */ java.util.Map entriesOnlyOnRight() {
                r1 = this;
                java.util.SortedMap r0 = r1.entriesOnlyOnRight()
                return r0
        }

        @Override // com.google.common.collect.Maps.MapDifferenceImpl, com.google.common.collect.MapDifference
        public java.util.SortedMap<K, V> entriesOnlyOnRight() {
                r1 = this;
                java.util.Map r0 = super.entriesOnlyOnRight()
                java.util.SortedMap r0 = (java.util.SortedMap) r0
                return r0
        }
    }

    public static class TransformedEntriesMap<K, V1, V2> extends com.google.common.collect.Maps.IteratorBasedAbstractMap<K, V2> {
        public final java.util.Map<K, V1> fromMap;
        public final com.google.common.collect.Maps.EntryTransformer<? super K, ? super V1, V2> transformer;

        public TransformedEntriesMap(java.util.Map<K, V1> r1, com.google.common.collect.Maps.EntryTransformer<? super K, ? super V1, V2> r2) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.util.Map r1 = (java.util.Map) r1
                r0.fromMap = r1
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                com.google.common.collect.Maps$EntryTransformer r1 = (com.google.common.collect.Maps.EntryTransformer) r1
                r0.transformer = r1
                return
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public void clear() {
                r1 = this;
                java.util.Map<K, V1> r0 = r1.fromMap
                r0.clear()
                return
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                java.util.Map<K, V1> r0 = r1.fromMap
                boolean r2 = r0.containsKey(r2)
                return r2
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public final java.util.Iterator<java.util.Map.Entry<K, V2>> entryIterator() {
                r3 = this;
                java.util.Map<K, V1> r0 = r3.fromMap
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
                com.google.common.collect.Maps$EntryTransformer<? super K, ? super V1, V2> r1 = r3.transformer
                com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.collect.Maps$13 r2 = new com.google.common.collect.Maps$13
                r2.<init>(r1)
                java.util.Iterator r0 = com.google.common.collect.Iterators.transform(r0, r2)
                return r0
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public V2 get(@javax.annotation.CheckForNull java.lang.Object r3) {
                r2 = this;
                java.util.Map<K, V1> r0 = r2.fromMap
                java.lang.Object r0 = r0.get(r3)
                if (r0 != 0) goto L13
                java.util.Map<K, V1> r1 = r2.fromMap
                boolean r1 = r1.containsKey(r3)
                if (r1 == 0) goto L11
                goto L13
            L11:
                r3 = 0
                return r3
            L13:
                com.google.common.collect.Maps$EntryTransformer<? super K, ? super V1, V2> r1 = r2.transformer
                java.lang.Object r3 = r1.transformEntry(r3, r0)
                return r3
        }

        @Override // java.util.AbstractMap, java.util.Map
        public java.util.Set<K> keySet() {
                r1 = this;
                java.util.Map<K, V1> r0 = r1.fromMap
                java.util.Set r0 = r0.keySet()
                return r0
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public V2 remove(@javax.annotation.CheckForNull java.lang.Object r3) {
                r2 = this;
                java.util.Map<K, V1> r0 = r2.fromMap
                boolean r0 = r0.containsKey(r3)
                if (r0 == 0) goto L15
                com.google.common.collect.Maps$EntryTransformer<? super K, ? super V1, V2> r0 = r2.transformer
                java.util.Map<K, V1> r1 = r2.fromMap
                java.lang.Object r1 = r1.remove(r3)
                java.lang.Object r3 = r0.transformEntry(r3, r1)
                goto L16
            L15:
                r3 = 0
            L16:
                return r3
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
                r1 = this;
                java.util.Map<K, V1> r0 = r1.fromMap
                int r0 = r0.size()
                return r0
        }

        @Override // java.util.AbstractMap, java.util.Map
        public java.util.Collection<V2> values() {
                r1 = this;
                com.google.common.collect.Maps$Values r0 = new com.google.common.collect.Maps$Values
                r0.<init>(r1)
                return r0
        }
    }

    @com.google.common.annotations.GwtIncompatible
    public static class TransformedEntriesNavigableMap<K, V1, V2> extends com.google.common.collect.Maps.TransformedEntriesSortedMap<K, V1, V2> implements java.util.NavigableMap<K, V2> {
        public TransformedEntriesNavigableMap(java.util.NavigableMap<K, V1> r1, com.google.common.collect.Maps.EntryTransformer<? super K, ? super V1, V2> r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @javax.annotation.CheckForNull
        private java.util.Map.Entry<K, V2> transformEntry(@javax.annotation.CheckForNull java.util.Map.Entry<K, V1> r3) {
                r2 = this;
                if (r3 != 0) goto L4
                r3 = 0
                goto L12
            L4:
                com.google.common.collect.Maps$EntryTransformer<? super K, ? super V1, V2> r0 = r2.transformer
                com.google.common.base.Preconditions.checkNotNull(r0)
                com.google.common.base.Preconditions.checkNotNull(r3)
                com.google.common.collect.Maps$12 r1 = new com.google.common.collect.Maps$12
                r1.<init>(r3, r0)
                r3 = r1
            L12:
                return r3
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V2> ceilingEntry(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                java.util.NavigableMap r0 = r1.fromMap()
                java.util.Map$Entry r2 = r0.ceilingEntry(r2)
                java.util.Map$Entry r2 = r1.transformEntry(r2)
                return r2
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public K ceilingKey(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                java.util.NavigableMap r0 = r1.fromMap()
                java.lang.Object r2 = r0.ceilingKey(r2)
                return r2
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableSet<K> descendingKeySet() {
                r1 = this;
                java.util.NavigableMap r0 = r1.fromMap()
                java.util.NavigableSet r0 = r0.descendingKeySet()
                return r0
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, V2> descendingMap() {
                r2 = this;
                java.util.NavigableMap r0 = r2.fromMap()
                java.util.NavigableMap r0 = r0.descendingMap()
                com.google.common.collect.Maps$EntryTransformer<? super K, ? super V1, V2> r1 = r2.transformer
                java.util.NavigableMap r0 = com.google.common.collect.Maps.transformEntries(r0, r1)
                return r0
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V2> firstEntry() {
                r1 = this;
                java.util.NavigableMap r0 = r1.fromMap()
                java.util.Map$Entry r0 = r0.firstEntry()
                java.util.Map$Entry r0 = r1.transformEntry(r0)
                return r0
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V2> floorEntry(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                java.util.NavigableMap r0 = r1.fromMap()
                java.util.Map$Entry r2 = r0.floorEntry(r2)
                java.util.Map$Entry r2 = r1.transformEntry(r2)
                return r2
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public K floorKey(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                java.util.NavigableMap r0 = r1.fromMap()
                java.lang.Object r2 = r0.floorKey(r2)
                return r2
        }

        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap
        public final java.util.NavigableMap<K, V1> fromMap() {
                r1 = this;
                java.util.Map<K, V1> r0 = r1.fromMap
                java.util.SortedMap r0 = (java.util.SortedMap) r0
                java.util.NavigableMap r0 = (java.util.NavigableMap) r0
                return r0
        }

        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap
        public final /* bridge */ /* synthetic */ java.util.SortedMap fromMap() {
                r1 = this;
                java.util.NavigableMap r0 = r1.fromMap()
                return r0
        }

        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap, java.util.SortedMap, java.util.NavigableMap
        public java.util.NavigableMap<K, V2> headMap(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                r0 = 0
                java.util.NavigableMap r2 = r1.headMap(r2, r0)
                return r2
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, V2> headMap(@com.google.common.collect.ParametricNullness K r2, boolean r3) {
                r1 = this;
                java.util.NavigableMap r0 = r1.fromMap()
                java.util.NavigableMap r2 = r0.headMap(r2, r3)
                com.google.common.collect.Maps$EntryTransformer<? super K, ? super V1, V2> r3 = r1.transformer
                java.util.NavigableMap r2 = com.google.common.collect.Maps.transformEntries(r2, r3)
                return r2
        }

        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap, java.util.SortedMap, java.util.NavigableMap
        public /* bridge */ /* synthetic */ java.util.SortedMap headMap(@com.google.common.collect.ParametricNullness java.lang.Object r1) {
                r0 = this;
                java.util.NavigableMap r1 = r0.headMap(r1)
                return r1
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V2> higherEntry(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                java.util.NavigableMap r0 = r1.fromMap()
                java.util.Map$Entry r2 = r0.higherEntry(r2)
                java.util.Map$Entry r2 = r1.transformEntry(r2)
                return r2
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public K higherKey(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                java.util.NavigableMap r0 = r1.fromMap()
                java.lang.Object r2 = r0.higherKey(r2)
                return r2
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V2> lastEntry() {
                r1 = this;
                java.util.NavigableMap r0 = r1.fromMap()
                java.util.Map$Entry r0 = r0.lastEntry()
                java.util.Map$Entry r0 = r1.transformEntry(r0)
                return r0
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V2> lowerEntry(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                java.util.NavigableMap r0 = r1.fromMap()
                java.util.Map$Entry r2 = r0.lowerEntry(r2)
                java.util.Map$Entry r2 = r1.transformEntry(r2)
                return r2
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public K lowerKey(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                java.util.NavigableMap r0 = r1.fromMap()
                java.lang.Object r2 = r0.lowerKey(r2)
                return r2
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableSet<K> navigableKeySet() {
                r1 = this;
                java.util.NavigableMap r0 = r1.fromMap()
                java.util.NavigableSet r0 = r0.navigableKeySet()
                return r0
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V2> pollFirstEntry() {
                r1 = this;
                java.util.NavigableMap r0 = r1.fromMap()
                java.util.Map$Entry r0 = r0.pollFirstEntry()
                java.util.Map$Entry r0 = r1.transformEntry(r0)
                return r0
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V2> pollLastEntry() {
                r1 = this;
                java.util.NavigableMap r0 = r1.fromMap()
                java.util.Map$Entry r0 = r0.pollLastEntry()
                java.util.Map$Entry r0 = r1.transformEntry(r0)
                return r0
        }

        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap, java.util.SortedMap, java.util.NavigableMap
        public java.util.NavigableMap<K, V2> subMap(@com.google.common.collect.ParametricNullness K r3, @com.google.common.collect.ParametricNullness K r4) {
                r2 = this;
                r0 = 1
                r1 = 0
                java.util.NavigableMap r3 = r2.subMap(r3, r0, r4, r1)
                return r3
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, V2> subMap(@com.google.common.collect.ParametricNullness K r2, boolean r3, @com.google.common.collect.ParametricNullness K r4, boolean r5) {
                r1 = this;
                java.util.NavigableMap r0 = r1.fromMap()
                java.util.NavigableMap r2 = r0.subMap(r2, r3, r4, r5)
                com.google.common.collect.Maps$EntryTransformer<? super K, ? super V1, V2> r3 = r1.transformer
                java.util.NavigableMap r2 = com.google.common.collect.Maps.transformEntries(r2, r3)
                return r2
        }

        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap, java.util.SortedMap, java.util.NavigableMap
        public /* bridge */ /* synthetic */ java.util.SortedMap subMap(@com.google.common.collect.ParametricNullness java.lang.Object r1, @com.google.common.collect.ParametricNullness java.lang.Object r2) {
                r0 = this;
                java.util.NavigableMap r1 = r0.subMap(r1, r2)
                return r1
        }

        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap, java.util.SortedMap, java.util.NavigableMap
        public java.util.NavigableMap<K, V2> tailMap(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                r0 = 1
                java.util.NavigableMap r2 = r1.tailMap(r2, r0)
                return r2
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, V2> tailMap(@com.google.common.collect.ParametricNullness K r2, boolean r3) {
                r1 = this;
                java.util.NavigableMap r0 = r1.fromMap()
                java.util.NavigableMap r2 = r0.tailMap(r2, r3)
                com.google.common.collect.Maps$EntryTransformer<? super K, ? super V1, V2> r3 = r1.transformer
                java.util.NavigableMap r2 = com.google.common.collect.Maps.transformEntries(r2, r3)
                return r2
        }

        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap, java.util.SortedMap, java.util.NavigableMap
        public /* bridge */ /* synthetic */ java.util.SortedMap tailMap(@com.google.common.collect.ParametricNullness java.lang.Object r1) {
                r0 = this;
                java.util.NavigableMap r1 = r0.tailMap(r1)
                return r1
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class TransformedEntriesSortedMap<K, V1, V2> extends com.google.common.collect.Maps.TransformedEntriesMap<K, V1, V2> implements java.util.SortedMap<K, V2> {
        public TransformedEntriesSortedMap(java.util.SortedMap<K, V1> r1, com.google.common.collect.Maps.EntryTransformer<? super K, ? super V1, V2> r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // java.util.SortedMap
        @javax.annotation.CheckForNull
        public java.util.Comparator<? super K> comparator() {
                r1 = this;
                java.util.SortedMap r0 = r1.fromMap()
                java.util.Comparator r0 = r0.comparator()
                return r0
        }

        @Override // java.util.SortedMap
        @com.google.common.collect.ParametricNullness
        public K firstKey() {
                r1 = this;
                java.util.SortedMap r0 = r1.fromMap()
                java.lang.Object r0 = r0.firstKey()
                return r0
        }

        public java.util.SortedMap<K, V1> fromMap() {
                r1 = this;
                java.util.Map<K, V1> r0 = r1.fromMap
                java.util.SortedMap r0 = (java.util.SortedMap) r0
                return r0
        }

        public java.util.SortedMap<K, V2> headMap(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                java.util.SortedMap r0 = r1.fromMap()
                java.util.SortedMap r2 = r0.headMap(r2)
                com.google.common.collect.Maps$EntryTransformer<? super K, ? super V1, V2> r0 = r1.transformer
                java.util.SortedMap r2 = com.google.common.collect.Maps.transformEntries(r2, r0)
                return r2
        }

        @Override // java.util.SortedMap
        @com.google.common.collect.ParametricNullness
        public K lastKey() {
                r1 = this;
                java.util.SortedMap r0 = r1.fromMap()
                java.lang.Object r0 = r0.lastKey()
                return r0
        }

        public java.util.SortedMap<K, V2> subMap(@com.google.common.collect.ParametricNullness K r2, @com.google.common.collect.ParametricNullness K r3) {
                r1 = this;
                java.util.SortedMap r0 = r1.fromMap()
                java.util.SortedMap r2 = r0.subMap(r2, r3)
                com.google.common.collect.Maps$EntryTransformer<? super K, ? super V1, V2> r3 = r1.transformer
                java.util.SortedMap r2 = com.google.common.collect.Maps.transformEntries(r2, r3)
                return r2
        }

        public java.util.SortedMap<K, V2> tailMap(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                java.util.SortedMap r0 = r1.fromMap()
                java.util.SortedMap r2 = r0.tailMap(r2)
                com.google.common.collect.Maps$EntryTransformer<? super K, ? super V1, V2> r0 = r1.transformer
                java.util.SortedMap r2 = com.google.common.collect.Maps.transformEntries(r2, r0)
                return r2
        }
    }

    public static class UnmodifiableBiMap<K, V> extends com.google.common.collect.ForwardingMap<K, V> implements com.google.common.collect.BiMap<K, V>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        public final com.google.common.collect.BiMap<? extends K, ? extends V> delegate;

        @com.google.j2objc.annotations.RetainedWith
        @javax.annotation.CheckForNull
        public com.google.common.collect.BiMap<V, K> inverse;
        public final java.util.Map<K, V> unmodifiableMap;

        @javax.annotation.CheckForNull
        public transient java.util.Set<V> values;

        public UnmodifiableBiMap(com.google.common.collect.BiMap<? extends K, ? extends V> r2, @javax.annotation.CheckForNull com.google.common.collect.BiMap<V, K> r3) {
                r1 = this;
                r1.<init>()
                java.util.Map r0 = java.util.Collections.unmodifiableMap(r2)
                r1.unmodifiableMap = r0
                r1.delegate = r2
                r1.inverse = r3
                return
        }

        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public final java.lang.Object delegate() {
                r1 = this;
                java.util.Map<K, V> r0 = r1.unmodifiableMap
                return r0
        }

        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public final java.util.Map<K, V> delegate() {
                r1 = this;
                java.util.Map<K, V> r0 = r1.unmodifiableMap
                return r0
        }

        @Override // com.google.common.collect.BiMap
        @javax.annotation.CheckForNull
        public V forcePut(@com.google.common.collect.ParametricNullness K r1, @com.google.common.collect.ParametricNullness V r2) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.collect.BiMap
        public com.google.common.collect.BiMap<V, K> inverse() {
                r2 = this;
                com.google.common.collect.BiMap<V, K> r0 = r2.inverse
                if (r0 != 0) goto L11
                com.google.common.collect.Maps$UnmodifiableBiMap r0 = new com.google.common.collect.Maps$UnmodifiableBiMap
                com.google.common.collect.BiMap<? extends K, ? extends V> r1 = r2.delegate
                com.google.common.collect.BiMap r1 = r1.inverse()
                r0.<init>(r1, r2)
                r2.inverse = r0
            L11:
                return r0
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
        public /* bridge */ /* synthetic */ java.util.Collection values() {
                r1 = this;
                java.util.Set r0 = r1.values()
                return r0
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
        public java.util.Set<V> values() {
                r1 = this;
                java.util.Set<V> r0 = r1.values
                if (r0 != 0) goto L10
                com.google.common.collect.BiMap<? extends K, ? extends V> r0 = r1.delegate
                java.util.Set r0 = r0.values()
                java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
                r1.values = r0
            L10:
                return r0
        }
    }

    public static class UnmodifiableEntries<K, V> extends com.google.common.collect.ForwardingCollection<java.util.Map.Entry<K, V>> {
        private final java.util.Collection<java.util.Map.Entry<K, V>> entries;

        public UnmodifiableEntries(java.util.Collection<java.util.Map.Entry<K, V>> r1) {
                r0 = this;
                r0.<init>()
                r0.entries = r1
                return
        }

        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final java.lang.Object delegate() {
                r1 = this;
                java.util.Collection<java.util.Map$Entry<K, V>> r0 = r1.entries
                return r0
        }

        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final java.util.Collection<java.util.Map.Entry<K, V>> delegate() {
                r1 = this;
                java.util.Collection<java.util.Map$Entry<K, V>> r0 = r1.entries
                return r0
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
                r2 = this;
                java.util.Collection<java.util.Map$Entry<K, V>> r0 = r2.entries
                java.util.Iterator r0 = r0.iterator()
                com.google.common.collect.Maps$8 r1 = new com.google.common.collect.Maps$8
                r1.<init>(r0)
                return r1
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public java.lang.Object[] toArray() {
                r1 = this;
                java.lang.Object[] r0 = r1.standardToArray()
                return r0
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] r1) {
                r0 = this;
                java.lang.Object[] r1 = com.google.common.collect.ObjectArrays.toArrayImpl(r0, r1)
                return r1
        }
    }

    public static class UnmodifiableEntrySet<K, V> extends com.google.common.collect.Maps.UnmodifiableEntries<K, V> implements java.util.Set<java.util.Map.Entry<K, V>> {
        public UnmodifiableEntrySet(java.util.Set<java.util.Map.Entry<K, V>> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r1) {
                r0 = this;
                boolean r1 = com.google.common.collect.Sets.equalsImpl(r0, r1)
                return r1
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
                r1 = this;
                int r0 = com.google.common.collect.Sets.hashCodeImpl(r1)
                return r0
        }
    }

    @com.google.common.annotations.GwtIncompatible
    public static class UnmodifiableNavigableMap<K, V> extends com.google.common.collect.ForwardingSortedMap<K, V> implements java.util.NavigableMap<K, V>, java.io.Serializable {
        private final java.util.NavigableMap<K, ? extends V> delegate;

        @javax.annotation.CheckForNull
        private transient com.google.common.collect.Maps.UnmodifiableNavigableMap<K, V> descendingMap;

        public UnmodifiableNavigableMap(java.util.NavigableMap<K, ? extends V> r1) {
                r0 = this;
                r0.<init>()
                r0.delegate = r1
                return
        }

        public UnmodifiableNavigableMap(java.util.NavigableMap<K, ? extends V> r1, com.google.common.collect.Maps.UnmodifiableNavigableMap<K, V> r2) {
                r0 = this;
                r0.<init>()
                r0.delegate = r1
                r0.descendingMap = r2
                return
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V> ceilingEntry(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                java.util.NavigableMap<K, ? extends V> r0 = r1.delegate
                java.util.Map$Entry r2 = r0.ceilingEntry(r2)
                java.util.Map$Entry r2 = com.google.common.collect.Maps.access$800(r2)
                return r2
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public K ceilingKey(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                java.util.NavigableMap<K, ? extends V> r0 = r1.delegate
                java.lang.Object r2 = r0.ceilingKey(r2)
                return r2
        }

        @Override // com.google.common.collect.ForwardingSortedMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public final /* bridge */ /* synthetic */ java.lang.Object delegate() {
                r1 = this;
                java.util.SortedMap r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.ForwardingSortedMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public final /* bridge */ /* synthetic */ java.util.Map delegate() {
                r1 = this;
                java.util.SortedMap r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.ForwardingSortedMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public final java.util.SortedMap<K, V> delegate() {
                r1 = this;
                java.util.NavigableMap<K, ? extends V> r0 = r1.delegate
                java.util.SortedMap r0 = java.util.Collections.unmodifiableSortedMap(r0)
                return r0
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableSet<K> descendingKeySet() {
                r1 = this;
                java.util.NavigableMap<K, ? extends V> r0 = r1.delegate
                java.util.NavigableSet r0 = r0.descendingKeySet()
                java.util.NavigableSet r0 = com.google.common.collect.Sets.unmodifiableNavigableSet(r0)
                return r0
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, V> descendingMap() {
                r2 = this;
                com.google.common.collect.Maps$UnmodifiableNavigableMap<K, V> r0 = r2.descendingMap
                if (r0 != 0) goto L11
                com.google.common.collect.Maps$UnmodifiableNavigableMap r0 = new com.google.common.collect.Maps$UnmodifiableNavigableMap
                java.util.NavigableMap<K, ? extends V> r1 = r2.delegate
                java.util.NavigableMap r1 = r1.descendingMap()
                r0.<init>(r1, r2)
                r2.descendingMap = r0
            L11:
                return r0
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V> firstEntry() {
                r1 = this;
                java.util.NavigableMap<K, ? extends V> r0 = r1.delegate
                java.util.Map$Entry r0 = r0.firstEntry()
                java.util.Map$Entry r0 = com.google.common.collect.Maps.access$800(r0)
                return r0
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V> floorEntry(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                java.util.NavigableMap<K, ? extends V> r0 = r1.delegate
                java.util.Map$Entry r2 = r0.floorEntry(r2)
                java.util.Map$Entry r2 = com.google.common.collect.Maps.access$800(r2)
                return r2
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public K floorKey(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                java.util.NavigableMap<K, ? extends V> r0 = r1.delegate
                java.lang.Object r2 = r0.floorKey(r2)
                return r2
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, V> headMap(@com.google.common.collect.ParametricNullness K r2, boolean r3) {
                r1 = this;
                java.util.NavigableMap<K, ? extends V> r0 = r1.delegate
                java.util.NavigableMap r2 = r0.headMap(r2, r3)
                java.util.NavigableMap r2 = com.google.common.collect.Maps.unmodifiableNavigableMap(r2)
                return r2
        }

        @Override // com.google.common.collect.ForwardingSortedMap, java.util.SortedMap
        public java.util.SortedMap<K, V> headMap(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                r0 = 0
                java.util.NavigableMap r2 = r1.headMap(r2, r0)
                return r2
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V> higherEntry(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                java.util.NavigableMap<K, ? extends V> r0 = r1.delegate
                java.util.Map$Entry r2 = r0.higherEntry(r2)
                java.util.Map$Entry r2 = com.google.common.collect.Maps.access$800(r2)
                return r2
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public K higherKey(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                java.util.NavigableMap<K, ? extends V> r0 = r1.delegate
                java.lang.Object r2 = r0.higherKey(r2)
                return r2
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public java.util.Set<K> keySet() {
                r1 = this;
                java.util.NavigableSet r0 = r1.navigableKeySet()
                return r0
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V> lastEntry() {
                r1 = this;
                java.util.NavigableMap<K, ? extends V> r0 = r1.delegate
                java.util.Map$Entry r0 = r0.lastEntry()
                java.util.Map$Entry r0 = com.google.common.collect.Maps.access$800(r0)
                return r0
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V> lowerEntry(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                java.util.NavigableMap<K, ? extends V> r0 = r1.delegate
                java.util.Map$Entry r2 = r0.lowerEntry(r2)
                java.util.Map$Entry r2 = com.google.common.collect.Maps.access$800(r2)
                return r2
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public K lowerKey(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                java.util.NavigableMap<K, ? extends V> r0 = r1.delegate
                java.lang.Object r2 = r0.lowerKey(r2)
                return r2
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableSet<K> navigableKeySet() {
                r1 = this;
                java.util.NavigableMap<K, ? extends V> r0 = r1.delegate
                java.util.NavigableSet r0 = r0.navigableKeySet()
                java.util.NavigableSet r0 = com.google.common.collect.Sets.unmodifiableNavigableSet(r0)
                return r0
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public final java.util.Map.Entry<K, V> pollFirstEntry() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public final java.util.Map.Entry<K, V> pollLastEntry() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, V> subMap(@com.google.common.collect.ParametricNullness K r2, boolean r3, @com.google.common.collect.ParametricNullness K r4, boolean r5) {
                r1 = this;
                java.util.NavigableMap<K, ? extends V> r0 = r1.delegate
                java.util.NavigableMap r2 = r0.subMap(r2, r3, r4, r5)
                java.util.NavigableMap r2 = com.google.common.collect.Maps.unmodifiableNavigableMap(r2)
                return r2
        }

        @Override // com.google.common.collect.ForwardingSortedMap, java.util.SortedMap
        public java.util.SortedMap<K, V> subMap(@com.google.common.collect.ParametricNullness K r3, @com.google.common.collect.ParametricNullness K r4) {
                r2 = this;
                r0 = 1
                r1 = 0
                java.util.NavigableMap r3 = r2.subMap(r3, r0, r4, r1)
                return r3
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, V> tailMap(@com.google.common.collect.ParametricNullness K r2, boolean r3) {
                r1 = this;
                java.util.NavigableMap<K, ? extends V> r0 = r1.delegate
                java.util.NavigableMap r2 = r0.tailMap(r2, r3)
                java.util.NavigableMap r2 = com.google.common.collect.Maps.unmodifiableNavigableMap(r2)
                return r2
        }

        @Override // com.google.common.collect.ForwardingSortedMap, java.util.SortedMap
        public java.util.SortedMap<K, V> tailMap(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                r0 = 1
                java.util.NavigableMap r2 = r1.tailMap(r2, r0)
                return r2
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class ValueDifferenceImpl<V> implements com.google.common.collect.MapDifference.ValueDifference<V> {

        @com.google.common.collect.ParametricNullness
        private final V left;

        @com.google.common.collect.ParametricNullness
        private final V right;

        private ValueDifferenceImpl(@com.google.common.collect.ParametricNullness V r1, @com.google.common.collect.ParametricNullness V r2) {
                r0 = this;
                r0.<init>()
                r0.left = r1
                r0.right = r2
                return
        }

        public static <V> com.google.common.collect.MapDifference.ValueDifference<V> create(@com.google.common.collect.ParametricNullness V r1, @com.google.common.collect.ParametricNullness V r2) {
                com.google.common.collect.Maps$ValueDifferenceImpl r0 = new com.google.common.collect.Maps$ValueDifferenceImpl
                r0.<init>(r1, r2)
                return r0
        }

        @Override // com.google.common.collect.MapDifference.ValueDifference
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof com.google.common.collect.MapDifference.ValueDifference
                r1 = 0
                if (r0 == 0) goto L20
                com.google.common.collect.MapDifference$ValueDifference r4 = (com.google.common.collect.MapDifference.ValueDifference) r4
                V r0 = r3.left
                java.lang.Object r2 = r4.leftValue()
                boolean r0 = com.google.common.base.Objects.equal(r0, r2)
                if (r0 == 0) goto L20
                V r0 = r3.right
                java.lang.Object r4 = r4.rightValue()
                boolean r4 = com.google.common.base.Objects.equal(r0, r4)
                if (r4 == 0) goto L20
                r1 = 1
            L20:
                return r1
        }

        @Override // com.google.common.collect.MapDifference.ValueDifference
        public int hashCode() {
                r3 = this;
                r0 = 2
                java.lang.Object[] r0 = new java.lang.Object[r0]
                V r1 = r3.left
                r2 = 0
                r0[r2] = r1
                V r1 = r3.right
                r2 = 1
                r0[r2] = r1
                int r0 = com.google.common.base.Objects.hashCode(r0)
                return r0
        }

        @Override // com.google.common.collect.MapDifference.ValueDifference
        @com.google.common.collect.ParametricNullness
        public V leftValue() {
                r1 = this;
                V r0 = r1.left
                return r0
        }

        @Override // com.google.common.collect.MapDifference.ValueDifference
        @com.google.common.collect.ParametricNullness
        public V rightValue() {
                r1 = this;
                V r0 = r1.right
                return r0
        }

        public java.lang.String toString() {
                r5 = this;
                V r0 = r5.left
                java.lang.String r0 = java.lang.String.valueOf(r0)
                V r1 = r5.right
                java.lang.String r1 = java.lang.String.valueOf(r1)
                int r2 = r0.length()
                int r2 = r2 + 4
                int r3 = r1.length()
                int r3 = r3 + r2
                java.lang.String r2 = "("
                java.lang.String r4 = ", "
                java.lang.StringBuilder r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m1624m(r3, r2, r0, r4, r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class Values<K, V> extends java.util.AbstractCollection<V> {

        @com.google.j2objc.annotations.Weak
        public final java.util.Map<K, V> map;

        public Values(java.util.Map<K, V> r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.util.Map r1 = (java.util.Map) r1
                r0.map = r1
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
                r1 = this;
                java.util.Map<K, V> r0 = r1.map
                r0.clear()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                java.util.Map<K, V> r0 = r1.map
                boolean r2 = r0.containsValue(r2)
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
                r1 = this;
                java.util.Map<K, V> r0 = r1.map
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<V> iterator() {
                r2 = this;
                java.util.Map<K, V> r0 = r2.map
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
                com.google.common.collect.Maps$2 r1 = new com.google.common.collect.Maps$2
                r1.<init>(r0)
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(@javax.annotation.CheckForNull java.lang.Object r4) {
                r3 = this;
                boolean r4 = super.remove(r4)     // Catch: java.lang.UnsupportedOperationException -> L5
                return r4
            L5:
                java.util.Map<K, V> r0 = r3.map
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
            Lf:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L30
                java.lang.Object r1 = r0.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getValue()
                boolean r2 = com.google.common.base.Objects.equal(r4, r2)
                if (r2 == 0) goto Lf
                java.util.Map<K, V> r4 = r3.map
                java.lang.Object r0 = r1.getKey()
                r4.remove(r0)
                r4 = 1
                return r4
            L30:
                r4 = 0
                return r4
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(java.util.Collection<?> r5) {
                r4 = this;
                java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r5)     // Catch: java.lang.UnsupportedOperationException -> Lb
                java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.UnsupportedOperationException -> Lb
                boolean r5 = super.removeAll(r0)     // Catch: java.lang.UnsupportedOperationException -> Lb
                return r5
            Lb:
                java.util.HashSet r0 = com.google.common.collect.Sets.newHashSet()
                java.util.Map<K, V> r1 = r4.map
                java.util.Set r1 = r1.entrySet()
                java.util.Iterator r1 = r1.iterator()
            L19:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L37
                java.lang.Object r2 = r1.next()
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                java.lang.Object r3 = r2.getValue()
                boolean r3 = r5.contains(r3)
                if (r3 == 0) goto L19
                java.lang.Object r2 = r2.getKey()
                r0.add(r2)
                goto L19
            L37:
                java.util.Map<K, V> r5 = r4.map
                java.util.Set r5 = r5.keySet()
                boolean r5 = r5.removeAll(r0)
                return r5
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(java.util.Collection<?> r5) {
                r4 = this;
                java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r5)     // Catch: java.lang.UnsupportedOperationException -> Lb
                java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.UnsupportedOperationException -> Lb
                boolean r5 = super.retainAll(r0)     // Catch: java.lang.UnsupportedOperationException -> Lb
                return r5
            Lb:
                java.util.HashSet r0 = com.google.common.collect.Sets.newHashSet()
                java.util.Map<K, V> r1 = r4.map
                java.util.Set r1 = r1.entrySet()
                java.util.Iterator r1 = r1.iterator()
            L19:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L37
                java.lang.Object r2 = r1.next()
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                java.lang.Object r3 = r2.getValue()
                boolean r3 = r5.contains(r3)
                if (r3 == 0) goto L19
                java.lang.Object r2 = r2.getKey()
                r0.add(r2)
                goto L19
            L37:
                java.util.Map<K, V> r5 = r4.map
                java.util.Set r5 = r5.keySet()
                boolean r5 = r5.retainAll(r0)
                return r5
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
                r1 = this;
                java.util.Map<K, V> r0 = r1.map
                int r0 = r0.size()
                return r0
        }
    }

    @com.google.common.annotations.GwtCompatible
    public static abstract class ViewCachingAbstractMap<K, V> extends java.util.AbstractMap<K, V> {

        @javax.annotation.CheckForNull
        private transient java.util.Set<java.util.Map.Entry<K, V>> entrySet;

        @javax.annotation.CheckForNull
        private transient java.util.Set<K> keySet;

        @javax.annotation.CheckForNull
        private transient java.util.Collection<V> values;

        public ViewCachingAbstractMap() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract java.util.Set<java.util.Map.Entry<K, V>> createEntrySet();

        public java.util.Set<K> createKeySet() {
                r1 = this;
                com.google.common.collect.Maps$KeySet r0 = new com.google.common.collect.Maps$KeySet
                r0.<init>(r1)
                return r0
        }

        public java.util.Collection<V> createValues() {
                r1 = this;
                com.google.common.collect.Maps$Values r0 = new com.google.common.collect.Maps$Values
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.AbstractMap, java.util.Map
        public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
                r1 = this;
                java.util.Set<java.util.Map$Entry<K, V>> r0 = r1.entrySet
                if (r0 != 0) goto La
                java.util.Set r0 = r1.createEntrySet()
                r1.entrySet = r0
            La:
                return r0
        }

        @Override // java.util.AbstractMap, java.util.Map
        public java.util.Set<K> keySet() {
                r1 = this;
                java.util.Set<K> r0 = r1.keySet
                if (r0 != 0) goto La
                java.util.Set r0 = r1.createKeySet()
                r1.keySet = r0
            La:
                return r0
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        public java.util.Collection<V> values() {
                r1 = this;
                java.util.Collection<V> r0 = r1.values
                if (r0 != 0) goto La
                java.util.Collection r0 = r1.createValues()
                r1.values = r0
            La:
                return r0
        }
    }

    private Maps() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ java.util.Map access$100(java.util.Map r0) {
            java.util.Map r0 = unmodifiableMap(r0)
            return r0
    }

    public static /* synthetic */ java.util.Set access$200(java.util.Set r0) {
            java.util.Set r0 = removeOnlySet(r0)
            return r0
    }

    public static /* synthetic */ java.util.SortedSet access$300(java.util.SortedSet r0) {
            java.util.SortedSet r0 = removeOnlySortedSet(r0)
            return r0
    }

    public static /* synthetic */ java.util.NavigableSet access$400(java.util.NavigableSet r0) {
            java.util.NavigableSet r0 = removeOnlyNavigableSet(r0)
            return r0
    }

    public static /* synthetic */ java.util.Map.Entry access$800(java.util.Map.Entry r0) {
            java.util.Map$Entry r0 = unmodifiableOrNull(r0)
            return r0
    }

    public static <A, B> com.google.common.base.Converter<A, B> asConverter(com.google.common.collect.BiMap<A, B> r1) {
            com.google.common.collect.Maps$BiMapConverter r0 = new com.google.common.collect.Maps$BiMapConverter
            r0.<init>(r1)
            return r0
    }

    public static <K, V1, V2> com.google.common.collect.Maps.EntryTransformer<K, V1, V2> asEntryTransformer(com.google.common.base.Function<? super V1, V2> r1) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.collect.Maps$9 r0 = new com.google.common.collect.Maps$9
            r0.<init>(r1)
            return r0
    }

    public static <K, V> java.util.Map<K, V> asMap(java.util.Set<K> r1, com.google.common.base.Function<? super K, V> r2) {
            com.google.common.collect.Maps$AsMapView r0 = new com.google.common.collect.Maps$AsMapView
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static <K, V> java.util.NavigableMap<K, V> asMap(java.util.NavigableSet<K> r1, com.google.common.base.Function<? super K, V> r2) {
            com.google.common.collect.Maps$NavigableAsMapView r0 = new com.google.common.collect.Maps$NavigableAsMapView
            r0.<init>(r1, r2)
            return r0
    }

    public static <K, V> java.util.SortedMap<K, V> asMap(java.util.SortedSet<K> r1, com.google.common.base.Function<? super K, V> r2) {
            com.google.common.collect.Maps$SortedAsMapView r0 = new com.google.common.collect.Maps$SortedAsMapView
            r0.<init>(r1, r2)
            return r0
    }

    public static <K, V> java.util.Iterator<java.util.Map.Entry<K, V>> asMapEntryIterator(java.util.Set<K> r1, com.google.common.base.Function<? super K, V> r2) {
            com.google.common.collect.Maps$3 r0 = new com.google.common.collect.Maps$3
            java.util.Iterator r1 = r1.iterator()
            r0.<init>(r1, r2)
            return r0
    }

    public static int capacity(int r1) {
            r0 = 3
            if (r1 >= r0) goto Lb
            java.lang.String r0 = "expectedSize"
            com.google.common.collect.CollectPreconditions.checkNonnegative(r1, r0)
            int r1 = r1 + 1
            return r1
        Lb:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r1 >= r0) goto L18
            float r1 = (float) r1
            r0 = 1061158912(0x3f400000, float:0.75)
            float r1 = r1 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 + r0
            int r1 = (int) r1
            return r1
        L18:
            r1 = 2147483647(0x7fffffff, float:NaN)
            return r1
    }

    public static <K, V> com.google.common.collect.MapDifference<K, V> difference(java.util.Map<? extends K, ? extends V> r1, java.util.Map<? extends K, ? extends V> r2) {
            boolean r0 = r1 instanceof java.util.SortedMap
            if (r0 == 0) goto Lb
            java.util.SortedMap r1 = (java.util.SortedMap) r1
            com.google.common.collect.SortedMapDifference r1 = difference(r1, r2)
            return r1
        Lb:
            com.google.common.base.Equivalence r0 = com.google.common.base.Equivalence.equals()
            com.google.common.collect.MapDifference r1 = difference(r1, r2, r0)
            return r1
    }

    public static <K, V> com.google.common.collect.MapDifference<K, V> difference(java.util.Map<? extends K, ? extends V> r11, java.util.Map<? extends K, ? extends V> r12, com.google.common.base.Equivalence<? super V> r13) {
            com.google.common.base.Preconditions.checkNotNull(r13)
            java.util.LinkedHashMap r7 = newLinkedHashMap()
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>(r12)
            java.util.LinkedHashMap r9 = newLinkedHashMap()
            java.util.LinkedHashMap r10 = newLinkedHashMap()
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r7
            r4 = r8
            r5 = r9
            r6 = r10
            doDifference(r0, r1, r2, r3, r4, r5, r6)
            com.google.common.collect.Maps$MapDifferenceImpl r11 = new com.google.common.collect.Maps$MapDifferenceImpl
            r11.<init>(r7, r8, r9, r10)
            return r11
    }

    public static <K, V> com.google.common.collect.SortedMapDifference<K, V> difference(java.util.SortedMap<K, ? extends V> r11, java.util.Map<? extends K, ? extends V> r12) {
            com.google.common.base.Preconditions.checkNotNull(r11)
            com.google.common.base.Preconditions.checkNotNull(r12)
            java.util.Comparator r0 = r11.comparator()
            if (r0 == 0) goto Ld
            goto L11
        Ld:
            com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.natural()
        L11:
            java.util.TreeMap r8 = newTreeMap(r0)
            java.util.TreeMap r9 = newTreeMap(r0)
            r9.putAll(r12)
            java.util.TreeMap r10 = newTreeMap(r0)
            java.util.TreeMap r0 = newTreeMap(r0)
            com.google.common.base.Equivalence r3 = com.google.common.base.Equivalence.equals()
            r1 = r11
            r2 = r12
            r4 = r8
            r5 = r9
            r6 = r10
            r7 = r0
            doDifference(r1, r2, r3, r4, r5, r6, r7)
            com.google.common.collect.Maps$SortedMapDifferenceImpl r11 = new com.google.common.collect.Maps$SortedMapDifferenceImpl
            r11.<init>(r8, r9, r10, r0)
            return r11
    }

    private static <K, V> void doDifference(java.util.Map<? extends K, ? extends V> r4, java.util.Map<? extends K, ? extends V> r5, com.google.common.base.Equivalence<? super V> r6, java.util.Map<K, V> r7, java.util.Map<K, V> r8, java.util.Map<K, V> r9, java.util.Map<K, com.google.common.collect.MapDifference.ValueDifference<V>> r10) {
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L8:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L3c
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            boolean r2 = r5.containsKey(r1)
            if (r2 == 0) goto L38
            java.lang.Object r2 = r8.remove(r1)
            boolean r3 = r6.equivalent(r0, r2)
            if (r3 == 0) goto L30
            r9.put(r1, r0)
            goto L8
        L30:
            com.google.common.collect.MapDifference$ValueDifference r0 = com.google.common.collect.Maps.ValueDifferenceImpl.create(r0, r2)
            r10.put(r1, r0)
            goto L8
        L38:
            r7.put(r1, r0)
            goto L8
        L3c:
            return
    }

    public static boolean equalsImpl(java.util.Map<?, ?> r1, @javax.annotation.CheckForNull java.lang.Object r2) {
            if (r1 != r2) goto L4
            r1 = 1
            return r1
        L4:
            boolean r0 = r2 instanceof java.util.Map
            if (r0 == 0) goto L17
            java.util.Map r2 = (java.util.Map) r2
            java.util.Set r1 = r1.entrySet()
            java.util.Set r2 = r2.entrySet()
            boolean r1 = r1.equals(r2)
            return r1
        L17:
            r1 = 0
            return r1
    }

    public static <K, V> com.google.common.collect.BiMap<K, V> filterEntries(com.google.common.collect.BiMap<K, V> r1, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> r2) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Preconditions.checkNotNull(r2)
            boolean r0 = r1 instanceof com.google.common.collect.Maps.FilteredEntryBiMap
            if (r0 == 0) goto L11
            com.google.common.collect.Maps$FilteredEntryBiMap r1 = (com.google.common.collect.Maps.FilteredEntryBiMap) r1
            com.google.common.collect.BiMap r1 = filterFiltered(r1, r2)
            goto L17
        L11:
            com.google.common.collect.Maps$FilteredEntryBiMap r0 = new com.google.common.collect.Maps$FilteredEntryBiMap
            r0.<init>(r1, r2)
            r1 = r0
        L17:
            return r1
    }

    public static <K, V> java.util.Map<K, V> filterEntries(java.util.Map<K, V> r1, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> r2) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            boolean r0 = r1 instanceof com.google.common.collect.Maps.AbstractFilteredMap
            if (r0 == 0) goto Le
            com.google.common.collect.Maps$AbstractFilteredMap r1 = (com.google.common.collect.Maps.AbstractFilteredMap) r1
            java.util.Map r1 = filterFiltered(r1, r2)
            goto L1a
        Le:
            com.google.common.collect.Maps$FilteredEntryMap r0 = new com.google.common.collect.Maps$FilteredEntryMap
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.util.Map r1 = (java.util.Map) r1
            r0.<init>(r1, r2)
            r1 = r0
        L1a:
            return r1
    }

    @com.google.common.annotations.GwtIncompatible
    public static <K, V> java.util.NavigableMap<K, V> filterEntries(java.util.NavigableMap<K, V> r1, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> r2) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            boolean r0 = r1 instanceof com.google.common.collect.Maps.FilteredEntryNavigableMap
            if (r0 == 0) goto Le
            com.google.common.collect.Maps$FilteredEntryNavigableMap r1 = (com.google.common.collect.Maps.FilteredEntryNavigableMap) r1
            java.util.NavigableMap r1 = filterFiltered(r1, r2)
            goto L1a
        Le:
            com.google.common.collect.Maps$FilteredEntryNavigableMap r0 = new com.google.common.collect.Maps$FilteredEntryNavigableMap
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.util.NavigableMap r1 = (java.util.NavigableMap) r1
            r0.<init>(r1, r2)
            r1 = r0
        L1a:
            return r1
    }

    public static <K, V> java.util.SortedMap<K, V> filterEntries(java.util.SortedMap<K, V> r1, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> r2) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            boolean r0 = r1 instanceof com.google.common.collect.Maps.FilteredEntrySortedMap
            if (r0 == 0) goto Le
            com.google.common.collect.Maps$FilteredEntrySortedMap r1 = (com.google.common.collect.Maps.FilteredEntrySortedMap) r1
            java.util.SortedMap r1 = filterFiltered(r1, r2)
            goto L1a
        Le:
            com.google.common.collect.Maps$FilteredEntrySortedMap r0 = new com.google.common.collect.Maps$FilteredEntrySortedMap
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.util.SortedMap r1 = (java.util.SortedMap) r1
            r0.<init>(r1, r2)
            r1 = r0
        L1a:
            return r1
    }

    private static <K, V> com.google.common.collect.BiMap<K, V> filterFiltered(com.google.common.collect.Maps.FilteredEntryBiMap<K, V> r1, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> r2) {
            com.google.common.base.Predicate<? super java.util.Map$Entry<K, V>> r0 = r1.predicate
            com.google.common.base.Predicate r2 = com.google.common.base.Predicates.and(r0, r2)
            com.google.common.collect.Maps$FilteredEntryBiMap r0 = new com.google.common.collect.Maps$FilteredEntryBiMap
            java.util.Map<K, V> r1 = r1.unfiltered
            com.google.common.collect.BiMap r1 = (com.google.common.collect.BiMap) r1
            r0.<init>(r1, r2)
            return r0
    }

    private static <K, V> java.util.Map<K, V> filterFiltered(com.google.common.collect.Maps.AbstractFilteredMap<K, V> r2, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> r3) {
            com.google.common.collect.Maps$FilteredEntryMap r0 = new com.google.common.collect.Maps$FilteredEntryMap
            java.util.Map<K, V> r1 = r2.unfiltered
            com.google.common.base.Predicate<? super java.util.Map$Entry<K, V>> r2 = r2.predicate
            com.google.common.base.Predicate r2 = com.google.common.base.Predicates.and(r2, r3)
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    private static <K, V> java.util.NavigableMap<K, V> filterFiltered(com.google.common.collect.Maps.FilteredEntryNavigableMap<K, V> r1, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> r2) {
            com.google.common.base.Predicate r0 = com.google.common.collect.Maps.FilteredEntryNavigableMap.access$500(r1)
            com.google.common.base.Predicate r2 = com.google.common.base.Predicates.and(r0, r2)
            com.google.common.collect.Maps$FilteredEntryNavigableMap r0 = new com.google.common.collect.Maps$FilteredEntryNavigableMap
            java.util.NavigableMap r1 = com.google.common.collect.Maps.FilteredEntryNavigableMap.access$600(r1)
            r0.<init>(r1, r2)
            return r0
    }

    private static <K, V> java.util.SortedMap<K, V> filterFiltered(com.google.common.collect.Maps.FilteredEntrySortedMap<K, V> r1, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> r2) {
            com.google.common.base.Predicate<? super java.util.Map$Entry<K, V>> r0 = r1.predicate
            com.google.common.base.Predicate r2 = com.google.common.base.Predicates.and(r0, r2)
            com.google.common.collect.Maps$FilteredEntrySortedMap r0 = new com.google.common.collect.Maps$FilteredEntrySortedMap
            java.util.Map<K, V> r1 = r1.unfiltered
            java.util.SortedMap r1 = (java.util.SortedMap) r1
            r0.<init>(r1, r2)
            return r0
    }

    public static <K, V> com.google.common.collect.BiMap<K, V> filterKeys(com.google.common.collect.BiMap<K, V> r0, com.google.common.base.Predicate<? super K> r1) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Predicate r1 = keyPredicateOnEntries(r1)
            com.google.common.collect.BiMap r0 = filterEntries(r0, r1)
            return r0
    }

    public static <K, V> java.util.Map<K, V> filterKeys(java.util.Map<K, V> r2, com.google.common.base.Predicate<? super K> r3) {
            com.google.common.base.Preconditions.checkNotNull(r3)
            com.google.common.base.Predicate r0 = keyPredicateOnEntries(r3)
            boolean r1 = r2 instanceof com.google.common.collect.Maps.AbstractFilteredMap
            if (r1 == 0) goto L12
            com.google.common.collect.Maps$AbstractFilteredMap r2 = (com.google.common.collect.Maps.AbstractFilteredMap) r2
            java.util.Map r2 = filterFiltered(r2, r0)
            goto L1e
        L12:
            com.google.common.collect.Maps$FilteredKeyMap r1 = new com.google.common.collect.Maps$FilteredKeyMap
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            java.util.Map r2 = (java.util.Map) r2
            r1.<init>(r2, r3, r0)
            r2 = r1
        L1e:
            return r2
    }

    @com.google.common.annotations.GwtIncompatible
    public static <K, V> java.util.NavigableMap<K, V> filterKeys(java.util.NavigableMap<K, V> r0, com.google.common.base.Predicate<? super K> r1) {
            com.google.common.base.Predicate r1 = keyPredicateOnEntries(r1)
            java.util.NavigableMap r0 = filterEntries(r0, r1)
            return r0
    }

    public static <K, V> java.util.SortedMap<K, V> filterKeys(java.util.SortedMap<K, V> r0, com.google.common.base.Predicate<? super K> r1) {
            com.google.common.base.Predicate r1 = keyPredicateOnEntries(r1)
            java.util.SortedMap r0 = filterEntries(r0, r1)
            return r0
    }

    public static <K, V> com.google.common.collect.BiMap<K, V> filterValues(com.google.common.collect.BiMap<K, V> r0, com.google.common.base.Predicate<? super V> r1) {
            com.google.common.base.Predicate r1 = valuePredicateOnEntries(r1)
            com.google.common.collect.BiMap r0 = filterEntries(r0, r1)
            return r0
    }

    public static <K, V> java.util.Map<K, V> filterValues(java.util.Map<K, V> r0, com.google.common.base.Predicate<? super V> r1) {
            com.google.common.base.Predicate r1 = valuePredicateOnEntries(r1)
            java.util.Map r0 = filterEntries(r0, r1)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static <K, V> java.util.NavigableMap<K, V> filterValues(java.util.NavigableMap<K, V> r0, com.google.common.base.Predicate<? super V> r1) {
            com.google.common.base.Predicate r1 = valuePredicateOnEntries(r1)
            java.util.NavigableMap r0 = filterEntries(r0, r1)
            return r0
    }

    public static <K, V> java.util.SortedMap<K, V> filterValues(java.util.SortedMap<K, V> r0, com.google.common.base.Predicate<? super V> r1) {
            com.google.common.base.Predicate r1 = valuePredicateOnEntries(r1)
            java.util.SortedMap r0 = filterEntries(r0, r1)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static com.google.common.collect.ImmutableMap<java.lang.String, java.lang.String> fromProperties(java.util.Properties r4) {
            com.google.common.collect.ImmutableMap$Builder r0 = com.google.common.collect.ImmutableMap.builder()
            java.util.Enumeration r1 = r4.propertyNames()
        L8:
            boolean r2 = r1.hasMoreElements()
            if (r2 == 0) goto L22
            java.lang.Object r2 = r1.nextElement()
            java.util.Objects.requireNonNull(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = r4.getProperty(r2)
            java.util.Objects.requireNonNull(r3)
            r0.put(r2, r3)
            goto L8
        L22:
            com.google.common.collect.ImmutableMap r4 = r0.build()
            return r4
    }

    @com.google.common.annotations.GwtCompatible(serializable = true)
    public static <K, V> java.util.Map.Entry<K, V> immutableEntry(@com.google.common.collect.ParametricNullness K r1, @com.google.common.collect.ParametricNullness V r2) {
            com.google.common.collect.ImmutableEntry r0 = new com.google.common.collect.ImmutableEntry
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.common.annotations.GwtCompatible(serializable = true)
    public static <K extends java.lang.Enum<K>, V> com.google.common.collect.ImmutableMap<K, V> immutableEnumMap(java.util.Map<K, ? extends V> r4) {
            boolean r0 = r4 instanceof com.google.common.collect.ImmutableEnumMap
            if (r0 == 0) goto L7
            com.google.common.collect.ImmutableEnumMap r4 = (com.google.common.collect.ImmutableEnumMap) r4
            return r4
        L7:
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
            boolean r0 = r4.hasNext()
            if (r0 != 0) goto L1a
            com.google.common.collect.ImmutableMap r4 = com.google.common.collect.ImmutableMap.of()
            return r4
        L1a:
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Enum r1 = (java.lang.Enum) r1
            java.lang.Object r0 = r0.getValue()
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r1, r0)
            java.lang.Class r2 = r1.getDeclaringClass()
            java.util.EnumMap r3 = new java.util.EnumMap
            r3.<init>(r2)
            r3.put(r1, r0)
        L39:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L56
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Enum r1 = (java.lang.Enum) r1
            java.lang.Object r0 = r0.getValue()
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r1, r0)
            r3.put(r1, r0)
            goto L39
        L56:
            com.google.common.collect.ImmutableMap r4 = com.google.common.collect.ImmutableEnumMap.asImmutable(r3)
            return r4
    }

    public static <E> com.google.common.collect.ImmutableMap<E, java.lang.Integer> indexMap(java.util.Collection<E> r4) {
            com.google.common.collect.ImmutableMap$Builder r0 = new com.google.common.collect.ImmutableMap$Builder
            int r1 = r4.size()
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
            r1 = 0
        Le:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L23
            java.lang.Object r2 = r4.next()
            int r3 = r1 + 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r2, r1)
            r1 = r3
            goto Le
        L23:
            com.google.common.collect.ImmutableMap r4 = r0.build()
            return r4
    }

    @javax.annotation.CheckForNull
    public static <K> K keyOrNull(@javax.annotation.CheckForNull java.util.Map.Entry<K, ?> r0) {
            if (r0 != 0) goto L4
            r0 = 0
            goto L8
        L4:
            java.lang.Object r0 = r0.getKey()
        L8:
            return r0
    }

    public static <K> com.google.common.base.Predicate<java.util.Map.Entry<K, ?>> keyPredicateOnEntries(com.google.common.base.Predicate<? super K> r1) {
            com.google.common.collect.Maps$EntryFunction r0 = com.google.common.collect.Maps.EntryFunction.KEY
            com.google.common.base.Predicate r1 = com.google.common.base.Predicates.compose(r1, r0)
            return r1
    }

    public static <K, V> java.util.concurrent.ConcurrentMap<K, V> newConcurrentMap() {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            return r0
    }

    public static <K extends java.lang.Enum<K>, V> java.util.EnumMap<K, V> newEnumMap(java.lang.Class<K> r1) {
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.lang.Class r1 = (java.lang.Class) r1
            r0.<init>(r1)
            return r0
    }

    public static <K extends java.lang.Enum<K>, V> java.util.EnumMap<K, V> newEnumMap(java.util.Map<K, ? extends V> r1) {
            java.util.EnumMap r0 = new java.util.EnumMap
            r0.<init>(r1)
            return r0
    }

    public static <K, V> java.util.HashMap<K, V> newHashMap() {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            return r0
    }

    public static <K, V> java.util.HashMap<K, V> newHashMap(java.util.Map<? extends K, ? extends V> r1) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r1)
            return r0
    }

    public static <K, V> java.util.HashMap<K, V> newHashMapWithExpectedSize(int r1) {
            java.util.HashMap r0 = new java.util.HashMap
            int r1 = capacity(r1)
            r0.<init>(r1)
            return r0
    }

    public static <K, V> java.util.IdentityHashMap<K, V> newIdentityHashMap() {
            java.util.IdentityHashMap r0 = new java.util.IdentityHashMap
            r0.<init>()
            return r0
    }

    public static <K, V> java.util.LinkedHashMap<K, V> newLinkedHashMap() {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            return r0
    }

    public static <K, V> java.util.LinkedHashMap<K, V> newLinkedHashMap(java.util.Map<? extends K, ? extends V> r1) {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r1)
            return r0
    }

    public static <K, V> java.util.LinkedHashMap<K, V> newLinkedHashMapWithExpectedSize(int r1) {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = capacity(r1)
            r0.<init>(r1)
            return r0
    }

    public static <K extends java.lang.Comparable, V> java.util.TreeMap<K, V> newTreeMap() {
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            return r0
    }

    public static <C, K extends C, V> java.util.TreeMap<K, V> newTreeMap(@javax.annotation.CheckForNull java.util.Comparator<C> r1) {
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>(r1)
            return r0
    }

    public static <K, V> java.util.TreeMap<K, V> newTreeMap(java.util.SortedMap<K, ? extends V> r1) {
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>(r1)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    private static <E> java.util.NavigableSet<E> removeOnlyNavigableSet(java.util.NavigableSet<E> r1) {
            com.google.common.collect.Maps$6 r0 = new com.google.common.collect.Maps$6
            r0.<init>(r1)
            return r0
    }

    private static <E> java.util.Set<E> removeOnlySet(java.util.Set<E> r1) {
            com.google.common.collect.Maps$4 r0 = new com.google.common.collect.Maps$4
            r0.<init>(r1)
            return r0
    }

    private static <E> java.util.SortedSet<E> removeOnlySortedSet(java.util.SortedSet<E> r1) {
            com.google.common.collect.Maps$5 r0 = new com.google.common.collect.Maps$5
            r0.<init>(r1)
            return r0
    }

    public static boolean safeContainsKey(java.util.Map<?, ?> r0, @javax.annotation.CheckForNull java.lang.Object r1) {
            com.google.common.base.Preconditions.checkNotNull(r0)
            boolean r0 = r0.containsKey(r1)     // Catch: java.lang.Throwable -> L8
            return r0
        L8:
            r0 = 0
            return r0
    }

    @javax.annotation.CheckForNull
    public static <V> V safeGet(java.util.Map<?, V> r0, @javax.annotation.CheckForNull java.lang.Object r1) {
            com.google.common.base.Preconditions.checkNotNull(r0)
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L8
            return r0
        L8:
            r0 = 0
            return r0
    }

    @javax.annotation.CheckForNull
    public static <V> V safeRemove(java.util.Map<?, V> r0, @javax.annotation.CheckForNull java.lang.Object r1) {
            com.google.common.base.Preconditions.checkNotNull(r0)
            java.lang.Object r0 = r0.remove(r1)     // Catch: java.lang.Throwable -> L8
            return r0
        L8:
            r0 = 0
            return r0
    }

    @com.google.common.annotations.Beta
    @com.google.common.annotations.GwtIncompatible
    public static <K extends java.lang.Comparable<? super K>, V> java.util.NavigableMap<K, V> subMap(java.util.NavigableMap<K, V> r6, com.google.common.collect.Range<K> r7) {
            java.util.Comparator r0 = r6.comparator()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L38
            java.util.Comparator r0 = r6.comparator()
            com.google.common.collect.Ordering r3 = com.google.common.collect.Ordering.natural()
            if (r0 == r3) goto L38
            boolean r0 = r7.hasLowerBound()
            if (r0 == 0) goto L38
            boolean r0 = r7.hasUpperBound()
            if (r0 == 0) goto L38
            java.util.Comparator r0 = r6.comparator()
            java.lang.Comparable r3 = r7.lowerEndpoint()
            java.lang.Comparable r4 = r7.upperEndpoint()
            int r0 = r0.compare(r3, r4)
            if (r0 > 0) goto L32
            r0 = 1
            goto L33
        L32:
            r0 = 0
        L33:
            java.lang.String r3 = "map is using a custom comparator which is inconsistent with the natural ordering."
            com.google.common.base.Preconditions.checkArgument(r0, r3)
        L38:
            boolean r0 = r7.hasLowerBound()
            if (r0 == 0) goto L64
            boolean r0 = r7.hasUpperBound()
            if (r0 == 0) goto L64
            java.lang.Comparable r0 = r7.lowerEndpoint()
            com.google.common.collect.BoundType r3 = r7.lowerBoundType()
            com.google.common.collect.BoundType r4 = com.google.common.collect.BoundType.CLOSED
            if (r3 != r4) goto L52
            r3 = 1
            goto L53
        L52:
            r3 = 0
        L53:
            java.lang.Comparable r5 = r7.upperEndpoint()
            com.google.common.collect.BoundType r7 = r7.upperBoundType()
            if (r7 != r4) goto L5e
            goto L5f
        L5e:
            r1 = 0
        L5f:
            java.util.NavigableMap r6 = r6.subMap(r0, r3, r5, r1)
            return r6
        L64:
            boolean r0 = r7.hasLowerBound()
            if (r0 == 0) goto L7d
            java.lang.Comparable r0 = r7.lowerEndpoint()
            com.google.common.collect.BoundType r7 = r7.lowerBoundType()
            com.google.common.collect.BoundType r3 = com.google.common.collect.BoundType.CLOSED
            if (r7 != r3) goto L77
            goto L78
        L77:
            r1 = 0
        L78:
            java.util.NavigableMap r6 = r6.tailMap(r0, r1)
            return r6
        L7d:
            boolean r0 = r7.hasUpperBound()
            if (r0 == 0) goto L96
            java.lang.Comparable r0 = r7.upperEndpoint()
            com.google.common.collect.BoundType r7 = r7.upperBoundType()
            com.google.common.collect.BoundType r3 = com.google.common.collect.BoundType.CLOSED
            if (r7 != r3) goto L90
            goto L91
        L90:
            r1 = 0
        L91:
            java.util.NavigableMap r6 = r6.headMap(r0, r1)
            return r6
        L96:
            java.lang.Object r6 = com.google.common.base.Preconditions.checkNotNull(r6)
            java.util.NavigableMap r6 = (java.util.NavigableMap) r6
            return r6
    }

    public static <K, V> com.google.common.collect.BiMap<K, V> synchronizedBiMap(com.google.common.collect.BiMap<K, V> r1) {
            boolean r0 = r1 instanceof com.google.common.collect.Synchronized.SynchronizedBiMap
            if (r0 != 0) goto Lf
            boolean r0 = r1 instanceof com.google.common.collect.ImmutableBiMap
            if (r0 == 0) goto L9
            goto Lf
        L9:
            com.google.common.collect.Synchronized$SynchronizedBiMap r0 = new com.google.common.collect.Synchronized$SynchronizedBiMap
            r0.<init>(r1)
            r1 = r0
        Lf:
            return r1
    }

    @com.google.common.annotations.GwtIncompatible
    public static <K, V> java.util.NavigableMap<K, V> synchronizedNavigableMap(java.util.NavigableMap<K, V> r2) {
            com.google.common.collect.Synchronized$SynchronizedNavigableMap r0 = new com.google.common.collect.Synchronized$SynchronizedNavigableMap
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public static <K, V> com.google.common.collect.ImmutableMap<K, V> toMap(java.lang.Iterable<K> r0, com.google.common.base.Function<? super K, V> r1) {
            java.util.Iterator r0 = r0.iterator()
            com.google.common.collect.ImmutableMap r0 = toMap(r0, r1)
            return r0
    }

    public static <K, V> com.google.common.collect.ImmutableMap<K, V> toMap(java.util.Iterator<K> r3, com.google.common.base.Function<? super K, V> r4) {
            com.google.common.base.Preconditions.checkNotNull(r4)
            java.util.LinkedHashMap r0 = newLinkedHashMap()
        L7:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r3.next()
            java.lang.Object r2 = r4.apply(r1)
            r0.put(r1, r2)
            goto L7
        L19:
            com.google.common.collect.ImmutableMap r3 = com.google.common.collect.ImmutableMap.copyOf(r0)
            return r3
    }

    public static java.lang.String toStringImpl(java.util.Map<?, ?> r4) {
            int r0 = r4.size()
            java.lang.StringBuilder r0 = com.google.common.collect.Collections2.newStringBuilderForCollection(r0)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
            r1 = 1
        L16:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r4.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            if (r1 != 0) goto L29
            java.lang.String r1 = ", "
            r0.append(r1)
        L29:
            r1 = 0
            java.lang.Object r3 = r2.getKey()
            r0.append(r3)
            r3 = 61
            r0.append(r3)
            java.lang.Object r2 = r2.getValue()
            r0.append(r2)
            goto L16
        L3e:
            r4 = 125(0x7d, float:1.75E-43)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }

    public static <K, V1, V2> java.util.Map<K, V2> transformEntries(java.util.Map<K, V1> r1, com.google.common.collect.Maps.EntryTransformer<? super K, ? super V1, V2> r2) {
            com.google.common.collect.Maps$TransformedEntriesMap r0 = new com.google.common.collect.Maps$TransformedEntriesMap
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static <K, V1, V2> java.util.NavigableMap<K, V2> transformEntries(java.util.NavigableMap<K, V1> r1, com.google.common.collect.Maps.EntryTransformer<? super K, ? super V1, V2> r2) {
            com.google.common.collect.Maps$TransformedEntriesNavigableMap r0 = new com.google.common.collect.Maps$TransformedEntriesNavigableMap
            r0.<init>(r1, r2)
            return r0
    }

    public static <K, V1, V2> java.util.SortedMap<K, V2> transformEntries(java.util.SortedMap<K, V1> r1, com.google.common.collect.Maps.EntryTransformer<? super K, ? super V1, V2> r2) {
            com.google.common.collect.Maps$TransformedEntriesSortedMap r0 = new com.google.common.collect.Maps$TransformedEntriesSortedMap
            r0.<init>(r1, r2)
            return r0
    }

    public static <K, V1, V2> java.util.Map<K, V2> transformValues(java.util.Map<K, V1> r0, com.google.common.base.Function<? super V1, V2> r1) {
            com.google.common.collect.Maps$EntryTransformer r1 = asEntryTransformer(r1)
            java.util.Map r0 = transformEntries(r0, r1)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static <K, V1, V2> java.util.NavigableMap<K, V2> transformValues(java.util.NavigableMap<K, V1> r0, com.google.common.base.Function<? super V1, V2> r1) {
            com.google.common.collect.Maps$EntryTransformer r1 = asEntryTransformer(r1)
            java.util.NavigableMap r0 = transformEntries(r0, r1)
            return r0
    }

    public static <K, V1, V2> java.util.SortedMap<K, V2> transformValues(java.util.SortedMap<K, V1> r0, com.google.common.base.Function<? super V1, V2> r1) {
            com.google.common.collect.Maps$EntryTransformer r1 = asEntryTransformer(r1)
            java.util.SortedMap r0 = transformEntries(r0, r1)
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static <K, V> com.google.common.collect.ImmutableMap<K, V> uniqueIndex(java.lang.Iterable<V> r0, com.google.common.base.Function<? super V, K> r1) {
            java.util.Iterator r0 = r0.iterator()
            com.google.common.collect.ImmutableMap r0 = uniqueIndex(r0, r1)
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static <K, V> com.google.common.collect.ImmutableMap<K, V> uniqueIndex(java.util.Iterator<V> r3, com.google.common.base.Function<? super V, K> r4) {
            com.google.common.base.Preconditions.checkNotNull(r4)
            com.google.common.collect.ImmutableMap$Builder r0 = com.google.common.collect.ImmutableMap.builder()
        L7:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r3.next()
            java.lang.Object r2 = r4.apply(r1)
            r0.put(r2, r1)
            goto L7
        L19:
            com.google.common.collect.ImmutableMap r3 = r0.build()     // Catch: java.lang.IllegalArgumentException -> L1e
            return r3
        L1e:
            r3 = move-exception
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.getMessage()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r0 = ". To index multiple values under a key, use Multimaps.index."
            java.lang.String r3 = r3.concat(r0)
            r4.<init>(r3)
            throw r4
    }

    public static <K, V> com.google.common.collect.BiMap<K, V> unmodifiableBiMap(com.google.common.collect.BiMap<? extends K, ? extends V> r2) {
            com.google.common.collect.Maps$UnmodifiableBiMap r0 = new com.google.common.collect.Maps$UnmodifiableBiMap
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public static <K, V> java.util.Map.Entry<K, V> unmodifiableEntry(java.util.Map.Entry<? extends K, ? extends V> r1) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.collect.Maps$7 r0 = new com.google.common.collect.Maps$7
            r0.<init>(r1)
            return r0
    }

    private static <K, V> java.util.Map<K, V> unmodifiableMap(java.util.Map<K, ? extends V> r1) {
            boolean r0 = r1 instanceof java.util.SortedMap
            if (r0 == 0) goto Lb
            java.util.SortedMap r1 = (java.util.SortedMap) r1
            java.util.SortedMap r1 = java.util.Collections.unmodifiableSortedMap(r1)
            return r1
        Lb:
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)
            return r1
    }

    @com.google.common.annotations.GwtIncompatible
    public static <K, V> java.util.NavigableMap<K, V> unmodifiableNavigableMap(java.util.NavigableMap<K, ? extends V> r1) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            boolean r0 = r1 instanceof com.google.common.collect.Maps.UnmodifiableNavigableMap
            if (r0 == 0) goto L8
            return r1
        L8:
            com.google.common.collect.Maps$UnmodifiableNavigableMap r0 = new com.google.common.collect.Maps$UnmodifiableNavigableMap
            r0.<init>(r1)
            return r0
    }

    @javax.annotation.CheckForNull
    private static <K, V> java.util.Map.Entry<K, V> unmodifiableOrNull(@javax.annotation.CheckForNull java.util.Map.Entry<K, ? extends V> r0) {
            if (r0 != 0) goto L4
            r0 = 0
            goto L8
        L4:
            java.util.Map$Entry r0 = unmodifiableEntry(r0)
        L8:
            return r0
    }

    public static <V> com.google.common.base.Predicate<java.util.Map.Entry<?, V>> valuePredicateOnEntries(com.google.common.base.Predicate<? super V> r1) {
            com.google.common.collect.Maps$EntryFunction r0 = com.google.common.collect.Maps.EntryFunction.VALUE
            com.google.common.base.Predicate r1 = com.google.common.base.Predicates.compose(r1, r0)
            return r1
    }
}
