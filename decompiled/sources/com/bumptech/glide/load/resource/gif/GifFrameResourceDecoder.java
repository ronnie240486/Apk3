package com.bumptech.glide.load.resource.gif;

/* JADX INFO: loaded from: classes2.dex */
public final class GifFrameResourceDecoder implements com.bumptech.glide.load.ResourceDecoder<com.bumptech.glide.gifdecoder.GifDecoder, android.graphics.Bitmap> {
    private final com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool;

    public GifFrameResourceDecoder(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r1) {
            r0 = this;
            r0.<init>()
            r0.bitmapPool = r1
            return
    }

    /* JADX INFO: renamed from: decode, reason: avoid collision after fix types in other method */
    public com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> decode2(@androidx.annotation.NonNull com.bumptech.glide.gifdecoder.GifDecoder r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.Options r4) {
            r0 = this;
            android.graphics.Bitmap r1 = r1.getNextFrame()
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r2 = r0.bitmapPool
            com.bumptech.glide.load.resource.bitmap.BitmapResource r1 = com.bumptech.glide.load.resource.bitmap.BitmapResource.obtain(r1, r2)
            return r1
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> decode(@androidx.annotation.NonNull com.bumptech.glide.gifdecoder.GifDecoder r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.Options r4) throws java.io.IOException {
            r0 = this;
            com.bumptech.glide.gifdecoder.GifDecoder r1 = (com.bumptech.glide.gifdecoder.GifDecoder) r1
            com.bumptech.glide.load.engine.Resource r1 = r0.decode2(r1, r2, r3, r4)
            return r1
    }

    /* JADX INFO: renamed from: handles, reason: avoid collision after fix types in other method */
    public boolean handles2(@androidx.annotation.NonNull com.bumptech.glide.gifdecoder.GifDecoder r1, @androidx.annotation.NonNull com.bumptech.glide.load.Options r2) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public /* bridge */ /* synthetic */ boolean handles(@androidx.annotation.NonNull com.bumptech.glide.gifdecoder.GifDecoder r1, @androidx.annotation.NonNull com.bumptech.glide.load.Options r2) throws java.io.IOException {
            r0 = this;
            com.bumptech.glide.gifdecoder.GifDecoder r1 = (com.bumptech.glide.gifdecoder.GifDecoder) r1
            boolean r1 = r0.handles2(r1, r2)
            return r1
    }
}
