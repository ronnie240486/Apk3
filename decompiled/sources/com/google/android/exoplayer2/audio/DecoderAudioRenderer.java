package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.decoder.Decoder;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DecoderAudioRenderer<T extends com.google.android.exoplayer2.decoder.Decoder<com.google.android.exoplayer2.decoder.DecoderInputBuffer, ? extends com.google.android.exoplayer2.decoder.SimpleDecoderOutputBuffer, ? extends com.google.android.exoplayer2.decoder.DecoderException>> extends com.google.android.exoplayer2.BaseRenderer implements com.google.android.exoplayer2.util.MediaClock {
    private static final int MAX_PENDING_OUTPUT_STREAM_OFFSET_COUNT = 10;
    private static final int REINITIALIZATION_STATE_NONE = 0;
    private static final int REINITIALIZATION_STATE_SIGNAL_END_OF_STREAM = 1;
    private static final int REINITIALIZATION_STATE_WAIT_END_OF_STREAM = 2;
    private static final java.lang.String TAG = "DecoderAudioRenderer";
    private boolean allowFirstBufferPositionDiscontinuity;
    private boolean allowPositionDiscontinuity;
    private final com.google.android.exoplayer2.audio.AudioSink audioSink;
    private boolean audioTrackNeedsConfigure;
    private long currentPositionUs;

    @androidx.annotation.Nullable
    private T decoder;
    private com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.drm.DrmSession decoderDrmSession;
    private boolean decoderReceivedBuffers;
    private int decoderReinitializationState;
    private int encoderDelay;
    private int encoderPadding;
    private final com.google.android.exoplayer2.audio.AudioRendererEventListener.EventDispatcher eventDispatcher;
    private boolean experimentalKeepAudioTrackOnSeek;
    private boolean firstStreamSampleRead;
    private final com.google.android.exoplayer2.decoder.DecoderInputBuffer flagsOnlyBuffer;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.decoder.DecoderInputBuffer inputBuffer;
    private com.google.android.exoplayer2.Format inputFormat;
    private boolean inputStreamEnded;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.decoder.SimpleDecoderOutputBuffer outputBuffer;
    private boolean outputStreamEnded;
    private long outputStreamOffsetUs;
    private int pendingOutputStreamOffsetCount;
    private final long[] pendingOutputStreamOffsetsUs;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.drm.DrmSession sourceDrmSession;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.DecoderAudioRenderer$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    @androidx.annotation.RequiresApi(23)
    public static final class Api23 {
        private Api23() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static void setAudioSinkPreferredDevice(com.google.android.exoplayer2.audio.AudioSink r0, @androidx.annotation.Nullable java.lang.Object r1) {
                android.media.AudioDeviceInfo r1 = (android.media.AudioDeviceInfo) r1
                r0.setPreferredDevice(r1)
                return
        }
    }

    public final class AudioSinkListener implements com.google.android.exoplayer2.audio.AudioSink.Listener {
        public final /* synthetic */ com.google.android.exoplayer2.audio.DecoderAudioRenderer this$0;

        private AudioSinkListener(com.google.android.exoplayer2.audio.DecoderAudioRenderer r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ AudioSinkListener(com.google.android.exoplayer2.audio.DecoderAudioRenderer r1, com.google.android.exoplayer2.audio.DecoderAudioRenderer.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
        public void onAudioSinkError(java.lang.Exception r3) {
                r2 = this;
                java.lang.String r0 = "DecoderAudioRenderer"
                java.lang.String r1 = "Audio sink error"
                com.google.android.exoplayer2.util.Log.e(r0, r1, r3)
                com.google.android.exoplayer2.audio.DecoderAudioRenderer r0 = r2.this$0
                com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher r0 = com.google.android.exoplayer2.audio.DecoderAudioRenderer.access$100(r0)
                r0.audioSinkError(r3)
                return
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
        public final /* synthetic */ void onOffloadBufferEmptying() {
                r0 = this;
                com.google.android.exoplayer2.audio.AudioSink.Listener.CC.$default$onOffloadBufferEmptying(r0)
                return
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
        public final /* synthetic */ void onOffloadBufferFull() {
                r0 = this;
                com.google.android.exoplayer2.audio.AudioSink.Listener.CC.$default$onOffloadBufferFull(r0)
                return
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
        public void onPositionAdvancing(long r2) {
                r1 = this;
                com.google.android.exoplayer2.audio.DecoderAudioRenderer r0 = r1.this$0
                com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher r0 = com.google.android.exoplayer2.audio.DecoderAudioRenderer.access$100(r0)
                r0.positionAdvancing(r2)
                return
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
        public void onPositionDiscontinuity() {
                r1 = this;
                com.google.android.exoplayer2.audio.DecoderAudioRenderer r0 = r1.this$0
                r0.onPositionDiscontinuity()
                return
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
        public void onSkipSilenceEnabledChanged(boolean r2) {
                r1 = this;
                com.google.android.exoplayer2.audio.DecoderAudioRenderer r0 = r1.this$0
                com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher r0 = com.google.android.exoplayer2.audio.DecoderAudioRenderer.access$100(r0)
                r0.skipSilenceEnabledChanged(r2)
                return
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
        public void onUnderrun(int r8, long r9, long r11) {
                r7 = this;
                com.google.android.exoplayer2.audio.DecoderAudioRenderer r0 = r7.this$0
                com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher r1 = com.google.android.exoplayer2.audio.DecoderAudioRenderer.access$100(r0)
                r2 = r8
                r3 = r9
                r5 = r11
                r1.underrun(r2, r3, r5)
                return
        }
    }

    public DecoderAudioRenderer() {
            r2 = this;
            r0 = 0
            com.google.android.exoplayer2.audio.AudioProcessor[] r0 = new com.google.android.exoplayer2.audio.AudioProcessor[r0]
            r1 = 0
            r2.<init>(r1, r1, r0)
            return
    }

    public DecoderAudioRenderer(@androidx.annotation.Nullable android.os.Handler r3, @androidx.annotation.Nullable com.google.android.exoplayer2.audio.AudioRendererEventListener r4, com.google.android.exoplayer2.audio.AudioCapabilities r5, com.google.android.exoplayer2.audio.AudioProcessor... r6) {
            r2 = this;
            com.google.android.exoplayer2.audio.DefaultAudioSink$Builder r0 = new com.google.android.exoplayer2.audio.DefaultAudioSink$Builder
            r0.<init>()
            com.google.android.exoplayer2.audio.AudioCapabilities r1 = com.google.android.exoplayer2.audio.AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES
            java.lang.Object r5 = com.google.common.base.MoreObjects.firstNonNull(r5, r1)
            com.google.android.exoplayer2.audio.AudioCapabilities r5 = (com.google.android.exoplayer2.audio.AudioCapabilities) r5
            com.google.android.exoplayer2.audio.DefaultAudioSink$Builder r5 = r0.setAudioCapabilities(r5)
            com.google.android.exoplayer2.audio.DefaultAudioSink$Builder r5 = r5.setAudioProcessors(r6)
            com.google.android.exoplayer2.audio.DefaultAudioSink r5 = r5.build()
            r2.<init>(r3, r4, r5)
            return
    }

    public DecoderAudioRenderer(@androidx.annotation.Nullable android.os.Handler r3, @androidx.annotation.Nullable com.google.android.exoplayer2.audio.AudioRendererEventListener r4, com.google.android.exoplayer2.audio.AudioSink r5) {
            r2 = this;
            r0 = 1
            r2.<init>(r0)
            com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher r1 = new com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher
            r1.<init>(r3, r4)
            r2.eventDispatcher = r1
            r2.audioSink = r5
            com.google.android.exoplayer2.audio.DecoderAudioRenderer$AudioSinkListener r3 = new com.google.android.exoplayer2.audio.DecoderAudioRenderer$AudioSinkListener
            r4 = 0
            r3.<init>(r2, r4)
            r5.setListener(r3)
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r3 = com.google.android.exoplayer2.decoder.DecoderInputBuffer.newNoDataInstance()
            r2.flagsOnlyBuffer = r3
            r3 = 0
            r2.decoderReinitializationState = r3
            r2.audioTrackNeedsConfigure = r0
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.setOutputStreamOffsetUs(r3)
            r3 = 10
            long[] r3 = new long[r3]
            r2.pendingOutputStreamOffsetsUs = r3
            return
    }

    public DecoderAudioRenderer(@androidx.annotation.Nullable android.os.Handler r2, @androidx.annotation.Nullable com.google.android.exoplayer2.audio.AudioRendererEventListener r3, com.google.android.exoplayer2.audio.AudioProcessor... r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0, r4)
            return
    }

    public static /* synthetic */ com.google.android.exoplayer2.audio.AudioRendererEventListener.EventDispatcher access$100(com.google.android.exoplayer2.audio.DecoderAudioRenderer r0) {
            com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher r0 = r0.eventDispatcher
            return r0
    }

    private boolean drainOutputBuffer() throws com.google.android.exoplayer2.ExoPlaybackException, com.google.android.exoplayer2.decoder.DecoderException, com.google.android.exoplayer2.audio.AudioSink.ConfigurationException, com.google.android.exoplayer2.audio.AudioSink.InitializationException, com.google.android.exoplayer2.audio.AudioSink.WriteException {
            r8 = this;
            com.google.android.exoplayer2.decoder.SimpleDecoderOutputBuffer r0 = r8.outputBuffer
            r1 = 0
            if (r0 != 0) goto L2d
            T extends com.google.android.exoplayer2.decoder.Decoder<com.google.android.exoplayer2.decoder.DecoderInputBuffer, ? extends com.google.android.exoplayer2.decoder.SimpleDecoderOutputBuffer, ? extends com.google.android.exoplayer2.decoder.DecoderException> r0 = r8.decoder
            java.lang.Object r0 = r0.dequeueOutputBuffer()
            com.google.android.exoplayer2.decoder.SimpleDecoderOutputBuffer r0 = (com.google.android.exoplayer2.decoder.SimpleDecoderOutputBuffer) r0
            r8.outputBuffer = r0
            if (r0 != 0) goto L12
            return r1
        L12:
            int r0 = r0.skippedOutputBufferCount
            if (r0 <= 0) goto L22
            com.google.android.exoplayer2.decoder.DecoderCounters r2 = r8.decoderCounters
            int r3 = r2.skippedOutputBufferCount
            int r3 = r3 + r0
            r2.skippedOutputBufferCount = r3
            com.google.android.exoplayer2.audio.AudioSink r0 = r8.audioSink
            r0.handleDiscontinuity()
        L22:
            com.google.android.exoplayer2.decoder.SimpleDecoderOutputBuffer r0 = r8.outputBuffer
            boolean r0 = r0.isFirstSample()
            if (r0 == 0) goto L2d
            r8.processFirstSampleOfStream()
        L2d:
            com.google.android.exoplayer2.decoder.SimpleDecoderOutputBuffer r0 = r8.outputBuffer
            boolean r0 = r0.isEndOfStream()
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L5c
            int r0 = r8.decoderReinitializationState
            r4 = 2
            if (r0 != r4) goto L45
            r8.releaseDecoder()
            r8.maybeInitDecoder()
            r8.audioTrackNeedsConfigure = r3
            goto L4f
        L45:
            com.google.android.exoplayer2.decoder.SimpleDecoderOutputBuffer r0 = r8.outputBuffer
            r0.release()
            r8.outputBuffer = r2
            r8.processEndOfStream()     // Catch: com.google.android.exoplayer2.audio.AudioSink.WriteException -> L50
        L4f:
            return r1
        L50:
            r0 = move-exception
            com.google.android.exoplayer2.Format r1 = r0.format
            boolean r2 = r0.isRecoverable
            r3 = 5002(0x138a, float:7.009E-42)
            com.google.android.exoplayer2.ExoPlaybackException r0 = r8.createRendererException(r0, r1, r2, r3)
            throw r0
        L5c:
            boolean r0 = r8.audioTrackNeedsConfigure
            if (r0 == 0) goto L81
            T extends com.google.android.exoplayer2.decoder.Decoder<com.google.android.exoplayer2.decoder.DecoderInputBuffer, ? extends com.google.android.exoplayer2.decoder.SimpleDecoderOutputBuffer, ? extends com.google.android.exoplayer2.decoder.DecoderException> r0 = r8.decoder
            com.google.android.exoplayer2.Format r0 = r8.getOutputFormat(r0)
            com.google.android.exoplayer2.Format$Builder r0 = r0.buildUpon()
            int r4 = r8.encoderDelay
            com.google.android.exoplayer2.Format$Builder r0 = r0.setEncoderDelay(r4)
            int r4 = r8.encoderPadding
            com.google.android.exoplayer2.Format$Builder r0 = r0.setEncoderPadding(r4)
            com.google.android.exoplayer2.Format r0 = r0.build()
            com.google.android.exoplayer2.audio.AudioSink r4 = r8.audioSink
            r4.configure(r0, r1, r2)
            r8.audioTrackNeedsConfigure = r1
        L81:
            com.google.android.exoplayer2.audio.AudioSink r0 = r8.audioSink
            com.google.android.exoplayer2.decoder.SimpleDecoderOutputBuffer r4 = r8.outputBuffer
            java.nio.ByteBuffer r5 = r4.data
            long r6 = r4.timeUs
            boolean r0 = r0.handleBuffer(r5, r6, r3)
            if (r0 == 0) goto L9e
            com.google.android.exoplayer2.decoder.DecoderCounters r0 = r8.decoderCounters
            int r1 = r0.renderedOutputBufferCount
            int r1 = r1 + r3
            r0.renderedOutputBufferCount = r1
            com.google.android.exoplayer2.decoder.SimpleDecoderOutputBuffer r0 = r8.outputBuffer
            r0.release()
            r8.outputBuffer = r2
            return r3
        L9e:
            return r1
    }

    private boolean feedInputBuffer() throws com.google.android.exoplayer2.decoder.DecoderException, com.google.android.exoplayer2.ExoPlaybackException {
            r9 = this;
            T extends com.google.android.exoplayer2.decoder.Decoder<com.google.android.exoplayer2.decoder.DecoderInputBuffer, ? extends com.google.android.exoplayer2.decoder.SimpleDecoderOutputBuffer, ? extends com.google.android.exoplayer2.decoder.DecoderException> r0 = r9.decoder
            r1 = 0
            if (r0 == 0) goto Lb4
            int r2 = r9.decoderReinitializationState
            r3 = 2
            if (r2 == r3) goto Lb4
            boolean r2 = r9.inputStreamEnded
            if (r2 == 0) goto L10
            goto Lb4
        L10:
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r2 = r9.inputBuffer
            if (r2 != 0) goto L1f
            java.lang.Object r0 = r0.dequeueInputBuffer()
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r0 = (com.google.android.exoplayer2.decoder.DecoderInputBuffer) r0
            r9.inputBuffer = r0
            if (r0 != 0) goto L1f
            return r1
        L1f:
            int r0 = r9.decoderReinitializationState
            r2 = 0
            r4 = 1
            if (r0 != r4) goto L37
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r0 = r9.inputBuffer
            r4 = 4
            r0.setFlags(r4)
            T extends com.google.android.exoplayer2.decoder.Decoder<com.google.android.exoplayer2.decoder.DecoderInputBuffer, ? extends com.google.android.exoplayer2.decoder.SimpleDecoderOutputBuffer, ? extends com.google.android.exoplayer2.decoder.DecoderException> r0 = r9.decoder
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r4 = r9.inputBuffer
            r0.queueInputBuffer(r4)
            r9.inputBuffer = r2
            r9.decoderReinitializationState = r3
            return r1
        L37:
            com.google.android.exoplayer2.FormatHolder r0 = r9.getFormatHolder()
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r3 = r9.inputBuffer
            int r3 = r9.readSource(r0, r3, r1)
            r5 = -5
            if (r3 == r5) goto Lb0
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
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r0 = r9.inputBuffer
            boolean r0 = r0.isEndOfStream()
            if (r0 == 0) goto L65
            r9.inputStreamEnded = r4
            T extends com.google.android.exoplayer2.decoder.Decoder<com.google.android.exoplayer2.decoder.DecoderInputBuffer, ? extends com.google.android.exoplayer2.decoder.SimpleDecoderOutputBuffer, ? extends com.google.android.exoplayer2.decoder.DecoderException> r0 = r9.decoder
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r3 = r9.inputBuffer
            r0.queueInputBuffer(r3)
            r9.inputBuffer = r2
            return r1
        L65:
            boolean r0 = r9.firstStreamSampleRead
            if (r0 != 0) goto L72
            r9.firstStreamSampleRead = r4
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r0 = r9.inputBuffer
            r3 = 134217728(0x8000000, float:3.85186E-34)
            r0.addFlag(r3)
        L72:
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r0 = r9.inputBuffer
            r0.flip()
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r0 = r9.inputBuffer
            com.google.android.exoplayer2.Format r3 = r9.inputFormat
            r0.format = r3
            boolean r3 = r9.allowFirstBufferPositionDiscontinuity
            if (r3 == 0) goto L9d
            boolean r3 = r0.isDecodeOnly()
            if (r3 != 0) goto L9d
            long r5 = r0.timeUs
            long r7 = r9.currentPositionUs
            long r5 = r5 - r7
            long r5 = java.lang.Math.abs(r5)
            r7 = 500000(0x7a120, double:2.47033E-318)
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 <= 0) goto L9b
            long r5 = r0.timeUs
            r9.currentPositionUs = r5
        L9b:
            r9.allowFirstBufferPositionDiscontinuity = r1
        L9d:
            T extends com.google.android.exoplayer2.decoder.Decoder<com.google.android.exoplayer2.decoder.DecoderInputBuffer, ? extends com.google.android.exoplayer2.decoder.SimpleDecoderOutputBuffer, ? extends com.google.android.exoplayer2.decoder.DecoderException> r0 = r9.decoder
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r1 = r9.inputBuffer
            r0.queueInputBuffer(r1)
            r9.decoderReceivedBuffers = r4
            com.google.android.exoplayer2.decoder.DecoderCounters r0 = r9.decoderCounters
            int r1 = r0.queuedInputBufferCount
            int r1 = r1 + r4
            r0.queuedInputBufferCount = r1
            r9.inputBuffer = r2
            return r4
        Lb0:
            r9.onInputFormatChanged(r0)
            return r4
        Lb4:
            return r1
    }

    private void flushDecoder() throws com.google.android.exoplayer2.ExoPlaybackException {
            r2 = this;
            int r0 = r2.decoderReinitializationState
            if (r0 == 0) goto Lb
            r2.releaseDecoder()
            r2.maybeInitDecoder()
            goto L1f
        Lb:
            r0 = 0
            r2.inputBuffer = r0
            com.google.android.exoplayer2.decoder.SimpleDecoderOutputBuffer r1 = r2.outputBuffer
            if (r1 == 0) goto L17
            r1.release()
            r2.outputBuffer = r0
        L17:
            T extends com.google.android.exoplayer2.decoder.Decoder<com.google.android.exoplayer2.decoder.DecoderInputBuffer, ? extends com.google.android.exoplayer2.decoder.SimpleDecoderOutputBuffer, ? extends com.google.android.exoplayer2.decoder.DecoderException> r0 = r2.decoder
            r0.flush()
            r0 = 0
            r2.decoderReceivedBuffers = r0
        L1f:
            return
    }

    private void maybeInitDecoder() throws com.google.android.exoplayer2.ExoPlaybackException {
            r11 = this;
            T extends com.google.android.exoplayer2.decoder.Decoder<com.google.android.exoplayer2.decoder.DecoderInputBuffer, ? extends com.google.android.exoplayer2.decoder.SimpleDecoderOutputBuffer, ? extends com.google.android.exoplayer2.decoder.DecoderException> r0 = r11.decoder
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
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.OutOfMemoryError -> L4f com.google.android.exoplayer2.decoder.DecoderException -> L57
            java.lang.String r4 = "createAudioDecoder"
            com.google.android.exoplayer2.util.TraceUtil.beginSection(r4)     // Catch: java.lang.OutOfMemoryError -> L4f com.google.android.exoplayer2.decoder.DecoderException -> L57
            com.google.android.exoplayer2.Format r4 = r11.inputFormat     // Catch: java.lang.OutOfMemoryError -> L4f com.google.android.exoplayer2.decoder.DecoderException -> L57
            com.google.android.exoplayer2.decoder.Decoder r4 = r11.createDecoder(r4)     // Catch: java.lang.OutOfMemoryError -> L4f com.google.android.exoplayer2.decoder.DecoderException -> L57
            r11.decoder = r4     // Catch: java.lang.OutOfMemoryError -> L4f com.google.android.exoplayer2.decoder.DecoderException -> L57
            com.google.android.exoplayer2.util.TraceUtil.endSection()     // Catch: java.lang.OutOfMemoryError -> L4f com.google.android.exoplayer2.decoder.DecoderException -> L57
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.OutOfMemoryError -> L4f com.google.android.exoplayer2.decoder.DecoderException -> L57
            com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher r5 = r11.eventDispatcher     // Catch: java.lang.OutOfMemoryError -> L4f com.google.android.exoplayer2.decoder.DecoderException -> L57
            T extends com.google.android.exoplayer2.decoder.Decoder<com.google.android.exoplayer2.decoder.DecoderInputBuffer, ? extends com.google.android.exoplayer2.decoder.SimpleDecoderOutputBuffer, ? extends com.google.android.exoplayer2.decoder.DecoderException> r4 = r11.decoder     // Catch: java.lang.OutOfMemoryError -> L4f com.google.android.exoplayer2.decoder.DecoderException -> L57
            java.lang.String r6 = r4.getName()     // Catch: java.lang.OutOfMemoryError -> L4f com.google.android.exoplayer2.decoder.DecoderException -> L57
            long r9 = r7 - r2
            r5.decoderInitialized(r6, r7, r9)     // Catch: java.lang.OutOfMemoryError -> L4f com.google.android.exoplayer2.decoder.DecoderException -> L57
            com.google.android.exoplayer2.decoder.DecoderCounters r2 = r11.decoderCounters     // Catch: java.lang.OutOfMemoryError -> L4f com.google.android.exoplayer2.decoder.DecoderException -> L57
            int r3 = r2.decoderInitCount     // Catch: java.lang.OutOfMemoryError -> L4f com.google.android.exoplayer2.decoder.DecoderException -> L57
            int r3 = r3 + 1
            r2.decoderInitCount = r3     // Catch: java.lang.OutOfMemoryError -> L4f com.google.android.exoplayer2.decoder.DecoderException -> L57
            return
        L4f:
            r2 = move-exception
            com.google.android.exoplayer2.Format r3 = r11.inputFormat
            com.google.android.exoplayer2.ExoPlaybackException r0 = r11.createRendererException(r2, r3, r0, r1)
            throw r0
        L57:
            r2 = move-exception
            java.lang.String r3 = "DecoderAudioRenderer"
            java.lang.String r4 = "Audio codec error"
            com.google.android.exoplayer2.util.Log.e(r3, r4, r2)
            com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher r3 = r11.eventDispatcher
            r3.audioCodecError(r2)
            com.google.android.exoplayer2.Format r3 = r11.inputFormat
            com.google.android.exoplayer2.ExoPlaybackException r0 = r11.createRendererException(r2, r3, r0, r1)
            throw r0
    }

    private void onInputFormatChanged(com.google.android.exoplayer2.FormatHolder r8) throws com.google.android.exoplayer2.ExoPlaybackException {
            r7 = this;
            com.google.android.exoplayer2.Format r0 = r8.format
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            r4 = r0
            com.google.android.exoplayer2.Format r4 = (com.google.android.exoplayer2.Format) r4
            com.google.android.exoplayer2.drm.DrmSession r8 = r8.drmSession
            r7.setSourceDrmSession(r8)
            com.google.android.exoplayer2.Format r3 = r7.inputFormat
            r7.inputFormat = r4
            int r8 = r4.encoderDelay
            r7.encoderDelay = r8
            int r8 = r4.encoderPadding
            r7.encoderPadding = r8
            T extends com.google.android.exoplayer2.decoder.Decoder<com.google.android.exoplayer2.decoder.DecoderInputBuffer, ? extends com.google.android.exoplayer2.decoder.SimpleDecoderOutputBuffer, ? extends com.google.android.exoplayer2.decoder.DecoderException> r8 = r7.decoder
            if (r8 != 0) goto L2a
            r7.maybeInitDecoder()
            com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher r8 = r7.eventDispatcher
            com.google.android.exoplayer2.Format r0 = r7.inputFormat
            r1 = 0
            r8.inputFormatChanged(r0, r1)
            return
        L2a:
            com.google.android.exoplayer2.drm.DrmSession r0 = r7.sourceDrmSession
            com.google.android.exoplayer2.drm.DrmSession r1 = r7.decoderDrmSession
            if (r0 == r1) goto L3e
            com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r0 = new com.google.android.exoplayer2.decoder.DecoderReuseEvaluation
            java.lang.String r2 = r8.getName()
            r5 = 0
            r6 = 128(0x80, float:1.8E-43)
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L4a
        L3e:
            java.lang.String r2 = r8.getName()
            com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r0 = new com.google.android.exoplayer2.decoder.DecoderReuseEvaluation
            r5 = 0
            r6 = 1
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
        L4a:
            int r8 = r0.result
            if (r8 != 0) goto L5e
            boolean r8 = r7.decoderReceivedBuffers
            r1 = 1
            if (r8 == 0) goto L56
            r7.decoderReinitializationState = r1
            goto L5e
        L56:
            r7.releaseDecoder()
            r7.maybeInitDecoder()
            r7.audioTrackNeedsConfigure = r1
        L5e:
            com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher r8 = r7.eventDispatcher
            com.google.android.exoplayer2.Format r1 = r7.inputFormat
            r8.inputFormatChanged(r1, r0)
            return
    }

    private void processEndOfStream() throws com.google.android.exoplayer2.audio.AudioSink.WriteException {
            r1 = this;
            r0 = 1
            r1.outputStreamEnded = r0
            com.google.android.exoplayer2.audio.AudioSink r0 = r1.audioSink
            r0.playToEndOfStream()
            return
    }

    private void processFirstSampleOfStream() {
            r4 = this;
            com.google.android.exoplayer2.audio.AudioSink r0 = r4.audioSink
            r0.handleDiscontinuity()
            int r0 = r4.pendingOutputStreamOffsetCount
            if (r0 == 0) goto L1c
            long[] r0 = r4.pendingOutputStreamOffsetsUs
            r1 = 0
            r2 = r0[r1]
            r4.setOutputStreamOffsetUs(r2)
            int r0 = r4.pendingOutputStreamOffsetCount
            r2 = 1
            int r0 = r0 - r2
            r4.pendingOutputStreamOffsetCount = r0
            long[] r3 = r4.pendingOutputStreamOffsetsUs
            java.lang.System.arraycopy(r3, r2, r3, r1, r0)
        L1c:
            return
    }

    private void releaseDecoder() {
            r4 = this;
            r0 = 0
            r4.inputBuffer = r0
            r4.outputBuffer = r0
            r1 = 0
            r4.decoderReinitializationState = r1
            r4.decoderReceivedBuffers = r1
            T extends com.google.android.exoplayer2.decoder.Decoder<com.google.android.exoplayer2.decoder.DecoderInputBuffer, ? extends com.google.android.exoplayer2.decoder.SimpleDecoderOutputBuffer, ? extends com.google.android.exoplayer2.decoder.DecoderException> r1 = r4.decoder
            if (r1 == 0) goto L26
            com.google.android.exoplayer2.decoder.DecoderCounters r2 = r4.decoderCounters
            int r3 = r2.decoderReleaseCount
            int r3 = r3 + 1
            r2.decoderReleaseCount = r3
            r1.release()
            com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher r1 = r4.eventDispatcher
            T extends com.google.android.exoplayer2.decoder.Decoder<com.google.android.exoplayer2.decoder.DecoderInputBuffer, ? extends com.google.android.exoplayer2.decoder.SimpleDecoderOutputBuffer, ? extends com.google.android.exoplayer2.decoder.DecoderException> r2 = r4.decoder
            java.lang.String r2 = r2.getName()
            r1.decoderReleased(r2)
            r4.decoder = r0
        L26:
            r4.setDecoderDrmSession(r0)
            return
    }

    private void setDecoderDrmSession(@androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmSession r2) {
            r1 = this;
            com.google.android.exoplayer2.drm.DrmSession r0 = r1.decoderDrmSession
            com.google.android.exoplayer2.drm.DrmSession.CC.replaceSession(r0, r2)
            r1.decoderDrmSession = r2
            return
    }

    private void setOutputStreamOffsetUs(long r4) {
            r3 = this;
            r3.outputStreamOffsetUs = r4
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 == 0) goto L10
            com.google.android.exoplayer2.audio.AudioSink r0 = r3.audioSink
            r0.setOutputStreamOffsetUs(r4)
        L10:
            return
    }

    private void setSourceDrmSession(@androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmSession r2) {
            r1 = this;
            com.google.android.exoplayer2.drm.DrmSession r0 = r1.sourceDrmSession
            com.google.android.exoplayer2.drm.DrmSession.CC.replaceSession(r0, r2)
            r1.sourceDrmSession = r2
            return
    }

    private void updateCurrentPosition() {
            r5 = this;
            com.google.android.exoplayer2.audio.AudioSink r0 = r5.audioSink
            boolean r1 = r5.isEnded()
            long r0 = r0.getCurrentPositionUs(r1)
            r2 = -9223372036854775808
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L20
            boolean r2 = r5.allowPositionDiscontinuity
            if (r2 == 0) goto L15
            goto L1b
        L15:
            long r2 = r5.currentPositionUs
            long r0 = java.lang.Math.max(r2, r0)
        L1b:
            r5.currentPositionUs = r0
            r0 = 0
            r5.allowPositionDiscontinuity = r0
        L20:
            return
    }

    @com.google.errorprone.annotations.ForOverride
    public abstract com.google.android.exoplayer2.decoder.Decoder createDecoder(com.google.android.exoplayer2.Format r1) throws com.google.android.exoplayer2.decoder.DecoderException;

    public void experimentalSetEnableKeepAudioTrackOnSeek(boolean r1) {
            r0 = this;
            r0.experimentalKeepAudioTrackOnSeek = r1
            return
    }

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.Renderer
    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.util.MediaClock getMediaClock() {
            r0 = this;
            return r0
    }

    @com.google.errorprone.annotations.ForOverride
    public abstract com.google.android.exoplayer2.Format getOutputFormat(T r1);

    @Override // com.google.android.exoplayer2.util.MediaClock
    public com.google.android.exoplayer2.PlaybackParameters getPlaybackParameters() {
            r1 = this;
            com.google.android.exoplayer2.audio.AudioSink r0 = r1.audioSink
            com.google.android.exoplayer2.PlaybackParameters r0 = r0.getPlaybackParameters()
            return r0
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public long getPositionUs() {
            r2 = this;
            int r0 = r2.getState()
            r1 = 2
            if (r0 != r1) goto La
            r2.updateCurrentPosition()
        La:
            long r0 = r2.currentPositionUs
            return r0
    }

    public final int getSinkFormatSupport(com.google.android.exoplayer2.Format r2) {
            r1 = this;
            com.google.android.exoplayer2.audio.AudioSink r0 = r1.audioSink
            int r2 = r0.getFormatSupport(r2)
            return r2
    }

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.PlayerMessage.Target
    public void handleMessage(int r2, @androidx.annotation.Nullable java.lang.Object r3) throws com.google.android.exoplayer2.ExoPlaybackException {
            r1 = this;
            r0 = 2
            if (r2 == r0) goto L4d
            r0 = 3
            if (r2 == r0) goto L45
            r0 = 6
            if (r2 == r0) goto L3d
            r0 = 12
            if (r2 == r0) goto L31
            r0 = 9
            if (r2 == r0) goto L25
            r0 = 10
            if (r2 == r0) goto L19
            super.handleMessage(r2, r3)
            goto L58
        L19:
            com.google.android.exoplayer2.audio.AudioSink r2 = r1.audioSink
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setAudioSessionId(r3)
            goto L58
        L25:
            com.google.android.exoplayer2.audio.AudioSink r2 = r1.audioSink
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r2.setSkipSilenceEnabled(r3)
            goto L58
        L31:
            int r2 = com.google.android.exoplayer2.util.Util.SDK_INT
            r0 = 23
            if (r2 < r0) goto L58
            com.google.android.exoplayer2.audio.AudioSink r2 = r1.audioSink
            com.google.android.exoplayer2.audio.DecoderAudioRenderer.Api23.setAudioSinkPreferredDevice(r2, r3)
            goto L58
        L3d:
            com.google.android.exoplayer2.audio.AuxEffectInfo r3 = (com.google.android.exoplayer2.audio.AuxEffectInfo) r3
            com.google.android.exoplayer2.audio.AudioSink r2 = r1.audioSink
            r2.setAuxEffectInfo(r3)
            goto L58
        L45:
            com.google.android.exoplayer2.audio.AudioAttributes r3 = (com.google.android.exoplayer2.audio.AudioAttributes) r3
            com.google.android.exoplayer2.audio.AudioSink r2 = r1.audioSink
            r2.setAudioAttributes(r3)
            goto L58
        L4d:
            com.google.android.exoplayer2.audio.AudioSink r2 = r1.audioSink
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r2.setVolume(r3)
        L58:
            return
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isEnded() {
            r1 = this;
            boolean r0 = r1.outputStreamEnded
            if (r0 == 0) goto Le
            com.google.android.exoplayer2.audio.AudioSink r0 = r1.audioSink
            boolean r0 = r0.isEnded()
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isReady() {
            r1 = this;
            com.google.android.exoplayer2.audio.AudioSink r0 = r1.audioSink
            boolean r0 = r0.hasPendingData()
            if (r0 != 0) goto L19
            com.google.android.exoplayer2.Format r0 = r1.inputFormat
            if (r0 == 0) goto L17
            boolean r0 = r1.isSourceReady()
            if (r0 != 0) goto L19
            com.google.android.exoplayer2.decoder.SimpleDecoderOutputBuffer r0 = r1.outputBuffer
            if (r0 == 0) goto L17
            goto L19
        L17:
            r0 = 0
            goto L1a
        L19:
            r0 = 1
        L1a:
            return r0
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public final void onDisabled() {
            r3 = this;
            r0 = 0
            r3.inputFormat = r0
            r1 = 1
            r3.audioTrackNeedsConfigure = r1
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.setOutputStreamOffsetUs(r1)
            r3.setSourceDrmSession(r0)     // Catch: java.lang.Throwable -> L21
            r3.releaseDecoder()     // Catch: java.lang.Throwable -> L21
            com.google.android.exoplayer2.audio.AudioSink r0 = r3.audioSink     // Catch: java.lang.Throwable -> L21
            r0.reset()     // Catch: java.lang.Throwable -> L21
            com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher r0 = r3.eventDispatcher
            com.google.android.exoplayer2.decoder.DecoderCounters r1 = r3.decoderCounters
            r0.disabled(r1)
            return
        L21:
            r0 = move-exception
            com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher r1 = r3.eventDispatcher
            com.google.android.exoplayer2.decoder.DecoderCounters r2 = r3.decoderCounters
            r1.disabled(r2)
            throw r0
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public final void onEnabled(boolean r1, boolean r2) throws com.google.android.exoplayer2.ExoPlaybackException {
            r0 = this;
            com.google.android.exoplayer2.decoder.DecoderCounters r1 = new com.google.android.exoplayer2.decoder.DecoderCounters
            r1.<init>()
            r0.decoderCounters = r1
            com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher r2 = r0.eventDispatcher
            r2.enabled(r1)
            com.google.android.exoplayer2.RendererConfiguration r1 = r0.getConfiguration()
            boolean r1 = r1.tunneling
            if (r1 == 0) goto L1a
            com.google.android.exoplayer2.audio.AudioSink r1 = r0.audioSink
            r1.enableTunnelingV21()
            goto L1f
        L1a:
            com.google.android.exoplayer2.audio.AudioSink r1 = r0.audioSink
            r1.disableTunneling()
        L1f:
            com.google.android.exoplayer2.audio.AudioSink r1 = r0.audioSink
            com.google.android.exoplayer2.analytics.PlayerId r2 = r0.getPlayerId()
            r1.setPlayerId(r2)
            return
    }

    @androidx.annotation.CallSuper
    @com.google.errorprone.annotations.ForOverride
    public final void onPositionDiscontinuity() {
            r1 = this;
            r0 = 1
            r1.allowPositionDiscontinuity = r0
            return
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public final void onPositionReset(long r1, boolean r3) throws com.google.android.exoplayer2.ExoPlaybackException {
            r0 = this;
            boolean r3 = r0.experimentalKeepAudioTrackOnSeek
            if (r3 == 0) goto La
            com.google.android.exoplayer2.audio.AudioSink r3 = r0.audioSink
            r3.experimentalFlushWithoutAudioTrackRelease()
            goto Lf
        La:
            com.google.android.exoplayer2.audio.AudioSink r3 = r0.audioSink
            r3.flush()
        Lf:
            r0.currentPositionUs = r1
            r1 = 1
            r0.allowFirstBufferPositionDiscontinuity = r1
            r0.allowPositionDiscontinuity = r1
            r1 = 0
            r0.inputStreamEnded = r1
            r0.outputStreamEnded = r1
            T extends com.google.android.exoplayer2.decoder.Decoder<com.google.android.exoplayer2.decoder.DecoderInputBuffer, ? extends com.google.android.exoplayer2.decoder.SimpleDecoderOutputBuffer, ? extends com.google.android.exoplayer2.decoder.DecoderException> r1 = r0.decoder
            if (r1 == 0) goto L22
            r0.flushDecoder()
        L22:
            return
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public final void onStarted() {
            r1 = this;
            com.google.android.exoplayer2.audio.AudioSink r0 = r1.audioSink
            r0.play()
            return
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public final void onStopped() {
            r1 = this;
            r1.updateCurrentPosition()
            com.google.android.exoplayer2.audio.AudioSink r0 = r1.audioSink
            r0.pause()
            return
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public final void onStreamChanged(com.google.android.exoplayer2.Format[] r3, long r4, long r6) throws com.google.android.exoplayer2.ExoPlaybackException {
            r2 = this;
            r3 = 0
            r2.firstStreamSampleRead = r3
            long r3 = r2.outputStreamOffsetUs
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 != 0) goto L12
            r2.setOutputStreamOffsetUs(r6)
            goto L40
        L12:
            int r3 = r2.pendingOutputStreamOffsetCount
            long[] r4 = r2.pendingOutputStreamOffsetsUs
            int r4 = r4.length
            if (r3 != r4) goto L34
            java.lang.String r3 = "Too many stream changes, so dropping offset: "
            java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
            long[] r4 = r2.pendingOutputStreamOffsetsUs
            int r5 = r2.pendingOutputStreamOffsetCount
            int r5 = r5 + (-1)
            r0 = r4[r5]
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "DecoderAudioRenderer"
            com.google.android.exoplayer2.util.Log.w(r4, r3)
            goto L38
        L34:
            int r3 = r3 + 1
            r2.pendingOutputStreamOffsetCount = r3
        L38:
            long[] r3 = r2.pendingOutputStreamOffsetsUs
            int r4 = r2.pendingOutputStreamOffsetCount
            int r4 = r4 + (-1)
            r3[r4] = r6
        L40:
            return
    }

    @Override // com.google.android.exoplayer2.Renderer
    public void render(long r2, long r4) throws com.google.android.exoplayer2.ExoPlaybackException {
            r1 = this;
            boolean r2 = r1.outputStreamEnded
            r3 = 5002(0x138a, float:7.009E-42)
            if (r2 == 0) goto L16
            com.google.android.exoplayer2.audio.AudioSink r2 = r1.audioSink     // Catch: com.google.android.exoplayer2.audio.AudioSink.WriteException -> Lc
            r2.playToEndOfStream()     // Catch: com.google.android.exoplayer2.audio.AudioSink.WriteException -> Lc
            return
        Lc:
            r2 = move-exception
            com.google.android.exoplayer2.Format r4 = r2.format
            boolean r5 = r2.isRecoverable
            com.google.android.exoplayer2.ExoPlaybackException r2 = r1.createRendererException(r2, r4, r5, r3)
            throw r2
        L16:
            com.google.android.exoplayer2.Format r2 = r1.inputFormat
            r4 = 0
            if (r2 != 0) goto L4d
            com.google.android.exoplayer2.FormatHolder r2 = r1.getFormatHolder()
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r5 = r1.flagsOnlyBuffer
            r5.clear()
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r5 = r1.flagsOnlyBuffer
            r0 = 2
            int r5 = r1.readSource(r2, r5, r0)
            r0 = -5
            if (r5 != r0) goto L32
            r1.onInputFormatChanged(r2)
            goto L4d
        L32:
            r2 = -4
            if (r5 != r2) goto L4c
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r2 = r1.flagsOnlyBuffer
            boolean r2 = r2.isEndOfStream()
            com.google.android.exoplayer2.util.Assertions.checkState(r2)
            r2 = 1
            r1.inputStreamEnded = r2
            r1.processEndOfStream()     // Catch: com.google.android.exoplayer2.audio.AudioSink.WriteException -> L45
            return
        L45:
            r2 = move-exception
            r5 = 0
            com.google.android.exoplayer2.ExoPlaybackException r2 = r1.createRendererException(r2, r5, r4, r3)
            throw r2
        L4c:
            return
        L4d:
            r1.maybeInitDecoder()
            T extends com.google.android.exoplayer2.decoder.Decoder<com.google.android.exoplayer2.decoder.DecoderInputBuffer, ? extends com.google.android.exoplayer2.decoder.SimpleDecoderOutputBuffer, ? extends com.google.android.exoplayer2.decoder.DecoderException> r2 = r1.decoder
            if (r2 == 0) goto La4
            r2 = 5001(0x1389, float:7.008E-42)
            java.lang.String r5 = "drainAndFeed"
            com.google.android.exoplayer2.util.TraceUtil.beginSection(r5)     // Catch: com.google.android.exoplayer2.audio.AudioSink.WriteException -> L72 com.google.android.exoplayer2.audio.AudioSink.InitializationException -> L7c com.google.android.exoplayer2.audio.AudioSink.ConfigurationException -> L86 com.google.android.exoplayer2.decoder.DecoderException -> L8e
        L5b:
            boolean r5 = r1.drainOutputBuffer()     // Catch: com.google.android.exoplayer2.audio.AudioSink.WriteException -> L72 com.google.android.exoplayer2.audio.AudioSink.InitializationException -> L7c com.google.android.exoplayer2.audio.AudioSink.ConfigurationException -> L86 com.google.android.exoplayer2.decoder.DecoderException -> L8e
            if (r5 == 0) goto L62
            goto L5b
        L62:
            boolean r5 = r1.feedInputBuffer()     // Catch: com.google.android.exoplayer2.audio.AudioSink.WriteException -> L72 com.google.android.exoplayer2.audio.AudioSink.InitializationException -> L7c com.google.android.exoplayer2.audio.AudioSink.ConfigurationException -> L86 com.google.android.exoplayer2.decoder.DecoderException -> L8e
            if (r5 == 0) goto L69
            goto L62
        L69:
            com.google.android.exoplayer2.util.TraceUtil.endSection()     // Catch: com.google.android.exoplayer2.audio.AudioSink.WriteException -> L72 com.google.android.exoplayer2.audio.AudioSink.InitializationException -> L7c com.google.android.exoplayer2.audio.AudioSink.ConfigurationException -> L86 com.google.android.exoplayer2.decoder.DecoderException -> L8e
            com.google.android.exoplayer2.decoder.DecoderCounters r2 = r1.decoderCounters
            r2.ensureUpdated()
            goto La4
        L72:
            r2 = move-exception
            com.google.android.exoplayer2.Format r4 = r2.format
            boolean r5 = r2.isRecoverable
            com.google.android.exoplayer2.ExoPlaybackException r2 = r1.createRendererException(r2, r4, r5, r3)
            throw r2
        L7c:
            r3 = move-exception
            com.google.android.exoplayer2.Format r4 = r3.format
            boolean r5 = r3.isRecoverable
            com.google.android.exoplayer2.ExoPlaybackException r2 = r1.createRendererException(r3, r4, r5, r2)
            throw r2
        L86:
            r3 = move-exception
            com.google.android.exoplayer2.Format r5 = r3.format
            com.google.android.exoplayer2.ExoPlaybackException r2 = r1.createRendererException(r3, r5, r4, r2)
            throw r2
        L8e:
            r2 = move-exception
            java.lang.String r3 = "DecoderAudioRenderer"
            java.lang.String r5 = "Audio codec error"
            com.google.android.exoplayer2.util.Log.e(r3, r5, r2)
            com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher r3 = r1.eventDispatcher
            r3.audioCodecError(r2)
            com.google.android.exoplayer2.Format r3 = r1.inputFormat
            r5 = 4003(0xfa3, float:5.61E-42)
            com.google.android.exoplayer2.ExoPlaybackException r2 = r1.createRendererException(r2, r3, r4, r5)
            throw r2
        La4:
            return
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public void setPlaybackParameters(com.google.android.exoplayer2.PlaybackParameters r2) {
            r1 = this;
            com.google.android.exoplayer2.audio.AudioSink r0 = r1.audioSink
            r0.setPlaybackParameters(r2)
            return
    }

    public final boolean sinkSupportsFormat(com.google.android.exoplayer2.Format r2) {
            r1 = this;
            com.google.android.exoplayer2.audio.AudioSink r0 = r1.audioSink
            boolean r2 = r0.supportsFormat(r2)
            return r2
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public final int supportsFormat(com.google.android.exoplayer2.Format r4) {
            r3 = this;
            java.lang.String r0 = r4.sampleMimeType
            boolean r0 = com.google.android.exoplayer2.util.MimeTypes.isAudio(r0)
            r1 = 0
            if (r0 != 0) goto Le
            int r4 = com.google.android.exoplayer2.RendererCapabilities.CC.create(r1)
            return r4
        Le:
            int r4 = r3.supportsFormatInternal(r4)
            r0 = 2
            if (r4 > r0) goto L1a
            int r4 = com.google.android.exoplayer2.RendererCapabilities.CC.create(r4)
            return r4
        L1a:
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r2 = 21
            if (r0 < r2) goto L22
            r1 = 32
        L22:
            r0 = 8
            int r4 = com.google.android.exoplayer2.RendererCapabilities.CC.create(r4, r0, r1)
            return r4
    }

    @com.google.errorprone.annotations.ForOverride
    public abstract int supportsFormatInternal(com.google.android.exoplayer2.Format r1);
}
