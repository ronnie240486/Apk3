package androidx.coordinatorlayout.widget;

/* JADX INFO: loaded from: classes2.dex */
public class CoordinatorLayout extends android.view.ViewGroup implements androidx.core.view.NestedScrollingParent2, androidx.core.view.NestedScrollingParent3 {
    public static final java.lang.Class<?>[] CONSTRUCTOR_PARAMS = null;
    public static final java.util.Comparator<android.view.View> TOP_SORTED_CHILDREN_COMPARATOR = null;
    private static final int TYPE_ON_INTERCEPT = 0;
    private static final int TYPE_ON_TOUCH = 1;
    public static final java.lang.String WIDGET_PACKAGE_NAME = null;
    public static final java.lang.ThreadLocal<java.util.Map<java.lang.String, java.lang.reflect.Constructor<androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior>>> sConstructors = null;
    private static final androidx.core.util.Pools.Pool<android.graphics.Rect> sRectPool = null;
    private androidx.core.view.OnApplyWindowInsetsListener mApplyWindowInsetsListener;
    private final int[] mBehaviorConsumed;
    private android.view.View mBehaviorTouchView;
    private final androidx.coordinatorlayout.widget.DirectedAcyclicGraph<android.view.View> mChildDag;
    private final java.util.List<android.view.View> mDependencySortedChildren;
    private boolean mDisallowInterceptReset;
    private boolean mDrawStatusBarBackground;
    private boolean mIsAttachedToWindow;
    private int[] mKeylines;
    private androidx.core.view.WindowInsetsCompat mLastInsets;
    private boolean mNeedsPreDrawListener;
    private final androidx.core.view.NestedScrollingParentHelper mNestedScrollingParentHelper;
    private android.view.View mNestedScrollingTarget;
    private final int[] mNestedScrollingV2ConsumedCompat;
    public android.view.ViewGroup.OnHierarchyChangeListener mOnHierarchyChangeListener;
    private androidx.coordinatorlayout.widget.CoordinatorLayout.OnPreDrawListener mOnPreDrawListener;
    private android.graphics.Paint mScrimPaint;
    private android.graphics.drawable.Drawable mStatusBarBackground;
    private final java.util.List<android.view.View> mTempDependenciesList;
    private final java.util.List<android.view.View> mTempList1;


    /* JADX INFO: loaded from: classes.dex */
    public interface AttachedBehavior {
        @androidx.annotation.NonNull
        androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior getBehavior();
    }

    /* JADX INFO: loaded from: classes.dex */
    public static abstract class Behavior<V extends android.view.View> {
        public Behavior() {
                r0 = this;
                r0.<init>()
                return
        }

        public Behavior(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.Nullable
        public static java.lang.Object getTag(@androidx.annotation.NonNull android.view.View r0) {
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
                java.lang.Object r0 = r0.mBehaviorTag
                return r0
        }

        public static void setTag(@androidx.annotation.NonNull android.view.View r0, @androidx.annotation.Nullable java.lang.Object r1) {
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
                r0.mBehaviorTag = r1
                return
        }

        public boolean blocksInteractionBelow(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2) {
                r0 = this;
                float r1 = r0.getScrimOpacity(r1, r2)
                r2 = 0
                int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r1 <= 0) goto Lb
                r1 = 1
                goto Lc
            Lb:
                r1 = 0
            Lc:
                return r1
        }

        public boolean getInsetDodgeRect(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2, @androidx.annotation.NonNull android.graphics.Rect r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        @androidx.annotation.ColorInt
        public int getScrimColor(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2) {
                r0 = this;
                r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                return r1
        }

        @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d)
        public float getScrimOpacity(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        public boolean layoutDependsOn(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2, @androidx.annotation.NonNull android.view.View r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.core.view.WindowInsetsCompat onApplyWindowInsets(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2, @androidx.annotation.NonNull androidx.core.view.WindowInsetsCompat r3) {
                r0 = this;
                return r3
        }

        public void onAttachedToLayoutParams(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams r1) {
                r0 = this;
                return
        }

        public boolean onDependentViewChanged(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2, @androidx.annotation.NonNull android.view.View r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        public void onDependentViewRemoved(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2, @androidx.annotation.NonNull android.view.View r3) {
                r0 = this;
                return
        }

        public void onDetachedFromLayoutParams() {
                r0 = this;
                return
        }

        public boolean onInterceptTouchEvent(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2, @androidx.annotation.NonNull android.view.MotionEvent r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        public boolean onLayoutChild(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2, int r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        public boolean onMeasureChild(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2, int r3, int r4, int r5, int r6) {
                r0 = this;
                r1 = 0
                return r1
        }

        public boolean onNestedFling(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2, @androidx.annotation.NonNull android.view.View r3, float r4, float r5, boolean r6) {
                r0 = this;
                r1 = 0
                return r1
        }

        public boolean onNestedPreFling(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2, @androidx.annotation.NonNull android.view.View r3, float r4, float r5) {
                r0 = this;
                r1 = 0
                return r1
        }

        @java.lang.Deprecated
        public void onNestedPreScroll(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2, @androidx.annotation.NonNull android.view.View r3, int r4, int r5, @androidx.annotation.NonNull int[] r6) {
                r0 = this;
                return
        }

        public void onNestedPreScroll(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2, @androidx.annotation.NonNull android.view.View r3, int r4, int r5, @androidx.annotation.NonNull int[] r6, int r7) {
                r0 = this;
                if (r7 != 0) goto L5
                r0.onNestedPreScroll(r1, r2, r3, r4, r5, r6)
            L5:
                return
        }

        @java.lang.Deprecated
        public void onNestedScroll(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2, @androidx.annotation.NonNull android.view.View r3, int r4, int r5, int r6, int r7) {
                r0 = this;
                return
        }

        @java.lang.Deprecated
        public void onNestedScroll(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2, @androidx.annotation.NonNull android.view.View r3, int r4, int r5, int r6, int r7, int r8) {
                r0 = this;
                if (r8 != 0) goto L5
                r0.onNestedScroll(r1, r2, r3, r4, r5, r6, r7)
            L5:
                return
        }

        public void onNestedScroll(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r3, @androidx.annotation.NonNull V r4, @androidx.annotation.NonNull android.view.View r5, int r6, int r7, int r8, int r9, int r10, @androidx.annotation.NonNull int[] r11) {
                r2 = this;
                r0 = 0
                r1 = r11[r0]
                int r1 = r1 + r8
                r11[r0] = r1
                r0 = 1
                r1 = r11[r0]
                int r1 = r1 + r9
                r11[r0] = r1
                r2.onNestedScroll(r3, r4, r5, r6, r7, r8, r9, r10)
                return
        }

        @java.lang.Deprecated
        public void onNestedScrollAccepted(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2, @androidx.annotation.NonNull android.view.View r3, @androidx.annotation.NonNull android.view.View r4, int r5) {
                r0 = this;
                return
        }

        public void onNestedScrollAccepted(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2, @androidx.annotation.NonNull android.view.View r3, @androidx.annotation.NonNull android.view.View r4, int r5, int r6) {
                r0 = this;
                if (r6 != 0) goto L5
                r0.onNestedScrollAccepted(r1, r2, r3, r4, r5)
            L5:
                return
        }

        public boolean onRequestChildRectangleOnScreen(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2, @androidx.annotation.NonNull android.graphics.Rect r3, boolean r4) {
                r0 = this;
                r1 = 0
                return r1
        }

        public void onRestoreInstanceState(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2, @androidx.annotation.NonNull android.os.Parcelable r3) {
                r0 = this;
                return
        }

        @androidx.annotation.Nullable
        public android.os.Parcelable onSaveInstanceState(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2) {
                r0 = this;
                android.view.AbsSavedState r1 = android.view.View.BaseSavedState.EMPTY_STATE
                return r1
        }

        @java.lang.Deprecated
        public boolean onStartNestedScroll(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2, @androidx.annotation.NonNull android.view.View r3, @androidx.annotation.NonNull android.view.View r4, int r5) {
                r0 = this;
                r1 = 0
                return r1
        }

        public boolean onStartNestedScroll(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2, @androidx.annotation.NonNull android.view.View r3, @androidx.annotation.NonNull android.view.View r4, int r5, int r6) {
                r0 = this;
                if (r6 != 0) goto L7
                boolean r1 = r0.onStartNestedScroll(r1, r2, r3, r4, r5)
                return r1
            L7:
                r1 = 0
                return r1
        }

        @java.lang.Deprecated
        public void onStopNestedScroll(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2, @androidx.annotation.NonNull android.view.View r3) {
                r0 = this;
                return
        }

        public void onStopNestedScroll(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2, @androidx.annotation.NonNull android.view.View r3, int r4) {
                r0 = this;
                if (r4 != 0) goto L5
                r0.onStopNestedScroll(r1, r2, r3)
            L5:
                return
        }

        public boolean onTouchEvent(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2, @androidx.annotation.NonNull android.view.MotionEvent r3) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @java.lang.Deprecated
    public @interface DefaultBehavior {
        java.lang.Class<? extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior> value();
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface DispatchChangeEvent {
    }

    /* JADX INFO: loaded from: classes.dex */
    public class HierarchyChangeListener implements android.view.ViewGroup.OnHierarchyChangeListener {
        public final /* synthetic */ androidx.coordinatorlayout.widget.CoordinatorLayout this$0;

        public HierarchyChangeListener(androidx.coordinatorlayout.widget.CoordinatorLayout r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(android.view.View r2, android.view.View r3) {
                r1 = this;
                androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r1.this$0
                android.view.ViewGroup$OnHierarchyChangeListener r0 = r0.mOnHierarchyChangeListener
                if (r0 == 0) goto L9
                r0.onChildViewAdded(r2, r3)
            L9:
                return
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(android.view.View r3, android.view.View r4) {
                r2 = this;
                androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r2.this$0
                r1 = 2
                r0.onChildViewsChanged(r1)
                androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r2.this$0
                android.view.ViewGroup$OnHierarchyChangeListener r0 = r0.mOnHierarchyChangeListener
                if (r0 == 0) goto Lf
                r0.onChildViewRemoved(r3, r4)
            Lf:
                return
        }
    }

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        public int anchorGravity;
        public int dodgeInsetEdges;
        public int gravity;
        public int insetEdge;
        public int keyline;
        public android.view.View mAnchorDirectChild;
        public int mAnchorId;
        public android.view.View mAnchorView;
        public androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior mBehavior;
        public boolean mBehaviorResolved;
        public java.lang.Object mBehaviorTag;
        private boolean mDidAcceptNestedScrollNonTouch;
        private boolean mDidAcceptNestedScrollTouch;
        private boolean mDidBlockInteraction;
        private boolean mDidChangeAfterNestedScroll;
        public int mInsetOffsetX;
        public int mInsetOffsetY;
        public final android.graphics.Rect mLastChildRect;

        public LayoutParams(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.mBehaviorResolved = r1
                r0.gravity = r1
                r0.anchorGravity = r1
                r2 = -1
                r0.keyline = r2
                r0.mAnchorId = r2
                r0.insetEdge = r1
                r0.dodgeInsetEdges = r1
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                r0.mLastChildRect = r1
                return
        }

        public LayoutParams(@androidx.annotation.NonNull android.content.Context r8, @androidx.annotation.Nullable android.util.AttributeSet r9) {
                r7 = this;
                r7.<init>(r8, r9)
                r0 = 0
                r7.mBehaviorResolved = r0
                r7.gravity = r0
                r7.anchorGravity = r0
                r1 = -1
                r7.keyline = r1
                r7.mAnchorId = r1
                r7.insetEdge = r0
                r7.dodgeInsetEdges = r0
                android.graphics.Rect r2 = new android.graphics.Rect
                r2.<init>()
                r7.mLastChildRect = r2
                int[] r2 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout
                android.content.res.TypedArray r2 = r8.obtainStyledAttributes(r9, r2)
                int r3 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_android_layout_gravity
                int r3 = r2.getInteger(r3, r0)
                r7.gravity = r3
                int r3 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_layout_anchor
                int r3 = r2.getResourceId(r3, r1)
                r7.mAnchorId = r3
                int r3 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_layout_anchorGravity
                int r3 = r2.getInteger(r3, r0)
                r7.anchorGravity = r3
                int r3 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_layout_keyline
                int r1 = r2.getInteger(r3, r1)
                r7.keyline = r1
                int r1 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_layout_insetEdge
                int r1 = r2.getInt(r1, r0)
                r7.insetEdge = r1
                int r1 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_layout_dodgeInsetEdges
                int r1 = r2.getInt(r1, r0)
                r7.dodgeInsetEdges = r1
                int r1 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_layout_behavior
                boolean r3 = r2.hasValue(r1)
                r7.mBehaviorResolved = r3
                if (r3 == 0) goto Lf4
                java.lang.String r1 = r2.getString(r1)
                java.lang.String r3 = androidx.coordinatorlayout.widget.CoordinatorLayout.WIDGET_PACKAGE_NAME
                boolean r3 = android.text.TextUtils.isEmpty(r1)
                if (r3 == 0) goto L69
                r8 = 0
                goto Le4
            L69:
                java.lang.String r3 = "."
                boolean r3 = r1.startsWith(r3)
                if (r3 == 0) goto L85
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = r8.getPackageName()
                r3.append(r4)
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                goto La8
            L85:
                r3 = 46
                int r4 = r1.indexOf(r3)
                if (r4 < 0) goto L8e
                goto La8
            L8e:
                java.lang.String r4 = androidx.coordinatorlayout.widget.CoordinatorLayout.WIDGET_PACKAGE_NAME
                boolean r5 = android.text.TextUtils.isEmpty(r4)
                if (r5 != 0) goto La8
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r4)
                r5.append(r3)
                r5.append(r1)
                java.lang.String r1 = r5.toString()
            La8:
                java.lang.ThreadLocal<java.util.Map<java.lang.String, java.lang.reflect.Constructor<androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior>>> r3 = androidx.coordinatorlayout.widget.CoordinatorLayout.sConstructors     // Catch: java.lang.Exception -> Le7
                java.lang.Object r4 = r3.get()     // Catch: java.lang.Exception -> Le7
                java.util.Map r4 = (java.util.Map) r4     // Catch: java.lang.Exception -> Le7
                if (r4 != 0) goto Lba
                java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Exception -> Le7
                r4.<init>()     // Catch: java.lang.Exception -> Le7
                r3.set(r4)     // Catch: java.lang.Exception -> Le7
            Lba:
                java.lang.Object r3 = r4.get(r1)     // Catch: java.lang.Exception -> Le7
                java.lang.reflect.Constructor r3 = (java.lang.reflect.Constructor) r3     // Catch: java.lang.Exception -> Le7
                r5 = 1
                if (r3 != 0) goto Ld7
                java.lang.ClassLoader r3 = r8.getClassLoader()     // Catch: java.lang.Exception -> Le7
                java.lang.Class r3 = java.lang.Class.forName(r1, r0, r3)     // Catch: java.lang.Exception -> Le7
                java.lang.Class<?>[] r6 = androidx.coordinatorlayout.widget.CoordinatorLayout.CONSTRUCTOR_PARAMS     // Catch: java.lang.Exception -> Le7
                java.lang.reflect.Constructor r3 = r3.getConstructor(r6)     // Catch: java.lang.Exception -> Le7
                r3.setAccessible(r5)     // Catch: java.lang.Exception -> Le7
                r4.put(r1, r3)     // Catch: java.lang.Exception -> Le7
            Ld7:
                r4 = 2
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> Le7
                r4[r0] = r8     // Catch: java.lang.Exception -> Le7
                r4[r5] = r9     // Catch: java.lang.Exception -> Le7
                java.lang.Object r8 = r3.newInstance(r4)     // Catch: java.lang.Exception -> Le7
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r8 = (androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior) r8     // Catch: java.lang.Exception -> Le7
            Le4:
                r7.mBehavior = r8
                goto Lf4
            Le7:
                r8 = move-exception
                java.lang.RuntimeException r9 = new java.lang.RuntimeException
                java.lang.String r0 = "Could not inflate Behavior subclass "
                java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1)
                r9.<init>(r0, r8)
                throw r9
            Lf4:
                r2.recycle()
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r8 = r7.mBehavior
                if (r8 == 0) goto Lfe
                r8.onAttachedToLayoutParams(r7)
            Lfe:
                return
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams r2) {
                r1 = this;
                r1.<init>(r2)
                r2 = 0
                r1.mBehaviorResolved = r2
                r1.gravity = r2
                r1.anchorGravity = r2
                r0 = -1
                r1.keyline = r0
                r1.mAnchorId = r0
                r1.insetEdge = r2
                r1.dodgeInsetEdges = r2
                android.graphics.Rect r2 = new android.graphics.Rect
                r2.<init>()
                r1.mLastChildRect = r2
                return
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams r2) {
                r1 = this;
                r1.<init>(r2)
                r2 = 0
                r1.mBehaviorResolved = r2
                r1.gravity = r2
                r1.anchorGravity = r2
                r0 = -1
                r1.keyline = r0
                r1.mAnchorId = r0
                r1.insetEdge = r2
                r1.dodgeInsetEdges = r2
                android.graphics.Rect r2 = new android.graphics.Rect
                r2.<init>()
                r1.mLastChildRect = r2
                return
        }

        public LayoutParams(androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams r2) {
                r1 = this;
                r1.<init>(r2)
                r2 = 0
                r1.mBehaviorResolved = r2
                r1.gravity = r2
                r1.anchorGravity = r2
                r0 = -1
                r1.keyline = r0
                r1.mAnchorId = r0
                r1.insetEdge = r2
                r1.dodgeInsetEdges = r2
                android.graphics.Rect r2 = new android.graphics.Rect
                r2.<init>()
                r1.mLastChildRect = r2
                return
        }

        private void resolveAnchorView(android.view.View r5, androidx.coordinatorlayout.widget.CoordinatorLayout r6) {
                r4 = this;
                int r0 = r4.mAnchorId
                android.view.View r0 = r6.findViewById(r0)
                r4.mAnchorView = r0
                r1 = 0
                if (r0 == 0) goto L4c
                if (r0 != r6) goto L20
                boolean r5 = r6.isInEditMode()
                if (r5 == 0) goto L18
                r4.mAnchorDirectChild = r1
                r4.mAnchorView = r1
                return
            L18:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "View can not be anchored to the the parent CoordinatorLayout"
                r5.<init>(r6)
                throw r5
            L20:
                android.view.ViewParent r2 = r0.getParent()
            L24:
                if (r2 == r6) goto L49
                if (r2 == 0) goto L49
                if (r2 != r5) goto L3d
                boolean r5 = r6.isInEditMode()
                if (r5 == 0) goto L35
                r4.mAnchorDirectChild = r1
                r4.mAnchorView = r1
                return
            L35:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "Anchor must not be a descendant of the anchored view"
                r5.<init>(r6)
                throw r5
            L3d:
                boolean r3 = r2 instanceof android.view.View
                if (r3 == 0) goto L44
                r0 = r2
                android.view.View r0 = (android.view.View) r0
            L44:
                android.view.ViewParent r2 = r2.getParent()
                goto L24
            L49:
                r4.mAnchorDirectChild = r0
                return
            L4c:
                boolean r0 = r6.isInEditMode()
                if (r0 == 0) goto L57
                r4.mAnchorDirectChild = r1
                r4.mAnchorView = r1
                return
            L57:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Could not find CoordinatorLayout descendant view with id "
                java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
                android.content.res.Resources r6 = r6.getResources()
                int r2 = r4.mAnchorId
                java.lang.String r6 = r6.getResourceName(r2)
                r1.append(r6)
                java.lang.String r6 = " to anchor view "
                r1.append(r6)
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r0.<init>(r5)
                throw r0
        }

        private boolean shouldDodge(android.view.View r2, int r3) {
                r1 = this;
                android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r2 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r2
                int r2 = r2.insetEdge
                int r2 = androidx.core.view.GravityCompat.getAbsoluteGravity(r2, r3)
                if (r2 == 0) goto L19
                int r0 = r1.dodgeInsetEdges
                int r3 = androidx.core.view.GravityCompat.getAbsoluteGravity(r0, r3)
                r3 = r3 & r2
                if (r3 != r2) goto L19
                r2 = 1
                goto L1a
            L19:
                r2 = 0
            L1a:
                return r2
        }

        private boolean verifyAnchorView(android.view.View r5, androidx.coordinatorlayout.widget.CoordinatorLayout r6) {
                r4 = this;
                android.view.View r0 = r4.mAnchorView
                int r0 = r0.getId()
                int r1 = r4.mAnchorId
                r2 = 0
                if (r0 == r1) goto Lc
                return r2
            Lc:
                android.view.View r0 = r4.mAnchorView
                android.view.ViewParent r1 = r0.getParent()
            L12:
                if (r1 == r6) goto L2b
                if (r1 == 0) goto L25
                if (r1 != r5) goto L19
                goto L25
            L19:
                boolean r3 = r1 instanceof android.view.View
                if (r3 == 0) goto L20
                r0 = r1
                android.view.View r0 = (android.view.View) r0
            L20:
                android.view.ViewParent r1 = r1.getParent()
                goto L12
            L25:
                r5 = 0
                r4.mAnchorDirectChild = r5
                r4.mAnchorView = r5
                return r2
            L2b:
                r4.mAnchorDirectChild = r0
                r5 = 1
                return r5
        }

        public final boolean dependsOn(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4) {
                r1 = this;
                android.view.View r0 = r1.mAnchorDirectChild
                if (r4 == r0) goto L1b
                int r0 = androidx.core.view.ViewCompat.getLayoutDirection(r2)
                boolean r0 = r1.shouldDodge(r4, r0)
                if (r0 != 0) goto L1b
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r1.mBehavior
                if (r0 == 0) goto L19
                boolean r2 = r0.layoutDependsOn(r2, r3, r4)
                if (r2 == 0) goto L19
                goto L1b
            L19:
                r2 = 0
                goto L1c
            L1b:
                r2 = 1
            L1c:
                return r2
        }

        public final boolean didBlockInteraction() {
                r1 = this;
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r1.mBehavior
                if (r0 != 0) goto L7
                r0 = 0
                r1.mDidBlockInteraction = r0
            L7:
                boolean r0 = r1.mDidBlockInteraction
                return r0
        }

        public final android.view.View findAnchorView(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4) {
                r2 = this;
                int r0 = r2.mAnchorId
                r1 = -1
                if (r0 != r1) goto Lb
                r3 = 0
                r2.mAnchorDirectChild = r3
                r2.mAnchorView = r3
                return r3
            Lb:
                android.view.View r0 = r2.mAnchorView
                if (r0 == 0) goto L15
                boolean r0 = r2.verifyAnchorView(r4, r3)
                if (r0 != 0) goto L18
            L15:
                r2.resolveAnchorView(r4, r3)
            L18:
                android.view.View r3 = r2.mAnchorView
                return r3
        }

        @androidx.annotation.IdRes
        public int getAnchorId() {
                r1 = this;
                int r0 = r1.mAnchorId
                return r0
        }

        @androidx.annotation.Nullable
        public androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior getBehavior() {
                r1 = this;
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r1.mBehavior
                return r0
        }

        public final boolean getChangedAfterNestedScroll() {
                r1 = this;
                boolean r0 = r1.mDidChangeAfterNestedScroll
                return r0
        }

        public final boolean isBlockingInteractionBelow(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4) {
                r2 = this;
                boolean r0 = r2.mDidBlockInteraction
                if (r0 == 0) goto L6
                r3 = 1
                return r3
            L6:
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r1 = r2.mBehavior
                if (r1 == 0) goto Lf
                boolean r3 = r1.blocksInteractionBelow(r3, r4)
                goto L10
            Lf:
                r3 = 0
            L10:
                r3 = r3 | r0
                r2.mDidBlockInteraction = r3
                return r3
        }

        public final boolean isNestedScrollAccepted(int r2) {
                r1 = this;
                if (r2 == 0) goto La
                r0 = 1
                if (r2 == r0) goto L7
                r2 = 0
                return r2
            L7:
                boolean r2 = r1.mDidAcceptNestedScrollNonTouch
                return r2
            La:
                boolean r2 = r1.mDidAcceptNestedScrollTouch
                return r2
        }

        public final void resetChangedAfterNestedScroll() {
                r1 = this;
                r0 = 0
                r1.mDidChangeAfterNestedScroll = r0
                return
        }

        public final void resetTouchBehaviorTracking() {
                r1 = this;
                r0 = 0
                r1.mDidBlockInteraction = r0
                return
        }

        public void setAnchorId(@androidx.annotation.IdRes int r2) {
                r1 = this;
                r0 = 0
                r1.mAnchorDirectChild = r0
                r1.mAnchorView = r0
                r1.mAnchorId = r2
                return
        }

        public void setBehavior(@androidx.annotation.Nullable androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior r2) {
                r1 = this;
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r1.mBehavior
                if (r0 == r2) goto L16
                if (r0 == 0) goto L9
                r0.onDetachedFromLayoutParams()
            L9:
                r1.mBehavior = r2
                r0 = 0
                r1.mBehaviorTag = r0
                r0 = 1
                r1.mBehaviorResolved = r0
                if (r2 == 0) goto L16
                r2.onAttachedToLayoutParams(r1)
            L16:
                return
        }

        public final void setChangedAfterNestedScroll(boolean r1) {
                r0 = this;
                r0.mDidChangeAfterNestedScroll = r1
                return
        }

        public final void setNestedScrollAccepted(int r2, boolean r3) {
                r1 = this;
                if (r2 == 0) goto L9
                r0 = 1
                if (r2 == r0) goto L6
                goto Lb
            L6:
                r1.mDidAcceptNestedScrollNonTouch = r3
                goto Lb
            L9:
                r1.mDidAcceptNestedScrollTouch = r3
            Lb:
                return
        }
    }

    public class OnPreDrawListener implements android.view.ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ androidx.coordinatorlayout.widget.CoordinatorLayout this$0;

        public OnPreDrawListener(androidx.coordinatorlayout.widget.CoordinatorLayout r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
                r2 = this;
                androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r2.this$0
                r1 = 0
                r0.onChildViewsChanged(r1)
                r0 = 1
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState> CREATOR = null;
        public android.util.SparseArray<android.os.Parcelable> behaviorStates;


        static {
                androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState$1 r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState$1
                r0.<init>()
                androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState.CREATOR = r0
                return
        }

        public SavedState(android.os.Parcel r6, java.lang.ClassLoader r7) {
                r5 = this;
                r5.<init>(r6, r7)
                int r0 = r6.readInt()
                int[] r1 = new int[r0]
                r6.readIntArray(r1)
                android.os.Parcelable[] r6 = r6.readParcelableArray(r7)
                android.util.SparseArray r7 = new android.util.SparseArray
                r7.<init>(r0)
                r5.behaviorStates = r7
                r7 = 0
            L18:
                if (r7 >= r0) goto L26
                android.util.SparseArray<android.os.Parcelable> r2 = r5.behaviorStates
                r3 = r1[r7]
                r4 = r6[r7]
                r2.append(r3, r4)
                int r7 = r7 + 1
                goto L18
            L26:
                return
        }

        public SavedState(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r6, int r7) {
                r5 = this;
                super.writeToParcel(r6, r7)
                android.util.SparseArray<android.os.Parcelable> r0 = r5.behaviorStates
                r1 = 0
                if (r0 == 0) goto Ld
                int r0 = r0.size()
                goto Le
            Ld:
                r0 = 0
            Le:
                r6.writeInt(r0)
                int[] r2 = new int[r0]
                android.os.Parcelable[] r3 = new android.os.Parcelable[r0]
            L15:
                if (r1 >= r0) goto L2c
                android.util.SparseArray<android.os.Parcelable> r4 = r5.behaviorStates
                int r4 = r4.keyAt(r1)
                r2[r1] = r4
                android.util.SparseArray<android.os.Parcelable> r4 = r5.behaviorStates
                java.lang.Object r4 = r4.valueAt(r1)
                android.os.Parcelable r4 = (android.os.Parcelable) r4
                r3[r1] = r4
                int r1 = r1 + 1
                goto L15
            L2c:
                r6.writeIntArray(r2)
                r6.writeParcelableArray(r3, r7)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class ViewElevationComparator implements java.util.Comparator<android.view.View> {
        public ViewElevationComparator() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(android.view.View r2, android.view.View r3) {
                r1 = this;
                float r2 = androidx.core.view.ViewCompat.getZ(r2)
                float r3 = androidx.core.view.ViewCompat.getZ(r3)
                int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r0 <= 0) goto Le
                r2 = -1
                return r2
            Le:
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 >= 0) goto L14
                r2 = 1
                return r2
            L14:
                r2 = 0
                return r2
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(android.view.View r1, android.view.View r2) {
                r0 = this;
                android.view.View r1 = (android.view.View) r1
                android.view.View r2 = (android.view.View) r2
                int r1 = r0.compare2(r1, r2)
                return r1
        }
    }

    static {
            java.lang.Class<androidx.coordinatorlayout.widget.CoordinatorLayout> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.class
            java.lang.Package r0 = r0.getPackage()
            if (r0 == 0) goto Ld
            java.lang.String r0 = r0.getName()
            goto Le
        Ld:
            r0 = 0
        Le:
            androidx.coordinatorlayout.widget.CoordinatorLayout.WIDGET_PACKAGE_NAME = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$ViewElevationComparator r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$ViewElevationComparator
            r0.<init>()
            androidx.coordinatorlayout.widget.CoordinatorLayout.TOP_SORTED_CHILDREN_COMPARATOR = r0
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r0[r1] = r2
            androidx.coordinatorlayout.widget.CoordinatorLayout.CONSTRUCTOR_PARAMS = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.coordinatorlayout.widget.CoordinatorLayout.sConstructors = r0
            androidx.core.util.Pools$SynchronizedPool r0 = new androidx.core.util.Pools$SynchronizedPool
            r1 = 12
            r0.<init>(r1)
            androidx.coordinatorlayout.widget.CoordinatorLayout.sRectPool = r0
            return
    }

    public CoordinatorLayout(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public CoordinatorLayout(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            int r0 = androidx.coordinatorlayout.R.attr.coordinatorLayoutStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public CoordinatorLayout(@androidx.annotation.NonNull android.content.Context r10, @androidx.annotation.Nullable android.util.AttributeSet r11, @androidx.annotation.AttrRes int r12) {
            r9 = this;
            r9.<init>(r10, r11, r12)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.mDependencySortedChildren = r0
            androidx.coordinatorlayout.widget.DirectedAcyclicGraph r0 = new androidx.coordinatorlayout.widget.DirectedAcyclicGraph
            r0.<init>()
            r9.mChildDag = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.mTempList1 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.mTempDependenciesList = r0
            r0 = 2
            int[] r1 = new int[r0]
            r9.mBehaviorConsumed = r1
            int[] r0 = new int[r0]
            r9.mNestedScrollingV2ConsumedCompat = r0
            androidx.core.view.NestedScrollingParentHelper r0 = new androidx.core.view.NestedScrollingParentHelper
            r0.<init>(r9)
            r9.mNestedScrollingParentHelper = r0
            r0 = 0
            if (r12 != 0) goto L3b
            int[] r1 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout
            int r2 = androidx.coordinatorlayout.R.style.Widget_Support_CoordinatorLayout
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r11, r1, r0, r2)
            goto L41
        L3b:
            int[] r1 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r11, r1, r12, r0)
        L41:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r2 < r3) goto L61
            if (r12 != 0) goto L56
            int[] r4 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout
            r7 = 0
            int r8 = androidx.coordinatorlayout.R.style.Widget_Support_CoordinatorLayout
            r2 = r9
            r3 = r10
            r5 = r11
            r6 = r1
            r2.saveAttributeDataForStyleable(r3, r4, r5, r6, r7, r8)
            goto L61
        L56:
            int[] r4 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout
            r8 = 0
            r2 = r9
            r3 = r10
            r5 = r11
            r6 = r1
            r7 = r12
            r2.saveAttributeDataForStyleable(r3, r4, r5, r6, r7, r8)
        L61:
            int r11 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout_keylines
            int r11 = r1.getResourceId(r11, r0)
            if (r11 == 0) goto L8b
            android.content.res.Resources r10 = r10.getResources()
            int[] r11 = r10.getIntArray(r11)
            r9.mKeylines = r11
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            float r10 = r10.density
            int[] r11 = r9.mKeylines
            int r11 = r11.length
        L7c:
            if (r0 >= r11) goto L8b
            int[] r12 = r9.mKeylines
            r2 = r12[r0]
            float r2 = (float) r2
            float r2 = r2 * r10
            int r2 = (int) r2
            r12[r0] = r2
            int r0 = r0 + 1
            goto L7c
        L8b:
            int r10 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout_statusBarBackground
            android.graphics.drawable.Drawable r10 = r1.getDrawable(r10)
            r9.mStatusBarBackground = r10
            r1.recycle()
            r9.setupForInsets()
            androidx.coordinatorlayout.widget.CoordinatorLayout$HierarchyChangeListener r10 = new androidx.coordinatorlayout.widget.CoordinatorLayout$HierarchyChangeListener
            r10.<init>(r9)
            super.setOnHierarchyChangeListener(r10)
            int r10 = androidx.core.view.ViewCompat.getImportantForAccessibility(r9)
            if (r10 != 0) goto Lab
            r10 = 1
            androidx.core.view.ViewCompat.setImportantForAccessibility(r9, r10)
        Lab:
            return
    }

    @androidx.annotation.NonNull
    private static android.graphics.Rect acquireTempRect() {
            androidx.core.util.Pools$Pool<android.graphics.Rect> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.sRectPool
            java.lang.Object r0 = r0.acquire()
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            if (r0 != 0) goto Lf
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
        Lf:
            return r0
    }

    private static int clamp(int r0, int r1, int r2) {
            if (r0 >= r1) goto L3
            return r1
        L3:
            if (r0 <= r2) goto L6
            return r2
        L6:
            return r0
    }

    private void constrainChildRect(androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams r6, android.graphics.Rect r7, int r8, int r9) {
            r5 = this;
            int r0 = r5.getWidth()
            int r1 = r5.getHeight()
            int r2 = r5.getPaddingLeft()
            int r3 = r6.leftMargin
            int r2 = r2 + r3
            int r3 = r7.left
            int r4 = r5.getPaddingRight()
            int r0 = r0 - r4
            int r0 = r0 - r8
            int r4 = r6.rightMargin
            int r0 = r0 - r4
            int r0 = java.lang.Math.min(r3, r0)
            int r0 = java.lang.Math.max(r2, r0)
            int r2 = r5.getPaddingTop()
            int r3 = r6.topMargin
            int r2 = r2 + r3
            int r3 = r7.top
            int r4 = r5.getPaddingBottom()
            int r1 = r1 - r4
            int r1 = r1 - r9
            int r6 = r6.bottomMargin
            int r1 = r1 - r6
            int r6 = java.lang.Math.min(r3, r1)
            int r6 = java.lang.Math.max(r2, r6)
            int r8 = r8 + r0
            int r9 = r9 + r6
            r7.set(r0, r6, r8, r9)
            return
    }

    private androidx.core.view.WindowInsetsCompat dispatchApplyWindowInsetsToBehaviors(androidx.core.view.WindowInsetsCompat r5) {
            r4 = this;
            boolean r0 = r5.isConsumed()
            if (r0 == 0) goto L7
            return r5
        L7:
            r0 = 0
            int r1 = r4.getChildCount()
        Lc:
            if (r0 >= r1) goto L32
            android.view.View r2 = r4.getChildAt(r0)
            boolean r3 = androidx.core.view.ViewCompat.getFitsSystemWindows(r2)
            if (r3 == 0) goto L2f
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r3
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r3 = r3.getBehavior()
            if (r3 == 0) goto L2f
            androidx.core.view.WindowInsetsCompat r5 = r3.onApplyWindowInsets(r4, r2, r5)
            boolean r2 = r5.isConsumed()
            if (r2 == 0) goto L2f
            goto L32
        L2f:
            int r0 = r0 + 1
            goto Lc
        L32:
            return r5
    }

    private void getDesiredAnchoredChildRectWithoutConstraints(android.view.View r6, int r7, android.graphics.Rect r8, android.graphics.Rect r9, androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams r10, int r11, int r12) {
            r5 = this;
            int r6 = r10.gravity
            int r6 = resolveAnchoredChildGravity(r6)
            int r6 = androidx.core.view.GravityCompat.getAbsoluteGravity(r6, r7)
            int r10 = r10.anchorGravity
            int r10 = resolveGravity(r10)
            int r7 = androidx.core.view.GravityCompat.getAbsoluteGravity(r10, r7)
            r10 = r6 & 7
            r6 = r6 & 112(0x70, float:1.57E-43)
            r0 = r7 & 7
            r7 = r7 & 112(0x70, float:1.57E-43)
            r1 = 5
            r2 = 1
            if (r0 == r2) goto L28
            if (r0 == r1) goto L25
            int r0 = r8.left
            goto L31
        L25:
            int r0 = r8.right
            goto L31
        L28:
            int r0 = r8.left
            int r3 = r8.width()
            int r3 = r3 / 2
            int r0 = r0 + r3
        L31:
            r3 = 80
            r4 = 16
            if (r7 == r4) goto L3f
            if (r7 == r3) goto L3c
            int r7 = r8.top
            goto L48
        L3c:
            int r7 = r8.bottom
            goto L48
        L3f:
            int r7 = r8.top
            int r8 = r8.height()
            int r8 = r8 / 2
            int r7 = r7 + r8
        L48:
            if (r10 == r2) goto L4e
            if (r10 == r1) goto L51
            int r0 = r0 - r11
            goto L51
        L4e:
            int r8 = r11 / 2
            int r0 = r0 - r8
        L51:
            if (r6 == r4) goto L57
            if (r6 == r3) goto L5a
            int r7 = r7 - r12
            goto L5a
        L57:
            int r6 = r12 / 2
            int r7 = r7 - r6
        L5a:
            int r11 = r11 + r0
            int r12 = r12 + r7
            r9.set(r0, r7, r11, r12)
            return
    }

    private int getKeyline(int r5) {
            r4 = this;
            int[] r0 = r4.mKeylines
            r1 = 0
            java.lang.String r2 = "CoordinatorLayout"
            if (r0 != 0) goto L24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "No keylines defined for "
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = " - attempted index lookup "
            r0.append(r3)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            android.util.Log.e(r2, r5)
            return r1
        L24:
            if (r5 < 0) goto L2d
            int r3 = r0.length
            if (r5 < r3) goto L2a
            goto L2d
        L2a:
            r5 = r0[r5]
            return r5
        L2d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Keyline index "
            r0.append(r3)
            r0.append(r5)
            java.lang.String r5 = " out of range for "
            r0.append(r5)
            r0.append(r4)
            java.lang.String r5 = r0.toString()
            android.util.Log.e(r2, r5)
            return r1
    }

    private void getTopSortedChildren(java.util.List<android.view.View> r5) {
            r4 = this;
            r5.clear()
            boolean r0 = r4.isChildrenDrawingOrderEnabled()
            int r1 = r4.getChildCount()
            int r2 = r1 + (-1)
        Ld:
            if (r2 < 0) goto L21
            if (r0 == 0) goto L16
            int r3 = r4.getChildDrawingOrder(r1, r2)
            goto L17
        L16:
            r3 = r2
        L17:
            android.view.View r3 = r4.getChildAt(r3)
            r5.add(r3)
            int r2 = r2 + (-1)
            goto Ld
        L21:
            java.util.Comparator<android.view.View> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.TOP_SORTED_CHILDREN_COMPARATOR
            if (r0 == 0) goto L28
            java.util.Collections.sort(r5, r0)
        L28:
            return
    }

    private boolean hasDependencies(android.view.View r2) {
            r1 = this;
            androidx.coordinatorlayout.widget.DirectedAcyclicGraph<android.view.View> r0 = r1.mChildDag
            boolean r2 = r0.hasOutgoingEdges(r2)
            return r2
    }

    private void layoutChild(android.view.View r10, int r11) {
            r9 = this;
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
            android.graphics.Rect r7 = acquireTempRect()
            int r1 = r9.getPaddingLeft()
            int r2 = r0.leftMargin
            int r1 = r1 + r2
            int r2 = r9.getPaddingTop()
            int r3 = r0.topMargin
            int r2 = r2 + r3
            int r3 = r9.getWidth()
            int r4 = r9.getPaddingRight()
            int r3 = r3 - r4
            int r4 = r0.rightMargin
            int r3 = r3 - r4
            int r4 = r9.getHeight()
            int r5 = r9.getPaddingBottom()
            int r4 = r4 - r5
            int r5 = r0.bottomMargin
            int r4 = r4 - r5
            r7.set(r1, r2, r3, r4)
            androidx.core.view.WindowInsetsCompat r1 = r9.mLastInsets
            if (r1 == 0) goto L6f
            boolean r1 = androidx.core.view.ViewCompat.getFitsSystemWindows(r9)
            if (r1 == 0) goto L6f
            boolean r1 = androidx.core.view.ViewCompat.getFitsSystemWindows(r10)
            if (r1 != 0) goto L6f
            int r1 = r7.left
            androidx.core.view.WindowInsetsCompat r2 = r9.mLastInsets
            int r2 = r2.getSystemWindowInsetLeft()
            int r2 = r2 + r1
            r7.left = r2
            int r1 = r7.top
            androidx.core.view.WindowInsetsCompat r2 = r9.mLastInsets
            int r2 = r2.getSystemWindowInsetTop()
            int r2 = r2 + r1
            r7.top = r2
            int r1 = r7.right
            androidx.core.view.WindowInsetsCompat r2 = r9.mLastInsets
            int r2 = r2.getSystemWindowInsetRight()
            int r1 = r1 - r2
            r7.right = r1
            int r1 = r7.bottom
            androidx.core.view.WindowInsetsCompat r2 = r9.mLastInsets
            int r2 = r2.getSystemWindowInsetBottom()
            int r1 = r1 - r2
            r7.bottom = r1
        L6f:
            android.graphics.Rect r8 = acquireTempRect()
            int r0 = r0.gravity
            int r1 = resolveGravity(r0)
            int r2 = r10.getMeasuredWidth()
            int r3 = r10.getMeasuredHeight()
            r4 = r7
            r5 = r8
            r6 = r11
            androidx.core.view.GravityCompat.apply(r1, r2, r3, r4, r5, r6)
            int r11 = r8.left
            int r0 = r8.top
            int r1 = r8.right
            int r2 = r8.bottom
            r10.layout(r11, r0, r1, r2)
            releaseTempRect(r7)
            releaseTempRect(r8)
            return
    }

    private void layoutChildWithAnchor(android.view.View r13, android.view.View r14, int r15) {
            r12 = this;
            android.graphics.Rect r8 = acquireTempRect()
            android.graphics.Rect r9 = acquireTempRect()
            androidx.coordinatorlayout.widget.ViewGroupUtils.getDescendantRect(r12, r14, r8)     // Catch: java.lang.Throwable -> L39
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()     // Catch: java.lang.Throwable -> L39
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r14 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r14     // Catch: java.lang.Throwable -> L39
            int r10 = r13.getMeasuredWidth()     // Catch: java.lang.Throwable -> L39
            int r11 = r13.getMeasuredHeight()     // Catch: java.lang.Throwable -> L39
            r0 = r12
            r1 = r13
            r2 = r15
            r3 = r8
            r4 = r9
            r5 = r14
            r6 = r10
            r7 = r11
            r0.getDesiredAnchoredChildRectWithoutConstraints(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L39
            r12.constrainChildRect(r14, r9, r10, r11)     // Catch: java.lang.Throwable -> L39
            int r14 = r9.left     // Catch: java.lang.Throwable -> L39
            int r15 = r9.top     // Catch: java.lang.Throwable -> L39
            int r0 = r9.right     // Catch: java.lang.Throwable -> L39
            int r1 = r9.bottom     // Catch: java.lang.Throwable -> L39
            r13.layout(r14, r15, r0, r1)     // Catch: java.lang.Throwable -> L39
            releaseTempRect(r8)
            releaseTempRect(r9)
            return
        L39:
            r13 = move-exception
            releaseTempRect(r8)
            releaseTempRect(r9)
            throw r13
    }

    private void layoutChildWithKeyline(android.view.View r9, int r10, int r11) {
            r8 = this;
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
            int r1 = r0.gravity
            int r1 = resolveKeylineGravity(r1)
            int r1 = androidx.core.view.GravityCompat.getAbsoluteGravity(r1, r11)
            r2 = r1 & 7
            r1 = r1 & 112(0x70, float:1.57E-43)
            int r3 = r8.getWidth()
            int r4 = r8.getHeight()
            int r5 = r9.getMeasuredWidth()
            int r6 = r9.getMeasuredHeight()
            r7 = 1
            if (r11 != r7) goto L29
            int r10 = r3 - r10
        L29:
            int r10 = r8.getKeyline(r10)
            int r10 = r10 - r5
            r11 = 0
            if (r2 == r7) goto L37
            r7 = 5
            if (r2 == r7) goto L35
            goto L3a
        L35:
            int r10 = r10 + r5
            goto L3a
        L37:
            int r2 = r5 / 2
            int r10 = r10 + r2
        L3a:
            r2 = 16
            if (r1 == r2) goto L46
            r2 = 80
            if (r1 == r2) goto L43
            goto L49
        L43:
            int r11 = r6 + 0
            goto L49
        L46:
            int r1 = r6 / 2
            int r11 = r11 + r1
        L49:
            int r1 = r8.getPaddingLeft()
            int r2 = r0.leftMargin
            int r1 = r1 + r2
            int r2 = r8.getPaddingRight()
            int r3 = r3 - r2
            int r3 = r3 - r5
            int r2 = r0.rightMargin
            int r3 = r3 - r2
            int r10 = java.lang.Math.min(r10, r3)
            int r10 = java.lang.Math.max(r1, r10)
            int r1 = r8.getPaddingTop()
            int r2 = r0.topMargin
            int r1 = r1 + r2
            int r2 = r8.getPaddingBottom()
            int r4 = r4 - r2
            int r4 = r4 - r6
            int r0 = r0.bottomMargin
            int r4 = r4 - r0
            int r11 = java.lang.Math.min(r11, r4)
            int r11 = java.lang.Math.max(r1, r11)
            int r5 = r5 + r10
            int r6 = r6 + r11
            r9.layout(r10, r11, r5, r6)
            return
    }

    private void offsetChildByInset(android.view.View r9, android.graphics.Rect r10, int r11) {
            r8 = this;
            boolean r0 = androidx.core.view.ViewCompat.isLaidOut(r9)
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r9.getWidth()
            if (r0 <= 0) goto Lf9
            int r0 = r9.getHeight()
            if (r0 > 0) goto L15
            goto Lf9
        L15:
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r1 = r0.getBehavior()
            android.graphics.Rect r2 = acquireTempRect()
            android.graphics.Rect r3 = acquireTempRect()
            int r4 = r9.getLeft()
            int r5 = r9.getTop()
            int r6 = r9.getRight()
            int r7 = r9.getBottom()
            r3.set(r4, r5, r6, r7)
            if (r1 == 0) goto L6c
            boolean r1 = r1.getInsetDodgeRect(r8, r9, r2)
            if (r1 == 0) goto L6c
            boolean r1 = r3.contains(r2)
            if (r1 == 0) goto L49
            goto L6f
        L49:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Rect should be within the child's bounds. Rect:"
            java.lang.StringBuilder r10 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r10)
            java.lang.String r11 = r2.toShortString()
            r10.append(r11)
            java.lang.String r11 = " | Bounds:"
            r10.append(r11)
            java.lang.String r11 = r3.toShortString()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L6c:
            r2.set(r3)
        L6f:
            releaseTempRect(r3)
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L7c
            releaseTempRect(r2)
            return
        L7c:
            int r1 = r0.dodgeInsetEdges
            int r11 = androidx.core.view.GravityCompat.getAbsoluteGravity(r1, r11)
            r1 = r11 & 48
            r3 = 48
            r4 = 1
            r5 = 0
            if (r1 != r3) goto L9c
            int r1 = r2.top
            int r3 = r0.topMargin
            int r1 = r1 - r3
            int r3 = r0.mInsetOffsetY
            int r1 = r1 - r3
            int r3 = r10.top
            if (r1 >= r3) goto L9c
            int r3 = r3 - r1
            r8.setInsetOffsetY(r9, r3)
            r1 = 1
            goto L9d
        L9c:
            r1 = 0
        L9d:
            r3 = r11 & 80
            r6 = 80
            if (r3 != r6) goto Lb9
            int r3 = r8.getHeight()
            int r6 = r2.bottom
            int r3 = r3 - r6
            int r6 = r0.bottomMargin
            int r3 = r3 - r6
            int r6 = r0.mInsetOffsetY
            int r3 = r3 + r6
            int r6 = r10.bottom
            if (r3 >= r6) goto Lb9
            int r3 = r3 - r6
            r8.setInsetOffsetY(r9, r3)
            r1 = 1
        Lb9:
            if (r1 != 0) goto Lbe
            r8.setInsetOffsetY(r9, r5)
        Lbe:
            r1 = r11 & 3
            r3 = 3
            if (r1 != r3) goto Ld5
            int r1 = r2.left
            int r3 = r0.leftMargin
            int r1 = r1 - r3
            int r3 = r0.mInsetOffsetX
            int r1 = r1 - r3
            int r3 = r10.left
            if (r1 >= r3) goto Ld5
            int r3 = r3 - r1
            r8.setInsetOffsetX(r9, r3)
            r1 = 1
            goto Ld6
        Ld5:
            r1 = 0
        Ld6:
            r3 = 5
            r11 = r11 & r3
            if (r11 != r3) goto Lf0
            int r11 = r8.getWidth()
            int r3 = r2.right
            int r11 = r11 - r3
            int r3 = r0.rightMargin
            int r11 = r11 - r3
            int r0 = r0.mInsetOffsetX
            int r11 = r11 + r0
            int r10 = r10.right
            if (r11 >= r10) goto Lf0
            int r11 = r11 - r10
            r8.setInsetOffsetX(r9, r11)
            goto Lf1
        Lf0:
            r4 = r1
        Lf1:
            if (r4 != 0) goto Lf6
            r8.setInsetOffsetX(r9, r5)
        Lf6:
            releaseTempRect(r2)
        Lf9:
            return
    }

    private boolean performIntercept(android.view.MotionEvent r24, int r25) {
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            int r3 = r24.getActionMasked()
            java.util.List<android.view.View> r4 = r0.mTempList1
            r0.getTopSortedChildren(r4)
            int r5 = r4.size()
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
        L18:
            if (r8 >= r5) goto L81
            java.lang.Object r11 = r4.get(r8)
            android.view.View r11 = (android.view.View) r11
            android.view.ViewGroup$LayoutParams r12 = r11.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r12 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r12
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r13 = r12.getBehavior()
            r14 = 1
            if (r9 != 0) goto L2f
            if (r10 == 0) goto L54
        L2f:
            if (r3 == 0) goto L54
            if (r13 == 0) goto L7e
            if (r7 != 0) goto L47
            long r17 = android.os.SystemClock.uptimeMillis()
            r19 = 3
            r20 = 0
            r21 = 0
            r22 = 0
            r15 = r17
            android.view.MotionEvent r7 = android.view.MotionEvent.obtain(r15, r17, r19, r20, r21, r22)
        L47:
            if (r2 == 0) goto L50
            if (r2 == r14) goto L4c
            goto L7e
        L4c:
            r13.onTouchEvent(r0, r11, r7)
            goto L7e
        L50:
            r13.onInterceptTouchEvent(r0, r11, r7)
            goto L7e
        L54:
            if (r9 != 0) goto L6a
            if (r13 == 0) goto L6a
            if (r2 == 0) goto L62
            if (r2 == r14) goto L5d
            goto L66
        L5d:
            boolean r9 = r13.onTouchEvent(r0, r11, r1)
            goto L66
        L62:
            boolean r9 = r13.onInterceptTouchEvent(r0, r11, r1)
        L66:
            if (r9 == 0) goto L6a
            r0.mBehaviorTouchView = r11
        L6a:
            boolean r10 = r12.didBlockInteraction()
            boolean r11 = r12.isBlockingInteractionBelow(r0, r11)
            if (r11 == 0) goto L78
            if (r10 != 0) goto L78
            r10 = 1
            goto L79
        L78:
            r10 = 0
        L79:
            if (r11 == 0) goto L7e
            if (r10 != 0) goto L7e
            goto L81
        L7e:
            int r8 = r8 + 1
            goto L18
        L81:
            r4.clear()
            return r9
    }

    private void prepareChildren() {
            r8 = this;
            java.util.List<android.view.View> r0 = r8.mDependencySortedChildren
            r0.clear()
            androidx.coordinatorlayout.widget.DirectedAcyclicGraph<android.view.View> r0 = r8.mChildDag
            r0.clear()
            int r0 = r8.getChildCount()
            r1 = 0
            r2 = 0
        L10:
            if (r2 >= r0) goto L4a
            android.view.View r3 = r8.getChildAt(r2)
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r4 = r8.getResolvedLayoutParams(r3)
            r4.findAnchorView(r8, r3)
            androidx.coordinatorlayout.widget.DirectedAcyclicGraph<android.view.View> r5 = r8.mChildDag
            r5.addNode(r3)
            r5 = 0
        L23:
            if (r5 >= r0) goto L47
            if (r5 != r2) goto L28
            goto L44
        L28:
            android.view.View r6 = r8.getChildAt(r5)
            boolean r7 = r4.dependsOn(r8, r3, r6)
            if (r7 == 0) goto L44
            androidx.coordinatorlayout.widget.DirectedAcyclicGraph<android.view.View> r7 = r8.mChildDag
            boolean r7 = r7.contains(r6)
            if (r7 != 0) goto L3f
            androidx.coordinatorlayout.widget.DirectedAcyclicGraph<android.view.View> r7 = r8.mChildDag
            r7.addNode(r6)
        L3f:
            androidx.coordinatorlayout.widget.DirectedAcyclicGraph<android.view.View> r7 = r8.mChildDag
            r7.addEdge(r6, r3)
        L44:
            int r5 = r5 + 1
            goto L23
        L47:
            int r2 = r2 + 1
            goto L10
        L4a:
            java.util.List<android.view.View> r0 = r8.mDependencySortedChildren
            androidx.coordinatorlayout.widget.DirectedAcyclicGraph<android.view.View> r1 = r8.mChildDag
            java.util.ArrayList r1 = r1.getSortedList()
            r0.addAll(r1)
            java.util.List<android.view.View> r0 = r8.mDependencySortedChildren
            java.util.Collections.reverse(r0)
            return
    }

    private static void releaseTempRect(@androidx.annotation.NonNull android.graphics.Rect r1) {
            r1.setEmpty()
            androidx.core.util.Pools$Pool<android.graphics.Rect> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.sRectPool
            r0.release(r1)
            return
    }

    private void resetTouchBehaviors(boolean r14) {
            r13 = this;
            int r0 = r13.getChildCount()
            r1 = 0
            r2 = 0
        L6:
            if (r2 >= r0) goto L34
            android.view.View r3 = r13.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r4
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r4 = r4.getBehavior()
            if (r4 == 0) goto L31
            long r7 = android.os.SystemClock.uptimeMillis()
            r9 = 3
            r10 = 0
            r11 = 0
            r12 = 0
            r5 = r7
            android.view.MotionEvent r5 = android.view.MotionEvent.obtain(r5, r7, r9, r10, r11, r12)
            if (r14 == 0) goto L2b
            r4.onInterceptTouchEvent(r13, r3, r5)
            goto L2e
        L2b:
            r4.onTouchEvent(r13, r3, r5)
        L2e:
            r5.recycle()
        L31:
            int r2 = r2 + 1
            goto L6
        L34:
            r14 = 0
        L35:
            if (r14 >= r0) goto L47
            android.view.View r2 = r13.getChildAt(r14)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r2 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r2
            r2.resetTouchBehaviorTracking()
            int r14 = r14 + 1
            goto L35
        L47:
            r14 = 0
            r13.mBehaviorTouchView = r14
            r13.mDisallowInterceptReset = r1
            return
    }

    private static int resolveAnchoredChildGravity(int r0) {
            if (r0 != 0) goto L4
            r0 = 17
        L4:
            return r0
    }

    private static int resolveGravity(int r1) {
            r0 = r1 & 7
            if (r0 != 0) goto L8
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r1 = r1 | r0
        L8:
            r0 = r1 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto Le
            r1 = r1 | 48
        Le:
            return r1
    }

    private static int resolveKeylineGravity(int r0) {
            if (r0 != 0) goto L5
            r0 = 8388661(0x800035, float:1.1755018E-38)
        L5:
            return r0
    }

    private void setInsetOffsetX(android.view.View r3, int r4) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
            int r1 = r0.mInsetOffsetX
            if (r1 == r4) goto L11
            int r1 = r4 - r1
            androidx.core.view.ViewCompat.offsetLeftAndRight(r3, r1)
            r0.mInsetOffsetX = r4
        L11:
            return
    }

    private void setInsetOffsetY(android.view.View r3, int r4) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
            int r1 = r0.mInsetOffsetY
            if (r1 == r4) goto L11
            int r1 = r4 - r1
            androidx.core.view.ViewCompat.offsetTopAndBottom(r3, r1)
            r0.mInsetOffsetY = r4
        L11:
            return
    }

    private void setupForInsets() {
            r1 = this;
            boolean r0 = androidx.core.view.ViewCompat.getFitsSystemWindows(r1)
            if (r0 == 0) goto L1c
            androidx.core.view.OnApplyWindowInsetsListener r0 = r1.mApplyWindowInsetsListener
            if (r0 != 0) goto L11
            androidx.coordinatorlayout.widget.CoordinatorLayout$1 r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$1
            r0.<init>(r1)
            r1.mApplyWindowInsetsListener = r0
        L11:
            androidx.core.view.OnApplyWindowInsetsListener r0 = r1.mApplyWindowInsetsListener
            androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(r1, r0)
            r0 = 1280(0x500, float:1.794E-42)
            r1.setSystemUiVisibility(r0)
            goto L20
        L1c:
            r0 = 0
            androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(r1, r0)
        L20:
            return
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams
            if (r0 == 0) goto Lc
            boolean r2 = super.checkLayoutParams(r2)
            if (r2 == 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    public void dispatchDependentViewsChanged(@androidx.annotation.NonNull android.view.View r5) {
            r4 = this;
            androidx.coordinatorlayout.widget.DirectedAcyclicGraph<android.view.View> r0 = r4.mChildDag
            java.util.List r0 = r0.getIncomingEdges(r5)
            if (r0 == 0) goto L2d
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L2d
            r1 = 0
        Lf:
            int r2 = r0.size()
            if (r1 >= r2) goto L2d
            java.lang.Object r2 = r0.get(r1)
            android.view.View r2 = (android.view.View) r2
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r3
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r3 = r3.getBehavior()
            if (r3 == 0) goto L2a
            r3.onDependentViewChanged(r4, r2, r5)
        L2a:
            int r1 = r1 + 1
            goto Lf
        L2d:
            return
    }

    public boolean doViewsOverlap(@androidx.annotation.NonNull android.view.View r5, @androidx.annotation.NonNull android.view.View r6) {
            r4 = this;
            int r0 = r5.getVisibility()
            r1 = 0
            if (r0 != 0) goto L56
            int r0 = r6.getVisibility()
            if (r0 != 0) goto L56
            android.graphics.Rect r0 = acquireTempRect()
            android.view.ViewParent r2 = r5.getParent()
            r3 = 1
            if (r2 == r4) goto L1a
            r2 = 1
            goto L1b
        L1a:
            r2 = 0
        L1b:
            r4.getChildRect(r5, r2, r0)
            android.graphics.Rect r5 = acquireTempRect()
            android.view.ViewParent r2 = r6.getParent()
            if (r2 == r4) goto L2a
            r2 = 1
            goto L2b
        L2a:
            r2 = 0
        L2b:
            r4.getChildRect(r6, r2, r5)
            int r6 = r0.left     // Catch: java.lang.Throwable -> L4e
            int r2 = r5.right     // Catch: java.lang.Throwable -> L4e
            if (r6 > r2) goto L47
            int r6 = r0.top     // Catch: java.lang.Throwable -> L4e
            int r2 = r5.bottom     // Catch: java.lang.Throwable -> L4e
            if (r6 > r2) goto L47
            int r6 = r0.right     // Catch: java.lang.Throwable -> L4e
            int r2 = r5.left     // Catch: java.lang.Throwable -> L4e
            if (r6 < r2) goto L47
            int r6 = r0.bottom     // Catch: java.lang.Throwable -> L4e
            int r2 = r5.top     // Catch: java.lang.Throwable -> L4e
            if (r6 < r2) goto L47
            r1 = 1
        L47:
            releaseTempRect(r0)
            releaseTempRect(r5)
            return r1
        L4e:
            r6 = move-exception
            releaseTempRect(r0)
            releaseTempRect(r5)
            throw r6
        L56:
            return r1
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(android.graphics.Canvas r9, android.view.View r10, long r11) {
            r8 = this;
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r1 = r0.mBehavior
            if (r1 == 0) goto L88
            float r1 = r1.getScrimOpacity(r8, r10)
            r2 = 0
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 <= 0) goto L88
            android.graphics.Paint r2 = r8.mScrimPaint
            if (r2 != 0) goto L1e
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r8.mScrimPaint = r2
        L1e:
            android.graphics.Paint r2 = r8.mScrimPaint
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r0.mBehavior
            int r0 = r0.getScrimColor(r8, r10)
            r2.setColor(r0)
            android.graphics.Paint r0 = r8.mScrimPaint
            r2 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r2
            int r1 = java.lang.Math.round(r1)
            r2 = 0
            r3 = 255(0xff, float:3.57E-43)
            int r1 = clamp(r1, r2, r3)
            r0.setAlpha(r1)
            int r0 = r9.save()
            boolean r1 = r10.isOpaque()
            if (r1 == 0) goto L61
            int r1 = r10.getLeft()
            float r3 = (float) r1
            int r1 = r10.getTop()
            float r4 = (float) r1
            int r1 = r10.getRight()
            float r5 = (float) r1
            int r1 = r10.getBottom()
            float r6 = (float) r1
            android.graphics.Region$Op r7 = android.graphics.Region.Op.DIFFERENCE
            r2 = r9
            r2.clipRect(r3, r4, r5, r6, r7)
        L61:
            int r1 = r8.getPaddingLeft()
            float r3 = (float) r1
            int r1 = r8.getPaddingTop()
            float r4 = (float) r1
            int r1 = r8.getWidth()
            int r2 = r8.getPaddingRight()
            int r1 = r1 - r2
            float r5 = (float) r1
            int r1 = r8.getHeight()
            int r2 = r8.getPaddingBottom()
            int r1 = r1 - r2
            float r6 = (float) r1
            android.graphics.Paint r7 = r8.mScrimPaint
            r2 = r9
            r2.drawRect(r3, r4, r5, r6, r7)
            r9.restoreToCount(r0)
        L88:
            boolean r9 = super.drawChild(r9, r10, r11)
            return r9
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
            r4 = this;
            super.drawableStateChanged()
            int[] r0 = r4.getDrawableState()
            android.graphics.drawable.Drawable r1 = r4.mStatusBarBackground
            r2 = 0
            if (r1 == 0) goto L17
            boolean r3 = r1.isStateful()
            if (r3 == 0) goto L17
            boolean r0 = r1.setState(r0)
            r2 = r2 | r0
        L17:
            if (r2 == 0) goto L1c
            r4.invalidate()
        L1c:
            return
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r2 = this;
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            return r0
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams
            if (r0 == 0) goto Lc
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r2 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r2
            r0.<init>(r2)
            goto L1d
        Lc:
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L18
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r0.<init>(r2)
            goto L1d
        L18:
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams
            r0.<init>(r2)
        L1d:
            return r0
    }

    @Override // android.view.ViewGroup
    public androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    public final void getChildRect(android.view.View r3, boolean r4, android.graphics.Rect r5) {
            r2 = this;
            boolean r0 = r3.isLayoutRequested()
            if (r0 != 0) goto L29
            int r0 = r3.getVisibility()
            r1 = 8
            if (r0 != r1) goto Lf
            goto L29
        Lf:
            if (r4 == 0) goto L15
            androidx.coordinatorlayout.widget.ViewGroupUtils.getDescendantRect(r2, r3, r5)
            goto L28
        L15:
            int r4 = r3.getLeft()
            int r0 = r3.getTop()
            int r1 = r3.getRight()
            int r3 = r3.getBottom()
            r5.set(r4, r0, r1, r3)
        L28:
            return
        L29:
            r5.setEmpty()
            return
    }

    @androidx.annotation.NonNull
    public java.util.List<android.view.View> getDependencies(@androidx.annotation.NonNull android.view.View r2) {
            r1 = this;
            androidx.coordinatorlayout.widget.DirectedAcyclicGraph<android.view.View> r0 = r1.mChildDag
            java.util.List r2 = r0.getOutgoingEdges(r2)
            java.util.List<android.view.View> r0 = r1.mTempDependenciesList
            r0.clear()
            if (r2 == 0) goto L12
            java.util.List<android.view.View> r0 = r1.mTempDependenciesList
            r0.addAll(r2)
        L12:
            java.util.List<android.view.View> r2 = r1.mTempDependenciesList
            return r2
    }

    @androidx.annotation.VisibleForTesting
    public final java.util.List<android.view.View> getDependencySortedChildren() {
            r1 = this;
            r1.prepareChildren()
            java.util.List<android.view.View> r0 = r1.mDependencySortedChildren
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.List<android.view.View> getDependents(@androidx.annotation.NonNull android.view.View r2) {
            r1 = this;
            androidx.coordinatorlayout.widget.DirectedAcyclicGraph<android.view.View> r0 = r1.mChildDag
            java.util.List r2 = r0.getIncomingEdges(r2)
            java.util.List<android.view.View> r0 = r1.mTempDependenciesList
            r0.clear()
            if (r2 == 0) goto L12
            java.util.List<android.view.View> r0 = r1.mTempDependenciesList
            r0.addAll(r2)
        L12:
            java.util.List<android.view.View> r2 = r1.mTempDependenciesList
            return r2
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final androidx.core.view.WindowInsetsCompat getLastWindowInsets() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat r0 = r1.mLastInsets
            return r0
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
            r1 = this;
            androidx.core.view.NestedScrollingParentHelper r0 = r1.mNestedScrollingParentHelper
            int r0 = r0.getNestedScrollAxes()
            return r0
    }

    public final androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams getResolvedLayoutParams(android.view.View r7) {
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
            boolean r1 = r0.mBehaviorResolved
            if (r1 != 0) goto L73
            boolean r1 = r7 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
            java.lang.String r2 = "CoordinatorLayout"
            r3 = 1
            if (r1 == 0) goto L24
            androidx.coordinatorlayout.widget.CoordinatorLayout$AttachedBehavior r7 = (androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior) r7
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r7 = r7.getBehavior()
            if (r7 != 0) goto L1e
            java.lang.String r1 = "Attached behavior class is null"
            android.util.Log.e(r2, r1)
        L1e:
            r0.setBehavior(r7)
            r0.mBehaviorResolved = r3
            goto L73
        L24:
            java.lang.Class r7 = r7.getClass()
            r1 = 0
        L29:
            if (r7 == 0) goto L3a
            java.lang.Class<androidx.coordinatorlayout.widget.CoordinatorLayout$DefaultBehavior> r1 = androidx.coordinatorlayout.widget.CoordinatorLayout.DefaultBehavior.class
            java.lang.annotation.Annotation r1 = r7.getAnnotation(r1)
            androidx.coordinatorlayout.widget.CoordinatorLayout$DefaultBehavior r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.DefaultBehavior) r1
            if (r1 != 0) goto L3a
            java.lang.Class r7 = r7.getSuperclass()
            goto L29
        L3a:
            if (r1 == 0) goto L71
            java.lang.Class r7 = r1.value()     // Catch: java.lang.Exception -> L53
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L53
            java.lang.reflect.Constructor r7 = r7.getDeclaredConstructor(r5)     // Catch: java.lang.Exception -> L53
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L53
            java.lang.Object r7 = r7.newInstance(r4)     // Catch: java.lang.Exception -> L53
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r7 = (androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior) r7     // Catch: java.lang.Exception -> L53
            r0.setBehavior(r7)     // Catch: java.lang.Exception -> L53
            goto L71
        L53:
            r7 = move-exception
            java.lang.String r4 = "Default behavior class "
            java.lang.StringBuilder r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4)
            java.lang.Class r1 = r1.value()
            java.lang.String r1 = r1.getName()
            r4.append(r1)
            java.lang.String r1 = " could not be instantiated. Did you forget a default constructor?"
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            android.util.Log.e(r2, r1, r7)
        L71:
            r0.mBehaviorResolved = r3
        L73:
            return r0
    }

    @androidx.annotation.Nullable
    public android.graphics.drawable.Drawable getStatusBarBackground() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mStatusBarBackground
            return r0
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
            r3 = this;
            int r0 = super.getSuggestedMinimumHeight()
            int r1 = r3.getPaddingTop()
            int r2 = r3.getPaddingBottom()
            int r2 = r2 + r1
            int r0 = java.lang.Math.max(r0, r2)
            return r0
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
            r3 = this;
            int r0 = super.getSuggestedMinimumWidth()
            int r1 = r3.getPaddingLeft()
            int r2 = r3.getPaddingRight()
            int r2 = r2 + r1
            int r0 = java.lang.Math.max(r0, r2)
            return r0
    }

    public boolean isPointInChildBounds(@androidx.annotation.NonNull android.view.View r2, int r3, int r4) {
            r1 = this;
            android.graphics.Rect r0 = acquireTempRect()
            androidx.coordinatorlayout.widget.ViewGroupUtils.getDescendantRect(r1, r2, r0)
            boolean r2 = r0.contains(r3, r4)     // Catch: java.lang.Throwable -> Lf
            releaseTempRect(r0)
            return r2
        Lf:
            r2 = move-exception
            releaseTempRect(r0)
            throw r2
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            r0 = 0
            r2.resetTouchBehaviors(r0)
            boolean r0 = r2.mNeedsPreDrawListener
            if (r0 == 0) goto L1f
            androidx.coordinatorlayout.widget.CoordinatorLayout$OnPreDrawListener r0 = r2.mOnPreDrawListener
            if (r0 != 0) goto L16
            androidx.coordinatorlayout.widget.CoordinatorLayout$OnPreDrawListener r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$OnPreDrawListener
            r0.<init>(r2)
            r2.mOnPreDrawListener = r0
        L16:
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$OnPreDrawListener r1 = r2.mOnPreDrawListener
            r0.addOnPreDrawListener(r1)
        L1f:
            androidx.core.view.WindowInsetsCompat r0 = r2.mLastInsets
            if (r0 != 0) goto L2c
            boolean r0 = androidx.core.view.ViewCompat.getFitsSystemWindows(r2)
            if (r0 == 0) goto L2c
            androidx.core.view.ViewCompat.requestApplyInsets(r2)
        L2c:
            r0 = 1
            r2.mIsAttachedToWindow = r0
            return
    }

    public final void onChildViewsChanged(int r26) {
            r25 = this;
            r8 = r25
            r9 = r26
            int r10 = androidx.core.view.ViewCompat.getLayoutDirection(r25)
            java.util.List<android.view.View> r0 = r8.mDependencySortedChildren
            int r11 = r0.size()
            android.graphics.Rect r12 = acquireTempRect()
            android.graphics.Rect r13 = acquireTempRect()
            android.graphics.Rect r14 = acquireTempRect()
            r7 = 0
        L1b:
            if (r7 >= r11) goto L1f1
            java.util.List<android.view.View> r0 = r8.mDependencySortedChildren
            java.lang.Object r0 = r0.get(r7)
            r6 = r0
            android.view.View r6 = (android.view.View) r6
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            r5 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r5 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r5
            if (r9 != 0) goto L41
            int r0 = r6.getVisibility()
            r1 = 8
            if (r0 != r1) goto L41
            r24 = r7
            r1 = r9
            r3 = r11
            r2 = r12
            r4 = r14
            r17 = 0
            goto L1e9
        L41:
            r4 = 0
        L42:
            if (r4 >= r7) goto Lfd
            java.util.List<android.view.View> r0 = r8.mDependencySortedChildren
            java.lang.Object r0 = r0.get(r4)
            android.view.View r0 = (android.view.View) r0
            android.view.View r1 = r5.mAnchorDirectChild
            if (r1 != r0) goto Ldd
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            r2 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r2 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r2
            android.view.View r0 = r2.mAnchorView
            if (r0 == 0) goto Ldd
            android.graphics.Rect r1 = acquireTempRect()
            android.graphics.Rect r0 = acquireTempRect()
            android.graphics.Rect r15 = acquireTempRect()
            android.view.View r3 = r2.mAnchorView
            androidx.coordinatorlayout.widget.ViewGroupUtils.getDescendantRect(r8, r3, r1)
            r3 = 0
            r8.getChildRect(r6, r3, r0)
            r16 = r11
            int r11 = r6.getMeasuredWidth()
            r18 = r14
            int r14 = r6.getMeasuredHeight()
            r9 = r0
            r0 = r25
            r19 = r1
            r1 = r6
            r20 = r2
            r2 = r10
            r21 = r12
            r12 = 1
            r17 = 0
            r3 = r19
            r22 = r4
            r4 = r15
            r23 = r5
            r5 = r20
            r12 = r6
            r6 = r11
            r24 = r7
            r7 = r14
            r0.getDesiredAnchoredChildRectWithoutConstraints(r1, r2, r3, r4, r5, r6, r7)
            int r0 = r15.left
            int r1 = r9.left
            if (r0 != r1) goto Lac
            int r0 = r15.top
            int r1 = r9.top
            if (r0 == r1) goto La8
            goto Lac
        La8:
            r0 = r20
            r3 = 0
            goto Laf
        Lac:
            r0 = r20
            r3 = 1
        Laf:
            r8.constrainChildRect(r0, r15, r11, r14)
            int r1 = r15.left
            int r2 = r9.left
            int r1 = r1 - r2
            int r2 = r15.top
            int r4 = r9.top
            int r2 = r2 - r4
            if (r1 == 0) goto Lc1
            androidx.core.view.ViewCompat.offsetLeftAndRight(r12, r1)
        Lc1:
            if (r2 == 0) goto Lc6
            androidx.core.view.ViewCompat.offsetTopAndBottom(r12, r2)
        Lc6:
            if (r3 == 0) goto Ld3
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r1 = r0.getBehavior()
            if (r1 == 0) goto Ld3
            android.view.View r0 = r0.mAnchorView
            r1.onDependentViewChanged(r8, r12, r0)
        Ld3:
            releaseTempRect(r19)
            releaseTempRect(r9)
            releaseTempRect(r15)
            goto Lec
        Ldd:
            r22 = r4
            r23 = r5
            r24 = r7
            r16 = r11
            r21 = r12
            r18 = r14
            r17 = 0
            r12 = r6
        Lec:
            int r4 = r22 + 1
            r9 = r26
            r6 = r12
            r11 = r16
            r14 = r18
            r12 = r21
            r5 = r23
            r7 = r24
            goto L42
        Lfd:
            r23 = r5
            r24 = r7
            r16 = r11
            r21 = r12
            r18 = r14
            r0 = 1
            r17 = 0
            r12 = r6
            r8.getChildRect(r12, r0, r13)
            r0 = r23
            int r1 = r0.insetEdge
            if (r1 == 0) goto L16f
            boolean r1 = r13.isEmpty()
            if (r1 != 0) goto L16f
            int r1 = r0.insetEdge
            int r1 = androidx.core.view.GravityCompat.getAbsoluteGravity(r1, r10)
            r2 = r1 & 112(0x70, float:1.57E-43)
            r3 = 48
            if (r2 == r3) goto L13f
            r3 = 80
            if (r2 == r3) goto L12d
            r2 = r21
            goto L14b
        L12d:
            r2 = r21
            int r3 = r2.bottom
            int r4 = r25.getHeight()
            int r5 = r13.top
            int r4 = r4 - r5
            int r3 = java.lang.Math.max(r3, r4)
            r2.bottom = r3
            goto L14b
        L13f:
            r2 = r21
            int r3 = r2.top
            int r4 = r13.bottom
            int r3 = java.lang.Math.max(r3, r4)
            r2.top = r3
        L14b:
            r1 = r1 & 7
            r3 = 3
            if (r1 == r3) goto L164
            r3 = 5
            if (r1 == r3) goto L154
            goto L171
        L154:
            int r1 = r2.right
            int r3 = r25.getWidth()
            int r4 = r13.left
            int r3 = r3 - r4
            int r1 = java.lang.Math.max(r1, r3)
            r2.right = r1
            goto L171
        L164:
            int r1 = r2.left
            int r3 = r13.right
            int r1 = java.lang.Math.max(r1, r3)
            r2.left = r1
            goto L171
        L16f:
            r2 = r21
        L171:
            int r0 = r0.dodgeInsetEdges
            if (r0 == 0) goto L17e
            int r0 = r12.getVisibility()
            if (r0 != 0) goto L17e
            r8.offsetChildByInset(r12, r2, r10)
        L17e:
            r0 = 2
            r1 = r26
            if (r1 == r0) goto L1a5
            android.view.ViewGroup$LayoutParams r3 = r12.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r3
            android.graphics.Rect r3 = r3.mLastChildRect
            r4 = r18
            r4.set(r3)
            boolean r3 = r4.equals(r13)
            if (r3 == 0) goto L199
            r3 = r16
            goto L1e9
        L199:
            android.view.ViewGroup$LayoutParams r3 = r12.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r3
            android.graphics.Rect r3 = r3.mLastChildRect
            r3.set(r13)
            goto L1a7
        L1a5:
            r4 = r18
        L1a7:
            int r7 = r24 + 1
            r3 = r16
        L1ab:
            if (r7 >= r3) goto L1e9
            java.util.List<android.view.View> r5 = r8.mDependencySortedChildren
            java.lang.Object r5 = r5.get(r7)
            android.view.View r5 = (android.view.View) r5
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r9 = r6.getBehavior()
            if (r9 == 0) goto L1e5
            boolean r11 = r9.layoutDependsOn(r8, r5, r12)
            if (r11 == 0) goto L1e5
            if (r1 != 0) goto L1d3
            boolean r11 = r6.getChangedAfterNestedScroll()
            if (r11 == 0) goto L1d3
            r6.resetChangedAfterNestedScroll()
            goto L1e5
        L1d3:
            if (r1 == r0) goto L1da
            boolean r5 = r9.onDependentViewChanged(r8, r5, r12)
            goto L1de
        L1da:
            r9.onDependentViewRemoved(r8, r5, r12)
            r5 = 1
        L1de:
            r9 = 1
            if (r1 != r9) goto L1e6
            r6.setChangedAfterNestedScroll(r5)
            goto L1e6
        L1e5:
            r9 = 1
        L1e6:
            int r7 = r7 + 1
            goto L1ab
        L1e9:
            int r7 = r24 + 1
            r9 = r1
            r12 = r2
            r11 = r3
            r14 = r4
            goto L1b
        L1f1:
            r2 = r12
            r4 = r14
            releaseTempRect(r2)
            releaseTempRect(r13)
            releaseTempRect(r4)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r3 = this;
            super.onDetachedFromWindow()
            r0 = 0
            r3.resetTouchBehaviors(r0)
            boolean r1 = r3.mNeedsPreDrawListener
            if (r1 == 0) goto L18
            androidx.coordinatorlayout.widget.CoordinatorLayout$OnPreDrawListener r1 = r3.mOnPreDrawListener
            if (r1 == 0) goto L18
            android.view.ViewTreeObserver r1 = r3.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$OnPreDrawListener r2 = r3.mOnPreDrawListener
            r1.removeOnPreDrawListener(r2)
        L18:
            android.view.View r1 = r3.mNestedScrollingTarget
            if (r1 == 0) goto L1f
            r3.onStopNestedScroll(r1)
        L1f:
            r3.mIsAttachedToWindow = r0
            return
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas r5) {
            r4 = this;
            super.onDraw(r5)
            boolean r0 = r4.mDrawStatusBarBackground
            if (r0 == 0) goto L26
            android.graphics.drawable.Drawable r0 = r4.mStatusBarBackground
            if (r0 == 0) goto L26
            androidx.core.view.WindowInsetsCompat r0 = r4.mLastInsets
            r1 = 0
            if (r0 == 0) goto L15
            int r0 = r0.getSystemWindowInsetTop()
            goto L16
        L15:
            r0 = 0
        L16:
            if (r0 <= 0) goto L26
            android.graphics.drawable.Drawable r2 = r4.mStatusBarBackground
            int r3 = r4.getWidth()
            r2.setBounds(r1, r1, r3, r0)
            android.graphics.drawable.Drawable r0 = r4.mStatusBarBackground
            r0.draw(r5)
        L26:
            return
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getActionMasked()
            r1 = 1
            if (r0 != 0) goto La
            r3.resetTouchBehaviors(r1)
        La:
            r2 = 0
            boolean r4 = r3.performIntercept(r4, r2)
            if (r0 == r1) goto L14
            r2 = 3
            if (r0 != r2) goto L17
        L14:
            r3.resetTouchBehaviors(r1)
        L17:
            return r4
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            int r2 = androidx.core.view.ViewCompat.getLayoutDirection(r1)
            java.util.List<android.view.View> r3 = r1.mDependencySortedChildren
            int r3 = r3.size()
            r4 = 0
        Lb:
            if (r4 >= r3) goto L36
            java.util.List<android.view.View> r5 = r1.mDependencySortedChildren
            java.lang.Object r5 = r5.get(r4)
            android.view.View r5 = (android.view.View) r5
            int r6 = r5.getVisibility()
            r0 = 8
            if (r6 != r0) goto L1e
            goto L33
        L1e:
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r6 = r6.getBehavior()
            if (r6 == 0) goto L30
            boolean r6 = r6.onLayoutChild(r1, r5, r2)
            if (r6 != 0) goto L33
        L30:
            r1.onLayoutChild(r5, r2)
        L33:
            int r4 = r4 + 1
            goto Lb
        L36:
            return
    }

    public void onLayoutChild(@androidx.annotation.NonNull android.view.View r5, int r6) {
            r4 = this;
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
            android.view.View r1 = r0.mAnchorView
            if (r1 != 0) goto L11
            int r2 = r0.mAnchorId
            r3 = -1
            if (r2 == r3) goto L11
            r2 = 1
            goto L12
        L11:
            r2 = 0
        L12:
            if (r2 != 0) goto L26
            if (r1 == 0) goto L1a
            r4.layoutChildWithAnchor(r5, r1, r6)
            goto L25
        L1a:
            int r0 = r0.keyline
            if (r0 < 0) goto L22
            r4.layoutChildWithKeyline(r5, r0, r6)
            goto L25
        L22:
            r4.layoutChild(r5, r6)
        L25:
            return
        L26:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete."
            r5.<init>(r6)
            throw r5
    }

    @Override // android.view.View
    public final void onMeasure(int r31, int r32) {
            r30 = this;
            r7 = r30
            r30.prepareChildren()
            int r0 = r30.getChildCount()
            r8 = 0
            r1 = 0
        Lb:
            r2 = 1
            if (r1 >= r0) goto L1d
            android.view.View r3 = r7.getChildAt(r1)
            boolean r3 = r7.hasDependencies(r3)
            if (r3 == 0) goto L1a
            r0 = 1
            goto L1e
        L1a:
            int r1 = r1 + 1
            goto Lb
        L1d:
            r0 = 0
        L1e:
            boolean r1 = r7.mNeedsPreDrawListener
            if (r0 == r1) goto L52
            if (r0 == 0) goto L3f
            boolean r0 = r7.mIsAttachedToWindow
            if (r0 == 0) goto L3c
            androidx.coordinatorlayout.widget.CoordinatorLayout$OnPreDrawListener r0 = r7.mOnPreDrawListener
            if (r0 != 0) goto L33
            androidx.coordinatorlayout.widget.CoordinatorLayout$OnPreDrawListener r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$OnPreDrawListener
            r0.<init>(r7)
            r7.mOnPreDrawListener = r0
        L33:
            android.view.ViewTreeObserver r0 = r30.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$OnPreDrawListener r1 = r7.mOnPreDrawListener
            r0.addOnPreDrawListener(r1)
        L3c:
            r7.mNeedsPreDrawListener = r2
            goto L52
        L3f:
            boolean r0 = r7.mIsAttachedToWindow
            if (r0 == 0) goto L50
            androidx.coordinatorlayout.widget.CoordinatorLayout$OnPreDrawListener r0 = r7.mOnPreDrawListener
            if (r0 == 0) goto L50
            android.view.ViewTreeObserver r0 = r30.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$OnPreDrawListener r1 = r7.mOnPreDrawListener
            r0.removeOnPreDrawListener(r1)
        L50:
            r7.mNeedsPreDrawListener = r8
        L52:
            int r9 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r10 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            int r11 = androidx.core.view.ViewCompat.getLayoutDirection(r30)
            if (r11 != r2) goto L6a
            r12 = 1
            goto L6b
        L6a:
            r12 = 0
        L6b:
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r17 = r9 + r10
            int r18 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            androidx.core.view.WindowInsetsCompat r3 = r7.mLastInsets
            if (r3 == 0) goto L94
            boolean r3 = androidx.core.view.ViewCompat.getFitsSystemWindows(r30)
            if (r3 == 0) goto L94
            r19 = 1
            goto L96
        L94:
            r19 = 0
        L96:
            java.util.List<android.view.View> r2 = r7.mDependencySortedChildren
            int r6 = r2.size()
            r5 = r0
            r4 = r1
            r2 = 0
            r3 = 0
        La0:
            if (r3 >= r6) goto L1ba
            java.util.List<android.view.View> r0 = r7.mDependencySortedChildren
            java.lang.Object r0 = r0.get(r3)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r1 = 8
            if (r0 != r1) goto Lbc
            r22 = r3
            r29 = r6
            r28 = r9
            goto L1b1
        Lbc:
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r1 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r1
            int r0 = r1.keyline
            if (r0 < 0) goto L105
            if (r13 == 0) goto L105
            int r0 = r7.getKeyline(r0)
            int r8 = r1.gravity
            int r8 = resolveKeylineGravity(r8)
            int r8 = androidx.core.view.GravityCompat.getAbsoluteGravity(r8, r11)
            r8 = r8 & 7
            r22 = r2
            r2 = 3
            if (r8 != r2) goto Le0
            if (r12 == 0) goto Le5
        Le0:
            r2 = 5
            if (r8 != r2) goto Lf1
            if (r12 == 0) goto Lf1
        Le5:
            int r2 = r14 - r10
            int r2 = r2 - r0
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r21 = r2
            r8 = 0
            goto L109
        Lf1:
            if (r8 != r2) goto Lf5
            if (r12 == 0) goto Lfa
        Lf5:
            r2 = 3
            if (r8 != r2) goto L103
            if (r12 == 0) goto L103
        Lfa:
            int r0 = r0 - r9
            r8 = 0
            int r0 = java.lang.Math.max(r8, r0)
            r21 = r0
            goto L109
        L103:
            r8 = 0
            goto L107
        L105:
            r22 = r2
        L107:
            r21 = 0
        L109:
            if (r19 == 0) goto L13b
            boolean r0 = androidx.core.view.ViewCompat.getFitsSystemWindows(r20)
            if (r0 != 0) goto L13b
            androidx.core.view.WindowInsetsCompat r0 = r7.mLastInsets
            int r0 = r0.getSystemWindowInsetLeft()
            androidx.core.view.WindowInsetsCompat r2 = r7.mLastInsets
            int r2 = r2.getSystemWindowInsetRight()
            int r2 = r2 + r0
            androidx.core.view.WindowInsetsCompat r0 = r7.mLastInsets
            int r0 = r0.getSystemWindowInsetTop()
            androidx.core.view.WindowInsetsCompat r8 = r7.mLastInsets
            int r8 = r8.getSystemWindowInsetBottom()
            int r8 = r8 + r0
            int r0 = r14 - r2
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r2 = r16 - r8
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r8 = r0
            r23 = r2
            goto L13f
        L13b:
            r8 = r31
            r23 = r32
        L13f:
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r1.getBehavior()
            if (r0 == 0) goto L167
            r24 = 0
            r2 = r1
            r1 = r30
            r26 = r2
            r25 = r22
            r2 = r20
            r22 = r3
            r3 = r8
            r27 = r4
            r4 = r21
            r28 = r9
            r9 = r5
            r5 = r23
            r29 = r6
            r6 = r24
            boolean r0 = r0.onMeasureChild(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L181
            goto L174
        L167:
            r26 = r1
            r27 = r4
            r29 = r6
            r28 = r9
            r25 = r22
            r22 = r3
            r9 = r5
        L174:
            r5 = 0
            r0 = r30
            r1 = r20
            r2 = r8
            r3 = r21
            r4 = r23
            r0.onMeasureChild(r1, r2, r3, r4, r5)
        L181:
            int r0 = r20.getMeasuredWidth()
            int r0 = r0 + r17
            r1 = r26
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r1.rightMargin
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r9, r0)
            int r2 = r20.getMeasuredHeight()
            int r2 = r2 + r18
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            r1 = r27
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r20.getMeasuredState()
            r8 = r25
            int r2 = android.view.View.combineMeasuredStates(r8, r2)
            r5 = r0
            r4 = r1
        L1b1:
            int r3 = r22 + 1
            r9 = r28
            r6 = r29
            r8 = 0
            goto La0
        L1ba:
            r8 = r2
            r1 = r4
            r9 = r5
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r8
            r2 = r31
            int r0 = android.view.View.resolveSizeAndState(r9, r2, r0)
            int r2 = r8 << 16
            r3 = r32
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r7.setMeasuredDimension(r0, r1)
            return
    }

    public void onMeasureChild(android.view.View r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(android.view.View r12, float r13, float r14, boolean r15) {
            r11 = this;
            int r0 = r11.getChildCount()
            r1 = 0
            r2 = 0
            r3 = 0
        L7:
            if (r2 >= r0) goto L36
            android.view.View r6 = r11.getChildAt(r2)
            int r4 = r6.getVisibility()
            r5 = 8
            if (r4 != r5) goto L16
            goto L33
        L16:
            android.view.ViewGroup$LayoutParams r4 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r4
            boolean r5 = r4.isNestedScrollAccepted(r1)
            if (r5 != 0) goto L23
            goto L33
        L23:
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r4 = r4.getBehavior()
            if (r4 == 0) goto L33
            r5 = r11
            r7 = r12
            r8 = r13
            r9 = r14
            r10 = r15
            boolean r4 = r4.onNestedFling(r5, r6, r7, r8, r9, r10)
            r3 = r3 | r4
        L33:
            int r2 = r2 + 1
            goto L7
        L36:
            if (r3 == 0) goto L3c
            r12 = 1
            r11.onChildViewsChanged(r12)
        L3c:
            return r3
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(android.view.View r11, float r12, float r13) {
            r10 = this;
            int r0 = r10.getChildCount()
            r1 = 0
            r2 = 0
            r3 = 0
        L7:
            if (r2 >= r0) goto L35
            android.view.View r6 = r10.getChildAt(r2)
            int r4 = r6.getVisibility()
            r5 = 8
            if (r4 != r5) goto L16
            goto L32
        L16:
            android.view.ViewGroup$LayoutParams r4 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r4
            boolean r5 = r4.isNestedScrollAccepted(r1)
            if (r5 != 0) goto L23
            goto L32
        L23:
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r4 = r4.getBehavior()
            if (r4 == 0) goto L32
            r5 = r10
            r7 = r11
            r8 = r12
            r9 = r13
            boolean r4 = r4.onNestedPreFling(r5, r6, r7, r8, r9)
            r3 = r3 | r4
        L32:
            int r2 = r2 + 1
            goto L7
        L35:
            return r3
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(android.view.View r7, int r8, int r9, int[] r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.onNestedPreScroll(r1, r2, r3, r4, r5)
            return
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(android.view.View r17, int r18, int r19, int[] r20, int r21) {
            r16 = this;
            r8 = r16
            int r9 = r16.getChildCount()
            r10 = 0
            r0 = 0
            r11 = 0
            r12 = 0
            r13 = 0
        Lb:
            r14 = 1
            if (r11 >= r9) goto L6e
            android.view.View r2 = r8.getChildAt(r11)
            int r1 = r2.getVisibility()
            r3 = 8
            if (r1 != r3) goto L1d
            r15 = r21
            goto L6b
        L1d:
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r1
            r15 = r21
            boolean r3 = r1.isNestedScrollAccepted(r15)
            if (r3 != 0) goto L2c
            goto L6b
        L2c:
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r1 = r1.getBehavior()
            if (r1 == 0) goto L6b
            int[] r6 = r8.mBehaviorConsumed
            r6[r10] = r10
            r6[r14] = r10
            r0 = r1
            r1 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r7 = r21
            r0.onNestedPreScroll(r1, r2, r3, r4, r5, r6, r7)
            int[] r0 = r8.mBehaviorConsumed
            if (r18 <= 0) goto L51
            r0 = r0[r10]
            int r0 = java.lang.Math.max(r12, r0)
            goto L57
        L51:
            r0 = r0[r10]
            int r0 = java.lang.Math.min(r12, r0)
        L57:
            r12 = r0
            int[] r0 = r8.mBehaviorConsumed
            if (r19 <= 0) goto L63
            r0 = r0[r14]
            int r0 = java.lang.Math.max(r13, r0)
            goto L69
        L63:
            r0 = r0[r14]
            int r0 = java.lang.Math.min(r13, r0)
        L69:
            r13 = r0
            r0 = 1
        L6b:
            int r11 = r11 + 1
            goto Lb
        L6e:
            r20[r10] = r12
            r20[r14] = r13
            if (r0 == 0) goto L77
            r8.onChildViewsChanged(r14)
        L77:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(android.view.View r8, int r9, int r10, int r11, int r12) {
            r7 = this;
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.onNestedScroll(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(android.view.View r9, int r10, int r11, int r12, int r13, int r14) {
            r8 = this;
            int[] r7 = r8.mNestedScrollingV2ConsumedCompat
            r6 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r0.onNestedScroll(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(@androidx.annotation.NonNull android.view.View r18, int r19, int r20, int r21, int r22, int r23, @androidx.annotation.NonNull int[] r24) {
            r17 = this;
            r10 = r17
            int r11 = r17.getChildCount()
            r12 = 0
            r0 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        Lb:
            r9 = 1
            if (r13 >= r11) goto L78
            android.view.View r2 = r10.getChildAt(r13)
            int r1 = r2.getVisibility()
            r3 = 8
            if (r1 != r3) goto L1b
            goto L75
        L1b:
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r1
            r8 = r23
            boolean r3 = r1.isNestedScrollAccepted(r8)
            if (r3 != 0) goto L2a
            goto L75
        L2a:
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r1 = r1.getBehavior()
            if (r1 == 0) goto L75
            int[] r7 = r10.mBehaviorConsumed
            r7[r12] = r12
            r7[r9] = r12
            r0 = r1
            r1 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r16 = r7
            r7 = r22
            r8 = r23
            r9 = r16
            r0.onNestedScroll(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            int[] r0 = r10.mBehaviorConsumed
            if (r21 <= 0) goto L57
            r0 = r0[r12]
            int r0 = java.lang.Math.max(r14, r0)
            goto L5d
        L57:
            r0 = r0[r12]
            int r0 = java.lang.Math.min(r14, r0)
        L5d:
            r14 = r0
            if (r22 <= 0) goto L6a
            int[] r0 = r10.mBehaviorConsumed
            r1 = 1
            r0 = r0[r1]
            int r0 = java.lang.Math.max(r15, r0)
            goto L73
        L6a:
            r1 = 1
            int[] r0 = r10.mBehaviorConsumed
            r0 = r0[r1]
            int r0 = java.lang.Math.min(r15, r0)
        L73:
            r15 = r0
            r0 = 1
        L75:
            int r13 = r13 + 1
            goto Lb
        L78:
            r1 = 1
            r2 = r24[r12]
            int r2 = r2 + r14
            r24[r12] = r2
            r2 = r24[r1]
            int r2 = r2 + r15
            r24[r1] = r2
            if (r0 == 0) goto L88
            r10.onChildViewsChanged(r1)
        L88:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(android.view.View r2, android.view.View r3, int r4) {
            r1 = this;
            r0 = 0
            r1.onNestedScrollAccepted(r2, r3, r4, r0)
            return
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(android.view.View r10, android.view.View r11, int r12, int r13) {
            r9 = this;
            androidx.core.view.NestedScrollingParentHelper r0 = r9.mNestedScrollingParentHelper
            r0.onNestedScrollAccepted(r10, r11, r12, r13)
            r9.mNestedScrollingTarget = r11
            int r0 = r9.getChildCount()
            r1 = 0
        Lc:
            if (r1 >= r0) goto L30
            android.view.View r4 = r9.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r2 = r4.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r2 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r2
            boolean r3 = r2.isNestedScrollAccepted(r13)
            if (r3 != 0) goto L1f
            goto L2d
        L1f:
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r2 = r2.getBehavior()
            if (r2 == 0) goto L2d
            r3 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r2.onNestedScrollAccepted(r3, r4, r5, r6, r7, r8)
        L2d:
            int r1 = r1 + 1
            goto Lc
        L30:
            return
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable r7) {
            r6 = this;
            boolean r0 = r7 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r7)
            return
        L8:
            androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState r7 = (androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState) r7
            android.os.Parcelable r0 = r7.getSuperState()
            super.onRestoreInstanceState(r0)
            android.util.SparseArray<android.os.Parcelable> r7 = r7.behaviorStates
            r0 = 0
            int r1 = r6.getChildCount()
        L18:
            if (r0 >= r1) goto L3d
            android.view.View r2 = r6.getChildAt(r0)
            int r3 = r2.getId()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r4 = r6.getResolvedLayoutParams(r2)
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r4 = r4.getBehavior()
            r5 = -1
            if (r3 == r5) goto L3a
            if (r4 == 0) goto L3a
            java.lang.Object r3 = r7.get(r3)
            android.os.Parcelable r3 = (android.os.Parcelable) r3
            if (r3 == 0) goto L3a
            r4.onRestoreInstanceState(r6, r2, r3)
        L3a:
            int r0 = r0 + 1
            goto L18
        L3d:
            return
    }

    @Override // android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
            r8 = this;
            androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState
            android.os.Parcelable r1 = super.onSaveInstanceState()
            r0.<init>(r1)
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            int r2 = r8.getChildCount()
            r3 = 0
        L13:
            if (r3 >= r2) goto L38
            android.view.View r4 = r8.getChildAt(r3)
            int r5 = r4.getId()
            android.view.ViewGroup$LayoutParams r6 = r4.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r6 = r6.getBehavior()
            r7 = -1
            if (r5 == r7) goto L35
            if (r6 == 0) goto L35
            android.os.Parcelable r4 = r6.onSaveInstanceState(r8, r4)
            if (r4 == 0) goto L35
            r1.append(r5, r4)
        L35:
            int r3 = r3 + 1
            goto L13
        L38:
            r0.behaviorStates = r1
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(android.view.View r2, android.view.View r3, int r4) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.onStartNestedScroll(r2, r3, r4, r0)
            return r2
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(android.view.View r15, android.view.View r16, int r17, int r18) {
            r14 = this;
            r7 = r18
            int r8 = r14.getChildCount()
            r9 = 0
            r10 = 0
            r11 = 0
        L9:
            if (r10 >= r8) goto L3d
            r12 = r14
            android.view.View r2 = r14.getChildAt(r10)
            int r0 = r2.getVisibility()
            r1 = 8
            if (r0 != r1) goto L19
            goto L3a
        L19:
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            r13 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r13 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r13
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r13.getBehavior()
            if (r0 == 0) goto L37
            r1 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            boolean r0 = r0.onStartNestedScroll(r1, r2, r3, r4, r5, r6)
            r11 = r11 | r0
            r13.setNestedScrollAccepted(r7, r0)
            goto L3a
        L37:
            r13.setNestedScrollAccepted(r7, r9)
        L3a:
            int r10 = r10 + 1
            goto L9
        L3d:
            r12 = r14
            return r11
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(android.view.View r2) {
            r1 = this;
            r0 = 0
            r1.onStopNestedScroll(r2, r0)
            return
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(android.view.View r7, int r8) {
            r6 = this;
            androidx.core.view.NestedScrollingParentHelper r0 = r6.mNestedScrollingParentHelper
            r0.onStopNestedScroll(r7, r8)
            int r0 = r6.getChildCount()
            r1 = 0
            r2 = 0
        Lb:
            if (r2 >= r0) goto L30
            android.view.View r3 = r6.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r4
            boolean r5 = r4.isNestedScrollAccepted(r8)
            if (r5 != 0) goto L1e
            goto L2d
        L1e:
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r5 = r4.getBehavior()
            if (r5 == 0) goto L27
            r5.onStopNestedScroll(r6, r3, r7, r8)
        L27:
            r4.setNestedScrollAccepted(r8, r1)
            r4.resetChangedAfterNestedScroll()
        L2d:
            int r2 = r2 + 1
            goto Lb
        L30:
            r7 = 0
            r6.mNestedScrollingTarget = r7
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.mBehaviorTouchView
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L15
            boolean r3 = r0.performIntercept(r1, r4)
            if (r3 == 0) goto L2b
            goto L16
        L15:
            r3 = 0
        L16:
            android.view.View r6 = r0.mBehaviorTouchView
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r6 = r6.getBehavior()
            if (r6 == 0) goto L2b
            android.view.View r7 = r0.mBehaviorTouchView
            boolean r6 = r6.onTouchEvent(r0, r7, r1)
            goto L2c
        L2b:
            r6 = 0
        L2c:
            android.view.View r7 = r0.mBehaviorTouchView
            r8 = 0
            if (r7 != 0) goto L37
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L4a
        L37:
            if (r3 == 0) goto L4a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L4a:
            if (r8 == 0) goto L4f
            r8.recycle()
        L4f:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L57
        L54:
            r0.resetTouchBehaviors(r5)
        L57:
            return r6
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(android.view.View r2, android.graphics.Rect r3, boolean r4) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r0.getBehavior()
            if (r0 == 0) goto L14
            boolean r0 = r0.onRequestChildRectangleOnScreen(r1, r2, r3, r4)
            if (r0 == 0) goto L14
            r2 = 1
            return r2
        L14:
            boolean r2 = super.requestChildRectangleOnScreen(r2, r3, r4)
            return r2
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean r1) {
            r0 = this;
            super.requestDisallowInterceptTouchEvent(r1)
            if (r1 == 0) goto L10
            boolean r1 = r0.mDisallowInterceptReset
            if (r1 != 0) goto L10
            r1 = 0
            r0.resetTouchBehaviors(r1)
            r1 = 1
            r0.mDisallowInterceptReset = r1
        L10:
            return
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean r1) {
            r0 = this;
            super.setFitsSystemWindows(r1)
            r0.setupForInsets()
            return
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(android.view.ViewGroup.OnHierarchyChangeListener r1) {
            r0 = this;
            r0.mOnHierarchyChangeListener = r1
            return
    }

    public void setStatusBarBackground(@androidx.annotation.Nullable android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.mStatusBarBackground
            if (r0 == r3) goto L43
            r1 = 0
            if (r0 == 0) goto La
            r0.setCallback(r1)
        La:
            if (r3 == 0) goto L10
            android.graphics.drawable.Drawable r1 = r3.mutate()
        L10:
            r2.mStatusBarBackground = r1
            if (r1 == 0) goto L40
            boolean r3 = r1.isStateful()
            if (r3 == 0) goto L23
            android.graphics.drawable.Drawable r3 = r2.mStatusBarBackground
            int[] r0 = r2.getDrawableState()
            r3.setState(r0)
        L23:
            android.graphics.drawable.Drawable r3 = r2.mStatusBarBackground
            int r0 = androidx.core.view.ViewCompat.getLayoutDirection(r2)
            androidx.core.graphics.drawable.DrawableCompat.setLayoutDirection(r3, r0)
            android.graphics.drawable.Drawable r3 = r2.mStatusBarBackground
            int r0 = r2.getVisibility()
            r1 = 0
            if (r0 != 0) goto L37
            r0 = 1
            goto L38
        L37:
            r0 = 0
        L38:
            r3.setVisible(r0, r1)
            android.graphics.drawable.Drawable r3 = r2.mStatusBarBackground
            r3.setCallback(r2)
        L40:
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r2)
        L43:
            return
    }

    public void setStatusBarBackgroundColor(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r2)
            r1.setStatusBarBackground(r0)
            return
    }

    public void setStatusBarBackgroundResource(@androidx.annotation.DrawableRes int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = androidx.core.content.ContextCompat.getDrawable(r0, r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setStatusBarBackground(r2)
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
            android.graphics.drawable.Drawable r1 = r2.mStatusBarBackground
            if (r1 == 0) goto L18
            boolean r1 = r1.isVisible()
            if (r1 == r3) goto L18
            android.graphics.drawable.Drawable r1 = r2.mStatusBarBackground
            r1.setVisible(r3, r0)
        L18:
            return
    }

    public final androidx.core.view.WindowInsetsCompat setWindowInsets(androidx.core.view.WindowInsetsCompat r4) {
            r3 = this;
            androidx.core.view.WindowInsetsCompat r0 = r3.mLastInsets
            boolean r0 = androidx.core.util.ObjectsCompat.equals(r0, r4)
            if (r0 != 0) goto L2d
            r3.mLastInsets = r4
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L16
            int r2 = r4.getSystemWindowInsetTop()
            if (r2 <= 0) goto L16
            r2 = 1
            goto L17
        L16:
            r2 = 0
        L17:
            r3.mDrawStatusBarBackground = r2
            if (r2 != 0) goto L22
            android.graphics.drawable.Drawable r2 = r3.getBackground()
            if (r2 != 0) goto L22
            goto L23
        L22:
            r0 = 0
        L23:
            r3.setWillNotDraw(r0)
            androidx.core.view.WindowInsetsCompat r4 = r3.dispatchApplyWindowInsetsToBehaviors(r4)
            r3.requestLayout()
        L2d:
            return r4
    }

    @Override // android.view.View
    public final boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            boolean r0 = super.verifyDrawable(r2)
            if (r0 != 0) goto Ld
            android.graphics.drawable.Drawable r0 = r1.mStatusBarBackground
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
