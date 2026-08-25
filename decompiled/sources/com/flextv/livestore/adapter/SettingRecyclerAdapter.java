package com.flextv.livestore.adapter;

/* JADX INFO: loaded from: classes.dex */
public class SettingRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.flextv.livestore.adapter.SettingRecyclerAdapter.SettingHolder> {
    public kotlin.jvm.functions.Function3<com.flextv.livestore.apps.SideMenu, java.lang.Integer, java.lang.Boolean, kotlin.Unit> clickFunctionListener;
    public java.util.List<com.flextv.livestore.apps.SideMenu> menu_list;
    public int update_position;

    /* JADX INFO: loaded from: classes2.dex */
    public class SettingHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        public android.widget.ImageView image_setting;
        public android.widget.ImageView image_update;
        public android.widget.TextView txt_setting;

        public SettingHolder(@javax.annotation.Nullable com.flextv.livestore.adapter.SettingRecyclerAdapter r1, android.view.View r2) {
                r0 = this;
                r0.<init>(r2)
                r1 = 2131427817(0x7f0b01e9, float:1.847726E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                r0.image_setting = r1
                r1 = 2131428344(0x7f0b03f8, float:1.847833E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r0.txt_setting = r1
                r1 = 2131427822(0x7f0b01ee, float:1.8477271E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                r0.image_update = r1
                return
        }
    }

    public static /* synthetic */ void $r8$lambda$95hbpMoNJ1c6eZdw2sQZZGDRlOk(com.flextv.livestore.adapter.SettingRecyclerAdapter r0, int r1, android.view.View r2, boolean r3) {
            r0.lambda$onBindViewHolder$0(r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$nYgMZG0xn4eRzNXUAX9_w2rKXdQ(com.flextv.livestore.adapter.SettingRecyclerAdapter r0, int r1, android.view.View r2) {
            r0.lambda$onBindViewHolder$1(r1, r2)
            return
    }

    public SettingRecyclerAdapter(android.content.Context r1, java.util.List<com.flextv.livestore.apps.SideMenu> r2, int r3, kotlin.jvm.functions.Function3<com.flextv.livestore.apps.SideMenu, java.lang.Integer, java.lang.Boolean, kotlin.Unit> r4) {
            r0 = this;
            r0.<init>()
            r0.menu_list = r2
            r0.clickFunctionListener = r4
            r0.update_position = r3
            return
    }

    private /* synthetic */ void lambda$onBindViewHolder$0(int r2, android.view.View r3, boolean r4) {
            r1 = this;
            if (r4 == 0) goto L15
            kotlin.jvm.functions.Function3<com.flextv.livestore.apps.SideMenu, java.lang.Integer, java.lang.Boolean, kotlin.Unit> r3 = r1.clickFunctionListener
            java.util.List<com.flextv.livestore.apps.SideMenu> r4 = r1.menu_list
            java.lang.Object r4 = r4.get(r2)
            com.flextv.livestore.apps.SideMenu r4 = (com.flextv.livestore.apps.SideMenu) r4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r3.invoke(r4, r2, r0)
        L15:
            return
    }

    private /* synthetic */ void lambda$onBindViewHolder$1(int r3, android.view.View r4) {
            r2 = this;
            kotlin.jvm.functions.Function3<com.flextv.livestore.apps.SideMenu, java.lang.Integer, java.lang.Boolean, kotlin.Unit> r4 = r2.clickFunctionListener
            java.util.List<com.flextv.livestore.apps.SideMenu> r0 = r2.menu_list
            java.lang.Object r0 = r0.get(r3)
            com.flextv.livestore.apps.SideMenu r0 = (com.flextv.livestore.apps.SideMenu) r0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r4.invoke(r0, r3, r1)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
            r1 = this;
            java.util.List<com.flextv.livestore.apps.SideMenu> r0 = r1.menu_list
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
    public /* bridge */ /* synthetic */ void onBindViewHolder(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r1, int r2) {
            r0 = this;
            com.flextv.livestore.adapter.SettingRecyclerAdapter$SettingHolder r1 = (com.flextv.livestore.adapter.SettingRecyclerAdapter.SettingHolder) r1
            r0.onBindViewHolder(r1, r2)
            return
    }

    public void onBindViewHolder(@androidx.annotation.NonNull com.flextv.livestore.adapter.SettingRecyclerAdapter.SettingHolder r3, int r4) {
            r2 = this;
            android.widget.ImageView r0 = r3.image_setting
            java.util.List<com.flextv.livestore.apps.SideMenu> r1 = r2.menu_list
            java.lang.Object r1 = r1.get(r4)
            com.flextv.livestore.apps.SideMenu r1 = (com.flextv.livestore.apps.SideMenu) r1
            int r1 = r1.getImage_url()
            r0.setImageResource(r1)
            android.widget.TextView r0 = r3.txt_setting
            java.util.List<com.flextv.livestore.apps.SideMenu> r1 = r2.menu_list
            java.lang.Object r1 = r1.get(r4)
            com.flextv.livestore.apps.SideMenu r1 = (com.flextv.livestore.apps.SideMenu) r1
            java.lang.String r1 = r1.getName()
            r0.setText(r1)
            int r0 = r2.update_position
            if (r0 <= 0) goto L2f
            if (r0 != r4) goto L2f
            android.widget.ImageView r0 = r3.image_update
            r1 = 0
            r0.setVisibility(r1)
            goto L36
        L2f:
            android.widget.ImageView r0 = r3.image_update
            r1 = 8
            r0.setVisibility(r1)
        L36:
            android.view.View r0 = r3.itemView
            com.flextv.livestore.adapter.SettingRecyclerAdapter$$ExternalSyntheticLambda0 r1 = new com.flextv.livestore.adapter.SettingRecyclerAdapter$$ExternalSyntheticLambda0
            r1.<init>(r2, r4)
            r0.setOnFocusChangeListener(r1)
            android.view.View r3 = r3.itemView
            com.flextv.livestore.adapter.SeasonRecyclerAdapter$$ExternalSyntheticLambda0 r0 = new com.flextv.livestore.adapter.SeasonRecyclerAdapter$$ExternalSyntheticLambda0
            r1 = 6
            r0.<init>(r2, r4, r1)
            r3.setOnClickListener(r0)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r1, int r2) {
            r0 = this;
            com.flextv.livestore.adapter.SettingRecyclerAdapter$SettingHolder r1 = r0.onCreateViewHolder(r1, r2)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    public com.flextv.livestore.adapter.SettingRecyclerAdapter.SettingHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r3, int r4) {
            r2 = this;
            com.flextv.livestore.adapter.SettingRecyclerAdapter$SettingHolder r4 = new com.flextv.livestore.adapter.SettingRecyclerAdapter$SettingHolder
            r0 = 2131624064(0x7f0e0080, float:1.8875297E38)
            r1 = 0
            android.view.View r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r0, r3, r1)
            r4.<init>(r2, r3)
            return r4
    }

    public void setSettingData(java.util.List<com.flextv.livestore.apps.SideMenu> r1) {
            r0 = this;
            r0.menu_list = r1
            r0.notifyDataSetChanged()
            return
    }
}
