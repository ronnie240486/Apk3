package com.google.android.exoplayer2.analytics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DefaultAnalyticsCollector$$ExternalSyntheticLambda10 implements com.google.android.exoplayer2.util.ListenerSet.Event {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime f$0;
    public final /* synthetic */ java.lang.Exception f$1;

    public /* synthetic */ DefaultAnalyticsCollector$$ExternalSyntheticLambda10(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.Exception r2, int r3) {
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
                case 0: goto L1a;
                case 1: goto L10;
                case 2: goto L6;
                default: goto L5;
            }
        L5:
            goto L24
        L6:
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r2.f$0
            java.lang.Exception r1 = r2.f$1
            com.google.android.exoplayer2.analytics.AnalyticsListener r3 = (com.google.android.exoplayer2.analytics.AnalyticsListener) r3
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.$r8$lambda$3W_WU5ju0YxRbyI62nPF_VmL5V0(r0, r1, r3)
            return
        L10:
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r2.f$0
            java.lang.Exception r1 = r2.f$1
            com.google.android.exoplayer2.analytics.AnalyticsListener r3 = (com.google.android.exoplayer2.analytics.AnalyticsListener) r3
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.m203$r8$lambda$bXfCZULCVapttqhIJteakpmooQ(r0, r1, r3)
            return
        L1a:
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r2.f$0
            java.lang.Exception r1 = r2.f$1
            com.google.android.exoplayer2.analytics.AnalyticsListener r3 = (com.google.android.exoplayer2.analytics.AnalyticsListener) r3
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.m195$r8$lambda$LmPHW46QAQkyArhZ5_MOrM8uEE(r0, r1, r3)
            return
        L24:
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r2.f$0
            java.lang.Exception r1 = r2.f$1
            com.google.android.exoplayer2.analytics.AnalyticsListener r3 = (com.google.android.exoplayer2.analytics.AnalyticsListener) r3
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.$r8$lambda$xa8wb_tCFMZGxoYTizDWXrfvs4M(r0, r1, r3)
            return
    }
}
