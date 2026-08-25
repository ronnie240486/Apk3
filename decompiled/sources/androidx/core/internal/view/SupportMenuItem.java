package androidx.core.internal.view;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public interface SupportMenuItem extends android.view.MenuItem {
    public static final int SHOW_AS_ACTION_ALWAYS = 2;
    public static final int SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW = 8;
    public static final int SHOW_AS_ACTION_IF_ROOM = 1;
    public static final int SHOW_AS_ACTION_NEVER = 0;
    public static final int SHOW_AS_ACTION_WITH_TEXT = 4;

    /* JADX INFO: renamed from: androidx.core.internal.view.SupportMenuItem$-CC, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public final /* synthetic */ class CC {
        @androidx.annotation.NonNull
        public static /* bridge */ /* synthetic */ android.view.MenuItem $default$setContentDescription(androidx.core.internal.view.SupportMenuItem r0, @androidx.annotation.Nullable java.lang.CharSequence r1) {
                androidx.core.internal.view.SupportMenuItem r0 = r0.setContentDescription(r1)
                return r0
        }

        @androidx.annotation.NonNull
        public static /* bridge */ /* synthetic */ android.view.MenuItem $default$setTooltipText(androidx.core.internal.view.SupportMenuItem r0, @androidx.annotation.Nullable java.lang.CharSequence r1) {
                androidx.core.internal.view.SupportMenuItem r0 = r0.setTooltipText(r1)
                return r0
        }
    }

    @Override // android.view.MenuItem
    boolean collapseActionView();

    @Override // android.view.MenuItem
    boolean expandActionView();

    @Override // android.view.MenuItem
    @androidx.annotation.Nullable
    android.view.View getActionView();

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    @androidx.annotation.Nullable
    java.lang.CharSequence getContentDescription();

    @Override // android.view.MenuItem
    @androidx.annotation.Nullable
    android.content.res.ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    @androidx.annotation.Nullable
    android.graphics.PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @androidx.annotation.Nullable
    androidx.core.view.ActionProvider getSupportActionProvider();

    @Override // android.view.MenuItem
    @androidx.annotation.Nullable
    java.lang.CharSequence getTooltipText();

    @Override // android.view.MenuItem
    boolean isActionViewExpanded();

    boolean requiresActionButton();

    boolean requiresOverflow();

    @Override // android.view.MenuItem
    @androidx.annotation.NonNull
    android.view.MenuItem setActionView(int r1);

    @Override // android.view.MenuItem
    @androidx.annotation.NonNull
    android.view.MenuItem setActionView(@androidx.annotation.Nullable android.view.View r1);

    @Override // android.view.MenuItem
    @androidx.annotation.NonNull
    android.view.MenuItem setAlphabeticShortcut(char r1, int r2);

    @Override // android.view.MenuItem
    @androidx.annotation.NonNull
    /* bridge */ /* synthetic */ android.view.MenuItem setContentDescription(@androidx.annotation.Nullable java.lang.CharSequence r1);

    @Override // android.view.MenuItem
    @androidx.annotation.NonNull
    androidx.core.internal.view.SupportMenuItem setContentDescription(@androidx.annotation.Nullable java.lang.CharSequence r1);

    @Override // android.view.MenuItem
    @androidx.annotation.NonNull
    android.view.MenuItem setIconTintList(@androidx.annotation.Nullable android.content.res.ColorStateList r1);

    @Override // android.view.MenuItem
    @androidx.annotation.NonNull
    android.view.MenuItem setIconTintMode(@androidx.annotation.Nullable android.graphics.PorterDuff.Mode r1);

    @Override // android.view.MenuItem
    @androidx.annotation.NonNull
    android.view.MenuItem setNumericShortcut(char r1, int r2);

    @Override // android.view.MenuItem
    @androidx.annotation.NonNull
    android.view.MenuItem setShortcut(char r1, char r2, int r3, int r4);

    @Override // android.view.MenuItem
    void setShowAsAction(int r1);

    @Override // android.view.MenuItem
    @androidx.annotation.NonNull
    android.view.MenuItem setShowAsActionFlags(int r1);

    @androidx.annotation.NonNull
    androidx.core.internal.view.SupportMenuItem setSupportActionProvider(@androidx.annotation.Nullable androidx.core.view.ActionProvider r1);

    @Override // android.view.MenuItem
    @androidx.annotation.NonNull
    /* bridge */ /* synthetic */ android.view.MenuItem setTooltipText(@androidx.annotation.Nullable java.lang.CharSequence r1);

    @Override // android.view.MenuItem
    @androidx.annotation.NonNull
    androidx.core.internal.view.SupportMenuItem setTooltipText(@androidx.annotation.Nullable java.lang.CharSequence r1);
}
