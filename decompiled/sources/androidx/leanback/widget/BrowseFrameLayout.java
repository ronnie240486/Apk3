package androidx.leanback.widget;

/* JADX INFO: loaded from: classes2.dex */
public class BrowseFrameLayout extends android.widget.FrameLayout {
    private androidx.leanback.widget.BrowseFrameLayout.OnFocusSearchListener mListener;
    private androidx.leanback.widget.BrowseFrameLayout.OnChildFocusListener mOnChildFocusListener;
    private android.view.View.OnKeyListener mOnDispatchKeyListener;

    public interface OnChildFocusListener {
        void onRequestChildFocus(android.view.View r1, android.view.View r2);

        boolean onRequestFocusInDescendants(int r1, android.graphics.Rect r2);
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface OnFocusSearchListener {
        android.view.View onFocusSearch(android.view.View r1, int r2);
    }

    public BrowseFrameLayout(android.content.Context r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r3, r0, r1)
            return
    }

    public BrowseFrameLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public BrowseFrameLayout(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent r4) {
            r3 = this;
            boolean r0 = super.dispatchKeyEvent(r4)
            android.view.View$OnKeyListener r1 = r3.mOnDispatchKeyListener
            if (r1 == 0) goto L17
            if (r0 != 0) goto L17
            android.view.View r0 = r3.getRootView()
            int r2 = r4.getKeyCode()
            boolean r4 = r1.onKey(r0, r2, r4)
            return r4
        L17:
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public android.view.View focusSearch(android.view.View r2, int r3) {
            r1 = this;
            androidx.leanback.widget.BrowseFrameLayout$OnFocusSearchListener r0 = r1.mListener
            if (r0 == 0) goto Lb
            android.view.View r0 = r0.onFocusSearch(r2, r3)
            if (r0 == 0) goto Lb
            return r0
        Lb:
            android.view.View r2 = super.focusSearch(r2, r3)
            return r2
    }

    public androidx.leanback.widget.BrowseFrameLayout.OnChildFocusListener getOnChildFocusListener() {
            r1 = this;
            androidx.leanback.widget.BrowseFrameLayout$OnChildFocusListener r0 = r1.mOnChildFocusListener
            return r0
    }

    public androidx.leanback.widget.BrowseFrameLayout.OnFocusSearchListener getOnFocusSearchListener() {
            r1 = this;
            androidx.leanback.widget.BrowseFrameLayout$OnFocusSearchListener r0 = r1.mListener
            return r0
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int r2, android.graphics.Rect r3) {
            r1 = this;
            androidx.leanback.widget.BrowseFrameLayout$OnChildFocusListener r0 = r1.mOnChildFocusListener
            if (r0 == 0) goto Lc
            boolean r0 = r0.onRequestFocusInDescendants(r2, r3)
            if (r0 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            boolean r2 = super.onRequestFocusInDescendants(r2, r3)
            return r2
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(android.view.View r2, android.view.View r3) {
            r1 = this;
            androidx.leanback.widget.BrowseFrameLayout$OnChildFocusListener r0 = r1.mOnChildFocusListener
            if (r0 == 0) goto L7
            r0.onRequestChildFocus(r2, r3)
        L7:
            super.requestChildFocus(r2, r3)
            return
    }

    public void setOnChildFocusListener(androidx.leanback.widget.BrowseFrameLayout.OnChildFocusListener r1) {
            r0 = this;
            r0.mOnChildFocusListener = r1
            return
    }

    public void setOnDispatchKeyListener(android.view.View.OnKeyListener r1) {
            r0 = this;
            r0.mOnDispatchKeyListener = r1
            return
    }

    public void setOnFocusSearchListener(androidx.leanback.widget.BrowseFrameLayout.OnFocusSearchListener r1) {
            r0 = this;
            r0.mListener = r1
            return
    }
}
