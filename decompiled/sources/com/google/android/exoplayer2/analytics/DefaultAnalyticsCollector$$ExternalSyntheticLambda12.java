package com.google.android.exoplayer2.analytics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DefaultAnalyticsCollector$$ExternalSyntheticLambda12 implements com.google.android.exoplayer2.util.ListenerSet.Event {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime f$0;
    public final /* synthetic */ java.lang.String f$1;
    public final /* synthetic */ long f$2;
    public final /* synthetic */ long f$3;

    public /* synthetic */ DefaultAnalyticsCollector$$ExternalSyntheticLambda12(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.String r2, long r3, long r5, int r7) {
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
            java.lang.String r3 = r0.f$1
            long r4 = r0.f$2
            long r6 = r0.f$3
            r8 = r17
            com.google.android.exoplayer2.analytics.AnalyticsListener r8 = (com.google.android.exoplayer2.analytics.AnalyticsListener) r8
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.$r8$lambda$yJKhKC8Ls39c64LK01PdJSmPxK0(r2, r3, r4, r6, r8)
            return
        L18:
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r9 = r0.f$0
            java.lang.String r10 = r0.f$1
            long r11 = r0.f$2
            long r13 = r0.f$3
            r15 = r17
            com.google.android.exoplayer2.analytics.AnalyticsListener r15 = (com.google.android.exoplayer2.analytics.AnalyticsListener) r15
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.$r8$lambda$ePESxtoqHvAKFhGvPrbD3Tznh0g(r9, r10, r11, r13, r15)
            return
    }
}
