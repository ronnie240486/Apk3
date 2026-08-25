package com.flextv.livestore.adapter;

/* JADX INFO: loaded from: classes2.dex */
public class MyGroupRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.flextv.livestore.adapter.MyGroupRecyclerAdapter.CategoryListViewHolder> {
    public kotlin.jvm.functions.Function3<com.flextv.livestore.models.CategoryModel, java.lang.Integer, java.lang.Boolean, kotlin.Unit> clickeListenerFunction;
    private java.util.List<com.flextv.livestore.models.CategoryModel> datas;
    private int selected_pos;

    public class CategoryListViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private android.widget.TextView txt_name;

        public CategoryListViewHolder(@androidx.annotation.NonNull com.flextv.livestore.adapter.MyGroupRecyclerAdapter r1, android.view.View r2) {
                r0 = this;
                r0.<init>(r2)
                r1 = 2131428324(0x7f0b03e4, float:1.847829E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r0.txt_name = r1
                return
        }

        public static /* synthetic */ android.widget.TextView access$000(com.flextv.livestore.adapter.MyGroupRecyclerAdapter.CategoryListViewHolder r0) {
                android.widget.TextView r0 = r0.txt_name
                return r0
        }
    }

    public static /* synthetic */ void $r8$lambda$NPXsEP8JPXXN2AfApOqu_a8Oowk(com.flextv.livestore.adapter.MyGroupRecyclerAdapter.CategoryListViewHolder r0, android.view.View r1, boolean r2) {
            lambda$onBindViewHolder$0(r0, r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$vgkrn41w15zxmM5HxcEmfwjzTdE(com.flextv.livestore.adapter.MyGroupRecyclerAdapter r0, int r1, android.view.View r2) {
            r0.lambda$onBindViewHolder$1(r1, r2)
            return
    }

    public MyGroupRecyclerAdapter(android.content.Context r1, java.util.List<com.flextv.livestore.models.CategoryModel> r2, kotlin.jvm.functions.Function3<com.flextv.livestore.models.CategoryModel, java.lang.Integer, java.lang.Boolean, kotlin.Unit> r3) {
            r0 = this;
            r0.<init>()
            r1 = 0
            r0.selected_pos = r1
            r0.datas = r2
            r0.clickeListenerFunction = r3
            return
    }

    private static /* synthetic */ void lambda$onBindViewHolder$0(com.flextv.livestore.adapter.MyGroupRecyclerAdapter.CategoryListViewHolder r0, android.view.View r1, boolean r2) {
            if (r2 == 0) goto Lb
            android.view.View r0 = r0.itemView
            r1 = 2131231123(0x7f080193, float:1.8078318E38)
            r0.setBackgroundResource(r1)
            goto L13
        Lb:
            android.view.View r0 = r0.itemView
            r1 = 2131100405(0x7f0602f5, float:1.781319E38)
            r0.setBackgroundResource(r1)
        L13:
            return
    }

    private /* synthetic */ void lambda$onBindViewHolder$1(int r3, android.view.View r4) {
            r2 = this;
            kotlin.jvm.functions.Function3<com.flextv.livestore.models.CategoryModel, java.lang.Integer, java.lang.Boolean, kotlin.Unit> r4 = r2.clickeListenerFunction
            java.util.List<com.flextv.livestore.models.CategoryModel> r0 = r2.datas
            java.lang.Object r0 = r0.get(r3)
            com.flextv.livestore.models.CategoryModel r0 = (com.flextv.livestore.models.CategoryModel) r0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r4.invoke(r0, r3, r1)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
            r1 = this;
            java.util.List<com.flextv.livestore.models.CategoryModel> r0 = r1.datas
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
            com.flextv.livestore.adapter.MyGroupRecyclerAdapter$CategoryListViewHolder r1 = (com.flextv.livestore.adapter.MyGroupRecyclerAdapter.CategoryListViewHolder) r1
            r0.onBindViewHolder(r1, r2)
            return
    }

    @android.annotation.SuppressLint({"SetTextI18n"})
    public void onBindViewHolder(@androidx.annotation.NonNull com.flextv.livestore.adapter.MyGroupRecyclerAdapter.CategoryListViewHolder r4, @android.annotation.SuppressLint({"RecyclerView"}) int r5) {
            r3 = this;
            android.widget.TextView r0 = com.flextv.livestore.adapter.MyGroupRecyclerAdapter.CategoryListViewHolder.access$000(r4)
            java.util.List<com.flextv.livestore.models.CategoryModel> r1 = r3.datas
            java.lang.Object r1 = r1.get(r5)
            com.flextv.livestore.models.CategoryModel r1 = (com.flextv.livestore.models.CategoryModel) r1
            java.lang.String r1 = r1.getName()
            r0.setText(r1)
            android.view.View r0 = r4.itemView
            com.flextv.livestore.adapter.MyGroupRecyclerAdapter$$ExternalSyntheticLambda0 r1 = new com.flextv.livestore.adapter.MyGroupRecyclerAdapter$$ExternalSyntheticLambda0
            r2 = 0
            r1.<init>(r4, r2)
            r0.setOnFocusChangeListener(r1)
            android.view.View r0 = r4.itemView
            com.flextv.livestore.adapter.SeasonRecyclerAdapter$$ExternalSyntheticLambda0 r1 = new com.flextv.livestore.adapter.SeasonRecyclerAdapter$$ExternalSyntheticLambda0
            r2 = 5
            r1.<init>(r3, r5, r2)
            r0.setOnClickListener(r1)
            int r0 = r3.selected_pos
            if (r0 != r5) goto L32
            android.view.View r4 = r4.itemView
            r4.requestFocus()
        L32:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r1, int r2) {
            r0 = this;
            com.flextv.livestore.adapter.MyGroupRecyclerAdapter$CategoryListViewHolder r1 = r0.onCreateViewHolder(r1, r2)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    public com.flextv.livestore.adapter.MyGroupRecyclerAdapter.CategoryListViewHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r3, int r4) {
            r2 = this;
            com.flextv.livestore.adapter.MyGroupRecyclerAdapter$CategoryListViewHolder r4 = new com.flextv.livestore.adapter.MyGroupRecyclerAdapter$CategoryListViewHolder
            r0 = 2131624061(0x7f0e007d, float:1.8875291E38)
            r1 = 0
            android.view.View r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r0, r3, r1)
            r4.<init>(r2, r3)
            return r4
    }
}
