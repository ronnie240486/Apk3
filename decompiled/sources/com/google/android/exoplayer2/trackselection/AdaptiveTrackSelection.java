package com.google.android.exoplayer2.trackselection;

/* JADX INFO: loaded from: classes.dex */
public class AdaptiveTrackSelection extends com.google.android.exoplayer2.trackselection.BaseTrackSelection {
    public static final float DEFAULT_BANDWIDTH_FRACTION = 0.7f;
    public static final float DEFAULT_BUFFERED_FRACTION_TO_LIVE_EDGE_FOR_QUALITY_INCREASE = 0.75f;
    public static final int DEFAULT_MAX_DURATION_FOR_QUALITY_DECREASE_MS = 25000;
    public static final int DEFAULT_MAX_HEIGHT_TO_DISCARD = 719;
    public static final int DEFAULT_MAX_WIDTH_TO_DISCARD = 1279;
    public static final int DEFAULT_MIN_DURATION_FOR_QUALITY_INCREASE_MS = 10000;
    public static final int DEFAULT_MIN_DURATION_TO_RETAIN_AFTER_DISCARD_MS = 25000;
    private static final long MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS = 1000;
    private static final java.lang.String TAG = "AdaptiveTrackSelection";
    private final com.google.common.collect.ImmutableList<com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection.AdaptationCheckpoint> adaptationCheckpoints;
    private final float bandwidthFraction;
    private final com.google.android.exoplayer2.upstream.BandwidthMeter bandwidthMeter;
    private final float bufferedFractionToLiveEdgeForQualityIncrease;
    private final com.google.android.exoplayer2.util.Clock clock;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.source.chunk.MediaChunk lastBufferEvaluationMediaChunk;
    private long lastBufferEvaluationMs;
    private final long maxDurationForQualityDecreaseUs;
    private final int maxHeightToDiscard;
    private final int maxWidthToDiscard;
    private final long minDurationForQualityIncreaseUs;
    private final long minDurationToRetainAfterDiscardUs;
    private float playbackSpeed;
    private int reason;
    private int selectedIndex;

    public static final class AdaptationCheckpoint {
        public final long allocatedBandwidth;
        public final long totalBandwidth;

        public AdaptationCheckpoint(long r1, long r3) {
                r0 = this;
                r0.<init>()
                r0.totalBandwidth = r1
                r0.allocatedBandwidth = r3
                return
        }

        public boolean equals(@androidx.annotation.Nullable java.lang.Object r8) {
                r7 = this;
                r0 = 1
                if (r7 != r8) goto L4
                return r0
            L4:
                boolean r1 = r8 instanceof com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection.AdaptationCheckpoint
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint r8 = (com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection.AdaptationCheckpoint) r8
                long r3 = r7.totalBandwidth
                long r5 = r8.totalBandwidth
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 != 0) goto L1d
                long r3 = r7.allocatedBandwidth
                long r5 = r8.allocatedBandwidth
                int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r8 != 0) goto L1d
                goto L1e
            L1d:
                r0 = 0
            L1e:
                return r0
        }

        public int hashCode() {
                r4 = this;
                long r0 = r4.totalBandwidth
                int r1 = (int) r0
                int r1 = r1 * 31
                long r2 = r4.allocatedBandwidth
                int r0 = (int) r2
                int r1 = r1 + r0
                return r1
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class Factory implements com.google.android.exoplayer2.trackselection.ExoTrackSelection.Factory {
        private final float bandwidthFraction;
        private final float bufferedFractionToLiveEdgeForQualityIncrease;
        private final com.google.android.exoplayer2.util.Clock clock;
        private final int maxDurationForQualityDecreaseMs;
        private final int maxHeightToDiscard;
        private final int maxWidthToDiscard;
        private final int minDurationForQualityIncreaseMs;
        private final int minDurationToRetainAfterDiscardMs;

        public Factory() {
                r3 = this;
                r0 = 10000(0x2710, float:1.4013E-41)
                r1 = 25000(0x61a8, float:3.5032E-41)
                r2 = 1060320051(0x3f333333, float:0.7)
                r3.<init>(r0, r1, r1, r2)
                return
        }

        public Factory(int r10, int r11, int r12, float r13) {
                r9 = this;
                com.google.android.exoplayer2.util.Clock r8 = com.google.android.exoplayer2.util.Clock.DEFAULT
                r4 = 1279(0x4ff, float:1.792E-42)
                r5 = 719(0x2cf, float:1.008E-42)
                r7 = 1061158912(0x3f400000, float:0.75)
                r0 = r9
                r1 = r10
                r2 = r11
                r3 = r12
                r6 = r13
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return
        }

        public Factory(int r10, int r11, int r12, float r13, float r14, com.google.android.exoplayer2.util.Clock r15) {
                r9 = this;
                r4 = 1279(0x4ff, float:1.792E-42)
                r5 = 719(0x2cf, float:1.008E-42)
                r0 = r9
                r1 = r10
                r2 = r11
                r3 = r12
                r6 = r13
                r7 = r14
                r8 = r15
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return
        }

        public Factory(int r10, int r11, int r12, int r13, int r14, float r15) {
                r9 = this;
                com.google.android.exoplayer2.util.Clock r8 = com.google.android.exoplayer2.util.Clock.DEFAULT
                r7 = 1061158912(0x3f400000, float:0.75)
                r0 = r9
                r1 = r10
                r2 = r11
                r3 = r12
                r4 = r13
                r5 = r14
                r6 = r15
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return
        }

        public Factory(int r1, int r2, int r3, int r4, int r5, float r6, float r7, com.google.android.exoplayer2.util.Clock r8) {
                r0 = this;
                r0.<init>()
                r0.minDurationForQualityIncreaseMs = r1
                r0.maxDurationForQualityDecreaseMs = r2
                r0.minDurationToRetainAfterDiscardMs = r3
                r0.maxWidthToDiscard = r4
                r0.maxHeightToDiscard = r5
                r0.bandwidthFraction = r6
                r0.bufferedFractionToLiveEdgeForQualityIncrease = r7
                r0.clock = r8
                return
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection.Factory
        public final com.google.android.exoplayer2.trackselection.ExoTrackSelection[] createTrackSelections(com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition[] r25, com.google.android.exoplayer2.upstream.BandwidthMeter r26, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r27, com.google.android.exoplayer2.Timeline r28) {
                r24 = this;
                r0 = r24
                r1 = r25
                com.google.common.collect.ImmutableList r2 = com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection.access$000(r25)
                int r3 = r1.length
                com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r3 = new com.google.android.exoplayer2.trackselection.ExoTrackSelection[r3]
                r4 = 0
                r5 = 0
            Ld:
                int r6 = r1.length
                if (r5 >= r6) goto L6b
                r6 = r1[r5]
                if (r6 == 0) goto L65
                int[] r9 = r6.tracks
                int r7 = r9.length
                if (r7 != 0) goto L1a
                goto L65
            L1a:
                int r7 = r9.length
                r8 = 1
                if (r7 != r8) goto L2c
                com.google.android.exoplayer2.trackselection.FixedTrackSelection r7 = new com.google.android.exoplayer2.trackselection.FixedTrackSelection
                com.google.android.exoplayer2.source.TrackGroup r8 = r6.group
                r9 = r9[r4]
                int r6 = r6.type
                r7.<init>(r8, r9, r6)
                r28 = r5
                goto L62
            L2c:
                com.google.android.exoplayer2.source.TrackGroup r8 = r6.group
                int r10 = r6.type
                java.lang.Object r6 = r2.get(r5)
                r22 = r6
                com.google.common.collect.ImmutableList r22 = (com.google.common.collect.ImmutableList) r22
                com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection r6 = new com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection
                r7 = r6
                int r11 = r0.minDurationForQualityIncreaseMs
                long r12 = (long) r11
                int r11 = r0.maxDurationForQualityDecreaseMs
                long r14 = (long) r11
                int r11 = r0.minDurationToRetainAfterDiscardMs
                r28 = r5
                long r4 = (long) r11
                r16 = r4
                int r4 = r0.maxWidthToDiscard
                r18 = r4
                int r4 = r0.maxHeightToDiscard
                r19 = r4
                float r4 = r0.bandwidthFraction
                r20 = r4
                float r4 = r0.bufferedFractionToLiveEdgeForQualityIncrease
                r21 = r4
                com.google.android.exoplayer2.util.Clock r4 = r0.clock
                r23 = r4
                r11 = r26
                r7.<init>(r8, r9, r10, r11, r12, r14, r16, r18, r19, r20, r21, r22, r23)
                r7 = r6
            L62:
                r3[r28] = r7
                goto L67
            L65:
                r28 = r5
            L67:
                int r5 = r28 + 1
                r4 = 0
                goto Ld
            L6b:
                return r3
        }
    }

    public AdaptiveTrackSelection(com.google.android.exoplayer2.source.TrackGroup r8, int[] r9, int r10, com.google.android.exoplayer2.upstream.BandwidthMeter r11, long r12, long r14, long r16, int r18, int r19, float r20, float r21, java.util.List<com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection.AdaptationCheckpoint> r22, com.google.android.exoplayer2.util.Clock r23) {
            r7 = this;
            r0 = r7
            r7.<init>(r8, r9, r10)
            int r1 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r1 >= 0) goto L12
            java.lang.String r1 = "AdaptiveTrackSelection"
            java.lang.String r2 = "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs"
            com.google.android.exoplayer2.util.Log.w(r1, r2)
            r3 = r11
            r1 = r12
            goto L15
        L12:
            r3 = r11
            r1 = r16
        L15:
            r0.bandwidthMeter = r3
            r3 = 1000(0x3e8, double:4.94E-321)
            long r5 = r12 * r3
            r0.minDurationForQualityIncreaseUs = r5
            long r5 = r14 * r3
            r0.maxDurationForQualityDecreaseUs = r5
            long r1 = r1 * r3
            r0.minDurationToRetainAfterDiscardUs = r1
            r1 = r18
            r0.maxWidthToDiscard = r1
            r1 = r19
            r0.maxHeightToDiscard = r1
            r1 = r20
            r0.bandwidthFraction = r1
            r1 = r21
            r0.bufferedFractionToLiveEdgeForQualityIncrease = r1
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.copyOf(r22)
            r0.adaptationCheckpoints = r1
            r1 = r23
            r0.clock = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.playbackSpeed = r1
            r1 = 0
            r0.reason = r1
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.lastBufferEvaluationMs = r1
            return
    }

    public AdaptiveTrackSelection(com.google.android.exoplayer2.source.TrackGroup r18, int[] r19, com.google.android.exoplayer2.upstream.BandwidthMeter r20) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r4 = r20
            com.google.common.collect.ImmutableList r15 = com.google.common.collect.ImmutableList.of()
            com.google.android.exoplayer2.util.Clock r16 = com.google.android.exoplayer2.util.Clock.DEFAULT
            r3 = 0
            r5 = 10000(0x2710, double:4.9407E-320)
            r7 = 25000(0x61a8, double:1.23516E-319)
            r9 = 25000(0x61a8, double:1.23516E-319)
            r11 = 1279(0x4ff, float:1.792E-42)
            r12 = 719(0x2cf, float:1.008E-42)
            r13 = 1060320051(0x3f333333, float:0.7)
            r14 = 1061158912(0x3f400000, float:0.75)
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r11, r12, r13, r14, r15, r16)
            return
    }

    public static /* synthetic */ com.google.common.collect.ImmutableList access$000(com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition[] r0) {
            com.google.common.collect.ImmutableList r0 = getAdaptationCheckpoints(r0)
            return r0
    }

    private static void addCheckpoint(java.util.List<com.google.common.collect.ImmutableList.Builder<com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection.AdaptationCheckpoint>> r7, long[] r8) {
            r0 = 0
            r1 = 0
            r3 = 0
        L4:
            int r4 = r8.length
            if (r3 >= r4) goto Ld
            r4 = r8[r3]
            long r1 = r1 + r4
            int r3 = r3 + 1
            goto L4
        Ld:
            int r3 = r7.size()
            if (r0 >= r3) goto L29
            java.lang.Object r3 = r7.get(r0)
            com.google.common.collect.ImmutableList$Builder r3 = (com.google.common.collect.ImmutableList.Builder) r3
            if (r3 != 0) goto L1c
            goto L26
        L1c:
            com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint r4 = new com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint
            r5 = r8[r0]
            r4.<init>(r1, r5)
            r3.add(r4)
        L26:
            int r0 = r0 + 1
            goto Ld
        L29:
            return
    }

    private int determineIdealSelectedIndex(long r7, long r9) {
            r6 = this;
            long r9 = r6.getAllocatedBandwidth(r9)
            r0 = 0
            r1 = 0
            r2 = 0
        L7:
            int r3 = r6.length
            if (r1 >= r3) goto L2c
            r3 = -9223372036854775808
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L17
            boolean r3 = r6.isBlacklisted(r1, r7)
            if (r3 != 0) goto L29
        L17:
            com.google.android.exoplayer2.Format r2 = r6.getFormat(r1)
            int r2 = r2.bitrate
            long r2 = (long) r2
            int r4 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r4 > 0) goto L24
            r2 = 1
            goto L25
        L24:
            r2 = 0
        L25:
            if (r2 == 0) goto L28
            return r1
        L28:
            r2 = r1
        L29:
            int r1 = r1 + 1
            goto L7
        L2c:
            return r2
    }

    private static com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection.AdaptationCheckpoint>> getAdaptationCheckpoints(com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition[] r12) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = 0
        L7:
            int r3 = r12.length
            r4 = 0
            r6 = 1
            if (r2 >= r3) goto L2f
            r3 = r12[r2]
            if (r3 == 0) goto L28
            r3 = r12[r2]
            int[] r3 = r3.tracks
            int r3 = r3.length
            if (r3 <= r6) goto L28
            com.google.common.collect.ImmutableList$Builder r3 = com.google.common.collect.ImmutableList.builder()
            com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint r6 = new com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint
            r6.<init>(r4, r4)
            r3.add(r6)
            r0.add(r3)
            goto L2c
        L28:
            r3 = 0
            r0.add(r3)
        L2c:
            int r2 = r2 + 1
            goto L7
        L2f:
            long[][] r2 = getSortedTrackBitrates(r12)
            int r3 = r2.length
            int[] r3 = new int[r3]
            int r7 = r2.length
            long[] r7 = new long[r7]
            r8 = 0
        L3a:
            int r9 = r2.length
            if (r8 >= r9) goto L4d
            r9 = r2[r8]
            int r9 = r9.length
            if (r9 != 0) goto L44
            r10 = r4
            goto L48
        L44:
            r9 = r2[r8]
            r10 = r9[r1]
        L48:
            r7[r8] = r10
            int r8 = r8 + 1
            goto L3a
        L4d:
            addCheckpoint(r0, r7)
            com.google.common.collect.ImmutableList r4 = getSwitchOrder(r2)
            r5 = 0
        L55:
            int r8 = r4.size()
            if (r5 >= r8) goto L76
            java.lang.Object r8 = r4.get(r5)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r9 = r3[r8]
            int r9 = r9 + r6
            r3[r8] = r9
            r10 = r2[r8]
            r9 = r10[r9]
            r7[r8] = r9
            addCheckpoint(r0, r7)
            int r5 = r5 + 1
            goto L55
        L76:
            r2 = 0
        L77:
            int r3 = r12.length
            if (r2 >= r3) goto L8b
            java.lang.Object r3 = r0.get(r2)
            if (r3 == 0) goto L88
            r3 = r7[r2]
            r5 = 2
            long r3 = r3 * r5
            r7[r2] = r3
        L88:
            int r2 = r2 + 1
            goto L77
        L8b:
            addCheckpoint(r0, r7)
            com.google.common.collect.ImmutableList$Builder r12 = com.google.common.collect.ImmutableList.builder()
        L92:
            int r2 = r0.size()
            if (r1 >= r2) goto Laf
            java.lang.Object r2 = r0.get(r1)
            com.google.common.collect.ImmutableList$Builder r2 = (com.google.common.collect.ImmutableList.Builder) r2
            if (r2 != 0) goto La5
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.of()
            goto La9
        La5:
            com.google.common.collect.ImmutableList r2 = r2.build()
        La9:
            r12.add(r2)
            int r1 = r1 + 1
            goto L92
        Laf:
            com.google.common.collect.ImmutableList r12 = r12.build()
            return r12
    }

    private long getAllocatedBandwidth(long r7) {
            r6 = this;
            long r7 = r6.getTotalAllocatableBandwidth(r7)
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint> r0 = r6.adaptationCheckpoints
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            return r7
        Ld:
            r0 = 1
            r1 = 1
        Lf:
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint> r2 = r6.adaptationCheckpoints
            int r2 = r2.size()
            int r2 = r2 - r0
            if (r1 >= r2) goto L29
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint> r2 = r6.adaptationCheckpoints
            java.lang.Object r2 = r2.get(r1)
            com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint r2 = (com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection.AdaptationCheckpoint) r2
            long r2 = r2.totalBandwidth
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 >= 0) goto L29
            int r1 = r1 + 1
            goto Lf
        L29:
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint> r0 = r6.adaptationCheckpoints
            int r2 = r1 + (-1)
            java.lang.Object r0 = r0.get(r2)
            com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint r0 = (com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection.AdaptationCheckpoint) r0
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint> r2 = r6.adaptationCheckpoints
            java.lang.Object r1 = r2.get(r1)
            com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint r1 = (com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection.AdaptationCheckpoint) r1
            long r2 = r0.totalBandwidth
            long r7 = r7 - r2
            float r7 = (float) r7
            long r4 = r1.totalBandwidth
            long r4 = r4 - r2
            float r8 = (float) r4
            float r7 = r7 / r8
            long r2 = r0.allocatedBandwidth
            long r0 = r1.allocatedBandwidth
            long r0 = r0 - r2
            float r8 = (float) r0
            float r7 = r7 * r8
            long r7 = (long) r7
            long r2 = r2 + r7
            return r2
    }

    private long getLastChunkDurationUs(java.util.List<? extends com.google.android.exoplayer2.source.chunk.MediaChunk> r8) {
            r7 = this;
            boolean r0 = r8.isEmpty()
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto Lc
            return r1
        Lc:
            java.lang.Object r8 = com.google.common.collect.Iterables.getLast(r8)
            com.google.android.exoplayer2.source.chunk.MediaChunk r8 = (com.google.android.exoplayer2.source.chunk.MediaChunk) r8
            long r3 = r8.startTimeUs
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L20
            long r5 = r8.endTimeUs
            int r8 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r8 == 0) goto L20
            long r1 = r5 - r3
        L20:
            return r1
    }

    private long getNextChunkDurationUs(com.google.android.exoplayer2.source.chunk.MediaChunkIterator[] r5, java.util.List<? extends com.google.android.exoplayer2.source.chunk.MediaChunk> r6) {
            r4 = this;
            int r0 = r4.selectedIndex
            int r1 = r5.length
            if (r0 >= r1) goto L1b
            r0 = r5[r0]
            boolean r0 = r0.next()
            if (r0 == 0) goto L1b
            int r6 = r4.selectedIndex
            r5 = r5[r6]
            long r0 = r5.getChunkEndTimeUs()
            long r5 = r5.getChunkStartTimeUs()
            long r0 = r0 - r5
            return r0
        L1b:
            int r0 = r5.length
            r1 = 0
        L1d:
            if (r1 >= r0) goto L34
            r2 = r5[r1]
            boolean r3 = r2.next()
            if (r3 == 0) goto L31
            long r5 = r2.getChunkEndTimeUs()
            long r0 = r2.getChunkStartTimeUs()
            long r5 = r5 - r0
            return r5
        L31:
            int r1 = r1 + 1
            goto L1d
        L34:
            long r5 = r4.getLastChunkDurationUs(r6)
            return r5
    }

    private static long[][] getSortedTrackBitrates(com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition[] r11) {
            int r0 = r11.length
            long[][] r0 = new long[r0][]
            r1 = 0
            r2 = 0
        L5:
            int r3 = r11.length
            if (r2 >= r3) goto L40
            r3 = r11[r2]
            if (r3 != 0) goto L11
            long[] r3 = new long[r1]
            r0[r2] = r3
            goto L3d
        L11:
            int[] r4 = r3.tracks
            int r4 = r4.length
            long[] r4 = new long[r4]
            r0[r2] = r4
            r4 = 0
        L19:
            int[] r5 = r3.tracks
            int r6 = r5.length
            if (r4 >= r6) goto L38
            com.google.android.exoplayer2.source.TrackGroup r6 = r3.group
            r5 = r5[r4]
            com.google.android.exoplayer2.Format r5 = r6.getFormat(r5)
            int r5 = r5.bitrate
            long r5 = (long) r5
            r7 = r0[r2]
            r8 = -1
            int r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r10 != 0) goto L33
            r5 = 0
        L33:
            r7[r4] = r5
            int r4 = r4 + 1
            goto L19
        L38:
            r3 = r0[r2]
            java.util.Arrays.sort(r3)
        L3d:
            int r2 = r2 + 1
            goto L5
        L40:
            return r0
    }

    private static com.google.common.collect.ImmutableList<java.lang.Integer> getSwitchOrder(long[][] r17) {
            r0 = r17
            com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys r1 = com.google.common.collect.MultimapBuilder.treeKeys()
            com.google.common.collect.MultimapBuilder$ListMultimapBuilder r1 = r1.arrayListValues()
            com.google.common.collect.ListMultimap r1 = r1.build()
            r2 = 0
            r3 = 0
        L10:
            int r4 = r0.length
            if (r3 >= r4) goto L70
            r4 = r0[r3]
            int r4 = r4.length
            r5 = 1
            if (r4 > r5) goto L1a
            goto L6d
        L1a:
            r4 = r0[r3]
            int r4 = r4.length
            double[] r5 = new double[r4]
            r6 = 0
        L20:
            r7 = r0[r3]
            int r7 = r7.length
            r8 = 0
            if (r6 >= r7) goto L40
            r7 = r0[r3]
            r10 = r7[r6]
            r12 = -1
            int r7 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r7 != 0) goto L32
            goto L3b
        L32:
            r7 = r0[r3]
            r8 = r7[r6]
            double r7 = (double) r8
            double r8 = java.lang.Math.log(r7)
        L3b:
            r5[r6] = r8
            int r6 = r6 + 1
            goto L20
        L40:
            int r4 = r4 + (-1)
            r6 = r5[r4]
            r10 = r5[r2]
            double r6 = r6 - r10
            r10 = 0
        L48:
            if (r10 >= r4) goto L6d
            r11 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r13 = r5[r10]
            int r10 = r10 + 1
            r15 = r5[r10]
            double r13 = r13 + r15
            double r13 = r13 * r11
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 != 0) goto L5c
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L61
        L5c:
            r11 = r5[r2]
            double r13 = r13 - r11
            double r11 = r13 / r6
        L61:
            java.lang.Double r11 = java.lang.Double.valueOf(r11)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
            r1.put(r11, r12)
            goto L48
        L6d:
            int r3 = r3 + 1
            goto L10
        L70:
            java.util.Collection r0 = r1.values()
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf(r0)
            return r0
    }

    private long getTotalAllocatableBandwidth(long r8) {
            r7 = this;
            com.google.android.exoplayer2.upstream.BandwidthMeter r0 = r7.bandwidthMeter
            long r0 = r0.getBitrateEstimate()
            float r0 = (float) r0
            float r1 = r7.bandwidthFraction
            float r0 = r0 * r1
            long r0 = (long) r0
            com.google.android.exoplayer2.upstream.BandwidthMeter r2 = r7.bandwidthMeter
            long r2 = r2.getTimeToFirstByteEstimateUs()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L32
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 != 0) goto L20
            goto L32
        L20:
            float r8 = (float) r8
            float r9 = r7.playbackSpeed
            float r9 = r8 / r9
            float r2 = (float) r2
            float r9 = r9 - r2
            r2 = 0
            float r9 = java.lang.Math.max(r9, r2)
            float r0 = (float) r0
            float r0 = r0 * r9
            float r0 = r0 / r8
            long r8 = (long) r0
            return r8
        L32:
            float r8 = (float) r0
            float r9 = r7.playbackSpeed
            float r8 = r8 / r9
            long r8 = (long) r8
            return r8
    }

    private long minDurationForQualityIncreaseUs(long r4, long r6) {
            r3 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto Lc
            long r4 = r3.minDurationForQualityIncreaseUs
            return r4
        Lc:
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 == 0) goto L11
            long r4 = r4 - r6
        L11:
            float r4 = (float) r4
            float r5 = r3.bufferedFractionToLiveEdgeForQualityIncrease
            float r4 = r4 * r5
            long r4 = (long) r4
            long r6 = r3.minDurationForQualityIncreaseUs
            long r4 = java.lang.Math.min(r4, r6)
            return r4
    }

    @Override // com.google.android.exoplayer2.trackselection.BaseTrackSelection, com.google.android.exoplayer2.trackselection.ExoTrackSelection
    @androidx.annotation.CallSuper
    public void disable() {
            r1 = this;
            r0 = 0
            r1.lastBufferEvaluationMediaChunk = r0
            return
    }

    @Override // com.google.android.exoplayer2.trackselection.BaseTrackSelection, com.google.android.exoplayer2.trackselection.ExoTrackSelection
    @androidx.annotation.CallSuper
    public void enable() {
            r2 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.lastBufferEvaluationMs = r0
            r0 = 0
            r2.lastBufferEvaluationMediaChunk = r0
            return
    }

    @Override // com.google.android.exoplayer2.trackselection.BaseTrackSelection, com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public int evaluateQueueSize(long r10, java.util.List<? extends com.google.android.exoplayer2.source.chunk.MediaChunk> r12) {
            r9 = this;
            com.google.android.exoplayer2.util.Clock r0 = r9.clock
            long r0 = r0.elapsedRealtime()
            long r2 = r9.lastBufferEvaluationMs
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 == 0) goto L31
            long r2 = r0 - r2
            r4 = 1000(0x3e8, double:4.94E-321)
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 >= 0) goto L31
            boolean r2 = r12.isEmpty()
            if (r2 != 0) goto L2f
            java.lang.Object r2 = com.google.common.collect.Iterables.getLast(r12)
            com.google.android.exoplayer2.source.chunk.MediaChunk r2 = (com.google.android.exoplayer2.source.chunk.MediaChunk) r2
            com.google.android.exoplayer2.source.chunk.MediaChunk r3 = r9.lastBufferEvaluationMediaChunk
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2f
            goto L31
        L2f:
            r2 = 0
            goto L32
        L31:
            r2 = 1
        L32:
            if (r2 != 0) goto L39
            int r10 = r12.size()
            return r10
        L39:
            r9.lastBufferEvaluationMs = r0
            boolean r2 = r12.isEmpty()
            if (r2 == 0) goto L43
            r2 = 0
            goto L49
        L43:
            java.lang.Object r2 = com.google.common.collect.Iterables.getLast(r12)
            com.google.android.exoplayer2.source.chunk.MediaChunk r2 = (com.google.android.exoplayer2.source.chunk.MediaChunk) r2
        L49:
            r9.lastBufferEvaluationMediaChunk = r2
            boolean r2 = r12.isEmpty()
            if (r2 == 0) goto L52
            return r6
        L52:
            int r2 = r12.size()
            int r3 = r2 + (-1)
            java.lang.Object r3 = r12.get(r3)
            com.google.android.exoplayer2.source.chunk.MediaChunk r3 = (com.google.android.exoplayer2.source.chunk.MediaChunk) r3
            long r3 = r3.startTimeUs
            long r3 = r3 - r10
            float r5 = r9.playbackSpeed
            long r3 = com.google.android.exoplayer2.util.Util.getPlayoutDurationForMediaDuration(r3, r5)
            long r7 = r9.minDurationToRetainAfterDiscardUs
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 >= 0) goto L6e
            return r2
        L6e:
            long r3 = r9.getLastChunkDurationUs(r12)
            int r0 = r9.determineIdealSelectedIndex(r0, r3)
            com.google.android.exoplayer2.Format r0 = r9.getFormat(r0)
        L7a:
            if (r6 >= r2) goto Lb0
            java.lang.Object r1 = r12.get(r6)
            com.google.android.exoplayer2.source.chunk.MediaChunk r1 = (com.google.android.exoplayer2.source.chunk.MediaChunk) r1
            com.google.android.exoplayer2.Format r3 = r1.trackFormat
            long r4 = r1.startTimeUs
            long r4 = r4 - r10
            float r1 = r9.playbackSpeed
            long r4 = com.google.android.exoplayer2.util.Util.getPlayoutDurationForMediaDuration(r4, r1)
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 < 0) goto Lad
            int r1 = r3.bitrate
            int r4 = r0.bitrate
            if (r1 >= r4) goto Lad
            int r1 = r3.height
            r4 = -1
            if (r1 == r4) goto Lad
            int r5 = r9.maxHeightToDiscard
            if (r1 > r5) goto Lad
            int r3 = r3.width
            if (r3 == r4) goto Lad
            int r4 = r9.maxWidthToDiscard
            if (r3 > r4) goto Lad
            int r3 = r0.height
            if (r1 >= r3) goto Lad
            return r6
        Lad:
            int r6 = r6 + 1
            goto L7a
        Lb0:
            return r2
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public int getSelectedIndex() {
            r1 = this;
            int r0 = r1.selectedIndex
            return r0
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    @androidx.annotation.Nullable
    public java.lang.Object getSelectionData() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public int getSelectionReason() {
            r1 = this;
            int r0 = r1.reason
            return r0
    }

    @Override // com.google.android.exoplayer2.trackselection.BaseTrackSelection, com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void onPlaybackSpeed(float r1) {
            r0 = this;
            r0.playbackSpeed = r1
            return
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void updateSelectedTrack(long r6, long r8, long r10, java.util.List<? extends com.google.android.exoplayer2.source.chunk.MediaChunk> r12, com.google.android.exoplayer2.source.chunk.MediaChunkIterator[] r13) {
            r5 = this;
            com.google.android.exoplayer2.util.Clock r6 = r5.clock
            long r6 = r6.elapsedRealtime()
            long r0 = r5.getNextChunkDurationUs(r13, r12)
            int r13 = r5.reason
            if (r13 != 0) goto L18
            r8 = 1
            r5.reason = r8
            int r6 = r5.determineIdealSelectedIndex(r6, r0)
            r5.selectedIndex = r6
            return
        L18:
            int r2 = r5.selectedIndex
            boolean r3 = r12.isEmpty()
            r4 = -1
            if (r3 == 0) goto L23
            r3 = -1
            goto L2f
        L23:
            java.lang.Object r3 = com.google.common.collect.Iterables.getLast(r12)
            com.google.android.exoplayer2.source.chunk.MediaChunk r3 = (com.google.android.exoplayer2.source.chunk.MediaChunk) r3
            com.google.android.exoplayer2.Format r3 = r3.trackFormat
            int r3 = r5.indexOf(r3)
        L2f:
            if (r3 == r4) goto L3a
            java.lang.Object r12 = com.google.common.collect.Iterables.getLast(r12)
            com.google.android.exoplayer2.source.chunk.MediaChunk r12 = (com.google.android.exoplayer2.source.chunk.MediaChunk) r12
            int r13 = r12.trackSelectionReason
            r2 = r3
        L3a:
            int r12 = r5.determineIdealSelectedIndex(r6, r0)
            boolean r6 = r5.isBlacklisted(r2, r6)
            if (r6 != 0) goto L64
            com.google.android.exoplayer2.Format r6 = r5.getFormat(r2)
            com.google.android.exoplayer2.Format r7 = r5.getFormat(r12)
            long r10 = r5.minDurationForQualityIncreaseUs(r10, r0)
            int r7 = r7.bitrate
            int r6 = r6.bitrate
            if (r7 <= r6) goto L5b
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 >= 0) goto L5b
            goto L63
        L5b:
            if (r7 >= r6) goto L64
            long r6 = r5.maxDurationForQualityDecreaseUs
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 < 0) goto L64
        L63:
            r12 = r2
        L64:
            if (r12 != r2) goto L67
            goto L68
        L67:
            r13 = 3
        L68:
            r5.reason = r13
            r5.selectedIndex = r12
            return
    }
}
