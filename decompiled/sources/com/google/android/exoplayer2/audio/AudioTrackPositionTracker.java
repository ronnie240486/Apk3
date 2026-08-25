package com.google.android.exoplayer2.audio;

/* JADX INFO: loaded from: classes2.dex */
final class AudioTrackPositionTracker {
    private static final long FORCE_RESET_WORKAROUND_TIMEOUT_MS = 200;
    private static final long MAX_AUDIO_TIMESTAMP_OFFSET_US = 5000000;
    private static final long MAX_LATENCY_US = 5000000;
    private static final int MAX_PLAYHEAD_OFFSET_COUNT = 10;
    private static final int MIN_LATENCY_SAMPLE_INTERVAL_US = 500000;
    private static final int MIN_PLAYHEAD_OFFSET_SAMPLE_INTERVAL_US = 30000;
    private static final long MODE_SWITCH_SMOOTHING_DURATION_US = 1000000;
    private static final int PLAYSTATE_PAUSED = 2;
    private static final int PLAYSTATE_PLAYING = 3;
    private static final int PLAYSTATE_STOPPED = 1;
    private static final long RAW_PLAYBACK_HEAD_POSITION_UPDATE_INTERVAL_MS = 5;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.audio.AudioTimestampPoller audioTimestampPoller;

    @androidx.annotation.Nullable
    private android.media.AudioTrack audioTrack;
    private float audioTrackPlaybackSpeed;
    private int bufferSize;
    private long bufferSizeUs;
    private long endPlaybackHeadPosition;
    private long forceResetWorkaroundTimeMs;

    @androidx.annotation.Nullable
    private java.lang.reflect.Method getLatencyMethod;
    private boolean hasData;
    private boolean isOutputPcm;
    private long lastLatencySampleTimeUs;
    private long lastPlayheadSampleTimeUs;
    private long lastPositionUs;
    private long lastRawPlaybackHeadPositionSampleTimeMs;
    private boolean lastSampleUsedGetTimestampMode;
    private long lastSystemTimeUs;
    private long latencyUs;
    private final com.google.android.exoplayer2.audio.AudioTrackPositionTracker.Listener listener;
    private boolean needsPassthroughWorkarounds;
    private int nextPlayheadOffsetIndex;
    private boolean notifiedPositionIncreasing;
    private int outputPcmFrameSize;
    private int outputSampleRate;
    private long passthroughWorkaroundPauseOffset;
    private int playheadOffsetCount;
    private final long[] playheadOffsets;
    private long previousModePositionUs;
    private long previousModeSystemTimeUs;
    private long rawPlaybackHeadPosition;
    private long rawPlaybackHeadWrapCount;
    private long smoothedPlayheadOffsetUs;
    private long stopPlaybackHeadPosition;
    private long stopTimestampUs;

    public interface Listener {
        void onInvalidLatency(long r1);

        void onPositionAdvancing(long r1);

        void onPositionFramesMismatch(long r1, long r3, long r5, long r7);

        void onSystemTimeUsMismatch(long r1, long r3, long r5, long r7);

        void onUnderrun(int r1, long r2);
    }

    public AudioTrackPositionTracker(com.google.android.exoplayer2.audio.AudioTrackPositionTracker.Listener r3) {
            r2 = this;
            r2.<init>()
            java.lang.Object r3 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
            com.google.android.exoplayer2.audio.AudioTrackPositionTracker$Listener r3 = (com.google.android.exoplayer2.audio.AudioTrackPositionTracker.Listener) r3
            r2.listener = r3
            int r3 = com.google.android.exoplayer2.util.Util.SDK_INT
            r0 = 18
            if (r3 < r0) goto L1c
            java.lang.Class<android.media.AudioTrack> r3 = android.media.AudioTrack.class
            java.lang.String r0 = "getLatency"
            r1 = 0
            java.lang.reflect.Method r3 = r3.getMethod(r0, r1)     // Catch: java.lang.NoSuchMethodException -> L1c
            r2.getLatencyMethod = r3     // Catch: java.lang.NoSuchMethodException -> L1c
        L1c:
            r3 = 10
            long[] r3 = new long[r3]
            r2.playheadOffsets = r3
            return
    }

    private boolean forceHasPendingData() {
            r5 = this;
            boolean r0 = r5.needsPassthroughWorkarounds
            if (r0 == 0) goto L1f
            android.media.AudioTrack r0 = r5.audioTrack
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            android.media.AudioTrack r0 = (android.media.AudioTrack) r0
            int r0 = r0.getPlayState()
            r1 = 2
            if (r0 != r1) goto L1f
            long r0 = r5.getPlaybackHeadPosition()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            return r0
    }

    private long framesToDurationUs(long r3) {
            r2 = this;
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 * r0
            int r0 = r2.outputSampleRate
            long r0 = (long) r0
            long r3 = r3 / r0
            return r3
    }

    private long getPlaybackHeadPosition() {
            r7 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r7.stopTimestampUs
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L2d
            r4 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r4
            long r0 = r0 - r2
            float r2 = r7.audioTrackPlaybackSpeed
            long r0 = com.google.android.exoplayer2.util.Util.getMediaDurationForPlayoutDuration(r0, r2)
            int r2 = r7.outputSampleRate
            long r2 = (long) r2
            long r0 = r0 * r2
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 / r2
            long r2 = r7.endPlaybackHeadPosition
            long r4 = r7.stopPlaybackHeadPosition
            long r4 = r4 + r0
            long r0 = java.lang.Math.min(r2, r4)
            return r0
        L2d:
            long r2 = r7.lastRawPlaybackHeadPositionSampleTimeMs
            long r2 = r0 - r2
            r4 = 5
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L3c
            r7.updateRawPlaybackHeadPosition(r0)
            r7.lastRawPlaybackHeadPositionSampleTimeMs = r0
        L3c:
            long r0 = r7.rawPlaybackHeadPosition
            long r2 = r7.rawPlaybackHeadWrapCount
            r4 = 32
            long r2 = r2 << r4
            long r0 = r0 + r2
            return r0
    }

    private long getPlaybackHeadPositionUs() {
            r2 = this;
            long r0 = r2.getPlaybackHeadPosition()
            long r0 = r2.framesToDurationUs(r0)
            return r0
    }

    private void maybePollAndCheckTimestamp(long r13) {
            r12 = this;
            com.google.android.exoplayer2.audio.AudioTimestampPoller r0 = r12.audioTimestampPoller
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.audio.AudioTimestampPoller r0 = (com.google.android.exoplayer2.audio.AudioTimestampPoller) r0
            boolean r1 = r0.maybePollTimestamp(r13)
            if (r1 != 0) goto Lf
            return
        Lf:
            long r5 = r0.getTimestampSystemTimeUs()
            long r3 = r0.getTimestampPositionFrames()
            long r9 = r12.getPlaybackHeadPositionUs()
            long r1 = r5 - r13
            long r1 = java.lang.Math.abs(r1)
            r7 = 5000000(0x4c4b40, double:2.470328E-317)
            int r11 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r11 <= 0) goto L32
            com.google.android.exoplayer2.audio.AudioTrackPositionTracker$Listener r2 = r12.listener
            r7 = r13
            r2.onSystemTimeUsMismatch(r3, r5, r7, r9)
            r0.rejectTimestamp()
            goto L4c
        L32:
            long r1 = r12.framesToDurationUs(r3)
            long r1 = r1 - r9
            long r1 = java.lang.Math.abs(r1)
            int r11 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r11 <= 0) goto L49
            com.google.android.exoplayer2.audio.AudioTrackPositionTracker$Listener r2 = r12.listener
            r7 = r13
            r2.onPositionFramesMismatch(r3, r5, r7, r9)
            r0.rejectTimestamp()
            goto L4c
        L49:
            r0.acceptTimestamp()
        L4c:
            return
    }

    private void maybeSampleSyncParams() {
            r11 = this;
            long r0 = java.lang.System.nanoTime()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            long r2 = r11.lastPlayheadSampleTimeUs
            long r2 = r0 - r2
            r4 = 30000(0x7530, double:1.4822E-319)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L51
            long r2 = r11.getPlaybackHeadPositionUs()
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L1c
            return
        L1c:
            long[] r6 = r11.playheadOffsets
            int r7 = r11.nextPlayheadOffsetIndex
            float r8 = r11.audioTrackPlaybackSpeed
            long r2 = com.google.android.exoplayer2.util.Util.getPlayoutDurationForMediaDuration(r2, r8)
            long r2 = r2 - r0
            r6[r7] = r2
            int r2 = r11.nextPlayheadOffsetIndex
            int r2 = r2 + 1
            r3 = 10
            int r2 = r2 % r3
            r11.nextPlayheadOffsetIndex = r2
            int r2 = r11.playheadOffsetCount
            if (r2 >= r3) goto L3a
            int r2 = r2 + 1
            r11.playheadOffsetCount = r2
        L3a:
            r11.lastPlayheadSampleTimeUs = r0
            r11.smoothedPlayheadOffsetUs = r4
            r2 = 0
        L3f:
            int r3 = r11.playheadOffsetCount
            if (r2 >= r3) goto L51
            long r4 = r11.smoothedPlayheadOffsetUs
            long[] r6 = r11.playheadOffsets
            r7 = r6[r2]
            long r9 = (long) r3
            long r7 = r7 / r9
            long r7 = r7 + r4
            r11.smoothedPlayheadOffsetUs = r7
            int r2 = r2 + 1
            goto L3f
        L51:
            boolean r2 = r11.needsPassthroughWorkarounds
            if (r2 == 0) goto L56
            return
        L56:
            r11.maybePollAndCheckTimestamp(r0)
            r11.maybeUpdateLatency(r0)
            return
    }

    private void maybeUpdateLatency(long r8) {
            r7 = this;
            boolean r0 = r7.isOutputPcm
            if (r0 == 0) goto L52
            java.lang.reflect.Method r0 = r7.getLatencyMethod
            if (r0 == 0) goto L52
            long r1 = r7.lastLatencySampleTimeUs
            long r1 = r8 - r1
            r3 = 500000(0x7a120, double:2.47033E-318)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L52
            android.media.AudioTrack r1 = r7.audioTrack     // Catch: java.lang.Exception -> L4d
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)     // Catch: java.lang.Exception -> L4d
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L4d
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L4d
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Exception -> L4d
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)     // Catch: java.lang.Exception -> L4d
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Exception -> L4d
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> L4d
            long r0 = (long) r0     // Catch: java.lang.Exception -> L4d
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            long r2 = r7.bufferSizeUs     // Catch: java.lang.Exception -> L4d
            long r0 = r0 - r2
            r7.latencyUs = r0     // Catch: java.lang.Exception -> L4d
            r2 = 0
            long r0 = java.lang.Math.max(r0, r2)     // Catch: java.lang.Exception -> L4d
            r7.latencyUs = r0     // Catch: java.lang.Exception -> L4d
            r4 = 5000000(0x4c4b40, double:2.470328E-317)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 <= 0) goto L50
            com.google.android.exoplayer2.audio.AudioTrackPositionTracker$Listener r4 = r7.listener     // Catch: java.lang.Exception -> L4d
            r4.onInvalidLatency(r0)     // Catch: java.lang.Exception -> L4d
            r7.latencyUs = r2     // Catch: java.lang.Exception -> L4d
            goto L50
        L4d:
            r0 = 0
            r7.getLatencyMethod = r0
        L50:
            r7.lastLatencySampleTimeUs = r8
        L52:
            return
    }

    private static boolean needsPassthroughWorkarounds(int r2) {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 23
            if (r0 >= r1) goto Le
            r0 = 5
            if (r2 == r0) goto Lc
            r0 = 6
            if (r2 != r0) goto Le
        Lc:
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    private void resetSyncParams() {
            r3 = this;
            r0 = 0
            r3.smoothedPlayheadOffsetUs = r0
            r2 = 0
            r3.playheadOffsetCount = r2
            r3.nextPlayheadOffsetIndex = r2
            r3.lastPlayheadSampleTimeUs = r0
            r3.lastSystemTimeUs = r0
            r3.previousModeSystemTimeUs = r0
            r3.notifiedPositionIncreasing = r2
            return
    }

    private void updateRawPlaybackHeadPosition(long r11) {
            r10 = this;
            android.media.AudioTrack r0 = r10.audioTrack
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            android.media.AudioTrack r0 = (android.media.AudioTrack) r0
            int r1 = r0.getPlayState()
            r2 = 1
            if (r1 != r2) goto L10
            return
        L10:
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r0 = r0.getPlaybackHeadPosition()
            long r4 = (long) r0
            long r2 = r2 & r4
            boolean r0 = r10.needsPassthroughWorkarounds
            r4 = 0
            if (r0 == 0) goto L2f
            r0 = 2
            if (r1 != r0) goto L2c
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L2c
            long r6 = r10.rawPlaybackHeadPosition
            r10.passthroughWorkaroundPauseOffset = r6
        L2c:
            long r6 = r10.passthroughWorkaroundPauseOffset
            long r2 = r2 + r6
        L2f:
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r6 = 29
            if (r0 > r6) goto L52
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L50
            long r8 = r10.rawPlaybackHeadPosition
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 <= 0) goto L50
            r0 = 3
            if (r1 != r0) goto L50
            long r0 = r10.forceResetWorkaroundTimeMs
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 != 0) goto L4f
            r10.forceResetWorkaroundTimeMs = r11
        L4f:
            return
        L50:
            r10.forceResetWorkaroundTimeMs = r6
        L52:
            long r11 = r10.rawPlaybackHeadPosition
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 <= 0) goto L5f
            long r11 = r10.rawPlaybackHeadWrapCount
            r0 = 1
            long r11 = r11 + r0
            r10.rawPlaybackHeadWrapCount = r11
        L5f:
            r10.rawPlaybackHeadPosition = r2
            return
    }

    public int getAvailableBufferSize(long r5) {
            r4 = this;
            long r0 = r4.getPlaybackHeadPosition()
            int r2 = r4.outputPcmFrameSize
            long r2 = (long) r2
            long r0 = r0 * r2
            long r5 = r5 - r0
            int r6 = (int) r5
            int r5 = r4.bufferSize
            int r5 = r5 - r6
            return r5
    }

    public long getCurrentPositionUs(boolean r18) {
            r17 = this;
            r0 = r17
            android.media.AudioTrack r1 = r0.audioTrack
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            android.media.AudioTrack r1 = (android.media.AudioTrack) r1
            int r1 = r1.getPlayState()
            r2 = 3
            if (r1 != r2) goto L14
            r17.maybeSampleSyncParams()
        L14:
            long r1 = java.lang.System.nanoTime()
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            com.google.android.exoplayer2.audio.AudioTimestampPoller r5 = r0.audioTimestampPoller
            java.lang.Object r5 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r5)
            com.google.android.exoplayer2.audio.AudioTimestampPoller r5 = (com.google.android.exoplayer2.audio.AudioTimestampPoller) r5
            boolean r6 = r5.hasAdvancingTimestamp()
            if (r6 == 0) goto L3f
            long r7 = r5.getTimestampPositionFrames()
            long r7 = r0.framesToDurationUs(r7)
            long r9 = r5.getTimestampSystemTimeUs()
            long r9 = r1 - r9
            float r5 = r0.audioTrackPlaybackSpeed
            long r9 = com.google.android.exoplayer2.util.Util.getMediaDurationForPlayoutDuration(r9, r5)
            long r9 = r9 + r7
            goto L5d
        L3f:
            int r5 = r0.playheadOffsetCount
            if (r5 != 0) goto L48
            long r7 = r17.getPlaybackHeadPositionUs()
            goto L51
        L48:
            long r7 = r0.smoothedPlayheadOffsetUs
            long r7 = r7 + r1
            float r5 = r0.audioTrackPlaybackSpeed
            long r7 = com.google.android.exoplayer2.util.Util.getMediaDurationForPlayoutDuration(r7, r5)
        L51:
            r9 = r7
            if (r18 != 0) goto L5d
            r7 = 0
            long r11 = r0.latencyUs
            long r9 = r9 - r11
            long r9 = java.lang.Math.max(r7, r9)
        L5d:
            boolean r5 = r0.lastSampleUsedGetTimestampMode
            if (r5 == r6) goto L69
            long r7 = r0.lastSystemTimeUs
            r0.previousModeSystemTimeUs = r7
            long r7 = r0.lastPositionUs
            r0.previousModePositionUs = r7
        L69:
            long r7 = r0.previousModeSystemTimeUs
            long r7 = r1 - r7
            r11 = 1000000(0xf4240, double:4.940656E-318)
            int r5 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r5 >= 0) goto L89
            long r13 = r0.previousModePositionUs
            float r5 = r0.audioTrackPlaybackSpeed
            long r15 = com.google.android.exoplayer2.util.Util.getMediaDurationForPlayoutDuration(r7, r5)
            long r15 = r15 + r13
            long r7 = r7 * r3
            long r7 = r7 / r11
            long r9 = r9 * r7
            long r7 = r3 - r7
            long r7 = r7 * r15
            long r7 = r7 + r9
            long r9 = r7 / r3
        L89:
            boolean r3 = r0.notifiedPositionIncreasing
            if (r3 != 0) goto Lb0
            long r3 = r0.lastPositionUs
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 <= 0) goto Lb0
            r5 = 1
            r0.notifiedPositionIncreasing = r5
            long r3 = r9 - r3
            long r3 = com.google.android.exoplayer2.util.Util.usToMs(r3)
            float r5 = r0.audioTrackPlaybackSpeed
            long r3 = com.google.android.exoplayer2.util.Util.getPlayoutDurationForMediaDuration(r3, r5)
            long r7 = java.lang.System.currentTimeMillis()
            long r3 = com.google.android.exoplayer2.util.Util.usToMs(r3)
            long r7 = r7 - r3
            com.google.android.exoplayer2.audio.AudioTrackPositionTracker$Listener r3 = r0.listener
            r3.onPositionAdvancing(r7)
        Lb0:
            r0.lastSystemTimeUs = r1
            r0.lastPositionUs = r9
            r0.lastSampleUsedGetTimestampMode = r6
            return r9
    }

    public void handleEndOfStream(long r5) {
            r4 = this;
            long r0 = r4.getPlaybackHeadPosition()
            r4.stopPlaybackHeadPosition = r0
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            r4.stopTimestampUs = r0
            r4.endPlaybackHeadPosition = r5
            return
    }

    public boolean hasPendingData(long r4) {
            r3 = this;
            long r0 = r3.getPlaybackHeadPosition()
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L11
            boolean r4 = r3.forceHasPendingData()
            if (r4 == 0) goto Lf
            goto L11
        Lf:
            r4 = 0
            goto L12
        L11:
            r4 = 1
        L12:
            return r4
    }

    public boolean isPlaying() {
            r2 = this;
            android.media.AudioTrack r0 = r2.audioTrack
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            android.media.AudioTrack r0 = (android.media.AudioTrack) r0
            int r0 = r0.getPlayState()
            r1 = 3
            if (r0 != r1) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }

    public boolean isStalled(long r6) {
            r5 = this;
            long r0 = r5.forceResetWorkaroundTimeMs
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L20
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 <= 0) goto L20
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r0 = r5.forceResetWorkaroundTimeMs
            long r6 = r6 - r0
            r0 = 200(0xc8, double:9.9E-322)
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 < 0) goto L20
            r6 = 1
            goto L21
        L20:
            r6 = 0
        L21:
            return r6
    }

    public boolean mayHandleBuffer(long r9) {
            r8 = this;
            android.media.AudioTrack r0 = r8.audioTrack
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            android.media.AudioTrack r0 = (android.media.AudioTrack) r0
            int r0 = r0.getPlayState()
            boolean r1 = r8.needsPassthroughWorkarounds
            r2 = 1
            if (r1 == 0) goto L25
            r1 = 2
            r3 = 0
            if (r0 != r1) goto L18
            r8.hasData = r3
            return r3
        L18:
            if (r0 != r2) goto L25
            long r4 = r8.getPlaybackHeadPosition()
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 != 0) goto L25
            return r3
        L25:
            boolean r1 = r8.hasData
            boolean r9 = r8.hasPendingData(r9)
            r8.hasData = r9
            if (r1 == 0) goto L40
            if (r9 != 0) goto L40
            if (r0 == r2) goto L40
            com.google.android.exoplayer2.audio.AudioTrackPositionTracker$Listener r9 = r8.listener
            int r10 = r8.bufferSize
            long r0 = r8.bufferSizeUs
            long r0 = com.google.android.exoplayer2.util.Util.usToMs(r0)
            r9.onUnderrun(r10, r0)
        L40:
            return r2
    }

    public boolean pause() {
            r5 = this;
            r5.resetSyncParams()
            long r0 = r5.stopTimestampUs
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L1b
            com.google.android.exoplayer2.audio.AudioTimestampPoller r0 = r5.audioTimestampPoller
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.audio.AudioTimestampPoller r0 = (com.google.android.exoplayer2.audio.AudioTimestampPoller) r0
            r0.reset()
            r0 = 1
            return r0
        L1b:
            r0 = 0
            return r0
    }

    public void reset() {
            r1 = this;
            r1.resetSyncParams()
            r0 = 0
            r1.audioTrack = r0
            r1.audioTimestampPoller = r0
            return
    }

    public void setAudioTrack(android.media.AudioTrack r3, boolean r4, int r5, int r6, int r7) {
            r2 = this;
            r2.audioTrack = r3
            r2.outputPcmFrameSize = r6
            r2.bufferSize = r7
            com.google.android.exoplayer2.audio.AudioTimestampPoller r0 = new com.google.android.exoplayer2.audio.AudioTimestampPoller
            r0.<init>(r3)
            r2.audioTimestampPoller = r0
            int r3 = r3.getSampleRate()
            r2.outputSampleRate = r3
            r3 = 0
            if (r4 == 0) goto L1e
            boolean r4 = needsPassthroughWorkarounds(r5)
            if (r4 == 0) goto L1e
            r4 = 1
            goto L1f
        L1e:
            r4 = 0
        L1f:
            r2.needsPassthroughWorkarounds = r4
            boolean r4 = com.google.android.exoplayer2.util.Util.isEncodingLinearPcm(r5)
            r2.isOutputPcm = r4
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L35
            int r7 = r7 / r6
            long r4 = (long) r7
            long r4 = r2.framesToDurationUs(r4)
            goto L36
        L35:
            r4 = r0
        L36:
            r2.bufferSizeUs = r4
            r4 = 0
            r2.rawPlaybackHeadPosition = r4
            r2.rawPlaybackHeadWrapCount = r4
            r2.passthroughWorkaroundPauseOffset = r4
            r2.hasData = r3
            r2.stopTimestampUs = r0
            r2.forceResetWorkaroundTimeMs = r0
            r2.lastLatencySampleTimeUs = r4
            r2.latencyUs = r4
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.audioTrackPlaybackSpeed = r3
            return
    }

    public void setAudioTrackPlaybackSpeed(float r1) {
            r0 = this;
            r0.audioTrackPlaybackSpeed = r1
            com.google.android.exoplayer2.audio.AudioTimestampPoller r1 = r0.audioTimestampPoller
            if (r1 == 0) goto L9
            r1.reset()
        L9:
            r0.resetSyncParams()
            return
    }

    public void start() {
            r1 = this;
            com.google.android.exoplayer2.audio.AudioTimestampPoller r0 = r1.audioTimestampPoller
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.audio.AudioTimestampPoller r0 = (com.google.android.exoplayer2.audio.AudioTimestampPoller) r0
            r0.reset()
            return
    }
}
