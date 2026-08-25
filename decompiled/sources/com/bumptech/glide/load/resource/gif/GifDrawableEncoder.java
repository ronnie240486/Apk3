package com.bumptech.glide.load.resource.gif;

/* JADX INFO: loaded from: classes2.dex */
public class GifDrawableEncoder implements com.bumptech.glide.load.ResourceEncoder<com.bumptech.glide.load.resource.gif.GifDrawable> {
    private static final java.lang.String TAG = "GifEncoder";

    public GifDrawableEncoder() {
            r0 = this;
            r0.<init>()
            return
    }

    public boolean encode(@androidx.annotation.NonNull com.bumptech.glide.load.engine.Resource<com.bumptech.glide.load.resource.gif.GifDrawable> r1, @androidx.annotation.NonNull java.io.File r2, @androidx.annotation.NonNull com.bumptech.glide.load.Options r3) {
            r0 = this;
            java.lang.Object r1 = r1.get()
            com.bumptech.glide.load.resource.gif.GifDrawable r1 = (com.bumptech.glide.load.resource.gif.GifDrawable) r1
            java.nio.ByteBuffer r1 = r1.getBuffer()     // Catch: java.io.IOException -> Lf
            com.bumptech.glide.util.ByteBufferUtil.toFile(r1, r2)     // Catch: java.io.IOException -> Lf
            r1 = 1
            goto L1f
        Lf:
            r1 = move-exception
            r2 = 5
            java.lang.String r3 = "GifEncoder"
            boolean r2 = android.util.Log.isLoggable(r3, r2)
            if (r2 == 0) goto L1e
            java.lang.String r2 = "Failed to encode GIF drawable data"
            android.util.Log.w(r3, r2, r1)
        L1e:
            r1 = 0
        L1f:
            return r1
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
    public com.bumptech.glide.load.EncodeStrategy getEncodeStrategy(@androidx.annotation.NonNull com.bumptech.glide.load.Options r1) {
            r0 = this;
            com.bumptech.glide.load.EncodeStrategy r1 = com.bumptech.glide.load.EncodeStrategy.SOURCE
            return r1
    }
}
