package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ButtonBarLayout extends android.widget.LinearLayout {
    private static final int PEEK_BUTTON_DP = 16;
    private boolean mAllowStacking;
    private int mLastWidthSize;
    private boolean mStacked;

    public ButtonBarLayout(@androidx.annotation.NonNull android.content.Context r9, @androidx.annotation.Nullable android.util.AttributeSet r10) {
            r8 = this;
            r8.<init>(r9, r10)
            r0 = -1
            r8.mLastWidthSize = r0
            int[] r3 = androidx.appcompat.R.styleable.ButtonBarLayout
            android.content.res.TypedArray r0 = r9.obtainStyledAttributes(r10, r3)
            r6 = 0
            r7 = 0
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r0
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r1, r2, r3, r4, r5, r6, r7)
            int r9 = androidx.appcompat.R.styleable.ButtonBarLayout_allowStacking
            r10 = 1
            boolean r9 = r0.getBoolean(r9, r10)
            r8.mAllowStacking = r9
            r0.recycle()
            int r9 = r8.getOrientation()
            if (r9 != r10) goto L2c
            boolean r9 = r8.mAllowStacking
            r8.setStacked(r9)
        L2c:
            return
    }

    private int getNextVisibleChildIndex(int r3) {
            r2 = this;
            int r0 = r2.getChildCount()
        L4:
            if (r3 >= r0) goto L14
            android.view.View r1 = r2.getChildAt(r3)
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L11
            return r3
        L11:
            int r3 = r3 + 1
            goto L4
        L14:
            r3 = -1
            return r3
    }

    private boolean isStacked() {
            r1 = this;
            boolean r0 = r1.mStacked
            return r0
    }

    private void setStacked(boolean r2) {
            r1 = this;
            boolean r0 = r1.mStacked
            if (r0 == r2) goto L3d
            if (r2 == 0) goto La
            boolean r0 = r1.mAllowStacking
            if (r0 == 0) goto L3d
        La:
            r1.mStacked = r2
            r1.setOrientation(r2)
            if (r2 == 0) goto L15
            r0 = 8388613(0x800005, float:1.175495E-38)
            goto L17
        L15:
            r0 = 80
        L17:
            r1.setGravity(r0)
            int r0 = androidx.appcompat.R.id.spacer
            android.view.View r0 = r1.findViewById(r0)
            if (r0 == 0) goto L2b
            if (r2 == 0) goto L27
            r2 = 8
            goto L28
        L27:
            r2 = 4
        L28:
            r0.setVisibility(r2)
        L2b:
            int r2 = r1.getChildCount()
            int r2 = r2 + (-2)
        L31:
            if (r2 < 0) goto L3d
            android.view.View r0 = r1.getChildAt(r2)
            r1.bringChildToFront(r0)
            int r2 = r2 + (-1)
            goto L31
        L3d:
            return
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r7, int r8) {
            r6 = this;
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            boolean r1 = r6.mAllowStacking
            r2 = 0
            if (r1 == 0) goto L18
            int r1 = r6.mLastWidthSize
            if (r0 <= r1) goto L16
            boolean r1 = r6.isStacked()
            if (r1 == 0) goto L16
            r6.setStacked(r2)
        L16:
            r6.mLastWidthSize = r0
        L18:
            boolean r1 = r6.isStacked()
            r3 = 1
            if (r1 != 0) goto L2f
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r1 != r4) goto L2f
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r1 = 1
            goto L31
        L2f:
            r0 = r7
            r1 = 0
        L31:
            super.onMeasure(r0, r8)
            boolean r0 = r6.mAllowStacking
            if (r0 == 0) goto L52
            boolean r0 = r6.isStacked()
            if (r0 != 0) goto L52
            int r0 = r6.getMeasuredWidthAndState()
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r4
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            if (r0 != r4) goto L4b
            r0 = 1
            goto L4c
        L4b:
            r0 = 0
        L4c:
            if (r0 == 0) goto L52
            r6.setStacked(r3)
            r1 = 1
        L52:
            if (r1 == 0) goto L57
            super.onMeasure(r7, r8)
        L57:
            int r0 = r6.getNextVisibleChildIndex(r2)
            if (r0 < 0) goto La7
            android.view.View r1 = r6.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r4 = (android.widget.LinearLayout.LayoutParams) r4
            int r5 = r6.getPaddingTop()
            int r1 = r1.getMeasuredHeight()
            int r1 = r1 + r5
            int r5 = r4.topMargin
            int r1 = r1 + r5
            int r4 = r4.bottomMargin
            int r1 = r1 + r4
            int r1 = r1 + r2
            boolean r2 = r6.isStacked()
            if (r2 == 0) goto La1
            int r0 = r0 + r3
            int r0 = r6.getNextVisibleChildIndex(r0)
            if (r0 < 0) goto L9f
            android.view.View r0 = r6.getChildAt(r0)
            int r0 = r0.getPaddingTop()
            r2 = 1098907648(0x41800000, float:16.0)
            android.content.res.Resources r3 = r6.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r3 = r3 * r2
            int r2 = (int) r3
            int r0 = r0 + r2
            int r0 = r0 + r1
            r2 = r0
            goto La7
        L9f:
            r2 = r1
            goto La7
        La1:
            int r0 = r6.getPaddingBottom()
            int r2 = r0 + r1
        La7:
            int r0 = androidx.core.view.ViewCompat.getMinimumHeight(r6)
            if (r0 == r2) goto Lb5
            r6.setMinimumHeight(r2)
            if (r8 != 0) goto Lb5
            super.onMeasure(r7, r8)
        Lb5:
            return
    }

    public void setAllowStacking(boolean r2) {
            r1 = this;
            boolean r0 = r1.mAllowStacking
            if (r0 == r2) goto L15
            r1.mAllowStacking = r2
            if (r2 != 0) goto L12
            boolean r2 = r1.isStacked()
            if (r2 == 0) goto L12
            r2 = 0
            r1.setStacked(r2)
        L12:
            r1.requestLayout()
        L15:
            return
    }
}
