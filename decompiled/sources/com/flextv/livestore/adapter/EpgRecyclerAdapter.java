package com.flextv.livestore.adapter;

/* JADX INFO: loaded from: classes2.dex */
public class EpgRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.flextv.livestore.adapter.EpgRecyclerAdapter.EpgViewHolder> {
    public android.content.Context context;
    public java.util.List<com.flextv.livestore.models.CatchUpEpg> epgList;

    public class EpgViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        public android.widget.TextView txt_name;
        public android.widget.TextView txt_time;

        public EpgViewHolder(@androidx.annotation.NonNull com.flextv.livestore.adapter.EpgRecyclerAdapter r1, android.view.View r2) {
                r0 = this;
                r0.<init>(r2)
                r1 = 2131428350(0x7f0b03fe, float:1.8478342E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r0.txt_time = r1
                r1 = 2131428324(0x7f0b03e4, float:1.847829E38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r0.txt_name = r1
                return
        }
    }

    public EpgRecyclerAdapter(android.content.Context r1, java.util.List<com.flextv.livestore.models.CatchUpEpg> r2) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            r0.epgList = r2
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
            r1 = this;
            java.util.List<com.flextv.livestore.models.CatchUpEpg> r0 = r1.epgList
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
            com.flextv.livestore.adapter.EpgRecyclerAdapter$EpgViewHolder r1 = (com.flextv.livestore.adapter.EpgRecyclerAdapter.EpgViewHolder) r1
            r0.onBindViewHolder(r1, r2)
            return
    }

    public void onBindViewHolder(@androidx.annotation.NonNull com.flextv.livestore.adapter.EpgRecyclerAdapter.EpgViewHolder r9, int r10) {
            r8 = this;
            java.util.List<com.flextv.livestore.models.CatchUpEpg> r0 = r8.epgList
            java.lang.Object r0 = r0.get(r10)
            com.flextv.livestore.models.CatchUpEpg r0 = (com.flextv.livestore.models.CatchUpEpg) r0
            android.widget.TextView r1 = r9.txt_name
            java.lang.String r2 = r0.getTitle()
            java.lang.String r2 = com.flextv.livestore.utils.Utils.decode64String(r2)
            r1.setText(r2)
            android.widget.TextView r1 = r9.txt_time     // Catch: java.lang.Exception -> L49
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L49
            r2.<init>()     // Catch: java.lang.Exception -> L49
            long r3 = r0.getStart_timestamp()     // Catch: java.lang.Exception -> L49
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r5
            android.content.Context r7 = r8.context     // Catch: java.lang.Exception -> L49
            java.lang.String r3 = com.flextv.livestore.utils.Utils.Offset(r3, r7)     // Catch: java.lang.Exception -> L49
            r2.append(r3)     // Catch: java.lang.Exception -> L49
            java.lang.String r3 = " ~ "
            r2.append(r3)     // Catch: java.lang.Exception -> L49
            long r3 = r0.getStop_timestamp()     // Catch: java.lang.Exception -> L49
            long r3 = r3 * r5
            android.content.Context r0 = r8.context     // Catch: java.lang.Exception -> L49
            java.lang.String r0 = com.flextv.livestore.utils.Utils.Offset(r3, r0)     // Catch: java.lang.Exception -> L49
            r2.append(r0)     // Catch: java.lang.Exception -> L49
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Exception -> L49
            r1.setText(r0)     // Catch: java.lang.Exception -> L49
            goto L4a
        L49:
        L4a:
            if (r10 != 0) goto L63
            android.widget.TextView r10 = r9.txt_name
            android.content.Context r0 = r8.context
            r1 = 2131100408(0x7f0602f8, float:1.7813197E38)
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r10)
            android.widget.TextView r10 = r9.txt_time
            android.content.Context r0 = r8.context
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r10)
            android.view.View r9 = r9.itemView
            r9.requestFocus()
            goto L74
        L63:
            android.widget.TextView r10 = r9.txt_name
            android.content.Context r0 = r8.context
            r1 = 2131100407(0x7f0602f7, float:1.7813195E38)
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r10)
            android.widget.TextView r9 = r9.txt_time
            android.content.Context r10 = r8.context
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r10, r1, r9)
        L74:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r1, int r2) {
            r0 = this;
            com.flextv.livestore.adapter.EpgRecyclerAdapter$EpgViewHolder r1 = r0.onCreateViewHolder(r1, r2)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    public com.flextv.livestore.adapter.EpgRecyclerAdapter.EpgViewHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r3, int r4) {
            r2 = this;
            com.flextv.livestore.adapter.EpgRecyclerAdapter$EpgViewHolder r4 = new com.flextv.livestore.adapter.EpgRecyclerAdapter$EpgViewHolder
            r0 = 2131624052(0x7f0e0074, float:1.8875273E38)
            r1 = 0
            android.view.View r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r0, r3, r1)
            r4.<init>(r2, r3)
            return r4
    }

    public void setEpgList(java.util.List<com.flextv.livestore.models.CatchUpEpg> r1) {
            r0 = this;
            r0.epgList = r1
            r0.notifyDataSetChanged()
            return
    }
}
