package com.google.android.exoplayer2.source;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public final class LoopingMediaSource extends com.google.android.exoplayer2.source.WrappingMediaSource {
    private final java.util.Map<com.google.android.exoplayer2.source.MediaSource.MediaPeriodId, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId> childMediaPeriodIdToMediaPeriodId;
    private final int loopCount;
    private final java.util.Map<com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId> mediaPeriodToChildMediaPeriodId;

    public static final class InfinitelyLoopingTimeline extends com.google.android.exoplayer2.source.ForwardingTimeline {
        public InfinitelyLoopingTimeline(com.google.android.exoplayer2.Timeline r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public int getNextWindowIndex(int r2, int r3, boolean r4) {
                r1 = this;
                com.google.android.exoplayer2.Timeline r0 = r1.timeline
                int r2 = r0.getNextWindowIndex(r2, r3, r4)
                r3 = -1
                if (r2 != r3) goto Ld
                int r2 = r1.getFirstWindowIndex(r4)
            Ld:
                return r2
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public int getPreviousWindowIndex(int r2, int r3, boolean r4) {
                r1 = this;
                com.google.android.exoplayer2.Timeline r0 = r1.timeline
                int r2 = r0.getPreviousWindowIndex(r2, r3, r4)
                r3 = -1
                if (r2 != r3) goto Ld
                int r2 = r1.getLastWindowIndex(r4)
            Ld:
                return r2
        }
    }

    public static final class LoopingTimeline extends com.google.android.exoplayer2.AbstractConcatenatedTimeline {
        private final int childPeriodCount;
        private final com.google.android.exoplayer2.Timeline childTimeline;
        private final int childWindowCount;
        private final int loopCount;

        public LoopingTimeline(com.google.android.exoplayer2.Timeline r3, int r4) {
                r2 = this;
                com.google.android.exoplayer2.source.ShuffleOrder$UnshuffledShuffleOrder r0 = new com.google.android.exoplayer2.source.ShuffleOrder$UnshuffledShuffleOrder
                r0.<init>(r4)
                r1 = 0
                r2.<init>(r1, r0)
                r2.childTimeline = r3
                int r0 = r3.getPeriodCount()
                r2.childPeriodCount = r0
                int r3 = r3.getWindowCount()
                r2.childWindowCount = r3
                r2.loopCount = r4
                if (r0 <= 0) goto L27
                r3 = 2147483647(0x7fffffff, float:NaN)
                int r3 = r3 / r0
                if (r4 > r3) goto L22
                r1 = 1
            L22:
                java.lang.String r3 = "LoopingMediaSource contains too many periods"
                com.google.android.exoplayer2.util.Assertions.checkState(r1, r3)
            L27:
                return
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public final int getChildIndexByChildUid(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.Integer
                if (r0 != 0) goto L6
                r2 = -1
                return r2
            L6:
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                return r2
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public final int getChildIndexByPeriodIndex(int r2) {
                r1 = this;
                int r0 = r1.childPeriodCount
                int r2 = r2 / r0
                return r2
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public final int getChildIndexByWindowIndex(int r2) {
                r1 = this;
                int r0 = r1.childWindowCount
                int r2 = r2 / r0
                return r2
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public final java.lang.Object getChildUidByChildIndex(int r1) {
                r0 = this;
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                return r1
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public final int getFirstPeriodIndexByChildIndex(int r2) {
                r1 = this;
                int r0 = r1.childPeriodCount
                int r2 = r2 * r0
                return r2
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public final int getFirstWindowIndexByChildIndex(int r2) {
                r1 = this;
                int r0 = r1.childWindowCount
                int r2 = r2 * r0
                return r2
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPeriodCount() {
                r2 = this;
                int r0 = r2.childPeriodCount
                int r1 = r2.loopCount
                int r0 = r0 * r1
                return r0
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public final com.google.android.exoplayer2.Timeline getTimelineByChildIndex(int r1) {
                r0 = this;
                com.google.android.exoplayer2.Timeline r1 = r0.childTimeline
                return r1
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getWindowCount() {
                r2 = this;
                int r0 = r2.childWindowCount
                int r1 = r2.loopCount
                int r0 = r0 * r1
                return r0
        }
    }

    public LoopingMediaSource(com.google.android.exoplayer2.source.MediaSource r2) {
            r1 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.<init>(r2, r0)
            return
    }

    public LoopingMediaSource(com.google.android.exoplayer2.source.MediaSource r3, int r4) {
            r2 = this;
            com.google.android.exoplayer2.source.MaskingMediaSource r0 = new com.google.android.exoplayer2.source.MaskingMediaSource
            r1 = 0
            r0.<init>(r3, r1)
            r2.<init>(r0)
            if (r4 <= 0) goto Lc
            r1 = 1
        Lc:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r1)
            r2.loopCount = r4
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r2.childMediaPeriodIdToMediaPeriodId = r3
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r2.mediaPeriodToChildMediaPeriodId = r3
            return
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource, com.google.android.exoplayer2.source.MediaSource
    public com.google.android.exoplayer2.source.MediaPeriod createPeriod(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r3, com.google.android.exoplayer2.upstream.Allocator r4, long r5) {
            r2 = this;
            int r0 = r2.loopCount
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != r1) goto Le
            com.google.android.exoplayer2.source.MediaSource r0 = r2.mediaSource
            com.google.android.exoplayer2.source.MediaPeriod r3 = r0.createPeriod(r3, r4, r5)
            return r3
        Le:
            java.lang.Object r0 = r3.periodUid
            java.lang.Object r0 = com.google.android.exoplayer2.AbstractConcatenatedTimeline.getChildPeriodUidFromConcatenatedUid(r0)
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r3.copyWithPeriodUid(r0)
            java.util.Map<com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, com.google.android.exoplayer2.source.MediaSource$MediaPeriodId> r1 = r2.childMediaPeriodIdToMediaPeriodId
            r1.put(r0, r3)
            com.google.android.exoplayer2.source.MediaSource r3 = r2.mediaSource
            com.google.android.exoplayer2.source.MediaPeriod r3 = r3.createPeriod(r0, r4, r5)
            java.util.Map<com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.MediaSource$MediaPeriodId> r4 = r2.mediaPeriodToChildMediaPeriodId
            r4.put(r3, r0)
            return r3
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource, com.google.android.exoplayer2.source.BaseMediaSource, com.google.android.exoplayer2.source.MediaSource
    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.Timeline getInitialTimeline() {
            r3 = this;
            com.google.android.exoplayer2.source.MediaSource r0 = r3.mediaSource
            com.google.android.exoplayer2.source.MaskingMediaSource r0 = (com.google.android.exoplayer2.source.MaskingMediaSource) r0
            int r1 = r3.loopCount
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r2) goto L17
            com.google.android.exoplayer2.source.LoopingMediaSource$LoopingTimeline r1 = new com.google.android.exoplayer2.source.LoopingMediaSource$LoopingTimeline
            com.google.android.exoplayer2.Timeline r0 = r0.getTimeline()
            int r2 = r3.loopCount
            r1.<init>(r0, r2)
            goto L20
        L17:
            com.google.android.exoplayer2.source.LoopingMediaSource$InfinitelyLoopingTimeline r1 = new com.google.android.exoplayer2.source.LoopingMediaSource$InfinitelyLoopingTimeline
            com.google.android.exoplayer2.Timeline r0 = r0.getTimeline()
            r1.<init>(r0)
        L20:
            return r1
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource
    @androidx.annotation.Nullable
    public final com.google.android.exoplayer2.source.MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r3) {
            r2 = this;
            int r0 = r2.loopCount
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto Lf
            java.util.Map<com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, com.google.android.exoplayer2.source.MediaSource$MediaPeriodId> r0 = r2.childMediaPeriodIdToMediaPeriodId
            java.lang.Object r3 = r0.get(r3)
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = (com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) r3
        Lf:
            return r3
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource, com.google.android.exoplayer2.source.BaseMediaSource, com.google.android.exoplayer2.source.MediaSource
    public boolean isSingleWindow() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource
    public final void onChildSourceInfoRefreshed(com.google.android.exoplayer2.Timeline r3) {
            r2 = this;
            int r0 = r2.loopCount
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto Lf
            com.google.android.exoplayer2.source.LoopingMediaSource$LoopingTimeline r0 = new com.google.android.exoplayer2.source.LoopingMediaSource$LoopingTimeline
            int r1 = r2.loopCount
            r0.<init>(r3, r1)
            goto L14
        Lf:
            com.google.android.exoplayer2.source.LoopingMediaSource$InfinitelyLoopingTimeline r0 = new com.google.android.exoplayer2.source.LoopingMediaSource$InfinitelyLoopingTimeline
            r0.<init>(r3)
        L14:
            r2.refreshSourceInfo(r0)
            return
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource, com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(com.google.android.exoplayer2.source.MediaPeriod r2) {
            r1 = this;
            com.google.android.exoplayer2.source.MediaSource r0 = r1.mediaSource
            r0.releasePeriod(r2)
            java.util.Map<com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.MediaSource$MediaPeriodId> r0 = r1.mediaPeriodToChildMediaPeriodId
            java.lang.Object r2 = r0.remove(r2)
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = (com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) r2
            if (r2 == 0) goto L14
            java.util.Map<com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, com.google.android.exoplayer2.source.MediaSource$MediaPeriodId> r0 = r1.childMediaPeriodIdToMediaPeriodId
            r0.remove(r2)
        L14:
            return
    }
}
