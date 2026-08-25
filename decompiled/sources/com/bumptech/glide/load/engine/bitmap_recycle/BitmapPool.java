package com.bumptech.glide.load.engine.bitmap_recycle;

/* JADX INFO: loaded from: classes3.dex */
public interface BitmapPool {
    void clearMemory();

    @androidx.annotation.NonNull
    android.graphics.Bitmap get(int r1, int r2, android.graphics.Bitmap.Config r3);

    @androidx.annotation.NonNull
    android.graphics.Bitmap getDirty(int r1, int r2, android.graphics.Bitmap.Config r3);

    long getMaxSize();

    void put(android.graphics.Bitmap r1);

    void setSizeMultiplier(float r1);

    void trimMemory(int r1);
}
