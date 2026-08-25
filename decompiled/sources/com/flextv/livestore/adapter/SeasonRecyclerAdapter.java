package com.flextv.livestore.adapter;

/* JADX INFO: loaded from: classes.dex */
public class SeasonRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.flextv.livestore.adapter.SeasonRecyclerAdapter.XCSeasonViewHolder> {
    public kotlin.jvm.functions.Function3<com.flextv.livestore.models.Season, java.lang.Integer, java.lang.Boolean, kotlin.Unit> clickFunctionListener;
    public android.content.Context context;
    public java.util.List<com.flextv.livestore.models.Season> seasonList;
    public int selected_pos;

    /* JADX INFO: loaded from: classes2.dex */
    public class XCSeasonViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        public android.widget.TextView txt_season;

        public XCSeasonViewHolder(@androidx.annotation.NonNull com.flextv.livestore.adapter.SeasonRecyclerAdapter r1, android.view.View r2) {
                r0 = this;
                r0.<init>(r2)
                r1 = 2131428324(0x7f0b03e4, float:1.847829E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r0.txt_season = r1
                return
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$OxjGNT2tl0JsDiS1-YScwlSofAk, reason: not valid java name */
    public static /* synthetic */ void m101$r8$lambda$OxjGNT2tl0JsDiS1YScwlSofAk(com.flextv.livestore.adapter.SeasonRecyclerAdapter r0, com.flextv.livestore.adapter.SeasonRecyclerAdapter.XCSeasonViewHolder r1, int r2, android.view.View r3, boolean r4) {
            r0.lambda$onBindViewHolder$0(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ void $r8$lambda$vEmWniIRhcVGeyXDQcsOyA2HmbY(com.flextv.livestore.adapter.SeasonRecyclerAdapter r0, int r1, android.view.View r2) {
            r0.lambda$onBindViewHolder$1(r1, r2)
            return
    }

    public SeasonRecyclerAdapter(android.content.Context r2, java.util.List<com.flextv.livestore.models.Season> r3, kotlin.jvm.functions.Function3<com.flextv.livestore.models.Season, java.lang.Integer, java.lang.Boolean, kotlin.Unit> r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.selected_pos = r0
            r1.context = r2
            r1.seasonList = r3
            r1.clickFunctionListener = r4
            return
    }

    private /* synthetic */ void lambda$onBindViewHolder$0(com.flextv.livestore.adapter.SeasonRecyclerAdapter.XCSeasonViewHolder r1, int r2, android.view.View r3, boolean r4) {
            r0 = this;
            r0.setBackgroundColor(r1, r2, r4)
            return
    }

    private /* synthetic */ void lambda$onBindViewHolder$1(int r3, android.view.View r4) {
            r2 = this;
            r2.setSelectedItem(r3)
            kotlin.jvm.functions.Function3<com.flextv.livestore.models.Season, java.lang.Integer, java.lang.Boolean, kotlin.Unit> r4 = r2.clickFunctionListener
            java.util.List<com.flextv.livestore.models.Season> r0 = r2.seasonList
            java.lang.Object r0 = r0.get(r3)
            com.flextv.livestore.models.Season r0 = (com.flextv.livestore.models.Season) r0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r4.invoke(r0, r3, r1)
            return
    }

    private void setBackgroundColor(com.flextv.livestore.adapter.SeasonRecyclerAdapter.XCSeasonViewHolder r4, int r5, boolean r6) {
            r3 = this;
            if (r6 == 0) goto L1e
            java.util.List<com.flextv.livestore.models.Season> r6 = r3.seasonList
            java.lang.Object r6 = r6.get(r5)
            com.flextv.livestore.models.Season r6 = (com.flextv.livestore.models.Season) r6
            kotlin.jvm.functions.Function3<com.flextv.livestore.models.Season, java.lang.Integer, java.lang.Boolean, kotlin.Unit> r0 = r3.clickFunctionListener
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.invoke(r6, r1, r2)
            android.view.View r6 = r4.itemView
            r0 = 2131099781(0x7f060085, float:1.7811925E38)
            r6.setBackgroundResource(r0)
            goto L26
        L1e:
            android.view.View r6 = r4.itemView
            r0 = 2131100405(0x7f0602f5, float:1.781319E38)
            r6.setBackgroundResource(r0)
        L26:
            int r6 = r3.selected_pos
            if (r5 != r6) goto L35
            android.widget.TextView r4 = r4.txt_season
            android.content.Context r5 = r3.context
            r6 = 2131100408(0x7f0602f8, float:1.7813197E38)
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5, r6, r4)
            goto L3f
        L35:
            android.widget.TextView r4 = r4.txt_season
            android.content.Context r5 = r3.context
            r6 = 2131100407(0x7f0602f7, float:1.7813195E38)
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5, r6, r4)
        L3f:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
            r1 = this;
            java.util.List<com.flextv.livestore.models.Season> r0 = r1.seasonList
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
            com.flextv.livestore.adapter.SeasonRecyclerAdapter$XCSeasonViewHolder r1 = (com.flextv.livestore.adapter.SeasonRecyclerAdapter.XCSeasonViewHolder) r1
            r0.onBindViewHolder(r1, r2)
            return
    }

    public void onBindViewHolder(@androidx.annotation.NonNull com.flextv.livestore.adapter.SeasonRecyclerAdapter.XCSeasonViewHolder r4, int r5) {
            r3 = this;
            java.util.List<com.flextv.livestore.models.Season> r0 = r3.seasonList
            java.lang.Object r0 = r0.get(r5)
            com.flextv.livestore.models.Season r0 = (com.flextv.livestore.models.Season) r0
            android.widget.TextView r1 = r4.txt_season
            java.lang.String r0 = r0.getName()
            r1.setText(r0)
            android.view.View r0 = r4.itemView
            com.flextv.livestore.adapter.VodRecyclerAdapter$$ExternalSyntheticLambda1 r1 = new com.flextv.livestore.adapter.VodRecyclerAdapter$$ExternalSyntheticLambda1
            r2 = 5
            r1.<init>(r3, r4, r5, r2)
            r0.setOnFocusChangeListener(r1)
            android.view.View r0 = r4.itemView
            boolean r0 = r0.isFocused()
            r3.setBackgroundColor(r4, r5, r0)
            android.view.View r4 = r4.itemView
            com.flextv.livestore.adapter.SeasonRecyclerAdapter$$ExternalSyntheticLambda0 r0 = new com.flextv.livestore.adapter.SeasonRecyclerAdapter$$ExternalSyntheticLambda0
            r1 = 0
            r0.<init>(r3, r5, r1)
            r4.setOnClickListener(r0)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r1, int r2) {
            r0 = this;
            com.flextv.livestore.adapter.SeasonRecyclerAdapter$XCSeasonViewHolder r1 = r0.onCreateViewHolder(r1, r2)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    public com.flextv.livestore.adapter.SeasonRecyclerAdapter.XCSeasonViewHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r3, int r4) {
            r2 = this;
            com.flextv.livestore.adapter.SeasonRecyclerAdapter$XCSeasonViewHolder r4 = new com.flextv.livestore.adapter.SeasonRecyclerAdapter$XCSeasonViewHolder
            r0 = 2131624063(0x7f0e007f, float:1.8875295E38)
            r1 = 0
            android.view.View r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r0, r3, r1)
            r4.<init>(r2, r3)
            return r4
    }

    public void setFocusDisable(int r1, boolean r2) {
            r0 = this;
            r0.notifyItemChanged(r1)
            return
    }

    public void setSeasonList(java.util.List<com.flextv.livestore.models.Season> r1) {
            r0 = this;
            r0.seasonList = r1
            r0.notifyDataSetChanged()
            return
    }

    public void setSelectedItem(int r3) {
            r2 = this;
            int r0 = r2.selected_pos
            r2.selected_pos = r3
            r1 = -1
            if (r0 == r1) goto La
            r2.notifyItemChanged(r0)
        La:
            r2.notifyItemChanged(r3)
            return
    }
}
