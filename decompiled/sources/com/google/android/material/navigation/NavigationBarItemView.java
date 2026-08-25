package com.google.android.material.navigation;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public abstract class NavigationBarItemView extends android.widget.FrameLayout implements androidx.appcompat.view.menu.MenuView.ItemView {
    private static final com.google.android.material.navigation.NavigationBarItemView.ActiveIndicatorTransform ACTIVE_INDICATOR_LABELED_TRANSFORM = null;
    private static final com.google.android.material.navigation.NavigationBarItemView.ActiveIndicatorTransform ACTIVE_INDICATOR_UNLABELED_TRANSFORM = null;
    private static final int[] CHECKED_STATE_SET = null;
    private static final int INVALID_ITEM_POSITION = -1;
    private android.animation.ValueAnimator activeIndicatorAnimator;
    private int activeIndicatorDesiredHeight;
    private int activeIndicatorDesiredWidth;
    private boolean activeIndicatorEnabled;
    private int activeIndicatorMarginHorizontal;
    private float activeIndicatorProgress;
    private boolean activeIndicatorResizeable;
    private com.google.android.material.navigation.NavigationBarItemView.ActiveIndicatorTransform activeIndicatorTransform;

    @androidx.annotation.Nullable
    private final android.view.View activeIndicatorView;

    @androidx.annotation.Nullable
    private com.google.android.material.badge.BadgeDrawable badgeDrawable;
    private final android.widget.ImageView icon;

    @androidx.annotation.Nullable
    private final android.widget.FrameLayout iconContainer;

    @androidx.annotation.Nullable
    private android.content.res.ColorStateList iconTint;
    private boolean initialized;
    private boolean isShifting;

    @androidx.annotation.Nullable
    public android.graphics.drawable.Drawable itemBackground;

    @androidx.annotation.Nullable
    private androidx.appcompat.view.menu.MenuItemImpl itemData;
    private int itemPaddingBottom;
    private int itemPaddingTop;
    private int itemPosition;
    private android.content.res.ColorStateList itemRippleColor;
    private final android.view.ViewGroup labelGroup;
    private int labelVisibilityMode;
    private final android.widget.TextView largeLabel;

    @androidx.annotation.Nullable
    private android.graphics.drawable.Drawable originalIconDrawable;
    private float scaleDownFactor;
    private float scaleUpFactor;
    private float shiftAmount;
    private final android.widget.TextView smallLabel;

    @androidx.annotation.Nullable
    private android.graphics.drawable.Drawable wrappedIconDrawable;




    public static class ActiveIndicatorTransform {
        private static final float ALPHA_FRACTION = 0.2f;
        private static final float SCALE_X_HIDDEN = 0.4f;
        private static final float SCALE_X_SHOWN = 1.0f;

        private ActiveIndicatorTransform() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ ActiveIndicatorTransform(com.google.android.material.navigation.NavigationBarItemView.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public float calculateScaleY(@androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r1) {
                r0 = this;
                r1 = 1065353216(0x3f800000, float:1.0)
                return r1
        }

        public void updateForProgress(@androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r4, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r5, @androidx.annotation.NonNull android.view.View r6) {
                r3 = this;
                r0 = 1053609165(0x3ecccccd, float:0.4)
                r1 = 1065353216(0x3f800000, float:1.0)
                float r0 = com.google.android.material.animation.AnimationUtils.lerp(r0, r1, r4)
                r6.setScaleX(r0)
                float r0 = r3.calculateScaleY(r4)
                r6.setScaleY(r0)
                r0 = 0
                int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r5 != 0) goto L1c
                r2 = 1061997773(0x3f4ccccd, float:0.8)
                goto L1d
            L1c:
                r2 = 0
            L1d:
                if (r5 != 0) goto L22
                r5 = 1065353216(0x3f800000, float:1.0)
                goto L25
            L22:
                r5 = 1045220557(0x3e4ccccd, float:0.2)
            L25:
                float r4 = com.google.android.material.animation.AnimationUtils.lerp(r0, r1, r2, r5, r4)
                r6.setAlpha(r4)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class ActiveIndicatorUnlabeledTransform extends com.google.android.material.navigation.NavigationBarItemView.ActiveIndicatorTransform {
        private ActiveIndicatorUnlabeledTransform() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        public /* synthetic */ ActiveIndicatorUnlabeledTransform(com.google.android.material.navigation.NavigationBarItemView.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.android.material.navigation.NavigationBarItemView.ActiveIndicatorTransform
        public final float calculateScaleY(float r3) {
                r2 = this;
                r0 = 1053609165(0x3ecccccd, float:0.4)
                r1 = 1065353216(0x3f800000, float:1.0)
                float r3 = com.google.android.material.animation.AnimationUtils.lerp(r0, r1, r3)
                return r3
        }
    }

    static {
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 16842912(0x10100a0, float:2.3694006E-38)
            r0[r1] = r2
            com.google.android.material.navigation.NavigationBarItemView.CHECKED_STATE_SET = r0
            com.google.android.material.navigation.NavigationBarItemView$ActiveIndicatorTransform r0 = new com.google.android.material.navigation.NavigationBarItemView$ActiveIndicatorTransform
            r1 = 0
            r0.<init>(r1)
            com.google.android.material.navigation.NavigationBarItemView.ACTIVE_INDICATOR_LABELED_TRANSFORM = r0
            com.google.android.material.navigation.NavigationBarItemView$ActiveIndicatorUnlabeledTransform r0 = new com.google.android.material.navigation.NavigationBarItemView$ActiveIndicatorUnlabeledTransform
            r0.<init>(r1)
            com.google.android.material.navigation.NavigationBarItemView.ACTIVE_INDICATOR_UNLABELED_TRANSFORM = r0
            return
    }

    public NavigationBarItemView(@androidx.annotation.NonNull android.content.Context r7) {
            r6 = this;
            r6.<init>(r7)
            r0 = 0
            r6.initialized = r0
            r1 = -1
            r6.itemPosition = r1
            com.google.android.material.navigation.NavigationBarItemView$ActiveIndicatorTransform r1 = com.google.android.material.navigation.NavigationBarItemView.ACTIVE_INDICATOR_LABELED_TRANSFORM
            r6.activeIndicatorTransform = r1
            r1 = 0
            r6.activeIndicatorProgress = r1
            r6.activeIndicatorEnabled = r0
            r6.activeIndicatorDesiredWidth = r0
            r6.activeIndicatorDesiredHeight = r0
            r6.activeIndicatorResizeable = r0
            r6.activeIndicatorMarginHorizontal = r0
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = r6.getItemLayoutResId()
            r1 = 1
            r7.inflate(r0, r6, r1)
            int r7 = com.google.android.material.R.id.navigation_bar_item_icon_container
            android.view.View r7 = r6.findViewById(r7)
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
            r6.iconContainer = r7
            int r7 = com.google.android.material.R.id.navigation_bar_item_active_indicator_view
            android.view.View r7 = r6.findViewById(r7)
            r6.activeIndicatorView = r7
            int r7 = com.google.android.material.R.id.navigation_bar_item_icon_view
            android.view.View r7 = r6.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r6.icon = r7
            int r0 = com.google.android.material.R.id.navigation_bar_item_labels_group
            android.view.View r0 = r6.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r6.labelGroup = r0
            int r2 = com.google.android.material.R.id.navigation_bar_item_small_label_view
            android.view.View r2 = r6.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r6.smallLabel = r2
            int r3 = com.google.android.material.R.id.navigation_bar_item_large_label_view
            android.view.View r3 = r6.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r6.largeLabel = r3
            int r4 = r6.getItemBackgroundResId()
            r6.setBackgroundResource(r4)
            android.content.res.Resources r4 = r6.getResources()
            int r5 = r6.getItemDefaultMarginResId()
            int r4 = r4.getDimensionPixelSize(r5)
            r6.itemPaddingTop = r4
            int r0 = r0.getPaddingBottom()
            r6.itemPaddingBottom = r0
            r0 = 2
            androidx.core.view.ViewCompat.setImportantForAccessibility(r2, r0)
            androidx.core.view.ViewCompat.setImportantForAccessibility(r3, r0)
            r6.setFocusable(r1)
            float r0 = r2.getTextSize()
            float r1 = r3.getTextSize()
            r6.calculateTextScaleFactors(r0, r1)
            if (r7 == 0) goto L9a
            com.google.android.material.navigation.NavigationBarItemView$1 r0 = new com.google.android.material.navigation.NavigationBarItemView$1
            r0.<init>(r6)
            r7.addOnLayoutChangeListener(r0)
        L9a:
            return
    }

    public static /* synthetic */ android.widget.ImageView access$200(com.google.android.material.navigation.NavigationBarItemView r0) {
            android.widget.ImageView r0 = r0.icon
            return r0
    }

    public static /* synthetic */ void access$300(com.google.android.material.navigation.NavigationBarItemView r0, android.view.View r1) {
            r0.tryUpdateBadgeBounds(r1)
            return
    }

    public static /* synthetic */ void access$400(com.google.android.material.navigation.NavigationBarItemView r0, int r1) {
            r0.updateActiveIndicatorLayoutParams(r1)
            return
    }

    public static /* synthetic */ void access$500(com.google.android.material.navigation.NavigationBarItemView r0, float r1, float r2) {
            r0.setActiveIndicatorProgress(r1, r2)
            return
    }

    private void calculateTextScaleFactors(float r3, float r4) {
            r2 = this;
            float r0 = r3 - r4
            r2.shiftAmount = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r4 * r0
            float r1 = r1 / r3
            r2.scaleUpFactor = r1
            float r3 = r3 * r0
            float r3 = r3 / r4
            r2.scaleDownFactor = r3
            return
    }

    private static android.graphics.drawable.Drawable createItemBackgroundCompat(@androidx.annotation.NonNull android.content.res.ColorStateList r2) {
            android.content.res.ColorStateList r2 = com.google.android.material.ripple.RippleUtils.convertToRippleDrawableColor(r2)
            android.graphics.drawable.RippleDrawable r0 = new android.graphics.drawable.RippleDrawable
            r1 = 0
            r0.<init>(r2, r1, r1)
            return r0
    }

    @androidx.annotation.Nullable
    private android.widget.FrameLayout getCustomParentForBadge(android.view.View r3) {
            r2 = this;
            android.widget.ImageView r0 = r2.icon
            r1 = 0
            if (r3 != r0) goto L10
            boolean r3 = com.google.android.material.badge.BadgeUtils.USE_COMPAT_PARENT
            if (r3 == 0) goto L10
            android.view.ViewParent r3 = r0.getParent()
            r1 = r3
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
        L10:
            return r1
    }

    private android.view.View getIconOrContainer() {
            r1 = this;
            android.widget.FrameLayout r0 = r1.iconContainer
            if (r0 == 0) goto L5
            goto L7
        L5:
            android.widget.ImageView r0 = r1.icon
        L7:
            return r0
    }

    private int getItemVisiblePosition() {
            r6 = this;
            android.view.ViewParent r0 = r6.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r1 = r0.indexOfChild(r6)
            r2 = 0
            r3 = 0
        Lc:
            if (r2 >= r1) goto L21
            android.view.View r4 = r0.getChildAt(r2)
            boolean r5 = r4 instanceof com.google.android.material.navigation.NavigationBarItemView
            if (r5 == 0) goto L1e
            int r4 = r4.getVisibility()
            if (r4 != 0) goto L1e
            int r3 = r3 + 1
        L1e:
            int r2 = r2 + 1
            goto Lc
        L21:
            return r3
    }

    private int getSuggestedIconHeight() {
            r3 = this;
            com.google.android.material.badge.BadgeDrawable r0 = r3.badgeDrawable
            if (r0 == 0) goto Lb
            int r0 = r0.getMinimumHeight()
            int r0 = r0 / 2
            goto Lc
        Lb:
            r0 = 0
        Lc:
            android.view.View r1 = r3.getIconOrContainer()
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r1 = r1.topMargin
            int r1 = java.lang.Math.max(r0, r1)
            android.widget.ImageView r2 = r3.icon
            int r2 = r2.getMeasuredWidth()
            int r2 = r2 + r1
            int r2 = r2 + r0
            return r2
    }

    private int getSuggestedIconWidth() {
            r4 = this;
            com.google.android.material.badge.BadgeDrawable r0 = r4.badgeDrawable
            if (r0 != 0) goto L6
            r0 = 0
            goto L11
        L6:
            int r0 = r0.getMinimumWidth()
            com.google.android.material.badge.BadgeDrawable r1 = r4.badgeDrawable
            int r1 = r1.getHorizontalOffset()
            int r0 = r0 - r1
        L11:
            android.view.View r1 = r4.getIconOrContainer()
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r2 = r1.leftMargin
            int r2 = java.lang.Math.max(r0, r2)
            android.widget.ImageView r3 = r4.icon
            int r3 = r3.getMeasuredWidth()
            int r3 = r3 + r2
            int r1 = r1.rightMargin
            int r0 = java.lang.Math.max(r0, r1)
            int r0 = r0 + r3
            return r0
    }

    private boolean hasBadge() {
            r1 = this;
            com.google.android.material.badge.BadgeDrawable r0 = r1.badgeDrawable
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    private boolean isActiveIndicatorResizeableAndUnlabeled() {
            r2 = this;
            boolean r0 = r2.activeIndicatorResizeable
            if (r0 == 0) goto Lb
            int r0 = r2.labelVisibilityMode
            r1 = 2
            if (r0 != r1) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    private void maybeAnimateActiveIndicatorToProgress(@androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r5) {
            r4 = this;
            boolean r0 = r4.activeIndicatorEnabled
            if (r0 == 0) goto L63
            boolean r0 = r4.initialized
            if (r0 == 0) goto L63
            boolean r0 = androidx.core.view.ViewCompat.isAttachedToWindow(r4)
            if (r0 != 0) goto Lf
            goto L63
        Lf:
            android.animation.ValueAnimator r0 = r4.activeIndicatorAnimator
            if (r0 == 0) goto L19
            r0.cancel()
            r0 = 0
            r4.activeIndicatorAnimator = r0
        L19:
            r0 = 2
            float[] r0 = new float[r0]
            r1 = 0
            float r2 = r4.activeIndicatorProgress
            r0[r1] = r2
            r1 = 1
            r0[r1] = r5
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            r4.activeIndicatorAnimator = r0
            com.google.android.material.navigation.NavigationBarItemView$3 r1 = new com.google.android.material.navigation.NavigationBarItemView$3
            r1.<init>(r4, r5)
            r0.addUpdateListener(r1)
            android.animation.ValueAnimator r5 = r4.activeIndicatorAnimator
            android.content.Context r0 = r4.getContext()
            int r1 = com.google.android.material.R.attr.motionEasingEmphasizedInterpolator
            android.animation.TimeInterpolator r2 = com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR
            android.animation.TimeInterpolator r0 = com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(r0, r1, r2)
            r5.setInterpolator(r0)
            android.animation.ValueAnimator r5 = r4.activeIndicatorAnimator
            android.content.Context r0 = r4.getContext()
            int r1 = com.google.android.material.R.attr.motionDurationLong2
            android.content.res.Resources r2 = r4.getResources()
            int r3 = com.google.android.material.R.integer.material_motion_duration_long_1
            int r2 = r2.getInteger(r3)
            int r0 = com.google.android.material.motion.MotionUtils.resolveThemeDuration(r0, r1, r2)
            long r0 = (long) r0
            r5.setDuration(r0)
            android.animation.ValueAnimator r5 = r4.activeIndicatorAnimator
            r5.start()
            return
        L63:
            r4.setActiveIndicatorProgress(r5, r5)
            return
    }

    private void refreshChecked() {
            r1 = this;
            androidx.appcompat.view.menu.MenuItemImpl r0 = r1.itemData
            if (r0 == 0) goto Lb
            boolean r0 = r0.isChecked()
            r1.setChecked(r0)
        Lb:
            return
    }

    private void refreshItemBackground() {
            r6 = this;
            android.graphics.drawable.Drawable r0 = r6.itemBackground
            android.content.res.ColorStateList r1 = r6.itemRippleColor
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L32
            android.graphics.drawable.Drawable r1 = r6.getActiveIndicatorDrawable()
            boolean r4 = r6.activeIndicatorEnabled
            if (r4 == 0) goto L2a
            android.graphics.drawable.Drawable r4 = r6.getActiveIndicatorDrawable()
            if (r4 == 0) goto L2a
            android.widget.FrameLayout r4 = r6.iconContainer
            if (r4 == 0) goto L2a
            if (r1 == 0) goto L2a
            r3 = 0
            android.graphics.drawable.RippleDrawable r4 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r5 = r6.itemRippleColor
            android.content.res.ColorStateList r5 = com.google.android.material.ripple.RippleUtils.sanitizeRippleDrawableColor(r5)
            r4.<init>(r5, r2, r1)
            r2 = r4
            goto L32
        L2a:
            if (r0 != 0) goto L32
            android.content.res.ColorStateList r0 = r6.itemRippleColor
            android.graphics.drawable.Drawable r0 = createItemBackgroundCompat(r0)
        L32:
            android.widget.FrameLayout r1 = r6.iconContainer
            if (r1 == 0) goto L39
            androidx.core.view.ViewCompat.setBackground(r1, r2)
        L39:
            androidx.core.view.ViewCompat.setBackground(r6, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L45
            r6.setDefaultFocusHighlightEnabled(r3)
        L45:
            return
    }

    private void setActiveIndicatorProgress(@androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r3, float r4) {
            r2 = this;
            android.view.View r0 = r2.activeIndicatorView
            if (r0 == 0) goto L9
            com.google.android.material.navigation.NavigationBarItemView$ActiveIndicatorTransform r1 = r2.activeIndicatorTransform
            r1.updateForProgress(r3, r4, r0)
        L9:
            r2.activeIndicatorProgress = r3
            return
    }

    private static void setTextAppearanceWithoutFontScaling(android.widget.TextView r2, @androidx.annotation.StyleRes int r3) {
            androidx.core.widget.TextViewCompat.setTextAppearance(r2, r3)
            android.content.Context r0 = r2.getContext()
            r1 = 0
            int r3 = com.google.android.material.resources.MaterialResources.getUnscaledTextSize(r0, r3, r1)
            if (r3 == 0) goto L12
            float r3 = (float) r3
            r2.setTextSize(r1, r3)
        L12:
            return
    }

    private static void setViewScaleValues(@androidx.annotation.NonNull android.view.View r0, float r1, float r2, int r3) {
            r0.setScaleX(r1)
            r0.setScaleY(r2)
            r0.setVisibility(r3)
            return
    }

    private static void setViewTopMarginAndGravity(@androidx.annotation.NonNull android.view.View r1, int r2, int r3) {
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            r0.topMargin = r2
            r0.bottomMargin = r2
            r0.gravity = r3
            r1.setLayoutParams(r0)
            return
    }

    private void tryAttachBadgeToAnchor(@androidx.annotation.Nullable android.view.View r3) {
            r2 = this;
            boolean r0 = r2.hasBadge()
            if (r0 != 0) goto L7
            return
        L7:
            if (r3 == 0) goto L19
            r0 = 0
            r2.setClipChildren(r0)
            r2.setClipToPadding(r0)
            com.google.android.material.badge.BadgeDrawable r0 = r2.badgeDrawable
            android.widget.FrameLayout r1 = r2.getCustomParentForBadge(r3)
            com.google.android.material.badge.BadgeUtils.attachBadgeDrawable(r0, r3, r1)
        L19:
            return
    }

    private void tryRemoveBadgeFromAnchor(@androidx.annotation.Nullable android.view.View r2) {
            r1 = this;
            boolean r0 = r1.hasBadge()
            if (r0 != 0) goto L7
            return
        L7:
            if (r2 == 0) goto L15
            r0 = 1
            r1.setClipChildren(r0)
            r1.setClipToPadding(r0)
            com.google.android.material.badge.BadgeDrawable r0 = r1.badgeDrawable
            com.google.android.material.badge.BadgeUtils.detachBadgeDrawable(r0, r2)
        L15:
            r2 = 0
            r1.badgeDrawable = r2
            return
    }

    private void tryUpdateBadgeBounds(android.view.View r3) {
            r2 = this;
            boolean r0 = r2.hasBadge()
            if (r0 != 0) goto L7
            return
        L7:
            com.google.android.material.badge.BadgeDrawable r0 = r2.badgeDrawable
            android.widget.FrameLayout r1 = r2.getCustomParentForBadge(r3)
            com.google.android.material.badge.BadgeUtils.setBadgeDrawableBounds(r0, r3, r1)
            return
    }

    private void updateActiveIndicatorLayoutParams(int r3) {
            r2 = this;
            android.view.View r0 = r2.activeIndicatorView
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = r2.activeIndicatorDesiredWidth
            int r1 = r2.activeIndicatorMarginHorizontal
            int r1 = r1 * 2
            int r3 = r3 - r1
            int r3 = java.lang.Math.min(r0, r3)
            android.view.View r0 = r2.activeIndicatorView
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            boolean r1 = r2.isActiveIndicatorResizeableAndUnlabeled()
            if (r1 == 0) goto L20
            r1 = r3
            goto L22
        L20:
            int r1 = r2.activeIndicatorDesiredHeight
        L22:
            r0.height = r1
            r0.width = r3
            android.view.View r3 = r2.activeIndicatorView
            r3.setLayoutParams(r0)
            return
    }

    private void updateActiveIndicatorTransform() {
            r1 = this;
            boolean r0 = r1.isActiveIndicatorResizeableAndUnlabeled()
            if (r0 == 0) goto Lb
            com.google.android.material.navigation.NavigationBarItemView$ActiveIndicatorTransform r0 = com.google.android.material.navigation.NavigationBarItemView.ACTIVE_INDICATOR_UNLABELED_TRANSFORM
            r1.activeIndicatorTransform = r0
            goto Lf
        Lb:
            com.google.android.material.navigation.NavigationBarItemView$ActiveIndicatorTransform r0 = com.google.android.material.navigation.NavigationBarItemView.ACTIVE_INDICATOR_LABELED_TRANSFORM
            r1.activeIndicatorTransform = r0
        Lf:
            return
    }

    private static void updateViewPaddingBottom(@androidx.annotation.NonNull android.view.View r3, int r4) {
            int r0 = r3.getPaddingLeft()
            int r1 = r3.getPaddingTop()
            int r2 = r3.getPaddingRight()
            r3.setPadding(r0, r1, r2, r4)
            return
    }

    public final void clear() {
            r1 = this;
            android.widget.ImageView r0 = r1.icon
            r1.tryRemoveBadgeFromAnchor(r0)
            r0 = 0
            r1.itemData = r0
            r0 = 0
            r1.activeIndicatorProgress = r0
            r0 = 0
            r1.initialized = r0
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent r3) {
            r2 = this;
            android.widget.FrameLayout r0 = r2.iconContainer
            if (r0 == 0) goto Lb
            boolean r1 = r2.activeIndicatorEnabled
            if (r1 == 0) goto Lb
            r0.dispatchTouchEvent(r3)
        Lb:
            boolean r3 = super.dispatchTouchEvent(r3)
            return r3
    }

    @androidx.annotation.Nullable
    public android.graphics.drawable.Drawable getActiveIndicatorDrawable() {
            r1 = this;
            android.view.View r0 = r1.activeIndicatorView
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            return r0
    }

    @androidx.annotation.Nullable
    public com.google.android.material.badge.BadgeDrawable getBadge() {
            r1 = this;
            com.google.android.material.badge.BadgeDrawable r0 = r1.badgeDrawable
            return r0
    }

    @androidx.annotation.DrawableRes
    public int getItemBackgroundResId() {
            r1 = this;
            int r0 = com.google.android.material.R.drawable.mtrl_navigation_bar_item_background
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    @androidx.annotation.Nullable
    public androidx.appcompat.view.menu.MenuItemImpl getItemData() {
            r1 = this;
            androidx.appcompat.view.menu.MenuItemImpl r0 = r1.itemData
            return r0
    }

    @androidx.annotation.DimenRes
    public int getItemDefaultMarginResId() {
            r1 = this;
            int r0 = com.google.android.material.R.dimen.mtrl_navigation_bar_item_default_margin
            return r0
    }

    @androidx.annotation.LayoutRes
    public abstract int getItemLayoutResId();

    public int getItemPosition() {
            r1 = this;
            int r0 = r1.itemPosition
            return r0
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
            r3 = this;
            android.view.ViewGroup r0 = r3.labelGroup
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            int r1 = r3.getSuggestedIconHeight()
            int r2 = r0.topMargin
            int r1 = r1 + r2
            android.view.ViewGroup r2 = r3.labelGroup
            int r2 = r2.getMeasuredHeight()
            int r2 = r2 + r1
            int r0 = r0.bottomMargin
            int r2 = r2 + r0
            return r2
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
            r3 = this;
            android.view.ViewGroup r0 = r3.labelGroup
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            int r1 = r0.leftMargin
            android.view.ViewGroup r2 = r3.labelGroup
            int r2 = r2.getMeasuredWidth()
            int r2 = r2 + r1
            int r0 = r0.rightMargin
            int r2 = r2 + r0
            int r0 = r3.getSuggestedIconWidth()
            int r0 = java.lang.Math.max(r0, r2)
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void initialize(@androidx.annotation.NonNull androidx.appcompat.view.menu.MenuItemImpl r3, int r4) {
            r2 = this;
            r2.itemData = r3
            boolean r4 = r3.isCheckable()
            r2.setCheckable(r4)
            boolean r4 = r3.isChecked()
            r2.setChecked(r4)
            boolean r4 = r3.isEnabled()
            r2.setEnabled(r4)
            android.graphics.drawable.Drawable r4 = r3.getIcon()
            r2.setIcon(r4)
            java.lang.CharSequence r4 = r3.getTitle()
            r2.setTitle(r4)
            int r4 = r3.getItemId()
            r2.setId(r4)
            java.lang.CharSequence r4 = r3.getContentDescription()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L3d
            java.lang.CharSequence r4 = r3.getContentDescription()
            r2.setContentDescription(r4)
        L3d:
            java.lang.CharSequence r4 = r3.getTooltipText()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L4c
            java.lang.CharSequence r4 = r3.getTooltipText()
            goto L50
        L4c:
            java.lang.CharSequence r4 = r3.getTitle()
        L50:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 <= r1) goto L59
            androidx.appcompat.widget.TooltipCompat.setTooltipText(r2, r4)
        L59:
            boolean r3 = r3.isVisible()
            if (r3 == 0) goto L61
            r3 = 0
            goto L63
        L61:
            r3 = 8
        L63:
            r2.setVisibility(r3)
            r3 = 1
            r2.initialized = r3
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    @androidx.annotation.NonNull
    public int[] onCreateDrawableState(int r2) {
            r1 = this;
            int r2 = r2 + 1
            int[] r2 = super.onCreateDrawableState(r2)
            androidx.appcompat.view.menu.MenuItemImpl r0 = r1.itemData
            if (r0 == 0) goto L1d
            boolean r0 = r0.isCheckable()
            if (r0 == 0) goto L1d
            androidx.appcompat.view.menu.MenuItemImpl r0 = r1.itemData
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L1d
            int[] r0 = com.google.android.material.navigation.NavigationBarItemView.CHECKED_STATE_SET
            android.view.View.mergeDrawableStates(r2, r0)
        L1d:
            return r2
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@androidx.annotation.NonNull android.view.accessibility.AccessibilityNodeInfo r7) {
            r6 = this;
            super.onInitializeAccessibilityNodeInfo(r7)
            com.google.android.material.badge.BadgeDrawable r0 = r6.badgeDrawable
            if (r0 == 0) goto L42
            boolean r0 = r0.isVisible()
            if (r0 == 0) goto L42
            androidx.appcompat.view.menu.MenuItemImpl r0 = r6.itemData
            java.lang.CharSequence r0 = r0.getTitle()
            androidx.appcompat.view.menu.MenuItemImpl r1 = r6.itemData
            java.lang.CharSequence r1 = r1.getContentDescription()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L25
            androidx.appcompat.view.menu.MenuItemImpl r0 = r6.itemData
            java.lang.CharSequence r0 = r0.getContentDescription()
        L25:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ", "
            r1.append(r0)
            com.google.android.material.badge.BadgeDrawable r0 = r6.badgeDrawable
            java.lang.CharSequence r0 = r0.getContentDescription()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r7.setContentDescription(r0)
        L42:
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r7 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrap(r7)
            r0 = 0
            r1 = 1
            int r2 = r6.getItemVisiblePosition()
            r3 = 1
            r4 = 0
            boolean r5 = r6.isSelected()
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(r0, r1, r2, r3, r4, r5)
            r7.setCollectionItemInfo(r0)
            boolean r0 = r6.isSelected()
            if (r0 == 0) goto L68
            r0 = 0
            r7.setClickable(r0)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK
            r7.removeAction(r0)
        L68:
            android.content.res.Resources r0 = r6.getResources()
            int r1 = com.google.android.material.R.string.item_view_role_description
            java.lang.String r0 = r0.getString(r1)
            r7.setRoleDescription(r0)
            return
    }

    @Override // android.view.View
    public final void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            com.google.android.material.navigation.NavigationBarItemView$2 r2 = new com.google.android.material.navigation.NavigationBarItemView$2
            r2.<init>(r0, r1)
            r0.post(r2)
            return
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean prefersCondensedTitle() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final void removeBadge() {
            r1 = this;
            android.widget.ImageView r0 = r1.icon
            r1.tryRemoveBadgeFromAnchor(r0)
            return
    }

    public void setActiveIndicatorDrawable(@androidx.annotation.Nullable android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.view.View r0 = r1.activeIndicatorView
            if (r0 != 0) goto L5
            return
        L5:
            r0.setBackgroundDrawable(r2)
            r1.refreshItemBackground()
            return
    }

    public void setActiveIndicatorEnabled(boolean r2) {
            r1 = this;
            r1.activeIndicatorEnabled = r2
            r1.refreshItemBackground()
            android.view.View r0 = r1.activeIndicatorView
            if (r0 == 0) goto L15
            if (r2 == 0) goto Ld
            r2 = 0
            goto Lf
        Ld:
            r2 = 8
        Lf:
            r0.setVisibility(r2)
            r1.requestLayout()
        L15:
            return
    }

    public void setActiveIndicatorHeight(int r1) {
            r0 = this;
            r0.activeIndicatorDesiredHeight = r1
            int r1 = r0.getWidth()
            r0.updateActiveIndicatorLayoutParams(r1)
            return
    }

    public void setActiveIndicatorMarginHorizontal(@androidx.annotation.Px int r1) {
            r0 = this;
            r0.activeIndicatorMarginHorizontal = r1
            int r1 = r0.getWidth()
            r0.updateActiveIndicatorLayoutParams(r1)
            return
    }

    public void setActiveIndicatorResizeable(boolean r1) {
            r0 = this;
            r0.activeIndicatorResizeable = r1
            return
    }

    public void setActiveIndicatorWidth(int r1) {
            r0 = this;
            r0.activeIndicatorDesiredWidth = r1
            int r1 = r0.getWidth()
            r0.updateActiveIndicatorLayoutParams(r1)
            return
    }

    public void setBadge(@androidx.annotation.NonNull com.google.android.material.badge.BadgeDrawable r3) {
            r2 = this;
            com.google.android.material.badge.BadgeDrawable r0 = r2.badgeDrawable
            if (r0 != r3) goto L5
            return
        L5:
            boolean r0 = r2.hasBadge()
            if (r0 == 0) goto L1b
            android.widget.ImageView r0 = r2.icon
            if (r0 == 0) goto L1b
            java.lang.String r0 = "NavigationBar"
            java.lang.String r1 = "Multiple badges shouldn't be attached to one item."
            android.util.Log.w(r0, r1)
            android.widget.ImageView r0 = r2.icon
            r2.tryRemoveBadgeFromAnchor(r0)
        L1b:
            r2.badgeDrawable = r3
            android.widget.ImageView r3 = r2.icon
            if (r3 == 0) goto L24
            r2.tryAttachBadgeToAnchor(r3)
        L24:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setCheckable(boolean r1) {
            r0 = this;
            r0.refreshDrawableState()
            return
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setChecked(boolean r9) {
            r8 = this;
            android.widget.TextView r0 = r8.largeLabel
            int r1 = r0.getWidth()
            r2 = 2
            int r1 = r1 / r2
            float r1 = (float) r1
            r0.setPivotX(r1)
            android.widget.TextView r0 = r8.largeLabel
            int r1 = r0.getBaseline()
            float r1 = (float) r1
            r0.setPivotY(r1)
            android.widget.TextView r0 = r8.smallLabel
            int r1 = r0.getWidth()
            int r1 = r1 / r2
            float r1 = (float) r1
            r0.setPivotX(r1)
            android.widget.TextView r0 = r8.smallLabel
            int r1 = r0.getBaseline()
            float r1 = (float) r1
            r0.setPivotY(r1)
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r9 == 0) goto L32
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L33
        L32:
            r1 = 0
        L33:
            r8.maybeAnimateActiveIndicatorToProgress(r1)
            int r1 = r8.labelVisibilityMode
            r3 = -1
            r4 = 17
            r5 = 49
            r6 = 4
            r7 = 0
            if (r1 == r3) goto Lce
            if (r1 == 0) goto L9d
            r3 = 1
            if (r1 == r3) goto L61
            if (r1 == r2) goto L4a
            goto L13c
        L4a:
            android.view.View r0 = r8.getIconOrContainer()
            int r1 = r8.itemPaddingTop
            setViewTopMarginAndGravity(r0, r1, r4)
            android.widget.TextView r0 = r8.largeLabel
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r8.smallLabel
            r0.setVisibility(r1)
            goto L13c
        L61:
            android.view.ViewGroup r1 = r8.labelGroup
            int r2 = r8.itemPaddingBottom
            updateViewPaddingBottom(r1, r2)
            if (r9 == 0) goto L86
            android.view.View r1 = r8.getIconOrContainer()
            int r2 = r8.itemPaddingTop
            float r2 = (float) r2
            float r3 = r8.shiftAmount
            float r2 = r2 + r3
            int r2 = (int) r2
            setViewTopMarginAndGravity(r1, r2, r5)
            android.widget.TextView r1 = r8.largeLabel
            setViewScaleValues(r1, r0, r0, r7)
            android.widget.TextView r0 = r8.smallLabel
            float r1 = r8.scaleUpFactor
            setViewScaleValues(r0, r1, r1, r6)
            goto L13c
        L86:
            android.view.View r1 = r8.getIconOrContainer()
            int r2 = r8.itemPaddingTop
            setViewTopMarginAndGravity(r1, r2, r5)
            android.widget.TextView r1 = r8.largeLabel
            float r2 = r8.scaleDownFactor
            setViewScaleValues(r1, r2, r2, r6)
            android.widget.TextView r1 = r8.smallLabel
            setViewScaleValues(r1, r0, r0, r7)
            goto L13c
        L9d:
            if (r9 == 0) goto Lb5
            android.view.View r0 = r8.getIconOrContainer()
            int r1 = r8.itemPaddingTop
            setViewTopMarginAndGravity(r0, r1, r5)
            android.view.ViewGroup r0 = r8.labelGroup
            int r1 = r8.itemPaddingBottom
            updateViewPaddingBottom(r0, r1)
            android.widget.TextView r0 = r8.largeLabel
            r0.setVisibility(r7)
            goto Lc8
        Lb5:
            android.view.View r0 = r8.getIconOrContainer()
            int r1 = r8.itemPaddingTop
            setViewTopMarginAndGravity(r0, r1, r4)
            android.view.ViewGroup r0 = r8.labelGroup
            updateViewPaddingBottom(r0, r7)
            android.widget.TextView r0 = r8.largeLabel
            r0.setVisibility(r6)
        Lc8:
            android.widget.TextView r0 = r8.smallLabel
            r0.setVisibility(r6)
            goto L13c
        Lce:
            boolean r1 = r8.isShifting
            if (r1 == 0) goto L103
            if (r9 == 0) goto Lea
            android.view.View r0 = r8.getIconOrContainer()
            int r1 = r8.itemPaddingTop
            setViewTopMarginAndGravity(r0, r1, r5)
            android.view.ViewGroup r0 = r8.labelGroup
            int r1 = r8.itemPaddingBottom
            updateViewPaddingBottom(r0, r1)
            android.widget.TextView r0 = r8.largeLabel
            r0.setVisibility(r7)
            goto Lfd
        Lea:
            android.view.View r0 = r8.getIconOrContainer()
            int r1 = r8.itemPaddingTop
            setViewTopMarginAndGravity(r0, r1, r4)
            android.view.ViewGroup r0 = r8.labelGroup
            updateViewPaddingBottom(r0, r7)
            android.widget.TextView r0 = r8.largeLabel
            r0.setVisibility(r6)
        Lfd:
            android.widget.TextView r0 = r8.smallLabel
            r0.setVisibility(r6)
            goto L13c
        L103:
            android.view.ViewGroup r1 = r8.labelGroup
            int r2 = r8.itemPaddingBottom
            updateViewPaddingBottom(r1, r2)
            if (r9 == 0) goto L127
            android.view.View r1 = r8.getIconOrContainer()
            int r2 = r8.itemPaddingTop
            float r2 = (float) r2
            float r3 = r8.shiftAmount
            float r2 = r2 + r3
            int r2 = (int) r2
            setViewTopMarginAndGravity(r1, r2, r5)
            android.widget.TextView r1 = r8.largeLabel
            setViewScaleValues(r1, r0, r0, r7)
            android.widget.TextView r0 = r8.smallLabel
            float r1 = r8.scaleUpFactor
            setViewScaleValues(r0, r1, r1, r6)
            goto L13c
        L127:
            android.view.View r1 = r8.getIconOrContainer()
            int r2 = r8.itemPaddingTop
            setViewTopMarginAndGravity(r1, r2, r5)
            android.widget.TextView r1 = r8.largeLabel
            float r2 = r8.scaleDownFactor
            setViewScaleValues(r1, r2, r2, r6)
            android.widget.TextView r1 = r8.smallLabel
            setViewScaleValues(r1, r0, r0, r7)
        L13c:
            r8.refreshDrawableState()
            r8.setSelected(r9)
            return
    }

    @Override // android.view.View, androidx.appcompat.view.menu.MenuView.ItemView
    public void setEnabled(boolean r2) {
            r1 = this;
            super.setEnabled(r2)
            android.widget.TextView r0 = r1.smallLabel
            r0.setEnabled(r2)
            android.widget.TextView r0 = r1.largeLabel
            r0.setEnabled(r2)
            android.widget.ImageView r0 = r1.icon
            r0.setEnabled(r2)
            if (r2 == 0) goto L22
            android.content.Context r2 = r1.getContext()
            r0 = 1002(0x3ea, float:1.404E-42)
            androidx.core.view.PointerIconCompat r2 = androidx.core.view.PointerIconCompat.getSystemIcon(r2, r0)
            androidx.core.view.ViewCompat.setPointerIcon(r1, r2)
            goto L26
        L22:
            r2 = 0
            androidx.core.view.ViewCompat.setPointerIcon(r1, r2)
        L26:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setIcon(@androidx.annotation.Nullable android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.originalIconDrawable
            if (r2 != r0) goto L5
            return
        L5:
            r1.originalIconDrawable = r2
            if (r2 == 0) goto L25
            android.graphics.drawable.Drawable$ConstantState r0 = r2.getConstantState()
            if (r0 != 0) goto L10
            goto L14
        L10:
            android.graphics.drawable.Drawable r2 = r0.newDrawable()
        L14:
            android.graphics.drawable.Drawable r2 = androidx.core.graphics.drawable.DrawableCompat.wrap(r2)
            android.graphics.drawable.Drawable r2 = r2.mutate()
            r1.wrappedIconDrawable = r2
            android.content.res.ColorStateList r0 = r1.iconTint
            if (r0 == 0) goto L25
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r2, r0)
        L25:
            android.widget.ImageView r0 = r1.icon
            r0.setImageDrawable(r2)
            return
    }

    public void setIconSize(int r2) {
            r1 = this;
            android.widget.ImageView r0 = r1.icon
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            r0.width = r2
            r0.height = r2
            android.widget.ImageView r2 = r1.icon
            r2.setLayoutParams(r0)
            return
    }

    public void setIconTintList(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            r1.iconTint = r2
            androidx.appcompat.view.menu.MenuItemImpl r0 = r1.itemData
            if (r0 == 0) goto L12
            android.graphics.drawable.Drawable r0 = r1.wrappedIconDrawable
            if (r0 == 0) goto L12
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r2)
            android.graphics.drawable.Drawable r2 = r1.wrappedIconDrawable
            r2.invalidateSelf()
        L12:
            return
    }

    public void setItemBackground(int r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            goto Lc
        L4:
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = androidx.core.content.ContextCompat.getDrawable(r0, r2)
        Lc:
            r1.setItemBackground(r2)
            return
    }

    public void setItemBackground(@androidx.annotation.Nullable android.graphics.drawable.Drawable r2) {
            r1 = this;
            if (r2 == 0) goto L14
            android.graphics.drawable.Drawable$ConstantState r0 = r2.getConstantState()
            if (r0 == 0) goto L14
            android.graphics.drawable.Drawable$ConstantState r2 = r2.getConstantState()
            android.graphics.drawable.Drawable r2 = r2.newDrawable()
            android.graphics.drawable.Drawable r2 = r2.mutate()
        L14:
            r1.itemBackground = r2
            r1.refreshItemBackground()
            return
    }

    public void setItemPaddingBottom(int r2) {
            r1 = this;
            int r0 = r1.itemPaddingBottom
            if (r0 == r2) goto L9
            r1.itemPaddingBottom = r2
            r1.refreshChecked()
        L9:
            return
    }

    public void setItemPaddingTop(int r2) {
            r1 = this;
            int r0 = r1.itemPaddingTop
            if (r0 == r2) goto L9
            r1.itemPaddingTop = r2
            r1.refreshChecked()
        L9:
            return
    }

    public void setItemPosition(int r1) {
            r0 = this;
            r0.itemPosition = r1
            return
    }

    public void setItemRippleColor(@androidx.annotation.Nullable android.content.res.ColorStateList r1) {
            r0 = this;
            r0.itemRippleColor = r1
            r0.refreshItemBackground()
            return
    }

    public void setLabelVisibilityMode(int r2) {
            r1 = this;
            int r0 = r1.labelVisibilityMode
            if (r0 == r2) goto L13
            r1.labelVisibilityMode = r2
            r1.updateActiveIndicatorTransform()
            int r2 = r1.getWidth()
            r1.updateActiveIndicatorLayoutParams(r2)
            r1.refreshChecked()
        L13:
            return
    }

    public void setShifting(boolean r2) {
            r1 = this;
            boolean r0 = r1.isShifting
            if (r0 == r2) goto L9
            r1.isShifting = r2
            r1.refreshChecked()
        L9:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setShortcut(boolean r1, char r2) {
            r0 = this;
            return
    }

    public void setTextAppearanceActive(@androidx.annotation.StyleRes int r3) {
            r2 = this;
            android.widget.TextView r0 = r2.largeLabel
            setTextAppearanceWithoutFontScaling(r0, r3)
            android.widget.TextView r3 = r2.smallLabel
            float r3 = r3.getTextSize()
            android.widget.TextView r0 = r2.largeLabel
            float r0 = r0.getTextSize()
            r2.calculateTextScaleFactors(r3, r0)
            android.widget.TextView r3 = r2.largeLabel
            android.graphics.Typeface r0 = r3.getTypeface()
            r1 = 1
            r3.setTypeface(r0, r1)
            return
    }

    public void setTextAppearanceInactive(@androidx.annotation.StyleRes int r2) {
            r1 = this;
            android.widget.TextView r0 = r1.smallLabel
            setTextAppearanceWithoutFontScaling(r0, r2)
            android.widget.TextView r2 = r1.smallLabel
            float r2 = r2.getTextSize()
            android.widget.TextView r0 = r1.largeLabel
            float r0 = r0.getTextSize()
            r1.calculateTextScaleFactors(r2, r0)
            return
    }

    public void setTextColor(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            if (r2 == 0) goto Lc
            android.widget.TextView r0 = r1.smallLabel
            r0.setTextColor(r2)
            android.widget.TextView r0 = r1.largeLabel
            r0.setTextColor(r2)
        Lc:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setTitle(@androidx.annotation.Nullable java.lang.CharSequence r3) {
            r2 = this;
            android.widget.TextView r0 = r2.smallLabel
            r0.setText(r3)
            android.widget.TextView r0 = r2.largeLabel
            r0.setText(r3)
            androidx.appcompat.view.menu.MenuItemImpl r0 = r2.itemData
            if (r0 == 0) goto L18
            java.lang.CharSequence r0 = r0.getContentDescription()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1b
        L18:
            r2.setContentDescription(r3)
        L1b:
            androidx.appcompat.view.menu.MenuItemImpl r0 = r2.itemData
            if (r0 == 0) goto L30
            java.lang.CharSequence r0 = r0.getTooltipText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L2a
            goto L30
        L2a:
            androidx.appcompat.view.menu.MenuItemImpl r3 = r2.itemData
            java.lang.CharSequence r3 = r3.getTooltipText()
        L30:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 <= r1) goto L39
            androidx.appcompat.widget.TooltipCompat.setTooltipText(r2, r3)
        L39:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean showsIcon() {
            r1 = this;
            r0 = 1
            return r0
    }
}
