package com.google.android.exoplayer2.ext.ffmpeg;

/* JADX INFO: loaded from: classes.dex */
public final class FfmpegDecoderException extends com.google.android.exoplayer2.decoder.DecoderException {
    public FfmpegDecoderException(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public FfmpegDecoderException(java.lang.Throwable r2) {
            r1 = this;
            java.lang.String r0 = "Unexpected decode error"
            r1.<init>(r0, r2)
            return
    }
}
