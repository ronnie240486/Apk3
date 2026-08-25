package com.google.android.exoplayer2.mediacodec;

/* JADX INFO: loaded from: classes.dex */
public interface MediaCodecSelector {
    public static final com.google.android.exoplayer2.mediacodec.MediaCodecSelector DEFAULT = null;

    static {
            com.google.android.exoplayer2.mediacodec.MediaCodecSelector$$ExternalSyntheticLambda0 r0 = com.google.android.exoplayer2.mediacodec.MediaCodecSelector$$ExternalSyntheticLambda0.INSTANCE
            com.google.android.exoplayer2.mediacodec.MediaCodecSelector.DEFAULT = r0
            return
    }

    java.util.List<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> getDecoderInfos(java.lang.String r1, boolean r2, boolean r3) throws com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException;
}
