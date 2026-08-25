package com.bumptech.glide.load.resource.transcode;

/* JADX INFO: loaded from: classes.dex */
public class BitmapDrawableTranscoder implements com.bumptech.glide.load.resource.transcode.ResourceTranscoder<android.graphics.Bitmap, android.graphics.drawable.BitmapDrawable> {
    private final android.content.res.Resources resources;

    public BitmapDrawableTranscoder(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            android.content.res.Resources r1 = r1.getResources()
            r0.<init>(r1)
            return
    }

    public BitmapDrawableTranscoder(@androidx.annotation.NonNull android.content.res.Resources r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.bumptech.glide.util.Preconditions.checkNotNull(r1)
            android.content.res.Resources r1 = (android.content.res.Resources) r1
            r0.resources = r1
            return
    }

    @java.lang.Deprecated
    public BitmapDrawableTranscoder(@androidx.annotation.NonNull android.content.res.Resources r1, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.bumptech.glide.load.resource.transcode.ResourceTranscoder
    @androidx.annotation.Nullable
    public com.bumptech.glide.load.engine.Resource<android.graphics.drawable.BitmapDrawable> transcode(@androidx.annotation.NonNull com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> r1, @androidx.annotation.NonNull com.bumptech.glide.load.Options r2) {
            r0 = this;
            android.content.res.Resources r2 = r0.resources
            com.bumptech.glide.load.engine.Resource r1 = com.bumptech.glide.load.resource.bitmap.LazyBitmapDrawableResource.obtain(r2, r1)
            return r1
    }
}
