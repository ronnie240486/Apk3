package com.google.android.exoplayer2.source.ads;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class AdsMediaSource$AdPrepareListener$$ExternalSyntheticLambda0 implements java.lang.Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ java.lang.Object f$0;
    public final /* synthetic */ java.lang.Object f$1;

    public /* synthetic */ AdsMediaSource$AdPrepareListener$$ExternalSyntheticLambda0(java.lang.Object r1, java.lang.Object r2, int r3) {
            r0 = this;
            r0.$r8$classId = r3
            r0.f$0 = r1
            r0.f$1 = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            int r0 = r2.$r8$classId
            switch(r0) {
                case 0: goto L12;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L1e
        L6:
            java.lang.Object r0 = r2.f$0
            com.google.android.exoplayer2.source.ads.AdsMediaSource$ComponentListener r0 = (com.google.android.exoplayer2.source.ads.AdsMediaSource.ComponentListener) r0
            java.lang.Object r1 = r2.f$1
            com.google.android.exoplayer2.source.ads.AdPlaybackState r1 = (com.google.android.exoplayer2.source.ads.AdPlaybackState) r1
            com.google.android.exoplayer2.source.ads.AdsMediaSource.ComponentListener.m254$r8$lambda$0nPEDqeEt9IJPXJ3J126o4e0MQ(r0, r1)
            return
        L12:
            java.lang.Object r0 = r2.f$0
            com.google.android.exoplayer2.source.ads.AdsMediaSource$AdPrepareListener r0 = (com.google.android.exoplayer2.source.ads.AdsMediaSource.AdPrepareListener) r0
            java.lang.Object r1 = r2.f$1
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = (com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) r1
            com.google.android.exoplayer2.source.ads.AdsMediaSource.AdPrepareListener.m253$r8$lambda$iaOFHOi1HiE_ynOUr4SbIaoCVc(r0, r1)
            return
        L1e:
            java.lang.Object r0 = r2.f$0
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource r0 = (com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource) r0
            java.lang.Object r1 = r2.f$1
            com.google.common.collect.ImmutableMap r1 = (com.google.common.collect.ImmutableMap) r1
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.m255$r8$lambda$_M_hyjEORwjoOtigaHohPfWjK4(r0, r1)
            return
    }
}
