package com.flextv.livestore.adapter;

/* JADX INFO: loaded from: classes.dex */
public class ConnectPlaylistAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.flextv.livestore.adapter.ConnectPlaylistAdapter.ConnectListViewHolder> {
    public kotlin.jvm.functions.Function3<com.flextv.livestore.apps.SideMenu, java.lang.Integer, java.lang.Boolean, kotlin.Unit> clickListenerFunction;
    public java.util.List<com.flextv.livestore.apps.SideMenu> data;

    public class ConnectListViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        public android.widget.TextView txt_name;

        public ConnectListViewHolder(@androidx.annotation.NonNull com.flextv.livestore.adapter.ConnectPlaylistAdapter r1, android.view.View r2) {
                r0 = this;
                r0.<init>(r2)
                r1 = 2131428324(0x7f0b03e4, float:1.847829E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r0.txt_name = r1
                return
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$yZBAYvGCMSPQic1wx-zbsjaAQIs, reason: not valid java name */
    public static /* synthetic */ void m92$r8$lambda$yZBAYvGCMSPQic1wxzbsjaAQIs(com.flextv.livestore.adapter.ConnectPlaylistAdapter r0, int r1, android.view.View r2) {
            r0.lambda$onBindViewHolder$0(r1, r2)
            return
    }

    public ConnectPlaylistAdapter(android.content.Context r1, java.util.List<com.flextv.livestore.apps.SideMenu> r2, kotlin.jvm.functions.Function3<com.flextv.livestore.apps.SideMenu, java.lang.Integer, java.lang.Boolean, kotlin.Unit> r3) {
            r0 = this;
            r0.<init>()
            r0.data = r2
            r0.clickListenerFunction = r3
            return
    }

    private /* synthetic */ void lambda$onBindViewHolder$0(int r3, android.view.View r4) {
            r2 = this;
            kotlin.jvm.functions.Function3<com.flextv.livestore.apps.SideMenu, java.lang.Integer, java.lang.Boolean, kotlin.Unit> r4 = r2.clickListenerFunction
            java.util.List<com.flextv.livestore.apps.SideMenu> r0 = r2.data
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
            java.util.List<com.flextv.livestore.apps.SideMenu> r0 = r1.data
            int r0 = r0.size()
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r1, int r2) {
            r0 = this;
            com.flextv.livestore.adapter.ConnectPlaylistAdapter$ConnectListViewHolder r1 = (com.flextv.livestore.adapter.ConnectPlaylistAdapter.ConnectListViewHolder) r1
            r0.onBindViewHolder(r1, r2)
            return
    }

    public void onBindViewHolder(@androidx.annotation.NonNull com.flextv.livestore.adapter.ConnectPlaylistAdapter.ConnectListViewHolder r3, int r4) {
            r2 = this;
            android.widget.TextView r0 = r3.txt_name
            java.util.List<com.flextv.livestore.apps.SideMenu> r1 = r2.data
            java.lang.Object r1 = r1.get(r4)
            com.flextv.livestore.apps.SideMenu r1 = (com.flextv.livestore.apps.SideMenu) r1
            java.lang.String r1 = r1.getName()
            r0.setText(r1)
            android.view.View r3 = r3.itemView
            com.flextv.livestore.adapter.SeasonRecyclerAdapter$$ExternalSyntheticLambda0 r0 = new com.flextv.livestore.adapter.SeasonRecyclerAdapter$$ExternalSyntheticLambda0
            r1 = 1
            r0.<init>(r2, r4, r1)
            r3.setOnClickListener(r0)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r1, int r2) {
            r0 = this;
            com.flextv.livestore.adapter.ConnectPlaylistAdapter$ConnectListViewHolder r1 = r0.onCreateViewHolder(r1, r2)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    public com.flextv.livestore.adapter.ConnectPlaylistAdapter.ConnectListViewHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r3, int r4) {
            r2 = this;
            com.flextv.livestore.adapter.ConnectPlaylistAdapter$ConnectListViewHolder r4 = new com.flextv.livestore.adapter.ConnectPlaylistAdapter$ConnectListViewHolder
            r0 = 2131624050(0x7f0e0072, float:1.8875269E38)
            r1 = 0
            android.view.View r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r0, r3, r1)
            r4.<init>(r2, r3)
            return r4
    }
}
