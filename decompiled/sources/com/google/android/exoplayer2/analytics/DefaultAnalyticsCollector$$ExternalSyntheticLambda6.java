package com.google.android.exoplayer2.analytics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DefaultAnalyticsCollector$$ExternalSyntheticLambda6 implements com.google.android.exoplayer2.util.ListenerSet.Event {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime f$0;
    public final /* synthetic */ com.google.android.exoplayer2.PlaybackException f$1;

    public /* synthetic */ DefaultAnalyticsCollector$$ExternalSyntheticLambda6(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.PlaybackException r2, int r3) {
            r0 = this;
            r0.$r8$classId = r3
            r0.f$0 = r1
            r0.f$1 = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.$r8$classId
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L10
        L6:
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r2.f$0
            com.google.android.exoplayer2.PlaybackException r1 = r2.f$1
            com.google.android.exoplayer2.analytics.AnalyticsListener r3 = (com.google.android.exoplayer2.analytics.AnalyticsListener) r3
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.m212$r8$lambda$yRsWHcEy5NVVElHVUxHPfDxr2s(r0, r1, r3)
            return
        L10:
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r2.f$0
            com.google.android.exoplayer2.PlaybackException r1 = r2.f$1
            com.google.android.exoplayer2.analytics.AnalyticsListener r3 = (com.google.android.exoplayer2.analytics.AnalyticsListener) r3
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.m194$r8$lambda$LLwqmorKNavYdh5viTvRKYmDa4(r0, r1, r3)
            return
    }
}
