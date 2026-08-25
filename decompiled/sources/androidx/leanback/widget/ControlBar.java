package androidx.leanback.widget;

/* JADX INFO: loaded from: classes2.dex */
class ControlBar extends android.widget.LinearLayout {
    private int mChildMarginFromCenter;
    public boolean mDefaultFocusToMiddle;
    public int mLastFocusIndex;
    private androidx.leanback.widget.ControlBar.OnChildFocusedListener mOnChildFocusedListener;

    /* JADX INFO: loaded from: classes.dex */
    public interface OnChildFocusedListener {
        void onChildFocusedListener(android.view.View r1, android.view.View r2);
    }

    public ControlBar(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = -1
            r0.mLastFocusIndex = r1
            r1 = 1
            r0.mDefaultFocusToMiddle = r1
            return
    }

    public ControlBar(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = -1
            r0.mLastFocusIndex = r1
            r1 = 1
            r0.mDefaultFocusToMiddle = r1
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(java.util.ArrayList<android.view.View> r2, int r3, int r4) {
            r1 = this;
            r0 = 33
            if (r3 == r0) goto Ld
            r0 = 130(0x82, float:1.82E-43)
            if (r3 != r0) goto L9
            goto Ld
        L9:
            super.addFocusables(r2, r3, r4)
            goto L3a
        Ld:
            int r3 = r1.mLastFocusIndex
            if (r3 < 0) goto L21
            int r4 = r1.getChildCount()
            if (r3 >= r4) goto L21
            int r3 = r1.mLastFocusIndex
            android.view.View r3 = r1.getChildAt(r3)
            r2.add(r3)
            goto L3a
        L21:
            int r3 = r1.getChildCount()
            if (r3 <= 0) goto L3a
            boolean r3 = r1.mDefaultFocusToMiddle
            if (r3 == 0) goto L32
            int r3 = r1.getChildCount()
            int r3 = r3 / 2
            goto L33
        L32:
            r3 = 0
        L33:
            android.view.View r3 = r1.getChildAt(r3)
            r2.add(r3)
        L3a:
            return
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r5, int r6) {
            r4 = this;
            super.onMeasure(r5, r6)
            int r5 = r4.mChildMarginFromCenter
            if (r5 > 0) goto L8
            return
        L8:
            r5 = 0
            r6 = 0
        La:
            int r0 = r4.getChildCount()
            int r0 = r0 + (-1)
            if (r5 >= r0) goto L3e
            android.view.View r0 = r4.getChildAt(r5)
            int r5 = r5 + 1
            android.view.View r1 = r4.getChildAt(r5)
            int r0 = r0.getMeasuredWidth()
            int r2 = r1.getMeasuredWidth()
            int r2 = r2 + r0
            int r0 = r4.mChildMarginFromCenter
            int r2 = r2 / 2
            int r0 = r0 - r2
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            int r3 = r2.getMarginStart()
            int r3 = r0 - r3
            r2.setMarginStart(r0)
            r1.setLayoutParams(r2)
            int r6 = r6 + r3
            goto La
        L3e:
            int r5 = r4.getMeasuredWidth()
            int r5 = r5 + r6
            int r6 = r4.getMeasuredHeight()
            r4.setMeasuredDimension(r5, r6)
            return
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int r3, android.graphics.Rect r4) {
            r2 = this;
            int r0 = r2.getChildCount()
            if (r0 <= 0) goto L2b
            int r0 = r2.mLastFocusIndex
            if (r0 < 0) goto L13
            int r1 = r2.getChildCount()
            if (r0 >= r1) goto L13
            int r0 = r2.mLastFocusIndex
            goto L1f
        L13:
            boolean r0 = r2.mDefaultFocusToMiddle
            if (r0 == 0) goto L1e
            int r0 = r2.getChildCount()
            int r0 = r0 / 2
            goto L1f
        L1e:
            r0 = 0
        L1f:
            android.view.View r0 = r2.getChildAt(r0)
            boolean r0 = r0.requestFocus(r3, r4)
            if (r0 == 0) goto L2b
            r3 = 1
            return r3
        L2b:
            boolean r3 = super.onRequestFocusInDescendants(r3, r4)
            return r3
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(android.view.View r2, android.view.View r3) {
            r1 = this;
            super.requestChildFocus(r2, r3)
            int r0 = r1.indexOfChild(r2)
            r1.mLastFocusIndex = r0
            androidx.leanback.widget.ControlBar$OnChildFocusedListener r0 = r1.mOnChildFocusedListener
            if (r0 == 0) goto L10
            r0.onChildFocusedListener(r2, r3)
        L10:
            return
    }

    public void setChildMarginFromCenter(int r1) {
            r0 = this;
            r0.mChildMarginFromCenter = r1
            return
    }

    public void setOnChildFocusedListener(androidx.leanback.widget.ControlBar.OnChildFocusedListener r1) {
            r0 = this;
            r0.mOnChildFocusedListener = r1
            return
    }
}
