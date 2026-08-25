package com.google.android.exoplayer2.video;

/* JADX INFO: loaded from: classes.dex */
public abstract class DecoderVideoRenderer extends com.google.android.exoplayer2.BaseRenderer {
    private static final int REINITIALIZATION_STATE_NONE = 0;
    private static final int REINITIALIZATION_STATE_SIGNAL_END_OF_STREAM = 1;
    private static final int REINITIALIZATION_STATE_WAIT_END_OF_STREAM = 2;
    private static final java.lang.String TAG = "DecoderVideoRenderer";
    private final long allowedJoiningTimeMs;
    private int buffersInCodecCount;
    private int consecutiveDroppedFrameCount;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.decoder.Decoder<com.google.android.exoplayer2.decoder.DecoderInputBuffer, ? extends com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer, ? extends com.google.android.exoplayer2.decoder.DecoderException> decoder;
    public com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.drm.DrmSession decoderDrmSession;
    private boolean decoderReceivedBuffers;
    private int decoderReinitializationState;
    private long droppedFrameAccumulationStartTimeMs;
    private int droppedFrames;
    private final com.google.android.exoplayer2.video.VideoRendererEventListener.EventDispatcher eventDispatcher;
    private final com.google.android.exoplayer2.decoder.DecoderInputBuffer flagsOnlyBuffer;
    private final com.google.android.exoplayer2.util.TimedValueQueue<com.google.android.exoplayer2.Format> formatQueue;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.video.VideoFrameMetadataListener frameMetadataListener;
    private long initialPositionUs;
    private com.google.android.exoplayer2.decoder.DecoderInputBuffer inputBuffer;
    private com.google.android.exoplayer2.Format inputFormat;
    private boolean inputStreamEnded;
    private long joiningDeadlineMs;
    private long lastRenderTimeUs;
    private final int maxDroppedFramesToNotify;
    private boolean mayRenderFirstFrameAfterEnableIfNotStarted;

    @androidx.annotation.Nullable
    private java.lang.Object output;
    private com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer outputBuffer;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.video.VideoDecoderOutputBufferRenderer outputBufferRenderer;
    private com.google.android.exoplayer2.Format outputFormat;
    private int outputMode;
    private boolean outputStreamEnded;
    private long outputStreamOffsetUs;

    @androidx.annotation.Nullable
    private android.view.Surface outputSurface;
    private boolean renderedFirstFrameAfterEnable;
    private boolean renderedFirstFrameAfterReset;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.video.VideoSize reportedVideoSize;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.drm.DrmSession sourceDrmSession;
    private boolean waitingForFirstSampleInFormat;

    private void clearRenderedFirstFrame() {
            r1 = this;
            r0 = 0
            r1.renderedFirstFrameAfterReset = r0
            return
    }

    private void clearReportedVideoSize() {
            r1 = this;
            r0 = 0
            r1.reportedVideoSize = r0
            return
    }

    private boolean drainOutputBuffer(long r5, long r7) throws com.google.android.exoplayer2.ExoPlaybackException, com.google.android.exoplayer2.decoder.DecoderException {
            r4 = this;
            com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer r0 = r4.outputBuffer
            r1 = 0
            if (r0 != 0) goto L20
            com.google.android.exoplayer2.decoder.Decoder<com.google.android.exoplayer2.decoder.DecoderInputBuffer, ? extends com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer, ? extends com.google.android.exoplayer2.decoder.DecoderException> r0 = r4.decoder
            java.lang.Object r0 = r0.dequeueOutputBuffer()
            com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer r0 = (com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer) r0
            r4.outputBuffer = r0
            if (r0 != 0) goto L12
            return r1
        L12:
            com.google.android.exoplayer2.decoder.DecoderCounters r2 = r4.decoderCounters
            int r3 = r2.skippedOutputBufferCount
            int r0 = r0.skippedOutputBufferCount
            int r3 = r3 + r0
            r2.skippedOutputBufferCount = r3
            int r2 = r4.buffersInCodecCount
            int r2 = r2 - r0
            r4.buffersInCodecCount = r2
        L20:
            com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer r0 = r4.outputBuffer
            boolean r0 = r0.isEndOfStream()
            r2 = 0
            if (r0 == 0) goto L40
            int r5 = r4.decoderReinitializationState
            r6 = 2
            if (r5 != r6) goto L35
            r4.releaseDecoder()
            r4.maybeInitDecoder()
            goto L3f
        L35:
            com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer r5 = r4.outputBuffer
            r5.release()
            r4.outputBuffer = r2
            r5 = 1
            r4.outputStreamEnded = r5
        L3f:
            return r1
        L40:
            boolean r5 = r4.processOutputBuffer(r5, r7)
            if (r5 == 0) goto L52
            com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer r6 = r4.outputBuffer
            long r6 = r6.timeUs
            int r6 = r4.buffersInCodecCount
            int r6 = r6 + (-1)
            r4.buffersInCodecCount = r6
            r4.outputBuffer = r2
        L52:
            return r5
    }

    private boolean feedInputBuffer() throws com.google.android.exoplayer2.decoder.DecoderException, com.google.android.exoplayer2.ExoPlaybackException {
            r7 = this;
            com.google.android.exoplayer2.decoder.Decoder<com.google.android.exoplayer2.decoder.DecoderInputBuffer, ? extends com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer, ? extends com.google.android.exoplayer2.decoder.DecoderException> r0 = r7.decoder
            r1 = 0
            if (r0 == 0) goto L9b
            int r2 = r7.decoderReinitializationState
            r3 = 2
            if (r2 == r3) goto L9b
            boolean r2 = r7.inputStreamEnded
            if (r2 == 0) goto L10
            goto L9b
        L10:
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r2 = r7.inputBuffer
            if (r2 != 0) goto L1f
            java.lang.Object r0 = r0.dequeueInputBuffer()
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r0 = (com.google.android.exoplayer2.decoder.DecoderInputBuffer) r0
            r7.inputBuffer = r0
            if (r0 != 0) goto L1f
            return r1
        L1f:
            int r0 = r7.decoderReinitializationState
            r2 = 0
            r4 = 1
            if (r0 != r4) goto L37
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r0 = r7.inputBuffer
            r4 = 4
            r0.setFlags(r4)
            com.google.android.exoplayer2.decoder.Decoder<com.google.android.exoplayer2.decoder.DecoderInputBuffer, ? extends com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer, ? extends com.google.android.exoplayer2.decoder.DecoderException> r0 = r7.decoder
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r4 = r7.inputBuffer
            r0.queueInputBuffer(r4)
            r7.inputBuffer = r2
            r7.decoderReinitializationState = r3
            return r1
        L37:
            com.google.android.exoplayer2.FormatHolder r0 = r7.getFormatHolder()
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r3 = r7.inputBuffer
            int r3 = r7.readSource(r0, r3, r1)
            r5 = -5
            if (r3 == r5) goto L97
            r0 = -4
            if (r3 == r0) goto L51
            r0 = -3
            if (r3 != r0) goto L4b
            return r1
        L4b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L51:
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r0 = r7.inputBuffer
            boolean r0 = r0.isEndOfStream()
            if (r0 == 0) goto L65
            r7.inputStreamEnded = r4
            com.google.android.exoplayer2.decoder.Decoder<com.google.android.exoplayer2.decoder.DecoderInputBuffer, ? extends com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer, ? extends com.google.android.exoplayer2.decoder.DecoderException> r0 = r7.decoder
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r3 = r7.inputBuffer
            r0.queueInputBuffer(r3)
            r7.inputBuffer = r2
            return r1
        L65:
            boolean r0 = r7.waitingForFirstSampleInFormat
            if (r0 == 0) goto L76
            com.google.android.exoplayer2.util.TimedValueQueue<com.google.android.exoplayer2.Format> r0 = r7.formatQueue
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r3 = r7.inputBuffer
            long r5 = r3.timeUs
            com.google.android.exoplayer2.Format r3 = r7.inputFormat
            r0.add(r5, r3)
            r7.waitingForFirstSampleInFormat = r1
        L76:
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r0 = r7.inputBuffer
            r0.flip()
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r0 = r7.inputBuffer
            com.google.android.exoplayer2.Format r1 = r7.inputFormat
            r0.format = r1
            com.google.android.exoplayer2.decoder.Decoder<com.google.android.exoplayer2.decoder.DecoderInputBuffer, ? extends com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer, ? extends com.google.android.exoplayer2.decoder.DecoderException> r1 = r7.decoder
            r1.queueInputBuffer(r0)
            int r0 = r7.buffersInCodecCount
            int r0 = r0 + r4
            r7.buffersInCodecCount = r0
            r7.decoderReceivedBuffers = r4
            com.google.android.exoplayer2.decoder.DecoderCounters r0 = r7.decoderCounters
            int r1 = r0.queuedInputBufferCount
            int r1 = r1 + r4
            r0.queuedInputBufferCount = r1
            r7.inputBuffer = r2
            return r4
        L97:
            r7.onInputFormatChanged(r0)
            return r4
        L9b:
            return r1
    }

    private boolean hasOutput() {
            r2 = this;
            int r0 = r2.outputMode
            r1 = -1
            if (r0 == r1) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    private static boolean isBufferLate(long r3) {
            r0 = -30000(0xffffffffffff8ad0, double:NaN)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 >= 0) goto L8
            r3 = 1
            goto L9
        L8:
            r3 = 0
        L9:
            return r3
    }

    private static boolean isBufferVeryLate(long r3) {
            r0 = -500000(0xfffffffffff85ee0, double:NaN)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 >= 0) goto L9
            r3 = 1
            goto La
        L9:
            r3 = 0
        La:
            return r3
    }

    private void maybeInitDecoder() throws com.google.android.exoplayer2.ExoPlaybackException {
            r11 = this;
            com.google.android.exoplayer2.decoder.Decoder<com.google.android.exoplayer2.decoder.DecoderInputBuffer, ? extends com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer, ? extends com.google.android.exoplayer2.decoder.DecoderException> r0 = r11.decoder
            if (r0 == 0) goto L5
            return
        L5:
            com.google.android.exoplayer2.drm.DrmSession r0 = r11.sourceDrmSession
            r11.setDecoderDrmSession(r0)
            com.google.android.exoplayer2.drm.DrmSession r0 = r11.decoderDrmSession
            if (r0 == 0) goto L1e
            com.google.android.exoplayer2.decoder.CryptoConfig r0 = r0.getCryptoConfig()
            if (r0 != 0) goto L1e
            com.google.android.exoplayer2.drm.DrmSession r0 = r11.decoderDrmSession
            com.google.android.exoplayer2.drm.DrmSession$DrmSessionException r0 = r0.getError()
            if (r0 == 0) goto L1d
            goto L1e
        L1d:
            return
        L1e:
            r0 = 0
            r1 = 4001(0xfa1, float:5.607E-42)
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.OutOfMemoryError -> L4a com.google.android.exoplayer2.decoder.DecoderException -> L52
            com.google.android.exoplayer2.Format r4 = r11.inputFormat     // Catch: java.lang.OutOfMemoryError -> L4a com.google.android.exoplayer2.decoder.DecoderException -> L52
            com.google.android.exoplayer2.decoder.Decoder r4 = r11.createDecoder(r4)     // Catch: java.lang.OutOfMemoryError -> L4a com.google.android.exoplayer2.decoder.DecoderException -> L52
            r11.decoder = r4     // Catch: java.lang.OutOfMemoryError -> L4a com.google.android.exoplayer2.decoder.DecoderException -> L52
            r11.setDecoderOutputMode()     // Catch: java.lang.OutOfMemoryError -> L4a com.google.android.exoplayer2.decoder.DecoderException -> L52
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.OutOfMemoryError -> L4a com.google.android.exoplayer2.decoder.DecoderException -> L52
            com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher r5 = r11.eventDispatcher     // Catch: java.lang.OutOfMemoryError -> L4a com.google.android.exoplayer2.decoder.DecoderException -> L52
            com.google.android.exoplayer2.decoder.Decoder<com.google.android.exoplayer2.decoder.DecoderInputBuffer, ? extends com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer, ? extends com.google.android.exoplayer2.decoder.DecoderException> r4 = r11.decoder     // Catch: java.lang.OutOfMemoryError -> L4a com.google.android.exoplayer2.decoder.DecoderException -> L52
            java.lang.String r6 = r4.getName()     // Catch: java.lang.OutOfMemoryError -> L4a com.google.android.exoplayer2.decoder.DecoderException -> L52
            long r9 = r7 - r2
            r5.decoderInitialized(r6, r7, r9)     // Catch: java.lang.OutOfMemoryError -> L4a com.google.android.exoplayer2.decoder.DecoderException -> L52
            com.google.android.exoplayer2.decoder.DecoderCounters r2 = r11.decoderCounters     // Catch: java.lang.OutOfMemoryError -> L4a com.google.android.exoplayer2.decoder.DecoderException -> L52
            int r3 = r2.decoderInitCount     // Catch: java.lang.OutOfMemoryError -> L4a com.google.android.exoplayer2.decoder.DecoderException -> L52
            int r3 = r3 + 1
            r2.decoderInitCount = r3     // Catch: java.lang.OutOfMemoryError -> L4a com.google.android.exoplayer2.decoder.DecoderException -> L52
            return
        L4a:
            r2 = move-exception
            com.google.android.exoplayer2.Format r3 = r11.inputFormat
            com.google.android.exoplayer2.ExoPlaybackException r0 = r11.createRendererException(r2, r3, r0, r1)
            throw r0
        L52:
            r2 = move-exception
            java.lang.String r3 = "DecoderVideoRenderer"
            java.lang.String r4 = "Video codec error"
            com.google.android.exoplayer2.util.Log.e(r3, r4, r2)
            com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher r3 = r11.eventDispatcher
            r3.videoCodecError(r2)
            com.google.android.exoplayer2.Format r3 = r11.inputFormat
            com.google.android.exoplayer2.ExoPlaybackException r0 = r11.createRendererException(r2, r3, r0, r1)
            throw r0
    }

    private void maybeNotifyDroppedFrames() {
            r6 = this;
            int r0 = r6.droppedFrames
            if (r0 <= 0) goto L18
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r6.droppedFrameAccumulationStartTimeMs
            long r2 = r0 - r2
            com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher r4 = r6.eventDispatcher
            int r5 = r6.droppedFrames
            r4.droppedFrames(r5, r2)
            r2 = 0
            r6.droppedFrames = r2
            r6.droppedFrameAccumulationStartTimeMs = r0
        L18:
            return
    }

    private void maybeNotifyRenderedFirstFrame() {
            r2 = this;
            r0 = 1
            r2.renderedFirstFrameAfterEnable = r0
            boolean r1 = r2.renderedFirstFrameAfterReset
            if (r1 != 0) goto L10
            r2.renderedFirstFrameAfterReset = r0
            com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher r0 = r2.eventDispatcher
            java.lang.Object r1 = r2.output
            r0.renderedFirstFrame(r1)
        L10:
            return
    }

    private void maybeNotifyVideoSizeChanged(int r3, int r4) {
            r2 = this;
            com.google.android.exoplayer2.video.VideoSize r0 = r2.reportedVideoSize
            if (r0 == 0) goto Lc
            int r1 = r0.width
            if (r1 != r3) goto Lc
            int r0 = r0.height
            if (r0 == r4) goto L18
        Lc:
            com.google.android.exoplayer2.video.VideoSize r0 = new com.google.android.exoplayer2.video.VideoSize
            r0.<init>(r3, r4)
            r2.reportedVideoSize = r0
            com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher r3 = r2.eventDispatcher
            r3.videoSizeChanged(r0)
        L18:
            return
    }

    private void maybeRenotifyRenderedFirstFrame() {
            r2 = this;
            boolean r0 = r2.renderedFirstFrameAfterReset
            if (r0 == 0) goto Lb
            com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher r0 = r2.eventDispatcher
            java.lang.Object r1 = r2.output
            r0.renderedFirstFrame(r1)
        Lb:
            return
    }

    private void maybeRenotifyVideoSizeChanged() {
            r2 = this;
            com.google.android.exoplayer2.video.VideoSize r0 = r2.reportedVideoSize
            if (r0 == 0) goto L9
            com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher r1 = r2.eventDispatcher
            r1.videoSizeChanged(r0)
        L9:
            return
    }

    private void onOutputChanged() {
            r2 = this;
            r2.maybeRenotifyVideoSizeChanged()
            r2.clearRenderedFirstFrame()
            int r0 = r2.getState()
            r1 = 2
            if (r0 != r1) goto L10
            r2.setJoiningDeadlineMs()
        L10:
            return
    }

    private void onOutputRemoved() {
            r0 = this;
            r0.clearReportedVideoSize()
            r0.clearRenderedFirstFrame()
            return
    }

    private void onOutputReset() {
            r0 = this;
            r0.maybeRenotifyVideoSizeChanged()
            r0.maybeRenotifyRenderedFirstFrame()
            return
    }

    private boolean processOutputBuffer(long r11, long r13) throws com.google.android.exoplayer2.ExoPlaybackException, com.google.android.exoplayer2.decoder.DecoderException {
            r10 = this;
            long r13 = r10.initialPositionUs
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 != 0) goto Ld
            r10.initialPositionUs = r11
        Ld:
            com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer r13 = r10.outputBuffer
            long r13 = r13.timeUs
            long r13 = r13 - r11
            boolean r0 = r10.hasOutput()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L2e
            boolean r11 = isBufferLate(r13)
            if (r11 == 0) goto L2d
            com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer r11 = r10.outputBuffer
            com.google.android.exoplayer2.decoder.DecoderCounters r12 = r10.decoderCounters
            int r13 = r12.skippedOutputBufferCount
            int r13 = r13 + r2
            r12.skippedOutputBufferCount = r13
            r11.release()
            return r2
        L2d:
            return r1
        L2e:
            com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer r0 = r10.outputBuffer
            long r3 = r0.timeUs
            long r5 = r10.outputStreamOffsetUs
            long r3 = r3 - r5
            com.google.android.exoplayer2.util.TimedValueQueue<com.google.android.exoplayer2.Format> r0 = r10.formatQueue
            java.lang.Object r0 = r0.pollFloor(r3)
            com.google.android.exoplayer2.Format r0 = (com.google.android.exoplayer2.Format) r0
            if (r0 == 0) goto L41
            r10.outputFormat = r0
        L41:
            long r5 = android.os.SystemClock.elapsedRealtime()
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r7
            long r7 = r10.lastRenderTimeUs
            long r5 = r5 - r7
            int r0 = r10.getState()
            r7 = 2
            if (r0 != r7) goto L55
            r0 = 1
            goto L56
        L55:
            r0 = 0
        L56:
            boolean r7 = r10.renderedFirstFrameAfterEnable
            if (r7 != 0) goto L61
            if (r0 != 0) goto L65
            boolean r7 = r10.mayRenderFirstFrameAfterEnableIfNotStarted
            if (r7 == 0) goto L67
            goto L65
        L61:
            boolean r7 = r10.renderedFirstFrameAfterReset
            if (r7 != 0) goto L67
        L65:
            r7 = 1
            goto L68
        L67:
            r7 = 0
        L68:
            if (r7 != 0) goto Lc7
            if (r0 == 0) goto L7f
            boolean r7 = isBufferLate(r13)
            if (r7 == 0) goto L7b
            r7 = 100000(0x186a0, double:4.94066E-319)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L7b
            r5 = 1
            goto L7c
        L7b:
            r5 = 0
        L7c:
            if (r5 == 0) goto L7f
            goto Lc7
        L7f:
            if (r0 == 0) goto Lc6
            long r5 = r10.initialPositionUs
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 != 0) goto L88
            goto Lc6
        L88:
            boolean r0 = isBufferVeryLate(r13)
            if (r0 == 0) goto La9
            int r11 = r10.skipSource(r11)
            if (r11 != 0) goto L96
            r11 = 0
            goto La6
        L96:
            com.google.android.exoplayer2.decoder.DecoderCounters r12 = r10.decoderCounters
            int r0 = r12.droppedToKeyframeCount
            int r0 = r0 + r2
            r12.droppedToKeyframeCount = r0
            int r12 = r10.buffersInCodecCount
            r10.updateDroppedBufferCounters(r11, r12)
            r10.flushDecoder()
            r11 = 1
        La6:
            if (r11 == 0) goto La9
            return r1
        La9:
            boolean r11 = isBufferLate(r13)
            if (r11 == 0) goto Lb8
            com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer r11 = r10.outputBuffer
            r10.updateDroppedBufferCounters(r1, r2)
            r11.release()
            return r2
        Lb8:
            r11 = 30000(0x7530, double:1.4822E-319)
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 >= 0) goto Lc6
            com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer r11 = r10.outputBuffer
            com.google.android.exoplayer2.Format r12 = r10.outputFormat
            r10.renderOutputBuffer(r11, r3, r12)
            return r2
        Lc6:
            return r1
        Lc7:
            com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer r11 = r10.outputBuffer
            com.google.android.exoplayer2.Format r12 = r10.outputFormat
            r10.renderOutputBuffer(r11, r3, r12)
            return r2
    }

    private void setDecoderDrmSession(@androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmSession r2) {
            r1 = this;
            com.google.android.exoplayer2.drm.DrmSession r0 = r1.decoderDrmSession
            com.google.android.exoplayer2.drm.DrmSession.CC.replaceSession(r0, r2)
            r1.decoderDrmSession = r2
            return
    }

    private void setJoiningDeadlineMs() {
            r5 = this;
            long r0 = r5.allowedJoiningTimeMs
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L10
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r5.allowedJoiningTimeMs
            long r0 = r0 + r2
            goto L15
        L10:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L15:
            r5.joiningDeadlineMs = r0
            return
    }

    private void setSourceDrmSession(@androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmSession r2) {
            r1 = this;
            com.google.android.exoplayer2.drm.DrmSession r0 = r1.sourceDrmSession
            com.google.android.exoplayer2.drm.DrmSession.CC.replaceSession(r0, r2)
            r1.sourceDrmSession = r2
            return
    }

    public abstract com.google.android.exoplayer2.decoder.Decoder createDecoder(com.google.android.exoplayer2.Format r1) throws com.google.android.exoplayer2.decoder.DecoderException;

    @androidx.annotation.CallSuper
    public final void flushDecoder() throws com.google.android.exoplayer2.ExoPlaybackException {
            r3 = this;
            r0 = 0
            r3.buffersInCodecCount = r0
            int r1 = r3.decoderReinitializationState
            if (r1 == 0) goto Le
            r3.releaseDecoder()
            r3.maybeInitDecoder()
            goto L21
        Le:
            r1 = 0
            r3.inputBuffer = r1
            com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer r2 = r3.outputBuffer
            if (r2 == 0) goto L1a
            r2.release()
            r3.outputBuffer = r1
        L1a:
            com.google.android.exoplayer2.decoder.Decoder<com.google.android.exoplayer2.decoder.DecoderInputBuffer, ? extends com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer, ? extends com.google.android.exoplayer2.decoder.DecoderException> r1 = r3.decoder
            r1.flush()
            r3.decoderReceivedBuffers = r0
        L21:
            return
    }

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.PlayerMessage.Target
    public void handleMessage(int r3, @androidx.annotation.Nullable java.lang.Object r4) throws com.google.android.exoplayer2.ExoPlaybackException {
            r2 = this;
            r0 = 1
            if (r3 != r0) goto L46
            boolean r3 = r4 instanceof android.view.Surface
            r1 = 0
            if (r3 == 0) goto L12
            r3 = r4
            android.view.Surface r3 = (android.view.Surface) r3
            r2.outputSurface = r3
            r2.outputBufferRenderer = r1
            r2.outputMode = r0
            goto L29
        L12:
            boolean r3 = r4 instanceof com.google.android.exoplayer2.video.VideoDecoderOutputBufferRenderer
            if (r3 == 0) goto L21
            r2.outputSurface = r1
            r3 = r4
            com.google.android.exoplayer2.video.VideoDecoderOutputBufferRenderer r3 = (com.google.android.exoplayer2.video.VideoDecoderOutputBufferRenderer) r3
            r2.outputBufferRenderer = r3
            r3 = 0
            r2.outputMode = r3
            goto L29
        L21:
            r2.outputSurface = r1
            r2.outputBufferRenderer = r1
            r3 = -1
            r2.outputMode = r3
            r4 = r1
        L29:
            java.lang.Object r3 = r2.output
            if (r3 == r4) goto L40
            r2.output = r4
            if (r4 == 0) goto L3c
            com.google.android.exoplayer2.decoder.Decoder<com.google.android.exoplayer2.decoder.DecoderInputBuffer, ? extends com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer, ? extends com.google.android.exoplayer2.decoder.DecoderException> r3 = r2.decoder
            if (r3 == 0) goto L38
            r2.setDecoderOutputMode()
        L38:
            r2.onOutputChanged()
            goto L51
        L3c:
            r2.onOutputRemoved()
            goto L51
        L40:
            if (r4 == 0) goto L51
            r2.onOutputReset()
            goto L51
        L46:
            r0 = 7
            if (r3 != r0) goto L4e
            com.google.android.exoplayer2.video.VideoFrameMetadataListener r4 = (com.google.android.exoplayer2.video.VideoFrameMetadataListener) r4
            r2.frameMetadataListener = r4
            goto L51
        L4e:
            super.handleMessage(r3, r4)
        L51:
            return
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isEnded() {
            r1 = this;
            boolean r0 = r1.outputStreamEnded
            return r0
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isReady() {
            r9 = this;
            com.google.android.exoplayer2.Format r0 = r9.inputFormat
            r1 = 1
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L21
            boolean r0 = r9.isSourceReady()
            if (r0 != 0) goto L14
            com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer r0 = r9.outputBuffer
            if (r0 == 0) goto L21
        L14:
            boolean r0 = r9.renderedFirstFrameAfterReset
            if (r0 != 0) goto L1e
            boolean r0 = r9.hasOutput()
            if (r0 != 0) goto L21
        L1e:
            r9.joiningDeadlineMs = r2
            return r1
        L21:
            long r4 = r9.joiningDeadlineMs
            r0 = 0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L29
            return r0
        L29:
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r6 = r9.joiningDeadlineMs
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L34
            return r1
        L34:
            r9.joiningDeadlineMs = r2
            return r0
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public final void onDisabled() {
            r3 = this;
            r0 = 0
            r3.inputFormat = r0
            r3.clearReportedVideoSize()
            r3.clearRenderedFirstFrame()
            r3.setSourceDrmSession(r0)     // Catch: java.lang.Throwable -> L17
            r3.releaseDecoder()     // Catch: java.lang.Throwable -> L17
            com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher r0 = r3.eventDispatcher
            com.google.android.exoplayer2.decoder.DecoderCounters r1 = r3.decoderCounters
            r0.disabled(r1)
            return
        L17:
            r0 = move-exception
            com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher r1 = r3.eventDispatcher
            com.google.android.exoplayer2.decoder.DecoderCounters r2 = r3.decoderCounters
            r1.disabled(r2)
            throw r0
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public final void onEnabled(boolean r2, boolean r3) throws com.google.android.exoplayer2.ExoPlaybackException {
            r1 = this;
            com.google.android.exoplayer2.decoder.DecoderCounters r2 = new com.google.android.exoplayer2.decoder.DecoderCounters
            r2.<init>()
            r1.decoderCounters = r2
            com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher r0 = r1.eventDispatcher
            r0.enabled(r2)
            r1.mayRenderFirstFrameAfterEnableIfNotStarted = r3
            r2 = 0
            r1.renderedFirstFrameAfterEnable = r2
            return
    }

    @androidx.annotation.CallSuper
    public final void onInputFormatChanged(com.google.android.exoplayer2.FormatHolder r9) throws com.google.android.exoplayer2.ExoPlaybackException {
            r8 = this;
            r0 = 1
            r8.waitingForFirstSampleInFormat = r0
            com.google.android.exoplayer2.Format r1 = r9.format
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            r5 = r1
            com.google.android.exoplayer2.Format r5 = (com.google.android.exoplayer2.Format) r5
            com.google.android.exoplayer2.drm.DrmSession r9 = r9.drmSession
            r8.setSourceDrmSession(r9)
            com.google.android.exoplayer2.Format r4 = r8.inputFormat
            r8.inputFormat = r5
            com.google.android.exoplayer2.decoder.Decoder<com.google.android.exoplayer2.decoder.DecoderInputBuffer, ? extends com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer, ? extends com.google.android.exoplayer2.decoder.DecoderException> r9 = r8.decoder
            if (r9 != 0) goto L25
            r8.maybeInitDecoder()
            com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher r9 = r8.eventDispatcher
            com.google.android.exoplayer2.Format r0 = r8.inputFormat
            r1 = 0
            r9.inputFormatChanged(r0, r1)
            return
        L25:
            com.google.android.exoplayer2.drm.DrmSession r1 = r8.sourceDrmSession
            com.google.android.exoplayer2.drm.DrmSession r2 = r8.decoderDrmSession
            if (r1 == r2) goto L39
            com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r1 = new com.google.android.exoplayer2.decoder.DecoderReuseEvaluation
            java.lang.String r3 = r9.getName()
            r6 = 0
            r7 = 128(0x80, float:1.8E-43)
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            goto L45
        L39:
            java.lang.String r3 = r9.getName()
            com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r1 = new com.google.android.exoplayer2.decoder.DecoderReuseEvaluation
            r6 = 0
            r7 = 1
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)
        L45:
            int r9 = r1.result
            if (r9 != 0) goto L56
            boolean r9 = r8.decoderReceivedBuffers
            if (r9 == 0) goto L50
            r8.decoderReinitializationState = r0
            goto L56
        L50:
            r8.releaseDecoder()
            r8.maybeInitDecoder()
        L56:
            com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher r9 = r8.eventDispatcher
            com.google.android.exoplayer2.Format r0 = r8.inputFormat
            r9.inputFormatChanged(r0, r1)
            return
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public final void onPositionReset(long r3, boolean r5) throws com.google.android.exoplayer2.ExoPlaybackException {
            r2 = this;
            r3 = 0
            r2.inputStreamEnded = r3
            r2.outputStreamEnded = r3
            r2.clearRenderedFirstFrame()
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.initialPositionUs = r0
            r2.consecutiveDroppedFrameCount = r3
            com.google.android.exoplayer2.decoder.Decoder<com.google.android.exoplayer2.decoder.DecoderInputBuffer, ? extends com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer, ? extends com.google.android.exoplayer2.decoder.DecoderException> r3 = r2.decoder
            if (r3 == 0) goto L18
            r2.flushDecoder()
        L18:
            if (r5 == 0) goto L1e
            r2.setJoiningDeadlineMs()
            goto L20
        L1e:
            r2.joiningDeadlineMs = r0
        L20:
            com.google.android.exoplayer2.util.TimedValueQueue<com.google.android.exoplayer2.Format> r3 = r2.formatQueue
            r3.clear()
            return
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public final void onStarted() {
            r4 = this;
            r0 = 0
            r4.droppedFrames = r0
            long r0 = android.os.SystemClock.elapsedRealtime()
            r4.droppedFrameAccumulationStartTimeMs = r0
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            r4.lastRenderTimeUs = r0
            return
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public final void onStopped() {
            r2 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.joiningDeadlineMs = r0
            r2.maybeNotifyDroppedFrames()
            return
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public final void onStreamChanged(com.google.android.exoplayer2.Format[] r1, long r2, long r4) throws com.google.android.exoplayer2.ExoPlaybackException {
            r0 = this;
            r0.outputStreamOffsetUs = r4
            return
    }

    @androidx.annotation.CallSuper
    public final void releaseDecoder() {
            r4 = this;
            r0 = 0
            r4.inputBuffer = r0
            r4.outputBuffer = r0
            r1 = 0
            r4.decoderReinitializationState = r1
            r4.decoderReceivedBuffers = r1
            r4.buffersInCodecCount = r1
            com.google.android.exoplayer2.decoder.Decoder<com.google.android.exoplayer2.decoder.DecoderInputBuffer, ? extends com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer, ? extends com.google.android.exoplayer2.decoder.DecoderException> r1 = r4.decoder
            if (r1 == 0) goto L28
            com.google.android.exoplayer2.decoder.DecoderCounters r2 = r4.decoderCounters
            int r3 = r2.decoderReleaseCount
            int r3 = r3 + 1
            r2.decoderReleaseCount = r3
            r1.release()
            com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher r1 = r4.eventDispatcher
            com.google.android.exoplayer2.decoder.Decoder<com.google.android.exoplayer2.decoder.DecoderInputBuffer, ? extends com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer, ? extends com.google.android.exoplayer2.decoder.DecoderException> r2 = r4.decoder
            java.lang.String r2 = r2.getName()
            r1.decoderReleased(r2)
            r4.decoder = r0
        L28:
            r4.setDecoderDrmSession(r0)
            return
    }

    @Override // com.google.android.exoplayer2.Renderer
    public void render(long r4, long r6) throws com.google.android.exoplayer2.ExoPlaybackException {
            r3 = this;
            boolean r0 = r3.outputStreamEnded
            if (r0 == 0) goto L5
            return
        L5:
            com.google.android.exoplayer2.Format r0 = r3.inputFormat
            if (r0 != 0) goto L32
            com.google.android.exoplayer2.FormatHolder r0 = r3.getFormatHolder()
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r1 = r3.flagsOnlyBuffer
            r1.clear()
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r1 = r3.flagsOnlyBuffer
            r2 = 2
            int r1 = r3.readSource(r0, r1, r2)
            r2 = -5
            if (r1 != r2) goto L20
            r3.onInputFormatChanged(r0)
            goto L32
        L20:
            r4 = -4
            if (r1 != r4) goto L31
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r4 = r3.flagsOnlyBuffer
            boolean r4 = r4.isEndOfStream()
            com.google.android.exoplayer2.util.Assertions.checkState(r4)
            r4 = 1
            r3.inputStreamEnded = r4
            r3.outputStreamEnded = r4
        L31:
            return
        L32:
            r3.maybeInitDecoder()
            com.google.android.exoplayer2.decoder.Decoder<com.google.android.exoplayer2.decoder.DecoderInputBuffer, ? extends com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer, ? extends com.google.android.exoplayer2.decoder.DecoderException> r0 = r3.decoder
            if (r0 == 0) goto L6c
            java.lang.String r0 = "drainAndFeed"
            com.google.android.exoplayer2.util.TraceUtil.beginSection(r0)     // Catch: com.google.android.exoplayer2.decoder.DecoderException -> L55
        L3e:
            boolean r0 = r3.drainOutputBuffer(r4, r6)     // Catch: com.google.android.exoplayer2.decoder.DecoderException -> L55
            if (r0 == 0) goto L45
            goto L3e
        L45:
            boolean r4 = r3.feedInputBuffer()     // Catch: com.google.android.exoplayer2.decoder.DecoderException -> L55
            if (r4 == 0) goto L4c
            goto L45
        L4c:
            com.google.android.exoplayer2.util.TraceUtil.endSection()     // Catch: com.google.android.exoplayer2.decoder.DecoderException -> L55
            com.google.android.exoplayer2.decoder.DecoderCounters r4 = r3.decoderCounters
            r4.ensureUpdated()
            goto L6c
        L55:
            r4 = move-exception
            java.lang.String r5 = "DecoderVideoRenderer"
            java.lang.String r6 = "Video codec error"
            com.google.android.exoplayer2.util.Log.e(r5, r6, r4)
            com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher r5 = r3.eventDispatcher
            r5.videoCodecError(r4)
            com.google.android.exoplayer2.Format r5 = r3.inputFormat
            r6 = 4003(0xfa3, float:5.61E-42)
            r7 = 0
            com.google.android.exoplayer2.ExoPlaybackException r4 = r3.createRendererException(r4, r5, r7, r6)
            throw r4
        L6c:
            return
    }

    public final void renderOutputBuffer(com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer r8, long r9, com.google.android.exoplayer2.Format r11) throws com.google.android.exoplayer2.decoder.DecoderException {
            r7 = this;
            com.google.android.exoplayer2.video.VideoFrameMetadataListener r0 = r7.frameMetadataListener
            if (r0 == 0) goto Le
            long r3 = java.lang.System.nanoTime()
            r6 = 0
            r1 = r9
            r5 = r11
            r0.onVideoFrameAboutToBeRendered(r1, r3, r5, r6)
        Le:
            long r9 = android.os.SystemClock.elapsedRealtime()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 * r0
            long r9 = com.google.android.exoplayer2.util.Util.msToUs(r9)
            r7.lastRenderTimeUs = r9
            int r9 = r8.mode
            r10 = 1
            r11 = 0
            if (r9 != r10) goto L28
            android.view.Surface r0 = r7.outputSurface
            if (r0 == 0) goto L28
            r0 = 1
            goto L29
        L28:
            r0 = 0
        L29:
            if (r9 != 0) goto L31
            com.google.android.exoplayer2.video.VideoDecoderOutputBufferRenderer r9 = r7.outputBufferRenderer
            if (r9 == 0) goto L31
            r9 = 1
            goto L32
        L31:
            r9 = 0
        L32:
            if (r9 != 0) goto L3d
            if (r0 != 0) goto L3d
            r7.updateDroppedBufferCounters(r11, r10)
            r8.release()
            goto L5b
        L3d:
            int r0 = r8.width
            int r1 = r8.height
            r7.maybeNotifyVideoSizeChanged(r0, r1)
            if (r9 == 0) goto L4c
            com.google.android.exoplayer2.video.VideoDecoderOutputBufferRenderer r9 = r7.outputBufferRenderer
            r9.setOutputBuffer(r8)
            goto L4f
        L4c:
            r7.renderOutputBufferToSurface()
        L4f:
            r7.consecutiveDroppedFrameCount = r11
            com.google.android.exoplayer2.decoder.DecoderCounters r8 = r7.decoderCounters
            int r9 = r8.renderedOutputBufferCount
            int r9 = r9 + r10
            r8.renderedOutputBufferCount = r9
            r7.maybeNotifyRenderedFirstFrame()
        L5b:
            return
    }

    public abstract void renderOutputBufferToSurface() throws com.google.android.exoplayer2.decoder.DecoderException;

    public abstract void setDecoderOutputMode();

    public final void updateDroppedBufferCounters(int r3, int r4) {
            r2 = this;
            com.google.android.exoplayer2.decoder.DecoderCounters r0 = r2.decoderCounters
            int r1 = r0.droppedInputBufferCount
            int r1 = r1 + r3
            r0.droppedInputBufferCount = r1
            int r3 = r3 + r4
            int r4 = r0.droppedBufferCount
            int r4 = r4 + r3
            r0.droppedBufferCount = r4
            int r4 = r2.droppedFrames
            int r4 = r4 + r3
            r2.droppedFrames = r4
            int r4 = r2.consecutiveDroppedFrameCount
            int r4 = r4 + r3
            r2.consecutiveDroppedFrameCount = r4
            int r3 = r0.maxConsecutiveDroppedBufferCount
            int r3 = java.lang.Math.max(r4, r3)
            r0.maxConsecutiveDroppedBufferCount = r3
            int r3 = r2.maxDroppedFramesToNotify
            if (r3 <= 0) goto L2a
            int r4 = r2.droppedFrames
            if (r4 < r3) goto L2a
            r2.maybeNotifyDroppedFrames()
        L2a:
            return
    }
}
