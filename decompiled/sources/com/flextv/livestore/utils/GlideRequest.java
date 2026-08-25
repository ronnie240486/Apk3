package com.flextv.livestore.utils;

/* JADX INFO: loaded from: classes.dex */
public class GlideRequest<TranscodeType> extends com.bumptech.glide.RequestBuilder<TranscodeType> {
    public GlideRequest(@androidx.annotation.NonNull com.bumptech.glide.Glide r1, @androidx.annotation.NonNull com.bumptech.glide.RequestManager r2, @androidx.annotation.NonNull java.lang.Class<TranscodeType> r3, @androidx.annotation.NonNull android.content.Context r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public GlideRequest(@androidx.annotation.NonNull java.lang.Class<TranscodeType> r1, @androidx.annotation.NonNull com.bumptech.glide.RequestBuilder<?> r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.bumptech.glide.RequestBuilder
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder addListener(@androidx.annotation.Nullable com.bumptech.glide.request.RequestListener r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.addListener(r1)
            return r1
    }

    @Override // com.bumptech.glide.RequestBuilder
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> addListener(@androidx.annotation.Nullable com.bumptech.glide.request.RequestListener<TranscodeType> r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = super.addListener(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder apply(@androidx.annotation.NonNull com.bumptech.glide.request.BaseRequestOptions r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.apply(r1)
            return r1
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions apply(@androidx.annotation.NonNull com.bumptech.glide.request.BaseRequestOptions r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.apply(r1)
            return r1
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> apply(@androidx.annotation.NonNull com.bumptech.glide.request.BaseRequestOptions<?> r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = super.apply(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions autoClone() {
            r1 = this;
            com.flextv.livestore.utils.GlideRequest r0 = r1.autoClone()
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> autoClone() {
            r1 = this;
            com.bumptech.glide.request.BaseRequestOptions r0 = super.autoClone()
            com.flextv.livestore.utils.GlideRequest r0 = (com.flextv.livestore.utils.GlideRequest) r0
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions centerCrop() {
            r1 = this;
            com.flextv.livestore.utils.GlideRequest r0 = r1.centerCrop()
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> centerCrop() {
            r1 = this;
            com.bumptech.glide.request.BaseRequestOptions r0 = super.centerCrop()
            com.flextv.livestore.utils.GlideRequest r0 = (com.flextv.livestore.utils.GlideRequest) r0
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions centerInside() {
            r1 = this;
            com.flextv.livestore.utils.GlideRequest r0 = r1.centerInside()
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> centerInside() {
            r1 = this;
            com.bumptech.glide.request.BaseRequestOptions r0 = super.centerInside()
            com.flextv.livestore.utils.GlideRequest r0 = (com.flextv.livestore.utils.GlideRequest) r0
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions circleCrop() {
            r1 = this;
            com.flextv.livestore.utils.GlideRequest r0 = r1.circleCrop()
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> circleCrop() {
            r1 = this;
            com.bumptech.glide.request.BaseRequestOptions r0 = super.circleCrop()
            com.flextv.livestore.utils.GlideRequest r0 = (com.flextv.livestore.utils.GlideRequest) r0
            return r0
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder clone() {
            r1 = this;
            com.flextv.livestore.utils.GlideRequest r0 = r1.clone()
            return r0
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions clone() {
            r1 = this;
            com.flextv.livestore.utils.GlideRequest r0 = r1.clone()
            return r0
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> clone() {
            r1 = this;
            com.bumptech.glide.RequestBuilder r0 = super.clone()
            com.flextv.livestore.utils.GlideRequest r0 = (com.flextv.livestore.utils.GlideRequest) r0
            return r0
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.CheckResult
    /* JADX INFO: renamed from: clone */
    public /* bridge */ /* synthetic */ java.lang.Object mo45clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.flextv.livestore.utils.GlideRequest r0 = r1.clone()
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions decode(@androidx.annotation.NonNull java.lang.Class r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.decode(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> decode(@androidx.annotation.NonNull java.lang.Class<?> r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.decode(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions disallowHardwareConfig() {
            r1 = this;
            com.flextv.livestore.utils.GlideRequest r0 = r1.disallowHardwareConfig()
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> disallowHardwareConfig() {
            r1 = this;
            com.bumptech.glide.request.BaseRequestOptions r0 = super.disallowHardwareConfig()
            com.flextv.livestore.utils.GlideRequest r0 = (com.flextv.livestore.utils.GlideRequest) r0
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions diskCacheStrategy(@androidx.annotation.NonNull com.bumptech.glide.load.engine.DiskCacheStrategy r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.diskCacheStrategy(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> diskCacheStrategy(@androidx.annotation.NonNull com.bumptech.glide.load.engine.DiskCacheStrategy r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.diskCacheStrategy(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions dontAnimate() {
            r1 = this;
            com.flextv.livestore.utils.GlideRequest r0 = r1.dontAnimate()
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> dontAnimate() {
            r1 = this;
            com.bumptech.glide.request.BaseRequestOptions r0 = super.dontAnimate()
            com.flextv.livestore.utils.GlideRequest r0 = (com.flextv.livestore.utils.GlideRequest) r0
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions dontTransform() {
            r1 = this;
            com.flextv.livestore.utils.GlideRequest r0 = r1.dontTransform()
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> dontTransform() {
            r1 = this;
            com.bumptech.glide.request.BaseRequestOptions r0 = super.dontTransform()
            com.flextv.livestore.utils.GlideRequest r0 = (com.flextv.livestore.utils.GlideRequest) r0
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions downsample(@androidx.annotation.NonNull com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.downsample(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> downsample(@androidx.annotation.NonNull com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.downsample(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions encodeFormat(@androidx.annotation.NonNull android.graphics.Bitmap.CompressFormat r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.encodeFormat(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> encodeFormat(@androidx.annotation.NonNull android.graphics.Bitmap.CompressFormat r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.encodeFormat(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions encodeQuality(@androidx.annotation.IntRange(from = 0, to = 100) int r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.encodeQuality(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> encodeQuality(@androidx.annotation.IntRange(from = 0, to = 100) int r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.encodeQuality(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.RequestBuilder
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder error(@androidx.annotation.Nullable com.bumptech.glide.RequestBuilder r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.error(r1)
            return r1
    }

    @Override // com.bumptech.glide.RequestBuilder
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder error(java.lang.Object r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.error(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions error(@androidx.annotation.DrawableRes int r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.error(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions error(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.error(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> error(@androidx.annotation.DrawableRes int r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.error(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> error(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.error(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.RequestBuilder
    @androidx.annotation.NonNull
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> error(@androidx.annotation.Nullable com.bumptech.glide.RequestBuilder<TranscodeType> r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = super.error(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.RequestBuilder
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> error(java.lang.Object r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = super.error(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions fallback(@androidx.annotation.DrawableRes int r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.fallback(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions fallback(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.fallback(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> fallback(@androidx.annotation.DrawableRes int r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.fallback(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> fallback(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.fallback(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions fitCenter() {
            r1 = this;
            com.flextv.livestore.utils.GlideRequest r0 = r1.fitCenter()
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> fitCenter() {
            r1 = this;
            com.bumptech.glide.request.BaseRequestOptions r0 = super.fitCenter()
            com.flextv.livestore.utils.GlideRequest r0 = (com.flextv.livestore.utils.GlideRequest) r0
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions format(@androidx.annotation.NonNull com.bumptech.glide.load.DecodeFormat r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.format(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> format(@androidx.annotation.NonNull com.bumptech.glide.load.DecodeFormat r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.format(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions frame(@androidx.annotation.IntRange(from = 0) long r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.frame(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> frame(@androidx.annotation.IntRange(from = 0) long r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.frame(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.RequestBuilder
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public final com.bumptech.glide.RequestBuilder getDownloadOnlyRequest() {
            r2 = this;
            com.flextv.livestore.utils.GlideRequest r0 = new com.flextv.livestore.utils.GlideRequest
            java.lang.Class<java.io.File> r1 = java.io.File.class
            r0.<init>(r1, r2)
            com.bumptech.glide.request.RequestOptions r1 = com.bumptech.glide.RequestBuilder.DOWNLOAD_ONLY_OPTIONS
            com.flextv.livestore.utils.GlideRequest r0 = r0.apply(r1)
            return r0
    }

    @Override // com.bumptech.glide.RequestBuilder
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder listener(@androidx.annotation.Nullable com.bumptech.glide.request.RequestListener r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.listener(r1)
            return r1
    }

    @Override // com.bumptech.glide.RequestBuilder
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> listener(@androidx.annotation.Nullable com.bumptech.glide.request.RequestListener<TranscodeType> r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = super.listener(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder load(@androidx.annotation.Nullable android.graphics.Bitmap r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.load(r1)
            return r1
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder load(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.load(r1)
            return r1
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder load(@androidx.annotation.Nullable android.net.Uri r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.load(r1)
            return r1
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder load(@androidx.annotation.Nullable java.io.File r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.load(r1)
            return r1
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder load(@androidx.annotation.Nullable @androidx.annotation.DrawableRes @androidx.annotation.RawRes java.lang.Integer r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.load(r1)
            return r1
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder load(@androidx.annotation.Nullable java.lang.Object r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.load(r1)
            return r1
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder load(@androidx.annotation.Nullable java.lang.String r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.load(r1)
            return r1
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.ModelTypes
    @androidx.annotation.CheckResult
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder load(@androidx.annotation.Nullable java.net.URL r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.load(r1)
            return r1
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder load(@androidx.annotation.Nullable byte[] r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.load(r1)
            return r1
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> load(@androidx.annotation.Nullable android.graphics.Bitmap r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = super.load(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> load(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = super.load(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> load(@androidx.annotation.Nullable android.net.Uri r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = super.load(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> load(@androidx.annotation.Nullable java.io.File r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = super.load(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> load(@androidx.annotation.Nullable @androidx.annotation.DrawableRes @androidx.annotation.RawRes java.lang.Integer r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = super.load(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> load(@androidx.annotation.Nullable java.lang.Object r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = super.load(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> load(@androidx.annotation.Nullable java.lang.String r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = super.load(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.ModelTypes
    @androidx.annotation.CheckResult
    @java.lang.Deprecated
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> load(@androidx.annotation.Nullable java.net.URL r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = super.load(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> load(@androidx.annotation.Nullable byte[] r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = super.load(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ java.lang.Object load(@androidx.annotation.Nullable android.graphics.Bitmap r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.load(r1)
            return r1
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ java.lang.Object load(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.load(r1)
            return r1
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ java.lang.Object load(@androidx.annotation.Nullable android.net.Uri r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.load(r1)
            return r1
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ java.lang.Object load(@androidx.annotation.Nullable java.io.File r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.load(r1)
            return r1
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ java.lang.Object load(@androidx.annotation.Nullable @androidx.annotation.DrawableRes @androidx.annotation.RawRes java.lang.Integer r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.load(r1)
            return r1
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ java.lang.Object load(@androidx.annotation.Nullable java.lang.Object r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.load(r1)
            return r1
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ java.lang.Object load(@androidx.annotation.Nullable java.lang.String r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.load(r1)
            return r1
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.ModelTypes
    @androidx.annotation.CheckResult
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ java.lang.Object load(@androidx.annotation.Nullable java.net.URL r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.load(r1)
            return r1
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ java.lang.Object load(@androidx.annotation.Nullable byte[] r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.load(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions lock() {
            r1 = this;
            com.flextv.livestore.utils.GlideRequest r0 = r1.lock()
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> lock() {
            r1 = this;
            com.bumptech.glide.request.BaseRequestOptions r0 = super.lock()
            com.flextv.livestore.utils.GlideRequest r0 = (com.flextv.livestore.utils.GlideRequest) r0
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions onlyRetrieveFromCache(boolean r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.onlyRetrieveFromCache(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> onlyRetrieveFromCache(boolean r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.onlyRetrieveFromCache(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions optionalCenterCrop() {
            r1 = this;
            com.flextv.livestore.utils.GlideRequest r0 = r1.optionalCenterCrop()
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> optionalCenterCrop() {
            r1 = this;
            com.bumptech.glide.request.BaseRequestOptions r0 = super.optionalCenterCrop()
            com.flextv.livestore.utils.GlideRequest r0 = (com.flextv.livestore.utils.GlideRequest) r0
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions optionalCenterInside() {
            r1 = this;
            com.flextv.livestore.utils.GlideRequest r0 = r1.optionalCenterInside()
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> optionalCenterInside() {
            r1 = this;
            com.bumptech.glide.request.BaseRequestOptions r0 = super.optionalCenterInside()
            com.flextv.livestore.utils.GlideRequest r0 = (com.flextv.livestore.utils.GlideRequest) r0
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions optionalCircleCrop() {
            r1 = this;
            com.flextv.livestore.utils.GlideRequest r0 = r1.optionalCircleCrop()
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> optionalCircleCrop() {
            r1 = this;
            com.bumptech.glide.request.BaseRequestOptions r0 = super.optionalCircleCrop()
            com.flextv.livestore.utils.GlideRequest r0 = (com.flextv.livestore.utils.GlideRequest) r0
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions optionalFitCenter() {
            r1 = this;
            com.flextv.livestore.utils.GlideRequest r0 = r1.optionalFitCenter()
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> optionalFitCenter() {
            r1 = this;
            com.bumptech.glide.request.BaseRequestOptions r0 = super.optionalFitCenter()
            com.flextv.livestore.utils.GlideRequest r0 = (com.flextv.livestore.utils.GlideRequest) r0
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions optionalTransform(@androidx.annotation.NonNull com.bumptech.glide.load.Transformation r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.optionalTransform(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions optionalTransform(@androidx.annotation.NonNull java.lang.Class r1, @androidx.annotation.NonNull com.bumptech.glide.load.Transformation r2) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.optionalTransform(r1, r2)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> optionalTransform(@androidx.annotation.NonNull com.bumptech.glide.load.Transformation<android.graphics.Bitmap> r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.optionalTransform(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public <Y> com.flextv.livestore.utils.GlideRequest<TranscodeType> optionalTransform(@androidx.annotation.NonNull java.lang.Class<Y> r1, @androidx.annotation.NonNull com.bumptech.glide.load.Transformation<Y> r2) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.optionalTransform(r1, r2)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions override(int r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.override(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions override(int r1, int r2) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.override(r1, r2)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> override(int r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.override(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> override(int r1, int r2) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.override(r1, r2)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions placeholder(@androidx.annotation.DrawableRes int r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.placeholder(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions placeholder(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.placeholder(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> placeholder(@androidx.annotation.DrawableRes int r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.placeholder(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> placeholder(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.placeholder(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions priority(@androidx.annotation.NonNull com.bumptech.glide.Priority r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.priority(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> priority(@androidx.annotation.NonNull com.bumptech.glide.Priority r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.priority(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions set(@androidx.annotation.NonNull com.bumptech.glide.load.Option r1, @androidx.annotation.NonNull java.lang.Object r2) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.set(r1, r2)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public <Y> com.flextv.livestore.utils.GlideRequest<TranscodeType> set(@androidx.annotation.NonNull com.bumptech.glide.load.Option<Y> r1, @androidx.annotation.NonNull Y r2) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.set(r1, r2)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions signature(@androidx.annotation.NonNull com.bumptech.glide.load.Key r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.signature(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> signature(@androidx.annotation.NonNull com.bumptech.glide.load.Key r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.signature(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions sizeMultiplier(@androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.sizeMultiplier(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> sizeMultiplier(@androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.sizeMultiplier(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions skipMemoryCache(boolean r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.skipMemoryCache(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> skipMemoryCache(boolean r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.skipMemoryCache(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions theme(@androidx.annotation.Nullable android.content.res.Resources.Theme r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.theme(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> theme(@androidx.annotation.Nullable android.content.res.Resources.Theme r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.theme(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.RequestBuilder
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder thumbnail(float r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.thumbnail(r1)
            return r1
    }

    @Override // com.bumptech.glide.RequestBuilder
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder thumbnail(@androidx.annotation.Nullable com.bumptech.glide.RequestBuilder r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.thumbnail(r1)
            return r1
    }

    @Override // com.bumptech.glide.RequestBuilder
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder thumbnail(@androidx.annotation.Nullable java.util.List r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.thumbnail(r1)
            return r1
    }

    @Override // com.bumptech.glide.RequestBuilder
    @androidx.annotation.NonNull
    @java.lang.SafeVarargs
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder thumbnail(@androidx.annotation.Nullable com.bumptech.glide.RequestBuilder[] r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.thumbnail(r1)
            return r1
    }

    @Override // com.bumptech.glide.RequestBuilder
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> thumbnail(float r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = super.thumbnail(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.RequestBuilder
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> thumbnail(@androidx.annotation.Nullable com.bumptech.glide.RequestBuilder<TranscodeType> r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = super.thumbnail(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.RequestBuilder
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> thumbnail(@androidx.annotation.Nullable java.util.List<com.bumptech.glide.RequestBuilder<TranscodeType>> r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = super.thumbnail(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.RequestBuilder
    @androidx.annotation.NonNull
    @java.lang.SafeVarargs
    @androidx.annotation.CheckResult
    public final com.flextv.livestore.utils.GlideRequest<TranscodeType> thumbnail(@androidx.annotation.Nullable com.bumptech.glide.RequestBuilder<TranscodeType>... r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = super.thumbnail(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions timeout(@androidx.annotation.IntRange(from = 0) int r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.timeout(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> timeout(@androidx.annotation.IntRange(from = 0) int r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.timeout(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions transform(@androidx.annotation.NonNull com.bumptech.glide.load.Transformation r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.transform(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions transform(@androidx.annotation.NonNull java.lang.Class r1, @androidx.annotation.NonNull com.bumptech.glide.load.Transformation r2) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.transform(r1, r2)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions transform(@androidx.annotation.NonNull com.bumptech.glide.load.Transformation[] r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.transform(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> transform(@androidx.annotation.NonNull com.bumptech.glide.load.Transformation<android.graphics.Bitmap> r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.transform(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public <Y> com.flextv.livestore.utils.GlideRequest<TranscodeType> transform(@androidx.annotation.NonNull java.lang.Class<Y> r1, @androidx.annotation.NonNull com.bumptech.glide.load.Transformation<Y> r2) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.transform(r1, r2)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> transform(@androidx.annotation.NonNull com.bumptech.glide.load.Transformation<android.graphics.Bitmap>... r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.transform(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions transforms(@androidx.annotation.NonNull com.bumptech.glide.load.Transformation[] r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.transforms(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    @java.lang.Deprecated
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> transforms(@androidx.annotation.NonNull com.bumptech.glide.load.Transformation<android.graphics.Bitmap>... r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.transforms(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.RequestBuilder
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder transition(@androidx.annotation.NonNull com.bumptech.glide.TransitionOptions r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.transition(r1)
            return r1
    }

    @Override // com.bumptech.glide.RequestBuilder
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> transition(@androidx.annotation.NonNull com.bumptech.glide.TransitionOptions<?, ? super TranscodeType> r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = super.transition(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions useAnimationPool(boolean r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.useAnimationPool(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> useAnimationPool(boolean r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.useAnimationPool(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions useUnlimitedSourceGeneratorsPool(boolean r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.useUnlimitedSourceGeneratorsPool(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<TranscodeType> useUnlimitedSourceGeneratorsPool(boolean r1) {
            r0 = this;
            com.bumptech.glide.request.BaseRequestOptions r1 = super.useUnlimitedSourceGeneratorsPool(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }
}
