package com.flextv.livestore.adapter;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class VodRecyclerAdapter$$ExternalSyntheticLambda2 implements android.view.View.OnLongClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView.Adapter f$0;
    public final /* synthetic */ java.lang.Object f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ VodRecyclerAdapter$$ExternalSyntheticLambda2(androidx.recyclerview.widget.RecyclerView.Adapter r1, java.lang.Object r2, int r3, int r4) {
            r0 = this;
            r0.$r8$classId = r4
            r0.f$0 = r1
            r0.f$1 = r2
            r0.f$2 = r3
            r0.<init>()
            return
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View r4) {
            r3 = this;
            int r0 = r3.$r8$classId
            switch(r0) {
                case 0: goto L24;
                case 1: goto L15;
                case 2: goto L6;
                default: goto L5;
            }
        L5:
            goto L33
        L6:
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r3.f$0
            com.flextv.livestore.adapter.RecyclerLiveChannelAdapter r0 = (com.flextv.livestore.adapter.RecyclerLiveChannelAdapter) r0
            java.lang.Object r1 = r3.f$1
            com.flextv.livestore.models.EPGChannel r1 = (com.flextv.livestore.models.EPGChannel) r1
            int r2 = r3.f$2
            boolean r4 = com.flextv.livestore.adapter.RecyclerLiveChannelAdapter.$r8$lambda$HCUmuTD8wuWxg4g3QCeOIFLb8Lo(r0, r1, r2, r4)
            return r4
        L15:
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r3.f$0
            com.flextv.livestore.adapter.AddCategoryRecyclerAdapter r0 = (com.flextv.livestore.adapter.AddCategoryRecyclerAdapter) r0
            java.lang.Object r1 = r3.f$1
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r3.f$2
            boolean r4 = com.flextv.livestore.adapter.AddCategoryRecyclerAdapter.$r8$lambda$ftQzF97QvynlDNe3XsikD9_UzGQ(r0, r1, r2, r4)
            return r4
        L24:
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r3.f$0
            com.flextv.livestore.adapter.VodRecyclerAdapter r0 = (com.flextv.livestore.adapter.VodRecyclerAdapter) r0
            java.lang.Object r1 = r3.f$1
            com.flextv.livestore.models.MovieModel r1 = (com.flextv.livestore.models.MovieModel) r1
            int r2 = r3.f$2
            boolean r4 = com.flextv.livestore.adapter.VodRecyclerAdapter.m102$r8$lambda$ExjkCZ2L6mFLakVJxazmgDyIY(r0, r1, r2, r4)
            return r4
        L33:
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r3.f$0
            com.flextv.livestore.adapter.SeriesRecyclerAdapter r0 = (com.flextv.livestore.adapter.SeriesRecyclerAdapter) r0
            java.lang.Object r1 = r3.f$1
            com.flextv.livestore.models.SeriesModel r1 = (com.flextv.livestore.models.SeriesModel) r1
            int r2 = r3.f$2
            boolean r4 = com.flextv.livestore.adapter.SeriesRecyclerAdapter.$r8$lambda$ex25EsfzP7XtEA1zbvzN0J4PbOA(r0, r1, r2, r4)
            return r4
    }
}
