package com.google.android.exoplayer2.source.ads;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.VisibleForTesting(otherwise = 3)
public final class SinglePeriodAdTimeline extends com.google.android.exoplayer2.source.ForwardingTimeline {
    private final com.google.android.exoplayer2.source.ads.AdPlaybackState adPlaybackState;

    public SinglePeriodAdTimeline(com.google.android.exoplayer2.Timeline r4, com.google.android.exoplayer2.source.ads.AdPlaybackState r5) {
            r3 = this;
            r3.<init>(r4)
            int r0 = r4.getPeriodCount()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            int r4 = r4.getWindowCount()
            if (r4 != r2) goto L18
            r1 = 1
        L18:
            com.google.android.exoplayer2.util.Assertions.checkState(r1)
            r3.adPlaybackState = r5
            return
    }

    @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
    public com.google.android.exoplayer2.Timeline.Period getPeriod(int r13, com.google.android.exoplayer2.Timeline.Period r14, boolean r15) {
            r12 = this;
            com.google.android.exoplayer2.Timeline r0 = r12.timeline
            r0.getPeriod(r13, r14, r15)
            long r0 = r14.durationUs
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L14
            com.google.android.exoplayer2.source.ads.AdPlaybackState r13 = r12.adPlaybackState
            long r0 = r13.contentDurationUs
        L14:
            r6 = r0
            java.lang.Object r3 = r14.id
            java.lang.Object r4 = r14.uid
            int r5 = r14.windowIndex
            long r8 = r14.getPositionInWindowUs()
            com.google.android.exoplayer2.source.ads.AdPlaybackState r10 = r12.adPlaybackState
            boolean r11 = r14.isPlaceholder
            r2 = r14
            r2.set(r3, r4, r5, r6, r8, r10, r11)
            return r14
    }
}
