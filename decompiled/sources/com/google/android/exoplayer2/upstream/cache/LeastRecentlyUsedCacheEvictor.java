package com.google.android.exoplayer2.upstream.cache;

/* JADX INFO: loaded from: classes.dex */
public final class LeastRecentlyUsedCacheEvictor implements com.google.android.exoplayer2.upstream.cache.CacheEvictor {
    private long currentSize;
    private final java.util.TreeSet<com.google.android.exoplayer2.upstream.cache.CacheSpan> leastRecentlyUsed;
    private final long maxBytes;

    /* JADX INFO: renamed from: $r8$lambda$fGGQpb4lm4rCLKn4-zylNcQiqeo, reason: not valid java name */
    public static /* synthetic */ int m272$r8$lambda$fGGQpb4lm4rCLKn4zylNcQiqeo(com.google.android.exoplayer2.upstream.cache.CacheSpan r0, com.google.android.exoplayer2.upstream.cache.CacheSpan r1) {
            int r0 = compare(r0, r1)
            return r0
    }

    public LeastRecentlyUsedCacheEvictor(long r1) {
            r0 = this;
            r0.<init>()
            r0.maxBytes = r1
            java.util.TreeSet r1 = new java.util.TreeSet
            com.google.android.exoplayer2.source.dash.BaseUrlExclusionList$$ExternalSyntheticLambda0 r2 = com.google.android.exoplayer2.source.dash.BaseUrlExclusionList$$ExternalSyntheticLambda0.INSTANCE$2
            r1.<init>(r2)
            r0.leastRecentlyUsed = r1
            return
    }

    private static int compare(com.google.android.exoplayer2.upstream.cache.CacheSpan r9, com.google.android.exoplayer2.upstream.cache.CacheSpan r10) {
            long r0 = r9.lastTouchTimestamp
            long r2 = r10.lastTouchTimestamp
            long r4 = r0 - r2
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L11
            int r9 = r9.compareTo2(r10)
            return r9
        L11:
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 >= 0) goto L17
            r9 = -1
            goto L18
        L17:
            r9 = 1
        L18:
            return r9
    }

    private void evictCache(com.google.android.exoplayer2.upstream.cache.Cache r6, long r7) {
            r5 = this;
        L0:
            long r0 = r5.currentSize
            long r0 = r0 + r7
            long r2 = r5.maxBytes
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1d
            java.util.TreeSet<com.google.android.exoplayer2.upstream.cache.CacheSpan> r0 = r5.leastRecentlyUsed
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1d
            java.util.TreeSet<com.google.android.exoplayer2.upstream.cache.CacheSpan> r0 = r5.leastRecentlyUsed
            java.lang.Object r0 = r0.first()
            com.google.android.exoplayer2.upstream.cache.CacheSpan r0 = (com.google.android.exoplayer2.upstream.cache.CacheSpan) r0
            r6.removeSpan(r0)
            goto L0
        L1d:
            return
    }

    @Override // com.google.android.exoplayer2.upstream.cache.CacheEvictor
    public void onCacheInitialized() {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public void onSpanAdded(com.google.android.exoplayer2.upstream.cache.Cache r5, com.google.android.exoplayer2.upstream.cache.CacheSpan r6) {
            r4 = this;
            java.util.TreeSet<com.google.android.exoplayer2.upstream.cache.CacheSpan> r0 = r4.leastRecentlyUsed
            r0.add(r6)
            long r0 = r4.currentSize
            long r2 = r6.length
            long r0 = r0 + r2
            r4.currentSize = r0
            r0 = 0
            r4.evictCache(r5, r0)
            return
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public void onSpanRemoved(com.google.android.exoplayer2.upstream.cache.Cache r3, com.google.android.exoplayer2.upstream.cache.CacheSpan r4) {
            r2 = this;
            java.util.TreeSet<com.google.android.exoplayer2.upstream.cache.CacheSpan> r3 = r2.leastRecentlyUsed
            r3.remove(r4)
            long r0 = r2.currentSize
            long r3 = r4.length
            long r0 = r0 - r3
            r2.currentSize = r0
            return
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public void onSpanTouched(com.google.android.exoplayer2.upstream.cache.Cache r1, com.google.android.exoplayer2.upstream.cache.CacheSpan r2, com.google.android.exoplayer2.upstream.cache.CacheSpan r3) {
            r0 = this;
            r0.onSpanRemoved(r1, r2)
            r0.onSpanAdded(r1, r3)
            return
    }

    @Override // com.google.android.exoplayer2.upstream.cache.CacheEvictor
    public void onStartFile(com.google.android.exoplayer2.upstream.cache.Cache r1, java.lang.String r2, long r3, long r5) {
            r0 = this;
            r2 = -1
            int r4 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r4 == 0) goto L9
            r0.evictCache(r1, r5)
        L9:
            return
    }

    @Override // com.google.android.exoplayer2.upstream.cache.CacheEvictor
    public boolean requiresCacheSpanTouches() {
            r1 = this;
            r0 = 1
            return r0
    }
}
