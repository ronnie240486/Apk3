package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
public interface BiMap<K, V> extends java.util.Map<K, V> {

    /* JADX INFO: renamed from: com.google.common.collect.BiMap$-CC, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public final /* synthetic */ class CC<K, V> {
        public static /* bridge */ /* synthetic */ java.util.Collection $default$values(com.google.common.collect.BiMap r0) {
                java.util.Set r0 = r0.values()
                return r0
        }
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    V forcePut(@com.google.common.collect.ParametricNullness K r1, @com.google.common.collect.ParametricNullness V r2);

    com.google.common.collect.BiMap<V, K> inverse();

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    V put(@com.google.common.collect.ParametricNullness K r1, @com.google.common.collect.ParametricNullness V r2);

    void putAll(java.util.Map<? extends K, ? extends V> r1);

    /* bridge */ /* synthetic */ java.util.Collection values();

    @Override // java.util.Map
    java.util.Set<V> values();
}
