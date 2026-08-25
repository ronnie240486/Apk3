package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
public final class HorizontalHoverCardSwitcher extends androidx.leanback.widget.PresenterSwitcher {
    public int mCardLeft;
    public int mCardRight;
    private int[] mTmpOffsets;
    private android.graphics.Rect mTmpRect;

    public HorizontalHoverCardSwitcher() {
            r1 = this;
            r1.<init>()
            r0 = 2
            int[] r0 = new int[r0]
            r1.mTmpOffsets = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.mTmpRect = r0
            return
    }

    @Override // androidx.leanback.widget.PresenterSwitcher
    public final void insertView(android.view.View r2) {
            r1 = this;
            android.view.ViewGroup r0 = r1.getParentViewGroup()
            r0.addView(r2)
            return
    }

    @Override // androidx.leanback.widget.PresenterSwitcher
    public final void onViewSelected(android.view.View r7) {
            r6 = this;
            android.view.ViewGroup r0 = r6.getParentViewGroup()
            int r0 = r0.getWidth()
            android.view.ViewGroup r1 = r6.getParentViewGroup()
            int r1 = r1.getPaddingRight()
            int r0 = r0 - r1
            android.view.ViewGroup r1 = r6.getParentViewGroup()
            int r1 = r1.getPaddingLeft()
            r2 = 0
            r7.measure(r2, r2)
            android.view.ViewGroup$LayoutParams r3 = r7.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            int r4 = androidx.core.view.ViewCompat.getLayoutDirection(r7)
            r5 = 1
            if (r4 != r5) goto L2b
            r2 = 1
        L2b:
            if (r2 != 0) goto L3e
            int r4 = r6.mCardLeft
            int r5 = r7.getMeasuredWidth()
            int r5 = r5 + r4
            if (r5 <= r0) goto L3e
            int r1 = r7.getMeasuredWidth()
            int r0 = r0 - r1
            r3.leftMargin = r0
            goto L57
        L3e:
            if (r2 == 0) goto L47
            int r0 = r6.mCardLeft
            if (r0 >= r1) goto L47
            r3.leftMargin = r1
            goto L57
        L47:
            if (r2 == 0) goto L53
            int r0 = r6.mCardRight
            int r1 = r7.getMeasuredWidth()
            int r0 = r0 - r1
            r3.leftMargin = r0
            goto L57
        L53:
            int r0 = r6.mCardLeft
            r3.leftMargin = r0
        L57:
            r7.requestLayout()
            return
    }

    public void select(androidx.leanback.widget.HorizontalGridView r5, android.view.View r6, java.lang.Object r7) {
            r4 = this;
            android.view.ViewGroup r0 = r4.getParentViewGroup()
            int[] r1 = r4.mTmpOffsets
            r5.getViewSelectedOffsets(r6, r1)
            android.graphics.Rect r5 = r4.mTmpRect
            int r1 = r6.getWidth()
            int r2 = r6.getHeight()
            r3 = 0
            r5.set(r3, r3, r1, r2)
            android.graphics.Rect r5 = r4.mTmpRect
            r0.offsetDescendantRectToMyCoords(r6, r5)
            android.graphics.Rect r5 = r4.mTmpRect
            int r6 = r5.left
            int[] r0 = r4.mTmpOffsets
            r1 = r0[r3]
            int r6 = r6 - r1
            r4.mCardLeft = r6
            int r5 = r5.right
            r6 = r0[r3]
            int r5 = r5 - r6
            r4.mCardRight = r5
            r4.select(r7)
            return
    }
}
