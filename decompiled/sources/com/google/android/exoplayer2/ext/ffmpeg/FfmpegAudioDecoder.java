package com.google.android.exoplayer2.ext.ffmpeg;

/* JADX INFO: loaded from: classes3.dex */
final class FfmpegAudioDecoder extends com.google.android.exoplayer2.decoder.SimpleDecoder<com.google.android.exoplayer2.decoder.DecoderInputBuffer, com.google.android.exoplayer2.decoder.SimpleDecoderOutputBuffer, com.google.android.exoplayer2.ext.ffmpeg.FfmpegDecoderException> {
    private static final int AUDIO_DECODER_ERROR_INVALID_DATA = -1;
    private static final int AUDIO_DECODER_ERROR_OTHER = -2;
    private static final int OUTPUT_BUFFER_SIZE_16BIT = 65536;
    private static final int OUTPUT_BUFFER_SIZE_32BIT = 131072;
    private volatile int channelCount;
    private final java.lang.String codecName;
    private final int encoding;

    @androidx.annotation.Nullable
    private final byte[] extraData;
    private boolean hasOutputFormat;
    private long nativeContext;
    private final int outputBufferSize;
    private volatile int sampleRate;

    public FfmpegAudioDecoder(com.google.android.exoplayer2.Format r7, int r8, int r9, int r10, boolean r11) throws com.google.android.exoplayer2.ext.ffmpeg.FfmpegDecoderException {
            r6 = this;
            com.google.android.exoplayer2.decoder.DecoderInputBuffer[] r8 = new com.google.android.exoplayer2.decoder.DecoderInputBuffer[r8]
            com.google.android.exoplayer2.decoder.SimpleDecoderOutputBuffer[] r9 = new com.google.android.exoplayer2.decoder.SimpleDecoderOutputBuffer[r9]
            r6.<init>(r8, r9)
            boolean r8 = com.google.android.exoplayer2.ext.ffmpeg.FfmpegLibrary.isAvailable()
            if (r8 == 0) goto L59
            java.lang.String r8 = r7.sampleMimeType
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r8)
            java.lang.String r8 = r7.sampleMimeType
            java.lang.String r8 = com.google.android.exoplayer2.ext.ffmpeg.FfmpegLibrary.getCodecName(r8)
            java.lang.Object r8 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r8)
            r1 = r8
            java.lang.String r1 = (java.lang.String) r1
            r6.codecName = r1
            java.lang.String r8 = r7.sampleMimeType
            java.util.List<byte[]> r9 = r7.initializationData
            byte[] r2 = getExtraData(r8, r9)
            r6.extraData = r2
            if (r11 == 0) goto L2f
            r8 = 4
            goto L30
        L2f:
            r8 = 2
        L30:
            r6.encoding = r8
            if (r11 == 0) goto L37
            r8 = 131072(0x20000, float:1.83671E-40)
            goto L39
        L37:
            r8 = 65536(0x10000, float:9.1835E-41)
        L39:
            r6.outputBufferSize = r8
            int r4 = r7.sampleRate
            int r5 = r7.channelCount
            r0 = r6
            r3 = r11
            long r7 = r0.ffmpegInitialize(r1, r2, r3, r4, r5)
            r6.nativeContext = r7
            r0 = 0
            int r9 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r9 == 0) goto L51
            r6.setInitialInputBufferSize(r10)
            return
        L51:
            com.google.android.exoplayer2.ext.ffmpeg.FfmpegDecoderException r7 = new com.google.android.exoplayer2.ext.ffmpeg.FfmpegDecoderException
            java.lang.String r8 = "Initialization failed."
            r7.<init>(r8)
            throw r7
        L59:
            com.google.android.exoplayer2.ext.ffmpeg.FfmpegDecoderException r7 = new com.google.android.exoplayer2.ext.ffmpeg.FfmpegDecoderException
            java.lang.String r8 = "Failed to load decoder native libraries."
            r7.<init>(r8)
            throw r7
    }

    private native int ffmpegDecode(long r1, java.nio.ByteBuffer r3, int r4, java.nio.ByteBuffer r5, int r6);

    private native int ffmpegGetChannelCount(long r1);

    private native int ffmpegGetSampleRate(long r1);

    private native long ffmpegInitialize(java.lang.String r1, @androidx.annotation.Nullable byte[] r2, boolean r3, int r4, int r5);

    private native void ffmpegRelease(long r1);

    private native long ffmpegReset(long r1, @androidx.annotation.Nullable byte[] r3);

    private static byte[] getAlacExtraData(java.util.List<byte[]> r3) {
            r0 = 0
            java.lang.Object r3 = r3.get(r0)
            byte[] r3 = (byte[]) r3
            int r1 = r3.length
            int r1 = r1 + 12
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r1)
            r2.putInt(r1)
            r1 = 1634492771(0x616c6163, float:2.7252807E20)
            r2.putInt(r1)
            r2.putInt(r0)
            int r1 = r3.length
            r2.put(r3, r0, r1)
            byte[] r3 = r2.array()
            return r3
    }

    @androidx.annotation.Nullable
    private static byte[] getExtraData(java.lang.String r3, java.util.List<byte[]> r4) {
            java.util.Objects.requireNonNull(r3)
            int r0 = r3.hashCode()
            r1 = 0
            r2 = -1
            switch(r0) {
                case -1003765268: goto L2e;
                case -53558318: goto L23;
                case 1504470054: goto L18;
                case 1504891608: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L38
        Ld:
            java.lang.String r0 = "audio/opus"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L16
            goto L38
        L16:
            r2 = 3
            goto L38
        L18:
            java.lang.String r0 = "audio/alac"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L21
            goto L38
        L21:
            r2 = 2
            goto L38
        L23:
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L2c
            goto L38
        L2c:
            r2 = 1
            goto L38
        L2e:
            java.lang.String r0 = "audio/vorbis"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L37
            goto L38
        L37:
            r2 = 0
        L38:
            switch(r2) {
                case 0: goto L49;
                case 1: goto L42;
                case 2: goto L3d;
                case 3: goto L42;
                default: goto L3b;
            }
        L3b:
            r3 = 0
            return r3
        L3d:
            byte[] r3 = getAlacExtraData(r4)
            return r3
        L42:
            java.lang.Object r3 = r4.get(r1)
            byte[] r3 = (byte[]) r3
            return r3
        L49:
            byte[] r3 = getVorbisExtraData(r4)
            return r3
    }

    private static byte[] getVorbisExtraData(java.util.List<byte[]> r5) {
            r0 = 0
            java.lang.Object r1 = r5.get(r0)
            byte[] r1 = (byte[]) r1
            r2 = 1
            java.lang.Object r5 = r5.get(r2)
            byte[] r5 = (byte[]) r5
            int r3 = r1.length
            int r4 = r5.length
            int r3 = r3 + r4
            int r3 = r3 + 6
            byte[] r3 = new byte[r3]
            int r4 = r1.length
            int r4 = r4 >> 8
            byte r4 = (byte) r4
            r3[r0] = r4
            int r4 = r1.length
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r3[r2] = r4
            int r2 = r1.length
            r4 = 2
            java.lang.System.arraycopy(r1, r0, r3, r4, r2)
            int r2 = r1.length
            int r2 = r2 + r4
            r3[r2] = r0
            int r2 = r1.length
            int r2 = r2 + 3
            r3[r2] = r0
            int r2 = r1.length
            int r2 = r2 + 4
            int r4 = r5.length
            int r4 = r4 >> 8
            byte r4 = (byte) r4
            r3[r2] = r4
            int r2 = r1.length
            int r2 = r2 + 5
            int r4 = r5.length
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r3[r2] = r4
            int r1 = r1.length
            int r1 = r1 + 6
            int r2 = r5.length
            java.lang.System.arraycopy(r5, r0, r3, r1, r2)
            return r3
    }

    @Override // com.google.android.exoplayer2.decoder.SimpleDecoder
    public final com.google.android.exoplayer2.decoder.DecoderInputBuffer createInputBuffer() {
            r3 = this;
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r0 = new com.google.android.exoplayer2.decoder.DecoderInputBuffer
            int r1 = com.google.android.exoplayer2.ext.ffmpeg.FfmpegLibrary.getInputBufferPaddingSize()
            r2 = 2
            r0.<init>(r2, r1)
            return r0
    }

    @Override // com.google.android.exoplayer2.decoder.SimpleDecoder
    public final com.google.android.exoplayer2.decoder.DecoderOutputBuffer createOutputBuffer() {
            r2 = this;
            com.google.android.exoplayer2.decoder.SimpleDecoderOutputBuffer r0 = new com.google.android.exoplayer2.decoder.SimpleDecoderOutputBuffer
            com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioDecoder$$ExternalSyntheticLambda0 r1 = new com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioDecoder$$ExternalSyntheticLambda0
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.android.exoplayer2.decoder.SimpleDecoder
    public final com.google.android.exoplayer2.decoder.DecoderException createUnexpectedDecodeException(java.lang.Throwable r2) {
            r1 = this;
            com.google.android.exoplayer2.ext.ffmpeg.FfmpegDecoderException r0 = new com.google.android.exoplayer2.ext.ffmpeg.FfmpegDecoderException
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.android.exoplayer2.decoder.SimpleDecoder
    @androidx.annotation.Nullable
    public final com.google.android.exoplayer2.decoder.DecoderException decode(com.google.android.exoplayer2.decoder.DecoderInputBuffer r8, com.google.android.exoplayer2.decoder.DecoderOutputBuffer r9, boolean r10) {
            r7 = this;
            com.google.android.exoplayer2.decoder.SimpleDecoderOutputBuffer r9 = (com.google.android.exoplayer2.decoder.SimpleDecoderOutputBuffer) r9
            if (r10 == 0) goto L1d
            long r0 = r7.nativeContext
            byte[] r10 = r7.extraData
            long r0 = r7.ffmpegReset(r0, r10)
            r7.nativeContext = r0
            r2 = 0
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 != 0) goto L1d
            com.google.android.exoplayer2.ext.ffmpeg.FfmpegDecoderException r8 = new com.google.android.exoplayer2.ext.ffmpeg.FfmpegDecoderException
            java.lang.String r9 = "Error resetting (see logcat)."
            r8.<init>(r9)
            goto L9e
        L1d:
            java.nio.ByteBuffer r10 = r8.data
            java.lang.Object r10 = com.google.android.exoplayer2.util.Util.castNonNull(r10)
            r3 = r10
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r4 = r3.limit()
            long r0 = r8.timeUs
            int r8 = r7.outputBufferSize
            java.nio.ByteBuffer r8 = r9.init(r0, r8)
            long r1 = r7.nativeContext
            int r6 = r7.outputBufferSize
            r0 = r7
            r5 = r8
            int r10 = r0.ffmpegDecode(r1, r3, r4, r5, r6)
            r0 = -2
            if (r10 != r0) goto L47
            com.google.android.exoplayer2.ext.ffmpeg.FfmpegDecoderException r8 = new com.google.android.exoplayer2.ext.ffmpeg.FfmpegDecoderException
            java.lang.String r9 = "Error decoding (see logcat)."
            r8.<init>(r9)
            goto L9e
        L47:
            r0 = -1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 0
            if (r10 != r0) goto L51
            r9.setFlags(r1)
            goto L9d
        L51:
            if (r10 != 0) goto L57
            r9.setFlags(r1)
            goto L9d
        L57:
            boolean r9 = r7.hasOutputFormat
            if (r9 != 0) goto L96
            long r0 = r7.nativeContext
            int r9 = r7.ffmpegGetChannelCount(r0)
            r7.channelCount = r9
            long r0 = r7.nativeContext
            int r9 = r7.ffmpegGetSampleRate(r0)
            r7.sampleRate = r9
            int r9 = r7.sampleRate
            if (r9 != 0) goto L93
            java.lang.String r9 = r7.codecName
            java.lang.String r0 = "alac"
            boolean r9 = r0.equals(r9)
            if (r9 == 0) goto L93
            byte[] r9 = r7.extraData
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r9)
            com.google.android.exoplayer2.util.ParsableByteArray r9 = new com.google.android.exoplayer2.util.ParsableByteArray
            byte[] r0 = r7.extraData
            r9.<init>(r0)
            byte[] r0 = r7.extraData
            int r0 = r0.length
            int r0 = r0 + (-4)
            r9.setPosition(r0)
            int r9 = r9.readUnsignedIntToInt()
            r7.sampleRate = r9
        L93:
            r9 = 1
            r7.hasOutputFormat = r9
        L96:
            r9 = 0
            r8.position(r9)
            r8.limit(r10)
        L9d:
            r8 = r2
        L9e:
            return r8
    }

    public int getChannelCount() {
            r1 = this;
            int r0 = r1.channelCount
            return r0
    }

    public int getEncoding() {
            r1 = this;
            int r0 = r1.encoding
            return r0
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public java.lang.String getName() {
            r2 = this;
            java.lang.String r0 = "ffmpeg"
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = com.google.android.exoplayer2.ext.ffmpeg.FfmpegLibrary.getVersion()
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            java.lang.String r1 = r2.codecName
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public int getSampleRate() {
            r1 = this;
            int r0 = r1.sampleRate
            return r0
    }

    @Override // com.google.android.exoplayer2.decoder.SimpleDecoder, com.google.android.exoplayer2.decoder.Decoder
    public void release() {
            r2 = this;
            super.release()
            long r0 = r2.nativeContext
            r2.ffmpegRelease(r0)
            r0 = 0
            r2.nativeContext = r0
            return
    }
}
