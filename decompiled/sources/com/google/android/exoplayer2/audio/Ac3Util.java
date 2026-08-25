package com.google.android.exoplayer2.audio;

/* JADX INFO: loaded from: classes3.dex */
public final class Ac3Util {
    public static final int AC3_MAX_RATE_BYTES_PER_SECOND = 80000;
    private static final int AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT = 1536;
    private static final int AUDIO_SAMPLES_PER_AUDIO_BLOCK = 256;
    private static final int[] BITRATE_BY_HALF_FRMSIZECOD = null;
    private static final int[] BLOCKS_PER_SYNCFRAME_BY_NUMBLKSCOD = null;
    private static final int[] CHANNEL_COUNT_BY_ACMOD = null;
    public static final int E_AC3_MAX_RATE_BYTES_PER_SECOND = 768000;
    private static final int[] SAMPLE_RATE_BY_FSCOD = null;
    private static final int[] SAMPLE_RATE_BY_FSCOD2 = null;
    private static final int[] SYNCFRAME_SIZE_WORDS_BY_HALF_FRMSIZECOD_44_1 = null;
    public static final int TRUEHD_MAX_RATE_BYTES_PER_SECOND = 3062500;
    public static final int TRUEHD_RECHUNK_SAMPLE_COUNT = 16;
    public static final int TRUEHD_SYNCFRAME_PREFIX_LENGTH = 10;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.Ac3Util$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class SyncFrameInfo {
        public static final int STREAM_TYPE_TYPE0 = 0;
        public static final int STREAM_TYPE_TYPE1 = 1;
        public static final int STREAM_TYPE_TYPE2 = 2;
        public static final int STREAM_TYPE_UNDEFINED = -1;
        public final int bitrate;
        public final int channelCount;
        public final int frameSize;

        @androidx.annotation.Nullable
        public final java.lang.String mimeType;
        public final int sampleCount;
        public final int sampleRate;
        public final int streamType;

        /* JADX INFO: loaded from: classes3.dex */
        @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
        @java.lang.annotation.Documented
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface StreamType {
        }

        private SyncFrameInfo(@androidx.annotation.Nullable java.lang.String r1, int r2, int r3, int r4, int r5, int r6, int r7) {
                r0 = this;
                r0.<init>()
                r0.mimeType = r1
                r0.streamType = r2
                r0.channelCount = r3
                r0.sampleRate = r4
                r0.frameSize = r5
                r0.sampleCount = r6
                r0.bitrate = r7
                return
        }

        public /* synthetic */ SyncFrameInfo(java.lang.String r1, int r2, int r3, int r4, int r5, int r6, int r7, com.google.android.exoplayer2.audio.Ac3Util.AnonymousClass1 r8) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return
        }
    }

    static {
            r0 = 4
            int[] r0 = new int[r0]
            r0 = {x0032: FILL_ARRAY_DATA , data: [1, 2, 3, 6} // fill-array
            com.google.android.exoplayer2.audio.Ac3Util.BLOCKS_PER_SYNCFRAME_BY_NUMBLKSCOD = r0
            r0 = 3
            int[] r1 = new int[r0]
            r1 = {x003e: FILL_ARRAY_DATA , data: [48000, 44100, 32000} // fill-array
            com.google.android.exoplayer2.audio.Ac3Util.SAMPLE_RATE_BY_FSCOD = r1
            int[] r0 = new int[r0]
            r0 = {x0048: FILL_ARRAY_DATA , data: [24000, 22050, 16000} // fill-array
            com.google.android.exoplayer2.audio.Ac3Util.SAMPLE_RATE_BY_FSCOD2 = r0
            r0 = 8
            int[] r0 = new int[r0]
            r0 = {x0052: FILL_ARRAY_DATA , data: [2, 1, 2, 3, 3, 4, 4, 5} // fill-array
            com.google.android.exoplayer2.audio.Ac3Util.CHANNEL_COUNT_BY_ACMOD = r0
            r0 = 19
            int[] r1 = new int[r0]
            r1 = {x0066: FILL_ARRAY_DATA , data: [32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640} // fill-array
            com.google.android.exoplayer2.audio.Ac3Util.BITRATE_BY_HALF_FRMSIZECOD = r1
            int[] r0 = new int[r0]
            r0 = {x0090: FILL_ARRAY_DATA , data: [69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393} // fill-array
            com.google.android.exoplayer2.audio.Ac3Util.SYNCFRAME_SIZE_WORDS_BY_HALF_FRMSIZECOD_44_1 = r0
            return
    }

    private Ac3Util() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int calculateEac3Bitrate(int r0, int r1, int r2) {
            int r0 = r0 * r1
            int r2 = r2 * 32
            int r0 = r0 / r2
            return r0
    }

    public static int findTrueHdSyncframeOffset(java.nio.ByteBuffer r5) {
            int r0 = r5.position()
            int r1 = r5.limit()
            int r1 = r1 + (-10)
            r2 = r0
        Lb:
            if (r2 > r1) goto L1f
            int r3 = r2 + 4
            int r3 = com.google.android.exoplayer2.util.Util.getBigEndianInt(r5, r3)
            r3 = r3 & (-2)
            r4 = -126718022(0xfffffffff8726fba, float:-1.966878E34)
            if (r3 != r4) goto L1c
            int r2 = r2 - r0
            return r2
        L1c:
            int r2 = r2 + 1
            goto Lb
        L1f:
            r5 = -1
            return r5
    }

    private static int getAc3SyncframeSize(int r4, int r5) {
            int r0 = r5 / 2
            if (r4 < 0) goto L2e
            int[] r1 = com.google.android.exoplayer2.audio.Ac3Util.SAMPLE_RATE_BY_FSCOD
            int r2 = r1.length
            if (r4 >= r2) goto L2e
            if (r5 < 0) goto L2e
            int[] r2 = com.google.android.exoplayer2.audio.Ac3Util.SYNCFRAME_SIZE_WORDS_BY_HALF_FRMSIZECOD_44_1
            int r3 = r2.length
            if (r0 < r3) goto L11
            goto L2e
        L11:
            r4 = r1[r4]
            r1 = 44100(0xac44, float:6.1797E-41)
            if (r4 != r1) goto L20
            r4 = r2[r0]
            int r5 = r5 % 2
            int r5 = r5 + r4
            int r5 = r5 * 2
            return r5
        L20:
            int[] r5 = com.google.android.exoplayer2.audio.Ac3Util.BITRATE_BY_HALF_FRMSIZECOD
            r5 = r5[r0]
            r0 = 32000(0x7d00, float:4.4842E-41)
            if (r4 != r0) goto L2b
            int r5 = r5 * 6
            return r5
        L2b:
            int r5 = r5 * 4
            return r5
        L2e:
            r4 = -1
            return r4
    }

    public static com.google.android.exoplayer2.Format parseAc3AnnexFFormat(com.google.android.exoplayer2.util.ParsableByteArray r5, java.lang.String r6, java.lang.String r7, @androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmInitData r8) {
            com.google.android.exoplayer2.util.ParsableBitArray r0 = new com.google.android.exoplayer2.util.ParsableBitArray
            r0.<init>()
            r0.reset(r5)
            r1 = 2
            int r1 = r0.readBits(r1)
            int[] r2 = com.google.android.exoplayer2.audio.Ac3Util.SAMPLE_RATE_BY_FSCOD
            r1 = r2[r1]
            r2 = 8
            r0.skipBits(r2)
            int[] r2 = com.google.android.exoplayer2.audio.Ac3Util.CHANNEL_COUNT_BY_ACMOD
            r3 = 3
            int r3 = r0.readBits(r3)
            r2 = r2[r3]
            r3 = 1
            int r3 = r0.readBits(r3)
            if (r3 == 0) goto L28
            int r2 = r2 + 1
        L28:
            r3 = 5
            int r3 = r0.readBits(r3)
            int[] r4 = com.google.android.exoplayer2.audio.Ac3Util.BITRATE_BY_HALF_FRMSIZECOD
            r3 = r4[r3]
            int r3 = r3 * 1000
            r0.byteAlign()
            int r0 = r0.getBytePosition()
            r5.setPosition(r0)
            com.google.android.exoplayer2.Format$Builder r5 = new com.google.android.exoplayer2.Format$Builder
            r5.<init>()
            com.google.android.exoplayer2.Format$Builder r5 = r5.setId(r6)
            java.lang.String r6 = "audio/ac3"
            com.google.android.exoplayer2.Format$Builder r5 = r5.setSampleMimeType(r6)
            com.google.android.exoplayer2.Format$Builder r5 = r5.setChannelCount(r2)
            com.google.android.exoplayer2.Format$Builder r5 = r5.setSampleRate(r1)
            com.google.android.exoplayer2.Format$Builder r5 = r5.setDrmInitData(r8)
            com.google.android.exoplayer2.Format$Builder r5 = r5.setLanguage(r7)
            com.google.android.exoplayer2.Format$Builder r5 = r5.setAverageBitrate(r3)
            com.google.android.exoplayer2.Format$Builder r5 = r5.setPeakBitrate(r3)
            com.google.android.exoplayer2.Format r5 = r5.build()
            return r5
    }

    public static int parseAc3SyncframeAudioSampleCount(java.nio.ByteBuffer r3) {
            int r0 = r3.position()
            int r0 = r0 + 5
            byte r0 = r3.get(r0)
            r0 = r0 & 248(0xf8, float:3.48E-43)
            r1 = 3
            int r0 = r0 >> r1
            r2 = 10
            if (r0 <= r2) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            if (r0 == 0) goto L3d
            int r0 = r3.position()
            int r0 = r0 + 4
            byte r0 = r3.get(r0)
            r0 = r0 & 192(0xc0, float:2.69E-43)
            int r0 = r0 >> 6
            if (r0 != r1) goto L28
            goto L36
        L28:
            int r0 = r3.position()
            int r0 = r0 + 4
            byte r3 = r3.get(r0)
            r3 = r3 & 48
            int r1 = r3 >> 4
        L36:
            int[] r3 = com.google.android.exoplayer2.audio.Ac3Util.BLOCKS_PER_SYNCFRAME_BY_NUMBLKSCOD
            r3 = r3[r1]
            int r3 = r3 * 256
            return r3
        L3d:
            r3 = 1536(0x600, float:2.152E-42)
            return r3
    }

    public static com.google.android.exoplayer2.audio.Ac3Util.SyncFrameInfo parseAc3SyncframeInfo(com.google.android.exoplayer2.util.ParsableBitArray r30) {
            r0 = r30
            int r1 = r30.getPosition()
            r2 = 40
            r0.skipBits(r2)
            r2 = 5
            int r3 = r0.readBits(r2)
            r4 = 10
            r6 = 1
            if (r3 <= r4) goto L17
            r3 = 1
            goto L18
        L17:
            r3 = 0
        L18:
            r0.setPosition(r1)
            r1 = -1
            r7 = 8
            r9 = 3
            r10 = 2
            if (r3 == 0) goto L228
            r3 = 16
            r0.skipBits(r3)
            int r11 = r0.readBits(r10)
            if (r11 == 0) goto L36
            if (r11 == r6) goto L34
            if (r11 == r10) goto L32
            goto L37
        L32:
            r1 = 2
            goto L37
        L34:
            r1 = 1
            goto L37
        L36:
            r1 = 0
        L37:
            r0.skipBits(r9)
            r11 = 11
            int r11 = r0.readBits(r11)
            int r11 = r11 + r6
            int r11 = r11 * 2
            int r12 = r0.readBits(r10)
            if (r12 != r9) goto L54
            int[] r13 = com.google.android.exoplayer2.audio.Ac3Util.SAMPLE_RATE_BY_FSCOD2
            int r14 = r0.readBits(r10)
            r13 = r13[r14]
            r14 = 3
            r15 = 6
            goto L66
        L54:
            int r13 = r0.readBits(r10)
            int[] r14 = com.google.android.exoplayer2.audio.Ac3Util.BLOCKS_PER_SYNCFRAME_BY_NUMBLKSCOD
            r14 = r14[r13]
            int[] r15 = com.google.android.exoplayer2.audio.Ac3Util.SAMPLE_RATE_BY_FSCOD
            r15 = r15[r12]
            r29 = r14
            r14 = r13
            r13 = r15
            r15 = r29
        L66:
            int r5 = r15 * 256
            int r16 = calculateEac3Bitrate(r11, r13, r15)
            int r8 = r0.readBits(r9)
            boolean r18 = r30.readBit()
            int[] r19 = com.google.android.exoplayer2.audio.Ac3Util.CHANNEL_COUNT_BY_ACMOD
            r19 = r19[r8]
            int r19 = r19 + r18
            r0.skipBits(r4)
            boolean r4 = r30.readBit()
            if (r4 == 0) goto L86
            r0.skipBits(r7)
        L86:
            if (r8 != 0) goto L94
            r0.skipBits(r2)
            boolean r4 = r30.readBit()
            if (r4 == 0) goto L94
            r0.skipBits(r7)
        L94:
            if (r1 != r6) goto L9f
            boolean r4 = r30.readBit()
            if (r4 == 0) goto L9f
            r0.skipBits(r3)
        L9f:
            boolean r3 = r30.readBit()
            r4 = 4
            if (r3 == 0) goto L1bd
            if (r8 <= r10) goto Lab
            r0.skipBits(r10)
        Lab:
            r3 = r8 & 1
            if (r3 == 0) goto Lb6
            if (r8 <= r10) goto Lb6
            r3 = 6
            r0.skipBits(r3)
            goto Lb7
        Lb6:
            r3 = 6
        Lb7:
            r17 = r8 & 4
            if (r17 == 0) goto Lbe
            r0.skipBits(r3)
        Lbe:
            if (r18 == 0) goto Lc9
            boolean r3 = r30.readBit()
            if (r3 == 0) goto Lc9
            r0.skipBits(r2)
        Lc9:
            if (r1 != 0) goto L1bd
            boolean r3 = r30.readBit()
            if (r3 == 0) goto Ld6
            r3 = 6
            r0.skipBits(r3)
            goto Ld7
        Ld6:
            r3 = 6
        Ld7:
            if (r8 != 0) goto Le2
            boolean r17 = r30.readBit()
            if (r17 == 0) goto Le2
            r0.skipBits(r3)
        Le2:
            boolean r17 = r30.readBit()
            if (r17 == 0) goto Leb
            r0.skipBits(r3)
        Leb:
            int r3 = r0.readBits(r10)
            if (r3 != r6) goto Lf6
            r0.skipBits(r2)
            goto L18a
        Lf6:
            if (r3 != r10) goto Lff
            r3 = 12
            r0.skipBits(r3)
            goto L18a
        Lff:
            if (r3 != r9) goto L18a
            int r3 = r0.readBits(r2)
            boolean r18 = r30.readBit()
            if (r18 == 0) goto L165
            r0.skipBits(r2)
            boolean r18 = r30.readBit()
            if (r18 == 0) goto L117
            r0.skipBits(r4)
        L117:
            boolean r18 = r30.readBit()
            if (r18 == 0) goto L120
            r0.skipBits(r4)
        L120:
            boolean r18 = r30.readBit()
            if (r18 == 0) goto L129
            r0.skipBits(r4)
        L129:
            boolean r18 = r30.readBit()
            if (r18 == 0) goto L132
            r0.skipBits(r4)
        L132:
            boolean r18 = r30.readBit()
            if (r18 == 0) goto L13b
            r0.skipBits(r4)
        L13b:
            boolean r18 = r30.readBit()
            if (r18 == 0) goto L144
            r0.skipBits(r4)
        L144:
            boolean r18 = r30.readBit()
            if (r18 == 0) goto L14d
            r0.skipBits(r4)
        L14d:
            boolean r18 = r30.readBit()
            if (r18 == 0) goto L165
            boolean r18 = r30.readBit()
            if (r18 == 0) goto L15c
            r0.skipBits(r4)
        L15c:
            boolean r18 = r30.readBit()
            if (r18 == 0) goto L165
            r0.skipBits(r4)
        L165:
            boolean r18 = r30.readBit()
            if (r18 == 0) goto L181
            r0.skipBits(r2)
            boolean r18 = r30.readBit()
            if (r18 == 0) goto L181
            r6 = 7
            r0.skipBits(r6)
            boolean r6 = r30.readBit()
            if (r6 == 0) goto L181
            r0.skipBits(r7)
        L181:
            int r3 = r3 + r10
            int r3 = r3 * 8
            r0.skipBits(r3)
            r30.byteAlign()
        L18a:
            if (r8 >= r10) goto L1a2
            boolean r3 = r30.readBit()
            r6 = 14
            if (r3 == 0) goto L197
            r0.skipBits(r6)
        L197:
            if (r8 != 0) goto L1a2
            boolean r3 = r30.readBit()
            if (r3 == 0) goto L1a2
            r0.skipBits(r6)
        L1a2:
            boolean r3 = r30.readBit()
            if (r3 == 0) goto L1bd
            if (r14 != 0) goto L1ae
            r0.skipBits(r2)
            goto L1bd
        L1ae:
            r3 = 0
        L1af:
            if (r3 >= r15) goto L1bd
            boolean r6 = r30.readBit()
            if (r6 == 0) goto L1ba
            r0.skipBits(r2)
        L1ba:
            int r3 = r3 + 1
            goto L1af
        L1bd:
            boolean r3 = r30.readBit()
            if (r3 == 0) goto L1ea
            r0.skipBits(r2)
            if (r8 != r10) goto L1cb
            r0.skipBits(r4)
        L1cb:
            r2 = 6
            if (r8 < r2) goto L1d1
            r0.skipBits(r10)
        L1d1:
            boolean r2 = r30.readBit()
            if (r2 == 0) goto L1da
            r0.skipBits(r7)
        L1da:
            if (r8 != 0) goto L1e5
            boolean r2 = r30.readBit()
            if (r2 == 0) goto L1e5
            r0.skipBits(r7)
        L1e5:
            if (r12 >= r9) goto L1ea
            r30.skipBit()
        L1ea:
            if (r1 != 0) goto L1f1
            if (r14 == r9) goto L1f1
            r30.skipBit()
        L1f1:
            if (r1 != r10) goto L200
            if (r14 == r9) goto L1fb
            boolean r2 = r30.readBit()
            if (r2 == 0) goto L200
        L1fb:
            r2 = 6
            r0.skipBits(r2)
            goto L201
        L200:
            r2 = 6
        L201:
            boolean r3 = r30.readBit()
            if (r3 == 0) goto L217
            int r2 = r0.readBits(r2)
            r3 = 1
            if (r2 != r3) goto L217
            int r0 = r0.readBits(r7)
            if (r0 != r3) goto L217
            java.lang.String r0 = "audio/eac3-joc"
            goto L219
        L217:
            java.lang.String r0 = "audio/eac3"
        L219:
            r21 = r0
            r22 = r1
            r26 = r5
            r25 = r11
            r24 = r13
            r27 = r16
            r23 = r19
            goto L289
        L228:
            r2 = 32
            r0.skipBits(r2)
            int r2 = r0.readBits(r10)
            if (r2 != r9) goto L235
            r3 = 0
            goto L237
        L235:
            java.lang.String r3 = "audio/ac3"
        L237:
            r4 = 6
            int r4 = r0.readBits(r4)
            int[] r5 = com.google.android.exoplayer2.audio.Ac3Util.BITRATE_BY_HALF_FRMSIZECOD
            int r6 = r4 / 2
            r5 = r5[r6]
            int r5 = r5 * 1000
            int r11 = getAc3SyncframeSize(r2, r4)
            r0.skipBits(r7)
            int r4 = r0.readBits(r9)
            r6 = r4 & 1
            if (r6 == 0) goto L259
            r6 = 1
            if (r4 == r6) goto L259
            r0.skipBits(r10)
        L259:
            r6 = r4 & 4
            if (r6 == 0) goto L260
            r0.skipBits(r10)
        L260:
            if (r4 != r10) goto L265
            r0.skipBits(r10)
        L265:
            int[] r6 = com.google.android.exoplayer2.audio.Ac3Util.SAMPLE_RATE_BY_FSCOD
            int r7 = r6.length
            if (r2 >= r7) goto L26e
            r2 = r6[r2]
            r13 = r2
            goto L26f
        L26e:
            r13 = -1
        L26f:
            r2 = 1536(0x600, float:2.152E-42)
            boolean r0 = r30.readBit()
            int[] r6 = com.google.android.exoplayer2.audio.Ac3Util.CHANNEL_COUNT_BY_ACMOD
            r4 = r6[r4]
            int r19 = r4 + r0
            r21 = r3
            r27 = r5
            r25 = r11
            r24 = r13
            r23 = r19
            r22 = -1
            r26 = 1536(0x600, float:2.152E-42)
        L289:
            com.google.android.exoplayer2.audio.Ac3Util$SyncFrameInfo r0 = new com.google.android.exoplayer2.audio.Ac3Util$SyncFrameInfo
            r28 = 0
            r20 = r0
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28)
            return r0
    }

    public static int parseAc3SyncframeSize(byte[] r5) {
            int r0 = r5.length
            r1 = 6
            if (r0 >= r1) goto L6
            r5 = -1
            return r5
        L6:
            r0 = 5
            r0 = r5[r0]
            r0 = r0 & 248(0xf8, float:3.48E-43)
            r2 = 3
            int r0 = r0 >> r2
            r3 = 10
            r4 = 1
            if (r0 <= r3) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            if (r0 == 0) goto L27
            r0 = 2
            r1 = r5[r0]
            r1 = r1 & 7
            int r1 = r1 << 8
            r5 = r5[r2]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r5 = r5 | r1
            int r5 = r5 + r4
            int r5 = r5 * 2
            return r5
        L27:
            r0 = 4
            r2 = r5[r0]
            r2 = r2 & 192(0xc0, float:2.69E-43)
            int r1 = r2 >> 6
            r5 = r5[r0]
            r5 = r5 & 63
            int r5 = getAc3SyncframeSize(r1, r5)
            return r5
    }

    public static com.google.android.exoplayer2.Format parseEAc3AnnexFFormat(com.google.android.exoplayer2.util.ParsableByteArray r7, java.lang.String r8, java.lang.String r9, @androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmInitData r10) {
            com.google.android.exoplayer2.util.ParsableBitArray r0 = new com.google.android.exoplayer2.util.ParsableBitArray
            r0.<init>()
            r0.reset(r7)
            r1 = 13
            int r1 = r0.readBits(r1)
            int r1 = r1 * 1000
            r2 = 3
            r0.skipBits(r2)
            r3 = 2
            int r3 = r0.readBits(r3)
            int[] r4 = com.google.android.exoplayer2.audio.Ac3Util.SAMPLE_RATE_BY_FSCOD
            r3 = r4[r3]
            r4 = 10
            r0.skipBits(r4)
            int[] r4 = com.google.android.exoplayer2.audio.Ac3Util.CHANNEL_COUNT_BY_ACMOD
            int r5 = r0.readBits(r2)
            r4 = r4[r5]
            r5 = 1
            int r6 = r0.readBits(r5)
            if (r6 == 0) goto L33
            int r4 = r4 + 1
        L33:
            r0.skipBits(r2)
            r2 = 4
            int r2 = r0.readBits(r2)
            r0.skipBits(r5)
            if (r2 <= 0) goto L4f
            r2 = 6
            r0.skipBytes(r2)
            int r2 = r0.readBits(r5)
            if (r2 == 0) goto L4c
            int r4 = r4 + 2
        L4c:
            r0.skipBits(r5)
        L4f:
            int r2 = r0.bitsLeft()
            r6 = 7
            if (r2 <= r6) goto L62
            r0.skipBits(r6)
            int r2 = r0.readBits(r5)
            if (r2 == 0) goto L62
            java.lang.String r2 = "audio/eac3-joc"
            goto L64
        L62:
            java.lang.String r2 = "audio/eac3"
        L64:
            r0.byteAlign()
            int r0 = r0.getBytePosition()
            r7.setPosition(r0)
            com.google.android.exoplayer2.Format$Builder r7 = new com.google.android.exoplayer2.Format$Builder
            r7.<init>()
            com.google.android.exoplayer2.Format$Builder r7 = r7.setId(r8)
            com.google.android.exoplayer2.Format$Builder r7 = r7.setSampleMimeType(r2)
            com.google.android.exoplayer2.Format$Builder r7 = r7.setChannelCount(r4)
            com.google.android.exoplayer2.Format$Builder r7 = r7.setSampleRate(r3)
            com.google.android.exoplayer2.Format$Builder r7 = r7.setDrmInitData(r10)
            com.google.android.exoplayer2.Format$Builder r7 = r7.setLanguage(r9)
            com.google.android.exoplayer2.Format$Builder r7 = r7.setPeakBitrate(r1)
            com.google.android.exoplayer2.Format r7 = r7.build()
            return r7
    }

    public static int parseTrueHdSyncframeAudioSampleCount(java.nio.ByteBuffer r3, int r4) {
            int r0 = r3.position()
            int r0 = r0 + r4
            int r0 = r0 + 7
            byte r0 = r3.get(r0)
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 187(0xbb, float:2.62E-43)
            if (r0 != r1) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            r1 = 40
            int r2 = r3.position()
            int r2 = r2 + r4
            if (r0 == 0) goto L20
            r4 = 9
            goto L22
        L20:
            r4 = 8
        L22:
            int r2 = r2 + r4
            byte r3 = r3.get(r2)
            int r3 = r3 >> 4
            r3 = r3 & 7
            int r3 = r1 << r3
            return r3
    }

    public static int parseTrueHdSyncframeAudioSampleCount(byte[] r5) {
            r0 = 4
            r1 = r5[r0]
            r2 = 0
            r3 = -8
            if (r1 != r3) goto L38
            r1 = 5
            r1 = r5[r1]
            r3 = 114(0x72, float:1.6E-43)
            if (r1 != r3) goto L38
            r1 = 6
            r1 = r5[r1]
            r3 = 111(0x6f, float:1.56E-43)
            if (r1 != r3) goto L38
            r1 = 7
            r3 = r5[r1]
            r3 = r3 & 254(0xfe, float:3.56E-43)
            r4 = 186(0xba, float:2.6E-43)
            if (r3 == r4) goto L1f
            goto L38
        L1f:
            r3 = r5[r1]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r4 = 187(0xbb, float:2.62E-43)
            if (r3 != r4) goto L28
            r2 = 1
        L28:
            r3 = 40
            if (r2 == 0) goto L2f
            r2 = 9
            goto L31
        L2f:
            r2 = 8
        L31:
            r5 = r5[r2]
            int r5 = r5 >> r0
            r5 = r5 & r1
            int r5 = r3 << r5
            return r5
        L38:
            return r2
    }
}
