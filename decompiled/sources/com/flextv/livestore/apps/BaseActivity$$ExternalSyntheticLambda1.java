package com.flextv.livestore.apps;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class BaseActivity$$ExternalSyntheticLambda1 implements com.flextv.livestore.dlgfragment.LanguageDlgFragment.ItemPositionListener, com.flextv.livestore.net.NetworkTask.OnCompleteListener, com.google.android.exoplayer2.util.ListenerSet.Event, com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo.Factory {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ java.lang.Object f$0;
    public final /* synthetic */ java.lang.Object f$1;

    public /* synthetic */ BaseActivity$$ExternalSyntheticLambda1(java.lang.Object r1, java.lang.Object r2, int r3) {
            r0 = this;
            r0.$r8$classId = r3
            r0.f$0 = r1
            r0.f$1 = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo.Factory
    public final java.util.List create(int r3, com.google.android.exoplayer2.source.TrackGroup r4, int[] r5) {
            r2 = this;
            int r0 = r2.$r8$classId
            switch(r0) {
                case 13: goto L6;
                default: goto L5;
            }
        L5:
            goto L13
        L6:
            java.lang.Object r0 = r2.f$0
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r0 = (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters) r0
            java.lang.Object r1 = r2.f$1
            java.lang.String r1 = (java.lang.String) r1
            java.util.List r3 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.$r8$lambda$a61h7PpVEP1iVAKhOefXczU16G4(r0, r1, r3, r4, r5)
            return r3
        L13:
            java.lang.Object r0 = r2.f$0
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r0 = (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters) r0
            java.lang.Object r1 = r2.f$1
            int[] r1 = (int[]) r1
            java.util.List r3 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.$r8$lambda$RJHKYon4KBWh5h6TU7dMcobv_60(r0, r1, r3, r4, r5)
            return r3
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.$r8$classId
            switch(r0) {
                case 2: goto L77;
                case 3: goto L69;
                case 4: goto L5b;
                case 5: goto L5;
                case 6: goto L4d;
                case 7: goto L3f;
                case 8: goto L31;
                case 9: goto L23;
                case 10: goto L15;
                case 11: goto L7;
                default: goto L5;
            }
        L5:
            goto L85
        L7:
            java.lang.Object r0 = r2.f$0
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = (com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime) r0
            java.lang.Object r1 = r2.f$1
            com.google.android.exoplayer2.PlaybackParameters r1 = (com.google.android.exoplayer2.PlaybackParameters) r1
            com.google.android.exoplayer2.analytics.AnalyticsListener r3 = (com.google.android.exoplayer2.analytics.AnalyticsListener) r3
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.m193$r8$lambda$LkW7dl9SdUjzXpHRl67LaZUuQ(r0, r1, r3)
            return
        L15:
            java.lang.Object r0 = r2.f$0
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = (com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime) r0
            java.lang.Object r1 = r2.f$1
            com.google.android.exoplayer2.text.CueGroup r1 = (com.google.android.exoplayer2.text.CueGroup) r1
            com.google.android.exoplayer2.analytics.AnalyticsListener r3 = (com.google.android.exoplayer2.analytics.AnalyticsListener) r3
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.m201$r8$lambda$_hWNWhzoUNOsm5ugG_dJjiB7SQ(r0, r1, r3)
            return
        L23:
            java.lang.Object r0 = r2.f$0
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = (com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime) r0
            java.lang.Object r1 = r2.f$1
            com.google.android.exoplayer2.Player$Commands r1 = (com.google.android.exoplayer2.Player.Commands) r1
            com.google.android.exoplayer2.analytics.AnalyticsListener r3 = (com.google.android.exoplayer2.analytics.AnalyticsListener) r3
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.m204$r8$lambda$fIkgsuaM1QBc8sF9EIDuz9pqM(r0, r1, r3)
            return
        L31:
            java.lang.Object r0 = r2.f$0
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = (com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime) r0
            java.lang.Object r1 = r2.f$1
            com.google.android.exoplayer2.audio.AudioAttributes r1 = (com.google.android.exoplayer2.audio.AudioAttributes) r1
            com.google.android.exoplayer2.analytics.AnalyticsListener r3 = (com.google.android.exoplayer2.analytics.AnalyticsListener) r3
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.$r8$lambda$ZOIU5_MIMk5pqXWrc2k1FMH9ZgA(r0, r1, r3)
            return
        L3f:
            java.lang.Object r0 = r2.f$0
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = (com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime) r0
            java.lang.Object r1 = r2.f$1
            com.google.android.exoplayer2.Tracks r1 = (com.google.android.exoplayer2.Tracks) r1
            com.google.android.exoplayer2.analytics.AnalyticsListener r3 = (com.google.android.exoplayer2.analytics.AnalyticsListener) r3
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.$r8$lambda$ngVZDNrELPlWsCVmG7J5GWL7oCA(r0, r1, r3)
            return
        L4d:
            java.lang.Object r0 = r2.f$0
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = (com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime) r0
            java.lang.Object r1 = r2.f$1
            com.google.android.exoplayer2.video.VideoSize r1 = (com.google.android.exoplayer2.video.VideoSize) r1
            com.google.android.exoplayer2.analytics.AnalyticsListener r3 = (com.google.android.exoplayer2.analytics.AnalyticsListener) r3
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.m190$r8$lambda$9cDI5CJcKhClEGbM7ss9sTpw14(r0, r1, r3)
            return
        L5b:
            java.lang.Object r0 = r2.f$0
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = (com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime) r0
            java.lang.Object r1 = r2.f$1
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters r1 = (com.google.android.exoplayer2.trackselection.TrackSelectionParameters) r1
            com.google.android.exoplayer2.analytics.AnalyticsListener r3 = (com.google.android.exoplayer2.analytics.AnalyticsListener) r3
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.$r8$lambda$9PcUfEE10y1wq2pg8zepwErgqQg(r0, r1, r3)
            return
        L69:
            java.lang.Object r0 = r2.f$0
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = (com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime) r0
            java.lang.Object r1 = r2.f$1
            com.google.android.exoplayer2.DeviceInfo r1 = (com.google.android.exoplayer2.DeviceInfo) r1
            com.google.android.exoplayer2.analytics.AnalyticsListener r3 = (com.google.android.exoplayer2.analytics.AnalyticsListener) r3
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.m191$r8$lambda$DEUHU2PmVnpKVL6LksbxRZhfs(r0, r1, r3)
            return
        L77:
            java.lang.Object r0 = r2.f$0
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = (com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime) r0
            java.lang.Object r1 = r2.f$1
            com.google.android.exoplayer2.metadata.Metadata r1 = (com.google.android.exoplayer2.metadata.Metadata) r1
            com.google.android.exoplayer2.analytics.AnalyticsListener r3 = (com.google.android.exoplayer2.analytics.AnalyticsListener) r3
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.$r8$lambda$Ra2gm0EM2zPpFWo7eI17gUXR2UU(r0, r1, r3)
            return
        L85:
            java.lang.Object r0 = r2.f$0
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = (com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime) r0
            java.lang.Object r1 = r2.f$1
            java.util.List r1 = (java.util.List) r1
            com.google.android.exoplayer2.analytics.AnalyticsListener r3 = (com.google.android.exoplayer2.analytics.AnalyticsListener) r3
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.$r8$lambda$KF5ejdvWdyFupDOS9HtrOevJ5sI(r0, r1, r3)
            return
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent
    public final void invoke(java.lang.Object r3, com.google.android.exoplayer2.util.FlagSet r4) {
            r2 = this;
            java.lang.Object r0 = r2.f$0
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector r0 = (com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector) r0
            java.lang.Object r1 = r2.f$1
            com.google.android.exoplayer2.Player r1 = (com.google.android.exoplayer2.Player) r1
            com.google.android.exoplayer2.analytics.AnalyticsListener r3 = (com.google.android.exoplayer2.analytics.AnalyticsListener) r3
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.$r8$lambda$sWkn4iHlwtwbFRkqMwXc3fWrMko(r0, r1, r3, r4)
            return
    }

    @Override // com.flextv.livestore.net.NetworkTask.OnCompleteListener
    public final void onComplete(java.lang.Object r3) {
            r2 = this;
            java.lang.Object r0 = r2.f$0
            com.flextv.livestore.apps.BaseActivity r0 = (com.flextv.livestore.apps.BaseActivity) r0
            java.lang.Object r1 = r2.f$1
            io.realm.RealmResults r1 = (io.realm.RealmResults) r1
            java.util.List r3 = (java.util.List) r3
            com.flextv.livestore.apps.BaseActivity.$r8$lambda$9Xg9hmuOBNsuItI_OIxOoabF0Uw(r0, r1, r3)
            return
    }

    @Override // com.flextv.livestore.dlgfragment.LanguageDlgFragment.ItemPositionListener
    public final void onItemPosition(int r3) {
            r2 = this;
            java.lang.Object r0 = r2.f$0
            com.flextv.livestore.activities.SettingActivity r0 = (com.flextv.livestore.activities.SettingActivity) r0
            java.lang.Object r1 = r2.f$1
            java.util.List r1 = (java.util.List) r1
            com.flextv.livestore.activities.SettingActivity.$r8$lambda$l61HhA1v5o3_qes1_BIoB_qQRP0(r0, r1, r3)
            return
    }
}
