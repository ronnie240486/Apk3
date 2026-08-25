package com.google.android.exoplayer2.mediacodec;

/* JADX INFO: loaded from: classes.dex */
public final class MediaCodecInfo {
    private static final int COVERAGE_RESULT_NO = 1;
    private static final int COVERAGE_RESULT_NO_EMPTY_LIST = 0;
    private static final int COVERAGE_RESULT_YES = 2;
    public static final int MAX_SUPPORTED_INSTANCES_UNKNOWN = -1;
    public static final java.lang.String TAG = "MediaCodecInfo";
    public final boolean adaptive;

    @androidx.annotation.Nullable
    public final android.media.MediaCodecInfo.CodecCapabilities capabilities;
    public final java.lang.String codecMimeType;
    public final boolean hardwareAccelerated;
    private final boolean isVideo;
    public final java.lang.String mimeType;
    public final java.lang.String name;
    public final boolean secure;
    public final boolean softwareOnly;
    public final boolean tunneling;
    public final boolean vendor;

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(29)
    public static final class Api29 {
        private Api29() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static int areResolutionAndFrameRateCovered(android.media.MediaCodecInfo.VideoCapabilities r2, int r3, int r4, double r5) {
                java.util.List r2 = r2.getSupportedPerformancePoints()
                r0 = 0
                if (r2 == 0) goto L33
                boolean r1 = r2.isEmpty()
                if (r1 != 0) goto L33
                boolean r1 = com.google.android.exoplayer2.mediacodec.MediaCodecInfo.access$000()
                if (r1 == 0) goto L14
                goto L33
            L14:
                android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r1 = new android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint
                int r5 = (int) r5
                r1.<init>(r3, r4, r5)
            L1a:
                int r3 = r2.size()
                if (r0 >= r3) goto L31
                java.lang.Object r3 = r2.get(r0)
                android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r3 = (android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint) r3
                boolean r3 = r3.covers(r1)
                if (r3 == 0) goto L2e
                r2 = 2
                return r2
            L2e:
                int r0 = r0 + 1
                goto L1a
            L31:
                r2 = 1
                return r2
            L33:
                return r0
        }
    }

    @androidx.annotation.VisibleForTesting
    public MediaCodecInfo(java.lang.String r1, java.lang.String r2, java.lang.String r3, @androidx.annotation.Nullable android.media.MediaCodecInfo.CodecCapabilities r4, boolean r5, boolean r6, boolean r7, boolean r8, boolean r9, boolean r10) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.name = r1
            r0.mimeType = r2
            r0.codecMimeType = r3
            r0.capabilities = r4
            r0.hardwareAccelerated = r5
            r0.softwareOnly = r6
            r0.vendor = r7
            r0.adaptive = r8
            r0.tunneling = r9
            r0.secure = r10
            boolean r1 = com.google.android.exoplayer2.util.MimeTypes.isVideo(r2)
            r0.isVideo = r1
            return
    }

    public static /* synthetic */ boolean access$000() {
            boolean r0 = needsIgnorePerformancePointsWorkaround()
            return r0
    }

    private static int adjustMaxInputChannelCount(java.lang.String r2, java.lang.String r3, int r4) {
            r0 = 1
            if (r4 > r0) goto La9
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 26
            if (r0 < r1) goto Ld
            if (r4 <= 0) goto Ld
            goto La9
        Ld:
            java.lang.String r0 = "audio/mpeg"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto La9
            java.lang.String r0 = "audio/3gpp"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto La9
            java.lang.String r0 = "audio/amr-wb"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto La9
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto La9
            java.lang.String r0 = "audio/vorbis"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto La9
            java.lang.String r0 = "audio/opus"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto La9
            java.lang.String r0 = "audio/raw"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto La9
            java.lang.String r0 = "audio/flac"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto La9
            java.lang.String r0 = "audio/g711-alaw"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto La9
            java.lang.String r0 = "audio/g711-mlaw"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto La9
            java.lang.String r0 = "audio/gsm"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L66
            goto La9
        L66:
            java.lang.String r0 = "audio/ac3"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L70
            r3 = 6
            goto L7d
        L70:
            java.lang.String r0 = "audio/eac3"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L7b
            r3 = 16
            goto L7d
        L7b:
            r3 = 30
        L7d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AssumedMaxChannelAdjustment: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = ", ["
            r0.append(r2)
            r0.append(r4)
            java.lang.String r2 = " to "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = "]"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r4 = "MediaCodecInfo"
            com.google.android.exoplayer2.util.Log.w(r4, r2)
            return r3
        La9:
            return r4
    }

    @androidx.annotation.RequiresApi(21)
    private static android.graphics.Point alignVideoSizeV21(android.media.MediaCodecInfo.VideoCapabilities r2, int r3, int r4) {
            int r0 = r2.getWidthAlignment()
            int r2 = r2.getHeightAlignment()
            android.graphics.Point r1 = new android.graphics.Point
            int r3 = com.google.android.exoplayer2.util.Util.ceilDivide(r3, r0)
            int r3 = r3 * r0
            int r4 = com.google.android.exoplayer2.util.Util.ceilDivide(r4, r2)
            int r4 = r4 * r2
            r1.<init>(r3, r4)
            return r1
    }

    @androidx.annotation.RequiresApi(21)
    private static boolean areSizeAndRateSupportedV21(android.media.MediaCodecInfo.VideoCapabilities r3, int r4, int r5, double r6) {
            android.graphics.Point r4 = alignVideoSizeV21(r3, r4, r5)
            int r5 = r4.x
            int r4 = r4.y
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 == 0) goto L1e
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 >= 0) goto L15
            goto L1e
        L15:
            double r6 = java.lang.Math.floor(r6)
            boolean r3 = r3.areSizeAndRateSupported(r5, r4, r6)
            return r3
        L1e:
            boolean r3 = r3.isSizeSupported(r5, r4)
            return r3
    }

    private static android.media.MediaCodecInfo.CodecProfileLevel[] estimateLegacyVp9ProfileLevels(@androidx.annotation.Nullable android.media.MediaCodecInfo.CodecCapabilities r3) {
            r0 = 0
            if (r3 == 0) goto L18
            android.media.MediaCodecInfo$VideoCapabilities r3 = r3.getVideoCapabilities()
            if (r3 == 0) goto L18
            android.util.Range r3 = r3.getBitrateRange()
            java.lang.Comparable r3 = r3.getUpper()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L19
        L18:
            r3 = 0
        L19:
            r1 = 180000000(0xaba9500, float:1.7967196E-32)
            r2 = 1
            if (r3 < r1) goto L22
            r3 = 1024(0x400, float:1.435E-42)
            goto L69
        L22:
            r1 = 120000000(0x7270e00, float:1.2567798E-34)
            if (r3 < r1) goto L2a
            r3 = 512(0x200, float:7.17E-43)
            goto L69
        L2a:
            r1 = 60000000(0x3938700, float:8.670878E-37)
            if (r3 < r1) goto L32
            r3 = 256(0x100, float:3.59E-43)
            goto L69
        L32:
            r1 = 30000000(0x1c9c380, float:7.411627E-38)
            if (r3 < r1) goto L3a
            r3 = 128(0x80, float:1.8E-43)
            goto L69
        L3a:
            r1 = 18000000(0x112a880, float:2.6936858E-38)
            if (r3 < r1) goto L42
            r3 = 64
            goto L69
        L42:
            r1 = 12000000(0xb71b00, float:1.6815582E-38)
            if (r3 < r1) goto L4a
            r3 = 32
            goto L69
        L4a:
            r1 = 7200000(0x6ddd00, float:1.0089349E-38)
            if (r3 < r1) goto L52
            r3 = 16
            goto L69
        L52:
            r1 = 3600000(0x36ee80, float:5.044674E-39)
            if (r3 < r1) goto L5a
            r3 = 8
            goto L69
        L5a:
            r1 = 1800000(0x1b7740, float:2.522337E-39)
            if (r3 < r1) goto L61
            r3 = 4
            goto L69
        L61:
            r1 = 800000(0xc3500, float:1.121039E-39)
            if (r3 < r1) goto L68
            r3 = 2
            goto L69
        L68:
            r3 = 1
        L69:
            android.media.MediaCodecInfo$CodecProfileLevel r1 = new android.media.MediaCodecInfo$CodecProfileLevel
            r1.<init>()
            r1.profile = r2
            r1.level = r3
            android.media.MediaCodecInfo$CodecProfileLevel[] r3 = new android.media.MediaCodecInfo.CodecProfileLevel[r2]
            r3[r0] = r1
            return r3
    }

    @androidx.annotation.RequiresApi(23)
    private static int getMaxSupportedInstancesV23(android.media.MediaCodecInfo.CodecCapabilities r0) {
            int r0 = r0.getMaxSupportedInstances()
            return r0
    }

    private static boolean isAdaptive(android.media.MediaCodecInfo.CodecCapabilities r2) {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 19
            if (r0 < r1) goto Le
            boolean r2 = isAdaptiveV19(r2)
            if (r2 == 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    @androidx.annotation.RequiresApi(19)
    private static boolean isAdaptiveV19(android.media.MediaCodecInfo.CodecCapabilities r1) {
            java.lang.String r0 = "adaptive-playback"
            boolean r1 = r1.isFeatureSupported(r0)
            return r1
    }

    private boolean isCodecProfileAndLevelSupported(com.google.android.exoplayer2.Format r10, boolean r11) {
            r9 = this;
            android.util.Pair r0 = com.google.android.exoplayer2.mediacodec.MediaCodecUtil.getCodecProfileAndLevel(r10)
            r1 = 1
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.Object r2 = r0.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.lang.String r3 = r10.sampleMimeType
            java.lang.String r4 = "video/dolby-vision"
            boolean r3 = r4.equals(r3)
            r4 = 0
            if (r3 == 0) goto L42
            java.lang.String r3 = r9.mimeType
            java.lang.String r5 = "video/avc"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L34
            r0 = 8
            r2 = 8
            goto L41
        L34:
            java.lang.String r3 = r9.mimeType
            java.lang.String r5 = "video/hevc"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L42
            r0 = 2
            r2 = 2
        L41:
            r0 = 0
        L42:
            boolean r3 = r9.isVideo
            if (r3 != 0) goto L4b
            r3 = 42
            if (r2 == r3) goto L4b
            return r1
        L4b:
            android.media.MediaCodecInfo$CodecProfileLevel[] r3 = r9.getProfileLevels()
            int r5 = com.google.android.exoplayer2.util.Util.SDK_INT
            r6 = 23
            if (r5 > r6) goto L69
            java.lang.String r5 = r9.mimeType
            java.lang.String r6 = "video/x-vnd.on2.vp9"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L69
            int r5 = r3.length
            if (r5 != 0) goto L69
            android.media.MediaCodecInfo$CodecCapabilities r3 = r9.capabilities
            android.media.MediaCodecInfo$CodecProfileLevel[] r3 = estimateLegacyVp9ProfileLevels(r3)
        L69:
            int r5 = r3.length
            r6 = 0
        L6b:
            if (r6 >= r5) goto L85
            r7 = r3[r6]
            int r8 = r7.profile
            if (r8 != r2) goto L82
            int r7 = r7.level
            if (r7 >= r0) goto L79
            if (r11 != 0) goto L82
        L79:
            java.lang.String r7 = r9.mimeType
            boolean r7 = needsProfileExcludedWorkaround(r7, r2)
            if (r7 != 0) goto L82
            return r1
        L82:
            int r6 = r6 + 1
            goto L6b
        L85:
            java.lang.String r11 = "codec.profileLevel, "
            java.lang.StringBuilder r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r11)
            java.lang.String r10 = r10.codecs
            r11.append(r10)
            java.lang.String r10 = ", "
            r11.append(r10)
            java.lang.String r10 = r9.codecMimeType
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.logNoSupport(r10)
            return r4
    }

    private boolean isSampleMimeTypeSupported(com.google.android.exoplayer2.Format r3) {
            r2 = this;
            java.lang.String r0 = r2.mimeType
            java.lang.String r1 = r3.sampleMimeType
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L19
            java.lang.String r0 = r2.mimeType
            java.lang.String r3 = com.google.android.exoplayer2.mediacodec.MediaCodecUtil.getAlternativeCodecMimeType(r3)
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L17
            goto L19
        L17:
            r3 = 0
            goto L1a
        L19:
            r3 = 1
        L1a:
            return r3
    }

    private static boolean isSecure(android.media.MediaCodecInfo.CodecCapabilities r2) {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 21
            if (r0 < r1) goto Le
            boolean r2 = isSecureV21(r2)
            if (r2 == 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    @androidx.annotation.RequiresApi(21)
    private static boolean isSecureV21(android.media.MediaCodecInfo.CodecCapabilities r1) {
            java.lang.String r0 = "secure-playback"
            boolean r1 = r1.isFeatureSupported(r0)
            return r1
    }

    private static boolean isTunneling(android.media.MediaCodecInfo.CodecCapabilities r2) {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 21
            if (r0 < r1) goto Le
            boolean r2 = isTunnelingV21(r2)
            if (r2 == 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    @androidx.annotation.RequiresApi(21)
    private static boolean isTunnelingV21(android.media.MediaCodecInfo.CodecCapabilities r1) {
            java.lang.String r0 = "tunneled-playback"
            boolean r1 = r1.isFeatureSupported(r0)
            return r1
    }

    private void logAssumedSupport(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "AssumedSupport ["
            java.lang.String r1 = "] ["
            java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m25m(r0, r3, r1)
            java.lang.String r0 = r2.name
            r3.append(r0)
            java.lang.String r0 = ", "
            r3.append(r0)
            java.lang.String r0 = r2.mimeType
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.DEVICE_DEBUG_INFO
            r3.append(r0)
            java.lang.String r0 = "]"
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "MediaCodecInfo"
            com.google.android.exoplayer2.util.Log.d(r0, r3)
            return
    }

    private void logNoSupport(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "NoSupport ["
            java.lang.String r1 = "] ["
            java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m25m(r0, r3, r1)
            java.lang.String r0 = r2.name
            r3.append(r0)
            java.lang.String r0 = ", "
            r3.append(r0)
            java.lang.String r0 = r2.mimeType
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.DEVICE_DEBUG_INFO
            r3.append(r0)
            java.lang.String r0 = "]"
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "MediaCodecInfo"
            com.google.android.exoplayer2.util.Log.d(r0, r3)
            return
    }

    private static boolean needsAdaptationFlushWorkaround(java.lang.String r1) {
            java.lang.String r0 = "audio/opus"
            boolean r1 = r0.equals(r1)
            return r1
    }

    private static boolean needsAdaptationReconfigureWorkaround(java.lang.String r2) {
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.MODEL
            java.lang.String r1 = "SM-T230"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L14
            java.lang.String r0 = "OMX.MARVELL.VIDEO.HW.CODA7542DECODER"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L14
            r2 = 1
            goto L15
        L14:
            r2 = 0
        L15:
            return r2
    }

    private static boolean needsDisableAdaptationWorkaround(java.lang.String r2) {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 22
            if (r0 > r1) goto L2a
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.MODEL
            java.lang.String r1 = "ODROID-XU3"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L18
            java.lang.String r1 = "Nexus 10"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L2a
        L18:
            java.lang.String r0 = "OMX.Exynos.AVC.Decoder"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L28
            java.lang.String r0 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L2a
        L28:
            r2 = 1
            goto L2b
        L2a:
            r2 = 0
        L2b:
            return r2
    }

    private static boolean needsIgnorePerformancePointsWorkaround() {
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.DEVICE
            java.lang.String r1 = "sabrina"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L30
            java.lang.String r1 = "boreal"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L30
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.MODEL
            java.lang.String r1 = "Lenovo TB-X605"
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L30
            java.lang.String r1 = "Lenovo TB-X606"
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L30
            java.lang.String r1 = "Lenovo TB-X616"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L2e
            goto L30
        L2e:
            r0 = 0
            goto L31
        L30:
            r0 = 1
        L31:
            return r0
    }

    private static boolean needsProfileExcludedWorkaround(java.lang.String r1, int r2) {
            java.lang.String r0 = "video/hevc"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L21
            r1 = 2
            if (r1 != r2) goto L21
            java.lang.String r1 = com.google.android.exoplayer2.util.Util.DEVICE
            java.lang.String r2 = "sailfish"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L1f
            java.lang.String r2 = "marlin"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L21
        L1f:
            r1 = 1
            goto L22
        L21:
            r1 = 0
        L22:
            return r1
    }

    private static boolean needsRotatedVerticalResolutionWorkaround(java.lang.String r1) {
            java.lang.String r0 = "OMX.MTK.VIDEO.DECODER.HEVC"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L14
            java.lang.String r1 = com.google.android.exoplayer2.util.Util.DEVICE
            java.lang.String r0 = "mcv5a"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L14
            r1 = 0
            return r1
        L14:
            r1 = 1
            return r1
    }

    public static com.google.android.exoplayer2.mediacodec.MediaCodecInfo newInstance(java.lang.String r12, java.lang.String r13, java.lang.String r14, @androidx.annotation.Nullable android.media.MediaCodecInfo.CodecCapabilities r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20) {
            com.google.android.exoplayer2.mediacodec.MediaCodecInfo r11 = new com.google.android.exoplayer2.mediacodec.MediaCodecInfo
            r0 = 1
            r1 = 0
            if (r19 != 0) goto L16
            if (r15 == 0) goto L16
            boolean r2 = isAdaptive(r15)
            if (r2 == 0) goto L16
            boolean r2 = needsDisableAdaptationWorkaround(r12)
            if (r2 != 0) goto L16
            r8 = 1
            goto L17
        L16:
            r8 = 0
        L17:
            if (r15 == 0) goto L21
            boolean r2 = isTunneling(r15)
            if (r2 == 0) goto L21
            r9 = 1
            goto L22
        L21:
            r9 = 0
        L22:
            if (r20 != 0) goto L2f
            if (r15 == 0) goto L2d
            boolean r2 = isSecure(r15)
            if (r2 == 0) goto L2d
            goto L2f
        L2d:
            r10 = 0
            goto L30
        L2f:
            r10 = 1
        L30:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RequiresApi(21)
    public android.graphics.Point alignVideoSizeV21(int r3, int r4) {
            r2 = this;
            android.media.MediaCodecInfo$CodecCapabilities r0 = r2.capabilities
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            android.media.MediaCodecInfo$VideoCapabilities r0 = r0.getVideoCapabilities()
            if (r0 != 0) goto Ld
            return r1
        Ld:
            android.graphics.Point r3 = alignVideoSizeV21(r0, r3, r4)
            return r3
    }

    public com.google.android.exoplayer2.decoder.DecoderReuseEvaluation canReuseCodec(com.google.android.exoplayer2.Format r14, com.google.android.exoplayer2.Format r15) {
            r13 = this;
            java.lang.String r0 = r14.sampleMimeType
            java.lang.String r1 = r15.sampleMimeType
            boolean r0 = com.google.android.exoplayer2.util.Util.areEqual(r0, r1)
            if (r0 != 0) goto Ld
            r0 = 8
            goto Le
        Ld:
            r0 = 0
        Le:
            boolean r1 = r13.isVideo
            if (r1 == 0) goto L64
            int r1 = r14.rotationDegrees
            int r2 = r15.rotationDegrees
            if (r1 == r2) goto L1a
            r0 = r0 | 1024(0x400, float:1.435E-42)
        L1a:
            boolean r1 = r13.adaptive
            if (r1 != 0) goto L2c
            int r1 = r14.width
            int r2 = r15.width
            if (r1 != r2) goto L2a
            int r1 = r14.height
            int r2 = r15.height
            if (r1 == r2) goto L2c
        L2a:
            r0 = r0 | 512(0x200, float:7.17E-43)
        L2c:
            com.google.android.exoplayer2.video.ColorInfo r1 = r14.colorInfo
            com.google.android.exoplayer2.video.ColorInfo r2 = r15.colorInfo
            boolean r1 = com.google.android.exoplayer2.util.Util.areEqual(r1, r2)
            if (r1 != 0) goto L38
            r0 = r0 | 2048(0x800, float:2.87E-42)
        L38:
            java.lang.String r1 = r13.name
            boolean r1 = needsAdaptationReconfigureWorkaround(r1)
            if (r1 == 0) goto L48
            boolean r1 = r14.initializationDataEquals(r15)
            if (r1 != 0) goto L48
            r0 = r0 | 2
        L48:
            if (r0 != 0) goto L61
            com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r0 = new com.google.android.exoplayer2.decoder.DecoderReuseEvaluation
            java.lang.String r2 = r13.name
            boolean r1 = r14.initializationDataEquals(r15)
            if (r1 == 0) goto L57
            r1 = 3
            r5 = 3
            goto L59
        L57:
            r1 = 2
            r5 = 2
        L59:
            r6 = 0
            r1 = r0
            r3 = r14
            r4 = r15
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
        L61:
            r12 = r0
            goto Ld8
        L64:
            int r1 = r14.channelCount
            int r2 = r15.channelCount
            if (r1 == r2) goto L6c
            r0 = r0 | 4096(0x1000, float:5.74E-42)
        L6c:
            int r1 = r14.sampleRate
            int r2 = r15.sampleRate
            if (r1 == r2) goto L74
            r0 = r0 | 8192(0x2000, float:1.148E-41)
        L74:
            int r1 = r14.pcmEncoding
            int r2 = r15.pcmEncoding
            if (r1 == r2) goto L7c
            r0 = r0 | 16384(0x4000, float:2.2959E-41)
        L7c:
            if (r0 != 0) goto Lb7
            java.lang.String r1 = r13.mimeType
            java.lang.String r2 = "audio/mp4a-latm"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto Lb7
            android.util.Pair r1 = com.google.android.exoplayer2.mediacodec.MediaCodecUtil.getCodecProfileAndLevel(r14)
            android.util.Pair r2 = com.google.android.exoplayer2.mediacodec.MediaCodecUtil.getCodecProfileAndLevel(r15)
            if (r1 == 0) goto Lb7
            if (r2 == 0) goto Lb7
            java.lang.Object r1 = r1.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.Object r2 = r2.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = 42
            if (r1 != r3) goto Lb7
            if (r2 != r3) goto Lb7
            com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r0 = new com.google.android.exoplayer2.decoder.DecoderReuseEvaluation
            java.lang.String r5 = r13.name
            r8 = 3
            r9 = 0
            r4 = r0
            r6 = r14
            r7 = r15
            r4.<init>(r5, r6, r7, r8, r9)
            return r0
        Lb7:
            boolean r1 = r14.initializationDataEquals(r15)
            if (r1 != 0) goto Lbf
            r0 = r0 | 32
        Lbf:
            java.lang.String r1 = r13.mimeType
            boolean r1 = needsAdaptationFlushWorkaround(r1)
            if (r1 == 0) goto Lc9
            r0 = r0 | 2
        Lc9:
            if (r0 != 0) goto L61
            com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r0 = new com.google.android.exoplayer2.decoder.DecoderReuseEvaluation
            java.lang.String r2 = r13.name
            r5 = 1
            r6 = 0
            r1 = r0
            r3 = r14
            r4 = r15
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
        Ld8:
            com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r0 = new com.google.android.exoplayer2.decoder.DecoderReuseEvaluation
            java.lang.String r8 = r13.name
            r11 = 0
            r7 = r0
            r9 = r14
            r10 = r15
            r7.<init>(r8, r9, r10, r11, r12)
            return r0
    }

    public int getMaxSupportedInstances() {
            r2 = this;
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 23
            if (r0 < r1) goto L10
            android.media.MediaCodecInfo$CodecCapabilities r0 = r2.capabilities
            if (r0 != 0) goto Lb
            goto L10
        Lb:
            int r0 = getMaxSupportedInstancesV23(r0)
            return r0
        L10:
            r0 = -1
            return r0
    }

    public android.media.MediaCodecInfo.CodecProfileLevel[] getProfileLevels() {
            r1 = this;
            android.media.MediaCodecInfo$CodecCapabilities r0 = r1.capabilities
            if (r0 == 0) goto L8
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = r0.profileLevels
            if (r0 != 0) goto Lb
        L8:
            r0 = 0
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = new android.media.MediaCodecInfo.CodecProfileLevel[r0]
        Lb:
            return r0
    }

    @androidx.annotation.RequiresApi(21)
    public boolean isAudioChannelCountSupportedV21(int r5) {
            r4 = this;
            android.media.MediaCodecInfo$CodecCapabilities r0 = r4.capabilities
            r1 = 0
            if (r0 != 0) goto Lb
            java.lang.String r5 = "channelCount.caps"
            r4.logNoSupport(r5)
            return r1
        Lb:
            android.media.MediaCodecInfo$AudioCapabilities r0 = r0.getAudioCapabilities()
            if (r0 != 0) goto L17
            java.lang.String r5 = "channelCount.aCaps"
            r4.logNoSupport(r5)
            return r1
        L17:
            java.lang.String r2 = r4.name
            java.lang.String r3 = r4.mimeType
            int r0 = r0.getMaxInputChannelCount()
            int r0 = adjustMaxInputChannelCount(r2, r3, r0)
            if (r0 >= r5) goto L2f
            java.lang.String r0 = "channelCount.support, "
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r5)
            r4.logNoSupport(r5)
            return r1
        L2f:
            r5 = 1
            return r5
    }

    @androidx.annotation.RequiresApi(21)
    public boolean isAudioSampleRateSupportedV21(int r3) {
            r2 = this;
            android.media.MediaCodecInfo$CodecCapabilities r0 = r2.capabilities
            r1 = 0
            if (r0 != 0) goto Lc
            java.lang.String r3 = "sampleRate.caps"
            r2.logNoSupport(r3)
            return r1
        Lc:
            android.media.MediaCodecInfo$AudioCapabilities r0 = r0.getAudioCapabilities()
            if (r0 != 0) goto L19
            java.lang.String r3 = "sampleRate.aCaps"
            r2.logNoSupport(r3)
            return r1
        L19:
            boolean r0 = r0.isSampleRateSupported(r3)
            if (r0 != 0) goto L2a
            java.lang.String r0 = "sampleRate.support, "
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r3)
            r2.logNoSupport(r3)
            return r1
        L2a:
            r3 = 1
            return r3
    }

    public boolean isFormatFunctionallySupported(com.google.android.exoplayer2.Format r3) {
            r2 = this;
            boolean r0 = r2.isSampleMimeTypeSupported(r3)
            r1 = 0
            if (r0 == 0) goto Le
            boolean r3 = r2.isCodecProfileAndLevelSupported(r3, r1)
            if (r3 == 0) goto Le
            r1 = 1
        Le:
            return r1
    }

    public boolean isFormatSupported(com.google.android.exoplayer2.Format r6) throws com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException {
            r5 = this;
            boolean r0 = r5.isSampleMimeTypeSupported(r6)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r0 = 1
            boolean r2 = r5.isCodecProfileAndLevelSupported(r6, r0)
            if (r2 != 0) goto L10
            return r1
        L10:
            boolean r2 = r5.isVideo
            r3 = 21
            if (r2 == 0) goto L55
            int r2 = r6.width
            if (r2 <= 0) goto L54
            int r4 = r6.height
            if (r4 > 0) goto L1f
            goto L54
        L1f:
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            if (r0 < r3) goto L2b
            float r6 = r6.frameRate
            double r0 = (double) r6
            boolean r6 = r5.isVideoSizeAndRateSupportedV21(r2, r4, r0)
            return r6
        L2b:
            int r2 = r2 * r4
            int r0 = com.google.android.exoplayer2.mediacodec.MediaCodecUtil.maxH264DecodableFrameSize()
            if (r2 > r0) goto L34
            r1 = 1
        L34:
            if (r1 != 0) goto L53
            java.lang.String r0 = "legacyFrameSize, "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            int r2 = r6.width
            r0.append(r2)
            java.lang.String r2 = "x"
            r0.append(r2)
            int r6 = r6.height
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.logNoSupport(r6)
        L53:
            return r1
        L54:
            return r0
        L55:
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            if (r0 < r3) goto L6e
            int r0 = r6.sampleRate
            r2 = -1
            if (r0 == r2) goto L64
            boolean r0 = r5.isAudioSampleRateSupportedV21(r0)
            if (r0 == 0) goto L6f
        L64:
            int r6 = r6.channelCount
            if (r6 == r2) goto L6e
            boolean r6 = r5.isAudioChannelCountSupportedV21(r6)
            if (r6 == 0) goto L6f
        L6e:
            r1 = 1
        L6f:
            return r1
    }

    public boolean isHdr10PlusOutOfBandMetadataSupported() {
            r6 = this;
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 0
            r2 = 29
            if (r0 < r2) goto L27
            java.lang.String r0 = r6.mimeType
            java.lang.String r2 = "video/x-vnd.on2.vp9"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L27
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = r6.getProfileLevels()
            int r2 = r0.length
            r3 = 0
        L18:
            if (r3 >= r2) goto L27
            r4 = r0[r3]
            int r4 = r4.profile
            r5 = 16384(0x4000, float:2.2959E-41)
            if (r4 != r5) goto L24
            r0 = 1
            return r0
        L24:
            int r3 = r3 + 1
            goto L18
        L27:
            return r1
    }

    public boolean isSeamlessAdaptationSupported(com.google.android.exoplayer2.Format r2) {
            r1 = this;
            boolean r0 = r1.isVideo
            if (r0 == 0) goto L7
            boolean r2 = r1.adaptive
            return r2
        L7:
            android.util.Pair r2 = com.google.android.exoplayer2.mediacodec.MediaCodecUtil.getCodecProfileAndLevel(r2)
            if (r2 == 0) goto L1b
            java.lang.Object r2 = r2.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0 = 42
            if (r2 != r0) goto L1b
            r2 = 1
            goto L1c
        L1b:
            r2 = 0
        L1c:
            return r2
    }

    @java.lang.Deprecated
    public boolean isSeamlessAdaptationSupported(com.google.android.exoplayer2.Format r1, com.google.android.exoplayer2.Format r2, boolean r3) {
            r0 = this;
            if (r3 != 0) goto L18
            com.google.android.exoplayer2.video.ColorInfo r3 = r1.colorInfo
            if (r3 == 0) goto L18
            com.google.android.exoplayer2.video.ColorInfo r3 = r2.colorInfo
            if (r3 != 0) goto L18
            com.google.android.exoplayer2.Format$Builder r2 = r2.buildUpon()
            com.google.android.exoplayer2.video.ColorInfo r3 = r1.colorInfo
            com.google.android.exoplayer2.Format$Builder r2 = r2.setColorInfo(r3)
            com.google.android.exoplayer2.Format r2 = r2.build()
        L18:
            com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r1 = r0.canReuseCodec(r1, r2)
            int r1 = r1.result
            r2 = 2
            if (r1 == r2) goto L27
            r2 = 3
            if (r1 != r2) goto L25
            goto L27
        L25:
            r1 = 0
            goto L28
        L27:
            r1 = 1
        L28:
            return r1
    }

    @androidx.annotation.RequiresApi(21)
    public boolean isVideoSizeAndRateSupportedV21(int r8, int r9, double r10) {
            r7 = this;
            android.media.MediaCodecInfo$CodecCapabilities r0 = r7.capabilities
            r1 = 0
            if (r0 != 0) goto Lc
            java.lang.String r8 = "sizeAndRate.caps"
            r7.logNoSupport(r8)
            return r1
        Lc:
            android.media.MediaCodecInfo$VideoCapabilities r0 = r0.getVideoCapabilities()
            if (r0 != 0) goto L19
            java.lang.String r8 = "sizeAndRate.vCaps"
            r7.logNoSupport(r8)
            return r1
        L19:
            int r2 = com.google.android.exoplayer2.util.Util.SDK_INT
            r3 = 29
            java.lang.String r4 = "@"
            java.lang.String r5 = "x"
            r6 = 1
            if (r2 < r3) goto L41
            int r2 = com.google.android.exoplayer2.mediacodec.MediaCodecInfo.Api29.areResolutionAndFrameRateCovered(r0, r8, r9, r10)
            r3 = 2
            if (r2 != r3) goto L2d
            return r6
        L2d:
            if (r2 != r6) goto L41
            java.lang.String r0 = "sizeAndRate.cover, "
            java.lang.StringBuilder r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r8, r5, r9, r4)
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            r7.logNoSupport(r8)
            return r1
        L41:
            boolean r2 = areSizeAndRateSupportedV21(r0, r8, r9, r10)
            if (r2 != 0) goto L7c
            if (r8 >= r9) goto L6a
            java.lang.String r2 = r7.name
            boolean r2 = needsRotatedVerticalResolutionWorkaround(r2)
            if (r2 == 0) goto L6a
            boolean r0 = areSizeAndRateSupportedV21(r0, r9, r8, r10)
            if (r0 != 0) goto L58
            goto L6a
        L58:
            java.lang.String r0 = "sizeAndRate.rotated, "
            java.lang.StringBuilder r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r8, r5, r9, r4)
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            r7.logAssumedSupport(r8)
            goto L7c
        L6a:
            java.lang.String r0 = "sizeAndRate.support, "
            java.lang.StringBuilder r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r8, r5, r9, r4)
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            r7.logNoSupport(r8)
            return r1
        L7c:
            return r6
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }
}
