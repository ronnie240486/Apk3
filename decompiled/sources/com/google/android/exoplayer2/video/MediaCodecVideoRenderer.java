package com.google.android.exoplayer2.video;

/* JADX INFO: loaded from: classes3.dex */
public class MediaCodecVideoRenderer extends com.google.android.exoplayer2.mediacodec.MediaCodecRenderer {
    private static final int HEVC_MAX_INPUT_SIZE_THRESHOLD = 2097152;
    private static final float INITIAL_FORMAT_MAX_INPUT_SIZE_SCALE_FACTOR = 1.5f;
    private static final java.lang.String KEY_CROP_BOTTOM = "crop-bottom";
    private static final java.lang.String KEY_CROP_LEFT = "crop-left";
    private static final java.lang.String KEY_CROP_RIGHT = "crop-right";
    private static final java.lang.String KEY_CROP_TOP = "crop-top";
    private static final int[] STANDARD_LONG_EDGE_VIDEO_PX = null;
    private static final java.lang.String TAG = "MediaCodecVideoRenderer";
    private static final long TUNNELING_EOS_PRESENTATION_TIME_US = Long.MAX_VALUE;
    private static boolean deviceNeedsSetOutputSurfaceWorkaround;
    private static boolean evaluatedDeviceNeedsSetOutputSurfaceWorkaround;
    private final long allowedJoiningTimeMs;
    private int buffersInCodecCount;
    private boolean codecHandlesHdr10PlusOutOfBandMetadata;
    private com.google.android.exoplayer2.video.MediaCodecVideoRenderer.CodecMaxValues codecMaxValues;
    private boolean codecNeedsSetOutputSurfaceWorkaround;
    private int consecutiveDroppedFrameCount;
    private final android.content.Context context;
    private int currentHeight;
    private float currentPixelWidthHeightRatio;
    private int currentUnappliedRotationDegrees;
    private int currentWidth;
    private final boolean deviceNeedsNoPostProcessWorkaround;
    private long droppedFrameAccumulationStartTimeMs;
    private int droppedFrames;
    private final com.google.android.exoplayer2.video.VideoRendererEventListener.EventDispatcher eventDispatcher;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.video.VideoFrameMetadataListener frameMetadataListener;
    private final com.google.android.exoplayer2.video.VideoFrameReleaseHelper frameReleaseHelper;
    private boolean haveReportedFirstFrameRenderedForCurrentSurface;
    private long initialPositionUs;
    private long joiningDeadlineMs;
    private long lastBufferPresentationTimeUs;
    private long lastFrameReleaseTimeNs;
    private long lastRenderRealtimeUs;
    private final int maxDroppedFramesToNotify;
    private boolean mayRenderFirstFrameAfterEnableIfNotStarted;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.video.PlaceholderSurface placeholderSurface;
    private boolean renderedFirstFrameAfterEnable;
    private boolean renderedFirstFrameAfterReset;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.video.VideoSize reportedVideoSize;
    private int scalingMode;

    @androidx.annotation.Nullable
    private android.view.Surface surface;
    private long totalVideoFrameProcessingOffsetUs;
    private boolean tunneling;
    private int tunnelingAudioSessionId;

    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.video.MediaCodecVideoRenderer.OnFrameRenderedListenerV23 tunnelingOnFrameRenderedListener;
    private int videoFrameProcessingOffsetCount;

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(26)
    public static final class Api26 {
        private Api26() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static boolean doesDisplaySupportDolbyVision(android.content.Context r5) {
                java.lang.String r0 = "display"
                java.lang.Object r5 = r5.getSystemService(r0)
                android.hardware.display.DisplayManager r5 = (android.hardware.display.DisplayManager) r5
                r0 = 0
                if (r5 == 0) goto L10
                android.view.Display r5 = r5.getDisplay(r0)
                goto L11
            L10:
                r5 = 0
            L11:
                r1 = 1
                if (r5 == 0) goto L2f
                boolean r2 = r5.isHdr()
                if (r2 == 0) goto L2f
                android.view.Display$HdrCapabilities r5 = r5.getHdrCapabilities()
                int[] r5 = r5.getSupportedHdrTypes()
                int r2 = r5.length
                r3 = 0
            L24:
                if (r3 >= r2) goto L2f
                r4 = r5[r3]
                if (r4 != r1) goto L2c
                r0 = 1
                goto L2f
            L2c:
                int r3 = r3 + 1
                goto L24
            L2f:
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class CodecMaxValues {
        public final int height;
        public final int inputSize;
        public final int width;

        public CodecMaxValues(int r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.width = r1
                r0.height = r2
                r0.inputSize = r3
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(23)
    public final class OnFrameRenderedListenerV23 implements com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.OnFrameRenderedListener, android.os.Handler.Callback {
        private static final int HANDLE_FRAME_RENDERED = 0;
        private final android.os.Handler handler;
        public final /* synthetic */ com.google.android.exoplayer2.video.MediaCodecVideoRenderer this$0;

        public OnFrameRenderedListenerV23(com.google.android.exoplayer2.video.MediaCodecVideoRenderer r1, com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                android.os.Handler r1 = com.google.android.exoplayer2.util.Util.createHandlerForCurrentLooper(r0)
                r0.handler = r1
                r2.setOnFrameRenderedListener(r0, r1)
                return
        }

        private void handleFrameRendered(long r4) {
                r3 = this;
                com.google.android.exoplayer2.video.MediaCodecVideoRenderer r0 = r3.this$0
                com.google.android.exoplayer2.video.MediaCodecVideoRenderer$OnFrameRenderedListenerV23 r1 = r0.tunnelingOnFrameRenderedListener
                if (r3 != r1) goto L28
                com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r0 = r0.getCodec()
                if (r0 != 0) goto Ld
                goto L28
            Ld:
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 != 0) goto L1c
                com.google.android.exoplayer2.video.MediaCodecVideoRenderer r4 = r3.this$0
                com.google.android.exoplayer2.video.MediaCodecVideoRenderer.access$100(r4)
                goto L28
            L1c:
                com.google.android.exoplayer2.video.MediaCodecVideoRenderer r0 = r3.this$0     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L22
                r0.onProcessedTunneledBuffer(r4)     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L22
                goto L28
            L22:
                r4 = move-exception
                com.google.android.exoplayer2.video.MediaCodecVideoRenderer r5 = r3.this$0
                r5.setPendingPlaybackException(r4)
            L28:
                return
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message r3) {
                r2 = this;
                int r0 = r3.what
                if (r0 == 0) goto L6
                r3 = 0
                return r3
            L6:
                int r0 = r3.arg1
                int r3 = r3.arg2
                long r0 = com.google.android.exoplayer2.util.Util.toLong(r0, r3)
                r2.handleFrameRendered(r0)
                r3 = 1
                return r3
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.OnFrameRenderedListener
        public void onFrameRendered(com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r3, long r4, long r6) {
                r2 = this;
                int r3 = com.google.android.exoplayer2.util.Util.SDK_INT
                r6 = 30
                if (r3 >= r6) goto L19
                android.os.Handler r3 = r2.handler
                r6 = 0
                r7 = 32
                long r0 = r4 >> r7
                int r7 = (int) r0
                int r5 = (int) r4
                android.os.Message r3 = android.os.Message.obtain(r3, r6, r7, r5)
                android.os.Handler r4 = r2.handler
                r4.sendMessageAtFrontOfQueue(r3)
                goto L1c
            L19:
                r2.handleFrameRendered(r4)
            L1c:
                return
        }
    }

    static {
            r0 = 9
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [1920, 1600, 1440, 1280, 960, 854, 640, 540, 480} // fill-array
            com.google.android.exoplayer2.video.MediaCodecVideoRenderer.STANDARD_LONG_EDGE_VIDEO_PX = r0
            return
    }

    public MediaCodecVideoRenderer(android.content.Context r12, com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Factory r13, com.google.android.exoplayer2.mediacodec.MediaCodecSelector r14, long r15, boolean r17, @androidx.annotation.Nullable android.os.Handler r18, @androidx.annotation.Nullable com.google.android.exoplayer2.video.VideoRendererEventListener r19, int r20) {
            r11 = this;
            r10 = 1106247680(0x41f00000, float:30.0)
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10)
            return
    }

    public MediaCodecVideoRenderer(android.content.Context r8, com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Factory r9, com.google.android.exoplayer2.mediacodec.MediaCodecSelector r10, long r11, boolean r13, @androidx.annotation.Nullable android.os.Handler r14, @androidx.annotation.Nullable com.google.android.exoplayer2.video.VideoRendererEventListener r15, int r16, float r17) {
            r7 = this;
            r6 = r7
            r1 = 2
            r0 = r7
            r2 = r9
            r3 = r10
            r4 = r13
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = r11
            r6.allowedJoiningTimeMs = r0
            r0 = r16
            r6.maxDroppedFramesToNotify = r0
            android.content.Context r0 = r8.getApplicationContext()
            r6.context = r0
            com.google.android.exoplayer2.video.VideoFrameReleaseHelper r1 = new com.google.android.exoplayer2.video.VideoFrameReleaseHelper
            r1.<init>(r0)
            r6.frameReleaseHelper = r1
            com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher r0 = new com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher
            r1 = r14
            r2 = r15
            r0.<init>(r14, r15)
            r6.eventDispatcher = r0
            boolean r0 = deviceNeedsNoPostProcessWorkaround()
            r6.deviceNeedsNoPostProcessWorkaround = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.joiningDeadlineMs = r0
            r0 = -1
            r6.currentWidth = r0
            r6.currentHeight = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r6.currentPixelWidthHeightRatio = r0
            r0 = 1
            r6.scalingMode = r0
            r0 = 0
            r6.tunnelingAudioSessionId = r0
            r7.clearReportedVideoSize()
            return
    }

    public MediaCodecVideoRenderer(android.content.Context r3, com.google.android.exoplayer2.mediacodec.MediaCodecSelector r4) {
            r2 = this;
            r0 = 0
            r2.<init>(r3, r4, r0)
            return
    }

    public MediaCodecVideoRenderer(android.content.Context r9, com.google.android.exoplayer2.mediacodec.MediaCodecSelector r10, long r11) {
            r8 = this;
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r0.<init>(r1, r2, r3, r5, r6, r7)
            return
    }

    public MediaCodecVideoRenderer(android.content.Context r12, com.google.android.exoplayer2.mediacodec.MediaCodecSelector r13, long r14, @androidx.annotation.Nullable android.os.Handler r16, @androidx.annotation.Nullable com.google.android.exoplayer2.video.VideoRendererEventListener r17, int r18) {
            r11 = this;
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter$Factory r2 = com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Factory.DEFAULT
            r6 = 0
            r10 = 1106247680(0x41f00000, float:30.0)
            r0 = r11
            r1 = r12
            r3 = r13
            r4 = r14
            r7 = r16
            r8 = r17
            r9 = r18
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10)
            return
    }

    public MediaCodecVideoRenderer(android.content.Context r12, com.google.android.exoplayer2.mediacodec.MediaCodecSelector r13, long r14, boolean r16, @androidx.annotation.Nullable android.os.Handler r17, @androidx.annotation.Nullable com.google.android.exoplayer2.video.VideoRendererEventListener r18, int r19) {
            r11 = this;
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter$Factory r2 = com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Factory.DEFAULT
            r10 = 1106247680(0x41f00000, float:30.0)
            r0 = r11
            r1 = r12
            r3 = r13
            r4 = r14
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10)
            return
    }

    public static /* synthetic */ void access$100(com.google.android.exoplayer2.video.MediaCodecVideoRenderer r0) {
            r0.onProcessedTunneledEndOfStream()
            return
    }

    private void clearRenderedFirstFrame() {
            r2 = this;
            r0 = 0
            r2.renderedFirstFrameAfterReset = r0
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 23
            if (r0 < r1) goto L1a
            boolean r0 = r2.tunneling
            if (r0 == 0) goto L1a
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r0 = r2.getCodec()
            if (r0 == 0) goto L1a
            com.google.android.exoplayer2.video.MediaCodecVideoRenderer$OnFrameRenderedListenerV23 r1 = new com.google.android.exoplayer2.video.MediaCodecVideoRenderer$OnFrameRenderedListenerV23
            r1.<init>(r2, r0)
            r2.tunnelingOnFrameRenderedListener = r1
        L1a:
            return
    }

    private void clearReportedVideoSize() {
            r1 = this;
            r0 = 0
            r1.reportedVideoSize = r0
            return
    }

    @androidx.annotation.RequiresApi(21)
    private static void configureTunnelingV21(android.media.MediaFormat r2, int r3) {
            java.lang.String r0 = "tunneled-playback"
            r1 = 1
            r2.setFeatureEnabled(r0, r1)
            java.lang.String r0 = "audio-session-id"
            r2.setInteger(r0, r3)
            return
    }

    private static boolean deviceNeedsNoPostProcessWorkaround() {
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.MANUFACTURER
            java.lang.String r1 = "NVIDIA"
            boolean r0 = r1.equals(r0)
            return r0
    }

    private static boolean evaluateDeviceNeedsSetOutputSurfaceWorkaround() {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 28
            r2 = 7
            r3 = 6
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = -1
            r9 = 0
            r10 = 1
            if (r0 > r1) goto L7a
            java.lang.String r11 = com.google.android.exoplayer2.util.Util.DEVICE
            java.util.Objects.requireNonNull(r11)
            int r12 = r11.hashCode()
            switch(r12) {
                case -1339091551: goto L6b;
                case -1220081023: goto L60;
                case -1220066608: goto L55;
                case -1012436106: goto L4a;
                case -760312546: goto L3f;
                case -64886864: goto L34;
                case 3415681: goto L29;
                case 825323514: goto L1e;
                default: goto L1b;
            }
        L1b:
            r11 = -1
            goto L75
        L1e:
            java.lang.String r12 = "machuca"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L27
            goto L1b
        L27:
            r11 = 7
            goto L75
        L29:
            java.lang.String r12 = "once"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L32
            goto L1b
        L32:
            r11 = 6
            goto L75
        L34:
            java.lang.String r12 = "magnolia"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L3d
            goto L1b
        L3d:
            r11 = 5
            goto L75
        L3f:
            java.lang.String r12 = "aquaman"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L48
            goto L1b
        L48:
            r11 = 4
            goto L75
        L4a:
            java.lang.String r12 = "oneday"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L53
            goto L1b
        L53:
            r11 = 3
            goto L75
        L55:
            java.lang.String r12 = "dangalUHD"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L5e
            goto L1b
        L5e:
            r11 = 2
            goto L75
        L60:
            java.lang.String r12 = "dangalFHD"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L69
            goto L1b
        L69:
            r11 = 1
            goto L75
        L6b:
            java.lang.String r12 = "dangal"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L74
            goto L1b
        L74:
            r11 = 0
        L75:
            switch(r11) {
                case 0: goto L79;
                case 1: goto L79;
                case 2: goto L79;
                case 3: goto L79;
                case 4: goto L79;
                case 5: goto L79;
                case 6: goto L79;
                case 7: goto L79;
                default: goto L78;
            }
        L78:
            goto L7a
        L79:
            return r10
        L7a:
            r11 = 27
            if (r0 > r11) goto L89
            java.lang.String r12 = com.google.android.exoplayer2.util.Util.DEVICE
            java.lang.String r13 = "HWEML"
            boolean r12 = r13.equals(r12)
            if (r12 == 0) goto L89
            return r10
        L89:
            java.lang.String r12 = com.google.android.exoplayer2.util.Util.MODEL
            java.util.Objects.requireNonNull(r12)
            int r13 = r12.hashCode()
            r14 = 8
            switch(r13) {
                case -349662828: goto Lf4;
                case -321033677: goto Le9;
                case 2006354: goto Lde;
                case 2006367: goto Ld3;
                case 2006371: goto Lc8;
                case 1785421873: goto Lbd;
                case 1785421876: goto Lb2;
                case 1798172390: goto La7;
                case 2119412532: goto L9a;
                default: goto L97;
            }
        L97:
            r13 = -1
            goto Lfe
        L9a:
            java.lang.String r13 = "AFTEUFF014"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto La3
            goto L97
        La3:
            r13 = 8
            goto Lfe
        La7:
            java.lang.String r13 = "AFTSO001"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto Lb0
            goto L97
        Lb0:
            r13 = 7
            goto Lfe
        Lb2:
            java.lang.String r13 = "AFTEU014"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto Lbb
            goto L97
        Lbb:
            r13 = 6
            goto Lfe
        Lbd:
            java.lang.String r13 = "AFTEU011"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto Lc6
            goto L97
        Lc6:
            r13 = 5
            goto Lfe
        Lc8:
            java.lang.String r13 = "AFTR"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto Ld1
            goto L97
        Ld1:
            r13 = 4
            goto Lfe
        Ld3:
            java.lang.String r13 = "AFTN"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto Ldc
            goto L97
        Ldc:
            r13 = 3
            goto Lfe
        Lde:
            java.lang.String r13 = "AFTA"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto Le7
            goto L97
        Le7:
            r13 = 2
            goto Lfe
        Le9:
            java.lang.String r13 = "AFTKMST12"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto Lf2
            goto L97
        Lf2:
            r13 = 1
            goto Lfe
        Lf4:
            java.lang.String r13 = "AFTJMST12"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto Lfd
            goto L97
        Lfd:
            r13 = 0
        Lfe:
            switch(r13) {
                case 0: goto L8b8;
                case 1: goto L8b8;
                case 2: goto L8b8;
                case 3: goto L8b8;
                case 4: goto L8b8;
                case 5: goto L8b8;
                case 6: goto L8b8;
                case 7: goto L8b8;
                case 8: goto L8b8;
                default: goto L101;
            }
        L101:
            r13 = 26
            if (r0 > r13) goto L8b7
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.DEVICE
            java.util.Objects.requireNonNull(r0)
            int r15 = r0.hashCode()
            switch(r15) {
                case -2144781245: goto L89c;
                case -2144781185: goto L890;
                case -2144781160: goto L884;
                case -2097309513: goto L878;
                case -2022874474: goto L86c;
                case -1978993182: goto L860;
                case -1978990237: goto L854;
                case -1936688988: goto L848;
                case -1936688066: goto L83a;
                case -1936688065: goto L82c;
                case -1931988508: goto L81e;
                case -1885099851: goto L810;
                case -1696512866: goto L802;
                case -1680025915: goto L7f4;
                case -1615810839: goto L7e6;
                case -1600724499: goto L7d8;
                case -1554255044: goto L7c9;
                case -1481772737: goto L7bb;
                case -1481772730: goto L7ad;
                case -1481772729: goto L79f;
                case -1320080169: goto L791;
                case -1217592143: goto L783;
                case -1180384755: goto L775;
                case -1139198265: goto L767;
                case -1052835013: goto L759;
                case -993250464: goto L74b;
                case -993250458: goto L73d;
                case -965403638: goto L72e;
                case -958336948: goto L724;
                case -879245230: goto L715;
                case -842500323: goto L707;
                case -821392978: goto L6f9;
                case -797483286: goto L6eb;
                case -794946968: goto L6dc;
                case -788334647: goto L6cd;
                case -782144577: goto L6bf;
                case -575125681: goto L6b1;
                case -521118391: goto L6a3;
                case -430914369: goto L695;
                case -290434366: goto L686;
                case -282781963: goto L678;
                case -277133239: goto L66a;
                case -173639913: goto L65c;
                case -56598463: goto L64d;
                case 2126: goto L63f;
                case 2564: goto L631;
                case 2715: goto L623;
                case 2719: goto L615;
                case 3091: goto L607;
                case 3483: goto L5f9;
                case 73405: goto L5eb;
                case 75537: goto L5dd;
                case 75739: goto L5cf;
                case 76779: goto L5c1;
                case 78669: goto L5b3;
                case 79305: goto L5a5;
                case 80618: goto L597;
                case 88274: goto L589;
                case 98846: goto L57b;
                case 98848: goto L56d;
                case 99329: goto L55f;
                case 101481: goto L551;
                case 1513190: goto L543;
                case 1514184: goto L535;
                case 1514185: goto L527;
                case 2133089: goto L519;
                case 2133091: goto L50b;
                case 2133120: goto L4fd;
                case 2133151: goto L4ef;
                case 2133182: goto L4e1;
                case 2133184: goto L4d3;
                case 2436959: goto L4c5;
                case 2463773: goto L4b7;
                case 2464648: goto L4a9;
                case 2689555: goto L49b;
                case 3154429: goto L48d;
                case 3284551: goto L47f;
                case 3351335: goto L471;
                case 3386211: goto L463;
                case 41325051: goto L455;
                case 51349633: goto L447;
                case 51350594: goto L439;
                case 55178625: goto L42b;
                case 61542055: goto L41d;
                case 65355429: goto L40f;
                case 66214468: goto L401;
                case 66214470: goto L3f3;
                case 66214473: goto L3e5;
                case 66215429: goto L3d7;
                case 66215431: goto L3c9;
                case 66215433: goto L3bb;
                case 66216390: goto L3ad;
                case 76402249: goto L39f;
                case 76404105: goto L391;
                case 76404911: goto L383;
                case 80963634: goto L375;
                case 82882791: goto L367;
                case 98715550: goto L359;
                case 101370885: goto L34b;
                case 102844228: goto L33d;
                case 165221241: goto L32f;
                case 182191441: goto L321;
                case 245388979: goto L313;
                case 287431619: goto L305;
                case 307593612: goto L2f7;
                case 308517133: goto L2e9;
                case 316215098: goto L2db;
                case 316215116: goto L2cd;
                case 316246811: goto L2bf;
                case 316246818: goto L2b1;
                case 407160593: goto L2a3;
                case 507412548: goto L295;
                case 793982701: goto L287;
                case 794038622: goto L279;
                case 794040393: goto L26b;
                case 835649806: goto L25d;
                case 917340916: goto L24f;
                case 958008161: goto L241;
                case 1060579533: goto L233;
                case 1150207623: goto L225;
                case 1176899427: goto L217;
                case 1280332038: goto L209;
                case 1306947716: goto L1fb;
                case 1349174697: goto L1ed;
                case 1522194893: goto L1de;
                case 1691543273: goto L1d0;
                case 1691544261: goto L1c2;
                case 1709443163: goto L1b4;
                case 1865889110: goto L1a5;
                case 1906253259: goto L197;
                case 1977196784: goto L189;
                case 2006372676: goto L17c;
                case 2019281702: goto L16f;
                case 2029784656: goto L162;
                case 2030379515: goto L155;
                case 2033393791: goto L148;
                case 2047190025: goto L13b;
                case 2047252157: goto L12e;
                case 2048319463: goto L121;
                case 2048855701: goto L114;
                default: goto L111;
            }
        L111:
            r1 = -1
            goto L8a7
        L114:
            java.lang.String r1 = "HWWAS-H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L11d
            goto L111
        L11d:
            r1 = 139(0x8b, float:1.95E-43)
            goto L8a7
        L121:
            java.lang.String r1 = "HWVNS-H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L12a
            goto L111
        L12a:
            r1 = 138(0x8a, float:1.93E-43)
            goto L8a7
        L12e:
            java.lang.String r1 = "ELUGA_Prim"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L137
            goto L111
        L137:
            r1 = 137(0x89, float:1.92E-43)
            goto L8a7
        L13b:
            java.lang.String r1 = "ELUGA_Note"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L144
            goto L111
        L144:
            r1 = 136(0x88, float:1.9E-43)
            goto L8a7
        L148:
            java.lang.String r1 = "ASUS_X00AD_2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L151
            goto L111
        L151:
            r1 = 135(0x87, float:1.89E-43)
            goto L8a7
        L155:
            java.lang.String r1 = "HWCAM-H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15e
            goto L111
        L15e:
            r1 = 134(0x86, float:1.88E-43)
            goto L8a7
        L162:
            java.lang.String r1 = "HWBLN-H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L16b
            goto L111
        L16b:
            r1 = 133(0x85, float:1.86E-43)
            goto L8a7
        L16f:
            java.lang.String r1 = "DM-01K"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L178
            goto L111
        L178:
            r1 = 132(0x84, float:1.85E-43)
            goto L8a7
        L17c:
            java.lang.String r1 = "BRAVIA_ATV3_4K"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L185
            goto L111
        L185:
            r1 = 131(0x83, float:1.84E-43)
            goto L8a7
        L189:
            java.lang.String r1 = "Infinix-X572"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L193
            goto L111
        L193:
            r1 = 130(0x82, float:1.82E-43)
            goto L8a7
        L197:
            java.lang.String r1 = "PB2-670M"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1a1
            goto L111
        L1a1:
            r1 = 129(0x81, float:1.81E-43)
            goto L8a7
        L1a5:
            java.lang.String r1 = "santoni"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1b0
            goto L111
        L1b0:
            r1 = 128(0x80, float:1.8E-43)
            goto L8a7
        L1b4:
            java.lang.String r1 = "iball8735_9806"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1be
            goto L111
        L1be:
            r1 = 127(0x7f, float:1.78E-43)
            goto L8a7
        L1c2:
            java.lang.String r1 = "CPH1715"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1cc
            goto L111
        L1cc:
            r1 = 126(0x7e, float:1.77E-43)
            goto L8a7
        L1d0:
            java.lang.String r1 = "CPH1609"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1da
            goto L111
        L1da:
            r1 = 125(0x7d, float:1.75E-43)
            goto L8a7
        L1de:
            java.lang.String r1 = "woods_f"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e9
            goto L111
        L1e9:
            r1 = 124(0x7c, float:1.74E-43)
            goto L8a7
        L1ed:
            java.lang.String r1 = "htc_e56ml_dtul"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1f7
            goto L111
        L1f7:
            r1 = 123(0x7b, float:1.72E-43)
            goto L8a7
        L1fb:
            java.lang.String r1 = "EverStar_S"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L205
            goto L111
        L205:
            r1 = 122(0x7a, float:1.71E-43)
            goto L8a7
        L209:
            java.lang.String r1 = "hwALE-H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L213
            goto L111
        L213:
            r1 = 121(0x79, float:1.7E-43)
            goto L8a7
        L217:
            java.lang.String r1 = "itel_S41"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L221
            goto L111
        L221:
            r1 = 120(0x78, float:1.68E-43)
            goto L8a7
        L225:
            java.lang.String r1 = "LS-5017"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L22f
            goto L111
        L22f:
            r1 = 119(0x77, float:1.67E-43)
            goto L8a7
        L233:
            java.lang.String r1 = "panell_d"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L23d
            goto L111
        L23d:
            r1 = 118(0x76, float:1.65E-43)
            goto L8a7
        L241:
            java.lang.String r1 = "j2xlteins"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L24b
            goto L111
        L24b:
            r1 = 117(0x75, float:1.64E-43)
            goto L8a7
        L24f:
            java.lang.String r1 = "A7000plus"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L259
            goto L111
        L259:
            r1 = 116(0x74, float:1.63E-43)
            goto L8a7
        L25d:
            java.lang.String r1 = "manning"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L267
            goto L111
        L267:
            r1 = 115(0x73, float:1.61E-43)
            goto L8a7
        L26b:
            java.lang.String r1 = "GIONEE_WBL7519"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L275
            goto L111
        L275:
            r1 = 114(0x72, float:1.6E-43)
            goto L8a7
        L279:
            java.lang.String r1 = "GIONEE_WBL7365"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L283
            goto L111
        L283:
            r1 = 113(0x71, float:1.58E-43)
            goto L8a7
        L287:
            java.lang.String r1 = "GIONEE_WBL5708"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L291
            goto L111
        L291:
            r1 = 112(0x70, float:1.57E-43)
            goto L8a7
        L295:
            java.lang.String r1 = "QM16XE_U"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L29f
            goto L111
        L29f:
            r1 = 111(0x6f, float:1.56E-43)
            goto L8a7
        L2a3:
            java.lang.String r1 = "Pixi5-10_4G"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2ad
            goto L111
        L2ad:
            r1 = 110(0x6e, float:1.54E-43)
            goto L8a7
        L2b1:
            java.lang.String r1 = "TB3-850M"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2bb
            goto L111
        L2bb:
            r1 = 109(0x6d, float:1.53E-43)
            goto L8a7
        L2bf:
            java.lang.String r1 = "TB3-850F"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2c9
            goto L111
        L2c9:
            r1 = 108(0x6c, float:1.51E-43)
            goto L8a7
        L2cd:
            java.lang.String r1 = "TB3-730X"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2d7
            goto L111
        L2d7:
            r1 = 107(0x6b, float:1.5E-43)
            goto L8a7
        L2db:
            java.lang.String r1 = "TB3-730F"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2e5
            goto L111
        L2e5:
            r1 = 106(0x6a, float:1.49E-43)
            goto L8a7
        L2e9:
            java.lang.String r1 = "A7020a48"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2f3
            goto L111
        L2f3:
            r1 = 105(0x69, float:1.47E-43)
            goto L8a7
        L2f7:
            java.lang.String r1 = "A7010a48"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L301
            goto L111
        L301:
            r1 = 104(0x68, float:1.46E-43)
            goto L8a7
        L305:
            java.lang.String r1 = "griffin"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L30f
            goto L111
        L30f:
            r1 = 103(0x67, float:1.44E-43)
            goto L8a7
        L313:
            java.lang.String r1 = "marino_f"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L31d
            goto L111
        L31d:
            r1 = 102(0x66, float:1.43E-43)
            goto L8a7
        L321:
            java.lang.String r1 = "CPY83_I00"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L32b
            goto L111
        L32b:
            r1 = 101(0x65, float:1.42E-43)
            goto L8a7
        L32f:
            java.lang.String r1 = "A2016a40"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L339
            goto L111
        L339:
            r1 = 100
            goto L8a7
        L33d:
            java.lang.String r1 = "le_x6"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L347
            goto L111
        L347:
            r1 = 99
            goto L8a7
        L34b:
            java.lang.String r1 = "l5460"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L355
            goto L111
        L355:
            r1 = 98
            goto L8a7
        L359:
            java.lang.String r1 = "i9031"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L363
            goto L111
        L363:
            r1 = 97
            goto L8a7
        L367:
            java.lang.String r1 = "X3_HK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L371
            goto L111
        L371:
            r1 = 96
            goto L8a7
        L375:
            java.lang.String r1 = "V23GB"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L37f
            goto L111
        L37f:
            r1 = 95
            goto L8a7
        L383:
            java.lang.String r1 = "Q4310"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L38d
            goto L111
        L38d:
            r1 = 94
            goto L8a7
        L391:
            java.lang.String r1 = "Q4260"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L39b
            goto L111
        L39b:
            r1 = 93
            goto L8a7
        L39f:
            java.lang.String r1 = "PRO7S"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3a9
            goto L111
        L3a9:
            r1 = 92
            goto L8a7
        L3ad:
            java.lang.String r1 = "F3311"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3b7
            goto L111
        L3b7:
            r1 = 91
            goto L8a7
        L3bb:
            java.lang.String r1 = "F3215"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3c5
            goto L111
        L3c5:
            r1 = 90
            goto L8a7
        L3c9:
            java.lang.String r1 = "F3213"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3d3
            goto L111
        L3d3:
            r1 = 89
            goto L8a7
        L3d7:
            java.lang.String r1 = "F3211"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3e1
            goto L111
        L3e1:
            r1 = 88
            goto L8a7
        L3e5:
            java.lang.String r1 = "F3116"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3ef
            goto L111
        L3ef:
            r1 = 87
            goto L8a7
        L3f3:
            java.lang.String r1 = "F3113"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3fd
            goto L111
        L3fd:
            r1 = 86
            goto L8a7
        L401:
            java.lang.String r1 = "F3111"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L40b
            goto L111
        L40b:
            r1 = 85
            goto L8a7
        L40f:
            java.lang.String r1 = "E5643"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L419
            goto L111
        L419:
            r1 = 84
            goto L8a7
        L41d:
            java.lang.String r1 = "A1601"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L427
            goto L111
        L427:
            r1 = 83
            goto L8a7
        L42b:
            java.lang.String r1 = "Aura_Note_2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L435
            goto L111
        L435:
            r1 = 82
            goto L8a7
        L439:
            java.lang.String r1 = "602LV"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L443
            goto L111
        L443:
            r1 = 81
            goto L8a7
        L447:
            java.lang.String r1 = "601LV"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L451
            goto L111
        L451:
            r1 = 80
            goto L8a7
        L455:
            java.lang.String r1 = "MEIZU_M5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L45f
            goto L111
        L45f:
            r1 = 79
            goto L8a7
        L463:
            java.lang.String r1 = "p212"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L46d
            goto L111
        L46d:
            r1 = 78
            goto L8a7
        L471:
            java.lang.String r1 = "mido"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L47b
            goto L111
        L47b:
            r1 = 77
            goto L8a7
        L47f:
            java.lang.String r1 = "kate"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L489
            goto L111
        L489:
            r1 = 76
            goto L8a7
        L48d:
            java.lang.String r1 = "fugu"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L497
            goto L111
        L497:
            r1 = 75
            goto L8a7
        L49b:
            java.lang.String r1 = "XE2X"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4a5
            goto L111
        L4a5:
            r1 = 74
            goto L8a7
        L4a9:
            java.lang.String r1 = "Q427"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4b3
            goto L111
        L4b3:
            r1 = 73
            goto L8a7
        L4b7:
            java.lang.String r1 = "Q350"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4c1
            goto L111
        L4c1:
            r1 = 72
            goto L8a7
        L4c5:
            java.lang.String r1 = "P681"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4cf
            goto L111
        L4cf:
            r1 = 71
            goto L8a7
        L4d3:
            java.lang.String r1 = "F04J"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4dd
            goto L111
        L4dd:
            r1 = 70
            goto L8a7
        L4e1:
            java.lang.String r1 = "F04H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4eb
            goto L111
        L4eb:
            r1 = 69
            goto L8a7
        L4ef:
            java.lang.String r1 = "F03H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4f9
            goto L111
        L4f9:
            r1 = 68
            goto L8a7
        L4fd:
            java.lang.String r1 = "F02H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L507
            goto L111
        L507:
            r1 = 67
            goto L8a7
        L50b:
            java.lang.String r1 = "F01J"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L515
            goto L111
        L515:
            r1 = 66
            goto L8a7
        L519:
            java.lang.String r1 = "F01H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L523
            goto L111
        L523:
            r1 = 65
            goto L8a7
        L527:
            java.lang.String r1 = "1714"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L531
            goto L111
        L531:
            r1 = 64
            goto L8a7
        L535:
            java.lang.String r1 = "1713"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L53f
            goto L111
        L53f:
            r1 = 63
            goto L8a7
        L543:
            java.lang.String r1 = "1601"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L54d
            goto L111
        L54d:
            r1 = 62
            goto L8a7
        L551:
            java.lang.String r1 = "flo"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L55b
            goto L111
        L55b:
            r1 = 61
            goto L8a7
        L55f:
            java.lang.String r1 = "deb"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L569
            goto L111
        L569:
            r1 = 60
            goto L8a7
        L56d:
            java.lang.String r1 = "cv3"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L577
            goto L111
        L577:
            r1 = 59
            goto L8a7
        L57b:
            java.lang.String r1 = "cv1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L585
            goto L111
        L585:
            r1 = 58
            goto L8a7
        L589:
            java.lang.String r1 = "Z80"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L593
            goto L111
        L593:
            r1 = 57
            goto L8a7
        L597:
            java.lang.String r1 = "QX1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5a1
            goto L111
        L5a1:
            r1 = 56
            goto L8a7
        L5a5:
            java.lang.String r1 = "PLE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5af
            goto L111
        L5af:
            r1 = 55
            goto L8a7
        L5b3:
            java.lang.String r1 = "P85"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5bd
            goto L111
        L5bd:
            r1 = 54
            goto L8a7
        L5c1:
            java.lang.String r1 = "MX6"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5cb
            goto L111
        L5cb:
            r1 = 53
            goto L8a7
        L5cf:
            java.lang.String r1 = "M5c"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5d9
            goto L111
        L5d9:
            r1 = 52
            goto L8a7
        L5dd:
            java.lang.String r1 = "M04"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5e7
            goto L111
        L5e7:
            r1 = 51
            goto L8a7
        L5eb:
            java.lang.String r1 = "JGZ"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5f5
            goto L111
        L5f5:
            r1 = 50
            goto L8a7
        L5f9:
            java.lang.String r1 = "mh"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L603
            goto L111
        L603:
            r1 = 49
            goto L8a7
        L607:
            java.lang.String r1 = "b5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L611
            goto L111
        L611:
            r1 = 48
            goto L8a7
        L615:
            java.lang.String r1 = "V5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L61f
            goto L111
        L61f:
            r1 = 47
            goto L8a7
        L623:
            java.lang.String r1 = "V1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L62d
            goto L111
        L62d:
            r1 = 46
            goto L8a7
        L631:
            java.lang.String r1 = "Q5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L63b
            goto L111
        L63b:
            r1 = 45
            goto L8a7
        L63f:
            java.lang.String r1 = "C1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L649
            goto L111
        L649:
            r1 = 44
            goto L8a7
        L64d:
            java.lang.String r1 = "woods_fn"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L658
            goto L111
        L658:
            r1 = 43
            goto L8a7
        L65c:
            java.lang.String r1 = "ELUGA_A3_Pro"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L666
            goto L111
        L666:
            r1 = 42
            goto L8a7
        L66a:
            java.lang.String r1 = "Z12_PRO"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L674
            goto L111
        L674:
            r1 = 41
            goto L8a7
        L678:
            java.lang.String r1 = "BLACK-1X"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L682
            goto L111
        L682:
            r1 = 40
            goto L8a7
        L686:
            java.lang.String r1 = "taido_row"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L691
            goto L111
        L691:
            r1 = 39
            goto L8a7
        L695:
            java.lang.String r1 = "Pixi4-7_3G"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L69f
            goto L111
        L69f:
            r1 = 38
            goto L8a7
        L6a3:
            java.lang.String r1 = "GIONEE_GBL7360"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L6ad
            goto L111
        L6ad:
            r1 = 37
            goto L8a7
        L6b1:
            java.lang.String r1 = "GiONEE_CBL7513"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L6bb
            goto L111
        L6bb:
            r1 = 36
            goto L8a7
        L6bf:
            java.lang.String r1 = "OnePlus5T"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L6c9
            goto L111
        L6c9:
            r1 = 35
            goto L8a7
        L6cd:
            java.lang.String r1 = "whyred"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L6d8
            goto L111
        L6d8:
            r1 = 34
            goto L8a7
        L6dc:
            java.lang.String r1 = "watson"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L6e7
            goto L111
        L6e7:
            r1 = 33
            goto L8a7
        L6eb:
            java.lang.String r1 = "SVP-DTV15"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L6f5
            goto L111
        L6f5:
            r1 = 32
            goto L8a7
        L6f9:
            java.lang.String r1 = "A7000-a"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L703
            goto L111
        L703:
            r1 = 31
            goto L8a7
        L707:
            java.lang.String r1 = "nicklaus_f"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L711
            goto L111
        L711:
            r1 = 30
            goto L8a7
        L715:
            java.lang.String r1 = "tcl_eu"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L720
            goto L111
        L720:
            r1 = 29
            goto L8a7
        L724:
            java.lang.String r2 = "ELUGA_Ray_X"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L8a7
            goto L111
        L72e:
            java.lang.String r1 = "s905x018"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L739
            goto L111
        L739:
            r1 = 27
            goto L8a7
        L73d:
            java.lang.String r1 = "A10-70L"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L747
            goto L111
        L747:
            r1 = 26
            goto L8a7
        L74b:
            java.lang.String r1 = "A10-70F"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L755
            goto L111
        L755:
            r1 = 25
            goto L8a7
        L759:
            java.lang.String r1 = "namath"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L763
            goto L111
        L763:
            r1 = 24
            goto L8a7
        L767:
            java.lang.String r1 = "Slate_Pro"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L771
            goto L111
        L771:
            r1 = 23
            goto L8a7
        L775:
            java.lang.String r1 = "iris60"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L77f
            goto L111
        L77f:
            r1 = 22
            goto L8a7
        L783:
            java.lang.String r1 = "BRAVIA_ATV2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L78d
            goto L111
        L78d:
            r1 = 21
            goto L8a7
        L791:
            java.lang.String r1 = "GiONEE_GBL7319"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L79b
            goto L111
        L79b:
            r1 = 20
            goto L8a7
        L79f:
            java.lang.String r1 = "panell_dt"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L7a9
            goto L111
        L7a9:
            r1 = 19
            goto L8a7
        L7ad:
            java.lang.String r1 = "panell_ds"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L7b7
            goto L111
        L7b7:
            r1 = 18
            goto L8a7
        L7bb:
            java.lang.String r1 = "panell_dl"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L7c5
            goto L111
        L7c5:
            r1 = 17
            goto L8a7
        L7c9:
            java.lang.String r1 = "vernee_M5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L7d4
            goto L111
        L7d4:
            r1 = 16
            goto L8a7
        L7d8:
            java.lang.String r1 = "pacificrim"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L7e2
            goto L111
        L7e2:
            r1 = 15
            goto L8a7
        L7e6:
            java.lang.String r1 = "Phantom6"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L7f0
            goto L111
        L7f0:
            r1 = 14
            goto L8a7
        L7f4:
            java.lang.String r1 = "ComioS1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L7fe
            goto L111
        L7fe:
            r1 = 13
            goto L8a7
        L802:
            java.lang.String r1 = "XT1663"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L80c
            goto L111
        L80c:
            r1 = 12
            goto L8a7
        L810:
            java.lang.String r1 = "RAIJIN"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L81a
            goto L111
        L81a:
            r1 = 11
            goto L8a7
        L81e:
            java.lang.String r1 = "AquaPowerM"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L828
            goto L111
        L828:
            r1 = 10
            goto L8a7
        L82c:
            java.lang.String r1 = "PGN611"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L836
            goto L111
        L836:
            r1 = 9
            goto L8a7
        L83a:
            java.lang.String r1 = "PGN610"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L844
            goto L111
        L844:
            r1 = 8
            goto L8a7
        L848:
            java.lang.String r1 = "PGN528"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L852
            goto L111
        L852:
            r1 = 7
            goto L8a7
        L854:
            java.lang.String r1 = "NX573J"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L85e
            goto L111
        L85e:
            r1 = 6
            goto L8a7
        L860:
            java.lang.String r1 = "NX541J"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L86a
            goto L111
        L86a:
            r1 = 5
            goto L8a7
        L86c:
            java.lang.String r1 = "CP8676_I02"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L876
            goto L111
        L876:
            r1 = 4
            goto L8a7
        L878:
            java.lang.String r1 = "K50a40"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L882
            goto L111
        L882:
            r1 = 3
            goto L8a7
        L884:
            java.lang.String r1 = "GIONEE_SWW1631"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L88e
            goto L111
        L88e:
            r1 = 2
            goto L8a7
        L890:
            java.lang.String r1 = "GIONEE_SWW1627"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L89a
            goto L111
        L89a:
            r1 = 1
            goto L8a7
        L89c:
            java.lang.String r1 = "GIONEE_SWW1609"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L8a6
            goto L111
        L8a6:
            r1 = 0
        L8a7:
            switch(r1) {
                case 0: goto L8b6;
                case 1: goto L8b6;
                case 2: goto L8b6;
                case 3: goto L8b6;
                case 4: goto L8b6;
                case 5: goto L8b6;
                case 6: goto L8b6;
                case 7: goto L8b6;
                case 8: goto L8b6;
                case 9: goto L8b6;
                case 10: goto L8b6;
                case 11: goto L8b6;
                case 12: goto L8b6;
                case 13: goto L8b6;
                case 14: goto L8b6;
                case 15: goto L8b6;
                case 16: goto L8b6;
                case 17: goto L8b6;
                case 18: goto L8b6;
                case 19: goto L8b6;
                case 20: goto L8b6;
                case 21: goto L8b6;
                case 22: goto L8b6;
                case 23: goto L8b6;
                case 24: goto L8b6;
                case 25: goto L8b6;
                case 26: goto L8b6;
                case 27: goto L8b6;
                case 28: goto L8b6;
                case 29: goto L8b6;
                case 30: goto L8b6;
                case 31: goto L8b6;
                case 32: goto L8b6;
                case 33: goto L8b6;
                case 34: goto L8b6;
                case 35: goto L8b6;
                case 36: goto L8b6;
                case 37: goto L8b6;
                case 38: goto L8b6;
                case 39: goto L8b6;
                case 40: goto L8b6;
                case 41: goto L8b6;
                case 42: goto L8b6;
                case 43: goto L8b6;
                case 44: goto L8b6;
                case 45: goto L8b6;
                case 46: goto L8b6;
                case 47: goto L8b6;
                case 48: goto L8b6;
                case 49: goto L8b6;
                case 50: goto L8b6;
                case 51: goto L8b6;
                case 52: goto L8b6;
                case 53: goto L8b6;
                case 54: goto L8b6;
                case 55: goto L8b6;
                case 56: goto L8b6;
                case 57: goto L8b6;
                case 58: goto L8b6;
                case 59: goto L8b6;
                case 60: goto L8b6;
                case 61: goto L8b6;
                case 62: goto L8b6;
                case 63: goto L8b6;
                case 64: goto L8b6;
                case 65: goto L8b6;
                case 66: goto L8b6;
                case 67: goto L8b6;
                case 68: goto L8b6;
                case 69: goto L8b6;
                case 70: goto L8b6;
                case 71: goto L8b6;
                case 72: goto L8b6;
                case 73: goto L8b6;
                case 74: goto L8b6;
                case 75: goto L8b6;
                case 76: goto L8b6;
                case 77: goto L8b6;
                case 78: goto L8b6;
                case 79: goto L8b6;
                case 80: goto L8b6;
                case 81: goto L8b6;
                case 82: goto L8b6;
                case 83: goto L8b6;
                case 84: goto L8b6;
                case 85: goto L8b6;
                case 86: goto L8b6;
                case 87: goto L8b6;
                case 88: goto L8b6;
                case 89: goto L8b6;
                case 90: goto L8b6;
                case 91: goto L8b6;
                case 92: goto L8b6;
                case 93: goto L8b6;
                case 94: goto L8b6;
                case 95: goto L8b6;
                case 96: goto L8b6;
                case 97: goto L8b6;
                case 98: goto L8b6;
                case 99: goto L8b6;
                case 100: goto L8b6;
                case 101: goto L8b6;
                case 102: goto L8b6;
                case 103: goto L8b6;
                case 104: goto L8b6;
                case 105: goto L8b6;
                case 106: goto L8b6;
                case 107: goto L8b6;
                case 108: goto L8b6;
                case 109: goto L8b6;
                case 110: goto L8b6;
                case 111: goto L8b6;
                case 112: goto L8b6;
                case 113: goto L8b6;
                case 114: goto L8b6;
                case 115: goto L8b6;
                case 116: goto L8b6;
                case 117: goto L8b6;
                case 118: goto L8b6;
                case 119: goto L8b6;
                case 120: goto L8b6;
                case 121: goto L8b6;
                case 122: goto L8b6;
                case 123: goto L8b6;
                case 124: goto L8b6;
                case 125: goto L8b6;
                case 126: goto L8b6;
                case 127: goto L8b6;
                case 128: goto L8b6;
                case 129: goto L8b6;
                case 130: goto L8b6;
                case 131: goto L8b6;
                case 132: goto L8b6;
                case 133: goto L8b6;
                case 134: goto L8b6;
                case 135: goto L8b6;
                case 136: goto L8b6;
                case 137: goto L8b6;
                case 138: goto L8b6;
                case 139: goto L8b6;
                default: goto L8aa;
            }
        L8aa:
            java.util.Objects.requireNonNull(r12)
            java.lang.String r0 = "JSN-L21"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L8b6
            goto L8b7
        L8b6:
            return r10
        L8b7:
            return r9
        L8b8:
            return r10
    }

    public static int getCodecMaxInputSize(com.google.android.exoplayer2.mediacodec.MediaCodecInfo r9, com.google.android.exoplayer2.Format r10) {
            int r0 = r10.width
            int r1 = r10.height
            r2 = -1
            if (r0 == r2) goto Led
            if (r1 != r2) goto Lb
            goto Led
        Lb:
            java.lang.String r3 = r10.sampleMimeType
            java.lang.String r4 = "video/dolby-vision"
            boolean r4 = r4.equals(r3)
            java.lang.String r5 = "video/avc"
            java.lang.String r6 = "video/hevc"
            r7 = 1
            r8 = 2
            if (r4 == 0) goto L37
            android.util.Pair r10 = com.google.android.exoplayer2.mediacodec.MediaCodecUtil.getCodecProfileAndLevel(r10)
            if (r10 == 0) goto L36
            java.lang.Object r10 = r10.first
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r3 = 512(0x200, float:7.17E-43)
            if (r10 == r3) goto L34
            if (r10 == r7) goto L34
            if (r10 != r8) goto L36
        L34:
            r3 = r5
            goto L37
        L36:
            r3 = r6
        L37:
            java.util.Objects.requireNonNull(r3)
            int r10 = r3.hashCode()
            r4 = 4
            switch(r10) {
                case -1664118616: goto L84;
                case -1662735862: goto L7a;
                case -1662541442: goto L71;
                case 1187890754: goto L65;
                case 1331836730: goto L5c;
                case 1599127256: goto L50;
                case 1599127257: goto L44;
                default: goto L42;
            }
        L42:
            r7 = -1
            goto L8f
        L44:
            java.lang.String r10 = "video/x-vnd.on2.vp9"
            boolean r10 = r3.equals(r10)
            if (r10 != 0) goto L4e
            goto L42
        L4e:
            r7 = 6
            goto L8f
        L50:
            java.lang.String r10 = "video/x-vnd.on2.vp8"
            boolean r10 = r3.equals(r10)
            if (r10 != 0) goto L5a
            goto L42
        L5a:
            r7 = 5
            goto L8f
        L5c:
            boolean r10 = r3.equals(r5)
            if (r10 != 0) goto L63
            goto L42
        L63:
            r7 = 4
            goto L8f
        L65:
            java.lang.String r10 = "video/mp4v-es"
            boolean r10 = r3.equals(r10)
            if (r10 != 0) goto L6f
            goto L42
        L6f:
            r7 = 3
            goto L8f
        L71:
            boolean r10 = r3.equals(r6)
            if (r10 != 0) goto L78
            goto L42
        L78:
            r7 = 2
            goto L8f
        L7a:
            java.lang.String r10 = "video/av01"
            boolean r10 = r3.equals(r10)
            if (r10 != 0) goto L8f
            goto L42
        L84:
            java.lang.String r10 = "video/3gpp"
            boolean r10 = r3.equals(r10)
            if (r10 != 0) goto L8e
            goto L42
        L8e:
            r7 = 0
        L8f:
            switch(r7) {
                case 0: goto Le6;
                case 1: goto Le6;
                case 2: goto Ld9;
                case 3: goto Le6;
                case 4: goto L9a;
                case 5: goto Le6;
                case 6: goto L93;
                default: goto L92;
            }
        L92:
            return r2
        L93:
            int r0 = r0 * r1
            int r9 = getMaxSampleSize(r0, r4)
            return r9
        L9a:
            java.lang.String r10 = com.google.android.exoplayer2.util.Util.MODEL
            java.lang.String r3 = "BRAVIA 4K 2015"
            boolean r3 = r3.equals(r10)
            if (r3 != 0) goto Ld8
            java.lang.String r3 = com.google.android.exoplayer2.util.Util.MANUFACTURER
            java.lang.String r4 = "Amazon"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto Lc3
            java.lang.String r3 = "KFSOWI"
            boolean r3 = r3.equals(r10)
            if (r3 != 0) goto Ld8
            java.lang.String r3 = "AFTS"
            boolean r10 = r3.equals(r10)
            if (r10 == 0) goto Lc3
            boolean r9 = r9.secure
            if (r9 == 0) goto Lc3
            goto Ld8
        Lc3:
            r9 = 16
            int r10 = com.google.android.exoplayer2.util.Util.ceilDivide(r0, r9)
            int r0 = com.google.android.exoplayer2.util.Util.ceilDivide(r1, r9)
            int r0 = r0 * r10
            int r0 = r0 * 16
            int r0 = r0 * 16
            int r9 = getMaxSampleSize(r0, r8)
            return r9
        Ld8:
            return r2
        Ld9:
            r9 = 2097152(0x200000, float:2.938736E-39)
            int r0 = r0 * r1
            int r10 = getMaxSampleSize(r0, r8)
            int r9 = java.lang.Math.max(r9, r10)
            return r9
        Le6:
            int r0 = r0 * r1
            int r9 = getMaxSampleSize(r0, r8)
            return r9
        Led:
            return r2
    }

    @androidx.annotation.Nullable
    private static android.graphics.Point getCodecMaxSize(com.google.android.exoplayer2.mediacodec.MediaCodecInfo r13, com.google.android.exoplayer2.Format r14) {
            int r0 = r14.height
            int r1 = r14.width
            r2 = 0
            if (r0 <= r1) goto L9
            r3 = 1
            goto La
        L9:
            r3 = 0
        La:
            if (r3 == 0) goto Le
            r4 = r0
            goto Lf
        Le:
            r4 = r1
        Lf:
            if (r3 == 0) goto L12
            r0 = r1
        L12:
            float r1 = (float) r0
            float r5 = (float) r4
            float r1 = r1 / r5
            int[] r5 = com.google.android.exoplayer2.video.MediaCodecVideoRenderer.STANDARD_LONG_EDGE_VIDEO_PX
            int r6 = r5.length
        L18:
            r7 = 0
            if (r2 >= r6) goto L6f
            r8 = r5[r2]
            float r9 = (float) r8
            float r9 = r9 * r1
            int r9 = (int) r9
            if (r8 <= r4) goto L6f
            if (r9 > r0) goto L26
            goto L6f
        L26:
            int r10 = com.google.android.exoplayer2.util.Util.SDK_INT
            r11 = 21
            if (r10 < r11) goto L47
            if (r3 == 0) goto L30
            r7 = r9
            goto L31
        L30:
            r7 = r8
        L31:
            if (r3 == 0) goto L34
            goto L35
        L34:
            r8 = r9
        L35:
            android.graphics.Point r7 = r13.alignVideoSizeV21(r7, r8)
            float r8 = r14.frameRate
            int r9 = r7.x
            int r10 = r7.y
            double r11 = (double) r8
            boolean r8 = r13.isVideoSizeAndRateSupportedV21(r9, r10, r11)
            if (r8 == 0) goto L6c
            return r7
        L47:
            r10 = 16
            int r8 = com.google.android.exoplayer2.util.Util.ceilDivide(r8, r10)     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L6f
            int r8 = r8 * 16
            int r9 = com.google.android.exoplayer2.util.Util.ceilDivide(r9, r10)     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L6f
            int r9 = r9 * 16
            int r10 = r8 * r9
            int r11 = com.google.android.exoplayer2.mediacodec.MediaCodecUtil.maxH264DecodableFrameSize()     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L6f
            if (r10 > r11) goto L6c
            android.graphics.Point r13 = new android.graphics.Point     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L6f
            if (r3 == 0) goto L63
            r14 = r9
            goto L64
        L63:
            r14 = r8
        L64:
            if (r3 == 0) goto L67
            goto L68
        L67:
            r8 = r9
        L68:
            r13.<init>(r14, r8)     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L6f
            return r13
        L6c:
            int r2 = r2 + 1
            goto L18
        L6f:
            return r7
    }

    private static java.util.List<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> getDecoderInfos(android.content.Context r2, com.google.android.exoplayer2.mediacodec.MediaCodecSelector r3, com.google.android.exoplayer2.Format r4, boolean r5, boolean r6) throws com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException {
            java.lang.String r0 = r4.sampleMimeType
            if (r0 != 0) goto L9
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.of()
            return r2
        L9:
            java.util.List r0 = r3.getDecoderInfos(r0, r5, r6)
            java.lang.String r1 = com.google.android.exoplayer2.mediacodec.MediaCodecUtil.getAlternativeCodecMimeType(r4)
            if (r1 != 0) goto L18
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.copyOf(r0)
            return r2
        L18:
            java.util.List r3 = r3.getDecoderInfos(r1, r5, r6)
            int r5 = com.google.android.exoplayer2.util.Util.SDK_INT
            r6 = 26
            if (r5 < r6) goto L3e
            java.lang.String r4 = r4.sampleMimeType
            java.lang.String r5 = "video/dolby-vision"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L3e
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L3e
            boolean r2 = com.google.android.exoplayer2.video.MediaCodecVideoRenderer.Api26.doesDisplaySupportDolbyVision(r2)
            if (r2 != 0) goto L3e
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.copyOf(r3)
            return r2
        L3e:
            com.google.common.collect.ImmutableList$Builder r2 = com.google.common.collect.ImmutableList.builder()
            com.google.common.collect.ImmutableList$Builder r2 = r2.addAll(r0)
            com.google.common.collect.ImmutableList$Builder r2 = r2.addAll(r3)
            com.google.common.collect.ImmutableList r2 = r2.build()
            return r2
    }

    public static int getMaxInputSize(com.google.android.exoplayer2.mediacodec.MediaCodecInfo r3, com.google.android.exoplayer2.Format r4) {
            int r0 = r4.maxInputSize
            r1 = -1
            if (r0 == r1) goto L20
            java.util.List<byte[]> r3 = r4.initializationData
            int r3 = r3.size()
            r0 = 0
            r1 = 0
        Ld:
            if (r0 >= r3) goto L1c
            java.util.List<byte[]> r2 = r4.initializationData
            java.lang.Object r2 = r2.get(r0)
            byte[] r2 = (byte[]) r2
            int r2 = r2.length
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto Ld
        L1c:
            int r3 = r4.maxInputSize
            int r3 = r3 + r1
            return r3
        L20:
            int r3 = getCodecMaxInputSize(r3, r4)
            return r3
    }

    private static int getMaxSampleSize(int r0, int r1) {
            int r0 = r0 * 3
            int r1 = r1 * 2
            int r0 = r0 / r1
            return r0
    }

    private static boolean isBufferLate(long r3) {
            r0 = -30000(0xffffffffffff8ad0, double:NaN)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 >= 0) goto L8
            r3 = 1
            goto L9
        L8:
            r3 = 0
        L9:
            return r3
    }

    private static boolean isBufferVeryLate(long r3) {
            r0 = -500000(0xfffffffffff85ee0, double:NaN)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 >= 0) goto L9
            r3 = 1
            goto La
        L9:
            r3 = 0
        La:
            return r3
    }

    private void maybeNotifyDroppedFrames() {
            r6 = this;
            int r0 = r6.droppedFrames
            if (r0 <= 0) goto L18
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r6.droppedFrameAccumulationStartTimeMs
            long r2 = r0 - r2
            com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher r4 = r6.eventDispatcher
            int r5 = r6.droppedFrames
            r4.droppedFrames(r5, r2)
            r2 = 0
            r6.droppedFrames = r2
            r6.droppedFrameAccumulationStartTimeMs = r0
        L18:
            return
    }

    private void maybeNotifyVideoFrameProcessingOffset() {
            r4 = this;
            int r0 = r4.videoFrameProcessingOffsetCount
            if (r0 == 0) goto L12
            com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher r1 = r4.eventDispatcher
            long r2 = r4.totalVideoFrameProcessingOffsetUs
            r1.reportVideoFrameProcessingOffset(r2, r0)
            r0 = 0
            r4.totalVideoFrameProcessingOffsetUs = r0
            r0 = 0
            r4.videoFrameProcessingOffsetCount = r0
        L12:
            return
    }

    private void maybeNotifyVideoSizeChanged() {
            r5 = this;
            int r0 = r5.currentWidth
            r1 = -1
            if (r0 != r1) goto L9
            int r2 = r5.currentHeight
            if (r2 == r1) goto L39
        L9:
            com.google.android.exoplayer2.video.VideoSize r1 = r5.reportedVideoSize
            if (r1 == 0) goto L25
            int r2 = r1.width
            if (r2 != r0) goto L25
            int r0 = r1.height
            int r2 = r5.currentHeight
            if (r0 != r2) goto L25
            int r0 = r1.unappliedRotationDegrees
            int r2 = r5.currentUnappliedRotationDegrees
            if (r0 != r2) goto L25
            float r0 = r1.pixelWidthHeightRatio
            float r1 = r5.currentPixelWidthHeightRatio
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L39
        L25:
            com.google.android.exoplayer2.video.VideoSize r0 = new com.google.android.exoplayer2.video.VideoSize
            int r1 = r5.currentWidth
            int r2 = r5.currentHeight
            int r3 = r5.currentUnappliedRotationDegrees
            float r4 = r5.currentPixelWidthHeightRatio
            r0.<init>(r1, r2, r3, r4)
            r5.reportedVideoSize = r0
            com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher r1 = r5.eventDispatcher
            r1.videoSizeChanged(r0)
        L39:
            return
    }

    private void maybeRenotifyRenderedFirstFrame() {
            r2 = this;
            boolean r0 = r2.haveReportedFirstFrameRenderedForCurrentSurface
            if (r0 == 0) goto Lb
            com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher r0 = r2.eventDispatcher
            android.view.Surface r1 = r2.surface
            r0.renderedFirstFrame(r1)
        Lb:
            return
    }

    private void maybeRenotifyVideoSizeChanged() {
            r2 = this;
            com.google.android.exoplayer2.video.VideoSize r0 = r2.reportedVideoSize
            if (r0 == 0) goto L9
            com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher r1 = r2.eventDispatcher
            r1.videoSizeChanged(r0)
        L9:
            return
    }

    private void notifyFrameMetadataListener(long r8, long r10, com.google.android.exoplayer2.Format r12) {
            r7 = this;
            com.google.android.exoplayer2.video.VideoFrameMetadataListener r0 = r7.frameMetadataListener
            if (r0 == 0) goto Le
            android.media.MediaFormat r6 = r7.getCodecOutputMediaFormat()
            r1 = r8
            r3 = r10
            r5 = r12
            r0.onVideoFrameAboutToBeRendered(r1, r3, r5, r6)
        Le:
            return
    }

    private void onProcessedTunneledEndOfStream() {
            r0 = this;
            r0.setPendingOutputEndOfStream()
            return
    }

    @androidx.annotation.RequiresApi(17)
    private void releasePlaceholderSurface() {
            r3 = this;
            android.view.Surface r0 = r3.surface
            com.google.android.exoplayer2.video.PlaceholderSurface r1 = r3.placeholderSurface
            r2 = 0
            if (r0 != r1) goto L9
            r3.surface = r2
        L9:
            r1.release()
            r3.placeholderSurface = r2
            return
    }

    @androidx.annotation.RequiresApi(29)
    private static void setHdr10PlusInfoV29(com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r2, byte[] r3) {
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "hdr10-plus-info"
            r0.putByteArray(r1, r3)
            r2.setParameters(r0)
            return
    }

    private void setJoiningDeadlineMs() {
            r5 = this;
            long r0 = r5.allowedJoiningTimeMs
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L10
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r5.allowedJoiningTimeMs
            long r0 = r0 + r2
            goto L15
        L10:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L15:
            r5.joiningDeadlineMs = r0
            return
    }

    private void setOutput(@androidx.annotation.Nullable java.lang.Object r5) throws com.google.android.exoplayer2.ExoPlaybackException {
            r4 = this;
            boolean r0 = r5 instanceof android.view.Surface
            if (r0 == 0) goto L7
            android.view.Surface r5 = (android.view.Surface) r5
            goto L8
        L7:
            r5 = 0
        L8:
            if (r5 != 0) goto L26
            com.google.android.exoplayer2.video.PlaceholderSurface r0 = r4.placeholderSurface
            if (r0 == 0) goto L10
            r5 = r0
            goto L26
        L10:
            com.google.android.exoplayer2.mediacodec.MediaCodecInfo r0 = r4.getCodecInfo()
            if (r0 == 0) goto L26
            boolean r1 = r4.shouldUsePlaceholderSurface(r0)
            if (r1 == 0) goto L26
            android.content.Context r5 = r4.context
            boolean r0 = r0.secure
            com.google.android.exoplayer2.video.PlaceholderSurface r5 = com.google.android.exoplayer2.video.PlaceholderSurface.newInstanceV17(r5, r0)
            r4.placeholderSurface = r5
        L26:
            android.view.Surface r0 = r4.surface
            if (r0 == r5) goto L6e
            r4.surface = r5
            com.google.android.exoplayer2.video.VideoFrameReleaseHelper r0 = r4.frameReleaseHelper
            r0.onSurfaceChanged(r5)
            r0 = 0
            r4.haveReportedFirstFrameRenderedForCurrentSurface = r0
            int r0 = r4.getState()
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r1 = r4.getCodec()
            if (r1 == 0) goto L54
            int r2 = com.google.android.exoplayer2.util.Util.SDK_INT
            r3 = 23
            if (r2 < r3) goto L4e
            if (r5 == 0) goto L4e
            boolean r2 = r4.codecNeedsSetOutputSurfaceWorkaround
            if (r2 != 0) goto L4e
            r1.setOutputSurface(r5)
            goto L54
        L4e:
            r4.releaseCodec()
            r4.maybeInitCodecOrBypass()
        L54:
            if (r5 == 0) goto L67
            com.google.android.exoplayer2.video.PlaceholderSurface r1 = r4.placeholderSurface
            if (r5 == r1) goto L67
            r4.maybeRenotifyVideoSizeChanged()
            r4.clearRenderedFirstFrame()
            r5 = 2
            if (r0 != r5) goto L7a
            r4.setJoiningDeadlineMs()
            goto L7a
        L67:
            r4.clearReportedVideoSize()
            r4.clearRenderedFirstFrame()
            goto L7a
        L6e:
            if (r5 == 0) goto L7a
            com.google.android.exoplayer2.video.PlaceholderSurface r0 = r4.placeholderSurface
            if (r5 == r0) goto L7a
            r4.maybeRenotifyVideoSizeChanged()
            r4.maybeRenotifyRenderedFirstFrame()
        L7a:
            return
    }

    private boolean shouldUsePlaceholderSurface(com.google.android.exoplayer2.mediacodec.MediaCodecInfo r3) {
            r2 = this;
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 23
            if (r0 < r1) goto L20
            boolean r0 = r2.tunneling
            if (r0 != 0) goto L20
            java.lang.String r0 = r3.name
            boolean r0 = r2.codecNeedsSetOutputSurfaceWorkaround(r0)
            if (r0 != 0) goto L20
            boolean r3 = r3.secure
            if (r3 == 0) goto L1e
            android.content.Context r3 = r2.context
            boolean r3 = com.google.android.exoplayer2.video.PlaceholderSurface.isSecureSupported(r3)
            if (r3 == 0) goto L20
        L1e:
            r3 = 1
            goto L21
        L20:
            r3 = 0
        L21:
            return r3
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final com.google.android.exoplayer2.decoder.DecoderReuseEvaluation canReuseCodec(com.google.android.exoplayer2.mediacodec.MediaCodecInfo r9, com.google.android.exoplayer2.Format r10, com.google.android.exoplayer2.Format r11) {
            r8 = this;
            com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r0 = r9.canReuseCodec(r10, r11)
            int r1 = r0.discardReasons
            int r2 = r11.width
            com.google.android.exoplayer2.video.MediaCodecVideoRenderer$CodecMaxValues r3 = r8.codecMaxValues
            int r4 = r3.width
            if (r2 > r4) goto L14
            int r2 = r11.height
            int r3 = r3.height
            if (r2 <= r3) goto L16
        L14:
            r1 = r1 | 256(0x100, float:3.59E-43)
        L16:
            int r2 = getMaxInputSize(r9, r11)
            com.google.android.exoplayer2.video.MediaCodecVideoRenderer$CodecMaxValues r3 = r8.codecMaxValues
            int r3 = r3.inputSize
            if (r2 <= r3) goto L22
            r1 = r1 | 64
        L22:
            r7 = r1
            com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r1 = new com.google.android.exoplayer2.decoder.DecoderReuseEvaluation
            java.lang.String r3 = r9.name
            if (r7 == 0) goto L2c
            r9 = 0
            r6 = 0
            goto L2f
        L2c:
            int r9 = r0.result
            r6 = r9
        L2f:
            r2 = r1
            r4 = r10
            r5 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            return r1
    }

    public final boolean codecNeedsSetOutputSurfaceWorkaround(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "OMX.google"
            boolean r2 = r2.startsWith(r0)
            if (r2 == 0) goto La
            r2 = 0
            return r2
        La:
            java.lang.Class<com.google.android.exoplayer2.video.MediaCodecVideoRenderer> r2 = com.google.android.exoplayer2.video.MediaCodecVideoRenderer.class
            monitor-enter(r2)
            boolean r0 = com.google.android.exoplayer2.video.MediaCodecVideoRenderer.evaluatedDeviceNeedsSetOutputSurfaceWorkaround     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L1a
            boolean r0 = evaluateDeviceNeedsSetOutputSurfaceWorkaround()     // Catch: java.lang.Throwable -> L1e
            com.google.android.exoplayer2.video.MediaCodecVideoRenderer.deviceNeedsSetOutputSurfaceWorkaround = r0     // Catch: java.lang.Throwable -> L1e
            r0 = 1
            com.google.android.exoplayer2.video.MediaCodecVideoRenderer.evaluatedDeviceNeedsSetOutputSurfaceWorkaround = r0     // Catch: java.lang.Throwable -> L1e
        L1a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1e
            boolean r2 = com.google.android.exoplayer2.video.MediaCodecVideoRenderer.deviceNeedsSetOutputSurfaceWorkaround
            return r2
        L1e:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1e
            throw r0
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException createDecoderException(java.lang.Throwable r3, @androidx.annotation.Nullable com.google.android.exoplayer2.mediacodec.MediaCodecInfo r4) {
            r2 = this;
            com.google.android.exoplayer2.video.MediaCodecVideoDecoderException r0 = new com.google.android.exoplayer2.video.MediaCodecVideoDecoderException
            android.view.Surface r1 = r2.surface
            r0.<init>(r3, r4, r1)
            return r0
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final boolean getCodecNeedsEosPropagation() {
            r2 = this;
            boolean r0 = r2.tunneling
            if (r0 == 0) goto Lc
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 23
            if (r0 >= r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final float getCodecOperatingRateV23(float r7, com.google.android.exoplayer2.Format[] r8) {
            r6 = this;
            int r0 = r8.length
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = 0
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
        L6:
            if (r2 >= r0) goto L17
            r4 = r8[r2]
            float r4 = r4.frameRate
            int r5 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r5 == 0) goto L14
            float r3 = java.lang.Math.max(r3, r4)
        L14:
            int r2 = r2 + 1
            goto L6
        L17:
            int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r8 != 0) goto L1c
            goto L1e
        L1c:
            float r1 = r3 * r7
        L1e:
            return r1
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final java.util.List<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> getDecoderInfos(com.google.android.exoplayer2.mediacodec.MediaCodecSelector r3, com.google.android.exoplayer2.Format r4, boolean r5) throws com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException {
            r2 = this;
            android.content.Context r0 = r2.context
            boolean r1 = r2.tunneling
            java.util.List r3 = getDecoderInfos(r0, r3, r4, r5, r1)
            java.util.List r3 = com.google.android.exoplayer2.mediacodec.MediaCodecUtil.getDecoderInfosSortedByFormatSupport(r3, r4)
            return r3
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @android.annotation.TargetApi(17)
    public final com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Configuration getMediaCodecConfiguration(com.google.android.exoplayer2.mediacodec.MediaCodecInfo r17, com.google.android.exoplayer2.Format r18, @androidx.annotation.Nullable android.media.MediaCrypto r19, float r20) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r20
            com.google.android.exoplayer2.video.PlaceholderSurface r4 = r0.placeholderSurface
            if (r4 == 0) goto L15
            boolean r4 = r4.secure
            boolean r5 = r1.secure
            if (r4 == r5) goto L15
            r16.releasePlaceholderSurface()
        L15:
            java.lang.String r4 = r1.codecMimeType
            com.google.android.exoplayer2.Format[] r5 = r16.getStreamFormats()
            int r6 = r2.width
            int r7 = r2.height
            int r8 = getMaxInputSize(r17, r18)
            int r9 = r5.length
            r10 = -1
            r11 = 1
            if (r9 != r11) goto L41
            if (r8 == r10) goto L3a
            int r5 = getCodecMaxInputSize(r17, r18)
            if (r5 == r10) goto L3a
            float r8 = (float) r8
            r9 = 1069547520(0x3fc00000, float:1.5)
            float r8 = r8 * r9
            int r8 = (int) r8
            int r8 = java.lang.Math.min(r8, r5)
        L3a:
            com.google.android.exoplayer2.video.MediaCodecVideoRenderer$CodecMaxValues r5 = new com.google.android.exoplayer2.video.MediaCodecVideoRenderer$CodecMaxValues
            r5.<init>(r6, r7, r8)
            goto Lf3
        L41:
            int r9 = r5.length
            r13 = 0
            r14 = 0
        L44:
            if (r13 >= r9) goto L89
            r15 = r5[r13]
            com.google.android.exoplayer2.video.ColorInfo r11 = r2.colorInfo
            if (r11 == 0) goto L5e
            com.google.android.exoplayer2.video.ColorInfo r11 = r15.colorInfo
            if (r11 != 0) goto L5e
            com.google.android.exoplayer2.Format$Builder r11 = r15.buildUpon()
            com.google.android.exoplayer2.video.ColorInfo r15 = r2.colorInfo
            com.google.android.exoplayer2.Format$Builder r11 = r11.setColorInfo(r15)
            com.google.android.exoplayer2.Format r15 = r11.build()
        L5e:
            com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r11 = r1.canReuseCodec(r2, r15)
            int r11 = r11.result
            if (r11 == 0) goto L85
            int r11 = r15.width
            if (r11 == r10) goto L71
            int r12 = r15.height
            if (r12 != r10) goto L6f
            goto L71
        L6f:
            r12 = 0
            goto L72
        L71:
            r12 = 1
        L72:
            r14 = r14 | r12
            int r6 = java.lang.Math.max(r6, r11)
            int r11 = r15.height
            int r7 = java.lang.Math.max(r7, r11)
            int r11 = getMaxInputSize(r1, r15)
            int r8 = java.lang.Math.max(r8, r11)
        L85:
            int r13 = r13 + 1
            r11 = 1
            goto L44
        L89:
            if (r14 == 0) goto Lee
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r9 = "Resolutions unknown. Codec max resolution: "
            r5.append(r9)
            r5.append(r6)
            java.lang.String r9 = "x"
            r5.append(r9)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.String r10 = "MediaCodecVideoRenderer"
            com.google.android.exoplayer2.util.Log.w(r10, r5)
            android.graphics.Point r5 = getCodecMaxSize(r17, r18)
            if (r5 == 0) goto Lee
            int r11 = r5.x
            int r6 = java.lang.Math.max(r6, r11)
            int r5 = r5.y
            int r7 = java.lang.Math.max(r7, r5)
            com.google.android.exoplayer2.Format$Builder r5 = r18.buildUpon()
            com.google.android.exoplayer2.Format$Builder r5 = r5.setWidth(r6)
            com.google.android.exoplayer2.Format$Builder r5 = r5.setHeight(r7)
            com.google.android.exoplayer2.Format r5 = r5.build()
            int r5 = getCodecMaxInputSize(r1, r5)
            int r8 = java.lang.Math.max(r8, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r11 = "Codec max resolution adjusted to: "
            r5.append(r11)
            r5.append(r6)
            r5.append(r9)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            com.google.android.exoplayer2.util.Log.w(r10, r5)
        Lee:
            com.google.android.exoplayer2.video.MediaCodecVideoRenderer$CodecMaxValues r5 = new com.google.android.exoplayer2.video.MediaCodecVideoRenderer$CodecMaxValues
            r5.<init>(r6, r7, r8)
        Lf3:
            r0.codecMaxValues = r5
            boolean r6 = r0.deviceNeedsNoPostProcessWorkaround
            boolean r7 = r0.tunneling
            if (r7 == 0) goto Lfe
            int r7 = r0.tunnelingAudioSessionId
            goto Lff
        Lfe:
            r7 = 0
        Lff:
            android.media.MediaFormat r8 = new android.media.MediaFormat
            r8.<init>()
            java.lang.String r9 = "mime"
            r8.setString(r9, r4)
            int r4 = r2.width
            java.lang.String r9 = "width"
            r8.setInteger(r9, r4)
            int r4 = r2.height
            java.lang.String r9 = "height"
            r8.setInteger(r9, r4)
            java.util.List<byte[]> r4 = r2.initializationData
            com.google.android.exoplayer2.util.MediaFormatUtil.setCsdBuffers(r8, r4)
            float r4 = r2.frameRate
            java.lang.String r9 = "frame-rate"
            com.google.android.exoplayer2.util.MediaFormatUtil.maybeSetFloat(r8, r9, r4)
            int r4 = r2.rotationDegrees
            java.lang.String r9 = "rotation-degrees"
            com.google.android.exoplayer2.util.MediaFormatUtil.maybeSetInteger(r8, r9, r4)
            com.google.android.exoplayer2.video.ColorInfo r4 = r2.colorInfo
            com.google.android.exoplayer2.util.MediaFormatUtil.maybeSetColorInfo(r8, r4)
            java.lang.String r4 = r2.sampleMimeType
            java.lang.String r9 = "video/dolby-vision"
            boolean r4 = r9.equals(r4)
            if (r4 == 0) goto L150
            android.util.Pair r4 = com.google.android.exoplayer2.mediacodec.MediaCodecUtil.getCodecProfileAndLevel(r18)
            if (r4 == 0) goto L150
            java.lang.Object r4 = r4.first
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.String r9 = "profile"
            com.google.android.exoplayer2.util.MediaFormatUtil.maybeSetInteger(r8, r9, r4)
        L150:
            int r4 = r5.width
            java.lang.String r9 = "max-width"
            r8.setInteger(r9, r4)
            int r4 = r5.height
            java.lang.String r9 = "max-height"
            r8.setInteger(r9, r4)
            int r4 = r5.inputSize
            java.lang.String r5 = "max-input-size"
            com.google.android.exoplayer2.util.MediaFormatUtil.maybeSetInteger(r8, r5, r4)
            int r4 = com.google.android.exoplayer2.util.Util.SDK_INT
            r5 = 23
            if (r4 < r5) goto L17d
            java.lang.String r4 = "priority"
            r5 = 0
            r8.setInteger(r4, r5)
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 == 0) goto L17d
            java.lang.String r4 = "operating-rate"
            r8.setFloat(r4, r3)
        L17d:
            if (r6 == 0) goto L18b
            java.lang.String r3 = "no-post-process"
            r4 = 1
            r8.setInteger(r3, r4)
            java.lang.String r3 = "auto-frc"
            r4 = 0
            r8.setInteger(r3, r4)
        L18b:
            if (r7 == 0) goto L190
            configureTunnelingV21(r8, r7)
        L190:
            android.view.Surface r3 = r0.surface
            if (r3 != 0) goto L1b3
            boolean r3 = r16.shouldUsePlaceholderSurface(r17)
            if (r3 == 0) goto L1ad
            com.google.android.exoplayer2.video.PlaceholderSurface r3 = r0.placeholderSurface
            if (r3 != 0) goto L1a8
            android.content.Context r3 = r0.context
            boolean r4 = r1.secure
            com.google.android.exoplayer2.video.PlaceholderSurface r3 = com.google.android.exoplayer2.video.PlaceholderSurface.newInstanceV17(r3, r4)
            r0.placeholderSurface = r3
        L1a8:
            com.google.android.exoplayer2.video.PlaceholderSurface r3 = r0.placeholderSurface
            r0.surface = r3
            goto L1b3
        L1ad:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L1b3:
            android.view.Surface r3 = r0.surface
            r4 = r19
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter$Configuration r1 = com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Configuration.createForVideoDecoding(r1, r8, r2, r3, r4)
            return r1
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = "MediaCodecVideoRenderer"
            return r0
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @android.annotation.TargetApi(29)
    public final void handleInputBufferSupplementalData(com.google.android.exoplayer2.decoder.DecoderInputBuffer r8) throws com.google.android.exoplayer2.ExoPlaybackException {
            r7 = this;
            boolean r0 = r7.codecHandlesHdr10PlusOutOfBandMetadata
            if (r0 != 0) goto L5
            return
        L5:
            java.nio.ByteBuffer r8 = r8.supplementalData
            java.lang.Object r8 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r8)
            java.nio.ByteBuffer r8 = (java.nio.ByteBuffer) r8
            int r0 = r8.remaining()
            r1 = 7
            if (r0 < r1) goto L51
            byte r0 = r8.get()
            short r1 = r8.getShort()
            short r2 = r8.getShort()
            byte r3 = r8.get()
            byte r4 = r8.get()
            r5 = 0
            r8.position(r5)
            r6 = -75
            if (r0 != r6) goto L51
            r0 = 60
            if (r1 != r0) goto L51
            r0 = 1
            if (r2 != r0) goto L51
            r1 = 4
            if (r3 != r1) goto L51
            if (r4 == 0) goto L3e
            if (r4 != r0) goto L51
        L3e:
            int r0 = r8.remaining()
            byte[] r0 = new byte[r0]
            r8.get(r0)
            r8.position(r5)
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r8 = r7.getCodec()
            setHdr10PlusInfoV29(r8, r0)
        L51:
            return
    }

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.PlayerMessage.Target
    public void handleMessage(int r2, @androidx.annotation.Nullable java.lang.Object r3) throws com.google.android.exoplayer2.ExoPlaybackException {
            r1 = this;
            r0 = 1
            if (r2 == r0) goto L4d
            r0 = 7
            if (r2 == r0) goto L48
            r0 = 10
            if (r2 == r0) goto L34
            r0 = 4
            if (r2 == r0) goto L20
            r0 = 5
            if (r2 == r0) goto L14
            super.handleMessage(r2, r3)
            goto L50
        L14:
            com.google.android.exoplayer2.video.VideoFrameReleaseHelper r2 = r1.frameReleaseHelper
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setChangeFrameRateStrategy(r3)
            goto L50
        L20:
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.scalingMode = r2
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r2 = r1.getCodec()
            if (r2 == 0) goto L50
            int r3 = r1.scalingMode
            r2.setVideoScalingMode(r3)
            goto L50
        L34:
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            int r3 = r1.tunnelingAudioSessionId
            if (r3 == r2) goto L50
            r1.tunnelingAudioSessionId = r2
            boolean r2 = r1.tunneling
            if (r2 == 0) goto L50
            r1.releaseCodec()
            goto L50
        L48:
            com.google.android.exoplayer2.video.VideoFrameMetadataListener r3 = (com.google.android.exoplayer2.video.VideoFrameMetadataListener) r3
            r1.frameMetadataListener = r3
            goto L50
        L4d:
            r1.setOutput(r3)
        L50:
            return
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.Renderer
    public boolean isReady() {
            r9 = this;
            boolean r0 = super.isReady()
            r1 = 1
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L25
            boolean r0 = r9.renderedFirstFrameAfterReset
            if (r0 != 0) goto L22
            com.google.android.exoplayer2.video.PlaceholderSurface r0 = r9.placeholderSurface
            if (r0 == 0) goto L18
            android.view.Surface r4 = r9.surface
            if (r4 == r0) goto L22
        L18:
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r0 = r9.getCodec()
            if (r0 == 0) goto L22
            boolean r0 = r9.tunneling
            if (r0 == 0) goto L25
        L22:
            r9.joiningDeadlineMs = r2
            return r1
        L25:
            long r4 = r9.joiningDeadlineMs
            r0 = 0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L2d
            return r0
        L2d:
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r6 = r9.joiningDeadlineMs
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L38
            return r1
        L38:
            r9.joiningDeadlineMs = r2
            return r0
    }

    public final void maybeNotifyRenderedFirstFrame() {
            r3 = this;
            r0 = 1
            r3.renderedFirstFrameAfterEnable = r0
            boolean r1 = r3.renderedFirstFrameAfterReset
            if (r1 != 0) goto L12
            r3.renderedFirstFrameAfterReset = r0
            com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher r1 = r3.eventDispatcher
            android.view.Surface r2 = r3.surface
            r1.renderedFirstFrame(r2)
            r3.haveReportedFirstFrameRenderedForCurrentSurface = r0
        L12:
            return
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void onCodecError(java.lang.Exception r3) {
            r2 = this;
            java.lang.String r0 = "MediaCodecVideoRenderer"
            java.lang.String r1 = "Video codec error"
            com.google.android.exoplayer2.util.Log.e(r0, r1, r3)
            com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher r0 = r2.eventDispatcher
            r0.videoCodecError(r3)
            return
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void onCodecInitialized(java.lang.String r7, long r8, long r10) {
            r6 = this;
            com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher r0 = r6.eventDispatcher
            r1 = r7
            r2 = r8
            r4 = r10
            r0.decoderInitialized(r1, r2, r4)
            boolean r7 = r6.codecNeedsSetOutputSurfaceWorkaround(r7)
            r6.codecNeedsSetOutputSurfaceWorkaround = r7
            com.google.android.exoplayer2.mediacodec.MediaCodecInfo r7 = r6.getCodecInfo()
            java.lang.Object r7 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r7)
            com.google.android.exoplayer2.mediacodec.MediaCodecInfo r7 = (com.google.android.exoplayer2.mediacodec.MediaCodecInfo) r7
            boolean r7 = r7.isHdr10PlusOutOfBandMetadataSupported()
            r6.codecHandlesHdr10PlusOutOfBandMetadata = r7
            int r7 = com.google.android.exoplayer2.util.Util.SDK_INT
            r8 = 23
            if (r7 < r8) goto L39
            boolean r7 = r6.tunneling
            if (r7 == 0) goto L39
            com.google.android.exoplayer2.video.MediaCodecVideoRenderer$OnFrameRenderedListenerV23 r7 = new com.google.android.exoplayer2.video.MediaCodecVideoRenderer$OnFrameRenderedListenerV23
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r8 = r6.getCodec()
            java.lang.Object r8 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r8)
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r8 = (com.google.android.exoplayer2.mediacodec.MediaCodecAdapter) r8
            r7.<init>(r6, r8)
            r6.tunnelingOnFrameRenderedListener = r7
        L39:
            return
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void onCodecReleased(java.lang.String r2) {
            r1 = this;
            com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher r0 = r1.eventDispatcher
            r0.decoderReleased(r2)
            return
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    public final void onDisabled() {
            r3 = this;
            r3.clearReportedVideoSize()
            r3.clearRenderedFirstFrame()
            r0 = 0
            r3.haveReportedFirstFrameRenderedForCurrentSurface = r0
            r0 = 0
            r3.tunnelingOnFrameRenderedListener = r0
            super.onDisabled()     // Catch: java.lang.Throwable -> L17
            com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher r0 = r3.eventDispatcher
            com.google.android.exoplayer2.decoder.DecoderCounters r1 = r3.decoderCounters
            r0.disabled(r1)
            return
        L17:
            r0 = move-exception
            com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher r1 = r3.eventDispatcher
            com.google.android.exoplayer2.decoder.DecoderCounters r2 = r3.decoderCounters
            r1.disabled(r2)
            throw r0
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    public final void onEnabled(boolean r3, boolean r4) throws com.google.android.exoplayer2.ExoPlaybackException {
            r2 = this;
            super.onEnabled(r3, r4)
            com.google.android.exoplayer2.RendererConfiguration r3 = r2.getConfiguration()
            boolean r3 = r3.tunneling
            r0 = 0
            if (r3 == 0) goto L13
            int r1 = r2.tunnelingAudioSessionId
            if (r1 == 0) goto L11
            goto L13
        L11:
            r1 = 0
            goto L14
        L13:
            r1 = 1
        L14:
            com.google.android.exoplayer2.util.Assertions.checkState(r1)
            boolean r1 = r2.tunneling
            if (r1 == r3) goto L20
            r2.tunneling = r3
            r2.releaseCodec()
        L20:
            com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher r3 = r2.eventDispatcher
            com.google.android.exoplayer2.decoder.DecoderCounters r1 = r2.decoderCounters
            r3.enabled(r1)
            r2.mayRenderFirstFrameAfterEnableIfNotStarted = r4
            r2.renderedFirstFrameAfterEnable = r0
            return
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @androidx.annotation.Nullable
    public final com.google.android.exoplayer2.decoder.DecoderReuseEvaluation onInputFormatChanged(com.google.android.exoplayer2.FormatHolder r3) throws com.google.android.exoplayer2.ExoPlaybackException {
            r2 = this;
            com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r0 = super.onInputFormatChanged(r3)
            com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher r1 = r2.eventDispatcher
            com.google.android.exoplayer2.Format r3 = r3.format
            r1.inputFormatChanged(r3, r0)
            return r0
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void onOutputFormatChanged(com.google.android.exoplayer2.Format r7, @androidx.annotation.Nullable android.media.MediaFormat r8) {
            r6 = this;
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r0 = r6.getCodec()
            if (r0 == 0) goto Lb
            int r1 = r6.scalingMode
            r0.setVideoScalingMode(r1)
        Lb:
            boolean r0 = r6.tunneling
            if (r0 == 0) goto L18
            int r8 = r7.width
            r6.currentWidth = r8
            int r8 = r7.height
            r6.currentHeight = r8
            goto L6a
        L18:
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r8)
            java.lang.String r0 = "crop-right"
            boolean r1 = r8.containsKey(r0)
            java.lang.String r2 = "crop-top"
            java.lang.String r3 = "crop-bottom"
            java.lang.String r4 = "crop-left"
            r5 = 1
            if (r1 == 0) goto L3e
            boolean r1 = r8.containsKey(r4)
            if (r1 == 0) goto L3e
            boolean r1 = r8.containsKey(r3)
            if (r1 == 0) goto L3e
            boolean r1 = r8.containsKey(r2)
            if (r1 == 0) goto L3e
            r1 = 1
            goto L3f
        L3e:
            r1 = 0
        L3f:
            if (r1 == 0) goto L4c
            int r0 = r8.getInteger(r0)
            int r4 = r8.getInteger(r4)
            int r0 = r0 - r4
            int r0 = r0 + r5
            goto L53
        L4c:
            java.lang.String r0 = "width"
            int r0 = r8.getInteger(r0)
        L53:
            r6.currentWidth = r0
            if (r1 == 0) goto L62
            int r0 = r8.getInteger(r3)
            int r8 = r8.getInteger(r2)
            int r0 = r0 - r8
            int r0 = r0 + r5
            goto L68
        L62:
            java.lang.String r0 = "height"
            int r0 = r8.getInteger(r0)
        L68:
            r6.currentHeight = r0
        L6a:
            float r8 = r7.pixelWidthHeightRatio
            r6.currentPixelWidthHeightRatio = r8
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 21
            if (r0 < r1) goto L8c
            int r0 = r7.rotationDegrees
            r1 = 90
            if (r0 == r1) goto L7e
            r1 = 270(0x10e, float:3.78E-43)
            if (r0 != r1) goto L90
        L7e:
            int r0 = r6.currentWidth
            int r1 = r6.currentHeight
            r6.currentWidth = r1
            r6.currentHeight = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 / r8
            r6.currentPixelWidthHeightRatio = r0
            goto L90
        L8c:
            int r8 = r7.rotationDegrees
            r6.currentUnappliedRotationDegrees = r8
        L90:
            com.google.android.exoplayer2.video.VideoFrameReleaseHelper r8 = r6.frameReleaseHelper
            float r7 = r7.frameRate
            r8.onFormatChanged(r7)
            return
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    public final void onPositionReset(long r2, boolean r4) throws com.google.android.exoplayer2.ExoPlaybackException {
            r1 = this;
            super.onPositionReset(r2, r4)
            r1.clearRenderedFirstFrame()
            com.google.android.exoplayer2.video.VideoFrameReleaseHelper r2 = r1.frameReleaseHelper
            r2.onPositionReset()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.lastBufferPresentationTimeUs = r2
            r1.initialPositionUs = r2
            r0 = 0
            r1.consecutiveDroppedFrameCount = r0
            if (r4 == 0) goto L1d
            r1.setJoiningDeadlineMs()
            goto L1f
        L1d:
            r1.joiningDeadlineMs = r2
        L1f:
            return
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @androidx.annotation.CallSuper
    public final void onProcessedOutputBuffer(long r1) {
            r0 = this;
            super.onProcessedOutputBuffer(r1)
            boolean r1 = r0.tunneling
            if (r1 != 0) goto Ld
            int r1 = r0.buffersInCodecCount
            int r1 = r1 + (-1)
            r0.buffersInCodecCount = r1
        Ld:
            return
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void onProcessedStreamChange() {
            r0 = this;
            r0.clearRenderedFirstFrame()
            return
    }

    public final void onProcessedTunneledBuffer(long r3) throws com.google.android.exoplayer2.ExoPlaybackException {
            r2 = this;
            r2.updateOutputFormatForTime(r3)
            r2.maybeNotifyVideoSizeChanged()
            com.google.android.exoplayer2.decoder.DecoderCounters r0 = r2.decoderCounters
            int r1 = r0.renderedOutputBufferCount
            int r1 = r1 + 1
            r0.renderedOutputBufferCount = r1
            r2.maybeNotifyRenderedFirstFrame()
            r2.onProcessedOutputBuffer(r3)
            return
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @androidx.annotation.CallSuper
    public final void onQueueInputBuffer(com.google.android.exoplayer2.decoder.DecoderInputBuffer r4) throws com.google.android.exoplayer2.ExoPlaybackException {
            r3 = this;
            boolean r0 = r3.tunneling
            if (r0 != 0) goto La
            int r1 = r3.buffersInCodecCount
            int r1 = r1 + 1
            r3.buffersInCodecCount = r1
        La:
            int r1 = com.google.android.exoplayer2.util.Util.SDK_INT
            r2 = 23
            if (r1 >= r2) goto L17
            if (r0 == 0) goto L17
            long r0 = r4.timeUs
            r3.onProcessedTunneledBuffer(r0)
        L17:
            return
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    @android.annotation.TargetApi(17)
    public final void onReset() {
            r2 = this;
            super.onReset()     // Catch: java.lang.Throwable -> Lb
            com.google.android.exoplayer2.video.PlaceholderSurface r0 = r2.placeholderSurface
            if (r0 == 0) goto La
            r2.releasePlaceholderSurface()
        La:
            return
        Lb:
            r0 = move-exception
            com.google.android.exoplayer2.video.PlaceholderSurface r1 = r2.placeholderSurface
            if (r1 == 0) goto L13
            r2.releasePlaceholderSurface()
        L13:
            throw r0
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    public final void onStarted() {
            r5 = this;
            r0 = 0
            r5.droppedFrames = r0
            long r1 = android.os.SystemClock.elapsedRealtime()
            r5.droppedFrameAccumulationStartTimeMs = r1
            long r1 = android.os.SystemClock.elapsedRealtime()
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r3
            r5.lastRenderRealtimeUs = r1
            r1 = 0
            r5.totalVideoFrameProcessingOffsetUs = r1
            r5.videoFrameProcessingOffsetCount = r0
            com.google.android.exoplayer2.video.VideoFrameReleaseHelper r0 = r5.frameReleaseHelper
            r0.onStarted()
            return
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    public final void onStopped() {
            r2 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.joiningDeadlineMs = r0
            r2.maybeNotifyDroppedFrames()
            r2.maybeNotifyVideoFrameProcessingOffset()
            com.google.android.exoplayer2.video.VideoFrameReleaseHelper r0 = r2.frameReleaseHelper
            r0.onStopped()
            return
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final boolean processOutputBuffer(long r24, long r26, @androidx.annotation.Nullable com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r28, @androidx.annotation.Nullable java.nio.ByteBuffer r29, int r30, int r31, int r32, long r33, boolean r35, boolean r36, com.google.android.exoplayer2.Format r37) throws com.google.android.exoplayer2.ExoPlaybackException {
            r23 = this;
            r0 = r23
            r1 = r24
            r3 = r28
            r4 = r30
            r5 = r33
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r28)
            long r7 = r0.initialPositionUs
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L1a
            r0.initialPositionUs = r1
        L1a:
            long r7 = r0.lastBufferPresentationTimeUs
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 == 0) goto L27
            com.google.android.exoplayer2.video.VideoFrameReleaseHelper r7 = r0.frameReleaseHelper
            r7.onNextFrame(r5)
            r0.lastBufferPresentationTimeUs = r5
        L27:
            long r7 = r23.getOutputStreamOffsetUs()
            long r11 = r5 - r7
            r13 = 1
            if (r35 == 0) goto L36
            if (r36 != 0) goto L36
            r0.skipOutputBuffer(r3, r4)
            return r13
        L36:
            float r14 = r23.getPlaybackSpeed()
            double r14 = (double) r14
            int r13 = r23.getState()
            r9 = 2
            r10 = 0
            if (r13 != r9) goto L45
            r9 = 1
            goto L46
        L45:
            r9 = 0
        L46:
            long r16 = android.os.SystemClock.elapsedRealtime()
            r18 = 1000(0x3e8, double:4.94E-321)
            long r16 = r16 * r18
            long r5 = r5 - r1
            double r5 = (double) r5
            double r5 = r5 / r14
            long r5 = (long) r5
            if (r9 == 0) goto L57
            long r13 = r16 - r26
            long r5 = r5 - r13
        L57:
            android.view.Surface r13 = r0.surface
            com.google.android.exoplayer2.video.PlaceholderSurface r14 = r0.placeholderSurface
            if (r13 != r14) goto L6d
            boolean r1 = isBufferLate(r5)
            if (r1 == 0) goto L6c
            r0.skipOutputBuffer(r3, r4)
            r0.updateVideoFrameProcessingOffsetCounters(r5)
        L69:
            r1 = 1
            goto L1ba
        L6c:
            return r10
        L6d:
            long r13 = r0.lastRenderRealtimeUs
            long r16 = r16 - r13
            boolean r13 = r0.renderedFirstFrameAfterEnable
            if (r13 != 0) goto L7c
            if (r9 != 0) goto L80
            boolean r13 = r0.mayRenderFirstFrameAfterEnableIfNotStarted
            if (r13 == 0) goto L82
            goto L80
        L7c:
            boolean r13 = r0.renderedFirstFrameAfterReset
            if (r13 != 0) goto L82
        L80:
            r13 = 1
            goto L83
        L82:
            r13 = 0
        L83:
            long r14 = r0.joiningDeadlineMs
            r20 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r22 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            if (r22 != 0) goto Laa
            int r14 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r14 < 0) goto Laa
            if (r13 != 0) goto La8
            if (r9 == 0) goto Laa
            boolean r7 = isBufferLate(r5)
            if (r7 == 0) goto La5
            r7 = 100000(0x186a0, double:4.94066E-319)
            int r13 = (r16 > r7 ? 1 : (r16 == r7 ? 0 : -1))
            if (r13 <= 0) goto La5
            r7 = 1
            goto La6
        La5:
            r7 = 0
        La6:
            if (r7 == 0) goto Laa
        La8:
            r7 = 1
            goto Lab
        Laa:
            r7 = 0
        Lab:
            r8 = 21
            if (r7 == 0) goto Lcd
            long r1 = java.lang.System.nanoTime()
            r31 = r23
            r32 = r11
            r34 = r1
            r36 = r37
            r31.notifyFrameMetadataListener(r32, r34, r36)
            int r7 = com.google.android.exoplayer2.util.Util.SDK_INT
            if (r7 < r8) goto Lc6
            r0.renderOutputBufferV21(r3, r4, r1)
            goto Lc9
        Lc6:
            r0.renderOutputBuffer(r3, r4)
        Lc9:
            r0.updateVideoFrameProcessingOffsetCounters(r5)
            goto L69
        Lcd:
            if (r9 == 0) goto L1bb
            long r13 = r0.initialPositionUs
            int r7 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r7 != 0) goto Ld7
            goto L1bb
        Ld7:
            long r13 = java.lang.System.nanoTime()
            long r5 = r5 * r18
            long r5 = r5 + r13
            com.google.android.exoplayer2.video.VideoFrameReleaseHelper r7 = r0.frameReleaseHelper
            long r5 = r7.adjustReleaseTime(r5)
            long r13 = r5 - r13
            long r13 = r13 / r18
            long r8 = r0.joiningDeadlineMs
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r7 == 0) goto Lf5
            r7 = 1
            goto Lf6
        Lf5:
            r7 = 0
        Lf6:
            boolean r8 = isBufferVeryLate(r13)
            if (r8 == 0) goto L100
            if (r36 != 0) goto L100
            r8 = 1
            goto L101
        L100:
            r8 = 0
        L101:
            if (r8 == 0) goto L136
            int r1 = r23.skipSource(r24)
            if (r1 != 0) goto L10b
            r1 = 0
            goto L133
        L10b:
            if (r7 == 0) goto L11c
            com.google.android.exoplayer2.decoder.DecoderCounters r2 = r0.decoderCounters
            int r8 = r2.skippedInputBufferCount
            int r8 = r8 + r1
            r2.skippedInputBufferCount = r8
            int r1 = r2.skippedOutputBufferCount
            int r8 = r0.buffersInCodecCount
            int r1 = r1 + r8
            r2.skippedOutputBufferCount = r1
            goto L129
        L11c:
            com.google.android.exoplayer2.decoder.DecoderCounters r2 = r0.decoderCounters
            int r8 = r2.droppedToKeyframeCount
            r9 = 1
            int r8 = r8 + r9
            r2.droppedToKeyframeCount = r8
            int r2 = r0.buffersInCodecCount
            r0.updateDroppedBufferCounters(r1, r2)
        L129:
            boolean r1 = r23.flushOrReleaseCodec()
            if (r1 == 0) goto L132
            r23.maybeInitCodecOrBypass()
        L132:
            r1 = 1
        L133:
            if (r1 == 0) goto L136
            return r10
        L136:
            boolean r1 = isBufferLate(r13)
            if (r1 == 0) goto L140
            if (r36 != 0) goto L140
            r1 = 1
            goto L141
        L140:
            r1 = 0
        L141:
            if (r1 == 0) goto L15d
            if (r7 == 0) goto L14a
            r0.skipOutputBuffer(r3, r4)
            r1 = 1
            goto L159
        L14a:
            java.lang.String r1 = "dropVideoBuffer"
            com.google.android.exoplayer2.util.TraceUtil.beginSection(r1)
            r3.releaseOutputBuffer(r4, r10)
            com.google.android.exoplayer2.util.TraceUtil.endSection()
            r1 = 1
            r0.updateDroppedBufferCounters(r10, r1)
        L159:
            r0.updateVideoFrameProcessingOffsetCounters(r13)
            return r1
        L15d:
            int r1 = com.google.android.exoplayer2.util.Util.SDK_INT
            r2 = 21
            if (r1 < r2) goto L189
            r1 = 50000(0xc350, double:2.47033E-319)
            int r7 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r7 >= 0) goto L1bb
            long r1 = r0.lastFrameReleaseTimeNs
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 != 0) goto L174
            r0.skipOutputBuffer(r3, r4)
            goto L182
        L174:
            r31 = r23
            r32 = r11
            r34 = r5
            r36 = r37
            r31.notifyFrameMetadataListener(r32, r34, r36)
            r0.renderOutputBufferV21(r3, r4, r5)
        L182:
            r0.updateVideoFrameProcessingOffsetCounters(r13)
            r0.lastFrameReleaseTimeNs = r5
            goto L69
        L189:
            r1 = 30000(0x7530, double:1.4822E-319)
            int r7 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r7 >= 0) goto L1bb
            r1 = 11000(0x2af8, double:5.4347E-320)
            int r7 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r7 <= 0) goto L1a7
            r1 = 10000(0x2710, double:4.9407E-320)
            long r1 = r13 - r1
            long r1 = r1 / r18
            java.lang.Thread.sleep(r1)     // Catch: java.lang.InterruptedException -> L19f
            goto L1a7
        L19f:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            return r10
        L1a7:
            r31 = r23
            r32 = r11
            r34 = r5
            r36 = r37
            r31.notifyFrameMetadataListener(r32, r34, r36)
            r0.renderOutputBuffer(r3, r4)
            r0.updateVideoFrameProcessingOffsetCounters(r13)
            goto L69
        L1ba:
            return r1
        L1bb:
            return r10
    }

    public final void renderOutputBuffer(com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r4, int r5) {
            r3 = this;
            r3.maybeNotifyVideoSizeChanged()
            java.lang.String r0 = "releaseOutputBuffer"
            com.google.android.exoplayer2.util.TraceUtil.beginSection(r0)
            r0 = 1
            r4.releaseOutputBuffer(r5, r0)
            com.google.android.exoplayer2.util.TraceUtil.endSection()
            long r4 = android.os.SystemClock.elapsedRealtime()
            r1 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r1
            r3.lastRenderRealtimeUs = r4
            com.google.android.exoplayer2.decoder.DecoderCounters r4 = r3.decoderCounters
            int r5 = r4.renderedOutputBufferCount
            int r5 = r5 + r0
            r4.renderedOutputBufferCount = r5
            r4 = 0
            r3.consecutiveDroppedFrameCount = r4
            r3.maybeNotifyRenderedFirstFrame()
            return
    }

    @androidx.annotation.RequiresApi(21)
    public final void renderOutputBufferV21(com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r2, int r3, long r4) {
            r1 = this;
            r1.maybeNotifyVideoSizeChanged()
            java.lang.String r0 = "releaseOutputBuffer"
            com.google.android.exoplayer2.util.TraceUtil.beginSection(r0)
            r2.releaseOutputBuffer(r3, r4)
            com.google.android.exoplayer2.util.TraceUtil.endSection()
            long r2 = android.os.SystemClock.elapsedRealtime()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            r1.lastRenderRealtimeUs = r2
            com.google.android.exoplayer2.decoder.DecoderCounters r2 = r1.decoderCounters
            int r3 = r2.renderedOutputBufferCount
            int r3 = r3 + 1
            r2.renderedOutputBufferCount = r3
            r2 = 0
            r1.consecutiveDroppedFrameCount = r2
            r1.maybeNotifyRenderedFirstFrame()
            return
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @androidx.annotation.CallSuper
    public final void resetCodecStateForFlush() {
            r1 = this;
            super.resetCodecStateForFlush()
            r0 = 0
            r1.buffersInCodecCount = r0
            return
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.Renderer
    public void setPlaybackSpeed(float r1, float r2) throws com.google.android.exoplayer2.ExoPlaybackException {
            r0 = this;
            super.setPlaybackSpeed(r1, r2)
            com.google.android.exoplayer2.video.VideoFrameReleaseHelper r2 = r0.frameReleaseHelper
            r2.onPlaybackSpeed(r1)
            return
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final boolean shouldInitCodec(com.google.android.exoplayer2.mediacodec.MediaCodecInfo r2) {
            r1 = this;
            android.view.Surface r0 = r1.surface
            if (r0 != 0) goto Ld
            boolean r2 = r1.shouldUsePlaceholderSurface(r2)
            if (r2 == 0) goto Lb
            goto Ld
        Lb:
            r2 = 0
            goto Le
        Ld:
            r2 = 1
        Le:
            return r2
    }

    public final void skipOutputBuffer(com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r2, int r3) {
            r1 = this;
            java.lang.String r0 = "skipVideoBuffer"
            com.google.android.exoplayer2.util.TraceUtil.beginSection(r0)
            r0 = 0
            r2.releaseOutputBuffer(r3, r0)
            com.google.android.exoplayer2.util.TraceUtil.endSection()
            com.google.android.exoplayer2.decoder.DecoderCounters r2 = r1.decoderCounters
            int r3 = r2.skippedOutputBufferCount
            int r3 = r3 + 1
            r2.skippedOutputBufferCount = r3
            return
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final int supportsFormat(com.google.android.exoplayer2.mediacodec.MediaCodecSelector r11, com.google.android.exoplayer2.Format r12) throws com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException {
            r10 = this;
            java.lang.String r0 = r12.sampleMimeType
            boolean r0 = com.google.android.exoplayer2.util.MimeTypes.isVideo(r0)
            r1 = 0
            if (r0 != 0) goto Le
            int r11 = com.google.android.exoplayer2.RendererCapabilities.CC.create(r1)
            return r11
        Le:
            com.google.android.exoplayer2.drm.DrmInitData r0 = r12.drmInitData
            r2 = 1
            if (r0 == 0) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            android.content.Context r3 = r10.context
            java.util.List r3 = getDecoderInfos(r3, r11, r12, r0, r1)
            if (r0 == 0) goto L2a
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L2a
            android.content.Context r3 = r10.context
            java.util.List r3 = getDecoderInfos(r3, r11, r12, r1, r1)
        L2a:
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L35
            int r11 = com.google.android.exoplayer2.RendererCapabilities.CC.create(r2)
            return r11
        L35:
            int r4 = r12.cryptoType
            r5 = 2
            if (r4 == 0) goto L3f
            if (r4 != r5) goto L3d
            goto L3f
        L3d:
            r4 = 0
            goto L40
        L3f:
            r4 = 1
        L40:
            if (r4 != 0) goto L47
            int r11 = com.google.android.exoplayer2.RendererCapabilities.CC.create(r5)
            return r11
        L47:
            java.lang.Object r4 = r3.get(r1)
            com.google.android.exoplayer2.mediacodec.MediaCodecInfo r4 = (com.google.android.exoplayer2.mediacodec.MediaCodecInfo) r4
            boolean r5 = r4.isFormatSupported(r12)
            if (r5 != 0) goto L6d
            r6 = 1
        L54:
            int r7 = r3.size()
            if (r6 >= r7) goto L6d
            java.lang.Object r7 = r3.get(r6)
            com.google.android.exoplayer2.mediacodec.MediaCodecInfo r7 = (com.google.android.exoplayer2.mediacodec.MediaCodecInfo) r7
            boolean r8 = r7.isFormatSupported(r12)
            if (r8 == 0) goto L6a
            r4 = r7
            r3 = 0
            r5 = 1
            goto L6e
        L6a:
            int r6 = r6 + 1
            goto L54
        L6d:
            r3 = 1
        L6e:
            if (r5 == 0) goto L72
            r6 = 4
            goto L73
        L72:
            r6 = 3
        L73:
            boolean r7 = r4.isSeamlessAdaptationSupported(r12)
            if (r7 == 0) goto L7c
            r7 = 16
            goto L7e
        L7c:
            r7 = 8
        L7e:
            boolean r4 = r4.hardwareAccelerated
            if (r4 == 0) goto L85
            r4 = 64
            goto L86
        L85:
            r4 = 0
        L86:
            if (r3 == 0) goto L8b
            r3 = 128(0x80, float:1.8E-43)
            goto L8c
        L8b:
            r3 = 0
        L8c:
            int r8 = com.google.android.exoplayer2.util.Util.SDK_INT
            r9 = 26
            if (r8 < r9) goto La7
            java.lang.String r8 = r12.sampleMimeType
            java.lang.String r9 = "video/dolby-vision"
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto La7
            android.content.Context r8 = r10.context
            boolean r8 = com.google.android.exoplayer2.video.MediaCodecVideoRenderer.Api26.doesDisplaySupportDolbyVision(r8)
            if (r8 != 0) goto La7
            r3 = 256(0x100, float:3.59E-43)
        La7:
            if (r5 == 0) goto Lcd
            android.content.Context r5 = r10.context
            java.util.List r11 = getDecoderInfos(r5, r11, r12, r0, r2)
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto Lcd
            java.util.List r11 = com.google.android.exoplayer2.mediacodec.MediaCodecUtil.getDecoderInfosSortedByFormatSupport(r11, r12)
            java.lang.Object r11 = r11.get(r1)
            com.google.android.exoplayer2.mediacodec.MediaCodecInfo r11 = (com.google.android.exoplayer2.mediacodec.MediaCodecInfo) r11
            boolean r0 = r11.isFormatSupported(r12)
            if (r0 == 0) goto Lcd
            boolean r11 = r11.isSeamlessAdaptationSupported(r12)
            if (r11 == 0) goto Lcd
            r1 = 32
        Lcd:
            int r11 = com.google.android.exoplayer2.RendererCapabilities.CC.create(r6, r7, r1, r4, r3)
            return r11
    }

    public final void updateDroppedBufferCounters(int r3, int r4) {
            r2 = this;
            com.google.android.exoplayer2.decoder.DecoderCounters r0 = r2.decoderCounters
            int r1 = r0.droppedInputBufferCount
            int r1 = r1 + r3
            r0.droppedInputBufferCount = r1
            int r3 = r3 + r4
            int r4 = r0.droppedBufferCount
            int r4 = r4 + r3
            r0.droppedBufferCount = r4
            int r4 = r2.droppedFrames
            int r4 = r4 + r3
            r2.droppedFrames = r4
            int r4 = r2.consecutiveDroppedFrameCount
            int r4 = r4 + r3
            r2.consecutiveDroppedFrameCount = r4
            int r3 = r0.maxConsecutiveDroppedBufferCount
            int r3 = java.lang.Math.max(r4, r3)
            r0.maxConsecutiveDroppedBufferCount = r3
            int r3 = r2.maxDroppedFramesToNotify
            if (r3 <= 0) goto L2a
            int r4 = r2.droppedFrames
            if (r4 < r3) goto L2a
            r2.maybeNotifyDroppedFrames()
        L2a:
            return
    }

    public final void updateVideoFrameProcessingOffsetCounters(long r3) {
            r2 = this;
            com.google.android.exoplayer2.decoder.DecoderCounters r0 = r2.decoderCounters
            r0.addVideoFrameProcessingOffset(r3)
            long r0 = r2.totalVideoFrameProcessingOffsetUs
            long r0 = r0 + r3
            r2.totalVideoFrameProcessingOffsetUs = r0
            int r3 = r2.videoFrameProcessingOffsetCount
            int r3 = r3 + 1
            r2.videoFrameProcessingOffsetCount = r3
            return
    }
}
