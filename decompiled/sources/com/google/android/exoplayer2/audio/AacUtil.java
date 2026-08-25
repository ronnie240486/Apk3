package com.google.android.exoplayer2.audio;

/* JADX INFO: loaded from: classes2.dex */
public final class AacUtil {
    public static final int AAC_ELD_MAX_RATE_BYTES_PER_SECOND = 8000;
    public static final int AAC_HE_AUDIO_SAMPLE_COUNT = 2048;
    public static final int AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND = 16000;
    public static final int AAC_HE_V2_MAX_RATE_BYTES_PER_SECOND = 7000;
    public static final int AAC_LC_AUDIO_SAMPLE_COUNT = 1024;
    public static final int AAC_LC_MAX_RATE_BYTES_PER_SECOND = 100000;
    public static final int AAC_LD_AUDIO_SAMPLE_COUNT = 512;
    public static final int AAC_XHE_AUDIO_SAMPLE_COUNT = 1024;
    public static final int AAC_XHE_MAX_RATE_BYTES_PER_SECOND = 256000;
    public static final int AUDIO_OBJECT_TYPE_AAC_ELD = 23;
    public static final int AUDIO_OBJECT_TYPE_AAC_ER_BSAC = 22;
    public static final int AUDIO_OBJECT_TYPE_AAC_LC = 2;
    public static final int AUDIO_OBJECT_TYPE_AAC_PS = 29;
    public static final int AUDIO_OBJECT_TYPE_AAC_SBR = 5;
    public static final int AUDIO_OBJECT_TYPE_AAC_XHE = 42;
    private static final int AUDIO_OBJECT_TYPE_ESCAPE = 31;
    private static final int AUDIO_SPECIFIC_CONFIG_CHANNEL_CONFIGURATION_INVALID = -1;
    private static final int[] AUDIO_SPECIFIC_CONFIG_CHANNEL_COUNT_TABLE = null;
    private static final int AUDIO_SPECIFIC_CONFIG_FREQUENCY_INDEX_ARBITRARY = 15;
    private static final int[] AUDIO_SPECIFIC_CONFIG_SAMPLING_RATE_TABLE = null;
    private static final java.lang.String CODECS_STRING_PREFIX = "mp4a.40.";
    private static final java.lang.String TAG = "AacUtil";

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.AacUtil$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface AacAudioObjectType {
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Config {
        public final int channelCount;
        public final java.lang.String codecs;
        public final int sampleRateHz;

        private Config(int r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.<init>()
                r0.sampleRateHz = r1
                r0.channelCount = r2
                r0.codecs = r3
                return
        }

        public /* synthetic */ Config(int r1, int r2, java.lang.String r3, com.google.android.exoplayer2.audio.AacUtil.AnonymousClass1 r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }
    }

    static {
            r0 = 13
            int[] r0 = new int[r0]
            r0 = {x0014: FILL_ARRAY_DATA , data: [96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350} // fill-array
            com.google.android.exoplayer2.audio.AacUtil.AUDIO_SPECIFIC_CONFIG_SAMPLING_RATE_TABLE = r0
            r0 = 16
            int[] r0 = new int[r0]
            r0 = {x0032: FILL_ARRAY_DATA , data: [0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1} // fill-array
            com.google.android.exoplayer2.audio.AacUtil.AUDIO_SPECIFIC_CONFIG_CHANNEL_COUNT_TABLE = r0
            return
    }

    private AacUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static byte[] buildAacLcAudioSpecificConfig(int r6, int r7) {
            r0 = 0
            r1 = -1
            r2 = 0
            r3 = -1
        L4:
            int[] r4 = com.google.android.exoplayer2.audio.AacUtil.AUDIO_SPECIFIC_CONFIG_SAMPLING_RATE_TABLE
            int r5 = r4.length
            if (r2 >= r5) goto L11
            r4 = r4[r2]
            if (r6 != r4) goto Le
            r3 = r2
        Le:
            int r2 = r2 + 1
            goto L4
        L11:
            r2 = -1
        L12:
            int[] r4 = com.google.android.exoplayer2.audio.AacUtil.AUDIO_SPECIFIC_CONFIG_CHANNEL_COUNT_TABLE
            int r5 = r4.length
            if (r0 >= r5) goto L1f
            r4 = r4[r0]
            if (r7 != r4) goto L1c
            r2 = r0
        L1c:
            int r0 = r0 + 1
            goto L12
        L1f:
            if (r6 == r1) goto L29
            if (r2 == r1) goto L29
            r6 = 2
            byte[] r6 = buildAudioSpecificConfig(r6, r3, r2)
            return r6
        L29:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid sample rate or number of channels: "
            java.lang.String r2 = ", "
            java.lang.String r6 = androidx.emoji2.text.flatbuffer.Utf8Safe$UnpairedSurrogateException$$ExternalSyntheticOutline0.m(r1, r6, r2, r7)
            r0.<init>(r6)
            throw r0
    }

    public static byte[] buildAudioSpecificConfig(int r2, int r3, int r4) {
            r0 = 2
            byte[] r0 = new byte[r0]
            int r2 = r2 << 3
            r2 = r2 & 248(0xf8, float:3.48E-43)
            int r1 = r3 >> 1
            r1 = r1 & 7
            r2 = r2 | r1
            byte r2 = (byte) r2
            r1 = 0
            r0[r1] = r2
            int r2 = r3 << 7
            r2 = r2 & 128(0x80, float:1.8E-43)
            int r3 = r4 << 3
            r3 = r3 & 120(0x78, float:1.68E-43)
            r2 = r2 | r3
            byte r2 = (byte) r2
            r3 = 1
            r0[r3] = r2
            return r0
    }

    private static int getAudioObjectType(com.google.android.exoplayer2.util.ParsableBitArray r2) {
            r0 = 5
            int r0 = r2.readBits(r0)
            r1 = 31
            if (r0 != r1) goto L10
            r0 = 6
            int r2 = r2.readBits(r0)
            int r0 = r2 + 32
        L10:
            return r0
    }

    private static int getSamplingFrequency(com.google.android.exoplayer2.util.ParsableBitArray r3) throws com.google.android.exoplayer2.ParserException {
            r0 = 4
            int r0 = r3.readBits(r0)
            r1 = 0
            r2 = 15
            if (r0 != r2) goto L1e
            int r0 = r3.bitsLeft()
            r2 = 24
            if (r0 < r2) goto L17
            int r3 = r3.readBits(r2)
            goto L26
        L17:
            java.lang.String r3 = "AAC header insufficient data"
            com.google.android.exoplayer2.ParserException r3 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r3, r1)
            throw r3
        L1e:
            r3 = 13
            if (r0 >= r3) goto L27
            int[] r3 = com.google.android.exoplayer2.audio.AacUtil.AUDIO_SPECIFIC_CONFIG_SAMPLING_RATE_TABLE
            r3 = r3[r0]
        L26:
            return r3
        L27:
            java.lang.String r3 = "AAC header wrong Sampling Frequency Index"
            com.google.android.exoplayer2.ParserException r3 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r3, r1)
            throw r3
    }

    public static com.google.android.exoplayer2.audio.AacUtil.Config parseAudioSpecificConfig(com.google.android.exoplayer2.util.ParsableBitArray r7, boolean r8) throws com.google.android.exoplayer2.ParserException {
            int r0 = getAudioObjectType(r7)
            int r1 = getSamplingFrequency(r7)
            r2 = 4
            int r3 = r7.readBits(r2)
            java.lang.String r4 = "mp4a.40."
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4, r0)
            r5 = 5
            if (r0 == r5) goto L1a
            r5 = 29
            if (r0 != r5) goto L2a
        L1a:
            int r1 = getSamplingFrequency(r7)
            int r0 = getAudioObjectType(r7)
            r5 = 22
            if (r0 != r5) goto L2a
            int r3 = r7.readBits(r2)
        L2a:
            if (r8 == 0) goto L80
            r8 = 1
            r5 = 3
            r6 = 2
            if (r0 == r8) goto L5a
            if (r0 == r6) goto L5a
            if (r0 == r5) goto L5a
            if (r0 == r2) goto L5a
            r8 = 6
            if (r0 == r8) goto L5a
            r8 = 7
            if (r0 == r8) goto L5a
            r8 = 17
            if (r0 == r8) goto L5a
            switch(r0) {
                case 19: goto L5a;
                case 20: goto L5a;
                case 21: goto L5a;
                case 22: goto L5a;
                case 23: goto L5a;
                default: goto L44;
            }
        L44:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Unsupported audio object type: "
            r7.append(r8)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            com.google.android.exoplayer2.ParserException r7 = com.google.android.exoplayer2.ParserException.createForUnsupportedContainerFeature(r7)
            throw r7
        L5a:
            parseGaSpecificConfig(r7, r0, r3)
            switch(r0) {
                case 17: goto L61;
                case 18: goto L60;
                case 19: goto L61;
                case 20: goto L61;
                case 21: goto L61;
                case 22: goto L61;
                case 23: goto L61;
                default: goto L60;
            }
        L60:
            goto L80
        L61:
            int r7 = r7.readBits(r6)
            if (r7 == r6) goto L6a
            if (r7 == r5) goto L6a
            goto L80
        L6a:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Unsupported epConfig: "
            r8.append(r0)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            com.google.android.exoplayer2.ParserException r7 = com.google.android.exoplayer2.ParserException.createForUnsupportedContainerFeature(r7)
            throw r7
        L80:
            int[] r7 = com.google.android.exoplayer2.audio.AacUtil.AUDIO_SPECIFIC_CONFIG_CHANNEL_COUNT_TABLE
            r7 = r7[r3]
            r8 = -1
            r0 = 0
            if (r7 == r8) goto L8e
            com.google.android.exoplayer2.audio.AacUtil$Config r8 = new com.google.android.exoplayer2.audio.AacUtil$Config
            r8.<init>(r1, r7, r4, r0)
            return r8
        L8e:
            com.google.android.exoplayer2.ParserException r7 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r0, r0)
            throw r7
    }

    public static com.google.android.exoplayer2.audio.AacUtil.Config parseAudioSpecificConfig(byte[] r1) throws com.google.android.exoplayer2.ParserException {
            com.google.android.exoplayer2.util.ParsableBitArray r0 = new com.google.android.exoplayer2.util.ParsableBitArray
            r0.<init>(r1)
            r1 = 0
            com.google.android.exoplayer2.audio.AacUtil$Config r1 = parseAudioSpecificConfig(r0, r1)
            return r1
    }

    private static void parseGaSpecificConfig(com.google.android.exoplayer2.util.ParsableBitArray r3, int r4, int r5) {
            boolean r0 = r3.readBit()
            if (r0 == 0) goto Ld
            java.lang.String r0 = "AacUtil"
            java.lang.String r1 = "Unexpected frameLengthFlag = 1"
            com.google.android.exoplayer2.util.Log.w(r0, r1)
        Ld:
            boolean r0 = r3.readBit()
            if (r0 == 0) goto L18
            r0 = 14
            r3.skipBits(r0)
        L18:
            boolean r0 = r3.readBit()
            if (r5 == 0) goto L4a
            r5 = 6
            r1 = 20
            r2 = 3
            if (r4 == r5) goto L26
            if (r4 != r1) goto L29
        L26:
            r3.skipBits(r2)
        L29:
            if (r0 == 0) goto L49
            r5 = 22
            if (r4 != r5) goto L34
            r5 = 16
            r3.skipBits(r5)
        L34:
            r5 = 17
            if (r4 == r5) goto L42
            r5 = 19
            if (r4 == r5) goto L42
            if (r4 == r1) goto L42
            r5 = 23
            if (r4 != r5) goto L45
        L42:
            r3.skipBits(r2)
        L45:
            r4 = 1
            r3.skipBits(r4)
        L49:
            return
        L4a:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            r3.<init>()
            throw r3
    }
}
