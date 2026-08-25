package com.flextv.livestore.utils;

/* JADX INFO: loaded from: classes2.dex */
public class GlideRequests extends com.bumptech.glide.RequestManager {
    public GlideRequests(@androidx.annotation.NonNull com.bumptech.glide.Glide r1, @androidx.annotation.NonNull com.bumptech.glide.manager.Lifecycle r2, @androidx.annotation.NonNull com.bumptech.glide.manager.RequestManagerTreeNode r3, @androidx.annotation.NonNull android.content.Context r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @Override // com.bumptech.glide.RequestManager
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestManager addDefaultRequestListener(com.bumptech.glide.request.RequestListener r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequests r1 = r0.addDefaultRequestListener(r1)
            return r1
    }

    @Override // com.bumptech.glide.RequestManager
    @androidx.annotation.NonNull
    public com.flextv.livestore.utils.GlideRequests addDefaultRequestListener(com.bumptech.glide.request.RequestListener<java.lang.Object> r1) {
            r0 = this;
            com.bumptech.glide.RequestManager r1 = super.addDefaultRequestListener(r1)
            com.flextv.livestore.utils.GlideRequests r1 = (com.flextv.livestore.utils.GlideRequests) r1
            return r1
    }

    @Override // com.bumptech.glide.RequestManager
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestManager applyDefaultRequestOptions(@androidx.annotation.NonNull com.bumptech.glide.request.RequestOptions r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequests r1 = r0.applyDefaultRequestOptions(r1)
            return r1
    }

    @Override // com.bumptech.glide.RequestManager
    @androidx.annotation.NonNull
    public synchronized com.flextv.livestore.utils.GlideRequests applyDefaultRequestOptions(@androidx.annotation.NonNull com.bumptech.glide.request.RequestOptions r1) {
            r0 = this;
            monitor-enter(r0)
            com.bumptech.glide.RequestManager r1 = super.applyDefaultRequestOptions(r1)     // Catch: java.lang.Throwable -> L9
            com.flextv.livestore.utils.GlideRequests r1 = (com.flextv.livestore.utils.GlideRequests) r1     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)
            return r1
        L9:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // com.bumptech.glide.RequestManager
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder as(@androidx.annotation.NonNull java.lang.Class r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.as(r1)
            return r1
    }

    @Override // com.bumptech.glide.RequestManager
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public <ResourceType> com.flextv.livestore.utils.GlideRequest<ResourceType> as(@androidx.annotation.NonNull java.lang.Class<ResourceType> r4) {
            r3 = this;
            com.flextv.livestore.utils.GlideRequest r0 = new com.flextv.livestore.utils.GlideRequest
            com.bumptech.glide.Glide r1 = r3.glide
            android.content.Context r2 = r3.context
            r0.<init>(r1, r3, r4, r2)
            return r0
    }

    @Override // com.bumptech.glide.RequestManager
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder asBitmap() {
            r1 = this;
            com.flextv.livestore.utils.GlideRequest r0 = r1.asBitmap()
            return r0
    }

    @Override // com.bumptech.glide.RequestManager
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<android.graphics.Bitmap> asBitmap() {
            r1 = this;
            com.bumptech.glide.RequestBuilder r0 = super.asBitmap()
            com.flextv.livestore.utils.GlideRequest r0 = (com.flextv.livestore.utils.GlideRequest) r0
            return r0
    }

    @Override // com.bumptech.glide.RequestManager
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder asDrawable() {
            r1 = this;
            com.flextv.livestore.utils.GlideRequest r0 = r1.asDrawable()
            return r0
    }

    @Override // com.bumptech.glide.RequestManager
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<android.graphics.drawable.Drawable> asDrawable() {
            r1 = this;
            com.bumptech.glide.RequestBuilder r0 = super.asDrawable()
            com.flextv.livestore.utils.GlideRequest r0 = (com.flextv.livestore.utils.GlideRequest) r0
            return r0
    }

    @Override // com.bumptech.glide.RequestManager
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder asFile() {
            r1 = this;
            com.flextv.livestore.utils.GlideRequest r0 = r1.asFile()
            return r0
    }

    @Override // com.bumptech.glide.RequestManager
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<java.io.File> asFile() {
            r1 = this;
            com.bumptech.glide.RequestBuilder r0 = super.asFile()
            com.flextv.livestore.utils.GlideRequest r0 = (com.flextv.livestore.utils.GlideRequest) r0
            return r0
    }

    @Override // com.bumptech.glide.RequestManager
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder asGif() {
            r1 = this;
            com.flextv.livestore.utils.GlideRequest r0 = r1.asGif()
            return r0
    }

    @Override // com.bumptech.glide.RequestManager
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<com.bumptech.glide.load.resource.gif.GifDrawable> asGif() {
            r1 = this;
            com.bumptech.glide.RequestBuilder r0 = super.asGif()
            com.flextv.livestore.utils.GlideRequest r0 = (com.flextv.livestore.utils.GlideRequest) r0
            return r0
    }

    @Override // com.bumptech.glide.RequestManager
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder download(@androidx.annotation.Nullable java.lang.Object r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.download(r1)
            return r1
    }

    @Override // com.bumptech.glide.RequestManager
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<java.io.File> download(@androidx.annotation.Nullable java.lang.Object r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = super.download(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.RequestManager
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder downloadOnly() {
            r1 = this;
            com.flextv.livestore.utils.GlideRequest r0 = r1.downloadOnly()
            return r0
    }

    @Override // com.bumptech.glide.RequestManager
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.flextv.livestore.utils.GlideRequest<java.io.File> downloadOnly() {
            r1 = this;
            com.bumptech.glide.RequestBuilder r0 = super.downloadOnly()
            com.flextv.livestore.utils.GlideRequest r0 = (com.flextv.livestore.utils.GlideRequest) r0
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.RequestManager, com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@androidx.annotation.Nullable android.graphics.Bitmap r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.load2(r1)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.RequestManager, com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.load2(r1)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.RequestManager, com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@androidx.annotation.Nullable android.net.Uri r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.load2(r1)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.RequestManager, com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@androidx.annotation.Nullable java.io.File r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.load2(r1)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.RequestManager, com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@androidx.annotation.Nullable @androidx.annotation.DrawableRes @androidx.annotation.RawRes java.lang.Integer r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.load2(r1)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.RequestManager, com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@androidx.annotation.Nullable java.lang.Object r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.load2(r1)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.RequestManager, com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@androidx.annotation.Nullable java.lang.String r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.load2(r1)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.RequestManager, com.bumptech.glide.ModelTypes
    @androidx.annotation.CheckResult
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@androidx.annotation.Nullable java.net.URL r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.load2(r1)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.RequestManager, com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@androidx.annotation.Nullable byte[] r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.load2(r1)
            return r1
    }

    @Override // com.bumptech.glide.RequestManager, com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    /* JADX INFO: renamed from: load, reason: avoid collision after fix types in other method */
    public com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load2(@androidx.annotation.Nullable android.graphics.Bitmap r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = super.load(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.RequestManager, com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    /* JADX INFO: renamed from: load, reason: avoid collision after fix types in other method */
    public com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load2(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = super.load(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.RequestManager, com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    /* JADX INFO: renamed from: load, reason: avoid collision after fix types in other method */
    public com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load2(@androidx.annotation.Nullable android.net.Uri r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = super.load(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.RequestManager, com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    /* JADX INFO: renamed from: load, reason: avoid collision after fix types in other method */
    public com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load2(@androidx.annotation.Nullable java.io.File r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = super.load(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.RequestManager, com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    /* JADX INFO: renamed from: load, reason: avoid collision after fix types in other method */
    public com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load2(@androidx.annotation.Nullable @androidx.annotation.DrawableRes @androidx.annotation.RawRes java.lang.Integer r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = super.load(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.RequestManager, com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    /* JADX INFO: renamed from: load, reason: avoid collision after fix types in other method */
    public com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load2(@androidx.annotation.Nullable java.lang.Object r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = super.load(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.RequestManager, com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    /* JADX INFO: renamed from: load, reason: avoid collision after fix types in other method */
    public com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load2(@androidx.annotation.Nullable java.lang.String r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = super.load(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.RequestManager, com.bumptech.glide.ModelTypes
    @androidx.annotation.CheckResult
    @java.lang.Deprecated
    /* JADX INFO: renamed from: load, reason: avoid collision after fix types in other method */
    public com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load2(@androidx.annotation.Nullable java.net.URL r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = super.load(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.RequestManager, com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    /* JADX INFO: renamed from: load, reason: avoid collision after fix types in other method */
    public com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load2(@androidx.annotation.Nullable byte[] r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = super.load(r1)
            com.flextv.livestore.utils.GlideRequest r1 = (com.flextv.livestore.utils.GlideRequest) r1
            return r1
    }

    @Override // com.bumptech.glide.RequestManager, com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@androidx.annotation.Nullable android.graphics.Bitmap r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.load2(r1)
            return r1
    }

    @Override // com.bumptech.glide.RequestManager, com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.load2(r1)
            return r1
    }

    @Override // com.bumptech.glide.RequestManager, com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@androidx.annotation.Nullable android.net.Uri r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.load2(r1)
            return r1
    }

    @Override // com.bumptech.glide.RequestManager, com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@androidx.annotation.Nullable java.io.File r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.load2(r1)
            return r1
    }

    @Override // com.bumptech.glide.RequestManager, com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@androidx.annotation.Nullable @androidx.annotation.DrawableRes @androidx.annotation.RawRes java.lang.Integer r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.load2(r1)
            return r1
    }

    @Override // com.bumptech.glide.RequestManager, com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@androidx.annotation.Nullable java.lang.Object r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.load2(r1)
            return r1
    }

    @Override // com.bumptech.glide.RequestManager, com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@androidx.annotation.Nullable java.lang.String r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.load2(r1)
            return r1
    }

    @Override // com.bumptech.glide.RequestManager, com.bumptech.glide.ModelTypes
    @androidx.annotation.CheckResult
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@androidx.annotation.Nullable java.net.URL r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.load2(r1)
            return r1
    }

    @Override // com.bumptech.glide.RequestManager, com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@androidx.annotation.Nullable byte[] r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequest r1 = r0.load2(r1)
            return r1
    }

    @Override // com.bumptech.glide.RequestManager
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestManager setDefaultRequestOptions(@androidx.annotation.NonNull com.bumptech.glide.request.RequestOptions r1) {
            r0 = this;
            com.flextv.livestore.utils.GlideRequests r1 = r0.setDefaultRequestOptions(r1)
            return r1
    }

    @Override // com.bumptech.glide.RequestManager
    @androidx.annotation.NonNull
    public synchronized com.flextv.livestore.utils.GlideRequests setDefaultRequestOptions(@androidx.annotation.NonNull com.bumptech.glide.request.RequestOptions r1) {
            r0 = this;
            monitor-enter(r0)
            com.bumptech.glide.RequestManager r1 = super.setDefaultRequestOptions(r1)     // Catch: java.lang.Throwable -> L9
            com.flextv.livestore.utils.GlideRequests r1 = (com.flextv.livestore.utils.GlideRequests) r1     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)
            return r1
        L9:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // com.bumptech.glide.RequestManager
    public final void setRequestOptions(@androidx.annotation.NonNull com.bumptech.glide.request.RequestOptions r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.flextv.livestore.utils.GlideOptions
            if (r0 == 0) goto L8
            super.setRequestOptions(r2)
            goto L14
        L8:
            com.flextv.livestore.utils.GlideOptions r0 = new com.flextv.livestore.utils.GlideOptions
            r0.<init>()
            com.flextv.livestore.utils.GlideOptions r2 = r0.apply(r2)
            super.setRequestOptions(r2)
        L14:
            return
    }
}
