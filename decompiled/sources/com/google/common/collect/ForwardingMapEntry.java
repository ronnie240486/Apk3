package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ForwardingMapEntry<K, V> extends com.google.common.collect.ForwardingObject implements java.util.Map.Entry<K, V> {
    public ForwardingMapEntry() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            java.util.Map$Entry r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingObject
    public abstract java.util.Map.Entry<K, V> delegate();

    @Override // java.util.Map.Entry
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            java.util.Map$Entry r0 = r1.delegate()
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // java.util.Map.Entry
    @com.google.common.collect.ParametricNullness
    public K getKey() {
            r1 = this;
            java.util.Map$Entry r0 = r1.delegate()
            java.lang.Object r0 = r0.getKey()
            return r0
    }

    @Override // java.util.Map.Entry
    @com.google.common.collect.ParametricNullness
    public V getValue() {
            r1 = this;
            java.util.Map$Entry r0 = r1.delegate()
            java.lang.Object r0 = r0.getValue()
            return r0
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
            r1 = this;
            java.util.Map$Entry r0 = r1.delegate()
            int r0 = r0.hashCode()
            return r0
    }

    @com.google.common.collect.ParametricNullness
    public V setValue(@com.google.common.collect.ParametricNullness V r2) {
            r1 = this;
            java.util.Map$Entry r0 = r1.delegate()
            java.lang.Object r2 = r0.setValue(r2)
            return r2
    }
}
