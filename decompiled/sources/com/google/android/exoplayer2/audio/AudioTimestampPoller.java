package com.google.android.exoplayer2.audio;

/* JADX INFO: loaded from: classes.dex */
final class AudioTimestampPoller {
    private static final int ERROR_POLL_INTERVAL_US = 500000;
    private static final int FAST_POLL_INTERVAL_US = 10000;
    private static final int INITIALIZING_DURATION_US = 500000;
    private static final int SLOW_POLL_INTERVAL_US = 10000000;
    private static final int STATE_ERROR = 4;
    private static final int STATE_INITIALIZING = 0;
    private static final int STATE_NO_TIMESTAMP = 3;
    private static final int STATE_TIMESTAMP = 1;
    private static final int STATE_TIMESTAMP_ADVANCING = 2;

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.audio.AudioTimestampPoller.AudioTimestampV19 audioTimestamp;
    private long initialTimestampPositionFrames;
    private long initializeSystemTimeUs;
    private long lastTimestampSampleTimeUs;
    private long sampleIntervalUs;
    private int state;

    @androidx.annotation.RequiresApi(19)
    public static final class AudioTimestampV19 {
        private final android.media.AudioTimestamp audioTimestamp;
        private final android.media.AudioTrack audioTrack;
        private long lastTimestampPositionFrames;
        private long lastTimestampRawPositionFrames;
        private long rawTimestampFramePositionWrapCount;

        public AudioTimestampV19(android.media.AudioTrack r1) {
                r0 = this;
                r0.<init>()
                r0.audioTrack = r1
                android.media.AudioTimestamp r1 = new android.media.AudioTimestamp
                r1.<init>()
                r0.audioTimestamp = r1
                return
        }

        public long getTimestampPositionFrames() {
                r2 = this;
                long r0 = r2.lastTimestampPositionFrames
                return r0
        }

        public long getTimestampSystemTimeUs() {
                r4 = this;
                android.media.AudioTimestamp r0 = r4.audioTimestamp
                long r0 = r0.nanoTime
                r2 = 1000(0x3e8, double:4.94E-321)
                long r0 = r0 / r2
                return r0
        }

        public boolean maybeUpdateTimestamp() {
                r7 = this;
                android.media.AudioTrack r0 = r7.audioTrack
                android.media.AudioTimestamp r1 = r7.audioTimestamp
                boolean r0 = r0.getTimestamp(r1)
                if (r0 == 0) goto L25
                android.media.AudioTimestamp r1 = r7.audioTimestamp
                long r1 = r1.framePosition
                long r3 = r7.lastTimestampRawPositionFrames
                int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r5 <= 0) goto L1b
                long r3 = r7.rawTimestampFramePositionWrapCount
                r5 = 1
                long r3 = r3 + r5
                r7.rawTimestampFramePositionWrapCount = r3
            L1b:
                r7.lastTimestampRawPositionFrames = r1
                long r3 = r7.rawTimestampFramePositionWrapCount
                r5 = 32
                long r3 = r3 << r5
                long r1 = r1 + r3
                r7.lastTimestampPositionFrames = r1
            L25:
                return r0
        }
    }

    public AudioTimestampPoller(android.media.AudioTrack r3) {
            r2 = this;
            r2.<init>()
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 19
            if (r0 < r1) goto L14
            com.google.android.exoplayer2.audio.AudioTimestampPoller$AudioTimestampV19 r0 = new com.google.android.exoplayer2.audio.AudioTimestampPoller$AudioTimestampV19
            r0.<init>(r3)
            r2.audioTimestamp = r0
            r2.reset()
            goto L1b
        L14:
            r3 = 0
            r2.audioTimestamp = r3
            r3 = 3
            r2.updateState(r3)
        L1b:
            return
    }

    private void updateState(int r7) {
            r6 = this;
            r6.state = r7
            r0 = 10000(0x2710, double:4.9407E-320)
            if (r7 == 0) goto L27
            r2 = 1
            if (r7 == r2) goto L24
            r0 = 2
            if (r7 == r0) goto L1e
            r0 = 3
            if (r7 == r0) goto L1e
            r0 = 4
            if (r7 != r0) goto L18
            r0 = 500000(0x7a120, double:2.47033E-318)
            r6.sampleIntervalUs = r0
            goto L3a
        L18:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>()
            throw r7
        L1e:
            r0 = 10000000(0x989680, double:4.9406565E-317)
            r6.sampleIntervalUs = r0
            goto L3a
        L24:
            r6.sampleIntervalUs = r0
            goto L3a
        L27:
            r2 = 0
            r6.lastTimestampSampleTimeUs = r2
            r2 = -1
            r6.initialTimestampPositionFrames = r2
            long r2 = java.lang.System.nanoTime()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            r6.initializeSystemTimeUs = r2
            r6.sampleIntervalUs = r0
        L3a:
            return
    }

    public void acceptTimestamp() {
            r2 = this;
            int r0 = r2.state
            r1 = 4
            if (r0 != r1) goto L8
            r2.reset()
        L8:
            return
    }

    @android.annotation.TargetApi(19)
    public long getTimestampPositionFrames() {
            r2 = this;
            com.google.android.exoplayer2.audio.AudioTimestampPoller$AudioTimestampV19 r0 = r2.audioTimestamp
            if (r0 == 0) goto L9
            long r0 = r0.getTimestampPositionFrames()
            goto Lb
        L9:
            r0 = -1
        Lb:
            return r0
    }

    @android.annotation.TargetApi(19)
    public long getTimestampSystemTimeUs() {
            r2 = this;
            com.google.android.exoplayer2.audio.AudioTimestampPoller$AudioTimestampV19 r0 = r2.audioTimestamp
            if (r0 == 0) goto L9
            long r0 = r0.getTimestampSystemTimeUs()
            goto Le
        L9:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        Le:
            return r0
    }

    public boolean hasAdvancingTimestamp() {
            r2 = this;
            int r0 = r2.state
            r1 = 2
            if (r0 != r1) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public boolean hasTimestamp() {
            r3 = this;
            int r0 = r3.state
            r1 = 1
            if (r0 == r1) goto La
            r2 = 2
            if (r0 != r2) goto L9
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    @android.annotation.TargetApi(19)
    public boolean maybePollTimestamp(long r8) {
            r7 = this;
            com.google.android.exoplayer2.audio.AudioTimestampPoller$AudioTimestampV19 r0 = r7.audioTimestamp
            r1 = 0
            if (r0 == 0) goto L78
            long r2 = r7.lastTimestampSampleTimeUs
            long r2 = r8 - r2
            long r4 = r7.sampleIntervalUs
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L11
            goto L78
        L11:
            r7.lastTimestampSampleTimeUs = r8
            boolean r0 = r0.maybeUpdateTimestamp()
            int r2 = r7.state
            r3 = 3
            r4 = 1
            if (r2 == 0) goto L50
            r8 = 2
            if (r2 == r4) goto L3a
            if (r2 == r8) goto L34
            if (r2 == r3) goto L2e
            r8 = 4
            if (r2 != r8) goto L28
            goto L77
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L2e:
            if (r0 == 0) goto L77
            r7.reset()
            goto L77
        L34:
            if (r0 != 0) goto L77
            r7.reset()
            goto L77
        L3a:
            if (r0 == 0) goto L4c
            com.google.android.exoplayer2.audio.AudioTimestampPoller$AudioTimestampV19 r9 = r7.audioTimestamp
            long r1 = r9.getTimestampPositionFrames()
            long r3 = r7.initialTimestampPositionFrames
            int r9 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r9 <= 0) goto L77
            r7.updateState(r8)
            goto L77
        L4c:
            r7.reset()
            goto L77
        L50:
            if (r0 == 0) goto L6a
            com.google.android.exoplayer2.audio.AudioTimestampPoller$AudioTimestampV19 r8 = r7.audioTimestamp
            long r8 = r8.getTimestampSystemTimeUs()
            long r2 = r7.initializeSystemTimeUs
            int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r5 < 0) goto L78
            com.google.android.exoplayer2.audio.AudioTimestampPoller$AudioTimestampV19 r8 = r7.audioTimestamp
            long r8 = r8.getTimestampPositionFrames()
            r7.initialTimestampPositionFrames = r8
            r7.updateState(r4)
            goto L77
        L6a:
            long r1 = r7.initializeSystemTimeUs
            long r8 = r8 - r1
            r1 = 500000(0x7a120, double:2.47033E-318)
            int r4 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r4 <= 0) goto L77
            r7.updateState(r3)
        L77:
            r1 = r0
        L78:
            return r1
    }

    public void rejectTimestamp() {
            r1 = this;
            r0 = 4
            r1.updateState(r0)
            return
    }

    public void reset() {
            r1 = this;
            com.google.android.exoplayer2.audio.AudioTimestampPoller$AudioTimestampV19 r0 = r1.audioTimestamp
            if (r0 == 0) goto L8
            r0 = 0
            r1.updateState(r0)
        L8:
            return
    }
}
