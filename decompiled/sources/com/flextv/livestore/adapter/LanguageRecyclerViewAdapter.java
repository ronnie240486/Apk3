package com.flextv.livestore.adapter;

/* JADX INFO: loaded from: classes.dex */
public class LanguageRecyclerViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.flextv.livestore.adapter.LanguageRecyclerViewAdapter.HideCategoryViewHolder> {
    public java.util.List<com.flextv.livestore.models.LanguageModel> category_data;
    public int checked_pos;
    public kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.Boolean, kotlin.Unit> clickFunctionListener;

    /* JADX INFO: loaded from: classes2.dex */
    public class HideCategoryViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        public android.widget.CheckedTextView txt_name;

        public HideCategoryViewHolder(@androidx.annotation.NonNull com.flextv.livestore.adapter.LanguageRecyclerViewAdapter r1, android.view.View r2) {
                r0 = this;
                r0.<init>(r2)
                r1 = 2131428324(0x7f0b03e4, float:1.847829E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.CheckedTextView r1 = (android.widget.CheckedTextView) r1
                r0.txt_name = r1
                return
        }
    }

    public static /* synthetic */ void $r8$lambda$F8LH5zygGPUOAXp5hQD5nLbdCYQ(com.flextv.livestore.adapter.LanguageRecyclerViewAdapter r0, int r1, android.view.View r2) {
            r0.lambda$onBindViewHolder$0(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$_EcdomuiJu1mdUa_67z27JVgup8(com.flextv.livestore.adapter.LanguageRecyclerViewAdapter.HideCategoryViewHolder r0, android.view.View r1, boolean r2) {
            lambda$onBindViewHolder$1(r0, r1, r2)
            return
    }

    public LanguageRecyclerViewAdapter(android.content.Context r1, java.util.List<com.flextv.livestore.models.LanguageModel> r2, int r3, kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.Boolean, kotlin.Unit> r4) {
            r0 = this;
            r0.<init>()
            r0.category_data = r2
            r0.checked_pos = r3
            r0.clickFunctionListener = r4
            return
    }

    private /* synthetic */ void lambda$onBindViewHolder$0(int r2, android.view.View r3) {
            r1 = this;
            int r3 = r1.checked_pos
            r1.checked_pos = r2
            r1.notifyItemChanged(r3)
            int r3 = r1.checked_pos
            r1.notifyItemChanged(r3)
            kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.Boolean, kotlin.Unit> r3 = r1.clickFunctionListener
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r3.invoke(r2, r0)
            return
    }

    private static /* synthetic */ void lambda$onBindViewHolder$1(com.flextv.livestore.adapter.LanguageRecyclerViewAdapter.HideCategoryViewHolder r0, android.view.View r1, boolean r2) {
            if (r2 == 0) goto Lb
            android.view.View r0 = r0.itemView
            r1 = 2131231123(0x7f080193, float:1.8078318E38)
            r0.setBackgroundResource(r1)
            goto L13
        Lb:
            android.view.View r0 = r0.itemView
            r1 = 2131099781(0x7f060085, float:1.7811925E38)
            r0.setBackgroundResource(r1)
        L13:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
            r1 = this;
            java.util.List<com.flextv.livestore.models.LanguageModel> r0 = r1.category_data
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
    public /* bridge */ /* synthetic */ void onBindViewHolder(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r1, @android.annotation.SuppressLint({"RecyclerView"}) int r2) {
            r0 = this;
            com.flextv.livestore.adapter.LanguageRecyclerViewAdapter$HideCategoryViewHolder r1 = (com.flextv.livestore.adapter.LanguageRecyclerViewAdapter.HideCategoryViewHolder) r1
            r0.onBindViewHolder(r1, r2)
            return
    }

    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    public void onBindViewHolder(@androidx.annotation.NonNull com.flextv.livestore.adapter.LanguageRecyclerViewAdapter.HideCategoryViewHolder r4, @android.annotation.SuppressLint({"RecyclerView"}) int r5) {
            r3 = this;
            android.widget.CheckedTextView r0 = r4.txt_name
            java.util.List<com.flextv.livestore.models.LanguageModel> r1 = r3.category_data
            java.lang.Object r1 = r1.get(r5)
            com.flextv.livestore.models.LanguageModel r1 = (com.flextv.livestore.models.LanguageModel) r1
            java.lang.String r1 = r1.getName()
            r0.setText(r1)
            android.widget.CheckedTextView r0 = r4.txt_name
            int r1 = r3.checked_pos
            if (r1 != r5) goto L19
            r1 = 1
            goto L1a
        L19:
            r1 = 0
        L1a:
            r0.setChecked(r1)
            android.view.View r0 = r4.itemView
            com.flextv.livestore.adapter.SeasonRecyclerAdapter$$ExternalSyntheticLambda0 r1 = new com.flextv.livestore.adapter.SeasonRecyclerAdapter$$ExternalSyntheticLambda0
            r2 = 3
            r1.<init>(r3, r5, r2)
            r0.setOnClickListener(r1)
            android.view.View r0 = r4.itemView
            com.flextv.livestore.adapter.MyGroupRecyclerAdapter$$ExternalSyntheticLambda0 r1 = new com.flextv.livestore.adapter.MyGroupRecyclerAdapter$$ExternalSyntheticLambda0
            r2 = 2
            r1.<init>(r4, r2)
            r0.setOnFocusChangeListener(r1)
            int r0 = r3.checked_pos
            if (r0 != r5) goto L3c
            android.view.View r4 = r4.itemView
            r4.requestFocus()
        L3c:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r1, int r2) {
            r0 = this;
            com.flextv.livestore.adapter.LanguageRecyclerViewAdapter$HideCategoryViewHolder r1 = r0.onCreateViewHolder(r1, r2)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    public com.flextv.livestore.adapter.LanguageRecyclerViewAdapter.HideCategoryViewHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r3, int r4) {
            r2 = this;
            com.flextv.livestore.adapter.LanguageRecyclerViewAdapter$HideCategoryViewHolder r4 = new com.flextv.livestore.adapter.LanguageRecyclerViewAdapter$HideCategoryViewHolder
            r0 = 2131624055(0x7f0e0077, float:1.8875279E38)
            r1 = 0
            android.view.View r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r0, r3, r1)
            r4.<init>(r2, r3)
            return r4
    }
}
