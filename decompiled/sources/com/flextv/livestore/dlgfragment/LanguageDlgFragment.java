package com.flextv.livestore.dlgfragment;

/* JADX INFO: loaded from: classes2.dex */
public class LanguageDlgFragment extends androidx.fragment.app.DialogFragment {
    public com.flextv.livestore.adapter.LanguageRecyclerViewAdapter adapter;
    public android.widget.Button btn_cancel;
    public android.widget.Button btn_ok;
    public android.content.Context context;
    public java.util.List<com.flextv.livestore.models.LanguageModel> formatStrings;
    public com.flextv.livestore.dlgfragment.LanguageDlgFragment.ItemPositionListener listener;
    public androidx.recyclerview.widget.RecyclerView recyclerTimes;
    public int selected_position;
    public android.widget.TextView txt_header;
    public com.flextv.livestore.models.WordModels wordModels;

    /* JADX INFO: loaded from: classes.dex */
    public interface ItemPositionListener {
        void onItemPosition(int r1);
    }

    /* JADX INFO: renamed from: $r8$lambda$4EDtrfYeg8Hl-0ZZNqroj40dCto, reason: not valid java name */
    public static /* synthetic */ void m134$r8$lambda$4EDtrfYeg8Hl0ZZNqroj40dCto(com.flextv.livestore.dlgfragment.LanguageDlgFragment r0, android.view.View r1) {
            r0.lambda$onCreateView$1(r1)
            return
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Yltf7cgx5E4Yl28fmE6b3IuLhZo(com.flextv.livestore.dlgfragment.LanguageDlgFragment r0, java.lang.Integer r1, java.lang.Boolean r2) {
            kotlin.Unit r0 = r0.lambda$onCreateView$0(r1, r2)
            return r0
    }

    public static /* synthetic */ boolean $r8$lambda$do77KeZDooJX4zm9KlMoPOfRZwY(com.flextv.livestore.dlgfragment.LanguageDlgFragment r0, android.content.DialogInterface r1, int r2, android.view.KeyEvent r3) {
            boolean r0 = r0.lambda$onCreateView$3(r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$jxEO0PLjM-b1pMr7azy6qIVtITQ, reason: not valid java name */
    public static /* synthetic */ void m135$r8$lambda$jxEO0PLjMb1pMr7azy6qIVtITQ(com.flextv.livestore.dlgfragment.LanguageDlgFragment r0, android.view.View r1) {
            r0.lambda$onCreateView$2(r1)
            return
    }

    public LanguageDlgFragment() {
            r1 = this;
            r1.<init>()
            com.flextv.livestore.models.WordModels r0 = new com.flextv.livestore.models.WordModels
            r0.<init>()
            r1.wordModels = r0
            r0 = 0
            r1.selected_position = r0
            return
    }

    private /* synthetic */ kotlin.Unit lambda$onCreateView$0(java.lang.Integer r1, java.lang.Boolean r2) {
            r0 = this;
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto Lc
            int r1 = r1.intValue()
            r0.selected_position = r1
        Lc:
            r1 = 0
            return r1
    }

    private /* synthetic */ void lambda$onCreateView$1(android.view.View r2) {
            r1 = this;
            com.flextv.livestore.dlgfragment.LanguageDlgFragment$ItemPositionListener r2 = r1.listener
            int r0 = r1.selected_position
            r2.onItemPosition(r0)
            r1.dismiss()
            return
    }

    private /* synthetic */ void lambda$onCreateView$2(android.view.View r1) {
            r0 = this;
            r0.dismiss()
            return
    }

    private /* synthetic */ boolean lambda$onCreateView$3(android.content.DialogInterface r1, int r2, android.view.KeyEvent r3) {
            r0 = this;
            int r1 = r3.getAction()
            if (r1 != 0) goto L2c
            r1 = 21
            r3 = 1
            if (r2 == r1) goto L1e
            r1 = 22
            if (r2 == r1) goto L10
            goto L2c
        L10:
            androidx.recyclerview.widget.RecyclerView r1 = r0.recyclerTimes
            boolean r1 = r1.hasFocus()
            if (r1 == 0) goto L2c
            android.widget.Button r1 = r0.btn_cancel
            r1.requestFocus()
            return r3
        L1e:
            androidx.recyclerview.widget.RecyclerView r1 = r0.recyclerTimes
            boolean r1 = r1.hasFocus()
            if (r1 == 0) goto L2c
            android.widget.Button r1 = r0.btn_ok
            r1.requestFocus()
            return r3
        L2c:
            r1 = 0
            return r1
    }

    public static com.flextv.livestore.dlgfragment.LanguageDlgFragment newInstance(android.content.Context r1, java.util.List<com.flextv.livestore.models.LanguageModel> r2, int r3, com.flextv.livestore.dlgfragment.LanguageDlgFragment.ItemPositionListener r4) {
            com.flextv.livestore.dlgfragment.LanguageDlgFragment r0 = new com.flextv.livestore.dlgfragment.LanguageDlgFragment
            r0.<init>()
            r0.context = r1
            r0.formatStrings = r2
            r0.selected_position = r3
            r0.listener = r4
            return r0
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@androidx.annotation.Nullable android.os.Bundle r2) {
            r1 = this;
            super.onCreate(r2)
            r2 = 0
            r0 = 2132017470(0x7f14013e, float:1.967322E38)
            r1.setStyle(r2, r0)
            return
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater r6, android.view.ViewGroup r7, android.os.Bundle r8) {
            r5 = this;
            r8 = 2131624033(0x7f0e0061, float:1.8875234E38)
            r0 = 0
            android.view.View r6 = r6.inflate(r8, r7, r0)
            android.content.Context r7 = r5.context
            com.flextv.livestore.models.WordModels r7 = com.flextv.livestore.helper.GetSharedInfo.getWordModel(r7)
            r5.wordModels = r7
            r7 = 2131427478(0x7f0b0096, float:1.8476573E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.Button r7 = (android.widget.Button) r7
            r5.btn_ok = r7
            r7 = 2131427465(0x7f0b0089, float:1.8476547E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.Button r7 = (android.widget.Button) r7
            r5.btn_cancel = r7
            r7 = 2131428312(0x7f0b03d8, float:1.8478265E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r5.txt_header = r7
            r7 = 2131428073(0x7f0b02e9, float:1.847778E38)
            android.view.View r7 = r6.findViewById(r7)
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            r5.recyclerTimes = r7
            android.widget.Button r7 = r5.btn_ok
            com.flextv.livestore.models.WordModels r8 = r5.wordModels
            java.lang.String r8 = r8.getOk()
            r7.setText(r8)
            android.widget.Button r7 = r5.btn_cancel
            com.flextv.livestore.models.WordModels r8 = r5.wordModels
            java.lang.String r8 = r8.getCancel()
            r7.setText(r8)
            android.widget.TextView r7 = r5.txt_header
            com.flextv.livestore.models.WordModels r8 = r5.wordModels
            java.lang.String r8 = r8.getChange_language()
            r7.setText(r8)
            com.flextv.livestore.adapter.LanguageRecyclerViewAdapter r7 = new com.flextv.livestore.adapter.LanguageRecyclerViewAdapter
            android.content.Context r8 = r5.getContext()
            java.util.List<com.flextv.livestore.models.LanguageModel> r1 = r5.formatStrings
            int r2 = r5.selected_position
            com.flextv.livestore.dlgfragment.EpisodeDlgFragment$$ExternalSyntheticLambda1 r3 = new com.flextv.livestore.dlgfragment.EpisodeDlgFragment$$ExternalSyntheticLambda1
            r4 = 5
            r3.<init>(r5, r4)
            r7.<init>(r8, r1, r2, r3)
            r5.adapter = r7
            androidx.recyclerview.widget.RecyclerView r7 = r5.recyclerTimes
            androidx.recyclerview.widget.LinearLayoutManager r8 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r1 = r5.getContext()
            r8.<init>(r1)
            r7.setLayoutManager(r8)
            androidx.recyclerview.widget.RecyclerView r7 = r5.recyclerTimes
            r8 = 1
            r7.setHasFixedSize(r8)
            androidx.recyclerview.widget.RecyclerView r7 = r5.recyclerTimes
            com.flextv.livestore.adapter.LanguageRecyclerViewAdapter r1 = r5.adapter
            r7.setAdapter(r1)
            androidx.recyclerview.widget.RecyclerView r7 = r5.recyclerTimes
            int r1 = r5.selected_position
            r7.scrollToPosition(r1)
            androidx.recyclerview.widget.RecyclerView r7 = r5.recyclerTimes
            r7.requestFocus()
            android.widget.Button r7 = r5.btn_ok
            com.flextv.livestore.dlgfragment.LanguageDlgFragment$$ExternalSyntheticLambda0 r1 = new com.flextv.livestore.dlgfragment.LanguageDlgFragment$$ExternalSyntheticLambda0
            r1.<init>(r5, r0)
            r7.setOnClickListener(r1)
            android.widget.Button r7 = r5.btn_cancel
            com.flextv.livestore.dlgfragment.LanguageDlgFragment$$ExternalSyntheticLambda0 r0 = new com.flextv.livestore.dlgfragment.LanguageDlgFragment$$ExternalSyntheticLambda0
            r0.<init>(r5, r8)
            r7.setOnClickListener(r0)
            android.app.Dialog r7 = r5.getDialog()
            com.flextv.livestore.dlgfragment.ExitDlgFragment$$ExternalSyntheticLambda0 r8 = new com.flextv.livestore.dlgfragment.ExitDlgFragment$$ExternalSyntheticLambda0
            r8.<init>(r5, r4)
            r7.setOnKeyListener(r8)
            return r6
    }
}
