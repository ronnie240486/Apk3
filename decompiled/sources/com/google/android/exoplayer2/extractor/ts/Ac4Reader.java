package com.google.android.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: classes.dex */
public final class Ac4Reader implements com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader {
    private static final int STATE_FINDING_SYNC = 0;
    private static final int STATE_READING_HEADER = 1;
    private static final int STATE_READING_SAMPLE = 2;
    private int bytesRead;
    private com.google.android.exoplayer2.Format format;
    private java.lang.String formatId;
    private boolean hasCRC;
    private final com.google.android.exoplayer2.util.ParsableBitArray headerScratchBits;
    private final com.google.android.exoplayer2.util.ParsableByteArray headerScratchBytes;

    @androidx.annotation.Nullable
    private final java.lang.String language;
    private boolean lastByteWasAC;
    private com.google.android.exoplayer2.extractor.TrackOutput output;
    private long sampleDurationUs;
    private int sampleSize;
    private int state;
    private long timeUs;

    public Ac4Reader() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public Ac4Reader(@androidx.annotation.Nullable java.lang.String r3) {
            r2 = this;
            r2.<init>()
            com.google.android.exoplayer2.util.ParsableBitArray r0 = new com.google.android.exoplayer2.util.ParsableBitArray
            r1 = 16
            byte[] r1 = new byte[r1]
            r0.<init>(r1)
            r2.headerScratchBits = r0
            com.google.android.exoplayer2.util.ParsableByteArray r1 = new com.google.android.exoplayer2.util.ParsableByteArray
            byte[] r0 = r0.data
            r1.<init>(r0)
            r2.headerScratchBytes = r1
            r0 = 0
            r2.state = r0
            r2.bytesRead = r0
            r2.lastByteWasAC = r0
            r2.hasCRC = r0
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
            com.google.android.exoplayer2.util.ParsableBitArray r0 = r5.headerScratchBits
            r1 = 0
            r0.setPosition(r1)
            com.google.android.exoplayer2.util.ParsableBitArray r0 = r5.headerScratchBits
            com.google.android.exoplayer2.audio.Ac4Util$SyncFrameInfo r0 = com.google.android.exoplayer2.audio.Ac4Util.parseAc4SyncframeInfo(r0)
            com.google.android.exoplayer2.Format r1 = r5.format
            java.lang.String r2 = "audio/ac4"
            if (r1 == 0) goto L26
            int r3 = r0.channelCount
            int r4 = r1.channelCount
            if (r3 != r4) goto L26
            int r3 = r0.sampleRate
            int r4 = r1.sampleRate
            if (r3 != r4) goto L26
            java.lang.String r1 = r1.sampleMimeType
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L52
        L26:
            com.google.android.exoplayer2.Format$Builder r1 = new com.google.android.exoplayer2.Format$Builder
            r1.<init>()
            java.lang.String r3 = r5.formatId
            com.google.android.exoplayer2.Format$Builder r1 = r1.setId(r3)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setSampleMimeType(r2)
            int r2 = r0.channelCount
            com.google.android.exoplayer2.Format$Builder r1 = r1.setChannelCount(r2)
            int r2 = r0.sampleRate
            com.google.android.exoplayer2.Format$Builder r1 = r1.setSampleRate(r2)
            java.lang.String r2 = r5.language
            com.google.android.exoplayer2.Format$Builder r1 = r1.setLanguage(r2)
            com.google.android.exoplayer2.Format r1 = r1.build()
            r5.format = r1
            com.google.android.exoplayer2.extractor.TrackOutput r2 = r5.output
            r2.format(r1)
        L52:
            int r1 = r0.frameSize
            r5.sampleSize = r1
            r1 = 1000000(0xf4240, double:4.940656E-318)
            int r0 = r0.sampleCount
            long r3 = (long) r0
            long r3 = r3 * r1
            com.google.android.exoplayer2.Format r0 = r5.format
            int r0 = r0.sampleRate
            long r0 = (long) r0
            long r3 = r3 / r0
            r5.sampleDurationUs = r3
            return
    }

    private boolean skipToNextSync(com.google.android.exoplayer2.util.ParsableByteArray r6) {
            r5 = this;
        L0:
            int r0 = r6.bytesLeft()
            r1 = 0
            if (r0 <= 0) goto L31
            boolean r0 = r5.lastByteWasAC
            r2 = 172(0xac, float:2.41E-43)
            r3 = 1
            if (r0 != 0) goto L18
            int r0 = r6.readUnsignedByte()
            if (r0 != r2) goto L15
            r1 = 1
        L15:
            r5.lastByteWasAC = r1
            goto L0
        L18:
            int r0 = r6.readUnsignedByte()
            if (r0 != r2) goto L20
            r2 = 1
            goto L21
        L20:
            r2 = 0
        L21:
            r5.lastByteWasAC = r2
            r2 = 64
            r4 = 65
            if (r0 == r2) goto L2b
            if (r0 != r4) goto L0
        L2b:
            if (r0 != r4) goto L2e
            r1 = 1
        L2e:
            r5.hasCRC = r1
            return r3
        L31:
            return r1
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void consume(com.google.android.exoplayer2.util.ParsableByteArray r11) {
            r10 = this;
            com.google.android.exoplayer2.extractor.TrackOutput r0 = r10.output
            com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
        L5:
            int r0 = r11.bytesLeft()
            if (r0 <= 0) goto L97
            int r0 = r10.state
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L6f
            if (r0 == r3) goto L4f
            if (r0 == r2) goto L17
            goto L5
        L17:
            int r0 = r11.bytesLeft()
            int r2 = r10.sampleSize
            int r3 = r10.bytesRead
            int r2 = r2 - r3
            int r0 = java.lang.Math.min(r0, r2)
            com.google.android.exoplayer2.extractor.TrackOutput r2 = r10.output
            r2.sampleData(r11, r0)
            int r2 = r10.bytesRead
            int r2 = r2 + r0
            r10.bytesRead = r2
            int r7 = r10.sampleSize
            if (r2 != r7) goto L5
            long r4 = r10.timeUs
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L4c
            com.google.android.exoplayer2.extractor.TrackOutput r3 = r10.output
            r6 = 1
            r8 = 0
            r9 = 0
            r3.sampleMetadata(r4, r6, r7, r8, r9)
            long r2 = r10.timeUs
            long r4 = r10.sampleDurationUs
            long r2 = r2 + r4
            r10.timeUs = r2
        L4c:
            r10.state = r1
            goto L5
        L4f:
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r10.headerScratchBytes
            byte[] r0 = r0.getData()
            r3 = 16
            boolean r0 = r10.continueRead(r11, r0, r3)
            if (r0 == 0) goto L5
            r10.parseHeader()
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r10.headerScratchBytes
            r0.setPosition(r1)
            com.google.android.exoplayer2.extractor.TrackOutput r0 = r10.output
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r10.headerScratchBytes
            r0.sampleData(r1, r3)
            r10.state = r2
            goto L5
        L6f:
            boolean r0 = r10.skipToNextSync(r11)
            if (r0 == 0) goto L5
            r10.state = r3
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r10.headerScratchBytes
            byte[] r0 = r0.getData()
            r4 = -84
            r0[r1] = r4
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r10.headerScratchBytes
            byte[] r0 = r0.getData()
            boolean r1 = r10.hasCRC
            if (r1 == 0) goto L8e
            r1 = 65
            goto L90
        L8e:
            r1 = 64
        L90:
            byte r1 = (byte) r1
            r0[r3] = r1
            r10.bytesRead = r2
            goto L5
        L97:
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
            r2.lastByteWasAC = r0
            r2.hasCRC = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.timeUs = r0
            return
    }
}
