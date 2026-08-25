package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ForwardingSortedMap<K, V> extends com.google.common.collect.ForwardingMap<K, V> implements java.util.SortedMap<K, V> {

    @com.google.common.annotations.Beta
    public class StandardKeySet extends com.google.common.collect.Maps.SortedKeySet<K, V> {
        public StandardKeySet(com.google.common.collect.ForwardingSortedMap r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    public ForwardingSortedMap() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.SortedMap
    @javax.annotation.CheckForNull
    public java.util.Comparator<? super K> comparator() {
            r1 = this;
            java.util.SortedMap r0 = r1.delegate()
            java.util.Comparator r0 = r0.comparator()
            return r0
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            java.util.SortedMap r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ java.util.Map delegate() {
            r1 = this;
            java.util.SortedMap r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public abstract java.util.SortedMap<K, V> delegate();

    @Override // java.util.SortedMap
    @com.google.common.collect.ParametricNullness
    public K firstKey() {
            r1 = this;
            java.util.SortedMap r0 = r1.delegate()
            java.lang.Object r0 = r0.firstKey()
            return r0
    }

    @Override // java.util.SortedMap
    public java.util.SortedMap<K, V> headMap(@com.google.common.collect.ParametricNullness K r2) {
            r1 = this;
            java.util.SortedMap r0 = r1.delegate()
            java.util.SortedMap r2 = r0.headMap(r2)
            return r2
    }

    @Override // java.util.SortedMap
    @com.google.common.collect.ParametricNullness
    public K lastKey() {
            r1 = this;
            java.util.SortedMap r0 = r1.delegate()
            java.lang.Object r0 = r0.lastKey()
            return r0
    }

    @Override // java.util.SortedMap
    public java.util.SortedMap<K, V> subMap(@com.google.common.collect.ParametricNullness K r2, @com.google.common.collect.ParametricNullness K r3) {
            r1 = this;
            java.util.SortedMap r0 = r1.delegate()
            java.util.SortedMap r2 = r0.subMap(r2, r3)
            return r2
    }

    @Override // java.util.SortedMap
    public java.util.SortedMap<K, V> tailMap(@com.google.common.collect.ParametricNullness K r2) {
            r1 = this;
            java.util.SortedMap r0 = r1.delegate()
            java.util.SortedMap r2 = r0.tailMap(r2)
            return r2
    }
}
