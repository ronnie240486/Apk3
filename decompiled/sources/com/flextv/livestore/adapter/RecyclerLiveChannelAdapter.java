package com.flextv.livestore.adapter;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerLiveChannelAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.flextv.livestore.adapter.RecyclerLiveChannelAdapter.LiveChannelViewHolder> {
    public kotlin.jvm.functions.Function4<com.flextv.livestore.models.EPGChannel, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, kotlin.Unit> clickFunctionListener;
    public android.content.Context context;
    public java.util.List<com.flextv.livestore.models.EPGChannel> epgChannels;
    public int selected_pos;

    /* JADX INFO: loaded from: classes2.dex */
    public static class LiveChannelViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        public android.widget.ImageView image_catch;
        public android.widget.ImageView image_channel;
        public android.widget.ImageView image_fav;
        public android.widget.ImageView image_lock;
        public android.widget.ImageView image_logo;
        public android.widget.TextView txt_name;
        public android.widget.TextView txt_num;

        public LiveChannelViewHolder(@androidx.annotation.NonNull android.view.View r2) {
                r1 = this;
                r1.<init>(r2)
                r0 = 2131428324(0x7f0b03e4, float:1.847829E38)
                android.view.View r0 = r2.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r1.txt_name = r0
                r0 = 2131428328(0x7f0b03e8, float:1.8478297E38)
                android.view.View r0 = r2.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r1.txt_num = r0
                r0 = 2131427788(0x7f0b01cc, float:1.8477202E38)
                android.view.View r0 = r2.findViewById(r0)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                r1.image_channel = r0
                r0 = 2131427805(0x7f0b01dd, float:1.8477237E38)
                android.view.View r0 = r2.findViewById(r0)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                r1.image_logo = r0
                r0 = 2131427798(0x7f0b01d6, float:1.8477222E38)
                android.view.View r0 = r2.findViewById(r0)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                r1.image_fav = r0
                r0 = 2131427786(0x7f0b01ca, float:1.8477198E38)
                android.view.View r0 = r2.findViewById(r0)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                r1.image_catch = r0
                r0 = 2131427804(0x7f0b01dc, float:1.8477235E38)
                android.view.View r2 = r2.findViewById(r0)
                android.widget.ImageView r2 = (android.widget.ImageView) r2
                r1.image_lock = r2
                return
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$9XDYmIQApLFpjcKJ8zp8K-vLKFE, reason: not valid java name */
    public static /* synthetic */ void m97$r8$lambda$9XDYmIQApLFpjcKJ8zp8KvLKFE(com.flextv.livestore.adapter.RecyclerLiveChannelAdapter r0, int r1, com.flextv.livestore.models.EPGChannel r2, android.view.View r3) {
            r0.lambda$onBindViewHolder$0(r1, r2, r3)
            return
    }

    public static /* synthetic */ boolean $r8$lambda$HCUmuTD8wuWxg4g3QCeOIFLb8Lo(com.flextv.livestore.adapter.RecyclerLiveChannelAdapter r0, com.flextv.livestore.models.EPGChannel r1, int r2, android.view.View r3) {
            boolean r0 = r0.lambda$onBindViewHolder$2(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$cDVzNLLvT_TvwGVVBqRsefzKU5c(com.flextv.livestore.adapter.RecyclerLiveChannelAdapter r0, com.flextv.livestore.adapter.RecyclerLiveChannelAdapter.LiveChannelViewHolder r1, com.flextv.livestore.models.EPGChannel r2, int r3, android.view.View r4, boolean r5) {
            r0.lambda$onBindViewHolder$1(r1, r2, r3, r4, r5)
            return
    }

    @android.annotation.SuppressLint({"NotifyDataSetChanged"})
    public RecyclerLiveChannelAdapter(android.content.Context r1, @androidx.annotation.Nullable java.util.List<com.flextv.livestore.models.EPGChannel> r2, int r3, kotlin.jvm.functions.Function4<com.flextv.livestore.models.EPGChannel, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, kotlin.Unit> r4) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            r0.epgChannels = r2
            r0.selected_pos = r3
            r0.clickFunctionListener = r4
            return
    }

    private /* synthetic */ void lambda$onBindViewHolder$0(int r3, com.flextv.livestore.models.EPGChannel r4, android.view.View r5) {
            r2 = this;
            int r5 = r2.selected_pos
            r2.selected_pos = r3
            r2.notifyItemChanged(r5)
            int r5 = r2.selected_pos
            r2.notifyItemChanged(r5)
            kotlin.jvm.functions.Function4<com.flextv.livestore.models.EPGChannel, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, kotlin.Unit> r5 = r2.clickFunctionListener
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r5.invoke(r4, r3, r0, r1)
            return
    }

    private /* synthetic */ void lambda$onBindViewHolder$1(com.flextv.livestore.adapter.RecyclerLiveChannelAdapter.LiveChannelViewHolder r1, com.flextv.livestore.models.EPGChannel r2, int r3, android.view.View r4, boolean r5) {
            r0 = this;
            if (r5 == 0) goto L16
            android.view.View r1 = r1.itemView
            r4 = 2131231123(0x7f080193, float:1.8078318E38)
            r1.setBackgroundResource(r4)
            kotlin.jvm.functions.Function4<com.flextv.livestore.models.EPGChannel, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, kotlin.Unit> r1 = r0.clickFunctionListener
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r1.invoke(r2, r3, r4, r4)
            goto L1e
        L16:
            android.view.View r1 = r1.itemView
            r2 = 2131099781(0x7f060085, float:1.7811925E38)
            r1.setBackgroundResource(r2)
        L1e:
            return
    }

    private /* synthetic */ boolean lambda$onBindViewHolder$2(com.flextv.livestore.models.EPGChannel r3, int r4, android.view.View r5) {
            r2 = this;
            kotlin.jvm.functions.Function4<com.flextv.livestore.models.EPGChannel, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, kotlin.Unit> r5 = r2.clickFunctionListener
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r5.invoke(r3, r4, r0, r1)
            r3 = 1
            return r3
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
    public /* bridge */ /* synthetic */ void onBindViewHolder(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r1, @android.annotation.SuppressLint({"RecyclerView"}) int r2) {
            r0 = this;
            com.flextv.livestore.adapter.RecyclerLiveChannelAdapter$LiveChannelViewHolder r1 = (com.flextv.livestore.adapter.RecyclerLiveChannelAdapter.LiveChannelViewHolder) r1
            r0.onBindViewHolder(r1, r2)
            return
    }

    public void onBindViewHolder(@androidx.annotation.NonNull com.flextv.livestore.adapter.RecyclerLiveChannelAdapter.LiveChannelViewHolder r10, @android.annotation.SuppressLint({"RecyclerView"}) int r11) {
            r9 = this;
            java.util.List<com.flextv.livestore.models.EPGChannel> r0 = r9.epgChannels
            java.lang.Object r0 = r0.get(r11)
            com.flextv.livestore.models.EPGChannel r0 = (com.flextv.livestore.models.EPGChannel) r0
            android.widget.TextView r1 = r10.txt_name
            java.lang.String r2 = r0.getName()
            r1.setText(r2)
            android.widget.TextView r1 = r10.txt_num
            java.lang.String r2 = r0.getNum()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.setText(r2)
            boolean r1 = r0.is_favorite()
            r2 = 0
            r3 = 8
            if (r1 == 0) goto L2d
            android.widget.ImageView r1 = r10.image_fav
            r1.setVisibility(r2)
            goto L32
        L2d:
            android.widget.ImageView r1 = r10.image_fav
            r1.setVisibility(r3)
        L32:
            boolean r1 = r0.is_locked()
            if (r1 == 0) goto L3e
            android.widget.ImageView r1 = r10.image_lock
            r1.setVisibility(r2)
            goto L43
        L3e:
            android.widget.ImageView r1 = r10.image_lock
            r1.setVisibility(r3)
        L43:
            java.lang.String r1 = r0.getTv_archive()
            java.lang.String r4 = "1"
            boolean r1 = r1.equalsIgnoreCase(r4)
            if (r1 == 0) goto L55
            android.widget.ImageView r1 = r10.image_catch
            r1.setVisibility(r2)
            goto L5a
        L55:
            android.widget.ImageView r1 = r10.image_catch
            r1.setVisibility(r3)
        L5a:
            android.content.Context r1 = r9.context
            android.widget.ImageView r2 = r10.image_channel
            java.lang.String r3 = r0.getStream_icon()
            r4 = 2131231224(0x7f0801f8, float:1.8078523E38)
            android.widget.ImageView r5 = r10.image_logo
            com.flextv.livestore.utils.ImageLoaderJava.imageLoadUrlWithVodHolder(r1, r2, r3, r4, r5)
            android.view.View r1 = r10.itemView
            com.flextv.livestore.adapter.VodRecyclerAdapter$$ExternalSyntheticLambda0 r2 = new com.flextv.livestore.adapter.VodRecyclerAdapter$$ExternalSyntheticLambda0
            r3 = 12
            r2.<init>(r9, r11, r0, r3)
            r1.setOnClickListener(r2)
            android.view.View r7 = r10.itemView
            com.flextv.livestore.adapter.CastRecyclerAdapter$$ExternalSyntheticLambda0 r8 = new com.flextv.livestore.adapter.CastRecyclerAdapter$$ExternalSyntheticLambda0
            r6 = 6
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r0
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r7.setOnFocusChangeListener(r8)
            android.view.View r1 = r10.itemView
            com.flextv.livestore.adapter.VodRecyclerAdapter$$ExternalSyntheticLambda2 r2 = new com.flextv.livestore.adapter.VodRecyclerAdapter$$ExternalSyntheticLambda2
            r3 = 2
            r2.<init>(r9, r0, r11, r3)
            r1.setOnLongClickListener(r2)
            int r0 = r9.selected_pos
            if (r0 != r11) goto La0
            android.widget.TextView r10 = r10.txt_name
            android.content.Context r11 = r9.context
            r0 = 2131100408(0x7f0602f8, float:1.7813197E38)
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r11, r0, r10)
            goto Laa
        La0:
            android.widget.TextView r10 = r10.txt_name
            android.content.Context r11 = r9.context
            r0 = 2131100407(0x7f0602f7, float:1.7813195E38)
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r11, r0, r10)
        Laa:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r1, int r2) {
            r0 = this;
            com.flextv.livestore.adapter.RecyclerLiveChannelAdapter$LiveChannelViewHolder r1 = r0.onCreateViewHolder(r1, r2)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    public com.flextv.livestore.adapter.RecyclerLiveChannelAdapter.LiveChannelViewHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r3, int r4) {
            r2 = this;
            com.flextv.livestore.adapter.RecyclerLiveChannelAdapter$LiveChannelViewHolder r4 = new com.flextv.livestore.adapter.RecyclerLiveChannelAdapter$LiveChannelViewHolder
            r0 = 2131624060(0x7f0e007c, float:1.887529E38)
            r1 = 0
            android.view.View r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r0, r3, r1)
            r4.<init>(r3)
            return r4
    }

    public void setSelectedPosition(int r1) {
            r0 = this;
            r0.selected_pos = r1
            r0.notifyDataSetChanged()
            return
    }

    public void updateData(java.util.List<com.flextv.livestore.models.EPGChannel> r1, int r2) {
            r0 = this;
            r0.epgChannels = r1
            r0.selected_pos = r2
            r0.notifyDataSetChanged()
            return
    }
}
