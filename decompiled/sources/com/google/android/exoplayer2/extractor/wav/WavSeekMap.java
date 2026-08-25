package com.google.android.exoplayer2.extractor.wav;

/* JADX INFO: loaded from: classes.dex */
final class WavSeekMap implements com.google.android.exoplayer2.extractor.SeekMap {
    private final long blockCount;
    private final long durationUs;
    private final long firstBlockPosition;
    private final int framesPerBlock;
    private final com.google.android.exoplayer2.extractor.wav.WavFormat wavFormat;

    public WavSeekMap(com.google.android.exoplayer2.extractor.wav.WavFormat r1, int r2, long r3, long r5) {
            r0 = this;
            r0.<init>()
            r0.wavFormat = r1
            r0.framesPerBlock = r2
            r0.firstBlockPosition = r3
            long r5 = r5 - r3
            int r1 = r1.blockSize
            long r1 = (long) r1
            long r5 = r5 / r1
            r0.blockCount = r5
            long r1 = r0.blockIndexToTimeUs(r5)
            r0.durationUs = r1
            return
    }

    private long blockIndexToTimeUs(long r9) {
            r8 = this;
            int r0 = r8.framesPerBlock
            long r0 = (long) r0
            long r2 = r9 * r0
            com.google.android.exoplayer2.extractor.wav.WavFormat r9 = r8.wavFormat
            int r9 = r9.frameRateHz
            long r6 = (long) r9
            r4 = 1000000(0xf4240, double:4.940656E-318)
            long r9 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r2, r4, r6)
            return r9
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
            com.google.android.exoplayer2.extractor.wav.WavFormat r0 = r10.wavFormat
            int r0 = r0.frameRateHz
            long r0 = (long) r0
            long r0 = r0 * r11
            int r2 = r10.framesPerBlock
            long r2 = (long) r2
            r4 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 * r4
            long r4 = r0 / r2
            long r0 = r10.blockCount
            r2 = 1
            long r8 = r0 - r2
            r6 = 0
            long r0 = com.google.android.exoplayer2.util.Util.constrainValue(r4, r6, r8)
            long r4 = r10.firstBlockPosition
            com.google.android.exoplayer2.extractor.wav.WavFormat r6 = r10.wavFormat
            int r6 = r6.blockSize
            long r6 = (long) r6
            long r6 = r6 * r0
            long r6 = r6 + r4
            long r4 = r10.blockIndexToTimeUs(r0)
            com.google.android.exoplayer2.extractor.SeekPoint r8 = new com.google.android.exoplayer2.extractor.SeekPoint
            r8.<init>(r4, r6)
            int r6 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r6 >= 0) goto L56
            long r11 = r10.blockCount
            long r11 = r11 - r2
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 != 0) goto L3c
            goto L56
        L3c:
            long r0 = r0 + r2
            long r11 = r10.firstBlockPosition
            com.google.android.exoplayer2.extractor.wav.WavFormat r2 = r10.wavFormat
            int r2 = r2.blockSize
            long r2 = (long) r2
            long r2 = r2 * r0
            long r2 = r2 + r11
            long r11 = r10.blockIndexToTimeUs(r0)
            com.google.android.exoplayer2.extractor.SeekPoint r0 = new com.google.android.exoplayer2.extractor.SeekPoint
            r0.<init>(r11, r2)
            com.google.android.exoplayer2.extractor.SeekMap$SeekPoints r11 = new com.google.android.exoplayer2.extractor.SeekMap$SeekPoints
            r11.<init>(r8, r0)
            return r11
        L56:
            com.google.android.exoplayer2.extractor.SeekMap$SeekPoints r11 = new com.google.android.exoplayer2.extractor.SeekMap$SeekPoints
            r11.<init>(r8)
            return r11
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
            r1 = this;
            r0 = 1
            return r0
    }
}
