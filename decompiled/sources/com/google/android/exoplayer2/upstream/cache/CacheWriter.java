package com.google.android.exoplayer2.upstream.cache;

/* JADX INFO: loaded from: classes2.dex */
public final class CacheWriter {
    public static final int DEFAULT_BUFFER_SIZE_BYTES = 131072;
    private long bytesCached;
    private final com.google.android.exoplayer2.upstream.cache.Cache cache;
    private final java.lang.String cacheKey;
    private final com.google.android.exoplayer2.upstream.cache.CacheDataSource dataSource;
    private final com.google.android.exoplayer2.upstream.DataSpec dataSpec;
    private long endPosition;
    private volatile boolean isCanceled;
    private long nextPosition;

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.upstream.cache.CacheWriter.ProgressListener progressListener;
    private final byte[] temporaryBuffer;

    /* JADX INFO: loaded from: classes.dex */
    public interface ProgressListener {
        void onProgress(long r1, long r3, long r5);
    }

    public CacheWriter(com.google.android.exoplayer2.upstream.cache.CacheDataSource r2, com.google.android.exoplayer2.upstream.DataSpec r3, @androidx.annotation.Nullable byte[] r4, @androidx.annotation.Nullable com.google.android.exoplayer2.upstream.cache.CacheWriter.ProgressListener r5) {
            r1 = this;
            r1.<init>()
            r1.dataSource = r2
            com.google.android.exoplayer2.upstream.cache.Cache r0 = r2.getCache()
            r1.cache = r0
            r1.dataSpec = r3
            if (r4 != 0) goto L13
            r4 = 131072(0x20000, float:1.83671E-40)
            byte[] r4 = new byte[r4]
        L13:
            r1.temporaryBuffer = r4
            r1.progressListener = r5
            com.google.android.exoplayer2.upstream.cache.CacheKeyFactory r2 = r2.getCacheKeyFactory()
            java.lang.String r2 = r2.buildCacheKey(r3)
            r1.cacheKey = r2
            long r2 = r3.position
            r1.nextPosition = r2
            return
    }

    private long getLength() {
            r5 = this;
            long r0 = r5.endPosition
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L9
            goto Lf
        L9:
            com.google.android.exoplayer2.upstream.DataSpec r2 = r5.dataSpec
            long r2 = r2.position
            long r2 = r0 - r2
        Lf:
            return r2
    }

    private void onNewBytesCached(long r10) {
            r9 = this;
            long r0 = r9.bytesCached
            long r0 = r0 + r10
            r9.bytesCached = r0
            com.google.android.exoplayer2.upstream.cache.CacheWriter$ProgressListener r2 = r9.progressListener
            if (r2 == 0) goto L13
            long r3 = r9.getLength()
            long r5 = r9.bytesCached
            r7 = r10
            r2.onProgress(r3, r5, r7)
        L13:
            return
    }

    private void onRequestEndPosition(long r11) {
            r10 = this;
            long r0 = r10.endPosition
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 != 0) goto L7
            return
        L7:
            r10.endPosition = r11
            com.google.android.exoplayer2.upstream.cache.CacheWriter$ProgressListener r3 = r10.progressListener
            if (r3 == 0) goto L18
            long r4 = r10.getLength()
            long r6 = r10.bytesCached
            r8 = 0
            r3.onProgress(r4, r6, r8)
        L18:
            return
    }

    private long readBlockToCache(long r10, long r12) throws java.io.IOException {
            r9 = this;
            long r0 = r10 + r12
            long r2 = r9.endPosition
            r4 = 1
            r5 = 0
            r6 = -1
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 == 0) goto L13
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 != 0) goto L11
            goto L13
        L11:
            r0 = 0
            goto L14
        L13:
            r0 = 1
        L14:
            int r1 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r1 == 0) goto L36
            com.google.android.exoplayer2.upstream.DataSpec r1 = r9.dataSpec
            com.google.android.exoplayer2.upstream.DataSpec$Builder r1 = r1.buildUpon()
            com.google.android.exoplayer2.upstream.DataSpec$Builder r1 = r1.setPosition(r10)
            com.google.android.exoplayer2.upstream.DataSpec$Builder r12 = r1.setLength(r12)
            com.google.android.exoplayer2.upstream.DataSpec r12 = r12.build()
            com.google.android.exoplayer2.upstream.cache.CacheDataSource r13 = r9.dataSource     // Catch: java.io.IOException -> L31
            long r12 = r13.open(r12)     // Catch: java.io.IOException -> L31
            goto L38
        L31:
            com.google.android.exoplayer2.upstream.cache.CacheDataSource r12 = r9.dataSource
            com.google.android.exoplayer2.upstream.DataSourceUtil.closeQuietly(r12)
        L36:
            r12 = r6
            r4 = 0
        L38:
            if (r4 != 0) goto L5d
            r9.throwIfCanceled()
            com.google.android.exoplayer2.upstream.DataSpec r12 = r9.dataSpec
            com.google.android.exoplayer2.upstream.DataSpec$Builder r12 = r12.buildUpon()
            com.google.android.exoplayer2.upstream.DataSpec$Builder r12 = r12.setPosition(r10)
            com.google.android.exoplayer2.upstream.DataSpec$Builder r12 = r12.setLength(r6)
            com.google.android.exoplayer2.upstream.DataSpec r12 = r12.build()
            com.google.android.exoplayer2.upstream.cache.CacheDataSource r13 = r9.dataSource     // Catch: java.io.IOException -> L56
            long r12 = r13.open(r12)     // Catch: java.io.IOException -> L56
            goto L5d
        L56:
            r10 = move-exception
            com.google.android.exoplayer2.upstream.cache.CacheDataSource r11 = r9.dataSource
            com.google.android.exoplayer2.upstream.DataSourceUtil.closeQuietly(r11)
            throw r10
        L5d:
            if (r0 == 0) goto L6a
            int r1 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r1 == 0) goto L6a
            long r12 = r12 + r10
            r9.onRequestEndPosition(r12)     // Catch: java.io.IOException -> L68
            goto L6a
        L68:
            r10 = move-exception
            goto L8b
        L6a:
            r12 = 0
            r13 = 0
        L6c:
            r1 = -1
            if (r12 == r1) goto L83
            r9.throwIfCanceled()     // Catch: java.io.IOException -> L68
            com.google.android.exoplayer2.upstream.cache.CacheDataSource r12 = r9.dataSource     // Catch: java.io.IOException -> L68
            byte[] r2 = r9.temporaryBuffer     // Catch: java.io.IOException -> L68
            int r3 = r2.length     // Catch: java.io.IOException -> L68
            int r12 = r12.read(r2, r5, r3)     // Catch: java.io.IOException -> L68
            if (r12 == r1) goto L6c
            long r1 = (long) r12     // Catch: java.io.IOException -> L68
            r9.onNewBytesCached(r1)     // Catch: java.io.IOException -> L68
            int r13 = r13 + r12
            goto L6c
        L83:
            if (r0 == 0) goto L91
            long r0 = (long) r13     // Catch: java.io.IOException -> L68
            long r10 = r10 + r0
            r9.onRequestEndPosition(r10)     // Catch: java.io.IOException -> L68
            goto L91
        L8b:
            com.google.android.exoplayer2.upstream.cache.CacheDataSource r11 = r9.dataSource
            com.google.android.exoplayer2.upstream.DataSourceUtil.closeQuietly(r11)
            throw r10
        L91:
            com.google.android.exoplayer2.upstream.cache.CacheDataSource r10 = r9.dataSource
            r10.close()
            long r10 = (long) r13
            return r10
    }

    private void throwIfCanceled() throws java.io.InterruptedIOException {
            r1 = this;
            boolean r0 = r1.isCanceled
            if (r0 != 0) goto L5
            return
        L5:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            r0.<init>()
            throw r0
    }

    @androidx.annotation.WorkerThread
    public void cache() throws java.io.IOException {
            r13 = this;
            r13.throwIfCanceled()
            com.google.android.exoplayer2.upstream.cache.Cache r0 = r13.cache
            java.lang.String r1 = r13.cacheKey
            com.google.android.exoplayer2.upstream.DataSpec r2 = r13.dataSpec
            long r3 = r2.position
            long r5 = r2.length
            r2 = r3
            r4 = r5
            long r0 = r0.getCachedBytes(r1, r2, r4)
            r13.bytesCached = r0
            com.google.android.exoplayer2.upstream.DataSpec r0 = r13.dataSpec
            long r1 = r0.length
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L25
            long r5 = r0.position
            long r5 = r5 + r1
            r13.endPosition = r5
            goto L38
        L25:
            com.google.android.exoplayer2.upstream.cache.Cache r0 = r13.cache
            java.lang.String r1 = r13.cacheKey
            com.google.android.exoplayer2.upstream.cache.ContentMetadata r0 = r0.getContentMetadata(r1)
            long r0 = com.google.android.exoplayer2.upstream.cache.ContentMetadata.CC.getContentLength(r0)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L36
            r0 = r3
        L36:
            r13.endPosition = r0
        L38:
            com.google.android.exoplayer2.upstream.cache.CacheWriter$ProgressListener r5 = r13.progressListener
            if (r5 == 0) goto L47
            long r6 = r13.getLength()
            long r8 = r13.bytesCached
            r10 = 0
            r5.onProgress(r6, r8, r10)
        L47:
            long r0 = r13.endPosition
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 == 0) goto L55
            long r5 = r13.nextPosition
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 >= 0) goto L54
            goto L55
        L54:
            return
        L55:
            r13.throwIfCanceled()
            long r0 = r13.endPosition
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L65
            r11 = r5
            goto L69
        L65:
            long r7 = r13.nextPosition
            long r0 = r0 - r7
            r11 = r0
        L69:
            com.google.android.exoplayer2.upstream.cache.Cache r7 = r13.cache
            java.lang.String r8 = r13.cacheKey
            long r9 = r13.nextPosition
            long r0 = r7.getCachedLength(r8, r9, r11)
            r7 = 0
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 <= 0) goto L7f
            long r5 = r13.nextPosition
            long r5 = r5 + r0
            r13.nextPosition = r5
            goto L47
        L7f:
            long r0 = -r0
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L85
            r0 = r3
        L85:
            long r5 = r13.nextPosition
            long r0 = r13.readBlockToCache(r5, r0)
            long r5 = r5 + r0
            r13.nextPosition = r5
            goto L47
    }

    public void cancel() {
            r1 = this;
            r0 = 1
            r1.isCanceled = r0
            return
    }
}
