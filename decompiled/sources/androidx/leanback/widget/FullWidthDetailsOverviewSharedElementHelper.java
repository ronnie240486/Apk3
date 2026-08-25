package androidx.leanback.widget;

/* JADX INFO: loaded from: classes2.dex */
public class FullWidthDetailsOverviewSharedElementHelper extends androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter.Listener {
    private static final long DEFAULT_TIMEOUT = 5000;
    public android.app.Activity mActivityToRunTransition;
    private boolean mAutoStartSharedElementTransition;
    public java.lang.String mSharedElementName;
    private boolean mStartedPostpone;
    public androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter.ViewHolder mViewHolder;



    /* JADX INFO: loaded from: classes.dex */
    public static class TransitionTimeOutRunnable implements java.lang.Runnable {
        public java.lang.ref.WeakReference<androidx.leanback.widget.FullWidthDetailsOverviewSharedElementHelper> mHelperRef;

        public TransitionTimeOutRunnable(androidx.leanback.widget.FullWidthDetailsOverviewSharedElementHelper r2) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.mHelperRef = r0
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                java.lang.ref.WeakReference<androidx.leanback.widget.FullWidthDetailsOverviewSharedElementHelper> r0 = r1.mHelperRef
                java.lang.Object r0 = r0.get()
                androidx.leanback.widget.FullWidthDetailsOverviewSharedElementHelper r0 = (androidx.leanback.widget.FullWidthDetailsOverviewSharedElementHelper) r0
                if (r0 != 0) goto Lb
                return
            Lb:
                r0.startPostponedEnterTransition()
                return
        }
    }

    public FullWidthDetailsOverviewSharedElementHelper() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.mAutoStartSharedElementTransition = r0
            return
    }

    public boolean getAutoStartSharedElementTransition() {
            r1 = this;
            boolean r0 = r1.mAutoStartSharedElementTransition
            return r0
    }

    @Override // androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter.Listener
    public void onBindLogo(androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter.ViewHolder r2) {
            r1 = this;
            r1.mViewHolder = r2
            boolean r0 = r1.mAutoStartSharedElementTransition
            if (r0 != 0) goto L7
            return
        L7:
            if (r2 == 0) goto L13
            androidx.leanback.widget.DetailsOverviewLogoPresenter$ViewHolder r2 = r2.getLogoViewHolder()
            android.view.View r2 = r2.view
            r0 = 0
            androidx.core.view.ViewCompat.setTransitionName(r2, r0)
        L13:
            androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter$ViewHolder r2 = r1.mViewHolder
            android.view.ViewGroup r2 = r2.getDetailsDescriptionFrame()
            androidx.leanback.widget.FullWidthDetailsOverviewSharedElementHelper$1 r0 = new androidx.leanback.widget.FullWidthDetailsOverviewSharedElementHelper$1
            r0.<init>(r1)
            r2.postOnAnimation(r0)
            return
    }

    public void setAutoStartSharedElementTransition(boolean r1) {
            r0 = this;
            r0.mAutoStartSharedElementTransition = r1
            return
    }

    public void setSharedElementEnterTransition(android.app.Activity r3, java.lang.String r4) {
            r2 = this;
            r0 = 5000(0x1388, double:2.4703E-320)
            r2.setSharedElementEnterTransition(r3, r4, r0)
            return
    }

    public void setSharedElementEnterTransition(android.app.Activity r2, java.lang.String r3, long r4) {
            r1 = this;
            if (r2 != 0) goto L8
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L11
        L8:
            if (r2 == 0) goto L17
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L11
            goto L17
        L11:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
        L17:
            android.app.Activity r0 = r1.mActivityToRunTransition
            if (r2 != r0) goto L24
            java.lang.String r0 = r1.mSharedElementName
            boolean r0 = android.text.TextUtils.equals(r3, r0)
            if (r0 == 0) goto L24
            return
        L24:
            r1.mActivityToRunTransition = r2
            r1.mSharedElementName = r3
            android.view.Window r2 = r2.getWindow()
            java.lang.Object r2 = androidx.leanback.transition.TransitionHelper.getSharedElementEnterTransition(r2)
            if (r2 == 0) goto L34
            r2 = 1
            goto L35
        L34:
            r2 = 0
        L35:
            r1.setAutoStartSharedElementTransition(r2)
            android.app.Activity r2 = r1.mActivityToRunTransition
            androidx.core.app.ActivityCompat.postponeEnterTransition(r2)
            r2 = 0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L50
            android.os.Handler r2 = new android.os.Handler
            r2.<init>()
            androidx.leanback.widget.FullWidthDetailsOverviewSharedElementHelper$TransitionTimeOutRunnable r3 = new androidx.leanback.widget.FullWidthDetailsOverviewSharedElementHelper$TransitionTimeOutRunnable
            r3.<init>(r1)
            r2.postDelayed(r3, r4)
        L50:
            return
    }

    public void startPostponedEnterTransition() {
            r2 = this;
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            androidx.leanback.widget.FullWidthDetailsOverviewSharedElementHelper$2 r1 = new androidx.leanback.widget.FullWidthDetailsOverviewSharedElementHelper$2
            r1.<init>(r2)
            r0.post(r1)
            return
    }

    public final void startPostponedEnterTransitionInternal() {
            r1 = this;
            boolean r0 = r1.mStartedPostpone
            if (r0 != 0) goto L10
            androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter$ViewHolder r0 = r1.mViewHolder
            if (r0 == 0) goto L10
            android.app.Activity r0 = r1.mActivityToRunTransition
            androidx.core.app.ActivityCompat.startPostponedEnterTransition(r0)
            r0 = 1
            r1.mStartedPostpone = r0
        L10:
            return
    }
}
