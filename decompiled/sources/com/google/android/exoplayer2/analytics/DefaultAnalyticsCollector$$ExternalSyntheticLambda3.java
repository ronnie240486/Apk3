package com.google.android.exoplayer2.analytics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DefaultAnalyticsCollector$$ExternalSyntheticLambda3 implements com.google.android.exoplayer2.util.ListenerSet.Event {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime f$0;
    public final /* synthetic */ long f$1;

    public /* synthetic */ DefaultAnalyticsCollector$$ExternalSyntheticLambda3(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, long r2, int r4) {
            r0 = this;
            r0.$r8$classId = r4
            r0.f$0 = r1
            r0.f$1 = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.$r8$classId
            switch(r0) {
                case 0: goto L1a;
                case 1: goto L10;
                case 2: goto L6;
                default: goto L5;
            }
        L5:
            goto L24
        L6:
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.f$0
            long r1 = r3.f$1
            com.google.android.exoplayer2.analytics.AnalyticsListener r4 = (com.google.android.exoplayer2.analytics.AnalyticsListener) r4
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.m211$r8$lambda$wIYq1FQEfVm5RKenq9DGPAsgA4(r0, r1, r4)
            return
        L10:
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.f$0
            long r1 = r3.f$1
            com.google.android.exoplayer2.analytics.AnalyticsListener r4 = (com.google.android.exoplayer2.analytics.AnalyticsListener) r4
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.m206$r8$lambda$ifz5aidqUgr1wT_bltbVMx1AIk(r0, r1, r4)
            return
        L1a:
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.f$0
            long r1 = r3.f$1
            com.google.android.exoplayer2.analytics.AnalyticsListener r4 = (com.google.android.exoplayer2.analytics.AnalyticsListener) r4
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.m188$r8$lambda$7NuGISxFssay_tsf4W_pDm1cGw(r0, r1, r4)
            return
        L24:
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.f$0
            long r1 = r3.f$1
            com.google.android.exoplayer2.analytics.AnalyticsListener r4 = (com.google.android.exoplayer2.analytics.AnalyticsListener) r4
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.$r8$lambda$MuuIsPrsEMzwBEesER3eeYGrAKQ(r0, r1, r4)
            return
    }
}
