package com.google.android.exoplayer2.mediacodec;

/* JADX INFO: loaded from: classes2.dex */
@android.annotation.SuppressLint({"InlinedApi"})
public final class MediaCodecUtil {
    private static final java.lang.String CODEC_ID_AV01 = "av01";
    private static final java.lang.String CODEC_ID_AVC1 = "avc1";
    private static final java.lang.String CODEC_ID_AVC2 = "avc2";
    private static final java.lang.String CODEC_ID_HEV1 = "hev1";
    private static final java.lang.String CODEC_ID_HVC1 = "hvc1";
    private static final java.lang.String CODEC_ID_MP4A = "mp4a";
    private static final java.lang.String CODEC_ID_VP09 = "vp09";
    private static final java.util.regex.Pattern PROFILE_PATTERN = null;
    private static final java.lang.String TAG = "MediaCodecUtil";

    @androidx.annotation.GuardedBy("MediaCodecUtil.class")
    private static final java.util.HashMap<com.google.android.exoplayer2.mediacodec.MediaCodecUtil.CodecKey, java.util.List<com.google.android.exoplayer2.mediacodec.MediaCodecInfo>> decoderInfosCache = null;
    private static int maxH264DecodableFrameSize;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class CodecKey {
        public final java.lang.String mimeType;
        public final boolean secure;
        public final boolean tunneling;

        public CodecKey(java.lang.String r1, boolean r2, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.mimeType = r1
                r0.secure = r2
                r0.tunneling = r3
                return
        }

        public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 == 0) goto L2b
                java.lang.Class r2 = r5.getClass()
                java.lang.Class<com.google.android.exoplayer2.mediacodec.MediaCodecUtil$CodecKey> r3 = com.google.android.exoplayer2.mediacodec.MediaCodecUtil.CodecKey.class
                if (r2 == r3) goto L10
                goto L2b
            L10:
                com.google.android.exoplayer2.mediacodec.MediaCodecUtil$CodecKey r5 = (com.google.android.exoplayer2.mediacodec.MediaCodecUtil.CodecKey) r5
                java.lang.String r2 = r4.mimeType
                java.lang.String r3 = r5.mimeType
                boolean r2 = android.text.TextUtils.equals(r2, r3)
                if (r2 == 0) goto L29
                boolean r2 = r4.secure
                boolean r3 = r5.secure
                if (r2 != r3) goto L29
                boolean r2 = r4.tunneling
                boolean r5 = r5.tunneling
                if (r2 != r5) goto L29
                goto L2a
            L29:
                r0 = 0
            L2a:
                return r0
            L2b:
                return r1
        }

        public int hashCode() {
                r3 = this;
                java.lang.String r0 = r3.mimeType
                r1 = 31
                r2 = 31
                int r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
                boolean r1 = r3.secure
                r2 = 1231(0x4cf, float:1.725E-42)
                if (r1 == 0) goto L13
                r1 = 1231(0x4cf, float:1.725E-42)
                goto L15
            L13:
                r1 = 1237(0x4d5, float:1.733E-42)
            L15:
                int r0 = r0 + r1
                int r0 = r0 * 31
                boolean r1 = r3.tunneling
                if (r1 == 0) goto L1d
                goto L1f
            L1d:
                r2 = 1237(0x4d5, float:1.733E-42)
            L1f:
                int r0 = r0 + r2
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class DecoderQueryException extends java.lang.Exception {
        private DecoderQueryException(java.lang.Throwable r2) {
                r1 = this;
                java.lang.String r0 = "Failed to query underlying media codecs"
                r1.<init>(r0, r2)
                return
        }

        public /* synthetic */ DecoderQueryException(java.lang.Throwable r1, com.google.android.exoplayer2.mediacodec.MediaCodecUtil.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    public interface MediaCodecListCompat {
        int getCodecCount();

        android.media.MediaCodecInfo getCodecInfoAt(int r1);

        boolean isFeatureRequired(java.lang.String r1, java.lang.String r2, android.media.MediaCodecInfo.CodecCapabilities r3);

        boolean isFeatureSupported(java.lang.String r1, java.lang.String r2, android.media.MediaCodecInfo.CodecCapabilities r3);

        boolean secureDecodersExplicit();
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class MediaCodecListCompatV16 implements com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat {
        private MediaCodecListCompatV16() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ MediaCodecListCompatV16(com.google.android.exoplayer2.mediacodec.MediaCodecUtil.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public int getCodecCount() {
                r1 = this;
                int r0 = android.media.MediaCodecList.getCodecCount()
                return r0
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public android.media.MediaCodecInfo getCodecInfoAt(int r1) {
                r0 = this;
                android.media.MediaCodecInfo r1 = android.media.MediaCodecList.getCodecInfoAt(r1)
                return r1
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean isFeatureRequired(java.lang.String r1, java.lang.String r2, android.media.MediaCodecInfo.CodecCapabilities r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean isFeatureSupported(java.lang.String r1, java.lang.String r2, android.media.MediaCodecInfo.CodecCapabilities r3) {
                r0 = this;
                java.lang.String r3 = "secure-playback"
                boolean r1 = r3.equals(r1)
                if (r1 == 0) goto L14
                java.lang.String r1 = "video/avc"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L14
                r1 = 1
                goto L15
            L14:
                r1 = 0
            L15:
                return r1
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean secureDecodersExplicit() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(21)
    public static final class MediaCodecListCompatV21 implements com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat {
        private final int codecKind;

        @androidx.annotation.Nullable
        private android.media.MediaCodecInfo[] mediaCodecInfos;

        public MediaCodecListCompatV21(boolean r1, boolean r2) {
                r0 = this;
                r0.<init>()
                if (r1 != 0) goto La
                if (r2 == 0) goto L8
                goto La
            L8:
                r1 = 0
                goto Lb
            La:
                r1 = 1
            Lb:
                r0.codecKind = r1
                return
        }

        @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"mediaCodecInfos"})
        private void ensureMediaCodecInfosInitialized() {
                r2 = this;
                android.media.MediaCodecInfo[] r0 = r2.mediaCodecInfos
                if (r0 != 0) goto L11
                android.media.MediaCodecList r0 = new android.media.MediaCodecList
                int r1 = r2.codecKind
                r0.<init>(r1)
                android.media.MediaCodecInfo[] r0 = r0.getCodecInfos()
                r2.mediaCodecInfos = r0
            L11:
                return
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public int getCodecCount() {
                r1 = this;
                r1.ensureMediaCodecInfosInitialized()
                android.media.MediaCodecInfo[] r0 = r1.mediaCodecInfos
                int r0 = r0.length
                return r0
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public android.media.MediaCodecInfo getCodecInfoAt(int r2) {
                r1 = this;
                r1.ensureMediaCodecInfosInitialized()
                android.media.MediaCodecInfo[] r0 = r1.mediaCodecInfos
                r2 = r0[r2]
                return r2
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean isFeatureRequired(java.lang.String r1, java.lang.String r2, android.media.MediaCodecInfo.CodecCapabilities r3) {
                r0 = this;
                boolean r1 = r3.isFeatureRequired(r1)
                return r1
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean isFeatureSupported(java.lang.String r1, java.lang.String r2, android.media.MediaCodecInfo.CodecCapabilities r3) {
                r0 = this;
                boolean r1 = r3.isFeatureSupported(r1)
                return r1
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean secureDecodersExplicit() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface ScoreProvider<T> {
        int getScore(T r1);
    }

    public static /* synthetic */ int $r8$lambda$M5hE_IS4eQaB5hthj0ANtGFbvtc(com.google.android.exoplayer2.mediacodec.MediaCodecInfo r0) {
            int r0 = lambda$applyWorkarounds$1(r0)
            return r0
    }

    public static /* synthetic */ int $r8$lambda$TTOJv_ehB4NYXe2ACOCGkvLnFQ0(com.google.android.exoplayer2.mediacodec.MediaCodecInfo r0) {
            int r0 = lambda$applyWorkarounds$2(r0)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$axdf_bjITTf0O2Bcy0Wsd-ELv-k, reason: not valid java name */
    public static /* synthetic */ int m228$r8$lambda$axdf_bjITTf0O2Bcy0WsdELvk(com.google.android.exoplayer2.Format r0, com.google.android.exoplayer2.mediacodec.MediaCodecInfo r1) {
            int r0 = lambda$getDecoderInfosSortedByFormatSupport$0(r0, r1)
            return r0
    }

    public static /* synthetic */ int $r8$lambda$eb1eLnei3ECRx2nVLLB_x3DyeoQ(com.google.android.exoplayer2.mediacodec.MediaCodecUtil.ScoreProvider r0, java.lang.Object r1, java.lang.Object r2) {
            int r0 = lambda$sortByScore$3(r0, r1, r2)
            return r0
    }

    static {
            java.lang.String r0 = "^\\D?(\\d+)$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.mediacodec.MediaCodecUtil.PROFILE_PATTERN = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.google.android.exoplayer2.mediacodec.MediaCodecUtil.decoderInfosCache = r0
            r0 = -1
            com.google.android.exoplayer2.mediacodec.MediaCodecUtil.maxH264DecodableFrameSize = r0
            return
    }

    private MediaCodecUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void applyWorkarounds(java.lang.String r11, java.util.List<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> r12) {
            java.lang.String r0 = "audio/raw"
            boolean r11 = r0.equals(r11)
            r0 = 1
            r1 = 0
            if (r11 == 0) goto L48
            int r11 = com.google.android.exoplayer2.util.Util.SDK_INT
            r2 = 26
            if (r11 >= r2) goto L43
            java.lang.String r11 = com.google.android.exoplayer2.util.Util.DEVICE
            java.lang.String r2 = "R9"
            boolean r11 = r11.equals(r2)
            if (r11 == 0) goto L43
            int r11 = r12.size()
            if (r11 != r0) goto L43
            java.lang.Object r11 = r12.get(r1)
            com.google.android.exoplayer2.mediacodec.MediaCodecInfo r11 = (com.google.android.exoplayer2.mediacodec.MediaCodecInfo) r11
            java.lang.String r11 = r11.name
            java.lang.String r2 = "OMX.MTK.AUDIO.DECODER.RAW"
            boolean r11 = r11.equals(r2)
            if (r11 == 0) goto L43
            r5 = 0
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            java.lang.String r2 = "OMX.google.raw.decoder"
            java.lang.String r3 = "audio/raw"
            java.lang.String r4 = "audio/raw"
            com.google.android.exoplayer2.mediacodec.MediaCodecInfo r11 = com.google.android.exoplayer2.mediacodec.MediaCodecInfo.newInstance(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r12.add(r11)
        L43:
            com.google.android.exoplayer2.mediacodec.MediaCodecUtil$$ExternalSyntheticLambda1 r11 = com.google.android.exoplayer2.mediacodec.MediaCodecUtil$$ExternalSyntheticLambda1.INSTANCE
            sortByScore(r12, r11)
        L48:
            int r11 = com.google.android.exoplayer2.util.Util.SDK_INT
            r2 = 21
            if (r11 >= r2) goto L79
            int r2 = r12.size()
            if (r2 <= r0) goto L79
            java.lang.Object r2 = r12.get(r1)
            com.google.android.exoplayer2.mediacodec.MediaCodecInfo r2 = (com.google.android.exoplayer2.mediacodec.MediaCodecInfo) r2
            java.lang.String r2 = r2.name
            java.lang.String r3 = "OMX.SEC.mp3.dec"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L74
            java.lang.String r3 = "OMX.SEC.MP3.Decoder"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L74
            java.lang.String r3 = "OMX.brcm.audio.mp3.decoder"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L79
        L74:
            com.google.android.exoplayer2.mediacodec.MediaCodecUtil$$ExternalSyntheticLambda1 r2 = com.google.android.exoplayer2.mediacodec.MediaCodecUtil$$ExternalSyntheticLambda1.INSTANCE$1
            sortByScore(r12, r2)
        L79:
            r2 = 32
            if (r11 >= r2) goto L9c
            int r11 = r12.size()
            if (r11 <= r0) goto L9c
            java.lang.Object r11 = r12.get(r1)
            com.google.android.exoplayer2.mediacodec.MediaCodecInfo r11 = (com.google.android.exoplayer2.mediacodec.MediaCodecInfo) r11
            java.lang.String r11 = r11.name
            java.lang.String r0 = "OMX.qti.audio.decoder.flac"
            boolean r11 = r0.equals(r11)
            if (r11 == 0) goto L9c
            java.lang.Object r11 = r12.remove(r1)
            com.google.android.exoplayer2.mediacodec.MediaCodecInfo r11 = (com.google.android.exoplayer2.mediacodec.MediaCodecInfo) r11
            r12.add(r11)
        L9c:
            return
    }

    private static int av1LevelNumberToConst(int r0) {
            switch(r0) {
                case 0: goto L49;
                case 1: goto L47;
                case 2: goto L45;
                case 3: goto L42;
                case 4: goto L3f;
                case 5: goto L3c;
                case 6: goto L39;
                case 7: goto L36;
                case 8: goto L33;
                case 9: goto L30;
                case 10: goto L2d;
                case 11: goto L2a;
                case 12: goto L27;
                case 13: goto L24;
                case 14: goto L21;
                case 15: goto L1d;
                case 16: goto L1a;
                case 17: goto L17;
                case 18: goto L14;
                case 19: goto L11;
                case 20: goto Le;
                case 21: goto Lb;
                case 22: goto L8;
                case 23: goto L5;
                default: goto L3;
            }
        L3:
            r0 = -1
            return r0
        L5:
            r0 = 8388608(0x800000, float:1.1754944E-38)
            return r0
        L8:
            r0 = 4194304(0x400000, float:5.877472E-39)
            return r0
        Lb:
            r0 = 2097152(0x200000, float:2.938736E-39)
            return r0
        Le:
            r0 = 1048576(0x100000, float:1.469368E-39)
            return r0
        L11:
            r0 = 524288(0x80000, float:7.34684E-40)
            return r0
        L14:
            r0 = 262144(0x40000, float:3.67342E-40)
            return r0
        L17:
            r0 = 131072(0x20000, float:1.83671E-40)
            return r0
        L1a:
            r0 = 65536(0x10000, float:9.1835E-41)
            return r0
        L1d:
            r0 = 32768(0x8000, float:4.5918E-41)
            return r0
        L21:
            r0 = 16384(0x4000, float:2.2959E-41)
            return r0
        L24:
            r0 = 8192(0x2000, float:1.148E-41)
            return r0
        L27:
            r0 = 4096(0x1000, float:5.74E-42)
            return r0
        L2a:
            r0 = 2048(0x800, float:2.87E-42)
            return r0
        L2d:
            r0 = 1024(0x400, float:1.435E-42)
            return r0
        L30:
            r0 = 512(0x200, float:7.17E-43)
            return r0
        L33:
            r0 = 256(0x100, float:3.59E-43)
            return r0
        L36:
            r0 = 128(0x80, float:1.8E-43)
            return r0
        L39:
            r0 = 64
            return r0
        L3c:
            r0 = 32
            return r0
        L3f:
            r0 = 16
            return r0
        L42:
            r0 = 8
            return r0
        L45:
            r0 = 4
            return r0
        L47:
            r0 = 2
            return r0
        L49:
            r0 = 1
            return r0
    }

    private static int avcLevelNumberToConst(int r0) {
            switch(r0) {
                case 10: goto L3e;
                case 11: goto L3c;
                case 12: goto L39;
                case 13: goto L36;
                default: goto L3;
            }
        L3:
            switch(r0) {
                case 20: goto L33;
                case 21: goto L30;
                case 22: goto L2d;
                default: goto L6;
            }
        L6:
            switch(r0) {
                case 30: goto L2a;
                case 31: goto L27;
                case 32: goto L24;
                default: goto L9;
            }
        L9:
            switch(r0) {
                case 40: goto L21;
                case 41: goto L1e;
                case 42: goto L1b;
                default: goto Lc;
            }
        Lc:
            switch(r0) {
                case 50: goto L18;
                case 51: goto L14;
                case 52: goto L11;
                default: goto Lf;
            }
        Lf:
            r0 = -1
            return r0
        L11:
            r0 = 65536(0x10000, float:9.1835E-41)
            return r0
        L14:
            r0 = 32768(0x8000, float:4.5918E-41)
            return r0
        L18:
            r0 = 16384(0x4000, float:2.2959E-41)
            return r0
        L1b:
            r0 = 8192(0x2000, float:1.148E-41)
            return r0
        L1e:
            r0 = 4096(0x1000, float:5.74E-42)
            return r0
        L21:
            r0 = 2048(0x800, float:2.87E-42)
            return r0
        L24:
            r0 = 1024(0x400, float:1.435E-42)
            return r0
        L27:
            r0 = 512(0x200, float:7.17E-43)
            return r0
        L2a:
            r0 = 256(0x100, float:3.59E-43)
            return r0
        L2d:
            r0 = 128(0x80, float:1.8E-43)
            return r0
        L30:
            r0 = 64
            return r0
        L33:
            r0 = 32
            return r0
        L36:
            r0 = 16
            return r0
        L39:
            r0 = 8
            return r0
        L3c:
            r0 = 4
            return r0
        L3e:
            r0 = 1
            return r0
    }

    private static int avcLevelToMaxFrameSize(int r1) {
            r0 = 1
            if (r1 == r0) goto L2e
            r0 = 2
            if (r1 == r0) goto L2e
            switch(r1) {
                case 8: goto L2a;
                case 16: goto L2a;
                case 32: goto L2a;
                case 64: goto L26;
                case 128: goto L22;
                case 256: goto L22;
                case 512: goto L1e;
                case 1024: goto L1b;
                case 2048: goto L18;
                case 4096: goto L18;
                case 8192: goto L15;
                case 16384: goto L11;
                case 32768: goto Le;
                case 65536: goto Le;
                case 131072: goto Lb;
                case 262144: goto Lb;
                case 524288: goto Lb;
                default: goto L9;
            }
        L9:
            r1 = -1
            return r1
        Lb:
            r1 = 35651584(0x2200000, float:1.1754944E-37)
            return r1
        Le:
            r1 = 9437184(0x900000, float:1.3224311E-38)
            return r1
        L11:
            r1 = 5652480(0x564000, float:7.920812E-39)
            return r1
        L15:
            r1 = 2228224(0x220000, float:3.122407E-39)
            return r1
        L18:
            r1 = 2097152(0x200000, float:2.938736E-39)
            return r1
        L1b:
            r1 = 1310720(0x140000, float:1.83671E-39)
            return r1
        L1e:
            r1 = 921600(0xe1000, float:1.291437E-39)
            return r1
        L22:
            r1 = 414720(0x65400, float:5.81146E-40)
            return r1
        L26:
            r1 = 202752(0x31800, float:2.84116E-40)
            return r1
        L2a:
            r1 = 101376(0x18c00, float:1.42058E-40)
            return r1
        L2e:
            r1 = 25344(0x6300, float:3.5515E-41)
            return r1
    }

    private static int avcProfileNumberToConst(int r1) {
            r0 = 66
            if (r1 == r0) goto L2e
            r0 = 77
            if (r1 == r0) goto L2c
            r0 = 88
            if (r1 == r0) goto L2a
            r0 = 100
            if (r1 == r0) goto L27
            r0 = 110(0x6e, float:1.54E-43)
            if (r1 == r0) goto L24
            r0 = 122(0x7a, float:1.71E-43)
            if (r1 == r0) goto L21
            r0 = 244(0xf4, float:3.42E-43)
            if (r1 == r0) goto L1e
            r1 = -1
            return r1
        L1e:
            r1 = 64
            return r1
        L21:
            r1 = 32
            return r1
        L24:
            r1 = 16
            return r1
        L27:
            r1 = 8
            return r1
        L2a:
            r1 = 4
            return r1
        L2c:
            r1 = 2
            return r1
        L2e:
            r1 = 1
            return r1
    }

    @androidx.annotation.VisibleForTesting
    public static synchronized void clearDecoderInfoCache() {
            java.lang.Class<com.google.android.exoplayer2.mediacodec.MediaCodecUtil> r0 = com.google.android.exoplayer2.mediacodec.MediaCodecUtil.class
            monitor-enter(r0)
            java.util.HashMap<com.google.android.exoplayer2.mediacodec.MediaCodecUtil$CodecKey, java.util.List<com.google.android.exoplayer2.mediacodec.MediaCodecInfo>> r1 = com.google.android.exoplayer2.mediacodec.MediaCodecUtil.decoderInfosCache     // Catch: java.lang.Throwable -> La
            r1.clear()     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)
            return
        La:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @androidx.annotation.Nullable
    private static java.lang.Integer dolbyVisionStringToLevel(@androidx.annotation.Nullable java.lang.String r7) {
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            r1 = -1
            int r2 = r7.hashCode()
            r3 = 8
            r4 = 4
            r5 = 2
            r6 = 1
            switch(r2) {
                case 1537: goto La6;
                case 1538: goto L9b;
                case 1539: goto L90;
                case 1540: goto L85;
                case 1541: goto L7a;
                case 1542: goto L6f;
                case 1543: goto L64;
                case 1544: goto L59;
                case 1545: goto L4b;
                case 1567: goto L3d;
                case 1568: goto L2f;
                case 1569: goto L21;
                case 1570: goto L13;
                default: goto L11;
            }
        L11:
            goto Lb0
        L13:
            java.lang.String r2 = "13"
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L1d
            goto Lb0
        L1d:
            r1 = 12
            goto Lb0
        L21:
            java.lang.String r2 = "12"
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L2b
            goto Lb0
        L2b:
            r1 = 11
            goto Lb0
        L2f:
            java.lang.String r2 = "11"
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L39
            goto Lb0
        L39:
            r1 = 10
            goto Lb0
        L3d:
            java.lang.String r2 = "10"
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L47
            goto Lb0
        L47:
            r1 = 9
            goto Lb0
        L4b:
            java.lang.String r2 = "09"
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L55
            goto Lb0
        L55:
            r1 = 8
            goto Lb0
        L59:
            java.lang.String r2 = "08"
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L62
            goto Lb0
        L62:
            r1 = 7
            goto Lb0
        L64:
            java.lang.String r2 = "07"
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L6d
            goto Lb0
        L6d:
            r1 = 6
            goto Lb0
        L6f:
            java.lang.String r2 = "06"
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L78
            goto Lb0
        L78:
            r1 = 5
            goto Lb0
        L7a:
            java.lang.String r2 = "05"
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L83
            goto Lb0
        L83:
            r1 = 4
            goto Lb0
        L85:
            java.lang.String r2 = "04"
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L8e
            goto Lb0
        L8e:
            r1 = 3
            goto Lb0
        L90:
            java.lang.String r2 = "03"
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L99
            goto Lb0
        L99:
            r1 = 2
            goto Lb0
        L9b:
            java.lang.String r2 = "02"
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto La4
            goto Lb0
        La4:
            r1 = 1
            goto Lb0
        La6:
            java.lang.String r2 = "01"
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto Laf
            goto Lb0
        Laf:
            r1 = 0
        Lb0:
            switch(r1) {
                case 0: goto L102;
                case 1: goto Lfd;
                case 2: goto Lf8;
                case 3: goto Lf3;
                case 4: goto Lec;
                case 5: goto Le5;
                case 6: goto Lde;
                case 7: goto Ld7;
                case 8: goto Ld0;
                case 9: goto Lc9;
                case 10: goto Lc2;
                case 11: goto Lbb;
                case 12: goto Lb4;
                default: goto Lb3;
            }
        Lb3:
            return r0
        Lb4:
            r7 = 4096(0x1000, float:5.74E-42)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            return r7
        Lbb:
            r7 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            return r7
        Lc2:
            r7 = 1024(0x400, float:1.435E-42)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            return r7
        Lc9:
            r7 = 512(0x200, float:7.17E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            return r7
        Ld0:
            r7 = 256(0x100, float:3.59E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            return r7
        Ld7:
            r7 = 128(0x80, float:1.8E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            return r7
        Lde:
            r7 = 64
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            return r7
        Le5:
            r7 = 32
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            return r7
        Lec:
            r7 = 16
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            return r7
        Lf3:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            return r7
        Lf8:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            return r7
        Lfd:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            return r7
        L102:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            return r7
    }

    @androidx.annotation.Nullable
    private static java.lang.Integer dolbyVisionStringToProfile(@androidx.annotation.Nullable java.lang.String r7) {
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            r1 = -1
            int r2 = r7.hashCode()
            r3 = 8
            r4 = 4
            r5 = 2
            r6 = 1
            switch(r2) {
                case 1536: goto L7c;
                case 1537: goto L71;
                case 1538: goto L66;
                case 1539: goto L5b;
                case 1540: goto L50;
                case 1541: goto L45;
                case 1542: goto L3a;
                case 1543: goto L2f;
                case 1544: goto L21;
                case 1545: goto L13;
                default: goto L11;
            }
        L11:
            goto L86
        L13:
            java.lang.String r2 = "09"
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L1d
            goto L86
        L1d:
            r1 = 9
            goto L86
        L21:
            java.lang.String r2 = "08"
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L2b
            goto L86
        L2b:
            r1 = 8
            goto L86
        L2f:
            java.lang.String r2 = "07"
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L38
            goto L86
        L38:
            r1 = 7
            goto L86
        L3a:
            java.lang.String r2 = "06"
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L43
            goto L86
        L43:
            r1 = 6
            goto L86
        L45:
            java.lang.String r2 = "05"
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L4e
            goto L86
        L4e:
            r1 = 5
            goto L86
        L50:
            java.lang.String r2 = "04"
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L59
            goto L86
        L59:
            r1 = 4
            goto L86
        L5b:
            java.lang.String r2 = "03"
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L64
            goto L86
        L64:
            r1 = 3
            goto L86
        L66:
            java.lang.String r2 = "02"
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L6f
            goto L86
        L6f:
            r1 = 2
            goto L86
        L71:
            java.lang.String r2 = "01"
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L7a
            goto L86
        L7a:
            r1 = 1
            goto L86
        L7c:
            java.lang.String r2 = "00"
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L85
            goto L86
        L85:
            r1 = 0
        L86:
            switch(r1) {
                case 0: goto Lc3;
                case 1: goto Lbe;
                case 2: goto Lb9;
                case 3: goto Lb4;
                case 4: goto Lad;
                case 5: goto La6;
                case 6: goto L9f;
                case 7: goto L98;
                case 8: goto L91;
                case 9: goto L8a;
                default: goto L89;
            }
        L89:
            return r0
        L8a:
            r7 = 512(0x200, float:7.17E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            return r7
        L91:
            r7 = 256(0x100, float:3.59E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            return r7
        L98:
            r7 = 128(0x80, float:1.8E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            return r7
        L9f:
            r7 = 64
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            return r7
        La6:
            r7 = 32
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            return r7
        Lad:
            r7 = 16
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            return r7
        Lb4:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            return r7
        Lb9:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            return r7
        Lbe:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            return r7
        Lc3:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            return r7
    }

    @androidx.annotation.Nullable
    private static android.util.Pair<java.lang.Integer, java.lang.Integer> getAacCodecProfileAndLevel(java.lang.String r5, java.lang.String[] r6) {
            int r0 = r6.length
            r1 = 0
            java.lang.String r2 = "Ignoring malformed MP4A codec string: "
            java.lang.String r3 = "MediaCodecUtil"
            r4 = 3
            if (r0 == r4) goto Ld
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m27m(r2, r5, r3)
            return r1
        Ld:
            r0 = 1
            r0 = r6[r0]     // Catch: java.lang.NumberFormatException -> L3f
            r4 = 16
            int r0 = java.lang.Integer.parseInt(r0, r4)     // Catch: java.lang.NumberFormatException -> L3f
            java.lang.String r0 = com.google.android.exoplayer2.util.MimeTypes.getMimeTypeFromMp4ObjectType(r0)     // Catch: java.lang.NumberFormatException -> L3f
            java.lang.String r4 = "audio/mp4a-latm"
            boolean r0 = r4.equals(r0)     // Catch: java.lang.NumberFormatException -> L3f
            if (r0 == 0) goto L42
            r0 = 2
            r6 = r6[r0]     // Catch: java.lang.NumberFormatException -> L3f
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.NumberFormatException -> L3f
            int r6 = mp4aAudioObjectTypeToProfile(r6)     // Catch: java.lang.NumberFormatException -> L3f
            r0 = -1
            if (r6 == r0) goto L42
            android.util.Pair r0 = new android.util.Pair     // Catch: java.lang.NumberFormatException -> L3f
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.NumberFormatException -> L3f
            r4 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.NumberFormatException -> L3f
            r0.<init>(r6, r4)     // Catch: java.lang.NumberFormatException -> L3f
            return r0
        L3f:
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m27m(r2, r5, r3)
        L42:
            return r1
    }

    @androidx.annotation.Nullable
    public static java.lang.String getAlternativeCodecMimeType(com.google.android.exoplayer2.Format r2) {
            java.lang.String r0 = r2.sampleMimeType
            java.lang.String r1 = "audio/eac3-joc"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Ld
            java.lang.String r2 = "audio/eac3"
            return r2
        Ld:
            java.lang.String r0 = r2.sampleMimeType
            java.lang.String r1 = "video/dolby-vision"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L3b
            android.util.Pair r2 = getCodecProfileAndLevel(r2)
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r2.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0 = 16
            if (r2 == r0) goto L37
            r0 = 256(0x100, float:3.59E-43)
            if (r2 != r0) goto L2f
            goto L37
        L2f:
            r0 = 512(0x200, float:7.17E-43)
            if (r2 != r0) goto L3b
            java.lang.String r2 = "video/avc"
            return r2
        L37:
            java.lang.String r2 = "video/hevc"
            return r2
        L3b:
            r2 = 0
            return r2
    }

    @androidx.annotation.Nullable
    private static android.util.Pair<java.lang.Integer, java.lang.Integer> getAv1ProfileAndLevel(java.lang.String r8, java.lang.String[] r9, @androidx.annotation.Nullable com.google.android.exoplayer2.video.ColorInfo r10) {
            int r0 = r9.length
            java.lang.String r1 = "Ignoring malformed AV1 codec string: "
            r2 = 0
            java.lang.String r3 = "MediaCodecUtil"
            r4 = 4
            if (r0 >= r4) goto Ld
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m27m(r1, r8, r3)
            return r2
        Ld:
            r0 = 1
            r4 = r9[r0]     // Catch: java.lang.NumberFormatException -> L6d
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> L6d
            r5 = 2
            r6 = r9[r5]     // Catch: java.lang.NumberFormatException -> L6d
            r7 = 0
            java.lang.String r5 = r6.substring(r7, r5)     // Catch: java.lang.NumberFormatException -> L6d
            int r5 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.NumberFormatException -> L6d
            r6 = 3
            r9 = r9[r6]     // Catch: java.lang.NumberFormatException -> L6d
            int r8 = java.lang.Integer.parseInt(r9)     // Catch: java.lang.NumberFormatException -> L6d
            if (r4 == 0) goto L2f
            java.lang.String r8 = "Unknown AV1 profile: "
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m26m(r8, r4, r3)
            return r2
        L2f:
            r9 = 8
            if (r8 == r9) goto L3d
            r1 = 10
            if (r8 == r1) goto L3d
            java.lang.String r9 = "Unknown AV1 bit depth: "
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m26m(r9, r8, r3)
            return r2
        L3d:
            if (r8 != r9) goto L40
            goto L52
        L40:
            if (r10 == 0) goto L51
            byte[] r8 = r10.hdrStaticInfo
            if (r8 != 0) goto L4e
            int r8 = r10.colorTransfer
            r9 = 7
            if (r8 == r9) goto L4e
            r9 = 6
            if (r8 != r9) goto L51
        L4e:
            r0 = 4096(0x1000, float:5.74E-42)
            goto L52
        L51:
            r0 = 2
        L52:
            int r8 = av1LevelNumberToConst(r5)
            r9 = -1
            if (r8 != r9) goto L5f
            java.lang.String r8 = "Unknown AV1 level: "
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m26m(r8, r5, r3)
            return r2
        L5f:
            android.util.Pair r9 = new android.util.Pair
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9.<init>(r10, r8)
            return r9
        L6d:
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m27m(r1, r8, r3)
            return r2
    }

    @androidx.annotation.Nullable
    private static android.util.Pair<java.lang.Integer, java.lang.Integer> getAvcProfileAndLevel(java.lang.String r7, java.lang.String[] r8) {
            int r0 = r8.length
            java.lang.String r1 = "Ignoring malformed AVC codec string: "
            r2 = 2
            r3 = 0
            java.lang.String r4 = "MediaCodecUtil"
            if (r0 >= r2) goto Ld
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m27m(r1, r7, r4)
            return r3
        Ld:
            r0 = 1
            r5 = r8[r0]     // Catch: java.lang.NumberFormatException -> L7b
            int r5 = r5.length()     // Catch: java.lang.NumberFormatException -> L7b
            r6 = 6
            if (r5 != r6) goto L30
            r5 = r8[r0]     // Catch: java.lang.NumberFormatException -> L7b
            r6 = 0
            java.lang.String r2 = r5.substring(r6, r2)     // Catch: java.lang.NumberFormatException -> L7b
            r5 = 16
            int r2 = java.lang.Integer.parseInt(r2, r5)     // Catch: java.lang.NumberFormatException -> L7b
            r8 = r8[r0]     // Catch: java.lang.NumberFormatException -> L7b
            r0 = 4
            java.lang.String r8 = r8.substring(r0)     // Catch: java.lang.NumberFormatException -> L7b
            int r7 = java.lang.Integer.parseInt(r8, r5)     // Catch: java.lang.NumberFormatException -> L7b
            goto L41
        L30:
            int r5 = r8.length     // Catch: java.lang.NumberFormatException -> L7b
            r6 = 3
            if (r5 < r6) goto L68
            r0 = r8[r0]     // Catch: java.lang.NumberFormatException -> L7b
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L7b
            r8 = r8[r2]     // Catch: java.lang.NumberFormatException -> L7b
            int r7 = java.lang.Integer.parseInt(r8)     // Catch: java.lang.NumberFormatException -> L7b
            r2 = r0
        L41:
            int r8 = avcProfileNumberToConst(r2)
            r0 = -1
            if (r8 != r0) goto L4e
            java.lang.String r7 = "Unknown AVC profile: "
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m26m(r7, r2, r4)
            return r3
        L4e:
            int r1 = avcLevelNumberToConst(r7)
            if (r1 != r0) goto L5a
            java.lang.String r8 = "Unknown AVC level: "
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m26m(r8, r7, r4)
            return r3
        L5a:
            android.util.Pair r7 = new android.util.Pair
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r7.<init>(r8, r0)
            return r7
        L68:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L7b
            r8.<init>()     // Catch: java.lang.NumberFormatException -> L7b
            r8.append(r1)     // Catch: java.lang.NumberFormatException -> L7b
            r8.append(r7)     // Catch: java.lang.NumberFormatException -> L7b
            java.lang.String r8 = r8.toString()     // Catch: java.lang.NumberFormatException -> L7b
            com.google.android.exoplayer2.util.Log.w(r4, r8)     // Catch: java.lang.NumberFormatException -> L7b
            return r3
        L7b:
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m27m(r1, r7, r4)
            return r3
    }

    @androidx.annotation.Nullable
    private static java.lang.String getCodecMimeType(android.media.MediaCodecInfo r4, java.lang.String r5, java.lang.String r6) {
            java.lang.String[] r4 = r4.getSupportedTypes()
            int r0 = r4.length
            r1 = 0
        L6:
            if (r1 >= r0) goto L14
            r2 = r4[r1]
            boolean r3 = r2.equalsIgnoreCase(r6)
            if (r3 == 0) goto L11
            return r2
        L11:
            int r1 = r1 + 1
            goto L6
        L14:
            java.lang.String r4 = "video/dolby-vision"
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L3d
            java.lang.String r4 = "OMX.MS.HEVCDV.Decoder"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L29
            java.lang.String r4 = "video/hevcdv"
            return r4
        L29:
            java.lang.String r4 = "OMX.RTK.video.decoder"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L39
            java.lang.String r4 = "OMX.realtek.video.decoder.tunneled"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L76
        L39:
            java.lang.String r4 = "video/dv_hevc"
            return r4
        L3d:
            java.lang.String r4 = "audio/alac"
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L50
            java.lang.String r4 = "OMX.lge.alac.decoder"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L50
            java.lang.String r4 = "audio/x-lg-alac"
            return r4
        L50:
            java.lang.String r4 = "audio/flac"
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L63
            java.lang.String r4 = "OMX.lge.flac.decoder"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L63
            java.lang.String r4 = "audio/x-lg-flac"
            return r4
        L63:
            java.lang.String r4 = "audio/ac3"
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L76
            java.lang.String r4 = "OMX.lge.ac3.decoder"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L76
            java.lang.String r4 = "audio/lg-ac3"
            return r4
        L76:
            r4 = 0
            return r4
    }

    @androidx.annotation.Nullable
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> getCodecProfileAndLevel(com.google.android.exoplayer2.Format r6) {
            java.lang.String r0 = r6.codecs
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r2 = "\\."
            java.lang.String[] r0 = r0.split(r2)
            java.lang.String r2 = r6.sampleMimeType
            java.lang.String r3 = "video/dolby-vision"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L1e
            java.lang.String r6 = r6.codecs
            android.util.Pair r6 = getDolbyVisionProfileAndLevel(r6, r0)
            return r6
        L1e:
            r2 = 0
            r3 = r0[r2]
            java.util.Objects.requireNonNull(r3)
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case 3004662: goto L71;
                case 3006243: goto L66;
                case 3006244: goto L5b;
                case 3199032: goto L50;
                case 3214780: goto L45;
                case 3356560: goto L3a;
                case 3624515: goto L2e;
                default: goto L2c;
            }
        L2c:
            r2 = -1
            goto L7a
        L2e:
            java.lang.String r2 = "vp09"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L38
            goto L2c
        L38:
            r2 = 6
            goto L7a
        L3a:
            java.lang.String r2 = "mp4a"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L43
            goto L2c
        L43:
            r2 = 5
            goto L7a
        L45:
            java.lang.String r2 = "hvc1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L4e
            goto L2c
        L4e:
            r2 = 4
            goto L7a
        L50:
            java.lang.String r2 = "hev1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L59
            goto L2c
        L59:
            r2 = 3
            goto L7a
        L5b:
            java.lang.String r2 = "avc2"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L64
            goto L2c
        L64:
            r2 = 2
            goto L7a
        L66:
            java.lang.String r2 = "avc1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L6f
            goto L2c
        L6f:
            r2 = 1
            goto L7a
        L71:
            java.lang.String r5 = "av01"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L7a
            goto L2c
        L7a:
            switch(r2) {
                case 0: goto L9c;
                case 1: goto L95;
                case 2: goto L95;
                case 3: goto L8c;
                case 4: goto L8c;
                case 5: goto L85;
                case 6: goto L7e;
                default: goto L7d;
            }
        L7d:
            return r1
        L7e:
            java.lang.String r6 = r6.codecs
            android.util.Pair r6 = getVp9ProfileAndLevel(r6, r0)
            return r6
        L85:
            java.lang.String r6 = r6.codecs
            android.util.Pair r6 = getAacCodecProfileAndLevel(r6, r0)
            return r6
        L8c:
            java.lang.String r1 = r6.codecs
            com.google.android.exoplayer2.video.ColorInfo r6 = r6.colorInfo
            android.util.Pair r6 = getHevcProfileAndLevel(r1, r0, r6)
            return r6
        L95:
            java.lang.String r6 = r6.codecs
            android.util.Pair r6 = getAvcProfileAndLevel(r6, r0)
            return r6
        L9c:
            java.lang.String r1 = r6.codecs
            com.google.android.exoplayer2.video.ColorInfo r6 = r6.colorInfo
            android.util.Pair r6 = getAv1ProfileAndLevel(r1, r0, r6)
            return r6
    }

    @androidx.annotation.Nullable
    public static com.google.android.exoplayer2.mediacodec.MediaCodecInfo getDecoderInfo(java.lang.String r0, boolean r1, boolean r2) throws com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException {
            java.util.List r0 = getDecoderInfos(r0, r1, r2)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lc
            r0 = 0
            goto L13
        Lc:
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.google.android.exoplayer2.mediacodec.MediaCodecInfo r0 = (com.google.android.exoplayer2.mediacodec.MediaCodecInfo) r0
        L13:
            return r0
    }

    public static synchronized java.util.List<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> getDecoderInfos(java.lang.String r7, boolean r8, boolean r9) throws com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException {
            java.lang.Class<com.google.android.exoplayer2.mediacodec.MediaCodecUtil> r0 = com.google.android.exoplayer2.mediacodec.MediaCodecUtil.class
            monitor-enter(r0)
            com.google.android.exoplayer2.mediacodec.MediaCodecUtil$CodecKey r1 = new com.google.android.exoplayer2.mediacodec.MediaCodecUtil$CodecKey     // Catch: java.lang.Throwable -> L7a
            r1.<init>(r7, r8, r9)     // Catch: java.lang.Throwable -> L7a
            java.util.HashMap<com.google.android.exoplayer2.mediacodec.MediaCodecUtil$CodecKey, java.util.List<com.google.android.exoplayer2.mediacodec.MediaCodecInfo>> r2 = com.google.android.exoplayer2.mediacodec.MediaCodecUtil.decoderInfosCache     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r3 = r2.get(r1)     // Catch: java.lang.Throwable -> L7a
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L7a
            if (r3 == 0) goto L14
            monitor-exit(r0)
            return r3
        L14:
            int r3 = com.google.android.exoplayer2.util.Util.SDK_INT     // Catch: java.lang.Throwable -> L7a
            r4 = 0
            r5 = 21
            if (r3 < r5) goto L21
            com.google.android.exoplayer2.mediacodec.MediaCodecUtil$MediaCodecListCompatV21 r6 = new com.google.android.exoplayer2.mediacodec.MediaCodecUtil$MediaCodecListCompatV21     // Catch: java.lang.Throwable -> L7a
            r6.<init>(r8, r9)     // Catch: java.lang.Throwable -> L7a
            goto L26
        L21:
            com.google.android.exoplayer2.mediacodec.MediaCodecUtil$MediaCodecListCompatV16 r6 = new com.google.android.exoplayer2.mediacodec.MediaCodecUtil$MediaCodecListCompatV16     // Catch: java.lang.Throwable -> L7a
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L7a
        L26:
            java.util.ArrayList r9 = getDecoderInfosInternal(r1, r6)     // Catch: java.lang.Throwable -> L7a
            if (r8 == 0) goto L6e
            boolean r8 = r9.isEmpty()     // Catch: java.lang.Throwable -> L7a
            if (r8 == 0) goto L6e
            if (r5 > r3) goto L6e
            r8 = 23
            if (r3 > r8) goto L6e
            com.google.android.exoplayer2.mediacodec.MediaCodecUtil$MediaCodecListCompatV16 r8 = new com.google.android.exoplayer2.mediacodec.MediaCodecUtil$MediaCodecListCompatV16     // Catch: java.lang.Throwable -> L7a
            r8.<init>(r4)     // Catch: java.lang.Throwable -> L7a
            java.util.ArrayList r9 = getDecoderInfosInternal(r1, r8)     // Catch: java.lang.Throwable -> L7a
            boolean r8 = r9.isEmpty()     // Catch: java.lang.Throwable -> L7a
            if (r8 != 0) goto L6e
            java.lang.String r8 = "MediaCodecUtil"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a
            r3.<init>()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r4 = "MediaCodecList API didn't list secure decoder for: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L7a
            r3.append(r7)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r4 = ". Assuming: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L7a
            r4 = 0
            java.lang.Object r4 = r9.get(r4)     // Catch: java.lang.Throwable -> L7a
            com.google.android.exoplayer2.mediacodec.MediaCodecInfo r4 = (com.google.android.exoplayer2.mediacodec.MediaCodecInfo) r4     // Catch: java.lang.Throwable -> L7a
            java.lang.String r4 = r4.name     // Catch: java.lang.Throwable -> L7a
            r3.append(r4)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L7a
            com.google.android.exoplayer2.util.Log.w(r8, r3)     // Catch: java.lang.Throwable -> L7a
        L6e:
            applyWorkarounds(r7, r9)     // Catch: java.lang.Throwable -> L7a
            com.google.common.collect.ImmutableList r7 = com.google.common.collect.ImmutableList.copyOf(r9)     // Catch: java.lang.Throwable -> L7a
            r2.put(r1, r7)     // Catch: java.lang.Throwable -> L7a
            monitor-exit(r0)
            return r7
        L7a:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
    }

    private static java.util.ArrayList<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> getDecoderInfosInternal(com.google.android.exoplayer2.mediacodec.MediaCodecUtil.CodecKey r24, com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat r25) throws com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException {
            r1 = r24
            r2 = r25
            java.lang.String r3 = "secure-playback"
            java.lang.String r4 = "tunneled-playback"
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Exception -> L151
            r5.<init>()     // Catch: java.lang.Exception -> L151
            java.lang.String r15 = r1.mimeType     // Catch: java.lang.Exception -> L151
            int r14 = r25.getCodecCount()     // Catch: java.lang.Exception -> L151
            boolean r13 = r25.secureDecodersExplicit()     // Catch: java.lang.Exception -> L151
            r0 = 0
            r12 = 0
        L1b:
            if (r12 >= r14) goto L150
            android.media.MediaCodecInfo r0 = r2.getCodecInfoAt(r12)     // Catch: java.lang.Exception -> L151
            boolean r6 = isAlias(r0)     // Catch: java.lang.Exception -> L151
            if (r6 == 0) goto L2f
        L27:
            r22 = r12
            r23 = r13
            r18 = r14
            goto L122
        L2f:
            java.lang.String r11 = r0.getName()     // Catch: java.lang.Exception -> L151
            boolean r6 = isCodecUsableDecoder(r0, r11, r13, r15)     // Catch: java.lang.Exception -> L151
            if (r6 != 0) goto L3a
            goto L27
        L3a:
            java.lang.String r10 = getCodecMimeType(r0, r11, r15)     // Catch: java.lang.Exception -> L151
            if (r10 != 0) goto L41
            goto L27
        L41:
            android.media.MediaCodecInfo$CodecCapabilities r9 = r0.getCapabilitiesForType(r10)     // Catch: java.lang.Exception -> Lf1
            boolean r6 = r2.isFeatureSupported(r4, r10, r9)     // Catch: java.lang.Exception -> Lf1
            boolean r7 = r2.isFeatureRequired(r4, r10, r9)     // Catch: java.lang.Exception -> Lf1
            boolean r8 = r1.tunneling     // Catch: java.lang.Exception -> Lf1
            if (r8 != 0) goto L53
            if (r7 != 0) goto L27
        L53:
            if (r8 == 0) goto L58
            if (r6 != 0) goto L58
            goto L27
        L58:
            boolean r6 = r2.isFeatureSupported(r3, r10, r9)     // Catch: java.lang.Exception -> Lf1
            boolean r7 = r2.isFeatureRequired(r3, r10, r9)     // Catch: java.lang.Exception -> Lf1
            boolean r8 = r1.secure     // Catch: java.lang.Exception -> Lf1
            if (r8 != 0) goto L66
            if (r7 != 0) goto L27
        L66:
            if (r8 == 0) goto L6b
            if (r6 != 0) goto L6b
            goto L27
        L6b:
            boolean r16 = isHardwareAccelerated(r0, r15)     // Catch: java.lang.Exception -> Lf1
            boolean r17 = isSoftwareOnly(r0, r15)     // Catch: java.lang.Exception -> Lf1
            boolean r0 = isVendor(r0)     // Catch: java.lang.Exception -> Lf1
            if (r13 == 0) goto L7d
            boolean r7 = r1.secure     // Catch: java.lang.Exception -> Lf1
            if (r7 == r6) goto L83
        L7d:
            if (r13 != 0) goto Lb5
            boolean r7 = r1.secure     // Catch: java.lang.Exception -> Laa
            if (r7 != 0) goto Lb5
        L83:
            r18 = 0
            r19 = 0
            r6 = r11
            r7 = r15
            r8 = r10
            r20 = r10
            r10 = r16
            r21 = r11
            r11 = r17
            r22 = r12
            r12 = r0
            r23 = r13
            r13 = r18
            r18 = r14
            r14 = r19
            com.google.android.exoplayer2.mediacodec.MediaCodecInfo r0 = com.google.android.exoplayer2.mediacodec.MediaCodecInfo.newInstance(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Exception -> La6
            r5.add(r0)     // Catch: java.lang.Exception -> La6
            goto L122
        La6:
            r0 = move-exception
            r1 = r21
            goto Lfb
        Laa:
            r0 = move-exception
            r20 = r10
            r22 = r12
            r23 = r13
            r18 = r14
            r1 = r11
            goto Lfb
        Lb5:
            r20 = r10
            r21 = r11
            r22 = r12
            r23 = r13
            r18 = r14
            if (r23 != 0) goto L122
            if (r6 == 0) goto L122
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La6
            r6.<init>()     // Catch: java.lang.Exception -> La6
            r14 = r21
            r6.append(r14)     // Catch: java.lang.Exception -> Lee
            java.lang.String r7 = ".secure"
            r6.append(r7)     // Catch: java.lang.Exception -> Lee
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> Lee
            r13 = 0
            r19 = 1
            r7 = r15
            r8 = r20
            r10 = r16
            r11 = r17
            r12 = r0
            r1 = r14
            r14 = r19
            com.google.android.exoplayer2.mediacodec.MediaCodecInfo r0 = com.google.android.exoplayer2.mediacodec.MediaCodecInfo.newInstance(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Exception -> Lec
            r5.add(r0)     // Catch: java.lang.Exception -> Lec
            return r5
        Lec:
            r0 = move-exception
            goto Lfb
        Lee:
            r0 = move-exception
            r1 = r14
            goto Lfb
        Lf1:
            r0 = move-exception
            r20 = r10
            r1 = r11
            r22 = r12
            r23 = r13
            r18 = r14
        Lfb:
            int r6 = com.google.android.exoplayer2.util.Util.SDK_INT     // Catch: java.lang.Exception -> L151
            r7 = 23
            java.lang.String r8 = "MediaCodecUtil"
            if (r6 > r7) goto L12c
            boolean r6 = r5.isEmpty()     // Catch: java.lang.Exception -> L151
            if (r6 != 0) goto L12c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L151
            r0.<init>()     // Catch: java.lang.Exception -> L151
            java.lang.String r6 = "Skipping codec "
            r0.append(r6)     // Catch: java.lang.Exception -> L151
            r0.append(r1)     // Catch: java.lang.Exception -> L151
            java.lang.String r1 = " (failed to query capabilities)"
            r0.append(r1)     // Catch: java.lang.Exception -> L151
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L151
            com.google.android.exoplayer2.util.Log.e(r8, r0)     // Catch: java.lang.Exception -> L151
        L122:
            int r12 = r22 + 1
            r1 = r24
            r14 = r18
            r13 = r23
            goto L1b
        L12c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L151
            r2.<init>()     // Catch: java.lang.Exception -> L151
            java.lang.String r3 = "Failed to query codec "
            r2.append(r3)     // Catch: java.lang.Exception -> L151
            r2.append(r1)     // Catch: java.lang.Exception -> L151
            java.lang.String r1 = " ("
            r2.append(r1)     // Catch: java.lang.Exception -> L151
            r1 = r20
            r2.append(r1)     // Catch: java.lang.Exception -> L151
            java.lang.String r1 = ")"
            r2.append(r1)     // Catch: java.lang.Exception -> L151
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> L151
            com.google.android.exoplayer2.util.Log.e(r8, r1)     // Catch: java.lang.Exception -> L151
            throw r0     // Catch: java.lang.Exception -> L151
        L150:
            return r5
        L151:
            r0 = move-exception
            com.google.android.exoplayer2.mediacodec.MediaCodecUtil$DecoderQueryException r1 = new com.google.android.exoplayer2.mediacodec.MediaCodecUtil$DecoderQueryException
            r2 = 0
            r1.<init>(r0, r2)
            throw r1
    }

    @androidx.annotation.CheckResult
    public static java.util.List<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> getDecoderInfosSortedByFormatSupport(java.util.List<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> r1, com.google.android.exoplayer2.Format r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            com.google.android.exoplayer2.mediacodec.MediaCodecUtil$$ExternalSyntheticLambda0 r1 = new com.google.android.exoplayer2.mediacodec.MediaCodecUtil$$ExternalSyntheticLambda0
            r1.<init>(r2)
            sortByScore(r0, r1)
            return r0
    }

    @androidx.annotation.Nullable
    public static com.google.android.exoplayer2.mediacodec.MediaCodecInfo getDecryptOnlyDecoderInfo() throws com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException {
            java.lang.String r0 = "audio/raw"
            r1 = 0
            com.google.android.exoplayer2.mediacodec.MediaCodecInfo r0 = getDecoderInfo(r0, r1, r1)
            return r0
    }

    @androidx.annotation.Nullable
    private static android.util.Pair<java.lang.Integer, java.lang.Integer> getDolbyVisionProfileAndLevel(java.lang.String r6, java.lang.String[] r7) {
            int r0 = r7.length
            java.lang.String r1 = "Ignoring malformed Dolby Vision codec string: "
            r2 = 0
            java.lang.String r3 = "MediaCodecUtil"
            r4 = 3
            if (r0 >= r4) goto Ld
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m27m(r1, r6, r3)
            return r2
        Ld:
            java.util.regex.Pattern r0 = com.google.android.exoplayer2.mediacodec.MediaCodecUtil.PROFILE_PATTERN
            r4 = 1
            r5 = r7[r4]
            java.util.regex.Matcher r0 = r0.matcher(r5)
            boolean r5 = r0.matches()
            if (r5 != 0) goto L20
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m27m(r1, r6, r3)
            return r2
        L20:
            java.lang.String r6 = r0.group(r4)
            java.lang.Integer r0 = dolbyVisionStringToProfile(r6)
            if (r0 != 0) goto L30
            java.lang.String r7 = "Unknown Dolby Vision profile string: "
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m27m(r7, r6, r3)
            return r2
        L30:
            r6 = 2
            r6 = r7[r6]
            java.lang.Integer r7 = dolbyVisionStringToLevel(r6)
            if (r7 != 0) goto L3f
            java.lang.String r7 = "Unknown Dolby Vision level string: "
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m27m(r7, r6, r3)
            return r2
        L3f:
            android.util.Pair r6 = new android.util.Pair
            r6.<init>(r0, r7)
            return r6
    }

    @androidx.annotation.Nullable
    private static android.util.Pair<java.lang.Integer, java.lang.Integer> getHevcProfileAndLevel(java.lang.String r6, java.lang.String[] r7, @androidx.annotation.Nullable com.google.android.exoplayer2.video.ColorInfo r8) {
            int r0 = r7.length
            java.lang.String r1 = "Ignoring malformed HEVC codec string: "
            r2 = 0
            java.lang.String r3 = "MediaCodecUtil"
            r4 = 4
            if (r0 >= r4) goto Ld
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m27m(r1, r6, r3)
            return r2
        Ld:
            java.util.regex.Pattern r0 = com.google.android.exoplayer2.mediacodec.MediaCodecUtil.PROFILE_PATTERN
            r4 = 1
            r5 = r7[r4]
            java.util.regex.Matcher r0 = r0.matcher(r5)
            boolean r5 = r0.matches()
            if (r5 != 0) goto L20
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m27m(r1, r6, r3)
            return r2
        L20:
            java.lang.String r6 = r0.group(r4)
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L2d
            goto L40
        L2d:
            java.lang.String r0 = "2"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L59
            if (r8 == 0) goto L3f
            int r6 = r8.colorTransfer
            r8 = 6
            if (r6 != r8) goto L3f
            r4 = 4096(0x1000, float:5.74E-42)
            goto L40
        L3f:
            r4 = 2
        L40:
            r6 = 3
            r6 = r7[r6]
            java.lang.Integer r7 = hevcCodecStringToProfileLevel(r6)
            if (r7 != 0) goto L4f
            java.lang.String r7 = "Unknown HEVC level string: "
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m27m(r7, r6, r3)
            return r2
        L4f:
            android.util.Pair r6 = new android.util.Pair
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            r6.<init>(r8, r7)
            return r6
        L59:
            java.lang.String r7 = "Unknown HEVC profile string: "
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m27m(r7, r6, r3)
            return r2
    }

    @androidx.annotation.Nullable
    private static android.util.Pair<java.lang.Integer, java.lang.Integer> getVp9ProfileAndLevel(java.lang.String r5, java.lang.String[] r6) {
            int r0 = r6.length
            java.lang.String r1 = "Ignoring malformed VP9 codec string: "
            r2 = 0
            java.lang.String r3 = "MediaCodecUtil"
            r4 = 3
            if (r0 >= r4) goto Ld
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m27m(r1, r5, r3)
            return r2
        Ld:
            r0 = 1
            r0 = r6[r0]     // Catch: java.lang.NumberFormatException -> L42
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L42
            r4 = 2
            r6 = r6[r4]     // Catch: java.lang.NumberFormatException -> L42
            int r5 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.NumberFormatException -> L42
            int r6 = vp9ProfileNumberToConst(r0)
            r1 = -1
            if (r6 != r1) goto L28
            java.lang.String r5 = "Unknown VP9 profile: "
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m26m(r5, r0, r3)
            return r2
        L28:
            int r0 = vp9LevelNumberToConst(r5)
            if (r0 != r1) goto L34
            java.lang.String r6 = "Unknown VP9 level: "
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m26m(r6, r5, r3)
            return r2
        L34:
            android.util.Pair r5 = new android.util.Pair
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.<init>(r6, r0)
            return r5
        L42:
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m27m(r1, r5, r3)
            return r2
    }

    @androidx.annotation.Nullable
    private static java.lang.Integer hevcCodecStringToProfileLevel(@androidx.annotation.Nullable java.lang.String r8) {
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            r1 = -1
            int r2 = r8.hashCode()
            r3 = 16
            r4 = 8
            r5 = 4
            r6 = 2
            r7 = 1
            switch(r2) {
                case 70821: goto L15e;
                case 70914: goto L153;
                case 70917: goto L148;
                case 71007: goto L13d;
                case 71010: goto L132;
                case 74665: goto L127;
                case 74758: goto L11c;
                case 74761: goto L111;
                case 74851: goto L103;
                case 74854: goto Lf5;
                case 2193639: goto Le7;
                case 2193642: goto Ld9;
                case 2193732: goto Lcb;
                case 2193735: goto Lbd;
                case 2193738: goto Laf;
                case 2193825: goto La1;
                case 2193828: goto L93;
                case 2193831: goto L85;
                case 2312803: goto L77;
                case 2312806: goto L69;
                case 2312896: goto L5b;
                case 2312899: goto L4d;
                case 2312902: goto L3f;
                case 2312989: goto L31;
                case 2312992: goto L23;
                case 2312995: goto L15;
                default: goto L13;
            }
        L13:
            goto L168
        L15:
            java.lang.String r2 = "L186"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L1f
            goto L168
        L1f:
            r1 = 25
            goto L168
        L23:
            java.lang.String r2 = "L183"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L2d
            goto L168
        L2d:
            r1 = 24
            goto L168
        L31:
            java.lang.String r2 = "L180"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L3b
            goto L168
        L3b:
            r1 = 23
            goto L168
        L3f:
            java.lang.String r2 = "L156"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L49
            goto L168
        L49:
            r1 = 22
            goto L168
        L4d:
            java.lang.String r2 = "L153"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L57
            goto L168
        L57:
            r1 = 21
            goto L168
        L5b:
            java.lang.String r2 = "L150"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L65
            goto L168
        L65:
            r1 = 20
            goto L168
        L69:
            java.lang.String r2 = "L123"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L73
            goto L168
        L73:
            r1 = 19
            goto L168
        L77:
            java.lang.String r2 = "L120"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L81
            goto L168
        L81:
            r1 = 18
            goto L168
        L85:
            java.lang.String r2 = "H186"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L8f
            goto L168
        L8f:
            r1 = 17
            goto L168
        L93:
            java.lang.String r2 = "H183"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L9d
            goto L168
        L9d:
            r1 = 16
            goto L168
        La1:
            java.lang.String r2 = "H180"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto Lab
            goto L168
        Lab:
            r1 = 15
            goto L168
        Laf:
            java.lang.String r2 = "H156"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto Lb9
            goto L168
        Lb9:
            r1 = 14
            goto L168
        Lbd:
            java.lang.String r2 = "H153"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto Lc7
            goto L168
        Lc7:
            r1 = 13
            goto L168
        Lcb:
            java.lang.String r2 = "H150"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto Ld5
            goto L168
        Ld5:
            r1 = 12
            goto L168
        Ld9:
            java.lang.String r2 = "H123"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto Le3
            goto L168
        Le3:
            r1 = 11
            goto L168
        Le7:
            java.lang.String r2 = "H120"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto Lf1
            goto L168
        Lf1:
            r1 = 10
            goto L168
        Lf5:
            java.lang.String r2 = "L93"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto Lff
            goto L168
        Lff:
            r1 = 9
            goto L168
        L103:
            java.lang.String r2 = "L90"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L10d
            goto L168
        L10d:
            r1 = 8
            goto L168
        L111:
            java.lang.String r2 = "L63"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L11a
            goto L168
        L11a:
            r1 = 7
            goto L168
        L11c:
            java.lang.String r2 = "L60"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L125
            goto L168
        L125:
            r1 = 6
            goto L168
        L127:
            java.lang.String r2 = "L30"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L130
            goto L168
        L130:
            r1 = 5
            goto L168
        L132:
            java.lang.String r2 = "H93"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L13b
            goto L168
        L13b:
            r1 = 4
            goto L168
        L13d:
            java.lang.String r2 = "H90"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L146
            goto L168
        L146:
            r1 = 3
            goto L168
        L148:
            java.lang.String r2 = "H63"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L151
            goto L168
        L151:
            r1 = 2
            goto L168
        L153:
            java.lang.String r2 = "H60"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L15c
            goto L168
        L15c:
            r1 = 1
            goto L168
        L15e:
            java.lang.String r2 = "H30"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L167
            goto L168
        L167:
            r1 = 0
        L168:
            switch(r1) {
                case 0: goto L214;
                case 1: goto L20f;
                case 2: goto L208;
                case 3: goto L201;
                case 4: goto L1fa;
                case 5: goto L1f5;
                case 6: goto L1f0;
                case 7: goto L1eb;
                case 8: goto L1e4;
                case 9: goto L1dd;
                case 10: goto L1d6;
                case 11: goto L1cf;
                case 12: goto L1c7;
                case 13: goto L1c0;
                case 14: goto L1b9;
                case 15: goto L1b2;
                case 16: goto L1ab;
                case 17: goto L1a4;
                case 18: goto L19d;
                case 19: goto L196;
                case 20: goto L18f;
                case 21: goto L188;
                case 22: goto L181;
                case 23: goto L17a;
                case 24: goto L173;
                case 25: goto L16c;
                default: goto L16b;
            }
        L16b:
            return r0
        L16c:
            r8 = 16777216(0x1000000, float:2.3509887E-38)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            return r8
        L173:
            r8 = 4194304(0x400000, float:5.877472E-39)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            return r8
        L17a:
            r8 = 1048576(0x100000, float:1.469368E-39)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            return r8
        L181:
            r8 = 262144(0x40000, float:3.67342E-40)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            return r8
        L188:
            r8 = 65536(0x10000, float:9.1835E-41)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            return r8
        L18f:
            r8 = 16384(0x4000, float:2.2959E-41)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            return r8
        L196:
            r8 = 4096(0x1000, float:5.74E-42)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            return r8
        L19d:
            r8 = 1024(0x400, float:1.435E-42)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            return r8
        L1a4:
            r8 = 33554432(0x2000000, float:9.403955E-38)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            return r8
        L1ab:
            r8 = 8388608(0x800000, float:1.1754944E-38)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            return r8
        L1b2:
            r8 = 2097152(0x200000, float:2.938736E-39)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            return r8
        L1b9:
            r8 = 524288(0x80000, float:7.34684E-40)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            return r8
        L1c0:
            r8 = 131072(0x20000, float:1.83671E-40)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            return r8
        L1c7:
            r8 = 32768(0x8000, float:4.5918E-41)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            return r8
        L1cf:
            r8 = 8192(0x2000, float:1.148E-41)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            return r8
        L1d6:
            r8 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            return r8
        L1dd:
            r8 = 256(0x100, float:3.59E-43)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            return r8
        L1e4:
            r8 = 64
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            return r8
        L1eb:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            return r8
        L1f0:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            return r8
        L1f5:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            return r8
        L1fa:
            r8 = 512(0x200, float:7.17E-43)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            return r8
        L201:
            r8 = 128(0x80, float:1.8E-43)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            return r8
        L208:
            r8 = 32
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            return r8
        L20f:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            return r8
        L214:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            return r8
    }

    private static boolean isAlias(android.media.MediaCodecInfo r2) {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 29
            if (r0 < r1) goto Le
            boolean r2 = isAliasV29(r2)
            if (r2 == 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    @androidx.annotation.RequiresApi(29)
    private static boolean isAliasV29(android.media.MediaCodecInfo r0) {
            boolean r0 = r0.isAlias()
            return r0
    }

    private static boolean isCodecUsableDecoder(android.media.MediaCodecInfo r4, java.lang.String r5, boolean r6, java.lang.String r7) {
            boolean r4 = r4.isEncoder()
            r0 = 0
            if (r4 != 0) goto L1e4
            if (r6 != 0) goto L13
            java.lang.String r4 = ".secure"
            boolean r4 = r5.endsWith(r4)
            if (r4 == 0) goto L13
            goto L1e4
        L13:
            int r4 = com.google.android.exoplayer2.util.Util.SDK_INT
            r6 = 21
            if (r4 >= r6) goto L4a
            java.lang.String r6 = "CIPAACDecoder"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L49
            java.lang.String r6 = "CIPMP3Decoder"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L49
            java.lang.String r6 = "CIPVorbisDecoder"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L49
            java.lang.String r6 = "CIPAMRNBDecoder"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L49
            java.lang.String r6 = "AACDecoder"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L49
            java.lang.String r6 = "MP3Decoder"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L4a
        L49:
            return r0
        L4a:
            r6 = 18
            if (r4 >= r6) goto L73
            java.lang.String r6 = "OMX.MTK.AUDIO.DECODER.AAC"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L73
            java.lang.String r6 = com.google.android.exoplayer2.util.Util.DEVICE
            java.lang.String r1 = "a70"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L72
            java.lang.String r1 = com.google.android.exoplayer2.util.Util.MANUFACTURER
            java.lang.String r2 = "Xiaomi"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L73
            java.lang.String r1 = "HM"
            boolean r6 = r6.startsWith(r1)
            if (r6 == 0) goto L73
        L72:
            return r0
        L73:
            r6 = 16
            if (r4 != r6) goto Le6
            java.lang.String r1 = "OMX.qcom.audio.decoder.mp3"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto Le6
            java.lang.String r1 = com.google.android.exoplayer2.util.Util.DEVICE
            java.lang.String r2 = "dlxu"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto Le5
            java.lang.String r2 = "protou"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto Le5
            java.lang.String r2 = "ville"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto Le5
            java.lang.String r2 = "villeplus"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto Le5
            java.lang.String r2 = "villec2"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto Le5
            java.lang.String r2 = "gee"
            boolean r2 = r1.startsWith(r2)
            if (r2 != 0) goto Le5
            java.lang.String r2 = "C6602"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto Le5
            java.lang.String r2 = "C6603"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto Le5
            java.lang.String r2 = "C6606"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto Le5
            java.lang.String r2 = "C6616"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto Le5
            java.lang.String r2 = "L36h"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto Le5
            java.lang.String r2 = "SO-02E"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto Le6
        Le5:
            return r0
        Le6:
            if (r4 != r6) goto L113
            java.lang.String r6 = "OMX.qcom.audio.decoder.aac"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L113
            java.lang.String r6 = com.google.android.exoplayer2.util.Util.DEVICE
            java.lang.String r1 = "C1504"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L112
            java.lang.String r1 = "C1505"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L112
            java.lang.String r1 = "C1604"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L112
            java.lang.String r1 = "C1605"
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L113
        L112:
            return r0
        L113:
            r6 = 24
            java.lang.String r1 = "samsung"
            if (r4 >= r6) goto L178
            java.lang.String r6 = "OMX.SEC.aac.dec"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L12a
            java.lang.String r6 = "OMX.Exynos.AAC.Decoder"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L178
        L12a:
            java.lang.String r6 = com.google.android.exoplayer2.util.Util.MANUFACTURER
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L178
            java.lang.String r6 = com.google.android.exoplayer2.util.Util.DEVICE
            java.lang.String r2 = "zeroflte"
            boolean r2 = r6.startsWith(r2)
            if (r2 != 0) goto L177
            java.lang.String r2 = "zerolte"
            boolean r2 = r6.startsWith(r2)
            if (r2 != 0) goto L177
            java.lang.String r2 = "zenlte"
            boolean r2 = r6.startsWith(r2)
            if (r2 != 0) goto L177
            java.lang.String r2 = "SC-05G"
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L177
            java.lang.String r2 = "marinelteatt"
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L177
            java.lang.String r2 = "404SC"
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L177
            java.lang.String r2 = "SC-04G"
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L177
            java.lang.String r2 = "SCV31"
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L178
        L177:
            return r0
        L178:
            java.lang.String r6 = "jflte"
            r2 = 19
            if (r4 > r2) goto L1ba
            java.lang.String r3 = "OMX.SEC.vp8.dec"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L1ba
            java.lang.String r3 = com.google.android.exoplayer2.util.Util.MANUFACTURER
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L1ba
            java.lang.String r1 = com.google.android.exoplayer2.util.Util.DEVICE
            java.lang.String r3 = "d2"
            boolean r3 = r1.startsWith(r3)
            if (r3 != 0) goto L1b9
            java.lang.String r3 = "serrano"
            boolean r3 = r1.startsWith(r3)
            if (r3 != 0) goto L1b9
            boolean r3 = r1.startsWith(r6)
            if (r3 != 0) goto L1b9
            java.lang.String r3 = "santos"
            boolean r3 = r1.startsWith(r3)
            if (r3 != 0) goto L1b9
            java.lang.String r3 = "t0"
            boolean r1 = r1.startsWith(r3)
            if (r1 == 0) goto L1ba
        L1b9:
            return r0
        L1ba:
            if (r4 > r2) goto L1cd
            java.lang.String r1 = com.google.android.exoplayer2.util.Util.DEVICE
            boolean r6 = r1.startsWith(r6)
            if (r6 == 0) goto L1cd
            java.lang.String r6 = "OMX.qcom.video.decoder.vp8"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L1cd
            return r0
        L1cd:
            r6 = 23
            if (r4 > r6) goto L1e2
            java.lang.String r4 = "audio/eac3-joc"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L1e2
            java.lang.String r4 = "OMX.MTK.AUDIO.DECODER.DSPAC3"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L1e2
            return r0
        L1e2:
            r4 = 1
            return r4
        L1e4:
            return r0
    }

    private static boolean isHardwareAccelerated(android.media.MediaCodecInfo r2, java.lang.String r3) {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lb
            boolean r2 = isHardwareAcceleratedV29(r2)
            return r2
        Lb:
            boolean r2 = isSoftwareOnly(r2, r3)
            r2 = r2 ^ 1
            return r2
    }

    @androidx.annotation.RequiresApi(29)
    private static boolean isHardwareAcceleratedV29(android.media.MediaCodecInfo r0) {
            boolean r0 = r0.isHardwareAccelerated()
            return r0
    }

    private static boolean isSoftwareOnly(android.media.MediaCodecInfo r2, java.lang.String r3) {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lb
            boolean r2 = isSoftwareOnlyV29(r2)
            return r2
        Lb:
            boolean r3 = com.google.android.exoplayer2.util.MimeTypes.isAudio(r3)
            r0 = 1
            if (r3 == 0) goto L13
            return r0
        L13:
            java.lang.String r2 = r2.getName()
            java.lang.String r2 = com.google.common.base.Ascii.toLowerCase(r2)
            java.lang.String r3 = "arc."
            boolean r3 = r2.startsWith(r3)
            r1 = 0
            if (r3 == 0) goto L25
            return r1
        L25:
            java.lang.String r3 = "omx.google."
            boolean r3 = r2.startsWith(r3)
            if (r3 != 0) goto L6f
            java.lang.String r3 = "omx.ffmpeg."
            boolean r3 = r2.startsWith(r3)
            if (r3 != 0) goto L6f
            java.lang.String r3 = "omx.sec."
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L45
            java.lang.String r3 = ".sw."
            boolean r3 = r2.contains(r3)
            if (r3 != 0) goto L6f
        L45:
            java.lang.String r3 = "omx.qcom.video.decoder.hevcswvdec"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L6f
            java.lang.String r3 = "c2.android."
            boolean r3 = r2.startsWith(r3)
            if (r3 != 0) goto L6f
            java.lang.String r3 = "c2.google."
            boolean r3 = r2.startsWith(r3)
            if (r3 != 0) goto L6f
            java.lang.String r3 = "omx."
            boolean r3 = r2.startsWith(r3)
            if (r3 != 0) goto L6e
            java.lang.String r3 = "c2."
            boolean r2 = r2.startsWith(r3)
            if (r2 != 0) goto L6e
            goto L6f
        L6e:
            r0 = 0
        L6f:
            return r0
    }

    @androidx.annotation.RequiresApi(29)
    private static boolean isSoftwareOnlyV29(android.media.MediaCodecInfo r0) {
            boolean r0 = r0.isSoftwareOnly()
            return r0
    }

    private static boolean isVendor(android.media.MediaCodecInfo r2) {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lb
            boolean r2 = isVendorV29(r2)
            return r2
        Lb:
            java.lang.String r2 = r2.getName()
            java.lang.String r2 = com.google.common.base.Ascii.toLowerCase(r2)
            java.lang.String r0 = "omx.google."
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L2d
            java.lang.String r0 = "c2.android."
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L2d
            java.lang.String r0 = "c2.google."
            boolean r2 = r2.startsWith(r0)
            if (r2 != 0) goto L2d
            r2 = 1
            goto L2e
        L2d:
            r2 = 0
        L2e:
            return r2
    }

    @androidx.annotation.RequiresApi(29)
    private static boolean isVendorV29(android.media.MediaCodecInfo r0) {
            boolean r0 = r0.isVendor()
            return r0
    }

    private static /* synthetic */ int lambda$applyWorkarounds$1(com.google.android.exoplayer2.mediacodec.MediaCodecInfo r2) {
            java.lang.String r2 = r2.name
            java.lang.String r0 = "OMX.google"
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L25
            java.lang.String r0 = "c2.android"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L13
            goto L25
        L13:
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 26
            if (r0 >= r1) goto L23
            java.lang.String r0 = "OMX.MTK.AUDIO.DECODER.RAW"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L23
            r2 = -1
            return r2
        L23:
            r2 = 0
            return r2
        L25:
            r2 = 1
            return r2
    }

    private static /* synthetic */ int lambda$applyWorkarounds$2(com.google.android.exoplayer2.mediacodec.MediaCodecInfo r1) {
            java.lang.String r1 = r1.name
            java.lang.String r0 = "OMX.google"
            boolean r1 = r1.startsWith(r0)
            return r1
    }

    private static /* synthetic */ int lambda$getDecoderInfosSortedByFormatSupport$0(com.google.android.exoplayer2.Format r0, com.google.android.exoplayer2.mediacodec.MediaCodecInfo r1) {
            boolean r0 = r1.isFormatFunctionallySupported(r0)
            return r0
    }

    private static /* synthetic */ int lambda$sortByScore$3(com.google.android.exoplayer2.mediacodec.MediaCodecUtil.ScoreProvider r0, java.lang.Object r1, java.lang.Object r2) {
            int r2 = r0.getScore(r2)
            int r0 = r0.getScore(r1)
            int r2 = r2 - r0
            return r2
    }

    public static int maxH264DecodableFrameSize() throws com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException {
            int r0 = com.google.android.exoplayer2.mediacodec.MediaCodecUtil.maxH264DecodableFrameSize
            r1 = -1
            if (r0 != r1) goto L39
            java.lang.String r0 = "video/avc"
            r1 = 0
            com.google.android.exoplayer2.mediacodec.MediaCodecInfo r0 = getDecoderInfo(r0, r1, r1)
            if (r0 == 0) goto L37
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = r0.getProfileLevels()
            int r2 = r0.length
            r3 = 0
        L15:
            if (r1 >= r2) goto L26
            r4 = r0[r1]
            int r4 = r4.level
            int r4 = avcLevelToMaxFrameSize(r4)
            int r3 = java.lang.Math.max(r4, r3)
            int r1 = r1 + 1
            goto L15
        L26:
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 21
            if (r0 < r1) goto L30
            r0 = 345600(0x54600, float:4.84289E-40)
            goto L33
        L30:
            r0 = 172800(0x2a300, float:2.42144E-40)
        L33:
            int r1 = java.lang.Math.max(r3, r0)
        L37:
            com.google.android.exoplayer2.mediacodec.MediaCodecUtil.maxH264DecodableFrameSize = r1
        L39:
            int r0 = com.google.android.exoplayer2.mediacodec.MediaCodecUtil.maxH264DecodableFrameSize
            return r0
    }

    private static int mp4aAudioObjectTypeToProfile(int r1) {
            r0 = 17
            if (r1 == r0) goto L29
            r0 = 20
            if (r1 == r0) goto L29
            r0 = 23
            if (r1 == r0) goto L29
            r0 = 29
            if (r1 == r0) goto L29
            r0 = 39
            if (r1 == r0) goto L29
            r0 = 42
            if (r1 == r0) goto L29
            switch(r1) {
                case 1: goto L27;
                case 2: goto L25;
                case 3: goto L23;
                case 4: goto L21;
                case 5: goto L1f;
                case 6: goto L1d;
                default: goto L1b;
            }
        L1b:
            r1 = -1
            return r1
        L1d:
            r1 = 6
            return r1
        L1f:
            r1 = 5
            return r1
        L21:
            r1 = 4
            return r1
        L23:
            r1 = 3
            return r1
        L25:
            r1 = 2
            return r1
        L27:
            r1 = 1
            return r1
        L29:
            return r0
    }

    private static <T> void sortByScore(java.util.List<T> r1, com.google.android.exoplayer2.mediacodec.MediaCodecUtil.ScoreProvider<T> r2) {
            com.google.android.exoplayer2.mediacodec.MediaCodecUtil$$ExternalSyntheticLambda2 r0 = new com.google.android.exoplayer2.mediacodec.MediaCodecUtil$$ExternalSyntheticLambda2
            r0.<init>(r2)
            java.util.Collections.sort(r1, r0)
            return
    }

    private static int vp9LevelNumberToConst(int r1) {
            r0 = 10
            if (r1 == r0) goto L4f
            r0 = 11
            if (r1 == r0) goto L4d
            r0 = 20
            if (r1 == r0) goto L4b
            r0 = 21
            if (r1 == r0) goto L48
            r0 = 30
            if (r1 == r0) goto L45
            r0 = 31
            if (r1 == r0) goto L42
            r0 = 40
            if (r1 == r0) goto L3f
            r0 = 41
            if (r1 == r0) goto L3c
            r0 = 50
            if (r1 == r0) goto L39
            r0 = 51
            if (r1 == r0) goto L36
            switch(r1) {
                case 60: goto L33;
                case 61: goto L30;
                case 62: goto L2d;
                default: goto L2b;
            }
        L2b:
            r1 = -1
            return r1
        L2d:
            r1 = 8192(0x2000, float:1.148E-41)
            return r1
        L30:
            r1 = 4096(0x1000, float:5.74E-42)
            return r1
        L33:
            r1 = 2048(0x800, float:2.87E-42)
            return r1
        L36:
            r1 = 512(0x200, float:7.17E-43)
            return r1
        L39:
            r1 = 256(0x100, float:3.59E-43)
            return r1
        L3c:
            r1 = 128(0x80, float:1.8E-43)
            return r1
        L3f:
            r1 = 64
            return r1
        L42:
            r1 = 32
            return r1
        L45:
            r1 = 16
            return r1
        L48:
            r1 = 8
            return r1
        L4b:
            r1 = 4
            return r1
        L4d:
            r1 = 2
            return r1
        L4f:
            r1 = 1
            return r1
    }

    private static int vp9ProfileNumberToConst(int r2) {
            r0 = 1
            if (r2 == 0) goto L13
            r1 = 2
            if (r2 == r0) goto L12
            if (r2 == r1) goto L10
            r0 = 3
            if (r2 == r0) goto Ld
            r2 = -1
            return r2
        Ld:
            r2 = 8
            return r2
        L10:
            r2 = 4
            return r2
        L12:
            return r1
        L13:
            return r0
    }

    public static void warmDecoderInfoCache(java.lang.String r0, boolean r1, boolean r2) {
            getDecoderInfos(r0, r1, r2)     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L4
            goto Lc
        L4:
            r0 = move-exception
            java.lang.String r1 = "MediaCodecUtil"
            java.lang.String r2 = "Codec warming failed"
            com.google.android.exoplayer2.util.Log.e(r1, r2, r0)
        Lc:
            return
    }
}
