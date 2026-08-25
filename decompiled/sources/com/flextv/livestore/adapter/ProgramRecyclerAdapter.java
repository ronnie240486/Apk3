package com.flextv.livestore.adapter;

/* JADX INFO: loaded from: classes.dex */
public class ProgramRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.flextv.livestore.adapter.ProgramRecyclerAdapter.XCProgramViewHolder> {
    public kotlin.jvm.functions.Function3<com.flextv.livestore.models.CatchUpEpg, java.lang.Integer, java.lang.Boolean, kotlin.Unit> clickFunctionListener;
    public android.content.Context context;
    public int current_program_pos;
    public int disabled_pos;
    public java.util.List<com.flextv.livestore.models.CatchUpEpg> epgModels;
    public boolean is_disable;

    public class XCProgramViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        public android.widget.ImageView catch_image;
        public android.widget.TextView txt_live;
        public android.widget.TextView txt_program;
        public android.widget.TextView txt_program_description;
        public android.widget.TextView txt_time;

        public XCProgramViewHolder(@androidx.annotation.NonNull com.flextv.livestore.adapter.ProgramRecyclerAdapter r1, android.view.View r2) {
                r0 = this;
                r0.<init>(r2)
                r1 = 2131428350(0x7f0b03fe, float:1.8478342E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r0.txt_time = r1
                r1 = 2131428316(0x7f0b03dc, float:1.8478273E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r0.txt_live = r1
                r1 = 2131428333(0x7f0b03ed, float:1.8478308E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r0.txt_program = r1
                r1 = 2131428334(0x7f0b03ee, float:1.847831E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r0.txt_program_description = r1
                r1 = 2131427504(0x7f0b00b0, float:1.8476626E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                r0.catch_image = r1
                return
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$0R5UNT636hH5XOur6cFGr-uwgcE, reason: not valid java name */
    public static /* synthetic */ void m96$r8$lambda$0R5UNT636hH5XOur6cFGruwgcE(com.flextv.livestore.adapter.ProgramRecyclerAdapter r0, com.flextv.livestore.models.CatchUpEpg r1, int r2, android.view.View r3) {
            r0.lambda$onBindViewHolder$1(r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$95y582HNlJv04GmLcOVgdh9rKys(com.flextv.livestore.adapter.ProgramRecyclerAdapter r0, com.flextv.livestore.models.CatchUpEpg r1, int r2, com.flextv.livestore.adapter.ProgramRecyclerAdapter.XCProgramViewHolder r3, android.view.View r4, boolean r5) {
            r0.lambda$onBindViewHolder$0(r1, r2, r3, r4, r5)
            return
    }

    public ProgramRecyclerAdapter(android.content.Context r3, java.util.List<com.flextv.livestore.models.CatchUpEpg> r4, kotlin.jvm.functions.Function3<com.flextv.livestore.models.CatchUpEpg, java.lang.Integer, java.lang.Boolean, kotlin.Unit> r5) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.disabled_pos = r0
            r1 = 0
            r2.is_disable = r1
            r2.current_program_pos = r0
            r2.context = r3
            r2.epgModels = r4
            r2.clickFunctionListener = r5
            return
    }

    private /* synthetic */ void lambda$onBindViewHolder$0(com.flextv.livestore.models.CatchUpEpg r2, int r3, com.flextv.livestore.adapter.ProgramRecyclerAdapter.XCProgramViewHolder r4, android.view.View r5, boolean r6) {
            r1 = this;
            r5 = 8
            if (r6 == 0) goto L3b
            kotlin.jvm.functions.Function3<com.flextv.livestore.models.CatchUpEpg, java.lang.Integer, java.lang.Boolean, kotlin.Unit> r6 = r1.clickFunctionListener
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r6.invoke(r2, r3, r0)
            android.view.View r3 = r4.itemView
            r6 = 2131231123(0x7f080193, float:1.8078318E38)
            r3.setBackgroundResource(r6)
            android.widget.TextView r3 = r4.txt_program_description
            java.lang.String r6 = r2.getDescription()
            java.lang.String r6 = com.flextv.livestore.utils.Utils.decode64String(r6)
            r3.setText(r6)
            java.lang.String r2 = r2.getDescription()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L35
            android.widget.TextView r2 = r4.txt_program_description
            r3 = 0
            r2.setVisibility(r3)
            goto L4b
        L35:
            android.widget.TextView r2 = r4.txt_program_description
            r2.setVisibility(r5)
            goto L4b
        L3b:
            android.view.View r2 = r4.itemView
            java.lang.String r3 = "#00FFFFFF"
            int r3 = android.graphics.Color.parseColor(r3)
            r2.setBackgroundColor(r3)
            android.widget.TextView r2 = r4.txt_program_description
            r2.setVisibility(r5)
        L4b:
            return
    }

    private /* synthetic */ void lambda$onBindViewHolder$1(com.flextv.livestore.models.CatchUpEpg r2, int r3, android.view.View r4) {
            r1 = this;
            kotlin.jvm.functions.Function3<com.flextv.livestore.models.CatchUpEpg, java.lang.Integer, java.lang.Boolean, kotlin.Unit> r4 = r1.clickFunctionListener
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r4.invoke(r2, r3, r0)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
            r1 = this;
            java.util.List<com.flextv.livestore.models.CatchUpEpg> r0 = r1.epgModels
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
            com.flextv.livestore.adapter.ProgramRecyclerAdapter$XCProgramViewHolder r1 = (com.flextv.livestore.adapter.ProgramRecyclerAdapter.XCProgramViewHolder) r1
            r0.onBindViewHolder(r1, r2)
            return
    }

    public void onBindViewHolder(@androidx.annotation.NonNull com.flextv.livestore.adapter.ProgramRecyclerAdapter.XCProgramViewHolder r10, int r11) {
            r9 = this;
            java.util.List<com.flextv.livestore.models.CatchUpEpg> r0 = r9.epgModels
            java.lang.Object r0 = r0.get(r11)
            com.flextv.livestore.models.CatchUpEpg r0 = (com.flextv.livestore.models.CatchUpEpg) r0
            android.widget.TextView r1 = r10.txt_program
            java.lang.String r2 = r0.getTitle()
            java.lang.String r2 = com.flextv.livestore.utils.Utils.decode64String(r2)
            r1.setText(r2)
            android.widget.TextView r1 = r10.txt_time
            long r2 = r0.getStart_timestamp()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            android.content.Context r4 = r9.context
            java.lang.String r2 = com.flextv.livestore.utils.Utils.Offset(r2, r4)
            r1.setText(r2)
            int r1 = r0.getHas_archive()
            r2 = 0
            r3 = 8
            r4 = 1
            if (r1 != r4) goto L38
            android.widget.ImageView r1 = r10.catch_image
            r1.setVisibility(r2)
            goto L3d
        L38:
            android.widget.ImageView r1 = r10.catch_image
            r1.setVisibility(r3)
        L3d:
            int r1 = r9.current_program_pos
            if (r1 != r11) goto L47
            android.widget.TextView r1 = r10.txt_live
            r1.setVisibility(r2)
            goto L4c
        L47:
            android.widget.TextView r1 = r10.txt_live
            r1.setVisibility(r3)
        L4c:
            android.view.View r7 = r10.itemView
            com.flextv.livestore.adapter.CastRecyclerAdapter$$ExternalSyntheticLambda0 r8 = new com.flextv.livestore.adapter.CastRecyclerAdapter$$ExternalSyntheticLambda0
            r6 = 4
            r1 = r8
            r2 = r9
            r3 = r0
            r4 = r11
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            r7.setOnFocusChangeListener(r8)
            android.view.View r1 = r10.itemView
            com.flextv.livestore.adapter.VodRecyclerAdapter$$ExternalSyntheticLambda0 r2 = new com.flextv.livestore.adapter.VodRecyclerAdapter$$ExternalSyntheticLambda0
            r3 = 10
            r2.<init>(r9, r0, r11, r3)
            r1.setOnClickListener(r2)
            boolean r0 = r9.is_disable
            if (r0 == 0) goto L7c
            int r0 = r9.disabled_pos
            if (r11 != r0) goto L87
            android.view.View r10 = r10.itemView
            java.lang.String r11 = "#2e2f2f"
            int r11 = android.graphics.Color.parseColor(r11)
            r10.setBackgroundColor(r11)
            goto L87
        L7c:
            android.view.View r10 = r10.itemView
            java.lang.String r11 = "#00FFFFFF"
            int r11 = android.graphics.Color.parseColor(r11)
            r10.setBackgroundColor(r11)
        L87:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r1, int r2) {
            r0 = this;
            com.flextv.livestore.adapter.ProgramRecyclerAdapter$XCProgramViewHolder r1 = r0.onCreateViewHolder(r1, r2)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    public com.flextv.livestore.adapter.ProgramRecyclerAdapter.XCProgramViewHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r3, int r4) {
            r2 = this;
            com.flextv.livestore.adapter.ProgramRecyclerAdapter$XCProgramViewHolder r4 = new com.flextv.livestore.adapter.ProgramRecyclerAdapter$XCProgramViewHolder
            r0 = 2131624062(0x7f0e007e, float:1.8875293E38)
            r1 = 0
            android.view.View r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r0, r3, r1)
            r4.<init>(r2, r3)
            return r4
    }

    public void setCurrentProgramPosition(int r1) {
            r0 = this;
            r0.current_program_pos = r1
            r0.notifyItemChanged(r1)
            return
    }

    public void setFocusDisable(int r1, boolean r2) {
            r0 = this;
            r0.disabled_pos = r1
            r0.is_disable = r2
            r0.notifyItemChanged(r1)
            return
    }

    public void setProgramList(java.util.List<com.flextv.livestore.models.CatchUpEpg> r1) {
            r0 = this;
            r0.epgModels = r1
            r0.notifyDataSetChanged()
            return
    }
}
