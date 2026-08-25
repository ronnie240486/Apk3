package com.bumptech.glide.load.resource.gif;

/* JADX INFO: loaded from: classes.dex */
public class GifDrawableTransformation implements com.bumptech.glide.load.Transformation<com.bumptech.glide.load.resource.gif.GifDrawable> {
    private final com.bumptech.glide.load.Transformation<android.graphics.Bitmap> wrapped;

    public GifDrawableTransformation(com.bumptech.glide.load.Transformation<android.graphics.Bitmap> r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.bumptech.glide.util.Preconditions.checkNotNull(r1)
            com.bumptech.glide.load.Transformation r1 = (com.bumptech.glide.load.Transformation) r1
            r0.wrapped = r1
            return
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.bumptech.glide.load.resource.gif.GifDrawableTransformation
            if (r0 == 0) goto Lf
            com.bumptech.glide.load.resource.gif.GifDrawableTransformation r2 = (com.bumptech.glide.load.resource.gif.GifDrawableTransformation) r2
            com.bumptech.glide.load.Transformation<android.graphics.Bitmap> r0 = r1.wrapped
            com.bumptech.glide.load.Transformation<android.graphics.Bitmap> r2 = r2.wrapped
            boolean r2 = r0.equals(r2)
            return r2
        Lf:
            r2 = 0
            return r2
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
            r1 = this;
            com.bumptech.glide.load.Transformation<android.graphics.Bitmap> r0 = r1.wrapped
            int r0 = r0.hashCode()
            return r0
    }

    @Override // com.bumptech.glide.load.Transformation
    @androidx.annotation.NonNull
    public com.bumptech.glide.load.engine.Resource<com.bumptech.glide.load.resource.gif.GifDrawable> transform(@androidx.annotation.NonNull android.content.Context r5, @androidx.annotation.NonNull com.bumptech.glide.load.engine.Resource<com.bumptech.glide.load.resource.gif.GifDrawable> r6, int r7, int r8) {
            r4 = this;
            java.lang.Object r0 = r6.get()
            com.bumptech.glide.load.resource.gif.GifDrawable r0 = (com.bumptech.glide.load.resource.gif.GifDrawable) r0
            com.bumptech.glide.Glide r1 = com.bumptech.glide.Glide.get(r5)
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r1 = r1.getBitmapPool()
            android.graphics.Bitmap r2 = r0.getFirstFrame()
            com.bumptech.glide.load.resource.bitmap.BitmapResource r3 = new com.bumptech.glide.load.resource.bitmap.BitmapResource
            r3.<init>(r2, r1)
            com.bumptech.glide.load.Transformation<android.graphics.Bitmap> r1 = r4.wrapped
            com.bumptech.glide.load.engine.Resource r5 = r1.transform(r5, r3, r7, r8)
            boolean r7 = r3.equals(r5)
            if (r7 != 0) goto L26
            r3.recycle()
        L26:
            java.lang.Object r5 = r5.get()
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            com.bumptech.glide.load.Transformation<android.graphics.Bitmap> r7 = r4.wrapped
            r0.setFrameTransformation(r7, r5)
            return r6
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@androidx.annotation.NonNull java.security.MessageDigest r2) {
            r1 = this;
            com.bumptech.glide.load.Transformation<android.graphics.Bitmap> r0 = r1.wrapped
            r0.updateDiskCacheKey(r2)
            return
    }
}
