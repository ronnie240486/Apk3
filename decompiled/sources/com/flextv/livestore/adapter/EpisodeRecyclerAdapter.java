package com.flextv.livestore.adapter;

/* JADX INFO: loaded from: classes.dex */
public class EpisodeRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.flextv.livestore.adapter.EpisodeRecyclerAdapter.XCEpisodeViewHolder> {
    public kotlin.jvm.functions.Function3<com.flextv.livestore.models.EpisodeModel, java.lang.Integer, java.lang.Boolean, kotlin.Unit> clickFunctionListener;
    public android.content.Context context;
    public java.util.List<com.flextv.livestore.models.EpisodeModel> episodeModels;
    public java.lang.String season_name;
    public java.lang.String series_name;
    public com.flextv.livestore.helper.PreferenceHelper sharedPreferenceHelper;

    public class XCEpisodeViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        public android.widget.ImageView image_logo;
        public android.widget.ProgressBar seekbar;
        public android.widget.TextView txt_description;
        public android.widget.TextView txt_name;
        public android.widget.TextView txt_num;

        public XCEpisodeViewHolder(@androidx.annotation.NonNull com.flextv.livestore.adapter.EpisodeRecyclerAdapter r1, android.view.View r2) {
                r0 = this;
                r0.<init>(r2)
                r1 = 2131427805(0x7f0b01dd, float:1.8477237E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                r0.image_logo = r1
                r1 = 2131428324(0x7f0b03e4, float:1.847829E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r0.txt_name = r1
                r1 = 2131428328(0x7f0b03e8, float:1.8478297E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r0.txt_num = r1
                r1 = 2131428299(0x7f0b03cb, float:1.8478239E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r0.txt_description = r1
                r1 = 2131428136(0x7f0b0328, float:1.8477908E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
                r0.seekbar = r1
                return
        }
    }

    public static /* synthetic */ void $r8$lambda$BKt6I2IPqDI59trjN3P6Le8gckM(com.flextv.livestore.adapter.EpisodeRecyclerAdapter r0, com.flextv.livestore.models.EpisodeModel r1, int r2, com.flextv.livestore.adapter.EpisodeRecyclerAdapter.XCEpisodeViewHolder r3, android.view.View r4, boolean r5) {
            r0.lambda$onBindViewHolder$0(r1, r2, r3, r4, r5)
            return
    }

    public static /* synthetic */ void $r8$lambda$Uig1X3lBycOSPz1QQBoKdl9YHFI(com.flextv.livestore.adapter.EpisodeRecyclerAdapter r0, com.flextv.livestore.models.EpisodeModel r1, int r2, android.view.View r3) {
            r0.lambda$onBindViewHolder$1(r1, r2, r3)
            return
    }

    public EpisodeRecyclerAdapter(android.content.Context r1, java.util.List<com.flextv.livestore.models.EpisodeModel> r2, java.lang.String r3, java.lang.String r4, kotlin.jvm.functions.Function3<com.flextv.livestore.models.EpisodeModel, java.lang.Integer, java.lang.Boolean, kotlin.Unit> r5) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            r0.episodeModels = r2
            r0.series_name = r3
            r0.season_name = r4
            r0.clickFunctionListener = r5
            com.flextv.livestore.helper.PreferenceHelper r2 = new com.flextv.livestore.helper.PreferenceHelper
            r2.<init>(r1)
            r0.sharedPreferenceHelper = r2
            return
    }

    private int getCurrentProgress(java.lang.String r4) {
            r3 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = r3.sharedPreferenceHelper
            java.util.List r0 = r0.getSharedPreferenceSeriesResumeModel()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r0.next()
            com.flextv.livestore.models.ResumeModel r1 = (com.flextv.livestore.models.ResumeModel) r1
            java.lang.String r2 = r1.getName()
            boolean r2 = r2.equalsIgnoreCase(r4)
            if (r2 == 0) goto La
            int r4 = r1.getPro()
            return r4
        L25:
            r4 = 0
            return r4
    }

    private /* synthetic */ void lambda$onBindViewHolder$0(com.flextv.livestore.models.EpisodeModel r2, int r3, com.flextv.livestore.adapter.EpisodeRecyclerAdapter.XCEpisodeViewHolder r4, android.view.View r5, boolean r6) {
            r1 = this;
            r5 = 0
            if (r6 == 0) goto L3c
            kotlin.jvm.functions.Function3<com.flextv.livestore.models.EpisodeModel, java.lang.Integer, java.lang.Boolean, kotlin.Unit> r6 = r1.clickFunctionListener
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r6.invoke(r2, r3, r0)
            android.view.View r3 = r4.itemView
            r6 = 2131231123(0x7f080193, float:1.8078318E38)
            r3.setBackgroundResource(r6)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = r1.series_name
            r3.append(r6)
            java.lang.String r6 = r1.season_name
            r3.append(r6)
            java.lang.String r2 = r2.getTitle()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            int r2 = r1.getCurrentProgress(r2)
            if (r2 <= 0) goto L71
            android.widget.ProgressBar r2 = r4.seekbar
            r2.setVisibility(r5)
            goto L71
        L3c:
            android.view.View r3 = r4.itemView
            r6 = 2131099781(0x7f060085, float:1.7811925E38)
            r3.setBackgroundResource(r6)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = r1.series_name
            r3.append(r6)
            java.lang.String r6 = r1.season_name
            r3.append(r6)
            java.lang.String r2 = r2.getTitle()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            int r2 = r1.getCurrentProgress(r2)
            if (r2 <= 0) goto L6a
            android.widget.ProgressBar r2 = r4.seekbar
            r2.setVisibility(r5)
            goto L71
        L6a:
            android.widget.ProgressBar r2 = r4.seekbar
            r3 = 8
            r2.setVisibility(r3)
        L71:
            return
    }

    private /* synthetic */ void lambda$onBindViewHolder$1(com.flextv.livestore.models.EpisodeModel r2, int r3, android.view.View r4) {
            r1 = this;
            kotlin.jvm.functions.Function3<com.flextv.livestore.models.EpisodeModel, java.lang.Integer, java.lang.Boolean, kotlin.Unit> r4 = r1.clickFunctionListener
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r4.invoke(r2, r3, r0)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
            r1 = this;
            java.util.List<com.flextv.livestore.models.EpisodeModel> r0 = r1.episodeModels
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.size()
        La:
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r1, int r2) {
            r0 = this;
            com.flextv.livestore.adapter.EpisodeRecyclerAdapter$XCEpisodeViewHolder r1 = (com.flextv.livestore.adapter.EpisodeRecyclerAdapter.XCEpisodeViewHolder) r1
            r0.onBindViewHolder(r1, r2)
            return
    }

    public void onBindViewHolder(@androidx.annotation.NonNull com.flextv.livestore.adapter.EpisodeRecyclerAdapter.XCEpisodeViewHolder r10, int r11) {
            r9 = this;
            java.util.List<com.flextv.livestore.models.EpisodeModel> r0 = r9.episodeModels
            java.lang.Object r0 = r0.get(r11)
            com.flextv.livestore.models.EpisodeModel r0 = (com.flextv.livestore.models.EpisodeModel) r0
            android.widget.TextView r1 = r10.txt_num
            java.lang.String r2 = r0.getEpisode_num()
            r1.setText(r2)
            android.widget.TextView r1 = r10.txt_name
            java.lang.String r2 = r0.getTitle()
            r1.setText(r2)
            com.flextv.livestore.models.EpisodeInfoModel r1 = r0.getInfo()
            if (r1 == 0) goto L2d
            android.widget.TextView r1 = r10.txt_description
            com.flextv.livestore.models.EpisodeInfoModel r2 = r0.getInfo()
            java.lang.String r2 = r2.getPlot()
            r1.setText(r2)
        L2d:
            com.flextv.livestore.models.EpisodeInfoModel r1 = r0.getInfo()
            r2 = 2131230899(0x7f0800b3, float:1.8077864E38)
            if (r1 == 0) goto L72
            com.flextv.livestore.models.EpisodeInfoModel r1 = r0.getInfo()
            java.lang.String r1 = r1.getMovie_image()
            if (r1 == 0) goto L72
            com.flextv.livestore.models.EpisodeInfoModel r1 = r0.getInfo()
            java.lang.String r1 = r1.getMovie_image()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L72
            android.content.Context r1 = r9.context
            com.bumptech.glide.RequestManager r1 = com.bumptech.glide.Glide.with(r1)
            com.flextv.livestore.models.EpisodeInfoModel r3 = r0.getInfo()
            java.lang.String r3 = r3.getMovie_image()
            com.bumptech.glide.RequestBuilder r1 = r1.load(r3)
            com.bumptech.glide.request.BaseRequestOptions r1 = r1.error(r2)
            com.bumptech.glide.RequestBuilder r1 = (com.bumptech.glide.RequestBuilder) r1
            com.bumptech.glide.request.BaseRequestOptions r1 = r1.placeholder(r2)
            com.bumptech.glide.RequestBuilder r1 = (com.bumptech.glide.RequestBuilder) r1
            android.widget.ImageView r2 = r10.image_logo
            r1.into(r2)
            goto L8b
        L72:
            android.content.Context r1 = r9.context
            com.bumptech.glide.RequestManager r1 = com.bumptech.glide.Glide.with(r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            com.bumptech.glide.RequestBuilder r1 = r1.load(r3)
            com.bumptech.glide.request.BaseRequestOptions r1 = r1.error(r2)
            com.bumptech.glide.RequestBuilder r1 = (com.bumptech.glide.RequestBuilder) r1
            android.widget.ImageView r2 = r10.image_logo
            r1.into(r2)
        L8b:
            android.widget.ProgressBar r1 = r10.seekbar
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r9.series_name
            r2.append(r3)
            java.lang.String r3 = r9.season_name
            r2.append(r3)
            java.lang.String r3 = r0.getTitle()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            int r2 = r9.getCurrentProgress(r2)
            r1.setProgress(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r9.series_name
            r1.append(r2)
            java.lang.String r2 = r9.season_name
            r1.append(r2)
            java.lang.String r2 = r0.getTitle()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            int r1 = r9.getCurrentProgress(r1)
            if (r1 <= 0) goto Ld5
            android.widget.ProgressBar r1 = r10.seekbar
            r2 = 0
            r1.setVisibility(r2)
            goto Ldc
        Ld5:
            android.widget.ProgressBar r1 = r10.seekbar
            r2 = 8
            r1.setVisibility(r2)
        Ldc:
            android.view.View r7 = r10.itemView
            com.flextv.livestore.adapter.CastRecyclerAdapter$$ExternalSyntheticLambda0 r8 = new com.flextv.livestore.adapter.CastRecyclerAdapter$$ExternalSyntheticLambda0
            r6 = 2
            r1 = r8
            r2 = r9
            r3 = r0
            r4 = r11
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            r7.setOnFocusChangeListener(r8)
            android.view.View r10 = r10.itemView
            com.flextv.livestore.adapter.VodRecyclerAdapter$$ExternalSyntheticLambda0 r1 = new com.flextv.livestore.adapter.VodRecyclerAdapter$$ExternalSyntheticLambda0
            r2 = 6
            r1.<init>(r9, r0, r11, r2)
            r10.setOnClickListener(r1)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r1, int r2) {
            r0 = this;
            com.flextv.livestore.adapter.EpisodeRecyclerAdapter$XCEpisodeViewHolder r1 = r0.onCreateViewHolder(r1, r2)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    public com.flextv.livestore.adapter.EpisodeRecyclerAdapter.XCEpisodeViewHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r3, int r4) {
            r2 = this;
            com.flextv.livestore.adapter.EpisodeRecyclerAdapter$XCEpisodeViewHolder r4 = new com.flextv.livestore.adapter.EpisodeRecyclerAdapter$XCEpisodeViewHolder
            r0 = 2131624053(0x7f0e0075, float:1.8875275E38)
            r1 = 0
            android.view.View r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r0, r3, r1)
            r4.<init>(r2, r3)
            return r4
    }

    public void setEpisodeModels(java.util.List<com.flextv.livestore.models.EpisodeModel> r1, java.lang.String r2) {
            r0 = this;
            r0.episodeModels = r1
            r0.season_name = r2
            r0.notifyDataSetChanged()
            return
    }
}
