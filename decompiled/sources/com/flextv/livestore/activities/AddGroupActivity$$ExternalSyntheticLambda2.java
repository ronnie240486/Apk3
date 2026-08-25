package com.flextv.livestore.activities;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class AddGroupActivity$$ExternalSyntheticLambda2 implements com.google.android.exoplayer2.util.ListenerSet.Event, com.flextv.livestore.dlgfragment.AddGroupDlgFragment.OnAddedGroupListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ java.lang.Object f$0;
    public final /* synthetic */ boolean f$1;

    public /* synthetic */ AddGroupActivity$$ExternalSyntheticLambda2(java.lang.Object r1, boolean r2, int r3) {
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
                case 1: goto L1e;
                case 2: goto L12;
                case 3: goto L6;
                default: goto L5;
            }
        L5:
            goto L2a
        L6:
            java.lang.Object r0 = r2.f$0
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = (com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime) r0
            boolean r1 = r2.f$1
            com.google.android.exoplayer2.analytics.AnalyticsListener r3 = (com.google.android.exoplayer2.analytics.AnalyticsListener) r3
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.$r8$lambda$5Jody8QeE0s3fpPThADOHwfcUeA(r0, r1, r3)
            return
        L12:
            java.lang.Object r0 = r2.f$0
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = (com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime) r0
            boolean r1 = r2.f$1
            com.google.android.exoplayer2.analytics.AnalyticsListener r3 = (com.google.android.exoplayer2.analytics.AnalyticsListener) r3
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.$r8$lambda$IcDUEWV9HLvvqlI2fuIn4qTK4uA(r0, r1, r3)
            return
        L1e:
            java.lang.Object r0 = r2.f$0
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = (com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime) r0
            boolean r1 = r2.f$1
            com.google.android.exoplayer2.analytics.AnalyticsListener r3 = (com.google.android.exoplayer2.analytics.AnalyticsListener) r3
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.$r8$lambda$ETVz_1ZtrlztJ3Z4boca9NuursA(r0, r1, r3)
            return
        L2a:
            java.lang.Object r0 = r2.f$0
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = (com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime) r0
            boolean r1 = r2.f$1
            com.google.android.exoplayer2.analytics.AnalyticsListener r3 = (com.google.android.exoplayer2.analytics.AnalyticsListener) r3
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.$r8$lambda$s5kMgo3Ssey1sFKs6us9XFB_k_Y(r0, r1, r3)
            return
    }

    @Override // com.flextv.livestore.dlgfragment.AddGroupDlgFragment.OnAddedGroupListener
    public final void onAddedGroup(java.lang.String r3) {
            r2 = this;
            java.lang.Object r0 = r2.f$0
            com.flextv.livestore.activities.AddGroupActivity r0 = (com.flextv.livestore.activities.AddGroupActivity) r0
            boolean r1 = r2.f$1
            com.flextv.livestore.activities.AddGroupActivity.$r8$lambda$IlMoiiOepsbzhneEjDJs80ukswo(r0, r1, r3)
            return
    }
}
