package com.flextv.livestore.adapter;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class MyGroupRecyclerAdapter$$ExternalSyntheticLambda0 implements android.view.View.OnFocusChangeListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder f$0;

    public /* synthetic */ MyGroupRecyclerAdapter$$ExternalSyntheticLambda0(androidx.recyclerview.widget.RecyclerView.ViewHolder r1, int r2) {
            r0 = this;
            r0.$r8$classId = r2
            r0.f$0 = r1
            r0.<init>()
            return
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View r2, boolean r3) {
            r1 = this;
            int r0 = r1.$r8$classId
            switch(r0) {
                case 0: goto L1e;
                case 1: goto L16;
                case 2: goto Le;
                case 3: goto L6;
                default: goto L5;
            }
        L5:
            goto L26
        L6:
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r1.f$0
            com.flextv.livestore.adapter.LiveSortRecyclerAdapter$HideCategoryViewHolder r0 = (com.flextv.livestore.adapter.LiveSortRecyclerAdapter.HideCategoryViewHolder) r0
            com.flextv.livestore.adapter.LiveSortRecyclerAdapter.m93$r8$lambda$cz5eXvfMB31InRcsxtA4_9JQ3I(r0, r2, r3)
            return
        Le:
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r1.f$0
            com.flextv.livestore.adapter.LanguageRecyclerViewAdapter$HideCategoryViewHolder r0 = (com.flextv.livestore.adapter.LanguageRecyclerViewAdapter.HideCategoryViewHolder) r0
            com.flextv.livestore.adapter.LanguageRecyclerViewAdapter.$r8$lambda$_EcdomuiJu1mdUa_67z27JVgup8(r0, r2, r3)
            return
        L16:
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r1.f$0
            com.flextv.livestore.adapter.HideCategoryRecyclerViewAdapter$HideCategoryViewHolder r0 = (com.flextv.livestore.adapter.HideCategoryRecyclerViewAdapter.HideCategoryViewHolder) r0
            com.flextv.livestore.adapter.HideCategoryRecyclerViewAdapter.$r8$lambda$Aab0L3NT7JzuIbRiKoLPMmsG5a8(r0, r2, r3)
            return
        L1e:
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r1.f$0
            com.flextv.livestore.adapter.MyGroupRecyclerAdapter$CategoryListViewHolder r0 = (com.flextv.livestore.adapter.MyGroupRecyclerAdapter.CategoryListViewHolder) r0
            com.flextv.livestore.adapter.MyGroupRecyclerAdapter.$r8$lambda$NPXsEP8JPXXN2AfApOqu_a8Oowk(r0, r2, r3)
            return
        L26:
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r1.f$0
            com.flextv.livestore.adapter.SubtitleColorRecyclerAdapter$SubtitleColorViewHolder r0 = (com.flextv.livestore.adapter.SubtitleColorRecyclerAdapter.SubtitleColorViewHolder) r0
            com.flextv.livestore.adapter.SubtitleColorRecyclerAdapter.$r8$lambda$KTXnU92KBpSPDJto_baWHvt7nQk(r0, r2, r3)
            return
    }
}
