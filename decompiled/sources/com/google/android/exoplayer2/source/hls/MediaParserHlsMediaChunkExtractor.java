package com.google.android.exoplayer2.source.hls;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RequiresApi(30)
public final class MediaParserHlsMediaChunkExtractor implements com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor {
    public static final com.google.android.exoplayer2.source.hls.HlsExtractorFactory FACTORY = null;
    private final com.google.android.exoplayer2.Format format;
    private final com.google.android.exoplayer2.source.mediaparser.InputReaderAdapterV30 inputReaderAdapter;
    private final android.media.MediaParser mediaParser;
    private final com.google.common.collect.ImmutableList<android.media.MediaFormat> muxedCaptionMediaFormats;
    private final com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30 outputConsumerAdapter;
    private final boolean overrideInBandCaptionDeclarations;
    private int pendingSkipBytes;
    private final com.google.android.exoplayer2.analytics.PlayerId playerId;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.MediaParserHlsMediaChunkExtractor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class PeekingInputReader implements android.media.MediaParser.SeekableInputReader {
        private final com.google.android.exoplayer2.extractor.ExtractorInput extractorInput;
        private int totalPeekedBytes;

        private PeekingInputReader(com.google.android.exoplayer2.extractor.ExtractorInput r1) {
                r0 = this;
                r0.<init>()
                r0.extractorInput = r1
                return
        }

        public /* synthetic */ PeekingInputReader(com.google.android.exoplayer2.extractor.ExtractorInput r1, com.google.android.exoplayer2.source.hls.MediaParserHlsMediaChunkExtractor.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public static /* synthetic */ int access$100(com.google.android.exoplayer2.source.hls.MediaParserHlsMediaChunkExtractor.PeekingInputReader r0) {
                int r0 = r0.totalPeekedBytes
                return r0
        }

        @Override // android.media.MediaParser.InputReader
        public long getLength() {
                r2 = this;
                com.google.android.exoplayer2.extractor.ExtractorInput r0 = r2.extractorInput
                long r0 = r0.getLength()
                return r0
        }

        @Override // android.media.MediaParser.InputReader
        public long getPosition() {
                r2 = this;
                com.google.android.exoplayer2.extractor.ExtractorInput r0 = r2.extractorInput
                long r0 = r0.getPeekPosition()
                return r0
        }

        @Override // android.media.MediaParser.InputReader
        public int read(byte[] r2, int r3, int r4) throws java.io.IOException {
                r1 = this;
                com.google.android.exoplayer2.extractor.ExtractorInput r0 = r1.extractorInput
                int r2 = r0.peek(r2, r3, r4)
                int r3 = r1.totalPeekedBytes
                int r3 = r3 + r2
                r1.totalPeekedBytes = r3
                return r2
        }

        @Override // android.media.MediaParser.SeekableInputReader
        public void seekToPosition(long r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }
    }

    public static /* synthetic */ com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor $r8$lambda$20AI9zhzhaG68zwrCJZ9gdhnTwI(android.net.Uri r0, com.google.android.exoplayer2.Format r1, java.util.List r2, com.google.android.exoplayer2.util.TimestampAdjuster r3, java.util.Map r4, com.google.android.exoplayer2.extractor.ExtractorInput r5, com.google.android.exoplayer2.analytics.PlayerId r6) {
            com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor r0 = lambda$static$0(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    static {
            io.realm.Realm$$ExternalSyntheticLambda0 r0 = io.realm.Realm$$ExternalSyntheticLambda0.INSTANCE$20
            com.google.android.exoplayer2.source.hls.MediaParserHlsMediaChunkExtractor.FACTORY = r0
            return
    }

    public MediaParserHlsMediaChunkExtractor(android.media.MediaParser r1, com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30 r2, com.google.android.exoplayer2.Format r3, boolean r4, com.google.common.collect.ImmutableList<android.media.MediaFormat> r5, int r6, com.google.android.exoplayer2.analytics.PlayerId r7) {
            r0 = this;
            r0.<init>()
            r0.mediaParser = r1
            r0.outputConsumerAdapter = r2
            r0.overrideInBandCaptionDeclarations = r4
            r0.muxedCaptionMediaFormats = r5
            r0.format = r3
            r0.playerId = r7
            r0.pendingSkipBytes = r6
            com.google.android.exoplayer2.source.mediaparser.InputReaderAdapterV30 r1 = new com.google.android.exoplayer2.source.mediaparser.InputReaderAdapterV30
            r1.<init>()
            r0.inputReaderAdapter = r1
            return
    }

    @android.annotation.SuppressLint({"WrongConstant"})
    private static android.media.MediaParser createMediaParserInstance(android.media.MediaParser.OutputConsumer r2, com.google.android.exoplayer2.Format r3, boolean r4, com.google.common.collect.ImmutableList<android.media.MediaFormat> r5, com.google.android.exoplayer2.analytics.PlayerId r6, java.lang.String... r7) {
            int r0 = r7.length
            r1 = 1
            if (r0 != r1) goto Lc
            r0 = 0
            r7 = r7[r0]
            android.media.MediaParser r2 = android.media.MediaParser.createByName(r7, r2)
            goto L10
        Lc:
            android.media.MediaParser r2 = android.media.MediaParser.create(r2, r7)
        L10:
            java.lang.String r7 = "android.media.mediaParser.exposeCaptionFormats"
            r2.setParameter(r7, r5)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.String r5 = "android.media.mediaParser.overrideInBandCaptionDeclarations"
            r2.setParameter(r5, r4)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            java.lang.String r5 = "android.media.mediaparser.inBandCryptoInfo"
            r2.setParameter(r5, r4)
            java.lang.String r5 = "android.media.mediaparser.eagerlyExposeTrackType"
            r2.setParameter(r5, r4)
            java.lang.String r5 = "android.media.mediaparser.ignoreTimestampOffset"
            r2.setParameter(r5, r4)
            java.lang.String r5 = "android.media.mediaparser.ts.ignoreSpliceInfoStream"
            r2.setParameter(r5, r4)
            java.lang.String r5 = "android.media.mediaparser.ts.mode"
            java.lang.String r7 = "hls"
            r2.setParameter(r5, r7)
            java.lang.String r3 = r3.codecs
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 != 0) goto L66
            java.lang.String r5 = com.google.android.exoplayer2.util.MimeTypes.getAudioMediaMimeType(r3)
            java.lang.String r7 = "audio/mp4a-latm"
            boolean r5 = r7.equals(r5)
            if (r5 != 0) goto L54
            java.lang.String r5 = "android.media.mediaparser.ts.ignoreAacStream"
            r2.setParameter(r5, r4)
        L54:
            java.lang.String r3 = com.google.android.exoplayer2.util.MimeTypes.getVideoMediaMimeType(r3)
            java.lang.String r5 = "video/avc"
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L66
            java.lang.String r3 = "android.media.mediaparser.ts.ignoreAvcStream"
            r2.setParameter(r3, r4)
        L66:
            int r3 = com.google.android.exoplayer2.util.Util.SDK_INT
            r4 = 31
            if (r3 < r4) goto L6f
            com.google.android.exoplayer2.source.mediaparser.MediaParserUtil.setLogSessionIdOnMediaParser(r2, r6)
        L6f:
            return r2
    }

    private static /* synthetic */ com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor lambda$static$0(android.net.Uri r8, com.google.android.exoplayer2.Format r9, java.util.List r10, com.google.android.exoplayer2.util.TimestampAdjuster r11, java.util.Map r12, com.google.android.exoplayer2.extractor.ExtractorInput r13, com.google.android.exoplayer2.analytics.PlayerId r14) throws java.io.IOException {
            java.lang.String r8 = r9.sampleMimeType
            int r8 = com.google.android.exoplayer2.util.FileTypes.inferFileTypeFromMimeType(r8)
            r12 = 13
            if (r8 != r12) goto L17
            com.google.android.exoplayer2.source.hls.BundledHlsMediaChunkExtractor r8 = new com.google.android.exoplayer2.source.hls.BundledHlsMediaChunkExtractor
            com.google.android.exoplayer2.source.hls.WebvttExtractor r10 = new com.google.android.exoplayer2.source.hls.WebvttExtractor
            java.lang.String r12 = r9.language
            r10.<init>(r12, r11)
            r8.<init>(r10, r9, r11)
            return r8
        L17:
            r8 = 0
            if (r10 == 0) goto L1c
            r12 = 1
            goto L1d
        L1c:
            r12 = 0
        L1d:
            com.google.common.collect.ImmutableList$Builder r0 = com.google.common.collect.ImmutableList.builder()
            if (r10 == 0) goto L39
        L23:
            int r1 = r10.size()
            if (r8 >= r1) goto L4f
            java.lang.Object r1 = r10.get(r8)
            com.google.android.exoplayer2.Format r1 = (com.google.android.exoplayer2.Format) r1
            android.media.MediaFormat r1 = com.google.android.exoplayer2.source.mediaparser.MediaParserUtil.toCaptionsMediaFormat(r1)
            r0.add(r1)
            int r8 = r8 + 1
            goto L23
        L39:
            com.google.android.exoplayer2.Format$Builder r8 = new com.google.android.exoplayer2.Format$Builder
            r8.<init>()
            java.lang.String r1 = "application/cea-608"
            com.google.android.exoplayer2.Format$Builder r8 = r8.setSampleMimeType(r1)
            com.google.android.exoplayer2.Format r8 = r8.build()
            android.media.MediaFormat r8 = com.google.android.exoplayer2.source.mediaparser.MediaParserUtil.toCaptionsMediaFormat(r8)
            r0.add(r8)
        L4f:
            com.google.common.collect.ImmutableList r8 = r0.build()
            com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30 r6 = new com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30
            r6.<init>()
            if (r10 == 0) goto L5b
            goto L5f
        L5b:
            com.google.common.collect.ImmutableList r10 = com.google.common.collect.ImmutableList.of()
        L5f:
            r6.setMuxedCaptionFormats(r10)
            r6.setTimestampAdjuster(r11)
            java.lang.String r0 = "android.media.mediaparser.FragmentedMp4Parser"
            java.lang.String r1 = "android.media.mediaparser.Ac3Parser"
            java.lang.String r2 = "android.media.mediaparser.Ac4Parser"
            java.lang.String r3 = "android.media.mediaparser.AdtsParser"
            java.lang.String r4 = "android.media.mediaparser.Mp3Parser"
            java.lang.String r5 = "android.media.mediaparser.TsParser"
            java.lang.String[] r5 = new java.lang.String[]{r0, r1, r2, r3, r4, r5}
            r0 = r6
            r1 = r9
            r2 = r12
            r3 = r8
            r4 = r14
            android.media.MediaParser r1 = createMediaParserInstance(r0, r1, r2, r3, r4, r5)
            com.google.android.exoplayer2.source.hls.MediaParserHlsMediaChunkExtractor$PeekingInputReader r10 = new com.google.android.exoplayer2.source.hls.MediaParserHlsMediaChunkExtractor$PeekingInputReader
            r11 = 0
            r10.<init>(r13, r11)
            r1.advance(r10)
            java.lang.String r11 = r1.getParserName()
            r6.setSelectedParserName(r11)
            com.google.android.exoplayer2.source.hls.MediaParserHlsMediaChunkExtractor r11 = new com.google.android.exoplayer2.source.hls.MediaParserHlsMediaChunkExtractor
            int r10 = com.google.android.exoplayer2.source.hls.MediaParserHlsMediaChunkExtractor.PeekingInputReader.access$100(r10)
            r0 = r11
            r2 = r6
            r3 = r9
            r4 = r12
            r5 = r8
            r6 = r10
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r11
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor
    public void init(com.google.android.exoplayer2.extractor.ExtractorOutput r2) {
            r1 = this;
            com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30 r0 = r1.outputConsumerAdapter
            r0.setExtractorOutput(r2)
            return
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor
    public boolean isPackedAudioExtractor() {
            r2 = this;
            android.media.MediaParser r0 = r2.mediaParser
            java.lang.String r0 = r0.getParserName()
            java.lang.String r1 = "android.media.mediaparser.Ac3Parser"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L29
            java.lang.String r1 = "android.media.mediaparser.Ac4Parser"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L29
            java.lang.String r1 = "android.media.mediaparser.AdtsParser"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L29
            java.lang.String r1 = "android.media.mediaparser.Mp3Parser"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L27
            goto L29
        L27:
            r0 = 0
            goto L2a
        L29:
            r0 = 1
        L2a:
            return r0
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor
    public boolean isReusable() {
            r2 = this;
            android.media.MediaParser r0 = r2.mediaParser
            java.lang.String r0 = r0.getParserName()
            java.lang.String r1 = "android.media.mediaparser.FragmentedMp4Parser"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L19
            java.lang.String r1 = "android.media.mediaparser.TsParser"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L17
            goto L19
        L17:
            r0 = 0
            goto L1a
        L19:
            r0 = 1
        L1a:
            return r0
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor
    public void onTruncatedSegmentParsed() {
            r2 = this;
            android.media.MediaParser r0 = r2.mediaParser
            android.media.MediaParser$SeekPoint r1 = android.media.MediaParser.SeekPoint.START
            r0.seek(r1)
            return
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor
    public boolean read(com.google.android.exoplayer2.extractor.ExtractorInput r4) throws java.io.IOException {
            r3 = this;
            int r0 = r3.pendingSkipBytes
            r4.skipFully(r0)
            r0 = 0
            r3.pendingSkipBytes = r0
            com.google.android.exoplayer2.source.mediaparser.InputReaderAdapterV30 r0 = r3.inputReaderAdapter
            long r1 = r4.getLength()
            r0.setDataReader(r4, r1)
            android.media.MediaParser r4 = r3.mediaParser
            com.google.android.exoplayer2.source.mediaparser.InputReaderAdapterV30 r0 = r3.inputReaderAdapter
            boolean r4 = r4.advance(r0)
            return r4
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor
    public com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor recreate() {
            r10 = this;
            boolean r0 = r10.isReusable()
            r1 = 1
            r0 = r0 ^ r1
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            com.google.android.exoplayer2.source.hls.MediaParserHlsMediaChunkExtractor r0 = new com.google.android.exoplayer2.source.hls.MediaParserHlsMediaChunkExtractor
            com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30 r2 = r10.outputConsumerAdapter
            com.google.android.exoplayer2.Format r3 = r10.format
            boolean r4 = r10.overrideInBandCaptionDeclarations
            com.google.common.collect.ImmutableList<android.media.MediaFormat> r5 = r10.muxedCaptionMediaFormats
            com.google.android.exoplayer2.analytics.PlayerId r6 = r10.playerId
            java.lang.String[] r7 = new java.lang.String[r1]
            r1 = 0
            android.media.MediaParser r8 = r10.mediaParser
            java.lang.String r8 = r8.getParserName()
            r7[r1] = r8
            android.media.MediaParser r3 = createMediaParserInstance(r2, r3, r4, r5, r6, r7)
            com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30 r4 = r10.outputConsumerAdapter
            com.google.android.exoplayer2.Format r5 = r10.format
            boolean r6 = r10.overrideInBandCaptionDeclarations
            com.google.common.collect.ImmutableList<android.media.MediaFormat> r7 = r10.muxedCaptionMediaFormats
            r8 = 0
            com.google.android.exoplayer2.analytics.PlayerId r9 = r10.playerId
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r0
    }
}
