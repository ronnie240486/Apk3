package com.flextv.livestore.activities;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class MoviePlayerActivity$$ExternalSyntheticLambda0 implements com.flextv.livestore.dlgfragment.SubtitleTrackDlgFragment.ItemPositionListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f$0;
    public final /* synthetic */ java.util.List f$1;
    public final /* synthetic */ java.util.List f$2;

    public /* synthetic */ MoviePlayerActivity$$ExternalSyntheticLambda0(androidx.appcompat.app.AppCompatActivity r1, java.util.List r2, java.util.List r3, int r4) {
            r0 = this;
            r0.$r8$classId = r4
            r0.f$0 = r1
            r0.f$1 = r2
            r0.f$2 = r3
            r0.<init>()
            return
    }

    @Override // com.flextv.livestore.dlgfragment.SubtitleTrackDlgFragment.ItemPositionListener
    public final void onItemPosition(int r4) {
            r3 = this;
            int r0 = r3.$r8$classId
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L12
        L6:
            androidx.appcompat.app.AppCompatActivity r0 = r3.f$0
            com.flextv.livestore.activities.MoviePlayerActivity r0 = (com.flextv.livestore.activities.MoviePlayerActivity) r0
            java.util.List r1 = r3.f$1
            java.util.List r2 = r3.f$2
            com.flextv.livestore.activities.MoviePlayerActivity.$r8$lambda$4AYq7vUQrYToPJ8T6Idt_SKh18M(r0, r1, r2, r4)
            return
        L12:
            androidx.appcompat.app.AppCompatActivity r0 = r3.f$0
            com.flextv.livestore.activities.SeriesPlayerActivity r0 = (com.flextv.livestore.activities.SeriesPlayerActivity) r0
            java.util.List r1 = r3.f$1
            java.util.List r2 = r3.f$2
            com.flextv.livestore.activities.SeriesPlayerActivity.m73$r8$lambda$n4gl3s6phjW07Gx7Fj5RC6wjx0(r0, r1, r2, r4)
            return
    }
}
