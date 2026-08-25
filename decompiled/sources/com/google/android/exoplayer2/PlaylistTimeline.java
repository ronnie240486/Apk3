package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes.dex */
final class PlaylistTimeline extends com.google.android.exoplayer2.AbstractConcatenatedTimeline {
    private final java.util.HashMap<java.lang.Object, java.lang.Integer> childIndexByUid;
    private final int[] firstPeriodInChildIndices;
    private final int[] firstWindowInChildIndices;
    private final int periodCount;
    private final com.google.android.exoplayer2.Timeline[] timelines;
    private final java.lang.Object[] uids;
    private final int windowCount;

    public PlaylistTimeline(java.util.Collection<? extends com.google.android.exoplayer2.MediaSourceInfoHolder> r6, com.google.android.exoplayer2.source.ShuffleOrder r7) {
            r5 = this;
            r0 = 0
            r5.<init>(r0, r7)
            int r7 = r6.size()
            int[] r1 = new int[r7]
            r5.firstPeriodInChildIndices = r1
            int[] r1 = new int[r7]
            r5.firstWindowInChildIndices = r1
            com.google.android.exoplayer2.Timeline[] r1 = new com.google.android.exoplayer2.Timeline[r7]
            r5.timelines = r1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r5.uids = r7
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            r5.childIndexByUid = r7
            java.util.Iterator r6 = r6.iterator()
            r7 = 0
            r1 = 0
        L25:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L6c
            java.lang.Object r2 = r6.next()
            com.google.android.exoplayer2.MediaSourceInfoHolder r2 = (com.google.android.exoplayer2.MediaSourceInfoHolder) r2
            com.google.android.exoplayer2.Timeline[] r3 = r5.timelines
            com.google.android.exoplayer2.Timeline r4 = r2.getTimeline()
            r3[r1] = r4
            int[] r3 = r5.firstWindowInChildIndices
            r3[r1] = r0
            int[] r3 = r5.firstPeriodInChildIndices
            r3[r1] = r7
            com.google.android.exoplayer2.Timeline[] r3 = r5.timelines
            r3 = r3[r1]
            int r3 = r3.getWindowCount()
            int r0 = r0 + r3
            com.google.android.exoplayer2.Timeline[] r3 = r5.timelines
            r3 = r3[r1]
            int r3 = r3.getPeriodCount()
            int r7 = r7 + r3
            java.lang.Object[] r3 = r5.uids
            java.lang.Object r2 = r2.getUid()
            r3[r1] = r2
            java.util.HashMap<java.lang.Object, java.lang.Integer> r2 = r5.childIndexByUid
            java.lang.Object[] r3 = r5.uids
            r3 = r3[r1]
            int r4 = r1 + 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.put(r3, r1)
            r1 = r4
            goto L25
        L6c:
            r5.windowCount = r0
            r5.periodCount = r7
            return
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    public final int getChildIndexByChildUid(java.lang.Object r2) {
            r1 = this;
            java.util.HashMap<java.lang.Object, java.lang.Integer> r0 = r1.childIndexByUid
            java.lang.Object r2 = r0.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 != 0) goto Lc
            r2 = -1
            goto L10
        Lc:
            int r2 = r2.intValue()
        L10:
            return r2
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    public final int getChildIndexByPeriodIndex(int r3) {
            r2 = this;
            int[] r0 = r2.firstPeriodInChildIndices
            int r3 = r3 + 1
            r1 = 0
            int r3 = com.google.android.exoplayer2.util.Util.binarySearchFloor(r0, r3, r1, r1)
            return r3
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    public final int getChildIndexByWindowIndex(int r3) {
            r2 = this;
            int[] r0 = r2.firstWindowInChildIndices
            int r3 = r3 + 1
            r1 = 0
            int r3 = com.google.android.exoplayer2.util.Util.binarySearchFloor(r0, r3, r1, r1)
            return r3
    }

    public final java.util.List<com.google.android.exoplayer2.Timeline> getChildTimelines() {
            r1 = this;
            com.google.android.exoplayer2.Timeline[] r0 = r1.timelines
            java.util.List r0 = java.util.Arrays.asList(r0)
            return r0
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    public final java.lang.Object getChildUidByChildIndex(int r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.uids
            r2 = r0[r2]
            return r2
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    public final int getFirstPeriodIndexByChildIndex(int r2) {
            r1 = this;
            int[] r0 = r1.firstPeriodInChildIndices
            r2 = r0[r2]
            return r2
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    public final int getFirstWindowIndexByChildIndex(int r2) {
            r1 = this;
            int[] r0 = r1.firstWindowInChildIndices
            r2 = r0[r2]
            return r2
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getPeriodCount() {
            r1 = this;
            int r0 = r1.periodCount
            return r0
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    public final com.google.android.exoplayer2.Timeline getTimelineByChildIndex(int r2) {
            r1 = this;
            com.google.android.exoplayer2.Timeline[] r0 = r1.timelines
            r2 = r0[r2]
            return r2
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getWindowCount() {
            r1 = this;
            int r0 = r1.windowCount
            return r0
    }
}
