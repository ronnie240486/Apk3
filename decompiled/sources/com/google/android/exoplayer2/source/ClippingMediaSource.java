package com.google.android.exoplayer2.source;

/* JADX INFO: loaded from: classes3.dex */
public final class ClippingMediaSource extends com.google.android.exoplayer2.source.WrappingMediaSource {
    private final boolean allowDynamicClippingUpdates;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.source.ClippingMediaSource.IllegalClippingException clippingError;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.source.ClippingMediaSource.ClippingTimeline clippingTimeline;
    private final boolean enableInitialDiscontinuity;
    private final long endUs;
    private final java.util.ArrayList<com.google.android.exoplayer2.source.ClippingMediaPeriod> mediaPeriods;
    private long periodEndUs;
    private long periodStartUs;
    private final boolean relativeToDefaultPosition;
    private final long startUs;
    private final com.google.android.exoplayer2.Timeline.Window window;

    /* JADX INFO: loaded from: classes.dex */
    public static final class ClippingTimeline extends com.google.android.exoplayer2.source.ForwardingTimeline {
        private final long durationUs;
        private final long endUs;
        private final boolean isDynamic;
        private final long startUs;

        public ClippingTimeline(com.google.android.exoplayer2.Timeline r8, long r9, long r11) throws com.google.android.exoplayer2.source.ClippingMediaSource.IllegalClippingException {
                r7 = this;
                r7.<init>(r8)
                int r0 = r8.getPeriodCount()
                r1 = 0
                r2 = 1
                if (r0 != r2) goto L76
                com.google.android.exoplayer2.Timeline$Window r0 = new com.google.android.exoplayer2.Timeline$Window
                r0.<init>()
                com.google.android.exoplayer2.Timeline$Window r8 = r8.getWindow(r1, r0)
                r3 = 0
                long r9 = java.lang.Math.max(r3, r9)
                boolean r0 = r8.isPlaceholder
                if (r0 != 0) goto L2d
                int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
                if (r0 == 0) goto L2d
                boolean r0 = r8.isSeekable
                if (r0 == 0) goto L27
                goto L2d
            L27:
                com.google.android.exoplayer2.source.ClippingMediaSource$IllegalClippingException r8 = new com.google.android.exoplayer2.source.ClippingMediaSource$IllegalClippingException
                r8.<init>(r2)
                throw r8
            L2d:
                r5 = -9223372036854775808
                int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
                if (r0 != 0) goto L36
                long r11 = r8.durationUs
                goto L3a
            L36:
                long r11 = java.lang.Math.max(r3, r11)
            L3a:
                long r3 = r8.durationUs
                r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 == 0) goto L56
                int r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
                if (r0 <= 0) goto L4a
                r11 = r3
            L4a:
                int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r0 > 0) goto L4f
                goto L56
            L4f:
                com.google.android.exoplayer2.source.ClippingMediaSource$IllegalClippingException r8 = new com.google.android.exoplayer2.source.ClippingMediaSource$IllegalClippingException
                r9 = 2
                r8.<init>(r9)
                throw r8
            L56:
                r7.startUs = r9
                r7.endUs = r11
                int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
                if (r0 != 0) goto L60
                r9 = r5
                goto L62
            L60:
                long r9 = r11 - r9
            L62:
                r7.durationUs = r9
                boolean r8 = r8.isDynamic
                if (r8 == 0) goto L73
                if (r0 == 0) goto L72
                int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r8 == 0) goto L73
                int r8 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
                if (r8 != 0) goto L73
            L72:
                r1 = 1
            L73:
                r7.isDynamic = r1
                return
            L76:
                com.google.android.exoplayer2.source.ClippingMediaSource$IllegalClippingException r8 = new com.google.android.exoplayer2.source.ClippingMediaSource$IllegalClippingException
                r8.<init>(r1)
                throw r8
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public com.google.android.exoplayer2.Timeline.Period getPeriod(int r13, com.google.android.exoplayer2.Timeline.Period r14, boolean r15) {
                r12 = this;
                com.google.android.exoplayer2.Timeline r13 = r12.timeline
                r0 = 0
                r13.getPeriod(r0, r14, r15)
                long r0 = r14.getPositionInWindowUs()
                long r2 = r12.startUs
                long r10 = r0 - r2
                long r0 = r12.durationUs
                r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r13 != 0) goto L1b
                r8 = r2
                goto L1d
            L1b:
                long r0 = r0 - r10
                r8 = r0
            L1d:
                java.lang.Object r5 = r14.id
                java.lang.Object r6 = r14.uid
                r7 = 0
                r4 = r14
                com.google.android.exoplayer2.Timeline$Period r13 = r4.set(r5, r6, r7, r8, r10)
                return r13
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public com.google.android.exoplayer2.Timeline.Window getWindow(int r5, com.google.android.exoplayer2.Timeline.Window r6, long r7) {
                r4 = this;
                com.google.android.exoplayer2.Timeline r5 = r4.timeline
                r7 = 0
                r0 = 0
                r5.getWindow(r7, r6, r0)
                long r7 = r6.positionInFirstPeriodUs
                long r0 = r4.startUs
                long r7 = r7 + r0
                r6.positionInFirstPeriodUs = r7
                long r7 = r4.durationUs
                r6.durationUs = r7
                boolean r5 = r4.isDynamic
                r6.isDynamic = r5
                long r7 = r6.defaultPositionUs
                r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r5 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                if (r5 == 0) goto L38
                long r7 = java.lang.Math.max(r7, r0)
                r6.defaultPositionUs = r7
                long r0 = r4.endUs
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 != 0) goto L2f
                goto L33
            L2f:
                long r7 = java.lang.Math.min(r7, r0)
            L33:
                long r0 = r4.startUs
                long r7 = r7 - r0
                r6.defaultPositionUs = r7
            L38:
                long r7 = r4.startUs
                long r7 = com.google.android.exoplayer2.util.Util.usToMs(r7)
                long r0 = r6.presentationStartTimeMs
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 == 0) goto L47
                long r0 = r0 + r7
                r6.presentationStartTimeMs = r0
            L47:
                long r0 = r6.windowStartTimeMs
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 == 0) goto L50
                long r0 = r0 + r7
                r6.windowStartTimeMs = r0
            L50:
                return r6
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class IllegalClippingException extends java.io.IOException {
        public static final int REASON_INVALID_PERIOD_COUNT = 0;
        public static final int REASON_NOT_SEEKABLE_TO_START = 1;
        public static final int REASON_START_EXCEEDS_END = 2;
        public final int reason;

        /* JADX INFO: loaded from: classes2.dex */
        @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
        @java.lang.annotation.Documented
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface Reason {
        }

        public IllegalClippingException(int r3) {
                r2 = this;
                java.lang.String r0 = "Illegal clipping: "
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                java.lang.String r1 = getReasonDescription(r3)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                r2.reason = r3
                return
        }

        private static java.lang.String getReasonDescription(int r1) {
                if (r1 == 0) goto L13
                r0 = 1
                if (r1 == r0) goto L10
                r0 = 2
                if (r1 == r0) goto Lc
                java.lang.String r1 = "unknown"
                return r1
            Lc:
                java.lang.String r1 = "start exceeds end"
                return r1
            L10:
                java.lang.String r1 = "not seekable to start"
                return r1
            L13:
                java.lang.String r1 = "invalid period count"
                return r1
        }
    }

    public ClippingMediaSource(com.google.android.exoplayer2.source.MediaSource r10, long r11) {
            r9 = this;
            r2 = 0
            r6 = 1
            r7 = 0
            r8 = 1
            r0 = r9
            r1 = r10
            r4 = r11
            r0.<init>(r1, r2, r4, r6, r7, r8)
            return
    }

    public ClippingMediaSource(com.google.android.exoplayer2.source.MediaSource r10, long r11, long r13) {
            r9 = this;
            r6 = 1
            r7 = 0
            r8 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4, r6, r7, r8)
            return
    }

    public ClippingMediaSource(com.google.android.exoplayer2.source.MediaSource r3, long r4, long r6, boolean r8, boolean r9, boolean r10) {
            r2 = this;
            java.lang.Object r3 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
            com.google.android.exoplayer2.source.MediaSource r3 = (com.google.android.exoplayer2.source.MediaSource) r3
            r2.<init>(r3)
            r0 = 0
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 < 0) goto L11
            r3 = 1
            goto L12
        L11:
            r3 = 0
        L12:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r3)
            r2.startUs = r4
            r2.endUs = r6
            r2.enableInitialDiscontinuity = r8
            r2.allowDynamicClippingUpdates = r9
            r2.relativeToDefaultPosition = r10
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.mediaPeriods = r3
            com.google.android.exoplayer2.Timeline$Window r3 = new com.google.android.exoplayer2.Timeline$Window
            r3.<init>()
            r2.window = r3
            return
    }

    private void refreshClippedTimeline(com.google.android.exoplayer2.Timeline r16) {
            r15 = this;
            r1 = r15
            com.google.android.exoplayer2.Timeline$Window r0 = r1.window
            r2 = 0
            r4 = r16
            r4.getWindow(r2, r0)
            com.google.android.exoplayer2.Timeline$Window r0 = r1.window
            long r5 = r0.getPositionInFirstPeriodUs()
            com.google.android.exoplayer2.source.ClippingMediaSource$ClippingTimeline r0 = r1.clippingTimeline
            r7 = -9223372036854775808
            if (r0 == 0) goto L31
            java.util.ArrayList<com.google.android.exoplayer2.source.ClippingMediaPeriod> r0 = r1.mediaPeriods
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L31
            boolean r0 = r1.allowDynamicClippingUpdates
            if (r0 == 0) goto L22
            goto L31
        L22:
            long r9 = r1.periodStartUs
            long r9 = r9 - r5
            long r11 = r1.endUs
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r0 != 0) goto L2c
            goto L2f
        L2c:
            long r7 = r1.periodEndUs
            long r7 = r7 - r5
        L2f:
            r5 = r9
            goto L6d
        L31:
            long r9 = r1.startUs
            long r11 = r1.endUs
            boolean r0 = r1.relativeToDefaultPosition
            if (r0 == 0) goto L41
            com.google.android.exoplayer2.Timeline$Window r0 = r1.window
            long r13 = r0.getDefaultPositionUs()
            long r9 = r9 + r13
            long r11 = r11 + r13
        L41:
            long r13 = r5 + r9
            r1.periodStartUs = r13
            long r13 = r1.endUs
            int r0 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r0 != 0) goto L4c
            goto L4e
        L4c:
            long r7 = r5 + r11
        L4e:
            r1.periodEndUs = r7
            java.util.ArrayList<com.google.android.exoplayer2.source.ClippingMediaPeriod> r0 = r1.mediaPeriods
            int r0 = r0.size()
            r3 = 0
        L57:
            if (r3 >= r0) goto L6b
            java.util.ArrayList<com.google.android.exoplayer2.source.ClippingMediaPeriod> r5 = r1.mediaPeriods
            java.lang.Object r5 = r5.get(r3)
            com.google.android.exoplayer2.source.ClippingMediaPeriod r5 = (com.google.android.exoplayer2.source.ClippingMediaPeriod) r5
            long r6 = r1.periodStartUs
            long r13 = r1.periodEndUs
            r5.updateClipping(r6, r13)
            int r3 = r3 + 1
            goto L57
        L6b:
            r5 = r9
            r7 = r11
        L6d:
            com.google.android.exoplayer2.source.ClippingMediaSource$ClippingTimeline r0 = new com.google.android.exoplayer2.source.ClippingMediaSource$ClippingTimeline     // Catch: com.google.android.exoplayer2.source.ClippingMediaSource.IllegalClippingException -> L7b
            r3 = r0
            r4 = r16
            r3.<init>(r4, r5, r7)     // Catch: com.google.android.exoplayer2.source.ClippingMediaSource.IllegalClippingException -> L7b
            r1.clippingTimeline = r0     // Catch: com.google.android.exoplayer2.source.ClippingMediaSource.IllegalClippingException -> L7b
            r15.refreshSourceInfo(r0)
            return
        L7b:
            r0 = move-exception
            r1.clippingError = r0
        L7e:
            java.util.ArrayList<com.google.android.exoplayer2.source.ClippingMediaPeriod> r0 = r1.mediaPeriods
            int r0 = r0.size()
            if (r2 >= r0) goto L96
            java.util.ArrayList<com.google.android.exoplayer2.source.ClippingMediaPeriod> r0 = r1.mediaPeriods
            java.lang.Object r0 = r0.get(r2)
            com.google.android.exoplayer2.source.ClippingMediaPeriod r0 = (com.google.android.exoplayer2.source.ClippingMediaPeriod) r0
            com.google.android.exoplayer2.source.ClippingMediaSource$IllegalClippingException r3 = r1.clippingError
            r0.setClippingError(r3)
            int r2 = r2 + 1
            goto L7e
        L96:
            return
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource, com.google.android.exoplayer2.source.MediaSource
    public com.google.android.exoplayer2.source.MediaPeriod createPeriod(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r9, com.google.android.exoplayer2.upstream.Allocator r10, long r11) {
            r8 = this;
            com.google.android.exoplayer2.source.ClippingMediaPeriod r7 = new com.google.android.exoplayer2.source.ClippingMediaPeriod
            com.google.android.exoplayer2.source.MediaSource r0 = r8.mediaSource
            com.google.android.exoplayer2.source.MediaPeriod r1 = r0.createPeriod(r9, r10, r11)
            boolean r2 = r8.enableInitialDiscontinuity
            long r3 = r8.periodStartUs
            long r5 = r8.periodEndUs
            r0 = r7
            r0.<init>(r1, r2, r3, r5)
            java.util.ArrayList<com.google.android.exoplayer2.source.ClippingMediaPeriod> r9 = r8.mediaPeriods
            r9.add(r7)
            return r7
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws java.io.IOException {
            r1 = this;
            com.google.android.exoplayer2.source.ClippingMediaSource$IllegalClippingException r0 = r1.clippingError
            if (r0 != 0) goto L8
            super.maybeThrowSourceInfoRefreshError()
            return
        L8:
            throw r0
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource
    public final void onChildSourceInfoRefreshed(com.google.android.exoplayer2.Timeline r2) {
            r1 = this;
            com.google.android.exoplayer2.source.ClippingMediaSource$IllegalClippingException r0 = r1.clippingError
            if (r0 == 0) goto L5
            return
        L5:
            r1.refreshClippedTimeline(r2)
            return
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource, com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(com.google.android.exoplayer2.source.MediaPeriod r2) {
            r1 = this;
            java.util.ArrayList<com.google.android.exoplayer2.source.ClippingMediaPeriod> r0 = r1.mediaPeriods
            boolean r0 = r0.remove(r2)
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            com.google.android.exoplayer2.source.MediaSource r0 = r1.mediaSource
            com.google.android.exoplayer2.source.ClippingMediaPeriod r2 = (com.google.android.exoplayer2.source.ClippingMediaPeriod) r2
            com.google.android.exoplayer2.source.MediaPeriod r2 = r2.mediaPeriod
            r0.releasePeriod(r2)
            java.util.ArrayList<com.google.android.exoplayer2.source.ClippingMediaPeriod> r2 = r1.mediaPeriods
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L2b
            boolean r2 = r1.allowDynamicClippingUpdates
            if (r2 != 0) goto L2b
            com.google.android.exoplayer2.source.ClippingMediaSource$ClippingTimeline r2 = r1.clippingTimeline
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            com.google.android.exoplayer2.source.ClippingMediaSource$ClippingTimeline r2 = (com.google.android.exoplayer2.source.ClippingMediaSource.ClippingTimeline) r2
            com.google.android.exoplayer2.Timeline r2 = r2.timeline
            r1.refreshClippedTimeline(r2)
        L2b:
            return
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public final void releaseSourceInternal() {
            r1 = this;
            super.releaseSourceInternal()
            r0 = 0
            r1.clippingError = r0
            r1.clippingTimeline = r0
            return
    }
}
