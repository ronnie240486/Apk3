package com.google.android.material.navigationrail;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class NavigationRailMenuView extends com.google.android.material.navigation.NavigationBarMenuView {

    @androidx.annotation.Px
    private int itemMinimumHeight;
    private final android.widget.FrameLayout.LayoutParams layoutParams;

    public NavigationRailMenuView(@androidx.annotation.NonNull android.content.Context r3) {
            r2 = this;
            r2.<init>(r3)
            r3 = -1
            r2.itemMinimumHeight = r3
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -2
            r0.<init>(r3, r1)
            r2.layoutParams = r0
            r3 = 49
            r0.gravity = r3
            r2.setLayoutParams(r0)
            r3 = 1
            r2.setItemActiveIndicatorResizeable(r3)
            return
    }

    private int makeSharedHeightSpec(int r2, int r3, int r4) {
            r1 = this;
            r0 = 1
            int r4 = java.lang.Math.max(r0, r4)
            int r3 = r3 / r4
            int r4 = r1.itemMinimumHeight
            r0 = -1
            if (r4 == r0) goto Lc
            goto L10
        Lc:
            int r4 = android.view.View.MeasureSpec.getSize(r2)
        L10:
            int r2 = java.lang.Math.min(r4, r3)
            r3 = 0
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r3)
            return r2
    }

    private int measureChildHeight(android.view.View r3, int r4, int r5) {
            r2 = this;
            int r0 = r3.getVisibility()
            r1 = 8
            if (r0 == r1) goto L10
            r3.measure(r4, r5)
            int r3 = r3.getMeasuredHeight()
            return r3
        L10:
            r3 = 0
            return r3
    }

    private int measureSharedChildHeights(int r4, int r5, int r6, android.view.View r7) {
            r3 = this;
            r0 = 0
            if (r7 != 0) goto L8
            int r5 = r3.makeSharedHeightSpec(r4, r5, r6)
            goto L10
        L8:
            int r5 = r7.getMeasuredHeight()
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r0)
        L10:
            int r6 = r3.getChildCount()
            r1 = 0
        L15:
            if (r0 >= r6) goto L25
            android.view.View r2 = r3.getChildAt(r0)
            if (r2 == r7) goto L22
            int r2 = r3.measureChildHeight(r2, r4, r5)
            int r1 = r1 + r2
        L22:
            int r0 = r0 + 1
            goto L15
        L25:
            return r1
    }

    private int measureShiftingChildHeights(int r3, int r4, int r5) {
            r2 = this;
            int r0 = r2.getSelectedItemPosition()
            android.view.View r0 = r2.getChildAt(r0)
            if (r0 == 0) goto L16
            int r1 = r2.makeSharedHeightSpec(r3, r4, r5)
            int r1 = r2.measureChildHeight(r0, r3, r1)
            int r4 = r4 - r1
            int r5 = r5 + (-1)
            goto L17
        L16:
            r1 = 0
        L17:
            int r3 = r2.measureSharedChildHeights(r3, r4, r5, r0)
            int r1 = r1 + r3
            return r1
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    @androidx.annotation.NonNull
    public final com.google.android.material.navigation.NavigationBarItemView createNavigationBarItemView(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            com.google.android.material.navigationrail.NavigationRailItemView r0 = new com.google.android.material.navigationrail.NavigationRailItemView
            r0.<init>(r2)
            return r0
    }

    @androidx.annotation.Px
    public int getItemMinimumHeight() {
            r1 = this;
            int r0 = r1.itemMinimumHeight
            return r0
    }

    public int getMenuGravity() {
            r1 = this;
            android.widget.FrameLayout$LayoutParams r0 = r1.layoutParams
            int r0 = r0.gravity
            return r0
    }

    public final boolean isTopGravity() {
            r2 = this;
            android.widget.FrameLayout$LayoutParams r0 = r2.layoutParams
            int r0 = r0.gravity
            r0 = r0 & 112(0x70, float:1.57E-43)
            r1 = 48
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r4, int r5, int r6, int r7, int r8) {
            r3 = this;
            int r4 = r3.getChildCount()
            int r7 = r7 - r5
            r5 = 0
            r6 = 0
            r8 = 0
        L8:
            if (r6 >= r4) goto L22
            android.view.View r0 = r3.getChildAt(r6)
            int r1 = r0.getVisibility()
            r2 = 8
            if (r1 == r2) goto L1f
            int r1 = r0.getMeasuredHeight()
            int r1 = r1 + r8
            r0.layout(r5, r8, r7, r1)
            r8 = r1
        L1f:
            int r6 = r6 + 1
            goto L8
        L22:
            return
    }

    @Override // android.view.View
    public final void onMeasure(int r4, int r5) {
            r3 = this;
            int r0 = android.view.View.MeasureSpec.getSize(r5)
            androidx.appcompat.view.menu.MenuBuilder r1 = r3.getMenu()
            java.util.ArrayList r1 = r1.getVisibleItems()
            int r1 = r1.size()
            r2 = 1
            if (r1 <= r2) goto L22
            int r2 = r3.getLabelVisibilityMode()
            boolean r2 = r3.isShifting(r2, r1)
            if (r2 == 0) goto L22
            int r0 = r3.measureShiftingChildHeights(r4, r0, r1)
            goto L27
        L22:
            r2 = 0
            int r0 = r3.measureSharedChildHeights(r4, r0, r1, r2)
        L27:
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = 0
            int r5 = android.view.View.resolveSizeAndState(r0, r5, r1)
            r3.setMeasuredDimension(r4, r5)
            return
    }

    public void setItemMinimumHeight(@androidx.annotation.Px int r2) {
            r1 = this;
            int r0 = r1.itemMinimumHeight
            if (r0 == r2) goto L9
            r1.itemMinimumHeight = r2
            r1.requestLayout()
        L9:
            return
    }

    public void setMenuGravity(int r3) {
            r2 = this;
            android.widget.FrameLayout$LayoutParams r0 = r2.layoutParams
            int r1 = r0.gravity
            if (r1 == r3) goto Lb
            r0.gravity = r3
            r2.setLayoutParams(r0)
        Lb:
            return
    }
}
