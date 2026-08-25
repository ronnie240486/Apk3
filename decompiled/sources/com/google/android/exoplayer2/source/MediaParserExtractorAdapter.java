package com.google.android.exoplayer2.source;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RequiresApi(30)
public final class MediaParserExtractorAdapter implements com.google.android.exoplayer2.source.ProgressiveMediaExtractor {
    public static final com.google.android.exoplayer2.source.ProgressiveMediaExtractor.Factory FACTORY = null;
    private final com.google.android.exoplayer2.source.mediaparser.InputReaderAdapterV30 inputReaderAdapter;
    private final android.media.MediaParser mediaParser;
    private final com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30 outputConsumerAdapter;
    private java.lang.String parserName;

    static {
            com.google.android.exoplayer2.source.TrackGroup$$ExternalSyntheticLambda0 r0 = com.google.android.exoplayer2.source.TrackGroup$$ExternalSyntheticLambda0.INSTANCE$3
            com.google.android.exoplayer2.source.MediaParserExtractorAdapter.FACTORY = r0
            return
    }

    @android.annotation.SuppressLint({"WrongConstant"})
    public MediaParserExtractorAdapter(com.google.android.exoplayer2.analytics.PlayerId r4) {
            r3 = this;
            r3.<init>()
            com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30 r0 = new com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30
            r0.<init>()
            r3.outputConsumerAdapter = r0
            com.google.android.exoplayer2.source.mediaparser.InputReaderAdapterV30 r1 = new com.google.android.exoplayer2.source.mediaparser.InputReaderAdapterV30
            r1.<init>()
            r3.inputReaderAdapter = r1
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            android.media.MediaParser r0 = android.media.MediaParser.create(r0, r1)
            r3.mediaParser = r0
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.String r2 = "android.media.mediaparser.eagerlyExposeTrackType"
            r0.setParameter(r2, r1)
            java.lang.String r2 = "android.media.mediaparser.inBandCryptoInfo"
            r0.setParameter(r2, r1)
            java.lang.String r2 = "android.media.mediaparser.includeSupplementalData"
            r0.setParameter(r2, r1)
            java.lang.String r1 = "android.media.mediaparser.UNKNOWN"
            r3.parserName = r1
            int r1 = com.google.android.exoplayer2.util.Util.SDK_INT
            r2 = 31
            if (r1 < r2) goto L38
            com.google.android.exoplayer2.source.mediaparser.MediaParserUtil.setLogSessionIdOnMediaParser(r0, r4)
        L38:
            return
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public void disableSeekingOnMp3Streams() {
            r2 = this;
            java.lang.String r0 = r2.parserName
            java.lang.String r1 = "android.media.mediaparser.Mp3Parser"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lf
            com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30 r0 = r2.outputConsumerAdapter
            r0.disableSeeking()
        Lf:
            return
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public long getCurrentInputPosition() {
            r2 = this;
            com.google.android.exoplayer2.source.mediaparser.InputReaderAdapterV30 r0 = r2.inputReaderAdapter
            long r0 = r0.getPosition()
            return r0
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public void init(com.google.android.exoplayer2.upstream.DataReader r1, android.net.Uri r2, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r3, long r4, long r6, com.google.android.exoplayer2.extractor.ExtractorOutput r8) throws java.io.IOException {
            r0 = this;
            com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30 r2 = r0.outputConsumerAdapter
            r2.setExtractorOutput(r8)
            com.google.android.exoplayer2.source.mediaparser.InputReaderAdapterV30 r2 = r0.inputReaderAdapter
            r2.setDataReader(r1, r6)
            com.google.android.exoplayer2.source.mediaparser.InputReaderAdapterV30 r1 = r0.inputReaderAdapter
            r1.setCurrentPosition(r4)
            android.media.MediaParser r1 = r0.mediaParser
            java.lang.String r1 = r1.getParserName()
            java.lang.String r2 = "android.media.mediaparser.UNKNOWN"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L32
            android.media.MediaParser r1 = r0.mediaParser
            com.google.android.exoplayer2.source.mediaparser.InputReaderAdapterV30 r2 = r0.inputReaderAdapter
            r1.advance(r2)
            android.media.MediaParser r1 = r0.mediaParser
            java.lang.String r1 = r1.getParserName()
            r0.parserName = r1
            com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30 r2 = r0.outputConsumerAdapter
            r2.setSelectedParserName(r1)
            goto L47
        L32:
            java.lang.String r2 = r0.parserName
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L47
            android.media.MediaParser r1 = r0.mediaParser
            java.lang.String r1 = r1.getParserName()
            r0.parserName = r1
            com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30 r2 = r0.outputConsumerAdapter
            r2.setSelectedParserName(r1)
        L47:
            return
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public int read(com.google.android.exoplayer2.extractor.PositionHolder r6) throws java.io.IOException {
            r5 = this;
            android.media.MediaParser r0 = r5.mediaParser
            com.google.android.exoplayer2.source.mediaparser.InputReaderAdapterV30 r1 = r5.inputReaderAdapter
            boolean r0 = r0.advance(r1)
            com.google.android.exoplayer2.source.mediaparser.InputReaderAdapterV30 r1 = r5.inputReaderAdapter
            long r1 = r1.getAndResetSeekPosition()
            r6.position = r1
            if (r0 != 0) goto L14
            r6 = -1
            goto L1d
        L14:
            r3 = -1
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L1c
            r6 = 1
            goto L1d
        L1c:
            r6 = 0
        L1d:
            return r6
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public void release() {
            r1 = this;
            android.media.MediaParser r0 = r1.mediaParser
            r0.release()
            return
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public void seek(long r5, long r7) {
            r4 = this;
            com.google.android.exoplayer2.source.mediaparser.InputReaderAdapterV30 r0 = r4.inputReaderAdapter
            r0.setCurrentPosition(r5)
            com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30 r0 = r4.outputConsumerAdapter
            android.util.Pair r7 = r0.getSeekPoints(r7)
            android.media.MediaParser r8 = r4.mediaParser
            java.lang.Object r0 = r7.second
            r1 = r0
            android.media.MediaParser$SeekPoint r1 = (android.media.MediaParser.SeekPoint) r1
            long r1 = r1.position
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 != 0) goto L1b
            android.media.MediaParser$SeekPoint r0 = (android.media.MediaParser.SeekPoint) r0
            goto L20
        L1b:
            java.lang.Object r5 = r7.first
            r0 = r5
            android.media.MediaParser$SeekPoint r0 = (android.media.MediaParser.SeekPoint) r0
        L20:
            r8.seek(r0)
            return
    }
}
