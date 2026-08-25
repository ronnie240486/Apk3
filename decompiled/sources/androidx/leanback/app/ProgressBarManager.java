package androidx.leanback.app;

/* JADX INFO: loaded from: classes3.dex */
public final class ProgressBarManager {
    private static final long DEFAULT_PROGRESS_BAR_DELAY = 1000;
    public boolean mEnableProgressBar;
    private android.os.Handler mHandler;
    private long mInitialDelay;
    public boolean mIsShowing;
    public android.view.View mProgressBarView;
    public boolean mUserProvidedProgressBar;
    public android.view.ViewGroup rootView;
    private java.lang.Runnable runnable;


    public ProgressBarManager() {
            r2 = this;
            r2.<init>()
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.mInitialDelay = r0
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r2.mHandler = r0
            r0 = 1
            r2.mEnableProgressBar = r0
            androidx.leanback.app.ProgressBarManager$1 r0 = new androidx.leanback.app.ProgressBarManager$1
            r0.<init>(r2)
            r2.runnable = r0
            return
    }

    public void disableProgressBar() {
            r1 = this;
            r0 = 0
            r1.mEnableProgressBar = r0
            return
    }

    public void enableProgressBar() {
            r1 = this;
            r0 = 1
            r1.mEnableProgressBar = r0
            return
    }

    public long getInitialDelay() {
            r2 = this;
            long r0 = r2.mInitialDelay
            return r0
    }

    public void hide() {
            r2 = this;
            r0 = 0
            r2.mIsShowing = r0
            boolean r0 = r2.mUserProvidedProgressBar
            if (r0 == 0) goto Le
            android.view.View r0 = r2.mProgressBarView
            r1 = 4
            r0.setVisibility(r1)
            goto L1a
        Le:
            android.view.View r0 = r2.mProgressBarView
            if (r0 == 0) goto L1a
            android.view.ViewGroup r1 = r2.rootView
            r1.removeView(r0)
            r0 = 0
            r2.mProgressBarView = r0
        L1a:
            android.os.Handler r0 = r2.mHandler
            java.lang.Runnable r1 = r2.runnable
            r0.removeCallbacks(r1)
            return
    }

    public void setInitialDelay(long r1) {
            r0 = this;
            r0.mInitialDelay = r1
            return
    }

    public void setProgressBarView(android.view.View r2) {
            r1 = this;
            android.view.ViewParent r0 = r2.getParent()
            if (r0 == 0) goto L10
            r1.mProgressBarView = r2
            r0 = 4
            r2.setVisibility(r0)
            r2 = 1
            r1.mUserProvidedProgressBar = r2
            return
        L10:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Must have a parent"
            r2.<init>(r0)
            throw r2
    }

    public void setRootView(android.view.ViewGroup r1) {
            r0 = this;
            r0.rootView = r1
            return
    }

    public void show() {
            r4 = this;
            boolean r0 = r4.mEnableProgressBar
            if (r0 == 0) goto L10
            r0 = 1
            r4.mIsShowing = r0
            android.os.Handler r0 = r4.mHandler
            java.lang.Runnable r1 = r4.runnable
            long r2 = r4.mInitialDelay
            r0.postDelayed(r1, r2)
        L10:
            return
    }
}
