package com.bumptech.glide.load.resource.bitmap;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RequiresApi(api = 28)
public final class BitmapImageDecoderResourceDecoder extends com.bumptech.glide.load.resource.ImageDecoderResourceDecoder<android.graphics.Bitmap> {
    private static final java.lang.String TAG = "BitmapImageDecoder";
    private final com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool;

    public BitmapImageDecoderResourceDecoder() {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPoolAdapter r0 = new com.bumptech.glide.load.engine.bitmap_recycle.BitmapPoolAdapter
            r0.<init>()
            r1.bitmapPool = r0
            return
    }

    @Override // com.bumptech.glide.load.resource.ImageDecoderResourceDecoder
    public final com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> decode(android.graphics.ImageDecoder.Source r4, int r5, int r6, android.graphics.ImageDecoder.OnHeaderDecodedListener r7) throws java.io.IOException {
            r3 = this;
            android.graphics.Bitmap r4 = android.graphics.ImageDecoder.decodeBitmap(r4, r7)
            java.lang.String r7 = "BitmapImageDecoder"
            r0 = 2
            boolean r0 = android.util.Log.isLoggable(r7, r0)
            if (r0 == 0) goto L41
            java.lang.String r0 = "Decoded ["
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            int r1 = r4.getWidth()
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            int r2 = r4.getHeight()
            r0.append(r2)
            java.lang.String r2 = "] for ["
            r0.append(r2)
            r0.append(r5)
            r0.append(r1)
            r0.append(r6)
            java.lang.String r5 = "]"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            android.util.Log.v(r7, r5)
        L41:
            com.bumptech.glide.load.resource.bitmap.BitmapResource r5 = new com.bumptech.glide.load.resource.bitmap.BitmapResource
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r6 = r3.bitmapPool
            r5.<init>(r4, r6)
            return r5
    }
}
