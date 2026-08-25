package com.flextv.livestore.adapter;

/* JADX INFO: loaded from: classes3.dex */
public class RecyclerLiveCategoryAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.flextv.livestore.adapter.RecyclerLiveCategoryAdapter.LiveHomeViewHolder> {
    public java.util.List<com.flextv.livestore.models.CategoryModel> categoryModels;
    public kotlin.jvm.functions.Function3<com.flextv.livestore.models.CategoryModel, java.lang.Integer, java.lang.Boolean, kotlin.Unit> clickFunctionListener;
    public android.content.Context context;
    public io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> epgChannels;
    public boolean is_first;
    public boolean is_grid;
    public boolean is_m3u;
    public com.flextv.livestore.helper.PreferenceHelper preferenceHelper;
    public int selected_position;

    /* JADX INFO: loaded from: classes2.dex */
    public class LiveHomeViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        public android.widget.TextView txt_count;
        public android.widget.TextView txt_name;

        public LiveHomeViewHolder(@androidx.annotation.NonNull com.flextv.livestore.adapter.RecyclerLiveCategoryAdapter r1, android.view.View r2) {
                r0 = this;
                r0.<init>(r2)
                r1 = 2131428324(0x7f0b03e4, float:1.847829E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r0.txt_name = r1
                r1 = 2131428295(0x7f0b03c7, float:1.847823E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r0.txt_count = r1
                return
        }
    }

    public static /* synthetic */ void $r8$lambda$levUosoITEWs1UHOPmxJWz6_14o(com.flextv.livestore.adapter.RecyclerLiveCategoryAdapter r0, com.flextv.livestore.adapter.RecyclerLiveCategoryAdapter.LiveHomeViewHolder r1, com.flextv.livestore.models.CategoryModel r2, int r3, android.view.View r4, boolean r5) {
            r0.lambda$onBindViewHolder$0(r1, r2, r3, r4, r5)
            return
    }

    public static /* synthetic */ void $r8$lambda$o_4syw1BJtE266mdeOAi6mUy2cI(com.flextv.livestore.adapter.RecyclerLiveCategoryAdapter r0, int r1, com.flextv.livestore.models.CategoryModel r2, android.view.View r3) {
            r0.lambda$onBindViewHolder$1(r1, r2, r3)
            return
    }

    public RecyclerLiveCategoryAdapter(android.content.Context r2, java.util.List<com.flextv.livestore.models.CategoryModel> r3, boolean r4, boolean r5, int r6, kotlin.jvm.functions.Function3<com.flextv.livestore.models.CategoryModel, java.lang.Integer, java.lang.Boolean, kotlin.Unit> r7) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.is_first = r0
            r1.context = r2
            r1.categoryModels = r3
            r1.clickFunctionListener = r7
            r1.is_m3u = r4
            r1.selected_position = r6
            r1.is_grid = r5
            com.flextv.livestore.helper.PreferenceHelper r3 = new com.flextv.livestore.helper.PreferenceHelper
            r3.<init>(r2)
            r1.preferenceHelper = r3
            return
    }

    private /* synthetic */ void lambda$onBindViewHolder$0(com.flextv.livestore.adapter.RecyclerLiveCategoryAdapter.LiveHomeViewHolder r2, com.flextv.livestore.models.CategoryModel r3, int r4, android.view.View r5, boolean r6) {
            r1 = this;
            r5 = 0
            if (r6 == 0) goto L41
            boolean r6 = r1.is_grid
            r0 = 1
            if (r6 == 0) goto L21
            android.widget.TextView r5 = r2.txt_name
            r5.setSelected(r0)
            kotlin.jvm.functions.Function3<com.flextv.livestore.models.CategoryModel, java.lang.Integer, java.lang.Boolean, kotlin.Unit> r5 = r1.clickFunctionListener
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.invoke(r3, r4, r6)
            android.view.View r2 = r2.itemView
            r3 = 2131231063(0x7f080157, float:1.8078196E38)
            r2.setBackgroundResource(r3)
            goto L5b
        L21:
            boolean r6 = r1.is_first
            if (r6 == 0) goto L28
            r1.is_first = r5
            goto L5b
        L28:
            android.widget.TextView r5 = r2.txt_name
            r5.setSelected(r0)
            kotlin.jvm.functions.Function3<com.flextv.livestore.models.CategoryModel, java.lang.Integer, java.lang.Boolean, kotlin.Unit> r5 = r1.clickFunctionListener
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.invoke(r3, r4, r6)
            android.view.View r2 = r2.itemView
            r3 = 2131231123(0x7f080193, float:1.8078318E38)
            r2.setBackgroundResource(r3)
            goto L5b
        L41:
            boolean r3 = r1.is_grid
            if (r3 == 0) goto L4e
            android.view.View r3 = r2.itemView
            r4 = 2131231062(0x7f080156, float:1.8078194E38)
            r3.setBackgroundResource(r4)
            goto L56
        L4e:
            android.view.View r3 = r2.itemView
            r4 = 2131099781(0x7f060085, float:1.7811925E38)
            r3.setBackgroundResource(r4)
        L56:
            android.widget.TextView r2 = r2.txt_name
            r2.setSelected(r5)
        L5b:
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
            com.flextv.livestore.adapter.RecyclerLiveCategoryAdapter$LiveHomeViewHolder r1 = (com.flextv.livestore.adapter.RecyclerLiveCategoryAdapter.LiveHomeViewHolder) r1
            r0.onBindViewHolder(r1, r2)
            return
    }

    public void onBindViewHolder(@androidx.annotation.NonNull com.flextv.livestore.adapter.RecyclerLiveCategoryAdapter.LiveHomeViewHolder r10, @android.annotation.SuppressLint({"RecyclerView"}) int r11) {
            r9 = this;
            java.util.List<com.flextv.livestore.models.CategoryModel> r0 = r9.categoryModels
            java.lang.Object r0 = r0.get(r11)
            com.flextv.livestore.models.CategoryModel r0 = (com.flextv.livestore.models.CategoryModel) r0
            android.widget.TextView r1 = r10.txt_name
            java.lang.String r2 = r0.getName()
            r1.setText(r2)
            r1 = 0
            java.lang.String r2 = ""
            r3 = 4
            if (r11 <= r3) goto L50
            com.flextv.livestore.helper.PreferenceHelper r3 = r9.preferenceHelper
            java.util.List r3 = r3.getSharedPreferenceMyGroupCategory()
            int r3 = r3.size()
            int r3 = r3 + 5
            if (r11 >= r3) goto L50
            com.flextv.livestore.helper.PreferenceHelper r3 = r9.preferenceHelper
            java.util.List r3 = r3.getSharedPreferenceMyGroupCategory()
            int r3 = r3.size()
            if (r3 <= 0) goto L5c
            com.flextv.livestore.helper.PreferenceHelper r3 = r9.preferenceHelper
            java.util.List r3 = r3.getSharedPreferenceMyGroupCategory()
            int r4 = r11 + (-5)
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            com.flextv.livestore.helper.PreferenceHelper r4 = r9.preferenceHelper
            java.util.List r3 = r4.getSharedPreferenceMyGroupChannels(r3)
            com.flextv.livestore.helper.RealmController r4 = com.flextv.livestore.helper.RealmController.with()
            io.realm.RealmResults r2 = r4.getEpgChannelsByNameArray(r3, r2)
            r9.epgChannels = r2
            goto L5c
        L50:
            com.flextv.livestore.helper.RealmController r3 = com.flextv.livestore.helper.RealmController.with()
            boolean r4 = r9.is_m3u
            io.realm.RealmResults r2 = r3.getLiveChannelsByCategory(r0, r2, r4, r1)
            r9.epgChannels = r2
        L5c:
            boolean r2 = r9.is_grid
            if (r2 == 0) goto L7d
            android.widget.TextView r2 = r10.txt_count
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r4 = r9.epgChannels
            int r4 = r4.size()
            r3.append(r4)
            java.lang.String r4 = " channels"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.setText(r3)
            goto L8c
        L7d:
            android.widget.TextView r2 = r10.txt_count
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r3 = r9.epgChannels
            int r3 = r3.size()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.setText(r3)
        L8c:
            if (r11 != 0) goto L96
            android.widget.TextView r1 = r10.txt_count
            r2 = 8
            r1.setVisibility(r2)
            goto L9b
        L96:
            android.widget.TextView r2 = r10.txt_count
            r2.setVisibility(r1)
        L9b:
            android.view.View r7 = r10.itemView
            com.flextv.livestore.adapter.CastRecyclerAdapter$$ExternalSyntheticLambda0 r8 = new com.flextv.livestore.adapter.CastRecyclerAdapter$$ExternalSyntheticLambda0
            r6 = 5
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r0
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r7.setOnFocusChangeListener(r8)
            android.view.View r1 = r10.itemView
            com.flextv.livestore.adapter.VodRecyclerAdapter$$ExternalSyntheticLambda0 r2 = new com.flextv.livestore.adapter.VodRecyclerAdapter$$ExternalSyntheticLambda0
            r3 = 11
            r2.<init>(r9, r11, r0, r3)
            r1.setOnClickListener(r2)
            int r0 = r9.selected_position
            if (r0 != r11) goto Lcf
            if (r11 == 0) goto Lcf
            android.widget.TextView r11 = r10.txt_name
            android.content.Context r0 = r9.context
            r1 = 2131100408(0x7f0602f8, float:1.7813197E38)
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r11)
            android.widget.TextView r10 = r10.txt_count
            android.content.Context r11 = r9.context
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r11, r1, r10)
            goto Le0
        Lcf:
            android.widget.TextView r11 = r10.txt_name
            android.content.Context r0 = r9.context
            r1 = 2131100407(0x7f0602f7, float:1.7813195E38)
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r11)
            android.widget.TextView r10 = r10.txt_count
            android.content.Context r11 = r9.context
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r11, r1, r10)
        Le0:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r1, int r2) {
            r0 = this;
            com.flextv.livestore.adapter.RecyclerLiveCategoryAdapter$LiveHomeViewHolder r1 = r0.onCreateViewHolder(r1, r2)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    public com.flextv.livestore.adapter.RecyclerLiveCategoryAdapter.LiveHomeViewHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r3, int r4) {
            r2 = this;
            boolean r4 = r2.is_grid
            r0 = 0
            if (r4 == 0) goto L12
            com.flextv.livestore.adapter.RecyclerLiveCategoryAdapter$LiveHomeViewHolder r4 = new com.flextv.livestore.adapter.RecyclerLiveCategoryAdapter$LiveHomeViewHolder
            r1 = 2131624059(0x7f0e007b, float:1.8875287E38)
            android.view.View r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r1, r3, r0)
            r4.<init>(r2, r3)
            return r4
        L12:
            com.flextv.livestore.adapter.RecyclerLiveCategoryAdapter$LiveHomeViewHolder r4 = new com.flextv.livestore.adapter.RecyclerLiveCategoryAdapter$LiveHomeViewHolder
            r1 = 2131624058(0x7f0e007a, float:1.8875285E38)
            android.view.View r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r1, r3, r0)
            r4.<init>(r2, r3)
            return r4
    }

    public void setCategoryModels(java.util.List<com.flextv.livestore.models.CategoryModel> r1) {
            r0 = this;
            r0.categoryModels = r1
            r0.notifyDataSetChanged()
            return
    }

    public void setCategoryPosition(int r2) {
            r1 = this;
            int r0 = r1.selected_position
            r1.selected_position = r2
            r1.notifyItemChanged(r0)
            int r2 = r1.selected_position
            r1.notifyItemChanged(r2)
            return
    }
}
