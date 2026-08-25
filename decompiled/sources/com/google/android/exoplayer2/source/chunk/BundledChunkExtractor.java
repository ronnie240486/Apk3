package com.google.android.exoplayer2.source.chunk;

/* JADX INFO: loaded from: classes2.dex */
public final class BundledChunkExtractor implements com.google.android.exoplayer2.extractor.ExtractorOutput, com.google.android.exoplayer2.source.chunk.ChunkExtractor {
    public static final com.google.android.exoplayer2.source.chunk.ChunkExtractor.Factory FACTORY = null;
    private static final com.google.android.exoplayer2.extractor.PositionHolder POSITION_HOLDER = null;
    private final android.util.SparseArray<com.google.android.exoplayer2.source.chunk.BundledChunkExtractor.BindingTrackOutput> bindingTrackOutputs;
    private long endTimeUs;
    private final com.google.android.exoplayer2.extractor.Extractor extractor;
    private boolean extractorInitialized;
    private final com.google.android.exoplayer2.Format primaryTrackManifestFormat;
    private final int primaryTrackType;
    private com.google.android.exoplayer2.Format[] sampleFormats;
    private com.google.android.exoplayer2.extractor.SeekMap seekMap;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.source.chunk.ChunkExtractor.TrackOutputProvider trackOutputProvider;

    /* JADX INFO: loaded from: classes.dex */
    public static final class BindingTrackOutput implements com.google.android.exoplayer2.extractor.TrackOutput {
        private long endTimeUs;
        private final com.google.android.exoplayer2.extractor.DummyTrackOutput fakeTrackOutput;
        private final int id;

        @androidx.annotation.Nullable
        private final com.google.android.exoplayer2.Format manifestFormat;
        public com.google.android.exoplayer2.Format sampleFormat;
        private com.google.android.exoplayer2.extractor.TrackOutput trackOutput;
        private final int type;

        public BindingTrackOutput(int r1, int r2, @androidx.annotation.Nullable com.google.android.exoplayer2.Format r3) {
                r0 = this;
                r0.<init>()
                r0.id = r1
                r0.type = r2
                r0.manifestFormat = r3
                com.google.android.exoplayer2.extractor.DummyTrackOutput r1 = new com.google.android.exoplayer2.extractor.DummyTrackOutput
                r1.<init>()
                r0.fakeTrackOutput = r1
                return
        }

        public void bind(@androidx.annotation.Nullable com.google.android.exoplayer2.source.chunk.ChunkExtractor.TrackOutputProvider r1, long r2) {
                r0 = this;
                if (r1 != 0) goto L7
                com.google.android.exoplayer2.extractor.DummyTrackOutput r1 = r0.fakeTrackOutput
                r0.trackOutput = r1
                return
            L7:
                r0.endTimeUs = r2
                int r2 = r0.id
                int r3 = r0.type
                com.google.android.exoplayer2.extractor.TrackOutput r1 = r1.track(r2, r3)
                r0.trackOutput = r1
                com.google.android.exoplayer2.Format r2 = r0.sampleFormat
                if (r2 == 0) goto L1a
                r1.format(r2)
            L1a:
                return
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public void format(com.google.android.exoplayer2.Format r2) {
                r1 = this;
                com.google.android.exoplayer2.Format r0 = r1.manifestFormat
                if (r0 == 0) goto L8
                com.google.android.exoplayer2.Format r2 = r2.withManifestFormatInfo(r0)
            L8:
                r1.sampleFormat = r2
                com.google.android.exoplayer2.extractor.TrackOutput r2 = r1.trackOutput
                java.lang.Object r2 = com.google.android.exoplayer2.util.Util.castNonNull(r2)
                com.google.android.exoplayer2.extractor.TrackOutput r2 = (com.google.android.exoplayer2.extractor.TrackOutput) r2
                com.google.android.exoplayer2.Format r0 = r1.sampleFormat
                r2.format(r0)
                return
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public final /* synthetic */ int sampleData(com.google.android.exoplayer2.upstream.DataReader r1, int r2, boolean r3) {
                r0 = this;
                int r1 = com.google.android.exoplayer2.extractor.TrackOutput.CC.$default$sampleData(r0, r1, r2, r3)
                return r1
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public int sampleData(com.google.android.exoplayer2.upstream.DataReader r1, int r2, boolean r3, int r4) throws java.io.IOException {
                r0 = this;
                com.google.android.exoplayer2.extractor.TrackOutput r4 = r0.trackOutput
                java.lang.Object r4 = com.google.android.exoplayer2.util.Util.castNonNull(r4)
                com.google.android.exoplayer2.extractor.TrackOutput r4 = (com.google.android.exoplayer2.extractor.TrackOutput) r4
                int r1 = r4.sampleData(r1, r2, r3)
                return r1
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public final /* synthetic */ void sampleData(com.google.android.exoplayer2.util.ParsableByteArray r1, int r2) {
                r0 = this;
                com.google.android.exoplayer2.extractor.TrackOutput.CC.$default$sampleData(r0, r1, r2)
                return
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public void sampleData(com.google.android.exoplayer2.util.ParsableByteArray r1, int r2, int r3) {
                r0 = this;
                com.google.android.exoplayer2.extractor.TrackOutput r3 = r0.trackOutput
                java.lang.Object r3 = com.google.android.exoplayer2.util.Util.castNonNull(r3)
                com.google.android.exoplayer2.extractor.TrackOutput r3 = (com.google.android.exoplayer2.extractor.TrackOutput) r3
                r3.sampleData(r1, r2)
                return
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public void sampleMetadata(long r9, int r11, int r12, int r13, @androidx.annotation.Nullable com.google.android.exoplayer2.extractor.TrackOutput.CryptoData r14) {
                r8 = this;
                long r0 = r8.endTimeUs
                r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L13
                int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r2 < 0) goto L13
                com.google.android.exoplayer2.extractor.DummyTrackOutput r0 = r8.fakeTrackOutput
                r8.trackOutput = r0
            L13:
                com.google.android.exoplayer2.extractor.TrackOutput r0 = r8.trackOutput
                java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
                r1 = r0
                com.google.android.exoplayer2.extractor.TrackOutput r1 = (com.google.android.exoplayer2.extractor.TrackOutput) r1
                r2 = r9
                r4 = r11
                r5 = r12
                r6 = r13
                r7 = r14
                r1.sampleMetadata(r2, r4, r5, r6, r7)
                return
        }
    }

    public static /* synthetic */ com.google.android.exoplayer2.source.chunk.ChunkExtractor $r8$lambda$qeKZkXK64BVJgl9L2bVpFwQJmfE(int r0, com.google.android.exoplayer2.Format r1, boolean r2, java.util.List r3, com.google.android.exoplayer2.extractor.TrackOutput r4, com.google.android.exoplayer2.analytics.PlayerId r5) {
            com.google.android.exoplayer2.source.chunk.ChunkExtractor r0 = lambda$static$0(r0, r1, r2, r3, r4, r5)
            return r0
    }

    static {
            io.realm.Realm$$ExternalSyntheticLambda0 r0 = io.realm.Realm$$ExternalSyntheticLambda0.INSTANCE$18
            com.google.android.exoplayer2.source.chunk.BundledChunkExtractor.FACTORY = r0
            com.google.android.exoplayer2.extractor.PositionHolder r0 = new com.google.android.exoplayer2.extractor.PositionHolder
            r0.<init>()
            com.google.android.exoplayer2.source.chunk.BundledChunkExtractor.POSITION_HOLDER = r0
            return
    }

    public BundledChunkExtractor(com.google.android.exoplayer2.extractor.Extractor r1, int r2, com.google.android.exoplayer2.Format r3) {
            r0 = this;
            r0.<init>()
            r0.extractor = r1
            r0.primaryTrackType = r2
            r0.primaryTrackManifestFormat = r3
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r0.bindingTrackOutputs = r1
            return
    }

    private static /* synthetic */ com.google.android.exoplayer2.source.chunk.ChunkExtractor lambda$static$0(int r6, com.google.android.exoplayer2.Format r7, boolean r8, java.util.List r9, com.google.android.exoplayer2.extractor.TrackOutput r10, com.google.android.exoplayer2.analytics.PlayerId r11) {
            java.lang.String r11 = r7.containerMimeType
            boolean r0 = com.google.android.exoplayer2.util.MimeTypes.isText(r11)
            if (r0 == 0) goto La
            r6 = 0
            return r6
        La:
            boolean r11 = com.google.android.exoplayer2.util.MimeTypes.isMatroska(r11)
            if (r11 == 0) goto L17
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor r8 = new com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor
            r9 = 1
            r8.<init>(r9)
            goto L28
        L17:
            r11 = 0
            if (r8 == 0) goto L1d
            r11 = 4
            r1 = 4
            goto L1e
        L1d:
            r1 = 0
        L1e:
            com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor r8 = new com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor
            r2 = 0
            r3 = 0
            r0 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
        L28:
            com.google.android.exoplayer2.source.chunk.BundledChunkExtractor r9 = new com.google.android.exoplayer2.source.chunk.BundledChunkExtractor
            r9.<init>(r8, r6, r7)
            return r9
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public void endTracks() {
            r3 = this;
            android.util.SparseArray<com.google.android.exoplayer2.source.chunk.BundledChunkExtractor$BindingTrackOutput> r0 = r3.bindingTrackOutputs
            int r0 = r0.size()
            com.google.android.exoplayer2.Format[] r0 = new com.google.android.exoplayer2.Format[r0]
            r1 = 0
        L9:
            android.util.SparseArray<com.google.android.exoplayer2.source.chunk.BundledChunkExtractor$BindingTrackOutput> r2 = r3.bindingTrackOutputs
            int r2 = r2.size()
            if (r1 >= r2) goto L26
            android.util.SparseArray<com.google.android.exoplayer2.source.chunk.BundledChunkExtractor$BindingTrackOutput> r2 = r3.bindingTrackOutputs
            java.lang.Object r2 = r2.valueAt(r1)
            com.google.android.exoplayer2.source.chunk.BundledChunkExtractor$BindingTrackOutput r2 = (com.google.android.exoplayer2.source.chunk.BundledChunkExtractor.BindingTrackOutput) r2
            com.google.android.exoplayer2.Format r2 = r2.sampleFormat
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r2)
            com.google.android.exoplayer2.Format r2 = (com.google.android.exoplayer2.Format) r2
            r0[r1] = r2
            int r1 = r1 + 1
            goto L9
        L26:
            r3.sampleFormats = r0
            return
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.extractor.ChunkIndex getChunkIndex() {
            r2 = this;
            com.google.android.exoplayer2.extractor.SeekMap r0 = r2.seekMap
            boolean r1 = r0 instanceof com.google.android.exoplayer2.extractor.ChunkIndex
            if (r1 == 0) goto L9
            com.google.android.exoplayer2.extractor.ChunkIndex r0 = (com.google.android.exoplayer2.extractor.ChunkIndex) r0
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.Format[] getSampleFormats() {
            r1 = this;
            com.google.android.exoplayer2.Format[] r0 = r1.sampleFormats
            return r0
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    public void init(@androidx.annotation.Nullable com.google.android.exoplayer2.source.chunk.ChunkExtractor.TrackOutputProvider r7, long r8, long r10) {
            r6 = this;
            r6.trackOutputProvider = r7
            r6.endTimeUs = r10
            boolean r0 = r6.extractorInitialized
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = 0
            if (r0 != 0) goto L21
            com.google.android.exoplayer2.extractor.Extractor r7 = r6.extractor
            r7.init(r6)
            int r7 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r7 == 0) goto L1d
            com.google.android.exoplayer2.extractor.Extractor r7 = r6.extractor
            r7.seek(r3, r8)
        L1d:
            r7 = 1
            r6.extractorInitialized = r7
            goto L42
        L21:
            com.google.android.exoplayer2.extractor.Extractor r0 = r6.extractor
            int r5 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r5 != 0) goto L28
            r8 = r3
        L28:
            r0.seek(r3, r8)
            r8 = 0
        L2c:
            android.util.SparseArray<com.google.android.exoplayer2.source.chunk.BundledChunkExtractor$BindingTrackOutput> r9 = r6.bindingTrackOutputs
            int r9 = r9.size()
            if (r8 >= r9) goto L42
            android.util.SparseArray<com.google.android.exoplayer2.source.chunk.BundledChunkExtractor$BindingTrackOutput> r9 = r6.bindingTrackOutputs
            java.lang.Object r9 = r9.valueAt(r8)
            com.google.android.exoplayer2.source.chunk.BundledChunkExtractor$BindingTrackOutput r9 = (com.google.android.exoplayer2.source.chunk.BundledChunkExtractor.BindingTrackOutput) r9
            r9.bind(r7, r10)
            int r8 = r8 + 1
            goto L2c
        L42:
            return
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    public boolean read(com.google.android.exoplayer2.extractor.ExtractorInput r4) throws java.io.IOException {
            r3 = this;
            com.google.android.exoplayer2.extractor.Extractor r0 = r3.extractor
            com.google.android.exoplayer2.extractor.PositionHolder r1 = com.google.android.exoplayer2.source.chunk.BundledChunkExtractor.POSITION_HOLDER
            int r4 = r0.read(r4, r1)
            r0 = 0
            r1 = 1
            if (r4 == r1) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            com.google.android.exoplayer2.util.Assertions.checkState(r2)
            if (r4 != 0) goto L15
            r0 = 1
        L15:
            return r0
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    public void release() {
            r1 = this;
            com.google.android.exoplayer2.extractor.Extractor r0 = r1.extractor
            r0.release()
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public void seekMap(com.google.android.exoplayer2.extractor.SeekMap r1) {
            r0 = this;
            r0.seekMap = r1
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public com.google.android.exoplayer2.extractor.TrackOutput track(int r4, int r5) {
            r3 = this;
            android.util.SparseArray<com.google.android.exoplayer2.source.chunk.BundledChunkExtractor$BindingTrackOutput> r0 = r3.bindingTrackOutputs
            java.lang.Object r0 = r0.get(r4)
            com.google.android.exoplayer2.source.chunk.BundledChunkExtractor$BindingTrackOutput r0 = (com.google.android.exoplayer2.source.chunk.BundledChunkExtractor.BindingTrackOutput) r0
            if (r0 != 0) goto L2d
            com.google.android.exoplayer2.Format[] r0 = r3.sampleFormats
            if (r0 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            com.google.android.exoplayer2.source.chunk.BundledChunkExtractor$BindingTrackOutput r0 = new com.google.android.exoplayer2.source.chunk.BundledChunkExtractor$BindingTrackOutput
            int r1 = r3.primaryTrackType
            if (r5 != r1) goto L1d
            com.google.android.exoplayer2.Format r1 = r3.primaryTrackManifestFormat
            goto L1e
        L1d:
            r1 = 0
        L1e:
            r0.<init>(r4, r5, r1)
            com.google.android.exoplayer2.source.chunk.ChunkExtractor$TrackOutputProvider r5 = r3.trackOutputProvider
            long r1 = r3.endTimeUs
            r0.bind(r5, r1)
            android.util.SparseArray<com.google.android.exoplayer2.source.chunk.BundledChunkExtractor$BindingTrackOutput> r5 = r3.bindingTrackOutputs
            r5.put(r4, r0)
        L2d:
            return r0
    }
}
