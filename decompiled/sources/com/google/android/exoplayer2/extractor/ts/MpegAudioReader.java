package com.google.android.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: classes.dex */
public final class MpegAudioReader implements com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader {
    private static final int HEADER_SIZE = 4;
    private static final int STATE_FINDING_HEADER = 0;
    private static final int STATE_READING_FRAME = 2;
    private static final int STATE_READING_HEADER = 1;
    private java.lang.String formatId;
    private int frameBytesRead;
    private long frameDurationUs;
    private int frameSize;
    private boolean hasOutputFormat;
    private final com.google.android.exoplayer2.audio.MpegAudioUtil.Header header;
    private final com.google.android.exoplayer2.util.ParsableByteArray headerScratch;

    @androidx.annotation.Nullable
    private final java.lang.String language;
    private boolean lastByteWasFF;
    private com.google.android.exoplayer2.extractor.TrackOutput output;
    private int state;
    private long timeUs;

    public MpegAudioReader() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public MpegAudioReader(@androidx.annotation.Nullable java.lang.String r4) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.state = r0
            com.google.android.exoplayer2.util.ParsableByteArray r1 = new com.google.android.exoplayer2.util.ParsableByteArray
            r2 = 4
            r1.<init>(r2)
            r3.headerScratch = r1
            byte[] r1 = r1.getData()
            r2 = -1
            r1[r0] = r2
            com.google.android.exoplayer2.audio.MpegAudioUtil$Header r0 = new com.google.android.exoplayer2.audio.MpegAudioUtil$Header
            r0.<init>()
            r3.header = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.timeUs = r0
            r3.language = r4
            return
    }

    private void findHeader(com.google.android.exoplayer2.util.ParsableByteArray r9) {
            r8 = this;
            byte[] r0 = r9.getData()
            int r1 = r9.getPosition()
            int r2 = r9.limit()
        Lc:
            if (r1 >= r2) goto L46
            r3 = r0[r1]
            r4 = 255(0xff, float:3.57E-43)
            r3 = r3 & r4
            r5 = 0
            r6 = 1
            if (r3 != r4) goto L19
            r3 = 1
            goto L1a
        L19:
            r3 = 0
        L1a:
            boolean r4 = r8.lastByteWasFF
            if (r4 == 0) goto L27
            r4 = r0[r1]
            r7 = 224(0xe0, float:3.14E-43)
            r4 = r4 & r7
            if (r4 != r7) goto L27
            r4 = 1
            goto L28
        L27:
            r4 = 0
        L28:
            r8.lastByteWasFF = r3
            if (r4 == 0) goto L43
            int r2 = r1 + 1
            r9.setPosition(r2)
            r8.lastByteWasFF = r5
            com.google.android.exoplayer2.util.ParsableByteArray r9 = r8.headerScratch
            byte[] r9 = r9.getData()
            r0 = r0[r1]
            r9[r6] = r0
            r9 = 2
            r8.frameBytesRead = r9
            r8.state = r6
            return
        L43:
            int r1 = r1 + 1
            goto Lc
        L46:
            r9.setPosition(r2)
            return
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"output"})
    private void readFrameRemainder(com.google.android.exoplayer2.util.ParsableByteArray r8) {
            r7 = this;
            int r0 = r8.bytesLeft()
            int r1 = r7.frameSize
            int r2 = r7.frameBytesRead
            int r1 = r1 - r2
            int r0 = java.lang.Math.min(r0, r1)
            com.google.android.exoplayer2.extractor.TrackOutput r1 = r7.output
            r1.sampleData(r8, r0)
            int r8 = r7.frameBytesRead
            int r8 = r8 + r0
            r7.frameBytesRead = r8
            int r4 = r7.frameSize
            if (r8 >= r4) goto L1c
            return
        L1c:
            long r1 = r7.timeUs
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r8 == 0) goto L36
            com.google.android.exoplayer2.extractor.TrackOutput r0 = r7.output
            r3 = 1
            r5 = 0
            r6 = 0
            r0.sampleMetadata(r1, r3, r4, r5, r6)
            long r0 = r7.timeUs
            long r2 = r7.frameDurationUs
            long r0 = r0 + r2
            r7.timeUs = r0
        L36:
            r8 = 0
            r7.frameBytesRead = r8
            r7.state = r8
            return
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"output"})
    private void readHeaderRemainder(com.google.android.exoplayer2.util.ParsableByteArray r8) {
            r7 = this;
            int r0 = r8.bytesLeft()
            int r1 = r7.frameBytesRead
            r2 = 4
            int r1 = 4 - r1
            int r0 = java.lang.Math.min(r0, r1)
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r7.headerScratch
            byte[] r1 = r1.getData()
            int r3 = r7.frameBytesRead
            r8.readBytes(r1, r3, r0)
            int r8 = r7.frameBytesRead
            int r8 = r8 + r0
            r7.frameBytesRead = r8
            if (r8 >= r2) goto L20
            return
        L20:
            com.google.android.exoplayer2.util.ParsableByteArray r8 = r7.headerScratch
            r0 = 0
            r8.setPosition(r0)
            com.google.android.exoplayer2.audio.MpegAudioUtil$Header r8 = r7.header
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r7.headerScratch
            int r1 = r1.readInt()
            boolean r8 = r8.setForHeaderData(r1)
            r1 = 1
            if (r8 != 0) goto L3a
            r7.frameBytesRead = r0
            r7.state = r1
            return
        L3a:
            com.google.android.exoplayer2.audio.MpegAudioUtil$Header r8 = r7.header
            int r3 = r8.frameSize
            r7.frameSize = r3
            boolean r3 = r7.hasOutputFormat
            if (r3 != 0) goto L8c
            r3 = 1000000(0xf4240, double:4.940656E-318)
            int r5 = r8.samplesPerFrame
            long r5 = (long) r5
            long r5 = r5 * r3
            int r8 = r8.sampleRate
            long r3 = (long) r8
            long r5 = r5 / r3
            r7.frameDurationUs = r5
            com.google.android.exoplayer2.Format$Builder r8 = new com.google.android.exoplayer2.Format$Builder
            r8.<init>()
            java.lang.String r3 = r7.formatId
            com.google.android.exoplayer2.Format$Builder r8 = r8.setId(r3)
            com.google.android.exoplayer2.audio.MpegAudioUtil$Header r3 = r7.header
            java.lang.String r3 = r3.mimeType
            com.google.android.exoplayer2.Format$Builder r8 = r8.setSampleMimeType(r3)
            r3 = 4096(0x1000, float:5.74E-42)
            com.google.android.exoplayer2.Format$Builder r8 = r8.setMaxInputSize(r3)
            com.google.android.exoplayer2.audio.MpegAudioUtil$Header r3 = r7.header
            int r3 = r3.channels
            com.google.android.exoplayer2.Format$Builder r8 = r8.setChannelCount(r3)
            com.google.android.exoplayer2.audio.MpegAudioUtil$Header r3 = r7.header
            int r3 = r3.sampleRate
            com.google.android.exoplayer2.Format$Builder r8 = r8.setSampleRate(r3)
            java.lang.String r3 = r7.language
            com.google.android.exoplayer2.Format$Builder r8 = r8.setLanguage(r3)
            com.google.android.exoplayer2.Format r8 = r8.build()
            com.google.android.exoplayer2.extractor.TrackOutput r3 = r7.output
            r3.format(r8)
            r7.hasOutputFormat = r1
        L8c:
            com.google.android.exoplayer2.util.ParsableByteArray r8 = r7.headerScratch
            r8.setPosition(r0)
            com.google.android.exoplayer2.extractor.TrackOutput r8 = r7.output
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r7.headerScratch
            r8.sampleData(r0, r2)
            r8 = 2
            r7.state = r8
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void consume(com.google.android.exoplayer2.util.ParsableByteArray r3) {
            r2 = this;
            com.google.android.exoplayer2.extractor.TrackOutput r0 = r2.output
            com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
        L5:
            int r0 = r3.bytesLeft()
            if (r0 <= 0) goto L27
            int r0 = r2.state
            if (r0 == 0) goto L23
            r1 = 1
            if (r0 == r1) goto L1f
            r1 = 2
            if (r0 != r1) goto L19
            r2.readFrameRemainder(r3)
            goto L5
        L19:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
        L1f:
            r2.readHeaderRemainder(r3)
            goto L5
        L23:
            r2.findHeader(r3)
            goto L5
        L27:
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void createTracks(com.google.android.exoplayer2.extractor.ExtractorOutput r2, com.google.android.exoplayer2.extractor.ts.TsPayloadReader.TrackIdGenerator r3) {
            r1 = this;
            r3.generateNewId()
            java.lang.String r0 = r3.getFormatId()
            r1.formatId = r0
            int r3 = r3.getTrackId()
            r0 = 1
            com.google.android.exoplayer2.extractor.TrackOutput r2 = r2.track(r3, r0)
            r1.output = r2
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetFinished() {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetStarted(long r3, int r5) {
            r2 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 == 0) goto Lb
            r2.timeUs = r3
        Lb:
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void seek() {
            r2 = this;
            r0 = 0
            r2.state = r0
            r2.frameBytesRead = r0
            r2.lastByteWasFF = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.timeUs = r0
            return
    }
}
