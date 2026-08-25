package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractConcatenatedTimeline extends com.google.android.exoplayer2.Timeline {
    private final int childCount;
    private final boolean isAtomic;
    private final com.google.android.exoplayer2.source.ShuffleOrder shuffleOrder;

    public AbstractConcatenatedTimeline(boolean r1, com.google.android.exoplayer2.source.ShuffleOrder r2) {
            r0 = this;
            r0.<init>()
            r0.isAtomic = r1
            r0.shuffleOrder = r2
            int r1 = r2.getLength()
            r0.childCount = r1
            return
    }

    public static java.lang.Object getChildPeriodUidFromConcatenatedUid(java.lang.Object r0) {
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.second
            return r0
    }

    public static java.lang.Object getChildTimelineUidFromConcatenatedUid(java.lang.Object r0) {
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.first
            return r0
    }

    public static java.lang.Object getConcatenatedUid(java.lang.Object r0, java.lang.Object r1) {
            android.util.Pair r0 = android.util.Pair.create(r0, r1)
            return r0
    }

    private int getNextChildIndex(int r1, boolean r2) {
            r0 = this;
            if (r2 == 0) goto L9
            com.google.android.exoplayer2.source.ShuffleOrder r2 = r0.shuffleOrder
            int r1 = r2.getNextIndex(r1)
            goto L13
        L9:
            int r2 = r0.childCount
            int r2 = r2 + (-1)
            if (r1 >= r2) goto L12
            int r1 = r1 + 1
            goto L13
        L12:
            r1 = -1
        L13:
            return r1
    }

    private int getPreviousChildIndex(int r1, boolean r2) {
            r0 = this;
            if (r2 == 0) goto L9
            com.google.android.exoplayer2.source.ShuffleOrder r2 = r0.shuffleOrder
            int r1 = r2.getPreviousIndex(r1)
            goto Lf
        L9:
            if (r1 <= 0) goto Le
            int r1 = r1 + (-1)
            goto Lf
        Le:
            r1 = -1
        Lf:
            return r1
    }

    public abstract int getChildIndexByChildUid(java.lang.Object r1);

    public abstract int getChildIndexByPeriodIndex(int r1);

    public abstract int getChildIndexByWindowIndex(int r1);

    public abstract java.lang.Object getChildUidByChildIndex(int r1);

    public abstract int getFirstPeriodIndexByChildIndex(int r1);

    @Override // com.google.android.exoplayer2.Timeline
    public int getFirstWindowIndex(boolean r4) {
            r3 = this;
            int r0 = r3.childCount
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r3.isAtomic
            r2 = 0
            if (r0 == 0) goto Lc
            r4 = 0
        Lc:
            if (r4 == 0) goto L14
            com.google.android.exoplayer2.source.ShuffleOrder r0 = r3.shuffleOrder
            int r2 = r0.getFirstIndex()
        L14:
            com.google.android.exoplayer2.Timeline r0 = r3.getTimelineByChildIndex(r2)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L25
            int r2 = r3.getNextChildIndex(r2, r4)
            if (r2 != r1) goto L14
            return r1
        L25:
            int r0 = r3.getFirstWindowIndexByChildIndex(r2)
            com.google.android.exoplayer2.Timeline r1 = r3.getTimelineByChildIndex(r2)
            int r4 = r1.getFirstWindowIndex(r4)
            int r4 = r4 + r0
            return r4
    }

    public abstract int getFirstWindowIndexByChildIndex(int r1);

    @Override // com.google.android.exoplayer2.Timeline
    public final int getIndexOfPeriod(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof android.util.Pair
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Object r0 = getChildTimelineUidFromConcatenatedUid(r4)
            java.lang.Object r4 = getChildPeriodUidFromConcatenatedUid(r4)
            int r0 = r3.getChildIndexByChildUid(r0)
            if (r0 != r1) goto L15
            return r1
        L15:
            com.google.android.exoplayer2.Timeline r2 = r3.getTimelineByChildIndex(r0)
            int r4 = r2.getIndexOfPeriod(r4)
            if (r4 != r1) goto L20
            goto L26
        L20:
            int r0 = r3.getFirstPeriodIndexByChildIndex(r0)
            int r1 = r0 + r4
        L26:
            return r1
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getLastWindowIndex(boolean r4) {
            r3 = this;
            int r0 = r3.childCount
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r2 = r3.isAtomic
            if (r2 == 0) goto Lb
            r4 = 0
        Lb:
            if (r4 == 0) goto L14
            com.google.android.exoplayer2.source.ShuffleOrder r0 = r3.shuffleOrder
            int r0 = r0.getLastIndex()
            goto L16
        L14:
            int r0 = r0 + (-1)
        L16:
            com.google.android.exoplayer2.Timeline r2 = r3.getTimelineByChildIndex(r0)
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L27
            int r0 = r3.getPreviousChildIndex(r0, r4)
            if (r0 != r1) goto L16
            return r1
        L27:
            int r1 = r3.getFirstWindowIndexByChildIndex(r0)
            com.google.android.exoplayer2.Timeline r0 = r3.getTimelineByChildIndex(r0)
            int r4 = r0.getLastWindowIndex(r4)
            int r4 = r4 + r1
            return r4
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getNextWindowIndex(int r6, int r7, boolean r8) {
            r5 = this;
            boolean r0 = r5.isAtomic
            r1 = 0
            r2 = 2
            if (r0 == 0) goto Lb
            r8 = 1
            if (r7 != r8) goto La
            r7 = 2
        La:
            r8 = 0
        Lb:
            int r0 = r5.getChildIndexByWindowIndex(r6)
            int r3 = r5.getFirstWindowIndexByChildIndex(r0)
            com.google.android.exoplayer2.Timeline r4 = r5.getTimelineByChildIndex(r0)
            int r6 = r6 - r3
            if (r7 != r2) goto L1b
            goto L1c
        L1b:
            r1 = r7
        L1c:
            int r6 = r4.getNextWindowIndex(r6, r1, r8)
            r1 = -1
            if (r6 == r1) goto L25
            int r3 = r3 + r6
            return r3
        L25:
            int r6 = r5.getNextChildIndex(r0, r8)
        L29:
            if (r6 == r1) goto L3a
            com.google.android.exoplayer2.Timeline r0 = r5.getTimelineByChildIndex(r6)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L3a
            int r6 = r5.getNextChildIndex(r6, r8)
            goto L29
        L3a:
            if (r6 == r1) goto L4a
            int r7 = r5.getFirstWindowIndexByChildIndex(r6)
            com.google.android.exoplayer2.Timeline r6 = r5.getTimelineByChildIndex(r6)
            int r6 = r6.getFirstWindowIndex(r8)
            int r6 = r6 + r7
            return r6
        L4a:
            if (r7 != r2) goto L51
            int r6 = r5.getFirstWindowIndex(r8)
            return r6
        L51:
            return r1
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final com.google.android.exoplayer2.Timeline.Period getPeriod(int r5, com.google.android.exoplayer2.Timeline.Period r6, boolean r7) {
            r4 = this;
            int r0 = r4.getChildIndexByPeriodIndex(r5)
            int r1 = r4.getFirstWindowIndexByChildIndex(r0)
            int r2 = r4.getFirstPeriodIndexByChildIndex(r0)
            com.google.android.exoplayer2.Timeline r3 = r4.getTimelineByChildIndex(r0)
            int r5 = r5 - r2
            r3.getPeriod(r5, r6, r7)
            int r5 = r6.windowIndex
            int r5 = r5 + r1
            r6.windowIndex = r5
            if (r7 == 0) goto L2b
            java.lang.Object r5 = r4.getChildUidByChildIndex(r0)
            java.lang.Object r7 = r6.uid
            java.lang.Object r7 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r7)
            java.lang.Object r5 = getConcatenatedUid(r5, r7)
            r6.uid = r5
        L2b:
            return r6
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final com.google.android.exoplayer2.Timeline.Period getPeriodByUid(java.lang.Object r4, com.google.android.exoplayer2.Timeline.Period r5) {
            r3 = this;
            java.lang.Object r0 = getChildTimelineUidFromConcatenatedUid(r4)
            java.lang.Object r1 = getChildPeriodUidFromConcatenatedUid(r4)
            int r0 = r3.getChildIndexByChildUid(r0)
            int r2 = r3.getFirstWindowIndexByChildIndex(r0)
            com.google.android.exoplayer2.Timeline r0 = r3.getTimelineByChildIndex(r0)
            r0.getPeriodByUid(r1, r5)
            int r0 = r5.windowIndex
            int r0 = r0 + r2
            r5.windowIndex = r0
            r5.uid = r4
            return r5
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getPreviousWindowIndex(int r6, int r7, boolean r8) {
            r5 = this;
            boolean r0 = r5.isAtomic
            r1 = 0
            r2 = 2
            if (r0 == 0) goto Lb
            r8 = 1
            if (r7 != r8) goto La
            r7 = 2
        La:
            r8 = 0
        Lb:
            int r0 = r5.getChildIndexByWindowIndex(r6)
            int r3 = r5.getFirstWindowIndexByChildIndex(r0)
            com.google.android.exoplayer2.Timeline r4 = r5.getTimelineByChildIndex(r0)
            int r6 = r6 - r3
            if (r7 != r2) goto L1b
            goto L1c
        L1b:
            r1 = r7
        L1c:
            int r6 = r4.getPreviousWindowIndex(r6, r1, r8)
            r1 = -1
            if (r6 == r1) goto L25
            int r3 = r3 + r6
            return r3
        L25:
            int r6 = r5.getPreviousChildIndex(r0, r8)
        L29:
            if (r6 == r1) goto L3a
            com.google.android.exoplayer2.Timeline r0 = r5.getTimelineByChildIndex(r6)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L3a
            int r6 = r5.getPreviousChildIndex(r6, r8)
            goto L29
        L3a:
            if (r6 == r1) goto L4a
            int r7 = r5.getFirstWindowIndexByChildIndex(r6)
            com.google.android.exoplayer2.Timeline r6 = r5.getTimelineByChildIndex(r6)
            int r6 = r6.getLastWindowIndex(r8)
            int r6 = r6 + r7
            return r6
        L4a:
            if (r7 != r2) goto L51
            int r6 = r5.getLastWindowIndex(r8)
            return r6
        L51:
            return r1
    }

    public abstract com.google.android.exoplayer2.Timeline getTimelineByChildIndex(int r1);

    @Override // com.google.android.exoplayer2.Timeline
    public final java.lang.Object getUidOfPeriod(int r4) {
            r3 = this;
            int r0 = r3.getChildIndexByPeriodIndex(r4)
            int r1 = r3.getFirstPeriodIndexByChildIndex(r0)
            com.google.android.exoplayer2.Timeline r2 = r3.getTimelineByChildIndex(r0)
            int r4 = r4 - r1
            java.lang.Object r4 = r2.getUidOfPeriod(r4)
            java.lang.Object r0 = r3.getChildUidByChildIndex(r0)
            java.lang.Object r4 = getConcatenatedUid(r0, r4)
            return r4
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final com.google.android.exoplayer2.Timeline.Window getWindow(int r5, com.google.android.exoplayer2.Timeline.Window r6, long r7) {
            r4 = this;
            int r0 = r4.getChildIndexByWindowIndex(r5)
            int r1 = r4.getFirstWindowIndexByChildIndex(r0)
            int r2 = r4.getFirstPeriodIndexByChildIndex(r0)
            com.google.android.exoplayer2.Timeline r3 = r4.getTimelineByChildIndex(r0)
            int r5 = r5 - r1
            r3.getWindow(r5, r6, r7)
            java.lang.Object r5 = r4.getChildUidByChildIndex(r0)
            java.lang.Object r7 = com.google.android.exoplayer2.Timeline.Window.SINGLE_WINDOW_UID
            java.lang.Object r8 = r6.uid
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L23
            goto L29
        L23:
            java.lang.Object r7 = r6.uid
            java.lang.Object r5 = getConcatenatedUid(r5, r7)
        L29:
            r6.uid = r5
            int r5 = r6.firstPeriodIndex
            int r5 = r5 + r2
            r6.firstPeriodIndex = r5
            int r5 = r6.lastPeriodIndex
            int r5 = r5 + r2
            r6.lastPeriodIndex = r5
            return r6
    }
}
