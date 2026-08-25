package com.flextv.livestore.utils;

/* JADX INFO: loaded from: classes.dex */
public final class GlideOptions extends com.bumptech.glide.request.RequestOptions {
    private static com.flextv.livestore.utils.GlideOptions centerCropTransform2;
    private static com.flextv.livestore.utils.GlideOptions centerInsideTransform1;
    private static com.flextv.livestore.utils.GlideOptions circleCropTransform3;
    private static com.flextv.livestore.utils.GlideOptions fitCenterTransform0;
    private static com.flextv.livestore.utils.GlideOptions noAnimation5;
    private static com.flextv.livestore.utils.GlideOptions noTransformation4;

    public GlideOptions() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public static com.flextv.livestore.utils.GlideOptions bitmapTransform(@androidx.annotation.NonNull com.bumptech.glide.load.Transformation<android.graphics.Bitmap> r1) {
            com.flextv.livestore.utils.GlideOptions r0 = new com.flextv.livestore.utils.GlideOptions
            r0.<init>()
            com.flextv.livestore.utils.GlideOptions r1 = r0.transform(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public static com.flextv.livestore.utils.GlideOptions centerCropTransform() {
            com.flextv.livestore.utils.GlideOptions r0 = com.flextv.livestore.utils.GlideOptions.centerCropTransform2
            if (r0 != 0) goto L13
            com.flextv.livestore.utils.GlideOptions r0 = new com.flextv.livestore.utils.GlideOptions
            r0.<init>()
            com.flextv.livestore.utils.GlideOptions r0 = r0.centerCrop()
            com.flextv.livestore.utils.GlideOptions r0 = r0.autoClone()
            com.flextv.livestore.utils.GlideOptions.centerCropTransform2 = r0
        L13:
            com.flextv.livestore.utils.GlideOptions r0 = com.flextv.livestore.utils.GlideOptions.centerCropTransform2
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public static com.flextv.livestore.utils.GlideOptions centerInsideTransform() {
            com.flextv.livestore.utils.GlideOptions r0 = com.flextv.livestore.utils.GlideOptions.centerInsideTransform1
            if (r0 != 0) goto L13
            com.flextv.livestore.utils.GlideOptions r0 = new com.flextv.livestore.utils.GlideOptions
            r0.<init>()
            com.flextv.livestore.utils.GlideOptions r0 = r0.centerInside()
            com.flextv.livestore.utils.GlideOptions r0 = r0.autoClone()
            com.flextv.livestore.utils.GlideOptions.centerInsideTransform1 = r0
        L13:
            com.flextv.livestore.utils.GlideOptions r0 = com.flextv.livestore.utils.GlideOptions.centerInsideTransform1
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public static com.flextv.livestore.utils.GlideOptions circleCropTransform() {
            com.flextv.livestore.utils.GlideOptions r0 = com.flextv.livestore.utils.GlideOptions.circleCropTransform3
            if (r0 != 0) goto L13
            com.flextv.livestore.utils.GlideOptions r0 = new com.flextv.livestore.utils.GlideOptions
            r0.<init>()
            com.flextv.livestore.utils.GlideOptions r0 = r0.circleCrop()
            com.flextv.livestore.utils.GlideOptions r0 = r0.autoClone()
            com.flextv.livestore.utils.GlideOptions.circleCropTransform3 = r0
        L13:
            com.flextv.livestore.utils.GlideOptions r0 = com.flextv.livestore.utils.GlideOptions.circleCropTransform3
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public static com.flextv.livestore.utils.GlideOptions decodeTypeOf(@androidx.annotation.NonNull java.lang.Class<?> r1) {
            com.flextv.livestore.utils.GlideOptions r0 = new com.flextv.livestore.utils.GlideOptions
            r0.<init>()
            com.flextv.livestore.utils.GlideOptions r1 = r0.decode(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public static com.flextv.livestore.utils.GlideOptions diskCacheStrategyOf(@androidx.annotation.NonNull com.bumptech.glide.load.engine.DiskCacheStrategy r1) {
            com.flextv.livestore.utils.GlideOptions r0 = new com.flextv.livestore.utils.GlideOptions
            r0.<init>()
            com.flextv.livestore.utils.GlideOptions r1 = r0.diskCacheStrategy(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public static com.flextv.livestore.utils.GlideOptions downsampleOf(@androidx.annotation.NonNull com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r1) {
            com.flextv.livestore.utils.GlideOptions r0 = new com.flextv.livestore.utils.GlideOptions
            r0.<init>()
            com.flextv.livestore.utils.GlideOptions r1 = r0.downsample(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public static com.flextv.livestore.utils.GlideOptions encodeFormatOf(@androidx.annotation.NonNull android.graphics.Bitmap.CompressFormat r1) {
            com.flextv.livestore.utils.GlideOptions r0 = new com.flextv.livestore.utils.GlideOptions
            r0.<init>()
            com.flextv.livestore.utils.GlideOptions r1 = r0.encodeFormat(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public static com.flextv.livestore.utils.GlideOptions encodeQualityOf(@androidx.annotation.IntRange(from = 0, to = 100) int r1) {
            com.flextv.livestore.utils.GlideOptions r0 = new com.flextv.livestore.utils.GlideOptions
            r0.<init>()
            com.flextv.livestore.utils.GlideOptions r1 = r0.encodeQuality(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public static com.flextv.livestore.utils.GlideOptions errorOf(@androidx.annotation.DrawableRes int r1) {
            com.flextv.livestore.utils.GlideOptions r0 = new com.flextv.livestore.utils.GlideOptions
            r0.<init>()
            com.flextv.livestore.utils.GlideOptions r1 = r0.error(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public static com.flextv.livestore.utils.GlideOptions errorOf(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            com.flextv.livestore.utils.GlideOptions r0 = new com.flextv.livestore.utils.GlideOptions
            r0.<init>()
            com.flextv.livestore.utils.GlideOptions r1 = r0.error(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public static com.flextv.livestore.utils.GlideOptions fitCenterTransform() {
            com.flextv.livestore.utils.GlideOptions r0 = com.flextv.livestore.utils.GlideOptions.fitCenterTransform0
            if (r0 != 0) goto L13
            com.flextv.livestore.utils.GlideOptions r0 = new com.flextv.livestore.utils.GlideOptions
            r0.<init>()
            com.flextv.livestore.utils.GlideOptions r0 = r0.fitCenter()
            com.flextv.livestore.utils.GlideOptions r0 = r0.autoClone()
            com.flextv.livestore.utils.GlideOptions.fitCenterTransform0 = r0
        L13:
            com.flextv.livestore.utils.GlideOptions r0 = com.flextv.livestore.utils.GlideOptions.fitCenterTransform0
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public static com.flextv.livestore.utils.GlideOptions formatOf(@androidx.annotation.NonNull com.bumptech.glide.load.DecodeFormat r1) {
            com.flextv.livestore.utils.GlideOptions r0 = new com.flextv.livestore.utils.GlideOptions
            r0.<init>()
            com.flextv.livestore.utils.GlideOptions r1 = r0.format(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public static com.flextv.livestore.utils.GlideOptions frameOf(@androidx.annotation.IntRange(from = 0) long r1) {
            com.flextv.livestore.utils.GlideOptions r0 = new com.flextv.livestore.utils.GlideOptions
            r0.<init>()
            com.flextv.livestore.utils.GlideOptions r1 = r0.frame(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public static com.flextv.livestore.utils.GlideOptions noAnimation() {
            com.flextv.livestore.utils.GlideOptions r0 = com.flextv.livestore.utils.GlideOptions.noAnimation5
            if (r0 != 0) goto L13
            com.flextv.livestore.utils.GlideOptions r0 = new com.flextv.livestore.utils.GlideOptions
            r0.<init>()
            com.flextv.livestore.utils.GlideOptions r0 = r0.dontAnimate()
            com.flextv.livestore.utils.GlideOptions r0 = r0.autoClone()
            com.flextv.livestore.utils.GlideOptions.noAnimation5 = r0
        L13:
            com.flextv.livestore.utils.GlideOptions r0 = com.flextv.livestore.utils.GlideOptions.noAnimation5
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public static com.flextv.livestore.utils.GlideOptions noTransformation() {
            com.flextv.livestore.utils.GlideOptions r0 = com.flextv.livestore.utils.GlideOptions.noTransformation4
            if (r0 != 0) goto L13
            com.flextv.livestore.utils.GlideOptions r0 = new com.flextv.livestore.utils.GlideOptions
            r0.<init>()
            com.flextv.livestore.utils.GlideOptions r0 = r0.dontTransform()
            com.flextv.livestore.utils.GlideOptions r0 = r0.autoClone()
            com.flextv.livestore.utils.GlideOptions.noTransformation4 = r0
        L13:
            com.flextv.livestore.utils.GlideOptions r0 = com.flextv.livestore.utils.GlideOptions.noTransformation4
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public static <T> com.flextv.livestore.utils.GlideOptions option(@androidx.annotation.NonNull com.bumptech.glide.load.Option<T> r1, @androidx.annotation.NonNull T r2) {
            com.flextv.livestore.utils.GlideOptions r0 = new com.flextv.livestore.utils.GlideOptions
            r0.<init>()
            com.flextv.livestore.utils.GlideOptions r1 = r0.set(r1, r2)
            return r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public static com.flextv.livestore.utils.GlideOptions overrideOf(int r1) {
            com.flextv.livestore.utils.GlideOptions r0 = new com.flextv.livestore.utils.GlideOptions
            r0.<init>()
            com.flextv.livestore.utils.GlideOptions r1 = r0.override(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public static com.flextv.livestore.utils.GlideOptions overrideOf(int r1, int r2) {
            com.flextv.livestore.utils.GlideOptions r0 = new com.flextv.livestore.utils.GlideOptions
            r0.<init>()
            com.flextv.livestore.utils.GlideOptions r1 = r0.override(r1, r2)
            return r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public static com.flextv.livestore.utils.GlideOptions placeholderOf(@androidx.annotation.DrawableRes int r1) {
            com.flextv.livestore.utils.GlideOptions r0 = new com.flextv.livestore.utils.GlideOptions
            r0.<init>()
            com.flextv.livestore.utils.GlideOptions r1 = r0.placeholder(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public static com.flextv.livestore.utils.GlideOptions placeholderOf(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            com.flextv.livestore.utils.GlideOptions r0 = new com.flextv.livestore.utils.GlideOptions
            r0.<init>()
            com.flextv.livestore.utils.GlideOptions r1 = r0.placeholder(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public static com.flextv.livestore.utils.GlideOptions priorityOf(@androidx.annotation.NonNull com.bumptech.glide.Priority r1) {
            com.flextv.livestore.utils.GlideOptions r0 = new com.flextv.livestore.utils.GlideOptions
            r0.<init>()
            com.flextv.livestore.utils.GlideOptions r1 = r0.priority(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public static com.flextv.livestore.utils.GlideOptions signatureOf(@androidx.annotation.NonNull com.bumptech.glide.load.Key r1) {
            com.flextv.livestore.utils.GlideOptions r0 = new com.flextv.livestore.utils.GlideOptions
            r0.<init>()
            com.flextv.livestore.utils.GlideOptions r1 = r0.signature(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public static com.flextv.livestore.utils.GlideOptions sizeMultiplierOf(@androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r1) {
            com.flextv.livestore.utils.GlideOptions r0 = new com.flextv.livestore.utils.GlideOptions
            r0.<init>()
            com.flextv.livestore.utils.GlideOptions r1 = r0.sizeMultiplier(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public static com.flextv.livestore.utils.GlideOptions skipMemoryCacheOf(boolean r1) {
            com.flextv.livestore.utils.GlideOptions r0 = new com.flextv.livestore.utils.GlideOptions
            r0.<init>()
            com.flextv.livestore.utils.GlideOptions r1 = r0.skipMemoryCache(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public static com.flextv.livestore.utils.GlideOptions timeoutOf(@androidx.annotation.IntRange(from = 0) int r1) {
            com.flextv.livestore.utils.GlideOptions r0 = new com.flextv.livestore.utils.GlideOptions
            r0.<init>()
            com.flextv.livestore.utils.GlideOptions r1 = r0.timeout(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions apply(@androidx.annotation.NonNull com.bumptech.glide.request.BaseRequestOptions r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideOptions r1 = r0.apply(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideOptions apply(@androidx.annotation.NonNull com.bumptech.glide.request.BaseRequestOptions<?> r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.apply(r1)
            com.flextv.livestore.utils.GlideOptions r1 = (com.flextv.livestore.utils.GlideOptions) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions autoClone() {
            r1 = this;
            com.flextv.livestore.utils.GlideOptions r0 = r1.autoClone()
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    public com.flextv.livestore.utils.GlideOptions autoClone() {
            r1 = this;
            com.bumptech.glide.request.BaseRequestOptions r0 = super.autoClone()
            com.flextv.livestore.utils.GlideOptions r0 = (com.flextv.livestore.utils.GlideOptions) r0
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions centerCrop() {
            r1 = this;
            com.flextv.livestore.utils.GlideOptions r0 = r1.centerCrop()
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideOptions centerCrop() {
            r1 = this;
            com.bumptech.glide.request.BaseRequestOptions r0 = super.centerCrop()
            com.flextv.livestore.utils.GlideOptions r0 = (com.flextv.livestore.utils.GlideOptions) r0
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions centerInside() {
            r1 = this;
            com.flextv.livestore.utils.GlideOptions r0 = r1.centerInside()
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideOptions centerInside() {
            r1 = this;
            com.bumptech.glide.request.BaseRequestOptions r0 = super.centerInside()
            com.flextv.livestore.utils.GlideOptions r0 = (com.flextv.livestore.utils.GlideOptions) r0
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions circleCrop() {
            r1 = this;
            com.flextv.livestore.utils.GlideOptions r0 = r1.circleCrop()
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideOptions circleCrop() {
            r1 = this;
            com.bumptech.glide.request.BaseRequestOptions r0 = super.circleCrop()
            com.flextv.livestore.utils.GlideOptions r0 = (com.flextv.livestore.utils.GlideOptions) r0
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions clone() {
            r1 = this;
            com.flextv.livestore.utils.GlideOptions r0 = r1.clone()
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideOptions clone() {
            r1 = this;
            com.bumptech.glide.request.BaseRequestOptions r0 = super.clone()
            com.flextv.livestore.utils.GlideOptions r0 = (com.flextv.livestore.utils.GlideOptions) r0
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.CheckResult
    /* JADX INFO: renamed from: clone */
    public /* bridge */ /* synthetic */ java.lang.Object mo45clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.flextv.livestore.utils.GlideOptions r0 = r1.clone()
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions decode(@androidx.annotation.NonNull java.lang.Class r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideOptions r1 = r0.decode(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideOptions decode(@androidx.annotation.NonNull java.lang.Class<?> r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.decode(r1)
            com.flextv.livestore.utils.GlideOptions r1 = (com.flextv.livestore.utils.GlideOptions) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions disallowHardwareConfig() {
            r1 = this;
            com.flextv.livestore.utils.GlideOptions r0 = r1.disallowHardwareConfig()
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideOptions disallowHardwareConfig() {
            r1 = this;
            com.bumptech.glide.request.BaseRequestOptions r0 = super.disallowHardwareConfig()
            com.flextv.livestore.utils.GlideOptions r0 = (com.flextv.livestore.utils.GlideOptions) r0
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions diskCacheStrategy(@androidx.annotation.NonNull com.bumptech.glide.load.engine.DiskCacheStrategy r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideOptions r1 = r0.diskCacheStrategy(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideOptions diskCacheStrategy(@androidx.annotation.NonNull com.bumptech.glide.load.engine.DiskCacheStrategy r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.diskCacheStrategy(r1)
            com.flextv.livestore.utils.GlideOptions r1 = (com.flextv.livestore.utils.GlideOptions) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions dontAnimate() {
            r1 = this;
            com.flextv.livestore.utils.GlideOptions r0 = r1.dontAnimate()
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideOptions dontAnimate() {
            r1 = this;
            com.bumptech.glide.request.BaseRequestOptions r0 = super.dontAnimate()
            com.flextv.livestore.utils.GlideOptions r0 = (com.flextv.livestore.utils.GlideOptions) r0
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions dontTransform() {
            r1 = this;
            com.flextv.livestore.utils.GlideOptions r0 = r1.dontTransform()
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideOptions dontTransform() {
            r1 = this;
            com.bumptech.glide.request.BaseRequestOptions r0 = super.dontTransform()
            com.flextv.livestore.utils.GlideOptions r0 = (com.flextv.livestore.utils.GlideOptions) r0
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions downsample(@androidx.annotation.NonNull com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideOptions r1 = r0.downsample(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideOptions downsample(@androidx.annotation.NonNull com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.downsample(r1)
            com.flextv.livestore.utils.GlideOptions r1 = (com.flextv.livestore.utils.GlideOptions) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions encodeFormat(@androidx.annotation.NonNull android.graphics.Bitmap.CompressFormat r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideOptions r1 = r0.encodeFormat(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideOptions encodeFormat(@androidx.annotation.NonNull android.graphics.Bitmap.CompressFormat r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.encodeFormat(r1)
            com.flextv.livestore.utils.GlideOptions r1 = (com.flextv.livestore.utils.GlideOptions) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions encodeQuality(@androidx.annotation.IntRange(from = 0, to = 100) int r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideOptions r1 = r0.encodeQuality(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideOptions encodeQuality(@androidx.annotation.IntRange(from = 0, to = 100) int r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.encodeQuality(r1)
            com.flextv.livestore.utils.GlideOptions r1 = (com.flextv.livestore.utils.GlideOptions) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions error(@androidx.annotation.DrawableRes int r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideOptions r1 = r0.error(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions error(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideOptions r1 = r0.error(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideOptions error(@androidx.annotation.DrawableRes int r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.error(r1)
            com.flextv.livestore.utils.GlideOptions r1 = (com.flextv.livestore.utils.GlideOptions) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideOptions error(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.error(r1)
            com.flextv.livestore.utils.GlideOptions r1 = (com.flextv.livestore.utils.GlideOptions) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions fallback(@androidx.annotation.DrawableRes int r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideOptions r1 = r0.fallback(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions fallback(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideOptions r1 = r0.fallback(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideOptions fallback(@androidx.annotation.DrawableRes int r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.fallback(r1)
            com.flextv.livestore.utils.GlideOptions r1 = (com.flextv.livestore.utils.GlideOptions) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideOptions fallback(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.fallback(r1)
            com.flextv.livestore.utils.GlideOptions r1 = (com.flextv.livestore.utils.GlideOptions) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions fitCenter() {
            r1 = this;
            com.flextv.livestore.utils.GlideOptions r0 = r1.fitCenter()
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideOptions fitCenter() {
            r1 = this;
            com.bumptech.glide.request.BaseRequestOptions r0 = super.fitCenter()
            com.flextv.livestore.utils.GlideOptions r0 = (com.flextv.livestore.utils.GlideOptions) r0
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions format(@androidx.annotation.NonNull com.bumptech.glide.load.DecodeFormat r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideOptions r1 = r0.format(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideOptions format(@androidx.annotation.NonNull com.bumptech.glide.load.DecodeFormat r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.format(r1)
            com.flextv.livestore.utils.GlideOptions r1 = (com.flextv.livestore.utils.GlideOptions) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions frame(@androidx.annotation.IntRange(from = 0) long r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideOptions r1 = r0.frame(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideOptions frame(@androidx.annotation.IntRange(from = 0) long r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.frame(r1)
            com.flextv.livestore.utils.GlideOptions r1 = (com.flextv.livestore.utils.GlideOptions) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions lock() {
            r1 = this;
            com.flextv.livestore.utils.GlideOptions r0 = r1.lock()
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    public com.flextv.livestore.utils.GlideOptions lock() {
            r1 = this;
            com.bumptech.glide.request.BaseRequestOptions r0 = super.lock()
            com.flextv.livestore.utils.GlideOptions r0 = (com.flextv.livestore.utils.GlideOptions) r0
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions onlyRetrieveFromCache(boolean r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideOptions r1 = r0.onlyRetrieveFromCache(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideOptions onlyRetrieveFromCache(boolean r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.onlyRetrieveFromCache(r1)
            com.flextv.livestore.utils.GlideOptions r1 = (com.flextv.livestore.utils.GlideOptions) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions optionalCenterCrop() {
            r1 = this;
            com.flextv.livestore.utils.GlideOptions r0 = r1.optionalCenterCrop()
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideOptions optionalCenterCrop() {
            r1 = this;
            com.bumptech.glide.request.BaseRequestOptions r0 = super.optionalCenterCrop()
            com.flextv.livestore.utils.GlideOptions r0 = (com.flextv.livestore.utils.GlideOptions) r0
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions optionalCenterInside() {
            r1 = this;
            com.flextv.livestore.utils.GlideOptions r0 = r1.optionalCenterInside()
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideOptions optionalCenterInside() {
            r1 = this;
            com.bumptech.glide.request.BaseRequestOptions r0 = super.optionalCenterInside()
            com.flextv.livestore.utils.GlideOptions r0 = (com.flextv.livestore.utils.GlideOptions) r0
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions optionalCircleCrop() {
            r1 = this;
            com.flextv.livestore.utils.GlideOptions r0 = r1.optionalCircleCrop()
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideOptions optionalCircleCrop() {
            r1 = this;
            com.bumptech.glide.request.BaseRequestOptions r0 = super.optionalCircleCrop()
            com.flextv.livestore.utils.GlideOptions r0 = (com.flextv.livestore.utils.GlideOptions) r0
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions optionalFitCenter() {
            r1 = this;
            com.flextv.livestore.utils.GlideOptions r0 = r1.optionalFitCenter()
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideOptions optionalFitCenter() {
            r1 = this;
            com.bumptech.glide.request.BaseRequestOptions r0 = super.optionalFitCenter()
            com.flextv.livestore.utils.GlideOptions r0 = (com.flextv.livestore.utils.GlideOptions) r0
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions optionalTransform(@androidx.annotation.NonNull com.bumptech.glide.load.Transformation r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideOptions r1 = r0.optionalTransform(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions optionalTransform(@androidx.annotation.NonNull java.lang.Class r1, @androidx.annotation.NonNull com.bumptech.glide.load.Transformation r2) {
            r0 = this;
            com.flextv.livestore.utils.GlideOptions r1 = r0.optionalTransform(r1, r2)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideOptions optionalTransform(@androidx.annotation.NonNull com.bumptech.glide.load.Transformation<android.graphics.Bitmap> r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.optionalTransform(r1)
            com.flextv.livestore.utils.GlideOptions r1 = (com.flextv.livestore.utils.GlideOptions) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public <Y> com.flextv.livestore.utils.GlideOptions optionalTransform(@androidx.annotation.NonNull java.lang.Class<Y> r1, @androidx.annotation.NonNull com.bumptech.glide.load.Transformation<Y> r2) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.optionalTransform(r1, r2)
            com.flextv.livestore.utils.GlideOptions r1 = (com.flextv.livestore.utils.GlideOptions) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions override(int r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideOptions r1 = r0.override(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions override(int r1, int r2) {
            r0 = this;
            com.flextv.livestore.utils.GlideOptions r1 = r0.override(r1, r2)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideOptions override(int r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.override(r1)
            com.flextv.livestore.utils.GlideOptions r1 = (com.flextv.livestore.utils.GlideOptions) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideOptions override(int r1, int r2) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.override(r1, r2)
            com.flextv.livestore.utils.GlideOptions r1 = (com.flextv.livestore.utils.GlideOptions) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions placeholder(@androidx.annotation.DrawableRes int r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideOptions r1 = r0.placeholder(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions placeholder(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideOptions r1 = r0.placeholder(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideOptions placeholder(@androidx.annotation.DrawableRes int r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.placeholder(r1)
            com.flextv.livestore.utils.GlideOptions r1 = (com.flextv.livestore.utils.GlideOptions) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideOptions placeholder(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.placeholder(r1)
            com.flextv.livestore.utils.GlideOptions r1 = (com.flextv.livestore.utils.GlideOptions) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions priority(@androidx.annotation.NonNull com.bumptech.glide.Priority r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideOptions r1 = r0.priority(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideOptions priority(@androidx.annotation.NonNull com.bumptech.glide.Priority r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.priority(r1)
            com.flextv.livestore.utils.GlideOptions r1 = (com.flextv.livestore.utils.GlideOptions) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions set(@androidx.annotation.NonNull com.bumptech.glide.load.Option r1, @androidx.annotation.NonNull java.lang.Object r2) {
            r0 = this;
            com.flextv.livestore.utils.GlideOptions r1 = r0.set(r1, r2)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public <Y> com.flextv.livestore.utils.GlideOptions set(@androidx.annotation.NonNull com.bumptech.glide.load.Option<Y> r1, @androidx.annotation.NonNull Y r2) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.set(r1, r2)
            com.flextv.livestore.utils.GlideOptions r1 = (com.flextv.livestore.utils.GlideOptions) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions signature(@androidx.annotation.NonNull com.bumptech.glide.load.Key r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideOptions r1 = r0.signature(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideOptions signature(@androidx.annotation.NonNull com.bumptech.glide.load.Key r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.signature(r1)
            com.flextv.livestore.utils.GlideOptions r1 = (com.flextv.livestore.utils.GlideOptions) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions sizeMultiplier(@androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideOptions r1 = r0.sizeMultiplier(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideOptions sizeMultiplier(@androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.sizeMultiplier(r1)
            com.flextv.livestore.utils.GlideOptions r1 = (com.flextv.livestore.utils.GlideOptions) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions skipMemoryCache(boolean r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideOptions r1 = r0.skipMemoryCache(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideOptions skipMemoryCache(boolean r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.skipMemoryCache(r1)
            com.flextv.livestore.utils.GlideOptions r1 = (com.flextv.livestore.utils.GlideOptions) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions theme(@androidx.annotation.Nullable android.content.res.Resources.Theme r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideOptions r1 = r0.theme(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideOptions theme(@androidx.annotation.Nullable android.content.res.Resources.Theme r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.theme(r1)
            com.flextv.livestore.utils.GlideOptions r1 = (com.flextv.livestore.utils.GlideOptions) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions timeout(@androidx.annotation.IntRange(from = 0) int r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideOptions r1 = r0.timeout(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideOptions timeout(@androidx.annotation.IntRange(from = 0) int r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.timeout(r1)
            com.flextv.livestore.utils.GlideOptions r1 = (com.flextv.livestore.utils.GlideOptions) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions transform(@androidx.annotation.NonNull com.bumptech.glide.load.Transformation r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideOptions r1 = r0.transform(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions transform(@androidx.annotation.NonNull java.lang.Class r1, @androidx.annotation.NonNull com.bumptech.glide.load.Transformation r2) {
            r0 = this;
            com.flextv.livestore.utils.GlideOptions r1 = r0.transform(r1, r2)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @java.lang.SafeVarargs
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions transform(@androidx.annotation.NonNull com.bumptech.glide.load.Transformation[] r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideOptions r1 = r0.transform(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideOptions transform(@androidx.annotation.NonNull com.bumptech.glide.load.Transformation<android.graphics.Bitmap> r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.transform(r1)
            com.flextv.livestore.utils.GlideOptions r1 = (com.flextv.livestore.utils.GlideOptions) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public <Y> com.flextv.livestore.utils.GlideOptions transform(@androidx.annotation.NonNull java.lang.Class<Y> r1, @androidx.annotation.NonNull com.bumptech.glide.load.Transformation<Y> r2) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.transform(r1, r2)
            com.flextv.livestore.utils.GlideOptions r1 = (com.flextv.livestore.utils.GlideOptions) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @java.lang.SafeVarargs
    @androidx.annotation.CheckResult
    public final com.flextv.livestore.utils.GlideOptions transform(@androidx.annotation.NonNull com.bumptech.glide.load.Transformation<android.graphics.Bitmap>... r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.transform(r1)
            com.flextv.livestore.utils.GlideOptions r1 = (com.flextv.livestore.utils.GlideOptions) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @java.lang.Deprecated
    @java.lang.SafeVarargs
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions transforms(@androidx.annotation.NonNull com.bumptech.glide.load.Transformation[] r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideOptions r1 = r0.transforms(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @java.lang.Deprecated
    @java.lang.SafeVarargs
    @androidx.annotation.CheckResult
    public final com.flextv.livestore.utils.GlideOptions transforms(@androidx.annotation.NonNull com.bumptech.glide.load.Transformation<android.graphics.Bitmap>... r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.transforms(r1)
            com.flextv.livestore.utils.GlideOptions r1 = (com.flextv.livestore.utils.GlideOptions) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions useAnimationPool(boolean r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideOptions r1 = r0.useAnimationPool(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideOptions useAnimationPool(boolean r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.useAnimationPool(r1)
            com.flextv.livestore.utils.GlideOptions r1 = (com.flextv.livestore.utils.GlideOptions) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions useUnlimitedSourceGeneratorsPool(boolean r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideOptions r1 = r0.useUnlimitedSourceGeneratorsPool(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideOptions useUnlimitedSourceGeneratorsPool(boolean r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.useUnlimitedSourceGeneratorsPool(r1)
            com.flextv.livestore.utils.GlideOptions r1 = (com.flextv.livestore.utils.GlideOptions) r1
            return r1
    }
}
