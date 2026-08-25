package com.google.android.exoplayer2.mediacodec;

/* JADX INFO: loaded from: classes.dex */
public class MediaCodecDecoderException extends com.google.android.exoplayer2.decoder.DecoderException {

    @androidx.annotation.Nullable
    public final com.google.android.exoplayer2.mediacodec.MediaCodecInfo codecInfo;

    @androidx.annotation.Nullable
    public final java.lang.String diagnosticInfo;

    public MediaCodecDecoderException(java.lang.Throwable r4, @androidx.annotation.Nullable com.google.android.exoplayer2.mediacodec.MediaCodecInfo r5) {
            r3 = this;
            java.lang.String r0 = "Decoder failed: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            r1 = 0
            if (r5 != 0) goto Lb
            r2 = r1
            goto Ld
        Lb:
            java.lang.String r2 = r5.name
        Ld:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0, r4)
            r3.codecInfo = r5
            int r5 = com.google.android.exoplayer2.util.Util.SDK_INT
            r0 = 21
            if (r5 < r0) goto L23
            java.lang.String r1 = getDiagnosticInfoV21(r4)
        L23:
            r3.diagnosticInfo = r1
            return
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RequiresApi(21)
    private static java.lang.String getDiagnosticInfoV21(java.lang.Throwable r1) {
            boolean r0 = r1 instanceof android.media.MediaCodec.CodecException
            if (r0 == 0) goto Lb
            android.media.MediaCodec$CodecException r1 = (android.media.MediaCodec.CodecException) r1
            java.lang.String r1 = r1.getDiagnosticInfo()
            return r1
        Lb:
            r1 = 0
            return r1
    }
}
