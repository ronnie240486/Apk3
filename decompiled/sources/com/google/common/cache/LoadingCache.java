package com.google.common.cache;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.cache.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtCompatible
public interface LoadingCache<K, V> extends com.google.common.cache.Cache<K, V>, com.google.common.base.Function<K, V> {
    @Override // com.google.common.base.Function
    @java.lang.Deprecated
    V apply(K r1);

    @Override // com.google.common.cache.Cache
    java.util.concurrent.ConcurrentMap<K, V> asMap();

    V get(K r1) throws java.util.concurrent.ExecutionException;

    com.google.common.collect.ImmutableMap<K, V> getAll(java.lang.Iterable<? extends K> r1) throws java.util.concurrent.ExecutionException;

    V getUnchecked(K r1);

    void refresh(K r1);
}
