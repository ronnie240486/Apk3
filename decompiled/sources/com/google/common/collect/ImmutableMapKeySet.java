package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible(emulated = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class ImmutableMapKeySet<K, V> extends com.google.common.collect.IndexedImmutableSet<K> {
    private final com.google.common.collect.ImmutableMap<K, V> map;

    @com.google.common.annotations.GwtIncompatible
    public static class KeySetSerializedForm<K> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
    }

    public ImmutableMapKeySet(com.google.common.collect.ImmutableMap<K, V> r1) {
            r0 = this;
            r0.<init>()
            r0.map = r1
            return
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            com.google.common.collect.ImmutableMap<K, V> r0 = r1.map
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // com.google.common.collect.IndexedImmutableSet
    public final K get(int r2) {
            r1 = this;
            com.google.common.collect.ImmutableMap<K, V> r0 = r1.map
            com.google.common.collect.ImmutableSet r0 = r0.entrySet()
            com.google.common.collect.ImmutableList r0 = r0.asList()
            java.lang.Object r2 = r0.get(r2)
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getKey()
            return r2
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean isPartialView() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public com.google.common.collect.UnmodifiableIterator<K> iterator() {
            r1 = this;
            com.google.common.collect.ImmutableMap<K, V> r0 = r1.map
            com.google.common.collect.UnmodifiableIterator r0 = r0.keyIterator()
            return r0
    }

    @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            com.google.common.collect.UnmodifiableIterator r0 = r1.iterator()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
            r1 = this;
            com.google.common.collect.ImmutableMap<K, V> r0 = r1.map
            int r0 = r0.size()
            return r0
    }
}
