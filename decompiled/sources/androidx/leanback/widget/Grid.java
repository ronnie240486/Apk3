package androidx.leanback.widget;

/* JADX INFO: loaded from: classes2.dex */
abstract class Grid {
    public static final int START_DEFAULT = -1;
    public int mFirstVisibleIndex;
    public int mLastVisibleIndex;
    public int mNumRows;
    public androidx.leanback.widget.Grid.Provider mProvider;
    public boolean mReversedFlow;
    public int mSpacing;
    public int mStartIndex;
    public java.lang.Object[] mTmpItem;
    public androidx.collection.CircularIntArray[] mTmpItemPositionsInRows;

    /* JADX INFO: loaded from: classes.dex */
    public static class Location {
        public int row;

        public Location(int r1) {
                r0 = this;
                r0.<init>()
                r0.row = r1
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public interface Provider {
        void addItem(java.lang.Object r1, int r2, int r3, int r4, int r5);

        int createItem(int r1, boolean r2, java.lang.Object[] r3, boolean r4);

        int getCount();

        int getEdge(int r1);

        int getMinIndex();

        int getSize(int r1);

        void removeItem(int r1);
    }

    public Grid() {
            r1 = this;
            r1.<init>()
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1.mTmpItem = r0
            r0 = -1
            r1.mFirstVisibleIndex = r0
            r1.mLastVisibleIndex = r0
            r1.mStartIndex = r0
            return
    }

    public static androidx.leanback.widget.Grid createGrid(int r1) {
            r0 = 1
            if (r1 != r0) goto L9
            androidx.leanback.widget.SingleRow r1 = new androidx.leanback.widget.SingleRow
            r1.<init>()
            goto L12
        L9:
            androidx.leanback.widget.StaggeredGridDefault r0 = new androidx.leanback.widget.StaggeredGridDefault
            r0.<init>()
            r0.setNumRows(r1)
            r1 = r0
        L12:
            return r1
    }

    private void resetVisibleIndexIfEmpty() {
            r2 = this;
            int r0 = r2.mLastVisibleIndex
            int r1 = r2.mFirstVisibleIndex
            if (r0 >= r1) goto L9
            r2.resetVisibleIndex()
        L9:
            return
    }

    public boolean appendOneColumnVisibleItems() {
            r2 = this;
            boolean r0 = r2.mReversedFlow
            if (r0 == 0) goto L8
            r0 = 2147483647(0x7fffffff, float:NaN)
            goto La
        L8:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        La:
            r1 = 1
            boolean r0 = r2.appendVisibleItems(r0, r1)
            return r0
    }

    public final void appendVisibleItems(int r2) {
            r1 = this;
            r0 = 0
            r1.appendVisibleItems(r2, r0)
            return
    }

    public abstract boolean appendVisibleItems(int r1, boolean r2);

    public final boolean checkAppendOverLimit(int r5) {
            r4 = this;
            int r0 = r4.mLastVisibleIndex
            r1 = 0
            if (r0 >= 0) goto L6
            return r1
        L6:
            boolean r0 = r4.mReversedFlow
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L16
            int r0 = r4.findRowMin(r3, r2)
            int r2 = r4.mSpacing
            int r5 = r5 + r2
            if (r0 > r5) goto L20
            goto L1f
        L16:
            int r0 = r4.findRowMax(r1, r2)
            int r2 = r4.mSpacing
            int r5 = r5 - r2
            if (r0 < r5) goto L20
        L1f:
            r1 = 1
        L20:
            return r1
    }

    public final boolean checkPrependOverLimit(int r5) {
            r4 = this;
            int r0 = r4.mLastVisibleIndex
            r1 = 0
            if (r0 >= 0) goto L6
            return r1
        L6:
            boolean r0 = r4.mReversedFlow
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L16
            int r0 = r4.findRowMax(r1, r2)
            int r2 = r4.mSpacing
            int r5 = r5 - r2
            if (r0 < r5) goto L20
            goto L1f
        L16:
            int r0 = r4.findRowMin(r3, r2)
            int r2 = r4.mSpacing
            int r5 = r5 + r2
            if (r0 > r5) goto L20
        L1f:
            r1 = 1
        L20:
            return r1
    }

    public void collectAdjacentPrefetchPositions(int r1, int r2, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry r3) {
            r0 = this;
            return
    }

    public abstract void debugPrint(java.io.PrintWriter r1);

    public void fillDisappearingItems(int[] r12, int r13, android.util.SparseIntArray r14) {
            r11 = this;
            int r0 = r11.getLastVisibleIndex()
            r1 = 0
            if (r0 < 0) goto Lc
            int r2 = java.util.Arrays.binarySearch(r12, r1, r13, r0)
            goto Ld
        Lc:
            r2 = 0
        Ld:
            r3 = 1
            if (r2 >= 0) goto L68
            int r2 = -r2
            int r2 = r2 - r3
            boolean r4 = r11.mReversedFlow
            if (r4 == 0) goto L27
            androidx.leanback.widget.Grid$Provider r4 = r11.mProvider
            int r4 = r4.getEdge(r0)
            androidx.leanback.widget.Grid$Provider r5 = r11.mProvider
            int r0 = r5.getSize(r0)
            int r4 = r4 - r0
            int r0 = r11.mSpacing
            int r4 = r4 - r0
            goto L37
        L27:
            androidx.leanback.widget.Grid$Provider r4 = r11.mProvider
            int r4 = r4.getEdge(r0)
            androidx.leanback.widget.Grid$Provider r5 = r11.mProvider
            int r0 = r5.getSize(r0)
            int r0 = r0 + r4
            int r4 = r11.mSpacing
            int r4 = r4 + r0
        L37:
            r0 = r4
        L38:
            if (r2 >= r13) goto L68
            r6 = r12[r2]
            int r4 = r14.get(r6)
            if (r4 >= 0) goto L44
            r8 = 0
            goto L45
        L44:
            r8 = r4
        L45:
            androidx.leanback.widget.Grid$Provider r4 = r11.mProvider
            java.lang.Object[] r5 = r11.mTmpItem
            int r10 = r4.createItem(r6, r3, r5, r3)
            androidx.leanback.widget.Grid$Provider r4 = r11.mProvider
            java.lang.Object[] r5 = r11.mTmpItem
            r5 = r5[r1]
            r7 = r10
            r9 = r0
            r4.addItem(r5, r6, r7, r8, r9)
            boolean r4 = r11.mReversedFlow
            if (r4 == 0) goto L61
            int r0 = r0 - r10
            int r4 = r11.mSpacing
            int r0 = r0 - r4
            goto L65
        L61:
            int r0 = r0 + r10
            int r4 = r11.mSpacing
            int r0 = r0 + r4
        L65:
            int r2 = r2 + 1
            goto L38
        L68:
            int r0 = r11.getFirstVisibleIndex()
            if (r0 < 0) goto L73
            int r13 = java.util.Arrays.binarySearch(r12, r1, r13, r0)
            goto L74
        L73:
            r13 = 0
        L74:
            if (r13 >= 0) goto Lb9
            int r13 = -r13
            int r13 = r13 + (-2)
            boolean r2 = r11.mReversedFlow
            if (r2 == 0) goto L84
            androidx.leanback.widget.Grid$Provider r2 = r11.mProvider
            int r0 = r2.getEdge(r0)
            goto L8a
        L84:
            androidx.leanback.widget.Grid$Provider r2 = r11.mProvider
            int r0 = r2.getEdge(r0)
        L8a:
            if (r13 < 0) goto Lb9
            r6 = r12[r13]
            int r2 = r14.get(r6)
            if (r2 >= 0) goto L96
            r8 = 0
            goto L97
        L96:
            r8 = r2
        L97:
            androidx.leanback.widget.Grid$Provider r2 = r11.mProvider
            java.lang.Object[] r4 = r11.mTmpItem
            int r7 = r2.createItem(r6, r1, r4, r3)
            boolean r2 = r11.mReversedFlow
            if (r2 == 0) goto La8
            int r2 = r11.mSpacing
            int r0 = r0 + r2
            int r0 = r0 + r7
            goto Lac
        La8:
            int r2 = r11.mSpacing
            int r0 = r0 - r2
            int r0 = r0 - r7
        Lac:
            androidx.leanback.widget.Grid$Provider r4 = r11.mProvider
            java.lang.Object[] r2 = r11.mTmpItem
            r5 = r2[r1]
            r9 = r0
            r4.addItem(r5, r6, r7, r8, r9)
            int r13 = r13 + (-1)
            goto L8a
        Lb9:
            return
    }

    public abstract int findRowMax(boolean r1, int r2, int[] r3);

    public final int findRowMax(boolean r2, @androidx.annotation.Nullable int[] r3) {
            r1 = this;
            boolean r0 = r1.mReversedFlow
            if (r0 == 0) goto L7
            int r0 = r1.mFirstVisibleIndex
            goto L9
        L7:
            int r0 = r1.mLastVisibleIndex
        L9:
            int r2 = r1.findRowMax(r2, r0, r3)
            return r2
    }

    public abstract int findRowMin(boolean r1, int r2, int[] r3);

    public final int findRowMin(boolean r2, @androidx.annotation.Nullable int[] r3) {
            r1 = this;
            boolean r0 = r1.mReversedFlow
            if (r0 == 0) goto L7
            int r0 = r1.mLastVisibleIndex
            goto L9
        L7:
            int r0 = r1.mFirstVisibleIndex
        L9:
            int r2 = r1.findRowMin(r2, r0, r3)
            return r2
    }

    public final int getFirstVisibleIndex() {
            r1 = this;
            int r0 = r1.mFirstVisibleIndex
            return r0
    }

    public final androidx.collection.CircularIntArray[] getItemPositionsInRows() {
            r2 = this;
            int r0 = r2.getFirstVisibleIndex()
            int r1 = r2.getLastVisibleIndex()
            androidx.collection.CircularIntArray[] r0 = r2.getItemPositionsInRows(r0, r1)
            return r0
    }

    public abstract androidx.collection.CircularIntArray[] getItemPositionsInRows(int r1, int r2);

    public final int getLastVisibleIndex() {
            r1 = this;
            int r0 = r1.mLastVisibleIndex
            return r0
    }

    public abstract androidx.leanback.widget.Grid.Location getLocation(int r1);

    public int getNumRows() {
            r1 = this;
            int r0 = r1.mNumRows
            return r0
    }

    public final int getRowIndex(int r1) {
            r0 = this;
            androidx.leanback.widget.Grid$Location r1 = r0.getLocation(r1)
            if (r1 != 0) goto L8
            r1 = -1
            return r1
        L8:
            int r1 = r1.row
            return r1
    }

    public void invalidateItemsAfter(int r2) {
            r1 = this;
            if (r2 >= 0) goto L3
            return
        L3:
            int r0 = r1.mLastVisibleIndex
            if (r0 >= 0) goto L8
            return
        L8:
            if (r0 < r2) goto Le
            int r0 = r2 + (-1)
            r1.mLastVisibleIndex = r0
        Le:
            r1.resetVisibleIndexIfEmpty()
            int r0 = r1.getFirstVisibleIndex()
            if (r0 >= 0) goto L1a
            r1.setStart(r2)
        L1a:
            return
    }

    public boolean isReversedFlow() {
            r1 = this;
            boolean r0 = r1.mReversedFlow
            return r0
    }

    public final boolean prependOneColumnVisibleItems() {
            r2 = this;
            boolean r0 = r2.mReversedFlow
            if (r0 == 0) goto L7
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            goto La
        L7:
            r0 = 2147483647(0x7fffffff, float:NaN)
        La:
            r1 = 1
            boolean r0 = r2.prependVisibleItems(r0, r1)
            return r0
    }

    public final void prependVisibleItems(int r2) {
            r1 = this;
            r0 = 0
            r1.prependVisibleItems(r2, r0)
            return
    }

    public abstract boolean prependVisibleItems(int r1, boolean r2);

    public void removeInvisibleItemsAtEnd(int r5, int r6) {
            r4 = this;
        L0:
            int r0 = r4.mLastVisibleIndex
            int r1 = r4.mFirstVisibleIndex
            if (r0 < r1) goto L2f
            if (r0 <= r5) goto L2f
            boolean r1 = r4.mReversedFlow
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L17
            androidx.leanback.widget.Grid$Provider r1 = r4.mProvider
            int r0 = r1.getEdge(r0)
            if (r0 < r6) goto L20
            goto L1f
        L17:
            androidx.leanback.widget.Grid$Provider r1 = r4.mProvider
            int r0 = r1.getEdge(r0)
            if (r0 > r6) goto L20
        L1f:
            r2 = 1
        L20:
            if (r2 == 0) goto L2f
            androidx.leanback.widget.Grid$Provider r0 = r4.mProvider
            int r1 = r4.mLastVisibleIndex
            r0.removeItem(r1)
            int r0 = r4.mLastVisibleIndex
            int r0 = r0 - r3
            r4.mLastVisibleIndex = r0
            goto L0
        L2f:
            r4.resetVisibleIndexIfEmpty()
            return
    }

    public void removeInvisibleItemsAtFront(int r6, int r7) {
            r5 = this;
        L0:
            int r0 = r5.mLastVisibleIndex
            int r1 = r5.mFirstVisibleIndex
            if (r0 < r1) goto L3b
            if (r1 >= r6) goto L3b
            androidx.leanback.widget.Grid$Provider r0 = r5.mProvider
            int r0 = r0.getSize(r1)
            boolean r1 = r5.mReversedFlow
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L20
            androidx.leanback.widget.Grid$Provider r1 = r5.mProvider
            int r4 = r5.mFirstVisibleIndex
            int r1 = r1.getEdge(r4)
            int r1 = r1 + r0
            if (r1 > r7) goto L2c
            goto L2b
        L20:
            androidx.leanback.widget.Grid$Provider r1 = r5.mProvider
            int r4 = r5.mFirstVisibleIndex
            int r1 = r1.getEdge(r4)
            int r1 = r1 - r0
            if (r1 < r7) goto L2c
        L2b:
            r2 = 1
        L2c:
            if (r2 == 0) goto L3b
            androidx.leanback.widget.Grid$Provider r0 = r5.mProvider
            int r1 = r5.mFirstVisibleIndex
            r0.removeItem(r1)
            int r0 = r5.mFirstVisibleIndex
            int r0 = r0 + r3
            r5.mFirstVisibleIndex = r0
            goto L0
        L3b:
            r5.resetVisibleIndexIfEmpty()
            return
    }

    public void resetVisibleIndex() {
            r1 = this;
            r0 = -1
            r1.mLastVisibleIndex = r0
            r1.mFirstVisibleIndex = r0
            return
    }

    public final void setNumRows(int r3) {
            r2 = this;
            if (r3 <= 0) goto L1f
            int r0 = r2.mNumRows
            if (r0 != r3) goto L7
            return
        L7:
            r2.mNumRows = r3
            androidx.collection.CircularIntArray[] r3 = new androidx.collection.CircularIntArray[r3]
            r2.mTmpItemPositionsInRows = r3
            r3 = 0
        Le:
            int r0 = r2.mNumRows
            if (r3 >= r0) goto L1e
            androidx.collection.CircularIntArray[] r0 = r2.mTmpItemPositionsInRows
            androidx.collection.CircularIntArray r1 = new androidx.collection.CircularIntArray
            r1.<init>()
            r0[r3] = r1
            int r3 = r3 + 1
            goto Le
        L1e:
            return
        L1f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
    }

    public void setProvider(androidx.leanback.widget.Grid.Provider r1) {
            r0 = this;
            r0.mProvider = r1
            return
    }

    public final void setReversedFlow(boolean r1) {
            r0 = this;
            r0.mReversedFlow = r1
            return
    }

    public final void setSpacing(int r1) {
            r0 = this;
            r0.mSpacing = r1
            return
    }

    public void setStart(int r1) {
            r0 = this;
            r0.mStartIndex = r1
            return
    }
}
