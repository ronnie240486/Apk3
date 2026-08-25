package com.google.android.exoplayer2;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ExoPlayer$Builder$$ExternalSyntheticLambda7 implements com.google.common.base.Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ com.google.android.exoplayer2.upstream.BandwidthMeter f$0;

    public /* synthetic */ ExoPlayer$Builder$$ExternalSyntheticLambda7(com.google.android.exoplayer2.upstream.BandwidthMeter r1, int r2) {
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
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Ld
        L6:
            com.google.android.exoplayer2.upstream.BandwidthMeter r0 = r1.f$0
            com.google.android.exoplayer2.upstream.BandwidthMeter r0 = com.google.android.exoplayer2.ExoPlayer.Builder.$r8$lambda$oo3zkIBuSRHGKH5Wllevbv6E0zQ(r0)
            return r0
        Ld:
            com.google.android.exoplayer2.upstream.BandwidthMeter r0 = r1.f$0
            com.google.android.exoplayer2.upstream.BandwidthMeter r0 = com.google.android.exoplayer2.ExoPlayer.Builder.$r8$lambda$vV2ws6spu9HrllkAonla3cX5pAE(r0)
            return r0
    }
}
