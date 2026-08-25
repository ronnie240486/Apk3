package com.google.android.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: classes.dex */
public final class DtsReader implements com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader {
    private static final int HEADER_SIZE = 18;
    private static final int STATE_FINDING_SYNC = 0;
    private static final int STATE_READING_HEADER = 1;
    private static final int STATE_READING_SAMPLE = 2;
    private int bytesRead;
    private com.google.android.exoplayer2.Format format;
    private java.lang.String formatId;
    private final com.google.android.exoplayer2.util.ParsableByteArray headerScratchBytes;

    @androidx.annotation.Nullable
    private final java.lang.String language;
    private com.google.android.exoplayer2.extractor.TrackOutput output;
    private long sampleDurationUs;
    private int sampleSize;
    private int state;
    private int syncBytes;
    private long timeUs;

    public DtsReader(@androidx.annotation.Nullable java.lang.String r3) {
            r2 = this;
            r2.<init>()
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            r1 = 18
            byte[] r1 = new byte[r1]
            r0.<init>(r1)
            r2.headerScratchBytes = r0
            r0 = 0
            r2.state = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.timeUs = r0
            r2.language = r3
            return
    }

    private boolean continueRead(com.google.android.exoplayer2.util.ParsableByteArray r3, byte[] r4, int r5) {
            r2 = this;
            int r0 = r3.bytesLeft()
            int r1 = r2.bytesRead
            int r1 = r5 - r1
            int r0 = java.lang.Math.min(r0, r1)
            int r1 = r2.bytesRead
            r3.readBytes(r4, r1, r0)
            int r3 = r2.bytesRead
            int r3 = r3 + r0
            r2.bytesRead = r3
            if (r3 != r5) goto L1a
            r3 = 1
            goto L1b
        L1a:
            r3 = 0
        L1b:
            return r3
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"output"})
    private void parseHeader() {
            r5 = this;
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r5.headerScratchBytes
            byte[] r0 = r0.getData()
            com.google.android.exoplayer2.Format r1 = r5.format
            if (r1 != 0) goto L1a
            java.lang.String r1 = r5.formatId
            java.lang.String r2 = r5.language
            r3 = 0
            com.google.android.exoplayer2.Format r1 = com.google.android.exoplayer2.audio.DtsUtil.parseDtsFormat(r0, r1, r2, r3)
            r5.format = r1
            com.google.android.exoplayer2.extractor.TrackOutput r2 = r5.output
            r2.format(r1)
        L1a:
            int r1 = com.google.android.exoplayer2.audio.DtsUtil.getDtsFrameSize(r0)
            r5.sampleSize = r1
            r1 = 1000000(0xf4240, double:4.940656E-318)
            int r0 = com.google.android.exoplayer2.audio.DtsUtil.parseDtsAudioSampleCount(r0)
            long r3 = (long) r0
            long r3 = r3 * r1
            com.google.android.exoplayer2.Format r0 = r5.format
            int r0 = r0.sampleRate
            long r0 = (long) r0
            long r3 = r3 / r0
            int r0 = (int) r3
            long r0 = (long) r0
            r5.sampleDurationUs = r0
            return
    }

    private boolean skipToNextSync(com.google.android.exoplayer2.util.ParsableByteArray r6) {
            r5 = this;
        L0:
            int r0 = r6.bytesLeft()
            r1 = 0
            if (r0 <= 0) goto L45
            int r0 = r5.syncBytes
            int r0 = r0 << 8
            r5.syncBytes = r0
            int r2 = r6.readUnsignedByte()
            r0 = r0 | r2
            r5.syncBytes = r0
            boolean r0 = com.google.android.exoplayer2.audio.DtsUtil.isSyncWord(r0)
            if (r0 == 0) goto L0
            com.google.android.exoplayer2.util.ParsableByteArray r6 = r5.headerScratchBytes
            byte[] r6 = r6.getData()
            int r0 = r5.syncBytes
            int r2 = r0 >> 24
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r6[r1] = r2
            int r2 = r0 >> 16
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r3 = 1
            r6[r3] = r2
            r2 = 2
            int r4 = r0 >> 8
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r6[r2] = r4
            r2 = 3
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r6[r2] = r0
            r6 = 4
            r5.bytesRead = r6
            r5.syncBytes = r1
            return r3
        L45:
            return r1
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void consume(com.google.android.exoplayer2.util.ParsableByteArray r11) {
            r10 = this;
            com.google.android.exoplayer2.extractor.TrackOutput r0 = r10.output
            com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
        L5:
            int r0 = r11.bytesLeft()
            if (r0 <= 0) goto L7d
            int r0 = r10.state
            r1 = 1
            if (r0 == 0) goto L74
            r2 = 0
            r3 = 2
            if (r0 == r1) goto L54
            if (r0 != r3) goto L4e
            int r0 = r11.bytesLeft()
            int r1 = r10.sampleSize
            int r3 = r10.bytesRead
            int r1 = r1 - r3
            int r0 = java.lang.Math.min(r0, r1)
            com.google.android.exoplayer2.extractor.TrackOutput r1 = r10.output
            r1.sampleData(r11, r0)
            int r1 = r10.bytesRead
            int r1 = r1 + r0
            r10.bytesRead = r1
            int r7 = r10.sampleSize
            if (r1 != r7) goto L5
            long r4 = r10.timeUs
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 == 0) goto L4b
            com.google.android.exoplayer2.extractor.TrackOutput r3 = r10.output
            r6 = 1
            r8 = 0
            r9 = 0
            r3.sampleMetadata(r4, r6, r7, r8, r9)
            long r0 = r10.timeUs
            long r3 = r10.sampleDurationUs
            long r0 = r0 + r3
            r10.timeUs = r0
        L4b:
            r10.state = r2
            goto L5
        L4e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>()
            throw r11
        L54:
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r10.headerScratchBytes
            byte[] r0 = r0.getData()
            r1 = 18
            boolean r0 = r10.continueRead(r11, r0, r1)
            if (r0 == 0) goto L5
            r10.parseHeader()
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r10.headerScratchBytes
            r0.setPosition(r2)
            com.google.android.exoplayer2.extractor.TrackOutput r0 = r10.output
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r10.headerScratchBytes
            r0.sampleData(r2, r1)
            r10.state = r3
            goto L5
        L74:
            boolean r0 = r10.skipToNextSync(r11)
            if (r0 == 0) goto L5
            r10.state = r1
            goto L5
        L7d:
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
            r2.bytesRead = r0
            r2.syncBytes = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.timeUs = r0
            return
    }
}
