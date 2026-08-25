package com.google.android.exoplayer2.video;

/* JADX INFO: loaded from: classes2.dex */
final class FixedFrameRateEstimator {
    public static final int CONSECUTIVE_MATCHING_FRAME_DURATIONS_FOR_SYNC = 15;
    private com.google.android.exoplayer2.video.FixedFrameRateEstimator.Matcher candidateMatcher;
    private boolean candidateMatcherActive;
    private com.google.android.exoplayer2.video.FixedFrameRateEstimator.Matcher currentMatcher;
    private int framesWithoutSyncCount;
    private long lastFramePresentationTimeNs;
    private boolean switchToCandidateMatcherWhenSynced;

    /* JADX INFO: loaded from: classes.dex */
    public static final class Matcher {
        private long firstFrameDurationNs;
        private long firstFramePresentationTimeNs;
        private long frameCount;
        private long lastFramePresentationTimeNs;
        private long matchingFrameCount;
        private long matchingFrameDurationSumNs;
        private int recentFrameOutlierCount;
        private final boolean[] recentFrameOutlierFlags;

        public Matcher() {
                r1 = this;
                r1.<init>()
                r0 = 15
                boolean[] r0 = new boolean[r0]
                r1.recentFrameOutlierFlags = r0
                return
        }

        private static int getRecentFrameOutlierIndex(long r2) {
                r0 = 15
                long r2 = r2 % r0
                int r3 = (int) r2
                return r3
        }

        public long getFrameDurationNs() {
                r5 = this;
                long r0 = r5.matchingFrameCount
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L9
                goto Lc
            L9:
                long r2 = r5.matchingFrameDurationSumNs
                long r2 = r2 / r0
            Lc:
                return r2
        }

        public long getMatchingFrameDurationSumNs() {
                r2 = this;
                long r0 = r2.matchingFrameDurationSumNs
                return r0
        }

        public boolean isLastFrameOutlier() {
                r5 = this;
                long r0 = r5.frameCount
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto La
                r0 = 0
                return r0
            La:
                boolean[] r2 = r5.recentFrameOutlierFlags
                r3 = 1
                long r0 = r0 - r3
                int r0 = getRecentFrameOutlierIndex(r0)
                boolean r0 = r2[r0]
                return r0
        }

        public boolean isSynced() {
                r5 = this;
                long r0 = r5.frameCount
                r2 = 15
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto Le
                int r0 = r5.recentFrameOutlierCount
                if (r0 != 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        public void onNextFrame(long r12) {
                r11 = this;
                long r0 = r11.frameCount
                r2 = 1
                r4 = 0
                int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r6 != 0) goto Ld
                r11.firstFramePresentationTimeNs = r12
                goto L5a
            Ld:
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L1c
                long r0 = r11.firstFramePresentationTimeNs
                long r0 = r12 - r0
                r11.firstFrameDurationNs = r0
                r11.matchingFrameDurationSumNs = r0
                r11.matchingFrameCount = r2
                goto L5a
            L1c:
                long r4 = r11.lastFramePresentationTimeNs
                long r4 = r12 - r4
                int r0 = getRecentFrameOutlierIndex(r0)
                long r6 = r11.firstFrameDurationNs
                long r6 = r4 - r6
                long r6 = java.lang.Math.abs(r6)
                r8 = 1000000(0xf4240, double:4.940656E-318)
                r1 = 1
                int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r10 > 0) goto L4d
                long r6 = r11.matchingFrameCount
                long r6 = r6 + r2
                r11.matchingFrameCount = r6
                long r6 = r11.matchingFrameDurationSumNs
                long r6 = r6 + r4
                r11.matchingFrameDurationSumNs = r6
                boolean[] r4 = r11.recentFrameOutlierFlags
                boolean r5 = r4[r0]
                if (r5 == 0) goto L5a
                r5 = 0
                r4[r0] = r5
                int r0 = r11.recentFrameOutlierCount
                int r0 = r0 - r1
                r11.recentFrameOutlierCount = r0
                goto L5a
            L4d:
                boolean[] r4 = r11.recentFrameOutlierFlags
                boolean r5 = r4[r0]
                if (r5 != 0) goto L5a
                r4[r0] = r1
                int r0 = r11.recentFrameOutlierCount
                int r0 = r0 + r1
                r11.recentFrameOutlierCount = r0
            L5a:
                long r0 = r11.frameCount
                long r0 = r0 + r2
                r11.frameCount = r0
                r11.lastFramePresentationTimeNs = r12
                return
        }

        public void reset() {
                r2 = this;
                r0 = 0
                r2.frameCount = r0
                r2.matchingFrameCount = r0
                r2.matchingFrameDurationSumNs = r0
                r0 = 0
                r2.recentFrameOutlierCount = r0
                boolean[] r1 = r2.recentFrameOutlierFlags
                java.util.Arrays.fill(r1, r0)
                return
        }
    }

    public FixedFrameRateEstimator() {
            r2 = this;
            r2.<init>()
            com.google.android.exoplayer2.video.FixedFrameRateEstimator$Matcher r0 = new com.google.android.exoplayer2.video.FixedFrameRateEstimator$Matcher
            r0.<init>()
            r2.currentMatcher = r0
            com.google.android.exoplayer2.video.FixedFrameRateEstimator$Matcher r0 = new com.google.android.exoplayer2.video.FixedFrameRateEstimator$Matcher
            r0.<init>()
            r2.candidateMatcher = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.lastFramePresentationTimeNs = r0
            return
    }

    public long getFrameDurationNs() {
            r2 = this;
            boolean r0 = r2.isSynced()
            if (r0 == 0) goto Ld
            com.google.android.exoplayer2.video.FixedFrameRateEstimator$Matcher r0 = r2.currentMatcher
            long r0 = r0.getFrameDurationNs()
            goto L12
        Ld:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L12:
            return r0
    }

    public float getFrameRate() {
            r4 = this;
            boolean r0 = r4.isSynced()
            if (r0 == 0) goto L15
            r0 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            com.google.android.exoplayer2.video.FixedFrameRateEstimator$Matcher r2 = r4.currentMatcher
            long r2 = r2.getFrameDurationNs()
            double r2 = (double) r2
            double r0 = r0 / r2
            float r0 = (float) r0
            goto L17
        L15:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
        L17:
            return r0
    }

    public int getFramesWithoutSyncCount() {
            r1 = this;
            int r0 = r1.framesWithoutSyncCount
            return r0
    }

    public long getMatchingFrameDurationSumNs() {
            r2 = this;
            boolean r0 = r2.isSynced()
            if (r0 == 0) goto Ld
            com.google.android.exoplayer2.video.FixedFrameRateEstimator$Matcher r0 = r2.currentMatcher
            long r0 = r0.getMatchingFrameDurationSumNs()
            goto L12
        Ld:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L12:
            return r0
    }

    public boolean isSynced() {
            r1 = this;
            com.google.android.exoplayer2.video.FixedFrameRateEstimator$Matcher r0 = r1.currentMatcher
            boolean r0 = r0.isSynced()
            return r0
    }

    public void onNextFrame(long r8) {
            r7 = this;
            com.google.android.exoplayer2.video.FixedFrameRateEstimator$Matcher r0 = r7.currentMatcher
            r0.onNextFrame(r8)
            com.google.android.exoplayer2.video.FixedFrameRateEstimator$Matcher r0 = r7.currentMatcher
            boolean r0 = r0.isSynced()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L16
            boolean r0 = r7.switchToCandidateMatcherWhenSynced
            if (r0 != 0) goto L16
            r7.candidateMatcherActive = r2
            goto L40
        L16:
            long r3 = r7.lastFramePresentationTimeNs
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L40
            boolean r0 = r7.candidateMatcherActive
            if (r0 == 0) goto L2d
            com.google.android.exoplayer2.video.FixedFrameRateEstimator$Matcher r0 = r7.candidateMatcher
            boolean r0 = r0.isLastFrameOutlier()
            if (r0 == 0) goto L39
        L2d:
            com.google.android.exoplayer2.video.FixedFrameRateEstimator$Matcher r0 = r7.candidateMatcher
            r0.reset()
            com.google.android.exoplayer2.video.FixedFrameRateEstimator$Matcher r0 = r7.candidateMatcher
            long r3 = r7.lastFramePresentationTimeNs
            r0.onNextFrame(r3)
        L39:
            r7.candidateMatcherActive = r1
            com.google.android.exoplayer2.video.FixedFrameRateEstimator$Matcher r0 = r7.candidateMatcher
            r0.onNextFrame(r8)
        L40:
            boolean r0 = r7.candidateMatcherActive
            if (r0 == 0) goto L58
            com.google.android.exoplayer2.video.FixedFrameRateEstimator$Matcher r0 = r7.candidateMatcher
            boolean r0 = r0.isSynced()
            if (r0 == 0) goto L58
            com.google.android.exoplayer2.video.FixedFrameRateEstimator$Matcher r0 = r7.currentMatcher
            com.google.android.exoplayer2.video.FixedFrameRateEstimator$Matcher r3 = r7.candidateMatcher
            r7.currentMatcher = r3
            r7.candidateMatcher = r0
            r7.candidateMatcherActive = r2
            r7.switchToCandidateMatcherWhenSynced = r2
        L58:
            r7.lastFramePresentationTimeNs = r8
            com.google.android.exoplayer2.video.FixedFrameRateEstimator$Matcher r8 = r7.currentMatcher
            boolean r8 = r8.isSynced()
            if (r8 == 0) goto L63
            goto L67
        L63:
            int r8 = r7.framesWithoutSyncCount
            int r2 = r8 + 1
        L67:
            r7.framesWithoutSyncCount = r2
            return
    }

    public void reset() {
            r3 = this;
            com.google.android.exoplayer2.video.FixedFrameRateEstimator$Matcher r0 = r3.currentMatcher
            r0.reset()
            com.google.android.exoplayer2.video.FixedFrameRateEstimator$Matcher r0 = r3.candidateMatcher
            r0.reset()
            r0 = 0
            r3.candidateMatcherActive = r0
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.lastFramePresentationTimeNs = r1
            r3.framesWithoutSyncCount = r0
            return
    }
}
