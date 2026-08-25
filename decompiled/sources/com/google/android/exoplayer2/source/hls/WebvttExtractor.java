package com.google.android.exoplayer2.source.hls;

/* JADX INFO: loaded from: classes2.dex */
public final class WebvttExtractor implements com.google.android.exoplayer2.extractor.Extractor {
    private static final int HEADER_MAX_LENGTH = 9;
    private static final int HEADER_MIN_LENGTH = 6;
    private static final java.util.regex.Pattern LOCAL_TIMESTAMP = null;
    private static final java.util.regex.Pattern MEDIA_TIMESTAMP = null;

    @androidx.annotation.Nullable
    private final java.lang.String language;
    private com.google.android.exoplayer2.extractor.ExtractorOutput output;
    private byte[] sampleData;
    private final com.google.android.exoplayer2.util.ParsableByteArray sampleDataWrapper;
    private int sampleSize;
    private final com.google.android.exoplayer2.util.TimestampAdjuster timestampAdjuster;

    static {
            java.lang.String r0 = "LOCAL:([^,]+)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.hls.WebvttExtractor.LOCAL_TIMESTAMP = r0
            java.lang.String r0 = "MPEGTS:(-?\\d+)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.hls.WebvttExtractor.MEDIA_TIMESTAMP = r0
            return
    }

    public WebvttExtractor(@androidx.annotation.Nullable java.lang.String r1, com.google.android.exoplayer2.util.TimestampAdjuster r2) {
            r0 = this;
            r0.<init>()
            r0.language = r1
            r0.timestampAdjuster = r2
            com.google.android.exoplayer2.util.ParsableByteArray r1 = new com.google.android.exoplayer2.util.ParsableByteArray
            r1.<init>()
            r0.sampleDataWrapper = r1
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]
            r0.sampleData = r1
            return
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"output"})
    private com.google.android.exoplayer2.extractor.TrackOutput buildTrackOutput(long r4) {
            r3 = this;
            com.google.android.exoplayer2.extractor.ExtractorOutput r0 = r3.output
            r1 = 0
            r2 = 3
            com.google.android.exoplayer2.extractor.TrackOutput r0 = r0.track(r1, r2)
            com.google.android.exoplayer2.Format$Builder r1 = new com.google.android.exoplayer2.Format$Builder
            r1.<init>()
            java.lang.String r2 = "text/vtt"
            com.google.android.exoplayer2.Format$Builder r1 = r1.setSampleMimeType(r2)
            java.lang.String r2 = r3.language
            com.google.android.exoplayer2.Format$Builder r1 = r1.setLanguage(r2)
            com.google.android.exoplayer2.Format$Builder r4 = r1.setSubsampleOffsetUs(r4)
            com.google.android.exoplayer2.Format r4 = r4.build()
            r0.format(r4)
            com.google.android.exoplayer2.extractor.ExtractorOutput r4 = r3.output
            r4.endTracks()
            return r0
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"output"})
    private void processSample() throws com.google.android.exoplayer2.ParserException {
            r12 = this;
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            byte[] r1 = r12.sampleData
            r0.<init>(r1)
            com.google.android.exoplayer2.text.webvtt.WebvttParserUtil.validateWebvttHeaderLine(r0)
            java.lang.String r1 = r0.readLine()
            r2 = 0
            r4 = r2
            r6 = r4
        L12:
            boolean r8 = android.text.TextUtils.isEmpty(r1)
            r9 = 1
            if (r8 != 0) goto L8c
            java.lang.String r8 = "X-TIMESTAMP-MAP"
            boolean r8 = r1.startsWith(r8)
            if (r8 == 0) goto L87
            java.util.regex.Pattern r4 = com.google.android.exoplayer2.source.hls.WebvttExtractor.LOCAL_TIMESTAMP
            java.util.regex.Matcher r4 = r4.matcher(r1)
            boolean r5 = r4.find()
            r6 = 0
            if (r5 == 0) goto L71
            java.util.regex.Pattern r5 = com.google.android.exoplayer2.source.hls.WebvttExtractor.MEDIA_TIMESTAMP
            java.util.regex.Matcher r5 = r5.matcher(r1)
            boolean r7 = r5.find()
            if (r7 == 0) goto L5b
            java.lang.String r1 = r4.group(r9)
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            java.lang.String r1 = (java.lang.String) r1
            long r6 = com.google.android.exoplayer2.text.webvtt.WebvttParserUtil.parseTimestampUs(r1)
            java.lang.String r1 = r5.group(r9)
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            java.lang.String r1 = (java.lang.String) r1
            long r4 = java.lang.Long.parseLong(r1)
            long r4 = com.google.android.exoplayer2.util.TimestampAdjuster.ptsToUs(r4)
            goto L87
        L5b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "X-TIMESTAMP-MAP doesn't contain media timestamp: "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r0, r6)
            throw r0
        L71:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "X-TIMESTAMP-MAP doesn't contain local timestamp: "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r0, r6)
            throw r0
        L87:
            java.lang.String r1 = r0.readLine()
            goto L12
        L8c:
            java.util.regex.Matcher r0 = com.google.android.exoplayer2.text.webvtt.WebvttParserUtil.findNextCueHeader(r0)
            if (r0 != 0) goto L96
            r12.buildTrackOutput(r2)
            return
        L96:
            java.lang.String r0 = r0.group(r9)
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            long r0 = com.google.android.exoplayer2.text.webvtt.WebvttParserUtil.parseTimestampUs(r0)
            com.google.android.exoplayer2.util.TimestampAdjuster r2 = r12.timestampAdjuster
            long r4 = r4 + r0
            long r4 = r4 - r6
            long r3 = com.google.android.exoplayer2.util.TimestampAdjuster.usToWrappedPts(r4)
            long r6 = r2.adjustTsTimestamp(r3)
            long r0 = r6 - r0
            com.google.android.exoplayer2.extractor.TrackOutput r5 = r12.buildTrackOutput(r0)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r12.sampleDataWrapper
            byte[] r1 = r12.sampleData
            int r2 = r12.sampleSize
            r0.reset(r1, r2)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r12.sampleDataWrapper
            int r1 = r12.sampleSize
            r5.sampleData(r0, r1)
            r8 = 1
            int r9 = r12.sampleSize
            r10 = 0
            r11 = 0
            r5.sampleMetadata(r6, r8, r9, r10, r11)
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(com.google.android.exoplayer2.extractor.ExtractorOutput r4) {
            r3 = this;
            r3.output = r4
            com.google.android.exoplayer2.extractor.SeekMap$Unseekable r0 = new com.google.android.exoplayer2.extractor.SeekMap$Unseekable
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.<init>(r1)
            r4.seekMap(r0)
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(com.google.android.exoplayer2.extractor.ExtractorInput r5, com.google.android.exoplayer2.extractor.PositionHolder r6) throws java.io.IOException {
            r4 = this;
            com.google.android.exoplayer2.extractor.ExtractorOutput r6 = r4.output
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r6)
            long r0 = r5.getLength()
            int r6 = (int) r0
            int r0 = r4.sampleSize
            byte[] r1 = r4.sampleData
            int r2 = r1.length
            r3 = -1
            if (r0 != r2) goto L21
            if (r6 == r3) goto L16
            r0 = r6
            goto L17
        L16:
            int r0 = r1.length
        L17:
            int r0 = r0 * 3
            int r0 = r0 / 2
            byte[] r0 = java.util.Arrays.copyOf(r1, r0)
            r4.sampleData = r0
        L21:
            byte[] r0 = r4.sampleData
            int r1 = r4.sampleSize
            int r2 = r0.length
            int r2 = r2 - r1
            int r5 = r5.read(r0, r1, r2)
            if (r5 == r3) goto L38
            int r0 = r4.sampleSize
            int r0 = r0 + r5
            r4.sampleSize = r0
            if (r6 == r3) goto L36
            if (r0 == r6) goto L38
        L36:
            r5 = 0
            return r5
        L38:
            r4.processSample()
            return r3
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long r1, long r3) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(com.google.android.exoplayer2.extractor.ExtractorInput r5) throws java.io.IOException {
            r4 = this;
            byte[] r0 = r4.sampleData
            r1 = 0
            r2 = 6
            r5.peekFully(r0, r1, r2, r1)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r4.sampleDataWrapper
            byte[] r3 = r4.sampleData
            r0.reset(r3, r2)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r4.sampleDataWrapper
            boolean r0 = com.google.android.exoplayer2.text.webvtt.WebvttParserUtil.isWebvttHeaderLine(r0)
            if (r0 == 0) goto L18
            r5 = 1
            return r5
        L18:
            byte[] r0 = r4.sampleData
            r3 = 3
            r5.peekFully(r0, r2, r3, r1)
            com.google.android.exoplayer2.util.ParsableByteArray r5 = r4.sampleDataWrapper
            byte[] r0 = r4.sampleData
            r1 = 9
            r5.reset(r0, r1)
            com.google.android.exoplayer2.util.ParsableByteArray r5 = r4.sampleDataWrapper
            boolean r5 = com.google.android.exoplayer2.text.webvtt.WebvttParserUtil.isWebvttHeaderLine(r5)
            return r5
    }
}
