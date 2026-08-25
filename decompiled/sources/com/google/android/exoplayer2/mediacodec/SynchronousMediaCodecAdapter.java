package com.google.android.exoplayer2.mediacodec;

/* JADX INFO: loaded from: classes2.dex */
public final class SynchronousMediaCodecAdapter implements com.google.android.exoplayer2.mediacodec.MediaCodecAdapter {
    private final android.media.MediaCodec codec;

    @androidx.annotation.Nullable
    private java.nio.ByteBuffer[] inputByteBuffers;

    @androidx.annotation.Nullable
    private java.nio.ByteBuffer[] outputByteBuffers;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.SynchronousMediaCodecAdapter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class Factory implements com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Factory {
        public Factory() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Factory
        public com.google.android.exoplayer2.mediacodec.MediaCodecAdapter createAdapter(com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Configuration r6) throws java.io.IOException {
                r5 = this;
                r0 = 0
                android.media.MediaCodec r1 = r5.createCodec(r6)     // Catch: java.lang.RuntimeException -> L2f java.io.IOException -> L31
                java.lang.String r2 = "configureCodec"
                com.google.android.exoplayer2.util.TraceUtil.beginSection(r2)     // Catch: java.lang.RuntimeException -> L2a java.io.IOException -> L2c
                android.media.MediaFormat r2 = r6.mediaFormat     // Catch: java.lang.RuntimeException -> L2a java.io.IOException -> L2c
                android.view.Surface r3 = r6.surface     // Catch: java.lang.RuntimeException -> L2a java.io.IOException -> L2c
                android.media.MediaCrypto r4 = r6.crypto     // Catch: java.lang.RuntimeException -> L2a java.io.IOException -> L2c
                int r6 = r6.flags     // Catch: java.lang.RuntimeException -> L2a java.io.IOException -> L2c
                r1.configure(r2, r3, r4, r6)     // Catch: java.lang.RuntimeException -> L2a java.io.IOException -> L2c
                com.google.android.exoplayer2.util.TraceUtil.endSection()     // Catch: java.lang.RuntimeException -> L2a java.io.IOException -> L2c
                java.lang.String r6 = "startCodec"
                com.google.android.exoplayer2.util.TraceUtil.beginSection(r6)     // Catch: java.lang.RuntimeException -> L2a java.io.IOException -> L2c
                r1.start()     // Catch: java.lang.RuntimeException -> L2a java.io.IOException -> L2c
                com.google.android.exoplayer2.util.TraceUtil.endSection()     // Catch: java.lang.RuntimeException -> L2a java.io.IOException -> L2c
                com.google.android.exoplayer2.mediacodec.SynchronousMediaCodecAdapter r6 = new com.google.android.exoplayer2.mediacodec.SynchronousMediaCodecAdapter     // Catch: java.lang.RuntimeException -> L2a java.io.IOException -> L2c
                r6.<init>(r1, r0)     // Catch: java.lang.RuntimeException -> L2a java.io.IOException -> L2c
                return r6
            L2a:
                r6 = move-exception
                goto L2d
            L2c:
                r6 = move-exception
            L2d:
                r0 = r1
                goto L32
            L2f:
                r6 = move-exception
                goto L32
            L31:
                r6 = move-exception
            L32:
                if (r0 == 0) goto L37
                r0.release()
            L37:
                throw r6
        }

        public final android.media.MediaCodec createCodec(com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Configuration r3) throws java.io.IOException {
                r2 = this;
                com.google.android.exoplayer2.mediacodec.MediaCodecInfo r0 = r3.codecInfo
                com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
                com.google.android.exoplayer2.mediacodec.MediaCodecInfo r3 = r3.codecInfo
                java.lang.String r3 = r3.name
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "createCodec:"
                r0.append(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                com.google.android.exoplayer2.util.TraceUtil.beginSection(r0)
                android.media.MediaCodec r3 = android.media.MediaCodec.createByCodecName(r3)
                com.google.android.exoplayer2.util.TraceUtil.endSection()
                return r3
        }
    }

    public static /* synthetic */ void $r8$lambda$6rVPWL6LPrUurHA9gGPmM7irEkQ(com.google.android.exoplayer2.mediacodec.SynchronousMediaCodecAdapter r0, com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.OnFrameRenderedListener r1, android.media.MediaCodec r2, long r3, long r5) {
            r0.lambda$setOnFrameRenderedListener$0(r1, r2, r3, r5)
            return
    }

    private SynchronousMediaCodecAdapter(android.media.MediaCodec r3) {
            r2 = this;
            r2.<init>()
            r2.codec = r3
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 21
            if (r0 >= r1) goto L17
            java.nio.ByteBuffer[] r0 = r3.getInputBuffers()
            r2.inputByteBuffers = r0
            java.nio.ByteBuffer[] r3 = r3.getOutputBuffers()
            r2.outputByteBuffers = r3
        L17:
            return
    }

    public /* synthetic */ SynchronousMediaCodecAdapter(android.media.MediaCodec r1, com.google.android.exoplayer2.mediacodec.SynchronousMediaCodecAdapter.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private /* synthetic */ void lambda$setOnFrameRenderedListener$0(com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.OnFrameRenderedListener r7, android.media.MediaCodec r8, long r9, long r11) {
            r6 = this;
            r0 = r7
            r1 = r6
            r2 = r9
            r4 = r11
            r0.onFrameRendered(r1, r2, r4)
            return
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public int dequeueInputBufferIndex() {
            r3 = this;
            android.media.MediaCodec r0 = r3.codec
            r1 = 0
            int r0 = r0.dequeueInputBuffer(r1)
            return r0
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public int dequeueOutputBufferIndex(android.media.MediaCodec.BufferInfo r5) {
            r4 = this;
        L0:
            android.media.MediaCodec r0 = r4.codec
            r1 = 0
            int r0 = r0.dequeueOutputBuffer(r5, r1)
            r1 = -3
            if (r0 != r1) goto L19
            int r2 = com.google.android.exoplayer2.util.Util.SDK_INT
            r3 = 21
            if (r2 >= r3) goto L19
            android.media.MediaCodec r2 = r4.codec
            java.nio.ByteBuffer[] r2 = r2.getOutputBuffers()
            r4.outputByteBuffers = r2
        L19:
            if (r0 == r1) goto L0
            return r0
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void flush() {
            r1 = this;
            android.media.MediaCodec r0 = r1.codec
            r0.flush()
            return
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    @androidx.annotation.Nullable
    public java.nio.ByteBuffer getInputBuffer(int r3) {
            r2 = this;
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 21
            if (r0 < r1) goto Ld
            android.media.MediaCodec r0 = r2.codec
            java.nio.ByteBuffer r3 = r0.getInputBuffer(r3)
            return r3
        Ld:
            java.nio.ByteBuffer[] r0 = r2.inputByteBuffers
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            java.nio.ByteBuffer[] r0 = (java.nio.ByteBuffer[]) r0
            r3 = r0[r3]
            return r3
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    @androidx.annotation.RequiresApi(26)
    public android.os.PersistableBundle getMetrics() {
            r1 = this;
            android.media.MediaCodec r0 = r1.codec
            android.os.PersistableBundle r0 = r0.getMetrics()
            return r0
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    @androidx.annotation.Nullable
    public java.nio.ByteBuffer getOutputBuffer(int r3) {
            r2 = this;
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 21
            if (r0 < r1) goto Ld
            android.media.MediaCodec r0 = r2.codec
            java.nio.ByteBuffer r3 = r0.getOutputBuffer(r3)
            return r3
        Ld:
            java.nio.ByteBuffer[] r0 = r2.outputByteBuffers
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            java.nio.ByteBuffer[] r0 = (java.nio.ByteBuffer[]) r0
            r3 = r0[r3]
            return r3
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public android.media.MediaFormat getOutputFormat() {
            r1 = this;
            android.media.MediaCodec r0 = r1.codec
            android.media.MediaFormat r0 = r0.getOutputFormat()
            return r0
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public boolean needsReconfiguration() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void queueInputBuffer(int r8, int r9, int r10, long r11, int r13) {
            r7 = this;
            android.media.MediaCodec r0 = r7.codec
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r13
            r0.queueInputBuffer(r1, r2, r3, r4, r6)
            return
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void queueSecureInputBuffer(int r8, int r9, com.google.android.exoplayer2.decoder.CryptoInfo r10, long r11, int r13) {
            r7 = this;
            android.media.MediaCodec r0 = r7.codec
            android.media.MediaCodec$CryptoInfo r3 = r10.getFrameworkCryptoInfo()
            r1 = r8
            r2 = r9
            r4 = r11
            r6 = r13
            r0.queueSecureInputBuffer(r1, r2, r3, r4, r6)
            return
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void release() {
            r1 = this;
            r0 = 0
            r1.inputByteBuffers = r0
            r1.outputByteBuffers = r0
            android.media.MediaCodec r0 = r1.codec
            r0.release()
            return
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    @androidx.annotation.RequiresApi(21)
    public void releaseOutputBuffer(int r2, long r3) {
            r1 = this;
            android.media.MediaCodec r0 = r1.codec
            r0.releaseOutputBuffer(r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void releaseOutputBuffer(int r2, boolean r3) {
            r1 = this;
            android.media.MediaCodec r0 = r1.codec
            r0.releaseOutputBuffer(r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    @androidx.annotation.RequiresApi(23)
    public void setOnFrameRenderedListener(com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.OnFrameRenderedListener r4, android.os.Handler r5) {
            r3 = this;
            android.media.MediaCodec r0 = r3.codec
            com.google.android.exoplayer2.mediacodec.SynchronousMediaCodecAdapter$$ExternalSyntheticLambda0 r1 = new com.google.android.exoplayer2.mediacodec.SynchronousMediaCodecAdapter$$ExternalSyntheticLambda0
            r2 = 0
            r1.<init>(r3, r4, r2)
            r0.setOnFrameRenderedListener(r1, r5)
            return
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    @androidx.annotation.RequiresApi(23)
    public void setOutputSurface(android.view.Surface r2) {
            r1 = this;
            android.media.MediaCodec r0 = r1.codec
            r0.setOutputSurface(r2)
            return
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    @androidx.annotation.RequiresApi(19)
    public void setParameters(android.os.Bundle r2) {
            r1 = this;
            android.media.MediaCodec r0 = r1.codec
            r0.setParameters(r2)
            return
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void setVideoScalingMode(int r2) {
            r1 = this;
            android.media.MediaCodec r0 = r1.codec
            r0.setVideoScalingMode(r2)
            return
    }
}
