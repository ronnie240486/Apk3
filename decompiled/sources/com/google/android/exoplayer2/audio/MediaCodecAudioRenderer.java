package com.google.android.exoplayer2.audio;

/* JADX INFO: loaded from: classes.dex */
public class MediaCodecAudioRenderer extends com.google.android.exoplayer2.mediacodec.MediaCodecRenderer implements com.google.android.exoplayer2.util.MediaClock {
    private static final java.lang.String TAG = "MediaCodecAudioRenderer";
    private static final java.lang.String VIVO_BITS_PER_SAMPLE_KEY = "v-bits-per-sample";
    private boolean allowFirstBufferPositionDiscontinuity;
    private boolean allowPositionDiscontinuity;
    private final com.google.android.exoplayer2.audio.AudioSink audioSink;
    private boolean audioSinkNeedsReset;
    private int codecMaxInputSize;
    private boolean codecNeedsDiscardChannelsWorkaround;
    private final android.content.Context context;
    private long currentPositionUs;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.Format decryptOnlyCodecFormat;
    private final com.google.android.exoplayer2.audio.AudioRendererEventListener.EventDispatcher eventDispatcher;
    private boolean experimentalKeepAudioTrackOnSeek;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.Format inputFormat;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.Renderer.WakeupListener wakeupListener;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.MediaCodecAudioRenderer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes2.dex */
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

    /* JADX INFO: loaded from: classes2.dex */
    public final class AudioSinkListener implements com.google.android.exoplayer2.audio.AudioSink.Listener {
        public final /* synthetic */ com.google.android.exoplayer2.audio.MediaCodecAudioRenderer this$0;

        private AudioSinkListener(com.google.android.exoplayer2.audio.MediaCodecAudioRenderer r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ AudioSinkListener(com.google.android.exoplayer2.audio.MediaCodecAudioRenderer r1, com.google.android.exoplayer2.audio.MediaCodecAudioRenderer.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
        public void onAudioSinkError(java.lang.Exception r3) {
                r2 = this;
                java.lang.String r0 = "MediaCodecAudioRenderer"
                java.lang.String r1 = "Audio sink error"
                com.google.android.exoplayer2.util.Log.e(r0, r1, r3)
                com.google.android.exoplayer2.audio.MediaCodecAudioRenderer r0 = r2.this$0
                com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher r0 = com.google.android.exoplayer2.audio.MediaCodecAudioRenderer.access$100(r0)
                r0.audioSinkError(r3)
                return
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
        public void onOffloadBufferEmptying() {
                r1 = this;
                com.google.android.exoplayer2.audio.MediaCodecAudioRenderer r0 = r1.this$0
                com.google.android.exoplayer2.Renderer$WakeupListener r0 = com.google.android.exoplayer2.audio.MediaCodecAudioRenderer.access$200(r0)
                if (r0 == 0) goto L11
                com.google.android.exoplayer2.audio.MediaCodecAudioRenderer r0 = r1.this$0
                com.google.android.exoplayer2.Renderer$WakeupListener r0 = com.google.android.exoplayer2.audio.MediaCodecAudioRenderer.access$200(r0)
                r0.onWakeup()
            L11:
                return
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
        public void onOffloadBufferFull() {
                r1 = this;
                com.google.android.exoplayer2.audio.MediaCodecAudioRenderer r0 = r1.this$0
                com.google.android.exoplayer2.Renderer$WakeupListener r0 = com.google.android.exoplayer2.audio.MediaCodecAudioRenderer.access$200(r0)
                if (r0 == 0) goto L11
                com.google.android.exoplayer2.audio.MediaCodecAudioRenderer r0 = r1.this$0
                com.google.android.exoplayer2.Renderer$WakeupListener r0 = com.google.android.exoplayer2.audio.MediaCodecAudioRenderer.access$200(r0)
                r0.onSleep()
            L11:
                return
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
        public void onPositionAdvancing(long r2) {
                r1 = this;
                com.google.android.exoplayer2.audio.MediaCodecAudioRenderer r0 = r1.this$0
                com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher r0 = com.google.android.exoplayer2.audio.MediaCodecAudioRenderer.access$100(r0)
                r0.positionAdvancing(r2)
                return
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
        public void onPositionDiscontinuity() {
                r1 = this;
                com.google.android.exoplayer2.audio.MediaCodecAudioRenderer r0 = r1.this$0
                r0.onPositionDiscontinuity()
                return
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
        public void onSkipSilenceEnabledChanged(boolean r2) {
                r1 = this;
                com.google.android.exoplayer2.audio.MediaCodecAudioRenderer r0 = r1.this$0
                com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher r0 = com.google.android.exoplayer2.audio.MediaCodecAudioRenderer.access$100(r0)
                r0.skipSilenceEnabledChanged(r2)
                return
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
        public void onUnderrun(int r8, long r9, long r11) {
                r7 = this;
                com.google.android.exoplayer2.audio.MediaCodecAudioRenderer r0 = r7.this$0
                com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher r1 = com.google.android.exoplayer2.audio.MediaCodecAudioRenderer.access$100(r0)
                r2 = r8
                r3 = r9
                r5 = r11
                r1.underrun(r2, r3, r5)
                return
        }
    }

    public MediaCodecAudioRenderer(android.content.Context r7, com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Factory r8, com.google.android.exoplayer2.mediacodec.MediaCodecSelector r9, boolean r10, @androidx.annotation.Nullable android.os.Handler r11, @androidx.annotation.Nullable com.google.android.exoplayer2.audio.AudioRendererEventListener r12, com.google.android.exoplayer2.audio.AudioSink r13) {
            r6 = this;
            r1 = 1
            r5 = 1194083328(0x472c4400, float:44100.0)
            r0 = r6
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            android.content.Context r7 = r7.getApplicationContext()
            r6.context = r7
            r6.audioSink = r13
            com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher r7 = new com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher
            r7.<init>(r11, r12)
            r6.eventDispatcher = r7
            com.google.android.exoplayer2.audio.MediaCodecAudioRenderer$AudioSinkListener r7 = new com.google.android.exoplayer2.audio.MediaCodecAudioRenderer$AudioSinkListener
            r8 = 0
            r7.<init>(r6, r8)
            r13.setListener(r7)
            return
    }

    public MediaCodecAudioRenderer(android.content.Context r2, com.google.android.exoplayer2.mediacodec.MediaCodecSelector r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0, r0)
            return
    }

    public MediaCodecAudioRenderer(android.content.Context r8, com.google.android.exoplayer2.mediacodec.MediaCodecSelector r9, @androidx.annotation.Nullable android.os.Handler r10, @androidx.annotation.Nullable com.google.android.exoplayer2.audio.AudioRendererEventListener r11) {
            r7 = this;
            com.google.android.exoplayer2.audio.AudioCapabilities r5 = com.google.android.exoplayer2.audio.AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES
            r0 = 0
            com.google.android.exoplayer2.audio.AudioProcessor[] r6 = new com.google.android.exoplayer2.audio.AudioProcessor[r0]
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public MediaCodecAudioRenderer(android.content.Context r7, com.google.android.exoplayer2.mediacodec.MediaCodecSelector r8, @androidx.annotation.Nullable android.os.Handler r9, @androidx.annotation.Nullable com.google.android.exoplayer2.audio.AudioRendererEventListener r10, com.google.android.exoplayer2.audio.AudioCapabilities r11, com.google.android.exoplayer2.audio.AudioProcessor... r12) {
            r6 = this;
            com.google.android.exoplayer2.audio.DefaultAudioSink$Builder r0 = new com.google.android.exoplayer2.audio.DefaultAudioSink$Builder
            r0.<init>()
            com.google.android.exoplayer2.audio.AudioCapabilities r1 = com.google.android.exoplayer2.audio.AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES
            java.lang.Object r11 = com.google.common.base.MoreObjects.firstNonNull(r11, r1)
            com.google.android.exoplayer2.audio.AudioCapabilities r11 = (com.google.android.exoplayer2.audio.AudioCapabilities) r11
            com.google.android.exoplayer2.audio.DefaultAudioSink$Builder r11 = r0.setAudioCapabilities(r11)
            com.google.android.exoplayer2.audio.DefaultAudioSink$Builder r11 = r11.setAudioProcessors(r12)
            com.google.android.exoplayer2.audio.DefaultAudioSink r5 = r11.build()
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public MediaCodecAudioRenderer(android.content.Context r9, com.google.android.exoplayer2.mediacodec.MediaCodecSelector r10, @androidx.annotation.Nullable android.os.Handler r11, @androidx.annotation.Nullable com.google.android.exoplayer2.audio.AudioRendererEventListener r12, com.google.android.exoplayer2.audio.AudioSink r13) {
            r8 = this;
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter$Factory r2 = com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Factory.DEFAULT
            r4 = 0
            r0 = r8
            r1 = r9
            r3 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public MediaCodecAudioRenderer(android.content.Context r9, com.google.android.exoplayer2.mediacodec.MediaCodecSelector r10, boolean r11, @androidx.annotation.Nullable android.os.Handler r12, @androidx.annotation.Nullable com.google.android.exoplayer2.audio.AudioRendererEventListener r13, com.google.android.exoplayer2.audio.AudioSink r14) {
            r8 = this;
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter$Factory r2 = com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Factory.DEFAULT
            r0 = r8
            r1 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static /* synthetic */ com.google.android.exoplayer2.audio.AudioRendererEventListener.EventDispatcher access$100(com.google.android.exoplayer2.audio.MediaCodecAudioRenderer r0) {
            com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher r0 = r0.eventDispatcher
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.Renderer.WakeupListener access$200(com.google.android.exoplayer2.audio.MediaCodecAudioRenderer r0) {
            com.google.android.exoplayer2.Renderer$WakeupListener r0 = r0.wakeupListener
            return r0
    }

    private static boolean codecNeedsDiscardChannelsWorkaround(java.lang.String r2) {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 24
            if (r0 >= r1) goto L36
            java.lang.String r0 = "OMX.SEC.aac.dec"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L36
            java.lang.String r2 = com.google.android.exoplayer2.util.Util.MANUFACTURER
            java.lang.String r0 = "samsung"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L36
            java.lang.String r2 = com.google.android.exoplayer2.util.Util.DEVICE
            java.lang.String r0 = "zeroflte"
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L34
            java.lang.String r0 = "herolte"
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L34
            java.lang.String r0 = "heroqlte"
            boolean r2 = r2.startsWith(r0)
            if (r2 == 0) goto L36
        L34:
            r2 = 1
            goto L37
        L36:
            r2 = 0
        L37:
            return r2
    }

    private static boolean deviceDoesntSupportOperatingRate() {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 23
            if (r0 != r1) goto L1a
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.MODEL
            java.lang.String r1 = "ZTE B2017G"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L18
            java.lang.String r1 = "AXON 7 mini"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1a
        L18:
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            return r0
    }

    private int getCodecMaxInputSize(com.google.android.exoplayer2.mediacodec.MediaCodecInfo r2, com.google.android.exoplayer2.Format r3) {
            r1 = this;
            java.lang.String r2 = r2.name
            java.lang.String r0 = "OMX.google.raw.decoder"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L1e
            int r2 = com.google.android.exoplayer2.util.Util.SDK_INT
            r0 = 24
            if (r2 >= r0) goto L1e
            r0 = 23
            if (r2 != r0) goto L1c
            android.content.Context r2 = r1.context
            boolean r2 = com.google.android.exoplayer2.util.Util.isTv(r2)
            if (r2 != 0) goto L1e
        L1c:
            r2 = -1
            return r2
        L1e:
            int r2 = r3.maxInputSize
            return r2
    }

    private static java.util.List<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> getDecoderInfos(com.google.android.exoplayer2.mediacodec.MediaCodecSelector r1, com.google.android.exoplayer2.Format r2, boolean r3, com.google.android.exoplayer2.audio.AudioSink r4) throws com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException {
            java.lang.String r0 = r2.sampleMimeType
            if (r0 != 0) goto L9
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of()
            return r1
        L9:
            boolean r4 = r4.supportsFormat(r2)
            if (r4 == 0) goto L1a
            com.google.android.exoplayer2.mediacodec.MediaCodecInfo r4 = com.google.android.exoplayer2.mediacodec.MediaCodecUtil.getDecryptOnlyDecoderInfo()
            if (r4 == 0) goto L1a
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of(r4)
            return r1
        L1a:
            r4 = 0
            java.util.List r0 = r1.getDecoderInfos(r0, r3, r4)
            java.lang.String r2 = com.google.android.exoplayer2.mediacodec.MediaCodecUtil.getAlternativeCodecMimeType(r2)
            if (r2 != 0) goto L2a
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.copyOf(r0)
            return r1
        L2a:
            java.util.List r1 = r1.getDecoderInfos(r2, r3, r4)
            com.google.common.collect.ImmutableList$Builder r2 = com.google.common.collect.ImmutableList.builder()
            com.google.common.collect.ImmutableList$Builder r2 = r2.addAll(r0)
            com.google.common.collect.ImmutableList$Builder r1 = r2.addAll(r1)
            com.google.common.collect.ImmutableList r1 = r1.build()
            return r1
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

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final com.google.android.exoplayer2.decoder.DecoderReuseEvaluation canReuseCodec(com.google.android.exoplayer2.mediacodec.MediaCodecInfo r9, com.google.android.exoplayer2.Format r10, com.google.android.exoplayer2.Format r11) {
            r8 = this;
            com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r0 = r9.canReuseCodec(r10, r11)
            int r1 = r0.discardReasons
            int r2 = r8.getCodecMaxInputSize(r9, r11)
            int r3 = r8.codecMaxInputSize
            if (r2 <= r3) goto L10
            r1 = r1 | 64
        L10:
            r7 = r1
            com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r1 = new com.google.android.exoplayer2.decoder.DecoderReuseEvaluation
            java.lang.String r3 = r9.name
            if (r7 == 0) goto L1a
            r9 = 0
            r6 = 0
            goto L1d
        L1a:
            int r9 = r0.result
            r6 = r9
        L1d:
            r2 = r1
            r4 = r10
            r5 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            return r1
    }

    public void experimentalSetEnableKeepAudioTrackOnSeek(boolean r1) {
            r0 = this;
            r0.experimentalKeepAudioTrackOnSeek = r1
            return
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final float getCodecOperatingRateV23(float r6, com.google.android.exoplayer2.Format[] r7) {
            r5 = this;
            int r0 = r7.length
            r1 = -1
            r2 = 0
            r3 = -1
        L4:
            if (r2 >= r0) goto L13
            r4 = r7[r2]
            int r4 = r4.sampleRate
            if (r4 == r1) goto L10
            int r3 = java.lang.Math.max(r3, r4)
        L10:
            int r2 = r2 + 1
            goto L4
        L13:
            if (r3 != r1) goto L18
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L1b
        L18:
            float r7 = (float) r3
            float r6 = r6 * r7
        L1b:
            return r6
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final java.util.List<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> getDecoderInfos(com.google.android.exoplayer2.mediacodec.MediaCodecSelector r2, com.google.android.exoplayer2.Format r3, boolean r4) throws com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException {
            r1 = this;
            com.google.android.exoplayer2.audio.AudioSink r0 = r1.audioSink
            java.util.List r2 = getDecoderInfos(r2, r3, r4, r0)
            java.util.List r2 = com.google.android.exoplayer2.mediacodec.MediaCodecUtil.getDecoderInfosSortedByFormatSupport(r2, r3)
            return r2
    }

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.Renderer
    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.util.MediaClock getMediaClock() {
            r0 = this;
            return r0
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Configuration getMediaCodecConfiguration(com.google.android.exoplayer2.mediacodec.MediaCodecInfo r9, com.google.android.exoplayer2.Format r10, @androidx.annotation.Nullable android.media.MediaCrypto r11, float r12) {
            r8 = this;
            com.google.android.exoplayer2.Format[] r0 = r8.getStreamFormats()
            int r1 = r8.getCodecMaxInputSize(r9, r10)
            int r2 = r0.length
            r3 = 0
            r4 = 1
            if (r2 != r4) goto Le
            goto L27
        Le:
            int r2 = r0.length
            r5 = 0
        L10:
            if (r5 >= r2) goto L27
            r6 = r0[r5]
            com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r7 = r9.canReuseCodec(r10, r6)
            int r7 = r7.result
            if (r7 == 0) goto L24
            int r6 = r8.getCodecMaxInputSize(r9, r6)
            int r1 = java.lang.Math.max(r1, r6)
        L24:
            int r5 = r5 + 1
            goto L10
        L27:
            r8.codecMaxInputSize = r1
            java.lang.String r0 = r9.name
            boolean r0 = codecNeedsDiscardChannelsWorkaround(r0)
            r8.codecNeedsDiscardChannelsWorkaround = r0
            java.lang.String r0 = r9.codecMimeType
            int r1 = r8.codecMaxInputSize
            android.media.MediaFormat r2 = new android.media.MediaFormat
            r2.<init>()
            java.lang.String r5 = "mime"
            r2.setString(r5, r0)
            int r0 = r10.channelCount
            java.lang.String r5 = "channel-count"
            r2.setInteger(r5, r0)
            int r0 = r10.sampleRate
            java.lang.String r5 = "sample-rate"
            r2.setInteger(r5, r0)
            java.util.List<byte[]> r0 = r10.initializationData
            com.google.android.exoplayer2.util.MediaFormatUtil.setCsdBuffers(r2, r0)
            java.lang.String r0 = "max-input-size"
            com.google.android.exoplayer2.util.MediaFormatUtil.maybeSetInteger(r2, r0, r1)
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 23
            if (r0 < r1) goto L75
            java.lang.String r1 = "priority"
            r2.setInteger(r1, r3)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r1 == 0) goto L75
            boolean r1 = deviceDoesntSupportOperatingRate()
            if (r1 != 0) goto L75
            java.lang.String r1 = "operating-rate"
            r2.setFloat(r1, r12)
        L75:
            r12 = 28
            if (r0 > r12) goto L88
            java.lang.String r12 = r10.sampleMimeType
            java.lang.String r1 = "audio/ac4"
            boolean r12 = r1.equals(r12)
            if (r12 == 0) goto L88
            java.lang.String r12 = "ac4-is-sync"
            r2.setInteger(r12, r4)
        L88:
            r12 = 24
            if (r0 < r12) goto La3
            com.google.android.exoplayer2.audio.AudioSink r12 = r8.audioSink
            int r1 = r10.channelCount
            int r5 = r10.sampleRate
            r6 = 4
            com.google.android.exoplayer2.Format r1 = com.google.android.exoplayer2.util.Util.getPcmFormat(r6, r1, r5)
            int r12 = r12.getFormatSupport(r1)
            r1 = 2
            if (r12 != r1) goto La3
            java.lang.String r12 = "pcm-encoding"
            r2.setInteger(r12, r6)
        La3:
            r12 = 32
            if (r0 < r12) goto Lae
            r12 = 99
            java.lang.String r0 = "max-output-channel-count"
            r2.setInteger(r0, r12)
        Lae:
            java.lang.String r12 = r9.mimeType
            java.lang.String r0 = "audio/raw"
            boolean r12 = r0.equals(r12)
            if (r12 == 0) goto Lc1
            java.lang.String r12 = r10.sampleMimeType
            boolean r12 = r0.equals(r12)
            if (r12 != 0) goto Lc1
            r3 = 1
        Lc1:
            if (r3 == 0) goto Lc5
            r12 = r10
            goto Lc6
        Lc5:
            r12 = 0
        Lc6:
            r8.decryptOnlyCodecFormat = r12
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter$Configuration r9 = com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Configuration.createForAudioDecoding(r9, r2, r10, r11)
            return r9
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = "MediaCodecAudioRenderer"
            return r0
    }

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

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.PlayerMessage.Target
    public void handleMessage(int r2, @androidx.annotation.Nullable java.lang.Object r3) throws com.google.android.exoplayer2.ExoPlaybackException {
            r1 = this;
            r0 = 2
            if (r2 == r0) goto L49
            r0 = 3
            if (r2 == r0) goto L41
            r0 = 6
            if (r2 == r0) goto L39
            switch(r2) {
                case 9: goto L2d;
                case 10: goto L21;
                case 11: goto L1c;
                case 12: goto L10;
                default: goto Lc;
            }
        Lc:
            super.handleMessage(r2, r3)
            goto L54
        L10:
            int r2 = com.google.android.exoplayer2.util.Util.SDK_INT
            r0 = 23
            if (r2 < r0) goto L54
            com.google.android.exoplayer2.audio.AudioSink r2 = r1.audioSink
            com.google.android.exoplayer2.audio.MediaCodecAudioRenderer.Api23.setAudioSinkPreferredDevice(r2, r3)
            goto L54
        L1c:
            com.google.android.exoplayer2.Renderer$WakeupListener r3 = (com.google.android.exoplayer2.Renderer.WakeupListener) r3
            r1.wakeupListener = r3
            goto L54
        L21:
            com.google.android.exoplayer2.audio.AudioSink r2 = r1.audioSink
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setAudioSessionId(r3)
            goto L54
        L2d:
            com.google.android.exoplayer2.audio.AudioSink r2 = r1.audioSink
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r2.setSkipSilenceEnabled(r3)
            goto L54
        L39:
            com.google.android.exoplayer2.audio.AuxEffectInfo r3 = (com.google.android.exoplayer2.audio.AuxEffectInfo) r3
            com.google.android.exoplayer2.audio.AudioSink r2 = r1.audioSink
            r2.setAuxEffectInfo(r3)
            goto L54
        L41:
            com.google.android.exoplayer2.audio.AudioAttributes r3 = (com.google.android.exoplayer2.audio.AudioAttributes) r3
            com.google.android.exoplayer2.audio.AudioSink r2 = r1.audioSink
            r2.setAudioAttributes(r3)
            goto L54
        L49:
            com.google.android.exoplayer2.audio.AudioSink r2 = r1.audioSink
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r2.setVolume(r3)
        L54:
            return
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.Renderer
    public boolean isEnded() {
            r1 = this;
            boolean r0 = super.isEnded()
            if (r0 == 0) goto L10
            com.google.android.exoplayer2.audio.AudioSink r0 = r1.audioSink
            boolean r0 = r0.isEnded()
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.Renderer
    public boolean isReady() {
            r1 = this;
            com.google.android.exoplayer2.audio.AudioSink r0 = r1.audioSink
            boolean r0 = r0.hasPendingData()
            if (r0 != 0) goto L11
            boolean r0 = super.isReady()
            if (r0 == 0) goto Lf
            goto L11
        Lf:
            r0 = 0
            goto L12
        L11:
            r0 = 1
        L12:
            return r0
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void onCodecError(java.lang.Exception r3) {
            r2 = this;
            java.lang.String r0 = "MediaCodecAudioRenderer"
            java.lang.String r1 = "Audio codec error"
            com.google.android.exoplayer2.util.Log.e(r0, r1, r3)
            com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher r0 = r2.eventDispatcher
            r0.audioCodecError(r3)
            return
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void onCodecInitialized(java.lang.String r7, long r8, long r10) {
            r6 = this;
            com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher r0 = r6.eventDispatcher
            r1 = r7
            r2 = r8
            r4 = r10
            r0.decoderInitialized(r1, r2, r4)
            return
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void onCodecReleased(java.lang.String r2) {
            r1 = this;
            com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher r0 = r1.eventDispatcher
            r0.decoderReleased(r2)
            return
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    public final void onDisabled() {
            r3 = this;
            r0 = 1
            r3.audioSinkNeedsReset = r0
            r0 = 0
            r3.inputFormat = r0
            com.google.android.exoplayer2.audio.AudioSink r0 = r3.audioSink     // Catch: java.lang.Throwable -> L1f
            r0.flush()     // Catch: java.lang.Throwable -> L1f
            super.onDisabled()     // Catch: java.lang.Throwable -> L16
            com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher r0 = r3.eventDispatcher
            com.google.android.exoplayer2.decoder.DecoderCounters r1 = r3.decoderCounters
            r0.disabled(r1)
            return
        L16:
            r0 = move-exception
            com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher r1 = r3.eventDispatcher
            com.google.android.exoplayer2.decoder.DecoderCounters r2 = r3.decoderCounters
            r1.disabled(r2)
            throw r0
        L1f:
            r0 = move-exception
            super.onDisabled()     // Catch: java.lang.Throwable -> L2b
            com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher r1 = r3.eventDispatcher
            com.google.android.exoplayer2.decoder.DecoderCounters r2 = r3.decoderCounters
            r1.disabled(r2)
            throw r0
        L2b:
            r0 = move-exception
            com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher r1 = r3.eventDispatcher
            com.google.android.exoplayer2.decoder.DecoderCounters r2 = r3.decoderCounters
            r1.disabled(r2)
            throw r0
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    public final void onEnabled(boolean r1, boolean r2) throws com.google.android.exoplayer2.ExoPlaybackException {
            r0 = this;
            super.onEnabled(r1, r2)
            com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher r1 = r0.eventDispatcher
            com.google.android.exoplayer2.decoder.DecoderCounters r2 = r0.decoderCounters
            r1.enabled(r2)
            com.google.android.exoplayer2.RendererConfiguration r1 = r0.getConfiguration()
            boolean r1 = r1.tunneling
            if (r1 == 0) goto L18
            com.google.android.exoplayer2.audio.AudioSink r1 = r0.audioSink
            r1.enableTunnelingV21()
            goto L1d
        L18:
            com.google.android.exoplayer2.audio.AudioSink r1 = r0.audioSink
            r1.disableTunneling()
        L1d:
            com.google.android.exoplayer2.audio.AudioSink r1 = r0.audioSink
            com.google.android.exoplayer2.analytics.PlayerId r2 = r0.getPlayerId()
            r1.setPlayerId(r2)
            return
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @androidx.annotation.Nullable
    public final com.google.android.exoplayer2.decoder.DecoderReuseEvaluation onInputFormatChanged(com.google.android.exoplayer2.FormatHolder r3) throws com.google.android.exoplayer2.ExoPlaybackException {
            r2 = this;
            com.google.android.exoplayer2.Format r0 = r3.format
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.Format r0 = (com.google.android.exoplayer2.Format) r0
            r2.inputFormat = r0
            com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r3 = super.onInputFormatChanged(r3)
            com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher r0 = r2.eventDispatcher
            com.google.android.exoplayer2.Format r1 = r2.inputFormat
            r0.inputFormatChanged(r1, r3)
            return r3
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void onOutputFormatChanged(com.google.android.exoplayer2.Format r6, @androidx.annotation.Nullable android.media.MediaFormat r7) throws com.google.android.exoplayer2.ExoPlaybackException {
            r5 = this;
            com.google.android.exoplayer2.Format r0 = r5.decryptOnlyCodecFormat
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L9
            r6 = r0
            goto L90
        L9:
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r0 = r5.getCodec()
            if (r0 != 0) goto L11
            goto L90
        L11:
            java.lang.String r0 = r6.sampleMimeType
            java.lang.String r3 = "audio/raw"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L1e
            int r0 = r6.pcmEncoding
            goto L44
        L1e:
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r4 = 24
            if (r0 < r4) goto L31
            java.lang.String r0 = "pcm-encoding"
            boolean r4 = r7.containsKey(r0)
            if (r4 == 0) goto L31
            int r0 = r7.getInteger(r0)
            goto L44
        L31:
            java.lang.String r0 = "v-bits-per-sample"
            boolean r4 = r7.containsKey(r0)
            if (r4 == 0) goto L43
            int r0 = r7.getInteger(r0)
            int r0 = com.google.android.exoplayer2.util.Util.getPcmEncoding(r0)
            goto L44
        L43:
            r0 = 2
        L44:
            com.google.android.exoplayer2.Format$Builder r4 = new com.google.android.exoplayer2.Format$Builder
            r4.<init>()
            com.google.android.exoplayer2.Format$Builder r3 = r4.setSampleMimeType(r3)
            com.google.android.exoplayer2.Format$Builder r0 = r3.setPcmEncoding(r0)
            int r3 = r6.encoderDelay
            com.google.android.exoplayer2.Format$Builder r0 = r0.setEncoderDelay(r3)
            int r3 = r6.encoderPadding
            com.google.android.exoplayer2.Format$Builder r0 = r0.setEncoderPadding(r3)
            java.lang.String r3 = "channel-count"
            int r3 = r7.getInteger(r3)
            com.google.android.exoplayer2.Format$Builder r0 = r0.setChannelCount(r3)
            java.lang.String r3 = "sample-rate"
            int r7 = r7.getInteger(r3)
            com.google.android.exoplayer2.Format$Builder r7 = r0.setSampleRate(r7)
            com.google.android.exoplayer2.Format r7 = r7.build()
            boolean r0 = r5.codecNeedsDiscardChannelsWorkaround
            if (r0 == 0) goto L8f
            int r0 = r7.channelCount
            r3 = 6
            if (r0 != r3) goto L8f
            int r0 = r6.channelCount
            if (r0 >= r3) goto L8f
            int[] r2 = new int[r0]
            r0 = 0
        L86:
            int r3 = r6.channelCount
            if (r0 >= r3) goto L8f
            r2[r0] = r0
            int r0 = r0 + 1
            goto L86
        L8f:
            r6 = r7
        L90:
            com.google.android.exoplayer2.audio.AudioSink r7 = r5.audioSink     // Catch: com.google.android.exoplayer2.audio.AudioSink.ConfigurationException -> L96
            r7.configure(r6, r1, r2)     // Catch: com.google.android.exoplayer2.audio.AudioSink.ConfigurationException -> L96
            return
        L96:
            r6 = move-exception
            com.google.android.exoplayer2.Format r7 = r6.format
            r0 = 5001(0x1389, float:7.008E-42)
            com.google.android.exoplayer2.ExoPlaybackException r6 = r5.createRendererException(r6, r7, r1, r0)
            throw r6
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void onOutputStreamOffsetUsChanged(long r2) {
            r1 = this;
            com.google.android.exoplayer2.audio.AudioSink r0 = r1.audioSink
            r0.setOutputStreamOffsetUs(r2)
            return
    }

    @androidx.annotation.CallSuper
    public final void onPositionDiscontinuity() {
            r1 = this;
            r0 = 1
            r1.allowPositionDiscontinuity = r0
            return
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    public final void onPositionReset(long r1, boolean r3) throws com.google.android.exoplayer2.ExoPlaybackException {
            r0 = this;
            super.onPositionReset(r1, r3)
            boolean r3 = r0.experimentalKeepAudioTrackOnSeek
            if (r3 == 0) goto Ld
            com.google.android.exoplayer2.audio.AudioSink r3 = r0.audioSink
            r3.experimentalFlushWithoutAudioTrackRelease()
            goto L12
        Ld:
            com.google.android.exoplayer2.audio.AudioSink r3 = r0.audioSink
            r3.flush()
        L12:
            r0.currentPositionUs = r1
            r1 = 1
            r0.allowFirstBufferPositionDiscontinuity = r1
            r0.allowPositionDiscontinuity = r1
            return
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void onProcessedStreamChange() {
            r1 = this;
            com.google.android.exoplayer2.audio.AudioSink r0 = r1.audioSink
            r0.handleDiscontinuity()
            return
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void onQueueInputBuffer(com.google.android.exoplayer2.decoder.DecoderInputBuffer r6) {
            r5 = this;
            boolean r0 = r5.allowFirstBufferPositionDiscontinuity
            if (r0 == 0) goto L21
            boolean r0 = r6.isDecodeOnly()
            if (r0 != 0) goto L21
            long r0 = r6.timeUs
            long r2 = r5.currentPositionUs
            long r0 = r0 - r2
            long r0 = java.lang.Math.abs(r0)
            r2 = 500000(0x7a120, double:2.47033E-318)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1e
            long r0 = r6.timeUs
            r5.currentPositionUs = r0
        L1e:
            r6 = 0
            r5.allowFirstBufferPositionDiscontinuity = r6
        L21:
            return
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    public final void onReset() {
            r3 = this;
            r0 = 0
            super.onReset()     // Catch: java.lang.Throwable -> L10
            boolean r1 = r3.audioSinkNeedsReset
            if (r1 == 0) goto Lf
            r3.audioSinkNeedsReset = r0
            com.google.android.exoplayer2.audio.AudioSink r0 = r3.audioSink
            r0.reset()
        Lf:
            return
        L10:
            r1 = move-exception
            boolean r2 = r3.audioSinkNeedsReset
            if (r2 == 0) goto L1c
            r3.audioSinkNeedsReset = r0
            com.google.android.exoplayer2.audio.AudioSink r0 = r3.audioSink
            r0.reset()
        L1c:
            throw r1
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    public final void onStarted() {
            r1 = this;
            com.google.android.exoplayer2.audio.AudioSink r0 = r1.audioSink
            r0.play()
            return
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    public final void onStopped() {
            r1 = this;
            r1.updateCurrentPosition()
            com.google.android.exoplayer2.audio.AudioSink r0 = r1.audioSink
            r0.pause()
            return
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final boolean processOutputBuffer(long r1, long r3, @androidx.annotation.Nullable com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r5, @androidx.annotation.Nullable java.nio.ByteBuffer r6, int r7, int r8, int r9, long r10, boolean r12, boolean r13, com.google.android.exoplayer2.Format r14) throws com.google.android.exoplayer2.ExoPlaybackException {
            r0 = this;
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r6)
            com.google.android.exoplayer2.Format r1 = r0.decryptOnlyCodecFormat
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L17
            r1 = r8 & 2
            if (r1 == 0) goto L17
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r5)
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r1 = (com.google.android.exoplayer2.mediacodec.MediaCodecAdapter) r1
            r1.releaseOutputBuffer(r7, r3)
            return r2
        L17:
            if (r12 == 0) goto L2b
            if (r5 == 0) goto L1e
            r5.releaseOutputBuffer(r7, r3)
        L1e:
            com.google.android.exoplayer2.decoder.DecoderCounters r1 = r0.decoderCounters
            int r3 = r1.skippedOutputBufferCount
            int r3 = r3 + r9
            r1.skippedOutputBufferCount = r3
            com.google.android.exoplayer2.audio.AudioSink r1 = r0.audioSink
            r1.handleDiscontinuity()
            return r2
        L2b:
            com.google.android.exoplayer2.audio.AudioSink r1 = r0.audioSink     // Catch: com.google.android.exoplayer2.audio.AudioSink.WriteException -> L41 com.google.android.exoplayer2.audio.AudioSink.InitializationException -> L4b
            boolean r1 = r1.handleBuffer(r6, r10, r9)     // Catch: com.google.android.exoplayer2.audio.AudioSink.WriteException -> L41 com.google.android.exoplayer2.audio.AudioSink.InitializationException -> L4b
            if (r1 == 0) goto L40
            if (r5 == 0) goto L38
            r5.releaseOutputBuffer(r7, r3)
        L38:
            com.google.android.exoplayer2.decoder.DecoderCounters r1 = r0.decoderCounters
            int r3 = r1.renderedOutputBufferCount
            int r3 = r3 + r9
            r1.renderedOutputBufferCount = r3
            return r2
        L40:
            return r3
        L41:
            r1 = move-exception
            boolean r2 = r1.isRecoverable
            r3 = 5002(0x138a, float:7.009E-42)
            com.google.android.exoplayer2.ExoPlaybackException r1 = r0.createRendererException(r1, r14, r2, r3)
            throw r1
        L4b:
            r1 = move-exception
            com.google.android.exoplayer2.Format r2 = r0.inputFormat
            boolean r3 = r1.isRecoverable
            r4 = 5001(0x1389, float:7.008E-42)
            com.google.android.exoplayer2.ExoPlaybackException r1 = r0.createRendererException(r1, r2, r3, r4)
            throw r1
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void renderToEndOfStream() throws com.google.android.exoplayer2.ExoPlaybackException {
            r4 = this;
            com.google.android.exoplayer2.audio.AudioSink r0 = r4.audioSink     // Catch: com.google.android.exoplayer2.audio.AudioSink.WriteException -> L6
            r0.playToEndOfStream()     // Catch: com.google.android.exoplayer2.audio.AudioSink.WriteException -> L6
            return
        L6:
            r0 = move-exception
            com.google.android.exoplayer2.Format r1 = r0.format
            boolean r2 = r0.isRecoverable
            r3 = 5002(0x138a, float:7.009E-42)
            com.google.android.exoplayer2.ExoPlaybackException r0 = r4.createRendererException(r0, r1, r2, r3)
            throw r0
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public void setPlaybackParameters(com.google.android.exoplayer2.PlaybackParameters r2) {
            r1 = this;
            com.google.android.exoplayer2.audio.AudioSink r0 = r1.audioSink
            r0.setPlaybackParameters(r2)
            return
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final boolean shouldUseBypass(com.google.android.exoplayer2.Format r2) {
            r1 = this;
            com.google.android.exoplayer2.audio.AudioSink r0 = r1.audioSink
            boolean r2 = r0.supportsFormat(r2)
            return r2
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final int supportsFormat(com.google.android.exoplayer2.mediacodec.MediaCodecSelector r11, com.google.android.exoplayer2.Format r12) throws com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException {
            r10 = this;
            java.lang.String r0 = r12.sampleMimeType
            boolean r0 = com.google.android.exoplayer2.util.MimeTypes.isAudio(r0)
            r1 = 0
            if (r0 != 0) goto Le
            int r11 = com.google.android.exoplayer2.RendererCapabilities.CC.create(r1)
            return r11
        Le:
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r2 = 21
            if (r0 < r2) goto L17
            r0 = 32
            goto L18
        L17:
            r0 = 0
        L18:
            int r2 = r12.cryptoType
            r3 = 1
            if (r2 == 0) goto L1f
            r4 = 1
            goto L20
        L1f:
            r4 = 0
        L20:
            r5 = 2
            if (r2 == 0) goto L28
            if (r2 != r5) goto L26
            goto L28
        L26:
            r2 = 0
            goto L29
        L28:
            r2 = 1
        L29:
            r6 = 8
            r7 = 4
            if (r2 == 0) goto L43
            com.google.android.exoplayer2.audio.AudioSink r8 = r10.audioSink
            boolean r8 = r8.supportsFormat(r12)
            if (r8 == 0) goto L43
            if (r4 == 0) goto L3e
            com.google.android.exoplayer2.mediacodec.MediaCodecInfo r4 = com.google.android.exoplayer2.mediacodec.MediaCodecUtil.getDecryptOnlyDecoderInfo()
            if (r4 == 0) goto L43
        L3e:
            int r11 = com.google.android.exoplayer2.RendererCapabilities.CC.create(r7, r6, r0)
            return r11
        L43:
            java.lang.String r4 = r12.sampleMimeType
            java.lang.String r8 = "audio/raw"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L5a
            com.google.android.exoplayer2.audio.AudioSink r4 = r10.audioSink
            boolean r4 = r4.supportsFormat(r12)
            if (r4 != 0) goto L5a
            int r11 = com.google.android.exoplayer2.RendererCapabilities.CC.create(r3)
            return r11
        L5a:
            com.google.android.exoplayer2.audio.AudioSink r4 = r10.audioSink
            int r8 = r12.channelCount
            int r9 = r12.sampleRate
            com.google.android.exoplayer2.Format r8 = com.google.android.exoplayer2.util.Util.getPcmFormat(r5, r8, r9)
            boolean r4 = r4.supportsFormat(r8)
            if (r4 != 0) goto L6f
            int r11 = com.google.android.exoplayer2.RendererCapabilities.CC.create(r3)
            return r11
        L6f:
            com.google.android.exoplayer2.audio.AudioSink r4 = r10.audioSink
            java.util.List r11 = getDecoderInfos(r11, r12, r1, r4)
            boolean r4 = r11.isEmpty()
            if (r4 == 0) goto L80
            int r11 = com.google.android.exoplayer2.RendererCapabilities.CC.create(r3)
            return r11
        L80:
            if (r2 != 0) goto L87
            int r11 = com.google.android.exoplayer2.RendererCapabilities.CC.create(r5)
            return r11
        L87:
            java.lang.Object r2 = r11.get(r1)
            com.google.android.exoplayer2.mediacodec.MediaCodecInfo r2 = (com.google.android.exoplayer2.mediacodec.MediaCodecInfo) r2
            boolean r4 = r2.isFormatSupported(r12)
            if (r4 != 0) goto Lac
            r5 = 1
        L94:
            int r8 = r11.size()
            if (r5 >= r8) goto Lac
            java.lang.Object r8 = r11.get(r5)
            com.google.android.exoplayer2.mediacodec.MediaCodecInfo r8 = (com.google.android.exoplayer2.mediacodec.MediaCodecInfo) r8
            boolean r9 = r8.isFormatSupported(r12)
            if (r9 == 0) goto La9
            r2 = r8
            r11 = 0
            goto Lae
        La9:
            int r5 = r5 + 1
            goto L94
        Lac:
            r3 = r4
            r11 = 1
        Lae:
            if (r3 == 0) goto Lb1
            goto Lb2
        Lb1:
            r7 = 3
        Lb2:
            if (r3 == 0) goto Lbc
            boolean r12 = r2.isSeamlessAdaptationSupported(r12)
            if (r12 == 0) goto Lbc
            r6 = 16
        Lbc:
            boolean r12 = r2.hardwareAccelerated
            if (r12 == 0) goto Lc3
            r12 = 64
            goto Lc4
        Lc3:
            r12 = 0
        Lc4:
            if (r11 == 0) goto Lc8
            r1 = 128(0x80, float:1.8E-43)
        Lc8:
            int r11 = com.google.android.exoplayer2.RendererCapabilities.CC.create(r7, r6, r0, r12, r1)
            return r11
    }
}
