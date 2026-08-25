package com.google.android.exoplayer2.analytics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DefaultAnalyticsCollector$$ExternalSyntheticLambda4 implements com.google.android.exoplayer2.util.ListenerSet.Event {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime f$0;
    public final /* synthetic */ com.google.android.exoplayer2.Format f$1;
    public final /* synthetic */ com.google.android.exoplayer2.decoder.DecoderReuseEvaluation f$2;

    public /* synthetic */ DefaultAnalyticsCollector$$ExternalSyntheticLambda4(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.Format r2, com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r3, int r4) {
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
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L12
        L6:
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.f$0
            com.google.android.exoplayer2.Format r1 = r3.f$1
            com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r2 = r3.f$2
            com.google.android.exoplayer2.analytics.AnalyticsListener r4 = (com.google.android.exoplayer2.analytics.AnalyticsListener) r4
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.$r8$lambda$Ssq3n7SqyXF5jQyR98wzLC_aXBc(r0, r1, r2, r4)
            return
        L12:
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.f$0
            com.google.android.exoplayer2.Format r1 = r3.f$1
            com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r2 = r3.f$2
            com.google.android.exoplayer2.analytics.AnalyticsListener r4 = (com.google.android.exoplayer2.analytics.AnalyticsListener) r4
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.m187$r8$lambda$6wcqYHJ0o8Q1xTZ1zirqkmQ6E(r0, r1, r2, r4)
            return
    }
}
