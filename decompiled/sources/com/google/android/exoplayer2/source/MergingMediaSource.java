package com.google.android.exoplayer2.source;

/* JADX INFO: loaded from: classes2.dex */
public final class MergingMediaSource extends com.google.android.exoplayer2.source.CompositeMediaSource<java.lang.Integer> {
    private static final int PERIOD_COUNT_UNSET = -1;
    private static final com.google.android.exoplayer2.MediaItem PLACEHOLDER_MEDIA_ITEM = null;
    private final boolean adjustPeriodTimeOffsets;
    private final boolean clipDurations;
    private final java.util.Map<java.lang.Object, java.lang.Long> clippedDurationsUs;
    private final com.google.common.collect.Multimap<java.lang.Object, com.google.android.exoplayer2.source.ClippingMediaPeriod> clippedMediaPeriods;
    private final com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private final com.google.android.exoplayer2.source.MediaSource[] mediaSources;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.source.MergingMediaSource.IllegalMergeException mergeError;
    private final java.util.ArrayList<com.google.android.exoplayer2.source.MediaSource> pendingTimelineSources;
    private int periodCount;
    private long[][] periodTimeOffsetsUs;
    private final com.google.android.exoplayer2.Timeline[] timelines;

    /* JADX INFO: loaded from: classes.dex */
    public static final class ClippedTimeline extends com.google.android.exoplayer2.source.ForwardingTimeline {
        private final long[] periodDurationsUs;
        private final long[] windowDurationsUs;

        public ClippedTimeline(com.google.android.exoplayer2.Timeline r13, java.util.Map<java.lang.Object, java.lang.Long> r14) {
                r12 = this;
                r12.<init>(r13)
                int r0 = r13.getWindowCount()
                int r1 = r13.getWindowCount()
                long[] r1 = new long[r1]
                r12.windowDurationsUs = r1
                com.google.android.exoplayer2.Timeline$Window r1 = new com.google.android.exoplayer2.Timeline$Window
                r1.<init>()
                r2 = 0
                r3 = 0
            L16:
                if (r3 >= r0) goto L25
                long[] r4 = r12.windowDurationsUs
                com.google.android.exoplayer2.Timeline$Window r5 = r13.getWindow(r3, r1)
                long r5 = r5.durationUs
                r4[r3] = r5
                int r3 = r3 + 1
                goto L16
            L25:
                int r0 = r13.getPeriodCount()
                long[] r1 = new long[r0]
                r12.periodDurationsUs = r1
                com.google.android.exoplayer2.Timeline$Period r1 = new com.google.android.exoplayer2.Timeline$Period
                r1.<init>()
            L32:
                if (r2 >= r0) goto L71
                r3 = 1
                r13.getPeriod(r2, r1, r3)
                java.lang.Object r3 = r1.uid
                java.lang.Object r3 = r14.get(r3)
                java.lang.Long r3 = (java.lang.Long) r3
                java.lang.Object r3 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
                java.lang.Long r3 = (java.lang.Long) r3
                long r3 = r3.longValue()
                long[] r5 = r12.periodDurationsUs
                r6 = -9223372036854775808
                int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                if (r8 == 0) goto L53
                goto L55
            L53:
                long r3 = r1.durationUs
            L55:
                r5[r2] = r3
                long r3 = r1.durationUs
                r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                if (r8 == 0) goto L6e
                long[] r6 = r12.windowDurationsUs
                int r7 = r1.windowIndex
                r8 = r6[r7]
                r10 = r5[r2]
                long r3 = r3 - r10
                long r8 = r8 - r3
                r6[r7] = r8
            L6e:
                int r2 = r2 + 1
                goto L32
            L71:
                return
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public com.google.android.exoplayer2.Timeline.Period getPeriod(int r3, com.google.android.exoplayer2.Timeline.Period r4, boolean r5) {
                r2 = this;
                super.getPeriod(r3, r4, r5)
                long[] r5 = r2.periodDurationsUs
                r0 = r5[r3]
                r4.durationUs = r0
                return r4
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public com.google.android.exoplayer2.Timeline.Window getWindow(int r5, com.google.android.exoplayer2.Timeline.Window r6, long r7) {
                r4 = this;
                super.getWindow(r5, r6, r7)
                long[] r7 = r4.windowDurationsUs
                r0 = r7[r5]
                r6.durationUs = r0
                r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
                if (r5 == 0) goto L1e
                long r2 = r6.defaultPositionUs
                int r5 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r5 != 0) goto L19
                goto L1e
            L19:
                long r7 = java.lang.Math.min(r2, r0)
                goto L20
            L1e:
                long r7 = r6.defaultPositionUs
            L20:
                r6.defaultPositionUs = r7
                return r6
        }
    }

    public static final class IllegalMergeException extends java.io.IOException {
        public static final int REASON_PERIOD_COUNT_MISMATCH = 0;
        public final int reason;

        @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
        @java.lang.annotation.Documented
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface Reason {
        }

        public IllegalMergeException(int r1) {
                r0 = this;
                r0.<init>()
                r0.reason = r1
                return
        }
    }

    static {
            com.google.android.exoplayer2.MediaItem$Builder r0 = new com.google.android.exoplayer2.MediaItem$Builder
            r0.<init>()
            java.lang.String r1 = "MergingMediaSource"
            com.google.android.exoplayer2.MediaItem$Builder r0 = r0.setMediaId(r1)
            com.google.android.exoplayer2.MediaItem r0 = r0.build()
            com.google.android.exoplayer2.source.MergingMediaSource.PLACEHOLDER_MEDIA_ITEM = r0
            return
    }

    public MergingMediaSource(boolean r1, boolean r2, com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory r3, com.google.android.exoplayer2.source.MediaSource... r4) {
            r0 = this;
            r0.<init>()
            r0.adjustPeriodTimeOffsets = r1
            r0.clipDurations = r2
            r0.mediaSources = r4
            r0.compositeSequenceableLoaderFactory = r3
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.List r2 = java.util.Arrays.asList(r4)
            r1.<init>(r2)
            r0.pendingTimelineSources = r1
            r1 = -1
            r0.periodCount = r1
            int r1 = r4.length
            com.google.android.exoplayer2.Timeline[] r1 = new com.google.android.exoplayer2.Timeline[r1]
            r0.timelines = r1
            r1 = 0
            long[][] r1 = new long[r1][]
            r0.periodTimeOffsetsUs = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.clippedDurationsUs = r1
            com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys r1 = com.google.common.collect.MultimapBuilder.hashKeys()
            com.google.common.collect.MultimapBuilder$ListMultimapBuilder r1 = r1.arrayListValues()
            com.google.common.collect.ListMultimap r1 = r1.build()
            r0.clippedMediaPeriods = r1
            return
    }

    public MergingMediaSource(boolean r2, boolean r3, com.google.android.exoplayer2.source.MediaSource... r4) {
            r1 = this;
            com.google.android.exoplayer2.source.DefaultCompositeSequenceableLoaderFactory r0 = new com.google.android.exoplayer2.source.DefaultCompositeSequenceableLoaderFactory
            r0.<init>()
            r1.<init>(r2, r3, r0, r4)
            return
    }

    public MergingMediaSource(boolean r2, com.google.android.exoplayer2.source.MediaSource... r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r3)
            return
    }

    public MergingMediaSource(com.google.android.exoplayer2.source.MediaSource... r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2)
            return
    }

    private void computePeriodTimeOffsets() {
            r9 = this;
            com.google.android.exoplayer2.Timeline$Period r0 = new com.google.android.exoplayer2.Timeline$Period
            r0.<init>()
            r1 = 0
            r2 = 0
        L7:
            int r3 = r9.periodCount
            if (r2 >= r3) goto L37
            com.google.android.exoplayer2.Timeline[] r3 = r9.timelines
            r3 = r3[r1]
            com.google.android.exoplayer2.Timeline$Period r3 = r3.getPeriod(r2, r0)
            long r3 = r3.getPositionInWindowUs()
            long r3 = -r3
            r5 = 1
        L19:
            com.google.android.exoplayer2.Timeline[] r6 = r9.timelines
            int r7 = r6.length
            if (r5 >= r7) goto L34
            r6 = r6[r5]
            com.google.android.exoplayer2.Timeline$Period r6 = r6.getPeriod(r2, r0)
            long r6 = r6.getPositionInWindowUs()
            long r6 = -r6
            long[][] r8 = r9.periodTimeOffsetsUs
            r8 = r8[r2]
            long r6 = r3 - r6
            r8[r5] = r6
            int r5 = r5 + 1
            goto L19
        L34:
            int r2 = r2 + 1
            goto L7
        L37:
            return
    }

    private void updateClippedDuration() {
            r13 = this;
            com.google.android.exoplayer2.Timeline$Period r0 = new com.google.android.exoplayer2.Timeline$Period
            r0.<init>()
            r1 = 0
            r2 = 0
        L7:
            int r3 = r13.periodCount
            if (r2 >= r3) goto L69
            r3 = -9223372036854775808
            r6 = r3
            r5 = 0
        Lf:
            com.google.android.exoplayer2.Timeline[] r8 = r13.timelines
            int r9 = r8.length
            if (r5 >= r9) goto L3b
            r8 = r8[r5]
            com.google.android.exoplayer2.Timeline$Period r8 = r8.getPeriod(r2, r0)
            long r8 = r8.getDurationUs()
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L28
            goto L38
        L28:
            long[][] r10 = r13.periodTimeOffsetsUs
            r10 = r10[r2]
            r11 = r10[r5]
            long r8 = r8 + r11
            int r10 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r10 == 0) goto L37
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 >= 0) goto L38
        L37:
            r6 = r8
        L38:
            int r5 = r5 + 1
            goto Lf
        L3b:
            r3 = r8[r1]
            java.lang.Object r3 = r3.getUidOfPeriod(r2)
            java.util.Map<java.lang.Object, java.lang.Long> r4 = r13.clippedDurationsUs
            java.lang.Long r5 = java.lang.Long.valueOf(r6)
            r4.put(r3, r5)
            com.google.common.collect.Multimap<java.lang.Object, com.google.android.exoplayer2.source.ClippingMediaPeriod> r4 = r13.clippedMediaPeriods
            java.util.Collection r3 = r4.get(r3)
            java.util.Iterator r3 = r3.iterator()
        L54:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L66
            java.lang.Object r4 = r3.next()
            com.google.android.exoplayer2.source.ClippingMediaPeriod r4 = (com.google.android.exoplayer2.source.ClippingMediaPeriod) r4
            r8 = 0
            r4.updateClipping(r8, r6)
            goto L54
        L66:
            int r2 = r2 + 1
            goto L7
        L69:
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public com.google.android.exoplayer2.source.MediaPeriod createPeriod(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r12, com.google.android.exoplayer2.upstream.Allocator r13, long r14) {
            r11 = this;
            com.google.android.exoplayer2.source.MediaSource[] r0 = r11.mediaSources
            int r0 = r0.length
            com.google.android.exoplayer2.source.MediaPeriod[] r1 = new com.google.android.exoplayer2.source.MediaPeriod[r0]
            com.google.android.exoplayer2.Timeline[] r2 = r11.timelines
            r3 = 0
            r2 = r2[r3]
            java.lang.Object r4 = r12.periodUid
            int r2 = r2.getIndexOfPeriod(r4)
        L10:
            if (r3 >= r0) goto L33
            com.google.android.exoplayer2.Timeline[] r4 = r11.timelines
            r4 = r4[r3]
            java.lang.Object r4 = r4.getUidOfPeriod(r2)
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r4 = r12.copyWithPeriodUid(r4)
            com.google.android.exoplayer2.source.MediaSource[] r5 = r11.mediaSources
            r5 = r5[r3]
            long[][] r6 = r11.periodTimeOffsetsUs
            r6 = r6[r2]
            r7 = r6[r3]
            long r6 = r14 - r7
            com.google.android.exoplayer2.source.MediaPeriod r4 = r5.createPeriod(r4, r13, r6)
            r1[r3] = r4
            int r3 = r3 + 1
            goto L10
        L33:
            com.google.android.exoplayer2.source.MergingMediaPeriod r5 = new com.google.android.exoplayer2.source.MergingMediaPeriod
            com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory r13 = r11.compositeSequenceableLoaderFactory
            long[][] r14 = r11.periodTimeOffsetsUs
            r14 = r14[r2]
            r5.<init>(r13, r14, r1)
            boolean r13 = r11.clipDurations
            if (r13 == 0) goto L67
            com.google.android.exoplayer2.source.ClippingMediaPeriod r13 = new com.google.android.exoplayer2.source.ClippingMediaPeriod
            r6 = 1
            r7 = 0
            java.util.Map<java.lang.Object, java.lang.Long> r14 = r11.clippedDurationsUs
            java.lang.Object r15 = r12.periodUid
            java.lang.Object r14 = r14.get(r15)
            java.lang.Long r14 = (java.lang.Long) r14
            java.lang.Object r14 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r14)
            java.lang.Long r14 = (java.lang.Long) r14
            long r9 = r14.longValue()
            r4 = r13
            r4.<init>(r5, r6, r7, r9)
            com.google.common.collect.Multimap<java.lang.Object, com.google.android.exoplayer2.source.ClippingMediaPeriod> r14 = r11.clippedMediaPeriods
            java.lang.Object r12 = r12.periodUid
            r14.put(r12, r13)
            r5 = r13
        L67:
            return r5
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public com.google.android.exoplayer2.MediaItem getMediaItem() {
            r2 = this;
            com.google.android.exoplayer2.source.MediaSource[] r0 = r2.mediaSources
            int r1 = r0.length
            if (r1 <= 0) goto Ld
            r1 = 0
            r0 = r0[r1]
            com.google.android.exoplayer2.MediaItem r0 = r0.getMediaItem()
            goto Lf
        Ld:
            com.google.android.exoplayer2.MediaItem r0 = com.google.android.exoplayer2.source.MergingMediaSource.PLACEHOLDER_MEDIA_ITEM
        Lf:
            return r0
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    @androidx.annotation.Nullable
    public final com.google.android.exoplayer2.source.MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(java.lang.Integer r1, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2) {
            r0 = this;
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 != 0) goto L9
            goto La
        L9:
            r2 = 0
        La:
            return r2
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws java.io.IOException {
            r1 = this;
            com.google.android.exoplayer2.source.MergingMediaSource$IllegalMergeException r0 = r1.mergeError
            if (r0 != 0) goto L8
            super.maybeThrowSourceInfoRefreshError()
            return
        L8:
            throw r0
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public final void onChildSourceInfoRefreshed(java.lang.Integer r6, com.google.android.exoplayer2.source.MediaSource r7, com.google.android.exoplayer2.Timeline r8) {
            r5 = this;
            java.lang.Integer r6 = (java.lang.Integer) r6
            com.google.android.exoplayer2.source.MergingMediaSource$IllegalMergeException r0 = r5.mergeError
            if (r0 == 0) goto L7
            goto L72
        L7:
            int r0 = r5.periodCount
            r1 = -1
            r2 = 0
            if (r0 != r1) goto L14
            int r0 = r8.getPeriodCount()
            r5.periodCount = r0
            goto L24
        L14:
            int r0 = r8.getPeriodCount()
            int r1 = r5.periodCount
            if (r0 == r1) goto L24
            com.google.android.exoplayer2.source.MergingMediaSource$IllegalMergeException r6 = new com.google.android.exoplayer2.source.MergingMediaSource$IllegalMergeException
            r6.<init>(r2)
            r5.mergeError = r6
            goto L72
        L24:
            long[][] r0 = r5.periodTimeOffsetsUs
            int r0 = r0.length
            if (r0 != 0) goto L40
            int r0 = r5.periodCount
            com.google.android.exoplayer2.Timeline[] r1 = r5.timelines
            int r1 = r1.length
            r3 = 2
            int[] r3 = new int[r3]
            r4 = 1
            r3[r4] = r1
            r3[r2] = r0
            java.lang.Class<long> r0 = long.class
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r3)
            long[][] r0 = (long[][]) r0
            r5.periodTimeOffsetsUs = r0
        L40:
            java.util.ArrayList<com.google.android.exoplayer2.source.MediaSource> r0 = r5.pendingTimelineSources
            r0.remove(r7)
            com.google.android.exoplayer2.Timeline[] r7 = r5.timelines
            int r6 = r6.intValue()
            r7[r6] = r8
            java.util.ArrayList<com.google.android.exoplayer2.source.MediaSource> r6 = r5.pendingTimelineSources
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L72
            boolean r6 = r5.adjustPeriodTimeOffsets
            if (r6 == 0) goto L5c
            r5.computePeriodTimeOffsets()
        L5c:
            com.google.android.exoplayer2.Timeline[] r6 = r5.timelines
            r6 = r6[r2]
            boolean r7 = r5.clipDurations
            if (r7 == 0) goto L6f
            r5.updateClippedDuration()
            com.google.android.exoplayer2.source.MergingMediaSource$ClippedTimeline r7 = new com.google.android.exoplayer2.source.MergingMediaSource$ClippedTimeline
            java.util.Map<java.lang.Object, java.lang.Long> r8 = r5.clippedDurationsUs
            r7.<init>(r6, r8)
            r6 = r7
        L6f:
            r5.refreshSourceInfo(r6)
        L72:
            return
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public final void prepareSourceInternal(@androidx.annotation.Nullable com.google.android.exoplayer2.upstream.TransferListener r3) {
            r2 = this;
            super.prepareSourceInternal(r3)
            r3 = 0
        L4:
            com.google.android.exoplayer2.source.MediaSource[] r0 = r2.mediaSources
            int r0 = r0.length
            if (r3 >= r0) goto L17
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            com.google.android.exoplayer2.source.MediaSource[] r1 = r2.mediaSources
            r1 = r1[r3]
            r2.prepareChildSource(r0, r1)
            int r3 = r3 + 1
            goto L4
        L17:
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(com.google.android.exoplayer2.source.MediaPeriod r4) {
            r3 = this;
            boolean r0 = r3.clipDurations
            if (r0 == 0) goto L37
            com.google.android.exoplayer2.source.ClippingMediaPeriod r4 = (com.google.android.exoplayer2.source.ClippingMediaPeriod) r4
            com.google.common.collect.Multimap<java.lang.Object, com.google.android.exoplayer2.source.ClippingMediaPeriod> r0 = r3.clippedMediaPeriods
            java.util.Collection r0 = r0.entries()
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L35
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            com.google.android.exoplayer2.source.ClippingMediaPeriod r2 = (com.google.android.exoplayer2.source.ClippingMediaPeriod) r2
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L10
            com.google.common.collect.Multimap<java.lang.Object, com.google.android.exoplayer2.source.ClippingMediaPeriod> r0 = r3.clippedMediaPeriods
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            r0.remove(r2, r1)
        L35:
            com.google.android.exoplayer2.source.MediaPeriod r4 = r4.mediaPeriod
        L37:
            com.google.android.exoplayer2.source.MergingMediaPeriod r4 = (com.google.android.exoplayer2.source.MergingMediaPeriod) r4
            r0 = 0
        L3a:
            com.google.android.exoplayer2.source.MediaSource[] r1 = r3.mediaSources
            int r2 = r1.length
            if (r0 >= r2) goto L4b
            r1 = r1[r0]
            com.google.android.exoplayer2.source.MediaPeriod r2 = r4.getChildPeriod(r0)
            r1.releasePeriod(r2)
            int r0 = r0 + 1
            goto L3a
        L4b:
            return
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public final void releaseSourceInternal() {
            r2 = this;
            super.releaseSourceInternal()
            com.google.android.exoplayer2.Timeline[] r0 = r2.timelines
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            r0 = -1
            r2.periodCount = r0
            r2.mergeError = r1
            java.util.ArrayList<com.google.android.exoplayer2.source.MediaSource> r0 = r2.pendingTimelineSources
            r0.clear()
            java.util.ArrayList<com.google.android.exoplayer2.source.MediaSource> r0 = r2.pendingTimelineSources
            com.google.android.exoplayer2.source.MediaSource[] r1 = r2.mediaSources
            java.util.Collections.addAll(r0, r1)
            return
    }
}
