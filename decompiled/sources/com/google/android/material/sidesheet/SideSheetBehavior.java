package com.google.android.material.sidesheet;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends android.view.View> extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<V> implements com.google.android.material.sidesheet.Sheet<com.google.android.material.sidesheet.SideSheetCallback> {
    private static final int DEFAULT_ACCESSIBILITY_PANE_TITLE = 0;
    private static final int DEF_STYLE_RES = 0;
    private static final float HIDE_FRICTION = 0.1f;
    private static final float HIDE_THRESHOLD = 0.5f;
    private static final int NO_MAX_SIZE = -1;

    @androidx.annotation.Nullable
    private android.content.res.ColorStateList backgroundTint;

    @androidx.annotation.NonNull
    private final java.util.Set<com.google.android.material.sidesheet.SideSheetCallback> callbacks;
    private int childWidth;

    @androidx.annotation.IdRes
    private int coplanarSiblingViewId;

    @androidx.annotation.Nullable
    private java.lang.ref.WeakReference<android.view.View> coplanarSiblingViewRef;
    private final androidx.customview.widget.ViewDragHelper.Callback dragCallback;
    private boolean draggable;
    private float elevation;
    private float hideFriction;
    private boolean ignoreEvents;
    private int initialX;
    private int lastStableState;

    @androidx.annotation.Nullable
    private com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable;
    private float maximumVelocity;
    private int parentWidth;
    private com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel;
    private com.google.android.material.sidesheet.SheetDelegate sheetDelegate;
    private int state;
    private final com.google.android.material.sidesheet.SideSheetBehavior<V>.StateSettlingTracker stateSettlingTracker;

    @androidx.annotation.Nullable
    private android.view.VelocityTracker velocityTracker;

    @androidx.annotation.Nullable
    private androidx.customview.widget.ViewDragHelper viewDragHelper;

    @androidx.annotation.Nullable
    private java.lang.ref.WeakReference<V> viewRef;


    /* JADX INFO: loaded from: classes2.dex */
    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<com.google.android.material.sidesheet.SideSheetBehavior.SavedState> CREATOR = null;
        public final int state;


        static {
                com.google.android.material.sidesheet.SideSheetBehavior$SavedState$1 r0 = new com.google.android.material.sidesheet.SideSheetBehavior$SavedState$1
                r0.<init>()
                com.google.android.material.sidesheet.SideSheetBehavior.SavedState.CREATOR = r0
                return
        }

        public SavedState(@androidx.annotation.NonNull android.os.Parcel r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        public SavedState(@androidx.annotation.NonNull android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                int r1 = r1.readInt()
                r0.state = r1
                return
        }

        public SavedState(android.os.Parcelable r1, @androidx.annotation.NonNull com.google.android.material.sidesheet.SideSheetBehavior<?> r2) {
                r0 = this;
                r0.<init>(r1)
                int r1 = com.google.android.material.sidesheet.SideSheetBehavior.access$000(r2)
                r0.state = r1
                return
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                int r2 = r0.state
                r1.writeInt(r2)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class StateSettlingTracker {
        private final java.lang.Runnable continueSettlingRunnable;
        private boolean isContinueSettlingRunnablePosted;
        private int targetState;
        public final /* synthetic */ com.google.android.material.sidesheet.SideSheetBehavior this$0;

        public static /* synthetic */ void $r8$lambda$cX4rrUBRviTi9l99dj1EmckVARg(com.google.android.material.sidesheet.SideSheetBehavior.StateSettlingTracker r0) {
                r0.lambda$new$0()
                return
        }

        public StateSettlingTracker(com.google.android.material.sidesheet.SideSheetBehavior r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                com.google.android.material.sidesheet.SideSheetBehavior$StateSettlingTracker$$ExternalSyntheticLambda0 r1 = new com.google.android.material.sidesheet.SideSheetBehavior$StateSettlingTracker$$ExternalSyntheticLambda0
                r1.<init>(r0)
                r0.continueSettlingRunnable = r1
                return
        }

        private /* synthetic */ void lambda$new$0() {
                r2 = this;
                r0 = 0
                r2.isContinueSettlingRunnablePosted = r0
                com.google.android.material.sidesheet.SideSheetBehavior r0 = r2.this$0
                androidx.customview.widget.ViewDragHelper r0 = com.google.android.material.sidesheet.SideSheetBehavior.access$700(r0)
                if (r0 == 0) goto L1e
                com.google.android.material.sidesheet.SideSheetBehavior r0 = r2.this$0
                androidx.customview.widget.ViewDragHelper r0 = com.google.android.material.sidesheet.SideSheetBehavior.access$700(r0)
                r1 = 1
                boolean r0 = r0.continueSettling(r1)
                if (r0 == 0) goto L1e
                int r0 = r2.targetState
                r2.continueSettlingToState(r0)
                goto L2e
            L1e:
                com.google.android.material.sidesheet.SideSheetBehavior r0 = r2.this$0
                int r0 = com.google.android.material.sidesheet.SideSheetBehavior.access$000(r0)
                r1 = 2
                if (r0 != r1) goto L2e
                com.google.android.material.sidesheet.SideSheetBehavior r0 = r2.this$0
                int r1 = r2.targetState
                r0.setStateInternal(r1)
            L2e:
                return
        }

        public final void continueSettlingToState(int r2) {
                r1 = this;
                com.google.android.material.sidesheet.SideSheetBehavior r0 = r1.this$0
                java.lang.ref.WeakReference r0 = com.google.android.material.sidesheet.SideSheetBehavior.access$100(r0)
                if (r0 == 0) goto L2f
                com.google.android.material.sidesheet.SideSheetBehavior r0 = r1.this$0
                java.lang.ref.WeakReference r0 = com.google.android.material.sidesheet.SideSheetBehavior.access$100(r0)
                java.lang.Object r0 = r0.get()
                if (r0 != 0) goto L15
                goto L2f
            L15:
                r1.targetState = r2
                boolean r2 = r1.isContinueSettlingRunnablePosted
                if (r2 != 0) goto L2f
                com.google.android.material.sidesheet.SideSheetBehavior r2 = r1.this$0
                java.lang.ref.WeakReference r2 = com.google.android.material.sidesheet.SideSheetBehavior.access$100(r2)
                java.lang.Object r2 = r2.get()
                android.view.View r2 = (android.view.View) r2
                java.lang.Runnable r0 = r1.continueSettlingRunnable
                androidx.core.view.ViewCompat.postOnAnimation(r2, r0)
                r2 = 1
                r1.isContinueSettlingRunnablePosted = r2
            L2f:
                return
        }
    }

    public static /* synthetic */ void $r8$lambda$BqwTUDu32X3pYkD_jSNGWG9fjsM(com.google.android.material.sidesheet.SideSheetBehavior r0, int r1) {
            r0.lambda$setState$0(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$tYSQPZMO83x5k0C9LPAWDL-Rmyo, reason: not valid java name */
    public static /* synthetic */ boolean m290$r8$lambda$tYSQPZMO83x5k0C9LPAWDLRmyo(com.google.android.material.sidesheet.SideSheetBehavior r0, int r1, android.view.View r2, androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments r3) {
            boolean r0 = r0.lambda$createAccessibilityViewCommandForState$1(r1, r2, r3)
            return r0
    }

    static {
            int r0 = com.google.android.material.R.string.side_sheet_accessibility_pane_title
            com.google.android.material.sidesheet.SideSheetBehavior.DEFAULT_ACCESSIBILITY_PANE_TITLE = r0
            int r0 = com.google.android.material.R.style.Widget_Material3_SideSheet
            com.google.android.material.sidesheet.SideSheetBehavior.DEF_STYLE_RES = r0
            return
    }

    public SideSheetBehavior() {
            r1 = this;
            r1.<init>()
            com.google.android.material.sidesheet.SideSheetBehavior$StateSettlingTracker r0 = new com.google.android.material.sidesheet.SideSheetBehavior$StateSettlingTracker
            r0.<init>(r1)
            r1.stateSettlingTracker = r0
            r0 = 1
            r1.draggable = r0
            r0 = 5
            r1.state = r0
            r1.lastStableState = r0
            r0 = 1036831949(0x3dcccccd, float:0.1)
            r1.hideFriction = r0
            r0 = -1
            r1.coplanarSiblingViewId = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.callbacks = r0
            com.google.android.material.sidesheet.SideSheetBehavior$1 r0 = new com.google.android.material.sidesheet.SideSheetBehavior$1
            r0.<init>(r1)
            r1.dragCallback = r0
            return
    }

    public SideSheetBehavior(@androidx.annotation.NonNull android.content.Context r6, @androidx.annotation.Nullable android.util.AttributeSet r7) {
            r5 = this;
            r5.<init>(r6, r7)
            com.google.android.material.sidesheet.SideSheetBehavior$StateSettlingTracker r0 = new com.google.android.material.sidesheet.SideSheetBehavior$StateSettlingTracker
            r0.<init>(r5)
            r5.stateSettlingTracker = r0
            r0 = 1
            r5.draggable = r0
            r1 = 5
            r5.state = r1
            r5.lastStableState = r1
            r1 = 1036831949(0x3dcccccd, float:0.1)
            r5.hideFriction = r1
            r1 = -1
            r5.coplanarSiblingViewId = r1
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            r5.callbacks = r2
            com.google.android.material.sidesheet.SideSheetBehavior$1 r2 = new com.google.android.material.sidesheet.SideSheetBehavior$1
            r2.<init>(r5)
            r5.dragCallback = r2
            int[] r2 = com.google.android.material.R.styleable.SideSheetBehavior_Layout
            android.content.res.TypedArray r2 = r6.obtainStyledAttributes(r7, r2)
            int r3 = com.google.android.material.R.styleable.SideSheetBehavior_Layout_backgroundTint
            boolean r4 = r2.hasValue(r3)
            if (r4 == 0) goto L3c
            android.content.res.ColorStateList r3 = com.google.android.material.resources.MaterialResources.getColorStateList(r6, r2, r3)
            r5.backgroundTint = r3
        L3c:
            int r3 = com.google.android.material.R.styleable.SideSheetBehavior_Layout_shapeAppearance
            boolean r3 = r2.hasValue(r3)
            if (r3 == 0) goto L51
            r3 = 0
            int r4 = com.google.android.material.sidesheet.SideSheetBehavior.DEF_STYLE_RES
            com.google.android.material.shape.ShapeAppearanceModel$Builder r7 = com.google.android.material.shape.ShapeAppearanceModel.builder(r6, r7, r3, r4)
            com.google.android.material.shape.ShapeAppearanceModel r7 = r7.build()
            r5.shapeAppearanceModel = r7
        L51:
            int r7 = com.google.android.material.R.styleable.SideSheetBehavior_Layout_coplanarSiblingViewId
            boolean r3 = r2.hasValue(r7)
            if (r3 == 0) goto L60
            int r7 = r2.getResourceId(r7, r1)
            r5.setCoplanarSiblingViewId(r7)
        L60:
            r5.createMaterialShapeDrawableIfNeeded(r6)
            int r7 = com.google.android.material.R.styleable.SideSheetBehavior_Layout_android_elevation
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r7 = r2.getDimension(r7, r1)
            r5.elevation = r7
            int r7 = com.google.android.material.R.styleable.SideSheetBehavior_Layout_behavior_draggable
            boolean r7 = r2.getBoolean(r7, r0)
            r5.setDraggable(r7)
            r2.recycle()
            int r7 = r5.getDefaultSheetEdge()
            r5.setSheetEdge(r7)
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            int r6 = r6.getScaledMaximumFlingVelocity()
            float r6 = (float) r6
            r5.maximumVelocity = r6
            return
    }

    public static /* synthetic */ int access$000(com.google.android.material.sidesheet.SideSheetBehavior r0) {
            int r0 = r0.state
            return r0
    }

    public static /* synthetic */ java.lang.ref.WeakReference access$100(com.google.android.material.sidesheet.SideSheetBehavior r0) {
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r0.viewRef
            return r0
    }

    public static /* synthetic */ com.google.android.material.sidesheet.SheetDelegate access$200(com.google.android.material.sidesheet.SideSheetBehavior r0) {
            com.google.android.material.sidesheet.SheetDelegate r0 = r0.sheetDelegate
            return r0
    }

    public static /* synthetic */ void access$300(com.google.android.material.sidesheet.SideSheetBehavior r0, android.view.View r1, int r2) {
            r0.dispatchOnSlide(r1, r2)
            return
    }

    public static /* synthetic */ boolean access$400(com.google.android.material.sidesheet.SideSheetBehavior r0) {
            boolean r0 = r0.draggable
            return r0
    }

    public static /* synthetic */ void access$500(com.google.android.material.sidesheet.SideSheetBehavior r0, android.view.View r1, int r2, boolean r3) {
            r0.startSettling(r1, r2, r3)
            return
    }

    public static /* synthetic */ int access$600(com.google.android.material.sidesheet.SideSheetBehavior r0) {
            int r0 = r0.parentWidth
            return r0
    }

    public static /* synthetic */ androidx.customview.widget.ViewDragHelper access$700(com.google.android.material.sidesheet.SideSheetBehavior r0) {
            androidx.customview.widget.ViewDragHelper r0 = r0.viewDragHelper
            return r0
    }

    private int calculateCurrentOffset(int r3, V r4) {
            r2 = this;
            int r0 = r2.state
            r1 = 1
            if (r0 == r1) goto L2c
            r1 = 2
            if (r0 == r1) goto L2c
            r3 = 3
            if (r0 == r3) goto L2a
            r3 = 5
            if (r0 != r3) goto L15
            com.google.android.material.sidesheet.SheetDelegate r3 = r2.sheetDelegate
            int r3 = r3.getHiddenOffset()
            goto L33
        L15:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Unexpected value: "
            java.lang.StringBuilder r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4)
            int r0 = r2.state
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L2a:
            r3 = 0
            goto L33
        L2c:
            com.google.android.material.sidesheet.SheetDelegate r0 = r2.sheetDelegate
            int r4 = r0.getOutwardEdge(r4)
            int r3 = r3 - r4
        L33:
            return r3
    }

    private float calculateDragDistance(float r1, float r2) {
            r0 = this;
            float r1 = r1 - r2
            float r1 = java.lang.Math.abs(r1)
            return r1
    }

    private void clearCoplanarSiblingView() {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.coplanarSiblingViewRef
            if (r0 == 0) goto L7
            r0.clear()
        L7:
            r0 = 0
            r1.coplanarSiblingViewRef = r0
            return
    }

    private androidx.core.view.accessibility.AccessibilityViewCommand createAccessibilityViewCommandForState(int r3) {
            r2 = this;
            com.google.android.material.sidesheet.SideSheetBehavior$$ExternalSyntheticLambda0 r0 = new com.google.android.material.sidesheet.SideSheetBehavior$$ExternalSyntheticLambda0
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    private void createMaterialShapeDrawableIfNeeded(@androidx.annotation.NonNull android.content.Context r4) {
            r3 = this;
            com.google.android.material.shape.ShapeAppearanceModel r0 = r3.shapeAppearanceModel
            if (r0 != 0) goto L5
            return
        L5:
            com.google.android.material.shape.MaterialShapeDrawable r0 = new com.google.android.material.shape.MaterialShapeDrawable
            com.google.android.material.shape.ShapeAppearanceModel r1 = r3.shapeAppearanceModel
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

    private void dispatchOnSlide(@androidx.annotation.NonNull android.view.View r3, int r4) {
            r2 = this;
            java.util.Set<com.google.android.material.sidesheet.SideSheetCallback> r0 = r2.callbacks
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L24
            com.google.android.material.sidesheet.SheetDelegate r0 = r2.sheetDelegate
            float r4 = r0.calculateSlideOffsetBasedOnOutwardEdge(r4)
            java.util.Set<com.google.android.material.sidesheet.SideSheetCallback> r0 = r2.callbacks
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()
            com.google.android.material.sidesheet.SheetCallback r1 = (com.google.android.material.sidesheet.SheetCallback) r1
            r1.onSlide(r3, r4)
            goto L14
        L24:
            return
    }

    private void ensureAccessibilityPaneTitleIsSet(android.view.View r3) {
            r2 = this;
            java.lang.CharSequence r0 = androidx.core.view.ViewCompat.getAccessibilityPaneTitle(r3)
            if (r0 != 0) goto L13
            android.content.res.Resources r0 = r3.getResources()
            int r1 = com.google.android.material.sidesheet.SideSheetBehavior.DEFAULT_ACCESSIBILITY_PANE_TITLE
            java.lang.String r0 = r0.getString(r1)
            androidx.core.view.ViewCompat.setAccessibilityPaneTitle(r3, r0)
        L13:
            return
    }

    @androidx.annotation.NonNull
    public static <V extends android.view.View> com.google.android.material.sidesheet.SideSheetBehavior<V> from(@androidx.annotation.NonNull V r1) {
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r0 = r1 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams
            if (r0 == 0) goto L1d
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r1
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r1 = r1.getBehavior()
            boolean r0 = r1 instanceof com.google.android.material.sidesheet.SideSheetBehavior
            if (r0 == 0) goto L15
            com.google.android.material.sidesheet.SideSheetBehavior r1 = (com.google.android.material.sidesheet.SideSheetBehavior) r1
            return r1
        L15:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The view is not associated with SideSheetBehavior"
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

    private int getDefaultSheetEdge() {
            r1 = this;
            r0 = 0
            return r0
    }

    private boolean isDraggedFarEnough(@androidx.annotation.NonNull android.view.MotionEvent r3) {
            r2 = this;
            boolean r0 = r2.shouldHandleDraggingWithHelper()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r2.initialX
            float r0 = (float) r0
            float r3 = r3.getX()
            float r3 = r2.calculateDragDistance(r0, r3)
            androidx.customview.widget.ViewDragHelper r0 = r2.viewDragHelper
            int r0 = r0.getTouchSlop()
            float r0 = (float) r0
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L1f
            r1 = 1
        L1f:
            return r1
    }

    private boolean isLayingOut(@androidx.annotation.NonNull V r2) {
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

    private /* synthetic */ boolean lambda$createAccessibilityViewCommandForState$1(int r1, android.view.View r2, androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments r3) {
            r0 = this;
            r0.setState(r1)
            r1 = 1
            return r1
    }

    private /* synthetic */ void lambda$setState$0(int r3) {
            r2 = this;
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r2.viewRef
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto Le
            r1 = 0
            r2.startSettling(r0, r3, r1)
        Le:
            return
    }

    private void maybeAssignCoplanarSiblingViewBasedId(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r3) {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.coplanarSiblingViewRef
            if (r0 != 0) goto L16
            int r0 = r2.coplanarSiblingViewId
            r1 = -1
            if (r0 == r1) goto L16
            android.view.View r3 = r3.findViewById(r0)
            if (r3 == 0) goto L16
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            r2.coplanarSiblingViewRef = r0
        L16:
            return
    }

    private void replaceAccessibilityActionForState(V r2, androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat r3, int r4) {
            r1 = this;
            androidx.core.view.accessibility.AccessibilityViewCommand r4 = r1.createAccessibilityViewCommandForState(r4)
            r0 = 0
            androidx.core.view.ViewCompat.replaceAccessibilityAction(r2, r3, r0, r4)
            return
    }

    private void resetVelocity() {
            r1 = this;
            android.view.VelocityTracker r0 = r1.velocityTracker
            if (r0 == 0) goto La
            r0.recycle()
            r0 = 0
            r1.velocityTracker = r0
        La:
            return
    }

    private void runAfterLayout(@androidx.annotation.NonNull V r2, java.lang.Runnable r3) {
            r1 = this;
            boolean r0 = r1.isLayingOut(r2)
            if (r0 == 0) goto La
            r2.post(r3)
            goto Ld
        La:
            r3.run()
        Ld:
            return
    }

    private void setSheetEdge(int r5) {
            r4 = this;
            com.google.android.material.sidesheet.SheetDelegate r0 = r4.sheetDelegate
            if (r0 == 0) goto Lb
            r0.getSheetEdge()
            if (r5 == 0) goto La
            goto Lb
        La:
            return
        Lb:
            if (r5 != 0) goto L15
            com.google.android.material.sidesheet.RightSheetDelegate r5 = new com.google.android.material.sidesheet.RightSheetDelegate
            r5.<init>(r4)
            r4.sheetDelegate = r5
            return
        L15:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid sheet edge position value: "
            java.lang.String r2 = ". Must be "
            r3 = 0
            java.lang.String r5 = androidx.emoji2.text.flatbuffer.Utf8Safe$UnpairedSurrogateException$$ExternalSyntheticOutline0.m(r1, r5, r2, r3)
            r0.<init>(r5)
            throw r0
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

    private boolean shouldInterceptTouchEvent(@androidx.annotation.NonNull V r2) {
            r1 = this;
            boolean r0 = r2.isShown()
            if (r0 != 0) goto Lc
            java.lang.CharSequence r2 = androidx.core.view.ViewCompat.getAccessibilityPaneTitle(r2)
            if (r2 == 0) goto L12
        Lc:
            boolean r2 = r1.draggable
            if (r2 == 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }

    private void startSettling(android.view.View r2, int r3, boolean r4) {
            r1 = this;
            com.google.android.material.sidesheet.SheetDelegate r0 = r1.sheetDelegate
            boolean r2 = r0.isSettling(r2, r3, r4)
            if (r2 == 0) goto L12
            r2 = 2
            r1.setStateInternal(r2)
            com.google.android.material.sidesheet.SideSheetBehavior<V>$StateSettlingTracker r2 = r1.stateSettlingTracker
            r2.continueSettlingToState(r3)
            goto L15
        L12:
            r1.setStateInternal(r3)
        L15:
            return
    }

    private void updateAccessibilityActions() {
            r3 = this;
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r3.viewRef
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto Le
            return
        Le:
            r1 = 262144(0x40000, float:3.67342E-40)
            androidx.core.view.ViewCompat.removeAccessibilityAction(r0, r1)
            r1 = 1048576(0x100000, float:1.469368E-39)
            androidx.core.view.ViewCompat.removeAccessibilityAction(r0, r1)
            int r1 = r3.state
            r2 = 5
            if (r1 == r2) goto L22
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r1 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS
            r3.replaceAccessibilityActionForState(r0, r1, r2)
        L22:
            int r1 = r3.state
            r2 = 3
            if (r1 == r2) goto L2c
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r1 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND
            r3.replaceAccessibilityActionForState(r0, r1, r2)
        L2c:
            return
    }

    private void updateSheetVisibility(@androidx.annotation.NonNull android.view.View r3) {
            r2 = this;
            int r0 = r2.state
            r1 = 5
            if (r0 != r1) goto L7
            r0 = 4
            goto L8
        L7:
            r0 = 0
        L8:
            int r1 = r3.getVisibility()
            if (r1 == r0) goto L11
            r3.setVisibility(r0)
        L11:
            return
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public /* bridge */ /* synthetic */ void addCallback(@androidx.annotation.NonNull com.google.android.material.sidesheet.SheetCallback r1) {
            r0 = this;
            com.google.android.material.sidesheet.SideSheetCallback r1 = (com.google.android.material.sidesheet.SideSheetCallback) r1
            r0.addCallback(r1)
            return
    }

    public void addCallback(@androidx.annotation.NonNull com.google.android.material.sidesheet.SideSheetCallback r2) {
            r1 = this;
            java.util.Set<com.google.android.material.sidesheet.SideSheetCallback> r0 = r1.callbacks
            r0.add(r2)
            return
    }

    public void expand() {
            r1 = this;
            r0 = 3
            r1.setState(r0)
            return
    }

    public final int getChildWidth() {
            r1 = this;
            int r0 = r1.childWidth
            return r0
    }

    @androidx.annotation.Nullable
    public android.view.View getCoplanarSiblingView() {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.coplanarSiblingViewRef
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public int getExpandedOffset() {
            r1 = this;
            com.google.android.material.sidesheet.SheetDelegate r0 = r1.sheetDelegate
            int r0 = r0.getExpandedOffset()
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

    public final int getOutwardEdgeOffsetForState(int r3) {
            r2 = this;
            r0 = 3
            if (r3 == r0) goto L19
            r0 = 5
            if (r3 != r0) goto Ld
            com.google.android.material.sidesheet.SheetDelegate r3 = r2.sheetDelegate
            int r3 = r3.getHiddenOffset()
            return r3
        Ld:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid state to get outward edge offset: "
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3)
            r0.<init>(r3)
            throw r0
        L19:
            int r3 = r2.getExpandedOffset()
            return r3
    }

    public final int getParentWidth() {
            r1 = this;
            int r0 = r1.parentWidth
            return r0
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public int getState() {
            r1 = this;
            int r0 = r1.state
            return r0
    }

    @androidx.annotation.Nullable
    public final androidx.customview.widget.ViewDragHelper getViewDragHelper() {
            r1 = this;
            androidx.customview.widget.ViewDragHelper r0 = r1.viewDragHelper
            return r0
    }

    public void hide() {
            r1 = this;
            r0 = 5
            r1.setState(r0)
            return
    }

    public boolean isDraggable() {
            r1 = this;
            boolean r0 = r1.draggable
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
    public boolean onInterceptTouchEvent(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r3, @androidx.annotation.NonNull V r4, @androidx.annotation.NonNull android.view.MotionEvent r5) {
            r2 = this;
            boolean r3 = r2.shouldInterceptTouchEvent(r4)
            r4 = 1
            r0 = 0
            if (r3 != 0) goto Lb
            r2.ignoreEvents = r4
            return r0
        Lb:
            int r3 = r5.getActionMasked()
            if (r3 != 0) goto L14
            r2.resetVelocity()
        L14:
            android.view.VelocityTracker r1 = r2.velocityTracker
            if (r1 != 0) goto L1e
            android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
            r2.velocityTracker = r1
        L1e:
            android.view.VelocityTracker r1 = r2.velocityTracker
            r1.addMovement(r5)
            if (r3 == 0) goto L32
            if (r3 == r4) goto L2b
            r1 = 3
            if (r3 == r1) goto L2b
            goto L39
        L2b:
            boolean r3 = r2.ignoreEvents
            if (r3 == 0) goto L39
            r2.ignoreEvents = r0
            return r0
        L32:
            float r3 = r5.getX()
            int r3 = (int) r3
            r2.initialX = r3
        L39:
            boolean r3 = r2.ignoreEvents
            if (r3 != 0) goto L48
            androidx.customview.widget.ViewDragHelper r3 = r2.viewDragHelper
            if (r3 == 0) goto L48
            boolean r3 = r3.shouldInterceptTouchEvent(r5)
            if (r3 == 0) goto L48
            goto L49
        L48:
            r4 = 0
        L49:
            return r4
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
            if (r0 != 0) goto L4d
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r6)
            r4.viewRef = r0
            com.google.android.material.shape.MaterialShapeDrawable r0 = r4.materialShapeDrawable
            if (r0 == 0) goto L34
            androidx.core.view.ViewCompat.setBackground(r6, r0)
            com.google.android.material.shape.MaterialShapeDrawable r0 = r4.materialShapeDrawable
            float r2 = r4.elevation
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 != 0) goto L30
            float r2 = androidx.core.view.ViewCompat.getElevation(r6)
        L30:
            r0.setElevation(r2)
            goto L3b
        L34:
            android.content.res.ColorStateList r0 = r4.backgroundTint
            if (r0 == 0) goto L3b
            androidx.core.view.ViewCompat.setBackgroundTintList(r6, r0)
        L3b:
            r4.updateSheetVisibility(r6)
            r4.updateAccessibilityActions()
            int r0 = androidx.core.view.ViewCompat.getImportantForAccessibility(r6)
            if (r0 != 0) goto L4a
            androidx.core.view.ViewCompat.setImportantForAccessibility(r6, r1)
        L4a:
            r4.ensureAccessibilityPaneTitleIsSet(r6)
        L4d:
            androidx.customview.widget.ViewDragHelper r0 = r4.viewDragHelper
            if (r0 != 0) goto L59
            androidx.customview.widget.ViewDragHelper$Callback r0 = r4.dragCallback
            androidx.customview.widget.ViewDragHelper r0 = androidx.customview.widget.ViewDragHelper.create(r5, r0)
            r4.viewDragHelper = r0
        L59:
            com.google.android.material.sidesheet.SheetDelegate r0 = r4.sheetDelegate
            int r0 = r0.getOutwardEdge(r6)
            r5.onLayoutChild(r6, r7)
            int r7 = r5.getWidth()
            r4.parentWidth = r7
            int r7 = r6.getWidth()
            r4.childWidth = r7
            int r7 = r4.calculateCurrentOffset(r0, r6)
            androidx.core.view.ViewCompat.offsetLeftAndRight(r6, r7)
            r4.maybeAssignCoplanarSiblingViewBasedId(r5)
            java.util.Set<com.google.android.material.sidesheet.SideSheetCallback> r5 = r4.callbacks
            java.util.Iterator r5 = r5.iterator()
        L7e:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L94
            java.lang.Object r6 = r5.next()
            com.google.android.material.sidesheet.SheetCallback r6 = (com.google.android.material.sidesheet.SheetCallback) r6
            boolean r7 = r6 instanceof com.google.android.material.sidesheet.SideSheetCallback
            if (r7 == 0) goto L7e
            com.google.android.material.sidesheet.SideSheetCallback r6 = (com.google.android.material.sidesheet.SideSheetCallback) r6
            java.util.Objects.requireNonNull(r6)
            goto L7e
        L94:
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
            int r7 = r0.width
            r1 = -1
            int r6 = r3.getChildMeasureSpec(r6, r2, r1, r7)
            int r7 = r4.getPaddingTop()
            int r4 = r4.getPaddingBottom()
            int r4 = r4 + r7
            int r7 = r0.topMargin
            int r4 = r4 + r7
            int r7 = r0.bottomMargin
            int r4 = r4 + r7
            int r4 = r4 + r9
            int r7 = r0.height
            int r4 = r3.getChildMeasureSpec(r8, r4, r1, r7)
            r5.measure(r6, r4)
            r4 = 1
            return r4
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onRestoreInstanceState(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r2, @androidx.annotation.NonNull V r3, @androidx.annotation.NonNull android.os.Parcelable r4) {
            r1 = this;
            com.google.android.material.sidesheet.SideSheetBehavior$SavedState r4 = (com.google.android.material.sidesheet.SideSheetBehavior.SavedState) r4
            android.os.Parcelable r0 = r4.getSuperState()
            if (r0 == 0) goto Lf
            android.os.Parcelable r0 = r4.getSuperState()
            super.onRestoreInstanceState(r2, r3, r0)
        Lf:
            int r2 = r4.state
            r3 = 1
            if (r2 == r3) goto L17
            r3 = 2
            if (r2 != r3) goto L18
        L17:
            r2 = 5
        L18:
            r1.state = r2
            r1.lastStableState = r2
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @androidx.annotation.NonNull
    public android.os.Parcelable onSaveInstanceState(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r2, @androidx.annotation.NonNull V r3) {
            r1 = this;
            com.google.android.material.sidesheet.SideSheetBehavior$SavedState r0 = new com.google.android.material.sidesheet.SideSheetBehavior$SavedState
            android.os.Parcelable r2 = super.onSaveInstanceState(r2, r3)
            r0.<init>(r2, r1)
            return r0
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
            r2.resetVelocity()
        L24:
            android.view.VelocityTracker r0 = r2.velocityTracker
            if (r0 != 0) goto L2e
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r2.velocityTracker = r0
        L2e:
            android.view.VelocityTracker r0 = r2.velocityTracker
            r0.addMovement(r5)
            boolean r0 = r2.shouldHandleDraggingWithHelper()
            if (r0 == 0) goto L53
            r0 = 2
            if (r3 != r0) goto L53
            boolean r3 = r2.ignoreEvents
            if (r3 != 0) goto L53
            boolean r3 = r2.isDraggedFarEnough(r5)
            if (r3 == 0) goto L53
            androidx.customview.widget.ViewDragHelper r3 = r2.viewDragHelper
            int r0 = r5.getActionIndex()
            int r5 = r5.getPointerId(r0)
            r3.captureChildView(r4, r5)
        L53:
            boolean r3 = r2.ignoreEvents
            r3 = r3 ^ r1
            return r3
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public /* bridge */ /* synthetic */ void removeCallback(@androidx.annotation.NonNull com.google.android.material.sidesheet.SheetCallback r1) {
            r0 = this;
            com.google.android.material.sidesheet.SideSheetCallback r1 = (com.google.android.material.sidesheet.SideSheetCallback) r1
            r0.removeCallback(r1)
            return
    }

    public void removeCallback(@androidx.annotation.NonNull com.google.android.material.sidesheet.SideSheetCallback r2) {
            r1 = this;
            java.util.Set<com.google.android.material.sidesheet.SideSheetCallback> r0 = r1.callbacks
            r0.remove(r2)
            return
    }

    public void setCoplanarSiblingView(@androidx.annotation.Nullable android.view.View r2) {
            r1 = this;
            r0 = -1
            r1.coplanarSiblingViewId = r0
            if (r2 != 0) goto L9
            r1.clearCoplanarSiblingView()
            goto L23
        L9:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.coplanarSiblingViewRef = r0
            java.lang.ref.WeakReference<V extends android.view.View> r2 = r1.viewRef
            if (r2 == 0) goto L23
            java.lang.Object r2 = r2.get()
            android.view.View r2 = (android.view.View) r2
            boolean r0 = androidx.core.view.ViewCompat.isLaidOut(r2)
            if (r0 == 0) goto L23
            r2.requestLayout()
        L23:
            return
    }

    public void setCoplanarSiblingViewId(@androidx.annotation.IdRes int r3) {
            r2 = this;
            r2.coplanarSiblingViewId = r3
            r2.clearCoplanarSiblingView()
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r2.viewRef
            if (r0 == 0) goto L1b
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = -1
            if (r3 == r1) goto L1b
            boolean r3 = androidx.core.view.ViewCompat.isLaidOut(r0)
            if (r3 == 0) goto L1b
            r0.requestLayout()
        L1b:
            return
    }

    public void setDraggable(boolean r1) {
            r0 = this;
            r0.draggable = r1
            return
    }

    public void setHideFriction(float r1) {
            r0 = this;
            r0.hideFriction = r1
            return
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public void setState(int r4) {
            r3 = this;
            r0 = 1
            if (r4 == r0) goto L27
            r1 = 2
            if (r4 != r1) goto L7
            goto L27
        L7:
            java.lang.ref.WeakReference<V extends android.view.View> r1 = r3.viewRef
            if (r1 == 0) goto L23
            java.lang.Object r1 = r1.get()
            if (r1 != 0) goto L12
            goto L23
        L12:
            java.lang.ref.WeakReference<V extends android.view.View> r1 = r3.viewRef
            java.lang.Object r1 = r1.get()
            android.view.View r1 = (android.view.View) r1
            androidx.core.content.res.ResourcesCompat$FontCallback$$ExternalSyntheticLambda0 r2 = new androidx.core.content.res.ResourcesCompat$FontCallback$$ExternalSyntheticLambda0
            r2.<init>(r3, r4, r0)
            r3.runAfterLayout(r1, r2)
            goto L26
        L23:
            r3.setStateInternal(r4)
        L26:
            return
        L27:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "STATE_"
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            if (r4 != r0) goto L34
            java.lang.String r4 = "DRAGGING"
            goto L36
        L34:
            java.lang.String r4 = "SETTLING"
        L36:
            java.lang.String r0 = " should not be set externally."
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r4, r0)
            r1.<init>(r4)
            throw r1
    }

    public final void setStateInternal(int r4) {
            r3 = this;
            int r0 = r3.state
            if (r0 != r4) goto L5
            return
        L5:
            r3.state = r4
            r0 = 3
            if (r4 == r0) goto Ld
            r0 = 5
            if (r4 != r0) goto Lf
        Ld:
            r3.lastStableState = r4
        Lf:
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r3.viewRef
            if (r0 != 0) goto L14
            return
        L14:
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto L1d
            return
        L1d:
            r3.updateSheetVisibility(r0)
            java.util.Set<com.google.android.material.sidesheet.SideSheetCallback> r1 = r3.callbacks
            java.util.Iterator r1 = r1.iterator()
        L26:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L36
            java.lang.Object r2 = r1.next()
            com.google.android.material.sidesheet.SheetCallback r2 = (com.google.android.material.sidesheet.SheetCallback) r2
            r2.onStateChanged(r0, r4)
            goto L26
        L36:
            r3.updateAccessibilityActions()
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public boolean shouldSkipSmoothAnimation() {
            r1 = this;
            r0 = 1
            return r0
    }
}
