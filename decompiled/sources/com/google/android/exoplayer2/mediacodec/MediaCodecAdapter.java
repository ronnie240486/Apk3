package com.google.android.exoplayer2.mediacodec;

/* JADX INFO: loaded from: classes2.dex */
public interface MediaCodecAdapter {

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Configuration {
        public final com.google.android.exoplayer2.mediacodec.MediaCodecInfo codecInfo;

        @androidx.annotation.Nullable
        public final android.media.MediaCrypto crypto;
        public final int flags;
        public final com.google.android.exoplayer2.Format format;
        public final android.media.MediaFormat mediaFormat;

        @androidx.annotation.Nullable
        public final android.view.Surface surface;

        private Configuration(com.google.android.exoplayer2.mediacodec.MediaCodecInfo r1, android.media.MediaFormat r2, com.google.android.exoplayer2.Format r3, @androidx.annotation.Nullable android.view.Surface r4, @androidx.annotation.Nullable android.media.MediaCrypto r5, int r6) {
                r0 = this;
                r0.<init>()
                r0.codecInfo = r1
                r0.mediaFormat = r2
                r0.format = r3
                r0.surface = r4
                r0.crypto = r5
                r0.flags = r6
                return
        }

        public static com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Configuration createForAudioDecoding(com.google.android.exoplayer2.mediacodec.MediaCodecInfo r8, android.media.MediaFormat r9, com.google.android.exoplayer2.Format r10, @androidx.annotation.Nullable android.media.MediaCrypto r11) {
                com.google.android.exoplayer2.mediacodec.MediaCodecAdapter$Configuration r7 = new com.google.android.exoplayer2.mediacodec.MediaCodecAdapter$Configuration
                r4 = 0
                r6 = 0
                r0 = r7
                r1 = r8
                r2 = r9
                r3 = r10
                r5 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r7
        }

        public static com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Configuration createForVideoDecoding(com.google.android.exoplayer2.mediacodec.MediaCodecInfo r8, android.media.MediaFormat r9, com.google.android.exoplayer2.Format r10, @androidx.annotation.Nullable android.view.Surface r11, @androidx.annotation.Nullable android.media.MediaCrypto r12) {
                com.google.android.exoplayer2.mediacodec.MediaCodecAdapter$Configuration r7 = new com.google.android.exoplayer2.mediacodec.MediaCodecAdapter$Configuration
                r6 = 0
                r0 = r7
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r11
                r5 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r7
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface Factory {
        public static final com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Factory DEFAULT = null;

        static {
                com.google.android.exoplayer2.mediacodec.DefaultMediaCodecAdapterFactory r0 = new com.google.android.exoplayer2.mediacodec.DefaultMediaCodecAdapterFactory
                r0.<init>()
                com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Factory.DEFAULT = r0
                return
        }

        com.google.android.exoplayer2.mediacodec.MediaCodecAdapter createAdapter(com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Configuration r1) throws java.io.IOException;
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface OnFrameRenderedListener {
        void onFrameRendered(com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r1, long r2, long r4);
    }

    int dequeueInputBufferIndex();

    int dequeueOutputBufferIndex(android.media.MediaCodec.BufferInfo r1);

    void flush();

    @androidx.annotation.Nullable
    java.nio.ByteBuffer getInputBuffer(int r1);

    @androidx.annotation.RequiresApi(26)
    android.os.PersistableBundle getMetrics();

    @androidx.annotation.Nullable
    java.nio.ByteBuffer getOutputBuffer(int r1);

    android.media.MediaFormat getOutputFormat();

    boolean needsReconfiguration();

    void queueInputBuffer(int r1, int r2, int r3, long r4, int r6);

    void queueSecureInputBuffer(int r1, int r2, com.google.android.exoplayer2.decoder.CryptoInfo r3, long r4, int r6);

    void release();

    @androidx.annotation.RequiresApi(21)
    void releaseOutputBuffer(int r1, long r2);

    void releaseOutputBuffer(int r1, boolean r2);

    @androidx.annotation.RequiresApi(23)
    void setOnFrameRenderedListener(com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.OnFrameRenderedListener r1, android.os.Handler r2);

    @androidx.annotation.RequiresApi(23)
    void setOutputSurface(android.view.Surface r1);

    @androidx.annotation.RequiresApi(19)
    void setParameters(android.os.Bundle r1);

    void setVideoScalingMode(int r1);
}
