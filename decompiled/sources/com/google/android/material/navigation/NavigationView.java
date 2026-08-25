package com.google.android.material.navigation;

/* JADX INFO: loaded from: classes2.dex */
public class NavigationView extends com.google.android.material.internal.ScrimInsetsFrameLayout {
    private static final int[] CHECKED_STATE_SET = null;
    private static final int DEF_STYLE_RES = 0;
    private static final int[] DISABLED_STATE_SET = null;
    private static final int PRESENTER_NAVIGATION_VIEW_ID = 1;
    private boolean bottomInsetScrimEnabled;

    @androidx.annotation.Px
    private int drawerLayoutCornerSize;
    private int layoutGravity;
    public com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener listener;
    private final int maxWidth;

    @androidx.annotation.NonNull
    private final com.google.android.material.internal.NavigationMenu menu;
    private android.view.MenuInflater menuInflater;
    private android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
    private final com.google.android.material.internal.NavigationMenuPresenter presenter;
    private final android.graphics.RectF shapeClipBounds;

    @androidx.annotation.Nullable
    private android.graphics.Path shapeClipPath;
    private final int[] tmpLocation;
    private boolean topInsetScrimEnabled;



    /* JADX INFO: loaded from: classes3.dex */
    public interface OnNavigationItemSelectedListener {
        boolean onNavigationItemSelected(@androidx.annotation.NonNull android.view.MenuItem r1);
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<com.google.android.material.navigation.NavigationView.SavedState> CREATOR = null;

        @androidx.annotation.Nullable
        public android.os.Bundle menuState;


        static {
                com.google.android.material.navigation.NavigationView$SavedState$1 r0 = new com.google.android.material.navigation.NavigationView$SavedState$1
                r0.<init>()
                com.google.android.material.navigation.NavigationView.SavedState.CREATOR = r0
                return
        }

        public SavedState(@androidx.annotation.NonNull android.os.Parcel r1, @androidx.annotation.Nullable java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                android.os.Bundle r1 = r1.readBundle(r2)
                r0.menuState = r1
                return
        }

        public SavedState(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                android.os.Bundle r2 = r0.menuState
                r1.writeBundle(r2)
                return
        }
    }

    static {
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 16842912(0x10100a0, float:2.3694006E-38)
            r3 = 0
            r1[r3] = r2
            com.google.android.material.navigation.NavigationView.CHECKED_STATE_SET = r1
            int[] r0 = new int[r0]
            r1 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            r0[r3] = r1
            com.google.android.material.navigation.NavigationView.DISABLED_STATE_SET = r0
            int r0 = com.google.android.material.R.style.Widget_Design_NavigationView
            com.google.android.material.navigation.NavigationView.DEF_STYLE_RES = r0
            return
    }

    public NavigationView(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public NavigationView(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.R.attr.navigationViewStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public NavigationView(@androidx.annotation.NonNull android.content.Context r17, @androidx.annotation.Nullable android.util.AttributeSet r18, int r19) {
            r16 = this;
            r0 = r16
            r7 = r18
            r8 = r19
            int r9 = com.google.android.material.navigation.NavigationView.DEF_STYLE_RES
            r1 = r17
            android.content.Context r1 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            com.google.android.material.internal.NavigationMenuPresenter r10 = new com.google.android.material.internal.NavigationMenuPresenter
            r10.<init>()
            r0.presenter = r10
            r1 = 2
            int[] r1 = new int[r1]
            r0.tmpLocation = r1
            r11 = 1
            r0.topInsetScrimEnabled = r11
            r0.bottomInsetScrimEnabled = r11
            r12 = 0
            r0.layoutGravity = r12
            r0.drawerLayoutCornerSize = r12
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.shapeClipBounds = r1
            android.content.Context r13 = r16.getContext()
            com.google.android.material.internal.NavigationMenu r14 = new com.google.android.material.internal.NavigationMenu
            r14.<init>(r13)
            r0.menu = r14
            int[] r3 = com.google.android.material.R.styleable.NavigationView
            int[] r6 = new int[r12]
            r1 = r13
            r2 = r18
            r4 = r19
            r5 = r9
            androidx.appcompat.widget.TintTypedArray r1 = com.google.android.material.internal.ThemeEnforcement.obtainTintedStyledAttributes(r1, r2, r3, r4, r5, r6)
            int r2 = com.google.android.material.R.styleable.NavigationView_android_background
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L56
            android.graphics.drawable.Drawable r2 = r1.getDrawable(r2)
            androidx.core.view.ViewCompat.setBackground(r0, r2)
        L56:
            int r2 = com.google.android.material.R.styleable.NavigationView_drawerLayoutCornerSize
            int r2 = r1.getDimensionPixelSize(r2, r12)
            r0.drawerLayoutCornerSize = r2
            int r2 = com.google.android.material.R.styleable.NavigationView_android_layout_gravity
            int r2 = r1.getInt(r2, r12)
            r0.layoutGravity = r2
            android.graphics.drawable.Drawable r2 = r16.getBackground()
            if (r2 == 0) goto L74
            android.graphics.drawable.Drawable r2 = r16.getBackground()
            boolean r2 = r2 instanceof android.graphics.drawable.ColorDrawable
            if (r2 == 0) goto L9c
        L74:
            com.google.android.material.shape.ShapeAppearanceModel$Builder r2 = com.google.android.material.shape.ShapeAppearanceModel.builder(r13, r7, r8, r9)
            com.google.android.material.shape.ShapeAppearanceModel r2 = r2.build()
            android.graphics.drawable.Drawable r3 = r16.getBackground()
            com.google.android.material.shape.MaterialShapeDrawable r4 = new com.google.android.material.shape.MaterialShapeDrawable
            r4.<init>(r2)
            boolean r2 = r3 instanceof android.graphics.drawable.ColorDrawable
            if (r2 == 0) goto L96
            android.graphics.drawable.ColorDrawable r3 = (android.graphics.drawable.ColorDrawable) r3
            int r2 = r3.getColor()
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r4.setFillColor(r2)
        L96:
            r4.initializeElevationOverlay(r13)
            androidx.core.view.ViewCompat.setBackground(r0, r4)
        L9c:
            int r2 = com.google.android.material.R.styleable.NavigationView_elevation
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto Lac
            int r2 = r1.getDimensionPixelSize(r2, r12)
            float r2 = (float) r2
            r0.setElevation(r2)
        Lac:
            int r2 = com.google.android.material.R.styleable.NavigationView_android_fitsSystemWindows
            boolean r2 = r1.getBoolean(r2, r12)
            r0.setFitsSystemWindows(r2)
            int r2 = com.google.android.material.R.styleable.NavigationView_android_maxWidth
            int r2 = r1.getDimensionPixelSize(r2, r12)
            r0.maxWidth = r2
            int r2 = com.google.android.material.R.styleable.NavigationView_subheaderColor
            boolean r3 = r1.hasValue(r2)
            r4 = 0
            if (r3 == 0) goto Lcb
            android.content.res.ColorStateList r2 = r1.getColorStateList(r2)
            goto Lcc
        Lcb:
            r2 = r4
        Lcc:
            int r3 = com.google.android.material.R.styleable.NavigationView_subheaderTextAppearance
            boolean r5 = r1.hasValue(r3)
            if (r5 == 0) goto Ld9
            int r3 = r1.getResourceId(r3, r12)
            goto Lda
        Ld9:
            r3 = 0
        Lda:
            r5 = 16842808(0x1010038, float:2.3693715E-38)
            if (r3 != 0) goto Le5
            if (r2 != 0) goto Le5
            android.content.res.ColorStateList r2 = r0.createDefaultColorStateList(r5)
        Le5:
            int r6 = com.google.android.material.R.styleable.NavigationView_itemIconTint
            boolean r7 = r1.hasValue(r6)
            if (r7 == 0) goto Lf2
            android.content.res.ColorStateList r5 = r1.getColorStateList(r6)
            goto Lf6
        Lf2:
            android.content.res.ColorStateList r5 = r0.createDefaultColorStateList(r5)
        Lf6:
            int r6 = com.google.android.material.R.styleable.NavigationView_itemTextAppearance
            boolean r7 = r1.hasValue(r6)
            if (r7 == 0) goto L103
            int r6 = r1.getResourceId(r6, r12)
            goto L104
        L103:
            r6 = 0
        L104:
            int r7 = com.google.android.material.R.styleable.NavigationView_itemIconSize
            boolean r8 = r1.hasValue(r7)
            if (r8 == 0) goto L113
            int r7 = r1.getDimensionPixelSize(r7, r12)
            r0.setItemIconSize(r7)
        L113:
            int r7 = com.google.android.material.R.styleable.NavigationView_itemTextColor
            boolean r8 = r1.hasValue(r7)
            if (r8 == 0) goto L120
            android.content.res.ColorStateList r7 = r1.getColorStateList(r7)
            goto L121
        L120:
            r7 = r4
        L121:
            if (r6 != 0) goto L12c
            if (r7 != 0) goto L12c
            r7 = 16842806(0x1010036, float:2.369371E-38)
            android.content.res.ColorStateList r7 = r0.createDefaultColorStateList(r7)
        L12c:
            int r8 = com.google.android.material.R.styleable.NavigationView_itemBackground
            android.graphics.drawable.Drawable r8 = r1.getDrawable(r8)
            if (r8 != 0) goto L156
            boolean r9 = r0.hasShapeAppearance(r1)
            if (r9 == 0) goto L156
            android.graphics.drawable.Drawable r8 = r0.createDefaultItemBackground(r1)
            int r9 = com.google.android.material.R.styleable.NavigationView_itemRippleColor
            android.content.res.ColorStateList r9 = com.google.android.material.resources.MaterialResources.getColorStateList(r13, r1, r9)
            if (r9 == 0) goto L156
            android.graphics.drawable.Drawable r15 = r0.createDefaultItemDrawable(r1, r4)
            android.graphics.drawable.RippleDrawable r11 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r9 = com.google.android.material.ripple.RippleUtils.sanitizeRippleDrawableColor(r9)
            r11.<init>(r9, r4, r15)
            r10.setItemForeground(r11)
        L156:
            int r4 = com.google.android.material.R.styleable.NavigationView_itemHorizontalPadding
            boolean r9 = r1.hasValue(r4)
            if (r9 == 0) goto L165
            int r4 = r1.getDimensionPixelSize(r4, r12)
            r0.setItemHorizontalPadding(r4)
        L165:
            int r4 = com.google.android.material.R.styleable.NavigationView_itemVerticalPadding
            boolean r9 = r1.hasValue(r4)
            if (r9 == 0) goto L174
            int r4 = r1.getDimensionPixelSize(r4, r12)
            r0.setItemVerticalPadding(r4)
        L174:
            int r4 = com.google.android.material.R.styleable.NavigationView_dividerInsetStart
            int r4 = r1.getDimensionPixelSize(r4, r12)
            r0.setDividerInsetStart(r4)
            int r4 = com.google.android.material.R.styleable.NavigationView_dividerInsetEnd
            int r4 = r1.getDimensionPixelSize(r4, r12)
            r0.setDividerInsetEnd(r4)
            int r4 = com.google.android.material.R.styleable.NavigationView_subheaderInsetStart
            int r4 = r1.getDimensionPixelSize(r4, r12)
            r0.setSubheaderInsetStart(r4)
            int r4 = com.google.android.material.R.styleable.NavigationView_subheaderInsetEnd
            int r4 = r1.getDimensionPixelSize(r4, r12)
            r0.setSubheaderInsetEnd(r4)
            int r4 = com.google.android.material.R.styleable.NavigationView_topInsetScrimEnabled
            boolean r9 = r0.topInsetScrimEnabled
            boolean r4 = r1.getBoolean(r4, r9)
            r0.setTopInsetScrimEnabled(r4)
            int r4 = com.google.android.material.R.styleable.NavigationView_bottomInsetScrimEnabled
            boolean r9 = r0.bottomInsetScrimEnabled
            boolean r4 = r1.getBoolean(r4, r9)
            r0.setBottomInsetScrimEnabled(r4)
            int r4 = com.google.android.material.R.styleable.NavigationView_itemIconPadding
            int r4 = r1.getDimensionPixelSize(r4, r12)
            int r9 = com.google.android.material.R.styleable.NavigationView_itemMaxLines
            r11 = 1
            int r9 = r1.getInt(r9, r11)
            r0.setItemMaxLines(r9)
            com.google.android.material.navigation.NavigationView$1 r9 = new com.google.android.material.navigation.NavigationView$1
            r9.<init>(r0)
            r14.setCallback(r9)
            r10.setId(r11)
            r10.initForMenu(r13, r14)
            if (r3 == 0) goto L1d1
            r10.setSubheaderTextAppearance(r3)
        L1d1:
            r10.setSubheaderColor(r2)
            r10.setItemIconTintList(r5)
            int r2 = r16.getOverScrollMode()
            r10.setOverScrollMode(r2)
            if (r6 == 0) goto L1e3
            r10.setItemTextAppearance(r6)
        L1e3:
            r10.setItemTextColor(r7)
            r10.setItemBackground(r8)
            r10.setItemIconPadding(r4)
            r14.addMenuPresenter(r10)
            androidx.appcompat.view.menu.MenuView r2 = r10.getMenuView(r0)
            android.view.View r2 = (android.view.View) r2
            r0.addView(r2)
            int r2 = com.google.android.material.R.styleable.NavigationView_menu
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L207
            int r2 = r1.getResourceId(r2, r12)
            r0.inflateMenu(r2)
        L207:
            int r2 = com.google.android.material.R.styleable.NavigationView_headerLayout
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L216
            int r2 = r1.getResourceId(r2, r12)
            r0.inflateHeaderView(r2)
        L216:
            r1.recycle()
            r16.setupInsetScrimsListener()
            return
    }

    public static /* synthetic */ int[] access$000(com.google.android.material.navigation.NavigationView r0) {
            int[] r0 = r0.tmpLocation
            return r0
    }

    public static /* synthetic */ com.google.android.material.internal.NavigationMenuPresenter access$100(com.google.android.material.navigation.NavigationView r0) {
            com.google.android.material.internal.NavigationMenuPresenter r0 = r0.presenter
            return r0
    }

    @androidx.annotation.Nullable
    private android.content.res.ColorStateList createDefaultColorStateList(int r11) {
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
            int[] r6 = com.google.android.material.navigation.NavigationView.DISABLED_STATE_SET
            r7 = 0
            r5[r7] = r6
            int[] r8 = com.google.android.material.navigation.NavigationView.CHECKED_STATE_SET
            r5[r2] = r8
            int[] r8 = android.widget.FrameLayout.EMPTY_STATE_SET
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
    private android.graphics.drawable.Drawable createDefaultItemBackground(@androidx.annotation.NonNull androidx.appcompat.widget.TintTypedArray r3) {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            int r1 = com.google.android.material.R.styleable.NavigationView_itemShapeFillColor
            android.content.res.ColorStateList r0 = com.google.android.material.resources.MaterialResources.getColorStateList(r0, r3, r1)
            android.graphics.drawable.Drawable r3 = r2.createDefaultItemDrawable(r3, r0)
            return r3
    }

    @androidx.annotation.NonNull
    private android.graphics.drawable.Drawable createDefaultItemDrawable(@androidx.annotation.NonNull androidx.appcompat.widget.TintTypedArray r10, @androidx.annotation.Nullable android.content.res.ColorStateList r11) {
            r9 = this;
            int r0 = com.google.android.material.R.styleable.NavigationView_itemShapeAppearance
            r1 = 0
            int r0 = r10.getResourceId(r0, r1)
            int r2 = com.google.android.material.R.styleable.NavigationView_itemShapeAppearanceOverlay
            int r2 = r10.getResourceId(r2, r1)
            com.google.android.material.shape.MaterialShapeDrawable r4 = new com.google.android.material.shape.MaterialShapeDrawable
            android.content.Context r3 = r9.getContext()
            com.google.android.material.shape.ShapeAppearanceModel$Builder r0 = com.google.android.material.shape.ShapeAppearanceModel.builder(r3, r0, r2)
            com.google.android.material.shape.ShapeAppearanceModel r0 = r0.build()
            r4.<init>(r0)
            r4.setFillColor(r11)
            int r11 = com.google.android.material.R.styleable.NavigationView_itemShapeInsetStart
            int r5 = r10.getDimensionPixelSize(r11, r1)
            int r11 = com.google.android.material.R.styleable.NavigationView_itemShapeInsetTop
            int r6 = r10.getDimensionPixelSize(r11, r1)
            int r11 = com.google.android.material.R.styleable.NavigationView_itemShapeInsetEnd
            int r7 = r10.getDimensionPixelSize(r11, r1)
            int r11 = com.google.android.material.R.styleable.NavigationView_itemShapeInsetBottom
            int r8 = r10.getDimensionPixelSize(r11, r1)
            android.graphics.drawable.InsetDrawable r10 = new android.graphics.drawable.InsetDrawable
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            return r10
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

    private boolean hasShapeAppearance(@androidx.annotation.NonNull androidx.appcompat.widget.TintTypedArray r2) {
            r1 = this;
            int r0 = com.google.android.material.R.styleable.NavigationView_itemShapeAppearance
            boolean r0 = r2.hasValue(r0)
            if (r0 != 0) goto L13
            int r0 = com.google.android.material.R.styleable.NavigationView_itemShapeAppearanceOverlay
            boolean r2 = r2.hasValue(r0)
            if (r2 == 0) goto L11
            goto L13
        L11:
            r2 = 0
            goto L14
        L13:
            r2 = 1
        L14:
            return r2
    }

    private void maybeUpdateCornerSizeForDrawerLayout(@androidx.annotation.Px int r5, @androidx.annotation.Px int r6) {
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.drawerlayout.widget.DrawerLayout
            if (r0 == 0) goto L7e
            int r0 = r4.drawerLayoutCornerSize
            if (r0 <= 0) goto L7e
            android.graphics.drawable.Drawable r0 = r4.getBackground()
            boolean r0 = r0 instanceof com.google.android.material.shape.MaterialShapeDrawable
            if (r0 == 0) goto L7e
            android.graphics.drawable.Drawable r0 = r4.getBackground()
            com.google.android.material.shape.MaterialShapeDrawable r0 = (com.google.android.material.shape.MaterialShapeDrawable) r0
            com.google.android.material.shape.ShapeAppearanceModel r1 = r0.getShapeAppearanceModel()
            com.google.android.material.shape.ShapeAppearanceModel$Builder r1 = r1.toBuilder()
            int r2 = r4.layoutGravity
            int r3 = androidx.core.view.ViewCompat.getLayoutDirection(r4)
            int r2 = androidx.core.view.GravityCompat.getAbsoluteGravity(r2, r3)
            r3 = 3
            if (r2 != r3) goto L3c
            int r2 = r4.drawerLayoutCornerSize
            float r2 = (float) r2
            r1.setTopRightCornerSize(r2)
            int r2 = r4.drawerLayoutCornerSize
            float r2 = (float) r2
            r1.setBottomRightCornerSize(r2)
            goto L48
        L3c:
            int r2 = r4.drawerLayoutCornerSize
            float r2 = (float) r2
            r1.setTopLeftCornerSize(r2)
            int r2 = r4.drawerLayoutCornerSize
            float r2 = (float) r2
            r1.setBottomLeftCornerSize(r2)
        L48:
            com.google.android.material.shape.ShapeAppearanceModel r1 = r1.build()
            r0.setShapeAppearanceModel(r1)
            android.graphics.Path r1 = r4.shapeClipPath
            if (r1 != 0) goto L5a
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r4.shapeClipPath = r1
        L5a:
            android.graphics.Path r1 = r4.shapeClipPath
            r1.reset()
            android.graphics.RectF r1 = r4.shapeClipBounds
            float r5 = (float) r5
            float r6 = (float) r6
            r2 = 0
            r1.set(r2, r2, r5, r6)
            com.google.android.material.shape.ShapeAppearancePathProvider r5 = com.google.android.material.shape.ShapeAppearancePathProvider.getInstance()
            com.google.android.material.shape.ShapeAppearanceModel r6 = r0.getShapeAppearanceModel()
            float r0 = r0.getInterpolation()
            android.graphics.RectF r1 = r4.shapeClipBounds
            android.graphics.Path r2 = r4.shapeClipPath
            r5.calculatePath(r6, r0, r1, r2)
            r4.invalidate()
            goto L86
        L7e:
            r5 = 0
            r4.shapeClipPath = r5
            android.graphics.RectF r5 = r4.shapeClipBounds
            r5.setEmpty()
        L86:
            return
    }

    private void setupInsetScrimsListener() {
            r2 = this;
            com.google.android.material.navigation.NavigationView$2 r0 = new com.google.android.material.navigation.NavigationView$2
            r0.<init>(r2)
            r2.onGlobalLayoutListener = r0
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r2.onGlobalLayoutListener
            r0.addOnGlobalLayoutListener(r1)
            return
    }

    public void addHeaderView(@androidx.annotation.NonNull android.view.View r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.addHeaderView(r2)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(@androidx.annotation.NonNull android.graphics.Canvas r3) {
            r2 = this;
            android.graphics.Path r0 = r2.shapeClipPath
            if (r0 != 0) goto L8
            super.dispatchDraw(r3)
            return
        L8:
            int r0 = r3.save()
            android.graphics.Path r1 = r2.shapeClipPath
            r3.clipPath(r1)
            super.dispatchDraw(r3)
            r3.restoreToCount(r0)
            return
    }

    @androidx.annotation.Nullable
    public android.view.MenuItem getCheckedItem() {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            androidx.appcompat.view.menu.MenuItemImpl r0 = r0.getCheckedItem()
            return r0
    }

    @androidx.annotation.Px
    public int getDividerInsetEnd() {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            int r0 = r0.getDividerInsetEnd()
            return r0
    }

    @androidx.annotation.Px
    public int getDividerInsetStart() {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            int r0 = r0.getDividerInsetStart()
            return r0
    }

    public int getHeaderCount() {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            int r0 = r0.getHeaderCount()
            return r0
    }

    public android.view.View getHeaderView(int r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            android.view.View r2 = r0.getHeaderView(r2)
            return r2
    }

    @androidx.annotation.Nullable
    public android.graphics.drawable.Drawable getItemBackground() {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            android.graphics.drawable.Drawable r0 = r0.getItemBackground()
            return r0
    }

    @androidx.annotation.Dimension
    public int getItemHorizontalPadding() {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            int r0 = r0.getItemHorizontalPadding()
            return r0
    }

    @androidx.annotation.Dimension
    public int getItemIconPadding() {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            int r0 = r0.getItemIconPadding()
            return r0
    }

    @androidx.annotation.Nullable
    public android.content.res.ColorStateList getItemIconTintList() {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            android.content.res.ColorStateList r0 = r0.getItemTintList()
            return r0
    }

    public int getItemMaxLines() {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            int r0 = r0.getItemMaxLines()
            return r0
    }

    @androidx.annotation.Nullable
    public android.content.res.ColorStateList getItemTextColor() {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            android.content.res.ColorStateList r0 = r0.getItemTextColor()
            return r0
    }

    @androidx.annotation.Px
    public int getItemVerticalPadding() {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            int r0 = r0.getItemVerticalPadding()
            return r0
    }

    @androidx.annotation.NonNull
    public android.view.Menu getMenu() {
            r1 = this;
            com.google.android.material.internal.NavigationMenu r0 = r1.menu
            return r0
    }

    @androidx.annotation.Px
    public int getSubheaderInsetEnd() {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            int r0 = r0.getSubheaderInsetEnd()
            return r0
    }

    @androidx.annotation.Px
    public int getSubheaderInsetStart() {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            int r0 = r0.getSubheaderInsetStart()
            return r0
    }

    public android.view.View inflateHeaderView(@androidx.annotation.LayoutRes int r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            android.view.View r2 = r0.inflateHeaderView(r2)
            return r2
    }

    public void inflateMenu(int r3) {
            r2 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r2.presenter
            r1 = 1
            r0.setUpdateSuspended(r1)
            android.view.MenuInflater r0 = r2.getMenuInflater()
            com.google.android.material.internal.NavigationMenu r1 = r2.menu
            r0.inflate(r3, r1)
            com.google.android.material.internal.NavigationMenuPresenter r3 = r2.presenter
            r0 = 0
            r3.setUpdateSuspended(r0)
            com.google.android.material.internal.NavigationMenuPresenter r3 = r2.presenter
            r3.updateMenuView(r0)
            return
    }

    public boolean isBottomInsetScrimEnabled() {
            r1 = this;
            boolean r0 = r1.bottomInsetScrimEnabled
            return r0
    }

    public boolean isTopInsetScrimEnabled() {
            r1 = this;
            boolean r0 = r1.topInsetScrimEnabled
            return r0
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r0 = this;
            super.onAttachedToWindow()
            com.google.android.material.shape.MaterialShapeUtils.setParentAbsoluteElevation(r0)
            return
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r2 = this;
            super.onDetachedFromWindow()
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r2.onGlobalLayoutListener
            r0.removeOnGlobalLayoutListener(r1)
            return
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public final void onInsetsChanged(@androidx.annotation.NonNull androidx.core.view.WindowInsetsCompat r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.dispatchApplyWindowInsets(r2)
            return
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int r4, int r5) {
            r3 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L14
            if (r0 == 0) goto Ld
            goto L22
        Ld:
            int r4 = r3.maxWidth
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            goto L22
        L14:
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            int r0 = r3.maxWidth
            int r4 = java.lang.Math.min(r4, r0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
        L22:
            super.onMeasure(r4, r5)
            return
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.material.navigation.NavigationView.SavedState
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            com.google.android.material.navigation.NavigationView$SavedState r2 = (com.google.android.material.navigation.NavigationView.SavedState) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            com.google.android.material.internal.NavigationMenu r0 = r1.menu
            android.os.Bundle r2 = r2.menuState
            r0.restorePresenterStates(r2)
            return
    }

    @Override // android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
            r3 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            com.google.android.material.navigation.NavigationView$SavedState r1 = new com.google.android.material.navigation.NavigationView$SavedState
            r1.<init>(r0)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.menuState = r0
            com.google.android.material.internal.NavigationMenu r2 = r3.menu
            r2.savePresenterStates(r0)
            return r1
    }

    @Override // android.view.View
    public final void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            r0.maybeUpdateCornerSizeForDrawerLayout(r1, r2)
            return
    }

    public void removeHeaderView(@androidx.annotation.NonNull android.view.View r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.removeHeaderView(r2)
            return
    }

    public void setBottomInsetScrimEnabled(boolean r1) {
            r0 = this;
            r0.bottomInsetScrimEnabled = r1
            return
    }

    public void setCheckedItem(@androidx.annotation.IdRes int r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenu r0 = r1.menu
            android.view.MenuItem r2 = r0.findItem(r2)
            if (r2 == 0) goto Lf
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            androidx.appcompat.view.menu.MenuItemImpl r2 = (androidx.appcompat.view.menu.MenuItemImpl) r2
            r0.setCheckedItem(r2)
        Lf:
            return
    }

    public void setCheckedItem(@androidx.annotation.NonNull android.view.MenuItem r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenu r0 = r1.menu
            int r2 = r2.getItemId()
            android.view.MenuItem r2 = r0.findItem(r2)
            if (r2 == 0) goto L14
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            androidx.appcompat.view.menu.MenuItemImpl r2 = (androidx.appcompat.view.menu.MenuItemImpl) r2
            r0.setCheckedItem(r2)
            return
        L14:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Called setCheckedItem(MenuItem) with an item that is not in the current menu."
            r2.<init>(r0)
            throw r2
    }

    public void setDividerInsetEnd(@androidx.annotation.Px int r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.setDividerInsetEnd(r2)
            return
    }

    public void setDividerInsetStart(@androidx.annotation.Px int r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.setDividerInsetStart(r2)
            return
    }

    @Override // android.view.View
    public void setElevation(float r1) {
            r0 = this;
            super.setElevation(r1)
            com.google.android.material.shape.MaterialShapeUtils.setElevation(r0, r1)
            return
    }

    public void setItemBackground(@androidx.annotation.Nullable android.graphics.drawable.Drawable r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.setItemBackground(r2)
            return
    }

    public void setItemBackgroundResource(@androidx.annotation.DrawableRes int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = androidx.core.content.ContextCompat.getDrawable(r0, r2)
            r1.setItemBackground(r2)
            return
    }

    public void setItemHorizontalPadding(@androidx.annotation.Dimension int r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.setItemHorizontalPadding(r2)
            return
    }

    public void setItemHorizontalPaddingResource(@androidx.annotation.DimenRes int r3) {
            r2 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r2.presenter
            android.content.res.Resources r1 = r2.getResources()
            int r3 = r1.getDimensionPixelSize(r3)
            r0.setItemHorizontalPadding(r3)
            return
    }

    public void setItemIconPadding(@androidx.annotation.Dimension int r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.setItemIconPadding(r2)
            return
    }

    public void setItemIconPaddingResource(int r3) {
            r2 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r2.presenter
            android.content.res.Resources r1 = r2.getResources()
            int r3 = r1.getDimensionPixelSize(r3)
            r0.setItemIconPadding(r3)
            return
    }

    public void setItemIconSize(@androidx.annotation.Dimension int r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.setItemIconSize(r2)
            return
    }

    public void setItemIconTintList(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.setItemIconTintList(r2)
            return
    }

    public void setItemMaxLines(int r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.setItemMaxLines(r2)
            return
    }

    public void setItemTextAppearance(@androidx.annotation.StyleRes int r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.setItemTextAppearance(r2)
            return
    }

    public void setItemTextColor(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.setItemTextColor(r2)
            return
    }

    public void setItemVerticalPadding(@androidx.annotation.Px int r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.setItemVerticalPadding(r2)
            return
    }

    public void setItemVerticalPaddingResource(@androidx.annotation.DimenRes int r3) {
            r2 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r2.presenter
            android.content.res.Resources r1 = r2.getResources()
            int r3 = r1.getDimensionPixelSize(r3)
            r0.setItemVerticalPadding(r3)
            return
    }

    public void setNavigationItemSelectedListener(@androidx.annotation.Nullable com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener r1) {
            r0 = this;
            r0.listener = r1
            return
    }

    @Override // android.view.View
    public void setOverScrollMode(int r2) {
            r1 = this;
            super.setOverScrollMode(r2)
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            if (r0 == 0) goto La
            r0.setOverScrollMode(r2)
        La:
            return
    }

    public void setSubheaderInsetEnd(@androidx.annotation.Px int r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.setSubheaderInsetEnd(r2)
            return
    }

    public void setSubheaderInsetStart(@androidx.annotation.Px int r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.setSubheaderInsetStart(r2)
            return
    }

    public void setTopInsetScrimEnabled(boolean r1) {
            r0 = this;
            r0.topInsetScrimEnabled = r1
            return
    }
}
