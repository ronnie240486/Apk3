package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseGridView extends androidx.recyclerview.widget.RecyclerView {

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static final int FOCUS_SCROLL_ALIGNED = 0;

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static final int FOCUS_SCROLL_ITEM = 1;

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static final int FOCUS_SCROLL_PAGE = 2;
    public static final float ITEM_ALIGN_OFFSET_PERCENT_DISABLED = -1.0f;
    public static final int SAVE_ALL_CHILD = 3;
    public static final int SAVE_LIMITED_CHILD = 2;
    public static final int SAVE_NO_CHILD = 0;
    public static final int SAVE_ON_SCREEN_CHILD = 1;
    public static final int WINDOW_ALIGN_BOTH_EDGE = 3;
    public static final int WINDOW_ALIGN_HIGH_EDGE = 2;
    public static final int WINDOW_ALIGN_LOW_EDGE = 1;
    public static final int WINDOW_ALIGN_NO_EDGE = 0;
    public static final float WINDOW_ALIGN_OFFSET_PERCENT_DISABLED = -1.0f;
    private boolean mAnimateChildLayout;
    public androidx.recyclerview.widget.RecyclerView.RecyclerListener mChainedRecyclerListener;
    private boolean mHasOverlappingRendering;
    public int mInitialPrefetchItemCount;
    public final androidx.leanback.widget.GridLayoutManager mLayoutManager;
    private androidx.leanback.widget.BaseGridView.OnKeyInterceptListener mOnKeyInterceptListener;
    private androidx.leanback.widget.BaseGridView.OnMotionInterceptListener mOnMotionInterceptListener;
    private androidx.leanback.widget.BaseGridView.OnTouchInterceptListener mOnTouchInterceptListener;
    private androidx.leanback.widget.BaseGridView.OnUnhandledKeyListener mOnUnhandledKeyListener;
    private androidx.recyclerview.widget.RecyclerView.ItemAnimator mSavedItemAnimator;




    /* JADX INFO: loaded from: classes2.dex */
    public interface OnKeyInterceptListener {
        boolean onInterceptKeyEvent(android.view.KeyEvent r1);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface OnMotionInterceptListener {
        boolean onInterceptMotionEvent(android.view.MotionEvent r1);
    }

    /* JADX INFO: loaded from: classes3.dex */
    public interface OnTouchInterceptListener {
        boolean onInterceptTouchEvent(android.view.MotionEvent r1);
    }

    public interface OnUnhandledKeyListener {
        boolean onUnhandledKey(android.view.KeyEvent r1);
    }

    public BaseGridView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 1
            r0.mAnimateChildLayout = r1
            r0.mHasOverlappingRendering = r1
            r2 = 4
            r0.mInitialPrefetchItemCount = r2
            androidx.leanback.widget.GridLayoutManager r2 = new androidx.leanback.widget.GridLayoutManager
            r2.<init>(r0)
            r0.mLayoutManager = r2
            r0.setLayoutManager(r2)
            r2 = 0
            r0.setPreserveFocusAfterLayout(r2)
            r3 = 262144(0x40000, float:3.67342E-40)
            r0.setDescendantFocusability(r3)
            r0.setHasFixedSize(r1)
            r0.setChildrenDrawingOrderEnabled(r1)
            r0.setWillNotDraw(r1)
            r1 = 2
            r0.setOverScrollMode(r1)
            androidx.recyclerview.widget.RecyclerView$ItemAnimator r1 = r0.getItemAnimator()
            androidx.recyclerview.widget.SimpleItemAnimator r1 = (androidx.recyclerview.widget.SimpleItemAnimator) r1
            r1.setSupportsChangeAnimations(r2)
            androidx.leanback.widget.BaseGridView$1 r1 = new androidx.leanback.widget.BaseGridView$1
            r1.<init>(r0)
            super.setRecyclerListener(r1)
            return
    }

    public void addOnChildViewHolderSelectedListener(androidx.leanback.widget.OnChildViewHolderSelectedListener r2) {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            r0.addOnChildViewHolderSelectedListener(r2)
            return
    }

    public void animateIn() {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            r0.slideIn()
            return
    }

    public void animateOut() {
            r4 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r4.mLayoutManager
            int r1 = r0.mFlag
            r2 = r1 & 64
            if (r2 == 0) goto L9
            goto L37
        L9:
            r1 = r1 | 64
            r0.mFlag = r1
            int r1 = r0.getChildCount()
            if (r1 != 0) goto L14
            goto L37
        L14:
            int r1 = r0.mOrientation
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L29
            androidx.leanback.widget.BaseGridView r1 = r0.mBaseGridView
            int r0 = r0.getSlideOutDistance()
            android.view.animation.AccelerateDecelerateInterpolator r2 = new android.view.animation.AccelerateDecelerateInterpolator
            r2.<init>()
            r1.smoothScrollBy(r3, r0, r2)
            goto L37
        L29:
            androidx.leanback.widget.BaseGridView r1 = r0.mBaseGridView
            int r0 = r0.getSlideOutDistance()
            android.view.animation.AccelerateDecelerateInterpolator r2 = new android.view.animation.AccelerateDecelerateInterpolator
            r2.<init>()
            r1.smoothScrollBy(r0, r3, r2)
        L37:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchGenericFocusedEvent(android.view.MotionEvent r2) {
            r1 = this;
            androidx.leanback.widget.BaseGridView$OnMotionInterceptListener r0 = r1.mOnMotionInterceptListener
            if (r0 == 0) goto Lc
            boolean r0 = r0.onInterceptMotionEvent(r2)
            if (r0 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            boolean r2 = super.dispatchGenericFocusedEvent(r2)
            return r2
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent r3) {
            r2 = this;
            androidx.leanback.widget.BaseGridView$OnKeyInterceptListener r0 = r2.mOnKeyInterceptListener
            r1 = 1
            if (r0 == 0) goto Lc
            boolean r0 = r0.onInterceptKeyEvent(r3)
            if (r0 == 0) goto Lc
            return r1
        Lc:
            boolean r0 = super.dispatchKeyEvent(r3)
            if (r0 == 0) goto L13
            return r1
        L13:
            androidx.leanback.widget.BaseGridView$OnUnhandledKeyListener r0 = r2.mOnUnhandledKeyListener
            if (r0 == 0) goto L1e
            boolean r3 = r0.onUnhandledKey(r3)
            if (r3 == 0) goto L1e
            goto L1f
        L1e:
            r1 = 0
        L1f:
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            androidx.leanback.widget.BaseGridView$OnTouchInterceptListener r0 = r1.mOnTouchInterceptListener
            if (r0 == 0) goto Lc
            boolean r0 = r0.onInterceptTouchEvent(r2)
            if (r0 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            boolean r2 = super.dispatchTouchEvent(r2)
            return r2
    }

    @Override // android.view.View
    public android.view.View focusSearch(int r3) {
            r2 = this;
            boolean r0 = r2.isFocused()
            if (r0 == 0) goto L17
            androidx.leanback.widget.GridLayoutManager r0 = r2.mLayoutManager
            int r1 = r0.getSelection()
            android.view.View r0 = r0.findViewByPosition(r1)
            if (r0 == 0) goto L17
            android.view.View r3 = r2.focusSearch(r0, r3)
            return r3
        L17:
            android.view.View r3 = super.focusSearch(r3)
            return r3
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public int getChildDrawingOrder(int r3, int r4) {
            r2 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r2.mLayoutManager
            int r1 = r0.mFocusPosition
            android.view.View r0 = r0.findViewByPosition(r1)
            if (r0 != 0) goto Lb
            goto L1b
        Lb:
            int r0 = r2.indexOfChild(r0)
            if (r4 >= r0) goto L12
            goto L1b
        L12:
            int r1 = r3 + (-1)
            if (r4 >= r1) goto L1a
            int r0 = r0 + r3
            int r0 = r0 + (-1)
            int r0 = r0 - r4
        L1a:
            r4 = r0
        L1b:
            return r4
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public int getExtraLayoutSpace() {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            int r0 = r0.getExtraLayoutSpace()
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public int getFocusScrollStrategy() {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            int r0 = r0.getFocusScrollStrategy()
            return r0
    }

    @java.lang.Deprecated
    public int getHorizontalMargin() {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            int r0 = r0.getHorizontalSpacing()
            return r0
    }

    public int getHorizontalSpacing() {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            int r0 = r0.getHorizontalSpacing()
            return r0
    }

    public int getInitialPrefetchItemCount() {
            r1 = this;
            int r0 = r1.mInitialPrefetchItemCount
            return r0
    }

    public int getItemAlignmentOffset() {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            int r0 = r0.getItemAlignmentOffset()
            return r0
    }

    public float getItemAlignmentOffsetPercent() {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            float r0 = r0.getItemAlignmentOffsetPercent()
            return r0
    }

    public int getItemAlignmentViewId() {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            int r0 = r0.getItemAlignmentViewId()
            return r0
    }

    public androidx.leanback.widget.BaseGridView.OnUnhandledKeyListener getOnUnhandledKeyListener() {
            r1 = this;
            androidx.leanback.widget.BaseGridView$OnUnhandledKeyListener r0 = r1.mOnUnhandledKeyListener
            return r0
    }

    public final int getSaveChildrenLimitNumber() {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            androidx.leanback.widget.ViewsStateBundle r0 = r0.mChildrenStates
            int r0 = r0.getLimitNumber()
            return r0
    }

    public final int getSaveChildrenPolicy() {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            androidx.leanback.widget.ViewsStateBundle r0 = r0.mChildrenStates
            int r0 = r0.getSavePolicy()
            return r0
    }

    public int getSelectedPosition() {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            int r0 = r0.getSelection()
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public int getSelectedSubPosition() {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            int r0 = r0.getSubSelection()
            return r0
    }

    @java.lang.Deprecated
    public int getVerticalMargin() {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            int r0 = r0.getVerticalSpacing()
            return r0
    }

    public int getVerticalSpacing() {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            int r0 = r0.getVerticalSpacing()
            return r0
    }

    public void getViewSelectedOffsets(android.view.View r2, int[] r3) {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            r0.getViewSelectedOffsets(r2, r3)
            return
    }

    public int getWindowAlignment() {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            int r0 = r0.getWindowAlignment()
            return r0
    }

    public int getWindowAlignmentOffset() {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            int r0 = r0.getWindowAlignmentOffset()
            return r0
    }

    public float getWindowAlignmentOffsetPercent() {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            float r0 = r0.getWindowAlignmentOffsetPercent()
            return r0
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
            r1 = this;
            boolean r0 = r1.mHasOverlappingRendering
            return r0
    }

    public boolean hasPreviousViewInSameRow(int r2) {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            boolean r2 = r0.hasPreviousViewInSameRow(r2)
            return r2
    }

    public final void initBaseGridViewAttributes(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            int[] r0 = androidx.leanback.R.styleable.lbBaseGridView
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r0)
            int r5 = androidx.leanback.R.styleable.lbBaseGridView_focusOutFront
            r0 = 0
            boolean r5 = r4.getBoolean(r5, r0)
            int r1 = androidx.leanback.R.styleable.lbBaseGridView_focusOutEnd
            boolean r1 = r4.getBoolean(r1, r0)
            androidx.leanback.widget.GridLayoutManager r2 = r3.mLayoutManager
            r2.setFocusOutAllowed(r5, r1)
            int r5 = androidx.leanback.R.styleable.lbBaseGridView_focusOutSideStart
            r1 = 1
            boolean r5 = r4.getBoolean(r5, r1)
            int r2 = androidx.leanback.R.styleable.lbBaseGridView_focusOutSideEnd
            boolean r1 = r4.getBoolean(r2, r1)
            androidx.leanback.widget.GridLayoutManager r2 = r3.mLayoutManager
            r2.setFocusOutSideAllowed(r5, r1)
            androidx.leanback.widget.GridLayoutManager r5 = r3.mLayoutManager
            int r1 = androidx.leanback.R.styleable.lbBaseGridView_android_verticalSpacing
            int r2 = androidx.leanback.R.styleable.lbBaseGridView_verticalMargin
            int r2 = r4.getDimensionPixelSize(r2, r0)
            int r1 = r4.getDimensionPixelSize(r1, r2)
            r5.setVerticalSpacing(r1)
            androidx.leanback.widget.GridLayoutManager r5 = r3.mLayoutManager
            int r1 = androidx.leanback.R.styleable.lbBaseGridView_android_horizontalSpacing
            int r2 = androidx.leanback.R.styleable.lbBaseGridView_horizontalMargin
            int r2 = r4.getDimensionPixelSize(r2, r0)
            int r1 = r4.getDimensionPixelSize(r1, r2)
            r5.setHorizontalSpacing(r1)
            int r5 = androidx.leanback.R.styleable.lbBaseGridView_android_gravity
            boolean r1 = r4.hasValue(r5)
            if (r1 == 0) goto L5b
            int r5 = r4.getInt(r5, r0)
            r3.setGravity(r5)
        L5b:
            r4.recycle()
            return
    }

    public boolean isChildLayoutAnimated() {
            r1 = this;
            boolean r0 = r1.mAnimateChildLayout
            return r0
    }

    public final boolean isChildrenDrawingOrderEnabledInternal() {
            r1 = this;
            boolean r0 = r1.isChildrenDrawingOrderEnabled()
            return r0
    }

    public boolean isFocusDrawingOrderEnabled() {
            r1 = this;
            boolean r0 = super.isChildrenDrawingOrderEnabled()
            return r0
    }

    public final boolean isFocusSearchDisabled() {
            r2 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r2.mLayoutManager
            int r0 = r0.mFlag
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public boolean isItemAlignmentOffsetWithPadding() {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            boolean r0 = r0.isItemAlignmentOffsetWithPadding()
            return r0
    }

    public boolean isScrollEnabled() {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            boolean r0 = r0.isScrollEnabled()
            return r0
    }

    public boolean isWindowAlignmentPreferKeyLineOverHighEdge() {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            androidx.leanback.widget.WindowAlignment r0 = r0.mWindowAlignment
            androidx.leanback.widget.WindowAlignment$Axis r0 = r0.mainAxis()
            boolean r0 = r0.isPreferKeylineOverHighEdge()
            return r0
    }

    public boolean isWindowAlignmentPreferKeyLineOverLowEdge() {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            androidx.leanback.widget.WindowAlignment r0 = r0.mWindowAlignment
            androidx.leanback.widget.WindowAlignment$Axis r0 = r0.mainAxis()
            boolean r0 = r0.isPreferKeylineOverLowEdge()
            return r0
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean r2, int r3, android.graphics.Rect r4) {
            r1 = this;
            super.onFocusChanged(r2, r3, r4)
            androidx.leanback.widget.GridLayoutManager r3 = r1.mLayoutManager
            java.util.Objects.requireNonNull(r3)
            if (r2 == 0) goto L26
            int r2 = r3.mFocusPosition
        Lc:
            android.view.View r4 = r3.findViewByPosition(r2)
            if (r4 != 0) goto L13
            goto L26
        L13:
            int r0 = r4.getVisibility()
            if (r0 != 0) goto L23
            boolean r0 = r4.hasFocusable()
            if (r0 == 0) goto L23
            r4.requestFocus()
            goto L26
        L23:
            int r2 = r2 + 1
            goto Lc
        L26:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int r2, android.graphics.Rect r3) {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            boolean r2 = r0.gridOnRequestFocusInDescendants(r1, r2, r3)
            return r2
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int r2) {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            r0.onRtlPropertiesChanged(r2)
            return
    }

    public void removeOnChildViewHolderSelectedListener(androidx.leanback.widget.OnChildViewHolderSelectedListener r2) {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            r0.removeOnChildViewHolderSelectedListener(r2)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void scrollToPosition(int r4) {
            r3 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r3.mLayoutManager
            int r1 = r0.mFlag
            r1 = r1 & 64
            r2 = 0
            if (r1 == 0) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            if (r1 == 0) goto L12
            r0.setSelectionWithSub(r4, r2, r2)
            return
        L12:
            super.scrollToPosition(r4)
            return
    }

    public void setAnimateChildLayout(boolean r2) {
            r1 = this;
            boolean r0 = r1.mAnimateChildLayout
            if (r0 == r2) goto L18
            r1.mAnimateChildLayout = r2
            if (r2 != 0) goto L13
            androidx.recyclerview.widget.RecyclerView$ItemAnimator r2 = r1.getItemAnimator()
            r1.mSavedItemAnimator = r2
            r2 = 0
            super.setItemAnimator(r2)
            goto L18
        L13:
            androidx.recyclerview.widget.RecyclerView$ItemAnimator r2 = r1.mSavedItemAnimator
            super.setItemAnimator(r2)
        L18:
            return
    }

    public void setChildrenVisibility(int r5) {
            r4 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r4.mLayoutManager
            r0.mChildVisibility = r5
            r1 = -1
            if (r5 == r1) goto L1a
            int r5 = r0.getChildCount()
            r1 = 0
        Lc:
            if (r1 >= r5) goto L1a
            android.view.View r2 = r0.getChildAt(r1)
            int r3 = r0.mChildVisibility
            r2.setVisibility(r3)
            int r1 = r1 + 1
            goto Lc
        L1a:
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void setExtraLayoutSpace(int r2) {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            r0.setExtraLayoutSpace(r2)
            return
    }

    public void setFocusDrawingOrderEnabled(boolean r1) {
            r0 = this;
            super.setChildrenDrawingOrderEnabled(r1)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void setFocusScrollStrategy(int r2) {
            r1 = this;
            if (r2 == 0) goto L11
            r0 = 1
            if (r2 == r0) goto L11
            r0 = 2
            if (r2 != r0) goto L9
            goto L11
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid scrollStrategy"
            r2.<init>(r0)
            throw r2
        L11:
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            r0.setFocusScrollStrategy(r2)
            r1.requestLayout()
            return
    }

    public final void setFocusSearchDisabled(boolean r4) {
            r3 = this;
            if (r4 == 0) goto L5
            r0 = 393216(0x60000, float:5.51013E-40)
            goto L7
        L5:
            r0 = 262144(0x40000, float:3.67342E-40)
        L7:
            r3.setDescendantFocusability(r0)
            androidx.leanback.widget.GridLayoutManager r0 = r3.mLayoutManager
            int r1 = r0.mFlag
            r2 = -32769(0xffffffffffff7fff, float:NaN)
            r1 = r1 & r2
            if (r4 == 0) goto L18
            r4 = 32768(0x8000, float:4.5918E-41)
            goto L19
        L18:
            r4 = 0
        L19:
            r4 = r4 | r1
            r0.mFlag = r4
            return
    }

    public void setGravity(int r2) {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            r0.setGravity(r2)
            r1.requestLayout()
            return
    }

    public void setHasOverlappingRendering(boolean r1) {
            r0 = this;
            r0.mHasOverlappingRendering = r1
            return
    }

    @java.lang.Deprecated
    public void setHorizontalMargin(int r1) {
            r0 = this;
            r0.setHorizontalSpacing(r1)
            return
    }

    public void setHorizontalSpacing(int r2) {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            r0.setHorizontalSpacing(r2)
            r1.requestLayout()
            return
    }

    public void setInitialPrefetchItemCount(int r1) {
            r0 = this;
            r0.mInitialPrefetchItemCount = r1
            return
    }

    public void setItemAlignmentOffset(int r2) {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            r0.setItemAlignmentOffset(r2)
            r1.requestLayout()
            return
    }

    public void setItemAlignmentOffsetPercent(float r2) {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            r0.setItemAlignmentOffsetPercent(r2)
            r1.requestLayout()
            return
    }

    public void setItemAlignmentOffsetWithPadding(boolean r2) {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            r0.setItemAlignmentOffsetWithPadding(r2)
            r1.requestLayout()
            return
    }

    public void setItemAlignmentViewId(int r2) {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            r0.setItemAlignmentViewId(r2)
            return
    }

    @java.lang.Deprecated
    public void setItemMargin(int r1) {
            r0 = this;
            r0.setItemSpacing(r1)
            return
    }

    public void setItemSpacing(int r2) {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            r0.setItemSpacing(r2)
            r1.requestLayout()
            return
    }

    public void setLayoutEnabled(boolean r2) {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            r0.setLayoutEnabled(r2)
            return
    }

    public void setOnChildLaidOutListener(androidx.leanback.widget.OnChildLaidOutListener r2) {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            r0.mChildLaidOutListener = r2
            return
    }

    public void setOnChildSelectedListener(androidx.leanback.widget.OnChildSelectedListener r2) {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            r0.setOnChildSelectedListener(r2)
            return
    }

    public void setOnChildViewHolderSelectedListener(androidx.leanback.widget.OnChildViewHolderSelectedListener r2) {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            r0.setOnChildViewHolderSelectedListener(r2)
            return
    }

    public void setOnKeyInterceptListener(androidx.leanback.widget.BaseGridView.OnKeyInterceptListener r1) {
            r0 = this;
            r0.mOnKeyInterceptListener = r1
            return
    }

    public void setOnMotionInterceptListener(androidx.leanback.widget.BaseGridView.OnMotionInterceptListener r1) {
            r0 = this;
            r0.mOnMotionInterceptListener = r1
            return
    }

    public void setOnTouchInterceptListener(androidx.leanback.widget.BaseGridView.OnTouchInterceptListener r1) {
            r0 = this;
            r0.mOnTouchInterceptListener = r1
            return
    }

    public void setOnUnhandledKeyListener(androidx.leanback.widget.BaseGridView.OnUnhandledKeyListener r1) {
            r0 = this;
            r0.mOnUnhandledKeyListener = r1
            return
    }

    public void setPruneChild(boolean r2) {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            r0.setPruneChild(r2)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setRecyclerListener(androidx.recyclerview.widget.RecyclerView.RecyclerListener r1) {
            r0 = this;
            r0.mChainedRecyclerListener = r1
            return
    }

    public final void setSaveChildrenLimitNumber(int r2) {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            androidx.leanback.widget.ViewsStateBundle r0 = r0.mChildrenStates
            r0.setLimitNumber(r2)
            return
    }

    public final void setSaveChildrenPolicy(int r2) {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            androidx.leanback.widget.ViewsStateBundle r0 = r0.mChildrenStates
            r0.setSavePolicy(r2)
            return
    }

    public void setScrollEnabled(boolean r2) {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            r0.setScrollEnabled(r2)
            return
    }

    public void setSelectedPosition(int r3) {
            r2 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r2.mLayoutManager
            r1 = 0
            r0.setSelection(r3, r1)
            return
    }

    public void setSelectedPosition(int r2, int r3) {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            r0.setSelection(r2, r3)
            return
    }

    public void setSelectedPosition(int r3, androidx.leanback.widget.ViewHolderTask r4) {
            r2 = this;
            if (r4 == 0) goto L1b
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r2.findViewHolderForPosition(r3)
            if (r0 == 0) goto L13
            boolean r1 = r2.hasPendingAdapterUpdates()
            if (r1 == 0) goto Lf
            goto L13
        Lf:
            r4.run(r0)
            goto L1b
        L13:
            androidx.leanback.widget.BaseGridView$3 r0 = new androidx.leanback.widget.BaseGridView$3
            r0.<init>(r2, r3, r4)
            r2.addOnChildViewHolderSelectedListener(r0)
        L1b:
            r2.setSelectedPosition(r3)
            return
    }

    public void setSelectedPositionSmooth(int r2) {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            r0.setSelectionSmooth(r2)
            return
    }

    public void setSelectedPositionSmooth(int r3, androidx.leanback.widget.ViewHolderTask r4) {
            r2 = this;
            if (r4 == 0) goto L1b
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r2.findViewHolderForPosition(r3)
            if (r0 == 0) goto L13
            boolean r1 = r2.hasPendingAdapterUpdates()
            if (r1 == 0) goto Lf
            goto L13
        Lf:
            r4.run(r0)
            goto L1b
        L13:
            androidx.leanback.widget.BaseGridView$2 r0 = new androidx.leanback.widget.BaseGridView$2
            r0.<init>(r2, r3, r4)
            r2.addOnChildViewHolderSelectedListener(r0)
        L1b:
            r2.setSelectedPositionSmooth(r3)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void setSelectedPositionSmoothWithSub(int r2, int r3) {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            r0.setSelectionSmoothWithSub(r2, r3)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void setSelectedPositionWithSub(int r3, int r4) {
            r2 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r2.mLayoutManager
            r1 = 0
            r0.setSelectionWithSub(r3, r4, r1)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void setSelectedPositionWithSub(int r2, int r3, int r4) {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            r0.setSelectionWithSub(r2, r3, r4)
            return
    }

    @java.lang.Deprecated
    public void setVerticalMargin(int r1) {
            r0 = this;
            r0.setVerticalSpacing(r1)
            return
    }

    public void setVerticalSpacing(int r2) {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            r0.setVerticalSpacing(r2)
            r1.requestLayout()
            return
    }

    public void setWindowAlignment(int r2) {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            r0.setWindowAlignment(r2)
            r1.requestLayout()
            return
    }

    public void setWindowAlignmentOffset(int r2) {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            r0.setWindowAlignmentOffset(r2)
            r1.requestLayout()
            return
    }

    public void setWindowAlignmentOffsetPercent(float r2) {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            r0.setWindowAlignmentOffsetPercent(r2)
            r1.requestLayout()
            return
    }

    public void setWindowAlignmentPreferKeyLineOverHighEdge(boolean r2) {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            androidx.leanback.widget.WindowAlignment r0 = r0.mWindowAlignment
            androidx.leanback.widget.WindowAlignment$Axis r0 = r0.mainAxis()
            r0.setPreferKeylineOverHighEdge(r2)
            r1.requestLayout()
            return
    }

    public void setWindowAlignmentPreferKeyLineOverLowEdge(boolean r2) {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            androidx.leanback.widget.WindowAlignment r0 = r0.mWindowAlignment
            androidx.leanback.widget.WindowAlignment$Axis r0 = r0.mainAxis()
            r0.setPreferKeylineOverLowEdge(r2)
            r1.requestLayout()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void smoothScrollToPosition(int r4) {
            r3 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r3.mLayoutManager
            int r1 = r0.mFlag
            r1 = r1 & 64
            r2 = 0
            if (r1 == 0) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            if (r1 == 0) goto L12
            r0.setSelectionWithSub(r4, r2, r2)
            return
        L12:
            super.smoothScrollToPosition(r4)
            return
    }
}
