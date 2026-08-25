package com.google.android.exoplayer2.metadata.scte35;

/* JADX INFO: loaded from: classes2.dex */
public final class SpliceInfoDecoder extends com.google.android.exoplayer2.metadata.SimpleMetadataDecoder {
    private static final int TYPE_PRIVATE_COMMAND = 255;
    private static final int TYPE_SPLICE_INSERT = 5;
    private static final int TYPE_SPLICE_NULL = 0;
    private static final int TYPE_SPLICE_SCHEDULE = 4;
    private static final int TYPE_TIME_SIGNAL = 6;
    private final com.google.android.exoplayer2.util.ParsableByteArray sectionData;
    private final com.google.android.exoplayer2.util.ParsableBitArray sectionHeader;
    private com.google.android.exoplayer2.util.TimestampAdjuster timestampAdjuster;

    public SpliceInfoDecoder() {
            r1 = this;
            r1.<init>()
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            r0.<init>()
            r1.sectionData = r0
            com.google.android.exoplayer2.util.ParsableBitArray r0 = new com.google.android.exoplayer2.util.ParsableBitArray
            r0.<init>()
            r1.sectionHeader = r0
            return
    }

    @Override // com.google.android.exoplayer2.metadata.SimpleMetadataDecoder
    public final com.google.android.exoplayer2.metadata.Metadata decode(com.google.android.exoplayer2.metadata.MetadataInputBuffer r7, java.nio.ByteBuffer r8) {
            r6 = this;
            com.google.android.exoplayer2.util.TimestampAdjuster r0 = r6.timestampAdjuster
            if (r0 == 0) goto Le
            long r1 = r7.subsampleOffsetUs
            long r3 = r0.getTimestampOffsetUs()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L1f
        Le:
            com.google.android.exoplayer2.util.TimestampAdjuster r0 = new com.google.android.exoplayer2.util.TimestampAdjuster
            long r1 = r7.timeUs
            r0.<init>(r1)
            r6.timestampAdjuster = r0
            long r1 = r7.timeUs
            long r3 = r7.subsampleOffsetUs
            long r1 = r1 - r3
            r0.adjustSampleTimestamp(r1)
        L1f:
            byte[] r7 = r8.array()
            int r8 = r8.limit()
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r6.sectionData
            r0.reset(r7, r8)
            com.google.android.exoplayer2.util.ParsableBitArray r0 = r6.sectionHeader
            r0.reset(r7, r8)
            com.google.android.exoplayer2.util.ParsableBitArray r7 = r6.sectionHeader
            r8 = 39
            r7.skipBits(r8)
            com.google.android.exoplayer2.util.ParsableBitArray r7 = r6.sectionHeader
            r8 = 1
            int r7 = r7.readBits(r8)
            long r0 = (long) r7
            r7 = 32
            long r0 = r0 << r7
            com.google.android.exoplayer2.util.ParsableBitArray r2 = r6.sectionHeader
            int r7 = r2.readBits(r7)
            long r2 = (long) r7
            long r0 = r0 | r2
            com.google.android.exoplayer2.util.ParsableBitArray r7 = r6.sectionHeader
            r2 = 20
            r7.skipBits(r2)
            com.google.android.exoplayer2.util.ParsableBitArray r7 = r6.sectionHeader
            r2 = 12
            int r7 = r7.readBits(r2)
            com.google.android.exoplayer2.util.ParsableBitArray r2 = r6.sectionHeader
            r3 = 8
            int r2 = r2.readBits(r3)
            r3 = 0
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r6.sectionData
            r5 = 14
            r4.skipBytes(r5)
            if (r2 == 0) goto L9a
            r4 = 255(0xff, float:3.57E-43)
            if (r2 == r4) goto L93
            r7 = 4
            if (r2 == r7) goto L8c
            r7 = 5
            if (r2 == r7) goto L83
            r7 = 6
            if (r2 == r7) goto L7a
            goto L9f
        L7a:
            com.google.android.exoplayer2.util.ParsableByteArray r7 = r6.sectionData
            com.google.android.exoplayer2.util.TimestampAdjuster r2 = r6.timestampAdjuster
            com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand r3 = com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand.parseFromSection(r7, r0, r2)
            goto L9f
        L83:
            com.google.android.exoplayer2.util.ParsableByteArray r7 = r6.sectionData
            com.google.android.exoplayer2.util.TimestampAdjuster r2 = r6.timestampAdjuster
            com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand r3 = com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand.parseFromSection(r7, r0, r2)
            goto L9f
        L8c:
            com.google.android.exoplayer2.util.ParsableByteArray r7 = r6.sectionData
            com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand r3 = com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand.parseFromSection(r7)
            goto L9f
        L93:
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r6.sectionData
            com.google.android.exoplayer2.metadata.scte35.PrivateCommand r3 = com.google.android.exoplayer2.metadata.scte35.PrivateCommand.parseFromSection(r2, r7, r0)
            goto L9f
        L9a:
            com.google.android.exoplayer2.metadata.scte35.SpliceNullCommand r3 = new com.google.android.exoplayer2.metadata.scte35.SpliceNullCommand
            r3.<init>()
        L9f:
            r7 = 0
            if (r3 != 0) goto Laa
            com.google.android.exoplayer2.metadata.Metadata r8 = new com.google.android.exoplayer2.metadata.Metadata
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r7 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r7]
            r8.<init>(r7)
            goto Lb4
        Laa:
            com.google.android.exoplayer2.metadata.Metadata r0 = new com.google.android.exoplayer2.metadata.Metadata
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r8 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r8]
            r8[r7] = r3
            r0.<init>(r8)
            r8 = r0
        Lb4:
            return r8
    }
}
