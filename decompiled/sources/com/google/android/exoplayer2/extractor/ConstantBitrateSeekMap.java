package com.google.android.exoplayer2.extractor;

/* JADX INFO: loaded from: classes2.dex */
public class ConstantBitrateSeekMap implements com.google.android.exoplayer2.extractor.SeekMap {
    private final boolean allowSeeksIfLengthUnknown;
    private final int bitrate;
    private final long dataSize;
    private final long durationUs;
    private final long firstFrameBytePosition;
    private final int frameSize;
    private final long inputLength;

    public ConstantBitrateSeekMap(long r9, long r11, int r13, int r14) {
            r8 = this;
            r7 = 0
            r0 = r8
            r1 = r9
            r3 = r11
            r5 = r13
            r6 = r14
            r0.<init>(r1, r3, r5, r6, r7)
            return
    }

    public ConstantBitrateSeekMap(long r2, long r4, int r6, int r7, boolean r8) {
            r1 = this;
            r1.<init>()
            r1.inputLength = r2
            r1.firstFrameBytePosition = r4
            r0 = -1
            if (r7 != r0) goto Lb
            r7 = 1
        Lb:
            r1.frameSize = r7
            r1.bitrate = r6
            r1.allowSeeksIfLengthUnknown = r8
            r7 = -1
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 != 0) goto L21
            r1.dataSize = r7
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.durationUs = r2
            goto L2b
        L21:
            long r7 = r2 - r4
            r1.dataSize = r7
            long r2 = getTimeUsAtPosition(r2, r4, r6)
            r1.durationUs = r2
        L2b:
            return
    }

    private long getFramePositionForTimeUs(long r7) {
            r6 = this;
            int r0 = r6.bitrate
            long r0 = (long) r0
            long r7 = r7 * r0
            r0 = 8000000(0x7a1200, double:3.952525E-317)
            long r7 = r7 / r0
            int r0 = r6.frameSize
            long r1 = (long) r0
            long r7 = r7 / r1
            long r1 = (long) r0
            long r7 = r7 * r1
            long r1 = r6.dataSize
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L1e
            long r3 = (long) r0
            long r1 = r1 - r3
            long r7 = java.lang.Math.min(r7, r1)
        L1e:
            r0 = 0
            long r7 = java.lang.Math.max(r7, r0)
            long r0 = r6.firstFrameBytePosition
            long r0 = r0 + r7
            return r0
    }

    private static long getTimeUsAtPosition(long r0, long r2, int r4) {
            long r0 = r0 - r2
            r2 = 0
            long r0 = java.lang.Math.max(r2, r0)
            r2 = 8
            long r0 = r0 * r2
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 * r2
            long r2 = (long) r4
            long r0 = r0 / r2
            return r0
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
            r2 = this;
            long r0 = r2.durationUs
            return r0
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public com.google.android.exoplayer2.extractor.SeekMap.SeekPoints getSeekPoints(long r11) {
            r10 = this;
            long r0 = r10.dataSize
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L1b
            boolean r0 = r10.allowSeeksIfLengthUnknown
            if (r0 != 0) goto L1b
            com.google.android.exoplayer2.extractor.SeekMap$SeekPoints r11 = new com.google.android.exoplayer2.extractor.SeekMap$SeekPoints
            com.google.android.exoplayer2.extractor.SeekPoint r12 = new com.google.android.exoplayer2.extractor.SeekPoint
            r0 = 0
            long r2 = r10.firstFrameBytePosition
            r12.<init>(r0, r2)
            r11.<init>(r12)
            return r11
        L1b:
            long r0 = r10.getFramePositionForTimeUs(r11)
            long r4 = r10.getTimeUsAtPosition(r0)
            com.google.android.exoplayer2.extractor.SeekPoint r6 = new com.google.android.exoplayer2.extractor.SeekPoint
            r6.<init>(r4, r0)
            long r7 = r10.dataSize
            int r9 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r9 == 0) goto L4e
            int r2 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r2 >= 0) goto L4e
            int r11 = r10.frameSize
            long r2 = (long) r11
            long r2 = r2 + r0
            long r4 = r10.inputLength
            int r12 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r12 < 0) goto L3d
            goto L4e
        L3d:
            long r11 = (long) r11
            long r0 = r0 + r11
            long r11 = r10.getTimeUsAtPosition(r0)
            com.google.android.exoplayer2.extractor.SeekPoint r2 = new com.google.android.exoplayer2.extractor.SeekPoint
            r2.<init>(r11, r0)
            com.google.android.exoplayer2.extractor.SeekMap$SeekPoints r11 = new com.google.android.exoplayer2.extractor.SeekMap$SeekPoints
            r11.<init>(r6, r2)
            return r11
        L4e:
            com.google.android.exoplayer2.extractor.SeekMap$SeekPoints r11 = new com.google.android.exoplayer2.extractor.SeekMap$SeekPoints
            r11.<init>(r6)
            return r11
    }

    public long getTimeUsAtPosition(long r4) {
            r3 = this;
            long r0 = r3.firstFrameBytePosition
            int r2 = r3.bitrate
            long r4 = getTimeUsAtPosition(r4, r0, r2)
            return r4
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
            r5 = this;
            long r0 = r5.dataSize
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lf
            boolean r0 = r5.allowSeeksIfLengthUnknown
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            return r0
    }
}
