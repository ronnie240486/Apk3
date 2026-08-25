package com.google.android.material.bottomnavigation;

/* JADX INFO: loaded from: classes.dex */
public class BottomNavigationView extends com.google.android.material.navigation.NavigationBarView {
    private static final int MAX_ITEM_COUNT = 5;


    /* JADX INFO: loaded from: classes3.dex */
    @java.lang.Deprecated
    public interface OnNavigationItemReselectedListener extends com.google.android.material.navigation.NavigationBarView.OnItemReselectedListener {
    }

    /* JADX INFO: loaded from: classes2.dex */
    @java.lang.Deprecated
    public interface OnNavigationItemSelectedListener extends com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener {
    }

    public BottomNavigationView(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public BottomNavigationView(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.R.attr.bottomNavigationStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public BottomNavigationView(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3, int r4) {
            r1 = this;
            int r0 = com.google.android.material.R.style.Widget_Design_BottomNavigationView
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public BottomNavigationView(@androidx.annotation.NonNull android.content.Context r8, @androidx.annotation.Nullable android.util.AttributeSet r9, int r10, int r11) {
            r7 = this;
            r7.<init>(r8, r9, r10, r11)
            android.content.Context r8 = r7.getContext()
            int[] r2 = com.google.android.material.R.styleable.BottomNavigationView
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            r4 = r11
            androidx.appcompat.widget.TintTypedArray r9 = com.google.android.material.internal.ThemeEnforcement.obtainTintedStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r10 = com.google.android.material.R.styleable.BottomNavigationView_itemHorizontalTranslationEnabled
            r11 = 1
            boolean r10 = r9.getBoolean(r10, r11)
            r7.setItemHorizontalTranslationEnabled(r10)
            int r10 = com.google.android.material.R.styleable.BottomNavigationView_android_minHeight
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L2d
            int r10 = r9.getDimensionPixelSize(r10, r6)
            r7.setMinimumHeight(r10)
        L2d:
            int r10 = com.google.android.material.R.styleable.BottomNavigationView_compatShadowEnabled
            boolean r10 = r9.getBoolean(r10, r11)
            if (r10 == 0) goto L3e
            boolean r10 = r7.shouldDrawCompatibilityTopDivider()
            if (r10 == 0) goto L3e
            r7.addCompatibilityTopDivider(r8)
        L3e:
            r9.recycle()
            r7.applyWindowInsets()
            return
    }

    private void addCompatibilityTopDivider(@androidx.annotation.NonNull android.content.Context r4) {
            r3 = this;
            android.view.View r0 = new android.view.View
            r0.<init>(r4)
            int r1 = com.google.android.material.R.color.design_bottom_navigation_shadow_color
            int r4 = androidx.core.content.ContextCompat.getColor(r4, r1)
            r0.setBackgroundColor(r4)
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            android.content.res.Resources r1 = r3.getResources()
            int r2 = com.google.android.material.R.dimen.design_bottom_navigation_shadow_height
            int r1 = r1.getDimensionPixelSize(r2)
            r2 = -1
            r4.<init>(r2, r1)
            r0.setLayoutParams(r4)
            r3.addView(r0)
            return
    }

    private void applyWindowInsets() {
            r1 = this;
            com.google.android.material.bottomnavigation.BottomNavigationView$1 r0 = new com.google.android.material.bottomnavigation.BottomNavigationView$1
            r0.<init>()
            com.google.android.material.internal.ViewUtils.doOnApplyWindowInsets(r1, r0)
            return
    }

    private int makeMinHeightSpec(int r5) {
            r4 = this;
            int r0 = r4.getSuggestedMinimumHeight()
            int r1 = android.view.View.MeasureSpec.getMode(r5)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 == r2) goto L24
            if (r0 <= 0) goto L24
            int r1 = r4.getPaddingTop()
            int r3 = r4.getPaddingBottom()
            int r3 = r3 + r1
            int r3 = r3 + r0
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r5, r3)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
        L24:
            return r5
    }

    private boolean shouldDrawCompatibilityTopDivider() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public final com.google.android.material.navigation.NavigationBarMenuView createNavigationBarMenuView(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            com.google.android.material.bottomnavigation.BottomNavigationMenuView r0 = new com.google.android.material.bottomnavigation.BottomNavigationMenuView
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
            r1 = this;
            r0 = 5
            return r0
    }

    public boolean isItemHorizontalTranslationEnabled() {
            r1 = this;
            androidx.appcompat.view.menu.MenuView r0 = r1.getMenuView()
            com.google.android.material.bottomnavigation.BottomNavigationMenuView r0 = (com.google.android.material.bottomnavigation.BottomNavigationMenuView) r0
            boolean r0 = r0.isItemHorizontalTranslationEnabled()
            return r0
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int r1, int r2) {
            r0 = this;
            int r2 = r0.makeMinHeightSpec(r2)
            super.onMeasure(r1, r2)
            return
    }

    public void setItemHorizontalTranslationEnabled(boolean r3) {
            r2 = this;
            androidx.appcompat.view.menu.MenuView r0 = r2.getMenuView()
            com.google.android.material.bottomnavigation.BottomNavigationMenuView r0 = (com.google.android.material.bottomnavigation.BottomNavigationMenuView) r0
            boolean r1 = r0.isItemHorizontalTranslationEnabled()
            if (r1 == r3) goto L17
            r0.setItemHorizontalTranslationEnabled(r3)
            com.google.android.material.navigation.NavigationBarPresenter r3 = r2.getPresenter()
            r0 = 0
            r3.updateMenuView(r0)
        L17:
            return
    }

    @java.lang.Deprecated
    public void setOnNavigationItemReselectedListener(@androidx.annotation.Nullable com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemReselectedListener r1) {
            r0 = this;
            r0.setOnItemReselectedListener(r1)
            return
    }

    @java.lang.Deprecated
    public void setOnNavigationItemSelectedListener(@androidx.annotation.Nullable com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener r1) {
            r0 = this;
            r0.setOnItemSelectedListener(r1)
            return
    }
}
