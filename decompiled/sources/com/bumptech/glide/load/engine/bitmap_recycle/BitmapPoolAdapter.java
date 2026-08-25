package com.bumptech.glide.load.engine.bitmap_recycle;

/* JADX INFO: loaded from: classes2.dex */
public class BitmapPoolAdapter implements com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool {
    public BitmapPoolAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public void clearMemory() {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    @androidx.annotation.NonNull
    public android.graphics.Bitmap get(int r1, int r2, android.graphics.Bitmap.Config r3) {
            r0 = this;
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r1, r2, r3)
            return r1
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    @androidx.annotation.NonNull
    public android.graphics.Bitmap getDirty(int r1, int r2, android.graphics.Bitmap.Config r3) {
            r0 = this;
            android.graphics.Bitmap r1 = r0.get(r1, r2, r3)
            return r1
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public long getMaxSize() {
            r2 = this;
            r0 = 0
            return r0
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public void put(android.graphics.Bitmap r1) {
            r0 = this;
            r1.recycle()
            return
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public void setSizeMultiplier(float r1) {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public void trimMemory(int r1) {
            r0 = this;
            return
    }
}
