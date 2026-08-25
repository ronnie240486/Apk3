package com.google.android.exoplayer2.source;

/* JADX INFO: loaded from: classes3.dex */
public final class ProgressiveMediaSource extends com.google.android.exoplayer2.source.BaseMediaSource implements com.google.android.exoplayer2.source.ProgressiveMediaPeriod.Listener {
    public static final int DEFAULT_LOADING_CHECK_INTERVAL_BYTES = 1048576;
    private final int continueLoadingCheckIntervalBytes;
    private final com.google.android.exoplayer2.upstream.DataSource.Factory dataSourceFactory;
    private final com.google.android.exoplayer2.drm.DrmSessionManager drmSessionManager;
    private final com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy loadableLoadErrorHandlingPolicy;
    private final com.google.android.exoplayer2.MediaItem.LocalConfiguration localConfiguration;
    private final com.google.android.exoplayer2.MediaItem mediaItem;
    private final com.google.android.exoplayer2.source.ProgressiveMediaExtractor.Factory progressiveMediaExtractorFactory;
    private long timelineDurationUs;
    private boolean timelineIsLive;
    private boolean timelineIsPlaceholder;
    private boolean timelineIsSeekable;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.upstream.TransferListener transferListener;


    public static final class Factory implements com.google.android.exoplayer2.source.MediaSourceFactory {
        private int continueLoadingCheckIntervalBytes;

        @androidx.annotation.Nullable
        private java.lang.String customCacheKey;
        private final com.google.android.exoplayer2.upstream.DataSource.Factory dataSourceFactory;
        private com.google.android.exoplayer2.drm.DrmSessionManagerProvider drmSessionManagerProvider;
        private com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;
        private com.google.android.exoplayer2.source.ProgressiveMediaExtractor.Factory progressiveMediaExtractorFactory;

        @androidx.annotation.Nullable
        private java.lang.Object tag;

        public static /* synthetic */ com.google.android.exoplayer2.source.ProgressiveMediaExtractor $r8$lambda$y4TETOfcSxTmcpg0vTpcLE9i7ek(com.google.android.exoplayer2.extractor.ExtractorsFactory r0, com.google.android.exoplayer2.analytics.PlayerId r1) {
                com.google.android.exoplayer2.source.ProgressiveMediaExtractor r0 = lambda$new$0(r0, r1)
                return r0
        }

        public Factory(com.google.android.exoplayer2.upstream.DataSource.Factory r2) {
                r1 = this;
                com.google.android.exoplayer2.extractor.DefaultExtractorsFactory r0 = new com.google.android.exoplayer2.extractor.DefaultExtractorsFactory
                r0.<init>()
                r1.<init>(r2, r0)
                return
        }

        public Factory(com.google.android.exoplayer2.upstream.DataSource.Factory r2, com.google.android.exoplayer2.extractor.ExtractorsFactory r3) {
                r1 = this;
                com.google.android.material.search.SearchBar$$ExternalSyntheticLambda0 r0 = new com.google.android.material.search.SearchBar$$ExternalSyntheticLambda0
                r0.<init>(r3)
                r1.<init>(r2, r0)
                return
        }

        public Factory(com.google.android.exoplayer2.upstream.DataSource.Factory r7, com.google.android.exoplayer2.source.ProgressiveMediaExtractor.Factory r8) {
                r6 = this;
                com.google.android.exoplayer2.drm.DefaultDrmSessionManagerProvider r3 = new com.google.android.exoplayer2.drm.DefaultDrmSessionManagerProvider
                r3.<init>()
                com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy r4 = new com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy
                r4.<init>()
                r5 = 1048576(0x100000, float:1.469368E-39)
                r0 = r6
                r1 = r7
                r2 = r8
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        public Factory(com.google.android.exoplayer2.upstream.DataSource.Factory r1, com.google.android.exoplayer2.source.ProgressiveMediaExtractor.Factory r2, com.google.android.exoplayer2.drm.DrmSessionManagerProvider r3, com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r4, int r5) {
                r0 = this;
                r0.<init>()
                r0.dataSourceFactory = r1
                r0.progressiveMediaExtractorFactory = r2
                r0.drmSessionManagerProvider = r3
                r0.loadErrorHandlingPolicy = r4
                r0.continueLoadingCheckIntervalBytes = r5
                return
        }

        private static /* synthetic */ com.google.android.exoplayer2.source.ProgressiveMediaExtractor lambda$new$0(com.google.android.exoplayer2.extractor.ExtractorsFactory r0, com.google.android.exoplayer2.analytics.PlayerId r1) {
                com.google.android.exoplayer2.source.BundledExtractorsAdapter r1 = new com.google.android.exoplayer2.source.BundledExtractorsAdapter
                r1.<init>(r0)
                return r1
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.source.MediaSource createMediaSource(com.google.android.exoplayer2.MediaItem r1) {
                r0 = this;
                com.google.android.exoplayer2.source.ProgressiveMediaSource r1 = r0.createMediaSource(r1)
                return r1
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        public com.google.android.exoplayer2.source.ProgressiveMediaSource createMediaSource(com.google.android.exoplayer2.MediaItem r9) {
                r8 = this;
                com.google.android.exoplayer2.MediaItem$LocalConfiguration r0 = r9.localConfiguration
                com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
                com.google.android.exoplayer2.MediaItem$LocalConfiguration r0 = r9.localConfiguration
                java.lang.Object r1 = r0.tag
                r2 = 1
                r3 = 0
                if (r1 != 0) goto L13
                java.lang.Object r1 = r8.tag
                if (r1 == 0) goto L13
                r1 = 1
                goto L14
            L13:
                r1 = 0
            L14:
                java.lang.String r0 = r0.customCacheKey
                if (r0 != 0) goto L1d
                java.lang.String r0 = r8.customCacheKey
                if (r0 == 0) goto L1d
                goto L1e
            L1d:
                r2 = 0
            L1e:
                if (r1 == 0) goto L37
                if (r2 == 0) goto L37
                com.google.android.exoplayer2.MediaItem$Builder r9 = r9.buildUpon()
                java.lang.Object r0 = r8.tag
                com.google.android.exoplayer2.MediaItem$Builder r9 = r9.setTag(r0)
                java.lang.String r0 = r8.customCacheKey
                com.google.android.exoplayer2.MediaItem$Builder r9 = r9.setCustomCacheKey(r0)
                com.google.android.exoplayer2.MediaItem r9 = r9.build()
                goto L58
            L37:
                if (r1 == 0) goto L48
                com.google.android.exoplayer2.MediaItem$Builder r9 = r9.buildUpon()
                java.lang.Object r0 = r8.tag
                com.google.android.exoplayer2.MediaItem$Builder r9 = r9.setTag(r0)
                com.google.android.exoplayer2.MediaItem r9 = r9.build()
                goto L58
            L48:
                if (r2 == 0) goto L58
                com.google.android.exoplayer2.MediaItem$Builder r9 = r9.buildUpon()
                java.lang.String r0 = r8.customCacheKey
                com.google.android.exoplayer2.MediaItem$Builder r9 = r9.setCustomCacheKey(r0)
                com.google.android.exoplayer2.MediaItem r9 = r9.build()
            L58:
                r1 = r9
                com.google.android.exoplayer2.source.ProgressiveMediaSource r9 = new com.google.android.exoplayer2.source.ProgressiveMediaSource
                com.google.android.exoplayer2.upstream.DataSource$Factory r2 = r8.dataSourceFactory
                com.google.android.exoplayer2.source.ProgressiveMediaExtractor$Factory r3 = r8.progressiveMediaExtractorFactory
                com.google.android.exoplayer2.drm.DrmSessionManagerProvider r0 = r8.drmSessionManagerProvider
                com.google.android.exoplayer2.drm.DrmSessionManager r4 = r0.get(r1)
                com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r5 = r8.loadErrorHandlingPolicy
                int r6 = r8.continueLoadingCheckIntervalBytes
                r7 = 0
                r0 = r9
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return r9
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        public int[] getSupportedTypes() {
                r3 = this;
                r0 = 1
                int[] r0 = new int[r0]
                r1 = 0
                r2 = 4
                r0[r1] = r2
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.source.ProgressiveMediaSource.Factory setContinueLoadingCheckIntervalBytes(int r1) {
                r0 = this;
                r0.continueLoadingCheckIntervalBytes = r1
                return r0
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.source.MediaSource.Factory setDrmSessionManagerProvider(com.google.android.exoplayer2.drm.DrmSessionManagerProvider r1) {
                r0 = this;
                com.google.android.exoplayer2.source.ProgressiveMediaSource$Factory r1 = r0.setDrmSessionManagerProvider(r1)
                return r1
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.source.ProgressiveMediaSource.Factory setDrmSessionManagerProvider(com.google.android.exoplayer2.drm.DrmSessionManagerProvider r2) {
                r1 = this;
                java.lang.String r0 = "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."
                java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2, r0)
                com.google.android.exoplayer2.drm.DrmSessionManagerProvider r2 = (com.google.android.exoplayer2.drm.DrmSessionManagerProvider) r2
                r1.drmSessionManagerProvider = r2
                return r1
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.source.MediaSource.Factory setLoadErrorHandlingPolicy(com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r1) {
                r0 = this;
                com.google.android.exoplayer2.source.ProgressiveMediaSource$Factory r1 = r0.setLoadErrorHandlingPolicy(r1)
                return r1
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.source.ProgressiveMediaSource.Factory setLoadErrorHandlingPolicy(com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r2) {
                r1 = this;
                java.lang.String r0 = "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior."
                java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2, r0)
                com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r2 = (com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy) r2
                r1.loadErrorHandlingPolicy = r2
                return r1
        }
    }

    private ProgressiveMediaSource(com.google.android.exoplayer2.MediaItem r2, com.google.android.exoplayer2.upstream.DataSource.Factory r3, com.google.android.exoplayer2.source.ProgressiveMediaExtractor.Factory r4, com.google.android.exoplayer2.drm.DrmSessionManager r5, com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r6, int r7) {
            r1 = this;
            r1.<init>()
            com.google.android.exoplayer2.MediaItem$LocalConfiguration r0 = r2.localConfiguration
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.MediaItem$LocalConfiguration r0 = (com.google.android.exoplayer2.MediaItem.LocalConfiguration) r0
            r1.localConfiguration = r0
            r1.mediaItem = r2
            r1.dataSourceFactory = r3
            r1.progressiveMediaExtractorFactory = r4
            r1.drmSessionManager = r5
            r1.loadableLoadErrorHandlingPolicy = r6
            r1.continueLoadingCheckIntervalBytes = r7
            r2 = 1
            r1.timelineIsPlaceholder = r2
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.timelineDurationUs = r2
            return
    }

    public /* synthetic */ ProgressiveMediaSource(com.google.android.exoplayer2.MediaItem r1, com.google.android.exoplayer2.upstream.DataSource.Factory r2, com.google.android.exoplayer2.source.ProgressiveMediaExtractor.Factory r3, com.google.android.exoplayer2.drm.DrmSessionManager r4, com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r5, int r6, com.google.android.exoplayer2.source.ProgressiveMediaSource.AnonymousClass1 r7) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    private void notifySourceInfoRefreshed() {
            r9 = this;
            com.google.android.exoplayer2.source.SinglePeriodTimeline r8 = new com.google.android.exoplayer2.source.SinglePeriodTimeline
            long r1 = r9.timelineDurationUs
            boolean r3 = r9.timelineIsSeekable
            boolean r5 = r9.timelineIsLive
            com.google.android.exoplayer2.MediaItem r7 = r9.mediaItem
            r4 = 0
            r6 = 0
            r0 = r8
            r0.<init>(r1, r3, r4, r5, r6, r7)
            boolean r0 = r9.timelineIsPlaceholder
            if (r0 == 0) goto L1a
            com.google.android.exoplayer2.source.ProgressiveMediaSource$1 r0 = new com.google.android.exoplayer2.source.ProgressiveMediaSource$1
            r0.<init>(r8)
            r8 = r0
        L1a:
            r9.refreshSourceInfo(r8)
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public com.google.android.exoplayer2.source.MediaPeriod createPeriod(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r15, com.google.android.exoplayer2.upstream.Allocator r16, long r17) {
            r14 = this;
            r12 = r14
            com.google.android.exoplayer2.upstream.DataSource$Factory r0 = r12.dataSourceFactory
            com.google.android.exoplayer2.upstream.DataSource r2 = r0.createDataSource()
            com.google.android.exoplayer2.upstream.TransferListener r0 = r12.transferListener
            if (r0 == 0) goto Le
            r2.addTransferListener(r0)
        Le:
            com.google.android.exoplayer2.source.ProgressiveMediaPeriod r13 = new com.google.android.exoplayer2.source.ProgressiveMediaPeriod
            com.google.android.exoplayer2.MediaItem$LocalConfiguration r0 = r12.localConfiguration
            android.net.Uri r1 = r0.uri
            com.google.android.exoplayer2.source.ProgressiveMediaExtractor$Factory r0 = r12.progressiveMediaExtractorFactory
            com.google.android.exoplayer2.analytics.PlayerId r3 = r14.getPlayerId()
            com.google.android.exoplayer2.source.ProgressiveMediaExtractor r3 = r0.createProgressiveMediaExtractor(r3)
            com.google.android.exoplayer2.drm.DrmSessionManager r4 = r12.drmSessionManager
            com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r5 = r14.createDrmEventDispatcher(r15)
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r6 = r12.loadableLoadErrorHandlingPolicy
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r7 = r14.createEventDispatcher(r15)
            com.google.android.exoplayer2.MediaItem$LocalConfiguration r0 = r12.localConfiguration
            java.lang.String r10 = r0.customCacheKey
            int r11 = r12.continueLoadingCheckIntervalBytes
            r0 = r13
            r8 = r14
            r9 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r13
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public com.google.android.exoplayer2.MediaItem getMediaItem() {
            r1 = this;
            com.google.android.exoplayer2.MediaItem r0 = r1.mediaItem
            return r0
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaPeriod.Listener
    public void onSourceInfoRefreshed(long r4, boolean r6, boolean r7) {
            r3 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto Lb
            long r4 = r3.timelineDurationUs
        Lb:
            boolean r0 = r3.timelineIsPlaceholder
            if (r0 != 0) goto L1e
            long r0 = r3.timelineDurationUs
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L1e
            boolean r0 = r3.timelineIsSeekable
            if (r0 != r6) goto L1e
            boolean r0 = r3.timelineIsLive
            if (r0 != r7) goto L1e
            return
        L1e:
            r3.timelineDurationUs = r4
            r3.timelineIsSeekable = r6
            r3.timelineIsLive = r7
            r4 = 0
            r3.timelineIsPlaceholder = r4
            r3.notifySourceInfoRefreshed()
            return
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public final void prepareSourceInternal(@androidx.annotation.Nullable com.google.android.exoplayer2.upstream.TransferListener r3) {
            r2 = this;
            r2.transferListener = r3
            com.google.android.exoplayer2.drm.DrmSessionManager r3 = r2.drmSessionManager
            r3.prepare()
            com.google.android.exoplayer2.drm.DrmSessionManager r3 = r2.drmSessionManager
            android.os.Looper r0 = android.os.Looper.myLooper()
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            android.os.Looper r0 = (android.os.Looper) r0
            com.google.android.exoplayer2.analytics.PlayerId r1 = r2.getPlayerId()
            r3.setPlayer(r0, r1)
            r2.notifySourceInfoRefreshed()
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(com.google.android.exoplayer2.source.MediaPeriod r1) {
            r0 = this;
            com.google.android.exoplayer2.source.ProgressiveMediaPeriod r1 = (com.google.android.exoplayer2.source.ProgressiveMediaPeriod) r1
            r1.release()
            return
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public final void releaseSourceInternal() {
            r1 = this;
            com.google.android.exoplayer2.drm.DrmSessionManager r0 = r1.drmSessionManager
            r0.release()
            return
    }
}
