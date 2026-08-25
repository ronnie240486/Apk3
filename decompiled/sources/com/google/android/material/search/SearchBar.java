package com.google.android.material.search;

/* JADX INFO: loaded from: classes2.dex */
public class SearchBar extends androidx.appcompat.widget.Toolbar {
    private static final int DEFAULT_SCROLL_FLAGS = 53;
    private static final int DEF_STYLE_RES = 0;
    private static final java.lang.String NAMESPACE_APP = "http://schemas.android.com/apk/res-auto";

    @androidx.annotation.Nullable
    private final android.view.accessibility.AccessibilityManager accessibilityManager;
    private com.google.android.material.shape.MaterialShapeDrawable backgroundShape;

    @androidx.annotation.Nullable
    private android.view.View centerView;
    private final boolean defaultMarginsEnabled;
    private final android.graphics.drawable.Drawable defaultNavigationIcon;
    private boolean defaultScrollFlagsEnabled;
    private final boolean forceDefaultNavigationOnClickListener;
    private final boolean layoutInflated;
    private int menuResId;

    @androidx.annotation.Nullable
    private java.lang.Integer navigationIconTint;

    @androidx.annotation.Nullable
    private android.graphics.drawable.Drawable originalNavigationIconBackground;
    private final com.google.android.material.search.SearchBarAnimationHelper searchBarAnimationHelper;
    private final android.widget.TextView textView;
    private final boolean tintNavigationIcon;
    private final androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener;


    public static abstract class OnLoadAnimationCallback {
        public OnLoadAnimationCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onAnimationEnd() {
                r0 = this;
                return
        }

        public void onAnimationStart() {
                r0 = this;
                return
        }
    }

    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<com.google.android.material.search.SearchBar.SavedState> CREATOR = null;
        public java.lang.String text;


        static {
                com.google.android.material.search.SearchBar$SavedState$1 r0 = new com.google.android.material.search.SearchBar$SavedState$1
                r0.<init>()
                com.google.android.material.search.SearchBar.SavedState.CREATOR = r0
                return
        }

        public SavedState(android.os.Parcel r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        public SavedState(android.os.Parcel r1, @androidx.annotation.Nullable java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                java.lang.String r1 = r1.readString()
                r0.text = r1
                return
        }

        public SavedState(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                java.lang.String r2 = r0.text
                r1.writeString(r2)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class ScrollingViewBehavior extends com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior {
        private boolean initialized;

        public ScrollingViewBehavior() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.initialized = r0
                return
        }

        public ScrollingViewBehavior(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.initialized = r1
                return
        }

        private void setAppBarLayoutTransparent(com.google.android.material.appbar.AppBarLayout r3) {
                r2 = this;
                r0 = 0
                r3.setBackgroundColor(r0)
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 21
                if (r0 != r1) goto Lf
                r0 = 0
                r3.setOutlineProvider(r0)
                goto L13
            Lf:
                r0 = 0
                r3.setTargetElevation(r0)
            L13:
                return
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onDependentViewChanged(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull android.view.View r3) {
                r0 = this;
                boolean r1 = super.onDependentViewChanged(r1, r2, r3)
                boolean r2 = r0.initialized
                if (r2 != 0) goto L14
                boolean r2 = r3 instanceof com.google.android.material.appbar.AppBarLayout
                if (r2 == 0) goto L14
                r2 = 1
                r0.initialized = r2
                com.google.android.material.appbar.AppBarLayout r3 = (com.google.android.material.appbar.AppBarLayout) r3
                r0.setAppBarLayoutTransparent(r3)
            L14:
                return r1
        }
    }

    public static /* synthetic */ void $r8$lambda$5c5I5ljcFX0E60cUbkIqa0sWZAQ(com.google.android.material.search.SearchBar r0, boolean r1) {
            r0.lambda$new$0(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$p6NzKwwbHQfO9F5th06TOlM6qLs(com.google.android.material.search.SearchBar r0) {
            r0.lambda$startOnLoadAnimation$1()
            return
    }

    static {
            int r0 = com.google.android.material.R.style.Widget_Material3_SearchBar
            com.google.android.material.search.SearchBar.DEF_STYLE_RES = r0
            return
    }

    public SearchBar(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SearchBar(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.R.attr.materialSearchBarStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public SearchBar(@androidx.annotation.NonNull android.content.Context r10, @androidx.annotation.Nullable android.util.AttributeSet r11, int r12) {
            r9 = this;
            int r6 = com.google.android.material.search.SearchBar.DEF_STYLE_RES
            android.content.Context r10 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r10, r11, r12, r6)
            r9.<init>(r10, r11, r12)
            r10 = -1
            r9.menuResId = r10
            com.google.android.material.search.SearchBar$$ExternalSyntheticLambda0 r0 = new com.google.android.material.search.SearchBar$$ExternalSyntheticLambda0
            r0.<init>(r9)
            r9.touchExplorationStateChangeListener = r0
            android.content.Context r7 = r9.getContext()
            r9.validateAttributes(r11)
            int r0 = com.google.android.material.R.drawable.ic_search_black_24
            android.graphics.drawable.Drawable r0 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r7, r0)
            r9.defaultNavigationIcon = r0
            com.google.android.material.search.SearchBarAnimationHelper r0 = new com.google.android.material.search.SearchBarAnimationHelper
            r0.<init>()
            r9.searchBarAnimationHelper = r0
            int[] r2 = com.google.android.material.R.styleable.SearchBar
            r8 = 0
            int[] r5 = new int[r8]
            r0 = r7
            r1 = r11
            r3 = r12
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r11 = com.google.android.material.shape.ShapeAppearanceModel.builder(r7, r11, r12, r6)
            com.google.android.material.shape.ShapeAppearanceModel r11 = r11.build()
            int r12 = com.google.android.material.R.styleable.SearchBar_elevation
            r1 = 0
            float r12 = r0.getDimension(r12, r1)
            int r1 = com.google.android.material.R.styleable.SearchBar_defaultMarginsEnabled
            r2 = 1
            boolean r1 = r0.getBoolean(r1, r2)
            r9.defaultMarginsEnabled = r1
            int r1 = com.google.android.material.R.styleable.SearchBar_defaultScrollFlagsEnabled
            boolean r1 = r0.getBoolean(r1, r2)
            r9.defaultScrollFlagsEnabled = r1
            int r1 = com.google.android.material.R.styleable.SearchBar_hideNavigationIcon
            boolean r1 = r0.getBoolean(r1, r8)
            int r3 = com.google.android.material.R.styleable.SearchBar_forceDefaultNavigationOnClickListener
            boolean r3 = r0.getBoolean(r3, r8)
            r9.forceDefaultNavigationOnClickListener = r3
            int r3 = com.google.android.material.R.styleable.SearchBar_tintNavigationIcon
            boolean r3 = r0.getBoolean(r3, r2)
            r9.tintNavigationIcon = r3
            int r3 = com.google.android.material.R.styleable.SearchBar_navigationIconTint
            boolean r4 = r0.hasValue(r3)
            if (r4 == 0) goto L7e
            int r3 = r0.getColor(r3, r10)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r9.navigationIconTint = r3
        L7e:
            int r3 = com.google.android.material.R.styleable.SearchBar_android_textAppearance
            int r10 = r0.getResourceId(r3, r10)
            int r3 = com.google.android.material.R.styleable.SearchBar_android_text
            java.lang.String r3 = r0.getString(r3)
            int r4 = com.google.android.material.R.styleable.SearchBar_android_hint
            java.lang.String r4 = r0.getString(r4)
            int r5 = com.google.android.material.R.styleable.SearchBar_strokeWidth
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r5 = r0.getDimension(r5, r6)
            int r6 = com.google.android.material.R.styleable.SearchBar_strokeColor
            int r6 = r0.getColor(r6, r8)
            r0.recycle()
            if (r1 != 0) goto La6
            r9.initNavigationIcon()
        La6:
            r9.setClickable(r2)
            r9.setFocusable(r2)
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r7)
            int r1 = com.google.android.material.R.layout.mtrl_search_bar
            r0.inflate(r1, r9)
            r9.layoutInflated = r2
            int r0 = com.google.android.material.R.id.search_bar_text_view
            android.view.View r0 = r9.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r9.textView = r0
            androidx.core.view.ViewCompat.setElevation(r9, r12)
            r9.initTextView(r10, r3, r4)
            r9.initBackground(r11, r12, r5, r6)
            android.content.Context r10 = r9.getContext()
            java.lang.String r11 = "accessibility"
            java.lang.Object r10 = r10.getSystemService(r11)
            android.view.accessibility.AccessibilityManager r10 = (android.view.accessibility.AccessibilityManager) r10
            r9.accessibilityManager = r10
            r9.setupTouchExplorationStateChangeListener()
            return
    }

    public static /* synthetic */ android.view.accessibility.AccessibilityManager access$000(com.google.android.material.search.SearchBar r0) {
            android.view.accessibility.AccessibilityManager r0 = r0.accessibilityManager
            return r0
    }

    public static /* synthetic */ androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener access$100(com.google.android.material.search.SearchBar r0) {
            androidx.core.view.accessibility.AccessibilityManagerCompat$TouchExplorationStateChangeListener r0 = r0.touchExplorationStateChangeListener
            return r0
    }

    private int defaultIfZero(int r1, int r2) {
            r0 = this;
            if (r1 != 0) goto L3
            r1 = r2
        L3:
            return r1
    }

    private android.content.res.ColorStateList getCompatBackgroundColorStateList(@androidx.annotation.ColorInt int r7, @androidx.annotation.ColorInt int r8) {
            r6 = this;
            r0 = 3
            int[][] r1 = new int[r0][]
            r2 = 1
            int[] r3 = new int[r2]
            r4 = 16842919(0x10100a7, float:2.3694026E-38)
            r5 = 0
            r3[r5] = r4
            r1[r5] = r3
            int[] r3 = new int[r2]
            r4 = 16842908(0x101009c, float:2.3693995E-38)
            r3[r5] = r4
            r1[r2] = r3
            int[] r3 = new int[r5]
            r4 = 2
            r1[r4] = r3
            int r8 = com.google.android.material.color.MaterialColors.layer(r7, r8)
            int[] r0 = new int[r0]
            r0[r5] = r8
            r0[r2] = r8
            r0[r4] = r7
            android.content.res.ColorStateList r7 = new android.content.res.ColorStateList
            r7.<init>(r1, r0)
            return r7
    }

    private void initBackground(com.google.android.material.shape.ShapeAppearanceModel r2, float r3, float r4, @androidx.annotation.ColorInt int r5) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = new com.google.android.material.shape.MaterialShapeDrawable
            r0.<init>(r2)
            r1.backgroundShape = r0
            android.content.Context r2 = r1.getContext()
            r0.initializeElevationOverlay(r2)
            com.google.android.material.shape.MaterialShapeDrawable r2 = r1.backgroundShape
            r2.setElevation(r3)
            r2 = 0
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 < 0) goto L1d
            com.google.android.material.shape.MaterialShapeDrawable r2 = r1.backgroundShape
            r2.setStroke(r4, r5)
        L1d:
            int r2 = com.google.android.material.R.attr.colorSurface
            int r2 = com.google.android.material.color.MaterialColors.getColor(r1, r2)
            int r3 = com.google.android.material.R.attr.colorControlHighlight
            int r3 = com.google.android.material.color.MaterialColors.getColor(r1, r3)
            com.google.android.material.shape.MaterialShapeDrawable r4 = r1.backgroundShape
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r4.setFillColor(r2)
            android.graphics.drawable.RippleDrawable r2 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r3 = android.content.res.ColorStateList.valueOf(r3)
            com.google.android.material.shape.MaterialShapeDrawable r4 = r1.backgroundShape
            r2.<init>(r3, r4, r4)
            androidx.core.view.ViewCompat.setBackground(r1, r2)
            return
    }

    private void initNavigationIcon() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.getNavigationIcon()
            if (r0 != 0) goto L9
            android.graphics.drawable.Drawable r0 = r1.defaultNavigationIcon
            goto Ld
        L9:
            android.graphics.drawable.Drawable r0 = r1.getNavigationIcon()
        Ld:
            r1.setNavigationIcon(r0)
            r0 = 1
            r1.setNavigationIconDecorative(r0)
            return
    }

    private void initTextView(@androidx.annotation.StyleRes int r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            r0 = -1
            if (r2 == r0) goto L8
            android.widget.TextView r0 = r1.textView
            androidx.core.widget.TextViewCompat.setTextAppearance(r0, r2)
        L8:
            r1.setText(r3)
            r1.setHint(r4)
            android.graphics.drawable.Drawable r2 = r1.getNavigationIcon()
            if (r2 != 0) goto L29
            android.widget.TextView r2 = r1.textView
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            android.content.res.Resources r3 = r1.getResources()
            int r4 = com.google.android.material.R.dimen.m3_searchbar_text_margin_start_no_navigation_icon
            int r3 = r3.getDimensionPixelSize(r4)
            androidx.core.view.MarginLayoutParamsCompat.setMarginStart(r2, r3)
        L29:
            return
    }

    private /* synthetic */ void lambda$new$0(boolean r1) {
            r0 = this;
            r0.setFocusableInTouchMode(r1)
            return
    }

    private /* synthetic */ void lambda$startOnLoadAnimation$1() {
            r1 = this;
            com.google.android.material.search.SearchBarAnimationHelper r0 = r1.searchBarAnimationHelper
            r0.startOnLoadAnimation(r1)
            return
    }

    private void layoutCenterView() {
            r9 = this;
            android.view.View r0 = r9.centerView
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = r0.getMeasuredWidth()
            int r1 = r9.getMeasuredWidth()
            int r1 = r1 / 2
            int r2 = r0 / 2
            int r5 = r1 - r2
            int r7 = r5 + r0
            android.view.View r0 = r9.centerView
            int r0 = r0.getMeasuredHeight()
            int r1 = r9.getMeasuredHeight()
            int r1 = r1 / 2
            int r2 = r0 / 2
            int r6 = r1 - r2
            int r8 = r6 + r0
            android.view.View r4 = r9.centerView
            r3 = r9
            r3.layoutChild(r4, r5, r6, r7, r8)
            return
    }

    private void layoutChild(android.view.View r3, int r4, int r5, int r6, int r7) {
            r2 = this;
            int r0 = androidx.core.view.ViewCompat.getLayoutDirection(r2)
            r1 = 1
            if (r0 != r1) goto L15
            int r0 = r2.getMeasuredWidth()
            int r0 = r0 - r6
            int r6 = r2.getMeasuredWidth()
            int r6 = r6 - r4
            r3.layout(r0, r5, r6, r7)
            goto L18
        L15:
            r3.layout(r4, r5, r6, r7)
        L18:
            return
    }

    @androidx.annotation.Nullable
    private android.graphics.drawable.Drawable maybeTintNavigationIcon(@androidx.annotation.Nullable android.graphics.drawable.Drawable r2) {
            r1 = this;
            boolean r0 = r1.tintNavigationIcon
            if (r0 == 0) goto L28
            if (r2 != 0) goto L7
            goto L28
        L7:
            java.lang.Integer r0 = r1.navigationIconTint
            if (r0 == 0) goto L10
            int r0 = r0.intValue()
            goto L1d
        L10:
            android.graphics.drawable.Drawable r0 = r1.defaultNavigationIcon
            if (r2 != r0) goto L17
            int r0 = com.google.android.material.R.attr.colorOnSurfaceVariant
            goto L19
        L17:
            int r0 = com.google.android.material.R.attr.colorOnSurface
        L19:
            int r0 = com.google.android.material.color.MaterialColors.getColor(r1, r0)
        L1d:
            android.graphics.drawable.Drawable r2 = r2.mutate()
            android.graphics.drawable.Drawable r2 = androidx.core.graphics.drawable.DrawableCompat.wrap(r2)
            androidx.core.graphics.drawable.DrawableCompat.setTint(r2, r0)
        L28:
            return r2
    }

    private void measureCenterView(int r2, int r3) {
            r1 = this;
            android.view.View r0 = r1.centerView
            if (r0 == 0) goto L7
            r0.measure(r2, r3)
        L7:
            return
    }

    private void setDefaultMargins() {
            r4 = this;
            boolean r0 = r4.defaultMarginsEnabled
            if (r0 == 0) goto L42
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            boolean r0 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L42
            android.content.res.Resources r0 = r4.getResources()
            int r1 = com.google.android.material.R.dimen.m3_searchbar_margin_horizontal
            int r1 = r0.getDimensionPixelSize(r1)
            int r2 = com.google.android.material.R.dimen.m3_searchbar_margin_vertical
            int r0 = r0.getDimensionPixelSize(r2)
            android.view.ViewGroup$LayoutParams r2 = r4.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r3 = r2.leftMargin
            int r3 = r4.defaultIfZero(r3, r1)
            r2.leftMargin = r3
            int r3 = r2.topMargin
            int r3 = r4.defaultIfZero(r3, r0)
            r2.topMargin = r3
            int r3 = r2.rightMargin
            int r1 = r4.defaultIfZero(r3, r1)
            r2.rightMargin = r1
            int r1 = r2.bottomMargin
            int r0 = r4.defaultIfZero(r1, r0)
            r2.bottomMargin = r0
        L42:
            return
    }

    private void setNavigationIconDecorative(boolean r3) {
            r2 = this;
            android.widget.ImageButton r0 = com.google.android.material.internal.ToolbarUtils.getNavigationIconButton(r2)
            if (r0 != 0) goto L7
            return
        L7:
            r1 = r3 ^ 1
            r0.setClickable(r1)
            r1 = r3 ^ 1
            r0.setFocusable(r1)
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            if (r1 == 0) goto L19
            r2.originalNavigationIconBackground = r1
        L19:
            if (r3 == 0) goto L1d
            r3 = 0
            goto L1f
        L1d:
            android.graphics.drawable.Drawable r3 = r2.originalNavigationIconBackground
        L1f:
            r0.setBackgroundDrawable(r3)
            return
    }

    private void setOrClearDefaultScrollFlags() {
            r3 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            boolean r0 = r0 instanceof com.google.android.material.appbar.AppBarLayout.LayoutParams
            if (r0 == 0) goto L28
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$LayoutParams r0 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r0
            boolean r1 = r3.defaultScrollFlagsEnabled
            r2 = 53
            if (r1 == 0) goto L1e
            int r1 = r0.getScrollFlags()
            if (r1 != 0) goto L28
            r0.setScrollFlags(r2)
            goto L28
        L1e:
            int r1 = r0.getScrollFlags()
            if (r1 != r2) goto L28
            r1 = 0
            r0.setScrollFlags(r1)
        L28:
            return
    }

    private void setupTouchExplorationStateChangeListener() {
            r1 = this;
            android.view.accessibility.AccessibilityManager r0 = r1.accessibilityManager
            if (r0 == 0) goto L1e
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L16
            android.view.accessibility.AccessibilityManager r0 = r1.accessibilityManager
            boolean r0 = r0.isTouchExplorationEnabled()
            if (r0 == 0) goto L16
            r0 = 1
            r1.setFocusableInTouchMode(r0)
        L16:
            com.google.android.material.search.SearchBar$1 r0 = new com.google.android.material.search.SearchBar$1
            r0.<init>(r1)
            r1.addOnAttachStateChangeListener(r0)
        L1e:
            return
    }

    private void validateAttributes(@androidx.annotation.Nullable android.util.AttributeSet r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            java.lang.String r0 = "http://schemas.android.com/apk/res-auto"
            java.lang.String r1 = "title"
            java.lang.String r1 = r3.getAttributeValue(r0, r1)
            if (r1 != 0) goto L20
            java.lang.String r1 = "subtitle"
            java.lang.String r3 = r3.getAttributeValue(r0, r1)
            if (r3 != 0) goto L18
            return
        L18:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "SearchBar does not support subtitle. Use hint or text instead."
            r3.<init>(r0)
            throw r3
        L20:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "SearchBar does not support title. Use hint or text instead."
            r3.<init>(r0)
            throw r3
    }

    public void addCollapseAnimationListener(@androidx.annotation.NonNull android.animation.AnimatorListenerAdapter r2) {
            r1 = this;
            com.google.android.material.search.SearchBarAnimationHelper r0 = r1.searchBarAnimationHelper
            r0.addCollapseAnimationListener(r2)
            return
    }

    public void addExpandAnimationListener(@androidx.annotation.NonNull android.animation.AnimatorListenerAdapter r2) {
            r1 = this;
            com.google.android.material.search.SearchBarAnimationHelper r0 = r1.searchBarAnimationHelper
            r0.addExpandAnimationListener(r2)
            return
    }

    public void addOnLoadAnimationCallback(@androidx.annotation.NonNull com.google.android.material.search.SearchBar.OnLoadAnimationCallback r2) {
            r1 = this;
            com.google.android.material.search.SearchBarAnimationHelper r0 = r1.searchBarAnimationHelper
            r0.addOnLoadAnimationCallback(r2)
            return
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View r2, int r3, android.view.ViewGroup.LayoutParams r4) {
            r1 = this;
            boolean r0 = r1.layoutInflated
            if (r0 == 0) goto L12
            android.view.View r0 = r1.centerView
            if (r0 != 0) goto L12
            boolean r0 = r2 instanceof androidx.appcompat.widget.ActionMenuView
            if (r0 != 0) goto L12
            r1.centerView = r2
            r0 = 0
            r2.setAlpha(r0)
        L12:
            super.addView(r2, r3, r4)
            return
    }

    public void clearText() {
            r2 = this;
            android.widget.TextView r0 = r2.textView
            java.lang.String r1 = ""
            r0.setText(r1)
            return
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean collapse(@androidx.annotation.NonNull android.view.View r2) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.collapse(r2, r0)
            return r2
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean collapse(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.Nullable com.google.android.material.appbar.AppBarLayout r3) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.collapse(r2, r3, r0)
            return r2
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean collapse(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.Nullable com.google.android.material.appbar.AppBarLayout r3, boolean r4) {
            r1 = this;
            int r0 = r2.getVisibility()
            if (r0 != 0) goto Lc
            boolean r0 = r1.isCollapsing()
            if (r0 == 0) goto L12
        Lc:
            boolean r0 = r1.isExpanding()
            if (r0 == 0) goto L19
        L12:
            com.google.android.material.search.SearchBarAnimationHelper r0 = r1.searchBarAnimationHelper
            r0.startCollapseAnimation(r1, r2, r3, r4)
            r2 = 1
            return r2
        L19:
            r2 = 0
            return r2
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean expand(@androidx.annotation.NonNull android.view.View r2) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.expand(r2, r0)
            return r2
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean expand(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.Nullable com.google.android.material.appbar.AppBarLayout r3) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.expand(r2, r3, r0)
            return r2
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean expand(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.Nullable com.google.android.material.appbar.AppBarLayout r3, boolean r4) {
            r1 = this;
            int r0 = r2.getVisibility()
            if (r0 == 0) goto Lc
            boolean r0 = r1.isExpanding()
            if (r0 == 0) goto L12
        Lc:
            boolean r0 = r1.isCollapsing()
            if (r0 == 0) goto L19
        L12:
            com.google.android.material.search.SearchBarAnimationHelper r0 = r1.searchBarAnimationHelper
            r0.startExpandAnimation(r1, r2, r3, r4)
            r2 = 1
            return r2
        L19:
            r2 = 0
            return r2
    }

    @androidx.annotation.Nullable
    public android.view.View getCenterView() {
            r1 = this;
            android.view.View r0 = r1.centerView
            return r0
    }

    public float getCompatElevation() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.backgroundShape
            if (r0 == 0) goto L9
            float r0 = r0.getElevation()
            goto Ld
        L9:
            float r0 = androidx.core.view.ViewCompat.getElevation(r1)
        Ld:
            return r0
    }

    public float getCornerSize() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.backgroundShape
            float r0 = r0.getTopLeftCornerResolvedSize()
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.CharSequence getHint() {
            r1 = this;
            android.widget.TextView r0 = r1.textView
            java.lang.CharSequence r0 = r0.getHint()
            return r0
    }

    public int getMenuResId() {
            r1 = this;
            int r0 = r1.menuResId
            return r0
    }

    @androidx.annotation.ColorInt
    public int getStrokeColor() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.backgroundShape
            android.content.res.ColorStateList r0 = r0.getStrokeColor()
            int r0 = r0.getDefaultColor()
            return r0
    }

    @androidx.annotation.Dimension
    public float getStrokeWidth() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.backgroundShape
            float r0 = r0.getStrokeWidth()
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.CharSequence getText() {
            r1 = this;
            android.widget.TextView r0 = r1.textView
            java.lang.CharSequence r0 = r0.getText()
            return r0
    }

    @androidx.annotation.NonNull
    public android.widget.TextView getTextView() {
            r1 = this;
            android.widget.TextView r0 = r1.textView
            return r0
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void inflateMenu(@androidx.annotation.MenuRes int r1) {
            r0 = this;
            super.inflateMenu(r1)
            r0.menuResId = r1
            return
    }

    public boolean isCollapsing() {
            r1 = this;
            com.google.android.material.search.SearchBarAnimationHelper r0 = r1.searchBarAnimationHelper
            boolean r0 = r0.isCollapsing()
            return r0
    }

    public boolean isDefaultScrollFlagsEnabled() {
            r1 = this;
            boolean r0 = r1.defaultScrollFlagsEnabled
            return r0
    }

    public boolean isExpanding() {
            r1 = this;
            com.google.android.material.search.SearchBarAnimationHelper r0 = r1.searchBarAnimationHelper
            boolean r0 = r0.isExpanding()
            return r0
    }

    public boolean isOnLoadAnimationFadeInEnabled() {
            r1 = this;
            com.google.android.material.search.SearchBarAnimationHelper r0 = r1.searchBarAnimationHelper
            boolean r0 = r0.isOnLoadAnimationFadeInEnabled()
            return r0
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.backgroundShape
            com.google.android.material.shape.MaterialShapeUtils.setParentAbsoluteElevation(r1, r0)
            r1.setDefaultMargins()
            r1.setOrClearDefaultScrollFlags()
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r5) {
            r4 = this;
            super.onInitializeAccessibilityNodeInfo(r5)
            java.lang.Class<android.widget.EditText> r0 = android.widget.EditText.class
            java.lang.String r0 = r0.getCanonicalName()
            r5.setClassName(r0)
            java.lang.CharSequence r0 = r4.getText()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r2 < r3) goto L24
            java.lang.CharSequence r2 = r4.getHint()
            r5.setHintText(r2)
            r5.setShowingHintText(r1)
        L24:
            if (r1 == 0) goto L2a
            java.lang.CharSequence r0 = r4.getHint()
        L2a:
            r5.setText(r0)
            return
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            r0.layoutCenterView()
            return
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onMeasure(int r1, int r2) {
            r0 = this;
            super.onMeasure(r1, r2)
            r0.measureCenterView(r1, r2)
            return
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.material.search.SearchBar.SavedState
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            com.google.android.material.search.SearchBar$SavedState r2 = (com.google.android.material.search.SearchBar.SavedState) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            java.lang.String r2 = r2.text
            r1.setText(r2)
            return
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    @androidx.annotation.NonNull
    public final android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            com.google.android.material.search.SearchBar$SavedState r0 = new com.google.android.material.search.SearchBar$SavedState
            android.os.Parcelable r1 = super.onSaveInstanceState()
            r0.<init>(r1)
            java.lang.CharSequence r1 = r2.getText()
            if (r1 != 0) goto L11
            r1 = 0
            goto L15
        L11:
            java.lang.String r1 = r1.toString()
        L15:
            r0.text = r1
            return r0
    }

    public boolean removeCollapseAnimationListener(@androidx.annotation.NonNull android.animation.AnimatorListenerAdapter r2) {
            r1 = this;
            com.google.android.material.search.SearchBarAnimationHelper r0 = r1.searchBarAnimationHelper
            boolean r2 = r0.removeCollapseAnimationListener(r2)
            return r2
    }

    public boolean removeExpandAnimationListener(@androidx.annotation.NonNull android.animation.AnimatorListenerAdapter r2) {
            r1 = this;
            com.google.android.material.search.SearchBarAnimationHelper r0 = r1.searchBarAnimationHelper
            boolean r2 = r0.removeExpandAnimationListener(r2)
            return r2
    }

    public boolean removeOnLoadAnimationCallback(@androidx.annotation.NonNull com.google.android.material.search.SearchBar.OnLoadAnimationCallback r2) {
            r1 = this;
            com.google.android.material.search.SearchBarAnimationHelper r0 = r1.searchBarAnimationHelper
            boolean r2 = r0.removeOnLoadAnimationCallback(r2)
            return r2
    }

    public void setCenterView(@androidx.annotation.Nullable android.view.View r2) {
            r1 = this;
            android.view.View r0 = r1.centerView
            if (r0 == 0) goto La
            r1.removeView(r0)
            r0 = 0
            r1.centerView = r0
        La:
            if (r2 == 0) goto Lf
            r1.addView(r2)
        Lf:
            return
    }

    public void setDefaultScrollFlagsEnabled(boolean r1) {
            r0 = this;
            r0.defaultScrollFlagsEnabled = r1
            r0.setOrClearDefaultScrollFlags()
            return
    }

    @Override // android.view.View
    @androidx.annotation.RequiresApi(21)
    public void setElevation(float r2) {
            r1 = this;
            super.setElevation(r2)
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.backgroundShape
            if (r0 == 0) goto La
            r0.setElevation(r2)
        La:
            return
    }

    public void setHint(@androidx.annotation.StringRes int r2) {
            r1 = this;
            android.widget.TextView r0 = r1.textView
            r0.setHint(r2)
            return
    }

    public void setHint(@androidx.annotation.Nullable java.lang.CharSequence r2) {
            r1 = this;
            android.widget.TextView r0 = r1.textView
            r0.setHint(r2)
            return
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            android.graphics.drawable.Drawable r1 = r0.maybeTintNavigationIcon(r1)
            super.setNavigationIcon(r1)
            return
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(android.view.View.OnClickListener r2) {
            r1 = this;
            boolean r0 = r1.forceDefaultNavigationOnClickListener
            if (r0 == 0) goto L5
            return
        L5:
            super.setNavigationOnClickListener(r2)
            if (r2 != 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            r1.setNavigationIconDecorative(r2)
            return
    }

    public void setOnLoadAnimationFadeInEnabled(boolean r2) {
            r1 = this;
            com.google.android.material.search.SearchBarAnimationHelper r0 = r1.searchBarAnimationHelper
            r0.setOnLoadAnimationFadeInEnabled(r2)
            return
    }

    public void setStrokeColor(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            int r0 = r1.getStrokeColor()
            if (r0 == r2) goto Lf
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.backgroundShape
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r0.setStrokeColor(r2)
        Lf:
            return
    }

    public void setStrokeWidth(@androidx.annotation.Dimension float r2) {
            r1 = this;
            float r0 = r1.getStrokeWidth()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Ld
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.backgroundShape
            r0.setStrokeWidth(r2)
        Ld:
            return
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(java.lang.CharSequence r1) {
            r0 = this;
            return
    }

    public void setText(@androidx.annotation.StringRes int r2) {
            r1 = this;
            android.widget.TextView r0 = r1.textView
            r0.setText(r2)
            return
    }

    public void setText(@androidx.annotation.Nullable java.lang.CharSequence r2) {
            r1 = this;
            android.widget.TextView r0 = r1.textView
            r0.setText(r2)
            return
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(java.lang.CharSequence r1) {
            r0 = this;
            return
    }

    public void startOnLoadAnimation() {
            r2 = this;
            com.google.android.material.search.SearchBar$$ExternalSyntheticLambda1 r0 = new com.google.android.material.search.SearchBar$$ExternalSyntheticLambda1
            r1 = 0
            r0.<init>(r2, r1)
            r2.post(r0)
            return
    }

    public void stopOnLoadAnimation() {
            r1 = this;
            com.google.android.material.search.SearchBarAnimationHelper r0 = r1.searchBarAnimationHelper
            r0.stopOnLoadAnimation(r1)
            return
    }
}
