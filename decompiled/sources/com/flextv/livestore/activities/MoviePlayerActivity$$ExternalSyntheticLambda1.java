package com.flextv.livestore.activities;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class MoviePlayerActivity$$ExternalSyntheticLambda1 implements com.flextv.livestore.dlgfragment.SubtitleTrackDlgFragment.ItemPositionListener, com.flextv.livestore.dlgfragment.AudioTrackDlgFragment.ItemPositionListener, com.google.android.exoplayer2.util.ListenerSet.Event {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ java.lang.Object f$0;
    public final /* synthetic */ java.lang.Object f$1;
    public final /* synthetic */ com.google.android.exoplayer2.Bundleable f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ MoviePlayerActivity$$ExternalSyntheticLambda1(com.flextv.livestore.activities.MoviePlayerActivity r1, java.util.List r2, com.google.android.exoplayer2.source.TrackGroupArray r3, int r4, int r5) {
            r0 = this;
            r0.$r8$classId = r5
            r0.f$0 = r1
            r0.f$1 = r2
            r0.f$2 = r3
            r0.f$3 = r4
            r0.<init>()
            return
    }

    public /* synthetic */ MoviePlayerActivity$$ExternalSyntheticLambda1(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r2, int r3, com.google.android.exoplayer2.Player.PositionInfo r4, com.google.android.exoplayer2.Player.PositionInfo r5) {
            r1 = this;
            r0 = 2
            r1.$r8$classId = r0
            r1.<init>()
            r1.f$0 = r2
            r1.f$3 = r3
            r1.f$1 = r4
            r1.f$2 = r5
            return
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(java.lang.Object r5) {
            r4 = this;
            java.lang.Object r0 = r4.f$0
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = (com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime) r0
            int r1 = r4.f$3
            java.lang.Object r2 = r4.f$1
            com.google.android.exoplayer2.Player$PositionInfo r2 = (com.google.android.exoplayer2.Player.PositionInfo) r2
            com.google.android.exoplayer2.Bundleable r3 = r4.f$2
            com.google.android.exoplayer2.Player$PositionInfo r3 = (com.google.android.exoplayer2.Player.PositionInfo) r3
            com.google.android.exoplayer2.analytics.AnalyticsListener r5 = (com.google.android.exoplayer2.analytics.AnalyticsListener) r5
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.$r8$lambda$ZK4_AmILgQTSxRW19Njh1Wnnet0(r0, r1, r2, r3, r5)
            return
    }

    @Override // com.flextv.livestore.dlgfragment.SubtitleTrackDlgFragment.ItemPositionListener
    public final void onItemPosition(int r5) {
            r4 = this;
            int r0 = r4.$r8$classId
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L18
        L6:
            java.lang.Object r0 = r4.f$0
            com.flextv.livestore.activities.MoviePlayerActivity r0 = (com.flextv.livestore.activities.MoviePlayerActivity) r0
            java.lang.Object r1 = r4.f$1
            java.util.List r1 = (java.util.List) r1
            com.google.android.exoplayer2.Bundleable r2 = r4.f$2
            com.google.android.exoplayer2.source.TrackGroupArray r2 = (com.google.android.exoplayer2.source.TrackGroupArray) r2
            int r3 = r4.f$3
            com.flextv.livestore.activities.MoviePlayerActivity.m64$r8$lambda$o6wJvSwopXR8WyjG5WLEDHcXo(r0, r1, r2, r3, r5)
            return
        L18:
            java.lang.Object r0 = r4.f$0
            com.flextv.livestore.activities.MoviePlayerActivity r0 = (com.flextv.livestore.activities.MoviePlayerActivity) r0
            java.lang.Object r1 = r4.f$1
            java.util.List r1 = (java.util.List) r1
            com.google.android.exoplayer2.Bundleable r2 = r4.f$2
            com.google.android.exoplayer2.source.TrackGroupArray r2 = (com.google.android.exoplayer2.source.TrackGroupArray) r2
            int r3 = r4.f$3
            com.flextv.livestore.activities.MoviePlayerActivity.$r8$lambda$sVmlndjuQE27gR1mq5BElVRh58A(r0, r1, r2, r3, r5)
            return
    }
}
