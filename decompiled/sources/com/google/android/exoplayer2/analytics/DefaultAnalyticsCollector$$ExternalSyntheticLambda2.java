package com.google.android.exoplayer2.analytics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DefaultAnalyticsCollector$$ExternalSyntheticLambda2 implements com.google.android.exoplayer2.util.ListenerSet.Event {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ long f$2;
    public final /* synthetic */ long f$3;

    public /* synthetic */ DefaultAnalyticsCollector$$ExternalSyntheticLambda2(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2, long r3, long r5, int r7) {
            r0 = this;
            r0.$r8$classId = r7
            r0.f$0 = r1
            r0.f$1 = r2
            r0.f$2 = r3
            r0.f$3 = r5
            r0.<init>()
            return
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(java.lang.Object r17) {
            r16 = this;
            r0 = r16
            int r1 = r0.$r8$classId
            switch(r1) {
                case 0: goto L8;
                default: goto L7;
            }
        L7:
            goto L18
        L8:
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r2 = r0.f$0
            int r3 = r0.f$1
            long r4 = r0.f$2
            long r6 = r0.f$3
            r8 = r17
            com.google.android.exoplayer2.analytics.AnalyticsListener r8 = (com.google.android.exoplayer2.analytics.AnalyticsListener) r8
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.$r8$lambda$lTPM1w4Z5pABUx_P3HWxh5vctXE(r2, r3, r4, r6, r8)
            return
        L18:
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r9 = r0.f$0
            int r10 = r0.f$1
            long r11 = r0.f$2
            long r13 = r0.f$3
            r15 = r17
            com.google.android.exoplayer2.analytics.AnalyticsListener r15 = (com.google.android.exoplayer2.analytics.AnalyticsListener) r15
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.m199$r8$lambda$Xpn20bMMnj0sZJocJOTENKP3w(r9, r10, r11, r13, r15)
            return
    }
}
