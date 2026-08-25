package com.flextv.livestore.adapter;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CastRecyclerAdapter$$ExternalSyntheticLambda0 implements android.view.View.OnFocusChangeListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView.Adapter f$0;
    public final /* synthetic */ java.lang.Object f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ java.lang.Object f$3;

    public /* synthetic */ CastRecyclerAdapter$$ExternalSyntheticLambda0(androidx.recyclerview.widget.RecyclerView.Adapter r1, androidx.recyclerview.widget.RecyclerView.ViewHolder r2, java.lang.Object r3, int r4, int r5) {
            r0 = this;
            r0.$r8$classId = r5
            r0.f$0 = r1
            r0.f$1 = r2
            r0.f$3 = r3
            r0.f$2 = r4
            r0.<init>()
            return
    }

    public /* synthetic */ CastRecyclerAdapter$$ExternalSyntheticLambda0(androidx.recyclerview.widget.RecyclerView.Adapter r1, java.lang.Object r2, int r3, androidx.recyclerview.widget.RecyclerView.ViewHolder r4, int r5) {
            r0 = this;
            r0.$r8$classId = r5
            r0.f$0 = r1
            r0.f$1 = r2
            r0.f$2 = r3
            r0.f$3 = r4
            r0.<init>()
            return
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View r8, boolean r9) {
            r7 = this;
            int r0 = r7.$r8$classId
            switch(r0) {
                case 0: goto Ld6;
                case 1: goto Lbf;
                case 2: goto La8;
                case 3: goto L91;
                case 4: goto L7a;
                case 5: goto L63;
                case 6: goto L4c;
                case 7: goto L35;
                case 8: goto L1e;
                case 9: goto L7;
                default: goto L5;
            }
        L5:
            goto Led
        L7:
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r7.f$0
            r1 = r0
            com.flextv.livestore.adapter.RecyclerVodCategoryAdapter r1 = (com.flextv.livestore.adapter.RecyclerVodCategoryAdapter) r1
            java.lang.Object r0 = r7.f$1
            r2 = r0
            com.flextv.livestore.models.CategoryModel r2 = (com.flextv.livestore.models.CategoryModel) r2
            int r3 = r7.f$2
            java.lang.Object r0 = r7.f$3
            r4 = r0
            com.flextv.livestore.adapter.RecyclerVodCategoryAdapter$LiveHomeViewHolder r4 = (com.flextv.livestore.adapter.RecyclerVodCategoryAdapter.LiveHomeViewHolder) r4
            r5 = r8
            r6 = r9
            com.flextv.livestore.adapter.RecyclerVodCategoryAdapter.$r8$lambda$_WTImd2dUHzQUMIV6osjy6zOcTU(r1, r2, r3, r4, r5, r6)
            return
        L1e:
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r7.f$0
            r1 = r0
            com.flextv.livestore.adapter.RecyclerSeriesHomeAdapter r1 = (com.flextv.livestore.adapter.RecyclerSeriesHomeAdapter) r1
            java.lang.Object r0 = r7.f$1
            r2 = r0
            com.flextv.livestore.models.SeriesModel r2 = (com.flextv.livestore.models.SeriesModel) r2
            int r3 = r7.f$2
            java.lang.Object r0 = r7.f$3
            r4 = r0
            com.flextv.livestore.adapter.RecyclerSeriesHomeAdapter$LiveHomeViewHolder r4 = (com.flextv.livestore.adapter.RecyclerSeriesHomeAdapter.LiveHomeViewHolder) r4
            r5 = r8
            r6 = r9
            com.flextv.livestore.adapter.RecyclerSeriesHomeAdapter.$r8$lambda$qkqk_e8RGFqUR9VWI4brc6QHofk(r1, r2, r3, r4, r5, r6)
            return
        L35:
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r7.f$0
            r1 = r0
            com.flextv.livestore.adapter.RecyclerLiveHomeAdapter r1 = (com.flextv.livestore.adapter.RecyclerLiveHomeAdapter) r1
            java.lang.Object r0 = r7.f$1
            r2 = r0
            com.flextv.livestore.models.EPGChannel r2 = (com.flextv.livestore.models.EPGChannel) r2
            int r3 = r7.f$2
            java.lang.Object r0 = r7.f$3
            r4 = r0
            com.flextv.livestore.adapter.RecyclerLiveHomeAdapter$LiveHomeViewHolder r4 = (com.flextv.livestore.adapter.RecyclerLiveHomeAdapter.LiveHomeViewHolder) r4
            r5 = r8
            r6 = r9
            com.flextv.livestore.adapter.RecyclerLiveHomeAdapter.m98$r8$lambda$9zoX_wsYyBcRLLVyJgnWzZ70mg(r1, r2, r3, r4, r5, r6)
            return
        L4c:
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r7.f$0
            r1 = r0
            com.flextv.livestore.adapter.RecyclerLiveChannelAdapter r1 = (com.flextv.livestore.adapter.RecyclerLiveChannelAdapter) r1
            java.lang.Object r0 = r7.f$1
            r2 = r0
            com.flextv.livestore.adapter.RecyclerLiveChannelAdapter$LiveChannelViewHolder r2 = (com.flextv.livestore.adapter.RecyclerLiveChannelAdapter.LiveChannelViewHolder) r2
            java.lang.Object r0 = r7.f$3
            r3 = r0
            com.flextv.livestore.models.EPGChannel r3 = (com.flextv.livestore.models.EPGChannel) r3
            int r4 = r7.f$2
            r5 = r8
            r6 = r9
            com.flextv.livestore.adapter.RecyclerLiveChannelAdapter.$r8$lambda$cDVzNLLvT_TvwGVVBqRsefzKU5c(r1, r2, r3, r4, r5, r6)
            return
        L63:
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r7.f$0
            r1 = r0
            com.flextv.livestore.adapter.RecyclerLiveCategoryAdapter r1 = (com.flextv.livestore.adapter.RecyclerLiveCategoryAdapter) r1
            java.lang.Object r0 = r7.f$1
            r2 = r0
            com.flextv.livestore.adapter.RecyclerLiveCategoryAdapter$LiveHomeViewHolder r2 = (com.flextv.livestore.adapter.RecyclerLiveCategoryAdapter.LiveHomeViewHolder) r2
            java.lang.Object r0 = r7.f$3
            r3 = r0
            com.flextv.livestore.models.CategoryModel r3 = (com.flextv.livestore.models.CategoryModel) r3
            int r4 = r7.f$2
            r5 = r8
            r6 = r9
            com.flextv.livestore.adapter.RecyclerLiveCategoryAdapter.$r8$lambda$levUosoITEWs1UHOPmxJWz6_14o(r1, r2, r3, r4, r5, r6)
            return
        L7a:
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r7.f$0
            r1 = r0
            com.flextv.livestore.adapter.ProgramRecyclerAdapter r1 = (com.flextv.livestore.adapter.ProgramRecyclerAdapter) r1
            java.lang.Object r0 = r7.f$1
            r2 = r0
            com.flextv.livestore.models.CatchUpEpg r2 = (com.flextv.livestore.models.CatchUpEpg) r2
            int r3 = r7.f$2
            java.lang.Object r0 = r7.f$3
            r4 = r0
            com.flextv.livestore.adapter.ProgramRecyclerAdapter$XCProgramViewHolder r4 = (com.flextv.livestore.adapter.ProgramRecyclerAdapter.XCProgramViewHolder) r4
            r5 = r8
            r6 = r9
            com.flextv.livestore.adapter.ProgramRecyclerAdapter.$r8$lambda$95y582HNlJv04GmLcOVgdh9rKys(r1, r2, r3, r4, r5, r6)
            return
        L91:
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r7.f$0
            r1 = r0
            com.flextv.livestore.adapter.MovieCreditRecyclerAdapter r1 = (com.flextv.livestore.adapter.MovieCreditRecyclerAdapter) r1
            java.lang.Object r0 = r7.f$1
            r2 = r0
            com.flextv.livestore.adapter.MovieCreditRecyclerAdapter$VodViewHolder r2 = (com.flextv.livestore.adapter.MovieCreditRecyclerAdapter.VodViewHolder) r2
            java.lang.Object r0 = r7.f$3
            r3 = r0
            com.flextv.livestore.models.MovieCreditModel r3 = (com.flextv.livestore.models.MovieCreditModel) r3
            int r4 = r7.f$2
            r5 = r8
            r6 = r9
            com.flextv.livestore.adapter.MovieCreditRecyclerAdapter.$r8$lambda$j0NdT8anAYFPwQpNNmmZfDKi0pQ(r1, r2, r3, r4, r5, r6)
            return
        La8:
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r7.f$0
            r1 = r0
            com.flextv.livestore.adapter.EpisodeRecyclerAdapter r1 = (com.flextv.livestore.adapter.EpisodeRecyclerAdapter) r1
            java.lang.Object r0 = r7.f$1
            r2 = r0
            com.flextv.livestore.models.EpisodeModel r2 = (com.flextv.livestore.models.EpisodeModel) r2
            int r3 = r7.f$2
            java.lang.Object r0 = r7.f$3
            r4 = r0
            com.flextv.livestore.adapter.EpisodeRecyclerAdapter$XCEpisodeViewHolder r4 = (com.flextv.livestore.adapter.EpisodeRecyclerAdapter.XCEpisodeViewHolder) r4
            r5 = r8
            r6 = r9
            com.flextv.livestore.adapter.EpisodeRecyclerAdapter.$r8$lambda$BKt6I2IPqDI59trjN3P6Le8gckM(r1, r2, r3, r4, r5, r6)
            return
        Lbf:
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r7.f$0
            r1 = r0
            com.flextv.livestore.adapter.EpisodeHorizontalRecyclerAdapter r1 = (com.flextv.livestore.adapter.EpisodeHorizontalRecyclerAdapter) r1
            java.lang.Object r0 = r7.f$1
            r2 = r0
            com.flextv.livestore.models.EpisodeModel r2 = (com.flextv.livestore.models.EpisodeModel) r2
            int r3 = r7.f$2
            java.lang.Object r0 = r7.f$3
            r4 = r0
            com.flextv.livestore.adapter.EpisodeHorizontalRecyclerAdapter$EpisodeViewHolder r4 = (com.flextv.livestore.adapter.EpisodeHorizontalRecyclerAdapter.EpisodeViewHolder) r4
            r5 = r8
            r6 = r9
            com.flextv.livestore.adapter.EpisodeHorizontalRecyclerAdapter.$r8$lambda$iV5D88CAxRBGmREuU41pVEuhzjQ(r1, r2, r3, r4, r5, r6)
            return
        Ld6:
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r7.f$0
            r1 = r0
            com.flextv.livestore.adapter.CastRecyclerAdapter r1 = (com.flextv.livestore.adapter.CastRecyclerAdapter) r1
            java.lang.Object r0 = r7.f$1
            r2 = r0
            com.flextv.livestore.models.CastModel r2 = (com.flextv.livestore.models.CastModel) r2
            int r3 = r7.f$2
            java.lang.Object r0 = r7.f$3
            r4 = r0
            com.flextv.livestore.adapter.CastRecyclerAdapter$VodStalkerHolder r4 = (com.flextv.livestore.adapter.CastRecyclerAdapter.VodStalkerHolder) r4
            r5 = r8
            r6 = r9
            com.flextv.livestore.adapter.CastRecyclerAdapter.m91$r8$lambda$AKu8CPbcZC5kDuHWZC2mV_hdU8(r1, r2, r3, r4, r5, r6)
            return
        Led:
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r7.f$0
            r1 = r0
            com.flextv.livestore.adapter.RecyclerVodHomeAdapter r1 = (com.flextv.livestore.adapter.RecyclerVodHomeAdapter) r1
            java.lang.Object r0 = r7.f$1
            r2 = r0
            com.flextv.livestore.models.MovieModel r2 = (com.flextv.livestore.models.MovieModel) r2
            int r3 = r7.f$2
            java.lang.Object r0 = r7.f$3
            r4 = r0
            com.flextv.livestore.adapter.RecyclerVodHomeAdapter$LiveHomeViewHolder r4 = (com.flextv.livestore.adapter.RecyclerVodHomeAdapter.LiveHomeViewHolder) r4
            r5 = r8
            r6 = r9
            com.flextv.livestore.adapter.RecyclerVodHomeAdapter.$r8$lambda$CKwfSAWDU16n9bYsyzjSJsaiWQU(r1, r2, r3, r4, r5, r6)
            return
    }
}
