package androidx.leanback.widget;

/* JADX INFO: loaded from: classes2.dex */
class SingleRow extends androidx.leanback.widget.Grid {
    private final androidx.leanback.widget.Grid.Location mTmpLocation;

    public SingleRow() {
            r2 = this;
            r2.<init>()
            androidx.leanback.widget.Grid$Location r0 = new androidx.leanback.widget.Grid$Location
            r1 = 0
            r0.<init>(r1)
            r2.mTmpLocation = r0
            r0 = 1
            r2.setNumRows(r0)
            return
    }

    @Override // androidx.leanback.widget.Grid
    public final boolean appendVisibleItems(int r10, boolean r11) {
            r9 = this;
            androidx.leanback.widget.Grid$Provider r0 = r9.mProvider
            int r0 = r0.getCount()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            if (r11 != 0) goto L13
            boolean r0 = r9.checkAppendOverLimit(r10)
            if (r0 == 0) goto L13
            return r1
        L13:
            int r0 = r9.getStartIndexForAppend()
            r2 = 1
            r3 = 0
        L19:
            androidx.leanback.widget.Grid$Provider r4 = r9.mProvider
            int r4 = r4.getCount()
            if (r0 >= r4) goto L85
            androidx.leanback.widget.Grid$Provider r3 = r9.mProvider
            java.lang.Object[] r4 = r9.mTmpItem
            int r6 = r3.createItem(r0, r2, r4, r1)
            int r3 = r9.mFirstVisibleIndex
            if (r3 < 0) goto L5e
            int r3 = r9.mLastVisibleIndex
            if (r3 >= 0) goto L32
            goto L5e
        L32:
            boolean r3 = r9.mReversedFlow
            if (r3 == 0) goto L49
            androidx.leanback.widget.Grid$Provider r3 = r9.mProvider
            int r4 = r0 + (-1)
            int r3 = r3.getEdge(r4)
            androidx.leanback.widget.Grid$Provider r5 = r9.mProvider
            int r4 = r5.getSize(r4)
            int r3 = r3 - r4
            int r4 = r9.mSpacing
            int r3 = r3 - r4
            goto L5b
        L49:
            androidx.leanback.widget.Grid$Provider r3 = r9.mProvider
            int r4 = r0 + (-1)
            int r3 = r3.getEdge(r4)
            androidx.leanback.widget.Grid$Provider r5 = r9.mProvider
            int r4 = r5.getSize(r4)
            int r4 = r4 + r3
            int r3 = r9.mSpacing
            int r3 = r3 + r4
        L5b:
            r9.mLastVisibleIndex = r0
            goto L6c
        L5e:
            boolean r3 = r9.mReversedFlow
            if (r3 == 0) goto L66
            r3 = 2147483647(0x7fffffff, float:NaN)
            goto L68
        L66:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
        L68:
            r9.mFirstVisibleIndex = r0
            r9.mLastVisibleIndex = r0
        L6c:
            r8 = r3
            androidx.leanback.widget.Grid$Provider r3 = r9.mProvider
            java.lang.Object[] r4 = r9.mTmpItem
            r4 = r4[r1]
            r7 = 0
            r5 = r0
            r3.addItem(r4, r5, r6, r7, r8)
            if (r11 != 0) goto L86
            boolean r3 = r9.checkAppendOverLimit(r10)
            if (r3 == 0) goto L81
            goto L86
        L81:
            int r0 = r0 + 1
            r3 = 1
            goto L19
        L85:
            r2 = r3
        L86:
            return r2
    }

    @Override // androidx.leanback.widget.Grid
    public void collectAdjacentPrefetchPositions(int r4, int r5, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry r6) {
            r3 = this;
            boolean r0 = r3.mReversedFlow
            if (r0 == 0) goto L7
            if (r5 <= 0) goto L28
            goto L9
        L7:
            if (r5 >= 0) goto L28
        L9:
            int r5 = r3.getFirstVisibleIndex()
            if (r5 != 0) goto L10
            return
        L10:
            int r5 = r3.getStartIndexForPrepend()
            androidx.leanback.widget.Grid$Provider r0 = r3.mProvider
            int r1 = r3.mFirstVisibleIndex
            int r0 = r0.getEdge(r1)
            boolean r1 = r3.mReversedFlow
            if (r1 == 0) goto L23
            int r1 = r3.mSpacing
            goto L26
        L23:
            int r1 = r3.mSpacing
            int r1 = -r1
        L26:
            int r0 = r0 + r1
            goto L54
        L28:
            int r5 = r3.getLastVisibleIndex()
            androidx.leanback.widget.Grid$Provider r0 = r3.mProvider
            int r0 = r0.getCount()
            int r0 = r0 + (-1)
            if (r5 != r0) goto L37
            return
        L37:
            int r5 = r3.getStartIndexForAppend()
            androidx.leanback.widget.Grid$Provider r0 = r3.mProvider
            int r1 = r3.mLastVisibleIndex
            int r0 = r0.getSize(r1)
            int r1 = r3.mSpacing
            int r0 = r0 + r1
            androidx.leanback.widget.Grid$Provider r1 = r3.mProvider
            int r2 = r3.mLastVisibleIndex
            int r1 = r1.getEdge(r2)
            boolean r2 = r3.mReversedFlow
            if (r2 == 0) goto L53
            int r0 = -r0
        L53:
            int r0 = r0 + r1
        L54:
            int r0 = r0 - r4
            int r4 = java.lang.Math.abs(r0)
            r6.addPosition(r5, r4)
            return
    }

    @Override // androidx.leanback.widget.Grid
    public final void debugPrint(java.io.PrintWriter r2) {
            r1 = this;
            java.lang.String r0 = "SingleRow<"
            r2.print(r0)
            int r0 = r1.mFirstVisibleIndex
            r2.print(r0)
            java.lang.String r0 = ","
            r2.print(r0)
            int r0 = r1.mLastVisibleIndex
            r2.print(r0)
            java.lang.String r0 = ">"
            r2.print(r0)
            r2.println()
            return
    }

    @Override // androidx.leanback.widget.Grid
    public final int findRowMax(boolean r1, int r2, int[] r3) {
            r0 = this;
            if (r3 == 0) goto L8
            r1 = 0
            r3[r1] = r1
            r1 = 1
            r3[r1] = r2
        L8:
            boolean r1 = r0.mReversedFlow
            if (r1 == 0) goto L13
            androidx.leanback.widget.Grid$Provider r1 = r0.mProvider
            int r1 = r1.getEdge(r2)
            goto L20
        L13:
            androidx.leanback.widget.Grid$Provider r1 = r0.mProvider
            int r1 = r1.getEdge(r2)
            androidx.leanback.widget.Grid$Provider r3 = r0.mProvider
            int r2 = r3.getSize(r2)
            int r1 = r1 + r2
        L20:
            return r1
    }

    @Override // androidx.leanback.widget.Grid
    public final int findRowMin(boolean r1, int r2, int[] r3) {
            r0 = this;
            if (r3 == 0) goto L8
            r1 = 0
            r3[r1] = r1
            r1 = 1
            r3[r1] = r2
        L8:
            boolean r1 = r0.mReversedFlow
            if (r1 == 0) goto L1a
            androidx.leanback.widget.Grid$Provider r1 = r0.mProvider
            int r1 = r1.getEdge(r2)
            androidx.leanback.widget.Grid$Provider r3 = r0.mProvider
            int r2 = r3.getSize(r2)
            int r1 = r1 - r2
            goto L20
        L1a:
            androidx.leanback.widget.Grid$Provider r1 = r0.mProvider
            int r1 = r1.getEdge(r2)
        L20:
            return r1
    }

    @Override // androidx.leanback.widget.Grid
    public final androidx.collection.CircularIntArray[] getItemPositionsInRows(int r3, int r4) {
            r2 = this;
            androidx.collection.CircularIntArray[] r0 = r2.mTmpItemPositionsInRows
            r1 = 0
            r0 = r0[r1]
            r0.clear()
            androidx.collection.CircularIntArray[] r0 = r2.mTmpItemPositionsInRows
            r0 = r0[r1]
            r0.addLast(r3)
            androidx.collection.CircularIntArray[] r3 = r2.mTmpItemPositionsInRows
            r3 = r3[r1]
            r3.addLast(r4)
            androidx.collection.CircularIntArray[] r3 = r2.mTmpItemPositionsInRows
            return r3
    }

    @Override // androidx.leanback.widget.Grid
    public final androidx.leanback.widget.Grid.Location getLocation(int r1) {
            r0 = this;
            androidx.leanback.widget.Grid$Location r1 = r0.mTmpLocation
            return r1
    }

    public final int getStartIndexForAppend() {
            r2 = this;
            int r0 = r2.mLastVisibleIndex
            if (r0 < 0) goto L7
            int r0 = r0 + 1
            return r0
        L7:
            int r0 = r2.mStartIndex
            r1 = -1
            if (r0 == r1) goto L19
            androidx.leanback.widget.Grid$Provider r1 = r2.mProvider
            int r1 = r1.getCount()
            int r1 = r1 + (-1)
            int r0 = java.lang.Math.min(r0, r1)
            return r0
        L19:
            r0 = 0
            return r0
    }

    public final int getStartIndexForPrepend() {
            r2 = this;
            int r0 = r2.mFirstVisibleIndex
            if (r0 < 0) goto L7
            int r0 = r0 + (-1)
            return r0
        L7:
            int r0 = r2.mStartIndex
            r1 = -1
            if (r0 == r1) goto L19
            androidx.leanback.widget.Grid$Provider r1 = r2.mProvider
            int r1 = r1.getCount()
            int r1 = r1 + (-1)
            int r0 = java.lang.Math.min(r0, r1)
            return r0
        L19:
            androidx.leanback.widget.Grid$Provider r0 = r2.mProvider
            int r0 = r0.getCount()
            int r0 = r0 + (-1)
            return r0
    }

    @Override // androidx.leanback.widget.Grid
    public final boolean prependVisibleItems(int r11, boolean r12) {
            r10 = this;
            androidx.leanback.widget.Grid$Provider r0 = r10.mProvider
            int r0 = r0.getCount()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            if (r12 != 0) goto L13
            boolean r0 = r10.checkPrependOverLimit(r11)
            if (r0 == 0) goto L13
            return r1
        L13:
            androidx.leanback.widget.Grid$Provider r0 = r10.mProvider
            int r0 = r0.getMinIndex()
            int r2 = r10.getStartIndexForPrepend()
            r3 = 1
            r4 = 0
        L1f:
            if (r2 < r0) goto L79
            androidx.leanback.widget.Grid$Provider r4 = r10.mProvider
            java.lang.Object[] r5 = r10.mTmpItem
            int r7 = r4.createItem(r2, r1, r5, r1)
            int r4 = r10.mFirstVisibleIndex
            if (r4 < 0) goto L52
            int r4 = r10.mLastVisibleIndex
            if (r4 >= 0) goto L32
            goto L52
        L32:
            boolean r4 = r10.mReversedFlow
            if (r4 == 0) goto L43
            androidx.leanback.widget.Grid$Provider r4 = r10.mProvider
            int r5 = r2 + 1
            int r4 = r4.getEdge(r5)
            int r5 = r10.mSpacing
            int r4 = r4 + r5
            int r4 = r4 + r7
            goto L4f
        L43:
            androidx.leanback.widget.Grid$Provider r4 = r10.mProvider
            int r5 = r2 + 1
            int r4 = r4.getEdge(r5)
            int r5 = r10.mSpacing
            int r4 = r4 - r5
            int r4 = r4 - r7
        L4f:
            r10.mFirstVisibleIndex = r2
            goto L60
        L52:
            boolean r4 = r10.mReversedFlow
            if (r4 == 0) goto L59
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L5c
        L59:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L5c:
            r10.mFirstVisibleIndex = r2
            r10.mLastVisibleIndex = r2
        L60:
            r9 = r4
            androidx.leanback.widget.Grid$Provider r4 = r10.mProvider
            java.lang.Object[] r5 = r10.mTmpItem
            r5 = r5[r1]
            r8 = 0
            r6 = r2
            r4.addItem(r5, r6, r7, r8, r9)
            if (r12 != 0) goto L7a
            boolean r4 = r10.checkPrependOverLimit(r11)
            if (r4 == 0) goto L75
            goto L7a
        L75:
            int r2 = r2 + (-1)
            r4 = 1
            goto L1f
        L79:
            r3 = r4
        L7a:
            return r3
    }
}
