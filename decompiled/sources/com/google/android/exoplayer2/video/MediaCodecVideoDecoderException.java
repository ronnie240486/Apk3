package com.google.android.exoplayer2.video;

/* JADX INFO: loaded from: classes.dex */
public class MediaCodecVideoDecoderException extends com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException {
    public final boolean isSurfaceValid;
    public final int surfaceIdentityHashCode;

    public MediaCodecVideoDecoderException(java.lang.Throwable r1, @androidx.annotation.Nullable com.google.android.exoplayer2.mediacodec.MediaCodecInfo r2, @androidx.annotation.Nullable android.view.Surface r3) {
            r0 = this;
            r0.<init>(r1, r2)
            int r1 = java.lang.System.identityHashCode(r3)
            r0.surfaceIdentityHashCode = r1
            if (r3 == 0) goto L14
            boolean r1 = r3.isValid()
            if (r1 == 0) goto L12
            goto L14
        L12:
            r1 = 0
            goto L15
        L14:
            r1 = 1
        L15:
            r0.isSurfaceValid = r1
            return
    }
}
