package com.flextv.livestore.activities;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class SeriesPlayerActivity$$ExternalSyntheticLambda0 implements com.flextv.livestore.dlgfragment.AudioTrackDlgFragment.ItemPositionListener, com.flextv.livestore.dlgfragment.SubtitleTrackDlgFragment.ItemPositionListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ com.flextv.livestore.activities.SeriesPlayerActivity f$0;
    public final /* synthetic */ java.util.List f$1;
    public final /* synthetic */ com.google.android.exoplayer2.source.TrackGroupArray f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ SeriesPlayerActivity$$ExternalSyntheticLambda0(com.flextv.livestore.activities.SeriesPlayerActivity r1, java.util.List r2, com.google.android.exoplayer2.source.TrackGroupArray r3, int r4, int r5) {
            r0 = this;
            r0.$r8$classId = r5
            r0.f$0 = r1
            r0.f$1 = r2
            r0.f$2 = r3
            r0.f$3 = r4
            r0.<init>()
            return
    }

    @Override // com.flextv.livestore.dlgfragment.AudioTrackDlgFragment.ItemPositionListener, com.flextv.livestore.dlgfragment.SubtitleTrackDlgFragment.ItemPositionListener
    public final void onItemPosition(int r5) {
            r4 = this;
            int r0 = r4.$r8$classId
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L12
        L6:
            com.flextv.livestore.activities.SeriesPlayerActivity r0 = r4.f$0
            java.util.List r1 = r4.f$1
            com.google.android.exoplayer2.source.TrackGroupArray r2 = r4.f$2
            int r3 = r4.f$3
            com.flextv.livestore.activities.SeriesPlayerActivity.m72$r8$lambda$YUoH0C2aKhGHFDicuZToqR6dvs(r0, r1, r2, r3, r5)
            return
        L12:
            com.flextv.livestore.activities.SeriesPlayerActivity r0 = r4.f$0
            java.util.List r1 = r4.f$1
            com.google.android.exoplayer2.source.TrackGroupArray r2 = r4.f$2
            int r3 = r4.f$3
            com.flextv.livestore.activities.SeriesPlayerActivity.$r8$lambda$vcT10wEHAA2Ys5V2zb4x9GmbUAY(r0, r1, r2, r3, r5)
            return
    }
}
