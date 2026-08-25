package com.google.android.exoplayer2.upstream.cache;

/* JADX INFO: loaded from: classes.dex */
public final class NoOpCacheEvictor implements com.google.android.exoplayer2.upstream.cache.CacheEvictor {
    public NoOpCacheEvictor() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.exoplayer2.upstream.cache.CacheEvictor
    public void onCacheInitialized() {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public void onSpanAdded(com.google.android.exoplayer2.upstream.cache.Cache r1, com.google.android.exoplayer2.upstream.cache.CacheSpan r2) {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public void onSpanRemoved(com.google.android.exoplayer2.upstream.cache.Cache r1, com.google.android.exoplayer2.upstream.cache.CacheSpan r2) {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public void onSpanTouched(com.google.android.exoplayer2.upstream.cache.Cache r1, com.google.android.exoplayer2.upstream.cache.CacheSpan r2, com.google.android.exoplayer2.upstream.cache.CacheSpan r3) {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.upstream.cache.CacheEvictor
    public void onStartFile(com.google.android.exoplayer2.upstream.cache.Cache r1, java.lang.String r2, long r3, long r5) {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.upstream.cache.CacheEvictor
    public boolean requiresCacheSpanTouches() {
            r1 = this;
            r0 = 0
            return r0
    }
}
