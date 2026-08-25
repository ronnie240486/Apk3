package com.google.android.exoplayer2.upstream.cache;

/* JADX INFO: loaded from: classes2.dex */
public interface CacheEvictor extends com.google.android.exoplayer2.upstream.cache.Cache.Listener {
    void onCacheInitialized();

    void onStartFile(com.google.android.exoplayer2.upstream.cache.Cache r1, java.lang.String r2, long r3, long r5);

    boolean requiresCacheSpanTouches();
}
