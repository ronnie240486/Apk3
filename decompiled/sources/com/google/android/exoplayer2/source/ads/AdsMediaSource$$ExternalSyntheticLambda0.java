package com.google.android.exoplayer2.source.ads;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class AdsMediaSource$$ExternalSyntheticLambda0 implements java.lang.Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ com.google.android.exoplayer2.source.ads.AdsMediaSource f$0;
    public final /* synthetic */ com.google.android.exoplayer2.source.ads.AdsMediaSource.ComponentListener f$1;

    public /* synthetic */ AdsMediaSource$$ExternalSyntheticLambda0(com.google.android.exoplayer2.source.ads.AdsMediaSource r1, com.google.android.exoplayer2.source.ads.AdsMediaSource.ComponentListener r2, int r3) {
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
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Le
        L6:
            com.google.android.exoplayer2.source.ads.AdsMediaSource r0 = r2.f$0
            com.google.android.exoplayer2.source.ads.AdsMediaSource$ComponentListener r1 = r2.f$1
            com.google.android.exoplayer2.source.ads.AdsMediaSource.$r8$lambda$AgVPpigbCJhxxQjVVqQPnZy0Xkc(r0, r1)
            return
        Le:
            com.google.android.exoplayer2.source.ads.AdsMediaSource r0 = r2.f$0
            com.google.android.exoplayer2.source.ads.AdsMediaSource$ComponentListener r1 = r2.f$1
            com.google.android.exoplayer2.source.ads.AdsMediaSource.m252$r8$lambda$1m7XF1umsWz9SdpDX3nvldjhmE(r0, r1)
            return
    }
}
