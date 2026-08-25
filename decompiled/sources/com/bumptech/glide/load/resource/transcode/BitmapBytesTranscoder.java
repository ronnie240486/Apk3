package com.bumptech.glide.load.resource.transcode;

/* JADX INFO: loaded from: classes3.dex */
public class BitmapBytesTranscoder implements com.bumptech.glide.load.resource.transcode.ResourceTranscoder<android.graphics.Bitmap, byte[]> {
    private final android.graphics.Bitmap.CompressFormat compressFormat;
    private final int quality;

    public BitmapBytesTranscoder() {
            r2 = this;
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG
            r1 = 100
            r2.<init>(r0, r1)
            return
    }

    public BitmapBytesTranscoder(@androidx.annotation.NonNull android.graphics.Bitmap.CompressFormat r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.compressFormat = r1
            r0.quality = r2
            return
    }

    @Override // com.bumptech.glide.load.resource.transcode.ResourceTranscoder
    @androidx.annotation.Nullable
    public com.bumptech.glide.load.engine.Resource<byte[]> transcode(@androidx.annotation.NonNull com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> r4, @androidx.annotation.NonNull com.bumptech.glide.load.Options r5) {
            r3 = this;
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream
            r5.<init>()
            java.lang.Object r0 = r4.get()
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            android.graphics.Bitmap$CompressFormat r1 = r3.compressFormat
            int r2 = r3.quality
            r0.compress(r1, r2, r5)
            r4.recycle()
            com.bumptech.glide.load.resource.bytes.BytesResource r4 = new com.bumptech.glide.load.resource.bytes.BytesResource
            byte[] r5 = r5.toByteArray()
            r4.<init>(r5)
            return r4
    }
}
