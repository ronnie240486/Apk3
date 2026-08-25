package com.google.android.material.navigation;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public final class NavigationBarMenu extends androidx.appcompat.view.menu.MenuBuilder {
    private final int maxItemCount;

    @androidx.annotation.NonNull
    private final java.lang.Class<?> viewClass;

    public NavigationBarMenu(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull java.lang.Class<?> r2, int r3) {
            r0 = this;
            r0.<init>(r1)
            r0.viewClass = r2
            r0.maxItemCount = r3
            return
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    @androidx.annotation.NonNull
    public final android.view.MenuItem addInternal(int r4, int r5, int r6, @androidx.annotation.NonNull java.lang.CharSequence r7) {
            r3 = this;
            int r0 = r3.size()
            r1 = 1
            int r0 = r0 + r1
            int r2 = r3.maxItemCount
            if (r0 > r2) goto L1f
            r3.stopDispatchingItemsChanged()
            android.view.MenuItem r4 = super.addInternal(r4, r5, r6, r7)
            boolean r5 = r4 instanceof androidx.appcompat.view.menu.MenuItemImpl
            if (r5 == 0) goto L1b
            r5 = r4
            androidx.appcompat.view.menu.MenuItemImpl r5 = (androidx.appcompat.view.menu.MenuItemImpl) r5
            r5.setExclusiveCheckable(r1)
        L1b:
            r3.startDispatchingItemsChanged()
            return r4
        L1f:
            java.lang.Class<?> r4 = r3.viewClass
            java.lang.String r4 = r4.getSimpleName()
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Maximum number of items supported by "
            java.lang.String r7 = " is "
            java.lang.StringBuilder r6 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m25m(r6, r4, r7)
            int r7 = r3.maxItemCount
            r6.append(r7)
            java.lang.String r7 = ". Limit can be checked with "
            r6.append(r7)
            r6.append(r4)
            java.lang.String r4 = "#getMaxItemCount()"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.<init>(r4)
            throw r5
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder, android.view.Menu
    @androidx.annotation.NonNull
    public android.view.SubMenu addSubMenu(int r1, int r2, int r3, @androidx.annotation.NonNull java.lang.CharSequence r4) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class<?> r3 = r0.viewClass
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            java.lang.String r3 = " does not support submenus"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public int getMaxItemCount() {
            r1 = this;
            int r0 = r1.maxItemCount
            return r0
    }
}
