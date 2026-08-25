package com.google.android.material.bottomnavigation;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class BottomNavigationMenuView extends com.google.android.material.navigation.NavigationBarMenuView {
    private final int activeItemMaxWidth;
    private final int activeItemMinWidth;
    private final int inactiveItemMaxWidth;
    private final int inactiveItemMinWidth;
    private boolean itemHorizontalTranslationEnabled;
    private final java.util.List<java.lang.Integer> tempChildWidths;

    public BottomNavigationMenuView(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.tempChildWidths = r2
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r0 = -2
            r2.<init>(r0, r0)
            r0 = 17
            r2.gravity = r0
            r1.setLayoutParams(r2)
            android.content.res.Resources r2 = r1.getResources()
            int r0 = com.google.android.material.R.dimen.design_bottom_navigation_item_max_width
            int r0 = r2.getDimensionPixelSize(r0)
            r1.inactiveItemMaxWidth = r0
            int r0 = com.google.android.material.R.dimen.design_bottom_navigation_item_min_width
            int r0 = r2.getDimensionPixelSize(r0)
            r1.inactiveItemMinWidth = r0
            int r0 = com.google.android.material.R.dimen.design_bottom_navigation_active_item_max_width
            int r0 = r2.getDimensionPixelSize(r0)
            r1.activeItemMaxWidth = r0
            int r0 = com.google.android.material.R.dimen.design_bottom_navigation_active_item_min_width
            int r2 = r2.getDimensionPixelSize(r0)
            r1.activeItemMinWidth = r2
            return
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    @androidx.annotation.NonNull
    public final com.google.android.material.navigation.NavigationBarItemView createNavigationBarItemView(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            com.google.android.material.bottomnavigation.BottomNavigationItemView r0 = new com.google.android.material.bottomnavigation.BottomNavigationItemView
            r0.<init>(r2)
            return r0
    }

    public boolean isItemHorizontalTranslationEnabled() {
            r1 = this;
            boolean r0 = r1.itemHorizontalTranslationEnabled
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
            r4 = this;
            int r5 = r4.getChildCount()
            int r8 = r8 - r6
            int r9 = r9 - r7
            r6 = 0
            r7 = 0
            r0 = 0
        L9:
            if (r7 >= r5) goto L3b
            android.view.View r1 = r4.getChildAt(r7)
            int r2 = r1.getVisibility()
            r3 = 8
            if (r2 != r3) goto L18
            goto L38
        L18:
            int r2 = androidx.core.view.ViewCompat.getLayoutDirection(r4)
            r3 = 1
            if (r2 != r3) goto L2b
            int r2 = r8 - r0
            int r3 = r1.getMeasuredWidth()
            int r3 = r2 - r3
            r1.layout(r3, r6, r2, r9)
            goto L33
        L2b:
            int r2 = r1.getMeasuredWidth()
            int r2 = r2 + r0
            r1.layout(r0, r6, r2, r9)
        L33:
            int r1 = r1.getMeasuredWidth()
            int r0 = r0 + r1
        L38:
            int r7 = r7 + 1
            goto L9
        L3b:
            return
    }

    @Override // android.view.View
    public final void onMeasure(int r12, int r13) {
            r11 = this;
            androidx.appcompat.view.menu.MenuBuilder r0 = r11.getMenu()
            int r12 = android.view.View.MeasureSpec.getSize(r12)
            java.util.ArrayList r0 = r0.getVisibleItems()
            int r0 = r0.size()
            int r1 = r11.getChildCount()
            java.util.List<java.lang.Integer> r2 = r11.tempChildWidths
            r2.clear()
            int r13 = android.view.View.MeasureSpec.getSize(r13)
            r2 = 1073741824(0x40000000, float:2.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r2)
            int r4 = r11.getLabelVisibilityMode()
            boolean r4 = r11.isShifting(r4, r0)
            r5 = 8
            r6 = 0
            r7 = 1
            if (r4 == 0) goto Lae
            boolean r4 = r11.isItemHorizontalTranslationEnabled()
            if (r4 == 0) goto Lae
            int r4 = r11.getSelectedItemPosition()
            android.view.View r4 = r11.getChildAt(r4)
            int r8 = r11.activeItemMinWidth
            int r9 = r4.getVisibility()
            if (r9 == r5) goto L5a
            int r9 = r11.activeItemMaxWidth
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r10)
            r4.measure(r9, r3)
            int r9 = r4.getMeasuredWidth()
            int r8 = java.lang.Math.max(r8, r9)
        L5a:
            int r4 = r4.getVisibility()
            if (r4 == r5) goto L62
            r4 = 1
            goto L63
        L62:
            r4 = 0
        L63:
            int r0 = r0 - r4
            int r4 = r11.inactiveItemMinWidth
            int r4 = r4 * r0
            int r4 = r12 - r4
            int r9 = r11.activeItemMaxWidth
            int r8 = java.lang.Math.min(r8, r9)
            int r4 = java.lang.Math.min(r4, r8)
            int r12 = r12 - r4
            if (r0 != 0) goto L78
            goto L79
        L78:
            r7 = r0
        L79:
            int r7 = r12 / r7
            int r8 = r11.inactiveItemMaxWidth
            int r7 = java.lang.Math.min(r7, r8)
            int r0 = r0 * r7
            int r12 = r12 - r0
            r0 = 0
        L85:
            if (r0 >= r1) goto Le0
            android.view.View r8 = r11.getChildAt(r0)
            int r8 = r8.getVisibility()
            if (r8 == r5) goto La1
            int r8 = r11.getSelectedItemPosition()
            if (r0 != r8) goto L99
            r8 = r4
            goto L9a
        L99:
            r8 = r7
        L9a:
            if (r12 <= 0) goto La2
            int r8 = r8 + 1
            int r12 = r12 + (-1)
            goto La2
        La1:
            r8 = 0
        La2:
            java.util.List<java.lang.Integer> r9 = r11.tempChildWidths
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9.add(r8)
            int r0 = r0 + 1
            goto L85
        Lae:
            if (r0 != 0) goto Lb1
            goto Lb2
        Lb1:
            r7 = r0
        Lb2:
            int r4 = r12 / r7
            int r7 = r11.activeItemMaxWidth
            int r4 = java.lang.Math.min(r4, r7)
            int r0 = r0 * r4
            int r12 = r12 - r0
            r0 = 0
        Lbe:
            if (r0 >= r1) goto Le0
            android.view.View r7 = r11.getChildAt(r0)
            int r7 = r7.getVisibility()
            if (r7 == r5) goto Ld3
            if (r12 <= 0) goto Ld1
            int r7 = r4 + 1
            int r12 = r12 + (-1)
            goto Ld4
        Ld1:
            r7 = r4
            goto Ld4
        Ld3:
            r7 = 0
        Ld4:
            java.util.List<java.lang.Integer> r8 = r11.tempChildWidths
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8.add(r7)
            int r0 = r0 + 1
            goto Lbe
        Le0:
            r12 = 0
        Le1:
            if (r6 >= r1) goto L114
            android.view.View r0 = r11.getChildAt(r6)
            int r4 = r0.getVisibility()
            if (r4 != r5) goto Lee
            goto L111
        Lee:
            java.util.List<java.lang.Integer> r4 = r11.tempChildWidths
            java.lang.Object r4 = r4.get(r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            r0.measure(r4, r3)
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()
            int r7 = r0.getMeasuredWidth()
            r4.width = r7
            int r0 = r0.getMeasuredWidth()
            int r0 = r0 + r12
            r12 = r0
        L111:
            int r6 = r6 + 1
            goto Le1
        L114:
            r11.setMeasuredDimension(r12, r13)
            return
    }

    public void setItemHorizontalTranslationEnabled(boolean r1) {
            r0 = this;
            r0.itemHorizontalTranslationEnabled = r1
            return
    }
}
