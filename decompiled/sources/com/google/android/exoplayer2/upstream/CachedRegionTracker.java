package com.google.android.exoplayer2.upstream;

/* JADX INFO: loaded from: classes2.dex */
public final class CachedRegionTracker implements com.google.android.exoplayer2.upstream.cache.Cache.Listener {
    public static final int CACHED_TO_END = -2;
    public static final int NOT_CACHED = -1;
    private static final java.lang.String TAG = "CachedRegionTracker";
    private final com.google.android.exoplayer2.upstream.cache.Cache cache;
    private final java.lang.String cacheKey;
    private final com.google.android.exoplayer2.extractor.ChunkIndex chunkIndex;
    private final com.google.android.exoplayer2.upstream.CachedRegionTracker.Region lookupRegion;
    private final java.util.TreeSet<com.google.android.exoplayer2.upstream.CachedRegionTracker.Region> regions;

    /* JADX INFO: loaded from: classes.dex */
    public static class Region implements java.lang.Comparable<com.google.android.exoplayer2.upstream.CachedRegionTracker.Region> {
        public long endOffset;
        public int endOffsetIndex;
        public long startOffset;

        public Region(long r1, long r3) {
                r0 = this;
                r0.<init>()
                r0.startOffset = r1
                r0.endOffset = r3
                return
        }

        /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(com.google.android.exoplayer2.upstream.CachedRegionTracker.Region r5) {
                r4 = this;
                long r0 = r4.startOffset
                long r2 = r5.startOffset
                int r5 = com.google.android.exoplayer2.util.Util.compareLong(r0, r2)
                return r5
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(com.google.android.exoplayer2.upstream.CachedRegionTracker.Region r1) {
                r0 = this;
                com.google.android.exoplayer2.upstream.CachedRegionTracker$Region r1 = (com.google.android.exoplayer2.upstream.CachedRegionTracker.Region) r1
                int r1 = r0.compareTo2(r1)
                return r1
        }
    }

    public CachedRegionTracker(com.google.android.exoplayer2.upstream.cache.Cache r3, java.lang.String r4, com.google.android.exoplayer2.extractor.ChunkIndex r5) {
            r2 = this;
            r2.<init>()
            r2.cache = r3
            r2.cacheKey = r4
            r2.chunkIndex = r5
            java.util.TreeSet r5 = new java.util.TreeSet
            r5.<init>()
            r2.regions = r5
            com.google.android.exoplayer2.upstream.CachedRegionTracker$Region r5 = new com.google.android.exoplayer2.upstream.CachedRegionTracker$Region
            r0 = 0
            r5.<init>(r0, r0)
            r2.lookupRegion = r5
            monitor-enter(r2)
            java.util.NavigableSet r3 = r3.addListener(r4, r2)     // Catch: java.lang.Throwable -> L34
            java.util.Iterator r3 = r3.descendingIterator()     // Catch: java.lang.Throwable -> L34
        L22:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L34
            if (r4 == 0) goto L32
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L34
            com.google.android.exoplayer2.upstream.cache.CacheSpan r4 = (com.google.android.exoplayer2.upstream.cache.CacheSpan) r4     // Catch: java.lang.Throwable -> L34
            r2.mergeSpan(r4)     // Catch: java.lang.Throwable -> L34
            goto L22
        L32:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L34
            return
        L34:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L34
            throw r3
    }

    private void mergeSpan(com.google.android.exoplayer2.upstream.cache.CacheSpan r8) {
            r7 = this;
            com.google.android.exoplayer2.upstream.CachedRegionTracker$Region r0 = new com.google.android.exoplayer2.upstream.CachedRegionTracker$Region
            long r1 = r8.position
            long r3 = r8.length
            long r3 = r3 + r1
            r0.<init>(r1, r3)
            java.util.TreeSet<com.google.android.exoplayer2.upstream.CachedRegionTracker$Region> r8 = r7.regions
            java.lang.Object r8 = r8.floor(r0)
            com.google.android.exoplayer2.upstream.CachedRegionTracker$Region r8 = (com.google.android.exoplayer2.upstream.CachedRegionTracker.Region) r8
            java.util.TreeSet<com.google.android.exoplayer2.upstream.CachedRegionTracker$Region> r1 = r7.regions
            java.lang.Object r1 = r1.ceiling(r0)
            com.google.android.exoplayer2.upstream.CachedRegionTracker$Region r1 = (com.google.android.exoplayer2.upstream.CachedRegionTracker.Region) r1
            boolean r2 = r7.regionsConnect(r8, r0)
            boolean r3 = r7.regionsConnect(r0, r1)
            if (r3 == 0) goto L42
            if (r2 == 0) goto L2f
            long r2 = r1.endOffset
            r8.endOffset = r2
            int r0 = r1.endOffsetIndex
            r8.endOffsetIndex = r0
            goto L3c
        L2f:
            long r2 = r1.endOffset
            r0.endOffset = r2
            int r8 = r1.endOffsetIndex
            r0.endOffsetIndex = r8
            java.util.TreeSet<com.google.android.exoplayer2.upstream.CachedRegionTracker$Region> r8 = r7.regions
            r8.add(r0)
        L3c:
            java.util.TreeSet<com.google.android.exoplayer2.upstream.CachedRegionTracker$Region> r8 = r7.regions
            r8.remove(r1)
            goto L79
        L42:
            if (r2 == 0) goto L63
            long r0 = r0.endOffset
            r8.endOffset = r0
            int r0 = r8.endOffsetIndex
        L4a:
            com.google.android.exoplayer2.extractor.ChunkIndex r1 = r7.chunkIndex
            int r2 = r1.length
            int r2 = r2 + (-1)
            if (r0 >= r2) goto L60
            long[] r1 = r1.offsets
            int r2 = r0 + 1
            r3 = r1[r2]
            long r5 = r8.endOffset
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 > 0) goto L60
            r0 = r2
            goto L4a
        L60:
            r8.endOffsetIndex = r0
            goto L79
        L63:
            com.google.android.exoplayer2.extractor.ChunkIndex r8 = r7.chunkIndex
            long[] r8 = r8.offsets
            long r1 = r0.endOffset
            int r8 = java.util.Arrays.binarySearch(r8, r1)
            if (r8 >= 0) goto L72
            int r8 = -r8
            int r8 = r8 + (-2)
        L72:
            r0.endOffsetIndex = r8
            java.util.TreeSet<com.google.android.exoplayer2.upstream.CachedRegionTracker$Region> r8 = r7.regions
            r8.add(r0)
        L79:
            return
    }

    private boolean regionsConnect(@androidx.annotation.Nullable com.google.android.exoplayer2.upstream.CachedRegionTracker.Region r4, @androidx.annotation.Nullable com.google.android.exoplayer2.upstream.CachedRegionTracker.Region r5) {
            r3 = this;
            if (r4 == 0) goto Le
            if (r5 == 0) goto Le
            long r0 = r4.endOffset
            long r4 = r5.startOffset
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto Le
            r4 = 1
            goto Lf
        Le:
            r4 = 0
        Lf:
            return r4
    }

    public synchronized int getRegionEndTimeMs(long r9) {
            r8 = this;
            monitor-enter(r8)
            com.google.android.exoplayer2.upstream.CachedRegionTracker$Region r0 = r8.lookupRegion     // Catch: java.lang.Throwable -> L52
            r0.startOffset = r9     // Catch: java.lang.Throwable -> L52
            java.util.TreeSet<com.google.android.exoplayer2.upstream.CachedRegionTracker$Region> r1 = r8.regions     // Catch: java.lang.Throwable -> L52
            java.lang.Object r0 = r1.floor(r0)     // Catch: java.lang.Throwable -> L52
            com.google.android.exoplayer2.upstream.CachedRegionTracker$Region r0 = (com.google.android.exoplayer2.upstream.CachedRegionTracker.Region) r0     // Catch: java.lang.Throwable -> L52
            r1 = -1
            if (r0 == 0) goto L50
            long r2 = r0.endOffset     // Catch: java.lang.Throwable -> L52
            int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r4 > 0) goto L50
            int r9 = r0.endOffsetIndex     // Catch: java.lang.Throwable -> L52
            if (r9 != r1) goto L1b
            goto L50
        L1b:
            com.google.android.exoplayer2.extractor.ChunkIndex r10 = r8.chunkIndex     // Catch: java.lang.Throwable -> L52
            int r0 = r10.length     // Catch: java.lang.Throwable -> L52
            int r0 = r0 + (-1)
            if (r9 != r0) goto L34
            long[] r0 = r10.offsets     // Catch: java.lang.Throwable -> L52
            r4 = r0[r9]     // Catch: java.lang.Throwable -> L52
            int[] r0 = r10.sizes     // Catch: java.lang.Throwable -> L52
            r0 = r0[r9]     // Catch: java.lang.Throwable -> L52
            long r0 = (long) r0
            long r4 = r4 + r0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L34
            r9 = -2
            monitor-exit(r8)
            return r9
        L34:
            long[] r0 = r10.durationsUs     // Catch: java.lang.Throwable -> L52
            r4 = r0[r9]     // Catch: java.lang.Throwable -> L52
            long[] r0 = r10.offsets     // Catch: java.lang.Throwable -> L52
            r6 = r0[r9]     // Catch: java.lang.Throwable -> L52
            long r2 = r2 - r6
            long r4 = r4 * r2
            int[] r0 = r10.sizes     // Catch: java.lang.Throwable -> L52
            r0 = r0[r9]     // Catch: java.lang.Throwable -> L52
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L52
            long r4 = r4 / r0
            long[] r10 = r10.timesUs     // Catch: java.lang.Throwable -> L52
            r9 = r10[r9]     // Catch: java.lang.Throwable -> L52
            long r9 = r9 + r4
            r0 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 / r0
            int r10 = (int) r9
            monitor-exit(r8)
            return r10
        L50:
            monitor-exit(r8)
            return r1
        L52:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public synchronized void onSpanAdded(com.google.android.exoplayer2.upstream.cache.Cache r1, com.google.android.exoplayer2.upstream.cache.CacheSpan r2) {
            r0 = this;
            monitor-enter(r0)
            r0.mergeSpan(r2)     // Catch: java.lang.Throwable -> L6
            monitor-exit(r0)
            return
        L6:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public synchronized void onSpanRemoved(com.google.android.exoplayer2.upstream.cache.Cache r7, com.google.android.exoplayer2.upstream.cache.CacheSpan r8) {
            r6 = this;
            monitor-enter(r6)
            com.google.android.exoplayer2.upstream.CachedRegionTracker$Region r7 = new com.google.android.exoplayer2.upstream.CachedRegionTracker$Region     // Catch: java.lang.Throwable -> L61
            long r0 = r8.position     // Catch: java.lang.Throwable -> L61
            long r2 = r8.length     // Catch: java.lang.Throwable -> L61
            long r2 = r2 + r0
            r7.<init>(r0, r2)     // Catch: java.lang.Throwable -> L61
            java.util.TreeSet<com.google.android.exoplayer2.upstream.CachedRegionTracker$Region> r8 = r6.regions     // Catch: java.lang.Throwable -> L61
            java.lang.Object r8 = r8.floor(r7)     // Catch: java.lang.Throwable -> L61
            com.google.android.exoplayer2.upstream.CachedRegionTracker$Region r8 = (com.google.android.exoplayer2.upstream.CachedRegionTracker.Region) r8     // Catch: java.lang.Throwable -> L61
            if (r8 != 0) goto L1e
            java.lang.String r7 = "CachedRegionTracker"
            java.lang.String r8 = "Removed a span we were not aware of"
            com.google.android.exoplayer2.util.Log.e(r7, r8)     // Catch: java.lang.Throwable -> L61
            monitor-exit(r6)
            return
        L1e:
            java.util.TreeSet<com.google.android.exoplayer2.upstream.CachedRegionTracker$Region> r0 = r6.regions     // Catch: java.lang.Throwable -> L61
            r0.remove(r8)     // Catch: java.lang.Throwable -> L61
            long r0 = r8.startOffset     // Catch: java.lang.Throwable -> L61
            long r2 = r7.startOffset     // Catch: java.lang.Throwable -> L61
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L46
            com.google.android.exoplayer2.upstream.CachedRegionTracker$Region r4 = new com.google.android.exoplayer2.upstream.CachedRegionTracker$Region     // Catch: java.lang.Throwable -> L61
            r4.<init>(r0, r2)     // Catch: java.lang.Throwable -> L61
            com.google.android.exoplayer2.extractor.ChunkIndex r0 = r6.chunkIndex     // Catch: java.lang.Throwable -> L61
            long[] r0 = r0.offsets     // Catch: java.lang.Throwable -> L61
            long r1 = r4.endOffset     // Catch: java.lang.Throwable -> L61
            int r0 = java.util.Arrays.binarySearch(r0, r1)     // Catch: java.lang.Throwable -> L61
            if (r0 >= 0) goto L3f
            int r0 = -r0
            int r0 = r0 + (-2)
        L3f:
            r4.endOffsetIndex = r0     // Catch: java.lang.Throwable -> L61
            java.util.TreeSet<com.google.android.exoplayer2.upstream.CachedRegionTracker$Region> r0 = r6.regions     // Catch: java.lang.Throwable -> L61
            r0.add(r4)     // Catch: java.lang.Throwable -> L61
        L46:
            long r0 = r8.endOffset     // Catch: java.lang.Throwable -> L61
            long r2 = r7.endOffset     // Catch: java.lang.Throwable -> L61
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 <= 0) goto L5f
            com.google.android.exoplayer2.upstream.CachedRegionTracker$Region r7 = new com.google.android.exoplayer2.upstream.CachedRegionTracker$Region     // Catch: java.lang.Throwable -> L61
            r4 = 1
            long r2 = r2 + r4
            r7.<init>(r2, r0)     // Catch: java.lang.Throwable -> L61
            int r8 = r8.endOffsetIndex     // Catch: java.lang.Throwable -> L61
            r7.endOffsetIndex = r8     // Catch: java.lang.Throwable -> L61
            java.util.TreeSet<com.google.android.exoplayer2.upstream.CachedRegionTracker$Region> r8 = r6.regions     // Catch: java.lang.Throwable -> L61
            r8.add(r7)     // Catch: java.lang.Throwable -> L61
        L5f:
            monitor-exit(r6)
            return
        L61:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public void onSpanTouched(com.google.android.exoplayer2.upstream.cache.Cache r1, com.google.android.exoplayer2.upstream.cache.CacheSpan r2, com.google.android.exoplayer2.upstream.cache.CacheSpan r3) {
            r0 = this;
            return
    }

    public void release() {
            r2 = this;
            com.google.android.exoplayer2.upstream.cache.Cache r0 = r2.cache
            java.lang.String r1 = r2.cacheKey
            r0.removeListener(r1, r2)
            return
    }
}
