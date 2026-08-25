package androidx.leanback.widget;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class PlaybackTransportRowView extends android.widget.LinearLayout {
    private androidx.leanback.widget.PlaybackTransportRowView.OnUnhandledKeyListener mOnUnhandledKeyListener;

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public interface OnUnhandledKeyListener {
        boolean onUnhandledKey(android.view.KeyEvent r1);
    }

    public PlaybackTransportRowView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public PlaybackTransportRowView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
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
            androidx.leanback.widget.PlaybackTransportRowView$OnUnhandledKeyListener r0 = r2.mOnUnhandledKeyListener
            if (r0 == 0) goto L13
            boolean r3 = r0.onUnhandledKey(r3)
            if (r3 == 0) goto L13
            goto L14
        L13:
            r1 = 0
        L14:
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public android.view.View focusSearch(android.view.View r4, int r5) {
            r3 = this;
            if (r4 == 0) goto L5f
            r0 = 33
            if (r5 != r0) goto L20
            android.view.View r0 = r3.getFocusedChild()
            int r0 = r3.indexOfChild(r0)
            int r0 = r0 + (-1)
        L10:
            if (r0 < 0) goto L5f
            android.view.View r1 = r3.getChildAt(r0)
            boolean r2 = r1.hasFocusable()
            if (r2 == 0) goto L1d
            return r1
        L1d:
            int r0 = r0 + (-1)
            goto L10
        L20:
            r0 = 130(0x82, float:1.82E-43)
            if (r5 != r0) goto L40
            android.view.View r0 = r3.getFocusedChild()
            int r0 = r3.indexOfChild(r0)
        L2c:
            int r0 = r0 + 1
            int r1 = r3.getChildCount()
            if (r0 >= r1) goto L5f
            android.view.View r1 = r3.getChildAt(r0)
            boolean r2 = r1.hasFocusable()
            if (r2 == 0) goto L3f
            return r1
        L3f:
            goto L2c
        L40:
            r0 = 17
            if (r5 == r0) goto L48
            r0 = 66
            if (r5 != r0) goto L5f
        L48:
            android.view.View r0 = r3.getFocusedChild()
            boolean r0 = r0 instanceof android.view.ViewGroup
            if (r0 == 0) goto L5f
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r3.getFocusedChild()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            android.view.View r4 = r0.findNextFocus(r1, r4, r5)
            return r4
        L5f:
            android.view.View r4 = super.focusSearch(r4, r5)
            return r4
    }

    public androidx.leanback.widget.PlaybackTransportRowView.OnUnhandledKeyListener getOnUnhandledKeyListener() {
            r1 = this;
            androidx.leanback.widget.PlaybackTransportRowView$OnUnhandledKeyListener r0 = r1.mOnUnhandledKeyListener
            return r0
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int r4, android.graphics.Rect r5) {
            r3 = this;
            android.view.View r0 = r3.findFocus()
            r1 = 1
            if (r0 == 0) goto Le
            boolean r0 = r0.requestFocus(r4, r5)
            if (r0 == 0) goto Le
            return r1
        Le:
            int r0 = androidx.leanback.R.id.playback_progress
            android.view.View r0 = r3.findViewById(r0)
            if (r0 == 0) goto L23
            boolean r2 = r0.isFocusable()
            if (r2 == 0) goto L23
            boolean r0 = r0.requestFocus(r4, r5)
            if (r0 == 0) goto L23
            return r1
        L23:
            boolean r4 = super.onRequestFocusInDescendants(r4, r5)
            return r4
    }

    public void setOnUnhandledKeyListener(androidx.leanback.widget.PlaybackTransportRowView.OnUnhandledKeyListener r1) {
            r0 = this;
            r0.mOnUnhandledKeyListener = r1
            return
    }
}
