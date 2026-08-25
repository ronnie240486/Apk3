package com.flextv.livestore.adapter;

/* JADX INFO: loaded from: classes.dex */
public class VodRecyclerAdapter extends com.flextv.livestore.adapter.RealmRecyclerViewAdapter<com.flextv.livestore.models.MovieModel, com.flextv.livestore.adapter.VodRecyclerAdapter.VodViewHolder> {
    public android.content.Context context;
    public boolean is_grid;
    public com.flextv.livestore.adapter.VodRecyclerAdapter.ItemClickListener mItemClickListener;
    public int selected_pos;

    public interface ItemClickListener {
        void onFavClick(com.flextv.livestore.models.MovieModel r1, int r2);

        void onFocusPosition(int r1);

        void onItemClick(com.flextv.livestore.models.MovieModel r1, int r2);

        void onUnFavClick(com.flextv.livestore.models.MovieModel r1, int r2);
    }

    public class VodViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        public android.widget.ImageView image_fav;
        public com.makeramen.roundedimageview.RoundedImageView image_logo;
        public com.makeramen.roundedimageview.RoundedImageView image_vod;
        public android.widget.ProgressBar seekBar;
        public android.widget.TextView txt_name;

        public VodViewHolder(@androidx.annotation.NonNull com.flextv.livestore.adapter.VodRecyclerAdapter r1, android.view.View r2) {
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
                r0.image_fav = r1
                r1 = 2131428135(0x7f0b0327, float:1.8477906E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
                r0.seekBar = r1
                return
        }
    }

    public static /* synthetic */ void $r8$lambda$2JqtSdbiLzWwxVSoMWdtRv1A3m0(com.flextv.livestore.adapter.VodRecyclerAdapter r0, int r1, com.flextv.livestore.models.MovieModel r2, android.view.View r3) {
            r0.lambda$onBindViewHolder$0(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$ExjkC-Z2-L6mFLakVJxazmgDyIY, reason: not valid java name */
    public static /* synthetic */ boolean m102$r8$lambda$ExjkCZ2L6mFLakVJxazmgDyIY(com.flextv.livestore.adapter.VodRecyclerAdapter r0, com.flextv.livestore.models.MovieModel r1, int r2, android.view.View r3) {
            boolean r0 = r0.lambda$onBindViewHolder$2(r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$QPzrODgqUGqNrW0sfVjdnp-BDxo, reason: not valid java name */
    public static /* synthetic */ void m103$r8$lambda$QPzrODgqUGqNrW0sfVjdnpBDxo(com.flextv.livestore.adapter.VodRecyclerAdapter r0, com.flextv.livestore.adapter.VodRecyclerAdapter.VodViewHolder r1, int r2, android.view.View r3, boolean r4) {
            r0.lambda$onBindViewHolder$1(r1, r2, r3, r4)
            return
    }

    public VodRecyclerAdapter(android.content.Context r2, @androidx.annotation.Nullable io.realm.RealmResults<com.flextv.livestore.models.MovieModel> r3, boolean r4) {
            r1 = this;
            r0 = 1
            r1.<init>(r3, r0, r0)
            r3 = -1
            r1.selected_pos = r3
            r1.context = r2
            r1.is_grid = r4
            return
    }

    private /* synthetic */ void lambda$onBindViewHolder$0(int r1, com.flextv.livestore.models.MovieModel r2, android.view.View r3) {
            r0 = this;
            int r3 = r0.selected_pos
            r0.selected_pos = r1
            r0.notifyItemChanged(r3)
            int r3 = r0.selected_pos
            r0.notifyItemChanged(r3)
            com.flextv.livestore.adapter.VodRecyclerAdapter$ItemClickListener r3 = r0.mItemClickListener
            r3.onItemClick(r2, r1)
            return
    }

    private /* synthetic */ void lambda$onBindViewHolder$1(com.flextv.livestore.adapter.VodRecyclerAdapter.VodViewHolder r2, int r3, android.view.View r4, boolean r5) {
            r1 = this;
            if (r5 == 0) goto L2c
            android.view.View r4 = r2.itemView
            r5 = 2131231069(0x7f08015d, float:1.8078209E38)
            r4.setBackgroundResource(r5)
            android.widget.TextView r4 = r2.txt_name
            r5 = 1
            r4.setSelected(r5)
            android.widget.TextView r4 = r2.txt_name
            android.content.Context r5 = r1.context
            r0 = 2131099682(0x7f060022, float:1.7811724E38)
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5, r0, r4)
            android.view.View r4 = r2.itemView
            r5 = 1065353216(0x3f800000, float:1.0)
            r4.setScaleX(r5)
            android.view.View r2 = r2.itemView
            r2.setScaleY(r5)
            com.flextv.livestore.adapter.VodRecyclerAdapter$ItemClickListener r2 = r1.mItemClickListener
            r2.onFocusPosition(r3)
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

    private /* synthetic */ boolean lambda$onBindViewHolder$2(com.flextv.livestore.models.MovieModel r1, int r2, android.view.View r3) {
            r0 = this;
            boolean r3 = r1.isIs_favorite()
            if (r3 == 0) goto Lc
            com.flextv.livestore.adapter.VodRecyclerAdapter$ItemClickListener r3 = r0.mItemClickListener
            r3.onUnFavClick(r1, r2)
            goto L11
        Lc:
            com.flextv.livestore.adapter.VodRecyclerAdapter$ItemClickListener r3 = r0.mItemClickListener
            r3.onFavClick(r1, r2)
        L11:
            r1 = 1
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    public /* bridge */ /* synthetic */ void onBindViewHolder(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r1, int r2) {
            r0 = this;
            com.flextv.livestore.adapter.VodRecyclerAdapter$VodViewHolder r1 = (com.flextv.livestore.adapter.VodRecyclerAdapter.VodViewHolder) r1
            r0.onBindViewHolder(r1, r2)
            return
    }

    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    public void onBindViewHolder(@androidx.annotation.NonNull com.flextv.livestore.adapter.VodRecyclerAdapter.VodViewHolder r8, int r9) {
            r7 = this;
            io.realm.RealmModel r0 = r7.getItem(r9)
            com.flextv.livestore.models.MovieModel r0 = (com.flextv.livestore.models.MovieModel) r0
            android.widget.TextView r1 = r8.txt_name
            java.lang.String r2 = r0.getName()
            r1.setText(r2)
            boolean r1 = r0.isIs_favorite()
            r2 = 8
            r3 = 0
            if (r1 == 0) goto L1e
            android.widget.ImageView r1 = r8.image_fav
            r1.setVisibility(r3)
            goto L23
        L1e:
            android.widget.ImageView r1 = r8.image_fav
            r1.setVisibility(r2)
        L23:
            int r1 = r0.getPro()
            if (r1 != 0) goto L2f
            android.widget.ProgressBar r1 = r8.seekBar
            r1.setVisibility(r2)
            goto L3d
        L2f:
            android.widget.ProgressBar r1 = r8.seekBar
            int r2 = r0.getPro()
            r1.setProgress(r2)
            android.widget.ProgressBar r1 = r8.seekBar
            r1.setVisibility(r3)
        L3d:
            android.content.Context r1 = r7.context
            com.makeramen.roundedimageview.RoundedImageView r2 = r8.image_vod
            java.lang.String r4 = r0.getStream_icon()
            r5 = 2131230889(0x7f0800a9, float:1.8077844E38)
            com.makeramen.roundedimageview.RoundedImageView r6 = r8.image_logo
            com.flextv.livestore.utils.ImageLoaderJava.imageLoadUrlWithVodHolder(r1, r2, r4, r5, r6)
            android.view.View r1 = r8.itemView
            com.flextv.livestore.adapter.VodRecyclerAdapter$$ExternalSyntheticLambda0 r2 = new com.flextv.livestore.adapter.VodRecyclerAdapter$$ExternalSyntheticLambda0
            r2.<init>(r7, r9, r0, r3)
            r1.setOnClickListener(r2)
            android.view.View r1 = r8.itemView
            com.flextv.livestore.adapter.VodRecyclerAdapter$$ExternalSyntheticLambda1 r2 = new com.flextv.livestore.adapter.VodRecyclerAdapter$$ExternalSyntheticLambda1
            r2.<init>(r7, r8, r9, r3)
            r1.setOnFocusChangeListener(r2)
            android.view.View r1 = r8.itemView
            com.flextv.livestore.adapter.VodRecyclerAdapter$$ExternalSyntheticLambda2 r2 = new com.flextv.livestore.adapter.VodRecyclerAdapter$$ExternalSyntheticLambda2
            r2.<init>(r7, r0, r9, r3)
            r1.setOnLongClickListener(r2)
            int r0 = r7.selected_pos
            if (r0 != r9) goto L99
            android.view.View r0 = r8.itemView
            r1 = 2131231069(0x7f08015d, float:1.8078209E38)
            r0.setBackgroundResource(r1)
            android.widget.TextView r0 = r8.txt_name
            android.content.Context r1 = r7.context
            r2 = 2131099682(0x7f060022, float:1.7811724E38)
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2, r0)
            android.widget.TextView r0 = r8.txt_name
            r1 = 1
            r0.setSelected(r1)
            android.view.View r0 = r8.itemView
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setScaleX(r1)
            android.view.View r8 = r8.itemView
            r8.setScaleY(r1)
            com.flextv.livestore.adapter.VodRecyclerAdapter$ItemClickListener r8 = r7.mItemClickListener
            r8.onFocusPosition(r9)
            goto Lb8
        L99:
            android.view.View r9 = r8.itemView
            r0 = 2131231067(0x7f08015b, float:1.8078205E38)
            r9.setBackgroundResource(r0)
            android.widget.TextView r9 = r8.txt_name
            android.content.Context r0 = r7.context
            r1 = 2131100407(0x7f0602f7, float:1.7813195E38)
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r9)
            android.view.View r9 = r8.itemView
            r0 = 1064514355(0x3f733333, float:0.95)
            r9.setScaleX(r0)
            android.view.View r8 = r8.itemView
            r8.setScaleY(r0)
        Lb8:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r1, int r2) {
            r0 = this;
            com.flextv.livestore.adapter.VodRecyclerAdapter$VodViewHolder r1 = r0.onCreateViewHolder(r1, r2)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    public com.flextv.livestore.adapter.VodRecyclerAdapter.VodViewHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r3, int r4) {
            r2 = this;
            boolean r4 = r2.is_grid
            r0 = 0
            if (r4 == 0) goto L12
            com.flextv.livestore.adapter.VodRecyclerAdapter$VodViewHolder r4 = new com.flextv.livestore.adapter.VodRecyclerAdapter$VodViewHolder
            r1 = 2131624069(0x7f0e0085, float:1.8875307E38)
            android.view.View r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r1, r3, r0)
            r4.<init>(r2, r3)
            return r4
        L12:
            com.flextv.livestore.adapter.VodRecyclerAdapter$VodViewHolder r4 = new com.flextv.livestore.adapter.VodRecyclerAdapter$VodViewHolder
            r1 = 2131624067(0x7f0e0083, float:1.8875303E38)
            android.view.View r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r1, r3, r0)
            r4.<init>(r2, r3)
            return r4
    }

    public void setItemClickListener(com.flextv.livestore.adapter.VodRecyclerAdapter.ItemClickListener r1) {
            r0 = this;
            r0.mItemClickListener = r1
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
