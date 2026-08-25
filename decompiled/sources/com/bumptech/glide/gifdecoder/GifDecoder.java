package com.bumptech.glide.gifdecoder;

/* JADX INFO: loaded from: classes.dex */
public interface GifDecoder {
    public static final int STATUS_FORMAT_ERROR = 1;
    public static final int STATUS_OK = 0;
    public static final int STATUS_OPEN_ERROR = 2;
    public static final int STATUS_PARTIAL_DECODE = 3;
    public static final int TOTAL_ITERATION_COUNT_FOREVER = 0;

    /* JADX INFO: loaded from: classes2.dex */
    public interface BitmapProvider {
        @androidx.annotation.NonNull
        android.graphics.Bitmap obtain(int r1, int r2, @androidx.annotation.NonNull android.graphics.Bitmap.Config r3);

        @androidx.annotation.NonNull
        byte[] obtainByteArray(int r1);

        @androidx.annotation.NonNull
        int[] obtainIntArray(int r1);

        void release(@androidx.annotation.NonNull android.graphics.Bitmap r1);

        void release(@androidx.annotation.NonNull byte[] r1);

        void release(@androidx.annotation.NonNull int[] r1);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface GifDecodeStatus {
    }

    void advance();

    void clear();

    int getByteSize();

    int getCurrentFrameIndex();

    @androidx.annotation.NonNull
    java.nio.ByteBuffer getData();

    int getDelay(int r1);

    int getFrameCount();

    int getHeight();

    @java.lang.Deprecated
    int getLoopCount();

    int getNetscapeLoopCount();

    int getNextDelay();

    @androidx.annotation.Nullable
    android.graphics.Bitmap getNextFrame();

    int getStatus();

    int getTotalIterationCount();

    int getWidth();

    int read(@androidx.annotation.Nullable java.io.InputStream r1, int r2);

    int read(@androidx.annotation.Nullable byte[] r1);

    void resetFrameIndex();

    void setData(@androidx.annotation.NonNull com.bumptech.glide.gifdecoder.GifHeader r1, @androidx.annotation.NonNull java.nio.ByteBuffer r2);

    void setData(@androidx.annotation.NonNull com.bumptech.glide.gifdecoder.GifHeader r1, @androidx.annotation.NonNull java.nio.ByteBuffer r2, int r3);

    void setData(@androidx.annotation.NonNull com.bumptech.glide.gifdecoder.GifHeader r1, @androidx.annotation.NonNull byte[] r2);

    void setDefaultBitmapConfig(@androidx.annotation.NonNull android.graphics.Bitmap.Config r1);
}
