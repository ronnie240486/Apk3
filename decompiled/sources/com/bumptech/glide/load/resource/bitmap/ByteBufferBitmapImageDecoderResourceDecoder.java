package com.bumptech.glide.load.resource.bitmap;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RequiresApi(api = 28)
public final class ByteBufferBitmapImageDecoderResourceDecoder implements com.bumptech.glide.load.ResourceDecoder<java.nio.ByteBuffer, android.graphics.Bitmap> {
    private final com.bumptech.glide.load.resource.bitmap.BitmapImageDecoderResourceDecoder wrapped;

    public ByteBufferBitmapImageDecoderResourceDecoder() {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.load.resource.bitmap.BitmapImageDecoderResourceDecoder r0 = new com.bumptech.glide.load.resource.bitmap.BitmapImageDecoderResourceDecoder
            r0.<init>()
            r1.wrapped = r0
            return
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    @androidx.annotation.Nullable
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> decode(@androidx.annotation.NonNull java.nio.ByteBuffer r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.Options r4) throws java.io.IOException {
            r0 = this;
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            com.bumptech.glide.load.engine.Resource r1 = r0.decode2(r1, r2, r3, r4)
            return r1
    }

    @androidx.annotation.Nullable
    /* JADX INFO: renamed from: decode, reason: avoid collision after fix types in other method */
    public com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> decode2(@androidx.annotation.NonNull java.nio.ByteBuffer r2, int r3, int r4, @androidx.annotation.NonNull com.bumptech.glide.load.Options r5) throws java.io.IOException {
            r1 = this;
            android.graphics.ImageDecoder$Source r2 = android.graphics.ImageDecoder.createSource(r2)
            com.bumptech.glide.load.resource.bitmap.BitmapImageDecoderResourceDecoder r0 = r1.wrapped
            com.bumptech.glide.load.engine.Resource r2 = r0.decode2(r2, r3, r4, r5)
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
    public boolean handles2(@androidx.annotation.NonNull java.nio.ByteBuffer r1, @androidx.annotation.NonNull com.bumptech.glide.load.Options r2) throws java.io.IOException {
            r0 = this;
            r1 = 1
            return r1
    }
}
