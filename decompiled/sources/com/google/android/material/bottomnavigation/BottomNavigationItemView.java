package com.google.android.material.bottomnavigation;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class BottomNavigationItemView extends com.google.android.material.navigation.NavigationBarItemView {
    public BottomNavigationItemView(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    @androidx.annotation.DimenRes
    public int getItemDefaultMarginResId() {
            r1 = this;
            int r0 = com.google.android.material.R.dimen.design_bottom_navigation_margin
            return r0
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    @androidx.annotation.LayoutRes
    public int getItemLayoutResId() {
            r1 = this;
            int r0 = com.google.android.material.R.layout.design_bottom_navigation_item
            return r0
    }
}
