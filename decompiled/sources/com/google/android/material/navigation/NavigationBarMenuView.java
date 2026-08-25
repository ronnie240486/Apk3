package com.google.android.material.navigation;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public abstract class NavigationBarMenuView extends android.view.ViewGroup implements androidx.appcompat.view.menu.MenuView {
    private static final int[] CHECKED_STATE_SET = null;
    private static final int[] DISABLED_STATE_SET = null;
    private static final int ITEM_POOL_SIZE = 5;
    private static final int NO_PADDING = -1;

    @androidx.annotation.NonNull
    private final android.util.SparseArray<com.google.android.material.badge.BadgeDrawable> badgeDrawables;

    @androidx.annotation.Nullable
    private com.google.android.material.navigation.NavigationBarItemView[] buttons;
    private android.content.res.ColorStateList itemActiveIndicatorColor;
    private boolean itemActiveIndicatorEnabled;
    private int itemActiveIndicatorHeight;
    private int itemActiveIndicatorMarginHorizontal;
    private boolean itemActiveIndicatorResizeable;
    private com.google.android.material.shape.ShapeAppearanceModel itemActiveIndicatorShapeAppearance;
    private int itemActiveIndicatorWidth;
    private android.graphics.drawable.Drawable itemBackground;
    private int itemBackgroundRes;

    @androidx.annotation.Dimension
    private int itemIconSize;

    @androidx.annotation.Nullable
    private android.content.res.ColorStateList itemIconTint;
    private int itemPaddingBottom;
    private int itemPaddingTop;
    private final androidx.core.util.Pools.Pool<com.google.android.material.navigation.NavigationBarItemView> itemPool;

    @androidx.annotation.Nullable
    private android.content.res.ColorStateList itemRippleColor;

    @androidx.annotation.StyleRes
    private int itemTextAppearanceActive;

    @androidx.annotation.StyleRes
    private int itemTextAppearanceInactive;

    @androidx.annotation.Nullable
    private final android.content.res.ColorStateList itemTextColorDefault;
    private android.content.res.ColorStateList itemTextColorFromUser;
    private int labelVisibilityMode;
    private androidx.appcompat.view.menu.MenuBuilder menu;

    @androidx.annotation.NonNull
    private final android.view.View.OnClickListener onClickListener;

    @androidx.annotation.NonNull
    private final android.util.SparseArray<android.view.View.OnTouchListener> onTouchListeners;
    private com.google.android.material.navigation.NavigationBarPresenter presenter;
    private int selectedItemId;
    private int selectedItemPosition;

    @androidx.annotation.Nullable
    private final androidx.transition.TransitionSet set;


    static {
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 16842912(0x10100a0, float:2.3694006E-38)
            r3 = 0
            r1[r3] = r2
            com.google.android.material.navigation.NavigationBarMenuView.CHECKED_STATE_SET = r1
            int[] r0 = new int[r0]
            r1 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            r0[r3] = r1
            com.google.android.material.navigation.NavigationBarMenuView.DISABLED_STATE_SET = r0
            return
    }

    public NavigationBarMenuView(@androidx.annotation.NonNull android.content.Context r5) {
            r4 = this;
            r4.<init>(r5)
            androidx.core.util.Pools$SynchronizedPool r5 = new androidx.core.util.Pools$SynchronizedPool
            r0 = 5
            r5.<init>(r0)
            r4.itemPool = r5
            android.util.SparseArray r5 = new android.util.SparseArray
            r5.<init>(r0)
            r4.onTouchListeners = r5
            r5 = 0
            r4.selectedItemId = r5
            r4.selectedItemPosition = r5
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>(r0)
            r4.badgeDrawables = r1
            r0 = -1
            r4.itemPaddingTop = r0
            r4.itemPaddingBottom = r0
            r4.itemActiveIndicatorResizeable = r5
            r0 = 16842808(0x1010038, float:2.3693715E-38)
            android.content.res.ColorStateList r0 = r4.createDefaultColorStateList(r0)
            r4.itemTextColorDefault = r0
            boolean r0 = r4.isInEditMode()
            if (r0 == 0) goto L38
            r5 = 0
            r4.set = r5
            goto L71
        L38:
            androidx.transition.AutoTransition r0 = new androidx.transition.AutoTransition
            r0.<init>()
            r4.set = r0
            r0.setOrdering(r5)
            android.content.Context r5 = r4.getContext()
            int r1 = com.google.android.material.R.attr.motionDurationMedium4
            android.content.res.Resources r2 = r4.getResources()
            int r3 = com.google.android.material.R.integer.material_motion_duration_long_1
            int r2 = r2.getInteger(r3)
            int r5 = com.google.android.material.motion.MotionUtils.resolveThemeDuration(r5, r1, r2)
            long r1 = (long) r5
            r0.setDuration(r1)
            android.content.Context r5 = r4.getContext()
            int r1 = com.google.android.material.R.attr.motionEasingStandard
            android.animation.TimeInterpolator r2 = com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR
            android.animation.TimeInterpolator r5 = com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(r5, r1, r2)
            r0.setInterpolator(r5)
            com.google.android.material.internal.TextScale r5 = new com.google.android.material.internal.TextScale
            r5.<init>()
            r0.addTransition(r5)
        L71:
            com.google.android.material.navigation.NavigationBarMenuView$1 r5 = new com.google.android.material.navigation.NavigationBarMenuView$1
            r5.<init>(r4)
            r4.onClickListener = r5
            r5 = 1
            androidx.core.view.ViewCompat.setImportantForAccessibility(r4, r5)
            return
    }

    public static /* synthetic */ com.google.android.material.navigation.NavigationBarPresenter access$000(com.google.android.material.navigation.NavigationBarMenuView r0) {
            com.google.android.material.navigation.NavigationBarPresenter r0 = r0.presenter
            return r0
    }

    public static /* synthetic */ androidx.appcompat.view.menu.MenuBuilder access$100(com.google.android.material.navigation.NavigationBarMenuView r0) {
            androidx.appcompat.view.menu.MenuBuilder r0 = r0.menu
            return r0
    }

    @androidx.annotation.Nullable
    private android.graphics.drawable.Drawable createItemActiveIndicatorDrawable() {
            r2 = this;
            com.google.android.material.shape.ShapeAppearanceModel r0 = r2.itemActiveIndicatorShapeAppearance
            if (r0 == 0) goto L15
            android.content.res.ColorStateList r0 = r2.itemActiveIndicatorColor
            if (r0 == 0) goto L15
            com.google.android.material.shape.MaterialShapeDrawable r0 = new com.google.android.material.shape.MaterialShapeDrawable
            com.google.android.material.shape.ShapeAppearanceModel r1 = r2.itemActiveIndicatorShapeAppearance
            r0.<init>(r1)
            android.content.res.ColorStateList r1 = r2.itemActiveIndicatorColor
            r0.setFillColor(r1)
            return r0
        L15:
            r0 = 0
            return r0
    }

    private com.google.android.material.navigation.NavigationBarItemView getNewItem() {
            r1 = this;
            androidx.core.util.Pools$Pool<com.google.android.material.navigation.NavigationBarItemView> r0 = r1.itemPool
            java.lang.Object r0 = r0.acquire()
            com.google.android.material.navigation.NavigationBarItemView r0 = (com.google.android.material.navigation.NavigationBarItemView) r0
            if (r0 != 0) goto L12
            android.content.Context r0 = r1.getContext()
            com.google.android.material.navigation.NavigationBarItemView r0 = r1.createNavigationBarItemView(r0)
        L12:
            return r0
    }

    private boolean isValidId(int r2) {
            r1 = this;
            r0 = -1
            if (r2 == r0) goto L5
            r2 = 1
            goto L6
        L5:
            r2 = 0
        L6:
            return r2
    }

    private void removeUnusedBadges() {
            r4 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1 = 0
            r2 = 0
        L7:
            androidx.appcompat.view.menu.MenuBuilder r3 = r4.menu
            int r3 = r3.size()
            if (r2 >= r3) goto L23
            androidx.appcompat.view.menu.MenuBuilder r3 = r4.menu
            android.view.MenuItem r3 = r3.getItem(r2)
            int r3 = r3.getItemId()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.add(r3)
            int r2 = r2 + 1
            goto L7
        L23:
            android.util.SparseArray<com.google.android.material.badge.BadgeDrawable> r2 = r4.badgeDrawables
            int r2 = r2.size()
            if (r1 >= r2) goto L43
            android.util.SparseArray<com.google.android.material.badge.BadgeDrawable> r2 = r4.badgeDrawables
            int r2 = r2.keyAt(r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            boolean r3 = r0.contains(r3)
            if (r3 != 0) goto L40
            android.util.SparseArray<com.google.android.material.badge.BadgeDrawable> r3 = r4.badgeDrawables
            r3.delete(r2)
        L40:
            int r1 = r1 + 1
            goto L23
        L43:
            return
    }

    private void setBadgeIfNeeded(@androidx.annotation.NonNull com.google.android.material.navigation.NavigationBarItemView r3) {
            r2 = this;
            int r0 = r3.getId()
            boolean r1 = r2.isValidId(r0)
            if (r1 != 0) goto Lb
            return
        Lb:
            android.util.SparseArray<com.google.android.material.badge.BadgeDrawable> r1 = r2.badgeDrawables
            java.lang.Object r0 = r1.get(r0)
            com.google.android.material.badge.BadgeDrawable r0 = (com.google.android.material.badge.BadgeDrawable) r0
            if (r0 == 0) goto L18
            r3.setBadge(r0)
        L18:
            return
    }

    private void validateMenuItemId(int r3) {
            r2 = this;
            boolean r0 = r2.isValidId(r3)
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = " is not a valid view id"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    public void buildMenuView() {
            r6 = this;
            r6.removeAllViews()
            com.google.android.material.navigation.NavigationBarItemView[] r0 = r6.buttons
            r1 = 0
            if (r0 == 0) goto L1b
            int r2 = r0.length
            r3 = 0
        La:
            if (r3 >= r2) goto L1b
            r4 = r0[r3]
            if (r4 == 0) goto L18
            androidx.core.util.Pools$Pool<com.google.android.material.navigation.NavigationBarItemView> r5 = r6.itemPool
            r5.release(r4)
            r4.clear()
        L18:
            int r3 = r3 + 1
            goto La
        L1b:
            androidx.appcompat.view.menu.MenuBuilder r0 = r6.menu
            int r0 = r0.size()
            if (r0 != 0) goto L2b
            r6.selectedItemId = r1
            r6.selectedItemPosition = r1
            r0 = 0
            r6.buttons = r0
            return
        L2b:
            r6.removeUnusedBadges()
            androidx.appcompat.view.menu.MenuBuilder r0 = r6.menu
            int r0 = r0.size()
            com.google.android.material.navigation.NavigationBarItemView[] r0 = new com.google.android.material.navigation.NavigationBarItemView[r0]
            r6.buttons = r0
            int r0 = r6.labelVisibilityMode
            androidx.appcompat.view.menu.MenuBuilder r2 = r6.menu
            java.util.ArrayList r2 = r2.getVisibleItems()
            int r2 = r2.size()
            boolean r0 = r6.isShifting(r0, r2)
            r2 = 0
        L49:
            androidx.appcompat.view.menu.MenuBuilder r3 = r6.menu
            int r3 = r3.size()
            r4 = 1
            if (r2 >= r3) goto L108
            com.google.android.material.navigation.NavigationBarPresenter r3 = r6.presenter
            r3.setUpdateSuspended(r4)
            androidx.appcompat.view.menu.MenuBuilder r3 = r6.menu
            android.view.MenuItem r3 = r3.getItem(r2)
            r3.setCheckable(r4)
            com.google.android.material.navigation.NavigationBarPresenter r3 = r6.presenter
            r3.setUpdateSuspended(r1)
            com.google.android.material.navigation.NavigationBarItemView r3 = r6.getNewItem()
            com.google.android.material.navigation.NavigationBarItemView[] r4 = r6.buttons
            r4[r2] = r3
            android.content.res.ColorStateList r4 = r6.itemIconTint
            r3.setIconTintList(r4)
            int r4 = r6.itemIconSize
            r3.setIconSize(r4)
            android.content.res.ColorStateList r4 = r6.itemTextColorDefault
            r3.setTextColor(r4)
            int r4 = r6.itemTextAppearanceInactive
            r3.setTextAppearanceInactive(r4)
            int r4 = r6.itemTextAppearanceActive
            r3.setTextAppearanceActive(r4)
            android.content.res.ColorStateList r4 = r6.itemTextColorFromUser
            r3.setTextColor(r4)
            int r4 = r6.itemPaddingTop
            r5 = -1
            if (r4 == r5) goto L93
            r3.setItemPaddingTop(r4)
        L93:
            int r4 = r6.itemPaddingBottom
            if (r4 == r5) goto L9a
            r3.setItemPaddingBottom(r4)
        L9a:
            int r4 = r6.itemActiveIndicatorWidth
            r3.setActiveIndicatorWidth(r4)
            int r4 = r6.itemActiveIndicatorHeight
            r3.setActiveIndicatorHeight(r4)
            int r4 = r6.itemActiveIndicatorMarginHorizontal
            r3.setActiveIndicatorMarginHorizontal(r4)
            android.graphics.drawable.Drawable r4 = r6.createItemActiveIndicatorDrawable()
            r3.setActiveIndicatorDrawable(r4)
            boolean r4 = r6.itemActiveIndicatorResizeable
            r3.setActiveIndicatorResizeable(r4)
            boolean r4 = r6.itemActiveIndicatorEnabled
            r3.setActiveIndicatorEnabled(r4)
            android.graphics.drawable.Drawable r4 = r6.itemBackground
            if (r4 == 0) goto Lc2
            r3.setItemBackground(r4)
            goto Lc7
        Lc2:
            int r4 = r6.itemBackgroundRes
            r3.setItemBackground(r4)
        Lc7:
            android.content.res.ColorStateList r4 = r6.itemRippleColor
            r3.setItemRippleColor(r4)
            r3.setShifting(r0)
            int r4 = r6.labelVisibilityMode
            r3.setLabelVisibilityMode(r4)
            androidx.appcompat.view.menu.MenuBuilder r4 = r6.menu
            android.view.MenuItem r4 = r4.getItem(r2)
            androidx.appcompat.view.menu.MenuItemImpl r4 = (androidx.appcompat.view.menu.MenuItemImpl) r4
            r3.initialize(r4, r1)
            r3.setItemPosition(r2)
            int r4 = r4.getItemId()
            android.util.SparseArray<android.view.View$OnTouchListener> r5 = r6.onTouchListeners
            java.lang.Object r5 = r5.get(r4)
            android.view.View$OnTouchListener r5 = (android.view.View.OnTouchListener) r5
            r3.setOnTouchListener(r5)
            android.view.View$OnClickListener r5 = r6.onClickListener
            r3.setOnClickListener(r5)
            int r5 = r6.selectedItemId
            if (r5 == 0) goto Lfe
            if (r4 != r5) goto Lfe
            r6.selectedItemPosition = r2
        Lfe:
            r6.setBadgeIfNeeded(r3)
            r6.addView(r3)
            int r2 = r2 + 1
            goto L49
        L108:
            androidx.appcompat.view.menu.MenuBuilder r0 = r6.menu
            int r0 = r0.size()
            int r0 = r0 - r4
            int r1 = r6.selectedItemPosition
            int r0 = java.lang.Math.min(r0, r1)
            r6.selectedItemPosition = r0
            androidx.appcompat.view.menu.MenuBuilder r1 = r6.menu
            android.view.MenuItem r0 = r1.getItem(r0)
            r0.setChecked(r4)
            return
    }

    @androidx.annotation.Nullable
    public android.content.res.ColorStateList createDefaultColorStateList(int r11) {
            r10 = this;
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r1 = r10.getContext()
            android.content.res.Resources$Theme r1 = r1.getTheme()
            r2 = 1
            boolean r11 = r1.resolveAttribute(r11, r0, r2)
            r1 = 0
            if (r11 != 0) goto L16
            return r1
        L16:
            android.content.Context r11 = r10.getContext()
            int r3 = r0.resourceId
            android.content.res.ColorStateList r11 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(r11, r3)
            android.content.Context r3 = r10.getContext()
            android.content.res.Resources$Theme r3 = r3.getTheme()
            int r4 = androidx.appcompat.R.attr.colorPrimary
            boolean r3 = r3.resolveAttribute(r4, r0, r2)
            if (r3 != 0) goto L31
            return r1
        L31:
            int r0 = r0.data
            int r1 = r11.getDefaultColor()
            android.content.res.ColorStateList r3 = new android.content.res.ColorStateList
            r4 = 3
            int[][] r5 = new int[r4][]
            int[] r6 = com.google.android.material.navigation.NavigationBarMenuView.DISABLED_STATE_SET
            r7 = 0
            r5[r7] = r6
            int[] r8 = com.google.android.material.navigation.NavigationBarMenuView.CHECKED_STATE_SET
            r5[r2] = r8
            int[] r8 = android.view.ViewGroup.EMPTY_STATE_SET
            r9 = 2
            r5[r9] = r8
            int[] r4 = new int[r4]
            int r11 = r11.getColorForState(r6, r1)
            r4[r7] = r11
            r4[r2] = r0
            r4[r9] = r1
            r3.<init>(r5, r4)
            return r3
    }

    @androidx.annotation.NonNull
    public abstract com.google.android.material.navigation.NavigationBarItemView createNavigationBarItemView(@androidx.annotation.NonNull android.content.Context r1);

    @androidx.annotation.Nullable
    public com.google.android.material.navigation.NavigationBarItemView findItemView(int r6) {
            r5 = this;
            r5.validateMenuItemId(r6)
            com.google.android.material.navigation.NavigationBarItemView[] r0 = r5.buttons
            if (r0 == 0) goto L17
            int r1 = r0.length
            r2 = 0
        L9:
            if (r2 >= r1) goto L17
            r3 = r0[r2]
            int r4 = r3.getId()
            if (r4 != r6) goto L14
            return r3
        L14:
            int r2 = r2 + 1
            goto L9
        L17:
            r6 = 0
            return r6
    }

    @androidx.annotation.Nullable
    public com.google.android.material.badge.BadgeDrawable getBadge(int r2) {
            r1 = this;
            android.util.SparseArray<com.google.android.material.badge.BadgeDrawable> r0 = r1.badgeDrawables
            java.lang.Object r2 = r0.get(r2)
            com.google.android.material.badge.BadgeDrawable r2 = (com.google.android.material.badge.BadgeDrawable) r2
            return r2
    }

    public android.util.SparseArray<com.google.android.material.badge.BadgeDrawable> getBadgeDrawables() {
            r1 = this;
            android.util.SparseArray<com.google.android.material.badge.BadgeDrawable> r0 = r1.badgeDrawables
            return r0
    }

    @androidx.annotation.Nullable
    public android.content.res.ColorStateList getIconTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.itemIconTint
            return r0
    }

    @androidx.annotation.Nullable
    public android.content.res.ColorStateList getItemActiveIndicatorColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.itemActiveIndicatorColor
            return r0
    }

    public boolean getItemActiveIndicatorEnabled() {
            r1 = this;
            boolean r0 = r1.itemActiveIndicatorEnabled
            return r0
    }

    @androidx.annotation.Px
    public int getItemActiveIndicatorHeight() {
            r1 = this;
            int r0 = r1.itemActiveIndicatorHeight
            return r0
    }

    @androidx.annotation.Px
    public int getItemActiveIndicatorMarginHorizontal() {
            r1 = this;
            int r0 = r1.itemActiveIndicatorMarginHorizontal
            return r0
    }

    @androidx.annotation.Nullable
    public com.google.android.material.shape.ShapeAppearanceModel getItemActiveIndicatorShapeAppearance() {
            r1 = this;
            com.google.android.material.shape.ShapeAppearanceModel r0 = r1.itemActiveIndicatorShapeAppearance
            return r0
    }

    @androidx.annotation.Px
    public int getItemActiveIndicatorWidth() {
            r1 = this;
            int r0 = r1.itemActiveIndicatorWidth
            return r0
    }

    @androidx.annotation.Nullable
    public android.graphics.drawable.Drawable getItemBackground() {
            r2 = this;
            com.google.android.material.navigation.NavigationBarItemView[] r0 = r2.buttons
            if (r0 == 0) goto Lf
            int r1 = r0.length
            if (r1 <= 0) goto Lf
            r1 = 0
            r0 = r0[r1]
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            return r0
        Lf:
            android.graphics.drawable.Drawable r0 = r2.itemBackground
            return r0
    }

    @java.lang.Deprecated
    public int getItemBackgroundRes() {
            r1 = this;
            int r0 = r1.itemBackgroundRes
            return r0
    }

    @androidx.annotation.Dimension
    public int getItemIconSize() {
            r1 = this;
            int r0 = r1.itemIconSize
            return r0
    }

    @androidx.annotation.Px
    public int getItemPaddingBottom() {
            r1 = this;
            int r0 = r1.itemPaddingBottom
            return r0
    }

    @androidx.annotation.Px
    public int getItemPaddingTop() {
            r1 = this;
            int r0 = r1.itemPaddingTop
            return r0
    }

    @androidx.annotation.Nullable
    public android.content.res.ColorStateList getItemRippleColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.itemRippleColor
            return r0
    }

    @androidx.annotation.StyleRes
    public int getItemTextAppearanceActive() {
            r1 = this;
            int r0 = r1.itemTextAppearanceActive
            return r0
    }

    @androidx.annotation.StyleRes
    public int getItemTextAppearanceInactive() {
            r1 = this;
            int r0 = r1.itemTextAppearanceInactive
            return r0
    }

    @androidx.annotation.Nullable
    public android.content.res.ColorStateList getItemTextColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.itemTextColorFromUser
            return r0
    }

    public int getLabelVisibilityMode() {
            r1 = this;
            int r0 = r1.labelVisibilityMode
            return r0
    }

    @androidx.annotation.Nullable
    public androidx.appcompat.view.menu.MenuBuilder getMenu() {
            r1 = this;
            androidx.appcompat.view.menu.MenuBuilder r0 = r1.menu
            return r0
    }

    public final com.google.android.material.badge.BadgeDrawable getOrCreateBadge(int r3) {
            r2 = this;
            r2.validateMenuItemId(r3)
            android.util.SparseArray<com.google.android.material.badge.BadgeDrawable> r0 = r2.badgeDrawables
            java.lang.Object r0 = r0.get(r3)
            com.google.android.material.badge.BadgeDrawable r0 = (com.google.android.material.badge.BadgeDrawable) r0
            if (r0 != 0) goto L1a
            android.content.Context r0 = r2.getContext()
            com.google.android.material.badge.BadgeDrawable r0 = com.google.android.material.badge.BadgeDrawable.create(r0)
            android.util.SparseArray<com.google.android.material.badge.BadgeDrawable> r1 = r2.badgeDrawables
            r1.put(r3, r0)
        L1a:
            com.google.android.material.navigation.NavigationBarItemView r3 = r2.findItemView(r3)
            if (r3 == 0) goto L23
            r3.setBadge(r0)
        L23:
            return r0
    }

    public int getSelectedItemId() {
            r1 = this;
            int r0 = r1.selectedItemId
            return r0
    }

    public int getSelectedItemPosition() {
            r1 = this;
            int r0 = r1.selectedItemPosition
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public int getWindowAnimations() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public void initialize(@androidx.annotation.NonNull androidx.appcompat.view.menu.MenuBuilder r1) {
            r0 = this;
            r0.menu = r1
            return
    }

    public final boolean isShifting(int r4, int r5) {
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L9
            r4 = 3
            if (r5 <= r4) goto Lc
            goto Ld
        L9:
            if (r4 != 0) goto Lc
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@androidx.annotation.NonNull android.view.accessibility.AccessibilityNodeInfo r4) {
            r3 = this;
            super.onInitializeAccessibilityNodeInfo(r4)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r4 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrap(r4)
            androidx.appcompat.view.menu.MenuBuilder r0 = r3.menu
            java.util.ArrayList r0 = r0.getVisibleItems()
            int r0 = r0.size()
            r1 = 1
            r2 = 0
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionInfoCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(r1, r0, r2, r1)
            r4.setCollectionInfo(r0)
            return
    }

    public final void removeBadge(int r3) {
            r2 = this;
            r2.validateMenuItemId(r3)
            android.util.SparseArray<com.google.android.material.badge.BadgeDrawable> r0 = r2.badgeDrawables
            java.lang.Object r0 = r0.get(r3)
            com.google.android.material.badge.BadgeDrawable r0 = (com.google.android.material.badge.BadgeDrawable) r0
            com.google.android.material.navigation.NavigationBarItemView r1 = r2.findItemView(r3)
            if (r1 == 0) goto L14
            r1.removeBadge()
        L14:
            if (r0 == 0) goto L1b
            android.util.SparseArray<com.google.android.material.badge.BadgeDrawable> r0 = r2.badgeDrawables
            r0.remove(r3)
        L1b:
            return
    }

    public final void restoreBadgeDrawables(android.util.SparseArray<com.google.android.material.badge.BadgeDrawable> r6) {
            r5 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r6.size()
            if (r1 >= r2) goto L22
            int r2 = r6.keyAt(r1)
            android.util.SparseArray<com.google.android.material.badge.BadgeDrawable> r3 = r5.badgeDrawables
            int r3 = r3.indexOfKey(r2)
            if (r3 >= 0) goto L1f
            android.util.SparseArray<com.google.android.material.badge.BadgeDrawable> r3 = r5.badgeDrawables
            java.lang.Object r4 = r6.get(r2)
            com.google.android.material.badge.BadgeDrawable r4 = (com.google.android.material.badge.BadgeDrawable) r4
            r3.append(r2, r4)
        L1f:
            int r1 = r1 + 1
            goto L2
        L22:
            com.google.android.material.navigation.NavigationBarItemView[] r6 = r5.buttons
            if (r6 == 0) goto L3d
            int r1 = r6.length
        L27:
            if (r0 >= r1) goto L3d
            r2 = r6[r0]
            android.util.SparseArray<com.google.android.material.badge.BadgeDrawable> r3 = r5.badgeDrawables
            int r4 = r2.getId()
            java.lang.Object r3 = r3.get(r4)
            com.google.android.material.badge.BadgeDrawable r3 = (com.google.android.material.badge.BadgeDrawable) r3
            r2.setBadge(r3)
            int r0 = r0 + 1
            goto L27
        L3d:
            return
    }

    public void setIconTintList(@androidx.annotation.Nullable android.content.res.ColorStateList r5) {
            r4 = this;
            r4.itemIconTint = r5
            com.google.android.material.navigation.NavigationBarItemView[] r0 = r4.buttons
            if (r0 == 0) goto L12
            int r1 = r0.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            r3.setIconTintList(r5)
            int r2 = r2 + 1
            goto L8
        L12:
            return
    }

    public void setItemActiveIndicatorColor(@androidx.annotation.Nullable android.content.res.ColorStateList r5) {
            r4 = this;
            r4.itemActiveIndicatorColor = r5
            com.google.android.material.navigation.NavigationBarItemView[] r5 = r4.buttons
            if (r5 == 0) goto L16
            int r0 = r5.length
            r1 = 0
        L8:
            if (r1 >= r0) goto L16
            r2 = r5[r1]
            android.graphics.drawable.Drawable r3 = r4.createItemActiveIndicatorDrawable()
            r2.setActiveIndicatorDrawable(r3)
            int r1 = r1 + 1
            goto L8
        L16:
            return
    }

    public void setItemActiveIndicatorEnabled(boolean r5) {
            r4 = this;
            r4.itemActiveIndicatorEnabled = r5
            com.google.android.material.navigation.NavigationBarItemView[] r0 = r4.buttons
            if (r0 == 0) goto L12
            int r1 = r0.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            r3.setActiveIndicatorEnabled(r5)
            int r2 = r2 + 1
            goto L8
        L12:
            return
    }

    public void setItemActiveIndicatorHeight(@androidx.annotation.Px int r5) {
            r4 = this;
            r4.itemActiveIndicatorHeight = r5
            com.google.android.material.navigation.NavigationBarItemView[] r0 = r4.buttons
            if (r0 == 0) goto L12
            int r1 = r0.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            r3.setActiveIndicatorHeight(r5)
            int r2 = r2 + 1
            goto L8
        L12:
            return
    }

    public void setItemActiveIndicatorMarginHorizontal(@androidx.annotation.Px int r5) {
            r4 = this;
            r4.itemActiveIndicatorMarginHorizontal = r5
            com.google.android.material.navigation.NavigationBarItemView[] r0 = r4.buttons
            if (r0 == 0) goto L12
            int r1 = r0.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            r3.setActiveIndicatorMarginHorizontal(r5)
            int r2 = r2 + 1
            goto L8
        L12:
            return
    }

    public void setItemActiveIndicatorResizeable(boolean r5) {
            r4 = this;
            r4.itemActiveIndicatorResizeable = r5
            com.google.android.material.navigation.NavigationBarItemView[] r0 = r4.buttons
            if (r0 == 0) goto L12
            int r1 = r0.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            r3.setActiveIndicatorResizeable(r5)
            int r2 = r2 + 1
            goto L8
        L12:
            return
    }

    public void setItemActiveIndicatorShapeAppearance(@androidx.annotation.Nullable com.google.android.material.shape.ShapeAppearanceModel r5) {
            r4 = this;
            r4.itemActiveIndicatorShapeAppearance = r5
            com.google.android.material.navigation.NavigationBarItemView[] r5 = r4.buttons
            if (r5 == 0) goto L16
            int r0 = r5.length
            r1 = 0
        L8:
            if (r1 >= r0) goto L16
            r2 = r5[r1]
            android.graphics.drawable.Drawable r3 = r4.createItemActiveIndicatorDrawable()
            r2.setActiveIndicatorDrawable(r3)
            int r1 = r1 + 1
            goto L8
        L16:
            return
    }

    public void setItemActiveIndicatorWidth(@androidx.annotation.Px int r5) {
            r4 = this;
            r4.itemActiveIndicatorWidth = r5
            com.google.android.material.navigation.NavigationBarItemView[] r0 = r4.buttons
            if (r0 == 0) goto L12
            int r1 = r0.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            r3.setActiveIndicatorWidth(r5)
            int r2 = r2 + 1
            goto L8
        L12:
            return
    }

    public void setItemBackground(@androidx.annotation.Nullable android.graphics.drawable.Drawable r5) {
            r4 = this;
            r4.itemBackground = r5
            com.google.android.material.navigation.NavigationBarItemView[] r0 = r4.buttons
            if (r0 == 0) goto L12
            int r1 = r0.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            r3.setItemBackground(r5)
            int r2 = r2 + 1
            goto L8
        L12:
            return
    }

    public void setItemBackgroundRes(int r5) {
            r4 = this;
            r4.itemBackgroundRes = r5
            com.google.android.material.navigation.NavigationBarItemView[] r0 = r4.buttons
            if (r0 == 0) goto L12
            int r1 = r0.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            r3.setItemBackground(r5)
            int r2 = r2 + 1
            goto L8
        L12:
            return
    }

    public void setItemIconSize(@androidx.annotation.Dimension int r5) {
            r4 = this;
            r4.itemIconSize = r5
            com.google.android.material.navigation.NavigationBarItemView[] r0 = r4.buttons
            if (r0 == 0) goto L12
            int r1 = r0.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            r3.setIconSize(r5)
            int r2 = r2 + 1
            goto L8
        L12:
            return
    }

    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    public void setItemOnTouchListener(int r6, @androidx.annotation.Nullable android.view.View.OnTouchListener r7) {
            r5 = this;
            if (r7 != 0) goto L8
            android.util.SparseArray<android.view.View$OnTouchListener> r0 = r5.onTouchListeners
            r0.remove(r6)
            goto Ld
        L8:
            android.util.SparseArray<android.view.View$OnTouchListener> r0 = r5.onTouchListeners
            r0.put(r6, r7)
        Ld:
            com.google.android.material.navigation.NavigationBarItemView[] r0 = r5.buttons
            if (r0 == 0) goto L27
            int r1 = r0.length
            r2 = 0
        L13:
            if (r2 >= r1) goto L27
            r3 = r0[r2]
            androidx.appcompat.view.menu.MenuItemImpl r4 = r3.getItemData()
            int r4 = r4.getItemId()
            if (r4 != r6) goto L24
            r3.setOnTouchListener(r7)
        L24:
            int r2 = r2 + 1
            goto L13
        L27:
            return
    }

    public void setItemPaddingBottom(@androidx.annotation.Px int r5) {
            r4 = this;
            r4.itemPaddingBottom = r5
            com.google.android.material.navigation.NavigationBarItemView[] r0 = r4.buttons
            if (r0 == 0) goto L12
            int r1 = r0.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            r3.setItemPaddingBottom(r5)
            int r2 = r2 + 1
            goto L8
        L12:
            return
    }

    public void setItemPaddingTop(@androidx.annotation.Px int r5) {
            r4 = this;
            r4.itemPaddingTop = r5
            com.google.android.material.navigation.NavigationBarItemView[] r0 = r4.buttons
            if (r0 == 0) goto L12
            int r1 = r0.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            r3.setItemPaddingTop(r5)
            int r2 = r2 + 1
            goto L8
        L12:
            return
    }

    public void setItemRippleColor(@androidx.annotation.Nullable android.content.res.ColorStateList r5) {
            r4 = this;
            r4.itemRippleColor = r5
            com.google.android.material.navigation.NavigationBarItemView[] r0 = r4.buttons
            if (r0 == 0) goto L12
            int r1 = r0.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            r3.setItemRippleColor(r5)
            int r2 = r2 + 1
            goto L8
        L12:
            return
    }

    public void setItemTextAppearanceActive(@androidx.annotation.StyleRes int r6) {
            r5 = this;
            r5.itemTextAppearanceActive = r6
            com.google.android.material.navigation.NavigationBarItemView[] r0 = r5.buttons
            if (r0 == 0) goto L19
            int r1 = r0.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L19
            r3 = r0[r2]
            r3.setTextAppearanceActive(r6)
            android.content.res.ColorStateList r4 = r5.itemTextColorFromUser
            if (r4 == 0) goto L16
            r3.setTextColor(r4)
        L16:
            int r2 = r2 + 1
            goto L8
        L19:
            return
    }

    public void setItemTextAppearanceInactive(@androidx.annotation.StyleRes int r6) {
            r5 = this;
            r5.itemTextAppearanceInactive = r6
            com.google.android.material.navigation.NavigationBarItemView[] r0 = r5.buttons
            if (r0 == 0) goto L19
            int r1 = r0.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L19
            r3 = r0[r2]
            r3.setTextAppearanceInactive(r6)
            android.content.res.ColorStateList r4 = r5.itemTextColorFromUser
            if (r4 == 0) goto L16
            r3.setTextColor(r4)
        L16:
            int r2 = r2 + 1
            goto L8
        L19:
            return
    }

    public void setItemTextColor(@androidx.annotation.Nullable android.content.res.ColorStateList r5) {
            r4 = this;
            r4.itemTextColorFromUser = r5
            com.google.android.material.navigation.NavigationBarItemView[] r0 = r4.buttons
            if (r0 == 0) goto L12
            int r1 = r0.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            r3.setTextColor(r5)
            int r2 = r2 + 1
            goto L8
        L12:
            return
    }

    public void setLabelVisibilityMode(int r1) {
            r0 = this;
            r0.labelVisibilityMode = r1
            return
    }

    public void setPresenter(@androidx.annotation.NonNull com.google.android.material.navigation.NavigationBarPresenter r1) {
            r0 = this;
            r0.presenter = r1
            return
    }

    public final void tryRestoreSelectedItemId(int r5) {
            r4 = this;
            androidx.appcompat.view.menu.MenuBuilder r0 = r4.menu
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L21
            androidx.appcompat.view.menu.MenuBuilder r2 = r4.menu
            android.view.MenuItem r2 = r2.getItem(r1)
            int r3 = r2.getItemId()
            if (r5 != r3) goto L1e
            r4.selectedItemId = r5
            r4.selectedItemPosition = r1
            r5 = 1
            r2.setChecked(r5)
            goto L21
        L1e:
            int r1 = r1 + 1
            goto L7
        L21:
            return
    }

    public void updateMenuView() {
            r6 = this;
            androidx.appcompat.view.menu.MenuBuilder r0 = r6.menu
            if (r0 == 0) goto L7f
            com.google.android.material.navigation.NavigationBarItemView[] r1 = r6.buttons
            if (r1 != 0) goto La
            goto L7f
        La:
            int r0 = r0.size()
            com.google.android.material.navigation.NavigationBarItemView[] r1 = r6.buttons
            int r1 = r1.length
            if (r0 == r1) goto L17
            r6.buildMenuView()
            return
        L17:
            int r1 = r6.selectedItemId
            r2 = 0
            r3 = 0
        L1b:
            if (r3 >= r0) goto L34
            androidx.appcompat.view.menu.MenuBuilder r4 = r6.menu
            android.view.MenuItem r4 = r4.getItem(r3)
            boolean r5 = r4.isChecked()
            if (r5 == 0) goto L31
            int r4 = r4.getItemId()
            r6.selectedItemId = r4
            r6.selectedItemPosition = r3
        L31:
            int r3 = r3 + 1
            goto L1b
        L34:
            int r3 = r6.selectedItemId
            if (r1 == r3) goto L3f
            androidx.transition.TransitionSet r1 = r6.set
            if (r1 == 0) goto L3f
            androidx.transition.TransitionManager.beginDelayedTransition(r6, r1)
        L3f:
            int r1 = r6.labelVisibilityMode
            androidx.appcompat.view.menu.MenuBuilder r3 = r6.menu
            java.util.ArrayList r3 = r3.getVisibleItems()
            int r3 = r3.size()
            boolean r1 = r6.isShifting(r1, r3)
            r3 = 0
        L50:
            if (r3 >= r0) goto L7f
            com.google.android.material.navigation.NavigationBarPresenter r4 = r6.presenter
            r5 = 1
            r4.setUpdateSuspended(r5)
            com.google.android.material.navigation.NavigationBarItemView[] r4 = r6.buttons
            r4 = r4[r3]
            int r5 = r6.labelVisibilityMode
            r4.setLabelVisibilityMode(r5)
            com.google.android.material.navigation.NavigationBarItemView[] r4 = r6.buttons
            r4 = r4[r3]
            r4.setShifting(r1)
            com.google.android.material.navigation.NavigationBarItemView[] r4 = r6.buttons
            r4 = r4[r3]
            androidx.appcompat.view.menu.MenuBuilder r5 = r6.menu
            android.view.MenuItem r5 = r5.getItem(r3)
            androidx.appcompat.view.menu.MenuItemImpl r5 = (androidx.appcompat.view.menu.MenuItemImpl) r5
            r4.initialize(r5, r2)
            com.google.android.material.navigation.NavigationBarPresenter r4 = r6.presenter
            r4.setUpdateSuspended(r2)
            int r3 = r3 + 1
            goto L50
        L7f:
            return
    }
}
