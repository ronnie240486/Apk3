package com.flextv.livestore.dlgfragment;

/* JADX INFO: loaded from: classes2.dex */
public class ClearHistoryDlgFragment extends androidx.fragment.app.DialogFragment implements android.view.View.OnClickListener {
    public com.flextv.livestore.adapter.HideCategoryRecyclerViewAdapter adapter;
    public android.widget.Button btn_all;
    public android.widget.Button btn_cancel;
    public android.widget.Button btn_ok;
    public boolean[] checkedItems;
    public android.content.Context context;
    public int id;
    public java.lang.String[] recent_names;
    public java.util.List<java.lang.String> recentlyNames;
    public androidx.recyclerview.widget.RecyclerView recyclerGroups;
    public java.util.List<com.flextv.livestore.models.ResumeModel> resumeModels;
    public java.util.List<com.flextv.livestore.models.ResumeSeriesModel> resumeSeriesModels;
    public com.flextv.livestore.helper.PreferenceHelper sharedPreferenceHelper;
    public android.widget.TextView txt_header;
    public com.flextv.livestore.models.WordModels wordModels;

    public static /* synthetic */ void $r8$lambda$44UmdF6UwK4GHDucFCYCq0taNLw() {
            lambda$clearRecentSeriesFromRealm$2()
            return
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5fFVc8VtEVf_dRDGGlZK__9QCpg(com.flextv.livestore.dlgfragment.ClearHistoryDlgFragment r0, java.lang.Integer r1, java.lang.Boolean r2) {
            kotlin.Unit r0 = r0.lambda$onCreateView$0(r1, r2)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$EcKyiAojSPox5pciz8U7YkhYQCg() {
            lambda$setRecentSeries$4()
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$L3SrRp3rFVd19y6NStDG3f-TC4I, reason: not valid java name */
    public static /* synthetic */ void m123$r8$lambda$L3SrRp3rFVd19y6NStDG3fTC4I() {
            lambda$setProToVod$3()
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$QPcjR0r-xid6NEEZmkhjWYN0K3g, reason: not valid java name */
    public static /* synthetic */ void m124$r8$lambda$QPcjR0rxid6NEEZmkhjWYN0K3g() {
            lambda$clearRecentMoviesFromRealm$1()
            return
    }

    public ClearHistoryDlgFragment() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.resumeModels = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.resumeSeriesModels = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.recentlyNames = r0
            com.flextv.livestore.models.WordModels r0 = new com.flextv.livestore.models.WordModels
            r0.<init>()
            r1.wordModels = r0
            return
    }

    private void clearRecentMoviesFromRealm() {
            r10 = this;
            java.util.List<com.flextv.livestore.models.ResumeModel> r0 = r10.resumeModels
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r0.next()
            com.flextv.livestore.models.ResumeModel r1 = (com.flextv.livestore.models.ResumeModel) r1
            com.flextv.livestore.helper.RealmController r2 = com.flextv.livestore.helper.RealmController.with()
            java.lang.String r3 = r1.getName()
            java.lang.String r4 = r1.getTmdb_id()
            r5 = 0
            r6 = 0
            r8 = 0
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda0 r9 = com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda0.INSTANCE$18
            r2.addPositionToMovies(r3, r4, r5, r6, r8, r9)
            goto L6
        L28:
            return
    }

    private void clearRecentSeriesFromRealm() {
            r8 = this;
            java.util.List<com.flextv.livestore.models.ResumeSeriesModel> r0 = r8.resumeSeriesModels
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            com.flextv.livestore.models.ResumeSeriesModel r1 = (com.flextv.livestore.models.ResumeSeriesModel) r1
            com.flextv.livestore.helper.RealmController r2 = com.flextv.livestore.helper.RealmController.with()
            java.lang.String r3 = r1.getName()
            r4 = 0
            r5 = 0
            r6 = 0
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda0 r7 = com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda0.INSTANCE$17
            r2.addToRecentSeries(r3, r4, r5, r6, r7)
            goto L6
        L23:
            return
    }

    private java.util.List<com.flextv.livestore.models.ResumeSeriesModel> getSeriesResumeModels() {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<java.lang.String> r1 = r6.recentlyNames
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L37
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.util.List<com.flextv.livestore.models.ResumeSeriesModel> r3 = r6.resumeSeriesModels
            java.util.Iterator r3 = r3.iterator()
        L1d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lb
            java.lang.Object r4 = r3.next()
            com.flextv.livestore.models.ResumeSeriesModel r4 = (com.flextv.livestore.models.ResumeSeriesModel) r4
            java.lang.String r5 = r4.getName()
            boolean r5 = r2.equalsIgnoreCase(r5)
            if (r5 == 0) goto L1d
            r0.add(r4)
            goto Lb
        L37:
            return r0
    }

    private java.util.List<com.flextv.livestore.models.ResumeModel> getVodResumeModels() {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<java.lang.String> r1 = r6.recentlyNames
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L37
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.util.List<com.flextv.livestore.models.ResumeModel> r3 = r6.resumeModels
            java.util.Iterator r3 = r3.iterator()
        L1d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lb
            java.lang.Object r4 = r3.next()
            com.flextv.livestore.models.ResumeModel r4 = (com.flextv.livestore.models.ResumeModel) r4
            java.lang.String r5 = r4.getName()
            boolean r5 = r2.equalsIgnoreCase(r5)
            if (r5 == 0) goto L1d
            r0.add(r4)
            goto Lb
        L37:
            return r0
    }

    private void initView(android.view.View r2) {
            r1 = this;
            r0 = 2131428312(0x7f0b03d8, float:1.8478265E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.txt_header = r0
            r0 = 2131428073(0x7f0b02e9, float:1.847778E38)
            android.view.View r0 = r2.findViewById(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r1.recyclerGroups = r0
            r0 = 2131427478(0x7f0b0096, float:1.8476573E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r1.btn_ok = r0
            r0 = 2131427465(0x7f0b0089, float:1.8476547E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r1.btn_cancel = r0
            r0 = 2131427462(0x7f0b0086, float:1.847654E38)
            android.view.View r2 = r2.findViewById(r0)
            android.widget.Button r2 = (android.widget.Button) r2
            r1.btn_all = r2
            android.widget.Button r2 = r1.btn_ok
            r2.setOnClickListener(r1)
            android.widget.Button r2 = r1.btn_cancel
            r2.setOnClickListener(r1)
            android.widget.Button r2 = r1.btn_all
            r2.setOnClickListener(r1)
            return
    }

    private static /* synthetic */ void lambda$clearRecentMoviesFromRealm$1() {
            return
    }

    private static /* synthetic */ void lambda$clearRecentSeriesFromRealm$2() {
            return
    }

    private /* synthetic */ kotlin.Unit lambda$onCreateView$0(java.lang.Integer r3, java.lang.Boolean r4) {
            r2 = this;
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L28
            java.util.List<java.lang.String> r4 = r2.recentlyNames
            java.lang.String[] r0 = r2.recent_names
            int r1 = r3.intValue()
            r0 = r0[r1]
            boolean r4 = r4.contains(r0)
            if (r4 == 0) goto L45
            java.util.List<java.lang.String> r4 = r2.recentlyNames
            java.lang.String[] r0 = r2.recent_names
            int r3 = r3.intValue()
            r3 = r0[r3]
            java.util.List r3 = java.util.Collections.singletonList(r3)
            r4.removeAll(r3)
            goto L45
        L28:
            java.util.List<java.lang.String> r4 = r2.recentlyNames
            java.lang.String[] r0 = r2.recent_names
            int r1 = r3.intValue()
            r0 = r0[r1]
            boolean r4 = r4.contains(r0)
            if (r4 != 0) goto L45
            java.util.List<java.lang.String> r4 = r2.recentlyNames
            java.lang.String[] r0 = r2.recent_names
            int r3 = r3.intValue()
            r3 = r0[r3]
            r4.add(r3)
        L45:
            r3 = 0
            return r3
    }

    private static /* synthetic */ void lambda$setProToVod$3() {
            return
    }

    private static /* synthetic */ void lambda$setRecentSeries$4() {
            return
    }

    public static com.flextv.livestore.dlgfragment.ClearHistoryDlgFragment newInstance(android.content.Context r1, int r2) {
            com.flextv.livestore.dlgfragment.ClearHistoryDlgFragment r0 = new com.flextv.livestore.dlgfragment.ClearHistoryDlgFragment
            r0.<init>()
            r0.context = r1
            r0.id = r2
            return r0
    }

    private void setProToVod() {
            r10 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = r10.sharedPreferenceHelper
            java.util.List r0 = r0.getSharedPreferenceResumeModel()
            int r1 = r0.size()
            if (r1 <= 0) goto L37
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r0.next()
            com.flextv.livestore.models.ResumeModel r1 = (com.flextv.livestore.models.ResumeModel) r1
            com.flextv.livestore.helper.RealmController r2 = com.flextv.livestore.helper.RealmController.with()
            java.lang.String r3 = r1.getName()
            java.lang.String r4 = r1.getTmdb_id()
            r5 = 1
            long r6 = r1.getLast_position()
            int r8 = r1.getPro()
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda0 r9 = com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda0.INSTANCE$19
            r2.addPositionToMovies(r3, r4, r5, r6, r8, r9)
            goto L10
        L37:
            return
    }

    private void setRecentSeries() {
            r8 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = r8.sharedPreferenceHelper
            java.util.List r0 = r0.getSharedPreferenceRecentSeriesNames()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r0.next()
            com.flextv.livestore.models.ResumeSeriesModel r1 = (com.flextv.livestore.models.ResumeSeriesModel) r1
            com.flextv.livestore.helper.RealmController r2 = com.flextv.livestore.helper.RealmController.with()
            java.lang.String r3 = r1.getName()
            r4 = 1
            int r5 = r1.getSeason_pos()
            int r6 = r1.getEpisode_pos()
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda0 r7 = com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda0.INSTANCE$16
            r2.addToRecentSeries(r3, r4, r5, r6, r7)
            goto La
        L2d:
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r3) {
            r2 = this;
            int r3 = r3.getId()
            r0 = 2131427462(0x7f0b0086, float:1.847654E38)
            r1 = 1
            if (r3 == r0) goto L44
            r0 = 2131427465(0x7f0b0089, float:1.8476547E38)
            if (r3 == r0) goto L40
            r0 = 2131427478(0x7f0b0096, float:1.8476573E38)
            if (r3 == r0) goto L15
            goto L6d
        L15:
            r2.dismiss()
            int r3 = r2.id
            if (r3 == r1) goto L30
            r0 = 2
            if (r3 == r0) goto L20
            goto L6d
        L20:
            com.flextv.livestore.helper.PreferenceHelper r3 = r2.sharedPreferenceHelper
            java.util.List r0 = r2.getSeriesResumeModels()
            r3.setSharedPreferenceRecentSeriesNames(r0)
            r2.clearRecentSeriesFromRealm()
            r2.setRecentSeries()
            goto L6d
        L30:
            com.flextv.livestore.helper.PreferenceHelper r3 = r2.sharedPreferenceHelper
            java.util.List r0 = r2.getVodResumeModels()
            r3.setSharedPreferenceResumeModel(r0)
            r2.clearRecentMoviesFromRealm()
            r2.setProToVod()
            goto L6d
        L40:
            r2.dismiss()
            goto L6d
        L44:
            java.util.List<java.lang.String> r3 = r2.recentlyNames
            int r3 = r3.size()
            java.lang.String[] r0 = r2.recent_names
            int r0 = r0.length
            if (r3 >= r0) goto L5c
            com.flextv.livestore.adapter.HideCategoryRecyclerViewAdapter r3 = r2.adapter
            r3.allChecked(r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.recentlyNames = r3
            goto L6d
        L5c:
            com.flextv.livestore.adapter.HideCategoryRecyclerViewAdapter r3 = r2.adapter
            r0 = 0
            r3.allChecked(r0)
            java.util.List<java.lang.String> r3 = r2.recentlyNames
            java.lang.String[] r0 = r2.recent_names
            java.util.List r0 = java.util.Arrays.asList(r0)
            r3.addAll(r0)
        L6d:
            return
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
            r8 = 2131624032(0x7f0e0060, float:1.8875232E38)
            r0 = 0
            android.view.View r6 = r6.inflate(r8, r7, r0)
            r5.initView(r6)
            com.flextv.livestore.helper.PreferenceHelper r7 = new com.flextv.livestore.helper.PreferenceHelper
            android.content.Context r8 = r5.context
            r7.<init>(r8)
            r5.sharedPreferenceHelper = r7
            android.content.Context r7 = r5.context
            com.flextv.livestore.models.WordModels r7 = com.flextv.livestore.helper.GetSharedInfo.getWordModel(r7)
            r5.wordModels = r7
            int r8 = r5.id
            r1 = 1
            r2 = 2
            if (r8 == 0) goto L3b
            if (r8 == r1) goto L31
            if (r8 == r2) goto L27
            goto L44
        L27:
            android.widget.TextView r8 = r5.txt_header
            java.lang.String r7 = r7.getClear_series_header()
            r8.setText(r7)
            goto L44
        L31:
            android.widget.TextView r8 = r5.txt_header
            java.lang.String r7 = r7.getClear_movie_header()
            r8.setText(r7)
            goto L44
        L3b:
            android.widget.TextView r8 = r5.txt_header
            java.lang.String r7 = r7.getClear_channel_header()
            r8.setText(r7)
        L44:
            android.widget.Button r7 = r5.btn_ok
            com.flextv.livestore.models.WordModels r8 = r5.wordModels
            java.lang.String r8 = r8.getOk()
            r7.setText(r8)
            android.widget.Button r7 = r5.btn_all
            com.flextv.livestore.models.WordModels r8 = r5.wordModels
            java.lang.String r8 = r8.getSelect_all()
            r7.setText(r8)
            android.widget.Button r7 = r5.btn_cancel
            com.flextv.livestore.models.WordModels r8 = r5.wordModels
            java.lang.String r8 = r8.getCancel()
            r7.setText(r8)
            int r7 = r5.id
            if (r7 == r1) goto Lc1
            if (r7 == r2) goto L6d
            goto L115
        L6d:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.resumeSeriesModels = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.recentlyNames = r7
            com.flextv.livestore.helper.PreferenceHelper r7 = r5.sharedPreferenceHelper
            java.util.List r7 = r7.getSharedPreferenceRecentSeriesNames()
            r5.resumeSeriesModels = r7
            int r7 = r7.size()
            java.lang.String[] r7 = new java.lang.String[r7]
            r5.recent_names = r7
            java.util.List<com.flextv.livestore.models.ResumeSeriesModel> r7 = r5.resumeSeriesModels
            int r7 = r7.size()
            boolean[] r7 = new boolean[r7]
            r5.checkedItems = r7
        L95:
            java.util.List<com.flextv.livestore.models.ResumeSeriesModel> r7 = r5.resumeSeriesModels
            int r7 = r7.size()
            if (r0 >= r7) goto L115
            java.util.List<java.lang.String> r7 = r5.recentlyNames
            java.util.List<com.flextv.livestore.models.ResumeSeriesModel> r8 = r5.resumeSeriesModels
            java.lang.Object r8 = r8.get(r0)
            com.flextv.livestore.models.ResumeSeriesModel r8 = (com.flextv.livestore.models.ResumeSeriesModel) r8
            java.lang.String r8 = r8.getName()
            r7.add(r8)
            java.lang.String[] r7 = r5.recent_names
            java.util.List<com.flextv.livestore.models.ResumeSeriesModel> r8 = r5.resumeSeriesModels
            java.lang.Object r8 = r8.get(r0)
            com.flextv.livestore.models.ResumeSeriesModel r8 = (com.flextv.livestore.models.ResumeSeriesModel) r8
            java.lang.String r8 = r8.getName()
            r7[r0] = r8
            int r0 = r0 + 1
            goto L95
        Lc1:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.resumeModels = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.recentlyNames = r7
            com.flextv.livestore.helper.PreferenceHelper r7 = r5.sharedPreferenceHelper
            java.util.List r7 = r7.getSharedPreferenceResumeModel()
            r5.resumeModels = r7
            int r7 = r7.size()
            java.lang.String[] r7 = new java.lang.String[r7]
            r5.recent_names = r7
            java.util.List<com.flextv.livestore.models.ResumeModel> r7 = r5.resumeModels
            int r7 = r7.size()
            boolean[] r7 = new boolean[r7]
            r5.checkedItems = r7
        Le9:
            java.util.List<com.flextv.livestore.models.ResumeModel> r7 = r5.resumeModels
            int r7 = r7.size()
            if (r0 >= r7) goto L115
            java.util.List<java.lang.String> r7 = r5.recentlyNames
            java.util.List<com.flextv.livestore.models.ResumeModel> r8 = r5.resumeModels
            java.lang.Object r8 = r8.get(r0)
            com.flextv.livestore.models.ResumeModel r8 = (com.flextv.livestore.models.ResumeModel) r8
            java.lang.String r8 = r8.getName()
            r7.add(r8)
            java.lang.String[] r7 = r5.recent_names
            java.util.List<com.flextv.livestore.models.ResumeModel> r8 = r5.resumeModels
            java.lang.Object r8 = r8.get(r0)
            com.flextv.livestore.models.ResumeModel r8 = (com.flextv.livestore.models.ResumeModel) r8
            java.lang.String r8 = r8.getName()
            r7[r0] = r8
            int r0 = r0 + 1
            goto Le9
        L115:
            com.flextv.livestore.adapter.HideCategoryRecyclerViewAdapter r7 = new com.flextv.livestore.adapter.HideCategoryRecyclerViewAdapter
            android.content.Context r8 = r5.getContext()
            java.lang.String[] r0 = r5.recent_names
            boolean[] r3 = r5.checkedItems
            com.flextv.livestore.dlgfragment.EpisodeDlgFragment$$ExternalSyntheticLambda1 r4 = new com.flextv.livestore.dlgfragment.EpisodeDlgFragment$$ExternalSyntheticLambda1
            r4.<init>(r5, r2)
            r7.<init>(r8, r0, r3, r4)
            r5.adapter = r7
            androidx.recyclerview.widget.RecyclerView r7 = r5.recyclerGroups
            androidx.recyclerview.widget.LinearLayoutManager r8 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r0 = r5.getContext()
            r8.<init>(r0)
            r7.setLayoutManager(r8)
            androidx.recyclerview.widget.RecyclerView r7 = r5.recyclerGroups
            r7.setHasFixedSize(r1)
            androidx.recyclerview.widget.RecyclerView r7 = r5.recyclerGroups
            com.flextv.livestore.adapter.HideCategoryRecyclerViewAdapter r8 = r5.adapter
            r7.setAdapter(r8)
            return r6
    }
}
