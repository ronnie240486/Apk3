package com.bumptech.glide.request;

import com.bumptech.glide.request.BaseRequestOptions;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseRequestOptions<T extends com.bumptech.glide.request.BaseRequestOptions<T>> implements java.lang.Cloneable {
    private static final int DISK_CACHE_STRATEGY = 4;
    private static final int ERROR_ID = 32;
    private static final int ERROR_PLACEHOLDER = 16;
    private static final int FALLBACK = 8192;
    private static final int FALLBACK_ID = 16384;
    private static final int IS_CACHEABLE = 256;
    private static final int ONLY_RETRIEVE_FROM_CACHE = 524288;
    private static final int OVERRIDE = 512;
    private static final int PLACEHOLDER = 64;
    private static final int PLACEHOLDER_ID = 128;
    private static final int PRIORITY = 8;
    private static final int RESOURCE_CLASS = 4096;
    private static final int SIGNATURE = 1024;
    private static final int SIZE_MULTIPLIER = 2;
    private static final int THEME = 32768;
    private static final int TRANSFORMATION = 2048;
    private static final int TRANSFORMATION_ALLOWED = 65536;
    private static final int TRANSFORMATION_REQUIRED = 131072;
    private static final int UNSET = -1;
    private static final int USE_ANIMATION_POOL = 1048576;
    private static final int USE_UNLIMITED_SOURCE_GENERATORS_POOL = 262144;

    @androidx.annotation.NonNull
    private com.bumptech.glide.load.engine.DiskCacheStrategy diskCacheStrategy;
    private int errorId;

    @androidx.annotation.Nullable
    private android.graphics.drawable.Drawable errorPlaceholder;

    @androidx.annotation.Nullable
    private android.graphics.drawable.Drawable fallbackDrawable;
    private int fallbackId;
    private int fields;
    private boolean isAutoCloneEnabled;
    private boolean isCacheable;
    private boolean isLocked;
    private boolean isScaleOnlyOrNoTransform;
    private boolean isTransformationAllowed;
    private boolean isTransformationRequired;
    private boolean onlyRetrieveFromCache;

    @androidx.annotation.NonNull
    private com.bumptech.glide.load.Options options;
    private int overrideHeight;
    private int overrideWidth;

    @androidx.annotation.Nullable
    private android.graphics.drawable.Drawable placeholderDrawable;
    private int placeholderId;

    @androidx.annotation.NonNull
    private com.bumptech.glide.Priority priority;

    @androidx.annotation.NonNull
    private java.lang.Class<?> resourceClass;

    @androidx.annotation.NonNull
    private com.bumptech.glide.load.Key signature;
    private float sizeMultiplier;

    @androidx.annotation.Nullable
    private android.content.res.Resources.Theme theme;

    @androidx.annotation.NonNull
    private java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.Transformation<?>> transformations;
    private boolean useAnimationPool;
    private boolean useUnlimitedSourceGeneratorsPool;

    public BaseRequestOptions() {
            r2 = this;
            r2.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.sizeMultiplier = r0
            com.bumptech.glide.load.engine.DiskCacheStrategy r0 = com.bumptech.glide.load.engine.DiskCacheStrategy.AUTOMATIC
            r2.diskCacheStrategy = r0
            com.bumptech.glide.Priority r0 = com.bumptech.glide.Priority.NORMAL
            r2.priority = r0
            r0 = 1
            r2.isCacheable = r0
            r1 = -1
            r2.overrideHeight = r1
            r2.overrideWidth = r1
            com.bumptech.glide.signature.EmptySignature r1 = com.bumptech.glide.signature.EmptySignature.obtain()
            r2.signature = r1
            r2.isTransformationAllowed = r0
            com.bumptech.glide.load.Options r1 = new com.bumptech.glide.load.Options
            r1.<init>()
            r2.options = r1
            com.bumptech.glide.util.CachedHashCodeArrayMap r1 = new com.bumptech.glide.util.CachedHashCodeArrayMap
            r1.<init>()
            r2.transformations = r1
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r2.resourceClass = r1
            r2.isScaleOnlyOrNoTransform = r0
            return
    }

    private boolean isSet(int r2) {
            r1 = this;
            int r0 = r1.fields
            boolean r2 = isSet(r0, r2)
            return r2
    }

    private static boolean isSet(int r0, int r1) {
            r0 = r0 & r1
            if (r0 == 0) goto L5
            r0 = 1
            goto L6
        L5:
            r0 = 0
        L6:
            return r0
    }

    @androidx.annotation.NonNull
    private T optionalScaleOnlyTransform(@androidx.annotation.NonNull com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r2, @androidx.annotation.NonNull com.bumptech.glide.load.Transformation<android.graphics.Bitmap> r3) {
            r1 = this;
            r0 = 0
            com.bumptech.glide.request.BaseRequestOptions r2 = r1.scaleOnlyTransform(r2, r3, r0)
            return r2
    }

    @androidx.annotation.NonNull
    private T scaleOnlyTransform(@androidx.annotation.NonNull com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r2, @androidx.annotation.NonNull com.bumptech.glide.load.Transformation<android.graphics.Bitmap> r3) {
            r1 = this;
            r0 = 1
            com.bumptech.glide.request.BaseRequestOptions r2 = r1.scaleOnlyTransform(r2, r3, r0)
            return r2
    }

    @androidx.annotation.NonNull
    private T scaleOnlyTransform(@androidx.annotation.NonNull com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r1, @androidx.annotation.NonNull com.bumptech.glide.load.Transformation<android.graphics.Bitmap> r2, boolean r3) {
            r0 = this;
            if (r3 == 0) goto L7
            com.bumptech.glide.request.BaseRequestOptions r1 = r0.transform(r1, r2)
            goto Lb
        L7:
            com.bumptech.glide.request.BaseRequestOptions r1 = r0.optionalTransform(r1, r2)
        Lb:
            r2 = 1
            r1.isScaleOnlyOrNoTransform = r2
            return r1
    }

    private T self() {
            r0 = this;
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T apply(@androidx.annotation.NonNull com.bumptech.glide.request.BaseRequestOptions<?> r5) {
            r4 = this;
            boolean r0 = r4.isAutoCloneEnabled
            if (r0 == 0) goto Ld
            com.bumptech.glide.request.BaseRequestOptions r0 = r4.clone()
            com.bumptech.glide.request.BaseRequestOptions r5 = r0.apply(r5)
            return r5
        Ld:
            int r0 = r5.fields
            r1 = 2
            boolean r0 = isSet(r0, r1)
            if (r0 == 0) goto L1a
            float r0 = r5.sizeMultiplier
            r4.sizeMultiplier = r0
        L1a:
            int r0 = r5.fields
            r1 = 262144(0x40000, float:3.67342E-40)
            boolean r0 = isSet(r0, r1)
            if (r0 == 0) goto L28
            boolean r0 = r5.useUnlimitedSourceGeneratorsPool
            r4.useUnlimitedSourceGeneratorsPool = r0
        L28:
            int r0 = r5.fields
            r1 = 1048576(0x100000, float:1.469368E-39)
            boolean r0 = isSet(r0, r1)
            if (r0 == 0) goto L36
            boolean r0 = r5.useAnimationPool
            r4.useAnimationPool = r0
        L36:
            int r0 = r5.fields
            r1 = 4
            boolean r0 = isSet(r0, r1)
            if (r0 == 0) goto L43
            com.bumptech.glide.load.engine.DiskCacheStrategy r0 = r5.diskCacheStrategy
            r4.diskCacheStrategy = r0
        L43:
            int r0 = r5.fields
            r1 = 8
            boolean r0 = isSet(r0, r1)
            if (r0 == 0) goto L51
            com.bumptech.glide.Priority r0 = r5.priority
            r4.priority = r0
        L51:
            int r0 = r5.fields
            r1 = 16
            boolean r0 = isSet(r0, r1)
            r1 = 0
            if (r0 == 0) goto L68
            android.graphics.drawable.Drawable r0 = r5.errorPlaceholder
            r4.errorPlaceholder = r0
            r4.errorId = r1
            int r0 = r4.fields
            r0 = r0 & (-33)
            r4.fields = r0
        L68:
            int r0 = r5.fields
            r2 = 32
            boolean r0 = isSet(r0, r2)
            r2 = 0
            if (r0 == 0) goto L7f
            int r0 = r5.errorId
            r4.errorId = r0
            r4.errorPlaceholder = r2
            int r0 = r4.fields
            r0 = r0 & (-17)
            r4.fields = r0
        L7f:
            int r0 = r5.fields
            r3 = 64
            boolean r0 = isSet(r0, r3)
            if (r0 == 0) goto L95
            android.graphics.drawable.Drawable r0 = r5.placeholderDrawable
            r4.placeholderDrawable = r0
            r4.placeholderId = r1
            int r0 = r4.fields
            r0 = r0 & (-129(0xffffffffffffff7f, float:NaN))
            r4.fields = r0
        L95:
            int r0 = r5.fields
            r3 = 128(0x80, float:1.8E-43)
            boolean r0 = isSet(r0, r3)
            if (r0 == 0) goto Lab
            int r0 = r5.placeholderId
            r4.placeholderId = r0
            r4.placeholderDrawable = r2
            int r0 = r4.fields
            r0 = r0 & (-65)
            r4.fields = r0
        Lab:
            int r0 = r5.fields
            r3 = 256(0x100, float:3.59E-43)
            boolean r0 = isSet(r0, r3)
            if (r0 == 0) goto Lb9
            boolean r0 = r5.isCacheable
            r4.isCacheable = r0
        Lb9:
            int r0 = r5.fields
            r3 = 512(0x200, float:7.17E-43)
            boolean r0 = isSet(r0, r3)
            if (r0 == 0) goto Lcb
            int r0 = r5.overrideWidth
            r4.overrideWidth = r0
            int r0 = r5.overrideHeight
            r4.overrideHeight = r0
        Lcb:
            int r0 = r5.fields
            r3 = 1024(0x400, float:1.435E-42)
            boolean r0 = isSet(r0, r3)
            if (r0 == 0) goto Ld9
            com.bumptech.glide.load.Key r0 = r5.signature
            r4.signature = r0
        Ld9:
            int r0 = r5.fields
            r3 = 4096(0x1000, float:5.74E-42)
            boolean r0 = isSet(r0, r3)
            if (r0 == 0) goto Le7
            java.lang.Class<?> r0 = r5.resourceClass
            r4.resourceClass = r0
        Le7:
            int r0 = r5.fields
            r3 = 8192(0x2000, float:1.148E-41)
            boolean r0 = isSet(r0, r3)
            if (r0 == 0) goto Lfd
            android.graphics.drawable.Drawable r0 = r5.fallbackDrawable
            r4.fallbackDrawable = r0
            r4.fallbackId = r1
            int r0 = r4.fields
            r0 = r0 & (-16385(0xffffffffffffbfff, float:NaN))
            r4.fields = r0
        Lfd:
            int r0 = r5.fields
            r3 = 16384(0x4000, float:2.2959E-41)
            boolean r0 = isSet(r0, r3)
            if (r0 == 0) goto L113
            int r0 = r5.fallbackId
            r4.fallbackId = r0
            r4.fallbackDrawable = r2
            int r0 = r4.fields
            r0 = r0 & (-8193(0xffffffffffffdfff, float:NaN))
            r4.fields = r0
        L113:
            int r0 = r5.fields
            r2 = 32768(0x8000, float:4.5918E-41)
            boolean r0 = isSet(r0, r2)
            if (r0 == 0) goto L122
            android.content.res.Resources$Theme r0 = r5.theme
            r4.theme = r0
        L122:
            int r0 = r5.fields
            r2 = 65536(0x10000, float:9.1835E-41)
            boolean r0 = isSet(r0, r2)
            if (r0 == 0) goto L130
            boolean r0 = r5.isTransformationAllowed
            r4.isTransformationAllowed = r0
        L130:
            int r0 = r5.fields
            r2 = 131072(0x20000, float:1.83671E-40)
            boolean r0 = isSet(r0, r2)
            if (r0 == 0) goto L13e
            boolean r0 = r5.isTransformationRequired
            r4.isTransformationRequired = r0
        L13e:
            int r0 = r5.fields
            r2 = 2048(0x800, float:2.87E-42)
            boolean r0 = isSet(r0, r2)
            if (r0 == 0) goto L153
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.Transformation<?>> r0 = r4.transformations
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.Transformation<?>> r2 = r5.transformations
            r0.putAll(r2)
            boolean r0 = r5.isScaleOnlyOrNoTransform
            r4.isScaleOnlyOrNoTransform = r0
        L153:
            int r0 = r5.fields
            r2 = 524288(0x80000, float:7.34684E-40)
            boolean r0 = isSet(r0, r2)
            if (r0 == 0) goto L161
            boolean r0 = r5.onlyRetrieveFromCache
            r4.onlyRetrieveFromCache = r0
        L161:
            boolean r0 = r4.isTransformationAllowed
            if (r0 != 0) goto L179
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.Transformation<?>> r0 = r4.transformations
            r0.clear()
            int r0 = r4.fields
            r0 = r0 & (-2049(0xfffffffffffff7ff, float:NaN))
            r4.isTransformationRequired = r1
            r1 = -131073(0xfffffffffffdffff, float:NaN)
            r0 = r0 & r1
            r4.fields = r0
            r0 = 1
            r4.isScaleOnlyOrNoTransform = r0
        L179:
            int r0 = r4.fields
            int r1 = r5.fields
            r0 = r0 | r1
            r4.fields = r0
            com.bumptech.glide.load.Options r0 = r4.options
            com.bumptech.glide.load.Options r5 = r5.options
            r0.putAll(r5)
            com.bumptech.glide.request.BaseRequestOptions r5 = r4.selfOrThrowIfLocked()
            return r5
    }

    @androidx.annotation.NonNull
    public T autoClone() {
            r2 = this;
            boolean r0 = r2.isLocked
            if (r0 == 0) goto L11
            boolean r0 = r2.isAutoCloneEnabled
            if (r0 == 0) goto L9
            goto L11
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You cannot auto lock an already locked options object, try clone() first"
            r0.<init>(r1)
            throw r0
        L11:
            r0 = 1
            r2.isAutoCloneEnabled = r0
            com.bumptech.glide.request.BaseRequestOptions r0 = r2.lock()
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T centerCrop() {
            r2 = this;
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r0 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.CENTER_OUTSIDE
            com.bumptech.glide.load.resource.bitmap.CenterCrop r1 = new com.bumptech.glide.load.resource.bitmap.CenterCrop
            r1.<init>()
            com.bumptech.glide.request.BaseRequestOptions r0 = r2.transform(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T centerInside() {
            r2 = this;
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r0 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.CENTER_INSIDE
            com.bumptech.glide.load.resource.bitmap.CenterInside r1 = new com.bumptech.glide.load.resource.bitmap.CenterInside
            r1.<init>()
            com.bumptech.glide.request.BaseRequestOptions r0 = r2.scaleOnlyTransform(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T circleCrop() {
            r2 = this;
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r0 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.CENTER_INSIDE
            com.bumptech.glide.load.resource.bitmap.CircleCrop r1 = new com.bumptech.glide.load.resource.bitmap.CircleCrop
            r1.<init>()
            com.bumptech.glide.request.BaseRequestOptions r0 = r2.transform(r0, r1)
            return r0
    }

    @androidx.annotation.CheckResult
    public T clone() {
            r3 = this;
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L24
            com.bumptech.glide.request.BaseRequestOptions r0 = (com.bumptech.glide.request.BaseRequestOptions) r0     // Catch: java.lang.CloneNotSupportedException -> L24
            com.bumptech.glide.load.Options r1 = new com.bumptech.glide.load.Options     // Catch: java.lang.CloneNotSupportedException -> L24
            r1.<init>()     // Catch: java.lang.CloneNotSupportedException -> L24
            r0.options = r1     // Catch: java.lang.CloneNotSupportedException -> L24
            com.bumptech.glide.load.Options r2 = r3.options     // Catch: java.lang.CloneNotSupportedException -> L24
            r1.putAll(r2)     // Catch: java.lang.CloneNotSupportedException -> L24
            com.bumptech.glide.util.CachedHashCodeArrayMap r1 = new com.bumptech.glide.util.CachedHashCodeArrayMap     // Catch: java.lang.CloneNotSupportedException -> L24
            r1.<init>()     // Catch: java.lang.CloneNotSupportedException -> L24
            r0.transformations = r1     // Catch: java.lang.CloneNotSupportedException -> L24
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.Transformation<?>> r2 = r3.transformations     // Catch: java.lang.CloneNotSupportedException -> L24
            r1.putAll(r2)     // Catch: java.lang.CloneNotSupportedException -> L24
            r1 = 0
            r0.isLocked = r1     // Catch: java.lang.CloneNotSupportedException -> L24
            r0.isAutoCloneEnabled = r1     // Catch: java.lang.CloneNotSupportedException -> L24
            return r0
        L24:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    @androidx.annotation.CheckResult
    /* JADX INFO: renamed from: clone */
    public /* bridge */ /* synthetic */ java.lang.Object mo45clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.bumptech.glide.request.BaseRequestOptions r0 = r1.clone()
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T decode(@androidx.annotation.NonNull java.lang.Class<?> r2) {
            r1 = this;
            boolean r0 = r1.isAutoCloneEnabled
            if (r0 == 0) goto Ld
            com.bumptech.glide.request.BaseRequestOptions r0 = r1.clone()
            com.bumptech.glide.request.BaseRequestOptions r2 = r0.decode(r2)
            return r2
        Ld:
            java.lang.Object r2 = com.bumptech.glide.util.Preconditions.checkNotNull(r2)
            java.lang.Class r2 = (java.lang.Class) r2
            r1.resourceClass = r2
            int r2 = r1.fields
            r2 = r2 | 4096(0x1000, float:5.74E-42)
            r1.fields = r2
            com.bumptech.glide.request.BaseRequestOptions r2 = r1.selfOrThrowIfLocked()
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T disallowHardwareConfig() {
            r2 = this;
            com.bumptech.glide.load.Option<java.lang.Boolean> r0 = com.bumptech.glide.load.resource.bitmap.Downsampler.ALLOW_HARDWARE_CONFIG
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            com.bumptech.glide.request.BaseRequestOptions r0 = r2.set(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T diskCacheStrategy(@androidx.annotation.NonNull com.bumptech.glide.load.engine.DiskCacheStrategy r2) {
            r1 = this;
            boolean r0 = r1.isAutoCloneEnabled
            if (r0 == 0) goto Ld
            com.bumptech.glide.request.BaseRequestOptions r0 = r1.clone()
            com.bumptech.glide.request.BaseRequestOptions r2 = r0.diskCacheStrategy(r2)
            return r2
        Ld:
            java.lang.Object r2 = com.bumptech.glide.util.Preconditions.checkNotNull(r2)
            com.bumptech.glide.load.engine.DiskCacheStrategy r2 = (com.bumptech.glide.load.engine.DiskCacheStrategy) r2
            r1.diskCacheStrategy = r2
            int r2 = r1.fields
            r2 = r2 | 4
            r1.fields = r2
            com.bumptech.glide.request.BaseRequestOptions r2 = r1.selfOrThrowIfLocked()
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T dontAnimate() {
            r2 = this;
            com.bumptech.glide.load.Option<java.lang.Boolean> r0 = com.bumptech.glide.load.resource.gif.GifOptions.DISABLE_ANIMATION
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            com.bumptech.glide.request.BaseRequestOptions r0 = r2.set(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T dontTransform() {
            r3 = this;
            boolean r0 = r3.isAutoCloneEnabled
            if (r0 == 0) goto Ld
            com.bumptech.glide.request.BaseRequestOptions r0 = r3.clone()
            com.bumptech.glide.request.BaseRequestOptions r0 = r0.dontTransform()
            return r0
        Ld:
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.Transformation<?>> r0 = r3.transformations
            r0.clear()
            int r0 = r3.fields
            r0 = r0 & (-2049(0xfffffffffffff7ff, float:NaN))
            r1 = 0
            r3.isTransformationRequired = r1
            r2 = -131073(0xfffffffffffdffff, float:NaN)
            r0 = r0 & r2
            r3.isTransformationAllowed = r1
            r1 = 65536(0x10000, float:9.1835E-41)
            r0 = r0 | r1
            r3.fields = r0
            r0 = 1
            r3.isScaleOnlyOrNoTransform = r0
            com.bumptech.glide.request.BaseRequestOptions r0 = r3.selfOrThrowIfLocked()
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T downsample(@androidx.annotation.NonNull com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r2) {
            r1 = this;
            com.bumptech.glide.load.Option<com.bumptech.glide.load.resource.bitmap.DownsampleStrategy> r0 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.OPTION
            java.lang.Object r2 = com.bumptech.glide.util.Preconditions.checkNotNull(r2)
            com.bumptech.glide.request.BaseRequestOptions r2 = r1.set(r0, r2)
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T encodeFormat(@androidx.annotation.NonNull android.graphics.Bitmap.CompressFormat r2) {
            r1 = this;
            com.bumptech.glide.load.Option<android.graphics.Bitmap$CompressFormat> r0 = com.bumptech.glide.load.resource.bitmap.BitmapEncoder.COMPRESSION_FORMAT
            java.lang.Object r2 = com.bumptech.glide.util.Preconditions.checkNotNull(r2)
            com.bumptech.glide.request.BaseRequestOptions r2 = r1.set(r0, r2)
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T encodeQuality(@androidx.annotation.IntRange(from = 0, to = 100) int r2) {
            r1 = this;
            com.bumptech.glide.load.Option<java.lang.Integer> r0 = com.bumptech.glide.load.resource.bitmap.BitmapEncoder.COMPRESSION_QUALITY
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.bumptech.glide.request.BaseRequestOptions r2 = r1.set(r0, r2)
            return r2
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.bumptech.glide.request.BaseRequestOptions
            r1 = 0
            if (r0 == 0) goto Lae
            com.bumptech.glide.request.BaseRequestOptions r4 = (com.bumptech.glide.request.BaseRequestOptions) r4
            float r0 = r4.sizeMultiplier
            float r2 = r3.sizeMultiplier
            int r0 = java.lang.Float.compare(r0, r2)
            if (r0 != 0) goto Lae
            int r0 = r3.errorId
            int r2 = r4.errorId
            if (r0 != r2) goto Lae
            android.graphics.drawable.Drawable r0 = r3.errorPlaceholder
            android.graphics.drawable.Drawable r2 = r4.errorPlaceholder
            boolean r0 = com.bumptech.glide.util.Util.bothNullOrEqual(r0, r2)
            if (r0 == 0) goto Lae
            int r0 = r3.placeholderId
            int r2 = r4.placeholderId
            if (r0 != r2) goto Lae
            android.graphics.drawable.Drawable r0 = r3.placeholderDrawable
            android.graphics.drawable.Drawable r2 = r4.placeholderDrawable
            boolean r0 = com.bumptech.glide.util.Util.bothNullOrEqual(r0, r2)
            if (r0 == 0) goto Lae
            int r0 = r3.fallbackId
            int r2 = r4.fallbackId
            if (r0 != r2) goto Lae
            android.graphics.drawable.Drawable r0 = r3.fallbackDrawable
            android.graphics.drawable.Drawable r2 = r4.fallbackDrawable
            boolean r0 = com.bumptech.glide.util.Util.bothNullOrEqual(r0, r2)
            if (r0 == 0) goto Lae
            boolean r0 = r3.isCacheable
            boolean r2 = r4.isCacheable
            if (r0 != r2) goto Lae
            int r0 = r3.overrideHeight
            int r2 = r4.overrideHeight
            if (r0 != r2) goto Lae
            int r0 = r3.overrideWidth
            int r2 = r4.overrideWidth
            if (r0 != r2) goto Lae
            boolean r0 = r3.isTransformationRequired
            boolean r2 = r4.isTransformationRequired
            if (r0 != r2) goto Lae
            boolean r0 = r3.isTransformationAllowed
            boolean r2 = r4.isTransformationAllowed
            if (r0 != r2) goto Lae
            boolean r0 = r3.useUnlimitedSourceGeneratorsPool
            boolean r2 = r4.useUnlimitedSourceGeneratorsPool
            if (r0 != r2) goto Lae
            boolean r0 = r3.onlyRetrieveFromCache
            boolean r2 = r4.onlyRetrieveFromCache
            if (r0 != r2) goto Lae
            com.bumptech.glide.load.engine.DiskCacheStrategy r0 = r3.diskCacheStrategy
            com.bumptech.glide.load.engine.DiskCacheStrategy r2 = r4.diskCacheStrategy
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lae
            com.bumptech.glide.Priority r0 = r3.priority
            com.bumptech.glide.Priority r2 = r4.priority
            if (r0 != r2) goto Lae
            com.bumptech.glide.load.Options r0 = r3.options
            com.bumptech.glide.load.Options r2 = r4.options
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lae
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.Transformation<?>> r0 = r3.transformations
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.Transformation<?>> r2 = r4.transformations
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lae
            java.lang.Class<?> r0 = r3.resourceClass
            java.lang.Class<?> r2 = r4.resourceClass
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lae
            com.bumptech.glide.load.Key r0 = r3.signature
            com.bumptech.glide.load.Key r2 = r4.signature
            boolean r0 = com.bumptech.glide.util.Util.bothNullOrEqual(r0, r2)
            if (r0 == 0) goto Lae
            android.content.res.Resources$Theme r0 = r3.theme
            android.content.res.Resources$Theme r4 = r4.theme
            boolean r4 = com.bumptech.glide.util.Util.bothNullOrEqual(r0, r4)
            if (r4 == 0) goto Lae
            r1 = 1
        Lae:
            return r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T error(@androidx.annotation.DrawableRes int r2) {
            r1 = this;
            boolean r0 = r1.isAutoCloneEnabled
            if (r0 == 0) goto Ld
            com.bumptech.glide.request.BaseRequestOptions r0 = r1.clone()
            com.bumptech.glide.request.BaseRequestOptions r2 = r0.error(r2)
            return r2
        Ld:
            r1.errorId = r2
            int r2 = r1.fields
            r2 = r2 | 32
            r0 = 0
            r1.errorPlaceholder = r0
            r2 = r2 & (-17)
            r1.fields = r2
            com.bumptech.glide.request.BaseRequestOptions r2 = r1.selfOrThrowIfLocked()
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T error(@androidx.annotation.Nullable android.graphics.drawable.Drawable r2) {
            r1 = this;
            boolean r0 = r1.isAutoCloneEnabled
            if (r0 == 0) goto Ld
            com.bumptech.glide.request.BaseRequestOptions r0 = r1.clone()
            com.bumptech.glide.request.BaseRequestOptions r2 = r0.error(r2)
            return r2
        Ld:
            r1.errorPlaceholder = r2
            int r2 = r1.fields
            r2 = r2 | 16
            r0 = 0
            r1.errorId = r0
            r2 = r2 & (-33)
            r1.fields = r2
            com.bumptech.glide.request.BaseRequestOptions r2 = r1.selfOrThrowIfLocked()
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T fallback(@androidx.annotation.DrawableRes int r2) {
            r1 = this;
            boolean r0 = r1.isAutoCloneEnabled
            if (r0 == 0) goto Ld
            com.bumptech.glide.request.BaseRequestOptions r0 = r1.clone()
            com.bumptech.glide.request.BaseRequestOptions r2 = r0.fallback(r2)
            return r2
        Ld:
            r1.fallbackId = r2
            int r2 = r1.fields
            r2 = r2 | 16384(0x4000, float:2.2959E-41)
            r0 = 0
            r1.fallbackDrawable = r0
            r2 = r2 & (-8193(0xffffffffffffdfff, float:NaN))
            r1.fields = r2
            com.bumptech.glide.request.BaseRequestOptions r2 = r1.selfOrThrowIfLocked()
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T fallback(@androidx.annotation.Nullable android.graphics.drawable.Drawable r2) {
            r1 = this;
            boolean r0 = r1.isAutoCloneEnabled
            if (r0 == 0) goto Ld
            com.bumptech.glide.request.BaseRequestOptions r0 = r1.clone()
            com.bumptech.glide.request.BaseRequestOptions r2 = r0.fallback(r2)
            return r2
        Ld:
            r1.fallbackDrawable = r2
            int r2 = r1.fields
            r2 = r2 | 8192(0x2000, float:1.148E-41)
            r0 = 0
            r1.fallbackId = r0
            r2 = r2 & (-16385(0xffffffffffffbfff, float:NaN))
            r1.fields = r2
            com.bumptech.glide.request.BaseRequestOptions r2 = r1.selfOrThrowIfLocked()
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T fitCenter() {
            r2 = this;
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r0 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.FIT_CENTER
            com.bumptech.glide.load.resource.bitmap.FitCenter r1 = new com.bumptech.glide.load.resource.bitmap.FitCenter
            r1.<init>()
            com.bumptech.glide.request.BaseRequestOptions r0 = r2.scaleOnlyTransform(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T format(@androidx.annotation.NonNull com.bumptech.glide.load.DecodeFormat r3) {
            r2 = this;
            com.bumptech.glide.util.Preconditions.checkNotNull(r3)
            com.bumptech.glide.load.Option<com.bumptech.glide.load.DecodeFormat> r0 = com.bumptech.glide.load.resource.bitmap.Downsampler.DECODE_FORMAT
            com.bumptech.glide.request.BaseRequestOptions r0 = r2.set(r0, r3)
            com.bumptech.glide.load.Option<com.bumptech.glide.load.DecodeFormat> r1 = com.bumptech.glide.load.resource.gif.GifOptions.DECODE_FORMAT
            com.bumptech.glide.request.BaseRequestOptions r3 = r0.set(r1, r3)
            return r3
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T frame(@androidx.annotation.IntRange(from = 0) long r2) {
            r1 = this;
            com.bumptech.glide.load.Option<java.lang.Long> r0 = com.bumptech.glide.load.resource.bitmap.VideoDecoder.TARGET_FRAME
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            com.bumptech.glide.request.BaseRequestOptions r2 = r1.set(r0, r2)
            return r2
    }

    @androidx.annotation.NonNull
    public final com.bumptech.glide.load.engine.DiskCacheStrategy getDiskCacheStrategy() {
            r1 = this;
            com.bumptech.glide.load.engine.DiskCacheStrategy r0 = r1.diskCacheStrategy
            return r0
    }

    public final int getErrorId() {
            r1 = this;
            int r0 = r1.errorId
            return r0
    }

    @androidx.annotation.Nullable
    public final android.graphics.drawable.Drawable getErrorPlaceholder() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.errorPlaceholder
            return r0
    }

    @androidx.annotation.Nullable
    public final android.graphics.drawable.Drawable getFallbackDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.fallbackDrawable
            return r0
    }

    public final int getFallbackId() {
            r1 = this;
            int r0 = r1.fallbackId
            return r0
    }

    public final boolean getOnlyRetrieveFromCache() {
            r1 = this;
            boolean r0 = r1.onlyRetrieveFromCache
            return r0
    }

    @androidx.annotation.NonNull
    public final com.bumptech.glide.load.Options getOptions() {
            r1 = this;
            com.bumptech.glide.load.Options r0 = r1.options
            return r0
    }

    public final int getOverrideHeight() {
            r1 = this;
            int r0 = r1.overrideHeight
            return r0
    }

    public final int getOverrideWidth() {
            r1 = this;
            int r0 = r1.overrideWidth
            return r0
    }

    @androidx.annotation.Nullable
    public final android.graphics.drawable.Drawable getPlaceholderDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.placeholderDrawable
            return r0
    }

    public final int getPlaceholderId() {
            r1 = this;
            int r0 = r1.placeholderId
            return r0
    }

    @androidx.annotation.NonNull
    public final com.bumptech.glide.Priority getPriority() {
            r1 = this;
            com.bumptech.glide.Priority r0 = r1.priority
            return r0
    }

    @androidx.annotation.NonNull
    public final java.lang.Class<?> getResourceClass() {
            r1 = this;
            java.lang.Class<?> r0 = r1.resourceClass
            return r0
    }

    @androidx.annotation.NonNull
    public final com.bumptech.glide.load.Key getSignature() {
            r1 = this;
            com.bumptech.glide.load.Key r0 = r1.signature
            return r0
    }

    public final float getSizeMultiplier() {
            r1 = this;
            float r0 = r1.sizeMultiplier
            return r0
    }

    @androidx.annotation.Nullable
    public final android.content.res.Resources.Theme getTheme() {
            r1 = this;
            android.content.res.Resources$Theme r0 = r1.theme
            return r0
    }

    @androidx.annotation.NonNull
    public final java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.Transformation<?>> getTransformations() {
            r1 = this;
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.Transformation<?>> r0 = r1.transformations
            return r0
    }

    public final boolean getUseAnimationPool() {
            r1 = this;
            boolean r0 = r1.useAnimationPool
            return r0
    }

    public final boolean getUseUnlimitedSourceGeneratorsPool() {
            r1 = this;
            boolean r0 = r1.useUnlimitedSourceGeneratorsPool
            return r0
    }

    public int hashCode() {
            r2 = this;
            float r0 = r2.sizeMultiplier
            int r0 = com.bumptech.glide.util.Util.hashCode(r0)
            int r1 = r2.errorId
            int r0 = com.bumptech.glide.util.Util.hashCode(r1, r0)
            android.graphics.drawable.Drawable r1 = r2.errorPlaceholder
            int r0 = com.bumptech.glide.util.Util.hashCode(r1, r0)
            int r1 = r2.placeholderId
            int r0 = com.bumptech.glide.util.Util.hashCode(r1, r0)
            android.graphics.drawable.Drawable r1 = r2.placeholderDrawable
            int r0 = com.bumptech.glide.util.Util.hashCode(r1, r0)
            int r1 = r2.fallbackId
            int r0 = com.bumptech.glide.util.Util.hashCode(r1, r0)
            android.graphics.drawable.Drawable r1 = r2.fallbackDrawable
            int r0 = com.bumptech.glide.util.Util.hashCode(r1, r0)
            boolean r1 = r2.isCacheable
            int r0 = com.bumptech.glide.util.Util.hashCode(r1, r0)
            int r1 = r2.overrideHeight
            int r0 = com.bumptech.glide.util.Util.hashCode(r1, r0)
            int r1 = r2.overrideWidth
            int r0 = com.bumptech.glide.util.Util.hashCode(r1, r0)
            boolean r1 = r2.isTransformationRequired
            int r0 = com.bumptech.glide.util.Util.hashCode(r1, r0)
            boolean r1 = r2.isTransformationAllowed
            int r0 = com.bumptech.glide.util.Util.hashCode(r1, r0)
            boolean r1 = r2.useUnlimitedSourceGeneratorsPool
            int r0 = com.bumptech.glide.util.Util.hashCode(r1, r0)
            boolean r1 = r2.onlyRetrieveFromCache
            int r0 = com.bumptech.glide.util.Util.hashCode(r1, r0)
            com.bumptech.glide.load.engine.DiskCacheStrategy r1 = r2.diskCacheStrategy
            int r0 = com.bumptech.glide.util.Util.hashCode(r1, r0)
            com.bumptech.glide.Priority r1 = r2.priority
            int r0 = com.bumptech.glide.util.Util.hashCode(r1, r0)
            com.bumptech.glide.load.Options r1 = r2.options
            int r0 = com.bumptech.glide.util.Util.hashCode(r1, r0)
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.Transformation<?>> r1 = r2.transformations
            int r0 = com.bumptech.glide.util.Util.hashCode(r1, r0)
            java.lang.Class<?> r1 = r2.resourceClass
            int r0 = com.bumptech.glide.util.Util.hashCode(r1, r0)
            com.bumptech.glide.load.Key r1 = r2.signature
            int r0 = com.bumptech.glide.util.Util.hashCode(r1, r0)
            android.content.res.Resources$Theme r1 = r2.theme
            int r0 = com.bumptech.glide.util.Util.hashCode(r1, r0)
            return r0
    }

    public final boolean isAutoCloneEnabled() {
            r1 = this;
            boolean r0 = r1.isAutoCloneEnabled
            return r0
    }

    public final boolean isDiskCacheStrategySet() {
            r1 = this;
            r0 = 4
            boolean r0 = r1.isSet(r0)
            return r0
    }

    public final boolean isLocked() {
            r1 = this;
            boolean r0 = r1.isLocked
            return r0
    }

    public final boolean isMemoryCacheable() {
            r1 = this;
            boolean r0 = r1.isCacheable
            return r0
    }

    public final boolean isPrioritySet() {
            r1 = this;
            r0 = 8
            boolean r0 = r1.isSet(r0)
            return r0
    }

    public final boolean isScaleOnlyOrNoTransform() {
            r1 = this;
            boolean r0 = r1.isScaleOnlyOrNoTransform
            return r0
    }

    public final boolean isSkipMemoryCacheSet() {
            r1 = this;
            r0 = 256(0x100, float:3.59E-43)
            boolean r0 = r1.isSet(r0)
            return r0
    }

    public final boolean isTransformationAllowed() {
            r1 = this;
            boolean r0 = r1.isTransformationAllowed
            return r0
    }

    public final boolean isTransformationRequired() {
            r1 = this;
            boolean r0 = r1.isTransformationRequired
            return r0
    }

    public final boolean isTransformationSet() {
            r1 = this;
            r0 = 2048(0x800, float:2.87E-42)
            boolean r0 = r1.isSet(r0)
            return r0
    }

    public final boolean isValidOverride() {
            r2 = this;
            int r0 = r2.overrideWidth
            int r1 = r2.overrideHeight
            boolean r0 = com.bumptech.glide.util.Util.isValidDimensions(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    public T lock() {
            r1 = this;
            r0 = 1
            r1.isLocked = r0
            com.bumptech.glide.request.BaseRequestOptions r0 = r1.self()
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T onlyRetrieveFromCache(boolean r2) {
            r1 = this;
            boolean r0 = r1.isAutoCloneEnabled
            if (r0 == 0) goto Ld
            com.bumptech.glide.request.BaseRequestOptions r0 = r1.clone()
            com.bumptech.glide.request.BaseRequestOptions r2 = r0.onlyRetrieveFromCache(r2)
            return r2
        Ld:
            r1.onlyRetrieveFromCache = r2
            int r2 = r1.fields
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 | r0
            r1.fields = r2
            com.bumptech.glide.request.BaseRequestOptions r2 = r1.selfOrThrowIfLocked()
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T optionalCenterCrop() {
            r2 = this;
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r0 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.CENTER_OUTSIDE
            com.bumptech.glide.load.resource.bitmap.CenterCrop r1 = new com.bumptech.glide.load.resource.bitmap.CenterCrop
            r1.<init>()
            com.bumptech.glide.request.BaseRequestOptions r0 = r2.optionalTransform(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T optionalCenterInside() {
            r2 = this;
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r0 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.CENTER_INSIDE
            com.bumptech.glide.load.resource.bitmap.CenterInside r1 = new com.bumptech.glide.load.resource.bitmap.CenterInside
            r1.<init>()
            com.bumptech.glide.request.BaseRequestOptions r0 = r2.optionalScaleOnlyTransform(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T optionalCircleCrop() {
            r2 = this;
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r0 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.CENTER_OUTSIDE
            com.bumptech.glide.load.resource.bitmap.CircleCrop r1 = new com.bumptech.glide.load.resource.bitmap.CircleCrop
            r1.<init>()
            com.bumptech.glide.request.BaseRequestOptions r0 = r2.optionalTransform(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T optionalFitCenter() {
            r2 = this;
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r0 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.FIT_CENTER
            com.bumptech.glide.load.resource.bitmap.FitCenter r1 = new com.bumptech.glide.load.resource.bitmap.FitCenter
            r1.<init>()
            com.bumptech.glide.request.BaseRequestOptions r0 = r2.optionalScaleOnlyTransform(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T optionalTransform(@androidx.annotation.NonNull com.bumptech.glide.load.Transformation<android.graphics.Bitmap> r2) {
            r1 = this;
            r0 = 0
            com.bumptech.glide.request.BaseRequestOptions r2 = r1.transform(r2, r0)
            return r2
    }

    @androidx.annotation.NonNull
    public final T optionalTransform(@androidx.annotation.NonNull com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r2, @androidx.annotation.NonNull com.bumptech.glide.load.Transformation<android.graphics.Bitmap> r3) {
            r1 = this;
            boolean r0 = r1.isAutoCloneEnabled
            if (r0 == 0) goto Ld
            com.bumptech.glide.request.BaseRequestOptions r0 = r1.clone()
            com.bumptech.glide.request.BaseRequestOptions r2 = r0.optionalTransform(r2, r3)
            return r2
        Ld:
            r1.downsample(r2)
            r2 = 0
            com.bumptech.glide.request.BaseRequestOptions r2 = r1.transform(r3, r2)
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public <Y> T optionalTransform(@androidx.annotation.NonNull java.lang.Class<Y> r2, @androidx.annotation.NonNull com.bumptech.glide.load.Transformation<Y> r3) {
            r1 = this;
            r0 = 0
            com.bumptech.glide.request.BaseRequestOptions r2 = r1.transform(r2, r3, r0)
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T override(int r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = r0.override(r1, r1)
            return r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T override(int r2, int r3) {
            r1 = this;
            boolean r0 = r1.isAutoCloneEnabled
            if (r0 == 0) goto Ld
            com.bumptech.glide.request.BaseRequestOptions r0 = r1.clone()
            com.bumptech.glide.request.BaseRequestOptions r2 = r0.override(r2, r3)
            return r2
        Ld:
            r1.overrideWidth = r2
            r1.overrideHeight = r3
            int r2 = r1.fields
            r2 = r2 | 512(0x200, float:7.17E-43)
            r1.fields = r2
            com.bumptech.glide.request.BaseRequestOptions r2 = r1.selfOrThrowIfLocked()
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T placeholder(@androidx.annotation.DrawableRes int r2) {
            r1 = this;
            boolean r0 = r1.isAutoCloneEnabled
            if (r0 == 0) goto Ld
            com.bumptech.glide.request.BaseRequestOptions r0 = r1.clone()
            com.bumptech.glide.request.BaseRequestOptions r2 = r0.placeholder(r2)
            return r2
        Ld:
            r1.placeholderId = r2
            int r2 = r1.fields
            r2 = r2 | 128(0x80, float:1.8E-43)
            r0 = 0
            r1.placeholderDrawable = r0
            r2 = r2 & (-65)
            r1.fields = r2
            com.bumptech.glide.request.BaseRequestOptions r2 = r1.selfOrThrowIfLocked()
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T placeholder(@androidx.annotation.Nullable android.graphics.drawable.Drawable r2) {
            r1 = this;
            boolean r0 = r1.isAutoCloneEnabled
            if (r0 == 0) goto Ld
            com.bumptech.glide.request.BaseRequestOptions r0 = r1.clone()
            com.bumptech.glide.request.BaseRequestOptions r2 = r0.placeholder(r2)
            return r2
        Ld:
            r1.placeholderDrawable = r2
            int r2 = r1.fields
            r2 = r2 | 64
            r0 = 0
            r1.placeholderId = r0
            r2 = r2 & (-129(0xffffffffffffff7f, float:NaN))
            r1.fields = r2
            com.bumptech.glide.request.BaseRequestOptions r2 = r1.selfOrThrowIfLocked()
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T priority(@androidx.annotation.NonNull com.bumptech.glide.Priority r2) {
            r1 = this;
            boolean r0 = r1.isAutoCloneEnabled
            if (r0 == 0) goto Ld
            com.bumptech.glide.request.BaseRequestOptions r0 = r1.clone()
            com.bumptech.glide.request.BaseRequestOptions r2 = r0.priority(r2)
            return r2
        Ld:
            java.lang.Object r2 = com.bumptech.glide.util.Preconditions.checkNotNull(r2)
            com.bumptech.glide.Priority r2 = (com.bumptech.glide.Priority) r2
            r1.priority = r2
            int r2 = r1.fields
            r2 = r2 | 8
            r1.fields = r2
            com.bumptech.glide.request.BaseRequestOptions r2 = r1.selfOrThrowIfLocked()
            return r2
    }

    @androidx.annotation.NonNull
    public final T selfOrThrowIfLocked() {
            r2 = this;
            boolean r0 = r2.isLocked
            if (r0 != 0) goto L9
            com.bumptech.glide.request.BaseRequestOptions r0 = r2.self()
            return r0
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You cannot modify locked T, consider clone()"
            r0.<init>(r1)
            throw r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public <Y> T set(@androidx.annotation.NonNull com.bumptech.glide.load.Option<Y> r2, @androidx.annotation.NonNull Y r3) {
            r1 = this;
            boolean r0 = r1.isAutoCloneEnabled
            if (r0 == 0) goto Ld
            com.bumptech.glide.request.BaseRequestOptions r0 = r1.clone()
            com.bumptech.glide.request.BaseRequestOptions r2 = r0.set(r2, r3)
            return r2
        Ld:
            com.bumptech.glide.util.Preconditions.checkNotNull(r2)
            com.bumptech.glide.util.Preconditions.checkNotNull(r3)
            com.bumptech.glide.load.Options r0 = r1.options
            r0.set(r2, r3)
            com.bumptech.glide.request.BaseRequestOptions r2 = r1.selfOrThrowIfLocked()
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T signature(@androidx.annotation.NonNull com.bumptech.glide.load.Key r2) {
            r1 = this;
            boolean r0 = r1.isAutoCloneEnabled
            if (r0 == 0) goto Ld
            com.bumptech.glide.request.BaseRequestOptions r0 = r1.clone()
            com.bumptech.glide.request.BaseRequestOptions r2 = r0.signature(r2)
            return r2
        Ld:
            java.lang.Object r2 = com.bumptech.glide.util.Preconditions.checkNotNull(r2)
            com.bumptech.glide.load.Key r2 = (com.bumptech.glide.load.Key) r2
            r1.signature = r2
            int r2 = r1.fields
            r2 = r2 | 1024(0x400, float:1.435E-42)
            r1.fields = r2
            com.bumptech.glide.request.BaseRequestOptions r2 = r1.selfOrThrowIfLocked()
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T sizeMultiplier(@androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r2) {
            r1 = this;
            boolean r0 = r1.isAutoCloneEnabled
            if (r0 == 0) goto Ld
            com.bumptech.glide.request.BaseRequestOptions r0 = r1.clone()
            com.bumptech.glide.request.BaseRequestOptions r2 = r0.sizeMultiplier(r2)
            return r2
        Ld:
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L25
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L25
            r1.sizeMultiplier = r2
            int r2 = r1.fields
            r2 = r2 | 2
            r1.fields = r2
            com.bumptech.glide.request.BaseRequestOptions r2 = r1.selfOrThrowIfLocked()
            return r2
        L25:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "sizeMultiplier must be between 0 and 1"
            r2.<init>(r0)
            throw r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T skipMemoryCache(boolean r3) {
            r2 = this;
            boolean r0 = r2.isAutoCloneEnabled
            r1 = 1
            if (r0 == 0) goto Le
            com.bumptech.glide.request.BaseRequestOptions r3 = r2.clone()
            com.bumptech.glide.request.BaseRequestOptions r3 = r3.skipMemoryCache(r1)
            return r3
        Le:
            r3 = r3 ^ r1
            r2.isCacheable = r3
            int r3 = r2.fields
            r3 = r3 | 256(0x100, float:3.59E-43)
            r2.fields = r3
            com.bumptech.glide.request.BaseRequestOptions r3 = r2.selfOrThrowIfLocked()
            return r3
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T theme(@androidx.annotation.Nullable android.content.res.Resources.Theme r2) {
            r1 = this;
            boolean r0 = r1.isAutoCloneEnabled
            if (r0 == 0) goto Ld
            com.bumptech.glide.request.BaseRequestOptions r0 = r1.clone()
            com.bumptech.glide.request.BaseRequestOptions r2 = r0.theme(r2)
            return r2
        Ld:
            r1.theme = r2
            int r2 = r1.fields
            r0 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 | r0
            r1.fields = r2
            com.bumptech.glide.request.BaseRequestOptions r2 = r1.selfOrThrowIfLocked()
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T timeout(@androidx.annotation.IntRange(from = 0) int r2) {
            r1 = this;
            com.bumptech.glide.load.Option<java.lang.Integer> r0 = com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.TIMEOUT
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.bumptech.glide.request.BaseRequestOptions r2 = r1.set(r0, r2)
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T transform(@androidx.annotation.NonNull com.bumptech.glide.load.Transformation<android.graphics.Bitmap> r2) {
            r1 = this;
            r0 = 1
            com.bumptech.glide.request.BaseRequestOptions r2 = r1.transform(r2, r0)
            return r2
    }

    @androidx.annotation.NonNull
    public final T transform(@androidx.annotation.NonNull com.bumptech.glide.load.Transformation<android.graphics.Bitmap> r3, boolean r4) {
            r2 = this;
            boolean r0 = r2.isAutoCloneEnabled
            if (r0 == 0) goto Ld
            com.bumptech.glide.request.BaseRequestOptions r0 = r2.clone()
            com.bumptech.glide.request.BaseRequestOptions r3 = r0.transform(r3, r4)
            return r3
        Ld:
            com.bumptech.glide.load.resource.bitmap.DrawableTransformation r0 = new com.bumptech.glide.load.resource.bitmap.DrawableTransformation
            r0.<init>(r3, r4)
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            r2.transform(r1, r3, r4)
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            r2.transform(r1, r0, r4)
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r1 = android.graphics.drawable.BitmapDrawable.class
            com.bumptech.glide.load.Transformation r0 = r0.asBitmapDrawable()
            r2.transform(r1, r0, r4)
            java.lang.Class<com.bumptech.glide.load.resource.gif.GifDrawable> r0 = com.bumptech.glide.load.resource.gif.GifDrawable.class
            com.bumptech.glide.load.resource.gif.GifDrawableTransformation r1 = new com.bumptech.glide.load.resource.gif.GifDrawableTransformation
            r1.<init>(r3)
            r2.transform(r0, r1, r4)
            com.bumptech.glide.request.BaseRequestOptions r3 = r2.selfOrThrowIfLocked()
            return r3
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public final T transform(@androidx.annotation.NonNull com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r2, @androidx.annotation.NonNull com.bumptech.glide.load.Transformation<android.graphics.Bitmap> r3) {
            r1 = this;
            boolean r0 = r1.isAutoCloneEnabled
            if (r0 == 0) goto Ld
            com.bumptech.glide.request.BaseRequestOptions r0 = r1.clone()
            com.bumptech.glide.request.BaseRequestOptions r2 = r0.transform(r2, r3)
            return r2
        Ld:
            r1.downsample(r2)
            com.bumptech.glide.request.BaseRequestOptions r2 = r1.transform(r3)
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public <Y> T transform(@androidx.annotation.NonNull java.lang.Class<Y> r2, @androidx.annotation.NonNull com.bumptech.glide.load.Transformation<Y> r3) {
            r1 = this;
            r0 = 1
            com.bumptech.glide.request.BaseRequestOptions r2 = r1.transform(r2, r3, r0)
            return r2
    }

    @androidx.annotation.NonNull
    public final <Y> T transform(@androidx.annotation.NonNull java.lang.Class<Y> r2, @androidx.annotation.NonNull com.bumptech.glide.load.Transformation<Y> r3, boolean r4) {
            r1 = this;
            boolean r0 = r1.isAutoCloneEnabled
            if (r0 == 0) goto Ld
            com.bumptech.glide.request.BaseRequestOptions r0 = r1.clone()
            com.bumptech.glide.request.BaseRequestOptions r2 = r0.transform(r2, r3, r4)
            return r2
        Ld:
            com.bumptech.glide.util.Preconditions.checkNotNull(r2)
            com.bumptech.glide.util.Preconditions.checkNotNull(r3)
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.Transformation<?>> r0 = r1.transformations
            r0.put(r2, r3)
            int r2 = r1.fields
            r2 = r2 | 2048(0x800, float:2.87E-42)
            r3 = 1
            r1.isTransformationAllowed = r3
            r0 = 65536(0x10000, float:9.1835E-41)
            r2 = r2 | r0
            r1.fields = r2
            r0 = 0
            r1.isScaleOnlyOrNoTransform = r0
            if (r4 == 0) goto L30
            r4 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 | r4
            r1.fields = r2
            r1.isTransformationRequired = r3
        L30:
            com.bumptech.glide.request.BaseRequestOptions r2 = r1.selfOrThrowIfLocked()
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T transform(@androidx.annotation.NonNull com.bumptech.glide.load.Transformation<android.graphics.Bitmap>... r3) {
            r2 = this;
            int r0 = r3.length
            r1 = 1
            if (r0 <= r1) goto Le
            com.bumptech.glide.load.MultiTransformation r0 = new com.bumptech.glide.load.MultiTransformation
            r0.<init>(r3)
            com.bumptech.glide.request.BaseRequestOptions r3 = r2.transform(r0, r1)
            return r3
        Le:
            int r0 = r3.length
            if (r0 != r1) goto L19
            r0 = 0
            r3 = r3[r0]
            com.bumptech.glide.request.BaseRequestOptions r3 = r2.transform(r3)
            return r3
        L19:
            com.bumptech.glide.request.BaseRequestOptions r3 = r2.selfOrThrowIfLocked()
            return r3
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    @java.lang.Deprecated
    public T transforms(@androidx.annotation.NonNull com.bumptech.glide.load.Transformation<android.graphics.Bitmap>... r2) {
            r1 = this;
            com.bumptech.glide.load.MultiTransformation r0 = new com.bumptech.glide.load.MultiTransformation
            r0.<init>(r2)
            r2 = 1
            com.bumptech.glide.request.BaseRequestOptions r2 = r1.transform(r0, r2)
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T useAnimationPool(boolean r2) {
            r1 = this;
            boolean r0 = r1.isAutoCloneEnabled
            if (r0 == 0) goto Ld
            com.bumptech.glide.request.BaseRequestOptions r0 = r1.clone()
            com.bumptech.glide.request.BaseRequestOptions r2 = r0.useAnimationPool(r2)
            return r2
        Ld:
            r1.useAnimationPool = r2
            int r2 = r1.fields
            r0 = 1048576(0x100000, float:1.469368E-39)
            r2 = r2 | r0
            r1.fields = r2
            com.bumptech.glide.request.BaseRequestOptions r2 = r1.selfOrThrowIfLocked()
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T useUnlimitedSourceGeneratorsPool(boolean r2) {
            r1 = this;
            boolean r0 = r1.isAutoCloneEnabled
            if (r0 == 0) goto Ld
            com.bumptech.glide.request.BaseRequestOptions r0 = r1.clone()
            com.bumptech.glide.request.BaseRequestOptions r2 = r0.useUnlimitedSourceGeneratorsPool(r2)
            return r2
        Ld:
            r1.useUnlimitedSourceGeneratorsPool = r2
            int r2 = r1.fields
            r0 = 262144(0x40000, float:3.67342E-40)
            r2 = r2 | r0
            r1.fields = r2
            com.bumptech.glide.request.BaseRequestOptions r2 = r1.selfOrThrowIfLocked()
            return r2
    }
}
