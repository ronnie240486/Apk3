package com.google.android.exoplayer2.mediacodec;

/* JADX INFO: loaded from: classes.dex */
public abstract class MediaCodecRenderer extends com.google.android.exoplayer2.BaseRenderer {
    private static final byte[] ADAPTATION_WORKAROUND_BUFFER = null;
    private static final int ADAPTATION_WORKAROUND_MODE_ALWAYS = 2;
    private static final int ADAPTATION_WORKAROUND_MODE_NEVER = 0;
    private static final int ADAPTATION_WORKAROUND_MODE_SAME_RESOLUTION = 1;
    private static final int ADAPTATION_WORKAROUND_SLICE_WIDTH_HEIGHT = 32;
    private static final int DRAIN_ACTION_FLUSH = 1;
    private static final int DRAIN_ACTION_FLUSH_AND_UPDATE_DRM_SESSION = 2;
    private static final int DRAIN_ACTION_NONE = 0;
    private static final int DRAIN_ACTION_REINITIALIZE = 3;
    private static final int DRAIN_STATE_NONE = 0;
    private static final int DRAIN_STATE_SIGNAL_END_OF_STREAM = 1;
    private static final int DRAIN_STATE_WAIT_END_OF_STREAM = 2;
    private static final long MAX_CODEC_HOTSWAP_TIME_MS = 1000;
    private static final int RECONFIGURATION_STATE_NONE = 0;
    private static final int RECONFIGURATION_STATE_QUEUE_PENDING = 2;
    private static final int RECONFIGURATION_STATE_WRITE_PENDING = 1;
    private static final java.lang.String TAG = "MediaCodecRenderer";
    private final float assumedMinimumCodecOperatingRate;

    @androidx.annotation.Nullable
    private java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> availableCodecInfos;
    private final com.google.android.exoplayer2.decoder.DecoderInputBuffer buffer;
    private final com.google.android.exoplayer2.mediacodec.BatchBuffer bypassBatchBuffer;
    private boolean bypassDrainAndReinitialize;
    private boolean bypassEnabled;
    private final com.google.android.exoplayer2.decoder.DecoderInputBuffer bypassSampleBuffer;
    private boolean bypassSampleBufferPending;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.mediacodec.C2Mp3TimestampTracker c2Mp3TimestampTracker;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.mediacodec.MediaCodecAdapter codec;
    private int codecAdaptationWorkaroundMode;
    private final com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Factory codecAdapterFactory;
    private int codecDrainAction;
    private int codecDrainState;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.drm.DrmSession codecDrmSession;
    private boolean codecHasOutputMediaFormat;
    private long codecHotswapDeadlineMs;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.mediacodec.MediaCodecInfo codecInfo;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.Format codecInputFormat;
    private boolean codecNeedsAdaptationWorkaroundBuffer;
    private boolean codecNeedsDiscardToSpsWorkaround;
    private boolean codecNeedsEosBufferTimestampWorkaround;
    private boolean codecNeedsEosFlushWorkaround;
    private boolean codecNeedsEosOutputExceptionWorkaround;
    private boolean codecNeedsEosPropagation;
    private boolean codecNeedsFlushWorkaround;
    private boolean codecNeedsMonoChannelCountWorkaround;
    private boolean codecNeedsSosFlushWorkaround;
    private float codecOperatingRate;

    @androidx.annotation.Nullable
    private android.media.MediaFormat codecOutputMediaFormat;
    private boolean codecOutputMediaFormatChanged;
    private boolean codecReceivedBuffers;
    private boolean codecReceivedEos;
    private int codecReconfigurationState;
    private boolean codecReconfigured;
    private float currentPlaybackSpeed;
    private final java.util.ArrayList<java.lang.Long> decodeOnlyPresentationTimestamps;
    public com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters;
    private final boolean enableDecoderFallback;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.Format inputFormat;
    private int inputIndex;
    private boolean inputStreamEnded;
    private boolean isDecodeOnlyOutputBuffer;
    private boolean isLastOutputBuffer;
    private long largestQueuedPresentationTimeUs;
    private long lastBufferInStreamPresentationTimeUs;
    private long lastProcessedOutputBufferTimeUs;
    private final com.google.android.exoplayer2.mediacodec.MediaCodecSelector mediaCodecSelector;

    @androidx.annotation.Nullable
    private android.media.MediaCrypto mediaCrypto;
    private boolean mediaCryptoRequiresSecureDecoder;
    private boolean needToNotifyOutputFormatChangeAfterStreamChange;
    private final com.google.android.exoplayer2.decoder.DecoderInputBuffer noDataBuffer;

    @androidx.annotation.Nullable
    private java.nio.ByteBuffer outputBuffer;
    private final android.media.MediaCodec.BufferInfo outputBufferInfo;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.Format outputFormat;
    private int outputIndex;
    private boolean outputStreamEnded;
    private com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.OutputStreamInfo outputStreamInfo;
    private boolean pendingOutputEndOfStream;
    private final java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.OutputStreamInfo> pendingOutputStreamChanges;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.ExoPlaybackException pendingPlaybackException;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException preferredDecoderInitializationException;
    private long renderTimeLimitMs;
    private boolean shouldSkipAdaptationWorkaroundOutputBuffer;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.drm.DrmSession sourceDrmSession;
    private float targetPlaybackSpeed;
    private boolean waitingForFirstSampleInFormat;

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(31)
    public static final class Api31 {
        private Api31() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static void setLogSessionIdToMediaCodecFormat(com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Configuration r1, com.google.android.exoplayer2.analytics.PlayerId r2) {
                android.media.metrics.LogSessionId r2 = r2.getLogSessionId()
                android.media.metrics.LogSessionId r0 = android.media.metrics.LogSessionId.LOG_SESSION_ID_NONE
                boolean r0 = r2.equals(r0)
                if (r0 != 0) goto L17
                android.media.MediaFormat r1 = r1.mediaFormat
                java.lang.String r2 = r2.getStringId()
                java.lang.String r0 = "log-session-id"
                r1.setString(r0, r2)
            L17:
                return
        }
    }

    public static class DecoderInitializationException extends java.lang.Exception {
        private static final int CUSTOM_ERROR_CODE_BASE = -50000;
        private static final int DECODER_QUERY_ERROR = -49998;
        private static final int NO_SUITABLE_DECODER_ERROR = -49999;

        @androidx.annotation.Nullable
        public final com.google.android.exoplayer2.mediacodec.MediaCodecInfo codecInfo;

        @androidx.annotation.Nullable
        public final java.lang.String diagnosticInfo;

        @androidx.annotation.Nullable
        public final com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException fallbackDecoderInitializationException;
        public final java.lang.String mimeType;
        public final boolean secureDecoderRequired;

        public DecoderInitializationException(com.google.android.exoplayer2.Format r11, @androidx.annotation.Nullable java.lang.Throwable r12, boolean r13, int r14) {
                r10 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Decoder init failed: ["
                r0.append(r1)
                r0.append(r14)
                java.lang.String r1 = "], "
                r0.append(r1)
                r0.append(r11)
                java.lang.String r3 = r0.toString()
                java.lang.String r5 = r11.sampleMimeType
                java.lang.String r8 = buildCustomDiagnosticInfo(r14)
                r7 = 0
                r9 = 0
                r2 = r10
                r4 = r12
                r6 = r13
                r2.<init>(r3, r4, r5, r6, r7, r8, r9)
                return
        }

        public DecoderInitializationException(com.google.android.exoplayer2.Format r11, @androidx.annotation.Nullable java.lang.Throwable r12, boolean r13, com.google.android.exoplayer2.mediacodec.MediaCodecInfo r14) {
                r10 = this;
                java.lang.String r0 = "Decoder init failed: "
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                java.lang.String r1 = r14.name
                r0.append(r1)
                java.lang.String r1 = ", "
                r0.append(r1)
                r0.append(r11)
                java.lang.String r3 = r0.toString()
                java.lang.String r5 = r11.sampleMimeType
                int r11 = com.google.android.exoplayer2.util.Util.SDK_INT
                r0 = 21
                if (r11 < r0) goto L24
                java.lang.String r11 = getDiagnosticInfoV21(r12)
                goto L25
            L24:
                r11 = 0
            L25:
                r8 = r11
                r9 = 0
                r2 = r10
                r4 = r12
                r6 = r13
                r7 = r14
                r2.<init>(r3, r4, r5, r6, r7, r8, r9)
                return
        }

        private DecoderInitializationException(java.lang.String r1, @androidx.annotation.Nullable java.lang.Throwable r2, java.lang.String r3, boolean r4, @androidx.annotation.Nullable com.google.android.exoplayer2.mediacodec.MediaCodecInfo r5, @androidx.annotation.Nullable java.lang.String r6, @androidx.annotation.Nullable com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException r7) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.mimeType = r3
                r0.secureDecoderRequired = r4
                r0.codecInfo = r5
                r0.diagnosticInfo = r6
                r0.fallbackDecoderInitializationException = r7
                return
        }

        public static /* synthetic */ com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException access$000(com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException r0, com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException r1) {
                com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r0 = r0.copyWithFallbackException(r1)
                return r0
        }

        private static java.lang.String buildCustomDiagnosticInfo(int r2) {
                if (r2 >= 0) goto L5
                java.lang.String r0 = "neg_"
                goto L7
            L5:
                java.lang.String r0 = ""
            L7:
                java.lang.String r1 = "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_"
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m24m(r1, r0)
                int r2 = java.lang.Math.abs(r2)
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                return r2
        }

        @androidx.annotation.CheckResult
        private com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException copyWithFallbackException(com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException r10) {
                r9 = this;
                com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r8 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException
                java.lang.String r1 = r9.getMessage()
                java.lang.Throwable r2 = r9.getCause()
                java.lang.String r3 = r9.mimeType
                boolean r4 = r9.secureDecoderRequired
                com.google.android.exoplayer2.mediacodec.MediaCodecInfo r5 = r9.codecInfo
                java.lang.String r6 = r9.diagnosticInfo
                r0 = r8
                r7 = r10
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return r8
        }

        @androidx.annotation.Nullable
        @androidx.annotation.RequiresApi(21)
        private static java.lang.String getDiagnosticInfoV21(@androidx.annotation.Nullable java.lang.Throwable r1) {
                boolean r0 = r1 instanceof android.media.MediaCodec.CodecException
                if (r0 == 0) goto Lb
                android.media.MediaCodec$CodecException r1 = (android.media.MediaCodec.CodecException) r1
                java.lang.String r1 = r1.getDiagnosticInfo()
                return r1
            Lb:
                r1 = 0
                return r1
        }
    }

    public static final class OutputStreamInfo {
        public static final com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.OutputStreamInfo UNSET = null;
        public final com.google.android.exoplayer2.util.TimedValueQueue<com.google.android.exoplayer2.Format> formatQueue;
        public final long previousStreamLastBufferTimeUs;
        public final long startPositionUs;
        public final long streamOffsetUs;

        static {
                com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo r7 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo
                r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r0 = r7
                r0.<init>(r1, r3, r5)
                com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.OutputStreamInfo.UNSET = r7
                return
        }

        public OutputStreamInfo(long r1, long r3, long r5) {
                r0 = this;
                r0.<init>()
                r0.previousStreamLastBufferTimeUs = r1
                r0.startPositionUs = r3
                r0.streamOffsetUs = r5
                com.google.android.exoplayer2.util.TimedValueQueue r1 = new com.google.android.exoplayer2.util.TimedValueQueue
                r1.<init>()
                r0.formatQueue = r1
                return
        }
    }

    static {
            r0 = 38
            byte[] r0 = new byte[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120} // fill-array
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.ADAPTATION_WORKAROUND_BUFFER = r0
            return
    }

    public MediaCodecRenderer(int r1, com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Factory r2, com.google.android.exoplayer2.mediacodec.MediaCodecSelector r3, boolean r4, float r5) {
            r0 = this;
            r0.<init>(r1)
            r0.codecAdapterFactory = r2
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
            com.google.android.exoplayer2.mediacodec.MediaCodecSelector r1 = (com.google.android.exoplayer2.mediacodec.MediaCodecSelector) r1
            r0.mediaCodecSelector = r1
            r0.enableDecoderFallback = r4
            r0.assumedMinimumCodecOperatingRate = r5
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r1 = com.google.android.exoplayer2.decoder.DecoderInputBuffer.newNoDataInstance()
            r0.noDataBuffer = r1
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r1 = new com.google.android.exoplayer2.decoder.DecoderInputBuffer
            r2 = 0
            r1.<init>(r2)
            r0.buffer = r1
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r1 = new com.google.android.exoplayer2.decoder.DecoderInputBuffer
            r3 = 2
            r1.<init>(r3)
            r0.bypassSampleBuffer = r1
            com.google.android.exoplayer2.mediacodec.BatchBuffer r1 = new com.google.android.exoplayer2.mediacodec.BatchBuffer
            r1.<init>()
            r0.bypassBatchBuffer = r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.decodeOnlyPresentationTimestamps = r3
            android.media.MediaCodec$BufferInfo r3 = new android.media.MediaCodec$BufferInfo
            r3.<init>()
            r0.outputBufferInfo = r3
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.currentPlaybackSpeed = r3
            r0.targetPlaybackSpeed = r3
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.renderTimeLimitMs = r3
            java.util.ArrayDeque r5 = new java.util.ArrayDeque
            r5.<init>()
            r0.pendingOutputStreamChanges = r5
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo r5 = com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.OutputStreamInfo.UNSET
            r0.setOutputStreamInfo(r5)
            r1.ensureSpaceForWrite(r2)
            java.nio.ByteBuffer r1 = r1.data
            java.nio.ByteOrder r5 = java.nio.ByteOrder.nativeOrder()
            r1.order(r5)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.codecOperatingRate = r1
            r0.codecAdaptationWorkaroundMode = r2
            r0.codecReconfigurationState = r2
            r1 = -1
            r0.inputIndex = r1
            r0.outputIndex = r1
            r0.codecHotswapDeadlineMs = r3
            r0.largestQueuedPresentationTimeUs = r3
            r0.lastBufferInStreamPresentationTimeUs = r3
            r0.lastProcessedOutputBufferTimeUs = r3
            r0.codecDrainState = r2
            r0.codecDrainAction = r2
            return
    }

    private void bypassRead() throws com.google.android.exoplayer2.ExoPlaybackException {
            r5 = this;
            boolean r0 = r5.inputStreamEnded
            r1 = 1
            r0 = r0 ^ r1
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            com.google.android.exoplayer2.FormatHolder r0 = r5.getFormatHolder()
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r2 = r5.bypassSampleBuffer
            r2.clear()
        L10:
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r2 = r5.bypassSampleBuffer
            r2.clear()
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r2 = r5.bypassSampleBuffer
            r3 = 0
            int r2 = r5.readSource(r0, r2, r3)
            r4 = -5
            if (r2 == r4) goto L5d
            r4 = -4
            if (r2 == r4) goto L2c
            r0 = -3
            if (r2 != r0) goto L26
            return
        L26:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L2c:
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r2 = r5.bypassSampleBuffer
            boolean r2 = r2.isEndOfStream()
            if (r2 == 0) goto L37
            r5.inputStreamEnded = r1
            return
        L37:
            boolean r2 = r5.waitingForFirstSampleInFormat
            if (r2 == 0) goto L4b
            com.google.android.exoplayer2.Format r2 = r5.inputFormat
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            com.google.android.exoplayer2.Format r2 = (com.google.android.exoplayer2.Format) r2
            r5.outputFormat = r2
            r4 = 0
            r5.onOutputFormatChanged(r2, r4)
            r5.waitingForFirstSampleInFormat = r3
        L4b:
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r2 = r5.bypassSampleBuffer
            r2.flip()
            com.google.android.exoplayer2.mediacodec.BatchBuffer r2 = r5.bypassBatchBuffer
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r3 = r5.bypassSampleBuffer
            boolean r2 = r2.append(r3)
            if (r2 != 0) goto L10
            r5.bypassSampleBufferPending = r1
            return
        L5d:
            r5.onInputFormatChanged(r0)
            return
    }

    private boolean bypassRender(long r19, long r21) throws com.google.android.exoplayer2.ExoPlaybackException {
            r18 = this;
            r15 = r18
            boolean r0 = r15.outputStreamEnded
            r14 = 1
            r0 = r0 ^ r14
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            com.google.android.exoplayer2.mediacodec.BatchBuffer r0 = r15.bypassBatchBuffer
            boolean r0 = r0.hasSamples()
            r13 = 0
            if (r0 == 0) goto L55
            r5 = 0
            com.google.android.exoplayer2.mediacodec.BatchBuffer r0 = r15.bypassBatchBuffer
            java.nio.ByteBuffer r6 = r0.data
            int r7 = r15.outputIndex
            r8 = 0
            int r9 = r0.getSampleCount()
            com.google.android.exoplayer2.mediacodec.BatchBuffer r0 = r15.bypassBatchBuffer
            long r10 = r0.getFirstSampleTimeUs()
            com.google.android.exoplayer2.mediacodec.BatchBuffer r0 = r15.bypassBatchBuffer
            boolean r12 = r0.isDecodeOnly()
            com.google.android.exoplayer2.mediacodec.BatchBuffer r0 = r15.bypassBatchBuffer
            boolean r16 = r0.isEndOfStream()
            com.google.android.exoplayer2.Format r3 = r15.outputFormat
            r0 = r18
            r1 = r19
            r17 = r3
            r3 = r21
            r13 = r16
            r14 = r17
            boolean r0 = r0.processOutputBuffer(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)
            if (r0 == 0) goto L53
            com.google.android.exoplayer2.mediacodec.BatchBuffer r0 = r15.bypassBatchBuffer
            long r0 = r0.getLastSampleTimeUs()
            r15.onProcessedOutputBuffer(r0)
            com.google.android.exoplayer2.mediacodec.BatchBuffer r0 = r15.bypassBatchBuffer
            r0.clear()
            goto L55
        L53:
            r0 = 0
            return r0
        L55:
            r0 = 0
            boolean r1 = r15.inputStreamEnded
            if (r1 == 0) goto L5e
            r1 = 1
            r15.outputStreamEnded = r1
            return r0
        L5e:
            r1 = 1
            boolean r2 = r15.bypassSampleBufferPending
            if (r2 == 0) goto L70
            com.google.android.exoplayer2.mediacodec.BatchBuffer r2 = r15.bypassBatchBuffer
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r3 = r15.bypassSampleBuffer
            boolean r2 = r2.append(r3)
            com.google.android.exoplayer2.util.Assertions.checkState(r2)
            r15.bypassSampleBufferPending = r0
        L70:
            boolean r2 = r15.bypassDrainAndReinitialize
            if (r2 == 0) goto L8a
            com.google.android.exoplayer2.mediacodec.BatchBuffer r2 = r15.bypassBatchBuffer
            boolean r2 = r2.hasSamples()
            if (r2 == 0) goto L7d
            return r1
        L7d:
            r18.disableBypass()
            r15.bypassDrainAndReinitialize = r0
            r18.maybeInitCodecOrBypass()
            boolean r2 = r15.bypassEnabled
            if (r2 != 0) goto L8a
            return r0
        L8a:
            r18.bypassRead()
            com.google.android.exoplayer2.mediacodec.BatchBuffer r2 = r15.bypassBatchBuffer
            boolean r2 = r2.hasSamples()
            if (r2 == 0) goto L9a
            com.google.android.exoplayer2.mediacodec.BatchBuffer r2 = r15.bypassBatchBuffer
            r2.flip()
        L9a:
            com.google.android.exoplayer2.mediacodec.BatchBuffer r2 = r15.bypassBatchBuffer
            boolean r2 = r2.hasSamples()
            if (r2 != 0) goto Lad
            boolean r2 = r15.inputStreamEnded
            if (r2 != 0) goto Lad
            boolean r2 = r15.bypassDrainAndReinitialize
            if (r2 == 0) goto Lab
            goto Lad
        Lab:
            r14 = 0
            goto Lae
        Lad:
            r14 = 1
        Lae:
            return r14
    }

    private int codecAdaptationWorkaroundMode(java.lang.String r4) {
            r3 = this;
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 25
            if (r0 > r1) goto L32
            java.lang.String r1 = "OMX.Exynos.avc.dec.secure"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L32
            java.lang.String r1 = com.google.android.exoplayer2.util.Util.MODEL
            java.lang.String r2 = "SM-T585"
            boolean r2 = r1.startsWith(r2)
            if (r2 != 0) goto L30
            java.lang.String r2 = "SM-A510"
            boolean r2 = r1.startsWith(r2)
            if (r2 != 0) goto L30
            java.lang.String r2 = "SM-A520"
            boolean r2 = r1.startsWith(r2)
            if (r2 != 0) goto L30
            java.lang.String r2 = "SM-J700"
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L32
        L30:
            r4 = 2
            return r4
        L32:
            r1 = 24
            if (r0 >= r1) goto L6b
            java.lang.String r0 = "OMX.Nvidia.h264.decode"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L46
            java.lang.String r0 = "OMX.Nvidia.h264.decode.secure"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L6b
        L46:
            java.lang.String r4 = com.google.android.exoplayer2.util.Util.DEVICE
            java.lang.String r0 = "flounder"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L69
            java.lang.String r0 = "flounder_lte"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L69
            java.lang.String r0 = "grouper"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L69
            java.lang.String r0 = "tilapia"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L6b
        L69:
            r4 = 1
            return r4
        L6b:
            r4 = 0
            return r4
    }

    private static boolean codecNeedsDiscardToSpsWorkaround(java.lang.String r2, com.google.android.exoplayer2.Format r3) {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 21
            if (r0 >= r1) goto L18
            java.util.List<byte[]> r3 = r3.initializationData
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L18
            java.lang.String r3 = "OMX.MTK.VIDEO.DECODER.AVC"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L18
            r2 = 1
            goto L19
        L18:
            r2 = 0
        L19:
            return r2
    }

    private static boolean codecNeedsEosBufferTimestampWorkaround(java.lang.String r2) {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 21
            if (r0 >= r1) goto L4d
            java.lang.String r0 = "OMX.SEC.mp3.dec"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L4d
            java.lang.String r2 = com.google.android.exoplayer2.util.Util.MANUFACTURER
            java.lang.String r0 = "samsung"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L4d
            java.lang.String r2 = com.google.android.exoplayer2.util.Util.DEVICE
            java.lang.String r0 = "baffin"
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L4b
            java.lang.String r0 = "grand"
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L4b
            java.lang.String r0 = "fortuna"
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L4b
            java.lang.String r0 = "gprimelte"
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L4b
            java.lang.String r0 = "j2y18lte"
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L4b
            java.lang.String r0 = "ms01"
            boolean r2 = r2.startsWith(r0)
            if (r2 == 0) goto L4d
        L4b:
            r2 = 1
            goto L4e
        L4d:
            r2 = 0
        L4e:
            return r2
    }

    private static boolean codecNeedsEosFlushWorkaround(java.lang.String r2) {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 23
            if (r0 > r1) goto Le
            java.lang.String r1 = "OMX.google.vorbis.decoder"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L35
        Le:
            r1 = 19
            if (r0 > r1) goto L37
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.DEVICE
            java.lang.String r1 = "hb2000"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L25
            java.lang.String r1 = "stvm8"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L37
        L25:
            java.lang.String r0 = "OMX.amlogic.avc.decoder.awesome"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L35
            java.lang.String r0 = "OMX.amlogic.avc.decoder.awesome.secure"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L37
        L35:
            r2 = 1
            goto L38
        L37:
            r2 = 0
        L38:
            return r2
    }

    private static boolean codecNeedsEosOutputExceptionWorkaround(java.lang.String r2) {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 21
            if (r0 != r1) goto L10
            java.lang.String r0 = "OMX.google.aac.decoder"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L10
            r2 = 1
            goto L11
        L10:
            r2 = 0
        L11:
            return r2
    }

    private static boolean codecNeedsEosPropagationWorkaround(com.google.android.exoplayer2.mediacodec.MediaCodecInfo r3) {
            java.lang.String r0 = r3.name
            int r1 = com.google.android.exoplayer2.util.Util.SDK_INT
            r2 = 25
            if (r1 > r2) goto L10
            java.lang.String r2 = "OMX.rk.video_decoder.avc"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L68
        L10:
            r2 = 17
            if (r1 > r2) goto L1c
            java.lang.String r2 = "OMX.allwinner.video.decoder.avc"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L68
        L1c:
            r2 = 29
            if (r1 > r2) goto L50
            java.lang.String r1 = "OMX.broadcom.video_decoder.tunnel"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L68
            java.lang.String r1 = "OMX.broadcom.video_decoder.tunnel.secure"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L68
            java.lang.String r1 = "OMX.bcm.vdec.avc.tunnel"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L68
            java.lang.String r1 = "OMX.bcm.vdec.avc.tunnel.secure"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L68
            java.lang.String r1 = "OMX.bcm.vdec.hevc.tunnel"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L68
            java.lang.String r1 = "OMX.bcm.vdec.hevc.tunnel.secure"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L68
        L50:
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.MANUFACTURER
            java.lang.String r1 = "Amazon"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6a
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.MODEL
            java.lang.String r1 = "AFTS"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6a
            boolean r3 = r3.secure
            if (r3 == 0) goto L6a
        L68:
            r3 = 1
            goto L6b
        L6a:
            r3 = 0
        L6b:
            return r3
    }

    private static boolean codecNeedsFlushWorkaround(java.lang.String r2) {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 18
            if (r0 < r1) goto L39
            if (r0 != r1) goto L18
            java.lang.String r1 = "OMX.SEC.avc.dec"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L39
            java.lang.String r1 = "OMX.SEC.avc.dec.secure"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L39
        L18:
            r1 = 19
            if (r0 != r1) goto L37
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.MODEL
            java.lang.String r1 = "SM-G800"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L37
            java.lang.String r0 = "OMX.Exynos.avc.dec"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L39
            java.lang.String r0 = "OMX.Exynos.avc.dec.secure"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L37
            goto L39
        L37:
            r2 = 0
            goto L3a
        L39:
            r2 = 1
        L3a:
            return r2
    }

    private static boolean codecNeedsMonoChannelCountWorkaround(java.lang.String r3, com.google.android.exoplayer2.Format r4) {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 1
            r2 = 18
            if (r0 > r2) goto L14
            int r4 = r4.channelCount
            if (r4 != r1) goto L14
            java.lang.String r4 = "OMX.MTK.AUDIO.DECODER.MP3"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L14
            goto L15
        L14:
            r1 = 0
        L15:
            return r1
    }

    private static boolean codecNeedsSosFlushWorkaround(java.lang.String r2) {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 29
            if (r0 != r1) goto L10
            java.lang.String r0 = "c2.android.aac.decoder"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L10
            r2 = 1
            goto L11
        L10:
            r2 = 0
        L11:
            return r2
    }

    private void disableBypass() {
            r2 = this;
            r0 = 0
            r2.bypassDrainAndReinitialize = r0
            com.google.android.exoplayer2.mediacodec.BatchBuffer r1 = r2.bypassBatchBuffer
            r1.clear()
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r1 = r2.bypassSampleBuffer
            r1.clear()
            r2.bypassSampleBufferPending = r0
            r2.bypassEnabled = r0
            return
    }

    private boolean drainAndFlushCodec() {
            r2 = this;
            boolean r0 = r2.codecReceivedBuffers
            r1 = 1
            if (r0 == 0) goto L18
            r2.codecDrainState = r1
            boolean r0 = r2.codecNeedsFlushWorkaround
            if (r0 != 0) goto L13
            boolean r0 = r2.codecNeedsEosFlushWorkaround
            if (r0 == 0) goto L10
            goto L13
        L10:
            r2.codecDrainAction = r1
            goto L18
        L13:
            r0 = 3
            r2.codecDrainAction = r0
            r0 = 0
            return r0
        L18:
            return r1
    }

    private void drainAndReinitializeCodec() throws com.google.android.exoplayer2.ExoPlaybackException {
            r1 = this;
            boolean r0 = r1.codecReceivedBuffers
            if (r0 == 0) goto Lb
            r0 = 1
            r1.codecDrainState = r0
            r0 = 3
            r1.codecDrainAction = r0
            goto Le
        Lb:
            r1.reinitializeCodec()
        Le:
            return
    }

    @android.annotation.TargetApi(23)
    private boolean drainAndUpdateCodecDrmSessionV23() throws com.google.android.exoplayer2.ExoPlaybackException {
            r2 = this;
            boolean r0 = r2.codecReceivedBuffers
            r1 = 1
            if (r0 == 0) goto L19
            r2.codecDrainState = r1
            boolean r0 = r2.codecNeedsFlushWorkaround
            if (r0 != 0) goto L14
            boolean r0 = r2.codecNeedsEosFlushWorkaround
            if (r0 == 0) goto L10
            goto L14
        L10:
            r0 = 2
            r2.codecDrainAction = r0
            goto L1c
        L14:
            r0 = 3
            r2.codecDrainAction = r0
            r0 = 0
            return r0
        L19:
            r2.updateDrmSessionV23()
        L1c:
            return r1
    }

    private boolean drainOutputBuffer(long r20, long r22) throws com.google.android.exoplayer2.ExoPlaybackException {
            r19 = this;
            r15 = r19
            boolean r0 = r19.hasOutputBuffer()
            r16 = 1
            r14 = 0
            if (r0 != 0) goto Lc2
            boolean r0 = r15.codecNeedsEosOutputExceptionWorkaround
            if (r0 == 0) goto L28
            boolean r0 = r15.codecReceivedEos
            if (r0 == 0) goto L28
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r0 = r15.codec     // Catch: java.lang.IllegalStateException -> L1c
            android.media.MediaCodec$BufferInfo r1 = r15.outputBufferInfo     // Catch: java.lang.IllegalStateException -> L1c
            int r0 = r0.dequeueOutputBufferIndex(r1)     // Catch: java.lang.IllegalStateException -> L1c
            goto L30
        L1c:
            r19.processEndOfStream()
            boolean r0 = r15.outputStreamEnded
            if (r0 == 0) goto L27
            r19.releaseCodec()
        L27:
            return r14
        L28:
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r0 = r15.codec
            android.media.MediaCodec$BufferInfo r1 = r15.outputBufferInfo
            int r0 = r0.dequeueOutputBufferIndex(r1)
        L30:
            if (r0 >= 0) goto L4a
            r1 = -2
            if (r0 != r1) goto L39
            r19.processOutputMediaFormatChanged()
            return r16
        L39:
            boolean r0 = r15.codecNeedsEosPropagation
            if (r0 == 0) goto L49
            boolean r0 = r15.inputStreamEnded
            if (r0 != 0) goto L46
            int r0 = r15.codecDrainState
            r1 = 2
            if (r0 != r1) goto L49
        L46:
            r19.processEndOfStream()
        L49:
            return r14
        L4a:
            boolean r1 = r15.shouldSkipAdaptationWorkaroundOutputBuffer
            if (r1 == 0) goto L56
            r15.shouldSkipAdaptationWorkaroundOutputBuffer = r14
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r1 = r15.codec
            r1.releaseOutputBuffer(r0, r14)
            return r16
        L56:
            android.media.MediaCodec$BufferInfo r1 = r15.outputBufferInfo
            int r2 = r1.size
            if (r2 != 0) goto L66
            int r1 = r1.flags
            r1 = r1 & 4
            if (r1 == 0) goto L66
            r19.processEndOfStream()
            return r14
        L66:
            r15.outputIndex = r0
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r1 = r15.codec
            java.nio.ByteBuffer r0 = r1.getOutputBuffer(r0)
            r15.outputBuffer = r0
            if (r0 == 0) goto L85
            android.media.MediaCodec$BufferInfo r1 = r15.outputBufferInfo
            int r1 = r1.offset
            r0.position(r1)
            java.nio.ByteBuffer r0 = r15.outputBuffer
            android.media.MediaCodec$BufferInfo r1 = r15.outputBufferInfo
            int r2 = r1.offset
            int r1 = r1.size
            int r2 = r2 + r1
            r0.limit(r2)
        L85:
            boolean r0 = r15.codecNeedsEosBufferTimestampWorkaround
            if (r0 == 0) goto La6
            android.media.MediaCodec$BufferInfo r0 = r15.outputBufferInfo
            long r1 = r0.presentationTimeUs
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto La6
            int r1 = r0.flags
            r1 = r1 & 4
            if (r1 == 0) goto La6
            long r1 = r15.largestQueuedPresentationTimeUs
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto La6
            r0.presentationTimeUs = r1
        La6:
            android.media.MediaCodec$BufferInfo r0 = r15.outputBufferInfo
            long r0 = r0.presentationTimeUs
            boolean r0 = r15.isDecodeOnlyBuffer(r0)
            r15.isDecodeOnlyOutputBuffer = r0
            long r0 = r15.lastBufferInStreamPresentationTimeUs
            android.media.MediaCodec$BufferInfo r2 = r15.outputBufferInfo
            long r2 = r2.presentationTimeUs
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lbc
            r0 = 1
            goto Lbd
        Lbc:
            r0 = 0
        Lbd:
            r15.isLastOutputBuffer = r0
            r15.updateOutputFormatForTime(r2)
        Lc2:
            boolean r0 = r15.codecNeedsEosOutputExceptionWorkaround
            if (r0 == 0) goto Lfd
            boolean r0 = r15.codecReceivedEos
            if (r0 == 0) goto Lfd
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r5 = r15.codec     // Catch: java.lang.IllegalStateException -> Lf0
            java.nio.ByteBuffer r6 = r15.outputBuffer     // Catch: java.lang.IllegalStateException -> Lf0
            int r7 = r15.outputIndex     // Catch: java.lang.IllegalStateException -> Lf0
            android.media.MediaCodec$BufferInfo r0 = r15.outputBufferInfo     // Catch: java.lang.IllegalStateException -> Lf0
            int r8 = r0.flags     // Catch: java.lang.IllegalStateException -> Lf0
            r9 = 1
            long r10 = r0.presentationTimeUs     // Catch: java.lang.IllegalStateException -> Lf0
            boolean r12 = r15.isDecodeOnlyOutputBuffer     // Catch: java.lang.IllegalStateException -> Lf0
            boolean r13 = r15.isLastOutputBuffer     // Catch: java.lang.IllegalStateException -> Lf0
            com.google.android.exoplayer2.Format r3 = r15.outputFormat     // Catch: java.lang.IllegalStateException -> Lf0
            r0 = r19
            r1 = r20
            r17 = r3
            r3 = r22
            r18 = 0
            r14 = r17
            boolean r0 = r0.processOutputBuffer(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)     // Catch: java.lang.IllegalStateException -> Lee
            goto L11c
        Lee:
            goto Lf2
        Lf0:
            r18 = 0
        Lf2:
            r19.processEndOfStream()
            boolean r0 = r15.outputStreamEnded
            if (r0 == 0) goto Lfc
            r19.releaseCodec()
        Lfc:
            return r18
        Lfd:
            r18 = 0
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r5 = r15.codec
            java.nio.ByteBuffer r6 = r15.outputBuffer
            int r7 = r15.outputIndex
            android.media.MediaCodec$BufferInfo r0 = r15.outputBufferInfo
            int r8 = r0.flags
            r9 = 1
            long r10 = r0.presentationTimeUs
            boolean r12 = r15.isDecodeOnlyOutputBuffer
            boolean r13 = r15.isLastOutputBuffer
            com.google.android.exoplayer2.Format r14 = r15.outputFormat
            r0 = r19
            r1 = r20
            r3 = r22
            boolean r0 = r0.processOutputBuffer(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)
        L11c:
            if (r0 == 0) goto L139
            android.media.MediaCodec$BufferInfo r0 = r15.outputBufferInfo
            long r0 = r0.presentationTimeUs
            r15.onProcessedOutputBuffer(r0)
            android.media.MediaCodec$BufferInfo r0 = r15.outputBufferInfo
            int r0 = r0.flags
            r0 = r0 & 4
            if (r0 == 0) goto L12f
            r14 = 1
            goto L130
        L12f:
            r14 = 0
        L130:
            r19.resetOutputBuffer()
            if (r14 != 0) goto L136
            return r16
        L136:
            r19.processEndOfStream()
        L139:
            return r18
    }

    private boolean drmNeedsCodecReinitialization(com.google.android.exoplayer2.mediacodec.MediaCodecInfo r5, com.google.android.exoplayer2.Format r6, @androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmSession r7, @androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmSession r8) throws com.google.android.exoplayer2.ExoPlaybackException {
            r4 = this;
            r0 = 0
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 1
            if (r8 == 0) goto L52
            if (r7 != 0) goto La
            goto L52
        La:
            java.util.UUID r2 = r8.getSchemeUuid()
            java.util.UUID r3 = r7.getSchemeUuid()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L19
            return r1
        L19:
            int r2 = com.google.android.exoplayer2.util.Util.SDK_INT
            r3 = 23
            if (r2 >= r3) goto L20
            return r1
        L20:
            java.util.UUID r2 = com.google.android.exoplayer2.C.PLAYREADY_UUID
            java.util.UUID r7 = r7.getSchemeUuid()
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L52
            java.util.UUID r7 = r8.getSchemeUuid()
            boolean r7 = r2.equals(r7)
            if (r7 == 0) goto L37
            goto L52
        L37:
            com.google.android.exoplayer2.drm.FrameworkCryptoConfig r7 = r4.getFrameworkCryptoConfig(r8)
            if (r7 != 0) goto L3e
            return r1
        L3e:
            boolean r7 = r7.forceAllowInsecureDecoderComponents
            if (r7 == 0) goto L44
            r6 = 0
            goto L4a
        L44:
            java.lang.String r6 = r6.sampleMimeType
            boolean r6 = r8.requiresSecureDecoder(r6)
        L4a:
            boolean r5 = r5.secure
            if (r5 != 0) goto L51
            if (r6 == 0) goto L51
            return r1
        L51:
            return r0
        L52:
            return r1
    }

    private boolean feedInputBuffer() throws com.google.android.exoplayer2.ExoPlaybackException {
            r15 = this;
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r0 = r15.codec
            r1 = 0
            if (r0 == 0) goto L208
            int r2 = r15.codecDrainState
            r3 = 2
            if (r2 == r3) goto L208
            boolean r4 = r15.inputStreamEnded
            if (r4 == 0) goto L10
            goto L208
        L10:
            int r2 = r15.inputIndex
            if (r2 >= 0) goto L2c
            int r0 = r0.dequeueInputBufferIndex()
            r15.inputIndex = r0
            if (r0 >= 0) goto L1d
            return r1
        L1d:
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r2 = r15.buffer
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r4 = r15.codec
            java.nio.ByteBuffer r0 = r4.getInputBuffer(r0)
            r2.data = r0
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r0 = r15.buffer
            r0.clear()
        L2c:
            int r0 = r15.codecDrainState
            r2 = 1
            if (r0 != r2) goto L4a
            boolean r0 = r15.codecNeedsEosPropagation
            if (r0 == 0) goto L36
            goto L47
        L36:
            r15.codecReceivedEos = r2
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r4 = r15.codec
            int r5 = r15.inputIndex
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 4
            r4.queueInputBuffer(r5, r6, r7, r8, r10)
            r15.resetInputBuffer()
        L47:
            r15.codecDrainState = r3
            return r1
        L4a:
            boolean r0 = r15.codecNeedsAdaptationWorkaroundBuffer
            if (r0 == 0) goto L6b
            r15.codecNeedsAdaptationWorkaroundBuffer = r1
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r0 = r15.buffer
            java.nio.ByteBuffer r0 = r0.data
            byte[] r1 = com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.ADAPTATION_WORKAROUND_BUFFER
            r0.put(r1)
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r3 = r15.codec
            int r4 = r15.inputIndex
            r5 = 0
            int r6 = r1.length
            r7 = 0
            r9 = 0
            r3.queueInputBuffer(r4, r5, r6, r7, r9)
            r15.resetInputBuffer()
            r15.codecReceivedBuffers = r2
            return r2
        L6b:
            int r0 = r15.codecReconfigurationState
            if (r0 != r2) goto L90
            r0 = 0
        L70:
            com.google.android.exoplayer2.Format r4 = r15.codecInputFormat
            java.util.List<byte[]> r4 = r4.initializationData
            int r4 = r4.size()
            if (r0 >= r4) goto L8e
            com.google.android.exoplayer2.Format r4 = r15.codecInputFormat
            java.util.List<byte[]> r4 = r4.initializationData
            java.lang.Object r4 = r4.get(r0)
            byte[] r4 = (byte[]) r4
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r5 = r15.buffer
            java.nio.ByteBuffer r5 = r5.data
            r5.put(r4)
            int r0 = r0 + 1
            goto L70
        L8e:
            r15.codecReconfigurationState = r3
        L90:
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r0 = r15.buffer
            java.nio.ByteBuffer r0 = r0.data
            int r0 = r0.position()
            com.google.android.exoplayer2.FormatHolder r4 = r15.getFormatHolder()
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r5 = r15.buffer     // Catch: com.google.android.exoplayer2.decoder.DecoderInputBuffer.InsufficientCapacityException -> L1fd
            int r5 = r15.readSource(r4, r5, r1)     // Catch: com.google.android.exoplayer2.decoder.DecoderInputBuffer.InsufficientCapacityException -> L1fd
            boolean r6 = r15.hasReadStreamToEnd()
            if (r6 == 0) goto Lac
            long r6 = r15.largestQueuedPresentationTimeUs
            r15.lastBufferInStreamPresentationTimeUs = r6
        Lac:
            r6 = -3
            if (r5 != r6) goto Lb0
            return r1
        Lb0:
            r6 = -5
            if (r5 != r6) goto Lc2
            int r0 = r15.codecReconfigurationState
            if (r0 != r3) goto Lbe
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r0 = r15.buffer
            r0.clear()
            r15.codecReconfigurationState = r2
        Lbe:
            r15.onInputFormatChanged(r4)
            return r2
        Lc2:
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r4 = r15.buffer
            boolean r4 = r4.isEndOfStream()
            if (r4 == 0) goto L106
            int r0 = r15.codecReconfigurationState
            if (r0 != r3) goto Ld5
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r0 = r15.buffer
            r0.clear()
            r15.codecReconfigurationState = r2
        Ld5:
            r15.inputStreamEnded = r2
            boolean r0 = r15.codecReceivedBuffers
            if (r0 != 0) goto Ldf
            r15.processEndOfStream()
            return r1
        Ldf:
            boolean r0 = r15.codecNeedsEosPropagation     // Catch: android.media.MediaCodec.CryptoException -> Lf6
            if (r0 == 0) goto Le4
            goto Lf5
        Le4:
            r15.codecReceivedEos = r2     // Catch: android.media.MediaCodec.CryptoException -> Lf6
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r3 = r15.codec     // Catch: android.media.MediaCodec.CryptoException -> Lf6
            int r4 = r15.inputIndex     // Catch: android.media.MediaCodec.CryptoException -> Lf6
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 4
            r3.queueInputBuffer(r4, r5, r6, r7, r9)     // Catch: android.media.MediaCodec.CryptoException -> Lf6
            r15.resetInputBuffer()     // Catch: android.media.MediaCodec.CryptoException -> Lf6
        Lf5:
            return r1
        Lf6:
            r0 = move-exception
            com.google.android.exoplayer2.Format r2 = r15.inputFormat
            int r3 = r0.getErrorCode()
            int r3 = com.google.android.exoplayer2.util.Util.getErrorCodeForMediaDrmErrorCode(r3)
            com.google.android.exoplayer2.ExoPlaybackException r0 = r15.createRendererException(r0, r2, r1, r3)
            throw r0
        L106:
            boolean r4 = r15.codecReceivedBuffers
            if (r4 != 0) goto L11e
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r4 = r15.buffer
            boolean r4 = r4.isKeyFrame()
            if (r4 != 0) goto L11e
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r0 = r15.buffer
            r0.clear()
            int r0 = r15.codecReconfigurationState
            if (r0 != r3) goto L11d
            r15.codecReconfigurationState = r2
        L11d:
            return r2
        L11e:
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r3 = r15.buffer
            boolean r3 = r3.isEncrypted()
            if (r3 == 0) goto L12d
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r4 = r15.buffer
            com.google.android.exoplayer2.decoder.CryptoInfo r4 = r4.cryptoInfo
            r4.increaseClearDataFirstSubSampleBy(r0)
        L12d:
            boolean r0 = r15.codecNeedsDiscardToSpsWorkaround
            if (r0 == 0) goto L147
            if (r3 != 0) goto L147
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r0 = r15.buffer
            java.nio.ByteBuffer r0 = r0.data
            com.google.android.exoplayer2.util.NalUnitUtil.discardToSps(r0)
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r0 = r15.buffer
            java.nio.ByteBuffer r0 = r0.data
            int r0 = r0.position()
            if (r0 != 0) goto L145
            return r2
        L145:
            r15.codecNeedsDiscardToSpsWorkaround = r1
        L147:
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r0 = r15.buffer
            long r4 = r0.timeUs
            com.google.android.exoplayer2.mediacodec.C2Mp3TimestampTracker r6 = r15.c2Mp3TimestampTracker
            if (r6 == 0) goto L165
            com.google.android.exoplayer2.Format r4 = r15.inputFormat
            long r4 = r6.updateAndGetPresentationTimeUs(r4, r0)
            long r6 = r15.largestQueuedPresentationTimeUs
            com.google.android.exoplayer2.mediacodec.C2Mp3TimestampTracker r0 = r15.c2Mp3TimestampTracker
            com.google.android.exoplayer2.Format r8 = r15.inputFormat
            long r8 = r0.getLastOutputBufferPresentationTimeUs(r8)
            long r6 = java.lang.Math.max(r6, r8)
            r15.largestQueuedPresentationTimeUs = r6
        L165:
            r12 = r4
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r0 = r15.buffer
            boolean r0 = r0.isDecodeOnly()
            if (r0 == 0) goto L177
            java.util.ArrayList<java.lang.Long> r0 = r15.decodeOnlyPresentationTimestamps
            java.lang.Long r4 = java.lang.Long.valueOf(r12)
            r0.add(r4)
        L177:
            boolean r0 = r15.waitingForFirstSampleInFormat
            if (r0 == 0) goto L19e
            java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo> r0 = r15.pendingOutputStreamChanges
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L193
            java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo> r0 = r15.pendingOutputStreamChanges
            java.lang.Object r0 = r0.peekLast()
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo r0 = (com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.OutputStreamInfo) r0
            com.google.android.exoplayer2.util.TimedValueQueue<com.google.android.exoplayer2.Format> r0 = r0.formatQueue
            com.google.android.exoplayer2.Format r4 = r15.inputFormat
            r0.add(r12, r4)
            goto L19c
        L193:
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo r0 = r15.outputStreamInfo
            com.google.android.exoplayer2.util.TimedValueQueue<com.google.android.exoplayer2.Format> r0 = r0.formatQueue
            com.google.android.exoplayer2.Format r4 = r15.inputFormat
            r0.add(r12, r4)
        L19c:
            r15.waitingForFirstSampleInFormat = r1
        L19e:
            long r4 = r15.largestQueuedPresentationTimeUs
            long r4 = java.lang.Math.max(r4, r12)
            r15.largestQueuedPresentationTimeUs = r4
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r0 = r15.buffer
            r0.flip()
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r0 = r15.buffer
            boolean r0 = r0.hasSupplementalData()
            if (r0 == 0) goto L1b8
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r0 = r15.buffer
            r15.handleInputBufferSupplementalData(r0)
        L1b8:
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r0 = r15.buffer
            r15.onQueueInputBuffer(r0)
            if (r3 == 0) goto L1cd
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r8 = r15.codec     // Catch: android.media.MediaCodec.CryptoException -> L1ed
            int r9 = r15.inputIndex     // Catch: android.media.MediaCodec.CryptoException -> L1ed
            r10 = 0
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r0 = r15.buffer     // Catch: android.media.MediaCodec.CryptoException -> L1ed
            com.google.android.exoplayer2.decoder.CryptoInfo r11 = r0.cryptoInfo     // Catch: android.media.MediaCodec.CryptoException -> L1ed
            r14 = 0
            r8.queueSecureInputBuffer(r9, r10, r11, r12, r14)     // Catch: android.media.MediaCodec.CryptoException -> L1ed
            goto L1de
        L1cd:
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r8 = r15.codec     // Catch: android.media.MediaCodec.CryptoException -> L1ed
            int r9 = r15.inputIndex     // Catch: android.media.MediaCodec.CryptoException -> L1ed
            r10 = 0
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r0 = r15.buffer     // Catch: android.media.MediaCodec.CryptoException -> L1ed
            java.nio.ByteBuffer r0 = r0.data     // Catch: android.media.MediaCodec.CryptoException -> L1ed
            int r11 = r0.limit()     // Catch: android.media.MediaCodec.CryptoException -> L1ed
            r14 = 0
            r8.queueInputBuffer(r9, r10, r11, r12, r14)     // Catch: android.media.MediaCodec.CryptoException -> L1ed
        L1de:
            r15.resetInputBuffer()
            r15.codecReceivedBuffers = r2
            r15.codecReconfigurationState = r1
            com.google.android.exoplayer2.decoder.DecoderCounters r0 = r15.decoderCounters
            int r1 = r0.queuedInputBufferCount
            int r1 = r1 + r2
            r0.queuedInputBufferCount = r1
            return r2
        L1ed:
            r0 = move-exception
            com.google.android.exoplayer2.Format r2 = r15.inputFormat
            int r3 = r0.getErrorCode()
            int r3 = com.google.android.exoplayer2.util.Util.getErrorCodeForMediaDrmErrorCode(r3)
            com.google.android.exoplayer2.ExoPlaybackException r0 = r15.createRendererException(r0, r2, r1, r3)
            throw r0
        L1fd:
            r0 = move-exception
            r15.onCodecError(r0)
            r15.readSourceOmittingSampleData(r1)
            r15.flushCodec()
            return r2
        L208:
            return r1
    }

    private void flushCodec() {
            r1 = this;
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r0 = r1.codec     // Catch: java.lang.Throwable -> L9
            r0.flush()     // Catch: java.lang.Throwable -> L9
            r1.resetCodecStateForFlush()
            return
        L9:
            r0 = move-exception
            r1.resetCodecStateForFlush()
            throw r0
    }

    private java.util.List<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> getAvailableCodecInfos(boolean r3) throws com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException {
            r2 = this;
            com.google.android.exoplayer2.mediacodec.MediaCodecSelector r0 = r2.mediaCodecSelector
            com.google.android.exoplayer2.Format r1 = r2.inputFormat
            java.util.List r0 = r2.getDecoderInfos(r0, r1, r3)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L42
            if (r3 == 0) goto L42
            com.google.android.exoplayer2.mediacodec.MediaCodecSelector r3 = r2.mediaCodecSelector
            com.google.android.exoplayer2.Format r0 = r2.inputFormat
            r1 = 0
            java.util.List r0 = r2.getDecoderInfos(r3, r0, r1)
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L42
            java.lang.String r3 = "Drm session requires secure decoder for "
            java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
            com.google.android.exoplayer2.Format r1 = r2.inputFormat
            java.lang.String r1 = r1.sampleMimeType
            r3.append(r1)
            java.lang.String r1 = ", but no secure decoder available. Trying to proceed with "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r1 = "."
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r1 = "MediaCodecRenderer"
            com.google.android.exoplayer2.util.Log.w(r1, r3)
        L42:
            return r0
    }

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.drm.FrameworkCryptoConfig getFrameworkCryptoConfig(com.google.android.exoplayer2.drm.DrmSession r4) throws com.google.android.exoplayer2.ExoPlaybackException {
            r3 = this;
            com.google.android.exoplayer2.decoder.CryptoConfig r4 = r4.getCryptoConfig()
            if (r4 == 0) goto L2b
            boolean r0 = r4 instanceof com.google.android.exoplayer2.drm.FrameworkCryptoConfig
            if (r0 == 0) goto Lb
            goto L2b
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expecting FrameworkCryptoConfig but found: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            com.google.android.exoplayer2.Format r4 = r3.inputFormat
            r1 = 6001(0x1771, float:8.409E-42)
            r2 = 0
            com.google.android.exoplayer2.ExoPlaybackException r4 = r3.createRendererException(r0, r4, r2, r1)
            throw r4
        L2b:
            com.google.android.exoplayer2.drm.FrameworkCryptoConfig r4 = (com.google.android.exoplayer2.drm.FrameworkCryptoConfig) r4
            return r4
    }

    private boolean hasOutputBuffer() {
            r1 = this;
            int r0 = r1.outputIndex
            if (r0 < 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    private void initBypass(com.google.android.exoplayer2.Format r3) {
            r2 = this;
            r2.disableBypass()
            java.lang.String r3 = r3.sampleMimeType
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r0 = r0.equals(r3)
            r1 = 1
            if (r0 != 0) goto L24
            java.lang.String r0 = "audio/mpeg"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L24
            java.lang.String r0 = "audio/opus"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L24
            com.google.android.exoplayer2.mediacodec.BatchBuffer r3 = r2.bypassBatchBuffer
            r3.setMaxSampleCount(r1)
            goto L2b
        L24:
            com.google.android.exoplayer2.mediacodec.BatchBuffer r3 = r2.bypassBatchBuffer
            r0 = 32
            r3.setMaxSampleCount(r0)
        L2b:
            r2.bypassEnabled = r1
            return
    }

    private void initCodec(com.google.android.exoplayer2.mediacodec.MediaCodecInfo r12, android.media.MediaCrypto r13) throws java.lang.Exception {
            r11 = this;
            java.lang.String r1 = r12.name
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3 = 23
            if (r0 >= r3) goto Ld
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L17
        Ld:
            float r3 = r11.targetPlaybackSpeed
            com.google.android.exoplayer2.Format[] r4 = r11.getStreamFormats()
            float r3 = r11.getCodecOperatingRateV23(r3, r4)
        L17:
            float r4 = r11.assumedMinimumCodecOperatingRate
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 > 0) goto L1e
            goto L1f
        L1e:
            r2 = r3
        L1f:
            long r3 = android.os.SystemClock.elapsedRealtime()
            com.google.android.exoplayer2.Format r5 = r11.inputFormat
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter$Configuration r13 = r11.getMediaCodecConfiguration(r12, r5, r13, r2)
            r5 = 31
            if (r0 < r5) goto L34
            com.google.android.exoplayer2.analytics.PlayerId r0 = r11.getPlayerId()
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.Api31.setLogSessionIdToMediaCodecFormat(r13, r0)
        L34:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10a
            r0.<init>()     // Catch: java.lang.Throwable -> L10a
            java.lang.String r5 = "createCodec:"
            r0.append(r5)     // Catch: java.lang.Throwable -> L10a
            r0.append(r1)     // Catch: java.lang.Throwable -> L10a
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L10a
            com.google.android.exoplayer2.util.TraceUtil.beginSection(r0)     // Catch: java.lang.Throwable -> L10a
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter$Factory r0 = r11.codecAdapterFactory     // Catch: java.lang.Throwable -> L10a
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r13 = r0.createAdapter(r13)     // Catch: java.lang.Throwable -> L10a
            r11.codec = r13     // Catch: java.lang.Throwable -> L10a
            com.google.android.exoplayer2.util.TraceUtil.endSection()
            long r5 = android.os.SystemClock.elapsedRealtime()
            com.google.android.exoplayer2.Format r13 = r11.inputFormat
            boolean r13 = r12.isFormatSupported(r13)
            r0 = 2
            r7 = 0
            r8 = 1
            if (r13 != 0) goto L79
            java.lang.Object[] r13 = new java.lang.Object[r0]
            com.google.android.exoplayer2.Format r9 = r11.inputFormat
            java.lang.String r9 = com.google.android.exoplayer2.Format.toLogString(r9)
            r13[r7] = r9
            r13[r8] = r1
            java.lang.String r9 = "Format exceeds selected codec's capabilities [%s, %s]"
            java.lang.String r13 = com.google.android.exoplayer2.util.Util.formatInvariant(r9, r13)
            java.lang.String r9 = "MediaCodecRenderer"
            com.google.android.exoplayer2.util.Log.w(r9, r13)
        L79:
            r11.codecInfo = r12
            r11.codecOperatingRate = r2
            com.google.android.exoplayer2.Format r13 = r11.inputFormat
            r11.codecInputFormat = r13
            int r13 = r11.codecAdaptationWorkaroundMode(r1)
            r11.codecAdaptationWorkaroundMode = r13
            com.google.android.exoplayer2.Format r13 = r11.codecInputFormat
            boolean r13 = codecNeedsDiscardToSpsWorkaround(r1, r13)
            r11.codecNeedsDiscardToSpsWorkaround = r13
            boolean r13 = codecNeedsFlushWorkaround(r1)
            r11.codecNeedsFlushWorkaround = r13
            boolean r13 = codecNeedsSosFlushWorkaround(r1)
            r11.codecNeedsSosFlushWorkaround = r13
            boolean r13 = codecNeedsEosFlushWorkaround(r1)
            r11.codecNeedsEosFlushWorkaround = r13
            boolean r13 = codecNeedsEosOutputExceptionWorkaround(r1)
            r11.codecNeedsEosOutputExceptionWorkaround = r13
            boolean r13 = codecNeedsEosBufferTimestampWorkaround(r1)
            r11.codecNeedsEosBufferTimestampWorkaround = r13
            com.google.android.exoplayer2.Format r13 = r11.codecInputFormat
            boolean r13 = codecNeedsMonoChannelCountWorkaround(r1, r13)
            r11.codecNeedsMonoChannelCountWorkaround = r13
            boolean r13 = codecNeedsEosPropagationWorkaround(r12)
            if (r13 != 0) goto Lc4
            boolean r13 = r11.getCodecNeedsEosPropagation()
            if (r13 == 0) goto Lc2
            goto Lc4
        Lc2:
            r13 = 0
            goto Lc5
        Lc4:
            r13 = 1
        Lc5:
            r11.codecNeedsEosPropagation = r13
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r13 = r11.codec
            boolean r13 = r13.needsReconfiguration()
            if (r13 == 0) goto Lda
            r11.codecReconfigured = r8
            r11.codecReconfigurationState = r8
            int r13 = r11.codecAdaptationWorkaroundMode
            if (r13 == 0) goto Ld8
            r7 = 1
        Ld8:
            r11.codecNeedsAdaptationWorkaroundBuffer = r7
        Lda:
            java.lang.String r12 = r12.name
            java.lang.String r13 = "c2.android.mp3.decoder"
            boolean r12 = r13.equals(r12)
            if (r12 == 0) goto Leb
            com.google.android.exoplayer2.mediacodec.C2Mp3TimestampTracker r12 = new com.google.android.exoplayer2.mediacodec.C2Mp3TimestampTracker
            r12.<init>()
            r11.c2Mp3TimestampTracker = r12
        Leb:
            int r12 = r11.getState()
            if (r12 != r0) goto Lfa
            long r12 = android.os.SystemClock.elapsedRealtime()
            r9 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 + r9
            r11.codecHotswapDeadlineMs = r12
        Lfa:
            com.google.android.exoplayer2.decoder.DecoderCounters r12 = r11.decoderCounters
            int r13 = r12.decoderInitCount
            int r13 = r13 + r8
            r12.decoderInitCount = r13
            long r12 = r5 - r3
            r0 = r11
            r2 = r5
            r4 = r12
            r0.onCodecInitialized(r1, r2, r4)
            return
        L10a:
            r12 = move-exception
            com.google.android.exoplayer2.util.TraceUtil.endSection()
            throw r12
    }

    private boolean isDecodeOnlyBuffer(long r7) {
            r6 = this;
            java.util.ArrayList<java.lang.Long> r0 = r6.decodeOnlyPresentationTimestamps
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L24
            java.util.ArrayList<java.lang.Long> r3 = r6.decodeOnlyPresentationTimestamps
            java.lang.Object r3 = r3.get(r2)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 != 0) goto L21
            java.util.ArrayList<java.lang.Long> r7 = r6.decodeOnlyPresentationTimestamps
            r7.remove(r2)
            r7 = 1
            return r7
        L21:
            int r2 = r2 + 1
            goto L8
        L24:
            return r1
    }

    private static boolean isMediaCodecException(java.lang.IllegalStateException r3) {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 1
            r2 = 21
            if (r0 < r2) goto Le
            boolean r0 = isMediaCodecExceptionV21(r3)
            if (r0 == 0) goto Le
            return r1
        Le:
            java.lang.StackTraceElement[] r3 = r3.getStackTrace()
            int r0 = r3.length
            r2 = 0
            if (r0 <= 0) goto L25
            r3 = r3[r2]
            java.lang.String r3 = r3.getClassName()
            java.lang.String r0 = "android.media.MediaCodec"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L25
            goto L26
        L25:
            r1 = 0
        L26:
            return r1
    }

    @androidx.annotation.RequiresApi(21)
    private static boolean isMediaCodecExceptionV21(java.lang.IllegalStateException r0) {
            boolean r0 = r0 instanceof android.media.MediaCodec.CodecException
            return r0
    }

    @androidx.annotation.RequiresApi(21)
    private static boolean isRecoverableMediaCodecExceptionV21(java.lang.IllegalStateException r1) {
            boolean r0 = r1 instanceof android.media.MediaCodec.CodecException
            if (r0 == 0) goto Lb
            android.media.MediaCodec$CodecException r1 = (android.media.MediaCodec.CodecException) r1
            boolean r1 = r1.isRecoverable()
            return r1
        Lb:
            r1 = 0
            return r1
    }

    private void maybeInitCodecWithFallback(android.media.MediaCrypto r8, boolean r9) throws com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException {
            r7 = this;
            java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> r0 = r7.availableCodecInfos
            r1 = 0
            if (r0 != 0) goto L39
            java.util.List r0 = r7.getAvailableCodecInfos(r9)     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L2d
            java.util.ArrayDeque r2 = new java.util.ArrayDeque     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L2d
            r2.<init>()     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L2d
            r7.availableCodecInfos = r2     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L2d
            boolean r3 = r7.enableDecoderFallback     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L2d
            if (r3 == 0) goto L18
            r2.addAll(r0)     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L2d
            goto L2a
        L18:
            boolean r2 = r0.isEmpty()     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L2d
            if (r2 != 0) goto L2a
            java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> r2 = r7.availableCodecInfos     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L2d
            r3 = 0
            java.lang.Object r0 = r0.get(r3)     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L2d
            com.google.android.exoplayer2.mediacodec.MediaCodecInfo r0 = (com.google.android.exoplayer2.mediacodec.MediaCodecInfo) r0     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L2d
            r2.add(r0)     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L2d
        L2a:
            r7.preferredDecoderInitializationException = r1     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L2d
            goto L39
        L2d:
            r8 = move-exception
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r0 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException
            com.google.android.exoplayer2.Format r1 = r7.inputFormat
            r2 = -49998(0xffffffffffff3cb2, float:NaN)
            r0.<init>(r1, r8, r9, r2)
            throw r0
        L39:
            java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> r0 = r7.availableCodecInfos
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lb4
            java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> r0 = r7.availableCodecInfos
            java.lang.Object r0 = r0.peekFirst()
            com.google.android.exoplayer2.mediacodec.MediaCodecInfo r0 = (com.google.android.exoplayer2.mediacodec.MediaCodecInfo) r0
        L49:
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r2 = r7.codec
            if (r2 != 0) goto Lb1
            java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> r2 = r7.availableCodecInfos
            java.lang.Object r2 = r2.peekFirst()
            com.google.android.exoplayer2.mediacodec.MediaCodecInfo r2 = (com.google.android.exoplayer2.mediacodec.MediaCodecInfo) r2
            boolean r3 = r7.shouldInitCodec(r2)
            if (r3 != 0) goto L5c
            return
        L5c:
            r7.initCodec(r2, r8)     // Catch: java.lang.Exception -> L60
            goto L49
        L60:
            r3 = move-exception
            java.lang.String r4 = "MediaCodecRenderer"
            if (r2 != r0) goto L73
            java.lang.String r3 = "Preferred decoder instantiation failed. Sleeping for 50ms then retrying."
            com.google.android.exoplayer2.util.Log.w(r4, r3)     // Catch: java.lang.Exception -> L74
            r5 = 50
            java.lang.Thread.sleep(r5)     // Catch: java.lang.Exception -> L74
            r7.initCodec(r2, r8)     // Catch: java.lang.Exception -> L74
            goto L49
        L73:
            throw r3     // Catch: java.lang.Exception -> L74
        L74:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed to initialize decoder: "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            com.google.android.exoplayer2.util.Log.w(r4, r5, r3)
            java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> r4 = r7.availableCodecInfos
            r4.removeFirst()
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r4 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException
            com.google.android.exoplayer2.Format r5 = r7.inputFormat
            r4.<init>(r5, r3, r9, r2)
            r7.onCodecError(r4)
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r2 = r7.preferredDecoderInitializationException
            if (r2 != 0) goto L9f
            r7.preferredDecoderInitializationException = r4
            goto La5
        L9f:
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r2 = com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException.access$000(r2, r4)
            r7.preferredDecoderInitializationException = r2
        La5:
            java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> r2 = r7.availableCodecInfos
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto Lae
            goto L49
        Lae:
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r8 = r7.preferredDecoderInitializationException
            throw r8
        Lb1:
            r7.availableCodecInfos = r1
            return
        Lb4:
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r8 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException
            com.google.android.exoplayer2.Format r0 = r7.inputFormat
            r2 = -49999(0xffffffffffff3cb1, float:NaN)
            r8.<init>(r0, r1, r9, r2)
            throw r8
    }

    @android.annotation.TargetApi(23)
    private void processEndOfStream() throws com.google.android.exoplayer2.ExoPlaybackException {
            r3 = this;
            int r0 = r3.codecDrainAction
            r1 = 1
            if (r0 == r1) goto L1c
            r2 = 2
            if (r0 == r2) goto L15
            r2 = 3
            if (r0 == r2) goto L11
            r3.outputStreamEnded = r1
            r3.renderToEndOfStream()
            goto L1f
        L11:
            r3.reinitializeCodec()
            goto L1f
        L15:
            r3.flushCodec()
            r3.updateDrmSessionV23()
            goto L1f
        L1c:
            r3.flushCodec()
        L1f:
            return
    }

    private void processOutputMediaFormatChanged() {
            r4 = this;
            r0 = 1
            r4.codecHasOutputMediaFormat = r0
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r1 = r4.codec
            android.media.MediaFormat r1 = r1.getOutputFormat()
            int r2 = r4.codecAdaptationWorkaroundMode
            if (r2 == 0) goto L23
            java.lang.String r2 = "width"
            int r2 = r1.getInteger(r2)
            r3 = 32
            if (r2 != r3) goto L23
            java.lang.String r2 = "height"
            int r2 = r1.getInteger(r2)
            if (r2 != r3) goto L23
            r4.shouldSkipAdaptationWorkaroundOutputBuffer = r0
            return
        L23:
            boolean r2 = r4.codecNeedsMonoChannelCountWorkaround
            if (r2 == 0) goto L2c
            java.lang.String r2 = "channel-count"
            r1.setInteger(r2, r0)
        L2c:
            r4.codecOutputMediaFormat = r1
            r4.codecOutputMediaFormatChanged = r0
            return
    }

    private boolean readSourceOmittingSampleData(int r4) throws com.google.android.exoplayer2.ExoPlaybackException {
            r3 = this;
            com.google.android.exoplayer2.FormatHolder r0 = r3.getFormatHolder()
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r1 = r3.noDataBuffer
            r1.clear()
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r1 = r3.noDataBuffer
            r4 = r4 | 4
            int r4 = r3.readSource(r0, r1, r4)
            r1 = 1
            r2 = -5
            if (r4 != r2) goto L19
            r3.onInputFormatChanged(r0)
            return r1
        L19:
            r0 = -4
            if (r4 != r0) goto L29
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r4 = r3.noDataBuffer
            boolean r4 = r4.isEndOfStream()
            if (r4 == 0) goto L29
            r3.inputStreamEnded = r1
            r3.processEndOfStream()
        L29:
            r4 = 0
            return r4
    }

    private void reinitializeCodec() throws com.google.android.exoplayer2.ExoPlaybackException {
            r0 = this;
            r0.releaseCodec()
            r0.maybeInitCodecOrBypass()
            return
    }

    private void resetInputBuffer() {
            r2 = this;
            r0 = -1
            r2.inputIndex = r0
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r0 = r2.buffer
            r1 = 0
            r0.data = r1
            return
    }

    private void resetOutputBuffer() {
            r1 = this;
            r0 = -1
            r1.outputIndex = r0
            r0 = 0
            r1.outputBuffer = r0
            return
    }

    private void setCodecDrmSession(@androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmSession r2) {
            r1 = this;
            com.google.android.exoplayer2.drm.DrmSession r0 = r1.codecDrmSession
            com.google.android.exoplayer2.drm.DrmSession.CC.replaceSession(r0, r2)
            r1.codecDrmSession = r2
            return
    }

    private void setOutputStreamInfo(com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.OutputStreamInfo r5) {
            r4 = this;
            r4.outputStreamInfo = r5
            long r0 = r5.streamOffsetUs
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L13
            r5 = 1
            r4.needToNotifyOutputFormatChangeAfterStreamChange = r5
            r4.onOutputStreamOffsetUsChanged(r0)
        L13:
            return
    }

    private void setSourceDrmSession(@androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmSession r2) {
            r1 = this;
            com.google.android.exoplayer2.drm.DrmSession r0 = r1.sourceDrmSession
            com.google.android.exoplayer2.drm.DrmSession.CC.replaceSession(r0, r2)
            r1.sourceDrmSession = r2
            return
    }

    private boolean shouldContinueRendering(long r6) {
            r5 = this;
            long r0 = r5.renderTimeLimitMs
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L19
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 - r6
            long r6 = r5.renderTimeLimitMs
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 >= 0) goto L17
            goto L19
        L17:
            r6 = 0
            goto L1a
        L19:
            r6 = 1
        L1a:
            return r6
    }

    private boolean updateCodecOperatingRate(com.google.android.exoplayer2.Format r5) throws com.google.android.exoplayer2.ExoPlaybackException {
            r4 = this;
            int r5 = com.google.android.exoplayer2.util.Util.SDK_INT
            r0 = 1
            r1 = 23
            if (r5 >= r1) goto L8
            return r0
        L8:
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r5 = r4.codec
            if (r5 == 0) goto L51
            int r5 = r4.codecDrainAction
            r1 = 3
            if (r5 == r1) goto L51
            int r5 = r4.getState()
            if (r5 != 0) goto L18
            goto L51
        L18:
            float r5 = r4.targetPlaybackSpeed
            com.google.android.exoplayer2.Format[] r1 = r4.getStreamFormats()
            float r5 = r4.getCodecOperatingRateV23(r5, r1)
            float r1 = r4.codecOperatingRate
            int r2 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r2 != 0) goto L29
            return r0
        L29:
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r3 != 0) goto L34
            r4.drainAndReinitializeCodec()
            r5 = 0
            return r5
        L34:
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L40
            float r1 = r4.assumedMinimumCodecOperatingRate
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 <= 0) goto L3f
            goto L40
        L3f:
            return r0
        L40:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "operating-rate"
            r1.putFloat(r2, r5)
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r2 = r4.codec
            r2.setParameters(r1)
            r4.codecOperatingRate = r5
        L51:
            return r0
    }

    @androidx.annotation.RequiresApi(23)
    private void updateDrmSessionV23() throws com.google.android.exoplayer2.ExoPlaybackException {
            r4 = this;
            r0 = 0
            android.media.MediaCrypto r1 = r4.mediaCrypto     // Catch: android.media.MediaCryptoException -> L18
            com.google.android.exoplayer2.drm.DrmSession r2 = r4.sourceDrmSession     // Catch: android.media.MediaCryptoException -> L18
            com.google.android.exoplayer2.drm.FrameworkCryptoConfig r2 = r4.getFrameworkCryptoConfig(r2)     // Catch: android.media.MediaCryptoException -> L18
            byte[] r2 = r2.sessionId     // Catch: android.media.MediaCryptoException -> L18
            r1.setMediaDrmSession(r2)     // Catch: android.media.MediaCryptoException -> L18
            com.google.android.exoplayer2.drm.DrmSession r1 = r4.sourceDrmSession
            r4.setCodecDrmSession(r1)
            r4.codecDrainState = r0
            r4.codecDrainAction = r0
            return
        L18:
            r1 = move-exception
            com.google.android.exoplayer2.Format r2 = r4.inputFormat
            r3 = 6006(0x1776, float:8.416E-42)
            com.google.android.exoplayer2.ExoPlaybackException r0 = r4.createRendererException(r1, r2, r0, r3)
            throw r0
    }

    public com.google.android.exoplayer2.decoder.DecoderReuseEvaluation canReuseCodec(com.google.android.exoplayer2.mediacodec.MediaCodecInfo r8, com.google.android.exoplayer2.Format r9, com.google.android.exoplayer2.Format r10) {
            r7 = this;
            com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r6 = new com.google.android.exoplayer2.decoder.DecoderReuseEvaluation
            java.lang.String r1 = r8.name
            r4 = 0
            r5 = 1
            r0 = r6
            r2 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    public com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException createDecoderException(java.lang.Throwable r2, @androidx.annotation.Nullable com.google.android.exoplayer2.mediacodec.MediaCodecInfo r3) {
            r1 = this;
            com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException r0 = new com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException
            r0.<init>(r2, r3)
            return r0
    }

    public final boolean flushOrReleaseCodec() {
            r5 = this;
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r0 = r5.codec
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r5.codecDrainAction
            r2 = 3
            r3 = 1
            if (r0 == r2) goto L46
            boolean r2 = r5.codecNeedsFlushWorkaround
            if (r2 != 0) goto L46
            boolean r2 = r5.codecNeedsSosFlushWorkaround
            if (r2 == 0) goto L18
            boolean r2 = r5.codecHasOutputMediaFormat
            if (r2 == 0) goto L46
        L18:
            boolean r2 = r5.codecNeedsEosFlushWorkaround
            if (r2 == 0) goto L21
            boolean r2 = r5.codecReceivedEos
            if (r2 == 0) goto L21
            goto L46
        L21:
            r2 = 2
            if (r0 != r2) goto L42
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r2 = 23
            if (r0 < r2) goto L2c
            r4 = 1
            goto L2d
        L2c:
            r4 = 0
        L2d:
            com.google.android.exoplayer2.util.Assertions.checkState(r4)
            if (r0 < r2) goto L42
            r5.updateDrmSessionV23()     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L36
            goto L42
        L36:
            r0 = move-exception
            java.lang.String r1 = "MediaCodecRenderer"
            java.lang.String r2 = "Failed to update the DRM session, releasing the codec instead."
            com.google.android.exoplayer2.util.Log.w(r1, r2, r0)
            r5.releaseCodec()
            return r3
        L42:
            r5.flushCodec()
            return r1
        L46:
            r5.releaseCodec()
            return r3
    }

    @androidx.annotation.Nullable
    public final com.google.android.exoplayer2.mediacodec.MediaCodecAdapter getCodec() {
            r1 = this;
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r0 = r1.codec
            return r0
    }

    @androidx.annotation.Nullable
    public final com.google.android.exoplayer2.mediacodec.MediaCodecInfo getCodecInfo() {
            r1 = this;
            com.google.android.exoplayer2.mediacodec.MediaCodecInfo r0 = r1.codecInfo
            return r0
    }

    public boolean getCodecNeedsEosPropagation() {
            r1 = this;
            r0 = 0
            return r0
    }

    public float getCodecOperatingRateV23(float r1, com.google.android.exoplayer2.Format[] r2) {
            r0 = this;
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            return r1
    }

    @androidx.annotation.Nullable
    public final android.media.MediaFormat getCodecOutputMediaFormat() {
            r1 = this;
            android.media.MediaFormat r0 = r1.codecOutputMediaFormat
            return r0
    }

    public abstract java.util.List<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> getDecoderInfos(com.google.android.exoplayer2.mediacodec.MediaCodecSelector r1, com.google.android.exoplayer2.Format r2, boolean r3) throws com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException;

    public abstract com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Configuration getMediaCodecConfiguration(com.google.android.exoplayer2.mediacodec.MediaCodecInfo r1, com.google.android.exoplayer2.Format r2, @androidx.annotation.Nullable android.media.MediaCrypto r3, float r4);

    public final long getOutputStreamOffsetUs() {
            r2 = this;
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo r0 = r2.outputStreamInfo
            long r0 = r0.streamOffsetUs
            return r0
    }

    public final float getPlaybackSpeed() {
            r1 = this;
            float r0 = r1.currentPlaybackSpeed
            return r0
    }

    public void handleInputBufferSupplementalData(com.google.android.exoplayer2.decoder.DecoderInputBuffer r1) throws com.google.android.exoplayer2.ExoPlaybackException {
            r0 = this;
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
            r5 = this;
            com.google.android.exoplayer2.Format r0 = r5.inputFormat
            if (r0 == 0) goto L27
            boolean r0 = r5.isSourceReady()
            if (r0 != 0) goto L25
            boolean r0 = r5.hasOutputBuffer()
            if (r0 != 0) goto L25
            long r0 = r5.codecHotswapDeadlineMs
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L27
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r5.codecHotswapDeadlineMs
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L27
        L25:
            r0 = 1
            goto L28
        L27:
            r0 = 0
        L28:
            return r0
    }

    public final void maybeInitCodecOrBypass() throws com.google.android.exoplayer2.ExoPlaybackException {
            r7 = this;
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r0 = r7.codec
            if (r0 != 0) goto L9d
            boolean r0 = r7.bypassEnabled
            if (r0 != 0) goto L9d
            com.google.android.exoplayer2.Format r0 = r7.inputFormat
            if (r0 != 0) goto Le
            goto L9d
        Le:
            com.google.android.exoplayer2.drm.DrmSession r1 = r7.sourceDrmSession
            if (r1 != 0) goto L1e
            boolean r0 = r7.shouldUseBypass(r0)
            if (r0 == 0) goto L1e
            com.google.android.exoplayer2.Format r0 = r7.inputFormat
            r7.initBypass(r0)
            return
        L1e:
            com.google.android.exoplayer2.drm.DrmSession r0 = r7.sourceDrmSession
            r7.setCodecDrmSession(r0)
            com.google.android.exoplayer2.Format r0 = r7.inputFormat
            java.lang.String r0 = r0.sampleMimeType
            com.google.android.exoplayer2.drm.DrmSession r1 = r7.codecDrmSession
            r2 = 0
            if (r1 == 0) goto L8b
            android.media.MediaCrypto r3 = r7.mediaCrypto
            r4 = 1
            if (r3 != 0) goto L66
            com.google.android.exoplayer2.drm.FrameworkCryptoConfig r1 = r7.getFrameworkCryptoConfig(r1)
            if (r1 != 0) goto L41
            com.google.android.exoplayer2.drm.DrmSession r0 = r7.codecDrmSession
            com.google.android.exoplayer2.drm.DrmSession$DrmSessionException r0 = r0.getError()
            if (r0 == 0) goto L40
            goto L66
        L40:
            return
        L41:
            android.media.MediaCrypto r3 = new android.media.MediaCrypto     // Catch: android.media.MediaCryptoException -> L5c
            java.util.UUID r5 = r1.uuid     // Catch: android.media.MediaCryptoException -> L5c
            byte[] r6 = r1.sessionId     // Catch: android.media.MediaCryptoException -> L5c
            r3.<init>(r5, r6)     // Catch: android.media.MediaCryptoException -> L5c
            r7.mediaCrypto = r3     // Catch: android.media.MediaCryptoException -> L5c
            boolean r1 = r1.forceAllowInsecureDecoderComponents
            if (r1 != 0) goto L58
            boolean r0 = r3.requiresSecureDecoderComponent(r0)
            if (r0 == 0) goto L58
            r0 = 1
            goto L59
        L58:
            r0 = 0
        L59:
            r7.mediaCryptoRequiresSecureDecoder = r0
            goto L66
        L5c:
            r0 = move-exception
            com.google.android.exoplayer2.Format r1 = r7.inputFormat
            r3 = 6006(0x1776, float:8.416E-42)
            com.google.android.exoplayer2.ExoPlaybackException r0 = r7.createRendererException(r0, r1, r2, r3)
            throw r0
        L66:
            boolean r0 = com.google.android.exoplayer2.drm.FrameworkCryptoConfig.WORKAROUND_DEVICE_NEEDS_KEYS_TO_CONFIGURE_CODEC
            if (r0 == 0) goto L8b
            com.google.android.exoplayer2.drm.DrmSession r0 = r7.codecDrmSession
            int r0 = r0.getState()
            if (r0 == r4) goto L76
            r1 = 4
            if (r0 == r1) goto L8b
            return
        L76:
            com.google.android.exoplayer2.drm.DrmSession r0 = r7.codecDrmSession
            com.google.android.exoplayer2.drm.DrmSession$DrmSessionException r0 = r0.getError()
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.drm.DrmSession$DrmSessionException r0 = (com.google.android.exoplayer2.drm.DrmSession.DrmSessionException) r0
            com.google.android.exoplayer2.Format r1 = r7.inputFormat
            int r3 = r0.errorCode
            com.google.android.exoplayer2.ExoPlaybackException r0 = r7.createRendererException(r0, r1, r2, r3)
            throw r0
        L8b:
            android.media.MediaCrypto r0 = r7.mediaCrypto     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException -> L93
            boolean r1 = r7.mediaCryptoRequiresSecureDecoder     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException -> L93
            r7.maybeInitCodecWithFallback(r0, r1)     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException -> L93
            return
        L93:
            r0 = move-exception
            com.google.android.exoplayer2.Format r1 = r7.inputFormat
            r3 = 4001(0xfa1, float:5.607E-42)
            com.google.android.exoplayer2.ExoPlaybackException r0 = r7.createRendererException(r0, r1, r2, r3)
            throw r0
        L9d:
            return
    }

    public void onCodecError(java.lang.Exception r1) {
            r0 = this;
            return
    }

    public void onCodecInitialized(java.lang.String r1, long r2, long r4) {
            r0 = this;
            return
    }

    public void onCodecReleased(java.lang.String r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onDisabled() {
            r1 = this;
            r0 = 0
            r1.inputFormat = r0
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo r0 = com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.OutputStreamInfo.UNSET
            r1.setOutputStreamInfo(r0)
            java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo> r0 = r1.pendingOutputStreamChanges
            r0.clear()
            r1.flushOrReleaseCodec()
            return
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onEnabled(boolean r1, boolean r2) throws com.google.android.exoplayer2.ExoPlaybackException {
            r0 = this;
            com.google.android.exoplayer2.decoder.DecoderCounters r1 = new com.google.android.exoplayer2.decoder.DecoderCounters
            r1.<init>()
            r0.decoderCounters = r1
            return
    }

    @androidx.annotation.Nullable
    @androidx.annotation.CallSuper
    public com.google.android.exoplayer2.decoder.DecoderReuseEvaluation onInputFormatChanged(com.google.android.exoplayer2.FormatHolder r12) throws com.google.android.exoplayer2.ExoPlaybackException {
            r11 = this;
            r0 = 1
            r11.waitingForFirstSampleInFormat = r0
            com.google.android.exoplayer2.Format r1 = r12.format
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            r5 = r1
            com.google.android.exoplayer2.Format r5 = (com.google.android.exoplayer2.Format) r5
            java.lang.String r1 = r5.sampleMimeType
            r2 = 0
            if (r1 == 0) goto Lec
            com.google.android.exoplayer2.drm.DrmSession r12 = r12.drmSession
            r11.setSourceDrmSession(r12)
            r11.inputFormat = r5
            boolean r12 = r11.bypassEnabled
            r1 = 0
            if (r12 == 0) goto L20
            r11.bypassDrainAndReinitialize = r0
            return r1
        L20:
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r12 = r11.codec
            if (r12 != 0) goto L2a
            r11.availableCodecInfos = r1
            r11.maybeInitCodecOrBypass()
            return r1
        L2a:
            com.google.android.exoplayer2.mediacodec.MediaCodecInfo r1 = r11.codecInfo
            com.google.android.exoplayer2.Format r4 = r11.codecInputFormat
            com.google.android.exoplayer2.drm.DrmSession r3 = r11.codecDrmSession
            com.google.android.exoplayer2.drm.DrmSession r6 = r11.sourceDrmSession
            boolean r3 = r11.drmNeedsCodecReinitialization(r1, r5, r3, r6)
            if (r3 == 0) goto L47
            r11.drainAndReinitializeCodec()
            com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r12 = new com.google.android.exoplayer2.decoder.DecoderReuseEvaluation
            java.lang.String r3 = r1.name
            r6 = 0
            r7 = 128(0x80, float:1.8E-43)
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            return r12
        L47:
            com.google.android.exoplayer2.drm.DrmSession r3 = r11.sourceDrmSession
            com.google.android.exoplayer2.drm.DrmSession r6 = r11.codecDrmSession
            if (r3 == r6) goto L4f
            r3 = 1
            goto L50
        L4f:
            r3 = 0
        L50:
            if (r3 == 0) goto L5b
            int r6 = com.google.android.exoplayer2.util.Util.SDK_INT
            r7 = 23
            if (r6 < r7) goto L59
            goto L5b
        L59:
            r6 = 0
            goto L5c
        L5b:
            r6 = 1
        L5c:
            com.google.android.exoplayer2.util.Assertions.checkState(r6)
            com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r6 = r11.canReuseCodec(r1, r4, r5)
            int r7 = r6.result
            r8 = 3
            r9 = 16
            r10 = 2
            if (r7 == 0) goto Ld1
            if (r7 == r0) goto Lb5
            if (r7 == r10) goto L89
            if (r7 != r8) goto L83
            boolean r0 = r11.updateCodecOperatingRate(r5)
            if (r0 != 0) goto L78
            goto Lbb
        L78:
            r11.codecInputFormat = r5
            if (r3 == 0) goto Ld4
            boolean r0 = r11.drainAndUpdateCodecDrmSessionV23()
            if (r0 != 0) goto Ld4
            goto Lcf
        L83:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>()
            throw r12
        L89:
            boolean r7 = r11.updateCodecOperatingRate(r5)
            if (r7 != 0) goto L90
            goto Lbb
        L90:
            r11.codecReconfigured = r0
            r11.codecReconfigurationState = r0
            int r7 = r11.codecAdaptationWorkaroundMode
            if (r7 == r10) goto La8
            if (r7 != r0) goto La7
            int r7 = r5.width
            int r9 = r4.width
            if (r7 != r9) goto La7
            int r7 = r5.height
            int r9 = r4.height
            if (r7 != r9) goto La7
            goto La8
        La7:
            r0 = 0
        La8:
            r11.codecNeedsAdaptationWorkaroundBuffer = r0
            r11.codecInputFormat = r5
            if (r3 == 0) goto Ld4
            boolean r0 = r11.drainAndUpdateCodecDrmSessionV23()
            if (r0 != 0) goto Ld4
            goto Lcf
        Lb5:
            boolean r0 = r11.updateCodecOperatingRate(r5)
            if (r0 != 0) goto Lbe
        Lbb:
            r7 = 16
            goto Ld5
        Lbe:
            r11.codecInputFormat = r5
            if (r3 == 0) goto Lc9
            boolean r0 = r11.drainAndUpdateCodecDrmSessionV23()
            if (r0 != 0) goto Ld4
            goto Lcf
        Lc9:
            boolean r0 = r11.drainAndFlushCodec()
            if (r0 != 0) goto Ld4
        Lcf:
            r7 = 2
            goto Ld5
        Ld1:
            r11.drainAndReinitializeCodec()
        Ld4:
            r7 = 0
        Ld5:
            int r0 = r6.result
            if (r0 == 0) goto Leb
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r0 = r11.codec
            if (r0 != r12) goto Le1
            int r12 = r11.codecDrainAction
            if (r12 != r8) goto Leb
        Le1:
            com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r12 = new com.google.android.exoplayer2.decoder.DecoderReuseEvaluation
            java.lang.String r3 = r1.name
            r6 = 0
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            return r12
        Leb:
            return r6
        Lec:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>()
            r0 = 4005(0xfa5, float:5.612E-42)
            com.google.android.exoplayer2.ExoPlaybackException r12 = r11.createRendererException(r12, r5, r2, r0)
            throw r12
    }

    public void onOutputFormatChanged(com.google.android.exoplayer2.Format r1, @androidx.annotation.Nullable android.media.MediaFormat r2) throws com.google.android.exoplayer2.ExoPlaybackException {
            r0 = this;
            return
    }

    public void onOutputStreamOffsetUsChanged(long r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onPositionReset(long r1, boolean r3) throws com.google.android.exoplayer2.ExoPlaybackException {
            r0 = this;
            r1 = 0
            r0.inputStreamEnded = r1
            r0.outputStreamEnded = r1
            r0.pendingOutputEndOfStream = r1
            boolean r2 = r0.bypassEnabled
            if (r2 == 0) goto L18
            com.google.android.exoplayer2.mediacodec.BatchBuffer r2 = r0.bypassBatchBuffer
            r2.clear()
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r2 = r0.bypassSampleBuffer
            r2.clear()
            r0.bypassSampleBufferPending = r1
            goto L21
        L18:
            boolean r1 = r0.flushOrReleaseCodec()
            if (r1 == 0) goto L21
            r0.maybeInitCodecOrBypass()
        L21:
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo r1 = r0.outputStreamInfo
            com.google.android.exoplayer2.util.TimedValueQueue<com.google.android.exoplayer2.Format> r1 = r1.formatQueue
            int r1 = r1.size()
            if (r1 <= 0) goto L2e
            r1 = 1
            r0.waitingForFirstSampleInFormat = r1
        L2e:
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo r1 = r0.outputStreamInfo
            com.google.android.exoplayer2.util.TimedValueQueue<com.google.android.exoplayer2.Format> r1 = r1.formatQueue
            r1.clear()
            java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo> r1 = r0.pendingOutputStreamChanges
            r1.clear()
            return
    }

    @androidx.annotation.CallSuper
    public void onProcessedOutputBuffer(long r4) {
            r3 = this;
            r3.lastProcessedOutputBufferTimeUs = r4
        L2:
            java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo> r0 = r3.pendingOutputStreamChanges
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L27
            java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo> r0 = r3.pendingOutputStreamChanges
            java.lang.Object r0 = r0.peek()
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo r0 = (com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.OutputStreamInfo) r0
            long r0 = r0.previousStreamLastBufferTimeUs
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L27
            java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo> r0 = r3.pendingOutputStreamChanges
            java.lang.Object r0 = r0.poll()
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo r0 = (com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.OutputStreamInfo) r0
            r3.setOutputStreamInfo(r0)
            r3.onProcessedStreamChange()
            goto L2
        L27:
            return
    }

    public void onProcessedStreamChange() {
            r0 = this;
            return
    }

    public void onQueueInputBuffer(com.google.android.exoplayer2.decoder.DecoderInputBuffer r1) throws com.google.android.exoplayer2.ExoPlaybackException {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onReset() {
            r2 = this;
            r0 = 0
            r2.disableBypass()     // Catch: java.lang.Throwable -> Lb
            r2.releaseCodec()     // Catch: java.lang.Throwable -> Lb
            r2.setSourceDrmSession(r0)
            return
        Lb:
            r1 = move-exception
            r2.setSourceDrmSession(r0)
            throw r1
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onStarted() {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onStopped() {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public final void onStreamChanged(com.google.android.exoplayer2.Format[] r16, long r17, long r19) throws com.google.android.exoplayer2.ExoPlaybackException {
            r15 = this;
            r0 = r15
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo r1 = r0.outputStreamInfo
            long r1 = r1.streamOffsetUs
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L21
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo r1 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = r1
            r9 = r17
            r11 = r19
            r6.<init>(r7, r9, r11)
            r15.setOutputStreamInfo(r1)
            goto L68
        L21:
            java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo> r1 = r0.pendingOutputStreamChanges
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L57
            long r1 = r0.largestQueuedPresentationTimeUs
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L39
            long r5 = r0.lastProcessedOutputBufferTimeUs
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L57
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 < 0) goto L57
        L39:
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo r1 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r1
            r11 = r17
            r13 = r19
            r8.<init>(r9, r11, r13)
            r15.setOutputStreamInfo(r1)
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo r1 = r0.outputStreamInfo
            long r1 = r1.streamOffsetUs
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L68
            r15.onProcessedStreamChange()
            goto L68
        L57:
            java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo> r1 = r0.pendingOutputStreamChanges
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo r9 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo
            long r3 = r0.largestQueuedPresentationTimeUs
            r2 = r9
            r5 = r17
            r7 = r19
            r2.<init>(r3, r5, r7)
            r1.add(r9)
        L68:
            return
    }

    public abstract boolean processOutputBuffer(long r1, long r3, @androidx.annotation.Nullable com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r5, @androidx.annotation.Nullable java.nio.ByteBuffer r6, int r7, int r8, int r9, long r10, boolean r12, boolean r13, com.google.android.exoplayer2.Format r14) throws com.google.android.exoplayer2.ExoPlaybackException;

    public final void releaseCodec() {
            r3 = this;
            r0 = 0
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r1 = r3.codec     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L17
            r1.release()     // Catch: java.lang.Throwable -> L33
            com.google.android.exoplayer2.decoder.DecoderCounters r1 = r3.decoderCounters     // Catch: java.lang.Throwable -> L33
            int r2 = r1.decoderReleaseCount     // Catch: java.lang.Throwable -> L33
            int r2 = r2 + 1
            r1.decoderReleaseCount = r2     // Catch: java.lang.Throwable -> L33
            com.google.android.exoplayer2.mediacodec.MediaCodecInfo r1 = r3.codecInfo     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = r1.name     // Catch: java.lang.Throwable -> L33
            r3.onCodecReleased(r1)     // Catch: java.lang.Throwable -> L33
        L17:
            r3.codec = r0
            android.media.MediaCrypto r1 = r3.mediaCrypto     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L20
            r1.release()     // Catch: java.lang.Throwable -> L29
        L20:
            r3.mediaCrypto = r0
            r3.setCodecDrmSession(r0)
            r3.resetCodecStateForRelease()
            return
        L29:
            r1 = move-exception
            r3.mediaCrypto = r0
            r3.setCodecDrmSession(r0)
            r3.resetCodecStateForRelease()
            throw r1
        L33:
            r1 = move-exception
            r3.codec = r0
            android.media.MediaCrypto r2 = r3.mediaCrypto     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L3d
            r2.release()     // Catch: java.lang.Throwable -> L46
        L3d:
            r3.mediaCrypto = r0
            r3.setCodecDrmSession(r0)
            r3.resetCodecStateForRelease()
            throw r1
        L46:
            r1 = move-exception
            r3.mediaCrypto = r0
            r3.setCodecDrmSession(r0)
            r3.resetCodecStateForRelease()
            throw r1
    }

    @Override // com.google.android.exoplayer2.Renderer
    public void render(long r6, long r8) throws com.google.android.exoplayer2.ExoPlaybackException {
            r5 = this;
            boolean r0 = r5.pendingOutputEndOfStream
            r1 = 0
            if (r0 == 0) goto La
            r5.pendingOutputEndOfStream = r1
            r5.processEndOfStream()
        La:
            com.google.android.exoplayer2.ExoPlaybackException r0 = r5.pendingPlaybackException
            if (r0 != 0) goto La5
            r0 = 1
            boolean r2 = r5.outputStreamEnded     // Catch: java.lang.IllegalStateException -> L79
            if (r2 == 0) goto L17
            r5.renderToEndOfStream()     // Catch: java.lang.IllegalStateException -> L79
            return
        L17:
            com.google.android.exoplayer2.Format r2 = r5.inputFormat     // Catch: java.lang.IllegalStateException -> L79
            if (r2 != 0) goto L23
            r2 = 2
            boolean r2 = r5.readSourceOmittingSampleData(r2)     // Catch: java.lang.IllegalStateException -> L79
            if (r2 != 0) goto L23
            return
        L23:
            r5.maybeInitCodecOrBypass()     // Catch: java.lang.IllegalStateException -> L79
            boolean r2 = r5.bypassEnabled     // Catch: java.lang.IllegalStateException -> L79
            if (r2 == 0) goto L3a
            java.lang.String r2 = "bypassRender"
            com.google.android.exoplayer2.util.TraceUtil.beginSection(r2)     // Catch: java.lang.IllegalStateException -> L79
        L2f:
            boolean r2 = r5.bypassRender(r6, r8)     // Catch: java.lang.IllegalStateException -> L79
            if (r2 == 0) goto L36
            goto L2f
        L36:
            com.google.android.exoplayer2.util.TraceUtil.endSection()     // Catch: java.lang.IllegalStateException -> L79
            goto L73
        L3a:
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r2 = r5.codec     // Catch: java.lang.IllegalStateException -> L79
            if (r2 == 0) goto L65
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.IllegalStateException -> L79
            java.lang.String r4 = "drainAndFeed"
            com.google.android.exoplayer2.util.TraceUtil.beginSection(r4)     // Catch: java.lang.IllegalStateException -> L79
        L47:
            boolean r4 = r5.drainOutputBuffer(r6, r8)     // Catch: java.lang.IllegalStateException -> L79
            if (r4 == 0) goto L54
            boolean r4 = r5.shouldContinueRendering(r2)     // Catch: java.lang.IllegalStateException -> L79
            if (r4 == 0) goto L54
            goto L47
        L54:
            boolean r6 = r5.feedInputBuffer()     // Catch: java.lang.IllegalStateException -> L79
            if (r6 == 0) goto L61
            boolean r6 = r5.shouldContinueRendering(r2)     // Catch: java.lang.IllegalStateException -> L79
            if (r6 == 0) goto L61
            goto L54
        L61:
            com.google.android.exoplayer2.util.TraceUtil.endSection()     // Catch: java.lang.IllegalStateException -> L79
            goto L73
        L65:
            com.google.android.exoplayer2.decoder.DecoderCounters r8 = r5.decoderCounters     // Catch: java.lang.IllegalStateException -> L79
            int r9 = r8.skippedInputBufferCount     // Catch: java.lang.IllegalStateException -> L79
            int r6 = r5.skipSource(r6)     // Catch: java.lang.IllegalStateException -> L79
            int r9 = r9 + r6
            r8.skippedInputBufferCount = r9     // Catch: java.lang.IllegalStateException -> L79
            r5.readSourceOmittingSampleData(r0)     // Catch: java.lang.IllegalStateException -> L79
        L73:
            com.google.android.exoplayer2.decoder.DecoderCounters r6 = r5.decoderCounters     // Catch: java.lang.IllegalStateException -> L79
            r6.ensureUpdated()     // Catch: java.lang.IllegalStateException -> L79
            return
        L79:
            r6 = move-exception
            boolean r7 = isMediaCodecException(r6)
            if (r7 == 0) goto La4
            r5.onCodecError(r6)
            int r7 = com.google.android.exoplayer2.util.Util.SDK_INT
            r8 = 21
            if (r7 < r8) goto L90
            boolean r7 = isRecoverableMediaCodecExceptionV21(r6)
            if (r7 == 0) goto L90
            r1 = 1
        L90:
            if (r1 == 0) goto L95
            r5.releaseCodec()
        L95:
            com.google.android.exoplayer2.mediacodec.MediaCodecInfo r7 = r5.codecInfo
            com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException r6 = r5.createDecoderException(r6, r7)
            com.google.android.exoplayer2.Format r7 = r5.inputFormat
            r8 = 4003(0xfa3, float:5.61E-42)
            com.google.android.exoplayer2.ExoPlaybackException r6 = r5.createRendererException(r6, r7, r1, r8)
            throw r6
        La4:
            throw r6
        La5:
            r6 = 0
            r5.pendingPlaybackException = r6
            throw r0
    }

    public void renderToEndOfStream() throws com.google.android.exoplayer2.ExoPlaybackException {
            r0 = this;
            return
    }

    @androidx.annotation.CallSuper
    public void resetCodecStateForFlush() {
            r4 = this;
            r4.resetInputBuffer()
            r4.resetOutputBuffer()
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4.codecHotswapDeadlineMs = r0
            r2 = 0
            r4.codecReceivedEos = r2
            r4.codecReceivedBuffers = r2
            r4.codecNeedsAdaptationWorkaroundBuffer = r2
            r4.shouldSkipAdaptationWorkaroundOutputBuffer = r2
            r4.isDecodeOnlyOutputBuffer = r2
            r4.isLastOutputBuffer = r2
            java.util.ArrayList<java.lang.Long> r3 = r4.decodeOnlyPresentationTimestamps
            r3.clear()
            r4.largestQueuedPresentationTimeUs = r0
            r4.lastBufferInStreamPresentationTimeUs = r0
            r4.lastProcessedOutputBufferTimeUs = r0
            com.google.android.exoplayer2.mediacodec.C2Mp3TimestampTracker r0 = r4.c2Mp3TimestampTracker
            if (r0 == 0) goto L2c
            r0.reset()
        L2c:
            r4.codecDrainState = r2
            r4.codecDrainAction = r2
            boolean r0 = r4.codecReconfigured
            r4.codecReconfigurationState = r0
            return
    }

    @androidx.annotation.CallSuper
    public final void resetCodecStateForRelease() {
            r2 = this;
            r2.resetCodecStateForFlush()
            r0 = 0
            r2.pendingPlaybackException = r0
            r2.c2Mp3TimestampTracker = r0
            r2.availableCodecInfos = r0
            r2.codecInfo = r0
            r2.codecInputFormat = r0
            r2.codecOutputMediaFormat = r0
            r0 = 0
            r2.codecOutputMediaFormatChanged = r0
            r2.codecHasOutputMediaFormat = r0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.codecOperatingRate = r1
            r2.codecAdaptationWorkaroundMode = r0
            r2.codecNeedsDiscardToSpsWorkaround = r0
            r2.codecNeedsFlushWorkaround = r0
            r2.codecNeedsSosFlushWorkaround = r0
            r2.codecNeedsEosFlushWorkaround = r0
            r2.codecNeedsEosOutputExceptionWorkaround = r0
            r2.codecNeedsEosBufferTimestampWorkaround = r0
            r2.codecNeedsMonoChannelCountWorkaround = r0
            r2.codecNeedsEosPropagation = r0
            r2.codecReconfigured = r0
            r2.codecReconfigurationState = r0
            r2.mediaCryptoRequiresSecureDecoder = r0
            return
    }

    public final void setPendingOutputEndOfStream() {
            r1 = this;
            r0 = 1
            r1.pendingOutputEndOfStream = r0
            return
    }

    public final void setPendingPlaybackException(com.google.android.exoplayer2.ExoPlaybackException r1) {
            r0 = this;
            r0.pendingPlaybackException = r1
            return
    }

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.Renderer
    public void setPlaybackSpeed(float r1, float r2) throws com.google.android.exoplayer2.ExoPlaybackException {
            r0 = this;
            r0.currentPlaybackSpeed = r1
            r0.targetPlaybackSpeed = r2
            com.google.android.exoplayer2.Format r1 = r0.codecInputFormat
            r0.updateCodecOperatingRate(r1)
            return
    }

    public void setRenderTimeLimitMs(long r1) {
            r0 = this;
            r0.renderTimeLimitMs = r1
            return
    }

    public boolean shouldInitCodec(com.google.android.exoplayer2.mediacodec.MediaCodecInfo r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    public boolean shouldUseBypass(com.google.android.exoplayer2.Format r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public final int supportsFormat(com.google.android.exoplayer2.Format r4) throws com.google.android.exoplayer2.ExoPlaybackException {
            r3 = this;
            com.google.android.exoplayer2.mediacodec.MediaCodecSelector r0 = r3.mediaCodecSelector     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L7
            int r4 = r3.supportsFormat(r0, r4)     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L7
            return r4
        L7:
            r0 = move-exception
            r1 = 4002(0xfa2, float:5.608E-42)
            r2 = 0
            com.google.android.exoplayer2.ExoPlaybackException r4 = r3.createRendererException(r0, r4, r2, r1)
            throw r4
    }

    public abstract int supportsFormat(com.google.android.exoplayer2.mediacodec.MediaCodecSelector r1, com.google.android.exoplayer2.Format r2) throws com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException;

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.RendererCapabilities
    public final int supportsMixedMimeTypeAdaptation() {
            r1 = this;
            r0 = 8
            return r0
    }

    public final void updateOutputFormatForTime(long r2) throws com.google.android.exoplayer2.ExoPlaybackException {
            r1 = this;
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo r0 = r1.outputStreamInfo
            com.google.android.exoplayer2.util.TimedValueQueue<com.google.android.exoplayer2.Format> r0 = r0.formatQueue
            java.lang.Object r2 = r0.pollFloor(r2)
            com.google.android.exoplayer2.Format r2 = (com.google.android.exoplayer2.Format) r2
            if (r2 != 0) goto L1e
            boolean r3 = r1.needToNotifyOutputFormatChangeAfterStreamChange
            if (r3 == 0) goto L1e
            android.media.MediaFormat r3 = r1.codecOutputMediaFormat
            if (r3 == 0) goto L1e
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo r2 = r1.outputStreamInfo
            com.google.android.exoplayer2.util.TimedValueQueue<com.google.android.exoplayer2.Format> r2 = r2.formatQueue
            java.lang.Object r2 = r2.pollFirst()
            com.google.android.exoplayer2.Format r2 = (com.google.android.exoplayer2.Format) r2
        L1e:
            r3 = 0
            if (r2 == 0) goto L25
            r1.outputFormat = r2
            r2 = 1
            goto L26
        L25:
            r2 = 0
        L26:
            if (r2 != 0) goto L30
            boolean r2 = r1.codecOutputMediaFormatChanged
            if (r2 == 0) goto L3b
            com.google.android.exoplayer2.Format r2 = r1.outputFormat
            if (r2 == 0) goto L3b
        L30:
            com.google.android.exoplayer2.Format r2 = r1.outputFormat
            android.media.MediaFormat r0 = r1.codecOutputMediaFormat
            r1.onOutputFormatChanged(r2, r0)
            r1.codecOutputMediaFormatChanged = r3
            r1.needToNotifyOutputFormatChangeAfterStreamChange = r3
        L3b:
            return
    }
}
