package com.bumptech.glide.load.resource.bitmap;

/* JADX INFO: loaded from: classes.dex */
public class ByteBufferBitmapDecoder implements com.bumptech.glide.load.ResourceDecoder<java.nio.ByteBuffer, android.graphics.Bitmap> {
    private final com.bumptech.glide.load.resource.bitmap.Downsampler downsampler;

    public ByteBufferBitmapDecoder(com.bumptech.glide.load.resource.bitmap.Downsampler r1) {
            r0 = this;
            r0.<init>()
            r0.downsampler = r1
            return
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> decode(@androidx.annotation.NonNull java.nio.ByteBuffer r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.Options r4) throws java.io.IOException {
            r0 = this;
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            com.bumptech.glide.load.engine.Resource r1 = r0.decode2(r1, r2, r3, r4)
            return r1
    }

    /* JADX INFO: renamed from: decode, reason: avoid collision after fix types in other method */
    public com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> decode2(@androidx.annotation.NonNull java.nio.ByteBuffer r2, int r3, int r4, @androidx.annotation.NonNull com.bumptech.glide.load.Options r5) throws java.io.IOException {
            r1 = this;
            java.io.InputStream r2 = com.bumptech.glide.util.ByteBufferUtil.toStream(r2)
            com.bumptech.glide.load.resource.bitmap.Downsampler r0 = r1.downsampler
            com.bumptech.glide.load.engine.Resource r2 = r0.decode(r2, r3, r4, r5)
            return r2
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public /* bridge */ /* synthetic */ boolean handles(@androidx.annotation.NonNull java.nio.ByteBuffer r1, @androidx.annotation.NonNull com.bumptech.glide.load.Options r2) throws java.io.IOException {
            r0 = this;
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            boolean r1 = r0.handles2(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: handles, reason: avoid collision after fix types in other method */
    public boolean handles2(@androidx.annotation.NonNull java.nio.ByteBuffer r1, @androidx.annotation.NonNull com.bumptech.glide.load.Options r2) {
            r0 = this;
            com.bumptech.glide.load.resource.bitmap.Downsampler r2 = r0.downsampler
            boolean r1 = r2.handles(r1)
            return r1
    }
}
