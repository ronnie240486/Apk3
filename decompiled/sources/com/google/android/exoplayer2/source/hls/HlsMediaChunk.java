package com.google.android.exoplayer2.source.hls;

/* JADX INFO: loaded from: classes.dex */
final class HlsMediaChunk extends com.google.android.exoplayer2.source.chunk.MediaChunk {
    public static final java.lang.String PRIV_TIMESTAMP_FRAME_OWNER = "com.apple.streaming.transportStreamTimestamp";
    private static final java.util.concurrent.atomic.AtomicInteger uidSource = null;
    public final int discontinuitySequenceNumber;

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.drm.DrmInitData drmInitData;
    private com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor extractor;
    private final com.google.android.exoplayer2.source.hls.HlsExtractorFactory extractorFactory;
    private boolean extractorInvalidated;
    private final boolean hasGapTag;
    private final com.google.android.exoplayer2.metadata.id3.Id3Decoder id3Decoder;
    private boolean initDataLoadRequired;

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.upstream.DataSource initDataSource;

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.upstream.DataSpec initDataSpec;
    private final boolean initSegmentEncrypted;
    private final boolean isMasterTimestampSource;
    private boolean isPublished;
    private volatile boolean loadCanceled;
    private boolean loadCompleted;
    private final boolean mediaSegmentEncrypted;

    @androidx.annotation.Nullable
    private final java.util.List<com.google.android.exoplayer2.Format> muxedCaptionFormats;
    private int nextLoadPosition;
    private com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper output;
    public final int partIndex;
    private final com.google.android.exoplayer2.analytics.PlayerId playerId;
    public final android.net.Uri playlistUrl;

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor previousExtractor;
    private com.google.common.collect.ImmutableList<java.lang.Integer> sampleQueueFirstSampleIndices;
    private final com.google.android.exoplayer2.util.ParsableByteArray scratchId3Data;
    public final boolean shouldSpliceIn;
    private final com.google.android.exoplayer2.util.TimestampAdjuster timestampAdjuster;
    public final int uid;

    static {
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            com.google.android.exoplayer2.source.hls.HlsMediaChunk.uidSource = r0
            return
    }

    private HlsMediaChunk(com.google.android.exoplayer2.source.hls.HlsExtractorFactory r15, com.google.android.exoplayer2.upstream.DataSource r16, com.google.android.exoplayer2.upstream.DataSpec r17, com.google.android.exoplayer2.Format r18, boolean r19, @androidx.annotation.Nullable com.google.android.exoplayer2.upstream.DataSource r20, @androidx.annotation.Nullable com.google.android.exoplayer2.upstream.DataSpec r21, boolean r22, android.net.Uri r23, @androidx.annotation.Nullable java.util.List<com.google.android.exoplayer2.Format> r24, int r25, @androidx.annotation.Nullable java.lang.Object r26, long r27, long r29, long r31, int r33, boolean r34, int r35, boolean r36, boolean r37, com.google.android.exoplayer2.util.TimestampAdjuster r38, @androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmInitData r39, @androidx.annotation.Nullable com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor r40, com.google.android.exoplayer2.metadata.id3.Id3Decoder r41, com.google.android.exoplayer2.util.ParsableByteArray r42, boolean r43, com.google.android.exoplayer2.analytics.PlayerId r44) {
            r14 = this;
            r12 = r14
            r13 = r21
            r0 = r14
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r25
            r5 = r26
            r6 = r27
            r8 = r29
            r10 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10)
            r0 = r19
            r12.mediaSegmentEncrypted = r0
            r0 = r33
            r12.partIndex = r0
            r0 = r34
            r12.isPublished = r0
            r0 = r35
            r12.discontinuitySequenceNumber = r0
            r12.initDataSpec = r13
            r0 = r20
            r12.initDataSource = r0
            if (r13 == 0) goto L31
            r0 = 1
            goto L32
        L31:
            r0 = 0
        L32:
            r12.initDataLoadRequired = r0
            r0 = r22
            r12.initSegmentEncrypted = r0
            r0 = r23
            r12.playlistUrl = r0
            r0 = r37
            r12.isMasterTimestampSource = r0
            r0 = r38
            r12.timestampAdjuster = r0
            r0 = r36
            r12.hasGapTag = r0
            r0 = r15
            r12.extractorFactory = r0
            r0 = r24
            r12.muxedCaptionFormats = r0
            r0 = r39
            r12.drmInitData = r0
            r0 = r40
            r12.previousExtractor = r0
            r0 = r41
            r12.id3Decoder = r0
            r0 = r42
            r12.scratchId3Data = r0
            r0 = r43
            r12.shouldSpliceIn = r0
            r0 = r44
            r12.playerId = r0
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()
            r12.sampleQueueFirstSampleIndices = r0
            java.util.concurrent.atomic.AtomicInteger r0 = com.google.android.exoplayer2.source.hls.HlsMediaChunk.uidSource
            int r0 = r0.getAndIncrement()
            r12.uid = r0
            return
    }

    private static com.google.android.exoplayer2.upstream.DataSource buildDataSource(com.google.android.exoplayer2.upstream.DataSource r1, @androidx.annotation.Nullable byte[] r2, @androidx.annotation.Nullable byte[] r3) {
            if (r2 == 0) goto Lb
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
            com.google.android.exoplayer2.source.hls.Aes128DataSource r0 = new com.google.android.exoplayer2.source.hls.Aes128DataSource
            r0.<init>(r1, r2, r3)
            return r0
        Lb:
            return r1
    }

    public static com.google.android.exoplayer2.source.hls.HlsMediaChunk createInstance(com.google.android.exoplayer2.source.hls.HlsExtractorFactory r41, com.google.android.exoplayer2.upstream.DataSource r42, com.google.android.exoplayer2.Format r43, long r44, com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r46, com.google.android.exoplayer2.source.hls.HlsChunkSource.SegmentBaseHolder r47, android.net.Uri r48, @androidx.annotation.Nullable java.util.List<com.google.android.exoplayer2.Format> r49, int r50, @androidx.annotation.Nullable java.lang.Object r51, boolean r52, com.google.android.exoplayer2.source.hls.TimestampAdjusterProvider r53, @androidx.annotation.Nullable com.google.android.exoplayer2.source.hls.HlsMediaChunk r54, @androidx.annotation.Nullable byte[] r55, @androidx.annotation.Nullable byte[] r56, boolean r57, com.google.android.exoplayer2.analytics.PlayerId r58) {
            r0 = r42
            r1 = r46
            r2 = r47
            r3 = r54
            r4 = r55
            r5 = r56
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$SegmentBase r6 = r2.segmentBase
            com.google.android.exoplayer2.upstream.DataSpec$Builder r7 = new com.google.android.exoplayer2.upstream.DataSpec$Builder
            r7.<init>()
            java.lang.String r8 = r1.baseUri
            java.lang.String r9 = r6.url
            android.net.Uri r8 = com.google.android.exoplayer2.util.UriUtil.resolveToUri(r8, r9)
            com.google.android.exoplayer2.upstream.DataSpec$Builder r7 = r7.setUri(r8)
            long r8 = r6.byteRangeOffset
            com.google.android.exoplayer2.upstream.DataSpec$Builder r7 = r7.setPosition(r8)
            long r8 = r6.byteRangeLength
            com.google.android.exoplayer2.upstream.DataSpec$Builder r7 = r7.setLength(r8)
            boolean r8 = r2.isPreload
            if (r8 == 0) goto L32
            r8 = 8
            goto L33
        L32:
            r8 = 0
        L33:
            com.google.android.exoplayer2.upstream.DataSpec$Builder r7 = r7.setFlags(r8)
            com.google.android.exoplayer2.upstream.DataSpec r13 = r7.build()
            r7 = 1
            if (r4 == 0) goto L40
            r15 = 1
            goto L41
        L40:
            r15 = 0
        L41:
            if (r15 == 0) goto L50
            java.lang.String r10 = r6.encryptionIV
            java.lang.Object r10 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r10)
            java.lang.String r10 = (java.lang.String) r10
            byte[] r10 = getEncryptionIvArray(r10)
            goto L51
        L50:
            r10 = 0
        L51:
            com.google.android.exoplayer2.upstream.DataSource r12 = buildDataSource(r0, r4, r10)
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment r4 = r6.initializationSegment
            if (r4 == 0) goto L90
            if (r5 == 0) goto L5d
            r10 = 1
            goto L5e
        L5d:
            r10 = 0
        L5e:
            if (r10 == 0) goto L6d
            java.lang.String r11 = r4.encryptionIV
            java.lang.Object r11 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r11)
            java.lang.String r11 = (java.lang.String) r11
            byte[] r11 = getEncryptionIvArray(r11)
            goto L6e
        L6d:
            r11 = 0
        L6e:
            java.lang.String r14 = r1.baseUri
            java.lang.String r8 = r4.url
            android.net.Uri r18 = com.google.android.exoplayer2.util.UriUtil.resolveToUri(r14, r8)
            com.google.android.exoplayer2.upstream.DataSpec r8 = new com.google.android.exoplayer2.upstream.DataSpec
            r55 = r10
            long r9 = r4.byteRangeOffset
            r23 = r15
            long r14 = r4.byteRangeLength
            r17 = r8
            r19 = r9
            r21 = r14
            r17.<init>(r18, r19, r21)
            com.google.android.exoplayer2.upstream.DataSource r0 = buildDataSource(r0, r5, r11)
            r18 = r55
            goto L96
        L90:
            r23 = r15
            r0 = 0
            r8 = 0
            r18 = 0
        L96:
            long r4 = r6.relativeStartTimeUs
            long r4 = r44 + r4
            long r9 = r6.durationUs
            long r25 = r4 + r9
            int r1 = r1.discontinuitySequence
            int r9 = r6.relativeDiscontinuitySequence
            int r1 = r1 + r9
            if (r3 == 0) goto Lf6
            com.google.android.exoplayer2.upstream.DataSpec r9 = r3.initDataSpec
            if (r8 == r9) goto Lc4
            if (r8 == 0) goto Lc2
            if (r9 == 0) goto Lc2
            android.net.Uri r10 = r8.uri
            android.net.Uri r9 = r9.uri
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto Lc2
            long r9 = r8.position
            com.google.android.exoplayer2.upstream.DataSpec r11 = r3.initDataSpec
            long r14 = r11.position
            int r11 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r11 != 0) goto Lc2
            goto Lc4
        Lc2:
            r9 = 0
            goto Lc5
        Lc4:
            r9 = 1
        Lc5:
            android.net.Uri r10 = r3.playlistUrl
            r15 = r48
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto Ld6
            boolean r10 = r3.loadCompleted
            if (r10 == 0) goto Ld6
            r24 = 1
            goto Ld8
        Ld6:
            r24 = 0
        Ld8:
            com.google.android.exoplayer2.metadata.id3.Id3Decoder r10 = r3.id3Decoder
            com.google.android.exoplayer2.util.ParsableByteArray r11 = r3.scratchId3Data
            if (r9 == 0) goto Led
            if (r24 == 0) goto Led
            boolean r9 = r3.extractorInvalidated
            if (r9 != 0) goto Led
            int r9 = r3.discontinuitySequenceNumber
            if (r9 != r1) goto Led
            com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor r3 = r3.extractor
            r16 = r3
            goto Lef
        Led:
            r16 = 0
        Lef:
            r37 = r10
            r38 = r11
            r36 = r16
            goto L10a
        Lf6:
            r15 = r48
            com.google.android.exoplayer2.metadata.id3.Id3Decoder r3 = new com.google.android.exoplayer2.metadata.id3.Id3Decoder
            r3.<init>()
            com.google.android.exoplayer2.util.ParsableByteArray r9 = new com.google.android.exoplayer2.util.ParsableByteArray
            r10 = 10
            r9.<init>(r10)
            r37 = r3
            r38 = r9
            r36 = 0
        L10a:
            com.google.android.exoplayer2.source.hls.HlsMediaChunk r3 = new com.google.android.exoplayer2.source.hls.HlsMediaChunk
            long r9 = r2.mediaSequence
            int r14 = r2.partIndex
            boolean r2 = r2.isPreload
            r30 = r2 ^ 1
            boolean r2 = r6.hasGapTag
            r32 = r2
            r2 = r53
            com.google.android.exoplayer2.util.TimestampAdjuster r34 = r2.getAdjuster(r1)
            com.google.android.exoplayer2.drm.DrmInitData r2 = r6.drmInitData
            r35 = r2
            r6 = r9
            r10 = r3
            r11 = r41
            r2 = r14
            r14 = r43
            r15 = r23
            r16 = r0
            r17 = r8
            r19 = r48
            r20 = r49
            r21 = r50
            r22 = r51
            r23 = r4
            r27 = r6
            r29 = r2
            r31 = r1
            r33 = r52
            r39 = r57
            r40 = r58
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r25, r27, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            return r3
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"output"})
    private void feedDataToExtractor(com.google.android.exoplayer2.upstream.DataSource r4, com.google.android.exoplayer2.upstream.DataSpec r5, boolean r6, boolean r7) throws java.io.IOException {
            r3 = this;
            r0 = 0
            if (r6 == 0) goto Lb
            int r6 = r3.nextLoadPosition
            if (r6 == 0) goto L9
            r6 = 1
            r0 = 1
        L9:
            r6 = r5
            goto L12
        Lb:
            int r6 = r3.nextLoadPosition
            long r1 = (long) r6
            com.google.android.exoplayer2.upstream.DataSpec r6 = r5.subrange(r1)
        L12:
            com.google.android.exoplayer2.extractor.DefaultExtractorInput r6 = r3.prepareExtraction(r4, r6, r7)     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L1d
            int r7 = r3.nextLoadPosition     // Catch: java.lang.Throwable -> L5c
            r6.skipFully(r7)     // Catch: java.lang.Throwable -> L5c
        L1d:
            boolean r7 = r3.loadCanceled     // Catch: java.lang.Throwable -> L35 java.io.EOFException -> L37
            if (r7 != 0) goto L2a
            com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor r7 = r3.extractor     // Catch: java.lang.Throwable -> L35 java.io.EOFException -> L37
            boolean r7 = r7.read(r6)     // Catch: java.lang.Throwable -> L35 java.io.EOFException -> L37
            if (r7 == 0) goto L2a
            goto L1d
        L2a:
            long r6 = r6.getPosition()     // Catch: java.lang.Throwable -> L5c
            long r0 = r5.position     // Catch: java.lang.Throwable -> L5c
        L30:
            long r6 = r6 - r0
            int r5 = (int) r6     // Catch: java.lang.Throwable -> L5c
            r3.nextLoadPosition = r5     // Catch: java.lang.Throwable -> L5c
            goto L4c
        L35:
            r7 = move-exception
            goto L51
        L37:
            r7 = move-exception
            com.google.android.exoplayer2.Format r0 = r3.trackFormat     // Catch: java.lang.Throwable -> L35
            int r0 = r0.roleFlags     // Catch: java.lang.Throwable -> L35
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L50
            com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor r7 = r3.extractor     // Catch: java.lang.Throwable -> L35
            r7.onTruncatedSegmentParsed()     // Catch: java.lang.Throwable -> L35
            long r6 = r6.getPosition()     // Catch: java.lang.Throwable -> L5c
            long r0 = r5.position     // Catch: java.lang.Throwable -> L5c
            goto L30
        L4c:
            com.google.android.exoplayer2.upstream.DataSourceUtil.closeQuietly(r4)
            return
        L50:
            throw r7     // Catch: java.lang.Throwable -> L35
        L51:
            long r0 = r6.getPosition()     // Catch: java.lang.Throwable -> L5c
            long r5 = r5.position     // Catch: java.lang.Throwable -> L5c
            long r0 = r0 - r5
            int r5 = (int) r0     // Catch: java.lang.Throwable -> L5c
            r3.nextLoadPosition = r5     // Catch: java.lang.Throwable -> L5c
            throw r7     // Catch: java.lang.Throwable -> L5c
        L5c:
            r5 = move-exception
            com.google.android.exoplayer2.upstream.DataSourceUtil.closeQuietly(r4)
            throw r5
    }

    private static byte[] getEncryptionIvArray(java.lang.String r4) {
            java.lang.String r0 = com.google.common.base.Ascii.toLowerCase(r4)
            java.lang.String r1 = "0x"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L11
            r0 = 2
            java.lang.String r4 = r4.substring(r0)
        L11:
            java.math.BigInteger r0 = new java.math.BigInteger
            r1 = 16
            r0.<init>(r4, r1)
            byte[] r4 = r0.toByteArray()
            byte[] r0 = new byte[r1]
            int r2 = r4.length
            if (r2 <= r1) goto L24
            int r2 = r4.length
            int r2 = r2 - r1
            goto L25
        L24:
            r2 = 0
        L25:
            int r3 = r4.length
            int r1 = r1 - r3
            int r1 = r1 + r2
            int r3 = r4.length
            int r3 = r3 - r2
            java.lang.System.arraycopy(r4, r2, r0, r1, r3)
            return r0
    }

    private static boolean isIndependent(com.google.android.exoplayer2.source.hls.HlsChunkSource.SegmentBaseHolder r2, com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r3) {
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$SegmentBase r0 = r2.segmentBase
            boolean r1 = r0 instanceof com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Part
            if (r1 == 0) goto L19
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Part r0 = (com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Part) r0
            boolean r0 = r0.isIndependent
            if (r0 != 0) goto L17
            int r2 = r2.partIndex
            if (r2 != 0) goto L15
            boolean r2 = r3.hasIndependentSegments
            if (r2 == 0) goto L15
            goto L17
        L15:
            r2 = 0
            goto L18
        L17:
            r2 = 1
        L18:
            return r2
        L19:
            boolean r2 = r3.hasIndependentSegments
            return r2
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"output"})
    private void loadMedia() throws java.io.IOException {
            r4 = this;
            com.google.android.exoplayer2.upstream.StatsDataSource r0 = r4.dataSource
            com.google.android.exoplayer2.upstream.DataSpec r1 = r4.dataSpec
            boolean r2 = r4.mediaSegmentEncrypted
            r3 = 1
            r4.feedDataToExtractor(r0, r1, r2, r3)
            return
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"output"})
    private void maybeLoadInitData() throws java.io.IOException {
            r4 = this;
            boolean r0 = r4.initDataLoadRequired
            if (r0 != 0) goto L5
            return
        L5:
            com.google.android.exoplayer2.upstream.DataSource r0 = r4.initDataSource
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.upstream.DataSpec r0 = r4.initDataSpec
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.upstream.DataSource r0 = r4.initDataSource
            com.google.android.exoplayer2.upstream.DataSpec r1 = r4.initDataSpec
            boolean r2 = r4.initSegmentEncrypted
            r3 = 0
            r4.feedDataToExtractor(r0, r1, r2, r3)
            r4.nextLoadPosition = r3
            r4.initDataLoadRequired = r3
            return
    }

    private long peekId3PrivTimestamp(com.google.android.exoplayer2.extractor.ExtractorInput r9) throws java.io.IOException {
            r8 = this;
            r9.resetPeekPosition()
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r8.scratchId3Data     // Catch: java.io.EOFException -> La9
            r3 = 10
            r2.reset(r3)     // Catch: java.io.EOFException -> La9
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r8.scratchId3Data     // Catch: java.io.EOFException -> La9
            byte[] r2 = r2.getData()     // Catch: java.io.EOFException -> La9
            r4 = 0
            r9.peekFully(r2, r4, r3)     // Catch: java.io.EOFException -> La9
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r8.scratchId3Data
            int r2 = r2.readUnsignedInt24()
            r5 = 4801587(0x494433, float:6.728456E-39)
            if (r2 == r5) goto L25
            return r0
        L25:
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r8.scratchId3Data
            r5 = 3
            r2.skipBytes(r5)
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r8.scratchId3Data
            int r2 = r2.readSynchSafeInt()
            int r5 = r2 + 10
            com.google.android.exoplayer2.util.ParsableByteArray r6 = r8.scratchId3Data
            int r6 = r6.capacity()
            if (r5 <= r6) goto L4f
            com.google.android.exoplayer2.util.ParsableByteArray r6 = r8.scratchId3Data
            byte[] r6 = r6.getData()
            com.google.android.exoplayer2.util.ParsableByteArray r7 = r8.scratchId3Data
            r7.reset(r5)
            com.google.android.exoplayer2.util.ParsableByteArray r5 = r8.scratchId3Data
            byte[] r5 = r5.getData()
            java.lang.System.arraycopy(r6, r4, r5, r4, r3)
        L4f:
            com.google.android.exoplayer2.util.ParsableByteArray r5 = r8.scratchId3Data
            byte[] r5 = r5.getData()
            r9.peekFully(r5, r3, r2)
            com.google.android.exoplayer2.metadata.id3.Id3Decoder r9 = r8.id3Decoder
            com.google.android.exoplayer2.util.ParsableByteArray r3 = r8.scratchId3Data
            byte[] r3 = r3.getData()
            com.google.android.exoplayer2.metadata.Metadata r9 = r9.decode(r3, r2)
            if (r9 != 0) goto L67
            return r0
        L67:
            int r2 = r9.length()
            r3 = 0
        L6c:
            if (r3 >= r2) goto La9
            com.google.android.exoplayer2.metadata.Metadata$Entry r5 = r9.get(r3)
            boolean r6 = r5 instanceof com.google.android.exoplayer2.metadata.id3.PrivFrame
            if (r6 == 0) goto La6
            com.google.android.exoplayer2.metadata.id3.PrivFrame r5 = (com.google.android.exoplayer2.metadata.id3.PrivFrame) r5
            java.lang.String r6 = r5.owner
            java.lang.String r7 = "com.apple.streaming.transportStreamTimestamp"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto La6
            byte[] r9 = r5.privateData
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r8.scratchId3Data
            byte[] r0 = r0.getData()
            r1 = 8
            java.lang.System.arraycopy(r9, r4, r0, r4, r1)
            com.google.android.exoplayer2.util.ParsableByteArray r9 = r8.scratchId3Data
            r9.setPosition(r4)
            com.google.android.exoplayer2.util.ParsableByteArray r9 = r8.scratchId3Data
            r9.setLimit(r1)
            com.google.android.exoplayer2.util.ParsableByteArray r9 = r8.scratchId3Data
            long r0 = r9.readLong()
            r2 = 8589934591(0x1ffffffff, double:4.2439915814E-314)
            long r0 = r0 & r2
            return r0
        La6:
            int r3 = r3 + 1
            goto L6c
        La9:
            return r0
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"extractor"})
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"output"})
    private com.google.android.exoplayer2.extractor.DefaultExtractorInput prepareExtraction(com.google.android.exoplayer2.upstream.DataSource r11, com.google.android.exoplayer2.upstream.DataSpec r12, boolean r13) throws java.io.IOException {
            r10 = this;
            long r4 = r11.open(r12)
            if (r13 == 0) goto L16
            com.google.android.exoplayer2.util.TimestampAdjuster r13 = r10.timestampAdjuster     // Catch: java.lang.InterruptedException -> L10
            boolean r0 = r10.isMasterTimestampSource     // Catch: java.lang.InterruptedException -> L10
            long r1 = r10.startTimeUs     // Catch: java.lang.InterruptedException -> L10
            r13.sharedInitializeOrWait(r0, r1)     // Catch: java.lang.InterruptedException -> L10
            goto L16
        L10:
            java.io.InterruptedIOException r11 = new java.io.InterruptedIOException
            r11.<init>()
            throw r11
        L16:
            com.google.android.exoplayer2.extractor.DefaultExtractorInput r13 = new com.google.android.exoplayer2.extractor.DefaultExtractorInput
            long r2 = r12.position
            r0 = r13
            r1 = r11
            r0.<init>(r1, r2, r4)
            com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor r0 = r10.extractor
            if (r0 != 0) goto L7b
            long r8 = r10.peekId3PrivTimestamp(r13)
            r13.resetPeekPosition()
            com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor r0 = r10.previousExtractor
            if (r0 == 0) goto L33
            com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor r11 = r0.recreate()
            goto L48
        L33:
            com.google.android.exoplayer2.source.hls.HlsExtractorFactory r0 = r10.extractorFactory
            android.net.Uri r1 = r12.uri
            com.google.android.exoplayer2.Format r2 = r10.trackFormat
            java.util.List<com.google.android.exoplayer2.Format> r3 = r10.muxedCaptionFormats
            com.google.android.exoplayer2.util.TimestampAdjuster r4 = r10.timestampAdjuster
            java.util.Map r5 = r11.getResponseHeaders()
            com.google.android.exoplayer2.analytics.PlayerId r7 = r10.playerId
            r6 = r13
            com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor r11 = r0.createExtractor(r1, r2, r3, r4, r5, r6, r7)
        L48:
            r10.extractor = r11
            boolean r11 = r11.isPackedAudioExtractor()
            if (r11 == 0) goto L68
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper r11 = r10.output
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r12 == 0) goto L62
            com.google.android.exoplayer2.util.TimestampAdjuster r12 = r10.timestampAdjuster
            long r0 = r12.adjustTsTimestamp(r8)
            goto L64
        L62:
            long r0 = r10.startTimeUs
        L64:
            r11.setSampleOffsetUs(r0)
            goto L6f
        L68:
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper r11 = r10.output
            r0 = 0
            r11.setSampleOffsetUs(r0)
        L6f:
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper r11 = r10.output
            r11.onNewExtractor()
            com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor r11 = r10.extractor
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper r12 = r10.output
            r11.init(r12)
        L7b:
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper r11 = r10.output
            com.google.android.exoplayer2.drm.DrmInitData r12 = r10.drmInitData
            r11.setDrmInitData(r12)
            return r13
    }

    public static boolean shouldSpliceIn(@androidx.annotation.Nullable com.google.android.exoplayer2.source.hls.HlsMediaChunk r3, android.net.Uri r4, com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r5, com.google.android.exoplayer2.source.hls.HlsChunkSource.SegmentBaseHolder r6, long r7) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            android.net.Uri r1 = r3.playlistUrl
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L11
            boolean r4 = r3.loadCompleted
            if (r4 == 0) goto L11
            return r0
        L11:
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$SegmentBase r4 = r6.segmentBase
            long r1 = r4.relativeStartTimeUs
            long r7 = r7 + r1
            boolean r4 = isIndependent(r6, r5)
            if (r4 == 0) goto L22
            long r3 = r3.endTimeUs
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 >= 0) goto L23
        L22:
            r0 = 1
        L23:
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public void cancelLoad() {
            r1 = this;
            r0 = 1
            r1.loadCanceled = r0
            return
    }

    public int getFirstSampleIndex(int r2) {
            r1 = this;
            boolean r0 = r1.shouldSpliceIn
            r0 = r0 ^ 1
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            com.google.common.collect.ImmutableList<java.lang.Integer> r0 = r1.sampleQueueFirstSampleIndices
            int r0 = r0.size()
            if (r2 < r0) goto L11
            r2 = 0
            return r2
        L11:
            com.google.common.collect.ImmutableList<java.lang.Integer> r0 = r1.sampleQueueFirstSampleIndices
            java.lang.Object r2 = r0.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            return r2
    }

    public void init(com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper r1, com.google.common.collect.ImmutableList<java.lang.Integer> r2) {
            r0 = this;
            r0.output = r1
            r0.sampleQueueFirstSampleIndices = r2
            return
    }

    public void invalidateExtractor() {
            r1 = this;
            r0 = 1
            r1.extractorInvalidated = r0
            return
    }

    @Override // com.google.android.exoplayer2.source.chunk.MediaChunk
    public boolean isLoadCompleted() {
            r1 = this;
            boolean r0 = r1.loadCompleted
            return r0
    }

    public boolean isPublished() {
            r1 = this;
            boolean r0 = r1.isPublished
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public void load() throws java.io.IOException {
            r1 = this;
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper r0 = r1.output
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor r0 = r1.extractor
            if (r0 != 0) goto L1a
            com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor r0 = r1.previousExtractor
            if (r0 == 0) goto L1a
            boolean r0 = r0.isReusable()
            if (r0 == 0) goto L1a
            com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor r0 = r1.previousExtractor
            r1.extractor = r0
            r0 = 0
            r1.initDataLoadRequired = r0
        L1a:
            r1.maybeLoadInitData()
            boolean r0 = r1.loadCanceled
            if (r0 != 0) goto L2e
            boolean r0 = r1.hasGapTag
            if (r0 != 0) goto L28
            r1.loadMedia()
        L28:
            boolean r0 = r1.loadCanceled
            r0 = r0 ^ 1
            r1.loadCompleted = r0
        L2e:
            return
    }

    public void publish() {
            r1 = this;
            r0 = 1
            r1.isPublished = r0
            return
    }
}
