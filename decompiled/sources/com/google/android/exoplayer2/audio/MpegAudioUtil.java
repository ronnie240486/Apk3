package com.google.android.exoplayer2.audio;

/* JADX INFO: loaded from: classes2.dex */
public final class MpegAudioUtil {
    private static final int[] BITRATE_V1_L1 = null;
    private static final int[] BITRATE_V1_L2 = null;
    private static final int[] BITRATE_V1_L3 = null;
    private static final int[] BITRATE_V2 = null;
    private static final int[] BITRATE_V2_L1 = null;
    public static final int MAX_FRAME_SIZE_BYTES = 4096;
    public static final int MAX_RATE_BYTES_PER_SECOND = 40000;
    private static final java.lang.String[] MIME_TYPE_BY_LAYER = null;
    private static final int SAMPLES_PER_FRAME_L1 = 384;
    private static final int SAMPLES_PER_FRAME_L2 = 1152;
    private static final int SAMPLES_PER_FRAME_L3_V1 = 1152;
    private static final int SAMPLES_PER_FRAME_L3_V2 = 576;
    private static final int[] SAMPLING_RATE_V1 = null;

    public static final class Header {
        public int bitrate;
        public int channels;
        public int frameSize;

        @androidx.annotation.Nullable
        public java.lang.String mimeType;
        public int sampleRate;
        public int samplesPerFrame;
        public int version;

        public Header() {
                r0 = this;
                r0.<init>()
                return
        }

        public boolean setForHeaderData(int r9) {
                r8 = this;
                boolean r0 = com.google.android.exoplayer2.audio.MpegAudioUtil.access$000(r9)
                r1 = 0
                if (r0 != 0) goto L8
                return r1
            L8:
                int r0 = r9 >>> 19
                r2 = 3
                r0 = r0 & r2
                r3 = 1
                if (r0 != r3) goto L10
                return r1
            L10:
                int r4 = r9 >>> 17
                r4 = r4 & r2
                if (r4 != 0) goto L16
                return r1
            L16:
                int r5 = r9 >>> 12
                r6 = 15
                r5 = r5 & r6
                if (r5 == 0) goto Laf
                if (r5 != r6) goto L21
                goto Laf
            L21:
                int r6 = r9 >>> 10
                r6 = r6 & r2
                if (r6 != r2) goto L27
                return r1
            L27:
                r8.version = r0
                java.lang.String[] r1 = com.google.android.exoplayer2.audio.MpegAudioUtil.access$100()
                int r7 = 3 - r4
                r1 = r1[r7]
                r8.mimeType = r1
                int[] r1 = com.google.android.exoplayer2.audio.MpegAudioUtil.access$200()
                r1 = r1[r6]
                r8.sampleRate = r1
                r6 = 2
                if (r0 != r6) goto L42
                int r1 = r1 / r6
                r8.sampleRate = r1
                goto L48
            L42:
                if (r0 != 0) goto L48
                int r1 = r1 / 4
                r8.sampleRate = r1
            L48:
                int r1 = r9 >>> 9
                r1 = r1 & r3
                int r7 = com.google.android.exoplayer2.audio.MpegAudioUtil.access$300(r0, r4)
                r8.samplesPerFrame = r7
                if (r4 != r2) goto L71
                if (r0 != r2) goto L5d
                int[] r0 = com.google.android.exoplayer2.audio.MpegAudioUtil.access$400()
                int r5 = r5 - r3
                r0 = r0[r5]
                goto L64
            L5d:
                int[] r0 = com.google.android.exoplayer2.audio.MpegAudioUtil.access$500()
                int r5 = r5 - r3
                r0 = r0[r5]
            L64:
                r8.bitrate = r0
                int r0 = r0 * 12
                int r4 = r8.sampleRate
                int r0 = r0 / r4
                int r0 = r0 + r1
                int r0 = r0 * 4
                r8.frameSize = r0
                goto La6
            L71:
                r7 = 144(0x90, float:2.02E-43)
                if (r0 != r2) goto L91
                if (r4 != r6) goto L7f
                int[] r0 = com.google.android.exoplayer2.audio.MpegAudioUtil.access$600()
                int r5 = r5 - r3
                r0 = r0[r5]
                goto L86
            L7f:
                int[] r0 = com.google.android.exoplayer2.audio.MpegAudioUtil.access$700()
                int r5 = r5 - r3
                r0 = r0[r5]
            L86:
                r8.bitrate = r0
                int r0 = r0 * 144
                int r4 = r8.sampleRate
                int r0 = r0 / r4
                int r0 = r0 + r1
                r8.frameSize = r0
                goto La6
            L91:
                int[] r0 = com.google.android.exoplayer2.audio.MpegAudioUtil.access$800()
                int r5 = r5 - r3
                r0 = r0[r5]
                r8.bitrate = r0
                if (r4 != r3) goto L9e
                r7 = 72
            L9e:
                int r7 = r7 * r0
                int r0 = r8.sampleRate
                int r7 = r7 / r0
                int r7 = r7 + r1
                r8.frameSize = r7
            La6:
                int r9 = r9 >> 6
                r9 = r9 & r2
                if (r9 != r2) goto Lac
                r6 = 1
            Lac:
                r8.channels = r6
                return r3
            Laf:
                return r1
        }
    }

    static {
            java.lang.String r0 = "audio/mpeg-L1"
            java.lang.String r1 = "audio/mpeg-L2"
            java.lang.String r2 = "audio/mpeg"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2}
            com.google.android.exoplayer2.audio.MpegAudioUtil.MIME_TYPE_BY_LAYER = r0
            r0 = 3
            int[] r0 = new int[r0]
            r0 = {x003a: FILL_ARRAY_DATA , data: [44100, 48000, 32000} // fill-array
            com.google.android.exoplayer2.audio.MpegAudioUtil.SAMPLING_RATE_V1 = r0
            r0 = 14
            int[] r1 = new int[r0]
            r1 = {x0044: FILL_ARRAY_DATA , data: [32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000} // fill-array
            com.google.android.exoplayer2.audio.MpegAudioUtil.BITRATE_V1_L1 = r1
            int[] r1 = new int[r0]
            r1 = {x0064: FILL_ARRAY_DATA , data: [32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000} // fill-array
            com.google.android.exoplayer2.audio.MpegAudioUtil.BITRATE_V2_L1 = r1
            int[] r1 = new int[r0]
            r1 = {x0084: FILL_ARRAY_DATA , data: [32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000} // fill-array
            com.google.android.exoplayer2.audio.MpegAudioUtil.BITRATE_V1_L2 = r1
            int[] r1 = new int[r0]
            r1 = {x00a4: FILL_ARRAY_DATA , data: [32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000} // fill-array
            com.google.android.exoplayer2.audio.MpegAudioUtil.BITRATE_V1_L3 = r1
            int[] r0 = new int[r0]
            r0 = {x00c4: FILL_ARRAY_DATA , data: [8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000} // fill-array
            com.google.android.exoplayer2.audio.MpegAudioUtil.BITRATE_V2 = r0
            return
    }

    private MpegAudioUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ boolean access$000(int r0) {
            boolean r0 = isMagicPresent(r0)
            return r0
    }

    public static /* synthetic */ java.lang.String[] access$100() {
            java.lang.String[] r0 = com.google.android.exoplayer2.audio.MpegAudioUtil.MIME_TYPE_BY_LAYER
            return r0
    }

    public static /* synthetic */ int[] access$200() {
            int[] r0 = com.google.android.exoplayer2.audio.MpegAudioUtil.SAMPLING_RATE_V1
            return r0
    }

    public static /* synthetic */ int access$300(int r0, int r1) {
            int r0 = getFrameSizeInSamples(r0, r1)
            return r0
    }

    public static /* synthetic */ int[] access$400() {
            int[] r0 = com.google.android.exoplayer2.audio.MpegAudioUtil.BITRATE_V1_L1
            return r0
    }

    public static /* synthetic */ int[] access$500() {
            int[] r0 = com.google.android.exoplayer2.audio.MpegAudioUtil.BITRATE_V2_L1
            return r0
    }

    public static /* synthetic */ int[] access$600() {
            int[] r0 = com.google.android.exoplayer2.audio.MpegAudioUtil.BITRATE_V1_L2
            return r0
    }

    public static /* synthetic */ int[] access$700() {
            int[] r0 = com.google.android.exoplayer2.audio.MpegAudioUtil.BITRATE_V1_L3
            return r0
    }

    public static /* synthetic */ int[] access$800() {
            int[] r0 = com.google.android.exoplayer2.audio.MpegAudioUtil.BITRATE_V2
            return r0
    }

    public static int getFrameSize(int r7) {
            boolean r0 = isMagicPresent(r7)
            r1 = -1
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r7 >>> 19
            r2 = 3
            r0 = r0 & r2
            r3 = 1
            if (r0 != r3) goto L10
            return r1
        L10:
            int r4 = r7 >>> 17
            r4 = r4 & r2
            if (r4 != 0) goto L16
            return r1
        L16:
            int r5 = r7 >>> 12
            r6 = 15
            r5 = r5 & r6
            if (r5 == 0) goto L74
            if (r5 != r6) goto L20
            goto L74
        L20:
            int r6 = r7 >>> 10
            r6 = r6 & r2
            if (r6 != r2) goto L26
            return r1
        L26:
            int[] r1 = com.google.android.exoplayer2.audio.MpegAudioUtil.SAMPLING_RATE_V1
            r1 = r1[r6]
            r6 = 2
            if (r0 != r6) goto L30
            int r1 = r1 / 2
            goto L34
        L30:
            if (r0 != 0) goto L34
            int r1 = r1 / 4
        L34:
            int r7 = r7 >>> 9
            r7 = r7 & r3
            if (r4 != r2) goto L4d
            if (r0 != r2) goto L41
            int[] r0 = com.google.android.exoplayer2.audio.MpegAudioUtil.BITRATE_V1_L1
            int r5 = r5 - r3
            r0 = r0[r5]
            goto L46
        L41:
            int[] r0 = com.google.android.exoplayer2.audio.MpegAudioUtil.BITRATE_V2_L1
            int r5 = r5 - r3
            r0 = r0[r5]
        L46:
            int r0 = r0 * 12
            int r0 = r0 / r1
            int r0 = r0 + r7
            int r0 = r0 * 4
            return r0
        L4d:
            if (r0 != r2) goto L5d
            if (r4 != r6) goto L57
            int[] r6 = com.google.android.exoplayer2.audio.MpegAudioUtil.BITRATE_V1_L2
            int r5 = r5 - r3
            r5 = r6[r5]
            goto L62
        L57:
            int[] r6 = com.google.android.exoplayer2.audio.MpegAudioUtil.BITRATE_V1_L3
            int r5 = r5 - r3
            r5 = r6[r5]
            goto L62
        L5d:
            int[] r6 = com.google.android.exoplayer2.audio.MpegAudioUtil.BITRATE_V2
            int r5 = r5 - r3
            r5 = r6[r5]
        L62:
            r6 = 144(0x90, float:2.02E-43)
            if (r0 != r2) goto L6b
            int r5 = r5 * 144
            int r5 = r5 / r1
            int r5 = r5 + r7
            return r5
        L6b:
            if (r4 != r3) goto L6f
            r6 = 72
        L6f:
            int r6 = r6 * r5
            int r6 = r6 / r1
            int r6 = r6 + r7
            return r6
        L74:
            return r1
    }

    private static int getFrameSizeInSamples(int r3, int r4) {
            r0 = 1
            r1 = 1152(0x480, float:1.614E-42)
            r2 = 3
            if (r4 == r0) goto L15
            r3 = 2
            if (r4 == r3) goto L14
            if (r4 != r2) goto Le
            r3 = 384(0x180, float:5.38E-43)
            return r3
        Le:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
        L14:
            return r1
        L15:
            if (r3 != r2) goto L18
            goto L1a
        L18:
            r1 = 576(0x240, float:8.07E-43)
        L1a:
            return r1
    }

    private static boolean isMagicPresent(int r1) {
            r0 = -2097152(0xffffffffffe00000, float:NaN)
            r1 = r1 & r0
            if (r1 != r0) goto L7
            r1 = 1
            goto L8
        L7:
            r1 = 0
        L8:
            return r1
    }

    public static int parseMpegAudioFrameSampleCount(int r6) {
            boolean r0 = isMagicPresent(r6)
            r1 = -1
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r6 >>> 19
            r2 = 3
            r0 = r0 & r2
            r3 = 1
            if (r0 != r3) goto L10
            return r1
        L10:
            int r3 = r6 >>> 17
            r3 = r3 & r2
            if (r3 != 0) goto L16
            return r1
        L16:
            int r4 = r6 >>> 12
            r5 = 15
            r4 = r4 & r5
            int r6 = r6 >>> 10
            r6 = r6 & r2
            if (r4 == 0) goto L2a
            if (r4 == r5) goto L2a
            if (r6 != r2) goto L25
            goto L2a
        L25:
            int r6 = getFrameSizeInSamples(r0, r3)
            return r6
        L2a:
            return r1
    }
}
