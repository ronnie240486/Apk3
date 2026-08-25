package com.google.android.exoplayer2.mediacodec;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class SynchronousMediaCodecAdapter$$ExternalSyntheticLambda0 implements android.media.MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ java.lang.Object f$0;
    public final /* synthetic */ com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.OnFrameRenderedListener f$1;

    public /* synthetic */ SynchronousMediaCodecAdapter$$ExternalSyntheticLambda0(java.lang.Object r1, com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.OnFrameRenderedListener r2, int r3) {
            r0 = this;
            r0.$r8$classId = r3
            r0.f$0 = r1
            r0.f$1 = r2
            r0.<init>()
            return
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(android.media.MediaCodec r9, long r10, long r12) {
            r8 = this;
            int r0 = r8.$r8$classId
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L14
        L6:
            java.lang.Object r0 = r8.f$0
            r1 = r0
            com.google.android.exoplayer2.mediacodec.SynchronousMediaCodecAdapter r1 = (com.google.android.exoplayer2.mediacodec.SynchronousMediaCodecAdapter) r1
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter$OnFrameRenderedListener r2 = r8.f$1
            r3 = r9
            r4 = r10
            r6 = r12
            com.google.android.exoplayer2.mediacodec.SynchronousMediaCodecAdapter.$r8$lambda$6rVPWL6LPrUurHA9gGPmM7irEkQ(r1, r2, r3, r4, r6)
            return
        L14:
            java.lang.Object r0 = r8.f$0
            r1 = r0
            com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecAdapter r1 = (com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecAdapter) r1
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter$OnFrameRenderedListener r2 = r8.f$1
            r3 = r9
            r4 = r10
            r6 = r12
            com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecAdapter.$r8$lambda$IJnLA9QP9osm5ZMSm9y9AUj01V0(r1, r2, r3, r4, r6)
            return
    }
}
