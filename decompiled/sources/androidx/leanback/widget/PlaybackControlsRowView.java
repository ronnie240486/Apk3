package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
class PlaybackControlsRowView extends android.widget.LinearLayout {
    private androidx.leanback.widget.PlaybackControlsRowView.OnUnhandledKeyListener mOnUnhandledKeyListener;

    /* JADX INFO: loaded from: classes2.dex */
    public interface OnUnhandledKeyListener {
        boolean onUnhandledKey(android.view.KeyEvent r1);
    }

    public PlaybackControlsRowView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public PlaybackControlsRowView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent r3) {
            r2 = this;
            boolean r0 = super.dispatchKeyEvent(r3)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            androidx.leanback.widget.PlaybackControlsRowView$OnUnhandledKeyListener r0 = r2.mOnUnhandledKeyListener
            if (r0 == 0) goto L13
            boolean r3 = r0.onUnhandledKey(r3)
            if (r3 == 0) goto L13
            goto L14
        L13:
            r1 = 0
        L14:
            return r1
    }

    public androidx.leanback.widget.PlaybackControlsRowView.OnUnhandledKeyListener getOnUnhandledKeyListener() {
            r1 = this;
            androidx.leanback.widget.PlaybackControlsRowView$OnUnhandledKeyListener r0 = r1.mOnUnhandledKeyListener
            return r0
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int r2, android.graphics.Rect r3) {
            r1 = this;
            android.view.View r0 = r1.findFocus()
            if (r0 == 0) goto Le
            boolean r0 = r0.requestFocus(r2, r3)
            if (r0 == 0) goto Le
            r2 = 1
            return r2
        Le:
            boolean r2 = super.onRequestFocusInDescendants(r2, r3)
            return r2
    }

    public void setOnUnhandledKeyListener(androidx.leanback.widget.PlaybackControlsRowView.OnUnhandledKeyListener r1) {
            r0 = this;
            r0.mOnUnhandledKeyListener = r1
            return
    }
}
