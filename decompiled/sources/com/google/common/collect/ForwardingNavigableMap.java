package com.google.common.collect;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.annotations.GwtIncompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ForwardingNavigableMap<K, V> extends com.google.common.collect.ForwardingSortedMap<K, V> implements java.util.NavigableMap<K, V> {

    @com.google.common.annotations.Beta
    public class StandardDescendingMap extends com.google.common.collect.Maps.DescendingMap<K, V> {
        public final /* synthetic */ com.google.common.collect.ForwardingNavigableMap this$0;


        public StandardDescendingMap(com.google.common.collect.ForwardingNavigableMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // com.google.common.collect.Maps.DescendingMap
        public final java.util.Iterator<java.util.Map.Entry<K, V>> entryIterator() {
                r1 = this;
                com.google.common.collect.ForwardingNavigableMap$StandardDescendingMap$1 r0 = new com.google.common.collect.ForwardingNavigableMap$StandardDescendingMap$1
                r0.<init>(r1)
                return r0
        }

        @Override // com.google.common.collect.Maps.DescendingMap
        public final java.util.NavigableMap<K, V> forward() {
                r1 = this;
                com.google.common.collect.ForwardingNavigableMap r0 = r1.this$0
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @com.google.common.annotations.Beta
    public class StandardNavigableKeySet extends com.google.common.collect.Maps.NavigableKeySet<K, V> {
        public StandardNavigableKeySet(com.google.common.collect.ForwardingNavigableMap r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    public ForwardingNavigableMap() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public java.util.Map.Entry<K, V> ceilingEntry(@com.google.common.collect.ParametricNullness K r2) {
            r1 = this;
            java.util.NavigableMap r0 = r1.delegate()
            java.util.Map$Entry r2 = r0.ceilingEntry(r2)
            return r2
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public K ceilingKey(@com.google.common.collect.ParametricNullness K r2) {
            r1 = this;
            java.util.NavigableMap r0 = r1.delegate()
            java.lang.Object r2 = r0.ceilingKey(r2)
            return r2
    }

    @Override // com.google.common.collect.ForwardingSortedMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public final /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            java.util.NavigableMap r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingSortedMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public final /* bridge */ /* synthetic */ java.util.Map delegate() {
            r1 = this;
            java.util.NavigableMap r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingSortedMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public abstract java.util.NavigableMap<K, V> delegate();

    @Override // com.google.common.collect.ForwardingSortedMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public final /* bridge */ /* synthetic */ java.util.SortedMap delegate() {
            r1 = this;
            java.util.NavigableMap r0 = r1.delegate()
            return r0
    }

    @Override // java.util.NavigableMap
    public java.util.NavigableSet<K> descendingKeySet() {
            r1 = this;
            java.util.NavigableMap r0 = r1.delegate()
            java.util.NavigableSet r0 = r0.descendingKeySet()
            return r0
    }

    @Override // java.util.NavigableMap
    public java.util.NavigableMap<K, V> descendingMap() {
            r1 = this;
            java.util.NavigableMap r0 = r1.delegate()
            java.util.NavigableMap r0 = r0.descendingMap()
            return r0
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public java.util.Map.Entry<K, V> firstEntry() {
            r1 = this;
            java.util.NavigableMap r0 = r1.delegate()
            java.util.Map$Entry r0 = r0.firstEntry()
            return r0
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public java.util.Map.Entry<K, V> floorEntry(@com.google.common.collect.ParametricNullness K r2) {
            r1 = this;
            java.util.NavigableMap r0 = r1.delegate()
            java.util.Map$Entry r2 = r0.floorEntry(r2)
            return r2
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public K floorKey(@com.google.common.collect.ParametricNullness K r2) {
            r1 = this;
            java.util.NavigableMap r0 = r1.delegate()
            java.lang.Object r2 = r0.floorKey(r2)
            return r2
    }

    @Override // java.util.NavigableMap
    public java.util.NavigableMap<K, V> headMap(@com.google.common.collect.ParametricNullness K r2, boolean r3) {
            r1 = this;
            java.util.NavigableMap r0 = r1.delegate()
            java.util.NavigableMap r2 = r0.headMap(r2, r3)
            return r2
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public java.util.Map.Entry<K, V> higherEntry(@com.google.common.collect.ParametricNullness K r2) {
            r1 = this;
            java.util.NavigableMap r0 = r1.delegate()
            java.util.Map$Entry r2 = r0.higherEntry(r2)
            return r2
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public K higherKey(@com.google.common.collect.ParametricNullness K r2) {
            r1 = this;
            java.util.NavigableMap r0 = r1.delegate()
            java.lang.Object r2 = r0.higherKey(r2)
            return r2
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public java.util.Map.Entry<K, V> lastEntry() {
            r1 = this;
            java.util.NavigableMap r0 = r1.delegate()
            java.util.Map$Entry r0 = r0.lastEntry()
            return r0
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public java.util.Map.Entry<K, V> lowerEntry(@com.google.common.collect.ParametricNullness K r2) {
            r1 = this;
            java.util.NavigableMap r0 = r1.delegate()
            java.util.Map$Entry r2 = r0.lowerEntry(r2)
            return r2
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public K lowerKey(@com.google.common.collect.ParametricNullness K r2) {
            r1 = this;
            java.util.NavigableMap r0 = r1.delegate()
            java.lang.Object r2 = r0.lowerKey(r2)
            return r2
    }

    @Override // java.util.NavigableMap
    public java.util.NavigableSet<K> navigableKeySet() {
            r1 = this;
            java.util.NavigableMap r0 = r1.delegate()
            java.util.NavigableSet r0 = r0.navigableKeySet()
            return r0
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public java.util.Map.Entry<K, V> pollFirstEntry() {
            r1 = this;
            java.util.NavigableMap r0 = r1.delegate()
            java.util.Map$Entry r0 = r0.pollFirstEntry()
            return r0
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public java.util.Map.Entry<K, V> pollLastEntry() {
            r1 = this;
            java.util.NavigableMap r0 = r1.delegate()
            java.util.Map$Entry r0 = r0.pollLastEntry()
            return r0
    }

    @Override // java.util.NavigableMap
    public java.util.NavigableMap<K, V> subMap(@com.google.common.collect.ParametricNullness K r2, boolean r3, @com.google.common.collect.ParametricNullness K r4, boolean r5) {
            r1 = this;
            java.util.NavigableMap r0 = r1.delegate()
            java.util.NavigableMap r2 = r0.subMap(r2, r3, r4, r5)
            return r2
    }

    @Override // java.util.NavigableMap
    public java.util.NavigableMap<K, V> tailMap(@com.google.common.collect.ParametricNullness K r2, boolean r3) {
            r1 = this;
            java.util.NavigableMap r0 = r1.delegate()
            java.util.NavigableMap r2 = r0.tailMap(r2, r3)
            return r2
    }
}
