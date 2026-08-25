package com.google.android.material.bottomsheet;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends android.view.View> extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<V> {
    private static final int CORNER_ANIMATION_DURATION = 500;
    private static final int DEF_STYLE_RES = 0;
    private static final float HIDE_FRICTION = 0.1f;
    private static final float HIDE_THRESHOLD = 0.5f;
    private static final int NO_MAX_SIZE = -1;
    public static final int PEEK_HEIGHT_AUTO = -1;
    public static final int SAVE_ALL = -1;
    public static final int SAVE_FIT_TO_CONTENTS = 2;
    public static final int SAVE_HIDEABLE = 4;
    public static final int SAVE_NONE = 0;
    public static final int SAVE_PEEK_HEIGHT = 1;
    public static final int SAVE_SKIP_COLLAPSED = 8;
    public static final int STATE_COLLAPSED = 4;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_EXPANDED = 3;
    public static final int STATE_HALF_EXPANDED = 6;
    public static final int STATE_HIDDEN = 5;
    public static final int STATE_SETTLING = 2;
    private static final java.lang.String TAG = "BottomSheetBehavior";
    private static final int VIEW_INDEX_BOTTOM_SHEET = 0;

    @androidx.annotation.Nullable
    public java.lang.ref.WeakReference<android.view.View> accessibilityDelegateViewRef;
    public int activePointerId;

    @androidx.annotation.Nullable
    private android.content.res.ColorStateList backgroundTint;

    @androidx.annotation.NonNull
    private final java.util.ArrayList<com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback> callbacks;
    private int childHeight;
    public int collapsedOffset;
    private final androidx.customview.widget.ViewDragHelper.Callback dragCallback;
    private boolean draggable;
    public float elevation;

    @androidx.annotation.VisibleForTesting
    public final android.util.SparseIntArray expandHalfwayActionIds;
    private boolean expandedCornersRemoved;
    public int expandedOffset;
    private boolean fitToContents;
    public int fitToContentsOffset;
    private int gestureInsetBottom;
    private boolean gestureInsetBottomIgnored;
    public int halfExpandedOffset;
    public float halfExpandedRatio;
    private float hideFriction;
    public boolean hideable;
    private boolean ignoreEvents;

    @androidx.annotation.Nullable
    private java.util.Map<android.view.View, java.lang.Integer> importantForAccessibilityMap;
    private int initialY;
    private int insetBottom;
    private int insetTop;

    @androidx.annotation.Nullable
    private android.animation.ValueAnimator interpolatorAnimator;
    private int lastNestedScrollDy;
    public int lastStableState;
    private boolean marginLeftSystemWindowInsets;
    private boolean marginRightSystemWindowInsets;
    private boolean marginTopSystemWindowInsets;
    private com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable;
    private int maxHeight;
    private int maxWidth;
    private float maximumVelocity;
    private boolean nestedScrolled;

    @androidx.annotation.Nullable
    public java.lang.ref.WeakReference<android.view.View> nestedScrollingChildRef;
    private boolean paddingBottomSystemWindowInsets;
    private boolean paddingLeftSystemWindowInsets;
    private boolean paddingRightSystemWindowInsets;
    private boolean paddingTopSystemWindowInsets;
    public int parentHeight;
    public int parentWidth;
    private int peekHeight;
    private boolean peekHeightAuto;
    private int peekHeightGestureInsetBuffer;
    private int peekHeightMin;
    private int saveFlags;
    private com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModelDefault;
    private boolean shouldRemoveExpandedCorners;
    private int significantVelocityThreshold;
    private boolean skipCollapsed;
    public int state;
    private final com.google.android.material.bottomsheet.BottomSheetBehavior<V>.StateSettlingTracker stateSettlingTracker;
    public boolean touchingScrollingChild;
    private boolean updateImportantForAccessibilityOnSiblings;

    @androidx.annotation.Nullable
    private android.view.VelocityTracker velocityTracker;

    @androidx.annotation.Nullable
    public androidx.customview.widget.ViewDragHelper viewDragHelper;

    @androidx.annotation.Nullable
    public java.lang.ref.WeakReference<V> viewRef;






    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class BottomSheetCallback {
        public BottomSheetCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onLayout(@androidx.annotation.NonNull android.view.View r1) {
                r0 = this;
                return
        }

        public abstract void onSlide(@androidx.annotation.NonNull android.view.View r1, float r2);

        public abstract void onStateChanged(@androidx.annotation.NonNull android.view.View r1, int r2);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public @interface SaveFlags {
    }

    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState> CREATOR = null;
        public boolean fitToContents;
        public boolean hideable;
        public int peekHeight;
        public boolean skipCollapsed;
        public final int state;


        static {
                com.google.android.material.bottomsheet.BottomSheetBehavior$SavedState$1 r0 = new com.google.android.material.bottomsheet.BottomSheetBehavior$SavedState$1
                r0.<init>()
                com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState.CREATOR = r0
                return
        }

        public SavedState(@androidx.annotation.NonNull android.os.Parcel r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        public SavedState(@androidx.annotation.NonNull android.os.Parcel r3, java.lang.ClassLoader r4) {
                r2 = this;
                r2.<init>(r3, r4)
                int r4 = r3.readInt()
                r2.state = r4
                int r4 = r3.readInt()
                r2.peekHeight = r4
                int r4 = r3.readInt()
                r0 = 0
                r1 = 1
                if (r4 != r1) goto L19
                r4 = 1
                goto L1a
            L19:
                r4 = 0
            L1a:
                r2.fitToContents = r4
                int r4 = r3.readInt()
                if (r4 != r1) goto L24
                r4 = 1
                goto L25
            L24:
                r4 = 0
            L25:
                r2.hideable = r4
                int r3 = r3.readInt()
                if (r3 != r1) goto L2e
                r0 = 1
            L2e:
                r2.skipCollapsed = r0
                return
        }

        @java.lang.Deprecated
        public SavedState(android.os.Parcelable r1, int r2) {
                r0 = this;
                r0.<init>(r1)
                r0.state = r2
                return
        }

        public SavedState(android.os.Parcelable r1, @androidx.annotation.NonNull com.google.android.material.bottomsheet.BottomSheetBehavior<?> r2) {
                r0 = this;
                r0.<init>(r1)
                int r1 = r2.state
                r0.state = r1
                int r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$1900(r2)
                r0.peekHeight = r1
                boolean r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$1400(r2)
                r0.fitToContents = r1
                boolean r1 = r2.hideable
                r0.hideable = r1
                boolean r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$2000(r2)
                r0.skipCollapsed = r1
                return
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                int r2 = r0.state
                r1.writeInt(r2)
                int r2 = r0.peekHeight
                r1.writeInt(r2)
                boolean r2 = r0.fitToContents
                r1.writeInt(r2)
                boolean r2 = r0.hideable
                r1.writeInt(r2)
                boolean r2 = r0.skipCollapsed
                r1.writeInt(r2)
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public @interface StableState {
    }

    /* JADX INFO: loaded from: classes3.dex */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public @interface State {
    }

    public class StateSettlingTracker {
        private final java.lang.Runnable continueSettlingRunnable;
        private boolean isContinueSettlingRunnablePosted;
        private int targetState;
        public final /* synthetic */ com.google.android.material.bottomsheet.BottomSheetBehavior this$0;


        private StateSettlingTracker(com.google.android.material.bottomsheet.BottomSheetBehavior r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                com.google.android.material.bottomsheet.BottomSheetBehavior$StateSettlingTracker$1 r1 = new com.google.android.material.bottomsheet.BottomSheetBehavior$StateSettlingTracker$1
                r1.<init>(r0)
                r0.continueSettlingRunnable = r1
                return
        }

        public /* synthetic */ StateSettlingTracker(com.google.android.material.bottomsheet.BottomSheetBehavior r1, com.google.android.material.bottomsheet.BottomSheetBehavior.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public static /* synthetic */ void access$1702(com.google.android.material.bottomsheet.BottomSheetBehavior.StateSettlingTracker r1) {
                r0 = 0
                r1.isContinueSettlingRunnablePosted = r0
                return
        }

        public static /* synthetic */ int access$1800(com.google.android.material.bottomsheet.BottomSheetBehavior.StateSettlingTracker r0) {
                int r0 = r0.targetState
                return r0
        }

        public final void continueSettlingToState(int r2) {
                r1 = this;
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r1.this$0
                java.lang.ref.WeakReference<V extends android.view.View> r0 = r0.viewRef
                if (r0 == 0) goto L25
                java.lang.Object r0 = r0.get()
                if (r0 != 0) goto Ld
                goto L25
            Ld:
                r1.targetState = r2
                boolean r2 = r1.isContinueSettlingRunnablePosted
                if (r2 != 0) goto L25
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = r1.this$0
                java.lang.ref.WeakReference<V extends android.view.View> r2 = r2.viewRef
                java.lang.Object r2 = r2.get()
                android.view.View r2 = (android.view.View) r2
                java.lang.Runnable r0 = r1.continueSettlingRunnable
                androidx.core.view.ViewCompat.postOnAnimation(r2, r0)
                r2 = 1
                r1.isContinueSettlingRunnablePosted = r2
            L25:
                return
        }
    }

    static {
            int r0 = com.google.android.material.R.style.Widget_Design_BottomSheet_Modal
            com.google.android.material.bottomsheet.BottomSheetBehavior.DEF_STYLE_RES = r0
            return
    }

    public BottomSheetBehavior() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.saveFlags = r0
            r1 = 1
            r3.fitToContents = r1
            r3.updateImportantForAccessibilityOnSiblings = r0
            r0 = -1
            r3.maxWidth = r0
            r3.maxHeight = r0
            com.google.android.material.bottomsheet.BottomSheetBehavior$StateSettlingTracker r0 = new com.google.android.material.bottomsheet.BottomSheetBehavior$StateSettlingTracker
            r2 = 0
            r0.<init>(r3, r2)
            r3.stateSettlingTracker = r0
            r0 = 1056964608(0x3f000000, float:0.5)
            r3.halfExpandedRatio = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3.elevation = r0
            r3.draggable = r1
            r0 = 4
            r3.state = r0
            r3.lastStableState = r0
            r0 = 1036831949(0x3dcccccd, float:0.1)
            r3.hideFriction = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.callbacks = r0
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            r3.expandHalfwayActionIds = r0
            com.google.android.material.bottomsheet.BottomSheetBehavior$4 r0 = new com.google.android.material.bottomsheet.BottomSheetBehavior$4
            r0.<init>(r3)
            r3.dragCallback = r0
            return
    }

    public BottomSheetBehavior(@androidx.annotation.NonNull android.content.Context r9, @androidx.annotation.Nullable android.util.AttributeSet r10) {
            r8 = this;
            r8.<init>(r9, r10)
            r0 = 0
            r8.saveFlags = r0
            r1 = 1
            r8.fitToContents = r1
            r8.updateImportantForAccessibilityOnSiblings = r0
            r2 = -1
            r8.maxWidth = r2
            r8.maxHeight = r2
            com.google.android.material.bottomsheet.BottomSheetBehavior$StateSettlingTracker r3 = new com.google.android.material.bottomsheet.BottomSheetBehavior$StateSettlingTracker
            r4 = 0
            r3.<init>(r8, r4)
            r8.stateSettlingTracker = r3
            r3 = 1056964608(0x3f000000, float:0.5)
            r8.halfExpandedRatio = r3
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r8.elevation = r4
            r8.draggable = r1
            r5 = 4
            r8.state = r5
            r8.lastStableState = r5
            r5 = 1036831949(0x3dcccccd, float:0.1)
            r8.hideFriction = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r8.callbacks = r5
            android.util.SparseIntArray r5 = new android.util.SparseIntArray
            r5.<init>()
            r8.expandHalfwayActionIds = r5
            com.google.android.material.bottomsheet.BottomSheetBehavior$4 r5 = new com.google.android.material.bottomsheet.BottomSheetBehavior$4
            r5.<init>(r8)
            r8.dragCallback = r5
            android.content.res.Resources r5 = r9.getResources()
            int r6 = com.google.android.material.R.dimen.mtrl_min_touch_target_size
            int r5 = r5.getDimensionPixelSize(r6)
            r8.peekHeightGestureInsetBuffer = r5
            int[] r5 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout
            android.content.res.TypedArray r5 = r9.obtainStyledAttributes(r10, r5)
            int r6 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout_backgroundTint
            boolean r7 = r5.hasValue(r6)
            if (r7 == 0) goto L61
            android.content.res.ColorStateList r6 = com.google.android.material.resources.MaterialResources.getColorStateList(r9, r5, r6)
            r8.backgroundTint = r6
        L61:
            int r6 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout_shapeAppearance
            boolean r6 = r5.hasValue(r6)
            if (r6 == 0) goto L77
            int r6 = com.google.android.material.R.attr.bottomSheetStyle
            int r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.DEF_STYLE_RES
            com.google.android.material.shape.ShapeAppearanceModel$Builder r10 = com.google.android.material.shape.ShapeAppearanceModel.builder(r9, r10, r6, r7)
            com.google.android.material.shape.ShapeAppearanceModel r10 = r10.build()
            r8.shapeAppearanceModelDefault = r10
        L77:
            r8.createMaterialShapeDrawableIfNeeded(r9)
            r8.createShapeValueAnimator()
            int r10 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout_android_elevation
            float r10 = r5.getDimension(r10, r4)
            r8.elevation = r10
            int r10 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout_android_maxWidth
            boolean r4 = r5.hasValue(r10)
            if (r4 == 0) goto L94
            int r10 = r5.getDimensionPixelSize(r10, r2)
            r8.setMaxWidth(r10)
        L94:
            int r10 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout_android_maxHeight
            boolean r4 = r5.hasValue(r10)
            if (r4 == 0) goto La3
            int r10 = r5.getDimensionPixelSize(r10, r2)
            r8.setMaxHeight(r10)
        La3:
            int r10 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight
            android.util.TypedValue r4 = r5.peekValue(r10)
            if (r4 == 0) goto Lb3
            int r4 = r4.data
            if (r4 != r2) goto Lb3
            r8.setPeekHeight(r4)
            goto Lba
        Lb3:
            int r10 = r5.getDimensionPixelSize(r10, r2)
            r8.setPeekHeight(r10)
        Lba:
            int r10 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout_behavior_hideable
            boolean r10 = r5.getBoolean(r10, r0)
            r8.setHideable(r10)
            int r10 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout_gestureInsetBottomIgnored
            boolean r10 = r5.getBoolean(r10, r0)
            r8.setGestureInsetBottomIgnored(r10)
            int r10 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout_behavior_fitToContents
            boolean r10 = r5.getBoolean(r10, r1)
            r8.setFitToContents(r10)
            int r10 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed
            boolean r10 = r5.getBoolean(r10, r0)
            r8.setSkipCollapsed(r10)
            int r10 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout_behavior_draggable
            boolean r10 = r5.getBoolean(r10, r1)
            r8.setDraggable(r10)
            int r10 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout_behavior_saveFlags
            int r10 = r5.getInt(r10, r0)
            r8.setSaveFlags(r10)
            int r10 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout_behavior_halfExpandedRatio
            float r10 = r5.getFloat(r10, r3)
            r8.setHalfExpandedRatio(r10)
            int r10 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout_behavior_expandedOffset
            android.util.TypedValue r2 = r5.peekValue(r10)
            if (r2 == 0) goto L10d
            int r3 = r2.type
            r4 = 16
            if (r3 != r4) goto L10d
            int r10 = r2.data
            r8.setExpandedOffset(r10)
            goto L114
        L10d:
            int r10 = r5.getDimensionPixelOffset(r10, r0)
            r8.setExpandedOffset(r10)
        L114:
            int r10 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout_behavior_significantVelocityThreshold
            r2 = 500(0x1f4, float:7.0E-43)
            int r10 = r5.getInt(r10, r2)
            r8.setSignificantVelocityThreshold(r10)
            int r10 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets
            boolean r10 = r5.getBoolean(r10, r0)
            r8.paddingBottomSystemWindowInsets = r10
            int r10 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets
            boolean r10 = r5.getBoolean(r10, r0)
            r8.paddingLeftSystemWindowInsets = r10
            int r10 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets
            boolean r10 = r5.getBoolean(r10, r0)
            r8.paddingRightSystemWindowInsets = r10
            int r10 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets
            boolean r10 = r5.getBoolean(r10, r1)
            r8.paddingTopSystemWindowInsets = r10
            int r10 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout_marginLeftSystemWindowInsets
            boolean r10 = r5.getBoolean(r10, r0)
            r8.marginLeftSystemWindowInsets = r10
            int r10 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout_marginRightSystemWindowInsets
            boolean r10 = r5.getBoolean(r10, r0)
            r8.marginRightSystemWindowInsets = r10
            int r10 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout_marginTopSystemWindowInsets
            boolean r10 = r5.getBoolean(r10, r0)
            r8.marginTopSystemWindowInsets = r10
            int r10 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout_shouldRemoveExpandedCorners
            boolean r10 = r5.getBoolean(r10, r1)
            r8.shouldRemoveExpandedCorners = r10
            r5.recycle()
            android.view.ViewConfiguration r9 = android.view.ViewConfiguration.get(r9)
            int r9 = r9.getScaledMaximumFlingVelocity()
            float r9 = (float) r9
            r8.maximumVelocity = r9
            return
    }

    public static /* synthetic */ void access$100(com.google.android.material.bottomsheet.BottomSheetBehavior r0, android.view.View r1, int r2, boolean r3) {
            r0.startSettling(r1, r2, r3)
            return
    }

    public static /* synthetic */ boolean access$1000(com.google.android.material.bottomsheet.BottomSheetBehavior r0) {
            boolean r0 = r0.marginTopSystemWindowInsets
            return r0
    }

    public static /* synthetic */ int access$1102(com.google.android.material.bottomsheet.BottomSheetBehavior r0, int r1) {
            r0.gestureInsetBottom = r1
            return r1
    }

    public static /* synthetic */ void access$1200(com.google.android.material.bottomsheet.BottomSheetBehavior r1) {
            r0 = 0
            r1.updatePeekHeight(r0)
            return
    }

    public static /* synthetic */ boolean access$1300(com.google.android.material.bottomsheet.BottomSheetBehavior r0) {
            boolean r0 = r0.draggable
            return r0
    }

    public static /* synthetic */ boolean access$1400(com.google.android.material.bottomsheet.BottomSheetBehavior r0) {
            boolean r0 = r0.fitToContents
            return r0
    }

    public static /* synthetic */ int access$1500(com.google.android.material.bottomsheet.BottomSheetBehavior r0) {
            int r0 = r0.significantVelocityThreshold
            return r0
    }

    public static /* synthetic */ boolean access$1600(com.google.android.material.bottomsheet.BottomSheetBehavior r0) {
            boolean r0 = r0.canBeHiddenByDragging()
            return r0
    }

    public static /* synthetic */ int access$1900(com.google.android.material.bottomsheet.BottomSheetBehavior r0) {
            int r0 = r0.peekHeight
            return r0
    }

    public static /* synthetic */ com.google.android.material.shape.MaterialShapeDrawable access$200(com.google.android.material.bottomsheet.BottomSheetBehavior r0) {
            com.google.android.material.shape.MaterialShapeDrawable r0 = r0.materialShapeDrawable
            return r0
    }

    public static /* synthetic */ boolean access$2000(com.google.android.material.bottomsheet.BottomSheetBehavior r0) {
            boolean r0 = r0.skipCollapsed
            return r0
    }

    public static /* synthetic */ int access$302(com.google.android.material.bottomsheet.BottomSheetBehavior r0, int r1) {
            r0.insetTop = r1
            return r1
    }

    public static /* synthetic */ boolean access$400(com.google.android.material.bottomsheet.BottomSheetBehavior r0) {
            boolean r0 = r0.paddingBottomSystemWindowInsets
            return r0
    }

    public static /* synthetic */ int access$500(com.google.android.material.bottomsheet.BottomSheetBehavior r0) {
            int r0 = r0.insetBottom
            return r0
    }

    public static /* synthetic */ int access$502(com.google.android.material.bottomsheet.BottomSheetBehavior r0, int r1) {
            r0.insetBottom = r1
            return r1
    }

    public static /* synthetic */ boolean access$600(com.google.android.material.bottomsheet.BottomSheetBehavior r0) {
            boolean r0 = r0.paddingLeftSystemWindowInsets
            return r0
    }

    public static /* synthetic */ boolean access$700(com.google.android.material.bottomsheet.BottomSheetBehavior r0) {
            boolean r0 = r0.paddingRightSystemWindowInsets
            return r0
    }

    public static /* synthetic */ boolean access$800(com.google.android.material.bottomsheet.BottomSheetBehavior r0) {
            boolean r0 = r0.marginLeftSystemWindowInsets
            return r0
    }

    public static /* synthetic */ boolean access$900(com.google.android.material.bottomsheet.BottomSheetBehavior r0) {
            boolean r0 = r0.marginRightSystemWindowInsets
            return r0
    }

    private int addAccessibilityActionForState(android.view.View r2, @androidx.annotation.StringRes int r3, int r4) {
            r1 = this;
            android.content.res.Resources r0 = r2.getResources()
            java.lang.String r3 = r0.getString(r3)
            androidx.core.view.accessibility.AccessibilityViewCommand r4 = r1.createAccessibilityViewCommandForState(r4)
            int r2 = androidx.core.view.ViewCompat.addAccessibilityAction(r2, r3, r4)
            return r2
    }

    private void calculateCollapsedOffset() {
            r2 = this;
            int r0 = r2.calculatePeekHeight()
            boolean r1 = r2.fitToContents
            if (r1 == 0) goto L14
            int r1 = r2.parentHeight
            int r1 = r1 - r0
            int r0 = r2.fitToContentsOffset
            int r0 = java.lang.Math.max(r1, r0)
            r2.collapsedOffset = r0
            goto L19
        L14:
            int r1 = r2.parentHeight
            int r1 = r1 - r0
            r2.collapsedOffset = r1
        L19:
            return
    }

    private void calculateHalfExpandedOffset() {
            r3 = this;
            int r0 = r3.parentHeight
            float r0 = (float) r0
            float r1 = r3.halfExpandedRatio
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r1
            float r2 = r2 * r0
            int r0 = (int) r2
            r3.halfExpandedOffset = r0
            return
    }

    private int calculatePeekHeight() {
            r3 = this;
            boolean r0 = r3.peekHeightAuto
            if (r0 == 0) goto L1d
            int r0 = r3.peekHeightMin
            int r1 = r3.parentHeight
            int r2 = r3.parentWidth
            int r2 = r2 * 9
            int r2 = r2 / 16
            int r1 = r1 - r2
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r3.childHeight
            int r0 = java.lang.Math.min(r0, r1)
            int r1 = r3.insetBottom
            int r0 = r0 + r1
            return r0
        L1d:
            boolean r0 = r3.gestureInsetBottomIgnored
            if (r0 != 0) goto L33
            boolean r0 = r3.paddingBottomSystemWindowInsets
            if (r0 != 0) goto L33
            int r0 = r3.gestureInsetBottom
            if (r0 <= 0) goto L33
            int r1 = r3.peekHeight
            int r2 = r3.peekHeightGestureInsetBuffer
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r1, r0)
            return r0
        L33:
            int r0 = r3.peekHeight
            int r1 = r3.insetBottom
            int r0 = r0 + r1
            return r0
    }

    private float calculateSlideOffsetWithTop(int r3) {
            r2 = this;
            int r0 = r2.collapsedOffset
            if (r3 > r0) goto L17
            int r1 = r2.getExpandedOffset()
            if (r0 != r1) goto Lb
            goto L17
        Lb:
            int r0 = r2.collapsedOffset
            int r3 = r0 - r3
            float r3 = (float) r3
            int r1 = r2.getExpandedOffset()
            int r0 = r0 - r1
            float r0 = (float) r0
            goto L20
        L17:
            int r0 = r2.collapsedOffset
            int r3 = r0 - r3
            float r3 = (float) r3
            int r1 = r2.parentHeight
            int r1 = r1 - r0
            float r0 = (float) r1
        L20:
            float r3 = r3 / r0
            return r3
    }

    private boolean canBeHiddenByDragging() {
            r1 = this;
            boolean r0 = r1.isHideable()
            if (r0 == 0) goto Le
            boolean r0 = r1.isHideableWhenDragging()
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    private void clearAccessibilityAction(android.view.View r3, int r4) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            r0 = 524288(0x80000, float:7.34684E-40)
            androidx.core.view.ViewCompat.removeAccessibilityAction(r3, r0)
            r0 = 262144(0x40000, float:3.67342E-40)
            androidx.core.view.ViewCompat.removeAccessibilityAction(r3, r0)
            r0 = 1048576(0x100000, float:1.469368E-39)
            androidx.core.view.ViewCompat.removeAccessibilityAction(r3, r0)
            android.util.SparseIntArray r0 = r2.expandHalfwayActionIds
            r1 = -1
            int r0 = r0.get(r4, r1)
            if (r0 == r1) goto L23
            androidx.core.view.ViewCompat.removeAccessibilityAction(r3, r0)
            android.util.SparseIntArray r3 = r2.expandHalfwayActionIds
            r3.delete(r4)
        L23:
            return
    }

    private androidx.core.view.accessibility.AccessibilityViewCommand createAccessibilityViewCommandForState(int r2) {
            r1 = this;
            com.google.android.material.bottomsheet.BottomSheetBehavior$5 r0 = new com.google.android.material.bottomsheet.BottomSheetBehavior$5
            r0.<init>(r1, r2)
            return r0
    }

    private void createMaterialShapeDrawableIfNeeded(@androidx.annotation.NonNull android.content.Context r4) {
            r3 = this;
            com.google.android.material.shape.ShapeAppearanceModel r0 = r3.shapeAppearanceModelDefault
            if (r0 != 0) goto L5
            return
        L5:
            com.google.android.material.shape.MaterialShapeDrawable r0 = new com.google.android.material.shape.MaterialShapeDrawable
            com.google.android.material.shape.ShapeAppearanceModel r1 = r3.shapeAppearanceModelDefault
            r0.<init>(r1)
            r3.materialShapeDrawable = r0
            r0.initializeElevationOverlay(r4)
            android.content.res.ColorStateList r0 = r3.backgroundTint
            if (r0 == 0) goto L1b
            com.google.android.material.shape.MaterialShapeDrawable r4 = r3.materialShapeDrawable
            r4.setFillColor(r0)
            goto L32
        L1b:
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.res.Resources$Theme r4 = r4.getTheme()
            r1 = 16842801(0x1010031, float:2.3693695E-38)
            r2 = 1
            r4.resolveAttribute(r1, r0, r2)
            com.google.android.material.shape.MaterialShapeDrawable r4 = r3.materialShapeDrawable
            int r0 = r0.data
            r4.setTint(r0)
        L32:
            return
    }

    private void createShapeValueAnimator() {
            r3 = this;
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {x001c: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            r3.interpolatorAnimator = r0
            r1 = 500(0x1f4, double:2.47E-321)
            r0.setDuration(r1)
            android.animation.ValueAnimator r0 = r3.interpolatorAnimator
            com.google.android.material.bottomsheet.BottomSheetBehavior$2 r1 = new com.google.android.material.bottomsheet.BottomSheetBehavior$2
            r1.<init>(r3)
            r0.addUpdateListener(r1)
            return
    }

    @androidx.annotation.NonNull
    public static <V extends android.view.View> com.google.android.material.bottomsheet.BottomSheetBehavior<V> from(@androidx.annotation.NonNull V r1) {
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r0 = r1 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams
            if (r0 == 0) goto L1d
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r1
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r1 = r1.getBehavior()
            boolean r0 = r1 instanceof com.google.android.material.bottomsheet.BottomSheetBehavior
            if (r0 == 0) goto L15
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r1
            return r1
        L15:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The view is not associated with BottomSheetBehavior"
            r1.<init>(r0)
            throw r1
        L1d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The view is not a child of CoordinatorLayout"
            r1.<init>(r0)
            throw r1
    }

    private int getChildMeasureSpec(int r1, int r2, int r3, int r4) {
            r0 = this;
            int r1 = android.view.ViewGroup.getChildMeasureSpec(r1, r2, r4)
            r2 = -1
            if (r3 != r2) goto L8
            return r1
        L8:
            int r2 = android.view.View.MeasureSpec.getMode(r1)
            int r1 = android.view.View.MeasureSpec.getSize(r1)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r2 == r4) goto L22
            if (r1 != 0) goto L17
            goto L1b
        L17:
            int r3 = java.lang.Math.min(r1, r3)
        L1b:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r1)
            return r1
        L22:
            int r1 = java.lang.Math.min(r1, r3)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r4)
            return r1
    }

    private int getTopOffsetForState(int r3) {
            r2 = this;
            r0 = 3
            if (r3 == r0) goto L21
            r0 = 4
            if (r3 == r0) goto L1e
            r0 = 5
            if (r3 == r0) goto L1b
            r0 = 6
            if (r3 != r0) goto Lf
            int r3 = r2.halfExpandedOffset
            return r3
        Lf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid state to get top offset: "
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3)
            r0.<init>(r3)
            throw r0
        L1b:
            int r3 = r2.parentHeight
            return r3
        L1e:
            int r3 = r2.collapsedOffset
            return r3
        L21:
            int r3 = r2.getExpandedOffset()
            return r3
    }

    private float getYVelocity() {
            r3 = this;
            android.view.VelocityTracker r0 = r3.velocityTracker
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r1 = 1000(0x3e8, float:1.401E-42)
            float r2 = r3.maximumVelocity
            r0.computeCurrentVelocity(r1, r2)
            android.view.VelocityTracker r0 = r3.velocityTracker
            int r1 = r3.activePointerId
            float r0 = r0.getYVelocity(r1)
            return r0
    }

    private boolean isExpandedAndShouldRemoveCorners() {
            r2 = this;
            int r0 = r2.state
            r1 = 3
            if (r0 != r1) goto L11
            boolean r0 = r2.shouldRemoveExpandedCorners
            if (r0 != 0) goto Lf
            int r0 = r2.getExpandedOffset()
            if (r0 != 0) goto L11
        Lf:
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }

    private boolean isLayouting(V r2) {
            r1 = this;
            android.view.ViewParent r0 = r2.getParent()
            if (r0 == 0) goto L14
            boolean r0 = r0.isLayoutRequested()
            if (r0 == 0) goto L14
            boolean r2 = androidx.core.view.ViewCompat.isAttachedToWindow(r2)
            if (r2 == 0) goto L14
            r2 = 1
            goto L15
        L14:
            r2 = 0
        L15:
            return r2
    }

    private void replaceAccessibilityActionForState(android.view.View r2, androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat r3, int r4) {
            r1 = this;
            androidx.core.view.accessibility.AccessibilityViewCommand r4 = r1.createAccessibilityViewCommandForState(r4)
            r0 = 0
            androidx.core.view.ViewCompat.replaceAccessibilityAction(r2, r3, r0, r4)
            return
    }

    private void reset() {
            r1 = this;
            r0 = -1
            r1.activePointerId = r0
            android.view.VelocityTracker r0 = r1.velocityTracker
            if (r0 == 0) goto Ld
            r0.recycle()
            r0 = 0
            r1.velocityTracker = r0
        Ld:
            return
    }

    private void restoreOptionalState(@androidx.annotation.NonNull com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState r5) {
            r4 = this;
            int r0 = r4.saveFlags
            if (r0 != 0) goto L5
            return
        L5:
            r1 = -1
            if (r0 == r1) goto Ld
            r2 = r0 & 1
            r3 = 1
            if (r2 != r3) goto L11
        Ld:
            int r2 = r5.peekHeight
            r4.peekHeight = r2
        L11:
            if (r0 == r1) goto L18
            r2 = r0 & 2
            r3 = 2
            if (r2 != r3) goto L1c
        L18:
            boolean r2 = r5.fitToContents
            r4.fitToContents = r2
        L1c:
            if (r0 == r1) goto L23
            r2 = r0 & 4
            r3 = 4
            if (r2 != r3) goto L27
        L23:
            boolean r2 = r5.hideable
            r4.hideable = r2
        L27:
            if (r0 == r1) goto L2e
            r1 = 8
            r0 = r0 & r1
            if (r0 != r1) goto L32
        L2e:
            boolean r5 = r5.skipCollapsed
            r4.skipCollapsed = r5
        L32:
            return
    }

    private void runAfterLayout(V r2, java.lang.Runnable r3) {
            r1 = this;
            boolean r0 = r1.isLayouting(r2)
            if (r0 == 0) goto La
            r2.post(r3)
            goto Ld
        La:
            r3.run()
        Ld:
            return
    }

    private void setWindowInsetsListener(@androidx.annotation.NonNull android.view.View r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L12
            boolean r0 = r2.isGestureInsetBottomIgnored()
            if (r0 != 0) goto L12
            boolean r0 = r2.peekHeightAuto
            if (r0 != 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            boolean r1 = r2.paddingBottomSystemWindowInsets
            if (r1 != 0) goto L2e
            boolean r1 = r2.paddingLeftSystemWindowInsets
            if (r1 != 0) goto L2e
            boolean r1 = r2.paddingRightSystemWindowInsets
            if (r1 != 0) goto L2e
            boolean r1 = r2.marginLeftSystemWindowInsets
            if (r1 != 0) goto L2e
            boolean r1 = r2.marginRightSystemWindowInsets
            if (r1 != 0) goto L2e
            boolean r1 = r2.marginTopSystemWindowInsets
            if (r1 != 0) goto L2e
            if (r0 != 0) goto L2e
            return
        L2e:
            com.google.android.material.bottomsheet.BottomSheetBehavior$3 r1 = new com.google.android.material.bottomsheet.BottomSheetBehavior$3
            r1.<init>(r2, r0)
            com.google.android.material.internal.ViewUtils.doOnApplyWindowInsets(r3, r1)
            return
    }

    private boolean shouldHandleDraggingWithHelper() {
            r2 = this;
            androidx.customview.widget.ViewDragHelper r0 = r2.viewDragHelper
            r1 = 1
            if (r0 == 0) goto Le
            boolean r0 = r2.draggable
            if (r0 != 0) goto Lf
            int r0 = r2.state
            if (r0 != r1) goto Le
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    private void startSettling(android.view.View r4, int r5, boolean r6) {
            r3 = this;
            int r0 = r3.getTopOffsetForState(r5)
            androidx.customview.widget.ViewDragHelper r1 = r3.viewDragHelper
            r2 = 1
            if (r1 == 0) goto L22
            if (r6 == 0) goto L16
            int r4 = r4.getLeft()
            boolean r4 = r1.settleCapturedViewAt(r4, r0)
            if (r4 == 0) goto L22
            goto L20
        L16:
            int r6 = r4.getLeft()
            boolean r4 = r1.smoothSlideViewTo(r4, r6, r0)
            if (r4 == 0) goto L22
        L20:
            r4 = 1
            goto L23
        L22:
            r4 = 0
        L23:
            if (r4 == 0) goto L32
            r4 = 2
            r3.setStateInternal(r4)
            r3.updateDrawableForTargetState(r5, r2)
            com.google.android.material.bottomsheet.BottomSheetBehavior<V>$StateSettlingTracker r4 = r3.stateSettlingTracker
            r4.continueSettlingToState(r5)
            goto L35
        L32:
            r3.setStateInternal(r5)
        L35:
            return
    }

    private void updateAccessibilityActions() {
            r2 = this;
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r2.viewRef
            if (r0 == 0) goto Le
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = 0
            r2.updateAccessibilityActions(r0, r1)
        Le:
            java.lang.ref.WeakReference<android.view.View> r0 = r2.accessibilityDelegateViewRef
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = 1
            r2.updateAccessibilityActions(r0, r1)
        L1c:
            return
    }

    private void updateAccessibilityActions(android.view.View r4, int r5) {
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            r3.clearAccessibilityAction(r4, r5)
            boolean r0 = r3.fitToContents
            r1 = 6
            if (r0 != 0) goto L1a
            int r0 = r3.state
            if (r0 == r1) goto L1a
            android.util.SparseIntArray r0 = r3.expandHalfwayActionIds
            int r2 = com.google.android.material.R.string.bottomsheet_action_expand_halfway
            int r2 = r3.addAccessibilityActionForState(r4, r2, r1)
            r0.put(r5, r2)
        L1a:
            boolean r5 = r3.hideable
            if (r5 == 0) goto L2e
            boolean r5 = r3.isHideableWhenDragging()
            if (r5 == 0) goto L2e
            int r5 = r3.state
            r0 = 5
            if (r5 == r0) goto L2e
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r5 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS
            r3.replaceAccessibilityActionForState(r4, r5, r0)
        L2e:
            int r5 = r3.state
            r0 = 4
            r2 = 3
            if (r5 == r2) goto L4f
            if (r5 == r0) goto L44
            if (r5 == r1) goto L39
            goto L59
        L39:
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r5 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_COLLAPSE
            r3.replaceAccessibilityActionForState(r4, r5, r0)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r5 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND
            r3.replaceAccessibilityActionForState(r4, r5, r2)
            goto L59
        L44:
            boolean r5 = r3.fitToContents
            if (r5 == 0) goto L49
            r1 = 3
        L49:
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r5 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND
            r3.replaceAccessibilityActionForState(r4, r5, r1)
            goto L59
        L4f:
            boolean r5 = r3.fitToContents
            if (r5 == 0) goto L54
            r1 = 4
        L54:
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r5 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_COLLAPSE
            r3.replaceAccessibilityActionForState(r4, r5, r1)
        L59:
            return
    }

    private void updateDrawableForTargetState(int r4, boolean r5) {
            r3 = this;
            r0 = 2
            if (r4 != r0) goto L4
            return
        L4:
            boolean r4 = r3.isExpandedAndShouldRemoveCorners()
            boolean r1 = r3.expandedCornersRemoved
            if (r1 == r4) goto L5c
            com.google.android.material.shape.MaterialShapeDrawable r1 = r3.materialShapeDrawable
            if (r1 != 0) goto L11
            goto L5c
        L11:
            r3.expandedCornersRemoved = r4
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r5 == 0) goto L41
            android.animation.ValueAnimator r5 = r3.interpolatorAnimator
            if (r5 == 0) goto L41
            boolean r5 = r5.isRunning()
            if (r5 == 0) goto L28
            android.animation.ValueAnimator r4 = r3.interpolatorAnimator
            r4.reverse()
            goto L5c
        L28:
            if (r4 == 0) goto L2b
            goto L2d
        L2b:
            r1 = 1065353216(0x3f800000, float:1.0)
        L2d:
            float r2 = r2 - r1
            android.animation.ValueAnimator r4 = r3.interpolatorAnimator
            float[] r5 = new float[r0]
            r0 = 0
            r5[r0] = r2
            r0 = 1
            r5[r0] = r1
            r4.setFloatValues(r5)
            android.animation.ValueAnimator r4 = r3.interpolatorAnimator
            r4.start()
            goto L5c
        L41:
            android.animation.ValueAnimator r4 = r3.interpolatorAnimator
            if (r4 == 0) goto L50
            boolean r4 = r4.isRunning()
            if (r4 == 0) goto L50
            android.animation.ValueAnimator r4 = r3.interpolatorAnimator
            r4.cancel()
        L50:
            com.google.android.material.shape.MaterialShapeDrawable r4 = r3.materialShapeDrawable
            boolean r5 = r3.expandedCornersRemoved
            if (r5 == 0) goto L57
            goto L59
        L57:
            r1 = 1065353216(0x3f800000, float:1.0)
        L59:
            r4.setInterpolation(r1)
        L5c:
            return
    }

    private void updateImportantForAccessibility(boolean r7) {
            r6 = this;
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r6.viewRef
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            if (r1 != 0) goto L14
            return
        L14:
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            int r1 = r0.getChildCount()
            if (r7 == 0) goto L29
            java.util.Map<android.view.View, java.lang.Integer> r2 = r6.importantForAccessibilityMap
            if (r2 != 0) goto L28
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>(r1)
            r6.importantForAccessibilityMap = r2
            goto L29
        L28:
            return
        L29:
            r2 = 0
        L2a:
            if (r2 >= r1) goto L71
            android.view.View r3 = r0.getChildAt(r2)
            java.lang.ref.WeakReference<V extends android.view.View> r4 = r6.viewRef
            java.lang.Object r4 = r4.get()
            if (r3 != r4) goto L39
            goto L6e
        L39:
            if (r7 == 0) goto L51
            java.util.Map<android.view.View, java.lang.Integer> r4 = r6.importantForAccessibilityMap
            int r5 = r3.getImportantForAccessibility()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.put(r3, r5)
            boolean r4 = r6.updateImportantForAccessibilityOnSiblings
            if (r4 == 0) goto L6e
            r4 = 4
            androidx.core.view.ViewCompat.setImportantForAccessibility(r3, r4)
            goto L6e
        L51:
            boolean r4 = r6.updateImportantForAccessibilityOnSiblings
            if (r4 == 0) goto L6e
            java.util.Map<android.view.View, java.lang.Integer> r4 = r6.importantForAccessibilityMap
            if (r4 == 0) goto L6e
            boolean r4 = r4.containsKey(r3)
            if (r4 == 0) goto L6e
            java.util.Map<android.view.View, java.lang.Integer> r4 = r6.importantForAccessibilityMap
            java.lang.Object r4 = r4.get(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            androidx.core.view.ViewCompat.setImportantForAccessibility(r3, r4)
        L6e:
            int r2 = r2 + 1
            goto L2a
        L71:
            if (r7 != 0) goto L77
            r7 = 0
            r6.importantForAccessibilityMap = r7
            goto L88
        L77:
            boolean r7 = r6.updateImportantForAccessibilityOnSiblings
            if (r7 == 0) goto L88
            java.lang.ref.WeakReference<V extends android.view.View> r7 = r6.viewRef
            java.lang.Object r7 = r7.get()
            android.view.View r7 = (android.view.View) r7
            r0 = 8
            r7.sendAccessibilityEvent(r0)
        L88:
            return
    }

    private void updatePeekHeight(boolean r3) {
            r2 = this;
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r2.viewRef
            if (r0 == 0) goto L1f
            r2.calculateCollapsedOffset()
            int r0 = r2.state
            r1 = 4
            if (r0 != r1) goto L1f
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r2.viewRef
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L1f
            if (r3 == 0) goto L1c
            r2.setState(r1)
            goto L1f
        L1c:
            r0.requestLayout()
        L1f:
            return
    }

    public void addBottomSheetCallback(@androidx.annotation.NonNull com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback r2) {
            r1 = this;
            java.util.ArrayList<com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback> r0 = r1.callbacks
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto Ld
            java.util.ArrayList<com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback> r0 = r1.callbacks
            r0.add(r2)
        Ld:
            return
    }

    public float calculateSlideOffset() {
            r1 = this;
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r1.viewRef
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto Lb
            goto L1c
        Lb:
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r1.viewRef
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            int r0 = r0.getTop()
            float r0 = r1.calculateSlideOffsetWithTop(r0)
            return r0
        L1c:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    @androidx.annotation.VisibleForTesting
    public void disableShapeAnimations() {
            r1 = this;
            r0 = 0
            r1.interpolatorAnimator = r0
            return
    }

    public final void dispatchOnSlide(int r4) {
            r3 = this;
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r3.viewRef
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L2d
            java.util.ArrayList<com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback> r1 = r3.callbacks
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L2d
            float r4 = r3.calculateSlideOffsetWithTop(r4)
            r1 = 0
        L17:
            java.util.ArrayList<com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback> r2 = r3.callbacks
            int r2 = r2.size()
            if (r1 >= r2) goto L2d
            java.util.ArrayList<com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback> r2 = r3.callbacks
            java.lang.Object r2 = r2.get(r1)
            com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback r2 = (com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback) r2
            r2.onSlide(r0, r4)
            int r1 = r1 + 1
            goto L17
        L2d:
            return
    }

    @androidx.annotation.Nullable
    @androidx.annotation.VisibleForTesting
    public final android.view.View findScrollingChild(android.view.View r5) {
            r4 = this;
            int r0 = r5.getVisibility()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = androidx.core.view.ViewCompat.isNestedScrollingEnabled(r5)
            if (r0 == 0) goto Lf
            return r5
        Lf:
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 == 0) goto L2a
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r0 = 0
            int r2 = r5.getChildCount()
        L1a:
            if (r0 >= r2) goto L2a
            android.view.View r3 = r5.getChildAt(r0)
            android.view.View r3 = r4.findScrollingChild(r3)
            if (r3 == 0) goto L27
            return r3
        L27:
            int r0 = r0 + 1
            goto L1a
        L2a:
            return r1
    }

    public int getExpandedOffset() {
            r2 = this;
            boolean r0 = r2.fitToContents
            if (r0 == 0) goto L7
            int r0 = r2.fitToContentsOffset
            goto L15
        L7:
            int r0 = r2.expandedOffset
            boolean r1 = r2.paddingTopSystemWindowInsets
            if (r1 == 0) goto Lf
            r1 = 0
            goto L11
        Lf:
            int r1 = r2.insetTop
        L11:
            int r0 = java.lang.Math.max(r0, r1)
        L15:
            return r0
    }

    @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d)
    public float getHalfExpandedRatio() {
            r1 = this;
            float r0 = r1.halfExpandedRatio
            return r0
    }

    public float getHideFriction() {
            r1 = this;
            float r0 = r1.hideFriction
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public int getLastStableState() {
            r1 = this;
            int r0 = r1.lastStableState
            return r0
    }

    public final com.google.android.material.shape.MaterialShapeDrawable getMaterialShapeDrawable() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.materialShapeDrawable
            return r0
    }

    @androidx.annotation.Px
    public int getMaxHeight() {
            r1 = this;
            int r0 = r1.maxHeight
            return r0
    }

    @androidx.annotation.Px
    public int getMaxWidth() {
            r1 = this;
            int r0 = r1.maxWidth
            return r0
    }

    public int getPeekHeight() {
            r1 = this;
            boolean r0 = r1.peekHeightAuto
            if (r0 == 0) goto L6
            r0 = -1
            goto L8
        L6:
            int r0 = r1.peekHeight
        L8:
            return r0
    }

    public int getSaveFlags() {
            r1 = this;
            int r0 = r1.saveFlags
            return r0
    }

    public int getSignificantVelocityThreshold() {
            r1 = this;
            int r0 = r1.significantVelocityThreshold
            return r0
    }

    public boolean getSkipCollapsed() {
            r1 = this;
            boolean r0 = r1.skipCollapsed
            return r0
    }

    public int getState() {
            r1 = this;
            int r0 = r1.state
            return r0
    }

    public boolean isDraggable() {
            r1 = this;
            boolean r0 = r1.draggable
            return r0
    }

    public boolean isFitToContents() {
            r1 = this;
            boolean r0 = r1.fitToContents
            return r0
    }

    public boolean isGestureInsetBottomIgnored() {
            r1 = this;
            boolean r0 = r1.gestureInsetBottomIgnored
            return r0
    }

    public boolean isHideable() {
            r1 = this;
            boolean r0 = r1.hideable
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isHideableWhenDragging() {
            r1 = this;
            r0 = 1
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isNestedScrollingCheckEnabled() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onAttachedToLayoutParams(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams r1) {
            r0 = this;
            super.onAttachedToLayoutParams(r1)
            r1 = 0
            r0.viewRef = r1
            r0.viewDragHelper = r1
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onDetachedFromLayoutParams() {
            r1 = this;
            super.onDetachedFromLayoutParams()
            r0 = 0
            r1.viewRef = r0
            r1.viewDragHelper = r0
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r10, @androidx.annotation.NonNull V r11, @androidx.annotation.NonNull android.view.MotionEvent r12) {
            r9 = this;
            boolean r0 = r11.isShown()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Ld2
            boolean r0 = r9.draggable
            if (r0 != 0) goto Le
            goto Ld2
        Le:
            int r0 = r12.getActionMasked()
            if (r0 != 0) goto L17
            r9.reset()
        L17:
            android.view.VelocityTracker r3 = r9.velocityTracker
            if (r3 != 0) goto L21
            android.view.VelocityTracker r3 = android.view.VelocityTracker.obtain()
            r9.velocityTracker = r3
        L21:
            android.view.VelocityTracker r3 = r9.velocityTracker
            r3.addMovement(r12)
            r3 = 0
            r4 = -1
            r5 = 2
            if (r0 == 0) goto L3c
            if (r0 == r2) goto L31
            r11 = 3
            if (r0 == r11) goto L31
            goto L7f
        L31:
            r9.touchingScrollingChild = r1
            r9.activePointerId = r4
            boolean r11 = r9.ignoreEvents
            if (r11 == 0) goto L7f
            r9.ignoreEvents = r1
            return r1
        L3c:
            float r6 = r12.getX()
            int r6 = (int) r6
            float r7 = r12.getY()
            int r7 = (int) r7
            r9.initialY = r7
            int r7 = r9.state
            if (r7 == r5) goto L6e
            java.lang.ref.WeakReference<android.view.View> r7 = r9.nestedScrollingChildRef
            if (r7 == 0) goto L57
            java.lang.Object r7 = r7.get()
            android.view.View r7 = (android.view.View) r7
            goto L58
        L57:
            r7 = r3
        L58:
            if (r7 == 0) goto L6e
            int r8 = r9.initialY
            boolean r7 = r10.isPointInChildBounds(r7, r6, r8)
            if (r7 == 0) goto L6e
            int r7 = r12.getActionIndex()
            int r7 = r12.getPointerId(r7)
            r9.activePointerId = r7
            r9.touchingScrollingChild = r2
        L6e:
            int r7 = r9.activePointerId
            if (r7 != r4) goto L7c
            int r4 = r9.initialY
            boolean r11 = r10.isPointInChildBounds(r11, r6, r4)
            if (r11 != 0) goto L7c
            r11 = 1
            goto L7d
        L7c:
            r11 = 0
        L7d:
            r9.ignoreEvents = r11
        L7f:
            boolean r11 = r9.ignoreEvents
            if (r11 != 0) goto L8e
            androidx.customview.widget.ViewDragHelper r11 = r9.viewDragHelper
            if (r11 == 0) goto L8e
            boolean r11 = r11.shouldInterceptTouchEvent(r12)
            if (r11 == 0) goto L8e
            return r2
        L8e:
            java.lang.ref.WeakReference<android.view.View> r11 = r9.nestedScrollingChildRef
            if (r11 == 0) goto L99
            java.lang.Object r11 = r11.get()
            r3 = r11
            android.view.View r3 = (android.view.View) r3
        L99:
            if (r0 != r5) goto Ld1
            if (r3 == 0) goto Ld1
            boolean r11 = r9.ignoreEvents
            if (r11 != 0) goto Ld1
            int r11 = r9.state
            if (r11 == r2) goto Ld1
            float r11 = r12.getX()
            int r11 = (int) r11
            float r0 = r12.getY()
            int r0 = (int) r0
            boolean r10 = r10.isPointInChildBounds(r3, r11, r0)
            if (r10 != 0) goto Ld1
            androidx.customview.widget.ViewDragHelper r10 = r9.viewDragHelper
            if (r10 == 0) goto Ld1
            int r10 = r9.initialY
            float r10 = (float) r10
            float r11 = r12.getY()
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)
            androidx.customview.widget.ViewDragHelper r11 = r9.viewDragHelper
            int r11 = r11.getTouchSlop()
            float r11 = (float) r11
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto Ld1
            r1 = 1
        Ld1:
            return r1
        Ld2:
            r9.ignoreEvents = r2
            return r1
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r5, @androidx.annotation.NonNull V r6, int r7) {
            r4 = this;
            boolean r0 = androidx.core.view.ViewCompat.getFitsSystemWindows(r5)
            r1 = 1
            if (r0 == 0) goto L10
            boolean r0 = androidx.core.view.ViewCompat.getFitsSystemWindows(r6)
            if (r0 != 0) goto L10
            r6.setFitsSystemWindows(r1)
        L10:
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r4.viewRef
            if (r0 != 0) goto L56
            android.content.res.Resources r0 = r5.getResources()
            int r2 = com.google.android.material.R.dimen.design_bottom_sheet_peek_height_min
            int r0 = r0.getDimensionPixelSize(r2)
            r4.peekHeightMin = r0
            r4.setWindowInsetsListener(r6)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r6)
            r4.viewRef = r0
            com.google.android.material.shape.MaterialShapeDrawable r0 = r4.materialShapeDrawable
            if (r0 == 0) goto L43
            androidx.core.view.ViewCompat.setBackground(r6, r0)
            com.google.android.material.shape.MaterialShapeDrawable r0 = r4.materialShapeDrawable
            float r2 = r4.elevation
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 != 0) goto L3f
            float r2 = androidx.core.view.ViewCompat.getElevation(r6)
        L3f:
            r0.setElevation(r2)
            goto L4a
        L43:
            android.content.res.ColorStateList r0 = r4.backgroundTint
            if (r0 == 0) goto L4a
            androidx.core.view.ViewCompat.setBackgroundTintList(r6, r0)
        L4a:
            r4.updateAccessibilityActions()
            int r0 = androidx.core.view.ViewCompat.getImportantForAccessibility(r6)
            if (r0 != 0) goto L56
            androidx.core.view.ViewCompat.setImportantForAccessibility(r6, r1)
        L56:
            androidx.customview.widget.ViewDragHelper r0 = r4.viewDragHelper
            if (r0 != 0) goto L62
            androidx.customview.widget.ViewDragHelper$Callback r0 = r4.dragCallback
            androidx.customview.widget.ViewDragHelper r0 = androidx.customview.widget.ViewDragHelper.create(r5, r0)
            r4.viewDragHelper = r0
        L62:
            int r0 = r6.getTop()
            r5.onLayoutChild(r6, r7)
            int r7 = r5.getWidth()
            r4.parentWidth = r7
            int r5 = r5.getHeight()
            r4.parentHeight = r5
            int r5 = r6.getHeight()
            r4.childHeight = r5
            int r7 = r4.parentHeight
            int r5 = r7 - r5
            int r2 = r4.insetTop
            if (r5 >= r2) goto L8e
            boolean r5 = r4.paddingTopSystemWindowInsets
            if (r5 == 0) goto L8a
            r4.childHeight = r7
            goto L8e
        L8a:
            int r5 = r7 - r2
            r4.childHeight = r5
        L8e:
            int r5 = r4.childHeight
            int r7 = r7 - r5
            r5 = 0
            int r7 = java.lang.Math.max(r5, r7)
            r4.fitToContentsOffset = r7
            r4.calculateHalfExpandedOffset()
            r4.calculateCollapsedOffset()
            int r7 = r4.state
            r2 = 3
            if (r7 != r2) goto Lab
            int r7 = r4.getExpandedOffset()
            androidx.core.view.ViewCompat.offsetTopAndBottom(r6, r7)
            goto Ld7
        Lab:
            r2 = 6
            if (r7 != r2) goto Lb4
            int r7 = r4.halfExpandedOffset
            androidx.core.view.ViewCompat.offsetTopAndBottom(r6, r7)
            goto Ld7
        Lb4:
            boolean r2 = r4.hideable
            if (r2 == 0) goto Lc1
            r2 = 5
            if (r7 != r2) goto Lc1
            int r7 = r4.parentHeight
            androidx.core.view.ViewCompat.offsetTopAndBottom(r6, r7)
            goto Ld7
        Lc1:
            r2 = 4
            if (r7 != r2) goto Lca
            int r7 = r4.collapsedOffset
            androidx.core.view.ViewCompat.offsetTopAndBottom(r6, r7)
            goto Ld7
        Lca:
            if (r7 == r1) goto Lcf
            r2 = 2
            if (r7 != r2) goto Ld7
        Lcf:
            int r7 = r6.getTop()
            int r0 = r0 - r7
            androidx.core.view.ViewCompat.offsetTopAndBottom(r6, r0)
        Ld7:
            int r7 = r4.state
            r4.updateDrawableForTargetState(r7, r5)
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference
            android.view.View r0 = r4.findScrollingChild(r6)
            r7.<init>(r0)
            r4.nestedScrollingChildRef = r7
        Le7:
            java.util.ArrayList<com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback> r7 = r4.callbacks
            int r7 = r7.size()
            if (r5 >= r7) goto Lfd
            java.util.ArrayList<com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback> r7 = r4.callbacks
            java.lang.Object r7 = r7.get(r5)
            com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback r7 = (com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback) r7
            r7.onLayout(r6)
            int r5 = r5 + 1
            goto Le7
        Lfd:
            return r1
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r4, @androidx.annotation.NonNull V r5, int r6, int r7, int r8, int r9) {
            r3 = this;
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r4.getPaddingLeft()
            int r2 = r4.getPaddingRight()
            int r2 = r2 + r1
            int r1 = r0.leftMargin
            int r2 = r2 + r1
            int r1 = r0.rightMargin
            int r2 = r2 + r1
            int r2 = r2 + r7
            int r7 = r3.maxWidth
            int r1 = r0.width
            int r6 = r3.getChildMeasureSpec(r6, r2, r7, r1)
            int r7 = r4.getPaddingTop()
            int r4 = r4.getPaddingBottom()
            int r4 = r4 + r7
            int r7 = r0.topMargin
            int r4 = r4 + r7
            int r7 = r0.bottomMargin
            int r4 = r4 + r7
            int r4 = r4 + r9
            int r7 = r3.maxHeight
            int r9 = r0.height
            int r4 = r3.getChildMeasureSpec(r8, r4, r7, r9)
            r5.measure(r6, r4)
            r4 = 1
            return r4
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onNestedPreFling(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r4, @androidx.annotation.NonNull V r5, @androidx.annotation.NonNull android.view.View r6, float r7, float r8) {
            r3 = this;
            boolean r0 = r3.isNestedScrollingCheckEnabled()
            r1 = 0
            if (r0 == 0) goto L1d
            java.lang.ref.WeakReference<android.view.View> r0 = r3.nestedScrollingChildRef
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r0.get()
            if (r6 != r0) goto L1d
            int r0 = r3.state
            r2 = 3
            if (r0 != r2) goto L1c
            boolean r4 = super.onNestedPreFling(r4, r5, r6, r7, r8)
            if (r4 == 0) goto L1d
        L1c:
            r1 = 1
        L1d:
            return r1
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r2, @androidx.annotation.NonNull V r3, @androidx.annotation.NonNull android.view.View r4, int r5, int r6, @androidx.annotation.NonNull int[] r7, int r8) {
            r1 = this;
            r2 = 1
            if (r8 != r2) goto L4
            return
        L4:
            java.lang.ref.WeakReference<android.view.View> r5 = r1.nestedScrollingChildRef
            if (r5 == 0) goto Lf
            java.lang.Object r5 = r5.get()
            android.view.View r5 = (android.view.View) r5
            goto L10
        Lf:
            r5 = 0
        L10:
            boolean r8 = r1.isNestedScrollingCheckEnabled()
            if (r8 == 0) goto L19
            if (r4 == r5) goto L19
            return
        L19:
            int r5 = r3.getTop()
            int r8 = r5 - r6
            if (r6 <= 0) goto L48
            int r4 = r1.getExpandedOffset()
            if (r8 >= r4) goto L39
            int r4 = r1.getExpandedOffset()
            int r5 = r5 - r4
            r7[r2] = r5
            r4 = r7[r2]
            int r4 = -r4
            androidx.core.view.ViewCompat.offsetTopAndBottom(r3, r4)
            r4 = 3
            r1.setStateInternal(r4)
            goto L7a
        L39:
            boolean r4 = r1.draggable
            if (r4 != 0) goto L3e
            return
        L3e:
            r7[r2] = r6
            int r4 = -r6
            androidx.core.view.ViewCompat.offsetTopAndBottom(r3, r4)
            r1.setStateInternal(r2)
            goto L7a
        L48:
            if (r6 >= 0) goto L7a
            r0 = -1
            boolean r4 = r4.canScrollVertically(r0)
            if (r4 != 0) goto L7a
            int r4 = r1.collapsedOffset
            if (r8 <= r4) goto L6c
            boolean r4 = r1.canBeHiddenByDragging()
            if (r4 == 0) goto L5c
            goto L6c
        L5c:
            int r4 = r1.collapsedOffset
            int r5 = r5 - r4
            r7[r2] = r5
            r4 = r7[r2]
            int r4 = -r4
            androidx.core.view.ViewCompat.offsetTopAndBottom(r3, r4)
            r4 = 4
            r1.setStateInternal(r4)
            goto L7a
        L6c:
            boolean r4 = r1.draggable
            if (r4 != 0) goto L71
            return
        L71:
            r7[r2] = r6
            int r4 = -r6
            androidx.core.view.ViewCompat.offsetTopAndBottom(r3, r4)
            r1.setStateInternal(r2)
        L7a:
            int r3 = r3.getTop()
            r1.dispatchOnSlide(r3)
            r1.lastNestedScrollDy = r6
            r1.nestedScrolled = r2
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2, @androidx.annotation.NonNull android.view.View r3, int r4, int r5, int r6, int r7, int r8, @androidx.annotation.NonNull int[] r9) {
            r0 = this;
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onRestoreInstanceState(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r2, @androidx.annotation.NonNull V r3, @androidx.annotation.NonNull android.os.Parcelable r4) {
            r1 = this;
            com.google.android.material.bottomsheet.BottomSheetBehavior$SavedState r4 = (com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState) r4
            android.os.Parcelable r0 = r4.getSuperState()
            super.onRestoreInstanceState(r2, r3, r0)
            r1.restoreOptionalState(r4)
            int r2 = r4.state
            r3 = 1
            if (r2 == r3) goto L1a
            r3 = 2
            if (r2 != r3) goto L15
            goto L1a
        L15:
            r1.state = r2
            r1.lastStableState = r2
            goto L1f
        L1a:
            r2 = 4
            r1.state = r2
            r1.lastStableState = r2
        L1f:
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @androidx.annotation.NonNull
    public android.os.Parcelable onSaveInstanceState(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r2, @androidx.annotation.NonNull V r3) {
            r1 = this;
            com.google.android.material.bottomsheet.BottomSheetBehavior$SavedState r0 = new com.google.android.material.bottomsheet.BottomSheetBehavior$SavedState
            android.os.Parcelable r2 = super.onSaveInstanceState(r2, r3)
            r0.<init>(r2, r1)
            return r0
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2, @androidx.annotation.NonNull android.view.View r3, @androidx.annotation.NonNull android.view.View r4, int r5, int r6) {
            r0 = this;
            r1 = 0
            r0.lastNestedScrollDy = r1
            r0.nestedScrolled = r1
            r2 = r5 & 2
            if (r2 == 0) goto La
            r1 = 1
        La:
            return r1
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onStopNestedScroll(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r3, @androidx.annotation.NonNull V r4, @androidx.annotation.NonNull android.view.View r5, int r6) {
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.getExpandedOffset()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.setStateInternal(r0)
            return
        Lf:
            boolean r3 = r2.isNestedScrollingCheckEnabled()
            if (r3 == 0) goto L24
            java.lang.ref.WeakReference<android.view.View> r3 = r2.nestedScrollingChildRef
            if (r3 == 0) goto L23
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L23
            boolean r3 = r2.nestedScrolled
            if (r3 != 0) goto L24
        L23:
            return
        L24:
            int r3 = r2.lastNestedScrollDy
            r5 = 6
            r6 = 4
            if (r3 <= 0) goto L3a
            boolean r3 = r2.fitToContents
            if (r3 == 0) goto L30
            goto Laa
        L30:
            int r3 = r4.getTop()
            int r6 = r2.halfExpandedOffset
            if (r3 <= r6) goto Laa
            goto La9
        L3a:
            boolean r3 = r2.hideable
            if (r3 == 0) goto L4a
            float r3 = r2.getYVelocity()
            boolean r3 = r2.shouldHide(r4, r3)
            if (r3 == 0) goto L4a
            r0 = 5
            goto Laa
        L4a:
            int r3 = r2.lastNestedScrollDy
            if (r3 != 0) goto L8e
            int r3 = r4.getTop()
            boolean r1 = r2.fitToContents
            if (r1 == 0) goto L68
            int r5 = r2.fitToContentsOffset
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.collapsedOffset
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L92
            goto Laa
        L68:
            int r1 = r2.halfExpandedOffset
            if (r3 >= r1) goto L7e
            int r1 = r2.collapsedOffset
            int r1 = r3 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r3 >= r1) goto L77
            goto Laa
        L77:
            boolean r3 = r2.shouldSkipHalfExpandedStateWhenDragging()
            if (r3 == 0) goto La9
            goto L92
        L7e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.collapsedOffset
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
            goto La9
        L8e:
            boolean r3 = r2.fitToContents
            if (r3 == 0) goto L94
        L92:
            r0 = 4
            goto Laa
        L94:
            int r3 = r4.getTop()
            int r0 = r2.halfExpandedOffset
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.collapsedOffset
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
        La9:
            r0 = 6
        Laa:
            r3 = 0
            r2.startSettling(r4, r0, r3)
            r2.nestedScrolled = r3
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r3, @androidx.annotation.NonNull V r4, @androidx.annotation.NonNull android.view.MotionEvent r5) {
            r2 = this;
            boolean r3 = r4.isShown()
            if (r3 != 0) goto L8
            r3 = 0
            return r3
        L8:
            int r3 = r5.getActionMasked()
            int r0 = r2.state
            r1 = 1
            if (r0 != r1) goto L14
            if (r3 != 0) goto L14
            return r1
        L14:
            boolean r0 = r2.shouldHandleDraggingWithHelper()
            if (r0 == 0) goto L1f
            androidx.customview.widget.ViewDragHelper r0 = r2.viewDragHelper
            r0.processTouchEvent(r5)
        L1f:
            if (r3 != 0) goto L24
            r2.reset()
        L24:
            android.view.VelocityTracker r0 = r2.velocityTracker
            if (r0 != 0) goto L2e
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r2.velocityTracker = r0
        L2e:
            android.view.VelocityTracker r0 = r2.velocityTracker
            r0.addMovement(r5)
            boolean r0 = r2.shouldHandleDraggingWithHelper()
            if (r0 == 0) goto L64
            r0 = 2
            if (r3 != r0) goto L64
            boolean r3 = r2.ignoreEvents
            if (r3 != 0) goto L64
            int r3 = r2.initialY
            float r3 = (float) r3
            float r0 = r5.getY()
            float r3 = r3 - r0
            float r3 = java.lang.Math.abs(r3)
            androidx.customview.widget.ViewDragHelper r0 = r2.viewDragHelper
            int r0 = r0.getTouchSlop()
            float r0 = (float) r0
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L64
            androidx.customview.widget.ViewDragHelper r3 = r2.viewDragHelper
            int r0 = r5.getActionIndex()
            int r5 = r5.getPointerId(r0)
            r3.captureChildView(r4, r5)
        L64:
            boolean r3 = r2.ignoreEvents
            r3 = r3 ^ r1
            return r3
    }

    public void removeBottomSheetCallback(@androidx.annotation.NonNull com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback r2) {
            r1 = this;
            java.util.ArrayList<com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback> r0 = r1.callbacks
            r0.remove(r2)
            return
    }

    public final void setAccessibilityDelegateView(@androidx.annotation.Nullable android.view.View r3) {
            r2 = this;
            r0 = 1
            if (r3 != 0) goto L14
            java.lang.ref.WeakReference<android.view.View> r1 = r2.accessibilityDelegateViewRef
            if (r1 == 0) goto L14
            java.lang.Object r3 = r1.get()
            android.view.View r3 = (android.view.View) r3
            r2.clearAccessibilityAction(r3, r0)
            r3 = 0
            r2.accessibilityDelegateViewRef = r3
            return
        L14:
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r3)
            r2.accessibilityDelegateViewRef = r1
            r2.updateAccessibilityActions(r3, r0)
            return
    }

    @java.lang.Deprecated
    public void setBottomSheetCallback(com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback r3) {
            r2 = this;
            java.lang.String r0 = "BottomSheetBehavior"
            java.lang.String r1 = "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks."
            android.util.Log.w(r0, r1)
            java.util.ArrayList<com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback> r0 = r2.callbacks
            r0.clear()
            if (r3 == 0) goto L13
            java.util.ArrayList<com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback> r0 = r2.callbacks
            r0.add(r3)
        L13:
            return
    }

    public void setDraggable(boolean r1) {
            r0 = this;
            r0.draggable = r1
            return
    }

    public void setExpandedOffset(int r2) {
            r1 = this;
            if (r2 < 0) goto Lb
            r1.expandedOffset = r2
            int r2 = r1.state
            r0 = 1
            r1.updateDrawableForTargetState(r2, r0)
            return
        Lb:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "offset must be greater than or equal to 0"
            r2.<init>(r0)
            throw r2
    }

    public void setFitToContents(boolean r2) {
            r1 = this;
            boolean r0 = r1.fitToContents
            if (r0 != r2) goto L5
            return
        L5:
            r1.fitToContents = r2
            java.lang.ref.WeakReference<V extends android.view.View> r2 = r1.viewRef
            if (r2 == 0) goto Le
            r1.calculateCollapsedOffset()
        Le:
            boolean r2 = r1.fitToContents
            if (r2 == 0) goto L19
            int r2 = r1.state
            r0 = 6
            if (r2 != r0) goto L19
            r2 = 3
            goto L1b
        L19:
            int r2 = r1.state
        L1b:
            r1.setStateInternal(r2)
            int r2 = r1.state
            r0 = 1
            r1.updateDrawableForTargetState(r2, r0)
            r1.updateAccessibilityActions()
            return
    }

    public void setGestureInsetBottomIgnored(boolean r1) {
            r0 = this;
            r0.gestureInsetBottomIgnored = r1
            return
    }

    public void setHalfExpandedRatio(@androidx.annotation.FloatRange(from = 0.0d, fromInclusive = false, to = 1.0d, toInclusive = false) float r2) {
            r1 = this;
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L15
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L15
            r1.halfExpandedRatio = r2
            java.lang.ref.WeakReference<V extends android.view.View> r2 = r1.viewRef
            if (r2 == 0) goto L14
            r1.calculateHalfExpandedOffset()
        L14:
            return
        L15:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "ratio must be a float value between 0 and 1"
            r2.<init>(r0)
            throw r2
    }

    public void setHideFriction(float r1) {
            r0 = this;
            r0.hideFriction = r1
            return
    }

    public void setHideable(boolean r2) {
            r1 = this;
            boolean r0 = r1.hideable
            if (r0 == r2) goto L14
            r1.hideable = r2
            if (r2 != 0) goto L11
            int r2 = r1.state
            r0 = 5
            if (r2 != r0) goto L11
            r2 = 4
            r1.setState(r2)
        L11:
            r1.updateAccessibilityActions()
        L14:
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void setHideableInternal(boolean r1) {
            r0 = this;
            r0.hideable = r1
            return
    }

    public void setMaxHeight(@androidx.annotation.Px int r1) {
            r0 = this;
            r0.maxHeight = r1
            return
    }

    public void setMaxWidth(@androidx.annotation.Px int r1) {
            r0 = this;
            r0.maxWidth = r1
            return
    }

    public void setPeekHeight(int r2) {
            r1 = this;
            r0 = 0
            r1.setPeekHeight(r2, r0)
            return
    }

    public final void setPeekHeight(int r4, boolean r5) {
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto Lc
            boolean r4 = r3.peekHeightAuto
            if (r4 != 0) goto L15
            r3.peekHeightAuto = r0
            goto L1f
        Lc:
            boolean r2 = r3.peekHeightAuto
            if (r2 != 0) goto L17
            int r2 = r3.peekHeight
            if (r2 == r4) goto L15
            goto L17
        L15:
            r0 = 0
            goto L1f
        L17:
            r3.peekHeightAuto = r1
            int r4 = java.lang.Math.max(r1, r4)
            r3.peekHeight = r4
        L1f:
            if (r0 == 0) goto L24
            r3.updatePeekHeight(r5)
        L24:
            return
    }

    public void setSaveFlags(int r1) {
            r0 = this;
            r0.saveFlags = r1
            return
    }

    public void setSignificantVelocityThreshold(int r1) {
            r0 = this;
            r0.significantVelocityThreshold = r1
            return
    }

    public void setSkipCollapsed(boolean r1) {
            r0 = this;
            r0.skipCollapsed = r1
            return
    }

    public void setState(int r4) {
            r3 = this;
            r0 = 1
            if (r4 == r0) goto L57
            r1 = 2
            if (r4 != r1) goto L7
            goto L57
        L7:
            boolean r0 = r3.hideable
            if (r0 != 0) goto L25
            r0 = 5
            if (r4 != r0) goto L25
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot set state: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "BottomSheetBehavior"
            android.util.Log.w(r0, r4)
            return
        L25:
            r0 = 6
            if (r4 != r0) goto L36
            boolean r0 = r3.fitToContents
            if (r0 == 0) goto L36
            int r0 = r3.getTopOffsetForState(r4)
            int r1 = r3.fitToContentsOffset
            if (r0 > r1) goto L36
            r0 = 3
            goto L37
        L36:
            r0 = r4
        L37:
            java.lang.ref.WeakReference<V extends android.view.View> r1 = r3.viewRef
            if (r1 == 0) goto L53
            java.lang.Object r1 = r1.get()
            if (r1 != 0) goto L42
            goto L53
        L42:
            java.lang.ref.WeakReference<V extends android.view.View> r4 = r3.viewRef
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            com.google.android.material.bottomsheet.BottomSheetBehavior$1 r1 = new com.google.android.material.bottomsheet.BottomSheetBehavior$1
            r1.<init>(r3, r4, r0)
            r3.runAfterLayout(r4, r1)
            goto L56
        L53:
            r3.setStateInternal(r4)
        L56:
            return
        L57:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "STATE_"
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            if (r4 != r0) goto L64
            java.lang.String r4 = "DRAGGING"
            goto L66
        L64:
            java.lang.String r4 = "SETTLING"
        L66:
            java.lang.String r0 = " should not be set externally."
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r4, r0)
            r1.<init>(r4)
            throw r1
    }

    public final void setStateInternal(int r8) {
            r7 = this;
            int r0 = r7.state
            if (r0 != r8) goto L5
            return
        L5:
            r7.state = r8
            r0 = 5
            r1 = 6
            r2 = 3
            r3 = 4
            if (r8 == r3) goto L17
            if (r8 == r2) goto L17
            if (r8 == r1) goto L17
            boolean r4 = r7.hideable
            if (r4 == 0) goto L19
            if (r8 != r0) goto L19
        L17:
            r7.lastStableState = r8
        L19:
            java.lang.ref.WeakReference<V extends android.view.View> r4 = r7.viewRef
            if (r4 != 0) goto L1e
            return
        L1e:
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 != 0) goto L27
            return
        L27:
            r5 = 0
            r6 = 1
            if (r8 != r2) goto L2f
            r7.updateImportantForAccessibility(r6)
            goto L38
        L2f:
            if (r8 == r1) goto L35
            if (r8 == r0) goto L35
            if (r8 != r3) goto L38
        L35:
            r7.updateImportantForAccessibility(r5)
        L38:
            r7.updateDrawableForTargetState(r8, r6)
        L3b:
            java.util.ArrayList<com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback> r0 = r7.callbacks
            int r0 = r0.size()
            if (r5 >= r0) goto L51
            java.util.ArrayList<com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback> r0 = r7.callbacks
            java.lang.Object r0 = r0.get(r5)
            com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback r0 = (com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback) r0
            r0.onStateChanged(r4, r8)
            int r5 = r5 + 1
            goto L3b
        L51:
            r7.updateAccessibilityActions()
            return
    }

    public void setUpdateImportantForAccessibilityOnSiblings(boolean r1) {
            r0 = this;
            r0.updateImportantForAccessibilityOnSiblings = r1
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public boolean shouldExpandOnUpwardDrag(long r1, @androidx.annotation.FloatRange(from = 0.0d, to = 100.0d) float r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    public final boolean shouldHide(@androidx.annotation.NonNull android.view.View r5, float r6) {
            r4 = this;
            boolean r0 = r4.skipCollapsed
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            boolean r0 = r4.isHideableWhenDragging()
            r2 = 0
            if (r0 != 0) goto Le
            return r2
        Le:
            int r0 = r5.getTop()
            int r3 = r4.collapsedOffset
            if (r0 >= r3) goto L17
            return r2
        L17:
            int r0 = r4.calculatePeekHeight()
            int r5 = r5.getTop()
            float r5 = (float) r5
            float r3 = r4.hideFriction
            float r6 = r6 * r3
            float r6 = r6 + r5
            int r5 = r4.collapsedOffset
            float r5 = (float) r5
            float r6 = r6 - r5
            float r5 = java.lang.Math.abs(r6)
            float r6 = (float) r0
            float r5 = r5 / r6
            r6 = 1056964608(0x3f000000, float:0.5)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L36
            goto L37
        L36:
            r1 = 0
        L37:
            return r1
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public boolean shouldSkipHalfExpandedStateWhenDragging() {
            r1 = this;
            r0 = 0
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public boolean shouldSkipSmoothAnimation() {
            r1 = this;
            r0 = 1
            return r0
    }
}
