package com.google.android.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: classes2.dex */
public final class SectionReader implements com.google.android.exoplayer2.extractor.ts.TsPayloadReader {
    private static final int DEFAULT_SECTION_BUFFER_LENGTH = 32;
    private static final int MAX_SECTION_LENGTH = 4098;
    private static final int SECTION_HEADER_LENGTH = 3;
    private int bytesRead;
    private final com.google.android.exoplayer2.extractor.ts.SectionPayloadReader reader;
    private final com.google.android.exoplayer2.util.ParsableByteArray sectionData;
    private boolean sectionSyntaxIndicator;
    private int totalSectionLength;
    private boolean waitingForPayloadStart;

    public SectionReader(com.google.android.exoplayer2.extractor.ts.SectionPayloadReader r2) {
            r1 = this;
            r1.<init>()
            r1.reader = r2
            com.google.android.exoplayer2.util.ParsableByteArray r2 = new com.google.android.exoplayer2.util.ParsableByteArray
            r0 = 32
            r2.<init>(r0)
            r1.sectionData = r2
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ts.TsPayloadReader
    public void consume(com.google.android.exoplayer2.util.ParsableByteArray r7, int r8) {
            r6 = this;
            r0 = 1
            r8 = r8 & r0
            r1 = 0
            if (r8 == 0) goto L7
            r8 = 1
            goto L8
        L7:
            r8 = 0
        L8:
            r2 = -1
            if (r8 == 0) goto L15
            int r3 = r7.readUnsignedByte()
            int r4 = r7.getPosition()
            int r4 = r4 + r3
            goto L16
        L15:
            r4 = -1
        L16:
            boolean r3 = r6.waitingForPayloadStart
            if (r3 == 0) goto L24
            if (r8 != 0) goto L1d
            return
        L1d:
            r6.waitingForPayloadStart = r1
            r7.setPosition(r4)
            r6.bytesRead = r1
        L24:
            int r8 = r7.bytesLeft()
            if (r8 <= 0) goto L106
            int r8 = r6.bytesRead
            r3 = 3
            if (r8 >= r3) goto Lb1
            if (r8 != 0) goto L44
            int r8 = r7.readUnsignedByte()
            int r4 = r7.getPosition()
            int r4 = r4 - r0
            r7.setPosition(r4)
            r4 = 255(0xff, float:3.57E-43)
            if (r8 != r4) goto L44
            r6.waitingForPayloadStart = r0
            return
        L44:
            int r8 = r7.bytesLeft()
            int r4 = r6.bytesRead
            int r4 = 3 - r4
            int r8 = java.lang.Math.min(r8, r4)
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r6.sectionData
            byte[] r4 = r4.getData()
            int r5 = r6.bytesRead
            r7.readBytes(r4, r5, r8)
            int r4 = r6.bytesRead
            int r4 = r4 + r8
            r6.bytesRead = r4
            if (r4 != r3) goto L24
            com.google.android.exoplayer2.util.ParsableByteArray r8 = r6.sectionData
            r8.setPosition(r1)
            com.google.android.exoplayer2.util.ParsableByteArray r8 = r6.sectionData
            r8.setLimit(r3)
            com.google.android.exoplayer2.util.ParsableByteArray r8 = r6.sectionData
            r8.skipBytes(r0)
            com.google.android.exoplayer2.util.ParsableByteArray r8 = r6.sectionData
            int r8 = r8.readUnsignedByte()
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r6.sectionData
            int r4 = r4.readUnsignedByte()
            r5 = r8 & 128(0x80, float:1.8E-43)
            if (r5 == 0) goto L83
            r5 = 1
            goto L84
        L83:
            r5 = 0
        L84:
            r6.sectionSyntaxIndicator = r5
            r8 = r8 & 15
            int r8 = r8 << 8
            r8 = r8 | r4
            int r8 = r8 + r3
            r6.totalSectionLength = r8
            com.google.android.exoplayer2.util.ParsableByteArray r8 = r6.sectionData
            int r8 = r8.capacity()
            int r3 = r6.totalSectionLength
            if (r8 >= r3) goto L24
            r8 = 4098(0x1002, float:5.743E-42)
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r6.sectionData
            int r4 = r4.capacity()
            int r4 = r4 * 2
            int r3 = java.lang.Math.max(r3, r4)
            int r8 = java.lang.Math.min(r8, r3)
            com.google.android.exoplayer2.util.ParsableByteArray r3 = r6.sectionData
            r3.ensureCapacity(r8)
            goto L24
        Lb1:
            int r8 = r7.bytesLeft()
            int r3 = r6.totalSectionLength
            int r4 = r6.bytesRead
            int r3 = r3 - r4
            int r8 = java.lang.Math.min(r8, r3)
            com.google.android.exoplayer2.util.ParsableByteArray r3 = r6.sectionData
            byte[] r3 = r3.getData()
            int r4 = r6.bytesRead
            r7.readBytes(r3, r4, r8)
            int r3 = r6.bytesRead
            int r3 = r3 + r8
            r6.bytesRead = r3
            int r8 = r6.totalSectionLength
            if (r3 != r8) goto L24
            boolean r3 = r6.sectionSyntaxIndicator
            if (r3 == 0) goto Lf1
            com.google.android.exoplayer2.util.ParsableByteArray r8 = r6.sectionData
            byte[] r8 = r8.getData()
            int r3 = r6.totalSectionLength
            int r8 = com.google.android.exoplayer2.util.Util.crc32(r8, r1, r3, r2)
            if (r8 == 0) goto Le7
            r6.waitingForPayloadStart = r0
            return
        Le7:
            com.google.android.exoplayer2.util.ParsableByteArray r8 = r6.sectionData
            int r3 = r6.totalSectionLength
            int r3 = r3 + (-4)
            r8.setLimit(r3)
            goto Lf6
        Lf1:
            com.google.android.exoplayer2.util.ParsableByteArray r3 = r6.sectionData
            r3.setLimit(r8)
        Lf6:
            com.google.android.exoplayer2.util.ParsableByteArray r8 = r6.sectionData
            r8.setPosition(r1)
            com.google.android.exoplayer2.extractor.ts.SectionPayloadReader r8 = r6.reader
            com.google.android.exoplayer2.util.ParsableByteArray r3 = r6.sectionData
            r8.consume(r3)
            r6.bytesRead = r1
            goto L24
        L106:
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ts.TsPayloadReader
    public void init(com.google.android.exoplayer2.util.TimestampAdjuster r2, com.google.android.exoplayer2.extractor.ExtractorOutput r3, com.google.android.exoplayer2.extractor.ts.TsPayloadReader.TrackIdGenerator r4) {
            r1 = this;
            com.google.android.exoplayer2.extractor.ts.SectionPayloadReader r0 = r1.reader
            r0.init(r2, r3, r4)
            r2 = 1
            r1.waitingForPayloadStart = r2
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ts.TsPayloadReader
    public void seek() {
            r1 = this;
            r0 = 1
            r1.waitingForPayloadStart = r0
            return
    }
}
