package com.bumptech.glide.util;

/* JADX INFO: loaded from: classes2.dex */
public final class CachedHashCodeArrayMap<K, V> extends androidx.collection.ArrayMap<K, V> {
    private int hashCode;

    public CachedHashCodeArrayMap() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public void clear() {
            r1 = this;
            r0 = 0
            r1.hashCode = r0
            super.clear()
            return
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public int hashCode() {
            r1 = this;
            int r0 = r1.hashCode
            if (r0 != 0) goto La
            int r0 = super.hashCode()
            r1.hashCode = r0
        La:
            int r0 = r1.hashCode
            return r0
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public V put(K r2, V r3) {
            r1 = this;
            r0 = 0
            r1.hashCode = r0
            java.lang.Object r2 = super.put(r2, r3)
            return r2
    }

    @Override // androidx.collection.SimpleArrayMap
    public void putAll(androidx.collection.SimpleArrayMap<? extends K, ? extends V> r2) {
            r1 = this;
            r0 = 0
            r1.hashCode = r0
            super.putAll(r2)
            return
    }

    @Override // androidx.collection.SimpleArrayMap
    public V removeAt(int r2) {
            r1 = this;
            r0 = 0
            r1.hashCode = r0
            java.lang.Object r2 = super.removeAt(r2)
            return r2
    }

    @Override // androidx.collection.SimpleArrayMap
    public V setValueAt(int r2, V r3) {
            r1 = this;
            r0 = 0
            r1.hashCode = r0
            java.lang.Object r2 = super.setValueAt(r2, r3)
            return r2
    }
}
