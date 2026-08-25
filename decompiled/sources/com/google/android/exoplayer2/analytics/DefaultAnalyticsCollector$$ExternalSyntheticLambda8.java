package com.google.android.exoplayer2.analytics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DefaultAnalyticsCollector$$ExternalSyntheticLambda8 implements com.google.android.exoplayer2.util.ListenerSet.Event {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime f$0;
    public final /* synthetic */ com.google.android.exoplayer2.source.LoadEventInfo f$1;
    public final /* synthetic */ com.google.android.exoplayer2.source.MediaLoadData f$2;

    public /* synthetic */ DefaultAnalyticsCollector$$ExternalSyntheticLambda8(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.source.LoadEventInfo r2, com.google.android.exoplayer2.source.MediaLoadData r3, int r4) {
            r0 = this;
            r0.$r8$classId = r4
            r0.f$0 = r1
            r0.f$1 = r2
            r0.f$2 = r3
            r0.<init>()
            return
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.$r8$classId
            switch(r0) {
                case 0: goto L12;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L1e
        L6:
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.f$0
            com.google.android.exoplayer2.source.LoadEventInfo r1 = r3.f$1
            com.google.android.exoplayer2.source.MediaLoadData r2 = r3.f$2
            com.google.android.exoplayer2.analytics.AnalyticsListener r4 = (com.google.android.exoplayer2.analytics.AnalyticsListener) r4
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.m209$r8$lambda$poOwK15F_cPJY2hGCVO7cUwpzg(r0, r1, r2, r4)
            return
        L12:
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.f$0
            com.google.android.exoplayer2.source.LoadEventInfo r1 = r3.f$1
            com.google.android.exoplayer2.source.MediaLoadData r2 = r3.f$2
            com.google.android.exoplayer2.analytics.AnalyticsListener r4 = (com.google.android.exoplayer2.analytics.AnalyticsListener) r4
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.m198$r8$lambda$WN9IGleVRF_Anir3pI4AsE22yM(r0, r1, r2, r4)
            return
        L1e:
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.f$0
            com.google.android.exoplayer2.source.LoadEventInfo r1 = r3.f$1
            com.google.android.exoplayer2.source.MediaLoadData r2 = r3.f$2
            com.google.android.exoplayer2.analytics.AnalyticsListener r4 = (com.google.android.exoplayer2.analytics.AnalyticsListener) r4
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.$r8$lambda$MVU3f5Pa6p6mi6MYnvySiNvJZDw(r0, r1, r2, r4)
            return
    }
}
