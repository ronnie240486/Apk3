package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
class FilteredEntryMultimap<K, V> extends com.google.common.collect.AbstractMultimap<K, V> implements com.google.common.collect.FilteredMultimap<K, V> {
    public final com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> predicate;
    public final com.google.common.collect.Multimap<K, V> unfiltered;

    /* JADX INFO: loaded from: classes3.dex */
    public class AsMap extends com.google.common.collect.Maps.ViewCachingAbstractMap<K, java.util.Collection<V>> {
        public final /* synthetic */ com.google.common.collect.FilteredEntryMultimap this$0;




        public AsMap(com.google.common.collect.FilteredEntryMultimap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
                r1 = this;
                com.google.common.collect.FilteredEntryMultimap r0 = r1.this$0
                r0.clear()
                return
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object r1) {
                r0 = this;
                java.util.Collection r1 = r0.get(r1)
                if (r1 == 0) goto L8
                r1 = 1
                goto L9
            L8:
                r1 = 0
            L9:
                return r1
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final java.util.Set<java.util.Map.Entry<K, java.util.Collection<V>>> createEntrySet() {
                r1 = this;
                com.google.common.collect.FilteredEntryMultimap$AsMap$1EntrySetImpl r0 = new com.google.common.collect.FilteredEntryMultimap$AsMap$1EntrySetImpl
                r0.<init>(r1)
                return r0
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final java.util.Set<K> createKeySet() {
                r1 = this;
                com.google.common.collect.FilteredEntryMultimap$AsMap$1KeySetImpl r0 = new com.google.common.collect.FilteredEntryMultimap$AsMap$1KeySetImpl
                r0.<init>(r1)
                return r0
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final java.util.Collection<java.util.Collection<V>> createValues() {
                r1 = this;
                com.google.common.collect.FilteredEntryMultimap$AsMap$1ValuesImpl r0 = new com.google.common.collect.FilteredEntryMultimap$AsMap$1ValuesImpl
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
        public java.util.Collection<V> get(@javax.annotation.CheckForNull java.lang.Object r5) {
                r4 = this;
                com.google.common.collect.FilteredEntryMultimap r0 = r4.this$0
                com.google.common.collect.Multimap<K, V> r0 = r0.unfiltered
                java.util.Map r0 = r0.asMap()
                java.lang.Object r0 = r0.get(r5)
                java.util.Collection r0 = (java.util.Collection) r0
                r1 = 0
                if (r0 != 0) goto L12
                return r1
            L12:
                com.google.common.collect.FilteredEntryMultimap$ValuePredicate r2 = new com.google.common.collect.FilteredEntryMultimap$ValuePredicate
                com.google.common.collect.FilteredEntryMultimap r3 = r4.this$0
                r2.<init>(r3, r5)
                java.util.Collection r5 = com.google.common.collect.FilteredEntryMultimap.filterCollection(r0, r2)
                boolean r0 = r5.isEmpty()
                if (r0 == 0) goto L24
                goto L25
            L24:
                r1 = r5
            L25:
                return r1
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
        public java.util.Collection<V> remove(@javax.annotation.CheckForNull java.lang.Object r6) {
                r5 = this;
                com.google.common.collect.FilteredEntryMultimap r0 = r5.this$0
                com.google.common.collect.Multimap<K, V> r0 = r0.unfiltered
                java.util.Map r0 = r0.asMap()
                java.lang.Object r0 = r0.get(r6)
                java.util.Collection r0 = (java.util.Collection) r0
                r1 = 0
                if (r0 != 0) goto L12
                return r1
            L12:
                java.util.ArrayList r2 = com.google.common.collect.Lists.newArrayList()
                java.util.Iterator r0 = r0.iterator()
            L1a:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L33
                java.lang.Object r3 = r0.next()
                com.google.common.collect.FilteredEntryMultimap r4 = r5.this$0
                boolean r4 = com.google.common.collect.FilteredEntryMultimap.access$000(r4, r6, r3)
                if (r4 == 0) goto L1a
                r0.remove()
                r2.add(r3)
                goto L1a
            L33:
                boolean r6 = r2.isEmpty()
                if (r6 == 0) goto L3a
                return r1
            L3a:
                com.google.common.collect.FilteredEntryMultimap r6 = r5.this$0
                com.google.common.collect.Multimap<K, V> r6 = r6.unfiltered
                boolean r6 = r6 instanceof com.google.common.collect.SetMultimap
                if (r6 == 0) goto L4b
                java.util.LinkedHashSet r6 = com.google.common.collect.Sets.newLinkedHashSet(r2)
                java.util.Set r6 = java.util.Collections.unmodifiableSet(r6)
                return r6
            L4b:
                java.util.List r6 = java.util.Collections.unmodifiableList(r2)
                return r6
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Keys extends com.google.common.collect.Multimaps.Keys<K, V> {
        public final /* synthetic */ com.google.common.collect.FilteredEntryMultimap this$0;


        public Keys(com.google.common.collect.FilteredEntryMultimap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public java.util.Set<com.google.common.collect.Multiset.Entry<K>> entrySet() {
                r1 = this;
                com.google.common.collect.FilteredEntryMultimap$Keys$1 r0 = new com.google.common.collect.FilteredEntryMultimap$Keys$1
                r0.<init>(r1)
                return r0
        }

        @Override // com.google.common.collect.Multimaps.Keys, com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public int remove(@javax.annotation.CheckForNull java.lang.Object r5, int r6) {
                r4 = this;
                java.lang.String r0 = "occurrences"
                com.google.common.collect.CollectPreconditions.checkNonnegative(r6, r0)
                if (r6 != 0) goto Lc
                int r5 = r4.count(r5)
                return r5
            Lc:
                com.google.common.collect.FilteredEntryMultimap r0 = r4.this$0
                com.google.common.collect.Multimap<K, V> r0 = r0.unfiltered
                java.util.Map r0 = r0.asMap()
                java.lang.Object r0 = r0.get(r5)
                java.util.Collection r0 = (java.util.Collection) r0
                r1 = 0
                if (r0 != 0) goto L1e
                return r1
            L1e:
                java.util.Iterator r0 = r0.iterator()
            L22:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L3c
                java.lang.Object r2 = r0.next()
                com.google.common.collect.FilteredEntryMultimap r3 = r4.this$0
                boolean r2 = com.google.common.collect.FilteredEntryMultimap.access$000(r3, r5, r2)
                if (r2 == 0) goto L22
                int r1 = r1 + 1
                if (r1 > r6) goto L22
                r0.remove()
                goto L22
            L3c:
                return r1
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public final class ValuePredicate implements com.google.common.base.Predicate<V> {

        @com.google.common.collect.ParametricNullness
        private final K key;
        public final /* synthetic */ com.google.common.collect.FilteredEntryMultimap this$0;

        public ValuePredicate(@com.google.common.collect.ParametricNullness com.google.common.collect.FilteredEntryMultimap r1, K r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.key = r2
                return
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(@com.google.common.collect.ParametricNullness V r3) {
                r2 = this;
                com.google.common.collect.FilteredEntryMultimap r0 = r2.this$0
                K r1 = r2.key
                boolean r3 = com.google.common.collect.FilteredEntryMultimap.access$000(r0, r1, r3)
                return r3
        }
    }

    public FilteredEntryMultimap(com.google.common.collect.Multimap<K, V> r1, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> r2) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.collect.Multimap r1 = (com.google.common.collect.Multimap) r1
            r0.unfiltered = r1
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.base.Predicate r1 = (com.google.common.base.Predicate) r1
            r0.predicate = r1
            return
    }

    public static /* synthetic */ boolean access$000(com.google.common.collect.FilteredEntryMultimap r0, java.lang.Object r1, java.lang.Object r2) {
            boolean r0 = r0.satisfies(r1, r2)
            return r0
    }

    public static <E> java.util.Collection<E> filterCollection(java.util.Collection<E> r1, com.google.common.base.Predicate<? super E> r2) {
            boolean r0 = r1 instanceof java.util.Set
            if (r0 == 0) goto Lb
            java.util.Set r1 = (java.util.Set) r1
            java.util.Set r1 = com.google.common.collect.Sets.filter(r1, r2)
            return r1
        Lb:
            java.util.Collection r1 = com.google.common.collect.Collections2.filter(r1, r2)
            return r1
    }

    private boolean satisfies(@com.google.common.collect.ParametricNullness K r2, @com.google.common.collect.ParametricNullness V r3) {
            r1 = this;
            com.google.common.base.Predicate<? super java.util.Map$Entry<K, V>> r0 = r1.predicate
            java.util.Map$Entry r2 = com.google.common.collect.Maps.immutableEntry(r2, r3)
            boolean r2 = r0.apply(r2)
            return r2
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
            r1 = this;
            java.util.Collection r0 = r1.entries()
            r0.clear()
            return
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.asMap()
            java.lang.Object r2 = r0.get(r2)
            if (r2 == 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final java.util.Map<K, java.util.Collection<V>> createAsMap() {
            r1 = this;
            com.google.common.collect.FilteredEntryMultimap$AsMap r0 = new com.google.common.collect.FilteredEntryMultimap$AsMap
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap
    public java.util.Collection<java.util.Map.Entry<K, V>> createEntries() {
            r2 = this;
            com.google.common.collect.Multimap<K, V> r0 = r2.unfiltered
            java.util.Collection r0 = r0.entries()
            com.google.common.base.Predicate<? super java.util.Map$Entry<K, V>> r1 = r2.predicate
            java.util.Collection r0 = filterCollection(r0, r1)
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final java.util.Set<K> createKeySet() {
            r1 = this;
            java.util.Map r0 = r1.asMap()
            java.util.Set r0 = r0.keySet()
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final com.google.common.collect.Multiset<K> createKeys() {
            r1 = this;
            com.google.common.collect.FilteredEntryMultimap$Keys r0 = new com.google.common.collect.FilteredEntryMultimap$Keys
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final java.util.Collection<V> createValues() {
            r1 = this;
            com.google.common.collect.FilteredMultimapValues r0 = new com.google.common.collect.FilteredMultimapValues
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final java.util.Iterator<java.util.Map.Entry<K, V>> entryIterator() {
            r2 = this;
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "should never be called"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.common.collect.FilteredMultimap
    public com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> entryPredicate() {
            r1 = this;
            com.google.common.base.Predicate<? super java.util.Map$Entry<K, V>> r0 = r1.predicate
            return r0
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.Collection<V> get(@com.google.common.collect.ParametricNullness K r3) {
            r2 = this;
            com.google.common.collect.Multimap<K, V> r0 = r2.unfiltered
            java.util.Collection r0 = r0.get(r3)
            com.google.common.collect.FilteredEntryMultimap$ValuePredicate r1 = new com.google.common.collect.FilteredEntryMultimap$ValuePredicate
            r1.<init>(r2, r3)
            java.util.Collection r3 = filterCollection(r0, r1)
            return r3
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.Collection<V> removeAll(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.asMap()
            java.lang.Object r2 = r0.remove(r2)
            java.util.Collection r2 = (java.util.Collection) r2
            com.google.common.collect.Multimap<K, V> r0 = r1.unfiltered
            boolean r0 = r0 instanceof com.google.common.collect.SetMultimap
            if (r0 == 0) goto L15
            java.util.Set r0 = java.util.Collections.emptySet()
            goto L19
        L15:
            java.util.List r0 = java.util.Collections.emptyList()
        L19:
            java.lang.Object r2 = com.google.common.base.MoreObjects.firstNonNull(r2, r0)
            java.util.Collection r2 = (java.util.Collection) r2
            return r2
    }

    public final boolean removeEntriesIf(com.google.common.base.Predicate<? super java.util.Map.Entry<K, java.util.Collection<V>>> r7) {
            r6 = this;
            com.google.common.collect.Multimap<K, V> r0 = r6.unfiltered
            java.util.Map r0 = r0.asMap()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        Lf:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L57
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r4 = r2.getValue()
            java.util.Collection r4 = (java.util.Collection) r4
            com.google.common.collect.FilteredEntryMultimap$ValuePredicate r5 = new com.google.common.collect.FilteredEntryMultimap$ValuePredicate
            r5.<init>(r6, r3)
            java.util.Collection r4 = filterCollection(r4, r5)
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto Lf
            java.util.Map$Entry r3 = com.google.common.collect.Maps.immutableEntry(r3, r4)
            boolean r3 = r7.apply(r3)
            if (r3 == 0) goto Lf
            int r1 = r4.size()
            java.lang.Object r2 = r2.getValue()
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            if (r1 != r2) goto L52
            r0.remove()
            goto L55
        L52:
            r4.clear()
        L55:
            r1 = 1
            goto Lf
        L57:
            return r1
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
            r1 = this;
            java.util.Collection r0 = r1.entries()
            int r0 = r0.size()
            return r0
    }

    @Override // com.google.common.collect.FilteredMultimap
    public com.google.common.collect.Multimap<K, V> unfiltered() {
            r1 = this;
            com.google.common.collect.Multimap<K, V> r0 = r1.unfiltered
            return r0
    }
}
