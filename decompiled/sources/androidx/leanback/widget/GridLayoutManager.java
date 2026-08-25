package androidx.leanback.widget;

/* JADX INFO: loaded from: classes2.dex */
final class GridLayoutManager extends androidx.recyclerview.widget.RecyclerView.LayoutManager {
    private static final int NEXT_ITEM = 1;
    private static final int NEXT_ROW = 3;
    private static final int PREV_ITEM = 0;
    private static final int PREV_ROW = 2;
    private static final java.lang.String TAG = "GridLayoutManager";
    private static final android.graphics.Rect sTempRect = null;
    public static int[] sTwoInts;
    public final androidx.leanback.widget.BaseGridView mBaseGridView;
    public androidx.leanback.widget.OnChildLaidOutListener mChildLaidOutListener;
    private androidx.leanback.widget.OnChildSelectedListener mChildSelectedListener;
    private java.util.ArrayList<androidx.leanback.widget.OnChildViewHolderSelectedListener> mChildViewHolderSelectedListeners;
    public int mChildVisibility;
    public final androidx.leanback.widget.ViewsStateBundle mChildrenStates;
    public androidx.leanback.widget.GridLayoutManager.GridLinearSmoothScroller mCurrentSmoothScroller;
    public int[] mDisappearingPositions;
    private int mExtraLayoutSpace;
    public int mExtraLayoutSpaceInPreLayout;
    private androidx.leanback.widget.FacetProviderAdapter mFacetProviderAdapter;
    private int mFixedRowSizeSecondary;
    public int mFlag;
    public int mFocusPosition;
    private int mFocusPositionOffset;
    private int mFocusScrollStrategy;
    private int mGravity;
    public androidx.leanback.widget.Grid mGrid;
    private androidx.leanback.widget.Grid.Provider mGridProvider;
    private int mHorizontalSpacing;
    private final androidx.leanback.widget.ItemAlignment mItemAlignment;
    public int mMaxPendingMoves;
    private int mMaxSizeSecondary;
    private int[] mMeasuredDimension;
    public int mNumRows;
    private int mNumRowsRequested;
    public int mOrientation;
    private androidx.recyclerview.widget.OrientationHelper mOrientationHelper;
    public androidx.leanback.widget.GridLayoutManager.PendingMoveSmoothScroller mPendingMoveSmoothScroller;
    public int mPositionDeltaInPreLayout;
    public final android.util.SparseIntArray mPositionToRowInPostLayout;
    private int mPrimaryScrollExtra;
    public androidx.recyclerview.widget.RecyclerView.Recycler mRecycler;
    private final java.lang.Runnable mRequestLayoutRunnable;
    private int[] mRowSizeSecondary;
    private int mRowSizeSecondaryRequested;
    public int mScrollOffsetSecondary;
    private int mSizePrimary;
    private int mSpacingPrimary;
    private int mSpacingSecondary;
    public androidx.recyclerview.widget.RecyclerView.State mState;
    public int mSubFocusPosition;
    private int mVerticalSpacing;
    public final androidx.leanback.widget.WindowAlignment mWindowAlignment;





    /* JADX INFO: loaded from: classes.dex */
    public abstract class GridLinearSmoothScroller extends androidx.recyclerview.widget.LinearSmoothScroller {
        public boolean mSkipOnStopInternal;
        public final /* synthetic */ androidx.leanback.widget.GridLayoutManager this$0;

        public GridLinearSmoothScroller(androidx.leanback.widget.GridLayoutManager r1) {
                r0 = this;
                r0.this$0 = r1
                androidx.leanback.widget.BaseGridView r1 = r1.mBaseGridView
                android.content.Context r1 = r1.getContext()
                r0.<init>(r1)
                return
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public final int calculateTimeForScrolling(int r4) {
                r3 = this;
                int r0 = super.calculateTimeForScrolling(r4)
                androidx.leanback.widget.GridLayoutManager r1 = r3.this$0
                androidx.leanback.widget.WindowAlignment r1 = r1.mWindowAlignment
                androidx.leanback.widget.WindowAlignment$Axis r1 = r1.mainAxis()
                int r1 = r1.getSize()
                if (r1 <= 0) goto L2b
                r1 = 1106247680(0x41f00000, float:30.0)
                androidx.leanback.widget.GridLayoutManager r2 = r3.this$0
                androidx.leanback.widget.WindowAlignment r2 = r2.mWindowAlignment
                androidx.leanback.widget.WindowAlignment$Axis r2 = r2.mainAxis()
                int r2 = r2.getSize()
                float r2 = (float) r2
                float r1 = r1 / r2
                float r4 = (float) r4
                float r1 = r1 * r4
                float r4 = (float) r0
                int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r4 >= 0) goto L2b
                int r0 = (int) r1
            L2b:
                return r0
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
        public final void onStop() {
                r3 = this;
                r0 = 0
                r3.mInterimTargetDy = r0
                r3.mInterimTargetDx = r0
                r0 = 0
                r3.mTargetVector = r0
                boolean r1 = r3.mSkipOnStopInternal
                if (r1 != 0) goto Lf
                r3.onStopInternal()
            Lf:
                androidx.leanback.widget.GridLayoutManager r1 = r3.this$0
                androidx.leanback.widget.GridLayoutManager$GridLinearSmoothScroller r2 = r1.mCurrentSmoothScroller
                if (r2 != r3) goto L17
                r1.mCurrentSmoothScroller = r0
            L17:
                androidx.leanback.widget.GridLayoutManager$PendingMoveSmoothScroller r2 = r1.mPendingMoveSmoothScroller
                if (r2 != r3) goto L1d
                r1.mPendingMoveSmoothScroller = r0
            L1d:
                return
        }

        public void onStopInternal() {
                r3 = this;
                int r0 = r3.getTargetPosition()
                android.view.View r0 = r3.findViewByPosition(r0)
                if (r0 != 0) goto L1b
                int r0 = r3.getTargetPosition()
                if (r0 < 0) goto L1a
                androidx.leanback.widget.GridLayoutManager r0 = r3.this$0
                int r1 = r3.getTargetPosition()
                r2 = 0
                r0.scrollToSelection(r1, r2, r2, r2)
            L1a:
                return
            L1b:
                androidx.leanback.widget.GridLayoutManager r1 = r3.this$0
                int r1 = r1.mFocusPosition
                int r2 = r3.getTargetPosition()
                if (r1 == r2) goto L2d
                androidx.leanback.widget.GridLayoutManager r1 = r3.this$0
                int r2 = r3.getTargetPosition()
                r1.mFocusPosition = r2
            L2d:
                androidx.leanback.widget.GridLayoutManager r1 = r3.this$0
                boolean r1 = r1.hasFocus()
                if (r1 == 0) goto L48
                androidx.leanback.widget.GridLayoutManager r1 = r3.this$0
                int r2 = r1.mFlag
                r2 = r2 | 32
                r1.mFlag = r2
                r0.requestFocus()
                androidx.leanback.widget.GridLayoutManager r0 = r3.this$0
                int r1 = r0.mFlag
                r1 = r1 & (-33)
                r0.mFlag = r1
            L48:
                androidx.leanback.widget.GridLayoutManager r0 = r3.this$0
                r0.dispatchChildSelected()
                androidx.leanback.widget.GridLayoutManager r0 = r3.this$0
                r0.dispatchChildSelectedAndPositioned()
                return
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
        public final void onTargetFound(android.view.View r4, androidx.recyclerview.widget.RecyclerView.SmoothScroller.Action r5) {
                r3 = this;
                androidx.leanback.widget.GridLayoutManager r0 = r3.this$0
                int[] r1 = androidx.leanback.widget.GridLayoutManager.sTwoInts
                boolean r4 = r0.getScrollPosition(r4, r1)
                if (r4 == 0) goto L34
                androidx.leanback.widget.GridLayoutManager r4 = r3.this$0
                int r4 = r4.mOrientation
                r0 = 0
                r1 = 1
                if (r4 != 0) goto L19
                int[] r4 = androidx.leanback.widget.GridLayoutManager.sTwoInts
                r0 = r4[r0]
                r4 = r4[r1]
                goto L20
            L19:
                int[] r4 = androidx.leanback.widget.GridLayoutManager.sTwoInts
                r1 = r4[r1]
                r4 = r4[r0]
                r0 = r1
            L20:
                int r1 = r0 * r0
                int r2 = r4 * r4
                int r2 = r2 + r1
                double r1 = (double) r2
                double r1 = java.lang.Math.sqrt(r1)
                int r1 = (int) r1
                int r1 = r3.calculateTimeForDeceleration(r1)
                android.view.animation.DecelerateInterpolator r2 = r3.mDecelerateInterpolator
                r5.update(r0, r4, r1, r2)
            L34:
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class LayoutParams extends androidx.recyclerview.widget.RecyclerView.LayoutParams {
        private int[] mAlignMultiple;
        private int mAlignX;
        private int mAlignY;
        private androidx.leanback.widget.ItemAlignmentFacet mAlignmentFacet;
        public int mBottomInset;
        public int mLeftInset;
        public int mRightInset;
        public int mTopInset;

        public LayoutParams(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public LayoutParams(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public LayoutParams(androidx.leanback.widget.GridLayoutManager.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public LayoutParams(androidx.recyclerview.widget.RecyclerView.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public final void calculateItemAlignments(int r6, android.view.View r7) {
                r5 = this;
                androidx.leanback.widget.ItemAlignmentFacet r0 = r5.mAlignmentFacet
                androidx.leanback.widget.ItemAlignmentFacet$ItemAlignmentDef[] r0 = r0.getAlignmentDefs()
                int[] r1 = r5.mAlignMultiple
                if (r1 == 0) goto Le
                int r1 = r1.length
                int r2 = r0.length
                if (r1 == r2) goto L13
            Le:
                int r1 = r0.length
                int[] r1 = new int[r1]
                r5.mAlignMultiple = r1
            L13:
                r1 = 0
                r2 = 0
            L15:
                int r3 = r0.length
                if (r2 >= r3) goto L25
                int[] r3 = r5.mAlignMultiple
                r4 = r0[r2]
                int r4 = androidx.leanback.widget.ItemAlignmentFacetHelper.getAlignmentPosition(r7, r4, r6)
                r3[r2] = r4
                int r2 = r2 + 1
                goto L15
            L25:
                if (r6 != 0) goto L2e
                int[] r6 = r5.mAlignMultiple
                r6 = r6[r1]
                r5.mAlignX = r6
                goto L34
            L2e:
                int[] r6 = r5.mAlignMultiple
                r6 = r6[r1]
                r5.mAlignY = r6
            L34:
                return
        }

        public final int[] getAlignMultiple() {
                r1 = this;
                int[] r0 = r1.mAlignMultiple
                return r0
        }

        public final int getAlignX() {
                r1 = this;
                int r0 = r1.mAlignX
                return r0
        }

        public final int getAlignY() {
                r1 = this;
                int r0 = r1.mAlignY
                return r0
        }

        public final androidx.leanback.widget.ItemAlignmentFacet getItemAlignmentFacet() {
                r1 = this;
                androidx.leanback.widget.ItemAlignmentFacet r0 = r1.mAlignmentFacet
                return r0
        }

        public final int getOpticalWidth(android.view.View r2) {
                r1 = this;
                int r2 = r2.getWidth()
                int r0 = r1.mLeftInset
                int r2 = r2 - r0
                int r0 = r1.mRightInset
                int r2 = r2 - r0
                return r2
        }

        public final void setAlignX(int r1) {
                r0 = this;
                r0.mAlignX = r1
                return
        }

        public final void setAlignY(int r1) {
                r0 = this;
                r0.mAlignY = r1
                return
        }

        public final void setItemAlignmentFacet(androidx.leanback.widget.ItemAlignmentFacet r1) {
                r0 = this;
                r0.mAlignmentFacet = r1
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.VisibleForTesting
    public static class OnLayoutCompleteListener {
        public OnLayoutCompleteListener() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onLayoutCompleted(androidx.recyclerview.widget.RecyclerView.State r1) {
                r0 = this;
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public final class PendingMoveSmoothScroller extends androidx.leanback.widget.GridLayoutManager.GridLinearSmoothScroller {
        private int mPendingMoves;
        private final boolean mStaggeredGrid;
        public final /* synthetic */ androidx.leanback.widget.GridLayoutManager this$0;

        public PendingMoveSmoothScroller(androidx.leanback.widget.GridLayoutManager r1, int r2, boolean r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                r0.mPendingMoves = r2
                r0.mStaggeredGrid = r3
                r1 = -2
                r0.setTargetPosition(r1)
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
        public android.graphics.PointF computeScrollVectorForPosition(int r4) {
                r3 = this;
                int r4 = r3.mPendingMoves
                if (r4 != 0) goto L6
                r4 = 0
                return r4
            L6:
                androidx.leanback.widget.GridLayoutManager r0 = r3.this$0
                int r1 = r0.mFlag
                r2 = 262144(0x40000, float:3.67342E-40)
                r1 = r1 & r2
                if (r1 == 0) goto L12
                if (r4 <= 0) goto L16
                goto L14
            L12:
                if (r4 >= 0) goto L16
            L14:
                r4 = -1
                goto L17
            L16:
                r4 = 1
            L17:
                int r0 = r0.mOrientation
                r1 = 0
                if (r0 != 0) goto L23
                android.graphics.PointF r0 = new android.graphics.PointF
                float r4 = (float) r4
                r0.<init>(r4, r1)
                return r0
            L23:
                android.graphics.PointF r0 = new android.graphics.PointF
                float r4 = (float) r4
                r0.<init>(r1, r4)
                return r0
        }

        public final void consumePendingMovesAfterLayout() {
                r3 = this;
                boolean r0 = r3.mStaggeredGrid
                if (r0 == 0) goto L11
                int r0 = r3.mPendingMoves
                if (r0 == 0) goto L11
                androidx.leanback.widget.GridLayoutManager r1 = r3.this$0
                r2 = 1
                int r0 = r1.processSelectionMoves(r2, r0)
                r3.mPendingMoves = r0
            L11:
                int r0 = r3.mPendingMoves
                if (r0 == 0) goto L2b
                if (r0 <= 0) goto L1f
                androidx.leanback.widget.GridLayoutManager r0 = r3.this$0
                boolean r0 = r0.hasCreatedLastItem()
                if (r0 != 0) goto L2b
            L1f:
                int r0 = r3.mPendingMoves
                if (r0 >= 0) goto L35
                androidx.leanback.widget.GridLayoutManager r0 = r3.this$0
                boolean r0 = r0.hasCreatedFirstItem()
                if (r0 == 0) goto L35
            L2b:
                androidx.leanback.widget.GridLayoutManager r0 = r3.this$0
                int r0 = r0.mFocusPosition
                r3.setTargetPosition(r0)
                r3.stop()
            L35:
                return
        }

        public final void consumePendingMovesBeforeLayout() {
                r5 = this;
                boolean r0 = r5.mStaggeredGrid
                if (r0 != 0) goto L72
                int r0 = r5.mPendingMoves
                if (r0 != 0) goto La
                goto L72
            La:
                r1 = 0
                if (r0 <= 0) goto L15
                androidx.leanback.widget.GridLayoutManager r0 = r5.this$0
                int r2 = r0.mFocusPosition
                int r0 = r0.mNumRows
                r3 = r5
                goto L4e
            L15:
                androidx.leanback.widget.GridLayoutManager r0 = r5.this$0
                int r2 = r0.mFocusPosition
                int r0 = r0.mNumRows
                r3 = r5
            L1c:
                int r2 = r2 - r0
            L1d:
                int r0 = r3.mPendingMoves
                if (r0 == 0) goto L55
                android.view.View r0 = r3.findViewByPosition(r2)
                if (r0 != 0) goto L28
                goto L55
            L28:
                androidx.leanback.widget.GridLayoutManager r4 = r3.this$0
                boolean r4 = r4.canScrollTo(r0)
                if (r4 != 0) goto L31
                goto L46
            L31:
                androidx.leanback.widget.GridLayoutManager r1 = r3.this$0
                r1.mFocusPosition = r2
                r4 = 0
                r1.mSubFocusPosition = r4
                int r1 = r3.mPendingMoves
                if (r1 <= 0) goto L41
                int r1 = r1 + (-1)
                r3.mPendingMoves = r1
                goto L45
            L41:
                int r1 = r1 + 1
                r3.mPendingMoves = r1
            L45:
                r1 = r0
            L46:
                int r0 = r3.mPendingMoves
                if (r0 <= 0) goto L50
                androidx.leanback.widget.GridLayoutManager r0 = r3.this$0
                int r0 = r0.mNumRows
            L4e:
                int r2 = r2 + r0
                goto L1d
            L50:
                androidx.leanback.widget.GridLayoutManager r0 = r3.this$0
                int r0 = r0.mNumRows
                goto L1c
            L55:
                if (r1 == 0) goto L72
                androidx.leanback.widget.GridLayoutManager r0 = r3.this$0
                boolean r0 = r0.hasFocus()
                if (r0 == 0) goto L72
                androidx.leanback.widget.GridLayoutManager r0 = r3.this$0
                int r2 = r0.mFlag
                r2 = r2 | 32
                r0.mFlag = r2
                r1.requestFocus()
                androidx.leanback.widget.GridLayoutManager r0 = r3.this$0
                int r1 = r0.mFlag
                r1 = r1 & (-33)
                r0.mFlag = r1
            L72:
                return
        }

        public final void decreasePendingMoves() {
                r2 = this;
                int r0 = r2.mPendingMoves
                androidx.leanback.widget.GridLayoutManager r1 = r2.this$0
                int r1 = r1.mMaxPendingMoves
                int r1 = -r1
                if (r0 <= r1) goto Ld
                int r0 = r0 + (-1)
                r2.mPendingMoves = r0
            Ld:
                return
        }

        public final void increasePendingMoves() {
                r2 = this;
                int r0 = r2.mPendingMoves
                androidx.leanback.widget.GridLayoutManager r1 = r2.this$0
                int r1 = r1.mMaxPendingMoves
                if (r0 >= r1) goto Lc
                int r0 = r0 + 1
                r2.mPendingMoves = r0
            Lc:
                return
        }

        @Override // androidx.leanback.widget.GridLayoutManager.GridLinearSmoothScroller
        public final void onStopInternal() {
                r3 = this;
                super.onStopInternal()
                r0 = 0
                r3.mPendingMoves = r0
                int r0 = r3.getTargetPosition()
                android.view.View r0 = r3.findViewByPosition(r0)
                if (r0 == 0) goto L16
                androidx.leanback.widget.GridLayoutManager r1 = r3.this$0
                r2 = 1
                r1.scrollToView(r0, r2)
            L16:
                return
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public final void updateActionForInterimTarget(androidx.recyclerview.widget.RecyclerView.SmoothScroller.Action r2) {
                r1 = this;
                int r0 = r1.mPendingMoves
                if (r0 != 0) goto L5
                return
            L5:
                super.updateActionForInterimTarget(r2)
                return
        }
    }

    public static final class SavedState implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<androidx.leanback.widget.GridLayoutManager.SavedState> CREATOR = null;
        public android.os.Bundle childStates;
        public int index;


        static {
                androidx.leanback.widget.GridLayoutManager$SavedState$1 r0 = new androidx.leanback.widget.GridLayoutManager$SavedState$1
                r0.<init>()
                androidx.leanback.widget.GridLayoutManager.SavedState.CREATOR = r0
                return
        }

        public SavedState() {
                r1 = this;
                r1.<init>()
                android.os.Bundle r0 = android.os.Bundle.EMPTY
                r1.childStates = r0
                return
        }

        public SavedState(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                android.os.Bundle r0 = android.os.Bundle.EMPTY
                r1.childStates = r0
                int r0 = r2.readInt()
                r1.index = r0
                java.lang.Class<androidx.leanback.widget.GridLayoutManager> r0 = androidx.leanback.widget.GridLayoutManager.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                android.os.Bundle r2 = r2.readBundle(r0)
                r1.childStates = r2
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                int r2 = r0.index
                r1.writeInt(r2)
                android.os.Bundle r2 = r0.childStates
                r1.writeBundle(r2)
                return
        }
    }

    static {
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            androidx.leanback.widget.GridLayoutManager.sTempRect = r0
            r0 = 2
            int[] r0 = new int[r0]
            androidx.leanback.widget.GridLayoutManager.sTwoInts = r0
            return
    }

    public GridLayoutManager(androidx.leanback.widget.BaseGridView r4) {
            r3 = this;
            r3.<init>()
            r0 = 10
            r3.mMaxPendingMoves = r0
            r0 = 0
            r3.mOrientation = r0
            androidx.recyclerview.widget.OrientationHelper r1 = androidx.recyclerview.widget.OrientationHelper.createHorizontalHelper(r3)
            r3.mOrientationHelper = r1
            android.util.SparseIntArray r1 = new android.util.SparseIntArray
            r1.<init>()
            r3.mPositionToRowInPostLayout = r1
            r1 = 221696(0x36200, float:3.10662E-40)
            r3.mFlag = r1
            r1 = 0
            r3.mChildSelectedListener = r1
            r3.mChildViewHolderSelectedListeners = r1
            r3.mChildLaidOutListener = r1
            r1 = -1
            r3.mFocusPosition = r1
            r3.mSubFocusPosition = r0
            r3.mFocusPositionOffset = r0
            r2 = 8388659(0x800033, float:1.1755015E-38)
            r3.mGravity = r2
            r2 = 1
            r3.mNumRowsRequested = r2
            r3.mFocusScrollStrategy = r0
            androidx.leanback.widget.WindowAlignment r2 = new androidx.leanback.widget.WindowAlignment
            r2.<init>()
            r3.mWindowAlignment = r2
            androidx.leanback.widget.ItemAlignment r2 = new androidx.leanback.widget.ItemAlignment
            r2.<init>()
            r3.mItemAlignment = r2
            r2 = 2
            int[] r2 = new int[r2]
            r3.mMeasuredDimension = r2
            androidx.leanback.widget.ViewsStateBundle r2 = new androidx.leanback.widget.ViewsStateBundle
            r2.<init>()
            r3.mChildrenStates = r2
            androidx.leanback.widget.GridLayoutManager$1 r2 = new androidx.leanback.widget.GridLayoutManager$1
            r2.<init>(r3)
            r3.mRequestLayoutRunnable = r2
            androidx.leanback.widget.GridLayoutManager$2 r2 = new androidx.leanback.widget.GridLayoutManager$2
            r2.<init>(r3)
            r3.mGridProvider = r2
            r3.mBaseGridView = r4
            r3.mChildVisibility = r1
            r3.setItemPrefetchEnabled(r0)
            return
    }

    private boolean appendOneColumnVisibleItems() {
            r1 = this;
            androidx.leanback.widget.Grid r0 = r1.mGrid
            boolean r0 = r0.appendOneColumnVisibleItems()
            return r0
    }

    private void appendVisibleItems() {
            r3 = this;
            androidx.leanback.widget.Grid r0 = r3.mGrid
            int r1 = r3.mFlag
            r2 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r2
            if (r1 == 0) goto L10
            int r1 = r3.mExtraLayoutSpace
            int r1 = -r1
            int r2 = r3.mExtraLayoutSpaceInPreLayout
            int r1 = r1 - r2
            goto L18
        L10:
            int r1 = r3.mSizePrimary
            int r2 = r3.mExtraLayoutSpace
            int r1 = r1 + r2
            int r2 = r3.mExtraLayoutSpaceInPreLayout
            int r1 = r1 + r2
        L18:
            r0.appendVisibleItems(r1)
            return
    }

    private void discardLayoutInfo() {
            r1 = this;
            r0 = 0
            r1.mGrid = r0
            r1.mRowSizeSecondary = r0
            int r0 = r1.mFlag
            r0 = r0 & (-1025(0xfffffffffffffbff, float:NaN))
            r1.mFlag = r0
            return
    }

    private void fastRelayout() {
            r15 = this;
            int r0 = r15.getChildCount()
            androidx.leanback.widget.Grid r1 = r15.mGrid
            int r1 = r1.getFirstVisibleIndex()
            int r2 = r15.mFlag
            r2 = r2 & (-9)
            r15.mFlag = r2
            r2 = 0
            r3 = 0
        L12:
            r4 = 1
            if (r3 >= r0) goto L99
            android.view.View r5 = r15.getChildAt(r3)
            int r6 = r15.getAdapterPositionByView(r5)
            if (r1 == r6) goto L22
        L1f:
            r2 = 1
            goto L99
        L22:
            androidx.leanback.widget.Grid r6 = r15.mGrid
            androidx.leanback.widget.Grid$Location r6 = r6.getLocation(r1)
            if (r6 != 0) goto L2b
            goto L1f
        L2b:
            int r7 = r6.row
            int r7 = r15.getRowStartSecondary(r7)
            androidx.leanback.widget.WindowAlignment r8 = r15.mWindowAlignment
            androidx.leanback.widget.WindowAlignment$Axis r8 = r8.secondAxis()
            int r8 = r8.getPaddingMin()
            int r8 = r8 + r7
            int r7 = r15.mScrollOffsetSecondary
            int r14 = r8 - r7
            int r12 = r15.getViewMin(r5)
            android.graphics.Rect r7 = androidx.leanback.widget.GridLayoutManager.sTempRect
            r15.getDecoratedBoundsWithMargins(r5, r7)
            int r8 = r15.mOrientation
            if (r8 != 0) goto L52
            int r7 = r7.width()
            goto L56
        L52:
            int r7 = r7.height()
        L56:
            android.view.ViewGroup$LayoutParams r8 = r5.getLayoutParams()
            androidx.leanback.widget.GridLayoutManager$LayoutParams r8 = (androidx.leanback.widget.GridLayoutManager.LayoutParams) r8
            boolean r8 = r8.viewNeedsUpdate()
            if (r8 == 0) goto L76
            int r8 = r15.mFlag
            r8 = r8 | 8
            r15.mFlag = r8
            androidx.recyclerview.widget.RecyclerView$Recycler r8 = r15.mRecycler
            r15.detachAndScrapView(r5, r8)
            androidx.recyclerview.widget.RecyclerView$Recycler r5 = r15.mRecycler
            android.view.View r5 = r5.getViewForPosition(r1)
            r15.addView(r5, r3)
        L76:
            r11 = r5
            r15.measureChild(r11)
            int r5 = r15.mOrientation
            if (r5 != 0) goto L83
            int r5 = r15.getDecoratedMeasuredWidthWithMargin(r11)
            goto L87
        L83:
            int r5 = r15.getDecoratedMeasuredHeightWithMargin(r11)
        L87:
            int r8 = r12 + r5
            r13 = r8
            int r10 = r6.row
            r9 = r15
            r9.layoutChild(r10, r11, r12, r13, r14)
            if (r7 == r5) goto L93
            goto L1f
        L93:
            int r3 = r3 + 1
            int r1 = r1 + 1
            goto L12
        L99:
            if (r2 == 0) goto Le6
            androidx.leanback.widget.Grid r2 = r15.mGrid
            int r2 = r2.getLastVisibleIndex()
            int r0 = r0 - r4
        La2:
            if (r0 < r3) goto Lb0
            android.view.View r4 = r15.getChildAt(r0)
            androidx.recyclerview.widget.RecyclerView$Recycler r5 = r15.mRecycler
            r15.detachAndScrapView(r4, r5)
            int r0 = r0 + (-1)
            goto La2
        Lb0:
            androidx.leanback.widget.Grid r0 = r15.mGrid
            r0.invalidateItemsAfter(r1)
            int r0 = r15.mFlag
            r1 = 65536(0x10000, float:9.1835E-41)
            r0 = r0 & r1
            if (r0 == 0) goto Ld5
            r15.appendVisibleItems()
            int r0 = r15.mFocusPosition
            if (r0 < 0) goto Le6
            if (r0 > r2) goto Le6
        Lc5:
            androidx.leanback.widget.Grid r0 = r15.mGrid
            int r0 = r0.getLastVisibleIndex()
            int r1 = r15.mFocusPosition
            if (r0 >= r1) goto Le6
            androidx.leanback.widget.Grid r0 = r15.mGrid
            r0.appendOneColumnVisibleItems()
            goto Lc5
        Ld5:
            androidx.leanback.widget.Grid r0 = r15.mGrid
            boolean r0 = r0.appendOneColumnVisibleItems()
            if (r0 == 0) goto Le6
            androidx.leanback.widget.Grid r0 = r15.mGrid
            int r0 = r0.getLastVisibleIndex()
            if (r0 >= r2) goto Le6
            goto Ld5
        Le6:
            r15.updateScrollLimits()
            r15.updateSecondaryScrollLimits()
            return
    }

    private int findImmediateChildIndex(android.view.View r4) {
            r3 = this;
            androidx.leanback.widget.BaseGridView r0 = r3.mBaseGridView
            if (r0 == 0) goto L1d
            if (r4 == r0) goto L1d
            android.view.View r4 = r3.findContainingItemView(r4)
            if (r4 == 0) goto L1d
            r0 = 0
            int r1 = r3.getChildCount()
        L11:
            if (r0 >= r1) goto L1d
            android.view.View r2 = r3.getChildAt(r0)
            if (r2 != r4) goto L1a
            return r0
        L1a:
            int r0 = r0 + 1
            goto L11
        L1d:
            r4 = -1
            return r4
    }

    private void focusToViewInLayout(boolean r9, boolean r10, int r11, int r12) {
            r8 = this;
            int r0 = r8.mFocusPosition
            android.view.View r0 = r8.findViewByPosition(r0)
            if (r0 == 0) goto L16
            if (r10 == 0) goto L16
            r4 = 0
            android.view.View r3 = r0.findFocus()
            r1 = r8
            r2 = r0
            r5 = r11
            r6 = r12
            r1.scrollToView(r2, r3, r4, r5, r6)
        L16:
            if (r0 == 0) goto L24
            if (r9 == 0) goto L24
            boolean r1 = r0.hasFocus()
            if (r1 != 0) goto L24
            r0.requestFocus()
            goto L6e
        L24:
            if (r9 != 0) goto L6e
            androidx.leanback.widget.BaseGridView r9 = r8.mBaseGridView
            boolean r9 = r9.hasFocus()
            if (r9 != 0) goto L6e
            if (r0 == 0) goto L3c
            boolean r9 = r0.hasFocusable()
            if (r9 == 0) goto L3c
            androidx.leanback.widget.BaseGridView r9 = r8.mBaseGridView
            r9.focusableViewAvailable(r0)
            goto L58
        L3c:
            r9 = 0
            int r1 = r8.getChildCount()
        L41:
            if (r9 >= r1) goto L58
            android.view.View r0 = r8.getChildAt(r9)
            if (r0 == 0) goto L55
            boolean r2 = r0.hasFocusable()
            if (r2 == 0) goto L55
            androidx.leanback.widget.BaseGridView r9 = r8.mBaseGridView
            r9.focusableViewAvailable(r0)
            goto L58
        L55:
            int r9 = r9 + 1
            goto L41
        L58:
            r3 = r0
            if (r10 == 0) goto L6e
            if (r3 == 0) goto L6e
            boolean r9 = r3.hasFocus()
            if (r9 == 0) goto L6e
            r5 = 0
            android.view.View r4 = r3.findFocus()
            r2 = r8
            r6 = r11
            r7 = r12
            r2.scrollToView(r3, r4, r5, r6, r7)
        L6e:
            return
    }

    private void forceRequestLayout() {
            r2 = this;
            androidx.leanback.widget.BaseGridView r0 = r2.mBaseGridView
            java.lang.Runnable r1 = r2.mRequestLayoutRunnable
            androidx.core.view.ViewCompat.postOnAnimation(r0, r1)
            return
    }

    private int getAdapterPositionByIndex(int r1) {
            r0 = this;
            android.view.View r1 = r0.getChildAt(r1)
            int r1 = r0.getAdapterPositionByView(r1)
            return r1
    }

    private int getAdapterPositionByView(android.view.View r3) {
            r2 = this;
            r0 = -1
            if (r3 != 0) goto L4
            return r0
        L4:
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.leanback.widget.GridLayoutManager$LayoutParams r3 = (androidx.leanback.widget.GridLayoutManager.LayoutParams) r3
            if (r3 == 0) goto L18
            boolean r1 = r3.isItemRemoved()
            if (r1 == 0) goto L13
            goto L18
        L13:
            int r3 = r3.getViewAdapterPosition()
            return r3
        L18:
            return r0
    }

    private int getAdjustedPrimaryAlignedScrollDistance(int r2, android.view.View r3, android.view.View r4) {
            r1 = this;
            int r4 = r1.getSubPositionByView(r3, r4)
            if (r4 == 0) goto L1b
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.leanback.widget.GridLayoutManager$LayoutParams r3 = (androidx.leanback.widget.GridLayoutManager.LayoutParams) r3
            int[] r0 = r3.getAlignMultiple()
            r4 = r0[r4]
            int[] r3 = r3.getAlignMultiple()
            r0 = 0
            r3 = r3[r0]
            int r4 = r4 - r3
            int r2 = r2 + r4
        L1b:
            return r2
    }

    private int getAdjustedViewCenter(android.view.View r3) {
            r2 = this;
            boolean r0 = r3.hasFocus()
            if (r0 == 0) goto L17
            android.view.View r0 = r3.findFocus()
            if (r0 == 0) goto L17
            if (r0 == r3) goto L17
            int r1 = r2.getViewCenter(r3)
            int r3 = r2.getAdjustedPrimaryAlignedScrollDistance(r1, r3, r0)
            return r3
        L17:
            int r3 = r2.getViewCenter(r3)
            return r3
    }

    private boolean getAlignedPosition(android.view.View r3, android.view.View r4, int[] r5) {
            r2 = this;
            int r0 = r2.getPrimaryAlignedScrollDistance(r3)
            if (r4 == 0) goto La
            int r0 = r2.getAdjustedPrimaryAlignedScrollDistance(r0, r3, r4)
        La:
            int r3 = r2.getSecondaryScrollDistance(r3)
            int r4 = r2.mPrimaryScrollExtra
            int r0 = r0 + r4
            r4 = 1
            r1 = 0
            if (r0 != 0) goto L1d
            if (r3 == 0) goto L18
            goto L1d
        L18:
            r5[r1] = r1
            r5[r4] = r1
            return r1
        L1d:
            r5[r1] = r0
            r5[r4] = r3
            return r4
    }

    private int getMovement(int r10) {
            r9 = this;
            int r0 = r9.mOrientation
            r1 = 130(0x82, float:1.82E-43)
            r2 = 66
            r3 = 33
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 17
            r8 = 1
            if (r0 != 0) goto L2b
            r0 = 262144(0x40000, float:3.67342E-40)
            if (r10 == r7) goto L25
            if (r10 == r3) goto L23
            if (r10 == r2) goto L1d
            if (r10 == r1) goto L1b
            goto L46
        L1b:
            r4 = 3
            goto L48
        L1d:
            int r10 = r9.mFlag
            r10 = r10 & r0
            if (r10 != 0) goto L48
            goto L38
        L23:
            r4 = 2
            goto L48
        L25:
            int r10 = r9.mFlag
            r10 = r10 & r0
            if (r10 != 0) goto L38
            goto L48
        L2b:
            if (r0 != r8) goto L46
            r0 = 524288(0x80000, float:7.34684E-40)
            if (r10 == r7) goto L40
            if (r10 == r3) goto L48
            if (r10 == r2) goto L3a
            if (r10 == r1) goto L38
            goto L46
        L38:
            r4 = 1
            goto L48
        L3a:
            int r10 = r9.mFlag
            r10 = r10 & r0
            if (r10 != 0) goto L23
            goto L1b
        L40:
            int r10 = r9.mFlag
            r10 = r10 & r0
            if (r10 != 0) goto L1b
            goto L23
        L46:
            r4 = 17
        L48:
            return r4
    }

    private boolean getNoneAlignedPosition(android.view.View r13, int[] r14) {
            r12 = this;
            int r0 = r12.getAdapterPositionByView(r13)
            int r1 = r12.getViewMin(r13)
            int r2 = r12.getViewMax(r13)
            androidx.leanback.widget.WindowAlignment r3 = r12.mWindowAlignment
            androidx.leanback.widget.WindowAlignment$Axis r3 = r3.mainAxis()
            int r3 = r3.getPaddingMin()
            androidx.leanback.widget.WindowAlignment r4 = r12.mWindowAlignment
            androidx.leanback.widget.WindowAlignment$Axis r4 = r4.mainAxis()
            int r4 = r4.getClientSize()
            androidx.leanback.widget.Grid r5 = r12.mGrid
            int r5 = r5.getRowIndex(r0)
            r6 = 1
            r7 = 0
            r8 = 2
            r9 = 0
            if (r1 >= r3) goto L6f
            int r1 = r12.mFocusScrollStrategy
            if (r1 != r8) goto L6c
            r1 = r13
        L31:
            boolean r10 = r12.prependOneColumnVisibleItems()
            if (r10 == 0) goto L69
            androidx.leanback.widget.Grid r1 = r12.mGrid
            int r10 = r1.getFirstVisibleIndex()
            androidx.collection.CircularIntArray[] r1 = r1.getItemPositionsInRows(r10, r0)
            r1 = r1[r5]
            int r10 = r1.get(r7)
            android.view.View r10 = r12.findViewByPosition(r10)
            int r11 = r12.getViewMin(r10)
            int r11 = r2 - r11
            if (r11 <= r4) goto L67
            int r0 = r1.size()
            if (r0 <= r8) goto L64
            int r0 = r1.get(r8)
            android.view.View r0 = r12.findViewByPosition(r0)
            r2 = r9
            r9 = r0
            goto La5
        L64:
            r2 = r9
            r9 = r10
            goto La5
        L67:
            r1 = r10
            goto L31
        L69:
            r2 = r9
            r9 = r1
            goto La5
        L6c:
            r2 = r9
        L6d:
            r9 = r13
            goto La5
        L6f:
            int r10 = r4 + r3
            if (r2 <= r10) goto La4
            int r2 = r12.mFocusScrollStrategy
            if (r2 != r8) goto La2
        L77:
            androidx.leanback.widget.Grid r2 = r12.mGrid
            int r8 = r2.getLastVisibleIndex()
            androidx.collection.CircularIntArray[] r2 = r2.getItemPositionsInRows(r0, r8)
            r2 = r2[r5]
            int r8 = r2.size()
            int r8 = r8 - r6
            int r2 = r2.get(r8)
            android.view.View r2 = r12.findViewByPosition(r2)
            int r8 = r12.getViewMax(r2)
            int r8 = r8 - r1
            if (r8 <= r4) goto L99
            r2 = r9
            goto L9f
        L99:
            boolean r8 = r12.appendOneColumnVisibleItems()
            if (r8 != 0) goto L77
        L9f:
            if (r2 == 0) goto L6d
            goto La5
        La2:
            r2 = r13
            goto La5
        La4:
            r2 = r9
        La5:
            if (r9 == 0) goto Lad
            int r0 = r12.getViewMin(r9)
        Lab:
            int r0 = r0 - r3
            goto Lb6
        Lad:
            if (r2 == 0) goto Lb5
            int r0 = r12.getViewMax(r2)
            int r3 = r3 + r4
            goto Lab
        Lb5:
            r0 = 0
        Lb6:
            if (r9 == 0) goto Lba
            r13 = r9
            goto Lbd
        Lba:
            if (r2 == 0) goto Lbd
            r13 = r2
        Lbd:
            int r13 = r12.getSecondaryScrollDistance(r13)
            if (r0 != 0) goto Lc7
            if (r13 == 0) goto Lc6
            goto Lc7
        Lc6:
            return r7
        Lc7:
            r14[r7] = r0
            r14[r6] = r13
            return r6
    }

    private int getPrimaryAlignedScrollDistance(android.view.View r2) {
            r1 = this;
            androidx.leanback.widget.WindowAlignment r0 = r1.mWindowAlignment
            androidx.leanback.widget.WindowAlignment$Axis r0 = r0.mainAxis()
            int r2 = r1.getViewCenter(r2)
            int r2 = r0.getScroll(r2)
            return r2
    }

    private int getRowSizeSecondary(int r2) {
            r1 = this;
            int r0 = r1.mFixedRowSizeSecondary
            if (r0 == 0) goto L5
            return r0
        L5:
            int[] r0 = r1.mRowSizeSecondary
            if (r0 != 0) goto Lb
            r2 = 0
            return r2
        Lb:
            r2 = r0[r2]
            return r2
    }

    private int getSecondaryScrollDistance(android.view.View r2) {
            r1 = this;
            int r2 = r1.getViewCenterSecondary(r2)
            androidx.leanback.widget.WindowAlignment r0 = r1.mWindowAlignment
            androidx.leanback.widget.WindowAlignment$Axis r0 = r0.secondAxis()
            int r2 = r0.getScroll(r2)
            return r2
    }

    private int getSizeSecondary() {
            r2 = this;
            int r0 = r2.mFlag
            r1 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L9
            r0 = 0
            goto Ld
        L9:
            int r0 = r2.mNumRows
            int r0 = r0 + (-1)
        Ld:
            int r1 = r2.getRowStartSecondary(r0)
            int r0 = r2.getRowSizeSecondary(r0)
            int r1 = r1 + r0
            return r1
    }

    private int getViewCenter(android.view.View r2) {
            r1 = this;
            int r0 = r1.mOrientation
            if (r0 != 0) goto L9
            int r2 = r1.getViewCenterX(r2)
            goto Ld
        L9:
            int r2 = r1.getViewCenterY(r2)
        Ld:
            return r2
    }

    private int getViewCenterSecondary(android.view.View r2) {
            r1 = this;
            int r0 = r1.mOrientation
            if (r0 != 0) goto L9
            int r2 = r1.getViewCenterY(r2)
            goto Ld
        L9:
            int r2 = r1.getViewCenterX(r2)
        Ld:
            return r2
    }

    private int getViewCenterX(android.view.View r3) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            androidx.leanback.widget.GridLayoutManager$LayoutParams r0 = (androidx.leanback.widget.GridLayoutManager.LayoutParams) r0
            java.util.Objects.requireNonNull(r0)
            int r3 = r3.getLeft()
            int r1 = r0.mLeftInset
            int r3 = r3 + r1
            int r0 = r0.getAlignX()
            int r3 = r3 + r0
            return r3
    }

    private int getViewCenterY(android.view.View r3) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            androidx.leanback.widget.GridLayoutManager$LayoutParams r0 = (androidx.leanback.widget.GridLayoutManager.LayoutParams) r0
            java.util.Objects.requireNonNull(r0)
            int r3 = r3.getTop()
            int r1 = r0.mTopInset
            int r3 = r3 + r1
            int r0 = r0.getAlignY()
            int r3 = r3 + r0
            return r3
    }

    private boolean gridOnRequestFocusInDescendantsAligned(androidx.recyclerview.widget.RecyclerView r1, int r2, android.graphics.Rect r3) {
            r0 = this;
            int r1 = r0.mFocusPosition
            android.view.View r1 = r0.findViewByPosition(r1)
            if (r1 == 0) goto Ld
            boolean r1 = r1.requestFocus(r2, r3)
            return r1
        Ld:
            r1 = 0
            return r1
    }

    private boolean gridOnRequestFocusInDescendantsUnaligned(androidx.recyclerview.widget.RecyclerView r9, int r10, android.graphics.Rect r11) {
            r8 = this;
            int r9 = r8.getChildCount()
            r0 = r10 & 2
            r1 = 0
            r2 = -1
            r3 = 1
            if (r0 == 0) goto Lf
            r2 = r9
            r9 = 0
            r0 = 1
            goto L12
        Lf:
            int r9 = r9 + (-1)
            r0 = -1
        L12:
            androidx.leanback.widget.WindowAlignment r4 = r8.mWindowAlignment
            androidx.leanback.widget.WindowAlignment$Axis r4 = r4.mainAxis()
            int r4 = r4.getPaddingMin()
            androidx.leanback.widget.WindowAlignment r5 = r8.mWindowAlignment
            androidx.leanback.widget.WindowAlignment$Axis r5 = r5.mainAxis()
            int r5 = r5.getClientSize()
            int r5 = r5 + r4
        L27:
            if (r9 == r2) goto L48
            android.view.View r6 = r8.getChildAt(r9)
            int r7 = r6.getVisibility()
            if (r7 != 0) goto L46
            int r7 = r8.getViewMin(r6)
            if (r7 < r4) goto L46
            int r7 = r8.getViewMax(r6)
            if (r7 > r5) goto L46
            boolean r6 = r6.requestFocus(r10, r11)
            if (r6 == 0) goto L46
            return r3
        L46:
            int r9 = r9 + r0
            goto L27
        L48:
            return r1
    }

    private void initScrollController() {
            r3 = this;
            androidx.leanback.widget.WindowAlignment r0 = r3.mWindowAlignment
            r0.reset()
            androidx.leanback.widget.WindowAlignment r0 = r3.mWindowAlignment
            androidx.leanback.widget.WindowAlignment$Axis r0 = r0.horizontal
            int r1 = r3.getWidth()
            r0.setSize(r1)
            androidx.leanback.widget.WindowAlignment r0 = r3.mWindowAlignment
            androidx.leanback.widget.WindowAlignment$Axis r0 = r0.vertical
            int r1 = r3.getHeight()
            r0.setSize(r1)
            androidx.leanback.widget.WindowAlignment r0 = r3.mWindowAlignment
            androidx.leanback.widget.WindowAlignment$Axis r0 = r0.horizontal
            int r1 = r3.getPaddingLeft()
            int r2 = r3.getPaddingRight()
            r0.setPadding(r1, r2)
            androidx.leanback.widget.WindowAlignment r0 = r3.mWindowAlignment
            androidx.leanback.widget.WindowAlignment$Axis r0 = r0.vertical
            int r1 = r3.getPaddingTop()
            int r2 = r3.getPaddingBottom()
            r0.setPadding(r1, r2)
            androidx.leanback.widget.WindowAlignment r0 = r3.mWindowAlignment
            androidx.leanback.widget.WindowAlignment$Axis r0 = r0.mainAxis()
            int r0 = r0.getSize()
            r3.mSizePrimary = r0
            r0 = 0
            r3.mScrollOffsetSecondary = r0
            return
    }

    private boolean layoutInit() {
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$State r0 = r5.mState
            int r0 = r0.getItemCount()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L10
            r5.mFocusPosition = r1
            r5.mSubFocusPosition = r3
            goto L22
        L10:
            int r4 = r5.mFocusPosition
            if (r4 < r0) goto L1a
            int r0 = r0 - r2
            r5.mFocusPosition = r0
            r5.mSubFocusPosition = r3
            goto L22
        L1a:
            if (r4 != r1) goto L22
            if (r0 <= 0) goto L22
            r5.mFocusPosition = r3
            r5.mSubFocusPosition = r3
        L22:
            androidx.recyclerview.widget.RecyclerView$State r0 = r5.mState
            boolean r0 = r0.didStructureChange()
            if (r0 != 0) goto L52
            androidx.leanback.widget.Grid r0 = r5.mGrid
            if (r0 == 0) goto L52
            int r0 = r0.getFirstVisibleIndex()
            if (r0 < 0) goto L52
            int r0 = r5.mFlag
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L52
            androidx.leanback.widget.Grid r0 = r5.mGrid
            int r0 = r0.getNumRows()
            int r1 = r5.mNumRows
            if (r0 != r1) goto L52
            r5.updateScrollController()
            r5.updateSecondaryScrollLimits()
            androidx.leanback.widget.Grid r0 = r5.mGrid
            int r1 = r5.mSpacingPrimary
            r0.setSpacing(r1)
            return r2
        L52:
            int r0 = r5.mFlag
            r0 = r0 & (-257(0xfffffffffffffeff, float:NaN))
            r5.mFlag = r0
            androidx.leanback.widget.Grid r0 = r5.mGrid
            r1 = 262144(0x40000, float:3.67342E-40)
            if (r0 == 0) goto L76
            int r4 = r5.mNumRows
            int r0 = r0.getNumRows()
            if (r4 != r0) goto L76
            int r0 = r5.mFlag
            r0 = r0 & r1
            if (r0 == 0) goto L6d
            r0 = 1
            goto L6e
        L6d:
            r0 = 0
        L6e:
            androidx.leanback.widget.Grid r4 = r5.mGrid
            boolean r4 = r4.isReversedFlow()
            if (r0 == r4) goto L8f
        L76:
            int r0 = r5.mNumRows
            androidx.leanback.widget.Grid r0 = androidx.leanback.widget.Grid.createGrid(r0)
            r5.mGrid = r0
            androidx.leanback.widget.Grid$Provider r4 = r5.mGridProvider
            r0.setProvider(r4)
            androidx.leanback.widget.Grid r0 = r5.mGrid
            int r4 = r5.mFlag
            r1 = r1 & r4
            if (r1 == 0) goto L8b
            goto L8c
        L8b:
            r2 = 0
        L8c:
            r0.setReversedFlow(r2)
        L8f:
            r5.initScrollController()
            r5.updateSecondaryScrollLimits()
            androidx.leanback.widget.Grid r0 = r5.mGrid
            int r1 = r5.mSpacingPrimary
            r0.setSpacing(r1)
            androidx.recyclerview.widget.RecyclerView$Recycler r0 = r5.mRecycler
            r5.detachAndScrapAttachedViews(r0)
            androidx.leanback.widget.Grid r0 = r5.mGrid
            r0.resetVisibleIndex()
            androidx.leanback.widget.WindowAlignment r0 = r5.mWindowAlignment
            androidx.leanback.widget.WindowAlignment$Axis r0 = r0.mainAxis()
            r0.invalidateScrollMin()
            androidx.leanback.widget.WindowAlignment r0 = r5.mWindowAlignment
            androidx.leanback.widget.WindowAlignment$Axis r0 = r0.mainAxis()
            r0.invalidateScrollMax()
            return r3
    }

    private void leaveContext() {
            r1 = this;
            r0 = 0
            r1.mRecycler = r0
            r1.mState = r0
            r0 = 0
            r1.mPositionDeltaInPreLayout = r0
            r1.mExtraLayoutSpaceInPreLayout = r0
            return
    }

    private void measureScrapChild(int r6, int r7, int r8, int[] r9) {
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$Recycler r0 = r5.mRecycler
            android.view.View r6 = r0.getViewForPosition(r6)
            if (r6 == 0) goto L5f
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            androidx.leanback.widget.GridLayoutManager$LayoutParams r0 = (androidx.leanback.widget.GridLayoutManager.LayoutParams) r0
            android.graphics.Rect r1 = androidx.leanback.widget.GridLayoutManager.sTempRect
            r5.calculateItemDecorationsForChild(r6, r1)
            int r2 = r0.leftMargin
            int r3 = r0.rightMargin
            int r2 = r2 + r3
            int r3 = r1.left
            int r2 = r2 + r3
            int r3 = r1.right
            int r2 = r2 + r3
            int r3 = r0.topMargin
            int r4 = r0.bottomMargin
            int r3 = r3 + r4
            int r4 = r1.top
            int r3 = r3 + r4
            int r1 = r1.bottom
            int r3 = r3 + r1
            int r1 = r5.getPaddingLeft()
            int r4 = r5.getPaddingRight()
            int r4 = r4 + r1
            int r4 = r4 + r2
            int r1 = r0.width
            int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r4, r1)
            int r1 = r5.getPaddingTop()
            int r2 = r5.getPaddingBottom()
            int r2 = r2 + r1
            int r2 = r2 + r3
            int r0 = r0.height
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r8, r2, r0)
            r6.measure(r7, r8)
            r7 = 0
            int r8 = r5.getDecoratedMeasuredWidthWithMargin(r6)
            r9[r7] = r8
            r7 = 1
            int r8 = r5.getDecoratedMeasuredHeightWithMargin(r6)
            r9[r7] = r8
            androidx.recyclerview.widget.RecyclerView$Recycler r7 = r5.mRecycler
            r7.recycleView(r6)
        L5f:
            return
    }

    private void offsetChildrenPrimary(int r5) {
            r4 = this;
            int r0 = r4.getChildCount()
            int r1 = r4.mOrientation
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L16
        La:
            if (r2 >= r0) goto L22
            android.view.View r1 = r4.getChildAt(r2)
            r1.offsetTopAndBottom(r5)
            int r2 = r2 + 1
            goto La
        L16:
            if (r2 >= r0) goto L22
            android.view.View r1 = r4.getChildAt(r2)
            r1.offsetLeftAndRight(r5)
            int r2 = r2 + 1
            goto L16
        L22:
            return
    }

    private void offsetChildrenSecondary(int r4) {
            r3 = this;
            int r0 = r3.getChildCount()
            int r1 = r3.mOrientation
            r2 = 0
            if (r1 != 0) goto L15
        L9:
            if (r2 >= r0) goto L21
            android.view.View r1 = r3.getChildAt(r2)
            r1.offsetTopAndBottom(r4)
            int r2 = r2 + 1
            goto L9
        L15:
            if (r2 >= r0) goto L21
            android.view.View r1 = r3.getChildAt(r2)
            r1.offsetLeftAndRight(r4)
            int r2 = r2 + 1
            goto L15
        L21:
            return
    }

    private boolean prependOneColumnVisibleItems() {
            r1 = this;
            androidx.leanback.widget.Grid r0 = r1.mGrid
            boolean r0 = r0.prependOneColumnVisibleItems()
            return r0
    }

    private void prependVisibleItems() {
            r3 = this;
            androidx.leanback.widget.Grid r0 = r3.mGrid
            int r1 = r3.mFlag
            r2 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r2
            if (r1 == 0) goto L12
            int r1 = r3.mSizePrimary
            int r2 = r3.mExtraLayoutSpace
            int r1 = r1 + r2
            int r2 = r3.mExtraLayoutSpaceInPreLayout
            int r1 = r1 + r2
            goto L18
        L12:
            int r1 = r3.mExtraLayoutSpace
            int r1 = -r1
            int r2 = r3.mExtraLayoutSpaceInPreLayout
            int r1 = r1 - r2
        L18:
            r0.prependVisibleItems(r1)
            return
    }

    private void processPendingMovement(boolean r5) {
            r4 = this;
            if (r5 == 0) goto L9
            boolean r0 = r4.hasCreatedLastItem()
            if (r0 == 0) goto L10
            goto Lf
        L9:
            boolean r0 = r4.hasCreatedFirstItem()
            if (r0 == 0) goto L10
        Lf:
            return
        L10:
            androidx.leanback.widget.GridLayoutManager$PendingMoveSmoothScroller r0 = r4.mPendingMoveSmoothScroller
            if (r0 != 0) goto L31
            androidx.leanback.widget.BaseGridView r0 = r4.mBaseGridView
            r0.stopScroll()
            androidx.leanback.widget.GridLayoutManager$PendingMoveSmoothScroller r0 = new androidx.leanback.widget.GridLayoutManager$PendingMoveSmoothScroller
            r1 = 1
            if (r5 == 0) goto L20
            r5 = 1
            goto L21
        L20:
            r5 = -1
        L21:
            int r2 = r4.mNumRows
            r3 = 0
            if (r2 <= r1) goto L27
            goto L28
        L27:
            r1 = 0
        L28:
            r0.<init>(r4, r5, r1)
            r4.mFocusPositionOffset = r3
            r4.startSmoothScroll(r0)
            goto L3a
        L31:
            if (r5 == 0) goto L37
            r0.increasePendingMoves()
            goto L3a
        L37:
            r0.decreasePendingMoves()
        L3a:
            return
    }

    private boolean processRowSizeSecondary(boolean r17) {
            r16 = this;
            r0 = r16
            int r1 = r0.mFixedRowSizeSecondary
            r2 = 0
            if (r1 != 0) goto Lfc
            int[] r1 = r0.mRowSizeSecondary
            if (r1 != 0) goto Ld
            goto Lfc
        Ld:
            androidx.leanback.widget.Grid r1 = r0.mGrid
            r3 = 0
            if (r1 != 0) goto L14
            r1 = r3
            goto L18
        L14:
            androidx.collection.CircularIntArray[] r1 = r1.getItemPositionsInRows()
        L18:
            r4 = -1
            r5 = 0
            r6 = 0
            r7 = -1
        L1c:
            int r8 = r0.mNumRows
            if (r5 >= r8) goto Lfb
            if (r1 != 0) goto L24
            r8 = r3
            goto L26
        L24:
            r8 = r1[r5]
        L26:
            if (r8 != 0) goto L2a
            r9 = 0
            goto L2e
        L2a:
            int r9 = r8.size()
        L2e:
            r10 = 0
            r11 = -1
        L30:
            if (r10 >= r9) goto L64
            int r12 = r8.get(r10)
            int r13 = r10 + 1
            int r13 = r8.get(r13)
        L3c:
            if (r12 > r13) goto L61
            int r14 = r0.mPositionDeltaInPreLayout
            int r14 = r12 - r14
            android.view.View r14 = r0.findViewByPosition(r14)
            if (r14 != 0) goto L49
            goto L5e
        L49:
            if (r17 == 0) goto L4e
            r0.measureChild(r14)
        L4e:
            int r15 = r0.mOrientation
            if (r15 != 0) goto L57
            int r14 = r0.getDecoratedMeasuredHeightWithMargin(r14)
            goto L5b
        L57:
            int r14 = r0.getDecoratedMeasuredWidthWithMargin(r14)
        L5b:
            if (r14 <= r11) goto L5e
            r11 = r14
        L5e:
            int r12 = r12 + 1
            goto L3c
        L61:
            int r10 = r10 + 2
            goto L30
        L64:
            androidx.recyclerview.widget.RecyclerView$State r8 = r0.mState
            int r8 = r8.getItemCount()
            androidx.leanback.widget.BaseGridView r9 = r0.mBaseGridView
            boolean r9 = r9.hasFixedSize()
            r10 = 1
            if (r9 != 0) goto Leb
            if (r17 == 0) goto Leb
            if (r11 >= 0) goto Leb
            if (r8 <= 0) goto Leb
            if (r7 >= 0) goto Le8
            int r9 = r0.mFocusPosition
            if (r9 >= 0) goto L81
            r9 = 0
            goto L85
        L81:
            if (r9 < r8) goto L85
            int r9 = r8 + (-1)
        L85:
            int r12 = r16.getChildCount()
            if (r12 <= 0) goto Lca
            androidx.leanback.widget.BaseGridView r12 = r0.mBaseGridView
            android.view.View r13 = r0.getChildAt(r2)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r12 = r12.getChildViewHolder(r13)
            int r12 = r12.getLayoutPosition()
            androidx.leanback.widget.BaseGridView r13 = r0.mBaseGridView
            int r14 = r16.getChildCount()
            int r14 = r14 - r10
            android.view.View r14 = r0.getChildAt(r14)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r13 = r13.getChildViewHolder(r14)
            int r13 = r13.getLayoutPosition()
            if (r9 < r12) goto Lca
            if (r9 > r13) goto Lca
            int r14 = r9 - r12
            int r9 = r13 - r9
            if (r14 > r9) goto Lb9
            int r9 = r12 + (-1)
            goto Lbb
        Lb9:
            int r9 = r13 + 1
        Lbb:
            if (r9 >= 0) goto Lc4
            int r14 = r8 + (-1)
            if (r13 >= r14) goto Lc4
            int r9 = r13 + 1
            goto Lca
        Lc4:
            if (r9 < r8) goto Lca
            if (r12 <= 0) goto Lca
            int r9 = r12 + (-1)
        Lca:
            if (r9 < 0) goto Le8
            if (r9 >= r8) goto Le8
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2)
            int[] r12 = r0.mMeasuredDimension
            r0.measureScrapChild(r9, r7, r8, r12)
            int r7 = r0.mOrientation
            if (r7 != 0) goto Le4
            int[] r7 = r0.mMeasuredDimension
            r7 = r7[r10]
            goto Le8
        Le4:
            int[] r7 = r0.mMeasuredDimension
            r7 = r7[r2]
        Le8:
            if (r7 < 0) goto Leb
            r11 = r7
        Leb:
            if (r11 >= 0) goto Lee
            r11 = 0
        Lee:
            int[] r8 = r0.mRowSizeSecondary
            r9 = r8[r5]
            if (r9 == r11) goto Lf7
            r8[r5] = r11
            r6 = 1
        Lf7:
            int r5 = r5 + 1
            goto L1c
        Lfb:
            return r6
        Lfc:
            return r2
    }

    private void removeInvisibleViewsAtEnd() {
            r4 = this;
            int r0 = r4.mFlag
            r1 = 65600(0x10040, float:9.1925E-41)
            r1 = r1 & r0
            r2 = 65536(0x10000, float:9.1835E-41)
            if (r1 != r2) goto L1f
            androidx.leanback.widget.Grid r1 = r4.mGrid
            int r2 = r4.mFocusPosition
            r3 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r3
            if (r0 == 0) goto L17
            int r0 = r4.mExtraLayoutSpace
            int r0 = -r0
            goto L1c
        L17:
            int r0 = r4.mSizePrimary
            int r3 = r4.mExtraLayoutSpace
            int r0 = r0 + r3
        L1c:
            r1.removeInvisibleItemsAtEnd(r2, r0)
        L1f:
            return
    }

    private void removeInvisibleViewsAtFront() {
            r4 = this;
            int r0 = r4.mFlag
            r1 = 65600(0x10040, float:9.1925E-41)
            r1 = r1 & r0
            r2 = 65536(0x10000, float:9.1835E-41)
            if (r1 != r2) goto L1f
            androidx.leanback.widget.Grid r1 = r4.mGrid
            int r2 = r4.mFocusPosition
            r3 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r3
            if (r0 == 0) goto L19
            int r0 = r4.mSizePrimary
            int r3 = r4.mExtraLayoutSpace
            int r0 = r0 + r3
            goto L1c
        L19:
            int r0 = r4.mExtraLayoutSpace
            int r0 = -r0
        L1c:
            r1.removeInvisibleItemsAtFront(r2, r0)
        L1f:
            return
    }

    private void saveContext(androidx.recyclerview.widget.RecyclerView.Recycler r3, androidx.recyclerview.widget.RecyclerView.State r4) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$Recycler r0 = r2.mRecycler
            if (r0 != 0) goto L8
            androidx.recyclerview.widget.RecyclerView$State r0 = r2.mState
            if (r0 == 0) goto Lf
        L8:
            java.lang.String r0 = "GridLayoutManager"
            java.lang.String r1 = "Recycler information was not released, bug!"
            android.util.Log.e(r0, r1)
        Lf:
            r2.mRecycler = r3
            r2.mState = r4
            r3 = 0
            r2.mPositionDeltaInPreLayout = r3
            r2.mExtraLayoutSpaceInPreLayout = r3
            return
    }

    private int scrollDirectionPrimary(int r7) {
            r6 = this;
            int r0 = r6.mFlag
            r1 = r0 & 64
            r2 = 1
            if (r1 != 0) goto L41
            r0 = r0 & 3
            if (r0 == r2) goto L41
            if (r7 <= 0) goto L26
            androidx.leanback.widget.WindowAlignment r0 = r6.mWindowAlignment
            androidx.leanback.widget.WindowAlignment$Axis r0 = r0.mainAxis()
            boolean r0 = r0.isMaxUnknown()
            if (r0 != 0) goto L41
            androidx.leanback.widget.WindowAlignment r0 = r6.mWindowAlignment
            androidx.leanback.widget.WindowAlignment$Axis r0 = r0.mainAxis()
            int r0 = r0.getMaxScroll()
            if (r7 <= r0) goto L41
            goto L40
        L26:
            if (r7 >= 0) goto L41
            androidx.leanback.widget.WindowAlignment r0 = r6.mWindowAlignment
            androidx.leanback.widget.WindowAlignment$Axis r0 = r0.mainAxis()
            boolean r0 = r0.isMinUnknown()
            if (r0 != 0) goto L41
            androidx.leanback.widget.WindowAlignment r0 = r6.mWindowAlignment
            androidx.leanback.widget.WindowAlignment$Axis r0 = r0.mainAxis()
            int r0 = r0.getMinScroll()
            if (r7 >= r0) goto L41
        L40:
            r7 = r0
        L41:
            r0 = 0
            if (r7 != 0) goto L45
            return r0
        L45:
            int r1 = -r7
            r6.offsetChildrenPrimary(r1)
            int r1 = r6.mFlag
            r1 = r1 & 3
            if (r1 != r2) goto L53
            r6.updateScrollLimits()
            return r7
        L53:
            int r1 = r6.getChildCount()
            int r3 = r6.mFlag
            r4 = 262144(0x40000, float:3.67342E-40)
            r3 = r3 & r4
            if (r3 == 0) goto L61
            if (r7 <= 0) goto L67
            goto L63
        L61:
            if (r7 >= 0) goto L67
        L63:
            r6.prependVisibleItems()
            goto L6a
        L67:
            r6.appendVisibleItems()
        L6a:
            int r3 = r6.getChildCount()
            if (r3 <= r1) goto L72
            r1 = 1
            goto L73
        L72:
            r1 = 0
        L73:
            int r3 = r6.getChildCount()
            int r5 = r6.mFlag
            r4 = r4 & r5
            if (r4 == 0) goto L7f
            if (r7 <= 0) goto L85
            goto L81
        L7f:
            if (r7 >= 0) goto L85
        L81:
            r6.removeInvisibleViewsAtEnd()
            goto L88
        L85:
            r6.removeInvisibleViewsAtFront()
        L88:
            int r4 = r6.getChildCount()
            if (r4 >= r3) goto L8f
            goto L90
        L8f:
            r2 = 0
        L90:
            r0 = r1 | r2
            if (r0 == 0) goto L97
            r6.updateRowSecondarySizeRefresh()
        L97:
            androidx.leanback.widget.BaseGridView r0 = r6.mBaseGridView
            r0.invalidate()
            r6.updateScrollLimits()
            return r7
    }

    private int scrollDirectionSecondary(int r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            int r0 = -r2
            r1.offsetChildrenSecondary(r0)
            int r0 = r1.mScrollOffsetSecondary
            int r0 = r0 + r2
            r1.mScrollOffsetSecondary = r0
            r1.updateSecondaryScrollLimits()
            androidx.leanback.widget.BaseGridView r0 = r1.mBaseGridView
            r0.invalidate()
            return r2
    }

    private void scrollGrid(int r4, int r5, boolean r6) {
            r3 = this;
            int r0 = r3.mFlag
            r0 = r0 & 3
            r1 = 1
            if (r0 != r1) goto Le
            r3.scrollDirectionPrimary(r4)
            r3.scrollDirectionSecondary(r5)
            goto L26
        Le:
            int r0 = r3.mOrientation
            if (r0 != 0) goto L13
            goto L16
        L13:
            r2 = r5
            r5 = r4
            r4 = r2
        L16:
            if (r6 == 0) goto L1e
            androidx.leanback.widget.BaseGridView r6 = r3.mBaseGridView
            r6.smoothScrollBy(r4, r5)
            goto L26
        L1e:
            androidx.leanback.widget.BaseGridView r6 = r3.mBaseGridView
            r6.scrollBy(r4, r5)
            r3.dispatchChildSelectedAndPositioned()
        L26:
            return
    }

    private void scrollToView(android.view.View r7, android.view.View r8, boolean r9) {
            r6 = this;
            r4 = 0
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.scrollToView(r1, r2, r3, r4, r5)
            return
    }

    private void scrollToView(android.view.View r6, android.view.View r7, boolean r8, int r9, int r10) {
            r5 = this;
            int r0 = r5.mFlag
            r0 = r0 & 64
            if (r0 == 0) goto L7
            return
        L7:
            int r0 = r5.getAdapterPositionByView(r6)
            int r1 = r5.getSubPositionByView(r6, r7)
            int r2 = r5.mFocusPosition
            r3 = 0
            r4 = 1
            if (r0 != r2) goto L19
            int r2 = r5.mSubFocusPosition
            if (r1 == r2) goto L35
        L19:
            r5.mFocusPosition = r0
            r5.mSubFocusPosition = r1
            r5.mFocusPositionOffset = r3
            int r0 = r5.mFlag
            r0 = r0 & 3
            if (r0 == r4) goto L28
            r5.dispatchChildSelected()
        L28:
            androidx.leanback.widget.BaseGridView r0 = r5.mBaseGridView
            boolean r0 = r0.isChildrenDrawingOrderEnabledInternal()
            if (r0 == 0) goto L35
            androidx.leanback.widget.BaseGridView r0 = r5.mBaseGridView
            r0.invalidate()
        L35:
            if (r6 != 0) goto L38
            return
        L38:
            boolean r0 = r6.hasFocus()
            if (r0 != 0) goto L49
            androidx.leanback.widget.BaseGridView r0 = r5.mBaseGridView
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L49
            r6.requestFocus()
        L49:
            int r0 = r5.mFlag
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r1
            if (r0 != 0) goto L53
            if (r8 == 0) goto L53
            return
        L53:
            int[] r0 = androidx.leanback.widget.GridLayoutManager.sTwoInts
            int r1 = r5.mFocusScrollStrategy
            if (r1 == r4) goto L61
            r2 = 2
            if (r1 == r2) goto L61
            boolean r6 = r5.getAlignedPosition(r6, r7, r0)
            goto L65
        L61:
            boolean r6 = r5.getNoneAlignedPosition(r6, r0)
        L65:
            if (r6 != 0) goto L6b
            if (r9 != 0) goto L6b
            if (r10 == 0) goto L76
        L6b:
            int[] r6 = androidx.leanback.widget.GridLayoutManager.sTwoInts
            r7 = r6[r3]
            int r7 = r7 + r9
            r6 = r6[r4]
            int r6 = r6 + r10
            r5.scrollGrid(r7, r6, r8)
        L76:
            return
    }

    private void updateChildAlignments() {
            r3 = this;
            int r0 = r3.getChildCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L11
            android.view.View r2 = r3.getChildAt(r1)
            r3.updateChildAlignments(r2)
            int r1 = r1 + 1
            goto L5
        L11:
            return
    }

    private void updateChildAlignments(android.view.View r3) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            androidx.leanback.widget.GridLayoutManager$LayoutParams r0 = (androidx.leanback.widget.GridLayoutManager.LayoutParams) r0
            androidx.leanback.widget.ItemAlignmentFacet r1 = r0.getItemAlignmentFacet()
            if (r1 != 0) goto L23
            androidx.leanback.widget.ItemAlignment r1 = r2.mItemAlignment
            androidx.leanback.widget.ItemAlignment$Axis r1 = r1.horizontal
            int r1 = r1.getAlignmentPosition(r3)
            r0.setAlignX(r1)
            androidx.leanback.widget.ItemAlignment r1 = r2.mItemAlignment
            androidx.leanback.widget.ItemAlignment$Axis r1 = r1.vertical
            int r3 = r1.getAlignmentPosition(r3)
            r0.setAlignY(r3)
            goto L43
        L23:
            int r1 = r2.mOrientation
            r0.calculateItemAlignments(r1, r3)
            int r1 = r2.mOrientation
            if (r1 != 0) goto L38
            androidx.leanback.widget.ItemAlignment r1 = r2.mItemAlignment
            androidx.leanback.widget.ItemAlignment$Axis r1 = r1.vertical
            int r3 = r1.getAlignmentPosition(r3)
            r0.setAlignY(r3)
            goto L43
        L38:
            androidx.leanback.widget.ItemAlignment r1 = r2.mItemAlignment
            androidx.leanback.widget.ItemAlignment$Axis r1 = r1.horizontal
            int r3 = r1.getAlignmentPosition(r3)
            r0.setAlignX(r3)
        L43:
            return
    }

    private void updateRowSecondarySizeRefresh() {
            r4 = this;
            int r0 = r4.mFlag
            r0 = r0 & (-1025(0xfffffffffffffbff, float:NaN))
            r1 = 0
            boolean r2 = r4.processRowSizeSecondary(r1)
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto Lf
            r1 = 1024(0x400, float:1.435E-42)
        Lf:
            r0 = r0 | r1
            r4.mFlag = r0
            r0 = r0 & r3
            if (r0 == 0) goto L18
            r4.forceRequestLayout()
        L18:
            return
    }

    private void updateScrollController() {
            r3 = this;
            androidx.leanback.widget.WindowAlignment r0 = r3.mWindowAlignment
            androidx.leanback.widget.WindowAlignment$Axis r0 = r0.horizontal
            int r1 = r3.getWidth()
            r0.setSize(r1)
            androidx.leanback.widget.WindowAlignment r0 = r3.mWindowAlignment
            androidx.leanback.widget.WindowAlignment$Axis r0 = r0.vertical
            int r1 = r3.getHeight()
            r0.setSize(r1)
            androidx.leanback.widget.WindowAlignment r0 = r3.mWindowAlignment
            androidx.leanback.widget.WindowAlignment$Axis r0 = r0.horizontal
            int r1 = r3.getPaddingLeft()
            int r2 = r3.getPaddingRight()
            r0.setPadding(r1, r2)
            androidx.leanback.widget.WindowAlignment r0 = r3.mWindowAlignment
            androidx.leanback.widget.WindowAlignment$Axis r0 = r0.vertical
            int r1 = r3.getPaddingTop()
            int r2 = r3.getPaddingBottom()
            r0.setPadding(r1, r2)
            androidx.leanback.widget.WindowAlignment r0 = r3.mWindowAlignment
            androidx.leanback.widget.WindowAlignment$Axis r0 = r0.mainAxis()
            int r0 = r0.getSize()
            r3.mSizePrimary = r0
            return
    }

    private void updateSecondaryScrollLimits() {
            r3 = this;
            androidx.leanback.widget.WindowAlignment r0 = r3.mWindowAlignment
            androidx.leanback.widget.WindowAlignment$Axis r0 = r0.secondAxis()
            int r1 = r0.getPaddingMin()
            int r2 = r3.mScrollOffsetSecondary
            int r1 = r1 - r2
            int r2 = r3.getSizeSecondary()
            int r2 = r2 + r1
            r0.updateMinMax(r1, r2, r1, r2)
            return
    }

    public void addOnChildViewHolderSelectedListener(androidx.leanback.widget.OnChildViewHolderSelectedListener r2) {
            r1 = this;
            java.util.ArrayList<androidx.leanback.widget.OnChildViewHolderSelectedListener> r0 = r1.mChildViewHolderSelectedListeners
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mChildViewHolderSelectedListeners = r0
        Lb:
            java.util.ArrayList<androidx.leanback.widget.OnChildViewHolderSelectedListener> r0 = r1.mChildViewHolderSelectedListeners
            r0.add(r2)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
            r2 = this;
            int r0 = r2.mOrientation
            r1 = 1
            if (r0 == 0) goto Lb
            int r0 = r2.mNumRows
            if (r0 <= r1) goto La
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    public final boolean canScrollTo(android.view.View r2) {
            r1 = this;
            int r0 = r2.getVisibility()
            if (r0 != 0) goto L14
            boolean r0 = r1.hasFocus()
            if (r0 == 0) goto L12
            boolean r2 = r2.hasFocusable()
            if (r2 == 0) goto L14
        L12:
            r2 = 1
            goto L15
        L14:
            r2 = 0
        L15:
            return r2
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
            r2 = this;
            int r0 = r2.mOrientation
            r1 = 1
            if (r0 == r1) goto Lb
            int r0 = r2.mNumRows
            if (r0 <= r1) goto La
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void collectAdjacentPrefetchPositions(int r2, int r3, androidx.recyclerview.widget.RecyclerView.State r4, androidx.recyclerview.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry r5) {
            r1 = this;
            r0 = 0
            r1.saveContext(r0, r4)     // Catch: java.lang.Throwable -> L2b
            int r4 = r1.mOrientation     // Catch: java.lang.Throwable -> L2b
            if (r4 != 0) goto L9
            goto La
        L9:
            r2 = r3
        La:
            int r3 = r1.getChildCount()     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L27
            if (r2 != 0) goto L13
            goto L27
        L13:
            if (r2 >= 0) goto L19
            int r3 = r1.mExtraLayoutSpace     // Catch: java.lang.Throwable -> L2b
            int r3 = -r3
            goto L1e
        L19:
            int r3 = r1.mSizePrimary     // Catch: java.lang.Throwable -> L2b
            int r4 = r1.mExtraLayoutSpace     // Catch: java.lang.Throwable -> L2b
            int r3 = r3 + r4
        L1e:
            androidx.leanback.widget.Grid r4 = r1.mGrid     // Catch: java.lang.Throwable -> L2b
            r4.collectAdjacentPrefetchPositions(r3, r2, r5)     // Catch: java.lang.Throwable -> L2b
            r1.leaveContext()
            return
        L27:
            r1.leaveContext()
            return
        L2b:
            r2 = move-exception
            r1.leaveContext()
            throw r2
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void collectInitialPrefetchPositions(int r6, androidx.recyclerview.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry r7) {
            r5 = this;
            androidx.leanback.widget.BaseGridView r0 = r5.mBaseGridView
            int r0 = r0.mInitialPrefetchItemCount
            if (r6 == 0) goto L27
            if (r0 == 0) goto L27
            int r1 = r5.mFocusPosition
            int r2 = r0 + (-1)
            int r2 = r2 / 2
            int r1 = r1 - r2
            int r2 = r6 - r0
            int r1 = java.lang.Math.min(r1, r2)
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
            r3 = r1
        L1b:
            if (r3 >= r6) goto L27
            int r4 = r1 + r0
            if (r3 >= r4) goto L27
            r7.addPosition(r3, r2)
            int r3 = r3 + 1
            goto L1b
        L27:
            return
    }

    public final void dispatchChildSelected() {
            r12 = this;
            androidx.leanback.widget.OnChildSelectedListener r0 = r12.mChildSelectedListener
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L16
            java.util.ArrayList<androidx.leanback.widget.OnChildViewHolderSelectedListener> r0 = r12.mChildViewHolderSelectedListeners
            if (r0 == 0) goto L12
            int r0 = r0.size()
            if (r0 <= 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            if (r0 != 0) goto L16
            return
        L16:
            int r0 = r12.mFocusPosition
            r3 = 0
            r4 = -1
            if (r0 != r4) goto L1e
            r7 = r3
            goto L23
        L1e:
            android.view.View r0 = r12.findViewByPosition(r0)
            r7 = r0
        L23:
            if (r7 == 0) goto L4a
            androidx.leanback.widget.BaseGridView r0 = r12.mBaseGridView
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r0.getChildViewHolder(r7)
            androidx.leanback.widget.OnChildSelectedListener r5 = r12.mChildSelectedListener
            if (r5 == 0) goto L40
            androidx.leanback.widget.BaseGridView r6 = r12.mBaseGridView
            int r8 = r12.mFocusPosition
            if (r0 != 0) goto L38
            r3 = -1
            goto L3c
        L38:
            long r3 = r0.getItemId()
        L3c:
            r9 = r3
            r5.onChildSelected(r6, r7, r8, r9)
        L40:
            androidx.leanback.widget.BaseGridView r3 = r12.mBaseGridView
            int r4 = r12.mFocusPosition
            int r5 = r12.mSubFocusPosition
            r12.fireOnChildViewHolderSelected(r3, r0, r4, r5)
            goto L5c
        L4a:
            androidx.leanback.widget.OnChildSelectedListener r6 = r12.mChildSelectedListener
            if (r6 == 0) goto L57
            androidx.leanback.widget.BaseGridView r7 = r12.mBaseGridView
            r8 = 0
            r9 = -1
            r10 = -1
            r6.onChildSelected(r7, r8, r9, r10)
        L57:
            androidx.leanback.widget.BaseGridView r0 = r12.mBaseGridView
            r12.fireOnChildViewHolderSelected(r0, r3, r4, r2)
        L5c:
            int r0 = r12.mFlag
            r0 = r0 & 3
            if (r0 == r1) goto L81
            androidx.leanback.widget.BaseGridView r0 = r12.mBaseGridView
            boolean r0 = r0.isLayoutRequested()
            if (r0 != 0) goto L81
            int r0 = r12.getChildCount()
        L6e:
            if (r2 >= r0) goto L81
            android.view.View r1 = r12.getChildAt(r2)
            boolean r1 = r1.isLayoutRequested()
            if (r1 == 0) goto L7e
            r12.forceRequestLayout()
            goto L81
        L7e:
            int r2 = r2 + 1
            goto L6e
        L81:
            return
    }

    public final void dispatchChildSelectedAndPositioned() {
            r10 = this;
            java.util.ArrayList<androidx.leanback.widget.OnChildViewHolderSelectedListener> r0 = r10.mChildViewHolderSelectedListeners
            r1 = 0
            if (r0 == 0) goto Ld
            int r0 = r0.size()
            if (r0 <= 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 != 0) goto L11
            return
        L11:
            int r0 = r10.mFocusPosition
            r2 = 0
            r3 = -1
            if (r0 != r3) goto L19
            r0 = r2
            goto L1d
        L19:
            android.view.View r0 = r10.findViewByPosition(r0)
        L1d:
            if (r0 == 0) goto L2f
            androidx.leanback.widget.BaseGridView r1 = r10.mBaseGridView
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r1.getChildViewHolder(r0)
            androidx.leanback.widget.BaseGridView r1 = r10.mBaseGridView
            int r2 = r10.mFocusPosition
            int r3 = r10.mSubFocusPosition
            r10.fireOnChildViewHolderSelectedAndPositioned(r1, r0, r2, r3)
            goto L41
        L2f:
            androidx.leanback.widget.OnChildSelectedListener r4 = r10.mChildSelectedListener
            if (r4 == 0) goto L3c
            androidx.leanback.widget.BaseGridView r5 = r10.mBaseGridView
            r6 = 0
            r7 = -1
            r8 = -1
            r4.onChildSelected(r5, r6, r7, r8)
        L3c:
            androidx.leanback.widget.BaseGridView r0 = r10.mBaseGridView
            r10.fireOnChildViewHolderSelectedAndPositioned(r0, r2, r3, r1)
        L41:
            return
    }

    public final void fireOnChildViewHolderSelected(androidx.recyclerview.widget.RecyclerView r3, androidx.recyclerview.widget.RecyclerView.ViewHolder r4, int r5, int r6) {
            r2 = this;
            java.util.ArrayList<androidx.leanback.widget.OnChildViewHolderSelectedListener> r0 = r2.mChildViewHolderSelectedListeners
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = r0.size()
            int r0 = r0 + (-1)
        Lb:
            if (r0 < 0) goto L1b
            java.util.ArrayList<androidx.leanback.widget.OnChildViewHolderSelectedListener> r1 = r2.mChildViewHolderSelectedListeners
            java.lang.Object r1 = r1.get(r0)
            androidx.leanback.widget.OnChildViewHolderSelectedListener r1 = (androidx.leanback.widget.OnChildViewHolderSelectedListener) r1
            r1.onChildViewHolderSelected(r3, r4, r5, r6)
            int r0 = r0 + (-1)
            goto Lb
        L1b:
            return
    }

    public final void fireOnChildViewHolderSelectedAndPositioned(androidx.recyclerview.widget.RecyclerView r3, androidx.recyclerview.widget.RecyclerView.ViewHolder r4, int r5, int r6) {
            r2 = this;
            java.util.ArrayList<androidx.leanback.widget.OnChildViewHolderSelectedListener> r0 = r2.mChildViewHolderSelectedListeners
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = r0.size()
            int r0 = r0 + (-1)
        Lb:
            if (r0 < 0) goto L1b
            java.util.ArrayList<androidx.leanback.widget.OnChildViewHolderSelectedListener> r1 = r2.mChildViewHolderSelectedListeners
            java.lang.Object r1 = r1.get(r0)
            androidx.leanback.widget.OnChildViewHolderSelectedListener r1 = (androidx.leanback.widget.OnChildViewHolderSelectedListener) r1
            r1.onChildViewHolderSelectedAndPositioned(r3, r4, r5, r6)
            int r0 = r0 + (-1)
            goto Lb
        L1b:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateDefaultLayoutParams() {
            r2 = this;
            androidx.leanback.widget.GridLayoutManager$LayoutParams r0 = new androidx.leanback.widget.GridLayoutManager$LayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateLayoutParams(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager$LayoutParams r0 = new androidx.leanback.widget.GridLayoutManager$LayoutParams
            r0.<init>(r2, r3)
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.leanback.widget.GridLayoutManager.LayoutParams
            if (r0 == 0) goto Lc
            androidx.leanback.widget.GridLayoutManager$LayoutParams r0 = new androidx.leanback.widget.GridLayoutManager$LayoutParams
            androidx.leanback.widget.GridLayoutManager$LayoutParams r2 = (androidx.leanback.widget.GridLayoutManager.LayoutParams) r2
            r0.<init>(r2)
            return r0
        Lc:
            boolean r0 = r2 instanceof androidx.recyclerview.widget.RecyclerView.LayoutParams
            if (r0 == 0) goto L18
            androidx.leanback.widget.GridLayoutManager$LayoutParams r0 = new androidx.leanback.widget.GridLayoutManager$LayoutParams
            androidx.recyclerview.widget.RecyclerView$LayoutParams r2 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r2
            r0.<init>(r2)
            return r0
        L18:
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L24
            androidx.leanback.widget.GridLayoutManager$LayoutParams r0 = new androidx.leanback.widget.GridLayoutManager$LayoutParams
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r0.<init>(r2)
            return r0
        L24:
            androidx.leanback.widget.GridLayoutManager$LayoutParams r0 = new androidx.leanback.widget.GridLayoutManager$LayoutParams
            r0.<init>(r2)
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getColumnCountForAccessibility(androidx.recyclerview.widget.RecyclerView.Recycler r3, androidx.recyclerview.widget.RecyclerView.State r4) {
            r2 = this;
            int r0 = r2.mOrientation
            r1 = 1
            if (r0 != r1) goto Le
            androidx.leanback.widget.Grid r0 = r2.mGrid
            if (r0 == 0) goto Le
            int r3 = r0.getNumRows()
            return r3
        Le:
            int r3 = super.getColumnCountForAccessibility(r3, r4)
            return r3
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getDecoratedBottom(android.view.View r2) {
            r1 = this;
            int r0 = super.getDecoratedBottom(r2)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.leanback.widget.GridLayoutManager$LayoutParams r2 = (androidx.leanback.widget.GridLayoutManager.LayoutParams) r2
            int r2 = r2.mBottomInset
            int r0 = r0 - r2
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void getDecoratedBoundsWithMargins(android.view.View r3, android.graphics.Rect r4) {
            r2 = this;
            super.getDecoratedBoundsWithMargins(r3, r4)
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.leanback.widget.GridLayoutManager$LayoutParams r3 = (androidx.leanback.widget.GridLayoutManager.LayoutParams) r3
            int r0 = r4.left
            int r1 = r3.mLeftInset
            int r0 = r0 + r1
            r4.left = r0
            int r0 = r4.top
            int r1 = r3.mTopInset
            int r0 = r0 + r1
            r4.top = r0
            int r0 = r4.right
            int r1 = r3.mRightInset
            int r0 = r0 - r1
            r4.right = r0
            int r0 = r4.bottom
            int r3 = r3.mBottomInset
            int r0 = r0 - r3
            r4.bottom = r0
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getDecoratedLeft(android.view.View r2) {
            r1 = this;
            int r0 = super.getDecoratedLeft(r2)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.leanback.widget.GridLayoutManager$LayoutParams r2 = (androidx.leanback.widget.GridLayoutManager.LayoutParams) r2
            int r2 = r2.mLeftInset
            int r0 = r0 + r2
            return r0
    }

    public final int getDecoratedMeasuredHeightWithMargin(android.view.View r3) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            androidx.leanback.widget.GridLayoutManager$LayoutParams r0 = (androidx.leanback.widget.GridLayoutManager.LayoutParams) r0
            int r3 = r2.getDecoratedMeasuredHeight(r3)
            int r1 = r0.topMargin
            int r3 = r3 + r1
            int r0 = r0.bottomMargin
            int r3 = r3 + r0
            return r3
    }

    public final int getDecoratedMeasuredWidthWithMargin(android.view.View r3) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            androidx.leanback.widget.GridLayoutManager$LayoutParams r0 = (androidx.leanback.widget.GridLayoutManager.LayoutParams) r0
            int r3 = r2.getDecoratedMeasuredWidth(r3)
            int r1 = r0.leftMargin
            int r3 = r3 + r1
            int r0 = r0.rightMargin
            int r3 = r3 + r0
            return r3
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getDecoratedRight(android.view.View r2) {
            r1 = this;
            int r0 = super.getDecoratedRight(r2)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.leanback.widget.GridLayoutManager$LayoutParams r2 = (androidx.leanback.widget.GridLayoutManager.LayoutParams) r2
            int r2 = r2.mRightInset
            int r0 = r0 - r2
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getDecoratedTop(android.view.View r2) {
            r1 = this;
            int r0 = super.getDecoratedTop(r2)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.leanback.widget.GridLayoutManager$LayoutParams r2 = (androidx.leanback.widget.GridLayoutManager.LayoutParams) r2
            int r2 = r2.mTopInset
            int r0 = r0 + r2
            return r0
    }

    public final int getExtraLayoutSpace() {
            r1 = this;
            int r0 = r1.mExtraLayoutSpace
            return r0
    }

    public final java.lang.Object getFacet(androidx.recyclerview.widget.RecyclerView.ViewHolder r4) {
            r3 = this;
            java.lang.Class<androidx.leanback.widget.ItemAlignmentFacet> r0 = androidx.leanback.widget.ItemAlignmentFacet.class
            boolean r1 = r4 instanceof androidx.leanback.widget.FacetProvider
            if (r1 == 0) goto Le
            r1 = r4
            androidx.leanback.widget.FacetProvider r1 = (androidx.leanback.widget.FacetProvider) r1
            java.lang.Object r1 = r1.getFacet(r0)
            goto Lf
        Le:
            r1 = 0
        Lf:
            if (r1 != 0) goto L23
            androidx.leanback.widget.FacetProviderAdapter r2 = r3.mFacetProviderAdapter
            if (r2 == 0) goto L23
            int r4 = r4.getItemViewType()
            androidx.leanback.widget.FacetProvider r4 = r2.getFacetProvider(r4)
            if (r4 == 0) goto L23
            java.lang.Object r1 = r4.getFacet(r0)
        L23:
            return r1
    }

    public int getFocusScrollStrategy() {
            r1 = this;
            int r0 = r1.mFocusScrollStrategy
            return r0
    }

    public int getHorizontalSpacing() {
            r1 = this;
            int r0 = r1.mHorizontalSpacing
            return r0
    }

    public int getItemAlignmentOffset() {
            r1 = this;
            androidx.leanback.widget.ItemAlignment r0 = r1.mItemAlignment
            androidx.leanback.widget.ItemAlignment$Axis r0 = r0.mainAxis()
            int r0 = r0.getItemAlignmentOffset()
            return r0
    }

    public float getItemAlignmentOffsetPercent() {
            r1 = this;
            androidx.leanback.widget.ItemAlignment r0 = r1.mItemAlignment
            androidx.leanback.widget.ItemAlignment$Axis r0 = r0.mainAxis()
            float r0 = r0.getItemAlignmentOffsetPercent()
            return r0
    }

    public int getItemAlignmentViewId() {
            r1 = this;
            androidx.leanback.widget.ItemAlignment r0 = r1.mItemAlignment
            androidx.leanback.widget.ItemAlignment$Axis r0 = r0.mainAxis()
            int r0 = r0.getItemAlignmentViewId()
            return r0
    }

    public boolean getPruneChild() {
            r2 = this;
            int r0 = r2.mFlag
            r1 = 65536(0x10000, float:9.1835E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getRowCountForAccessibility(androidx.recyclerview.widget.RecyclerView.Recycler r2, androidx.recyclerview.widget.RecyclerView.State r3) {
            r1 = this;
            int r0 = r1.mOrientation
            if (r0 != 0) goto Ld
            androidx.leanback.widget.Grid r0 = r1.mGrid
            if (r0 == 0) goto Ld
            int r2 = r0.getNumRows()
            return r2
        Ld:
            int r2 = super.getRowCountForAccessibility(r2, r3)
            return r2
    }

    public final int getRowStartSecondary(int r5) {
            r4 = this;
            int r0 = r4.mFlag
            r1 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r1
            r1 = 0
            if (r0 == 0) goto L19
            int r0 = r4.mNumRows
            int r0 = r0 + (-1)
        Lc:
            if (r0 <= r5) goto L28
            int r2 = r4.getRowSizeSecondary(r0)
            int r3 = r4.mSpacingSecondary
            int r2 = r2 + r3
            int r1 = r1 + r2
            int r0 = r0 + (-1)
            goto Lc
        L19:
            r0 = 0
        L1a:
            if (r1 >= r5) goto L27
            int r2 = r4.getRowSizeSecondary(r1)
            int r3 = r4.mSpacingSecondary
            int r2 = r2 + r3
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto L1a
        L27:
            r1 = r0
        L28:
            return r1
    }

    public final boolean getScrollPosition(android.view.View r3, int[] r4) {
            r2 = this;
            int r0 = r2.mFocusScrollStrategy
            r1 = 1
            if (r0 == r1) goto Le
            r1 = 2
            if (r0 == r1) goto Le
            r0 = 0
            boolean r3 = r2.getAlignedPosition(r3, r0, r4)
            return r3
        Le:
            boolean r3 = r2.getNoneAlignedPosition(r3, r4)
            return r3
    }

    public int getSelection() {
            r1 = this;
            int r0 = r1.mFocusPosition
            return r0
    }

    public final int getSlideOutDistance() {
            r3 = this;
            int r0 = r3.mOrientation
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L1c
            int r0 = r3.getHeight()
            int r0 = -r0
            int r2 = r3.getChildCount()
            if (r2 <= 0) goto L4f
            android.view.View r1 = r3.getChildAt(r1)
            int r1 = r1.getTop()
            if (r1 >= 0) goto L4f
            goto L4e
        L1c:
            int r0 = r3.mFlag
            r2 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r2
            if (r0 == 0) goto L39
            int r0 = r3.getWidth()
            int r2 = r3.getChildCount()
            if (r2 <= 0) goto L4f
            android.view.View r1 = r3.getChildAt(r1)
            int r1 = r1.getRight()
            if (r1 <= r0) goto L4f
            r0 = r1
            goto L4f
        L39:
            int r0 = r3.getWidth()
            int r0 = -r0
            int r2 = r3.getChildCount()
            if (r2 <= 0) goto L4f
            android.view.View r1 = r3.getChildAt(r1)
            int r1 = r1.getLeft()
            if (r1 >= 0) goto L4f
        L4e:
            int r0 = r0 + r1
        L4f:
            return r0
    }

    public final int getSubPositionByView(android.view.View r7, android.view.View r8) {
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L3a
            if (r8 != 0) goto L6
            goto L3a
        L6:
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            androidx.leanback.widget.GridLayoutManager$LayoutParams r1 = (androidx.leanback.widget.GridLayoutManager.LayoutParams) r1
            androidx.leanback.widget.ItemAlignmentFacet r1 = r1.getItemAlignmentFacet()
            if (r1 == 0) goto L3a
            androidx.leanback.widget.ItemAlignmentFacet$ItemAlignmentDef[] r1 = r1.getAlignmentDefs()
            int r2 = r1.length
            r3 = 1
            if (r2 <= r3) goto L3a
        L1a:
            if (r8 == r7) goto L3a
            int r2 = r8.getId()
            r4 = -1
            if (r2 == r4) goto L33
            r4 = 1
        L24:
            int r5 = r1.length
            if (r4 >= r5) goto L33
            r5 = r1[r4]
            int r5 = r5.getItemAlignmentFocusViewId()
            if (r5 != r2) goto L30
            return r4
        L30:
            int r4 = r4 + 1
            goto L24
        L33:
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            goto L1a
        L3a:
            return r0
    }

    public int getSubSelection() {
            r1 = this;
            int r0 = r1.mSubFocusPosition
            return r0
    }

    public int getVerticalSpacing() {
            r1 = this;
            int r0 = r1.mVerticalSpacing
            return r0
    }

    public final int getViewMax(android.view.View r2) {
            r1 = this;
            androidx.recyclerview.widget.OrientationHelper r0 = r1.mOrientationHelper
            int r2 = r0.getDecoratedEnd(r2)
            return r2
    }

    public final int getViewMin(android.view.View r2) {
            r1 = this;
            androidx.recyclerview.widget.OrientationHelper r0 = r1.mOrientationHelper
            int r2 = r0.getDecoratedStart(r2)
            return r2
    }

    public final int getViewPrimarySize(android.view.View r2) {
            r1 = this;
            android.graphics.Rect r0 = androidx.leanback.widget.GridLayoutManager.sTempRect
            r1.getDecoratedBoundsWithMargins(r2, r0)
            int r2 = r1.mOrientation
            if (r2 != 0) goto Le
            int r2 = r0.width()
            goto L12
        Le:
            int r2 = r0.height()
        L12:
            return r2
    }

    public void getViewSelectedOffsets(android.view.View r4, int[] r5) {
            r3 = this;
            int r0 = r3.mOrientation
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L13
            int r0 = r3.getPrimaryAlignedScrollDistance(r4)
            r5[r1] = r0
            int r4 = r3.getSecondaryScrollDistance(r4)
            r5[r2] = r4
            goto L1f
        L13:
            int r0 = r3.getPrimaryAlignedScrollDistance(r4)
            r5[r2] = r0
            int r4 = r3.getSecondaryScrollDistance(r4)
            r5[r1] = r4
        L1f:
            return
    }

    public int getWindowAlignment() {
            r1 = this;
            androidx.leanback.widget.WindowAlignment r0 = r1.mWindowAlignment
            androidx.leanback.widget.WindowAlignment$Axis r0 = r0.mainAxis()
            int r0 = r0.getWindowAlignment()
            return r0
    }

    public int getWindowAlignmentOffset() {
            r1 = this;
            androidx.leanback.widget.WindowAlignment r0 = r1.mWindowAlignment
            androidx.leanback.widget.WindowAlignment$Axis r0 = r0.mainAxis()
            int r0 = r0.getWindowAlignmentOffset()
            return r0
    }

    public float getWindowAlignmentOffsetPercent() {
            r1 = this;
            androidx.leanback.widget.WindowAlignment r0 = r1.mWindowAlignment
            androidx.leanback.widget.WindowAlignment$Axis r0 = r0.mainAxis()
            float r0 = r0.getWindowAlignmentOffsetPercent()
            return r0
    }

    public final boolean gridOnRequestFocusInDescendants(androidx.recyclerview.widget.RecyclerView r3, int r4, android.graphics.Rect r5) {
            r2 = this;
            int r0 = r2.mFocusScrollStrategy
            r1 = 1
            if (r0 == r1) goto Ld
            r1 = 2
            if (r0 == r1) goto Ld
            boolean r3 = r2.gridOnRequestFocusInDescendantsAligned(r3, r4, r5)
            return r3
        Ld:
            boolean r3 = r2.gridOnRequestFocusInDescendantsUnaligned(r3, r4, r5)
            return r3
    }

    public final boolean hasCreatedFirstItem() {
            r2 = this;
            int r0 = r2.getItemCount()
            r1 = 0
            if (r0 == 0) goto Lf
            androidx.leanback.widget.BaseGridView r0 = r2.mBaseGridView
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r0.findViewHolderForAdapterPosition(r1)
            if (r0 == 0) goto L10
        Lf:
            r1 = 1
        L10:
            return r1
    }

    public final boolean hasCreatedLastItem() {
            r3 = this;
            int r0 = r3.getItemCount()
            r1 = 1
            if (r0 == 0) goto L12
            androidx.leanback.widget.BaseGridView r2 = r3.mBaseGridView
            int r0 = r0 - r1
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r2.findViewHolderForAdapterPosition(r0)
            if (r0 == 0) goto L11
            goto L12
        L11:
            r1 = 0
        L12:
            return r1
    }

    public final boolean hasDoneFirstLayout() {
            r1 = this;
            androidx.leanback.widget.Grid r0 = r1.mGrid
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public final boolean hasPreviousViewInSameRow(int r6) {
            r5 = this;
            androidx.leanback.widget.Grid r0 = r5.mGrid
            if (r0 == 0) goto L3d
            r1 = -1
            if (r6 == r1) goto L3d
            int r0 = r0.getFirstVisibleIndex()
            if (r0 >= 0) goto Le
            goto L3d
        Le:
            androidx.leanback.widget.Grid r0 = r5.mGrid
            int r0 = r0.getFirstVisibleIndex()
            r1 = 1
            if (r0 <= 0) goto L18
            return r1
        L18:
            androidx.leanback.widget.Grid r0 = r5.mGrid
            androidx.leanback.widget.Grid$Location r0 = r0.getLocation(r6)
            int r0 = r0.row
            int r2 = r5.getChildCount()
            int r2 = r2 - r1
        L25:
            if (r2 < 0) goto L3d
            int r3 = r5.getAdapterPositionByIndex(r2)
            androidx.leanback.widget.Grid r4 = r5.mGrid
            androidx.leanback.widget.Grid$Location r4 = r4.getLocation(r3)
            if (r4 == 0) goto L3a
            int r4 = r4.row
            if (r4 != r0) goto L3a
            if (r3 >= r6) goto L3a
            return r1
        L3a:
            int r2 = r2 + (-1)
            goto L25
        L3d:
            r6 = 0
            return r6
    }

    public boolean isItemAlignmentOffsetWithPadding() {
            r1 = this;
            androidx.leanback.widget.ItemAlignment r0 = r1.mItemAlignment
            androidx.leanback.widget.ItemAlignment$Axis r0 = r0.mainAxis()
            boolean r0 = r0.isItemAlignmentOffsetWithPadding()
            return r0
    }

    public final boolean isItemFullyVisible(int r4) {
            r3 = this;
            androidx.leanback.widget.BaseGridView r0 = r3.mBaseGridView
            androidx.recyclerview.widget.RecyclerView$ViewHolder r4 = r0.findViewHolderForAdapterPosition(r4)
            r0 = 0
            if (r4 != 0) goto La
            return r0
        La:
            android.view.View r1 = r4.itemView
            int r1 = r1.getLeft()
            if (r1 < 0) goto L37
            android.view.View r1 = r4.itemView
            int r1 = r1.getRight()
            androidx.leanback.widget.BaseGridView r2 = r3.mBaseGridView
            int r2 = r2.getWidth()
            if (r1 > r2) goto L37
            android.view.View r1 = r4.itemView
            int r1 = r1.getTop()
            if (r1 < 0) goto L37
            android.view.View r4 = r4.itemView
            int r4 = r4.getBottom()
            androidx.leanback.widget.BaseGridView r1 = r3.mBaseGridView
            int r1 = r1.getHeight()
            if (r4 > r1) goto L37
            r0 = 1
        L37:
            return r0
    }

    public boolean isScrollEnabled() {
            r2 = this;
            int r0 = r2.mFlag
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public final void layoutChild(int r10, android.view.View r11, int r12, int r13, int r14) {
            r9 = this;
            int r0 = r9.mOrientation
            if (r0 != 0) goto L9
            int r0 = r9.getDecoratedMeasuredHeightWithMargin(r11)
            goto Ld
        L9:
            int r0 = r9.getDecoratedMeasuredWidthWithMargin(r11)
        Ld:
            int r1 = r9.mFixedRowSizeSecondary
            if (r1 <= 0) goto L15
            int r0 = java.lang.Math.min(r0, r1)
        L15:
            int r1 = r9.mGravity
            r2 = r1 & 112(0x70, float:1.57E-43)
            int r3 = r9.mFlag
            r4 = 786432(0xc0000, float:1.102026E-39)
            r3 = r3 & r4
            r4 = 1
            if (r3 == 0) goto L2a
            r3 = 8388615(0x800007, float:1.1754953E-38)
            r1 = r1 & r3
            int r1 = android.view.Gravity.getAbsoluteGravity(r1, r4)
            goto L2c
        L2a:
            r1 = r1 & 7
        L2c:
            int r3 = r9.mOrientation
            if (r3 != 0) goto L34
            r5 = 48
            if (r2 == r5) goto L5e
        L34:
            if (r3 != r4) goto L3a
            r5 = 3
            if (r1 != r5) goto L3a
            goto L5e
        L3a:
            if (r3 != 0) goto L40
            r5 = 80
            if (r2 == r5) goto L45
        L40:
            if (r3 != r4) goto L4c
            r5 = 5
            if (r1 != r5) goto L4c
        L45:
            int r10 = r9.getRowSizeSecondary(r10)
            int r10 = r10 - r0
        L4a:
            int r14 = r14 + r10
            goto L5e
        L4c:
            if (r3 != 0) goto L52
            r5 = 16
            if (r2 == r5) goto L56
        L52:
            if (r3 != r4) goto L5e
            if (r1 != r4) goto L5e
        L56:
            int r10 = r9.getRowSizeSecondary(r10)
            int r10 = r10 - r0
            int r10 = r10 / 2
            goto L4a
        L5e:
            int r10 = r9.mOrientation
            if (r10 != 0) goto L64
            int r0 = r0 + r14
            goto L6b
        L64:
            int r0 = r0 + r14
            r7 = r14
            r14 = r12
            r12 = r7
            r8 = r0
            r0 = r13
            r13 = r8
        L6b:
            android.view.ViewGroup$LayoutParams r10 = r11.getLayoutParams()
            androidx.leanback.widget.GridLayoutManager$LayoutParams r10 = (androidx.leanback.widget.GridLayoutManager.LayoutParams) r10
            r1 = r9
            r2 = r11
            r3 = r12
            r4 = r14
            r5 = r13
            r6 = r0
            r1.layoutDecoratedWithMargins(r2, r3, r4, r5, r6)
            android.graphics.Rect r1 = androidx.leanback.widget.GridLayoutManager.sTempRect
            super.getDecoratedBoundsWithMargins(r11, r1)
            int r2 = r1.left
            int r12 = r12 - r2
            int r2 = r1.top
            int r14 = r14 - r2
            int r2 = r1.right
            int r2 = r2 - r13
            int r13 = r1.bottom
            int r13 = r13 - r0
            r10.mLeftInset = r12
            r10.mTopInset = r14
            r10.mRightInset = r2
            r10.mBottomInset = r13
            r9.updateChildAlignments(r11)
            return
    }

    public final void measureChild(android.view.View r7) {
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            androidx.leanback.widget.GridLayoutManager$LayoutParams r0 = (androidx.leanback.widget.GridLayoutManager.LayoutParams) r0
            android.graphics.Rect r1 = androidx.leanback.widget.GridLayoutManager.sTempRect
            r6.calculateItemDecorationsForChild(r7, r1)
            int r2 = r0.leftMargin
            int r3 = r0.rightMargin
            int r2 = r2 + r3
            int r3 = r1.left
            int r2 = r2 + r3
            int r3 = r1.right
            int r2 = r2 + r3
            int r3 = r0.topMargin
            int r4 = r0.bottomMargin
            int r3 = r3 + r4
            int r4 = r1.top
            int r3 = r3 + r4
            int r1 = r1.bottom
            int r3 = r3 + r1
            int r1 = r6.mRowSizeSecondaryRequested
            r4 = 0
            r5 = -2
            if (r1 != r5) goto L2c
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r4)
            goto L34
        L2c:
            int r1 = r6.mFixedRowSizeSecondary
            r5 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r5)
        L34:
            int r5 = r6.mOrientation
            if (r5 != 0) goto L49
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r4)
            int r5 = r0.width
            int r2 = android.view.ViewGroup.getChildMeasureSpec(r4, r2, r5)
            int r0 = r0.height
            int r0 = android.view.ViewGroup.getChildMeasureSpec(r1, r3, r0)
            goto L5a
        L49:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r4)
            int r5 = r0.height
            int r3 = android.view.ViewGroup.getChildMeasureSpec(r4, r3, r5)
            int r0 = r0.width
            int r2 = android.view.ViewGroup.getChildMeasureSpec(r1, r2, r0)
            r0 = r3
        L5a:
            r7.measure(r2, r0)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(androidx.recyclerview.widget.RecyclerView.Adapter r2, androidx.recyclerview.widget.RecyclerView.Adapter r3) {
            r1 = this;
            if (r2 == 0) goto L10
            r1.discardLayoutInfo()
            r0 = -1
            r1.mFocusPosition = r0
            r0 = 0
            r1.mFocusPositionOffset = r0
            androidx.leanback.widget.ViewsStateBundle r0 = r1.mChildrenStates
            r0.clear()
        L10:
            boolean r0 = r3 instanceof androidx.leanback.widget.FacetProviderAdapter
            if (r0 == 0) goto L1a
            r0 = r3
            androidx.leanback.widget.FacetProviderAdapter r0 = (androidx.leanback.widget.FacetProviderAdapter) r0
            r1.mFacetProviderAdapter = r0
            goto L1d
        L1a:
            r0 = 0
            r1.mFacetProviderAdapter = r0
        L1d:
            super.onAdapterChanged(r2, r3)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean onAddFocusables(androidx.recyclerview.widget.RecyclerView r18, java.util.ArrayList<android.view.View> r19, int r20, int r21) {
            r17 = this;
            r0 = r17
            r1 = r19
            r2 = r20
            r3 = r21
            int r4 = r0.mFlag
            r5 = 32768(0x8000, float:4.5918E-41)
            r4 = r4 & r5
            r5 = 1
            if (r4 == 0) goto L12
            return r5
        L12:
            boolean r4 = r18.hasFocus()
            if (r4 == 0) goto L10c
            androidx.leanback.widget.GridLayoutManager$PendingMoveSmoothScroller r4 = r0.mPendingMoveSmoothScroller
            if (r4 == 0) goto L1d
            return r5
        L1d:
            int r4 = r0.getMovement(r2)
            android.view.View r7 = r18.findFocus()
            int r7 = r0.findImmediateChildIndex(r7)
            int r8 = r0.getAdapterPositionByIndex(r7)
            r9 = -1
            if (r8 != r9) goto L32
            r10 = 0
            goto L36
        L32:
            android.view.View r10 = r0.findViewByPosition(r8)
        L36:
            if (r10 == 0) goto L3b
            r10.addFocusables(r1, r2, r3)
        L3b:
            androidx.leanback.widget.Grid r11 = r0.mGrid
            if (r11 == 0) goto L10b
            int r11 = r17.getChildCount()
            if (r11 != 0) goto L47
            goto L10b
        L47:
            r11 = 2
            r12 = 3
            if (r4 == r12) goto L4d
            if (r4 != r11) goto L56
        L4d:
            androidx.leanback.widget.Grid r13 = r0.mGrid
            int r13 = r13.getNumRows()
            if (r13 > r5) goto L56
            return r5
        L56:
            androidx.leanback.widget.Grid r13 = r0.mGrid
            if (r13 == 0) goto L63
            if (r10 == 0) goto L63
            androidx.leanback.widget.Grid$Location r13 = r13.getLocation(r8)
            int r13 = r13.row
            goto L64
        L63:
            r13 = -1
        L64:
            int r14 = r19.size()
            if (r4 == r5) goto L6f
            if (r4 != r12) goto L6d
            goto L6f
        L6d:
            r15 = -1
            goto L70
        L6f:
            r15 = 1
        L70:
            if (r15 <= 0) goto L7b
            int r16 = r17.getChildCount()
            int r16 = r16 + (-1)
            r6 = r16
            goto L7c
        L7b:
            r6 = 0
        L7c:
            if (r7 != r9) goto L8b
            if (r15 <= 0) goto L83
            r16 = 0
            goto L8d
        L83:
            int r7 = r17.getChildCount()
            int r7 = r7 - r5
            r16 = r7
            goto L8d
        L8b:
            int r16 = r7 + r15
        L8d:
            r7 = r16
        L8f:
            if (r15 <= 0) goto L94
            if (r7 > r6) goto L186
            goto L96
        L94:
            if (r7 < r6) goto L186
        L96:
            android.view.View r9 = r0.getChildAt(r7)
            int r16 = r9.getVisibility()
            if (r16 != 0) goto L108
            boolean r16 = r9.hasFocusable()
            if (r16 != 0) goto La8
            goto L108
        La8:
            if (r10 != 0) goto Lb5
            r9.addFocusables(r1, r2, r3)
            int r9 = r19.size()
            if (r9 <= r14) goto L108
            goto L186
        Lb5:
            int r11 = r0.getAdapterPositionByIndex(r7)
            androidx.leanback.widget.Grid r12 = r0.mGrid
            androidx.leanback.widget.Grid$Location r12 = r12.getLocation(r11)
            if (r12 != 0) goto Lc3
        Lc1:
            r11 = 2
            goto L108
        Lc3:
            if (r4 != r5) goto Ld6
            int r12 = r12.row
            if (r12 != r13) goto Lc1
            if (r11 <= r8) goto Lc1
            r9.addFocusables(r1, r2, r3)
            int r9 = r19.size()
            if (r9 <= r14) goto Lc1
            goto L186
        Ld6:
            if (r4 != 0) goto Le9
            int r12 = r12.row
            if (r12 != r13) goto Lc1
            if (r11 >= r8) goto Lc1
            r9.addFocusables(r1, r2, r3)
            int r9 = r19.size()
            if (r9 <= r14) goto Lc1
            goto L186
        Le9:
            r11 = 3
            if (r4 != r11) goto Lf9
            int r12 = r12.row
            if (r12 != r13) goto Lf1
            goto Lc1
        Lf1:
            if (r12 >= r13) goto Lf5
            goto L186
        Lf5:
            r9.addFocusables(r1, r2, r3)
            goto Lc1
        Lf9:
            r11 = 2
            if (r4 != r11) goto L108
            int r12 = r12.row
            if (r12 != r13) goto L101
            goto L108
        L101:
            if (r12 <= r13) goto L105
            goto L186
        L105:
            r9.addFocusables(r1, r2, r3)
        L108:
            int r7 = r7 + r15
            r12 = 3
            goto L8f
        L10b:
            return r5
        L10c:
            int r4 = r19.size()
            int r6 = r0.mFocusScrollStrategy
            if (r6 == 0) goto L169
            androidx.leanback.widget.WindowAlignment r6 = r0.mWindowAlignment
            androidx.leanback.widget.WindowAlignment$Axis r6 = r6.mainAxis()
            int r6 = r6.getPaddingMin()
            androidx.leanback.widget.WindowAlignment r7 = r0.mWindowAlignment
            androidx.leanback.widget.WindowAlignment$Axis r7 = r7.mainAxis()
            int r7 = r7.getClientSize()
            int r7 = r7 + r6
            int r8 = r17.getChildCount()
            r9 = 0
        L12e:
            if (r9 >= r8) goto L14c
            android.view.View r10 = r0.getChildAt(r9)
            int r11 = r10.getVisibility()
            if (r11 != 0) goto L149
            int r11 = r0.getViewMin(r10)
            if (r11 < r6) goto L149
            int r11 = r0.getViewMax(r10)
            if (r11 > r7) goto L149
            r10.addFocusables(r1, r2, r3)
        L149:
            int r9 = r9 + 1
            goto L12e
        L14c:
            int r6 = r19.size()
            if (r6 != r4) goto L174
            int r6 = r17.getChildCount()
            r7 = 0
        L157:
            if (r7 >= r6) goto L174
            android.view.View r8 = r0.getChildAt(r7)
            int r9 = r8.getVisibility()
            if (r9 != 0) goto L166
            r8.addFocusables(r1, r2, r3)
        L166:
            int r7 = r7 + 1
            goto L157
        L169:
            int r6 = r0.mFocusPosition
            android.view.View r6 = r0.findViewByPosition(r6)
            if (r6 == 0) goto L174
            r6.addFocusables(r1, r2, r3)
        L174:
            int r2 = r19.size()
            if (r2 == r4) goto L17b
            return r5
        L17b:
            boolean r2 = r18.isFocusable()
            if (r2 == 0) goto L186
            r2 = r18
            r1.add(r2)
        L186:
            return r5
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityNodeInfo(androidx.recyclerview.widget.RecyclerView.Recycler r6, androidx.recyclerview.widget.RecyclerView.State r7, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r8) {
            r5 = this;
            r5.saveContext(r6, r7)
            int r0 = r7.getItemCount()
            int r1 = r5.mFlag
            r2 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r2
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L12
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            r4 = 23
            if (r0 <= r3) goto L3e
            boolean r2 = r5.isItemFullyVisible(r2)
            if (r2 != 0) goto L3e
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r4) goto L36
            int r2 = r5.mOrientation
            if (r2 != 0) goto L30
            if (r1 == 0) goto L2a
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r2 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_RIGHT
            goto L2c
        L2a:
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r2 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_LEFT
        L2c:
            r8.addAction(r2)
            goto L3b
        L30:
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r2 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_UP
            r8.addAction(r2)
            goto L3b
        L36:
            r2 = 8192(0x2000, float:1.148E-41)
            r8.addAction(r2)
        L3b:
            r8.setScrollable(r3)
        L3e:
            if (r0 <= r3) goto L68
            int r0 = r0 - r3
            boolean r0 = r5.isItemFullyVisible(r0)
            if (r0 != 0) goto L68
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r4) goto L60
            int r0 = r5.mOrientation
            if (r0 != 0) goto L5a
            if (r1 == 0) goto L54
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_LEFT
            goto L56
        L54:
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_RIGHT
        L56:
            r8.addAction(r0)
            goto L65
        L5a:
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_DOWN
            r8.addAction(r0)
            goto L65
        L60:
            r0 = 4096(0x1000, float:5.74E-42)
            r8.addAction(r0)
        L65:
            r8.setScrollable(r3)
        L68:
            int r0 = r5.getRowCountForAccessibility(r6, r7)
            int r1 = r5.getColumnCountForAccessibility(r6, r7)
            boolean r2 = r5.isLayoutHierarchical(r6, r7)
            int r6 = r5.getSelectionModeForAccessibility(r6, r7)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionInfoCompat r6 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(r0, r1, r2, r6)
            r8.setCollectionInfo(r6)
            r5.leaveContext()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityNodeInfoForItem(androidx.recyclerview.widget.RecyclerView.Recycler r7, androidx.recyclerview.widget.RecyclerView.State r8, android.view.View r9, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r10) {
            r6 = this;
            android.view.ViewGroup$LayoutParams r7 = r9.getLayoutParams()
            androidx.leanback.widget.Grid r8 = r6.mGrid
            if (r8 == 0) goto L47
            boolean r8 = r7 instanceof androidx.leanback.widget.GridLayoutManager.LayoutParams
            if (r8 != 0) goto Ld
            goto L47
        Ld:
            androidx.leanback.widget.GridLayoutManager$LayoutParams r7 = (androidx.leanback.widget.GridLayoutManager.LayoutParams) r7
            int r7 = r7.getViewAdapterPosition()
            if (r7 < 0) goto L1d
            androidx.leanback.widget.Grid r8 = r6.mGrid
            int r8 = r8.getRowIndex(r7)
            r2 = r8
            goto L1f
        L1d:
            r8 = -1
            r2 = -1
        L1f:
            if (r2 >= 0) goto L22
            return
        L22:
            androidx.leanback.widget.Grid r8 = r6.mGrid
            int r8 = r8.getNumRows()
            int r7 = r7 / r8
            int r8 = r6.mOrientation
            if (r8 != 0) goto L3b
            r1 = 1
            r3 = 1
            r4 = 0
            r5 = 0
            r0 = r2
            r2 = r7
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat r7 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(r0, r1, r2, r3, r4, r5)
            r10.setCollectionItemInfo(r7)
            goto L47
        L3b:
            r1 = 1
            r3 = 1
            r4 = 0
            r5 = 0
            r0 = r7
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat r7 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(r0, r1, r2, r3, r4, r5)
            r10.setCollectionItemInfo(r7)
        L47:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public android.view.View onInterceptFocusSearch(android.view.View r8, int r9) {
            r7 = this;
            int r0 = r7.mFlag
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L9
            return r8
        L9:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            r1 = 0
            r2 = 0
            r3 = 2
            r4 = 1
            if (r9 == r3) goto L1d
            if (r9 != r4) goto L16
            goto L1d
        L16:
            androidx.leanback.widget.BaseGridView r1 = r7.mBaseGridView
            android.view.View r0 = r0.findNextFocus(r1, r8, r9)
            goto L54
        L1d:
            boolean r5 = r7.canScrollVertically()
            if (r5 == 0) goto L30
            if (r9 != r3) goto L28
            r1 = 130(0x82, float:1.82E-43)
            goto L2a
        L28:
            r1 = 33
        L2a:
            androidx.leanback.widget.BaseGridView r5 = r7.mBaseGridView
            android.view.View r1 = r0.findNextFocus(r5, r8, r1)
        L30:
            boolean r5 = r7.canScrollHorizontally()
            if (r5 == 0) goto L53
            int r1 = r7.getLayoutDirection()
            if (r1 != r4) goto L3e
            r1 = 1
            goto L3f
        L3e:
            r1 = 0
        L3f:
            if (r9 != r3) goto L43
            r5 = 1
            goto L44
        L43:
            r5 = 0
        L44:
            r1 = r1 ^ r5
            if (r1 == 0) goto L4a
            r1 = 66
            goto L4c
        L4a:
            r1 = 17
        L4c:
            androidx.leanback.widget.BaseGridView r5 = r7.mBaseGridView
            android.view.View r0 = r0.findNextFocus(r5, r8, r1)
            goto L54
        L53:
            r0 = r1
        L54:
            if (r0 == 0) goto L57
            return r0
        L57:
            androidx.leanback.widget.BaseGridView r1 = r7.mBaseGridView
            int r1 = r1.getDescendantFocusability()
            r5 = 393216(0x60000, float:5.51013E-40)
            if (r1 != r5) goto L6c
            androidx.leanback.widget.BaseGridView r0 = r7.mBaseGridView
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r8 = r0.focusSearch(r8, r9)
            return r8
        L6c:
            int r1 = r7.getMovement(r9)
            androidx.leanback.widget.BaseGridView r5 = r7.mBaseGridView
            int r5 = r5.getScrollState()
            if (r5 == 0) goto L7a
            r5 = 1
            goto L7b
        L7a:
            r5 = 0
        L7b:
            r6 = 131072(0x20000, float:1.83671E-40)
            if (r1 != r4) goto L97
            if (r5 != 0) goto L87
            int r1 = r7.mFlag
            r1 = r1 & 4096(0x1000, float:5.74E-42)
            if (r1 != 0) goto L88
        L87:
            r0 = r8
        L88:
            int r1 = r7.mFlag
            r1 = r1 & r6
            if (r1 == 0) goto Lc8
            boolean r1 = r7.hasCreatedLastItem()
            if (r1 != 0) goto Lc8
            r7.processPendingMovement(r4)
            goto Lc7
        L97:
            if (r1 != 0) goto Lb1
            if (r5 != 0) goto La1
            int r1 = r7.mFlag
            r1 = r1 & 2048(0x800, float:2.87E-42)
            if (r1 != 0) goto La2
        La1:
            r0 = r8
        La2:
            int r1 = r7.mFlag
            r1 = r1 & r6
            if (r1 == 0) goto Lc8
            boolean r1 = r7.hasCreatedFirstItem()
            if (r1 != 0) goto Lc8
            r7.processPendingMovement(r2)
            goto Lc7
        Lb1:
            r2 = 3
            if (r1 != r2) goto Lbd
            if (r5 != 0) goto Lc7
            int r1 = r7.mFlag
            r1 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r1 != 0) goto Lc8
            goto Lc7
        Lbd:
            if (r1 != r3) goto Lc8
            if (r5 != 0) goto Lc7
            int r1 = r7.mFlag
            r1 = r1 & 8192(0x2000, float:1.148E-41)
            if (r1 != 0) goto Lc8
        Lc7:
            r0 = r8
        Lc8:
            if (r0 == 0) goto Lcb
            return r0
        Lcb:
            androidx.leanback.widget.BaseGridView r0 = r7.mBaseGridView
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r9 = r0.focusSearch(r8, r9)
            if (r9 == 0) goto Ld8
            return r9
        Ld8:
            if (r8 == 0) goto Ldb
            goto Ldd
        Ldb:
            androidx.leanback.widget.BaseGridView r8 = r7.mBaseGridView
        Ldd:
            return r8
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(androidx.recyclerview.widget.RecyclerView r2, int r3, int r4) {
            r1 = this;
            int r2 = r1.mFocusPosition
            r0 = -1
            if (r2 == r0) goto L1d
            androidx.leanback.widget.Grid r2 = r1.mGrid
            if (r2 == 0) goto L1d
            int r2 = r2.getFirstVisibleIndex()
            if (r2 < 0) goto L1d
            int r2 = r1.mFocusPositionOffset
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r0) goto L1d
            int r0 = r1.mFocusPosition
            int r0 = r0 + r2
            if (r3 > r0) goto L1d
            int r2 = r2 + r4
            r1.mFocusPositionOffset = r2
        L1d:
            androidx.leanback.widget.ViewsStateBundle r2 = r1.mChildrenStates
            r2.clear()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsChanged(androidx.recyclerview.widget.RecyclerView r1) {
            r0 = this;
            r1 = 0
            r0.mFocusPositionOffset = r1
            androidx.leanback.widget.ViewsStateBundle r1 = r0.mChildrenStates
            r1.clear()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsMoved(androidx.recyclerview.widget.RecyclerView r3, int r4, int r5, int r6) {
            r2 = this;
            int r3 = r2.mFocusPosition
            r0 = -1
            if (r3 == r0) goto L28
            int r0 = r2.mFocusPositionOffset
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L28
            int r3 = r3 + r0
            if (r4 > r3) goto L17
            int r1 = r4 + r6
            if (r3 >= r1) goto L17
            int r5 = r5 - r4
            int r5 = r5 + r0
            r2.mFocusPositionOffset = r5
            goto L28
        L17:
            if (r4 >= r3) goto L21
            int r1 = r3 - r6
            if (r5 <= r1) goto L21
            int r0 = r0 - r6
            r2.mFocusPositionOffset = r0
            goto L28
        L21:
            if (r4 <= r3) goto L28
            if (r5 >= r3) goto L28
            int r0 = r0 + r6
            r2.mFocusPositionOffset = r0
        L28:
            androidx.leanback.widget.ViewsStateBundle r3 = r2.mChildrenStates
            r3.clear()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(androidx.recyclerview.widget.RecyclerView r5, int r6, int r7) {
            r4 = this;
            int r5 = r4.mFocusPosition
            r0 = -1
            if (r5 == r0) goto L2a
            androidx.leanback.widget.Grid r5 = r4.mGrid
            if (r5 == 0) goto L2a
            int r5 = r5.getFirstVisibleIndex()
            if (r5 < 0) goto L2a
            int r5 = r4.mFocusPositionOffset
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r0) goto L2a
            int r1 = r4.mFocusPosition
            int r2 = r1 + r5
            if (r6 > r2) goto L2a
            int r3 = r6 + r7
            if (r3 <= r2) goto L27
            int r6 = r6 - r2
            int r6 = r6 + r5
            int r6 = r6 + r1
            r4.mFocusPosition = r6
            r4.mFocusPositionOffset = r0
            goto L2a
        L27:
            int r5 = r5 - r7
            r4.mFocusPositionOffset = r5
        L2a:
            androidx.leanback.widget.ViewsStateBundle r5 = r4.mChildrenStates
            r5.clear()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(androidx.recyclerview.widget.RecyclerView r1, int r2, int r3) {
            r0 = this;
            int r3 = r3 + r2
        L1:
            if (r2 >= r3) goto Lb
            androidx.leanback.widget.ViewsStateBundle r1 = r0.mChildrenStates
            r1.remove(r2)
            int r2 = r2 + 1
            goto L1
        Lb:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(androidx.recyclerview.widget.RecyclerView.Recycler r14, androidx.recyclerview.widget.RecyclerView.State r15) {
            r13 = this;
            int r0 = r13.mNumRows
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = r15.getItemCount()
            if (r0 >= 0) goto Lc
            return
        Lc:
            int r0 = r13.mFlag
            r0 = r0 & 64
            if (r0 == 0) goto L1f
            int r0 = r13.getChildCount()
            if (r0 <= 0) goto L1f
            int r14 = r13.mFlag
            r14 = r14 | 128(0x80, float:1.8E-43)
            r13.mFlag = r14
            return
        L1f:
            int r0 = r13.mFlag
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 != 0) goto L2c
            r13.discardLayoutInfo()
            r13.removeAndRecycleAllViews(r14)
            return
        L2c:
            r0 = r0 & (-4)
            r1 = 1
            r0 = r0 | r1
            r13.mFlag = r0
            r13.saveContext(r14, r15)
            boolean r14 = r15.isPreLayout()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 0
            if (r14 == 0) goto Ld8
            r13.updatePositionDeltaInPreLayout()
            int r14 = r13.getChildCount()
            androidx.leanback.widget.Grid r15 = r13.mGrid
            if (r15 == 0) goto Lce
            if (r14 <= 0) goto Lce
            r15 = 2147483647(0x7fffffff, float:NaN)
            androidx.leanback.widget.BaseGridView r1 = r13.mBaseGridView
            android.view.View r3 = r13.getChildAt(r2)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = r1.getChildViewHolder(r3)
            int r1 = r1.getOldPosition()
            androidx.leanback.widget.BaseGridView r3 = r13.mBaseGridView
            int r4 = r14 + (-1)
            android.view.View r4 = r13.getChildAt(r4)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = r3.getChildViewHolder(r4)
            int r3 = r3.getOldPosition()
        L6c:
            if (r2 >= r14) goto Lc3
            android.view.View r4 = r13.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            androidx.leanback.widget.GridLayoutManager$LayoutParams r5 = (androidx.leanback.widget.GridLayoutManager.LayoutParams) r5
            androidx.leanback.widget.BaseGridView r6 = r13.mBaseGridView
            int r6 = r6.getChildAdapterPosition(r4)
            boolean r7 = r5.isItemChanged()
            if (r7 != 0) goto Lb0
            boolean r7 = r5.isItemRemoved()
            if (r7 != 0) goto Lb0
            boolean r7 = r4.isLayoutRequested()
            if (r7 != 0) goto Lb0
            boolean r7 = r4.hasFocus()
            if (r7 != 0) goto L9e
            int r7 = r13.mFocusPosition
            int r8 = r5.getViewAdapterPosition()
            if (r7 == r8) goto Lb0
        L9e:
            boolean r7 = r4.hasFocus()
            if (r7 == 0) goto Lac
            int r7 = r13.mFocusPosition
            int r5 = r5.getViewAdapterPosition()
            if (r7 != r5) goto Lb0
        Lac:
            if (r6 < r1) goto Lb0
            if (r6 <= r3) goto Lc0
        Lb0:
            int r5 = r13.getViewMin(r4)
            int r15 = java.lang.Math.min(r15, r5)
            int r4 = r13.getViewMax(r4)
            int r0 = java.lang.Math.max(r0, r4)
        Lc0:
            int r2 = r2 + 1
            goto L6c
        Lc3:
            if (r0 <= r15) goto Lc8
            int r0 = r0 - r15
            r13.mExtraLayoutSpaceInPreLayout = r0
        Lc8:
            r13.appendVisibleItems()
            r13.prependVisibleItems()
        Lce:
            int r14 = r13.mFlag
            r14 = r14 & (-4)
            r13.mFlag = r14
            r13.leaveContext()
            return
        Ld8:
            boolean r14 = r15.willRunPredictiveAnimations()
            if (r14 == 0) goto L10c
            android.util.SparseIntArray r14 = r13.mPositionToRowInPostLayout
            r14.clear()
            int r14 = r13.getChildCount()
            r3 = 0
        Le8:
            if (r3 >= r14) goto L10c
            androidx.leanback.widget.BaseGridView r4 = r13.mBaseGridView
            android.view.View r5 = r13.getChildAt(r3)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r4 = r4.getChildViewHolder(r5)
            int r4 = r4.getOldPosition()
            if (r4 < 0) goto L109
            androidx.leanback.widget.Grid r5 = r13.mGrid
            androidx.leanback.widget.Grid$Location r5 = r5.getLocation(r4)
            if (r5 == 0) goto L109
            android.util.SparseIntArray r6 = r13.mPositionToRowInPostLayout
            int r5 = r5.row
            r6.put(r4, r5)
        L109:
            int r3 = r3 + 1
            goto Le8
        L10c:
            boolean r14 = r13.isSmoothScrolling()
            if (r14 != 0) goto L117
            int r14 = r13.mFocusScrollStrategy
            if (r14 != 0) goto L117
            goto L118
        L117:
            r1 = 0
        L118:
            int r14 = r13.mFocusPosition
            r3 = -1
            if (r14 == r3) goto L126
            int r4 = r13.mFocusPositionOffset
            if (r4 == r0) goto L126
            int r14 = r14 + r4
            r13.mFocusPosition = r14
            r13.mSubFocusPosition = r2
        L126:
            r13.mFocusPositionOffset = r2
            int r14 = r13.mFocusPosition
            android.view.View r14 = r13.findViewByPosition(r14)
            int r0 = r13.mFocusPosition
            int r4 = r13.mSubFocusPosition
            androidx.leanback.widget.BaseGridView r5 = r13.mBaseGridView
            boolean r5 = r5.hasFocus()
            androidx.leanback.widget.Grid r6 = r13.mGrid
            if (r6 == 0) goto L141
            int r6 = r6.getFirstVisibleIndex()
            goto L142
        L141:
            r6 = -1
        L142:
            androidx.leanback.widget.Grid r7 = r13.mGrid
            if (r7 == 0) goto L14b
            int r7 = r7.getLastVisibleIndex()
            goto L14c
        L14b:
            r7 = -1
        L14c:
            int r8 = r13.mOrientation
            if (r8 != 0) goto L159
            int r8 = r15.getRemainingScrollHorizontal()
            int r9 = r15.getRemainingScrollVertical()
            goto L161
        L159:
            int r9 = r15.getRemainingScrollHorizontal()
            int r8 = r15.getRemainingScrollVertical()
        L161:
            boolean r10 = r13.layoutInit()
            r11 = 16
            if (r10 == 0) goto L17a
            int r3 = r13.mFlag
            r3 = r3 | 4
            r13.mFlag = r3
            androidx.leanback.widget.Grid r3 = r13.mGrid
            int r6 = r13.mFocusPosition
            r3.setStart(r6)
            r13.fastRelayout()
            goto L1ac
        L17a:
            int r10 = r13.mFlag
            r10 = r10 & (-5)
            r13.mFlag = r10
            r10 = r10 & (-17)
            if (r5 == 0) goto L187
            r12 = 16
            goto L188
        L187:
            r12 = 0
        L188:
            r10 = r10 | r12
            r13.mFlag = r10
            if (r1 == 0) goto L198
            if (r6 < 0) goto L195
            int r10 = r13.mFocusPosition
            if (r10 > r7) goto L195
            if (r10 >= r6) goto L198
        L195:
            int r6 = r13.mFocusPosition
            r7 = r6
        L198:
            androidx.leanback.widget.Grid r10 = r13.mGrid
            r10.setStart(r6)
            if (r7 == r3) goto L1ac
        L19f:
            boolean r3 = r13.appendOneColumnVisibleItems()
            if (r3 == 0) goto L1ac
            android.view.View r3 = r13.findViewByPosition(r7)
            if (r3 != 0) goto L1ac
            goto L19f
        L1ac:
            r13.updateScrollLimits()
            androidx.leanback.widget.Grid r3 = r13.mGrid
            int r3 = r3.getFirstVisibleIndex()
            androidx.leanback.widget.Grid r6 = r13.mGrid
            int r6 = r6.getLastVisibleIndex()
            int r7 = -r8
            int r10 = -r9
            r13.focusToViewInLayout(r5, r1, r7, r10)
            r13.appendVisibleItems()
            r13.prependVisibleItems()
            androidx.leanback.widget.Grid r7 = r13.mGrid
            int r7 = r7.getFirstVisibleIndex()
            if (r7 != r3) goto L1ac
            androidx.leanback.widget.Grid r3 = r13.mGrid
            int r3 = r3.getLastVisibleIndex()
            if (r3 != r6) goto L1ac
            r13.removeInvisibleViewsAtFront()
            r13.removeInvisibleViewsAtEnd()
            boolean r15 = r15.willRunPredictiveAnimations()
            if (r15 == 0) goto L234
            androidx.recyclerview.widget.RecyclerView$Recycler r15 = r13.mRecycler
            java.util.List r15 = r15.getScrapList()
            int r1 = r15.size()
            if (r1 != 0) goto L1ef
            goto L234
        L1ef:
            int[] r3 = r13.mDisappearingPositions
            if (r3 == 0) goto L1f6
            int r5 = r3.length
            if (r1 <= r5) goto L205
        L1f6:
            if (r3 != 0) goto L1fb
            r3 = 16
            goto L1fc
        L1fb:
            int r3 = r3.length
        L1fc:
            if (r3 >= r1) goto L201
            int r3 = r3 << 1
            goto L1fc
        L201:
            int[] r3 = new int[r3]
            r13.mDisappearingPositions = r3
        L205:
            r3 = 0
            r5 = 0
        L207:
            if (r3 >= r1) goto L21f
            java.lang.Object r6 = r15.get(r3)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r6 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r6
            int r6 = r6.getAdapterPosition()
            if (r6 < 0) goto L21c
            int[] r7 = r13.mDisappearingPositions
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
        L21c:
            int r3 = r3 + 1
            goto L207
        L21f:
            if (r5 <= 0) goto L22f
            int[] r15 = r13.mDisappearingPositions
            java.util.Arrays.sort(r15, r2, r5)
            androidx.leanback.widget.Grid r15 = r13.mGrid
            int[] r1 = r13.mDisappearingPositions
            android.util.SparseIntArray r2 = r13.mPositionToRowInPostLayout
            r15.fillDisappearingItems(r1, r5, r2)
        L22f:
            android.util.SparseIntArray r15 = r13.mPositionToRowInPostLayout
            r15.clear()
        L234:
            int r15 = r13.mFlag
            r1 = r15 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L23f
            r15 = r15 & (-1025(0xfffffffffffffbff, float:NaN))
            r13.mFlag = r15
            goto L242
        L23f:
            r13.updateRowSecondarySizeRefresh()
        L242:
            int r15 = r13.mFlag
            r15 = r15 & 4
            if (r15 == 0) goto L260
            int r15 = r13.mFocusPosition
            if (r15 != r0) goto L25c
            int r0 = r13.mSubFocusPosition
            if (r0 != r4) goto L25c
            android.view.View r15 = r13.findViewByPosition(r15)
            if (r15 != r14) goto L25c
            int r14 = r13.mFlag
            r14 = r14 & 8
            if (r14 == 0) goto L260
        L25c:
            r13.dispatchChildSelected()
            goto L269
        L260:
            int r14 = r13.mFlag
            r14 = r14 & 20
            if (r14 != r11) goto L269
            r13.dispatchChildSelected()
        L269:
            r13.dispatchChildSelectedAndPositioned()
            int r14 = r13.mFlag
            r14 = r14 & 64
            if (r14 == 0) goto L279
            int r14 = r13.getSlideOutDistance()
            r13.scrollDirectionPrimary(r14)
        L279:
            int r14 = r13.mFlag
            r14 = r14 & (-4)
            r13.mFlag = r14
            r13.leaveContext()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(androidx.recyclerview.widget.RecyclerView.State r1) {
            r0 = this;
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onMeasure(androidx.recyclerview.widget.RecyclerView.Recycler r7, androidx.recyclerview.widget.RecyclerView.State r8, int r9, int r10) {
            r6 = this;
            r6.saveContext(r7, r8)
            int r7 = r6.mOrientation
            if (r7 != 0) goto L1c
            int r7 = android.view.View.MeasureSpec.getSize(r9)
            int r8 = android.view.View.MeasureSpec.getSize(r10)
            int r9 = android.view.View.MeasureSpec.getMode(r10)
            int r10 = r6.getPaddingTop()
            int r0 = r6.getPaddingBottom()
            goto L30
        L1c:
            int r8 = android.view.View.MeasureSpec.getSize(r9)
            int r7 = android.view.View.MeasureSpec.getSize(r10)
            int r9 = android.view.View.MeasureSpec.getMode(r9)
            int r10 = r6.getPaddingLeft()
            int r0 = r6.getPaddingRight()
        L30:
            int r0 = r0 + r10
            r6.mMaxSizeSecondary = r8
            int r10 = r6.mRowSizeSecondaryRequested
            r1 = -2
            java.lang.String r2 = "wrong spec"
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 1
            if (r10 != r1) goto L84
            int r8 = r6.mNumRowsRequested
            if (r8 != 0) goto L45
            r8 = 1
        L45:
            r6.mNumRows = r8
            r10 = 0
            r6.mFixedRowSizeSecondary = r10
            int[] r10 = r6.mRowSizeSecondary
            if (r10 == 0) goto L51
            int r10 = r10.length
            if (r10 == r8) goto L55
        L51:
            int[] r8 = new int[r8]
            r6.mRowSizeSecondary = r8
        L55:
            androidx.recyclerview.widget.RecyclerView$State r8 = r6.mState
            boolean r8 = r8.isPreLayout()
            if (r8 == 0) goto L60
            r6.updatePositionDeltaInPreLayout()
        L60:
            r6.processRowSizeSecondary(r5)
            if (r9 == r4) goto L78
            if (r9 == 0) goto L73
            if (r9 != r3) goto L6d
            int r8 = r6.mMaxSizeSecondary
            goto Le9
        L6d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r2)
            throw r7
        L73:
            int r8 = r6.getSizeSecondary()
            goto La6
        L78:
            int r8 = r6.getSizeSecondary()
            int r8 = r8 + r0
            int r9 = r6.mMaxSizeSecondary
            int r8 = java.lang.Math.min(r8, r9)
            goto Le9
        L84:
            if (r9 == r4) goto La8
            if (r9 == 0) goto L91
            if (r9 != r3) goto L8b
            goto La8
        L8b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r2)
            throw r7
        L91:
            if (r10 != 0) goto L95
            int r10 = r8 - r0
        L95:
            r6.mFixedRowSizeSecondary = r10
            int r8 = r6.mNumRowsRequested
            if (r8 != 0) goto L9c
            r8 = 1
        L9c:
            r6.mNumRows = r8
            int r10 = r10 * r8
            int r9 = r6.mSpacingSecondary
            int r8 = r8 - r5
            int r8 = r8 * r9
            int r8 = r8 + r10
        La6:
            int r8 = r8 + r0
            goto Le9
        La8:
            int r1 = r6.mNumRowsRequested
            if (r1 != 0) goto Lb5
            if (r10 != 0) goto Lb5
            r6.mNumRows = r5
            int r10 = r8 - r0
            r6.mFixedRowSizeSecondary = r10
            goto Ld7
        Lb5:
            if (r1 != 0) goto Lc2
            r6.mFixedRowSizeSecondary = r10
            int r1 = r6.mSpacingSecondary
            int r2 = r8 + r1
            int r10 = r10 + r1
            int r2 = r2 / r10
            r6.mNumRows = r2
            goto Ld7
        Lc2:
            if (r10 != 0) goto Ld3
            r6.mNumRows = r1
            int r10 = r8 - r0
            int r2 = r6.mSpacingSecondary
            int r3 = r1 + (-1)
            int r3 = r3 * r2
            int r10 = r10 - r3
            int r10 = r10 / r1
            r6.mFixedRowSizeSecondary = r10
            goto Ld7
        Ld3:
            r6.mNumRows = r1
            r6.mFixedRowSizeSecondary = r10
        Ld7:
            if (r9 != r4) goto Le9
            int r9 = r6.mFixedRowSizeSecondary
            int r10 = r6.mNumRows
            int r9 = r9 * r10
            int r1 = r6.mSpacingSecondary
            int r10 = r10 - r5
            int r10 = r10 * r1
            int r10 = r10 + r9
            int r10 = r10 + r0
            if (r10 >= r8) goto Le9
            r8 = r10
        Le9:
            int r9 = r6.mOrientation
            if (r9 != 0) goto Lf1
            r6.setMeasuredDimension(r7, r8)
            goto Lf4
        Lf1:
            r6.setMeasuredDimension(r8, r7)
        Lf4:
            r6.leaveContext()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean onRequestChildFocus(androidx.recyclerview.widget.RecyclerView r3, android.view.View r4, android.view.View r5) {
            r2 = this;
            int r3 = r2.mFlag
            r0 = 32768(0x8000, float:4.5918E-41)
            r3 = r3 & r0
            r0 = 1
            if (r3 == 0) goto La
            return r0
        La:
            int r3 = r2.getAdapterPositionByView(r4)
            r1 = -1
            if (r3 != r1) goto L12
            return r0
        L12:
            int r3 = r2.mFlag
            r3 = r3 & 35
            if (r3 != 0) goto L1b
            r2.scrollToView(r4, r5, r0)
        L1b:
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.leanback.widget.GridLayoutManager.SavedState
            if (r0 != 0) goto L5
            return
        L5:
            androidx.leanback.widget.GridLayoutManager$SavedState r2 = (androidx.leanback.widget.GridLayoutManager.SavedState) r2
            int r0 = r2.index
            r1.mFocusPosition = r0
            r0 = 0
            r1.mFocusPositionOffset = r0
            androidx.leanback.widget.ViewsStateBundle r0 = r1.mChildrenStates
            android.os.Bundle r2 = r2.childStates
            r0.loadFromBundle(r2)
            int r2 = r1.mFlag
            r2 = r2 | 256(0x100, float:3.59E-43)
            r1.mFlag = r2
            r1.requestLayout()
            return
    }

    public void onRtlPropertiesChanged(int r6) {
            r5 = this;
            int r0 = r5.mOrientation
            r1 = 0
            r2 = 1
            if (r0 != 0) goto Ld
            if (r6 != r2) goto Lb
            r0 = 262144(0x40000, float:3.67342E-40)
            goto L11
        Lb:
            r0 = 0
            goto L11
        Ld:
            if (r6 != r2) goto Lb
            r0 = 524288(0x80000, float:7.34684E-40)
        L11:
            int r3 = r5.mFlag
            r4 = 786432(0xc0000, float:1.102026E-39)
            r4 = r4 & r3
            if (r4 != r0) goto L19
            return
        L19:
            r4 = -786433(0xfffffffffff3ffff, float:NaN)
            r3 = r3 & r4
            r0 = r0 | r3
            r0 = r0 | 256(0x100, float:3.59E-43)
            r5.mFlag = r0
            androidx.leanback.widget.WindowAlignment r0 = r5.mWindowAlignment
            androidx.leanback.widget.WindowAlignment$Axis r0 = r0.horizontal
            if (r6 != r2) goto L29
            r1 = 1
        L29:
            r0.setReversedFlow(r1)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public android.os.Parcelable onSaveInstanceState() {
            r7 = this;
            androidx.leanback.widget.GridLayoutManager$SavedState r0 = new androidx.leanback.widget.GridLayoutManager$SavedState
            r0.<init>()
            int r1 = r7.getSelection()
            r0.index = r1
            androidx.leanback.widget.ViewsStateBundle r1 = r7.mChildrenStates
            android.os.Bundle r1 = r1.saveAsBundle()
            int r2 = r7.getChildCount()
            r3 = 0
        L16:
            if (r3 >= r2) goto L2c
            android.view.View r4 = r7.getChildAt(r3)
            int r5 = r7.getAdapterPositionByView(r4)
            r6 = -1
            if (r5 == r6) goto L29
            androidx.leanback.widget.ViewsStateBundle r6 = r7.mChildrenStates
            android.os.Bundle r1 = r6.saveOnScreenView(r1, r4, r5)
        L29:
            int r3 = r3 + 1
            goto L16
        L2c:
            r0.childStates = r1
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean performAccessibilityAction(androidx.recyclerview.widget.RecyclerView.Recycler r5, androidx.recyclerview.widget.RecyclerView.State r6, int r7, android.os.Bundle r8) {
            r4 = this;
            boolean r8 = r4.isScrollEnabled()
            r0 = 1
            if (r8 != 0) goto L8
            return r0
        L8:
            r4.saveContext(r5, r6)
            int r5 = r4.mFlag
            r6 = 262144(0x40000, float:3.67342E-40)
            r5 = r5 & r6
            r6 = 0
            if (r5 == 0) goto L15
            r5 = 1
            goto L16
        L15:
            r5 = 0
        L16:
            int r8 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            r2 = 8192(0x2000, float:1.148E-41)
            r3 = 4096(0x1000, float:5.74E-42)
            if (r8 < r1) goto L51
            int r8 = r4.mOrientation
            if (r8 != 0) goto L3f
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r8 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_LEFT
            int r8 = r8.getId()
            if (r7 != r8) goto L34
            if (r5 == 0) goto L31
        L2e:
            r7 = 4096(0x1000, float:5.74E-42)
            goto L51
        L31:
            r7 = 8192(0x2000, float:1.148E-41)
            goto L51
        L34:
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r8 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_RIGHT
            int r8 = r8.getId()
            if (r7 != r8) goto L51
            if (r5 == 0) goto L2e
            goto L31
        L3f:
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r5 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_UP
            int r5 = r5.getId()
            if (r7 != r5) goto L48
            goto L31
        L48:
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r5 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_DOWN
            int r5 = r5.getId()
            if (r7 != r5) goto L51
            goto L2e
        L51:
            if (r7 == r3) goto L5e
            if (r7 == r2) goto L56
            goto L64
        L56:
            r4.processPendingMovement(r6)
            r5 = -1
            r4.processSelectionMoves(r6, r5)
            goto L64
        L5e:
            r4.processPendingMovement(r0)
            r4.processSelectionMoves(r6, r0)
        L64:
            r4.leaveContext()
            return r0
    }

    public final int processSelectionMoves(boolean r11, int r12) {
            r10 = this;
            androidx.leanback.widget.Grid r0 = r10.mGrid
            if (r0 != 0) goto L5
            return r12
        L5:
            int r1 = r10.mFocusPosition
            r2 = -1
            if (r1 == r2) goto Lf
            int r0 = r0.getRowIndex(r1)
            goto L10
        Lf:
            r0 = -1
        L10:
            r3 = 0
            int r4 = r10.getChildCount()
            r5 = 0
            r6 = 0
        L17:
            if (r6 >= r4) goto L53
            if (r12 == 0) goto L53
            if (r12 <= 0) goto L1f
            r7 = r6
            goto L22
        L1f:
            int r7 = r4 + (-1)
            int r7 = r7 - r6
        L22:
            android.view.View r8 = r10.getChildAt(r7)
            boolean r9 = r10.canScrollTo(r8)
            if (r9 != 0) goto L2d
            goto L50
        L2d:
            int r7 = r10.getAdapterPositionByIndex(r7)
            androidx.leanback.widget.Grid r9 = r10.mGrid
            int r9 = r9.getRowIndex(r7)
            if (r0 != r2) goto L3d
            r1 = r7
            r3 = r8
            r0 = r9
            goto L50
        L3d:
            if (r9 != r0) goto L50
            if (r12 <= 0) goto L43
            if (r7 > r1) goto L47
        L43:
            if (r12 >= 0) goto L50
            if (r7 >= r1) goto L50
        L47:
            if (r12 <= 0) goto L4c
            int r12 = r12 + (-1)
            goto L4e
        L4c:
            int r12 = r12 + 1
        L4e:
            r1 = r7
            r3 = r8
        L50:
            int r6 = r6 + 1
            goto L17
        L53:
            if (r3 == 0) goto L75
            if (r11 == 0) goto L71
            boolean r11 = r10.hasFocus()
            if (r11 == 0) goto L6c
            int r11 = r10.mFlag
            r11 = r11 | 32
            r10.mFlag = r11
            r3.requestFocus()
            int r11 = r10.mFlag
            r11 = r11 & (-33)
            r10.mFlag = r11
        L6c:
            r10.mFocusPosition = r1
            r10.mSubFocusPosition = r5
            goto L75
        L71:
            r11 = 1
            r10.scrollToView(r3, r11)
        L75:
            return r12
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void removeAndRecycleAllViews(androidx.recyclerview.widget.RecyclerView.Recycler r2) {
            r1 = this;
            int r0 = r1.getChildCount()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto Le
            r1.removeAndRecycleViewAt(r0, r2)
            int r0 = r0 + (-1)
            goto L6
        Le:
            return
    }

    public void removeOnChildViewHolderSelectedListener(androidx.leanback.widget.OnChildViewHolderSelectedListener r2) {
            r1 = this;
            java.util.ArrayList<androidx.leanback.widget.OnChildViewHolderSelectedListener> r0 = r1.mChildViewHolderSelectedListeners
            if (r0 == 0) goto L7
            r0.remove(r2)
        L7:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean requestChildRectangleOnScreen(androidx.recyclerview.widget.RecyclerView r1, android.view.View r2, android.graphics.Rect r3, boolean r4) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int r2, androidx.recyclerview.widget.RecyclerView.Recycler r3, androidx.recyclerview.widget.RecyclerView.State r4) {
            r1 = this;
            int r0 = r1.mFlag
            r0 = r0 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L2f
            boolean r0 = r1.hasDoneFirstLayout()
            if (r0 != 0) goto Ld
            goto L2f
        Ld:
            r1.saveContext(r3, r4)
            int r3 = r1.mFlag
            r3 = r3 & (-4)
            r3 = r3 | 2
            r1.mFlag = r3
            int r3 = r1.mOrientation
            if (r3 != 0) goto L21
            int r2 = r1.scrollDirectionPrimary(r2)
            goto L25
        L21:
            int r2 = r1.scrollDirectionSecondary(r2)
        L25:
            r1.leaveContext()
            int r3 = r1.mFlag
            r3 = r3 & (-4)
            r1.mFlag = r3
            return r2
        L2f:
            r2 = 0
            return r2
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int r2) {
            r1 = this;
            r0 = 0
            r1.setSelection(r2, r0, r0, r0)
            return
    }

    public final void scrollToSelection(int r6, int r7, boolean r8, int r9) {
            r5 = this;
            r5.mPrimaryScrollExtra = r9
            android.view.View r9 = r5.findViewByPosition(r6)
            boolean r0 = r5.isSmoothScrolling()
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L2f
            androidx.leanback.widget.BaseGridView r2 = r5.mBaseGridView
            boolean r2 = r2.isLayoutRequested()
            if (r2 != 0) goto L2f
            if (r9 == 0) goto L2f
            int r2 = r5.getAdapterPositionByView(r9)
            if (r2 != r6) goto L2f
            int r6 = r5.mFlag
            r6 = r6 | 32
            r5.mFlag = r6
            r5.scrollToView(r9, r8)
            int r6 = r5.mFlag
            r6 = r6 & (-33)
            r5.mFlag = r6
            goto Lc2
        L2f:
            int r2 = r5.mFlag
            r3 = r2 & 512(0x200, float:7.17E-43)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == 0) goto Lc3
            r2 = r2 & 64
            if (r2 == 0) goto L3d
            goto Lc3
        L3d:
            if (r8 == 0) goto L86
            androidx.leanback.widget.BaseGridView r2 = r5.mBaseGridView
            boolean r2 = r2.isLayoutRequested()
            if (r2 != 0) goto L86
            r5.mFocusPosition = r6
            r5.mSubFocusPosition = r7
            r5.mFocusPositionOffset = r4
            boolean r7 = r5.hasDoneFirstLayout()
            if (r7 != 0) goto L6d
            java.lang.String r6 = "GridLayoutManager:"
            java.lang.StringBuilder r6 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6)
            androidx.leanback.widget.BaseGridView r7 = r5.mBaseGridView
            int r7 = r7.getId()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "setSelectionSmooth should not be called before first layout pass"
            android.util.Log.w(r6, r7)
            return
        L6d:
            androidx.leanback.widget.GridLayoutManager$4 r7 = new androidx.leanback.widget.GridLayoutManager$4
            r7.<init>(r5)
            r7.setTargetPosition(r6)
            r5.startSmoothScroll(r7)
            int r6 = r7.getTargetPosition()
            int r7 = r5.mFocusPosition
            if (r6 == r7) goto Lc2
            r5.mFocusPosition = r6
            r6 = 0
            r5.mSubFocusPosition = r6
            goto Lc2
        L86:
            if (r0 != 0) goto L93
            androidx.leanback.widget.GridLayoutManager$GridLinearSmoothScroller r0 = r5.mCurrentSmoothScroller
            if (r0 == 0) goto L8e
            r0.mSkipOnStopInternal = r1
        L8e:
            androidx.leanback.widget.BaseGridView r0 = r5.mBaseGridView
            r0.stopScroll()
        L93:
            androidx.leanback.widget.BaseGridView r0 = r5.mBaseGridView
            boolean r0 = r0.isLayoutRequested()
            if (r0 != 0) goto Lb3
            if (r9 == 0) goto Lb3
            int r0 = r5.getAdapterPositionByView(r9)
            if (r0 != r6) goto Lb3
            int r6 = r5.mFlag
            r6 = r6 | 32
            r5.mFlag = r6
            r5.scrollToView(r9, r8)
            int r6 = r5.mFlag
            r6 = r6 & (-33)
            r5.mFlag = r6
            goto Lc2
        Lb3:
            r5.mFocusPosition = r6
            r5.mSubFocusPosition = r7
            r5.mFocusPositionOffset = r4
            int r6 = r5.mFlag
            r6 = r6 | 256(0x100, float:3.59E-43)
            r5.mFlag = r6
            r5.requestLayout()
        Lc2:
            return
        Lc3:
            r5.mFocusPosition = r6
            r5.mSubFocusPosition = r7
            r5.mFocusPositionOffset = r4
            return
    }

    public final void scrollToView(android.view.View r2, boolean r3) {
            r1 = this;
            android.view.View r0 = r2.findFocus()
            r1.scrollToView(r2, r0, r3)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int r2, androidx.recyclerview.widget.RecyclerView.Recycler r3, androidx.recyclerview.widget.RecyclerView.State r4) {
            r1 = this;
            int r0 = r1.mFlag
            r0 = r0 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L30
            boolean r0 = r1.hasDoneFirstLayout()
            if (r0 != 0) goto Ld
            goto L30
        Ld:
            int r0 = r1.mFlag
            r0 = r0 & (-4)
            r0 = r0 | 2
            r1.mFlag = r0
            r1.saveContext(r3, r4)
            int r3 = r1.mOrientation
            r4 = 1
            if (r3 != r4) goto L22
            int r2 = r1.scrollDirectionPrimary(r2)
            goto L26
        L22:
            int r2 = r1.scrollDirectionSecondary(r2)
        L26:
            r1.leaveContext()
            int r3 = r1.mFlag
            r3 = r3 & (-4)
            r1.mFlag = r3
            return r2
        L30:
            r2 = 0
            return r2
    }

    public final void setExtraLayoutSpace(int r2) {
            r1 = this;
            int r0 = r1.mExtraLayoutSpace
            if (r0 != r2) goto L5
            return
        L5:
            if (r0 < 0) goto Ld
            r1.mExtraLayoutSpace = r2
            r1.requestLayout()
            return
        Ld:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "ExtraLayoutSpace must >= 0"
            r2.<init>(r0)
            throw r2
    }

    public void setFocusOutAllowed(boolean r3, boolean r4) {
            r2 = this;
            int r0 = r2.mFlag
            r0 = r0 & (-6145(0xffffffffffffe7ff, float:NaN))
            r1 = 0
            if (r3 == 0) goto La
            r3 = 2048(0x800, float:2.87E-42)
            goto Lb
        La:
            r3 = 0
        Lb:
            r3 = r3 | r0
            if (r4 == 0) goto L10
            r1 = 4096(0x1000, float:5.74E-42)
        L10:
            r3 = r3 | r1
            r2.mFlag = r3
            return
    }

    public void setFocusOutSideAllowed(boolean r3, boolean r4) {
            r2 = this;
            int r0 = r2.mFlag
            r0 = r0 & (-24577(0xffffffffffff9fff, float:NaN))
            r1 = 0
            if (r3 == 0) goto La
            r3 = 8192(0x2000, float:1.148E-41)
            goto Lb
        La:
            r3 = 0
        Lb:
            r3 = r3 | r0
            if (r4 == 0) goto L10
            r1 = 16384(0x4000, float:2.2959E-41)
        L10:
            r3 = r3 | r1
            r2.mFlag = r3
            return
    }

    public void setFocusScrollStrategy(int r1) {
            r0 = this;
            r0.mFocusScrollStrategy = r1
            return
    }

    public void setGravity(int r1) {
            r0 = this;
            r0.mGravity = r1
            return
    }

    public void setHorizontalSpacing(int r2) {
            r1 = this;
            int r0 = r1.mOrientation
            if (r0 != 0) goto L9
            r1.mHorizontalSpacing = r2
            r1.mSpacingPrimary = r2
            goto Ld
        L9:
            r1.mHorizontalSpacing = r2
            r1.mSpacingSecondary = r2
        Ld:
            return
    }

    public void setItemAlignmentOffset(int r2) {
            r1 = this;
            androidx.leanback.widget.ItemAlignment r0 = r1.mItemAlignment
            androidx.leanback.widget.ItemAlignment$Axis r0 = r0.mainAxis()
            r0.setItemAlignmentOffset(r2)
            r1.updateChildAlignments()
            return
    }

    public void setItemAlignmentOffsetPercent(float r2) {
            r1 = this;
            androidx.leanback.widget.ItemAlignment r0 = r1.mItemAlignment
            androidx.leanback.widget.ItemAlignment$Axis r0 = r0.mainAxis()
            r0.setItemAlignmentOffsetPercent(r2)
            r1.updateChildAlignments()
            return
    }

    public void setItemAlignmentOffsetWithPadding(boolean r2) {
            r1 = this;
            androidx.leanback.widget.ItemAlignment r0 = r1.mItemAlignment
            androidx.leanback.widget.ItemAlignment$Axis r0 = r0.mainAxis()
            r0.setItemAlignmentOffsetWithPadding(r2)
            r1.updateChildAlignments()
            return
    }

    public void setItemAlignmentViewId(int r2) {
            r1 = this;
            androidx.leanback.widget.ItemAlignment r0 = r1.mItemAlignment
            androidx.leanback.widget.ItemAlignment$Axis r0 = r0.mainAxis()
            r0.setItemAlignmentViewId(r2)
            r1.updateChildAlignments()
            return
    }

    public void setItemSpacing(int r1) {
            r0 = this;
            r0.mHorizontalSpacing = r1
            r0.mVerticalSpacing = r1
            r0.mSpacingSecondary = r1
            r0.mSpacingPrimary = r1
            return
    }

    public void setLayoutEnabled(boolean r4) {
            r3 = this;
            int r0 = r3.mFlag
            r1 = r0 & 512(0x200, float:7.17E-43)
            r2 = 0
            if (r1 == 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            if (r1 == r4) goto L19
            r0 = r0 & (-513(0xfffffffffffffdff, float:NaN))
            if (r4 == 0) goto L12
            r2 = 512(0x200, float:7.17E-43)
        L12:
            r4 = r0 | r2
            r3.mFlag = r4
            r3.requestLayout()
        L19:
            return
    }

    public void setNumRows(int r1) {
            r0 = this;
            if (r1 < 0) goto L5
            r0.mNumRowsRequested = r1
            return
        L5:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
    }

    public void setOnChildSelectedListener(androidx.leanback.widget.OnChildSelectedListener r1) {
            r0 = this;
            r0.mChildSelectedListener = r1
            return
    }

    public void setOnChildViewHolderSelectedListener(androidx.leanback.widget.OnChildViewHolderSelectedListener r2) {
            r1 = this;
            if (r2 != 0) goto L6
            r2 = 0
            r1.mChildViewHolderSelectedListeners = r2
            return
        L6:
            java.util.ArrayList<androidx.leanback.widget.OnChildViewHolderSelectedListener> r0 = r1.mChildViewHolderSelectedListeners
            if (r0 != 0) goto L12
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mChildViewHolderSelectedListeners = r0
            goto L15
        L12:
            r0.clear()
        L15:
            java.util.ArrayList<androidx.leanback.widget.OnChildViewHolderSelectedListener> r0 = r1.mChildViewHolderSelectedListeners
            r0.add(r2)
            return
    }

    public void setOrientation(int r2) {
            r1 = this;
            if (r2 == 0) goto L6
            r0 = 1
            if (r2 == r0) goto L6
            return
        L6:
            r1.mOrientation = r2
            androidx.recyclerview.widget.OrientationHelper r0 = androidx.recyclerview.widget.OrientationHelper.createOrientationHelper(r1, r2)
            r1.mOrientationHelper = r0
            androidx.leanback.widget.WindowAlignment r0 = r1.mWindowAlignment
            r0.setOrientation(r2)
            androidx.leanback.widget.ItemAlignment r0 = r1.mItemAlignment
            r0.setOrientation(r2)
            int r2 = r1.mFlag
            r2 = r2 | 256(0x100, float:3.59E-43)
            r1.mFlag = r2
            return
    }

    public void setPruneChild(boolean r5) {
            r4 = this;
            int r0 = r4.mFlag
            r1 = 65536(0x10000, float:9.1835E-41)
            r2 = r0 & r1
            r3 = 0
            if (r2 == 0) goto Lb
            r2 = 1
            goto Lc
        Lb:
            r2 = 0
        Lc:
            if (r2 == r5) goto L1e
            r2 = -65537(0xfffffffffffeffff, float:NaN)
            r0 = r0 & r2
            if (r5 == 0) goto L15
            goto L16
        L15:
            r1 = 0
        L16:
            r0 = r0 | r1
            r4.mFlag = r0
            if (r5 == 0) goto L1e
            r4.requestLayout()
        L1e:
            return
    }

    public void setRowHeight(int r3) {
            r2 = this;
            if (r3 >= 0) goto L12
            r0 = -2
            if (r3 != r0) goto L6
            goto L12
        L6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid row height: "
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3)
            r0.<init>(r3)
            throw r0
        L12:
            r2.mRowSizeSecondaryRequested = r3
            return
    }

    public void setScrollEnabled(boolean r6) {
            r5 = this;
            int r0 = r5.mFlag
            r1 = 131072(0x20000, float:1.83671E-40)
            r2 = r0 & r1
            r3 = 1
            r4 = 0
            if (r2 == 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            if (r2 == r6) goto L2e
            r2 = -131073(0xfffffffffffdffff, float:NaN)
            r0 = r0 & r2
            if (r6 == 0) goto L17
            r4 = 131072(0x20000, float:1.83671E-40)
        L17:
            r6 = r0 | r4
            r5.mFlag = r6
            r6 = r6 & r1
            if (r6 == 0) goto L2e
            int r6 = r5.mFocusScrollStrategy
            if (r6 != 0) goto L2e
            int r6 = r5.mFocusPosition
            r0 = -1
            if (r6 == r0) goto L2e
            int r0 = r5.mSubFocusPosition
            int r1 = r5.mPrimaryScrollExtra
            r5.scrollToSelection(r6, r0, r3, r1)
        L2e:
            return
    }

    public void setSelection(int r2, int r3) {
            r1 = this;
            r0 = 0
            r1.setSelection(r2, r0, r0, r3)
            return
    }

    public void setSelection(int r2, int r3, boolean r4, int r5) {
            r1 = this;
            int r0 = r1.mFocusPosition
            if (r0 == r2) goto L7
            r0 = -1
            if (r2 != r0) goto Lf
        L7:
            int r0 = r1.mSubFocusPosition
            if (r3 != r0) goto Lf
            int r0 = r1.mPrimaryScrollExtra
            if (r5 == r0) goto L12
        Lf:
            r1.scrollToSelection(r2, r3, r4, r5)
        L12:
            return
    }

    public void setSelectionSmooth(int r3) {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.setSelection(r3, r0, r1, r0)
            return
    }

    public void setSelectionSmoothWithSub(int r3, int r4) {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.setSelection(r3, r4, r0, r1)
            return
    }

    public void setSelectionWithSub(int r2, int r3, int r4) {
            r1 = this;
            r0 = 0
            r1.setSelection(r2, r3, r0, r4)
            return
    }

    public void setVerticalSpacing(int r3) {
            r2 = this;
            int r0 = r2.mOrientation
            r1 = 1
            if (r0 != r1) goto La
            r2.mVerticalSpacing = r3
            r2.mSpacingPrimary = r3
            goto Le
        La:
            r2.mVerticalSpacing = r3
            r2.mSpacingSecondary = r3
        Le:
            return
    }

    public void setWindowAlignment(int r2) {
            r1 = this;
            androidx.leanback.widget.WindowAlignment r0 = r1.mWindowAlignment
            androidx.leanback.widget.WindowAlignment$Axis r0 = r0.mainAxis()
            r0.setWindowAlignment(r2)
            return
    }

    public void setWindowAlignmentOffset(int r2) {
            r1 = this;
            androidx.leanback.widget.WindowAlignment r0 = r1.mWindowAlignment
            androidx.leanback.widget.WindowAlignment$Axis r0 = r0.mainAxis()
            r0.setWindowAlignmentOffset(r2)
            return
    }

    public void setWindowAlignmentOffsetPercent(float r2) {
            r1 = this;
            androidx.leanback.widget.WindowAlignment r0 = r1.mWindowAlignment
            androidx.leanback.widget.WindowAlignment$Axis r0 = r0.mainAxis()
            r0.setWindowAlignmentOffsetPercent(r2)
            return
    }

    public final void slideIn() {
            r4 = this;
            int r0 = r4.mFlag
            r1 = r0 & 64
            if (r1 == 0) goto L45
            r0 = r0 & (-65)
            r4.mFlag = r0
            int r1 = r4.mFocusPosition
            if (r1 < 0) goto L17
            int r0 = r4.mSubFocusPosition
            r2 = 1
            int r3 = r4.mPrimaryScrollExtra
            r4.scrollToSelection(r1, r0, r2, r3)
            goto L1e
        L17:
            r0 = r0 & (-129(0xffffffffffffff7f, float:NaN))
            r4.mFlag = r0
            r4.requestLayout()
        L1e:
            int r0 = r4.mFlag
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L45
            r0 = r0 & (-129(0xffffffffffffff7f, float:NaN))
            r4.mFlag = r0
            androidx.leanback.widget.BaseGridView r0 = r4.mBaseGridView
            int r0 = r0.getScrollState()
            if (r0 != 0) goto L3b
            boolean r0 = r4.isSmoothScrolling()
            if (r0 == 0) goto L37
            goto L3b
        L37:
            r4.requestLayout()
            goto L45
        L3b:
            androidx.leanback.widget.BaseGridView r0 = r4.mBaseGridView
            androidx.leanback.widget.GridLayoutManager$3 r1 = new androidx.leanback.widget.GridLayoutManager$3
            r1.<init>(r4)
            r0.addOnScrollListener(r1)
        L45:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView r1, androidx.recyclerview.widget.RecyclerView.State r2, int r3) {
            r0 = this;
            r1 = 0
            r2 = 1
            r0.setSelection(r3, r1, r2, r1)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void startSmoothScroll(androidx.recyclerview.widget.RecyclerView.SmoothScroller r3) {
            r2 = this;
            androidx.leanback.widget.GridLayoutManager$GridLinearSmoothScroller r0 = r2.mCurrentSmoothScroller
            if (r0 == 0) goto L7
            r1 = 1
            r0.mSkipOnStopInternal = r1
        L7:
            super.startSmoothScroll(r3)
            boolean r0 = r3.isRunning()
            r1 = 0
            if (r0 == 0) goto L25
            boolean r0 = r3 instanceof androidx.leanback.widget.GridLayoutManager.GridLinearSmoothScroller
            if (r0 == 0) goto L25
            androidx.leanback.widget.GridLayoutManager$GridLinearSmoothScroller r3 = (androidx.leanback.widget.GridLayoutManager.GridLinearSmoothScroller) r3
            r2.mCurrentSmoothScroller = r3
            boolean r0 = r3 instanceof androidx.leanback.widget.GridLayoutManager.PendingMoveSmoothScroller
            if (r0 == 0) goto L22
            androidx.leanback.widget.GridLayoutManager$PendingMoveSmoothScroller r3 = (androidx.leanback.widget.GridLayoutManager.PendingMoveSmoothScroller) r3
            r2.mPendingMoveSmoothScroller = r3
            goto L29
        L22:
            r2.mPendingMoveSmoothScroller = r1
            goto L29
        L25:
            r2.mCurrentSmoothScroller = r1
            r2.mPendingMoveSmoothScroller = r1
        L29:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
            r1 = this;
            r0 = 1
            return r0
    }

    public final void updatePositionDeltaInPreLayout() {
            r2 = this;
            int r0 = r2.getChildCount()
            r1 = 0
            if (r0 <= 0) goto L1f
            android.view.View r0 = r2.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.leanback.widget.GridLayoutManager$LayoutParams r0 = (androidx.leanback.widget.GridLayoutManager.LayoutParams) r0
            androidx.leanback.widget.Grid r1 = r2.mGrid
            int r1 = r1.getFirstVisibleIndex()
            int r0 = r0.getViewLayoutPosition()
            int r1 = r1 - r0
            r2.mPositionDeltaInPreLayout = r1
            goto L21
        L1f:
            r2.mPositionDeltaInPreLayout = r1
        L21:
            return
    }

    public final void updateScrollLimits() {
            r7 = this;
            androidx.recyclerview.widget.RecyclerView$State r0 = r7.mState
            int r0 = r0.getItemCount()
            if (r0 != 0) goto L9
            return
        L9:
            int r0 = r7.mFlag
            r1 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r1
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L28
            androidx.leanback.widget.Grid r0 = r7.mGrid
            int r0 = r0.getLastVisibleIndex()
            androidx.recyclerview.widget.RecyclerView$State r3 = r7.mState
            int r3 = r3.getItemCount()
            int r3 = r3 - r2
            androidx.leanback.widget.Grid r4 = r7.mGrid
            int r4 = r4.getFirstVisibleIndex()
            r5 = r4
            r4 = 0
            goto L3e
        L28:
            androidx.leanback.widget.Grid r0 = r7.mGrid
            int r0 = r0.getFirstVisibleIndex()
            androidx.leanback.widget.Grid r3 = r7.mGrid
            int r4 = r3.getLastVisibleIndex()
            androidx.recyclerview.widget.RecyclerView$State r3 = r7.mState
            int r3 = r3.getItemCount()
            int r3 = r3 - r2
            r5 = r4
            r4 = r3
            r3 = 0
        L3e:
            if (r0 < 0) goto Lc4
            if (r5 >= 0) goto L44
            goto Lc4
        L44:
            if (r0 != r3) goto L48
            r0 = 1
            goto L49
        L48:
            r0 = 0
        L49:
            if (r5 != r4) goto L4d
            r3 = 1
            goto L4e
        L4d:
            r3 = 0
        L4e:
            if (r0 != 0) goto L6b
            androidx.leanback.widget.WindowAlignment r4 = r7.mWindowAlignment
            androidx.leanback.widget.WindowAlignment$Axis r4 = r4.mainAxis()
            boolean r4 = r4.isMaxUnknown()
            if (r4 == 0) goto L6b
            if (r3 != 0) goto L6b
            androidx.leanback.widget.WindowAlignment r4 = r7.mWindowAlignment
            androidx.leanback.widget.WindowAlignment$Axis r4 = r4.mainAxis()
            boolean r4 = r4.isMinUnknown()
            if (r4 == 0) goto L6b
            return
        L6b:
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == 0) goto L9d
            androidx.leanback.widget.Grid r0 = r7.mGrid
            int[] r4 = androidx.leanback.widget.GridLayoutManager.sTwoInts
            int r4 = r0.findRowMax(r2, r4)
            int[] r0 = androidx.leanback.widget.GridLayoutManager.sTwoInts
            r0 = r0[r2]
            android.view.View r0 = r7.findViewByPosition(r0)
            int r5 = r7.getViewCenter(r0)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.leanback.widget.GridLayoutManager$LayoutParams r0 = (androidx.leanback.widget.GridLayoutManager.LayoutParams) r0
            int[] r0 = r0.getAlignMultiple()
            if (r0 == 0) goto La0
            int r6 = r0.length
            if (r6 <= 0) goto La0
            int r6 = r0.length
            int r6 = r6 - r2
            r6 = r0[r6]
            r0 = r0[r1]
            int r6 = r6 - r0
            int r6 = r6 + r5
            r5 = r6
            goto La0
        L9d:
            r5 = 2147483647(0x7fffffff, float:NaN)
        La0:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == 0) goto Lb9
            androidx.leanback.widget.Grid r0 = r7.mGrid
            int[] r3 = androidx.leanback.widget.GridLayoutManager.sTwoInts
            int r0 = r0.findRowMin(r1, r3)
            int[] r1 = androidx.leanback.widget.GridLayoutManager.sTwoInts
            r1 = r1[r2]
            android.view.View r1 = r7.findViewByPosition(r1)
            int r1 = r7.getViewCenter(r1)
            goto Lbb
        Lb9:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
        Lbb:
            androidx.leanback.widget.WindowAlignment r2 = r7.mWindowAlignment
            androidx.leanback.widget.WindowAlignment$Axis r2 = r2.mainAxis()
            r2.updateMinMax(r0, r4, r1, r5)
        Lc4:
            return
    }
}
