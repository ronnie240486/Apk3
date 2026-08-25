package com.bumptech.glide.load.resource.transcode;

/* JADX INFO: loaded from: classes2.dex */
public final class DrawableBytesTranscoder implements com.bumptech.glide.load.resource.transcode.ResourceTranscoder<android.graphics.drawable.Drawable, byte[]> {
    private final com.bumptech.glide.load.resource.transcode.ResourceTranscoder<android.graphics.Bitmap, byte[]> bitmapBytesTranscoder;
    private final com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool;
    private final com.bumptech.glide.load.resource.transcode.ResourceTranscoder<com.bumptech.glide.load.resource.gif.GifDrawable, byte[]> gifDrawableBytesTranscoder;

    public DrawableBytesTranscoder(@androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r1, @androidx.annotation.NonNull com.bumptech.glide.load.resource.transcode.ResourceTranscoder<android.graphics.Bitmap, byte[]> r2, @androidx.annotation.NonNull com.bumptech.glide.load.resource.transcode.ResourceTranscoder<com.bumptech.glide.load.resource.gif.GifDrawable, byte[]> r3) {
            r0 = this;
            r0.<init>()
            r0.bitmapPool = r1
            r0.bitmapBytesTranscoder = r2
            r0.gifDrawableBytesTranscoder = r3
            return
    }

    @androidx.annotation.NonNull
    private static com.bumptech.glide.load.engine.Resource<com.bumptech.glide.load.resource.gif.GifDrawable> toGifDrawableResource(@androidx.annotation.NonNull com.bumptech.glide.load.engine.Resource<android.graphics.drawable.Drawable> r0) {
            return r0
    }

    @Override // com.bumptech.glide.load.resource.transcode.ResourceTranscoder
    @androidx.annotation.Nullable
    public com.bumptech.glide.load.engine.Resource<byte[]> transcode(@androidx.annotation.NonNull com.bumptech.glide.load.engine.Resource<android.graphics.drawable.Drawable> r3, @androidx.annotation.NonNull com.bumptech.glide.load.Options r4) {
            r2 = this;
            java.lang.Object r0 = r3.get()
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            boolean r1 = r0 instanceof android.graphics.drawable.BitmapDrawable
            if (r1 == 0) goto L1d
            com.bumptech.glide.load.resource.transcode.ResourceTranscoder<android.graphics.Bitmap, byte[]> r3 = r2.bitmapBytesTranscoder
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r0 = r0.getBitmap()
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r1 = r2.bitmapPool
            com.bumptech.glide.load.resource.bitmap.BitmapResource r0 = com.bumptech.glide.load.resource.bitmap.BitmapResource.obtain(r0, r1)
            com.bumptech.glide.load.engine.Resource r3 = r3.transcode(r0, r4)
            return r3
        L1d:
            boolean r0 = r0 instanceof com.bumptech.glide.load.resource.gif.GifDrawable
            if (r0 == 0) goto L2c
            com.bumptech.glide.load.resource.transcode.ResourceTranscoder<com.bumptech.glide.load.resource.gif.GifDrawable, byte[]> r0 = r2.gifDrawableBytesTranscoder
            com.bumptech.glide.load.engine.Resource r3 = toGifDrawableResource(r3)
            com.bumptech.glide.load.engine.Resource r3 = r0.transcode(r3, r4)
            return r3
        L2c:
            r3 = 0
            return r3
    }
}
