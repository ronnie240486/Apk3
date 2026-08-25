package com.flextv.livestore.activities;

/* JADX INFO: loaded from: classes.dex */
public class SeriesActivity extends androidx.appcompat.app.AppCompatActivity implements android.view.View.OnClickListener {
    public java.util.List<com.flextv.livestore.models.CategoryModel> categoryModels;
    public int category_pos;
    public android.widget.EditText et_search;
    public android.widget.LinearLayout ly_back;
    public android.widget.LinearLayout ly_search;
    public int pre_category_pos;
    public int pre_series_pos;
    public com.flextv.livestore.helper.PreferenceHelper preferenceHelper;
    public com.flextv.livestore.view.LiveVerticalGridView recycler_category;
    public com.flextv.livestore.view.LiveVerticalGridView recycler_series;
    public com.flextv.livestore.adapter.SeriesRecyclerAdapter seriesAdapter;
    public io.realm.RealmResults<com.flextv.livestore.models.SeriesModel> seriesModels;
    public java.util.List<java.lang.String> sortLists;
    public int sort_pos;
    public com.flextv.livestore.view.CustomSpinner sort_spinner;
    public android.widget.TextView txt_back;
    public android.widget.TextView txt_category;
    public android.widget.TextView txt_home;
    public android.widget.TextView txt_live;
    public android.widget.TextView txt_movie;
    public android.widget.TextView txt_search;
    public android.widget.TextView txt_series;
    public com.flextv.livestore.models.WordModels wordModels;

    /* JADX INFO: renamed from: com.flextv.livestore.activities.SeriesActivity$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    public class AnonymousClass1 implements com.flextv.livestore.adapter.SeriesRecyclerAdapter.ItemClickListener {
        public final /* synthetic */ com.flextv.livestore.activities.SeriesActivity this$0;

        public static /* synthetic */ void $r8$lambda$Rli_cm6T9xeeoiYQJtAFBmo1Ofo(com.flextv.livestore.activities.SeriesActivity.AnonymousClass1 r0, int r1) {
                r0.lambda$onUnFavClick$1(r1)
                return
        }

        public static /* synthetic */ void $r8$lambda$ciLtFsVA4s9S1zHHEKCvZ86Aw5Y(com.flextv.livestore.activities.SeriesActivity.AnonymousClass1 r0, int r1) {
                r0.lambda$onFavClick$0(r1)
                return
        }

        public AnonymousClass1(com.flextv.livestore.activities.SeriesActivity r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        private /* synthetic */ void lambda$onFavClick$0(int r2) {
                r1 = this;
                com.flextv.livestore.activities.SeriesActivity r0 = r1.this$0
                com.flextv.livestore.adapter.SeriesRecyclerAdapter r0 = r0.seriesAdapter
                r0.notifyItemChanged(r2)
                com.flextv.livestore.activities.SeriesActivity r2 = r1.this$0
                com.flextv.livestore.helper.PreferenceHelper r2 = r2.preferenceHelper
                com.flextv.livestore.helper.RealmController r0 = com.flextv.livestore.helper.RealmController.with()
                java.util.List r0 = r0.getFavSeriesNames()
                r2.setSharedPreferenceSeriesFavNames(r0)
                return
        }

        private /* synthetic */ void lambda$onUnFavClick$1(int r2) {
                r1 = this;
                com.flextv.livestore.activities.SeriesActivity r0 = r1.this$0
                com.flextv.livestore.adapter.SeriesRecyclerAdapter r0 = r0.seriesAdapter
                r0.notifyItemChanged(r2)
                com.flextv.livestore.activities.SeriesActivity r2 = r1.this$0
                com.flextv.livestore.helper.PreferenceHelper r2 = r2.preferenceHelper
                com.flextv.livestore.helper.RealmController r0 = com.flextv.livestore.helper.RealmController.with()
                java.util.List r0 = r0.getFavSeriesNames()
                r2.setSharedPreferenceSeriesFavNames(r0)
                return
        }

        @Override // com.flextv.livestore.adapter.SeriesRecyclerAdapter.ItemClickListener
        public void onFavClick(com.flextv.livestore.models.SeriesModel r4, int r5) {
                r3 = this;
                com.flextv.livestore.helper.RealmController r0 = com.flextv.livestore.helper.RealmController.with()
                java.lang.String r4 = r4.getName()
                com.flextv.livestore.activities.SeriesActivity$1$$ExternalSyntheticLambda0 r1 = new com.flextv.livestore.activities.SeriesActivity$1$$ExternalSyntheticLambda0
                r2 = 0
                r1.<init>(r3, r5, r2)
                r5 = 1
                r0.addToFavSeries(r4, r5, r1)
                return
        }

        @Override // com.flextv.livestore.adapter.SeriesRecyclerAdapter.ItemClickListener
        public void onFocusPosition(int r2) {
                r1 = this;
                com.flextv.livestore.activities.SeriesActivity r0 = r1.this$0
                r0.pre_series_pos = r2
                return
        }

        @Override // com.flextv.livestore.adapter.SeriesRecyclerAdapter.ItemClickListener
        public void onItemClick(com.flextv.livestore.models.SeriesModel r4, int r5) {
                r3 = this;
                com.flextv.livestore.activities.SeriesActivity r5 = r3.this$0
                java.util.Objects.requireNonNull(r5)
                com.flextv.livestore.activities.SeriesActivity r5 = r3.this$0
                java.util.List<com.flextv.livestore.models.CategoryModel> r0 = r5.categoryModels
                int r5 = r5.category_pos
                java.lang.Object r5 = r0.get(r5)
                com.flextv.livestore.models.CategoryModel r5 = (com.flextv.livestore.models.CategoryModel) r5
                java.lang.String r5 = r5.getId()
                java.lang.String r0 = "resume_id"
                boolean r5 = r5.equalsIgnoreCase(r0)
                java.lang.String r0 = "series_id"
                if (r5 == 0) goto L41
                android.content.Intent r5 = new android.content.Intent
                com.flextv.livestore.activities.SeriesActivity r1 = r3.this$0
                java.lang.Class<com.flextv.livestore.activities.SeasonActivity> r2 = com.flextv.livestore.activities.SeasonActivity.class
                r5.<init>(r1, r2)
                java.lang.String r1 = r4.getName()
                java.lang.String r2 = "series_name"
                r5.putExtra(r2, r1)
                java.lang.String r4 = r4.getSeries_id()
                r5.putExtra(r0, r4)
                com.flextv.livestore.activities.SeriesActivity r4 = r3.this$0
                r4.startActivity(r5)
                goto L80
            L41:
                android.content.Intent r5 = new android.content.Intent
                com.flextv.livestore.activities.SeriesActivity r1 = r3.this$0
                java.lang.Class<com.flextv.livestore.activities.SeriesInfoActivity> r2 = com.flextv.livestore.activities.SeriesInfoActivity.class
                r5.<init>(r1, r2)
                java.lang.String r1 = r4.getSeries_id()
                r5.putExtra(r0, r1)
                java.lang.String r0 = r4.getName()
                java.lang.String r1 = "name"
                r5.putExtra(r1, r0)
                com.flextv.livestore.activities.SeriesActivity r0 = r3.this$0
                com.flextv.livestore.helper.PreferenceHelper r0 = r0.preferenceHelper
                boolean r0 = r0.getSharedPreferenceISM3U()
                java.lang.String r1 = "category_name"
                if (r0 == 0) goto L6e
                java.lang.String r4 = r4.getCategory_name()
                r5.putExtra(r1, r4)
                goto L7b
            L6e:
                com.flextv.livestore.activities.SeriesActivity r0 = r3.this$0
                java.lang.String r4 = r4.getCategory_id()
                java.lang.String r4 = com.flextv.livestore.activities.SeriesActivity.access$000(r0, r4)
                r5.putExtra(r1, r4)
            L7b:
                com.flextv.livestore.activities.SeriesActivity r4 = r3.this$0
                r4.startActivity(r5)
            L80:
                return
        }

        @Override // com.flextv.livestore.adapter.SeriesRecyclerAdapter.ItemClickListener
        public void onUnFavClick(com.flextv.livestore.models.SeriesModel r4, int r5) {
                r3 = this;
                com.flextv.livestore.helper.RealmController r0 = com.flextv.livestore.helper.RealmController.with()
                java.lang.String r4 = r4.getName()
                com.flextv.livestore.activities.SeriesActivity$1$$ExternalSyntheticLambda0 r1 = new com.flextv.livestore.activities.SeriesActivity$1$$ExternalSyntheticLambda0
                r2 = 1
                r1.<init>(r3, r5, r2)
                r5 = 0
                r0.addToFavSeries(r4, r5, r1)
                return
        }
    }





    /* JADX INFO: renamed from: $r8$lambda$JL08a-Ca39IO2gpfLorPhyqlTY4, reason: not valid java name */
    public static /* synthetic */ void m71$r8$lambda$JL08aCa39IO2gpfLorPhyqlTY4(com.flextv.livestore.activities.SeriesActivity r0, org.json.JSONObject r1, int r2) {
            r0.lambda$GetLoginFromSubtitle$1(r1, r2)
            return
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cOuejeXaUZ504BXup5fEl1WvuqU(com.flextv.livestore.activities.SeriesActivity r0, com.flextv.livestore.models.CategoryModel r1, java.lang.Integer r2, java.lang.Boolean r3) {
            kotlin.Unit r0 = r0.lambda$onCreate$0(r1, r2, r3)
            return r0
    }

    public SeriesActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.sortLists = r0
            r0 = 0
            r1.category_pos = r0
            r1.sort_pos = r0
            r1.pre_category_pos = r0
            r1.pre_series_pos = r0
            return
    }

    private void GetLoginFromSubtitle() {
            r4 = this;
            com.flextv.livestore.remote.GetSubtitleLoginRequest r0 = new com.flextv.livestore.remote.GetSubtitleLoginRequest
            r1 = 1000(0x3e8, float:1.401E-42)
            r0.<init>(r4, r1)
            java.lang.String r1 = com.flextv.livestore.apps.Constants.USERNAME
            java.lang.String r2 = com.flextv.livestore.apps.Constants.PASSWORD
            org.json.JSONObject r1 = com.flextv.livestore.utils.Security.getUserObject(r1, r2)
            java.lang.String r2 = com.flextv.livestore.apps.Constants.SUBTITLE_LOGIN
            java.lang.String r3 = com.flextv.livestore.apps.Constants.API_KEY
            r0.getResponse(r1, r2, r3)
            com.flextv.livestore.activities.MovieActivity$$ExternalSyntheticLambda2 r1 = new com.flextv.livestore.activities.MovieActivity$$ExternalSyntheticLambda2
            r2 = 5
            r1.<init>(r4, r2)
            r0.setOnGetLinkModelListener(r1)
            return
    }

    public static /* synthetic */ java.lang.String access$000(com.flextv.livestore.activities.SeriesActivity r0, java.lang.String r1) {
            java.lang.String r0 = r0.getSeriesCategoryName(r1)
            return r0
    }

    public static /* synthetic */ void access$100(com.flextv.livestore.activities.SeriesActivity r0, java.lang.String r1) {
            r0.searchModels(r1)
            return
    }

    private int getAvailableCategoryPosition() {
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            java.util.List<com.flextv.livestore.models.CategoryModel> r2 = r6.categoryModels
            int r2 = r2.size()
            if (r1 >= r2) goto L2c
            com.flextv.livestore.helper.RealmController r2 = com.flextv.livestore.helper.RealmController.with()
            java.util.List<com.flextv.livestore.models.CategoryModel> r3 = r6.categoryModels
            java.lang.Object r3 = r3.get(r1)
            com.flextv.livestore.models.CategoryModel r3 = (com.flextv.livestore.models.CategoryModel) r3
            com.flextv.livestore.helper.PreferenceHelper r4 = r6.preferenceHelper
            boolean r4 = r4.getSharedPreferenceISM3U()
            java.lang.String r5 = ""
            io.realm.RealmResults r2 = r2.getSeriesModelsByCategory(r3, r5, r4, r0)
            int r2 = r2.size()
            if (r2 <= 0) goto L29
            return r1
        L29:
            int r1 = r1 + 1
            goto L2
        L2c:
            return r0
    }

    private java.lang.String getSeriesCategoryName(java.lang.String r4) {
            r3 = this;
            java.util.List<com.flextv.livestore.models.CategoryModel> r0 = com.flextv.livestore.apps.LTVApp.series_categories_filter
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.next()
            com.flextv.livestore.models.CategoryModel r1 = (com.flextv.livestore.models.CategoryModel) r1
            java.lang.String r2 = r1.getId()
            boolean r2 = r4.equalsIgnoreCase(r2)
            if (r2 == 0) goto L6
            java.lang.String r4 = r1.getName()
            return r4
        L21:
            java.lang.String r4 = "UnNamed Category"
            return r4
    }

    private void initView() {
            r6 = this;
            r0 = 2131427891(0x7f0b0233, float:1.8477411E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r6.ly_back = r0
            r0 = 2131427918(0x7f0b024e, float:1.8477466E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r6.ly_search = r0
            r0 = 2131428313(0x7f0b03d9, float:1.8478267E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.txt_home = r0
            r0 = 2131428316(0x7f0b03dc, float:1.8478273E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.txt_live = r0
            r0 = 2131428322(0x7f0b03e2, float:1.8478285E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.txt_movie = r0
            r0 = 2131428343(0x7f0b03f7, float:1.8478328E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.txt_series = r0
            r0 = 2131428288(0x7f0b03c0, float:1.8478216E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.txt_category = r0
            r0 = 2131428340(0x7f0b03f4, float:1.8478322E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.txt_search = r0
            r0 = 2131428284(0x7f0b03bc, float:1.8478208E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.txt_back = r0
            r0 = 2131427629(0x7f0b012d, float:1.847688E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            r6.et_search = r0
            r0 = 2131428082(0x7f0b02f2, float:1.8477798E38)
            android.view.View r0 = r6.findViewById(r0)
            com.flextv.livestore.view.LiveVerticalGridView r0 = (com.flextv.livestore.view.LiveVerticalGridView) r0
            r6.recycler_series = r0
            r0 = 2131428074(0x7f0b02ea, float:1.8477782E38)
            android.view.View r0 = r6.findViewById(r0)
            com.flextv.livestore.view.LiveVerticalGridView r0 = (com.flextv.livestore.view.LiveVerticalGridView) r0
            r6.recycler_category = r0
            r0 = 2131428157(0x7f0b033d, float:1.847795E38)
            android.view.View r0 = r6.findViewById(r0)
            com.flextv.livestore.view.CustomSpinner r0 = (com.flextv.livestore.view.CustomSpinner) r0
            r6.sort_spinner = r0
            boolean r0 = com.flextv.livestore.helper.GetSharedInfo.isTVDevice(r6)
            r1 = 0
            r2 = 0
            r3 = 1
            if (r0 == 0) goto Lb6
            com.flextv.livestore.view.LiveVerticalGridView r0 = r6.recycler_category
            r0.setNumColumns(r3)
            com.flextv.livestore.view.LiveVerticalGridView r0 = r6.recycler_category
            r0.setLoop(r2)
            com.flextv.livestore.view.LiveVerticalGridView r0 = r6.recycler_category
            r0.setPreserveFocusAfterLayout(r3)
            android.view.View[] r0 = new android.view.View[r3]
            r0[r2] = r1
            com.flextv.livestore.view.LiveVerticalGridView r4 = r6.recycler_category
            com.flextv.livestore.activities.SeriesActivity$4 r5 = new com.flextv.livestore.activities.SeriesActivity$4
            r5.<init>(r0)
            r4.setOnChildViewHolderSelectedListener(r5)
            goto Lc5
        Lb6:
            com.flextv.livestore.view.LiveVerticalGridView r0 = r6.recycler_category
            androidx.recyclerview.widget.LinearLayoutManager r4 = new androidx.recyclerview.widget.LinearLayoutManager
            r4.<init>(r6)
            r0.setLayoutManager(r4)
            com.flextv.livestore.view.LiveVerticalGridView r0 = r6.recycler_category
            r0.setHasFixedSize(r3)
        Lc5:
            boolean r0 = com.flextv.livestore.helper.GetSharedInfo.isTVDevice(r6)
            r4 = 5
            if (r0 == 0) goto Lea
            com.flextv.livestore.view.LiveVerticalGridView r0 = r6.recycler_series
            r0.setNumColumns(r4)
            com.flextv.livestore.view.LiveVerticalGridView r0 = r6.recycler_series
            r0.setLoop(r2)
            com.flextv.livestore.view.LiveVerticalGridView r0 = r6.recycler_series
            r0.setPreserveFocusAfterLayout(r3)
            android.view.View[] r0 = new android.view.View[r3]
            r0[r2] = r1
            com.flextv.livestore.view.LiveVerticalGridView r1 = r6.recycler_series
            com.flextv.livestore.activities.SeriesActivity$5 r2 = new com.flextv.livestore.activities.SeriesActivity$5
            r2.<init>(r0)
            r1.setOnChildViewHolderSelectedListener(r2)
            goto Lf9
        Lea:
            com.flextv.livestore.view.LiveVerticalGridView r0 = r6.recycler_series
            androidx.recyclerview.widget.GridLayoutManager r1 = new androidx.recyclerview.widget.GridLayoutManager
            r1.<init>(r6, r4)
            r0.setLayoutManager(r1)
            com.flextv.livestore.view.LiveVerticalGridView r0 = r6.recycler_series
            r0.setHasFixedSize(r3)
        Lf9:
            android.widget.TextView r0 = r6.txt_home
            com.flextv.livestore.models.WordModels r1 = r6.wordModels
            java.lang.String r1 = r1.getHome()
            r0.setText(r1)
            android.widget.TextView r0 = r6.txt_search
            com.flextv.livestore.models.WordModels r1 = r6.wordModels
            java.lang.String r1 = r1.getSearch()
            r0.setText(r1)
            android.widget.TextView r0 = r6.txt_back
            com.flextv.livestore.models.WordModels r1 = r6.wordModels
            java.lang.String r1 = r1.getBack()
            r0.setText(r1)
            android.widget.TextView r0 = r6.txt_live
            com.flextv.livestore.models.WordModels r1 = r6.wordModels
            java.lang.String r1 = r1.getLive_tv()
            r0.setText(r1)
            android.widget.TextView r0 = r6.txt_movie
            com.flextv.livestore.models.WordModels r1 = r6.wordModels
            java.lang.String r1 = r1.getMovies()
            r0.setText(r1)
            android.widget.TextView r0 = r6.txt_series
            com.flextv.livestore.models.WordModels r1 = r6.wordModels
            java.lang.String r1 = r1.getSeries()
            r0.setText(r1)
            android.widget.LinearLayout r0 = r6.ly_back
            r0.setOnClickListener(r6)
            android.widget.LinearLayout r0 = r6.ly_search
            r0.setOnClickListener(r6)
            android.widget.TextView r0 = r6.txt_home
            r0.setOnClickListener(r6)
            android.widget.TextView r0 = r6.txt_live
            r0.setOnClickListener(r6)
            android.widget.TextView r0 = r6.txt_movie
            r0.setOnClickListener(r6)
            return
    }

    private /* synthetic */ void lambda$GetLoginFromSubtitle$1(org.json.JSONObject r2, int r3) {
            r1 = this;
            if (r2 == 0) goto L18
            com.google.gson.Gson r3 = new com.google.gson.Gson
            r3.<init>()
            java.lang.String r2 = r2.toString()
            java.lang.Class<com.flextv.livestore.models.SubTitleUserModel> r0 = com.flextv.livestore.models.SubTitleUserModel.class
            java.lang.Object r2 = r3.fromJson(r2, r0)
            com.flextv.livestore.models.SubTitleUserModel r2 = (com.flextv.livestore.models.SubTitleUserModel) r2
            com.flextv.livestore.helper.PreferenceHelper r3 = r1.preferenceHelper
            r3.setSharedPreferenceSubtitleLoginModel(r2)
        L18:
            return
    }

    private /* synthetic */ kotlin.Unit lambda$onCreate$0(com.flextv.livestore.models.CategoryModel r3, java.lang.Integer r4, java.lang.Boolean r5) {
            r2 = this;
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L63
            int r5 = r2.category_pos
            int r0 = r4.intValue()
            if (r5 == r0) goto L69
            android.widget.EditText r5 = r2.et_search
            java.lang.String r0 = ""
            r5.setText(r0)
            int r4 = r4.intValue()
            r2.category_pos = r4
            com.flextv.livestore.helper.RealmController r4 = com.flextv.livestore.helper.RealmController.with()
            com.flextv.livestore.helper.PreferenceHelper r5 = r2.preferenceHelper
            boolean r5 = r5.getSharedPreferenceISM3U()
            int r1 = r2.sort_pos
            io.realm.RealmResults r4 = r4.getSeriesModelsByCategory(r3, r0, r5, r1)
            r2.seriesModels = r4
            android.widget.TextView r4 = r2.txt_category
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r3 = r3.getName()
            r5.append(r3)
            java.lang.String r3 = "("
            r5.append(r3)
            io.realm.RealmResults<com.flextv.livestore.models.SeriesModel> r3 = r2.seriesModels
            int r3 = r3.size()
            r5.append(r3)
            java.lang.String r3 = ")"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.setText(r3)
            com.flextv.livestore.adapter.SeriesRecyclerAdapter r3 = r2.seriesAdapter
            io.realm.RealmResults<com.flextv.livestore.models.SeriesModel> r4 = r2.seriesModels
            r3.updateData(r4)
            com.flextv.livestore.view.LiveVerticalGridView r3 = r2.recycler_series
            r4 = 0
            r3.setSelectedPosition(r4)
            goto L69
        L63:
            int r3 = r4.intValue()
            r2.pre_category_pos = r3
        L69:
            r3 = 0
            return r3
    }

    private void searchModels(java.lang.String r5) {
            r4 = this;
            com.flextv.livestore.helper.RealmController r0 = com.flextv.livestore.helper.RealmController.with()
            java.util.List<com.flextv.livestore.models.CategoryModel> r1 = r4.categoryModels
            int r2 = r4.category_pos
            java.lang.Object r1 = r1.get(r2)
            com.flextv.livestore.models.CategoryModel r1 = (com.flextv.livestore.models.CategoryModel) r1
            com.flextv.livestore.helper.PreferenceHelper r2 = r4.preferenceHelper
            boolean r2 = r2.getSharedPreferenceISM3U()
            int r3 = r4.sort_pos
            io.realm.RealmResults r5 = r0.getSeriesModelsByCategory(r1, r5, r2, r3)
            r4.seriesModels = r5
            com.flextv.livestore.adapter.SeriesRecyclerAdapter r0 = r4.seriesAdapter
            r0.updateData(r5)
            com.flextv.livestore.view.LiveVerticalGridView r5 = r4.recycler_series
            r0 = 0
            r5.setSelectedPosition(r0)
            return
    }

    private void setFocusTopView(boolean r2) {
            r1 = this;
            android.widget.TextView r0 = r1.txt_home
            r0.setFocusable(r2)
            android.widget.TextView r0 = r1.txt_live
            r0.setFocusable(r2)
            android.widget.TextView r0 = r1.txt_movie
            r0.setFocusable(r2)
            android.widget.TextView r0 = r1.txt_series
            r0.setFocusable(r2)
            android.widget.EditText r0 = r1.et_search
            r0.setFocusable(r2)
            android.widget.LinearLayout r0 = r1.ly_back
            r0.setFocusable(r2)
            android.widget.LinearLayout r0 = r1.ly_search
            r0.setFocusable(r2)
            return
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent r4) {
            r3 = this;
            int r0 = r4.getAction()
            if (r0 != 0) goto L19f
            int r0 = r4.getKeyCode()
            r1 = 4
            if (r0 == r1) goto L19c
            r1 = 89
            r2 = 10
            if (r0 == r1) goto L172
            r1 = 90
            if (r0 == r1) goto L134
            r1 = 0
            r2 = 1
            switch(r0) {
                case 19: goto Ldf;
                case 20: goto L78;
                case 21: goto L4e;
                case 22: goto L1e;
                default: goto L1c;
            }
        L1c:
            goto L19f
        L1e:
            com.flextv.livestore.view.LiveVerticalGridView r0 = r3.recycler_category
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L2c
            com.flextv.livestore.view.LiveVerticalGridView r4 = r3.recycler_series
            r4.requestFocus()
            return r2
        L2c:
            android.widget.LinearLayout r0 = r3.ly_search
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L3d
            r3.setFocusTopView(r1)
            com.flextv.livestore.view.LiveVerticalGridView r4 = r3.recycler_series
            r4.requestFocus()
            return r2
        L3d:
            com.flextv.livestore.view.CustomSpinner r0 = r3.sort_spinner
            boolean r0 = r0.hasFocus()
            if (r0 != 0) goto L4d
            android.widget.EditText r0 = r3.et_search
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L19f
        L4d:
            return r2
        L4e:
            com.flextv.livestore.view.CustomSpinner r0 = r3.sort_spinner
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L5f
            r3.setFocusTopView(r2)
            android.widget.LinearLayout r4 = r3.ly_search
            r4.requestFocus()
            return r2
        L5f:
            android.widget.TextView r0 = r3.txt_home
            boolean r0 = r0.hasFocus()
            if (r0 != 0) goto L77
            com.flextv.livestore.view.LiveVerticalGridView r0 = r3.recycler_category
            boolean r0 = r0.hasFocus()
            if (r0 != 0) goto L77
            android.widget.LinearLayout r0 = r3.ly_back
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L19f
        L77:
            return r2
        L78:
            android.widget.TextView r0 = r3.txt_home
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L86
            android.widget.LinearLayout r4 = r3.ly_back
            r4.requestFocus()
            return r2
        L86:
            android.widget.TextView r0 = r3.txt_live
            boolean r0 = r0.hasFocus()
            if (r0 != 0) goto Ld9
            android.widget.TextView r0 = r3.txt_movie
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L97
            goto Ld9
        L97:
            android.widget.TextView r0 = r3.txt_series
            boolean r0 = r0.hasFocus()
            if (r0 != 0) goto Ld0
            android.widget.EditText r0 = r3.et_search
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto La8
            goto Ld0
        La8:
            android.widget.LinearLayout r0 = r3.ly_back
            boolean r0 = r0.hasFocus()
            if (r0 != 0) goto Lc7
            android.widget.LinearLayout r0 = r3.ly_search
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto Lb9
            goto Lc7
        Lb9:
            com.flextv.livestore.view.CustomSpinner r0 = r3.sort_spinner
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L19f
            com.flextv.livestore.view.LiveVerticalGridView r4 = r3.recycler_series
            r4.requestFocus()
            return r2
        Lc7:
            r3.setFocusTopView(r1)
            com.flextv.livestore.view.LiveVerticalGridView r4 = r3.recycler_category
            r4.requestFocus()
            return r2
        Ld0:
            r3.setFocusTopView(r1)
            com.flextv.livestore.view.CustomSpinner r4 = r3.sort_spinner
            r4.requestFocus()
            return r2
        Ld9:
            android.widget.LinearLayout r4 = r3.ly_search
            r4.requestFocus()
            return r2
        Ldf:
            com.flextv.livestore.view.LiveVerticalGridView r0 = r3.recycler_category
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto Lf4
            int r0 = r3.pre_category_pos
            if (r0 != 0) goto Lf4
            r3.setFocusTopView(r2)
            android.widget.LinearLayout r4 = r3.ly_back
            r4.requestFocus()
            return r2
        Lf4:
            android.widget.LinearLayout r0 = r3.ly_back
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L102
            android.widget.TextView r4 = r3.txt_home
            r4.requestFocus()
            return r2
        L102:
            android.widget.LinearLayout r0 = r3.ly_search
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L110
            android.widget.TextView r4 = r3.txt_live
            r4.requestFocus()
            return r2
        L110:
            com.flextv.livestore.view.LiveVerticalGridView r0 = r3.recycler_series
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L123
            int r0 = r3.pre_series_pos
            r1 = 5
            if (r0 >= r1) goto L123
            com.flextv.livestore.view.CustomSpinner r4 = r3.sort_spinner
            r4.requestFocus()
            return r2
        L123:
            com.flextv.livestore.view.CustomSpinner r0 = r3.sort_spinner
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L19f
            r3.setFocusTopView(r2)
            android.widget.TextView r4 = r3.txt_series
            r4.requestFocus()
            return r2
        L134:
            com.flextv.livestore.view.LiveVerticalGridView r0 = r3.recycler_category
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L153
            int r0 = r3.pre_category_pos
            java.util.List<com.flextv.livestore.models.CategoryModel> r1 = r3.categoryModels
            int r1 = r1.size()
            int r1 = r1 + (-11)
            if (r0 >= r1) goto L19f
            int r0 = r3.pre_category_pos
            int r0 = r0 + r2
            r3.pre_category_pos = r0
            com.flextv.livestore.view.LiveVerticalGridView r1 = r3.recycler_category
            r1.setSelectedPosition(r0)
            goto L19f
        L153:
            com.flextv.livestore.view.LiveVerticalGridView r0 = r3.recycler_series
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L19f
            int r0 = r3.pre_series_pos
            io.realm.RealmResults<com.flextv.livestore.models.SeriesModel> r1 = r3.seriesModels
            int r1 = r1.size()
            int r1 = r1 + (-11)
            if (r0 >= r1) goto L19f
            int r0 = r3.pre_series_pos
            int r0 = r0 + r2
            r3.pre_series_pos = r0
            com.flextv.livestore.view.LiveVerticalGridView r1 = r3.recycler_series
            r1.setSelectedPosition(r0)
            goto L19f
        L172:
            com.flextv.livestore.view.LiveVerticalGridView r0 = r3.recycler_category
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L187
            int r0 = r3.pre_category_pos
            if (r0 <= r2) goto L19f
            int r0 = r0 - r2
            r3.pre_category_pos = r0
            com.flextv.livestore.view.LiveVerticalGridView r1 = r3.recycler_category
            r1.setSelectedPosition(r0)
            goto L19f
        L187:
            com.flextv.livestore.view.LiveVerticalGridView r0 = r3.recycler_series
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L19f
            int r0 = r3.pre_series_pos
            if (r0 <= r2) goto L19f
            int r0 = r0 - r2
            r3.pre_series_pos = r0
            com.flextv.livestore.view.LiveVerticalGridView r1 = r3.recycler_series
            r1.setSelectedPosition(r0)
            goto L19f
        L19c:
            r3.finish()
        L19f:
            boolean r4 = super.dispatchKeyEvent(r4)
            return r4
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r3) {
            r2 = this;
            int r3 = r3.getId()
            switch(r3) {
                case 2131427891: goto L46;
                case 2131427918: goto L35;
                case 2131428313: goto L46;
                case 2131428316: goto L16;
                case 2131428322: goto L8;
                default: goto L7;
            }
        L7:
            goto L49
        L8:
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<com.flextv.livestore.activities.MovieActivity> r0 = com.flextv.livestore.activities.MovieActivity.class
            r3.<init>(r2, r0)
            r2.startActivity(r3)
            r2.finish()
            goto L49
        L16:
            boolean r3 = com.flextv.livestore.helper.GetSharedInfo.isTVDevice(r2)
            if (r3 == 0) goto L27
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<com.flextv.livestore.activities.LiveActivity> r0 = com.flextv.livestore.activities.LiveActivity.class
            r3.<init>(r2, r0)
            r2.startActivity(r3)
            goto L31
        L27:
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<com.flextv.livestore.activities.mobile.LiveMobileActivity> r0 = com.flextv.livestore.activities.mobile.LiveMobileActivity.class
            r3.<init>(r2, r0)
            r2.startActivity(r3)
        L31:
            r2.finish()
            goto L49
        L35:
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<com.flextv.livestore.activities.SearchActivity> r0 = com.flextv.livestore.activities.SearchActivity.class
            r3.<init>(r2, r0)
            r0 = 0
            java.lang.String r1 = "is_live"
            r3.putExtra(r1, r0)
            r2.startActivity(r3)
            goto L49
        L46:
            r2.finish()
        L49:
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle r10) {
            r9 = this;
            super.onCreate(r10)
            r10 = 2131623984(0x7f0e0030, float:1.8875135E38)
            r9.setContentView(r10)
            com.flextv.livestore.utils.Utils.FullScreenCall(r9)
            com.flextv.livestore.helper.PreferenceHelper r10 = new com.flextv.livestore.helper.PreferenceHelper
            r10.<init>(r9)
            r9.preferenceHelper = r10
            com.flextv.livestore.models.WordModels r10 = com.flextv.livestore.helper.GetSharedInfo.getWordModel(r9)
            r9.wordModels = r10
            r9.initView()
            com.flextv.livestore.models.WordModels r10 = r9.wordModels
            java.util.List r10 = com.flextv.livestore.helper.GetSharedInfo.getVodSortLists(r10)
            r9.sortLists = r10
            com.flextv.livestore.helper.PreferenceHelper r10 = r9.preferenceHelper
            java.util.List r10 = r10.getSharedPreferenceInvisibleSeriesCategories()
            com.flextv.livestore.apps.Constants.getSeriesGroupModels(r10, r9)
            java.util.List<com.flextv.livestore.models.CategoryModel> r10 = com.flextv.livestore.apps.LTVApp.series_categories_filter
            r9.categoryModels = r10
            int r10 = r9.getAvailableCategoryPosition()
            r9.category_pos = r10
            com.flextv.livestore.helper.PreferenceHelper r10 = r9.preferenceHelper
            int r10 = r10.getSharedPreferenceSeriesOrder()
            r9.sort_pos = r10
            com.flextv.livestore.helper.RealmController r10 = com.flextv.livestore.helper.RealmController.with()
            java.util.List<com.flextv.livestore.models.CategoryModel> r0 = r9.categoryModels
            int r1 = r9.category_pos
            java.lang.Object r0 = r0.get(r1)
            com.flextv.livestore.models.CategoryModel r0 = (com.flextv.livestore.models.CategoryModel) r0
            com.flextv.livestore.helper.PreferenceHelper r1 = r9.preferenceHelper
            boolean r1 = r1.getSharedPreferenceISM3U()
            int r2 = r9.sort_pos
            java.lang.String r3 = ""
            io.realm.RealmResults r10 = r10.getSeriesModelsByCategory(r0, r3, r1, r2)
            r9.seriesModels = r10
            android.widget.TextView r10 = r9.txt_category
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.List<com.flextv.livestore.models.CategoryModel> r1 = r9.categoryModels
            int r2 = r9.category_pos
            java.lang.Object r1 = r1.get(r2)
            com.flextv.livestore.models.CategoryModel r1 = (com.flextv.livestore.models.CategoryModel) r1
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = "("
            r0.append(r1)
            io.realm.RealmResults<com.flextv.livestore.models.SeriesModel> r1 = r9.seriesModels
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.setText(r0)
            com.flextv.livestore.adapter.RecyclerVodCategoryAdapter r10 = new com.flextv.livestore.adapter.RecyclerVodCategoryAdapter
            java.util.List<com.flextv.livestore.models.CategoryModel> r3 = r9.categoryModels
            int r4 = r9.category_pos
            com.flextv.livestore.helper.PreferenceHelper r0 = r9.preferenceHelper
            boolean r6 = r0.getSharedPreferenceISM3U()
            com.flextv.livestore.activities.LiveActivity$$ExternalSyntheticLambda3 r8 = new com.flextv.livestore.activities.LiveActivity$$ExternalSyntheticLambda3
            r0 = 5
            r8.<init>(r9, r0)
            r5 = 0
            r7 = 0
            r1 = r10
            r2 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            com.flextv.livestore.view.LiveVerticalGridView r0 = r9.recycler_category
            r0.setAdapter(r10)
            com.flextv.livestore.view.LiveVerticalGridView r10 = r9.recycler_category
            int r0 = r9.category_pos
            r10.setSelectedPosition(r0)
            com.flextv.livestore.adapter.SeriesRecyclerAdapter r10 = new com.flextv.livestore.adapter.SeriesRecyclerAdapter
            io.realm.RealmResults<com.flextv.livestore.models.SeriesModel> r0 = r9.seriesModels
            r1 = 0
            r10.<init>(r9, r0, r1)
            r9.seriesAdapter = r10
            com.flextv.livestore.activities.SeriesActivity$1 r0 = new com.flextv.livestore.activities.SeriesActivity$1
            r0.<init>(r9)
            r10.setItemClickListener(r0)
            com.flextv.livestore.view.LiveVerticalGridView r10 = r9.recycler_series
            com.flextv.livestore.adapter.SeriesRecyclerAdapter r0 = r9.seriesAdapter
            r10.setAdapter(r0)
            com.flextv.livestore.adapter.SortSpinnerAdapter r10 = new com.flextv.livestore.adapter.SortSpinnerAdapter
            java.util.List<java.lang.String> r0 = r9.sortLists
            r10.<init>(r9, r0)
            com.flextv.livestore.view.CustomSpinner r0 = r9.sort_spinner
            r0.setAdapter(r10)
            com.flextv.livestore.view.CustomSpinner r10 = r9.sort_spinner
            int r0 = r9.sort_pos
            r10.setSelection(r0)
            com.flextv.livestore.view.CustomSpinner r10 = r9.sort_spinner
            com.flextv.livestore.activities.SeriesActivity$2 r0 = new com.flextv.livestore.activities.SeriesActivity$2
            r0.<init>(r9)
            r10.setOnItemSelectedListener(r0)
            android.widget.EditText r10 = r9.et_search
            com.flextv.livestore.activities.SeriesActivity$3 r0 = new com.flextv.livestore.activities.SeriesActivity$3
            r0.<init>(r9)
            r10.addTextChangedListener(r0)
            boolean r10 = com.flextv.livestore.helper.GetSharedInfo.isTVDevice(r9)
            if (r10 == 0) goto Lfd
            r9.setFocusTopView(r1)
        Lfd:
            com.flextv.livestore.view.LiveVerticalGridView r10 = r9.recycler_category
            r10.requestFocus()
            r9.GetLoginFromSubtitle()
            return
    }
}
