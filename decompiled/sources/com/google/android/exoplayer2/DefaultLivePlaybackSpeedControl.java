package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultLivePlaybackSpeedControl implements com.google.android.exoplayer2.LivePlaybackSpeedControl {
    public static final float DEFAULT_FALLBACK_MAX_PLAYBACK_SPEED = 1.03f;
    public static final float DEFAULT_FALLBACK_MIN_PLAYBACK_SPEED = 0.97f;
    public static final long DEFAULT_MAX_LIVE_OFFSET_ERROR_MS_FOR_UNIT_SPEED = 20;
    public static final float DEFAULT_MIN_POSSIBLE_LIVE_OFFSET_SMOOTHING_FACTOR = 0.999f;
    public static final long DEFAULT_MIN_UPDATE_INTERVAL_MS = 1000;
    public static final float DEFAULT_PROPORTIONAL_CONTROL_FACTOR = 0.1f;
    public static final long DEFAULT_TARGET_LIVE_OFFSET_INCREMENT_ON_REBUFFER_MS = 500;
    private float adjustedPlaybackSpeed;
    private long currentTargetLiveOffsetUs;
    private final float fallbackMaxPlaybackSpeed;
    private final float fallbackMinPlaybackSpeed;
    private long idealTargetLiveOffsetUs;
    private long lastPlaybackSpeedUpdateMs;
    private final long maxLiveOffsetErrorUsForUnitSpeed;
    private float maxPlaybackSpeed;
    private long maxTargetLiveOffsetUs;
    private long mediaConfigurationTargetLiveOffsetUs;
    private float minPlaybackSpeed;
    private final float minPossibleLiveOffsetSmoothingFactor;
    private long minTargetLiveOffsetUs;
    private final long minUpdateIntervalMs;
    private final float proportionalControlFactor;
    private long smoothedMinPossibleLiveOffsetDeviationUs;
    private long smoothedMinPossibleLiveOffsetUs;
    private long targetLiveOffsetOverrideUs;
    private final long targetLiveOffsetRebufferDeltaUs;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.DefaultLivePlaybackSpeedControl$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private float fallbackMaxPlaybackSpeed;
        private float fallbackMinPlaybackSpeed;
        private long maxLiveOffsetErrorUsForUnitSpeed;
        private float minPossibleLiveOffsetSmoothingFactor;
        private long minUpdateIntervalMs;
        private float proportionalControlFactorUs;
        private long targetLiveOffsetIncrementOnRebufferUs;

        public Builder() {
                r2 = this;
                r2.<init>()
                r0 = 1064849900(0x3f7851ec, float:0.97)
                r2.fallbackMinPlaybackSpeed = r0
                r0 = 1065604874(0x3f83d70a, float:1.03)
                r2.fallbackMaxPlaybackSpeed = r0
                r0 = 1000(0x3e8, double:4.94E-321)
                r2.minUpdateIntervalMs = r0
                r0 = 869711765(0x33d6bf95, float:1.0E-7)
                r2.proportionalControlFactorUs = r0
                r0 = 20
                long r0 = com.google.android.exoplayer2.util.Util.msToUs(r0)
                r2.maxLiveOffsetErrorUsForUnitSpeed = r0
                r0 = 500(0x1f4, double:2.47E-321)
                long r0 = com.google.android.exoplayer2.util.Util.msToUs(r0)
                r2.targetLiveOffsetIncrementOnRebufferUs = r0
                r0 = 1065336439(0x3f7fbe77, float:0.999)
                r2.minPossibleLiveOffsetSmoothingFactor = r0
                return
        }

        public com.google.android.exoplayer2.DefaultLivePlaybackSpeedControl build() {
                r13 = this;
                com.google.android.exoplayer2.DefaultLivePlaybackSpeedControl r12 = new com.google.android.exoplayer2.DefaultLivePlaybackSpeedControl
                float r1 = r13.fallbackMinPlaybackSpeed
                float r2 = r13.fallbackMaxPlaybackSpeed
                long r3 = r13.minUpdateIntervalMs
                float r5 = r13.proportionalControlFactorUs
                long r6 = r13.maxLiveOffsetErrorUsForUnitSpeed
                long r8 = r13.targetLiveOffsetIncrementOnRebufferUs
                float r10 = r13.minPossibleLiveOffsetSmoothingFactor
                r11 = 0
                r0 = r12
                r0.<init>(r1, r2, r3, r5, r6, r8, r10, r11)
                return r12
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.DefaultLivePlaybackSpeedControl.Builder setFallbackMaxPlaybackSpeed(float r2) {
                r1 = this;
                r0 = 1065353216(0x3f800000, float:1.0)
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 < 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
                r1.fallbackMaxPlaybackSpeed = r2
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.DefaultLivePlaybackSpeedControl.Builder setFallbackMinPlaybackSpeed(float r2) {
                r1 = this;
                r0 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 >= 0) goto Ld
                r0 = 1065353216(0x3f800000, float:1.0)
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 > 0) goto Ld
                r0 = 1
                goto Le
            Ld:
                r0 = 0
            Le:
                com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
                r1.fallbackMinPlaybackSpeed = r2
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.DefaultLivePlaybackSpeedControl.Builder setMaxLiveOffsetErrorMsForUnitSpeed(long r4) {
                r3 = this;
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 <= 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
                long r4 = com.google.android.exoplayer2.util.Util.msToUs(r4)
                r3.maxLiveOffsetErrorUsForUnitSpeed = r4
                return r3
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.DefaultLivePlaybackSpeedControl.Builder setMinPossibleLiveOffsetSmoothingFactor(float r2) {
                r1 = this;
                r0 = 0
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 < 0) goto Ld
                r0 = 1065353216(0x3f800000, float:1.0)
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 >= 0) goto Ld
                r0 = 1
                goto Le
            Ld:
                r0 = 0
            Le:
                com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
                r1.minPossibleLiveOffsetSmoothingFactor = r2
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.DefaultLivePlaybackSpeedControl.Builder setMinUpdateIntervalMs(long r4) {
                r3 = this;
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 <= 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
                r3.minUpdateIntervalMs = r4
                return r3
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.DefaultLivePlaybackSpeedControl.Builder setProportionalControlFactor(float r2) {
                r1 = this;
                r0 = 0
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 <= 0) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
                r0 = 1232348160(0x49742400, float:1000000.0)
                float r2 = r2 / r0
                r1.proportionalControlFactorUs = r2
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.DefaultLivePlaybackSpeedControl.Builder setTargetLiveOffsetIncrementOnRebufferMs(long r4) {
                r3 = this;
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 < 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
                long r4 = com.google.android.exoplayer2.util.Util.msToUs(r4)
                r3.targetLiveOffsetIncrementOnRebufferUs = r4
                return r3
        }
    }

    private DefaultLivePlaybackSpeedControl(float r1, float r2, long r3, float r5, long r6, long r8, float r10) {
            r0 = this;
            r0.<init>()
            r0.fallbackMinPlaybackSpeed = r1
            r0.fallbackMaxPlaybackSpeed = r2
            r0.minUpdateIntervalMs = r3
            r0.proportionalControlFactor = r5
            r0.maxLiveOffsetErrorUsForUnitSpeed = r6
            r0.targetLiveOffsetRebufferDeltaUs = r8
            r0.minPossibleLiveOffsetSmoothingFactor = r10
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.mediaConfigurationTargetLiveOffsetUs = r3
            r0.targetLiveOffsetOverrideUs = r3
            r0.minTargetLiveOffsetUs = r3
            r0.maxTargetLiveOffsetUs = r3
            r0.minPlaybackSpeed = r1
            r0.maxPlaybackSpeed = r2
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.adjustedPlaybackSpeed = r1
            r0.lastPlaybackSpeedUpdateMs = r3
            r0.idealTargetLiveOffsetUs = r3
            r0.currentTargetLiveOffsetUs = r3
            r0.smoothedMinPossibleLiveOffsetUs = r3
            r0.smoothedMinPossibleLiveOffsetDeviationUs = r3
            return
    }

    public /* synthetic */ DefaultLivePlaybackSpeedControl(float r1, float r2, long r3, float r5, long r6, long r8, float r10, com.google.android.exoplayer2.DefaultLivePlaybackSpeedControl.AnonymousClass1 r11) {
            r0 = this;
            r0.<init>(r1, r2, r3, r5, r6, r8, r10)
            return
    }

    private void adjustTargetLiveOffsetUs(long r11) {
            r10 = this;
            long r0 = r10.smoothedMinPossibleLiveOffsetUs
            long r2 = r10.smoothedMinPossibleLiveOffsetDeviationUs
            r4 = 3
            long r2 = r2 * r4
            long r8 = r2 + r0
            long r0 = r10.currentTargetLiveOffsetUs
            r2 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r3 <= 0) goto L3e
            long r11 = r10.minUpdateIntervalMs
            long r11 = com.google.android.exoplayer2.util.Util.msToUs(r11)
            float r0 = r10.adjustedPlaybackSpeed
            float r0 = r0 - r2
            float r11 = (float) r11
            float r0 = r0 * r11
            long r0 = (long) r0
            float r12 = r10.maxPlaybackSpeed
            float r12 = r12 - r2
            float r12 = r12 * r11
            long r11 = (long) r12
            long r0 = r0 + r11
            r11 = 3
            long[] r11 = new long[r11]
            r12 = 0
            r11[r12] = r8
            r12 = 1
            long r2 = r10.idealTargetLiveOffsetUs
            r11[r12] = r2
            r12 = 2
            long r2 = r10.currentTargetLiveOffsetUs
            long r2 = r2 - r0
            r11[r12] = r2
            long r11 = com.google.common.primitives.Longs.max(r11)
            r10.currentTargetLiveOffsetUs = r11
            goto L65
        L3e:
            r0 = 0
            float r1 = r10.adjustedPlaybackSpeed
            float r1 = r1 - r2
            float r0 = java.lang.Math.max(r0, r1)
            float r1 = r10.proportionalControlFactor
            float r0 = r0 / r1
            long r0 = (long) r0
            long r4 = r11 - r0
            long r6 = r10.currentTargetLiveOffsetUs
            long r11 = com.google.android.exoplayer2.util.Util.constrainValue(r4, r6, r8)
            r10.currentTargetLiveOffsetUs = r11
            long r0 = r10.maxTargetLiveOffsetUs
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L65
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 <= 0) goto L65
            r10.currentTargetLiveOffsetUs = r0
        L65:
            return
    }

    private void maybeResetTargetLiveOffsetUs() {
            r7 = this;
            long r0 = r7.mediaConfigurationTargetLiveOffsetUs
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L29
            long r4 = r7.targetLiveOffsetOverrideUs
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L12
            r0 = r4
        L12:
            long r4 = r7.minTargetLiveOffsetUs
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L1d
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 >= 0) goto L1d
            r0 = r4
        L1d:
            long r4 = r7.maxTargetLiveOffsetUs
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L2a
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 <= 0) goto L2a
            r0 = r4
            goto L2a
        L29:
            r0 = r2
        L2a:
            long r4 = r7.idealTargetLiveOffsetUs
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 != 0) goto L31
            return
        L31:
            r7.idealTargetLiveOffsetUs = r0
            r7.currentTargetLiveOffsetUs = r0
            r7.smoothedMinPossibleLiveOffsetUs = r2
            r7.smoothedMinPossibleLiveOffsetDeviationUs = r2
            r7.lastPlaybackSpeedUpdateMs = r2
            return
    }

    private static long smooth(long r0, long r2, float r4) {
            float r0 = (float) r0
            float r0 = r0 * r4
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r4
            float r2 = (float) r2
            float r1 = r1 * r2
            float r1 = r1 + r0
            long r0 = (long) r1
            return r0
    }

    private void updateSmoothedMinPossibleLiveOffsetUs(long r4, long r6) {
            r3 = this;
            long r4 = r4 - r6
            long r6 = r3.smoothedMinPossibleLiveOffsetUs
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 != 0) goto L13
            r3.smoothedMinPossibleLiveOffsetUs = r4
            r4 = 0
            r3.smoothedMinPossibleLiveOffsetDeviationUs = r4
            goto L2e
        L13:
            float r0 = r3.minPossibleLiveOffsetSmoothingFactor
            long r6 = smooth(r6, r4, r0)
            long r6 = java.lang.Math.max(r4, r6)
            r3.smoothedMinPossibleLiveOffsetUs = r6
            long r4 = r4 - r6
            long r4 = java.lang.Math.abs(r4)
            long r6 = r3.smoothedMinPossibleLiveOffsetDeviationUs
            float r0 = r3.minPossibleLiveOffsetSmoothingFactor
            long r4 = smooth(r6, r4, r0)
            r3.smoothedMinPossibleLiveOffsetDeviationUs = r4
        L2e:
            return
    }

    @Override // com.google.android.exoplayer2.LivePlaybackSpeedControl
    public float getAdjustedPlaybackSpeed(long r7, long r9) {
            r6 = this;
            long r0 = r6.mediaConfigurationTargetLiveOffsetUs
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto Le
            return r4
        Le:
            r6.updateSmoothedMinPossibleLiveOffsetUs(r7, r9)
            long r9 = r6.lastPlaybackSpeedUpdateMs
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 == 0) goto L27
            long r9 = android.os.SystemClock.elapsedRealtime()
            long r0 = r6.lastPlaybackSpeedUpdateMs
            long r9 = r9 - r0
            long r0 = r6.minUpdateIntervalMs
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 >= 0) goto L27
            float r7 = r6.adjustedPlaybackSpeed
            return r7
        L27:
            long r9 = android.os.SystemClock.elapsedRealtime()
            r6.lastPlaybackSpeedUpdateMs = r9
            r6.adjustTargetLiveOffsetUs(r7)
            long r9 = r6.currentTargetLiveOffsetUs
            long r7 = r7 - r9
            long r9 = java.lang.Math.abs(r7)
            long r0 = r6.maxLiveOffsetErrorUsForUnitSpeed
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 >= 0) goto L40
            r6.adjustedPlaybackSpeed = r4
            goto L50
        L40:
            float r9 = r6.proportionalControlFactor
            float r7 = (float) r7
            float r9 = r9 * r7
            float r9 = r9 + r4
            float r7 = r6.minPlaybackSpeed
            float r8 = r6.maxPlaybackSpeed
            float r7 = com.google.android.exoplayer2.util.Util.constrainValue(r9, r7, r8)
            r6.adjustedPlaybackSpeed = r7
        L50:
            float r7 = r6.adjustedPlaybackSpeed
            return r7
    }

    @Override // com.google.android.exoplayer2.LivePlaybackSpeedControl
    public long getTargetLiveOffsetUs() {
            r2 = this;
            long r0 = r2.currentTargetLiveOffsetUs
            return r0
    }

    @Override // com.google.android.exoplayer2.LivePlaybackSpeedControl
    public void notifyRebuffer() {
            r7 = this;
            long r0 = r7.currentTargetLiveOffsetUs
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lc
            return
        Lc:
            long r4 = r7.targetLiveOffsetRebufferDeltaUs
            long r0 = r0 + r4
            r7.currentTargetLiveOffsetUs = r0
            long r4 = r7.maxTargetLiveOffsetUs
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L1d
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 <= 0) goto L1d
            r7.currentTargetLiveOffsetUs = r4
        L1d:
            r7.lastPlaybackSpeedUpdateMs = r2
            return
    }

    @Override // com.google.android.exoplayer2.LivePlaybackSpeedControl
    public void setLiveConfiguration(com.google.android.exoplayer2.MediaItem.LiveConfiguration r4) {
            r3 = this;
            long r0 = r4.targetOffsetMs
            long r0 = com.google.android.exoplayer2.util.Util.msToUs(r0)
            r3.mediaConfigurationTargetLiveOffsetUs = r0
            long r0 = r4.minOffsetMs
            long r0 = com.google.android.exoplayer2.util.Util.msToUs(r0)
            r3.minTargetLiveOffsetUs = r0
            long r0 = r4.maxOffsetMs
            long r0 = com.google.android.exoplayer2.util.Util.msToUs(r0)
            r3.maxTargetLiveOffsetUs = r0
            float r0 = r4.minPlaybackSpeed
            r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 == 0) goto L22
            goto L24
        L22:
            float r0 = r3.fallbackMinPlaybackSpeed
        L24:
            r3.minPlaybackSpeed = r0
            float r4 = r4.maxPlaybackSpeed
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 == 0) goto L2d
            goto L2f
        L2d:
            float r4 = r3.fallbackMaxPlaybackSpeed
        L2f:
            r3.maxPlaybackSpeed = r4
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L42
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L42
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.mediaConfigurationTargetLiveOffsetUs = r0
        L42:
            r3.maybeResetTargetLiveOffsetUs()
            return
    }

    @Override // com.google.android.exoplayer2.LivePlaybackSpeedControl
    public void setTargetLiveOffsetOverrideUs(long r1) {
            r0 = this;
            r0.targetLiveOffsetOverrideUs = r1
            r0.maybeResetTargetLiveOffsetUs()
            return
    }
}
