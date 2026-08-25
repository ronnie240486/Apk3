package com.google.android.exoplayer2.source.hls;

/* JADX INFO: loaded from: classes2.dex */
class HlsChunkSource {
    public static final int CHUNK_PUBLICATION_STATE_PRELOAD = 0;
    public static final int CHUNK_PUBLICATION_STATE_PUBLISHED = 1;
    public static final int CHUNK_PUBLICATION_STATE_REMOVED = 2;
    private static final int KEY_CACHE_SIZE = 4;
    private final com.google.android.exoplayer2.upstream.DataSource encryptionDataSource;

    @androidx.annotation.Nullable
    private android.net.Uri expectedPlaylistUrl;
    private final com.google.android.exoplayer2.source.hls.HlsExtractorFactory extractorFactory;

    @androidx.annotation.Nullable
    private java.io.IOException fatalError;
    private boolean independentSegments;
    private boolean isTimestampMaster;
    private final com.google.android.exoplayer2.source.hls.FullSegmentEncryptionKeyCache keyCache;
    private long liveEdgeInPeriodTimeUs;
    private final com.google.android.exoplayer2.upstream.DataSource mediaDataSource;

    @androidx.annotation.Nullable
    private final java.util.List<com.google.android.exoplayer2.Format> muxedCaptionFormats;
    private final com.google.android.exoplayer2.analytics.PlayerId playerId;
    private final com.google.android.exoplayer2.Format[] playlistFormats;
    private final com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker playlistTracker;
    private final android.net.Uri[] playlistUrls;
    private byte[] scratchSpace;
    private boolean seenExpectedPlaylistError;
    private final com.google.android.exoplayer2.source.hls.TimestampAdjusterProvider timestampAdjusterProvider;
    private final com.google.android.exoplayer2.source.TrackGroup trackGroup;
    private com.google.android.exoplayer2.trackselection.ExoTrackSelection trackSelection;

    /* JADX INFO: loaded from: classes.dex */
    public static final class EncryptionKeyChunk extends com.google.android.exoplayer2.source.chunk.DataChunk {
        private byte[] result;

        public EncryptionKeyChunk(com.google.android.exoplayer2.upstream.DataSource r9, com.google.android.exoplayer2.upstream.DataSpec r10, com.google.android.exoplayer2.Format r11, int r12, @androidx.annotation.Nullable java.lang.Object r13, byte[] r14) {
                r8 = this;
                r3 = 3
                r0 = r8
                r1 = r9
                r2 = r10
                r4 = r11
                r5 = r12
                r6 = r13
                r7 = r14
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return
        }

        @Override // com.google.android.exoplayer2.source.chunk.DataChunk
        public final void consume(byte[] r1, int r2) {
                r0 = this;
                byte[] r1 = java.util.Arrays.copyOf(r1, r2)
                r0.result = r1
                return
        }

        @androidx.annotation.Nullable
        public byte[] getResult() {
                r1 = this;
                byte[] r0 = r1.result
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class HlsChunkHolder {

        @androidx.annotation.Nullable
        public com.google.android.exoplayer2.source.chunk.Chunk chunk;
        public boolean endOfStream;

        @androidx.annotation.Nullable
        public android.net.Uri playlistUrl;

        public HlsChunkHolder() {
                r0 = this;
                r0.<init>()
                r0.clear()
                return
        }

        public void clear() {
                r2 = this;
                r0 = 0
                r2.chunk = r0
                r1 = 0
                r2.endOfStream = r1
                r2.playlistUrl = r0
                return
        }
    }

    @androidx.annotation.VisibleForTesting
    public static final class HlsMediaPlaylistSegmentIterator extends com.google.android.exoplayer2.source.chunk.BaseMediaChunkIterator {
        private final java.lang.String playlistBaseUri;
        private final java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.SegmentBase> segmentBases;
        private final long startOfPlaylistInPeriodUs;

        public HlsMediaPlaylistSegmentIterator(java.lang.String r5, long r6, java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.SegmentBase> r8) {
                r4 = this;
                int r0 = r8.size()
                int r0 = r0 + (-1)
                long r0 = (long) r0
                r2 = 0
                r4.<init>(r2, r0)
                r4.playlistBaseUri = r5
                r4.startOfPlaylistInPeriodUs = r6
                r4.segmentBases = r8
                return
        }

        @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
        public long getChunkEndTimeUs() {
                r5 = this;
                r5.checkInBounds()
                java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$SegmentBase> r0 = r5.segmentBases
                long r1 = r5.getCurrentIndex()
                int r2 = (int) r1
                java.lang.Object r0 = r0.get(r2)
                com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$SegmentBase r0 = (com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.SegmentBase) r0
                long r1 = r5.startOfPlaylistInPeriodUs
                long r3 = r0.relativeStartTimeUs
                long r1 = r1 + r3
                long r3 = r0.durationUs
                long r1 = r1 + r3
                return r1
        }

        @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
        public long getChunkStartTimeUs() {
                r5 = this;
                r5.checkInBounds()
                long r0 = r5.startOfPlaylistInPeriodUs
                java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$SegmentBase> r2 = r5.segmentBases
                long r3 = r5.getCurrentIndex()
                int r4 = (int) r3
                java.lang.Object r2 = r2.get(r4)
                com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$SegmentBase r2 = (com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.SegmentBase) r2
                long r2 = r2.relativeStartTimeUs
                long r0 = r0 + r2
                return r0
        }

        @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
        public com.google.android.exoplayer2.upstream.DataSpec getDataSpec() {
                r9 = this;
                r9.checkInBounds()
                java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$SegmentBase> r0 = r9.segmentBases
                long r1 = r9.getCurrentIndex()
                int r2 = (int) r1
                java.lang.Object r0 = r0.get(r2)
                com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$SegmentBase r0 = (com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.SegmentBase) r0
                java.lang.String r1 = r9.playlistBaseUri
                java.lang.String r2 = r0.url
                android.net.Uri r4 = com.google.android.exoplayer2.util.UriUtil.resolveToUri(r1, r2)
                com.google.android.exoplayer2.upstream.DataSpec r1 = new com.google.android.exoplayer2.upstream.DataSpec
                long r5 = r0.byteRangeOffset
                long r7 = r0.byteRangeLength
                r3 = r1
                r3.<init>(r4, r5, r7)
                return r1
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class InitializationTrackSelection extends com.google.android.exoplayer2.trackselection.BaseTrackSelection {
        private int selectedIndex;

        public InitializationTrackSelection(com.google.android.exoplayer2.source.TrackGroup r2, int[] r3) {
                r1 = this;
                r1.<init>(r2, r3)
                r0 = 0
                r3 = r3[r0]
                com.google.android.exoplayer2.Format r2 = r2.getFormat(r3)
                int r2 = r1.indexOf(r2)
                r1.selectedIndex = r2
                return
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public int getSelectedIndex() {
                r1 = this;
                int r0 = r1.selectedIndex
                return r0
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        @androidx.annotation.Nullable
        public java.lang.Object getSelectionData() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public int getSelectionReason() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public void updateSelectedTrack(long r1, long r3, long r5, java.util.List<? extends com.google.android.exoplayer2.source.chunk.MediaChunk> r7, com.google.android.exoplayer2.source.chunk.MediaChunkIterator[] r8) {
                r0 = this;
                long r1 = android.os.SystemClock.elapsedRealtime()
                int r3 = r0.selectedIndex
                boolean r3 = r0.isBlacklisted(r3, r1)
                if (r3 != 0) goto Ld
                return
            Ld:
                int r3 = r0.length
                int r3 = r3 + (-1)
            L11:
                if (r3 < 0) goto L1f
                boolean r4 = r0.isBlacklisted(r3, r1)
                if (r4 != 0) goto L1c
                r0.selectedIndex = r3
                return
            L1c:
                int r3 = r3 + (-1)
                goto L11
            L1f:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                r1.<init>()
                throw r1
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class SegmentBaseHolder {
        public final boolean isPreload;
        public final long mediaSequence;
        public final int partIndex;
        public final com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.SegmentBase segmentBase;

        public SegmentBaseHolder(com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.SegmentBase r1, long r2, int r4) {
                r0 = this;
                r0.<init>()
                r0.segmentBase = r1
                r0.mediaSequence = r2
                r0.partIndex = r4
                boolean r2 = r1 instanceof com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Part
                if (r2 == 0) goto L15
                com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Part r1 = (com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Part) r1
                boolean r1 = r1.isPreload
                if (r1 == 0) goto L15
                r1 = 1
                goto L16
            L15:
                r1 = 0
            L16:
                r0.isPreload = r1
                return
        }
    }

    public HlsChunkSource(com.google.android.exoplayer2.source.hls.HlsExtractorFactory r1, com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r2, android.net.Uri[] r3, com.google.android.exoplayer2.Format[] r4, com.google.android.exoplayer2.source.hls.HlsDataSourceFactory r5, @androidx.annotation.Nullable com.google.android.exoplayer2.upstream.TransferListener r6, com.google.android.exoplayer2.source.hls.TimestampAdjusterProvider r7, @androidx.annotation.Nullable java.util.List<com.google.android.exoplayer2.Format> r8, com.google.android.exoplayer2.analytics.PlayerId r9) {
            r0 = this;
            r0.<init>()
            r0.extractorFactory = r1
            r0.playlistTracker = r2
            r0.playlistUrls = r3
            r0.playlistFormats = r4
            r0.timestampAdjusterProvider = r7
            r0.muxedCaptionFormats = r8
            r0.playerId = r9
            com.google.android.exoplayer2.source.hls.FullSegmentEncryptionKeyCache r1 = new com.google.android.exoplayer2.source.hls.FullSegmentEncryptionKeyCache
            r2 = 4
            r1.<init>(r2)
            r0.keyCache = r1
            byte[] r1 = com.google.android.exoplayer2.util.Util.EMPTY_BYTE_ARRAY
            r0.scratchSpace = r1
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.liveEdgeInPeriodTimeUs = r1
            r1 = 1
            com.google.android.exoplayer2.upstream.DataSource r1 = r5.createDataSource(r1)
            r0.mediaDataSource = r1
            if (r6 == 0) goto L30
            r1.addTransferListener(r6)
        L30:
            r1 = 3
            com.google.android.exoplayer2.upstream.DataSource r1 = r5.createDataSource(r1)
            r0.encryptionDataSource = r1
            com.google.android.exoplayer2.source.TrackGroup r1 = new com.google.android.exoplayer2.source.TrackGroup
            r1.<init>(r4)
            r0.trackGroup = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
        L44:
            int r5 = r3.length
            if (r2 >= r5) goto L59
            r5 = r4[r2]
            int r5 = r5.roleFlags
            r5 = r5 & 16384(0x4000, float:2.2959E-41)
            if (r5 != 0) goto L56
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r1.add(r5)
        L56:
            int r2 = r2 + 1
            goto L44
        L59:
            com.google.android.exoplayer2.source.hls.HlsChunkSource$InitializationTrackSelection r2 = new com.google.android.exoplayer2.source.hls.HlsChunkSource$InitializationTrackSelection
            com.google.android.exoplayer2.source.TrackGroup r3 = r0.trackGroup
            int[] r1 = com.google.common.primitives.Ints.toArray(r1)
            r2.<init>(r3, r1)
            r0.trackSelection = r2
            return
    }

    @androidx.annotation.Nullable
    private static android.net.Uri getFullEncryptionKeyUri(com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r0, @androidx.annotation.Nullable com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.SegmentBase r1) {
            if (r1 == 0) goto Le
            java.lang.String r1 = r1.fullSegmentEncryptionKeyUri
            if (r1 != 0) goto L7
            goto Le
        L7:
            java.lang.String r0 = r0.baseUri
            android.net.Uri r0 = com.google.android.exoplayer2.util.UriUtil.resolveToUri(r0, r1)
            return r0
        Le:
            r0 = 0
            return r0
    }

    private android.util.Pair<java.lang.Long, java.lang.Integer> getNextMediaSequenceAndPartIndex(@androidx.annotation.Nullable com.google.android.exoplayer2.source.hls.HlsMediaChunk r8, boolean r9, com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r10, long r11, long r13) {
            r7 = this;
            r0 = 1
            r1 = -1
            if (r8 == 0) goto L3f
            if (r9 == 0) goto L7
            goto L3f
        L7:
            boolean r9 = r8.isLoadCompleted()
            if (r9 == 0) goto L2d
            android.util.Pair r9 = new android.util.Pair
            int r10 = r8.partIndex
            if (r10 != r1) goto L18
            long r10 = r8.getNextChunkIndex()
            goto L1a
        L18:
            long r10 = r8.chunkIndex
        L1a:
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            int r8 = r8.partIndex
            if (r8 != r1) goto L23
            goto L25
        L23:
            int r1 = r8 + 1
        L25:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            r9.<init>(r10, r8)
            goto L3e
        L2d:
            android.util.Pair r9 = new android.util.Pair
            long r10 = r8.chunkIndex
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            int r8 = r8.partIndex
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9.<init>(r10, r8)
        L3e:
            return r9
        L3f:
            long r2 = r10.durationUs
            long r2 = r2 + r11
            if (r8 == 0) goto L4b
            boolean r9 = r7.independentSegments
            if (r9 == 0) goto L49
            goto L4b
        L49:
            long r13 = r8.startTimeUs
        L4b:
            boolean r9 = r10.hasEndTag
            if (r9 != 0) goto L6b
            int r9 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r9 < 0) goto L6b
            android.util.Pair r8 = new android.util.Pair
            long r11 = r10.mediaSequence
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment> r9 = r10.segments
            int r9 = r9.size()
            long r9 = (long) r9
            long r11 = r11 + r9
            java.lang.Long r9 = java.lang.Long.valueOf(r11)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            r8.<init>(r9, r10)
            return r8
        L6b:
            long r13 = r13 - r11
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment> r9 = r10.segments
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r12 = r7.playlistTracker
            boolean r12 = r12.isLive()
            r2 = 0
            if (r12 == 0) goto L80
            if (r8 != 0) goto L7e
            goto L80
        L7e:
            r8 = 0
            goto L81
        L80:
            r8 = 1
        L81:
            int r8 = com.google.android.exoplayer2.util.Util.binarySearchFloor(r9, r11, r0, r8)
            long r11 = (long) r8
            long r3 = r10.mediaSequence
            long r11 = r11 + r3
            if (r8 < 0) goto Lc9
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment> r9 = r10.segments
            java.lang.Object r8 = r9.get(r8)
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment r8 = (com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Segment) r8
            long r3 = r8.relativeStartTimeUs
            long r5 = r8.durationUs
            long r3 = r3 + r5
            int r9 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r9 >= 0) goto L9f
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Part> r8 = r8.parts
            goto La1
        L9f:
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Part> r8 = r10.trailingParts
        La1:
            int r9 = r8.size()
            if (r2 >= r9) goto Lc9
            java.lang.Object r9 = r8.get(r2)
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Part r9 = (com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Part) r9
            long r3 = r9.relativeStartTimeUs
            long r5 = r9.durationUs
            long r3 = r3 + r5
            int r0 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r0 >= 0) goto Lc6
            boolean r9 = r9.isIndependent
            if (r9 == 0) goto Lc9
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Part> r9 = r10.trailingParts
            if (r8 != r9) goto Lc1
            r8 = 1
            goto Lc3
        Lc1:
            r8 = 0
        Lc3:
            long r11 = r11 + r8
            r1 = r2
            goto Lc9
        Lc6:
            int r2 = r2 + 1
            goto La1
        Lc9:
            android.util.Pair r8 = new android.util.Pair
            java.lang.Long r9 = java.lang.Long.valueOf(r11)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            r8.<init>(r9, r10)
            return r8
    }

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.source.hls.HlsChunkSource.SegmentBaseHolder getNextSegmentHolder(com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r7, long r8, int r10) {
            long r0 = r7.mediaSequence
            long r0 = r8 - r0
            int r1 = (int) r0
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment> r0 = r7.segments
            int r0 = r0.size()
            r2 = 0
            r3 = 0
            r4 = -1
            if (r1 != r0) goto L2a
            if (r10 == r4) goto L13
            goto L14
        L13:
            r10 = 0
        L14:
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Part> r0 = r7.trailingParts
            int r0 = r0.size()
            if (r10 >= r0) goto L29
            com.google.android.exoplayer2.source.hls.HlsChunkSource$SegmentBaseHolder r2 = new com.google.android.exoplayer2.source.hls.HlsChunkSource$SegmentBaseHolder
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Part> r7 = r7.trailingParts
            java.lang.Object r7 = r7.get(r10)
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$SegmentBase r7 = (com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.SegmentBase) r7
            r2.<init>(r7, r8, r10)
        L29:
            return r2
        L2a:
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment> r0 = r7.segments
            java.lang.Object r0 = r0.get(r1)
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment r0 = (com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Segment) r0
            if (r10 != r4) goto L3a
            com.google.android.exoplayer2.source.hls.HlsChunkSource$SegmentBaseHolder r7 = new com.google.android.exoplayer2.source.hls.HlsChunkSource$SegmentBaseHolder
            r7.<init>(r0, r8, r4)
            return r7
        L3a:
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Part> r5 = r0.parts
            int r5 = r5.size()
            if (r10 >= r5) goto L50
            com.google.android.exoplayer2.source.hls.HlsChunkSource$SegmentBaseHolder r7 = new com.google.android.exoplayer2.source.hls.HlsChunkSource$SegmentBaseHolder
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Part> r0 = r0.parts
            java.lang.Object r0 = r0.get(r10)
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$SegmentBase r0 = (com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.SegmentBase) r0
            r7.<init>(r0, r8, r10)
            return r7
        L50:
            int r1 = r1 + 1
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment> r10 = r7.segments
            int r10 = r10.size()
            r5 = 1
            if (r1 >= r10) goto L6b
            com.google.android.exoplayer2.source.hls.HlsChunkSource$SegmentBaseHolder r10 = new com.google.android.exoplayer2.source.hls.HlsChunkSource$SegmentBaseHolder
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment> r7 = r7.segments
            java.lang.Object r7 = r7.get(r1)
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$SegmentBase r7 = (com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.SegmentBase) r7
            long r8 = r8 + r5
            r10.<init>(r7, r8, r4)
            return r10
        L6b:
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Part> r10 = r7.trailingParts
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L82
            com.google.android.exoplayer2.source.hls.HlsChunkSource$SegmentBaseHolder r10 = new com.google.android.exoplayer2.source.hls.HlsChunkSource$SegmentBaseHolder
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Part> r7 = r7.trailingParts
            java.lang.Object r7 = r7.get(r3)
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$SegmentBase r7 = (com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.SegmentBase) r7
            long r8 = r8 + r5
            r10.<init>(r7, r8, r3)
            return r10
        L82:
            return r2
    }

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.source.chunk.Chunk maybeCreateEncryptionChunkFor(@androidx.annotation.Nullable android.net.Uri r8, int r9) {
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            com.google.android.exoplayer2.source.hls.FullSegmentEncryptionKeyCache r1 = r7.keyCache
            byte[] r1 = r1.remove(r8)
            if (r1 == 0) goto L12
            com.google.android.exoplayer2.source.hls.FullSegmentEncryptionKeyCache r9 = r7.keyCache
            r9.put(r8, r1)
            return r0
        L12:
            com.google.android.exoplayer2.upstream.DataSpec$Builder r0 = new com.google.android.exoplayer2.upstream.DataSpec$Builder
            r0.<init>()
            com.google.android.exoplayer2.upstream.DataSpec$Builder r8 = r0.setUri(r8)
            r0 = 1
            com.google.android.exoplayer2.upstream.DataSpec$Builder r8 = r8.setFlags(r0)
            com.google.android.exoplayer2.upstream.DataSpec r2 = r8.build()
            com.google.android.exoplayer2.source.hls.HlsChunkSource$EncryptionKeyChunk r8 = new com.google.android.exoplayer2.source.hls.HlsChunkSource$EncryptionKeyChunk
            com.google.android.exoplayer2.upstream.DataSource r1 = r7.encryptionDataSource
            com.google.android.exoplayer2.Format[] r0 = r7.playlistFormats
            r3 = r0[r9]
            com.google.android.exoplayer2.trackselection.ExoTrackSelection r9 = r7.trackSelection
            int r4 = r9.getSelectionReason()
            com.google.android.exoplayer2.trackselection.ExoTrackSelection r9 = r7.trackSelection
            java.lang.Object r5 = r9.getSelectionData()
            byte[] r6 = r7.scratchSpace
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r8
    }

    private long resolveTimeToLiveEdgeUs(long r6) {
            r5 = this;
            long r0 = r5.liveEdgeInPeriodTimeUs
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Ld
            r4 = 1
            goto Le
        Ld:
            r4 = 0
        Le:
            if (r4 == 0) goto L12
            long r2 = r0 - r6
        L12:
            return r2
    }

    private void updateLiveEdgeTimeUs(com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r5) {
            r4 = this;
            boolean r0 = r5.hasEndTag
            if (r0 == 0) goto La
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L15
        La:
            long r0 = r5.getEndTimeUs()
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r5 = r4.playlistTracker
            long r2 = r5.getInitialStartTimeUs()
            long r0 = r0 - r2
        L15:
            r4.liveEdgeInPeriodTimeUs = r0
            return
    }

    public com.google.android.exoplayer2.source.chunk.MediaChunkIterator[] createMediaChunkIterators(@androidx.annotation.Nullable com.google.android.exoplayer2.source.hls.HlsMediaChunk r21, long r22) {
            r20 = this;
            r8 = r20
            r9 = r21
            r10 = -1
            if (r9 != 0) goto L9
            r11 = -1
            goto L12
        L9:
            com.google.android.exoplayer2.source.TrackGroup r0 = r8.trackGroup
            com.google.android.exoplayer2.Format r1 = r9.trackFormat
            int r0 = r0.indexOf(r1)
            r11 = r0
        L12:
            com.google.android.exoplayer2.trackselection.ExoTrackSelection r0 = r8.trackSelection
            int r12 = r0.length()
            com.google.android.exoplayer2.source.chunk.MediaChunkIterator[] r13 = new com.google.android.exoplayer2.source.chunk.MediaChunkIterator[r12]
            r14 = 0
            r15 = 0
        L1c:
            if (r15 >= r12) goto Lfa
            com.google.android.exoplayer2.trackselection.ExoTrackSelection r0 = r8.trackSelection
            int r0 = r0.getIndexInTrackGroup(r15)
            android.net.Uri[] r1 = r8.playlistUrls
            r1 = r1[r0]
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r2 = r8.playlistTracker
            boolean r2 = r2.isSnapshotValid(r1)
            if (r2 != 0) goto L36
            com.google.android.exoplayer2.source.chunk.MediaChunkIterator r0 = com.google.android.exoplayer2.source.chunk.MediaChunkIterator.EMPTY
            r13[r15] = r0
            goto Lf5
        L36:
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r2 = r8.playlistTracker
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r6 = r2.getPlaylistSnapshot(r1, r14)
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r6)
            long r1 = r6.startTimeUs
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r3 = r8.playlistTracker
            long r3 = r3.getInitialStartTimeUs()
            long r4 = r1 - r3
            if (r0 == r11) goto L4e
            r0 = 1
            r2 = 1
            goto L4f
        L4e:
            r2 = 0
        L4f:
            r0 = r20
            r1 = r21
            r3 = r6
            r16 = r4
            r14 = r6
            r6 = r22
            android.util.Pair r0 = r0.getNextMediaSequenceAndPartIndex(r1, r2, r3, r4, r6)
            java.lang.Object r1 = r0.first
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            java.lang.Object r0 = r0.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            com.google.android.exoplayer2.source.hls.HlsChunkSource$HlsMediaPlaylistSegmentIterator r3 = new com.google.android.exoplayer2.source.hls.HlsChunkSource$HlsMediaPlaylistSegmentIterator
            java.lang.String r4 = r14.baseUri
            long r5 = r14.mediaSequence
            long r1 = r1 - r5
            int r2 = (int) r1
            if (r2 < 0) goto Lea
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment> r1 = r14.segments
            int r1 = r1.size()
            if (r1 >= r2) goto L80
            goto Lea
        L80:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment> r5 = r14.segments
            int r5 = r5.size()
            if (r2 >= r5) goto Lc2
            if (r0 == r10) goto Lb4
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment> r5 = r14.segments
            java.lang.Object r5 = r5.get(r2)
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment r5 = (com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Segment) r5
            if (r0 != 0) goto L9d
            r1.add(r5)
            goto Lb2
        L9d:
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Part> r6 = r5.parts
            int r6 = r6.size()
            if (r0 >= r6) goto Lb2
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Part> r5 = r5.parts
            int r6 = r5.size()
            java.util.List r0 = r5.subList(r0, r6)
            r1.addAll(r0)
        Lb2:
            int r2 = r2 + 1
        Lb4:
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment> r0 = r14.segments
            int r5 = r0.size()
            java.util.List r0 = r0.subList(r2, r5)
            r1.addAll(r0)
            r0 = 0
        Lc2:
            long r5 = r14.partTargetDurationUs
            r18 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r2 == 0) goto Le5
            if (r0 != r10) goto Ld0
            r0 = 0
        Ld0:
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Part> r2 = r14.trailingParts
            int r2 = r2.size()
            if (r0 >= r2) goto Le5
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Part> r2 = r14.trailingParts
            int r5 = r2.size()
            java.util.List r0 = r2.subList(r0, r5)
            r1.addAll(r0)
        Le5:
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)
            goto Lee
        Lea:
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()
        Lee:
            r1 = r16
            r3.<init>(r4, r1, r0)
            r13[r15] = r3
        Lf5:
            int r15 = r15 + 1
            r14 = 0
            goto L1c
        Lfa:
            return r13
    }

    public long getAdjustedSeekPositionUs(long r12, com.google.android.exoplayer2.SeekParameters r14) {
            r11 = this;
            com.google.android.exoplayer2.trackselection.ExoTrackSelection r0 = r11.trackSelection
            int r0 = r0.getSelectedIndex()
            android.net.Uri[] r1 = r11.playlistUrls
            int r2 = r1.length
            r3 = 1
            if (r0 >= r2) goto L1e
            r2 = -1
            if (r0 == r2) goto L1e
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r0 = r11.playlistTracker
            com.google.android.exoplayer2.trackselection.ExoTrackSelection r2 = r11.trackSelection
            int r2 = r2.getSelectedIndexInTrackGroup()
            r1 = r1[r2]
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r0 = r0.getPlaylistSnapshot(r1, r3)
            goto L1f
        L1e:
            r0 = 0
        L1f:
            if (r0 == 0) goto L6a
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment> r1 = r0.segments
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L6a
            boolean r1 = r0.hasIndependentSegments
            if (r1 != 0) goto L2e
            goto L6a
        L2e:
            long r1 = r0.startTimeUs
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r4 = r11.playlistTracker
            long r4 = r4.getInitialStartTimeUs()
            long r1 = r1 - r4
            long r5 = r12 - r1
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment> r12 = r0.segments
            java.lang.Long r13 = java.lang.Long.valueOf(r5)
            int r12 = com.google.android.exoplayer2.util.Util.binarySearchFloor(r12, r13, r3, r3)
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment> r13 = r0.segments
            java.lang.Object r13 = r13.get(r12)
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment r13 = (com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Segment) r13
            long r7 = r13.relativeStartTimeUs
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment> r13 = r0.segments
            int r13 = r13.size()
            int r13 = r13 - r3
            if (r12 == r13) goto L63
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment> r13 = r0.segments
            int r12 = r12 + r3
            java.lang.Object r12 = r13.get(r12)
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment r12 = (com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Segment) r12
            long r12 = r12.relativeStartTimeUs
            r9 = r12
            goto L64
        L63:
            r9 = r7
        L64:
            r4 = r14
            long r12 = r4.resolveSeekPositionUs(r5, r7, r9)
            long r12 = r12 + r1
        L6a:
            return r12
    }

    public int getChunkPublicationState(com.google.android.exoplayer2.source.hls.HlsMediaChunk r9) {
            r8 = this;
            int r0 = r9.partIndex
            r1 = 1
            r2 = -1
            if (r0 != r2) goto L7
            return r1
        L7:
            android.net.Uri[] r0 = r8.playlistUrls
            com.google.android.exoplayer2.source.TrackGroup r2 = r8.trackGroup
            com.google.android.exoplayer2.Format r3 = r9.trackFormat
            int r2 = r2.indexOf(r3)
            r0 = r0[r2]
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r2 = r8.playlistTracker
            r3 = 0
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r0 = r2.getPlaylistSnapshot(r0, r3)
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r0 = (com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist) r0
            long r4 = r9.chunkIndex
            long r6 = r0.mediaSequence
            long r4 = r4 - r6
            int r2 = (int) r4
            if (r2 >= 0) goto L29
            return r1
        L29:
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment> r4 = r0.segments
            int r4 = r4.size()
            if (r2 >= r4) goto L3c
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment> r4 = r0.segments
            java.lang.Object r2 = r4.get(r2)
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment r2 = (com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Segment) r2
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Part> r2 = r2.parts
            goto L3e
        L3c:
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Part> r2 = r0.trailingParts
        L3e:
            int r4 = r9.partIndex
            int r5 = r2.size()
            r6 = 2
            if (r4 < r5) goto L48
            return r6
        L48:
            int r4 = r9.partIndex
            java.lang.Object r2 = r2.get(r4)
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Part r2 = (com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Part) r2
            boolean r4 = r2.isPreload
            if (r4 == 0) goto L55
            return r3
        L55:
            java.lang.String r0 = r0.baseUri
            java.lang.String r2 = r2.url
            java.lang.String r0 = com.google.android.exoplayer2.util.UriUtil.resolve(r0, r2)
            android.net.Uri r0 = android.net.Uri.parse(r0)
            com.google.android.exoplayer2.upstream.DataSpec r9 = r9.dataSpec
            android.net.Uri r9 = r9.uri
            boolean r9 = com.google.android.exoplayer2.util.Util.areEqual(r0, r9)
            if (r9 == 0) goto L6c
            goto L6d
        L6c:
            r1 = 2
        L6d:
            return r1
    }

    public void getNextChunk(long r32, long r34, java.util.List<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r36, boolean r37, com.google.android.exoplayer2.source.hls.HlsChunkSource.HlsChunkHolder r38) {
            r31 = this;
            r8 = r31
            r9 = r34
            r11 = r38
            boolean r0 = r36.isEmpty()
            if (r0 == 0) goto Le
            r15 = 0
            goto L15
        Le:
            java.lang.Object r0 = com.google.common.collect.Iterables.getLast(r36)
            com.google.android.exoplayer2.source.hls.HlsMediaChunk r0 = (com.google.android.exoplayer2.source.hls.HlsMediaChunk) r0
            r15 = r0
        L15:
            r13 = -1
            if (r15 != 0) goto L1a
            r14 = -1
            goto L23
        L1a:
            com.google.android.exoplayer2.source.TrackGroup r0 = r8.trackGroup
            com.google.android.exoplayer2.Format r1 = r15.trackFormat
            int r0 = r0.indexOf(r1)
            r14 = r0
        L23:
            long r0 = r9 - r32
            long r2 = r31.resolveTimeToLiveEdgeUs(r32)
            if (r15 == 0) goto L48
            boolean r4 = r8.independentSegments
            if (r4 != 0) goto L48
            long r4 = r15.getDurationUs()
            long r0 = r0 - r4
            r6 = 0
            long r0 = java.lang.Math.max(r6, r0)
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r18 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r18 == 0) goto L48
            long r2 = r2 - r4
            long r2 = java.lang.Math.max(r6, r2)
        L48:
            r19 = r0
            r21 = r2
            com.google.android.exoplayer2.source.chunk.MediaChunkIterator[] r24 = r8.createMediaChunkIterators(r15, r9)
            com.google.android.exoplayer2.trackselection.ExoTrackSelection r0 = r8.trackSelection
            r16 = r0
            r17 = r32
            r23 = r36
            r16.updateSelectedTrack(r17, r19, r21, r23, r24)
            com.google.android.exoplayer2.trackselection.ExoTrackSelection r0 = r8.trackSelection
            int r6 = r0.getSelectedIndexInTrackGroup()
            r7 = 0
            r4 = 1
            if (r14 == r6) goto L68
            r16 = 1
            goto L6a
        L68:
            r16 = 0
        L6a:
            android.net.Uri[] r0 = r8.playlistUrls
            r5 = r0[r6]
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r0 = r8.playlistTracker
            boolean r0 = r0.isSnapshotValid(r5)
            if (r0 != 0) goto L86
            r11.playlistUrl = r5
            boolean r0 = r8.seenExpectedPlaylistError
            android.net.Uri r1 = r8.expectedPlaylistUrl
            boolean r1 = r5.equals(r1)
            r0 = r0 & r1
            r8.seenExpectedPlaylistError = r0
            r8.expectedPlaylistUrl = r5
            return
        L86:
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r0 = r8.playlistTracker
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r3 = r0.getPlaylistSnapshot(r5, r4)
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
            boolean r0 = r3.hasIndependentSegments
            r8.independentSegments = r0
            r8.updateLiveEdgeTimeUs(r3)
            long r0 = r3.startTimeUs
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r2 = r8.playlistTracker
            long r17 = r2.getInitialStartTimeUs()
            long r17 = r0 - r17
            r0 = r31
            r1 = r15
            r2 = r16
            r32 = r3
            r19 = r5
            r12 = 1
            r4 = r17
            r21 = r6
            r6 = r34
            android.util.Pair r0 = r0.getNextMediaSequenceAndPartIndex(r1, r2, r3, r4, r6)
            java.lang.Object r1 = r0.first
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            java.lang.Object r0 = r0.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            long r4 = r3.mediaSequence
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 >= 0) goto L10c
            if (r15 == 0) goto L10c
            if (r16 == 0) goto L10c
            android.net.Uri[] r0 = r8.playlistUrls
            r6 = r0[r14]
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r0 = r8.playlistTracker
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r7 = r0.getPlaylistSnapshot(r6, r12)
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r7)
            long r0 = r7.startTimeUs
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r2 = r8.playlistTracker
            long r2 = r2.getInitialStartTimeUs()
            long r16 = r0 - r2
            r2 = 0
            r0 = r31
            r1 = r15
            r3 = r7
            r4 = r16
            r18 = r6
            r19 = r7
            r6 = r34
            android.util.Pair r0 = r0.getNextMediaSequenceAndPartIndex(r1, r2, r3, r4, r6)
            java.lang.Object r1 = r0.first
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            java.lang.Object r0 = r0.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r3 = r14
            r5 = r18
            r4 = r19
            goto L113
        L10c:
            r4 = r3
            r16 = r17
            r5 = r19
            r3 = r21
        L113:
            long r6 = r4.mediaSequence
            int r9 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r9 >= 0) goto L121
            com.google.android.exoplayer2.source.BehindLiveWindowException r0 = new com.google.android.exoplayer2.source.BehindLiveWindowException
            r0.<init>()
            r8.fatalError = r0
            return
        L121:
            com.google.android.exoplayer2.source.hls.HlsChunkSource$SegmentBaseHolder r0 = getNextSegmentHolder(r4, r1, r0)
            if (r0 != 0) goto L164
            boolean r0 = r4.hasEndTag
            if (r0 != 0) goto L13b
            r11.playlistUrl = r5
            boolean r0 = r8.seenExpectedPlaylistError
            android.net.Uri r1 = r8.expectedPlaylistUrl
            boolean r1 = r5.equals(r1)
            r0 = r0 & r1
            r8.seenExpectedPlaylistError = r0
            r8.expectedPlaylistUrl = r5
            return
        L13b:
            if (r37 != 0) goto L161
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment> r0 = r4.segments
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L146
            goto L161
        L146:
            com.google.android.exoplayer2.source.hls.HlsChunkSource$SegmentBaseHolder r0 = new com.google.android.exoplayer2.source.hls.HlsChunkSource$SegmentBaseHolder
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment> r1 = r4.segments
            java.lang.Object r1 = com.google.common.collect.Iterables.getLast(r1)
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$SegmentBase r1 = (com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.SegmentBase) r1
            long r6 = r4.mediaSequence
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment> r2 = r4.segments
            int r2 = r2.size()
            long r9 = (long) r2
            long r6 = r6 + r9
            r9 = 1
            long r6 = r6 - r9
            r0.<init>(r1, r6, r13)
            goto L164
        L161:
            r11.endOfStream = r12
            return
        L164:
            r1 = 0
            r8.seenExpectedPlaylistError = r1
            r1 = 0
            r8.expectedPlaylistUrl = r1
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$SegmentBase r1 = r0.segmentBase
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment r1 = r1.initializationSegment
            android.net.Uri r1 = getFullEncryptionKeyUri(r4, r1)
            com.google.android.exoplayer2.source.chunk.Chunk r2 = r8.maybeCreateEncryptionChunkFor(r1, r3)
            r11.chunk = r2
            if (r2 == 0) goto L17b
            return
        L17b:
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$SegmentBase r2 = r0.segmentBase
            android.net.Uri r2 = getFullEncryptionKeyUri(r4, r2)
            com.google.android.exoplayer2.source.chunk.Chunk r6 = r8.maybeCreateEncryptionChunkFor(r2, r3)
            r11.chunk = r6
            if (r6 == 0) goto L18a
            return
        L18a:
            r32 = r15
            r33 = r5
            r34 = r4
            r35 = r0
            r36 = r16
            boolean r29 = com.google.android.exoplayer2.source.hls.HlsMediaChunk.shouldSpliceIn(r32, r33, r34, r35, r36)
            if (r29 == 0) goto L19f
            boolean r6 = r0.isPreload
            if (r6 == 0) goto L19f
            return
        L19f:
            com.google.android.exoplayer2.source.hls.HlsExtractorFactory r13 = r8.extractorFactory
            com.google.android.exoplayer2.upstream.DataSource r14 = r8.mediaDataSource
            com.google.android.exoplayer2.Format[] r6 = r8.playlistFormats
            r3 = r6[r3]
            r12 = r15
            r15 = r3
            java.util.List<com.google.android.exoplayer2.Format> r3 = r8.muxedCaptionFormats
            r21 = r3
            com.google.android.exoplayer2.trackselection.ExoTrackSelection r3 = r8.trackSelection
            int r22 = r3.getSelectionReason()
            com.google.android.exoplayer2.trackselection.ExoTrackSelection r3 = r8.trackSelection
            java.lang.Object r23 = r3.getSelectionData()
            boolean r3 = r8.isTimestampMaster
            r24 = r3
            com.google.android.exoplayer2.source.hls.TimestampAdjusterProvider r3 = r8.timestampAdjusterProvider
            r25 = r3
            com.google.android.exoplayer2.source.hls.FullSegmentEncryptionKeyCache r3 = r8.keyCache
            byte[] r27 = r3.get(r2)
            com.google.android.exoplayer2.source.hls.FullSegmentEncryptionKeyCache r2 = r8.keyCache
            byte[] r28 = r2.get(r1)
            com.google.android.exoplayer2.analytics.PlayerId r1 = r8.playerId
            r30 = r1
            r18 = r4
            r19 = r0
            r20 = r5
            r26 = r12
            com.google.android.exoplayer2.source.hls.HlsMediaChunk r0 = com.google.android.exoplayer2.source.hls.HlsMediaChunk.createInstance(r13, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r11.chunk = r0
            return
    }

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

    public com.google.android.exoplayer2.source.TrackGroup getTrackGroup() {
            r1 = this;
            com.google.android.exoplayer2.source.TrackGroup r0 = r1.trackGroup
            return r0
    }

    public com.google.android.exoplayer2.trackselection.ExoTrackSelection getTrackSelection() {
            r1 = this;
            com.google.android.exoplayer2.trackselection.ExoTrackSelection r0 = r1.trackSelection
            return r0
    }

    public boolean maybeExcludeTrack(com.google.android.exoplayer2.source.chunk.Chunk r3, long r4) {
            r2 = this;
            com.google.android.exoplayer2.trackselection.ExoTrackSelection r0 = r2.trackSelection
            com.google.android.exoplayer2.source.TrackGroup r1 = r2.trackGroup
            com.google.android.exoplayer2.Format r3 = r3.trackFormat
            int r3 = r1.indexOf(r3)
            int r3 = r0.indexOf(r3)
            boolean r3 = r0.blacklist(r3, r4)
            return r3
    }

    public void maybeThrowError() throws java.io.IOException {
            r2 = this;
            java.io.IOException r0 = r2.fatalError
            if (r0 != 0) goto L12
            android.net.Uri r0 = r2.expectedPlaylistUrl
            if (r0 == 0) goto L11
            boolean r1 = r2.seenExpectedPlaylistError
            if (r1 == 0) goto L11
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r1 = r2.playlistTracker
            r1.maybeThrowPlaylistRefreshError(r0)
        L11:
            return
        L12:
            throw r0
    }

    public boolean obtainsChunksForPlaylist(android.net.Uri r2) {
            r1 = this;
            android.net.Uri[] r0 = r1.playlistUrls
            boolean r2 = com.google.android.exoplayer2.util.Util.contains(r0, r2)
            return r2
    }

    public void onChunkLoadCompleted(com.google.android.exoplayer2.source.chunk.Chunk r3) {
            r2 = this;
            boolean r0 = r3 instanceof com.google.android.exoplayer2.source.hls.HlsChunkSource.EncryptionKeyChunk
            if (r0 == 0) goto L1f
            com.google.android.exoplayer2.source.hls.HlsChunkSource$EncryptionKeyChunk r3 = (com.google.android.exoplayer2.source.hls.HlsChunkSource.EncryptionKeyChunk) r3
            byte[] r0 = r3.getDataHolder()
            r2.scratchSpace = r0
            com.google.android.exoplayer2.source.hls.FullSegmentEncryptionKeyCache r0 = r2.keyCache
            com.google.android.exoplayer2.upstream.DataSpec r1 = r3.dataSpec
            android.net.Uri r1 = r1.uri
            byte[] r3 = r3.getResult()
            java.lang.Object r3 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
            byte[] r3 = (byte[]) r3
            r0.put(r1, r3)
        L1f:
            return
    }

    public boolean onPlaylistError(android.net.Uri r7, long r8) {
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            android.net.Uri[] r2 = r6.playlistUrls
            int r3 = r2.length
            r4 = -1
            if (r1 >= r3) goto L14
            r2 = r2[r1]
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L11
            goto L15
        L11:
            int r1 = r1 + 1
            goto L2
        L14:
            r1 = -1
        L15:
            r2 = 1
            if (r1 != r4) goto L19
            return r2
        L19:
            com.google.android.exoplayer2.trackselection.ExoTrackSelection r3 = r6.trackSelection
            int r1 = r3.indexOf(r1)
            if (r1 != r4) goto L22
            return r2
        L22:
            boolean r3 = r6.seenExpectedPlaylistError
            android.net.Uri r4 = r6.expectedPlaylistUrl
            boolean r4 = r7.equals(r4)
            r3 = r3 | r4
            r6.seenExpectedPlaylistError = r3
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 == 0) goto L46
            com.google.android.exoplayer2.trackselection.ExoTrackSelection r3 = r6.trackSelection
            boolean r1 = r3.blacklist(r1, r8)
            if (r1 == 0) goto L47
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r1 = r6.playlistTracker
            boolean r7 = r1.excludeMediaPlaylist(r7, r8)
            if (r7 == 0) goto L47
        L46:
            r0 = 1
        L47:
            return r0
    }

    public void reset() {
            r1 = this;
            r0 = 0
            r1.fatalError = r0
            return
    }

    public void setIsTimestampMaster(boolean r1) {
            r0 = this;
            r0.isTimestampMaster = r1
            return
    }

    public void setTrackSelection(com.google.android.exoplayer2.trackselection.ExoTrackSelection r1) {
            r0 = this;
            r0.trackSelection = r1
            return
    }

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
}
