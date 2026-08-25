package com.flextv.livestore.dlgfragment;

/* JADX INFO: loaded from: classes2.dex */
public class EpisodeDlgFragment extends androidx.fragment.app.DialogFragment {
    public com.flextv.livestore.adapter.PlayEpisodeRecyclerAdapter adapter;
    public android.widget.ImageButton btn_close;
    public java.util.List<com.flextv.livestore.models.EpisodeModel> episodeModels;
    public int episode_pos;
    public com.flextv.livestore.dlgfragment.EpisodeDlgFragment.OnEpisodeItemListener listener;
    public androidx.recyclerview.widget.RecyclerView recycler_episodes;
    public int season_pos;
    public android.widget.TextView str_episodes;
    public android.widget.TextView txt_see_all;
    public com.flextv.livestore.models.WordModels wordModels;

    /* JADX INFO: loaded from: classes.dex */
    public interface OnEpisodeItemListener {
        void OnEpisodeSelected(com.flextv.livestore.models.EpisodeModel r1, int r2);

        void OnSeeAllEpisodes();
    }

    /* JADX INFO: renamed from: $r8$lambda$7QhqRgNWEE1qTvUi-OLy1TcEGsQ, reason: not valid java name */
    public static /* synthetic */ boolean m127$r8$lambda$7QhqRgNWEE1qTvUiOLy1TcEGsQ(com.flextv.livestore.dlgfragment.EpisodeDlgFragment r0, android.view.View r1, android.view.MotionEvent r2) {
            boolean r0 = r0.lambda$initView$2(r1, r2)
            return r0
    }

    public static /* synthetic */ boolean $r8$lambda$B1li5VRhXNuWk9avUXirLpfaoHo(com.flextv.livestore.dlgfragment.EpisodeDlgFragment r0, android.view.View r1, android.view.MotionEvent r2) {
            boolean r0 = r0.lambda$initView$3(r1, r2)
            return r0
    }

    public static /* synthetic */ boolean $r8$lambda$u3_Z4VZOE1n5u37xPkirFbv9ybQ(com.flextv.livestore.dlgfragment.EpisodeDlgFragment r0, android.content.DialogInterface r1, int r2, android.view.KeyEvent r3) {
            boolean r0 = r0.lambda$onCreateView$1(r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$xh3Vb-CkdWXe4nxmRDaF1HDiqaU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m128$r8$lambda$xh3VbCkdWXe4nxmRDaF1HDiqaU(com.flextv.livestore.dlgfragment.EpisodeDlgFragment r0, com.flextv.livestore.models.EpisodeModel r1, java.lang.Integer r2) {
            kotlin.Unit r0 = r0.lambda$onCreateView$0(r1, r2)
            return r0
    }

    public EpisodeDlgFragment() {
            r1 = this;
            r1.<init>()
            com.flextv.livestore.models.WordModels r0 = new com.flextv.livestore.models.WordModels
            r0.<init>()
            r1.wordModels = r0
            return
    }

    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    private void initView(android.view.View r3) {
            r2 = this;
            r0 = 2131428192(0x7f0b0360, float:1.8478022E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.str_episodes = r0
            r0 = 2131428342(0x7f0b03f6, float:1.8478326E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.txt_see_all = r0
            r0 = 2131427467(0x7f0b008b, float:1.8476551E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r2.btn_close = r0
            r0 = 2131428079(0x7f0b02ef, float:1.8477792E38)
            android.view.View r3 = r3.findViewById(r0)
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            r2.recycler_episodes = r3
            android.widget.TextView r3 = r2.str_episodes
            com.flextv.livestore.models.WordModels r0 = r2.wordModels
            java.lang.String r0 = r0.getStr_more_episodes()
            r3.setText(r0)
            android.widget.TextView r3 = r2.txt_see_all
            com.flextv.livestore.models.WordModels r0 = r2.wordModels
            java.lang.String r0 = r0.getSee_all()
            r3.setText(r0)
            android.widget.ImageButton r3 = r2.btn_close
            com.flextv.livestore.dlgfragment.EpisodeDlgFragment$$ExternalSyntheticLambda0 r0 = new com.flextv.livestore.dlgfragment.EpisodeDlgFragment$$ExternalSyntheticLambda0
            r1 = 0
            r0.<init>(r2, r1)
            r3.setOnTouchListener(r0)
            android.widget.TextView r3 = r2.txt_see_all
            com.flextv.livestore.dlgfragment.EpisodeDlgFragment$$ExternalSyntheticLambda0 r0 = new com.flextv.livestore.dlgfragment.EpisodeDlgFragment$$ExternalSyntheticLambda0
            r1 = 1
            r0.<init>(r2, r1)
            r3.setOnTouchListener(r0)
            return
    }

    private /* synthetic */ boolean lambda$initView$2(android.view.View r3, android.view.MotionEvent r4) {
            r2 = this;
            int r3 = r4.getAction()
            r0 = 2131100405(0x7f0602f5, float:1.781319E38)
            r1 = 3
            if (r3 != r1) goto L17
            android.widget.ImageButton r3 = r2.btn_close
            android.content.res.Resources r1 = r2.getResources()
            int r1 = r1.getColor(r0)
            r3.setColorFilter(r1)
        L17:
            int r3 = r4.getAction()
            r1 = 1
            if (r3 != 0) goto L2f
            android.widget.ImageButton r3 = r2.btn_close
            android.content.res.Resources r4 = r2.getResources()
            r0 = 2131099780(0x7f060084, float:1.7811923E38)
            int r4 = r4.getColor(r0)
            r3.setColorFilter(r4)
            return r1
        L2f:
            int r3 = r4.getAction()
            if (r3 != r1) goto L45
            android.widget.ImageButton r3 = r2.btn_close
            android.content.res.Resources r4 = r2.getResources()
            int r4 = r4.getColor(r0)
            r3.setColorFilter(r4)
            r2.dismiss()
        L45:
            r3 = 0
            return r3
    }

    private /* synthetic */ boolean lambda$initView$3(android.view.View r3, android.view.MotionEvent r4) {
            r2 = this;
            int r3 = r4.getAction()
            r0 = 2131099775(0x7f06007f, float:1.7811913E38)
            r1 = 3
            if (r3 != r1) goto L17
            android.widget.TextView r3 = r2.txt_see_all
            android.content.res.Resources r1 = r2.getResources()
            int r1 = r1.getColor(r0)
            r3.setTextColor(r1)
        L17:
            int r3 = r4.getAction()
            r1 = 1
            if (r3 != 0) goto L2f
            android.widget.TextView r3 = r2.txt_see_all
            android.content.res.Resources r4 = r2.getResources()
            r0 = 2131099780(0x7f060084, float:1.7811923E38)
            int r4 = r4.getColor(r0)
            r3.setTextColor(r4)
            return r1
        L2f:
            int r3 = r4.getAction()
            if (r3 != r1) goto L4a
            android.widget.TextView r3 = r2.txt_see_all
            android.content.res.Resources r4 = r2.getResources()
            int r4 = r4.getColor(r0)
            r3.setTextColor(r4)
            com.flextv.livestore.dlgfragment.EpisodeDlgFragment$OnEpisodeItemListener r3 = r2.listener
            r3.OnSeeAllEpisodes()
            r2.dismiss()
        L4a:
            r3 = 0
            return r3
    }

    private /* synthetic */ kotlin.Unit lambda$onCreateView$0(com.flextv.livestore.models.EpisodeModel r2, java.lang.Integer r3) {
            r1 = this;
            com.flextv.livestore.dlgfragment.EpisodeDlgFragment$OnEpisodeItemListener r0 = r1.listener
            int r3 = r3.intValue()
            r0.OnEpisodeSelected(r2, r3)
            r2 = 0
            return r2
    }

    private /* synthetic */ boolean lambda$onCreateView$1(android.content.DialogInterface r1, int r2, android.view.KeyEvent r3) {
            r0 = this;
            int r1 = r3.getAction()
            if (r1 != 0) goto L12
            int r1 = r3.getKeyCode()
            r2 = 4
            if (r1 != r2) goto L12
            r0.dismiss()
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public static com.flextv.livestore.dlgfragment.EpisodeDlgFragment newInstance(java.util.List<com.flextv.livestore.models.EpisodeModel> r1, int r2, int r3) {
            com.flextv.livestore.dlgfragment.EpisodeDlgFragment r0 = new com.flextv.livestore.dlgfragment.EpisodeDlgFragment
            r0.<init>()
            r0.episodeModels = r1
            r0.season_pos = r2
            r0.episode_pos = r3
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
    public android.view.View onCreateView(android.view.LayoutInflater r8, android.view.ViewGroup r9, android.os.Bundle r10) {
            r7 = this;
            r10 = 2131624028(0x7f0e005c, float:1.8875224E38)
            r0 = 0
            android.view.View r8 = r8.inflate(r10, r9, r0)
            android.content.Context r9 = r7.getContext()
            com.flextv.livestore.models.WordModels r9 = com.flextv.livestore.helper.GetSharedInfo.getWordModel(r9)
            r7.wordModels = r9
            r7.initView(r8)
            com.flextv.livestore.adapter.PlayEpisodeRecyclerAdapter r9 = new com.flextv.livestore.adapter.PlayEpisodeRecyclerAdapter
            android.content.Context r2 = r7.getContext()
            java.util.List<com.flextv.livestore.models.EpisodeModel> r3 = r7.episodeModels
            int r4 = r7.season_pos
            int r5 = r7.episode_pos
            com.flextv.livestore.dlgfragment.EpisodeDlgFragment$$ExternalSyntheticLambda1 r6 = new com.flextv.livestore.dlgfragment.EpisodeDlgFragment$$ExternalSyntheticLambda1
            r6.<init>(r7, r0)
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r7.adapter = r9
            androidx.recyclerview.widget.RecyclerView r9 = r7.recycler_episodes
            androidx.recyclerview.widget.LinearLayoutManager r10 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r1 = r7.getContext()
            r10.<init>(r1, r0, r0)
            r9.setLayoutManager(r10)
            androidx.recyclerview.widget.RecyclerView r9 = r7.recycler_episodes
            r10 = 1
            r9.setHasFixedSize(r10)
            androidx.recyclerview.widget.RecyclerView r9 = r7.recycler_episodes
            com.flextv.livestore.adapter.PlayEpisodeRecyclerAdapter r10 = r7.adapter
            r9.setAdapter(r10)
            androidx.recyclerview.widget.RecyclerView r9 = r7.recycler_episodes
            int r10 = r7.episode_pos
            r9.scrollToPosition(r10)
            androidx.recyclerview.widget.RecyclerView r9 = r7.recycler_episodes
            r9.requestFocus()
            android.app.Dialog r9 = r7.getDialog()
            com.flextv.livestore.dlgfragment.ExitDlgFragment$$ExternalSyntheticLambda0 r10 = new com.flextv.livestore.dlgfragment.ExitDlgFragment$$ExternalSyntheticLambda0
            r0 = 3
            r10.<init>(r7, r0)
            r9.setOnKeyListener(r10)
            return r8
    }

    public void setOnEpisodeItemListener(com.flextv.livestore.dlgfragment.EpisodeDlgFragment.OnEpisodeItemListener r1) {
            r0 = this;
            r0.listener = r1
            return
    }
}
