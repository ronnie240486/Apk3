package pl.droidsonroids.gif;

/* JADX INFO: loaded from: classes3.dex */
public class MultiCallback implements android.graphics.drawable.Drawable.Callback {
    private final java.util.concurrent.CopyOnWriteArrayList<pl.droidsonroids.gif.MultiCallback.CallbackWeakReference> mCallbacks;
    private final boolean mUseViewInvalidate;

    public static final class CallbackWeakReference extends java.lang.ref.WeakReference<android.graphics.drawable.Drawable.Callback> {
        public CallbackWeakReference(android.graphics.drawable.Drawable.Callback r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 == 0) goto L1f
                java.lang.Class<pl.droidsonroids.gif.MultiCallback$CallbackWeakReference> r2 = pl.droidsonroids.gif.MultiCallback.CallbackWeakReference.class
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L10
                goto L1f
            L10:
                java.lang.Object r2 = r4.get()
                pl.droidsonroids.gif.MultiCallback$CallbackWeakReference r5 = (pl.droidsonroids.gif.MultiCallback.CallbackWeakReference) r5
                java.lang.Object r5 = r5.get()
                if (r2 != r5) goto L1d
                goto L1e
            L1d:
                r0 = 0
            L1e:
                return r0
            L1f:
                return r1
        }

        public int hashCode() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                android.graphics.drawable.Drawable$Callback r0 = (android.graphics.drawable.Drawable.Callback) r0
                if (r0 == 0) goto Ld
                int r0 = r0.hashCode()
                goto Le
            Ld:
                r0 = 0
            Le:
                return r0
        }
    }

    public MultiCallback() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public MultiCallback(boolean r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.mCallbacks = r0
            r1.mUseViewInvalidate = r2
            return
    }

    public void addView(android.graphics.drawable.Drawable.Callback r4) {
            r3 = this;
            r0 = 0
        L1:
            java.util.concurrent.CopyOnWriteArrayList<pl.droidsonroids.gif.MultiCallback$CallbackWeakReference> r1 = r3.mCallbacks
            int r1 = r1.size()
            if (r0 >= r1) goto L21
            java.util.concurrent.CopyOnWriteArrayList<pl.droidsonroids.gif.MultiCallback$CallbackWeakReference> r1 = r3.mCallbacks
            java.lang.Object r1 = r1.get(r0)
            pl.droidsonroids.gif.MultiCallback$CallbackWeakReference r1 = (pl.droidsonroids.gif.MultiCallback.CallbackWeakReference) r1
            java.lang.Object r2 = r1.get()
            android.graphics.drawable.Drawable$Callback r2 = (android.graphics.drawable.Drawable.Callback) r2
            if (r2 != 0) goto L1e
            java.util.concurrent.CopyOnWriteArrayList<pl.droidsonroids.gif.MultiCallback$CallbackWeakReference> r2 = r3.mCallbacks
            r2.remove(r1)
        L1e:
            int r0 = r0 + 1
            goto L1
        L21:
            java.util.concurrent.CopyOnWriteArrayList<pl.droidsonroids.gif.MultiCallback$CallbackWeakReference> r0 = r3.mCallbacks
            pl.droidsonroids.gif.MultiCallback$CallbackWeakReference r1 = new pl.droidsonroids.gif.MultiCallback$CallbackWeakReference
            r1.<init>(r4)
            r0.addIfAbsent(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@androidx.annotation.NonNull android.graphics.drawable.Drawable r4) {
            r3 = this;
            r0 = 0
        L1:
            java.util.concurrent.CopyOnWriteArrayList<pl.droidsonroids.gif.MultiCallback$CallbackWeakReference> r1 = r3.mCallbacks
            int r1 = r1.size()
            if (r0 >= r1) goto L33
            java.util.concurrent.CopyOnWriteArrayList<pl.droidsonroids.gif.MultiCallback$CallbackWeakReference> r1 = r3.mCallbacks
            java.lang.Object r1 = r1.get(r0)
            pl.droidsonroids.gif.MultiCallback$CallbackWeakReference r1 = (pl.droidsonroids.gif.MultiCallback.CallbackWeakReference) r1
            java.lang.Object r2 = r1.get()
            android.graphics.drawable.Drawable$Callback r2 = (android.graphics.drawable.Drawable.Callback) r2
            if (r2 == 0) goto L2b
            boolean r1 = r3.mUseViewInvalidate
            if (r1 == 0) goto L27
            boolean r1 = r2 instanceof android.view.View
            if (r1 == 0) goto L27
            android.view.View r2 = (android.view.View) r2
            r2.invalidate()
            goto L30
        L27:
            r2.invalidateDrawable(r4)
            goto L30
        L2b:
            java.util.concurrent.CopyOnWriteArrayList<pl.droidsonroids.gif.MultiCallback$CallbackWeakReference> r2 = r3.mCallbacks
            r2.remove(r1)
        L30:
            int r0 = r0 + 1
            goto L1
        L33:
            return
    }

    public void removeView(android.graphics.drawable.Drawable.Callback r4) {
            r3 = this;
            r0 = 0
        L1:
            java.util.concurrent.CopyOnWriteArrayList<pl.droidsonroids.gif.MultiCallback$CallbackWeakReference> r1 = r3.mCallbacks
            int r1 = r1.size()
            if (r0 >= r1) goto L23
            java.util.concurrent.CopyOnWriteArrayList<pl.droidsonroids.gif.MultiCallback$CallbackWeakReference> r1 = r3.mCallbacks
            java.lang.Object r1 = r1.get(r0)
            pl.droidsonroids.gif.MultiCallback$CallbackWeakReference r1 = (pl.droidsonroids.gif.MultiCallback.CallbackWeakReference) r1
            java.lang.Object r2 = r1.get()
            android.graphics.drawable.Drawable$Callback r2 = (android.graphics.drawable.Drawable.Callback) r2
            if (r2 == 0) goto L1b
            if (r2 != r4) goto L20
        L1b:
            java.util.concurrent.CopyOnWriteArrayList<pl.droidsonroids.gif.MultiCallback$CallbackWeakReference> r2 = r3.mCallbacks
            r2.remove(r1)
        L20:
            int r0 = r0 + 1
            goto L1
        L23:
            return
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@androidx.annotation.NonNull android.graphics.drawable.Drawable r4, @androidx.annotation.NonNull java.lang.Runnable r5, long r6) {
            r3 = this;
            r0 = 0
        L1:
            java.util.concurrent.CopyOnWriteArrayList<pl.droidsonroids.gif.MultiCallback$CallbackWeakReference> r1 = r3.mCallbacks
            int r1 = r1.size()
            if (r0 >= r1) goto L25
            java.util.concurrent.CopyOnWriteArrayList<pl.droidsonroids.gif.MultiCallback$CallbackWeakReference> r1 = r3.mCallbacks
            java.lang.Object r1 = r1.get(r0)
            pl.droidsonroids.gif.MultiCallback$CallbackWeakReference r1 = (pl.droidsonroids.gif.MultiCallback.CallbackWeakReference) r1
            java.lang.Object r2 = r1.get()
            android.graphics.drawable.Drawable$Callback r2 = (android.graphics.drawable.Drawable.Callback) r2
            if (r2 == 0) goto L1d
            r2.scheduleDrawable(r4, r5, r6)
            goto L22
        L1d:
            java.util.concurrent.CopyOnWriteArrayList<pl.droidsonroids.gif.MultiCallback$CallbackWeakReference> r2 = r3.mCallbacks
            r2.remove(r1)
        L22:
            int r0 = r0 + 1
            goto L1
        L25:
            return
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@androidx.annotation.NonNull android.graphics.drawable.Drawable r4, @androidx.annotation.NonNull java.lang.Runnable r5) {
            r3 = this;
            r0 = 0
        L1:
            java.util.concurrent.CopyOnWriteArrayList<pl.droidsonroids.gif.MultiCallback$CallbackWeakReference> r1 = r3.mCallbacks
            int r1 = r1.size()
            if (r0 >= r1) goto L25
            java.util.concurrent.CopyOnWriteArrayList<pl.droidsonroids.gif.MultiCallback$CallbackWeakReference> r1 = r3.mCallbacks
            java.lang.Object r1 = r1.get(r0)
            pl.droidsonroids.gif.MultiCallback$CallbackWeakReference r1 = (pl.droidsonroids.gif.MultiCallback.CallbackWeakReference) r1
            java.lang.Object r2 = r1.get()
            android.graphics.drawable.Drawable$Callback r2 = (android.graphics.drawable.Drawable.Callback) r2
            if (r2 == 0) goto L1d
            r2.unscheduleDrawable(r4, r5)
            goto L22
        L1d:
            java.util.concurrent.CopyOnWriteArrayList<pl.droidsonroids.gif.MultiCallback$CallbackWeakReference> r2 = r3.mCallbacks
            r2.remove(r1)
        L22:
            int r0 = r0 + 1
            goto L1
        L25:
            return
    }
}
