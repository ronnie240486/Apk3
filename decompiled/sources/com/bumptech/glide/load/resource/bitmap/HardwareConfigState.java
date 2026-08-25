package com.bumptech.glide.load.resource.bitmap;

/* JADX INFO: loaded from: classes2.dex */
public final class HardwareConfigState {
    public static final boolean BLOCK_HARDWARE_BITMAPS_WHEN_GL_CONTEXT_MIGHT_NOT_BE_INITIALIZED = false;
    private static final java.io.File FD_SIZE_LIST = null;
    public static final boolean HARDWARE_BITMAPS_SUPPORTED = false;
    private static final int MAXIMUM_FDS_FOR_HARDWARE_CONFIGS_O = 700;
    private static final int MAXIMUM_FDS_FOR_HARDWARE_CONFIGS_P = 20000;
    private static final int MINIMUM_DECODES_BETWEEN_FD_CHECKS = 50;
    private static final int MIN_HARDWARE_DIMENSION_P = 0;
    public static final int NO_MAX_FD_COUNT = -1;
    private static final java.lang.String TAG = "HardwareConfig";
    private static volatile com.bumptech.glide.load.resource.bitmap.HardwareConfigState instance;
    private static volatile int manualOverrideMaxFdCount;

    @androidx.annotation.GuardedBy("this")
    private int decodesSinceLastFdCheck;

    @androidx.annotation.GuardedBy("this")
    private boolean isFdSizeBelowHardwareLimit;
    private final java.util.concurrent.atomic.AtomicBoolean isHardwareConfigAllowedByAppState;
    private final boolean isHardwareConfigAllowedByDeviceModel;
    private final int minHardwareDimension;
    private final int sdkBasedMaxFdCount;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 0
            r3 = 29
            if (r0 >= r3) goto La
            r3 = 1
            goto Lb
        La:
            r3 = 0
        Lb:
            com.bumptech.glide.load.resource.bitmap.HardwareConfigState.BLOCK_HARDWARE_BITMAPS_WHEN_GL_CONTEXT_MIGHT_NOT_BE_INITIALIZED = r3
            r3 = 26
            if (r0 < r3) goto L12
            goto L13
        L12:
            r1 = 0
        L13:
            com.bumptech.glide.load.resource.bitmap.HardwareConfigState.HARDWARE_BITMAPS_SUPPORTED = r1
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/proc/self/fd"
            r0.<init>(r1)
            com.bumptech.glide.load.resource.bitmap.HardwareConfigState.FD_SIZE_LIST = r0
            r0 = -1
            com.bumptech.glide.load.resource.bitmap.HardwareConfigState.manualOverrideMaxFdCount = r0
            return
    }

    @androidx.annotation.VisibleForTesting
    public HardwareConfigState() {
            r3 = this;
            r3.<init>()
            r0 = 1
            r3.isFdSizeBelowHardwareLimit = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r3.isHardwareConfigAllowedByAppState = r0
            boolean r0 = isHardwareConfigAllowedByDeviceModel()
            r3.isHardwareConfigAllowedByDeviceModel = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r0 < r2) goto L21
            r0 = 20000(0x4e20, float:2.8026E-41)
            r3.sdkBasedMaxFdCount = r0
            r3.minHardwareDimension = r1
            goto L29
        L21:
            r0 = 700(0x2bc, float:9.81E-43)
            r3.sdkBasedMaxFdCount = r0
            r0 = 128(0x80, float:1.8E-43)
            r3.minHardwareDimension = r0
        L29:
            return
    }

    private boolean areHardwareBitmapsBlockedByAppState() {
            r1 = this;
            boolean r0 = com.bumptech.glide.load.resource.bitmap.HardwareConfigState.BLOCK_HARDWARE_BITMAPS_WHEN_GL_CONTEXT_MIGHT_NOT_BE_INITIALIZED
            if (r0 == 0) goto Le
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.isHardwareConfigAllowedByAppState
            boolean r0 = r0.get()
            if (r0 != 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public static com.bumptech.glide.load.resource.bitmap.HardwareConfigState getInstance() {
            com.bumptech.glide.load.resource.bitmap.HardwareConfigState r0 = com.bumptech.glide.load.resource.bitmap.HardwareConfigState.instance
            if (r0 != 0) goto L17
            java.lang.Class<com.bumptech.glide.load.resource.bitmap.HardwareConfigState> r0 = com.bumptech.glide.load.resource.bitmap.HardwareConfigState.class
            monitor-enter(r0)
            com.bumptech.glide.load.resource.bitmap.HardwareConfigState r1 = com.bumptech.glide.load.resource.bitmap.HardwareConfigState.instance     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L12
            com.bumptech.glide.load.resource.bitmap.HardwareConfigState r1 = new com.bumptech.glide.load.resource.bitmap.HardwareConfigState     // Catch: java.lang.Throwable -> L14
            r1.<init>()     // Catch: java.lang.Throwable -> L14
            com.bumptech.glide.load.resource.bitmap.HardwareConfigState.instance = r1     // Catch: java.lang.Throwable -> L14
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
        L17:
            com.bumptech.glide.load.resource.bitmap.HardwareConfigState r0 = com.bumptech.glide.load.resource.bitmap.HardwareConfigState.instance
            return r0
    }

    private int getMaxFdCount() {
            r2 = this;
            int r0 = com.bumptech.glide.load.resource.bitmap.HardwareConfigState.manualOverrideMaxFdCount
            r1 = -1
            if (r0 == r1) goto L8
            int r0 = com.bumptech.glide.load.resource.bitmap.HardwareConfigState.manualOverrideMaxFdCount
            goto La
        L8:
            int r0 = r2.sdkBasedMaxFdCount
        La:
            return r0
    }

    private synchronized boolean isFdSizeBelowHardwareLimit() {
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.decodesSinceLastFdCheck     // Catch: java.lang.Throwable -> L50
            r1 = 1
            int r0 = r0 + r1
            r8.decodesSinceLastFdCheck = r0     // Catch: java.lang.Throwable -> L50
            r2 = 50
            if (r0 < r2) goto L4c
            r0 = 0
            r8.decodesSinceLastFdCheck = r0     // Catch: java.lang.Throwable -> L50
            java.io.File r2 = com.bumptech.glide.load.resource.bitmap.HardwareConfigState.FD_SIZE_LIST     // Catch: java.lang.Throwable -> L50
            java.lang.String[] r2 = r2.list()     // Catch: java.lang.Throwable -> L50
            int r2 = r2.length     // Catch: java.lang.Throwable -> L50
            int r3 = r8.getMaxFdCount()     // Catch: java.lang.Throwable -> L50
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L50
            long r5 = (long) r2     // Catch: java.lang.Throwable -> L50
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 >= 0) goto L20
            goto L21
        L20:
            r1 = 0
        L21:
            r8.isFdSizeBelowHardwareLimit = r1     // Catch: java.lang.Throwable -> L50
            if (r1 != 0) goto L4c
            java.lang.String r0 = "Downsampler"
            r1 = 5
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> L50
            if (r0 == 0) goto L4c
            java.lang.String r0 = "Downsampler"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50
            r1.<init>()     // Catch: java.lang.Throwable -> L50
            java.lang.String r5 = "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors "
            r1.append(r5)     // Catch: java.lang.Throwable -> L50
            r1.append(r2)     // Catch: java.lang.Throwable -> L50
            java.lang.String r2 = ", limit "
            r1.append(r2)     // Catch: java.lang.Throwable -> L50
            r1.append(r3)     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L50
            android.util.Log.w(r0, r1)     // Catch: java.lang.Throwable -> L50
        L4c:
            boolean r0 = r8.isFdSizeBelowHardwareLimit     // Catch: java.lang.Throwable -> L50
            monitor-exit(r8)
            return r0
        L50:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
    }

    private static boolean isHardwareConfigAllowedByDeviceModel() {
            boolean r0 = isHardwareConfigDisallowedByB112551574()
            if (r0 != 0) goto Le
            boolean r0 = isHardwareConfigDisallowedByB147430447()
            if (r0 != 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    private static boolean isHardwareConfigDisallowedByB112551574() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 26
            if (r0 == r2) goto L8
            return r1
        L8:
            java.lang.String r3 = "SC-04J"
            java.lang.String r4 = "SM-N935"
            java.lang.String r5 = "SM-J720"
            java.lang.String r6 = "SM-G570F"
            java.lang.String r7 = "SM-G570M"
            java.lang.String r8 = "SM-G960"
            java.lang.String r9 = "SM-G965"
            java.lang.String r10 = "SM-G935"
            java.lang.String r11 = "SM-G930"
            java.lang.String r12 = "SM-A520"
            java.lang.String r13 = "SM-A720F"
            java.lang.String r14 = "moto e5"
            java.lang.String r15 = "moto e5 play"
            java.lang.String r16 = "moto e5 plus"
            java.lang.String r17 = "moto e5 cruise"
            java.lang.String r18 = "moto g(6) forge"
            java.lang.String r19 = "moto g(6) play"
            java.lang.String[] r0 = new java.lang.String[]{r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19}
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.Iterator r0 = r0.iterator()
        L36:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L4c
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = android.os.Build.MODEL
            boolean r2 = r3.startsWith(r2)
            if (r2 == 0) goto L36
            r0 = 1
            return r0
        L4c:
            return r1
    }

    private static boolean isHardwareConfigDisallowedByB147430447() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 == r1) goto L8
            r0 = 0
            return r0
        L8:
            java.lang.String r1 = "LG-M250"
            java.lang.String r2 = "LG-M320"
            java.lang.String r3 = "LG-Q710AL"
            java.lang.String r4 = "LG-Q710PL"
            java.lang.String r5 = "LGM-K121K"
            java.lang.String r6 = "LGM-K121L"
            java.lang.String r7 = "LGM-K121S"
            java.lang.String r8 = "LGM-X320K"
            java.lang.String r9 = "LGM-X320L"
            java.lang.String r10 = "LGM-X320S"
            java.lang.String r11 = "LGM-X401L"
            java.lang.String r12 = "LGM-X401S"
            java.lang.String r13 = "LM-Q610.FG"
            java.lang.String r14 = "LM-Q610.FGN"
            java.lang.String r15 = "LM-Q617.FG"
            java.lang.String r16 = "LM-Q617.FGN"
            java.lang.String r17 = "LM-Q710.FG"
            java.lang.String r18 = "LM-Q710.FGN"
            java.lang.String r19 = "LM-X220PM"
            java.lang.String r20 = "LM-X220QMA"
            java.lang.String r21 = "LM-X410PM"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21}
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.lang.String r1 = android.os.Build.MODEL
            boolean r0 = r0.contains(r1)
            return r0
    }

    public boolean areHardwareBitmapsBlocked() {
            r1 = this;
            com.bumptech.glide.util.Util.assertMainThread()
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.isHardwareConfigAllowedByAppState
            boolean r0 = r0.get()
            r0 = r0 ^ 1
            return r0
    }

    public void blockHardwareBitmaps() {
            r2 = this;
            com.bumptech.glide.util.Util.assertMainThread()
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.isHardwareConfigAllowedByAppState
            r1 = 0
            r0.set(r1)
            return
    }

    public boolean isHardwareConfigAllowed(int r4, int r5, boolean r6, boolean r7) {
            r3 = this;
            r0 = 0
            r1 = 2
            java.lang.String r2 = "HardwareConfig"
            if (r6 != 0) goto L12
            boolean r4 = android.util.Log.isLoggable(r2, r1)
            if (r4 == 0) goto L11
            java.lang.String r4 = "Hardware config disallowed by caller"
            android.util.Log.v(r2, r4)
        L11:
            return r0
        L12:
            boolean r6 = r3.isHardwareConfigAllowedByDeviceModel
            if (r6 != 0) goto L22
            boolean r4 = android.util.Log.isLoggable(r2, r1)
            if (r4 == 0) goto L21
            java.lang.String r4 = "Hardware config disallowed by device model"
            android.util.Log.v(r2, r4)
        L21:
            return r0
        L22:
            boolean r6 = com.bumptech.glide.load.resource.bitmap.HardwareConfigState.HARDWARE_BITMAPS_SUPPORTED
            if (r6 != 0) goto L32
            boolean r4 = android.util.Log.isLoggable(r2, r1)
            if (r4 == 0) goto L31
            java.lang.String r4 = "Hardware config disallowed by sdk"
            android.util.Log.v(r2, r4)
        L31:
            return r0
        L32:
            boolean r6 = r3.areHardwareBitmapsBlockedByAppState()
            if (r6 == 0) goto L44
            boolean r4 = android.util.Log.isLoggable(r2, r1)
            if (r4 == 0) goto L43
            java.lang.String r4 = "Hardware config disallowed by app state"
            android.util.Log.v(r2, r4)
        L43:
            return r0
        L44:
            if (r7 == 0) goto L52
            boolean r4 = android.util.Log.isLoggable(r2, r1)
            if (r4 == 0) goto L51
            java.lang.String r4 = "Hardware config disallowed because exif orientation is required"
            android.util.Log.v(r2, r4)
        L51:
            return r0
        L52:
            int r6 = r3.minHardwareDimension
            if (r4 >= r6) goto L62
            boolean r4 = android.util.Log.isLoggable(r2, r1)
            if (r4 == 0) goto L61
            java.lang.String r4 = "Hardware config disallowed because width is too small"
            android.util.Log.v(r2, r4)
        L61:
            return r0
        L62:
            if (r5 >= r6) goto L70
            boolean r4 = android.util.Log.isLoggable(r2, r1)
            if (r4 == 0) goto L6f
            java.lang.String r4 = "Hardware config disallowed because height is too small"
            android.util.Log.v(r2, r4)
        L6f:
            return r0
        L70:
            boolean r4 = r3.isFdSizeBelowHardwareLimit()
            if (r4 != 0) goto L82
            boolean r4 = android.util.Log.isLoggable(r2, r1)
            if (r4 == 0) goto L81
            java.lang.String r4 = "Hardware config disallowed because there are insufficient FDs"
            android.util.Log.v(r2, r4)
        L81:
            return r0
        L82:
            r4 = 1
            return r4
    }

    @android.annotation.TargetApi(26)
    public final boolean setHardwareConfigIfAllowed(int r1, int r2, android.graphics.BitmapFactory.Options r3, boolean r4, boolean r5) {
            r0 = this;
            boolean r1 = r0.isHardwareConfigAllowed(r1, r2, r4, r5)
            if (r1 == 0) goto Ld
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.HARDWARE
            r3.inPreferredConfig = r2
            r2 = 0
            r3.inMutable = r2
        Ld:
            return r1
    }

    public void unblockHardwareBitmaps() {
            r2 = this;
            com.bumptech.glide.util.Util.assertMainThread()
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.isHardwareConfigAllowedByAppState
            r1 = 1
            r0.set(r1)
            return
    }
}
