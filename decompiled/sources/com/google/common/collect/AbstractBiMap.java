package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible(emulated = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
abstract class AbstractBiMap<K, V> extends com.google.common.collect.ForwardingMap<K, V> implements com.google.common.collect.BiMap<K, V>, java.io.Serializable {

    @com.google.common.annotations.GwtIncompatible
    private static final long serialVersionUID = 0;
    private transient java.util.Map<K, V> delegate;

    @javax.annotation.CheckForNull
    private transient java.util.Set<java.util.Map.Entry<K, V>> entrySet;

    @com.google.j2objc.annotations.RetainedWith
    public transient com.google.common.collect.AbstractBiMap<V, K> inverse;

    @javax.annotation.CheckForNull
    private transient java.util.Set<K> keySet;

    @javax.annotation.CheckForNull
    private transient java.util.Set<V> valueSet;


    public class BiMapEntry extends com.google.common.collect.ForwardingMapEntry<K, V> {
        private final java.util.Map.Entry<K, V> delegate;
        public final /* synthetic */ com.google.common.collect.AbstractBiMap this$0;

        public BiMapEntry(com.google.common.collect.AbstractBiMap r1, java.util.Map.Entry<K, V> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.delegate = r2
                return
        }

        @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
        public final java.lang.Object delegate() {
                r1 = this;
                java.util.Map$Entry<K, V> r0 = r1.delegate
                return r0
        }

        @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
        public final java.util.Map.Entry<K, V> delegate() {
                r1 = this;
                java.util.Map$Entry<K, V> r0 = r1.delegate
                return r0
        }

        @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
        public V setValue(V r5) {
                r4 = this;
                com.google.common.collect.AbstractBiMap r0 = r4.this$0
                r0.checkValue(r5)
                com.google.common.collect.AbstractBiMap r0 = r4.this$0
                java.util.Set r0 = r0.entrySet()
                boolean r0 = r0.contains(r4)
                java.lang.String r1 = "entry no longer in map"
                com.google.common.base.Preconditions.checkState(r0, r1)
                java.lang.Object r0 = r4.getValue()
                boolean r0 = com.google.common.base.Objects.equal(r5, r0)
                if (r0 == 0) goto L1f
                return r5
            L1f:
                com.google.common.collect.AbstractBiMap r0 = r4.this$0
                boolean r0 = r0.containsValue(r5)
                r0 = r0 ^ 1
                java.lang.String r2 = "value already present: %s"
                com.google.common.base.Preconditions.checkArgument(r0, r2, r5)
                java.util.Map$Entry<K, V> r0 = r4.delegate
                java.lang.Object r0 = r0.setValue(r5)
                com.google.common.collect.AbstractBiMap r2 = r4.this$0
                java.lang.Object r3 = r4.getKey()
                java.lang.Object r2 = r2.get(r3)
                boolean r2 = com.google.common.base.Objects.equal(r5, r2)
                com.google.common.base.Preconditions.checkState(r2, r1)
                com.google.common.collect.AbstractBiMap r1 = r4.this$0
                java.lang.Object r2 = r4.getKey()
                com.google.common.collect.AbstractBiMap.access$500(r1, r2, r0, r5)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public class EntrySet extends com.google.common.collect.ForwardingSet<java.util.Map.Entry<K, V>> {
        public final java.util.Set<java.util.Map.Entry<K, V>> esDelegate;
        public final /* synthetic */ com.google.common.collect.AbstractBiMap this$0;

        private EntrySet(com.google.common.collect.AbstractBiMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.util.Map r1 = com.google.common.collect.AbstractBiMap.access$100(r1)
                java.util.Set r1 = r1.entrySet()
                r0.esDelegate = r1
                return
        }

        public /* synthetic */ EntrySet(com.google.common.collect.AbstractBiMap r1, com.google.common.collect.AbstractBiMap.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public void clear() {
                r1 = this;
                com.google.common.collect.AbstractBiMap r0 = r1.this$0
                r0.clear()
                return
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object r3) {
                r2 = this;
                java.util.Set<java.util.Map$Entry<K, V>> r0 = r2.esDelegate
                boolean r1 = r3 instanceof java.util.Map.Entry
                if (r1 != 0) goto L8
                r3 = 0
                goto L12
            L8:
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                java.util.Map$Entry r3 = com.google.common.collect.Maps.unmodifiableEntry(r3)
                boolean r3 = r0.contains(r3)
            L12:
                return r3
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean containsAll(java.util.Collection<?> r1) {
                r0 = this;
                boolean r1 = com.google.common.collect.Collections2.containsAllImpl(r0, r1)
                return r1
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final java.lang.Object delegate() {
                r1 = this;
                java.util.Set<java.util.Map$Entry<K, V>> r0 = r1.esDelegate
                return r0
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final java.util.Collection delegate() {
                r1 = this;
                java.util.Set<java.util.Map$Entry<K, V>> r0 = r1.esDelegate
                return r0
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final java.util.Set<java.util.Map.Entry<K, V>> delegate() {
                r1 = this;
                java.util.Set<java.util.Map$Entry<K, V>> r0 = r1.esDelegate
                return r0
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
                r1 = this;
                com.google.common.collect.AbstractBiMap r0 = r1.this$0
                java.util.Iterator r0 = r0.entrySetIterator()
                return r0
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean remove(@javax.annotation.CheckForNull java.lang.Object r3) {
                r2 = this;
                java.util.Set<java.util.Map$Entry<K, V>> r0 = r2.esDelegate
                boolean r0 = r0.contains(r3)
                if (r0 == 0) goto L25
                boolean r0 = r3 instanceof java.util.Map.Entry
                if (r0 != 0) goto Ld
                goto L25
            Ld:
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                com.google.common.collect.AbstractBiMap r0 = r2.this$0
                com.google.common.collect.AbstractBiMap<V, K> r0 = r0.inverse
                java.util.Map r0 = com.google.common.collect.AbstractBiMap.access$100(r0)
                java.lang.Object r1 = r3.getValue()
                r0.remove(r1)
                java.util.Set<java.util.Map$Entry<K, V>> r0 = r2.esDelegate
                r0.remove(r3)
                r3 = 1
                return r3
            L25:
                r3 = 0
                return r3
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean removeAll(java.util.Collection<?> r1) {
                r0 = this;
                boolean r1 = r0.standardRemoveAll(r1)
                return r1
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean retainAll(java.util.Collection<?> r2) {
                r1 = this;
                java.util.Iterator r0 = r1.iterator()
                boolean r2 = com.google.common.collect.Iterators.retainAll(r0, r2)
                return r2
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

    /* JADX INFO: loaded from: classes3.dex */
    public static class Inverse<K, V> extends com.google.common.collect.AbstractBiMap<K, V> {

        @com.google.common.annotations.GwtIncompatible
        private static final long serialVersionUID = 0;

        public Inverse(java.util.Map<K, V> r2, com.google.common.collect.AbstractBiMap<V, K> r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r3, r0)
                return
        }

        @com.google.common.annotations.GwtIncompatible
        private void readObject(java.io.ObjectInputStream r1) throws java.io.IOException, java.lang.ClassNotFoundException {
                r0 = this;
                r1.defaultReadObject()
                java.lang.Object r1 = r1.readObject()
                com.google.common.collect.AbstractBiMap r1 = (com.google.common.collect.AbstractBiMap) r1
                r0.inverse = r1
                return
        }

        @com.google.common.annotations.GwtIncompatible
        private void writeObject(java.io.ObjectOutputStream r2) throws java.io.IOException {
                r1 = this;
                r2.defaultWriteObject()
                com.google.common.collect.BiMap r0 = r1.inverse()
                r2.writeObject(r0)
                return
        }

        @Override // com.google.common.collect.AbstractBiMap
        @com.google.common.collect.ParametricNullness
        public final K checkKey(@com.google.common.collect.ParametricNullness K r2) {
                r1 = this;
                com.google.common.collect.AbstractBiMap<V, K> r0 = r1.inverse
                java.lang.Object r2 = r0.checkValue(r2)
                return r2
        }

        @Override // com.google.common.collect.AbstractBiMap
        @com.google.common.collect.ParametricNullness
        public final V checkValue(@com.google.common.collect.ParametricNullness V r2) {
                r1 = this;
                com.google.common.collect.AbstractBiMap<V, K> r0 = r1.inverse
                java.lang.Object r2 = r0.checkKey(r2)
                return r2
        }

        @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public final /* bridge */ /* synthetic */ java.lang.Object delegate() {
                r1 = this;
                java.util.Map r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
        public /* bridge */ /* synthetic */ java.util.Collection values() {
                r1 = this;
                java.util.Set r0 = super.values()
                return r0
        }
    }

    public class KeySet extends com.google.common.collect.ForwardingSet<K> {
        public final /* synthetic */ com.google.common.collect.AbstractBiMap this$0;

        private KeySet(com.google.common.collect.AbstractBiMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ KeySet(com.google.common.collect.AbstractBiMap r1, com.google.common.collect.AbstractBiMap.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public void clear() {
                r1 = this;
                com.google.common.collect.AbstractBiMap r0 = r1.this$0
                r0.clear()
                return
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final /* bridge */ /* synthetic */ java.lang.Object delegate() {
                r1 = this;
                java.util.Set r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final /* bridge */ /* synthetic */ java.util.Collection delegate() {
                r1 = this;
                java.util.Set r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final java.util.Set<K> delegate() {
                r1 = this;
                com.google.common.collect.AbstractBiMap r0 = r1.this$0
                java.util.Map r0 = com.google.common.collect.AbstractBiMap.access$100(r0)
                java.util.Set r0 = r0.keySet()
                return r0
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<K> iterator() {
                r2 = this;
                com.google.common.collect.AbstractBiMap r0 = r2.this$0
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
                com.google.common.collect.Maps$1 r1 = new com.google.common.collect.Maps$1
                r1.<init>(r0)
                return r1
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean remove(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                boolean r0 = r1.contains(r2)
                if (r0 != 0) goto L8
                r2 = 0
                return r2
            L8:
                com.google.common.collect.AbstractBiMap r0 = r1.this$0
                com.google.common.collect.AbstractBiMap.access$200(r0, r2)
                r2 = 1
                return r2
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean removeAll(java.util.Collection<?> r1) {
                r0 = this;
                boolean r1 = r0.standardRemoveAll(r1)
                return r1
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean retainAll(java.util.Collection<?> r2) {
                r1 = this;
                java.util.Iterator r0 = r1.iterator()
                boolean r2 = com.google.common.collect.Iterators.retainAll(r0, r2)
                return r2
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public class ValueSet extends com.google.common.collect.ForwardingSet<V> {
        public final /* synthetic */ com.google.common.collect.AbstractBiMap this$0;
        public final java.util.Set<V> valuesDelegate;

        private ValueSet(com.google.common.collect.AbstractBiMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                com.google.common.collect.AbstractBiMap<V, K> r1 = r1.inverse
                java.util.Set r1 = r1.keySet()
                r0.valuesDelegate = r1
                return
        }

        public /* synthetic */ ValueSet(com.google.common.collect.AbstractBiMap r1, com.google.common.collect.AbstractBiMap.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final java.lang.Object delegate() {
                r1 = this;
                java.util.Set<V> r0 = r1.valuesDelegate
                return r0
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final java.util.Collection delegate() {
                r1 = this;
                java.util.Set<V> r0 = r1.valuesDelegate
                return r0
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final java.util.Set<V> delegate() {
                r1 = this;
                java.util.Set<V> r0 = r1.valuesDelegate
                return r0
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<V> iterator() {
                r2 = this;
                com.google.common.collect.AbstractBiMap r0 = r2.this$0
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
                com.google.common.collect.Maps$2 r1 = new com.google.common.collect.Maps$2
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

        @Override // com.google.common.collect.ForwardingObject
        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = r1.standardToString()
                return r0
        }
    }

    private AbstractBiMap(java.util.Map<K, V> r1, com.google.common.collect.AbstractBiMap<V, K> r2) {
            r0 = this;
            r0.<init>()
            r0.delegate = r1
            r0.inverse = r2
            return
    }

    public /* synthetic */ AbstractBiMap(java.util.Map r1, com.google.common.collect.AbstractBiMap r2, com.google.common.collect.AbstractBiMap.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public AbstractBiMap(java.util.Map<K, V> r1, java.util.Map<V, K> r2) {
            r0 = this;
            r0.<init>()
            r0.setDelegates(r1, r2)
            return
    }

    public static /* synthetic */ java.util.Map access$100(com.google.common.collect.AbstractBiMap r0) {
            java.util.Map<K, V> r0 = r0.delegate
            return r0
    }

    public static /* synthetic */ java.lang.Object access$200(com.google.common.collect.AbstractBiMap r0, java.lang.Object r1) {
            java.lang.Object r0 = r0.removeFromBothMaps(r1)
            return r0
    }

    public static /* synthetic */ void access$500(com.google.common.collect.AbstractBiMap r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            r0 = 1
            r1.updateInverseMap(r2, r0, r3, r4)
            return
    }

    public static /* synthetic */ void access$600(com.google.common.collect.AbstractBiMap r0, java.lang.Object r1) {
            r0.removeFromInverseMap(r1)
            return
    }

    @javax.annotation.CheckForNull
    private V putInBothMaps(@com.google.common.collect.ParametricNullness K r3, @com.google.common.collect.ParametricNullness V r4, boolean r5) {
            r2 = this;
            r2.checkKey(r3)
            r2.checkValue(r4)
            boolean r0 = r2.containsKey(r3)
            if (r0 == 0) goto L17
            java.lang.Object r1 = r2.get(r3)
            boolean r1 = com.google.common.base.Objects.equal(r4, r1)
            if (r1 == 0) goto L17
            return r4
        L17:
            if (r5 == 0) goto L21
            com.google.common.collect.BiMap r5 = r2.inverse()
            r5.remove(r4)
            goto L2d
        L21:
            boolean r5 = r2.containsValue(r4)
            r5 = r5 ^ 1
            java.lang.String r1 = "value already present: %s"
            com.google.common.base.Preconditions.checkArgument(r5, r1, r4)
        L2d:
            java.util.Map<K, V> r5 = r2.delegate
            java.lang.Object r5 = r5.put(r3, r4)
            r2.updateInverseMap(r3, r0, r5, r4)
            return r5
    }

    @com.google.common.collect.ParametricNullness
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    private V removeFromBothMaps(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            java.util.Map<K, V> r0 = r1.delegate
            java.lang.Object r2 = r0.remove(r2)
            r1.removeFromInverseMap(r2)
            return r2
    }

    private void removeFromInverseMap(@com.google.common.collect.ParametricNullness V r2) {
            r1 = this;
            com.google.common.collect.AbstractBiMap<V, K> r0 = r1.inverse
            java.util.Map<K, V> r0 = r0.delegate
            r0.remove(r2)
            return
    }

    private void updateInverseMap(@com.google.common.collect.ParametricNullness K r1, boolean r2, @javax.annotation.CheckForNull V r3, @com.google.common.collect.ParametricNullness V r4) {
            r0 = this;
            if (r2 == 0) goto L5
            r0.removeFromInverseMap(r3)
        L5:
            com.google.common.collect.AbstractBiMap<V, K> r2 = r0.inverse
            java.util.Map<K, V> r2 = r2.delegate
            r2.put(r4, r1)
            return
    }

    @com.google.common.collect.ParametricNullness
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public K checkKey(@com.google.common.collect.ParametricNullness K r1) {
            r0 = this;
            return r1
    }

    @com.google.common.collect.ParametricNullness
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public V checkValue(@com.google.common.collect.ParametricNullness V r1) {
            r0 = this;
            return r1
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public void clear() {
            r1 = this;
            java.util.Map<K, V> r0 = r1.delegate
            r0.clear()
            com.google.common.collect.AbstractBiMap<V, K> r0 = r1.inverse
            java.util.Map<K, V> r0 = r0.delegate
            r0.clear()
            return
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public boolean containsValue(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            com.google.common.collect.AbstractBiMap<V, K> r0 = r1.inverse
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public java.lang.Object delegate() {
            r1 = this;
            java.util.Map<K, V> r0 = r1.delegate
            return r0
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public final java.util.Map<K, V> delegate() {
            r1 = this;
            java.util.Map<K, V> r0 = r1.delegate
            return r0
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r2 = this;
            java.util.Set<java.util.Map$Entry<K, V>> r0 = r2.entrySet
            if (r0 != 0) goto Lc
            com.google.common.collect.AbstractBiMap$EntrySet r0 = new com.google.common.collect.AbstractBiMap$EntrySet
            r1 = 0
            r0.<init>(r2, r1)
            r2.entrySet = r0
        Lc:
            return r0
    }

    public final java.util.Iterator<java.util.Map.Entry<K, V>> entrySetIterator() {
            r2 = this;
            java.util.Map<K, V> r0 = r2.delegate
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            com.google.common.collect.AbstractBiMap$1 r1 = new com.google.common.collect.AbstractBiMap$1
            r1.<init>(r2, r0)
            return r1
    }

    @Override // com.google.common.collect.BiMap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    public V forcePut(@com.google.common.collect.ParametricNullness K r2, @com.google.common.collect.ParametricNullness V r3) {
            r1 = this;
            r0 = 1
            java.lang.Object r2 = r1.putInBothMaps(r2, r3, r0)
            return r2
    }

    @Override // com.google.common.collect.BiMap
    public com.google.common.collect.BiMap<V, K> inverse() {
            r1 = this;
            com.google.common.collect.AbstractBiMap<V, K> r0 = r1.inverse
            return r0
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public java.util.Set<K> keySet() {
            r2 = this;
            java.util.Set<K> r0 = r2.keySet
            if (r0 != 0) goto Lc
            com.google.common.collect.AbstractBiMap$KeySet r0 = new com.google.common.collect.AbstractBiMap$KeySet
            r1 = 0
            r0.<init>(r2, r1)
            r2.keySet = r0
        Lc:
            return r0
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    public V put(@com.google.common.collect.ParametricNullness K r2, @com.google.common.collect.ParametricNullness V r3) {
            r1 = this;
            r0 = 0
            java.lang.Object r2 = r1.putInBothMaps(r2, r3, r0)
            return r2
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    public void putAll(java.util.Map<? extends K, ? extends V> r3) {
            r2 = this;
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L20
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r2.put(r1, r0)
            goto L8
        L20:
            return
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    public V remove(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto Lb
            java.lang.Object r2 = r1.removeFromBothMaps(r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            return r2
    }

    public final void setDelegates(java.util.Map<K, V> r4, java.util.Map<V, K> r5) {
            r3 = this;
            java.util.Map<K, V> r0 = r3.delegate
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            com.google.common.base.Preconditions.checkState(r0)
            com.google.common.collect.AbstractBiMap<V, K> r0 = r3.inverse
            if (r0 != 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            com.google.common.base.Preconditions.checkState(r0)
            boolean r0 = r4.isEmpty()
            com.google.common.base.Preconditions.checkArgument(r0)
            boolean r0 = r5.isEmpty()
            com.google.common.base.Preconditions.checkArgument(r0)
            if (r4 == r5) goto L27
            r1 = 1
        L27:
            com.google.common.base.Preconditions.checkArgument(r1)
            r3.delegate = r4
            com.google.common.collect.AbstractBiMap$Inverse r4 = new com.google.common.collect.AbstractBiMap$Inverse
            r4.<init>(r5, r3)
            r3.inverse = r4
            return
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    public /* bridge */ /* synthetic */ java.util.Collection values() {
            r1 = this;
            java.util.Set r0 = r1.values()
            return r0
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    public java.util.Set<V> values() {
            r2 = this;
            java.util.Set<V> r0 = r2.valueSet
            if (r0 != 0) goto Lc
            com.google.common.collect.AbstractBiMap$ValueSet r0 = new com.google.common.collect.AbstractBiMap$ValueSet
            r1 = 0
            r0.<init>(r2, r1)
            r2.valueSet = r0
        Lc:
            return r0
    }
}
