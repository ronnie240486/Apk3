package pl.droidsonroids.gif;

/* JADX INFO: loaded from: classes3.dex */
public class GifDecoder {
    private final pl.droidsonroids.gif.GifInfoHandle mGifInfoHandle;

    public GifDecoder(@androidx.annotation.NonNull pl.droidsonroids.gif.InputSource r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public GifDecoder(@androidx.annotation.NonNull pl.droidsonroids.gif.InputSource r2, @androidx.annotation.Nullable pl.droidsonroids.gif.GifOptions r3) throws java.io.IOException {
            r1 = this;
            r1.<init>()
            pl.droidsonroids.gif.GifInfoHandle r2 = r2.open()
            r1.mGifInfoHandle = r2
            if (r3 == 0) goto L12
            char r0 = r3.inSampleSize
            boolean r3 = r3.inIsOpaque
            r2.setOptions(r0, r3)
        L12:
            return
    }

    private void checkBuffer(android.graphics.Bitmap r3) {
            r2 = this;
            boolean r0 = r3.isRecycled()
            if (r0 != 0) goto L46
            int r0 = r3.getWidth()
            pl.droidsonroids.gif.GifInfoHandle r1 = r2.mGifInfoHandle
            int r1 = r1.getWidth()
            if (r0 < r1) goto L3e
            int r0 = r3.getHeight()
            pl.droidsonroids.gif.GifInfoHandle r1 = r2.mGifInfoHandle
            int r1 = r1.getHeight()
            if (r0 < r1) goto L3e
            android.graphics.Bitmap$Config r0 = r3.getConfig()
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
            if (r0 != r1) goto L27
            return
        L27:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Only Config.ARGB_8888 is supported. Current bitmap config: "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            android.graphics.Bitmap$Config r3 = r3.getConfig()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L3e:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Bitmap ia too small, size must be greater than or equal to GIF size"
            r3.<init>(r0)
            throw r3
        L46:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Bitmap is recycled"
            r3.<init>(r0)
            throw r3
    }

    public long getAllocationByteCount() {
            r2 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r2.mGifInfoHandle
            long r0 = r0.getAllocationByteCount()
            return r0
    }

    public java.lang.String getComment() {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.mGifInfoHandle
            java.lang.String r0 = r0.getComment()
            return r0
    }

    public int getDuration() {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.mGifInfoHandle
            int r0 = r0.getDuration()
            return r0
    }

    public int getFrameDuration(@androidx.annotation.IntRange(from = 0) int r2) {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.mGifInfoHandle
            int r2 = r0.getFrameDuration(r2)
            return r2
    }

    public int getHeight() {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.mGifInfoHandle
            int r0 = r0.getHeight()
            return r0
    }

    public int getLoopCount() {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.mGifInfoHandle
            int r0 = r0.getLoopCount()
            return r0
    }

    public int getNumberOfFrames() {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.mGifInfoHandle
            int r0 = r0.getNumberOfFrames()
            return r0
    }

    public long getSourceLength() {
            r2 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r2.mGifInfoHandle
            long r0 = r0.getSourceLength()
            return r0
    }

    public int getWidth() {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.mGifInfoHandle
            int r0 = r0.getWidth()
            return r0
    }

    public boolean isAnimated() {
            r2 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r2.mGifInfoHandle
            int r0 = r0.getNumberOfFrames()
            r1 = 1
            if (r0 <= r1) goto L10
            int r0 = r2.getDuration()
            if (r0 <= 0) goto L10
            goto L11
        L10:
            r1 = 0
        L11:
            return r1
    }

    public void recycle() {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.mGifInfoHandle
            r0.recycle()
            return
    }

    public void seekToFrame(@androidx.annotation.IntRange(from = 0, to = 2147483647L) int r2, @androidx.annotation.NonNull android.graphics.Bitmap r3) {
            r1 = this;
            r1.checkBuffer(r3)
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.mGifInfoHandle
            r0.seekToFrame(r2, r3)
            return
    }

    public void seekToTime(@androidx.annotation.IntRange(from = 0, to = 2147483647L) int r2, @androidx.annotation.NonNull android.graphics.Bitmap r3) {
            r1 = this;
            r1.checkBuffer(r3)
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.mGifInfoHandle
            r0.seekToTime(r2, r3)
            return
    }
}
