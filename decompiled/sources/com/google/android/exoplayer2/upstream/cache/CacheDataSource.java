package com.google.android.exoplayer2.upstream.cache;

/* JADX INFO: loaded from: classes3.dex */
public final class CacheDataSource implements com.google.android.exoplayer2.upstream.DataSource {
    public static final int CACHE_IGNORED_REASON_ERROR = 0;
    public static final int CACHE_IGNORED_REASON_UNSET_LENGTH = 1;
    private static final int CACHE_NOT_IGNORED = -1;
    public static final int FLAG_BLOCK_ON_CACHE = 1;
    public static final int FLAG_IGNORE_CACHE_FOR_UNSET_LENGTH_REQUESTS = 4;
    public static final int FLAG_IGNORE_CACHE_ON_ERROR = 2;
    private static final long MIN_READ_BEFORE_CHECKING_CACHE = 102400;

    @androidx.annotation.Nullable
    private android.net.Uri actualUri;
    private final boolean blockOnCache;
    private long bytesRemaining;
    private final com.google.android.exoplayer2.upstream.cache.Cache cache;
    private final com.google.android.exoplayer2.upstream.cache.CacheKeyFactory cacheKeyFactory;
    private final com.google.android.exoplayer2.upstream.DataSource cacheReadDataSource;

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.upstream.DataSource cacheWriteDataSource;
    private long checkCachePosition;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.upstream.DataSource currentDataSource;
    private long currentDataSourceBytesRead;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.upstream.DataSpec currentDataSpec;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.upstream.cache.CacheSpan currentHoleSpan;
    private boolean currentRequestIgnoresCache;

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.upstream.cache.CacheDataSource.EventListener eventListener;
    private final boolean ignoreCacheForUnsetLengthRequests;
    private final boolean ignoreCacheOnError;
    private long readPosition;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.upstream.DataSpec requestDataSpec;
    private boolean seenCacheError;
    private long totalCachedBytesRead;
    private final com.google.android.exoplayer2.upstream.DataSource upstreamDataSource;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.cache.CacheDataSource$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes2.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface CacheIgnoredReason {
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface EventListener {
        void onCacheIgnored(int r1);

        void onCachedBytesRead(long r1, long r3);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class Factory implements com.google.android.exoplayer2.upstream.DataSource.Factory {
        private com.google.android.exoplayer2.upstream.cache.Cache cache;
        private boolean cacheIsReadOnly;
        private com.google.android.exoplayer2.upstream.cache.CacheKeyFactory cacheKeyFactory;
        private com.google.android.exoplayer2.upstream.DataSource.Factory cacheReadDataSourceFactory;

        @androidx.annotation.Nullable
        private com.google.android.exoplayer2.upstream.DataSink.Factory cacheWriteDataSinkFactory;

        @androidx.annotation.Nullable
        private com.google.android.exoplayer2.upstream.cache.CacheDataSource.EventListener eventListener;
        private int flags;

        @androidx.annotation.Nullable
        private com.google.android.exoplayer2.upstream.DataSource.Factory upstreamDataSourceFactory;
        private int upstreamPriority;

        @androidx.annotation.Nullable
        private com.google.android.exoplayer2.util.PriorityTaskManager upstreamPriorityTaskManager;

        public Factory() {
                r1 = this;
                r1.<init>()
                com.google.android.exoplayer2.upstream.FileDataSource$Factory r0 = new com.google.android.exoplayer2.upstream.FileDataSource$Factory
                r0.<init>()
                r1.cacheReadDataSourceFactory = r0
                com.google.android.exoplayer2.upstream.cache.CacheKeyFactory r0 = com.google.android.exoplayer2.upstream.cache.CacheKeyFactory.DEFAULT
                r1.cacheKeyFactory = r0
                return
        }

        private com.google.android.exoplayer2.upstream.cache.CacheDataSource createDataSourceInternal(@androidx.annotation.Nullable com.google.android.exoplayer2.upstream.DataSource r13, int r14, int r15) {
                r12 = this;
                com.google.android.exoplayer2.upstream.cache.Cache r0 = r12.cache
                java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
                r2 = r0
                com.google.android.exoplayer2.upstream.cache.Cache r2 = (com.google.android.exoplayer2.upstream.cache.Cache) r2
                boolean r0 = r12.cacheIsReadOnly
                if (r0 != 0) goto L27
                if (r13 != 0) goto L10
                goto L27
            L10:
                com.google.android.exoplayer2.upstream.DataSink$Factory r0 = r12.cacheWriteDataSinkFactory
                if (r0 == 0) goto L19
                com.google.android.exoplayer2.upstream.DataSink r0 = r0.createDataSink()
                goto L28
            L19:
                com.google.android.exoplayer2.upstream.cache.CacheDataSink$Factory r0 = new com.google.android.exoplayer2.upstream.cache.CacheDataSink$Factory
                r0.<init>()
                com.google.android.exoplayer2.upstream.cache.CacheDataSink$Factory r0 = r0.setCache(r2)
                com.google.android.exoplayer2.upstream.DataSink r0 = r0.createDataSink()
                goto L28
            L27:
                r0 = 0
            L28:
                r5 = r0
                com.google.android.exoplayer2.upstream.cache.CacheDataSource r0 = new com.google.android.exoplayer2.upstream.cache.CacheDataSource
                com.google.android.exoplayer2.upstream.DataSource$Factory r1 = r12.cacheReadDataSourceFactory
                com.google.android.exoplayer2.upstream.DataSource r4 = r1.createDataSource()
                com.google.android.exoplayer2.upstream.cache.CacheKeyFactory r6 = r12.cacheKeyFactory
                com.google.android.exoplayer2.util.PriorityTaskManager r8 = r12.upstreamPriorityTaskManager
                com.google.android.exoplayer2.upstream.cache.CacheDataSource$EventListener r10 = r12.eventListener
                r11 = 0
                r1 = r0
                r3 = r13
                r7 = r14
                r9 = r15
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                return r0
        }

        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.upstream.DataSource createDataSource() {
                r1 = this;
                com.google.android.exoplayer2.upstream.cache.CacheDataSource r0 = r1.createDataSource()
                return r0
        }

        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        public com.google.android.exoplayer2.upstream.cache.CacheDataSource createDataSource() {
                r3 = this;
                com.google.android.exoplayer2.upstream.DataSource$Factory r0 = r3.upstreamDataSourceFactory
                if (r0 == 0) goto L9
                com.google.android.exoplayer2.upstream.DataSource r0 = r0.createDataSource()
                goto La
            L9:
                r0 = 0
            La:
                int r1 = r3.flags
                int r2 = r3.upstreamPriority
                com.google.android.exoplayer2.upstream.cache.CacheDataSource r0 = r3.createDataSourceInternal(r0, r1, r2)
                return r0
        }

        public com.google.android.exoplayer2.upstream.cache.CacheDataSource createDataSourceForDownloading() {
                r3 = this;
                com.google.android.exoplayer2.upstream.DataSource$Factory r0 = r3.upstreamDataSourceFactory
                if (r0 == 0) goto L9
                com.google.android.exoplayer2.upstream.DataSource r0 = r0.createDataSource()
                goto La
            L9:
                r0 = 0
            La:
                int r1 = r3.flags
                r1 = r1 | 1
                r2 = -1000(0xfffffffffffffc18, float:NaN)
                com.google.android.exoplayer2.upstream.cache.CacheDataSource r0 = r3.createDataSourceInternal(r0, r1, r2)
                return r0
        }

        public com.google.android.exoplayer2.upstream.cache.CacheDataSource createDataSourceForRemovingDownload() {
                r3 = this;
                int r0 = r3.flags
                r0 = r0 | 1
                r1 = 0
                r2 = -1000(0xfffffffffffffc18, float:NaN)
                com.google.android.exoplayer2.upstream.cache.CacheDataSource r0 = r3.createDataSourceInternal(r1, r0, r2)
                return r0
        }

        @androidx.annotation.Nullable
        public com.google.android.exoplayer2.upstream.cache.Cache getCache() {
                r1 = this;
                com.google.android.exoplayer2.upstream.cache.Cache r0 = r1.cache
                return r0
        }

        public com.google.android.exoplayer2.upstream.cache.CacheKeyFactory getCacheKeyFactory() {
                r1 = this;
                com.google.android.exoplayer2.upstream.cache.CacheKeyFactory r0 = r1.cacheKeyFactory
                return r0
        }

        @androidx.annotation.Nullable
        public com.google.android.exoplayer2.util.PriorityTaskManager getUpstreamPriorityTaskManager() {
                r1 = this;
                com.google.android.exoplayer2.util.PriorityTaskManager r0 = r1.upstreamPriorityTaskManager
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.upstream.cache.CacheDataSource.Factory setCache(com.google.android.exoplayer2.upstream.cache.Cache r1) {
                r0 = this;
                r0.cache = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.upstream.cache.CacheDataSource.Factory setCacheKeyFactory(com.google.android.exoplayer2.upstream.cache.CacheKeyFactory r1) {
                r0 = this;
                r0.cacheKeyFactory = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.upstream.cache.CacheDataSource.Factory setCacheReadDataSourceFactory(com.google.android.exoplayer2.upstream.DataSource.Factory r1) {
                r0 = this;
                r0.cacheReadDataSourceFactory = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.upstream.cache.CacheDataSource.Factory setCacheWriteDataSinkFactory(@androidx.annotation.Nullable com.google.android.exoplayer2.upstream.DataSink.Factory r1) {
                r0 = this;
                r0.cacheWriteDataSinkFactory = r1
                if (r1 != 0) goto L6
                r1 = 1
                goto L7
            L6:
                r1 = 0
            L7:
                r0.cacheIsReadOnly = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.upstream.cache.CacheDataSource.Factory setEventListener(@androidx.annotation.Nullable com.google.android.exoplayer2.upstream.cache.CacheDataSource.EventListener r1) {
                r0 = this;
                r0.eventListener = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.upstream.cache.CacheDataSource.Factory setFlags(int r1) {
                r0 = this;
                r0.flags = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.upstream.cache.CacheDataSource.Factory setUpstreamDataSourceFactory(@androidx.annotation.Nullable com.google.android.exoplayer2.upstream.DataSource.Factory r1) {
                r0 = this;
                r0.upstreamDataSourceFactory = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.upstream.cache.CacheDataSource.Factory setUpstreamPriority(int r1) {
                r0 = this;
                r0.upstreamPriority = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.upstream.cache.CacheDataSource.Factory setUpstreamPriorityTaskManager(@androidx.annotation.Nullable com.google.android.exoplayer2.util.PriorityTaskManager r1) {
                r0 = this;
                r0.upstreamPriorityTaskManager = r1
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public CacheDataSource(com.google.android.exoplayer2.upstream.cache.Cache r2, @androidx.annotation.Nullable com.google.android.exoplayer2.upstream.DataSource r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public CacheDataSource(com.google.android.exoplayer2.upstream.cache.Cache r8, @androidx.annotation.Nullable com.google.android.exoplayer2.upstream.DataSource r9, int r10) {
            r7 = this;
            com.google.android.exoplayer2.upstream.FileDataSource r3 = new com.google.android.exoplayer2.upstream.FileDataSource
            r3.<init>()
            com.google.android.exoplayer2.upstream.cache.CacheDataSink r4 = new com.google.android.exoplayer2.upstream.cache.CacheDataSink
            r0 = 5242880(0x500000, double:2.590327E-317)
            r4.<init>(r8, r0)
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public CacheDataSource(com.google.android.exoplayer2.upstream.cache.Cache r9, @androidx.annotation.Nullable com.google.android.exoplayer2.upstream.DataSource r10, com.google.android.exoplayer2.upstream.DataSource r11, @androidx.annotation.Nullable com.google.android.exoplayer2.upstream.DataSink r12, int r13, @androidx.annotation.Nullable com.google.android.exoplayer2.upstream.cache.CacheDataSource.EventListener r14) {
            r8 = this;
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public CacheDataSource(com.google.android.exoplayer2.upstream.cache.Cache r11, @androidx.annotation.Nullable com.google.android.exoplayer2.upstream.DataSource r12, com.google.android.exoplayer2.upstream.DataSource r13, @androidx.annotation.Nullable com.google.android.exoplayer2.upstream.DataSink r14, int r15, @androidx.annotation.Nullable com.google.android.exoplayer2.upstream.cache.CacheDataSource.EventListener r16, @androidx.annotation.Nullable com.google.android.exoplayer2.upstream.cache.CacheKeyFactory r17) {
            r10 = this;
            r7 = 0
            r8 = 0
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r17
            r6 = r15
            r9 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    private CacheDataSource(com.google.android.exoplayer2.upstream.cache.Cache r1, @androidx.annotation.Nullable com.google.android.exoplayer2.upstream.DataSource r2, com.google.android.exoplayer2.upstream.DataSource r3, @androidx.annotation.Nullable com.google.android.exoplayer2.upstream.DataSink r4, @androidx.annotation.Nullable com.google.android.exoplayer2.upstream.cache.CacheKeyFactory r5, int r6, @androidx.annotation.Nullable com.google.android.exoplayer2.util.PriorityTaskManager r7, int r8, @androidx.annotation.Nullable com.google.android.exoplayer2.upstream.cache.CacheDataSource.EventListener r9) {
            r0 = this;
            r0.<init>()
            r0.cache = r1
            r0.cacheReadDataSource = r3
            if (r5 == 0) goto La
            goto Lc
        La:
            com.google.android.exoplayer2.upstream.cache.CacheKeyFactory r5 = com.google.android.exoplayer2.upstream.cache.CacheKeyFactory.DEFAULT
        Lc:
            r0.cacheKeyFactory = r5
            r1 = r6 & 1
            r3 = 0
            r5 = 1
            if (r1 == 0) goto L16
            r1 = 1
            goto L17
        L16:
            r1 = 0
        L17:
            r0.blockOnCache = r1
            r1 = r6 & 2
            if (r1 == 0) goto L1f
            r1 = 1
            goto L20
        L1f:
            r1 = 0
        L20:
            r0.ignoreCacheOnError = r1
            r1 = r6 & 4
            if (r1 == 0) goto L27
            r3 = 1
        L27:
            r0.ignoreCacheForUnsetLengthRequests = r3
            r1 = 0
            if (r2 == 0) goto L40
            if (r7 == 0) goto L34
            com.google.android.exoplayer2.upstream.PriorityDataSource r3 = new com.google.android.exoplayer2.upstream.PriorityDataSource
            r3.<init>(r2, r7, r8)
            r2 = r3
        L34:
            r0.upstreamDataSource = r2
            if (r4 == 0) goto L3d
            com.google.android.exoplayer2.upstream.TeeDataSource r1 = new com.google.android.exoplayer2.upstream.TeeDataSource
            r1.<init>(r2, r4)
        L3d:
            r0.cacheWriteDataSource = r1
            goto L46
        L40:
            com.google.android.exoplayer2.upstream.PlaceholderDataSource r2 = com.google.android.exoplayer2.upstream.PlaceholderDataSource.INSTANCE
            r0.upstreamDataSource = r2
            r0.cacheWriteDataSource = r1
        L46:
            r0.eventListener = r9
            return
    }

    public /* synthetic */ CacheDataSource(com.google.android.exoplayer2.upstream.cache.Cache r1, com.google.android.exoplayer2.upstream.DataSource r2, com.google.android.exoplayer2.upstream.DataSource r3, com.google.android.exoplayer2.upstream.DataSink r4, com.google.android.exoplayer2.upstream.cache.CacheKeyFactory r5, int r6, com.google.android.exoplayer2.util.PriorityTaskManager r7, int r8, com.google.android.exoplayer2.upstream.cache.CacheDataSource.EventListener r9, com.google.android.exoplayer2.upstream.cache.CacheDataSource.AnonymousClass1 r10) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    private void closeCurrentSource() throws java.io.IOException {
            r4 = this;
            com.google.android.exoplayer2.upstream.DataSource r0 = r4.currentDataSource
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 0
            r0.close()     // Catch: java.lang.Throwable -> L19
            r4.currentDataSpec = r1
            r4.currentDataSource = r1
            com.google.android.exoplayer2.upstream.cache.CacheSpan r0 = r4.currentHoleSpan
            if (r0 == 0) goto L18
            com.google.android.exoplayer2.upstream.cache.Cache r2 = r4.cache
            r2.releaseHoleSpan(r0)
            r4.currentHoleSpan = r1
        L18:
            return
        L19:
            r0 = move-exception
            r4.currentDataSpec = r1
            r4.currentDataSource = r1
            com.google.android.exoplayer2.upstream.cache.CacheSpan r2 = r4.currentHoleSpan
            if (r2 == 0) goto L29
            com.google.android.exoplayer2.upstream.cache.Cache r3 = r4.cache
            r3.releaseHoleSpan(r2)
            r4.currentHoleSpan = r1
        L29:
            throw r0
    }

    private static android.net.Uri getRedirectedUriOrDefault(com.google.android.exoplayer2.upstream.cache.Cache r0, java.lang.String r1, android.net.Uri r2) {
            com.google.android.exoplayer2.upstream.cache.ContentMetadata r0 = r0.getContentMetadata(r1)
            android.net.Uri r0 = com.google.android.exoplayer2.upstream.cache.ContentMetadata.CC.getRedirectedUri(r0)
            if (r0 == 0) goto Lb
            r2 = r0
        Lb:
            return r2
    }

    private void handleBeforeThrow(java.lang.Throwable r2) {
            r1 = this;
            boolean r0 = r1.isReadingFromCache()
            if (r0 != 0) goto La
            boolean r2 = r2 instanceof com.google.android.exoplayer2.upstream.cache.Cache.CacheException
            if (r2 == 0) goto Ld
        La:
            r2 = 1
            r1.seenCacheError = r2
        Ld:
            return
    }

    private boolean isBypassingCache() {
            r2 = this;
            com.google.android.exoplayer2.upstream.DataSource r0 = r2.currentDataSource
            com.google.android.exoplayer2.upstream.DataSource r1 = r2.upstreamDataSource
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    private boolean isReadingFromCache() {
            r2 = this;
            com.google.android.exoplayer2.upstream.DataSource r0 = r2.currentDataSource
            com.google.android.exoplayer2.upstream.DataSource r1 = r2.cacheReadDataSource
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    private boolean isReadingFromUpstream() {
            r1 = this;
            boolean r0 = r1.isReadingFromCache()
            r0 = r0 ^ 1
            return r0
    }

    private boolean isWritingToCache() {
            r2 = this;
            com.google.android.exoplayer2.upstream.DataSource r0 = r2.currentDataSource
            com.google.android.exoplayer2.upstream.DataSource r1 = r2.cacheWriteDataSource
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    private void notifyBytesRead() {
            r7 = this;
            com.google.android.exoplayer2.upstream.cache.CacheDataSource$EventListener r0 = r7.eventListener
            if (r0 == 0) goto L19
            long r1 = r7.totalCachedBytesRead
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L19
            com.google.android.exoplayer2.upstream.cache.Cache r1 = r7.cache
            long r1 = r1.getCacheSpace()
            long r5 = r7.totalCachedBytesRead
            r0.onCachedBytesRead(r1, r5)
            r7.totalCachedBytesRead = r3
        L19:
            return
    }

    private void notifyCacheIgnored(int r2) {
            r1 = this;
            com.google.android.exoplayer2.upstream.cache.CacheDataSource$EventListener r0 = r1.eventListener
            if (r0 == 0) goto L7
            r0.onCacheIgnored(r2)
        L7:
            return
    }

    private void openNextSource(com.google.android.exoplayer2.upstream.DataSpec r18, boolean r19) throws java.io.IOException {
            r17 = this;
            r1 = r17
            r0 = r18
            java.lang.String r2 = r0.key
            java.lang.Object r2 = com.google.android.exoplayer2.util.Util.castNonNull(r2)
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = r1.currentRequestIgnoresCache
            r9 = 0
            if (r3 == 0) goto L13
            r3 = r9
            goto L3b
        L13:
            boolean r3 = r1.blockOnCache
            if (r3 == 0) goto L30
            com.google.android.exoplayer2.upstream.cache.Cache r3 = r1.cache     // Catch: java.lang.InterruptedException -> L23
            long r5 = r1.readPosition     // Catch: java.lang.InterruptedException -> L23
            long r7 = r1.bytesRemaining     // Catch: java.lang.InterruptedException -> L23
            r4 = r2
            com.google.android.exoplayer2.upstream.cache.CacheSpan r3 = r3.startReadWrite(r4, r5, r7)     // Catch: java.lang.InterruptedException -> L23
            goto L3b
        L23:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            r0.<init>()
            throw r0
        L30:
            com.google.android.exoplayer2.upstream.cache.Cache r3 = r1.cache
            long r5 = r1.readPosition
            long r7 = r1.bytesRemaining
            r4 = r2
            com.google.android.exoplayer2.upstream.cache.CacheSpan r3 = r3.startReadWriteNonBlocking(r4, r5, r7)
        L3b:
            r4 = -1
            if (r3 != 0) goto L57
            com.google.android.exoplayer2.upstream.DataSource r6 = r1.upstreamDataSource
            com.google.android.exoplayer2.upstream.DataSpec$Builder r7 = r18.buildUpon()
            long r10 = r1.readPosition
            com.google.android.exoplayer2.upstream.DataSpec$Builder r7 = r7.setPosition(r10)
            long r10 = r1.bytesRemaining
            com.google.android.exoplayer2.upstream.DataSpec$Builder r7 = r7.setLength(r10)
            com.google.android.exoplayer2.upstream.DataSpec r7 = r7.build()
            goto Lc8
        L57:
            boolean r6 = r3.isCached
            if (r6 == 0) goto L94
            java.io.File r6 = r3.file
            java.lang.Object r6 = com.google.android.exoplayer2.util.Util.castNonNull(r6)
            java.io.File r6 = (java.io.File) r6
            android.net.Uri r6 = android.net.Uri.fromFile(r6)
            long r7 = r3.position
            long r10 = r1.readPosition
            long r10 = r10 - r7
            long r12 = r3.length
            long r12 = r12 - r10
            long r14 = r1.bytesRemaining
            int r16 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r16 == 0) goto L79
            long r12 = java.lang.Math.min(r12, r14)
        L79:
            com.google.android.exoplayer2.upstream.DataSpec$Builder r14 = r18.buildUpon()
            com.google.android.exoplayer2.upstream.DataSpec$Builder r6 = r14.setUri(r6)
            com.google.android.exoplayer2.upstream.DataSpec$Builder r6 = r6.setUriPositionOffset(r7)
            com.google.android.exoplayer2.upstream.DataSpec$Builder r6 = r6.setPosition(r10)
            com.google.android.exoplayer2.upstream.DataSpec$Builder r6 = r6.setLength(r12)
            com.google.android.exoplayer2.upstream.DataSpec r7 = r6.build()
            com.google.android.exoplayer2.upstream.DataSource r6 = r1.cacheReadDataSource
            goto Lc8
        L94:
            boolean r6 = r3.isOpenEnded()
            if (r6 == 0) goto L9d
            long r6 = r1.bytesRemaining
            goto La9
        L9d:
            long r6 = r3.length
            long r10 = r1.bytesRemaining
            int r8 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r8 == 0) goto La9
            long r6 = java.lang.Math.min(r6, r10)
        La9:
            com.google.android.exoplayer2.upstream.DataSpec$Builder r8 = r18.buildUpon()
            long r10 = r1.readPosition
            com.google.android.exoplayer2.upstream.DataSpec$Builder r8 = r8.setPosition(r10)
            com.google.android.exoplayer2.upstream.DataSpec$Builder r6 = r8.setLength(r6)
            com.google.android.exoplayer2.upstream.DataSpec r7 = r6.build()
            com.google.android.exoplayer2.upstream.DataSource r6 = r1.cacheWriteDataSource
            if (r6 == 0) goto Lc0
            goto Lc8
        Lc0:
            com.google.android.exoplayer2.upstream.DataSource r6 = r1.upstreamDataSource
            com.google.android.exoplayer2.upstream.cache.Cache r8 = r1.cache
            r8.releaseHoleSpan(r3)
            r3 = r9
        Lc8:
            boolean r8 = r1.currentRequestIgnoresCache
            if (r8 != 0) goto Ld7
            com.google.android.exoplayer2.upstream.DataSource r8 = r1.upstreamDataSource
            if (r6 != r8) goto Ld7
            long r10 = r1.readPosition
            r12 = 102400(0x19000, double:5.05923E-319)
            long r10 = r10 + r12
            goto Ldc
        Ld7:
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        Ldc:
            r1.checkCachePosition = r10
            if (r19 == 0) goto L104
            boolean r8 = r17.isBypassingCache()
            com.google.android.exoplayer2.util.Assertions.checkState(r8)
            com.google.android.exoplayer2.upstream.DataSource r8 = r1.upstreamDataSource
            if (r6 != r8) goto Lec
            return
        Lec:
            r17.closeCurrentSource()     // Catch: java.lang.Throwable -> Lf0
            goto L104
        Lf0:
            r0 = move-exception
            r2 = r0
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r3)
            com.google.android.exoplayer2.upstream.cache.CacheSpan r0 = (com.google.android.exoplayer2.upstream.cache.CacheSpan) r0
            boolean r0 = r0.isHoleSpan()
            if (r0 == 0) goto L103
            com.google.android.exoplayer2.upstream.cache.Cache r0 = r1.cache
            r0.releaseHoleSpan(r3)
        L103:
            throw r2
        L104:
            if (r3 == 0) goto L10e
            boolean r8 = r3.isHoleSpan()
            if (r8 == 0) goto L10e
            r1.currentHoleSpan = r3
        L10e:
            r1.currentDataSource = r6
            r1.currentDataSpec = r7
            r10 = 0
            r1.currentDataSourceBytesRead = r10
            long r10 = r6.open(r7)
            com.google.android.exoplayer2.upstream.cache.ContentMetadataMutations r3 = new com.google.android.exoplayer2.upstream.cache.ContentMetadataMutations
            r3.<init>()
            long r7 = r7.length
            int r12 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r12 != 0) goto L131
            int r7 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r7 == 0) goto L131
            r1.bytesRemaining = r10
            long r4 = r1.readPosition
            long r4 = r4 + r10
            com.google.android.exoplayer2.upstream.cache.ContentMetadataMutations.setContentLength(r3, r4)
        L131:
            boolean r4 = r17.isReadingFromUpstream()
            if (r4 == 0) goto L14c
            android.net.Uri r4 = r6.getUri()
            r1.actualUri = r4
            android.net.Uri r0 = r0.uri
            boolean r0 = r0.equals(r4)
            r0 = r0 ^ 1
            if (r0 == 0) goto L149
            android.net.Uri r9 = r1.actualUri
        L149:
            com.google.android.exoplayer2.upstream.cache.ContentMetadataMutations.setRedirectedUri(r3, r9)
        L14c:
            boolean r0 = r17.isWritingToCache()
            if (r0 == 0) goto L157
            com.google.android.exoplayer2.upstream.cache.Cache r0 = r1.cache
            r0.applyContentMetadataMutations(r2, r3)
        L157:
            return
    }

    private void setNoBytesRemainingAndMaybeStoreLength(java.lang.String r4) throws java.io.IOException {
            r3 = this;
            r0 = 0
            r3.bytesRemaining = r0
            boolean r0 = r3.isWritingToCache()
            if (r0 == 0) goto L19
            com.google.android.exoplayer2.upstream.cache.ContentMetadataMutations r0 = new com.google.android.exoplayer2.upstream.cache.ContentMetadataMutations
            r0.<init>()
            long r1 = r3.readPosition
            com.google.android.exoplayer2.upstream.cache.ContentMetadataMutations.setContentLength(r0, r1)
            com.google.android.exoplayer2.upstream.cache.Cache r1 = r3.cache
            r1.applyContentMetadataMutations(r4, r0)
        L19:
            return
    }

    private int shouldIgnoreCacheForRequest(com.google.android.exoplayer2.upstream.DataSpec r5) {
            r4 = this;
            boolean r0 = r4.ignoreCacheOnError
            if (r0 == 0) goto La
            boolean r0 = r4.seenCacheError
            if (r0 == 0) goto La
            r5 = 0
            return r5
        La:
            boolean r0 = r4.ignoreCacheForUnsetLengthRequests
            if (r0 == 0) goto L18
            long r0 = r5.length
            r2 = -1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L18
            r5 = 1
            return r5
        L18:
            r5 = -1
            return r5
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void addTransferListener(com.google.android.exoplayer2.upstream.TransferListener r2) {
            r1 = this;
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            com.google.android.exoplayer2.upstream.DataSource r0 = r1.cacheReadDataSource
            r0.addTransferListener(r2)
            com.google.android.exoplayer2.upstream.DataSource r0 = r1.upstreamDataSource
            r0.addTransferListener(r2)
            return
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public void close() throws java.io.IOException {
            r2 = this;
            r0 = 0
            r2.requestDataSpec = r0
            r2.actualUri = r0
            r0 = 0
            r2.readPosition = r0
            r2.notifyBytesRead()
            r2.closeCurrentSource()     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r0 = move-exception
            r2.handleBeforeThrow(r0)
            throw r0
    }

    public com.google.android.exoplayer2.upstream.cache.Cache getCache() {
            r1 = this;
            com.google.android.exoplayer2.upstream.cache.Cache r0 = r1.cache
            return r0
    }

    public com.google.android.exoplayer2.upstream.cache.CacheKeyFactory getCacheKeyFactory() {
            r1 = this;
            com.google.android.exoplayer2.upstream.cache.CacheKeyFactory r0 = r1.cacheKeyFactory
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getResponseHeaders() {
            r1 = this;
            boolean r0 = r1.isReadingFromUpstream()
            if (r0 == 0) goto Ld
            com.google.android.exoplayer2.upstream.DataSource r0 = r1.upstreamDataSource
            java.util.Map r0 = r0.getResponseHeaders()
            goto L11
        Ld:
            java.util.Map r0 = java.util.Collections.emptyMap()
        L11:
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @androidx.annotation.Nullable
    public android.net.Uri getUri() {
            r1 = this;
            android.net.Uri r0 = r1.actualUri
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public long open(com.google.android.exoplayer2.upstream.DataSpec r12) throws java.io.IOException {
            r11 = this;
            com.google.android.exoplayer2.upstream.cache.CacheKeyFactory r0 = r11.cacheKeyFactory     // Catch: java.lang.Throwable -> L8b
            java.lang.String r0 = r0.buildCacheKey(r12)     // Catch: java.lang.Throwable -> L8b
            com.google.android.exoplayer2.upstream.DataSpec$Builder r1 = r12.buildUpon()     // Catch: java.lang.Throwable -> L8b
            com.google.android.exoplayer2.upstream.DataSpec$Builder r1 = r1.setKey(r0)     // Catch: java.lang.Throwable -> L8b
            com.google.android.exoplayer2.upstream.DataSpec r1 = r1.build()     // Catch: java.lang.Throwable -> L8b
            r11.requestDataSpec = r1     // Catch: java.lang.Throwable -> L8b
            com.google.android.exoplayer2.upstream.cache.Cache r2 = r11.cache     // Catch: java.lang.Throwable -> L8b
            android.net.Uri r3 = r1.uri     // Catch: java.lang.Throwable -> L8b
            android.net.Uri r2 = getRedirectedUriOrDefault(r2, r0, r3)     // Catch: java.lang.Throwable -> L8b
            r11.actualUri = r2     // Catch: java.lang.Throwable -> L8b
            long r2 = r12.position     // Catch: java.lang.Throwable -> L8b
            r11.readPosition = r2     // Catch: java.lang.Throwable -> L8b
            int r2 = r11.shouldIgnoreCacheForRequest(r12)     // Catch: java.lang.Throwable -> L8b
            r3 = -1
            r4 = 0
            if (r2 == r3) goto L2c
            r3 = 1
            goto L2d
        L2c:
            r3 = 0
        L2d:
            r11.currentRequestIgnoresCache = r3     // Catch: java.lang.Throwable -> L8b
            if (r3 == 0) goto L34
            r11.notifyCacheIgnored(r2)     // Catch: java.lang.Throwable -> L8b
        L34:
            boolean r2 = r11.currentRequestIgnoresCache     // Catch: java.lang.Throwable -> L8b
            r5 = 0
            r7 = -1
            if (r2 == 0) goto L3f
            r11.bytesRemaining = r7     // Catch: java.lang.Throwable -> L8b
            goto L61
        L3f:
            com.google.android.exoplayer2.upstream.cache.Cache r2 = r11.cache     // Catch: java.lang.Throwable -> L8b
            com.google.android.exoplayer2.upstream.cache.ContentMetadata r0 = r2.getContentMetadata(r0)     // Catch: java.lang.Throwable -> L8b
            long r2 = com.google.android.exoplayer2.upstream.cache.ContentMetadata.CC.getContentLength(r0)     // Catch: java.lang.Throwable -> L8b
            r11.bytesRemaining = r2     // Catch: java.lang.Throwable -> L8b
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 == 0) goto L61
            long r9 = r12.position     // Catch: java.lang.Throwable -> L8b
            long r2 = r2 - r9
            r11.bytesRemaining = r2     // Catch: java.lang.Throwable -> L8b
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 < 0) goto L59
            goto L61
        L59:
            com.google.android.exoplayer2.upstream.DataSourceException r12 = new com.google.android.exoplayer2.upstream.DataSourceException     // Catch: java.lang.Throwable -> L8b
            r0 = 2008(0x7d8, float:2.814E-42)
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L8b
            throw r12     // Catch: java.lang.Throwable -> L8b
        L61:
            long r2 = r12.length     // Catch: java.lang.Throwable -> L8b
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 == 0) goto L74
            long r9 = r11.bytesRemaining     // Catch: java.lang.Throwable -> L8b
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 != 0) goto L6e
            goto L72
        L6e:
            long r2 = java.lang.Math.min(r9, r2)     // Catch: java.lang.Throwable -> L8b
        L72:
            r11.bytesRemaining = r2     // Catch: java.lang.Throwable -> L8b
        L74:
            long r2 = r11.bytesRemaining     // Catch: java.lang.Throwable -> L8b
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 > 0) goto L7e
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 != 0) goto L81
        L7e:
            r11.openNextSource(r1, r4)     // Catch: java.lang.Throwable -> L8b
        L81:
            long r0 = r12.length     // Catch: java.lang.Throwable -> L8b
            int r12 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r12 == 0) goto L88
            goto L8a
        L88:
            long r0 = r11.bytesRemaining     // Catch: java.lang.Throwable -> L8b
        L8a:
            return r0
        L8b:
            r12 = move-exception
            r11.handleBeforeThrow(r12)
            throw r12
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader, com.google.android.exoplayer2.upstream.HttpDataSource
    public int read(byte[] r13, int r14, int r15) throws java.io.IOException {
            r12 = this;
            r0 = 0
            if (r15 != 0) goto L4
            return r0
        L4:
            long r1 = r12.bytesRemaining
            r3 = -1
            r4 = 0
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 != 0) goto Le
            return r3
        Le:
            com.google.android.exoplayer2.upstream.DataSpec r1 = r12.requestDataSpec
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            com.google.android.exoplayer2.upstream.DataSpec r1 = (com.google.android.exoplayer2.upstream.DataSpec) r1
            com.google.android.exoplayer2.upstream.DataSpec r2 = r12.currentDataSpec
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            com.google.android.exoplayer2.upstream.DataSpec r2 = (com.google.android.exoplayer2.upstream.DataSpec) r2
            long r6 = r12.readPosition     // Catch: java.lang.Throwable -> L90
            long r8 = r12.checkCachePosition     // Catch: java.lang.Throwable -> L90
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 < 0) goto L2a
            r6 = 1
            r12.openNextSource(r1, r6)     // Catch: java.lang.Throwable -> L90
        L2a:
            com.google.android.exoplayer2.upstream.DataSource r6 = r12.currentDataSource     // Catch: java.lang.Throwable -> L90
            java.lang.Object r6 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r6)     // Catch: java.lang.Throwable -> L90
            com.google.android.exoplayer2.upstream.DataSource r6 = (com.google.android.exoplayer2.upstream.DataSource) r6     // Catch: java.lang.Throwable -> L90
            int r6 = r6.read(r13, r14, r15)     // Catch: java.lang.Throwable -> L90
            r7 = -1
            if (r6 == r3) goto L5b
            boolean r13 = r12.isReadingFromCache()     // Catch: java.lang.Throwable -> L90
            if (r13 == 0) goto L46
            long r13 = r12.totalCachedBytesRead     // Catch: java.lang.Throwable -> L90
            long r0 = (long) r6     // Catch: java.lang.Throwable -> L90
            long r13 = r13 + r0
            r12.totalCachedBytesRead = r13     // Catch: java.lang.Throwable -> L90
        L46:
            long r13 = r12.readPosition     // Catch: java.lang.Throwable -> L90
            long r0 = (long) r6     // Catch: java.lang.Throwable -> L90
            long r13 = r13 + r0
            r12.readPosition = r13     // Catch: java.lang.Throwable -> L90
            long r13 = r12.currentDataSourceBytesRead     // Catch: java.lang.Throwable -> L90
            long r13 = r13 + r0
            r12.currentDataSourceBytesRead = r13     // Catch: java.lang.Throwable -> L90
            long r13 = r12.bytesRemaining     // Catch: java.lang.Throwable -> L90
            int r15 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r15 == 0) goto L84
            long r13 = r13 - r0
            r12.bytesRemaining = r13     // Catch: java.lang.Throwable -> L90
            goto L84
        L5b:
            boolean r3 = r12.isReadingFromUpstream()     // Catch: java.lang.Throwable -> L90
            if (r3 == 0) goto L79
            long r2 = r2.length     // Catch: java.lang.Throwable -> L90
            int r9 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r9 == 0) goto L6d
            long r9 = r12.currentDataSourceBytesRead     // Catch: java.lang.Throwable -> L90
            int r11 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r11 >= 0) goto L79
        L6d:
            java.lang.String r13 = r1.key     // Catch: java.lang.Throwable -> L90
            java.lang.Object r13 = com.google.android.exoplayer2.util.Util.castNonNull(r13)     // Catch: java.lang.Throwable -> L90
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Throwable -> L90
            r12.setNoBytesRemainingAndMaybeStoreLength(r13)     // Catch: java.lang.Throwable -> L90
            goto L84
        L79:
            long r2 = r12.bytesRemaining     // Catch: java.lang.Throwable -> L90
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 > 0) goto L85
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 != 0) goto L84
            goto L85
        L84:
            return r6
        L85:
            r12.closeCurrentSource()     // Catch: java.lang.Throwable -> L90
            r12.openNextSource(r1, r0)     // Catch: java.lang.Throwable -> L90
            int r13 = r12.read(r13, r14, r15)     // Catch: java.lang.Throwable -> L90
            return r13
        L90:
            r13 = move-exception
            r12.handleBeforeThrow(r13)
            throw r13
    }
}
