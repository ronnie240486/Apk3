package com.google.android.exoplayer2.decoder;

/* JADX INFO: loaded from: classes3.dex */
public final class DecoderReuseEvaluation {
    public static final int DISCARD_REASON_APP_OVERRIDE = 4;
    public static final int DISCARD_REASON_AUDIO_CHANNEL_COUNT_CHANGED = 4096;
    public static final int DISCARD_REASON_AUDIO_ENCODING_CHANGED = 16384;
    public static final int DISCARD_REASON_AUDIO_SAMPLE_RATE_CHANGED = 8192;
    public static final int DISCARD_REASON_DRM_SESSION_CHANGED = 128;
    public static final int DISCARD_REASON_INITIALIZATION_DATA_CHANGED = 32;
    public static final int DISCARD_REASON_MAX_INPUT_SIZE_EXCEEDED = 64;
    public static final int DISCARD_REASON_MIME_TYPE_CHANGED = 8;
    public static final int DISCARD_REASON_OPERATING_RATE_CHANGED = 16;
    public static final int DISCARD_REASON_REUSE_NOT_IMPLEMENTED = 1;
    public static final int DISCARD_REASON_VIDEO_COLOR_INFO_CHANGED = 2048;
    public static final int DISCARD_REASON_VIDEO_MAX_RESOLUTION_EXCEEDED = 256;
    public static final int DISCARD_REASON_VIDEO_RESOLUTION_CHANGED = 512;
    public static final int DISCARD_REASON_VIDEO_ROTATION_CHANGED = 1024;
    public static final int DISCARD_REASON_WORKAROUND = 2;
    public static final int REUSE_RESULT_NO = 0;
    public static final int REUSE_RESULT_YES_WITHOUT_RECONFIGURATION = 3;
    public static final int REUSE_RESULT_YES_WITH_FLUSH = 1;
    public static final int REUSE_RESULT_YES_WITH_RECONFIGURATION = 2;
    public final java.lang.String decoderName;
    public final int discardReasons;
    public final com.google.android.exoplayer2.Format newFormat;
    public final com.google.android.exoplayer2.Format oldFormat;
    public final int result;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface DecoderDiscardReasons {
    }

    /* JADX INFO: loaded from: classes2.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface DecoderReuseResult {
    }

    public DecoderReuseEvaluation(java.lang.String r2, com.google.android.exoplayer2.Format r3, com.google.android.exoplayer2.Format r4, int r5, int r6) {
            r1 = this;
            r1.<init>()
            if (r5 == 0) goto La
            if (r6 != 0) goto L8
            goto La
        L8:
            r0 = 0
            goto Lb
        La:
            r0 = 1
        Lb:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            java.lang.String r2 = com.google.android.exoplayer2.util.Assertions.checkNotEmpty(r2)
            r1.decoderName = r2
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
            com.google.android.exoplayer2.Format r2 = (com.google.android.exoplayer2.Format) r2
            r1.oldFormat = r2
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r4)
            com.google.android.exoplayer2.Format r2 = (com.google.android.exoplayer2.Format) r2
            r1.newFormat = r2
            r1.result = r5
            r1.discardReasons = r6
            return
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L3f
            java.lang.Class<com.google.android.exoplayer2.decoder.DecoderReuseEvaluation> r2 = com.google.android.exoplayer2.decoder.DecoderReuseEvaluation.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L3f
        L10:
            com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r5 = (com.google.android.exoplayer2.decoder.DecoderReuseEvaluation) r5
            int r2 = r4.result
            int r3 = r5.result
            if (r2 != r3) goto L3d
            int r2 = r4.discardReasons
            int r3 = r5.discardReasons
            if (r2 != r3) goto L3d
            java.lang.String r2 = r4.decoderName
            java.lang.String r3 = r5.decoderName
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L3d
            com.google.android.exoplayer2.Format r2 = r4.oldFormat
            com.google.android.exoplayer2.Format r3 = r5.oldFormat
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L3d
            com.google.android.exoplayer2.Format r2 = r4.newFormat
            com.google.android.exoplayer2.Format r5 = r5.newFormat
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L3d
            goto L3e
        L3d:
            r0 = 0
        L3e:
            return r0
        L3f:
            return r1
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.result
            int r0 = r0 + 527
            int r0 = r0 * 31
            int r1 = r3.discardReasons
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r3.decoderName
            r2 = 31
            int r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r0, r2)
            com.google.android.exoplayer2.Format r1 = r3.oldFormat
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            com.google.android.exoplayer2.Format r0 = r3.newFormat
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            return r0
    }
}
