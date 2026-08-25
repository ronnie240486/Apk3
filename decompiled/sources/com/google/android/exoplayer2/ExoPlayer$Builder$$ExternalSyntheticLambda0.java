package com.google.android.exoplayer2;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ExoPlayer$Builder$$ExternalSyntheticLambda0 implements com.google.common.base.Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ com.google.android.exoplayer2.analytics.AnalyticsCollector f$0;

    public /* synthetic */ ExoPlayer$Builder$$ExternalSyntheticLambda0(com.google.android.exoplayer2.analytics.AnalyticsCollector r1, int r2) {
            r0 = this;
            r0.$r8$classId = r2
            r0.f$0 = r1
            r0.<init>()
            return
    }

    @Override // com.google.common.base.Function
    public final java.lang.Object apply(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.$r8$classId
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Lf
        L6:
            com.google.android.exoplayer2.analytics.AnalyticsCollector r0 = r1.f$0
            com.google.android.exoplayer2.util.Clock r2 = (com.google.android.exoplayer2.util.Clock) r2
            com.google.android.exoplayer2.analytics.AnalyticsCollector r2 = com.google.android.exoplayer2.ExoPlayer.Builder.$r8$lambda$s5j7alwVn_rzwe5oRzZvhRkrx14(r0, r2)
            return r2
        Lf:
            com.google.android.exoplayer2.analytics.AnalyticsCollector r0 = r1.f$0
            com.google.android.exoplayer2.util.Clock r2 = (com.google.android.exoplayer2.util.Clock) r2
            com.google.android.exoplayer2.analytics.AnalyticsCollector r2 = com.google.android.exoplayer2.ExoPlayer.Builder.$r8$lambda$0AeKkPPzXtGRyaZfObakkNvDQxU(r0, r2)
            return r2
    }
}
