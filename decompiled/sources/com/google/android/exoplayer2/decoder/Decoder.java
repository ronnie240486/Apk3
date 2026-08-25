package com.google.android.exoplayer2.decoder;

import com.google.android.exoplayer2.decoder.DecoderException;

/* JADX INFO: loaded from: classes2.dex */
public interface Decoder<I, O, E extends com.google.android.exoplayer2.decoder.DecoderException> {
    @androidx.annotation.Nullable
    I dequeueInputBuffer() throws com.google.android.exoplayer2.decoder.DecoderException;

    @androidx.annotation.Nullable
    O dequeueOutputBuffer() throws com.google.android.exoplayer2.decoder.DecoderException;

    void flush();

    java.lang.String getName();

    void queueInputBuffer(I r1) throws com.google.android.exoplayer2.decoder.DecoderException;

    void release();
}
