package com.google.android.exoplayer2.source.hls;

/* JADX INFO: loaded from: classes2.dex */
public final class HlsMediaSource extends com.google.android.exoplayer2.source.BaseMediaSource implements com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.PrimaryPlaylistListener {
    public static final int METADATA_TYPE_EMSG = 3;
    public static final int METADATA_TYPE_ID3 = 1;
    private final boolean allowChunklessPreparation;
    private final com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private final com.google.android.exoplayer2.source.hls.HlsDataSourceFactory dataSourceFactory;
    private final com.google.android.exoplayer2.drm.DrmSessionManager drmSessionManager;
    private final long elapsedRealTimeOffsetMs;
    private final com.google.android.exoplayer2.source.hls.HlsExtractorFactory extractorFactory;
    private com.google.android.exoplayer2.MediaItem.LiveConfiguration liveConfiguration;
    private final com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private final com.google.android.exoplayer2.MediaItem.LocalConfiguration localConfiguration;
    private final com.google.android.exoplayer2.MediaItem mediaItem;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.upstream.TransferListener mediaTransferListener;
    private final int metadataType;
    private final com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker playlistTracker;
    private final boolean useSessionKeys;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.HlsMediaSource$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class Factory implements com.google.android.exoplayer2.source.MediaSourceFactory {
        private boolean allowChunklessPreparation;
        private com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
        private com.google.android.exoplayer2.drm.DrmSessionManagerProvider drmSessionManagerProvider;
        private long elapsedRealTimeOffsetMs;
        private com.google.android.exoplayer2.source.hls.HlsExtractorFactory extractorFactory;
        private final com.google.android.exoplayer2.source.hls.HlsDataSourceFactory hlsDataSourceFactory;
        private com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;
        private int metadataType;
        private com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParserFactory playlistParserFactory;
        private com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.Factory playlistTrackerFactory;
        private boolean useSessionKeys;

        public Factory(com.google.android.exoplayer2.source.hls.HlsDataSourceFactory r3) {
                r2 = this;
                r2.<init>()
                java.lang.Object r3 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
                com.google.android.exoplayer2.source.hls.HlsDataSourceFactory r3 = (com.google.android.exoplayer2.source.hls.HlsDataSourceFactory) r3
                r2.hlsDataSourceFactory = r3
                com.google.android.exoplayer2.drm.DefaultDrmSessionManagerProvider r3 = new com.google.android.exoplayer2.drm.DefaultDrmSessionManagerProvider
                r3.<init>()
                r2.drmSessionManagerProvider = r3
                com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistParserFactory r3 = new com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistParserFactory
                r3.<init>()
                r2.playlistParserFactory = r3
                com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$Factory r3 = com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.FACTORY
                r2.playlistTrackerFactory = r3
                com.google.android.exoplayer2.source.hls.HlsExtractorFactory r3 = com.google.android.exoplayer2.source.hls.HlsExtractorFactory.DEFAULT
                r2.extractorFactory = r3
                com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy r3 = new com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy
                r3.<init>()
                r2.loadErrorHandlingPolicy = r3
                com.google.android.exoplayer2.source.DefaultCompositeSequenceableLoaderFactory r3 = new com.google.android.exoplayer2.source.DefaultCompositeSequenceableLoaderFactory
                r3.<init>()
                r2.compositeSequenceableLoaderFactory = r3
                r3 = 1
                r2.metadataType = r3
                r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r2.elapsedRealTimeOffsetMs = r0
                r2.allowChunklessPreparation = r3
                return
        }

        public Factory(com.google.android.exoplayer2.upstream.DataSource.Factory r2) {
                r1 = this;
                com.google.android.exoplayer2.source.hls.DefaultHlsDataSourceFactory r0 = new com.google.android.exoplayer2.source.hls.DefaultHlsDataSourceFactory
                r0.<init>(r2)
                r1.<init>(r0)
                return
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.source.MediaSource createMediaSource(com.google.android.exoplayer2.MediaItem r1) {
                r0 = this;
                com.google.android.exoplayer2.source.hls.HlsMediaSource r1 = r0.createMediaSource(r1)
                return r1
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        public com.google.android.exoplayer2.source.hls.HlsMediaSource createMediaSource(com.google.android.exoplayer2.MediaItem r17) {
                r16 = this;
                r0 = r16
                r2 = r17
                com.google.android.exoplayer2.MediaItem$LocalConfiguration r1 = r2.localConfiguration
                com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
                com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParserFactory r1 = r0.playlistParserFactory
                com.google.android.exoplayer2.MediaItem$LocalConfiguration r3 = r2.localConfiguration
                java.util.List<com.google.android.exoplayer2.offline.StreamKey> r3 = r3.streamKeys
                boolean r4 = r3.isEmpty()
                if (r4 != 0) goto L1b
                com.google.android.exoplayer2.source.hls.playlist.FilteringHlsPlaylistParserFactory r4 = new com.google.android.exoplayer2.source.hls.playlist.FilteringHlsPlaylistParserFactory
                r4.<init>(r1, r3)
                r1 = r4
            L1b:
                com.google.android.exoplayer2.source.hls.HlsMediaSource r15 = new com.google.android.exoplayer2.source.hls.HlsMediaSource
                com.google.android.exoplayer2.source.hls.HlsDataSourceFactory r3 = r0.hlsDataSourceFactory
                com.google.android.exoplayer2.source.hls.HlsExtractorFactory r4 = r0.extractorFactory
                com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory r5 = r0.compositeSequenceableLoaderFactory
                com.google.android.exoplayer2.drm.DrmSessionManagerProvider r6 = r0.drmSessionManagerProvider
                com.google.android.exoplayer2.drm.DrmSessionManager r6 = r6.get(r2)
                com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r7 = r0.loadErrorHandlingPolicy
                com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$Factory r8 = r0.playlistTrackerFactory
                com.google.android.exoplayer2.source.hls.HlsDataSourceFactory r9 = r0.hlsDataSourceFactory
                com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r8 = r8.createTracker(r9, r7, r1)
                long r9 = r0.elapsedRealTimeOffsetMs
                boolean r11 = r0.allowChunklessPreparation
                int r12 = r0.metadataType
                boolean r13 = r0.useSessionKeys
                r14 = 0
                r1 = r15
                r2 = r17
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r13, r14)
                return r15
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        public int[] getSupportedTypes() {
                r3 = this;
                r0 = 1
                int[] r0 = new int[r0]
                r1 = 0
                r2 = 2
                r0[r1] = r2
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.source.hls.HlsMediaSource.Factory setAllowChunklessPreparation(boolean r1) {
                r0 = this;
                r0.allowChunklessPreparation = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.source.hls.HlsMediaSource.Factory setCompositeSequenceableLoaderFactory(com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory r2) {
                r1 = this;
                java.lang.String r0 = "HlsMediaSource.Factory#setCompositeSequenceableLoaderFactory no longer handles null by instantiating a new DefaultCompositeSequenceableLoaderFactory. Explicitly construct and pass an instance in order to retain the old behavior."
                java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2, r0)
                com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory r2 = (com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory) r2
                r1.compositeSequenceableLoaderFactory = r2
                return r1
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.source.MediaSource.Factory setDrmSessionManagerProvider(com.google.android.exoplayer2.drm.DrmSessionManagerProvider r1) {
                r0 = this;
                com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory r1 = r0.setDrmSessionManagerProvider(r1)
                return r1
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.source.hls.HlsMediaSource.Factory setDrmSessionManagerProvider(com.google.android.exoplayer2.drm.DrmSessionManagerProvider r2) {
                r1 = this;
                java.lang.String r0 = "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."
                java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2, r0)
                com.google.android.exoplayer2.drm.DrmSessionManagerProvider r2 = (com.google.android.exoplayer2.drm.DrmSessionManagerProvider) r2
                r1.drmSessionManagerProvider = r2
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.source.hls.HlsMediaSource.Factory setExtractorFactory(@androidx.annotation.Nullable com.google.android.exoplayer2.source.hls.HlsExtractorFactory r1) {
                r0 = this;
                if (r1 == 0) goto L3
                goto L5
            L3:
                com.google.android.exoplayer2.source.hls.HlsExtractorFactory r1 = com.google.android.exoplayer2.source.hls.HlsExtractorFactory.DEFAULT
            L5:
                r0.extractorFactory = r1
                return r0
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.source.MediaSource.Factory setLoadErrorHandlingPolicy(com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r1) {
                r0 = this;
                com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory r1 = r0.setLoadErrorHandlingPolicy(r1)
                return r1
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.source.hls.HlsMediaSource.Factory setLoadErrorHandlingPolicy(com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r2) {
                r1 = this;
                java.lang.String r0 = "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior."
                java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2, r0)
                com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r2 = (com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy) r2
                r1.loadErrorHandlingPolicy = r2
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.source.hls.HlsMediaSource.Factory setMetadataType(int r1) {
                r0 = this;
                r0.metadataType = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.source.hls.HlsMediaSource.Factory setPlaylistParserFactory(com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParserFactory r2) {
                r1 = this;
                java.lang.String r0 = "HlsMediaSource.Factory#setPlaylistParserFactory no longer handles null by instantiating a new DefaultHlsPlaylistParserFactory. Explicitly construct and pass an instance in order to retain the old behavior."
                java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2, r0)
                com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParserFactory r2 = (com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParserFactory) r2
                r1.playlistParserFactory = r2
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.source.hls.HlsMediaSource.Factory setPlaylistTrackerFactory(com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.Factory r2) {
                r1 = this;
                java.lang.String r0 = "HlsMediaSource.Factory#setPlaylistTrackerFactory no longer handles null by defaulting to DefaultHlsPlaylistTracker.FACTORY. Explicitly pass a reference to this instance in order to retain the old behavior."
                java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2, r0)
                com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$Factory r2 = (com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.Factory) r2
                r1.playlistTrackerFactory = r2
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.source.hls.HlsMediaSource.Factory setUseSessionKeys(boolean r1) {
                r0 = this;
                r0.useSessionKeys = r1
                return r0
        }
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface MetadataType {
    }

    static {
            java.lang.String r0 = "goog.exo.hls"
            com.google.android.exoplayer2.ExoPlayerLibraryInfo.registerModule(r0)
            return
    }

    private HlsMediaSource(com.google.android.exoplayer2.MediaItem r2, com.google.android.exoplayer2.source.hls.HlsDataSourceFactory r3, com.google.android.exoplayer2.source.hls.HlsExtractorFactory r4, com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory r5, com.google.android.exoplayer2.drm.DrmSessionManager r6, com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r7, com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r8, long r9, boolean r11, int r12, boolean r13) {
            r1 = this;
            r1.<init>()
            com.google.android.exoplayer2.MediaItem$LocalConfiguration r0 = r2.localConfiguration
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.MediaItem$LocalConfiguration r0 = (com.google.android.exoplayer2.MediaItem.LocalConfiguration) r0
            r1.localConfiguration = r0
            r1.mediaItem = r2
            com.google.android.exoplayer2.MediaItem$LiveConfiguration r2 = r2.liveConfiguration
            r1.liveConfiguration = r2
            r1.dataSourceFactory = r3
            r1.extractorFactory = r4
            r1.compositeSequenceableLoaderFactory = r5
            r1.drmSessionManager = r6
            r1.loadErrorHandlingPolicy = r7
            r1.playlistTracker = r8
            r1.elapsedRealTimeOffsetMs = r9
            r1.allowChunklessPreparation = r11
            r1.metadataType = r12
            r1.useSessionKeys = r13
            return
    }

    public /* synthetic */ HlsMediaSource(com.google.android.exoplayer2.MediaItem r1, com.google.android.exoplayer2.source.hls.HlsDataSourceFactory r2, com.google.android.exoplayer2.source.hls.HlsExtractorFactory r3, com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory r4, com.google.android.exoplayer2.drm.DrmSessionManager r5, com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r6, com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r7, long r8, boolean r10, int r11, boolean r12, com.google.android.exoplayer2.source.hls.HlsMediaSource.AnonymousClass1 r13) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r11, r12)
            return
    }

    private com.google.android.exoplayer2.source.SinglePeriodTimeline createTimelineForLive(com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r28, long r29, long r31, com.google.android.exoplayer2.source.hls.HlsManifest r33) {
            r27 = this;
            r0 = r27
            r1 = r28
            long r2 = r1.startTimeUs
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r4 = r0.playlistTracker
            long r4 = r4.getInitialStartTimeUs()
            long r17 = r2 - r4
            boolean r2 = r1.hasEndTag
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L1d
            long r5 = r1.durationUs
            long r5 = r17 + r5
            r13 = r5
            goto L1e
        L1d:
            r13 = r3
        L1e:
            long r11 = r27.getLiveEdgeOffsetUs(r28)
            com.google.android.exoplayer2.MediaItem$LiveConfiguration r2 = r0.liveConfiguration
            long r5 = r2.targetOffsetMs
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L2f
            long r2 = com.google.android.exoplayer2.util.Util.msToUs(r5)
            goto L33
        L2f:
            long r2 = getTargetLiveOffsetUs(r1, r11)
        L33:
            r5 = r2
            long r2 = r1.durationUs
            long r9 = r2 + r11
            r7 = r11
            long r2 = com.google.android.exoplayer2.util.Util.constrainValue(r5, r7, r9)
            r0.updateLiveConfiguration(r1, r2)
            long r19 = r0.getLiveWindowDefaultStartPositionUs(r1, r11)
            int r2 = r1.playlistType
            r3 = 2
            r4 = 1
            if (r2 != r3) goto L51
            boolean r2 = r1.hasPositiveStartOffset
            if (r2 == 0) goto L51
            r23 = 1
            goto L54
        L51:
            r2 = 0
            r23 = 0
        L54:
            com.google.android.exoplayer2.source.SinglePeriodTimeline r2 = new com.google.android.exoplayer2.source.SinglePeriodTimeline
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r9 = r1.durationUs
            r21 = 1
            boolean r1 = r1.hasEndTag
            r22 = r1 ^ 1
            com.google.android.exoplayer2.MediaItem r1 = r0.mediaItem
            r25 = r1
            com.google.android.exoplayer2.MediaItem$LiveConfiguration r1 = r0.liveConfiguration
            r26 = r1
            r6 = r2
            r7 = r29
            r3 = r9
            r9 = r31
            r15 = r3
            r24 = r33
            r6.<init>(r7, r9, r11, r13, r15, r17, r19, r21, r22, r23, r24, r25, r26)
            return r2
    }

    private com.google.android.exoplayer2.source.SinglePeriodTimeline createTimelineForOnDemand(com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r25, long r26, long r28, com.google.android.exoplayer2.source.hls.HlsManifest r30) {
            r24 = this;
            r0 = r25
            long r1 = r0.startOffsetUs
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L2f
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment> r1 = r0.segments
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L16
            goto L2f
        L16:
            boolean r1 = r0.preciseStart
            if (r1 != 0) goto L2c
            long r1 = r0.startOffsetUs
            long r3 = r0.durationUs
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L23
            goto L2c
        L23:
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment> r3 = r0.segments
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment r1 = findClosestPrecedingSegment(r3, r1)
            long r1 = r1.relativeStartTimeUs
            goto L31
        L2c:
            long r1 = r0.startOffsetUs
            goto L31
        L2f:
            r1 = 0
        L31:
            r16 = r1
            com.google.android.exoplayer2.source.SinglePeriodTimeline r1 = new com.google.android.exoplayer2.source.SinglePeriodTimeline
            r3 = r1
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r10 = r0.durationUs
            r12 = r10
            r14 = 0
            r18 = 1
            r19 = 0
            r20 = 1
            r0 = r24
            com.google.android.exoplayer2.MediaItem r2 = r0.mediaItem
            r22 = r2
            r23 = 0
            r4 = r26
            r6 = r28
            r21 = r30
            r3.<init>(r4, r6, r8, r10, r12, r14, r16, r18, r19, r20, r21, r22, r23)
            return r1
    }

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Part findClosestPrecedingIndependentPart(java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Part> r6, long r7) {
            r0 = 0
            r1 = 0
        L2:
            int r2 = r6.size()
            if (r1 >= r2) goto L22
            java.lang.Object r2 = r6.get(r1)
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Part r2 = (com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Part) r2
            long r3 = r2.relativeStartTimeUs
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 > 0) goto L1a
            boolean r5 = r2.isIndependent
            if (r5 == 0) goto L1a
            r0 = r2
            goto L1f
        L1a:
            int r2 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r2 <= 0) goto L1f
            goto L22
        L1f:
            int r1 = r1 + 1
            goto L2
        L22:
            return r0
    }

    private static com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Segment findClosestPrecedingSegment(java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Segment> r0, long r1) {
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 1
            int r1 = com.google.android.exoplayer2.util.Util.binarySearchFloor(r0, r1, r2, r2)
            java.lang.Object r0 = r0.get(r1)
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment r0 = (com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Segment) r0
            return r0
    }

    private long getLiveEdgeOffsetUs(com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r5) {
            r4 = this;
            boolean r0 = r5.hasProgramDateTime
            if (r0 == 0) goto L14
            long r0 = r4.elapsedRealTimeOffsetMs
            long r0 = com.google.android.exoplayer2.util.Util.getNowUnixTimeMs(r0)
            long r0 = com.google.android.exoplayer2.util.Util.msToUs(r0)
            long r2 = r5.getEndTimeUs()
            long r0 = r0 - r2
            goto L16
        L14:
            r0 = 0
        L16:
            return r0
    }

    private long getLiveWindowDefaultStartPositionUs(com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r6, long r7) {
            r5 = this;
            long r0 = r6.startOffsetUs
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lc
            goto L18
        Lc:
            long r0 = r6.durationUs
            long r0 = r0 + r7
            com.google.android.exoplayer2.MediaItem$LiveConfiguration r7 = r5.liveConfiguration
            long r7 = r7.targetOffsetMs
            long r7 = com.google.android.exoplayer2.util.Util.msToUs(r7)
            long r0 = r0 - r7
        L18:
            boolean r7 = r6.preciseStart
            if (r7 == 0) goto L1d
            return r0
        L1d:
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Part> r7 = r6.trailingParts
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Part r7 = findClosestPrecedingIndependentPart(r7, r0)
            if (r7 == 0) goto L28
            long r6 = r7.relativeStartTimeUs
            return r6
        L28:
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment> r7 = r6.segments
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L33
            r6 = 0
            return r6
        L33:
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment> r6 = r6.segments
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment r6 = findClosestPrecedingSegment(r6, r0)
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Part> r7 = r6.parts
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Part r7 = findClosestPrecedingIndependentPart(r7, r0)
            if (r7 == 0) goto L44
            long r6 = r7.relativeStartTimeUs
            return r6
        L44:
            long r6 = r6.relativeStartTimeUs
            return r6
    }

    private static long getTargetLiveOffsetUs(com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r8, long r9) {
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$ServerControl r0 = r8.serverControl
            long r1 = r8.startOffsetUs
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L11
            long r3 = r8.durationUs
            long r3 = r3 - r1
            goto L2d
        L11:
            long r1 = r0.partHoldBackUs
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L1f
            long r5 = r8.partTargetDurationUs
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L1f
            r3 = r1
            goto L2d
        L1f:
            long r0 = r0.holdBackUs
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 == 0) goto L27
            r3 = r0
            goto L2d
        L27:
            r0 = 3
            long r2 = r8.targetDurationUs
            long r3 = r2 * r0
        L2d:
            long r3 = r3 + r9
            return r3
    }

    private void updateLiveConfiguration(com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r6, long r7) {
            r5 = this;
            com.google.android.exoplayer2.MediaItem r0 = r5.mediaItem
            com.google.android.exoplayer2.MediaItem$LiveConfiguration r0 = r0.liveConfiguration
            float r1 = r0.minPlaybackSpeed
            r2 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L28
            float r0 = r0.maxPlaybackSpeed
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L28
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$ServerControl r6 = r6.serverControl
            long r0 = r6.holdBackUs
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L28
            long r0 = r6.partHoldBackUs
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L28
            r6 = 1
            goto L29
        L28:
            r6 = 0
        L29:
            com.google.android.exoplayer2.MediaItem$LiveConfiguration$Builder r0 = new com.google.android.exoplayer2.MediaItem$LiveConfiguration$Builder
            r0.<init>()
            long r7 = com.google.android.exoplayer2.util.Util.usToMs(r7)
            com.google.android.exoplayer2.MediaItem$LiveConfiguration$Builder r7 = r0.setTargetOffsetMs(r7)
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r6 == 0) goto L3d
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L41
        L3d:
            com.google.android.exoplayer2.MediaItem$LiveConfiguration r0 = r5.liveConfiguration
            float r0 = r0.minPlaybackSpeed
        L41:
            com.google.android.exoplayer2.MediaItem$LiveConfiguration$Builder r7 = r7.setMinPlaybackSpeed(r0)
            if (r6 == 0) goto L48
            goto L4c
        L48:
            com.google.android.exoplayer2.MediaItem$LiveConfiguration r6 = r5.liveConfiguration
            float r8 = r6.maxPlaybackSpeed
        L4c:
            com.google.android.exoplayer2.MediaItem$LiveConfiguration$Builder r6 = r7.setMaxPlaybackSpeed(r8)
            com.google.android.exoplayer2.MediaItem$LiveConfiguration r6 = r6.build()
            r5.liveConfiguration = r6
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public com.google.android.exoplayer2.source.MediaPeriod createPeriod(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r18, com.google.android.exoplayer2.upstream.Allocator r19, long r20) {
            r17 = this;
            r0 = r17
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r9 = r17.createEventDispatcher(r18)
            com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r7 = r17.createDrmEventDispatcher(r18)
            com.google.android.exoplayer2.source.hls.HlsMediaPeriod r16 = new com.google.android.exoplayer2.source.hls.HlsMediaPeriod
            com.google.android.exoplayer2.source.hls.HlsExtractorFactory r2 = r0.extractorFactory
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r3 = r0.playlistTracker
            com.google.android.exoplayer2.source.hls.HlsDataSourceFactory r4 = r0.dataSourceFactory
            com.google.android.exoplayer2.upstream.TransferListener r5 = r0.mediaTransferListener
            com.google.android.exoplayer2.drm.DrmSessionManager r6 = r0.drmSessionManager
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r8 = r0.loadErrorHandlingPolicy
            com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory r11 = r0.compositeSequenceableLoaderFactory
            boolean r12 = r0.allowChunklessPreparation
            int r13 = r0.metadataType
            boolean r14 = r0.useSessionKeys
            com.google.android.exoplayer2.analytics.PlayerId r15 = r17.getPlayerId()
            r1 = r16
            r10 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r16
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
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r0 = r1.playlistTracker
            r0.maybeThrowPrimaryPlaylistRefreshError()
            return
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.PrimaryPlaylistListener
    public void onPrimaryPlaylistRefreshed(com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r13) {
            r12 = this;
            boolean r0 = r13.hasProgramDateTime
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L11
            long r3 = r13.startTimeUs
            long r3 = com.google.android.exoplayer2.util.Util.usToMs(r3)
            r9 = r3
            goto L12
        L11:
            r9 = r1
        L12:
            int r0 = r13.playlistType
            r3 = 2
            if (r0 == r3) goto L1d
            r3 = 1
            if (r0 != r3) goto L1b
            goto L1d
        L1b:
            r7 = r1
            goto L1e
        L1d:
            r7 = r9
        L1e:
            com.google.android.exoplayer2.source.hls.HlsManifest r11 = new com.google.android.exoplayer2.source.hls.HlsManifest
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r0 = r12.playlistTracker
            com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist r0 = r0.getMultivariantPlaylist()
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist r0 = (com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist) r0
            r11.<init>(r0, r13)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r0 = r12.playlistTracker
            boolean r0 = r0.isLive()
            if (r0 == 0) goto L3e
            r5 = r12
            r6 = r13
            com.google.android.exoplayer2.source.SinglePeriodTimeline r13 = r5.createTimelineForLive(r6, r7, r9, r11)
            goto L44
        L3e:
            r5 = r12
            r6 = r13
            com.google.android.exoplayer2.source.SinglePeriodTimeline r13 = r5.createTimelineForOnDemand(r6, r7, r9, r11)
        L44:
            r12.refreshSourceInfo(r13)
            return
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public final void prepareSourceInternal(@androidx.annotation.Nullable com.google.android.exoplayer2.upstream.TransferListener r3) {
            r2 = this;
            r2.mediaTransferListener = r3
            com.google.android.exoplayer2.drm.DrmSessionManager r3 = r2.drmSessionManager
            r3.prepare()
            com.google.android.exoplayer2.drm.DrmSessionManager r3 = r2.drmSessionManager
            android.os.Looper r0 = android.os.Looper.myLooper()
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            android.os.Looper r0 = (android.os.Looper) r0
            com.google.android.exoplayer2.analytics.PlayerId r1 = r2.getPlayerId()
            r3.setPlayer(r0, r1)
            r3 = 0
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r3 = r2.createEventDispatcher(r3)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r0 = r2.playlistTracker
            com.google.android.exoplayer2.MediaItem$LocalConfiguration r1 = r2.localConfiguration
            android.net.Uri r1 = r1.uri
            r0.start(r1, r3, r2)
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(com.google.android.exoplayer2.source.MediaPeriod r1) {
            r0 = this;
            com.google.android.exoplayer2.source.hls.HlsMediaPeriod r1 = (com.google.android.exoplayer2.source.hls.HlsMediaPeriod) r1
            r1.release()
            return
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public final void releaseSourceInternal() {
            r1 = this;
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r0 = r1.playlistTracker
            r0.stop()
            com.google.android.exoplayer2.drm.DrmSessionManager r0 = r1.drmSessionManager
            r0.release()
            return
    }
}
