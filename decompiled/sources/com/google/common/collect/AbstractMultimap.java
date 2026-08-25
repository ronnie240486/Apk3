package com.google.common.collect;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
abstract class AbstractMultimap<K, V> implements com.google.common.collect.Multimap<K, V> {

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Map<K, java.util.Collection<V>> asMap;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Collection<java.util.Map.Entry<K, V>> entries;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Set<K> keySet;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.Multiset<K> keys;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Collection<V> values;

    /* JADX INFO: loaded from: classes2.dex */
    public class Entries extends com.google.common.collect.Multimaps.Entries<K, V> {
        public final /* synthetic */ com.google.common.collect.AbstractMultimap this$0;

        public Entries(com.google.common.collect.AbstractMultimap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
                r1 = this;
                com.google.common.collect.AbstractMultimap r0 = r1.this$0
                java.util.Iterator r0 = r0.entryIterator()
                return r0
        }

        @Override // com.google.common.collect.Multimaps.Entries
        public final com.google.common.collect.Multimap<K, V> multimap() {
                r1 = this;
                com.google.common.collect.AbstractMultimap r0 = r1.this$0
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class EntrySet extends com.google.common.collect.AbstractMultimap<K, V>.Entries implements java.util.Set<java.util.Map.Entry<K, V>> {
        public EntrySet(com.google.common.collect.AbstractMultimap r1) {
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

    /* JADX INFO: loaded from: classes2.dex */
    public class Values extends java.util.AbstractCollection<V> {
        public final /* synthetic */ com.google.common.collect.AbstractMultimap this$0;

        public Values(com.google.common.collect.AbstractMultimap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
                r1 = this;
                com.google.common.collect.AbstractMultimap r0 = r1.this$0
                r0.clear()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.AbstractMultimap r0 = r1.this$0
                boolean r2 = r0.containsValue(r2)
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<V> iterator() {
                r1 = this;
                com.google.common.collect.AbstractMultimap r0 = r1.this$0
                java.util.Iterator r0 = r0.valueIterator()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
                r1 = this;
                com.google.common.collect.AbstractMultimap r0 = r1.this$0
                int r0 = r0.size()
                return r0
        }
    }

    public AbstractMultimap() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.Map<K, java.util.Collection<V>> asMap() {
            r1 = this;
            java.util.Map<K, java.util.Collection<V>> r0 = r1.asMap
            if (r0 != 0) goto La
            java.util.Map r0 = r1.createAsMap()
            r1.asMap = r0
        La:
            return r0
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsEntry(@javax.annotation.CheckForNull java.lang.Object r2, @javax.annotation.CheckForNull java.lang.Object r3) {
            r1 = this;
            java.util.Map r0 = r1.asMap()
            java.lang.Object r2 = r0.get(r2)
            java.util.Collection r2 = (java.util.Collection) r2
            if (r2 == 0) goto L14
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L14
            r2 = 1
            goto L15
        L14:
            r2 = 0
        L15:
            return r2
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsValue(@javax.annotation.CheckForNull java.lang.Object r3) {
            r2 = this;
            java.util.Map r0 = r2.asMap()
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.contains(r3)
            if (r1 == 0) goto Lc
            r3 = 1
            return r3
        L20:
            r3 = 0
            return r3
    }

    public abstract java.util.Map<K, java.util.Collection<V>> createAsMap();

    public abstract java.util.Collection<java.util.Map.Entry<K, V>> createEntries();

    public abstract java.util.Set<K> createKeySet();

    public abstract com.google.common.collect.Multiset<K> createKeys();

    public abstract java.util.Collection<V> createValues();

    @Override // com.google.common.collect.Multimap
    public java.util.Collection<java.util.Map.Entry<K, V>> entries() {
            r1 = this;
            java.util.Collection<java.util.Map$Entry<K, V>> r0 = r1.entries
            if (r0 != 0) goto La
            java.util.Collection r0 = r1.createEntries()
            r1.entries = r0
        La:
            return r0
    }

    public abstract java.util.Iterator<java.util.Map.Entry<K, V>> entryIterator();

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            goto L18
        L4:
            boolean r0 = r2 instanceof com.google.common.collect.Multimap
            if (r0 == 0) goto L17
            com.google.common.collect.Multimap r2 = (com.google.common.collect.Multimap) r2
            java.util.Map r0 = r1.asMap()
            java.util.Map r2 = r2.asMap()
            boolean r2 = r0.equals(r2)
            goto L18
        L17:
            r2 = 0
        L18:
            return r2
    }

    @Override // com.google.common.collect.Multimap
    public int hashCode() {
            r1 = this;
            java.util.Map r0 = r1.asMap()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // com.google.common.collect.Multimap
    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.size()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // com.google.common.collect.Multimap
    public java.util.Set<K> keySet() {
            r1 = this;
            java.util.Set<K> r0 = r1.keySet
            if (r0 != 0) goto La
            java.util.Set r0 = r1.createKeySet()
            r1.keySet = r0
        La:
            return r0
    }

    @Override // com.google.common.collect.Multimap
    public com.google.common.collect.Multiset<K> keys() {
            r1 = this;
            com.google.common.collect.Multiset<K> r0 = r1.keys
            if (r0 != 0) goto La
            com.google.common.collect.Multiset r0 = r1.createKeys()
            r1.keys = r0
        La:
            return r0
    }

    @Override // com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean put(@com.google.common.collect.ParametricNullness K r1, @com.google.common.collect.ParametricNullness V r2) {
            r0 = this;
            java.util.Collection r1 = r0.get(r1)
            boolean r1 = r1.add(r2)
            return r1
    }

    @Override // com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean putAll(com.google.common.collect.Multimap<? extends K, ? extends V> r4) {
            r3 = this;
            java.util.Collection r4 = r4.entries()
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
        L9:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            boolean r1 = r3.put(r2, r1)
            r0 = r0 | r1
            goto L9
        L23:
            return r0
    }

    @Override // com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean putAll(@com.google.common.collect.ParametricNullness K r4, java.lang.Iterable<? extends V> r5) {
            r3 = this;
            com.google.common.base.Preconditions.checkNotNull(r5)
            boolean r0 = r5 instanceof java.util.Collection
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1e
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L1c
            java.util.Collection r4 = r3.get(r4)
            boolean r4 = r4.addAll(r5)
            if (r4 == 0) goto L1c
            goto L1d
        L1c:
            r1 = 0
        L1d:
            return r1
        L1e:
            java.util.Iterator r5 = r5.iterator()
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L33
            java.util.Collection r4 = r3.get(r4)
            boolean r4 = com.google.common.collect.Iterators.addAll(r4, r5)
            if (r4 == 0) goto L33
            goto L34
        L33:
            r1 = 0
        L34:
            return r1
    }

    @Override // com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean remove(@javax.annotation.CheckForNull java.lang.Object r2, @javax.annotation.CheckForNull java.lang.Object r3) {
            r1 = this;
            java.util.Map r0 = r1.asMap()
            java.lang.Object r2 = r0.get(r2)
            java.util.Collection r2 = (java.util.Collection) r2
            if (r2 == 0) goto L14
            boolean r2 = r2.remove(r3)
            if (r2 == 0) goto L14
            r2 = 1
            goto L15
        L14:
            r2 = 0
        L15:
            return r2
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public java.util.Collection<V> replaceValues(@com.google.common.collect.ParametricNullness K r2, java.lang.Iterable<? extends V> r3) {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r3)
            java.util.Collection r0 = r1.removeAll(r2)
            r1.putAll(r2, r3)
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.util.Map r0 = r1.asMap()
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.util.Iterator<V> valueIterator() {
            r2 = this;
            java.util.Collection r0 = r2.entries()
            java.util.Iterator r0 = r0.iterator()
            com.google.common.collect.Maps$2 r1 = new com.google.common.collect.Maps$2
            r1.<init>(r0)
            return r1
    }

    @Override // com.google.common.collect.Multimap
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
