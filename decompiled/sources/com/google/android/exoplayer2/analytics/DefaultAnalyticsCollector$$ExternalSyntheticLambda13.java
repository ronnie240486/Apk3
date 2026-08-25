package com.google.android.exoplayer2.analytics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DefaultAnalyticsCollector$$ExternalSyntheticLambda13 implements com.google.android.exoplayer2.util.ListenerSet.Event {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime f$0;
    public final /* synthetic */ long f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ DefaultAnalyticsCollector$$ExternalSyntheticLambda13(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r2, int r3, long r4) {
            r1 = this;
            r0 = 1
            r1.$r8$classId = r0
            r1.<init>()
            r1.f$0 = r2
            r1.f$2 = r3
            r1.f$1 = r4
            return
    }

    public /* synthetic */ DefaultAnalyticsCollector$$ExternalSyntheticLambda13(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r2, long r3, int r5) {
            r1 = this;
            r0 = 0
            r1.$r8$classId = r0
            r1.<init>()
            r1.f$0 = r2
            r1.f$1 = r3
            r1.f$2 = r5
            return
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.$r8$classId
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L12
        L6:
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r4.f$0
            long r1 = r4.f$1
            int r3 = r4.f$2
            com.google.android.exoplayer2.analytics.AnalyticsListener r5 = (com.google.android.exoplayer2.analytics.AnalyticsListener) r5
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.$r8$lambda$AtuUAVoUP6eIvypQ8S7VSA6r3ks(r0, r1, r3, r5)
            return
        L12:
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r4.f$0
            int r1 = r4.f$2
            long r2 = r4.f$1
            com.google.android.exoplayer2.analytics.AnalyticsListener r5 = (com.google.android.exoplayer2.analytics.AnalyticsListener) r5
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.m202$r8$lambda$aQPROM7dF72DvL0uB2jxjHnAsA(r0, r1, r2, r5)
            return
    }
}
