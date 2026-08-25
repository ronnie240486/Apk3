package com.google.android.exoplayer2.source;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ProgressiveMediaPeriod$$ExternalSyntheticLambda0 implements java.lang.Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ com.google.android.exoplayer2.source.ProgressiveMediaPeriod f$0;

    public /* synthetic */ ProgressiveMediaPeriod$$ExternalSyntheticLambda0(com.google.android.exoplayer2.source.ProgressiveMediaPeriod r1, int r2) {
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
                case 0: goto Lc;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L12
        L6:
            com.google.android.exoplayer2.source.ProgressiveMediaPeriod r0 = r1.f$0
            com.google.android.exoplayer2.source.ProgressiveMediaPeriod.m247$r8$lambda$zYW0OVFynku26QldoAcIygyX0(r0)
            return
        Lc:
            com.google.android.exoplayer2.source.ProgressiveMediaPeriod r0 = r1.f$0
            com.google.android.exoplayer2.source.ProgressiveMediaPeriod.$r8$lambda$CjLGsvCDk7eH0JF3BpHsaJTFROE(r0)
            return
        L12:
            com.google.android.exoplayer2.source.ProgressiveMediaPeriod r0 = r1.f$0
            com.google.android.exoplayer2.source.ProgressiveMediaPeriod.$r8$lambda$DoTcjDDrboxsJ7o5SQLDx6KLo0g(r0)
            return
    }
}
