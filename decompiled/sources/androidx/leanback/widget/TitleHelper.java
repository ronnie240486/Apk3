package androidx.leanback.widget;

/* JADX INFO: loaded from: classes2.dex */
public class TitleHelper {
    private final androidx.leanback.widget.BrowseFrameLayout.OnFocusSearchListener mOnFocusSearchListener;
    public android.view.ViewGroup mSceneRoot;
    private java.lang.Object mSceneWithTitle;
    private java.lang.Object mSceneWithoutTitle;
    private java.lang.Object mTitleDownTransition;
    private java.lang.Object mTitleUpTransition;
    public android.view.View mTitleView;




    public TitleHelper(android.view.ViewGroup r2, android.view.View r3) {
            r1 = this;
            r1.<init>()
            androidx.leanback.widget.TitleHelper$1 r0 = new androidx.leanback.widget.TitleHelper$1
            r0.<init>(r1)
            r1.mOnFocusSearchListener = r0
            if (r2 == 0) goto L16
            if (r3 == 0) goto L16
            r1.mSceneRoot = r2
            r1.mTitleView = r3
            r1.createTransitions()
            return
        L16:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Views may not be null"
            r2.<init>(r3)
            throw r2
    }

    private void createTransitions() {
            r2 = this;
            android.view.ViewGroup r0 = r2.mSceneRoot
            android.content.Context r0 = r0.getContext()
            java.lang.Object r0 = androidx.leanback.transition.LeanbackTransitionHelper.loadTitleOutTransition(r0)
            r2.mTitleUpTransition = r0
            android.view.ViewGroup r0 = r2.mSceneRoot
            android.content.Context r0 = r0.getContext()
            java.lang.Object r0 = androidx.leanback.transition.LeanbackTransitionHelper.loadTitleInTransition(r0)
            r2.mTitleDownTransition = r0
            android.view.ViewGroup r0 = r2.mSceneRoot
            androidx.leanback.widget.TitleHelper$2 r1 = new androidx.leanback.widget.TitleHelper$2
            r1.<init>(r2)
            java.lang.Object r0 = androidx.leanback.transition.TransitionHelper.createScene(r0, r1)
            r2.mSceneWithTitle = r0
            android.view.ViewGroup r0 = r2.mSceneRoot
            androidx.leanback.widget.TitleHelper$3 r1 = new androidx.leanback.widget.TitleHelper$3
            r1.<init>(r2)
            java.lang.Object r0 = androidx.leanback.transition.TransitionHelper.createScene(r0, r1)
            r2.mSceneWithoutTitle = r0
            return
    }

    public androidx.leanback.widget.BrowseFrameLayout.OnFocusSearchListener getOnFocusSearchListener() {
            r1 = this;
            androidx.leanback.widget.BrowseFrameLayout$OnFocusSearchListener r0 = r1.mOnFocusSearchListener
            return r0
    }

    public android.view.ViewGroup getSceneRoot() {
            r1 = this;
            android.view.ViewGroup r0 = r1.mSceneRoot
            return r0
    }

    public android.view.View getTitleView() {
            r1 = this;
            android.view.View r0 = r1.mTitleView
            return r0
    }

    public void showTitle(boolean r2) {
            r1 = this;
            if (r2 == 0) goto La
            java.lang.Object r2 = r1.mSceneWithTitle
            java.lang.Object r0 = r1.mTitleDownTransition
            androidx.leanback.transition.TransitionHelper.runTransition(r2, r0)
            goto L11
        La:
            java.lang.Object r2 = r1.mSceneWithoutTitle
            java.lang.Object r0 = r1.mTitleUpTransition
            androidx.leanback.transition.TransitionHelper.runTransition(r2, r0)
        L11:
            return
    }
}
