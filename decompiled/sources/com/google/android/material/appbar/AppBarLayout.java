package com.google.android.material.appbar;

/* JADX INFO: loaded from: classes3.dex */
public class AppBarLayout extends android.widget.LinearLayout implements androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior {
    private static final int DEF_STYLE_RES = 0;
    private static final int INVALID_SCROLL_RANGE = -1;
    private final float appBarElevation;
    private com.google.android.material.appbar.AppBarLayout.Behavior behavior;
    private int currentOffset;
    private int downPreScrollRange;
    private int downScrollRange;
    private boolean haveChildWithInterpolator;

    @androidx.annotation.Nullable
    private androidx.core.view.WindowInsetsCompat lastInsets;
    private boolean liftOnScroll;

    @androidx.annotation.Nullable
    private final android.content.res.ColorStateList liftOnScrollColor;

    @androidx.annotation.Nullable
    private android.animation.ValueAnimator liftOnScrollColorAnimator;
    private final long liftOnScrollColorDuration;
    private final android.animation.TimeInterpolator liftOnScrollColorInterpolator;

    @androidx.annotation.Nullable
    private android.animation.ValueAnimator.AnimatorUpdateListener liftOnScrollColorUpdateListener;
    private final java.util.List<com.google.android.material.appbar.AppBarLayout.LiftOnScrollListener> liftOnScrollListeners;

    @androidx.annotation.Nullable
    private java.lang.ref.WeakReference<android.view.View> liftOnScrollTargetView;

    @androidx.annotation.IdRes
    private int liftOnScrollTargetViewId;
    private boolean liftable;
    private boolean liftableOverride;
    private boolean lifted;
    private java.util.List<com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener> listeners;
    private int pendingAction;

    @androidx.annotation.Nullable
    private android.graphics.drawable.Drawable statusBarForeground;
    private int[] tmpStatesArray;
    private int totalScrollRange;


    /* JADX INFO: loaded from: classes.dex */
    public static class BaseBehavior<T extends com.google.android.material.appbar.AppBarLayout> extends com.google.android.material.appbar.HeaderBehavior<T> {
        private static final double EXPAND_BY_KEY_EVENT_THRESHOLD_PERCENTAGE = 0.1d;
        private static final int MAX_OFFSET_ANIMATION_DURATION = 600;
        private boolean coordinatorLayoutA11yScrollable;

        @androidx.annotation.Nullable
        private java.lang.ref.WeakReference<android.view.View> lastNestedScrollingChildRef;
        private int lastStartedType;
        private android.animation.ValueAnimator offsetAnimator;
        private int offsetDelta;
        private com.google.android.material.appbar.AppBarLayout.BaseBehavior.BaseDragCallback onDragCallback;
        private com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState savedState;





        public static abstract class BaseDragCallback<T extends com.google.android.material.appbar.AppBarLayout> {
            public BaseDragCallback() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public abstract boolean canDrag(@androidx.annotation.NonNull T r1);
        }

        public static class SavedState extends androidx.customview.view.AbsSavedState {
            public static final android.os.Parcelable.Creator<com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState> CREATOR = null;
            public boolean firstVisibleChildAtMinimumHeight;
            public int firstVisibleChildIndex;
            public float firstVisibleChildPercentageShown;
            public boolean fullyExpanded;
            public boolean fullyScrolled;


            static {
                    com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState$1 r0 = new com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState$1
                    r0.<init>()
                    com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState.CREATOR = r0
                    return
            }

            public SavedState(@androidx.annotation.NonNull android.os.Parcel r3, java.lang.ClassLoader r4) {
                    r2 = this;
                    r2.<init>(r3, r4)
                    byte r4 = r3.readByte()
                    r0 = 1
                    r1 = 0
                    if (r4 == 0) goto Ld
                    r4 = 1
                    goto Le
                Ld:
                    r4 = 0
                Le:
                    r2.fullyScrolled = r4
                    byte r4 = r3.readByte()
                    if (r4 == 0) goto L18
                    r4 = 1
                    goto L19
                L18:
                    r4 = 0
                L19:
                    r2.fullyExpanded = r4
                    int r4 = r3.readInt()
                    r2.firstVisibleChildIndex = r4
                    float r4 = r3.readFloat()
                    r2.firstVisibleChildPercentageShown = r4
                    byte r3 = r3.readByte()
                    if (r3 == 0) goto L2e
                    goto L2f
                L2e:
                    r0 = 0
                L2f:
                    r2.firstVisibleChildAtMinimumHeight = r0
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
                    boolean r2 = r0.fullyScrolled
                    byte r2 = (byte) r2
                    r1.writeByte(r2)
                    boolean r2 = r0.fullyExpanded
                    byte r2 = (byte) r2
                    r1.writeByte(r2)
                    int r2 = r0.firstVisibleChildIndex
                    r1.writeInt(r2)
                    float r2 = r0.firstVisibleChildPercentageShown
                    r1.writeFloat(r2)
                    boolean r2 = r0.firstVisibleChildAtMinimumHeight
                    byte r2 = (byte) r2
                    r1.writeByte(r2)
                    return
            }
        }

        public static /* synthetic */ boolean $r8$lambda$QeS_UGSkShOdio730SqysJJGrYc(com.google.android.material.appbar.AppBarLayout.BaseBehavior r0, android.view.View r1, com.google.android.material.appbar.AppBarLayout r2, android.view.View r3, int r4, android.view.KeyEvent r5) {
                boolean r0 = r0.lambda$onLayoutChild$1(r1, r2, r3, r4, r5)
                return r0
        }

        public static /* synthetic */ boolean $r8$lambda$n_zC0BmoMwb1UwxgpoyEBoSiwM4(com.google.android.material.appbar.AppBarLayout.BaseBehavior r0, android.view.View r1, com.google.android.material.appbar.AppBarLayout r2, android.view.View r3, android.view.KeyEvent r4) {
                boolean r0 = r0.lambda$onLayoutChild$0(r1, r2, r3, r4)
                return r0
        }

        public BaseBehavior() {
                r0 = this;
                r0.<init>()
                return
        }

        public BaseBehavior(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static /* synthetic */ boolean access$000(com.google.android.material.appbar.AppBarLayout.BaseBehavior r0) {
                boolean r0 = r0.coordinatorLayoutA11yScrollable
                return r0
        }

        public static /* synthetic */ int access$100(com.google.android.material.appbar.AppBarLayout.BaseBehavior r0) {
                int r0 = r0.offsetDelta
                return r0
        }

        private boolean addAccessibilityScrollActions(androidx.coordinatorlayout.widget.CoordinatorLayout r11, @androidx.annotation.NonNull T r12, @androidx.annotation.NonNull android.view.View r13) {
                r10 = this;
                int r0 = r10.getTopBottomOffsetForScrollingSibling()
                int r1 = r12.getTotalScrollRange()
                int r1 = -r1
                r2 = 0
                r3 = 1
                if (r0 == r1) goto L13
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD
                r10.addActionToExpand(r11, r12, r0, r2)
                r2 = 1
            L13:
                int r0 = r10.getTopBottomOffsetForScrollingSibling()
                if (r0 == 0) goto L3e
                r0 = -1
                boolean r0 = r13.canScrollVertically(r0)
                if (r0 == 0) goto L38
                int r0 = r12.getDownNestedPreScrollRange()
                int r9 = -r0
                if (r9 == 0) goto L3e
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD
                r1 = 0
                com.google.android.material.appbar.AppBarLayout$BaseBehavior$3 r2 = new com.google.android.material.appbar.AppBarLayout$BaseBehavior$3
                r4 = r2
                r5 = r10
                r6 = r11
                r7 = r12
                r8 = r13
                r4.<init>(r5, r6, r7, r8, r9)
                androidx.core.view.ViewCompat.replaceAccessibilityAction(r11, r0, r1, r2)
                goto L3f
            L38:
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r13 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD
                r10.addActionToExpand(r11, r12, r13, r3)
                goto L3f
            L3e:
                r3 = r2
            L3f:
                return r3
        }

        private void addActionToExpand(androidx.coordinatorlayout.widget.CoordinatorLayout r2, @androidx.annotation.NonNull T r3, @androidx.annotation.NonNull androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat r4, boolean r5) {
                r1 = this;
                com.google.android.material.appbar.AppBarLayout$BaseBehavior$4 r0 = new com.google.android.material.appbar.AppBarLayout$BaseBehavior$4
                r0.<init>(r3, r5)
                r3 = 0
                androidx.core.view.ViewCompat.replaceAccessibilityAction(r2, r4, r3, r0)
                return
        }

        private void animateOffsetTo(androidx.coordinatorlayout.widget.CoordinatorLayout r3, @androidx.annotation.NonNull T r4, int r5, float r6) {
                r2 = this;
                int r0 = r2.getTopBottomOffsetForScrollingSibling()
                int r0 = r0 - r5
                int r0 = java.lang.Math.abs(r0)
                float r6 = java.lang.Math.abs(r6)
                r1 = 0
                int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r1 <= 0) goto L1f
                r1 = 1148846080(0x447a0000, float:1000.0)
                float r0 = (float) r0
                float r0 = r0 / r6
                float r0 = r0 * r1
                int r6 = java.lang.Math.round(r0)
                int r6 = r6 * 3
                goto L2e
            L1f:
                float r6 = (float) r0
                int r0 = r4.getHeight()
                float r0 = (float) r0
                float r6 = r6 / r0
                r0 = 1065353216(0x3f800000, float:1.0)
                float r6 = r6 + r0
                r0 = 1125515264(0x43160000, float:150.0)
                float r6 = r6 * r0
                int r6 = (int) r6
            L2e:
                r2.animateOffsetWithDuration(r3, r4, r5, r6)
                return
        }

        private void animateOffsetWithDuration(androidx.coordinatorlayout.widget.CoordinatorLayout r4, T r5, int r6, int r7) {
                r3 = this;
                int r0 = r3.getTopBottomOffsetForScrollingSibling()
                if (r0 != r6) goto L16
                android.animation.ValueAnimator r4 = r3.offsetAnimator
                if (r4 == 0) goto L15
                boolean r4 = r4.isRunning()
                if (r4 == 0) goto L15
                android.animation.ValueAnimator r4 = r3.offsetAnimator
                r4.cancel()
            L15:
                return
            L16:
                android.animation.ValueAnimator r1 = r3.offsetAnimator
                if (r1 != 0) goto L31
                android.animation.ValueAnimator r1 = new android.animation.ValueAnimator
                r1.<init>()
                r3.offsetAnimator = r1
                android.animation.TimeInterpolator r2 = com.google.android.material.animation.AnimationUtils.DECELERATE_INTERPOLATOR
                r1.setInterpolator(r2)
                android.animation.ValueAnimator r1 = r3.offsetAnimator
                com.google.android.material.appbar.AppBarLayout$BaseBehavior$1 r2 = new com.google.android.material.appbar.AppBarLayout$BaseBehavior$1
                r2.<init>(r3, r4, r5)
                r1.addUpdateListener(r2)
                goto L34
            L31:
                r1.cancel()
            L34:
                android.animation.ValueAnimator r4 = r3.offsetAnimator
                r5 = 600(0x258, float:8.41E-43)
                int r5 = java.lang.Math.min(r7, r5)
                long r1 = (long) r5
                r4.setDuration(r1)
                android.animation.ValueAnimator r4 = r3.offsetAnimator
                r5 = 2
                int[] r5 = new int[r5]
                r7 = 0
                r5[r7] = r0
                r7 = 1
                r5[r7] = r6
                r4.setIntValues(r5)
                android.animation.ValueAnimator r4 = r3.offsetAnimator
                r4.start()
                return
        }

        private int calculateSnapOffset(int r2, int r3, int r4) {
                r1 = this;
                int r0 = r3 + r4
                int r0 = r0 / 2
                if (r2 >= r0) goto L7
                goto L8
            L7:
                r3 = r4
            L8:
                return r3
        }

        private boolean canScrollChildren(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r4, @androidx.annotation.NonNull T r5, @androidx.annotation.NonNull android.view.View r6) {
                r3 = this;
                int r0 = r5.getTotalScrollRange()
                r1 = 1
                r2 = 0
                if (r0 == 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                if (r0 == 0) goto L1d
                int r4 = r4.getHeight()
                int r6 = r6.getHeight()
                int r4 = r4 - r6
                int r5 = r5.getHeight()
                if (r4 > r5) goto L1d
                goto L1e
            L1d:
                r1 = 0
            L1e:
                return r1
        }

        private static boolean checkFlag(int r0, int r1) {
                r0 = r0 & r1
                if (r0 != r1) goto L5
                r0 = 1
                goto L6
            L5:
                r0 = 0
            L6:
                return r0
        }

        private boolean childrenHaveScrollFlags(com.google.android.material.appbar.AppBarLayout r5) {
                r4 = this;
                int r0 = r5.getChildCount()
                r1 = 0
                r2 = 0
            L6:
                if (r2 >= r0) goto L1b
                android.view.View r3 = r5.getChildAt(r2)
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$LayoutParams r3 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r3
                int r3 = r3.scrollFlags
                if (r3 == 0) goto L18
                r5 = 1
                return r5
            L18:
                int r2 = r2 + 1
                goto L6
            L1b:
                return r1
        }

        private void controlExpansionOnKeyPress(android.view.KeyEvent r7, android.view.View r8, com.google.android.material.appbar.AppBarLayout r9) {
                r6 = this;
                int r0 = r7.getAction()
                r1 = 1
                if (r0 == 0) goto Ld
                int r0 = r7.getAction()
                if (r0 != r1) goto L4d
            Ld:
                int r7 = r7.getKeyCode()
                r0 = 19
                if (r7 == r0) goto L35
                r0 = 280(0x118, float:3.92E-43)
                if (r7 == r0) goto L35
                r0 = 92
                if (r7 != r0) goto L1e
                goto L35
            L1e:
                r0 = 20
                if (r7 == r0) goto L2a
                r0 = 281(0x119, float:3.94E-43)
                if (r7 == r0) goto L2a
                r0 = 93
                if (r7 != r0) goto L4d
            L2a:
                int r7 = r8.getScrollY()
                if (r7 <= 0) goto L4d
                r7 = 0
                r9.setExpanded(r7)
                goto L4d
            L35:
                int r7 = r8.getScrollY()
                double r2 = (double) r7
                int r7 = r8.getMeasuredHeight()
                double r7 = (double) r7
                r4 = 4591870180066957722(0x3fb999999999999a, double:0.1)
                double r7 = r7 * r4
                int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r0 >= 0) goto L4d
                r9.setExpanded(r1)
            L4d:
                return
        }

        @androidx.annotation.Nullable
        private android.view.View findFirstScrollingChild(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r5) {
                r4 = this;
                int r0 = r5.getChildCount()
                r1 = 0
            L5:
                if (r1 >= r0) goto L1c
                android.view.View r2 = r5.getChildAt(r1)
                boolean r3 = r2 instanceof androidx.core.view.NestedScrollingChild
                if (r3 != 0) goto L1b
                boolean r3 = r2 instanceof android.widget.ListView
                if (r3 != 0) goto L1b
                boolean r3 = r2 instanceof android.widget.ScrollView
                if (r3 == 0) goto L18
                goto L1b
            L18:
                int r1 = r1 + 1
                goto L5
            L1b:
                return r2
            L1c:
                r5 = 0
                return r5
        }

        @androidx.annotation.Nullable
        private static android.view.View getAppBarChildOnOffset(@androidx.annotation.NonNull com.google.android.material.appbar.AppBarLayout r4, int r5) {
                int r5 = java.lang.Math.abs(r5)
                int r0 = r4.getChildCount()
                r1 = 0
            L9:
                if (r1 >= r0) goto L1f
                android.view.View r2 = r4.getChildAt(r1)
                int r3 = r2.getTop()
                if (r5 < r3) goto L1c
                int r3 = r2.getBottom()
                if (r5 > r3) goto L1c
                return r2
            L1c:
                int r1 = r1 + 1
                goto L9
            L1f:
                r4 = 0
                return r4
        }

        private int getChildIndexOnOffset(@androidx.annotation.NonNull T r8, int r9) {
                r7 = this;
                int r0 = r8.getChildCount()
                r1 = 0
            L5:
                if (r1 >= r0) goto L34
                android.view.View r2 = r8.getChildAt(r1)
                int r3 = r2.getTop()
                int r4 = r2.getBottom()
                android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$LayoutParams r2 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r2
                int r5 = r2.getScrollFlags()
                r6 = 32
                boolean r5 = checkFlag(r5, r6)
                if (r5 == 0) goto L2b
                int r5 = r2.topMargin
                int r3 = r3 - r5
                int r2 = r2.bottomMargin
                int r4 = r4 + r2
            L2b:
                int r2 = -r9
                if (r3 > r2) goto L31
                if (r4 < r2) goto L31
                return r1
            L31:
                int r1 = r1 + 1
                goto L5
            L34:
                r8 = -1
                return r8
        }

        @androidx.annotation.Nullable
        private android.view.View getChildWithScrollingBehavior(androidx.coordinatorlayout.widget.CoordinatorLayout r5) {
                r4 = this;
                int r0 = r5.getChildCount()
                r1 = 0
            L5:
                if (r1 >= r0) goto L1d
                android.view.View r2 = r5.getChildAt(r1)
                android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r3
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r3 = r3.getBehavior()
                boolean r3 = r3 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r3 == 0) goto L1a
                return r2
            L1a:
                int r1 = r1 + 1
                goto L5
            L1d:
                r5 = 0
                return r5
        }

        private int interpolateOffset(@androidx.annotation.NonNull T r9, int r10) {
                r8 = this;
                int r0 = java.lang.Math.abs(r10)
                int r1 = r9.getChildCount()
                r2 = 0
                r3 = 0
            La:
                if (r3 >= r1) goto L72
                android.view.View r4 = r9.getChildAt(r3)
                android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$LayoutParams r5 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r5
                android.view.animation.Interpolator r6 = r5.getScrollInterpolator()
                int r7 = r4.getTop()
                if (r0 < r7) goto L6f
                int r7 = r4.getBottom()
                if (r0 > r7) goto L6f
                if (r6 == 0) goto L72
                int r1 = r5.getScrollFlags()
                r3 = r1 & 1
                if (r3 == 0) goto L44
                int r3 = r4.getHeight()
                int r7 = r5.topMargin
                int r3 = r3 + r7
                int r5 = r5.bottomMargin
                int r3 = r3 + r5
                int r2 = r2 + r3
                r1 = r1 & 2
                if (r1 == 0) goto L44
                int r1 = androidx.core.view.ViewCompat.getMinimumHeight(r4)
                int r2 = r2 - r1
            L44:
                boolean r1 = androidx.core.view.ViewCompat.getFitsSystemWindows(r4)
                if (r1 == 0) goto L4f
                int r9 = r9.getTopInset()
                int r2 = r2 - r9
            L4f:
                if (r2 <= 0) goto L72
                int r9 = r4.getTop()
                int r0 = r0 - r9
                float r9 = (float) r2
                float r0 = (float) r0
                float r0 = r0 / r9
                float r0 = r6.getInterpolation(r0)
                float r0 = r0 * r9
                int r9 = java.lang.Math.round(r0)
                int r10 = java.lang.Integer.signum(r10)
                int r0 = r4.getTop()
                int r0 = r0 + r9
                int r0 = r0 * r10
                return r0
            L6f:
                int r3 = r3 + 1
                goto La
            L72:
                return r10
        }

        private /* synthetic */ boolean lambda$onLayoutChild$0(android.view.View r1, com.google.android.material.appbar.AppBarLayout r2, android.view.View r3, android.view.KeyEvent r4) {
                r0 = this;
                r0.controlExpansionOnKeyPress(r4, r1, r2)
                r1 = 0
                return r1
        }

        private /* synthetic */ boolean lambda$onLayoutChild$1(android.view.View r1, com.google.android.material.appbar.AppBarLayout r2, android.view.View r3, int r4, android.view.KeyEvent r5) {
                r0 = this;
                r0.controlExpansionOnKeyPress(r5, r1, r2)
                r1 = 0
                return r1
        }

        private boolean shouldJumpElevationState(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r5, @androidx.annotation.NonNull T r6) {
                r4 = this;
                java.util.List r5 = r5.getDependents(r6)
                int r6 = r5.size()
                r0 = 0
                r1 = 0
            La:
                if (r1 >= r6) goto L2d
                java.lang.Object r2 = r5.get(r1)
                android.view.View r2 = (android.view.View) r2
                android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r2 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r2
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r2 = r2.getBehavior()
                boolean r3 = r2 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r3 == 0) goto L2a
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r2 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r2
                int r5 = r2.getOverlayTop()
                if (r5 == 0) goto L29
                r0 = 1
            L29:
                return r0
            L2a:
                int r1 = r1 + 1
                goto La
            L2d:
                return r0
        }

        private void snapToChildIfNeeded(androidx.coordinatorlayout.widget.CoordinatorLayout r9, @androidx.annotation.NonNull T r10) {
                r8 = this;
                int r0 = r10.getTopInset()
                int r1 = r10.getPaddingTop()
                int r1 = r1 + r0
                int r0 = r8.getTopBottomOffsetForScrollingSibling()
                int r0 = r0 - r1
                int r2 = r8.getChildIndexOnOffset(r10, r0)
                if (r2 < 0) goto L84
                android.view.View r3 = r10.getChildAt(r2)
                android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$LayoutParams r4 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r4
                int r5 = r4.getScrollFlags()
                r6 = r5 & 17
                r7 = 17
                if (r6 != r7) goto L84
                int r6 = r3.getTop()
                int r6 = -r6
                int r7 = r3.getBottom()
                int r7 = -r7
                if (r2 != 0) goto L45
                boolean r2 = androidx.core.view.ViewCompat.getFitsSystemWindows(r10)
                if (r2 == 0) goto L45
                boolean r2 = androidx.core.view.ViewCompat.getFitsSystemWindows(r3)
                if (r2 == 0) goto L45
                int r2 = r10.getTopInset()
                int r6 = r6 - r2
            L45:
                r2 = 2
                boolean r2 = checkFlag(r5, r2)
                if (r2 == 0) goto L52
                int r2 = androidx.core.view.ViewCompat.getMinimumHeight(r3)
                int r7 = r7 + r2
                goto L63
            L52:
                r2 = 5
                boolean r2 = checkFlag(r5, r2)
                if (r2 == 0) goto L63
                int r2 = androidx.core.view.ViewCompat.getMinimumHeight(r3)
                int r2 = r2 + r7
                if (r0 >= r2) goto L62
                r6 = r2
                goto L63
            L62:
                r7 = r2
            L63:
                r2 = 32
                boolean r2 = checkFlag(r5, r2)
                if (r2 == 0) goto L71
                int r2 = r4.topMargin
                int r6 = r6 + r2
                int r2 = r4.bottomMargin
                int r7 = r7 - r2
            L71:
                int r0 = r8.calculateSnapOffset(r0, r7, r6)
                int r0 = r0 + r1
                int r1 = r10.getTotalScrollRange()
                int r1 = -r1
                r2 = 0
                int r0 = androidx.core.math.MathUtils.clamp(r0, r1, r2)
                r1 = 0
                r8.animateOffsetTo(r9, r10, r0, r1)
            L84:
                return
        }

        private void updateAccessibilityActions(androidx.coordinatorlayout.widget.CoordinatorLayout r3, @androidx.annotation.NonNull T r4) {
                r2 = this;
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD
                int r0 = r0.getId()
                androidx.core.view.ViewCompat.removeAccessibilityAction(r3, r0)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD
                int r0 = r0.getId()
                androidx.core.view.ViewCompat.removeAccessibilityAction(r3, r0)
                int r0 = r4.getTotalScrollRange()
                if (r0 != 0) goto L19
                return
            L19:
                android.view.View r0 = r2.getChildWithScrollingBehavior(r3)
                if (r0 != 0) goto L20
                return
            L20:
                boolean r1 = r2.childrenHaveScrollFlags(r4)
                if (r1 != 0) goto L27
                return
            L27:
                boolean r1 = androidx.core.view.ViewCompat.hasAccessibilityDelegate(r3)
                if (r1 != 0) goto L35
                com.google.android.material.appbar.AppBarLayout$BaseBehavior$2 r1 = new com.google.android.material.appbar.AppBarLayout$BaseBehavior$2
                r1.<init>(r2)
                androidx.core.view.ViewCompat.setAccessibilityDelegate(r3, r1)
            L35:
                boolean r3 = r2.addAccessibilityScrollActions(r3, r4, r0)
                r2.coordinatorLayoutA11yScrollable = r3
                return
        }

        private void updateAppBarLayoutDrawableState(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r6, @androidx.annotation.NonNull T r7, int r8, int r9, boolean r10) {
                r5 = this;
                android.view.View r0 = getAppBarChildOnOffset(r7, r8)
                r1 = 0
                if (r0 == 0) goto L41
                android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$LayoutParams r2 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r2
                int r2 = r2.getScrollFlags()
                r3 = r2 & 1
                if (r3 == 0) goto L41
                int r3 = androidx.core.view.ViewCompat.getMinimumHeight(r0)
                r4 = 1
                if (r9 <= 0) goto L2f
                r9 = r2 & 12
                if (r9 == 0) goto L2f
                int r8 = -r8
                int r9 = r0.getBottom()
                int r9 = r9 - r3
                int r0 = r7.getTopInset()
                int r9 = r9 - r0
                if (r8 < r9) goto L41
            L2d:
                r1 = 1
                goto L41
            L2f:
                r9 = r2 & 2
                if (r9 == 0) goto L41
                int r8 = -r8
                int r9 = r0.getBottom()
                int r9 = r9 - r3
                int r0 = r7.getTopInset()
                int r9 = r9 - r0
                if (r8 < r9) goto L41
                goto L2d
            L41:
                boolean r8 = r7.isLiftOnScroll()
                if (r8 == 0) goto L4f
                android.view.View r8 = r5.findFirstScrollingChild(r6)
                boolean r1 = r7.shouldLift(r8)
            L4f:
                boolean r8 = r7.setLiftedState(r1)
                if (r10 != 0) goto L5d
                if (r8 == 0) goto L60
                boolean r6 = r5.shouldJumpElevationState(r6, r7)
                if (r6 == 0) goto L60
            L5d:
                r7.jumpDrawablesToCurrentState()
            L60:
                return
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public final boolean canDragView(android.view.View r3) {
                r2 = this;
                com.google.android.material.appbar.AppBarLayout r3 = (com.google.android.material.appbar.AppBarLayout) r3
                com.google.android.material.appbar.AppBarLayout$BaseBehavior$BaseDragCallback r0 = r2.onDragCallback
                if (r0 == 0) goto Lb
                boolean r3 = r0.canDrag(r3)
                goto L29
            Lb:
                java.lang.ref.WeakReference<android.view.View> r3 = r2.lastNestedScrollingChildRef
                r0 = 1
                if (r3 == 0) goto L28
                java.lang.Object r3 = r3.get()
                android.view.View r3 = (android.view.View) r3
                if (r3 == 0) goto L26
                boolean r1 = r3.isShown()
                if (r1 == 0) goto L26
                r1 = -1
                boolean r3 = r3.canScrollVertically(r1)
                if (r3 != 0) goto L26
                goto L28
            L26:
                r3 = 0
                goto L29
            L28:
                r3 = 1
            L29:
                return r3
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public final int getMaxDragOffset(@androidx.annotation.NonNull android.view.View r1) {
                r0 = this;
                com.google.android.material.appbar.AppBarLayout r1 = (com.google.android.material.appbar.AppBarLayout) r1
                int r1 = r1.getDownNestedScrollRange()
                int r1 = -r1
                return r1
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public final int getScrollRangeForDragFling(@androidx.annotation.NonNull android.view.View r1) {
                r0 = this;
                com.google.android.material.appbar.AppBarLayout r1 = (com.google.android.material.appbar.AppBarLayout) r1
                int r1 = r1.getTotalScrollRange()
                return r1
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public final int getTopBottomOffsetForScrollingSibling() {
                r2 = this;
                int r0 = r2.getTopAndBottomOffset()
                int r1 = r2.offsetDelta
                int r0 = r0 + r1
                return r0
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public final void onFlingFinished(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r2, @androidx.annotation.NonNull android.view.View r3) {
                r1 = this;
                com.google.android.material.appbar.AppBarLayout r3 = (com.google.android.material.appbar.AppBarLayout) r3
                r1.snapToChildIfNeeded(r2, r3)
                boolean r0 = r3.isLiftOnScroll()
                if (r0 == 0) goto L16
                android.view.View r2 = r1.findFirstScrollingChild(r2)
                boolean r2 = r3.shouldLift(r2)
                r3.setLiftedState(r2)
            L16:
                return
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull android.view.View r2, int r3) {
                r0 = this;
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                boolean r1 = r0.onLayoutChild(r1, r2, r3)
                return r1
        }

        public boolean onLayoutChild(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r8, @androidx.annotation.NonNull T r9, int r10) {
                r7 = this;
                boolean r10 = super.onLayoutChild(r8, r9, r10)
                int r0 = r9.getPendingAction()
                com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState r1 = r7.savedState
                r2 = 0
                if (r1 == 0) goto L57
                r3 = r0 & 8
                if (r3 != 0) goto L57
                boolean r0 = r1.fullyScrolled
                if (r0 == 0) goto L1e
                int r0 = r9.getTotalScrollRange()
                int r0 = -r0
                r7.setHeaderTopBottomOffset(r8, r9, r0)
                goto L81
            L1e:
                boolean r0 = r1.fullyExpanded
                if (r0 == 0) goto L26
                r7.setHeaderTopBottomOffset(r8, r9, r2)
                goto L81
            L26:
                int r0 = r1.firstVisibleChildIndex
                android.view.View r0 = r9.getChildAt(r0)
                int r1 = r0.getBottom()
                int r1 = -r1
                com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState r3 = r7.savedState
                boolean r3 = r3.firstVisibleChildAtMinimumHeight
                if (r3 == 0) goto L42
                int r0 = androidx.core.view.ViewCompat.getMinimumHeight(r0)
                int r3 = r9.getTopInset()
                int r3 = r3 + r0
                int r3 = r3 + r1
                goto L53
            L42:
                int r0 = r0.getHeight()
                float r0 = (float) r0
                com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState r3 = r7.savedState
                float r3 = r3.firstVisibleChildPercentageShown
                float r0 = r0 * r3
                int r0 = java.lang.Math.round(r0)
                int r3 = r0 + r1
            L53:
                r7.setHeaderTopBottomOffset(r8, r9, r3)
                goto L81
            L57:
                if (r0 == 0) goto L81
                r1 = r0 & 4
                r3 = 1
                if (r1 == 0) goto L60
                r1 = 1
                goto L61
            L60:
                r1 = 0
            L61:
                r4 = r0 & 2
                r5 = 0
                if (r4 == 0) goto L75
                int r0 = r9.getUpNestedPreScrollRange()
                int r0 = -r0
                if (r1 == 0) goto L71
                r7.animateOffsetTo(r8, r9, r0, r5)
                goto L81
            L71:
                r7.setHeaderTopBottomOffset(r8, r9, r0)
                goto L81
            L75:
                r0 = r0 & r3
                if (r0 == 0) goto L81
                if (r1 == 0) goto L7e
                r7.animateOffsetTo(r8, r9, r2, r5)
                goto L81
            L7e:
                r7.setHeaderTopBottomOffset(r8, r9, r2)
            L81:
                r9.resetPendingAction()
                r0 = 0
                r7.savedState = r0
                int r0 = r7.getTopAndBottomOffset()
                int r1 = r9.getTotalScrollRange()
                int r1 = -r1
                int r0 = androidx.core.math.MathUtils.clamp(r0, r1, r2)
                r7.setTopAndBottomOffset(r0)
                int r4 = r7.getTopAndBottomOffset()
                r5 = 0
                r6 = 1
                r1 = r7
                r2 = r8
                r3 = r9
                r1.updateAppBarLayoutDrawableState(r2, r3, r4, r5, r6)
                int r0 = r7.getTopAndBottomOffset()
                r9.onOffsetChanged(r0)
                r7.updateAccessibilityActions(r8, r9)
                android.view.View r8 = r7.findFirstScrollingChild(r8)
                if (r8 == 0) goto Lca
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 28
                if (r0 < r1) goto Lc2
                com.google.android.material.appbar.AppBarLayout$BaseBehavior$$ExternalSyntheticLambda1 r0 = new com.google.android.material.appbar.AppBarLayout$BaseBehavior$$ExternalSyntheticLambda1
                r0.<init>(r7, r8, r9)
                r8.addOnUnhandledKeyEventListener(r0)
                goto Lca
            Lc2:
                com.google.android.material.appbar.AppBarLayout$BaseBehavior$$ExternalSyntheticLambda0 r0 = new com.google.android.material.appbar.AppBarLayout$BaseBehavior$$ExternalSyntheticLambda0
                r0.<init>(r7, r8, r9)
                r8.setOnKeyListener(r0)
            Lca:
                return r10
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onMeasureChild(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull android.view.View r2, int r3, int r4, int r5, int r6) {
                r0 = this;
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                boolean r1 = r0.onMeasureChild(r1, r2, r3, r4, r5, r6)
                return r1
        }

        public boolean onMeasureChild(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r7, @androidx.annotation.NonNull T r8, int r9, int r10, int r11, int r12) {
                r6 = this;
                android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
                int r0 = r0.height
                r1 = -2
                if (r0 != r1) goto L1a
                r11 = 0
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r11)
                r0 = r7
                r1 = r8
                r2 = r9
                r3 = r10
                r5 = r12
                r0.onMeasureChild(r1, r2, r3, r4, r5)
                r7 = 1
                return r7
            L1a:
                boolean r7 = super.onMeasureChild(r7, r8, r9, r10, r11, r12)
                return r7
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ void onNestedPreScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull android.view.View r2, android.view.View r3, int r4, int r5, int[] r6, int r7) {
                r0 = this;
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                r0.onNestedPreScroll(r1, r2, r3, r4, r5, r6, r7)
                return
        }

        public void onNestedPreScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r7, @androidx.annotation.NonNull T r8, android.view.View r9, int r10, int r11, int[] r12, int r13) {
                r6 = this;
                if (r11 == 0) goto L26
                if (r11 >= 0) goto L11
                int r10 = r8.getTotalScrollRange()
                int r10 = -r10
                int r13 = r8.getDownNestedPreScrollRange()
                int r13 = r13 + r10
                r4 = r10
                r5 = r13
                goto L19
            L11:
                int r10 = r8.getUpNestedPreScrollRange()
                int r10 = -r10
                r13 = 0
                r4 = r10
                r5 = 0
            L19:
                if (r4 == r5) goto L26
                r10 = 1
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r11
                int r7 = r0.scroll(r1, r2, r3, r4, r5)
                r12[r10] = r7
            L26:
                boolean r7 = r8.isLiftOnScroll()
                if (r7 == 0) goto L33
                boolean r7 = r8.shouldLift(r9)
                r8.setLiftedState(r7)
            L33:
                return
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ void onNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull android.view.View r2, android.view.View r3, int r4, int r5, int r6, int r7, int r8, int[] r9) {
                r0 = this;
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                r0.onNestedScroll(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return
        }

        public void onNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r7, @androidx.annotation.NonNull T r8, android.view.View r9, int r10, int r11, int r12, int r13, int r14, int[] r15) {
                r6 = this;
                if (r13 >= 0) goto L13
                r9 = 1
                int r10 = r8.getDownNestedScrollRange()
                int r4 = -r10
                r5 = 0
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r13
                int r10 = r0.scroll(r1, r2, r3, r4, r5)
                r15[r9] = r10
            L13:
                if (r13 != 0) goto L18
                r6.updateAccessibilityActions(r7, r8)
            L18:
                return
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ void onRestoreInstanceState(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull android.view.View r2, android.os.Parcelable r3) {
                r0 = this;
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                r0.onRestoreInstanceState(r1, r2, r3)
                return
        }

        public void onRestoreInstanceState(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r2, @androidx.annotation.NonNull T r3, android.os.Parcelable r4) {
                r1 = this;
                boolean r0 = r4 instanceof com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState
                if (r0 == 0) goto L12
                com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState r4 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState) r4
                com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState r0 = r1.savedState
                r1.savedState = r4
                android.os.Parcelable r4 = r4.getSuperState()
                super.onRestoreInstanceState(r2, r3, r4)
                goto L18
            L12:
                super.onRestoreInstanceState(r2, r3, r4)
                r2 = 0
                r1.savedState = r2
            L18:
                return
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ android.os.Parcelable onSaveInstanceState(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull android.view.View r2) {
                r0 = this;
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                android.os.Parcelable r1 = r0.onSaveInstanceState(r1, r2)
                return r1
        }

        public android.os.Parcelable onSaveInstanceState(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull T r2) {
                r0 = this;
                android.os.Parcelable r1 = super.onSaveInstanceState(r1, r2)
                com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState r2 = r0.saveScrollState(r1, r2)
                if (r2 != 0) goto Lb
                goto Lc
            Lb:
                r1 = r2
            Lc:
                return r1
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onStartNestedScroll(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull android.view.View r3, android.view.View r4, int r5, int r6) {
                r0 = this;
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                boolean r1 = r0.onStartNestedScroll(r1, r2, r3, r4, r5, r6)
                return r1
        }

        public boolean onStartNestedScroll(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull T r2, @androidx.annotation.NonNull android.view.View r3, android.view.View r4, int r5, int r6) {
                r0 = this;
                r4 = r5 & 2
                if (r4 == 0) goto L12
                boolean r4 = r2.isLiftOnScroll()
                if (r4 != 0) goto L10
                boolean r1 = r0.canScrollChildren(r1, r2, r3)
                if (r1 == 0) goto L12
            L10:
                r1 = 1
                goto L13
            L12:
                r1 = 0
            L13:
                if (r1 == 0) goto L1c
                android.animation.ValueAnimator r2 = r0.offsetAnimator
                if (r2 == 0) goto L1c
                r2.cancel()
            L1c:
                r2 = 0
                r0.lastNestedScrollingChildRef = r2
                r0.lastStartedType = r6
                return r1
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ void onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull android.view.View r2, android.view.View r3, int r4) {
                r0 = this;
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                r0.onStopNestedScroll(r1, r2, r3, r4)
                return
        }

        public void onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r2, @androidx.annotation.NonNull T r3, android.view.View r4, int r5) {
                r1 = this;
                int r0 = r1.lastStartedType
                if (r0 == 0) goto L7
                r0 = 1
                if (r5 != r0) goto L17
            L7:
                r1.snapToChildIfNeeded(r2, r3)
                boolean r2 = r3.isLiftOnScroll()
                if (r2 == 0) goto L17
                boolean r2 = r3.shouldLift(r4)
                r3.setLiftedState(r2)
            L17:
                java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
                r2.<init>(r4)
                r1.lastNestedScrollingChildRef = r2
                return
        }

        public final void restoreScrollState(@androidx.annotation.Nullable com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState r2) {
                r1 = this;
                com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState r0 = r1.savedState
                if (r0 == 0) goto L5
                goto L7
            L5:
                r1.savedState = r2
            L7:
                return
        }

        @androidx.annotation.Nullable
        public final com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState saveScrollState(@androidx.annotation.Nullable android.os.Parcelable r8, @androidx.annotation.NonNull T r9) {
                r7 = this;
                int r0 = r7.getTopAndBottomOffset()
                int r1 = r9.getChildCount()
                r2 = 0
                r3 = 0
            La:
                if (r3 >= r1) goto L5a
                android.view.View r4 = r9.getChildAt(r3)
                int r5 = r4.getBottom()
                int r5 = r5 + r0
                int r6 = r4.getTop()
                int r6 = r6 + r0
                if (r6 > 0) goto L57
                if (r5 < 0) goto L57
                com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState r1 = new com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState
                if (r8 != 0) goto L24
                androidx.customview.view.AbsSavedState r8 = androidx.customview.view.AbsSavedState.EMPTY_STATE
            L24:
                r1.<init>(r8)
                r8 = 1
                if (r0 != 0) goto L2c
                r6 = 1
                goto L2d
            L2c:
                r6 = 0
            L2d:
                r1.fullyExpanded = r6
                if (r6 != 0) goto L3a
                int r0 = -r0
                int r6 = r9.getTotalScrollRange()
                if (r0 < r6) goto L3a
                r0 = 1
                goto L3b
            L3a:
                r0 = 0
            L3b:
                r1.fullyScrolled = r0
                r1.firstVisibleChildIndex = r3
                int r0 = androidx.core.view.ViewCompat.getMinimumHeight(r4)
                int r9 = r9.getTopInset()
                int r9 = r9 + r0
                if (r5 != r9) goto L4b
                r2 = 1
            L4b:
                r1.firstVisibleChildAtMinimumHeight = r2
                float r8 = (float) r5
                int r9 = r4.getHeight()
                float r9 = (float) r9
                float r8 = r8 / r9
                r1.firstVisibleChildPercentageShown = r8
                return r1
            L57:
                int r3 = r3 + 1
                goto La
            L5a:
                r8 = 0
                return r8
        }

        public void setDragCallback(@androidx.annotation.Nullable com.google.android.material.appbar.AppBarLayout.BaseBehavior.BaseDragCallback r1) {
                r0 = this;
                r0.onDragCallback = r1
                return
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public final int setHeaderTopBottomOffset(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r7, @androidx.annotation.NonNull android.view.View r8, int r9, int r10, int r11) {
                r6 = this;
                com.google.android.material.appbar.AppBarLayout r8 = (com.google.android.material.appbar.AppBarLayout) r8
                int r0 = r6.getTopBottomOffsetForScrollingSibling()
                r1 = 0
                if (r10 == 0) goto L79
                if (r0 < r10) goto L79
                if (r0 > r11) goto L79
                int r3 = androidx.core.math.MathUtils.clamp(r9, r10, r11)
                if (r0 == r3) goto L7b
                boolean r9 = r8.hasChildWithInterpolator()
                if (r9 == 0) goto L1e
                int r9 = r6.interpolateOffset(r8, r3)
                goto L1f
            L1e:
                r9 = r3
            L1f:
                boolean r10 = r6.setTopAndBottomOffset(r9)
                int r11 = r0 - r3
                int r9 = r3 - r9
                r6.offsetDelta = r9
                r9 = 1
                if (r10 == 0) goto L58
            L2c:
                int r2 = r8.getChildCount()
                if (r1 >= r2) goto L58
                android.view.View r2 = r8.getChildAt(r1)
                android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$LayoutParams r2 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r2
                com.google.android.material.appbar.AppBarLayout$ChildScrollEffect r4 = r2.getScrollEffect()
                if (r4 == 0) goto L55
                int r2 = r2.getScrollFlags()
                r2 = r2 & r9
                if (r2 == 0) goto L55
                android.view.View r2 = r8.getChildAt(r1)
                int r5 = r6.getTopAndBottomOffset()
                float r5 = (float) r5
                r4.onOffsetChanged(r8, r2, r5)
            L55:
                int r1 = r1 + 1
                goto L2c
            L58:
                if (r10 != 0) goto L63
                boolean r10 = r8.hasChildWithInterpolator()
                if (r10 == 0) goto L63
                r7.dispatchDependentViewsChanged(r8)
            L63:
                int r10 = r6.getTopAndBottomOffset()
                r8.onOffsetChanged(r10)
                if (r3 >= r0) goto L6f
                r9 = -1
                r4 = -1
                goto L70
            L6f:
                r4 = 1
            L70:
                r5 = 0
                r0 = r6
                r1 = r7
                r2 = r8
                r0.updateAppBarLayoutDrawableState(r1, r2, r3, r4, r5)
                r1 = r11
                goto L7b
            L79:
                r6.offsetDelta = r1
            L7b:
                r6.updateAccessibilityActions(r7, r8)
                return r1
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface BaseOnOffsetChangedListener<T extends com.google.android.material.appbar.AppBarLayout> {
        void onOffsetChanged(T r1, int r2);
    }

    public static class Behavior extends com.google.android.material.appbar.AppBarLayout.BaseBehavior<com.google.android.material.appbar.AppBarLayout> {

        /* JADX INFO: loaded from: classes.dex */
        public static abstract class DragCallback extends com.google.android.material.appbar.AppBarLayout.BaseBehavior.BaseDragCallback<com.google.android.material.appbar.AppBarLayout> {
            public DragCallback() {
                    r0 = this;
                    r0.<init>()
                    return
            }
        }

        public Behavior() {
                r0 = this;
                r0.<init>()
                return
        }

        public Behavior(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
                r1 = this;
                int r0 = super.getLeftAndRightOffset()
                return r0
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
                r1 = this;
                int r0 = super.getTopAndBottomOffset()
                return r0
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
                r1 = this;
                boolean r0 = super.isHorizontalOffsetEnabled()
                return r0
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
                r1 = this;
                boolean r0 = super.isVerticalOffsetEnabled()
                return r0
        }

        @Override // com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onInterceptTouchEvent(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull android.view.MotionEvent r3) {
                r0 = this;
                boolean r1 = super.onInterceptTouchEvent(r1, r2, r3)
                return r1
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull com.google.android.material.appbar.AppBarLayout r2, int r3) {
                r0 = this;
                boolean r1 = super.onLayoutChild(r1, r2, r3)
                return r1
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onMeasureChild(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull com.google.android.material.appbar.AppBarLayout r2, int r3, int r4, int r5, int r6) {
                r0 = this;
                boolean r1 = super.onMeasureChild(r1, r2, r3, r4, r5, r6)
                return r1
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onNestedPreScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull com.google.android.material.appbar.AppBarLayout r2, android.view.View r3, int r4, int r5, int[] r6, int r7) {
                r0 = this;
                super.onNestedPreScroll(r1, r2, r3, r4, r5, r6, r7)
                return
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull com.google.android.material.appbar.AppBarLayout r2, android.view.View r3, int r4, int r5, int r6, int r7, int r8, int[] r9) {
                r0 = this;
                super.onNestedScroll(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onRestoreInstanceState(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull com.google.android.material.appbar.AppBarLayout r2, android.os.Parcelable r3) {
                r0 = this;
                super.onRestoreInstanceState(r1, r2, r3)
                return
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ android.os.Parcelable onSaveInstanceState(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull com.google.android.material.appbar.AppBarLayout r2) {
                r0 = this;
                android.os.Parcelable r1 = super.onSaveInstanceState(r1, r2)
                return r1
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onStartNestedScroll(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull com.google.android.material.appbar.AppBarLayout r2, @androidx.annotation.NonNull android.view.View r3, android.view.View r4, int r5, int r6) {
                r0 = this;
                boolean r1 = super.onStartNestedScroll(r1, r2, r3, r4, r5, r6)
                return r1
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull com.google.android.material.appbar.AppBarLayout r2, android.view.View r3, int r4) {
                r0 = this;
                super.onStopNestedScroll(r1, r2, r3, r4)
                return
        }

        @Override // com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onTouchEvent(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull android.view.MotionEvent r3) {
                r0 = this;
                boolean r1 = super.onTouchEvent(r1, r2, r3)
                return r1
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void setDragCallback(@androidx.annotation.Nullable com.google.android.material.appbar.AppBarLayout.BaseBehavior.BaseDragCallback r1) {
                r0 = this;
                super.setDragCallback(r1)
                return
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean r1) {
                r0 = this;
                super.setHorizontalOffsetEnabled(r1)
                return
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int r1) {
                r0 = this;
                boolean r1 = super.setLeftAndRightOffset(r1)
                return r1
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int r1) {
                r0 = this;
                boolean r1 = super.setTopAndBottomOffset(r1)
                return r1
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean r1) {
                r0 = this;
                super.setVerticalOffsetEnabled(r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class ChildScrollEffect {
        public ChildScrollEffect() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract void onOffsetChanged(@androidx.annotation.NonNull com.google.android.material.appbar.AppBarLayout r1, @androidx.annotation.NonNull android.view.View r2, float r3);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class CompressChildScrollEffect extends com.google.android.material.appbar.AppBarLayout.ChildScrollEffect {
        private static final float COMPRESS_DISTANCE_FACTOR = 0.3f;
        private final android.graphics.Rect ghostRect;
        private final android.graphics.Rect relativeRect;

        public CompressChildScrollEffect() {
                r1 = this;
                r1.<init>()
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r1.relativeRect = r0
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r1.ghostRect = r0
                return
        }

        private static void updateRelativeRect(android.graphics.Rect r0, com.google.android.material.appbar.AppBarLayout r1, android.view.View r2) {
                r2.getDrawingRect(r0)
                r1.offsetDescendantRectToMyCoords(r2, r0)
                int r1 = r1.getTopInset()
                int r1 = -r1
                r2 = 0
                r0.offset(r2, r1)
                return
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ChildScrollEffect
        public void onOffsetChanged(@androidx.annotation.NonNull com.google.android.material.appbar.AppBarLayout r3, @androidx.annotation.NonNull android.view.View r4, float r5) {
                r2 = this;
                android.graphics.Rect r0 = r2.relativeRect
                updateRelativeRect(r0, r3, r4)
                android.graphics.Rect r3 = r2.relativeRect
                int r3 = r3.top
                float r3 = (float) r3
                float r5 = java.lang.Math.abs(r5)
                float r3 = r3 - r5
                r5 = 0
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 > 0) goto L52
                android.graphics.Rect r0 = r2.relativeRect
                int r0 = r0.height()
                float r0 = (float) r0
                float r0 = r3 / r0
                float r0 = java.lang.Math.abs(r0)
                r1 = 1065353216(0x3f800000, float:1.0)
                float r5 = androidx.core.math.MathUtils.clamp(r0, r5, r1)
                float r3 = -r3
                float r5 = r1 - r5
                float r5 = r5 * r5
                float r1 = r1 - r5
                android.graphics.Rect r5 = r2.relativeRect
                int r5 = r5.height()
                float r5 = (float) r5
                r0 = 1050253722(0x3e99999a, float:0.3)
                float r5 = r5 * r0
                float r5 = r5 * r1
                float r3 = r3 - r5
                r4.setTranslationY(r3)
                android.graphics.Rect r5 = r2.ghostRect
                r4.getDrawingRect(r5)
                android.graphics.Rect r5 = r2.ghostRect
                r0 = 0
                float r3 = -r3
                int r3 = (int) r3
                r5.offset(r0, r3)
                android.graphics.Rect r3 = r2.ghostRect
                androidx.core.view.ViewCompat.setClipBounds(r4, r3)
                goto L59
            L52:
                r3 = 0
                androidx.core.view.ViewCompat.setClipBounds(r4, r3)
                r4.setTranslationY(r5)
            L59:
                return
        }
    }

    public static class LayoutParams extends android.widget.LinearLayout.LayoutParams {
        public static final int SCROLL_EFFECT_COMPRESS = 1;
        public static final int SCROLL_EFFECT_NONE = 0;
        public static final int SCROLL_FLAG_ENTER_ALWAYS = 4;
        public static final int SCROLL_FLAG_ENTER_ALWAYS_COLLAPSED = 8;
        public static final int SCROLL_FLAG_EXIT_UNTIL_COLLAPSED = 2;
        public static final int SCROLL_FLAG_NO_SCROLL = 0;
        public static final int SCROLL_FLAG_SCROLL = 1;
        public static final int SCROLL_FLAG_SNAP = 16;
        public static final int SCROLL_FLAG_SNAP_MARGINS = 32;
        private com.google.android.material.appbar.AppBarLayout.ChildScrollEffect scrollEffect;
        public int scrollFlags;
        public android.view.animation.Interpolator scrollInterpolator;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public @interface ScrollEffect {
        }

        /* JADX INFO: loaded from: classes.dex */
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public @interface ScrollFlags {
        }

        public LayoutParams(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 1
                r0.scrollFlags = r1
                return
        }

        public LayoutParams(int r1, int r2, float r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                r1 = 1
                r0.scrollFlags = r1
                return
        }

        public LayoutParams(android.content.Context r4, android.util.AttributeSet r5) {
                r3 = this;
                r3.<init>(r4, r5)
                r0 = 1
                r3.scrollFlags = r0
                int[] r0 = com.google.android.material.R.styleable.AppBarLayout_Layout
                android.content.res.TypedArray r5 = r4.obtainStyledAttributes(r5, r0)
                int r0 = com.google.android.material.R.styleable.AppBarLayout_Layout_layout_scrollFlags
                r1 = 0
                int r0 = r5.getInt(r0, r1)
                r3.scrollFlags = r0
                int r0 = com.google.android.material.R.styleable.AppBarLayout_Layout_layout_scrollEffect
                int r0 = r5.getInt(r0, r1)
                r3.setScrollEffect(r0)
                int r0 = com.google.android.material.R.styleable.AppBarLayout_Layout_layout_scrollInterpolator
                boolean r2 = r5.hasValue(r0)
                if (r2 == 0) goto L30
                int r0 = r5.getResourceId(r0, r1)
                android.view.animation.Interpolator r4 = android.view.animation.AnimationUtils.loadInterpolator(r4, r0)
                r3.scrollInterpolator = r4
            L30:
                r5.recycle()
                return
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = 1
                r0.scrollFlags = r1
                return
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = 1
                r0.scrollFlags = r1
                return
        }

        @androidx.annotation.RequiresApi(19)
        public LayoutParams(android.widget.LinearLayout.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = 1
                r0.scrollFlags = r1
                return
        }

        @androidx.annotation.RequiresApi(19)
        public LayoutParams(@androidx.annotation.NonNull com.google.android.material.appbar.AppBarLayout.LayoutParams r2) {
                r1 = this;
                r1.<init>(r2)
                r0 = 1
                r1.scrollFlags = r0
                int r0 = r2.scrollFlags
                r1.scrollFlags = r0
                com.google.android.material.appbar.AppBarLayout$ChildScrollEffect r0 = r2.scrollEffect
                r1.scrollEffect = r0
                android.view.animation.Interpolator r2 = r2.scrollInterpolator
                r1.scrollInterpolator = r2
                return
        }

        @androidx.annotation.Nullable
        private com.google.android.material.appbar.AppBarLayout.ChildScrollEffect createScrollEffectFromInt(int r2) {
                r1 = this;
                r0 = 1
                if (r2 == r0) goto L5
                r2 = 0
                return r2
            L5:
                com.google.android.material.appbar.AppBarLayout$CompressChildScrollEffect r2 = new com.google.android.material.appbar.AppBarLayout$CompressChildScrollEffect
                r2.<init>()
                return r2
        }

        @androidx.annotation.Nullable
        public com.google.android.material.appbar.AppBarLayout.ChildScrollEffect getScrollEffect() {
                r1 = this;
                com.google.android.material.appbar.AppBarLayout$ChildScrollEffect r0 = r1.scrollEffect
                return r0
        }

        public int getScrollFlags() {
                r1 = this;
                int r0 = r1.scrollFlags
                return r0
        }

        public android.view.animation.Interpolator getScrollInterpolator() {
                r1 = this;
                android.view.animation.Interpolator r0 = r1.scrollInterpolator
                return r0
        }

        public void setScrollEffect(int r1) {
                r0 = this;
                com.google.android.material.appbar.AppBarLayout$ChildScrollEffect r1 = r0.createScrollEffectFromInt(r1)
                r0.scrollEffect = r1
                return
        }

        public void setScrollEffect(@androidx.annotation.Nullable com.google.android.material.appbar.AppBarLayout.ChildScrollEffect r1) {
                r0 = this;
                r0.scrollEffect = r1
                return
        }

        public void setScrollFlags(int r1) {
                r0 = this;
                r0.scrollFlags = r1
                return
        }

        public void setScrollInterpolator(android.view.animation.Interpolator r1) {
                r0 = this;
                r0.scrollInterpolator = r1
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface LiftOnScrollListener {
        void onUpdate(@androidx.annotation.Dimension float r1, @androidx.annotation.ColorInt int r2);
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface OnOffsetChangedListener extends com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener<com.google.android.material.appbar.AppBarLayout> {
        @Override // com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        void onOffsetChanged(com.google.android.material.appbar.AppBarLayout r1, int r2);
    }

    public static class ScrollingViewBehavior extends com.google.android.material.appbar.HeaderScrollingViewBehavior {
        public ScrollingViewBehavior() {
                r0 = this;
                r0.<init>()
                return
        }

        public ScrollingViewBehavior(android.content.Context r2, android.util.AttributeSet r3) {
                r1 = this;
                r1.<init>(r2, r3)
                int[] r0 = com.google.android.material.R.styleable.ScrollingViewBehavior_Layout
                android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
                int r3 = com.google.android.material.R.styleable.ScrollingViewBehavior_Layout_behavior_overlapTop
                r0 = 0
                int r3 = r2.getDimensionPixelSize(r3, r0)
                r1.setOverlayTop(r3)
                r2.recycle()
                return
        }

        private static int getAppBarLayoutOffset(@androidx.annotation.NonNull com.google.android.material.appbar.AppBarLayout r1) {
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r1
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r1 = r1.getBehavior()
                boolean r0 = r1 instanceof com.google.android.material.appbar.AppBarLayout.BaseBehavior
                if (r0 == 0) goto L15
                com.google.android.material.appbar.AppBarLayout$BaseBehavior r1 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior) r1
                int r1 = r1.getTopBottomOffsetForScrollingSibling()
                return r1
            L15:
                r1 = 0
                return r1
        }

        private void offsetChildAsNeeded(@androidx.annotation.NonNull android.view.View r4, @androidx.annotation.NonNull android.view.View r5) {
                r3 = this;
                android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r0.getBehavior()
                boolean r1 = r0 instanceof com.google.android.material.appbar.AppBarLayout.BaseBehavior
                if (r1 == 0) goto L2b
                com.google.android.material.appbar.AppBarLayout$BaseBehavior r0 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior) r0
                int r1 = r5.getBottom()
                int r2 = r4.getTop()
                int r1 = r1 - r2
                int r0 = com.google.android.material.appbar.AppBarLayout.BaseBehavior.access$100(r0)
                int r0 = r0 + r1
                int r1 = r3.getVerticalLayoutGap()
                int r0 = r0 + r1
                int r5 = r3.getOverlapPixelsForOffset(r5)
                int r0 = r0 - r5
                androidx.core.view.ViewCompat.offsetTopAndBottom(r4, r0)
            L2b:
                return
        }

        private void updateLiftedStateIfNeeded(android.view.View r2, android.view.View r3) {
                r1 = this;
                boolean r0 = r3 instanceof com.google.android.material.appbar.AppBarLayout
                if (r0 == 0) goto L13
                com.google.android.material.appbar.AppBarLayout r3 = (com.google.android.material.appbar.AppBarLayout) r3
                boolean r0 = r3.isLiftOnScroll()
                if (r0 == 0) goto L13
                boolean r2 = r3.shouldLift(r2)
                r3.setLiftedState(r2)
            L13:
                return
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        @androidx.annotation.Nullable
        public final /* bridge */ /* synthetic */ android.view.View findFirstDependency(@androidx.annotation.NonNull java.util.List r1) {
                r0 = this;
                com.google.android.material.appbar.AppBarLayout r1 = r0.findFirstDependency(r1)
                return r1
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        @androidx.annotation.Nullable
        public final com.google.android.material.appbar.AppBarLayout findFirstDependency(@androidx.annotation.NonNull java.util.List<android.view.View> r5) {
                r4 = this;
                int r0 = r5.size()
                r1 = 0
            L5:
                if (r1 >= r0) goto L17
                java.lang.Object r2 = r5.get(r1)
                android.view.View r2 = (android.view.View) r2
                boolean r3 = r2 instanceof com.google.android.material.appbar.AppBarLayout
                if (r3 == 0) goto L14
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                return r2
            L14:
                int r1 = r1 + 1
                goto L5
            L17:
                r5 = 0
                return r5
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
                r1 = this;
                int r0 = super.getLeftAndRightOffset()
                return r0
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public final float getOverlapRatioForOffset(android.view.View r5) {
                r4 = this;
                boolean r0 = r5 instanceof com.google.android.material.appbar.AppBarLayout
                r1 = 0
                if (r0 == 0) goto L24
                com.google.android.material.appbar.AppBarLayout r5 = (com.google.android.material.appbar.AppBarLayout) r5
                int r0 = r5.getTotalScrollRange()
                int r2 = r5.getDownNestedPreScrollRange()
                int r5 = getAppBarLayoutOffset(r5)
                if (r2 == 0) goto L1a
                int r3 = r0 + r5
                if (r3 > r2) goto L1a
                return r1
            L1a:
                int r0 = r0 - r2
                if (r0 == 0) goto L24
                r1 = 1065353216(0x3f800000, float:1.0)
                float r5 = (float) r5
                float r0 = (float) r0
                float r5 = r5 / r0
                float r5 = r5 + r1
                return r5
            L24:
                return r1
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public final int getScrollRange(android.view.View r2) {
                r1 = this;
                boolean r0 = r2 instanceof com.google.android.material.appbar.AppBarLayout
                if (r0 == 0) goto Lb
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                int r2 = r2.getTotalScrollRange()
                return r2
            Lb:
                int r2 = r2.getMeasuredHeight()
                return r2
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
                r1 = this;
                int r0 = super.getTopAndBottomOffset()
                return r0
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
                r1 = this;
                boolean r0 = super.isHorizontalOffsetEnabled()
                return r0
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
                r1 = this;
                boolean r0 = super.isVerticalOffsetEnabled()
                return r0
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean layoutDependsOn(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, android.view.View r3) {
                r0 = this;
                boolean r1 = r3 instanceof com.google.android.material.appbar.AppBarLayout
                return r1
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onDependentViewChanged(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull android.view.View r3) {
                r0 = this;
                r0.offsetChildAsNeeded(r2, r3)
                r0.updateLiftedStateIfNeeded(r2, r3)
                r1 = 0
                return r1
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onDependentViewRemoved(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull android.view.View r3) {
                r0 = this;
                boolean r2 = r3 instanceof com.google.android.material.appbar.AppBarLayout
                if (r2 == 0) goto L1a
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r2 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD
                int r2 = r2.getId()
                androidx.core.view.ViewCompat.removeAccessibilityAction(r1, r2)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r2 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD
                int r2 = r2.getId()
                androidx.core.view.ViewCompat.removeAccessibilityAction(r1, r2)
                r2 = 0
                androidx.core.view.ViewCompat.setAccessibilityDelegate(r1, r2)
            L1a:
                return
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull android.view.View r2, int r3) {
                r0 = this;
                boolean r1 = super.onLayoutChild(r1, r2, r3)
                return r1
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onMeasureChild(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull android.view.View r2, int r3, int r4, int r5, int r6) {
                r0 = this;
                boolean r1 = super.onMeasureChild(r1, r2, r3, r4, r5, r6)
                return r1
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onRequestChildRectangleOnScreen(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r4, @androidx.annotation.NonNull android.view.View r5, @androidx.annotation.NonNull android.graphics.Rect r6, boolean r7) {
                r3 = this;
                java.util.List r0 = r4.getDependencies(r5)
                com.google.android.material.appbar.AppBarLayout r0 = r3.findFirstDependency(r0)
                r1 = 0
                if (r0 == 0) goto L30
                int r2 = r5.getLeft()
                int r5 = r5.getTop()
                r6.offset(r2, r5)
                android.graphics.Rect r5 = r3.tempRect1
                int r2 = r4.getWidth()
                int r4 = r4.getHeight()
                r5.set(r1, r1, r2, r4)
                boolean r4 = r5.contains(r6)
                if (r4 != 0) goto L30
                r4 = 1
                r5 = r7 ^ 1
                r0.setExpanded(r1, r5)
                return r4
            L30:
                return r1
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean r1) {
                r0 = this;
                super.setHorizontalOffsetEnabled(r1)
                return
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int r1) {
                r0 = this;
                boolean r1 = super.setLeftAndRightOffset(r1)
                return r1
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int r1) {
                r0 = this;
                boolean r1 = super.setTopAndBottomOffset(r1)
                return r1
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean r1) {
                r0 = this;
                super.setVerticalOffsetEnabled(r1)
                return
        }
    }

    public static /* synthetic */ void $r8$lambda$L4UAs858CLQVMmD1QMlZMKD6UY8(com.google.android.material.appbar.AppBarLayout r0, com.google.android.material.shape.MaterialShapeDrawable r1, android.animation.ValueAnimator r2) {
            r0.lambda$initializeLiftOnScrollWithColor$0(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$XV3VI5THqRjqH1lLQck6TBMHyoU(com.google.android.material.appbar.AppBarLayout r0, com.google.android.material.shape.MaterialShapeDrawable r1, android.animation.ValueAnimator r2) {
            r0.lambda$initializeLiftOnScrollWithElevation$1(r1, r2)
            return
    }

    static {
            int r0 = com.google.android.material.R.style.Widget_Design_AppBarLayout
            com.google.android.material.appbar.AppBarLayout.DEF_STYLE_RES = r0
            return
    }

    public AppBarLayout(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public AppBarLayout(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.R.attr.appBarLayoutStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public AppBarLayout(@androidx.annotation.NonNull android.content.Context r10, @androidx.annotation.Nullable android.util.AttributeSet r11, int r12) {
            r9 = this;
            int r4 = com.google.android.material.appbar.AppBarLayout.DEF_STYLE_RES
            android.content.Context r10 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r10, r11, r12, r4)
            r9.<init>(r10, r11, r12)
            r10 = -1
            r9.totalScrollRange = r10
            r9.downPreScrollRange = r10
            r9.downScrollRange = r10
            r6 = 0
            r9.pendingAction = r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.liftOnScrollListeners = r0
            android.content.Context r7 = r9.getContext()
            r0 = 1
            r9.setOrientation(r0)
            int r8 = android.os.Build.VERSION.SDK_INT
            android.view.ViewOutlineProvider r0 = r9.getOutlineProvider()
            android.view.ViewOutlineProvider r1 = android.view.ViewOutlineProvider.BACKGROUND
            if (r0 != r1) goto L31
            android.view.ViewOutlineProvider r0 = android.view.ViewOutlineProvider.BOUNDS
            r9.setOutlineProvider(r0)
        L31:
            com.google.android.material.appbar.ViewUtilsLollipop.setStateListAnimatorFromAttrs(r9, r11, r12, r4)
            int[] r2 = com.google.android.material.R.styleable.AppBarLayout
            int[] r5 = new int[r6]
            r0 = r7
            r1 = r11
            r3 = r12
            android.content.res.TypedArray r11 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r12 = com.google.android.material.R.styleable.AppBarLayout_android_background
            android.graphics.drawable.Drawable r12 = r11.getDrawable(r12)
            androidx.core.view.ViewCompat.setBackground(r9, r12)
            int r12 = com.google.android.material.R.styleable.AppBarLayout_liftOnScrollColor
            android.content.res.ColorStateList r12 = com.google.android.material.resources.MaterialResources.getColorStateList(r7, r11, r12)
            r9.liftOnScrollColor = r12
            android.graphics.drawable.Drawable r0 = r9.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.ColorDrawable
            if (r0 == 0) goto L7a
            android.graphics.drawable.Drawable r0 = r9.getBackground()
            android.graphics.drawable.ColorDrawable r0 = (android.graphics.drawable.ColorDrawable) r0
            com.google.android.material.shape.MaterialShapeDrawable r1 = new com.google.android.material.shape.MaterialShapeDrawable
            r1.<init>()
            int r0 = r0.getColor()
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.setFillColor(r0)
            if (r12 == 0) goto L74
            r9.initializeLiftOnScrollWithColor(r1)
            goto L77
        L74:
            r9.initializeLiftOnScrollWithElevation(r7, r1)
        L77:
            androidx.core.view.ViewCompat.setBackground(r9, r1)
        L7a:
            int r12 = com.google.android.material.R.attr.motionDurationMedium2
            android.content.res.Resources r0 = r9.getResources()
            int r1 = com.google.android.material.R.integer.app_bar_elevation_anim_duration
            int r0 = r0.getInteger(r1)
            int r12 = com.google.android.material.motion.MotionUtils.resolveThemeDuration(r7, r12, r0)
            long r0 = (long) r12
            r9.liftOnScrollColorDuration = r0
            int r12 = com.google.android.material.R.attr.motionEasingStandardInterpolator
            android.animation.TimeInterpolator r0 = com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR
            android.animation.TimeInterpolator r12 = com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(r7, r12, r0)
            r9.liftOnScrollColorInterpolator = r12
            int r12 = com.google.android.material.R.styleable.AppBarLayout_expanded
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto La6
            boolean r12 = r11.getBoolean(r12, r6)
            r9.setExpanded(r12, r6, r6)
        La6:
            int r12 = com.google.android.material.R.styleable.AppBarLayout_elevation
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto Lb6
            int r12 = r11.getDimensionPixelSize(r12, r6)
            float r12 = (float) r12
            com.google.android.material.appbar.ViewUtilsLollipop.setDefaultAppBarLayoutStateListAnimator(r9, r12)
        Lb6:
            r12 = 26
            if (r8 < r12) goto Ld8
            int r12 = com.google.android.material.R.styleable.AppBarLayout_android_keyboardNavigationCluster
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto Lc9
            boolean r12 = r11.getBoolean(r12, r6)
            r9.setKeyboardNavigationCluster(r12)
        Lc9:
            int r12 = com.google.android.material.R.styleable.AppBarLayout_android_touchscreenBlocksFocus
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto Ld8
            boolean r12 = r11.getBoolean(r12, r6)
            r9.setTouchscreenBlocksFocus(r12)
        Ld8:
            android.content.res.Resources r12 = r9.getResources()
            int r0 = com.google.android.material.R.dimen.design_appbar_elevation
            float r12 = r12.getDimension(r0)
            r9.appBarElevation = r12
            int r12 = com.google.android.material.R.styleable.AppBarLayout_liftOnScroll
            boolean r12 = r11.getBoolean(r12, r6)
            r9.liftOnScroll = r12
            int r12 = com.google.android.material.R.styleable.AppBarLayout_liftOnScrollTargetViewId
            int r10 = r11.getResourceId(r12, r10)
            r9.liftOnScrollTargetViewId = r10
            int r10 = com.google.android.material.R.styleable.AppBarLayout_statusBarForeground
            android.graphics.drawable.Drawable r10 = r11.getDrawable(r10)
            r9.setStatusBarForeground(r10)
            r11.recycle()
            com.google.android.material.appbar.AppBarLayout$1 r10 = new com.google.android.material.appbar.AppBarLayout$1
            r10.<init>(r9)
            androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(r9, r10)
            return
    }

    private void clearLiftOnScrollTargetView() {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.liftOnScrollTargetView
            if (r0 == 0) goto L7
            r0.clear()
        L7:
            r0 = 0
            r1.liftOnScrollTargetView = r0
            return
    }

    @androidx.annotation.Nullable
    private android.view.View findLiftOnScrollTargetView(@androidx.annotation.Nullable android.view.View r4) {
            r3 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r3.liftOnScrollTargetView
            r1 = 0
            if (r0 != 0) goto L31
            int r0 = r3.liftOnScrollTargetViewId
            r2 = -1
            if (r0 == r2) goto L31
            if (r4 == 0) goto L11
            android.view.View r4 = r4.findViewById(r0)
            goto L12
        L11:
            r4 = r1
        L12:
            if (r4 != 0) goto L28
            android.view.ViewParent r0 = r3.getParent()
            boolean r0 = r0 instanceof android.view.ViewGroup
            if (r0 == 0) goto L28
            android.view.ViewParent r4 = r3.getParent()
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r0 = r3.liftOnScrollTargetViewId
            android.view.View r4 = r4.findViewById(r0)
        L28:
            if (r4 == 0) goto L31
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r4)
            r3.liftOnScrollTargetView = r0
        L31:
            java.lang.ref.WeakReference<android.view.View> r4 = r3.liftOnScrollTargetView
            if (r4 == 0) goto L3c
            java.lang.Object r4 = r4.get()
            r1 = r4
            android.view.View r1 = (android.view.View) r1
        L3c:
            return r1
    }

    private boolean hasCollapsibleChild() {
            r6 = this;
            int r0 = r6.getChildCount()
            r1 = 0
            r2 = 0
        L6:
            if (r2 >= r0) goto L26
            android.view.View r3 = r6.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$LayoutParams r3 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r3
            int r3 = r3.scrollFlags
            r4 = r3 & 1
            r5 = 1
            if (r4 != r5) goto L1f
            r3 = r3 & 10
            if (r3 == 0) goto L1f
            r3 = 1
            goto L20
        L1f:
            r3 = 0
        L20:
            if (r3 == 0) goto L23
            return r5
        L23:
            int r2 = r2 + 1
            goto L6
        L26:
            return r1
    }

    private void initializeLiftOnScrollWithColor(com.google.android.material.shape.MaterialShapeDrawable r3) {
            r2 = this;
            boolean r0 = r2.lifted
            r1 = 0
            if (r0 == 0) goto L8
            r0 = 255(0xff, float:3.57E-43)
            goto L9
        L8:
            r0 = 0
        L9:
            r3.setAlpha(r0)
            android.content.res.ColorStateList r0 = r2.liftOnScrollColor
            r3.setFillColor(r0)
            com.google.android.material.appbar.AppBarLayout$$ExternalSyntheticLambda0 r0 = new com.google.android.material.appbar.AppBarLayout$$ExternalSyntheticLambda0
            r0.<init>(r2, r3, r1)
            r2.liftOnScrollColorUpdateListener = r0
            return
    }

    private void initializeLiftOnScrollWithElevation(android.content.Context r2, com.google.android.material.shape.MaterialShapeDrawable r3) {
            r1 = this;
            r3.initializeElevationOverlay(r2)
            com.google.android.material.appbar.AppBarLayout$$ExternalSyntheticLambda0 r2 = new com.google.android.material.appbar.AppBarLayout$$ExternalSyntheticLambda0
            r0 = 1
            r2.<init>(r1, r3, r0)
            r1.liftOnScrollColorUpdateListener = r2
            return
    }

    private void invalidateScrollRanges() {
            r3 = this;
            com.google.android.material.appbar.AppBarLayout$Behavior r0 = r3.behavior
            r1 = -1
            if (r0 == 0) goto L15
            int r2 = r3.totalScrollRange
            if (r2 == r1) goto L15
            int r2 = r3.pendingAction
            if (r2 == 0) goto Le
            goto L15
        Le:
            androidx.customview.view.AbsSavedState r2 = androidx.customview.view.AbsSavedState.EMPTY_STATE
            com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState r0 = r0.saveScrollState(r2, r3)
            goto L16
        L15:
            r0 = 0
        L16:
            r3.totalScrollRange = r1
            r3.downPreScrollRange = r1
            r3.downScrollRange = r1
            if (r0 == 0) goto L23
            com.google.android.material.appbar.AppBarLayout$Behavior r1 = r3.behavior
            r1.restoreScrollState(r0)
        L23:
            return
    }

    private /* synthetic */ void lambda$initializeLiftOnScrollWithColor$0(com.google.android.material.shape.MaterialShapeDrawable r5, android.animation.ValueAnimator r6) {
            r4 = this;
            java.lang.Object r6 = r6.getAnimatedValue()
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            int r6 = (int) r6
            r5.setAlpha(r6)
            java.util.List<com.google.android.material.appbar.AppBarLayout$LiftOnScrollListener> r0 = r4.liftOnScrollListeners
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r0.next()
            com.google.android.material.appbar.AppBarLayout$LiftOnScrollListener r1 = (com.google.android.material.appbar.AppBarLayout.LiftOnScrollListener) r1
            android.content.res.ColorStateList r2 = r5.getFillColor()
            if (r2 == 0) goto L14
            r2 = 0
            android.content.res.ColorStateList r3 = r5.getFillColor()
            android.content.res.ColorStateList r3 = r3.withAlpha(r6)
            int r3 = r3.getDefaultColor()
            r1.onUpdate(r2, r3)
            goto L14
        L37:
            return
    }

    private /* synthetic */ void lambda$initializeLiftOnScrollWithElevation$1(com.google.android.material.shape.MaterialShapeDrawable r4, android.animation.ValueAnimator r5) {
            r3 = this;
            java.lang.Object r5 = r5.getAnimatedValue()
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            r4.setElevation(r5)
            android.graphics.drawable.Drawable r0 = r3.statusBarForeground
            boolean r1 = r0 instanceof com.google.android.material.shape.MaterialShapeDrawable
            if (r1 == 0) goto L18
            com.google.android.material.shape.MaterialShapeDrawable r0 = (com.google.android.material.shape.MaterialShapeDrawable) r0
            r0.setElevation(r5)
        L18:
            java.util.List<com.google.android.material.appbar.AppBarLayout$LiftOnScrollListener> r0 = r3.liftOnScrollListeners
            java.util.Iterator r0 = r0.iterator()
        L1e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L32
            java.lang.Object r1 = r0.next()
            com.google.android.material.appbar.AppBarLayout$LiftOnScrollListener r1 = (com.google.android.material.appbar.AppBarLayout.LiftOnScrollListener) r1
            int r2 = r4.getResolvedTintColor()
            r1.onUpdate(r5, r2)
            goto L1e
        L32:
            return
    }

    private void setExpanded(boolean r2, boolean r3, boolean r4) {
            r1 = this;
            if (r2 == 0) goto L4
            r2 = 1
            goto L5
        L4:
            r2 = 2
        L5:
            r0 = 0
            if (r3 == 0) goto La
            r3 = 4
            goto Lb
        La:
            r3 = 0
        Lb:
            r2 = r2 | r3
            if (r4 == 0) goto L10
            r0 = 8
        L10:
            r2 = r2 | r0
            r1.pendingAction = r2
            r1.requestLayout()
            return
    }

    private boolean setLiftableState(boolean r2) {
            r1 = this;
            boolean r0 = r1.liftable
            if (r0 == r2) goto Lb
            r1.liftable = r2
            r1.refreshDrawableState()
            r2 = 1
            return r2
        Lb:
            r2 = 0
            return r2
    }

    private boolean shouldDrawStatusBarForeground() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.statusBarForeground
            if (r0 == 0) goto Lc
            int r0 = r1.getTopInset()
            if (r0 <= 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    private boolean shouldOffsetFirstChild() {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
            if (r0 <= 0) goto L1a
            android.view.View r0 = r4.getChildAt(r1)
            int r2 = r0.getVisibility()
            r3 = 8
            if (r2 == r3) goto L1a
            boolean r0 = androidx.core.view.ViewCompat.getFitsSystemWindows(r0)
            if (r0 != 0) goto L1a
            r1 = 1
        L1a:
            return r1
    }

    private void startLiftOnScrollColorAnimation(float r3, float r4) {
            r2 = this;
            android.animation.ValueAnimator r0 = r2.liftOnScrollColorAnimator
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            r0 = 2
            float[] r0 = new float[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            android.animation.ValueAnimator r3 = android.animation.ValueAnimator.ofFloat(r0)
            r2.liftOnScrollColorAnimator = r3
            long r0 = r2.liftOnScrollColorDuration
            r3.setDuration(r0)
            android.animation.ValueAnimator r3 = r2.liftOnScrollColorAnimator
            android.animation.TimeInterpolator r4 = r2.liftOnScrollColorInterpolator
            r3.setInterpolator(r4)
            android.animation.ValueAnimator$AnimatorUpdateListener r3 = r2.liftOnScrollColorUpdateListener
            if (r3 == 0) goto L2b
            android.animation.ValueAnimator r4 = r2.liftOnScrollColorAnimator
            r4.addUpdateListener(r3)
        L2b:
            android.animation.ValueAnimator r3 = r2.liftOnScrollColorAnimator
            r3.start()
            return
    }

    private void updateWillNotDraw() {
            r1 = this;
            boolean r0 = r1.shouldDrawStatusBarForeground()
            r0 = r0 ^ 1
            r1.setWillNotDraw(r0)
            return
    }

    public void addLiftOnScrollListener(@androidx.annotation.NonNull com.google.android.material.appbar.AppBarLayout.LiftOnScrollListener r2) {
            r1 = this;
            java.util.List<com.google.android.material.appbar.AppBarLayout$LiftOnScrollListener> r0 = r1.liftOnScrollListeners
            r0.add(r2)
            return
    }

    public void addOnOffsetChangedListener(@androidx.annotation.Nullable com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener r2) {
            r1 = this;
            java.util.List<com.google.android.material.appbar.AppBarLayout$BaseOnOffsetChangedListener> r0 = r1.listeners
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.listeners = r0
        Lb:
            if (r2 == 0) goto L1a
            java.util.List<com.google.android.material.appbar.AppBarLayout$BaseOnOffsetChangedListener> r0 = r1.listeners
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L1a
            java.util.List<com.google.android.material.appbar.AppBarLayout$BaseOnOffsetChangedListener> r0 = r1.listeners
            r0.add(r2)
        L1a:
            return
    }

    public void addOnOffsetChangedListener(com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener r1) {
            r0 = this;
            r0.addOnOffsetChangedListener(r1)
            return
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r1 = r1 instanceof com.google.android.material.appbar.AppBarLayout.LayoutParams
            return r1
    }

    public void clearLiftOnScrollListener() {
            r1 = this;
            java.util.List<com.google.android.material.appbar.AppBarLayout$LiftOnScrollListener> r0 = r1.liftOnScrollListeners
            r0.clear()
            return
    }

    @Override // android.view.View
    public void draw(@androidx.annotation.NonNull android.graphics.Canvas r4) {
            r3 = this;
            super.draw(r4)
            boolean r0 = r3.shouldDrawStatusBarForeground()
            if (r0 == 0) goto L1d
            int r0 = r4.save()
            r1 = 0
            int r2 = r3.currentOffset
            int r2 = -r2
            float r2 = (float) r2
            r4.translate(r1, r2)
            android.graphics.drawable.Drawable r1 = r3.statusBarForeground
            r1.draw(r4)
            r4.restoreToCount(r0)
        L1d:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
            r3 = this;
            super.drawableStateChanged()
            int[] r0 = r3.getDrawableState()
            android.graphics.drawable.Drawable r1 = r3.statusBarForeground
            if (r1 == 0) goto L1a
            boolean r2 = r1.isStateful()
            if (r2 == 0) goto L1a
            boolean r0 = r1.setState(r0)
            if (r0 == 0) goto L1a
            r3.invalidateDrawable(r1)
        L1a:
            return
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r3 = this;
            com.google.android.material.appbar.AppBarLayout$LayoutParams r0 = new com.google.android.material.appbar.AppBarLayout$LayoutParams
            r1 = -1
            r2 = -2
            r0.<init>(r1, r2)
            return r0
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final android.widget.LinearLayout.LayoutParams generateDefaultLayoutParams() {
            r3 = this;
            com.google.android.material.appbar.AppBarLayout$LayoutParams r0 = new com.google.android.material.appbar.AppBarLayout$LayoutParams
            r1 = -1
            r2 = -2
            r0.<init>(r1, r2)
            return r0
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            com.google.android.material.appbar.AppBarLayout$LayoutParams r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            com.google.android.material.appbar.AppBarLayout$LayoutParams r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.widget.LinearLayout.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            com.google.android.material.appbar.AppBarLayout$LayoutParams r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ android.widget.LinearLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            com.google.android.material.appbar.AppBarLayout$LayoutParams r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public com.google.android.material.appbar.AppBarLayout.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            com.google.android.material.appbar.AppBarLayout$LayoutParams r0 = new com.google.android.material.appbar.AppBarLayout$LayoutParams
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final com.google.android.material.appbar.AppBarLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.widget.LinearLayout.LayoutParams
            if (r0 == 0) goto Lc
            com.google.android.material.appbar.AppBarLayout$LayoutParams r0 = new com.google.android.material.appbar.AppBarLayout$LayoutParams
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            r0.<init>(r2)
            return r0
        Lc:
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L18
            com.google.android.material.appbar.AppBarLayout$LayoutParams r0 = new com.google.android.material.appbar.AppBarLayout$LayoutParams
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r0.<init>(r2)
            return r0
        L18:
            com.google.android.material.appbar.AppBarLayout$LayoutParams r0 = new com.google.android.material.appbar.AppBarLayout$LayoutParams
            r0.<init>(r2)
            return r0
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @androidx.annotation.NonNull
    public androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<com.google.android.material.appbar.AppBarLayout> getBehavior() {
            r1 = this;
            com.google.android.material.appbar.AppBarLayout$Behavior r0 = new com.google.android.material.appbar.AppBarLayout$Behavior
            r0.<init>()
            r1.behavior = r0
            return r0
    }

    public int getDownNestedPreScrollRange() {
            r9 = this;
            int r0 = r9.downPreScrollRange
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            int r0 = r9.getChildCount()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = 0
        Le:
            if (r0 < 0) goto L63
            android.view.View r3 = r9.getChildAt(r0)
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 != r5) goto L1d
            goto L60
        L1d:
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$LayoutParams r4 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r4
            int r5 = r3.getMeasuredHeight()
            int r6 = r4.scrollFlags
            r7 = r6 & 5
            r8 = 5
            if (r7 != r8) goto L5d
            int r7 = r4.topMargin
            int r4 = r4.bottomMargin
            int r7 = r7 + r4
            r4 = r6 & 8
            if (r4 == 0) goto L3d
            int r4 = androidx.core.view.ViewCompat.getMinimumHeight(r3)
        L3b:
            int r4 = r4 + r7
            goto L4a
        L3d:
            r4 = r6 & 2
            if (r4 == 0) goto L48
            int r4 = androidx.core.view.ViewCompat.getMinimumHeight(r3)
            int r4 = r5 - r4
            goto L3b
        L48:
            int r4 = r7 + r5
        L4a:
            if (r0 != 0) goto L5b
            boolean r3 = androidx.core.view.ViewCompat.getFitsSystemWindows(r3)
            if (r3 == 0) goto L5b
            int r3 = r9.getTopInset()
            int r5 = r5 - r3
            int r4 = java.lang.Math.min(r4, r5)
        L5b:
            int r2 = r2 + r4
            goto L60
        L5d:
            if (r2 <= 0) goto L60
            goto L63
        L60:
            int r0 = r0 + (-1)
            goto Le
        L63:
            int r0 = java.lang.Math.max(r1, r2)
            r9.downPreScrollRange = r0
            return r0
    }

    public int getDownNestedScrollRange() {
            r9 = this;
            int r0 = r9.downScrollRange
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            int r0 = r9.getChildCount()
            r1 = 0
            r2 = 0
            r3 = 0
        Ld:
            if (r2 >= r0) goto L40
            android.view.View r4 = r9.getChildAt(r2)
            int r5 = r4.getVisibility()
            r6 = 8
            if (r5 != r6) goto L1c
            goto L3d
        L1c:
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$LayoutParams r5 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r5
            int r6 = r4.getMeasuredHeight()
            int r7 = r5.topMargin
            int r8 = r5.bottomMargin
            int r7 = r7 + r8
            int r7 = r7 + r6
            int r5 = r5.scrollFlags
            r6 = r5 & 1
            if (r6 == 0) goto L40
            int r3 = r3 + r7
            r5 = r5 & 2
            if (r5 == 0) goto L3d
            int r0 = androidx.core.view.ViewCompat.getMinimumHeight(r4)
            int r3 = r3 - r0
            goto L40
        L3d:
            int r2 = r2 + 1
            goto Ld
        L40:
            int r0 = java.lang.Math.max(r1, r3)
            r9.downScrollRange = r0
            return r0
    }

    @androidx.annotation.IdRes
    public int getLiftOnScrollTargetViewId() {
            r1 = this;
            int r0 = r1.liftOnScrollTargetViewId
            return r0
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
            r3 = this;
            int r0 = r3.getTopInset()
            int r1 = androidx.core.view.ViewCompat.getMinimumHeight(r3)
            if (r1 == 0) goto Le
        La:
            int r1 = r1 * 2
            int r1 = r1 + r0
            return r1
        Le:
            int r1 = r3.getChildCount()
            r2 = 1
            if (r1 < r2) goto L1f
            int r1 = r1 - r2
            android.view.View r1 = r3.getChildAt(r1)
            int r1 = androidx.core.view.ViewCompat.getMinimumHeight(r1)
            goto L20
        L1f:
            r1 = 0
        L20:
            if (r1 == 0) goto L23
            goto La
        L23:
            int r0 = r3.getHeight()
            int r0 = r0 / 3
            return r0
    }

    public int getPendingAction() {
            r1 = this;
            int r0 = r1.pendingAction
            return r0
    }

    @androidx.annotation.Nullable
    public android.graphics.drawable.Drawable getStatusBarForeground() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.statusBarForeground
            return r0
    }

    @java.lang.Deprecated
    public float getTargetElevation() {
            r1 = this;
            r0 = 0
            return r0
    }

    @androidx.annotation.VisibleForTesting
    public final int getTopInset() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat r0 = r1.lastInsets
            if (r0 == 0) goto L9
            int r0 = r0.getSystemWindowInsetTop()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public final int getTotalScrollRange() {
            r9 = this;
            int r0 = r9.totalScrollRange
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            int r0 = r9.getChildCount()
            r1 = 0
            r2 = 0
            r3 = 0
        Ld:
            if (r2 >= r0) goto L4e
            android.view.View r4 = r9.getChildAt(r2)
            int r5 = r4.getVisibility()
            r6 = 8
            if (r5 != r6) goto L1c
            goto L4b
        L1c:
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$LayoutParams r5 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r5
            int r6 = r4.getMeasuredHeight()
            int r7 = r5.scrollFlags
            r8 = r7 & 1
            if (r8 == 0) goto L4e
            int r8 = r5.topMargin
            int r6 = r6 + r8
            int r5 = r5.bottomMargin
            int r6 = r6 + r5
            int r6 = r6 + r3
            if (r2 != 0) goto L40
            boolean r3 = androidx.core.view.ViewCompat.getFitsSystemWindows(r4)
            if (r3 == 0) goto L40
            int r3 = r9.getTopInset()
            int r6 = r6 - r3
        L40:
            r3 = r6
            r5 = r7 & 2
            if (r5 == 0) goto L4b
            int r0 = androidx.core.view.ViewCompat.getMinimumHeight(r4)
            int r3 = r3 - r0
            goto L4e
        L4b:
            int r2 = r2 + 1
            goto Ld
        L4e:
            int r0 = java.lang.Math.max(r1, r3)
            r9.totalScrollRange = r0
            return r0
    }

    public int getUpNestedPreScrollRange() {
            r1 = this;
            int r0 = r1.getTotalScrollRange()
            return r0
    }

    public final boolean hasChildWithInterpolator() {
            r1 = this;
            boolean r0 = r1.haveChildWithInterpolator
            return r0
    }

    public boolean isLiftOnScroll() {
            r1 = this;
            boolean r0 = r1.liftOnScroll
            return r0
    }

    public boolean isLifted() {
            r1 = this;
            boolean r0 = r1.lifted
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r0 = this;
            super.onAttachedToWindow()
            com.google.android.material.shape.MaterialShapeUtils.setParentAbsoluteElevation(r0)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int r5) {
            r4 = this;
            int[] r0 = r4.tmpStatesArray
            if (r0 != 0) goto L9
            r0 = 4
            int[] r0 = new int[r0]
            r4.tmpStatesArray = r0
        L9:
            int[] r0 = r4.tmpStatesArray
            int r1 = r0.length
            int r5 = r5 + r1
            int[] r5 = super.onCreateDrawableState(r5)
            r1 = 0
            boolean r2 = r4.liftable
            int r3 = com.google.android.material.R.attr.state_liftable
            if (r2 == 0) goto L19
            goto L1a
        L19:
            int r3 = -r3
        L1a:
            r0[r1] = r3
            r1 = 1
            if (r2 == 0) goto L26
            boolean r3 = r4.lifted
            if (r3 == 0) goto L26
            int r3 = com.google.android.material.R.attr.state_lifted
            goto L29
        L26:
            int r3 = com.google.android.material.R.attr.state_lifted
            int r3 = -r3
        L29:
            r0[r1] = r3
            r1 = 2
            int r3 = com.google.android.material.R.attr.state_collapsible
            if (r2 == 0) goto L31
            goto L32
        L31:
            int r3 = -r3
        L32:
            r0[r1] = r3
            r1 = 3
            if (r2 == 0) goto L3e
            boolean r2 = r4.lifted
            if (r2 == 0) goto L3e
            int r2 = com.google.android.material.R.attr.state_collapsed
            goto L41
        L3e:
            int r2 = com.google.android.material.R.attr.state_collapsed
            int r2 = -r2
        L41:
            r0[r1] = r2
            int[] r5 = android.view.View.mergeDrawableStates(r5, r0)
            return r5
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r0 = this;
            super.onDetachedFromWindow()
            r0.clearLiftOnScrollTargetView()
            return
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            boolean r1 = androidx.core.view.ViewCompat.getFitsSystemWindows(r0)
            r2 = 1
            if (r1 == 0) goto L25
            boolean r1 = r0.shouldOffsetFirstChild()
            if (r1 == 0) goto L25
            int r1 = r0.getTopInset()
            int r3 = r0.getChildCount()
            int r3 = r3 - r2
        L19:
            if (r3 < 0) goto L25
            android.view.View r4 = r0.getChildAt(r3)
            androidx.core.view.ViewCompat.offsetTopAndBottom(r4, r1)
            int r3 = r3 + (-1)
            goto L19
        L25:
            r0.invalidateScrollRanges()
            r1 = 0
            r0.haveChildWithInterpolator = r1
            int r3 = r0.getChildCount()
            r4 = 0
        L30:
            if (r4 >= r3) goto L48
            android.view.View r5 = r0.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$LayoutParams r5 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r5
            android.view.animation.Interpolator r5 = r5.getScrollInterpolator()
            if (r5 == 0) goto L45
            r0.haveChildWithInterpolator = r2
            goto L48
        L45:
            int r4 = r4 + 1
            goto L30
        L48:
            android.graphics.drawable.Drawable r3 = r0.statusBarForeground
            if (r3 == 0) goto L57
            int r4 = r0.getWidth()
            int r5 = r0.getTopInset()
            r3.setBounds(r1, r1, r4, r5)
        L57:
            boolean r3 = r0.liftableOverride
            if (r3 != 0) goto L6a
            boolean r3 = r0.liftOnScroll
            if (r3 != 0) goto L67
            boolean r3 = r0.hasCollapsibleChild()
            if (r3 == 0) goto L66
            goto L67
        L66:
            r2 = 0
        L67:
            r0.setLiftableState(r2)
        L6a:
            return
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r3, int r4) {
            r2 = this;
            super.onMeasure(r3, r4)
            int r3 = android.view.View.MeasureSpec.getMode(r4)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r3 == r0) goto L41
            boolean r0 = androidx.core.view.ViewCompat.getFitsSystemWindows(r2)
            if (r0 == 0) goto L41
            boolean r0 = r2.shouldOffsetFirstChild()
            if (r0 == 0) goto L41
            int r0 = r2.getMeasuredHeight()
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r1) goto L28
            if (r3 == 0) goto L22
            goto L3a
        L22:
            int r3 = r2.getTopInset()
            int r0 = r0 + r3
            goto L3a
        L28:
            int r3 = r2.getMeasuredHeight()
            int r0 = r2.getTopInset()
            int r0 = r0 + r3
            r3 = 0
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            int r0 = androidx.core.math.MathUtils.clamp(r0, r3, r4)
        L3a:
            int r3 = r2.getMeasuredWidth()
            r2.setMeasuredDimension(r3, r0)
        L41:
            r2.invalidateScrollRanges()
            return
    }

    public final void onOffsetChanged(int r4) {
            r3 = this;
            r3.currentOffset = r4
            boolean r0 = r3.willNotDraw()
            if (r0 != 0) goto Lb
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r3)
        Lb:
            java.util.List<com.google.android.material.appbar.AppBarLayout$BaseOnOffsetChangedListener> r0 = r3.listeners
            if (r0 == 0) goto L26
            r1 = 0
            int r0 = r0.size()
        L14:
            if (r1 >= r0) goto L26
            java.util.List<com.google.android.material.appbar.AppBarLayout$BaseOnOffsetChangedListener> r2 = r3.listeners
            java.lang.Object r2 = r2.get(r1)
            com.google.android.material.appbar.AppBarLayout$BaseOnOffsetChangedListener r2 = (com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener) r2
            if (r2 == 0) goto L23
            r2.onOffsetChanged(r3, r4)
        L23:
            int r1 = r1 + 1
            goto L14
        L26:
            return
    }

    public final androidx.core.view.WindowInsetsCompat onWindowInsetChanged(androidx.core.view.WindowInsetsCompat r3) {
            r2 = this;
            boolean r0 = androidx.core.view.ViewCompat.getFitsSystemWindows(r2)
            if (r0 == 0) goto L8
            r0 = r3
            goto L9
        L8:
            r0 = 0
        L9:
            androidx.core.view.WindowInsetsCompat r1 = r2.lastInsets
            boolean r1 = androidx.core.util.ObjectsCompat.equals(r1, r0)
            if (r1 != 0) goto L19
            r2.lastInsets = r0
            r2.updateWillNotDraw()
            r2.requestLayout()
        L19:
            return r3
    }

    public boolean removeLiftOnScrollListener(@androidx.annotation.NonNull com.google.android.material.appbar.AppBarLayout.LiftOnScrollListener r2) {
            r1 = this;
            java.util.List<com.google.android.material.appbar.AppBarLayout$LiftOnScrollListener> r0 = r1.liftOnScrollListeners
            boolean r2 = r0.remove(r2)
            return r2
    }

    public void removeOnOffsetChangedListener(@androidx.annotation.Nullable com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener r2) {
            r1 = this;
            java.util.List<com.google.android.material.appbar.AppBarLayout$BaseOnOffsetChangedListener> r0 = r1.listeners
            if (r0 == 0) goto L9
            if (r2 == 0) goto L9
            r0.remove(r2)
        L9:
            return
    }

    public void removeOnOffsetChangedListener(com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener r1) {
            r0 = this;
            r0.removeOnOffsetChangedListener(r1)
            return
    }

    public final void resetPendingAction() {
            r1 = this;
            r0 = 0
            r1.pendingAction = r0
            return
    }

    @Override // android.view.View
    @androidx.annotation.RequiresApi(21)
    public void setElevation(float r1) {
            r0 = this;
            super.setElevation(r1)
            com.google.android.material.shape.MaterialShapeUtils.setElevation(r0, r1)
            return
    }

    public void setExpanded(boolean r2) {
            r1 = this;
            boolean r0 = androidx.core.view.ViewCompat.isLaidOut(r1)
            r1.setExpanded(r2, r0)
            return
    }

    public void setExpanded(boolean r2, boolean r3) {
            r1 = this;
            r0 = 1
            r1.setExpanded(r2, r3, r0)
            return
    }

    public void setLiftOnScroll(boolean r1) {
            r0 = this;
            r0.liftOnScroll = r1
            return
    }

    public void setLiftOnScrollTargetView(@androidx.annotation.Nullable android.view.View r2) {
            r1 = this;
            r0 = -1
            r1.liftOnScrollTargetViewId = r0
            if (r2 != 0) goto L9
            r1.clearLiftOnScrollTargetView()
            goto L10
        L9:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.liftOnScrollTargetView = r0
        L10:
            return
    }

    public void setLiftOnScrollTargetViewId(@androidx.annotation.IdRes int r1) {
            r0 = this;
            r0.liftOnScrollTargetViewId = r1
            r0.clearLiftOnScrollTargetView()
            return
    }

    public boolean setLiftable(boolean r2) {
            r1 = this;
            r0 = 1
            r1.liftableOverride = r0
            boolean r2 = r1.setLiftableState(r2)
            return r2
    }

    public void setLiftableOverrideEnabled(boolean r1) {
            r0 = this;
            r0.liftableOverride = r1
            return
    }

    public boolean setLifted(boolean r2) {
            r1 = this;
            r0 = 1
            boolean r2 = r1.setLiftedState(r2, r0)
            return r2
    }

    public final boolean setLiftedState(boolean r2) {
            r1 = this;
            boolean r0 = r1.liftableOverride
            r0 = r0 ^ 1
            boolean r2 = r1.setLiftedState(r2, r0)
            return r2
    }

    public final boolean setLiftedState(boolean r3, boolean r4) {
            r2 = this;
            if (r4 == 0) goto L3b
            boolean r4 = r2.lifted
            if (r4 == r3) goto L3b
            r2.lifted = r3
            r2.refreshDrawableState()
            boolean r4 = r2.liftOnScroll
            if (r4 == 0) goto L39
            android.graphics.drawable.Drawable r4 = r2.getBackground()
            boolean r4 = r4 instanceof com.google.android.material.shape.MaterialShapeDrawable
            if (r4 == 0) goto L39
            android.content.res.ColorStateList r4 = r2.liftOnScrollColor
            r0 = 0
            if (r4 == 0) goto L2c
            r4 = 1132396544(0x437f0000, float:255.0)
            if (r3 == 0) goto L22
            r1 = 0
            goto L24
        L22:
            r1 = 1132396544(0x437f0000, float:255.0)
        L24:
            if (r3 == 0) goto L28
            r0 = 1132396544(0x437f0000, float:255.0)
        L28:
            r2.startLiftOnScrollColorAnimation(r1, r0)
            goto L39
        L2c:
            if (r3 == 0) goto L30
            r4 = 0
            goto L32
        L30:
            float r4 = r2.appBarElevation
        L32:
            if (r3 == 0) goto L36
            float r0 = r2.appBarElevation
        L36:
            r2.startLiftOnScrollColorAnimation(r4, r0)
        L39:
            r3 = 1
            return r3
        L3b:
            r3 = 0
            return r3
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int r2) {
            r1 = this;
            r0 = 1
            if (r2 != r0) goto L7
            super.setOrientation(r2)
            return
        L7:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "AppBarLayout is always vertical and does not support horizontal orientation"
            r2.<init>(r0)
            throw r2
    }

    public void setStatusBarForeground(@androidx.annotation.Nullable android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.statusBarForeground
            if (r0 == r3) goto L46
            r1 = 0
            if (r0 == 0) goto La
            r0.setCallback(r1)
        La:
            if (r3 == 0) goto L10
            android.graphics.drawable.Drawable r1 = r3.mutate()
        L10:
            r2.statusBarForeground = r1
            if (r1 == 0) goto L40
            boolean r3 = r1.isStateful()
            if (r3 == 0) goto L23
            android.graphics.drawable.Drawable r3 = r2.statusBarForeground
            int[] r0 = r2.getDrawableState()
            r3.setState(r0)
        L23:
            android.graphics.drawable.Drawable r3 = r2.statusBarForeground
            int r0 = androidx.core.view.ViewCompat.getLayoutDirection(r2)
            androidx.core.graphics.drawable.DrawableCompat.setLayoutDirection(r3, r0)
            android.graphics.drawable.Drawable r3 = r2.statusBarForeground
            int r0 = r2.getVisibility()
            r1 = 0
            if (r0 != 0) goto L37
            r0 = 1
            goto L38
        L37:
            r0 = 0
        L38:
            r3.setVisible(r0, r1)
            android.graphics.drawable.Drawable r3 = r2.statusBarForeground
            r3.setCallback(r2)
        L40:
            r2.updateWillNotDraw()
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r2)
        L46:
            return
    }

    public void setStatusBarForegroundColor(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r2)
            r1.setStatusBarForeground(r0)
            return
    }

    public void setStatusBarForegroundResource(@androidx.annotation.DrawableRes int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
            r1.setStatusBarForeground(r2)
            return
    }

    @java.lang.Deprecated
    public void setTargetElevation(float r1) {
            r0 = this;
            com.google.android.material.appbar.ViewUtilsLollipop.setDefaultAppBarLayoutStateListAnimator(r0, r1)
            return
    }

    @Override // android.view.View
    public void setVisibility(int r3) {
            r2 = this;
            super.setVisibility(r3)
            r0 = 0
            if (r3 != 0) goto L8
            r3 = 1
            goto L9
        L8:
            r3 = 0
        L9:
            android.graphics.drawable.Drawable r1 = r2.statusBarForeground
            if (r1 == 0) goto L10
            r1.setVisible(r3, r0)
        L10:
            return
    }

    public final boolean shouldLift(@androidx.annotation.Nullable android.view.View r2) {
            r1 = this;
            android.view.View r0 = r1.findLiftOnScrollTargetView(r2)
            if (r0 != 0) goto L7
            goto L8
        L7:
            r2 = r0
        L8:
            if (r2 == 0) goto L19
            r0 = -1
            boolean r0 = r2.canScrollVertically(r0)
            if (r0 != 0) goto L17
            int r2 = r2.getScrollY()
            if (r2 <= 0) goto L19
        L17:
            r2 = 1
            goto L1a
        L19:
            r2 = 0
        L1a:
            return r2
    }

    @Override // android.view.View
    public final boolean verifyDrawable(@androidx.annotation.NonNull android.graphics.drawable.Drawable r2) {
            r1 = this;
            boolean r0 = super.verifyDrawable(r2)
            if (r0 != 0) goto Ld
            android.graphics.drawable.Drawable r0 = r1.statusBarForeground
            if (r2 != r0) goto Lb
            goto Ld
        Lb:
            r2 = 0
            goto Le
        Ld:
            r2 = 1
        Le:
            return r2
    }
}
