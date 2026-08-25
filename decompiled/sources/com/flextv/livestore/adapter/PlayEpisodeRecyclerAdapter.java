package com.flextv.livestore.adapter;

/* JADX INFO: loaded from: classes.dex */
public class PlayEpisodeRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.flextv.livestore.adapter.PlayEpisodeRecyclerAdapter.EpisodeViewHolder> {
    public kotlin.jvm.functions.Function2<com.flextv.livestore.models.EpisodeModel, java.lang.Integer, kotlin.Unit> clickFunctionListener;
    public android.content.Context context;
    public java.util.List<com.flextv.livestore.models.EpisodeModel> models;
    public int season_pos;
    public int selected_pos;

    /* JADX INFO: loaded from: classes2.dex */
    public class EpisodeViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        public com.makeramen.roundedimageview.RoundedImageView image_episode;
        public android.widget.ImageView image_logo;
        public android.widget.TextView txt_name;

        public EpisodeViewHolder(@androidx.annotation.NonNull com.flextv.livestore.adapter.PlayEpisodeRecyclerAdapter r1, android.view.View r2) {
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
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                r0.image_logo = r1
                return
        }
    }

    public static /* synthetic */ void $r8$lambda$FHPVxpf95YKLGPj739zi4X2xNHU(com.flextv.livestore.adapter.PlayEpisodeRecyclerAdapter r0, com.flextv.livestore.models.EpisodeModel r1, int r2, android.view.View r3) {
            r0.lambda$onBindViewHolder$0(r1, r2, r3)
            return
    }

    public PlayEpisodeRecyclerAdapter(android.content.Context r1, java.util.List<com.flextv.livestore.models.EpisodeModel> r2, int r3, int r4, kotlin.jvm.functions.Function2<com.flextv.livestore.models.EpisodeModel, java.lang.Integer, kotlin.Unit> r5) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            r0.models = r2
            r0.season_pos = r3
            r0.selected_pos = r4
            r0.clickFunctionListener = r5
            return
    }

    private /* synthetic */ void lambda$onBindViewHolder$0(com.flextv.livestore.models.EpisodeModel r1, int r2, android.view.View r3) {
            r0 = this;
            kotlin.jvm.functions.Function2<com.flextv.livestore.models.EpisodeModel, java.lang.Integer, kotlin.Unit> r3 = r0.clickFunctionListener
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.invoke(r1, r2)
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
            com.flextv.livestore.adapter.PlayEpisodeRecyclerAdapter$EpisodeViewHolder r1 = (com.flextv.livestore.adapter.PlayEpisodeRecyclerAdapter.EpisodeViewHolder) r1
            r0.onBindViewHolder(r1, r2)
            return
    }

    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    public void onBindViewHolder(@androidx.annotation.NonNull com.flextv.livestore.adapter.PlayEpisodeRecyclerAdapter.EpisodeViewHolder r8, int r9) {
            r7 = this;
            java.util.List<com.flextv.livestore.models.EpisodeModel> r0 = r7.models
            java.lang.Object r0 = r0.get(r9)
            com.flextv.livestore.models.EpisodeModel r0 = (com.flextv.livestore.models.EpisodeModel) r0
            android.widget.TextView r1 = r8.txt_name
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r3 = r7.season_pos
            r4 = 1
            int r3 = r3 + r4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 0
            r2[r5] = r3
            int r3 = r9 + 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r4] = r3
            java.lang.String r3 = "S%d .E%d"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r1.setText(r2)
            com.flextv.livestore.helper.PreferenceHelper r1 = new com.flextv.livestore.helper.PreferenceHelper
            android.content.Context r2 = r7.context
            r1.<init>(r2)
            boolean r1 = r1.getSharedPreferenceISM3U()
            if (r1 == 0) goto L3b
            java.lang.String r1 = r0.getStream_icon()
            goto L4e
        L3b:
            com.flextv.livestore.models.EpisodeInfoModel r1 = r0.getInfo()
            if (r1 == 0) goto L4a
            com.flextv.livestore.models.EpisodeInfoModel r1 = r0.getInfo()
            java.lang.String r1 = r1.getMovie_image()
            goto L4e
        L4a:
            java.lang.String r1 = r0.getStream_icon()
        L4e:
            android.content.Context r2 = r7.context
            com.makeramen.roundedimageview.RoundedImageView r3 = r8.image_episode
            r4 = 2131230899(0x7f0800b3, float:1.8077864E38)
            android.widget.ImageView r6 = r8.image_logo
            com.flextv.livestore.utils.ImageLoaderJava.imageLoadUrlWithVodHolder(r2, r3, r1, r4, r6)
            android.view.View r1 = r8.itemView
            com.flextv.livestore.adapter.VodRecyclerAdapter$$ExternalSyntheticLambda0 r2 = new com.flextv.livestore.adapter.VodRecyclerAdapter$$ExternalSyntheticLambda0
            r3 = 9
            r2.<init>(r7, r0, r9, r3)
            r1.setOnClickListener(r2)
            int r0 = r7.selected_pos
            if (r0 != r9) goto L80
            android.widget.TextView r9 = r8.txt_name
            r0 = 2131231027(0x7f080133, float:1.8078123E38)
            r9.setCompoundDrawablesWithIntrinsicBounds(r0, r5, r5, r5)
            android.view.View r9 = r8.itemView
            r9.requestFocus()
            android.view.View r8 = r8.itemView
            r9 = 2131231066(0x7f08015a, float:1.8078203E38)
            r8.setBackgroundResource(r9)
            goto L8d
        L80:
            android.widget.TextView r9 = r8.txt_name
            r9.setCompoundDrawablesWithIntrinsicBounds(r5, r5, r5, r5)
            android.view.View r8 = r8.itemView
            r9 = 2131231065(0x7f080159, float:1.80782E38)
            r8.setBackgroundResource(r9)
        L8d:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r1, int r2) {
            r0 = this;
            com.flextv.livestore.adapter.PlayEpisodeRecyclerAdapter$EpisodeViewHolder r1 = r0.onCreateViewHolder(r1, r2)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    public com.flextv.livestore.adapter.PlayEpisodeRecyclerAdapter.EpisodeViewHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r3, int r4) {
            r2 = this;
            com.flextv.livestore.adapter.PlayEpisodeRecyclerAdapter$EpisodeViewHolder r4 = new com.flextv.livestore.adapter.PlayEpisodeRecyclerAdapter$EpisodeViewHolder
            r0 = 2131624054(0x7f0e0076, float:1.8875277E38)
            r1 = 0
            android.view.View r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r0, r3, r1)
            r4.<init>(r2, r3)
            return r4
    }
}
