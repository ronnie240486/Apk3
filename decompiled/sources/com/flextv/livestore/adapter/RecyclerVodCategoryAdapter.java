package com.flextv.livestore.adapter;

/* JADX INFO: loaded from: classes2.dex */
public class RecyclerVodCategoryAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.flextv.livestore.adapter.RecyclerVodCategoryAdapter.LiveHomeViewHolder> {
    public java.util.List<com.flextv.livestore.models.CategoryModel> categoryModels;
    public kotlin.jvm.functions.Function3<com.flextv.livestore.models.CategoryModel, java.lang.Integer, java.lang.Boolean, kotlin.Unit> clickFunctionListener;
    public android.content.Context context;
    public boolean is_grid;
    public boolean is_m3u;
    public boolean is_movie;
    public int selected_position;

    /* JADX INFO: loaded from: classes3.dex */
    public static class LiveHomeViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        public android.widget.TextView txt_count;
        public android.widget.TextView txt_name;

        public LiveHomeViewHolder(@androidx.annotation.NonNull android.view.View r2) {
                r1 = this;
                r1.<init>(r2)
                r0 = 2131428324(0x7f0b03e4, float:1.847829E38)
                android.view.View r0 = r2.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r1.txt_name = r0
                r0 = 2131428295(0x7f0b03c7, float:1.847823E38)
                android.view.View r2 = r2.findViewById(r0)
                android.widget.TextView r2 = (android.widget.TextView) r2
                r1.txt_count = r2
                return
        }
    }

    public static /* synthetic */ void $r8$lambda$_WTImd2dUHzQUMIV6osjy6zOcTU(com.flextv.livestore.adapter.RecyclerVodCategoryAdapter r0, com.flextv.livestore.models.CategoryModel r1, int r2, com.flextv.livestore.adapter.RecyclerVodCategoryAdapter.LiveHomeViewHolder r3, android.view.View r4, boolean r5) {
            r0.lambda$onBindViewHolder$0(r1, r2, r3, r4, r5)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$sLqSJJMu6rBS78w_cj--HiuT4o0, reason: not valid java name */
    public static /* synthetic */ void m99$r8$lambda$sLqSJJMu6rBS78w_cjHiuT4o0(com.flextv.livestore.adapter.RecyclerVodCategoryAdapter r0, int r1, com.flextv.livestore.models.CategoryModel r2, android.view.View r3) {
            r0.lambda$onBindViewHolder$1(r1, r2, r3)
            return
    }

    public RecyclerVodCategoryAdapter(android.content.Context r1, java.util.List<com.flextv.livestore.models.CategoryModel> r2, int r3, boolean r4, boolean r5, boolean r6, kotlin.jvm.functions.Function3<com.flextv.livestore.models.CategoryModel, java.lang.Integer, java.lang.Boolean, kotlin.Unit> r7) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            r0.categoryModels = r2
            r0.clickFunctionListener = r7
            r0.selected_position = r3
            r0.is_grid = r4
            r0.is_movie = r6
            r0.is_m3u = r5
            return
    }

    private /* synthetic */ void lambda$onBindViewHolder$0(com.flextv.livestore.models.CategoryModel r1, int r2, com.flextv.livestore.adapter.RecyclerVodCategoryAdapter.LiveHomeViewHolder r3, android.view.View r4, boolean r5) {
            r0 = this;
            if (r5 == 0) goto L23
            kotlin.jvm.functions.Function3<com.flextv.livestore.models.CategoryModel, java.lang.Integer, java.lang.Boolean, kotlin.Unit> r4 = r0.clickFunctionListener
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r4.invoke(r1, r2, r5)
            boolean r1 = r0.is_grid
            if (r1 == 0) goto L1a
            android.view.View r1 = r3.itemView
            r2 = 2131231063(0x7f080157, float:1.8078196E38)
            r1.setBackgroundResource(r2)
            goto L38
        L1a:
            android.view.View r1 = r3.itemView
            r2 = 2131231123(0x7f080193, float:1.8078318E38)
            r1.setBackgroundResource(r2)
            goto L38
        L23:
            boolean r1 = r0.is_grid
            if (r1 == 0) goto L30
            android.view.View r1 = r3.itemView
            r2 = 2131231062(0x7f080156, float:1.8078194E38)
            r1.setBackgroundResource(r2)
            goto L38
        L30:
            android.view.View r1 = r3.itemView
            r2 = 2131099781(0x7f060085, float:1.7811925E38)
            r1.setBackgroundResource(r2)
        L38:
            return
    }

    private /* synthetic */ void lambda$onBindViewHolder$1(int r2, com.flextv.livestore.models.CategoryModel r3, android.view.View r4) {
            r1 = this;
            int r4 = r1.selected_position
            r1.selected_position = r2
            r1.notifyItemChanged(r4)
            int r4 = r1.selected_position
            r1.notifyItemChanged(r4)
            kotlin.jvm.functions.Function3<com.flextv.livestore.models.CategoryModel, java.lang.Integer, java.lang.Boolean, kotlin.Unit> r4 = r1.clickFunctionListener
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r4.invoke(r3, r2, r0)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
            r1 = this;
            java.util.List<com.flextv.livestore.models.CategoryModel> r0 = r1.categoryModels
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.size()
        La:
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r1, @android.annotation.SuppressLint({"RecyclerView"}) int r2) {
            r0 = this;
            com.flextv.livestore.adapter.RecyclerVodCategoryAdapter$LiveHomeViewHolder r1 = (com.flextv.livestore.adapter.RecyclerVodCategoryAdapter.LiveHomeViewHolder) r1
            r0.onBindViewHolder(r1, r2)
            return
    }

    public void onBindViewHolder(@androidx.annotation.NonNull com.flextv.livestore.adapter.RecyclerVodCategoryAdapter.LiveHomeViewHolder r10, @android.annotation.SuppressLint({"RecyclerView"}) int r11) {
            r9 = this;
            java.util.List<com.flextv.livestore.models.CategoryModel> r0 = r9.categoryModels
            java.lang.Object r0 = r0.get(r11)
            com.flextv.livestore.models.CategoryModel r0 = (com.flextv.livestore.models.CategoryModel) r0
            android.widget.TextView r1 = r10.txt_name
            java.lang.String r2 = r0.getName()
            r1.setText(r2)
            boolean r1 = r9.is_movie
            r2 = 0
            java.lang.String r3 = ""
            if (r1 == 0) goto L56
            com.flextv.livestore.helper.RealmController r1 = com.flextv.livestore.helper.RealmController.with()
            boolean r4 = r9.is_m3u
            io.realm.RealmResults r1 = r1.getMovieModelsByCategory(r0, r3, r4, r2)
            boolean r2 = r9.is_grid
            if (r2 == 0) goto L41
            android.widget.TextView r2 = r10.txt_count
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r1 = r1.size()
            r3.append(r1)
            java.lang.String r1 = " movies"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.setText(r1)
            goto L93
        L41:
            android.widget.TextView r2 = r10.txt_count
            java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
            int r1 = r1.size()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.setText(r1)
            goto L93
        L56:
            com.flextv.livestore.helper.RealmController r1 = com.flextv.livestore.helper.RealmController.with()
            boolean r4 = r9.is_m3u
            io.realm.RealmResults r1 = r1.getSeriesModelsByCategory(r0, r3, r4, r2)
            boolean r2 = r9.is_grid
            if (r2 == 0) goto L7f
            android.widget.TextView r2 = r10.txt_count
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r1 = r1.size()
            r3.append(r1)
            java.lang.String r1 = " series"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.setText(r1)
            goto L93
        L7f:
            android.widget.TextView r2 = r10.txt_count
            java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
            int r1 = r1.size()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.setText(r1)
        L93:
            android.view.View r7 = r10.itemView
            com.flextv.livestore.adapter.CastRecyclerAdapter$$ExternalSyntheticLambda0 r8 = new com.flextv.livestore.adapter.CastRecyclerAdapter$$ExternalSyntheticLambda0
            r6 = 9
            r1 = r8
            r2 = r9
            r3 = r0
            r4 = r11
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            r7.setOnFocusChangeListener(r8)
            android.view.View r1 = r10.itemView
            com.flextv.livestore.adapter.VodRecyclerAdapter$$ExternalSyntheticLambda0 r2 = new com.flextv.livestore.adapter.VodRecyclerAdapter$$ExternalSyntheticLambda0
            r3 = 15
            r2.<init>(r9, r11, r0, r3)
            r1.setOnClickListener(r2)
            int r0 = r9.selected_position
            if (r0 != r11) goto Lc6
            android.widget.TextView r11 = r10.txt_name
            android.content.Context r0 = r9.context
            r1 = 2131100408(0x7f0602f8, float:1.7813197E38)
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r11)
            android.widget.TextView r10 = r10.txt_count
            android.content.Context r11 = r9.context
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r11, r1, r10)
            goto Ld7
        Lc6:
            android.widget.TextView r11 = r10.txt_name
            android.content.Context r0 = r9.context
            r1 = 2131100407(0x7f0602f7, float:1.7813195E38)
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r11)
            android.widget.TextView r10 = r10.txt_count
            android.content.Context r11 = r9.context
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r11, r1, r10)
        Ld7:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r1, int r2) {
            r0 = this;
            com.flextv.livestore.adapter.RecyclerVodCategoryAdapter$LiveHomeViewHolder r1 = r0.onCreateViewHolder(r1, r2)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    public com.flextv.livestore.adapter.RecyclerVodCategoryAdapter.LiveHomeViewHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r3, int r4) {
            r2 = this;
            boolean r4 = r2.is_grid
            r0 = 0
            if (r4 == 0) goto L12
            com.flextv.livestore.adapter.RecyclerVodCategoryAdapter$LiveHomeViewHolder r4 = new com.flextv.livestore.adapter.RecyclerVodCategoryAdapter$LiveHomeViewHolder
            r1 = 2131624059(0x7f0e007b, float:1.8875287E38)
            android.view.View r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r1, r3, r0)
            r4.<init>(r3)
            return r4
        L12:
            com.flextv.livestore.adapter.RecyclerVodCategoryAdapter$LiveHomeViewHolder r4 = new com.flextv.livestore.adapter.RecyclerVodCategoryAdapter$LiveHomeViewHolder
            r1 = 2131624058(0x7f0e007a, float:1.8875285E38)
            android.view.View r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r1, r3, r0)
            r4.<init>(r3)
            return r4
    }
}
