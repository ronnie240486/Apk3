package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible(emulated = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
abstract class ImmutableMapEntrySet<K, V> extends com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> {

    /* JADX INFO: loaded from: classes.dex */
    @com.google.common.annotations.GwtIncompatible
    public static class EntrySetSerializedForm<K, V> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class RegularEntrySet<K, V> extends com.google.common.collect.ImmutableMapEntrySet<K, V> {
        private final transient com.google.common.collect.ImmutableList<java.util.Map.Entry<K, V>> entries;
        private final transient com.google.common.collect.ImmutableMap<K, V> map;

        @Override // com.google.common.collect.ImmutableCollection
        @com.google.common.annotations.GwtIncompatible("not used in GWT")
        public final int copyIntoArray(java.lang.Object[] r2, int r3) {
                r1 = this;
                com.google.common.collect.ImmutableList<java.util.Map$Entry<K, V>> r0 = r1.entries
                int r2 = r0.copyIntoArray(r2, r3)
                return r2
        }

        @Override // com.google.common.collect.ImmutableSet
        public final com.google.common.collect.ImmutableList<java.util.Map.Entry<K, V>> createAsList() {
                r1 = this;
                com.google.common.collect.ImmutableList<java.util.Map$Entry<K, V>> r0 = r1.entries
                return r0
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, V>> iterator() {
                r1 = this;
                com.google.common.collect.ImmutableList<java.util.Map$Entry<K, V>> r0 = r1.entries
                com.google.common.collect.UnmodifiableIterator r0 = r0.iterator()
                return r0
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
                r1 = this;
                com.google.common.collect.UnmodifiableIterator r0 = r1.iterator()
                return r0
        }

        @Override // com.google.common.collect.ImmutableMapEntrySet
        public final com.google.common.collect.ImmutableMap<K, V> map() {
                r1 = this;
                com.google.common.collect.ImmutableMap<K, V> r0 = r1.map
                return r0
        }
    }

    public ImmutableMapEntrySet() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@javax.annotation.CheckForNull java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L20
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            com.google.common.collect.ImmutableMap r0 = r3.map()
            java.lang.Object r2 = r4.getKey()
            java.lang.Object r0 = r0.get(r2)
            if (r0 == 0) goto L20
            java.lang.Object r4 = r4.getValue()
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L20
            r1 = 1
        L20:
            return r1
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
            r1 = this;
            com.google.common.collect.ImmutableMap r0 = r1.map()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // com.google.common.collect.ImmutableSet
    @com.google.common.annotations.GwtIncompatible
    public final boolean isHashCodeFast() {
            r1 = this;
            com.google.common.collect.ImmutableMap r0 = r1.map()
            boolean r0 = r0.isHashCodeFast()
            return r0
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean isPartialView() {
            r1 = this;
            com.google.common.collect.ImmutableMap r0 = r1.map()
            boolean r0 = r0.isPartialView()
            return r0
    }

    public abstract com.google.common.collect.ImmutableMap<K, V> map();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
            r1 = this;
            com.google.common.collect.ImmutableMap r0 = r1.map()
            int r0 = r0.size()
            return r0
    }
}
