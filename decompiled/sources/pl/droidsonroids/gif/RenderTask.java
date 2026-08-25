package pl.droidsonroids.gif;

/* JADX INFO: loaded from: classes3.dex */
class RenderTask extends pl.droidsonroids.gif.SafeRunnable {
    public RenderTask(pl.droidsonroids.gif.GifDrawable r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // pl.droidsonroids.gif.SafeRunnable
    public void doWork() {
            r7 = this;
            pl.droidsonroids.gif.GifDrawable r0 = r7.mGifDrawable
            pl.droidsonroids.gif.GifInfoHandle r1 = r0.mNativeInfoHandle
            android.graphics.Bitmap r0 = r0.mBuffer
            long r0 = r1.renderFrame(r0)
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L6a
            pl.droidsonroids.gif.GifDrawable r4 = r7.mGifDrawable
            long r5 = android.os.SystemClock.uptimeMillis()
            long r5 = r5 + r0
            r4.mNextFrameRenderTime = r5
            pl.droidsonroids.gif.GifDrawable r4 = r7.mGifDrawable
            boolean r4 = r4.isVisible()
            if (r4 == 0) goto L3e
            pl.droidsonroids.gif.GifDrawable r4 = r7.mGifDrawable
            boolean r4 = r4.mIsRunning
            if (r4 == 0) goto L3e
            pl.droidsonroids.gif.GifDrawable r4 = r7.mGifDrawable
            boolean r5 = r4.mIsRenderingTriggeredOnDraw
            if (r5 != 0) goto L3e
            java.util.concurrent.ScheduledThreadPoolExecutor r4 = r4.mExecutor
            r4.remove(r7)
            pl.droidsonroids.gif.GifDrawable r4 = r7.mGifDrawable
            java.util.concurrent.ScheduledThreadPoolExecutor r5 = r4.mExecutor
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledFuture r0 = r5.schedule(r7, r0, r6)
            r4.mRenderTaskSchedule = r0
        L3e:
            pl.droidsonroids.gif.GifDrawable r0 = r7.mGifDrawable
            java.util.concurrent.ConcurrentLinkedQueue<pl.droidsonroids.gif.AnimationListener> r0 = r0.mListeners
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L73
            pl.droidsonroids.gif.GifDrawable r0 = r7.mGifDrawable
            int r0 = r0.getCurrentFrameIndex()
            pl.droidsonroids.gif.GifDrawable r1 = r7.mGifDrawable
            pl.droidsonroids.gif.GifInfoHandle r1 = r1.mNativeInfoHandle
            int r1 = r1.getNumberOfFrames()
            int r1 = r1 + (-1)
            if (r0 != r1) goto L73
            pl.droidsonroids.gif.GifDrawable r0 = r7.mGifDrawable
            pl.droidsonroids.gif.InvalidationHandler r1 = r0.mInvalidationHandler
            int r0 = r0.getCurrentLoop()
            pl.droidsonroids.gif.GifDrawable r4 = r7.mGifDrawable
            long r4 = r4.mNextFrameRenderTime
            r1.sendEmptyMessageAtTime(r0, r4)
            goto L73
        L6a:
            pl.droidsonroids.gif.GifDrawable r0 = r7.mGifDrawable
            r4 = -9223372036854775808
            r0.mNextFrameRenderTime = r4
            r1 = 0
            r0.mIsRunning = r1
        L73:
            pl.droidsonroids.gif.GifDrawable r0 = r7.mGifDrawable
            boolean r0 = r0.isVisible()
            if (r0 == 0) goto L8d
            pl.droidsonroids.gif.GifDrawable r0 = r7.mGifDrawable
            pl.droidsonroids.gif.InvalidationHandler r0 = r0.mInvalidationHandler
            r1 = -1
            boolean r0 = r0.hasMessages(r1)
            if (r0 != 0) goto L8d
            pl.droidsonroids.gif.GifDrawable r0 = r7.mGifDrawable
            pl.droidsonroids.gif.InvalidationHandler r0 = r0.mInvalidationHandler
            r0.sendEmptyMessageAtTime(r1, r2)
        L8d:
            return
    }
}
