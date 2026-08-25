package androidx.leanback.widget;

/* JADX INFO: loaded from: classes2.dex */
abstract class StaggeredGrid extends androidx.leanback.widget.Grid {
    public int mFirstIndex;
    public androidx.collection.CircularArray<androidx.leanback.widget.StaggeredGrid.Location> mLocations;
    public java.lang.Object mPendingItem;
    public int mPendingItemSize;

    public static class Location extends androidx.leanback.widget.Grid.Location {
        public int offset;
        public int size;

        public Location(int r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1)
                r0.offset = r2
                r0.size = r3
                return
        }
    }

    public StaggeredGrid() {
            r2 = this;
            r2.<init>()
            androidx.collection.CircularArray r0 = new androidx.collection.CircularArray
            r1 = 64
            r0.<init>(r1)
            r2.mLocations = r0
            r0 = -1
            r2.mFirstIndex = r0
            return
    }

    private int calculateOffsetAfterLastItem(int r4) {
            r3 = this;
            int r0 = r3.getLastIndex()
        L4:
            int r1 = r3.mFirstIndex
            r2 = 1
            if (r0 < r1) goto L16
            androidx.leanback.widget.StaggeredGrid$Location r1 = r3.getLocation(r0)
            int r1 = r1.row
            if (r1 != r4) goto L13
            r4 = 1
            goto L17
        L13:
            int r0 = r0 + (-1)
            goto L4
        L16:
            r4 = 0
        L17:
            if (r4 != 0) goto L1d
            int r0 = r3.getLastIndex()
        L1d:
            boolean r4 = r3.isReversedFlow()
            if (r4 == 0) goto L2e
            androidx.leanback.widget.StaggeredGrid$Location r4 = r3.getLocation(r0)
            int r4 = r4.size
            int r4 = -r4
            int r1 = r3.mSpacing
            int r4 = r4 - r1
            goto L37
        L2e:
            androidx.leanback.widget.StaggeredGrid$Location r4 = r3.getLocation(r0)
            int r4 = r4.size
            int r1 = r3.mSpacing
            int r4 = r4 + r1
        L37:
            int r0 = r0 + r2
        L38:
            int r1 = r3.getLastIndex()
            if (r0 > r1) goto L48
            androidx.leanback.widget.StaggeredGrid$Location r1 = r3.getLocation(r0)
            int r1 = r1.offset
            int r4 = r4 - r1
            int r0 = r0 + 1
            goto L38
        L48:
            return r4
    }

    public final boolean appendVisbleItemsWithCache(int r16, boolean r17) {
            r15 = this;
            r0 = r15
            androidx.collection.CircularArray<androidx.leanback.widget.StaggeredGrid$Location> r1 = r0.mLocations
            int r1 = r1.size()
            r2 = 0
            if (r1 != 0) goto Lb
            return r2
        Lb:
            androidx.leanback.widget.Grid$Provider r1 = r0.mProvider
            int r1 = r1.getCount()
            int r3 = r0.mLastVisibleIndex
            r4 = 2147483647(0x7fffffff, float:NaN)
            r5 = 1
            if (r3 < 0) goto L22
            int r6 = r3 + 1
            androidx.leanback.widget.Grid$Provider r7 = r0.mProvider
            int r3 = r7.getEdge(r3)
            goto L43
        L22:
            int r3 = r0.mStartIndex
            r6 = -1
            if (r3 == r6) goto L29
            r6 = r3
            goto L2a
        L29:
            r6 = 0
        L2a:
            int r3 = r15.getLastIndex()
            int r3 = r3 + r5
            if (r6 > r3) goto La0
            int r3 = r15.getFirstIndex()
            if (r6 >= r3) goto L39
            goto La0
        L39:
            int r3 = r15.getLastIndex()
            if (r6 <= r3) goto L40
            return r2
        L40:
            r3 = 2147483647(0x7fffffff, float:NaN)
        L43:
            int r7 = r15.getLastIndex()
            r12 = r6
        L48:
            if (r12 >= r1) goto L9f
            if (r12 > r7) goto L9f
            androidx.leanback.widget.StaggeredGrid$Location r6 = r15.getLocation(r12)
            if (r3 == r4) goto L55
            int r8 = r6.offset
            int r3 = r3 + r8
        L55:
            int r13 = r6.row
            androidx.leanback.widget.Grid$Provider r8 = r0.mProvider
            java.lang.Object[] r9 = r0.mTmpItem
            int r9 = r8.createItem(r12, r5, r9, r2)
            int r8 = r6.size
            if (r9 == r8) goto L6d
            r6.size = r9
            androidx.collection.CircularArray<androidx.leanback.widget.StaggeredGrid$Location> r6 = r0.mLocations
            int r7 = r7 - r12
            r6.removeFromEnd(r7)
            r14 = r12
            goto L6e
        L6d:
            r14 = r7
        L6e:
            r0.mLastVisibleIndex = r12
            int r6 = r0.mFirstVisibleIndex
            if (r6 >= 0) goto L76
            r0.mFirstVisibleIndex = r12
        L76:
            androidx.leanback.widget.Grid$Provider r6 = r0.mProvider
            java.lang.Object[] r7 = r0.mTmpItem
            r7 = r7[r2]
            r8 = r12
            r10 = r13
            r11 = r3
            r6.addItem(r7, r8, r9, r10, r11)
            if (r17 != 0) goto L8b
            boolean r6 = r15.checkAppendOverLimit(r16)
            if (r6 == 0) goto L8b
            return r5
        L8b:
            if (r3 != r4) goto L93
            androidx.leanback.widget.Grid$Provider r3 = r0.mProvider
            int r3 = r3.getEdge(r12)
        L93:
            int r6 = r0.mNumRows
            int r6 = r6 - r5
            if (r13 != r6) goto L9b
            if (r17 == 0) goto L9b
            return r5
        L9b:
            int r12 = r12 + 1
            r7 = r14
            goto L48
        L9f:
            return r2
        La0:
            androidx.collection.CircularArray<androidx.leanback.widget.StaggeredGrid$Location> r1 = r0.mLocations
            r1.clear()
            return r2
    }

    public final int appendVisibleItemToRow(int r11, int r12, int r13) {
            r10 = this;
            int r0 = r10.mLastVisibleIndex
            if (r0 < 0) goto L17
            int r1 = r10.getLastIndex()
            if (r0 != r1) goto L11
            int r0 = r10.mLastVisibleIndex
            int r1 = r11 + (-1)
            if (r0 != r1) goto L11
            goto L17
        L11:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>()
            throw r11
        L17:
            int r0 = r10.mLastVisibleIndex
            r1 = 1
            r2 = 0
            if (r0 >= 0) goto L33
            androidx.collection.CircularArray<androidx.leanback.widget.StaggeredGrid$Location> r0 = r10.mLocations
            int r0 = r0.size()
            if (r0 <= 0) goto L31
            int r0 = r10.getLastIndex()
            int r0 = r0 + r1
            if (r11 != r0) goto L31
            int r0 = r10.calculateOffsetAfterLastItem(r12)
            goto L3b
        L31:
            r0 = 0
            goto L3b
        L33:
            androidx.leanback.widget.Grid$Provider r3 = r10.mProvider
            int r0 = r3.getEdge(r0)
            int r0 = r13 - r0
        L3b:
            androidx.leanback.widget.StaggeredGrid$Location r3 = new androidx.leanback.widget.StaggeredGrid$Location
            r3.<init>(r12, r0, r2)
            androidx.collection.CircularArray<androidx.leanback.widget.StaggeredGrid$Location> r0 = r10.mLocations
            r0.addLast(r3)
            java.lang.Object r0 = r10.mPendingItem
            if (r0 == 0) goto L51
            int r2 = r10.mPendingItemSize
            r3.size = r2
            r2 = 0
            r10.mPendingItem = r2
            goto L5f
        L51:
            androidx.leanback.widget.Grid$Provider r0 = r10.mProvider
            java.lang.Object[] r4 = r10.mTmpItem
            int r0 = r0.createItem(r11, r1, r4, r2)
            r3.size = r0
            java.lang.Object[] r0 = r10.mTmpItem
            r0 = r0[r2]
        L5f:
            r5 = r0
            androidx.collection.CircularArray<androidx.leanback.widget.StaggeredGrid$Location> r0 = r10.mLocations
            int r0 = r0.size()
            if (r0 != r1) goto L6f
            r10.mLastVisibleIndex = r11
            r10.mFirstVisibleIndex = r11
            r10.mFirstIndex = r11
            goto L7b
        L6f:
            int r0 = r10.mLastVisibleIndex
            if (r0 >= 0) goto L78
            r10.mLastVisibleIndex = r11
            r10.mFirstVisibleIndex = r11
            goto L7b
        L78:
            int r0 = r0 + r1
            r10.mLastVisibleIndex = r0
        L7b:
            androidx.leanback.widget.Grid$Provider r4 = r10.mProvider
            int r7 = r3.size
            r6 = r11
            r8 = r12
            r9 = r13
            r4.addItem(r5, r6, r7, r8, r9)
            int r11 = r3.size
            return r11
    }

    @Override // androidx.leanback.widget.Grid
    public final boolean appendVisibleItems(int r4, boolean r5) {
            r3 = this;
            androidx.leanback.widget.Grid$Provider r0 = r3.mProvider
            int r0 = r0.getCount()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            if (r5 != 0) goto L13
            boolean r0 = r3.checkAppendOverLimit(r4)
            if (r0 == 0) goto L13
            return r1
        L13:
            r0 = 0
            boolean r2 = r3.appendVisbleItemsWithCache(r4, r5)     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L22
            r4 = 1
            java.lang.Object[] r5 = r3.mTmpItem
            r5[r1] = r0
        L1f:
            r3.mPendingItem = r0
            return r4
        L22:
            boolean r4 = r3.appendVisibleItemsWithoutCache(r4, r5)     // Catch: java.lang.Throwable -> L2b
            java.lang.Object[] r5 = r3.mTmpItem
            r5[r1] = r0
            goto L1f
        L2b:
            r4 = move-exception
            java.lang.Object[] r5 = r3.mTmpItem
            r5[r1] = r0
            r3.mPendingItem = r0
            throw r4
    }

    public abstract boolean appendVisibleItemsWithoutCache(int r1, boolean r2);

    @Override // androidx.leanback.widget.Grid
    public final void debugPrint(java.io.PrintWriter r6) {
            r5 = this;
            androidx.collection.CircularArray<androidx.leanback.widget.StaggeredGrid$Location> r0 = r5.mLocations
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L3e
            androidx.collection.CircularArray<androidx.leanback.widget.StaggeredGrid$Location> r2 = r5.mLocations
            java.lang.Object r2 = r2.get(r1)
            androidx.leanback.widget.StaggeredGrid$Location r2 = (androidx.leanback.widget.StaggeredGrid.Location) r2
            java.lang.String r3 = "<"
            java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
            int r4 = r5.mFirstIndex
            int r4 = r4 + r1
            r3.append(r4)
            java.lang.String r4 = ","
            r3.append(r4)
            int r2 = r2.row
            r3.append(r2)
            java.lang.String r2 = ">"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r6.print(r2)
            java.lang.String r2 = " "
            r6.print(r2)
            r6.println()
            int r1 = r1 + 1
            goto L7
        L3e:
            return
    }

    public final int getFirstIndex() {
            r1 = this;
            int r0 = r1.mFirstIndex
            return r0
    }

    @Override // androidx.leanback.widget.Grid
    public final androidx.collection.CircularIntArray[] getItemPositionsInRows(int r4, int r5) {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.mNumRows
            if (r0 >= r1) goto Lf
            androidx.collection.CircularIntArray[] r1 = r3.mTmpItemPositionsInRows
            r1 = r1[r0]
            r1.clear()
            int r0 = r0 + 1
            goto L1
        Lf:
            if (r4 < 0) goto L3b
        L11:
            if (r4 > r5) goto L3b
            androidx.collection.CircularIntArray[] r0 = r3.mTmpItemPositionsInRows
            androidx.leanback.widget.StaggeredGrid$Location r1 = r3.getLocation(r4)
            int r1 = r1.row
            r0 = r0[r1]
            int r1 = r0.size()
            if (r1 <= 0) goto L32
            int r1 = r0.getLast()
            int r2 = r4 + (-1)
            if (r1 != r2) goto L32
            r0.popLast()
            r0.addLast(r4)
            goto L38
        L32:
            r0.addLast(r4)
            r0.addLast(r4)
        L38:
            int r4 = r4 + 1
            goto L11
        L3b:
            androidx.collection.CircularIntArray[] r4 = r3.mTmpItemPositionsInRows
            return r4
    }

    public final int getLastIndex() {
            r2 = this;
            int r0 = r2.mFirstIndex
            androidx.collection.CircularArray<androidx.leanback.widget.StaggeredGrid$Location> r1 = r2.mLocations
            int r1 = r1.size()
            int r1 = r1 + r0
            int r1 = r1 + (-1)
            return r1
    }

    @Override // androidx.leanback.widget.Grid
    public /* bridge */ /* synthetic */ androidx.leanback.widget.Grid.Location getLocation(int r1) {
            r0 = this;
            androidx.leanback.widget.StaggeredGrid$Location r1 = r0.getLocation(r1)
            return r1
    }

    @Override // androidx.leanback.widget.Grid
    public final androidx.leanback.widget.StaggeredGrid.Location getLocation(int r2) {
            r1 = this;
            int r0 = r1.mFirstIndex
            int r2 = r2 - r0
            if (r2 < 0) goto L17
            androidx.collection.CircularArray<androidx.leanback.widget.StaggeredGrid$Location> r0 = r1.mLocations
            int r0 = r0.size()
            if (r2 < r0) goto Le
            goto L17
        Le:
            androidx.collection.CircularArray<androidx.leanback.widget.StaggeredGrid$Location> r0 = r1.mLocations
            java.lang.Object r2 = r0.get(r2)
            androidx.leanback.widget.StaggeredGrid$Location r2 = (androidx.leanback.widget.StaggeredGrid.Location) r2
            return r2
        L17:
            r2 = 0
            return r2
    }

    public final int getSize() {
            r1 = this;
            androidx.collection.CircularArray<androidx.leanback.widget.StaggeredGrid$Location> r0 = r1.mLocations
            int r0 = r0.size()
            return r0
    }

    @Override // androidx.leanback.widget.Grid
    public void invalidateItemsAfter(int r3) {
            r2 = this;
            super.invalidateItemsAfter(r3)
            androidx.collection.CircularArray<androidx.leanback.widget.StaggeredGrid$Location> r0 = r2.mLocations
            int r1 = r2.getLastIndex()
            int r1 = r1 - r3
            int r1 = r1 + 1
            r0.removeFromEnd(r1)
            androidx.collection.CircularArray<androidx.leanback.widget.StaggeredGrid$Location> r3 = r2.mLocations
            int r3 = r3.size()
            if (r3 != 0) goto L1a
            r3 = -1
            r2.mFirstIndex = r3
        L1a:
            return
    }

    public final boolean prependVisbleItemsWithCache(int r16, boolean r17) {
            r15 = this;
            r0 = r15
            androidx.collection.CircularArray<androidx.leanback.widget.StaggeredGrid$Location> r1 = r0.mLocations
            int r1 = r1.size()
            r2 = 0
            if (r1 != 0) goto Lb
            return r2
        Lb:
            int r1 = r0.mFirstVisibleIndex
            r3 = 1
            if (r1 < 0) goto L22
            androidx.leanback.widget.Grid$Provider r4 = r0.mProvider
            int r1 = r4.getEdge(r1)
            int r4 = r0.mFirstVisibleIndex
            androidx.leanback.widget.StaggeredGrid$Location r4 = r15.getLocation(r4)
            int r4 = r4.offset
            int r5 = r0.mFirstVisibleIndex
            int r5 = r5 - r3
            goto L43
        L22:
            r1 = 2147483647(0x7fffffff, float:NaN)
            int r4 = r0.mStartIndex
            r5 = -1
            if (r4 == r5) goto L2c
            r5 = r4
            goto L2d
        L2c:
            r5 = 0
        L2d:
            int r4 = r15.getLastIndex()
            if (r5 > r4) goto La8
            int r4 = r15.getFirstIndex()
            int r4 = r4 - r3
            if (r5 >= r4) goto L3b
            goto La8
        L3b:
            int r4 = r15.getFirstIndex()
            if (r5 >= r4) goto L42
            return r2
        L42:
            r4 = 0
        L43:
            androidx.leanback.widget.Grid$Provider r6 = r0.mProvider
            int r6 = r6.getMinIndex()
            int r7 = r0.mFirstIndex
            int r6 = java.lang.Math.max(r6, r7)
        L4f:
            if (r5 < r6) goto La7
            androidx.leanback.widget.StaggeredGrid$Location r13 = r15.getLocation(r5)
            int r14 = r13.row
            androidx.leanback.widget.Grid$Provider r7 = r0.mProvider
            java.lang.Object[] r8 = r0.mTmpItem
            int r10 = r7.createItem(r5, r2, r8, r2)
            int r7 = r13.size
            if (r10 == r7) goto L79
            androidx.collection.CircularArray<androidx.leanback.widget.StaggeredGrid$Location> r1 = r0.mLocations
            int r5 = r5 + r3
            int r3 = r0.mFirstIndex
            int r5 = r5 - r3
            r1.removeFromStart(r5)
            int r1 = r0.mFirstVisibleIndex
            r0.mFirstIndex = r1
            java.lang.Object[] r1 = r0.mTmpItem
            r1 = r1[r2]
            r0.mPendingItem = r1
            r0.mPendingItemSize = r10
            return r2
        L79:
            r0.mFirstVisibleIndex = r5
            int r7 = r0.mLastVisibleIndex
            if (r7 >= 0) goto L81
            r0.mLastVisibleIndex = r5
        L81:
            androidx.leanback.widget.Grid$Provider r7 = r0.mProvider
            java.lang.Object[] r8 = r0.mTmpItem
            r8 = r8[r2]
            int r12 = r1 - r4
            r9 = r5
            r11 = r14
            r7.addItem(r8, r9, r10, r11, r12)
            if (r17 != 0) goto L97
            boolean r1 = r15.checkPrependOverLimit(r16)
            if (r1 == 0) goto L97
            return r3
        L97:
            androidx.leanback.widget.Grid$Provider r1 = r0.mProvider
            int r1 = r1.getEdge(r5)
            int r4 = r13.offset
            if (r14 != 0) goto La4
            if (r17 == 0) goto La4
            return r3
        La4:
            int r5 = r5 + (-1)
            goto L4f
        La7:
            return r2
        La8:
            androidx.collection.CircularArray<androidx.leanback.widget.StaggeredGrid$Location> r1 = r0.mLocations
            r1.clear()
            return r2
    }

    public final int prependVisibleItemToRow(int r13, int r14, int r15) {
            r12 = this;
            int r0 = r12.mFirstVisibleIndex
            if (r0 < 0) goto L17
            int r1 = r12.getFirstIndex()
            if (r0 != r1) goto L11
            int r0 = r12.mFirstVisibleIndex
            int r1 = r13 + 1
            if (r0 != r1) goto L11
            goto L17
        L11:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            r13.<init>()
            throw r13
        L17:
            int r0 = r12.mFirstIndex
            r1 = 0
            if (r0 < 0) goto L21
            androidx.leanback.widget.StaggeredGrid$Location r0 = r12.getLocation(r0)
            goto L22
        L21:
            r0 = r1
        L22:
            androidx.leanback.widget.Grid$Provider r2 = r12.mProvider
            int r3 = r12.mFirstIndex
            int r2 = r2.getEdge(r3)
            androidx.leanback.widget.StaggeredGrid$Location r3 = new androidx.leanback.widget.StaggeredGrid$Location
            r4 = 0
            r3.<init>(r14, r4, r4)
            androidx.collection.CircularArray<androidx.leanback.widget.StaggeredGrid$Location> r5 = r12.mLocations
            r5.addFirst(r3)
            java.lang.Object r5 = r12.mPendingItem
            if (r5 == 0) goto L40
            int r4 = r12.mPendingItemSize
            r3.size = r4
            r12.mPendingItem = r1
            goto L4e
        L40:
            androidx.leanback.widget.Grid$Provider r1 = r12.mProvider
            java.lang.Object[] r5 = r12.mTmpItem
            int r1 = r1.createItem(r13, r4, r5, r4)
            r3.size = r1
            java.lang.Object[] r1 = r12.mTmpItem
            r5 = r1[r4]
        L4e:
            r7 = r5
            r12.mFirstVisibleIndex = r13
            r12.mFirstIndex = r13
            int r1 = r12.mLastVisibleIndex
            if (r1 >= 0) goto L59
            r12.mLastVisibleIndex = r13
        L59:
            boolean r1 = r12.mReversedFlow
            if (r1 != 0) goto L61
            int r1 = r3.size
            int r15 = r15 - r1
            goto L64
        L61:
            int r1 = r3.size
            int r15 = r15 + r1
        L64:
            r11 = r15
            if (r0 == 0) goto L6a
            int r2 = r2 - r11
            r0.offset = r2
        L6a:
            androidx.leanback.widget.Grid$Provider r6 = r12.mProvider
            int r9 = r3.size
            r8 = r13
            r10 = r14
            r6.addItem(r7, r8, r9, r10, r11)
            int r13 = r3.size
            return r13
    }

    @Override // androidx.leanback.widget.Grid
    public final boolean prependVisibleItems(int r4, boolean r5) {
            r3 = this;
            androidx.leanback.widget.Grid$Provider r0 = r3.mProvider
            int r0 = r0.getCount()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            if (r5 != 0) goto L13
            boolean r0 = r3.checkPrependOverLimit(r4)
            if (r0 == 0) goto L13
            return r1
        L13:
            r0 = 0
            boolean r2 = r3.prependVisbleItemsWithCache(r4, r5)     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L22
            r4 = 1
            java.lang.Object[] r5 = r3.mTmpItem
            r5[r1] = r0
        L1f:
            r3.mPendingItem = r0
            return r4
        L22:
            boolean r4 = r3.prependVisibleItemsWithoutCache(r4, r5)     // Catch: java.lang.Throwable -> L2b
            java.lang.Object[] r5 = r3.mTmpItem
            r5[r1] = r0
            goto L1f
        L2b:
            r4 = move-exception
            java.lang.Object[] r5 = r3.mTmpItem
            r5[r1] = r0
            r3.mPendingItem = r0
            throw r4
    }

    public abstract boolean prependVisibleItemsWithoutCache(int r1, boolean r2);
}
