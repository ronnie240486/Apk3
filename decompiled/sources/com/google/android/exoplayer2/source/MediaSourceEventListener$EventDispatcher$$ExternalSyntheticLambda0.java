package com.google.android.exoplayer2.source;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda0 implements java.lang.Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher f$0;
    public final /* synthetic */ com.google.android.exoplayer2.source.MediaSourceEventListener f$1;
    public final /* synthetic */ java.lang.Object f$2;
    public final /* synthetic */ com.google.android.exoplayer2.source.MediaLoadData f$3;

    public /* synthetic */ MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda0(com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher r1, com.google.android.exoplayer2.source.MediaSourceEventListener r2, java.lang.Object r3, com.google.android.exoplayer2.source.MediaLoadData r4, int r5) {
            r0 = this;
            r0.$r8$classId = r5
            r0.f$0 = r1
            r0.f$1 = r2
            r0.f$2 = r3
            r0.f$3 = r4
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            int r0 = r4.$r8$classId
            switch(r0) {
                case 0: goto L22;
                case 1: goto L14;
                case 2: goto L6;
                default: goto L5;
            }
        L5:
            goto L30
        L6:
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r0 = r4.f$0
            com.google.android.exoplayer2.source.MediaSourceEventListener r1 = r4.f$1
            java.lang.Object r2 = r4.f$2
            com.google.android.exoplayer2.source.LoadEventInfo r2 = (com.google.android.exoplayer2.source.LoadEventInfo) r2
            com.google.android.exoplayer2.source.MediaLoadData r3 = r4.f$3
            com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher.$r8$lambda$zyM9BzrtZr4LqwCssdpE8mIFjiM(r0, r1, r2, r3)
            return
        L14:
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r0 = r4.f$0
            com.google.android.exoplayer2.source.MediaSourceEventListener r1 = r4.f$1
            java.lang.Object r2 = r4.f$2
            com.google.android.exoplayer2.source.LoadEventInfo r2 = (com.google.android.exoplayer2.source.LoadEventInfo) r2
            com.google.android.exoplayer2.source.MediaLoadData r3 = r4.f$3
            com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher.m243$r8$lambda$ZuTEoXsbK3i0dfIxRwWS0zQ6UA(r0, r1, r2, r3)
            return
        L22:
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r0 = r4.f$0
            com.google.android.exoplayer2.source.MediaSourceEventListener r1 = r4.f$1
            java.lang.Object r2 = r4.f$2
            com.google.android.exoplayer2.source.LoadEventInfo r2 = (com.google.android.exoplayer2.source.LoadEventInfo) r2
            com.google.android.exoplayer2.source.MediaLoadData r3 = r4.f$3
            com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher.m245$r8$lambda$zLkfePuPiorbhHzeTveZMzGk3U(r0, r1, r2, r3)
            return
        L30:
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r0 = r4.f$0
            com.google.android.exoplayer2.source.MediaSourceEventListener r1 = r4.f$1
            java.lang.Object r2 = r4.f$2
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = (com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) r2
            com.google.android.exoplayer2.source.MediaLoadData r3 = r4.f$3
            com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher.m241$r8$lambda$5lzpM1dMbFPdD36ygE1o2Peoo(r0, r1, r2, r3)
            return
    }
}
