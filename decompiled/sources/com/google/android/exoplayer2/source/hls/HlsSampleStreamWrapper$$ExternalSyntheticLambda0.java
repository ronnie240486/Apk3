package com.google.android.exoplayer2.source.hls;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class HlsSampleStreamWrapper$$ExternalSyntheticLambda0 implements java.lang.Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ java.lang.Object f$0;

    public /* synthetic */ HlsSampleStreamWrapper$$ExternalSyntheticLambda0(java.lang.Object r1, int r2) {
            r0 = this;
            r0.$r8$classId = r2
            r0.f$0 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            int r0 = r1.$r8$classId
            switch(r0) {
                case 0: goto Le;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L16
        L6:
            java.lang.Object r0 = r1.f$0
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper r0 = (com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper) r0
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper.$r8$lambda$6vTR3mtGTvT72nPYfSpGJ3S1EYI(r0)
            return
        Le:
            java.lang.Object r0 = r1.f$0
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper r0 = (com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper) r0
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper.$r8$lambda$FTpP0pC43I2Fmbrry86yPSv4RFI(r0)
            return
        L16:
            java.lang.Object r0 = r1.f$0
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$Callback r0 = (com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper.Callback) r0
            r0.onPrepared()
            return
    }
}
