package com.flextv.livestore.adapter;

/* JADX INFO: loaded from: classes2.dex */
public class MyChannelRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.flextv.livestore.adapter.MyChannelRecyclerAdapter.ChannelHolder> {
    private java.util.List<java.lang.String> channelNames;
    private kotlin.jvm.functions.Function3<java.lang.String, java.lang.Integer, java.lang.Boolean, kotlin.Unit> clickListenerFunction;
    public android.content.Context context;
    public boolean is_parent;

    public class ChannelHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        public android.widget.ImageView image_channel;
        public android.widget.ImageView image_delete;
        public android.widget.ImageView image_logo;
        public android.widget.TextView txt_name;
        public android.widget.TextView txt_num;

        public ChannelHolder(@javax.annotation.Nullable com.flextv.livestore.adapter.MyChannelRecyclerAdapter r1, android.view.View r2) {
                r0 = this;
                r0.<init>(r2)
                r1 = 2131428328(0x7f0b03e8, float:1.8478297E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r0.txt_num = r1
                r1 = 2131428324(0x7f0b03e4, float:1.847829E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r0.txt_name = r1
                r1 = 2131427788(0x7f0b01cc, float:1.8477202E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                r0.image_channel = r1
                r1 = 2131427793(0x7f0b01d1, float:1.8477212E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                r0.image_delete = r1
                r1 = 2131427814(0x7f0b01e6, float:1.8477255E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                r1 = 2131427789(0x7f0b01cd, float:1.8477204E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                r1 = 2131427805(0x7f0b01dd, float:1.8477237E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                r0.image_logo = r1
                return
        }
    }

    public static /* synthetic */ void $r8$lambda$3KUMpfqlZNXaHLbJ1pqJ3X5rGto(com.flextv.livestore.adapter.MyChannelRecyclerAdapter r0, java.lang.String r1, int r2, android.view.View r3) {
            r0.lambda$onBindViewHolder$1(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$IgYJDI1_tBA62N5Hnw3_G-qwmbw, reason: not valid java name */
    public static /* synthetic */ void m95$r8$lambda$IgYJDI1_tBA62N5Hnw3_Gqwmbw(com.flextv.livestore.adapter.MyChannelRecyclerAdapter r0, com.flextv.livestore.adapter.MyChannelRecyclerAdapter.ChannelHolder r1, int r2, android.view.View r3, boolean r4) {
            r0.lambda$onBindViewHolder$0(r1, r2, r3, r4)
            return
    }

    public MyChannelRecyclerAdapter(android.content.Context r1, java.util.List<java.lang.String> r2, boolean r3, kotlin.jvm.functions.Function3<java.lang.String, java.lang.Integer, java.lang.Boolean, kotlin.Unit> r4) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            r0.channelNames = r2
            r0.is_parent = r3
            r0.clickListenerFunction = r4
            return
    }

    private /* synthetic */ void lambda$onBindViewHolder$0(com.flextv.livestore.adapter.MyChannelRecyclerAdapter.ChannelHolder r1, int r2, android.view.View r3, boolean r4) {
            r0 = this;
            r0.setBackground(r1, r2, r4)
            return
    }

    private /* synthetic */ void lambda$onBindViewHolder$1(java.lang.String r2, int r3, android.view.View r4) {
            r1 = this;
            kotlin.jvm.functions.Function3<java.lang.String, java.lang.Integer, java.lang.Boolean, kotlin.Unit> r4 = r1.clickListenerFunction
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r4.invoke(r2, r3, r0)
            return
    }

    private void setBackground(com.flextv.livestore.adapter.MyChannelRecyclerAdapter.ChannelHolder r5, int r6, boolean r7) {
            r4 = this;
            int r0 = r4.getItemCount()
            if (r6 < r0) goto L7
            return
        L7:
            java.util.List<java.lang.String> r0 = r4.channelNames
            java.lang.Object r0 = r0.get(r6)
            java.lang.String r0 = (java.lang.String) r0
            android.widget.TextView r1 = r5.txt_num
            r2 = 0
            r1.setVisibility(r2)
            android.widget.TextView r1 = r5.txt_num
            int r3 = r6 + 1
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r1.setText(r3)
            if (r7 == 0) goto L45
            kotlin.jvm.functions.Function3<java.lang.String, java.lang.Integer, java.lang.Boolean, kotlin.Unit> r7 = r4.clickListenerFunction
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r7.invoke(r0, r6, r1)
            android.view.View r6 = r5.itemView
            r7 = 2131231123(0x7f080193, float:1.8078318E38)
            r6.setBackgroundResource(r7)
            android.widget.TextView r6 = r5.txt_name
            r7 = 1
            r6.setSelected(r7)
            boolean r6 = r4.is_parent
            if (r6 != 0) goto L59
            android.widget.ImageView r5 = r5.image_delete
            r5.setVisibility(r2)
            goto L59
        L45:
            android.view.View r6 = r5.itemView
            r7 = 2131099781(0x7f060085, float:1.7811925E38)
            r6.setBackgroundResource(r7)
            android.widget.TextView r6 = r5.txt_name
            r6.setSelected(r2)
            android.widget.ImageView r5 = r5.image_delete
            r6 = 8
            r5.setVisibility(r6)
        L59:
            return
    }

    private void setChannels(java.util.List<java.lang.String> r1, boolean r2) {
            r0 = this;
            if (r2 == 0) goto Ld
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            java.util.List<java.lang.String> r1 = r0.channelNames
            r1.addAll(r2)
            goto L14
        Ld:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            r0.channelNames = r2
        L14:
            r0.notifyDataSetChanged()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.channelNames
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.size()
        La:
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
            com.flextv.livestore.adapter.MyChannelRecyclerAdapter$ChannelHolder r1 = (com.flextv.livestore.adapter.MyChannelRecyclerAdapter.ChannelHolder) r1
            r0.onBindViewHolder(r1, r2)
            return
    }

    @android.annotation.SuppressLint({"SetTextI18n"})
    public void onBindViewHolder(@androidx.annotation.NonNull com.flextv.livestore.adapter.MyChannelRecyclerAdapter.ChannelHolder r8, @android.annotation.SuppressLint({"RecyclerView"}) int r9) {
            r7 = this;
            java.util.List<java.lang.String> r0 = r7.channelNames
            java.lang.Object r0 = r0.get(r9)
            java.lang.String r0 = (java.lang.String) r0
            com.flextv.livestore.helper.RealmController r1 = com.flextv.livestore.helper.RealmController.with()
            com.flextv.livestore.models.EPGChannel r1 = r1.getEpgChannelByName(r0)
            android.content.Context r2 = r7.context
            android.widget.ImageView r3 = r8.image_channel
            java.lang.String r4 = r1.getStream_icon()
            android.widget.ImageView r5 = r8.image_logo
            r6 = 2131231048(0x7f080148, float:1.8078166E38)
            com.flextv.livestore.utils.ImageLoaderJava.imageLoadUrlWithVodHolder(r2, r3, r4, r6, r5)
            android.widget.TextView r2 = r8.txt_name
            java.lang.String r1 = r1.getName()
            r2.setText(r1)
            android.view.View r1 = r8.itemView
            com.flextv.livestore.adapter.VodRecyclerAdapter$$ExternalSyntheticLambda1 r2 = new com.flextv.livestore.adapter.VodRecyclerAdapter$$ExternalSyntheticLambda1
            r3 = 4
            r2.<init>(r7, r8, r9, r3)
            r1.setOnFocusChangeListener(r2)
            android.view.View r1 = r8.itemView
            boolean r1 = r1.isFocused()
            r7.setBackground(r8, r9, r1)
            android.view.View r8 = r8.itemView
            com.flextv.livestore.adapter.VodRecyclerAdapter$$ExternalSyntheticLambda0 r1 = new com.flextv.livestore.adapter.VodRecyclerAdapter$$ExternalSyntheticLambda0
            r2 = 8
            r1.<init>(r7, r0, r9, r2)
            r8.setOnClickListener(r1)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r1, int r2) {
            r0 = this;
            com.flextv.livestore.adapter.MyChannelRecyclerAdapter$ChannelHolder r1 = r0.onCreateViewHolder(r1, r2)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    public com.flextv.livestore.adapter.MyChannelRecyclerAdapter.ChannelHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r3, int r4) {
            r2 = this;
            com.flextv.livestore.adapter.MyChannelRecyclerAdapter$ChannelHolder r4 = new com.flextv.livestore.adapter.MyChannelRecyclerAdapter$ChannelHolder
            r0 = 2131624048(0x7f0e0070, float:1.8875265E38)
            r1 = 0
            android.view.View r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r0, r3, r1)
            r4.<init>(r2, r3)
            return r4
    }

    public void setChannelData(java.util.List<java.lang.String> r1, boolean r2) {
            r0 = this;
            r0.setChannels(r1, r2)
            return
    }
}
