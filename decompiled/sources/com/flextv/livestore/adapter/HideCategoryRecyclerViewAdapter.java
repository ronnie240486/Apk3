package com.flextv.livestore.adapter;

/* JADX INFO: loaded from: classes2.dex */
public class HideCategoryRecyclerViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.flextv.livestore.adapter.HideCategoryRecyclerViewAdapter.HideCategoryViewHolder> {
    public java.lang.String[] category_data;
    public boolean[] checks;
    public kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.Boolean, kotlin.Unit> clickFunctionListener;

    /* JADX INFO: loaded from: classes.dex */
    public class HideCategoryViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        public android.widget.CheckedTextView txt_name;

        public HideCategoryViewHolder(@androidx.annotation.NonNull com.flextv.livestore.adapter.HideCategoryRecyclerViewAdapter r1, android.view.View r2) {
                r0 = this;
                r0.<init>(r2)
                r1 = 2131428324(0x7f0b03e4, float:1.847829E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.CheckedTextView r1 = (android.widget.CheckedTextView) r1
                r0.txt_name = r1
                return
        }
    }

    public static /* synthetic */ void $r8$lambda$Aab0L3NT7JzuIbRiKoLPMmsG5a8(com.flextv.livestore.adapter.HideCategoryRecyclerViewAdapter.HideCategoryViewHolder r0, android.view.View r1, boolean r2) {
            lambda$onBindViewHolder$1(r0, r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$vJiH9jBan7IGmEck5vnsM96buBs(com.flextv.livestore.adapter.HideCategoryRecyclerViewAdapter r0, int r1, android.view.View r2) {
            r0.lambda$onBindViewHolder$0(r1, r2)
            return
    }

    public HideCategoryRecyclerViewAdapter(android.content.Context r1, java.lang.String[] r2, boolean[] r3, kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.Boolean, kotlin.Unit> r4) {
            r0 = this;
            r0.<init>()
            r0.category_data = r2
            r0.checks = r3
            r0.clickFunctionListener = r4
            return
    }

    private /* synthetic */ void lambda$onBindViewHolder$0(int r3, android.view.View r4) {
            r2 = this;
            r2.toggleChecked(r3)
            kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.Boolean, kotlin.Unit> r4 = r2.clickFunctionListener
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            boolean[] r1 = r2.checks
            boolean r3 = r1[r3]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r4.invoke(r0, r3)
            return
    }

    private static /* synthetic */ void lambda$onBindViewHolder$1(com.flextv.livestore.adapter.HideCategoryRecyclerViewAdapter.HideCategoryViewHolder r0, android.view.View r1, boolean r2) {
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

    public void allChecked(boolean r3) {
            r2 = this;
            r0 = 0
        L1:
            java.lang.String[] r1 = r2.category_data
            int r1 = r1.length
            if (r0 >= r1) goto Ld
            boolean[] r1 = r2.checks
            r1[r0] = r3
            int r0 = r0 + 1
            goto L1
        Ld:
            r2.notifyDataSetChanged()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
            r1 = this;
            java.lang.String[] r0 = r1.category_data
            int r0 = r0.length
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    public /* bridge */ /* synthetic */ void onBindViewHolder(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r1, @android.annotation.SuppressLint({"RecyclerView"}) int r2) {
            r0 = this;
            com.flextv.livestore.adapter.HideCategoryRecyclerViewAdapter$HideCategoryViewHolder r1 = (com.flextv.livestore.adapter.HideCategoryRecyclerViewAdapter.HideCategoryViewHolder) r1
            r0.onBindViewHolder(r1, r2)
            return
    }

    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    public void onBindViewHolder(@androidx.annotation.NonNull com.flextv.livestore.adapter.HideCategoryRecyclerViewAdapter.HideCategoryViewHolder r4, @android.annotation.SuppressLint({"RecyclerView"}) int r5) {
            r3 = this;
            android.widget.CheckedTextView r0 = r4.txt_name
            java.lang.String[] r1 = r3.category_data
            r1 = r1[r5]
            r0.setText(r1)
            android.widget.CheckedTextView r0 = r4.txt_name
            boolean[] r1 = r3.checks
            boolean r1 = r1[r5]
            r0.setChecked(r1)
            android.view.View r0 = r4.itemView
            com.flextv.livestore.adapter.SeasonRecyclerAdapter$$ExternalSyntheticLambda0 r1 = new com.flextv.livestore.adapter.SeasonRecyclerAdapter$$ExternalSyntheticLambda0
            r2 = 2
            r1.<init>(r3, r5, r2)
            r0.setOnClickListener(r1)
            android.view.View r5 = r4.itemView
            com.flextv.livestore.adapter.MyGroupRecyclerAdapter$$ExternalSyntheticLambda0 r0 = new com.flextv.livestore.adapter.MyGroupRecyclerAdapter$$ExternalSyntheticLambda0
            r1 = 1
            r0.<init>(r4, r1)
            r5.setOnFocusChangeListener(r0)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r1, int r2) {
            r0 = this;
            com.flextv.livestore.adapter.HideCategoryRecyclerViewAdapter$HideCategoryViewHolder r1 = r0.onCreateViewHolder(r1, r2)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    public com.flextv.livestore.adapter.HideCategoryRecyclerViewAdapter.HideCategoryViewHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r3, int r4) {
            r2 = this;
            com.flextv.livestore.adapter.HideCategoryRecyclerViewAdapter$HideCategoryViewHolder r4 = new com.flextv.livestore.adapter.HideCategoryRecyclerViewAdapter$HideCategoryViewHolder
            r0 = 2131624055(0x7f0e0077, float:1.8875279E38)
            r1 = 0
            android.view.View r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r0, r3, r1)
            r4.<init>(r2, r3)
            return r4
    }

    public void toggleChecked(int r3) {
            r2 = this;
            boolean[] r0 = r2.checks
            boolean r1 = r0[r3]
            r1 = r1 ^ 1
            r0[r3] = r1
            r2.notifyItemChanged(r3)
            return
    }
}
