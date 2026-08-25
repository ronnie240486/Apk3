package com.google.android.exoplayer2.offline;

import com.google.android.exoplayer2.offline.FilterableManifest;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SegmentDownloader<M extends com.google.android.exoplayer2.offline.FilterableManifest<M>> implements com.google.android.exoplayer2.offline.Downloader {
    private static final int BUFFER_SIZE_BYTES = 131072;
    public static final long DEFAULT_MAX_MERGED_SEGMENT_START_TIME_DIFF_MS = 20000;
    private final java.util.ArrayList<com.google.android.exoplayer2.util.RunnableFutureTask<?, ?>> activeRunnables;
    private final com.google.android.exoplayer2.upstream.cache.Cache cache;
    private final com.google.android.exoplayer2.upstream.cache.CacheDataSource.Factory cacheDataSourceFactory;
    private final com.google.android.exoplayer2.upstream.cache.CacheKeyFactory cacheKeyFactory;
    private final java.util.concurrent.Executor executor;
    private volatile boolean isCanceled;
    private final com.google.android.exoplayer2.upstream.DataSpec manifestDataSpec;
    private final com.google.android.exoplayer2.upstream.ParsingLoadable.Parser<M> manifestParser;
    private final long maxMergedSegmentStartTimeDiffUs;

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.util.PriorityTaskManager priorityTaskManager;
    private final java.util.ArrayList<com.google.android.exoplayer2.offline.StreamKey> streamKeys;


    public static final class ProgressNotifier implements com.google.android.exoplayer2.upstream.cache.CacheWriter.ProgressListener {
        private long bytesDownloaded;
        private final long contentLength;
        private final com.google.android.exoplayer2.offline.Downloader.ProgressListener progressListener;
        private int segmentsDownloaded;
        private final int totalSegments;

        public ProgressNotifier(com.google.android.exoplayer2.offline.Downloader.ProgressListener r1, long r2, int r4, long r5, int r7) {
                r0 = this;
                r0.<init>()
                r0.progressListener = r1
                r0.contentLength = r2
                r0.totalSegments = r4
                r0.bytesDownloaded = r5
                r0.segmentsDownloaded = r7
                return
        }

        private float getPercentDownloaded() {
                r6 = this;
                long r0 = r6.contentLength
                r2 = 1120403456(0x42c80000, float:100.0)
                r3 = -1
                int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r5 == 0) goto L18
                r3 = 0
                int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r5 == 0) goto L18
                long r3 = r6.bytesDownloaded
                float r3 = (float) r3
                float r3 = r3 * r2
                float r0 = (float) r0
                float r3 = r3 / r0
                return r3
            L18:
                int r0 = r6.totalSegments
                if (r0 == 0) goto L24
                int r1 = r6.segmentsDownloaded
                float r1 = (float) r1
                float r1 = r1 * r2
                float r0 = (float) r0
                float r1 = r1 / r0
                return r1
            L24:
                r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                return r0
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CacheWriter.ProgressListener
        public void onProgress(long r7, long r9, long r11) {
                r6 = this;
                long r7 = r6.bytesDownloaded
                long r3 = r7 + r11
                r6.bytesDownloaded = r3
                com.google.android.exoplayer2.offline.Downloader$ProgressListener r0 = r6.progressListener
                long r1 = r6.contentLength
                float r5 = r6.getPercentDownloaded()
                r0.onProgress(r1, r3, r5)
                return
        }

        public void onSegmentDownloaded() {
                r7 = this;
                int r0 = r7.segmentsDownloaded
                int r0 = r0 + 1
                r7.segmentsDownloaded = r0
                com.google.android.exoplayer2.offline.Downloader$ProgressListener r1 = r7.progressListener
                long r2 = r7.contentLength
                long r4 = r7.bytesDownloaded
                float r6 = r7.getPercentDownloaded()
                r1.onProgress(r2, r4, r6)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class Segment implements java.lang.Comparable<com.google.android.exoplayer2.offline.SegmentDownloader.Segment> {
        public final com.google.android.exoplayer2.upstream.DataSpec dataSpec;
        public final long startTimeUs;

        public Segment(long r1, com.google.android.exoplayer2.upstream.DataSpec r3) {
                r0 = this;
                r0.<init>()
                r0.startTimeUs = r1
                r0.dataSpec = r3
                return
        }

        /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(com.google.android.exoplayer2.offline.SegmentDownloader.Segment r5) {
                r4 = this;
                long r0 = r4.startTimeUs
                long r2 = r5.startTimeUs
                int r5 = com.google.android.exoplayer2.util.Util.compareLong(r0, r2)
                return r5
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(com.google.android.exoplayer2.offline.SegmentDownloader.Segment r1) {
                r0 = this;
                com.google.android.exoplayer2.offline.SegmentDownloader$Segment r1 = (com.google.android.exoplayer2.offline.SegmentDownloader.Segment) r1
                int r1 = r0.compareTo2(r1)
                return r1
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class SegmentDownloadRunnable extends com.google.android.exoplayer2.util.RunnableFutureTask<java.lang.Void, java.io.IOException> {
        private final com.google.android.exoplayer2.upstream.cache.CacheWriter cacheWriter;
        public final com.google.android.exoplayer2.upstream.cache.CacheDataSource dataSource;

        @androidx.annotation.Nullable
        private final com.google.android.exoplayer2.offline.SegmentDownloader.ProgressNotifier progressNotifier;
        public final com.google.android.exoplayer2.offline.SegmentDownloader.Segment segment;
        public final byte[] temporaryBuffer;

        public SegmentDownloadRunnable(com.google.android.exoplayer2.offline.SegmentDownloader.Segment r2, com.google.android.exoplayer2.upstream.cache.CacheDataSource r3, @androidx.annotation.Nullable com.google.android.exoplayer2.offline.SegmentDownloader.ProgressNotifier r4, byte[] r5) {
                r1 = this;
                r1.<init>()
                r1.segment = r2
                r1.dataSource = r3
                r1.progressNotifier = r4
                r1.temporaryBuffer = r5
                com.google.android.exoplayer2.upstream.cache.CacheWriter r0 = new com.google.android.exoplayer2.upstream.cache.CacheWriter
                com.google.android.exoplayer2.upstream.DataSpec r2 = r2.dataSpec
                r0.<init>(r3, r2, r5, r4)
                r1.cacheWriter = r0
                return
        }

        @Override // com.google.android.exoplayer2.util.RunnableFutureTask
        public final void cancelWork() {
                r1 = this;
                com.google.android.exoplayer2.upstream.cache.CacheWriter r0 = r1.cacheWriter
                r0.cancel()
                return
        }

        @Override // com.google.android.exoplayer2.util.RunnableFutureTask
        public final java.lang.Void doWork() throws java.lang.Exception {
                r1 = this;
                com.google.android.exoplayer2.upstream.cache.CacheWriter r0 = r1.cacheWriter
                r0.cache()
                com.google.android.exoplayer2.offline.SegmentDownloader$ProgressNotifier r0 = r1.progressNotifier
                if (r0 == 0) goto Lc
                r0.onSegmentDownloaded()
            Lc:
                r0 = 0
                return r0
        }
    }

    @java.lang.Deprecated
    public SegmentDownloader(com.google.android.exoplayer2.MediaItem r8, com.google.android.exoplayer2.upstream.ParsingLoadable.Parser<M> r9, com.google.android.exoplayer2.upstream.cache.CacheDataSource.Factory r10, java.util.concurrent.Executor r11) {
            r7 = this;
            r5 = 20000(0x4e20, double:9.8813E-320)
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public SegmentDownloader(com.google.android.exoplayer2.MediaItem r2, com.google.android.exoplayer2.upstream.ParsingLoadable.Parser<M> r3, com.google.android.exoplayer2.upstream.cache.CacheDataSource.Factory r4, java.util.concurrent.Executor r5, long r6) {
            r1 = this;
            r1.<init>()
            com.google.android.exoplayer2.MediaItem$LocalConfiguration r0 = r2.localConfiguration
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.MediaItem$LocalConfiguration r0 = r2.localConfiguration
            android.net.Uri r0 = r0.uri
            com.google.android.exoplayer2.upstream.DataSpec r0 = getCompressibleDataSpec(r0)
            r1.manifestDataSpec = r0
            r1.manifestParser = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            com.google.android.exoplayer2.MediaItem$LocalConfiguration r2 = r2.localConfiguration
            java.util.List<com.google.android.exoplayer2.offline.StreamKey> r2 = r2.streamKeys
            r3.<init>(r2)
            r1.streamKeys = r3
            r1.cacheDataSourceFactory = r4
            r1.executor = r5
            com.google.android.exoplayer2.upstream.cache.Cache r2 = r4.getCache()
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            com.google.android.exoplayer2.upstream.cache.Cache r2 = (com.google.android.exoplayer2.upstream.cache.Cache) r2
            r1.cache = r2
            com.google.android.exoplayer2.upstream.cache.CacheKeyFactory r2 = r4.getCacheKeyFactory()
            r1.cacheKeyFactory = r2
            com.google.android.exoplayer2.util.PriorityTaskManager r2 = r4.getUpstreamPriorityTaskManager()
            r1.priorityTaskManager = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.activeRunnables = r2
            long r2 = com.google.android.exoplayer2.util.Util.msToUs(r6)
            r1.maxMergedSegmentStartTimeDiffUs = r2
            return
    }

    public static /* synthetic */ com.google.android.exoplayer2.upstream.ParsingLoadable.Parser access$000(com.google.android.exoplayer2.offline.SegmentDownloader r0) {
            com.google.android.exoplayer2.upstream.ParsingLoadable$Parser<M extends com.google.android.exoplayer2.offline.FilterableManifest<M>> r0 = r0.manifestParser
            return r0
    }

    private <T> void addActiveRunnable(com.google.android.exoplayer2.util.RunnableFutureTask<T, ?> r3) throws java.lang.InterruptedException {
            r2 = this;
            java.util.ArrayList<com.google.android.exoplayer2.util.RunnableFutureTask<?, ?>> r0 = r2.activeRunnables
            monitor-enter(r0)
            boolean r1 = r2.isCanceled     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto Le
            java.util.ArrayList<com.google.android.exoplayer2.util.RunnableFutureTask<?, ?>> r1 = r2.activeRunnables     // Catch: java.lang.Throwable -> L14
            r1.add(r3)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        Le:
            java.lang.InterruptedException r3 = new java.lang.InterruptedException     // Catch: java.lang.Throwable -> L14
            r3.<init>()     // Catch: java.lang.Throwable -> L14
            throw r3     // Catch: java.lang.Throwable -> L14
        L14:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r3
    }

    private static boolean canMergeSegments(com.google.android.exoplayer2.upstream.DataSpec r5, com.google.android.exoplayer2.upstream.DataSpec r6) {
            android.net.Uri r0 = r5.uri
            android.net.Uri r1 = r6.uri
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3d
            long r0 = r5.length
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3d
            long r2 = r5.position
            long r2 = r2 + r0
            long r0 = r6.position
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L3d
            java.lang.String r0 = r5.key
            java.lang.String r1 = r6.key
            boolean r0 = com.google.android.exoplayer2.util.Util.areEqual(r0, r1)
            if (r0 == 0) goto L3d
            int r0 = r5.flags
            int r1 = r6.flags
            if (r0 != r1) goto L3d
            int r0 = r5.httpMethod
            int r1 = r6.httpMethod
            if (r0 != r1) goto L3d
            java.util.Map<java.lang.String, java.lang.String> r5 = r5.httpRequestHeaders
            java.util.Map<java.lang.String, java.lang.String> r6 = r6.httpRequestHeaders
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L3d
            r5 = 1
            goto L3e
        L3d:
            r5 = 0
        L3e:
            return r5
    }

    public static com.google.android.exoplayer2.upstream.DataSpec getCompressibleDataSpec(android.net.Uri r1) {
            com.google.android.exoplayer2.upstream.DataSpec$Builder r0 = new com.google.android.exoplayer2.upstream.DataSpec$Builder
            r0.<init>()
            com.google.android.exoplayer2.upstream.DataSpec$Builder r1 = r0.setUri(r1)
            r0 = 1
            com.google.android.exoplayer2.upstream.DataSpec$Builder r1 = r1.setFlags(r0)
            com.google.android.exoplayer2.upstream.DataSpec r1 = r1.build()
            return r1
    }

    private static void mergeSegments(java.util.List<com.google.android.exoplayer2.offline.SegmentDownloader.Segment> r12, com.google.android.exoplayer2.upstream.cache.CacheKeyFactory r13, long r14) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 0
            r2 = 0
        L7:
            int r3 = r12.size()
            if (r1 >= r3) goto L7f
            java.lang.Object r3 = r12.get(r1)
            com.google.android.exoplayer2.offline.SegmentDownloader$Segment r3 = (com.google.android.exoplayer2.offline.SegmentDownloader.Segment) r3
            com.google.android.exoplayer2.upstream.DataSpec r4 = r3.dataSpec
            java.lang.String r4 = r13.buildCacheKey(r4)
            java.lang.Object r5 = r0.get(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 != 0) goto L23
            r6 = 0
            goto L2d
        L23:
            int r6 = r5.intValue()
            java.lang.Object r6 = r12.get(r6)
            com.google.android.exoplayer2.offline.SegmentDownloader$Segment r6 = (com.google.android.exoplayer2.offline.SegmentDownloader.Segment) r6
        L2d:
            if (r6 == 0) goto L70
            long r7 = r3.startTimeUs
            long r9 = r6.startTimeUs
            long r9 = r9 + r14
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 > 0) goto L70
            com.google.android.exoplayer2.upstream.DataSpec r7 = r6.dataSpec
            com.google.android.exoplayer2.upstream.DataSpec r8 = r3.dataSpec
            boolean r7 = canMergeSegments(r7, r8)
            if (r7 != 0) goto L43
            goto L70
        L43:
            com.google.android.exoplayer2.upstream.DataSpec r3 = r3.dataSpec
            long r3 = r3.length
            r7 = -1
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 != 0) goto L4e
            goto L53
        L4e:
            com.google.android.exoplayer2.upstream.DataSpec r7 = r6.dataSpec
            long r7 = r7.length
            long r7 = r7 + r3
        L53:
            com.google.android.exoplayer2.upstream.DataSpec r3 = r6.dataSpec
            r9 = 0
            com.google.android.exoplayer2.upstream.DataSpec r3 = r3.subrange(r9, r7)
            java.lang.Object r4 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            com.google.android.exoplayer2.offline.SegmentDownloader$Segment r5 = new com.google.android.exoplayer2.offline.SegmentDownloader$Segment
            long r6 = r6.startTimeUs
            r5.<init>(r6, r3)
            r12.set(r4, r5)
            goto L7c
        L70:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r0.put(r4, r5)
            r12.set(r2, r3)
            int r2 = r2 + 1
        L7c:
            int r1 = r1 + 1
            goto L7
        L7f:
            int r13 = r12.size()
            com.google.android.exoplayer2.util.Util.removeRange(r12, r2, r13)
            return
    }

    private void removeActiveRunnable(int r3) {
            r2 = this;
            java.util.ArrayList<com.google.android.exoplayer2.util.RunnableFutureTask<?, ?>> r0 = r2.activeRunnables
            monitor-enter(r0)
            java.util.ArrayList<com.google.android.exoplayer2.util.RunnableFutureTask<?, ?>> r1 = r2.activeRunnables     // Catch: java.lang.Throwable -> La
            r1.remove(r3)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    private void removeActiveRunnable(com.google.android.exoplayer2.util.RunnableFutureTask<?, ?> r3) {
            r2 = this;
            java.util.ArrayList<com.google.android.exoplayer2.util.RunnableFutureTask<?, ?>> r0 = r2.activeRunnables
            monitor-enter(r0)
            java.util.ArrayList<com.google.android.exoplayer2.util.RunnableFutureTask<?, ?>> r1 = r2.activeRunnables     // Catch: java.lang.Throwable -> La
            r1.remove(r3)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    @Override // com.google.android.exoplayer2.offline.Downloader
    public void cancel() {
            r4 = this;
            java.util.ArrayList<com.google.android.exoplayer2.util.RunnableFutureTask<?, ?>> r0 = r4.activeRunnables
            monitor-enter(r0)
            r1 = 1
            r4.isCanceled = r1     // Catch: java.lang.Throwable -> L1f
            r2 = 0
        L7:
            java.util.ArrayList<com.google.android.exoplayer2.util.RunnableFutureTask<?, ?>> r3 = r4.activeRunnables     // Catch: java.lang.Throwable -> L1f
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L1f
            if (r2 >= r3) goto L1d
            java.util.ArrayList<com.google.android.exoplayer2.util.RunnableFutureTask<?, ?>> r3 = r4.activeRunnables     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L1f
            com.google.android.exoplayer2.util.RunnableFutureTask r3 = (com.google.android.exoplayer2.util.RunnableFutureTask) r3     // Catch: java.lang.Throwable -> L1f
            r3.cancel(r1)     // Catch: java.lang.Throwable -> L1f
            int r2 = r2 + 1
            goto L7
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            return
        L1f:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r1
    }

    @Override // com.google.android.exoplayer2.offline.Downloader
    public final void download(@androidx.annotation.Nullable com.google.android.exoplayer2.offline.Downloader.ProgressListener r28) throws java.io.IOException, java.lang.InterruptedException {
            r27 = this;
            r1 = r27
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            java.util.ArrayDeque r3 = new java.util.ArrayDeque
            r3.<init>()
            com.google.android.exoplayer2.util.PriorityTaskManager r0 = r1.priorityTaskManager
            r4 = -1000(0xfffffffffffffc18, float:NaN)
            if (r0 == 0) goto L15
            r0.add(r4)
        L15:
            r5 = 0
            r6 = 1
            com.google.android.exoplayer2.upstream.cache.CacheDataSource$Factory r0 = r1.cacheDataSourceFactory     // Catch: java.lang.Throwable -> L18e
            com.google.android.exoplayer2.upstream.cache.CacheDataSource r0 = r0.createDataSourceForDownloading()     // Catch: java.lang.Throwable -> L18e
            com.google.android.exoplayer2.upstream.DataSpec r7 = r1.manifestDataSpec     // Catch: java.lang.Throwable -> L18e
            com.google.android.exoplayer2.offline.FilterableManifest r7 = r1.getManifest(r0, r7, r5)     // Catch: java.lang.Throwable -> L18e
            java.util.ArrayList<com.google.android.exoplayer2.offline.StreamKey> r8 = r1.streamKeys     // Catch: java.lang.Throwable -> L18e
            boolean r8 = r8.isEmpty()     // Catch: java.lang.Throwable -> L18e
            if (r8 != 0) goto L33
            java.util.ArrayList<com.google.android.exoplayer2.offline.StreamKey> r8 = r1.streamKeys     // Catch: java.lang.Throwable -> L18e
            java.lang.Object r7 = r7.copy(r8)     // Catch: java.lang.Throwable -> L18e
            com.google.android.exoplayer2.offline.FilterableManifest r7 = (com.google.android.exoplayer2.offline.FilterableManifest) r7     // Catch: java.lang.Throwable -> L18e
        L33:
            java.util.List r0 = r1.getSegments(r0, r7, r5)     // Catch: java.lang.Throwable -> L18e
            java.util.Collections.sort(r0)     // Catch: java.lang.Throwable -> L18e
            com.google.android.exoplayer2.upstream.cache.CacheKeyFactory r7 = r1.cacheKeyFactory     // Catch: java.lang.Throwable -> L18e
            long r8 = r1.maxMergedSegmentStartTimeDiffUs     // Catch: java.lang.Throwable -> L18e
            mergeSegments(r0, r7, r8)     // Catch: java.lang.Throwable -> L18e
            int r14 = r0.size()     // Catch: java.lang.Throwable -> L18e
            int r7 = r0.size()     // Catch: java.lang.Throwable -> L18e
            int r7 = r7 - r6
            r8 = 0
            r12 = r8
            r15 = r12
            r17 = 0
        L50:
            if (r7 < 0) goto Lae
            java.lang.Object r8 = r0.get(r7)     // Catch: java.lang.Throwable -> L18e
            com.google.android.exoplayer2.offline.SegmentDownloader$Segment r8 = (com.google.android.exoplayer2.offline.SegmentDownloader.Segment) r8     // Catch: java.lang.Throwable -> L18e
            com.google.android.exoplayer2.upstream.DataSpec r8 = r8.dataSpec     // Catch: java.lang.Throwable -> L18e
            com.google.android.exoplayer2.upstream.cache.CacheKeyFactory r9 = r1.cacheKeyFactory     // Catch: java.lang.Throwable -> L18e
            java.lang.String r9 = r9.buildCacheKey(r8)     // Catch: java.lang.Throwable -> L18e
            long r10 = r8.length     // Catch: java.lang.Throwable -> L18e
            r24 = -1
            int r18 = (r10 > r24 ? 1 : (r10 == r24 ? 0 : -1))
            if (r18 != 0) goto L7a
            com.google.android.exoplayer2.upstream.cache.Cache r5 = r1.cache     // Catch: java.lang.Throwable -> L18e
            com.google.android.exoplayer2.upstream.cache.ContentMetadata r5 = r5.getContentMetadata(r9)     // Catch: java.lang.Throwable -> L18e
            long r18 = com.google.android.exoplayer2.upstream.cache.ContentMetadata.CC.getContentLength(r5)     // Catch: java.lang.Throwable -> L18e
            int r5 = (r18 > r24 ? 1 : (r18 == r24 ? 0 : -1))
            if (r5 == 0) goto L7a
            long r10 = r8.position     // Catch: java.lang.Throwable -> L18e
            long r10 = r18 - r10
        L7a:
            com.google.android.exoplayer2.upstream.cache.Cache r5 = r1.cache     // Catch: java.lang.Throwable -> L18e
            r26 = r7
            long r6 = r8.position     // Catch: java.lang.Throwable -> L18e
            r18 = r5
            r19 = r9
            r20 = r6
            r22 = r10
            long r5 = r18.getCachedBytes(r19, r20, r22)     // Catch: java.lang.Throwable -> L18e
            long r15 = r15 + r5
            int r7 = (r10 > r24 ? 1 : (r10 == r24 ? 0 : -1))
            if (r7 == 0) goto La5
            int r7 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r7 != 0) goto L9d
            int r17 = r17 + 1
            r7 = r26
            r0.remove(r7)     // Catch: java.lang.Throwable -> L18e
            goto L9f
        L9d:
            r7 = r26
        L9f:
            int r5 = (r12 > r24 ? 1 : (r12 == r24 ? 0 : -1))
            if (r5 == 0) goto La9
            long r12 = r12 + r10
            goto La9
        La5:
            r7 = r26
            r12 = r24
        La9:
            int r7 = r7 + (-1)
            r5 = 0
            r6 = 1
            goto L50
        Lae:
            if (r28 == 0) goto Lb9
            com.google.android.exoplayer2.offline.SegmentDownloader$ProgressNotifier r5 = new com.google.android.exoplayer2.offline.SegmentDownloader$ProgressNotifier     // Catch: java.lang.Throwable -> L18e
            r10 = r5
            r11 = r28
            r10.<init>(r11, r12, r14, r15, r17)     // Catch: java.lang.Throwable -> L18e
            goto Lba
        Lb9:
            r5 = 0
        Lba:
            r2.addAll(r0)     // Catch: java.lang.Throwable -> L18e
        Lbd:
            boolean r0 = r1.isCanceled     // Catch: java.lang.Throwable -> L18e
            if (r0 != 0) goto L153
            boolean r0 = r2.isEmpty()     // Catch: java.lang.Throwable -> L18e
            if (r0 != 0) goto L153
            com.google.android.exoplayer2.util.PriorityTaskManager r0 = r1.priorityTaskManager     // Catch: java.lang.Throwable -> L18e
            if (r0 == 0) goto Lce
            r0.proceed(r4)     // Catch: java.lang.Throwable -> L18e
        Lce:
            boolean r0 = r3.isEmpty()     // Catch: java.lang.Throwable -> L18e
            if (r0 != 0) goto Ldf
            java.lang.Object r0 = r3.removeFirst()     // Catch: java.lang.Throwable -> L18e
            com.google.android.exoplayer2.offline.SegmentDownloader$SegmentDownloadRunnable r0 = (com.google.android.exoplayer2.offline.SegmentDownloader.SegmentDownloadRunnable) r0     // Catch: java.lang.Throwable -> L18e
            com.google.android.exoplayer2.upstream.cache.CacheDataSource r6 = r0.dataSource     // Catch: java.lang.Throwable -> L18e
            byte[] r0 = r0.temporaryBuffer     // Catch: java.lang.Throwable -> L18e
            goto Le9
        Ldf:
            com.google.android.exoplayer2.upstream.cache.CacheDataSource$Factory r0 = r1.cacheDataSourceFactory     // Catch: java.lang.Throwable -> L18e
            com.google.android.exoplayer2.upstream.cache.CacheDataSource r6 = r0.createDataSourceForDownloading()     // Catch: java.lang.Throwable -> L18e
            r0 = 131072(0x20000, float:1.83671E-40)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L18e
        Le9:
            java.lang.Object r7 = r2.removeFirst()     // Catch: java.lang.Throwable -> L18e
            com.google.android.exoplayer2.offline.SegmentDownloader$Segment r7 = (com.google.android.exoplayer2.offline.SegmentDownloader.Segment) r7     // Catch: java.lang.Throwable -> L18e
            com.google.android.exoplayer2.offline.SegmentDownloader$SegmentDownloadRunnable r8 = new com.google.android.exoplayer2.offline.SegmentDownloader$SegmentDownloadRunnable     // Catch: java.lang.Throwable -> L18e
            r8.<init>(r7, r6, r5, r0)     // Catch: java.lang.Throwable -> L18e
            r1.addActiveRunnable(r8)     // Catch: java.lang.Throwable -> L18e
            java.util.concurrent.Executor r0 = r1.executor     // Catch: java.lang.Throwable -> L18e
            r0.execute(r8)     // Catch: java.lang.Throwable -> L18e
            java.util.ArrayList<com.google.android.exoplayer2.util.RunnableFutureTask<?, ?>> r0 = r1.activeRunnables     // Catch: java.lang.Throwable -> L18e
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L18e
            r6 = 1
            int r0 = r0 - r6
            r6 = r0
        L105:
            if (r6 < 0) goto L14e
            java.util.ArrayList<com.google.android.exoplayer2.util.RunnableFutureTask<?, ?>> r0 = r1.activeRunnables     // Catch: java.lang.Throwable -> L18e
            java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Throwable -> L18e
            r7 = r0
            com.google.android.exoplayer2.offline.SegmentDownloader$SegmentDownloadRunnable r7 = (com.google.android.exoplayer2.offline.SegmentDownloader.SegmentDownloadRunnable) r7     // Catch: java.lang.Throwable -> L18e
            boolean r0 = r2.isEmpty()     // Catch: java.lang.Throwable -> L18e
            if (r0 != 0) goto L11c
            boolean r0 = r7.isDone()     // Catch: java.lang.Throwable -> L18e
            if (r0 == 0) goto L148
        L11c:
            r7.get()     // Catch: java.util.concurrent.ExecutionException -> L126 java.lang.Throwable -> L18e
            r1.removeActiveRunnable(r6)     // Catch: java.util.concurrent.ExecutionException -> L126 java.lang.Throwable -> L18e
            r3.addLast(r7)     // Catch: java.util.concurrent.ExecutionException -> L126 java.lang.Throwable -> L18e
            goto L148
        L126:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getCause()     // Catch: java.lang.Throwable -> L18e
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)     // Catch: java.lang.Throwable -> L18e
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> L18e
            boolean r9 = r0 instanceof com.google.android.exoplayer2.util.PriorityTaskManager.PriorityTooLowException     // Catch: java.lang.Throwable -> L18e
            if (r9 == 0) goto L141
            com.google.android.exoplayer2.offline.SegmentDownloader$Segment r0 = r7.segment     // Catch: java.lang.Throwable -> L18e
            r2.addFirst(r0)     // Catch: java.lang.Throwable -> L18e
            r1.removeActiveRunnable(r6)     // Catch: java.lang.Throwable -> L18e
            r3.addLast(r7)     // Catch: java.lang.Throwable -> L18e
            goto L148
        L141:
            boolean r7 = r0 instanceof java.io.IOException     // Catch: java.lang.Throwable -> L18e
            if (r7 != 0) goto L14b
            com.google.android.exoplayer2.util.Util.sneakyThrow(r0)     // Catch: java.lang.Throwable -> L18e
        L148:
            int r6 = r6 + (-1)
            goto L105
        L14b:
            java.io.IOException r0 = (java.io.IOException) r0     // Catch: java.lang.Throwable -> L18e
            throw r0     // Catch: java.lang.Throwable -> L18e
        L14e:
            r8.blockUntilStarted()     // Catch: java.lang.Throwable -> L18e
            goto Lbd
        L153:
            r5 = 0
        L154:
            java.util.ArrayList<com.google.android.exoplayer2.util.RunnableFutureTask<?, ?>> r0 = r1.activeRunnables
            int r0 = r0.size()
            if (r5 >= r0) goto L16b
            java.util.ArrayList<com.google.android.exoplayer2.util.RunnableFutureTask<?, ?>> r0 = r1.activeRunnables
            java.lang.Object r0 = r0.get(r5)
            com.google.android.exoplayer2.util.RunnableFutureTask r0 = (com.google.android.exoplayer2.util.RunnableFutureTask) r0
            r2 = 1
            r0.cancel(r2)
            int r5 = r5 + 1
            goto L154
        L16b:
            r2 = 1
            java.util.ArrayList<com.google.android.exoplayer2.util.RunnableFutureTask<?, ?>> r0 = r1.activeRunnables
            int r0 = r0.size()
            int r0 = r0 - r2
        L173:
            if (r0 < 0) goto L186
            java.util.ArrayList<com.google.android.exoplayer2.util.RunnableFutureTask<?, ?>> r2 = r1.activeRunnables
            java.lang.Object r2 = r2.get(r0)
            com.google.android.exoplayer2.util.RunnableFutureTask r2 = (com.google.android.exoplayer2.util.RunnableFutureTask) r2
            r2.blockUntilFinished()
            r1.removeActiveRunnable(r0)
            int r0 = r0 + (-1)
            goto L173
        L186:
            com.google.android.exoplayer2.util.PriorityTaskManager r0 = r1.priorityTaskManager
            if (r0 == 0) goto L18d
            r0.remove(r4)
        L18d:
            return
        L18e:
            r0 = move-exception
            r5 = 0
        L190:
            java.util.ArrayList<com.google.android.exoplayer2.util.RunnableFutureTask<?, ?>> r2 = r1.activeRunnables
            int r2 = r2.size()
            if (r5 >= r2) goto L1a7
            java.util.ArrayList<com.google.android.exoplayer2.util.RunnableFutureTask<?, ?>> r2 = r1.activeRunnables
            java.lang.Object r2 = r2.get(r5)
            com.google.android.exoplayer2.util.RunnableFutureTask r2 = (com.google.android.exoplayer2.util.RunnableFutureTask) r2
            r3 = 1
            r2.cancel(r3)
            int r5 = r5 + 1
            goto L190
        L1a7:
            r3 = 1
            java.util.ArrayList<com.google.android.exoplayer2.util.RunnableFutureTask<?, ?>> r2 = r1.activeRunnables
            int r2 = r2.size()
            int r2 = r2 - r3
        L1af:
            if (r2 < 0) goto L1c2
            java.util.ArrayList<com.google.android.exoplayer2.util.RunnableFutureTask<?, ?>> r3 = r1.activeRunnables
            java.lang.Object r3 = r3.get(r2)
            com.google.android.exoplayer2.util.RunnableFutureTask r3 = (com.google.android.exoplayer2.util.RunnableFutureTask) r3
            r3.blockUntilFinished()
            r1.removeActiveRunnable(r2)
            int r2 = r2 + (-1)
            goto L1af
        L1c2:
            com.google.android.exoplayer2.util.PriorityTaskManager r2 = r1.priorityTaskManager
            if (r2 == 0) goto L1c9
            r2.remove(r4)
        L1c9:
            throw r0
    }

    public final <T> T execute(com.google.android.exoplayer2.util.RunnableFutureTask<T, ?> r3, boolean r4) throws java.lang.InterruptedException, java.io.IOException {
            r2 = this;
            if (r4 == 0) goto L20
            r3.run()
            java.lang.Object r3 = r3.get()     // Catch: java.util.concurrent.ExecutionException -> La
            return r3
        La:
            r4 = move-exception
            java.lang.Throwable r0 = r4.getCause()
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            boolean r1 = r0 instanceof java.io.IOException
            if (r1 != 0) goto L1d
            com.google.android.exoplayer2.util.Util.sneakyThrow(r4)
            goto L20
        L1d:
            java.io.IOException r0 = (java.io.IOException) r0
            throw r0
        L20:
            boolean r4 = r2.isCanceled
            if (r4 != 0) goto L6a
            com.google.android.exoplayer2.util.PriorityTaskManager r4 = r2.priorityTaskManager
            if (r4 == 0) goto L2d
            r0 = -1000(0xfffffffffffffc18, float:NaN)
            r4.proceed(r0)
        L2d:
            r2.addActiveRunnable(r3)
            java.util.concurrent.Executor r4 = r2.executor
            r4.execute(r3)
            java.lang.Object r4 = r3.get()     // Catch: java.lang.Throwable -> L40 java.util.concurrent.ExecutionException -> L42
            r3.blockUntilFinished()
            r2.removeActiveRunnable(r3)
            return r4
        L40:
            r4 = move-exception
            goto L63
        L42:
            r4 = move-exception
            java.lang.Throwable r0 = r4.getCause()     // Catch: java.lang.Throwable -> L40
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)     // Catch: java.lang.Throwable -> L40
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> L40
            boolean r1 = r0 instanceof com.google.android.exoplayer2.util.PriorityTaskManager.PriorityTooLowException     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L52
            goto L59
        L52:
            boolean r1 = r0 instanceof java.io.IOException     // Catch: java.lang.Throwable -> L40
            if (r1 != 0) goto L60
            com.google.android.exoplayer2.util.Util.sneakyThrow(r4)     // Catch: java.lang.Throwable -> L40
        L59:
            r3.blockUntilFinished()
            r2.removeActiveRunnable(r3)
            goto L20
        L60:
            java.io.IOException r0 = (java.io.IOException) r0     // Catch: java.lang.Throwable -> L40
            throw r0     // Catch: java.lang.Throwable -> L40
        L63:
            r3.blockUntilFinished()
            r2.removeActiveRunnable(r3)
            throw r4
        L6a:
            java.lang.InterruptedException r3 = new java.lang.InterruptedException
            r3.<init>()
            throw r3
    }

    public final M getManifest(com.google.android.exoplayer2.upstream.DataSource r2, com.google.android.exoplayer2.upstream.DataSpec r3, boolean r4) throws java.lang.InterruptedException, java.io.IOException {
            r1 = this;
            com.google.android.exoplayer2.offline.SegmentDownloader$1 r0 = new com.google.android.exoplayer2.offline.SegmentDownloader$1
            r0.<init>(r1, r2, r3)
            java.lang.Object r2 = r1.execute(r0, r4)
            com.google.android.exoplayer2.offline.FilterableManifest r2 = (com.google.android.exoplayer2.offline.FilterableManifest) r2
            return r2
    }

    public abstract java.util.List<com.google.android.exoplayer2.offline.SegmentDownloader.Segment> getSegments(com.google.android.exoplayer2.upstream.DataSource r1, M r2, boolean r3) throws java.io.IOException, java.lang.InterruptedException;

    @Override // com.google.android.exoplayer2.offline.Downloader
    public final void remove() {
            r5 = this;
            com.google.android.exoplayer2.upstream.cache.CacheDataSource$Factory r0 = r5.cacheDataSourceFactory
            com.google.android.exoplayer2.upstream.cache.CacheDataSource r0 = r0.createDataSourceForRemovingDownload()
            com.google.android.exoplayer2.upstream.DataSpec r1 = r5.manifestDataSpec     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30 java.lang.InterruptedException -> L3e
            r2 = 1
            com.google.android.exoplayer2.offline.FilterableManifest r1 = r5.getManifest(r0, r1, r2)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30 java.lang.InterruptedException -> L3e
            java.util.List r0 = r5.getSegments(r0, r1, r2)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30 java.lang.InterruptedException -> L3e
            r1 = 0
        L12:
            int r2 = r0.size()     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30 java.lang.InterruptedException -> L3e
            if (r1 >= r2) goto L30
            com.google.android.exoplayer2.upstream.cache.Cache r2 = r5.cache     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30 java.lang.InterruptedException -> L3e
            com.google.android.exoplayer2.upstream.cache.CacheKeyFactory r3 = r5.cacheKeyFactory     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30 java.lang.InterruptedException -> L3e
            java.lang.Object r4 = r0.get(r1)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30 java.lang.InterruptedException -> L3e
            com.google.android.exoplayer2.offline.SegmentDownloader$Segment r4 = (com.google.android.exoplayer2.offline.SegmentDownloader.Segment) r4     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30 java.lang.InterruptedException -> L3e
            com.google.android.exoplayer2.upstream.DataSpec r4 = r4.dataSpec     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30 java.lang.InterruptedException -> L3e
            java.lang.String r3 = r3.buildCacheKey(r4)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30 java.lang.InterruptedException -> L3e
            r2.removeResource(r3)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30 java.lang.InterruptedException -> L3e
            int r1 = r1 + 1
            goto L12
        L2e:
            r0 = move-exception
            goto L47
        L30:
            com.google.android.exoplayer2.upstream.cache.Cache r0 = r5.cache
            com.google.android.exoplayer2.upstream.cache.CacheKeyFactory r1 = r5.cacheKeyFactory
            com.google.android.exoplayer2.upstream.DataSpec r2 = r5.manifestDataSpec
            java.lang.String r1 = r1.buildCacheKey(r2)
            r0.removeResource(r1)
            goto L46
        L3e:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2e
            r0.interrupt()     // Catch: java.lang.Throwable -> L2e
            goto L30
        L46:
            return
        L47:
            com.google.android.exoplayer2.upstream.cache.Cache r1 = r5.cache
            com.google.android.exoplayer2.upstream.cache.CacheKeyFactory r2 = r5.cacheKeyFactory
            com.google.android.exoplayer2.upstream.DataSpec r3 = r5.manifestDataSpec
            java.lang.String r2 = r2.buildCacheKey(r3)
            r1.removeResource(r2)
            throw r0
    }
}
