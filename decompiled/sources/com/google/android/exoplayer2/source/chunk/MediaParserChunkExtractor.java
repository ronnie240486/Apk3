package com.google.android.exoplayer2.source.chunk;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RequiresApi(30)
public final class MediaParserChunkExtractor implements com.google.android.exoplayer2.source.chunk.ChunkExtractor {
    public static final com.google.android.exoplayer2.source.chunk.ChunkExtractor.Factory FACTORY = null;
    private static final java.lang.String TAG = "MediaPrsrChunkExtractor";
    private final com.google.android.exoplayer2.extractor.DummyTrackOutput dummyTrackOutput;
    private final com.google.android.exoplayer2.source.mediaparser.InputReaderAdapterV30 inputReaderAdapter;
    private final android.media.MediaParser mediaParser;
    private final com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30 outputConsumerAdapter;
    private long pendingSeekUs;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.Format[] sampleFormats;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.source.chunk.ChunkExtractor.TrackOutputProvider trackOutputProvider;
    private final com.google.android.exoplayer2.source.chunk.MediaParserChunkExtractor.TrackOutputProviderAdapter trackOutputProviderAdapter;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.chunk.MediaParserChunkExtractor$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public class TrackOutputProviderAdapter implements com.google.android.exoplayer2.extractor.ExtractorOutput {
        public final /* synthetic */ com.google.android.exoplayer2.source.chunk.MediaParserChunkExtractor this$0;

        private TrackOutputProviderAdapter(com.google.android.exoplayer2.source.chunk.MediaParserChunkExtractor r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ TrackOutputProviderAdapter(com.google.android.exoplayer2.source.chunk.MediaParserChunkExtractor r1, com.google.android.exoplayer2.source.chunk.MediaParserChunkExtractor.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
        public void endTracks() {
                r2 = this;
                com.google.android.exoplayer2.source.chunk.MediaParserChunkExtractor r0 = r2.this$0
                com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30 r1 = com.google.android.exoplayer2.source.chunk.MediaParserChunkExtractor.access$400(r0)
                com.google.android.exoplayer2.Format[] r1 = r1.getSampleFormats()
                com.google.android.exoplayer2.source.chunk.MediaParserChunkExtractor.access$302(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
        public void seekMap(com.google.android.exoplayer2.extractor.SeekMap r1) {
                r0 = this;
                return
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
        public com.google.android.exoplayer2.extractor.TrackOutput track(int r2, int r3) {
                r1 = this;
                com.google.android.exoplayer2.source.chunk.MediaParserChunkExtractor r0 = r1.this$0
                com.google.android.exoplayer2.source.chunk.ChunkExtractor$TrackOutputProvider r0 = com.google.android.exoplayer2.source.chunk.MediaParserChunkExtractor.access$100(r0)
                if (r0 == 0) goto L13
                com.google.android.exoplayer2.source.chunk.MediaParserChunkExtractor r0 = r1.this$0
                com.google.android.exoplayer2.source.chunk.ChunkExtractor$TrackOutputProvider r0 = com.google.android.exoplayer2.source.chunk.MediaParserChunkExtractor.access$100(r0)
                com.google.android.exoplayer2.extractor.TrackOutput r2 = r0.track(r2, r3)
                goto L19
            L13:
                com.google.android.exoplayer2.source.chunk.MediaParserChunkExtractor r2 = r1.this$0
                com.google.android.exoplayer2.extractor.DummyTrackOutput r2 = com.google.android.exoplayer2.source.chunk.MediaParserChunkExtractor.access$200(r2)
            L19:
                return r2
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$_c4VaTFCQci-JxUVp-TGUWjemEg, reason: not valid java name */
    public static /* synthetic */ com.google.android.exoplayer2.source.chunk.ChunkExtractor m256$r8$lambda$_c4VaTFCQciJxUVpTGUWjemEg(int r0, com.google.android.exoplayer2.Format r1, boolean r2, java.util.List r3, com.google.android.exoplayer2.extractor.TrackOutput r4, com.google.android.exoplayer2.analytics.PlayerId r5) {
            com.google.android.exoplayer2.source.chunk.ChunkExtractor r0 = lambda$static$0(r0, r1, r2, r3, r4, r5)
            return r0
    }

    static {
            io.realm.Realm$$ExternalSyntheticLambda0 r0 = io.realm.Realm$$ExternalSyntheticLambda0.INSTANCE$19
            com.google.android.exoplayer2.source.chunk.MediaParserChunkExtractor.FACTORY = r0
            return
    }

    @android.annotation.SuppressLint({"WrongConstant"})
    public MediaParserChunkExtractor(int r3, com.google.android.exoplayer2.Format r4, java.util.List<com.google.android.exoplayer2.Format> r5, com.google.android.exoplayer2.analytics.PlayerId r6) {
            r2 = this;
            r2.<init>()
            com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30 r0 = new com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30
            r1 = 1
            r0.<init>(r4, r3, r1)
            r2.outputConsumerAdapter = r0
            com.google.android.exoplayer2.source.mediaparser.InputReaderAdapterV30 r3 = new com.google.android.exoplayer2.source.mediaparser.InputReaderAdapterV30
            r3.<init>()
            r2.inputReaderAdapter = r3
            java.lang.String r3 = r4.containerMimeType
            java.lang.Object r3 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = com.google.android.exoplayer2.util.MimeTypes.isMatroska(r3)
            if (r3 == 0) goto L23
            java.lang.String r3 = "android.media.mediaparser.MatroskaParser"
            goto L25
        L23:
            java.lang.String r3 = "android.media.mediaparser.FragmentedMp4Parser"
        L25:
            r0.setSelectedParserName(r3)
            android.media.MediaParser r3 = android.media.MediaParser.createByName(r3, r0)
            r2.mediaParser = r3
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            java.lang.String r0 = "android.media.mediaparser.matroska.disableCuesSeeking"
            r3.setParameter(r0, r4)
            java.lang.String r0 = "android.media.mediaparser.inBandCryptoInfo"
            r3.setParameter(r0, r4)
            java.lang.String r0 = "android.media.mediaparser.includeSupplementalData"
            r3.setParameter(r0, r4)
            java.lang.String r0 = "android.media.mediaparser.eagerlyExposeTrackType"
            r3.setParameter(r0, r4)
            java.lang.String r0 = "android.media.mediaparser.exposeDummySeekMap"
            r3.setParameter(r0, r4)
            java.lang.String r0 = "android.media.mediaParser.exposeChunkIndexAsMediaFormat"
            r3.setParameter(r0, r4)
            java.lang.String r0 = "android.media.mediaParser.overrideInBandCaptionDeclarations"
            r3.setParameter(r0, r4)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = 0
        L59:
            int r0 = r5.size()
            if (r4 >= r0) goto L6f
            java.lang.Object r0 = r5.get(r4)
            com.google.android.exoplayer2.Format r0 = (com.google.android.exoplayer2.Format) r0
            android.media.MediaFormat r0 = com.google.android.exoplayer2.source.mediaparser.MediaParserUtil.toCaptionsMediaFormat(r0)
            r3.add(r0)
            int r4 = r4 + 1
            goto L59
        L6f:
            android.media.MediaParser r4 = r2.mediaParser
            java.lang.String r0 = "android.media.mediaParser.exposeCaptionFormats"
            r4.setParameter(r0, r3)
            int r3 = com.google.android.exoplayer2.util.Util.SDK_INT
            r4 = 31
            if (r3 < r4) goto L81
            android.media.MediaParser r3 = r2.mediaParser
            com.google.android.exoplayer2.source.mediaparser.MediaParserUtil.setLogSessionIdOnMediaParser(r3, r6)
        L81:
            com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30 r3 = r2.outputConsumerAdapter
            r3.setMuxedCaptionFormats(r5)
            com.google.android.exoplayer2.source.chunk.MediaParserChunkExtractor$TrackOutputProviderAdapter r3 = new com.google.android.exoplayer2.source.chunk.MediaParserChunkExtractor$TrackOutputProviderAdapter
            r4 = 0
            r3.<init>(r2, r4)
            r2.trackOutputProviderAdapter = r3
            com.google.android.exoplayer2.extractor.DummyTrackOutput r3 = new com.google.android.exoplayer2.extractor.DummyTrackOutput
            r3.<init>()
            r2.dummyTrackOutput = r3
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.pendingSeekUs = r3
            return
    }

    public static /* synthetic */ com.google.android.exoplayer2.source.chunk.ChunkExtractor.TrackOutputProvider access$100(com.google.android.exoplayer2.source.chunk.MediaParserChunkExtractor r0) {
            com.google.android.exoplayer2.source.chunk.ChunkExtractor$TrackOutputProvider r0 = r0.trackOutputProvider
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.extractor.DummyTrackOutput access$200(com.google.android.exoplayer2.source.chunk.MediaParserChunkExtractor r0) {
            com.google.android.exoplayer2.extractor.DummyTrackOutput r0 = r0.dummyTrackOutput
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.Format[] access$302(com.google.android.exoplayer2.source.chunk.MediaParserChunkExtractor r0, com.google.android.exoplayer2.Format[] r1) {
            r0.sampleFormats = r1
            return r1
    }

    public static /* synthetic */ com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30 access$400(com.google.android.exoplayer2.source.chunk.MediaParserChunkExtractor r0) {
            com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30 r0 = r0.outputConsumerAdapter
            return r0
    }

    private static /* synthetic */ com.google.android.exoplayer2.source.chunk.ChunkExtractor lambda$static$0(int r0, com.google.android.exoplayer2.Format r1, boolean r2, java.util.List r3, com.google.android.exoplayer2.extractor.TrackOutput r4, com.google.android.exoplayer2.analytics.PlayerId r5) {
            java.lang.String r2 = r1.containerMimeType
            boolean r2 = com.google.android.exoplayer2.util.MimeTypes.isText(r2)
            if (r2 != 0) goto Le
            com.google.android.exoplayer2.source.chunk.MediaParserChunkExtractor r2 = new com.google.android.exoplayer2.source.chunk.MediaParserChunkExtractor
            r2.<init>(r0, r1, r3, r5)
            return r2
        Le:
            java.lang.String r0 = "MediaPrsrChunkExtractor"
            java.lang.String r1 = "Ignoring an unsupported text track."
            com.google.android.exoplayer2.util.Log.w(r0, r1)
            r0 = 0
            return r0
    }

    private void maybeExecutePendingSeek() {
            r6 = this;
            com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30 r0 = r6.outputConsumerAdapter
            android.media.MediaParser$SeekMap r0 = r0.getDummySeekMap()
            long r1 = r6.pendingSeekUs
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L22
            if (r0 == 0) goto L22
            android.media.MediaParser r5 = r6.mediaParser
            android.util.Pair r0 = r0.getSeekPoints(r1)
            java.lang.Object r0 = r0.first
            android.media.MediaParser$SeekPoint r0 = (android.media.MediaParser.SeekPoint) r0
            r5.seek(r0)
            r6.pendingSeekUs = r3
        L22:
            return
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.extractor.ChunkIndex getChunkIndex() {
            r1 = this;
            com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30 r0 = r1.outputConsumerAdapter
            com.google.android.exoplayer2.extractor.ChunkIndex r0 = r0.getChunkIndex()
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
    public void init(@androidx.annotation.Nullable com.google.android.exoplayer2.source.chunk.ChunkExtractor.TrackOutputProvider r1, long r2, long r4) {
            r0 = this;
            r0.trackOutputProvider = r1
            com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30 r1 = r0.outputConsumerAdapter
            r1.setSampleTimestampUpperLimitFilterUs(r4)
            com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30 r1 = r0.outputConsumerAdapter
            com.google.android.exoplayer2.source.chunk.MediaParserChunkExtractor$TrackOutputProviderAdapter r4 = r0.trackOutputProviderAdapter
            r1.setExtractorOutput(r4)
            r0.pendingSeekUs = r2
            return
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    public boolean read(com.google.android.exoplayer2.extractor.ExtractorInput r4) throws java.io.IOException {
            r3 = this;
            r3.maybeExecutePendingSeek()
            com.google.android.exoplayer2.source.mediaparser.InputReaderAdapterV30 r0 = r3.inputReaderAdapter
            long r1 = r4.getLength()
            r0.setDataReader(r4, r1)
            android.media.MediaParser r4 = r3.mediaParser
            com.google.android.exoplayer2.source.mediaparser.InputReaderAdapterV30 r0 = r3.inputReaderAdapter
            boolean r4 = r4.advance(r0)
            return r4
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    public void release() {
            r1 = this;
            android.media.MediaParser r0 = r1.mediaParser
            r0.release()
            return
    }
}
