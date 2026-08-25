package com.google.android.exoplayer2.mediacodec;

/* JADX INFO: loaded from: classes.dex */
final class C2Mp3TimestampTracker {
    private static final long DECODER_DELAY_FRAMES = 529;
    private static final java.lang.String TAG = "C2Mp3TimestampTracker";
    private long anchorTimestampUs;
    private long processedFrames;
    private boolean seenInvalidMpegAudioHeader;

    public C2Mp3TimestampTracker() {
            r0 = this;
            r0.<init>()
            return
    }

    private long getBufferTimestampUs(long r7) {
            r6 = this;
            long r0 = r6.anchorTimestampUs
            long r2 = r6.processedFrames
            r4 = 529(0x211, double:2.614E-321)
            long r2 = r2 - r4
            r4 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 * r4
            long r2 = r2 / r7
            r7 = 0
            long r7 = java.lang.Math.max(r7, r2)
            long r7 = r7 + r0
            return r7
    }

    public long getLastOutputBufferPresentationTimeUs(com.google.android.exoplayer2.Format r3) {
            r2 = this;
            int r3 = r3.sampleRate
            long r0 = (long) r3
            long r0 = r2.getBufferTimestampUs(r0)
            return r0
    }

    public void reset() {
            r2 = this;
            r0 = 0
            r2.anchorTimestampUs = r0
            r2.processedFrames = r0
            r0 = 0
            r2.seenInvalidMpegAudioHeader = r0
            return
    }

    public long updateAndGetPresentationTimeUs(com.google.android.exoplayer2.Format r7, com.google.android.exoplayer2.decoder.DecoderInputBuffer r8) {
            r6 = this;
            long r0 = r6.processedFrames
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lc
            long r0 = r8.timeUs
            r6.anchorTimestampUs = r0
        Lc:
            boolean r0 = r6.seenInvalidMpegAudioHeader
            if (r0 == 0) goto L13
            long r7 = r8.timeUs
            return r7
        L13:
            java.nio.ByteBuffer r0 = r8.data
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r1 = 0
            r4 = 0
        L1d:
            r5 = 4
            if (r1 >= r5) goto L2c
            int r4 = r4 << 8
            byte r5 = r0.get(r1)
            r5 = r5 & 255(0xff, float:3.57E-43)
            r4 = r4 | r5
            int r1 = r1 + 1
            goto L1d
        L2c:
            int r0 = com.google.android.exoplayer2.audio.MpegAudioUtil.parseMpegAudioFrameSampleCount(r4)
            r1 = -1
            if (r0 != r1) goto L46
            r7 = 1
            r6.seenInvalidMpegAudioHeader = r7
            r6.processedFrames = r2
            long r0 = r8.timeUs
            r6.anchorTimestampUs = r0
            java.lang.String r7 = "C2Mp3TimestampTracker"
            java.lang.String r0 = "MPEG audio header is invalid."
            com.google.android.exoplayer2.util.Log.w(r7, r0)
            long r7 = r8.timeUs
            return r7
        L46:
            int r7 = r7.sampleRate
            long r7 = (long) r7
            long r7 = r6.getBufferTimestampUs(r7)
            long r1 = r6.processedFrames
            long r3 = (long) r0
            long r1 = r1 + r3
            r6.processedFrames = r1
            return r7
    }
}
