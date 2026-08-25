package com.flextv.livestore.adapter;

/* JADX INFO: loaded from: classes.dex */
public class SubtitleColorRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.flextv.livestore.adapter.SubtitleColorRecyclerAdapter.SubtitleColorViewHolder> {
    public kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.Boolean, kotlin.Unit> clickFunctionListener;
    public java.lang.String[] colorArray;
    public int selected_pos;

    public class SubtitleColorViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        public android.widget.ImageView image_check;
        public com.makeramen.roundedimageview.RoundedImageView image_color;

        public SubtitleColorViewHolder(@androidx.annotation.NonNull com.flextv.livestore.adapter.SubtitleColorRecyclerAdapter r1, android.view.View r2) {
                r0 = this;
                r0.<init>(r2)
                r1 = 2131427790(0x7f0b01ce, float:1.8477206E38)
                android.view.View r1 = r2.findViewById(r1)
                com.makeramen.roundedimageview.RoundedImageView r1 = (com.makeramen.roundedimageview.RoundedImageView) r1
                r0.image_color = r1
                r1 = 2131427789(0x7f0b01cd, float:1.8477204E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                r0.image_check = r1
                return
        }
    }

    public static /* synthetic */ void $r8$lambda$KTXnU92KBpSPDJto_baWHvt7nQk(com.flextv.livestore.adapter.SubtitleColorRecyclerAdapter.SubtitleColorViewHolder r0, android.view.View r1, boolean r2) {
            lambda$onBindViewHolder$1(r0, r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$pUMfNPpS_D6gA1cgmrAdPh8g_n8(com.flextv.livestore.adapter.SubtitleColorRecyclerAdapter r0, int r1, android.view.View r2) {
            r0.lambda$onBindViewHolder$0(r1, r2)
            return
    }

    public SubtitleColorRecyclerAdapter(java.lang.String[] r1, int r2, kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.Boolean, kotlin.Unit> r3) {
            r0 = this;
            r0.<init>()
            r0.colorArray = r1
            r0.selected_pos = r2
            r0.clickFunctionListener = r3
            return
    }

    private /* synthetic */ void lambda$onBindViewHolder$0(int r2, android.view.View r3) {
            r1 = this;
            int r3 = r1.selected_pos
            r1.selected_pos = r2
            r1.notifyItemChanged(r3)
            int r3 = r1.selected_pos
            r1.notifyItemChanged(r3)
            kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.Boolean, kotlin.Unit> r3 = r1.clickFunctionListener
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r3.invoke(r2, r0)
            return
    }

    private static /* synthetic */ void lambda$onBindViewHolder$1(com.flextv.livestore.adapter.SubtitleColorRecyclerAdapter.SubtitleColorViewHolder r0, android.view.View r1, boolean r2) {
            if (r2 == 0) goto Lb
            android.view.View r0 = r0.itemView
            r1 = 2131231205(0x7f0801e5, float:1.8078484E38)
            r0.setBackgroundResource(r1)
            goto L13
        Lb:
            android.view.View r0 = r0.itemView
            r1 = 2131100405(0x7f0602f5, float:1.781319E38)
            r0.setBackgroundResource(r1)
        L13:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
            r1 = this;
            java.lang.String[] r0 = r1.colorArray
            if (r0 != 0) goto L6
            r0 = 0
            goto L7
        L6:
            int r0 = r0.length
        L7:
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r1, @android.annotation.SuppressLint({"RecyclerView"}) int r2) {
            r0 = this;
            com.flextv.livestore.adapter.SubtitleColorRecyclerAdapter$SubtitleColorViewHolder r1 = (com.flextv.livestore.adapter.SubtitleColorRecyclerAdapter.SubtitleColorViewHolder) r1
            r0.onBindViewHolder(r1, r2)
            return
    }

    public void onBindViewHolder(@androidx.annotation.NonNull com.flextv.livestore.adapter.SubtitleColorRecyclerAdapter.SubtitleColorViewHolder r4, @android.annotation.SuppressLint({"RecyclerView"}) int r5) {
            r3 = this;
            com.makeramen.roundedimageview.RoundedImageView r0 = r4.image_color
            java.lang.String[] r1 = r3.colorArray
            r1 = r1[r5]
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setColorFilter(r1)
            android.view.View r0 = r4.itemView
            com.flextv.livestore.adapter.SeasonRecyclerAdapter$$ExternalSyntheticLambda0 r1 = new com.flextv.livestore.adapter.SeasonRecyclerAdapter$$ExternalSyntheticLambda0
            r2 = 7
            r1.<init>(r3, r5, r2)
            r0.setOnClickListener(r1)
            android.view.View r0 = r4.itemView
            com.flextv.livestore.adapter.MyGroupRecyclerAdapter$$ExternalSyntheticLambda0 r1 = new com.flextv.livestore.adapter.MyGroupRecyclerAdapter$$ExternalSyntheticLambda0
            r2 = 4
            r1.<init>(r4, r2)
            r0.setOnFocusChangeListener(r1)
            int r0 = r3.selected_pos
            if (r0 != r5) goto L2e
            android.widget.ImageView r4 = r4.image_check
            r5 = 0
            r4.setVisibility(r5)
            goto L35
        L2e:
            android.widget.ImageView r4 = r4.image_check
            r5 = 8
            r4.setVisibility(r5)
        L35:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r1, int r2) {
            r0 = this;
            com.flextv.livestore.adapter.SubtitleColorRecyclerAdapter$SubtitleColorViewHolder r1 = r0.onCreateViewHolder(r1, r2)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    public com.flextv.livestore.adapter.SubtitleColorRecyclerAdapter.SubtitleColorViewHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r3, int r4) {
            r2 = this;
            com.flextv.livestore.adapter.SubtitleColorRecyclerAdapter$SubtitleColorViewHolder r4 = new com.flextv.livestore.adapter.SubtitleColorRecyclerAdapter$SubtitleColorViewHolder
            r0 = 2131624066(0x7f0e0082, float:1.8875301E38)
            r1 = 0
            android.view.View r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r0, r3, r1)
            r4.<init>(r2, r3)
            return r4
    }
}
