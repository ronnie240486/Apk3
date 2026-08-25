package com.google.android.exoplayer2.upstream.cache;

/* JADX INFO: loaded from: classes.dex */
public interface Cache {
    public static final long UID_UNSET = -1;

    /* JADX INFO: loaded from: classes2.dex */
    public static class CacheException extends java.io.IOException {
        public CacheException(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public CacheException(java.lang.String r1, java.lang.Throwable r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public CacheException(java.lang.Throwable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    public interface Listener {
        void onSpanAdded(com.google.android.exoplayer2.upstream.cache.Cache r1, com.google.android.exoplayer2.upstream.cache.CacheSpan r2);

        void onSpanRemoved(com.google.android.exoplayer2.upstream.cache.Cache r1, com.google.android.exoplayer2.upstream.cache.CacheSpan r2);

        void onSpanTouched(com.google.android.exoplayer2.upstream.cache.Cache r1, com.google.android.exoplayer2.upstream.cache.CacheSpan r2, com.google.android.exoplayer2.upstream.cache.CacheSpan r3);
    }

    java.util.NavigableSet<com.google.android.exoplayer2.upstream.cache.CacheSpan> addListener(java.lang.String r1, com.google.android.exoplayer2.upstream.cache.Cache.Listener r2);

    @androidx.annotation.WorkerThread
    void applyContentMetadataMutations(java.lang.String r1, com.google.android.exoplayer2.upstream.cache.ContentMetadataMutations r2) throws com.google.android.exoplayer2.upstream.cache.Cache.CacheException;

    @androidx.annotation.WorkerThread
    void commitFile(java.io.File r1, long r2) throws com.google.android.exoplayer2.upstream.cache.Cache.CacheException;

    long getCacheSpace();

    long getCachedBytes(java.lang.String r1, long r2, long r4);

    long getCachedLength(java.lang.String r1, long r2, long r4);

    java.util.NavigableSet<com.google.android.exoplayer2.upstream.cache.CacheSpan> getCachedSpans(java.lang.String r1);

    com.google.android.exoplayer2.upstream.cache.ContentMetadata getContentMetadata(java.lang.String r1);

    java.util.Set<java.lang.String> getKeys();

    long getUid();

    boolean isCached(java.lang.String r1, long r2, long r4);

    @androidx.annotation.WorkerThread
    void release();

    void releaseHoleSpan(com.google.android.exoplayer2.upstream.cache.CacheSpan r1);

    void removeListener(java.lang.String r1, com.google.android.exoplayer2.upstream.cache.Cache.Listener r2);

    @androidx.annotation.WorkerThread
    void removeResource(java.lang.String r1);

    @androidx.annotation.WorkerThread
    void removeSpan(com.google.android.exoplayer2.upstream.cache.CacheSpan r1);

    @androidx.annotation.WorkerThread
    java.io.File startFile(java.lang.String r1, long r2, long r4) throws com.google.android.exoplayer2.upstream.cache.Cache.CacheException;

    @androidx.annotation.WorkerThread
    com.google.android.exoplayer2.upstream.cache.CacheSpan startReadWrite(java.lang.String r1, long r2, long r4) throws java.lang.InterruptedException, com.google.android.exoplayer2.upstream.cache.Cache.CacheException;

    @androidx.annotation.Nullable
    @androidx.annotation.WorkerThread
    com.google.android.exoplayer2.upstream.cache.CacheSpan startReadWriteNonBlocking(java.lang.String r1, long r2, long r4) throws com.google.android.exoplayer2.upstream.cache.Cache.CacheException;
}
