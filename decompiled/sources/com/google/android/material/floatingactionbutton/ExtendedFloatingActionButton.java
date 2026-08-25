package com.google.android.material.floatingactionbutton;

/* JADX INFO: loaded from: classes3.dex */
public class ExtendedFloatingActionButton extends com.google.android.material.button.MaterialButton implements androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior {
    private static final int ANIM_STATE_HIDING = 1;
    private static final int ANIM_STATE_NONE = 0;
    private static final int ANIM_STATE_SHOWING = 2;
    private static final int DEF_STYLE_RES = 0;
    private static final int EXTEND = 3;
    private static final int EXTEND_STRATEGY_AUTO = 0;
    private static final int EXTEND_STRATEGY_MATCH_PARENT = 2;
    private static final int EXTEND_STRATEGY_WRAP_CONTENT = 1;
    public static final android.util.Property<android.view.View, java.lang.Float> HEIGHT = null;
    private static final int HIDE = 1;
    public static final android.util.Property<android.view.View, java.lang.Float> PADDING_END = null;
    public static final android.util.Property<android.view.View, java.lang.Float> PADDING_START = null;
    private static final int SHOW = 0;
    private static final int SHRINK = 2;
    public static final android.util.Property<android.view.View, java.lang.Float> WIDTH = null;
    private int animState;
    private boolean animateShowBeforeLayout;

    @androidx.annotation.NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton> behavior;
    private final com.google.android.material.floatingactionbutton.AnimatorTracker changeVisibilityTracker;
    private final int collapsedSize;

    @androidx.annotation.NonNull
    private final com.google.android.material.floatingactionbutton.MotionStrategy extendStrategy;
    private final int extendStrategyType;
    private int extendedPaddingEnd;
    private int extendedPaddingStart;
    private final com.google.android.material.floatingactionbutton.MotionStrategy hideStrategy;
    private boolean isExtended;
    private boolean isTransforming;
    private int originalHeight;

    @androidx.annotation.NonNull
    public android.content.res.ColorStateList originalTextCsl;
    private int originalWidth;
    private final com.google.android.material.floatingactionbutton.MotionStrategy showStrategy;

    @androidx.annotation.NonNull
    private final com.google.android.material.floatingactionbutton.MotionStrategy shrinkStrategy;










    public class ChangeSizeStrategy extends com.google.android.material.floatingactionbutton.BaseMotionStrategy {
        private final boolean extending;
        private final com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size size;
        public final /* synthetic */ com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton this$0;

        public ChangeSizeStrategy(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r1, com.google.android.material.floatingactionbutton.AnimatorTracker r2, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size r3, boolean r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1, r2)
                r0.size = r3
                r0.extending = r4
                return
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        @androidx.annotation.NonNull
        public android.animation.AnimatorSet createAnimator() {
                r10 = this;
                com.google.android.material.animation.MotionSpec r0 = r10.getCurrentMotionSpec()
                java.lang.String r1 = "width"
                boolean r2 = r0.hasPropertyValues(r1)
                r3 = 1
                r4 = 2
                r5 = 0
                if (r2 == 0) goto L2f
                android.animation.PropertyValuesHolder[] r2 = r0.getPropertyValues(r1)
                r6 = r2[r5]
                float[] r7 = new float[r4]
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r8 = r10.this$0
                int r8 = r8.getWidth()
                float r8 = (float) r8
                r7[r5] = r8
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size r8 = r10.size
                int r8 = r8.getWidth()
                float r8 = (float) r8
                r7[r3] = r8
                r6.setFloatValues(r7)
                r0.setPropertyValues(r1, r2)
            L2f:
                java.lang.String r1 = "height"
                boolean r2 = r0.hasPropertyValues(r1)
                if (r2 == 0) goto L57
                android.animation.PropertyValuesHolder[] r2 = r0.getPropertyValues(r1)
                r6 = r2[r5]
                float[] r7 = new float[r4]
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r8 = r10.this$0
                int r8 = r8.getHeight()
                float r8 = (float) r8
                r7[r5] = r8
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size r8 = r10.size
                int r8 = r8.getHeight()
                float r8 = (float) r8
                r7[r3] = r8
                r6.setFloatValues(r7)
                r0.setPropertyValues(r1, r2)
            L57:
                java.lang.String r1 = "paddingStart"
                boolean r2 = r0.hasPropertyValues(r1)
                if (r2 == 0) goto L7f
                android.animation.PropertyValuesHolder[] r2 = r0.getPropertyValues(r1)
                r6 = r2[r5]
                float[] r7 = new float[r4]
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r8 = r10.this$0
                int r8 = androidx.core.view.ViewCompat.getPaddingStart(r8)
                float r8 = (float) r8
                r7[r5] = r8
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size r8 = r10.size
                int r8 = r8.getPaddingStart()
                float r8 = (float) r8
                r7[r3] = r8
                r6.setFloatValues(r7)
                r0.setPropertyValues(r1, r2)
            L7f:
                java.lang.String r1 = "paddingEnd"
                boolean r2 = r0.hasPropertyValues(r1)
                if (r2 == 0) goto La7
                android.animation.PropertyValuesHolder[] r2 = r0.getPropertyValues(r1)
                r6 = r2[r5]
                float[] r7 = new float[r4]
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r8 = r10.this$0
                int r8 = androidx.core.view.ViewCompat.getPaddingEnd(r8)
                float r8 = (float) r8
                r7[r5] = r8
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size r8 = r10.size
                int r8 = r8.getPaddingEnd()
                float r8 = (float) r8
                r7[r3] = r8
                r6.setFloatValues(r7)
                r0.setPropertyValues(r1, r2)
            La7:
                java.lang.String r1 = "labelOpacity"
                boolean r2 = r0.hasPropertyValues(r1)
                if (r2 == 0) goto Ld0
                android.animation.PropertyValuesHolder[] r2 = r0.getPropertyValues(r1)
                boolean r6 = r10.extending
                r7 = 0
                r8 = 1065353216(0x3f800000, float:1.0)
                if (r6 == 0) goto Lbc
                r9 = 0
                goto Lbe
            Lbc:
                r9 = 1065353216(0x3f800000, float:1.0)
            Lbe:
                if (r6 == 0) goto Lc2
                r7 = 1065353216(0x3f800000, float:1.0)
            Lc2:
                r6 = r2[r5]
                float[] r4 = new float[r4]
                r4[r5] = r9
                r4[r3] = r7
                r6.setFloatValues(r4)
                r0.setPropertyValues(r1, r2)
            Ld0:
                android.animation.AnimatorSet r0 = r10.createAnimator(r0)
                return r0
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public int getDefaultMotionSpecResource() {
                r1 = this;
                boolean r0 = r1.extending
                if (r0 == 0) goto L7
                int r0 = com.google.android.material.R.animator.mtrl_extended_fab_change_size_expand_motion_spec
                goto L9
            L7:
                int r0 = com.google.android.material.R.animator.mtrl_extended_fab_change_size_collapse_motion_spec
            L9:
                return r0
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationEnd() {
                r2 = this;
                super.onAnimationEnd()
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r2.this$0
                r1 = 0
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.access$602(r0, r1)
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r2.this$0
                r0.setHorizontallyScrolling(r1)
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r2.this$0
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                if (r0 != 0) goto L17
                return
            L17:
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size r1 = r2.size
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                int r1 = r1.width
                r0.width = r1
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size r1 = r2.size
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                int r1 = r1.height
                r0.height = r1
                return
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationStart(android.animation.Animator r2) {
                r1 = this;
                super.onAnimationStart(r2)
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r2 = r1.this$0
                boolean r0 = r1.extending
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.access$502(r2, r0)
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r2 = r1.this$0
                r0 = 1
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.access$602(r2, r0)
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r2 = r1.this$0
                r2.setHorizontallyScrolling(r0)
                return
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void onChange(@androidx.annotation.Nullable com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback r2) {
                r1 = this;
                if (r2 != 0) goto L3
                return
            L3:
                boolean r0 = r1.extending
                if (r0 == 0) goto Ld
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r1.this$0
                r2.onExtended(r0)
                goto L12
            Ld:
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r1.this$0
                r2.onShrunken(r0)
            L12:
                return
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void performNow() {
                r5 = this;
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r5.this$0
                boolean r1 = r5.extending
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.access$502(r0, r1)
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r5.this$0
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                if (r0 != 0) goto L10
                return
            L10:
                boolean r1 = r5.extending
                if (r1 != 0) goto L22
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r1 = r5.this$0
                int r2 = r0.width
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.access$302(r1, r2)
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r1 = r5.this$0
                int r2 = r0.height
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.access$202(r1, r2)
            L22:
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size r1 = r5.size
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                int r1 = r1.width
                r0.width = r1
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size r1 = r5.size
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                int r1 = r1.height
                r0.height = r1
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r5.this$0
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size r1 = r5.size
                int r1 = r1.getPaddingStart()
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r2 = r5.this$0
                int r2 = r2.getPaddingTop()
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size r3 = r5.size
                int r3 = r3.getPaddingEnd()
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r4 = r5.this$0
                int r4 = r4.getPaddingBottom()
                androidx.core.view.ViewCompat.setPaddingRelative(r0, r1, r2, r3, r4)
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r5.this$0
                r0.requestLayout()
                return
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public boolean shouldCancel() {
                r2 = this;
                boolean r0 = r2.extending
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r1 = r2.this$0
                boolean r1 = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.access$500(r1)
                if (r0 == r1) goto L21
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r2.this$0
                android.graphics.drawable.Drawable r0 = r0.getIcon()
                if (r0 == 0) goto L21
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r2.this$0
                java.lang.CharSequence r0 = r0.getText()
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L1f
                goto L21
            L1f:
                r0 = 0
                goto L22
            L21:
                r0 = 1
            L22:
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class ExtendedFloatingActionButtonBehavior<T extends com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton> extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<T> {
        private static final boolean AUTO_HIDE_DEFAULT = false;
        private static final boolean AUTO_SHRINK_DEFAULT = true;
        private boolean autoHideEnabled;
        private boolean autoShrinkEnabled;

        @androidx.annotation.Nullable
        private com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback internalAutoHideCallback;

        @androidx.annotation.Nullable
        private com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback internalAutoShrinkCallback;
        private android.graphics.Rect tmpRect;

        public ExtendedFloatingActionButtonBehavior() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.autoHideEnabled = r0
                r0 = 1
                r1.autoShrinkEnabled = r0
                return
        }

        public ExtendedFloatingActionButtonBehavior(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
                r1 = this;
                r1.<init>(r2, r3)
                int[] r0 = com.google.android.material.R.styleable.ExtendedFloatingActionButton_Behavior_Layout
                android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
                int r3 = com.google.android.material.R.styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide
                r0 = 0
                boolean r3 = r2.getBoolean(r3, r0)
                r1.autoHideEnabled = r3
                int r3 = com.google.android.material.R.styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink
                r0 = 1
                boolean r3 = r2.getBoolean(r3, r0)
                r1.autoShrinkEnabled = r3
                r2.recycle()
                return
        }

        private static boolean isBottomSheet(@androidx.annotation.NonNull android.view.View r1) {
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                boolean r0 = r1 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams
                if (r0 == 0) goto L11
                androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r1
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r1 = r1.getBehavior()
                boolean r1 = r1 instanceof com.google.android.material.bottomsheet.BottomSheetBehavior
                return r1
            L11:
                r1 = 0
                return r1
        }

        private boolean shouldUpdateVisibility(@androidx.annotation.NonNull android.view.View r3, @androidx.annotation.NonNull com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r4) {
                r2 = this;
                android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r4
                boolean r0 = r2.autoHideEnabled
                r1 = 0
                if (r0 != 0) goto L10
                boolean r0 = r2.autoShrinkEnabled
                if (r0 != 0) goto L10
                return r1
            L10:
                int r4 = r4.getAnchorId()
                int r3 = r3.getId()
                if (r4 == r3) goto L1b
                return r1
            L1b:
                r3 = 1
                return r3
        }

        private boolean updateFabVisibilityForAppBarLayout(androidx.coordinatorlayout.widget.CoordinatorLayout r3, @androidx.annotation.NonNull com.google.android.material.appbar.AppBarLayout r4, @androidx.annotation.NonNull com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r5) {
                r2 = this;
                boolean r0 = r2.shouldUpdateVisibility(r4, r5)
                r1 = 0
                if (r0 != 0) goto L8
                return r1
            L8:
                android.graphics.Rect r0 = r2.tmpRect
                if (r0 != 0) goto L13
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r2.tmpRect = r0
            L13:
                android.graphics.Rect r0 = r2.tmpRect
                com.google.android.material.internal.DescendantOffsetUtils.getDescendantRect(r3, r4, r0)
                int r3 = r0.bottom
                int r4 = r4.getMinimumHeightForVisibleOverlappingContent()
                r0 = 1
                if (r3 > r4) goto L33
                boolean r3 = r2.autoShrinkEnabled
                if (r3 == 0) goto L28
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$OnChangedCallback r4 = r2.internalAutoShrinkCallback
                goto L2a
            L28:
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$OnChangedCallback r4 = r2.internalAutoHideCallback
            L2a:
                if (r3 == 0) goto L2e
                r3 = 2
                goto L2f
            L2e:
                r3 = 1
            L2f:
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.access$400(r5, r3, r4)
                goto L42
            L33:
                boolean r3 = r2.autoShrinkEnabled
                if (r3 == 0) goto L3a
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$OnChangedCallback r4 = r2.internalAutoShrinkCallback
                goto L3c
            L3a:
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$OnChangedCallback r4 = r2.internalAutoHideCallback
            L3c:
                if (r3 == 0) goto L3f
                r1 = 3
            L3f:
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.access$400(r5, r1, r4)
            L42:
                return r0
        }

        private boolean updateFabVisibilityForBottomSheet(@androidx.annotation.NonNull android.view.View r5, @androidx.annotation.NonNull com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r6) {
                r4 = this;
                boolean r0 = r4.shouldUpdateVisibility(r5, r6)
                r1 = 0
                if (r0 != 0) goto L8
                return r1
            L8:
                android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
                int r5 = r5.getTop()
                int r2 = r6.getHeight()
                r3 = 2
                int r2 = r2 / r3
                int r0 = r0.topMargin
                int r2 = r2 + r0
                r0 = 1
                if (r5 >= r2) goto L2f
                boolean r5 = r4.autoShrinkEnabled
                if (r5 == 0) goto L25
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$OnChangedCallback r1 = r4.internalAutoShrinkCallback
                goto L27
            L25:
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$OnChangedCallback r1 = r4.internalAutoHideCallback
            L27:
                if (r5 == 0) goto L2a
                goto L2b
            L2a:
                r3 = 1
            L2b:
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.access$400(r6, r3, r1)
                goto L3e
            L2f:
                boolean r5 = r4.autoShrinkEnabled
                if (r5 == 0) goto L36
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$OnChangedCallback r2 = r4.internalAutoShrinkCallback
                goto L38
            L36:
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$OnChangedCallback r2 = r4.internalAutoHideCallback
            L38:
                if (r5 == 0) goto L3b
                r1 = 3
            L3b:
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.access$400(r6, r1, r2)
            L3e:
                return r0
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean getInsetDodgeRect(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull android.graphics.Rect r3) {
                r0 = this;
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r2 = (com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton) r2
                boolean r1 = r0.getInsetDodgeRect(r1, r2, r3)
                return r1
        }

        public boolean getInsetDodgeRect(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r2, @androidx.annotation.NonNull android.graphics.Rect r3) {
                r0 = this;
                boolean r1 = super.getInsetDodgeRect(r1, r2, r3)
                return r1
        }

        public boolean isAutoHideEnabled() {
                r1 = this;
                boolean r0 = r1.autoHideEnabled
                return r0
        }

        public boolean isAutoShrinkEnabled() {
                r1 = this;
                boolean r0 = r1.autoShrinkEnabled
                return r0
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onAttachedToLayoutParams(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams r2) {
                r1 = this;
                int r0 = r2.dodgeInsetEdges
                if (r0 != 0) goto L8
                r0 = 80
                r2.dodgeInsetEdges = r0
            L8:
                return
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onDependentViewChanged(androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull android.view.View r2, android.view.View r3) {
                r0 = this;
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r2 = (com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton) r2
                boolean r1 = r0.onDependentViewChanged(r1, r2, r3)
                return r1
        }

        public boolean onDependentViewChanged(androidx.coordinatorlayout.widget.CoordinatorLayout r2, @androidx.annotation.NonNull com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r3, android.view.View r4) {
                r1 = this;
                boolean r0 = r4 instanceof com.google.android.material.appbar.AppBarLayout
                if (r0 == 0) goto La
                com.google.android.material.appbar.AppBarLayout r4 = (com.google.android.material.appbar.AppBarLayout) r4
                r1.updateFabVisibilityForAppBarLayout(r2, r4, r3)
                goto L13
            La:
                boolean r2 = isBottomSheet(r4)
                if (r2 == 0) goto L13
                r1.updateFabVisibilityForBottomSheet(r4, r3)
            L13:
                r2 = 0
                return r2
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull android.view.View r2, int r3) {
                r0 = this;
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r2 = (com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton) r2
                boolean r1 = r0.onLayoutChild(r1, r2, r3)
                return r1
        }

        public boolean onLayoutChild(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r6, @androidx.annotation.NonNull com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r7, int r8) {
                r5 = this;
                java.util.List r0 = r6.getDependencies(r7)
                int r1 = r0.size()
                r2 = 0
            L9:
                if (r2 >= r1) goto L2e
                java.lang.Object r3 = r0.get(r2)
                android.view.View r3 = (android.view.View) r3
                boolean r4 = r3 instanceof com.google.android.material.appbar.AppBarLayout
                if (r4 == 0) goto L1e
                com.google.android.material.appbar.AppBarLayout r3 = (com.google.android.material.appbar.AppBarLayout) r3
                boolean r3 = r5.updateFabVisibilityForAppBarLayout(r6, r3, r7)
                if (r3 == 0) goto L2b
                goto L2e
            L1e:
                boolean r4 = isBottomSheet(r3)
                if (r4 == 0) goto L2b
                boolean r3 = r5.updateFabVisibilityForBottomSheet(r3, r7)
                if (r3 == 0) goto L2b
                goto L2e
            L2b:
                int r2 = r2 + 1
                goto L9
            L2e:
                r6.onLayoutChild(r7, r8)
                r6 = 1
                return r6
        }

        public void setAutoHideEnabled(boolean r1) {
                r0 = this;
                r0.autoHideEnabled = r1
                return
        }

        public void setAutoShrinkEnabled(boolean r1) {
                r0 = this;
                r0.autoShrinkEnabled = r1
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class HideStrategy extends com.google.android.material.floatingactionbutton.BaseMotionStrategy {
        private boolean isCancelled;
        public final /* synthetic */ com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton this$0;

        public HideStrategy(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r1, com.google.android.material.floatingactionbutton.AnimatorTracker r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1, r2)
                return
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public int getDefaultMotionSpecResource() {
                r1 = this;
                int r0 = com.google.android.material.R.animator.mtrl_extended_fab_hide_motion_spec
                return r0
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationCancel() {
                r1 = this;
                super.onAnimationCancel()
                r0 = 1
                r1.isCancelled = r0
                return
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationEnd() {
                r2 = this;
                super.onAnimationEnd()
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r2.this$0
                r1 = 0
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.access$702(r0, r1)
                boolean r0 = r2.isCancelled
                if (r0 != 0) goto L14
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r2.this$0
                r1 = 8
                r0.setVisibility(r1)
            L14:
                return
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationStart(android.animation.Animator r2) {
                r1 = this;
                super.onAnimationStart(r2)
                r2 = 0
                r1.isCancelled = r2
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r1.this$0
                r0.setVisibility(r2)
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r2 = r1.this$0
                r0 = 1
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.access$702(r2, r0)
                return
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void onChange(@androidx.annotation.Nullable com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback r2) {
                r1 = this;
                if (r2 == 0) goto L7
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r1.this$0
                r2.onHidden(r0)
            L7:
                return
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void performNow() {
                r2 = this;
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r2.this$0
                r1 = 8
                r0.setVisibility(r1)
                return
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public boolean shouldCancel() {
                r1 = this;
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r1.this$0
                boolean r0 = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.access$900(r0)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class OnChangedCallback {
        public OnChangedCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onExtended(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r1) {
                r0 = this;
                return
        }

        public void onHidden(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r1) {
                r0 = this;
                return
        }

        public void onShown(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r1) {
                r0 = this;
                return
        }

        public void onShrunken(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r1) {
                r0 = this;
                return
        }
    }

    public class ShowStrategy extends com.google.android.material.floatingactionbutton.BaseMotionStrategy {
        public final /* synthetic */ com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton this$0;

        public ShowStrategy(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r1, com.google.android.material.floatingactionbutton.AnimatorTracker r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1, r2)
                return
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public int getDefaultMotionSpecResource() {
                r1 = this;
                int r0 = com.google.android.material.R.animator.mtrl_extended_fab_show_motion_spec
                return r0
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationEnd() {
                r2 = this;
                super.onAnimationEnd()
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r2.this$0
                r1 = 0
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.access$702(r0, r1)
                return
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationStart(android.animation.Animator r2) {
                r1 = this;
                super.onAnimationStart(r2)
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r2 = r1.this$0
                r0 = 0
                r2.setVisibility(r0)
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r2 = r1.this$0
                r0 = 2
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.access$702(r2, r0)
                return
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void onChange(@androidx.annotation.Nullable com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback r2) {
                r1 = this;
                if (r2 == 0) goto L7
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r1.this$0
                r2.onShown(r0)
            L7:
                return
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void performNow() {
                r2 = this;
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r2.this$0
                r1 = 0
                r0.setVisibility(r1)
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r2.this$0
                r1 = 1065353216(0x3f800000, float:1.0)
                r0.setAlpha(r1)
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r2.this$0
                r0.setScaleY(r1)
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r2.this$0
                r0.setScaleX(r1)
                return
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public boolean shouldCancel() {
                r1 = this;
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r1.this$0
                boolean r0 = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.access$800(r0)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface Size {
        int getHeight();

        android.view.ViewGroup.LayoutParams getLayoutParams();

        int getPaddingEnd();

        int getPaddingStart();

        int getWidth();
    }

    static {
            int r0 = com.google.android.material.R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.DEF_STYLE_RES = r0
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$6 r0 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$6
            r0.<init>()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.WIDTH = r0
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$7 r0 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$7
            r0.<init>()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.HEIGHT = r0
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$8 r0 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$8
            r0.<init>()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.PADDING_START = r0
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$9 r0 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$9
            r0.<init>()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.PADDING_END = r0
            return
    }

    public ExtendedFloatingActionButton(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ExtendedFloatingActionButton(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.R.attr.extendedFloatingActionButtonStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public ExtendedFloatingActionButton(@androidx.annotation.NonNull android.content.Context r17, @androidx.annotation.Nullable android.util.AttributeSet r18, int r19) {
            r16 = this;
            r0 = r16
            r7 = r18
            r8 = r19
            int r9 = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.DEF_STYLE_RES
            r1 = r17
            android.content.Context r1 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = 0
            r0.animState = r10
            com.google.android.material.floatingactionbutton.AnimatorTracker r1 = new com.google.android.material.floatingactionbutton.AnimatorTracker
            r1.<init>()
            r0.changeVisibilityTracker = r1
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ShowStrategy r11 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ShowStrategy
            r11.<init>(r0, r1)
            r0.showStrategy = r11
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$HideStrategy r12 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$HideStrategy
            r12.<init>(r0, r1)
            r0.hideStrategy = r12
            r13 = 1
            r0.isExtended = r13
            r0.isTransforming = r10
            r0.animateShowBeforeLayout = r10
            android.content.Context r14 = r16.getContext()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior r1 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior
            r1.<init>(r14, r7)
            r0.behavior = r1
            int[] r3 = com.google.android.material.R.styleable.ExtendedFloatingActionButton
            int[] r6 = new int[r10]
            r1 = r14
            r2 = r18
            r4 = r19
            r5 = r9
            android.content.res.TypedArray r1 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r1, r2, r3, r4, r5, r6)
            int r2 = com.google.android.material.R.styleable.ExtendedFloatingActionButton_showMotionSpec
            com.google.android.material.animation.MotionSpec r2 = com.google.android.material.animation.MotionSpec.createFromAttribute(r14, r1, r2)
            int r3 = com.google.android.material.R.styleable.ExtendedFloatingActionButton_hideMotionSpec
            com.google.android.material.animation.MotionSpec r3 = com.google.android.material.animation.MotionSpec.createFromAttribute(r14, r1, r3)
            int r4 = com.google.android.material.R.styleable.ExtendedFloatingActionButton_extendMotionSpec
            com.google.android.material.animation.MotionSpec r4 = com.google.android.material.animation.MotionSpec.createFromAttribute(r14, r1, r4)
            int r5 = com.google.android.material.R.styleable.ExtendedFloatingActionButton_shrinkMotionSpec
            com.google.android.material.animation.MotionSpec r5 = com.google.android.material.animation.MotionSpec.createFromAttribute(r14, r1, r5)
            int r6 = com.google.android.material.R.styleable.ExtendedFloatingActionButton_collapsedSize
            r15 = -1
            int r6 = r1.getDimensionPixelSize(r6, r15)
            r0.collapsedSize = r6
            int r6 = com.google.android.material.R.styleable.ExtendedFloatingActionButton_extendStrategy
            int r6 = r1.getInt(r6, r13)
            r0.extendStrategyType = r6
            int r15 = androidx.core.view.ViewCompat.getPaddingStart(r16)
            r0.extendedPaddingStart = r15
            int r15 = androidx.core.view.ViewCompat.getPaddingEnd(r16)
            r0.extendedPaddingEnd = r15
            com.google.android.material.floatingactionbutton.AnimatorTracker r15 = new com.google.android.material.floatingactionbutton.AnimatorTracker
            r15.<init>()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ChangeSizeStrategy r10 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ChangeSizeStrategy
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size r6 = r0.getSizeFromExtendStrategyType(r6)
            r10.<init>(r0, r15, r6, r13)
            r0.extendStrategy = r10
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ChangeSizeStrategy r6 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ChangeSizeStrategy
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$1 r13 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$1
            r13.<init>(r0)
            r7 = 0
            r6.<init>(r0, r15, r13, r7)
            r0.shrinkStrategy = r6
            r11.setMotionSpec(r2)
            r12.setMotionSpec(r3)
            r10.setMotionSpec(r4)
            r6.setMotionSpec(r5)
            r1.recycle()
            com.google.android.material.shape.CornerSize r1 = com.google.android.material.shape.ShapeAppearanceModel.PILL
            r2 = r18
            com.google.android.material.shape.ShapeAppearanceModel$Builder r1 = com.google.android.material.shape.ShapeAppearanceModel.builder(r14, r2, r8, r9, r1)
            com.google.android.material.shape.ShapeAppearanceModel r1 = r1.build()
            r0.setShapeAppearanceModel(r1)
            r16.saveOriginalTextCsl()
            return
    }

    public static /* synthetic */ int access$000(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0) {
            int r0 = r0.extendedPaddingStart
            return r0
    }

    public static /* synthetic */ int access$100(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0) {
            int r0 = r0.extendedPaddingEnd
            return r0
    }

    public static /* synthetic */ int access$200(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0) {
            int r0 = r0.originalHeight
            return r0
    }

    public static /* synthetic */ int access$202(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0, int r1) {
            r0.originalHeight = r1
            return r1
    }

    public static /* synthetic */ int access$300(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0) {
            int r0 = r0.originalWidth
            return r0
    }

    public static /* synthetic */ int access$302(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0, int r1) {
            r0.originalWidth = r1
            return r1
    }

    public static /* synthetic */ void access$400(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0, int r1, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback r2) {
            r0.performMotion(r1, r2)
            return
    }

    public static /* synthetic */ boolean access$500(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0) {
            boolean r0 = r0.isExtended
            return r0
    }

    public static /* synthetic */ boolean access$502(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0, boolean r1) {
            r0.isExtended = r1
            return r1
    }

    public static /* synthetic */ boolean access$602(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0, boolean r1) {
            r0.isTransforming = r1
            return r1
    }

    public static /* synthetic */ int access$702(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0, int r1) {
            r0.animState = r1
            return r1
    }

    public static /* synthetic */ boolean access$800(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0) {
            boolean r0 = r0.isOrWillBeShown()
            return r0
    }

    public static /* synthetic */ boolean access$900(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0) {
            boolean r0 = r0.isOrWillBeHidden()
            return r0
    }

    private com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size getSizeFromExtendStrategyType(int r5) {
            r4 = this;
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$2 r0 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$2
            r0.<init>(r4)
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$3 r1 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$3
            r1.<init>(r4, r0)
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$4 r2 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$4
            r2.<init>(r4, r1, r0)
            r3 = 1
            if (r5 == r3) goto L17
            r0 = 2
            if (r5 == r0) goto L16
            return r2
        L16:
            return r1
        L17:
            return r0
    }

    private boolean isOrWillBeHidden() {
            r4 = this;
            int r0 = r4.getVisibility()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto Le
            int r0 = r4.animState
            if (r0 != r2) goto Ld
            r1 = 1
        Ld:
            return r1
        Le:
            int r0 = r4.animState
            r3 = 2
            if (r0 == r3) goto L14
            r1 = 1
        L14:
            return r1
    }

    private boolean isOrWillBeShown() {
            r4 = this;
            int r0 = r4.getVisibility()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lf
            int r0 = r4.animState
            r3 = 2
            if (r0 != r3) goto Le
            r1 = 1
        Le:
            return r1
        Lf:
            int r0 = r4.animState
            if (r0 == r2) goto L14
            r1 = 1
        L14:
            return r1
    }

    private void performMotion(int r4, @androidx.annotation.Nullable com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback r5) {
            r3 = this;
            r0 = 2
            if (r4 == 0) goto L20
            r1 = 1
            if (r4 == r1) goto L1d
            if (r4 == r0) goto L1a
            r1 = 3
            if (r4 != r1) goto Le
            com.google.android.material.floatingactionbutton.MotionStrategy r1 = r3.extendStrategy
            goto L22
        Le:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unknown strategy type: "
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r4)
            r5.<init>(r4)
            throw r5
        L1a:
            com.google.android.material.floatingactionbutton.MotionStrategy r1 = r3.shrinkStrategy
            goto L22
        L1d:
            com.google.android.material.floatingactionbutton.MotionStrategy r1 = r3.hideStrategy
            goto L22
        L20:
            com.google.android.material.floatingactionbutton.MotionStrategy r1 = r3.showStrategy
        L22:
            boolean r2 = r1.shouldCancel()
            if (r2 == 0) goto L29
            return
        L29:
            boolean r2 = r3.shouldAnimateVisibilityChange()
            if (r2 != 0) goto L36
            r1.performNow()
            r1.onChange(r5)
            return
        L36:
            if (r4 != r0) goto L53
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            if (r4 == 0) goto L47
            int r0 = r4.width
            r3.originalWidth = r0
            int r4 = r4.height
            r3.originalHeight = r4
            goto L53
        L47:
            int r4 = r3.getWidth()
            r3.originalWidth = r4
            int r4 = r3.getHeight()
            r3.originalHeight = r4
        L53:
            r4 = 0
            r3.measure(r4, r4)
            android.animation.AnimatorSet r4 = r1.createAnimator()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$5 r0 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$5
            r0.<init>(r1, r5)
            r4.addListener(r0)
            java.util.List r5 = r1.getListeners()
            java.util.Iterator r5 = r5.iterator()
        L6b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L7b
            java.lang.Object r0 = r5.next()
            android.animation.Animator$AnimatorListener r0 = (android.animation.Animator.AnimatorListener) r0
            r4.addListener(r0)
            goto L6b
        L7b:
            r4.start()
            return
    }

    private void saveOriginalTextCsl() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.getTextColors()
            r1.originalTextCsl = r0
            return
    }

    private boolean shouldAnimateVisibilityChange() {
            r1 = this;
            boolean r0 = androidx.core.view.ViewCompat.isLaidOut(r1)
            if (r0 != 0) goto L10
            boolean r0 = r1.isOrWillBeShown()
            if (r0 != 0) goto L18
            boolean r0 = r1.animateShowBeforeLayout
            if (r0 == 0) goto L18
        L10:
            boolean r0 = r1.isInEditMode()
            if (r0 != 0) goto L18
            r0 = 1
            goto L19
        L18:
            r0 = 0
        L19:
            return r0
    }

    public void addOnExtendAnimationListener(@androidx.annotation.NonNull android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.extendStrategy
            r0.addAnimationListener(r2)
            return
    }

    public void addOnHideAnimationListener(@androidx.annotation.NonNull android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.hideStrategy
            r0.addAnimationListener(r2)
            return
    }

    public void addOnShowAnimationListener(@androidx.annotation.NonNull android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.showStrategy
            r0.addAnimationListener(r2)
            return
    }

    public void addOnShrinkAnimationListener(@androidx.annotation.NonNull android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.shrinkStrategy
            r0.addAnimationListener(r2)
            return
    }

    public void extend() {
            r2 = this;
            r0 = 3
            r1 = 0
            r2.performMotion(r0, r1)
            return
    }

    public void extend(@androidx.annotation.NonNull com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback r2) {
            r1 = this;
            r0 = 3
            r1.performMotion(r0, r2)
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @androidx.annotation.NonNull
    public androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton> getBehavior() {
            r1 = this;
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior<com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton> r0 = r1.behavior
            return r0
    }

    public int getCollapsedPadding() {
            r2 = this;
            int r0 = r2.getCollapsedSize()
            int r1 = r2.getIconSize()
            int r0 = r0 - r1
            int r0 = r0 / 2
            return r0
    }

    @androidx.annotation.VisibleForTesting
    public int getCollapsedSize() {
            r2 = this;
            int r0 = r2.collapsedSize
            if (r0 >= 0) goto L17
            int r0 = androidx.core.view.ViewCompat.getPaddingStart(r2)
            int r1 = androidx.core.view.ViewCompat.getPaddingEnd(r2)
            int r0 = java.lang.Math.min(r0, r1)
            int r0 = r0 * 2
            int r1 = r2.getIconSize()
            int r0 = r0 + r1
        L17:
            return r0
    }

    @androidx.annotation.Nullable
    public com.google.android.material.animation.MotionSpec getExtendMotionSpec() {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.extendStrategy
            com.google.android.material.animation.MotionSpec r0 = r0.getMotionSpec()
            return r0
    }

    @androidx.annotation.Nullable
    public com.google.android.material.animation.MotionSpec getHideMotionSpec() {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.hideStrategy
            com.google.android.material.animation.MotionSpec r0 = r0.getMotionSpec()
            return r0
    }

    @androidx.annotation.Nullable
    public com.google.android.material.animation.MotionSpec getShowMotionSpec() {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.showStrategy
            com.google.android.material.animation.MotionSpec r0 = r0.getMotionSpec()
            return r0
    }

    @androidx.annotation.Nullable
    public com.google.android.material.animation.MotionSpec getShrinkMotionSpec() {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.shrinkStrategy
            com.google.android.material.animation.MotionSpec r0 = r0.getMotionSpec()
            return r0
    }

    public void hide() {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.performMotion(r0, r1)
            return
    }

    public void hide(@androidx.annotation.NonNull com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback r2) {
            r1 = this;
            r0 = 1
            r1.performMotion(r0, r2)
            return
    }

    public final boolean isExtended() {
            r1 = this;
            boolean r0 = r1.isExtended
            return r0
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            boolean r0 = r1.isExtended
            if (r0 == 0) goto L1f
            java.lang.CharSequence r0 = r1.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1f
            android.graphics.drawable.Drawable r0 = r1.getIcon()
            if (r0 == 0) goto L1f
            r0 = 0
            r1.isExtended = r0
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.shrinkStrategy
            r0.performNow()
        L1f:
            return
    }

    public void removeOnExtendAnimationListener(@androidx.annotation.NonNull android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.extendStrategy
            r0.removeAnimationListener(r2)
            return
    }

    public void removeOnHideAnimationListener(@androidx.annotation.NonNull android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.hideStrategy
            r0.removeAnimationListener(r2)
            return
    }

    public void removeOnShowAnimationListener(@androidx.annotation.NonNull android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.showStrategy
            r0.removeAnimationListener(r2)
            return
    }

    public void removeOnShrinkAnimationListener(@androidx.annotation.NonNull android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.shrinkStrategy
            r0.removeAnimationListener(r2)
            return
    }

    public void setAnimateShowBeforeLayout(boolean r1) {
            r0 = this;
            r0.animateShowBeforeLayout = r1
            return
    }

    public void setExtendMotionSpec(@androidx.annotation.Nullable com.google.android.material.animation.MotionSpec r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.extendStrategy
            r0.setMotionSpec(r2)
            return
    }

    public void setExtendMotionSpecResource(@androidx.annotation.AnimatorRes int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            com.google.android.material.animation.MotionSpec r2 = com.google.android.material.animation.MotionSpec.createFromResource(r0, r2)
            r1.setExtendMotionSpec(r2)
            return
    }

    public void setExtended(boolean r2) {
            r1 = this;
            boolean r0 = r1.isExtended
            if (r0 != r2) goto L5
            return
        L5:
            if (r2 == 0) goto La
            com.google.android.material.floatingactionbutton.MotionStrategy r2 = r1.extendStrategy
            goto Lc
        La:
            com.google.android.material.floatingactionbutton.MotionStrategy r2 = r1.shrinkStrategy
        Lc:
            boolean r0 = r2.shouldCancel()
            if (r0 == 0) goto L13
            return
        L13:
            r2.performNow()
            return
    }

    public void setHideMotionSpec(@androidx.annotation.Nullable com.google.android.material.animation.MotionSpec r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.hideStrategy
            r0.setMotionSpec(r2)
            return
    }

    public void setHideMotionSpecResource(@androidx.annotation.AnimatorRes int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            com.google.android.material.animation.MotionSpec r2 = com.google.android.material.animation.MotionSpec.createFromResource(r0, r2)
            r1.setHideMotionSpec(r2)
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.setPadding(r1, r2, r3, r4)
            boolean r1 = r0.isExtended
            if (r1 == 0) goto L17
            boolean r1 = r0.isTransforming
            if (r1 != 0) goto L17
            int r1 = androidx.core.view.ViewCompat.getPaddingStart(r0)
            r0.extendedPaddingStart = r1
            int r1 = androidx.core.view.ViewCompat.getPaddingEnd(r0)
            r0.extendedPaddingEnd = r1
        L17:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.setPaddingRelative(r1, r2, r3, r4)
            boolean r2 = r0.isExtended
            if (r2 == 0) goto Lf
            boolean r2 = r0.isTransforming
            if (r2 != 0) goto Lf
            r0.extendedPaddingStart = r1
            r0.extendedPaddingEnd = r3
        Lf:
            return
    }

    public void setShowMotionSpec(@androidx.annotation.Nullable com.google.android.material.animation.MotionSpec r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.showStrategy
            r0.setMotionSpec(r2)
            return
    }

    public void setShowMotionSpecResource(@androidx.annotation.AnimatorRes int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            com.google.android.material.animation.MotionSpec r2 = com.google.android.material.animation.MotionSpec.createFromResource(r0, r2)
            r1.setShowMotionSpec(r2)
            return
    }

    public void setShrinkMotionSpec(@androidx.annotation.Nullable com.google.android.material.animation.MotionSpec r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.shrinkStrategy
            r0.setMotionSpec(r2)
            return
    }

    public void setShrinkMotionSpecResource(@androidx.annotation.AnimatorRes int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            com.google.android.material.animation.MotionSpec r2 = com.google.android.material.animation.MotionSpec.createFromResource(r0, r2)
            r1.setShrinkMotionSpec(r2)
            return
    }

    @Override // android.widget.TextView
    public void setTextColor(int r1) {
            r0 = this;
            super.setTextColor(r1)
            r0.saveOriginalTextCsl()
            return
    }

    @Override // android.widget.TextView
    public void setTextColor(@androidx.annotation.NonNull android.content.res.ColorStateList r1) {
            r0 = this;
            super.setTextColor(r1)
            r0.saveOriginalTextCsl()
            return
    }

    public void show() {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.performMotion(r0, r1)
            return
    }

    public void show(@androidx.annotation.NonNull com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback r2) {
            r1 = this;
            r0 = 0
            r1.performMotion(r0, r2)
            return
    }

    public void shrink() {
            r2 = this;
            r0 = 2
            r1 = 0
            r2.performMotion(r0, r1)
            return
    }

    public void shrink(@androidx.annotation.NonNull com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback r2) {
            r1 = this;
            r0 = 2
            r1.performMotion(r0, r2)
            return
    }

    public final void silentlyUpdateTextColor(@androidx.annotation.NonNull android.content.res.ColorStateList r1) {
            r0 = this;
            super.setTextColor(r1)
            return
    }
}
