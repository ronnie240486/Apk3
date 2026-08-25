package com.flextv.livestore.adapter;

/* JADX INFO: loaded from: classes2.dex */
public class PortalRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    public java.util.List<com.flextv.livestore.models.AppInfoModel.UrlModel> channels;
    public kotlin.jvm.functions.Function3<com.flextv.livestore.models.AppInfoModel.UrlModel, java.lang.Integer, java.lang.Boolean, kotlin.Unit> clickeListenerFunction;
    public int playlist_position;
    public com.flextv.livestore.models.WordModels wordModels;

    public class AddViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private android.widget.TextView txt_name;

        public AddViewHolder(@androidx.annotation.NonNull com.flextv.livestore.adapter.PortalRecyclerAdapter r1, android.view.View r2) {
                r0 = this;
                r0.<init>(r2)
                r1 = 2131428324(0x7f0b03e4, float:1.847829E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r0.txt_name = r1
                return
        }

        public static /* synthetic */ android.widget.TextView access$000(com.flextv.livestore.adapter.PortalRecyclerAdapter.AddViewHolder r0) {
                android.widget.TextView r0 = r0.txt_name
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public class PlaylistHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        public android.widget.TextView txt_connected;
        public android.widget.TextView txt_name;
        public android.widget.TextView txt_url;

        public PlaylistHolder(@androidx.annotation.NonNull com.flextv.livestore.adapter.PortalRecyclerAdapter r1, android.view.View r2) {
                r0 = this;
                r0.<init>(r2)
                r1 = 2131428324(0x7f0b03e4, float:1.847829E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r0.txt_name = r1
                r1 = 2131428352(0x7f0b0400, float:1.8478346E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r0.txt_url = r1
                r1 = 2131428293(0x7f0b03c5, float:1.8478226E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r0.txt_connected = r1
                return
        }
    }

    public static /* synthetic */ void $r8$lambda$IRYx9w9gbOWYqOLrqe4V3RG4Qes(com.flextv.livestore.adapter.PortalRecyclerAdapter r0, int r1, android.view.View r2) {
            r0.lambda$onBindViewHolder$0(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$UgAcVxjeejnBnnG9oyqvJfOLGkM(com.flextv.livestore.adapter.PortalRecyclerAdapter r0, int r1, androidx.recyclerview.widget.RecyclerView.ViewHolder r2, android.view.View r3, boolean r4) {
            r0.lambda$onBindViewHolder$1(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ void $r8$lambda$YX6ImhbT4RDSOlgrjecbSf9IM0A(com.flextv.livestore.adapter.PortalRecyclerAdapter r0, int r1, androidx.recyclerview.widget.RecyclerView.ViewHolder r2, android.view.View r3, boolean r4) {
            r0.lambda$onBindViewHolder$3(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ void $r8$lambda$lBJdNgOwWN08PgmGPq7tr36XaLU(com.flextv.livestore.adapter.PortalRecyclerAdapter r0, int r1, android.view.View r2) {
            r0.lambda$onBindViewHolder$2(r1, r2)
            return
    }

    public PortalRecyclerAdapter(java.util.List<com.flextv.livestore.models.AppInfoModel.UrlModel> r2, android.content.Context r3, int r4, kotlin.jvm.functions.Function3<com.flextv.livestore.models.AppInfoModel.UrlModel, java.lang.Integer, java.lang.Boolean, kotlin.Unit> r5) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.playlist_position = r0
            com.flextv.livestore.models.WordModels r0 = new com.flextv.livestore.models.WordModels
            r0.<init>()
            r1.wordModels = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.channels = r0
            r1.clickeListenerFunction = r5
            r1.playlist_position = r4
            com.flextv.livestore.models.WordModels r2 = com.flextv.livestore.helper.GetSharedInfo.getWordModel(r3)
            r1.wordModels = r2
            return
    }

    private /* synthetic */ void lambda$onBindViewHolder$0(int r3, android.view.View r4) {
            r2 = this;
            kotlin.jvm.functions.Function3<com.flextv.livestore.models.AppInfoModel$UrlModel, java.lang.Integer, java.lang.Boolean, kotlin.Unit> r4 = r2.clickeListenerFunction
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1 = 0
            r4.invoke(r1, r3, r0)
            return
    }

    private /* synthetic */ void lambda$onBindViewHolder$1(int r2, androidx.recyclerview.widget.RecyclerView.ViewHolder r3, android.view.View r4, boolean r5) {
            r1 = this;
            if (r5 == 0) goto L1b
            kotlin.jvm.functions.Function3<com.flextv.livestore.models.AppInfoModel$UrlModel, java.lang.Integer, java.lang.Boolean, kotlin.Unit> r4 = r1.clickeListenerFunction
            r5 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r4.invoke(r5, r2, r0)
            android.view.View r2 = r3.itemView
            r4 = 1065353216(0x3f800000, float:1.0)
            r2.setScaleX(r4)
            android.view.View r2 = r3.itemView
            r2.setScaleY(r4)
            goto L28
        L1b:
            android.view.View r2 = r3.itemView
            r4 = 1063675494(0x3f666666, float:0.9)
            r2.setScaleX(r4)
            android.view.View r2 = r3.itemView
            r2.setScaleY(r4)
        L28:
            return
    }

    private /* synthetic */ void lambda$onBindViewHolder$2(int r3, android.view.View r4) {
            r2 = this;
            kotlin.jvm.functions.Function3<com.flextv.livestore.models.AppInfoModel$UrlModel, java.lang.Integer, java.lang.Boolean, kotlin.Unit> r4 = r2.clickeListenerFunction
            java.util.List<com.flextv.livestore.models.AppInfoModel$UrlModel> r0 = r2.channels
            java.lang.Object r0 = r0.get(r3)
            com.flextv.livestore.models.AppInfoModel$UrlModel r0 = (com.flextv.livestore.models.AppInfoModel.UrlModel) r0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r4.invoke(r0, r3, r1)
            return
    }

    private /* synthetic */ void lambda$onBindViewHolder$3(int r2, androidx.recyclerview.widget.RecyclerView.ViewHolder r3, android.view.View r4, boolean r5) {
            r1 = this;
            if (r5 == 0) goto L1b
            kotlin.jvm.functions.Function3<com.flextv.livestore.models.AppInfoModel$UrlModel, java.lang.Integer, java.lang.Boolean, kotlin.Unit> r4 = r1.clickeListenerFunction
            r5 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r4.invoke(r5, r2, r0)
            android.view.View r2 = r3.itemView
            r4 = 1065353216(0x3f800000, float:1.0)
            r2.setScaleX(r4)
            android.view.View r2 = r3.itemView
            r2.setScaleY(r4)
            goto L28
        L1b:
            android.view.View r2 = r3.itemView
            r4 = 1063675494(0x3f666666, float:0.9)
            r2.setScaleX(r4)
            android.view.View r2 = r3.itemView
            r2.setScaleY(r4)
        L28:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
            r1 = this;
            java.util.List<com.flextv.livestore.models.AppInfoModel$UrlModel> r0 = r1.channels
            if (r0 != 0) goto L6
            r0 = 0
            goto Lc
        L6:
            int r0 = r0.size()
            int r0 = r0 + 1
        Lc:
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int r2) {
            r1 = this;
            java.util.List<com.flextv.livestore.models.AppInfoModel$UrlModel> r0 = r1.channels
            int r0 = r0.size()
            if (r2 != r0) goto La
            r2 = 0
            return r2
        La:
            r2 = 1
            return r2
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r6, int r7) {
            r5 = this;
            int r0 = r6.getItemViewType()
            r1 = 0
            if (r0 == 0) goto L73
            r2 = 1
            if (r0 == r2) goto Lc
            goto L97
        Lc:
            r0 = r6
            com.flextv.livestore.adapter.PortalRecyclerAdapter$PlaylistHolder r0 = (com.flextv.livestore.adapter.PortalRecyclerAdapter.PlaylistHolder) r0
            java.util.List<com.flextv.livestore.models.AppInfoModel$UrlModel> r3 = r5.channels
            java.lang.Object r3 = r3.get(r7)
            com.flextv.livestore.models.AppInfoModel$UrlModel r3 = (com.flextv.livestore.models.AppInfoModel.UrlModel) r3
            java.lang.String r3 = r3.getIs_protected()
            java.lang.String r4 = "1"
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L2b
            android.widget.TextView r3 = r0.txt_url
            java.lang.String r4 = "Protected"
            r3.setText(r4)
            goto L3c
        L2b:
            android.widget.TextView r3 = r0.txt_url
            java.util.List<com.flextv.livestore.models.AppInfoModel$UrlModel> r4 = r5.channels
            java.lang.Object r4 = r4.get(r7)
            com.flextv.livestore.models.AppInfoModel$UrlModel r4 = (com.flextv.livestore.models.AppInfoModel.UrlModel) r4
            java.lang.String r4 = r4.getUrl()
            r3.setText(r4)
        L3c:
            android.widget.TextView r3 = r0.txt_name
            java.util.List<com.flextv.livestore.models.AppInfoModel$UrlModel> r4 = r5.channels
            java.lang.Object r4 = r4.get(r7)
            com.flextv.livestore.models.AppInfoModel$UrlModel r4 = (com.flextv.livestore.models.AppInfoModel.UrlModel) r4
            java.lang.String r4 = r4.getName()
            r3.setText(r4)
            int r3 = r5.playlist_position
            if (r3 != r7) goto L57
            android.widget.TextView r3 = r0.txt_connected
            r3.setVisibility(r1)
            goto L5e
        L57:
            android.widget.TextView r1 = r0.txt_connected
            r3 = 8
            r1.setVisibility(r3)
        L5e:
            android.view.View r1 = r0.itemView
            com.flextv.livestore.adapter.PortalRecyclerAdapter$$ExternalSyntheticLambda0 r3 = new com.flextv.livestore.adapter.PortalRecyclerAdapter$$ExternalSyntheticLambda0
            r3.<init>(r5, r7, r2)
            r1.setOnClickListener(r3)
            android.view.View r0 = r0.itemView
            com.flextv.livestore.adapter.PortalRecyclerAdapter$$ExternalSyntheticLambda1 r1 = new com.flextv.livestore.adapter.PortalRecyclerAdapter$$ExternalSyntheticLambda1
            r1.<init>(r5, r7, r6, r2)
            r0.setOnFocusChangeListener(r1)
            goto L97
        L73:
            r0 = r6
            com.flextv.livestore.adapter.PortalRecyclerAdapter$AddViewHolder r0 = (com.flextv.livestore.adapter.PortalRecyclerAdapter.AddViewHolder) r0
            android.widget.TextView r2 = com.flextv.livestore.adapter.PortalRecyclerAdapter.AddViewHolder.access$000(r0)
            com.flextv.livestore.models.WordModels r3 = r5.wordModels
            java.lang.String r3 = r3.getAdd_playlist()
            r2.setText(r3)
            android.view.View r2 = r0.itemView
            com.flextv.livestore.adapter.PortalRecyclerAdapter$$ExternalSyntheticLambda0 r3 = new com.flextv.livestore.adapter.PortalRecyclerAdapter$$ExternalSyntheticLambda0
            r3.<init>(r5, r7, r1)
            r2.setOnClickListener(r3)
            android.view.View r0 = r0.itemView
            com.flextv.livestore.adapter.PortalRecyclerAdapter$$ExternalSyntheticLambda1 r2 = new com.flextv.livestore.adapter.PortalRecyclerAdapter$$ExternalSyntheticLambda1
            r2.<init>(r5, r7, r6, r1)
            r0.setOnFocusChangeListener(r2)
        L97:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r3, int r4) {
            r2 = this;
            r0 = 0
            if (r4 != 0) goto L10
            com.flextv.livestore.adapter.PortalRecyclerAdapter$AddViewHolder r4 = new com.flextv.livestore.adapter.PortalRecyclerAdapter$AddViewHolder
            r1 = 2131624196(0x7f0e0104, float:1.8875565E38)
            android.view.View r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r1, r3, r0)
            r4.<init>(r2, r3)
            return r4
        L10:
            com.flextv.livestore.adapter.PortalRecyclerAdapter$PlaylistHolder r4 = new com.flextv.livestore.adapter.PortalRecyclerAdapter$PlaylistHolder
            r1 = 2131624195(0x7f0e0103, float:1.8875563E38)
            android.view.View r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r1, r3, r0)
            r4.<init>(r2, r3)
            return r4
    }

    public void setData(java.util.List<com.flextv.livestore.models.AppInfoModel.UrlModel> r1) {
            r0 = this;
            r0.channels = r1
            r0.notifyDataSetChanged()
            return
    }
}
