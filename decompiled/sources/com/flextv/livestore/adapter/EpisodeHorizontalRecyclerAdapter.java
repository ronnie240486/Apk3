package com.flextv.livestore.adapter;

/* JADX INFO: loaded from: classes.dex */
public class EpisodeHorizontalRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.flextv.livestore.adapter.EpisodeHorizontalRecyclerAdapter.EpisodeViewHolder> {
    public kotlin.jvm.functions.Function3<com.flextv.livestore.models.EpisodeModel, java.lang.Integer, java.lang.Boolean, kotlin.Unit> clickFunctionListener;
    public android.content.Context context;
    public java.util.List<com.flextv.livestore.models.EpisodeModel> models;
    public int season_pos;
    public int selected_pos;

    public class EpisodeViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        public com.makeramen.roundedimageview.RoundedImageView image_episode;
        public com.makeramen.roundedimageview.RoundedImageView image_logo;
        public android.widget.ImageView image_play;
        public android.widget.TextView txt_name;

        public EpisodeViewHolder(@androidx.annotation.NonNull com.flextv.livestore.adapter.EpisodeHorizontalRecyclerAdapter r1, android.view.View r2) {
                r0 = this;
                r0.<init>(r2)
                r1 = 2131428324(0x7f0b03e4, float:1.847829E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r0.txt_name = r1
                r1 = 2131427796(0x7f0b01d4, float:1.8477218E38)
                android.view.View r1 = r2.findViewById(r1)
                com.makeramen.roundedimageview.RoundedImageView r1 = (com.makeramen.roundedimageview.RoundedImageView) r1
                r0.image_episode = r1
                r1 = 2131427805(0x7f0b01dd, float:1.8477237E38)
                android.view.View r1 = r2.findViewById(r1)
                com.makeramen.roundedimageview.RoundedImageView r1 = (com.makeramen.roundedimageview.RoundedImageView) r1
                r0.image_logo = r1
                r1 = 2131427809(0x7f0b01e1, float:1.8477245E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                r0.image_play = r1
                return
        }
    }

    public static /* synthetic */ void $r8$lambda$iV5D88CAxRBGmREuU41pVEuhzjQ(com.flextv.livestore.adapter.EpisodeHorizontalRecyclerAdapter r0, com.flextv.livestore.models.EpisodeModel r1, int r2, com.flextv.livestore.adapter.EpisodeHorizontalRecyclerAdapter.EpisodeViewHolder r3, android.view.View r4, boolean r5) {
            r0.lambda$onBindViewHolder$1(r1, r2, r3, r4, r5)
            return
    }

    public static /* synthetic */ void $r8$lambda$wYweVQsBoFffyEBi9VG4a6Jisug(com.flextv.livestore.adapter.EpisodeHorizontalRecyclerAdapter r0, com.flextv.livestore.models.EpisodeModel r1, int r2, android.view.View r3) {
            r0.lambda$onBindViewHolder$0(r1, r2, r3)
            return
    }

    public EpisodeHorizontalRecyclerAdapter(android.content.Context r1, java.util.List<com.flextv.livestore.models.EpisodeModel> r2, int r3, kotlin.jvm.functions.Function3<com.flextv.livestore.models.EpisodeModel, java.lang.Integer, java.lang.Boolean, kotlin.Unit> r4) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            r0.models = r2
            r0.selected_pos = r3
            r0.clickFunctionListener = r4
            return
    }

    private /* synthetic */ void lambda$onBindViewHolder$0(com.flextv.livestore.models.EpisodeModel r2, int r3, android.view.View r4) {
            r1 = this;
            kotlin.jvm.functions.Function3<com.flextv.livestore.models.EpisodeModel, java.lang.Integer, java.lang.Boolean, kotlin.Unit> r4 = r1.clickFunctionListener
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r4.invoke(r2, r3, r0)
            return
    }

    private /* synthetic */ void lambda$onBindViewHolder$1(com.flextv.livestore.models.EpisodeModel r1, int r2, com.flextv.livestore.adapter.EpisodeHorizontalRecyclerAdapter.EpisodeViewHolder r3, android.view.View r4, boolean r5) {
            r0 = this;
            if (r5 == 0) goto L16
            kotlin.jvm.functions.Function3<com.flextv.livestore.models.EpisodeModel, java.lang.Integer, java.lang.Boolean, kotlin.Unit> r4 = r0.clickFunctionListener
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r4.invoke(r1, r2, r5)
            android.view.View r1 = r3.itemView
            r2 = 2131231066(0x7f08015a, float:1.8078203E38)
            r1.setBackgroundResource(r2)
            goto L1e
        L16:
            android.view.View r1 = r3.itemView
            r2 = 2131231065(0x7f080159, float:1.80782E38)
            r1.setBackgroundResource(r2)
        L1e:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
            r1 = this;
            java.util.List<com.flextv.livestore.models.EpisodeModel> r0 = r1.models
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.size()
        La:
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    public /* bridge */ /* synthetic */ void onBindViewHolder(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r1, int r2) {
            r0 = this;
            com.flextv.livestore.adapter.EpisodeHorizontalRecyclerAdapter$EpisodeViewHolder r1 = (com.flextv.livestore.adapter.EpisodeHorizontalRecyclerAdapter.EpisodeViewHolder) r1
            r0.onBindViewHolder(r1, r2)
            return
    }

    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    public void onBindViewHolder(@androidx.annotation.NonNull com.flextv.livestore.adapter.EpisodeHorizontalRecyclerAdapter.EpisodeViewHolder r10, int r11) {
            r9 = this;
            java.util.List<com.flextv.livestore.models.EpisodeModel> r0 = r9.models
            java.lang.Object r0 = r0.get(r11)
            r3 = r0
            com.flextv.livestore.models.EpisodeModel r3 = (com.flextv.livestore.models.EpisodeModel) r3
            android.widget.TextView r0 = r10.txt_name
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r2 = r9.season_pos
            r4 = 1
            int r2 = r2 + r4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r7 = 0
            r1[r7] = r2
            int r2 = r11 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r4] = r2
            java.lang.String r2 = "S%d .E%d"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.setText(r1)
            com.flextv.livestore.helper.PreferenceHelper r0 = new com.flextv.livestore.helper.PreferenceHelper
            android.content.Context r1 = r9.context
            r0.<init>(r1)
            boolean r0 = r0.getSharedPreferenceISM3U()
            if (r0 == 0) goto L3c
            java.lang.String r0 = r3.getStream_icon()
            goto L4f
        L3c:
            com.flextv.livestore.models.EpisodeInfoModel r0 = r3.getInfo()
            if (r0 == 0) goto L4b
            com.flextv.livestore.models.EpisodeInfoModel r0 = r3.getInfo()
            java.lang.String r0 = r0.getMovie_image()
            goto L4f
        L4b:
            java.lang.String r0 = r3.getStream_icon()
        L4f:
            android.content.Context r1 = r9.context
            com.makeramen.roundedimageview.RoundedImageView r2 = r10.image_episode
            r4 = 2131230899(0x7f0800b3, float:1.8077864E38)
            com.makeramen.roundedimageview.RoundedImageView r5 = r10.image_logo
            com.flextv.livestore.utils.ImageLoaderJava.imageLoadUrlWithVodHolder(r1, r2, r0, r4, r5)
            android.view.View r0 = r10.itemView
            com.flextv.livestore.adapter.VodRecyclerAdapter$$ExternalSyntheticLambda0 r1 = new com.flextv.livestore.adapter.VodRecyclerAdapter$$ExternalSyntheticLambda0
            r2 = 5
            r1.<init>(r9, r3, r11, r2)
            r0.setOnClickListener(r1)
            android.view.View r0 = r10.itemView
            com.flextv.livestore.adapter.CastRecyclerAdapter$$ExternalSyntheticLambda0 r8 = new com.flextv.livestore.adapter.CastRecyclerAdapter$$ExternalSyntheticLambda0
            r6 = 1
            r1 = r8
            r2 = r9
            r4 = r11
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            r0.setOnFocusChangeListener(r8)
            int r0 = r9.selected_pos
            if (r0 != r11) goto L84
            android.view.View r11 = r10.itemView
            r11.requestFocus()
            android.widget.ImageView r10 = r10.image_play
            r10.setVisibility(r7)
            goto L8b
        L84:
            android.widget.ImageView r10 = r10.image_play
            r11 = 8
            r10.setVisibility(r11)
        L8b:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r1, int r2) {
            r0 = this;
            com.flextv.livestore.adapter.EpisodeHorizontalRecyclerAdapter$EpisodeViewHolder r1 = r0.onCreateViewHolder(r1, r2)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    public com.flextv.livestore.adapter.EpisodeHorizontalRecyclerAdapter.EpisodeViewHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r3, int r4) {
            r2 = this;
            com.flextv.livestore.adapter.EpisodeHorizontalRecyclerAdapter$EpisodeViewHolder r4 = new com.flextv.livestore.adapter.EpisodeHorizontalRecyclerAdapter$EpisodeViewHolder
            r0 = 2131624054(0x7f0e0076, float:1.8875277E38)
            r1 = 0
            android.view.View r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r0, r3, r1)
            r4.<init>(r2, r3)
            return r4
    }

    public void setEpisodes(java.util.List<com.flextv.livestore.models.EpisodeModel> r1, int r2) {
            r0 = this;
            r0.models = r1
            r0.season_pos = r2
            r0.notifyDataSetChanged()
            return
    }

    public void setSelectedPosition(int r2) {
            r1 = this;
            int r0 = r1.selected_pos
            r1.selected_pos = r2
            r1.notifyItemChanged(r0)
            int r2 = r1.selected_pos
            r1.notifyItemChanged(r2)
            return
    }
}
