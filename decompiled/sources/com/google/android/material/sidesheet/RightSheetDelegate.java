package com.google.android.material.sidesheet;

/* JADX INFO: loaded from: classes2.dex */
final class RightSheetDelegate extends com.google.android.material.sidesheet.SheetDelegate {
    public final com.google.android.material.sidesheet.SideSheetBehavior<? extends android.view.View> sheetBehavior;

    public RightSheetDelegate(@androidx.annotation.NonNull com.google.android.material.sidesheet.SideSheetBehavior<? extends android.view.View> r1) {
            r0 = this;
            r0.<init>()
            r0.sheetBehavior = r1
            return
    }

    private boolean isReleasedCloseToOriginEdge(@androidx.annotation.NonNull android.view.View r3) {
            r2 = this;
            int r3 = r3.getLeft()
            int r0 = r2.getHiddenOffset()
            int r1 = r2.getExpandedOffset()
            int r0 = r0 - r1
            int r0 = r0 / 2
            if (r3 <= r0) goto L13
            r3 = 1
            goto L14
        L13:
            r3 = 0
        L14:
            return r3
    }

    private boolean isSwipeSignificant(float r4, float r5) {
            r3 = this;
            float r4 = java.lang.Math.abs(r4)
            float r0 = java.lang.Math.abs(r5)
            r1 = 1
            r2 = 0
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 <= 0) goto L10
            r4 = 1
            goto L11
        L10:
            r4 = 0
        L11:
            if (r4 == 0) goto L20
            com.google.android.material.sidesheet.SideSheetBehavior<? extends android.view.View> r4 = r3.sheetBehavior
            java.util.Objects.requireNonNull(r4)
            r4 = 500(0x1f4, float:7.0E-43)
            float r4 = (float) r4
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 <= 0) goto L20
            goto L21
        L20:
            r1 = 0
        L21:
            return r1
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final float calculateSlideOffsetBasedOnOutwardEdge(int r3) {
            r2 = this;
            int r0 = r2.getHiddenOffset()
            float r0 = (float) r0
            int r1 = r2.getExpandedOffset()
            float r1 = (float) r1
            float r1 = r0 - r1
            float r3 = (float) r3
            float r0 = r0 - r3
            float r0 = r0 / r1
            return r0
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final int calculateTargetStateOnViewReleased(@androidx.annotation.NonNull android.view.View r6, float r7, float r8) {
            r5 = this;
            r0 = 0
            int r1 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r1 >= 0) goto L6
            goto L63
        L6:
            int r1 = r6.getRight()
            float r1 = (float) r1
            com.google.android.material.sidesheet.SideSheetBehavior<? extends android.view.View> r2 = r5.sheetBehavior
            float r2 = r2.getHideFriction()
            float r2 = r2 * r7
            float r2 = r2 + r1
            float r1 = java.lang.Math.abs(r2)
            com.google.android.material.sidesheet.SideSheetBehavior<? extends android.view.View> r2 = r5.sheetBehavior
            java.util.Objects.requireNonNull(r2)
            r2 = 1056964608(0x3f000000, float:0.5)
            r3 = 0
            r4 = 1
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L27
            r1 = 1
            goto L28
        L27:
            r1 = 0
        L28:
            if (r1 == 0) goto L37
            boolean r7 = r5.isSwipeSignificant(r7, r8)
            if (r7 != 0) goto L65
            boolean r6 = r5.isReleasedCloseToOriginEdge(r6)
            if (r6 == 0) goto L63
            goto L65
        L37:
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 == 0) goto L4a
            float r7 = java.lang.Math.abs(r7)
            float r8 = java.lang.Math.abs(r8)
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L48
            r3 = 1
        L48:
            if (r3 != 0) goto L65
        L4a:
            int r6 = r6.getLeft()
            int r7 = r5.getExpandedOffset()
            int r7 = r6 - r7
            int r7 = java.lang.Math.abs(r7)
            int r8 = r5.getHiddenOffset()
            int r6 = r6 - r8
            int r6 = java.lang.Math.abs(r6)
            if (r7 >= r6) goto L65
        L63:
            r6 = 3
            goto L66
        L65:
            r6 = 5
        L66:
            return r6
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final int getExpandedOffset() {
            r2 = this;
            int r0 = r2.getHiddenOffset()
            com.google.android.material.sidesheet.SideSheetBehavior<? extends android.view.View> r1 = r2.sheetBehavior
            int r1 = r1.getChildWidth()
            int r0 = r0 - r1
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            return r0
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final int getHiddenOffset() {
            r1 = this;
            com.google.android.material.sidesheet.SideSheetBehavior<? extends android.view.View> r0 = r1.sheetBehavior
            int r0 = r0.getParentWidth()
            return r0
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final <V extends android.view.View> int getOutwardEdge(@androidx.annotation.NonNull V r1) {
            r0 = this;
            int r1 = r1.getLeft()
            return r1
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final void getSheetEdge() {
            r0 = this;
            return
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final boolean isSettling(android.view.View r2, int r3, boolean r4) {
            r1 = this;
            com.google.android.material.sidesheet.SideSheetBehavior<? extends android.view.View> r0 = r1.sheetBehavior
            int r3 = r0.getOutwardEdgeOffsetForState(r3)
            com.google.android.material.sidesheet.SideSheetBehavior<? extends android.view.View> r0 = r1.sheetBehavior
            androidx.customview.widget.ViewDragHelper r0 = r0.getViewDragHelper()
            if (r0 == 0) goto L27
            if (r4 == 0) goto L1b
            int r2 = r2.getTop()
            boolean r2 = r0.settleCapturedViewAt(r3, r2)
            if (r2 == 0) goto L27
            goto L25
        L1b:
            int r4 = r2.getTop()
            boolean r2 = r0.smoothSlideViewTo(r2, r3, r4)
            if (r2 == 0) goto L27
        L25:
            r2 = 1
            goto L28
        L27:
            r2 = 0
        L28:
            return r2
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final void updateCoplanarSiblingLayoutParams(@androidx.annotation.NonNull android.view.ViewGroup.MarginLayoutParams r2, int r3) {
            r1 = this;
            com.google.android.material.sidesheet.SideSheetBehavior<? extends android.view.View> r0 = r1.sheetBehavior
            int r0 = r0.getParentWidth()
            if (r3 > r0) goto Lb
            int r0 = r0 - r3
            r2.rightMargin = r0
        Lb:
            return
    }
}
