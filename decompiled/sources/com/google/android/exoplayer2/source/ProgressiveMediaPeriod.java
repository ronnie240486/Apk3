package com.google.android.exoplayer2.source;

/* JADX INFO: loaded from: classes.dex */
final class ProgressiveMediaPeriod implements com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.extractor.ExtractorOutput, com.google.android.exoplayer2.upstream.Loader.Callback<com.google.android.exoplayer2.source.ProgressiveMediaPeriod.ExtractingLoadable>, com.google.android.exoplayer2.upstream.Loader.ReleaseCallback, com.google.android.exoplayer2.source.SampleQueue.UpstreamFormatChangedListener {
    private static final long DEFAULT_LAST_SAMPLE_DURATION_US = 10000;
    private static final com.google.android.exoplayer2.Format ICY_FORMAT = null;
    private static final java.util.Map<java.lang.String, java.lang.String> ICY_METADATA_HEADERS = null;
    private final com.google.android.exoplayer2.upstream.Allocator allocator;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.source.MediaPeriod.Callback callback;
    private final long continueLoadingCheckIntervalBytes;

    @androidx.annotation.Nullable
    private final java.lang.String customCacheKey;
    private final com.google.android.exoplayer2.upstream.DataSource dataSource;
    private int dataType;
    private final com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher drmEventDispatcher;
    private final com.google.android.exoplayer2.drm.DrmSessionManager drmSessionManager;
    private long durationUs;
    private int enabledTrackCount;
    private int extractedSamplesCountAtStartOfLoad;
    private final android.os.Handler handler;
    private boolean haveAudioVideoTracks;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.metadata.icy.IcyHeaders icyHeaders;
    private boolean isLengthKnown;
    private boolean isLive;
    private long lastSeekPositionUs;
    private final com.google.android.exoplayer2.source.ProgressiveMediaPeriod.Listener listener;
    private final com.google.android.exoplayer2.util.ConditionVariable loadCondition;
    private final com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private final com.google.android.exoplayer2.upstream.Loader loader;
    private boolean loadingFinished;
    private final java.lang.Runnable maybeFinishPrepareRunnable;
    private final com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher;
    private boolean notifyDiscontinuity;
    private final java.lang.Runnable onContinueLoadingRequestedRunnable;
    private boolean pendingDeferredRetry;
    private long pendingResetPositionUs;
    private boolean prepared;
    private final com.google.android.exoplayer2.source.ProgressiveMediaExtractor progressiveMediaExtractor;
    private boolean released;
    private com.google.android.exoplayer2.source.ProgressiveMediaPeriod.TrackId[] sampleQueueTrackIds;
    private com.google.android.exoplayer2.source.SampleQueue[] sampleQueues;
    private boolean sampleQueuesBuilt;
    private com.google.android.exoplayer2.extractor.SeekMap seekMap;
    private boolean seenFirstTrackSelection;
    private com.google.android.exoplayer2.source.ProgressiveMediaPeriod.TrackState trackState;
    private final android.net.Uri uri;

    public final class ExtractingLoadable implements com.google.android.exoplayer2.upstream.Loader.Loadable, com.google.android.exoplayer2.source.IcyDataSource.Listener {
        private final com.google.android.exoplayer2.upstream.StatsDataSource dataSource;
        private com.google.android.exoplayer2.upstream.DataSpec dataSpec;
        private final com.google.android.exoplayer2.extractor.ExtractorOutput extractorOutput;

        @androidx.annotation.Nullable
        private com.google.android.exoplayer2.extractor.TrackOutput icyTrackOutput;
        private volatile boolean loadCanceled;
        private final com.google.android.exoplayer2.util.ConditionVariable loadCondition;
        private final long loadTaskId;
        private boolean pendingExtractorSeek;
        private final com.google.android.exoplayer2.extractor.PositionHolder positionHolder;
        private final com.google.android.exoplayer2.source.ProgressiveMediaExtractor progressiveMediaExtractor;
        private long seekTimeUs;
        private boolean seenIcyMetadata;
        public final /* synthetic */ com.google.android.exoplayer2.source.ProgressiveMediaPeriod this$0;
        private final android.net.Uri uri;

        public ExtractingLoadable(com.google.android.exoplayer2.source.ProgressiveMediaPeriod r1, android.net.Uri r2, com.google.android.exoplayer2.upstream.DataSource r3, com.google.android.exoplayer2.source.ProgressiveMediaExtractor r4, com.google.android.exoplayer2.extractor.ExtractorOutput r5, com.google.android.exoplayer2.util.ConditionVariable r6) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.uri = r2
                com.google.android.exoplayer2.upstream.StatsDataSource r1 = new com.google.android.exoplayer2.upstream.StatsDataSource
                r1.<init>(r3)
                r0.dataSource = r1
                r0.progressiveMediaExtractor = r4
                r0.extractorOutput = r5
                r0.loadCondition = r6
                com.google.android.exoplayer2.extractor.PositionHolder r1 = new com.google.android.exoplayer2.extractor.PositionHolder
                r1.<init>()
                r0.positionHolder = r1
                r1 = 1
                r0.pendingExtractorSeek = r1
                long r1 = com.google.android.exoplayer2.source.LoadEventInfo.getNewId()
                r0.loadTaskId = r1
                r1 = 0
                com.google.android.exoplayer2.upstream.DataSpec r1 = r0.buildDataSpec(r1)
                r0.dataSpec = r1
                return
        }

        public static /* synthetic */ com.google.android.exoplayer2.upstream.StatsDataSource access$100(com.google.android.exoplayer2.source.ProgressiveMediaPeriod.ExtractingLoadable r0) {
                com.google.android.exoplayer2.upstream.StatsDataSource r0 = r0.dataSource
                return r0
        }

        public static /* synthetic */ long access$200(com.google.android.exoplayer2.source.ProgressiveMediaPeriod.ExtractingLoadable r2) {
                long r0 = r2.loadTaskId
                return r0
        }

        public static /* synthetic */ com.google.android.exoplayer2.upstream.DataSpec access$300(com.google.android.exoplayer2.source.ProgressiveMediaPeriod.ExtractingLoadable r0) {
                com.google.android.exoplayer2.upstream.DataSpec r0 = r0.dataSpec
                return r0
        }

        public static /* synthetic */ long access$400(com.google.android.exoplayer2.source.ProgressiveMediaPeriod.ExtractingLoadable r2) {
                long r0 = r2.seekTimeUs
                return r0
        }

        public static /* synthetic */ void access$500(com.google.android.exoplayer2.source.ProgressiveMediaPeriod.ExtractingLoadable r0, long r1, long r3) {
                r0.setLoadPosition(r1, r3)
                return
        }

        private com.google.android.exoplayer2.upstream.DataSpec buildDataSpec(long r3) {
                r2 = this;
                com.google.android.exoplayer2.upstream.DataSpec$Builder r0 = new com.google.android.exoplayer2.upstream.DataSpec$Builder
                r0.<init>()
                android.net.Uri r1 = r2.uri
                com.google.android.exoplayer2.upstream.DataSpec$Builder r0 = r0.setUri(r1)
                com.google.android.exoplayer2.upstream.DataSpec$Builder r3 = r0.setPosition(r3)
                com.google.android.exoplayer2.source.ProgressiveMediaPeriod r4 = r2.this$0
                java.lang.String r4 = com.google.android.exoplayer2.source.ProgressiveMediaPeriod.access$1400(r4)
                com.google.android.exoplayer2.upstream.DataSpec$Builder r3 = r3.setKey(r4)
                r4 = 6
                com.google.android.exoplayer2.upstream.DataSpec$Builder r3 = r3.setFlags(r4)
                java.util.Map r4 = com.google.android.exoplayer2.source.ProgressiveMediaPeriod.access$1300()
                com.google.android.exoplayer2.upstream.DataSpec$Builder r3 = r3.setHttpRequestHeaders(r4)
                com.google.android.exoplayer2.upstream.DataSpec r3 = r3.build()
                return r3
        }

        private void setLoadPosition(long r2, long r4) {
                r1 = this;
                com.google.android.exoplayer2.extractor.PositionHolder r0 = r1.positionHolder
                r0.position = r2
                r1.seekTimeUs = r4
                r2 = 1
                r1.pendingExtractorSeek = r2
                r2 = 0
                r1.seenIcyMetadata = r2
                return
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public void cancelLoad() {
                r1 = this;
                r0 = 1
                r1.loadCanceled = r0
                return
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public void load() throws java.io.IOException {
                r17 = this;
                r1 = r17
                r0 = 0
                r2 = 0
            L4:
                if (r2 != 0) goto L118
                boolean r3 = r1.loadCanceled
                if (r3 != 0) goto L118
                r3 = 1
                r4 = -1
                com.google.android.exoplayer2.extractor.PositionHolder r6 = r1.positionHolder     // Catch: java.lang.Throwable -> Lf9
                long r13 = r6.position     // Catch: java.lang.Throwable -> Lf9
                com.google.android.exoplayer2.upstream.DataSpec r6 = r1.buildDataSpec(r13)     // Catch: java.lang.Throwable -> Lf9
                r1.dataSpec = r6     // Catch: java.lang.Throwable -> Lf9
                com.google.android.exoplayer2.upstream.StatsDataSource r7 = r1.dataSource     // Catch: java.lang.Throwable -> Lf9
                long r6 = r7.open(r6)     // Catch: java.lang.Throwable -> Lf9
                int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r8 == 0) goto L27
                long r6 = r6 + r13
                com.google.android.exoplayer2.source.ProgressiveMediaPeriod r8 = r1.this$0     // Catch: java.lang.Throwable -> Lf9
                com.google.android.exoplayer2.source.ProgressiveMediaPeriod.access$600(r8)     // Catch: java.lang.Throwable -> Lf9
            L27:
                r15 = r6
                com.google.android.exoplayer2.source.ProgressiveMediaPeriod r6 = r1.this$0     // Catch: java.lang.Throwable -> Lf9
                com.google.android.exoplayer2.upstream.StatsDataSource r7 = r1.dataSource     // Catch: java.lang.Throwable -> Lf9
                java.util.Map r7 = r7.getResponseHeaders()     // Catch: java.lang.Throwable -> Lf9
                com.google.android.exoplayer2.metadata.icy.IcyHeaders r7 = com.google.android.exoplayer2.metadata.icy.IcyHeaders.parse(r7)     // Catch: java.lang.Throwable -> Lf9
                com.google.android.exoplayer2.source.ProgressiveMediaPeriod.access$702(r6, r7)     // Catch: java.lang.Throwable -> Lf9
                com.google.android.exoplayer2.upstream.StatsDataSource r6 = r1.dataSource     // Catch: java.lang.Throwable -> Lf9
                com.google.android.exoplayer2.source.ProgressiveMediaPeriod r7 = r1.this$0     // Catch: java.lang.Throwable -> Lf9
                com.google.android.exoplayer2.metadata.icy.IcyHeaders r7 = com.google.android.exoplayer2.source.ProgressiveMediaPeriod.access$700(r7)     // Catch: java.lang.Throwable -> Lf9
                if (r7 == 0) goto L6a
                com.google.android.exoplayer2.source.ProgressiveMediaPeriod r7 = r1.this$0     // Catch: java.lang.Throwable -> Lf9
                com.google.android.exoplayer2.metadata.icy.IcyHeaders r7 = com.google.android.exoplayer2.source.ProgressiveMediaPeriod.access$700(r7)     // Catch: java.lang.Throwable -> Lf9
                int r7 = r7.metadataInterval     // Catch: java.lang.Throwable -> Lf9
                r8 = -1
                if (r7 == r8) goto L6a
                com.google.android.exoplayer2.source.IcyDataSource r6 = new com.google.android.exoplayer2.source.IcyDataSource     // Catch: java.lang.Throwable -> Lf9
                com.google.android.exoplayer2.upstream.StatsDataSource r7 = r1.dataSource     // Catch: java.lang.Throwable -> Lf9
                com.google.android.exoplayer2.source.ProgressiveMediaPeriod r8 = r1.this$0     // Catch: java.lang.Throwable -> Lf9
                com.google.android.exoplayer2.metadata.icy.IcyHeaders r8 = com.google.android.exoplayer2.source.ProgressiveMediaPeriod.access$700(r8)     // Catch: java.lang.Throwable -> Lf9
                int r8 = r8.metadataInterval     // Catch: java.lang.Throwable -> Lf9
                r6.<init>(r7, r8, r1)     // Catch: java.lang.Throwable -> Lf9
                com.google.android.exoplayer2.source.ProgressiveMediaPeriod r7 = r1.this$0     // Catch: java.lang.Throwable -> Lf9
                com.google.android.exoplayer2.extractor.TrackOutput r7 = r7.icyTrack()     // Catch: java.lang.Throwable -> Lf9
                r1.icyTrackOutput = r7     // Catch: java.lang.Throwable -> Lf9
                com.google.android.exoplayer2.Format r8 = com.google.android.exoplayer2.source.ProgressiveMediaPeriod.access$800()     // Catch: java.lang.Throwable -> Lf9
                r7.format(r8)     // Catch: java.lang.Throwable -> Lf9
            L6a:
                r8 = r6
                com.google.android.exoplayer2.source.ProgressiveMediaExtractor r7 = r1.progressiveMediaExtractor     // Catch: java.lang.Throwable -> Lf9
                android.net.Uri r9 = r1.uri     // Catch: java.lang.Throwable -> Lf9
                com.google.android.exoplayer2.upstream.StatsDataSource r6 = r1.dataSource     // Catch: java.lang.Throwable -> Lf9
                java.util.Map r10 = r6.getResponseHeaders()     // Catch: java.lang.Throwable -> Lf9
                com.google.android.exoplayer2.extractor.ExtractorOutput r6 = r1.extractorOutput     // Catch: java.lang.Throwable -> Lf9
                r11 = r13
                r4 = r13
                r13 = r15
                r15 = r6
                r7.init(r8, r9, r10, r11, r13, r15)     // Catch: java.lang.Throwable -> Lf9
                com.google.android.exoplayer2.source.ProgressiveMediaPeriod r6 = r1.this$0     // Catch: java.lang.Throwable -> Lf9
                com.google.android.exoplayer2.metadata.icy.IcyHeaders r6 = com.google.android.exoplayer2.source.ProgressiveMediaPeriod.access$700(r6)     // Catch: java.lang.Throwable -> Lf9
                if (r6 == 0) goto L8b
                com.google.android.exoplayer2.source.ProgressiveMediaExtractor r6 = r1.progressiveMediaExtractor     // Catch: java.lang.Throwable -> Lf9
                r6.disableSeekingOnMp3Streams()     // Catch: java.lang.Throwable -> Lf9
            L8b:
                boolean r6 = r1.pendingExtractorSeek     // Catch: java.lang.Throwable -> Lf9
                if (r6 == 0) goto L98
                com.google.android.exoplayer2.source.ProgressiveMediaExtractor r6 = r1.progressiveMediaExtractor     // Catch: java.lang.Throwable -> Lf9
                long r7 = r1.seekTimeUs     // Catch: java.lang.Throwable -> Lf9
                r6.seek(r4, r7)     // Catch: java.lang.Throwable -> Lf9
                r1.pendingExtractorSeek = r0     // Catch: java.lang.Throwable -> Lf9
            L98:
                r13 = r4
            L99:
                if (r2 != 0) goto Ld8
                boolean r4 = r1.loadCanceled     // Catch: java.lang.Throwable -> Lf9
                if (r4 != 0) goto Ld8
                com.google.android.exoplayer2.util.ConditionVariable r4 = r1.loadCondition     // Catch: java.lang.InterruptedException -> Ld2 java.lang.Throwable -> Lf9
                r4.block()     // Catch: java.lang.InterruptedException -> Ld2 java.lang.Throwable -> Lf9
                com.google.android.exoplayer2.source.ProgressiveMediaExtractor r4 = r1.progressiveMediaExtractor     // Catch: java.lang.Throwable -> Lf9
                com.google.android.exoplayer2.extractor.PositionHolder r5 = r1.positionHolder     // Catch: java.lang.Throwable -> Lf9
                int r2 = r4.read(r5)     // Catch: java.lang.Throwable -> Lf9
                com.google.android.exoplayer2.source.ProgressiveMediaExtractor r4 = r1.progressiveMediaExtractor     // Catch: java.lang.Throwable -> Lf9
                long r4 = r4.getCurrentInputPosition()     // Catch: java.lang.Throwable -> Lf9
                com.google.android.exoplayer2.source.ProgressiveMediaPeriod r6 = r1.this$0     // Catch: java.lang.Throwable -> Lf9
                long r6 = com.google.android.exoplayer2.source.ProgressiveMediaPeriod.access$900(r6)     // Catch: java.lang.Throwable -> Lf9
                long r6 = r6 + r13
                int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r8 <= 0) goto L99
                com.google.android.exoplayer2.util.ConditionVariable r6 = r1.loadCondition     // Catch: java.lang.Throwable -> Lf9
                r6.close()     // Catch: java.lang.Throwable -> Lf9
                com.google.android.exoplayer2.source.ProgressiveMediaPeriod r6 = r1.this$0     // Catch: java.lang.Throwable -> Lf9
                android.os.Handler r6 = com.google.android.exoplayer2.source.ProgressiveMediaPeriod.access$1100(r6)     // Catch: java.lang.Throwable -> Lf9
                com.google.android.exoplayer2.source.ProgressiveMediaPeriod r7 = r1.this$0     // Catch: java.lang.Throwable -> Lf9
                java.lang.Runnable r7 = com.google.android.exoplayer2.source.ProgressiveMediaPeriod.access$1000(r7)     // Catch: java.lang.Throwable -> Lf9
                r6.post(r7)     // Catch: java.lang.Throwable -> Lf9
                goto L98
            Ld2:
                java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> Lf9
                r0.<init>()     // Catch: java.lang.Throwable -> Lf9
                throw r0     // Catch: java.lang.Throwable -> Lf9
            Ld8:
                if (r2 != r3) goto Ldc
                r2 = 0
                goto Lf2
            Ldc:
                com.google.android.exoplayer2.source.ProgressiveMediaExtractor r3 = r1.progressiveMediaExtractor
                long r3 = r3.getCurrentInputPosition()
                r5 = -1
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 == 0) goto Lf2
                com.google.android.exoplayer2.extractor.PositionHolder r3 = r1.positionHolder
                com.google.android.exoplayer2.source.ProgressiveMediaExtractor r4 = r1.progressiveMediaExtractor
                long r4 = r4.getCurrentInputPosition()
                r3.position = r4
            Lf2:
                com.google.android.exoplayer2.upstream.StatsDataSource r3 = r1.dataSource
                com.google.android.exoplayer2.upstream.DataSourceUtil.closeQuietly(r3)
                goto L4
            Lf9:
                r0 = move-exception
                if (r2 == r3) goto L112
                com.google.android.exoplayer2.source.ProgressiveMediaExtractor r2 = r1.progressiveMediaExtractor
                long r2 = r2.getCurrentInputPosition()
                r4 = -1
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 == 0) goto L112
                com.google.android.exoplayer2.extractor.PositionHolder r2 = r1.positionHolder
                com.google.android.exoplayer2.source.ProgressiveMediaExtractor r3 = r1.progressiveMediaExtractor
                long r3 = r3.getCurrentInputPosition()
                r2.position = r3
            L112:
                com.google.android.exoplayer2.upstream.StatsDataSource r2 = r1.dataSource
                com.google.android.exoplayer2.upstream.DataSourceUtil.closeQuietly(r2)
                throw r0
            L118:
                return
        }

        @Override // com.google.android.exoplayer2.source.IcyDataSource.Listener
        public void onIcyMetadata(com.google.android.exoplayer2.util.ParsableByteArray r10) {
                r9 = this;
                boolean r0 = r9.seenIcyMetadata
                if (r0 != 0) goto L7
                long r0 = r9.seekTimeUs
                goto L13
            L7:
                com.google.android.exoplayer2.source.ProgressiveMediaPeriod r0 = r9.this$0
                long r0 = com.google.android.exoplayer2.source.ProgressiveMediaPeriod.access$1200(r0)
                long r2 = r9.seekTimeUs
                long r0 = java.lang.Math.max(r0, r2)
            L13:
                r3 = r0
                int r6 = r10.bytesLeft()
                com.google.android.exoplayer2.extractor.TrackOutput r0 = r9.icyTrackOutput
                java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
                r2 = r0
                com.google.android.exoplayer2.extractor.TrackOutput r2 = (com.google.android.exoplayer2.extractor.TrackOutput) r2
                r2.sampleData(r10, r6)
                r5 = 1
                r7 = 0
                r8 = 0
                r2.sampleMetadata(r3, r5, r6, r7, r8)
                r10 = 1
                r9.seenIcyMetadata = r10
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface Listener {
        void onSourceInfoRefreshed(long r1, boolean r3, boolean r4);
    }

    public final class SampleStreamImpl implements com.google.android.exoplayer2.source.SampleStream {
        public final /* synthetic */ com.google.android.exoplayer2.source.ProgressiveMediaPeriod this$0;
        private final int track;

        public SampleStreamImpl(com.google.android.exoplayer2.source.ProgressiveMediaPeriod r1, int r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.track = r2
                return
        }

        public static /* synthetic */ int access$000(com.google.android.exoplayer2.source.ProgressiveMediaPeriod.SampleStreamImpl r0) {
                int r0 = r0.track
                return r0
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public boolean isReady() {
                r2 = this;
                com.google.android.exoplayer2.source.ProgressiveMediaPeriod r0 = r2.this$0
                int r1 = r2.track
                boolean r0 = r0.isReady(r1)
                return r0
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public void maybeThrowError() throws java.io.IOException {
                r2 = this;
                com.google.android.exoplayer2.source.ProgressiveMediaPeriod r0 = r2.this$0
                int r1 = r2.track
                r0.maybeThrowError(r1)
                return
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int readData(com.google.android.exoplayer2.FormatHolder r3, com.google.android.exoplayer2.decoder.DecoderInputBuffer r4, int r5) {
                r2 = this;
                com.google.android.exoplayer2.source.ProgressiveMediaPeriod r0 = r2.this$0
                int r1 = r2.track
                int r3 = r0.readData(r1, r3, r4, r5)
                return r3
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int skipData(long r3) {
                r2 = this;
                com.google.android.exoplayer2.source.ProgressiveMediaPeriod r0 = r2.this$0
                int r1 = r2.track
                int r3 = r0.skipData(r1, r3)
                return r3
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class TrackId {
        public final int id;
        public final boolean isIcyTrack;

        public TrackId(int r1, boolean r2) {
                r0 = this;
                r0.<init>()
                r0.id = r1
                r0.isIcyTrack = r2
                return
        }

        public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 == 0) goto L21
                java.lang.Class<com.google.android.exoplayer2.source.ProgressiveMediaPeriod$TrackId> r2 = com.google.android.exoplayer2.source.ProgressiveMediaPeriod.TrackId.class
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L10
                goto L21
            L10:
                com.google.android.exoplayer2.source.ProgressiveMediaPeriod$TrackId r5 = (com.google.android.exoplayer2.source.ProgressiveMediaPeriod.TrackId) r5
                int r2 = r4.id
                int r3 = r5.id
                if (r2 != r3) goto L1f
                boolean r2 = r4.isIcyTrack
                boolean r5 = r5.isIcyTrack
                if (r2 != r5) goto L1f
                goto L20
            L1f:
                r0 = 0
            L20:
                return r0
            L21:
                return r1
        }

        public int hashCode() {
                r2 = this;
                int r0 = r2.id
                int r0 = r0 * 31
                boolean r1 = r2.isIcyTrack
                int r0 = r0 + r1
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class TrackState {
        public final boolean[] trackEnabledStates;
        public final boolean[] trackIsAudioVideoFlags;
        public final boolean[] trackNotifiedDownstreamFormats;
        public final com.google.android.exoplayer2.source.TrackGroupArray tracks;

        public TrackState(com.google.android.exoplayer2.source.TrackGroupArray r1, boolean[] r2) {
                r0 = this;
                r0.<init>()
                r0.tracks = r1
                r0.trackIsAudioVideoFlags = r2
                int r1 = r1.length
                boolean[] r2 = new boolean[r1]
                r0.trackEnabledStates = r2
                boolean[] r1 = new boolean[r1]
                r0.trackNotifiedDownstreamFormats = r1
                return
        }
    }

    public static /* synthetic */ void $r8$lambda$CjLGsvCDk7eH0JF3BpHsaJTFROE(com.google.android.exoplayer2.source.ProgressiveMediaPeriod r0) {
            r0.maybeFinishPrepare()
            return
    }

    public static /* synthetic */ void $r8$lambda$DoTcjDDrboxsJ7o5SQLDx6KLo0g(com.google.android.exoplayer2.source.ProgressiveMediaPeriod r0) {
            r0.lambda$onLengthKnown$2()
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$m0ENZf_pELsA09pT-YoHvYT1tNo, reason: not valid java name */
    public static /* synthetic */ void m246$r8$lambda$m0ENZf_pELsA09pTYoHvYT1tNo(com.google.android.exoplayer2.source.ProgressiveMediaPeriod r0, com.google.android.exoplayer2.extractor.SeekMap r1) {
            r0.lambda$seekMap$1(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$zYW0OV-Fynku26QldoAc-IygyX0, reason: not valid java name */
    public static /* synthetic */ void m247$r8$lambda$zYW0OVFynku26QldoAcIygyX0(com.google.android.exoplayer2.source.ProgressiveMediaPeriod r0) {
            r0.lambda$new$0()
            return
    }

    static {
            java.util.Map r0 = createIcyMetadataHeaders()
            com.google.android.exoplayer2.source.ProgressiveMediaPeriod.ICY_METADATA_HEADERS = r0
            com.google.android.exoplayer2.Format$Builder r0 = new com.google.android.exoplayer2.Format$Builder
            r0.<init>()
            java.lang.String r1 = "icy"
            com.google.android.exoplayer2.Format$Builder r0 = r0.setId(r1)
            java.lang.String r1 = "application/x-icy"
            com.google.android.exoplayer2.Format$Builder r0 = r0.setSampleMimeType(r1)
            com.google.android.exoplayer2.Format r0 = r0.build()
            com.google.android.exoplayer2.source.ProgressiveMediaPeriod.ICY_FORMAT = r0
            return
    }

    public ProgressiveMediaPeriod(android.net.Uri r1, com.google.android.exoplayer2.upstream.DataSource r2, com.google.android.exoplayer2.source.ProgressiveMediaExtractor r3, com.google.android.exoplayer2.drm.DrmSessionManager r4, com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher r5, com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r6, com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher r7, com.google.android.exoplayer2.source.ProgressiveMediaPeriod.Listener r8, com.google.android.exoplayer2.upstream.Allocator r9, @androidx.annotation.Nullable java.lang.String r10, int r11) {
            r0 = this;
            r0.<init>()
            r0.uri = r1
            r0.dataSource = r2
            r0.drmSessionManager = r4
            r0.drmEventDispatcher = r5
            r0.loadErrorHandlingPolicy = r6
            r0.mediaSourceEventDispatcher = r7
            r0.listener = r8
            r0.allocator = r9
            r0.customCacheKey = r10
            long r1 = (long) r11
            r0.continueLoadingCheckIntervalBytes = r1
            com.google.android.exoplayer2.upstream.Loader r1 = new com.google.android.exoplayer2.upstream.Loader
            java.lang.String r2 = "ProgressiveMediaPeriod"
            r1.<init>(r2)
            r0.loader = r1
            r0.progressiveMediaExtractor = r3
            com.google.android.exoplayer2.util.ConditionVariable r1 = new com.google.android.exoplayer2.util.ConditionVariable
            r1.<init>()
            r0.loadCondition = r1
            com.google.android.exoplayer2.source.ProgressiveMediaPeriod$$ExternalSyntheticLambda0 r1 = new com.google.android.exoplayer2.source.ProgressiveMediaPeriod$$ExternalSyntheticLambda0
            r2 = 0
            r1.<init>(r0, r2)
            r0.maybeFinishPrepareRunnable = r1
            com.google.android.exoplayer2.source.ProgressiveMediaPeriod$$ExternalSyntheticLambda0 r1 = new com.google.android.exoplayer2.source.ProgressiveMediaPeriod$$ExternalSyntheticLambda0
            r3 = 1
            r1.<init>(r0, r3)
            r0.onContinueLoadingRequestedRunnable = r1
            android.os.Handler r1 = com.google.android.exoplayer2.util.Util.createHandlerForCurrentLooper()
            r0.handler = r1
            com.google.android.exoplayer2.source.ProgressiveMediaPeriod$TrackId[] r1 = new com.google.android.exoplayer2.source.ProgressiveMediaPeriod.TrackId[r2]
            r0.sampleQueueTrackIds = r1
            com.google.android.exoplayer2.source.SampleQueue[] r1 = new com.google.android.exoplayer2.source.SampleQueue[r2]
            r0.sampleQueues = r1
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.pendingResetPositionUs = r1
            r0.durationUs = r1
            r0.dataType = r3
            return
    }

    public static /* synthetic */ java.lang.Runnable access$1000(com.google.android.exoplayer2.source.ProgressiveMediaPeriod r0) {
            java.lang.Runnable r0 = r0.onContinueLoadingRequestedRunnable
            return r0
    }

    public static /* synthetic */ android.os.Handler access$1100(com.google.android.exoplayer2.source.ProgressiveMediaPeriod r0) {
            android.os.Handler r0 = r0.handler
            return r0
    }

    public static /* synthetic */ long access$1200(com.google.android.exoplayer2.source.ProgressiveMediaPeriod r2) {
            r0 = 1
            long r0 = r2.getLargestQueuedTimestampUs(r0)
            return r0
    }

    public static /* synthetic */ java.util.Map access$1300() {
            java.util.Map<java.lang.String, java.lang.String> r0 = com.google.android.exoplayer2.source.ProgressiveMediaPeriod.ICY_METADATA_HEADERS
            return r0
    }

    public static /* synthetic */ java.lang.String access$1400(com.google.android.exoplayer2.source.ProgressiveMediaPeriod r0) {
            java.lang.String r0 = r0.customCacheKey
            return r0
    }

    public static /* synthetic */ void access$600(com.google.android.exoplayer2.source.ProgressiveMediaPeriod r0) {
            r0.onLengthKnown()
            return
    }

    public static /* synthetic */ com.google.android.exoplayer2.metadata.icy.IcyHeaders access$700(com.google.android.exoplayer2.source.ProgressiveMediaPeriod r0) {
            com.google.android.exoplayer2.metadata.icy.IcyHeaders r0 = r0.icyHeaders
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.metadata.icy.IcyHeaders access$702(com.google.android.exoplayer2.source.ProgressiveMediaPeriod r0, com.google.android.exoplayer2.metadata.icy.IcyHeaders r1) {
            r0.icyHeaders = r1
            return r1
    }

    public static /* synthetic */ com.google.android.exoplayer2.Format access$800() {
            com.google.android.exoplayer2.Format r0 = com.google.android.exoplayer2.source.ProgressiveMediaPeriod.ICY_FORMAT
            return r0
    }

    public static /* synthetic */ long access$900(com.google.android.exoplayer2.source.ProgressiveMediaPeriod r2) {
            long r0 = r2.continueLoadingCheckIntervalBytes
            return r0
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"trackState", "seekMap"})
    private void assertPrepared() {
            r1 = this;
            boolean r0 = r1.prepared
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            com.google.android.exoplayer2.source.ProgressiveMediaPeriod$TrackState r0 = r1.trackState
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.extractor.SeekMap r0 = r1.seekMap
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            return
    }

    private boolean configureRetry(com.google.android.exoplayer2.source.ProgressiveMediaPeriod.ExtractingLoadable r7, int r8) {
            r6 = this;
            boolean r0 = r6.isLengthKnown
            r1 = 1
            if (r0 != 0) goto L40
            com.google.android.exoplayer2.extractor.SeekMap r0 = r6.seekMap
            if (r0 == 0) goto L17
            long r2 = r0.getDurationUs()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L17
            goto L40
        L17:
            boolean r8 = r6.prepared
            r0 = 0
            if (r8 == 0) goto L25
            boolean r8 = r6.suppressRead()
            if (r8 != 0) goto L25
            r6.pendingDeferredRetry = r1
            return r0
        L25:
            boolean r8 = r6.prepared
            r6.notifyDiscontinuity = r8
            r2 = 0
            r6.lastSeekPositionUs = r2
            r6.extractedSamplesCountAtStartOfLoad = r0
            com.google.android.exoplayer2.source.SampleQueue[] r8 = r6.sampleQueues
            int r4 = r8.length
        L32:
            if (r0 >= r4) goto L3c
            r5 = r8[r0]
            r5.reset()
            int r0 = r0 + 1
            goto L32
        L3c:
            com.google.android.exoplayer2.source.ProgressiveMediaPeriod.ExtractingLoadable.access$500(r7, r2, r2)
            return r1
        L40:
            r6.extractedSamplesCountAtStartOfLoad = r8
            return r1
    }

    private static java.util.Map<java.lang.String, java.lang.String> createIcyMetadataHeaders() {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "Icy-MetaData"
            java.lang.String r2 = "1"
            r0.put(r1, r2)
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            return r0
    }

    private int getExtractedSamplesCount() {
            r5 = this;
            com.google.android.exoplayer2.source.SampleQueue[] r0 = r5.sampleQueues
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L5:
            if (r2 >= r1) goto L11
            r4 = r0[r2]
            int r4 = r4.getWriteIndex()
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L5
        L11:
            return r3
    }

    private long getLargestQueuedTimestampUs(boolean r6) {
            r5 = this;
            r0 = -9223372036854775808
            r2 = 0
        L3:
            com.google.android.exoplayer2.source.SampleQueue[] r3 = r5.sampleQueues
            int r3 = r3.length
            if (r2 >= r3) goto L27
            if (r6 != 0) goto L18
            com.google.android.exoplayer2.source.ProgressiveMediaPeriod$TrackState r3 = r5.trackState
            java.lang.Object r3 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
            com.google.android.exoplayer2.source.ProgressiveMediaPeriod$TrackState r3 = (com.google.android.exoplayer2.source.ProgressiveMediaPeriod.TrackState) r3
            boolean[] r3 = r3.trackEnabledStates
            boolean r3 = r3[r2]
            if (r3 == 0) goto L24
        L18:
            com.google.android.exoplayer2.source.SampleQueue[] r3 = r5.sampleQueues
            r3 = r3[r2]
            long r3 = r3.getLargestQueuedTimestampUs()
            long r0 = java.lang.Math.max(r0, r3)
        L24:
            int r2 = r2 + 1
            goto L3
        L27:
            return r0
    }

    private boolean isPendingReset() {
            r5 = this;
            long r0 = r5.pendingResetPositionUs
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    private /* synthetic */ void lambda$new$0() {
            r1 = this;
            boolean r0 = r1.released
            if (r0 != 0) goto Lf
            com.google.android.exoplayer2.source.MediaPeriod$Callback r0 = r1.callback
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.source.MediaPeriod$Callback r0 = (com.google.android.exoplayer2.source.MediaPeriod.Callback) r0
            r0.onContinueLoadingRequested(r1)
        Lf:
            return
    }

    private /* synthetic */ void lambda$onLengthKnown$2() {
            r1 = this;
            r0 = 1
            r1.isLengthKnown = r0
            return
    }

    private /* synthetic */ void lambda$seekMap$1(com.google.android.exoplayer2.extractor.SeekMap r1) {
            r0 = this;
            r0.setSeekMap(r1)
            return
    }

    private void maybeFinishPrepare() {
            r11 = this;
            boolean r0 = r11.released
            if (r0 != 0) goto Ldf
            boolean r0 = r11.prepared
            if (r0 != 0) goto Ldf
            boolean r0 = r11.sampleQueuesBuilt
            if (r0 == 0) goto Ldf
            com.google.android.exoplayer2.extractor.SeekMap r0 = r11.seekMap
            if (r0 != 0) goto L12
            goto Ldf
        L12:
            com.google.android.exoplayer2.source.SampleQueue[] r0 = r11.sampleQueues
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L17:
            if (r3 >= r1) goto L25
            r4 = r0[r3]
            com.google.android.exoplayer2.Format r4 = r4.getUpstreamFormat()
            if (r4 != 0) goto L22
            return
        L22:
            int r3 = r3 + 1
            goto L17
        L25:
            com.google.android.exoplayer2.util.ConditionVariable r0 = r11.loadCondition
            r0.close()
            com.google.android.exoplayer2.source.SampleQueue[] r0 = r11.sampleQueues
            int r0 = r0.length
            com.google.android.exoplayer2.source.TrackGroup[] r1 = new com.google.android.exoplayer2.source.TrackGroup[r0]
            boolean[] r3 = new boolean[r0]
            r4 = 0
        L32:
            r5 = 1
            if (r4 >= r0) goto Lc6
            com.google.android.exoplayer2.source.SampleQueue[] r6 = r11.sampleQueues
            r6 = r6[r4]
            com.google.android.exoplayer2.Format r6 = r6.getUpstreamFormat()
            java.lang.Object r6 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r6)
            com.google.android.exoplayer2.Format r6 = (com.google.android.exoplayer2.Format) r6
            java.lang.String r7 = r6.sampleMimeType
            boolean r8 = com.google.android.exoplayer2.util.MimeTypes.isAudio(r7)
            if (r8 != 0) goto L54
            boolean r7 = com.google.android.exoplayer2.util.MimeTypes.isVideo(r7)
            if (r7 == 0) goto L52
            goto L54
        L52:
            r7 = 0
            goto L55
        L54:
            r7 = 1
        L55:
            r3[r4] = r7
            boolean r9 = r11.haveAudioVideoTracks
            r7 = r7 | r9
            r11.haveAudioVideoTracks = r7
            com.google.android.exoplayer2.metadata.icy.IcyHeaders r7 = r11.icyHeaders
            if (r7 == 0) goto La9
            if (r8 != 0) goto L6a
            com.google.android.exoplayer2.source.ProgressiveMediaPeriod$TrackId[] r9 = r11.sampleQueueTrackIds
            r9 = r9[r4]
            boolean r9 = r9.isIcyTrack
            if (r9 == 0) goto L8c
        L6a:
            com.google.android.exoplayer2.metadata.Metadata r9 = r6.metadata
            if (r9 != 0) goto L78
            com.google.android.exoplayer2.metadata.Metadata r9 = new com.google.android.exoplayer2.metadata.Metadata
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r10 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r5]
            r10[r2] = r7
            r9.<init>(r10)
            goto L80
        L78:
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r10 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r5]
            r10[r2] = r7
            com.google.android.exoplayer2.metadata.Metadata r9 = r9.copyWithAppendedEntries(r10)
        L80:
            com.google.android.exoplayer2.Format$Builder r6 = r6.buildUpon()
            com.google.android.exoplayer2.Format$Builder r6 = r6.setMetadata(r9)
            com.google.android.exoplayer2.Format r6 = r6.build()
        L8c:
            if (r8 == 0) goto La9
            int r8 = r6.averageBitrate
            r9 = -1
            if (r8 != r9) goto La9
            int r8 = r6.peakBitrate
            if (r8 != r9) goto La9
            int r8 = r7.bitrate
            if (r8 == r9) goto La9
            com.google.android.exoplayer2.Format$Builder r6 = r6.buildUpon()
            int r7 = r7.bitrate
            com.google.android.exoplayer2.Format$Builder r6 = r6.setAverageBitrate(r7)
            com.google.android.exoplayer2.Format r6 = r6.build()
        La9:
            com.google.android.exoplayer2.drm.DrmSessionManager r7 = r11.drmSessionManager
            int r7 = r7.getCryptoType(r6)
            com.google.android.exoplayer2.Format r6 = r6.copyWithCryptoType(r7)
            com.google.android.exoplayer2.source.TrackGroup r7 = new com.google.android.exoplayer2.source.TrackGroup
            java.lang.String r8 = java.lang.Integer.toString(r4)
            com.google.android.exoplayer2.Format[] r5 = new com.google.android.exoplayer2.Format[r5]
            r5[r2] = r6
            r7.<init>(r8, r5)
            r1[r4] = r7
            int r4 = r4 + 1
            goto L32
        Lc6:
            com.google.android.exoplayer2.source.ProgressiveMediaPeriod$TrackState r0 = new com.google.android.exoplayer2.source.ProgressiveMediaPeriod$TrackState
            com.google.android.exoplayer2.source.TrackGroupArray r2 = new com.google.android.exoplayer2.source.TrackGroupArray
            r2.<init>(r1)
            r0.<init>(r2, r3)
            r11.trackState = r0
            r11.prepared = r5
            com.google.android.exoplayer2.source.MediaPeriod$Callback r0 = r11.callback
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.source.MediaPeriod$Callback r0 = (com.google.android.exoplayer2.source.MediaPeriod.Callback) r0
            r0.onPrepared(r11)
        Ldf:
            return
    }

    private void maybeNotifyDownstreamFormat(int r11) {
            r10 = this;
            r10.assertPrepared()
            com.google.android.exoplayer2.source.ProgressiveMediaPeriod$TrackState r0 = r10.trackState
            boolean[] r1 = r0.trackNotifiedDownstreamFormats
            boolean r2 = r1[r11]
            if (r2 != 0) goto L28
            com.google.android.exoplayer2.source.TrackGroupArray r0 = r0.tracks
            com.google.android.exoplayer2.source.TrackGroup r0 = r0.get(r11)
            r2 = 0
            com.google.android.exoplayer2.Format r5 = r0.getFormat(r2)
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r3 = r10.mediaSourceEventDispatcher
            java.lang.String r0 = r5.sampleMimeType
            int r4 = com.google.android.exoplayer2.util.MimeTypes.getTrackType(r0)
            r6 = 0
            r7 = 0
            long r8 = r10.lastSeekPositionUs
            r3.downstreamFormatChanged(r4, r5, r6, r7, r8)
            r0 = 1
            r1[r11] = r0
        L28:
            return
    }

    private void maybeStartDeferredRetry(int r4) {
            r3 = this;
            r3.assertPrepared()
            com.google.android.exoplayer2.source.ProgressiveMediaPeriod$TrackState r0 = r3.trackState
            boolean[] r0 = r0.trackIsAudioVideoFlags
            boolean r1 = r3.pendingDeferredRetry
            if (r1 == 0) goto L40
            boolean r0 = r0[r4]
            if (r0 == 0) goto L40
            com.google.android.exoplayer2.source.SampleQueue[] r0 = r3.sampleQueues
            r4 = r0[r4]
            r0 = 0
            boolean r4 = r4.isReady(r0)
            if (r4 == 0) goto L1b
            goto L40
        L1b:
            r1 = 0
            r3.pendingResetPositionUs = r1
            r3.pendingDeferredRetry = r0
            r4 = 1
            r3.notifyDiscontinuity = r4
            r3.lastSeekPositionUs = r1
            r3.extractedSamplesCountAtStartOfLoad = r0
            com.google.android.exoplayer2.source.SampleQueue[] r4 = r3.sampleQueues
            int r1 = r4.length
        L2b:
            if (r0 >= r1) goto L35
            r2 = r4[r0]
            r2.reset()
            int r0 = r0 + 1
            goto L2b
        L35:
            com.google.android.exoplayer2.source.MediaPeriod$Callback r4 = r3.callback
            java.lang.Object r4 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r4)
            com.google.android.exoplayer2.source.MediaPeriod$Callback r4 = (com.google.android.exoplayer2.source.MediaPeriod.Callback) r4
            r4.onContinueLoadingRequested(r3)
        L40:
            return
    }

    private void onLengthKnown() {
            r3 = this;
            android.os.Handler r0 = r3.handler
            com.google.android.exoplayer2.source.ProgressiveMediaPeriod$$ExternalSyntheticLambda0 r1 = new com.google.android.exoplayer2.source.ProgressiveMediaPeriod$$ExternalSyntheticLambda0
            r2 = 2
            r1.<init>(r3, r2)
            r0.post(r1)
            return
    }

    private com.google.android.exoplayer2.extractor.TrackOutput prepareTrackOutput(com.google.android.exoplayer2.source.ProgressiveMediaPeriod.TrackId r5) {
            r4 = this;
            com.google.android.exoplayer2.source.SampleQueue[] r0 = r4.sampleQueues
            int r0 = r0.length
            r1 = 0
        L4:
            if (r1 >= r0) goto L18
            com.google.android.exoplayer2.source.ProgressiveMediaPeriod$TrackId[] r2 = r4.sampleQueueTrackIds
            r2 = r2[r1]
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L15
            com.google.android.exoplayer2.source.SampleQueue[] r5 = r4.sampleQueues
            r5 = r5[r1]
            return r5
        L15:
            int r1 = r1 + 1
            goto L4
        L18:
            com.google.android.exoplayer2.upstream.Allocator r1 = r4.allocator
            com.google.android.exoplayer2.drm.DrmSessionManager r2 = r4.drmSessionManager
            com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r3 = r4.drmEventDispatcher
            com.google.android.exoplayer2.source.SampleQueue r1 = com.google.android.exoplayer2.source.SampleQueue.createWithDrm(r1, r2, r3)
            r1.setUpstreamFormatChangeListener(r4)
            com.google.android.exoplayer2.source.ProgressiveMediaPeriod$TrackId[] r2 = r4.sampleQueueTrackIds
            int r3 = r0 + 1
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            com.google.android.exoplayer2.source.ProgressiveMediaPeriod$TrackId[] r2 = (com.google.android.exoplayer2.source.ProgressiveMediaPeriod.TrackId[]) r2
            r2[r0] = r5
            java.lang.Object[] r5 = com.google.android.exoplayer2.util.Util.castNonNullTypeArray(r2)
            com.google.android.exoplayer2.source.ProgressiveMediaPeriod$TrackId[] r5 = (com.google.android.exoplayer2.source.ProgressiveMediaPeriod.TrackId[]) r5
            r4.sampleQueueTrackIds = r5
            com.google.android.exoplayer2.source.SampleQueue[] r5 = r4.sampleQueues
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r3)
            com.google.android.exoplayer2.source.SampleQueue[] r5 = (com.google.android.exoplayer2.source.SampleQueue[]) r5
            r5[r0] = r1
            java.lang.Object[] r5 = com.google.android.exoplayer2.util.Util.castNonNullTypeArray(r5)
            com.google.android.exoplayer2.source.SampleQueue[] r5 = (com.google.android.exoplayer2.source.SampleQueue[]) r5
            r4.sampleQueues = r5
            return r1
    }

    private boolean seekInsideBufferUs(boolean[] r5, long r6) {
            r4 = this;
            com.google.android.exoplayer2.source.SampleQueue[] r0 = r4.sampleQueues
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L5:
            if (r2 >= r0) goto L1d
            com.google.android.exoplayer2.source.SampleQueue[] r3 = r4.sampleQueues
            r3 = r3[r2]
            boolean r3 = r3.seekTo(r6, r1)
            if (r3 != 0) goto L1a
            boolean r3 = r5[r2]
            if (r3 != 0) goto L19
            boolean r3 = r4.haveAudioVideoTracks
            if (r3 != 0) goto L1a
        L19:
            return r1
        L1a:
            int r2 = r2 + 1
            goto L5
        L1d:
            r5 = 1
            return r5
    }

    private void setSeekMap(com.google.android.exoplayer2.extractor.SeekMap r7) {
            r6 = this;
            com.google.android.exoplayer2.metadata.icy.IcyHeaders r0 = r6.icyHeaders
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 != 0) goto Lb
            r0 = r7
            goto L10
        Lb:
            com.google.android.exoplayer2.extractor.SeekMap$Unseekable r0 = new com.google.android.exoplayer2.extractor.SeekMap$Unseekable
            r0.<init>(r1)
        L10:
            r6.seekMap = r0
            long r3 = r7.getDurationUs()
            r6.durationUs = r3
            boolean r0 = r6.isLengthKnown
            r3 = 1
            if (r0 != 0) goto L27
            long r4 = r7.getDurationUs()
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L27
            r0 = 1
            goto L28
        L27:
            r0 = 0
        L28:
            r6.isLive = r0
            if (r0 == 0) goto L2d
            r3 = 7
        L2d:
            r6.dataType = r3
            com.google.android.exoplayer2.source.ProgressiveMediaPeriod$Listener r0 = r6.listener
            long r1 = r6.durationUs
            boolean r7 = r7.isSeekable()
            boolean r3 = r6.isLive
            r0.onSourceInfoRefreshed(r1, r7, r3)
            boolean r7 = r6.prepared
            if (r7 != 0) goto L43
            r6.maybeFinishPrepare()
        L43:
            return
    }

    private void startLoading() {
            r26 = this;
            r7 = r26
            com.google.android.exoplayer2.source.ProgressiveMediaPeriod$ExtractingLoadable r8 = new com.google.android.exoplayer2.source.ProgressiveMediaPeriod$ExtractingLoadable
            android.net.Uri r2 = r7.uri
            com.google.android.exoplayer2.upstream.DataSource r3 = r7.dataSource
            com.google.android.exoplayer2.source.ProgressiveMediaExtractor r4 = r7.progressiveMediaExtractor
            com.google.android.exoplayer2.util.ConditionVariable r6 = r7.loadCondition
            r0 = r8
            r1 = r26
            r5 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6)
            boolean r0 = r7.prepared
            if (r0 == 0) goto L5f
            boolean r0 = r26.isPendingReset()
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            long r0 = r7.durationUs
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L36
            long r4 = r7.pendingResetPositionUs
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 <= 0) goto L36
            r0 = 1
            r7.loadingFinished = r0
            r7.pendingResetPositionUs = r2
            return
        L36:
            com.google.android.exoplayer2.extractor.SeekMap r0 = r7.seekMap
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.extractor.SeekMap r0 = (com.google.android.exoplayer2.extractor.SeekMap) r0
            long r4 = r7.pendingResetPositionUs
            com.google.android.exoplayer2.extractor.SeekMap$SeekPoints r0 = r0.getSeekPoints(r4)
            com.google.android.exoplayer2.extractor.SeekPoint r0 = r0.first
            long r0 = r0.position
            long r4 = r7.pendingResetPositionUs
            com.google.android.exoplayer2.source.ProgressiveMediaPeriod.ExtractingLoadable.access$500(r8, r0, r4)
            com.google.android.exoplayer2.source.SampleQueue[] r0 = r7.sampleQueues
            int r1 = r0.length
            r4 = 0
        L51:
            if (r4 >= r1) goto L5d
            r5 = r0[r4]
            long r9 = r7.pendingResetPositionUs
            r5.setStartTimeUs(r9)
            int r4 = r4 + 1
            goto L51
        L5d:
            r7.pendingResetPositionUs = r2
        L5f:
            int r0 = r26.getExtractedSamplesCount()
            r7.extractedSamplesCountAtStartOfLoad = r0
            com.google.android.exoplayer2.upstream.Loader r0 = r7.loader
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r1 = r7.loadErrorHandlingPolicy
            int r2 = r7.dataType
            int r1 = r1.getMinimumLoadableRetryCount(r2)
            long r13 = r0.startLoading(r8, r7, r1)
            com.google.android.exoplayer2.upstream.DataSpec r12 = com.google.android.exoplayer2.source.ProgressiveMediaPeriod.ExtractingLoadable.access$300(r8)
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r15 = r7.mediaSourceEventDispatcher
            com.google.android.exoplayer2.source.LoadEventInfo r16 = new com.google.android.exoplayer2.source.LoadEventInfo
            long r10 = com.google.android.exoplayer2.source.ProgressiveMediaPeriod.ExtractingLoadable.access$200(r8)
            r9 = r16
            r9.<init>(r10, r12, r13)
            r17 = 1
            r18 = -1
            r19 = 0
            r20 = 0
            r21 = 0
            long r22 = com.google.android.exoplayer2.source.ProgressiveMediaPeriod.ExtractingLoadable.access$400(r8)
            long r0 = r7.durationUs
            r24 = r0
            r15.loadStarted(r16, r17, r18, r19, r20, r21, r22, r24)
            return
    }

    private boolean suppressRead() {
            r1 = this;
            boolean r0 = r1.notifyDiscontinuity
            if (r0 != 0) goto Ld
            boolean r0 = r1.isPendingReset()
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long r1) {
            r0 = this;
            boolean r1 = r0.loadingFinished
            if (r1 != 0) goto L2c
            com.google.android.exoplayer2.upstream.Loader r1 = r0.loader
            boolean r1 = r1.hasFatalError()
            if (r1 != 0) goto L2c
            boolean r1 = r0.pendingDeferredRetry
            if (r1 != 0) goto L2c
            boolean r1 = r0.prepared
            if (r1 == 0) goto L19
            int r1 = r0.enabledTrackCount
            if (r1 != 0) goto L19
            goto L2c
        L19:
            com.google.android.exoplayer2.util.ConditionVariable r1 = r0.loadCondition
            boolean r1 = r1.open()
            com.google.android.exoplayer2.upstream.Loader r2 = r0.loader
            boolean r2 = r2.isLoading()
            if (r2 != 0) goto L2b
            r0.startLoading()
            r1 = 1
        L2b:
            return r1
        L2c:
            r1 = 0
            return r1
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void discardBuffer(long r6, boolean r8) {
            r5 = this;
            r5.assertPrepared()
            boolean r0 = r5.isPendingReset()
            if (r0 == 0) goto La
            return
        La:
            com.google.android.exoplayer2.source.ProgressiveMediaPeriod$TrackState r0 = r5.trackState
            boolean[] r0 = r0.trackEnabledStates
            com.google.android.exoplayer2.source.SampleQueue[] r1 = r5.sampleQueues
            int r1 = r1.length
            r2 = 0
        L12:
            if (r2 >= r1) goto L20
            com.google.android.exoplayer2.source.SampleQueue[] r3 = r5.sampleQueues
            r3 = r3[r2]
            boolean r4 = r0[r2]
            r3.discardTo(r6, r8, r4)
            int r2 = r2 + 1
            goto L12
        L20:
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public void endTracks() {
            r2 = this;
            r0 = 1
            r2.sampleQueuesBuilt = r0
            android.os.Handler r0 = r2.handler
            java.lang.Runnable r1 = r2.maybeFinishPrepareRunnable
            r0.post(r1)
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long r10, com.google.android.exoplayer2.SeekParameters r12) {
            r9 = this;
            r9.assertPrepared()
            com.google.android.exoplayer2.extractor.SeekMap r0 = r9.seekMap
            boolean r0 = r0.isSeekable()
            if (r0 != 0) goto Le
            r10 = 0
            return r10
        Le:
            com.google.android.exoplayer2.extractor.SeekMap r0 = r9.seekMap
            com.google.android.exoplayer2.extractor.SeekMap$SeekPoints r0 = r0.getSeekPoints(r10)
            com.google.android.exoplayer2.extractor.SeekPoint r1 = r0.first
            long r5 = r1.timeUs
            com.google.android.exoplayer2.extractor.SeekPoint r0 = r0.second
            long r7 = r0.timeUs
            r2 = r12
            r3 = r10
            long r10 = r2.resolveSeekPositionUs(r3, r5, r7)
            return r10
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
            r11 = this;
            r11.assertPrepared()
            boolean r0 = r11.loadingFinished
            r1 = -9223372036854775808
            if (r0 != 0) goto L5f
            int r0 = r11.enabledTrackCount
            if (r0 != 0) goto Le
            goto L5f
        Le:
            boolean r0 = r11.isPendingReset()
            if (r0 == 0) goto L17
            long r0 = r11.pendingResetPositionUs
            return r0
        L17:
            boolean r0 = r11.haveAudioVideoTracks
            r3 = 0
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 == 0) goto L4f
            com.google.android.exoplayer2.source.SampleQueue[] r0 = r11.sampleQueues
            int r0 = r0.length
            r7 = r4
            r6 = 0
        L26:
            if (r6 >= r0) goto L50
            com.google.android.exoplayer2.source.ProgressiveMediaPeriod$TrackState r9 = r11.trackState
            boolean[] r10 = r9.trackIsAudioVideoFlags
            boolean r10 = r10[r6]
            if (r10 == 0) goto L4c
            boolean[] r9 = r9.trackEnabledStates
            boolean r9 = r9[r6]
            if (r9 == 0) goto L4c
            com.google.android.exoplayer2.source.SampleQueue[] r9 = r11.sampleQueues
            r9 = r9[r6]
            boolean r9 = r9.isLastSampleQueued()
            if (r9 != 0) goto L4c
            com.google.android.exoplayer2.source.SampleQueue[] r9 = r11.sampleQueues
            r9 = r9[r6]
            long r9 = r9.getLargestQueuedTimestampUs()
            long r7 = java.lang.Math.min(r7, r9)
        L4c:
            int r6 = r6 + 1
            goto L26
        L4f:
            r7 = r4
        L50:
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 != 0) goto L58
            long r7 = r11.getLargestQueuedTimestampUs(r3)
        L58:
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L5e
            long r7 = r11.lastSeekPositionUs
        L5e:
            return r7
        L5f:
            return r1
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
            r2 = this;
            long r0 = r2.getBufferedPositionUs()
            return r0
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public final /* synthetic */ java.util.List getStreamKeys(java.util.List r1) {
            r0 = this;
            java.util.List r1 = com.google.android.exoplayer2.source.MediaPeriod.CC.$default$getStreamKeys(r0, r1)
            return r1
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public com.google.android.exoplayer2.source.TrackGroupArray getTrackGroups() {
            r1 = this;
            r1.assertPrepared()
            com.google.android.exoplayer2.source.ProgressiveMediaPeriod$TrackState r0 = r1.trackState
            com.google.android.exoplayer2.source.TrackGroupArray r0 = r0.tracks
            return r0
    }

    public final com.google.android.exoplayer2.extractor.TrackOutput icyTrack() {
            r3 = this;
            com.google.android.exoplayer2.source.ProgressiveMediaPeriod$TrackId r0 = new com.google.android.exoplayer2.source.ProgressiveMediaPeriod$TrackId
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2)
            com.google.android.exoplayer2.extractor.TrackOutput r0 = r3.prepareTrackOutput(r0)
            return r0
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean isLoading() {
            r1 = this;
            com.google.android.exoplayer2.upstream.Loader r0 = r1.loader
            boolean r0 = r0.isLoading()
            if (r0 == 0) goto L12
            com.google.android.exoplayer2.util.ConditionVariable r0 = r1.loadCondition
            boolean r0 = r0.isOpen()
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    public final boolean isReady(int r2) {
            r1 = this;
            boolean r0 = r1.suppressRead()
            if (r0 != 0) goto L14
            com.google.android.exoplayer2.source.SampleQueue[] r0 = r1.sampleQueues
            r2 = r0[r2]
            boolean r0 = r1.loadingFinished
            boolean r2 = r2.isReady(r0)
            if (r2 == 0) goto L14
            r2 = 1
            goto L15
        L14:
            r2 = 0
        L15:
            return r2
    }

    public final void maybeThrowError(int r3) throws java.io.IOException {
            r2 = this;
            com.google.android.exoplayer2.source.SampleQueue[] r0 = r2.sampleQueues
            r3 = r0[r3]
            r3.maybeThrowError()
            com.google.android.exoplayer2.upstream.Loader r3 = r2.loader
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r0 = r2.loadErrorHandlingPolicy
            int r1 = r2.dataType
            int r0 = r0.getMinimumLoadableRetryCount(r1)
            r3.maybeThrowError(r0)
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void maybeThrowPrepareError() throws java.io.IOException {
            r3 = this;
            com.google.android.exoplayer2.upstream.Loader r0 = r3.loader
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r1 = r3.loadErrorHandlingPolicy
            int r2 = r3.dataType
            int r1 = r1.getMinimumLoadableRetryCount(r2)
            r0.maybeThrowError(r1)
            boolean r0 = r3.loadingFinished
            if (r0 == 0) goto L1e
            boolean r0 = r3.prepared
            if (r0 == 0) goto L16
            goto L1e
        L16:
            r0 = 0
            java.lang.String r1 = "Loading finished before preparation is complete."
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r1, r0)
            throw r0
        L1e:
            return
    }

    public void onLoadCanceled(com.google.android.exoplayer2.source.ProgressiveMediaPeriod.ExtractingLoadable r16, long r17, long r19, boolean r21) {
            r15 = this;
            r0 = r15
            com.google.android.exoplayer2.upstream.StatsDataSource r1 = com.google.android.exoplayer2.source.ProgressiveMediaPeriod.ExtractingLoadable.access$100(r16)
            com.google.android.exoplayer2.source.LoadEventInfo r14 = new com.google.android.exoplayer2.source.LoadEventInfo
            long r3 = com.google.android.exoplayer2.source.ProgressiveMediaPeriod.ExtractingLoadable.access$200(r16)
            com.google.android.exoplayer2.upstream.DataSpec r5 = com.google.android.exoplayer2.source.ProgressiveMediaPeriod.ExtractingLoadable.access$300(r16)
            android.net.Uri r6 = r1.getLastOpenedUri()
            java.util.Map r7 = r1.getLastResponseHeaders()
            long r12 = r1.getBytesRead()
            r2 = r14
            r8 = r17
            r10 = r19
            r2.<init>(r3, r5, r6, r7, r8, r10, r12)
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r1 = r0.loadErrorHandlingPolicy
            long r2 = com.google.android.exoplayer2.source.ProgressiveMediaPeriod.ExtractingLoadable.access$200(r16)
            r1.onLoadTaskConcluded(r2)
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r2 = r0.mediaSourceEventDispatcher
            long r9 = com.google.android.exoplayer2.source.ProgressiveMediaPeriod.ExtractingLoadable.access$400(r16)
            long r11 = r0.durationUs
            r4 = 1
            r5 = -1
            r6 = 0
            r7 = 0
            r8 = 0
            r3 = r14
            r2.loadCanceled(r3, r4, r5, r6, r7, r8, r9, r11)
            if (r21 != 0) goto L5c
            com.google.android.exoplayer2.source.SampleQueue[] r1 = r0.sampleQueues
            int r2 = r1.length
            r3 = 0
        L43:
            if (r3 >= r2) goto L4d
            r4 = r1[r3]
            r4.reset()
            int r3 = r3 + 1
            goto L43
        L4d:
            int r1 = r0.enabledTrackCount
            if (r1 <= 0) goto L5c
            com.google.android.exoplayer2.source.MediaPeriod$Callback r1 = r0.callback
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            com.google.android.exoplayer2.source.MediaPeriod$Callback r1 = (com.google.android.exoplayer2.source.MediaPeriod.Callback) r1
            r1.onContinueLoadingRequested(r15)
        L5c:
            return
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public /* bridge */ /* synthetic */ void onLoadCanceled(com.google.android.exoplayer2.upstream.Loader.Loadable r1, long r2, long r4, boolean r6) {
            r0 = this;
            com.google.android.exoplayer2.source.ProgressiveMediaPeriod$ExtractingLoadable r1 = (com.google.android.exoplayer2.source.ProgressiveMediaPeriod.ExtractingLoadable) r1
            r0.onLoadCanceled(r1, r2, r4, r6)
            return
    }

    public void onLoadCompleted(com.google.android.exoplayer2.source.ProgressiveMediaPeriod.ExtractingLoadable r17, long r18, long r20) {
            r16 = this;
            r0 = r16
            long r1 = r0.durationUs
            r3 = 1
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 != 0) goto L2f
            com.google.android.exoplayer2.extractor.SeekMap r1 = r0.seekMap
            if (r1 == 0) goto L2f
            boolean r1 = r1.isSeekable()
            long r4 = r0.getLargestQueuedTimestampUs(r3)
            r6 = -9223372036854775808
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto L23
            r4 = 0
            goto L26
        L23:
            r6 = 10000(0x2710, double:4.9407E-320)
            long r4 = r4 + r6
        L26:
            r0.durationUs = r4
            com.google.android.exoplayer2.source.ProgressiveMediaPeriod$Listener r2 = r0.listener
            boolean r6 = r0.isLive
            r2.onSourceInfoRefreshed(r4, r1, r6)
        L2f:
            com.google.android.exoplayer2.upstream.StatsDataSource r1 = com.google.android.exoplayer2.source.ProgressiveMediaPeriod.ExtractingLoadable.access$100(r17)
            com.google.android.exoplayer2.source.LoadEventInfo r2 = new com.google.android.exoplayer2.source.LoadEventInfo
            long r5 = com.google.android.exoplayer2.source.ProgressiveMediaPeriod.ExtractingLoadable.access$200(r17)
            com.google.android.exoplayer2.upstream.DataSpec r7 = com.google.android.exoplayer2.source.ProgressiveMediaPeriod.ExtractingLoadable.access$300(r17)
            android.net.Uri r8 = r1.getLastOpenedUri()
            java.util.Map r9 = r1.getLastResponseHeaders()
            long r14 = r1.getBytesRead()
            r4 = r2
            r10 = r18
            r12 = r20
            r4.<init>(r5, r7, r8, r9, r10, r12, r14)
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r1 = r0.loadErrorHandlingPolicy
            long r4 = com.google.android.exoplayer2.source.ProgressiveMediaPeriod.ExtractingLoadable.access$200(r17)
            r1.onLoadTaskConcluded(r4)
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r4 = r0.mediaSourceEventDispatcher
            r6 = 1
            r7 = -1
            r8 = 0
            r9 = 0
            r10 = 0
            long r11 = com.google.android.exoplayer2.source.ProgressiveMediaPeriod.ExtractingLoadable.access$400(r17)
            long r13 = r0.durationUs
            r5 = r2
            r4.loadCompleted(r5, r6, r7, r8, r9, r10, r11, r13)
            r0.loadingFinished = r3
            com.google.android.exoplayer2.source.MediaPeriod$Callback r1 = r0.callback
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            com.google.android.exoplayer2.source.MediaPeriod$Callback r1 = (com.google.android.exoplayer2.source.MediaPeriod.Callback) r1
            r1.onContinueLoadingRequested(r0)
            return
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public /* bridge */ /* synthetic */ void onLoadCompleted(com.google.android.exoplayer2.upstream.Loader.Loadable r1, long r2, long r4) {
            r0 = this;
            com.google.android.exoplayer2.source.ProgressiveMediaPeriod$ExtractingLoadable r1 = (com.google.android.exoplayer2.source.ProgressiveMediaPeriod.ExtractingLoadable) r1
            r0.onLoadCompleted(r1, r2, r4)
            return
    }

    public com.google.android.exoplayer2.upstream.Loader.LoadErrorAction onLoadError(com.google.android.exoplayer2.source.ProgressiveMediaPeriod.ExtractingLoadable r26, long r27, long r29, java.io.IOException r31, int r32) {
            r25 = this;
            r0 = r25
            com.google.android.exoplayer2.upstream.StatsDataSource r1 = com.google.android.exoplayer2.source.ProgressiveMediaPeriod.ExtractingLoadable.access$100(r26)
            com.google.android.exoplayer2.source.LoadEventInfo r14 = new com.google.android.exoplayer2.source.LoadEventInfo
            long r3 = com.google.android.exoplayer2.source.ProgressiveMediaPeriod.ExtractingLoadable.access$200(r26)
            com.google.android.exoplayer2.upstream.DataSpec r5 = com.google.android.exoplayer2.source.ProgressiveMediaPeriod.ExtractingLoadable.access$300(r26)
            android.net.Uri r6 = r1.getLastOpenedUri()
            java.util.Map r7 = r1.getLastResponseHeaders()
            long r12 = r1.getBytesRead()
            r2 = r14
            r8 = r27
            r10 = r29
            r2.<init>(r3, r5, r6, r7, r8, r10, r12)
            com.google.android.exoplayer2.source.MediaLoadData r1 = new com.google.android.exoplayer2.source.MediaLoadData
            long r2 = com.google.android.exoplayer2.source.ProgressiveMediaPeriod.ExtractingLoadable.access$400(r26)
            long r21 = com.google.android.exoplayer2.util.Util.usToMs(r2)
            long r2 = r0.durationUs
            long r23 = com.google.android.exoplayer2.util.Util.usToMs(r2)
            r16 = 1
            r17 = -1
            r18 = 0
            r19 = 0
            r20 = 0
            r15 = r1
            r15.<init>(r16, r17, r18, r19, r20, r21, r23)
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r2 = r0.loadErrorHandlingPolicy
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy$LoadErrorInfo r3 = new com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy$LoadErrorInfo
            r13 = r31
            r4 = r32
            r3.<init>(r14, r1, r13, r4)
            long r1 = r2.getRetryDelayMsFor(r3)
            r3 = 1
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 != 0) goto L60
            com.google.android.exoplayer2.upstream.Loader$LoadErrorAction r1 = com.google.android.exoplayer2.upstream.Loader.DONT_RETRY_FATAL
            r15 = r26
            goto L7c
        L60:
            int r4 = r25.getExtractedSamplesCount()
            int r5 = r0.extractedSamplesCountAtStartOfLoad
            if (r4 <= r5) goto L6c
            r15 = r26
            r5 = 1
            goto L6f
        L6c:
            r5 = 0
            r15 = r26
        L6f:
            boolean r4 = r0.configureRetry(r15, r4)
            if (r4 == 0) goto L7a
            com.google.android.exoplayer2.upstream.Loader$LoadErrorAction r1 = com.google.android.exoplayer2.upstream.Loader.createRetryAction(r5, r1)
            goto L7c
        L7a:
            com.google.android.exoplayer2.upstream.Loader$LoadErrorAction r1 = com.google.android.exoplayer2.upstream.Loader.DONT_RETRY
        L7c:
            boolean r2 = r1.isRetry()
            r16 = r2 ^ 1
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r2 = r0.mediaSourceEventDispatcher
            r4 = 1
            r5 = -1
            r6 = 0
            r7 = 0
            r8 = 0
            long r9 = com.google.android.exoplayer2.source.ProgressiveMediaPeriod.ExtractingLoadable.access$400(r26)
            long r11 = r0.durationUs
            r3 = r14
            r13 = r31
            r14 = r16
            r2.loadError(r3, r4, r5, r6, r7, r8, r9, r11, r13, r14)
            if (r16 == 0) goto La2
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r2 = r0.loadErrorHandlingPolicy
            long r3 = com.google.android.exoplayer2.source.ProgressiveMediaPeriod.ExtractingLoadable.access$200(r26)
            r2.onLoadTaskConcluded(r3)
        La2:
            return r1
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public /* bridge */ /* synthetic */ com.google.android.exoplayer2.upstream.Loader.LoadErrorAction onLoadError(com.google.android.exoplayer2.upstream.Loader.Loadable r1, long r2, long r4, java.io.IOException r6, int r7) {
            r0 = this;
            com.google.android.exoplayer2.source.ProgressiveMediaPeriod$ExtractingLoadable r1 = (com.google.android.exoplayer2.source.ProgressiveMediaPeriod.ExtractingLoadable) r1
            com.google.android.exoplayer2.upstream.Loader$LoadErrorAction r1 = r0.onLoadError(r1, r2, r4, r6, r7)
            return r1
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.ReleaseCallback
    public void onLoaderReleased() {
            r4 = this;
            com.google.android.exoplayer2.source.SampleQueue[] r0 = r4.sampleQueues
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 >= r1) goto Le
            r3 = r0[r2]
            r3.release()
            int r2 = r2 + 1
            goto L4
        Le:
            com.google.android.exoplayer2.source.ProgressiveMediaExtractor r0 = r4.progressiveMediaExtractor
            r0.release()
            return
    }

    @Override // com.google.android.exoplayer2.source.SampleQueue.UpstreamFormatChangedListener
    public void onUpstreamFormatChanged(com.google.android.exoplayer2.Format r2) {
            r1 = this;
            android.os.Handler r2 = r1.handler
            java.lang.Runnable r0 = r1.maybeFinishPrepareRunnable
            r2.post(r0)
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void prepare(com.google.android.exoplayer2.source.MediaPeriod.Callback r1, long r2) {
            r0 = this;
            r0.callback = r1
            com.google.android.exoplayer2.util.ConditionVariable r1 = r0.loadCondition
            r1.open()
            r0.startLoading()
            return
    }

    public final int readData(int r4, com.google.android.exoplayer2.FormatHolder r5, com.google.android.exoplayer2.decoder.DecoderInputBuffer r6, int r7) {
            r3 = this;
            boolean r0 = r3.suppressRead()
            r1 = -3
            if (r0 == 0) goto L8
            return r1
        L8:
            r3.maybeNotifyDownstreamFormat(r4)
            com.google.android.exoplayer2.source.SampleQueue[] r0 = r3.sampleQueues
            r0 = r0[r4]
            boolean r2 = r3.loadingFinished
            int r5 = r0.read(r5, r6, r7, r2)
            if (r5 != r1) goto L1a
            r3.maybeStartDeferredRetry(r4)
        L1a:
            return r5
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long readDiscontinuity() {
            r2 = this;
            boolean r0 = r2.notifyDiscontinuity
            if (r0 == 0) goto L16
            boolean r0 = r2.loadingFinished
            if (r0 != 0) goto L10
            int r0 = r2.getExtractedSamplesCount()
            int r1 = r2.extractedSamplesCountAtStartOfLoad
            if (r0 <= r1) goto L16
        L10:
            r0 = 0
            r2.notifyDiscontinuity = r0
            long r0 = r2.lastSeekPositionUs
            return r0
        L16:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            return r0
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long r1) {
            r0 = this;
            return
    }

    public void release() {
            r4 = this;
            boolean r0 = r4.prepared
            if (r0 == 0) goto L12
            com.google.android.exoplayer2.source.SampleQueue[] r0 = r4.sampleQueues
            int r1 = r0.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            r3.preRelease()
            int r2 = r2 + 1
            goto L8
        L12:
            com.google.android.exoplayer2.upstream.Loader r0 = r4.loader
            r0.release(r4)
            android.os.Handler r0 = r4.handler
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            r4.callback = r1
            r0 = 1
            r4.released = r0
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public void seekMap(com.google.android.exoplayer2.extractor.SeekMap r3) {
            r2 = this;
            android.os.Handler r0 = r2.handler
            com.google.android.exoplayer2.source.ProgressiveMediaPeriod$$ExternalSyntheticLambda1 r1 = new com.google.android.exoplayer2.source.ProgressiveMediaPeriod$$ExternalSyntheticLambda1
            r1.<init>(r2, r3)
            r0.post(r1)
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long seekToUs(long r5) {
            r4 = this;
            r4.assertPrepared()
            com.google.android.exoplayer2.source.ProgressiveMediaPeriod$TrackState r0 = r4.trackState
            boolean[] r0 = r0.trackIsAudioVideoFlags
            com.google.android.exoplayer2.extractor.SeekMap r1 = r4.seekMap
            boolean r1 = r1.isSeekable()
            if (r1 == 0) goto L10
            goto L12
        L10:
            r5 = 0
        L12:
            r1 = 0
            r4.notifyDiscontinuity = r1
            r4.lastSeekPositionUs = r5
            boolean r2 = r4.isPendingReset()
            if (r2 == 0) goto L20
            r4.pendingResetPositionUs = r5
            return r5
        L20:
            int r2 = r4.dataType
            r3 = 7
            if (r2 == r3) goto L2c
            boolean r0 = r4.seekInsideBufferUs(r0, r5)
            if (r0 == 0) goto L2c
            return r5
        L2c:
            r4.pendingDeferredRetry = r1
            r4.pendingResetPositionUs = r5
            r4.loadingFinished = r1
            com.google.android.exoplayer2.upstream.Loader r0 = r4.loader
            boolean r0 = r0.isLoading()
            if (r0 == 0) goto L4d
            com.google.android.exoplayer2.source.SampleQueue[] r0 = r4.sampleQueues
            int r2 = r0.length
        L3d:
            if (r1 >= r2) goto L47
            r3 = r0[r1]
            r3.discardToEnd()
            int r1 = r1 + 1
            goto L3d
        L47:
            com.google.android.exoplayer2.upstream.Loader r0 = r4.loader
            r0.cancelLoading()
            goto L5f
        L4d:
            com.google.android.exoplayer2.upstream.Loader r0 = r4.loader
            r0.clearFatalError()
            com.google.android.exoplayer2.source.SampleQueue[] r0 = r4.sampleQueues
            int r2 = r0.length
        L55:
            if (r1 >= r2) goto L5f
            r3 = r0[r1]
            r3.reset()
            int r1 = r1 + 1
            goto L55
        L5f:
            return r5
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long selectTracks(com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r9, boolean[] r10, com.google.android.exoplayer2.source.SampleStream[] r11, boolean[] r12, long r13) {
            r8 = this;
            r8.assertPrepared()
            com.google.android.exoplayer2.source.ProgressiveMediaPeriod$TrackState r0 = r8.trackState
            com.google.android.exoplayer2.source.TrackGroupArray r1 = r0.tracks
            boolean[] r0 = r0.trackEnabledStates
            int r2 = r8.enabledTrackCount
            r3 = 0
            r4 = 0
        Ld:
            int r5 = r9.length
            r6 = 1
            if (r4 >= r5) goto L37
            r5 = r11[r4]
            if (r5 == 0) goto L34
            r5 = r9[r4]
            if (r5 == 0) goto L1d
            boolean r5 = r10[r4]
            if (r5 != 0) goto L34
        L1d:
            r5 = r11[r4]
            com.google.android.exoplayer2.source.ProgressiveMediaPeriod$SampleStreamImpl r5 = (com.google.android.exoplayer2.source.ProgressiveMediaPeriod.SampleStreamImpl) r5
            int r5 = com.google.android.exoplayer2.source.ProgressiveMediaPeriod.SampleStreamImpl.access$000(r5)
            boolean r7 = r0[r5]
            com.google.android.exoplayer2.util.Assertions.checkState(r7)
            int r7 = r8.enabledTrackCount
            int r7 = r7 - r6
            r8.enabledTrackCount = r7
            r0[r5] = r3
            r5 = 0
            r11[r4] = r5
        L34:
            int r4 = r4 + 1
            goto Ld
        L37:
            boolean r10 = r8.seenFirstTrackSelection
            if (r10 == 0) goto L3e
            if (r2 != 0) goto L46
            goto L44
        L3e:
            r4 = 0
            int r10 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r10 == 0) goto L46
        L44:
            r10 = 1
            goto L47
        L46:
            r10 = 0
        L47:
            r2 = 0
        L48:
            int r4 = r9.length
            if (r2 >= r4) goto La3
            r4 = r11[r2]
            if (r4 != 0) goto La0
            r4 = r9[r2]
            if (r4 == 0) goto La0
            r4 = r9[r2]
            int r5 = r4.length()
            if (r5 != r6) goto L5d
            r5 = 1
            goto L5e
        L5d:
            r5 = 0
        L5e:
            com.google.android.exoplayer2.util.Assertions.checkState(r5)
            int r5 = r4.getIndexInTrackGroup(r3)
            if (r5 != 0) goto L69
            r5 = 1
            goto L6a
        L69:
            r5 = 0
        L6a:
            com.google.android.exoplayer2.util.Assertions.checkState(r5)
            com.google.android.exoplayer2.source.TrackGroup r4 = r4.getTrackGroup()
            int r4 = r1.indexOf(r4)
            boolean r5 = r0[r4]
            r5 = r5 ^ r6
            com.google.android.exoplayer2.util.Assertions.checkState(r5)
            int r5 = r8.enabledTrackCount
            int r5 = r5 + r6
            r8.enabledTrackCount = r5
            r0[r4] = r6
            com.google.android.exoplayer2.source.ProgressiveMediaPeriod$SampleStreamImpl r5 = new com.google.android.exoplayer2.source.ProgressiveMediaPeriod$SampleStreamImpl
            r5.<init>(r8, r4)
            r11[r2] = r5
            r12[r2] = r6
            if (r10 != 0) goto La0
            com.google.android.exoplayer2.source.SampleQueue[] r10 = r8.sampleQueues
            r10 = r10[r4]
            boolean r4 = r10.seekTo(r13, r6)
            if (r4 != 0) goto L9f
            int r10 = r10.getReadIndex()
            if (r10 == 0) goto L9f
            r10 = 1
            goto La0
        L9f:
            r10 = 0
        La0:
            int r2 = r2 + 1
            goto L48
        La3:
            int r9 = r8.enabledTrackCount
            if (r9 != 0) goto Ld3
            r8.pendingDeferredRetry = r3
            r8.notifyDiscontinuity = r3
            com.google.android.exoplayer2.upstream.Loader r9 = r8.loader
            boolean r9 = r9.isLoading()
            if (r9 == 0) goto Lc6
            com.google.android.exoplayer2.source.SampleQueue[] r9 = r8.sampleQueues
            int r10 = r9.length
        Lb6:
            if (r3 >= r10) goto Lc0
            r11 = r9[r3]
            r11.discardToEnd()
            int r3 = r3 + 1
            goto Lb6
        Lc0:
            com.google.android.exoplayer2.upstream.Loader r9 = r8.loader
            r9.cancelLoading()
            goto Le5
        Lc6:
            com.google.android.exoplayer2.source.SampleQueue[] r9 = r8.sampleQueues
            int r10 = r9.length
        Lc9:
            if (r3 >= r10) goto Le5
            r11 = r9[r3]
            r11.reset()
            int r3 = r3 + 1
            goto Lc9
        Ld3:
            if (r10 == 0) goto Le5
            long r13 = r8.seekToUs(r13)
        Ld9:
            int r9 = r11.length
            if (r3 >= r9) goto Le5
            r9 = r11[r3]
            if (r9 == 0) goto Le2
            r12[r3] = r6
        Le2:
            int r3 = r3 + 1
            goto Ld9
        Le5:
            r8.seenFirstTrackSelection = r6
            return r13
    }

    public final int skipData(int r3, long r4) {
            r2 = this;
            boolean r0 = r2.suppressRead()
            if (r0 == 0) goto L8
            r3 = 0
            return r3
        L8:
            r2.maybeNotifyDownstreamFormat(r3)
            com.google.android.exoplayer2.source.SampleQueue[] r0 = r2.sampleQueues
            r0 = r0[r3]
            boolean r1 = r2.loadingFinished
            int r4 = r0.getSkipCount(r4, r1)
            r0.skip(r4)
            if (r4 != 0) goto L1d
            r2.maybeStartDeferredRetry(r3)
        L1d:
            return r4
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public com.google.android.exoplayer2.extractor.TrackOutput track(int r2, int r3) {
            r1 = this;
            com.google.android.exoplayer2.source.ProgressiveMediaPeriod$TrackId r3 = new com.google.android.exoplayer2.source.ProgressiveMediaPeriod$TrackId
            r0 = 0
            r3.<init>(r2, r0)
            com.google.android.exoplayer2.extractor.TrackOutput r2 = r1.prepareTrackOutput(r3)
            return r2
    }
}
