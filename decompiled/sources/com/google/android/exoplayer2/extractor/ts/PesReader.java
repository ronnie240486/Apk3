package com.google.android.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: classes2.dex */
public final class PesReader implements com.google.android.exoplayer2.extractor.ts.TsPayloadReader {
    private static final int HEADER_SIZE = 9;
    private static final int MAX_HEADER_EXTENSION_SIZE = 10;
    private static final int PES_SCRATCH_SIZE = 10;
    private static final int STATE_FINDING_HEADER = 0;
    private static final int STATE_READING_BODY = 3;
    private static final int STATE_READING_HEADER = 1;
    private static final int STATE_READING_HEADER_EXTENSION = 2;
    private static final java.lang.String TAG = "PesReader";
    private int bytesRead;
    private boolean dataAlignmentIndicator;
    private boolean dtsFlag;
    private int extendedHeaderLength;
    private int payloadSize;
    private final com.google.android.exoplayer2.util.ParsableBitArray pesScratch;
    private boolean ptsFlag;
    private final com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader reader;
    private boolean seenFirstDts;
    private int state;
    private long timeUs;
    private com.google.android.exoplayer2.util.TimestampAdjuster timestampAdjuster;

    public PesReader(com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader r2) {
            r1 = this;
            r1.<init>()
            r1.reader = r2
            com.google.android.exoplayer2.util.ParsableBitArray r2 = new com.google.android.exoplayer2.util.ParsableBitArray
            r0 = 10
            byte[] r0 = new byte[r0]
            r2.<init>(r0)
            r1.pesScratch = r2
            r2 = 0
            r1.state = r2
            return
    }

    private boolean continueRead(com.google.android.exoplayer2.util.ParsableByteArray r4, @androidx.annotation.Nullable byte[] r5, int r6) {
            r3 = this;
            int r0 = r4.bytesLeft()
            int r1 = r3.bytesRead
            int r1 = r6 - r1
            int r0 = java.lang.Math.min(r0, r1)
            r1 = 1
            if (r0 > 0) goto L10
            return r1
        L10:
            if (r5 != 0) goto L16
            r4.skipBytes(r0)
            goto L1b
        L16:
            int r2 = r3.bytesRead
            r4.readBytes(r5, r2, r0)
        L1b:
            int r4 = r3.bytesRead
            int r4 = r4 + r0
            r3.bytesRead = r4
            if (r4 != r6) goto L23
            goto L24
        L23:
            r1 = 0
        L24:
            return r1
    }

    private boolean parseHeader() {
            r7 = this;
            com.google.android.exoplayer2.util.ParsableBitArray r0 = r7.pesScratch
            r1 = 0
            r0.setPosition(r1)
            com.google.android.exoplayer2.util.ParsableBitArray r0 = r7.pesScratch
            r2 = 24
            int r0 = r0.readBits(r2)
            java.lang.String r2 = "PesReader"
            r3 = 1
            r4 = -1
            if (r0 == r3) goto L1c
            java.lang.String r3 = "Unexpected start code prefix: "
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m26m(r3, r0, r2)
            r7.payloadSize = r4
            return r1
        L1c:
            com.google.android.exoplayer2.util.ParsableBitArray r0 = r7.pesScratch
            r1 = 8
            r0.skipBits(r1)
            com.google.android.exoplayer2.util.ParsableBitArray r0 = r7.pesScratch
            r5 = 16
            int r0 = r0.readBits(r5)
            com.google.android.exoplayer2.util.ParsableBitArray r5 = r7.pesScratch
            r6 = 5
            r5.skipBits(r6)
            com.google.android.exoplayer2.util.ParsableBitArray r5 = r7.pesScratch
            boolean r5 = r5.readBit()
            r7.dataAlignmentIndicator = r5
            com.google.android.exoplayer2.util.ParsableBitArray r5 = r7.pesScratch
            r6 = 2
            r5.skipBits(r6)
            com.google.android.exoplayer2.util.ParsableBitArray r5 = r7.pesScratch
            boolean r5 = r5.readBit()
            r7.ptsFlag = r5
            com.google.android.exoplayer2.util.ParsableBitArray r5 = r7.pesScratch
            boolean r5 = r5.readBit()
            r7.dtsFlag = r5
            com.google.android.exoplayer2.util.ParsableBitArray r5 = r7.pesScratch
            r6 = 6
            r5.skipBits(r6)
            com.google.android.exoplayer2.util.ParsableBitArray r5 = r7.pesScratch
            int r1 = r5.readBits(r1)
            r7.extendedHeaderLength = r1
            if (r0 != 0) goto L62
            r7.payloadSize = r4
            goto L7e
        L62:
            int r0 = r0 + r6
            int r0 = r0 + (-9)
            int r0 = r0 - r1
            r7.payloadSize = r0
            if (r0 >= 0) goto L7e
            java.lang.String r0 = "Found negative packet payload size: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            int r1 = r7.payloadSize
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.google.android.exoplayer2.util.Log.w(r2, r0)
            r7.payloadSize = r4
        L7e:
            return r3
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"timestampAdjuster"})
    private void parseHeaderExtension() {
            r10 = this;
            com.google.android.exoplayer2.util.ParsableBitArray r0 = r10.pesScratch
            r1 = 0
            r0.setPosition(r1)
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10.timeUs = r0
            boolean r0 = r10.ptsFlag
            if (r0 == 0) goto L8a
            com.google.android.exoplayer2.util.ParsableBitArray r0 = r10.pesScratch
            r1 = 4
            r0.skipBits(r1)
            com.google.android.exoplayer2.util.ParsableBitArray r0 = r10.pesScratch
            r2 = 3
            int r0 = r0.readBits(r2)
            long r3 = (long) r0
            r0 = 30
            long r3 = r3 << r0
            com.google.android.exoplayer2.util.ParsableBitArray r5 = r10.pesScratch
            r6 = 1
            r5.skipBits(r6)
            com.google.android.exoplayer2.util.ParsableBitArray r5 = r10.pesScratch
            r7 = 15
            int r5 = r5.readBits(r7)
            int r5 = r5 << r7
            long r8 = (long) r5
            long r3 = r3 | r8
            com.google.android.exoplayer2.util.ParsableBitArray r5 = r10.pesScratch
            r5.skipBits(r6)
            com.google.android.exoplayer2.util.ParsableBitArray r5 = r10.pesScratch
            int r5 = r5.readBits(r7)
            long r8 = (long) r5
            long r3 = r3 | r8
            com.google.android.exoplayer2.util.ParsableBitArray r5 = r10.pesScratch
            r5.skipBits(r6)
            boolean r5 = r10.seenFirstDts
            if (r5 != 0) goto L82
            boolean r5 = r10.dtsFlag
            if (r5 == 0) goto L82
            com.google.android.exoplayer2.util.ParsableBitArray r5 = r10.pesScratch
            r5.skipBits(r1)
            com.google.android.exoplayer2.util.ParsableBitArray r1 = r10.pesScratch
            int r1 = r1.readBits(r2)
            long r1 = (long) r1
            long r0 = r1 << r0
            com.google.android.exoplayer2.util.ParsableBitArray r2 = r10.pesScratch
            r2.skipBits(r6)
            com.google.android.exoplayer2.util.ParsableBitArray r2 = r10.pesScratch
            int r2 = r2.readBits(r7)
            int r2 = r2 << r7
            long r8 = (long) r2
            long r0 = r0 | r8
            com.google.android.exoplayer2.util.ParsableBitArray r2 = r10.pesScratch
            r2.skipBits(r6)
            com.google.android.exoplayer2.util.ParsableBitArray r2 = r10.pesScratch
            int r2 = r2.readBits(r7)
            long r7 = (long) r2
            long r0 = r0 | r7
            com.google.android.exoplayer2.util.ParsableBitArray r2 = r10.pesScratch
            r2.skipBits(r6)
            com.google.android.exoplayer2.util.TimestampAdjuster r2 = r10.timestampAdjuster
            r2.adjustTsTimestamp(r0)
            r10.seenFirstDts = r6
        L82:
            com.google.android.exoplayer2.util.TimestampAdjuster r0 = r10.timestampAdjuster
            long r0 = r0.adjustTsTimestamp(r3)
            r10.timeUs = r0
        L8a:
            return
    }

    private void setState(int r1) {
            r0 = this;
            r0.state = r1
            r1 = 0
            r0.bytesRead = r1
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ts.TsPayloadReader
    public final void consume(com.google.android.exoplayer2.util.ParsableByteArray r8, int r9) throws com.google.android.exoplayer2.ParserException {
            r7 = this;
            com.google.android.exoplayer2.util.TimestampAdjuster r0 = r7.timestampAdjuster
            com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
            r0 = r9 & 1
            r1 = -1
            r2 = 3
            r3 = 2
            r4 = 1
            if (r0 == 0) goto L48
            int r0 = r7.state
            if (r0 == 0) goto L45
            if (r0 == r4) goto L45
            java.lang.String r5 = "PesReader"
            if (r0 == r3) goto L40
            if (r0 != r2) goto L3a
            int r0 = r7.payloadSize
            if (r0 == r1) goto L34
            java.lang.String r0 = "Unexpected start indicator: expected "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            int r6 = r7.payloadSize
            r0.append(r6)
            java.lang.String r6 = " more bytes"
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.google.android.exoplayer2.util.Log.w(r5, r0)
        L34:
            com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader r0 = r7.reader
            r0.packetFinished()
            goto L45
        L3a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L40:
            java.lang.String r0 = "Unexpected start indicator reading extended header"
            com.google.android.exoplayer2.util.Log.w(r5, r0)
        L45:
            r7.setState(r4)
        L48:
            int r0 = r8.bytesLeft()
            if (r0 <= 0) goto Ldc
            int r0 = r7.state
            if (r0 == 0) goto Ld3
            r5 = 0
            if (r0 == r4) goto Lbb
            if (r0 == r3) goto L8c
            if (r0 != r2) goto L86
            int r0 = r8.bytesLeft()
            int r6 = r7.payloadSize
            if (r6 != r1) goto L62
            goto L64
        L62:
            int r5 = r0 - r6
        L64:
            if (r5 <= 0) goto L6f
            int r0 = r0 - r5
            int r5 = r8.getPosition()
            int r5 = r5 + r0
            r8.setLimit(r5)
        L6f:
            com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader r5 = r7.reader
            r5.consume(r8)
            int r5 = r7.payloadSize
            if (r5 == r1) goto L48
            int r5 = r5 - r0
            r7.payloadSize = r5
            if (r5 != 0) goto L48
            com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader r0 = r7.reader
            r0.packetFinished()
            r7.setState(r4)
            goto L48
        L86:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L8c:
            r0 = 10
            int r6 = r7.extendedHeaderLength
            int r0 = java.lang.Math.min(r0, r6)
            com.google.android.exoplayer2.util.ParsableBitArray r6 = r7.pesScratch
            byte[] r6 = r6.data
            boolean r0 = r7.continueRead(r8, r6, r0)
            if (r0 == 0) goto L48
            r0 = 0
            int r6 = r7.extendedHeaderLength
            boolean r0 = r7.continueRead(r8, r0, r6)
            if (r0 == 0) goto L48
            r7.parseHeaderExtension()
            boolean r0 = r7.dataAlignmentIndicator
            if (r0 == 0) goto Laf
            r5 = 4
        Laf:
            r9 = r9 | r5
            com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader r0 = r7.reader
            long r5 = r7.timeUs
            r0.packetStarted(r5, r9)
            r7.setState(r2)
            goto L48
        Lbb:
            com.google.android.exoplayer2.util.ParsableBitArray r0 = r7.pesScratch
            byte[] r0 = r0.data
            r6 = 9
            boolean r0 = r7.continueRead(r8, r0, r6)
            if (r0 == 0) goto L48
            boolean r0 = r7.parseHeader()
            if (r0 == 0) goto Lce
            r5 = 2
        Lce:
            r7.setState(r5)
            goto L48
        Ld3:
            int r0 = r8.bytesLeft()
            r8.skipBytes(r0)
            goto L48
        Ldc:
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ts.TsPayloadReader
    public void init(com.google.android.exoplayer2.util.TimestampAdjuster r1, com.google.android.exoplayer2.extractor.ExtractorOutput r2, com.google.android.exoplayer2.extractor.ts.TsPayloadReader.TrackIdGenerator r3) {
            r0 = this;
            r0.timestampAdjuster = r1
            com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader r1 = r0.reader
            r1.createTracks(r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ts.TsPayloadReader
    public final void seek() {
            r1 = this;
            r0 = 0
            r1.state = r0
            r1.bytesRead = r0
            r1.seenFirstDts = r0
            com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader r0 = r1.reader
            r0.seek()
            return
    }
}
