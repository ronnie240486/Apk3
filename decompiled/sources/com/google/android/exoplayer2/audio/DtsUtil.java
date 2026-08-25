package com.google.android.exoplayer2.audio;

/* JADX INFO: loaded from: classes.dex */
public final class DtsUtil {
    private static final int[] CHANNELS_BY_AMODE = null;
    public static final int DTS_HD_MAX_RATE_BYTES_PER_SECOND = 2250000;
    public static final int DTS_MAX_RATE_BYTES_PER_SECOND = 192000;
    private static final byte FIRST_BYTE_14B_BE = 31;
    private static final byte FIRST_BYTE_14B_LE = -1;
    private static final byte FIRST_BYTE_BE = 127;
    private static final byte FIRST_BYTE_LE = -2;
    private static final int[] SAMPLE_RATE_BY_SFREQ = null;
    private static final int SYNC_VALUE_14B_BE = 536864768;
    private static final int SYNC_VALUE_14B_LE = -14745368;
    private static final int SYNC_VALUE_BE = 2147385345;
    private static final int SYNC_VALUE_LE = -25230976;
    private static final int[] TWICE_BITRATE_KBPS_BY_RATE = null;

    static {
            r0 = 16
            int[] r1 = new int[r0]
            r1 = {x001a: FILL_ARRAY_DATA , data: [1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8} // fill-array
            com.google.android.exoplayer2.audio.DtsUtil.CHANNELS_BY_AMODE = r1
            int[] r0 = new int[r0]
            r0 = {x003e: FILL_ARRAY_DATA , data: [-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1} // fill-array
            com.google.android.exoplayer2.audio.DtsUtil.SAMPLE_RATE_BY_SFREQ = r0
            r0 = 29
            int[] r0 = new int[r0]
            r0 = {x0062: FILL_ARRAY_DATA , data: [64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680} // fill-array
            com.google.android.exoplayer2.audio.DtsUtil.TWICE_BITRATE_KBPS_BY_RATE = r0
            return
    }

    private DtsUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getDtsFrameSize(byte[] r7) {
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 6
            r4 = 7
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L4a
            r2 = -1
            if (r1 == r2) goto L32
            r2 = 31
            if (r1 == r2) goto L21
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r4]
            goto L58
        L21:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            r7 = r7[r1]
            goto L42
        L32:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            r7 = r7[r1]
        L42:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = 1
            goto L5d
        L4a:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r3]
        L58:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
        L5d:
            if (r0 == 0) goto L63
            int r7 = r7 * 16
            int r7 = r7 / 14
        L63:
            return r7
    }

    private static com.google.android.exoplayer2.util.ParsableBitArray getNormalizedFrameHeader(byte[] r5) {
            r0 = 0
            r1 = r5[r0]
            r2 = 127(0x7f, float:1.78E-43)
            if (r1 != r2) goto Ld
            com.google.android.exoplayer2.util.ParsableBitArray r0 = new com.google.android.exoplayer2.util.ParsableBitArray
            r0.<init>(r5)
            return r0
        Ld:
            int r1 = r5.length
            byte[] r5 = java.util.Arrays.copyOf(r5, r1)
            boolean r1 = isLittleEndianFrameHeader(r5)
            if (r1 == 0) goto L2b
            r1 = 0
        L19:
            int r2 = r5.length
            int r2 = r2 + (-1)
            if (r1 >= r2) goto L2b
            r2 = r5[r1]
            int r3 = r1 + 1
            r4 = r5[r3]
            r5[r1] = r4
            r5[r3] = r2
            int r1 = r1 + 2
            goto L19
        L2b:
            com.google.android.exoplayer2.util.ParsableBitArray r1 = new com.google.android.exoplayer2.util.ParsableBitArray
            r1.<init>(r5)
            r0 = r5[r0]
            r2 = 31
            if (r0 != r2) goto L51
            com.google.android.exoplayer2.util.ParsableBitArray r0 = new com.google.android.exoplayer2.util.ParsableBitArray
            r0.<init>(r5)
        L3b:
            int r2 = r0.bitsLeft()
            r3 = 16
            if (r2 < r3) goto L51
            r2 = 2
            r0.skipBits(r2)
            r2 = 14
            int r3 = r0.readBits(r2)
            r1.putInt(r3, r2)
            goto L3b
        L51:
            r1.reset(r5)
            return r1
    }

    private static boolean isLittleEndianFrameHeader(byte[] r3) {
            r0 = 0
            r1 = r3[r0]
            r2 = -2
            if (r1 == r2) goto Lb
            r3 = r3[r0]
            r1 = -1
            if (r3 != r1) goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }

    public static boolean isSyncWord(int r1) {
            r0 = 2147385345(0x7ffe8001, float:NaN)
            if (r1 == r0) goto L17
            r0 = -25230976(0xfffffffffe7f0180, float:-8.474023E37)
            if (r1 == r0) goto L17
            r0 = 536864768(0x1fffe800, float:1.0838051E-19)
            if (r1 == r0) goto L17
            r0 = -14745368(0xffffffffff1f00e8, float:-2.1135196E38)
            if (r1 != r0) goto L15
            goto L17
        L15:
            r1 = 0
            goto L18
        L17:
            r1 = 1
        L18:
            return r1
    }

    public static int parseDtsAudioSampleCount(java.nio.ByteBuffer r3) {
            int r0 = r3.position()
            byte r1 = r3.get(r0)
            r2 = -2
            if (r1 == r2) goto L47
            r2 = -1
            if (r1 == r2) goto L34
            r2 = 31
            if (r1 == r2) goto L23
            int r1 = r0 + 4
            byte r1 = r3.get(r1)
            r1 = r1 & 1
            int r1 = r1 << 6
            int r0 = r0 + 5
            byte r3 = r3.get(r0)
            goto L57
        L23:
            int r1 = r0 + 5
            byte r1 = r3.get(r1)
            r1 = r1 & 7
            int r1 = r1 << 4
            int r0 = r0 + 6
            byte r3 = r3.get(r0)
            goto L44
        L34:
            int r1 = r0 + 4
            byte r1 = r3.get(r1)
            r1 = r1 & 7
            int r1 = r1 << 4
            int r0 = r0 + 7
            byte r3 = r3.get(r0)
        L44:
            r3 = r3 & 60
            goto L59
        L47:
            int r1 = r0 + 5
            byte r1 = r3.get(r1)
            r1 = r1 & 1
            int r1 = r1 << 6
            int r0 = r0 + 4
            byte r3 = r3.get(r0)
        L57:
            r3 = r3 & 252(0xfc, float:3.53E-43)
        L59:
            int r3 = r3 >> 2
            r3 = r3 | r1
            int r3 = r3 + 1
            int r3 = r3 * 32
            return r3
    }

    public static int parseDtsAudioSampleCount(byte[] r6) {
            r0 = 0
            r0 = r6[r0]
            r1 = -2
            r2 = 6
            r3 = 5
            r4 = 4
            if (r0 == r1) goto L29
            r1 = -1
            r5 = 7
            if (r0 == r1) goto L20
            r1 = 31
            if (r0 == r1) goto L19
            r0 = r6[r4]
            r0 = r0 & 1
            int r0 = r0 << r2
            r6 = r6[r3]
            goto L30
        L19:
            r0 = r6[r3]
            r0 = r0 & r5
            int r0 = r0 << r4
            r6 = r6[r2]
            goto L26
        L20:
            r0 = r6[r4]
            r0 = r0 & r5
            int r0 = r0 << r4
            r6 = r6[r5]
        L26:
            r6 = r6 & 60
            goto L32
        L29:
            r0 = r6[r3]
            r0 = r0 & 1
            int r0 = r0 << r2
            r6 = r6[r4]
        L30:
            r6 = r6 & 252(0xfc, float:3.53E-43)
        L32:
            int r6 = r6 >> 2
            r6 = r6 | r0
            int r6 = r6 + 1
            int r6 = r6 * 32
            return r6
    }

    public static com.google.android.exoplayer2.Format parseDtsFormat(byte[] r6, @androidx.annotation.Nullable java.lang.String r7, @androidx.annotation.Nullable java.lang.String r8, @androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmInitData r9) {
            com.google.android.exoplayer2.util.ParsableBitArray r6 = getNormalizedFrameHeader(r6)
            r0 = 60
            r6.skipBits(r0)
            r0 = 6
            int r0 = r6.readBits(r0)
            int[] r1 = com.google.android.exoplayer2.audio.DtsUtil.CHANNELS_BY_AMODE
            r0 = r1[r0]
            r1 = 4
            int r1 = r6.readBits(r1)
            int[] r2 = com.google.android.exoplayer2.audio.DtsUtil.SAMPLE_RATE_BY_SFREQ
            r1 = r2[r1]
            r2 = 5
            int r2 = r6.readBits(r2)
            int[] r3 = com.google.android.exoplayer2.audio.DtsUtil.TWICE_BITRATE_KBPS_BY_RATE
            int r4 = r3.length
            r5 = 2
            if (r2 < r4) goto L28
            r2 = -1
            goto L2d
        L28:
            r2 = r3[r2]
            int r2 = r2 * 1000
            int r2 = r2 / r5
        L2d:
            r3 = 10
            r6.skipBits(r3)
            int r6 = r6.readBits(r5)
            if (r6 <= 0) goto L3a
            r6 = 1
            goto L3b
        L3a:
            r6 = 0
        L3b:
            int r0 = r0 + r6
            com.google.android.exoplayer2.Format$Builder r6 = new com.google.android.exoplayer2.Format$Builder
            r6.<init>()
            com.google.android.exoplayer2.Format$Builder r6 = r6.setId(r7)
            java.lang.String r7 = "audio/vnd.dts"
            com.google.android.exoplayer2.Format$Builder r6 = r6.setSampleMimeType(r7)
            com.google.android.exoplayer2.Format$Builder r6 = r6.setAverageBitrate(r2)
            com.google.android.exoplayer2.Format$Builder r6 = r6.setChannelCount(r0)
            com.google.android.exoplayer2.Format$Builder r6 = r6.setSampleRate(r1)
            com.google.android.exoplayer2.Format$Builder r6 = r6.setDrmInitData(r9)
            com.google.android.exoplayer2.Format$Builder r6 = r6.setLanguage(r8)
            com.google.android.exoplayer2.Format r6 = r6.build()
            return r6
    }
}
