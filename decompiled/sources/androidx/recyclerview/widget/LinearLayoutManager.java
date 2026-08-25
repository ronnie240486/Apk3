package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends androidx.recyclerview.widget.RecyclerView.LayoutManager implements androidx.recyclerview.widget.ItemTouchHelper.ViewDropHandler, androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider {
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final java.lang.String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    public final androidx.recyclerview.widget.LinearLayoutManager.AnchorInfo mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final androidx.recyclerview.widget.LinearLayoutManager.LayoutChunkResult mLayoutChunkResult;
    private androidx.recyclerview.widget.LinearLayoutManager.LayoutState mLayoutState;
    public int mOrientation;
    public androidx.recyclerview.widget.OrientationHelper mOrientationHelper;
    public androidx.recyclerview.widget.LinearLayoutManager.SavedState mPendingSavedState;
    public int mPendingScrollPosition;
    public int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    public boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    public static class AnchorInfo {
        public int mCoordinate;
        public boolean mLayoutFromEnd;
        public androidx.recyclerview.widget.OrientationHelper mOrientationHelper;
        public int mPosition;
        public boolean mValid;

        public AnchorInfo() {
                r0 = this;
                r0.<init>()
                r0.reset()
                return
        }

        public final void assignCoordinateFromPadding() {
                r1 = this;
                boolean r0 = r1.mLayoutFromEnd
                if (r0 == 0) goto Lb
                androidx.recyclerview.widget.OrientationHelper r0 = r1.mOrientationHelper
                int r0 = r0.getEndAfterPadding()
                goto L11
            Lb:
                androidx.recyclerview.widget.OrientationHelper r0 = r1.mOrientationHelper
                int r0 = r0.getStartAfterPadding()
            L11:
                r1.mCoordinate = r0
                return
        }

        public void assignFromView(android.view.View r2, int r3) {
                r1 = this;
                boolean r0 = r1.mLayoutFromEnd
                if (r0 == 0) goto L14
                androidx.recyclerview.widget.OrientationHelper r0 = r1.mOrientationHelper
                int r2 = r0.getDecoratedEnd(r2)
                androidx.recyclerview.widget.OrientationHelper r0 = r1.mOrientationHelper
                int r0 = r0.getTotalSpaceChange()
                int r0 = r0 + r2
                r1.mCoordinate = r0
                goto L1c
            L14:
                androidx.recyclerview.widget.OrientationHelper r0 = r1.mOrientationHelper
                int r2 = r0.getDecoratedStart(r2)
                r1.mCoordinate = r2
            L1c:
                r1.mPosition = r3
                return
        }

        public void assignFromViewAndKeepVisibleRect(android.view.View r5, int r6) {
                r4 = this;
                androidx.recyclerview.widget.OrientationHelper r0 = r4.mOrientationHelper
                int r0 = r0.getTotalSpaceChange()
                if (r0 < 0) goto Lc
                r4.assignFromView(r5, r6)
                return
            Lc:
                r4.mPosition = r6
                boolean r6 = r4.mLayoutFromEnd
                r1 = 0
                if (r6 == 0) goto L55
                androidx.recyclerview.widget.OrientationHelper r6 = r4.mOrientationHelper
                int r6 = r6.getEndAfterPadding()
                int r6 = r6 - r0
                androidx.recyclerview.widget.OrientationHelper r0 = r4.mOrientationHelper
                int r0 = r0.getDecoratedEnd(r5)
                int r6 = r6 - r0
                androidx.recyclerview.widget.OrientationHelper r0 = r4.mOrientationHelper
                int r0 = r0.getEndAfterPadding()
                int r0 = r0 - r6
                r4.mCoordinate = r0
                if (r6 <= 0) goto L94
                androidx.recyclerview.widget.OrientationHelper r0 = r4.mOrientationHelper
                int r0 = r0.getDecoratedMeasurement(r5)
                int r2 = r4.mCoordinate
                int r2 = r2 - r0
                androidx.recyclerview.widget.OrientationHelper r0 = r4.mOrientationHelper
                int r0 = r0.getStartAfterPadding()
                androidx.recyclerview.widget.OrientationHelper r3 = r4.mOrientationHelper
                int r5 = r3.getDecoratedStart(r5)
                int r5 = r5 - r0
                int r5 = java.lang.Math.min(r5, r1)
                int r5 = r5 + r0
                int r2 = r2 - r5
                if (r2 >= 0) goto L94
                int r5 = r4.mCoordinate
                int r0 = -r2
                int r6 = java.lang.Math.min(r6, r0)
                int r6 = r6 + r5
                r4.mCoordinate = r6
                goto L94
            L55:
                androidx.recyclerview.widget.OrientationHelper r6 = r4.mOrientationHelper
                int r6 = r6.getDecoratedStart(r5)
                androidx.recyclerview.widget.OrientationHelper r2 = r4.mOrientationHelper
                int r2 = r2.getStartAfterPadding()
                int r2 = r6 - r2
                r4.mCoordinate = r6
                if (r2 <= 0) goto L94
                androidx.recyclerview.widget.OrientationHelper r3 = r4.mOrientationHelper
                int r3 = r3.getDecoratedMeasurement(r5)
                int r3 = r3 + r6
                androidx.recyclerview.widget.OrientationHelper r6 = r4.mOrientationHelper
                int r6 = r6.getEndAfterPadding()
                int r6 = r6 - r0
                androidx.recyclerview.widget.OrientationHelper r0 = r4.mOrientationHelper
                int r5 = r0.getDecoratedEnd(r5)
                int r6 = r6 - r5
                androidx.recyclerview.widget.OrientationHelper r5 = r4.mOrientationHelper
                int r5 = r5.getEndAfterPadding()
                int r6 = java.lang.Math.min(r1, r6)
                int r5 = r5 - r6
                int r5 = r5 - r3
                if (r5 >= 0) goto L94
                int r6 = r4.mCoordinate
                int r5 = -r5
                int r5 = java.lang.Math.min(r2, r5)
                int r6 = r6 - r5
                r4.mCoordinate = r6
            L94:
                return
        }

        public final void reset() {
                r1 = this;
                r0 = -1
                r1.mPosition = r0
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r1.mCoordinate = r0
                r0 = 0
                r1.mLayoutFromEnd = r0
                r1.mValid = r0
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = "AnchorInfo{mPosition="
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                int r1 = r2.mPosition
                r0.append(r1)
                java.lang.String r1 = ", mCoordinate="
                r0.append(r1)
                int r1 = r2.mCoordinate
                r0.append(r1)
                java.lang.String r1 = ", mLayoutFromEnd="
                r0.append(r1)
                boolean r1 = r2.mLayoutFromEnd
                r0.append(r1)
                java.lang.String r1 = ", mValid="
                r0.append(r1)
                boolean r1 = r2.mValid
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class LayoutChunkResult {
        public int mConsumed;
        public boolean mFinished;
        public boolean mFocusable;
        public boolean mIgnoreConsumed;

        public LayoutChunkResult() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class LayoutState {
        public int mAvailable;
        public int mCurrentPosition;
        public int mExtraFillSpace;
        public boolean mInfinite;
        public int mItemDirection;
        public int mLastScrollDelta;
        public int mLayoutDirection;
        public int mNoRecycleSpace;
        public int mOffset;
        public boolean mRecycle;
        public java.util.List<androidx.recyclerview.widget.RecyclerView.ViewHolder> mScrapList;
        public int mScrollingOffset;

        public LayoutState() {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.mRecycle = r0
                r0 = 0
                r1.mExtraFillSpace = r0
                r1.mNoRecycleSpace = r0
                r0 = 0
                r1.mScrapList = r0
                return
        }

        private android.view.View nextViewFromScrapList() {
                r5 = this;
                java.util.List<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r5.mScrapList
                int r0 = r0.size()
                r1 = 0
            L7:
                if (r1 >= r0) goto L2f
                java.util.List<androidx.recyclerview.widget.RecyclerView$ViewHolder> r2 = r5.mScrapList
                java.lang.Object r2 = r2.get(r1)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r2
                android.view.View r2 = r2.itemView
                android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$LayoutParams r3 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r3
                boolean r4 = r3.isItemRemoved()
                if (r4 == 0) goto L20
                goto L2c
            L20:
                int r4 = r5.mCurrentPosition
                int r3 = r3.getViewLayoutPosition()
                if (r4 != r3) goto L2c
                r5.assignPositionFromScrapList(r2)
                return r2
            L2c:
                int r1 = r1 + 1
                goto L7
            L2f:
                r0 = 0
                return r0
        }

        public void assignPositionFromScrapList() {
                r1 = this;
                r0 = 0
                r1.assignPositionFromScrapList(r0)
                return
        }

        public void assignPositionFromScrapList(android.view.View r1) {
                r0 = this;
                android.view.View r1 = r0.nextViewInLimitedList(r1)
                if (r1 != 0) goto La
                r1 = -1
                r0.mCurrentPosition = r1
                goto L16
            La:
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
                int r1 = r1.getViewLayoutPosition()
                r0.mCurrentPosition = r1
            L16:
                return
        }

        public final boolean hasMore(androidx.recyclerview.widget.RecyclerView.State r2) {
                r1 = this;
                int r0 = r1.mCurrentPosition
                if (r0 < 0) goto Lc
                int r2 = r2.getItemCount()
                if (r0 >= r2) goto Lc
                r2 = 1
                goto Ld
            Lc:
                r2 = 0
            Ld:
                return r2
        }

        public final android.view.View next(androidx.recyclerview.widget.RecyclerView.Recycler r3) {
                r2 = this;
                java.util.List<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r2.mScrapList
                if (r0 == 0) goto L9
                android.view.View r3 = r2.nextViewFromScrapList()
                return r3
            L9:
                int r0 = r2.mCurrentPosition
                android.view.View r3 = r3.getViewForPosition(r0)
                int r0 = r2.mCurrentPosition
                int r1 = r2.mItemDirection
                int r0 = r0 + r1
                r2.mCurrentPosition = r0
                return r3
        }

        public android.view.View nextViewInLimitedList(android.view.View r8) {
                r7 = this;
                java.util.List<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r7.mScrapList
                int r0 = r0.size()
                r1 = 0
                r2 = 2147483647(0x7fffffff, float:NaN)
                r3 = 0
            Lb:
                if (r3 >= r0) goto L3e
                java.util.List<androidx.recyclerview.widget.RecyclerView$ViewHolder> r4 = r7.mScrapList
                java.lang.Object r4 = r4.get(r3)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r4 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r4
                android.view.View r4 = r4.itemView
                android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$LayoutParams r5 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r5
                if (r4 == r8) goto L3b
                boolean r6 = r5.isItemRemoved()
                if (r6 == 0) goto L26
                goto L3b
            L26:
                int r5 = r5.getViewLayoutPosition()
                int r6 = r7.mCurrentPosition
                int r5 = r5 - r6
                int r6 = r7.mItemDirection
                int r5 = r5 * r6
                if (r5 >= 0) goto L34
                goto L3b
            L34:
                if (r5 >= r2) goto L3b
                r1 = r4
                if (r5 != 0) goto L3a
                goto L3e
            L3a:
                r2 = r5
            L3b:
                int r3 = r3 + 1
                goto Lb
            L3e:
                return r1
        }
    }

    @android.annotation.SuppressLint({"BanParcelableUsage"})
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static class SavedState implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<androidx.recyclerview.widget.LinearLayoutManager.SavedState> CREATOR = null;
        public boolean mAnchorLayoutFromEnd;
        public int mAnchorOffset;
        public int mAnchorPosition;


        static {
                androidx.recyclerview.widget.LinearLayoutManager$SavedState$1 r0 = new androidx.recyclerview.widget.LinearLayoutManager$SavedState$1
                r0.<init>()
                androidx.recyclerview.widget.LinearLayoutManager.SavedState.CREATOR = r0
                return
        }

        public SavedState() {
                r0 = this;
                r0.<init>()
                return
        }

        public SavedState(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                int r0 = r2.readInt()
                r1.mAnchorPosition = r0
                int r0 = r2.readInt()
                r1.mAnchorOffset = r0
                int r2 = r2.readInt()
                r0 = 1
                if (r2 != r0) goto L17
                goto L18
            L17:
                r0 = 0
            L18:
                r1.mAnchorLayoutFromEnd = r0
                return
        }

        public SavedState(androidx.recyclerview.widget.LinearLayoutManager.SavedState r2) {
                r1 = this;
                r1.<init>()
                int r0 = r2.mAnchorPosition
                r1.mAnchorPosition = r0
                int r0 = r2.mAnchorOffset
                r1.mAnchorOffset = r0
                boolean r2 = r2.mAnchorLayoutFromEnd
                r1.mAnchorLayoutFromEnd = r2
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        public final boolean hasValidAnchor() {
                r1 = this;
                int r0 = r1.mAnchorPosition
                if (r0 < 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                int r2 = r0.mAnchorPosition
                r1.writeInt(r2)
                int r2 = r0.mAnchorOffset
                r1.writeInt(r2)
                boolean r2 = r0.mAnchorLayoutFromEnd
                r1.writeInt(r2)
                return
        }
    }

    public LinearLayoutManager(android.content.Context r3) {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.<init>(r3, r0, r1)
            return
    }

    public LinearLayoutManager(android.content.Context r2, int r3, boolean r4) {
            r1 = this;
            r1.<init>()
            r2 = 1
            r1.mOrientation = r2
            r0 = 0
            r1.mReverseLayout = r0
            r1.mShouldReverseLayout = r0
            r1.mStackFromEnd = r0
            r1.mSmoothScrollbarEnabled = r2
            r2 = -1
            r1.mPendingScrollPosition = r2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.mPendingScrollPositionOffset = r2
            r2 = 0
            r1.mPendingSavedState = r2
            androidx.recyclerview.widget.LinearLayoutManager$AnchorInfo r2 = new androidx.recyclerview.widget.LinearLayoutManager$AnchorInfo
            r2.<init>()
            r1.mAnchorInfo = r2
            androidx.recyclerview.widget.LinearLayoutManager$LayoutChunkResult r2 = new androidx.recyclerview.widget.LinearLayoutManager$LayoutChunkResult
            r2.<init>()
            r1.mLayoutChunkResult = r2
            r2 = 2
            r1.mInitialPrefetchItemCount = r2
            int[] r2 = new int[r2]
            r1.mReusableIntPair = r2
            r1.setOrientation(r3)
            r1.setReverseLayout(r4)
            return
    }

    public LinearLayoutManager(android.content.Context r3, android.util.AttributeSet r4, int r5, int r6) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.mOrientation = r0
            r1 = 0
            r2.mReverseLayout = r1
            r2.mShouldReverseLayout = r1
            r2.mStackFromEnd = r1
            r2.mSmoothScrollbarEnabled = r0
            r0 = -1
            r2.mPendingScrollPosition = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.mPendingScrollPositionOffset = r0
            r0 = 0
            r2.mPendingSavedState = r0
            androidx.recyclerview.widget.LinearLayoutManager$AnchorInfo r0 = new androidx.recyclerview.widget.LinearLayoutManager$AnchorInfo
            r0.<init>()
            r2.mAnchorInfo = r0
            androidx.recyclerview.widget.LinearLayoutManager$LayoutChunkResult r0 = new androidx.recyclerview.widget.LinearLayoutManager$LayoutChunkResult
            r0.<init>()
            r2.mLayoutChunkResult = r0
            r0 = 2
            r2.mInitialPrefetchItemCount = r0
            int[] r0 = new int[r0]
            r2.mReusableIntPair = r0
            androidx.recyclerview.widget.RecyclerView$LayoutManager$Properties r3 = androidx.recyclerview.widget.RecyclerView.LayoutManager.getProperties(r3, r4, r5, r6)
            int r4 = r3.orientation
            r2.setOrientation(r4)
            boolean r4 = r3.reverseLayout
            r2.setReverseLayout(r4)
            boolean r3 = r3.stackFromEnd
            r2.setStackFromEnd(r3)
            return
    }

    private int computeScrollExtent(androidx.recyclerview.widget.RecyclerView.State r7) {
            r6 = this;
            int r0 = r6.getChildCount()
            if (r0 != 0) goto L8
            r7 = 0
            return r7
        L8:
            r6.ensureLayoutState()
            androidx.recyclerview.widget.OrientationHelper r1 = r6.mOrientationHelper
            boolean r0 = r6.mSmoothScrollbarEnabled
            r0 = r0 ^ 1
            android.view.View r2 = r6.findFirstVisibleChildClosestToStart(r0)
            boolean r0 = r6.mSmoothScrollbarEnabled
            r0 = r0 ^ 1
            android.view.View r3 = r6.findFirstVisibleChildClosestToEnd(r0)
            boolean r5 = r6.mSmoothScrollbarEnabled
            r0 = r7
            r4 = r6
            int r7 = androidx.recyclerview.widget.ScrollbarHelper.computeScrollExtent(r0, r1, r2, r3, r4, r5)
            return r7
    }

    private int computeScrollOffset(androidx.recyclerview.widget.RecyclerView.State r8) {
            r7 = this;
            int r0 = r7.getChildCount()
            if (r0 != 0) goto L8
            r8 = 0
            return r8
        L8:
            r7.ensureLayoutState()
            androidx.recyclerview.widget.OrientationHelper r1 = r7.mOrientationHelper
            boolean r0 = r7.mSmoothScrollbarEnabled
            r0 = r0 ^ 1
            android.view.View r2 = r7.findFirstVisibleChildClosestToStart(r0)
            boolean r0 = r7.mSmoothScrollbarEnabled
            r0 = r0 ^ 1
            android.view.View r3 = r7.findFirstVisibleChildClosestToEnd(r0)
            boolean r5 = r7.mSmoothScrollbarEnabled
            boolean r6 = r7.mShouldReverseLayout
            r0 = r8
            r4 = r7
            int r8 = androidx.recyclerview.widget.ScrollbarHelper.computeScrollOffset(r0, r1, r2, r3, r4, r5, r6)
            return r8
    }

    private int computeScrollRange(androidx.recyclerview.widget.RecyclerView.State r7) {
            r6 = this;
            int r0 = r6.getChildCount()
            if (r0 != 0) goto L8
            r7 = 0
            return r7
        L8:
            r6.ensureLayoutState()
            androidx.recyclerview.widget.OrientationHelper r1 = r6.mOrientationHelper
            boolean r0 = r6.mSmoothScrollbarEnabled
            r0 = r0 ^ 1
            android.view.View r2 = r6.findFirstVisibleChildClosestToStart(r0)
            boolean r0 = r6.mSmoothScrollbarEnabled
            r0 = r0 ^ 1
            android.view.View r3 = r6.findFirstVisibleChildClosestToEnd(r0)
            boolean r5 = r6.mSmoothScrollbarEnabled
            r0 = r7
            r4 = r6
            int r7 = androidx.recyclerview.widget.ScrollbarHelper.computeScrollRange(r0, r1, r2, r3, r4, r5)
            return r7
    }

    private android.view.View findFirstPartiallyOrCompletelyInvisibleChild() {
            r2 = this;
            int r0 = r2.getChildCount()
            r1 = 0
            android.view.View r0 = r2.findOnePartiallyOrCompletelyInvisibleChild(r1, r0)
            return r0
    }

    private android.view.View findLastPartiallyOrCompletelyInvisibleChild() {
            r2 = this;
            int r0 = r2.getChildCount()
            int r0 = r0 + (-1)
            r1 = -1
            android.view.View r0 = r2.findOnePartiallyOrCompletelyInvisibleChild(r0, r1)
            return r0
    }

    private android.view.View findPartiallyOrCompletelyInvisibleChildClosestToEnd() {
            r1 = this;
            boolean r0 = r1.mShouldReverseLayout
            if (r0 == 0) goto L9
            android.view.View r0 = r1.findFirstPartiallyOrCompletelyInvisibleChild()
            goto Ld
        L9:
            android.view.View r0 = r1.findLastPartiallyOrCompletelyInvisibleChild()
        Ld:
            return r0
    }

    private android.view.View findPartiallyOrCompletelyInvisibleChildClosestToStart() {
            r1 = this;
            boolean r0 = r1.mShouldReverseLayout
            if (r0 == 0) goto L9
            android.view.View r0 = r1.findLastPartiallyOrCompletelyInvisibleChild()
            goto Ld
        L9:
            android.view.View r0 = r1.findFirstPartiallyOrCompletelyInvisibleChild()
        Ld:
            return r0
    }

    private int fixLayoutEndGap(int r2, androidx.recyclerview.widget.RecyclerView.Recycler r3, androidx.recyclerview.widget.RecyclerView.State r4, boolean r5) {
            r1 = this;
            androidx.recyclerview.widget.OrientationHelper r0 = r1.mOrientationHelper
            int r0 = r0.getEndAfterPadding()
            int r0 = r0 - r2
            if (r0 <= 0) goto L23
            int r0 = -r0
            int r3 = r1.scrollBy(r0, r3, r4)
            int r3 = -r3
            int r2 = r2 + r3
            if (r5 == 0) goto L22
            androidx.recyclerview.widget.OrientationHelper r4 = r1.mOrientationHelper
            int r4 = r4.getEndAfterPadding()
            int r4 = r4 - r2
            if (r4 <= 0) goto L22
            androidx.recyclerview.widget.OrientationHelper r2 = r1.mOrientationHelper
            r2.offsetChildren(r4)
            int r4 = r4 + r3
            return r4
        L22:
            return r3
        L23:
            r2 = 0
            return r2
    }

    private int fixLayoutStartGap(int r2, androidx.recyclerview.widget.RecyclerView.Recycler r3, androidx.recyclerview.widget.RecyclerView.State r4, boolean r5) {
            r1 = this;
            androidx.recyclerview.widget.OrientationHelper r0 = r1.mOrientationHelper
            int r0 = r0.getStartAfterPadding()
            int r0 = r2 - r0
            if (r0 <= 0) goto L23
            int r3 = r1.scrollBy(r0, r3, r4)
            int r3 = -r3
            int r2 = r2 + r3
            if (r5 == 0) goto L22
            androidx.recyclerview.widget.OrientationHelper r4 = r1.mOrientationHelper
            int r4 = r4.getStartAfterPadding()
            int r2 = r2 - r4
            if (r2 <= 0) goto L22
            androidx.recyclerview.widget.OrientationHelper r4 = r1.mOrientationHelper
            int r5 = -r2
            r4.offsetChildren(r5)
            int r3 = r3 - r2
        L22:
            return r3
        L23:
            r2 = 0
            return r2
    }

    private android.view.View getChildClosestToEnd() {
            r1 = this;
            boolean r0 = r1.mShouldReverseLayout
            if (r0 == 0) goto L6
            r0 = 0
            goto Lc
        L6:
            int r0 = r1.getChildCount()
            int r0 = r0 + (-1)
        Lc:
            android.view.View r0 = r1.getChildAt(r0)
            return r0
    }

    private android.view.View getChildClosestToStart() {
            r1 = this;
            boolean r0 = r1.mShouldReverseLayout
            if (r0 == 0) goto Lb
            int r0 = r1.getChildCount()
            int r0 = r0 + (-1)
            goto Lc
        Lb:
            r0 = 0
        Lc:
            android.view.View r0 = r1.getChildAt(r0)
            return r0
    }

    private void layoutForPredictiveAnimations(androidx.recyclerview.widget.RecyclerView.Recycler r16, androidx.recyclerview.widget.RecyclerView.State r17, int r18, int r19) {
            r15 = this;
            r0 = r15
            r1 = r16
            r2 = r17
            boolean r3 = r17.willRunPredictiveAnimations()
            if (r3 == 0) goto Lad
            int r3 = r15.getChildCount()
            if (r3 == 0) goto Lad
            boolean r3 = r17.isPreLayout()
            if (r3 != 0) goto Lad
            boolean r3 = r15.supportsPredictiveItemAnimations()
            if (r3 != 0) goto L1f
            goto Lad
        L1f:
            java.util.List r3 = r16.getScrapList()
            int r4 = r3.size()
            r5 = 0
            android.view.View r6 = r15.getChildAt(r5)
            int r6 = r15.getPosition(r6)
            r7 = 0
            r8 = 0
            r9 = 0
        L33:
            if (r7 >= r4) goto L6a
            java.lang.Object r10 = r3.get(r7)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r10 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r10
            boolean r11 = r10.isRemoved()
            if (r11 == 0) goto L42
            goto L67
        L42:
            int r11 = r10.getLayoutPosition()
            r12 = 1
            if (r11 >= r6) goto L4b
            r11 = 1
            goto L4c
        L4b:
            r11 = 0
        L4c:
            boolean r13 = r0.mShouldReverseLayout
            r14 = -1
            if (r11 == r13) goto L52
            r12 = -1
        L52:
            if (r12 != r14) goto L5e
            androidx.recyclerview.widget.OrientationHelper r11 = r0.mOrientationHelper
            android.view.View r10 = r10.itemView
            int r10 = r11.getDecoratedMeasurement(r10)
            int r8 = r8 + r10
            goto L67
        L5e:
            androidx.recyclerview.widget.OrientationHelper r11 = r0.mOrientationHelper
            android.view.View r10 = r10.itemView
            int r10 = r11.getDecoratedMeasurement(r10)
            int r9 = r9 + r10
        L67:
            int r7 = r7 + 1
            goto L33
        L6a:
            androidx.recyclerview.widget.LinearLayoutManager$LayoutState r4 = r0.mLayoutState
            r4.mScrapList = r3
            if (r8 <= 0) goto L8b
            android.view.View r3 = r15.getChildClosestToStart()
            int r3 = r15.getPosition(r3)
            r4 = r18
            r15.updateLayoutStateToFillStart(r3, r4)
            androidx.recyclerview.widget.LinearLayoutManager$LayoutState r3 = r0.mLayoutState
            r3.mExtraFillSpace = r8
            r3.mAvailable = r5
            r3.assignPositionFromScrapList()
            androidx.recyclerview.widget.LinearLayoutManager$LayoutState r3 = r0.mLayoutState
            r15.fill(r1, r3, r2, r5)
        L8b:
            if (r9 <= 0) goto La8
            android.view.View r3 = r15.getChildClosestToEnd()
            int r3 = r15.getPosition(r3)
            r4 = r19
            r15.updateLayoutStateToFillEnd(r3, r4)
            androidx.recyclerview.widget.LinearLayoutManager$LayoutState r3 = r0.mLayoutState
            r3.mExtraFillSpace = r9
            r3.mAvailable = r5
            r3.assignPositionFromScrapList()
            androidx.recyclerview.widget.LinearLayoutManager$LayoutState r3 = r0.mLayoutState
            r15.fill(r1, r3, r2, r5)
        La8:
            androidx.recyclerview.widget.LinearLayoutManager$LayoutState r1 = r0.mLayoutState
            r2 = 0
            r1.mScrapList = r2
        Lad:
            return
    }

    private void logChildren() {
            r5 = this;
            java.lang.String r0 = "LinearLayoutManager"
            java.lang.String r1 = "internal representation of views on the screen"
            android.util.Log.d(r0, r1)
            r1 = 0
        L8:
            int r2 = r5.getChildCount()
            if (r1 >= r2) goto L37
            android.view.View r2 = r5.getChildAt(r1)
            java.lang.String r3 = "item "
            java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
            int r4 = r5.getPosition(r2)
            r3.append(r4)
            java.lang.String r4 = ", coord:"
            r3.append(r4)
            androidx.recyclerview.widget.OrientationHelper r4 = r5.mOrientationHelper
            int r2 = r4.getDecoratedStart(r2)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            android.util.Log.d(r0, r2)
            int r1 = r1 + 1
            goto L8
        L37:
            java.lang.String r1 = "=============="
            android.util.Log.d(r0, r1)
            return
    }

    private void recycleByLayoutState(androidx.recyclerview.widget.RecyclerView.Recycler r4, androidx.recyclerview.widget.LinearLayoutManager.LayoutState r5) {
            r3 = this;
            boolean r0 = r5.mRecycle
            if (r0 == 0) goto L19
            boolean r0 = r5.mInfinite
            if (r0 == 0) goto L9
            goto L19
        L9:
            int r0 = r5.mScrollingOffset
            int r1 = r5.mNoRecycleSpace
            int r5 = r5.mLayoutDirection
            r2 = -1
            if (r5 != r2) goto L16
            r3.recycleViewsFromEnd(r4, r0, r1)
            goto L19
        L16:
            r3.recycleViewsFromStart(r4, r0, r1)
        L19:
            return
    }

    private void recycleChildren(androidx.recyclerview.widget.RecyclerView.Recycler r1, int r2, int r3) {
            r0 = this;
            if (r2 != r3) goto L3
            return
        L3:
            if (r3 <= r2) goto Lf
            int r3 = r3 + (-1)
        L7:
            if (r3 < r2) goto L17
            r0.removeAndRecycleViewAt(r3, r1)
            int r3 = r3 + (-1)
            goto L7
        Lf:
            if (r2 <= r3) goto L17
            r0.removeAndRecycleViewAt(r2, r1)
            int r2 = r2 + (-1)
            goto Lf
        L17:
            return
    }

    private void recycleViewsFromEnd(androidx.recyclerview.widget.RecyclerView.Recycler r5, int r6, int r7) {
            r4 = this;
            int r0 = r4.getChildCount()
            if (r6 >= 0) goto L7
            return
        L7:
            androidx.recyclerview.widget.OrientationHelper r1 = r4.mOrientationHelper
            int r1 = r1.getEnd()
            int r1 = r1 - r6
            int r1 = r1 + r7
            boolean r6 = r4.mShouldReverseLayout
            if (r6 == 0) goto L33
            r6 = 0
            r7 = 0
        L15:
            if (r7 >= r0) goto L53
            android.view.View r2 = r4.getChildAt(r7)
            androidx.recyclerview.widget.OrientationHelper r3 = r4.mOrientationHelper
            int r3 = r3.getDecoratedStart(r2)
            if (r3 < r1) goto L2f
            androidx.recyclerview.widget.OrientationHelper r3 = r4.mOrientationHelper
            int r2 = r3.getTransformedStartWithDecoration(r2)
            if (r2 >= r1) goto L2c
            goto L2f
        L2c:
            int r7 = r7 + 1
            goto L15
        L2f:
            r4.recycleChildren(r5, r6, r7)
            return
        L33:
            int r0 = r0 + (-1)
            r6 = r0
        L36:
            if (r6 < 0) goto L53
            android.view.View r7 = r4.getChildAt(r6)
            androidx.recyclerview.widget.OrientationHelper r2 = r4.mOrientationHelper
            int r2 = r2.getDecoratedStart(r7)
            if (r2 < r1) goto L50
            androidx.recyclerview.widget.OrientationHelper r2 = r4.mOrientationHelper
            int r7 = r2.getTransformedStartWithDecoration(r7)
            if (r7 >= r1) goto L4d
            goto L50
        L4d:
            int r6 = r6 + (-1)
            goto L36
        L50:
            r4.recycleChildren(r5, r0, r6)
        L53:
            return
    }

    private void recycleViewsFromStart(androidx.recyclerview.widget.RecyclerView.Recycler r5, int r6, int r7) {
            r4 = this;
            if (r6 >= 0) goto L3
            return
        L3:
            int r6 = r6 - r7
            int r7 = r4.getChildCount()
            boolean r0 = r4.mShouldReverseLayout
            if (r0 == 0) goto L2d
            int r7 = r7 + (-1)
            r0 = r7
        Lf:
            if (r0 < 0) goto L4c
            android.view.View r1 = r4.getChildAt(r0)
            androidx.recyclerview.widget.OrientationHelper r2 = r4.mOrientationHelper
            int r2 = r2.getDecoratedEnd(r1)
            if (r2 > r6) goto L29
            androidx.recyclerview.widget.OrientationHelper r2 = r4.mOrientationHelper
            int r1 = r2.getTransformedEndWithDecoration(r1)
            if (r1 <= r6) goto L26
            goto L29
        L26:
            int r0 = r0 + (-1)
            goto Lf
        L29:
            r4.recycleChildren(r5, r7, r0)
            return
        L2d:
            r0 = 0
            r1 = 0
        L2f:
            if (r1 >= r7) goto L4c
            android.view.View r2 = r4.getChildAt(r1)
            androidx.recyclerview.widget.OrientationHelper r3 = r4.mOrientationHelper
            int r3 = r3.getDecoratedEnd(r2)
            if (r3 > r6) goto L49
            androidx.recyclerview.widget.OrientationHelper r3 = r4.mOrientationHelper
            int r2 = r3.getTransformedEndWithDecoration(r2)
            if (r2 <= r6) goto L46
            goto L49
        L46:
            int r1 = r1 + 1
            goto L2f
        L49:
            r4.recycleChildren(r5, r0, r1)
        L4c:
            return
    }

    private void resolveShouldLayoutReverse() {
            r2 = this;
            int r0 = r2.mOrientation
            r1 = 1
            if (r0 == r1) goto L12
            boolean r0 = r2.isLayoutRTL()
            if (r0 != 0) goto Lc
            goto L12
        Lc:
            boolean r0 = r2.mReverseLayout
            r0 = r0 ^ r1
            r2.mShouldReverseLayout = r0
            goto L16
        L12:
            boolean r0 = r2.mReverseLayout
            r2.mShouldReverseLayout = r0
        L16:
            return
    }

    private boolean updateAnchorFromChildren(androidx.recyclerview.widget.RecyclerView.Recycler r6, androidx.recyclerview.widget.RecyclerView.State r7, androidx.recyclerview.widget.LinearLayoutManager.AnchorInfo r8) {
            r5 = this;
            int r0 = r5.getChildCount()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            android.view.View r0 = r5.getFocusedChild()
            r2 = 1
            if (r0 == 0) goto L3b
            java.util.Objects.requireNonNull(r8)
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r3 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r3
            boolean r4 = r3.isItemRemoved()
            if (r4 != 0) goto L30
            int r4 = r3.getViewLayoutPosition()
            if (r4 < 0) goto L30
            int r3 = r3.getViewLayoutPosition()
            int r4 = r7.getItemCount()
            if (r3 >= r4) goto L30
            r3 = 1
            goto L31
        L30:
            r3 = 0
        L31:
            if (r3 == 0) goto L3b
            int r6 = r5.getPosition(r0)
            r8.assignFromViewAndKeepVisibleRect(r0, r6)
            return r2
        L3b:
            boolean r0 = r5.mLastStackFromEnd
            boolean r3 = r5.mStackFromEnd
            if (r0 == r3) goto L42
            return r1
        L42:
            boolean r0 = r8.mLayoutFromEnd
            android.view.View r6 = r5.findReferenceChild(r6, r7, r0, r3)
            if (r6 == 0) goto L8d
            int r0 = r5.getPosition(r6)
            r8.assignFromView(r6, r0)
            boolean r7 = r7.isPreLayout()
            if (r7 != 0) goto L8c
            boolean r7 = r5.supportsPredictiveItemAnimations()
            if (r7 == 0) goto L8c
            androidx.recyclerview.widget.OrientationHelper r7 = r5.mOrientationHelper
            int r7 = r7.getDecoratedStart(r6)
            androidx.recyclerview.widget.OrientationHelper r0 = r5.mOrientationHelper
            int r6 = r0.getDecoratedEnd(r6)
            androidx.recyclerview.widget.OrientationHelper r0 = r5.mOrientationHelper
            int r0 = r0.getStartAfterPadding()
            androidx.recyclerview.widget.OrientationHelper r3 = r5.mOrientationHelper
            int r3 = r3.getEndAfterPadding()
            if (r6 > r0) goto L7b
            if (r7 >= r0) goto L7b
            r4 = 1
            goto L7c
        L7b:
            r4 = 0
        L7c:
            if (r7 < r3) goto L81
            if (r6 <= r3) goto L81
            r1 = 1
        L81:
            if (r4 != 0) goto L85
            if (r1 == 0) goto L8c
        L85:
            boolean r6 = r8.mLayoutFromEnd
            if (r6 == 0) goto L8a
            r0 = r3
        L8a:
            r8.mCoordinate = r0
        L8c:
            return r2
        L8d:
            return r1
    }

    private boolean updateAnchorFromPendingData(androidx.recyclerview.widget.RecyclerView.State r5, androidx.recyclerview.widget.LinearLayoutManager.AnchorInfo r6) {
            r4 = this;
            boolean r0 = r5.isPreLayout()
            r1 = 0
            if (r0 != 0) goto Lfc
            int r0 = r4.mPendingScrollPosition
            r2 = -1
            if (r0 != r2) goto Le
            goto Lfc
        Le:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 < 0) goto Lf8
            int r5 = r5.getItemCount()
            if (r0 < r5) goto L1a
            goto Lf8
        L1a:
            int r5 = r4.mPendingScrollPosition
            r6.mPosition = r5
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r5 = r4.mPendingSavedState
            r0 = 1
            if (r5 == 0) goto L4d
            boolean r5 = r5.hasValidAnchor()
            if (r5 == 0) goto L4d
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r5 = r4.mPendingSavedState
            boolean r5 = r5.mAnchorLayoutFromEnd
            r6.mLayoutFromEnd = r5
            if (r5 == 0) goto L3f
            androidx.recyclerview.widget.OrientationHelper r5 = r4.mOrientationHelper
            int r5 = r5.getEndAfterPadding()
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r1 = r4.mPendingSavedState
            int r1 = r1.mAnchorOffset
            int r5 = r5 - r1
            r6.mCoordinate = r5
            goto L4c
        L3f:
            androidx.recyclerview.widget.OrientationHelper r5 = r4.mOrientationHelper
            int r5 = r5.getStartAfterPadding()
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r1 = r4.mPendingSavedState
            int r1 = r1.mAnchorOffset
            int r5 = r5 + r1
            r6.mCoordinate = r5
        L4c:
            return r0
        L4d:
            int r5 = r4.mPendingScrollPositionOffset
            if (r5 != r3) goto Lda
            int r5 = r4.mPendingScrollPosition
            android.view.View r5 = r4.findViewByPosition(r5)
            if (r5 == 0) goto Lba
            androidx.recyclerview.widget.OrientationHelper r2 = r4.mOrientationHelper
            int r2 = r2.getDecoratedMeasurement(r5)
            androidx.recyclerview.widget.OrientationHelper r3 = r4.mOrientationHelper
            int r3 = r3.getTotalSpace()
            if (r2 <= r3) goto L6b
            r6.assignCoordinateFromPadding()
            return r0
        L6b:
            androidx.recyclerview.widget.OrientationHelper r2 = r4.mOrientationHelper
            int r2 = r2.getDecoratedStart(r5)
            androidx.recyclerview.widget.OrientationHelper r3 = r4.mOrientationHelper
            int r3 = r3.getStartAfterPadding()
            int r2 = r2 - r3
            if (r2 >= 0) goto L85
            androidx.recyclerview.widget.OrientationHelper r5 = r4.mOrientationHelper
            int r5 = r5.getStartAfterPadding()
            r6.mCoordinate = r5
            r6.mLayoutFromEnd = r1
            return r0
        L85:
            androidx.recyclerview.widget.OrientationHelper r1 = r4.mOrientationHelper
            int r1 = r1.getEndAfterPadding()
            androidx.recyclerview.widget.OrientationHelper r2 = r4.mOrientationHelper
            int r2 = r2.getDecoratedEnd(r5)
            int r1 = r1 - r2
            if (r1 >= 0) goto L9f
            androidx.recyclerview.widget.OrientationHelper r5 = r4.mOrientationHelper
            int r5 = r5.getEndAfterPadding()
            r6.mCoordinate = r5
            r6.mLayoutFromEnd = r0
            return r0
        L9f:
            boolean r1 = r6.mLayoutFromEnd
            if (r1 == 0) goto Lb1
            androidx.recyclerview.widget.OrientationHelper r1 = r4.mOrientationHelper
            int r5 = r1.getDecoratedEnd(r5)
            androidx.recyclerview.widget.OrientationHelper r1 = r4.mOrientationHelper
            int r1 = r1.getTotalSpaceChange()
            int r1 = r1 + r5
            goto Lb7
        Lb1:
            androidx.recyclerview.widget.OrientationHelper r1 = r4.mOrientationHelper
            int r1 = r1.getDecoratedStart(r5)
        Lb7:
            r6.mCoordinate = r1
            goto Ld9
        Lba:
            int r5 = r4.getChildCount()
            if (r5 <= 0) goto Ld6
            android.view.View r5 = r4.getChildAt(r1)
            int r5 = r4.getPosition(r5)
            int r2 = r4.mPendingScrollPosition
            if (r2 >= r5) goto Lce
            r5 = 1
            goto Lcf
        Lce:
            r5 = 0
        Lcf:
            boolean r2 = r4.mShouldReverseLayout
            if (r5 != r2) goto Ld4
            r1 = 1
        Ld4:
            r6.mLayoutFromEnd = r1
        Ld6:
            r6.assignCoordinateFromPadding()
        Ld9:
            return r0
        Lda:
            boolean r5 = r4.mShouldReverseLayout
            r6.mLayoutFromEnd = r5
            if (r5 == 0) goto Lec
            androidx.recyclerview.widget.OrientationHelper r5 = r4.mOrientationHelper
            int r5 = r5.getEndAfterPadding()
            int r1 = r4.mPendingScrollPositionOffset
            int r5 = r5 - r1
            r6.mCoordinate = r5
            goto Lf7
        Lec:
            androidx.recyclerview.widget.OrientationHelper r5 = r4.mOrientationHelper
            int r5 = r5.getStartAfterPadding()
            int r1 = r4.mPendingScrollPositionOffset
            int r5 = r5 + r1
            r6.mCoordinate = r5
        Lf7:
            return r0
        Lf8:
            r4.mPendingScrollPosition = r2
            r4.mPendingScrollPositionOffset = r3
        Lfc:
            return r1
    }

    private void updateAnchorInfoForLayout(androidx.recyclerview.widget.RecyclerView.Recycler r2, androidx.recyclerview.widget.RecyclerView.State r3, androidx.recyclerview.widget.LinearLayoutManager.AnchorInfo r4) {
            r1 = this;
            boolean r0 = r1.updateAnchorFromPendingData(r3, r4)
            if (r0 == 0) goto L7
            return
        L7:
            boolean r2 = r1.updateAnchorFromChildren(r2, r3, r4)
            if (r2 == 0) goto Le
            return
        Le:
            r4.assignCoordinateFromPadding()
            boolean r2 = r1.mStackFromEnd
            if (r2 == 0) goto L1c
            int r2 = r3.getItemCount()
            int r2 = r2 + (-1)
            goto L1d
        L1c:
            r2 = 0
        L1d:
            r4.mPosition = r2
            return
    }

    private void updateLayoutState(int r5, int r6, boolean r7, androidx.recyclerview.widget.RecyclerView.State r8) {
            r4 = this;
            androidx.recyclerview.widget.LinearLayoutManager$LayoutState r0 = r4.mLayoutState
            androidx.recyclerview.widget.OrientationHelper r1 = r4.mOrientationHelper
            int r1 = r1.getMode()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L16
            androidx.recyclerview.widget.OrientationHelper r1 = r4.mOrientationHelper
            int r1 = r1.getEnd()
            if (r1 != 0) goto L16
            r1 = 1
            goto L17
        L16:
            r1 = 0
        L17:
            r0.mInfinite = r1
            androidx.recyclerview.widget.LinearLayoutManager$LayoutState r0 = r4.mLayoutState
            r0.mLayoutDirection = r5
            int[] r0 = r4.mReusableIntPair
            r0[r3] = r3
            r0[r2] = r3
            r4.calculateExtraLayoutSpace(r8, r0)
            int[] r8 = r4.mReusableIntPair
            r8 = r8[r3]
            int r8 = java.lang.Math.max(r3, r8)
            int[] r0 = r4.mReusableIntPair
            r0 = r0[r2]
            int r0 = java.lang.Math.max(r3, r0)
            if (r5 != r2) goto L39
            r3 = 1
        L39:
            androidx.recyclerview.widget.LinearLayoutManager$LayoutState r5 = r4.mLayoutState
            if (r3 == 0) goto L3f
            r1 = r0
            goto L40
        L3f:
            r1 = r8
        L40:
            r5.mExtraFillSpace = r1
            if (r3 == 0) goto L45
            goto L46
        L45:
            r8 = r0
        L46:
            r5.mNoRecycleSpace = r8
            r8 = -1
            if (r3 == 0) goto L82
            androidx.recyclerview.widget.OrientationHelper r0 = r4.mOrientationHelper
            int r0 = r0.getEndPadding()
            int r0 = r0 + r1
            r5.mExtraFillSpace = r0
            android.view.View r5 = r4.getChildClosestToEnd()
            androidx.recyclerview.widget.LinearLayoutManager$LayoutState r0 = r4.mLayoutState
            boolean r1 = r4.mShouldReverseLayout
            if (r1 == 0) goto L5f
            r2 = -1
        L5f:
            r0.mItemDirection = r2
            int r8 = r4.getPosition(r5)
            androidx.recyclerview.widget.LinearLayoutManager$LayoutState r1 = r4.mLayoutState
            int r2 = r1.mItemDirection
            int r8 = r8 + r2
            r0.mCurrentPosition = r8
            androidx.recyclerview.widget.OrientationHelper r8 = r4.mOrientationHelper
            int r8 = r8.getDecoratedEnd(r5)
            r1.mOffset = r8
            androidx.recyclerview.widget.OrientationHelper r8 = r4.mOrientationHelper
            int r5 = r8.getDecoratedEnd(r5)
            androidx.recyclerview.widget.OrientationHelper r8 = r4.mOrientationHelper
            int r8 = r8.getEndAfterPadding()
            int r5 = r5 - r8
            goto Lbe
        L82:
            android.view.View r5 = r4.getChildClosestToStart()
            androidx.recyclerview.widget.LinearLayoutManager$LayoutState r0 = r4.mLayoutState
            int r1 = r0.mExtraFillSpace
            androidx.recyclerview.widget.OrientationHelper r3 = r4.mOrientationHelper
            int r3 = r3.getStartAfterPadding()
            int r3 = r3 + r1
            r0.mExtraFillSpace = r3
            androidx.recyclerview.widget.LinearLayoutManager$LayoutState r0 = r4.mLayoutState
            boolean r1 = r4.mShouldReverseLayout
            if (r1 == 0) goto L9a
            goto L9b
        L9a:
            r2 = -1
        L9b:
            r0.mItemDirection = r2
            int r8 = r4.getPosition(r5)
            androidx.recyclerview.widget.LinearLayoutManager$LayoutState r1 = r4.mLayoutState
            int r2 = r1.mItemDirection
            int r8 = r8 + r2
            r0.mCurrentPosition = r8
            androidx.recyclerview.widget.OrientationHelper r8 = r4.mOrientationHelper
            int r8 = r8.getDecoratedStart(r5)
            r1.mOffset = r8
            androidx.recyclerview.widget.OrientationHelper r8 = r4.mOrientationHelper
            int r5 = r8.getDecoratedStart(r5)
            int r5 = -r5
            androidx.recyclerview.widget.OrientationHelper r8 = r4.mOrientationHelper
            int r8 = r8.getStartAfterPadding()
            int r5 = r5 + r8
        Lbe:
            androidx.recyclerview.widget.LinearLayoutManager$LayoutState r8 = r4.mLayoutState
            r8.mAvailable = r6
            if (r7 == 0) goto Lc7
            int r6 = r6 - r5
            r8.mAvailable = r6
        Lc7:
            r8.mScrollingOffset = r5
            return
    }

    private void updateLayoutStateToFillEnd(int r4, int r5) {
            r3 = this;
            androidx.recyclerview.widget.LinearLayoutManager$LayoutState r0 = r3.mLayoutState
            androidx.recyclerview.widget.OrientationHelper r1 = r3.mOrientationHelper
            int r1 = r1.getEndAfterPadding()
            int r1 = r1 - r5
            r0.mAvailable = r1
            androidx.recyclerview.widget.LinearLayoutManager$LayoutState r0 = r3.mLayoutState
            boolean r1 = r3.mShouldReverseLayout
            r2 = 1
            if (r1 == 0) goto L14
            r1 = -1
            goto L15
        L14:
            r1 = 1
        L15:
            r0.mItemDirection = r1
            r0.mCurrentPosition = r4
            r0.mLayoutDirection = r2
            r0.mOffset = r5
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.mScrollingOffset = r4
            return
    }

    private void updateLayoutStateToFillEnd(androidx.recyclerview.widget.LinearLayoutManager.AnchorInfo r2) {
            r1 = this;
            int r0 = r2.mPosition
            int r2 = r2.mCoordinate
            r1.updateLayoutStateToFillEnd(r0, r2)
            return
    }

    private void updateLayoutStateToFillStart(int r3, int r4) {
            r2 = this;
            androidx.recyclerview.widget.LinearLayoutManager$LayoutState r0 = r2.mLayoutState
            androidx.recyclerview.widget.OrientationHelper r1 = r2.mOrientationHelper
            int r1 = r1.getStartAfterPadding()
            int r1 = r4 - r1
            r0.mAvailable = r1
            androidx.recyclerview.widget.LinearLayoutManager$LayoutState r0 = r2.mLayoutState
            r0.mCurrentPosition = r3
            boolean r3 = r2.mShouldReverseLayout
            r1 = -1
            if (r3 == 0) goto L17
            r3 = 1
            goto L18
        L17:
            r3 = -1
        L18:
            r0.mItemDirection = r3
            r0.mLayoutDirection = r1
            r0.mOffset = r4
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.mScrollingOffset = r3
            return
    }

    private void updateLayoutStateToFillStart(androidx.recyclerview.widget.LinearLayoutManager.AnchorInfo r2) {
            r1 = this;
            int r0 = r2.mPosition
            int r2 = r2.mCoordinate
            r1.updateLayoutStateToFillStart(r0, r2)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void assertNotInLayoutOrScroll(java.lang.String r2) {
            r1 = this;
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r0 = r1.mPendingSavedState
            if (r0 != 0) goto L7
            super.assertNotInLayoutOrScroll(r2)
        L7:
            return
    }

    public void calculateExtraLayoutSpace(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r4, @androidx.annotation.NonNull int[] r5) {
            r3 = this;
            boolean r4 = r4.hasTargetScrollPosition()
            r0 = 0
            if (r4 == 0) goto Le
            androidx.recyclerview.widget.OrientationHelper r4 = r3.mOrientationHelper
            int r4 = r4.getTotalSpace()
            goto Lf
        Le:
            r4 = 0
        Lf:
            androidx.recyclerview.widget.LinearLayoutManager$LayoutState r1 = r3.mLayoutState
            int r1 = r1.mLayoutDirection
            r2 = -1
            if (r1 != r2) goto L18
            r1 = 0
            goto L1a
        L18:
            r1 = r4
            r4 = 0
        L1a:
            r5[r0] = r4
            r4 = 1
            r5[r4] = r1
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
            r1 = this;
            int r0 = r1.mOrientation
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
            r2 = this;
            int r0 = r2.mOrientation
            r1 = 1
            if (r0 != r1) goto L6
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void collectAdjacentPrefetchPositions(int r2, int r3, androidx.recyclerview.widget.RecyclerView.State r4, androidx.recyclerview.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry r5) {
            r1 = this;
            int r0 = r1.mOrientation
            if (r0 != 0) goto L5
            goto L6
        L5:
            r2 = r3
        L6:
            int r3 = r1.getChildCount()
            if (r3 == 0) goto L24
            if (r2 != 0) goto Lf
            goto L24
        Lf:
            r1.ensureLayoutState()
            r3 = 1
            if (r2 <= 0) goto L17
            r0 = 1
            goto L18
        L17:
            r0 = -1
        L18:
            int r2 = java.lang.Math.abs(r2)
            r1.updateLayoutState(r0, r2, r3, r4)
            androidx.recyclerview.widget.LinearLayoutManager$LayoutState r2 = r1.mLayoutState
            r1.collectPrefetchPositionsForLayoutState(r4, r2, r5)
        L24:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void collectInitialPrefetchPositions(int r6, androidx.recyclerview.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry r7) {
            r5 = this;
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r0 = r5.mPendingSavedState
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L13
            boolean r0 = r0.hasValidAnchor()
            if (r0 == 0) goto L13
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r0 = r5.mPendingSavedState
            boolean r3 = r0.mAnchorLayoutFromEnd
            int r0 = r0.mAnchorPosition
            goto L22
        L13:
            r5.resolveShouldLayoutReverse()
            boolean r3 = r5.mShouldReverseLayout
            int r0 = r5.mPendingScrollPosition
            if (r0 != r1) goto L22
            if (r3 == 0) goto L21
            int r0 = r6 + (-1)
            goto L22
        L21:
            r0 = 0
        L22:
            if (r3 == 0) goto L25
            goto L26
        L25:
            r1 = 1
        L26:
            r3 = 0
        L27:
            int r4 = r5.mInitialPrefetchItemCount
            if (r3 >= r4) goto L36
            if (r0 < 0) goto L36
            if (r0 >= r6) goto L36
            r7.addPosition(r0, r2)
            int r0 = r0 + r1
            int r3 = r3 + 1
            goto L27
        L36:
            return
    }

    public void collectPrefetchPositionsForLayoutState(androidx.recyclerview.widget.RecyclerView.State r2, androidx.recyclerview.widget.LinearLayoutManager.LayoutState r3, androidx.recyclerview.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry r4) {
            r1 = this;
            int r0 = r3.mCurrentPosition
            if (r0 < 0) goto L14
            int r2 = r2.getItemCount()
            if (r0 >= r2) goto L14
            r2 = 0
            int r3 = r3.mScrollingOffset
            int r2 = java.lang.Math.max(r2, r3)
            r4.addPosition(r0, r2)
        L14:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(androidx.recyclerview.widget.RecyclerView.State r1) {
            r0 = this;
            int r1 = r0.computeScrollExtent(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(androidx.recyclerview.widget.RecyclerView.State r1) {
            r0 = this;
            int r1 = r0.computeScrollOffset(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(androidx.recyclerview.widget.RecyclerView.State r1) {
            r0 = this;
            int r1 = r0.computeScrollRange(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public android.graphics.PointF computeScrollVectorForPosition(int r4) {
            r3 = this;
            int r0 = r3.getChildCount()
            if (r0 != 0) goto L8
            r4 = 0
            return r4
        L8:
            r0 = 0
            android.view.View r1 = r3.getChildAt(r0)
            int r1 = r3.getPosition(r1)
            r2 = 1
            if (r4 >= r1) goto L15
            r0 = 1
        L15:
            boolean r4 = r3.mShouldReverseLayout
            if (r0 == r4) goto L1a
            r2 = -1
        L1a:
            int r4 = r3.mOrientation
            r0 = 0
            if (r4 != 0) goto L26
            android.graphics.PointF r4 = new android.graphics.PointF
            float r1 = (float) r2
            r4.<init>(r1, r0)
            return r4
        L26:
            android.graphics.PointF r4 = new android.graphics.PointF
            float r1 = (float) r2
            r4.<init>(r0, r1)
            return r4
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(androidx.recyclerview.widget.RecyclerView.State r1) {
            r0 = this;
            int r1 = r0.computeScrollExtent(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(androidx.recyclerview.widget.RecyclerView.State r1) {
            r0 = this;
            int r1 = r0.computeScrollOffset(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(androidx.recyclerview.widget.RecyclerView.State r1) {
            r0 = this;
            int r1 = r0.computeScrollRange(r1)
            return r1
    }

    public final int convertFocusDirectionToLayoutDirection(int r5) {
            r4 = this;
            r0 = -1
            r1 = 1
            if (r5 == r1) goto L47
            r2 = 2
            if (r5 == r2) goto L3a
            r2 = 17
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r2) goto L32
            r2 = 33
            if (r5 == r2) goto L2a
            r0 = 66
            if (r5 == r0) goto L22
            r0 = 130(0x82, float:1.82E-43)
            if (r5 == r0) goto L1a
            return r3
        L1a:
            int r5 = r4.mOrientation
            if (r5 != r1) goto L1f
            goto L21
        L1f:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
        L21:
            return r1
        L22:
            int r5 = r4.mOrientation
            if (r5 != 0) goto L27
            goto L29
        L27:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
        L29:
            return r1
        L2a:
            int r5 = r4.mOrientation
            if (r5 != r1) goto L2f
            goto L31
        L2f:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L31:
            return r0
        L32:
            int r5 = r4.mOrientation
            if (r5 != 0) goto L37
            goto L39
        L37:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L39:
            return r0
        L3a:
            int r5 = r4.mOrientation
            if (r5 != r1) goto L3f
            return r1
        L3f:
            boolean r5 = r4.isLayoutRTL()
            if (r5 == 0) goto L46
            return r0
        L46:
            return r1
        L47:
            int r5 = r4.mOrientation
            if (r5 != r1) goto L4c
            return r0
        L4c:
            boolean r5 = r4.isLayoutRTL()
            if (r5 == 0) goto L53
            return r1
        L53:
            return r0
    }

    public final void ensureLayoutState() {
            r1 = this;
            androidx.recyclerview.widget.LinearLayoutManager$LayoutState r0 = r1.mLayoutState
            if (r0 != 0) goto Lb
            androidx.recyclerview.widget.LinearLayoutManager$LayoutState r0 = new androidx.recyclerview.widget.LinearLayoutManager$LayoutState
            r0.<init>()
            r1.mLayoutState = r0
        Lb:
            return
    }

    public final int fill(androidx.recyclerview.widget.RecyclerView.Recycler r8, androidx.recyclerview.widget.LinearLayoutManager.LayoutState r9, androidx.recyclerview.widget.RecyclerView.State r10, boolean r11) {
            r7 = this;
            int r0 = r9.mAvailable
            int r1 = r9.mScrollingOffset
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L10
            if (r0 >= 0) goto Ld
            int r1 = r1 + r0
            r9.mScrollingOffset = r1
        Ld:
            r7.recycleByLayoutState(r8, r9)
        L10:
            int r1 = r9.mAvailable
            int r3 = r9.mExtraFillSpace
            int r1 = r1 + r3
            androidx.recyclerview.widget.LinearLayoutManager$LayoutChunkResult r3 = r7.mLayoutChunkResult
        L17:
            boolean r4 = r9.mInfinite
            if (r4 != 0) goto L1d
            if (r1 <= 0) goto L6e
        L1d:
            boolean r4 = r9.hasMore(r10)
            if (r4 == 0) goto L6e
            r4 = 0
            r3.mConsumed = r4
            r3.mFinished = r4
            r3.mIgnoreConsumed = r4
            r3.mFocusable = r4
            r7.layoutChunk(r8, r10, r9, r3)
            boolean r4 = r3.mFinished
            if (r4 == 0) goto L34
            goto L6e
        L34:
            int r4 = r9.mOffset
            int r5 = r3.mConsumed
            int r6 = r9.mLayoutDirection
            int r5 = r5 * r6
            int r5 = r5 + r4
            r9.mOffset = r5
            boolean r4 = r3.mIgnoreConsumed
            if (r4 == 0) goto L4d
            java.util.List<androidx.recyclerview.widget.RecyclerView$ViewHolder> r4 = r9.mScrapList
            if (r4 != 0) goto L4d
            boolean r4 = r10.isPreLayout()
            if (r4 != 0) goto L55
        L4d:
            int r4 = r9.mAvailable
            int r5 = r3.mConsumed
            int r4 = r4 - r5
            r9.mAvailable = r4
            int r1 = r1 - r5
        L55:
            int r4 = r9.mScrollingOffset
            if (r4 == r2) goto L68
            int r5 = r3.mConsumed
            int r4 = r4 + r5
            r9.mScrollingOffset = r4
            int r5 = r9.mAvailable
            if (r5 >= 0) goto L65
            int r4 = r4 + r5
            r9.mScrollingOffset = r4
        L65:
            r7.recycleByLayoutState(r8, r9)
        L68:
            if (r11 == 0) goto L17
            boolean r4 = r3.mFocusable
            if (r4 == 0) goto L17
        L6e:
            int r8 = r9.mAvailable
            int r0 = r0 - r8
            return r0
    }

    public int findFirstCompletelyVisibleItemPosition() {
            r3 = this;
            int r0 = r3.getChildCount()
            r1 = 0
            r2 = 1
            android.view.View r0 = r3.findOneVisibleChild(r1, r0, r2, r1)
            if (r0 != 0) goto Le
            r0 = -1
            goto L12
        Le:
            int r0 = r3.getPosition(r0)
        L12:
            return r0
    }

    public final android.view.View findFirstVisibleChildClosestToEnd(boolean r4) {
            r3 = this;
            boolean r0 = r3.mShouldReverseLayout
            r1 = 1
            if (r0 == 0) goto Lf
            r0 = 0
            int r2 = r3.getChildCount()
            android.view.View r4 = r3.findOneVisibleChild(r0, r2, r4, r1)
            return r4
        Lf:
            int r0 = r3.getChildCount()
            r2 = -1
            int r0 = r0 + r2
            android.view.View r4 = r3.findOneVisibleChild(r0, r2, r4, r1)
            return r4
    }

    public final android.view.View findFirstVisibleChildClosestToStart(boolean r4) {
            r3 = this;
            boolean r0 = r3.mShouldReverseLayout
            r1 = 1
            if (r0 == 0) goto L10
            int r0 = r3.getChildCount()
            r2 = -1
            int r0 = r0 + r2
            android.view.View r4 = r3.findOneVisibleChild(r0, r2, r4, r1)
            return r4
        L10:
            r0 = 0
            int r2 = r3.getChildCount()
            android.view.View r4 = r3.findOneVisibleChild(r0, r2, r4, r1)
            return r4
    }

    public int findFirstVisibleItemPosition() {
            r3 = this;
            int r0 = r3.getChildCount()
            r1 = 0
            r2 = 1
            android.view.View r0 = r3.findOneVisibleChild(r1, r0, r1, r2)
            if (r0 != 0) goto Le
            r0 = -1
            goto L12
        Le:
            int r0 = r3.getPosition(r0)
        L12:
            return r0
    }

    public int findLastCompletelyVisibleItemPosition() {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 1
            int r0 = r0 - r1
            r2 = -1
            r3 = 0
            android.view.View r0 = r4.findOneVisibleChild(r0, r2, r1, r3)
            if (r0 != 0) goto Lf
            goto L13
        Lf:
            int r2 = r4.getPosition(r0)
        L13:
            return r2
    }

    public int findLastVisibleItemPosition() {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 1
            int r0 = r0 - r1
            r2 = -1
            r3 = 0
            android.view.View r0 = r4.findOneVisibleChild(r0, r2, r3, r1)
            if (r0 != 0) goto Lf
            goto L13
        Lf:
            int r2 = r4.getPosition(r0)
        L13:
            return r2
    }

    public final android.view.View findOnePartiallyOrCompletelyInvisibleChild(int r4, int r5) {
            r3 = this;
            r3.ensureLayoutState()
            if (r5 <= r4) goto L7
            r0 = 1
            goto Lc
        L7:
            if (r5 >= r4) goto Lb
            r0 = -1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 != 0) goto L13
            android.view.View r4 = r3.getChildAt(r4)
            return r4
        L13:
            androidx.recyclerview.widget.OrientationHelper r0 = r3.mOrientationHelper
            android.view.View r1 = r3.getChildAt(r4)
            int r0 = r0.getDecoratedStart(r1)
            androidx.recyclerview.widget.OrientationHelper r1 = r3.mOrientationHelper
            int r1 = r1.getStartAfterPadding()
            if (r0 >= r1) goto L2a
            r0 = 16644(0x4104, float:2.3323E-41)
            r1 = 16388(0x4004, float:2.2964E-41)
            goto L2e
        L2a:
            r0 = 4161(0x1041, float:5.831E-42)
            r1 = 4097(0x1001, float:5.741E-42)
        L2e:
            int r2 = r3.mOrientation
            if (r2 != 0) goto L39
            androidx.recyclerview.widget.ViewBoundsCheck r2 = r3.mHorizontalBoundCheck
            android.view.View r4 = r2.findOneViewWithinBoundFlags(r4, r5, r0, r1)
            goto L3f
        L39:
            androidx.recyclerview.widget.ViewBoundsCheck r2 = r3.mVerticalBoundCheck
            android.view.View r4 = r2.findOneViewWithinBoundFlags(r4, r5, r0, r1)
        L3f:
            return r4
    }

    public final android.view.View findOneVisibleChild(int r2, int r3, boolean r4, boolean r5) {
            r1 = this;
            r1.ensureLayoutState()
            r0 = 320(0x140, float:4.48E-43)
            if (r4 == 0) goto La
            r4 = 24579(0x6003, float:3.4443E-41)
            goto Lc
        La:
            r4 = 320(0x140, float:4.48E-43)
        Lc:
            if (r5 == 0) goto Lf
            goto L10
        Lf:
            r0 = 0
        L10:
            int r5 = r1.mOrientation
            if (r5 != 0) goto L1b
            androidx.recyclerview.widget.ViewBoundsCheck r5 = r1.mHorizontalBoundCheck
            android.view.View r2 = r5.findOneViewWithinBoundFlags(r2, r3, r4, r0)
            goto L21
        L1b:
            androidx.recyclerview.widget.ViewBoundsCheck r5 = r1.mVerticalBoundCheck
            android.view.View r2 = r5.findOneViewWithinBoundFlags(r2, r3, r4, r0)
        L21:
            return r2
    }

    public android.view.View findReferenceChild(androidx.recyclerview.widget.RecyclerView.Recycler r17, androidx.recyclerview.widget.RecyclerView.State r18, boolean r19, boolean r20) {
            r16 = this;
            r0 = r16
            r16.ensureLayoutState()
            int r1 = r16.getChildCount()
            r2 = -1
            r3 = 0
            r4 = 1
            if (r20 == 0) goto L15
            int r1 = r16.getChildCount()
            int r1 = r1 - r4
            r5 = -1
            goto L18
        L15:
            r2 = r1
            r1 = 0
            r5 = 1
        L18:
            int r6 = r18.getItemCount()
            androidx.recyclerview.widget.OrientationHelper r7 = r0.mOrientationHelper
            int r7 = r7.getStartAfterPadding()
            androidx.recyclerview.widget.OrientationHelper r8 = r0.mOrientationHelper
            int r8 = r8.getEndAfterPadding()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r2) goto L7a
            android.view.View r12 = r0.getChildAt(r1)
            int r13 = r0.getPosition(r12)
            androidx.recyclerview.widget.OrientationHelper r14 = r0.mOrientationHelper
            int r14 = r14.getDecoratedStart(r12)
            androidx.recyclerview.widget.OrientationHelper r15 = r0.mOrientationHelper
            int r15 = r15.getDecoratedEnd(r12)
            if (r13 < 0) goto L78
            if (r13 >= r6) goto L78
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r13 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r13
            boolean r13 = r13.isItemRemoved()
            if (r13 == 0) goto L55
            if (r11 != 0) goto L78
            r11 = r12
            goto L78
        L55:
            if (r15 > r7) goto L5b
            if (r14 >= r7) goto L5b
            r13 = 1
            goto L5c
        L5b:
            r13 = 0
        L5c:
            if (r14 < r8) goto L62
            if (r15 <= r8) goto L62
            r14 = 1
            goto L63
        L62:
            r14 = 0
        L63:
            if (r13 != 0) goto L69
            if (r14 == 0) goto L68
            goto L69
        L68:
            return r12
        L69:
            if (r19 == 0) goto L71
            if (r14 == 0) goto L6e
            goto L73
        L6e:
            if (r9 != 0) goto L78
            goto L77
        L71:
            if (r13 == 0) goto L75
        L73:
            r10 = r12
            goto L78
        L75:
            if (r9 != 0) goto L78
        L77:
            r9 = r12
        L78:
            int r1 = r1 + r5
            goto L2b
        L7a:
            if (r9 == 0) goto L7d
            goto L82
        L7d:
            if (r10 == 0) goto L81
            r9 = r10
            goto L82
        L81:
            r9 = r11
        L82:
            return r9
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public android.view.View findViewByPosition(int r3) {
            r2 = this;
            int r0 = r2.getChildCount()
            if (r0 != 0) goto L8
            r3 = 0
            return r3
        L8:
            r1 = 0
            android.view.View r1 = r2.getChildAt(r1)
            int r1 = r2.getPosition(r1)
            int r1 = r3 - r1
            if (r1 < 0) goto L22
            if (r1 >= r0) goto L22
            android.view.View r0 = r2.getChildAt(r1)
            int r1 = r2.getPosition(r0)
            if (r1 != r3) goto L22
            return r0
        L22:
            android.view.View r3 = super.findViewByPosition(r3)
            return r3
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateDefaultLayoutParams() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = new androidx.recyclerview.widget.RecyclerView$LayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            return r0
    }

    public int getInitialPrefetchItemCount() {
            r1 = this;
            int r0 = r1.mInitialPrefetchItemCount
            return r0
    }

    public int getOrientation() {
            r1 = this;
            int r0 = r1.mOrientation
            return r0
    }

    public boolean getRecycleChildrenOnDetach() {
            r1 = this;
            boolean r0 = r1.mRecycleChildrenOnDetach
            return r0
    }

    public boolean getReverseLayout() {
            r1 = this;
            boolean r0 = r1.mReverseLayout
            return r0
    }

    public boolean getStackFromEnd() {
            r1 = this;
            boolean r0 = r1.mStackFromEnd
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
            r1 = this;
            r0 = 1
            return r0
    }

    public final boolean isLayoutRTL() {
            r2 = this;
            int r0 = r2.getLayoutDirection()
            r1 = 1
            if (r0 != r1) goto L8
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    public boolean isSmoothScrollbarEnabled() {
            r1 = this;
            boolean r0 = r1.mSmoothScrollbarEnabled
            return r0
    }

    public void layoutChunk(androidx.recyclerview.widget.RecyclerView.Recycler r8, androidx.recyclerview.widget.RecyclerView.State r9, androidx.recyclerview.widget.LinearLayoutManager.LayoutState r10, androidx.recyclerview.widget.LinearLayoutManager.LayoutChunkResult r11) {
            r7 = this;
            android.view.View r8 = r10.next(r8)
            r9 = 1
            if (r8 != 0) goto La
            r11.mFinished = r9
            return
        La:
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            r6 = r0
            androidx.recyclerview.widget.RecyclerView$LayoutParams r6 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r6
            java.util.List<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r10.mScrapList
            r1 = -1
            r2 = 0
            if (r0 != 0) goto L2a
            boolean r0 = r7.mShouldReverseLayout
            int r3 = r10.mLayoutDirection
            if (r3 != r1) goto L1f
            r3 = 1
            goto L20
        L1f:
            r3 = 0
        L20:
            if (r0 != r3) goto L26
            r7.addView(r8)
            goto L3c
        L26:
            r7.addView(r8, r2)
            goto L3c
        L2a:
            boolean r0 = r7.mShouldReverseLayout
            int r3 = r10.mLayoutDirection
            if (r3 != r1) goto L32
            r3 = 1
            goto L33
        L32:
            r3 = 0
        L33:
            if (r0 != r3) goto L39
            r7.addDisappearingView(r8)
            goto L3c
        L39:
            r7.addDisappearingView(r8, r2)
        L3c:
            r7.measureChildWithMargins(r8, r2, r2)
            androidx.recyclerview.widget.OrientationHelper r0 = r7.mOrientationHelper
            int r0 = r0.getDecoratedMeasurement(r8)
            r11.mConsumed = r0
            int r0 = r7.mOrientation
            if (r0 != r9) goto L85
            boolean r0 = r7.isLayoutRTL()
            if (r0 == 0) goto L63
            int r0 = r7.getWidth()
            int r2 = r7.getPaddingRight()
            int r0 = r0 - r2
            androidx.recyclerview.widget.OrientationHelper r2 = r7.mOrientationHelper
            int r2 = r2.getDecoratedMeasurementInOther(r8)
            int r2 = r0 - r2
            goto L6e
        L63:
            int r2 = r7.getPaddingLeft()
            androidx.recyclerview.widget.OrientationHelper r0 = r7.mOrientationHelper
            int r0 = r0.getDecoratedMeasurementInOther(r8)
            int r0 = r0 + r2
        L6e:
            int r3 = r10.mLayoutDirection
            if (r3 != r1) goto L7c
            int r10 = r10.mOffset
            int r1 = r11.mConsumed
            int r1 = r10 - r1
            r5 = r10
            r4 = r0
            r3 = r1
            goto La8
        L7c:
            int r10 = r10.mOffset
            int r1 = r11.mConsumed
            int r1 = r1 + r10
            r3 = r10
            r4 = r0
            r5 = r1
            goto La8
        L85:
            int r0 = r7.getPaddingTop()
            androidx.recyclerview.widget.OrientationHelper r2 = r7.mOrientationHelper
            int r2 = r2.getDecoratedMeasurementInOther(r8)
            int r2 = r2 + r0
            int r3 = r10.mLayoutDirection
            if (r3 != r1) goto L9f
            int r10 = r10.mOffset
            int r1 = r11.mConsumed
            int r1 = r10 - r1
            r4 = r10
            r3 = r0
            r5 = r2
            r2 = r1
            goto La8
        L9f:
            int r10 = r10.mOffset
            int r1 = r11.mConsumed
            int r1 = r1 + r10
            r3 = r0
            r4 = r1
            r5 = r2
            r2 = r10
        La8:
            r0 = r7
            r1 = r8
            r0.layoutDecoratedWithMargins(r1, r2, r3, r4, r5)
            boolean r10 = r6.isItemRemoved()
            if (r10 != 0) goto Lb9
            boolean r10 = r6.isItemChanged()
            if (r10 == 0) goto Lbb
        Lb9:
            r11.mIgnoreConsumed = r9
        Lbb:
            boolean r8 = r8.hasFocusable()
            r11.mFocusable = r8
            return
    }

    public void onAnchorReady(androidx.recyclerview.widget.RecyclerView.Recycler r1, androidx.recyclerview.widget.RecyclerView.State r2, androidx.recyclerview.widget.LinearLayoutManager.AnchorInfo r3, int r4) {
            r0 = this;
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(androidx.recyclerview.widget.RecyclerView r1, androidx.recyclerview.widget.RecyclerView.Recycler r2) {
            r0 = this;
            super.onDetachedFromWindow(r1, r2)
            boolean r1 = r0.mRecycleChildrenOnDetach
            if (r1 == 0) goto Ld
            r0.removeAndRecycleAllViews(r2)
            r2.clear()
        Ld:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public android.view.View onFocusSearchFailed(android.view.View r4, int r5, androidx.recyclerview.widget.RecyclerView.Recycler r6, androidx.recyclerview.widget.RecyclerView.State r7) {
            r3 = this;
            r3.resolveShouldLayoutReverse()
            int r4 = r3.getChildCount()
            r0 = 0
            if (r4 != 0) goto Lb
            return r0
        Lb:
            int r4 = r3.convertFocusDirectionToLayoutDirection(r5)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != r5) goto L14
            return r0
        L14:
            r3.ensureLayoutState()
            r1 = 1051372203(0x3eaaaaab, float:0.33333334)
            androidx.recyclerview.widget.OrientationHelper r2 = r3.mOrientationHelper
            int r2 = r2.getTotalSpace()
            float r2 = (float) r2
            float r2 = r2 * r1
            int r1 = (int) r2
            r2 = 0
            r3.updateLayoutState(r4, r1, r2, r7)
            androidx.recyclerview.widget.LinearLayoutManager$LayoutState r1 = r3.mLayoutState
            r1.mScrollingOffset = r5
            r1.mRecycle = r2
            r5 = 1
            r3.fill(r6, r1, r7, r5)
            r5 = -1
            if (r4 != r5) goto L3a
            android.view.View r6 = r3.findPartiallyOrCompletelyInvisibleChildClosestToStart()
            goto L3e
        L3a:
            android.view.View r6 = r3.findPartiallyOrCompletelyInvisibleChildClosestToEnd()
        L3e:
            if (r4 != r5) goto L45
            android.view.View r4 = r3.getChildClosestToStart()
            goto L49
        L45:
            android.view.View r4 = r3.getChildClosestToEnd()
        L49:
            boolean r5 = r4.hasFocusable()
            if (r5 == 0) goto L53
            if (r6 != 0) goto L52
            return r0
        L52:
            return r4
        L53:
            return r6
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            super.onInitializeAccessibilityEvent(r2)
            int r0 = r1.getChildCount()
            if (r0 <= 0) goto L17
            int r0 = r1.findFirstVisibleItemPosition()
            r2.setFromIndex(r0)
            int r0 = r1.findLastVisibleItemPosition()
            r2.setToIndex(r0)
        L17:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(androidx.recyclerview.widget.RecyclerView.Recycler r9, androidx.recyclerview.widget.RecyclerView.State r10) {
            r8 = this;
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r0 = r8.mPendingSavedState
            r1 = -1
            if (r0 != 0) goto L9
            int r0 = r8.mPendingScrollPosition
            if (r0 == r1) goto L13
        L9:
            int r0 = r10.getItemCount()
            if (r0 != 0) goto L13
            r8.removeAndRecycleAllViews(r9)
            return
        L13:
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r0 = r8.mPendingSavedState
            if (r0 == 0) goto L23
            boolean r0 = r0.hasValidAnchor()
            if (r0 == 0) goto L23
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r0 = r8.mPendingSavedState
            int r0 = r0.mAnchorPosition
            r8.mPendingScrollPosition = r0
        L23:
            r8.ensureLayoutState()
            androidx.recyclerview.widget.LinearLayoutManager$LayoutState r0 = r8.mLayoutState
            r2 = 0
            r0.mRecycle = r2
            r8.resolveShouldLayoutReverse()
            android.view.View r0 = r8.getFocusedChild()
            androidx.recyclerview.widget.LinearLayoutManager$AnchorInfo r3 = r8.mAnchorInfo
            boolean r4 = r3.mValid
            r5 = 1
            if (r4 == 0) goto L6a
            int r4 = r8.mPendingScrollPosition
            if (r4 != r1) goto L6a
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r4 = r8.mPendingSavedState
            if (r4 == 0) goto L42
            goto L6a
        L42:
            if (r0 == 0) goto L7d
            androidx.recyclerview.widget.OrientationHelper r3 = r8.mOrientationHelper
            int r3 = r3.getDecoratedStart(r0)
            androidx.recyclerview.widget.OrientationHelper r4 = r8.mOrientationHelper
            int r4 = r4.getEndAfterPadding()
            if (r3 >= r4) goto L60
            androidx.recyclerview.widget.OrientationHelper r3 = r8.mOrientationHelper
            int r3 = r3.getDecoratedEnd(r0)
            androidx.recyclerview.widget.OrientationHelper r4 = r8.mOrientationHelper
            int r4 = r4.getStartAfterPadding()
            if (r3 > r4) goto L7d
        L60:
            androidx.recyclerview.widget.LinearLayoutManager$AnchorInfo r3 = r8.mAnchorInfo
            int r4 = r8.getPosition(r0)
            r3.assignFromViewAndKeepVisibleRect(r0, r4)
            goto L7d
        L6a:
            r3.reset()
            androidx.recyclerview.widget.LinearLayoutManager$AnchorInfo r0 = r8.mAnchorInfo
            boolean r3 = r8.mShouldReverseLayout
            boolean r4 = r8.mStackFromEnd
            r3 = r3 ^ r4
            r0.mLayoutFromEnd = r3
            r8.updateAnchorInfoForLayout(r9, r10, r0)
            androidx.recyclerview.widget.LinearLayoutManager$AnchorInfo r0 = r8.mAnchorInfo
            r0.mValid = r5
        L7d:
            androidx.recyclerview.widget.LinearLayoutManager$LayoutState r0 = r8.mLayoutState
            int r3 = r0.mLastScrollDelta
            if (r3 < 0) goto L85
            r3 = 1
            goto L86
        L85:
            r3 = -1
        L86:
            r0.mLayoutDirection = r3
            int[] r0 = r8.mReusableIntPair
            r0[r2] = r2
            r0[r5] = r2
            r8.calculateExtraLayoutSpace(r10, r0)
            int[] r0 = r8.mReusableIntPair
            r0 = r0[r2]
            int r0 = java.lang.Math.max(r2, r0)
            androidx.recyclerview.widget.OrientationHelper r3 = r8.mOrientationHelper
            int r3 = r3.getStartAfterPadding()
            int r3 = r3 + r0
            int[] r0 = r8.mReusableIntPair
            r0 = r0[r5]
            int r0 = java.lang.Math.max(r2, r0)
            androidx.recyclerview.widget.OrientationHelper r4 = r8.mOrientationHelper
            int r4 = r4.getEndPadding()
            int r4 = r4 + r0
            boolean r0 = r10.isPreLayout()
            if (r0 == 0) goto Lee
            int r0 = r8.mPendingScrollPosition
            if (r0 == r1) goto Lee
            int r6 = r8.mPendingScrollPositionOffset
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 == r7) goto Lee
            android.view.View r0 = r8.findViewByPosition(r0)
            if (r0 == 0) goto Lee
            boolean r6 = r8.mShouldReverseLayout
            if (r6 == 0) goto Ld9
            androidx.recyclerview.widget.OrientationHelper r6 = r8.mOrientationHelper
            int r6 = r6.getEndAfterPadding()
            androidx.recyclerview.widget.OrientationHelper r7 = r8.mOrientationHelper
            int r0 = r7.getDecoratedEnd(r0)
            int r6 = r6 - r0
            int r0 = r8.mPendingScrollPositionOffset
            goto Le8
        Ld9:
            androidx.recyclerview.widget.OrientationHelper r6 = r8.mOrientationHelper
            int r0 = r6.getDecoratedStart(r0)
            androidx.recyclerview.widget.OrientationHelper r6 = r8.mOrientationHelper
            int r6 = r6.getStartAfterPadding()
            int r0 = r0 - r6
            int r6 = r8.mPendingScrollPositionOffset
        Le8:
            int r6 = r6 - r0
            if (r6 <= 0) goto Led
            int r3 = r3 + r6
            goto Lee
        Led:
            int r4 = r4 - r6
        Lee:
            androidx.recyclerview.widget.LinearLayoutManager$AnchorInfo r0 = r8.mAnchorInfo
            boolean r6 = r0.mLayoutFromEnd
            if (r6 == 0) goto Lfa
            boolean r6 = r8.mShouldReverseLayout
            if (r6 == 0) goto Lfe
        Lf8:
            r1 = 1
            goto Lfe
        Lfa:
            boolean r6 = r8.mShouldReverseLayout
            if (r6 == 0) goto Lf8
        Lfe:
            r8.onAnchorReady(r9, r10, r0, r1)
            r8.detachAndScrapAttachedViews(r9)
            androidx.recyclerview.widget.LinearLayoutManager$LayoutState r0 = r8.mLayoutState
            androidx.recyclerview.widget.OrientationHelper r1 = r8.mOrientationHelper
            int r1 = r1.getMode()
            if (r1 != 0) goto L118
            androidx.recyclerview.widget.OrientationHelper r1 = r8.mOrientationHelper
            int r1 = r1.getEnd()
            if (r1 != 0) goto L118
            r1 = 1
            goto L119
        L118:
            r1 = 0
        L119:
            r0.mInfinite = r1
            androidx.recyclerview.widget.LinearLayoutManager$LayoutState r0 = r8.mLayoutState
            r10.isPreLayout()
            java.util.Objects.requireNonNull(r0)
            androidx.recyclerview.widget.LinearLayoutManager$LayoutState r0 = r8.mLayoutState
            r0.mNoRecycleSpace = r2
            androidx.recyclerview.widget.LinearLayoutManager$AnchorInfo r0 = r8.mAnchorInfo
            boolean r1 = r0.mLayoutFromEnd
            if (r1 == 0) goto L16c
            r8.updateLayoutStateToFillStart(r0)
            androidx.recyclerview.widget.LinearLayoutManager$LayoutState r0 = r8.mLayoutState
            r0.mExtraFillSpace = r3
            r8.fill(r9, r0, r10, r2)
            androidx.recyclerview.widget.LinearLayoutManager$LayoutState r0 = r8.mLayoutState
            int r1 = r0.mOffset
            int r3 = r0.mCurrentPosition
            int r0 = r0.mAvailable
            if (r0 <= 0) goto L142
            int r4 = r4 + r0
        L142:
            androidx.recyclerview.widget.LinearLayoutManager$AnchorInfo r0 = r8.mAnchorInfo
            r8.updateLayoutStateToFillEnd(r0)
            androidx.recyclerview.widget.LinearLayoutManager$LayoutState r0 = r8.mLayoutState
            r0.mExtraFillSpace = r4
            int r4 = r0.mCurrentPosition
            int r6 = r0.mItemDirection
            int r4 = r4 + r6
            r0.mCurrentPosition = r4
            r8.fill(r9, r0, r10, r2)
            androidx.recyclerview.widget.LinearLayoutManager$LayoutState r0 = r8.mLayoutState
            int r4 = r0.mOffset
            int r0 = r0.mAvailable
            if (r0 <= 0) goto L1ab
            r8.updateLayoutStateToFillStart(r3, r1)
            androidx.recyclerview.widget.LinearLayoutManager$LayoutState r1 = r8.mLayoutState
            r1.mExtraFillSpace = r0
            r8.fill(r9, r1, r10, r2)
            androidx.recyclerview.widget.LinearLayoutManager$LayoutState r0 = r8.mLayoutState
            int r1 = r0.mOffset
            goto L1ab
        L16c:
            r8.updateLayoutStateToFillEnd(r0)
            androidx.recyclerview.widget.LinearLayoutManager$LayoutState r0 = r8.mLayoutState
            r0.mExtraFillSpace = r4
            r8.fill(r9, r0, r10, r2)
            androidx.recyclerview.widget.LinearLayoutManager$LayoutState r0 = r8.mLayoutState
            int r4 = r0.mOffset
            int r1 = r0.mCurrentPosition
            int r0 = r0.mAvailable
            if (r0 <= 0) goto L181
            int r3 = r3 + r0
        L181:
            androidx.recyclerview.widget.LinearLayoutManager$AnchorInfo r0 = r8.mAnchorInfo
            r8.updateLayoutStateToFillStart(r0)
            androidx.recyclerview.widget.LinearLayoutManager$LayoutState r0 = r8.mLayoutState
            r0.mExtraFillSpace = r3
            int r3 = r0.mCurrentPosition
            int r6 = r0.mItemDirection
            int r3 = r3 + r6
            r0.mCurrentPosition = r3
            r8.fill(r9, r0, r10, r2)
            androidx.recyclerview.widget.LinearLayoutManager$LayoutState r0 = r8.mLayoutState
            int r3 = r0.mOffset
            int r0 = r0.mAvailable
            if (r0 <= 0) goto L1aa
            r8.updateLayoutStateToFillEnd(r1, r4)
            androidx.recyclerview.widget.LinearLayoutManager$LayoutState r1 = r8.mLayoutState
            r1.mExtraFillSpace = r0
            r8.fill(r9, r1, r10, r2)
            androidx.recyclerview.widget.LinearLayoutManager$LayoutState r0 = r8.mLayoutState
            int r4 = r0.mOffset
        L1aa:
            r1 = r3
        L1ab:
            int r0 = r8.getChildCount()
            if (r0 <= 0) goto L1cf
            boolean r0 = r8.mShouldReverseLayout
            boolean r3 = r8.mStackFromEnd
            r0 = r0 ^ r3
            if (r0 == 0) goto L1c3
            int r0 = r8.fixLayoutEndGap(r4, r9, r10, r5)
            int r1 = r1 + r0
            int r4 = r4 + r0
            int r0 = r8.fixLayoutStartGap(r1, r9, r10, r2)
            goto L1cd
        L1c3:
            int r0 = r8.fixLayoutStartGap(r1, r9, r10, r5)
            int r1 = r1 + r0
            int r4 = r4 + r0
            int r0 = r8.fixLayoutEndGap(r4, r9, r10, r2)
        L1cd:
            int r1 = r1 + r0
            int r4 = r4 + r0
        L1cf:
            r8.layoutForPredictiveAnimations(r9, r10, r1, r4)
            boolean r9 = r10.isPreLayout()
            if (r9 != 0) goto L1de
            androidx.recyclerview.widget.OrientationHelper r9 = r8.mOrientationHelper
            r9.onLayoutComplete()
            goto L1e3
        L1de:
            androidx.recyclerview.widget.LinearLayoutManager$AnchorInfo r9 = r8.mAnchorInfo
            r9.reset()
        L1e3:
            boolean r9 = r8.mStackFromEnd
            r8.mLastStackFromEnd = r9
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(androidx.recyclerview.widget.RecyclerView.State r1) {
            r0 = this;
            super.onLayoutCompleted(r1)
            r1 = 0
            r0.mPendingSavedState = r1
            r1 = -1
            r0.mPendingScrollPosition = r1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.mPendingScrollPositionOffset = r1
            androidx.recyclerview.widget.LinearLayoutManager$AnchorInfo r1 = r0.mAnchorInfo
            r1.reset()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(android.os.Parcelable r3) {
            r2 = this;
            boolean r0 = r3 instanceof androidx.recyclerview.widget.LinearLayoutManager.SavedState
            if (r0 == 0) goto L12
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r3 = (androidx.recyclerview.widget.LinearLayoutManager.SavedState) r3
            r2.mPendingSavedState = r3
            int r0 = r2.mPendingScrollPosition
            r1 = -1
            if (r0 == r1) goto Lf
            r3.mAnchorPosition = r1
        Lf:
            r2.requestLayout()
        L12:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public android.os.Parcelable onSaveInstanceState() {
            r4 = this;
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r0 = r4.mPendingSavedState
            if (r0 == 0) goto La
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r1 = new androidx.recyclerview.widget.LinearLayoutManager$SavedState
            r1.<init>(r0)
            return r1
        La:
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r0 = new androidx.recyclerview.widget.LinearLayoutManager$SavedState
            r0.<init>()
            int r1 = r4.getChildCount()
            if (r1 <= 0) goto L55
            r4.ensureLayoutState()
            boolean r1 = r4.mLastStackFromEnd
            boolean r2 = r4.mShouldReverseLayout
            r1 = r1 ^ r2
            r0.mAnchorLayoutFromEnd = r1
            if (r1 == 0) goto L3b
            android.view.View r1 = r4.getChildClosestToEnd()
            androidx.recyclerview.widget.OrientationHelper r2 = r4.mOrientationHelper
            int r2 = r2.getEndAfterPadding()
            androidx.recyclerview.widget.OrientationHelper r3 = r4.mOrientationHelper
            int r3 = r3.getDecoratedEnd(r1)
            int r2 = r2 - r3
            r0.mAnchorOffset = r2
            int r1 = r4.getPosition(r1)
            r0.mAnchorPosition = r1
            goto L58
        L3b:
            android.view.View r1 = r4.getChildClosestToStart()
            int r2 = r4.getPosition(r1)
            r0.mAnchorPosition = r2
            androidx.recyclerview.widget.OrientationHelper r2 = r4.mOrientationHelper
            int r1 = r2.getDecoratedStart(r1)
            androidx.recyclerview.widget.OrientationHelper r2 = r4.mOrientationHelper
            int r2 = r2.getStartAfterPadding()
            int r1 = r1 - r2
            r0.mAnchorOffset = r1
            goto L58
        L55:
            r1 = -1
            r0.mAnchorPosition = r1
        L58:
            return r0
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.ViewDropHandler
    public void prepareForDrop(@androidx.annotation.NonNull android.view.View r4, @androidx.annotation.NonNull android.view.View r5, int r6, int r7) {
            r3 = this;
            java.lang.String r6 = "Cannot drop a view during a scroll or layout calculation"
            r3.assertNotInLayoutOrScroll(r6)
            r3.ensureLayoutState()
            r3.resolveShouldLayoutReverse()
            int r6 = r3.getPosition(r4)
            int r7 = r3.getPosition(r5)
            r0 = 1
            r1 = -1
            if (r6 >= r7) goto L19
            r6 = 1
            goto L1a
        L19:
            r6 = -1
        L1a:
            boolean r2 = r3.mShouldReverseLayout
            if (r2 == 0) goto L49
            if (r6 != r0) goto L38
            androidx.recyclerview.widget.OrientationHelper r6 = r3.mOrientationHelper
            int r6 = r6.getEndAfterPadding()
            androidx.recyclerview.widget.OrientationHelper r0 = r3.mOrientationHelper
            int r5 = r0.getDecoratedStart(r5)
            androidx.recyclerview.widget.OrientationHelper r0 = r3.mOrientationHelper
            int r4 = r0.getDecoratedMeasurement(r4)
            int r4 = r4 + r5
            int r6 = r6 - r4
            r3.scrollToPositionWithOffset(r7, r6)
            goto L65
        L38:
            androidx.recyclerview.widget.OrientationHelper r4 = r3.mOrientationHelper
            int r4 = r4.getEndAfterPadding()
            androidx.recyclerview.widget.OrientationHelper r6 = r3.mOrientationHelper
            int r5 = r6.getDecoratedEnd(r5)
            int r4 = r4 - r5
            r3.scrollToPositionWithOffset(r7, r4)
            goto L65
        L49:
            if (r6 != r1) goto L55
            androidx.recyclerview.widget.OrientationHelper r4 = r3.mOrientationHelper
            int r4 = r4.getDecoratedStart(r5)
            r3.scrollToPositionWithOffset(r7, r4)
            goto L65
        L55:
            androidx.recyclerview.widget.OrientationHelper r6 = r3.mOrientationHelper
            int r5 = r6.getDecoratedEnd(r5)
            androidx.recyclerview.widget.OrientationHelper r6 = r3.mOrientationHelper
            int r4 = r6.getDecoratedMeasurement(r4)
            int r5 = r5 - r4
            r3.scrollToPositionWithOffset(r7, r5)
        L65:
            return
    }

    public final int scrollBy(int r6, androidx.recyclerview.widget.RecyclerView.Recycler r7, androidx.recyclerview.widget.RecyclerView.State r8) {
            r5 = this;
            int r0 = r5.getChildCount()
            r1 = 0
            if (r0 == 0) goto L39
            if (r6 != 0) goto La
            goto L39
        La:
            r5.ensureLayoutState()
            androidx.recyclerview.widget.LinearLayoutManager$LayoutState r0 = r5.mLayoutState
            r2 = 1
            r0.mRecycle = r2
            if (r6 <= 0) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = -1
        L17:
            int r3 = java.lang.Math.abs(r6)
            r5.updateLayoutState(r0, r3, r2, r8)
            androidx.recyclerview.widget.LinearLayoutManager$LayoutState r2 = r5.mLayoutState
            int r4 = r2.mScrollingOffset
            int r7 = r5.fill(r7, r2, r8, r1)
            int r7 = r7 + r4
            if (r7 >= 0) goto L2a
            return r1
        L2a:
            if (r3 <= r7) goto L2e
            int r6 = r0 * r7
        L2e:
            androidx.recyclerview.widget.OrientationHelper r7 = r5.mOrientationHelper
            int r8 = -r6
            r7.offsetChildren(r8)
            androidx.recyclerview.widget.LinearLayoutManager$LayoutState r7 = r5.mLayoutState
            r7.mLastScrollDelta = r6
            return r6
        L39:
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int r3, androidx.recyclerview.widget.RecyclerView.Recycler r4, androidx.recyclerview.widget.RecyclerView.State r5) {
            r2 = this;
            int r0 = r2.mOrientation
            r1 = 1
            if (r0 != r1) goto L7
            r3 = 0
            return r3
        L7:
            int r3 = r2.scrollBy(r3, r4, r5)
            return r3
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int r2) {
            r1 = this;
            r1.mPendingScrollPosition = r2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.mPendingScrollPositionOffset = r2
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r2 = r1.mPendingSavedState
            if (r2 == 0) goto Ld
            r0 = -1
            r2.mAnchorPosition = r0
        Ld:
            r1.requestLayout()
            return
    }

    public void scrollToPositionWithOffset(int r1, int r2) {
            r0 = this;
            r0.mPendingScrollPosition = r1
            r0.mPendingScrollPositionOffset = r2
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r1 = r0.mPendingSavedState
            if (r1 == 0) goto Lb
            r2 = -1
            r1.mAnchorPosition = r2
        Lb:
            r0.requestLayout()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int r2, androidx.recyclerview.widget.RecyclerView.Recycler r3, androidx.recyclerview.widget.RecyclerView.State r4) {
            r1 = this;
            int r0 = r1.mOrientation
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            int r2 = r1.scrollBy(r2, r3, r4)
            return r2
    }

    public void setInitialPrefetchItemCount(int r1) {
            r0 = this;
            r0.mInitialPrefetchItemCount = r1
            return
    }

    public void setOrientation(int r3) {
            r2 = this;
            if (r3 == 0) goto L12
            r0 = 1
            if (r3 != r0) goto L6
            goto L12
        L6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "invalid orientation:"
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3)
            r0.<init>(r3)
            throw r0
        L12:
            r0 = 0
            r2.assertNotInLayoutOrScroll(r0)
            int r0 = r2.mOrientation
            if (r3 != r0) goto L1e
            androidx.recyclerview.widget.OrientationHelper r0 = r2.mOrientationHelper
            if (r0 != 0) goto L2d
        L1e:
            androidx.recyclerview.widget.OrientationHelper r0 = androidx.recyclerview.widget.OrientationHelper.createOrientationHelper(r2, r3)
            r2.mOrientationHelper = r0
            androidx.recyclerview.widget.LinearLayoutManager$AnchorInfo r1 = r2.mAnchorInfo
            r1.mOrientationHelper = r0
            r2.mOrientation = r3
            r2.requestLayout()
        L2d:
            return
    }

    public void setRecycleChildrenOnDetach(boolean r1) {
            r0 = this;
            r0.mRecycleChildrenOnDetach = r1
            return
    }

    public void setReverseLayout(boolean r2) {
            r1 = this;
            r0 = 0
            r1.assertNotInLayoutOrScroll(r0)
            boolean r0 = r1.mReverseLayout
            if (r2 != r0) goto L9
            return
        L9:
            r1.mReverseLayout = r2
            r1.requestLayout()
            return
    }

    public void setSmoothScrollbarEnabled(boolean r1) {
            r0 = this;
            r0.mSmoothScrollbarEnabled = r1
            return
    }

    public void setStackFromEnd(boolean r2) {
            r1 = this;
            r0 = 0
            r1.assertNotInLayoutOrScroll(r0)
            boolean r0 = r1.mStackFromEnd
            if (r0 != r2) goto L9
            return
        L9:
            r1.mStackFromEnd = r2
            r1.requestLayout()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean shouldMeasureTwice() {
            r6 = this;
            int r0 = r6.getHeightMode()
            r1 = 0
            r2 = 1
            r3 = 1073741824(0x40000000, float:2.0)
            if (r0 == r3) goto L30
            int r0 = r6.getWidthMode()
            if (r0 == r3) goto L30
            int r0 = r6.getChildCount()
            r3 = 0
        L15:
            if (r3 >= r0) goto L2c
            android.view.View r4 = r6.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            int r5 = r4.width
            if (r5 >= 0) goto L29
            int r4 = r4.height
            if (r4 >= 0) goto L29
            r0 = 1
            goto L2d
        L29:
            int r3 = r3 + 1
            goto L15
        L2c:
            r0 = 0
        L2d:
            if (r0 == 0) goto L30
            r1 = 1
        L30:
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView r1, androidx.recyclerview.widget.RecyclerView.State r2, int r3) {
            r0 = this;
            androidx.recyclerview.widget.LinearSmoothScroller r2 = new androidx.recyclerview.widget.LinearSmoothScroller
            android.content.Context r1 = r1.getContext()
            r2.<init>(r1)
            r2.setTargetPosition(r3)
            r0.startSmoothScroll(r2)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
            r2 = this;
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r0 = r2.mPendingSavedState
            if (r0 != 0) goto Lc
            boolean r0 = r2.mLastStackFromEnd
            boolean r1 = r2.mStackFromEnd
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }
}
