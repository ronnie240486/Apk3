package pl.droidsonroids.gif;

/* JADX INFO: loaded from: classes2.dex */
public class GifTexImage2D {
    private final pl.droidsonroids.gif.GifInfoHandle mGifInfoHandle;

    public GifTexImage2D(pl.droidsonroids.gif.InputSource r2, @androidx.annotation.Nullable pl.droidsonroids.gif.GifOptions r3) throws java.io.IOException {
            r1 = this;
            r1.<init>()
            if (r3 != 0) goto La
            pl.droidsonroids.gif.GifOptions r3 = new pl.droidsonroids.gif.GifOptions
            r3.<init>()
        La:
            pl.droidsonroids.gif.GifInfoHandle r2 = r2.open()
            r1.mGifInfoHandle = r2
            char r0 = r3.inSampleSize
            boolean r3 = r3.inIsOpaque
            r2.setOptions(r0, r3)
            r2.initTexImageDescriptor()
            return
    }

    public final void finalize() throws java.lang.Throwable {
            r1 = this;
            r1.recycle()     // Catch: java.lang.Throwable -> L7
            super.finalize()
            return
        L7:
            r0 = move-exception
            super.finalize()
            throw r0
    }

    public int getCurrentFrameIndex() {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.mGifInfoHandle
            int r0 = r0.getCurrentFrameIndex()
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

    public int getNumberOfFrames() {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.mGifInfoHandle
            int r0 = r0.getNumberOfFrames()
            return r0
    }

    public int getWidth() {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.mGifInfoHandle
            int r0 = r0.getWidth()
            return r0
    }

    public void glTexImage2D(int r2, int r3) {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.mGifInfoHandle
            r0.glTexImage2D(r2, r3)
            return
    }

    public void glTexSubImage2D(int r2, int r3) {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.mGifInfoHandle
            r0.glTexSubImage2D(r2, r3)
            return
    }

    public void recycle() {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.mGifInfoHandle
            if (r0 == 0) goto L7
            r0.recycle()
        L7:
            return
    }

    public void seekToFrame(@androidx.annotation.IntRange(from = 0) int r2) {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.mGifInfoHandle
            r0.seekToFrameGL(r2)
            return
    }

    public void setSpeed(@androidx.annotation.FloatRange(from = 0.0d, fromInclusive = false) float r2) {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.mGifInfoHandle
            r0.setSpeedFactor(r2)
            return
    }

    public void startDecoderThread() {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.mGifInfoHandle
            r0.startDecoderThread()
            return
    }

    public void stopDecoderThread() {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.mGifInfoHandle
            r0.stopDecoderThread()
            return
    }
}
