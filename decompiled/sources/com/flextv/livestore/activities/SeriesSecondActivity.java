package com.flextv.livestore.activities;

/* JADX INFO: loaded from: classes.dex */
public class SeriesSecondActivity extends androidx.appcompat.app.AppCompatActivity implements android.view.View.OnClickListener {
    public java.util.List<com.flextv.livestore.models.CategoryModel> categoryModels;
    public int category_pos;
    public android.widget.EditText et_search;
    public int pre_series_pos;
    public com.flextv.livestore.helper.PreferenceHelper preferenceHelper;
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
    public android.widget.TextView txt_series;
    public com.flextv.livestore.models.WordModels wordModels;

    /* JADX INFO: renamed from: com.flextv.livestore.activities.SeriesSecondActivity$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public class AnonymousClass1 implements com.flextv.livestore.adapter.SeriesRecyclerAdapter.ItemClickListener {
        public final /* synthetic */ com.flextv.livestore.activities.SeriesSecondActivity this$0;

        public static /* synthetic */ void $r8$lambda$QKbQiyE7c9BxkCEXCjVaALYLBZs(com.flextv.livestore.activities.SeriesSecondActivity.AnonymousClass1 r0, int r1) {
                r0.lambda$onUnFavClick$1(r1)
                return
        }

        /* JADX INFO: renamed from: $r8$lambda$aP0Fbg-cTjuOwpQB9IZdhpOoIio, reason: not valid java name */
        public static /* synthetic */ void m74$r8$lambda$aP0FbgcTjuOwpQB9IZdhpOoIio(com.flextv.livestore.activities.SeriesSecondActivity.AnonymousClass1 r0, int r1) {
                r0.lambda$onFavClick$0(r1)
                return
        }

        public AnonymousClass1(com.flextv.livestore.activities.SeriesSecondActivity r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        private /* synthetic */ void lambda$onFavClick$0(int r2) {
                r1 = this;
                com.flextv.livestore.activities.SeriesSecondActivity r0 = r1.this$0
                com.flextv.livestore.adapter.SeriesRecyclerAdapter r0 = r0.seriesAdapter
                r0.notifyItemChanged(r2)
                com.flextv.livestore.activities.SeriesSecondActivity r2 = r1.this$0
                com.flextv.livestore.helper.PreferenceHelper r2 = r2.preferenceHelper
                com.flextv.livestore.helper.RealmController r0 = com.flextv.livestore.helper.RealmController.with()
                java.util.List r0 = r0.getFavSeriesNames()
                r2.setSharedPreferenceSeriesFavNames(r0)
                return
        }

        private /* synthetic */ void lambda$onUnFavClick$1(int r2) {
                r1 = this;
                com.flextv.livestore.activities.SeriesSecondActivity r0 = r1.this$0
                com.flextv.livestore.adapter.SeriesRecyclerAdapter r0 = r0.seriesAdapter
                r0.notifyItemChanged(r2)
                com.flextv.livestore.activities.SeriesSecondActivity r2 = r1.this$0
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
                com.flextv.livestore.activities.SeriesSecondActivity$1$$ExternalSyntheticLambda0 r1 = new com.flextv.livestore.activities.SeriesSecondActivity$1$$ExternalSyntheticLambda0
                r2 = 1
                r1.<init>(r3, r5, r2)
                r0.addToFavSeries(r4, r2, r1)
                return
        }

        @Override // com.flextv.livestore.adapter.SeriesRecyclerAdapter.ItemClickListener
        public void onFocusPosition(int r2) {
                r1 = this;
                com.flextv.livestore.activities.SeriesSecondActivity r0 = r1.this$0
                r0.pre_series_pos = r2
                return
        }

        @Override // com.flextv.livestore.adapter.SeriesRecyclerAdapter.ItemClickListener
        public void onItemClick(com.flextv.livestore.models.SeriesModel r4, int r5) {
                r3 = this;
                com.flextv.livestore.activities.SeriesSecondActivity r5 = r3.this$0
                java.util.Objects.requireNonNull(r5)
                com.flextv.livestore.activities.SeriesSecondActivity r5 = r3.this$0
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
                com.flextv.livestore.activities.SeriesSecondActivity r1 = r3.this$0
                java.lang.Class<com.flextv.livestore.activities.SeasonActivity> r2 = com.flextv.livestore.activities.SeasonActivity.class
                r5.<init>(r1, r2)
                java.lang.String r1 = r4.getName()
                java.lang.String r2 = "series_name"
                r5.putExtra(r2, r1)
                java.lang.String r4 = r4.getSeries_id()
                r5.putExtra(r0, r4)
                com.flextv.livestore.activities.SeriesSecondActivity r4 = r3.this$0
                r4.startActivity(r5)
                goto L80
            L41:
                android.content.Intent r5 = new android.content.Intent
                com.flextv.livestore.activities.SeriesSecondActivity r1 = r3.this$0
                java.lang.Class<com.flextv.livestore.activities.SeriesInfoActivity> r2 = com.flextv.livestore.activities.SeriesInfoActivity.class
                r5.<init>(r1, r2)
                java.lang.String r1 = r4.getName()
                java.lang.String r2 = "name"
                r5.putExtra(r2, r1)
                java.lang.String r1 = r4.getSeries_id()
                r5.putExtra(r0, r1)
                com.flextv.livestore.activities.SeriesSecondActivity r0 = r3.this$0
                com.flextv.livestore.helper.PreferenceHelper r0 = r0.preferenceHelper
                boolean r0 = r0.getSharedPreferenceISM3U()
                java.lang.String r1 = "category_name"
                if (r0 == 0) goto L6e
                java.lang.String r4 = r4.getCategory_name()
                r5.putExtra(r1, r4)
                goto L7b
            L6e:
                com.flextv.livestore.activities.SeriesSecondActivity r0 = r3.this$0
                java.lang.String r4 = r4.getCategory_id()
                java.lang.String r4 = com.flextv.livestore.activities.SeriesSecondActivity.access$000(r0, r4)
                r5.putExtra(r1, r4)
            L7b:
                com.flextv.livestore.activities.SeriesSecondActivity r4 = r3.this$0
                r4.startActivity(r5)
            L80:
                return
        }

        @Override // com.flextv.livestore.adapter.SeriesRecyclerAdapter.ItemClickListener
        public void onUnFavClick(com.flextv.livestore.models.SeriesModel r4, int r5) {
                r3 = this;
                com.flextv.livestore.helper.RealmController r0 = com.flextv.livestore.helper.RealmController.with()
                java.lang.String r4 = r4.getName()
                com.flextv.livestore.activities.SeriesSecondActivity$1$$ExternalSyntheticLambda0 r1 = new com.flextv.livestore.activities.SeriesSecondActivity$1$$ExternalSyntheticLambda0
                r2 = 0
                r1.<init>(r3, r5, r2)
                r0.addToFavSeries(r4, r2, r1)
                return
        }
    }




    public SeriesSecondActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.sortLists = r0
            r0 = 0
            r1.category_pos = r0
            r1.sort_pos = r0
            r1.pre_series_pos = r0
            return
    }

    public static /* synthetic */ java.lang.String access$000(com.flextv.livestore.activities.SeriesSecondActivity r0, java.lang.String r1) {
            java.lang.String r0 = r0.getSeriesCategoryName(r1)
            return r0
    }

    public static /* synthetic */ void access$100(com.flextv.livestore.activities.SeriesSecondActivity r0, java.lang.String r1) {
            r0.searchModels(r1)
            return
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
            r4 = this;
            r0 = 2131428313(0x7f0b03d9, float:1.8478267E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.txt_home = r0
            r0 = 2131428316(0x7f0b03dc, float:1.8478273E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.txt_live = r0
            r0 = 2131428322(0x7f0b03e2, float:1.8478285E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.txt_movie = r0
            r0 = 2131428343(0x7f0b03f7, float:1.8478328E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.txt_series = r0
            r0 = 2131428288(0x7f0b03c0, float:1.8478216E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.txt_category = r0
            r0 = 2131428284(0x7f0b03bc, float:1.8478208E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.txt_back = r0
            r0 = 2131427629(0x7f0b012d, float:1.847688E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            r4.et_search = r0
            r0 = 2131428082(0x7f0b02f2, float:1.8477798E38)
            android.view.View r0 = r4.findViewById(r0)
            com.flextv.livestore.view.LiveVerticalGridView r0 = (com.flextv.livestore.view.LiveVerticalGridView) r0
            r4.recycler_series = r0
            r0 = 2131428157(0x7f0b033d, float:1.847795E38)
            android.view.View r0 = r4.findViewById(r0)
            com.flextv.livestore.view.CustomSpinner r0 = (com.flextv.livestore.view.CustomSpinner) r0
            r4.sort_spinner = r0
            boolean r0 = com.flextv.livestore.helper.GetSharedInfo.isTVDevice(r4)
            r1 = 6
            r2 = 1
            if (r0 == 0) goto L8b
            com.flextv.livestore.view.LiveVerticalGridView r0 = r4.recycler_series
            r0.setNumColumns(r1)
            com.flextv.livestore.view.LiveVerticalGridView r0 = r4.recycler_series
            r1 = 0
            r0.setLoop(r1)
            com.flextv.livestore.view.LiveVerticalGridView r0 = r4.recycler_series
            r0.setPreserveFocusAfterLayout(r2)
            android.view.View[] r0 = new android.view.View[r2]
            r2 = 0
            r0[r1] = r2
            com.flextv.livestore.view.LiveVerticalGridView r1 = r4.recycler_series
            com.flextv.livestore.activities.SeriesSecondActivity$4 r2 = new com.flextv.livestore.activities.SeriesSecondActivity$4
            r2.<init>(r0)
            r1.setOnChildViewHolderSelectedListener(r2)
            goto L9a
        L8b:
            com.flextv.livestore.view.LiveVerticalGridView r0 = r4.recycler_series
            androidx.recyclerview.widget.GridLayoutManager r3 = new androidx.recyclerview.widget.GridLayoutManager
            r3.<init>(r4, r1)
            r0.setLayoutManager(r3)
            com.flextv.livestore.view.LiveVerticalGridView r0 = r4.recycler_series
            r0.setHasFixedSize(r2)
        L9a:
            android.widget.TextView r0 = r4.txt_home
            com.flextv.livestore.models.WordModels r1 = r4.wordModels
            java.lang.String r1 = r1.getHome()
            r0.setText(r1)
            android.widget.TextView r0 = r4.txt_back
            com.flextv.livestore.models.WordModels r1 = r4.wordModels
            java.lang.String r1 = r1.getBack()
            r0.setText(r1)
            android.widget.TextView r0 = r4.txt_live
            com.flextv.livestore.models.WordModels r1 = r4.wordModels
            java.lang.String r1 = r1.getLive_tv()
            r0.setText(r1)
            android.widget.TextView r0 = r4.txt_movie
            com.flextv.livestore.models.WordModels r1 = r4.wordModels
            java.lang.String r1 = r1.getMovies()
            r0.setText(r1)
            android.widget.TextView r0 = r4.txt_series
            com.flextv.livestore.models.WordModels r1 = r4.wordModels
            java.lang.String r1 = r1.getSeries()
            r0.setText(r1)
            android.widget.TextView r0 = r4.txt_home
            r0.setOnClickListener(r4)
            android.widget.TextView r0 = r4.txt_live
            r0.setOnClickListener(r4)
            android.widget.TextView r0 = r4.txt_movie
            r0.setOnClickListener(r4)
            android.widget.TextView r0 = r4.txt_series
            r0.setOnClickListener(r4)
            android.widget.TextView r0 = r4.txt_back
            r0.setOnClickListener(r4)
            return
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
            android.widget.TextView r0 = r1.txt_back
            r0.setFocusable(r2)
            android.widget.EditText r0 = r1.et_search
            r0.setFocusable(r2)
            com.flextv.livestore.view.CustomSpinner r0 = r1.sort_spinner
            r0.setFocusable(r2)
            return
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent r4) {
            r3 = this;
            int r0 = r4.getAction()
            if (r0 != 0) goto L9e
            int r0 = r4.getKeyCode()
            r1 = 4
            if (r0 == r1) goto L9b
            r1 = 89
            r2 = 12
            if (r0 == r1) goto L86
            r1 = 90
            if (r0 == r1) goto L67
            r1 = 1
            switch(r0) {
                case 19: goto L51;
                case 20: goto L3f;
                case 21: goto L2e;
                case 22: goto L1d;
                default: goto L1b;
            }
        L1b:
            goto L9e
        L1d:
            com.flextv.livestore.view.CustomSpinner r0 = r3.sort_spinner
            boolean r0 = r0.hasFocus()
            if (r0 != 0) goto L2d
            android.widget.EditText r0 = r3.et_search
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L9e
        L2d:
            return r1
        L2e:
            android.widget.TextView r0 = r3.txt_back
            boolean r0 = r0.hasFocus()
            if (r0 != 0) goto L3e
            com.flextv.livestore.view.CustomSpinner r0 = r3.sort_spinner
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L9e
        L3e:
            return r1
        L3f:
            com.flextv.livestore.view.CustomSpinner r0 = r3.sort_spinner
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L9e
            r4 = 0
            r3.setFocusTopView(r4)
            com.flextv.livestore.view.LiveVerticalGridView r4 = r3.recycler_series
            r4.requestFocus()
            return r1
        L51:
            com.flextv.livestore.view.LiveVerticalGridView r0 = r3.recycler_series
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L9e
            int r0 = r3.pre_series_pos
            r2 = 6
            if (r0 >= r2) goto L9e
            r3.setFocusTopView(r1)
            com.flextv.livestore.view.CustomSpinner r4 = r3.sort_spinner
            r4.requestFocus()
            return r1
        L67:
            com.flextv.livestore.view.LiveVerticalGridView r0 = r3.recycler_series
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L9e
            int r0 = r3.pre_series_pos
            io.realm.RealmResults<com.flextv.livestore.models.SeriesModel> r1 = r3.seriesModels
            int r1 = r1.size()
            int r1 = r1 + (-13)
            if (r0 >= r1) goto L9e
            int r0 = r3.pre_series_pos
            int r0 = r0 + r2
            r3.pre_series_pos = r0
            com.flextv.livestore.view.LiveVerticalGridView r1 = r3.recycler_series
            r1.setSelectedPosition(r0)
            goto L9e
        L86:
            com.flextv.livestore.view.LiveVerticalGridView r0 = r3.recycler_series
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L9e
            int r0 = r3.pre_series_pos
            if (r0 <= r2) goto L9e
            int r0 = r0 - r2
            r3.pre_series_pos = r0
            com.flextv.livestore.view.LiveVerticalGridView r1 = r3.recycler_series
            r1.setSelectedPosition(r0)
            goto L9e
        L9b:
            r3.finish()
        L9e:
            boolean r4 = super.dispatchKeyEvent(r4)
            return r4
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r4) {
            r3 = this;
            int r4 = r4.getId()
            r0 = -1
            java.lang.String r1 = "is_changed"
            switch(r4) {
                case 2131428284: goto L3e;
                case 2131428313: goto L2d;
                case 2131428316: goto L1c;
                case 2131428322: goto Lb;
                case 2131428343: goto L3e;
                default: goto La;
            }
        La:
            goto L41
        Lb:
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            java.lang.String r2 = "movie"
            r4.putExtra(r1, r2)
            r3.setResult(r0, r4)
            r3.finish()
            goto L41
        L1c:
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            java.lang.String r2 = "live"
            r4.putExtra(r1, r2)
            r3.setResult(r0, r4)
            r3.finish()
            goto L41
        L2d:
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            java.lang.String r2 = "home"
            r4.putExtra(r1, r2)
            r3.setResult(r0, r4)
            r3.finish()
            goto L41
        L3e:
            r3.finish()
        L41:
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle r6) {
            r5 = this;
            super.onCreate(r6)
            r6 = 2131623988(0x7f0e0034, float:1.8875143E38)
            r5.setContentView(r6)
            com.flextv.livestore.utils.Utils.FullScreenCall(r5)
            com.flextv.livestore.helper.PreferenceHelper r6 = new com.flextv.livestore.helper.PreferenceHelper
            r6.<init>(r5)
            r5.preferenceHelper = r6
            com.flextv.livestore.models.WordModels r6 = com.flextv.livestore.helper.GetSharedInfo.getWordModel(r5)
            r5.wordModels = r6
            r5.initView()
            com.flextv.livestore.models.WordModels r6 = r5.wordModels
            java.util.List r6 = com.flextv.livestore.helper.GetSharedInfo.getVodSortLists(r6)
            r5.sortLists = r6
            com.flextv.livestore.helper.PreferenceHelper r6 = r5.preferenceHelper
            java.util.List r6 = r6.getSharedPreferenceInvisibleSeriesCategories()
            com.flextv.livestore.apps.Constants.getSeriesGroupModels(r6, r5)
            java.util.List<com.flextv.livestore.models.CategoryModel> r6 = com.flextv.livestore.apps.LTVApp.series_categories_filter
            r5.categoryModels = r6
            android.content.Intent r6 = r5.getIntent()
            java.lang.String r0 = "category_pos"
            r1 = 0
            int r6 = r6.getIntExtra(r0, r1)
            r5.category_pos = r6
            com.flextv.livestore.helper.PreferenceHelper r6 = r5.preferenceHelper
            int r6 = r6.getSharedPreferenceSeriesOrder()
            r5.sort_pos = r6
            com.flextv.livestore.helper.RealmController r6 = com.flextv.livestore.helper.RealmController.with()
            java.util.List<com.flextv.livestore.models.CategoryModel> r0 = r5.categoryModels
            int r2 = r5.category_pos
            java.lang.Object r0 = r0.get(r2)
            com.flextv.livestore.models.CategoryModel r0 = (com.flextv.livestore.models.CategoryModel) r0
            com.flextv.livestore.helper.PreferenceHelper r2 = r5.preferenceHelper
            boolean r2 = r2.getSharedPreferenceISM3U()
            int r3 = r5.sort_pos
            java.lang.String r4 = ""
            io.realm.RealmResults r6 = r6.getSeriesModelsByCategory(r0, r4, r2, r3)
            r5.seriesModels = r6
            android.widget.TextView r6 = r5.txt_category
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.List<com.flextv.livestore.models.CategoryModel> r2 = r5.categoryModels
            int r3 = r5.category_pos
            java.lang.Object r2 = r2.get(r3)
            com.flextv.livestore.models.CategoryModel r2 = (com.flextv.livestore.models.CategoryModel) r2
            java.lang.String r2 = r2.getName()
            r0.append(r2)
            java.lang.String r2 = "("
            r0.append(r2)
            io.realm.RealmResults<com.flextv.livestore.models.SeriesModel> r2 = r5.seriesModels
            int r2 = r2.size()
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r6.setText(r0)
            com.flextv.livestore.adapter.SeriesRecyclerAdapter r6 = new com.flextv.livestore.adapter.SeriesRecyclerAdapter
            io.realm.RealmResults<com.flextv.livestore.models.SeriesModel> r0 = r5.seriesModels
            r2 = 1
            r6.<init>(r5, r0, r2)
            r5.seriesAdapter = r6
            com.flextv.livestore.activities.SeriesSecondActivity$1 r0 = new com.flextv.livestore.activities.SeriesSecondActivity$1
            r0.<init>(r5)
            r6.setItemClickListener(r0)
            com.flextv.livestore.view.LiveVerticalGridView r6 = r5.recycler_series
            com.flextv.livestore.adapter.SeriesRecyclerAdapter r0 = r5.seriesAdapter
            r6.setAdapter(r0)
            com.flextv.livestore.adapter.SortSpinnerAdapter r6 = new com.flextv.livestore.adapter.SortSpinnerAdapter
            java.util.List<java.lang.String> r0 = r5.sortLists
            r6.<init>(r5, r0)
            com.flextv.livestore.view.CustomSpinner r0 = r5.sort_spinner
            r0.setAdapter(r6)
            com.flextv.livestore.view.CustomSpinner r6 = r5.sort_spinner
            int r0 = r5.sort_pos
            r6.setSelection(r0)
            com.flextv.livestore.view.CustomSpinner r6 = r5.sort_spinner
            com.flextv.livestore.activities.SeriesSecondActivity$2 r0 = new com.flextv.livestore.activities.SeriesSecondActivity$2
            r0.<init>(r5)
            r6.setOnItemSelectedListener(r0)
            android.widget.EditText r6 = r5.et_search
            com.flextv.livestore.activities.SeriesSecondActivity$3 r0 = new com.flextv.livestore.activities.SeriesSecondActivity$3
            r0.<init>(r5)
            r6.addTextChangedListener(r0)
            boolean r6 = com.flextv.livestore.helper.GetSharedInfo.isTVDevice(r5)
            if (r6 == 0) goto Ldf
            r5.setFocusTopView(r1)
        Ldf:
            return
    }
}
