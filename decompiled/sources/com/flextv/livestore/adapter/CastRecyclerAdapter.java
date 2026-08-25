package com.flextv.livestore.adapter;

/* JADX INFO: loaded from: classes2.dex */
public class CastRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.flextv.livestore.adapter.CastRecyclerAdapter.VodStalkerHolder> {
    public kotlin.jvm.functions.Function3<com.flextv.livestore.models.CastModel, java.lang.Integer, java.lang.Boolean, kotlin.Unit> clickListenerFunction;
    public android.content.Context context;
    private java.util.List<com.flextv.livestore.models.CastModel> datas;

    /* JADX INFO: loaded from: classes.dex */
    public class VodStalkerHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        public com.makeramen.roundedimageview.RoundedImageView image_vod;
        public android.widget.TextView txt_name;

        public VodStalkerHolder(@androidx.annotation.NonNull com.flextv.livestore.adapter.CastRecyclerAdapter r1, android.view.View r2) {
                r0 = this;
                r0.<init>(r2)
                r1 = 2131428324(0x7f0b03e4, float:1.847829E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r0.txt_name = r1
                r1 = 2131427824(0x7f0b01f0, float:1.8477275E38)
                android.view.View r1 = r2.findViewById(r1)
                com.makeramen.roundedimageview.RoundedImageView r1 = (com.makeramen.roundedimageview.RoundedImageView) r1
                r0.image_vod = r1
                return
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$AKu8CPbcZC5kDuH-WZC2mV_hdU8, reason: not valid java name */
    public static /* synthetic */ void m91$r8$lambda$AKu8CPbcZC5kDuHWZC2mV_hdU8(com.flextv.livestore.adapter.CastRecyclerAdapter r0, com.flextv.livestore.models.CastModel r1, int r2, com.flextv.livestore.adapter.CastRecyclerAdapter.VodStalkerHolder r3, android.view.View r4, boolean r5) {
            r0.lambda$onBindViewHolder$0(r1, r2, r3, r4, r5)
            return
    }

    public static /* synthetic */ void $r8$lambda$xnY1Xzdp1OZD35rLTVkjMbxvz54(com.flextv.livestore.adapter.CastRecyclerAdapter r0, com.flextv.livestore.models.CastModel r1, int r2, android.view.View r3) {
            r0.lambda$onBindViewHolder$1(r1, r2, r3)
            return
    }

    public CastRecyclerAdapter(android.content.Context r1, java.util.List<com.flextv.livestore.models.CastModel> r2, kotlin.jvm.functions.Function3<com.flextv.livestore.models.CastModel, java.lang.Integer, java.lang.Boolean, kotlin.Unit> r3) {
            r0 = this;
            r0.<init>()
            r0.datas = r2
            r0.context = r1
            r0.clickListenerFunction = r3
            return
    }

    private /* synthetic */ void lambda$onBindViewHolder$0(com.flextv.livestore.models.CastModel r1, int r2, com.flextv.livestore.adapter.CastRecyclerAdapter.VodStalkerHolder r3, android.view.View r4, boolean r5) {
            r0 = this;
            if (r5 == 0) goto L22
            kotlin.jvm.functions.Function3<com.flextv.livestore.models.CastModel, java.lang.Integer, java.lang.Boolean, kotlin.Unit> r4 = r0.clickListenerFunction
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r4.invoke(r1, r2, r5)
            android.view.View r1 = r3.itemView
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.setScaleX(r2)
            android.view.View r1 = r3.itemView
            r1.setScaleY(r2)
            android.view.View r1 = r3.itemView
            r2 = 2131231198(0x7f0801de, float:1.807847E38)
            r1.setBackgroundResource(r2)
            goto L37
        L22:
            android.view.View r1 = r3.itemView
            r2 = 1064514355(0x3f733333, float:0.95)
            r1.setScaleX(r2)
            android.view.View r1 = r3.itemView
            r1.setScaleY(r2)
            android.view.View r1 = r3.itemView
            r2 = 2131100405(0x7f0602f5, float:1.781319E38)
            r1.setBackgroundResource(r2)
        L37:
            return
    }

    private /* synthetic */ void lambda$onBindViewHolder$1(com.flextv.livestore.models.CastModel r2, int r3, android.view.View r4) {
            r1 = this;
            kotlin.jvm.functions.Function3<com.flextv.livestore.models.CastModel, java.lang.Integer, java.lang.Boolean, kotlin.Unit> r4 = r1.clickListenerFunction
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r4.invoke(r2, r3, r0)
            return
    }

    public java.util.List<com.flextv.livestore.models.CastModel> getData() {
            r1 = this;
            java.util.List<com.flextv.livestore.models.CastModel> r0 = r1.datas
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
            r1 = this;
            java.util.List<com.flextv.livestore.models.CastModel> r0 = r1.datas
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.size()
        La:
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int r3) {
            r2 = this;
            long r0 = (long) r3
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(@androidx.annotation.NonNull @org.jetbrains.annotations.NotNull androidx.recyclerview.widget.RecyclerView.ViewHolder r1, int r2) {
            r0 = this;
            com.flextv.livestore.adapter.CastRecyclerAdapter$VodStalkerHolder r1 = (com.flextv.livestore.adapter.CastRecyclerAdapter.VodStalkerHolder) r1
            r0.onBindViewHolder(r1, r2)
            return
    }

    public void onBindViewHolder(@androidx.annotation.NonNull @org.jetbrains.annotations.NotNull com.flextv.livestore.adapter.CastRecyclerAdapter.VodStalkerHolder r10, int r11) {
            r9 = this;
            java.util.List<com.flextv.livestore.models.CastModel> r0 = r9.datas
            java.lang.Object r0 = r0.get(r11)
            com.flextv.livestore.models.CastModel r0 = (com.flextv.livestore.models.CastModel) r0
            java.lang.String r1 = r0.getProfile_path()
            r2 = 2131230859(0x7f08008b, float:1.8077783E38)
            if (r1 == 0) goto L4e
            java.lang.String r1 = r0.getProfile_path()
            java.lang.String r3 = ""
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L4e
            android.content.Context r1 = r9.context
            com.bumptech.glide.RequestManager r1 = com.bumptech.glide.Glide.with(r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = com.flextv.livestore.apps.Constants.IMDB_IMAGE_PREF
            r3.append(r4)
            java.lang.String r4 = r0.getProfile_path()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.bumptech.glide.RequestBuilder r1 = r1.load(r3)
            com.bumptech.glide.request.BaseRequestOptions r1 = r1.placeholder(r2)
            com.bumptech.glide.RequestBuilder r1 = (com.bumptech.glide.RequestBuilder) r1
            com.bumptech.glide.request.BaseRequestOptions r1 = r1.error(r2)
            com.bumptech.glide.RequestBuilder r1 = (com.bumptech.glide.RequestBuilder) r1
            com.makeramen.roundedimageview.RoundedImageView r2 = r10.image_vod
            r1.into(r2)
            goto L61
        L4e:
            android.content.Context r1 = r9.context
            com.bumptech.glide.RequestManager r1 = com.bumptech.glide.Glide.with(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.bumptech.glide.RequestBuilder r1 = r1.load(r2)
            com.makeramen.roundedimageview.RoundedImageView r2 = r10.image_vod
            r1.into(r2)
        L61:
            android.widget.TextView r1 = r10.txt_name
            java.lang.String r2 = r0.getName()
            r1.setText(r2)
            android.view.View r7 = r10.itemView
            com.flextv.livestore.adapter.CastRecyclerAdapter$$ExternalSyntheticLambda0 r8 = new com.flextv.livestore.adapter.CastRecyclerAdapter$$ExternalSyntheticLambda0
            r6 = 0
            r1 = r8
            r2 = r9
            r3 = r0
            r4 = r11
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            r7.setOnFocusChangeListener(r8)
            android.view.View r10 = r10.itemView
            com.flextv.livestore.adapter.VodRecyclerAdapter$$ExternalSyntheticLambda0 r1 = new com.flextv.livestore.adapter.VodRecyclerAdapter$$ExternalSyntheticLambda0
            r2 = 3
            r1.<init>(r9, r0, r11, r2)
            r10.setOnClickListener(r1)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@androidx.annotation.NonNull @org.jetbrains.annotations.NotNull android.view.ViewGroup r1, int r2) {
            r0 = this;
            com.flextv.livestore.adapter.CastRecyclerAdapter$VodStalkerHolder r1 = r0.onCreateViewHolder(r1, r2)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    @org.jetbrains.annotations.NotNull
    public com.flextv.livestore.adapter.CastRecyclerAdapter.VodStalkerHolder onCreateViewHolder(@androidx.annotation.NonNull @org.jetbrains.annotations.NotNull android.view.ViewGroup r3, int r4) {
            r2 = this;
            com.flextv.livestore.adapter.CastRecyclerAdapter$VodStalkerHolder r4 = new com.flextv.livestore.adapter.CastRecyclerAdapter$VodStalkerHolder
            r0 = 2131624049(0x7f0e0071, float:1.8875267E38)
            r1 = 0
            android.view.View r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r0, r3, r1)
            r4.<init>(r2, r3)
            return r4
    }

    public void setMovieData(java.util.List<com.flextv.livestore.models.CastModel> r1) {
            r0 = this;
            r0.datas = r1
            r0.notifyDataSetChanged()
            return
    }
}
