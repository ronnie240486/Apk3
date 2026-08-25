package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
final class StaggeredGridDefault extends androidx.leanback.widget.StaggeredGrid {
    public StaggeredGridDefault() {
            r0 = this;
            r0.<init>()
            return
    }

    private int findRowEdgeLimitSearchIndex(boolean r5) {
            r4 = this;
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L1f
            int r5 = r4.mLastVisibleIndex
        L6:
            int r2 = r4.mFirstVisibleIndex
            if (r5 < r2) goto L3a
            androidx.leanback.widget.StaggeredGrid$Location r2 = r4.getLocation(r5)
            int r2 = r2.row
            if (r2 != 0) goto L14
            r1 = 1
            goto L1c
        L14:
            if (r1 == 0) goto L1c
            int r3 = r4.mNumRows
            int r3 = r3 - r0
            if (r2 != r3) goto L1c
            return r5
        L1c:
            int r5 = r5 + (-1)
            goto L6
        L1f:
            int r5 = r4.mFirstVisibleIndex
        L21:
            int r2 = r4.mLastVisibleIndex
            if (r5 > r2) goto L3a
            androidx.leanback.widget.StaggeredGrid$Location r2 = r4.getLocation(r5)
            int r2 = r2.row
            int r3 = r4.mNumRows
            int r3 = r3 - r0
            if (r2 != r3) goto L32
            r1 = 1
            goto L37
        L32:
            if (r1 == 0) goto L37
            if (r2 != 0) goto L37
            return r5
        L37:
            int r5 = r5 + 1
            goto L21
        L3a:
            r5 = -1
            return r5
    }

    @Override // androidx.leanback.widget.StaggeredGrid
    public final boolean appendVisibleItemsWithoutCache(int r14, boolean r15) {
            r13 = this;
            androidx.leanback.widget.Grid$Provider r0 = r13.mProvider
            int r0 = r0.getCount()
            int r1 = r13.mLastVisibleIndex
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
            r4 = 0
            r5 = 1
            if (r1 < 0) goto L76
            int r6 = r13.getLastIndex()
            if (r1 >= r6) goto L16
            return r4
        L16:
            int r1 = r13.mLastVisibleIndex
            int r6 = r1 + 1
            androidx.leanback.widget.StaggeredGrid$Location r1 = r13.getLocation(r1)
            int r1 = r1.row
            int r7 = r13.findRowEdgeLimitSearchIndex(r5)
            if (r7 >= 0) goto L40
            r7 = 0
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
        L29:
            int r9 = r13.mNumRows
            if (r7 >= r9) goto L4e
            boolean r8 = r13.mReversedFlow
            if (r8 == 0) goto L36
            int r8 = r13.getRowMin(r7)
            goto L3a
        L36:
            int r8 = r13.getRowMax(r7)
        L3a:
            if (r8 == r2) goto L3d
            goto L4e
        L3d:
            int r7 = r7 + 1
            goto L29
        L40:
            boolean r8 = r13.mReversedFlow
            if (r8 == 0) goto L49
            int r7 = r13.findRowMin(r4, r7, r3)
            goto L4d
        L49:
            int r7 = r13.findRowMax(r5, r7, r3)
        L4d:
            r8 = r7
        L4e:
            boolean r7 = r13.mReversedFlow
            if (r7 == 0) goto L59
            int r7 = r13.getRowMin(r1)
            if (r7 > r8) goto L74
            goto L5f
        L59:
            int r7 = r13.getRowMax(r1)
            if (r7 < r8) goto L74
        L5f:
            int r1 = r1 + 1
            int r7 = r13.mNumRows
            if (r1 != r7) goto L74
            boolean r1 = r13.mReversedFlow
            if (r1 == 0) goto L6e
            int r1 = r13.findRowMin(r4, r3)
            goto L72
        L6e:
            int r1 = r13.findRowMax(r5, r3)
        L72:
            r8 = r1
            r1 = 0
        L74:
            r7 = 1
            goto L98
        L76:
            int r1 = r13.mStartIndex
            r6 = -1
            if (r1 == r6) goto L7d
            r6 = r1
            goto L7e
        L7d:
            r6 = 0
        L7e:
            androidx.collection.CircularArray<androidx.leanback.widget.StaggeredGrid$Location> r1 = r13.mLocations
            int r1 = r1.size()
            if (r1 <= 0) goto L92
            int r1 = r13.getLastIndex()
            androidx.leanback.widget.StaggeredGrid$Location r1 = r13.getLocation(r1)
            int r1 = r1.row
            int r1 = r1 + r5
            goto L93
        L92:
            r1 = r6
        L93:
            int r7 = r13.mNumRows
            int r1 = r1 % r7
            r7 = 0
            r8 = 0
        L98:
            r9 = 0
        L99:
            int r10 = r13.mNumRows
            if (r1 >= r10) goto L14e
            if (r6 == r0) goto L14d
            if (r15 != 0) goto La9
            boolean r10 = r13.checkAppendOverLimit(r14)
            if (r10 == 0) goto La9
            goto L14d
        La9:
            boolean r9 = r13.mReversedFlow
            if (r9 == 0) goto Lb2
            int r9 = r13.getRowMin(r1)
            goto Lb6
        Lb2:
            int r9 = r13.getRowMax(r1)
        Lb6:
            r10 = 2147483647(0x7fffffff, float:NaN)
            if (r9 == r10) goto Lca
            if (r9 != r2) goto Lbe
            goto Lca
        Lbe:
            boolean r10 = r13.mReversedFlow
            if (r10 == 0) goto Lc6
            int r10 = r13.mSpacing
        Lc4:
            int r10 = -r10
            goto Lc8
        Lc6:
            int r10 = r13.mSpacing
        Lc8:
            int r9 = r9 + r10
            goto Lfe
        Lca:
            if (r1 != 0) goto Led
            boolean r9 = r13.mReversedFlow
            if (r9 == 0) goto Ld8
            int r9 = r13.mNumRows
            int r9 = r9 - r5
            int r9 = r13.getRowMin(r9)
            goto Ldf
        Ld8:
            int r9 = r13.mNumRows
            int r9 = r9 - r5
            int r9 = r13.getRowMax(r9)
        Ldf:
            if (r9 == r10) goto Lfe
            if (r9 == r2) goto Lfe
            boolean r10 = r13.mReversedFlow
            if (r10 == 0) goto Lea
            int r10 = r13.mSpacing
            goto Lc4
        Lea:
            int r10 = r13.mSpacing
            goto Lc8
        Led:
            boolean r9 = r13.mReversedFlow
            if (r9 == 0) goto Lf8
            int r9 = r1 + (-1)
            int r9 = r13.getRowMax(r9)
            goto Lfe
        Lf8:
            int r9 = r1 + (-1)
            int r9 = r13.getRowMin(r9)
        Lfe:
            int r10 = r6 + 1
            int r6 = r13.appendVisibleItemToRow(r6, r1, r9)
            if (r7 == 0) goto L138
        L106:
            boolean r11 = r13.mReversedFlow
            if (r11 == 0) goto L10f
            int r11 = r9 - r6
            if (r11 <= r8) goto L136
            goto L113
        L10f:
            int r11 = r9 + r6
            if (r11 >= r8) goto L136
        L113:
            if (r10 == r0) goto L135
            if (r15 != 0) goto L11e
            boolean r11 = r13.checkAppendOverLimit(r14)
            if (r11 == 0) goto L11e
            goto L135
        L11e:
            boolean r11 = r13.mReversedFlow
            if (r11 == 0) goto L127
            int r6 = -r6
            int r11 = r13.mSpacing
            int r6 = r6 - r11
            goto L12a
        L127:
            int r11 = r13.mSpacing
            int r6 = r6 + r11
        L12a:
            int r9 = r9 + r6
            int r6 = r10 + 1
            int r10 = r13.appendVisibleItemToRow(r10, r1, r9)
            r12 = r10
            r10 = r6
            r6 = r12
            goto L106
        L135:
            return r5
        L136:
            r6 = r10
            goto L148
        L138:
            boolean r6 = r13.mReversedFlow
            if (r6 == 0) goto L141
            int r6 = r13.getRowMin(r1)
            goto L145
        L141:
            int r6 = r13.getRowMax(r1)
        L145:
            r8 = r6
            r6 = r10
            r7 = 1
        L148:
            int r1 = r1 + 1
            r9 = 1
            goto L99
        L14d:
            return r9
        L14e:
            if (r15 == 0) goto L151
            return r9
        L151:
            boolean r1 = r13.mReversedFlow
            if (r1 == 0) goto L15a
            int r1 = r13.findRowMin(r4, r3)
            goto L15e
        L15a:
            int r1 = r13.findRowMax(r5, r3)
        L15e:
            r8 = r1
            r1 = 0
            goto L99
    }

    @Override // androidx.leanback.widget.Grid
    public int findRowMax(boolean r10, int r11, int[] r12) {
            r9 = this;
            androidx.leanback.widget.Grid$Provider r0 = r9.mProvider
            int r0 = r0.getEdge(r11)
            androidx.leanback.widget.StaggeredGrid$Location r1 = r9.getLocation(r11)
            int r2 = r1.row
            boolean r3 = r9.mReversedFlow
            r4 = 1
            if (r3 == 0) goto L3d
            int r1 = r11 + 1
            r3 = r2
            r5 = r3
            r6 = 1
            r2 = r1
            r1 = r0
        L18:
            int r7 = r9.mNumRows
            if (r6 >= r7) goto L79
            int r7 = r9.mLastVisibleIndex
            if (r2 > r7) goto L79
            androidx.leanback.widget.StaggeredGrid$Location r7 = r9.getLocation(r2)
            int r8 = r7.offset
            int r1 = r1 + r8
            int r7 = r7.row
            if (r7 == r5) goto L3a
            int r6 = r6 + 1
            if (r10 == 0) goto L32
            if (r1 <= r0) goto L39
            goto L34
        L32:
            if (r1 >= r0) goto L39
        L34:
            r0 = r1
            r11 = r2
            r3 = r7
            r5 = r3
            goto L3a
        L39:
            r5 = r7
        L3a:
            int r2 = r2 + 1
            goto L18
        L3d:
            androidx.leanback.widget.Grid$Provider r3 = r9.mProvider
            int r3 = r3.getSize(r11)
            int r3 = r3 + r0
            int r5 = r11 + (-1)
            r6 = r5
            r7 = 1
            r5 = r2
            r2 = r1
            r1 = r0
            r0 = r3
            r3 = r5
        L4d:
            int r8 = r9.mNumRows
            if (r7 >= r8) goto L79
            int r8 = r9.mFirstVisibleIndex
            if (r6 < r8) goto L79
            int r2 = r2.offset
            int r1 = r1 - r2
            androidx.leanback.widget.StaggeredGrid$Location r2 = r9.getLocation(r6)
            int r8 = r2.row
            if (r8 == r5) goto L76
            int r7 = r7 + 1
            androidx.leanback.widget.Grid$Provider r5 = r9.mProvider
            int r5 = r5.getSize(r6)
            int r5 = r5 + r1
            if (r10 == 0) goto L6e
            if (r5 <= r0) goto L75
            goto L70
        L6e:
            if (r5 >= r0) goto L75
        L70:
            r0 = r5
            r11 = r6
            r3 = r8
            r5 = r3
            goto L76
        L75:
            r5 = r8
        L76:
            int r6 = r6 + (-1)
            goto L4d
        L79:
            if (r12 == 0) goto L80
            r10 = 0
            r12[r10] = r3
            r12[r4] = r11
        L80:
            return r0
    }

    @Override // androidx.leanback.widget.Grid
    public int findRowMin(boolean r10, int r11, int[] r12) {
            r9 = this;
            androidx.leanback.widget.Grid$Provider r0 = r9.mProvider
            int r0 = r0.getEdge(r11)
            androidx.leanback.widget.StaggeredGrid$Location r1 = r9.getLocation(r11)
            int r2 = r1.row
            boolean r3 = r9.mReversedFlow
            r4 = 1
            if (r3 == 0) goto L4c
            androidx.leanback.widget.Grid$Provider r3 = r9.mProvider
            int r3 = r3.getSize(r11)
            int r3 = r0 - r3
            int r5 = r11 + (-1)
            r6 = r5
            r7 = 1
            r5 = r3
            r3 = r2
        L1f:
            int r8 = r9.mNumRows
            if (r7 >= r8) goto L7a
            int r8 = r9.mFirstVisibleIndex
            if (r6 < r8) goto L7a
            int r1 = r1.offset
            int r0 = r0 - r1
            androidx.leanback.widget.StaggeredGrid$Location r1 = r9.getLocation(r6)
            int r8 = r1.row
            if (r8 == r3) goto L49
            int r7 = r7 + 1
            androidx.leanback.widget.Grid$Provider r3 = r9.mProvider
            int r3 = r3.getSize(r6)
            int r3 = r0 - r3
            if (r10 == 0) goto L41
            if (r3 <= r5) goto L48
            goto L43
        L41:
            if (r3 >= r5) goto L48
        L43:
            r5 = r3
            r11 = r6
            r2 = r8
            r3 = r2
            goto L49
        L48:
            r3 = r8
        L49:
            int r6 = r6 + (-1)
            goto L1f
        L4c:
            int r1 = r11 + 1
            r3 = r2
            r5 = r3
            r6 = 1
            r2 = r1
            r1 = r0
        L53:
            int r7 = r9.mNumRows
            if (r6 >= r7) goto L78
            int r7 = r9.mLastVisibleIndex
            if (r2 > r7) goto L78
            androidx.leanback.widget.StaggeredGrid$Location r7 = r9.getLocation(r2)
            int r8 = r7.offset
            int r1 = r1 + r8
            int r7 = r7.row
            if (r7 == r5) goto L75
            int r6 = r6 + 1
            if (r10 == 0) goto L6d
            if (r1 <= r0) goto L74
            goto L6f
        L6d:
            if (r1 >= r0) goto L74
        L6f:
            r0 = r1
            r11 = r2
            r3 = r7
            r5 = r3
            goto L75
        L74:
            r5 = r7
        L75:
            int r2 = r2 + 1
            goto L53
        L78:
            r5 = r0
            r2 = r3
        L7a:
            if (r12 == 0) goto L81
            r10 = 0
            r12[r10] = r2
            r12[r4] = r11
        L81:
            return r5
    }

    public final int getRowMax(int r6) {
            r5 = this;
            int r0 = r5.mFirstVisibleIndex
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 >= 0) goto L7
            return r1
        L7:
            boolean r2 = r5.mReversedFlow
            if (r2 == 0) goto L33
            androidx.leanback.widget.Grid$Provider r2 = r5.mProvider
            int r0 = r2.getEdge(r0)
            int r2 = r5.mFirstVisibleIndex
            androidx.leanback.widget.StaggeredGrid$Location r2 = r5.getLocation(r2)
            int r2 = r2.row
            if (r2 != r6) goto L1c
            return r0
        L1c:
            int r2 = r5.mFirstVisibleIndex
        L1e:
            int r2 = r2 + 1
            int r3 = r5.getLastIndex()
            if (r2 > r3) goto L64
            androidx.leanback.widget.StaggeredGrid$Location r3 = r5.getLocation(r2)
            int r4 = r3.offset
            int r0 = r0 + r4
            int r3 = r3.row
            if (r3 != r6) goto L32
            return r0
        L32:
            goto L1e
        L33:
            androidx.leanback.widget.Grid$Provider r0 = r5.mProvider
            int r2 = r5.mLastVisibleIndex
            int r0 = r0.getEdge(r2)
            int r2 = r5.mLastVisibleIndex
            androidx.leanback.widget.StaggeredGrid$Location r2 = r5.getLocation(r2)
            int r3 = r2.row
            if (r3 != r6) goto L49
            int r6 = r2.size
        L47:
            int r0 = r0 + r6
            return r0
        L49:
            int r3 = r5.mLastVisibleIndex
            int r3 = r3 + (-1)
        L4d:
            int r4 = r5.getFirstIndex()
            if (r3 < r4) goto L64
            int r2 = r2.offset
            int r0 = r0 - r2
            androidx.leanback.widget.StaggeredGrid$Location r2 = r5.getLocation(r3)
            int r4 = r2.row
            if (r4 != r6) goto L61
            int r6 = r2.size
            goto L47
        L61:
            int r3 = r3 + (-1)
            goto L4d
        L64:
            return r1
    }

    public final int getRowMin(int r6) {
            r5 = this;
            int r0 = r5.mFirstVisibleIndex
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 >= 0) goto L8
            return r1
        L8:
            boolean r2 = r5.mReversedFlow
            if (r2 == 0) goto L3d
            androidx.leanback.widget.Grid$Provider r0 = r5.mProvider
            int r2 = r5.mLastVisibleIndex
            int r0 = r0.getEdge(r2)
            int r2 = r5.mLastVisibleIndex
            androidx.leanback.widget.StaggeredGrid$Location r2 = r5.getLocation(r2)
            int r3 = r2.row
            if (r3 != r6) goto L22
            int r6 = r2.size
        L20:
            int r0 = r0 - r6
            return r0
        L22:
            int r3 = r5.mLastVisibleIndex
            int r3 = r3 + (-1)
        L26:
            int r4 = r5.getFirstIndex()
            if (r3 < r4) goto L65
            int r2 = r2.offset
            int r0 = r0 - r2
            androidx.leanback.widget.StaggeredGrid$Location r2 = r5.getLocation(r3)
            int r4 = r2.row
            if (r4 != r6) goto L3a
            int r6 = r2.size
            goto L20
        L3a:
            int r3 = r3 + (-1)
            goto L26
        L3d:
            androidx.leanback.widget.Grid$Provider r2 = r5.mProvider
            int r0 = r2.getEdge(r0)
            int r2 = r5.mFirstVisibleIndex
            androidx.leanback.widget.StaggeredGrid$Location r2 = r5.getLocation(r2)
            int r2 = r2.row
            if (r2 != r6) goto L4e
            return r0
        L4e:
            int r2 = r5.mFirstVisibleIndex
        L50:
            int r2 = r2 + 1
            int r3 = r5.getLastIndex()
            if (r2 > r3) goto L65
            androidx.leanback.widget.StaggeredGrid$Location r3 = r5.getLocation(r2)
            int r4 = r3.offset
            int r0 = r0 + r4
            int r3 = r3.row
            if (r3 != r6) goto L64
            return r0
        L64:
            goto L50
        L65:
            return r1
    }

    @Override // androidx.leanback.widget.StaggeredGrid
    public final boolean prependVisibleItemsWithoutCache(int r13, boolean r14) {
            r12 = this;
            int r0 = r12.mFirstVisibleIndex
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            r3 = 0
            r4 = 1
            if (r0 < 0) goto L74
            int r5 = r12.getFirstIndex()
            if (r0 <= r5) goto L11
            return r3
        L11:
            int r0 = r12.mFirstVisibleIndex
            int r5 = r0 + (-1)
            androidx.leanback.widget.StaggeredGrid$Location r0 = r12.getLocation(r0)
            int r0 = r0.row
            int r6 = r12.findRowEdgeLimitSearchIndex(r3)
            if (r6 >= 0) goto L3e
            int r0 = r0 + (-1)
            int r6 = r12.mNumRows
            int r6 = r6 - r4
            r7 = 2147483647(0x7fffffff, float:NaN)
        L29:
            if (r6 < 0) goto L4c
            boolean r7 = r12.mReversedFlow
            if (r7 == 0) goto L34
            int r7 = r12.getRowMax(r6)
            goto L38
        L34:
            int r7 = r12.getRowMin(r6)
        L38:
            if (r7 == r1) goto L3b
            goto L4c
        L3b:
            int r6 = r6 + (-1)
            goto L29
        L3e:
            boolean r7 = r12.mReversedFlow
            if (r7 == 0) goto L47
            int r6 = r12.findRowMax(r4, r6, r2)
            goto L4b
        L47:
            int r6 = r12.findRowMin(r3, r6, r2)
        L4b:
            r7 = r6
        L4c:
            boolean r6 = r12.mReversedFlow
            if (r6 == 0) goto L57
            int r6 = r12.getRowMax(r0)
            if (r6 < r7) goto L72
            goto L5d
        L57:
            int r6 = r12.getRowMin(r0)
            if (r6 > r7) goto L72
        L5d:
            int r0 = r0 + (-1)
            if (r0 >= 0) goto L72
            int r0 = r12.mNumRows
            int r0 = r0 - r4
            boolean r6 = r12.mReversedFlow
            if (r6 == 0) goto L6d
            int r6 = r12.findRowMax(r4, r2)
            goto L71
        L6d:
            int r6 = r12.findRowMin(r3, r2)
        L71:
            r7 = r6
        L72:
            r6 = 1
            goto L99
        L74:
            int r0 = r12.mStartIndex
            r5 = -1
            if (r0 == r5) goto L7b
            r5 = r0
            goto L7c
        L7b:
            r5 = 0
        L7c:
            androidx.collection.CircularArray<androidx.leanback.widget.StaggeredGrid$Location> r0 = r12.mLocations
            int r0 = r0.size()
            if (r0 <= 0) goto L93
            int r0 = r12.getFirstIndex()
            androidx.leanback.widget.StaggeredGrid$Location r0 = r12.getLocation(r0)
            int r0 = r0.row
            int r6 = r12.mNumRows
            int r0 = r0 + r6
            int r0 = r0 - r4
            goto L94
        L93:
            r0 = r5
        L94:
            int r6 = r12.mNumRows
            int r0 = r0 % r6
            r6 = 0
            r7 = 0
        L99:
            r8 = 0
        L9a:
            if (r0 < 0) goto L149
            if (r5 < 0) goto L148
            if (r14 != 0) goto La8
            boolean r9 = r12.checkPrependOverLimit(r13)
            if (r9 == 0) goto La8
            goto L148
        La8:
            boolean r8 = r12.mReversedFlow
            if (r8 == 0) goto Lb1
            int r8 = r12.getRowMax(r0)
            goto Lb5
        Lb1:
            int r8 = r12.getRowMin(r0)
        Lb5:
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r8 == r1) goto Lc8
            if (r8 != r9) goto Lbc
            goto Lc8
        Lbc:
            boolean r9 = r12.mReversedFlow
            if (r9 == 0) goto Lc3
            int r9 = r12.mSpacing
            goto Lc6
        Lc3:
            int r9 = r12.mSpacing
        Lc5:
            int r9 = -r9
        Lc6:
            int r8 = r8 + r9
            goto Lf9
        Lc8:
            int r8 = r12.mNumRows
            int r8 = r8 - r4
            if (r0 != r8) goto Le8
            boolean r8 = r12.mReversedFlow
            if (r8 == 0) goto Ld6
            int r8 = r12.getRowMax(r3)
            goto Lda
        Ld6:
            int r8 = r12.getRowMin(r3)
        Lda:
            if (r8 == r1) goto Lf9
            if (r8 == r9) goto Lf9
            boolean r9 = r12.mReversedFlow
            if (r9 == 0) goto Le5
            int r9 = r12.mSpacing
            goto Lc6
        Le5:
            int r9 = r12.mSpacing
            goto Lc5
        Le8:
            boolean r8 = r12.mReversedFlow
            if (r8 == 0) goto Lf3
            int r8 = r0 + 1
            int r8 = r12.getRowMin(r8)
            goto Lf9
        Lf3:
            int r8 = r0 + 1
            int r8 = r12.getRowMax(r8)
        Lf9:
            int r9 = r5 + (-1)
            int r5 = r12.prependVisibleItemToRow(r5, r0, r8)
            if (r6 == 0) goto L133
        L101:
            boolean r10 = r12.mReversedFlow
            if (r10 == 0) goto L10a
            int r10 = r8 + r5
            if (r10 >= r7) goto L131
            goto L10e
        L10a:
            int r10 = r8 - r5
            if (r10 <= r7) goto L131
        L10e:
            if (r9 < 0) goto L130
            if (r14 != 0) goto L119
            boolean r10 = r12.checkPrependOverLimit(r13)
            if (r10 == 0) goto L119
            goto L130
        L119:
            boolean r10 = r12.mReversedFlow
            if (r10 == 0) goto L121
            int r10 = r12.mSpacing
            int r5 = r5 + r10
            goto L125
        L121:
            int r5 = -r5
            int r10 = r12.mSpacing
            int r5 = r5 - r10
        L125:
            int r8 = r8 + r5
            int r5 = r9 + (-1)
            int r9 = r12.prependVisibleItemToRow(r9, r0, r8)
            r11 = r9
            r9 = r5
            r5 = r11
            goto L101
        L130:
            return r4
        L131:
            r5 = r9
            goto L143
        L133:
            boolean r5 = r12.mReversedFlow
            if (r5 == 0) goto L13c
            int r5 = r12.getRowMax(r0)
            goto L140
        L13c:
            int r5 = r12.getRowMin(r0)
        L140:
            r7 = r5
            r5 = r9
            r6 = 1
        L143:
            int r0 = r0 + (-1)
            r8 = 1
            goto L9a
        L148:
            return r8
        L149:
            if (r14 == 0) goto L14c
            return r8
        L14c:
            boolean r0 = r12.mReversedFlow
            if (r0 == 0) goto L155
            int r0 = r12.findRowMax(r4, r2)
            goto L159
        L155:
            int r0 = r12.findRowMin(r3, r2)
        L159:
            r7 = r0
            int r0 = r12.mNumRows
            int r0 = r0 - r4
            goto L9a
    }
}
