package com.google.android.exoplayer2.ext.ffmpeg;

/* JADX INFO: loaded from: classes.dex */
public final class FfmpegAudioRenderer extends com.google.android.exoplayer2.audio.DecoderAudioRenderer<com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioDecoder> {
    private static final int DEFAULT_INPUT_BUFFER_SIZE = 5760;
    private static final int NUM_BUFFERS = 16;
    private static final java.lang.String TAG = "FfmpegAudioRenderer";

    public FfmpegAudioRenderer() {
            r2 = this;
            r0 = 0
            com.google.android.exoplayer2.audio.AudioProcessor[] r0 = new com.google.android.exoplayer2.audio.AudioProcessor[r0]
            r1 = 0
            r2.<init>(r1, r1, r0)
            return
    }

    public FfmpegAudioRenderer(@androidx.annotation.Nullable android.os.Handler r1, @androidx.annotation.Nullable com.google.android.exoplayer2.audio.AudioRendererEventListener r2, com.google.android.exoplayer2.audio.AudioSink r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public FfmpegAudioRenderer(@androidx.annotation.Nullable android.os.Handler r2, @androidx.annotation.Nullable com.google.android.exoplayer2.audio.AudioRendererEventListener r3, com.google.android.exoplayer2.audio.AudioProcessor... r4) {
            r1 = this;
            com.google.android.exoplayer2.audio.DefaultAudioSink$Builder r0 = new com.google.android.exoplayer2.audio.DefaultAudioSink$Builder
            r0.<init>()
            com.google.android.exoplayer2.audio.DefaultAudioSink$Builder r4 = r0.setAudioProcessors(r4)
            com.google.android.exoplayer2.audio.DefaultAudioSink r4 = r4.build()
            r1.<init>(r2, r3, r4)
            return
    }

    private boolean shouldOutputFloat(com.google.android.exoplayer2.Format r6) {
            r5 = this;
            r0 = 2
            boolean r1 = r5.sinkSupportsFormat(r6, r0)
            r2 = 1
            if (r1 != 0) goto L9
            return r2
        L9:
            r1 = 4
            int r3 = r6.channelCount
            int r4 = r6.sampleRate
            com.google.android.exoplayer2.Format r1 = com.google.android.exoplayer2.util.Util.getPcmFormat(r1, r3, r4)
            int r1 = r5.getSinkFormatSupport(r1)
            if (r1 == r0) goto L1a
            r6 = 0
            return r6
        L1a:
            java.lang.String r6 = r6.sampleMimeType
            java.lang.String r0 = "audio/ac3"
            boolean r6 = r0.equals(r6)
            r6 = r6 ^ r2
            return r6
    }

    private boolean sinkSupportsFormat(com.google.android.exoplayer2.Format r2, int r3) {
            r1 = this;
            int r0 = r2.channelCount
            int r2 = r2.sampleRate
            com.google.android.exoplayer2.Format r2 = com.google.android.exoplayer2.util.Util.getPcmFormat(r3, r0, r2)
            boolean r2 = r1.sinkSupportsFormat(r2)
            return r2
    }

    @Override // com.google.android.exoplayer2.audio.DecoderAudioRenderer
    public final com.google.android.exoplayer2.decoder.Decoder createDecoder(com.google.android.exoplayer2.Format r8) throws com.google.android.exoplayer2.decoder.DecoderException {
            r7 = this;
            java.lang.String r0 = "createFfmpegAudioDecoder"
            com.google.android.exoplayer2.util.TraceUtil.beginSection(r0)
            int r0 = r8.maxInputSize
            r1 = -1
            if (r0 == r1) goto Lc
            r5 = r0
            goto L10
        Lc:
            r0 = 5760(0x1680, float:8.071E-42)
            r5 = 5760(0x1680, float:8.071E-42)
        L10:
            com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioDecoder r0 = new com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioDecoder
            r3 = 16
            r4 = 16
            boolean r6 = r7.shouldOutputFloat(r8)
            r1 = r0
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            com.google.android.exoplayer2.util.TraceUtil.endSection()
            return r0
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = "FfmpegAudioRenderer"
            return r0
    }

    @Override // com.google.android.exoplayer2.audio.DecoderAudioRenderer
    public /* bridge */ /* synthetic */ com.google.android.exoplayer2.Format getOutputFormat(com.google.android.exoplayer2.decoder.Decoder r1) {
            r0 = this;
            com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioDecoder r1 = (com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioDecoder) r1
            com.google.android.exoplayer2.Format r1 = r0.getOutputFormat(r1)
            return r1
    }

    public com.google.android.exoplayer2.Format getOutputFormat(com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioDecoder r3) {
            r2 = this;
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
            com.google.android.exoplayer2.Format$Builder r0 = new com.google.android.exoplayer2.Format$Builder
            r0.<init>()
            java.lang.String r1 = "audio/raw"
            com.google.android.exoplayer2.Format$Builder r0 = r0.setSampleMimeType(r1)
            int r1 = r3.getChannelCount()
            com.google.android.exoplayer2.Format$Builder r0 = r0.setChannelCount(r1)
            int r1 = r3.getSampleRate()
            com.google.android.exoplayer2.Format$Builder r0 = r0.setSampleRate(r1)
            int r3 = r3.getEncoding()
            com.google.android.exoplayer2.Format$Builder r3 = r0.setPcmEncoding(r3)
            com.google.android.exoplayer2.Format r3 = r3.build()
            return r3
    }

    @Override // com.google.android.exoplayer2.audio.DecoderAudioRenderer
    public final int supportsFormatInternal(com.google.android.exoplayer2.Format r4) {
            r3 = this;
            java.lang.String r0 = r4.sampleMimeType
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = com.google.android.exoplayer2.ext.ffmpeg.FfmpegLibrary.isAvailable()
            if (r1 == 0) goto L32
            boolean r1 = com.google.android.exoplayer2.util.MimeTypes.isAudio(r0)
            if (r1 != 0) goto L15
            goto L32
        L15:
            boolean r0 = com.google.android.exoplayer2.ext.ffmpeg.FfmpegLibrary.supportsFormat(r0)
            if (r0 == 0) goto L30
            r0 = 2
            boolean r1 = r3.sinkSupportsFormat(r4, r0)
            r2 = 4
            if (r1 != 0) goto L2a
            boolean r1 = r3.sinkSupportsFormat(r4, r2)
            if (r1 != 0) goto L2a
            goto L30
        L2a:
            int r4 = r4.cryptoType
            if (r4 == 0) goto L2f
            return r0
        L2f:
            return r2
        L30:
            r4 = 1
            return r4
        L32:
            r4 = 0
            return r4
    }

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.RendererCapabilities
    public final int supportsMixedMimeTypeAdaptation() {
            r1 = this;
            r0 = 8
            return r0
    }
}
