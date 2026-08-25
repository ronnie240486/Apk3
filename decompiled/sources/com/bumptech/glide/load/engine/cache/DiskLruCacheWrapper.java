package com.bumptech.glide.load.engine.cache;

/* JADX INFO: loaded from: classes.dex */
public class DiskLruCacheWrapper implements com.bumptech.glide.load.engine.cache.DiskCache {
    private static final int APP_VERSION = 1;
    private static final java.lang.String TAG = "DiskLruCacheWrapper";
    private static final int VALUE_COUNT = 1;
    private static com.bumptech.glide.load.engine.cache.DiskLruCacheWrapper wrapper;
    private final java.io.File directory;
    private com.bumptech.glide.disklrucache.DiskLruCache diskLruCache;
    private final long maxSize;
    private final com.bumptech.glide.load.engine.cache.SafeKeyGenerator safeKeyGenerator;
    private final com.bumptech.glide.load.engine.cache.DiskCacheWriteLocker writeLocker;

    @java.lang.Deprecated
    public DiskLruCacheWrapper(java.io.File r2, long r3) {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.load.engine.cache.DiskCacheWriteLocker r0 = new com.bumptech.glide.load.engine.cache.DiskCacheWriteLocker
            r0.<init>()
            r1.writeLocker = r0
            r1.directory = r2
            r1.maxSize = r3
            com.bumptech.glide.load.engine.cache.SafeKeyGenerator r2 = new com.bumptech.glide.load.engine.cache.SafeKeyGenerator
            r2.<init>()
            r1.safeKeyGenerator = r2
            return
    }

    public static com.bumptech.glide.load.engine.cache.DiskCache create(java.io.File r1, long r2) {
            com.bumptech.glide.load.engine.cache.DiskLruCacheWrapper r0 = new com.bumptech.glide.load.engine.cache.DiskLruCacheWrapper
            r0.<init>(r1, r2)
            return r0
    }

    @java.lang.Deprecated
    public static synchronized com.bumptech.glide.load.engine.cache.DiskCache get(java.io.File r2, long r3) {
            java.lang.Class<com.bumptech.glide.load.engine.cache.DiskLruCacheWrapper> r0 = com.bumptech.glide.load.engine.cache.DiskLruCacheWrapper.class
            monitor-enter(r0)
            com.bumptech.glide.load.engine.cache.DiskLruCacheWrapper r1 = com.bumptech.glide.load.engine.cache.DiskLruCacheWrapper.wrapper     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto Le
            com.bumptech.glide.load.engine.cache.DiskLruCacheWrapper r1 = new com.bumptech.glide.load.engine.cache.DiskLruCacheWrapper     // Catch: java.lang.Throwable -> L12
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L12
            com.bumptech.glide.load.engine.cache.DiskLruCacheWrapper.wrapper = r1     // Catch: java.lang.Throwable -> L12
        Le:
            com.bumptech.glide.load.engine.cache.DiskLruCacheWrapper r2 = com.bumptech.glide.load.engine.cache.DiskLruCacheWrapper.wrapper     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)
            return r2
        L12:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    private synchronized com.bumptech.glide.disklrucache.DiskLruCache getDiskCache() throws java.io.IOException {
            r4 = this;
            monitor-enter(r4)
            com.bumptech.glide.disklrucache.DiskLruCache r0 = r4.diskLruCache     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L10
            java.io.File r0 = r4.directory     // Catch: java.lang.Throwable -> L14
            long r1 = r4.maxSize     // Catch: java.lang.Throwable -> L14
            r3 = 1
            com.bumptech.glide.disklrucache.DiskLruCache r0 = com.bumptech.glide.disklrucache.DiskLruCache.open(r0, r3, r3, r1)     // Catch: java.lang.Throwable -> L14
            r4.diskLruCache = r0     // Catch: java.lang.Throwable -> L14
        L10:
            com.bumptech.glide.disklrucache.DiskLruCache r0 = r4.diskLruCache     // Catch: java.lang.Throwable -> L14
            monitor-exit(r4)
            return r0
        L14:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }

    private synchronized void resetDiskCache() {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            r1.diskLruCache = r0     // Catch: java.lang.Throwable -> L6
            monitor-exit(r1)
            return
        L6:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache
    public synchronized void clear() {
            r3 = this;
            monitor-enter(r3)
            com.bumptech.glide.disklrucache.DiskLruCache r0 = r3.getDiskCache()     // Catch: java.lang.Throwable -> Lc java.io.IOException -> Le
            r0.delete()     // Catch: java.lang.Throwable -> Lc java.io.IOException -> Le
        L8:
            r3.resetDiskCache()     // Catch: java.lang.Throwable -> L26
            goto L20
        Lc:
            r0 = move-exception
            goto L22
        Le:
            r0 = move-exception
            java.lang.String r1 = "DiskLruCacheWrapper"
            r2 = 5
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto L8
            java.lang.String r1 = "DiskLruCacheWrapper"
            java.lang.String r2 = "Unable to clear disk cache or disk cache cleared externally"
            android.util.Log.w(r1, r2, r0)     // Catch: java.lang.Throwable -> Lc
            goto L8
        L20:
            monitor-exit(r3)
            return
        L22:
            r3.resetDiskCache()     // Catch: java.lang.Throwable -> L26
            throw r0     // Catch: java.lang.Throwable -> L26
        L26:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache
    public void delete(com.bumptech.glide.load.Key r3) {
            r2 = this;
            com.bumptech.glide.load.engine.cache.SafeKeyGenerator r0 = r2.safeKeyGenerator
            java.lang.String r3 = r0.getSafeKey(r3)
            com.bumptech.glide.disklrucache.DiskLruCache r0 = r2.getDiskCache()     // Catch: java.io.IOException -> Le
            r0.remove(r3)     // Catch: java.io.IOException -> Le
            goto L1d
        Le:
            r3 = move-exception
            r0 = 5
            java.lang.String r1 = "DiskLruCacheWrapper"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L1d
            java.lang.String r0 = "Unable to delete from disk cache"
            android.util.Log.w(r1, r0, r3)
        L1d:
            return
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache
    public java.io.File get(com.bumptech.glide.load.Key r5) {
            r4 = this;
            com.bumptech.glide.load.engine.cache.SafeKeyGenerator r0 = r4.safeKeyGenerator
            java.lang.String r0 = r0.getSafeKey(r5)
            java.lang.String r1 = "DiskLruCacheWrapper"
            r2 = 2
            boolean r2 = android.util.Log.isLoggable(r1, r2)
            if (r2 == 0) goto L2b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Get: Obtained: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = " for for Key: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            android.util.Log.v(r1, r5)
        L2b:
            r5 = 0
            com.bumptech.glide.disklrucache.DiskLruCache r2 = r4.getDiskCache()     // Catch: java.io.IOException -> L3c
            com.bumptech.glide.disklrucache.DiskLruCache$Value r0 = r2.get(r0)     // Catch: java.io.IOException -> L3c
            if (r0 == 0) goto L49
            r2 = 0
            java.io.File r5 = r0.getFile(r2)     // Catch: java.io.IOException -> L3c
            goto L49
        L3c:
            r0 = move-exception
            r2 = 5
            boolean r2 = android.util.Log.isLoggable(r1, r2)
            if (r2 == 0) goto L49
            java.lang.String r2 = "Unable to get from disk cache"
            android.util.Log.w(r1, r2, r0)
        L49:
            return r5
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache
    public void put(com.bumptech.glide.load.Key r5, com.bumptech.glide.load.engine.cache.DiskCache.Writer r6) {
            r4 = this;
            java.lang.String r0 = "DiskLruCacheWrapper"
            com.bumptech.glide.load.engine.cache.SafeKeyGenerator r1 = r4.safeKeyGenerator
            java.lang.String r1 = r1.getSafeKey(r5)
            com.bumptech.glide.load.engine.cache.DiskCacheWriteLocker r2 = r4.writeLocker
            r2.acquire(r1)
            r2 = 2
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> L87
            if (r2 == 0) goto L30
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L87
            r2.<init>()     // Catch: java.lang.Throwable -> L87
            java.lang.String r3 = "Put: Obtained: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L87
            r2.append(r1)     // Catch: java.lang.Throwable -> L87
            java.lang.String r3 = " for for Key: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L87
            r2.append(r5)     // Catch: java.lang.Throwable -> L87
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L87
            android.util.Log.v(r0, r5)     // Catch: java.lang.Throwable -> L87
        L30:
            com.bumptech.glide.disklrucache.DiskLruCache r5 = r4.getDiskCache()     // Catch: java.io.IOException -> L74 java.lang.Throwable -> L87
            com.bumptech.glide.disklrucache.DiskLruCache$Value r2 = r5.get(r1)     // Catch: java.io.IOException -> L74 java.lang.Throwable -> L87
            if (r2 == 0) goto L40
            com.bumptech.glide.load.engine.cache.DiskCacheWriteLocker r5 = r4.writeLocker
            r5.release(r1)
            return
        L40:
            com.bumptech.glide.disklrucache.DiskLruCache$Editor r5 = r5.edit(r1)     // Catch: java.io.IOException -> L74 java.lang.Throwable -> L87
            if (r5 == 0) goto L5d
            r2 = 0
            java.io.File r2 = r5.getFile(r2)     // Catch: java.lang.Throwable -> L58
            boolean r6 = r6.write(r2)     // Catch: java.lang.Throwable -> L58
            if (r6 == 0) goto L54
            r5.commit()     // Catch: java.lang.Throwable -> L58
        L54:
            r5.abortUnlessCommitted()     // Catch: java.io.IOException -> L74 java.lang.Throwable -> L87
            goto L81
        L58:
            r6 = move-exception
            r5.abortUnlessCommitted()     // Catch: java.io.IOException -> L74 java.lang.Throwable -> L87
            throw r6     // Catch: java.io.IOException -> L74 java.lang.Throwable -> L87
        L5d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.io.IOException -> L74 java.lang.Throwable -> L87
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L74 java.lang.Throwable -> L87
            r6.<init>()     // Catch: java.io.IOException -> L74 java.lang.Throwable -> L87
            java.lang.String r2 = "Had two simultaneous puts for: "
            r6.append(r2)     // Catch: java.io.IOException -> L74 java.lang.Throwable -> L87
            r6.append(r1)     // Catch: java.io.IOException -> L74 java.lang.Throwable -> L87
            java.lang.String r6 = r6.toString()     // Catch: java.io.IOException -> L74 java.lang.Throwable -> L87
            r5.<init>(r6)     // Catch: java.io.IOException -> L74 java.lang.Throwable -> L87
            throw r5     // Catch: java.io.IOException -> L74 java.lang.Throwable -> L87
        L74:
            r5 = move-exception
            r6 = 5
            boolean r6 = android.util.Log.isLoggable(r0, r6)     // Catch: java.lang.Throwable -> L87
            if (r6 == 0) goto L81
            java.lang.String r6 = "Unable to put to disk cache"
            android.util.Log.w(r0, r6, r5)     // Catch: java.lang.Throwable -> L87
        L81:
            com.bumptech.glide.load.engine.cache.DiskCacheWriteLocker r5 = r4.writeLocker
            r5.release(r1)
            return
        L87:
            r5 = move-exception
            com.bumptech.glide.load.engine.cache.DiskCacheWriteLocker r6 = r4.writeLocker
            r6.release(r1)
            throw r5
    }
}
