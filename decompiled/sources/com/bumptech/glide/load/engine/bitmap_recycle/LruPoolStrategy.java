package com.bumptech.glide.load.engine.bitmap_recycle;

/* JADX INFO: loaded from: classes2.dex */
interface LruPoolStrategy {
    @androidx.annotation.Nullable
    android.graphics.Bitmap get(int r1, int r2, android.graphics.Bitmap.Config r3);

    int getSize(android.graphics.Bitmap r1);

    java.lang.String logBitmap(int r1, int r2, android.graphics.Bitmap.Config r3);

    java.lang.String logBitmap(android.graphics.Bitmap r1);

    void put(android.graphics.Bitmap r1);

    @androidx.annotation.Nullable
    android.graphics.Bitmap removeLast();
}
