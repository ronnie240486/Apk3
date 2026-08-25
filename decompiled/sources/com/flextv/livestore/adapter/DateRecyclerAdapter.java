package com.flextv.livestore.adapter;

/* JADX INFO: loaded from: classes.dex */
public class DateRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.flextv.livestore.adapter.DateRecyclerAdapter.XCDateViewHolder> {
    public java.util.List<com.flextv.livestore.models.CatchupModel> catchupModels;
    public kotlin.jvm.functions.Function3<com.flextv.livestore.models.CatchupModel, java.lang.Integer, java.lang.Boolean, kotlin.Unit> clickFunctionListener;
    public android.content.Context context;
    public int disabled_pos;
    public boolean is_disable;
    public int selected_pos;

    /* JADX INFO: loaded from: classes2.dex */
    public class XCDateViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        public android.widget.TextView txt_date;
        public android.widget.TextView txt_week;

        public XCDateViewHolder(@androidx.annotation.NonNull com.flextv.livestore.adapter.DateRecyclerAdapter r1, android.view.View r2) {
                r0 = this;
                r0.<init>(r2)
                r1 = 2131428356(0x7f0b0404, float:1.8478354E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r0.txt_week = r1
                r1 = 2131428298(0x7f0b03ca, float:1.8478237E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r0.txt_date = r1
                return
        }
    }

    public static /* synthetic */ void $r8$lambda$V6deZ2nuwTReW7idk1LP3Uz5uHk(com.flextv.livestore.adapter.DateRecyclerAdapter r0, com.flextv.livestore.adapter.DateRecyclerAdapter.XCDateViewHolder r1, int r2, android.view.View r3, boolean r4) {
            r0.lambda$onBindViewHolder$0(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ void $r8$lambda$xKXKrtA_oAZ1BGojUMbjDu7tVHI(com.flextv.livestore.adapter.DateRecyclerAdapter r0, int r1, com.flextv.livestore.models.CatchupModel r2, android.view.View r3) {
            r0.lambda$onBindViewHolder$1(r1, r2, r3)
            return
    }

    public DateRecyclerAdapter(android.content.Context r3, java.util.List<com.flextv.livestore.models.CatchupModel> r4, kotlin.jvm.functions.Function3<com.flextv.livestore.models.CatchupModel, java.lang.Integer, java.lang.Boolean, kotlin.Unit> r5) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.disabled_pos = r0
            r1 = 0
            r2.is_disable = r1
            r2.selected_pos = r0
            r2.context = r3
            r2.catchupModels = r4
            r2.clickFunctionListener = r5
            return
    }

    private /* synthetic */ void lambda$onBindViewHolder$0(com.flextv.livestore.adapter.DateRecyclerAdapter.XCDateViewHolder r1, int r2, android.view.View r3, boolean r4) {
            r0 = this;
            r0.setBackgroundColor(r1, r2, r4)
            return
    }

    private /* synthetic */ void lambda$onBindViewHolder$1(int r2, com.flextv.livestore.models.CatchupModel r3, android.view.View r4) {
            r1 = this;
            int r4 = r1.selected_pos
            r1.selected_pos = r2
            r0 = -1
            if (r4 == r0) goto La
            r1.notifyItemChanged(r4)
        La:
            int r4 = r1.selected_pos
            r1.notifyItemChanged(r4)
            kotlin.jvm.functions.Function3<com.flextv.livestore.models.CatchupModel, java.lang.Integer, java.lang.Boolean, kotlin.Unit> r4 = r1.clickFunctionListener
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r4.invoke(r3, r2, r0)
            return
    }

    private void setBackgroundColor(com.flextv.livestore.adapter.DateRecyclerAdapter.XCDateViewHolder r5, int r6, boolean r7) {
            r4 = this;
            java.util.List<com.flextv.livestore.models.CatchupModel> r0 = r4.catchupModels
            java.lang.Object r0 = r0.get(r6)
            com.flextv.livestore.models.CatchupModel r0 = (com.flextv.livestore.models.CatchupModel) r0
            r1 = 2131099781(0x7f060085, float:1.7811925E38)
            if (r7 == 0) goto L24
            r7 = 0
            r4.is_disable = r7
            r7 = -1
            r4.disabled_pos = r7
            kotlin.jvm.functions.Function3<com.flextv.livestore.models.CatchupModel, java.lang.Integer, java.lang.Boolean, kotlin.Unit> r7 = r4.clickFunctionListener
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r7.invoke(r0, r2, r3)
            android.view.View r7 = r5.itemView
            r7.setBackgroundResource(r1)
            goto L2f
        L24:
            android.view.View r7 = r5.itemView
            java.lang.String r0 = "#00FFFFFF"
            int r0 = android.graphics.Color.parseColor(r0)
            r7.setBackgroundColor(r0)
        L2f:
            int r7 = r4.selected_pos
            if (r6 != r7) goto L3e
            android.widget.TextView r7 = r5.txt_date
            android.content.Context r0 = r4.context
            r2 = 2131100408(0x7f0602f8, float:1.7813197E38)
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r2, r7)
            goto L48
        L3e:
            android.widget.TextView r7 = r5.txt_date
            android.content.Context r0 = r4.context
            r2 = 2131100407(0x7f0602f7, float:1.7813195E38)
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r2, r7)
        L48:
            int r7 = r4.disabled_pos
            if (r6 != r7) goto L64
            boolean r6 = r4.is_disable
            if (r6 == 0) goto L64
            android.view.View r6 = r5.itemView
            r6.setBackgroundResource(r1)
            android.view.View r5 = r5.itemView
            java.lang.String r6 = "#CC33253C"
            int r6 = android.graphics.Color.parseColor(r6)
            android.content.res.ColorStateList r6 = android.content.res.ColorStateList.valueOf(r6)
            r5.setBackgroundTintList(r6)
        L64:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
            r1 = this;
            java.util.List<com.flextv.livestore.models.CatchupModel> r0 = r1.catchupModels
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.size()
        La:
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r1, int r2) {
            r0 = this;
            com.flextv.livestore.adapter.DateRecyclerAdapter$XCDateViewHolder r1 = (com.flextv.livestore.adapter.DateRecyclerAdapter.XCDateViewHolder) r1
            r0.onBindViewHolder(r1, r2)
            return
    }

    public void onBindViewHolder(@androidx.annotation.NonNull com.flextv.livestore.adapter.DateRecyclerAdapter.XCDateViewHolder r5, int r6) {
            r4 = this;
            java.util.List<com.flextv.livestore.models.CatchupModel> r0 = r4.catchupModels
            java.lang.Object r0 = r0.get(r6)
            com.flextv.livestore.models.CatchupModel r0 = (com.flextv.livestore.models.CatchupModel) r0
            android.widget.TextView r1 = r5.txt_week
            java.lang.String r2 = r0.getDayofweek()
            r1.setText(r2)
            android.widget.TextView r1 = r5.txt_date
            java.lang.String r2 = r0.getName()
            r1.setText(r2)
            android.view.View r1 = r5.itemView
            com.flextv.livestore.adapter.VodRecyclerAdapter$$ExternalSyntheticLambda1 r2 = new com.flextv.livestore.adapter.VodRecyclerAdapter$$ExternalSyntheticLambda1
            r3 = 3
            r2.<init>(r4, r5, r6, r3)
            r1.setOnFocusChangeListener(r2)
            android.view.View r1 = r5.itemView
            com.flextv.livestore.adapter.VodRecyclerAdapter$$ExternalSyntheticLambda0 r2 = new com.flextv.livestore.adapter.VodRecyclerAdapter$$ExternalSyntheticLambda0
            r3 = 4
            r2.<init>(r4, r6, r0, r3)
            r1.setOnClickListener(r2)
            android.view.View r0 = r5.itemView
            boolean r0 = r0.isFocused()
            r4.setBackgroundColor(r5, r6, r0)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r1, int r2) {
            r0 = this;
            com.flextv.livestore.adapter.DateRecyclerAdapter$XCDateViewHolder r1 = r0.onCreateViewHolder(r1, r2)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    public com.flextv.livestore.adapter.DateRecyclerAdapter.XCDateViewHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r3, int r4) {
            r2 = this;
            com.flextv.livestore.adapter.DateRecyclerAdapter$XCDateViewHolder r4 = new com.flextv.livestore.adapter.DateRecyclerAdapter$XCDateViewHolder
            r0 = 2131624051(0x7f0e0073, float:1.887527E38)
            r1 = 0
            android.view.View r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r0, r3, r1)
            r4.<init>(r2, r3)
            return r4
    }

    public void setCatchupModels(java.util.List<com.flextv.livestore.models.CatchupModel> r1, int r2) {
            r0 = this;
            r0.catchupModels = r1
            r0.selected_pos = r2
            r0.notifyDataSetChanged()
            return
    }

    public void setFocusDisable(int r1, boolean r2) {
            r0 = this;
            r0.disabled_pos = r1
            r0.is_disable = r2
            r0.notifyItemChanged(r1)
            return
    }
}
