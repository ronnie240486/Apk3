package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
class ItemAlignmentFacetHelper {
    private static android.graphics.Rect sRect;

    static {
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            androidx.leanback.widget.ItemAlignmentFacetHelper.sRect = r0
            return
    }

    private ItemAlignmentFacetHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getAlignmentPosition(android.view.View r7, androidx.leanback.widget.ItemAlignmentFacet.ItemAlignmentDef r8, int r9) {
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            androidx.leanback.widget.GridLayoutManager$LayoutParams r0 = (androidx.leanback.widget.GridLayoutManager.LayoutParams) r0
            int r1 = r8.mViewId
            if (r1 == 0) goto L10
            android.view.View r1 = r7.findViewById(r1)
            if (r1 != 0) goto L11
        L10:
            r1 = r7
        L11:
            int r2 = r8.mOffset
            r3 = 0
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 1120403456(0x42c80000, float:100.0)
            if (r9 != 0) goto Lbb
            int r9 = r7.getLayoutDirection()
            r6 = 1
            if (r9 != r6) goto L74
            if (r1 != r7) goto L28
            int r9 = r0.getOpticalWidth(r1)
            goto L2c
        L28:
            int r9 = r1.getWidth()
        L2c:
            int r9 = r9 - r2
            boolean r2 = r8.mOffsetWithPadding
            if (r2 == 0) goto L46
            float r2 = r8.mOffsetPercent
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 != 0) goto L3d
            int r2 = r1.getPaddingRight()
            int r9 = r9 - r2
            goto L46
        L3d:
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L46
            int r2 = r1.getPaddingLeft()
            int r9 = r9 + r2
        L46:
            float r2 = r8.mOffsetPercent
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L5f
            if (r1 != r7) goto L53
            int r2 = r0.getOpticalWidth(r1)
            goto L57
        L53:
            int r2 = r1.getWidth()
        L57:
            float r2 = (float) r2
            float r8 = r8.mOffsetPercent
            float r2 = r2 * r8
            float r2 = r2 / r5
            int r8 = (int) r2
            int r9 = r9 - r8
        L5f:
            if (r7 == r1) goto L116
            android.graphics.Rect r8 = androidx.leanback.widget.ItemAlignmentFacetHelper.sRect
            r8.right = r9
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r7.offsetDescendantRectToMyCoords(r1, r8)
            android.graphics.Rect r7 = androidx.leanback.widget.ItemAlignmentFacetHelper.sRect
            int r7 = r7.right
            int r8 = r0.mRightInset
            int r9 = r7 + r8
            goto L116
        L74:
            boolean r9 = r8.mOffsetWithPadding
            if (r9 == 0) goto L8d
            float r9 = r8.mOffsetPercent
            int r3 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r3 != 0) goto L84
            int r9 = r1.getPaddingLeft()
            int r2 = r2 + r9
            goto L8d
        L84:
            int r9 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r9 != 0) goto L8d
            int r9 = r1.getPaddingRight()
            int r2 = r2 - r9
        L8d:
            float r9 = r8.mOffsetPercent
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 == 0) goto La6
            if (r1 != r7) goto L9a
            int r9 = r0.getOpticalWidth(r1)
            goto L9e
        L9a:
            int r9 = r1.getWidth()
        L9e:
            float r9 = (float) r9
            float r8 = r8.mOffsetPercent
            float r9 = r9 * r8
            float r9 = r9 / r5
            int r8 = (int) r9
            int r2 = r2 + r8
        La6:
            r9 = r2
            if (r7 == r1) goto L116
            android.graphics.Rect r8 = androidx.leanback.widget.ItemAlignmentFacetHelper.sRect
            r8.left = r9
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r7.offsetDescendantRectToMyCoords(r1, r8)
            android.graphics.Rect r7 = androidx.leanback.widget.ItemAlignmentFacetHelper.sRect
            int r7 = r7.left
            int r8 = r0.mLeftInset
            int r9 = r7 - r8
            goto L116
        Lbb:
            boolean r9 = r8.mOffsetWithPadding
            if (r9 == 0) goto Ld4
            float r9 = r8.mOffsetPercent
            int r3 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r3 != 0) goto Lcb
            int r9 = r1.getPaddingTop()
            int r2 = r2 + r9
            goto Ld4
        Lcb:
            int r9 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r9 != 0) goto Ld4
            int r9 = r1.getPaddingBottom()
            int r2 = r2 - r9
        Ld4:
            float r9 = r8.mOffsetPercent
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 == 0) goto Lf6
            if (r1 != r7) goto Lea
            java.util.Objects.requireNonNull(r0)
            int r9 = r1.getHeight()
            int r3 = r0.mTopInset
            int r9 = r9 - r3
            int r3 = r0.mBottomInset
            int r9 = r9 - r3
            goto Lee
        Lea:
            int r9 = r1.getHeight()
        Lee:
            float r9 = (float) r9
            float r3 = r8.mOffsetPercent
            float r9 = r9 * r3
            float r9 = r9 / r5
            int r9 = (int) r9
            int r2 = r2 + r9
        Lf6:
            if (r7 == r1) goto L10a
            android.graphics.Rect r9 = androidx.leanback.widget.ItemAlignmentFacetHelper.sRect
            r9.top = r2
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r7.offsetDescendantRectToMyCoords(r1, r9)
            android.graphics.Rect r7 = androidx.leanback.widget.ItemAlignmentFacetHelper.sRect
            int r7 = r7.top
            int r9 = r0.mTopInset
            int r7 = r7 - r9
            r9 = r7
            goto L10b
        L10a:
            r9 = r2
        L10b:
            boolean r7 = r8.isAlignedToTextViewBaseLine()
            if (r7 == 0) goto L116
            int r7 = r1.getBaseline()
            int r9 = r9 + r7
        L116:
            return r9
    }
}
