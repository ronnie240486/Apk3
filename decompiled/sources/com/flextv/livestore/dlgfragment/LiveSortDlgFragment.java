package com.flextv.livestore.dlgfragment;

/* JADX INFO: loaded from: classes.dex */
public class LiveSortDlgFragment extends androidx.fragment.app.DialogFragment {
    public com.flextv.livestore.adapter.LiveSortRecyclerAdapter adapter;
    public android.widget.Button btn_cancel;
    public android.widget.Button btn_ok;
    public android.content.Context context;
    public java.util.List<java.lang.String> formatStrings;
    public java.lang.String header;
    public com.flextv.livestore.dlgfragment.LiveSortDlgFragment.ItemPositionListener listener;
    public androidx.recyclerview.widget.RecyclerView recyclerTimes;
    public int selected_position;
    public android.widget.TextView txt_header;
    public com.flextv.livestore.models.WordModels wordModels;

    public interface ItemPositionListener {
        void onItemPosition(int r1);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4KCL4dbNdi60ahjH1tXpLB9jw8k(com.flextv.livestore.dlgfragment.LiveSortDlgFragment r0, java.lang.Integer r1, java.lang.Boolean r2) {
            kotlin.Unit r0 = r0.lambda$onCreateView$0(r1, r2)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$7rN84P0mJbP1hIRWpibKY71hN5Y(com.flextv.livestore.dlgfragment.LiveSortDlgFragment r0, android.view.View r1) {
            r0.lambda$onCreateView$1(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$YEmyqGFbhVOi2LSl2yN5l7nELSg(com.flextv.livestore.dlgfragment.LiveSortDlgFragment r0, android.view.View r1) {
            r0.lambda$onCreateView$2(r1)
            return
    }

    public LiveSortDlgFragment() {
            r1 = this;
            r1.<init>()
            com.flextv.livestore.models.WordModels r0 = new com.flextv.livestore.models.WordModels
            r0.<init>()
            r1.wordModels = r0
            r0 = 0
            r1.selected_position = r0
            java.lang.String r0 = ""
            r1.header = r0
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
            com.flextv.livestore.dlgfragment.LiveSortDlgFragment$ItemPositionListener r2 = r1.listener
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

    public static com.flextv.livestore.dlgfragment.LiveSortDlgFragment newInstance(android.content.Context r1, java.util.List<java.lang.String> r2, int r3, java.lang.String r4, com.flextv.livestore.dlgfragment.LiveSortDlgFragment.ItemPositionListener r5) {
            com.flextv.livestore.dlgfragment.LiveSortDlgFragment r0 = new com.flextv.livestore.dlgfragment.LiveSortDlgFragment
            r0.<init>()
            r0.context = r1
            r0.formatStrings = r2
            r0.selected_position = r3
            r0.listener = r5
            r0.header = r4
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
            r8 = 2131624034(0x7f0e0062, float:1.8875236E38)
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
            java.lang.String r8 = r5.header
            r7.setText(r8)
            com.flextv.livestore.adapter.LiveSortRecyclerAdapter r7 = new com.flextv.livestore.adapter.LiveSortRecyclerAdapter
            android.content.Context r8 = r5.getContext()
            java.util.List<java.lang.String> r1 = r5.formatStrings
            int r2 = r5.selected_position
            com.flextv.livestore.dlgfragment.EpisodeDlgFragment$$ExternalSyntheticLambda1 r3 = new com.flextv.livestore.dlgfragment.EpisodeDlgFragment$$ExternalSyntheticLambda1
            r4 = 6
            r3.<init>(r5, r4)
            r7.<init>(r8, r1, r2, r3)
            r5.adapter = r7
            androidx.recyclerview.widget.RecyclerView r7 = r5.recyclerTimes
            androidx.recyclerview.widget.LinearLayoutManager r8 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r1 = r5.getContext()
            r8.<init>(r1)
            r7.setLayoutManager(r8)
            androidx.recyclerview.widget.RecyclerView r7 = r5.recyclerTimes
            com.flextv.livestore.adapter.LiveSortRecyclerAdapter r8 = r5.adapter
            r7.setAdapter(r8)
            androidx.recyclerview.widget.RecyclerView r7 = r5.recyclerTimes
            int r8 = r5.selected_position
            r7.smoothScrollToPosition(r8)
            androidx.recyclerview.widget.RecyclerView r7 = r5.recyclerTimes
            r7.requestFocus()
            android.widget.Button r7 = r5.btn_ok
            com.flextv.livestore.dlgfragment.LiveSortDlgFragment$$ExternalSyntheticLambda0 r8 = new com.flextv.livestore.dlgfragment.LiveSortDlgFragment$$ExternalSyntheticLambda0
            r8.<init>(r5, r0)
            r7.setOnClickListener(r8)
            android.widget.Button r7 = r5.btn_cancel
            com.flextv.livestore.dlgfragment.LiveSortDlgFragment$$ExternalSyntheticLambda0 r8 = new com.flextv.livestore.dlgfragment.LiveSortDlgFragment$$ExternalSyntheticLambda0
            r0 = 1
            r8.<init>(r5, r0)
            r7.setOnClickListener(r8)
            return r6
    }
}
