package com.flextv.livestore.adapter;

/* JADX INFO: loaded from: classes3.dex */
public class AddCategoryRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.flextv.livestore.adapter.AddCategoryRecyclerAdapter.CategoryHolder> {
    public java.util.List<java.lang.String> categoryModels;
    public kotlin.jvm.functions.Function4<java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, kotlin.Unit> clickListenerFunction;
    public android.content.Context context;
    public int selected_pos;

    /* JADX INFO: loaded from: classes2.dex */
    public class CategoryHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        public android.widget.TextView category_name;

        public CategoryHolder(@javax.annotation.Nullable com.flextv.livestore.adapter.AddCategoryRecyclerAdapter r1, android.view.View r2) {
                r0 = this;
                r0.<init>(r2)
                r1 = 2131428324(0x7f0b03e4, float:1.847829E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r0.category_name = r1
                r1 = 2131428295(0x7f0b03c7, float:1.847823E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                return
        }
    }

    public static /* synthetic */ void $r8$lambda$UnF74r0zmD_B9Koc1fzXJNBaq_8(com.flextv.livestore.adapter.AddCategoryRecyclerAdapter r0, int r1, java.lang.String r2, android.view.View r3) {
            r0.lambda$onBindViewHolder$1(r1, r2, r3)
            return
    }

    public static /* synthetic */ boolean $r8$lambda$ftQzF97QvynlDNe3XsikD9_UzGQ(com.flextv.livestore.adapter.AddCategoryRecyclerAdapter r0, java.lang.String r1, int r2, android.view.View r3) {
            boolean r0 = r0.lambda$onBindViewHolder$2(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$iFX1U9yZkXDccSNvS5FRzqu7Rvk(com.flextv.livestore.adapter.AddCategoryRecyclerAdapter r0, com.flextv.livestore.adapter.AddCategoryRecyclerAdapter.CategoryHolder r1, int r2, android.view.View r3, boolean r4) {
            r0.lambda$onBindViewHolder$0(r1, r2, r3, r4)
            return
    }

    public AddCategoryRecyclerAdapter(android.content.Context r1, java.util.List<java.lang.String> r2, boolean r3, kotlin.jvm.functions.Function4<java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, kotlin.Unit> r4) {
            r0 = this;
            r0.<init>()
            r3 = -1
            r0.selected_pos = r3
            r0.context = r1
            r0.categoryModels = r2
            r0.clickListenerFunction = r4
            return
    }

    private /* synthetic */ void lambda$onBindViewHolder$0(com.flextv.livestore.adapter.AddCategoryRecyclerAdapter.CategoryHolder r1, int r2, android.view.View r3, boolean r4) {
            r0 = this;
            r0.setBackgroundColor(r1, r2, r4)
            return
    }

    private /* synthetic */ void lambda$onBindViewHolder$1(int r3, java.lang.String r4, android.view.View r5) {
            r2 = this;
            r5 = 1
            r2.setSelectedItem(r3, r5)
            kotlin.jvm.functions.Function4<java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, kotlin.Unit> r5 = r2.clickListenerFunction
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r5.invoke(r4, r3, r0, r1)
            return
    }

    private /* synthetic */ boolean lambda$onBindViewHolder$2(java.lang.String r3, int r4, android.view.View r5) {
            r2 = this;
            kotlin.jvm.functions.Function4<java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, kotlin.Unit> r5 = r2.clickListenerFunction
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r5.invoke(r3, r4, r0, r1)
            r3 = 1
            return r3
    }

    private void setBackgroundColor(com.flextv.livestore.adapter.AddCategoryRecyclerAdapter.CategoryHolder r3, int r4, boolean r5) {
            r2 = this;
            if (r5 == 0) goto L1e
            java.util.List<java.lang.String> r5 = r2.categoryModels
            java.lang.Object r5 = r5.get(r4)
            java.lang.String r5 = (java.lang.String) r5
            kotlin.jvm.functions.Function4<java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, kotlin.Unit> r0 = r2.clickListenerFunction
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.invoke(r5, r4, r1, r1)
            android.view.View r3 = r3.itemView
            r4 = 2131231123(0x7f080193, float:1.8078318E38)
            r3.setBackgroundResource(r4)
            goto L26
        L1e:
            android.view.View r3 = r3.itemView
            r4 = 2131099781(0x7f060085, float:1.7811925E38)
            r3.setBackgroundResource(r4)
        L26:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.categoryModels
            int r0 = r0.size()
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int r3) {
            r2 = this;
            long r0 = (long) r3
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @android.annotation.SuppressLint({"SetTextI18n"})
    public /* bridge */ /* synthetic */ void onBindViewHolder(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r1, @android.annotation.SuppressLint({"RecyclerView"}) int r2) {
            r0 = this;
            com.flextv.livestore.adapter.AddCategoryRecyclerAdapter$CategoryHolder r1 = (com.flextv.livestore.adapter.AddCategoryRecyclerAdapter.CategoryHolder) r1
            r0.onBindViewHolder(r1, r2)
            return
    }

    @android.annotation.SuppressLint({"SetTextI18n"})
    public void onBindViewHolder(@androidx.annotation.NonNull com.flextv.livestore.adapter.AddCategoryRecyclerAdapter.CategoryHolder r5, @android.annotation.SuppressLint({"RecyclerView"}) int r6) {
            r4 = this;
            java.util.List<java.lang.String> r0 = r4.categoryModels
            java.lang.Object r0 = r0.get(r6)
            java.lang.String r0 = (java.lang.String) r0
            android.widget.TextView r1 = r5.category_name
            r1.setText(r0)
            android.view.View r1 = r5.itemView
            com.flextv.livestore.adapter.VodRecyclerAdapter$$ExternalSyntheticLambda1 r2 = new com.flextv.livestore.adapter.VodRecyclerAdapter$$ExternalSyntheticLambda1
            r3 = 1
            r2.<init>(r4, r5, r6, r3)
            r1.setOnFocusChangeListener(r2)
            android.view.View r1 = r5.itemView
            boolean r1 = r1.isFocused()
            r4.setBackgroundColor(r5, r6, r1)
            android.view.View r1 = r5.itemView
            com.flextv.livestore.adapter.VodRecyclerAdapter$$ExternalSyntheticLambda0 r2 = new com.flextv.livestore.adapter.VodRecyclerAdapter$$ExternalSyntheticLambda0
            r2.<init>(r4, r6, r0, r3)
            r1.setOnClickListener(r2)
            android.view.View r1 = r5.itemView
            com.flextv.livestore.adapter.VodRecyclerAdapter$$ExternalSyntheticLambda2 r2 = new com.flextv.livestore.adapter.VodRecyclerAdapter$$ExternalSyntheticLambda2
            r2.<init>(r4, r0, r6, r3)
            r1.setOnLongClickListener(r2)
            int r0 = r4.selected_pos
            if (r0 != r6) goto L46
            if (r6 == 0) goto L46
            android.widget.TextView r5 = r5.category_name
            android.content.Context r6 = r4.context
            r0 = 2131100408(0x7f0602f8, float:1.7813197E38)
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6, r0, r5)
            goto L50
        L46:
            android.widget.TextView r5 = r5.category_name
            android.content.Context r6 = r4.context
            r0 = 2131100407(0x7f0602f7, float:1.7813195E38)
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6, r0, r5)
        L50:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r1, int r2) {
            r0 = this;
            com.flextv.livestore.adapter.AddCategoryRecyclerAdapter$CategoryHolder r1 = r0.onCreateViewHolder(r1, r2)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    public com.flextv.livestore.adapter.AddCategoryRecyclerAdapter.CategoryHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r3, int r4) {
            r2 = this;
            com.flextv.livestore.adapter.AddCategoryRecyclerAdapter$CategoryHolder r4 = new com.flextv.livestore.adapter.AddCategoryRecyclerAdapter$CategoryHolder
            r0 = 2131624058(0x7f0e007a, float:1.8875285E38)
            r1 = 0
            android.view.View r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r0, r3, r1)
            r4.<init>(r2, r3)
            return r4
    }

    public void setData(java.util.List<java.lang.String> r1, int r2) {
            r0 = this;
            r0.categoryModels = r1
            r0.selected_pos = r2
            r0.notifyDataSetChanged()
            return
    }

    public void setSelectedItem(int r2, boolean r3) {
            r1 = this;
            int r3 = r1.selected_pos
            r1.selected_pos = r2
            r0 = -1
            if (r3 == r0) goto La
            r1.notifyItemChanged(r3)
        La:
            r1.notifyItemChanged(r2)
            return
    }
}
