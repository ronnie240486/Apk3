package com.google.android.exoplayer2.source.dash;

/* JADX INFO: loaded from: classes2.dex */
public final class DashMediaSource extends com.google.android.exoplayer2.source.BaseMediaSource {
    public static final long DEFAULT_FALLBACK_TARGET_LIVE_OFFSET_MS = 30000;

    @java.lang.Deprecated
    public static final long DEFAULT_LIVE_PRESENTATION_DELAY_MS = 30000;
    public static final java.lang.String DEFAULT_MEDIA_ID = "DashMediaSource";
    private static final long DEFAULT_NOTIFY_MANIFEST_INTERVAL_MS = 5000;
    private static final long MIN_LIVE_DEFAULT_START_POSITION_US = 5000000;
    private static final java.lang.String TAG = "DashMediaSource";
    private final com.google.android.exoplayer2.source.dash.BaseUrlExclusionList baseUrlExclusionList;
    private final com.google.android.exoplayer2.source.dash.DashChunkSource.Factory chunkSourceFactory;
    private final com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private com.google.android.exoplayer2.upstream.DataSource dataSource;
    private final com.google.android.exoplayer2.drm.DrmSessionManager drmSessionManager;
    private long elapsedRealtimeOffsetMs;
    private long expiredManifestPublishTimeUs;
    private final long fallbackTargetLiveOffsetMs;
    private int firstPeriodId;
    private android.os.Handler handler;
    private android.net.Uri initialManifestUri;
    private com.google.android.exoplayer2.MediaItem.LiveConfiguration liveConfiguration;
    private final com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private com.google.android.exoplayer2.upstream.Loader loader;
    private com.google.android.exoplayer2.source.dash.manifest.DashManifest manifest;
    private final com.google.android.exoplayer2.source.dash.DashMediaSource.ManifestCallback manifestCallback;
    private final com.google.android.exoplayer2.upstream.DataSource.Factory manifestDataSourceFactory;
    private final com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher manifestEventDispatcher;
    private java.io.IOException manifestFatalError;
    private long manifestLoadEndTimestampMs;
    private final com.google.android.exoplayer2.upstream.LoaderErrorThrower manifestLoadErrorThrower;
    private boolean manifestLoadPending;
    private long manifestLoadStartTimestampMs;
    private final com.google.android.exoplayer2.upstream.ParsingLoadable.Parser<? extends com.google.android.exoplayer2.source.dash.manifest.DashManifest> manifestParser;
    private android.net.Uri manifestUri;
    private final java.lang.Object manifestUriLock;
    private final com.google.android.exoplayer2.MediaItem mediaItem;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.upstream.TransferListener mediaTransferListener;
    private final android.util.SparseArray<com.google.android.exoplayer2.source.dash.DashMediaPeriod> periodsById;
    private final com.google.android.exoplayer2.source.dash.PlayerEmsgHandler.PlayerEmsgCallback playerEmsgCallback;
    private final java.lang.Runnable refreshManifestRunnable;
    private final boolean sideloadedManifest;
    private final java.lang.Runnable simulateManifestRefreshRunnable;
    private int staleManifestReloadAttempt;


    /* JADX INFO: loaded from: classes3.dex */
    public static final class DashTimeline extends com.google.android.exoplayer2.Timeline {
        private final long elapsedRealtimeEpochOffsetMs;
        private final int firstPeriodId;

        @androidx.annotation.Nullable
        private final com.google.android.exoplayer2.MediaItem.LiveConfiguration liveConfiguration;
        private final com.google.android.exoplayer2.source.dash.manifest.DashManifest manifest;
        private final com.google.android.exoplayer2.MediaItem mediaItem;
        private final long offsetInFirstPeriodUs;
        private final long presentationStartTimeMs;
        private final long windowDefaultStartPositionUs;
        private final long windowDurationUs;
        private final long windowStartTimeMs;

        public DashTimeline(long r8, long r10, long r12, int r14, long r15, long r17, long r19, com.google.android.exoplayer2.source.dash.manifest.DashManifest r21, com.google.android.exoplayer2.MediaItem r22, @androidx.annotation.Nullable com.google.android.exoplayer2.MediaItem.LiveConfiguration r23) {
                r7 = this;
                r0 = r7
                r1 = r21
                r2 = r23
                r7.<init>()
                boolean r3 = r1.dynamic
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L10
                r6 = 1
                goto L11
            L10:
                r6 = 0
            L11:
                if (r3 != r6) goto L14
                goto L15
            L14:
                r4 = 0
            L15:
                com.google.android.exoplayer2.util.Assertions.checkState(r4)
                r3 = r8
                r0.presentationStartTimeMs = r3
                r3 = r10
                r0.windowStartTimeMs = r3
                r3 = r12
                r0.elapsedRealtimeEpochOffsetMs = r3
                r3 = r14
                r0.firstPeriodId = r3
                r3 = r15
                r0.offsetInFirstPeriodUs = r3
                r3 = r17
                r0.windowDurationUs = r3
                r3 = r19
                r0.windowDefaultStartPositionUs = r3
                r0.manifest = r1
                r1 = r22
                r0.mediaItem = r1
                r0.liveConfiguration = r2
                return
        }

        private long getAdjustedWindowDefaultStartPositionUs(long r11) {
                r10 = this;
                long r0 = r10.windowDefaultStartPositionUs
                com.google.android.exoplayer2.source.dash.manifest.DashManifest r2 = r10.manifest
                boolean r2 = isMovingLiveWindow(r2)
                if (r2 != 0) goto Lb
                return r0
            Lb:
                r2 = 0
                int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
                if (r4 <= 0) goto L1e
                long r0 = r0 + r11
                long r11 = r10.windowDurationUs
                int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
                if (r4 <= 0) goto L1e
                r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                return r11
            L1e:
                long r11 = r10.offsetInFirstPeriodUs
                long r11 = r11 + r0
                com.google.android.exoplayer2.source.dash.manifest.DashManifest r4 = r10.manifest
                r5 = 0
                long r6 = r4.getPeriodDurationUs(r5)
                r4 = 0
            L29:
                com.google.android.exoplayer2.source.dash.manifest.DashManifest r8 = r10.manifest
                int r8 = r8.getPeriodCount()
                int r8 = r8 + (-1)
                if (r4 >= r8) goto L41
                int r8 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
                if (r8 < 0) goto L41
                long r11 = r11 - r6
                int r4 = r4 + 1
                com.google.android.exoplayer2.source.dash.manifest.DashManifest r6 = r10.manifest
                long r6 = r6.getPeriodDurationUs(r4)
                goto L29
            L41:
                com.google.android.exoplayer2.source.dash.manifest.DashManifest r8 = r10.manifest
                com.google.android.exoplayer2.source.dash.manifest.Period r4 = r8.getPeriod(r4)
                r8 = 2
                int r8 = r4.getAdaptationSetIndex(r8)
                r9 = -1
                if (r8 != r9) goto L50
                return r0
            L50:
                java.util.List<com.google.android.exoplayer2.source.dash.manifest.AdaptationSet> r4 = r4.adaptationSets
                java.lang.Object r4 = r4.get(r8)
                com.google.android.exoplayer2.source.dash.manifest.AdaptationSet r4 = (com.google.android.exoplayer2.source.dash.manifest.AdaptationSet) r4
                java.util.List<com.google.android.exoplayer2.source.dash.manifest.Representation> r4 = r4.representations
                java.lang.Object r4 = r4.get(r5)
                com.google.android.exoplayer2.source.dash.manifest.Representation r4 = (com.google.android.exoplayer2.source.dash.manifest.Representation) r4
                com.google.android.exoplayer2.source.dash.DashSegmentIndex r4 = r4.getIndex()
                if (r4 == 0) goto L7a
                long r8 = r4.getSegmentCount(r6)
                int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r5 != 0) goto L6f
                goto L7a
            L6f:
                long r2 = r4.getSegmentNum(r11, r6)
                long r2 = r4.getTimeUs(r2)
                long r2 = r2 + r0
                long r2 = r2 - r11
                return r2
            L7a:
                return r0
        }

        private static boolean isMovingLiveWindow(com.google.android.exoplayer2.source.dash.manifest.DashManifest r5) {
                boolean r0 = r5.dynamic
                if (r0 == 0) goto L17
                long r0 = r5.minUpdatePeriodMs
                r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L17
                long r0 = r5.durationMs
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 != 0) goto L17
                r5 = 1
                goto L18
            L17:
                r5 = 0
            L18:
                return r5
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getIndexOfPeriod(java.lang.Object r3) {
                r2 = this;
                boolean r0 = r3 instanceof java.lang.Integer
                r1 = -1
                if (r0 != 0) goto L6
                return r1
            L6:
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                int r0 = r2.firstPeriodId
                int r3 = r3 - r0
                if (r3 < 0) goto L19
                int r0 = r2.getPeriodCount()
                if (r3 < r0) goto L18
                goto L19
            L18:
                r1 = r3
            L19:
                return r1
        }

        @Override // com.google.android.exoplayer2.Timeline
        public com.google.android.exoplayer2.Timeline.Period getPeriod(int r12, com.google.android.exoplayer2.Timeline.Period r13, boolean r14) {
                r11 = this;
                int r0 = r11.getPeriodCount()
                r1 = 0
                com.google.android.exoplayer2.util.Assertions.checkIndex(r12, r1, r0)
                r0 = 0
                if (r14 == 0) goto L15
                com.google.android.exoplayer2.source.dash.manifest.DashManifest r2 = r11.manifest
                com.google.android.exoplayer2.source.dash.manifest.Period r2 = r2.getPeriod(r12)
                java.lang.String r2 = r2.id
                r4 = r2
                goto L16
            L15:
                r4 = r0
            L16:
                if (r14 == 0) goto L1f
                int r14 = r11.firstPeriodId
                int r14 = r14 + r12
                java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            L1f:
                r5 = r0
                r6 = 0
                com.google.android.exoplayer2.source.dash.manifest.DashManifest r14 = r11.manifest
                long r7 = r14.getPeriodDurationUs(r12)
                com.google.android.exoplayer2.source.dash.manifest.DashManifest r14 = r11.manifest
                com.google.android.exoplayer2.source.dash.manifest.Period r12 = r14.getPeriod(r12)
                long r2 = r12.startMs
                com.google.android.exoplayer2.source.dash.manifest.DashManifest r12 = r11.manifest
                com.google.android.exoplayer2.source.dash.manifest.Period r12 = r12.getPeriod(r1)
                long r0 = r12.startMs
                long r2 = r2 - r0
                long r0 = com.google.android.exoplayer2.util.Util.msToUs(r2)
                long r2 = r11.offsetInFirstPeriodUs
                long r9 = r0 - r2
                r3 = r13
                com.google.android.exoplayer2.Timeline$Period r12 = r3.set(r4, r5, r6, r7, r9)
                return r12
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPeriodCount() {
                r1 = this;
                com.google.android.exoplayer2.source.dash.manifest.DashManifest r0 = r1.manifest
                int r0 = r0.getPeriodCount()
                return r0
        }

        @Override // com.google.android.exoplayer2.Timeline
        public java.lang.Object getUidOfPeriod(int r3) {
                r2 = this;
                int r0 = r2.getPeriodCount()
                r1 = 0
                com.google.android.exoplayer2.util.Assertions.checkIndex(r3, r1, r0)
                int r0 = r2.firstPeriodId
                int r0 = r0 + r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
                return r3
        }

        @Override // com.google.android.exoplayer2.Timeline
        public com.google.android.exoplayer2.Timeline.Window getWindow(int r23, com.google.android.exoplayer2.Timeline.Window r24, long r25) {
                r22 = this;
                r0 = r22
                r1 = r24
                r2 = 0
                r11 = 1
                r3 = r23
                com.google.android.exoplayer2.util.Assertions.checkIndex(r3, r2, r11)
                r2 = r25
                long r14 = r0.getAdjustedWindowDefaultStartPositionUs(r2)
                java.lang.Object r2 = com.google.android.exoplayer2.Timeline.Window.SINGLE_WINDOW_UID
                com.google.android.exoplayer2.MediaItem r3 = r0.mediaItem
                com.google.android.exoplayer2.source.dash.manifest.DashManifest r12 = r0.manifest
                r4 = r12
                long r5 = r0.presentationStartTimeMs
                long r7 = r0.windowStartTimeMs
                long r9 = r0.elapsedRealtimeEpochOffsetMs
                boolean r12 = isMovingLiveWindow(r12)
                com.google.android.exoplayer2.MediaItem$LiveConfiguration r13 = r0.liveConfiguration
                r23 = r12
                long r11 = r0.windowDurationUs
                r16 = r11
                int r11 = r22.getPeriodCount()
                r12 = 1
                int r19 = r11 + (-1)
                long r11 = r0.offsetInFirstPeriodUs
                r20 = r11
                r11 = 1
                r18 = 0
                r12 = r23
                com.google.android.exoplayer2.Timeline$Window r1 = r1.set(r2, r3, r4, r5, r7, r9, r11, r12, r13, r14, r16, r18, r19, r20)
                return r1
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getWindowCount() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    public final class DefaultPlayerEmsgCallback implements com.google.android.exoplayer2.source.dash.PlayerEmsgHandler.PlayerEmsgCallback {
        public final /* synthetic */ com.google.android.exoplayer2.source.dash.DashMediaSource this$0;

        private DefaultPlayerEmsgCallback(com.google.android.exoplayer2.source.dash.DashMediaSource r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ DefaultPlayerEmsgCallback(com.google.android.exoplayer2.source.dash.DashMediaSource r1, com.google.android.exoplayer2.source.dash.DashMediaSource.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.android.exoplayer2.source.dash.PlayerEmsgHandler.PlayerEmsgCallback
        public void onDashManifestPublishTimeExpired(long r2) {
                r1 = this;
                com.google.android.exoplayer2.source.dash.DashMediaSource r0 = r1.this$0
                r0.onDashManifestPublishTimeExpired(r2)
                return
        }

        @Override // com.google.android.exoplayer2.source.dash.PlayerEmsgHandler.PlayerEmsgCallback
        public void onDashManifestRefreshRequested() {
                r1 = this;
                com.google.android.exoplayer2.source.dash.DashMediaSource r0 = r1.this$0
                r0.onDashManifestRefreshRequested()
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Factory implements com.google.android.exoplayer2.source.MediaSourceFactory {
        private final com.google.android.exoplayer2.source.dash.DashChunkSource.Factory chunkSourceFactory;
        private com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
        private com.google.android.exoplayer2.drm.DrmSessionManagerProvider drmSessionManagerProvider;
        private long fallbackTargetLiveOffsetMs;
        private com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;

        @androidx.annotation.Nullable
        private final com.google.android.exoplayer2.upstream.DataSource.Factory manifestDataSourceFactory;

        @androidx.annotation.Nullable
        private com.google.android.exoplayer2.upstream.ParsingLoadable.Parser<? extends com.google.android.exoplayer2.source.dash.manifest.DashManifest> manifestParser;

        public Factory(com.google.android.exoplayer2.source.dash.DashChunkSource.Factory r1, @androidx.annotation.Nullable com.google.android.exoplayer2.upstream.DataSource.Factory r2) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
                com.google.android.exoplayer2.source.dash.DashChunkSource$Factory r1 = (com.google.android.exoplayer2.source.dash.DashChunkSource.Factory) r1
                r0.chunkSourceFactory = r1
                r0.manifestDataSourceFactory = r2
                com.google.android.exoplayer2.drm.DefaultDrmSessionManagerProvider r1 = new com.google.android.exoplayer2.drm.DefaultDrmSessionManagerProvider
                r1.<init>()
                r0.drmSessionManagerProvider = r1
                com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy r1 = new com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy
                r1.<init>()
                r0.loadErrorHandlingPolicy = r1
                r1 = 30000(0x7530, double:1.4822E-319)
                r0.fallbackTargetLiveOffsetMs = r1
                com.google.android.exoplayer2.source.DefaultCompositeSequenceableLoaderFactory r1 = new com.google.android.exoplayer2.source.DefaultCompositeSequenceableLoaderFactory
                r1.<init>()
                r0.compositeSequenceableLoaderFactory = r1
                return
        }

        public Factory(com.google.android.exoplayer2.upstream.DataSource.Factory r2) {
                r1 = this;
                com.google.android.exoplayer2.source.dash.DefaultDashChunkSource$Factory r0 = new com.google.android.exoplayer2.source.dash.DefaultDashChunkSource$Factory
                r0.<init>(r2)
                r1.<init>(r0, r2)
                return
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.source.MediaSource createMediaSource(com.google.android.exoplayer2.MediaItem r1) {
                r0 = this;
                com.google.android.exoplayer2.source.dash.DashMediaSource r1 = r0.createMediaSource(r1)
                return r1
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        public com.google.android.exoplayer2.source.dash.DashMediaSource createMediaSource(com.google.android.exoplayer2.MediaItem r14) {
                r13 = this;
                com.google.android.exoplayer2.MediaItem$LocalConfiguration r0 = r14.localConfiguration
                com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
                com.google.android.exoplayer2.upstream.ParsingLoadable$Parser<? extends com.google.android.exoplayer2.source.dash.manifest.DashManifest> r0 = r13.manifestParser
                if (r0 != 0) goto Le
                com.google.android.exoplayer2.source.dash.manifest.DashManifestParser r0 = new com.google.android.exoplayer2.source.dash.manifest.DashManifestParser
                r0.<init>()
            Le:
                com.google.android.exoplayer2.MediaItem$LocalConfiguration r2 = r14.localConfiguration
                java.util.List<com.google.android.exoplayer2.offline.StreamKey> r2 = r2.streamKeys
                boolean r3 = r2.isEmpty()
                if (r3 != 0) goto L1f
                com.google.android.exoplayer2.offline.FilteringManifestParser r3 = new com.google.android.exoplayer2.offline.FilteringManifestParser
                r3.<init>(r0, r2)
                r4 = r3
                goto L20
            L1f:
                r4 = r0
            L20:
                com.google.android.exoplayer2.source.dash.DashMediaSource r12 = new com.google.android.exoplayer2.source.dash.DashMediaSource
                r2 = 0
                com.google.android.exoplayer2.upstream.DataSource$Factory r3 = r13.manifestDataSourceFactory
                com.google.android.exoplayer2.source.dash.DashChunkSource$Factory r5 = r13.chunkSourceFactory
                com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory r6 = r13.compositeSequenceableLoaderFactory
                com.google.android.exoplayer2.drm.DrmSessionManagerProvider r0 = r13.drmSessionManagerProvider
                com.google.android.exoplayer2.drm.DrmSessionManager r7 = r0.get(r14)
                com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r8 = r13.loadErrorHandlingPolicy
                long r9 = r13.fallbackTargetLiveOffsetMs
                r11 = 0
                r0 = r12
                r1 = r14
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11)
                return r12
        }

        public com.google.android.exoplayer2.source.dash.DashMediaSource createMediaSource(com.google.android.exoplayer2.source.dash.manifest.DashManifest r3) {
                r2 = this;
                com.google.android.exoplayer2.MediaItem$Builder r0 = new com.google.android.exoplayer2.MediaItem$Builder
                r0.<init>()
                android.net.Uri r1 = android.net.Uri.EMPTY
                com.google.android.exoplayer2.MediaItem$Builder r0 = r0.setUri(r1)
                java.lang.String r1 = "DashMediaSource"
                com.google.android.exoplayer2.MediaItem$Builder r0 = r0.setMediaId(r1)
                java.lang.String r1 = "application/dash+xml"
                com.google.android.exoplayer2.MediaItem$Builder r0 = r0.setMimeType(r1)
                com.google.android.exoplayer2.MediaItem r0 = r0.build()
                com.google.android.exoplayer2.source.dash.DashMediaSource r3 = r2.createMediaSource(r3, r0)
                return r3
        }

        public com.google.android.exoplayer2.source.dash.DashMediaSource createMediaSource(com.google.android.exoplayer2.source.dash.manifest.DashManifest r14, com.google.android.exoplayer2.MediaItem r15) {
                r13 = this;
                boolean r0 = r14.dynamic
                r0 = r0 ^ 1
                com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
                com.google.android.exoplayer2.MediaItem$Builder r0 = r15.buildUpon()
                java.lang.String r1 = "application/dash+xml"
                com.google.android.exoplayer2.MediaItem$Builder r0 = r0.setMimeType(r1)
                com.google.android.exoplayer2.MediaItem$LocalConfiguration r15 = r15.localConfiguration
                if (r15 != 0) goto L1a
                android.net.Uri r15 = android.net.Uri.EMPTY
                r0.setUri(r15)
            L1a:
                com.google.android.exoplayer2.MediaItem r2 = r0.build()
                com.google.android.exoplayer2.source.dash.DashMediaSource r15 = new com.google.android.exoplayer2.source.dash.DashMediaSource
                r4 = 0
                r5 = 0
                com.google.android.exoplayer2.source.dash.DashChunkSource$Factory r6 = r13.chunkSourceFactory
                com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory r7 = r13.compositeSequenceableLoaderFactory
                com.google.android.exoplayer2.drm.DrmSessionManagerProvider r0 = r13.drmSessionManagerProvider
                com.google.android.exoplayer2.drm.DrmSessionManager r8 = r0.get(r2)
                com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r9 = r13.loadErrorHandlingPolicy
                long r10 = r13.fallbackTargetLiveOffsetMs
                r12 = 0
                r1 = r15
                r3 = r14
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
                return r15
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        public int[] getSupportedTypes() {
                r2 = this;
                r0 = 1
                int[] r0 = new int[r0]
                r1 = 0
                r0[r1] = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.source.dash.DashMediaSource.Factory setCompositeSequenceableLoaderFactory(com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory r2) {
                r1 = this;
                java.lang.String r0 = "DashMediaSource.Factory#setCompositeSequenceableLoaderFactory no longer handles null by instantiating a new DefaultCompositeSequenceableLoaderFactory. Explicitly construct and pass an instance in order to retain the old behavior."
                java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2, r0)
                com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory r2 = (com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory) r2
                r1.compositeSequenceableLoaderFactory = r2
                return r1
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.source.MediaSource.Factory setDrmSessionManagerProvider(com.google.android.exoplayer2.drm.DrmSessionManagerProvider r1) {
                r0 = this;
                com.google.android.exoplayer2.source.dash.DashMediaSource$Factory r1 = r0.setDrmSessionManagerProvider(r1)
                return r1
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.source.dash.DashMediaSource.Factory setDrmSessionManagerProvider(com.google.android.exoplayer2.drm.DrmSessionManagerProvider r2) {
                r1 = this;
                java.lang.String r0 = "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."
                java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2, r0)
                com.google.android.exoplayer2.drm.DrmSessionManagerProvider r2 = (com.google.android.exoplayer2.drm.DrmSessionManagerProvider) r2
                r1.drmSessionManagerProvider = r2
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.source.dash.DashMediaSource.Factory setFallbackTargetLiveOffsetMs(long r1) {
                r0 = this;
                r0.fallbackTargetLiveOffsetMs = r1
                return r0
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.source.MediaSource.Factory setLoadErrorHandlingPolicy(com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r1) {
                r0 = this;
                com.google.android.exoplayer2.source.dash.DashMediaSource$Factory r1 = r0.setLoadErrorHandlingPolicy(r1)
                return r1
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.source.dash.DashMediaSource.Factory setLoadErrorHandlingPolicy(com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r2) {
                r1 = this;
                java.lang.String r0 = "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior."
                java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2, r0)
                com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r2 = (com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy) r2
                r1.loadErrorHandlingPolicy = r2
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.source.dash.DashMediaSource.Factory setManifestParser(@androidx.annotation.Nullable com.google.android.exoplayer2.upstream.ParsingLoadable.Parser<? extends com.google.android.exoplayer2.source.dash.manifest.DashManifest> r1) {
                r0 = this;
                r0.manifestParser = r1
                return r0
        }
    }

    public static final class Iso8601Parser implements com.google.android.exoplayer2.upstream.ParsingLoadable.Parser<java.lang.Long> {
        private static final java.util.regex.Pattern TIMESTAMP_WITH_TIMEZONE_PATTERN = null;

        static {
                java.lang.String r0 = "(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))"
                java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
                com.google.android.exoplayer2.source.dash.DashMediaSource.Iso8601Parser.TIMESTAMP_WITH_TIMEZONE_PATTERN = r0
                return
        }

        public Iso8601Parser() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
        public java.lang.Long parse(android.net.Uri r12, java.io.InputStream r13) throws java.io.IOException {
                r11 = this;
                java.io.BufferedReader r12 = new java.io.BufferedReader
                java.io.InputStreamReader r0 = new java.io.InputStreamReader
                java.nio.charset.Charset r1 = com.google.common.base.Charsets.UTF_8
                r0.<init>(r13, r1)
                r12.<init>(r0)
                java.lang.String r12 = r12.readLine()
                r13 = 0
                java.util.regex.Pattern r0 = com.google.android.exoplayer2.source.dash.DashMediaSource.Iso8601Parser.TIMESTAMP_WITH_TIMEZONE_PATTERN     // Catch: java.text.ParseException -> La1
                java.util.regex.Matcher r0 = r0.matcher(r12)     // Catch: java.text.ParseException -> La1
                boolean r1 = r0.matches()     // Catch: java.text.ParseException -> La1
                if (r1 == 0) goto L8b
                r12 = 1
                java.lang.String r12 = r0.group(r12)     // Catch: java.text.ParseException -> La1
                java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat     // Catch: java.text.ParseException -> La1
                java.lang.String r2 = "yyyy-MM-dd'T'HH:mm:ss"
                java.util.Locale r3 = java.util.Locale.US     // Catch: java.text.ParseException -> La1
                r1.<init>(r2, r3)     // Catch: java.text.ParseException -> La1
                java.lang.String r2 = "UTC"
                java.util.TimeZone r2 = java.util.TimeZone.getTimeZone(r2)     // Catch: java.text.ParseException -> La1
                r1.setTimeZone(r2)     // Catch: java.text.ParseException -> La1
                java.util.Date r12 = r1.parse(r12)     // Catch: java.text.ParseException -> La1
                long r1 = r12.getTime()     // Catch: java.text.ParseException -> La1
                r12 = 2
                java.lang.String r12 = r0.group(r12)     // Catch: java.text.ParseException -> La1
                java.lang.String r3 = "Z"
                boolean r12 = r3.equals(r12)     // Catch: java.text.ParseException -> La1
                if (r12 == 0) goto L4b
                goto L86
            L4b:
                java.lang.String r12 = "+"
                r3 = 4
                java.lang.String r3 = r0.group(r3)     // Catch: java.text.ParseException -> La1
                boolean r12 = r12.equals(r3)     // Catch: java.text.ParseException -> La1
                if (r12 == 0) goto L5b
                r3 = 1
                goto L5d
            L5b:
                r3 = -1
            L5d:
                r12 = 5
                java.lang.String r12 = r0.group(r12)     // Catch: java.text.ParseException -> La1
                long r5 = java.lang.Long.parseLong(r12)     // Catch: java.text.ParseException -> La1
                r12 = 7
                java.lang.String r12 = r0.group(r12)     // Catch: java.text.ParseException -> La1
                boolean r0 = android.text.TextUtils.isEmpty(r12)     // Catch: java.text.ParseException -> La1
                if (r0 == 0) goto L74
                r7 = 0
                goto L78
            L74:
                long r7 = java.lang.Long.parseLong(r12)     // Catch: java.text.ParseException -> La1
            L78:
                r9 = 60
                long r5 = r5 * r9
                long r5 = r5 + r7
                long r5 = r5 * r9
                r7 = 1000(0x3e8, double:4.94E-321)
                long r5 = r5 * r7
                long r5 = r5 * r3
                long r1 = r1 - r5
            L86:
                java.lang.Long r12 = java.lang.Long.valueOf(r1)     // Catch: java.text.ParseException -> La1
                return r12
            L8b:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.text.ParseException -> La1
                r0.<init>()     // Catch: java.text.ParseException -> La1
                java.lang.String r1 = "Couldn't parse timestamp: "
                r0.append(r1)     // Catch: java.text.ParseException -> La1
                r0.append(r12)     // Catch: java.text.ParseException -> La1
                java.lang.String r12 = r0.toString()     // Catch: java.text.ParseException -> La1
                com.google.android.exoplayer2.ParserException r12 = com.google.android.exoplayer2.ParserException.createForMalformedManifest(r12, r13)     // Catch: java.text.ParseException -> La1
                throw r12     // Catch: java.text.ParseException -> La1
            La1:
                r12 = move-exception
                com.google.android.exoplayer2.ParserException r12 = com.google.android.exoplayer2.ParserException.createForMalformedManifest(r13, r12)
                throw r12
        }

        @Override // com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
        public /* bridge */ /* synthetic */ java.lang.Long parse(android.net.Uri r1, java.io.InputStream r2) throws java.io.IOException {
                r0 = this;
                java.lang.Long r1 = r0.parse(r1, r2)
                return r1
        }
    }

    public final class ManifestCallback implements com.google.android.exoplayer2.upstream.Loader.Callback<com.google.android.exoplayer2.upstream.ParsingLoadable<com.google.android.exoplayer2.source.dash.manifest.DashManifest>> {
        public final /* synthetic */ com.google.android.exoplayer2.source.dash.DashMediaSource this$0;

        private ManifestCallback(com.google.android.exoplayer2.source.dash.DashMediaSource r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ ManifestCallback(com.google.android.exoplayer2.source.dash.DashMediaSource r1, com.google.android.exoplayer2.source.dash.DashMediaSource.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public /* bridge */ /* synthetic */ void onLoadCanceled(com.google.android.exoplayer2.upstream.Loader.Loadable r1, long r2, long r4, boolean r6) {
                r0 = this;
                com.google.android.exoplayer2.upstream.ParsingLoadable r1 = (com.google.android.exoplayer2.upstream.ParsingLoadable) r1
                r0.onLoadCanceled(r1, r2, r4, r6)
                return
        }

        public void onLoadCanceled(com.google.android.exoplayer2.upstream.ParsingLoadable<com.google.android.exoplayer2.source.dash.manifest.DashManifest> r7, long r8, long r10, boolean r12) {
                r6 = this;
                com.google.android.exoplayer2.source.dash.DashMediaSource r0 = r6.this$0
                r1 = r7
                r2 = r8
                r4 = r10
                r0.onLoadCanceled(r1, r2, r4)
                return
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public /* bridge */ /* synthetic */ void onLoadCompleted(com.google.android.exoplayer2.upstream.Loader.Loadable r1, long r2, long r4) {
                r0 = this;
                com.google.android.exoplayer2.upstream.ParsingLoadable r1 = (com.google.android.exoplayer2.upstream.ParsingLoadable) r1
                r0.onLoadCompleted(r1, r2, r4)
                return
        }

        public void onLoadCompleted(com.google.android.exoplayer2.upstream.ParsingLoadable<com.google.android.exoplayer2.source.dash.manifest.DashManifest> r7, long r8, long r10) {
                r6 = this;
                com.google.android.exoplayer2.source.dash.DashMediaSource r0 = r6.this$0
                r1 = r7
                r2 = r8
                r4 = r10
                r0.onManifestLoadCompleted(r1, r2, r4)
                return
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.upstream.Loader.LoadErrorAction onLoadError(com.google.android.exoplayer2.upstream.Loader.Loadable r1, long r2, long r4, java.io.IOException r6, int r7) {
                r0 = this;
                com.google.android.exoplayer2.upstream.ParsingLoadable r1 = (com.google.android.exoplayer2.upstream.ParsingLoadable) r1
                com.google.android.exoplayer2.upstream.Loader$LoadErrorAction r1 = r0.onLoadError(r1, r2, r4, r6, r7)
                return r1
        }

        public com.google.android.exoplayer2.upstream.Loader.LoadErrorAction onLoadError(com.google.android.exoplayer2.upstream.ParsingLoadable<com.google.android.exoplayer2.source.dash.manifest.DashManifest> r9, long r10, long r12, java.io.IOException r14, int r15) {
                r8 = this;
                com.google.android.exoplayer2.source.dash.DashMediaSource r0 = r8.this$0
                r1 = r9
                r2 = r10
                r4 = r12
                r6 = r14
                r7 = r15
                com.google.android.exoplayer2.upstream.Loader$LoadErrorAction r9 = r0.onManifestLoadError(r1, r2, r4, r6, r7)
                return r9
        }
    }

    public final class ManifestLoadErrorThrower implements com.google.android.exoplayer2.upstream.LoaderErrorThrower {
        public final /* synthetic */ com.google.android.exoplayer2.source.dash.DashMediaSource this$0;

        public ManifestLoadErrorThrower(com.google.android.exoplayer2.source.dash.DashMediaSource r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        private void maybeThrowManifestError() throws java.io.IOException {
                r1 = this;
                com.google.android.exoplayer2.source.dash.DashMediaSource r0 = r1.this$0
                java.io.IOException r0 = com.google.android.exoplayer2.source.dash.DashMediaSource.access$800(r0)
                if (r0 != 0) goto L9
                return
            L9:
                com.google.android.exoplayer2.source.dash.DashMediaSource r0 = r1.this$0
                java.io.IOException r0 = com.google.android.exoplayer2.source.dash.DashMediaSource.access$800(r0)
                throw r0
        }

        @Override // com.google.android.exoplayer2.upstream.LoaderErrorThrower
        public void maybeThrowError() throws java.io.IOException {
                r1 = this;
                com.google.android.exoplayer2.source.dash.DashMediaSource r0 = r1.this$0
                com.google.android.exoplayer2.upstream.Loader r0 = com.google.android.exoplayer2.source.dash.DashMediaSource.access$700(r0)
                r0.maybeThrowError()
                r1.maybeThrowManifestError()
                return
        }

        @Override // com.google.android.exoplayer2.upstream.LoaderErrorThrower
        public void maybeThrowError(int r2) throws java.io.IOException {
                r1 = this;
                com.google.android.exoplayer2.source.dash.DashMediaSource r0 = r1.this$0
                com.google.android.exoplayer2.upstream.Loader r0 = com.google.android.exoplayer2.source.dash.DashMediaSource.access$700(r0)
                r0.maybeThrowError(r2)
                r1.maybeThrowManifestError()
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public final class UtcTimestampCallback implements com.google.android.exoplayer2.upstream.Loader.Callback<com.google.android.exoplayer2.upstream.ParsingLoadable<java.lang.Long>> {
        public final /* synthetic */ com.google.android.exoplayer2.source.dash.DashMediaSource this$0;

        private UtcTimestampCallback(com.google.android.exoplayer2.source.dash.DashMediaSource r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ UtcTimestampCallback(com.google.android.exoplayer2.source.dash.DashMediaSource r1, com.google.android.exoplayer2.source.dash.DashMediaSource.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public /* bridge */ /* synthetic */ void onLoadCanceled(com.google.android.exoplayer2.upstream.Loader.Loadable r1, long r2, long r4, boolean r6) {
                r0 = this;
                com.google.android.exoplayer2.upstream.ParsingLoadable r1 = (com.google.android.exoplayer2.upstream.ParsingLoadable) r1
                r0.onLoadCanceled(r1, r2, r4, r6)
                return
        }

        public void onLoadCanceled(com.google.android.exoplayer2.upstream.ParsingLoadable<java.lang.Long> r7, long r8, long r10, boolean r12) {
                r6 = this;
                com.google.android.exoplayer2.source.dash.DashMediaSource r0 = r6.this$0
                r1 = r7
                r2 = r8
                r4 = r10
                r0.onLoadCanceled(r1, r2, r4)
                return
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public /* bridge */ /* synthetic */ void onLoadCompleted(com.google.android.exoplayer2.upstream.Loader.Loadable r1, long r2, long r4) {
                r0 = this;
                com.google.android.exoplayer2.upstream.ParsingLoadable r1 = (com.google.android.exoplayer2.upstream.ParsingLoadable) r1
                r0.onLoadCompleted(r1, r2, r4)
                return
        }

        public void onLoadCompleted(com.google.android.exoplayer2.upstream.ParsingLoadable<java.lang.Long> r7, long r8, long r10) {
                r6 = this;
                com.google.android.exoplayer2.source.dash.DashMediaSource r0 = r6.this$0
                r1 = r7
                r2 = r8
                r4 = r10
                r0.onUtcTimestampLoadCompleted(r1, r2, r4)
                return
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.upstream.Loader.LoadErrorAction onLoadError(com.google.android.exoplayer2.upstream.Loader.Loadable r1, long r2, long r4, java.io.IOException r6, int r7) {
                r0 = this;
                com.google.android.exoplayer2.upstream.ParsingLoadable r1 = (com.google.android.exoplayer2.upstream.ParsingLoadable) r1
                com.google.android.exoplayer2.upstream.Loader$LoadErrorAction r1 = r0.onLoadError(r1, r2, r4, r6, r7)
                return r1
        }

        public com.google.android.exoplayer2.upstream.Loader.LoadErrorAction onLoadError(com.google.android.exoplayer2.upstream.ParsingLoadable<java.lang.Long> r8, long r9, long r11, java.io.IOException r13, int r14) {
                r7 = this;
                com.google.android.exoplayer2.source.dash.DashMediaSource r0 = r7.this$0
                r1 = r8
                r2 = r9
                r4 = r11
                r6 = r13
                com.google.android.exoplayer2.upstream.Loader$LoadErrorAction r8 = r0.onUtcTimestampLoadError(r1, r2, r4, r6)
                return r8
        }
    }

    public static final class XsDateTimeParser implements com.google.android.exoplayer2.upstream.ParsingLoadable.Parser<java.lang.Long> {
        private XsDateTimeParser() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ XsDateTimeParser(com.google.android.exoplayer2.source.dash.DashMediaSource.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
        public java.lang.Long parse(android.net.Uri r2, java.io.InputStream r3) throws java.io.IOException {
                r1 = this;
                java.io.BufferedReader r2 = new java.io.BufferedReader
                java.io.InputStreamReader r0 = new java.io.InputStreamReader
                r0.<init>(r3)
                r2.<init>(r0)
                java.lang.String r2 = r2.readLine()
                long r2 = com.google.android.exoplayer2.util.Util.parseXsDateTime(r2)
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                return r2
        }

        @Override // com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
        public /* bridge */ /* synthetic */ java.lang.Long parse(android.net.Uri r1, java.io.InputStream r2) throws java.io.IOException {
                r0 = this;
                java.lang.Long r1 = r0.parse(r1, r2)
                return r1
        }
    }

    public static /* synthetic */ void $r8$lambda$Cbfv38hh_bge_0zl8BZ2qKibtNM(com.google.android.exoplayer2.source.dash.DashMediaSource r0) {
            r0.startLoadingManifest()
            return
    }

    public static /* synthetic */ void $r8$lambda$tcj5_k0eRW_0pFP8XJMknwm4k0o(com.google.android.exoplayer2.source.dash.DashMediaSource r0) {
            r0.lambda$new$0()
            return
    }

    static {
            java.lang.String r0 = "goog.exo.dash"
            com.google.android.exoplayer2.ExoPlayerLibraryInfo.registerModule(r0)
            return
    }

    private DashMediaSource(com.google.android.exoplayer2.MediaItem r2, @androidx.annotation.Nullable com.google.android.exoplayer2.source.dash.manifest.DashManifest r3, @androidx.annotation.Nullable com.google.android.exoplayer2.upstream.DataSource.Factory r4, @androidx.annotation.Nullable com.google.android.exoplayer2.upstream.ParsingLoadable.Parser<? extends com.google.android.exoplayer2.source.dash.manifest.DashManifest> r5, com.google.android.exoplayer2.source.dash.DashChunkSource.Factory r6, com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory r7, com.google.android.exoplayer2.drm.DrmSessionManager r8, com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r9, long r10) {
            r1 = this;
            r1.<init>()
            r1.mediaItem = r2
            com.google.android.exoplayer2.MediaItem$LiveConfiguration r0 = r2.liveConfiguration
            r1.liveConfiguration = r0
            com.google.android.exoplayer2.MediaItem$LocalConfiguration r0 = r2.localConfiguration
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.MediaItem$LocalConfiguration r0 = (com.google.android.exoplayer2.MediaItem.LocalConfiguration) r0
            android.net.Uri r0 = r0.uri
            r1.manifestUri = r0
            com.google.android.exoplayer2.MediaItem$LocalConfiguration r2 = r2.localConfiguration
            android.net.Uri r2 = r2.uri
            r1.initialManifestUri = r2
            r1.manifest = r3
            r1.manifestDataSourceFactory = r4
            r1.manifestParser = r5
            r1.chunkSourceFactory = r6
            r1.drmSessionManager = r8
            r1.loadErrorHandlingPolicy = r9
            r1.fallbackTargetLiveOffsetMs = r10
            r1.compositeSequenceableLoaderFactory = r7
            com.google.android.exoplayer2.source.dash.BaseUrlExclusionList r2 = new com.google.android.exoplayer2.source.dash.BaseUrlExclusionList
            r2.<init>()
            r1.baseUrlExclusionList = r2
            r2 = 0
            r4 = 1
            if (r3 == 0) goto L38
            r5 = 1
            goto L39
        L38:
            r5 = 0
        L39:
            r1.sideloadedManifest = r5
            r6 = 0
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r7 = r1.createEventDispatcher(r6)
            r1.manifestEventDispatcher = r7
            java.lang.Object r7 = new java.lang.Object
            r7.<init>()
            r1.manifestUriLock = r7
            android.util.SparseArray r7 = new android.util.SparseArray
            r7.<init>()
            r1.periodsById = r7
            com.google.android.exoplayer2.source.dash.DashMediaSource$DefaultPlayerEmsgCallback r7 = new com.google.android.exoplayer2.source.dash.DashMediaSource$DefaultPlayerEmsgCallback
            r7.<init>(r1, r6)
            r1.playerEmsgCallback = r7
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.expiredManifestPublishTimeUs = r7
            r1.elapsedRealtimeOffsetMs = r7
            if (r5 == 0) goto L76
            boolean r2 = r3.dynamic
            r2 = r2 ^ r4
            com.google.android.exoplayer2.util.Assertions.checkState(r2)
            r1.manifestCallback = r6
            r1.refreshManifestRunnable = r6
            r1.simulateManifestRefreshRunnable = r6
            com.google.android.exoplayer2.upstream.LoaderErrorThrower$Dummy r2 = new com.google.android.exoplayer2.upstream.LoaderErrorThrower$Dummy
            r2.<init>()
            r1.manifestLoadErrorThrower = r2
            goto L92
        L76:
            com.google.android.exoplayer2.source.dash.DashMediaSource$ManifestCallback r3 = new com.google.android.exoplayer2.source.dash.DashMediaSource$ManifestCallback
            r3.<init>(r1, r6)
            r1.manifestCallback = r3
            com.google.android.exoplayer2.source.dash.DashMediaSource$ManifestLoadErrorThrower r3 = new com.google.android.exoplayer2.source.dash.DashMediaSource$ManifestLoadErrorThrower
            r3.<init>(r1)
            r1.manifestLoadErrorThrower = r3
            com.google.android.exoplayer2.source.dash.DashMediaSource$$ExternalSyntheticLambda0 r3 = new com.google.android.exoplayer2.source.dash.DashMediaSource$$ExternalSyntheticLambda0
            r3.<init>(r1, r2)
            r1.refreshManifestRunnable = r3
            com.google.android.exoplayer2.source.dash.DashMediaSource$$ExternalSyntheticLambda0 r2 = new com.google.android.exoplayer2.source.dash.DashMediaSource$$ExternalSyntheticLambda0
            r2.<init>(r1, r4)
            r1.simulateManifestRefreshRunnable = r2
        L92:
            return
    }

    public /* synthetic */ DashMediaSource(com.google.android.exoplayer2.MediaItem r1, com.google.android.exoplayer2.source.dash.manifest.DashManifest r2, com.google.android.exoplayer2.upstream.DataSource.Factory r3, com.google.android.exoplayer2.upstream.ParsingLoadable.Parser r4, com.google.android.exoplayer2.source.dash.DashChunkSource.Factory r5, com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory r6, com.google.android.exoplayer2.drm.DrmSessionManager r7, com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r8, long r9, com.google.android.exoplayer2.source.dash.DashMediaSource.AnonymousClass1 r11) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static /* synthetic */ void access$500(com.google.android.exoplayer2.source.dash.DashMediaSource r0, long r1) {
            r0.onUtcTimestampResolved(r1)
            return
    }

    public static /* synthetic */ void access$600(com.google.android.exoplayer2.source.dash.DashMediaSource r0, java.io.IOException r1) {
            r0.onUtcTimestampResolutionError(r1)
            return
    }

    public static /* synthetic */ com.google.android.exoplayer2.upstream.Loader access$700(com.google.android.exoplayer2.source.dash.DashMediaSource r0) {
            com.google.android.exoplayer2.upstream.Loader r0 = r0.loader
            return r0
    }

    public static /* synthetic */ java.io.IOException access$800(com.google.android.exoplayer2.source.dash.DashMediaSource r0) {
            java.io.IOException r0 = r0.manifestFatalError
            return r0
    }

    private static long getAvailableEndTimeInManifestUs(com.google.android.exoplayer2.source.dash.manifest.Period r18, long r19, long r21) {
            r0 = r18
            r1 = r19
            r3 = r21
            long r5 = r0.startMs
            long r5 = com.google.android.exoplayer2.util.Util.msToUs(r5)
            boolean r7 = hasVideoOrAudioAdaptationSets(r18)
            r8 = 0
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r11 = 0
        L17:
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.AdaptationSet> r12 = r0.adaptationSets
            int r12 = r12.size()
            if (r11 >= r12) goto L71
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.AdaptationSet> r12 = r0.adaptationSets
            java.lang.Object r12 = r12.get(r11)
            com.google.android.exoplayer2.source.dash.manifest.AdaptationSet r12 = (com.google.android.exoplayer2.source.dash.manifest.AdaptationSet) r12
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.Representation> r13 = r12.representations
            int r12 = r12.type
            r14 = 1
            if (r12 == r14) goto L32
            r15 = 2
            if (r12 == r15) goto L32
            goto L33
        L32:
            r14 = 0
        L33:
            if (r7 == 0) goto L37
            if (r14 != 0) goto L6e
        L37:
            boolean r12 = r13.isEmpty()
            if (r12 == 0) goto L3e
            goto L6e
        L3e:
            java.lang.Object r12 = r13.get(r8)
            com.google.android.exoplayer2.source.dash.manifest.Representation r12 = (com.google.android.exoplayer2.source.dash.manifest.Representation) r12
            com.google.android.exoplayer2.source.dash.DashSegmentIndex r12 = r12.getIndex()
            if (r12 != 0) goto L4c
            long r5 = r5 + r1
            return r5
        L4c:
            long r13 = r12.getAvailableSegmentCount(r1, r3)
            r15 = 0
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 != 0) goto L57
            return r5
        L57:
            long r15 = r12.getFirstAvailableSegmentNum(r1, r3)
            long r15 = r15 + r13
            r13 = 1
            long r13 = r15 - r13
            long r15 = r12.getTimeUs(r13)
            long r15 = r15 + r5
            long r12 = r12.getDurationUs(r13, r1)
            long r12 = r12 + r15
            long r9 = java.lang.Math.min(r9, r12)
        L6e:
            int r11 = r11 + 1
            goto L17
        L71:
            return r9
    }

    private static long getAvailableStartTimeInManifestUs(com.google.android.exoplayer2.source.dash.manifest.Period r18, long r19, long r21) {
            r0 = r18
            r1 = r19
            r3 = r21
            long r5 = r0.startMs
            long r5 = com.google.android.exoplayer2.util.Util.msToUs(r5)
            boolean r7 = hasVideoOrAudioAdaptationSets(r18)
            r8 = 0
            r10 = r5
            r9 = 0
        L13:
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.AdaptationSet> r12 = r0.adaptationSets
            int r12 = r12.size()
            if (r9 >= r12) goto L62
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.AdaptationSet> r12 = r0.adaptationSets
            java.lang.Object r12 = r12.get(r9)
            com.google.android.exoplayer2.source.dash.manifest.AdaptationSet r12 = (com.google.android.exoplayer2.source.dash.manifest.AdaptationSet) r12
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.Representation> r13 = r12.representations
            int r12 = r12.type
            r14 = 1
            if (r12 == r14) goto L2e
            r15 = 2
            if (r12 == r15) goto L2e
            goto L2f
        L2e:
            r14 = 0
        L2f:
            if (r7 == 0) goto L33
            if (r14 != 0) goto L5f
        L33:
            boolean r12 = r13.isEmpty()
            if (r12 == 0) goto L3a
            goto L5f
        L3a:
            java.lang.Object r12 = r13.get(r8)
            com.google.android.exoplayer2.source.dash.manifest.Representation r12 = (com.google.android.exoplayer2.source.dash.manifest.Representation) r12
            com.google.android.exoplayer2.source.dash.DashSegmentIndex r12 = r12.getIndex()
            if (r12 != 0) goto L47
            return r5
        L47:
            long r13 = r12.getAvailableSegmentCount(r1, r3)
            r15 = 0
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 != 0) goto L52
            return r5
        L52:
            long r13 = r12.getFirstAvailableSegmentNum(r1, r3)
            long r12 = r12.getTimeUs(r13)
            long r12 = r12 + r5
            long r10 = java.lang.Math.max(r10, r12)
        L5f:
            int r9 = r9 + 1
            goto L13
        L62:
            return r10
    }

    private static long getIntervalUntilNextManifestRefreshMs(com.google.android.exoplayer2.source.dash.manifest.DashManifest r20, long r21) {
            r0 = r20
            int r1 = r20.getPeriodCount()
            int r1 = r1 + (-1)
            com.google.android.exoplayer2.source.dash.manifest.Period r2 = r0.getPeriod(r1)
            long r3 = r2.startMs
            long r3 = com.google.android.exoplayer2.util.Util.msToUs(r3)
            long r5 = r0.getPeriodDurationUs(r1)
            long r7 = com.google.android.exoplayer2.util.Util.msToUs(r21)
            long r0 = r0.availabilityStartTimeMs
            long r0 = com.google.android.exoplayer2.util.Util.msToUs(r0)
            r9 = 5000(0x1388, double:2.4703E-320)
            long r9 = com.google.android.exoplayer2.util.Util.msToUs(r9)
            r11 = 0
            r12 = 0
        L28:
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.AdaptationSet> r13 = r2.adaptationSets
            int r13 = r13.size()
            if (r12 >= r13) goto L6e
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.AdaptationSet> r13 = r2.adaptationSets
            java.lang.Object r13 = r13.get(r12)
            com.google.android.exoplayer2.source.dash.manifest.AdaptationSet r13 = (com.google.android.exoplayer2.source.dash.manifest.AdaptationSet) r13
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.Representation> r13 = r13.representations
            boolean r14 = r13.isEmpty()
            if (r14 == 0) goto L41
            goto L6b
        L41:
            java.lang.Object r13 = r13.get(r11)
            com.google.android.exoplayer2.source.dash.manifest.Representation r13 = (com.google.android.exoplayer2.source.dash.manifest.Representation) r13
            com.google.android.exoplayer2.source.dash.DashSegmentIndex r13 = r13.getIndex()
            if (r13 == 0) goto L6b
            long r14 = r0 + r3
            long r16 = r13.getNextSegmentAvailableTimeUs(r5, r7)
            long r16 = r16 + r14
            long r16 = r16 - r7
            r13 = 100000(0x186a0, double:4.94066E-319)
            long r18 = r9 - r13
            int r15 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r15 < 0) goto L69
            int r15 = (r16 > r9 ? 1 : (r16 == r9 ? 0 : -1))
            if (r15 <= 0) goto L6b
            long r13 = r13 + r9
            int r15 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            if (r15 >= 0) goto L6b
        L69:
            r9 = r16
        L6b:
            int r12 = r12 + 1
            goto L28
        L6e:
            r0 = 1000(0x3e8, double:4.94E-321)
            java.math.RoundingMode r2 = java.math.RoundingMode.CEILING
            long r0 = com.google.common.math.LongMath.divide(r9, r0, r2)
            return r0
    }

    private long getManifestLoadRetryDelayMillis() {
            r2 = this;
            int r0 = r2.staleManifestReloadAttempt
            int r0 = r0 + (-1)
            int r0 = r0 * 1000
            r1 = 5000(0x1388, float:7.006E-42)
            int r0 = java.lang.Math.min(r0, r1)
            long r0 = (long) r0
            return r0
    }

    private static boolean hasVideoOrAudioAdaptationSets(com.google.android.exoplayer2.source.dash.manifest.Period r5) {
            r0 = 0
            r1 = 0
        L2:
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.AdaptationSet> r2 = r5.adaptationSets
            int r2 = r2.size()
            if (r1 >= r2) goto L1f
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.AdaptationSet> r2 = r5.adaptationSets
            java.lang.Object r2 = r2.get(r1)
            com.google.android.exoplayer2.source.dash.manifest.AdaptationSet r2 = (com.google.android.exoplayer2.source.dash.manifest.AdaptationSet) r2
            int r2 = r2.type
            r3 = 1
            if (r2 == r3) goto L1e
            r4 = 2
            if (r2 != r4) goto L1b
            goto L1e
        L1b:
            int r1 = r1 + 1
            goto L2
        L1e:
            return r3
        L1f:
            return r0
    }

    private static boolean isIndexExplicit(com.google.android.exoplayer2.source.dash.manifest.Period r3) {
            r0 = 0
            r1 = 0
        L2:
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.AdaptationSet> r2 = r3.adaptationSets
            int r2 = r2.size()
            if (r1 >= r2) goto L2c
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.AdaptationSet> r2 = r3.adaptationSets
            java.lang.Object r2 = r2.get(r1)
            com.google.android.exoplayer2.source.dash.manifest.AdaptationSet r2 = (com.google.android.exoplayer2.source.dash.manifest.AdaptationSet) r2
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.Representation> r2 = r2.representations
            java.lang.Object r2 = r2.get(r0)
            com.google.android.exoplayer2.source.dash.manifest.Representation r2 = (com.google.android.exoplayer2.source.dash.manifest.Representation) r2
            com.google.android.exoplayer2.source.dash.DashSegmentIndex r2 = r2.getIndex()
            if (r2 == 0) goto L2a
            boolean r2 = r2.isExplicit()
            if (r2 == 0) goto L27
            goto L2a
        L27:
            int r1 = r1 + 1
            goto L2
        L2a:
            r3 = 1
            return r3
        L2c:
            return r0
    }

    private /* synthetic */ void lambda$new$0() {
            r1 = this;
            r0 = 0
            r1.processManifest(r0)
            return
    }

    private void loadNtpTimeOffset() {
            r2 = this;
            com.google.android.exoplayer2.upstream.Loader r0 = r2.loader
            com.google.android.exoplayer2.source.dash.DashMediaSource$1 r1 = new com.google.android.exoplayer2.source.dash.DashMediaSource$1
            r1.<init>(r2)
            com.google.android.exoplayer2.util.SntpClient.initialize(r0, r1)
            return
    }

    private void onUtcTimestampResolutionError(java.io.IOException r3) {
            r2 = this;
            java.lang.String r0 = "DashMediaSource"
            java.lang.String r1 = "Failed to resolve time offset."
            com.google.android.exoplayer2.util.Log.e(r0, r1, r3)
            r3 = 1
            r2.processManifest(r3)
            return
    }

    private void onUtcTimestampResolved(long r1) {
            r0 = this;
            r0.elapsedRealtimeOffsetMs = r1
            r1 = 1
            r0.processManifest(r1)
            return
    }

    private void processManifest(boolean r32) {
            r31 = this;
            r0 = r31
            r1 = 0
            r2 = 0
        L4:
            android.util.SparseArray<com.google.android.exoplayer2.source.dash.DashMediaPeriod> r3 = r0.periodsById
            int r3 = r3.size()
            if (r2 >= r3) goto L29
            android.util.SparseArray<com.google.android.exoplayer2.source.dash.DashMediaPeriod> r3 = r0.periodsById
            int r3 = r3.keyAt(r2)
            int r4 = r0.firstPeriodId
            if (r3 < r4) goto L26
            android.util.SparseArray<com.google.android.exoplayer2.source.dash.DashMediaPeriod> r4 = r0.periodsById
            java.lang.Object r4 = r4.valueAt(r2)
            com.google.android.exoplayer2.source.dash.DashMediaPeriod r4 = (com.google.android.exoplayer2.source.dash.DashMediaPeriod) r4
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r5 = r0.manifest
            int r6 = r0.firstPeriodId
            int r3 = r3 - r6
            r4.updateManifest(r5, r3)
        L26:
            int r2 = r2 + 1
            goto L4
        L29:
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r2 = r0.manifest
            com.google.android.exoplayer2.source.dash.manifest.Period r2 = r2.getPeriod(r1)
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r3 = r0.manifest
            int r3 = r3.getPeriodCount()
            r4 = 1
            int r3 = r3 - r4
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r5 = r0.manifest
            com.google.android.exoplayer2.source.dash.manifest.Period r5 = r5.getPeriod(r3)
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r6 = r0.manifest
            long r6 = r6.getPeriodDurationUs(r3)
            long r8 = r0.elapsedRealtimeOffsetMs
            long r8 = com.google.android.exoplayer2.util.Util.getNowUnixTimeMs(r8)
            long r8 = com.google.android.exoplayer2.util.Util.msToUs(r8)
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r3 = r0.manifest
            long r10 = r3.getPeriodDurationUs(r1)
            long r10 = getAvailableStartTimeInManifestUs(r2, r10, r8)
            long r6 = getAvailableEndTimeInManifestUs(r5, r6, r8)
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r3 = r0.manifest
            boolean r3 = r3.dynamic
            if (r3 == 0) goto L69
            boolean r3 = isIndexExplicit(r5)
            if (r3 != 0) goto L69
            r3 = 1
            goto L6a
        L69:
            r3 = 0
        L6a:
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 == 0) goto L83
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r5 = r0.manifest
            long r14 = r5.timeShiftBufferDepthMs
            int r5 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r5 == 0) goto L83
            long r14 = com.google.android.exoplayer2.util.Util.msToUs(r14)
            long r14 = r6 - r14
            long r10 = java.lang.Math.max(r10, r14)
        L83:
            long r5 = r6 - r10
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r7 = r0.manifest
            boolean r14 = r7.dynamic
            r16 = r2
            if (r14 == 0) goto Ld1
            long r1 = r7.availabilityStartTimeMs
            int r7 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r7 == 0) goto L95
            r1 = 1
            goto L96
        L95:
            r1 = 0
        L96:
            com.google.android.exoplayer2.util.Assertions.checkState(r1)
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r1 = r0.manifest
            long r1 = r1.availabilityStartTimeMs
            long r1 = com.google.android.exoplayer2.util.Util.msToUs(r1)
            long r8 = r8 - r1
            long r8 = r8 - r10
            r0.updateLiveConfiguration(r8, r5)
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r1 = r0.manifest
            long r1 = r1.availabilityStartTimeMs
            long r14 = com.google.android.exoplayer2.util.Util.usToMs(r10)
            long r14 = r14 + r1
            com.google.android.exoplayer2.MediaItem$LiveConfiguration r1 = r0.liveConfiguration
            long r1 = r1.targetOffsetMs
            long r1 = com.google.android.exoplayer2.util.Util.msToUs(r1)
            long r8 = r8 - r1
            r1 = 5000000(0x4c4b40, double:2.470328E-317)
            r17 = 2
            long r12 = r5 / r17
            long r1 = java.lang.Math.min(r1, r12)
            int r4 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r4 >= 0) goto Lca
            r26 = r1
            goto Lcc
        Lca:
            r26 = r8
        Lcc:
            r17 = r14
            r1 = r16
            goto Lda
        Ld1:
            r1 = r16
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r26 = 0
        Lda:
            long r1 = r1.startMs
            long r1 = com.google.android.exoplayer2.util.Util.msToUs(r1)
            long r22 = r10 - r1
            com.google.android.exoplayer2.source.dash.DashMediaSource$DashTimeline r1 = new com.google.android.exoplayer2.source.dash.DashMediaSource$DashTimeline
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r2 = r0.manifest
            long r7 = r2.availabilityStartTimeMs
            long r9 = r0.elapsedRealtimeOffsetMs
            int r4 = r0.firstPeriodId
            com.google.android.exoplayer2.MediaItem r11 = r0.mediaItem
            boolean r12 = r2.dynamic
            if (r12 == 0) goto Lf5
            com.google.android.exoplayer2.MediaItem$LiveConfiguration r12 = r0.liveConfiguration
            goto Lf6
        Lf5:
            r12 = 0
        Lf6:
            r30 = r12
            r14 = r1
            r15 = r7
            r19 = r9
            r21 = r4
            r24 = r5
            r28 = r2
            r29 = r11
            r14.<init>(r15, r17, r19, r21, r22, r24, r26, r28, r29, r30)
            r0.refreshSourceInfo(r1)
            boolean r1 = r0.sideloadedManifest
            if (r1 != 0) goto L15c
            android.os.Handler r1 = r0.handler
            java.lang.Runnable r2 = r0.simulateManifestRefreshRunnable
            r1.removeCallbacks(r2)
            if (r3 == 0) goto L12a
            android.os.Handler r1 = r0.handler
            java.lang.Runnable r2 = r0.simulateManifestRefreshRunnable
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r3 = r0.manifest
            long r4 = r0.elapsedRealtimeOffsetMs
            long r4 = com.google.android.exoplayer2.util.Util.getNowUnixTimeMs(r4)
            long r3 = getIntervalUntilNextManifestRefreshMs(r3, r4)
            r1.postDelayed(r2, r3)
        L12a:
            boolean r1 = r0.manifestLoadPending
            if (r1 == 0) goto L132
            r31.startLoadingManifest()
            goto L15c
        L132:
            if (r32 == 0) goto L15c
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r1 = r0.manifest
            boolean r2 = r1.dynamic
            if (r2 == 0) goto L15c
            long r1 = r1.minUpdatePeriodMs
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L15c
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L14d
            r1 = 5000(0x1388, double:2.4703E-320)
        L14d:
            long r5 = r0.manifestLoadStartTimestampMs
            long r5 = r5 + r1
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r5 = r5 - r1
            long r1 = java.lang.Math.max(r3, r5)
            r0.scheduleManifestRefresh(r1)
        L15c:
            return
    }

    private void resolveUtcTimingElement(com.google.android.exoplayer2.source.dash.manifest.UtcTimingElement r3) {
            r2 = this;
            java.lang.String r0 = r3.schemeIdUri
            java.lang.String r1 = "urn:mpeg:dash:utc:direct:2014"
            boolean r1 = com.google.android.exoplayer2.util.Util.areEqual(r0, r1)
            if (r1 != 0) goto L70
            java.lang.String r1 = "urn:mpeg:dash:utc:direct:2012"
            boolean r1 = com.google.android.exoplayer2.util.Util.areEqual(r0, r1)
            if (r1 == 0) goto L15
            goto L70
        L15:
            java.lang.String r1 = "urn:mpeg:dash:utc:http-iso:2014"
            boolean r1 = com.google.android.exoplayer2.util.Util.areEqual(r0, r1)
            if (r1 != 0) goto L67
            java.lang.String r1 = "urn:mpeg:dash:utc:http-iso:2012"
            boolean r1 = com.google.android.exoplayer2.util.Util.areEqual(r0, r1)
            if (r1 == 0) goto L28
            goto L67
        L28:
            java.lang.String r1 = "urn:mpeg:dash:utc:http-xsdate:2014"
            boolean r1 = com.google.android.exoplayer2.util.Util.areEqual(r0, r1)
            if (r1 != 0) goto L5d
            java.lang.String r1 = "urn:mpeg:dash:utc:http-xsdate:2012"
            boolean r1 = com.google.android.exoplayer2.util.Util.areEqual(r0, r1)
            if (r1 == 0) goto L3b
            goto L5d
        L3b:
            java.lang.String r3 = "urn:mpeg:dash:utc:ntp:2014"
            boolean r3 = com.google.android.exoplayer2.util.Util.areEqual(r0, r3)
            if (r3 != 0) goto L59
            java.lang.String r3 = "urn:mpeg:dash:utc:ntp:2012"
            boolean r3 = com.google.android.exoplayer2.util.Util.areEqual(r0, r3)
            if (r3 == 0) goto L4e
            goto L59
        L4e:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Unsupported UTC timing scheme"
            r3.<init>(r0)
            r2.onUtcTimestampResolutionError(r3)
            goto L73
        L59:
            r2.loadNtpTimeOffset()
            goto L73
        L5d:
            com.google.android.exoplayer2.source.dash.DashMediaSource$XsDateTimeParser r0 = new com.google.android.exoplayer2.source.dash.DashMediaSource$XsDateTimeParser
            r1 = 0
            r0.<init>(r1)
            r2.resolveUtcTimingElementHttp(r3, r0)
            goto L73
        L67:
            com.google.android.exoplayer2.source.dash.DashMediaSource$Iso8601Parser r0 = new com.google.android.exoplayer2.source.dash.DashMediaSource$Iso8601Parser
            r0.<init>()
            r2.resolveUtcTimingElementHttp(r3, r0)
            goto L73
        L70:
            r2.resolveUtcTimingElementDirect(r3)
        L73:
            return
    }

    private void resolveUtcTimingElementDirect(com.google.android.exoplayer2.source.dash.manifest.UtcTimingElement r5) {
            r4 = this;
            java.lang.String r5 = r5.value     // Catch: com.google.android.exoplayer2.ParserException -> Ld
            long r0 = com.google.android.exoplayer2.util.Util.parseXsDateTime(r5)     // Catch: com.google.android.exoplayer2.ParserException -> Ld
            long r2 = r4.manifestLoadEndTimestampMs     // Catch: com.google.android.exoplayer2.ParserException -> Ld
            long r0 = r0 - r2
            r4.onUtcTimestampResolved(r0)     // Catch: com.google.android.exoplayer2.ParserException -> Ld
            goto L11
        Ld:
            r5 = move-exception
            r4.onUtcTimestampResolutionError(r5)
        L11:
            return
    }

    private void resolveUtcTimingElementHttp(com.google.android.exoplayer2.source.dash.manifest.UtcTimingElement r4, com.google.android.exoplayer2.upstream.ParsingLoadable.Parser<java.lang.Long> r5) {
            r3 = this;
            com.google.android.exoplayer2.upstream.ParsingLoadable r0 = new com.google.android.exoplayer2.upstream.ParsingLoadable
            com.google.android.exoplayer2.upstream.DataSource r1 = r3.dataSource
            java.lang.String r4 = r4.value
            android.net.Uri r4 = android.net.Uri.parse(r4)
            r2 = 5
            r0.<init>(r1, r4, r2, r5)
            com.google.android.exoplayer2.source.dash.DashMediaSource$UtcTimestampCallback r4 = new com.google.android.exoplayer2.source.dash.DashMediaSource$UtcTimestampCallback
            r5 = 0
            r4.<init>(r3, r5)
            r5 = 1
            r3.startLoading(r0, r4, r5)
            return
    }

    private void scheduleManifestRefresh(long r3) {
            r2 = this;
            android.os.Handler r0 = r2.handler
            java.lang.Runnable r1 = r2.refreshManifestRunnable
            r0.postDelayed(r1, r3)
            return
    }

    private <T> void startLoading(com.google.android.exoplayer2.upstream.ParsingLoadable<T> r8, com.google.android.exoplayer2.upstream.Loader.Callback<com.google.android.exoplayer2.upstream.ParsingLoadable<T>> r9, int r10) {
            r7 = this;
            com.google.android.exoplayer2.upstream.Loader r0 = r7.loader
            long r5 = r0.startLoading(r8, r9, r10)
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r9 = r7.manifestEventDispatcher
            com.google.android.exoplayer2.source.LoadEventInfo r10 = new com.google.android.exoplayer2.source.LoadEventInfo
            long r2 = r8.loadTaskId
            com.google.android.exoplayer2.upstream.DataSpec r4 = r8.dataSpec
            r1 = r10
            r1.<init>(r2, r4, r5)
            int r8 = r8.type
            r9.loadStarted(r10, r8)
            return
    }

    private void startLoadingManifest() {
            r5 = this;
            android.os.Handler r0 = r5.handler
            java.lang.Runnable r1 = r5.refreshManifestRunnable
            r0.removeCallbacks(r1)
            com.google.android.exoplayer2.upstream.Loader r0 = r5.loader
            boolean r0 = r0.hasFatalError()
            if (r0 == 0) goto L10
            return
        L10:
            com.google.android.exoplayer2.upstream.Loader r0 = r5.loader
            boolean r0 = r0.isLoading()
            if (r0 == 0) goto L1c
            r0 = 1
            r5.manifestLoadPending = r0
            return
        L1c:
            java.lang.Object r0 = r5.manifestUriLock
            monitor-enter(r0)
            android.net.Uri r1 = r5.manifestUri     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            r0 = 0
            r5.manifestLoadPending = r0
            com.google.android.exoplayer2.upstream.ParsingLoadable r0 = new com.google.android.exoplayer2.upstream.ParsingLoadable
            com.google.android.exoplayer2.upstream.DataSource r2 = r5.dataSource
            com.google.android.exoplayer2.upstream.ParsingLoadable$Parser<? extends com.google.android.exoplayer2.source.dash.manifest.DashManifest> r3 = r5.manifestParser
            r4 = 4
            r0.<init>(r2, r1, r4, r3)
            com.google.android.exoplayer2.source.dash.DashMediaSource$ManifestCallback r1 = r5.manifestCallback
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r2 = r5.loadErrorHandlingPolicy
            int r2 = r2.getMinimumLoadableRetryCount(r4)
            r5.startLoading(r0, r1, r2)
            return
        L3b:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            throw r1
    }

    private void updateLiveConfiguration(long r18, long r20) {
            r17 = this;
            r0 = r17
            long r5 = com.google.android.exoplayer2.util.Util.usToMs(r18)
            com.google.android.exoplayer2.MediaItem r1 = r0.mediaItem
            com.google.android.exoplayer2.MediaItem$LiveConfiguration r1 = r1.liveConfiguration
            long r1 = r1.maxOffsetMs
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 == 0) goto L1b
            long r1 = java.lang.Math.min(r5, r1)
        L19:
            r9 = r1
            goto L2d
        L1b:
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r1 = r0.manifest
            com.google.android.exoplayer2.source.dash.manifest.ServiceDescriptionElement r1 = r1.serviceDescription
            if (r1 == 0) goto L2c
            long r1 = r1.maxOffsetMs
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 == 0) goto L2c
            long r1 = java.lang.Math.min(r5, r1)
            goto L19
        L2c:
            r9 = r5
        L2d:
            long r1 = r18 - r20
            long r1 = com.google.android.exoplayer2.util.Util.usToMs(r1)
            r3 = 0
            int r11 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r11 >= 0) goto L3e
            int r11 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r11 <= 0) goto L3e
            r1 = r3
        L3e:
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r3 = r0.manifest
            long r3 = r3.minBufferTimeMs
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto L4b
            long r1 = r1 + r3
            long r1 = java.lang.Math.min(r1, r5)
        L4b:
            r3 = r1
            com.google.android.exoplayer2.MediaItem r1 = r0.mediaItem
            com.google.android.exoplayer2.MediaItem$LiveConfiguration r1 = r1.liveConfiguration
            long r1 = r1.minOffsetMs
            int r11 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r11 == 0) goto L5b
            long r3 = com.google.android.exoplayer2.util.Util.constrainValue(r1, r3, r5)
            goto L6b
        L5b:
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r1 = r0.manifest
            com.google.android.exoplayer2.source.dash.manifest.ServiceDescriptionElement r1 = r1.serviceDescription
            if (r1 == 0) goto L6b
            long r1 = r1.minOffsetMs
            int r11 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r11 == 0) goto L6b
            long r3 = com.google.android.exoplayer2.util.Util.constrainValue(r1, r3, r5)
        L6b:
            int r1 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r1 <= 0) goto L70
            r9 = r3
        L70:
            com.google.android.exoplayer2.MediaItem$LiveConfiguration r1 = r0.liveConfiguration
            long r1 = r1.targetOffsetMs
            int r5 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r5 == 0) goto L79
            goto L90
        L79:
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r1 = r0.manifest
            com.google.android.exoplayer2.source.dash.manifest.ServiceDescriptionElement r2 = r1.serviceDescription
            if (r2 == 0) goto L87
            long r5 = r2.targetOffsetMs
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 == 0) goto L87
            r1 = r5
            goto L90
        L87:
            long r1 = r1.suggestedPresentationDelayMs
            int r5 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r5 == 0) goto L8e
            goto L90
        L8e:
            long r1 = r0.fallbackTargetLiveOffsetMs
        L90:
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L95
            r1 = r3
        L95:
            int r5 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r5 <= 0) goto Lb0
            r1 = 5000000(0x4c4b40, double:2.470328E-317)
            r5 = 2
            long r5 = r20 / r5
            long r1 = java.lang.Math.min(r1, r5)
            long r1 = r18 - r1
            long r11 = com.google.android.exoplayer2.util.Util.usToMs(r1)
            r13 = r3
            r15 = r9
            long r1 = com.google.android.exoplayer2.util.Util.constrainValue(r11, r13, r15)
        Lb0:
            com.google.android.exoplayer2.MediaItem r5 = r0.mediaItem
            com.google.android.exoplayer2.MediaItem$LiveConfiguration r5 = r5.liveConfiguration
            float r6 = r5.minPlaybackSpeed
            r11 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r12 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r12 == 0) goto Lbe
            goto Lca
        Lbe:
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r6 = r0.manifest
            com.google.android.exoplayer2.source.dash.manifest.ServiceDescriptionElement r6 = r6.serviceDescription
            if (r6 == 0) goto Lc7
            float r6 = r6.minPlaybackSpeed
            goto Lca
        Lc7:
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        Lca:
            float r5 = r5.maxPlaybackSpeed
            int r12 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r12 == 0) goto Ld1
            goto Ldd
        Ld1:
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r5 = r0.manifest
            com.google.android.exoplayer2.source.dash.manifest.ServiceDescriptionElement r5 = r5.serviceDescription
            if (r5 == 0) goto Lda
            float r5 = r5.maxPlaybackSpeed
            goto Ldd
        Lda:
            r5 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        Ldd:
            r12 = 1065353216(0x3f800000, float:1.0)
            int r13 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r13 != 0) goto Lf7
            int r11 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r11 != 0) goto Lf7
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r11 = r0.manifest
            com.google.android.exoplayer2.source.dash.manifest.ServiceDescriptionElement r11 = r11.serviceDescription
            if (r11 == 0) goto Lf3
            long r13 = r11.targetOffsetMs
            int r11 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r11 != 0) goto Lf7
        Lf3:
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1065353216(0x3f800000, float:1.0)
        Lf7:
            com.google.android.exoplayer2.MediaItem$LiveConfiguration$Builder r7 = new com.google.android.exoplayer2.MediaItem$LiveConfiguration$Builder
            r7.<init>()
            com.google.android.exoplayer2.MediaItem$LiveConfiguration$Builder r1 = r7.setTargetOffsetMs(r1)
            com.google.android.exoplayer2.MediaItem$LiveConfiguration$Builder r1 = r1.setMinOffsetMs(r3)
            com.google.android.exoplayer2.MediaItem$LiveConfiguration$Builder r1 = r1.setMaxOffsetMs(r9)
            com.google.android.exoplayer2.MediaItem$LiveConfiguration$Builder r1 = r1.setMinPlaybackSpeed(r6)
            com.google.android.exoplayer2.MediaItem$LiveConfiguration$Builder r1 = r1.setMaxPlaybackSpeed(r5)
            com.google.android.exoplayer2.MediaItem$LiveConfiguration r1 = r1.build()
            r0.liveConfiguration = r1
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public com.google.android.exoplayer2.source.MediaPeriod createPeriod(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r21, com.google.android.exoplayer2.upstream.Allocator r22, long r23) {
            r20 = this;
            r0 = r20
            r1 = r21
            r16 = r22
            java.lang.Object r2 = r1.periodUid
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            int r3 = r0.firstPeriodId
            int r3 = r2 - r3
            r6 = r3
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r2 = r0.manifest
            com.google.android.exoplayer2.source.dash.manifest.Period r2 = r2.getPeriod(r3)
            long r4 = r2.startMs
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r12 = r0.createEventDispatcher(r1, r4)
            com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r10 = r20.createDrmEventDispatcher(r21)
            com.google.android.exoplayer2.source.dash.DashMediaPeriod r1 = new com.google.android.exoplayer2.source.dash.DashMediaPeriod
            r2 = r1
            int r4 = r0.firstPeriodId
            int r3 = r3 + r4
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r4 = r0.manifest
            com.google.android.exoplayer2.source.dash.BaseUrlExclusionList r5 = r0.baseUrlExclusionList
            com.google.android.exoplayer2.source.dash.DashChunkSource$Factory r7 = r0.chunkSourceFactory
            com.google.android.exoplayer2.upstream.TransferListener r8 = r0.mediaTransferListener
            com.google.android.exoplayer2.drm.DrmSessionManager r9 = r0.drmSessionManager
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r11 = r0.loadErrorHandlingPolicy
            long r13 = r0.elapsedRealtimeOffsetMs
            com.google.android.exoplayer2.upstream.LoaderErrorThrower r15 = r0.manifestLoadErrorThrower
            r21 = r1
            com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory r1 = r0.compositeSequenceableLoaderFactory
            r17 = r1
            com.google.android.exoplayer2.source.dash.PlayerEmsgHandler$PlayerEmsgCallback r1 = r0.playerEmsgCallback
            r18 = r1
            com.google.android.exoplayer2.analytics.PlayerId r19 = r20.getPlayerId()
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r19)
            android.util.SparseArray<com.google.android.exoplayer2.source.dash.DashMediaPeriod> r1 = r0.periodsById
            r2 = r21
            int r3 = r2.id
            r1.put(r3, r2)
            return r2
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public com.google.android.exoplayer2.MediaItem getMediaItem() {
            r1 = this;
            com.google.android.exoplayer2.MediaItem r0 = r1.mediaItem
            return r0
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws java.io.IOException {
            r1 = this;
            com.google.android.exoplayer2.upstream.LoaderErrorThrower r0 = r1.manifestLoadErrorThrower
            r0.maybeThrowError()
            return
    }

    public final void onDashManifestPublishTimeExpired(long r6) {
            r5 = this;
            long r0 = r5.expiredManifestPublishTimeUs
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lf
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 >= 0) goto L11
        Lf:
            r5.expiredManifestPublishTimeUs = r6
        L11:
            return
    }

    public final void onDashManifestRefreshRequested() {
            r2 = this;
            android.os.Handler r0 = r2.handler
            java.lang.Runnable r1 = r2.simulateManifestRefreshRunnable
            r0.removeCallbacks(r1)
            r2.startLoadingManifest()
            return
    }

    public final void onLoadCanceled(com.google.android.exoplayer2.upstream.ParsingLoadable<?> r16, long r17, long r19) {
            r15 = this;
            r0 = r15
            r1 = r16
            com.google.android.exoplayer2.source.LoadEventInfo r14 = new com.google.android.exoplayer2.source.LoadEventInfo
            long r3 = r1.loadTaskId
            com.google.android.exoplayer2.upstream.DataSpec r5 = r1.dataSpec
            android.net.Uri r6 = r16.getUri()
            java.util.Map r7 = r16.getResponseHeaders()
            long r12 = r16.bytesLoaded()
            r2 = r14
            r8 = r17
            r10 = r19
            r2.<init>(r3, r5, r6, r7, r8, r10, r12)
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r2 = r0.loadErrorHandlingPolicy
            long r3 = r1.loadTaskId
            r2.onLoadTaskConcluded(r3)
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r2 = r0.manifestEventDispatcher
            int r1 = r1.type
            r2.loadCanceled(r14, r1)
            return
    }

    public final void onManifestLoadCompleted(com.google.android.exoplayer2.upstream.ParsingLoadable<com.google.android.exoplayer2.source.dash.manifest.DashManifest> r19, long r20, long r22) {
            r18 = this;
            r1 = r18
            r0 = r19
            r14 = r20
            com.google.android.exoplayer2.source.LoadEventInfo r12 = new com.google.android.exoplayer2.source.LoadEventInfo
            long r3 = r0.loadTaskId
            com.google.android.exoplayer2.upstream.DataSpec r5 = r0.dataSpec
            android.net.Uri r6 = r19.getUri()
            java.util.Map r7 = r19.getResponseHeaders()
            long r16 = r19.bytesLoaded()
            r2 = r12
            r8 = r20
            r10 = r22
            r14 = r12
            r12 = r16
            r2.<init>(r3, r5, r6, r7, r8, r10, r12)
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r2 = r1.loadErrorHandlingPolicy
            long r3 = r0.loadTaskId
            r2.onLoadTaskConcluded(r3)
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r2 = r1.manifestEventDispatcher
            int r3 = r0.type
            r2.loadCompleted(r14, r3)
            java.lang.Object r2 = r19.getResult()
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r2 = (com.google.android.exoplayer2.source.dash.manifest.DashManifest) r2
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r3 = r1.manifest
            r4 = 0
            if (r3 != 0) goto L3e
            r3 = 0
            goto L42
        L3e:
            int r3 = r3.getPeriodCount()
        L42:
            com.google.android.exoplayer2.source.dash.manifest.Period r5 = r2.getPeriod(r4)
            long r5 = r5.startMs
            r7 = 0
        L49:
            if (r7 >= r3) goto L5a
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r8 = r1.manifest
            com.google.android.exoplayer2.source.dash.manifest.Period r8 = r8.getPeriod(r7)
            long r8 = r8.startMs
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 >= 0) goto L5a
            int r7 = r7 + 1
            goto L49
        L5a:
            boolean r5 = r2.dynamic
            r6 = 1
            if (r5 == 0) goto Lc9
            int r5 = r3 - r7
            int r8 = r2.getPeriodCount()
            if (r5 <= r8) goto L6f
            java.lang.String r5 = "DashMediaSource"
            java.lang.String r8 = "Loaded out of sync manifest"
            com.google.android.exoplayer2.util.Log.w(r5, r8)
            goto La2
        L6f:
            long r8 = r1.expiredManifestPublishTimeUs
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 == 0) goto La4
            long r10 = r2.publishTimeMs
            r12 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r12
            int r5 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r5 > 0) goto La4
            java.lang.String r5 = "DashMediaSource"
            java.lang.String r8 = "Loaded stale dynamic manifest: "
            java.lang.StringBuilder r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r8)
            long r9 = r2.publishTimeMs
            r8.append(r9)
            java.lang.String r9 = ", "
            r8.append(r9)
            long r9 = r1.expiredManifestPublishTimeUs
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.google.android.exoplayer2.util.Log.w(r5, r8)
        La2:
            r5 = 1
            goto La5
        La4:
            r5 = 0
        La5:
            if (r5 == 0) goto Lc7
            int r2 = r1.staleManifestReloadAttempt
            int r3 = r2 + 1
            r1.staleManifestReloadAttempt = r3
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r3 = r1.loadErrorHandlingPolicy
            int r0 = r0.type
            int r0 = r3.getMinimumLoadableRetryCount(r0)
            if (r2 >= r0) goto Lbf
            long r2 = r18.getManifestLoadRetryDelayMillis()
            r1.scheduleManifestRefresh(r2)
            goto Lc6
        Lbf:
            com.google.android.exoplayer2.source.dash.DashManifestStaleException r0 = new com.google.android.exoplayer2.source.dash.DashManifestStaleException
            r0.<init>()
            r1.manifestFatalError = r0
        Lc6:
            return
        Lc7:
            r1.staleManifestReloadAttempt = r4
        Lc9:
            r1.manifest = r2
            boolean r5 = r1.manifestLoadPending
            boolean r2 = r2.dynamic
            r2 = r2 & r5
            r1.manifestLoadPending = r2
            r8 = r20
            long r10 = r8 - r22
            r1.manifestLoadStartTimestampMs = r10
            r1.manifestLoadEndTimestampMs = r8
            java.lang.Object r2 = r1.manifestUriLock
            monitor-enter(r2)
            com.google.android.exoplayer2.upstream.DataSpec r5 = r0.dataSpec     // Catch: java.lang.Throwable -> L117
            android.net.Uri r5 = r5.uri     // Catch: java.lang.Throwable -> L117
            android.net.Uri r8 = r1.manifestUri     // Catch: java.lang.Throwable -> L117
            if (r5 != r8) goto Le6
            r4 = 1
        Le6:
            if (r4 == 0) goto Lf5
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r4 = r1.manifest     // Catch: java.lang.Throwable -> L117
            android.net.Uri r4 = r4.location     // Catch: java.lang.Throwable -> L117
            if (r4 == 0) goto Lef
            goto Lf3
        Lef:
            android.net.Uri r4 = r19.getUri()     // Catch: java.lang.Throwable -> L117
        Lf3:
            r1.manifestUri = r4     // Catch: java.lang.Throwable -> L117
        Lf5:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L117
            if (r3 != 0) goto L10e
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r0 = r1.manifest
            boolean r2 = r0.dynamic
            if (r2 == 0) goto L10a
            com.google.android.exoplayer2.source.dash.manifest.UtcTimingElement r0 = r0.utcTiming
            if (r0 == 0) goto L106
            r1.resolveUtcTimingElement(r0)
            goto L116
        L106:
            r18.loadNtpTimeOffset()
            goto L116
        L10a:
            r1.processManifest(r6)
            goto L116
        L10e:
            int r0 = r1.firstPeriodId
            int r0 = r0 + r7
            r1.firstPeriodId = r0
            r1.processManifest(r6)
        L116:
            return
        L117:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L117
            throw r0
    }

    public final com.google.android.exoplayer2.upstream.Loader.LoadErrorAction onManifestLoadError(com.google.android.exoplayer2.upstream.ParsingLoadable<com.google.android.exoplayer2.source.dash.manifest.DashManifest> r17, long r18, long r20, java.io.IOException r22, int r23) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r22
            com.google.android.exoplayer2.source.LoadEventInfo r15 = new com.google.android.exoplayer2.source.LoadEventInfo
            long r4 = r1.loadTaskId
            com.google.android.exoplayer2.upstream.DataSpec r6 = r1.dataSpec
            android.net.Uri r7 = r17.getUri()
            java.util.Map r8 = r17.getResponseHeaders()
            long r13 = r17.bytesLoaded()
            r3 = r15
            r9 = r18
            r11 = r20
            r3.<init>(r4, r6, r7, r8, r9, r11, r13)
            com.google.android.exoplayer2.source.MediaLoadData r3 = new com.google.android.exoplayer2.source.MediaLoadData
            int r4 = r1.type
            r3.<init>(r4)
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy$LoadErrorInfo r4 = new com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy$LoadErrorInfo
            r5 = r23
            r4.<init>(r15, r3, r2, r5)
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r3 = r0.loadErrorHandlingPolicy
            long r3 = r3.getRetryDelayMsFor(r4)
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L40
            com.google.android.exoplayer2.upstream.Loader$LoadErrorAction r3 = com.google.android.exoplayer2.upstream.Loader.DONT_RETRY_FATAL
            goto L45
        L40:
            r5 = 0
            com.google.android.exoplayer2.upstream.Loader$LoadErrorAction r3 = com.google.android.exoplayer2.upstream.Loader.createRetryAction(r5, r3)
        L45:
            boolean r4 = r3.isRetry()
            r4 = r4 ^ 1
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r5 = r0.manifestEventDispatcher
            int r6 = r1.type
            r5.loadError(r15, r6, r2, r4)
            if (r4 == 0) goto L5b
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r2 = r0.loadErrorHandlingPolicy
            long r4 = r1.loadTaskId
            r2.onLoadTaskConcluded(r4)
        L5b:
            return r3
    }

    public final void onUtcTimestampLoadCompleted(com.google.android.exoplayer2.upstream.ParsingLoadable<java.lang.Long> r16, long r17, long r19) {
            r15 = this;
            r0 = r15
            r1 = r16
            com.google.android.exoplayer2.source.LoadEventInfo r14 = new com.google.android.exoplayer2.source.LoadEventInfo
            long r3 = r1.loadTaskId
            com.google.android.exoplayer2.upstream.DataSpec r5 = r1.dataSpec
            android.net.Uri r6 = r16.getUri()
            java.util.Map r7 = r16.getResponseHeaders()
            long r12 = r16.bytesLoaded()
            r2 = r14
            r8 = r17
            r10 = r19
            r2.<init>(r3, r5, r6, r7, r8, r10, r12)
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r2 = r0.loadErrorHandlingPolicy
            long r3 = r1.loadTaskId
            r2.onLoadTaskConcluded(r3)
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r2 = r0.manifestEventDispatcher
            int r3 = r1.type
            r2.loadCompleted(r14, r3)
            java.lang.Object r1 = r16.getResult()
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r1 = r1 - r17
            r15.onUtcTimestampResolved(r1)
            return
    }

    public final com.google.android.exoplayer2.upstream.Loader.LoadErrorAction onUtcTimestampLoadError(com.google.android.exoplayer2.upstream.ParsingLoadable<java.lang.Long> r18, long r19, long r21, java.io.IOException r23) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r23
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r3 = r0.manifestEventDispatcher
            com.google.android.exoplayer2.source.LoadEventInfo r14 = new com.google.android.exoplayer2.source.LoadEventInfo
            long r5 = r1.loadTaskId
            com.google.android.exoplayer2.upstream.DataSpec r7 = r1.dataSpec
            android.net.Uri r8 = r18.getUri()
            java.util.Map r9 = r18.getResponseHeaders()
            long r15 = r18.bytesLoaded()
            r4 = r14
            r10 = r19
            r12 = r21
            r0 = r14
            r14 = r15
            r4.<init>(r5, r7, r8, r9, r10, r12, r14)
            int r4 = r1.type
            r5 = 1
            r3.loadError(r0, r4, r2, r5)
            r0 = r17
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r3 = r0.loadErrorHandlingPolicy
            long r4 = r1.loadTaskId
            r3.onLoadTaskConcluded(r4)
            r0.onUtcTimestampResolutionError(r2)
            com.google.android.exoplayer2.upstream.Loader$LoadErrorAction r1 = com.google.android.exoplayer2.upstream.Loader.DONT_RETRY
            return r1
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public final void prepareSourceInternal(@androidx.annotation.Nullable com.google.android.exoplayer2.upstream.TransferListener r3) {
            r2 = this;
            r2.mediaTransferListener = r3
            com.google.android.exoplayer2.drm.DrmSessionManager r3 = r2.drmSessionManager
            r3.prepare()
            com.google.android.exoplayer2.drm.DrmSessionManager r3 = r2.drmSessionManager
            android.os.Looper r0 = android.os.Looper.myLooper()
            com.google.android.exoplayer2.analytics.PlayerId r1 = r2.getPlayerId()
            r3.setPlayer(r0, r1)
            boolean r3 = r2.sideloadedManifest
            if (r3 == 0) goto L1d
            r3 = 0
            r2.processManifest(r3)
            goto L37
        L1d:
            com.google.android.exoplayer2.upstream.DataSource$Factory r3 = r2.manifestDataSourceFactory
            com.google.android.exoplayer2.upstream.DataSource r3 = r3.createDataSource()
            r2.dataSource = r3
            com.google.android.exoplayer2.upstream.Loader r3 = new com.google.android.exoplayer2.upstream.Loader
            java.lang.String r0 = "DashMediaSource"
            r3.<init>(r0)
            r2.loader = r3
            android.os.Handler r3 = com.google.android.exoplayer2.util.Util.createHandlerForCurrentLooper()
            r2.handler = r3
            r2.startLoadingManifest()
        L37:
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(com.google.android.exoplayer2.source.MediaPeriod r2) {
            r1 = this;
            com.google.android.exoplayer2.source.dash.DashMediaPeriod r2 = (com.google.android.exoplayer2.source.dash.DashMediaPeriod) r2
            r2.release()
            android.util.SparseArray<com.google.android.exoplayer2.source.dash.DashMediaPeriod> r0 = r1.periodsById
            int r2 = r2.id
            r0.remove(r2)
            return
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public final void releaseSourceInternal() {
            r4 = this;
            r0 = 0
            r4.manifestLoadPending = r0
            r1 = 0
            r4.dataSource = r1
            com.google.android.exoplayer2.upstream.Loader r2 = r4.loader
            if (r2 == 0) goto Lf
            r2.release()
            r4.loader = r1
        Lf:
            r2 = 0
            r4.manifestLoadStartTimestampMs = r2
            r4.manifestLoadEndTimestampMs = r2
            boolean r2 = r4.sideloadedManifest
            if (r2 == 0) goto L1c
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r2 = r4.manifest
            goto L1d
        L1c:
            r2 = r1
        L1d:
            r4.manifest = r2
            android.net.Uri r2 = r4.initialManifestUri
            r4.manifestUri = r2
            r4.manifestFatalError = r1
            android.os.Handler r2 = r4.handler
            if (r2 == 0) goto L2e
            r2.removeCallbacksAndMessages(r1)
            r4.handler = r1
        L2e:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4.elapsedRealtimeOffsetMs = r1
            r4.staleManifestReloadAttempt = r0
            r4.expiredManifestPublishTimeUs = r1
            r4.firstPeriodId = r0
            android.util.SparseArray<com.google.android.exoplayer2.source.dash.DashMediaPeriod> r0 = r4.periodsById
            r0.clear()
            com.google.android.exoplayer2.source.dash.BaseUrlExclusionList r0 = r4.baseUrlExclusionList
            r0.reset()
            com.google.android.exoplayer2.drm.DrmSessionManager r0 = r4.drmSessionManager
            r0.release()
            return
    }

    public void replaceManifestUri(android.net.Uri r2) {
            r1 = this;
            java.lang.Object r0 = r1.manifestUriLock
            monitor-enter(r0)
            r1.manifestUri = r2     // Catch: java.lang.Throwable -> L9
            r1.initialManifestUri = r2     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r2
    }
}
