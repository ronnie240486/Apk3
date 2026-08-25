package com.google.common.collect;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ForwardingConcurrentMap<K, V> extends com.google.common.collect.ForwardingMap<K, V> implements java.util.concurrent.ConcurrentMap<K, V> {
    public ForwardingConcurrentMap() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            java.util.concurrent.ConcurrentMap r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ java.util.Map delegate() {
            r1 = this;
            java.util.concurrent.ConcurrentMap r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public abstract java.util.concurrent.ConcurrentMap<K, V> delegate();

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    public V putIfAbsent(K r2, V r3) {
            r1 = this;
            java.util.concurrent.ConcurrentMap r0 = r1.delegate()
            java.lang.Object r2 = r0.putIfAbsent(r2, r3)
            return r2
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean remove(@javax.annotation.CheckForNull java.lang.Object r2, @javax.annotation.CheckForNull java.lang.Object r3) {
            r1 = this;
            java.util.concurrent.ConcurrentMap r0 = r1.delegate()
            boolean r2 = r0.remove(r2, r3)
            return r2
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    public V replace(K r2, V r3) {
            r1 = this;
            java.util.concurrent.ConcurrentMap r0 = r1.delegate()
            java.lang.Object r2 = r0.replace(r2, r3)
            return r2
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean replace(K r2, V r3, V r4) {
            r1 = this;
            java.util.concurrent.ConcurrentMap r0 = r1.delegate()
            boolean r2 = r0.replace(r2, r3, r4)
            return r2
    }
}
