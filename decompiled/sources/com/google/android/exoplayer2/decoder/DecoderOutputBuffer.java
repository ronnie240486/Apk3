package com.google.android.exoplayer2.decoder;

/* JADX INFO: loaded from: classes.dex */
public abstract class DecoderOutputBuffer extends com.google.android.exoplayer2.decoder.Buffer {
    public int skippedOutputBufferCount;
    public long timeUs;

    public interface Owner<S extends com.google.android.exoplayer2.decoder.DecoderOutputBuffer> {
        void releaseOutputBuffer(S r1);
    }

    public DecoderOutputBuffer() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void release();
}
