package com.google.android.exoplayer2.extractor.mp3;

/* JADX INFO: loaded from: classes.dex */
final class XingSeeker implements com.google.android.exoplayer2.extractor.mp3.Seeker {
    private static final java.lang.String TAG = "XingSeeker";
    private final long dataEndPosition;
    private final long dataSize;
    private final long dataStartPosition;
    private final long durationUs;

    @androidx.annotation.Nullable
    private final long[] tableOfContents;
    private final int xingFrameSize;

    private XingSeeker(long r10, int r12, long r13) {
            r9 = this;
            r6 = -1
            r8 = 0
            r0 = r9
            r1 = r10
            r3 = r12
            r4 = r13
            r0.<init>(r1, r3, r4, r6, r8)
            return
    }

    private XingSeeker(long r1, int r3, long r4, long r6, @androidx.annotation.Nullable long[] r8) {
            r0 = this;
            r0.<init>()
            r0.dataStartPosition = r1
            r0.xingFrameSize = r3
            r0.durationUs = r4
            r0.tableOfContents = r8
            r0.dataSize = r6
            r3 = -1
            int r5 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r5 != 0) goto L14
            goto L16
        L14:
            long r3 = r1 + r6
        L16:
            r0.dataEndPosition = r3
            return
    }

    @androidx.annotation.Nullable
    public static com.google.android.exoplayer2.extractor.mp3.XingSeeker create(long r22, long r24, com.google.android.exoplayer2.audio.MpegAudioUtil.Header r26, com.google.android.exoplayer2.util.ParsableByteArray r27) {
            r0 = r22
            r2 = r26
            int r3 = r2.samplesPerFrame
            int r4 = r2.sampleRate
            int r5 = r27.readInt()
            r6 = r5 & 1
            r7 = 1
            if (r6 != r7) goto L84
            int r6 = r27.readUnsignedIntToInt()
            if (r6 != 0) goto L18
            goto L84
        L18:
            long r7 = (long) r6
            long r9 = (long) r3
            r11 = 1000000(0xf4240, double:4.940656E-318)
            long r9 = r9 * r11
            long r11 = (long) r4
            long r17 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r7, r9, r11)
            r3 = 6
            r4 = r5 & 6
            if (r4 == r3) goto L36
            com.google.android.exoplayer2.extractor.mp3.XingSeeker r0 = new com.google.android.exoplayer2.extractor.mp3.XingSeeker
            int r1 = r2.frameSize
            r13 = r0
            r14 = r24
            r16 = r1
            r13.<init>(r14, r16, r17)
            return r0
        L36:
            long r19 = r27.readUnsignedInt()
            r3 = 100
            long[] r4 = new long[r3]
            r5 = 0
        L3f:
            if (r5 >= r3) goto L4b
            int r6 = r27.readUnsignedByte()
            long r6 = (long) r6
            r4[r5] = r6
            int r5 = r5 + 1
            goto L3f
        L4b:
            r5 = -1
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 == 0) goto L75
            long r5 = r24 + r19
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 == 0) goto L75
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = "XING data size mismatch: "
            r3.append(r7)
            r3.append(r0)
            java.lang.String r0 = ", "
            r3.append(r0)
            r3.append(r5)
            java.lang.String r0 = r3.toString()
            java.lang.String r1 = "XingSeeker"
            com.google.android.exoplayer2.util.Log.w(r1, r0)
        L75:
            com.google.android.exoplayer2.extractor.mp3.XingSeeker r0 = new com.google.android.exoplayer2.extractor.mp3.XingSeeker
            int r1 = r2.frameSize
            r13 = r0
            r14 = r24
            r16 = r1
            r21 = r4
            r13.<init>(r14, r16, r17, r19, r21)
            return r0
        L84:
            r0 = 0
            return r0
    }

    private long getTimeUsForTableIndex(int r5) {
            r4 = this;
            long r0 = r4.durationUs
            long r2 = (long) r5
            long r0 = r0 * r2
            r2 = 100
            long r0 = r0 / r2
            return r0
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getDataEndPosition() {
            r2 = this;
            long r0 = r2.dataEndPosition
            return r0
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
            r2 = this;
            long r0 = r2.durationUs
            return r0
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public com.google.android.exoplayer2.extractor.SeekMap.SeekPoints getSeekPoints(long r13) {
            r12 = this;
            boolean r0 = r12.isSeekable()
            if (r0 != 0) goto L19
            com.google.android.exoplayer2.extractor.SeekMap$SeekPoints r13 = new com.google.android.exoplayer2.extractor.SeekMap$SeekPoints
            com.google.android.exoplayer2.extractor.SeekPoint r14 = new com.google.android.exoplayer2.extractor.SeekPoint
            r0 = 0
            long r2 = r12.dataStartPosition
            int r4 = r12.xingFrameSize
            long r4 = (long) r4
            long r2 = r2 + r4
            r14.<init>(r0, r2)
            r13.<init>(r14)
            return r13
        L19:
            r6 = 0
            long r8 = r12.durationUs
            r4 = r13
            long r13 = com.google.android.exoplayer2.util.Util.constrainValue(r4, r6, r8)
            double r0 = (double) r13
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r0 * r2
            long r4 = r12.durationUs
            double r4 = (double) r4
            double r0 = r0 / r4
            r4 = 0
            r6 = 4643211215818981376(0x4070000000000000, double:256.0)
            int r8 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r8 > 0) goto L34
            goto L57
        L34:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L3a
            r4 = r6
            goto L57
        L3a:
            int r2 = (int) r0
            long[] r3 = r12.tableOfContents
            java.lang.Object r3 = com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r3)
            long[] r3 = (long[]) r3
            r4 = r3[r2]
            double r4 = (double) r4
            r8 = 99
            if (r2 != r8) goto L4c
            r8 = r6
            goto L51
        L4c:
            int r8 = r2 + 1
            r8 = r3[r8]
            double r8 = (double) r8
        L51:
            double r2 = (double) r2
            double r0 = r0 - r2
            double r8 = r8 - r4
            double r8 = r8 * r0
            double r4 = r4 + r8
        L57:
            double r4 = r4 / r6
            long r0 = r12.dataSize
            double r0 = (double) r0
            double r4 = r4 * r0
            long r6 = java.lang.Math.round(r4)
            int r0 = r12.xingFrameSize
            long r8 = (long) r0
            long r0 = r12.dataSize
            r2 = 1
            long r10 = r0 - r2
            long r0 = com.google.android.exoplayer2.util.Util.constrainValue(r6, r8, r10)
            com.google.android.exoplayer2.extractor.SeekMap$SeekPoints r2 = new com.google.android.exoplayer2.extractor.SeekMap$SeekPoints
            com.google.android.exoplayer2.extractor.SeekPoint r3 = new com.google.android.exoplayer2.extractor.SeekPoint
            long r4 = r12.dataStartPosition
            long r4 = r4 + r0
            r3.<init>(r13, r4)
            r2.<init>(r3)
            return r2
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getTimeUs(long r12) {
            r11 = this;
            long r0 = r11.dataStartPosition
            long r12 = r12 - r0
            boolean r0 = r11.isSeekable()
            if (r0 == 0) goto L54
            int r0 = r11.xingFrameSize
            long r0 = (long) r0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 > 0) goto L11
            goto L54
        L11:
            long[] r0 = r11.tableOfContents
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
            long[] r0 = (long[]) r0
            double r12 = (double) r12
            r1 = 4643211215818981376(0x4070000000000000, double:256.0)
            double r12 = r12 * r1
            long r1 = r11.dataSize
            double r1 = (double) r1
            double r12 = r12 / r1
            long r1 = (long) r12
            r3 = 1
            int r1 = com.google.android.exoplayer2.util.Util.binarySearchFloor(r0, r1, r3, r3)
            long r2 = r11.getTimeUsForTableIndex(r1)
            r4 = r0[r1]
            int r6 = r1 + 1
            long r7 = r11.getTimeUsForTableIndex(r6)
            r9 = 99
            if (r1 != r9) goto L3b
            r0 = 256(0x100, double:1.265E-321)
            goto L3e
        L3b:
            r9 = r0[r6]
            r0 = r9
        L3e:
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 != 0) goto L45
            r12 = 0
            goto L4a
        L45:
            double r9 = (double) r4
            double r12 = r12 - r9
            long r0 = r0 - r4
            double r0 = (double) r0
            double r12 = r12 / r0
        L4a:
            long r7 = r7 - r2
            double r0 = (double) r7
            double r12 = r12 * r0
            long r12 = java.lang.Math.round(r12)
            long r12 = r12 + r2
            return r12
        L54:
            r12 = 0
            return r12
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
            r1 = this;
            long[] r0 = r1.tableOfContents
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }
}
