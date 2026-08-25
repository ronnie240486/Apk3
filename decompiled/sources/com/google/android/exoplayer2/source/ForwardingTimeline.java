package com.google.android.exoplayer2.source;

/* JADX INFO: loaded from: classes.dex */
public abstract class ForwardingTimeline extends com.google.android.exoplayer2.Timeline {
    public final com.google.android.exoplayer2.Timeline timeline;

    public ForwardingTimeline(com.google.android.exoplayer2.Timeline r1) {
            r0 = this;
            r0.<init>()
            r0.timeline = r1
            return
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getFirstWindowIndex(boolean r2) {
            r1 = this;
            com.google.android.exoplayer2.Timeline r0 = r1.timeline
            int r2 = r0.getFirstWindowIndex(r2)
            return r2
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getIndexOfPeriod(java.lang.Object r2) {
            r1 = this;
            com.google.android.exoplayer2.Timeline r0 = r1.timeline
            int r2 = r0.getIndexOfPeriod(r2)
            return r2
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getLastWindowIndex(boolean r2) {
            r1 = this;
            com.google.android.exoplayer2.Timeline r0 = r1.timeline
            int r2 = r0.getLastWindowIndex(r2)
            return r2
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getNextWindowIndex(int r2, int r3, boolean r4) {
            r1 = this;
            com.google.android.exoplayer2.Timeline r0 = r1.timeline
            int r2 = r0.getNextWindowIndex(r2, r3, r4)
            return r2
    }

    @Override // com.google.android.exoplayer2.Timeline
    public com.google.android.exoplayer2.Timeline.Period getPeriod(int r2, com.google.android.exoplayer2.Timeline.Period r3, boolean r4) {
            r1 = this;
            com.google.android.exoplayer2.Timeline r0 = r1.timeline
            com.google.android.exoplayer2.Timeline$Period r2 = r0.getPeriod(r2, r3, r4)
            return r2
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getPeriodCount() {
            r1 = this;
            com.google.android.exoplayer2.Timeline r0 = r1.timeline
            int r0 = r0.getPeriodCount()
            return r0
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getPreviousWindowIndex(int r2, int r3, boolean r4) {
            r1 = this;
            com.google.android.exoplayer2.Timeline r0 = r1.timeline
            int r2 = r0.getPreviousWindowIndex(r2, r3, r4)
            return r2
    }

    @Override // com.google.android.exoplayer2.Timeline
    public java.lang.Object getUidOfPeriod(int r2) {
            r1 = this;
            com.google.android.exoplayer2.Timeline r0 = r1.timeline
            java.lang.Object r2 = r0.getUidOfPeriod(r2)
            return r2
    }

    @Override // com.google.android.exoplayer2.Timeline
    public com.google.android.exoplayer2.Timeline.Window getWindow(int r2, com.google.android.exoplayer2.Timeline.Window r3, long r4) {
            r1 = this;
            com.google.android.exoplayer2.Timeline r0 = r1.timeline
            com.google.android.exoplayer2.Timeline$Window r2 = r0.getWindow(r2, r3, r4)
            return r2
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getWindowCount() {
            r1 = this;
            com.google.android.exoplayer2.Timeline r0 = r1.timeline
            int r0 = r0.getWindowCount()
            return r0
    }
}
