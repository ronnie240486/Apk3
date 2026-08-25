package com.google.android.exoplayer2.source.dash;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultDashChunkSource implements com.google.android.exoplayer2.source.dash.DashChunkSource {
    private final int[] adaptationSetIndices;
    private final com.google.android.exoplayer2.source.dash.BaseUrlExclusionList baseUrlExclusionList;
    private final com.google.android.exoplayer2.upstream.DataSource dataSource;
    private final long elapsedRealtimeOffsetMs;

    @androidx.annotation.Nullable
    private java.io.IOException fatalError;
    private com.google.android.exoplayer2.source.dash.manifest.DashManifest manifest;
    private final com.google.android.exoplayer2.upstream.LoaderErrorThrower manifestLoaderErrorThrower;
    private final int maxSegmentsPerLoad;
    private boolean missingLastSegment;
    private int periodIndex;

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.source.dash.PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler;
    public final com.google.android.exoplayer2.source.dash.DefaultDashChunkSource.RepresentationHolder[] representationHolders;
    private com.google.android.exoplayer2.trackselection.ExoTrackSelection trackSelection;
    private final int trackType;

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Factory implements com.google.android.exoplayer2.source.dash.DashChunkSource.Factory {
        private final com.google.android.exoplayer2.source.chunk.ChunkExtractor.Factory chunkExtractorFactory;
        private final com.google.android.exoplayer2.upstream.DataSource.Factory dataSourceFactory;
        private final int maxSegmentsPerLoad;

        public Factory(com.google.android.exoplayer2.source.chunk.ChunkExtractor.Factory r1, com.google.android.exoplayer2.upstream.DataSource.Factory r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.chunkExtractorFactory = r1
                r0.dataSourceFactory = r2
                r0.maxSegmentsPerLoad = r3
                return
        }

        public Factory(com.google.android.exoplayer2.upstream.DataSource.Factory r2) {
                r1 = this;
                r0 = 1
                r1.<init>(r2, r0)
                return
        }

        public Factory(com.google.android.exoplayer2.upstream.DataSource.Factory r2, int r3) {
                r1 = this;
                com.google.android.exoplayer2.source.chunk.ChunkExtractor$Factory r0 = com.google.android.exoplayer2.source.chunk.BundledChunkExtractor.FACTORY
                r1.<init>(r0, r2, r3)
                return
        }

        @Override // com.google.android.exoplayer2.source.dash.DashChunkSource.Factory
        public com.google.android.exoplayer2.source.dash.DashChunkSource createDashChunkSource(com.google.android.exoplayer2.upstream.LoaderErrorThrower r21, com.google.android.exoplayer2.source.dash.manifest.DashManifest r22, com.google.android.exoplayer2.source.dash.BaseUrlExclusionList r23, int r24, int[] r25, com.google.android.exoplayer2.trackselection.ExoTrackSelection r26, int r27, long r28, boolean r30, java.util.List<com.google.android.exoplayer2.Format> r31, @androidx.annotation.Nullable com.google.android.exoplayer2.source.dash.PlayerEmsgHandler.PlayerTrackEmsgHandler r32, @androidx.annotation.Nullable com.google.android.exoplayer2.upstream.TransferListener r33, com.google.android.exoplayer2.analytics.PlayerId r34) {
                r20 = this;
                r0 = r20
                r1 = r33
                com.google.android.exoplayer2.upstream.DataSource$Factory r2 = r0.dataSourceFactory
                com.google.android.exoplayer2.upstream.DataSource r12 = r2.createDataSource()
                if (r1 == 0) goto Lf
                r12.addTransferListener(r1)
            Lf:
                com.google.android.exoplayer2.source.dash.DefaultDashChunkSource r1 = new com.google.android.exoplayer2.source.dash.DefaultDashChunkSource
                r3 = r1
                com.google.android.exoplayer2.source.chunk.ChunkExtractor$Factory r4 = r0.chunkExtractorFactory
                int r15 = r0.maxSegmentsPerLoad
                r5 = r21
                r6 = r22
                r7 = r23
                r8 = r24
                r9 = r25
                r10 = r26
                r11 = r27
                r13 = r28
                r16 = r30
                r17 = r31
                r18 = r32
                r19 = r34
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r19)
                return r1
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class RepresentationHolder {

        @androidx.annotation.Nullable
        public final com.google.android.exoplayer2.source.chunk.ChunkExtractor chunkExtractor;
        private final long periodDurationUs;
        public final com.google.android.exoplayer2.source.dash.manifest.Representation representation;

        @androidx.annotation.Nullable
        public final com.google.android.exoplayer2.source.dash.DashSegmentIndex segmentIndex;
        private final long segmentNumShift;
        public final com.google.android.exoplayer2.source.dash.manifest.BaseUrl selectedBaseUrl;

        public RepresentationHolder(long r1, com.google.android.exoplayer2.source.dash.manifest.Representation r3, com.google.android.exoplayer2.source.dash.manifest.BaseUrl r4, @androidx.annotation.Nullable com.google.android.exoplayer2.source.chunk.ChunkExtractor r5, long r6, @androidx.annotation.Nullable com.google.android.exoplayer2.source.dash.DashSegmentIndex r8) {
                r0 = this;
                r0.<init>()
                r0.periodDurationUs = r1
                r0.representation = r3
                r0.selectedBaseUrl = r4
                r0.segmentNumShift = r6
                r0.chunkExtractor = r5
                r0.segmentIndex = r8
                return
        }

        public static /* synthetic */ long access$000(com.google.android.exoplayer2.source.dash.DefaultDashChunkSource.RepresentationHolder r2) {
                long r0 = r2.periodDurationUs
                return r0
        }

        @androidx.annotation.CheckResult
        public final com.google.android.exoplayer2.source.dash.DefaultDashChunkSource.RepresentationHolder copyWithNewRepresentation(long r23, com.google.android.exoplayer2.source.dash.manifest.Representation r25) throws com.google.android.exoplayer2.source.BehindLiveWindowException {
                r22 = this;
                r0 = r22
                r2 = r23
                com.google.android.exoplayer2.source.dash.manifest.Representation r1 = r0.representation
                com.google.android.exoplayer2.source.dash.DashSegmentIndex r9 = r1.getIndex()
                com.google.android.exoplayer2.source.dash.DashSegmentIndex r10 = r25.getIndex()
                if (r9 != 0) goto L21
                com.google.android.exoplayer2.source.dash.DefaultDashChunkSource$RepresentationHolder r10 = new com.google.android.exoplayer2.source.dash.DefaultDashChunkSource$RepresentationHolder
                com.google.android.exoplayer2.source.dash.manifest.BaseUrl r5 = r0.selectedBaseUrl
                com.google.android.exoplayer2.source.chunk.ChunkExtractor r6 = r0.chunkExtractor
                long r7 = r0.segmentNumShift
                r1 = r10
                r2 = r23
                r4 = r25
                r1.<init>(r2, r4, r5, r6, r7, r9)
                return r10
            L21:
                boolean r1 = r9.isExplicit()
                if (r1 != 0) goto L39
                com.google.android.exoplayer2.source.dash.DefaultDashChunkSource$RepresentationHolder r11 = new com.google.android.exoplayer2.source.dash.DefaultDashChunkSource$RepresentationHolder
                com.google.android.exoplayer2.source.dash.manifest.BaseUrl r5 = r0.selectedBaseUrl
                com.google.android.exoplayer2.source.chunk.ChunkExtractor r6 = r0.chunkExtractor
                long r7 = r0.segmentNumShift
                r1 = r11
                r2 = r23
                r4 = r25
                r9 = r10
                r1.<init>(r2, r4, r5, r6, r7, r9)
                return r11
            L39:
                long r4 = r9.getSegmentCount(r2)
                r6 = 0
                int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r1 != 0) goto L55
                com.google.android.exoplayer2.source.dash.DefaultDashChunkSource$RepresentationHolder r11 = new com.google.android.exoplayer2.source.dash.DefaultDashChunkSource$RepresentationHolder
                com.google.android.exoplayer2.source.dash.manifest.BaseUrl r5 = r0.selectedBaseUrl
                com.google.android.exoplayer2.source.chunk.ChunkExtractor r6 = r0.chunkExtractor
                long r7 = r0.segmentNumShift
                r1 = r11
                r2 = r23
                r4 = r25
                r9 = r10
                r1.<init>(r2, r4, r5, r6, r7, r9)
                return r11
            L55:
                long r6 = r9.getFirstSegmentNum()
                long r11 = r9.getTimeUs(r6)
                long r4 = r4 + r6
                r13 = 1
                long r4 = r4 - r13
                long r15 = r9.getTimeUs(r4)
                long r17 = r9.getDurationUs(r4, r2)
                long r17 = r17 + r15
                long r13 = r10.getFirstSegmentNum()
                r1 = r9
                long r8 = r10.getTimeUs(r13)
                r19 = r6
                long r6 = r0.segmentNumShift
                int r21 = (r17 > r8 ? 1 : (r17 == r8 ? 0 : -1))
                if (r21 != 0) goto L83
                r15 = 1
                long r4 = r4 + r15
            L7f:
                long r4 = r4 - r13
                long r4 = r4 + r6
                r7 = r4
                goto L97
            L83:
                if (r21 < 0) goto La7
                int r4 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
                if (r4 >= 0) goto L92
                long r4 = r10.getSegmentNum(r11, r2)
                long r4 = r4 - r19
                long r6 = r6 - r4
                r7 = r6
                goto L97
            L92:
                long r4 = r1.getSegmentNum(r8, r2)
                goto L7f
            L97:
                com.google.android.exoplayer2.source.dash.DefaultDashChunkSource$RepresentationHolder r11 = new com.google.android.exoplayer2.source.dash.DefaultDashChunkSource$RepresentationHolder
                com.google.android.exoplayer2.source.dash.manifest.BaseUrl r5 = r0.selectedBaseUrl
                com.google.android.exoplayer2.source.chunk.ChunkExtractor r6 = r0.chunkExtractor
                r1 = r11
                r2 = r23
                r4 = r25
                r9 = r10
                r1.<init>(r2, r4, r5, r6, r7, r9)
                return r11
            La7:
                com.google.android.exoplayer2.source.BehindLiveWindowException r1 = new com.google.android.exoplayer2.source.BehindLiveWindowException
                r1.<init>()
                throw r1
        }

        @androidx.annotation.CheckResult
        public final com.google.android.exoplayer2.source.dash.DefaultDashChunkSource.RepresentationHolder copyWithNewSegmentIndex(com.google.android.exoplayer2.source.dash.DashSegmentIndex r11) {
                r10 = this;
                com.google.android.exoplayer2.source.dash.DefaultDashChunkSource$RepresentationHolder r9 = new com.google.android.exoplayer2.source.dash.DefaultDashChunkSource$RepresentationHolder
                long r1 = r10.periodDurationUs
                com.google.android.exoplayer2.source.dash.manifest.Representation r3 = r10.representation
                com.google.android.exoplayer2.source.dash.manifest.BaseUrl r4 = r10.selectedBaseUrl
                com.google.android.exoplayer2.source.chunk.ChunkExtractor r5 = r10.chunkExtractor
                long r6 = r10.segmentNumShift
                r0 = r9
                r8 = r11
                r0.<init>(r1, r3, r4, r5, r6, r8)
                return r9
        }

        @androidx.annotation.CheckResult
        public final com.google.android.exoplayer2.source.dash.DefaultDashChunkSource.RepresentationHolder copyWithNewSelectedBaseUrl(com.google.android.exoplayer2.source.dash.manifest.BaseUrl r11) {
                r10 = this;
                com.google.android.exoplayer2.source.dash.DefaultDashChunkSource$RepresentationHolder r9 = new com.google.android.exoplayer2.source.dash.DefaultDashChunkSource$RepresentationHolder
                long r1 = r10.periodDurationUs
                com.google.android.exoplayer2.source.dash.manifest.Representation r3 = r10.representation
                com.google.android.exoplayer2.source.chunk.ChunkExtractor r5 = r10.chunkExtractor
                long r6 = r10.segmentNumShift
                com.google.android.exoplayer2.source.dash.DashSegmentIndex r8 = r10.segmentIndex
                r0 = r9
                r4 = r11
                r0.<init>(r1, r3, r4, r5, r6, r8)
                return r9
        }

        public long getFirstAvailableSegmentNum(long r4) {
                r3 = this;
                com.google.android.exoplayer2.source.dash.DashSegmentIndex r0 = r3.segmentIndex
                long r1 = r3.periodDurationUs
                long r4 = r0.getFirstAvailableSegmentNum(r1, r4)
                long r0 = r3.segmentNumShift
                long r4 = r4 + r0
                return r4
        }

        public long getFirstSegmentNum() {
                r4 = this;
                com.google.android.exoplayer2.source.dash.DashSegmentIndex r0 = r4.segmentIndex
                long r0 = r0.getFirstSegmentNum()
                long r2 = r4.segmentNumShift
                long r0 = r0 + r2
                return r0
        }

        public long getLastAvailableSegmentNum(long r6) {
                r5 = this;
                long r0 = r5.getFirstAvailableSegmentNum(r6)
                com.google.android.exoplayer2.source.dash.DashSegmentIndex r2 = r5.segmentIndex
                long r3 = r5.periodDurationUs
                long r6 = r2.getAvailableSegmentCount(r3, r6)
                long r6 = r6 + r0
                r0 = 1
                long r6 = r6 - r0
                return r6
        }

        public long getSegmentCount() {
                r3 = this;
                com.google.android.exoplayer2.source.dash.DashSegmentIndex r0 = r3.segmentIndex
                long r1 = r3.periodDurationUs
                long r0 = r0.getSegmentCount(r1)
                return r0
        }

        public long getSegmentEndTimeUs(long r6) {
                r5 = this;
                long r0 = r5.getSegmentStartTimeUs(r6)
                com.google.android.exoplayer2.source.dash.DashSegmentIndex r2 = r5.segmentIndex
                long r3 = r5.segmentNumShift
                long r6 = r6 - r3
                long r3 = r5.periodDurationUs
                long r6 = r2.getDurationUs(r6, r3)
                long r6 = r6 + r0
                return r6
        }

        public long getSegmentNum(long r4) {
                r3 = this;
                com.google.android.exoplayer2.source.dash.DashSegmentIndex r0 = r3.segmentIndex
                long r1 = r3.periodDurationUs
                long r4 = r0.getSegmentNum(r4, r1)
                long r0 = r3.segmentNumShift
                long r4 = r4 + r0
                return r4
        }

        public long getSegmentStartTimeUs(long r4) {
                r3 = this;
                com.google.android.exoplayer2.source.dash.DashSegmentIndex r0 = r3.segmentIndex
                long r1 = r3.segmentNumShift
                long r4 = r4 - r1
                long r4 = r0.getTimeUs(r4)
                return r4
        }

        public com.google.android.exoplayer2.source.dash.manifest.RangedUri getSegmentUrl(long r4) {
                r3 = this;
                com.google.android.exoplayer2.source.dash.DashSegmentIndex r0 = r3.segmentIndex
                long r1 = r3.segmentNumShift
                long r4 = r4 - r1
                com.google.android.exoplayer2.source.dash.manifest.RangedUri r4 = r0.getSegmentUrl(r4)
                return r4
        }

        public boolean isSegmentAvailableAtFullNetworkSpeed(long r5, long r7) {
                r4 = this;
                com.google.android.exoplayer2.source.dash.DashSegmentIndex r0 = r4.segmentIndex
                boolean r0 = r0.isExplicit()
                r1 = 1
                if (r0 == 0) goto La
                return r1
            La:
                r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                if (r0 == 0) goto L1d
                long r5 = r4.getSegmentEndTimeUs(r5)
                int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r0 > 0) goto L1c
                goto L1d
            L1c:
                r1 = 0
            L1d:
                return r1
        }
    }

    public static final class RepresentationSegmentIterator extends com.google.android.exoplayer2.source.chunk.BaseMediaChunkIterator {
        private final long nowPeriodTimeUs;
        private final com.google.android.exoplayer2.source.dash.DefaultDashChunkSource.RepresentationHolder representationHolder;

        public RepresentationSegmentIterator(com.google.android.exoplayer2.source.dash.DefaultDashChunkSource.RepresentationHolder r1, long r2, long r4, long r6) {
                r0 = this;
                r0.<init>(r2, r4)
                r0.representationHolder = r1
                r0.nowPeriodTimeUs = r6
                return
        }

        @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
        public long getChunkEndTimeUs() {
                r3 = this;
                r3.checkInBounds()
                com.google.android.exoplayer2.source.dash.DefaultDashChunkSource$RepresentationHolder r0 = r3.representationHolder
                long r1 = r3.getCurrentIndex()
                long r0 = r0.getSegmentEndTimeUs(r1)
                return r0
        }

        @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
        public long getChunkStartTimeUs() {
                r3 = this;
                r3.checkInBounds()
                com.google.android.exoplayer2.source.dash.DefaultDashChunkSource$RepresentationHolder r0 = r3.representationHolder
                long r1 = r3.getCurrentIndex()
                long r0 = r0.getSegmentStartTimeUs(r1)
                return r0
        }

        @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
        public com.google.android.exoplayer2.upstream.DataSpec getDataSpec() {
                r6 = this;
                r6.checkInBounds()
                long r0 = r6.getCurrentIndex()
                com.google.android.exoplayer2.source.dash.DefaultDashChunkSource$RepresentationHolder r2 = r6.representationHolder
                com.google.android.exoplayer2.source.dash.manifest.RangedUri r2 = r2.getSegmentUrl(r0)
                com.google.android.exoplayer2.source.dash.DefaultDashChunkSource$RepresentationHolder r3 = r6.representationHolder
                long r4 = r6.nowPeriodTimeUs
                boolean r0 = r3.isSegmentAvailableAtFullNetworkSpeed(r0, r4)
                if (r0 == 0) goto L19
                r0 = 0
                goto L1b
            L19:
                r0 = 8
            L1b:
                com.google.android.exoplayer2.source.dash.DefaultDashChunkSource$RepresentationHolder r1 = r6.representationHolder
                com.google.android.exoplayer2.source.dash.manifest.Representation r3 = r1.representation
                com.google.android.exoplayer2.source.dash.manifest.BaseUrl r1 = r1.selectedBaseUrl
                java.lang.String r1 = r1.url
                com.google.android.exoplayer2.upstream.DataSpec r0 = com.google.android.exoplayer2.source.dash.DashUtil.buildDataSpec(r3, r1, r2, r0)
                return r0
        }
    }

    public DefaultDashChunkSource(com.google.android.exoplayer2.source.chunk.ChunkExtractor.Factory r28, com.google.android.exoplayer2.upstream.LoaderErrorThrower r29, com.google.android.exoplayer2.source.dash.manifest.DashManifest r30, com.google.android.exoplayer2.source.dash.BaseUrlExclusionList r31, int r32, int[] r33, com.google.android.exoplayer2.trackselection.ExoTrackSelection r34, int r35, com.google.android.exoplayer2.upstream.DataSource r36, long r37, int r39, boolean r40, java.util.List<com.google.android.exoplayer2.Format> r41, @androidx.annotation.Nullable com.google.android.exoplayer2.source.dash.PlayerEmsgHandler.PlayerTrackEmsgHandler r42, com.google.android.exoplayer2.analytics.PlayerId r43) {
            r27 = this;
            r0 = r27
            r1 = r30
            r2 = r31
            r3 = r32
            r4 = r34
            r27.<init>()
            r5 = r29
            r0.manifestLoaderErrorThrower = r5
            r0.manifest = r1
            r0.baseUrlExclusionList = r2
            r5 = r33
            r0.adaptationSetIndices = r5
            r0.trackSelection = r4
            r12 = r35
            r0.trackType = r12
            r5 = r36
            r0.dataSource = r5
            r0.periodIndex = r3
            r5 = r37
            r0.elapsedRealtimeOffsetMs = r5
            r5 = r39
            r0.maxSegmentsPerLoad = r5
            r13 = r42
            r0.playerTrackEmsgHandler = r13
            long r23 = r1.getPeriodDurationUs(r3)
            java.util.ArrayList r1 = r27.getRepresentations()
            int r3 = r34.length()
            com.google.android.exoplayer2.source.dash.DefaultDashChunkSource$RepresentationHolder[] r3 = new com.google.android.exoplayer2.source.dash.DefaultDashChunkSource.RepresentationHolder[r3]
            r0.representationHolders = r3
            r3 = 0
            r15 = 0
        L43:
            com.google.android.exoplayer2.source.dash.DefaultDashChunkSource$RepresentationHolder[] r5 = r0.representationHolders
            int r5 = r5.length
            if (r15 >= r5) goto L94
            int r5 = r4.getIndexInTrackGroup(r15)
            java.lang.Object r5 = r1.get(r5)
            r14 = r5
            com.google.android.exoplayer2.source.dash.manifest.Representation r14 = (com.google.android.exoplayer2.source.dash.manifest.Representation) r14
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.dash.manifest.BaseUrl> r5 = r14.baseUrls
            com.google.android.exoplayer2.source.dash.manifest.BaseUrl r5 = r2.selectBaseUrl(r5)
            com.google.android.exoplayer2.source.dash.DefaultDashChunkSource$RepresentationHolder[] r11 = r0.representationHolders
            com.google.android.exoplayer2.source.dash.DefaultDashChunkSource$RepresentationHolder r25 = new com.google.android.exoplayer2.source.dash.DefaultDashChunkSource$RepresentationHolder
            if (r5 == 0) goto L60
            goto L68
        L60:
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.dash.manifest.BaseUrl> r5 = r14.baseUrls
            java.lang.Object r5 = r5.get(r3)
            com.google.android.exoplayer2.source.dash.manifest.BaseUrl r5 = (com.google.android.exoplayer2.source.dash.manifest.BaseUrl) r5
        L68:
            r18 = r5
            com.google.android.exoplayer2.Format r7 = r14.format
            r5 = r28
            r6 = r35
            r8 = r40
            r9 = r41
            r10 = r42
            r26 = r11
            r11 = r43
            com.google.android.exoplayer2.source.chunk.ChunkExtractor r19 = r5.createProgressiveMediaExtractor(r6, r7, r8, r9, r10, r11)
            r20 = 0
            com.google.android.exoplayer2.source.dash.DashSegmentIndex r22 = r14.getIndex()
            r5 = r14
            r14 = r25
            r6 = r15
            r15 = r23
            r17 = r5
            r14.<init>(r15, r17, r18, r19, r20, r22)
            r26[r6] = r25
            int r15 = r6 + 1
            goto L43
        L94:
            return
    }

    private com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy.FallbackOptions createFallbackOptions(com.google.android.exoplayer2.trackselection.ExoTrackSelection r7, java.util.List<com.google.android.exoplayer2.source.dash.manifest.BaseUrl> r8) {
            r6 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            int r2 = r7.length()
            r3 = 0
            r4 = 0
        La:
            if (r3 >= r2) goto L17
            boolean r5 = r7.isBlacklisted(r3, r0)
            if (r5 == 0) goto L14
            int r4 = r4 + 1
        L14:
            int r3 = r3 + 1
            goto La
        L17:
            int r7 = com.google.android.exoplayer2.source.dash.BaseUrlExclusionList.getPriorityCount(r8)
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy$FallbackOptions r0 = new com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy$FallbackOptions
            com.google.android.exoplayer2.source.dash.BaseUrlExclusionList r1 = r6.baseUrlExclusionList
            int r8 = r1.getPriorityCountAfterExclusion(r8)
            int r8 = r7 - r8
            r0.<init>(r7, r8, r2, r4)
            return r0
    }

    private long getAvailableLiveDurationUs(long r7, long r9) {
            r6 = this;
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r0 = r6.manifest
            boolean r0 = r0.dynamic
            if (r0 == 0) goto L34
            com.google.android.exoplayer2.source.dash.DefaultDashChunkSource$RepresentationHolder[] r0 = r6.representationHolders
            r1 = 0
            r0 = r0[r1]
            long r2 = r0.getSegmentCount()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L16
            goto L34
        L16:
            com.google.android.exoplayer2.source.dash.DefaultDashChunkSource$RepresentationHolder[] r0 = r6.representationHolders
            r0 = r0[r1]
            long r2 = r0.getLastAvailableSegmentNum(r7)
            com.google.android.exoplayer2.source.dash.DefaultDashChunkSource$RepresentationHolder[] r0 = r6.representationHolders
            r0 = r0[r1]
            long r0 = r0.getSegmentEndTimeUs(r2)
            long r7 = r6.getNowPeriodTimeUs(r7)
            long r7 = java.lang.Math.min(r7, r0)
            long r7 = r7 - r9
            long r7 = java.lang.Math.max(r4, r7)
            return r7
        L34:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            return r7
    }

    private long getNowPeriodTimeUs(long r7) {
            r6 = this;
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r0 = r6.manifest
            long r1 = r0.availabilityStartTimeMs
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto Le
            goto L1d
        Le:
            int r3 = r6.periodIndex
            com.google.android.exoplayer2.source.dash.manifest.Period r0 = r0.getPeriod(r3)
            long r3 = r0.startMs
            long r1 = r1 + r3
            long r0 = com.google.android.exoplayer2.util.Util.msToUs(r1)
            long r3 = r7 - r0
        L1d:
            return r3
    }

    private java.util.ArrayList<com.google.android.exoplayer2.source.dash.manifest.Representation> getRepresentations() {
            r6 = this;
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r0 = r6.manifest
            int r1 = r6.periodIndex
            com.google.android.exoplayer2.source.dash.manifest.Period r0 = r0.getPeriod(r1)
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.AdaptationSet> r0 = r0.adaptationSets
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int[] r2 = r6.adaptationSetIndices
            int r3 = r2.length
            r4 = 0
        L13:
            if (r4 >= r3) goto L25
            r5 = r2[r4]
            java.lang.Object r5 = r0.get(r5)
            com.google.android.exoplayer2.source.dash.manifest.AdaptationSet r5 = (com.google.android.exoplayer2.source.dash.manifest.AdaptationSet) r5
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.Representation> r5 = r5.representations
            r1.addAll(r5)
            int r4 = r4 + 1
            goto L13
        L25:
            return r1
    }

    private long getSegmentNum(com.google.android.exoplayer2.source.dash.DefaultDashChunkSource.RepresentationHolder r7, @androidx.annotation.Nullable com.google.android.exoplayer2.source.chunk.MediaChunk r8, long r9, long r11, long r13) {
            r6 = this;
            if (r8 == 0) goto L7
            long r7 = r8.getNextChunkIndex()
            goto L11
        L7:
            long r0 = r7.getSegmentNum(r9)
            r2 = r11
            r4 = r13
            long r7 = com.google.android.exoplayer2.util.Util.constrainValue(r0, r2, r4)
        L11:
            return r7
    }

    private com.google.android.exoplayer2.source.dash.DefaultDashChunkSource.RepresentationHolder updateSelectedBaseUrl(int r4) {
            r3 = this;
            com.google.android.exoplayer2.source.dash.DefaultDashChunkSource$RepresentationHolder[] r0 = r3.representationHolders
            r0 = r0[r4]
            com.google.android.exoplayer2.source.dash.BaseUrlExclusionList r1 = r3.baseUrlExclusionList
            com.google.android.exoplayer2.source.dash.manifest.Representation r2 = r0.representation
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.dash.manifest.BaseUrl> r2 = r2.baseUrls
            com.google.android.exoplayer2.source.dash.manifest.BaseUrl r1 = r1.selectBaseUrl(r2)
            if (r1 == 0) goto L20
            com.google.android.exoplayer2.source.dash.manifest.BaseUrl r2 = r0.selectedBaseUrl
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L20
            com.google.android.exoplayer2.source.dash.DefaultDashChunkSource$RepresentationHolder r0 = r0.copyWithNewSelectedBaseUrl(r1)
            com.google.android.exoplayer2.source.dash.DefaultDashChunkSource$RepresentationHolder[] r1 = r3.representationHolders
            r1[r4] = r0
        L20:
            return r0
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public long getAdjustedSeekPositionUs(long r17, com.google.android.exoplayer2.SeekParameters r19) {
            r16 = this;
            r1 = r17
            r7 = r16
            com.google.android.exoplayer2.source.dash.DefaultDashChunkSource$RepresentationHolder[] r0 = r7.representationHolders
            int r3 = r0.length
            r4 = 0
        L8:
            if (r4 >= r3) goto L4e
            r5 = r0[r4]
            com.google.android.exoplayer2.source.dash.DashSegmentIndex r6 = r5.segmentIndex
            if (r6 == 0) goto L4b
            long r8 = r5.getSegmentCount()
            r10 = 0
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 != 0) goto L1b
            goto L4b
        L1b:
            long r3 = r5.getSegmentNum(r1)
            long r10 = r5.getSegmentStartTimeUs(r3)
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 >= 0) goto L40
            r12 = -1
            r14 = 1
            int r0 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r0 == 0) goto L39
            long r12 = r5.getFirstSegmentNum()
            long r12 = r12 + r8
            long r12 = r12 - r14
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r0 >= 0) goto L40
        L39:
            long r3 = r3 + r14
            long r3 = r5.getSegmentStartTimeUs(r3)
            r5 = r3
            goto L41
        L40:
            r5 = r10
        L41:
            r0 = r19
            r1 = r17
            r3 = r10
            long r0 = r0.resolveSeekPositionUs(r1, r3, r5)
            return r0
        L4b:
            int r4 = r4 + 1
            goto L8
        L4e:
            return r1
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public void getNextChunk(long r52, long r54, java.util.List<? extends com.google.android.exoplayer2.source.chunk.MediaChunk> r56, com.google.android.exoplayer2.source.chunk.ChunkHolder r57) {
            r51 = this;
            r9 = r51
            r10 = r52
            r12 = r57
            java.io.IOException r0 = r9.fatalError
            if (r0 == 0) goto Lb
            return
        Lb:
            long r13 = r54 - r10
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r0 = r9.manifest
            long r0 = r0.availabilityStartTimeMs
            long r0 = com.google.android.exoplayer2.util.Util.msToUs(r0)
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r2 = r9.manifest
            int r3 = r9.periodIndex
            com.google.android.exoplayer2.source.dash.manifest.Period r2 = r2.getPeriod(r3)
            long r2 = r2.startMs
            long r2 = com.google.android.exoplayer2.util.Util.msToUs(r2)
            long r2 = r2 + r0
            long r2 = r2 + r54
            com.google.android.exoplayer2.source.dash.PlayerEmsgHandler$PlayerTrackEmsgHandler r0 = r9.playerTrackEmsgHandler
            if (r0 == 0) goto L31
            boolean r0 = r0.maybeRefreshManifestBeforeLoadingNextChunk(r2)
            if (r0 == 0) goto L31
            return
        L31:
            long r0 = r9.elapsedRealtimeOffsetMs
            long r0 = com.google.android.exoplayer2.util.Util.getNowUnixTimeMs(r0)
            long r7 = com.google.android.exoplayer2.util.Util.msToUs(r0)
            long r5 = r9.getNowPeriodTimeUs(r7)
            boolean r0 = r56.isEmpty()
            r23 = 0
            r15 = 1
            if (r0 == 0) goto L4d
            r3 = r56
            r24 = r23
            goto L5c
        L4d:
            int r0 = r56.size()
            int r0 = r0 - r15
            r3 = r56
            java.lang.Object r0 = r3.get(r0)
            com.google.android.exoplayer2.source.chunk.MediaChunk r0 = (com.google.android.exoplayer2.source.chunk.MediaChunk) r0
            r24 = r0
        L5c:
            com.google.android.exoplayer2.trackselection.ExoTrackSelection r0 = r9.trackSelection
            int r4 = r0.length()
            com.google.android.exoplayer2.source.chunk.MediaChunkIterator[] r2 = new com.google.android.exoplayer2.source.chunk.MediaChunkIterator[r4]
            r0 = 0
        L65:
            if (r0 >= r4) goto Lcf
            com.google.android.exoplayer2.source.dash.DefaultDashChunkSource$RepresentationHolder[] r1 = r9.representationHolders
            r1 = r1[r0]
            com.google.android.exoplayer2.source.dash.DashSegmentIndex r15 = r1.segmentIndex
            if (r15 != 0) goto L7f
            com.google.android.exoplayer2.source.chunk.MediaChunkIterator r1 = com.google.android.exoplayer2.source.chunk.MediaChunkIterator.EMPTY
            r2[r0] = r1
            r3 = r0
            r25 = r2
            r26 = r4
            r27 = r5
            r29 = r13
            r12 = r7
        L7d:
            r8 = 1
            goto Lbe
        L7f:
            long r18 = r1.getFirstAvailableSegmentNum(r7)
            long r20 = r1.getLastAvailableSegmentNum(r7)
            r15 = r0
            r0 = r51
            r12 = 0
            r25 = r2
            r2 = r24
            r26 = r4
            r3 = r54
            r27 = r5
            r5 = r18
            r29 = r13
            r12 = r7
            r7 = r20
            long r0 = r0.getSegmentNum(r1, r2, r3, r5, r7)
            int r2 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r2 >= 0) goto Laa
            com.google.android.exoplayer2.source.chunk.MediaChunkIterator r0 = com.google.android.exoplayer2.source.chunk.MediaChunkIterator.EMPTY
            r25[r15] = r0
            r3 = r15
            goto L7d
        Laa:
            com.google.android.exoplayer2.source.dash.DefaultDashChunkSource$RepresentationHolder r16 = r9.updateSelectedBaseUrl(r15)
            com.google.android.exoplayer2.source.dash.DefaultDashChunkSource$RepresentationSegmentIterator r2 = new com.google.android.exoplayer2.source.dash.DefaultDashChunkSource$RepresentationSegmentIterator
            r3 = r15
            r8 = 1
            r15 = r2
            r17 = r0
            r19 = r20
            r21 = r27
            r15.<init>(r16, r17, r19, r21)
            r25[r3] = r2
        Lbe:
            int r0 = r3 + 1
            r3 = r56
            r7 = r12
            r2 = r25
            r4 = r26
            r5 = r27
            r13 = r29
            r15 = 1
            r12 = r57
            goto L65
        Lcf:
            r25 = r2
            r27 = r5
            r29 = r13
            r12 = r7
            r8 = 1
            long r5 = r9.getAvailableLiveDurationUs(r12, r10)
            com.google.android.exoplayer2.trackselection.ExoTrackSelection r0 = r9.trackSelection
            r1 = r52
            r3 = r29
            r7 = r56
            r10 = 1
            r8 = r25
            r0.updateSelectedTrack(r1, r3, r5, r7, r8)
            com.google.android.exoplayer2.trackselection.ExoTrackSelection r0 = r9.trackSelection
            int r0 = r0.getSelectedIndex()
            com.google.android.exoplayer2.source.dash.DefaultDashChunkSource$RepresentationHolder r11 = r9.updateSelectedBaseUrl(r0)
            com.google.android.exoplayer2.source.chunk.ChunkExtractor r0 = r11.chunkExtractor
            if (r0 == 0) goto L14e
            com.google.android.exoplayer2.source.dash.manifest.Representation r1 = r11.representation
            com.google.android.exoplayer2.Format[] r0 = r0.getSampleFormats()
            if (r0 != 0) goto L104
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r0 = r1.getInitializationUri()
            goto L106
        L104:
            r0 = r23
        L106:
            com.google.android.exoplayer2.source.dash.DashSegmentIndex r2 = r11.segmentIndex
            if (r2 != 0) goto L10e
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r23 = r1.getIndexUri()
        L10e:
            r1 = r23
            if (r0 != 0) goto L114
            if (r1 == 0) goto L14e
        L114:
            com.google.android.exoplayer2.upstream.DataSource r3 = r9.dataSource
            com.google.android.exoplayer2.trackselection.ExoTrackSelection r2 = r9.trackSelection
            com.google.android.exoplayer2.Format r5 = r2.getSelectedFormat()
            com.google.android.exoplayer2.trackselection.ExoTrackSelection r2 = r9.trackSelection
            int r6 = r2.getSelectionReason()
            com.google.android.exoplayer2.trackselection.ExoTrackSelection r2 = r9.trackSelection
            java.lang.Object r7 = r2.getSelectionData()
            com.google.android.exoplayer2.source.dash.manifest.Representation r2 = r11.representation
            if (r0 == 0) goto L137
            com.google.android.exoplayer2.source.dash.manifest.BaseUrl r4 = r11.selectedBaseUrl
            java.lang.String r4 = r4.url
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r1 = r0.attemptMerge(r1, r4)
            if (r1 != 0) goto L137
            goto L138
        L137:
            r0 = r1
        L138:
            com.google.android.exoplayer2.source.dash.manifest.BaseUrl r1 = r11.selectedBaseUrl
            java.lang.String r1 = r1.url
            r4 = 0
            com.google.android.exoplayer2.upstream.DataSpec r4 = com.google.android.exoplayer2.source.dash.DashUtil.buildDataSpec(r2, r1, r0, r4)
            com.google.android.exoplayer2.source.chunk.InitializationChunk r0 = new com.google.android.exoplayer2.source.chunk.InitializationChunk
            com.google.android.exoplayer2.source.chunk.ChunkExtractor r8 = r11.chunkExtractor
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r14 = r57
            r14.chunk = r0
            return
        L14e:
            r14 = r57
            r15 = 0
            long r16 = com.google.android.exoplayer2.source.dash.DefaultDashChunkSource.RepresentationHolder.access$000(r11)
            r18 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r20 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r20 == 0) goto L160
            r7 = 1
            goto L161
        L160:
            r7 = 0
        L161:
            long r0 = r11.getSegmentCount()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L16e
            r14.endOfStream = r7
            return
        L16e:
            long r21 = r11.getFirstAvailableSegmentNum(r12)
            long r12 = r11.getLastAvailableSegmentNum(r12)
            r0 = r51
            r1 = r11
            r2 = r24
            r3 = r54
            r5 = r21
            r15 = r7
            r7 = r12
            long r0 = r0.getSegmentNum(r1, r2, r3, r5, r7)
            int r2 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r2 >= 0) goto L191
            com.google.android.exoplayer2.source.BehindLiveWindowException r0 = new com.google.android.exoplayer2.source.BehindLiveWindowException
            r0.<init>()
            r9.fatalError = r0
            return
        L191:
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 > 0) goto L285
            boolean r3 = r9.missingLastSegment
            if (r3 == 0) goto L19d
            if (r2 < 0) goto L19d
            goto L285
        L19d:
            if (r15 == 0) goto L1aa
            long r2 = r11.getSegmentStartTimeUs(r0)
            int r4 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r4 < 0) goto L1aa
            r14.endOfStream = r10
            return
        L1aa:
            int r2 = r9.maxSegmentsPerLoad
            long r2 = (long) r2
            long r12 = r12 - r0
            r4 = 1
            long r12 = r12 + r4
            long r2 = java.lang.Math.min(r2, r12)
            int r3 = (int) r2
            if (r20 == 0) goto L1c8
        L1b8:
            if (r3 <= r10) goto L1c8
            long r6 = (long) r3
            long r6 = r6 + r0
            long r6 = r6 - r4
            long r6 = r11.getSegmentStartTimeUs(r6)
            int r2 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r2 < 0) goto L1c8
            int r3 = r3 + (-1)
            goto L1b8
        L1c8:
            boolean r2 = r56.isEmpty()
            if (r2 == 0) goto L1d1
            r39 = r54
            goto L1d3
        L1d1:
            r39 = r18
        L1d3:
            com.google.android.exoplayer2.upstream.DataSource r2 = r9.dataSource
            int r6 = r9.trackType
            com.google.android.exoplayer2.trackselection.ExoTrackSelection r7 = r9.trackSelection
            com.google.android.exoplayer2.Format r7 = r7.getSelectedFormat()
            com.google.android.exoplayer2.trackselection.ExoTrackSelection r8 = r9.trackSelection
            int r33 = r8.getSelectionReason()
            com.google.android.exoplayer2.trackselection.ExoTrackSelection r8 = r9.trackSelection
            java.lang.Object r34 = r8.getSelectionData()
            com.google.android.exoplayer2.source.dash.manifest.Representation r8 = r11.representation
            long r35 = r11.getSegmentStartTimeUs(r0)
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r12 = r11.getSegmentUrl(r0)
            com.google.android.exoplayer2.source.chunk.ChunkExtractor r13 = r11.chunkExtractor
            r15 = 8
            if (r13 != 0) goto L220
            long r37 = r11.getSegmentEndTimeUs(r0)
            r3 = r27
            boolean r3 = r11.isSegmentAvailableAtFullNetworkSpeed(r0, r3)
            if (r3 == 0) goto L206
            r15 = 0
        L206:
            com.google.android.exoplayer2.source.dash.manifest.BaseUrl r3 = r11.selectedBaseUrl
            java.lang.String r3 = r3.url
            com.google.android.exoplayer2.upstream.DataSpec r31 = com.google.android.exoplayer2.source.dash.DashUtil.buildDataSpec(r8, r3, r12, r15)
            com.google.android.exoplayer2.source.chunk.SingleSampleMediaChunk r3 = new com.google.android.exoplayer2.source.chunk.SingleSampleMediaChunk
            r29 = r3
            r30 = r2
            r32 = r7
            r39 = r0
            r41 = r6
            r42 = r7
            r29.<init>(r30, r31, r32, r33, r34, r35, r37, r39, r41, r42)
            goto L282
        L220:
            r49 = r27
            r6 = 1
        L223:
            if (r10 >= r3) goto L23e
            long r4 = (long) r10
            long r4 = r4 + r0
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r4 = r11.getSegmentUrl(r4)
            com.google.android.exoplayer2.source.dash.manifest.BaseUrl r5 = r11.selectedBaseUrl
            java.lang.String r5 = r5.url
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r4 = r12.attemptMerge(r4, r5)
            if (r4 != 0) goto L236
            goto L23e
        L236:
            int r6 = r6 + 1
            int r10 = r10 + 1
            r12 = r4
            r4 = 1
            goto L223
        L23e:
            long r3 = (long) r6
            long r3 = r3 + r0
            r16 = 1
            long r3 = r3 - r16
            long r37 = r11.getSegmentEndTimeUs(r3)
            long r16 = com.google.android.exoplayer2.source.dash.DefaultDashChunkSource.RepresentationHolder.access$000(r11)
            int r5 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r5 == 0) goto L257
            int r5 = (r16 > r37 ? 1 : (r16 == r37 ? 0 : -1))
            if (r5 > 0) goto L257
            r41 = r16
            goto L259
        L257:
            r41 = r18
        L259:
            r9 = r49
            boolean r3 = r11.isSegmentAvailableAtFullNetworkSpeed(r3, r9)
            if (r3 == 0) goto L262
            r15 = 0
        L262:
            com.google.android.exoplayer2.source.dash.manifest.BaseUrl r3 = r11.selectedBaseUrl
            java.lang.String r3 = r3.url
            com.google.android.exoplayer2.upstream.DataSpec r31 = com.google.android.exoplayer2.source.dash.DashUtil.buildDataSpec(r8, r3, r12, r15)
            long r3 = r8.presentationTimeOffsetUs
            long r3 = -r3
            r46 = r3
            com.google.android.exoplayer2.source.chunk.ContainerMediaChunk r3 = new com.google.android.exoplayer2.source.chunk.ContainerMediaChunk
            r29 = r3
            com.google.android.exoplayer2.source.chunk.ChunkExtractor r4 = r11.chunkExtractor
            r48 = r4
            r30 = r2
            r32 = r7
            r43 = r0
            r45 = r6
            r29.<init>(r30, r31, r32, r33, r34, r35, r37, r39, r41, r43, r45, r46, r48)
        L282:
            r14.chunk = r3
            return
        L285:
            r14.endOfStream = r15
            return
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public int getPreferredQueueSize(long r3, java.util.List<? extends com.google.android.exoplayer2.source.chunk.MediaChunk> r5) {
            r2 = this;
            java.io.IOException r0 = r2.fatalError
            if (r0 != 0) goto L15
            com.google.android.exoplayer2.trackselection.ExoTrackSelection r0 = r2.trackSelection
            int r0 = r0.length()
            r1 = 2
            if (r0 >= r1) goto Le
            goto L15
        Le:
            com.google.android.exoplayer2.trackselection.ExoTrackSelection r0 = r2.trackSelection
            int r3 = r0.evaluateQueueSize(r3, r5)
            return r3
        L15:
            int r3 = r5.size()
            return r3
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public void maybeThrowError() throws java.io.IOException {
            r1 = this;
            java.io.IOException r0 = r1.fatalError
            if (r0 != 0) goto La
            com.google.android.exoplayer2.upstream.LoaderErrorThrower r0 = r1.manifestLoaderErrorThrower
            r0.maybeThrowError()
            return
        La:
            throw r0
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public void onChunkLoadCompleted(com.google.android.exoplayer2.source.chunk.Chunk r8) {
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.exoplayer2.source.chunk.InitializationChunk
            if (r0 == 0) goto L30
            r0 = r8
            com.google.android.exoplayer2.source.chunk.InitializationChunk r0 = (com.google.android.exoplayer2.source.chunk.InitializationChunk) r0
            com.google.android.exoplayer2.trackselection.ExoTrackSelection r1 = r7.trackSelection
            com.google.android.exoplayer2.Format r0 = r0.trackFormat
            int r0 = r1.indexOf(r0)
            com.google.android.exoplayer2.source.dash.DefaultDashChunkSource$RepresentationHolder[] r1 = r7.representationHolders
            r1 = r1[r0]
            com.google.android.exoplayer2.source.dash.DashSegmentIndex r2 = r1.segmentIndex
            if (r2 != 0) goto L30
            com.google.android.exoplayer2.source.chunk.ChunkExtractor r2 = r1.chunkExtractor
            com.google.android.exoplayer2.extractor.ChunkIndex r2 = r2.getChunkIndex()
            if (r2 == 0) goto L30
            com.google.android.exoplayer2.source.dash.DefaultDashChunkSource$RepresentationHolder[] r3 = r7.representationHolders
            com.google.android.exoplayer2.source.dash.DashWrappingSegmentIndex r4 = new com.google.android.exoplayer2.source.dash.DashWrappingSegmentIndex
            com.google.android.exoplayer2.source.dash.manifest.Representation r5 = r1.representation
            long r5 = r5.presentationTimeOffsetUs
            r4.<init>(r2, r5)
            com.google.android.exoplayer2.source.dash.DefaultDashChunkSource$RepresentationHolder r1 = r1.copyWithNewSegmentIndex(r4)
            r3[r0] = r1
        L30:
            com.google.android.exoplayer2.source.dash.PlayerEmsgHandler$PlayerTrackEmsgHandler r0 = r7.playerTrackEmsgHandler
            if (r0 == 0) goto L37
            r0.onChunkLoadCompleted(r8)
        L37:
            return
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public boolean onChunkLoadError(com.google.android.exoplayer2.source.chunk.Chunk r8, boolean r9, com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy.LoadErrorInfo r10, com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r11) {
            r7 = this;
            r0 = 0
            if (r9 != 0) goto L4
            return r0
        L4:
            com.google.android.exoplayer2.source.dash.PlayerEmsgHandler$PlayerTrackEmsgHandler r9 = r7.playerTrackEmsgHandler
            r1 = 1
            if (r9 == 0) goto L10
            boolean r9 = r9.onChunkLoadError(r8)
            if (r9 == 0) goto L10
            return r1
        L10:
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r9 = r7.manifest
            boolean r9 = r9.dynamic
            if (r9 != 0) goto L5a
            boolean r9 = r8 instanceof com.google.android.exoplayer2.source.chunk.MediaChunk
            if (r9 == 0) goto L5a
            java.io.IOException r9 = r10.exception
            boolean r2 = r9 instanceof com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException
            if (r2 == 0) goto L5a
            com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException r9 = (com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException) r9
            int r9 = r9.responseCode
            r2 = 404(0x194, float:5.66E-43)
            if (r9 != r2) goto L5a
            com.google.android.exoplayer2.source.dash.DefaultDashChunkSource$RepresentationHolder[] r9 = r7.representationHolders
            com.google.android.exoplayer2.trackselection.ExoTrackSelection r2 = r7.trackSelection
            com.google.android.exoplayer2.Format r3 = r8.trackFormat
            int r2 = r2.indexOf(r3)
            r9 = r9[r2]
            long r2 = r9.getSegmentCount()
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L5a
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L5a
            long r4 = r9.getFirstSegmentNum()
            long r4 = r4 + r2
            r2 = 1
            long r4 = r4 - r2
            r9 = r8
            com.google.android.exoplayer2.source.chunk.MediaChunk r9 = (com.google.android.exoplayer2.source.chunk.MediaChunk) r9
            long r2 = r9.getNextChunkIndex()
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 <= 0) goto L5a
            r7.missingLastSegment = r1
            return r1
        L5a:
            com.google.android.exoplayer2.trackselection.ExoTrackSelection r9 = r7.trackSelection
            com.google.android.exoplayer2.Format r2 = r8.trackFormat
            int r9 = r9.indexOf(r2)
            com.google.android.exoplayer2.source.dash.DefaultDashChunkSource$RepresentationHolder[] r2 = r7.representationHolders
            r9 = r2[r9]
            com.google.android.exoplayer2.source.dash.BaseUrlExclusionList r2 = r7.baseUrlExclusionList
            com.google.android.exoplayer2.source.dash.manifest.Representation r3 = r9.representation
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.dash.manifest.BaseUrl> r3 = r3.baseUrls
            com.google.android.exoplayer2.source.dash.manifest.BaseUrl r2 = r2.selectBaseUrl(r3)
            if (r2 == 0) goto L7b
            com.google.android.exoplayer2.source.dash.manifest.BaseUrl r3 = r9.selectedBaseUrl
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L7b
            return r1
        L7b:
            com.google.android.exoplayer2.trackselection.ExoTrackSelection r2 = r7.trackSelection
            com.google.android.exoplayer2.source.dash.manifest.Representation r3 = r9.representation
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.dash.manifest.BaseUrl> r3 = r3.baseUrls
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy$FallbackOptions r2 = r7.createFallbackOptions(r2, r3)
            r3 = 2
            boolean r4 = r2.isFallbackAvailable(r3)
            if (r4 != 0) goto L93
            boolean r4 = r2.isFallbackAvailable(r1)
            if (r4 != 0) goto L93
            return r0
        L93:
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy$FallbackSelection r10 = r11.getFallbackSelectionFor(r2, r10)
            if (r10 == 0) goto Lc1
            int r11 = r10.type
            boolean r11 = r2.isFallbackAvailable(r11)
            if (r11 != 0) goto La2
            goto Lc1
        La2:
            int r11 = r10.type
            if (r11 != r3) goto Lb5
            com.google.android.exoplayer2.trackselection.ExoTrackSelection r9 = r7.trackSelection
            com.google.android.exoplayer2.Format r8 = r8.trackFormat
            int r8 = r9.indexOf(r8)
            long r10 = r10.exclusionDurationMs
            boolean r0 = r9.blacklist(r8, r10)
            goto Lc1
        Lb5:
            if (r11 != r1) goto Lc1
            com.google.android.exoplayer2.source.dash.BaseUrlExclusionList r8 = r7.baseUrlExclusionList
            com.google.android.exoplayer2.source.dash.manifest.BaseUrl r9 = r9.selectedBaseUrl
            long r10 = r10.exclusionDurationMs
            r8.exclude(r9, r10)
            r0 = 1
        Lc1:
            return r0
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public void release() {
            r4 = this;
            com.google.android.exoplayer2.source.dash.DefaultDashChunkSource$RepresentationHolder[] r0 = r4.representationHolders
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            com.google.android.exoplayer2.source.chunk.ChunkExtractor r3 = r3.chunkExtractor
            if (r3 == 0) goto Lf
            r3.release()
        Lf:
            int r2 = r2 + 1
            goto L4
        L12:
            return
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public boolean shouldCancelLoad(long r2, com.google.android.exoplayer2.source.chunk.Chunk r4, java.util.List<? extends com.google.android.exoplayer2.source.chunk.MediaChunk> r5) {
            r1 = this;
            java.io.IOException r0 = r1.fatalError
            if (r0 == 0) goto L6
            r2 = 0
            return r2
        L6:
            com.google.android.exoplayer2.trackselection.ExoTrackSelection r0 = r1.trackSelection
            boolean r2 = r0.shouldCancelChunkLoad(r2, r4, r5)
            return r2
    }

    @Override // com.google.android.exoplayer2.source.dash.DashChunkSource
    public void updateManifest(com.google.android.exoplayer2.source.dash.manifest.DashManifest r6, int r7) {
            r5 = this;
            r5.manifest = r6     // Catch: com.google.android.exoplayer2.source.BehindLiveWindowException -> L2b
            r5.periodIndex = r7     // Catch: com.google.android.exoplayer2.source.BehindLiveWindowException -> L2b
            long r6 = r6.getPeriodDurationUs(r7)     // Catch: com.google.android.exoplayer2.source.BehindLiveWindowException -> L2b
            java.util.ArrayList r0 = r5.getRepresentations()     // Catch: com.google.android.exoplayer2.source.BehindLiveWindowException -> L2b
            r1 = 0
        Ld:
            com.google.android.exoplayer2.source.dash.DefaultDashChunkSource$RepresentationHolder[] r2 = r5.representationHolders     // Catch: com.google.android.exoplayer2.source.BehindLiveWindowException -> L2b
            int r2 = r2.length     // Catch: com.google.android.exoplayer2.source.BehindLiveWindowException -> L2b
            if (r1 >= r2) goto L2e
            com.google.android.exoplayer2.trackselection.ExoTrackSelection r2 = r5.trackSelection     // Catch: com.google.android.exoplayer2.source.BehindLiveWindowException -> L2b
            int r2 = r2.getIndexInTrackGroup(r1)     // Catch: com.google.android.exoplayer2.source.BehindLiveWindowException -> L2b
            java.lang.Object r2 = r0.get(r2)     // Catch: com.google.android.exoplayer2.source.BehindLiveWindowException -> L2b
            com.google.android.exoplayer2.source.dash.manifest.Representation r2 = (com.google.android.exoplayer2.source.dash.manifest.Representation) r2     // Catch: com.google.android.exoplayer2.source.BehindLiveWindowException -> L2b
            com.google.android.exoplayer2.source.dash.DefaultDashChunkSource$RepresentationHolder[] r3 = r5.representationHolders     // Catch: com.google.android.exoplayer2.source.BehindLiveWindowException -> L2b
            r4 = r3[r1]     // Catch: com.google.android.exoplayer2.source.BehindLiveWindowException -> L2b
            com.google.android.exoplayer2.source.dash.DefaultDashChunkSource$RepresentationHolder r2 = r4.copyWithNewRepresentation(r6, r2)     // Catch: com.google.android.exoplayer2.source.BehindLiveWindowException -> L2b
            r3[r1] = r2     // Catch: com.google.android.exoplayer2.source.BehindLiveWindowException -> L2b
            int r1 = r1 + 1
            goto Ld
        L2b:
            r6 = move-exception
            r5.fatalError = r6
        L2e:
            return
    }

    @Override // com.google.android.exoplayer2.source.dash.DashChunkSource
    public void updateTrackSelection(com.google.android.exoplayer2.trackselection.ExoTrackSelection r1) {
            r0 = this;
            r0.trackSelection = r1
            return
    }
}
