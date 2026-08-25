package com.google.android.exoplayer2.extractor.mp3;

/* JADX INFO: loaded from: classes.dex */
final class VbriSeeker implements com.google.android.exoplayer2.extractor.mp3.Seeker {
    private static final java.lang.String TAG = "VbriSeeker";
    private final long dataEndPosition;
    private final long durationUs;
    private final long[] positions;
    private final long[] timesUs;

    private VbriSeeker(long[] r1, long[] r2, long r3, long r5) {
            r0 = this;
            r0.<init>()
            r0.timesUs = r1
            r0.positions = r2
            r0.durationUs = r3
            r0.dataEndPosition = r5
            return
    }

    @androidx.annotation.Nullable
    public static com.google.android.exoplayer2.extractor.mp3.VbriSeeker create(long r24, long r26, com.google.android.exoplayer2.audio.MpegAudioUtil.Header r28, com.google.android.exoplayer2.util.ParsableByteArray r29) {
            r0 = r24
            r2 = r28
            r3 = r29
            r4 = 10
            r3.skipBytes(r4)
            int r4 = r29.readInt()
            r5 = 0
            if (r4 > 0) goto L13
            return r5
        L13:
            int r6 = r2.sampleRate
            long r7 = (long) r4
            r9 = 1000000(0xf4240, double:4.940656E-318)
            r4 = 32000(0x7d00, float:4.4842E-41)
            if (r6 < r4) goto L20
            r4 = 1152(0x480, float:1.614E-42)
            goto L22
        L20:
            r4 = 576(0x240, float:8.07E-43)
        L22:
            long r11 = (long) r4
            long r9 = r9 * r11
            long r11 = (long) r6
            long r16 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r7, r9, r11)
            int r4 = r29.readUnsignedShort()
            int r6 = r29.readUnsignedShort()
            int r7 = r29.readUnsignedShort()
            r8 = 2
            r3.skipBytes(r8)
            int r2 = r2.frameSize
            long r9 = (long) r2
            long r9 = r26 + r9
            long[] r14 = new long[r4]
            long[] r15 = new long[r4]
            r2 = 0
            r11 = r26
        L46:
            if (r2 >= r4) goto L96
            r18 = r6
            long r5 = (long) r2
            long r5 = r5 * r16
            r20 = r9
            long r8 = (long) r4
            long r5 = r5 / r8
            r14[r2] = r5
            r5 = r20
            long r8 = java.lang.Math.max(r11, r5)
            r15[r2] = r8
            r8 = 1
            if (r7 == r8) goto L7b
            r8 = 2
            if (r7 == r8) goto L75
            r9 = 3
            if (r7 == r9) goto L6f
            r9 = 4
            if (r7 == r9) goto L69
            r9 = 0
            return r9
        L69:
            r9 = 0
            int r10 = r29.readUnsignedIntToInt()
            goto L81
        L6f:
            r9 = 0
            int r10 = r29.readUnsignedInt24()
            goto L81
        L75:
            r9 = 0
            int r10 = r29.readUnsignedShort()
            goto L81
        L7b:
            r8 = 2
            r9 = 0
            int r10 = r29.readUnsignedByte()
        L81:
            long r8 = (long) r10
            r10 = r18
            r18 = r14
            long r13 = (long) r10
            long r8 = r8 * r13
            long r11 = r11 + r8
            int r2 = r2 + 1
            r14 = r18
            r8 = 2
            r22 = r5
            r6 = r10
            r9 = r22
            r5 = 0
            goto L46
        L96:
            r18 = r14
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lc0
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 == 0) goto Lc0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "VBRI data size mismatch: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ", "
            r2.append(r0)
            r2.append(r11)
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = "VbriSeeker"
            com.google.android.exoplayer2.util.Log.w(r1, r0)
        Lc0:
            com.google.android.exoplayer2.extractor.mp3.VbriSeeker r0 = new com.google.android.exoplayer2.extractor.mp3.VbriSeeker
            r13 = r0
            r14 = r18
            r18 = r11
            r13.<init>(r14, r15, r16, r18)
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
    public com.google.android.exoplayer2.extractor.SeekMap.SeekPoints getSeekPoints(long r9) {
            r8 = this;
            long[] r0 = r8.timesUs
            r1 = 1
            int r0 = com.google.android.exoplayer2.util.Util.binarySearchFloor(r0, r9, r1, r1)
            com.google.android.exoplayer2.extractor.SeekPoint r2 = new com.google.android.exoplayer2.extractor.SeekPoint
            long[] r3 = r8.timesUs
            r4 = r3[r0]
            long[] r3 = r8.positions
            r6 = r3[r0]
            r2.<init>(r4, r6)
            long r3 = r2.timeUs
            int r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r5 >= 0) goto L35
            long[] r9 = r8.timesUs
            int r9 = r9.length
            int r9 = r9 - r1
            if (r0 != r9) goto L21
            goto L35
        L21:
            com.google.android.exoplayer2.extractor.SeekPoint r9 = new com.google.android.exoplayer2.extractor.SeekPoint
            long[] r10 = r8.timesUs
            int r0 = r0 + r1
            r3 = r10[r0]
            long[] r10 = r8.positions
            r0 = r10[r0]
            r9.<init>(r3, r0)
            com.google.android.exoplayer2.extractor.SeekMap$SeekPoints r10 = new com.google.android.exoplayer2.extractor.SeekMap$SeekPoints
            r10.<init>(r2, r9)
            return r10
        L35:
            com.google.android.exoplayer2.extractor.SeekMap$SeekPoints r9 = new com.google.android.exoplayer2.extractor.SeekMap$SeekPoints
            r9.<init>(r2)
            return r9
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getTimeUs(long r4) {
            r3 = this;
            long[] r0 = r3.timesUs
            long[] r1 = r3.positions
            r2 = 1
            int r4 = com.google.android.exoplayer2.util.Util.binarySearchFloor(r1, r4, r2, r2)
            r4 = r0[r4]
            return r4
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
            r1 = this;
            r0 = 1
            return r0
    }
}
