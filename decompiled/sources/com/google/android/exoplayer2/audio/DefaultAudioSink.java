package com.google.android.exoplayer2.audio;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultAudioSink implements com.google.android.exoplayer2.audio.AudioSink {
    private static final int AUDIO_TRACK_RETRY_DURATION_MS = 100;
    private static final int AUDIO_TRACK_SMALLER_BUFFER_RETRY_SIZE = 1000000;
    public static final float DEFAULT_PLAYBACK_SPEED = 1.0f;
    private static final boolean DEFAULT_SKIP_SILENCE = false;
    private static final int ERROR_NATIVE_DEAD_OBJECT = -32;
    public static final float MAX_PITCH = 8.0f;
    public static final float MAX_PLAYBACK_SPEED = 8.0f;
    public static final float MIN_PITCH = 0.1f;
    public static final float MIN_PLAYBACK_SPEED = 0.1f;
    public static final int OFFLOAD_MODE_DISABLED = 0;
    public static final int OFFLOAD_MODE_ENABLED_GAPLESS_DISABLED = 3;
    public static final int OFFLOAD_MODE_ENABLED_GAPLESS_NOT_REQUIRED = 2;
    public static final int OFFLOAD_MODE_ENABLED_GAPLESS_REQUIRED = 1;
    public static final int OUTPUT_MODE_OFFLOAD = 1;
    public static final int OUTPUT_MODE_PASSTHROUGH = 2;
    public static final int OUTPUT_MODE_PCM = 0;
    private static final java.lang.String TAG = "DefaultAudioSink";
    public static boolean failOnSpuriousAudioTimestamp;

    @androidx.annotation.GuardedBy("releaseExecutorLock")
    private static int pendingReleaseCount;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("releaseExecutorLock")
    private static java.util.concurrent.ExecutorService releaseExecutor;
    private static final java.lang.Object releaseExecutorLock = null;
    private com.google.android.exoplayer2.audio.AudioProcessor[] activeAudioProcessors;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.audio.DefaultAudioSink.MediaPositionParameters afterDrainParameters;
    private com.google.android.exoplayer2.audio.AudioAttributes audioAttributes;
    private final com.google.android.exoplayer2.audio.AudioCapabilities audioCapabilities;

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener audioOffloadListener;
    private final com.google.android.exoplayer2.audio.AudioProcessorChain audioProcessorChain;
    private int audioSessionId;

    @androidx.annotation.Nullable
    private android.media.AudioTrack audioTrack;
    private final com.google.android.exoplayer2.audio.DefaultAudioSink.AudioTrackBufferSizeProvider audioTrackBufferSizeProvider;
    private com.google.android.exoplayer2.PlaybackParameters audioTrackPlaybackParameters;
    private final com.google.android.exoplayer2.audio.AudioTrackPositionTracker audioTrackPositionTracker;
    private com.google.android.exoplayer2.audio.AuxEffectInfo auxEffectInfo;

    @androidx.annotation.Nullable
    private java.nio.ByteBuffer avSyncHeader;
    private int bytesUntilNextAvSync;
    private final com.google.android.exoplayer2.audio.ChannelMappingAudioProcessor channelMappingAudioProcessor;
    private com.google.android.exoplayer2.audio.DefaultAudioSink.Configuration configuration;
    private int drainingAudioProcessorIndex;
    private final boolean enableAudioTrackPlaybackParams;
    private final boolean enableFloatOutput;
    private boolean externalAudioSessionIdProvided;
    private int framesPerEncodedSample;
    private boolean handledEndOfStream;
    private final com.google.android.exoplayer2.audio.DefaultAudioSink.PendingExceptionHolder<com.google.android.exoplayer2.audio.AudioSink.InitializationException> initializationExceptionPendingExceptionHolder;

    @androidx.annotation.Nullable
    private java.nio.ByteBuffer inputBuffer;
    private int inputBufferAccessUnitCount;
    private boolean isWaitingForOffloadEndOfStreamHandled;
    private long lastFeedElapsedRealtimeMs;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.audio.AudioSink.Listener listener;
    private com.google.android.exoplayer2.audio.DefaultAudioSink.MediaPositionParameters mediaPositionParameters;
    private final java.util.ArrayDeque<com.google.android.exoplayer2.audio.DefaultAudioSink.MediaPositionParameters> mediaPositionParametersCheckpoints;
    private boolean offloadDisabledUntilNextConfiguration;
    private final int offloadMode;
    private com.google.android.exoplayer2.audio.DefaultAudioSink.StreamEventCallbackV29 offloadStreamEventCallbackV29;

    @androidx.annotation.Nullable
    private java.nio.ByteBuffer outputBuffer;
    private java.nio.ByteBuffer[] outputBuffers;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.audio.DefaultAudioSink.Configuration pendingConfiguration;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.analytics.PlayerId playerId;
    private boolean playing;
    private byte[] preV21OutputBuffer;
    private int preV21OutputBufferOffset;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.audio.DefaultAudioSink.AudioDeviceInfoApi23 preferredDevice;
    private final com.google.android.exoplayer2.util.ConditionVariable releasingConditionVariable;
    private long startMediaTimeUs;
    private boolean startMediaTimeUsNeedsInit;
    private boolean startMediaTimeUsNeedsSync;
    private boolean stoppedAudioTrack;
    private long submittedEncodedFrames;
    private long submittedPcmBytes;
    private final com.google.android.exoplayer2.audio.AudioProcessor[] toFloatPcmAvailableAudioProcessors;
    private final com.google.android.exoplayer2.audio.AudioProcessor[] toIntPcmAvailableAudioProcessors;
    private final com.google.android.exoplayer2.audio.TrimmingAudioProcessor trimmingAudioProcessor;
    private boolean tunneling;
    private float volume;
    private final com.google.android.exoplayer2.audio.DefaultAudioSink.PendingExceptionHolder<com.google.android.exoplayer2.audio.AudioSink.WriteException> writeExceptionPendingExceptionHolder;
    private long writtenEncodedFrames;
    private long writtenPcmBytes;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
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
        public static void setPreferredDeviceOnAudioTrack(android.media.AudioTrack r0, @androidx.annotation.Nullable com.google.android.exoplayer2.audio.DefaultAudioSink.AudioDeviceInfoApi23 r1) {
                if (r1 != 0) goto L4
                r1 = 0
                goto L6
            L4:
                android.media.AudioDeviceInfo r1 = r1.audioDeviceInfo
            L6:
                r0.setPreferredDevice(r1)
                return
        }
    }

    @androidx.annotation.RequiresApi(31)
    public static final class Api31 {
        private Api31() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static void setLogSessionIdOnAudioTrack(android.media.AudioTrack r1, com.google.android.exoplayer2.analytics.PlayerId r2) {
                android.media.metrics.LogSessionId r2 = r2.getLogSessionId()
                android.media.metrics.LogSessionId r0 = android.media.metrics.LogSessionId.LOG_SESSION_ID_NONE
                boolean r0 = r2.equals(r0)
                if (r0 != 0) goto Lf
                r1.setLogSessionId(r2)
            Lf:
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(23)
    public static final class AudioDeviceInfoApi23 {
        public final android.media.AudioDeviceInfo audioDeviceInfo;

        public AudioDeviceInfoApi23(android.media.AudioDeviceInfo r1) {
                r0 = this;
                r0.<init>()
                r0.audioDeviceInfo = r1
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @java.lang.Deprecated
    public interface AudioProcessorChain extends com.google.android.exoplayer2.audio.AudioProcessorChain {
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface AudioTrackBufferSizeProvider {
        public static final com.google.android.exoplayer2.audio.DefaultAudioSink.AudioTrackBufferSizeProvider DEFAULT = null;

        static {
                com.google.android.exoplayer2.audio.DefaultAudioTrackBufferSizeProvider$Builder r0 = new com.google.android.exoplayer2.audio.DefaultAudioTrackBufferSizeProvider$Builder
                r0.<init>()
                com.google.android.exoplayer2.audio.DefaultAudioTrackBufferSizeProvider r0 = r0.build()
                com.google.android.exoplayer2.audio.DefaultAudioSink.AudioTrackBufferSizeProvider.DEFAULT = r0
                return
        }

        int getBufferSizeInBytes(int r1, int r2, int r3, int r4, int r5, int r6, double r7);
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class Builder {
        private com.google.android.exoplayer2.audio.AudioCapabilities audioCapabilities;

        @androidx.annotation.Nullable
        public com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener audioOffloadListener;

        @androidx.annotation.Nullable
        private com.google.android.exoplayer2.audio.AudioProcessorChain audioProcessorChain;
        public com.google.android.exoplayer2.audio.DefaultAudioSink.AudioTrackBufferSizeProvider audioTrackBufferSizeProvider;
        private boolean enableAudioTrackPlaybackParams;
        private boolean enableFloatOutput;
        private int offloadMode;

        public Builder() {
                r1 = this;
                r1.<init>()
                com.google.android.exoplayer2.audio.AudioCapabilities r0 = com.google.android.exoplayer2.audio.AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES
                r1.audioCapabilities = r0
                r0 = 0
                r1.offloadMode = r0
                com.google.android.exoplayer2.audio.DefaultAudioSink$AudioTrackBufferSizeProvider r0 = com.google.android.exoplayer2.audio.DefaultAudioSink.AudioTrackBufferSizeProvider.DEFAULT
                r1.audioTrackBufferSizeProvider = r0
                return
        }

        public static /* synthetic */ com.google.android.exoplayer2.audio.AudioCapabilities access$100(com.google.android.exoplayer2.audio.DefaultAudioSink.Builder r0) {
                com.google.android.exoplayer2.audio.AudioCapabilities r0 = r0.audioCapabilities
                return r0
        }

        public static /* synthetic */ com.google.android.exoplayer2.audio.AudioProcessorChain access$200(com.google.android.exoplayer2.audio.DefaultAudioSink.Builder r0) {
                com.google.android.exoplayer2.audio.AudioProcessorChain r0 = r0.audioProcessorChain
                return r0
        }

        public static /* synthetic */ boolean access$300(com.google.android.exoplayer2.audio.DefaultAudioSink.Builder r0) {
                boolean r0 = r0.enableFloatOutput
                return r0
        }

        public static /* synthetic */ boolean access$400(com.google.android.exoplayer2.audio.DefaultAudioSink.Builder r0) {
                boolean r0 = r0.enableAudioTrackPlaybackParams
                return r0
        }

        public static /* synthetic */ int access$500(com.google.android.exoplayer2.audio.DefaultAudioSink.Builder r0) {
                int r0 = r0.offloadMode
                return r0
        }

        public com.google.android.exoplayer2.audio.DefaultAudioSink build() {
                r2 = this;
                com.google.android.exoplayer2.audio.AudioProcessorChain r0 = r2.audioProcessorChain
                if (r0 != 0) goto Le
                com.google.android.exoplayer2.audio.DefaultAudioSink$DefaultAudioProcessorChain r0 = new com.google.android.exoplayer2.audio.DefaultAudioSink$DefaultAudioProcessorChain
                r1 = 0
                com.google.android.exoplayer2.audio.AudioProcessor[] r1 = new com.google.android.exoplayer2.audio.AudioProcessor[r1]
                r0.<init>(r1)
                r2.audioProcessorChain = r0
            Le:
                com.google.android.exoplayer2.audio.DefaultAudioSink r0 = new com.google.android.exoplayer2.audio.DefaultAudioSink
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.audio.DefaultAudioSink.Builder setAudioCapabilities(com.google.android.exoplayer2.audio.AudioCapabilities r1) {
                r0 = this;
                com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
                r0.audioCapabilities = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.audio.DefaultAudioSink.Builder setAudioProcessorChain(com.google.android.exoplayer2.audio.AudioProcessorChain r1) {
                r0 = this;
                com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
                r0.audioProcessorChain = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.audio.DefaultAudioSink.Builder setAudioProcessors(com.google.android.exoplayer2.audio.AudioProcessor[] r2) {
                r1 = this;
                com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
                com.google.android.exoplayer2.audio.DefaultAudioSink$DefaultAudioProcessorChain r0 = new com.google.android.exoplayer2.audio.DefaultAudioSink$DefaultAudioProcessorChain
                r0.<init>(r2)
                com.google.android.exoplayer2.audio.DefaultAudioSink$Builder r2 = r1.setAudioProcessorChain(r0)
                return r2
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.audio.DefaultAudioSink.Builder setAudioTrackBufferSizeProvider(com.google.android.exoplayer2.audio.DefaultAudioSink.AudioTrackBufferSizeProvider r1) {
                r0 = this;
                r0.audioTrackBufferSizeProvider = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.audio.DefaultAudioSink.Builder setEnableAudioTrackPlaybackParams(boolean r1) {
                r0 = this;
                r0.enableAudioTrackPlaybackParams = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.audio.DefaultAudioSink.Builder setEnableFloatOutput(boolean r1) {
                r0 = this;
                r0.enableFloatOutput = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.audio.DefaultAudioSink.Builder setExperimentalAudioOffloadListener(@androidx.annotation.Nullable com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener r1) {
                r0 = this;
                r0.audioOffloadListener = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.audio.DefaultAudioSink.Builder setOffloadMode(int r1) {
                r0 = this;
                r0.offloadMode = r1
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class Configuration {
        public final com.google.android.exoplayer2.audio.AudioProcessor[] availableAudioProcessors;
        public final int bufferSize;
        public final com.google.android.exoplayer2.Format inputFormat;
        public final int inputPcmFrameSize;
        public final int outputChannelConfig;
        public final int outputEncoding;
        public final int outputMode;
        public final int outputPcmFrameSize;
        public final int outputSampleRate;

        public Configuration(com.google.android.exoplayer2.Format r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, com.google.android.exoplayer2.audio.AudioProcessor[] r9) {
                r0 = this;
                r0.<init>()
                r0.inputFormat = r1
                r0.inputPcmFrameSize = r2
                r0.outputMode = r3
                r0.outputPcmFrameSize = r4
                r0.outputSampleRate = r5
                r0.outputChannelConfig = r6
                r0.outputEncoding = r7
                r0.bufferSize = r8
                r0.availableAudioProcessors = r9
                return
        }

        private android.media.AudioTrack createAudioTrack(boolean r3, com.google.android.exoplayer2.audio.AudioAttributes r4, int r5) {
                r2 = this;
                int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
                r1 = 29
                if (r0 < r1) goto Lb
                android.media.AudioTrack r3 = r2.createAudioTrackV29(r3, r4, r5)
                return r3
            Lb:
                r1 = 21
                if (r0 < r1) goto L14
                android.media.AudioTrack r3 = r2.createAudioTrackV21(r3, r4, r5)
                return r3
            L14:
                android.media.AudioTrack r3 = r2.createAudioTrackV9(r4, r5)
                return r3
        }

        @androidx.annotation.RequiresApi(21)
        private android.media.AudioTrack createAudioTrackV21(boolean r8, com.google.android.exoplayer2.audio.AudioAttributes r9, int r10) {
                r7 = this;
                android.media.AudioTrack r6 = new android.media.AudioTrack
                android.media.AudioAttributes r1 = getAudioTrackAttributesV21(r9, r8)
                int r8 = r7.outputSampleRate
                int r9 = r7.outputChannelConfig
                int r0 = r7.outputEncoding
                android.media.AudioFormat r2 = com.google.android.exoplayer2.audio.DefaultAudioSink.access$1500(r8, r9, r0)
                int r3 = r7.bufferSize
                r4 = 1
                r0 = r6
                r5 = r10
                r0.<init>(r1, r2, r3, r4, r5)
                return r6
        }

        @androidx.annotation.RequiresApi(29)
        private android.media.AudioTrack createAudioTrackV29(boolean r4, com.google.android.exoplayer2.audio.AudioAttributes r5, int r6) {
                r3 = this;
                int r0 = r3.outputSampleRate
                int r1 = r3.outputChannelConfig
                int r2 = r3.outputEncoding
                android.media.AudioFormat r0 = com.google.android.exoplayer2.audio.DefaultAudioSink.access$1500(r0, r1, r2)
                android.media.AudioAttributes r4 = getAudioTrackAttributesV21(r5, r4)
                android.media.AudioTrack$Builder r5 = new android.media.AudioTrack$Builder
                r5.<init>()
                android.media.AudioTrack$Builder r4 = r5.setAudioAttributes(r4)
                android.media.AudioTrack$Builder r4 = r4.setAudioFormat(r0)
                r5 = 1
                android.media.AudioTrack$Builder r4 = r4.setTransferMode(r5)
                int r0 = r3.bufferSize
                android.media.AudioTrack$Builder r4 = r4.setBufferSizeInBytes(r0)
                android.media.AudioTrack$Builder r4 = r4.setSessionId(r6)
                int r6 = r3.outputMode
                if (r6 != r5) goto L2f
                goto L30
            L2f:
                r5 = 0
            L30:
                android.media.AudioTrack$Builder r4 = r4.setOffloadedPlayback(r5)
                android.media.AudioTrack r4 = r4.build()
                return r4
        }

        private android.media.AudioTrack createAudioTrackV9(com.google.android.exoplayer2.audio.AudioAttributes r9, int r10) {
                r8 = this;
                int r9 = r9.usage
                int r1 = com.google.android.exoplayer2.util.Util.getStreamTypeForAudioUsage(r9)
                if (r10 != 0) goto L18
                android.media.AudioTrack r9 = new android.media.AudioTrack
                int r2 = r8.outputSampleRate
                int r3 = r8.outputChannelConfig
                int r4 = r8.outputEncoding
                int r5 = r8.bufferSize
                r6 = 1
                r0 = r9
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r9
            L18:
                android.media.AudioTrack r9 = new android.media.AudioTrack
                int r2 = r8.outputSampleRate
                int r3 = r8.outputChannelConfig
                int r4 = r8.outputEncoding
                int r5 = r8.bufferSize
                r6 = 1
                r0 = r9
                r7 = r10
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return r9
        }

        @androidx.annotation.RequiresApi(21)
        private static android.media.AudioAttributes getAudioTrackAttributesV21(com.google.android.exoplayer2.audio.AudioAttributes r0, boolean r1) {
                if (r1 == 0) goto L7
                android.media.AudioAttributes r0 = getAudioTrackTunnelingAttributesV21()
                return r0
            L7:
                com.google.android.exoplayer2.audio.AudioAttributes$AudioAttributesV21 r0 = r0.getAudioAttributesV21()
                android.media.AudioAttributes r0 = r0.audioAttributes
                return r0
        }

        @androidx.annotation.RequiresApi(21)
        private static android.media.AudioAttributes getAudioTrackTunnelingAttributesV21() {
                android.media.AudioAttributes$Builder r0 = new android.media.AudioAttributes$Builder
                r0.<init>()
                r1 = 3
                android.media.AudioAttributes$Builder r0 = r0.setContentType(r1)
                r1 = 16
                android.media.AudioAttributes$Builder r0 = r0.setFlags(r1)
                r1 = 1
                android.media.AudioAttributes$Builder r0 = r0.setUsage(r1)
                android.media.AudioAttributes r0 = r0.build()
                return r0
        }

        public android.media.AudioTrack buildAudioTrack(boolean r9, com.google.android.exoplayer2.audio.AudioAttributes r10, int r11) throws com.google.android.exoplayer2.audio.AudioSink.InitializationException {
                r8 = this;
                android.media.AudioTrack r9 = r8.createAudioTrack(r9, r10, r11)     // Catch: java.lang.IllegalArgumentException -> L23 java.lang.UnsupportedOperationException -> L25
                int r1 = r9.getState()
                r10 = 1
                if (r1 != r10) goto Lc
                return r9
            Lc:
                r9.release()     // Catch: java.lang.Exception -> Lf
            Lf:
                com.google.android.exoplayer2.audio.AudioSink$InitializationException r9 = new com.google.android.exoplayer2.audio.AudioSink$InitializationException
                int r2 = r8.outputSampleRate
                int r3 = r8.outputChannelConfig
                int r4 = r8.bufferSize
                com.google.android.exoplayer2.Format r5 = r8.inputFormat
                boolean r6 = r8.outputModeIsOffload()
                r7 = 0
                r0 = r9
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                throw r9
            L23:
                r9 = move-exception
                goto L26
            L25:
                r9 = move-exception
            L26:
                r7 = r9
                com.google.android.exoplayer2.audio.AudioSink$InitializationException r9 = new com.google.android.exoplayer2.audio.AudioSink$InitializationException
                r1 = 0
                int r2 = r8.outputSampleRate
                int r3 = r8.outputChannelConfig
                int r4 = r8.bufferSize
                com.google.android.exoplayer2.Format r5 = r8.inputFormat
                boolean r6 = r8.outputModeIsOffload()
                r0 = r9
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                throw r9
        }

        public boolean canReuseAudioTrack(com.google.android.exoplayer2.audio.DefaultAudioSink.Configuration r3) {
                r2 = this;
                int r0 = r3.outputMode
                int r1 = r2.outputMode
                if (r0 != r1) goto L20
                int r0 = r3.outputEncoding
                int r1 = r2.outputEncoding
                if (r0 != r1) goto L20
                int r0 = r3.outputSampleRate
                int r1 = r2.outputSampleRate
                if (r0 != r1) goto L20
                int r0 = r3.outputChannelConfig
                int r1 = r2.outputChannelConfig
                if (r0 != r1) goto L20
                int r3 = r3.outputPcmFrameSize
                int r0 = r2.outputPcmFrameSize
                if (r3 != r0) goto L20
                r3 = 1
                goto L21
            L20:
                r3 = 0
            L21:
                return r3
        }

        public com.google.android.exoplayer2.audio.DefaultAudioSink.Configuration copyWithBufferSize(int r12) {
                r11 = this;
                com.google.android.exoplayer2.audio.DefaultAudioSink$Configuration r10 = new com.google.android.exoplayer2.audio.DefaultAudioSink$Configuration
                com.google.android.exoplayer2.Format r1 = r11.inputFormat
                int r2 = r11.inputPcmFrameSize
                int r3 = r11.outputMode
                int r4 = r11.outputPcmFrameSize
                int r5 = r11.outputSampleRate
                int r6 = r11.outputChannelConfig
                int r7 = r11.outputEncoding
                com.google.android.exoplayer2.audio.AudioProcessor[] r9 = r11.availableAudioProcessors
                r0 = r10
                r8 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return r10
        }

        public long framesToDurationUs(long r3) {
                r2 = this;
                r0 = 1000000(0xf4240, double:4.940656E-318)
                long r3 = r3 * r0
                int r0 = r2.outputSampleRate
                long r0 = (long) r0
                long r3 = r3 / r0
                return r3
        }

        public long inputFramesToDurationUs(long r3) {
                r2 = this;
                r0 = 1000000(0xf4240, double:4.940656E-318)
                long r3 = r3 * r0
                com.google.android.exoplayer2.Format r0 = r2.inputFormat
                int r0 = r0.sampleRate
                long r0 = (long) r0
                long r3 = r3 / r0
                return r3
        }

        public boolean outputModeIsOffload() {
                r2 = this;
                int r0 = r2.outputMode
                r1 = 1
                if (r0 != r1) goto L6
                goto L7
            L6:
                r1 = 0
            L7:
                return r1
        }
    }

    public static class DefaultAudioProcessorChain implements com.google.android.exoplayer2.audio.DefaultAudioSink.AudioProcessorChain {
        private final com.google.android.exoplayer2.audio.AudioProcessor[] audioProcessors;
        private final com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor silenceSkippingAudioProcessor;
        private final com.google.android.exoplayer2.audio.SonicAudioProcessor sonicAudioProcessor;

        public DefaultAudioProcessorChain(com.google.android.exoplayer2.audio.AudioProcessor... r3) {
                r2 = this;
                com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor r0 = new com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor
                r0.<init>()
                com.google.android.exoplayer2.audio.SonicAudioProcessor r1 = new com.google.android.exoplayer2.audio.SonicAudioProcessor
                r1.<init>()
                r2.<init>(r3, r0, r1)
                return
        }

        public DefaultAudioProcessorChain(com.google.android.exoplayer2.audio.AudioProcessor[] r4, com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor r5, com.google.android.exoplayer2.audio.SonicAudioProcessor r6) {
                r3 = this;
                r3.<init>()
                int r0 = r4.length
                int r0 = r0 + 2
                com.google.android.exoplayer2.audio.AudioProcessor[] r0 = new com.google.android.exoplayer2.audio.AudioProcessor[r0]
                r3.audioProcessors = r0
                int r1 = r4.length
                r2 = 0
                java.lang.System.arraycopy(r4, r2, r0, r2, r1)
                r3.silenceSkippingAudioProcessor = r5
                r3.sonicAudioProcessor = r6
                int r1 = r4.length
                r0[r1] = r5
                int r4 = r4.length
                int r4 = r4 + 1
                r0[r4] = r6
                return
        }

        @Override // com.google.android.exoplayer2.audio.AudioProcessorChain
        public com.google.android.exoplayer2.PlaybackParameters applyPlaybackParameters(com.google.android.exoplayer2.PlaybackParameters r3) {
                r2 = this;
                com.google.android.exoplayer2.audio.SonicAudioProcessor r0 = r2.sonicAudioProcessor
                float r1 = r3.speed
                r0.setSpeed(r1)
                com.google.android.exoplayer2.audio.SonicAudioProcessor r0 = r2.sonicAudioProcessor
                float r1 = r3.pitch
                r0.setPitch(r1)
                return r3
        }

        @Override // com.google.android.exoplayer2.audio.AudioProcessorChain
        public boolean applySkipSilenceEnabled(boolean r2) {
                r1 = this;
                com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor r0 = r1.silenceSkippingAudioProcessor
                r0.setEnabled(r2)
                return r2
        }

        @Override // com.google.android.exoplayer2.audio.AudioProcessorChain
        public com.google.android.exoplayer2.audio.AudioProcessor[] getAudioProcessors() {
                r1 = this;
                com.google.android.exoplayer2.audio.AudioProcessor[] r0 = r1.audioProcessors
                return r0
        }

        @Override // com.google.android.exoplayer2.audio.AudioProcessorChain
        public long getMediaDuration(long r2) {
                r1 = this;
                com.google.android.exoplayer2.audio.SonicAudioProcessor r0 = r1.sonicAudioProcessor
                long r2 = r0.getMediaDuration(r2)
                return r2
        }

        @Override // com.google.android.exoplayer2.audio.AudioProcessorChain
        public long getSkippedOutputFrameCount() {
                r2 = this;
                com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor r0 = r2.silenceSkippingAudioProcessor
                long r0 = r0.getSkippedFrames()
                return r0
        }
    }

    public static final class InvalidAudioTrackTimestampException extends java.lang.RuntimeException {
        private InvalidAudioTrackTimestampException(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public /* synthetic */ InvalidAudioTrackTimestampException(java.lang.String r1, com.google.android.exoplayer2.audio.DefaultAudioSink.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    public static final class MediaPositionParameters {
        public final long audioTrackPositionUs;
        public final long mediaTimeUs;
        public final com.google.android.exoplayer2.PlaybackParameters playbackParameters;
        public final boolean skipSilence;

        private MediaPositionParameters(com.google.android.exoplayer2.PlaybackParameters r1, boolean r2, long r3, long r5) {
                r0 = this;
                r0.<init>()
                r0.playbackParameters = r1
                r0.skipSilence = r2
                r0.mediaTimeUs = r3
                r0.audioTrackPositionUs = r5
                return
        }

        public /* synthetic */ MediaPositionParameters(com.google.android.exoplayer2.PlaybackParameters r1, boolean r2, long r3, long r5, com.google.android.exoplayer2.audio.DefaultAudioSink.AnonymousClass1 r7) {
                r0 = this;
                r0.<init>(r1, r2, r3, r5)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface OffloadMode {
    }

    /* JADX INFO: loaded from: classes.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface OutputMode {
    }

    public static final class PendingExceptionHolder<T extends java.lang.Exception> {

        @androidx.annotation.Nullable
        private T pendingException;
        private long throwDeadlineMs;
        private final long throwDelayMs;

        public PendingExceptionHolder(long r1) {
                r0 = this;
                r0.<init>()
                r0.throwDelayMs = r1
                return
        }

        public void clear() {
                r1 = this;
                r0 = 0
                r1.pendingException = r0
                return
        }

        public void throwExceptionIfDeadlineIsReached(T r6) throws java.lang.Exception {
                r5 = this;
                long r0 = android.os.SystemClock.elapsedRealtime()
                T extends java.lang.Exception r2 = r5.pendingException
                if (r2 != 0) goto Lf
                r5.pendingException = r6
                long r2 = r5.throwDelayMs
                long r2 = r2 + r0
                r5.throwDeadlineMs = r2
            Lf:
                long r2 = r5.throwDeadlineMs
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 < 0) goto L22
                T extends java.lang.Exception r0 = r5.pendingException
                if (r0 == r6) goto L1c
                r0.addSuppressed(r6)
            L1c:
                T extends java.lang.Exception r6 = r5.pendingException
                r5.clear()
                throw r6
            L22:
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public final class PositionTrackerListener implements com.google.android.exoplayer2.audio.AudioTrackPositionTracker.Listener {
        public final /* synthetic */ com.google.android.exoplayer2.audio.DefaultAudioSink this$0;

        private PositionTrackerListener(com.google.android.exoplayer2.audio.DefaultAudioSink r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ PositionTrackerListener(com.google.android.exoplayer2.audio.DefaultAudioSink r1, com.google.android.exoplayer2.audio.DefaultAudioSink.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.android.exoplayer2.audio.AudioTrackPositionTracker.Listener
        public void onInvalidLatency(long r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Ignoring impossibly large audio latency: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                java.lang.String r4 = "DefaultAudioSink"
                com.google.android.exoplayer2.util.Log.w(r4, r3)
                return
        }

        @Override // com.google.android.exoplayer2.audio.AudioTrackPositionTracker.Listener
        public void onPositionAdvancing(long r2) {
                r1 = this;
                com.google.android.exoplayer2.audio.DefaultAudioSink r0 = r1.this$0
                com.google.android.exoplayer2.audio.AudioSink$Listener r0 = com.google.android.exoplayer2.audio.DefaultAudioSink.access$900(r0)
                if (r0 == 0) goto L11
                com.google.android.exoplayer2.audio.DefaultAudioSink r0 = r1.this$0
                com.google.android.exoplayer2.audio.AudioSink$Listener r0 = com.google.android.exoplayer2.audio.DefaultAudioSink.access$900(r0)
                r0.onPositionAdvancing(r2)
            L11:
                return
        }

        @Override // com.google.android.exoplayer2.audio.AudioTrackPositionTracker.Listener
        public void onPositionFramesMismatch(long r3, long r5, long r7, long r9) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Spurious audio timestamp (frame position mismatch): "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = ", "
                r0.append(r3)
                r0.append(r5)
                r0.append(r3)
                r0.append(r7)
                r0.append(r3)
                r0.append(r9)
                r0.append(r3)
                com.google.android.exoplayer2.audio.DefaultAudioSink r4 = r2.this$0
                long r4 = com.google.android.exoplayer2.audio.DefaultAudioSink.access$1100(r4)
                r0.append(r4)
                r0.append(r3)
                com.google.android.exoplayer2.audio.DefaultAudioSink r3 = r2.this$0
                long r3 = com.google.android.exoplayer2.audio.DefaultAudioSink.access$1200(r3)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                boolean r4 = com.google.android.exoplayer2.audio.DefaultAudioSink.failOnSpuriousAudioTimestamp
                if (r4 != 0) goto L47
                java.lang.String r4 = "DefaultAudioSink"
                com.google.android.exoplayer2.util.Log.w(r4, r3)
                return
            L47:
                com.google.android.exoplayer2.audio.DefaultAudioSink$InvalidAudioTrackTimestampException r4 = new com.google.android.exoplayer2.audio.DefaultAudioSink$InvalidAudioTrackTimestampException
                r5 = 0
                r4.<init>(r3, r5)
                throw r4
        }

        @Override // com.google.android.exoplayer2.audio.AudioTrackPositionTracker.Listener
        public void onSystemTimeUsMismatch(long r3, long r5, long r7, long r9) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Spurious audio timestamp (system clock mismatch): "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = ", "
                r0.append(r3)
                r0.append(r5)
                r0.append(r3)
                r0.append(r7)
                r0.append(r3)
                r0.append(r9)
                r0.append(r3)
                com.google.android.exoplayer2.audio.DefaultAudioSink r4 = r2.this$0
                long r4 = com.google.android.exoplayer2.audio.DefaultAudioSink.access$1100(r4)
                r0.append(r4)
                r0.append(r3)
                com.google.android.exoplayer2.audio.DefaultAudioSink r3 = r2.this$0
                long r3 = com.google.android.exoplayer2.audio.DefaultAudioSink.access$1200(r3)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                boolean r4 = com.google.android.exoplayer2.audio.DefaultAudioSink.failOnSpuriousAudioTimestamp
                if (r4 != 0) goto L47
                java.lang.String r4 = "DefaultAudioSink"
                com.google.android.exoplayer2.util.Log.w(r4, r3)
                return
            L47:
                com.google.android.exoplayer2.audio.DefaultAudioSink$InvalidAudioTrackTimestampException r4 = new com.google.android.exoplayer2.audio.DefaultAudioSink$InvalidAudioTrackTimestampException
                r5 = 0
                r4.<init>(r3, r5)
                throw r4
        }

        @Override // com.google.android.exoplayer2.audio.AudioTrackPositionTracker.Listener
        public void onUnderrun(int r11, long r12) {
                r10 = this;
                com.google.android.exoplayer2.audio.DefaultAudioSink r0 = r10.this$0
                com.google.android.exoplayer2.audio.AudioSink$Listener r0 = com.google.android.exoplayer2.audio.DefaultAudioSink.access$900(r0)
                if (r0 == 0) goto L1f
                long r0 = android.os.SystemClock.elapsedRealtime()
                com.google.android.exoplayer2.audio.DefaultAudioSink r2 = r10.this$0
                long r2 = com.google.android.exoplayer2.audio.DefaultAudioSink.access$1400(r2)
                long r8 = r0 - r2
                com.google.android.exoplayer2.audio.DefaultAudioSink r0 = r10.this$0
                com.google.android.exoplayer2.audio.AudioSink$Listener r4 = com.google.android.exoplayer2.audio.DefaultAudioSink.access$900(r0)
                r5 = r11
                r6 = r12
                r4.onUnderrun(r5, r6, r8)
            L1f:
                return
        }
    }

    @androidx.annotation.RequiresApi(29)
    public final class StreamEventCallbackV29 {
        private final android.media.AudioTrack.StreamEventCallback callback;
        private final android.os.Handler handler;
        public final /* synthetic */ com.google.android.exoplayer2.audio.DefaultAudioSink this$0;


        public StreamEventCallbackV29(com.google.android.exoplayer2.audio.DefaultAudioSink r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                android.os.Handler r2 = new android.os.Handler
                android.os.Looper r0 = android.os.Looper.myLooper()
                r2.<init>(r0)
                r1.handler = r2
                com.google.android.exoplayer2.audio.DefaultAudioSink$StreamEventCallbackV29$1 r2 = new com.google.android.exoplayer2.audio.DefaultAudioSink$StreamEventCallbackV29$1
                r2.<init>(r1)
                r1.callback = r2
                return
        }

        public void register(android.media.AudioTrack r4) {
                r3 = this;
                android.os.Handler r0 = r3.handler
                java.util.Objects.requireNonNull(r0)
                com.google.android.exoplayer2.audio.DefaultAudioSink$StreamEventCallbackV29$$ExternalSyntheticLambda0 r1 = new com.google.android.exoplayer2.audio.DefaultAudioSink$StreamEventCallbackV29$$ExternalSyntheticLambda0
                r2 = 0
                r1.<init>(r0, r2)
                android.media.AudioTrack$StreamEventCallback r0 = r3.callback
                r4.registerStreamEventCallback(r1, r0)
                return
        }

        public void unregister(android.media.AudioTrack r2) {
                r1 = this;
                android.media.AudioTrack$StreamEventCallback r0 = r1.callback
                r2.unregisterStreamEventCallback(r0)
                android.os.Handler r2 = r1.handler
                r0 = 0
                r2.removeCallbacksAndMessages(r0)
                return
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$_pmErlEQKqFam1a5jM-4lq8BepM, reason: not valid java name */
    public static /* synthetic */ void m213$r8$lambda$_pmErlEQKqFam1a5jM4lq8BepM(android.media.AudioTrack r0, com.google.android.exoplayer2.util.ConditionVariable r1) {
            lambda$releaseAudioTrackAsync$0(r0, r1)
            return
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.exoplayer2.audio.DefaultAudioSink.releaseExecutorLock = r0
            return
    }

    @com.google.errorprone.annotations.InlineMe(imports = {"com.google.android.exoplayer2.audio.DefaultAudioSink"}, replacement = "new DefaultAudioSink.Builder().setAudioCapabilities(audioCapabilities).setAudioProcessorChain(audioProcessorChain).setEnableFloatOutput(enableFloatOutput).setEnableAudioTrackPlaybackParams(enableAudioTrackPlaybackParams).setOffloadMode(offloadMode).build()")
    @com.google.errorprone.annotations.InlineMeValidationDisabled("Migrate constructor to Builder")
    @java.lang.Deprecated
    public DefaultAudioSink(@androidx.annotation.Nullable com.google.android.exoplayer2.audio.AudioCapabilities r3, com.google.android.exoplayer2.audio.DefaultAudioSink.AudioProcessorChain r4, boolean r5, boolean r6, int r7) {
            r2 = this;
            com.google.android.exoplayer2.audio.DefaultAudioSink$Builder r0 = new com.google.android.exoplayer2.audio.DefaultAudioSink$Builder
            r0.<init>()
            com.google.android.exoplayer2.audio.AudioCapabilities r1 = com.google.android.exoplayer2.audio.AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES
            java.lang.Object r3 = com.google.common.base.MoreObjects.firstNonNull(r3, r1)
            com.google.android.exoplayer2.audio.AudioCapabilities r3 = (com.google.android.exoplayer2.audio.AudioCapabilities) r3
            com.google.android.exoplayer2.audio.DefaultAudioSink$Builder r3 = r0.setAudioCapabilities(r3)
            com.google.android.exoplayer2.audio.DefaultAudioSink$Builder r3 = r3.setAudioProcessorChain(r4)
            com.google.android.exoplayer2.audio.DefaultAudioSink$Builder r3 = r3.setEnableFloatOutput(r5)
            com.google.android.exoplayer2.audio.DefaultAudioSink$Builder r3 = r3.setEnableAudioTrackPlaybackParams(r6)
            com.google.android.exoplayer2.audio.DefaultAudioSink$Builder r3 = r3.setOffloadMode(r7)
            r2.<init>(r3)
            return
    }

    @com.google.errorprone.annotations.InlineMe(imports = {"com.google.android.exoplayer2.audio.DefaultAudioSink"}, replacement = "new DefaultAudioSink.Builder().setAudioCapabilities(audioCapabilities).setAudioProcessors(audioProcessors).build()")
    @com.google.errorprone.annotations.InlineMeValidationDisabled("Migrate constructor to Builder")
    @java.lang.Deprecated
    public DefaultAudioSink(@androidx.annotation.Nullable com.google.android.exoplayer2.audio.AudioCapabilities r3, com.google.android.exoplayer2.audio.AudioProcessor[] r4) {
            r2 = this;
            com.google.android.exoplayer2.audio.DefaultAudioSink$Builder r0 = new com.google.android.exoplayer2.audio.DefaultAudioSink$Builder
            r0.<init>()
            com.google.android.exoplayer2.audio.AudioCapabilities r1 = com.google.android.exoplayer2.audio.AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES
            java.lang.Object r3 = com.google.common.base.MoreObjects.firstNonNull(r3, r1)
            com.google.android.exoplayer2.audio.AudioCapabilities r3 = (com.google.android.exoplayer2.audio.AudioCapabilities) r3
            com.google.android.exoplayer2.audio.DefaultAudioSink$Builder r3 = r0.setAudioCapabilities(r3)
            com.google.android.exoplayer2.audio.DefaultAudioSink$Builder r3 = r3.setAudioProcessors(r4)
            r2.<init>(r3)
            return
    }

    @com.google.errorprone.annotations.InlineMe(imports = {"com.google.android.exoplayer2.audio.DefaultAudioSink"}, replacement = "new DefaultAudioSink.Builder().setAudioCapabilities(audioCapabilities).setAudioProcessors(audioProcessors).setEnableFloatOutput(enableFloatOutput).build()")
    @com.google.errorprone.annotations.InlineMeValidationDisabled("Migrate constructor to Builder")
    @java.lang.Deprecated
    public DefaultAudioSink(@androidx.annotation.Nullable com.google.android.exoplayer2.audio.AudioCapabilities r3, com.google.android.exoplayer2.audio.AudioProcessor[] r4, boolean r5) {
            r2 = this;
            com.google.android.exoplayer2.audio.DefaultAudioSink$Builder r0 = new com.google.android.exoplayer2.audio.DefaultAudioSink$Builder
            r0.<init>()
            com.google.android.exoplayer2.audio.AudioCapabilities r1 = com.google.android.exoplayer2.audio.AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES
            java.lang.Object r3 = com.google.common.base.MoreObjects.firstNonNull(r3, r1)
            com.google.android.exoplayer2.audio.AudioCapabilities r3 = (com.google.android.exoplayer2.audio.AudioCapabilities) r3
            com.google.android.exoplayer2.audio.DefaultAudioSink$Builder r3 = r0.setAudioCapabilities(r3)
            com.google.android.exoplayer2.audio.DefaultAudioSink$Builder r3 = r3.setAudioProcessors(r4)
            com.google.android.exoplayer2.audio.DefaultAudioSink$Builder r3 = r3.setEnableFloatOutput(r5)
            r2.<init>(r3)
            return
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#1.audioProcessorChain"})
    private DefaultAudioSink(com.google.android.exoplayer2.audio.DefaultAudioSink.Builder r13) {
            r12 = this;
            r12.<init>()
            com.google.android.exoplayer2.audio.AudioCapabilities r0 = com.google.android.exoplayer2.audio.DefaultAudioSink.Builder.access$100(r13)
            r12.audioCapabilities = r0
            com.google.android.exoplayer2.audio.AudioProcessorChain r0 = com.google.android.exoplayer2.audio.DefaultAudioSink.Builder.access$200(r13)
            r12.audioProcessorChain = r0
            int r1 = com.google.android.exoplayer2.util.Util.SDK_INT
            r2 = 1
            r3 = 0
            r4 = 21
            if (r1 < r4) goto L1f
            boolean r4 = com.google.android.exoplayer2.audio.DefaultAudioSink.Builder.access$300(r13)
            if (r4 == 0) goto L1f
            r4 = 1
            goto L20
        L1f:
            r4 = 0
        L20:
            r12.enableFloatOutput = r4
            r4 = 23
            if (r1 < r4) goto L2e
            boolean r4 = com.google.android.exoplayer2.audio.DefaultAudioSink.Builder.access$400(r13)
            if (r4 == 0) goto L2e
            r4 = 1
            goto L2f
        L2e:
            r4 = 0
        L2f:
            r12.enableAudioTrackPlaybackParams = r4
            r4 = 29
            if (r1 < r4) goto L3a
            int r1 = com.google.android.exoplayer2.audio.DefaultAudioSink.Builder.access$500(r13)
            goto L3b
        L3a:
            r1 = 0
        L3b:
            r12.offloadMode = r1
            com.google.android.exoplayer2.audio.DefaultAudioSink$AudioTrackBufferSizeProvider r1 = r13.audioTrackBufferSizeProvider
            r12.audioTrackBufferSizeProvider = r1
            com.google.android.exoplayer2.util.ConditionVariable r1 = new com.google.android.exoplayer2.util.ConditionVariable
            com.google.android.exoplayer2.util.Clock r4 = com.google.android.exoplayer2.util.Clock.DEFAULT
            r1.<init>(r4)
            r12.releasingConditionVariable = r1
            r1.open()
            com.google.android.exoplayer2.audio.AudioTrackPositionTracker r1 = new com.google.android.exoplayer2.audio.AudioTrackPositionTracker
            com.google.android.exoplayer2.audio.DefaultAudioSink$PositionTrackerListener r4 = new com.google.android.exoplayer2.audio.DefaultAudioSink$PositionTrackerListener
            r5 = 0
            r4.<init>(r12, r5)
            r1.<init>(r4)
            r12.audioTrackPositionTracker = r1
            com.google.android.exoplayer2.audio.ChannelMappingAudioProcessor r1 = new com.google.android.exoplayer2.audio.ChannelMappingAudioProcessor
            r1.<init>()
            r12.channelMappingAudioProcessor = r1
            com.google.android.exoplayer2.audio.TrimmingAudioProcessor r4 = new com.google.android.exoplayer2.audio.TrimmingAudioProcessor
            r4.<init>()
            r12.trimmingAudioProcessor = r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 3
            com.google.android.exoplayer2.audio.BaseAudioProcessor[] r6 = new com.google.android.exoplayer2.audio.BaseAudioProcessor[r6]
            com.google.android.exoplayer2.audio.ResamplingAudioProcessor r7 = new com.google.android.exoplayer2.audio.ResamplingAudioProcessor
            r7.<init>()
            r6[r3] = r7
            r6[r2] = r1
            r1 = 2
            r6[r1] = r4
            java.util.Collections.addAll(r5, r6)
            com.google.android.exoplayer2.audio.AudioProcessor[] r0 = r0.getAudioProcessors()
            java.util.Collections.addAll(r5, r0)
            com.google.android.exoplayer2.audio.AudioProcessor[] r0 = new com.google.android.exoplayer2.audio.AudioProcessor[r3]
            java.lang.Object[] r0 = r5.toArray(r0)
            com.google.android.exoplayer2.audio.AudioProcessor[] r0 = (com.google.android.exoplayer2.audio.AudioProcessor[]) r0
            r12.toIntPcmAvailableAudioProcessors = r0
            com.google.android.exoplayer2.audio.AudioProcessor[] r0 = new com.google.android.exoplayer2.audio.AudioProcessor[r2]
            com.google.android.exoplayer2.audio.FloatResamplingAudioProcessor r1 = new com.google.android.exoplayer2.audio.FloatResamplingAudioProcessor
            r1.<init>()
            r0[r3] = r1
            r12.toFloatPcmAvailableAudioProcessors = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r12.volume = r0
            com.google.android.exoplayer2.audio.AudioAttributes r0 = com.google.android.exoplayer2.audio.AudioAttributes.DEFAULT
            r12.audioAttributes = r0
            r12.audioSessionId = r3
            com.google.android.exoplayer2.audio.AuxEffectInfo r0 = new com.google.android.exoplayer2.audio.AuxEffectInfo
            r1 = 0
            r0.<init>(r3, r1)
            r12.auxEffectInfo = r0
            com.google.android.exoplayer2.audio.DefaultAudioSink$MediaPositionParameters r0 = new com.google.android.exoplayer2.audio.DefaultAudioSink$MediaPositionParameters
            com.google.android.exoplayer2.PlaybackParameters r1 = com.google.android.exoplayer2.PlaybackParameters.DEFAULT
            r6 = 0
            r7 = 0
            r9 = 0
            r11 = 0
            r4 = r0
            r5 = r1
            r4.<init>(r5, r6, r7, r9, r11)
            r12.mediaPositionParameters = r0
            r12.audioTrackPlaybackParameters = r1
            r0 = -1
            r12.drainingAudioProcessorIndex = r0
            com.google.android.exoplayer2.audio.AudioProcessor[] r0 = new com.google.android.exoplayer2.audio.AudioProcessor[r3]
            r12.activeAudioProcessors = r0
            java.nio.ByteBuffer[] r0 = new java.nio.ByteBuffer[r3]
            r12.outputBuffers = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r12.mediaPositionParametersCheckpoints = r0
            com.google.android.exoplayer2.audio.DefaultAudioSink$PendingExceptionHolder r0 = new com.google.android.exoplayer2.audio.DefaultAudioSink$PendingExceptionHolder
            r1 = 100
            r0.<init>(r1)
            r12.initializationExceptionPendingExceptionHolder = r0
            com.google.android.exoplayer2.audio.DefaultAudioSink$PendingExceptionHolder r0 = new com.google.android.exoplayer2.audio.DefaultAudioSink$PendingExceptionHolder
            r0.<init>(r1)
            r12.writeExceptionPendingExceptionHolder = r0
            com.google.android.exoplayer2.ExoPlayer$AudioOffloadListener r13 = r13.audioOffloadListener
            r12.audioOffloadListener = r13
            return
    }

    public /* synthetic */ DefaultAudioSink(com.google.android.exoplayer2.audio.DefaultAudioSink.Builder r1, com.google.android.exoplayer2.audio.DefaultAudioSink.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static /* synthetic */ boolean access$1000(com.google.android.exoplayer2.audio.DefaultAudioSink r0) {
            boolean r0 = r0.playing
            return r0
    }

    public static /* synthetic */ long access$1100(com.google.android.exoplayer2.audio.DefaultAudioSink r2) {
            long r0 = r2.getSubmittedFrames()
            return r0
    }

    public static /* synthetic */ long access$1200(com.google.android.exoplayer2.audio.DefaultAudioSink r2) {
            long r0 = r2.getWrittenFrames()
            return r0
    }

    public static /* synthetic */ long access$1400(com.google.android.exoplayer2.audio.DefaultAudioSink r2) {
            long r0 = r2.lastFeedElapsedRealtimeMs
            return r0
    }

    public static /* synthetic */ android.media.AudioFormat access$1500(int r0, int r1, int r2) {
            android.media.AudioFormat r0 = getAudioFormat(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ android.media.AudioTrack access$800(com.google.android.exoplayer2.audio.DefaultAudioSink r0) {
            android.media.AudioTrack r0 = r0.audioTrack
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.audio.AudioSink.Listener access$900(com.google.android.exoplayer2.audio.DefaultAudioSink r0) {
            com.google.android.exoplayer2.audio.AudioSink$Listener r0 = r0.listener
            return r0
    }

    private void applyAudioProcessorPlaybackParametersAndSkipSilence(long r12) {
            r11 = this;
            boolean r0 = r11.shouldApplyAudioProcessorPlaybackParameters()
            if (r0 == 0) goto L11
            com.google.android.exoplayer2.audio.AudioProcessorChain r0 = r11.audioProcessorChain
            com.google.android.exoplayer2.PlaybackParameters r1 = r11.getAudioProcessorPlaybackParameters()
            com.google.android.exoplayer2.PlaybackParameters r0 = r0.applyPlaybackParameters(r1)
            goto L13
        L11:
            com.google.android.exoplayer2.PlaybackParameters r0 = com.google.android.exoplayer2.PlaybackParameters.DEFAULT
        L13:
            r2 = r0
            boolean r0 = r11.shouldApplyAudioProcessorPlaybackParameters()
            if (r0 == 0) goto L25
            com.google.android.exoplayer2.audio.AudioProcessorChain r0 = r11.audioProcessorChain
            boolean r1 = r11.getSkipSilenceEnabled()
            boolean r0 = r0.applySkipSilenceEnabled(r1)
            goto L26
        L25:
            r0 = 0
        L26:
            java.util.ArrayDeque<com.google.android.exoplayer2.audio.DefaultAudioSink$MediaPositionParameters> r9 = r11.mediaPositionParametersCheckpoints
            com.google.android.exoplayer2.audio.DefaultAudioSink$MediaPositionParameters r10 = new com.google.android.exoplayer2.audio.DefaultAudioSink$MediaPositionParameters
            r3 = 0
            long r4 = java.lang.Math.max(r3, r12)
            com.google.android.exoplayer2.audio.DefaultAudioSink$Configuration r12 = r11.configuration
            long r6 = r11.getWrittenFrames()
            long r6 = r12.framesToDurationUs(r6)
            r8 = 0
            r1 = r10
            r3 = r0
            r1.<init>(r2, r3, r4, r6, r8)
            r9.add(r10)
            r11.setupAudioProcessors()
            com.google.android.exoplayer2.audio.AudioSink$Listener r12 = r11.listener
            if (r12 == 0) goto L4d
            r12.onSkipSilenceEnabledChanged(r0)
        L4d:
            return
    }

    private long applyMediaPositionParameters(long r5) {
            r4 = this;
        L0:
            java.util.ArrayDeque<com.google.android.exoplayer2.audio.DefaultAudioSink$MediaPositionParameters> r0 = r4.mediaPositionParametersCheckpoints
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L21
            java.util.ArrayDeque<com.google.android.exoplayer2.audio.DefaultAudioSink$MediaPositionParameters> r0 = r4.mediaPositionParametersCheckpoints
            java.lang.Object r0 = r0.getFirst()
            com.google.android.exoplayer2.audio.DefaultAudioSink$MediaPositionParameters r0 = (com.google.android.exoplayer2.audio.DefaultAudioSink.MediaPositionParameters) r0
            long r0 = r0.audioTrackPositionUs
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 < 0) goto L21
            java.util.ArrayDeque<com.google.android.exoplayer2.audio.DefaultAudioSink$MediaPositionParameters> r0 = r4.mediaPositionParametersCheckpoints
            java.lang.Object r0 = r0.remove()
            com.google.android.exoplayer2.audio.DefaultAudioSink$MediaPositionParameters r0 = (com.google.android.exoplayer2.audio.DefaultAudioSink.MediaPositionParameters) r0
            r4.mediaPositionParameters = r0
            goto L0
        L21:
            com.google.android.exoplayer2.audio.DefaultAudioSink$MediaPositionParameters r0 = r4.mediaPositionParameters
            long r1 = r0.audioTrackPositionUs
            long r1 = r5 - r1
            com.google.android.exoplayer2.PlaybackParameters r0 = r0.playbackParameters
            com.google.android.exoplayer2.PlaybackParameters r3 = com.google.android.exoplayer2.PlaybackParameters.DEFAULT
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L37
            com.google.android.exoplayer2.audio.DefaultAudioSink$MediaPositionParameters r5 = r4.mediaPositionParameters
            long r5 = r5.mediaTimeUs
            long r5 = r5 + r1
            return r5
        L37:
            java.util.ArrayDeque<com.google.android.exoplayer2.audio.DefaultAudioSink$MediaPositionParameters> r0 = r4.mediaPositionParametersCheckpoints
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L4b
            com.google.android.exoplayer2.audio.AudioProcessorChain r5 = r4.audioProcessorChain
            long r5 = r5.getMediaDuration(r1)
            com.google.android.exoplayer2.audio.DefaultAudioSink$MediaPositionParameters r0 = r4.mediaPositionParameters
            long r0 = r0.mediaTimeUs
            long r0 = r0 + r5
            return r0
        L4b:
            java.util.ArrayDeque<com.google.android.exoplayer2.audio.DefaultAudioSink$MediaPositionParameters> r0 = r4.mediaPositionParametersCheckpoints
            java.lang.Object r0 = r0.getFirst()
            com.google.android.exoplayer2.audio.DefaultAudioSink$MediaPositionParameters r0 = (com.google.android.exoplayer2.audio.DefaultAudioSink.MediaPositionParameters) r0
            long r1 = r0.audioTrackPositionUs
            long r1 = r1 - r5
            com.google.android.exoplayer2.audio.DefaultAudioSink$MediaPositionParameters r5 = r4.mediaPositionParameters
            com.google.android.exoplayer2.PlaybackParameters r5 = r5.playbackParameters
            float r5 = r5.speed
            long r5 = com.google.android.exoplayer2.util.Util.getMediaDurationForPlayoutDuration(r1, r5)
            long r0 = r0.mediaTimeUs
            long r0 = r0 - r5
            return r0
    }

    private long applySkipping(long r4) {
            r3 = this;
            com.google.android.exoplayer2.audio.DefaultAudioSink$Configuration r0 = r3.configuration
            com.google.android.exoplayer2.audio.AudioProcessorChain r1 = r3.audioProcessorChain
            long r1 = r1.getSkippedOutputFrameCount()
            long r0 = r0.framesToDurationUs(r1)
            long r4 = r4 + r0
            return r4
    }

    private android.media.AudioTrack buildAudioTrack(com.google.android.exoplayer2.audio.DefaultAudioSink.Configuration r4) throws com.google.android.exoplayer2.audio.AudioSink.InitializationException {
            r3 = this;
            boolean r0 = r3.tunneling     // Catch: com.google.android.exoplayer2.audio.AudioSink.InitializationException -> L16
            com.google.android.exoplayer2.audio.AudioAttributes r1 = r3.audioAttributes     // Catch: com.google.android.exoplayer2.audio.AudioSink.InitializationException -> L16
            int r2 = r3.audioSessionId     // Catch: com.google.android.exoplayer2.audio.AudioSink.InitializationException -> L16
            android.media.AudioTrack r4 = r4.buildAudioTrack(r0, r1, r2)     // Catch: com.google.android.exoplayer2.audio.AudioSink.InitializationException -> L16
            com.google.android.exoplayer2.ExoPlayer$AudioOffloadListener r0 = r3.audioOffloadListener     // Catch: com.google.android.exoplayer2.audio.AudioSink.InitializationException -> L16
            if (r0 == 0) goto L15
            boolean r1 = isOffloadedPlayback(r4)     // Catch: com.google.android.exoplayer2.audio.AudioSink.InitializationException -> L16
            r0.onExperimentalOffloadedPlayback(r1)     // Catch: com.google.android.exoplayer2.audio.AudioSink.InitializationException -> L16
        L15:
            return r4
        L16:
            r4 = move-exception
            com.google.android.exoplayer2.audio.AudioSink$Listener r0 = r3.listener
            if (r0 == 0) goto L1e
            r0.onAudioSinkError(r4)
        L1e:
            throw r4
    }

    private android.media.AudioTrack buildAudioTrackWithRetry() throws com.google.android.exoplayer2.audio.AudioSink.InitializationException {
            r4 = this;
            com.google.android.exoplayer2.audio.DefaultAudioSink$Configuration r0 = r4.configuration     // Catch: com.google.android.exoplayer2.audio.AudioSink.InitializationException -> Ld
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)     // Catch: com.google.android.exoplayer2.audio.AudioSink.InitializationException -> Ld
            com.google.android.exoplayer2.audio.DefaultAudioSink$Configuration r0 = (com.google.android.exoplayer2.audio.DefaultAudioSink.Configuration) r0     // Catch: com.google.android.exoplayer2.audio.AudioSink.InitializationException -> Ld
            android.media.AudioTrack r0 = r4.buildAudioTrack(r0)     // Catch: com.google.android.exoplayer2.audio.AudioSink.InitializationException -> Ld
            return r0
        Ld:
            r0 = move-exception
            com.google.android.exoplayer2.audio.DefaultAudioSink$Configuration r1 = r4.configuration
            int r2 = r1.bufferSize
            r3 = 1000000(0xf4240, float:1.401298E-39)
            if (r2 <= r3) goto L26
            com.google.android.exoplayer2.audio.DefaultAudioSink$Configuration r1 = r1.copyWithBufferSize(r3)
            android.media.AudioTrack r2 = r4.buildAudioTrack(r1)     // Catch: com.google.android.exoplayer2.audio.AudioSink.InitializationException -> L22
            r4.configuration = r1     // Catch: com.google.android.exoplayer2.audio.AudioSink.InitializationException -> L22
            return r2
        L22:
            r1 = move-exception
            r0.addSuppressed(r1)
        L26:
            r4.maybeDisableOffload()
            throw r0
    }

    private boolean drainToEndOfStream() throws com.google.android.exoplayer2.audio.AudioSink.WriteException {
            r9 = this;
            int r0 = r9.drainingAudioProcessorIndex
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto Lb
            r9.drainingAudioProcessorIndex = r3
        L9:
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            int r4 = r9.drainingAudioProcessorIndex
            com.google.android.exoplayer2.audio.AudioProcessor[] r5 = r9.activeAudioProcessors
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.queueEndOfStream()
        L1f:
            r9.processBuffers(r7)
            boolean r0 = r4.isEnded()
            if (r0 != 0) goto L29
            return r3
        L29:
            int r0 = r9.drainingAudioProcessorIndex
            int r0 = r0 + r2
            r9.drainingAudioProcessorIndex = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.outputBuffer
            if (r0 == 0) goto L3b
            r9.writeBuffer(r0, r7)
            java.nio.ByteBuffer r0 = r9.outputBuffer
            if (r0 == 0) goto L3b
            return r3
        L3b:
            r9.drainingAudioProcessorIndex = r1
            return r2
    }

    private void flushAudioProcessors() {
            r3 = this;
            r0 = 0
        L1:
            com.google.android.exoplayer2.audio.AudioProcessor[] r1 = r3.activeAudioProcessors
            int r2 = r1.length
            if (r0 >= r2) goto L16
            r1 = r1[r0]
            r1.flush()
            java.nio.ByteBuffer[] r2 = r3.outputBuffers
            java.nio.ByteBuffer r1 = r1.getOutput()
            r2[r0] = r1
            int r0 = r0 + 1
            goto L1
        L16:
            return
    }

    @androidx.annotation.RequiresApi(21)
    private static android.media.AudioFormat getAudioFormat(int r1, int r2, int r3) {
            android.media.AudioFormat$Builder r0 = new android.media.AudioFormat$Builder
            r0.<init>()
            android.media.AudioFormat$Builder r1 = r0.setSampleRate(r1)
            android.media.AudioFormat$Builder r1 = r1.setChannelMask(r2)
            android.media.AudioFormat$Builder r1 = r1.setEncoding(r3)
            android.media.AudioFormat r1 = r1.build()
            return r1
    }

    private com.google.android.exoplayer2.PlaybackParameters getAudioProcessorPlaybackParameters() {
            r1 = this;
            com.google.android.exoplayer2.audio.DefaultAudioSink$MediaPositionParameters r0 = r1.getMediaPositionParameters()
            com.google.android.exoplayer2.PlaybackParameters r0 = r0.playbackParameters
            return r0
    }

    private static int getAudioTrackMinBufferSize(int r0, int r1, int r2) {
            int r0 = android.media.AudioTrack.getMinBufferSize(r0, r1, r2)
            r1 = -2
            if (r0 == r1) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            com.google.android.exoplayer2.util.Assertions.checkState(r1)
            return r0
    }

    private static int getFramesPerEncodedSample(int r2, java.nio.ByteBuffer r3) {
            r0 = 1024(0x400, float:1.435E-42)
            r1 = -1
            switch(r2) {
                case 5: goto L4d;
                case 6: goto L4d;
                case 7: goto L48;
                case 8: goto L48;
                case 9: goto L33;
                case 10: goto L32;
                case 11: goto L2f;
                case 12: goto L2f;
                case 13: goto L6;
                case 14: goto L20;
                case 15: goto L1d;
                case 16: goto L1c;
                case 17: goto L17;
                case 18: goto L4d;
                case 19: goto L6;
                case 20: goto L12;
                default: goto L6;
            }
        L6:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unexpected audio encoding: "
            java.lang.String r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r2)
            r3.<init>(r2)
            throw r3
        L12:
            int r2 = com.google.android.exoplayer2.audio.OpusUtil.parsePacketAudioSampleCount(r3)
            return r2
        L17:
            int r2 = com.google.android.exoplayer2.audio.Ac4Util.parseAc4SyncframeAudioSampleCount(r3)
            return r2
        L1c:
            return r0
        L1d:
            r2 = 512(0x200, float:7.17E-43)
            return r2
        L20:
            int r2 = com.google.android.exoplayer2.audio.Ac3Util.findTrueHdSyncframeOffset(r3)
            if (r2 != r1) goto L28
            r2 = 0
            goto L2e
        L28:
            int r2 = com.google.android.exoplayer2.audio.Ac3Util.parseTrueHdSyncframeAudioSampleCount(r3, r2)
            int r2 = r2 * 16
        L2e:
            return r2
        L2f:
            r2 = 2048(0x800, float:2.87E-42)
            return r2
        L32:
            return r0
        L33:
            int r2 = r3.position()
            int r2 = com.google.android.exoplayer2.util.Util.getBigEndianInt(r3, r2)
            int r2 = com.google.android.exoplayer2.audio.MpegAudioUtil.parseMpegAudioFrameSampleCount(r2)
            if (r2 == r1) goto L42
            return r2
        L42:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
        L48:
            int r2 = com.google.android.exoplayer2.audio.DtsUtil.parseDtsAudioSampleCount(r3)
            return r2
        L4d:
            int r2 = com.google.android.exoplayer2.audio.Ac3Util.parseAc3SyncframeAudioSampleCount(r3)
            return r2
    }

    private com.google.android.exoplayer2.audio.DefaultAudioSink.MediaPositionParameters getMediaPositionParameters() {
            r1 = this;
            com.google.android.exoplayer2.audio.DefaultAudioSink$MediaPositionParameters r0 = r1.afterDrainParameters
            if (r0 == 0) goto L5
            goto L18
        L5:
            java.util.ArrayDeque<com.google.android.exoplayer2.audio.DefaultAudioSink$MediaPositionParameters> r0 = r1.mediaPositionParametersCheckpoints
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L16
            java.util.ArrayDeque<com.google.android.exoplayer2.audio.DefaultAudioSink$MediaPositionParameters> r0 = r1.mediaPositionParametersCheckpoints
            java.lang.Object r0 = r0.getLast()
            com.google.android.exoplayer2.audio.DefaultAudioSink$MediaPositionParameters r0 = (com.google.android.exoplayer2.audio.DefaultAudioSink.MediaPositionParameters) r0
            goto L18
        L16:
            com.google.android.exoplayer2.audio.DefaultAudioSink$MediaPositionParameters r0 = r1.mediaPositionParameters
        L18:
            return r0
    }

    @androidx.annotation.RequiresApi(29)
    @android.annotation.SuppressLint({"InlinedApi"})
    private int getOffloadedPlaybackSupport(android.media.AudioFormat r3, android.media.AudioAttributes r4) {
            r2 = this;
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 31
            if (r0 < r1) goto Lb
            int r3 = android.media.AudioManager.getPlaybackOffloadSupport(r3, r4)
            return r3
        Lb:
            boolean r3 = android.media.AudioManager.isOffloadedPlaybackSupported(r3, r4)
            if (r3 != 0) goto L13
            r3 = 0
            return r3
        L13:
            r3 = 30
            if (r0 != r3) goto L23
            java.lang.String r3 = com.google.android.exoplayer2.util.Util.MODEL
            java.lang.String r4 = "Pixel"
            boolean r3 = r3.startsWith(r4)
            if (r3 == 0) goto L23
            r3 = 2
            return r3
        L23:
            r3 = 1
            return r3
    }

    private long getSubmittedFrames() {
            r5 = this;
            com.google.android.exoplayer2.audio.DefaultAudioSink$Configuration r0 = r5.configuration
            int r1 = r0.outputMode
            if (r1 != 0) goto Ld
            long r1 = r5.submittedPcmBytes
            int r0 = r0.inputPcmFrameSize
            long r3 = (long) r0
            long r1 = r1 / r3
            goto Lf
        Ld:
            long r1 = r5.submittedEncodedFrames
        Lf:
            return r1
    }

    private long getWrittenFrames() {
            r5 = this;
            com.google.android.exoplayer2.audio.DefaultAudioSink$Configuration r0 = r5.configuration
            int r1 = r0.outputMode
            if (r1 != 0) goto Ld
            long r1 = r5.writtenPcmBytes
            int r0 = r0.outputPcmFrameSize
            long r3 = (long) r0
            long r1 = r1 / r3
            goto Lf
        Ld:
            long r1 = r5.writtenEncodedFrames
        Lf:
            return r1
    }

    private boolean initializeAudioTrack() throws com.google.android.exoplayer2.audio.AudioSink.InitializationException {
            r10 = this;
            com.google.android.exoplayer2.util.ConditionVariable r0 = r10.releasingConditionVariable
            boolean r0 = r0.isOpen()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            android.media.AudioTrack r0 = r10.buildAudioTrackWithRetry()
            r10.audioTrack = r0
            boolean r0 = isOffloadedPlayback(r0)
            if (r0 == 0) goto L2d
            android.media.AudioTrack r0 = r10.audioTrack
            r10.registerStreamEventCallbackV29(r0)
            int r0 = r10.offloadMode
            r2 = 3
            if (r0 == r2) goto L2d
            android.media.AudioTrack r0 = r10.audioTrack
            com.google.android.exoplayer2.audio.DefaultAudioSink$Configuration r2 = r10.configuration
            com.google.android.exoplayer2.Format r2 = r2.inputFormat
            int r3 = r2.encoderDelay
            int r2 = r2.encoderPadding
            r0.setOffloadDelayPadding(r3, r2)
        L2d:
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r2 = 31
            if (r0 < r2) goto L3c
            com.google.android.exoplayer2.analytics.PlayerId r2 = r10.playerId
            if (r2 == 0) goto L3c
            android.media.AudioTrack r3 = r10.audioTrack
            com.google.android.exoplayer2.audio.DefaultAudioSink.Api31.setLogSessionIdOnAudioTrack(r3, r2)
        L3c:
            android.media.AudioTrack r2 = r10.audioTrack
            int r2 = r2.getAudioSessionId()
            r10.audioSessionId = r2
            com.google.android.exoplayer2.audio.AudioTrackPositionTracker r3 = r10.audioTrackPositionTracker
            android.media.AudioTrack r4 = r10.audioTrack
            com.google.android.exoplayer2.audio.DefaultAudioSink$Configuration r2 = r10.configuration
            int r5 = r2.outputMode
            r6 = 2
            r9 = 1
            if (r5 != r6) goto L52
            r5 = 1
            goto L53
        L52:
            r5 = 0
        L53:
            int r6 = r2.outputEncoding
            int r7 = r2.outputPcmFrameSize
            int r8 = r2.bufferSize
            r3.setAudioTrack(r4, r5, r6, r7, r8)
            r10.setVolumeInternal()
            com.google.android.exoplayer2.audio.AuxEffectInfo r1 = r10.auxEffectInfo
            int r1 = r1.effectId
            if (r1 == 0) goto L73
            android.media.AudioTrack r2 = r10.audioTrack
            r2.attachAuxEffect(r1)
            android.media.AudioTrack r1 = r10.audioTrack
            com.google.android.exoplayer2.audio.AuxEffectInfo r2 = r10.auxEffectInfo
            float r2 = r2.sendLevel
            r1.setAuxEffectSendLevel(r2)
        L73:
            com.google.android.exoplayer2.audio.DefaultAudioSink$AudioDeviceInfoApi23 r1 = r10.preferredDevice
            if (r1 == 0) goto L80
            r2 = 23
            if (r0 < r2) goto L80
            android.media.AudioTrack r0 = r10.audioTrack
            com.google.android.exoplayer2.audio.DefaultAudioSink.Api23.setPreferredDeviceOnAudioTrack(r0, r1)
        L80:
            r10.startMediaTimeUsNeedsInit = r9
            return r9
    }

    private static boolean isAudioTrackDeadObject(int r2) {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 24
            if (r0 < r1) goto L9
            r0 = -6
            if (r2 == r0) goto Ld
        L9:
            r0 = -32
            if (r2 != r0) goto Lf
        Ld:
            r2 = 1
            goto L10
        Lf:
            r2 = 0
        L10:
            return r2
    }

    private boolean isAudioTrackInitialized() {
            r1 = this;
            android.media.AudioTrack r0 = r1.audioTrack
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    private static boolean isOffloadedPlayback(android.media.AudioTrack r2) {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 29
            if (r0 < r1) goto Le
            boolean r2 = r2.isOffloadedPlayback()
            if (r2 == 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    private static /* synthetic */ void lambda$releaseAudioTrackAsync$0(android.media.AudioTrack r2, com.google.android.exoplayer2.util.ConditionVariable r3) {
            r0 = 0
            r2.flush()     // Catch: java.lang.Throwable -> L21
            r2.release()     // Catch: java.lang.Throwable -> L21
            r3.open()
            java.lang.Object r2 = com.google.android.exoplayer2.audio.DefaultAudioSink.releaseExecutorLock
            monitor-enter(r2)
            int r3 = com.google.android.exoplayer2.audio.DefaultAudioSink.pendingReleaseCount     // Catch: java.lang.Throwable -> L1e
            int r3 = r3 + (-1)
            com.google.android.exoplayer2.audio.DefaultAudioSink.pendingReleaseCount = r3     // Catch: java.lang.Throwable -> L1e
            if (r3 != 0) goto L1c
            java.util.concurrent.ExecutorService r3 = com.google.android.exoplayer2.audio.DefaultAudioSink.releaseExecutor     // Catch: java.lang.Throwable -> L1e
            r3.shutdown()     // Catch: java.lang.Throwable -> L1e
            com.google.android.exoplayer2.audio.DefaultAudioSink.releaseExecutor = r0     // Catch: java.lang.Throwable -> L1e
        L1c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1e
            return
        L1e:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1e
            throw r3
        L21:
            r2 = move-exception
            r3.open()
            java.lang.Object r3 = com.google.android.exoplayer2.audio.DefaultAudioSink.releaseExecutorLock
            monitor-enter(r3)
            int r1 = com.google.android.exoplayer2.audio.DefaultAudioSink.pendingReleaseCount     // Catch: java.lang.Throwable -> L39
            int r1 = r1 + (-1)
            com.google.android.exoplayer2.audio.DefaultAudioSink.pendingReleaseCount = r1     // Catch: java.lang.Throwable -> L39
            if (r1 != 0) goto L37
            java.util.concurrent.ExecutorService r1 = com.google.android.exoplayer2.audio.DefaultAudioSink.releaseExecutor     // Catch: java.lang.Throwable -> L39
            r1.shutdown()     // Catch: java.lang.Throwable -> L39
            com.google.android.exoplayer2.audio.DefaultAudioSink.releaseExecutor = r0     // Catch: java.lang.Throwable -> L39
        L37:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L39
            throw r2
        L39:
            r2 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L39
            throw r2
    }

    private void maybeDisableOffload() {
            r1 = this;
            com.google.android.exoplayer2.audio.DefaultAudioSink$Configuration r0 = r1.configuration
            boolean r0 = r0.outputModeIsOffload()
            if (r0 != 0) goto L9
            return
        L9:
            r0 = 1
            r1.offloadDisabledUntilNextConfiguration = r0
            return
    }

    private void playPendingData() {
            r3 = this;
            boolean r0 = r3.stoppedAudioTrack
            if (r0 != 0) goto L18
            r0 = 1
            r3.stoppedAudioTrack = r0
            com.google.android.exoplayer2.audio.AudioTrackPositionTracker r0 = r3.audioTrackPositionTracker
            long r1 = r3.getWrittenFrames()
            r0.handleEndOfStream(r1)
            android.media.AudioTrack r0 = r3.audioTrack
            r0.stop()
            r0 = 0
            r3.bytesUntilNextAvSync = r0
        L18:
            return
    }

    private void processBuffers(long r6) throws com.google.android.exoplayer2.audio.AudioSink.WriteException {
            r5 = this;
            com.google.android.exoplayer2.audio.AudioProcessor[] r0 = r5.activeAudioProcessors
            int r0 = r0.length
            r1 = r0
        L4:
            if (r1 < 0) goto L42
            if (r1 <= 0) goto Lf
            java.nio.ByteBuffer[] r2 = r5.outputBuffers
            int r3 = r1 + (-1)
            r2 = r2[r3]
            goto L16
        Lf:
            java.nio.ByteBuffer r2 = r5.inputBuffer
            if (r2 == 0) goto L14
            goto L16
        L14:
            java.nio.ByteBuffer r2 = com.google.android.exoplayer2.audio.AudioProcessor.EMPTY_BUFFER
        L16:
            if (r1 != r0) goto L1c
            r5.writeBuffer(r2, r6)
            goto L38
        L1c:
            com.google.android.exoplayer2.audio.AudioProcessor[] r3 = r5.activeAudioProcessors
            r3 = r3[r1]
            int r4 = r5.drainingAudioProcessorIndex
            if (r1 <= r4) goto L27
            r3.queueInput(r2)
        L27:
            java.nio.ByteBuffer r3 = r3.getOutput()
            java.nio.ByteBuffer[] r4 = r5.outputBuffers
            r4[r1] = r3
            boolean r3 = r3.hasRemaining()
            if (r3 == 0) goto L38
            int r1 = r1 + 1
            goto L4
        L38:
            boolean r2 = r2.hasRemaining()
            if (r2 == 0) goto L3f
            return
        L3f:
            int r1 = r1 + (-1)
            goto L4
        L42:
            return
    }

    @androidx.annotation.RequiresApi(29)
    private void registerStreamEventCallbackV29(android.media.AudioTrack r2) {
            r1 = this;
            com.google.android.exoplayer2.audio.DefaultAudioSink$StreamEventCallbackV29 r0 = r1.offloadStreamEventCallbackV29
            if (r0 != 0) goto Lb
            com.google.android.exoplayer2.audio.DefaultAudioSink$StreamEventCallbackV29 r0 = new com.google.android.exoplayer2.audio.DefaultAudioSink$StreamEventCallbackV29
            r0.<init>(r1)
            r1.offloadStreamEventCallbackV29 = r0
        Lb:
            com.google.android.exoplayer2.audio.DefaultAudioSink$StreamEventCallbackV29 r0 = r1.offloadStreamEventCallbackV29
            r0.register(r2)
            return
    }

    private static void releaseAudioTrackAsync(android.media.AudioTrack r4, com.google.android.exoplayer2.util.ConditionVariable r5) {
            r5.close()
            java.lang.Object r0 = com.google.android.exoplayer2.audio.DefaultAudioSink.releaseExecutorLock
            monitor-enter(r0)
            java.util.concurrent.ExecutorService r1 = com.google.android.exoplayer2.audio.DefaultAudioSink.releaseExecutor     // Catch: java.lang.Throwable -> L26
            if (r1 != 0) goto L12
            java.lang.String r1 = "ExoPlayer:AudioTrackReleaseThread"
            java.util.concurrent.ExecutorService r1 = com.google.android.exoplayer2.util.Util.newSingleThreadExecutor(r1)     // Catch: java.lang.Throwable -> L26
            com.google.android.exoplayer2.audio.DefaultAudioSink.releaseExecutor = r1     // Catch: java.lang.Throwable -> L26
        L12:
            int r1 = com.google.android.exoplayer2.audio.DefaultAudioSink.pendingReleaseCount     // Catch: java.lang.Throwable -> L26
            int r1 = r1 + 1
            com.google.android.exoplayer2.audio.DefaultAudioSink.pendingReleaseCount = r1     // Catch: java.lang.Throwable -> L26
            java.util.concurrent.ExecutorService r1 = com.google.android.exoplayer2.audio.DefaultAudioSink.releaseExecutor     // Catch: java.lang.Throwable -> L26
            com.google.android.exoplayer2.util.Util$$ExternalSyntheticLambda0 r2 = new com.google.android.exoplayer2.util.Util$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L26
            r3 = 8
            r2.<init>(r4, r5, r3)     // Catch: java.lang.Throwable -> L26
            r1.execute(r2)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            return
        L26:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            throw r4
    }

    private void resetSinkStateForFlush() {
            r12 = this;
            r0 = 0
            r12.submittedPcmBytes = r0
            r12.submittedEncodedFrames = r0
            r12.writtenPcmBytes = r0
            r12.writtenEncodedFrames = r0
            r2 = 0
            r12.isWaitingForOffloadEndOfStreamHandled = r2
            r12.framesPerEncodedSample = r2
            com.google.android.exoplayer2.audio.DefaultAudioSink$MediaPositionParameters r11 = new com.google.android.exoplayer2.audio.DefaultAudioSink$MediaPositionParameters
            com.google.android.exoplayer2.PlaybackParameters r4 = r12.getAudioProcessorPlaybackParameters()
            boolean r5 = r12.getSkipSilenceEnabled()
            r6 = 0
            r8 = 0
            r10 = 0
            r3 = r11
            r3.<init>(r4, r5, r6, r8, r10)
            r12.mediaPositionParameters = r11
            r12.startMediaTimeUs = r0
            r0 = 0
            r12.afterDrainParameters = r0
            java.util.ArrayDeque<com.google.android.exoplayer2.audio.DefaultAudioSink$MediaPositionParameters> r1 = r12.mediaPositionParametersCheckpoints
            r1.clear()
            r12.inputBuffer = r0
            r12.inputBufferAccessUnitCount = r2
            r12.outputBuffer = r0
            r12.stoppedAudioTrack = r2
            r12.handledEndOfStream = r2
            r1 = -1
            r12.drainingAudioProcessorIndex = r1
            r12.avSyncHeader = r0
            r12.bytesUntilNextAvSync = r2
            com.google.android.exoplayer2.audio.TrimmingAudioProcessor r0 = r12.trimmingAudioProcessor
            r0.resetTrimmedFrameCount()
            r12.flushAudioProcessors()
            return
    }

    private void setAudioProcessorPlaybackParametersAndSkipSilence(com.google.android.exoplayer2.PlaybackParameters r10, boolean r11) {
            r9 = this;
            com.google.android.exoplayer2.audio.DefaultAudioSink$MediaPositionParameters r0 = r9.getMediaPositionParameters()
            com.google.android.exoplayer2.PlaybackParameters r1 = r0.playbackParameters
            boolean r1 = r10.equals(r1)
            if (r1 == 0) goto L10
            boolean r0 = r0.skipSilence
            if (r11 == r0) goto L2e
        L10:
            com.google.android.exoplayer2.audio.DefaultAudioSink$MediaPositionParameters r0 = new com.google.android.exoplayer2.audio.DefaultAudioSink$MediaPositionParameters
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = 0
            r1 = r0
            r2 = r10
            r3 = r11
            r1.<init>(r2, r3, r4, r6, r8)
            boolean r10 = r9.isAudioTrackInitialized()
            if (r10 == 0) goto L2c
            r9.afterDrainParameters = r0
            goto L2e
        L2c:
            r9.mediaPositionParameters = r0
        L2e:
            return
    }

    @androidx.annotation.RequiresApi(23)
    private void setAudioTrackPlaybackParametersV23(com.google.android.exoplayer2.PlaybackParameters r3) {
            r2 = this;
            boolean r0 = r2.isAudioTrackInitialized()
            if (r0 == 0) goto L4e
            android.media.PlaybackParams r0 = new android.media.PlaybackParams
            r0.<init>()
            android.media.PlaybackParams r0 = r0.allowDefaults()
            float r1 = r3.speed
            android.media.PlaybackParams r0 = r0.setSpeed(r1)
            float r3 = r3.pitch
            android.media.PlaybackParams r3 = r0.setPitch(r3)
            r0 = 2
            android.media.PlaybackParams r3 = r3.setAudioFallbackMode(r0)
            android.media.AudioTrack r0 = r2.audioTrack     // Catch: java.lang.IllegalArgumentException -> L26
            r0.setPlaybackParams(r3)     // Catch: java.lang.IllegalArgumentException -> L26
            goto L2e
        L26:
            r3 = move-exception
            java.lang.String r0 = "DefaultAudioSink"
            java.lang.String r1 = "Failed to set playback params"
            com.google.android.exoplayer2.util.Log.w(r0, r1, r3)
        L2e:
            com.google.android.exoplayer2.PlaybackParameters r3 = new com.google.android.exoplayer2.PlaybackParameters
            android.media.AudioTrack r0 = r2.audioTrack
            android.media.PlaybackParams r0 = r0.getPlaybackParams()
            float r0 = r0.getSpeed()
            android.media.AudioTrack r1 = r2.audioTrack
            android.media.PlaybackParams r1 = r1.getPlaybackParams()
            float r1 = r1.getPitch()
            r3.<init>(r0, r1)
            com.google.android.exoplayer2.audio.AudioTrackPositionTracker r0 = r2.audioTrackPositionTracker
            float r1 = r3.speed
            r0.setAudioTrackPlaybackSpeed(r1)
        L4e:
            r2.audioTrackPlaybackParameters = r3
            return
    }

    private void setVolumeInternal() {
            r2 = this;
            boolean r0 = r2.isAudioTrackInitialized()
            if (r0 != 0) goto L7
            goto L1c
        L7:
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 21
            if (r0 < r1) goto L15
            android.media.AudioTrack r0 = r2.audioTrack
            float r1 = r2.volume
            setVolumeInternalV21(r0, r1)
            goto L1c
        L15:
            android.media.AudioTrack r0 = r2.audioTrack
            float r1 = r2.volume
            setVolumeInternalV3(r0, r1)
        L1c:
            return
    }

    @androidx.annotation.RequiresApi(21)
    private static void setVolumeInternalV21(android.media.AudioTrack r0, float r1) {
            r0.setVolume(r1)
            return
    }

    private static void setVolumeInternalV3(android.media.AudioTrack r0, float r1) {
            r0.setStereoVolume(r1, r1)
            return
    }

    private void setupAudioProcessors() {
            r6 = this;
            com.google.android.exoplayer2.audio.DefaultAudioSink$Configuration r0 = r6.configuration
            com.google.android.exoplayer2.audio.AudioProcessor[] r0 = r0.availableAudioProcessors
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r0.length
            r3 = 0
        Lb:
            if (r3 >= r2) goto L1f
            r4 = r0[r3]
            boolean r5 = r4.isActive()
            if (r5 == 0) goto L19
            r1.add(r4)
            goto L1c
        L19:
            r4.flush()
        L1c:
            int r3 = r3 + 1
            goto Lb
        L1f:
            int r0 = r1.size()
            com.google.android.exoplayer2.audio.AudioProcessor[] r2 = new com.google.android.exoplayer2.audio.AudioProcessor[r0]
            java.lang.Object[] r1 = r1.toArray(r2)
            com.google.android.exoplayer2.audio.AudioProcessor[] r1 = (com.google.android.exoplayer2.audio.AudioProcessor[]) r1
            r6.activeAudioProcessors = r1
            java.nio.ByteBuffer[] r0 = new java.nio.ByteBuffer[r0]
            r6.outputBuffers = r0
            r6.flushAudioProcessors()
            return
    }

    private boolean shouldApplyAudioProcessorPlaybackParameters() {
            r2 = this;
            boolean r0 = r2.tunneling
            if (r0 != 0) goto L20
            com.google.android.exoplayer2.audio.DefaultAudioSink$Configuration r0 = r2.configuration
            com.google.android.exoplayer2.Format r0 = r0.inputFormat
            java.lang.String r0 = r0.sampleMimeType
            java.lang.String r1 = "audio/raw"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L20
            com.google.android.exoplayer2.audio.DefaultAudioSink$Configuration r0 = r2.configuration
            com.google.android.exoplayer2.Format r0 = r0.inputFormat
            int r0 = r0.pcmEncoding
            boolean r0 = r2.shouldUseFloatOutput(r0)
            if (r0 != 0) goto L20
            r0 = 1
            goto L21
        L20:
            r0 = 0
        L21:
            return r0
    }

    private boolean shouldUseFloatOutput(int r2) {
            r1 = this;
            boolean r0 = r1.enableFloatOutput
            if (r0 == 0) goto Lc
            boolean r2 = com.google.android.exoplayer2.util.Util.isEncodingHighResolutionPcm(r2)
            if (r2 == 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    private boolean useOffloadedPlayback(com.google.android.exoplayer2.Format r5, com.google.android.exoplayer2.audio.AudioAttributes r6) {
            r4 = this;
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 0
            r2 = 29
            if (r0 < r2) goto L5d
            int r0 = r4.offloadMode
            if (r0 != 0) goto Lc
            goto L5d
        Lc:
            java.lang.String r0 = r5.sampleMimeType
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = r5.codecs
            int r0 = com.google.android.exoplayer2.util.MimeTypes.getEncoding(r0, r2)
            if (r0 != 0) goto L1d
            return r1
        L1d:
            int r2 = r5.channelCount
            int r2 = com.google.android.exoplayer2.util.Util.getAudioTrackChannelConfig(r2)
            if (r2 != 0) goto L26
            return r1
        L26:
            int r3 = r5.sampleRate
            android.media.AudioFormat r0 = getAudioFormat(r3, r2, r0)
            com.google.android.exoplayer2.audio.AudioAttributes$AudioAttributesV21 r6 = r6.getAudioAttributesV21()
            android.media.AudioAttributes r6 = r6.audioAttributes
            int r6 = r4.getOffloadedPlaybackSupport(r0, r6)
            if (r6 == 0) goto L5d
            r0 = 1
            if (r6 == r0) goto L45
            r5 = 2
            if (r6 != r5) goto L3f
            return r0
        L3f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>()
            throw r5
        L45:
            int r6 = r5.encoderDelay
            if (r6 != 0) goto L50
            int r5 = r5.encoderPadding
            if (r5 == 0) goto L4e
            goto L50
        L4e:
            r5 = 0
            goto L51
        L50:
            r5 = 1
        L51:
            int r6 = r4.offloadMode
            if (r6 != r0) goto L57
            r6 = 1
            goto L58
        L57:
            r6 = 0
        L58:
            if (r5 == 0) goto L5c
            if (r6 != 0) goto L5d
        L5c:
            r1 = 1
        L5d:
            return r1
    }

    private void writeBuffer(java.nio.ByteBuffer r13, long r14) throws com.google.android.exoplayer2.audio.AudioSink.WriteException {
            r12 = this;
            boolean r0 = r13.hasRemaining()
            if (r0 != 0) goto L7
            return
        L7:
            java.nio.ByteBuffer r0 = r12.outputBuffer
            r1 = 21
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L18
            if (r0 != r13) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            goto L3b
        L18:
            r12.outputBuffer = r13
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            if (r0 >= r1) goto L3b
            int r0 = r13.remaining()
            byte[] r4 = r12.preV21OutputBuffer
            if (r4 == 0) goto L29
            int r4 = r4.length
            if (r4 >= r0) goto L2d
        L29:
            byte[] r4 = new byte[r0]
            r12.preV21OutputBuffer = r4
        L2d:
            int r4 = r13.position()
            byte[] r5 = r12.preV21OutputBuffer
            r13.get(r5, r3, r0)
            r13.position(r4)
            r12.preV21OutputBufferOffset = r3
        L3b:
            int r0 = r13.remaining()
            int r4 = com.google.android.exoplayer2.util.Util.SDK_INT
            if (r4 >= r1) goto L6d
            com.google.android.exoplayer2.audio.AudioTrackPositionTracker r14 = r12.audioTrackPositionTracker
            long r4 = r12.writtenPcmBytes
            int r14 = r14.getAvailableBufferSize(r4)
            if (r14 <= 0) goto L6b
            int r14 = java.lang.Math.min(r0, r14)
            android.media.AudioTrack r15 = r12.audioTrack
            byte[] r1 = r12.preV21OutputBuffer
            int r4 = r12.preV21OutputBufferOffset
            int r14 = r15.write(r1, r4, r14)
            if (r14 <= 0) goto L91
            int r15 = r12.preV21OutputBufferOffset
            int r15 = r15 + r14
            r12.preV21OutputBufferOffset = r15
            int r15 = r13.position()
            int r15 = r15 + r14
            r13.position(r15)
            goto L91
        L6b:
            r14 = 0
            goto L91
        L6d:
            boolean r1 = r12.tunneling
            if (r1 == 0) goto L8b
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r1 == 0) goto L7c
            r1 = 1
            goto L7d
        L7c:
            r1 = 0
        L7d:
            com.google.android.exoplayer2.util.Assertions.checkState(r1)
            android.media.AudioTrack r7 = r12.audioTrack
            r6 = r12
            r8 = r13
            r9 = r0
            r10 = r14
            int r14 = r6.writeNonBlockingWithAvSyncV21(r7, r8, r9, r10)
            goto L91
        L8b:
            android.media.AudioTrack r14 = r12.audioTrack
            int r14 = writeNonBlockingV21(r14, r13, r0)
        L91:
            long r4 = android.os.SystemClock.elapsedRealtime()
            r12.lastFeedElapsedRealtimeMs = r4
            r4 = 0
            if (r14 >= 0) goto Lc4
            boolean r13 = isAudioTrackDeadObject(r14)
            if (r13 == 0) goto La8
            long r0 = r12.writtenEncodedFrames
            int r13 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r13 <= 0) goto La8
            goto La9
        La8:
            r2 = 0
        La9:
            com.google.android.exoplayer2.audio.AudioSink$WriteException r13 = new com.google.android.exoplayer2.audio.AudioSink$WriteException
            com.google.android.exoplayer2.audio.DefaultAudioSink$Configuration r15 = r12.configuration
            com.google.android.exoplayer2.Format r15 = r15.inputFormat
            r13.<init>(r14, r15, r2)
            com.google.android.exoplayer2.audio.AudioSink$Listener r14 = r12.listener
            if (r14 == 0) goto Lb9
            r14.onAudioSinkError(r13)
        Lb9:
            boolean r14 = r13.isRecoverable
            if (r14 != 0) goto Lc3
            com.google.android.exoplayer2.audio.DefaultAudioSink$PendingExceptionHolder<com.google.android.exoplayer2.audio.AudioSink$WriteException> r14 = r12.writeExceptionPendingExceptionHolder
            r14.throwExceptionIfDeadlineIsReached(r13)
            return
        Lc3:
            throw r13
        Lc4:
            com.google.android.exoplayer2.audio.DefaultAudioSink$PendingExceptionHolder<com.google.android.exoplayer2.audio.AudioSink$WriteException> r15 = r12.writeExceptionPendingExceptionHolder
            r15.clear()
            android.media.AudioTrack r15 = r12.audioTrack
            boolean r15 = isOffloadedPlayback(r15)
            if (r15 == 0) goto Lea
            long r6 = r12.writtenEncodedFrames
            int r15 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r15 <= 0) goto Ld9
            r12.isWaitingForOffloadEndOfStreamHandled = r3
        Ld9:
            boolean r15 = r12.playing
            if (r15 == 0) goto Lea
            com.google.android.exoplayer2.audio.AudioSink$Listener r15 = r12.listener
            if (r15 == 0) goto Lea
            if (r14 >= r0) goto Lea
            boolean r1 = r12.isWaitingForOffloadEndOfStreamHandled
            if (r1 != 0) goto Lea
            r15.onOffloadBufferFull()
        Lea:
            com.google.android.exoplayer2.audio.DefaultAudioSink$Configuration r15 = r12.configuration
            int r15 = r15.outputMode
            if (r15 != 0) goto Lf6
            long r4 = r12.writtenPcmBytes
            long r6 = (long) r14
            long r4 = r4 + r6
            r12.writtenPcmBytes = r4
        Lf6:
            if (r14 != r0) goto L113
            if (r15 == 0) goto L110
            java.nio.ByteBuffer r14 = r12.inputBuffer
            if (r13 != r14) goto Lff
            goto L100
        Lff:
            r2 = 0
        L100:
            com.google.android.exoplayer2.util.Assertions.checkState(r2)
            long r13 = r12.writtenEncodedFrames
            int r15 = r12.framesPerEncodedSample
            long r0 = (long) r15
            int r15 = r12.inputBufferAccessUnitCount
            long r2 = (long) r15
            long r0 = r0 * r2
            long r0 = r0 + r13
            r12.writtenEncodedFrames = r0
        L110:
            r13 = 0
            r12.outputBuffer = r13
        L113:
            return
    }

    @androidx.annotation.RequiresApi(21)
    private static int writeNonBlockingV21(android.media.AudioTrack r1, java.nio.ByteBuffer r2, int r3) {
            r0 = 1
            int r1 = r1.write(r2, r3, r0)
            return r1
    }

    @androidx.annotation.RequiresApi(21)
    private int writeNonBlockingWithAvSyncV21(android.media.AudioTrack r11, java.nio.ByteBuffer r12, int r13, long r14) {
            r10 = this;
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 1000(0x3e8, double:4.94E-321)
            r3 = 26
            if (r0 < r3) goto L13
            r7 = 1
            long r8 = r14 * r1
            r4 = r11
            r5 = r12
            r6 = r13
            int r11 = r4.write(r5, r6, r7, r8)
            return r11
        L13:
            java.nio.ByteBuffer r0 = r10.avSyncHeader
            if (r0 != 0) goto L2c
            r0 = 16
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r10.avSyncHeader = r0
            java.nio.ByteOrder r3 = java.nio.ByteOrder.BIG_ENDIAN
            r0.order(r3)
            java.nio.ByteBuffer r0 = r10.avSyncHeader
            r3 = 1431633921(0x55550001, float:1.463725E13)
            r0.putInt(r3)
        L2c:
            int r0 = r10.bytesUntilNextAvSync
            r3 = 0
            if (r0 != 0) goto L47
            java.nio.ByteBuffer r0 = r10.avSyncHeader
            r4 = 4
            r0.putInt(r4, r13)
            java.nio.ByteBuffer r0 = r10.avSyncHeader
            r4 = 8
            long r14 = r14 * r1
            r0.putLong(r4, r14)
            java.nio.ByteBuffer r14 = r10.avSyncHeader
            r14.position(r3)
            r10.bytesUntilNextAvSync = r13
        L47:
            java.nio.ByteBuffer r14 = r10.avSyncHeader
            int r14 = r14.remaining()
            if (r14 <= 0) goto L5e
            java.nio.ByteBuffer r15 = r10.avSyncHeader
            r0 = 1
            int r15 = r11.write(r15, r14, r0)
            if (r15 >= 0) goto L5b
            r10.bytesUntilNextAvSync = r3
            return r15
        L5b:
            if (r15 >= r14) goto L5e
            return r3
        L5e:
            int r11 = writeNonBlockingV21(r11, r12, r13)
            if (r11 >= 0) goto L67
            r10.bytesUntilNextAvSync = r3
            return r11
        L67:
            int r12 = r10.bytesUntilNextAvSync
            int r12 = r12 - r11
            r10.bytesUntilNextAvSync = r12
            return r11
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void configure(com.google.android.exoplayer2.Format r24, int r25, @androidx.annotation.Nullable int[] r26) throws com.google.android.exoplayer2.audio.AudioSink.ConfigurationException {
            r23 = this;
            r1 = r23
            r3 = r24
            java.lang.String r0 = r3.sampleMimeType
            java.lang.String r2 = "audio/raw"
            boolean r0 = r2.equals(r0)
            r2 = -1
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L96
            int r0 = r3.pcmEncoding
            boolean r0 = com.google.android.exoplayer2.util.Util.isEncodingLinearPcm(r0)
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            int r0 = r3.pcmEncoding
            int r6 = r3.channelCount
            int r0 = com.google.android.exoplayer2.util.Util.getPcmFrameSize(r0, r6)
            int r6 = r3.pcmEncoding
            boolean r6 = r1.shouldUseFloatOutput(r6)
            if (r6 == 0) goto L2d
            com.google.android.exoplayer2.audio.AudioProcessor[] r6 = r1.toFloatPcmAvailableAudioProcessors
            goto L2f
        L2d:
            com.google.android.exoplayer2.audio.AudioProcessor[] r6 = r1.toIntPcmAvailableAudioProcessors
        L2f:
            com.google.android.exoplayer2.audio.TrimmingAudioProcessor r7 = r1.trimmingAudioProcessor
            int r8 = r3.encoderDelay
            int r9 = r3.encoderPadding
            r7.setTrimFrameCount(r8, r9)
            int r7 = com.google.android.exoplayer2.util.Util.SDK_INT
            r8 = 21
            if (r7 >= r8) goto L51
            int r7 = r3.channelCount
            r8 = 8
            if (r7 != r8) goto L51
            if (r26 != 0) goto L51
            r7 = 6
            int[] r8 = new int[r7]
            r9 = 0
        L4a:
            if (r9 >= r7) goto L53
            r8[r9] = r9
            int r9 = r9 + 1
            goto L4a
        L51:
            r8 = r26
        L53:
            com.google.android.exoplayer2.audio.ChannelMappingAudioProcessor r7 = r1.channelMappingAudioProcessor
            r7.setChannelMap(r8)
            com.google.android.exoplayer2.audio.AudioProcessor$AudioFormat r7 = new com.google.android.exoplayer2.audio.AudioProcessor$AudioFormat
            int r8 = r3.sampleRate
            int r9 = r3.channelCount
            int r10 = r3.pcmEncoding
            r7.<init>(r8, r9, r10)
            int r8 = r6.length
            r9 = 0
        L65:
            if (r9 >= r8) goto L7e
            r10 = r6[r9]
            com.google.android.exoplayer2.audio.AudioProcessor$AudioFormat r11 = r10.configure(r7)     // Catch: com.google.android.exoplayer2.audio.AudioProcessor.UnhandledAudioFormatException -> L77
            boolean r10 = r10.isActive()     // Catch: com.google.android.exoplayer2.audio.AudioProcessor.UnhandledAudioFormatException -> L77
            if (r10 == 0) goto L74
            r7 = r11
        L74:
            int r9 = r9 + 1
            goto L65
        L77:
            r0 = move-exception
            com.google.android.exoplayer2.audio.AudioSink$ConfigurationException r2 = new com.google.android.exoplayer2.audio.AudioSink$ConfigurationException
            r2.<init>(r0, r3)
            throw r2
        L7e:
            int r8 = r7.encoding
            int r9 = r7.sampleRate
            int r10 = r7.channelCount
            int r10 = com.google.android.exoplayer2.util.Util.getAudioTrackChannelConfig(r10)
            int r7 = r7.channelCount
            int r7 = com.google.android.exoplayer2.util.Util.getPcmFrameSize(r8, r7)
            r16 = r6
            r13 = r7
            r11 = r8
            r14 = r9
            r12 = r10
            r15 = 0
            goto Le0
        L96:
            com.google.android.exoplayer2.audio.AudioProcessor[] r0 = new com.google.android.exoplayer2.audio.AudioProcessor[r5]
            int r6 = r3.sampleRate
            com.google.android.exoplayer2.audio.AudioAttributes r7 = r1.audioAttributes
            boolean r7 = r1.useOffloadedPlayback(r3, r7)
            if (r7 == 0) goto Lbf
            java.lang.String r7 = r3.sampleMimeType
            java.lang.Object r7 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r7)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = r3.codecs
            int r7 = com.google.android.exoplayer2.util.MimeTypes.getEncoding(r7, r8)
            int r8 = r3.channelCount
            int r8 = com.google.android.exoplayer2.util.Util.getAudioTrackChannelConfig(r8)
            r16 = r0
            r14 = r6
            r11 = r7
            r12 = r8
            r0 = -1
            r13 = -1
            r15 = 1
            goto Le0
        Lbf:
            r7 = 2
            com.google.android.exoplayer2.audio.AudioCapabilities r8 = r1.audioCapabilities
            android.util.Pair r8 = r8.getEncodingAndChannelConfigForPassthrough(r3)
            if (r8 == 0) goto L17a
            java.lang.Object r9 = r8.first
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            java.lang.Object r8 = r8.second
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r16 = r0
            r14 = r6
            r12 = r8
            r11 = r9
            r0 = -1
            r13 = -1
            r15 = 2
        Le0:
            java.lang.String r6 = ") for: "
            if (r11 == 0) goto L15d
            if (r12 == 0) goto L140
            if (r25 == 0) goto Lf3
            r10 = r25
            r19 = r11
            r20 = r12
            r22 = r13
            r21 = r14
            goto L11e
        Lf3:
            com.google.android.exoplayer2.audio.DefaultAudioSink$AudioTrackBufferSizeProvider r6 = r1.audioTrackBufferSizeProvider
            int r7 = getAudioTrackMinBufferSize(r14, r12, r11)
            if (r13 == r2) goto Lfd
            r10 = r13
            goto Lfe
        Lfd:
            r10 = 1
        Lfe:
            int r2 = r3.bitrate
            boolean r4 = r1.enableAudioTrackPlaybackParams
            if (r4 == 0) goto L107
            r8 = 4620693217682128896(0x4020000000000000, double:8.0)
            goto L109
        L107:
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L109:
            r17 = r8
            r8 = r11
            r9 = r15
            r19 = r11
            r11 = r14
            r20 = r12
            r12 = r2
            r22 = r13
            r21 = r14
            r13 = r17
            int r2 = r6.getBufferSizeInBytes(r7, r8, r9, r10, r11, r12, r13)
            r10 = r2
        L11e:
            r1.offloadDisabledUntilNextConfiguration = r5
            com.google.android.exoplayer2.audio.DefaultAudioSink$Configuration r12 = new com.google.android.exoplayer2.audio.DefaultAudioSink$Configuration
            r2 = r12
            r3 = r24
            r4 = r0
            r5 = r15
            r6 = r22
            r7 = r21
            r8 = r20
            r9 = r19
            r11 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = r23.isAudioTrackInitialized()
            if (r0 == 0) goto L13d
            r1.pendingConfiguration = r12
            goto L13f
        L13d:
            r1.configuration = r12
        L13f:
            return
        L140:
            com.google.android.exoplayer2.audio.AudioSink$ConfigurationException r0 = new com.google.android.exoplayer2.audio.AudioSink$ConfigurationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Invalid output channel config (mode="
            r2.append(r4)
            r2.append(r15)
            r2.append(r6)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2, r3)
            throw r0
        L15d:
            com.google.android.exoplayer2.audio.AudioSink$ConfigurationException r0 = new com.google.android.exoplayer2.audio.AudioSink$ConfigurationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Invalid output encoding (mode="
            r2.append(r4)
            r2.append(r15)
            r2.append(r6)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2, r3)
            throw r0
        L17a:
            com.google.android.exoplayer2.audio.AudioSink$ConfigurationException r0 = new com.google.android.exoplayer2.audio.AudioSink$ConfigurationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Unable to configure passthrough for: "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2, r3)
            throw r0
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void disableTunneling() {
            r1 = this;
            boolean r0 = r1.tunneling
            if (r0 == 0) goto La
            r0 = 0
            r1.tunneling = r0
            r1.flush()
        La:
            return
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void enableTunnelingV21() {
            r3 = this;
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 1
            r2 = 21
            if (r0 < r2) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            boolean r0 = r3.externalAudioSessionIdProvided
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            boolean r0 = r3.tunneling
            if (r0 != 0) goto L1b
            r3.tunneling = r1
            r3.flush()
        L1b:
            return
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void experimentalFlushWithoutAudioTrackRelease() {
            r8 = this;
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 25
            if (r0 >= r1) goto La
            r8.flush()
            return
        La:
            com.google.android.exoplayer2.audio.DefaultAudioSink$PendingExceptionHolder<com.google.android.exoplayer2.audio.AudioSink$WriteException> r0 = r8.writeExceptionPendingExceptionHolder
            r0.clear()
            com.google.android.exoplayer2.audio.DefaultAudioSink$PendingExceptionHolder<com.google.android.exoplayer2.audio.AudioSink$InitializationException> r0 = r8.initializationExceptionPendingExceptionHolder
            r0.clear()
            boolean r0 = r8.isAudioTrackInitialized()
            if (r0 != 0) goto L1b
            return
        L1b:
            r8.resetSinkStateForFlush()
            com.google.android.exoplayer2.audio.AudioTrackPositionTracker r0 = r8.audioTrackPositionTracker
            boolean r0 = r0.isPlaying()
            if (r0 == 0) goto L2b
            android.media.AudioTrack r0 = r8.audioTrack
            r0.pause()
        L2b:
            android.media.AudioTrack r0 = r8.audioTrack
            r0.flush()
            com.google.android.exoplayer2.audio.AudioTrackPositionTracker r0 = r8.audioTrackPositionTracker
            r0.reset()
            com.google.android.exoplayer2.audio.AudioTrackPositionTracker r1 = r8.audioTrackPositionTracker
            android.media.AudioTrack r2 = r8.audioTrack
            com.google.android.exoplayer2.audio.DefaultAudioSink$Configuration r0 = r8.configuration
            int r3 = r0.outputMode
            r4 = 2
            r7 = 1
            if (r3 != r4) goto L43
            r3 = 1
            goto L44
        L43:
            r3 = 0
        L44:
            int r4 = r0.outputEncoding
            int r5 = r0.outputPcmFrameSize
            int r6 = r0.bufferSize
            r1.setAudioTrack(r2, r3, r4, r5, r6)
            r8.startMediaTimeUsNeedsInit = r7
            return
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void flush() {
            r3 = this;
            boolean r0 = r3.isAudioTrackInitialized()
            if (r0 == 0) goto L4f
            r3.resetSinkStateForFlush()
            com.google.android.exoplayer2.audio.AudioTrackPositionTracker r0 = r3.audioTrackPositionTracker
            boolean r0 = r0.isPlaying()
            if (r0 == 0) goto L16
            android.media.AudioTrack r0 = r3.audioTrack
            r0.pause()
        L16:
            android.media.AudioTrack r0 = r3.audioTrack
            boolean r0 = isOffloadedPlayback(r0)
            if (r0 == 0) goto L2b
            com.google.android.exoplayer2.audio.DefaultAudioSink$StreamEventCallbackV29 r0 = r3.offloadStreamEventCallbackV29
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.audio.DefaultAudioSink$StreamEventCallbackV29 r0 = (com.google.android.exoplayer2.audio.DefaultAudioSink.StreamEventCallbackV29) r0
            android.media.AudioTrack r1 = r3.audioTrack
            r0.unregister(r1)
        L2b:
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 21
            if (r0 >= r1) goto L38
            boolean r0 = r3.externalAudioSessionIdProvided
            if (r0 != 0) goto L38
            r0 = 0
            r3.audioSessionId = r0
        L38:
            com.google.android.exoplayer2.audio.DefaultAudioSink$Configuration r0 = r3.pendingConfiguration
            r1 = 0
            if (r0 == 0) goto L41
            r3.configuration = r0
            r3.pendingConfiguration = r1
        L41:
            com.google.android.exoplayer2.audio.AudioTrackPositionTracker r0 = r3.audioTrackPositionTracker
            r0.reset()
            android.media.AudioTrack r0 = r3.audioTrack
            com.google.android.exoplayer2.util.ConditionVariable r2 = r3.releasingConditionVariable
            releaseAudioTrackAsync(r0, r2)
            r3.audioTrack = r1
        L4f:
            com.google.android.exoplayer2.audio.DefaultAudioSink$PendingExceptionHolder<com.google.android.exoplayer2.audio.AudioSink$WriteException> r0 = r3.writeExceptionPendingExceptionHolder
            r0.clear()
            com.google.android.exoplayer2.audio.DefaultAudioSink$PendingExceptionHolder<com.google.android.exoplayer2.audio.AudioSink$InitializationException> r0 = r3.initializationExceptionPendingExceptionHolder
            r0.clear()
            return
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public com.google.android.exoplayer2.audio.AudioAttributes getAudioAttributes() {
            r1 = this;
            com.google.android.exoplayer2.audio.AudioAttributes r0 = r1.audioAttributes
            return r0
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public long getCurrentPositionUs(boolean r5) {
            r4 = this;
            boolean r0 = r4.isAudioTrackInitialized()
            if (r0 == 0) goto L28
            boolean r0 = r4.startMediaTimeUsNeedsInit
            if (r0 == 0) goto Lb
            goto L28
        Lb:
            com.google.android.exoplayer2.audio.AudioTrackPositionTracker r0 = r4.audioTrackPositionTracker
            long r0 = r0.getCurrentPositionUs(r5)
            com.google.android.exoplayer2.audio.DefaultAudioSink$Configuration r5 = r4.configuration
            long r2 = r4.getWrittenFrames()
            long r2 = r5.framesToDurationUs(r2)
            long r0 = java.lang.Math.min(r0, r2)
            long r0 = r4.applyMediaPositionParameters(r0)
            long r0 = r4.applySkipping(r0)
            return r0
        L28:
            r0 = -9223372036854775808
            return r0
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public int getFormatSupport(com.google.android.exoplayer2.Format r4) {
            r3 = this;
            java.lang.String r0 = r4.sampleMimeType
            java.lang.String r1 = "audio/raw"
            boolean r0 = r1.equals(r0)
            r1 = 0
            r2 = 2
            if (r0 == 0) goto L38
            int r0 = r4.pcmEncoding
            boolean r0 = com.google.android.exoplayer2.util.Util.isEncodingLinearPcm(r0)
            if (r0 != 0) goto L29
            java.lang.String r0 = "Invalid PCM encoding: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            int r4 = r4.pcmEncoding
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "DefaultAudioSink"
            com.google.android.exoplayer2.util.Log.w(r0, r4)
            return r1
        L29:
            int r4 = r4.pcmEncoding
            if (r4 == r2) goto L37
            boolean r0 = r3.enableFloatOutput
            if (r0 == 0) goto L35
            r0 = 4
            if (r4 != r0) goto L35
            goto L37
        L35:
            r4 = 1
            return r4
        L37:
            return r2
        L38:
            boolean r0 = r3.offloadDisabledUntilNextConfiguration
            if (r0 != 0) goto L45
            com.google.android.exoplayer2.audio.AudioAttributes r0 = r3.audioAttributes
            boolean r0 = r3.useOffloadedPlayback(r4, r0)
            if (r0 == 0) goto L45
            return r2
        L45:
            com.google.android.exoplayer2.audio.AudioCapabilities r0 = r3.audioCapabilities
            boolean r4 = r0.isPassthroughPlaybackSupported(r4)
            if (r4 == 0) goto L4e
            return r2
        L4e:
            return r1
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public com.google.android.exoplayer2.PlaybackParameters getPlaybackParameters() {
            r1 = this;
            boolean r0 = r1.enableAudioTrackPlaybackParams
            if (r0 == 0) goto L7
            com.google.android.exoplayer2.PlaybackParameters r0 = r1.audioTrackPlaybackParameters
            goto Lb
        L7:
            com.google.android.exoplayer2.PlaybackParameters r0 = r1.getAudioProcessorPlaybackParameters()
        Lb:
            return r0
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean getSkipSilenceEnabled() {
            r1 = this;
            com.google.android.exoplayer2.audio.DefaultAudioSink$MediaPositionParameters r0 = r1.getMediaPositionParameters()
            boolean r0 = r0.skipSilence
            return r0
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean handleBuffer(java.nio.ByteBuffer r18, long r19, int r21) throws com.google.android.exoplayer2.audio.AudioSink.InitializationException, com.google.android.exoplayer2.audio.AudioSink.WriteException {
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            r4 = r21
            java.nio.ByteBuffer r5 = r1.inputBuffer
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L13
            if (r0 != r5) goto L11
            goto L13
        L11:
            r5 = 0
            goto L14
        L13:
            r5 = 1
        L14:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r5)
            com.google.android.exoplayer2.audio.DefaultAudioSink$Configuration r5 = r1.pendingConfiguration
            r8 = 0
            if (r5 == 0) goto L6d
            boolean r5 = r17.drainToEndOfStream()
            if (r5 != 0) goto L23
            return r7
        L23:
            com.google.android.exoplayer2.audio.DefaultAudioSink$Configuration r5 = r1.pendingConfiguration
            com.google.android.exoplayer2.audio.DefaultAudioSink$Configuration r9 = r1.configuration
            boolean r5 = r5.canReuseAudioTrack(r9)
            if (r5 != 0) goto L3b
            r17.playPendingData()
            boolean r5 = r17.hasPendingData()
            if (r5 == 0) goto L37
            return r7
        L37:
            r17.flush()
            goto L6a
        L3b:
            com.google.android.exoplayer2.audio.DefaultAudioSink$Configuration r5 = r1.pendingConfiguration
            r1.configuration = r5
            r1.pendingConfiguration = r8
            android.media.AudioTrack r5 = r1.audioTrack
            boolean r5 = isOffloadedPlayback(r5)
            if (r5 == 0) goto L6a
            int r5 = r1.offloadMode
            r9 = 3
            if (r5 == r9) goto L6a
            android.media.AudioTrack r5 = r1.audioTrack
            int r5 = r5.getPlayState()
            if (r5 != r9) goto L5b
            android.media.AudioTrack r5 = r1.audioTrack
            r5.setOffloadEndOfStream()
        L5b:
            android.media.AudioTrack r5 = r1.audioTrack
            com.google.android.exoplayer2.audio.DefaultAudioSink$Configuration r9 = r1.configuration
            com.google.android.exoplayer2.Format r9 = r9.inputFormat
            int r10 = r9.encoderDelay
            int r9 = r9.encoderPadding
            r5.setOffloadDelayPadding(r10, r9)
            r1.isWaitingForOffloadEndOfStreamHandled = r6
        L6a:
            r1.applyAudioProcessorPlaybackParametersAndSkipSilence(r2)
        L6d:
            boolean r5 = r17.isAudioTrackInitialized()
            if (r5 != 0) goto L87
            boolean r5 = r17.initializeAudioTrack()     // Catch: com.google.android.exoplayer2.audio.AudioSink.InitializationException -> L7a
            if (r5 != 0) goto L87
            return r7
        L7a:
            r0 = move-exception
            r2 = r0
            boolean r0 = r2.isRecoverable
            if (r0 != 0) goto L86
            com.google.android.exoplayer2.audio.DefaultAudioSink$PendingExceptionHolder<com.google.android.exoplayer2.audio.AudioSink$InitializationException> r0 = r1.initializationExceptionPendingExceptionHolder
            r0.throwExceptionIfDeadlineIsReached(r2)
            return r7
        L86:
            throw r2
        L87:
            com.google.android.exoplayer2.audio.DefaultAudioSink$PendingExceptionHolder<com.google.android.exoplayer2.audio.AudioSink$InitializationException> r5 = r1.initializationExceptionPendingExceptionHolder
            r5.clear()
            boolean r5 = r1.startMediaTimeUsNeedsInit
            r9 = 0
            if (r5 == 0) goto Lb5
            long r11 = java.lang.Math.max(r9, r2)
            r1.startMediaTimeUs = r11
            r1.startMediaTimeUsNeedsSync = r7
            r1.startMediaTimeUsNeedsInit = r7
            boolean r5 = r1.enableAudioTrackPlaybackParams
            if (r5 == 0) goto Lab
            int r5 = com.google.android.exoplayer2.util.Util.SDK_INT
            r11 = 23
            if (r5 < r11) goto Lab
            com.google.android.exoplayer2.PlaybackParameters r5 = r1.audioTrackPlaybackParameters
            r1.setAudioTrackPlaybackParametersV23(r5)
        Lab:
            r1.applyAudioProcessorPlaybackParametersAndSkipSilence(r2)
            boolean r5 = r1.playing
            if (r5 == 0) goto Lb5
            r17.play()
        Lb5:
            com.google.android.exoplayer2.audio.AudioTrackPositionTracker r5 = r1.audioTrackPositionTracker
            long r11 = r17.getWrittenFrames()
            boolean r5 = r5.mayHandleBuffer(r11)
            if (r5 != 0) goto Lc2
            return r7
        Lc2:
            java.nio.ByteBuffer r5 = r1.inputBuffer
            if (r5 != 0) goto L175
            java.nio.ByteOrder r5 = r18.order()
            java.nio.ByteOrder r11 = java.nio.ByteOrder.LITTLE_ENDIAN
            if (r5 != r11) goto Ld0
            r5 = 1
            goto Ld1
        Ld0:
            r5 = 0
        Ld1:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r5)
            boolean r5 = r18.hasRemaining()
            if (r5 != 0) goto Ldb
            return r6
        Ldb:
            com.google.android.exoplayer2.audio.DefaultAudioSink$Configuration r5 = r1.configuration
            int r11 = r5.outputMode
            if (r11 == 0) goto Lf0
            int r11 = r1.framesPerEncodedSample
            if (r11 != 0) goto Lf0
            int r5 = r5.outputEncoding
            int r5 = getFramesPerEncodedSample(r5, r0)
            r1.framesPerEncodedSample = r5
            if (r5 != 0) goto Lf0
            return r6
        Lf0:
            com.google.android.exoplayer2.audio.DefaultAudioSink$MediaPositionParameters r5 = r1.afterDrainParameters
            if (r5 == 0) goto L100
            boolean r5 = r17.drainToEndOfStream()
            if (r5 != 0) goto Lfb
            return r7
        Lfb:
            r1.applyAudioProcessorPlaybackParametersAndSkipSilence(r2)
            r1.afterDrainParameters = r8
        L100:
            long r11 = r1.startMediaTimeUs
            com.google.android.exoplayer2.audio.DefaultAudioSink$Configuration r5 = r1.configuration
            long r13 = r17.getSubmittedFrames()
            com.google.android.exoplayer2.audio.TrimmingAudioProcessor r15 = r1.trimmingAudioProcessor
            long r15 = r15.getTrimmedFrameCount()
            long r13 = r13 - r15
            long r13 = r5.inputFramesToDurationUs(r13)
            long r11 = r11 + r13
            boolean r5 = r1.startMediaTimeUsNeedsSync
            if (r5 != 0) goto L133
            long r13 = r11 - r2
            long r13 = java.lang.Math.abs(r13)
            r15 = 200000(0x30d40, double:9.8813E-319)
            int r5 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r5 <= 0) goto L133
            com.google.android.exoplayer2.audio.AudioSink$Listener r5 = r1.listener
            if (r5 == 0) goto L131
            com.google.android.exoplayer2.audio.AudioSink$UnexpectedDiscontinuityException r13 = new com.google.android.exoplayer2.audio.AudioSink$UnexpectedDiscontinuityException
            r13.<init>(r2, r11)
            r5.onAudioSinkError(r13)
        L131:
            r1.startMediaTimeUsNeedsSync = r6
        L133:
            boolean r5 = r1.startMediaTimeUsNeedsSync
            if (r5 == 0) goto L155
            boolean r5 = r17.drainToEndOfStream()
            if (r5 != 0) goto L13e
            return r7
        L13e:
            long r11 = r2 - r11
            long r13 = r1.startMediaTimeUs
            long r13 = r13 + r11
            r1.startMediaTimeUs = r13
            r1.startMediaTimeUsNeedsSync = r7
            r1.applyAudioProcessorPlaybackParametersAndSkipSilence(r2)
            com.google.android.exoplayer2.audio.AudioSink$Listener r5 = r1.listener
            if (r5 == 0) goto L155
            int r13 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r13 == 0) goto L155
            r5.onPositionDiscontinuity()
        L155:
            com.google.android.exoplayer2.audio.DefaultAudioSink$Configuration r5 = r1.configuration
            int r5 = r5.outputMode
            if (r5 != 0) goto L166
            long r9 = r1.submittedPcmBytes
            int r5 = r18.remaining()
            long r11 = (long) r5
            long r9 = r9 + r11
            r1.submittedPcmBytes = r9
            goto L171
        L166:
            long r9 = r1.submittedEncodedFrames
            int r5 = r1.framesPerEncodedSample
            long r11 = (long) r5
            long r13 = (long) r4
            long r11 = r11 * r13
            long r11 = r11 + r9
            r1.submittedEncodedFrames = r11
        L171:
            r1.inputBuffer = r0
            r1.inputBufferAccessUnitCount = r4
        L175:
            r1.processBuffers(r2)
            java.nio.ByteBuffer r0 = r1.inputBuffer
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L185
            r1.inputBuffer = r8
            r1.inputBufferAccessUnitCount = r7
            return r6
        L185:
            com.google.android.exoplayer2.audio.AudioTrackPositionTracker r0 = r1.audioTrackPositionTracker
            long r2 = r17.getWrittenFrames()
            boolean r0 = r0.isStalled(r2)
            if (r0 == 0) goto L19c
            java.lang.String r0 = "DefaultAudioSink"
            java.lang.String r2 = "Resetting stalled audio track"
            com.google.android.exoplayer2.util.Log.w(r0, r2)
            r17.flush()
            return r6
        L19c:
            return r7
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void handleDiscontinuity() {
            r1 = this;
            r0 = 1
            r1.startMediaTimeUsNeedsSync = r0
            return
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean hasPendingData() {
            r3 = this;
            boolean r0 = r3.isAudioTrackInitialized()
            if (r0 == 0) goto L14
            com.google.android.exoplayer2.audio.AudioTrackPositionTracker r0 = r3.audioTrackPositionTracker
            long r1 = r3.getWrittenFrames()
            boolean r0 = r0.hasPendingData(r1)
            if (r0 == 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            return r0
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean isEnded() {
            r1 = this;
            boolean r0 = r1.isAudioTrackInitialized()
            if (r0 == 0) goto L13
            boolean r0 = r1.handledEndOfStream
            if (r0 == 0) goto L11
            boolean r0 = r1.hasPendingData()
            if (r0 != 0) goto L11
            goto L13
        L11:
            r0 = 0
            goto L14
        L13:
            r0 = 1
        L14:
            return r0
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void pause() {
            r1 = this;
            r0 = 0
            r1.playing = r0
            boolean r0 = r1.isAudioTrackInitialized()
            if (r0 == 0) goto L16
            com.google.android.exoplayer2.audio.AudioTrackPositionTracker r0 = r1.audioTrackPositionTracker
            boolean r0 = r0.pause()
            if (r0 == 0) goto L16
            android.media.AudioTrack r0 = r1.audioTrack
            r0.pause()
        L16:
            return
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void play() {
            r1 = this;
            r0 = 1
            r1.playing = r0
            boolean r0 = r1.isAudioTrackInitialized()
            if (r0 == 0) goto L13
            com.google.android.exoplayer2.audio.AudioTrackPositionTracker r0 = r1.audioTrackPositionTracker
            r0.start()
            android.media.AudioTrack r0 = r1.audioTrack
            r0.play()
        L13:
            return
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void playToEndOfStream() throws com.google.android.exoplayer2.audio.AudioSink.WriteException {
            r1 = this;
            boolean r0 = r1.handledEndOfStream
            if (r0 != 0) goto L16
            boolean r0 = r1.isAudioTrackInitialized()
            if (r0 == 0) goto L16
            boolean r0 = r1.drainToEndOfStream()
            if (r0 == 0) goto L16
            r1.playPendingData()
            r0 = 1
            r1.handledEndOfStream = r0
        L16:
            return
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void reset() {
            r5 = this;
            r5.flush()
            com.google.android.exoplayer2.audio.AudioProcessor[] r0 = r5.toIntPcmAvailableAudioProcessors
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L8:
            if (r3 >= r1) goto L12
            r4 = r0[r3]
            r4.reset()
            int r3 = r3 + 1
            goto L8
        L12:
            com.google.android.exoplayer2.audio.AudioProcessor[] r0 = r5.toFloatPcmAvailableAudioProcessors
            int r1 = r0.length
            r3 = 0
        L16:
            if (r3 >= r1) goto L20
            r4 = r0[r3]
            r4.reset()
            int r3 = r3 + 1
            goto L16
        L20:
            r5.playing = r2
            r5.offloadDisabledUntilNextConfiguration = r2
            return
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setAudioAttributes(com.google.android.exoplayer2.audio.AudioAttributes r2) {
            r1 = this;
            com.google.android.exoplayer2.audio.AudioAttributes r0 = r1.audioAttributes
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L9
            return
        L9:
            r1.audioAttributes = r2
            boolean r2 = r1.tunneling
            if (r2 == 0) goto L10
            return
        L10:
            r1.flush()
            return
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setAudioSessionId(int r2) {
            r1 = this;
            int r0 = r1.audioSessionId
            if (r0 == r2) goto L10
            r1.audioSessionId = r2
            if (r2 == 0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            r1.externalAudioSessionIdProvided = r2
            r1.flush()
        L10:
            return
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setAuxEffectInfo(com.google.android.exoplayer2.audio.AuxEffectInfo r5) {
            r4 = this;
            com.google.android.exoplayer2.audio.AuxEffectInfo r0 = r4.auxEffectInfo
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L9
            return
        L9:
            int r0 = r5.effectId
            float r1 = r5.sendLevel
            android.media.AudioTrack r2 = r4.audioTrack
            if (r2 == 0) goto L21
            com.google.android.exoplayer2.audio.AuxEffectInfo r3 = r4.auxEffectInfo
            int r3 = r3.effectId
            if (r3 == r0) goto L1a
            r2.attachAuxEffect(r0)
        L1a:
            if (r0 == 0) goto L21
            android.media.AudioTrack r0 = r4.audioTrack
            r0.setAuxEffectSendLevel(r1)
        L21:
            r4.auxEffectInfo = r5
            return
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setListener(com.google.android.exoplayer2.audio.AudioSink.Listener r1) {
            r0 = this;
            r0.listener = r1
            return
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final /* synthetic */ void setOutputStreamOffsetUs(long r1) {
            r0 = this;
            com.google.android.exoplayer2.audio.AudioSink.CC.$default$setOutputStreamOffsetUs(r0, r1)
            return
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setPlaybackParameters(com.google.android.exoplayer2.PlaybackParameters r5) {
            r4 = this;
            com.google.android.exoplayer2.PlaybackParameters r0 = new com.google.android.exoplayer2.PlaybackParameters
            float r1 = r5.speed
            r2 = 1036831949(0x3dcccccd, float:0.1)
            r3 = 1090519040(0x41000000, float:8.0)
            float r1 = com.google.android.exoplayer2.util.Util.constrainValue(r1, r2, r3)
            float r5 = r5.pitch
            float r5 = com.google.android.exoplayer2.util.Util.constrainValue(r5, r2, r3)
            r0.<init>(r1, r5)
            boolean r5 = r4.enableAudioTrackPlaybackParams
            if (r5 == 0) goto L24
            int r5 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 23
            if (r5 < r1) goto L24
            r4.setAudioTrackPlaybackParametersV23(r0)
            goto L2b
        L24:
            boolean r5 = r4.getSkipSilenceEnabled()
            r4.setAudioProcessorPlaybackParametersAndSkipSilence(r0, r5)
        L2b:
            return
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setPlayerId(@androidx.annotation.Nullable com.google.android.exoplayer2.analytics.PlayerId r1) {
            r0 = this;
            r0.playerId = r1
            return
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    @androidx.annotation.RequiresApi(23)
    public void setPreferredDevice(@androidx.annotation.Nullable android.media.AudioDeviceInfo r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            goto La
        L4:
            com.google.android.exoplayer2.audio.DefaultAudioSink$AudioDeviceInfoApi23 r0 = new com.google.android.exoplayer2.audio.DefaultAudioSink$AudioDeviceInfoApi23
            r0.<init>(r2)
            r2 = r0
        La:
            r1.preferredDevice = r2
            android.media.AudioTrack r0 = r1.audioTrack
            if (r0 == 0) goto L13
            com.google.android.exoplayer2.audio.DefaultAudioSink.Api23.setPreferredDeviceOnAudioTrack(r0, r2)
        L13:
            return
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setSkipSilenceEnabled(boolean r2) {
            r1 = this;
            com.google.android.exoplayer2.PlaybackParameters r0 = r1.getAudioProcessorPlaybackParameters()
            r1.setAudioProcessorPlaybackParametersAndSkipSilence(r0, r2)
            return
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setVolume(float r2) {
            r1 = this;
            float r0 = r1.volume
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.volume = r2
            r1.setVolumeInternal()
        Lb:
            return
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean supportsFormat(com.google.android.exoplayer2.Format r1) {
            r0 = this;
            int r1 = r0.getFormatSupport(r1)
            if (r1 == 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }
}
