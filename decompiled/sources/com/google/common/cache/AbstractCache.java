package com.google.common.cache;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.cache.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtCompatible
public abstract class AbstractCache<K, V> implements com.google.common.cache.Cache<K, V> {

    /* JADX INFO: loaded from: classes.dex */
    public static final class SimpleStatsCounter implements com.google.common.cache.AbstractCache.StatsCounter {
        private final com.google.common.cache.LongAddable evictionCount;
        private final com.google.common.cache.LongAddable hitCount;
        private final com.google.common.cache.LongAddable loadExceptionCount;
        private final com.google.common.cache.LongAddable loadSuccessCount;
        private final com.google.common.cache.LongAddable missCount;
        private final com.google.common.cache.LongAddable totalLoadTime;

        public SimpleStatsCounter() {
                r1 = this;
                r1.<init>()
                com.google.common.cache.LongAddable r0 = com.google.common.cache.LongAddables.create()
                r1.hitCount = r0
                com.google.common.cache.LongAddable r0 = com.google.common.cache.LongAddables.create()
                r1.missCount = r0
                com.google.common.cache.LongAddable r0 = com.google.common.cache.LongAddables.create()
                r1.loadSuccessCount = r0
                com.google.common.cache.LongAddable r0 = com.google.common.cache.LongAddables.create()
                r1.loadExceptionCount = r0
                com.google.common.cache.LongAddable r0 = com.google.common.cache.LongAddables.create()
                r1.totalLoadTime = r0
                com.google.common.cache.LongAddable r0 = com.google.common.cache.LongAddables.create()
                r1.evictionCount = r0
                return
        }

        private static long negativeToMaxValue(long r3) {
                r0 = 0
                int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r2 < 0) goto L7
                goto Lc
            L7:
                r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            Lc:
                return r3
        }

        public void incrementBy(com.google.common.cache.AbstractCache.StatsCounter r4) {
                r3 = this;
                com.google.common.cache.CacheStats r4 = r4.snapshot()
                com.google.common.cache.LongAddable r0 = r3.hitCount
                long r1 = r4.hitCount()
                r0.add(r1)
                com.google.common.cache.LongAddable r0 = r3.missCount
                long r1 = r4.missCount()
                r0.add(r1)
                com.google.common.cache.LongAddable r0 = r3.loadSuccessCount
                long r1 = r4.loadSuccessCount()
                r0.add(r1)
                com.google.common.cache.LongAddable r0 = r3.loadExceptionCount
                long r1 = r4.loadExceptionCount()
                r0.add(r1)
                com.google.common.cache.LongAddable r0 = r3.totalLoadTime
                long r1 = r4.totalLoadTime()
                r0.add(r1)
                com.google.common.cache.LongAddable r0 = r3.evictionCount
                long r1 = r4.evictionCount()
                r0.add(r1)
                return
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordEviction() {
                r1 = this;
                com.google.common.cache.LongAddable r0 = r1.evictionCount
                r0.increment()
                return
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordHits(int r4) {
                r3 = this;
                com.google.common.cache.LongAddable r0 = r3.hitCount
                long r1 = (long) r4
                r0.add(r1)
                return
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordLoadException(long r2) {
                r1 = this;
                com.google.common.cache.LongAddable r0 = r1.loadExceptionCount
                r0.increment()
                com.google.common.cache.LongAddable r0 = r1.totalLoadTime
                r0.add(r2)
                return
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordLoadSuccess(long r2) {
                r1 = this;
                com.google.common.cache.LongAddable r0 = r1.loadSuccessCount
                r0.increment()
                com.google.common.cache.LongAddable r0 = r1.totalLoadTime
                r0.add(r2)
                return
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordMisses(int r4) {
                r3 = this;
                com.google.common.cache.LongAddable r0 = r3.missCount
                long r1 = (long) r4
                r0.add(r1)
                return
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public com.google.common.cache.CacheStats snapshot() {
                r14 = this;
                com.google.common.cache.CacheStats r13 = new com.google.common.cache.CacheStats
                com.google.common.cache.LongAddable r0 = r14.hitCount
                long r0 = r0.sum()
                long r1 = negativeToMaxValue(r0)
                com.google.common.cache.LongAddable r0 = r14.missCount
                long r3 = r0.sum()
                long r3 = negativeToMaxValue(r3)
                com.google.common.cache.LongAddable r0 = r14.loadSuccessCount
                long r5 = r0.sum()
                long r5 = negativeToMaxValue(r5)
                com.google.common.cache.LongAddable r0 = r14.loadExceptionCount
                long r7 = r0.sum()
                long r7 = negativeToMaxValue(r7)
                com.google.common.cache.LongAddable r0 = r14.totalLoadTime
                long r9 = r0.sum()
                long r9 = negativeToMaxValue(r9)
                com.google.common.cache.LongAddable r0 = r14.evictionCount
                long r11 = r0.sum()
                long r11 = negativeToMaxValue(r11)
                r0 = r13
                r0.<init>(r1, r3, r5, r7, r9, r11)
                return r13
        }
    }

    public interface StatsCounter {
        void recordEviction();

        void recordHits(int r1);

        void recordLoadException(long r1);

        void recordLoadSuccess(long r1);

        void recordMisses(int r1);

        com.google.common.cache.CacheStats snapshot();
    }

    public AbstractCache() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.common.cache.Cache
    public java.util.concurrent.ConcurrentMap<K, V> asMap() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // com.google.common.cache.Cache
    public void cleanUp() {
            r0 = this;
            return
    }

    @Override // com.google.common.cache.Cache
    public V get(K r1, java.util.concurrent.Callable<? extends V> r2) throws java.util.concurrent.ExecutionException {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.common.cache.Cache
    public com.google.common.collect.ImmutableMap<K, V> getAllPresent(java.lang.Iterable<? extends java.lang.Object> r4) {
            r3 = this;
            java.util.LinkedHashMap r0 = com.google.common.collect.Maps.newLinkedHashMap()
            java.util.Iterator r4 = r4.iterator()
        L8:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r4.next()
            boolean r2 = r0.containsKey(r1)
            if (r2 != 0) goto L8
            java.lang.Object r2 = r3.getIfPresent(r1)
            if (r2 == 0) goto L8
            r0.put(r1, r2)
            goto L8
        L22:
            com.google.common.collect.ImmutableMap r4 = com.google.common.collect.ImmutableMap.copyOf(r0)
            return r4
    }

    @Override // com.google.common.cache.Cache
    public void invalidate(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.common.cache.Cache
    public void invalidateAll() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // com.google.common.cache.Cache
    public void invalidateAll(java.lang.Iterable<? extends java.lang.Object> r2) {
            r1 = this;
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L12
            java.lang.Object r0 = r2.next()
            r1.invalidate(r0)
            goto L4
        L12:
            return
    }

    @Override // com.google.common.cache.Cache
    public void put(K r1, V r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.common.cache.Cache
    public void putAll(java.util.Map<? extends K, ? extends V> r3) {
            r2 = this;
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L20
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r2.put(r1, r0)
            goto L8
        L20:
            return
    }

    @Override // com.google.common.cache.Cache
    public long size() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // com.google.common.cache.Cache
    public com.google.common.cache.CacheStats stats() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }
}
