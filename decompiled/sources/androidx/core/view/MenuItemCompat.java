package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public final class MenuItemCompat {

    @java.lang.Deprecated
    public static final int SHOW_AS_ACTION_ALWAYS = 2;

    @java.lang.Deprecated
    public static final int SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW = 8;

    @java.lang.Deprecated
    public static final int SHOW_AS_ACTION_IF_ROOM = 1;

    @java.lang.Deprecated
    public static final int SHOW_AS_ACTION_NEVER = 0;

    @java.lang.Deprecated
    public static final int SHOW_AS_ACTION_WITH_TEXT = 4;
    private static final java.lang.String TAG = "MenuItemCompat";


    @androidx.annotation.RequiresApi(26)
    public static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static int getAlphabeticModifiers(android.view.MenuItem r0) {
                int r0 = r0.getAlphabeticModifiers()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static java.lang.CharSequence getContentDescription(android.view.MenuItem r0) {
                java.lang.CharSequence r0 = r0.getContentDescription()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.content.res.ColorStateList getIconTintList(android.view.MenuItem r0) {
                android.content.res.ColorStateList r0 = r0.getIconTintList()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.graphics.PorterDuff.Mode getIconTintMode(android.view.MenuItem r0) {
                android.graphics.PorterDuff$Mode r0 = r0.getIconTintMode()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static int getNumericModifiers(android.view.MenuItem r0) {
                int r0 = r0.getNumericModifiers()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static java.lang.CharSequence getTooltipText(android.view.MenuItem r0) {
                java.lang.CharSequence r0 = r0.getTooltipText()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.view.MenuItem setAlphabeticShortcut(android.view.MenuItem r0, char r1, int r2) {
                android.view.MenuItem r0 = r0.setAlphabeticShortcut(r1, r2)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.view.MenuItem setContentDescription(android.view.MenuItem r0, java.lang.CharSequence r1) {
                android.view.MenuItem r0 = r0.setContentDescription(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.view.MenuItem setIconTintList(android.view.MenuItem r0, android.content.res.ColorStateList r1) {
                android.view.MenuItem r0 = r0.setIconTintList(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.view.MenuItem setIconTintMode(android.view.MenuItem r0, android.graphics.PorterDuff.Mode r1) {
                android.view.MenuItem r0 = r0.setIconTintMode(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.view.MenuItem setNumericShortcut(android.view.MenuItem r0, char r1, int r2) {
                android.view.MenuItem r0 = r0.setNumericShortcut(r1, r2)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.view.MenuItem setShortcut(android.view.MenuItem r0, char r1, char r2, int r3, int r4) {
                android.view.MenuItem r0 = r0.setShortcut(r1, r2, r3, r4)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.view.MenuItem setTooltipText(android.view.MenuItem r0, java.lang.CharSequence r1) {
                android.view.MenuItem r0 = r0.setTooltipText(r1)
                return r0
        }
    }

    @java.lang.Deprecated
    public interface OnActionExpandListener {
        boolean onMenuItemActionCollapse(android.view.MenuItem r1);

        boolean onMenuItemActionExpand(android.view.MenuItem r1);
    }

    private MenuItemCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static boolean collapseActionView(android.view.MenuItem r0) {
            boolean r0 = r0.collapseActionView()
            return r0
    }

    @java.lang.Deprecated
    public static boolean expandActionView(android.view.MenuItem r0) {
            boolean r0 = r0.expandActionView()
            return r0
    }

    @androidx.annotation.Nullable
    public static androidx.core.view.ActionProvider getActionProvider(@androidx.annotation.NonNull android.view.MenuItem r1) {
            boolean r0 = r1 instanceof androidx.core.internal.view.SupportMenuItem
            if (r0 == 0) goto Lb
            androidx.core.internal.view.SupportMenuItem r1 = (androidx.core.internal.view.SupportMenuItem) r1
            androidx.core.view.ActionProvider r1 = r1.getSupportActionProvider()
            return r1
        Lb:
            java.lang.String r1 = "MenuItemCompat"
            java.lang.String r0 = "getActionProvider: item does not implement SupportMenuItem; returning null"
            android.util.Log.w(r1, r0)
            r1 = 0
            return r1
    }

    @java.lang.Deprecated
    public static android.view.View getActionView(android.view.MenuItem r0) {
            android.view.View r0 = r0.getActionView()
            return r0
    }

    public static int getAlphabeticModifiers(@androidx.annotation.NonNull android.view.MenuItem r2) {
            boolean r0 = r2 instanceof androidx.core.internal.view.SupportMenuItem
            if (r0 == 0) goto Lb
            androidx.core.internal.view.SupportMenuItem r2 = (androidx.core.internal.view.SupportMenuItem) r2
            int r2 = r2.getAlphabeticModifiers()
            return r2
        Lb:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L16
            int r2 = androidx.core.view.MenuItemCompat.Api26Impl.getAlphabeticModifiers(r2)
            return r2
        L16:
            r2 = 0
            return r2
    }

    @androidx.annotation.Nullable
    public static java.lang.CharSequence getContentDescription(@androidx.annotation.NonNull android.view.MenuItem r2) {
            boolean r0 = r2 instanceof androidx.core.internal.view.SupportMenuItem
            if (r0 == 0) goto Lb
            androidx.core.internal.view.SupportMenuItem r2 = (androidx.core.internal.view.SupportMenuItem) r2
            java.lang.CharSequence r2 = r2.getContentDescription()
            return r2
        Lb:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L16
            java.lang.CharSequence r2 = androidx.core.view.MenuItemCompat.Api26Impl.getContentDescription(r2)
            return r2
        L16:
            r2 = 0
            return r2
    }

    @androidx.annotation.Nullable
    public static android.content.res.ColorStateList getIconTintList(@androidx.annotation.NonNull android.view.MenuItem r2) {
            boolean r0 = r2 instanceof androidx.core.internal.view.SupportMenuItem
            if (r0 == 0) goto Lb
            androidx.core.internal.view.SupportMenuItem r2 = (androidx.core.internal.view.SupportMenuItem) r2
            android.content.res.ColorStateList r2 = r2.getIconTintList()
            return r2
        Lb:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L16
            android.content.res.ColorStateList r2 = androidx.core.view.MenuItemCompat.Api26Impl.getIconTintList(r2)
            return r2
        L16:
            r2 = 0
            return r2
    }

    @androidx.annotation.Nullable
    public static android.graphics.PorterDuff.Mode getIconTintMode(@androidx.annotation.NonNull android.view.MenuItem r2) {
            boolean r0 = r2 instanceof androidx.core.internal.view.SupportMenuItem
            if (r0 == 0) goto Lb
            androidx.core.internal.view.SupportMenuItem r2 = (androidx.core.internal.view.SupportMenuItem) r2
            android.graphics.PorterDuff$Mode r2 = r2.getIconTintMode()
            return r2
        Lb:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L16
            android.graphics.PorterDuff$Mode r2 = androidx.core.view.MenuItemCompat.Api26Impl.getIconTintMode(r2)
            return r2
        L16:
            r2 = 0
            return r2
    }

    public static int getNumericModifiers(@androidx.annotation.NonNull android.view.MenuItem r2) {
            boolean r0 = r2 instanceof androidx.core.internal.view.SupportMenuItem
            if (r0 == 0) goto Lb
            androidx.core.internal.view.SupportMenuItem r2 = (androidx.core.internal.view.SupportMenuItem) r2
            int r2 = r2.getNumericModifiers()
            return r2
        Lb:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L16
            int r2 = androidx.core.view.MenuItemCompat.Api26Impl.getNumericModifiers(r2)
            return r2
        L16:
            r2 = 0
            return r2
    }

    @androidx.annotation.Nullable
    public static java.lang.CharSequence getTooltipText(@androidx.annotation.NonNull android.view.MenuItem r2) {
            boolean r0 = r2 instanceof androidx.core.internal.view.SupportMenuItem
            if (r0 == 0) goto Lb
            androidx.core.internal.view.SupportMenuItem r2 = (androidx.core.internal.view.SupportMenuItem) r2
            java.lang.CharSequence r2 = r2.getTooltipText()
            return r2
        Lb:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L16
            java.lang.CharSequence r2 = androidx.core.view.MenuItemCompat.Api26Impl.getTooltipText(r2)
            return r2
        L16:
            r2 = 0
            return r2
    }

    @java.lang.Deprecated
    public static boolean isActionViewExpanded(android.view.MenuItem r0) {
            boolean r0 = r0.isActionViewExpanded()
            return r0
    }

    @androidx.annotation.Nullable
    public static android.view.MenuItem setActionProvider(@androidx.annotation.NonNull android.view.MenuItem r1, @androidx.annotation.Nullable androidx.core.view.ActionProvider r2) {
            boolean r0 = r1 instanceof androidx.core.internal.view.SupportMenuItem
            if (r0 == 0) goto Lb
            androidx.core.internal.view.SupportMenuItem r1 = (androidx.core.internal.view.SupportMenuItem) r1
            androidx.core.internal.view.SupportMenuItem r1 = r1.setSupportActionProvider(r2)
            return r1
        Lb:
            java.lang.String r2 = "MenuItemCompat"
            java.lang.String r0 = "setActionProvider: item does not implement SupportMenuItem; ignoring"
            android.util.Log.w(r2, r0)
            return r1
    }

    @java.lang.Deprecated
    public static android.view.MenuItem setActionView(android.view.MenuItem r0, int r1) {
            android.view.MenuItem r0 = r0.setActionView(r1)
            return r0
    }

    @java.lang.Deprecated
    public static android.view.MenuItem setActionView(android.view.MenuItem r0, android.view.View r1) {
            android.view.MenuItem r0 = r0.setActionView(r1)
            return r0
    }

    public static void setAlphabeticShortcut(@androidx.annotation.NonNull android.view.MenuItem r2, char r3, int r4) {
            boolean r0 = r2 instanceof androidx.core.internal.view.SupportMenuItem
            if (r0 == 0) goto La
            androidx.core.internal.view.SupportMenuItem r2 = (androidx.core.internal.view.SupportMenuItem) r2
            r2.setAlphabeticShortcut(r3, r4)
            goto L13
        La:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L13
            androidx.core.view.MenuItemCompat.Api26Impl.setAlphabeticShortcut(r2, r3, r4)
        L13:
            return
    }

    public static void setContentDescription(@androidx.annotation.NonNull android.view.MenuItem r2, @androidx.annotation.Nullable java.lang.CharSequence r3) {
            boolean r0 = r2 instanceof androidx.core.internal.view.SupportMenuItem
            if (r0 == 0) goto La
            androidx.core.internal.view.SupportMenuItem r2 = (androidx.core.internal.view.SupportMenuItem) r2
            r2.setContentDescription(r3)
            goto L13
        La:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L13
            androidx.core.view.MenuItemCompat.Api26Impl.setContentDescription(r2, r3)
        L13:
            return
    }

    public static void setIconTintList(@androidx.annotation.NonNull android.view.MenuItem r2, @androidx.annotation.Nullable android.content.res.ColorStateList r3) {
            boolean r0 = r2 instanceof androidx.core.internal.view.SupportMenuItem
            if (r0 == 0) goto La
            androidx.core.internal.view.SupportMenuItem r2 = (androidx.core.internal.view.SupportMenuItem) r2
            r2.setIconTintList(r3)
            goto L13
        La:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L13
            androidx.core.view.MenuItemCompat.Api26Impl.setIconTintList(r2, r3)
        L13:
            return
    }

    public static void setIconTintMode(@androidx.annotation.NonNull android.view.MenuItem r2, @androidx.annotation.Nullable android.graphics.PorterDuff.Mode r3) {
            boolean r0 = r2 instanceof androidx.core.internal.view.SupportMenuItem
            if (r0 == 0) goto La
            androidx.core.internal.view.SupportMenuItem r2 = (androidx.core.internal.view.SupportMenuItem) r2
            r2.setIconTintMode(r3)
            goto L13
        La:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L13
            androidx.core.view.MenuItemCompat.Api26Impl.setIconTintMode(r2, r3)
        L13:
            return
    }

    public static void setNumericShortcut(@androidx.annotation.NonNull android.view.MenuItem r2, char r3, int r4) {
            boolean r0 = r2 instanceof androidx.core.internal.view.SupportMenuItem
            if (r0 == 0) goto La
            androidx.core.internal.view.SupportMenuItem r2 = (androidx.core.internal.view.SupportMenuItem) r2
            r2.setNumericShortcut(r3, r4)
            goto L13
        La:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L13
            androidx.core.view.MenuItemCompat.Api26Impl.setNumericShortcut(r2, r3, r4)
        L13:
            return
    }

    @java.lang.Deprecated
    public static android.view.MenuItem setOnActionExpandListener(android.view.MenuItem r1, androidx.core.view.MenuItemCompat.OnActionExpandListener r2) {
            androidx.core.view.MenuItemCompat$1 r0 = new androidx.core.view.MenuItemCompat$1
            r0.<init>(r2)
            android.view.MenuItem r1 = r1.setOnActionExpandListener(r0)
            return r1
    }

    public static void setShortcut(@androidx.annotation.NonNull android.view.MenuItem r2, char r3, char r4, int r5, int r6) {
            boolean r0 = r2 instanceof androidx.core.internal.view.SupportMenuItem
            if (r0 == 0) goto La
            androidx.core.internal.view.SupportMenuItem r2 = (androidx.core.internal.view.SupportMenuItem) r2
            r2.setShortcut(r3, r4, r5, r6)
            goto L13
        La:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L13
            androidx.core.view.MenuItemCompat.Api26Impl.setShortcut(r2, r3, r4, r5, r6)
        L13:
            return
    }

    @java.lang.Deprecated
    public static void setShowAsAction(android.view.MenuItem r0, int r1) {
            r0.setShowAsAction(r1)
            return
    }

    public static void setTooltipText(@androidx.annotation.NonNull android.view.MenuItem r2, @androidx.annotation.Nullable java.lang.CharSequence r3) {
            boolean r0 = r2 instanceof androidx.core.internal.view.SupportMenuItem
            if (r0 == 0) goto La
            androidx.core.internal.view.SupportMenuItem r2 = (androidx.core.internal.view.SupportMenuItem) r2
            r2.setTooltipText(r3)
            goto L13
        La:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L13
            androidx.core.view.MenuItemCompat.Api26Impl.setTooltipText(r2, r3)
        L13:
            return
    }
}
