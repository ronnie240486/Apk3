package com.google.android.exoplayer2.mediacodec;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class MediaCodecUtil$$ExternalSyntheticLambda1 implements com.google.android.exoplayer2.mediacodec.MediaCodecUtil.ScoreProvider {
    public static final /* synthetic */ com.google.android.exoplayer2.mediacodec.MediaCodecUtil$$ExternalSyntheticLambda1 INSTANCE = null;
    public static final /* synthetic */ com.google.android.exoplayer2.mediacodec.MediaCodecUtil$$ExternalSyntheticLambda1 INSTANCE$1 = null;
    public final /* synthetic */ int $r8$classId;

    static {
            com.google.android.exoplayer2.mediacodec.MediaCodecUtil$$ExternalSyntheticLambda1 r0 = new com.google.android.exoplayer2.mediacodec.MediaCodecUtil$$ExternalSyntheticLambda1
            r1 = 0
            r0.<init>(r1)
            com.google.android.exoplayer2.mediacodec.MediaCodecUtil$$ExternalSyntheticLambda1.INSTANCE = r0
            com.google.android.exoplayer2.mediacodec.MediaCodecUtil$$ExternalSyntheticLambda1 r0 = new com.google.android.exoplayer2.mediacodec.MediaCodecUtil$$ExternalSyntheticLambda1
            r1 = 1
            r0.<init>(r1)
            com.google.android.exoplayer2.mediacodec.MediaCodecUtil$$ExternalSyntheticLambda1.INSTANCE$1 = r0
            return
    }

    public /* synthetic */ MediaCodecUtil$$ExternalSyntheticLambda1(int r1) {
            r0 = this;
            r0.$r8$classId = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.ScoreProvider
    public final int getScore(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.$r8$classId
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Ld
        L6:
            com.google.android.exoplayer2.mediacodec.MediaCodecInfo r2 = (com.google.android.exoplayer2.mediacodec.MediaCodecInfo) r2
            int r2 = com.google.android.exoplayer2.mediacodec.MediaCodecUtil.$r8$lambda$M5hE_IS4eQaB5hthj0ANtGFbvtc(r2)
            return r2
        Ld:
            com.google.android.exoplayer2.mediacodec.MediaCodecInfo r2 = (com.google.android.exoplayer2.mediacodec.MediaCodecInfo) r2
            int r2 = com.google.android.exoplayer2.mediacodec.MediaCodecUtil.$r8$lambda$TTOJv_ehB4NYXe2ACOCGkvLnFQ0(r2)
            return r2
    }
}
