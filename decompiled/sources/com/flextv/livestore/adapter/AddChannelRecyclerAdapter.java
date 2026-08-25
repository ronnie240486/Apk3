package com.flextv.livestore.adapter;

/* JADX INFO: loaded from: classes3.dex */
public class AddChannelRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.flextv.livestore.adapter.AddChannelRecyclerAdapter.ChannelHolder> {
    public boolean[] checks;
    private kotlin.jvm.functions.Function3<com.flextv.livestore.models.EPGChannel, java.lang.Integer, java.lang.Boolean, kotlin.Unit> clickListenerFunction;
    public android.content.Context context;
    public java.util.List<com.flextv.livestore.models.EPGChannel> epgChannels;

    /* JADX INFO: loaded from: classes.dex */
    public class ChannelHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        public android.widget.ImageView image_channel;
        public android.widget.ImageView image_check;
        public android.widget.ImageView image_logo;
        public android.widget.ImageView image_round;
        public android.widget.TextView txt_name;

        public ChannelHolder(@javax.annotation.Nullable com.flextv.livestore.adapter.AddChannelRecyclerAdapter r1, android.view.View r2) {
                r0 = this;
                r0.<init>(r2)
                r1 = 2131428324(0x7f0b03e4, float:1.847829E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r0.txt_name = r1
                r1 = 2131427788(0x7f0b01cc, float:1.8477202E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                r0.image_channel = r1
                r1 = 2131427789(0x7f0b01cd, float:1.8477204E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                r0.image_check = r1
                r1 = 2131427814(0x7f0b01e6, float:1.8477255E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                r0.image_round = r1
                r1 = 2131427805(0x7f0b01dd, float:1.8477237E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                r0.image_logo = r1
                r1 = 2131428328(0x7f0b03e8, float:1.8478297E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                return
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$H5wj0WTme5g_Td-aqVmt02Rmp78, reason: not valid java name */
    public static /* synthetic */ void m90$r8$lambda$H5wj0WTme5g_TdaqVmt02Rmp78(com.flextv.livestore.adapter.AddChannelRecyclerAdapter r0, com.flextv.livestore.adapter.AddChannelRecyclerAdapter.ChannelHolder r1, int r2, android.view.View r3, boolean r4) {
            r0.lambda$onBindViewHolder$0(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ void $r8$lambda$ZVP0bfOUhJHVQDbxay_DormLY2Q(com.flextv.livestore.adapter.AddChannelRecyclerAdapter r0, int r1, com.flextv.livestore.models.EPGChannel r2, android.view.View r3) {
            r0.lambda$onBindViewHolder$1(r1, r2, r3)
            return
    }

    public AddChannelRecyclerAdapter(android.content.Context r1, java.util.List<com.flextv.livestore.models.EPGChannel> r2, boolean[] r3, kotlin.jvm.functions.Function3<com.flextv.livestore.models.EPGChannel, java.lang.Integer, java.lang.Boolean, kotlin.Unit> r4) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            r0.epgChannels = r2
            r0.clickListenerFunction = r4
            r0.checks = r3
            return
    }

    private /* synthetic */ void lambda$onBindViewHolder$0(com.flextv.livestore.adapter.AddChannelRecyclerAdapter.ChannelHolder r1, int r2, android.view.View r3, boolean r4) {
            r0 = this;
            r0.setBackground(r1, r2, r4)
            return
    }

    private /* synthetic */ void lambda$onBindViewHolder$1(int r3, com.flextv.livestore.models.EPGChannel r4, android.view.View r5) {
            r2 = this;
            r2.toggleChecked(r3)
            kotlin.jvm.functions.Function3<com.flextv.livestore.models.EPGChannel, java.lang.Integer, java.lang.Boolean, kotlin.Unit> r5 = r2.clickListenerFunction
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            boolean[] r1 = r2.checks
            boolean r3 = r1[r3]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r5.invoke(r4, r0, r3)
            return
    }

    private void setBackground(com.flextv.livestore.adapter.AddChannelRecyclerAdapter.ChannelHolder r2, int r3, boolean r4) {
            r1 = this;
            int r0 = r1.getItemCount()
            if (r3 < r0) goto L7
            return
        L7:
            if (r4 == 0) goto L18
            android.view.View r3 = r2.itemView
            r4 = 2131231123(0x7f080193, float:1.8078318E38)
            r3.setBackgroundResource(r4)
            android.widget.TextView r2 = r2.txt_name
            r3 = 1
            r2.setSelected(r3)
            goto L26
        L18:
            android.view.View r3 = r2.itemView
            r4 = 2131099781(0x7f060085, float:1.7811925E38)
            r3.setBackgroundResource(r4)
            android.widget.TextView r2 = r2.txt_name
            r3 = 0
            r2.setSelected(r3)
        L26:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
            r1 = this;
            java.util.List<com.flextv.livestore.models.EPGChannel> r0 = r1.epgChannels
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
            com.flextv.livestore.adapter.AddChannelRecyclerAdapter$ChannelHolder r1 = (com.flextv.livestore.adapter.AddChannelRecyclerAdapter.ChannelHolder) r1
            r0.onBindViewHolder(r1, r2)
            return
    }

    @android.annotation.SuppressLint({"SetTextI18n"})
    public void onBindViewHolder(@androidx.annotation.NonNull com.flextv.livestore.adapter.AddChannelRecyclerAdapter.ChannelHolder r7, @android.annotation.SuppressLint({"RecyclerView"}) int r8) {
            r6 = this;
            java.util.List<com.flextv.livestore.models.EPGChannel> r0 = r6.epgChannels
            java.lang.Object r0 = r0.get(r8)
            com.flextv.livestore.models.EPGChannel r0 = (com.flextv.livestore.models.EPGChannel) r0
            android.widget.ImageView r1 = r7.image_round
            r2 = 0
            r1.setVisibility(r2)
            boolean[] r1 = r6.checks
            boolean r1 = r1[r8]
            if (r1 == 0) goto L1c
            android.widget.ImageView r1 = r7.image_check
            r2 = 8
            r1.setVisibility(r2)
            goto L21
        L1c:
            android.widget.ImageView r1 = r7.image_check
            r1.setVisibility(r2)
        L21:
            android.content.Context r1 = r6.context
            android.widget.ImageView r2 = r7.image_channel
            java.lang.String r3 = r0.getStream_icon()
            r4 = 2131231048(0x7f080148, float:1.8078166E38)
            android.widget.ImageView r5 = r7.image_logo
            com.flextv.livestore.utils.ImageLoaderJava.imageLoadUrlWithVodHolder(r1, r2, r3, r4, r5)
            android.widget.TextView r1 = r7.txt_name
            java.lang.String r2 = r0.getName()
            r1.setText(r2)
            android.view.View r1 = r7.itemView
            com.flextv.livestore.adapter.VodRecyclerAdapter$$ExternalSyntheticLambda1 r2 = new com.flextv.livestore.adapter.VodRecyclerAdapter$$ExternalSyntheticLambda1
            r3 = 2
            r2.<init>(r6, r7, r8, r3)
            r1.setOnFocusChangeListener(r2)
            android.view.View r1 = r7.itemView
            boolean r1 = r1.isFocused()
            r6.setBackground(r7, r8, r1)
            android.view.View r7 = r7.itemView
            com.flextv.livestore.adapter.VodRecyclerAdapter$$ExternalSyntheticLambda0 r1 = new com.flextv.livestore.adapter.VodRecyclerAdapter$$ExternalSyntheticLambda0
            r1.<init>(r6, r8, r0, r3)
            r7.setOnClickListener(r1)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r1, int r2) {
            r0 = this;
            com.flextv.livestore.adapter.AddChannelRecyclerAdapter$ChannelHolder r1 = r0.onCreateViewHolder(r1, r2)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    public com.flextv.livestore.adapter.AddChannelRecyclerAdapter.ChannelHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r3, int r4) {
            r2 = this;
            com.flextv.livestore.adapter.AddChannelRecyclerAdapter$ChannelHolder r4 = new com.flextv.livestore.adapter.AddChannelRecyclerAdapter$ChannelHolder
            r0 = 2131624048(0x7f0e0070, float:1.8875265E38)
            r1 = 0
            android.view.View r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r0, r3, r1)
            r4.<init>(r2, r3)
            return r4
    }

    public void setChannelData(java.util.List<com.flextv.livestore.models.EPGChannel> r2, boolean[] r3) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.epgChannels = r0
            r1.checks = r3
            r1.notifyDataSetChanged()
            return
    }

    public void setFocusDisable(int r1, boolean r2) {
            r0 = this;
            r0.notifyItemChanged(r1)
            return
    }

    public void setSelectedItem(int r1) {
            r0 = this;
            r0.notifyItemChanged(r1)
            return
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
