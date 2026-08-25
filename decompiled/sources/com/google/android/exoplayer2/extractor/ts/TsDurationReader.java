package com.google.android.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: classes.dex */
final class TsDurationReader {
    private static final java.lang.String TAG = "TsDurationReader";
    private long durationUs;
    private long firstPcrValue;
    private boolean isDurationRead;
    private boolean isFirstPcrValueRead;
    private boolean isLastPcrValueRead;
    private long lastPcrValue;
    private final com.google.android.exoplayer2.util.ParsableByteArray packetBuffer;
    private final com.google.android.exoplayer2.util.TimestampAdjuster pcrTimestampAdjuster;
    private final int timestampSearchBytes;

    public TsDurationReader(int r3) {
            r2 = this;
            r2.<init>()
            r2.timestampSearchBytes = r3
            com.google.android.exoplayer2.util.TimestampAdjuster r3 = new com.google.android.exoplayer2.util.TimestampAdjuster
            r0 = 0
            r3.<init>(r0)
            r2.pcrTimestampAdjuster = r3
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.firstPcrValue = r0
            r2.lastPcrValue = r0
            r2.durationUs = r0
            com.google.android.exoplayer2.util.ParsableByteArray r3 = new com.google.android.exoplayer2.util.ParsableByteArray
            r3.<init>()
            r2.packetBuffer = r3
            return
    }

    private int finishReadDuration(com.google.android.exoplayer2.extractor.ExtractorInput r3) {
            r2 = this;
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r2.packetBuffer
            byte[] r1 = com.google.android.exoplayer2.util.Util.EMPTY_BYTE_ARRAY
            r0.reset(r1)
            r0 = 1
            r2.isDurationRead = r0
            r3.resetPeekPosition()
            r3 = 0
            return r3
    }

    private int readFirstPcrValue(com.google.android.exoplayer2.extractor.ExtractorInput r9, com.google.android.exoplayer2.extractor.PositionHolder r10, int r11) throws java.io.IOException {
            r8 = this;
            int r0 = r8.timestampSearchBytes
            long r0 = (long) r0
            long r2 = r9.getLength()
            long r0 = java.lang.Math.min(r0, r2)
            int r1 = (int) r0
            long r2 = r9.getPosition()
            r0 = 0
            long r4 = (long) r0
            r6 = 1
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 == 0) goto L1a
            r10.position = r4
            return r6
        L1a:
            com.google.android.exoplayer2.util.ParsableByteArray r10 = r8.packetBuffer
            r10.reset(r1)
            r9.resetPeekPosition()
            com.google.android.exoplayer2.util.ParsableByteArray r10 = r8.packetBuffer
            byte[] r10 = r10.getData()
            r9.peekFully(r10, r0, r1)
            com.google.android.exoplayer2.util.ParsableByteArray r9 = r8.packetBuffer
            long r9 = r8.readFirstPcrValueFromBuffer(r9, r11)
            r8.firstPcrValue = r9
            r8.isFirstPcrValueRead = r6
            return r0
    }

    private long readFirstPcrValueFromBuffer(com.google.android.exoplayer2.util.ParsableByteArray r8, int r9) {
            r7 = this;
            int r0 = r8.getPosition()
            int r1 = r8.limit()
        L8:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 >= r1) goto L26
            byte[] r4 = r8.getData()
            r4 = r4[r0]
            r5 = 71
            if (r4 == r5) goto L1a
            goto L23
        L1a:
            long r4 = com.google.android.exoplayer2.extractor.ts.TsUtil.readPcrFromPacket(r8, r0, r9)
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L23
            return r4
        L23:
            int r0 = r0 + 1
            goto L8
        L26:
            return r2
    }

    private int readLastPcrValue(com.google.android.exoplayer2.extractor.ExtractorInput r8, com.google.android.exoplayer2.extractor.PositionHolder r9, int r10) throws java.io.IOException {
            r7 = this;
            long r0 = r8.getLength()
            int r2 = r7.timestampSearchBytes
            long r2 = (long) r2
            long r2 = java.lang.Math.min(r2, r0)
            int r3 = (int) r2
            long r4 = (long) r3
            long r0 = r0 - r4
            long r4 = r8.getPosition()
            r2 = 1
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 == 0) goto L1a
            r9.position = r0
            return r2
        L1a:
            com.google.android.exoplayer2.util.ParsableByteArray r9 = r7.packetBuffer
            r9.reset(r3)
            r8.resetPeekPosition()
            com.google.android.exoplayer2.util.ParsableByteArray r9 = r7.packetBuffer
            byte[] r9 = r9.getData()
            r0 = 0
            r8.peekFully(r9, r0, r3)
            com.google.android.exoplayer2.util.ParsableByteArray r8 = r7.packetBuffer
            long r8 = r7.readLastPcrValueFromBuffer(r8, r10)
            r7.lastPcrValue = r8
            r7.isLastPcrValueRead = r2
            return r0
    }

    private long readLastPcrValueFromBuffer(com.google.android.exoplayer2.util.ParsableByteArray r9, int r10) {
            r8 = this;
            int r0 = r9.getPosition()
            int r1 = r9.limit()
            int r2 = r1 + (-188)
        La:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 < r0) goto L28
            byte[] r5 = r9.getData()
            boolean r5 = com.google.android.exoplayer2.extractor.ts.TsUtil.isStartOfTsPacket(r5, r0, r1, r2)
            if (r5 != 0) goto L1c
            goto L25
        L1c:
            long r5 = com.google.android.exoplayer2.extractor.ts.TsUtil.readPcrFromPacket(r9, r2, r10)
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L25
            return r5
        L25:
            int r2 = r2 + (-1)
            goto La
        L28:
            return r3
    }

    public long getDurationUs() {
            r2 = this;
            long r0 = r2.durationUs
            return r0
    }

    public com.google.android.exoplayer2.util.TimestampAdjuster getPcrTimestampAdjuster() {
            r1 = this;
            com.google.android.exoplayer2.util.TimestampAdjuster r0 = r1.pcrTimestampAdjuster
            return r0
    }

    public boolean isDurationReadFinished() {
            r1 = this;
            boolean r0 = r1.isDurationRead
            return r0
    }

    public int readDuration(com.google.android.exoplayer2.extractor.ExtractorInput r7, com.google.android.exoplayer2.extractor.PositionHolder r8, int r9) throws java.io.IOException {
            r6 = this;
            if (r9 > 0) goto L7
            int r7 = r6.finishReadDuration(r7)
            return r7
        L7:
            boolean r0 = r6.isLastPcrValueRead
            if (r0 != 0) goto L10
            int r7 = r6.readLastPcrValue(r7, r8, r9)
            return r7
        L10:
            long r0 = r6.lastPcrValue
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L20
            int r7 = r6.finishReadDuration(r7)
            return r7
        L20:
            boolean r0 = r6.isFirstPcrValueRead
            if (r0 != 0) goto L29
            int r7 = r6.readFirstPcrValue(r7, r8, r9)
            return r7
        L29:
            long r8 = r6.firstPcrValue
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 != 0) goto L34
            int r7 = r6.finishReadDuration(r7)
            return r7
        L34:
            com.google.android.exoplayer2.util.TimestampAdjuster r0 = r6.pcrTimestampAdjuster
            long r8 = r0.adjustTsTimestamp(r8)
            com.google.android.exoplayer2.util.TimestampAdjuster r0 = r6.pcrTimestampAdjuster
            long r4 = r6.lastPcrValue
            long r0 = r0.adjustTsTimestamp(r4)
            long r0 = r0 - r8
            r6.durationUs = r0
            r8 = 0
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 >= 0) goto L66
            java.lang.String r8 = "Invalid duration: "
            java.lang.StringBuilder r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r8)
            long r0 = r6.durationUs
            r8.append(r0)
            java.lang.String r9 = ". Using TIME_UNSET instead."
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "TsDurationReader"
            com.google.android.exoplayer2.util.Log.w(r9, r8)
            r6.durationUs = r2
        L66:
            int r7 = r6.finishReadDuration(r7)
            return r7
    }
}
