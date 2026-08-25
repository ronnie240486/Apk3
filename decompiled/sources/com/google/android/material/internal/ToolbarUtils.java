package com.google.android.material.internal;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
public class ToolbarUtils {
    private static final java.util.Comparator<android.view.View> VIEW_TOP_COMPARATOR = null;


    static {
            com.google.android.material.internal.ToolbarUtils$1 r0 = new com.google.android.material.internal.ToolbarUtils$1
            r0.<init>()
            com.google.android.material.internal.ToolbarUtils.VIEW_TOP_COMPARATOR = r0
            return
    }

    private ToolbarUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static androidx.appcompat.view.menu.ActionMenuItemView getActionMenuItemView(@androidx.annotation.NonNull androidx.appcompat.widget.Toolbar r3, @androidx.annotation.IdRes int r4) {
            androidx.appcompat.widget.ActionMenuView r3 = getActionMenuView(r3)
            if (r3 == 0) goto L25
            r0 = 0
        L7:
            int r1 = r3.getChildCount()
            if (r0 >= r1) goto L25
            android.view.View r1 = r3.getChildAt(r0)
            boolean r2 = r1 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            if (r2 == 0) goto L22
            androidx.appcompat.view.menu.ActionMenuItemView r1 = (androidx.appcompat.view.menu.ActionMenuItemView) r1
            androidx.appcompat.view.menu.MenuItemImpl r2 = r1.getItemData()
            int r2 = r2.getItemId()
            if (r2 != r4) goto L22
            return r1
        L22:
            int r0 = r0 + 1
            goto L7
        L25:
            r3 = 0
            return r3
    }

    @androidx.annotation.Nullable
    public static androidx.appcompat.widget.ActionMenuView getActionMenuView(@androidx.annotation.NonNull androidx.appcompat.widget.Toolbar r3) {
            r0 = 0
        L1:
            int r1 = r3.getChildCount()
            if (r0 >= r1) goto L15
            android.view.View r1 = r3.getChildAt(r0)
            boolean r2 = r1 instanceof androidx.appcompat.widget.ActionMenuView
            if (r2 == 0) goto L12
            androidx.appcompat.widget.ActionMenuView r1 = (androidx.appcompat.widget.ActionMenuView) r1
            return r1
        L12:
            int r0 = r0 + 1
            goto L1
        L15:
            r3 = 0
            return r3
    }

    @androidx.annotation.Nullable
    private static android.widget.ImageView getImageView(@androidx.annotation.NonNull androidx.appcompat.widget.Toolbar r5, @androidx.annotation.Nullable android.graphics.drawable.Drawable r6) {
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            r1 = 0
        L5:
            int r2 = r5.getChildCount()
            if (r1 >= r2) goto L33
            android.view.View r2 = r5.getChildAt(r1)
            boolean r3 = r2 instanceof android.widget.ImageView
            if (r3 == 0) goto L30
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            android.graphics.drawable.Drawable r3 = r2.getDrawable()
            if (r3 == 0) goto L30
            android.graphics.drawable.Drawable$ConstantState r4 = r3.getConstantState()
            if (r4 == 0) goto L30
            android.graphics.drawable.Drawable$ConstantState r3 = r3.getConstantState()
            android.graphics.drawable.Drawable$ConstantState r4 = r6.getConstantState()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L30
            return r2
        L30:
            int r1 = r1 + 1
            goto L5
        L33:
            return r0
    }

    @androidx.annotation.Nullable
    public static android.widget.ImageView getLogoImageView(@androidx.annotation.NonNull androidx.appcompat.widget.Toolbar r1) {
            android.graphics.drawable.Drawable r0 = r1.getLogo()
            android.widget.ImageView r1 = getImageView(r1, r0)
            return r1
    }

    @androidx.annotation.Nullable
    public static android.widget.ImageButton getNavigationIconButton(@androidx.annotation.NonNull androidx.appcompat.widget.Toolbar r5) {
            android.graphics.drawable.Drawable r0 = r5.getNavigationIcon()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r2 = 0
        L9:
            int r3 = r5.getChildCount()
            if (r2 >= r3) goto L23
            android.view.View r3 = r5.getChildAt(r2)
            boolean r4 = r3 instanceof android.widget.ImageButton
            if (r4 == 0) goto L20
            android.widget.ImageButton r3 = (android.widget.ImageButton) r3
            android.graphics.drawable.Drawable r4 = r3.getDrawable()
            if (r4 != r0) goto L20
            return r3
        L20:
            int r2 = r2 + 1
            goto L9
        L23:
            return r1
    }

    @androidx.annotation.Nullable
    public static android.view.View getSecondaryActionMenuItemView(@androidx.annotation.NonNull androidx.appcompat.widget.Toolbar r2) {
            androidx.appcompat.widget.ActionMenuView r2 = getActionMenuView(r2)
            if (r2 == 0) goto L13
            int r0 = r2.getChildCount()
            r1 = 1
            if (r0 <= r1) goto L13
            r0 = 0
            android.view.View r2 = r2.getChildAt(r0)
            return r2
        L13:
            r2 = 0
            return r2
    }

    @androidx.annotation.Nullable
    public static android.widget.TextView getSubtitleTextView(@androidx.annotation.NonNull androidx.appcompat.widget.Toolbar r1) {
            java.lang.CharSequence r0 = r1.getSubtitle()
            java.util.List r1 = getTextViewsWithText(r1, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L10
            r1 = 0
            goto L18
        L10:
            java.util.Comparator<android.view.View> r0 = com.google.android.material.internal.ToolbarUtils.VIEW_TOP_COMPARATOR
            java.lang.Object r1 = java.util.Collections.max(r1, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
        L18:
            return r1
    }

    private static java.util.List<android.widget.TextView> getTextViewsWithText(@androidx.annotation.NonNull androidx.appcompat.widget.Toolbar r4, java.lang.CharSequence r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r4.getChildCount()
            if (r1 >= r2) goto L26
            android.view.View r2 = r4.getChildAt(r1)
            boolean r3 = r2 instanceof android.widget.TextView
            if (r3 == 0) goto L23
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.CharSequence r3 = r2.getText()
            boolean r3 = android.text.TextUtils.equals(r3, r5)
            if (r3 == 0) goto L23
            r0.add(r2)
        L23:
            int r1 = r1 + 1
            goto L6
        L26:
            return r0
    }

    @androidx.annotation.Nullable
    public static android.widget.TextView getTitleTextView(@androidx.annotation.NonNull androidx.appcompat.widget.Toolbar r1) {
            java.lang.CharSequence r0 = r1.getTitle()
            java.util.List r1 = getTextViewsWithText(r1, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L10
            r1 = 0
            goto L18
        L10:
            java.util.Comparator<android.view.View> r0 = com.google.android.material.internal.ToolbarUtils.VIEW_TOP_COMPARATOR
            java.lang.Object r1 = java.util.Collections.min(r1, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
        L18:
            return r1
    }
}
