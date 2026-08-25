package com.bumptech.glide.load.resource.gif;

/* JADX INFO: loaded from: classes2.dex */
public final class GifBitmapProvider implements com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider {

    @androidx.annotation.Nullable
    private final com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool arrayPool;
    private final com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool;

    public GifBitmapProvider(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public GifBitmapProvider(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r1, @androidx.annotation.Nullable com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r2) {
            r0 = this;
            r0.<init>()
            r0.bitmapPool = r1
            r0.arrayPool = r2
            return
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider
    @androidx.annotation.NonNull
    public android.graphics.Bitmap obtain(int r2, int r3, @androidx.annotation.NonNull android.graphics.Bitmap.Config r4) {
            r1 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r0 = r1.bitmapPool
            android.graphics.Bitmap r2 = r0.getDirty(r2, r3, r4)
            return r2
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider
    @androidx.annotation.NonNull
    public byte[] obtainByteArray(int r3) {
            r2 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r0 = r2.arrayPool
            if (r0 != 0) goto L7
            byte[] r3 = new byte[r3]
            return r3
        L7:
            java.lang.Class<byte[]> r1 = byte[].class
            java.lang.Object r3 = r0.get(r3, r1)
            byte[] r3 = (byte[]) r3
            return r3
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider
    @androidx.annotation.NonNull
    public int[] obtainIntArray(int r3) {
            r2 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r0 = r2.arrayPool
            if (r0 != 0) goto L7
            int[] r3 = new int[r3]
            return r3
        L7:
            java.lang.Class<int[]> r1 = int[].class
            java.lang.Object r3 = r0.get(r3, r1)
            int[] r3 = (int[]) r3
            return r3
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider
    public void release(@androidx.annotation.NonNull android.graphics.Bitmap r2) {
            r1 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r0 = r1.bitmapPool
            r0.put(r2)
            return
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider
    public void release(@androidx.annotation.NonNull byte[] r2) {
            r1 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r0 = r1.arrayPool
            if (r0 != 0) goto L5
            return
        L5:
            r0.put(r2)
            return
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider
    public void release(@androidx.annotation.NonNull int[] r2) {
            r1 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r0 = r1.arrayPool
            if (r0 != 0) goto L5
            return
        L5:
            r0.put(r2)
            return
    }
}
