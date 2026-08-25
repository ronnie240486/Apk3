package com.google.android.exoplayer2.video;

/* JADX INFO: loaded from: classes3.dex */
public final class VideoFrameReleaseHelper {
    private static final long MAX_ALLOWED_ADJUSTMENT_NS = 20000000;
    private static final int MINIMUM_FRAMES_WITHOUT_SYNC_TO_CLEAR_SURFACE_FRAME_RATE = 30;
    private static final long MINIMUM_MATCHING_FRAME_DURATION_FOR_HIGH_CONFIDENCE_NS = 5000000000L;
    private static final float MINIMUM_MEDIA_FRAME_RATE_CHANGE_FOR_UPDATE_HIGH_CONFIDENCE = 0.02f;
    private static final float MINIMUM_MEDIA_FRAME_RATE_CHANGE_FOR_UPDATE_LOW_CONFIDENCE = 1.0f;
    private static final java.lang.String TAG = "VideoFrameReleaseHelper";
    private static final long VSYNC_OFFSET_PERCENTAGE = 80;
    private static final long VSYNC_SAMPLE_UPDATE_PERIOD_MS = 500;
    private int changeFrameRateStrategy;

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper displayHelper;
    private float formatFrameRate;
    private long frameIndex;
    private final com.google.android.exoplayer2.video.FixedFrameRateEstimator frameRateEstimator;
    private long lastAdjustedFrameIndex;
    private long lastAdjustedReleaseTimeNs;
    private long pendingLastAdjustedFrameIndex;
    private long pendingLastAdjustedReleaseTimeNs;
    private float playbackSpeed;
    private boolean started;

    @androidx.annotation.Nullable
    private android.view.Surface surface;
    private float surfaceMediaFrameRate;
    private float surfacePlaybackFrameRate;
    private long vsyncDurationNs;
    private long vsyncOffsetNs;

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.video.VideoFrameReleaseHelper.VSyncSampler vsyncSampler;

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(30)
    public static final class Api30 {
        private Api30() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static void setSurfaceFrameRate(android.view.Surface r1, float r2) {
                r0 = 0
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 != 0) goto L7
                r0 = 0
                goto L8
            L7:
                r0 = 1
            L8:
                r1.setFrameRate(r2, r0)     // Catch: java.lang.IllegalStateException -> Lc
                goto L14
            Lc:
                r1 = move-exception
                java.lang.String r2 = "VideoFrameReleaseHelper"
                java.lang.String r0 = "Failed to call Surface.setFrameRate"
                com.google.android.exoplayer2.util.Log.e(r2, r0, r1)
            L14:
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface DisplayHelper {

        /* JADX INFO: loaded from: classes3.dex */
        public interface Listener {
            void onDefaultDisplayChanged(@androidx.annotation.Nullable android.view.Display r1);
        }

        void register(com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper.Listener r1);

        void unregister();
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class DisplayHelperV16 implements com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper {
        private final android.view.WindowManager windowManager;

        private DisplayHelperV16(android.view.WindowManager r1) {
                r0 = this;
                r0.<init>()
                r0.windowManager = r1
                return
        }

        @androidx.annotation.Nullable
        public static com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper maybeBuildNewInstance(android.content.Context r1) {
                java.lang.String r0 = "window"
                java.lang.Object r1 = r1.getSystemService(r0)
                android.view.WindowManager r1 = (android.view.WindowManager) r1
                if (r1 == 0) goto L11
                com.google.android.exoplayer2.video.VideoFrameReleaseHelper$DisplayHelperV16 r0 = new com.google.android.exoplayer2.video.VideoFrameReleaseHelper$DisplayHelperV16
                r0.<init>(r1)
                goto L12
            L11:
                r0 = 0
            L12:
                return r0
        }

        @Override // com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper
        public void register(com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper.Listener r2) {
                r1 = this;
                android.view.WindowManager r0 = r1.windowManager
                android.view.Display r0 = r0.getDefaultDisplay()
                r2.onDefaultDisplayChanged(r0)
                return
        }

        @Override // com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper
        public void unregister() {
                r0 = this;
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(17)
    public static final class DisplayHelperV17 implements com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper, android.hardware.display.DisplayManager.DisplayListener {
        private final android.hardware.display.DisplayManager displayManager;

        @androidx.annotation.Nullable
        private com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper.Listener listener;

        private DisplayHelperV17(android.hardware.display.DisplayManager r1) {
                r0 = this;
                r0.<init>()
                r0.displayManager = r1
                return
        }

        private android.view.Display getDefaultDisplay() {
                r2 = this;
                android.hardware.display.DisplayManager r0 = r2.displayManager
                r1 = 0
                android.view.Display r0 = r0.getDisplay(r1)
                return r0
        }

        @androidx.annotation.Nullable
        public static com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper maybeBuildNewInstance(android.content.Context r1) {
                java.lang.String r0 = "display"
                java.lang.Object r1 = r1.getSystemService(r0)
                android.hardware.display.DisplayManager r1 = (android.hardware.display.DisplayManager) r1
                if (r1 == 0) goto L10
                com.google.android.exoplayer2.video.VideoFrameReleaseHelper$DisplayHelperV17 r0 = new com.google.android.exoplayer2.video.VideoFrameReleaseHelper$DisplayHelperV17
                r0.<init>(r1)
                goto L11
            L10:
                r0 = 0
            L11:
                return r0
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int r1) {
                r0 = this;
                return
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int r2) {
                r1 = this;
                com.google.android.exoplayer2.video.VideoFrameReleaseHelper$DisplayHelper$Listener r0 = r1.listener
                if (r0 == 0) goto Ld
                if (r2 != 0) goto Ld
                android.view.Display r2 = r1.getDefaultDisplay()
                r0.onDefaultDisplayChanged(r2)
            Ld:
                return
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int r1) {
                r0 = this;
                return
        }

        @Override // com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper
        public void register(com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper.Listener r3) {
                r2 = this;
                r2.listener = r3
                android.hardware.display.DisplayManager r0 = r2.displayManager
                android.os.Handler r1 = com.google.android.exoplayer2.util.Util.createHandlerForCurrentLooper()
                r0.registerDisplayListener(r2, r1)
                android.view.Display r0 = r2.getDefaultDisplay()
                r3.onDefaultDisplayChanged(r0)
                return
        }

        @Override // com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper
        public void unregister() {
                r1 = this;
                android.hardware.display.DisplayManager r0 = r1.displayManager
                r0.unregisterDisplayListener(r1)
                r0 = 0
                r1.listener = r0
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class VSyncSampler implements android.view.Choreographer.FrameCallback, android.os.Handler.Callback {
        private static final int CREATE_CHOREOGRAPHER = 0;
        private static final com.google.android.exoplayer2.video.VideoFrameReleaseHelper.VSyncSampler INSTANCE = null;
        private static final int MSG_ADD_OBSERVER = 1;
        private static final int MSG_REMOVE_OBSERVER = 2;
        private android.view.Choreographer choreographer;
        private final android.os.HandlerThread choreographerOwnerThread;
        private final android.os.Handler handler;
        private int observerCount;
        public volatile long sampledVsyncTimeNs;

        static {
                com.google.android.exoplayer2.video.VideoFrameReleaseHelper$VSyncSampler r0 = new com.google.android.exoplayer2.video.VideoFrameReleaseHelper$VSyncSampler
                r0.<init>()
                com.google.android.exoplayer2.video.VideoFrameReleaseHelper.VSyncSampler.INSTANCE = r0
                return
        }

        private VSyncSampler() {
                r2 = this;
                r2.<init>()
                r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r2.sampledVsyncTimeNs = r0
                android.os.HandlerThread r0 = new android.os.HandlerThread
                java.lang.String r1 = "ExoPlayer:FrameReleaseChoreographer"
                r0.<init>(r1)
                r2.choreographerOwnerThread = r0
                r0.start()
                android.os.Looper r0 = r0.getLooper()
                android.os.Handler r0 = com.google.android.exoplayer2.util.Util.createHandler(r0, r2)
                r2.handler = r0
                r1 = 0
                r0.sendEmptyMessage(r1)
                return
        }

        private void addObserverInternal() {
                r3 = this;
                android.view.Choreographer r0 = r3.choreographer
                if (r0 == 0) goto Lf
                int r1 = r3.observerCount
                r2 = 1
                int r1 = r1 + r2
                r3.observerCount = r1
                if (r1 != r2) goto Lf
                r0.postFrameCallback(r3)
            Lf:
                return
        }

        private void createChoreographerInstanceInternal() {
                r3 = this;
                android.view.Choreographer r0 = android.view.Choreographer.getInstance()     // Catch: java.lang.RuntimeException -> L7
                r3.choreographer = r0     // Catch: java.lang.RuntimeException -> L7
                goto Lf
            L7:
                r0 = move-exception
                java.lang.String r1 = "VideoFrameReleaseHelper"
                java.lang.String r2 = "Vsync sampling disabled due to platform error"
                com.google.android.exoplayer2.util.Log.w(r1, r2, r0)
            Lf:
                return
        }

        public static com.google.android.exoplayer2.video.VideoFrameReleaseHelper.VSyncSampler getInstance() {
                com.google.android.exoplayer2.video.VideoFrameReleaseHelper$VSyncSampler r0 = com.google.android.exoplayer2.video.VideoFrameReleaseHelper.VSyncSampler.INSTANCE
                return r0
        }

        private void removeObserverInternal() {
                r2 = this;
                android.view.Choreographer r0 = r2.choreographer
                if (r0 == 0) goto L16
                int r1 = r2.observerCount
                int r1 = r1 + (-1)
                r2.observerCount = r1
                if (r1 != 0) goto L16
                r0.removeFrameCallback(r2)
                r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r2.sampledVsyncTimeNs = r0
            L16:
                return
        }

        public void addObserver() {
                r2 = this;
                android.os.Handler r0 = r2.handler
                r1 = 1
                r0.sendEmptyMessage(r1)
                return
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long r3) {
                r2 = this;
                r2.sampledVsyncTimeNs = r3
                android.view.Choreographer r3 = r2.choreographer
                java.lang.Object r3 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
                android.view.Choreographer r3 = (android.view.Choreographer) r3
                r0 = 500(0x1f4, double:2.47E-321)
                r3.postFrameCallbackDelayed(r2, r0)
                return
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message r3) {
                r2 = this;
                int r3 = r3.what
                r0 = 1
                if (r3 == 0) goto L14
                if (r3 == r0) goto L10
                r1 = 2
                if (r3 == r1) goto Lc
                r3 = 0
                return r3
            Lc:
                r2.removeObserverInternal()
                return r0
            L10:
                r2.addObserverInternal()
                return r0
            L14:
                r2.createChoreographerInstanceInternal()
                return r0
        }

        public void removeObserver() {
                r2 = this;
                android.os.Handler r0 = r2.handler
                r1 = 2
                r0.sendEmptyMessage(r1)
                return
        }
    }

    public static /* synthetic */ void $r8$lambda$A5Zm0DOJniOJatrcB4x11ZTkanw(com.google.android.exoplayer2.video.VideoFrameReleaseHelper r0, android.view.Display r1) {
            r0.updateDefaultDisplayRefreshRateParams(r1)
            return
    }

    public VideoFrameReleaseHelper(@androidx.annotation.Nullable android.content.Context r3) {
            r2 = this;
            r2.<init>()
            com.google.android.exoplayer2.video.FixedFrameRateEstimator r0 = new com.google.android.exoplayer2.video.FixedFrameRateEstimator
            r0.<init>()
            r2.frameRateEstimator = r0
            com.google.android.exoplayer2.video.VideoFrameReleaseHelper$DisplayHelper r3 = maybeBuildDisplayHelper(r3)
            r2.displayHelper = r3
            if (r3 == 0) goto L17
            com.google.android.exoplayer2.video.VideoFrameReleaseHelper$VSyncSampler r3 = com.google.android.exoplayer2.video.VideoFrameReleaseHelper.VSyncSampler.getInstance()
            goto L18
        L17:
            r3 = 0
        L18:
            r2.vsyncSampler = r3
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.vsyncDurationNs = r0
            r2.vsyncOffsetNs = r0
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.formatFrameRate = r3
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.playbackSpeed = r3
            r3 = 0
            r2.changeFrameRateStrategy = r3
            return
    }

    private static boolean adjustmentAllowed(long r1, long r3) {
            long r1 = r1 - r3
            long r1 = java.lang.Math.abs(r1)
            r3 = 20000000(0x1312d00, double:9.881313E-317)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    private void clearSurfaceFrameRate() {
            r3 = this;
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 30
            if (r0 < r1) goto L1d
            android.view.Surface r0 = r3.surface
            if (r0 == 0) goto L1d
            int r1 = r3.changeFrameRateStrategy
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L1d
            float r1 = r3.surfacePlaybackFrameRate
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L18
            goto L1d
        L18:
            r3.surfacePlaybackFrameRate = r2
            com.google.android.exoplayer2.video.VideoFrameReleaseHelper.Api30.setSurfaceFrameRate(r0, r2)
        L1d:
            return
    }

    private static long closestVsync(long r3, long r5, long r7) {
            long r0 = r3 - r5
            long r0 = r0 / r7
            long r0 = r0 * r7
            long r0 = r0 + r5
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 > 0) goto Ld
            long r5 = r0 - r7
            goto L10
        Ld:
            long r7 = r7 + r0
            r5 = r0
            r0 = r7
        L10:
            long r7 = r0 - r3
            long r3 = r3 - r5
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 >= 0) goto L18
            goto L19
        L18:
            r0 = r5
        L19:
            return r0
    }

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper maybeBuildDisplayHelper(@androidx.annotation.Nullable android.content.Context r3) {
            r0 = 0
            if (r3 == 0) goto L17
            android.content.Context r3 = r3.getApplicationContext()
            int r1 = com.google.android.exoplayer2.util.Util.SDK_INT
            r2 = 17
            if (r1 < r2) goto L11
            com.google.android.exoplayer2.video.VideoFrameReleaseHelper$DisplayHelper r0 = com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelperV17.maybeBuildNewInstance(r3)
        L11:
            if (r0 != 0) goto L17
            com.google.android.exoplayer2.video.VideoFrameReleaseHelper$DisplayHelper r0 = com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelperV16.maybeBuildNewInstance(r3)
        L17:
            return r0
    }

    private void resetAdjustment() {
            r2 = this;
            r0 = 0
            r2.frameIndex = r0
            r0 = -1
            r2.lastAdjustedFrameIndex = r0
            r2.pendingLastAdjustedFrameIndex = r0
            return
    }

    private void updateDefaultDisplayRefreshRateParams(@androidx.annotation.Nullable android.view.Display r5) {
            r4 = this;
            if (r5 == 0) goto L1a
            float r5 = r5.getRefreshRate()
            double r0 = (double) r5
            r2 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r2 = r2 / r0
            long r0 = (long) r2
            r4.vsyncDurationNs = r0
            r2 = 80
            long r0 = r0 * r2
            r2 = 100
            long r0 = r0 / r2
            r4.vsyncOffsetNs = r0
            goto L2a
        L1a:
            java.lang.String r5 = "VideoFrameReleaseHelper"
            java.lang.String r0 = "Unable to query display refresh rate"
            com.google.android.exoplayer2.util.Log.w(r5, r0)
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4.vsyncDurationNs = r0
            r4.vsyncOffsetNs = r0
        L2a:
            return
    }

    private void updateSurfaceMediaFrameRate() {
            r8 = this;
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 30
            if (r0 < r1) goto L73
            android.view.Surface r0 = r8.surface
            if (r0 != 0) goto Lc
            goto L73
        Lc:
            com.google.android.exoplayer2.video.FixedFrameRateEstimator r0 = r8.frameRateEstimator
            boolean r0 = r0.isSynced()
            if (r0 == 0) goto L1b
            com.google.android.exoplayer2.video.FixedFrameRateEstimator r0 = r8.frameRateEstimator
            float r0 = r0.getFrameRate()
            goto L1d
        L1b:
            float r0 = r8.formatFrameRate
        L1d:
            float r2 = r8.surfaceMediaFrameRate
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 != 0) goto L24
            return
        L24:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4 = 0
            r5 = 1
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 == 0) goto L61
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L61
            com.google.android.exoplayer2.video.FixedFrameRateEstimator r1 = r8.frameRateEstimator
            boolean r1 = r1.isSynced()
            if (r1 == 0) goto L49
            com.google.android.exoplayer2.video.FixedFrameRateEstimator r1 = r8.frameRateEstimator
            long r1 = r1.getMatchingFrameDurationSumNs()
            r6 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 < 0) goto L49
            r1 = 1
            goto L4a
        L49:
            r1 = 0
        L4a:
            if (r1 == 0) goto L50
            r1 = 1017370378(0x3ca3d70a, float:0.02)
            goto L52
        L50:
            r1 = 1065353216(0x3f800000, float:1.0)
        L52:
            float r2 = r8.surfaceMediaFrameRate
            float r2 = r0 - r2
            float r2 = java.lang.Math.abs(r2)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L5f
            goto L6c
        L5f:
            r5 = 0
            goto L6c
        L61:
            if (r6 == 0) goto L64
            goto L6c
        L64:
            com.google.android.exoplayer2.video.FixedFrameRateEstimator r2 = r8.frameRateEstimator
            int r2 = r2.getFramesWithoutSyncCount()
            if (r2 < r1) goto L5f
        L6c:
            if (r5 == 0) goto L73
            r8.surfaceMediaFrameRate = r0
            r8.updateSurfacePlaybackFrameRate(r4)
        L73:
            return
    }

    private void updateSurfacePlaybackFrameRate(boolean r5) {
            r4 = this;
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 30
            if (r0 < r1) goto L30
            android.view.Surface r0 = r4.surface
            if (r0 == 0) goto L30
            int r1 = r4.changeFrameRateStrategy
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L11
            goto L30
        L11:
            r1 = 0
            boolean r2 = r4.started
            if (r2 == 0) goto L22
            float r2 = r4.surfaceMediaFrameRate
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 == 0) goto L22
            float r1 = r4.playbackSpeed
            float r1 = r1 * r2
        L22:
            if (r5 != 0) goto L2b
            float r5 = r4.surfacePlaybackFrameRate
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2b
            return
        L2b:
            r4.surfacePlaybackFrameRate = r1
            com.google.android.exoplayer2.video.VideoFrameReleaseHelper.Api30.setSurfaceFrameRate(r0, r1)
        L30:
            return
    }

    public long adjustReleaseTime(long r11) {
            r10 = this;
            long r0 = r10.lastAdjustedFrameIndex
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L30
            com.google.android.exoplayer2.video.FixedFrameRateEstimator r0 = r10.frameRateEstimator
            boolean r0 = r0.isSynced()
            if (r0 == 0) goto L30
            com.google.android.exoplayer2.video.FixedFrameRateEstimator r0 = r10.frameRateEstimator
            long r0 = r0.getFrameDurationNs()
            long r2 = r10.lastAdjustedReleaseTimeNs
            long r4 = r10.frameIndex
            long r6 = r10.lastAdjustedFrameIndex
            long r4 = r4 - r6
            long r4 = r4 * r0
            float r0 = (float) r4
            float r1 = r10.playbackSpeed
            float r0 = r0 / r1
            long r0 = (long) r0
            long r2 = r2 + r0
            boolean r0 = adjustmentAllowed(r11, r2)
            if (r0 == 0) goto L2d
            r4 = r2
            goto L31
        L2d:
            r10.resetAdjustment()
        L30:
            r4 = r11
        L31:
            long r11 = r10.frameIndex
            r10.pendingLastAdjustedFrameIndex = r11
            r10.pendingLastAdjustedReleaseTimeNs = r4
            com.google.android.exoplayer2.video.VideoFrameReleaseHelper$VSyncSampler r11 = r10.vsyncSampler
            if (r11 == 0) goto L58
            long r0 = r10.vsyncDurationNs
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L47
            goto L58
        L47:
            long r6 = r11.sampledVsyncTimeNs
            int r11 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r11 != 0) goto L4e
            return r4
        L4e:
            long r8 = r10.vsyncDurationNs
            long r11 = closestVsync(r4, r6, r8)
            long r0 = r10.vsyncOffsetNs
            long r11 = r11 - r0
            return r11
        L58:
            return r4
    }

    public void onFormatChanged(float r1) {
            r0 = this;
            r0.formatFrameRate = r1
            com.google.android.exoplayer2.video.FixedFrameRateEstimator r1 = r0.frameRateEstimator
            r1.reset()
            r0.updateSurfaceMediaFrameRate()
            return
    }

    public void onNextFrame(long r6) {
            r5 = this;
            long r0 = r5.pendingLastAdjustedFrameIndex
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Le
            r5.lastAdjustedFrameIndex = r0
            long r0 = r5.pendingLastAdjustedReleaseTimeNs
            r5.lastAdjustedReleaseTimeNs = r0
        Le:
            long r0 = r5.frameIndex
            r2 = 1
            long r0 = r0 + r2
            r5.frameIndex = r0
            com.google.android.exoplayer2.video.FixedFrameRateEstimator r0 = r5.frameRateEstimator
            r1 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r1
            r0.onNextFrame(r6)
            r5.updateSurfaceMediaFrameRate()
            return
    }

    public void onPlaybackSpeed(float r1) {
            r0 = this;
            r0.playbackSpeed = r1
            r0.resetAdjustment()
            r1 = 0
            r0.updateSurfacePlaybackFrameRate(r1)
            return
    }

    public void onPositionReset() {
            r0 = this;
            r0.resetAdjustment()
            return
    }

    public void onStarted() {
            r3 = this;
            r0 = 1
            r3.started = r0
            r3.resetAdjustment()
            com.google.android.exoplayer2.video.VideoFrameReleaseHelper$DisplayHelper r0 = r3.displayHelper
            if (r0 == 0) goto L21
            com.google.android.exoplayer2.video.VideoFrameReleaseHelper$VSyncSampler r0 = r3.vsyncSampler
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.video.VideoFrameReleaseHelper$VSyncSampler r0 = (com.google.android.exoplayer2.video.VideoFrameReleaseHelper.VSyncSampler) r0
            r0.addObserver()
            com.google.android.exoplayer2.video.VideoFrameReleaseHelper$DisplayHelper r0 = r3.displayHelper
            com.flextv.livestore.activities.MovieActivity$$ExternalSyntheticLambda2 r1 = new com.flextv.livestore.activities.MovieActivity$$ExternalSyntheticLambda2
            r2 = 10
            r1.<init>(r3, r2)
            r0.register(r1)
        L21:
            r0 = 0
            r3.updateSurfacePlaybackFrameRate(r0)
            return
    }

    public void onStopped() {
            r1 = this;
            r0 = 0
            r1.started = r0
            com.google.android.exoplayer2.video.VideoFrameReleaseHelper$DisplayHelper r0 = r1.displayHelper
            if (r0 == 0) goto L15
            r0.unregister()
            com.google.android.exoplayer2.video.VideoFrameReleaseHelper$VSyncSampler r0 = r1.vsyncSampler
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.video.VideoFrameReleaseHelper$VSyncSampler r0 = (com.google.android.exoplayer2.video.VideoFrameReleaseHelper.VSyncSampler) r0
            r0.removeObserver()
        L15:
            r1.clearSurfaceFrameRate()
            return
    }

    public void onSurfaceChanged(@androidx.annotation.Nullable android.view.Surface r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.exoplayer2.video.PlaceholderSurface
            if (r0 == 0) goto L5
            r2 = 0
        L5:
            android.view.Surface r0 = r1.surface
            if (r0 != r2) goto La
            return
        La:
            r1.clearSurfaceFrameRate()
            r1.surface = r2
            r2 = 1
            r1.updateSurfacePlaybackFrameRate(r2)
            return
    }

    public void setChangeFrameRateStrategy(int r2) {
            r1 = this;
            int r0 = r1.changeFrameRateStrategy
            if (r0 != r2) goto L5
            return
        L5:
            r1.changeFrameRateStrategy = r2
            r2 = 1
            r1.updateSurfacePlaybackFrameRate(r2)
            return
    }
}
