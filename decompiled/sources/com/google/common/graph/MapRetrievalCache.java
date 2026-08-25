package com.google.common.graph;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.graph.ElementTypesAreNonnullByDefault
final class MapRetrievalCache<K, V> extends com.google.common.graph.MapIteratorCache<K, V> {

    @javax.annotation.CheckForNull
    private volatile transient com.google.common.graph.MapRetrievalCache.CacheEntry<K, V> cacheEntry1;

    @javax.annotation.CheckForNull
    private volatile transient com.google.common.graph.MapRetrievalCache.CacheEntry<K, V> cacheEntry2;

    public static final class CacheEntry<K, V> {
        public final K key;
        public final V value;

        public CacheEntry(K r1, V r2) {
                r0 = this;
                r0.<init>()
                r0.key = r1
                r0.value = r2
                return
        }
    }

    public MapRetrievalCache(java.util.Map<K, V> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private void addToCache(com.google.common.graph.MapRetrievalCache.CacheEntry<K, V> r2) {
            r1 = this;
            com.google.common.graph.MapRetrievalCache$CacheEntry<K, V> r0 = r1.cacheEntry1
            r1.cacheEntry2 = r0
            r1.cacheEntry1 = r2
            return
    }

    private void addToCache(K r2, V r3) {
            r1 = this;
            com.google.common.graph.MapRetrievalCache$CacheEntry r0 = new com.google.common.graph.MapRetrievalCache$CacheEntry
            r0.<init>(r2, r3)
            r1.addToCache(r0)
            return
    }

    @Override // com.google.common.graph.MapIteratorCache
    public final void clearCache() {
            r1 = this;
            super.clearCache()
            r0 = 0
            r1.cacheEntry1 = r0
            r1.cacheEntry2 = r0
            return
    }

    @Override // com.google.common.graph.MapIteratorCache
    @javax.annotation.CheckForNull
    public final V get(java.lang.Object r2) {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r2)
            java.lang.Object r0 = r1.getIfCached(r2)
            if (r0 == 0) goto La
            return r0
        La:
            java.lang.Object r0 = r1.getWithoutCaching(r2)
            if (r0 == 0) goto L13
            r1.addToCache(r2, r0)
        L13:
            return r0
    }

    @Override // com.google.common.graph.MapIteratorCache
    @javax.annotation.CheckForNull
    public final V getIfCached(@javax.annotation.CheckForNull java.lang.Object r3) {
            r2 = this;
            java.lang.Object r0 = super.getIfCached(r3)
            if (r0 == 0) goto L7
            return r0
        L7:
            com.google.common.graph.MapRetrievalCache$CacheEntry<K, V> r0 = r2.cacheEntry1
            if (r0 == 0) goto L12
            K r1 = r0.key
            if (r1 != r3) goto L12
            V r3 = r0.value
            return r3
        L12:
            com.google.common.graph.MapRetrievalCache$CacheEntry<K, V> r0 = r2.cacheEntry2
            if (r0 == 0) goto L20
            K r1 = r0.key
            if (r1 != r3) goto L20
            r2.addToCache(r0)
            V r3 = r0.value
            return r3
        L20:
            r3 = 0
            return r3
    }
}
