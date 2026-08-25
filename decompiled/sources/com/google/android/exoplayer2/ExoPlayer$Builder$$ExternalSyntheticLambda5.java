package com.google.android.exoplayer2;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ExoPlayer$Builder$$ExternalSyntheticLambda5 implements com.google.common.base.Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ com.google.android.exoplayer2.source.MediaSource.Factory f$0;

    public /* synthetic */ ExoPlayer$Builder$$ExternalSyntheticLambda5(com.google.android.exoplayer2.source.MediaSource.Factory r1, int r2) {
            r0 = this;
            r0.$r8$classId = r2
            r0.f$0 = r1
            r0.<init>()
            return
    }

    @Override // com.google.common.base.Supplier
    public final java.lang.Object get() {
            r1 = this;
            int r0 = r1.$r8$classId
            switch(r0) {
                case 0: goto L14;
                case 1: goto Ld;
                case 2: goto L6;
                default: goto L5;
            }
        L5:
            goto L1b
        L6:
            com.google.android.exoplayer2.source.MediaSource$Factory r0 = r1.f$0
            com.google.android.exoplayer2.source.MediaSource$Factory r0 = com.google.android.exoplayer2.ExoPlayer.Builder.$r8$lambda$FVGxm2JpOVcFlwB1cAh714eUqVk(r0)
            return r0
        Ld:
            com.google.android.exoplayer2.source.MediaSource$Factory r0 = r1.f$0
            com.google.android.exoplayer2.source.MediaSource$Factory r0 = com.google.android.exoplayer2.ExoPlayer.Builder.$r8$lambda$xaIUF2R5Kj_Z3uEuTnshj59N0mk(r0)
            return r0
        L14:
            com.google.android.exoplayer2.source.MediaSource$Factory r0 = r1.f$0
            com.google.android.exoplayer2.source.MediaSource$Factory r0 = com.google.android.exoplayer2.ExoPlayer.Builder.$r8$lambda$AbdGeuic6Ij7iyVMd3YeZb6E_JE(r0)
            return r0
        L1b:
            com.google.android.exoplayer2.source.MediaSource$Factory r0 = r1.f$0
            com.google.android.exoplayer2.source.MediaSource$Factory r0 = com.google.android.exoplayer2.ExoPlayer.Builder.$r8$lambda$RkxSve2SE5dmiz3L8pZhHD8VZVo(r0)
            return r0
    }
}
