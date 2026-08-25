package com.google.android.material.navigationrail;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
final class NavigationRailItemView extends com.google.android.material.navigation.NavigationBarItemView {
    public NavigationRailItemView(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    @androidx.annotation.DimenRes
    public final int getItemDefaultMarginResId() {
            r1 = this;
            int r0 = com.google.android.material.R.dimen.mtrl_navigation_rail_icon_margin
            return r0
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    @androidx.annotation.LayoutRes
    public final int getItemLayoutResId() {
            r1 = this;
            int r0 = com.google.android.material.R.layout.mtrl_navigation_rail_item
            return r0
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int r1, int r2) {
            r0 = this;
            super.onMeasure(r1, r2)
            int r1 = android.view.View.MeasureSpec.getMode(r2)
            if (r1 != 0) goto L1c
            int r1 = android.view.View.MeasureSpec.getSize(r2)
            int r2 = r0.getMeasuredHeight()
            int r1 = java.lang.Math.max(r2, r1)
            int r2 = r0.getMeasuredWidthAndState()
            r0.setMeasuredDimension(r2, r1)
        L1c:
            return
    }
}
