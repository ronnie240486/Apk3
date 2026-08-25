package com.flextv.livestore.dlgfragment;

/* JADX INFO: loaded from: classes.dex */
public class AudioTrackDlgFragment extends androidx.fragment.app.DialogFragment {
    public com.flextv.livestore.adapter.LiveSortRecyclerAdapter adapter;
    public android.content.Context context;
    public java.util.List<java.lang.String> formatStrings;
    public com.flextv.livestore.dlgfragment.AudioTrackDlgFragment.ItemPositionListener listener;
    public androidx.recyclerview.widget.RecyclerView recyclerTimes;
    public int selected_position;
    public android.widget.TextView txt_header;
    public com.flextv.livestore.models.WordModels wordModels;

    /* JADX INFO: loaded from: classes3.dex */
    public interface ItemPositionListener {
        void onItemPosition(int r1);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BnXVtBSJPs0sTcaQf3DQ9ETbGIc(com.flextv.livestore.dlgfragment.AudioTrackDlgFragment r0, java.lang.Integer r1, java.lang.Boolean r2) {
            kotlin.Unit r0 = r0.lambda$onCreateView$0(r1, r2)
            return r0
    }

    public AudioTrackDlgFragment() {
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
            if (r2 == 0) goto L14
            r0.dismiss()
            int r1 = r1.intValue()
            r0.selected_position = r1
            com.flextv.livestore.dlgfragment.AudioTrackDlgFragment$ItemPositionListener r2 = r0.listener
            r2.onItemPosition(r1)
        L14:
            r1 = 0
            return r1
    }

    public static com.flextv.livestore.dlgfragment.AudioTrackDlgFragment newInstance(android.content.Context r1, java.util.List<java.lang.String> r2, int r3, com.flextv.livestore.dlgfragment.AudioTrackDlgFragment.ItemPositionListener r4) {
            com.flextv.livestore.dlgfragment.AudioTrackDlgFragment r0 = new com.flextv.livestore.dlgfragment.AudioTrackDlgFragment
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
    public android.view.View onCreateView(android.view.LayoutInflater r5, android.view.ViewGroup r6, android.os.Bundle r7) {
            r4 = this;
            r7 = 2131624025(0x7f0e0059, float:1.8875218E38)
            r0 = 0
            android.view.View r5 = r5.inflate(r7, r6, r0)
            android.content.Context r6 = r4.context
            com.flextv.livestore.models.WordModels r6 = com.flextv.livestore.helper.GetSharedInfo.getWordModel(r6)
            r4.wordModels = r6
            r6 = 2131428312(0x7f0b03d8, float:1.8478265E38)
            android.view.View r6 = r5.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r4.txt_header = r6
            r6 = 2131428073(0x7f0b02e9, float:1.847778E38)
            android.view.View r6 = r5.findViewById(r6)
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            r4.recyclerTimes = r6
            android.widget.TextView r6 = r4.txt_header
            com.flextv.livestore.models.WordModels r7 = r4.wordModels
            java.lang.String r7 = r7.getAudio_track()
            r6.setText(r7)
            com.flextv.livestore.adapter.LiveSortRecyclerAdapter r6 = new com.flextv.livestore.adapter.LiveSortRecyclerAdapter
            android.content.Context r7 = r4.getContext()
            java.util.List<java.lang.String> r0 = r4.formatStrings
            int r1 = r4.selected_position
            com.flextv.livestore.dlgfragment.EpisodeDlgFragment$$ExternalSyntheticLambda1 r2 = new com.flextv.livestore.dlgfragment.EpisodeDlgFragment$$ExternalSyntheticLambda1
            r3 = 1
            r2.<init>(r4, r3)
            r6.<init>(r7, r0, r1, r2)
            r4.adapter = r6
            androidx.recyclerview.widget.RecyclerView r6 = r4.recyclerTimes
            androidx.recyclerview.widget.LinearLayoutManager r7 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r0 = r4.getContext()
            r7.<init>(r0)
            r6.setLayoutManager(r7)
            androidx.recyclerview.widget.RecyclerView r6 = r4.recyclerTimes
            com.flextv.livestore.adapter.LiveSortRecyclerAdapter r7 = r4.adapter
            r6.setAdapter(r7)
            androidx.recyclerview.widget.RecyclerView r6 = r4.recyclerTimes
            int r7 = r4.selected_position
            r6.scrollToPosition(r7)
            androidx.recyclerview.widget.RecyclerView r6 = r4.recyclerTimes
            r6.requestFocus()
            return r5
    }
}
