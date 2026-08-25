package com.flextv.livestore.activities;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ChangePlaylistActivity$$ExternalSyntheticLambda0 implements com.flextv.livestore.dlgfragment.ConnectDlgFragment.SelectList, com.google.android.exoplayer2.util.ListenerSet.Event {
    public final /* synthetic */ java.lang.Object f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ java.lang.Object f$2;

    public /* synthetic */ ChangePlaylistActivity$$ExternalSyntheticLambda0(com.flextv.livestore.activities.ChangePlaylistActivity r1, int r2, com.flextv.livestore.models.AppInfoModel.UrlModel r3) {
            r0 = this;
            r0.<init>()
            r0.f$0 = r1
            r0.f$1 = r2
            r0.f$2 = r3
            return
    }

    public /* synthetic */ ChangePlaylistActivity$$ExternalSyntheticLambda0(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.MediaItem r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f$0 = r1
            r0.f$2 = r2
            r0.f$1 = r3
            return
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(java.lang.Object r4) {
            r3 = this;
            java.lang.Object r0 = r3.f$0
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = (com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime) r0
            java.lang.Object r1 = r3.f$2
            com.google.android.exoplayer2.MediaItem r1 = (com.google.android.exoplayer2.MediaItem) r1
            int r2 = r3.f$1
            com.google.android.exoplayer2.analytics.AnalyticsListener r4 = (com.google.android.exoplayer2.analytics.AnalyticsListener) r4
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.$r8$lambda$LG1mCVjkadAdSIiIWraD2wI1Hxw(r0, r1, r2, r4)
            return
    }

    @Override // com.flextv.livestore.dlgfragment.ConnectDlgFragment.SelectList
    public final void onSelect(int r4) {
            r3 = this;
            java.lang.Object r0 = r3.f$0
            com.flextv.livestore.activities.ChangePlaylistActivity r0 = (com.flextv.livestore.activities.ChangePlaylistActivity) r0
            int r1 = r3.f$1
            java.lang.Object r2 = r3.f$2
            com.flextv.livestore.models.AppInfoModel$UrlModel r2 = (com.flextv.livestore.models.AppInfoModel.UrlModel) r2
            com.flextv.livestore.activities.ChangePlaylistActivity.$r8$lambda$1q4iYGnGxDZRvCW6TPdJq45qclo(r0, r1, r2, r4)
            return
    }
}
