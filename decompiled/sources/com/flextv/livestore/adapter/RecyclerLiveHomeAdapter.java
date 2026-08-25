package com.flextv.livestore.adapter;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerLiveHomeAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.flextv.livestore.adapter.RecyclerLiveHomeAdapter.LiveHomeViewHolder> {
    public kotlin.jvm.functions.Function3<com.flextv.livestore.models.EPGChannel, java.lang.Integer, java.lang.Boolean, kotlin.Unit> clickFunctionListener;
    public android.content.Context context;
    public java.util.List<com.flextv.livestore.models.EPGChannel> epgChannels;

    public class LiveHomeViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        public android.widget.ImageView image_channel;
        public android.widget.ImageView image_logo;
        public android.widget.TextView txt_name;

        public LiveHomeViewHolder(@androidx.annotation.NonNull com.flextv.livestore.adapter.RecyclerLiveHomeAdapter r1, android.view.View r2) {
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
                r1 = 2131427805(0x7f0b01dd, float:1.8477237E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                r0.image_logo = r1
                return
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$9zoX_wsYyBcRLLVyJ-gnWzZ70mg, reason: not valid java name */
    public static /* synthetic */ void m98$r8$lambda$9zoX_wsYyBcRLLVyJgnWzZ70mg(com.flextv.livestore.adapter.RecyclerLiveHomeAdapter r0, com.flextv.livestore.models.EPGChannel r1, int r2, com.flextv.livestore.adapter.RecyclerLiveHomeAdapter.LiveHomeViewHolder r3, android.view.View r4, boolean r5) {
            r0.lambda$onBindViewHolder$0(r1, r2, r3, r4, r5)
            return
    }

    public static /* synthetic */ boolean $r8$lambda$DYROpOqq63jYpFmBZOKFrQnVdpQ(com.flextv.livestore.adapter.RecyclerLiveHomeAdapter r0, com.flextv.livestore.adapter.RecyclerLiveHomeAdapter.LiveHomeViewHolder r1, com.flextv.livestore.models.EPGChannel r2, int r3, android.view.View r4, android.view.MotionEvent r5) {
            boolean r0 = r0.lambda$onBindViewHolder$2(r1, r2, r3, r4, r5)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$eQMyOW5LjEXR6ZAV6IljoU1AzQc(com.flextv.livestore.adapter.RecyclerLiveHomeAdapter r0, com.flextv.livestore.models.EPGChannel r1, int r2, android.view.View r3) {
            r0.lambda$onBindViewHolder$1(r1, r2, r3)
            return
    }

    public RecyclerLiveHomeAdapter(android.content.Context r1, java.util.List<com.flextv.livestore.models.EPGChannel> r2, kotlin.jvm.functions.Function3<com.flextv.livestore.models.EPGChannel, java.lang.Integer, java.lang.Boolean, kotlin.Unit> r3) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            r0.epgChannels = r2
            r0.clickFunctionListener = r3
            return
    }

    private /* synthetic */ void lambda$onBindViewHolder$0(com.flextv.livestore.models.EPGChannel r1, int r2, com.flextv.livestore.adapter.RecyclerLiveHomeAdapter.LiveHomeViewHolder r3, android.view.View r4, boolean r5) {
            r0 = this;
            if (r5 == 0) goto L16
            kotlin.jvm.functions.Function3<com.flextv.livestore.models.EPGChannel, java.lang.Integer, java.lang.Boolean, kotlin.Unit> r4 = r0.clickFunctionListener
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r4.invoke(r1, r2, r5)
            android.view.View r1 = r3.itemView
            r2 = 2131231208(0x7f0801e8, float:1.807849E38)
            r1.setBackgroundResource(r2)
            goto L1e
        L16:
            android.view.View r1 = r3.itemView
            r2 = 2131231209(0x7f0801e9, float:1.8078493E38)
            r1.setBackgroundResource(r2)
        L1e:
            return
    }

    private /* synthetic */ void lambda$onBindViewHolder$1(com.flextv.livestore.models.EPGChannel r2, int r3, android.view.View r4) {
            r1 = this;
            kotlin.jvm.functions.Function3<com.flextv.livestore.models.EPGChannel, java.lang.Integer, java.lang.Boolean, kotlin.Unit> r4 = r1.clickFunctionListener
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r4.invoke(r2, r3, r0)
            return
    }

    private /* synthetic */ boolean lambda$onBindViewHolder$2(com.flextv.livestore.adapter.RecyclerLiveHomeAdapter.LiveHomeViewHolder r3, com.flextv.livestore.models.EPGChannel r4, int r5, android.view.View r6, android.view.MotionEvent r7) {
            r2 = this;
            int r6 = r7.getAction()
            r0 = 2131231209(0x7f0801e9, float:1.8078493E38)
            r1 = 3
            if (r6 != r1) goto Lf
            android.view.View r6 = r3.itemView
            r6.setBackgroundResource(r0)
        Lf:
            int r6 = r7.getAction()
            r1 = 1
            if (r6 != 0) goto L1f
            android.view.View r3 = r3.itemView
            r4 = 2131231208(0x7f0801e8, float:1.807849E38)
            r3.setBackgroundResource(r4)
            return r1
        L1f:
            int r6 = r7.getAction()
            if (r6 != r1) goto L35
            android.view.View r3 = r3.itemView
            r3.setBackgroundResource(r0)
            kotlin.jvm.functions.Function3<com.flextv.livestore.models.EPGChannel, java.lang.Integer, java.lang.Boolean, kotlin.Unit> r3 = r2.clickFunctionListener
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r3.invoke(r4, r5, r6)
        L35:
            r3 = 0
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
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    public /* bridge */ /* synthetic */ void onBindViewHolder(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r1, int r2) {
            r0 = this;
            com.flextv.livestore.adapter.RecyclerLiveHomeAdapter$LiveHomeViewHolder r1 = (com.flextv.livestore.adapter.RecyclerLiveHomeAdapter.LiveHomeViewHolder) r1
            r0.onBindViewHolder(r1, r2)
            return
    }

    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    public void onBindViewHolder(@androidx.annotation.NonNull com.flextv.livestore.adapter.RecyclerLiveHomeAdapter.LiveHomeViewHolder r10, int r11) {
            r9 = this;
            java.util.List<com.flextv.livestore.models.EPGChannel> r0 = r9.epgChannels
            java.lang.Object r0 = r0.get(r11)
            com.flextv.livestore.models.EPGChannel r0 = (com.flextv.livestore.models.EPGChannel) r0
            android.widget.TextView r1 = r10.txt_name
            java.lang.String r2 = r0.getName()
            r1.setText(r2)
            android.content.Context r1 = r9.context
            android.widget.ImageView r2 = r10.image_channel
            java.lang.String r3 = r0.getStream_icon()
            android.widget.ImageView r4 = r10.image_logo
            r5 = 2131231048(0x7f080148, float:1.8078166E38)
            com.flextv.livestore.utils.ImageLoaderJava.imageLoadUrlWithVodHolder(r1, r2, r3, r5, r4)
            android.view.View r7 = r10.itemView
            com.flextv.livestore.adapter.CastRecyclerAdapter$$ExternalSyntheticLambda0 r8 = new com.flextv.livestore.adapter.CastRecyclerAdapter$$ExternalSyntheticLambda0
            r6 = 7
            r1 = r8
            r2 = r9
            r3 = r0
            r4 = r11
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            r7.setOnFocusChangeListener(r8)
            android.view.View r1 = r10.itemView
            com.flextv.livestore.adapter.VodRecyclerAdapter$$ExternalSyntheticLambda0 r2 = new com.flextv.livestore.adapter.VodRecyclerAdapter$$ExternalSyntheticLambda0
            r3 = 13
            r2.<init>(r9, r0, r11, r3)
            r1.setOnClickListener(r2)
            android.view.View r7 = r10.itemView
            com.flextv.livestore.adapter.RecyclerVodHomeAdapter$$ExternalSyntheticLambda0 r8 = new com.flextv.livestore.adapter.RecyclerVodHomeAdapter$$ExternalSyntheticLambda0
            r6 = 1
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r0
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r7.setOnTouchListener(r8)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r1, int r2) {
            r0 = this;
            com.flextv.livestore.adapter.RecyclerLiveHomeAdapter$LiveHomeViewHolder r1 = r0.onCreateViewHolder(r1, r2)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    public com.flextv.livestore.adapter.RecyclerLiveHomeAdapter.LiveHomeViewHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r3, int r4) {
            r2 = this;
            com.flextv.livestore.adapter.RecyclerLiveHomeAdapter$LiveHomeViewHolder r4 = new com.flextv.livestore.adapter.RecyclerLiveHomeAdapter$LiveHomeViewHolder
            r0 = 2131624056(0x7f0e0078, float:1.887528E38)
            r1 = 0
            android.view.View r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r0, r3, r1)
            r4.<init>(r2, r3)
            return r4
    }

    public void setEpgChannels(java.util.List<com.flextv.livestore.models.EPGChannel> r1) {
            r0 = this;
            r0.epgChannels = r1
            r0.notifyDataSetChanged()
            return
    }
}
