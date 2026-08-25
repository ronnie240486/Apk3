package com.google.android.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: classes2.dex */
final class PsDurationReader {
    private static final java.lang.String TAG = "PsDurationReader";
    private static final int TIMESTAMP_SEARCH_BYTES = 20000;
    private long durationUs;
    private long firstScrValue;
    private boolean isDurationRead;
    private boolean isFirstScrValueRead;
    private boolean isLastScrValueRead;
    private long lastScrValue;
    private final com.google.android.exoplayer2.util.ParsableByteArray packetBuffer;
    private final com.google.android.exoplayer2.util.TimestampAdjuster scrTimestampAdjuster;

    public PsDurationReader() {
            r3 = this;
            r3.<init>()
            com.google.android.exoplayer2.util.TimestampAdjuster r0 = new com.google.android.exoplayer2.util.TimestampAdjuster
            r1 = 0
            r0.<init>(r1)
            r3.scrTimestampAdjuster = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.firstScrValue = r0
            r3.lastScrValue = r0
            r3.durationUs = r0
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            r0.<init>()
            r3.packetBuffer = r0
            return
    }

    private static boolean checkMarkerBits(byte[] r3) {
            r0 = 0
            r1 = r3[r0]
            r1 = r1 & 196(0xc4, float:2.75E-43)
            r2 = 68
            if (r1 == r2) goto La
            return r0
        La:
            r1 = 2
            r1 = r3[r1]
            r2 = 4
            r1 = r1 & r2
            if (r1 == r2) goto L12
            return r0
        L12:
            r1 = r3[r2]
            r1 = r1 & r2
            if (r1 == r2) goto L18
            return r0
        L18:
            r1 = 5
            r1 = r3[r1]
            r2 = 1
            r1 = r1 & r2
            if (r1 == r2) goto L20
            return r0
        L20:
            r1 = 8
            r3 = r3[r1]
            r1 = 3
            r3 = r3 & r1
            if (r3 != r1) goto L29
            r0 = 1
        L29:
            return r0
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

    private int peekIntAtPosition(byte[] r3, int r4) {
            r2 = this;
            r0 = r3[r4]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 24
            int r1 = r4 + 1
            r1 = r3[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            int r1 = r4 + 2
            r1 = r3[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            int r4 = r4 + 3
            r3 = r3[r4]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r3 = r3 | r0
            return r3
    }

    private int readFirstScrValue(com.google.android.exoplayer2.extractor.ExtractorInput r9, com.google.android.exoplayer2.extractor.PositionHolder r10) throws java.io.IOException {
            r8 = this;
            long r0 = r9.getLength()
            r2 = 20000(0x4e20, double:9.8813E-320)
            long r0 = java.lang.Math.min(r2, r0)
            int r1 = (int) r0
            long r2 = r9.getPosition()
            r0 = 0
            long r4 = (long) r0
            r6 = 1
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 == 0) goto L19
            r10.position = r4
            return r6
        L19:
            com.google.android.exoplayer2.util.ParsableByteArray r10 = r8.packetBuffer
            r10.reset(r1)
            r9.resetPeekPosition()
            com.google.android.exoplayer2.util.ParsableByteArray r10 = r8.packetBuffer
            byte[] r10 = r10.getData()
            r9.peekFully(r10, r0, r1)
            com.google.android.exoplayer2.util.ParsableByteArray r9 = r8.packetBuffer
            long r9 = r8.readFirstScrValueFromBuffer(r9)
            r8.firstScrValue = r9
            r8.isFirstScrValueRead = r6
            return r0
    }

    private long readFirstScrValueFromBuffer(com.google.android.exoplayer2.util.ParsableByteArray r8) {
            r7 = this;
            int r0 = r8.getPosition()
            int r1 = r8.limit()
        L8:
            int r2 = r1 + (-3)
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 >= r2) goto L2e
            byte[] r2 = r8.getData()
            int r2 = r7.peekIntAtPosition(r2, r0)
            r5 = 442(0x1ba, float:6.2E-43)
            if (r2 != r5) goto L2b
            int r2 = r0 + 4
            r8.setPosition(r2)
            long r5 = readScrValueFromPack(r8)
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L2b
            return r5
        L2b:
            int r0 = r0 + 1
            goto L8
        L2e:
            return r3
    }

    private int readLastScrValue(com.google.android.exoplayer2.extractor.ExtractorInput r8, com.google.android.exoplayer2.extractor.PositionHolder r9) throws java.io.IOException {
            r7 = this;
            long r0 = r8.getLength()
            r2 = 20000(0x4e20, double:9.8813E-320)
            long r2 = java.lang.Math.min(r2, r0)
            int r3 = (int) r2
            long r4 = (long) r3
            long r0 = r0 - r4
            long r4 = r8.getPosition()
            r2 = 1
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 == 0) goto L19
            r9.position = r0
            return r2
        L19:
            com.google.android.exoplayer2.util.ParsableByteArray r9 = r7.packetBuffer
            r9.reset(r3)
            r8.resetPeekPosition()
            com.google.android.exoplayer2.util.ParsableByteArray r9 = r7.packetBuffer
            byte[] r9 = r9.getData()
            r0 = 0
            r8.peekFully(r9, r0, r3)
            com.google.android.exoplayer2.util.ParsableByteArray r8 = r7.packetBuffer
            long r8 = r7.readLastScrValueFromBuffer(r8)
            r7.lastScrValue = r8
            r7.isLastScrValueRead = r2
            return r0
    }

    private long readLastScrValueFromBuffer(com.google.android.exoplayer2.util.ParsableByteArray r8) {
            r7 = this;
            int r0 = r8.getPosition()
            int r1 = r8.limit()
            int r1 = r1 + (-4)
        La:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 < r0) goto L2e
            byte[] r4 = r8.getData()
            int r4 = r7.peekIntAtPosition(r4, r1)
            r5 = 442(0x1ba, float:6.2E-43)
            if (r4 != r5) goto L2b
            int r4 = r1 + 4
            r8.setPosition(r4)
            long r4 = readScrValueFromPack(r8)
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L2b
            return r4
        L2b:
            int r1 = r1 + (-1)
            goto La
        L2e:
            return r2
    }

    public static long readScrValueFromPack(com.google.android.exoplayer2.util.ParsableByteArray r6) {
            int r0 = r6.getPosition()
            int r1 = r6.bytesLeft()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = 9
            if (r1 >= r4) goto L12
            return r2
        L12:
            byte[] r1 = new byte[r4]
            r5 = 0
            r6.readBytes(r1, r5, r4)
            r6.setPosition(r0)
            boolean r6 = checkMarkerBits(r1)
            if (r6 != 0) goto L22
            return r2
        L22:
            long r0 = readScrValueFromPackHeader(r1)
            return r0
    }

    private static long readScrValueFromPackHeader(byte[] r13) {
            r0 = 0
            r1 = r13[r0]
            long r1 = (long) r1
            r3 = 56
            long r1 = r1 & r3
            r3 = 3
            long r1 = r1 >> r3
            r4 = 30
            long r1 = r1 << r4
            r0 = r13[r0]
            long r4 = (long) r0
            r6 = 3
            long r4 = r4 & r6
            r0 = 28
            long r4 = r4 << r0
            long r0 = r1 | r4
            r2 = 1
            r2 = r13[r2]
            long r4 = (long) r2
            r8 = 255(0xff, double:1.26E-321)
            long r4 = r4 & r8
            r2 = 20
            long r4 = r4 << r2
            long r0 = r0 | r4
            r2 = 2
            r4 = r13[r2]
            long r4 = (long) r4
            r10 = 248(0xf8, double:1.225E-321)
            long r4 = r4 & r10
            long r4 = r4 >> r3
            r12 = 15
            long r4 = r4 << r12
            long r0 = r0 | r4
            r2 = r13[r2]
            long r4 = (long) r2
            long r4 = r4 & r6
            r2 = 13
            long r4 = r4 << r2
            long r0 = r0 | r4
            r2 = r13[r3]
            long r4 = (long) r2
            long r4 = r4 & r8
            r2 = 5
            long r4 = r4 << r2
            long r0 = r0 | r4
            r2 = 4
            r13 = r13[r2]
            long r4 = (long) r13
            long r4 = r4 & r10
            long r2 = r4 >> r3
            long r0 = r0 | r2
            return r0
    }

    public long getDurationUs() {
            r2 = this;
            long r0 = r2.durationUs
            return r0
    }

    public com.google.android.exoplayer2.util.TimestampAdjuster getScrTimestampAdjuster() {
            r1 = this;
            com.google.android.exoplayer2.util.TimestampAdjuster r0 = r1.scrTimestampAdjuster
            return r0
    }

    public boolean isDurationReadFinished() {
            r1 = this;
            boolean r0 = r1.isDurationRead
            return r0
    }

    public int readDuration(com.google.android.exoplayer2.extractor.ExtractorInput r7, com.google.android.exoplayer2.extractor.PositionHolder r8) throws java.io.IOException {
            r6 = this;
            boolean r0 = r6.isLastScrValueRead
            if (r0 != 0) goto L9
            int r7 = r6.readLastScrValue(r7, r8)
            return r7
        L9:
            long r0 = r6.lastScrValue
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L19
            int r7 = r6.finishReadDuration(r7)
            return r7
        L19:
            boolean r0 = r6.isFirstScrValueRead
            if (r0 != 0) goto L22
            int r7 = r6.readFirstScrValue(r7, r8)
            return r7
        L22:
            long r0 = r6.firstScrValue
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 != 0) goto L2d
            int r7 = r6.finishReadDuration(r7)
            return r7
        L2d:
            com.google.android.exoplayer2.util.TimestampAdjuster r8 = r6.scrTimestampAdjuster
            long r0 = r8.adjustTsTimestamp(r0)
            com.google.android.exoplayer2.util.TimestampAdjuster r8 = r6.scrTimestampAdjuster
            long r4 = r6.lastScrValue
            long r4 = r8.adjustTsTimestamp(r4)
            long r4 = r4 - r0
            r6.durationUs = r4
            r0 = 0
            int r8 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r8 >= 0) goto L5f
            java.lang.String r8 = "Invalid duration: "
            java.lang.StringBuilder r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r8)
            long r0 = r6.durationUs
            r8.append(r0)
            java.lang.String r0 = ". Using TIME_UNSET instead."
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            java.lang.String r0 = "PsDurationReader"
            com.google.android.exoplayer2.util.Log.w(r0, r8)
            r6.durationUs = r2
        L5f:
            int r7 = r6.finishReadDuration(r7)
            return r7
    }
}
