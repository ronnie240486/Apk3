package pl.droidsonroids.gif;

/* JADX INFO: loaded from: classes3.dex */
class InvalidationHandler extends android.os.Handler {
    private final java.lang.ref.WeakReference<pl.droidsonroids.gif.GifDrawable> mDrawableRef;

    public InvalidationHandler(pl.droidsonroids.gif.GifDrawable r2) {
            r1 = this;
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r1.<init>(r0)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.mDrawableRef = r0
            return
    }

    @Override // android.os.Handler
    public void handleMessage(@androidx.annotation.NonNull android.os.Message r4) {
            r3 = this;
            java.lang.ref.WeakReference<pl.droidsonroids.gif.GifDrawable> r0 = r3.mDrawableRef
            java.lang.Object r0 = r0.get()
            pl.droidsonroids.gif.GifDrawable r0 = (pl.droidsonroids.gif.GifDrawable) r0
            if (r0 != 0) goto Lb
            return
        Lb:
            int r1 = r4.what
            r2 = -1
            if (r1 != r2) goto L14
            r0.invalidateSelf()
            goto L2c
        L14:
            java.util.concurrent.ConcurrentLinkedQueue<pl.droidsonroids.gif.AnimationListener> r0 = r0.mListeners
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()
            pl.droidsonroids.gif.AnimationListener r1 = (pl.droidsonroids.gif.AnimationListener) r1
            int r2 = r4.what
            r1.onAnimationCompleted(r2)
            goto L1a
        L2c:
            return
    }
}
