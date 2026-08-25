package com.google.android.exoplayer2.analytics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DefaultAnalyticsCollector$$ExternalSyntheticLambda14 implements com.google.android.exoplayer2.util.ListenerSet.Event {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ boolean f$2;

    public /* synthetic */ DefaultAnalyticsCollector$$ExternalSyntheticLambda14(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r2, int r3, boolean r4) {
            r1 = this;
            r0 = 0
            r1.$r8$classId = r0
            r1.<init>()
            r1.f$0 = r2
            r1.f$1 = r3
            r1.f$2 = r4
            return
    }

    public /* synthetic */ DefaultAnalyticsCollector$$ExternalSyntheticLambda14(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, boolean r2, int r3, int r4) {
            r0 = this;
            r0.$r8$classId = r4
            r0.f$0 = r1
            r0.f$2 = r2
            r0.f$1 = r3
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
            boolean r1 = r3.f$2
            int r2 = r3.f$1
            com.google.android.exoplayer2.analytics.AnalyticsListener r4 = (com.google.android.exoplayer2.analytics.AnalyticsListener) r4
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.$r8$lambda$png_gxpRsJhc4N3aEcHZAiZcKdE(r0, r1, r2, r4)
            return
        L12:
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.f$0
            int r1 = r3.f$1
            boolean r2 = r3.f$2
            com.google.android.exoplayer2.analytics.AnalyticsListener r4 = (com.google.android.exoplayer2.analytics.AnalyticsListener) r4
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.m186$r8$lambda$4yfSm9_o9ovFI635VzWE_Nvzq0(r0, r1, r2, r4)
            return
        L1e:
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.f$0
            boolean r1 = r3.f$2
            int r2 = r3.f$1
            com.google.android.exoplayer2.analytics.AnalyticsListener r4 = (com.google.android.exoplayer2.analytics.AnalyticsListener) r4
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.$r8$lambda$lkvqeEzgj7KfOt7e4Gy4gEmedc8(r0, r1, r2, r4)
            return
    }
}
