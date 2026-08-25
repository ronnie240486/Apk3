package com.google.android.material.navigation;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NavigationBarView extends android.widget.FrameLayout {
    public static final int LABEL_VISIBILITY_AUTO = -1;
    public static final int LABEL_VISIBILITY_LABELED = 1;
    public static final int LABEL_VISIBILITY_SELECTED = 0;
    public static final int LABEL_VISIBILITY_UNLABELED = 2;
    private static final int MENU_PRESENTER_ID = 1;

    @androidx.annotation.NonNull
    private final com.google.android.material.navigation.NavigationBarMenu menu;
    private android.view.MenuInflater menuInflater;

    @androidx.annotation.NonNull
    private final com.google.android.material.navigation.NavigationBarMenuView menuView;

    @androidx.annotation.NonNull
    private final com.google.android.material.navigation.NavigationBarPresenter presenter;
    private com.google.android.material.navigation.NavigationBarView.OnItemReselectedListener reselectedListener;
    private com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener selectedListener;


    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public @interface LabelVisibility {
    }

    public interface OnItemReselectedListener {
        void onNavigationItemReselected(@androidx.annotation.NonNull android.view.MenuItem r1);
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface OnItemSelectedListener {
        boolean onNavigationItemSelected(@androidx.annotation.NonNull android.view.MenuItem r1);
    }

    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<com.google.android.material.navigation.NavigationBarView.SavedState> CREATOR = null;

        @androidx.annotation.Nullable
        public android.os.Bundle menuPresenterState;


        static {
                com.google.android.material.navigation.NavigationBarView$SavedState$1 r0 = new com.google.android.material.navigation.NavigationBarView$SavedState$1
                r0.<init>()
                com.google.android.material.navigation.NavigationBarView.SavedState.CREATOR = r0
                return
        }

        public SavedState(@androidx.annotation.NonNull android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                if (r2 != 0) goto Ld
                java.lang.Class r2 = r0.getClass()
                java.lang.ClassLoader r2 = r2.getClassLoader()
            Ld:
                r0.readFromParcel(r1, r2)
                return
        }

        public SavedState(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private void readFromParcel(@androidx.annotation.NonNull android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                android.os.Bundle r1 = r1.readBundle(r2)
                r0.menuPresenterState = r1
                return
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                android.os.Bundle r2 = r0.menuPresenterState
                r1.writeBundle(r2)
                return
        }
    }

    public NavigationBarView(@androidx.annotation.NonNull android.content.Context r12, @androidx.annotation.Nullable android.util.AttributeSet r13, @androidx.annotation.AttrRes int r14, @androidx.annotation.StyleRes int r15) {
            r11 = this;
            android.content.Context r12 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r12, r13, r14, r15)
            r11.<init>(r12, r13, r14)
            com.google.android.material.navigation.NavigationBarPresenter r12 = new com.google.android.material.navigation.NavigationBarPresenter
            r12.<init>()
            r11.presenter = r12
            android.content.Context r6 = r11.getContext()
            int[] r2 = com.google.android.material.R.styleable.NavigationBarView
            r0 = 2
            int[] r5 = new int[r0]
            int r7 = com.google.android.material.R.styleable.NavigationBarView_itemTextAppearanceInactive
            r8 = 0
            r5[r8] = r7
            int r9 = com.google.android.material.R.styleable.NavigationBarView_itemTextAppearanceActive
            r10 = 1
            r5[r10] = r9
            r0 = r6
            r1 = r13
            r3 = r14
            r4 = r15
            androidx.appcompat.widget.TintTypedArray r13 = com.google.android.material.internal.ThemeEnforcement.obtainTintedStyledAttributes(r0, r1, r2, r3, r4, r5)
            com.google.android.material.navigation.NavigationBarMenu r14 = new com.google.android.material.navigation.NavigationBarMenu
            java.lang.Class r15 = r11.getClass()
            int r0 = r11.getMaxItemCount()
            r14.<init>(r6, r15, r0)
            r11.menu = r14
            com.google.android.material.navigation.NavigationBarMenuView r15 = r11.createNavigationBarMenuView(r6)
            r11.menuView = r15
            r12.setMenuView(r15)
            r12.setId(r10)
            r15.setPresenter(r12)
            r14.addMenuPresenter(r12)
            android.content.Context r0 = r11.getContext()
            r12.initForMenu(r0, r14)
            int r12 = com.google.android.material.R.styleable.NavigationBarView_itemIconTint
            boolean r0 = r13.hasValue(r12)
            if (r0 == 0) goto L61
            android.content.res.ColorStateList r12 = r13.getColorStateList(r12)
            r15.setIconTintList(r12)
            goto L6b
        L61:
            r12 = 16842808(0x1010038, float:2.3693715E-38)
            android.content.res.ColorStateList r12 = r15.createDefaultColorStateList(r12)
            r15.setIconTintList(r12)
        L6b:
            int r12 = com.google.android.material.R.styleable.NavigationBarView_itemIconSize
            android.content.res.Resources r0 = r11.getResources()
            int r1 = com.google.android.material.R.dimen.mtrl_navigation_bar_item_default_icon_size
            int r0 = r0.getDimensionPixelSize(r1)
            int r12 = r13.getDimensionPixelSize(r12, r0)
            r11.setItemIconSize(r12)
            boolean r12 = r13.hasValue(r7)
            if (r12 == 0) goto L8b
            int r12 = r13.getResourceId(r7, r8)
            r11.setItemTextAppearanceInactive(r12)
        L8b:
            boolean r12 = r13.hasValue(r9)
            if (r12 == 0) goto L98
            int r12 = r13.getResourceId(r9, r8)
            r11.setItemTextAppearanceActive(r12)
        L98:
            int r12 = com.google.android.material.R.styleable.NavigationBarView_itemTextColor
            boolean r0 = r13.hasValue(r12)
            if (r0 == 0) goto La7
            android.content.res.ColorStateList r12 = r13.getColorStateList(r12)
            r11.setItemTextColor(r12)
        La7:
            android.graphics.drawable.Drawable r12 = r11.getBackground()
            if (r12 == 0) goto Lb5
            android.graphics.drawable.Drawable r12 = r11.getBackground()
            boolean r12 = r12 instanceof android.graphics.drawable.ColorDrawable
            if (r12 == 0) goto Lbc
        Lb5:
            com.google.android.material.shape.MaterialShapeDrawable r12 = r11.createMaterialShapeDrawableBackground(r6)
            androidx.core.view.ViewCompat.setBackground(r11, r12)
        Lbc:
            int r12 = com.google.android.material.R.styleable.NavigationBarView_itemPaddingTop
            boolean r0 = r13.hasValue(r12)
            if (r0 == 0) goto Lcb
            int r12 = r13.getDimensionPixelSize(r12, r8)
            r11.setItemPaddingTop(r12)
        Lcb:
            int r12 = com.google.android.material.R.styleable.NavigationBarView_itemPaddingBottom
            boolean r0 = r13.hasValue(r12)
            if (r0 == 0) goto Lda
            int r12 = r13.getDimensionPixelSize(r12, r8)
            r11.setItemPaddingBottom(r12)
        Lda:
            int r12 = com.google.android.material.R.styleable.NavigationBarView_elevation
            boolean r0 = r13.hasValue(r12)
            if (r0 == 0) goto Lea
            int r12 = r13.getDimensionPixelSize(r12, r8)
            float r12 = (float) r12
            r11.setElevation(r12)
        Lea:
            int r12 = com.google.android.material.R.styleable.NavigationBarView_backgroundTint
            android.content.res.ColorStateList r12 = com.google.android.material.resources.MaterialResources.getColorStateList(r6, r13, r12)
            android.graphics.drawable.Drawable r0 = r11.getBackground()
            android.graphics.drawable.Drawable r0 = r0.mutate()
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r12)
            int r12 = com.google.android.material.R.styleable.NavigationBarView_labelVisibilityMode
            r0 = -1
            int r12 = r13.getInteger(r12, r0)
            r11.setLabelVisibilityMode(r12)
            int r12 = com.google.android.material.R.styleable.NavigationBarView_itemBackground
            int r12 = r13.getResourceId(r12, r8)
            if (r12 == 0) goto L111
            r15.setItemBackgroundRes(r12)
            goto L11a
        L111:
            int r12 = com.google.android.material.R.styleable.NavigationBarView_itemRippleColor
            android.content.res.ColorStateList r12 = com.google.android.material.resources.MaterialResources.getColorStateList(r6, r13, r12)
            r11.setItemRippleColor(r12)
        L11a:
            int r12 = com.google.android.material.R.styleable.NavigationBarView_itemActiveIndicatorStyle
            int r12 = r13.getResourceId(r12, r8)
            if (r12 == 0) goto L163
            r11.setItemActiveIndicatorEnabled(r10)
            int[] r0 = com.google.android.material.R.styleable.NavigationBarActiveIndicator
            android.content.res.TypedArray r12 = r6.obtainStyledAttributes(r12, r0)
            int r0 = com.google.android.material.R.styleable.NavigationBarActiveIndicator_android_width
            int r0 = r12.getDimensionPixelSize(r0, r8)
            r11.setItemActiveIndicatorWidth(r0)
            int r0 = com.google.android.material.R.styleable.NavigationBarActiveIndicator_android_height
            int r0 = r12.getDimensionPixelSize(r0, r8)
            r11.setItemActiveIndicatorHeight(r0)
            int r0 = com.google.android.material.R.styleable.NavigationBarActiveIndicator_marginHorizontal
            int r0 = r12.getDimensionPixelOffset(r0, r8)
            r11.setItemActiveIndicatorMarginHorizontal(r0)
            int r0 = com.google.android.material.R.styleable.NavigationBarActiveIndicator_android_color
            android.content.res.ColorStateList r0 = com.google.android.material.resources.MaterialResources.getColorStateList(r6, r12, r0)
            r11.setItemActiveIndicatorColor(r0)
            int r0 = com.google.android.material.R.styleable.NavigationBarActiveIndicator_shapeAppearance
            int r0 = r12.getResourceId(r0, r8)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r0 = com.google.android.material.shape.ShapeAppearanceModel.builder(r6, r0, r8)
            com.google.android.material.shape.ShapeAppearanceModel r0 = r0.build()
            r11.setItemActiveIndicatorShapeAppearance(r0)
            r12.recycle()
        L163:
            int r12 = com.google.android.material.R.styleable.NavigationBarView_menu
            boolean r0 = r13.hasValue(r12)
            if (r0 == 0) goto L172
            int r12 = r13.getResourceId(r12, r8)
            r11.inflateMenu(r12)
        L172:
            r13.recycle()
            r11.addView(r15)
            com.google.android.material.navigation.NavigationBarView$1 r12 = new com.google.android.material.navigation.NavigationBarView$1
            r12.<init>(r11)
            r14.setCallback(r12)
            return
    }

    public static /* synthetic */ com.google.android.material.navigation.NavigationBarView.OnItemReselectedListener access$000(com.google.android.material.navigation.NavigationBarView r0) {
            com.google.android.material.navigation.NavigationBarView$OnItemReselectedListener r0 = r0.reselectedListener
            return r0
    }

    public static /* synthetic */ com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener access$100(com.google.android.material.navigation.NavigationBarView r0) {
            com.google.android.material.navigation.NavigationBarView$OnItemSelectedListener r0 = r0.selectedListener
            return r0
    }

    @androidx.annotation.NonNull
    private com.google.android.material.shape.MaterialShapeDrawable createMaterialShapeDrawableBackground(android.content.Context r4) {
            r3 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = new com.google.android.material.shape.MaterialShapeDrawable
            r0.<init>()
            android.graphics.drawable.Drawable r1 = r3.getBackground()
            boolean r2 = r1 instanceof android.graphics.drawable.ColorDrawable
            if (r2 == 0) goto L1a
            android.graphics.drawable.ColorDrawable r1 = (android.graphics.drawable.ColorDrawable) r1
            int r1 = r1.getColor()
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setFillColor(r1)
        L1a:
            r0.initializeElevationOverlay(r4)
            return r0
    }

    private android.view.MenuInflater getMenuInflater() {
            r2 = this;
            android.view.MenuInflater r0 = r2.menuInflater
            if (r0 != 0) goto Lf
            androidx.appcompat.view.SupportMenuInflater r0 = new androidx.appcompat.view.SupportMenuInflater
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            r2.menuInflater = r0
        Lf:
            android.view.MenuInflater r0 = r2.menuInflater
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public abstract com.google.android.material.navigation.NavigationBarMenuView createNavigationBarMenuView(@androidx.annotation.NonNull android.content.Context r1);

    @androidx.annotation.Nullable
    public com.google.android.material.badge.BadgeDrawable getBadge(int r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            com.google.android.material.badge.BadgeDrawable r2 = r0.getBadge(r2)
            return r2
    }

    @androidx.annotation.Nullable
    public android.content.res.ColorStateList getItemActiveIndicatorColor() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            android.content.res.ColorStateList r0 = r0.getItemActiveIndicatorColor()
            return r0
    }

    @androidx.annotation.Px
    public int getItemActiveIndicatorHeight() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            int r0 = r0.getItemActiveIndicatorHeight()
            return r0
    }

    @androidx.annotation.Px
    public int getItemActiveIndicatorMarginHorizontal() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            int r0 = r0.getItemActiveIndicatorMarginHorizontal()
            return r0
    }

    @androidx.annotation.Nullable
    public com.google.android.material.shape.ShapeAppearanceModel getItemActiveIndicatorShapeAppearance() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            com.google.android.material.shape.ShapeAppearanceModel r0 = r0.getItemActiveIndicatorShapeAppearance()
            return r0
    }

    @androidx.annotation.Px
    public int getItemActiveIndicatorWidth() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            int r0 = r0.getItemActiveIndicatorWidth()
            return r0
    }

    @androidx.annotation.Nullable
    public android.graphics.drawable.Drawable getItemBackground() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            android.graphics.drawable.Drawable r0 = r0.getItemBackground()
            return r0
    }

    @androidx.annotation.DrawableRes
    @java.lang.Deprecated
    public int getItemBackgroundResource() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            int r0 = r0.getItemBackgroundRes()
            return r0
    }

    @androidx.annotation.Dimension
    public int getItemIconSize() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            int r0 = r0.getItemIconSize()
            return r0
    }

    @androidx.annotation.Nullable
    public android.content.res.ColorStateList getItemIconTintList() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            android.content.res.ColorStateList r0 = r0.getIconTintList()
            return r0
    }

    @androidx.annotation.Px
    public int getItemPaddingBottom() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            int r0 = r0.getItemPaddingBottom()
            return r0
    }

    @androidx.annotation.Px
    public int getItemPaddingTop() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            int r0 = r0.getItemPaddingTop()
            return r0
    }

    @androidx.annotation.Nullable
    public android.content.res.ColorStateList getItemRippleColor() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            android.content.res.ColorStateList r0 = r0.getItemRippleColor()
            return r0
    }

    @androidx.annotation.StyleRes
    public int getItemTextAppearanceActive() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            int r0 = r0.getItemTextAppearanceActive()
            return r0
    }

    @androidx.annotation.StyleRes
    public int getItemTextAppearanceInactive() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            int r0 = r0.getItemTextAppearanceInactive()
            return r0
    }

    @androidx.annotation.Nullable
    public android.content.res.ColorStateList getItemTextColor() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            android.content.res.ColorStateList r0 = r0.getItemTextColor()
            return r0
    }

    public int getLabelVisibilityMode() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            int r0 = r0.getLabelVisibilityMode()
            return r0
    }

    public abstract int getMaxItemCount();

    @androidx.annotation.NonNull
    public android.view.Menu getMenu() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenu r0 = r1.menu
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.appcompat.view.menu.MenuView getMenuView() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.badge.BadgeDrawable getOrCreateBadge(int r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            com.google.android.material.badge.BadgeDrawable r2 = r0.getOrCreateBadge(r2)
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public com.google.android.material.navigation.NavigationBarPresenter getPresenter() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarPresenter r0 = r1.presenter
            return r0
    }

    @androidx.annotation.IdRes
    public int getSelectedItemId() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            int r0 = r0.getSelectedItemId()
            return r0
    }

    public void inflateMenu(int r4) {
            r3 = this;
            com.google.android.material.navigation.NavigationBarPresenter r0 = r3.presenter
            r1 = 1
            r0.setUpdateSuspended(r1)
            android.view.MenuInflater r0 = r3.getMenuInflater()
            com.google.android.material.navigation.NavigationBarMenu r2 = r3.menu
            r0.inflate(r4, r2)
            com.google.android.material.navigation.NavigationBarPresenter r4 = r3.presenter
            r0 = 0
            r4.setUpdateSuspended(r0)
            com.google.android.material.navigation.NavigationBarPresenter r4 = r3.presenter
            r4.updateMenuView(r1)
            return
    }

    public boolean isItemActiveIndicatorEnabled() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            boolean r0 = r0.getItemActiveIndicatorEnabled()
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r0 = this;
            super.onAttachedToWindow()
            com.google.android.material.shape.MaterialShapeUtils.setParentAbsoluteElevation(r0)
            return
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(@androidx.annotation.Nullable android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.material.navigation.NavigationBarView.SavedState
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            com.google.android.material.navigation.NavigationBarView$SavedState r2 = (com.google.android.material.navigation.NavigationBarView.SavedState) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            com.google.android.material.navigation.NavigationBarMenu r0 = r1.menu
            android.os.Bundle r2 = r2.menuPresenterState
            r0.restorePresenterStates(r2)
            return
    }

    @Override // android.view.View
    @androidx.annotation.NonNull
    public final android.os.Parcelable onSaveInstanceState() {
            r3 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            com.google.android.material.navigation.NavigationBarView$SavedState r1 = new com.google.android.material.navigation.NavigationBarView$SavedState
            r1.<init>(r0)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.menuPresenterState = r0
            com.google.android.material.navigation.NavigationBarMenu r2 = r3.menu
            r2.savePresenterStates(r0)
            return r1
    }

    public void removeBadge(int r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.removeBadge(r2)
            return
    }

    @Override // android.view.View
    public void setElevation(float r1) {
            r0 = this;
            super.setElevation(r1)
            com.google.android.material.shape.MaterialShapeUtils.setElevation(r0, r1)
            return
    }

    public void setItemActiveIndicatorColor(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setItemActiveIndicatorColor(r2)
            return
    }

    public void setItemActiveIndicatorEnabled(boolean r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setItemActiveIndicatorEnabled(r2)
            return
    }

    public void setItemActiveIndicatorHeight(@androidx.annotation.Px int r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setItemActiveIndicatorHeight(r2)
            return
    }

    public void setItemActiveIndicatorMarginHorizontal(@androidx.annotation.Px int r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setItemActiveIndicatorMarginHorizontal(r2)
            return
    }

    public void setItemActiveIndicatorShapeAppearance(@androidx.annotation.Nullable com.google.android.material.shape.ShapeAppearanceModel r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setItemActiveIndicatorShapeAppearance(r2)
            return
    }

    public void setItemActiveIndicatorWidth(@androidx.annotation.Px int r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setItemActiveIndicatorWidth(r2)
            return
    }

    public void setItemBackground(@androidx.annotation.Nullable android.graphics.drawable.Drawable r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setItemBackground(r2)
            return
    }

    public void setItemBackgroundResource(@androidx.annotation.DrawableRes int r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setItemBackgroundRes(r2)
            return
    }

    public void setItemIconSize(@androidx.annotation.Dimension int r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setItemIconSize(r2)
            return
    }

    public void setItemIconSizeRes(@androidx.annotation.DimenRes int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            int r2 = r0.getDimensionPixelSize(r2)
            r1.setItemIconSize(r2)
            return
    }

    public void setItemIconTintList(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setIconTintList(r2)
            return
    }

    public void setItemOnTouchListener(int r2, @androidx.annotation.Nullable android.view.View.OnTouchListener r3) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setItemOnTouchListener(r2, r3)
            return
    }

    public void setItemPaddingBottom(@androidx.annotation.Px int r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setItemPaddingBottom(r2)
            return
    }

    public void setItemPaddingTop(@androidx.annotation.Px int r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setItemPaddingTop(r2)
            return
    }

    public void setItemRippleColor(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setItemRippleColor(r2)
            return
    }

    public void setItemTextAppearanceActive(@androidx.annotation.StyleRes int r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setItemTextAppearanceActive(r2)
            return
    }

    public void setItemTextAppearanceInactive(@androidx.annotation.StyleRes int r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setItemTextAppearanceInactive(r2)
            return
    }

    public void setItemTextColor(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setItemTextColor(r2)
            return
    }

    public void setLabelVisibilityMode(int r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            int r0 = r0.getLabelVisibilityMode()
            if (r0 == r2) goto L13
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setLabelVisibilityMode(r2)
            com.google.android.material.navigation.NavigationBarPresenter r2 = r1.presenter
            r0 = 0
            r2.updateMenuView(r0)
        L13:
            return
    }

    public void setOnItemReselectedListener(@androidx.annotation.Nullable com.google.android.material.navigation.NavigationBarView.OnItemReselectedListener r1) {
            r0 = this;
            r0.reselectedListener = r1
            return
    }

    public void setOnItemSelectedListener(@androidx.annotation.Nullable com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener r1) {
            r0 = this;
            r0.selectedListener = r1
            return
    }

    public void setSelectedItemId(@androidx.annotation.IdRes int r4) {
            r3 = this;
            com.google.android.material.navigation.NavigationBarMenu r0 = r3.menu
            android.view.MenuItem r4 = r0.findItem(r4)
            if (r4 == 0) goto L17
            com.google.android.material.navigation.NavigationBarMenu r0 = r3.menu
            com.google.android.material.navigation.NavigationBarPresenter r1 = r3.presenter
            r2 = 0
            boolean r0 = r0.performItemAction(r4, r1, r2)
            if (r0 != 0) goto L17
            r0 = 1
            r4.setChecked(r0)
        L17:
            return
    }
}
