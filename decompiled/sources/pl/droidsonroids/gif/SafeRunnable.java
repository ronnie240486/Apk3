package pl.droidsonroids.gif;

/* JADX INFO: loaded from: classes3.dex */
abstract class SafeRunnable implements java.lang.Runnable {
    public final pl.droidsonroids.gif.GifDrawable mGifDrawable;

    public SafeRunnable(pl.droidsonroids.gif.GifDrawable r1) {
            r0 = this;
            r0.<init>()
            r0.mGifDrawable = r1
            return
    }

    public abstract void doWork();

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            pl.droidsonroids.gif.GifDrawable r0 = r3.mGifDrawable     // Catch: java.lang.Throwable -> Lc
            boolean r0 = r0.isRecycled()     // Catch: java.lang.Throwable -> Lc
            if (r0 != 0) goto Lb
            r3.doWork()     // Catch: java.lang.Throwable -> Lc
        Lb:
            return
        Lc:
            r0 = move-exception
            java.lang.Thread$UncaughtExceptionHandler r1 = java.lang.Thread.getDefaultUncaughtExceptionHandler()
            if (r1 == 0) goto L1a
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r1.uncaughtException(r2, r0)
        L1a:
            throw r0
    }
}
