package com.bumptech.glide.load.resource.bitmap;

/* JADX INFO: loaded from: classes2.dex */
public class BitmapDrawableEncoder implements com.bumptech.glide.load.ResourceEncoder<android.graphics.drawable.BitmapDrawable> {
    private final com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool;
    private final com.bumptech.glide.load.ResourceEncoder<android.graphics.Bitmap> encoder;

    public BitmapDrawableEncoder(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r1, com.bumptech.glide.load.ResourceEncoder<android.graphics.Bitmap> r2) {
            r0 = this;
            r0.<init>()
            r0.bitmapPool = r1
            r0.encoder = r2
            return
    }

    public boolean encode(@androidx.annotation.NonNull com.bumptech.glide.load.engine.Resource<android.graphics.drawable.BitmapDrawable> r4, @androidx.annotation.NonNull java.io.File r5, @androidx.annotation.NonNull com.bumptech.glide.load.Options r6) {
            r3 = this;
            com.bumptech.glide.load.ResourceEncoder<android.graphics.Bitmap> r0 = r3.encoder
            com.bumptech.glide.load.resource.bitmap.BitmapResource r1 = new com.bumptech.glide.load.resource.bitmap.BitmapResource
            java.lang.Object r4 = r4.get()
            android.graphics.drawable.BitmapDrawable r4 = (android.graphics.drawable.BitmapDrawable) r4
            android.graphics.Bitmap r4 = r4.getBitmap()
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r2 = r3.bitmapPool
            r1.<init>(r4, r2)
            boolean r4 = r0.encode(r1, r5, r6)
            return r4
    }

    @Override // com.bumptech.glide.load.Encoder
    public /* bridge */ /* synthetic */ boolean encode(@androidx.annotation.NonNull java.lang.Object r1, @androidx.annotation.NonNull java.io.File r2, @androidx.annotation.NonNull com.bumptech.glide.load.Options r3) {
            r0 = this;
            com.bumptech.glide.load.engine.Resource r1 = (com.bumptech.glide.load.engine.Resource) r1
            boolean r1 = r0.encode(r1, r2, r3)
            return r1
    }

    @Override // com.bumptech.glide.load.ResourceEncoder
    @androidx.annotation.NonNull
    public com.bumptech.glide.load.EncodeStrategy getEncodeStrategy(@androidx.annotation.NonNull com.bumptech.glide.load.Options r2) {
            r1 = this;
            com.bumptech.glide.load.ResourceEncoder<android.graphics.Bitmap> r0 = r1.encoder
            com.bumptech.glide.load.EncodeStrategy r2 = r0.getEncodeStrategy(r2)
            return r2
    }
}
