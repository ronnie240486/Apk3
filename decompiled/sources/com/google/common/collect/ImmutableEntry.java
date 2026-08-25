package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible(serializable = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
class ImmutableEntry<K, V> extends com.google.common.collect.AbstractMapEntry<K, V> implements java.io.Serializable {
    private static final long serialVersionUID = 0;

    @com.google.common.collect.ParametricNullness
    public final K key;

    @com.google.common.collect.ParametricNullness
    public final V value;

    public ImmutableEntry(@com.google.common.collect.ParametricNullness K r1, @com.google.common.collect.ParametricNullness V r2) {
            r0 = this;
            r0.<init>()
            r0.key = r1
            r0.value = r2
            return
    }

    @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
    @com.google.common.collect.ParametricNullness
    public final K getKey() {
            r1 = this;
            K r0 = r1.key
            return r0
    }

    @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
    @com.google.common.collect.ParametricNullness
    public final V getValue() {
            r1 = this;
            V r0 = r1.value
            return r0
    }

    @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
    @com.google.common.collect.ParametricNullness
    public final V setValue(@com.google.common.collect.ParametricNullness V r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }
}
