package org.bson.util;

/* JADX INFO: loaded from: classes2.dex */
final class ComputingMap<K, V> implements java.util.Map<K, V>, org.bson.util.Function<K, V> {
    private final org.bson.util.Function<K, V> function;
    private final java.util.concurrent.ConcurrentMap<K, V> map;

    public ComputingMap(java.util.concurrent.ConcurrentMap<K, V> r2, org.bson.util.Function<K, V> r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "map"
            java.lang.Object r2 = org.bson.assertions.Assertions.notNull(r0, r2)
            java.util.concurrent.ConcurrentMap r2 = (java.util.concurrent.ConcurrentMap) r2
            r1.map = r2
            java.lang.String r2 = "function"
            java.lang.Object r2 = org.bson.assertions.Assertions.notNull(r2, r3)
            org.bson.util.Function r2 = (org.bson.util.Function) r2
            r1.function = r2
            return
    }

    public static <K, V> java.util.Map<K, V> create(org.bson.util.Function<K, V> r2) {
            org.bson.util.ComputingMap r0 = new org.bson.util.ComputingMap
            org.bson.util.CopyOnWriteMap r1 = org.bson.util.CopyOnWriteMap.newHashMap()
            r0.<init>(r1, r2)
            return r0
    }

    @Override // org.bson.util.Function
    public V apply(K r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            return r1
    }

    @Override // java.util.Map
    public void clear() {
            r1 = this;
            java.util.concurrent.ConcurrentMap<K, V> r0 = r1.map
            r0.clear()
            return
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object r2) {
            r1 = this;
            java.util.concurrent.ConcurrentMap<K, V> r0 = r1.map
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object r2) {
            r1 = this;
            java.util.concurrent.ConcurrentMap<K, V> r0 = r1.map
            boolean r2 = r0.containsValue(r2)
            return r2
    }

    @Override // java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r1 = this;
            java.util.concurrent.ConcurrentMap<K, V> r0 = r1.map
            java.util.Set r0 = r0.entrySet()
            return r0
    }

    @Override // java.util.Map
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            java.util.concurrent.ConcurrentMap<K, V> r0 = r1.map
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // java.util.Map
    public V get(java.lang.Object r3) {
            r2 = this;
        L0:
            java.util.concurrent.ConcurrentMap<K, V> r0 = r2.map
            java.lang.Object r0 = r0.get(r3)
            if (r0 == 0) goto L9
            return r0
        L9:
            org.bson.util.Function<K, V> r0 = r2.function
            java.lang.Object r0 = r0.apply(r3)
            if (r0 != 0) goto L13
            r3 = 0
            return r3
        L13:
            java.util.concurrent.ConcurrentMap<K, V> r1 = r2.map
            r1.putIfAbsent(r3, r0)
            goto L0
    }

    @Override // java.util.Map
    public int hashCode() {
            r1 = this;
            java.util.concurrent.ConcurrentMap<K, V> r0 = r1.map
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.util.Map
    public boolean isEmpty() {
            r1 = this;
            java.util.concurrent.ConcurrentMap<K, V> r0 = r1.map
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.Map
    public java.util.Set<K> keySet() {
            r1 = this;
            java.util.concurrent.ConcurrentMap<K, V> r0 = r1.map
            java.util.Set r0 = r0.keySet()
            return r0
    }

    @Override // java.util.Map
    public V put(K r2, V r3) {
            r1 = this;
            java.util.concurrent.ConcurrentMap<K, V> r0 = r1.map
            java.lang.Object r2 = r0.put(r2, r3)
            return r2
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends K, ? extends V> r2) {
            r1 = this;
            java.util.concurrent.ConcurrentMap<K, V> r0 = r1.map
            r0.putAll(r2)
            return
    }

    @Override // java.util.Map
    public V putIfAbsent(K r2, V r3) {
            r1 = this;
            java.util.concurrent.ConcurrentMap<K, V> r0 = r1.map
            java.lang.Object r2 = r0.putIfAbsent(r2, r3)
            return r2
    }

    @Override // java.util.Map
    public V remove(java.lang.Object r2) {
            r1 = this;
            java.util.concurrent.ConcurrentMap<K, V> r0 = r1.map
            java.lang.Object r2 = r0.remove(r2)
            return r2
    }

    @Override // java.util.Map
    public boolean remove(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            java.util.concurrent.ConcurrentMap<K, V> r0 = r1.map
            boolean r2 = r0.remove(r2, r3)
            return r2
    }

    @Override // java.util.Map
    public V replace(K r2, V r3) {
            r1 = this;
            java.util.concurrent.ConcurrentMap<K, V> r0 = r1.map
            java.lang.Object r2 = r0.replace(r2, r3)
            return r2
    }

    @Override // java.util.Map
    public boolean replace(K r2, V r3, V r4) {
            r1 = this;
            java.util.concurrent.ConcurrentMap<K, V> r0 = r1.map
            boolean r2 = r0.replace(r2, r3, r4)
            return r2
    }

    @Override // java.util.Map
    public int size() {
            r1 = this;
            java.util.concurrent.ConcurrentMap<K, V> r0 = r1.map
            int r0 = r0.size()
            return r0
    }

    @Override // java.util.Map
    public java.util.Collection<V> values() {
            r1 = this;
            java.util.concurrent.ConcurrentMap<K, V> r0 = r1.map
            java.util.Collection r0 = r0.values()
            return r0
    }
}
