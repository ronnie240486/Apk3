package com.google.android.exoplayer2;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class MediaPeriodQueue$$ExternalSyntheticLambda0 implements java.lang.Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ java.lang.Object f$0;
    public final /* synthetic */ java.lang.Object f$1;
    public final /* synthetic */ java.lang.Object f$2;

    public /* synthetic */ MediaPeriodQueue$$ExternalSyntheticLambda0(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.$r8$classId = r4
            r0.f$0 = r1
            r0.f$1 = r2
            r0.f$2 = r3
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            int r0 = r3.$r8$classId
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L16
        L6:
            java.lang.Object r0 = r3.f$0
            com.google.android.exoplayer2.MediaPeriodQueue r0 = (com.google.android.exoplayer2.MediaPeriodQueue) r0
            java.lang.Object r1 = r3.f$1
            com.google.common.collect.ImmutableList$Builder r1 = (com.google.common.collect.ImmutableList.Builder) r1
            java.lang.Object r2 = r3.f$2
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = (com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) r2
            com.google.android.exoplayer2.MediaPeriodQueue.$r8$lambda$mWNPMcRbVVz2oDENMZzwGKF1Dk8(r0, r1, r2)
            return
        L16:
            java.lang.Object r0 = r3.f$0
            com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener r0 = (com.google.android.exoplayer2.MediaSourceList.ForwardingEventListener) r0
            java.lang.Object r1 = r3.f$1
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.Object r2 = r3.f$2
            java.lang.Exception r2 = (java.lang.Exception) r2
            com.google.android.exoplayer2.MediaSourceList.ForwardingEventListener.m171$r8$lambda$xFkGCpuEwpp2sG4Pmtj8Y9E_bk(r0, r1, r2)
            return
    }
}
