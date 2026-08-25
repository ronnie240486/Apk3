package com.google.common.cache;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.DoNotMock("Use CacheBuilder.newBuilder().build()")
@com.google.common.cache.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtCompatible
public interface Cache<K, V> {
    @com.google.errorprone.annotations.CheckReturnValue
    java.util.concurrent.ConcurrentMap<K, V> asMap();

    void cleanUp();

    V get(K r1, java.util.concurrent.Callable<? extends V> r2) throws java.util.concurrent.ExecutionException;

    com.google.common.collect.ImmutableMap<K, V> getAllPresent(java.lang.Iterable<? extends java.lang.Object> r1);

    @javax.annotation.CheckForNull
    V getIfPresent(@com.google.errorprone.annotations.CompatibleWith("K") java.lang.Object r1);

    void invalidate(@com.google.errorprone.annotations.CompatibleWith("K") java.lang.Object r1);

    void invalidateAll();

    void invalidateAll(java.lang.Iterable<? extends java.lang.Object> r1);

    void put(K r1, V r2);

    void putAll(java.util.Map<? extends K, ? extends V> r1);

    @com.google.errorprone.annotations.CheckReturnValue
    long size();

    @com.google.errorprone.annotations.CheckReturnValue
    com.google.common.cache.CacheStats stats();
}
