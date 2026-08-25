package com.google.common.cache;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.cache.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
public abstract class ForwardingCache<K, V> extends com.google.common.collect.ForwardingObject implements com.google.common.cache.Cache<K, V> {

    /* JADX INFO: loaded from: classes3.dex */
    public static abstract class SimpleForwardingCache<K, V> extends com.google.common.cache.ForwardingCache<K, V> {
        private final com.google.common.cache.Cache<K, V> delegate;

        @Override // com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
        public final com.google.common.cache.Cache<K, V> delegate() {
                r1 = this;
                com.google.common.cache.Cache<K, V> r0 = r1.delegate
                return r0
        }

        @Override // com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
        public final java.lang.Object delegate() {
                r1 = this;
                com.google.common.cache.Cache<K, V> r0 = r1.delegate
                return r0
        }
    }

    public ForwardingCache() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.common.cache.Cache
    public java.util.concurrent.ConcurrentMap<K, V> asMap() {
            r1 = this;
            com.google.common.cache.Cache r0 = r1.delegate()
            java.util.concurrent.ConcurrentMap r0 = r0.asMap()
            return r0
    }

    @Override // com.google.common.cache.Cache
    public void cleanUp() {
            r1 = this;
            com.google.common.cache.Cache r0 = r1.delegate()
            r0.cleanUp()
            return
    }

    @Override // com.google.common.collect.ForwardingObject
    public abstract com.google.common.cache.Cache<K, V> delegate();

    @Override // com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            com.google.common.cache.Cache r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.cache.Cache
    public V get(K r2, java.util.concurrent.Callable<? extends V> r3) throws java.util.concurrent.ExecutionException {
            r1 = this;
            com.google.common.cache.Cache r0 = r1.delegate()
            java.lang.Object r2 = r0.get(r2, r3)
            return r2
    }

    @Override // com.google.common.cache.Cache
    public com.google.common.collect.ImmutableMap<K, V> getAllPresent(java.lang.Iterable<? extends java.lang.Object> r2) {
            r1 = this;
            com.google.common.cache.Cache r0 = r1.delegate()
            com.google.common.collect.ImmutableMap r2 = r0.getAllPresent(r2)
            return r2
    }

    @Override // com.google.common.cache.Cache
    @javax.annotation.CheckForNull
    public V getIfPresent(java.lang.Object r2) {
            r1 = this;
            com.google.common.cache.Cache r0 = r1.delegate()
            java.lang.Object r2 = r0.getIfPresent(r2)
            return r2
    }

    @Override // com.google.common.cache.Cache
    public void invalidate(java.lang.Object r2) {
            r1 = this;
            com.google.common.cache.Cache r0 = r1.delegate()
            r0.invalidate(r2)
            return
    }

    @Override // com.google.common.cache.Cache
    public void invalidateAll() {
            r1 = this;
            com.google.common.cache.Cache r0 = r1.delegate()
            r0.invalidateAll()
            return
    }

    @Override // com.google.common.cache.Cache
    public void invalidateAll(java.lang.Iterable<? extends java.lang.Object> r2) {
            r1 = this;
            com.google.common.cache.Cache r0 = r1.delegate()
            r0.invalidateAll(r2)
            return
    }

    @Override // com.google.common.cache.Cache
    public void put(K r2, V r3) {
            r1 = this;
            com.google.common.cache.Cache r0 = r1.delegate()
            r0.put(r2, r3)
            return
    }

    @Override // com.google.common.cache.Cache
    public void putAll(java.util.Map<? extends K, ? extends V> r2) {
            r1 = this;
            com.google.common.cache.Cache r0 = r1.delegate()
            r0.putAll(r2)
            return
    }

    @Override // com.google.common.cache.Cache
    public long size() {
            r2 = this;
            com.google.common.cache.Cache r0 = r2.delegate()
            long r0 = r0.size()
            return r0
    }

    @Override // com.google.common.cache.Cache
    public com.google.common.cache.CacheStats stats() {
            r1 = this;
            com.google.common.cache.Cache r0 = r1.delegate()
            com.google.common.cache.CacheStats r0 = r0.stats()
            return r0
    }
}
