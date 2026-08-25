package pl.droidsonroids.gif;

import pl.droidsonroids.gif.GifDrawableInit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class GifDrawableInit<T extends pl.droidsonroids.gif.GifDrawableInit<T>> {
    private java.util.concurrent.ScheduledThreadPoolExecutor mExecutor;
    private pl.droidsonroids.gif.InputSource mInputSource;
    private boolean mIsRenderingTriggeredOnDraw;
    private pl.droidsonroids.gif.GifDrawable mOldDrawable;
    private final pl.droidsonroids.gif.GifOptions mOptions;

    public GifDrawableInit() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.mIsRenderingTriggeredOnDraw = r0
            pl.droidsonroids.gif.GifOptions r0 = new pl.droidsonroids.gif.GifOptions
            r0.<init>()
            r1.mOptions = r0
            return
    }

    public pl.droidsonroids.gif.GifDrawable build() throws java.io.IOException {
            r7 = this;
            pl.droidsonroids.gif.InputSource r0 = r7.mInputSource
            java.lang.String r1 = "Source is not set"
            java.util.Objects.requireNonNull(r0, r1)
            pl.droidsonroids.gif.GifDrawable r1 = r7.mOldDrawable
            java.util.concurrent.ScheduledThreadPoolExecutor r2 = r7.mExecutor
            boolean r3 = r7.mIsRenderingTriggeredOnDraw
            pl.droidsonroids.gif.GifOptions r4 = r7.mOptions
            java.util.Objects.requireNonNull(r0)
            pl.droidsonroids.gif.GifDrawable r5 = new pl.droidsonroids.gif.GifDrawable
            pl.droidsonroids.gif.GifInfoHandle r0 = r0.open()
            char r6 = r4.inSampleSize
            boolean r4 = r4.inIsOpaque
            r0.setOptions(r6, r4)
            r5.<init>(r0, r1, r2, r3)
            return r5
    }

    public T from(android.content.ContentResolver r2, android.net.Uri r3) {
            r1 = this;
            pl.droidsonroids.gif.InputSource$UriSource r0 = new pl.droidsonroids.gif.InputSource$UriSource
            r0.<init>(r2, r3)
            r1.mInputSource = r0
            pl.droidsonroids.gif.GifDrawableInit r2 = r1.self()
            return r2
    }

    public T from(android.content.res.AssetFileDescriptor r2) {
            r1 = this;
            pl.droidsonroids.gif.InputSource$AssetFileDescriptorSource r0 = new pl.droidsonroids.gif.InputSource$AssetFileDescriptorSource
            r0.<init>(r2)
            r1.mInputSource = r0
            pl.droidsonroids.gif.GifDrawableInit r2 = r1.self()
            return r2
    }

    public T from(android.content.res.AssetManager r2, java.lang.String r3) {
            r1 = this;
            pl.droidsonroids.gif.InputSource$AssetSource r0 = new pl.droidsonroids.gif.InputSource$AssetSource
            r0.<init>(r2, r3)
            r1.mInputSource = r0
            pl.droidsonroids.gif.GifDrawableInit r2 = r1.self()
            return r2
    }

    public T from(android.content.res.Resources r2, int r3) {
            r1 = this;
            pl.droidsonroids.gif.InputSource$ResourcesSource r0 = new pl.droidsonroids.gif.InputSource$ResourcesSource
            r0.<init>(r2, r3)
            r1.mInputSource = r0
            pl.droidsonroids.gif.GifDrawableInit r2 = r1.self()
            return r2
    }

    public T from(java.io.File r2) {
            r1 = this;
            pl.droidsonroids.gif.InputSource$FileSource r0 = new pl.droidsonroids.gif.InputSource$FileSource
            r0.<init>(r2)
            r1.mInputSource = r0
            pl.droidsonroids.gif.GifDrawableInit r2 = r1.self()
            return r2
    }

    public T from(java.io.FileDescriptor r2) {
            r1 = this;
            pl.droidsonroids.gif.InputSource$FileDescriptorSource r0 = new pl.droidsonroids.gif.InputSource$FileDescriptorSource
            r0.<init>(r2)
            r1.mInputSource = r0
            pl.droidsonroids.gif.GifDrawableInit r2 = r1.self()
            return r2
    }

    public T from(java.io.InputStream r2) {
            r1 = this;
            pl.droidsonroids.gif.InputSource$InputStreamSource r0 = new pl.droidsonroids.gif.InputSource$InputStreamSource
            r0.<init>(r2)
            r1.mInputSource = r0
            pl.droidsonroids.gif.GifDrawableInit r2 = r1.self()
            return r2
    }

    public T from(java.lang.String r2) {
            r1 = this;
            pl.droidsonroids.gif.InputSource$FileSource r0 = new pl.droidsonroids.gif.InputSource$FileSource
            r0.<init>(r2)
            r1.mInputSource = r0
            pl.droidsonroids.gif.GifDrawableInit r2 = r1.self()
            return r2
    }

    public T from(java.nio.ByteBuffer r2) {
            r1 = this;
            pl.droidsonroids.gif.InputSource$DirectByteBufferSource r0 = new pl.droidsonroids.gif.InputSource$DirectByteBufferSource
            r0.<init>(r2)
            r1.mInputSource = r0
            pl.droidsonroids.gif.GifDrawableInit r2 = r1.self()
            return r2
    }

    public T from(byte[] r2) {
            r1 = this;
            pl.droidsonroids.gif.InputSource$ByteArraySource r0 = new pl.droidsonroids.gif.InputSource$ByteArraySource
            r0.<init>(r2)
            r1.mInputSource = r0
            pl.droidsonroids.gif.GifDrawableInit r2 = r1.self()
            return r2
    }

    public java.util.concurrent.ScheduledThreadPoolExecutor getExecutor() {
            r1 = this;
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = r1.mExecutor
            return r0
    }

    public pl.droidsonroids.gif.InputSource getInputSource() {
            r1 = this;
            pl.droidsonroids.gif.InputSource r0 = r1.mInputSource
            return r0
    }

    public pl.droidsonroids.gif.GifDrawable getOldDrawable() {
            r1 = this;
            pl.droidsonroids.gif.GifDrawable r0 = r1.mOldDrawable
            return r0
    }

    public pl.droidsonroids.gif.GifOptions getOptions() {
            r1 = this;
            pl.droidsonroids.gif.GifOptions r0 = r1.mOptions
            return r0
    }

    public boolean isRenderingTriggeredOnDraw() {
            r1 = this;
            boolean r0 = r1.mIsRenderingTriggeredOnDraw
            return r0
    }

    @pl.droidsonroids.gif.annotations.Beta
    public T options(@androidx.annotation.Nullable pl.droidsonroids.gif.GifOptions r2) {
            r1 = this;
            pl.droidsonroids.gif.GifOptions r0 = r1.mOptions
            r0.setFrom(r2)
            pl.droidsonroids.gif.GifDrawableInit r2 = r1.self()
            return r2
    }

    public T renderingTriggeredOnDraw(boolean r1) {
            r0 = this;
            r0.mIsRenderingTriggeredOnDraw = r1
            pl.droidsonroids.gif.GifDrawableInit r1 = r0.self()
            return r1
    }

    public T sampleSize(@androidx.annotation.IntRange(from = 1, to = 65535) int r2) {
            r1 = this;
            pl.droidsonroids.gif.GifOptions r0 = r1.mOptions
            r0.setInSampleSize(r2)
            pl.droidsonroids.gif.GifDrawableInit r2 = r1.self()
            return r2
    }

    public abstract T self();

    public T setRenderingTriggeredOnDraw(boolean r1) {
            r0 = this;
            pl.droidsonroids.gif.GifDrawableInit r1 = r0.renderingTriggeredOnDraw(r1)
            return r1
    }

    public T taskExecutor(java.util.concurrent.ScheduledThreadPoolExecutor r1) {
            r0 = this;
            r0.mExecutor = r1
            pl.droidsonroids.gif.GifDrawableInit r1 = r0.self()
            return r1
    }

    public T threadPoolSize(int r2) {
            r1 = this;
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = new java.util.concurrent.ScheduledThreadPoolExecutor
            r0.<init>(r2)
            r1.mExecutor = r0
            pl.droidsonroids.gif.GifDrawableInit r2 = r1.self()
            return r2
    }

    public T with(pl.droidsonroids.gif.GifDrawable r1) {
            r0 = this;
            r0.mOldDrawable = r1
            pl.droidsonroids.gif.GifDrawableInit r1 = r0.self()
            return r1
    }
}
