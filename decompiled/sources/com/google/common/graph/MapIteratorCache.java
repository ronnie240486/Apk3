package com.google.common.graph;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.graph.ElementTypesAreNonnullByDefault
class MapIteratorCache<K, V> {
    private final java.util.Map<K, V> backingMap;

    @javax.annotation.CheckForNull
    private volatile transient java.util.Map.Entry<K, V> cacheEntry;

    /* JADX INFO: renamed from: com.google.common.graph.MapIteratorCache$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    class AnonymousClass1 extends java.util.AbstractSet<java.lang.Object> {
        public final /* synthetic */ com.google.common.graph.MapIteratorCache this$0;


        public AnonymousClass1(com.google.common.graph.MapIteratorCache r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                com.google.common.graph.MapIteratorCache r0 = r1.this$0
                boolean r2 = r0.containsKey(r2)
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public com.google.common.collect.UnmodifiableIterator<java.lang.Object> iterator() {
                r2 = this;
                com.google.common.graph.MapIteratorCache r0 = r2.this$0
                java.util.Map r0 = com.google.common.graph.MapIteratorCache.access$000(r0)
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
                com.google.common.graph.MapIteratorCache$1$1 r1 = new com.google.common.graph.MapIteratorCache$1$1
                r1.<init>(r2, r0)
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
                r1 = this;
                com.google.common.collect.UnmodifiableIterator r0 = r1.iterator()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                com.google.common.graph.MapIteratorCache r0 = r1.this$0
                java.util.Map r0 = com.google.common.graph.MapIteratorCache.access$000(r0)
                int r0 = r0.size()
                return r0
        }
    }

    public MapIteratorCache(java.util.Map<K, V> r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.util.Map r1 = (java.util.Map) r1
            r0.backingMap = r1
            return
    }

    public static /* synthetic */ java.util.Map access$000(com.google.common.graph.MapIteratorCache r0) {
            java.util.Map<K, V> r0 = r0.backingMap
            return r0
    }

    public static /* synthetic */ java.util.Map.Entry access$102(com.google.common.graph.MapIteratorCache r0, java.util.Map.Entry r1) {
            r0.cacheEntry = r1
            return r1
    }

    public void clearCache() {
            r1 = this;
            r0 = 0
            r1.cacheEntry = r0
            return
    }

    public final boolean containsKey(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            java.lang.Object r0 = r1.getIfCached(r2)
            if (r0 != 0) goto L11
            java.util.Map<K, V> r0 = r1.backingMap
            boolean r2 = r0.containsKey(r2)
            if (r2 == 0) goto Lf
            goto L11
        Lf:
            r2 = 0
            goto L12
        L11:
            r2 = 1
        L12:
            return r2
    }

    @javax.annotation.CheckForNull
    public V get(java.lang.Object r2) {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r2)
            java.lang.Object r0 = r1.getIfCached(r2)
            if (r0 != 0) goto Le
            java.lang.Object r2 = r1.getWithoutCaching(r2)
            return r2
        Le:
            return r0
    }

    @javax.annotation.CheckForNull
    public V getIfCached(@javax.annotation.CheckForNull java.lang.Object r3) {
            r2 = this;
            java.util.Map$Entry<K, V> r0 = r2.cacheEntry
            if (r0 == 0) goto Lf
            java.lang.Object r1 = r0.getKey()
            if (r1 != r3) goto Lf
            java.lang.Object r3 = r0.getValue()
            return r3
        Lf:
            r3 = 0
            return r3
    }

    @javax.annotation.CheckForNull
    public final V getWithoutCaching(java.lang.Object r2) {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r2)
            java.util.Map<K, V> r0 = r1.backingMap
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    public final V put(K r2, V r3) {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.base.Preconditions.checkNotNull(r3)
            r1.clearCache()
            java.util.Map<K, V> r0 = r1.backingMap
            java.lang.Object r2 = r0.put(r2, r3)
            return r2
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    public final V remove(java.lang.Object r2) {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r2)
            r1.clearCache()
            java.util.Map<K, V> r0 = r1.backingMap
            java.lang.Object r2 = r0.remove(r2)
            return r2
    }
}
