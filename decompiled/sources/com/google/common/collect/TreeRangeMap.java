package com.google.common.collect;

import java.lang.Comparable;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtIncompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class TreeRangeMap<K extends java.lang.Comparable, V> implements com.google.common.collect.RangeMap<K, V> {
    private static final com.google.common.collect.RangeMap<java.lang.Comparable<?>, java.lang.Object> EMPTY_SUB_RANGE_MAP = null;
    private final java.util.NavigableMap<com.google.common.collect.Cut<K>, com.google.common.collect.TreeRangeMap.RangeMapEntry<K, V>> entriesByLowerBound;


    /* JADX INFO: loaded from: classes3.dex */
    public final class AsMapOfRanges extends com.google.common.collect.Maps.IteratorBasedAbstractMap<com.google.common.collect.Range<K>, V> {
        public final java.lang.Iterable<java.util.Map.Entry<com.google.common.collect.Range<K>, V>> entryIterable;
        public final /* synthetic */ com.google.common.collect.TreeRangeMap this$0;

        public AsMapOfRanges(com.google.common.collect.TreeRangeMap r1, java.lang.Iterable<com.google.common.collect.TreeRangeMap.RangeMapEntry<K, V>> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.entryIterable = r2
                return
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object r1) {
                r0 = this;
                java.lang.Object r1 = r0.get(r1)
                if (r1 == 0) goto L8
                r1 = 1
                goto L9
            L8:
                r1 = 0
            L9:
                return r1
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public final java.util.Iterator<java.util.Map.Entry<com.google.common.collect.Range<K>, V>> entryIterator() {
                r1 = this;
                java.lang.Iterable<java.util.Map$Entry<com.google.common.collect.Range<K extends java.lang.Comparable>, V>> r0 = r1.entryIterable
                java.util.Iterator r0 = r0.iterator()
                return r0
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public V get(@javax.annotation.CheckForNull java.lang.Object r3) {
                r2 = this;
                boolean r0 = r3 instanceof com.google.common.collect.Range
                if (r0 == 0) goto L25
                com.google.common.collect.Range r3 = (com.google.common.collect.Range) r3
                com.google.common.collect.TreeRangeMap r0 = r2.this$0
                java.util.NavigableMap r0 = com.google.common.collect.TreeRangeMap.access$000(r0)
                com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r3.lowerBound
                java.lang.Object r0 = r0.get(r1)
                com.google.common.collect.TreeRangeMap$RangeMapEntry r0 = (com.google.common.collect.TreeRangeMap.RangeMapEntry) r0
                if (r0 == 0) goto L25
                com.google.common.collect.Range r1 = r0.getKey()
                boolean r3 = r1.equals(r3)
                if (r3 == 0) goto L25
                java.lang.Object r3 = r0.getValue()
                return r3
            L25:
                r3 = 0
                return r3
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
                r1 = this;
                com.google.common.collect.TreeRangeMap r0 = r1.this$0
                java.util.NavigableMap r0 = com.google.common.collect.TreeRangeMap.access$000(r0)
                int r0 = r0.size()
                return r0
        }
    }

    public static final class RangeMapEntry<K extends java.lang.Comparable, V> extends com.google.common.collect.AbstractMapEntry<com.google.common.collect.Range<K>, V> {
        private final com.google.common.collect.Range<K> range;
        private final V value;

        public RangeMapEntry(com.google.common.collect.Cut<K> r1, com.google.common.collect.Cut<K> r2, V r3) {
                r0 = this;
                com.google.common.collect.Range r1 = com.google.common.collect.Range.create(r1, r2)
                r0.<init>()
                r0.range = r1
                r0.value = r3
                return
        }

        public RangeMapEntry(com.google.common.collect.Range<K> r1, V r2) {
                r0 = this;
                r0.<init>()
                r0.range = r1
                r0.value = r2
                return
        }

        public boolean contains(K r2) {
                r1 = this;
                com.google.common.collect.Range<K extends java.lang.Comparable> r0 = r1.range
                boolean r2 = r0.contains(r2)
                return r2
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public com.google.common.collect.Range<K> getKey() {
                r1 = this;
                com.google.common.collect.Range<K extends java.lang.Comparable> r0 = r1.range
                return r0
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public /* bridge */ /* synthetic */ java.lang.Object getKey() {
                r1 = this;
                com.google.common.collect.Range r0 = r1.getKey()
                return r0
        }

        public final com.google.common.collect.Cut<K> getLowerBound() {
                r1 = this;
                com.google.common.collect.Range<K extends java.lang.Comparable> r0 = r1.range
                com.google.common.collect.Cut<C extends java.lang.Comparable> r0 = r0.lowerBound
                return r0
        }

        public final com.google.common.collect.Cut<K> getUpperBound() {
                r1 = this;
                com.google.common.collect.Range<K extends java.lang.Comparable> r0 = r1.range
                com.google.common.collect.Cut<C extends java.lang.Comparable> r0 = r0.upperBound
                return r0
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public V getValue() {
                r1 = this;
                V r0 = r1.value
                return r0
        }
    }

    public class SubRangeMap implements com.google.common.collect.RangeMap<K, V> {
        private final com.google.common.collect.Range<K> subRange;
        public final /* synthetic */ com.google.common.collect.TreeRangeMap this$0;


        /* JADX INFO: loaded from: classes.dex */
        public class SubRangeMapAsMap extends java.util.AbstractMap<com.google.common.collect.Range<K>, V> {
            public final /* synthetic */ com.google.common.collect.TreeRangeMap.SubRangeMap this$1;





            public SubRangeMapAsMap(com.google.common.collect.TreeRangeMap.SubRangeMap r1) {
                    r0 = this;
                    r0.this$1 = r1
                    r0.<init>()
                    return
            }

            public static /* synthetic */ boolean access$400(com.google.common.collect.TreeRangeMap.SubRangeMap.SubRangeMapAsMap r0, com.google.common.base.Predicate r1) {
                    boolean r0 = r0.removeEntryIf(r1)
                    return r0
            }

            private boolean removeEntryIf(com.google.common.base.Predicate<? super java.util.Map.Entry<com.google.common.collect.Range<K>, V>> r5) {
                    r4 = this;
                    java.util.ArrayList r0 = com.google.common.collect.Lists.newArrayList()
                    java.util.Set r1 = r4.entrySet()
                    java.util.Iterator r1 = r1.iterator()
                Lc:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto L28
                    java.lang.Object r2 = r1.next()
                    java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                    boolean r3 = r5.apply(r2)
                    if (r3 == 0) goto Lc
                    java.lang.Object r2 = r2.getKey()
                    com.google.common.collect.Range r2 = (com.google.common.collect.Range) r2
                    r0.add(r2)
                    goto Lc
                L28:
                    java.util.Iterator r5 = r0.iterator()
                L2c:
                    boolean r1 = r5.hasNext()
                    if (r1 == 0) goto L40
                    java.lang.Object r1 = r5.next()
                    com.google.common.collect.Range r1 = (com.google.common.collect.Range) r1
                    com.google.common.collect.TreeRangeMap$SubRangeMap r2 = r4.this$1
                    com.google.common.collect.TreeRangeMap r2 = r2.this$0
                    r2.remove(r1)
                    goto L2c
                L40:
                    boolean r5 = r0.isEmpty()
                    r5 = r5 ^ 1
                    return r5
            }

            @Override // java.util.AbstractMap, java.util.Map
            public void clear() {
                    r1 = this;
                    com.google.common.collect.TreeRangeMap$SubRangeMap r0 = r1.this$1
                    r0.clear()
                    return
            }

            @Override // java.util.AbstractMap, java.util.Map
            public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object r1) {
                    r0 = this;
                    java.lang.Object r1 = r0.get(r1)
                    if (r1 == 0) goto L8
                    r1 = 1
                    goto L9
                L8:
                    r1 = 0
                L9:
                    return r1
            }

            public java.util.Iterator<java.util.Map.Entry<com.google.common.collect.Range<K>, V>> entryIterator() {
                    r3 = this;
                    com.google.common.collect.TreeRangeMap$SubRangeMap r0 = r3.this$1
                    com.google.common.collect.Range r0 = com.google.common.collect.TreeRangeMap.SubRangeMap.access$300(r0)
                    boolean r0 = r0.isEmpty()
                    if (r0 == 0) goto Lf
                    com.google.common.collect.UnmodifiableListIterator<java.lang.Object> r0 = com.google.common.collect.Iterators.ArrayItr.EMPTY
                    return r0
                Lf:
                    com.google.common.collect.TreeRangeMap$SubRangeMap r0 = r3.this$1
                    com.google.common.collect.TreeRangeMap r0 = r0.this$0
                    java.util.NavigableMap r0 = com.google.common.collect.TreeRangeMap.access$000(r0)
                    com.google.common.collect.TreeRangeMap$SubRangeMap r1 = r3.this$1
                    com.google.common.collect.Range r1 = com.google.common.collect.TreeRangeMap.SubRangeMap.access$300(r1)
                    com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r1.lowerBound
                    java.lang.Object r0 = r0.floorKey(r1)
                    com.google.common.collect.Cut r0 = (com.google.common.collect.Cut) r0
                    com.google.common.collect.TreeRangeMap$SubRangeMap r1 = r3.this$1
                    com.google.common.collect.Range r1 = com.google.common.collect.TreeRangeMap.SubRangeMap.access$300(r1)
                    com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r1.lowerBound
                    java.lang.Object r0 = com.google.common.base.MoreObjects.firstNonNull(r0, r1)
                    com.google.common.collect.Cut r0 = (com.google.common.collect.Cut) r0
                    com.google.common.collect.TreeRangeMap$SubRangeMap r1 = r3.this$1
                    com.google.common.collect.TreeRangeMap r1 = r1.this$0
                    java.util.NavigableMap r1 = com.google.common.collect.TreeRangeMap.access$000(r1)
                    r2 = 1
                    java.util.NavigableMap r0 = r1.tailMap(r0, r2)
                    java.util.Collection r0 = r0.values()
                    java.util.Iterator r0 = r0.iterator()
                    com.google.common.collect.TreeRangeMap$SubRangeMap$SubRangeMapAsMap$3 r1 = new com.google.common.collect.TreeRangeMap$SubRangeMap$SubRangeMapAsMap$3
                    r1.<init>(r3, r0)
                    return r1
            }

            @Override // java.util.AbstractMap, java.util.Map
            public java.util.Set<java.util.Map.Entry<com.google.common.collect.Range<K>, V>> entrySet() {
                    r1 = this;
                    com.google.common.collect.TreeRangeMap$SubRangeMap$SubRangeMapAsMap$2 r0 = new com.google.common.collect.TreeRangeMap$SubRangeMap$SubRangeMapAsMap$2
                    r0.<init>(r1)
                    return r0
            }

            @Override // java.util.AbstractMap, java.util.Map
            @javax.annotation.CheckForNull
            public V get(@javax.annotation.CheckForNull java.lang.Object r5) {
                    r4 = this;
                    r0 = 0
                    boolean r1 = r5 instanceof com.google.common.collect.Range     // Catch: java.lang.ClassCastException -> L7e
                    if (r1 == 0) goto L7e
                    com.google.common.collect.Range r5 = (com.google.common.collect.Range) r5     // Catch: java.lang.ClassCastException -> L7e
                    com.google.common.collect.TreeRangeMap$SubRangeMap r1 = r4.this$1     // Catch: java.lang.ClassCastException -> L7e
                    com.google.common.collect.Range r1 = com.google.common.collect.TreeRangeMap.SubRangeMap.access$300(r1)     // Catch: java.lang.ClassCastException -> L7e
                    boolean r1 = r1.encloses(r5)     // Catch: java.lang.ClassCastException -> L7e
                    if (r1 == 0) goto L7e
                    boolean r1 = r5.isEmpty()     // Catch: java.lang.ClassCastException -> L7e
                    if (r1 == 0) goto L1a
                    goto L7e
                L1a:
                    com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r5.lowerBound     // Catch: java.lang.ClassCastException -> L7e
                    com.google.common.collect.TreeRangeMap$SubRangeMap r2 = r4.this$1     // Catch: java.lang.ClassCastException -> L7e
                    com.google.common.collect.Range r2 = com.google.common.collect.TreeRangeMap.SubRangeMap.access$300(r2)     // Catch: java.lang.ClassCastException -> L7e
                    com.google.common.collect.Cut<C extends java.lang.Comparable> r2 = r2.lowerBound     // Catch: java.lang.ClassCastException -> L7e
                    int r1 = r1.compareTo(r2)     // Catch: java.lang.ClassCastException -> L7e
                    if (r1 != 0) goto L43
                    com.google.common.collect.TreeRangeMap$SubRangeMap r1 = r4.this$1     // Catch: java.lang.ClassCastException -> L7e
                    com.google.common.collect.TreeRangeMap r1 = r1.this$0     // Catch: java.lang.ClassCastException -> L7e
                    java.util.NavigableMap r1 = com.google.common.collect.TreeRangeMap.access$000(r1)     // Catch: java.lang.ClassCastException -> L7e
                    com.google.common.collect.Cut<C extends java.lang.Comparable> r2 = r5.lowerBound     // Catch: java.lang.ClassCastException -> L7e
                    java.util.Map$Entry r1 = r1.floorEntry(r2)     // Catch: java.lang.ClassCastException -> L7e
                    if (r1 == 0) goto L41
                    java.lang.Object r1 = r1.getValue()     // Catch: java.lang.ClassCastException -> L7e
                    com.google.common.collect.TreeRangeMap$RangeMapEntry r1 = (com.google.common.collect.TreeRangeMap.RangeMapEntry) r1     // Catch: java.lang.ClassCastException -> L7e
                    goto L53
                L41:
                    r1 = r0
                    goto L53
                L43:
                    com.google.common.collect.TreeRangeMap$SubRangeMap r1 = r4.this$1     // Catch: java.lang.ClassCastException -> L7e
                    com.google.common.collect.TreeRangeMap r1 = r1.this$0     // Catch: java.lang.ClassCastException -> L7e
                    java.util.NavigableMap r1 = com.google.common.collect.TreeRangeMap.access$000(r1)     // Catch: java.lang.ClassCastException -> L7e
                    com.google.common.collect.Cut<C extends java.lang.Comparable> r2 = r5.lowerBound     // Catch: java.lang.ClassCastException -> L7e
                    java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.ClassCastException -> L7e
                    com.google.common.collect.TreeRangeMap$RangeMapEntry r1 = (com.google.common.collect.TreeRangeMap.RangeMapEntry) r1     // Catch: java.lang.ClassCastException -> L7e
                L53:
                    if (r1 == 0) goto L7e
                    com.google.common.collect.Range r2 = r1.getKey()     // Catch: java.lang.ClassCastException -> L7e
                    com.google.common.collect.TreeRangeMap$SubRangeMap r3 = r4.this$1     // Catch: java.lang.ClassCastException -> L7e
                    com.google.common.collect.Range r3 = com.google.common.collect.TreeRangeMap.SubRangeMap.access$300(r3)     // Catch: java.lang.ClassCastException -> L7e
                    boolean r2 = r2.isConnected(r3)     // Catch: java.lang.ClassCastException -> L7e
                    if (r2 == 0) goto L7e
                    com.google.common.collect.Range r2 = r1.getKey()     // Catch: java.lang.ClassCastException -> L7e
                    com.google.common.collect.TreeRangeMap$SubRangeMap r3 = r4.this$1     // Catch: java.lang.ClassCastException -> L7e
                    com.google.common.collect.Range r3 = com.google.common.collect.TreeRangeMap.SubRangeMap.access$300(r3)     // Catch: java.lang.ClassCastException -> L7e
                    com.google.common.collect.Range r2 = r2.intersection(r3)     // Catch: java.lang.ClassCastException -> L7e
                    boolean r5 = r2.equals(r5)     // Catch: java.lang.ClassCastException -> L7e
                    if (r5 == 0) goto L7e
                    java.lang.Object r5 = r1.getValue()     // Catch: java.lang.ClassCastException -> L7e
                    return r5
                L7e:
                    return r0
            }

            @Override // java.util.AbstractMap, java.util.Map
            public java.util.Set<com.google.common.collect.Range<K>> keySet() {
                    r1 = this;
                    com.google.common.collect.TreeRangeMap$SubRangeMap$SubRangeMapAsMap$1 r0 = new com.google.common.collect.TreeRangeMap$SubRangeMap$SubRangeMapAsMap$1
                    r0.<init>(r1, r1)
                    return r0
            }

            @Override // java.util.AbstractMap, java.util.Map
            @javax.annotation.CheckForNull
            public V remove(@javax.annotation.CheckForNull java.lang.Object r3) {
                    r2 = this;
                    java.lang.Object r0 = r2.get(r3)
                    if (r0 == 0) goto L13
                    java.util.Objects.requireNonNull(r3)
                    com.google.common.collect.Range r3 = (com.google.common.collect.Range) r3
                    com.google.common.collect.TreeRangeMap$SubRangeMap r1 = r2.this$1
                    com.google.common.collect.TreeRangeMap r1 = r1.this$0
                    r1.remove(r3)
                    return r0
                L13:
                    r3 = 0
                    return r3
            }

            @Override // java.util.AbstractMap, java.util.Map
            public java.util.Collection<V> values() {
                    r1 = this;
                    com.google.common.collect.TreeRangeMap$SubRangeMap$SubRangeMapAsMap$4 r0 = new com.google.common.collect.TreeRangeMap$SubRangeMap$SubRangeMapAsMap$4
                    r0.<init>(r1, r1)
                    return r0
            }
        }

        public SubRangeMap(com.google.common.collect.TreeRangeMap r1, com.google.common.collect.Range<K> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.subRange = r2
                return
        }

        public static /* synthetic */ com.google.common.collect.Range access$300(com.google.common.collect.TreeRangeMap.SubRangeMap r0) {
                com.google.common.collect.Range<K extends java.lang.Comparable> r0 = r0.subRange
                return r0
        }

        @Override // com.google.common.collect.RangeMap
        public java.util.Map<com.google.common.collect.Range<K>, V> asDescendingMapOfRanges() {
                r1 = this;
                com.google.common.collect.TreeRangeMap$SubRangeMap$1 r0 = new com.google.common.collect.TreeRangeMap$SubRangeMap$1
                r0.<init>(r1)
                return r0
        }

        @Override // com.google.common.collect.RangeMap
        public java.util.Map<com.google.common.collect.Range<K>, V> asMapOfRanges() {
                r1 = this;
                com.google.common.collect.TreeRangeMap$SubRangeMap$SubRangeMapAsMap r0 = new com.google.common.collect.TreeRangeMap$SubRangeMap$SubRangeMapAsMap
                r0.<init>(r1)
                return r0
        }

        @Override // com.google.common.collect.RangeMap
        public void clear() {
                r2 = this;
                com.google.common.collect.TreeRangeMap r0 = r2.this$0
                com.google.common.collect.Range<K extends java.lang.Comparable> r1 = r2.subRange
                r0.remove(r1)
                return
        }

        @Override // com.google.common.collect.RangeMap
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof com.google.common.collect.RangeMap
                if (r0 == 0) goto L13
                com.google.common.collect.RangeMap r2 = (com.google.common.collect.RangeMap) r2
                java.util.Map r0 = r1.asMapOfRanges()
                java.util.Map r2 = r2.asMapOfRanges()
                boolean r2 = r0.equals(r2)
                return r2
            L13:
                r2 = 0
                return r2
        }

        @Override // com.google.common.collect.RangeMap
        @javax.annotation.CheckForNull
        public V get(K r2) {
                r1 = this;
                com.google.common.collect.Range<K extends java.lang.Comparable> r0 = r1.subRange
                boolean r0 = r0.contains(r2)
                if (r0 == 0) goto Lf
                com.google.common.collect.TreeRangeMap r0 = r1.this$0
                java.lang.Object r2 = r0.get(r2)
                goto L10
            Lf:
                r2 = 0
            L10:
                return r2
        }

        @Override // com.google.common.collect.RangeMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<com.google.common.collect.Range<K>, V> getEntry(K r3) {
                r2 = this;
                com.google.common.collect.Range<K extends java.lang.Comparable> r0 = r2.subRange
                boolean r0 = r0.contains(r3)
                if (r0 == 0) goto L25
                com.google.common.collect.TreeRangeMap r0 = r2.this$0
                java.util.Map$Entry r3 = r0.getEntry(r3)
                if (r3 == 0) goto L25
                java.lang.Object r0 = r3.getKey()
                com.google.common.collect.Range r0 = (com.google.common.collect.Range) r0
                com.google.common.collect.Range<K extends java.lang.Comparable> r1 = r2.subRange
                com.google.common.collect.Range r0 = r0.intersection(r1)
                java.lang.Object r3 = r3.getValue()
                java.util.Map$Entry r3 = com.google.common.collect.Maps.immutableEntry(r0, r3)
                return r3
            L25:
                r3 = 0
                return r3
        }

        @Override // com.google.common.collect.RangeMap
        public int hashCode() {
                r1 = this;
                java.util.Map r0 = r1.asMapOfRanges()
                int r0 = r0.hashCode()
                return r0
        }

        @Override // com.google.common.collect.RangeMap
        public void put(com.google.common.collect.Range<K> r4, V r5) {
                r3 = this;
                com.google.common.collect.Range<K extends java.lang.Comparable> r0 = r3.subRange
                boolean r0 = r0.encloses(r4)
                com.google.common.collect.Range<K extends java.lang.Comparable> r1 = r3.subRange
                java.lang.String r2 = "Cannot put range %s into a subRangeMap(%s)"
                com.google.common.base.Preconditions.checkArgument(r0, r2, r4, r1)
                com.google.common.collect.TreeRangeMap r0 = r3.this$0
                r0.put(r4, r5)
                return
        }

        @Override // com.google.common.collect.RangeMap
        public void putAll(com.google.common.collect.RangeMap<K, V> r5) {
                r4 = this;
                java.util.Map r0 = r5.asMapOfRanges()
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto Lb
                return
            Lb:
                com.google.common.collect.Range r0 = r5.span()
                com.google.common.collect.Range<K extends java.lang.Comparable> r1 = r4.subRange
                boolean r1 = r1.encloses(r0)
                com.google.common.collect.Range<K extends java.lang.Comparable> r2 = r4.subRange
                java.lang.String r3 = "Cannot putAll rangeMap with span %s into a subRangeMap(%s)"
                com.google.common.base.Preconditions.checkArgument(r1, r3, r0, r2)
                com.google.common.collect.TreeRangeMap r0 = r4.this$0
                r0.putAll(r5)
                return
        }

        @Override // com.google.common.collect.RangeMap
        public void putCoalescing(com.google.common.collect.Range<K> r3, V r4) {
                r2 = this;
                com.google.common.collect.TreeRangeMap r0 = r2.this$0
                java.util.NavigableMap r0 = com.google.common.collect.TreeRangeMap.access$000(r0)
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L29
                com.google.common.collect.Range<K extends java.lang.Comparable> r0 = r2.subRange
                boolean r0 = r0.encloses(r3)
                if (r0 != 0) goto L15
                goto L29
            L15:
                com.google.common.collect.TreeRangeMap r0 = r2.this$0
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r4)
                com.google.common.collect.Range r3 = com.google.common.collect.TreeRangeMap.access$100(r0, r3, r1)
                com.google.common.collect.Range<K extends java.lang.Comparable> r0 = r2.subRange
                com.google.common.collect.Range r3 = r3.intersection(r0)
                r2.put(r3, r4)
                return
            L29:
                r2.put(r3, r4)
                return
        }

        @Override // com.google.common.collect.RangeMap
        public void remove(com.google.common.collect.Range<K> r3) {
                r2 = this;
                com.google.common.collect.Range<K extends java.lang.Comparable> r0 = r2.subRange
                boolean r0 = r3.isConnected(r0)
                if (r0 == 0) goto L13
                com.google.common.collect.TreeRangeMap r0 = r2.this$0
                com.google.common.collect.Range<K extends java.lang.Comparable> r1 = r2.subRange
                com.google.common.collect.Range r3 = r3.intersection(r1)
                r0.remove(r3)
            L13:
                return
        }

        @Override // com.google.common.collect.RangeMap
        public com.google.common.collect.Range<K> span() {
                r4 = this;
                com.google.common.collect.TreeRangeMap r0 = r4.this$0
                java.util.NavigableMap r0 = com.google.common.collect.TreeRangeMap.access$000(r0)
                com.google.common.collect.Range<K extends java.lang.Comparable> r1 = r4.subRange
                com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r1.lowerBound
                java.util.Map$Entry r0 = r0.floorEntry(r1)
                if (r0 == 0) goto L29
                java.lang.Object r0 = r0.getValue()
                com.google.common.collect.TreeRangeMap$RangeMapEntry r0 = (com.google.common.collect.TreeRangeMap.RangeMapEntry) r0
                com.google.common.collect.Cut r0 = r0.getUpperBound()
                com.google.common.collect.Range<K extends java.lang.Comparable> r1 = r4.subRange
                com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r1.lowerBound
                int r0 = r0.compareTo(r1)
                if (r0 <= 0) goto L29
                com.google.common.collect.Range<K extends java.lang.Comparable> r0 = r4.subRange
                com.google.common.collect.Cut<C extends java.lang.Comparable> r0 = r0.lowerBound
                goto L45
            L29:
                com.google.common.collect.TreeRangeMap r0 = r4.this$0
                java.util.NavigableMap r0 = com.google.common.collect.TreeRangeMap.access$000(r0)
                com.google.common.collect.Range<K extends java.lang.Comparable> r1 = r4.subRange
                com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r1.lowerBound
                java.lang.Object r0 = r0.ceilingKey(r1)
                com.google.common.collect.Cut r0 = (com.google.common.collect.Cut) r0
                if (r0 == 0) goto L83
                com.google.common.collect.Range<K extends java.lang.Comparable> r1 = r4.subRange
                com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r1.upperBound
                int r1 = r0.compareTo(r1)
                if (r1 >= 0) goto L83
            L45:
                com.google.common.collect.TreeRangeMap r1 = r4.this$0
                java.util.NavigableMap r1 = com.google.common.collect.TreeRangeMap.access$000(r1)
                com.google.common.collect.Range<K extends java.lang.Comparable> r2 = r4.subRange
                com.google.common.collect.Cut<C extends java.lang.Comparable> r2 = r2.upperBound
                java.util.Map$Entry r1 = r1.lowerEntry(r2)
                if (r1 == 0) goto L7d
                java.lang.Object r2 = r1.getValue()
                com.google.common.collect.TreeRangeMap$RangeMapEntry r2 = (com.google.common.collect.TreeRangeMap.RangeMapEntry) r2
                com.google.common.collect.Cut r2 = r2.getUpperBound()
                com.google.common.collect.Range<K extends java.lang.Comparable> r3 = r4.subRange
                com.google.common.collect.Cut<C extends java.lang.Comparable> r3 = r3.upperBound
                int r2 = r2.compareTo(r3)
                if (r2 < 0) goto L6e
                com.google.common.collect.Range<K extends java.lang.Comparable> r1 = r4.subRange
                com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r1.upperBound
                goto L78
            L6e:
                java.lang.Object r1 = r1.getValue()
                com.google.common.collect.TreeRangeMap$RangeMapEntry r1 = (com.google.common.collect.TreeRangeMap.RangeMapEntry) r1
                com.google.common.collect.Cut r1 = r1.getUpperBound()
            L78:
                com.google.common.collect.Range r0 = com.google.common.collect.Range.create(r0, r1)
                return r0
            L7d:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
            L83:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // com.google.common.collect.RangeMap
        public com.google.common.collect.RangeMap<K, V> subRangeMap(com.google.common.collect.Range<K> r3) {
                r2 = this;
                com.google.common.collect.Range<K extends java.lang.Comparable> r0 = r2.subRange
                boolean r0 = r3.isConnected(r0)
                if (r0 != 0) goto Lf
                com.google.common.collect.TreeRangeMap r3 = r2.this$0
                com.google.common.collect.RangeMap r3 = com.google.common.collect.TreeRangeMap.access$200(r3)
                return r3
            Lf:
                com.google.common.collect.TreeRangeMap r0 = r2.this$0
                com.google.common.collect.Range<K extends java.lang.Comparable> r1 = r2.subRange
                com.google.common.collect.Range r3 = r3.intersection(r1)
                com.google.common.collect.RangeMap r3 = r0.subRangeMap(r3)
                return r3
        }

        @Override // com.google.common.collect.RangeMap
        public java.lang.String toString() {
                r1 = this;
                java.util.Map r0 = r1.asMapOfRanges()
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            com.google.common.collect.TreeRangeMap$1 r0 = new com.google.common.collect.TreeRangeMap$1
            r0.<init>()
            com.google.common.collect.TreeRangeMap.EMPTY_SUB_RANGE_MAP = r0
            return
    }

    private TreeRangeMap() {
            r1 = this;
            r1.<init>()
            java.util.TreeMap r0 = com.google.common.collect.Maps.newTreeMap()
            r1.entriesByLowerBound = r0
            return
    }

    public static /* synthetic */ java.util.NavigableMap access$000(com.google.common.collect.TreeRangeMap r0) {
            java.util.NavigableMap<com.google.common.collect.Cut<K extends java.lang.Comparable>, com.google.common.collect.TreeRangeMap$RangeMapEntry<K extends java.lang.Comparable, V>> r0 = r0.entriesByLowerBound
            return r0
    }

    public static /* synthetic */ com.google.common.collect.Range access$100(com.google.common.collect.TreeRangeMap r0, com.google.common.collect.Range r1, java.lang.Object r2) {
            com.google.common.collect.Range r0 = r0.coalescedRange(r1, r2)
            return r0
    }

    public static /* synthetic */ com.google.common.collect.RangeMap access$200(com.google.common.collect.TreeRangeMap r0) {
            com.google.common.collect.RangeMap r0 = r0.emptySubRangeMap()
            return r0
    }

    private static <K extends java.lang.Comparable, V> com.google.common.collect.Range<K> coalesce(com.google.common.collect.Range<K> r1, V r2, @javax.annotation.CheckForNull java.util.Map.Entry<com.google.common.collect.Cut<K>, com.google.common.collect.TreeRangeMap.RangeMapEntry<K, V>> r3) {
            if (r3 == 0) goto L30
            java.lang.Object r0 = r3.getValue()
            com.google.common.collect.TreeRangeMap$RangeMapEntry r0 = (com.google.common.collect.TreeRangeMap.RangeMapEntry) r0
            com.google.common.collect.Range r0 = r0.getKey()
            boolean r0 = r0.isConnected(r1)
            if (r0 == 0) goto L30
            java.lang.Object r0 = r3.getValue()
            com.google.common.collect.TreeRangeMap$RangeMapEntry r0 = (com.google.common.collect.TreeRangeMap.RangeMapEntry) r0
            java.lang.Object r0 = r0.getValue()
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L30
            java.lang.Object r2 = r3.getValue()
            com.google.common.collect.TreeRangeMap$RangeMapEntry r2 = (com.google.common.collect.TreeRangeMap.RangeMapEntry) r2
            com.google.common.collect.Range r2 = r2.getKey()
            com.google.common.collect.Range r1 = r1.span(r2)
        L30:
            return r1
    }

    private com.google.common.collect.Range<K> coalescedRange(com.google.common.collect.Range<K> r3, V r4) {
            r2 = this;
            java.util.NavigableMap<com.google.common.collect.Cut<K extends java.lang.Comparable>, com.google.common.collect.TreeRangeMap$RangeMapEntry<K extends java.lang.Comparable, V>> r0 = r2.entriesByLowerBound
            com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r3.lowerBound
            java.util.Map$Entry r0 = r0.lowerEntry(r1)
            com.google.common.collect.Range r0 = coalesce(r3, r4, r0)
            java.util.NavigableMap<com.google.common.collect.Cut<K extends java.lang.Comparable>, com.google.common.collect.TreeRangeMap$RangeMapEntry<K extends java.lang.Comparable, V>> r1 = r2.entriesByLowerBound
            com.google.common.collect.Cut<C extends java.lang.Comparable> r3 = r3.upperBound
            java.util.Map$Entry r3 = r1.floorEntry(r3)
            com.google.common.collect.Range r3 = coalesce(r0, r4, r3)
            return r3
    }

    public static <K extends java.lang.Comparable, V> com.google.common.collect.TreeRangeMap<K, V> create() {
            com.google.common.collect.TreeRangeMap r0 = new com.google.common.collect.TreeRangeMap
            r0.<init>()
            return r0
    }

    private com.google.common.collect.RangeMap<K, V> emptySubRangeMap() {
            r1 = this;
            com.google.common.collect.RangeMap<java.lang.Comparable<?>, java.lang.Object> r0 = com.google.common.collect.TreeRangeMap.EMPTY_SUB_RANGE_MAP
            return r0
    }

    private void putRangeMapEntry(com.google.common.collect.Cut<K> r3, com.google.common.collect.Cut<K> r4, V r5) {
            r2 = this;
            java.util.NavigableMap<com.google.common.collect.Cut<K extends java.lang.Comparable>, com.google.common.collect.TreeRangeMap$RangeMapEntry<K extends java.lang.Comparable, V>> r0 = r2.entriesByLowerBound
            com.google.common.collect.TreeRangeMap$RangeMapEntry r1 = new com.google.common.collect.TreeRangeMap$RangeMapEntry
            r1.<init>(r3, r4, r5)
            r0.put(r3, r1)
            return
    }

    @Override // com.google.common.collect.RangeMap
    public java.util.Map<com.google.common.collect.Range<K>, V> asDescendingMapOfRanges() {
            r2 = this;
            com.google.common.collect.TreeRangeMap$AsMapOfRanges r0 = new com.google.common.collect.TreeRangeMap$AsMapOfRanges
            java.util.NavigableMap<com.google.common.collect.Cut<K extends java.lang.Comparable>, com.google.common.collect.TreeRangeMap$RangeMapEntry<K extends java.lang.Comparable, V>> r1 = r2.entriesByLowerBound
            java.util.NavigableMap r1 = r1.descendingMap()
            java.util.Collection r1 = r1.values()
            r0.<init>(r2, r1)
            return r0
    }

    @Override // com.google.common.collect.RangeMap
    public java.util.Map<com.google.common.collect.Range<K>, V> asMapOfRanges() {
            r2 = this;
            com.google.common.collect.TreeRangeMap$AsMapOfRanges r0 = new com.google.common.collect.TreeRangeMap$AsMapOfRanges
            java.util.NavigableMap<com.google.common.collect.Cut<K extends java.lang.Comparable>, com.google.common.collect.TreeRangeMap$RangeMapEntry<K extends java.lang.Comparable, V>> r1 = r2.entriesByLowerBound
            java.util.Collection r1 = r1.values()
            r0.<init>(r2, r1)
            return r0
    }

    @Override // com.google.common.collect.RangeMap
    public void clear() {
            r1 = this;
            java.util.NavigableMap<com.google.common.collect.Cut<K extends java.lang.Comparable>, com.google.common.collect.TreeRangeMap$RangeMapEntry<K extends java.lang.Comparable, V>> r0 = r1.entriesByLowerBound
            r0.clear()
            return
    }

    @Override // com.google.common.collect.RangeMap
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.common.collect.RangeMap
            if (r0 == 0) goto L13
            com.google.common.collect.RangeMap r2 = (com.google.common.collect.RangeMap) r2
            java.util.Map r0 = r1.asMapOfRanges()
            java.util.Map r2 = r2.asMapOfRanges()
            boolean r2 = r0.equals(r2)
            return r2
        L13:
            r2 = 0
            return r2
    }

    @Override // com.google.common.collect.RangeMap
    @javax.annotation.CheckForNull
    public V get(K r1) {
            r0 = this;
            java.util.Map$Entry r1 = r0.getEntry(r1)
            if (r1 != 0) goto L8
            r1 = 0
            goto Lc
        L8:
            java.lang.Object r1 = r1.getValue()
        Lc:
            return r1
    }

    @Override // com.google.common.collect.RangeMap
    @javax.annotation.CheckForNull
    public java.util.Map.Entry<com.google.common.collect.Range<K>, V> getEntry(K r3) {
            r2 = this;
            java.util.NavigableMap<com.google.common.collect.Cut<K extends java.lang.Comparable>, com.google.common.collect.TreeRangeMap$RangeMapEntry<K extends java.lang.Comparable, V>> r0 = r2.entriesByLowerBound
            com.google.common.collect.Cut$BelowValue r1 = new com.google.common.collect.Cut$BelowValue
            r1.<init>(r3)
            java.util.Map$Entry r0 = r0.floorEntry(r1)
            if (r0 == 0) goto L20
            java.lang.Object r1 = r0.getValue()
            com.google.common.collect.TreeRangeMap$RangeMapEntry r1 = (com.google.common.collect.TreeRangeMap.RangeMapEntry) r1
            boolean r3 = r1.contains(r3)
            if (r3 == 0) goto L20
            java.lang.Object r3 = r0.getValue()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            return r3
        L20:
            r3 = 0
            return r3
    }

    @Override // com.google.common.collect.RangeMap
    public int hashCode() {
            r1 = this;
            java.util.Map r0 = r1.asMapOfRanges()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // com.google.common.collect.RangeMap
    public void put(com.google.common.collect.Range<K> r4, V r5) {
            r3 = this;
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L18
            com.google.common.base.Preconditions.checkNotNull(r5)
            r3.remove(r4)
            java.util.NavigableMap<com.google.common.collect.Cut<K extends java.lang.Comparable>, com.google.common.collect.TreeRangeMap$RangeMapEntry<K extends java.lang.Comparable, V>> r0 = r3.entriesByLowerBound
            com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r4.lowerBound
            com.google.common.collect.TreeRangeMap$RangeMapEntry r2 = new com.google.common.collect.TreeRangeMap$RangeMapEntry
            r2.<init>(r4, r5)
            r0.put(r1, r2)
        L18:
            return
    }

    @Override // com.google.common.collect.RangeMap
    public void putAll(com.google.common.collect.RangeMap<K, V> r3) {
            r2 = this;
            java.util.Map r3 = r3.asMapOfRanges()
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        Lc:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L26
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            com.google.common.collect.Range r1 = (com.google.common.collect.Range) r1
            java.lang.Object r0 = r0.getValue()
            r2.put(r1, r0)
            goto Lc
        L26:
            return
    }

    @Override // com.google.common.collect.RangeMap
    public void putCoalescing(com.google.common.collect.Range<K> r2, V r3) {
            r1 = this;
            java.util.NavigableMap<com.google.common.collect.Cut<K extends java.lang.Comparable>, com.google.common.collect.TreeRangeMap$RangeMapEntry<K extends java.lang.Comparable, V>> r0 = r1.entriesByLowerBound
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lc
            r1.put(r2, r3)
            return
        Lc:
            java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r3)
            com.google.common.collect.Range r2 = r1.coalescedRange(r2, r0)
            r1.put(r2, r3)
            return
    }

    @Override // com.google.common.collect.RangeMap
    public void remove(com.google.common.collect.Range<K> r6) {
            r5 = this;
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L7
            return
        L7:
            java.util.NavigableMap<com.google.common.collect.Cut<K extends java.lang.Comparable>, com.google.common.collect.TreeRangeMap$RangeMapEntry<K extends java.lang.Comparable, V>> r0 = r5.entriesByLowerBound
            com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r6.lowerBound
            java.util.Map$Entry r0 = r0.lowerEntry(r1)
            if (r0 == 0) goto L55
            java.lang.Object r1 = r0.getValue()
            com.google.common.collect.TreeRangeMap$RangeMapEntry r1 = (com.google.common.collect.TreeRangeMap.RangeMapEntry) r1
            com.google.common.collect.Cut r2 = r1.getUpperBound()
            com.google.common.collect.Cut<C extends java.lang.Comparable> r3 = r6.lowerBound
            int r2 = r2.compareTo(r3)
            if (r2 <= 0) goto L55
            com.google.common.collect.Cut r2 = r1.getUpperBound()
            com.google.common.collect.Cut<C extends java.lang.Comparable> r3 = r6.upperBound
            int r2 = r2.compareTo(r3)
            if (r2 <= 0) goto L42
            com.google.common.collect.Cut<C extends java.lang.Comparable> r2 = r6.upperBound
            com.google.common.collect.Cut r3 = r1.getUpperBound()
            java.lang.Object r4 = r0.getValue()
            com.google.common.collect.TreeRangeMap$RangeMapEntry r4 = (com.google.common.collect.TreeRangeMap.RangeMapEntry) r4
            java.lang.Object r4 = r4.getValue()
            r5.putRangeMapEntry(r2, r3, r4)
        L42:
            com.google.common.collect.Cut r1 = r1.getLowerBound()
            com.google.common.collect.Cut<C extends java.lang.Comparable> r2 = r6.lowerBound
            java.lang.Object r0 = r0.getValue()
            com.google.common.collect.TreeRangeMap$RangeMapEntry r0 = (com.google.common.collect.TreeRangeMap.RangeMapEntry) r0
            java.lang.Object r0 = r0.getValue()
            r5.putRangeMapEntry(r1, r2, r0)
        L55:
            java.util.NavigableMap<com.google.common.collect.Cut<K extends java.lang.Comparable>, com.google.common.collect.TreeRangeMap$RangeMapEntry<K extends java.lang.Comparable, V>> r0 = r5.entriesByLowerBound
            com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r6.upperBound
            java.util.Map$Entry r0 = r0.lowerEntry(r1)
            if (r0 == 0) goto L84
            java.lang.Object r1 = r0.getValue()
            com.google.common.collect.TreeRangeMap$RangeMapEntry r1 = (com.google.common.collect.TreeRangeMap.RangeMapEntry) r1
            com.google.common.collect.Cut r2 = r1.getUpperBound()
            com.google.common.collect.Cut<C extends java.lang.Comparable> r3 = r6.upperBound
            int r2 = r2.compareTo(r3)
            if (r2 <= 0) goto L84
            com.google.common.collect.Cut<C extends java.lang.Comparable> r2 = r6.upperBound
            com.google.common.collect.Cut r1 = r1.getUpperBound()
            java.lang.Object r0 = r0.getValue()
            com.google.common.collect.TreeRangeMap$RangeMapEntry r0 = (com.google.common.collect.TreeRangeMap.RangeMapEntry) r0
            java.lang.Object r0 = r0.getValue()
            r5.putRangeMapEntry(r2, r1, r0)
        L84:
            java.util.NavigableMap<com.google.common.collect.Cut<K extends java.lang.Comparable>, com.google.common.collect.TreeRangeMap$RangeMapEntry<K extends java.lang.Comparable, V>> r0 = r5.entriesByLowerBound
            com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r6.lowerBound
            com.google.common.collect.Cut<C extends java.lang.Comparable> r6 = r6.upperBound
            java.util.SortedMap r6 = r0.subMap(r1, r6)
            r6.clear()
            return
    }

    @Override // com.google.common.collect.RangeMap
    public com.google.common.collect.Range<K> span() {
            r2 = this;
            java.util.NavigableMap<com.google.common.collect.Cut<K extends java.lang.Comparable>, com.google.common.collect.TreeRangeMap$RangeMapEntry<K extends java.lang.Comparable, V>> r0 = r2.entriesByLowerBound
            java.util.Map$Entry r0 = r0.firstEntry()
            java.util.NavigableMap<com.google.common.collect.Cut<K extends java.lang.Comparable>, com.google.common.collect.TreeRangeMap$RangeMapEntry<K extends java.lang.Comparable, V>> r1 = r2.entriesByLowerBound
            java.util.Map$Entry r1 = r1.lastEntry()
            if (r0 == 0) goto L2d
            if (r1 == 0) goto L2d
            java.lang.Object r0 = r0.getValue()
            com.google.common.collect.TreeRangeMap$RangeMapEntry r0 = (com.google.common.collect.TreeRangeMap.RangeMapEntry) r0
            com.google.common.collect.Range r0 = r0.getKey()
            com.google.common.collect.Cut<C extends java.lang.Comparable> r0 = r0.lowerBound
            java.lang.Object r1 = r1.getValue()
            com.google.common.collect.TreeRangeMap$RangeMapEntry r1 = (com.google.common.collect.TreeRangeMap.RangeMapEntry) r1
            com.google.common.collect.Range r1 = r1.getKey()
            com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r1.upperBound
            com.google.common.collect.Range r0 = com.google.common.collect.Range.create(r0, r1)
            return r0
        L2d:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // com.google.common.collect.RangeMap
    public com.google.common.collect.RangeMap<K, V> subRangeMap(com.google.common.collect.Range<K> r2) {
            r1 = this;
            com.google.common.collect.Range r0 = com.google.common.collect.Range.all()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lb
            return r1
        Lb:
            com.google.common.collect.TreeRangeMap$SubRangeMap r0 = new com.google.common.collect.TreeRangeMap$SubRangeMap
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.google.common.collect.RangeMap
    public java.lang.String toString() {
            r1 = this;
            java.util.NavigableMap<com.google.common.collect.Cut<K extends java.lang.Comparable>, com.google.common.collect.TreeRangeMap$RangeMapEntry<K extends java.lang.Comparable, V>> r0 = r1.entriesByLowerBound
            java.util.Collection r0 = r0.values()
            java.lang.String r0 = r0.toString()
            return r0
    }
}
