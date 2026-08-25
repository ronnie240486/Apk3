package com.flextv.livestore.adapter;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RecyclerVodHomeAdapter$$ExternalSyntheticLambda0 implements android.view.View.OnTouchListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView.Adapter f$0;
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder f$1;
    public final /* synthetic */ io.realm.RealmObject f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ RecyclerVodHomeAdapter$$ExternalSyntheticLambda0(androidx.recyclerview.widget.RecyclerView.Adapter r1, androidx.recyclerview.widget.RecyclerView.ViewHolder r2, io.realm.RealmObject r3, int r4, int r5) {
            r0 = this;
            r0.$r8$classId = r5
            r0.f$0 = r1
            r0.f$1 = r2
            r0.f$2 = r3
            r0.f$3 = r4
            r0.<init>()
            return
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
            r7 = this;
            int r0 = r7.$r8$classId
            switch(r0) {
                case 0: goto L1e;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L36
        L6:
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r7.f$0
            r1 = r0
            com.flextv.livestore.adapter.RecyclerLiveHomeAdapter r1 = (com.flextv.livestore.adapter.RecyclerLiveHomeAdapter) r1
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r7.f$1
            r2 = r0
            com.flextv.livestore.adapter.RecyclerLiveHomeAdapter$LiveHomeViewHolder r2 = (com.flextv.livestore.adapter.RecyclerLiveHomeAdapter.LiveHomeViewHolder) r2
            io.realm.RealmObject r0 = r7.f$2
            r3 = r0
            com.flextv.livestore.models.EPGChannel r3 = (com.flextv.livestore.models.EPGChannel) r3
            int r4 = r7.f$3
            r5 = r8
            r6 = r9
            boolean r8 = com.flextv.livestore.adapter.RecyclerLiveHomeAdapter.$r8$lambda$DYROpOqq63jYpFmBZOKFrQnVdpQ(r1, r2, r3, r4, r5, r6)
            return r8
        L1e:
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r7.f$0
            r1 = r0
            com.flextv.livestore.adapter.RecyclerVodHomeAdapter r1 = (com.flextv.livestore.adapter.RecyclerVodHomeAdapter) r1
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r7.f$1
            r2 = r0
            com.flextv.livestore.adapter.RecyclerVodHomeAdapter$LiveHomeViewHolder r2 = (com.flextv.livestore.adapter.RecyclerVodHomeAdapter.LiveHomeViewHolder) r2
            io.realm.RealmObject r0 = r7.f$2
            r3 = r0
            com.flextv.livestore.models.MovieModel r3 = (com.flextv.livestore.models.MovieModel) r3
            int r4 = r7.f$3
            r5 = r8
            r6 = r9
            boolean r8 = com.flextv.livestore.adapter.RecyclerVodHomeAdapter.m100$r8$lambda$urvsdsbdKHsMPBCRFT4DqrZxbc(r1, r2, r3, r4, r5, r6)
            return r8
        L36:
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r7.f$0
            r1 = r0
            com.flextv.livestore.adapter.RecyclerSeriesHomeAdapter r1 = (com.flextv.livestore.adapter.RecyclerSeriesHomeAdapter) r1
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r7.f$1
            r2 = r0
            com.flextv.livestore.adapter.RecyclerSeriesHomeAdapter$LiveHomeViewHolder r2 = (com.flextv.livestore.adapter.RecyclerSeriesHomeAdapter.LiveHomeViewHolder) r2
            io.realm.RealmObject r0 = r7.f$2
            r3 = r0
            com.flextv.livestore.models.SeriesModel r3 = (com.flextv.livestore.models.SeriesModel) r3
            int r4 = r7.f$3
            r5 = r8
            r6 = r9
            boolean r8 = com.flextv.livestore.adapter.RecyclerSeriesHomeAdapter.$r8$lambda$FFLwsVO90USePmXNIm4E4V_hQPc(r1, r2, r3, r4, r5, r6)
            return r8
    }
}
