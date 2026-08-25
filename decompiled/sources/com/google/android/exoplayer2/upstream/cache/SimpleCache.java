package com.google.android.exoplayer2.upstream.cache;

/* JADX INFO: loaded from: classes.dex */
public final class SimpleCache implements com.google.android.exoplayer2.upstream.cache.Cache {
    private static final int SUBDIRECTORY_COUNT = 10;
    private static final java.lang.String TAG = "SimpleCache";
    private static final java.lang.String UID_FILE_SUFFIX = ".uid";
    private static final java.util.HashSet<java.io.File> lockedCacheDirs = null;
    private final java.io.File cacheDir;
    private final com.google.android.exoplayer2.upstream.cache.CachedContentIndex contentIndex;
    private final com.google.android.exoplayer2.upstream.cache.CacheEvictor evictor;

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.upstream.cache.CacheFileMetadataIndex fileIndex;
    private com.google.android.exoplayer2.upstream.cache.Cache.CacheException initializationException;
    private final java.util.HashMap<java.lang.String, java.util.ArrayList<com.google.android.exoplayer2.upstream.cache.Cache.Listener>> listeners;
    private final java.util.Random random;
    private boolean released;
    private long totalSpace;
    private final boolean touchCacheSpans;
    private long uid;


    static {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            com.google.android.exoplayer2.upstream.cache.SimpleCache.lockedCacheDirs = r0
            return
    }

    @java.lang.Deprecated
    public SimpleCache(java.io.File r3, com.google.android.exoplayer2.upstream.cache.CacheEvictor r4) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r3, r4, r0, r1)
            return
    }

    public SimpleCache(java.io.File r8, com.google.android.exoplayer2.upstream.cache.CacheEvictor r9, com.google.android.exoplayer2.database.DatabaseProvider r10) {
            r7 = this;
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public SimpleCache(java.io.File r8, com.google.android.exoplayer2.upstream.cache.CacheEvictor r9, @androidx.annotation.Nullable com.google.android.exoplayer2.database.DatabaseProvider r10, @androidx.annotation.Nullable byte[] r11, boolean r12, boolean r13) {
            r7 = this;
            com.google.android.exoplayer2.upstream.cache.CachedContentIndex r6 = new com.google.android.exoplayer2.upstream.cache.CachedContentIndex
            r0 = r6
            r1 = r10
            r2 = r8
            r3 = r11
            r4 = r12
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            if (r10 == 0) goto L15
            if (r13 != 0) goto L15
            com.google.android.exoplayer2.upstream.cache.CacheFileMetadataIndex r11 = new com.google.android.exoplayer2.upstream.cache.CacheFileMetadataIndex
            r11.<init>(r10)
            goto L16
        L15:
            r11 = 0
        L16:
            r7.<init>()
            boolean r10 = lockFolder(r8)
            if (r10 == 0) goto L50
            r7.cacheDir = r8
            r7.evictor = r9
            r7.contentIndex = r6
            r7.fileIndex = r11
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            r7.listeners = r8
            java.util.Random r8 = new java.util.Random
            r8.<init>()
            r7.random = r8
            boolean r8 = r9.requiresCacheSpanTouches()
            r7.touchCacheSpans = r8
            r8 = -1
            r7.uid = r8
            android.os.ConditionVariable r8 = new android.os.ConditionVariable
            r8.<init>()
            com.google.android.exoplayer2.upstream.cache.SimpleCache$1 r9 = new com.google.android.exoplayer2.upstream.cache.SimpleCache$1
            r9.<init>(r7, r8)
            r9.start()
            r8.block()
            return
        L50:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Another SimpleCache instance uses the folder: "
            r10.append(r11)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r9.<init>(r8)
            throw r9
    }

    @java.lang.Deprecated
    public SimpleCache(java.io.File r2, com.google.android.exoplayer2.upstream.cache.CacheEvictor r3, @androidx.annotation.Nullable byte[] r4) {
            r1 = this;
            if (r4 == 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            r1.<init>(r2, r3, r4, r0)
            return
    }

    @java.lang.Deprecated
    public SimpleCache(java.io.File r8, com.google.android.exoplayer2.upstream.cache.CacheEvictor r9, @androidx.annotation.Nullable byte[] r10, boolean r11) {
            r7 = this;
            r3 = 0
            r6 = 1
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public static /* synthetic */ void access$000(com.google.android.exoplayer2.upstream.cache.SimpleCache r0) {
            r0.initialize()
            return
    }

    public static /* synthetic */ com.google.android.exoplayer2.upstream.cache.CacheEvictor access$100(com.google.android.exoplayer2.upstream.cache.SimpleCache r0) {
            com.google.android.exoplayer2.upstream.cache.CacheEvictor r0 = r0.evictor
            return r0
    }

    private void addSpan(com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan r5) {
            r4 = this;
            com.google.android.exoplayer2.upstream.cache.CachedContentIndex r0 = r4.contentIndex
            java.lang.String r1 = r5.key
            com.google.android.exoplayer2.upstream.cache.CachedContent r0 = r0.getOrAdd(r1)
            r0.addSpan(r5)
            long r0 = r4.totalSpace
            long r2 = r5.length
            long r0 = r0 + r2
            r4.totalSpace = r0
            r4.notifySpanAdded(r5)
            return
    }

    private static void createCacheDirectories(java.io.File r2) throws com.google.android.exoplayer2.upstream.cache.Cache.CacheException {
            boolean r0 = r2.mkdirs()
            if (r0 != 0) goto L29
            boolean r0 = r2.isDirectory()
            if (r0 == 0) goto Ld
            goto L29
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to create cache directory: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "SimpleCache"
            com.google.android.exoplayer2.util.Log.e(r0, r2)
            com.google.android.exoplayer2.upstream.cache.Cache$CacheException r0 = new com.google.android.exoplayer2.upstream.cache.Cache$CacheException
            r0.<init>(r2)
            throw r0
        L29:
            return
    }

    private static long createUid(java.io.File r5) throws java.io.IOException {
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
            long r0 = r0.nextLong()
            r2 = -9223372036854775808
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L12
            r0 = 0
            goto L16
        L12:
            long r0 = java.lang.Math.abs(r0)
        L16:
            r2 = 16
            java.lang.String r2 = java.lang.Long.toString(r0, r2)
            java.io.File r3 = new java.io.File
            java.lang.String r4 = ".uid"
            java.lang.String r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r4)
            r3.<init>(r5, r2)
            boolean r5 = r3.createNewFile()
            if (r5 == 0) goto L2e
            return r0
        L2e:
            java.io.IOException r5 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to create UID file: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
    }

    @androidx.annotation.WorkerThread
    public static void delete(java.io.File r7, @androidx.annotation.Nullable com.google.android.exoplayer2.database.DatabaseProvider r8) {
            java.lang.String r0 = "Failed to delete file metadata: "
            java.lang.String r1 = "SimpleCache"
            boolean r2 = r7.exists()
            if (r2 != 0) goto Lb
            return
        Lb:
            java.io.File[] r2 = r7.listFiles()
            if (r2 != 0) goto L15
            r7.delete()
            return
        L15:
            if (r8 == 0) goto L4d
            long r2 = loadUid(r2)
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L4d
            com.google.android.exoplayer2.upstream.cache.CacheFileMetadataIndex.delete(r8, r2)     // Catch: com.google.android.exoplayer2.database.DatabaseIOException -> L25
            goto L37
        L25:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            com.google.android.exoplayer2.util.Log.w(r1, r4)
        L37:
            com.google.android.exoplayer2.upstream.cache.CachedContentIndex.delete(r8, r2)     // Catch: com.google.android.exoplayer2.database.DatabaseIOException -> L3b
            goto L4d
        L3b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            com.google.android.exoplayer2.util.Log.w(r1, r8)
        L4d:
            com.google.android.exoplayer2.util.Util.recursiveDelete(r7)
            return
    }

    private com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan getSpan(java.lang.String r7, long r8, long r10) {
            r6 = this;
            com.google.android.exoplayer2.upstream.cache.CachedContentIndex r0 = r6.contentIndex
            com.google.android.exoplayer2.upstream.cache.CachedContent r0 = r0.get(r7)
            if (r0 != 0) goto Ld
            com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan r7 = com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan.createHole(r7, r8, r10)
            return r7
        Ld:
            com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan r7 = r0.getSpan(r8, r10)
            boolean r1 = r7.isCached
            if (r1 == 0) goto L25
            java.io.File r1 = r7.file
            long r1 = r1.length()
            long r3 = r7.length
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L25
            r6.removeStaleSpans()
            goto Ld
        L25:
            return r7
    }

    private void initialize() {
            r7 = this;
            java.io.File r0 = r7.cacheDir
            boolean r0 = r0.exists()
            if (r0 != 0) goto L12
            java.io.File r0 = r7.cacheDir     // Catch: com.google.android.exoplayer2.upstream.cache.Cache.CacheException -> Le
            createCacheDirectories(r0)     // Catch: com.google.android.exoplayer2.upstream.cache.Cache.CacheException -> Le
            goto L12
        Le:
            r0 = move-exception
            r7.initializationException = r0
            return
        L12:
            java.io.File r0 = r7.cacheDir
            java.io.File[] r0 = r0.listFiles()
            java.lang.String r1 = "SimpleCache"
            if (r0 != 0) goto L36
            java.lang.String r0 = "Failed to list cache directory files: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.io.File r2 = r7.cacheDir
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.google.android.exoplayer2.util.Log.e(r1, r0)
            com.google.android.exoplayer2.upstream.cache.Cache$CacheException r1 = new com.google.android.exoplayer2.upstream.cache.Cache$CacheException
            r1.<init>(r0)
            r7.initializationException = r1
            return
        L36:
            long r2 = loadUid(r0)
            r7.uid = r2
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L66
            java.io.File r2 = r7.cacheDir     // Catch: java.io.IOException -> L4b
            long r2 = createUid(r2)     // Catch: java.io.IOException -> L4b
            r7.uid = r2     // Catch: java.io.IOException -> L4b
            goto L66
        L4b:
            r0 = move-exception
            java.lang.String r2 = "Failed to create cache UID: "
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            java.io.File r3 = r7.cacheDir
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.google.android.exoplayer2.util.Log.e(r1, r2, r0)
            com.google.android.exoplayer2.upstream.cache.Cache$CacheException r1 = new com.google.android.exoplayer2.upstream.cache.Cache$CacheException
            r1.<init>(r2, r0)
            r7.initializationException = r1
            return
        L66:
            com.google.android.exoplayer2.upstream.cache.CachedContentIndex r2 = r7.contentIndex     // Catch: java.io.IOException -> La4
            long r3 = r7.uid     // Catch: java.io.IOException -> La4
            r2.initialize(r3)     // Catch: java.io.IOException -> La4
            com.google.android.exoplayer2.upstream.cache.CacheFileMetadataIndex r2 = r7.fileIndex     // Catch: java.io.IOException -> La4
            r3 = 1
            if (r2 == 0) goto L8c
            long r4 = r7.uid     // Catch: java.io.IOException -> La4
            r2.initialize(r4)     // Catch: java.io.IOException -> La4
            com.google.android.exoplayer2.upstream.cache.CacheFileMetadataIndex r2 = r7.fileIndex     // Catch: java.io.IOException -> La4
            java.util.Map r2 = r2.getAll()     // Catch: java.io.IOException -> La4
            java.io.File r4 = r7.cacheDir     // Catch: java.io.IOException -> La4
            r7.loadDirectory(r4, r3, r0, r2)     // Catch: java.io.IOException -> La4
            com.google.android.exoplayer2.upstream.cache.CacheFileMetadataIndex r0 = r7.fileIndex     // Catch: java.io.IOException -> La4
            java.util.Set r2 = r2.keySet()     // Catch: java.io.IOException -> La4
            r0.removeAll(r2)     // Catch: java.io.IOException -> La4
            goto L92
        L8c:
            java.io.File r2 = r7.cacheDir     // Catch: java.io.IOException -> La4
            r4 = 0
            r7.loadDirectory(r2, r3, r0, r4)     // Catch: java.io.IOException -> La4
        L92:
            com.google.android.exoplayer2.upstream.cache.CachedContentIndex r0 = r7.contentIndex
            r0.removeEmpty()
            com.google.android.exoplayer2.upstream.cache.CachedContentIndex r0 = r7.contentIndex     // Catch: java.io.IOException -> L9d
            r0.store()     // Catch: java.io.IOException -> L9d
            goto La3
        L9d:
            r0 = move-exception
            java.lang.String r2 = "Storing index file failed"
            com.google.android.exoplayer2.util.Log.e(r1, r2, r0)
        La3:
            return
        La4:
            r0 = move-exception
            java.lang.String r2 = "Failed to initialize cache indices: "
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            java.io.File r3 = r7.cacheDir
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.google.android.exoplayer2.util.Log.e(r1, r2, r0)
            com.google.android.exoplayer2.upstream.cache.Cache$CacheException r1 = new com.google.android.exoplayer2.upstream.cache.Cache$CacheException
            r1.<init>(r2, r0)
            r7.initializationException = r1
            return
    }

    public static synchronized boolean isCacheFolderLocked(java.io.File r2) {
            java.lang.Class<com.google.android.exoplayer2.upstream.cache.SimpleCache> r0 = com.google.android.exoplayer2.upstream.cache.SimpleCache.class
            monitor-enter(r0)
            java.util.HashSet<java.io.File> r1 = com.google.android.exoplayer2.upstream.cache.SimpleCache.lockedCacheDirs     // Catch: java.lang.Throwable -> Lf
            java.io.File r2 = r2.getAbsoluteFile()     // Catch: java.lang.Throwable -> Lf
            boolean r2 = r1.contains(r2)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r2
        Lf:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    private void loadDirectory(java.io.File r10, boolean r11, @androidx.annotation.Nullable java.io.File[] r12, @androidx.annotation.Nullable java.util.Map<java.lang.String, com.google.android.exoplayer2.upstream.cache.CacheFileMetadata> r13) {
            r9 = this;
            if (r12 == 0) goto L60
            int r0 = r12.length
            if (r0 != 0) goto L6
            goto L60
        L6:
            int r10 = r12.length
            r0 = 0
            r1 = 0
        L9:
            if (r1 >= r10) goto L5f
            r8 = r12[r1]
            java.lang.String r2 = r8.getName()
            if (r11 == 0) goto L24
            r3 = 46
            int r3 = r2.indexOf(r3)
            r4 = -1
            if (r3 != r4) goto L24
            java.io.File[] r2 = r8.listFiles()
            r9.loadDirectory(r8, r0, r2, r13)
            goto L5c
        L24:
            if (r11 == 0) goto L35
            boolean r3 = com.google.android.exoplayer2.upstream.cache.CachedContentIndex.isIndexFile(r2)
            if (r3 != 0) goto L5c
            java.lang.String r3 = ".uid"
            boolean r3 = r2.endsWith(r3)
            if (r3 == 0) goto L35
            goto L5c
        L35:
            r3 = -1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r13 == 0) goto L45
            java.lang.Object r2 = r13.remove(r2)
            com.google.android.exoplayer2.upstream.cache.CacheFileMetadata r2 = (com.google.android.exoplayer2.upstream.cache.CacheFileMetadata) r2
            goto L46
        L45:
            r2 = 0
        L46:
            if (r2 == 0) goto L4c
            long r3 = r2.length
            long r5 = r2.lastTouchTimestamp
        L4c:
            com.google.android.exoplayer2.upstream.cache.CachedContentIndex r7 = r9.contentIndex
            r2 = r8
            com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan r2 = com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan.createCacheEntry(r2, r3, r5, r7)
            if (r2 == 0) goto L59
            r9.addSpan(r2)
            goto L5c
        L59:
            r8.delete()
        L5c:
            int r1 = r1 + 1
            goto L9
        L5f:
            return
        L60:
            if (r11 != 0) goto L65
            r10.delete()
        L65:
            return
    }

    private static long loadUid(java.io.File[] r5) {
            int r0 = r5.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L33
            r2 = r5[r1]
            java.lang.String r3 = r2.getName()
            java.lang.String r4 = ".uid"
            boolean r4 = r3.endsWith(r4)
            if (r4 == 0) goto L30
            long r0 = parseUid(r3)     // Catch: java.lang.NumberFormatException -> L17
            return r0
        L17:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Malformed UID file: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "SimpleCache"
            com.google.android.exoplayer2.util.Log.e(r4, r3)
            r2.delete()
        L30:
            int r1 = r1 + 1
            goto L2
        L33:
            r0 = -1
            return r0
    }

    private static synchronized boolean lockFolder(java.io.File r2) {
            java.lang.Class<com.google.android.exoplayer2.upstream.cache.SimpleCache> r0 = com.google.android.exoplayer2.upstream.cache.SimpleCache.class
            monitor-enter(r0)
            java.util.HashSet<java.io.File> r1 = com.google.android.exoplayer2.upstream.cache.SimpleCache.lockedCacheDirs     // Catch: java.lang.Throwable -> Lf
            java.io.File r2 = r2.getAbsoluteFile()     // Catch: java.lang.Throwable -> Lf
            boolean r2 = r1.add(r2)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r2
        Lf:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    private void notifySpanAdded(com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan r4) {
            r3 = this;
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.google.android.exoplayer2.upstream.cache.Cache$Listener>> r0 = r3.listeners
            java.lang.String r1 = r4.key
            java.lang.Object r0 = r0.get(r1)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L20
            int r1 = r0.size()
            int r1 = r1 + (-1)
        L12:
            if (r1 < 0) goto L20
            java.lang.Object r2 = r0.get(r1)
            com.google.android.exoplayer2.upstream.cache.Cache$Listener r2 = (com.google.android.exoplayer2.upstream.cache.Cache.Listener) r2
            r2.onSpanAdded(r3, r4)
            int r1 = r1 + (-1)
            goto L12
        L20:
            com.google.android.exoplayer2.upstream.cache.CacheEvictor r0 = r3.evictor
            r0.onSpanAdded(r3, r4)
            return
    }

    private void notifySpanRemoved(com.google.android.exoplayer2.upstream.cache.CacheSpan r4) {
            r3 = this;
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.google.android.exoplayer2.upstream.cache.Cache$Listener>> r0 = r3.listeners
            java.lang.String r1 = r4.key
            java.lang.Object r0 = r0.get(r1)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L20
            int r1 = r0.size()
            int r1 = r1 + (-1)
        L12:
            if (r1 < 0) goto L20
            java.lang.Object r2 = r0.get(r1)
            com.google.android.exoplayer2.upstream.cache.Cache$Listener r2 = (com.google.android.exoplayer2.upstream.cache.Cache.Listener) r2
            r2.onSpanRemoved(r3, r4)
            int r1 = r1 + (-1)
            goto L12
        L20:
            com.google.android.exoplayer2.upstream.cache.CacheEvictor r0 = r3.evictor
            r0.onSpanRemoved(r3, r4)
            return
    }

    private void notifySpanTouched(com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan r4, com.google.android.exoplayer2.upstream.cache.CacheSpan r5) {
            r3 = this;
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.google.android.exoplayer2.upstream.cache.Cache$Listener>> r0 = r3.listeners
            java.lang.String r1 = r4.key
            java.lang.Object r0 = r0.get(r1)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L20
            int r1 = r0.size()
            int r1 = r1 + (-1)
        L12:
            if (r1 < 0) goto L20
            java.lang.Object r2 = r0.get(r1)
            com.google.android.exoplayer2.upstream.cache.Cache$Listener r2 = (com.google.android.exoplayer2.upstream.cache.Cache.Listener) r2
            r2.onSpanTouched(r3, r4, r5)
            int r1 = r1 + (-1)
            goto L12
        L20:
            com.google.android.exoplayer2.upstream.cache.CacheEvictor r0 = r3.evictor
            r0.onSpanTouched(r3, r4, r5)
            return
    }

    private static long parseUid(java.lang.String r2) {
            r0 = 46
            int r0 = r2.indexOf(r0)
            r1 = 0
            java.lang.String r2 = r2.substring(r1, r0)
            r0 = 16
            long r0 = java.lang.Long.parseLong(r2, r0)
            return r0
    }

    private void removeSpanInternal(com.google.android.exoplayer2.upstream.cache.CacheSpan r6) {
            r5 = this;
            com.google.android.exoplayer2.upstream.cache.CachedContentIndex r0 = r5.contentIndex
            java.lang.String r1 = r6.key
            com.google.android.exoplayer2.upstream.cache.CachedContent r0 = r0.get(r1)
            if (r0 == 0) goto L39
            boolean r1 = r0.removeSpan(r6)
            if (r1 != 0) goto L11
            goto L39
        L11:
            long r1 = r5.totalSpace
            long r3 = r6.length
            long r1 = r1 - r3
            r5.totalSpace = r1
            com.google.android.exoplayer2.upstream.cache.CacheFileMetadataIndex r1 = r5.fileIndex
            if (r1 == 0) goto L2f
            java.io.File r1 = r6.file
            java.lang.String r1 = r1.getName()
            com.google.android.exoplayer2.upstream.cache.CacheFileMetadataIndex r2 = r5.fileIndex     // Catch: java.io.IOException -> L28
            r2.remove(r1)     // Catch: java.io.IOException -> L28
            goto L2f
        L28:
            java.lang.String r2 = "Failed to remove file index entry for: "
            java.lang.String r3 = "SimpleCache"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m27m(r2, r1, r3)
        L2f:
            com.google.android.exoplayer2.upstream.cache.CachedContentIndex r1 = r5.contentIndex
            java.lang.String r0 = r0.key
            r1.maybeRemove(r0)
            r5.notifySpanRemoved(r6)
        L39:
            return
    }

    private void removeStaleSpans() {
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.exoplayer2.upstream.cache.CachedContentIndex r1 = r9.contentIndex
            java.util.Collection r1 = r1.getAll()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r1.next()
            com.google.android.exoplayer2.upstream.cache.CachedContent r2 = (com.google.android.exoplayer2.upstream.cache.CachedContent) r2
            java.util.TreeSet r2 = r2.getSpans()
            java.util.Iterator r2 = r2.iterator()
        L23:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lf
            java.lang.Object r3 = r2.next()
            com.google.android.exoplayer2.upstream.cache.CacheSpan r3 = (com.google.android.exoplayer2.upstream.cache.CacheSpan) r3
            java.io.File r4 = r3.file
            long r4 = r4.length()
            long r6 = r3.length
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L23
            r0.add(r3)
            goto L23
        L3f:
            r1 = 0
        L40:
            int r2 = r0.size()
            if (r1 >= r2) goto L52
            java.lang.Object r2 = r0.get(r1)
            com.google.android.exoplayer2.upstream.cache.CacheSpan r2 = (com.google.android.exoplayer2.upstream.cache.CacheSpan) r2
            r9.removeSpanInternal(r2)
            int r1 = r1 + 1
            goto L40
        L52:
            return
    }

    private com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan touchSpan(java.lang.String r10, com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan r11) {
            r9 = this;
            boolean r0 = r9.touchCacheSpans
            if (r0 != 0) goto L5
            return r11
        L5:
            java.io.File r0 = r11.file
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            java.io.File r0 = (java.io.File) r0
            java.lang.String r2 = r0.getName()
            long r3 = r11.length
            long r7 = java.lang.System.currentTimeMillis()
            r0 = 0
            com.google.android.exoplayer2.upstream.cache.CacheFileMetadataIndex r1 = r9.fileIndex
            if (r1 == 0) goto L29
            r5 = r7
            r1.set(r2, r3, r5)     // Catch: java.io.IOException -> L21
            goto L2a
        L21:
            java.lang.String r1 = "SimpleCache"
            java.lang.String r2 = "Failed to update index with new touch timestamp."
            com.google.android.exoplayer2.util.Log.w(r1, r2)
            goto L2a
        L29:
            r0 = 1
        L2a:
            com.google.android.exoplayer2.upstream.cache.CachedContentIndex r1 = r9.contentIndex
            com.google.android.exoplayer2.upstream.cache.CachedContent r10 = r1.get(r10)
            com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan r10 = r10.setLastTouchTimestamp(r11, r7, r0)
            r9.notifySpanTouched(r11, r10)
            return r10
    }

    private static synchronized void unlockFolder(java.io.File r2) {
            java.lang.Class<com.google.android.exoplayer2.upstream.cache.SimpleCache> r0 = com.google.android.exoplayer2.upstream.cache.SimpleCache.class
            monitor-enter(r0)
            java.util.HashSet<java.io.File> r1 = com.google.android.exoplayer2.upstream.cache.SimpleCache.lockedCacheDirs     // Catch: java.lang.Throwable -> Le
            java.io.File r2 = r2.getAbsoluteFile()     // Catch: java.lang.Throwable -> Le
            r1.remove(r2)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)
            return
        Le:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized java.util.NavigableSet<com.google.android.exoplayer2.upstream.cache.CacheSpan> addListener(java.lang.String r3, com.google.android.exoplayer2.upstream.cache.Cache.Listener r4) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.released     // Catch: java.lang.Throwable -> L2e
            if (r0 != 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)     // Catch: java.lang.Throwable -> L2e
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)     // Catch: java.lang.Throwable -> L2e
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r4)     // Catch: java.lang.Throwable -> L2e
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.google.android.exoplayer2.upstream.cache.Cache$Listener>> r0 = r2.listeners     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L2e
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L2e
            if (r0 != 0) goto L25
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2e
            r0.<init>()     // Catch: java.lang.Throwable -> L2e
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.google.android.exoplayer2.upstream.cache.Cache$Listener>> r1 = r2.listeners     // Catch: java.lang.Throwable -> L2e
            r1.put(r3, r0)     // Catch: java.lang.Throwable -> L2e
        L25:
            r0.add(r4)     // Catch: java.lang.Throwable -> L2e
            java.util.NavigableSet r3 = r2.getCachedSpans(r3)     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r2)
            return r3
        L2e:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void applyContentMetadataMutations(java.lang.String r2, com.google.android.exoplayer2.upstream.cache.ContentMetadataMutations r3) throws com.google.android.exoplayer2.upstream.cache.Cache.CacheException {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.released     // Catch: java.lang.Throwable -> L21
            if (r0 != 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)     // Catch: java.lang.Throwable -> L21
            r1.checkInitialization()     // Catch: java.lang.Throwable -> L21
            com.google.android.exoplayer2.upstream.cache.CachedContentIndex r0 = r1.contentIndex     // Catch: java.lang.Throwable -> L21
            r0.applyContentMetadataMutations(r2, r3)     // Catch: java.lang.Throwable -> L21
            com.google.android.exoplayer2.upstream.cache.CachedContentIndex r2 = r1.contentIndex     // Catch: java.io.IOException -> L1a java.lang.Throwable -> L21
            r2.store()     // Catch: java.io.IOException -> L1a java.lang.Throwable -> L21
            monitor-exit(r1)
            return
        L1a:
            r2 = move-exception
            com.google.android.exoplayer2.upstream.cache.Cache$CacheException r3 = new com.google.android.exoplayer2.upstream.cache.Cache$CacheException     // Catch: java.lang.Throwable -> L21
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L21
            throw r3     // Catch: java.lang.Throwable -> L21
        L21:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public synchronized void checkInitialization() throws com.google.android.exoplayer2.upstream.cache.Cache.CacheException {
            r1 = this;
            monitor-enter(r1)
            com.google.android.exoplayer2.upstream.cache.Cache$CacheException r0 = r1.initializationException     // Catch: java.lang.Throwable -> L8
            if (r0 != 0) goto L7
            monitor-exit(r1)
            return
        L7:
            throw r0     // Catch: java.lang.Throwable -> L8
        L8:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void commitFile(java.io.File r10, long r11) throws com.google.android.exoplayer2.upstream.cache.Cache.CacheException {
            r9 = this;
            monitor-enter(r9)
            boolean r0 = r9.released     // Catch: java.lang.Throwable -> L8e
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)     // Catch: java.lang.Throwable -> L8e
            boolean r0 = r10.exists()     // Catch: java.lang.Throwable -> L8e
            if (r0 != 0) goto L15
            monitor-exit(r9)
            return
        L15:
            r3 = 0
            int r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r0 != 0) goto L20
            r10.delete()     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r9)
            return
        L20:
            com.google.android.exoplayer2.upstream.cache.CachedContentIndex r0 = r9.contentIndex     // Catch: java.lang.Throwable -> L8e
            com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan r11 = com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan.createCacheEntry(r10, r11, r0)     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r11 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r11)     // Catch: java.lang.Throwable -> L8e
            com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan r11 = (com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan) r11     // Catch: java.lang.Throwable -> L8e
            com.google.android.exoplayer2.upstream.cache.CachedContentIndex r12 = r9.contentIndex     // Catch: java.lang.Throwable -> L8e
            java.lang.String r0 = r11.key     // Catch: java.lang.Throwable -> L8e
            com.google.android.exoplayer2.upstream.cache.CachedContent r12 = r12.get(r0)     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r12 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r12)     // Catch: java.lang.Throwable -> L8e
            com.google.android.exoplayer2.upstream.cache.CachedContent r12 = (com.google.android.exoplayer2.upstream.cache.CachedContent) r12     // Catch: java.lang.Throwable -> L8e
            long r3 = r11.position     // Catch: java.lang.Throwable -> L8e
            long r5 = r11.length     // Catch: java.lang.Throwable -> L8e
            boolean r0 = r12.isFullyLocked(r3, r5)     // Catch: java.lang.Throwable -> L8e
            com.google.android.exoplayer2.util.Assertions.checkState(r0)     // Catch: java.lang.Throwable -> L8e
            com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata r12 = r12.getMetadata()     // Catch: java.lang.Throwable -> L8e
            long r3 = com.google.android.exoplayer2.upstream.cache.ContentMetadata.CC.getContentLength(r12)     // Catch: java.lang.Throwable -> L8e
            r5 = -1
            int r12 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r12 == 0) goto L61
            long r5 = r11.position     // Catch: java.lang.Throwable -> L8e
            long r7 = r11.length     // Catch: java.lang.Throwable -> L8e
            long r5 = r5 + r7
            int r12 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r12 > 0) goto L5d
            goto L5e
        L5d:
            r1 = 0
        L5e:
            com.google.android.exoplayer2.util.Assertions.checkState(r1)     // Catch: java.lang.Throwable -> L8e
        L61:
            com.google.android.exoplayer2.upstream.cache.CacheFileMetadataIndex r12 = r9.fileIndex     // Catch: java.lang.Throwable -> L8e
            if (r12 == 0) goto L7a
            java.lang.String r1 = r10.getName()     // Catch: java.lang.Throwable -> L8e
            com.google.android.exoplayer2.upstream.cache.CacheFileMetadataIndex r0 = r9.fileIndex     // Catch: java.io.IOException -> L73 java.lang.Throwable -> L8e
            long r2 = r11.length     // Catch: java.io.IOException -> L73 java.lang.Throwable -> L8e
            long r4 = r11.lastTouchTimestamp     // Catch: java.io.IOException -> L73 java.lang.Throwable -> L8e
            r0.set(r1, r2, r4)     // Catch: java.io.IOException -> L73 java.lang.Throwable -> L8e
            goto L7a
        L73:
            r10 = move-exception
            com.google.android.exoplayer2.upstream.cache.Cache$CacheException r11 = new com.google.android.exoplayer2.upstream.cache.Cache$CacheException     // Catch: java.lang.Throwable -> L8e
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L8e
            throw r11     // Catch: java.lang.Throwable -> L8e
        L7a:
            r9.addSpan(r11)     // Catch: java.lang.Throwable -> L8e
            com.google.android.exoplayer2.upstream.cache.CachedContentIndex r10 = r9.contentIndex     // Catch: java.io.IOException -> L87 java.lang.Throwable -> L8e
            r10.store()     // Catch: java.io.IOException -> L87 java.lang.Throwable -> L8e
            r9.notifyAll()     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r9)
            return
        L87:
            r10 = move-exception
            com.google.android.exoplayer2.upstream.cache.Cache$CacheException r11 = new com.google.android.exoplayer2.upstream.cache.Cache$CacheException     // Catch: java.lang.Throwable -> L8e
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L8e
            throw r11     // Catch: java.lang.Throwable -> L8e
        L8e:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized long getCacheSpace() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.released     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)     // Catch: java.lang.Throwable -> Lf
            long r0 = r2.totalSpace     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r2)
            return r0
        Lf:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized long getCachedBytes(java.lang.String r11, long r12, long r14) {
            r10 = this;
            monitor-enter(r10)
            r0 = -1
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r4 != 0) goto Le
            r14 = r2
            goto Lf
        Le:
            long r14 = r14 + r12
        Lf:
            r0 = 0
            int r4 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r4 >= 0) goto L16
            goto L17
        L16:
            r2 = r14
        L17:
            r14 = r0
        L18:
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 >= 0) goto L31
            long r8 = r2 - r12
            r4 = r10
            r5 = r11
            r6 = r12
            long r4 = r4.getCachedLength(r5, r6, r8)     // Catch: java.lang.Throwable -> L2e
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 <= 0) goto L2b
            long r14 = r14 + r4
            goto L2c
        L2b:
            long r4 = -r4
        L2c:
            long r12 = r12 + r4
            goto L18
        L2e:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        L31:
            monitor-exit(r10)
            return r14
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized long getCachedLength(java.lang.String r4, long r5, long r7) {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.released     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)     // Catch: java.lang.Throwable -> L26
            r0 = -1
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 != 0) goto L16
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L16:
            com.google.android.exoplayer2.upstream.cache.CachedContentIndex r0 = r3.contentIndex     // Catch: java.lang.Throwable -> L26
            com.google.android.exoplayer2.upstream.cache.CachedContent r4 = r0.get(r4)     // Catch: java.lang.Throwable -> L26
            if (r4 == 0) goto L23
            long r4 = r4.getCachedBytesLength(r5, r7)     // Catch: java.lang.Throwable -> L26
            goto L24
        L23:
            long r4 = -r7
        L24:
            monitor-exit(r3)
            return r4
        L26:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized java.util.NavigableSet<com.google.android.exoplayer2.upstream.cache.CacheSpan> getCachedSpans(java.lang.String r2) {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.released     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)     // Catch: java.lang.Throwable -> L2b
            com.google.android.exoplayer2.upstream.cache.CachedContentIndex r0 = r1.contentIndex     // Catch: java.lang.Throwable -> L2b
            com.google.android.exoplayer2.upstream.cache.CachedContent r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L24
            boolean r0 = r2.isEmpty()     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L1a
            goto L24
        L1a:
            java.util.TreeSet r0 = new java.util.TreeSet     // Catch: java.lang.Throwable -> L2b
            java.util.TreeSet r2 = r2.getSpans()     // Catch: java.lang.Throwable -> L2b
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L2b
            goto L29
        L24:
            java.util.TreeSet r0 = new java.util.TreeSet     // Catch: java.lang.Throwable -> L2b
            r0.<init>()     // Catch: java.lang.Throwable -> L2b
        L29:
            monitor-exit(r1)
            return r0
        L2b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized com.google.android.exoplayer2.upstream.cache.ContentMetadata getContentMetadata(java.lang.String r2) {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.released     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)     // Catch: java.lang.Throwable -> L13
            com.google.android.exoplayer2.upstream.cache.CachedContentIndex r0 = r1.contentIndex     // Catch: java.lang.Throwable -> L13
            com.google.android.exoplayer2.upstream.cache.ContentMetadata r2 = r0.getContentMetadata(r2)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)
            return r2
        L13:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized java.util.Set<java.lang.String> getKeys() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.released     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)     // Catch: java.lang.Throwable -> L18
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Throwable -> L18
            com.google.android.exoplayer2.upstream.cache.CachedContentIndex r1 = r2.contentIndex     // Catch: java.lang.Throwable -> L18
            java.util.Set r1 = r1.getKeys()     // Catch: java.lang.Throwable -> L18
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r2)
            return r0
        L18:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized long getUid() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.uid     // Catch: java.lang.Throwable -> L5
            monitor-exit(r2)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized boolean isCached(java.lang.String r4, long r5, long r7) {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.released     // Catch: java.lang.Throwable -> L21
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)     // Catch: java.lang.Throwable -> L21
            com.google.android.exoplayer2.upstream.cache.CachedContentIndex r0 = r3.contentIndex     // Catch: java.lang.Throwable -> L21
            com.google.android.exoplayer2.upstream.cache.CachedContent r4 = r0.get(r4)     // Catch: java.lang.Throwable -> L21
            if (r4 == 0) goto L1e
            long r4 = r4.getCachedBytesLength(r5, r7)     // Catch: java.lang.Throwable -> L21
            int r6 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r6 < 0) goto L1e
            goto L1f
        L1e:
            r1 = 0
        L1f:
            monitor-exit(r3)
            return r1
        L21:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void release() {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.released     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto L7
            monitor-exit(r4)
            return
        L7:
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.google.android.exoplayer2.upstream.cache.Cache$Listener>> r0 = r4.listeners     // Catch: java.lang.Throwable -> L37
            r0.clear()     // Catch: java.lang.Throwable -> L37
            r4.removeStaleSpans()     // Catch: java.lang.Throwable -> L37
            r0 = 1
            com.google.android.exoplayer2.upstream.cache.CachedContentIndex r1 = r4.contentIndex     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L1f
            r1.store()     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L1f
            java.io.File r1 = r4.cacheDir     // Catch: java.lang.Throwable -> L37
            unlockFolder(r1)     // Catch: java.lang.Throwable -> L37
        L1a:
            r4.released = r0     // Catch: java.lang.Throwable -> L37
            goto L2d
        L1d:
            r1 = move-exception
            goto L2f
        L1f:
            r1 = move-exception
            java.lang.String r2 = "SimpleCache"
            java.lang.String r3 = "Storing index file failed"
            com.google.android.exoplayer2.util.Log.e(r2, r3, r1)     // Catch: java.lang.Throwable -> L1d
            java.io.File r1 = r4.cacheDir     // Catch: java.lang.Throwable -> L37
            unlockFolder(r1)     // Catch: java.lang.Throwable -> L37
            goto L1a
        L2d:
            monitor-exit(r4)
            return
        L2f:
            java.io.File r2 = r4.cacheDir     // Catch: java.lang.Throwable -> L37
            unlockFolder(r2)     // Catch: java.lang.Throwable -> L37
            r4.released = r0     // Catch: java.lang.Throwable -> L37
            throw r1     // Catch: java.lang.Throwable -> L37
        L37:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void releaseHoleSpan(com.google.android.exoplayer2.upstream.cache.CacheSpan r4) {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.released     // Catch: java.lang.Throwable -> L2a
            if (r0 != 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)     // Catch: java.lang.Throwable -> L2a
            com.google.android.exoplayer2.upstream.cache.CachedContentIndex r0 = r3.contentIndex     // Catch: java.lang.Throwable -> L2a
            java.lang.String r1 = r4.key     // Catch: java.lang.Throwable -> L2a
            com.google.android.exoplayer2.upstream.cache.CachedContent r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)     // Catch: java.lang.Throwable -> L2a
            com.google.android.exoplayer2.upstream.cache.CachedContent r0 = (com.google.android.exoplayer2.upstream.cache.CachedContent) r0     // Catch: java.lang.Throwable -> L2a
            long r1 = r4.position     // Catch: java.lang.Throwable -> L2a
            r0.unlockRange(r1)     // Catch: java.lang.Throwable -> L2a
            com.google.android.exoplayer2.upstream.cache.CachedContentIndex r4 = r3.contentIndex     // Catch: java.lang.Throwable -> L2a
            java.lang.String r0 = r0.key     // Catch: java.lang.Throwable -> L2a
            r4.maybeRemove(r0)     // Catch: java.lang.Throwable -> L2a
            r3.notifyAll()     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r3)
            return
        L2a:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void removeListener(java.lang.String r2, com.google.android.exoplayer2.upstream.cache.Cache.Listener r3) {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.released     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto L7
            monitor-exit(r1)
            return
        L7:
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.google.android.exoplayer2.upstream.cache.Cache$Listener>> r0 = r1.listeners     // Catch: java.lang.Throwable -> L21
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L21
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto L1f
            r0.remove(r3)     // Catch: java.lang.Throwable -> L21
            boolean r3 = r0.isEmpty()     // Catch: java.lang.Throwable -> L21
            if (r3 == 0) goto L1f
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.google.android.exoplayer2.upstream.cache.Cache$Listener>> r3 = r1.listeners     // Catch: java.lang.Throwable -> L21
            r3.remove(r2)     // Catch: java.lang.Throwable -> L21
        L1f:
            monitor-exit(r1)
            return
        L21:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void removeResource(java.lang.String r2) {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.released     // Catch: java.lang.Throwable -> L25
            if (r0 != 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)     // Catch: java.lang.Throwable -> L25
            java.util.NavigableSet r2 = r1.getCachedSpans(r2)     // Catch: java.lang.Throwable -> L25
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L25
        L13:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L23
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Throwable -> L25
            com.google.android.exoplayer2.upstream.cache.CacheSpan r0 = (com.google.android.exoplayer2.upstream.cache.CacheSpan) r0     // Catch: java.lang.Throwable -> L25
            r1.removeSpanInternal(r0)     // Catch: java.lang.Throwable -> L25
            goto L13
        L23:
            monitor-exit(r1)
            return
        L25:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void removeSpan(com.google.android.exoplayer2.upstream.cache.CacheSpan r2) {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.released     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)     // Catch: java.lang.Throwable -> L10
            r1.removeSpanInternal(r2)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            return
        L10:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized java.io.File startFile(java.lang.String r9, long r10, long r12) throws com.google.android.exoplayer2.upstream.cache.Cache.CacheException {
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.released     // Catch: java.lang.Throwable -> L60
            if (r0 != 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)     // Catch: java.lang.Throwable -> L60
            r8.checkInitialization()     // Catch: java.lang.Throwable -> L60
            com.google.android.exoplayer2.upstream.cache.CachedContentIndex r0 = r8.contentIndex     // Catch: java.lang.Throwable -> L60
            com.google.android.exoplayer2.upstream.cache.CachedContent r0 = r0.get(r9)     // Catch: java.lang.Throwable -> L60
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)     // Catch: java.lang.Throwable -> L60
            boolean r1 = r0.isFullyLocked(r10, r12)     // Catch: java.lang.Throwable -> L60
            com.google.android.exoplayer2.util.Assertions.checkState(r1)     // Catch: java.lang.Throwable -> L60
            java.io.File r1 = r8.cacheDir     // Catch: java.lang.Throwable -> L60
            boolean r1 = r1.exists()     // Catch: java.lang.Throwable -> L60
            if (r1 != 0) goto L2e
            java.io.File r1 = r8.cacheDir     // Catch: java.lang.Throwable -> L60
            createCacheDirectories(r1)     // Catch: java.lang.Throwable -> L60
            r8.removeStaleSpans()     // Catch: java.lang.Throwable -> L60
        L2e:
            com.google.android.exoplayer2.upstream.cache.CacheEvictor r1 = r8.evictor     // Catch: java.lang.Throwable -> L60
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            r1.onStartFile(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L60
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L60
            java.io.File r9 = r8.cacheDir     // Catch: java.lang.Throwable -> L60
            java.util.Random r12 = r8.random     // Catch: java.lang.Throwable -> L60
            r13 = 10
            int r12 = r12.nextInt(r13)     // Catch: java.lang.Throwable -> L60
            java.lang.String r12 = java.lang.Integer.toString(r12)     // Catch: java.lang.Throwable -> L60
            r2.<init>(r9, r12)     // Catch: java.lang.Throwable -> L60
            boolean r9 = r2.exists()     // Catch: java.lang.Throwable -> L60
            if (r9 != 0) goto L53
            createCacheDirectories(r2)     // Catch: java.lang.Throwable -> L60
        L53:
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L60
            int r3 = r0.id     // Catch: java.lang.Throwable -> L60
            r4 = r10
            java.io.File r9 = com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan.getCacheFile(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L60
            monitor-exit(r8)
            return r9
        L60:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized com.google.android.exoplayer2.upstream.cache.CacheSpan startReadWrite(java.lang.String r2, long r3, long r5) throws java.lang.InterruptedException, com.google.android.exoplayer2.upstream.cache.Cache.CacheException {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.released     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)     // Catch: java.lang.Throwable -> L1a
            r1.checkInitialization()     // Catch: java.lang.Throwable -> L1a
        Le:
            com.google.android.exoplayer2.upstream.cache.CacheSpan r0 = r1.startReadWriteNonBlocking(r2, r3, r5)     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L16
            monitor-exit(r1)
            return r0
        L16:
            r1.wait()     // Catch: java.lang.Throwable -> L1a
            goto Le
        L1a:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    @androidx.annotation.Nullable
    public synchronized com.google.android.exoplayer2.upstream.cache.CacheSpan startReadWriteNonBlocking(java.lang.String r3, long r4, long r6) throws com.google.android.exoplayer2.upstream.cache.Cache.CacheException {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.released     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)     // Catch: java.lang.Throwable -> L2f
            r2.checkInitialization()     // Catch: java.lang.Throwable -> L2f
            com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan r6 = r2.getSpan(r3, r4, r6)     // Catch: java.lang.Throwable -> L2f
            boolean r7 = r6.isCached     // Catch: java.lang.Throwable -> L2f
            if (r7 == 0) goto L1c
            com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan r3 = r2.touchSpan(r3, r6)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r2)
            return r3
        L1c:
            com.google.android.exoplayer2.upstream.cache.CachedContentIndex r7 = r2.contentIndex     // Catch: java.lang.Throwable -> L2f
            com.google.android.exoplayer2.upstream.cache.CachedContent r3 = r7.getOrAdd(r3)     // Catch: java.lang.Throwable -> L2f
            long r0 = r6.length     // Catch: java.lang.Throwable -> L2f
            boolean r3 = r3.lockRange(r4, r0)     // Catch: java.lang.Throwable -> L2f
            if (r3 == 0) goto L2c
            monitor-exit(r2)
            return r6
        L2c:
            r3 = 0
            monitor-exit(r2)
            return r3
        L2f:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }
}
