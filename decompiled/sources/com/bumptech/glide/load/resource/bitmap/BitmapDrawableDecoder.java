package com.bumptech.glide.load.resource.bitmap;

/* JADX INFO: loaded from: classes2.dex */
public class BitmapDrawableDecoder<DataType> implements com.bumptech.glide.load.ResourceDecoder<DataType, android.graphics.drawable.BitmapDrawable> {
    private final com.bumptech.glide.load.ResourceDecoder<DataType, android.graphics.Bitmap> decoder;
    private final android.content.res.Resources resources;

    public BitmapDrawableDecoder(android.content.Context r1, com.bumptech.glide.load.ResourceDecoder<DataType, android.graphics.Bitmap> r2) {
            r0 = this;
            android.content.res.Resources r1 = r1.getResources()
            r0.<init>(r1, r2)
            return
    }

    public BitmapDrawableDecoder(@androidx.annotation.NonNull android.content.res.Resources r1, @androidx.annotation.NonNull com.bumptech.glide.load.ResourceDecoder<DataType, android.graphics.Bitmap> r2) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.bumptech.glide.util.Preconditions.checkNotNull(r1)
            android.content.res.Resources r1 = (android.content.res.Resources) r1
            r0.resources = r1
            java.lang.Object r1 = com.bumptech.glide.util.Preconditions.checkNotNull(r2)
            com.bumptech.glide.load.ResourceDecoder r1 = (com.bumptech.glide.load.ResourceDecoder) r1
            r0.decoder = r1
            return
    }

    @java.lang.Deprecated
    public BitmapDrawableDecoder(android.content.res.Resources r1, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r2, com.bumptech.glide.load.ResourceDecoder<DataType, android.graphics.Bitmap> r3) {
            r0 = this;
            r0.<init>(r1, r3)
            return
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public com.bumptech.glide.load.engine.Resource<android.graphics.drawable.BitmapDrawable> decode(@androidx.annotation.NonNull DataType r2, int r3, int r4, @androidx.annotation.NonNull com.bumptech.glide.load.Options r5) throws java.io.IOException {
            r1 = this;
            com.bumptech.glide.load.ResourceDecoder<DataType, android.graphics.Bitmap> r0 = r1.decoder
            com.bumptech.glide.load.engine.Resource r2 = r0.decode(r2, r3, r4, r5)
            android.content.res.Resources r3 = r1.resources
            com.bumptech.glide.load.engine.Resource r2 = com.bumptech.glide.load.resource.bitmap.LazyBitmapDrawableResource.obtain(r3, r2)
            return r2
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public boolean handles(@androidx.annotation.NonNull DataType r2, @androidx.annotation.NonNull com.bumptech.glide.load.Options r3) throws java.io.IOException {
            r1 = this;
            com.bumptech.glide.load.ResourceDecoder<DataType, android.graphics.Bitmap> r0 = r1.decoder
            boolean r2 = r0.handles(r2, r3)
            return r2
    }
}
