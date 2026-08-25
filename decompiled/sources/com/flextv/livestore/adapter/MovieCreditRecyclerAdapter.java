package com.flextv.livestore.adapter;

/* JADX INFO: loaded from: classes.dex */
public class MovieCreditRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.flextv.livestore.adapter.MovieCreditRecyclerAdapter.VodViewHolder> {
    public android.content.Context context;
    public com.flextv.livestore.adapter.MovieCreditRecyclerAdapter.ItemClickListener mItemClickListener;
    public java.util.List<com.flextv.livestore.models.MovieCreditModel> models;
    public int selected_pos;

    /* JADX INFO: loaded from: classes3.dex */
    public interface ItemClickListener {
        void onFocusPosition(com.flextv.livestore.models.MovieCreditModel r1, int r2);

        void onItemClick(com.flextv.livestore.models.MovieCreditModel r1, int r2);
    }

    /* JADX INFO: loaded from: classes3.dex */
    public class VodViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        public com.makeramen.roundedimageview.RoundedImageView image_logo;
        public com.makeramen.roundedimageview.RoundedImageView image_vod;
        public android.widget.ProgressBar seekBar;
        public android.widget.TextView txt_name;

        public VodViewHolder(@androidx.annotation.NonNull com.flextv.livestore.adapter.MovieCreditRecyclerAdapter r1, android.view.View r2) {
                r0 = this;
                r0.<init>(r2)
                r1 = 2131427824(0x7f0b01f0, float:1.8477275E38)
                android.view.View r1 = r2.findViewById(r1)
                com.makeramen.roundedimageview.RoundedImageView r1 = (com.makeramen.roundedimageview.RoundedImageView) r1
                r0.image_vod = r1
                r1 = 2131427805(0x7f0b01dd, float:1.8477237E38)
                android.view.View r1 = r2.findViewById(r1)
                com.makeramen.roundedimageview.RoundedImageView r1 = (com.makeramen.roundedimageview.RoundedImageView) r1
                r0.image_logo = r1
                r1 = 2131428324(0x7f0b03e4, float:1.847829E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r0.txt_name = r1
                r1 = 2131427798(0x7f0b01d6, float:1.8477222E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                r1 = 2131428135(0x7f0b0327, float:1.8477906E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
                r0.seekBar = r1
                return
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$4qn0aQ-LqcANbj7cycnozyysLNc, reason: not valid java name */
    public static /* synthetic */ void m94$r8$lambda$4qn0aQLqcANbj7cycnozyysLNc(com.flextv.livestore.adapter.MovieCreditRecyclerAdapter r0, int r1, com.flextv.livestore.models.MovieCreditModel r2, android.view.View r3) {
            r0.lambda$onBindViewHolder$0(r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$j0NdT8anAYFPwQpNNmmZfDKi0pQ(com.flextv.livestore.adapter.MovieCreditRecyclerAdapter r0, com.flextv.livestore.adapter.MovieCreditRecyclerAdapter.VodViewHolder r1, com.flextv.livestore.models.MovieCreditModel r2, int r3, android.view.View r4, boolean r5) {
            r0.lambda$onBindViewHolder$1(r1, r2, r3, r4, r5)
            return
    }

    public MovieCreditRecyclerAdapter(android.content.Context r2, @androidx.annotation.Nullable java.util.List<com.flextv.livestore.models.MovieCreditModel> r3) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.selected_pos = r0
            r1.context = r2
            r1.models = r3
            return
    }

    private /* synthetic */ void lambda$onBindViewHolder$0(int r1, com.flextv.livestore.models.MovieCreditModel r2, android.view.View r3) {
            r0 = this;
            int r3 = r0.selected_pos
            r0.selected_pos = r1
            r0.notifyItemChanged(r3)
            int r3 = r0.selected_pos
            r0.notifyItemChanged(r3)
            com.flextv.livestore.adapter.MovieCreditRecyclerAdapter$ItemClickListener r3 = r0.mItemClickListener
            r3.onItemClick(r2, r1)
            return
    }

    private /* synthetic */ void lambda$onBindViewHolder$1(com.flextv.livestore.adapter.MovieCreditRecyclerAdapter.VodViewHolder r2, com.flextv.livestore.models.MovieCreditModel r3, int r4, android.view.View r5, boolean r6) {
            r1 = this;
            if (r6 == 0) goto L2c
            android.view.View r5 = r2.itemView
            r6 = 2131231069(0x7f08015d, float:1.8078209E38)
            r5.setBackgroundResource(r6)
            android.widget.TextView r5 = r2.txt_name
            r6 = 1
            r5.setSelected(r6)
            android.widget.TextView r5 = r2.txt_name
            android.content.Context r6 = r1.context
            r0 = 2131099682(0x7f060022, float:1.7811724E38)
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6, r0, r5)
            android.view.View r5 = r2.itemView
            r6 = 1065353216(0x3f800000, float:1.0)
            r5.setScaleX(r6)
            android.view.View r2 = r2.itemView
            r2.setScaleY(r6)
            com.flextv.livestore.adapter.MovieCreditRecyclerAdapter$ItemClickListener r2 = r1.mItemClickListener
            r2.onFocusPosition(r3, r4)
            goto L51
        L2c:
            android.view.View r3 = r2.itemView
            r4 = 2131231067(0x7f08015b, float:1.8078205E38)
            r3.setBackgroundResource(r4)
            android.widget.TextView r3 = r2.txt_name
            android.content.Context r4 = r1.context
            r5 = 2131100407(0x7f0602f7, float:1.7813195E38)
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4, r5, r3)
            android.view.View r3 = r2.itemView
            r4 = 1064514355(0x3f733333, float:0.95)
            r3.setScaleX(r4)
            android.view.View r3 = r2.itemView
            r3.setScaleY(r4)
            android.widget.TextView r2 = r2.txt_name
            r3 = 0
            r2.setSelected(r3)
        L51:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
            r1 = this;
            java.util.List<com.flextv.livestore.models.MovieCreditModel> r0 = r1.models
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
            com.flextv.livestore.adapter.MovieCreditRecyclerAdapter$VodViewHolder r1 = (com.flextv.livestore.adapter.MovieCreditRecyclerAdapter.VodViewHolder) r1
            r0.onBindViewHolder(r1, r2)
            return
    }

    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    public void onBindViewHolder(@androidx.annotation.NonNull com.flextv.livestore.adapter.MovieCreditRecyclerAdapter.VodViewHolder r10, int r11) {
            r9 = this;
            java.util.List<com.flextv.livestore.models.MovieCreditModel> r0 = r9.models
            java.lang.Object r0 = r0.get(r11)
            com.flextv.livestore.models.MovieCreditModel r0 = (com.flextv.livestore.models.MovieCreditModel) r0
            android.widget.TextView r1 = r10.txt_name
            java.lang.String r2 = r0.getTitle()
            r1.setText(r2)
            android.widget.ProgressBar r1 = r10.seekBar
            r2 = 8
            r1.setVisibility(r2)
            android.content.Context r1 = r9.context
            com.makeramen.roundedimageview.RoundedImageView r2 = r10.image_vod
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = com.flextv.livestore.apps.Constants.IMDB_IMAGE_PREF
            r3.append(r4)
            java.lang.String r4 = r0.getPoster_path()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.makeramen.roundedimageview.RoundedImageView r4 = r10.image_logo
            r5 = 2131230889(0x7f0800a9, float:1.8077844E38)
            com.flextv.livestore.utils.ImageLoaderJava.imageLoadUrlWithVodHolder(r1, r2, r3, r5, r4)
            android.view.View r1 = r10.itemView
            com.flextv.livestore.adapter.VodRecyclerAdapter$$ExternalSyntheticLambda0 r2 = new com.flextv.livestore.adapter.VodRecyclerAdapter$$ExternalSyntheticLambda0
            r3 = 7
            r2.<init>(r9, r11, r0, r3)
            r1.setOnClickListener(r2)
            android.view.View r7 = r10.itemView
            com.flextv.livestore.adapter.CastRecyclerAdapter$$ExternalSyntheticLambda0 r8 = new com.flextv.livestore.adapter.CastRecyclerAdapter$$ExternalSyntheticLambda0
            r6 = 3
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r0
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r7.setOnFocusChangeListener(r8)
            int r1 = r9.selected_pos
            if (r1 != r11) goto L82
            android.view.View r1 = r10.itemView
            r2 = 2131231069(0x7f08015d, float:1.8078209E38)
            r1.setBackgroundResource(r2)
            android.widget.TextView r1 = r10.txt_name
            android.content.Context r2 = r9.context
            r3 = 2131099682(0x7f060022, float:1.7811724E38)
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r3, r1)
            android.widget.TextView r1 = r10.txt_name
            r2 = 1
            r1.setSelected(r2)
            android.view.View r1 = r10.itemView
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.setScaleX(r2)
            android.view.View r10 = r10.itemView
            r10.setScaleY(r2)
            com.flextv.livestore.adapter.MovieCreditRecyclerAdapter$ItemClickListener r10 = r9.mItemClickListener
            r10.onFocusPosition(r0, r11)
            goto La1
        L82:
            android.view.View r11 = r10.itemView
            r0 = 2131231067(0x7f08015b, float:1.8078205E38)
            r11.setBackgroundResource(r0)
            android.widget.TextView r11 = r10.txt_name
            android.content.Context r0 = r9.context
            r1 = 2131100407(0x7f0602f7, float:1.7813195E38)
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r11)
            android.view.View r11 = r10.itemView
            r0 = 1064514355(0x3f733333, float:0.95)
            r11.setScaleX(r0)
            android.view.View r10 = r10.itemView
            r10.setScaleY(r0)
        La1:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r1, int r2) {
            r0 = this;
            com.flextv.livestore.adapter.MovieCreditRecyclerAdapter$VodViewHolder r1 = r0.onCreateViewHolder(r1, r2)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    public com.flextv.livestore.adapter.MovieCreditRecyclerAdapter.VodViewHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r3, int r4) {
            r2 = this;
            com.flextv.livestore.adapter.MovieCreditRecyclerAdapter$VodViewHolder r4 = new com.flextv.livestore.adapter.MovieCreditRecyclerAdapter$VodViewHolder
            r0 = 2131624068(0x7f0e0084, float:1.8875305E38)
            r1 = 0
            android.view.View r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r0, r3, r1)
            r4.<init>(r2, r3)
            return r4
    }

    public void setItemClickListener(com.flextv.livestore.adapter.MovieCreditRecyclerAdapter.ItemClickListener r1) {
            r0 = this;
            r0.mItemClickListener = r1
            return
    }

    public void setMovieCreditModels(java.util.List<com.flextv.livestore.models.MovieCreditModel> r1) {
            r0 = this;
            r0.models = r1
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
