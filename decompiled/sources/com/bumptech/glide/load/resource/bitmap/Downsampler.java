package com.bumptech.glide.load.resource.bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class Downsampler {
    public static final com.bumptech.glide.load.Option<java.lang.Boolean> ALLOW_HARDWARE_CONFIG = null;
    public static final com.bumptech.glide.load.Option<com.bumptech.glide.load.DecodeFormat> DECODE_FORMAT = null;

    @java.lang.Deprecated
    public static final com.bumptech.glide.load.Option<com.bumptech.glide.load.resource.bitmap.DownsampleStrategy> DOWNSAMPLE_STRATEGY = null;
    private static final com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks EMPTY_CALLBACKS = null;
    public static final com.bumptech.glide.load.Option<java.lang.Boolean> FIX_BITMAP_SIZE_TO_REQUESTED_DIMENSIONS = null;
    private static final java.lang.String ICO_MIME_TYPE = "image/x-ico";
    private static final java.util.Set<java.lang.String> NO_DOWNSAMPLE_PRE_N_MIME_TYPES = null;
    private static final java.util.Queue<android.graphics.BitmapFactory.Options> OPTIONS_QUEUE = null;
    public static final com.bumptech.glide.load.Option<com.bumptech.glide.load.PreferredColorSpace> PREFERRED_COLOR_SPACE = null;
    private static final java.util.Set<com.bumptech.glide.load.ImageHeaderParser.ImageType> TYPES_THAT_USE_POOL_PRE_KITKAT = null;
    private static final java.lang.String WBMP_MIME_TYPE = "image/vnd.wap.wbmp";
    private final com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool;
    private final com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool byteArrayPool;
    private final android.util.DisplayMetrics displayMetrics;
    private final com.bumptech.glide.load.resource.bitmap.HardwareConfigState hardwareConfigState;
    private final java.util.List<com.bumptech.glide.load.ImageHeaderParser> parsers;


    /* JADX INFO: loaded from: classes2.dex */
    public interface DecodeCallbacks {
        void onDecodeComplete(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r1, android.graphics.Bitmap r2) throws java.io.IOException;

        void onObtainBounds();
    }

    static {
            com.bumptech.glide.load.DecodeFormat r0 = com.bumptech.glide.load.DecodeFormat.DEFAULT
            java.lang.String r1 = "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat"
            com.bumptech.glide.load.Option r0 = com.bumptech.glide.load.Option.memory(r1, r0)
            com.bumptech.glide.load.resource.bitmap.Downsampler.DECODE_FORMAT = r0
            com.bumptech.glide.load.PreferredColorSpace r0 = com.bumptech.glide.load.PreferredColorSpace.SRGB
            java.lang.String r1 = "com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace"
            com.bumptech.glide.load.Option r0 = com.bumptech.glide.load.Option.memory(r1, r0)
            com.bumptech.glide.load.resource.bitmap.Downsampler.PREFERRED_COLOR_SPACE = r0
            com.bumptech.glide.load.Option<com.bumptech.glide.load.resource.bitmap.DownsampleStrategy> r0 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.OPTION
            com.bumptech.glide.load.resource.bitmap.Downsampler.DOWNSAMPLE_STRATEGY = r0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.String r1 = "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize"
            com.bumptech.glide.load.Option r1 = com.bumptech.glide.load.Option.memory(r1, r0)
            com.bumptech.glide.load.resource.bitmap.Downsampler.FIX_BITMAP_SIZE_TO_REQUESTED_DIMENSIONS = r1
            java.lang.String r1 = "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode"
            com.bumptech.glide.load.Option r0 = com.bumptech.glide.load.Option.memory(r1, r0)
            com.bumptech.glide.load.resource.bitmap.Downsampler.ALLOW_HARDWARE_CONFIG = r0
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r1 = "image/vnd.wap.wbmp"
            java.lang.String r2 = "image/x-ico"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            com.bumptech.glide.load.resource.bitmap.Downsampler.NO_DOWNSAMPLE_PRE_N_MIME_TYPES = r0
            com.bumptech.glide.load.resource.bitmap.Downsampler$1 r0 = new com.bumptech.glide.load.resource.bitmap.Downsampler$1
            r0.<init>()
            com.bumptech.glide.load.resource.bitmap.Downsampler.EMPTY_CALLBACKS = r0
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG
            com.bumptech.glide.load.ImageHeaderParser$ImageType r1 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A
            com.bumptech.glide.load.ImageHeaderParser$ImageType r2 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG
            java.util.EnumSet r0 = java.util.EnumSet.of(r0, r1, r2)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            com.bumptech.glide.load.resource.bitmap.Downsampler.TYPES_THAT_USE_POOL_PRE_KITKAT = r0
            r0 = 0
            java.util.Queue r0 = com.bumptech.glide.util.Util.createQueue(r0)
            com.bumptech.glide.load.resource.bitmap.Downsampler.OPTIONS_QUEUE = r0
            return
    }

    public Downsampler(java.util.List<com.bumptech.glide.load.ImageHeaderParser> r2, android.util.DisplayMetrics r3, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r4, com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r5) {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.load.resource.bitmap.HardwareConfigState r0 = com.bumptech.glide.load.resource.bitmap.HardwareConfigState.getInstance()
            r1.hardwareConfigState = r0
            r1.parsers = r2
            java.lang.Object r2 = com.bumptech.glide.util.Preconditions.checkNotNull(r3)
            android.util.DisplayMetrics r2 = (android.util.DisplayMetrics) r2
            r1.displayMetrics = r2
            java.lang.Object r2 = com.bumptech.glide.util.Preconditions.checkNotNull(r4)
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r2 = (com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool) r2
            r1.bitmapPool = r2
            java.lang.Object r2 = com.bumptech.glide.util.Preconditions.checkNotNull(r5)
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r2 = (com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool) r2
            r1.byteArrayPool = r2
            return
    }

    private static int adjustTargetDensityForError(double r4) {
            int r0 = getDensityMultiplier(r4)
            double r1 = (double) r0
            double r1 = r1 * r4
            int r1 = round(r1)
            float r2 = (float) r1
            float r0 = (float) r0
            float r2 = r2 / r0
            double r2 = (double) r2
            double r4 = r4 / r2
            double r0 = (double) r1
            double r4 = r4 * r0
            int r4 = round(r4)
            return r4
    }

    private void calculateConfig(com.bumptech.glide.load.resource.bitmap.ImageReader r7, com.bumptech.glide.load.DecodeFormat r8, boolean r9, boolean r10, android.graphics.BitmapFactory.Options r11, int r12, int r13) {
            r6 = this;
            com.bumptech.glide.load.resource.bitmap.HardwareConfigState r0 = r6.hardwareConfigState
            r1 = r12
            r2 = r13
            r3 = r11
            r4 = r9
            r5 = r10
            boolean r9 = r0.setHardwareConfigIfAllowed(r1, r2, r3, r4, r5)
            if (r9 == 0) goto Le
            return
        Le:
            com.bumptech.glide.load.DecodeFormat r9 = com.bumptech.glide.load.DecodeFormat.PREFER_ARGB_8888
            if (r8 == r9) goto L4b
            r9 = 0
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = r7.getImageType()     // Catch: java.io.IOException -> L1c
            boolean r9 = r7.hasAlpha()     // Catch: java.io.IOException -> L1c
            goto L3a
        L1c:
            r7 = move-exception
            r10 = 3
            java.lang.String r12 = "Downsampler"
            boolean r10 = android.util.Log.isLoggable(r12, r10)
            if (r10 == 0) goto L3a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r13 = "Cannot determine whether the image has alpha or not from header, format "
            r10.append(r13)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            android.util.Log.d(r12, r8, r7)
        L3a:
            if (r9 == 0) goto L3f
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            goto L41
        L3f:
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.RGB_565
        L41:
            r11.inPreferredConfig = r7
            android.graphics.Bitmap$Config r8 = android.graphics.Bitmap.Config.RGB_565
            if (r7 != r8) goto L4a
            r7 = 1
            r11.inDither = r7
        L4a:
            return
        L4b:
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            r11.inPreferredConfig = r7
            return
    }

    private static void calculateScaling(com.bumptech.glide.load.ImageHeaderParser.ImageType r18, com.bumptech.glide.load.resource.bitmap.ImageReader r19, com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks r20, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r21, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r22, int r23, int r24, int r25, int r26, int r27, android.graphics.BitmapFactory.Options r28) throws java.io.IOException {
            r0 = r18
            r1 = r22
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r27
            r6 = r28
            java.lang.String r7 = "]"
            java.lang.String r8 = "Downsampler"
            java.lang.String r9 = "x"
            if (r2 <= 0) goto L1d8
            if (r3 > 0) goto L1b
            goto L1d8
        L1b:
            boolean r10 = isRotationRequired(r23)
            if (r10 == 0) goto L24
            r11 = r2
            r10 = r3
            goto L26
        L24:
            r10 = r2
            r11 = r3
        L26:
            float r12 = r1.getScaleFactor(r10, r11, r4, r5)
            r13 = 0
            int r13 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r13 <= 0) goto L197
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$SampleSizeRounding r7 = r1.getSampleSizeRounding(r10, r11, r4, r5)
            if (r7 == 0) goto L18f
            float r13 = (float) r10
            float r14 = r12 * r13
            double r14 = (double) r14
            int r14 = round(r14)
            float r15 = (float) r11
            float r2 = r12 * r15
            double r2 = (double) r2
            int r2 = round(r2)
            int r3 = r10 / r14
            int r2 = r11 / r2
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$SampleSizeRounding r14 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding.MEMORY
            if (r7 != r14) goto L52
            int r2 = java.lang.Math.max(r3, r2)
            goto L56
        L52:
            int r2 = java.lang.Math.min(r3, r2)
        L56:
            int r3 = android.os.Build.VERSION.SDK_INT
            r16 = r9
            r9 = 23
            if (r3 > r9) goto L6c
            java.util.Set<java.lang.String> r9 = com.bumptech.glide.load.resource.bitmap.Downsampler.NO_DOWNSAMPLE_PRE_N_MIME_TYPES
            r17 = r8
            java.lang.String r8 = r6.outMimeType
            boolean r8 = r9.contains(r8)
            if (r8 == 0) goto L6e
            r2 = 1
            goto L83
        L6c:
            r17 = r8
        L6e:
            int r2 = java.lang.Integer.highestOneBit(r2)
            r8 = 1
            int r2 = java.lang.Math.max(r8, r2)
            if (r7 != r14) goto L83
            float r7 = (float) r2
            r8 = 1065353216(0x3f800000, float:1.0)
            float r8 = r8 / r12
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 >= 0) goto L83
            int r2 = r2 << 1
        L83:
            r6.inSampleSize = r2
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG
            r8 = 0
            if (r0 != r7) goto La6
            r0 = 8
            int r0 = java.lang.Math.min(r2, r0)
            float r0 = (float) r0
            float r13 = r13 / r0
            double r9 = (double) r13
            double r9 = java.lang.Math.ceil(r9)
            int r3 = (int) r9
            float r15 = r15 / r0
            double r9 = (double) r15
            double r9 = java.lang.Math.ceil(r9)
            int r0 = (int) r9
            int r7 = r2 / 8
            if (r7 <= 0) goto L104
            int r3 = r3 / r7
            int r0 = r0 / r7
            goto L104
        La6:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG
            if (r0 == r7) goto Lf5
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A
            if (r0 != r7) goto Laf
            goto Lf5
        Laf:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP
            if (r0 == r7) goto Ld6
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A
            if (r0 != r7) goto Lb8
            goto Ld6
        Lb8:
            int r0 = r10 % r2
            if (r0 != 0) goto Lc6
            int r0 = r11 % r2
            if (r0 == 0) goto Lc1
            goto Lc6
        Lc1:
            int r3 = r10 / r2
            int r0 = r11 / r2
            goto L104
        Lc6:
            r0 = r19
            r3 = r20
            r7 = r21
            int[] r0 = getDimensions(r0, r6, r3, r7)
            r3 = r0[r8]
            r7 = 1
            r0 = r0[r7]
            goto L104
        Ld6:
            r0 = 24
            if (r3 < r0) goto Le6
            float r0 = (float) r2
            float r13 = r13 / r0
            int r3 = java.lang.Math.round(r13)
            float r15 = r15 / r0
            int r0 = java.lang.Math.round(r15)
            goto L104
        Le6:
            float r0 = (float) r2
            float r13 = r13 / r0
            double r9 = (double) r13
            double r9 = java.lang.Math.floor(r9)
            int r3 = (int) r9
            float r15 = r15 / r0
            double r9 = (double) r15
            double r9 = java.lang.Math.floor(r9)
            goto L103
        Lf5:
            float r0 = (float) r2
            float r13 = r13 / r0
            double r9 = (double) r13
            double r9 = java.lang.Math.floor(r9)
            int r3 = (int) r9
            float r15 = r15 / r0
            double r9 = (double) r15
            double r9 = java.lang.Math.floor(r9)
        L103:
            int r0 = (int) r9
        L104:
            float r1 = r1.getScaleFactor(r3, r0, r4, r5)
            double r9 = (double) r1
            int r1 = adjustTargetDensityForError(r9)
            r6.inTargetDensity = r1
            int r1 = getDensityMultiplier(r9)
            r6.inDensity = r1
            boolean r1 = isScaling(r28)
            if (r1 == 0) goto L11f
            r1 = 1
            r6.inScaled = r1
            goto L123
        L11f:
            r6.inTargetDensity = r8
            r6.inDensity = r8
        L123:
            r1 = 2
            r8 = r17
            boolean r1 = android.util.Log.isLoggable(r8, r1)
            if (r1 == 0) goto L18e
            java.lang.String r1 = "Calculate scaling, source: ["
            java.lang.String r7 = "], degreesToRotate: "
            r11 = r24
            r13 = r25
            r14 = r16
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r11, r14, r13, r7)
            r7 = r23
            r1.append(r7)
            java.lang.String r7 = ", target: ["
            r1.append(r7)
            r1.append(r4)
            r1.append(r14)
            r1.append(r5)
            java.lang.String r4 = "], power of two scaled: ["
            r1.append(r4)
            r1.append(r3)
            r1.append(r14)
            r1.append(r0)
            java.lang.String r0 = "], exact scale factor: "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = ", power of 2 sample size: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", adjusted scale factor: "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = ", target density: "
            r1.append(r0)
            int r0 = r6.inTargetDensity
            r1.append(r0)
            java.lang.String r0 = ", density: "
            r1.append(r0)
            int r0 = r6.inDensity
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.v(r8, r0)
        L18e:
            return
        L18f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot round with null rounding"
            r0.<init>(r1)
            throw r0
        L197:
            r11 = r2
            r13 = r3
            r14 = r9
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Cannot scale with factor: "
            r2.append(r3)
            r2.append(r12)
            java.lang.String r3 = " from: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = ", source: ["
            r2.append(r1)
            r2.append(r11)
            r2.append(r14)
            r2.append(r13)
            java.lang.String r1 = "], target: ["
            r2.append(r1)
            r2.append(r4)
            r2.append(r14)
            r2.append(r5)
            r2.append(r7)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L1d8:
            r14 = r9
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r8, r1)
            if (r1 == 0) goto L205
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to determine dimensions for: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = " with target ["
            r1.append(r0)
            r1.append(r4)
            r1.append(r14)
            r1.append(r5)
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            android.util.Log.d(r8, r0)
        L205:
            return
    }

    private com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> decode(com.bumptech.glide.load.resource.bitmap.ImageReader r16, int r17, int r18, com.bumptech.glide.load.Options r19, com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks r20) throws java.io.IOException {
            r15 = this;
            r12 = r15
            r0 = r19
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r1 = r12.byteArrayPool
            java.lang.Class<byte[]> r2 = byte[].class
            r3 = 65536(0x10000, float:9.1835E-41)
            java.lang.Object r1 = r1.get(r3, r2)
            r13 = r1
            byte[] r13 = (byte[]) r13
            android.graphics.BitmapFactory$Options r14 = getDefaultOptions()
            r14.inTempStorage = r13
            com.bumptech.glide.load.Option<com.bumptech.glide.load.DecodeFormat> r1 = com.bumptech.glide.load.resource.bitmap.Downsampler.DECODE_FORMAT
            java.lang.Object r1 = r0.get(r1)
            r5 = r1
            com.bumptech.glide.load.DecodeFormat r5 = (com.bumptech.glide.load.DecodeFormat) r5
            com.bumptech.glide.load.Option<com.bumptech.glide.load.PreferredColorSpace> r1 = com.bumptech.glide.load.resource.bitmap.Downsampler.PREFERRED_COLOR_SPACE
            java.lang.Object r1 = r0.get(r1)
            r6 = r1
            com.bumptech.glide.load.PreferredColorSpace r6 = (com.bumptech.glide.load.PreferredColorSpace) r6
            com.bumptech.glide.load.Option<com.bumptech.glide.load.resource.bitmap.DownsampleStrategy> r1 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.OPTION
            java.lang.Object r1 = r0.get(r1)
            r4 = r1
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r4 = (com.bumptech.glide.load.resource.bitmap.DownsampleStrategy) r4
            com.bumptech.glide.load.Option<java.lang.Boolean> r1 = com.bumptech.glide.load.resource.bitmap.Downsampler.FIX_BITMAP_SIZE_TO_REQUESTED_DIMENSIONS
            java.lang.Object r1 = r0.get(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r10 = r1.booleanValue()
            com.bumptech.glide.load.Option<java.lang.Boolean> r1 = com.bumptech.glide.load.resource.bitmap.Downsampler.ALLOW_HARDWARE_CONFIG
            java.lang.Object r2 = r0.get(r1)
            if (r2 == 0) goto L54
            java.lang.Object r0 = r0.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L54
            r0 = 1
            r7 = 1
            goto L56
        L54:
            r0 = 0
            r7 = 0
        L56:
            r1 = r15
            r2 = r16
            r3 = r14
            r8 = r17
            r9 = r18
            r11 = r20
            android.graphics.Bitmap r0 = r1.decodeFromWrappedStreams(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L73
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r1 = r12.bitmapPool     // Catch: java.lang.Throwable -> L73
            com.bumptech.glide.load.resource.bitmap.BitmapResource r0 = com.bumptech.glide.load.resource.bitmap.BitmapResource.obtain(r0, r1)     // Catch: java.lang.Throwable -> L73
            releaseOptions(r14)
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r1 = r12.byteArrayPool
            r1.put(r13)
            return r0
        L73:
            r0 = move-exception
            releaseOptions(r14)
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r1 = r12.byteArrayPool
            r1.put(r13)
            throw r0
    }

    private android.graphics.Bitmap decodeFromWrappedStreams(com.bumptech.glide.load.resource.bitmap.ImageReader r28, android.graphics.BitmapFactory.Options r29, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r30, com.bumptech.glide.load.DecodeFormat r31, com.bumptech.glide.load.PreferredColorSpace r32, boolean r33, int r34, int r35, boolean r36, com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks r37) throws java.io.IOException {
            r27 = this;
            r8 = r27
            r7 = r28
            r6 = r29
            r5 = r37
            long r20 = com.bumptech.glide.util.LogTime.getLogTime()
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r0 = r8.bitmapPool
            int[] r0 = getDimensions(r7, r6, r5, r0)
            r22 = 0
            r4 = r0[r22]
            r1 = 1
            r3 = r0[r1]
            java.lang.String r2 = r6.outMimeType
            r0 = -1
            if (r4 == r0) goto L24
            if (r3 != r0) goto L21
            goto L24
        L21:
            r23 = r33
            goto L27
        L24:
            r0 = 0
            r23 = 0
        L27:
            int r1 = r28.getImageOrientation()
            int r14 = com.bumptech.glide.load.resource.bitmap.TransformationUtils.getExifOrientationDegrees(r1)
            boolean r24 = com.bumptech.glide.load.resource.bitmap.TransformationUtils.isExifOrientationRequired(r1)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r15 = r34
            if (r15 != r0) goto L47
            boolean r9 = isRotationRequired(r14)
            r13 = r35
            if (r9 == 0) goto L44
            r25 = r3
            goto L4b
        L44:
            r25 = r4
            goto L4b
        L47:
            r13 = r35
            r25 = r15
        L4b:
            if (r13 != r0) goto L59
            boolean r0 = isRotationRequired(r14)
            if (r0 == 0) goto L56
            r26 = r4
            goto L5b
        L56:
            r26 = r3
            goto L5b
        L59:
            r26 = r13
        L5b:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = r28.getImageType()
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r12 = r8.bitmapPool
            r9 = r0
            r10 = r28
            r11 = r37
            r13 = r30
            r15 = r4
            r16 = r3
            r17 = r25
            r18 = r26
            r19 = r29
            calculateScaling(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0 = r27
            r15 = r1
            r1 = r28
            r11 = r2
            r2 = r31
            r10 = r3
            r3 = r23
            r12 = r4
            r4 = r24
            r13 = r5
            r5 = r29
            r14 = r6
            r6 = r25
            r30 = r15
            r15 = r7
            r7 = r26
            r0.calculateConfig(r1, r2, r3, r4, r5, r6, r7)
            int r0 = android.os.Build.VERSION.SDK_INT
            int r1 = r14.inSampleSize
            boolean r1 = r8.shouldUsePool(r9)
            java.lang.String r2 = "Downsampler"
            if (r1 == 0) goto L127
            if (r12 < 0) goto La7
            if (r10 < 0) goto La7
            if (r36 == 0) goto La7
            r4 = r25
            r5 = r26
            goto L11e
        La7:
            boolean r1 = isScaling(r29)
            if (r1 == 0) goto Lb5
            int r1 = r14.inTargetDensity
            float r1 = (float) r1
            int r3 = r14.inDensity
            float r3 = (float) r3
            float r1 = r1 / r3
            goto Lb7
        Lb5:
            r1 = 1065353216(0x3f800000, float:1.0)
        Lb7:
            int r3 = r14.inSampleSize
            float r4 = (float) r12
            float r5 = (float) r3
            float r4 = r4 / r5
            double r6 = (double) r4
            double r6 = java.lang.Math.ceil(r6)
            int r4 = (int) r6
            float r6 = (float) r10
            float r6 = r6 / r5
            double r5 = (double) r6
            double r5 = java.lang.Math.ceil(r5)
            int r5 = (int) r5
            float r4 = (float) r4
            float r4 = r4 * r1
            int r4 = java.lang.Math.round(r4)
            float r5 = (float) r5
            float r5 = r5 * r1
            int r5 = java.lang.Math.round(r5)
            r6 = 2
            boolean r6 = android.util.Log.isLoggable(r2, r6)
            if (r6 == 0) goto L11e
            java.lang.String r6 = "Calculated target ["
            java.lang.String r7 = "x"
            java.lang.String r9 = "] for source ["
            java.lang.StringBuilder r6 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6, r4, r7, r5, r9)
            r6.append(r12)
            r6.append(r7)
            r6.append(r10)
            java.lang.String r7 = "], sampleSize: "
            r6.append(r7)
            r6.append(r3)
            java.lang.String r3 = ", targetDensity: "
            r6.append(r3)
            int r3 = r14.inTargetDensity
            r6.append(r3)
            java.lang.String r3 = ", density: "
            r6.append(r3)
            int r3 = r14.inDensity
            r6.append(r3)
            java.lang.String r3 = ", density multiplier: "
            r6.append(r3)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            android.util.Log.v(r2, r1)
        L11e:
            if (r4 <= 0) goto L127
            if (r5 <= 0) goto L127
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r1 = r8.bitmapPool
            setInBitmap(r14, r1, r4, r5)
        L127:
            r1 = 28
            if (r0 < r1) goto L14b
            com.bumptech.glide.load.PreferredColorSpace r0 = com.bumptech.glide.load.PreferredColorSpace.DISPLAY_P3
            r1 = r32
            if (r1 != r0) goto L13d
            android.graphics.ColorSpace r0 = r14.outColorSpace
            if (r0 == 0) goto L13d
            boolean r0 = r0.isWideGamut()
            if (r0 == 0) goto L13d
            r22 = 1
        L13d:
            if (r22 == 0) goto L142
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.DISPLAY_P3
            goto L144
        L142:
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.SRGB
        L144:
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            r14.inPreferredColorSpace = r0
            goto L157
        L14b:
            r1 = 26
            if (r0 < r1) goto L157
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.SRGB
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            r14.inPreferredColorSpace = r0
        L157:
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r0 = r8.bitmapPool
            android.graphics.Bitmap r0 = decodeStream(r15, r14, r13, r0)
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r1 = r8.bitmapPool
            r13.onDecodeComplete(r1, r0)
            r1 = 2
            boolean r1 = android.util.Log.isLoggable(r2, r1)
            if (r1 == 0) goto L179
            r9 = r12
            r12 = r29
            r13 = r0
            r14 = r34
            r1 = r30
            r15 = r35
            r16 = r20
            logDecode(r9, r10, r11, r12, r13, r14, r15, r16)
            goto L17b
        L179:
            r1 = r30
        L17b:
            r2 = 0
            if (r0 == 0) goto L196
            android.util.DisplayMetrics r2 = r8.displayMetrics
            int r2 = r2.densityDpi
            r0.setDensity(r2)
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r2 = r8.bitmapPool
            android.graphics.Bitmap r2 = com.bumptech.glide.load.resource.bitmap.TransformationUtils.rotateImageExif(r2, r0, r1)
            boolean r1 = r0.equals(r2)
            if (r1 != 0) goto L196
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r1 = r8.bitmapPool
            r1.put(r0)
        L196:
            return r2
    }

    private static android.graphics.Bitmap decodeStream(com.bumptech.glide.load.resource.bitmap.ImageReader r5, android.graphics.BitmapFactory.Options r6, com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks r7, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r8) throws java.io.IOException {
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto Lc
            r7.onObtainBounds()
            r5.stopGrowingBuffers()
        Lc:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = com.bumptech.glide.load.resource.bitmap.TransformationUtils.getBitmapDrawableLock()
            r4.lock()
            android.graphics.Bitmap r5 = r5.decodeBitmap(r6)     // Catch: java.lang.Throwable -> L25 java.lang.IllegalArgumentException -> L27
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.TransformationUtils.getBitmapDrawableLock()
            r6.unlock()
            return r5
        L25:
            r5 = move-exception
            goto L50
        L27:
            r4 = move-exception
            java.io.IOException r1 = newIoExceptionForInBitmapAssertion(r4, r1, r2, r3, r6)     // Catch: java.lang.Throwable -> L25
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L38
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch: java.lang.Throwable -> L25
        L38:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L4f
            r8.put(r0)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4e
            r0 = 0
            r6.inBitmap = r0     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4e
            android.graphics.Bitmap r5 = decodeStream(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4e
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.TransformationUtils.getBitmapDrawableLock()
            r6.unlock()
            return r5
        L4e:
            throw r1     // Catch: java.lang.Throwable -> L25
        L4f:
            throw r1     // Catch: java.lang.Throwable -> L25
        L50:
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.TransformationUtils.getBitmapDrawableLock()
            r6.unlock()
            throw r5
    }

    @androidx.annotation.Nullable
    @android.annotation.TargetApi(19)
    private static java.lang.String getBitmapString(android.graphics.Bitmap r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            java.lang.String r0 = " ("
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            int r1 = r3.getAllocationByteCount()
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "["
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            int r2 = r3.getWidth()
            r1.append(r2)
            java.lang.String r2 = "x"
            r1.append(r2)
            int r2 = r3.getHeight()
            r1.append(r2)
            java.lang.String r2 = "] "
            r1.append(r2)
            android.graphics.Bitmap$Config r3 = r3.getConfig()
            r1.append(r3)
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            return r3
    }

    private static synchronized android.graphics.BitmapFactory.Options getDefaultOptions() {
            java.lang.Class<com.bumptech.glide.load.resource.bitmap.Downsampler> r0 = com.bumptech.glide.load.resource.bitmap.Downsampler.class
            monitor-enter(r0)
            java.util.Queue<android.graphics.BitmapFactory$Options> r1 = com.bumptech.glide.load.resource.bitmap.Downsampler.OPTIONS_QUEUE     // Catch: java.lang.Throwable -> L1c
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r2 = r1.poll()     // Catch: java.lang.Throwable -> L19
            android.graphics.BitmapFactory$Options r2 = (android.graphics.BitmapFactory.Options) r2     // Catch: java.lang.Throwable -> L19
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L19
            if (r2 != 0) goto L17
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L1c
            r2.<init>()     // Catch: java.lang.Throwable -> L1c
            resetOptions(r2)     // Catch: java.lang.Throwable -> L1c
        L17:
            monitor-exit(r0)
            return r2
        L19:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L19
            throw r2     // Catch: java.lang.Throwable -> L1c
        L1c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    private static int getDensityMultiplier(double r3) {
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 > 0) goto L7
            goto L9
        L7:
            double r3 = r0 / r3
        L9:
            r0 = 4746794007244308480(0x41dfffffffc00000, double:2.147483647E9)
            double r3 = r3 * r0
            long r3 = java.lang.Math.round(r3)
            int r4 = (int) r3
            return r4
    }

    private static int[] getDimensions(com.bumptech.glide.load.resource.bitmap.ImageReader r1, android.graphics.BitmapFactory.Options r2, com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks r3, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r4) throws java.io.IOException {
            r0 = 1
            r2.inJustDecodeBounds = r0
            decodeStream(r1, r2, r3, r4)
            r1 = 0
            r2.inJustDecodeBounds = r1
            r3 = 2
            int[] r3 = new int[r3]
            int r4 = r2.outWidth
            r3[r1] = r4
            int r1 = r2.outHeight
            r3[r0] = r1
            return r3
    }

    private static java.lang.String getInBitmapString(android.graphics.BitmapFactory.Options r0) {
            android.graphics.Bitmap r0 = r0.inBitmap
            java.lang.String r0 = getBitmapString(r0)
            return r0
    }

    private static boolean isRotationRequired(int r1) {
            r0 = 90
            if (r1 == r0) goto Lb
            r0 = 270(0x10e, float:3.78E-43)
            if (r1 != r0) goto L9
            goto Lb
        L9:
            r1 = 0
            goto Lc
        Lb:
            r1 = 1
        Lc:
            return r1
    }

    private static boolean isScaling(android.graphics.BitmapFactory.Options r1) {
            int r0 = r1.inTargetDensity
            if (r0 <= 0) goto Lc
            int r1 = r1.inDensity
            if (r1 <= 0) goto Lc
            if (r0 == r1) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            return r1
    }

    private static void logDecode(int r1, int r2, java.lang.String r3, android.graphics.BitmapFactory.Options r4, android.graphics.Bitmap r5, int r6, int r7, long r8) {
            java.lang.String r0 = "Decoded "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r5 = getBitmapString(r5)
            r0.append(r5)
            java.lang.String r5 = " from ["
            r0.append(r5)
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = "] "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = " with inBitmap "
            r0.append(r2)
            java.lang.String r2 = getInBitmapString(r4)
            r0.append(r2)
            java.lang.String r2 = " for ["
            r0.append(r2)
            r0.append(r6)
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = "], sample size: "
            r0.append(r1)
            int r1 = r4.inSampleSize
            r0.append(r1)
            java.lang.String r1 = ", density: "
            r0.append(r1)
            int r1 = r4.inDensity
            r0.append(r1)
            java.lang.String r1 = ", target density: "
            r0.append(r1)
            int r1 = r4.inTargetDensity
            r0.append(r1)
            java.lang.String r1 = ", thread: "
            r0.append(r1)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = ", duration: "
            r0.append(r1)
            double r1 = com.bumptech.glide.util.LogTime.getElapsedMillis(r8)
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            java.lang.String r2 = "Downsampler"
            android.util.Log.v(r2, r1)
            return
    }

    private static java.io.IOException newIoExceptionForInBitmapAssertion(java.lang.IllegalArgumentException r4, int r5, int r6, java.lang.String r7, android.graphics.BitmapFactory.Options r8) {
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Exception decoding bitmap, outWidth: "
            java.lang.String r2 = ", outHeight: "
            java.lang.String r3 = ", outMimeType: "
            java.lang.StringBuilder r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r5, r2, r6, r3)
            r5.append(r7)
            java.lang.String r6 = ", inBitmap: "
            r5.append(r6)
            java.lang.String r6 = getInBitmapString(r8)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r0.<init>(r5, r4)
            return r0
    }

    private static void releaseOptions(android.graphics.BitmapFactory.Options r1) {
            resetOptions(r1)
            java.util.Queue<android.graphics.BitmapFactory$Options> r0 = com.bumptech.glide.load.resource.bitmap.Downsampler.OPTIONS_QUEUE
            monitor-enter(r0)
            r0.offer(r1)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    private static void resetOptions(android.graphics.BitmapFactory.Options r5) {
            r0 = 0
            r5.inTempStorage = r0
            r1 = 0
            r5.inDither = r1
            r5.inScaled = r1
            r2 = 1
            r5.inSampleSize = r2
            r5.inPreferredConfig = r0
            r5.inJustDecodeBounds = r1
            r5.inDensity = r1
            r5.inTargetDensity = r1
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r3 < r4) goto L1f
            r5.inPreferredColorSpace = r0
            r5.outColorSpace = r0
            r5.outConfig = r0
        L1f:
            r5.outWidth = r1
            r5.outHeight = r1
            r5.outMimeType = r0
            r5.inBitmap = r0
            r5.inMutable = r2
            return
    }

    private static int round(double r2) {
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r2 = r2 + r0
            int r2 = (int) r2
            return r2
    }

    @android.annotation.TargetApi(26)
    private static void setInBitmap(android.graphics.BitmapFactory.Options r2, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r3, int r4, int r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L10
            android.graphics.Bitmap$Config r0 = r2.inPreferredConfig
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.HARDWARE
            if (r0 != r1) goto Ld
            return
        Ld:
            android.graphics.Bitmap$Config r0 = r2.outConfig
            goto L11
        L10:
            r0 = 0
        L11:
            if (r0 != 0) goto L15
            android.graphics.Bitmap$Config r0 = r2.inPreferredConfig
        L15:
            android.graphics.Bitmap r3 = r3.getDirty(r4, r5, r0)
            r2.inBitmap = r3
            return
    }

    private boolean shouldUsePool(com.bumptech.glide.load.ImageHeaderParser.ImageType r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    @androidx.annotation.RequiresApi(21)
    public com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> decode(android.os.ParcelFileDescriptor r7, int r8, int r9, com.bumptech.glide.load.Options r10) throws java.io.IOException {
            r6 = this;
            com.bumptech.glide.load.resource.bitmap.ImageReader$ParcelFileDescriptorImageReader r1 = new com.bumptech.glide.load.resource.bitmap.ImageReader$ParcelFileDescriptorImageReader
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r6.parsers
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r2 = r6.byteArrayPool
            r1.<init>(r7, r0, r2)
            com.bumptech.glide.load.resource.bitmap.Downsampler$DecodeCallbacks r5 = com.bumptech.glide.load.resource.bitmap.Downsampler.EMPTY_CALLBACKS
            r0 = r6
            r2 = r8
            r3 = r9
            r4 = r10
            com.bumptech.glide.load.engine.Resource r7 = r0.decode(r1, r2, r3, r4, r5)
            return r7
    }

    public com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> decode(java.io.InputStream r7, int r8, int r9, com.bumptech.glide.load.Options r10) throws java.io.IOException {
            r6 = this;
            com.bumptech.glide.load.resource.bitmap.Downsampler$DecodeCallbacks r5 = com.bumptech.glide.load.resource.bitmap.Downsampler.EMPTY_CALLBACKS
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            com.bumptech.glide.load.engine.Resource r7 = r0.decode(r1, r2, r3, r4, r5)
            return r7
    }

    public com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> decode(java.io.InputStream r7, int r8, int r9, com.bumptech.glide.load.Options r10, com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks r11) throws java.io.IOException {
            r6 = this;
            com.bumptech.glide.load.resource.bitmap.ImageReader$InputStreamImageReader r1 = new com.bumptech.glide.load.resource.bitmap.ImageReader$InputStreamImageReader
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r6.parsers
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r2 = r6.byteArrayPool
            r1.<init>(r7, r0, r2)
            r0 = r6
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            com.bumptech.glide.load.engine.Resource r7 = r0.decode(r1, r2, r3, r4, r5)
            return r7
    }

    public boolean handles(android.os.ParcelFileDescriptor r1) {
            r0 = this;
            boolean r1 = com.bumptech.glide.load.data.ParcelFileDescriptorRewinder.isSupported()
            return r1
    }

    public boolean handles(java.io.InputStream r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    public boolean handles(java.nio.ByteBuffer r1) {
            r0 = this;
            r1 = 1
            return r1
    }
}
