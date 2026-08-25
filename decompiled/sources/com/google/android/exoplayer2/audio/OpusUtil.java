package com.google.android.exoplayer2.audio;

/* JADX INFO: loaded from: classes.dex */
public class OpusUtil {
    private static final int DEFAULT_SEEK_PRE_ROLL_SAMPLES = 3840;
    private static final int FULL_CODEC_INITIALIZATION_DATA_BUFFER_COUNT = 3;
    public static final int MAX_BYTES_PER_SECOND = 63750;
    public static final int SAMPLE_RATE = 48000;

    private OpusUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.List<byte[]> buildInitializationData(byte[] r6) {
            int r0 = getPreSkipSamples(r6)
            long r0 = (long) r0
            long r0 = sampleCountToNanoseconds(r0)
            r2 = 3840(0xf00, double:1.897E-320)
            long r2 = sampleCountToNanoseconds(r2)
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 3
            r4.<init>(r5)
            r4.add(r6)
            byte[] r6 = buildNativeOrderByteArray(r0)
            r4.add(r6)
            byte[] r6 = buildNativeOrderByteArray(r2)
            r4.add(r6)
            return r4
    }

    private static byte[] buildNativeOrderByteArray(long r2) {
            r0 = 8
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r0 = r0.order(r1)
            java.nio.ByteBuffer r2 = r0.putLong(r2)
            byte[] r2 = r2.array()
            return r2
    }

    public static int getChannelCount(byte[] r1) {
            r0 = 9
            r1 = r1[r0]
            r1 = r1 & 255(0xff, float:3.57E-43)
            return r1
    }

    private static long getPacketDurationUs(byte r5, byte r6) {
            r5 = r5 & 255(0xff, float:3.57E-43)
            r0 = r5 & 3
            r1 = 2
            r2 = 1
            if (r0 == 0) goto Lf
            if (r0 == r2) goto L10
            if (r0 == r1) goto L10
            r1 = r6 & 63
            goto L10
        Lf:
            r1 = 1
        L10:
            r6 = 3
            int r5 = r5 >> r6
            r0 = r5 & 3
            r3 = 16
            if (r5 < r3) goto L1c
            r5 = 2500(0x9c4, float:3.503E-42)
            int r5 = r5 << r0
            goto L2f
        L1c:
            r3 = 12
            r4 = 10000(0x2710, float:1.4013E-41)
            if (r5 < r3) goto L27
            r5 = r0 & 1
            int r5 = r4 << r5
            goto L2f
        L27:
            if (r0 != r6) goto L2d
            r5 = 60000(0xea60, float:8.4078E-41)
            goto L2f
        L2d:
            int r5 = r4 << r0
        L2f:
            long r0 = (long) r1
            long r5 = (long) r5
            long r0 = r0 * r5
            return r0
    }

    public static long getPacketDurationUs(byte[] r4) {
            r0 = 0
            r1 = r4[r0]
            int r2 = r4.length
            r3 = 1
            if (r2 <= r3) goto L9
            r0 = r4[r3]
        L9:
            long r0 = getPacketDurationUs(r1, r0)
            return r0
    }

    private static int getPreSkipSamples(byte[] r2) {
            r0 = 11
            r0 = r2[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            r1 = 10
            r2 = r2[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r2 = r2 | r0
            return r2
    }

    public static int parsePacketAudioSampleCount(java.nio.ByteBuffer r4) {
            r0 = 0
            byte r1 = r4.get(r0)
            int r2 = r4.limit()
            r3 = 1
            if (r2 <= r3) goto L10
            byte r0 = r4.get(r3)
        L10:
            long r0 = getPacketDurationUs(r1, r0)
            r2 = 48000(0xbb80, double:2.3715E-319)
            long r0 = r0 * r2
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 / r2
            int r4 = (int) r0
            return r4
    }

    private static long sampleCountToNanoseconds(long r2) {
            r0 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r2 = r2 * r0
            r0 = 48000(0xbb80, double:2.3715E-319)
            long r2 = r2 / r0
            return r2
    }
}
