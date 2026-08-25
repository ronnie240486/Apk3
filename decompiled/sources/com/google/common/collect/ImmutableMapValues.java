package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible(emulated = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class ImmutableMapValues<K, V> extends com.google.common.collect.ImmutableCollection<V> {
    private final com.google.common.collect.ImmutableMap<K, V> map;



    @com.google.common.annotations.GwtIncompatible
    public static class SerializedForm<V> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
    }

    public ImmutableMapValues(com.google.common.collect.ImmutableMap<K, V> r1) {
            r0 = this;
            r0.<init>()
            r0.map = r1
            return
    }

    public static /* synthetic */ com.google.common.collect.ImmutableMap access$000(com.google.common.collect.ImmutableMapValues r0) {
            com.google.common.collect.ImmutableMap<K, V> r0 = r0.map
            return r0
    }

    @Override // com.google.common.collect.ImmutableCollection
    public com.google.common.collect.ImmutableList<V> asList() {
            r2 = this;
            com.google.common.collect.ImmutableMap<K, V> r0 = r2.map
            com.google.common.collect.ImmutableSet r0 = r0.entrySet()
            com.google.common.collect.ImmutableList r0 = r0.asList()
            com.google.common.collect.ImmutableMapValues$2 r1 = new com.google.common.collect.ImmutableMapValues$2
            r1.<init>(r0)
            return r1
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            if (r2 == 0) goto Le
            com.google.common.collect.UnmodifiableIterator r0 = r1.iterator()
            boolean r2 = com.google.common.collect.Iterators.contains(r0, r2)
            if (r2 == 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean isPartialView() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public com.google.common.collect.UnmodifiableIterator<V> iterator() {
            r1 = this;
            com.google.common.collect.ImmutableMapValues$1 r0 = new com.google.common.collect.ImmutableMapValues$1
            r0.<init>(r1)
            return r0
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
            com.google.common.collect.ImmutableMap<K, V> r0 = r1.map
            int r0 = r0.size()
            return r0
    }
}
