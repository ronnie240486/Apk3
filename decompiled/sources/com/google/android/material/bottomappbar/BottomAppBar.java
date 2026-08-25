package com.google.android.material.bottomappbar;

/* JADX INFO: loaded from: classes2.dex */
public class BottomAppBar extends androidx.appcompat.widget.Toolbar implements androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior {
    private static final int DEF_STYLE_RES = 0;
    private static final int FAB_ALIGNMENT_ANIM_DURATION_ATTR = 0;
    private static final int FAB_ALIGNMENT_ANIM_DURATION_DEFAULT = 300;
    private static final int FAB_ALIGNMENT_ANIM_EASING_ATTR = 0;
    private static final float FAB_ALIGNMENT_ANIM_EASING_MIDPOINT = 0.2f;
    public static final int FAB_ALIGNMENT_MODE_CENTER = 0;
    public static final int FAB_ALIGNMENT_MODE_END = 1;
    public static final int FAB_ANCHOR_MODE_CRADLE = 1;
    public static final int FAB_ANCHOR_MODE_EMBED = 0;
    public static final int FAB_ANIMATION_MODE_SCALE = 0;
    public static final int FAB_ANIMATION_MODE_SLIDE = 1;
    public static final int MENU_ALIGNMENT_MODE_AUTO = 0;
    public static final int MENU_ALIGNMENT_MODE_START = 1;
    private static final int NO_FAB_END_MARGIN = -1;
    private static final int NO_MENU_RES_ID = 0;
    private int animatingModeChangeCounter;
    private java.util.ArrayList<com.google.android.material.bottomappbar.BottomAppBar.AnimationListener> animationListeners;
    private com.google.android.material.bottomappbar.BottomAppBar.Behavior behavior;
    private int bottomInset;
    private int fabAlignmentMode;

    @androidx.annotation.Px
    private int fabAlignmentModeEndMargin;
    private int fabAnchorMode;

    @androidx.annotation.NonNull
    public android.animation.AnimatorListenerAdapter fabAnimationListener;
    private int fabAnimationMode;
    private boolean fabAttached;
    private final int fabOffsetEndMode;

    @androidx.annotation.NonNull
    public com.google.android.material.animation.TransformationCallback<com.google.android.material.floatingactionbutton.FloatingActionButton> fabTransformationCallback;
    private boolean hideOnScroll;
    private int leftInset;
    private final com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable;
    private int menuAlignmentMode;
    private boolean menuAnimatingWithFabAlignmentMode;

    @androidx.annotation.Nullable
    private android.animation.Animator menuAnimator;

    @androidx.annotation.Nullable
    private android.animation.Animator modeAnimator;

    @androidx.annotation.Nullable
    private java.lang.Integer navigationIconTint;
    private final boolean paddingBottomSystemWindowInsets;
    private final boolean paddingLeftSystemWindowInsets;
    private final boolean paddingRightSystemWindowInsets;

    @androidx.annotation.MenuRes
    private int pendingMenuResId;
    private final boolean removeEmbeddedFabElevation;
    private int rightInset;










    /* JADX INFO: loaded from: classes.dex */
    public interface AnimationListener {
        void onAnimationEnd(com.google.android.material.bottomappbar.BottomAppBar r1);

        void onAnimationStart(com.google.android.material.bottomappbar.BottomAppBar r1);
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class Behavior extends com.google.android.material.behavior.HideBottomViewOnScrollBehavior<com.google.android.material.bottomappbar.BottomAppBar> {

        @androidx.annotation.NonNull
        private final android.graphics.Rect fabContentRect;
        private final android.view.View.OnLayoutChangeListener fabLayoutListener;
        private int originalBottomMargin;
        private java.lang.ref.WeakReference<com.google.android.material.bottomappbar.BottomAppBar> viewRef;


        public Behavior() {
                r1 = this;
                r1.<init>()
                com.google.android.material.bottomappbar.BottomAppBar$Behavior$1 r0 = new com.google.android.material.bottomappbar.BottomAppBar$Behavior$1
                r0.<init>(r1)
                r1.fabLayoutListener = r0
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r1.fabContentRect = r0
                return
        }

        public Behavior(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                com.google.android.material.bottomappbar.BottomAppBar$Behavior$1 r1 = new com.google.android.material.bottomappbar.BottomAppBar$Behavior$1
                r1.<init>(r0)
                r0.fabLayoutListener = r1
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                r0.fabContentRect = r1
                return
        }

        public static /* synthetic */ java.lang.ref.WeakReference access$2500(com.google.android.material.bottomappbar.BottomAppBar.Behavior r0) {
                java.lang.ref.WeakReference<com.google.android.material.bottomappbar.BottomAppBar> r0 = r0.viewRef
                return r0
        }

        public static /* synthetic */ android.graphics.Rect access$2600(com.google.android.material.bottomappbar.BottomAppBar.Behavior r0) {
                android.graphics.Rect r0 = r0.fabContentRect
                return r0
        }

        public static /* synthetic */ int access$2700(com.google.android.material.bottomappbar.BottomAppBar.Behavior r0) {
                int r0 = r0.originalBottomMargin
                return r0
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull android.view.View r2, int r3) {
                r0 = this;
                com.google.android.material.bottomappbar.BottomAppBar r2 = (com.google.android.material.bottomappbar.BottomAppBar) r2
                boolean r1 = r0.onLayoutChild(r1, r2, r3)
                return r1
        }

        public boolean onLayoutChild(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r4, @androidx.annotation.NonNull com.google.android.material.bottomappbar.BottomAppBar r5, int r6) {
                r3 = this;
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r5)
                r3.viewRef = r0
                android.view.View r0 = com.google.android.material.bottomappbar.BottomAppBar.access$3200(r5)
                if (r0 == 0) goto L5b
                boolean r1 = androidx.core.view.ViewCompat.isLaidOut(r0)
                if (r1 != 0) goto L5b
                com.google.android.material.bottomappbar.BottomAppBar.access$3300(r5, r0)
                android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r1
                int r1 = r1.bottomMargin
                r3.originalBottomMargin = r1
                boolean r1 = r0 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
                if (r1 == 0) goto L53
                r1 = r0
                com.google.android.material.floatingactionbutton.FloatingActionButton r1 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r1
                int r2 = com.google.android.material.bottomappbar.BottomAppBar.access$400(r5)
                if (r2 != 0) goto L3a
                boolean r2 = com.google.android.material.bottomappbar.BottomAppBar.access$3400(r5)
                if (r2 == 0) goto L3a
                r2 = 0
                androidx.core.view.ViewCompat.setElevation(r1, r2)
                r1.setCompatElevation(r2)
            L3a:
                com.google.android.material.animation.MotionSpec r2 = r1.getShowMotionSpec()
                if (r2 != 0) goto L45
                int r2 = com.google.android.material.R.animator.mtrl_fab_show_motion_spec
                r1.setShowMotionSpecResource(r2)
            L45:
                com.google.android.material.animation.MotionSpec r2 = r1.getHideMotionSpec()
                if (r2 != 0) goto L50
                int r2 = com.google.android.material.R.animator.mtrl_fab_hide_motion_spec
                r1.setHideMotionSpecResource(r2)
            L50:
                com.google.android.material.bottomappbar.BottomAppBar.access$3500(r5, r1)
            L53:
                android.view.View$OnLayoutChangeListener r1 = r3.fabLayoutListener
                r0.addOnLayoutChangeListener(r1)
                com.google.android.material.bottomappbar.BottomAppBar.access$1400(r5)
            L5b:
                r4.onLayoutChild(r5, r6)
                boolean r4 = super.onLayoutChild(r4, r5, r6)
                return r4
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onStartNestedScroll(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull android.view.View r3, @androidx.annotation.NonNull android.view.View r4, int r5, int r6) {
                r0 = this;
                com.google.android.material.bottomappbar.BottomAppBar r2 = (com.google.android.material.bottomappbar.BottomAppBar) r2
                boolean r1 = r0.onStartNestedScroll(r1, r2, r3, r4, r5, r6)
                return r1
        }

        public boolean onStartNestedScroll(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r2, @androidx.annotation.NonNull com.google.android.material.bottomappbar.BottomAppBar r3, @androidx.annotation.NonNull android.view.View r4, @androidx.annotation.NonNull android.view.View r5, int r6, int r7) {
                r1 = this;
                boolean r0 = r3.getHideOnScroll()
                if (r0 == 0) goto Le
                boolean r2 = super.onStartNestedScroll(r2, r3, r4, r5, r6, r7)
                if (r2 == 0) goto Le
                r2 = 1
                goto Lf
            Le:
                r2 = 0
            Lf:
                return r2
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FabAlignmentMode {
    }

    /* JADX INFO: loaded from: classes.dex */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public @interface FabAnchorMode {
    }

    /* JADX INFO: loaded from: classes.dex */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FabAnimationMode {
    }

    /* JADX INFO: loaded from: classes.dex */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public @interface MenuAlignmentMode {
    }

    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<com.google.android.material.bottomappbar.BottomAppBar.SavedState> CREATOR = null;
        public int fabAlignmentMode;
        public boolean fabAttached;


        static {
                com.google.android.material.bottomappbar.BottomAppBar$SavedState$1 r0 = new com.google.android.material.bottomappbar.BottomAppBar$SavedState$1
                r0.<init>()
                com.google.android.material.bottomappbar.BottomAppBar.SavedState.CREATOR = r0
                return
        }

        public SavedState(@androidx.annotation.NonNull android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                int r2 = r1.readInt()
                r0.fabAlignmentMode = r2
                int r1 = r1.readInt()
                if (r1 == 0) goto L11
                r1 = 1
                goto L12
            L11:
                r1 = 0
            L12:
                r0.fabAttached = r1
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
                int r2 = r0.fabAlignmentMode
                r1.writeInt(r2)
                boolean r2 = r0.fabAttached
                r1.writeInt(r2)
                return
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$w7TZ-1dukS0NyaoArwjwMZK7i-E, reason: not valid java name */
    public static /* synthetic */ void m280$r8$lambda$w7TZ1dukS0NyaoArwjwMZK7iE(android.view.View r0) {
            lambda$onLayout$0(r0)
            return
    }

    static {
            int r0 = com.google.android.material.R.style.Widget_MaterialComponents_BottomAppBar
            com.google.android.material.bottomappbar.BottomAppBar.DEF_STYLE_RES = r0
            int r0 = com.google.android.material.R.attr.motionDurationLong2
            com.google.android.material.bottomappbar.BottomAppBar.FAB_ALIGNMENT_ANIM_DURATION_ATTR = r0
            int r0 = com.google.android.material.R.attr.motionEasingEmphasizedInterpolator
            com.google.android.material.bottomappbar.BottomAppBar.FAB_ALIGNMENT_ANIM_EASING_ATTR = r0
            return
    }

    public BottomAppBar(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public BottomAppBar(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.R.attr.bottomAppBarStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public BottomAppBar(@androidx.annotation.NonNull android.content.Context r13, @androidx.annotation.Nullable android.util.AttributeSet r14, int r15) {
            r12 = this;
            int r6 = com.google.android.material.bottomappbar.BottomAppBar.DEF_STYLE_RES
            android.content.Context r13 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r13, r14, r15, r6)
            r12.<init>(r13, r14, r15)
            com.google.android.material.shape.MaterialShapeDrawable r13 = new com.google.android.material.shape.MaterialShapeDrawable
            r13.<init>()
            r12.materialShapeDrawable = r13
            r7 = 0
            r12.animatingModeChangeCounter = r7
            r12.pendingMenuResId = r7
            r12.menuAnimatingWithFabAlignmentMode = r7
            r8 = 1
            r12.fabAttached = r8
            com.google.android.material.bottomappbar.BottomAppBar$1 r0 = new com.google.android.material.bottomappbar.BottomAppBar$1
            r0.<init>(r12)
            r12.fabAnimationListener = r0
            com.google.android.material.bottomappbar.BottomAppBar$2 r0 = new com.google.android.material.bottomappbar.BottomAppBar$2
            r0.<init>(r12)
            r12.fabTransformationCallback = r0
            android.content.Context r9 = r12.getContext()
            int[] r2 = com.google.android.material.R.styleable.BottomAppBar
            int[] r5 = new int[r7]
            r0 = r9
            r1 = r14
            r3 = r15
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r1 = com.google.android.material.R.styleable.BottomAppBar_backgroundTint
            android.content.res.ColorStateList r1 = com.google.android.material.resources.MaterialResources.getColorStateList(r9, r0, r1)
            int r2 = com.google.android.material.R.styleable.BottomAppBar_navigationIconTint
            boolean r3 = r0.hasValue(r2)
            r4 = -1
            if (r3 == 0) goto L4e
            int r2 = r0.getColor(r2, r4)
            r12.setNavigationIconTint(r2)
        L4e:
            int r2 = com.google.android.material.R.styleable.BottomAppBar_elevation
            int r2 = r0.getDimensionPixelSize(r2, r7)
            int r3 = com.google.android.material.R.styleable.BottomAppBar_fabCradleMargin
            int r3 = r0.getDimensionPixelOffset(r3, r7)
            float r3 = (float) r3
            int r5 = com.google.android.material.R.styleable.BottomAppBar_fabCradleRoundedCornerRadius
            int r5 = r0.getDimensionPixelOffset(r5, r7)
            float r5 = (float) r5
            int r10 = com.google.android.material.R.styleable.BottomAppBar_fabCradleVerticalOffset
            int r10 = r0.getDimensionPixelOffset(r10, r7)
            float r10 = (float) r10
            int r11 = com.google.android.material.R.styleable.BottomAppBar_fabAlignmentMode
            int r11 = r0.getInt(r11, r7)
            r12.fabAlignmentMode = r11
            int r11 = com.google.android.material.R.styleable.BottomAppBar_fabAnimationMode
            int r11 = r0.getInt(r11, r7)
            r12.fabAnimationMode = r11
            int r11 = com.google.android.material.R.styleable.BottomAppBar_fabAnchorMode
            int r11 = r0.getInt(r11, r8)
            r12.fabAnchorMode = r11
            int r11 = com.google.android.material.R.styleable.BottomAppBar_removeEmbeddedFabElevation
            boolean r11 = r0.getBoolean(r11, r8)
            r12.removeEmbeddedFabElevation = r11
            int r11 = com.google.android.material.R.styleable.BottomAppBar_menuAlignmentMode
            int r11 = r0.getInt(r11, r7)
            r12.menuAlignmentMode = r11
            int r11 = com.google.android.material.R.styleable.BottomAppBar_hideOnScroll
            boolean r11 = r0.getBoolean(r11, r7)
            r12.hideOnScroll = r11
            int r11 = com.google.android.material.R.styleable.BottomAppBar_paddingBottomSystemWindowInsets
            boolean r11 = r0.getBoolean(r11, r7)
            r12.paddingBottomSystemWindowInsets = r11
            int r11 = com.google.android.material.R.styleable.BottomAppBar_paddingLeftSystemWindowInsets
            boolean r11 = r0.getBoolean(r11, r7)
            r12.paddingLeftSystemWindowInsets = r11
            int r11 = com.google.android.material.R.styleable.BottomAppBar_paddingRightSystemWindowInsets
            boolean r11 = r0.getBoolean(r11, r7)
            r12.paddingRightSystemWindowInsets = r11
            int r11 = com.google.android.material.R.styleable.BottomAppBar_fabAlignmentModeEndMargin
            int r4 = r0.getDimensionPixelOffset(r11, r4)
            r12.fabAlignmentModeEndMargin = r4
            int r4 = com.google.android.material.R.styleable.BottomAppBar_addElevationShadow
            boolean r4 = r0.getBoolean(r4, r8)
            r0.recycle()
            android.content.res.Resources r0 = r12.getResources()
            int r11 = com.google.android.material.R.dimen.mtrl_bottomappbar_fabOffsetEndMode
            int r0 = r0.getDimensionPixelOffset(r11)
            r12.fabOffsetEndMode = r0
            com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment r0 = new com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment
            r0.<init>(r3, r5, r10)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r3 = com.google.android.material.shape.ShapeAppearanceModel.builder()
            com.google.android.material.shape.ShapeAppearanceModel$Builder r0 = r3.setTopEdge(r0)
            com.google.android.material.shape.ShapeAppearanceModel r0 = r0.build()
            r13.setShapeAppearanceModel(r0)
            if (r4 == 0) goto Le9
            r0 = 2
            r13.setShadowCompatibilityMode(r0)
            goto Lf8
        Le9:
            r13.setShadowCompatibilityMode(r8)
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r0 < r3) goto Lf8
            r12.setOutlineAmbientShadowColor(r7)
            r12.setOutlineSpotShadowColor(r7)
        Lf8:
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r13.setPaintStyle(r0)
            r13.initializeElevationOverlay(r9)
            float r0 = (float) r2
            r12.setElevation(r0)
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r13, r1)
            androidx.core.view.ViewCompat.setBackground(r12, r13)
            com.google.android.material.bottomappbar.BottomAppBar$3 r13 = new com.google.android.material.bottomappbar.BottomAppBar$3
            r13.<init>(r12)
            com.google.android.material.internal.ViewUtils.doOnApplyWindowInsets(r12, r14, r15, r6, r13)
            return
    }

    public static /* synthetic */ boolean access$000(com.google.android.material.bottomappbar.BottomAppBar r0) {
            boolean r0 = r0.menuAnimatingWithFabAlignmentMode
            return r0
    }

    public static /* synthetic */ void access$002(com.google.android.material.bottomappbar.BottomAppBar r1) {
            r0 = 0
            r1.menuAnimatingWithFabAlignmentMode = r0
            return
    }

    public static /* synthetic */ int access$100(com.google.android.material.bottomappbar.BottomAppBar r0) {
            int r0 = r0.fabAlignmentMode
            return r0
    }

    public static /* synthetic */ int access$1000(com.google.android.material.bottomappbar.BottomAppBar r0) {
            int r0 = r0.leftInset
            return r0
    }

    public static /* synthetic */ int access$1002(com.google.android.material.bottomappbar.BottomAppBar r0, int r1) {
            r0.leftInset = r1
            return r1
    }

    public static /* synthetic */ boolean access$1100(com.google.android.material.bottomappbar.BottomAppBar r0) {
            boolean r0 = r0.paddingRightSystemWindowInsets
            return r0
    }

    public static /* synthetic */ int access$1200(com.google.android.material.bottomappbar.BottomAppBar r0) {
            int r0 = r0.rightInset
            return r0
    }

    public static /* synthetic */ int access$1202(com.google.android.material.bottomappbar.BottomAppBar r0, int r1) {
            r0.rightInset = r1
            return r1
    }

    public static /* synthetic */ void access$1300(com.google.android.material.bottomappbar.BottomAppBar r0) {
            r0.cancelAnimations()
            return
    }

    public static /* synthetic */ void access$1400(com.google.android.material.bottomappbar.BottomAppBar r0) {
            r0.setCutoutStateAndTranslateFab()
            return
    }

    public static /* synthetic */ void access$1500(com.google.android.material.bottomappbar.BottomAppBar r0) {
            r0.setActionMenuViewPosition()
            return
    }

    public static /* synthetic */ void access$1600(com.google.android.material.bottomappbar.BottomAppBar r0) {
            r0.dispatchAnimationStart()
            return
    }

    public static /* synthetic */ void access$1700(com.google.android.material.bottomappbar.BottomAppBar r0) {
            r0.dispatchAnimationEnd()
            return
    }

    public static /* synthetic */ void access$1802(com.google.android.material.bottomappbar.BottomAppBar r1) {
            r0 = 0
            r1.modeAnimator = r0
            return
    }

    public static /* synthetic */ float access$1900(com.google.android.material.bottomappbar.BottomAppBar r0, int r1) {
            float r0 = r0.getFabTranslationX(r1)
            return r0
    }

    public static /* synthetic */ boolean access$200(com.google.android.material.bottomappbar.BottomAppBar r0) {
            boolean r0 = r0.fabAttached
            return r0
    }

    public static /* synthetic */ void access$2002(com.google.android.material.bottomappbar.BottomAppBar r1) {
            r0 = 0
            r1.menuAnimator = r0
            return
    }

    public static /* synthetic */ int access$2100(com.google.android.material.bottomappbar.BottomAppBar r0) {
            int r0 = r0.pendingMenuResId
            return r0
    }

    public static /* synthetic */ void access$2200(com.google.android.material.bottomappbar.BottomAppBar r0, androidx.appcompat.widget.ActionMenuView r1, int r2, boolean r3, boolean r4) {
            r0.translateActionMenuView(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ com.google.android.material.floatingactionbutton.FloatingActionButton access$2300(com.google.android.material.bottomappbar.BottomAppBar r0) {
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r0.findDependentFab()
            return r0
    }

    public static /* synthetic */ float access$2400(com.google.android.material.bottomappbar.BottomAppBar r0) {
            float r0 = r0.getFabTranslationX()
            return r0
    }

    public static /* synthetic */ int access$2800(com.google.android.material.bottomappbar.BottomAppBar r0) {
            int r0 = r0.getBottomInset()
            return r0
    }

    public static /* synthetic */ int access$2900(com.google.android.material.bottomappbar.BottomAppBar r0) {
            int r0 = r0.getLeftInset()
            return r0
    }

    public static /* synthetic */ void access$300(com.google.android.material.bottomappbar.BottomAppBar r0, int r1, boolean r2) {
            r0.maybeAnimateMenuView(r1, r2)
            return
    }

    public static /* synthetic */ int access$3000(com.google.android.material.bottomappbar.BottomAppBar r0) {
            int r0 = r0.getRightInset()
            return r0
    }

    public static /* synthetic */ int access$3100(com.google.android.material.bottomappbar.BottomAppBar r0) {
            int r0 = r0.fabOffsetEndMode
            return r0
    }

    public static /* synthetic */ android.view.View access$3200(com.google.android.material.bottomappbar.BottomAppBar r0) {
            android.view.View r0 = r0.findDependentView()
            return r0
    }

    public static /* synthetic */ void access$3300(com.google.android.material.bottomappbar.BottomAppBar r0, android.view.View r1) {
            updateFabAnchorGravity(r0, r1)
            return
    }

    public static /* synthetic */ boolean access$3400(com.google.android.material.bottomappbar.BottomAppBar r0) {
            boolean r0 = r0.removeEmbeddedFabElevation
            return r0
    }

    public static /* synthetic */ void access$3500(com.google.android.material.bottomappbar.BottomAppBar r0, com.google.android.material.floatingactionbutton.FloatingActionButton r1) {
            r0.addFabAnimationListeners(r1)
            return
    }

    public static /* synthetic */ int access$400(com.google.android.material.bottomappbar.BottomAppBar r0) {
            int r0 = r0.fabAnchorMode
            return r0
    }

    public static /* synthetic */ com.google.android.material.shape.MaterialShapeDrawable access$500(com.google.android.material.bottomappbar.BottomAppBar r0) {
            com.google.android.material.shape.MaterialShapeDrawable r0 = r0.materialShapeDrawable
            return r0
    }

    public static /* synthetic */ com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment access$600(com.google.android.material.bottomappbar.BottomAppBar r0) {
            com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment r0 = r0.getTopEdgeTreatment()
            return r0
    }

    public static /* synthetic */ boolean access$700(com.google.android.material.bottomappbar.BottomAppBar r0) {
            boolean r0 = r0.paddingBottomSystemWindowInsets
            return r0
    }

    public static /* synthetic */ int access$802(com.google.android.material.bottomappbar.BottomAppBar r0, int r1) {
            r0.bottomInset = r1
            return r1
    }

    public static /* synthetic */ boolean access$900(com.google.android.material.bottomappbar.BottomAppBar r0) {
            boolean r0 = r0.paddingLeftSystemWindowInsets
            return r0
    }

    private void addFabAnimationListeners(@androidx.annotation.NonNull com.google.android.material.floatingactionbutton.FloatingActionButton r2) {
            r1 = this;
            android.animation.AnimatorListenerAdapter r0 = r1.fabAnimationListener
            r2.addOnHideAnimationListener(r0)
            com.google.android.material.bottomappbar.BottomAppBar$9 r0 = new com.google.android.material.bottomappbar.BottomAppBar$9
            r0.<init>(r1)
            r2.addOnShowAnimationListener(r0)
            com.google.android.material.animation.TransformationCallback<com.google.android.material.floatingactionbutton.FloatingActionButton> r0 = r1.fabTransformationCallback
            r2.addTransformationCallback(r0)
            return
    }

    private void cancelAnimations() {
            r1 = this;
            android.animation.Animator r0 = r1.menuAnimator
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            android.animation.Animator r0 = r1.modeAnimator
            if (r0 == 0) goto Le
            r0.cancel()
        Le:
            return
    }

    private void createFabTranslationXAnimation(int r4, @androidx.annotation.NonNull java.util.List<android.animation.Animator> r5) {
            r3 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r3.findDependentFab()
            r1 = 1
            float[] r1 = new float[r1]
            float r4 = r3.getFabTranslationX(r4)
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "translationX"
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r0, r4, r1)
            int r0 = r3.getFabAlignmentAnimationDuration()
            long r0 = (long) r0
            r4.setDuration(r0)
            r5.add(r4)
            return
    }

    private void createMenuViewTranslationAnimation(int r10, boolean r11, @androidx.annotation.NonNull java.util.List<android.animation.Animator> r12) {
            r9 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r9.getActionMenuView()
            if (r0 != 0) goto L7
            return
        L7:
            int r1 = r9.getFabAlignmentAnimationDuration()
            float r1 = (float) r1
            r2 = 1
            float[] r3 = new float[r2]
            r4 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            r3[r4] = r5
            java.lang.String r6 = "alpha"
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r0, r6, r3)
            r7 = 1061997773(0x3f4ccccd, float:0.8)
            float r7 = r7 * r1
            long r7 = (long) r7
            r3.setDuration(r7)
            float r7 = r0.getTranslationX()
            int r8 = r9.getActionMenuViewTranslationX(r0, r10, r11)
            float r8 = (float) r8
            float r7 = r7 - r8
            float r7 = java.lang.Math.abs(r7)
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 <= 0) goto L62
            float[] r5 = new float[r2]
            r7 = 0
            r5[r4] = r7
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r0, r6, r5)
            r6 = 1045220557(0x3e4ccccd, float:0.2)
            float r1 = r1 * r6
            long r6 = (long) r1
            r5.setDuration(r6)
            com.google.android.material.bottomappbar.BottomAppBar$7 r1 = new com.google.android.material.bottomappbar.BottomAppBar$7
            r1.<init>(r9, r0, r10, r11)
            r5.addListener(r1)
            android.animation.AnimatorSet r10 = new android.animation.AnimatorSet
            r10.<init>()
            r11 = 2
            android.animation.Animator[] r11 = new android.animation.Animator[r11]
            r11[r4] = r5
            r11[r2] = r3
            r10.playSequentially(r11)
            r12.add(r10)
            goto L6d
        L62:
            float r10 = r0.getAlpha()
            int r10 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r10 >= 0) goto L6d
            r12.add(r3)
        L6d:
            return
    }

    private void dispatchAnimationEnd() {
            r2 = this;
            int r0 = r2.animatingModeChangeCounter
            int r0 = r0 + (-1)
            r2.animatingModeChangeCounter = r0
            if (r0 != 0) goto L20
            java.util.ArrayList<com.google.android.material.bottomappbar.BottomAppBar$AnimationListener> r0 = r2.animationListeners
            if (r0 == 0) goto L20
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            com.google.android.material.bottomappbar.BottomAppBar$AnimationListener r1 = (com.google.android.material.bottomappbar.BottomAppBar.AnimationListener) r1
            r1.onAnimationEnd(r2)
            goto L10
        L20:
            return
    }

    private void dispatchAnimationStart() {
            r2 = this;
            int r0 = r2.animatingModeChangeCounter
            int r1 = r0 + 1
            r2.animatingModeChangeCounter = r1
            if (r0 != 0) goto L20
            java.util.ArrayList<com.google.android.material.bottomappbar.BottomAppBar$AnimationListener> r0 = r2.animationListeners
            if (r0 == 0) goto L20
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            com.google.android.material.bottomappbar.BottomAppBar$AnimationListener r1 = (com.google.android.material.bottomappbar.BottomAppBar.AnimationListener) r1
            r1.onAnimationStart(r2)
            goto L10
        L20:
            return
    }

    @androidx.annotation.Nullable
    private com.google.android.material.floatingactionbutton.FloatingActionButton findDependentFab() {
            r2 = this;
            android.view.View r0 = r2.findDependentView()
            boolean r1 = r0 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r1 == 0) goto Lb
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    @androidx.annotation.Nullable
    private android.view.View findDependentView() {
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.getDependents(r4)
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L2c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L18
        L2c:
            return r2
        L2d:
            return r1
    }

    @androidx.annotation.Nullable
    private androidx.appcompat.widget.ActionMenuView getActionMenuView() {
            r3 = this;
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
            r0 = 0
            return r0
    }

    private int getBottomInset() {
            r1 = this;
            int r0 = r1.bottomInset
            return r0
    }

    private int getFabAlignmentAnimationDuration() {
            r3 = this;
            android.content.Context r0 = r3.getContext()
            int r1 = com.google.android.material.bottomappbar.BottomAppBar.FAB_ALIGNMENT_ANIM_DURATION_ATTR
            r2 = 300(0x12c, float:4.2E-43)
            int r0 = com.google.android.material.motion.MotionUtils.resolveThemeDuration(r0, r1, r2)
            return r0
    }

    private float getFabTranslationX() {
            r1 = this;
            int r0 = r1.fabAlignmentMode
            float r0 = r1.getFabTranslationX(r0)
            return r0
    }

    private float getFabTranslationX(int r6) {
            r5 = this;
            boolean r0 = com.google.android.material.internal.ViewUtils.isLayoutRtl(r5)
            r1 = 1
            if (r6 != r1) goto L35
            android.view.View r6 = r5.findDependentView()
            if (r0 == 0) goto L10
            int r2 = r5.leftInset
            goto L12
        L10:
            int r2 = r5.rightInset
        L12:
            int r3 = r5.fabAlignmentModeEndMargin
            r4 = -1
            if (r3 == r4) goto L24
            if (r6 == 0) goto L24
            int r6 = r6.getMeasuredWidth()
            int r6 = r6 / 2
            int r3 = r5.fabAlignmentModeEndMargin
            int r6 = r6 + r3
            int r6 = r6 + r2
            goto L27
        L24:
            int r6 = r5.fabOffsetEndMode
            int r6 = r6 + r2
        L27:
            int r2 = r5.getMeasuredWidth()
            int r2 = r2 / 2
            int r2 = r2 - r6
            if (r0 == 0) goto L31
            r1 = -1
        L31:
            int r2 = r2 * r1
            float r6 = (float) r2
            return r6
        L35:
            r6 = 0
            return r6
    }

    private float getFabTranslationY() {
            r2 = this;
            int r0 = r2.fabAnchorMode
            r1 = 1
            if (r0 != r1) goto Lf
            com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment r0 = r2.getTopEdgeTreatment()
            float r0 = r0.getCradleVerticalOffset()
            float r0 = -r0
            return r0
        Lf:
            r0 = 0
            return r0
    }

    private int getLeftInset() {
            r1 = this;
            int r0 = r1.leftInset
            return r0
    }

    private int getRightInset() {
            r1 = this;
            int r0 = r1.rightInset
            return r0
    }

    @androidx.annotation.NonNull
    private com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment getTopEdgeTreatment() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.materialShapeDrawable
            com.google.android.material.shape.ShapeAppearanceModel r0 = r0.getShapeAppearanceModel()
            com.google.android.material.shape.EdgeTreatment r0 = r0.getTopEdge()
            com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment r0 = (com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment) r0
            return r0
    }

    private boolean isFabVisibleOrWillBeShown() {
            r1 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r1.findDependentFab()
            if (r0 == 0) goto Le
            boolean r0 = r0.isOrWillBeShown()
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    private static /* synthetic */ void lambda$onLayout$0(android.view.View r0) {
            r0.requestLayout()
            return
    }

    private void maybeAnimateMenuView(int r4, boolean r5) {
            r3 = this;
            boolean r0 = androidx.core.view.ViewCompat.isLaidOut(r3)
            r1 = 0
            if (r0 != 0) goto Lf
            r3.menuAnimatingWithFabAlignmentMode = r1
            int r4 = r3.pendingMenuResId
            r3.replaceMenu(r4)
            return
        Lf:
            android.animation.Animator r0 = r3.menuAnimator
            if (r0 == 0) goto L16
            r0.cancel()
        L16:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r2 = r3.isFabVisibleOrWillBeShown()
            if (r2 != 0) goto L23
            r4 = 0
            r5 = 0
        L23:
            r3.createMenuViewTranslationAnimation(r4, r5, r0)
            android.animation.AnimatorSet r4 = new android.animation.AnimatorSet
            r4.<init>()
            r4.playTogether(r0)
            r3.menuAnimator = r4
            com.google.android.material.bottomappbar.BottomAppBar$6 r5 = new com.google.android.material.bottomappbar.BottomAppBar$6
            r5.<init>(r3)
            r4.addListener(r5)
            android.animation.Animator r4 = r3.menuAnimator
            r4.start()
            return
    }

    private void maybeAnimateModeChange(int r4) {
            r3 = this;
            int r0 = r3.fabAlignmentMode
            if (r0 == r4) goto L5e
            boolean r0 = androidx.core.view.ViewCompat.isLaidOut(r3)
            if (r0 != 0) goto Lb
            goto L5e
        Lb:
            android.animation.Animator r0 = r3.modeAnimator
            if (r0 == 0) goto L12
            r0.cancel()
        L12:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r3.fabAnimationMode
            r2 = 1
            if (r1 != r2) goto L20
            r3.createFabTranslationXAnimation(r4, r0)
            goto L38
        L20:
            com.google.android.material.floatingactionbutton.FloatingActionButton r1 = r3.findDependentFab()
            if (r1 == 0) goto L38
            boolean r2 = r1.isOrWillBeHidden()
            if (r2 == 0) goto L2d
            goto L38
        L2d:
            r3.dispatchAnimationStart()
            com.google.android.material.bottomappbar.BottomAppBar$5 r2 = new com.google.android.material.bottomappbar.BottomAppBar$5
            r2.<init>(r3, r4)
            r1.hide(r2)
        L38:
            android.animation.AnimatorSet r4 = new android.animation.AnimatorSet
            r4.<init>()
            r4.playTogether(r0)
            android.content.Context r0 = r3.getContext()
            int r1 = com.google.android.material.bottomappbar.BottomAppBar.FAB_ALIGNMENT_ANIM_EASING_ATTR
            android.animation.TimeInterpolator r2 = com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR
            android.animation.TimeInterpolator r0 = com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(r0, r1, r2)
            r4.setInterpolator(r0)
            r3.modeAnimator = r4
            com.google.android.material.bottomappbar.BottomAppBar$4 r0 = new com.google.android.material.bottomappbar.BottomAppBar$4
            r0.<init>(r3)
            r4.addListener(r0)
            android.animation.Animator r4 = r3.modeAnimator
            r4.start()
        L5e:
            return
    }

    @androidx.annotation.Nullable
    private android.graphics.drawable.Drawable maybeTintNavigationIcon(@androidx.annotation.Nullable android.graphics.drawable.Drawable r2) {
            r1 = this;
            if (r2 == 0) goto L17
            java.lang.Integer r0 = r1.navigationIconTint
            if (r0 == 0) goto L17
            android.graphics.drawable.Drawable r2 = r2.mutate()
            android.graphics.drawable.Drawable r2 = androidx.core.graphics.drawable.DrawableCompat.wrap(r2)
            java.lang.Integer r0 = r1.navigationIconTint
            int r0 = r0.intValue()
            androidx.core.graphics.drawable.DrawableCompat.setTint(r2, r0)
        L17:
            return r2
    }

    private void setActionMenuViewPosition() {
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.getActionMenuView()
            if (r0 == 0) goto L21
            android.animation.Animator r1 = r3.menuAnimator
            if (r1 != 0) goto L21
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r1)
            boolean r1 = r3.isFabVisibleOrWillBeShown()
            if (r1 != 0) goto L1a
            r1 = 0
            r3.translateActionMenuView(r0, r1, r1)
            goto L21
        L1a:
            int r1 = r3.fabAlignmentMode
            boolean r2 = r3.fabAttached
            r3.translateActionMenuView(r0, r1, r2)
        L21:
            return
    }

    private void setCutoutStateAndTranslateFab() {
            r3 = this;
            com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment r0 = r3.getTopEdgeTreatment()
            float r1 = r3.getFabTranslationX()
            r0.setHorizontalOffset(r1)
            com.google.android.material.shape.MaterialShapeDrawable r0 = r3.materialShapeDrawable
            boolean r1 = r3.fabAttached
            if (r1 == 0) goto L1f
            boolean r1 = r3.isFabVisibleOrWillBeShown()
            if (r1 == 0) goto L1f
            int r1 = r3.fabAnchorMode
            r2 = 1
            if (r1 != r2) goto L1f
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L20
        L1f:
            r1 = 0
        L20:
            r0.setInterpolation(r1)
            android.view.View r0 = r3.findDependentView()
            if (r0 == 0) goto L37
            float r1 = r3.getFabTranslationY()
            r0.setTranslationY(r1)
            float r1 = r3.getFabTranslationX()
            r0.setTranslationX(r1)
        L37:
            return
    }

    private void translateActionMenuView(@androidx.annotation.NonNull androidx.appcompat.widget.ActionMenuView r2, int r3, boolean r4) {
            r1 = this;
            r0 = 0
            r1.translateActionMenuView(r2, r3, r4, r0)
            return
    }

    private void translateActionMenuView(@androidx.annotation.NonNull androidx.appcompat.widget.ActionMenuView r2, int r3, boolean r4, boolean r5) {
            r1 = this;
            com.google.android.material.bottomappbar.BottomAppBar$8 r0 = new com.google.android.material.bottomappbar.BottomAppBar$8
            r0.<init>(r1, r2, r3, r4)
            if (r5 == 0) goto Lb
            r2.post(r0)
            goto Le
        Lb:
            r0.run()
        Le:
            return
    }

    private static void updateFabAnchorGravity(com.google.android.material.bottomappbar.BottomAppBar r2, android.view.View r3) {
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r3
            r0 = 17
            r3.anchorGravity = r0
            int r2 = r2.fabAnchorMode
            r1 = 1
            if (r2 != r1) goto L13
            r0 = r0 | 48
            r3.anchorGravity = r0
        L13:
            if (r2 != 0) goto L1b
            int r2 = r3.anchorGravity
            r2 = r2 | 80
            r3.anchorGravity = r2
        L1b:
            return
    }

    public void addOnScrollStateChangedListener(@androidx.annotation.NonNull com.google.android.material.behavior.HideBottomViewOnScrollBehavior.OnScrollStateChangedListener r2) {
            r1 = this;
            com.google.android.material.bottomappbar.BottomAppBar$Behavior r0 = r1.getBehavior()
            r0.addOnScrollStateChangedListener(r2)
            return
    }

    public void clearOnScrollStateChangedListeners() {
            r1 = this;
            com.google.android.material.bottomappbar.BottomAppBar$Behavior r0 = r1.getBehavior()
            r0.clearOnScrollStateChangedListeners()
            return
    }

    public final int getActionMenuViewTranslationX(@androidx.annotation.NonNull androidx.appcompat.widget.ActionMenuView r7, int r8, boolean r9) {
            r6 = this;
            int r0 = r6.menuAlignmentMode
            r1 = 1
            r2 = 0
            if (r0 == r1) goto Lb
            if (r8 != r1) goto La
            if (r9 != 0) goto Lb
        La:
            return r2
        Lb:
            boolean r8 = com.google.android.material.internal.ViewUtils.isLayoutRtl(r6)
            if (r8 == 0) goto L16
            int r9 = r6.getMeasuredWidth()
            goto L17
        L16:
            r9 = 0
        L17:
            r0 = 0
        L18:
            int r3 = r6.getChildCount()
            if (r0 >= r3) goto L56
            android.view.View r3 = r6.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            boolean r4 = r4 instanceof androidx.appcompat.widget.Toolbar.LayoutParams
            if (r4 == 0) goto L3d
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r4 = (androidx.appcompat.widget.Toolbar.LayoutParams) r4
            int r4 = r4.gravity
            r5 = 8388615(0x800007, float:1.1754953E-38)
            r4 = r4 & r5
            r5 = 8388611(0x800003, float:1.1754948E-38)
            if (r4 != r5) goto L3d
            r4 = 1
            goto L3e
        L3d:
            r4 = 0
        L3e:
            if (r4 == 0) goto L53
            if (r8 == 0) goto L4b
            int r3 = r3.getLeft()
            int r9 = java.lang.Math.min(r9, r3)
            goto L53
        L4b:
            int r3 = r3.getRight()
            int r9 = java.lang.Math.max(r9, r3)
        L53:
            int r0 = r0 + 1
            goto L18
        L56:
            if (r8 == 0) goto L5d
            int r7 = r7.getRight()
            goto L61
        L5d:
            int r7 = r7.getLeft()
        L61:
            if (r8 == 0) goto L66
            int r0 = r6.rightInset
            goto L69
        L66:
            int r0 = r6.leftInset
            int r0 = -r0
        L69:
            android.graphics.drawable.Drawable r1 = r6.getNavigationIcon()
            if (r1 != 0) goto L7f
            android.content.res.Resources r1 = r6.getResources()
            int r2 = com.google.android.material.R.dimen.m3_bottomappbar_horizontal_padding
            int r1 = r1.getDimensionPixelOffset(r2)
            if (r8 == 0) goto L7d
            r2 = r1
            goto L7f
        L7d:
            int r8 = -r1
            r2 = r8
        L7f:
            int r7 = r7 + r0
            int r7 = r7 + r2
            int r9 = r9 - r7
            return r9
    }

    @androidx.annotation.Nullable
    public android.content.res.ColorStateList getBackgroundTint() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.materialShapeDrawable
            android.content.res.ColorStateList r0 = r0.getTintList()
            return r0
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior getBehavior() {
            r1 = this;
            com.google.android.material.bottomappbar.BottomAppBar$Behavior r0 = r1.getBehavior()
            return r0
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @androidx.annotation.NonNull
    public com.google.android.material.bottomappbar.BottomAppBar.Behavior getBehavior() {
            r1 = this;
            com.google.android.material.bottomappbar.BottomAppBar$Behavior r0 = r1.behavior
            if (r0 != 0) goto Lb
            com.google.android.material.bottomappbar.BottomAppBar$Behavior r0 = new com.google.android.material.bottomappbar.BottomAppBar$Behavior
            r0.<init>()
            r1.behavior = r0
        Lb:
            com.google.android.material.bottomappbar.BottomAppBar$Behavior r0 = r1.behavior
            return r0
    }

    @androidx.annotation.Dimension
    public float getCradleVerticalOffset() {
            r1 = this;
            com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment r0 = r1.getTopEdgeTreatment()
            float r0 = r0.getCradleVerticalOffset()
            return r0
    }

    public int getFabAlignmentMode() {
            r1 = this;
            int r0 = r1.fabAlignmentMode
            return r0
    }

    @androidx.annotation.Px
    public int getFabAlignmentModeEndMargin() {
            r1 = this;
            int r0 = r1.fabAlignmentModeEndMargin
            return r0
    }

    public int getFabAnchorMode() {
            r1 = this;
            int r0 = r1.fabAnchorMode
            return r0
    }

    public int getFabAnimationMode() {
            r1 = this;
            int r0 = r1.fabAnimationMode
            return r0
    }

    public float getFabCradleMargin() {
            r1 = this;
            com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment r0 = r1.getTopEdgeTreatment()
            float r0 = r0.getFabCradleMargin()
            return r0
    }

    @androidx.annotation.Dimension
    public float getFabCradleRoundedCornerRadius() {
            r1 = this;
            com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment r0 = r1.getTopEdgeTreatment()
            float r0 = r0.getFabCradleRoundedCornerRadius()
            return r0
    }

    public boolean getHideOnScroll() {
            r1 = this;
            boolean r0 = r1.hideOnScroll
            return r0
    }

    public int getMenuAlignmentMode() {
            r1 = this;
            int r0 = r1.menuAlignmentMode
            return r0
    }

    public boolean isScrolledDown() {
            r1 = this;
            com.google.android.material.bottomappbar.BottomAppBar$Behavior r0 = r1.getBehavior()
            boolean r0 = r0.isScrolledDown()
            return r0
    }

    public boolean isScrolledUp() {
            r1 = this;
            com.google.android.material.bottomappbar.BottomAppBar$Behavior r0 = r1.getBehavior()
            boolean r0 = r0.isScrolledUp()
            return r0
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            com.google.android.material.shape.MaterialShapeDrawable r0 = r2.materialShapeDrawable
            com.google.android.material.shape.MaterialShapeUtils.setParentAbsoluteElevation(r2, r0)
            android.view.ViewParent r0 = r2.getParent()
            boolean r0 = r0 instanceof android.view.ViewGroup
            if (r0 == 0) goto L1a
            android.view.ViewParent r0 = r2.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r1 = 0
            r0.setClipChildren(r1)
        L1a:
            return
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            if (r1 == 0) goto L21
            r0.cancelAnimations()
            r0.setCutoutStateAndTranslateFab()
            android.view.View r1 = r0.findDependentView()
            if (r1 == 0) goto L21
            boolean r2 = androidx.core.view.ViewCompat.isLaidOut(r1)
            if (r2 == 0) goto L21
            androidx.activity.ComponentDialog$$ExternalSyntheticLambda0 r2 = new androidx.activity.ComponentDialog$$ExternalSyntheticLambda0
            r3 = 11
            r2.<init>(r1, r3)
            r1.post(r2)
        L21:
            r0.setActionMenuViewPosition()
            return
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.material.bottomappbar.BottomAppBar.SavedState
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            com.google.android.material.bottomappbar.BottomAppBar$SavedState r2 = (com.google.android.material.bottomappbar.BottomAppBar.SavedState) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            int r0 = r2.fabAlignmentMode
            r1.fabAlignmentMode = r0
            boolean r2 = r2.fabAttached
            r1.fabAttached = r2
            return
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    @androidx.annotation.NonNull
    public final android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            com.google.android.material.bottomappbar.BottomAppBar$SavedState r1 = new com.google.android.material.bottomappbar.BottomAppBar$SavedState
            r1.<init>(r0)
            int r0 = r2.fabAlignmentMode
            r1.fabAlignmentMode = r0
            boolean r0 = r2.fabAttached
            r1.fabAttached = r0
            return r1
    }

    public void performHide() {
            r1 = this;
            r0 = 1
            r1.performHide(r0)
            return
    }

    public void performHide(boolean r2) {
            r1 = this;
            com.google.android.material.bottomappbar.BottomAppBar$Behavior r0 = r1.getBehavior()
            r0.slideDown(r1, r2)
            return
    }

    public void performShow() {
            r1 = this;
            r0 = 1
            r1.performShow(r0)
            return
    }

    public void performShow(boolean r2) {
            r1 = this;
            com.google.android.material.bottomappbar.BottomAppBar$Behavior r0 = r1.getBehavior()
            r0.slideUp(r1, r2)
            return
    }

    public void removeOnScrollStateChangedListener(@androidx.annotation.NonNull com.google.android.material.behavior.HideBottomViewOnScrollBehavior.OnScrollStateChangedListener r2) {
            r1 = this;
            com.google.android.material.bottomappbar.BottomAppBar$Behavior r0 = r1.getBehavior()
            r0.removeOnScrollStateChangedListener(r2)
            return
    }

    public void replaceMenu(@androidx.annotation.MenuRes int r2) {
            r1 = this;
            if (r2 == 0) goto Lf
            r0 = 0
            r1.pendingMenuResId = r0
            android.view.Menu r0 = r1.getMenu()
            r0.clear()
            r1.inflateMenu(r2)
        Lf:
            return
    }

    public void setBackgroundTint(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.materialShapeDrawable
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r2)
            return
    }

    public void setCradleVerticalOffset(@androidx.annotation.Dimension float r2) {
            r1 = this;
            float r0 = r1.getCradleVerticalOffset()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L17
            com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment r0 = r1.getTopEdgeTreatment()
            r0.setCradleVerticalOffset(r2)
            com.google.android.material.shape.MaterialShapeDrawable r2 = r1.materialShapeDrawable
            r2.invalidateSelf()
            r1.setCutoutStateAndTranslateFab()
        L17:
            return
    }

    @Override // android.view.View
    public void setElevation(float r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.materialShapeDrawable
            r0.setElevation(r2)
            com.google.android.material.shape.MaterialShapeDrawable r2 = r1.materialShapeDrawable
            int r2 = r2.getShadowRadius()
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.materialShapeDrawable
            int r0 = r0.getShadowOffsetY()
            int r2 = r2 - r0
            com.google.android.material.bottomappbar.BottomAppBar$Behavior r0 = r1.getBehavior()
            r0.setAdditionalHiddenOffsetY(r1, r2)
            return
    }

    public void setFabAlignmentMode(int r2) {
            r1 = this;
            r0 = 0
            r1.setFabAlignmentModeAndReplaceMenu(r2, r0)
            return
    }

    public void setFabAlignmentModeAndReplaceMenu(int r1, @androidx.annotation.MenuRes int r2) {
            r0 = this;
            r0.pendingMenuResId = r2
            r2 = 1
            r0.menuAnimatingWithFabAlignmentMode = r2
            boolean r2 = r0.fabAttached
            r0.maybeAnimateMenuView(r1, r2)
            r0.maybeAnimateModeChange(r1)
            r0.fabAlignmentMode = r1
            return
    }

    public void setFabAlignmentModeEndMargin(@androidx.annotation.Px int r2) {
            r1 = this;
            int r0 = r1.fabAlignmentModeEndMargin
            if (r0 == r2) goto L9
            r1.fabAlignmentModeEndMargin = r2
            r1.setCutoutStateAndTranslateFab()
        L9:
            return
    }

    public void setFabAnchorMode(int r1) {
            r0 = this;
            r0.fabAnchorMode = r1
            r0.setCutoutStateAndTranslateFab()
            android.view.View r1 = r0.findDependentView()
            if (r1 == 0) goto L16
            updateFabAnchorGravity(r0, r1)
            r1.requestLayout()
            com.google.android.material.shape.MaterialShapeDrawable r1 = r0.materialShapeDrawable
            r1.invalidateSelf()
        L16:
            return
    }

    public void setFabAnimationMode(int r1) {
            r0 = this;
            r0.fabAnimationMode = r1
            return
    }

    public void setFabCornerSize(@androidx.annotation.Dimension float r2) {
            r1 = this;
            com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment r0 = r1.getTopEdgeTreatment()
            float r0 = r0.getFabCornerRadius()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L18
            com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment r0 = r1.getTopEdgeTreatment()
            r0.setFabCornerSize(r2)
            com.google.android.material.shape.MaterialShapeDrawable r2 = r1.materialShapeDrawable
            r2.invalidateSelf()
        L18:
            return
    }

    public void setFabCradleMargin(@androidx.annotation.Dimension float r2) {
            r1 = this;
            float r0 = r1.getFabCradleMargin()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L14
            com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment r0 = r1.getTopEdgeTreatment()
            r0.setFabCradleMargin(r2)
            com.google.android.material.shape.MaterialShapeDrawable r2 = r1.materialShapeDrawable
            r2.invalidateSelf()
        L14:
            return
    }

    public void setFabCradleRoundedCornerRadius(@androidx.annotation.Dimension float r2) {
            r1 = this;
            float r0 = r1.getFabCradleRoundedCornerRadius()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L14
            com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment r0 = r1.getTopEdgeTreatment()
            r0.setFabCradleRoundedCornerRadius(r2)
            com.google.android.material.shape.MaterialShapeDrawable r2 = r1.materialShapeDrawable
            r2.invalidateSelf()
        L14:
            return
    }

    public final boolean setFabDiameter(@androidx.annotation.Px int r2) {
            r1 = this;
            float r2 = (float) r2
            com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment r0 = r1.getTopEdgeTreatment()
            float r0 = r0.getFabDiameter()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L1b
            com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment r0 = r1.getTopEdgeTreatment()
            r0.setFabDiameter(r2)
            com.google.android.material.shape.MaterialShapeDrawable r2 = r1.materialShapeDrawable
            r2.invalidateSelf()
            r2 = 1
            return r2
        L1b:
            r2 = 0
            return r2
    }

    public void setHideOnScroll(boolean r1) {
            r0 = this;
            r0.hideOnScroll = r1
            return
    }

    public void setMenuAlignmentMode(int r3) {
            r2 = this;
            int r0 = r2.menuAlignmentMode
            if (r0 == r3) goto L15
            r2.menuAlignmentMode = r3
            androidx.appcompat.widget.ActionMenuView r3 = r2.getActionMenuView()
            if (r3 == 0) goto L15
            int r0 = r2.fabAlignmentMode
            boolean r1 = r2.isFabVisibleOrWillBeShown()
            r2.translateActionMenuView(r3, r0, r1)
        L15:
            return
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            android.graphics.drawable.Drawable r1 = r0.maybeTintNavigationIcon(r1)
            super.setNavigationIcon(r1)
            return
    }

    public void setNavigationIconTint(@androidx.annotation.ColorInt int r1) {
            r0 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.navigationIconTint = r1
            android.graphics.drawable.Drawable r1 = r0.getNavigationIcon()
            if (r1 == 0) goto Lf
            r0.setNavigationIcon(r1)
        Lf:
            return
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(java.lang.CharSequence r1) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(java.lang.CharSequence r1) {
            r0 = this;
            return
    }
}
