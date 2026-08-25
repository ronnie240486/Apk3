package com.flextv.livestore.activities;

/* JADX INFO: loaded from: classes2.dex */
public class SearchActivity extends androidx.appcompat.app.AppCompatActivity {
    public android.widget.ImageButton btn_back;
    public io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> epgChannels;
    public android.widget.EditText et_search;
    public boolean is_live;
    public com.flextv.livestore.adapter.RecyclerLiveHomeAdapter liveAdapter;
    public com.flextv.livestore.dlgfragment.LockDlgFragment lockDlgFragment;
    public io.realm.RealmResults<com.flextv.livestore.models.MovieModel> movieModels;
    public com.flextv.livestore.helper.PreferenceHelper preferenceHelper;
    public com.flextv.livestore.view.LiveHorizontalGridView recyclerChannels;
    public com.flextv.livestore.view.LiveHorizontalGridView recyclerMovies;
    public com.flextv.livestore.view.LiveHorizontalGridView recyclerSeries;
    public io.realm.RealmResults<com.flextv.livestore.models.SeriesModel> seriesModels;
    public android.widget.TextView str_live;
    public android.widget.TextView str_movies;
    public android.widget.TextView str_series;
    public com.flextv.livestore.adapter.RecyclerVodHomeAdapter vodAdapter;
    public java.lang.String vod_search_key;
    public com.flextv.livestore.models.WordModels wordModels;






    public static /* synthetic */ kotlin.Unit $r8$lambda$HwefPntTKvrh2EatWf3XgtHBVnI(com.flextv.livestore.activities.SearchActivity r0, com.flextv.livestore.models.EPGChannel r1, java.lang.Integer r2, java.lang.Boolean r3) {
            kotlin.Unit r0 = r0.lambda$searchModels$1(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$evbZpc83waeM76hmuulyk93WGBs(com.flextv.livestore.activities.SearchActivity r0, com.flextv.livestore.models.MovieModel r1, java.lang.Integer r2, java.lang.Boolean r3) {
            kotlin.Unit r0 = r0.lambda$searchModels$2(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$fUwGJGv94CyCkXYL5Qk6ETSu_Ks(com.flextv.livestore.activities.SearchActivity r0, android.view.View r1) {
            r0.lambda$initView$4(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$rmQSRv4pNNSlLmoUwOxa55ST0f8() {
            lambda$searchModels$0()
            return
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$thFBuknM4Gb9VeALDkt34fL91XA(com.flextv.livestore.activities.SearchActivity r0, com.flextv.livestore.models.SeriesModel r1, java.lang.Integer r2, java.lang.Boolean r3) {
            kotlin.Unit r0 = r0.lambda$searchModels$3(r1, r2, r3)
            return r0
    }

    public SearchActivity() {
            r1 = this;
            r1.<init>()
            com.flextv.livestore.models.WordModels r0 = new com.flextv.livestore.models.WordModels
            r0.<init>()
            r1.wordModels = r0
            r0 = 0
            r1.is_live = r0
            java.lang.String r0 = ""
            r1.vod_search_key = r0
            return
    }

    public static /* synthetic */ void access$000(com.flextv.livestore.activities.SearchActivity r0, java.lang.String r1) {
            r0.searchModels(r1)
            return
    }

    private boolean checkAdultMovie(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = r1.preferenceHelper
            boolean r0 = r0.getSharedPreferenceISM3U()
            if (r0 == 0) goto L26
            java.lang.String r3 = "xxx"
            boolean r3 = r2.contains(r3)
            if (r3 != 0) goto L24
            java.lang.String r3 = "porn"
            boolean r3 = r2.contains(r3)
            if (r3 != 0) goto L24
            java.lang.String r3 = "adult"
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L22
            goto L24
        L22:
            r2 = 0
            goto L25
        L24:
            r2 = 1
        L25:
            return r2
        L26:
            java.util.List<java.lang.String> r2 = com.flextv.livestore.apps.Constants.xxx_vod_categories
            boolean r2 = r2.contains(r3)
            return r2
    }

    private java.lang.String getMovieCategoryName(java.lang.String r4) {
            r3 = this;
            java.util.List<com.flextv.livestore.models.CategoryModel> r0 = com.flextv.livestore.apps.LTVApp.series_categories_filter
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.next()
            com.flextv.livestore.models.CategoryModel r1 = (com.flextv.livestore.models.CategoryModel) r1
            java.lang.String r2 = r1.getId()
            boolean r2 = r2.equalsIgnoreCase(r4)
            if (r2 == 0) goto L6
            java.lang.String r4 = r1.getName()
            return r4
        L21:
            java.lang.String r4 = "UnNamed Category"
            return r4
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
            boolean r2 = r2.equalsIgnoreCase(r4)
            if (r2 == 0) goto L6
            java.lang.String r4 = r1.getName()
            return r4
        L21:
            java.lang.String r4 = "UnNamed Category"
            return r4
    }

    private void initView() {
            r6 = this;
            r0 = 2131427464(0x7f0b0088, float:1.8476545E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r6.btn_back = r0
            r0 = 2131427629(0x7f0b012d, float:1.847688E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            r6.et_search = r0
            r0 = 2131428198(0x7f0b0366, float:1.8478034E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.str_live = r0
            r0 = 2131428203(0x7f0b036b, float:1.8478044E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.str_movies = r0
            r0 = 2131428209(0x7f0b0371, float:1.8478056E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.str_series = r0
            android.widget.ImageButton r0 = r6.btn_back
            com.flextv.livestore.activities.SearchActivity$$ExternalSyntheticLambda0 r1 = new com.flextv.livestore.activities.SearchActivity$$ExternalSyntheticLambda0
            r2 = 0
            r1.<init>(r6, r2)
            r0.setOnClickListener(r1)
            r0 = 2131428076(0x7f0b02ec, float:1.8477786E38)
            android.view.View r0 = r6.findViewById(r0)
            com.flextv.livestore.view.LiveHorizontalGridView r0 = (com.flextv.livestore.view.LiveHorizontalGridView) r0
            r6.recyclerChannels = r0
            r0 = 2131428085(0x7f0b02f5, float:1.8477805E38)
            android.view.View r0 = r6.findViewById(r0)
            com.flextv.livestore.view.LiveHorizontalGridView r0 = (com.flextv.livestore.view.LiveHorizontalGridView) r0
            r6.recyclerMovies = r0
            r0 = 2131428082(0x7f0b02f2, float:1.8477798E38)
            android.view.View r0 = r6.findViewById(r0)
            com.flextv.livestore.view.LiveHorizontalGridView r0 = (com.flextv.livestore.view.LiveHorizontalGridView) r0
            r6.recyclerSeries = r0
            boolean r0 = com.flextv.livestore.helper.GetSharedInfo.isTVDevice(r6)
            r1 = 0
            r3 = 1
            if (r0 == 0) goto L84
            com.flextv.livestore.view.LiveHorizontalGridView r0 = r6.recyclerChannels
            r0.setLoop(r2)
            com.flextv.livestore.view.LiveHorizontalGridView r0 = r6.recyclerChannels
            r0.setPreserveFocusAfterLayout(r3)
            android.view.View[] r0 = new android.view.View[r3]
            r0[r2] = r1
            com.flextv.livestore.view.LiveHorizontalGridView r4 = r6.recyclerChannels
            com.flextv.livestore.activities.SearchActivity$3 r5 = new com.flextv.livestore.activities.SearchActivity$3
            r5.<init>(r0)
            r4.setOnChildViewHolderSelectedListener(r5)
            goto L93
        L84:
            com.flextv.livestore.view.LiveHorizontalGridView r0 = r6.recyclerChannels
            androidx.recyclerview.widget.LinearLayoutManager r4 = new androidx.recyclerview.widget.LinearLayoutManager
            r4.<init>(r6, r2, r2)
            r0.setLayoutManager(r4)
            com.flextv.livestore.view.LiveHorizontalGridView r0 = r6.recyclerChannels
            r0.setHasFixedSize(r3)
        L93:
            boolean r0 = com.flextv.livestore.helper.GetSharedInfo.isTVDevice(r6)
            if (r0 == 0) goto Lb2
            com.flextv.livestore.view.LiveHorizontalGridView r0 = r6.recyclerMovies
            r0.setLoop(r2)
            com.flextv.livestore.view.LiveHorizontalGridView r0 = r6.recyclerMovies
            r0.setPreserveFocusAfterLayout(r3)
            android.view.View[] r0 = new android.view.View[r3]
            r0[r2] = r1
            com.flextv.livestore.view.LiveHorizontalGridView r4 = r6.recyclerMovies
            com.flextv.livestore.activities.SearchActivity$4 r5 = new com.flextv.livestore.activities.SearchActivity$4
            r5.<init>(r0)
            r4.setOnChildViewHolderSelectedListener(r5)
            goto Lc1
        Lb2:
            com.flextv.livestore.view.LiveHorizontalGridView r0 = r6.recyclerMovies
            androidx.recyclerview.widget.LinearLayoutManager r4 = new androidx.recyclerview.widget.LinearLayoutManager
            r4.<init>(r6, r2, r2)
            r0.setLayoutManager(r4)
            com.flextv.livestore.view.LiveHorizontalGridView r0 = r6.recyclerMovies
            r0.setHasFixedSize(r3)
        Lc1:
            boolean r0 = com.flextv.livestore.helper.GetSharedInfo.isTVDevice(r6)
            if (r0 == 0) goto Le0
            com.flextv.livestore.view.LiveHorizontalGridView r0 = r6.recyclerSeries
            r0.setLoop(r2)
            com.flextv.livestore.view.LiveHorizontalGridView r0 = r6.recyclerSeries
            r0.setPreserveFocusAfterLayout(r3)
            android.view.View[] r0 = new android.view.View[r3]
            r0[r2] = r1
            com.flextv.livestore.view.LiveHorizontalGridView r1 = r6.recyclerSeries
            com.flextv.livestore.activities.SearchActivity$5 r2 = new com.flextv.livestore.activities.SearchActivity$5
            r2.<init>(r0)
            r1.setOnChildViewHolderSelectedListener(r2)
            goto Lef
        Le0:
            com.flextv.livestore.view.LiveHorizontalGridView r0 = r6.recyclerSeries
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            r1.<init>(r6, r2, r2)
            r0.setLayoutManager(r1)
            com.flextv.livestore.view.LiveHorizontalGridView r0 = r6.recyclerSeries
            r0.setHasFixedSize(r3)
        Lef:
            return
    }

    private /* synthetic */ void lambda$initView$4(android.view.View r3) {
            r2 = this;
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r0 = "is_changed"
            java.lang.String r1 = ""
            r3.putExtra(r0, r1)
            r0 = -1
            r2.setResult(r0, r3)
            r2.finish()
            return
    }

    private static /* synthetic */ void lambda$searchModels$0() {
            return
    }

    private /* synthetic */ kotlin.Unit lambda$searchModels$1(com.flextv.livestore.models.EPGChannel r3, java.lang.Integer r4, java.lang.Boolean r5) {
            r2 = this;
            boolean r4 = r5.booleanValue()
            if (r4 == 0) goto L52
            com.flextv.livestore.helper.RealmController r4 = com.flextv.livestore.helper.RealmController.with()
            java.lang.String r5 = r3.getName()
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda0 r0 = com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda0.INSTANCE$10
            r1 = 1
            r4.addToRecentChannels(r5, r1, r0)
            r2.saveCategoryAndChannelPosition(r3)
            boolean r3 = r2.is_live
            if (r3 == 0) goto L2f
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r4 = "is_changed"
            java.lang.String r5 = "from_search"
            r3.putExtra(r4, r5)
            r4 = -1
            r2.setResult(r4, r3)
            r2.finish()
            goto L52
        L2f:
            boolean r3 = com.flextv.livestore.helper.GetSharedInfo.isTVDevice(r2)
            java.lang.String r4 = "is_full"
            if (r3 == 0) goto L45
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<com.flextv.livestore.activities.LiveActivity> r5 = com.flextv.livestore.activities.LiveActivity.class
            r3.<init>(r2, r5)
            r3.putExtra(r4, r1)
            r2.startActivity(r3)
            goto L52
        L45:
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<com.flextv.livestore.activities.mobile.LiveMobileActivity> r5 = com.flextv.livestore.activities.mobile.LiveMobileActivity.class
            r3.<init>(r2, r5)
            r3.putExtra(r4, r1)
            r2.startActivity(r3)
        L52:
            r3 = 0
            return r3
    }

    private /* synthetic */ kotlin.Unit lambda$searchModels$2(com.flextv.livestore.models.MovieModel r2, java.lang.Integer r3, java.lang.Boolean r4) {
            r1 = this;
            boolean r3 = r4.booleanValue()
            if (r3 == 0) goto L5a
            java.lang.String r3 = r2.getCategory_name()
            java.lang.String r4 = r2.getCategory_id()
            boolean r3 = r1.checkAdultMovie(r3, r4)
            if (r3 == 0) goto L20
            java.lang.String r3 = r2.getName()
            java.lang.String r2 = r2.getStream_id()
            r1.showLockDlgFragment(r3, r2)
            goto L5a
        L20:
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<com.flextv.livestore.activities.MovieInfoActivity> r4 = com.flextv.livestore.activities.MovieInfoActivity.class
            r3.<init>(r1, r4)
            java.lang.String r4 = r2.getName()
            java.lang.String r0 = "name"
            r3.putExtra(r0, r4)
            java.lang.String r4 = r2.getStream_id()
            java.lang.String r0 = "stream_id"
            r3.putExtra(r0, r4)
            com.flextv.livestore.helper.PreferenceHelper r4 = r1.preferenceHelper
            boolean r4 = r4.getSharedPreferenceISM3U()
            java.lang.String r0 = "category_name"
            if (r4 == 0) goto L4c
            java.lang.String r2 = r2.getCategory_name()
            r3.putExtra(r0, r2)
            goto L57
        L4c:
            java.lang.String r2 = r2.getCategory_id()
            java.lang.String r2 = r1.getMovieCategoryName(r2)
            r3.putExtra(r0, r2)
        L57:
            r1.startActivity(r3)
        L5a:
            r2 = 0
            return r2
    }

    private /* synthetic */ kotlin.Unit lambda$searchModels$3(com.flextv.livestore.models.SeriesModel r2, java.lang.Integer r3, java.lang.Boolean r4) {
            r1 = this;
            boolean r3 = r4.booleanValue()
            if (r3 == 0) goto L40
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<com.flextv.livestore.activities.SeriesInfoActivity> r4 = com.flextv.livestore.activities.SeriesInfoActivity.class
            r3.<init>(r1, r4)
            java.lang.String r4 = r2.getName()
            java.lang.String r0 = "name"
            r3.putExtra(r0, r4)
            java.lang.String r4 = r2.getSeries_id()
            java.lang.String r0 = "series_id"
            r3.putExtra(r0, r4)
            com.flextv.livestore.helper.PreferenceHelper r4 = r1.preferenceHelper
            boolean r4 = r4.getSharedPreferenceISM3U()
            java.lang.String r0 = "category_name"
            if (r4 == 0) goto L32
            java.lang.String r2 = r2.getCategory_name()
            r3.putExtra(r0, r2)
            goto L3d
        L32:
            java.lang.String r2 = r2.getCategory_id()
            java.lang.String r2 = r1.getSeriesCategoryName(r2)
            r3.putExtra(r0, r2)
        L3d:
            r1.startActivity(r3)
        L40:
            r2 = 0
            return r2
    }

    private void saveCategoryAndChannelPosition(com.flextv.livestore.models.EPGChannel r8) {
            r7 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = r7.preferenceHelper
            java.util.List r0 = r0.getSharedPreferenceInvisibleLiveCategories()
            com.flextv.livestore.apps.Constants.getLiveGroupModels(r0, r7)
            java.util.List<com.flextv.livestore.models.CategoryModel> r0 = com.flextv.livestore.apps.LTVApp.live_categories_filter
            com.flextv.livestore.helper.PreferenceHelper r1 = r7.preferenceHelper
            boolean r1 = r1.getSharedPreferenceISM3U()
            r2 = 0
            if (r1 == 0) goto L35
            java.lang.String r1 = r8.getCategory_name()
            r3 = 0
        L19:
            int r4 = r0.size()
            if (r3 >= r4) goto L33
            java.lang.Object r4 = r0.get(r3)
            com.flextv.livestore.models.CategoryModel r4 = (com.flextv.livestore.models.CategoryModel) r4
            java.lang.String r4 = r4.getName()
            boolean r4 = r4.equalsIgnoreCase(r1)
            if (r4 == 0) goto L30
            goto L55
        L30:
            int r3 = r3 + 1
            goto L19
        L33:
            r3 = 0
            goto L55
        L35:
            java.lang.String r1 = r8.getCategory_id()
            r3 = 0
            r4 = 0
        L3b:
            int r5 = r0.size()
            if (r4 >= r5) goto L55
            java.lang.Object r5 = r0.get(r4)
            com.flextv.livestore.models.CategoryModel r5 = (com.flextv.livestore.models.CategoryModel) r5
            java.lang.String r5 = r5.getId()
            boolean r5 = r5.equalsIgnoreCase(r1)
            if (r5 == 0) goto L52
            r3 = r4
        L52:
            int r4 = r4 + 1
            goto L3b
        L55:
            com.flextv.livestore.helper.RealmController r1 = com.flextv.livestore.helper.RealmController.with()
            java.lang.Object r0 = r0.get(r3)
            com.flextv.livestore.models.CategoryModel r0 = (com.flextv.livestore.models.CategoryModel) r0
            com.flextv.livestore.helper.PreferenceHelper r4 = r7.preferenceHelper
            boolean r4 = r4.getSharedPreferenceISM3U()
            com.flextv.livestore.helper.PreferenceHelper r5 = r7.preferenceHelper
            int r5 = r5.getSharedPreferenceLiveOrder()
            java.lang.String r6 = ""
            io.realm.RealmResults r0 = r1.getLiveChannelsByCategory(r0, r6, r4, r5)
            r1 = 0
        L72:
            int r4 = r0.size()
            if (r1 >= r4) goto L91
            java.lang.String r4 = r8.getName()
            java.lang.Object r5 = r0.get(r1)
            com.flextv.livestore.models.EPGChannel r5 = (com.flextv.livestore.models.EPGChannel) r5
            java.lang.String r5 = r5.getName()
            boolean r4 = r4.equalsIgnoreCase(r5)
            if (r4 == 0) goto L8e
            r2 = r1
            goto L91
        L8e:
            int r1 = r1 + 1
            goto L72
        L91:
            com.flextv.livestore.helper.PreferenceHelper r8 = r7.preferenceHelper
            r8.setSharedPreferenceCategoryPos(r3)
            com.flextv.livestore.helper.PreferenceHelper r8 = r7.preferenceHelper
            r8.setSharedPreferenceChannelPos(r2)
            return
    }

    private void searchModels(java.lang.String r6) {
            r5 = this;
            com.flextv.livestore.helper.RealmController r0 = com.flextv.livestore.helper.RealmController.with()
            com.flextv.livestore.helper.PreferenceHelper r1 = r5.preferenceHelper
            boolean r1 = r1.getSharedPreferenceISM3U()
            io.realm.RealmResults r0 = r0.getLiveChannelsByKey(r6, r1)
            r5.epgChannels = r0
            com.flextv.livestore.helper.RealmController r0 = com.flextv.livestore.helper.RealmController.with()
            com.flextv.livestore.helper.PreferenceHelper r1 = r5.preferenceHelper
            boolean r1 = r1.getSharedPreferenceISM3U()
            io.realm.RealmResults r0 = r0.getMoviesByKey(r6, r1)
            r5.movieModels = r0
            com.flextv.livestore.helper.RealmController r0 = com.flextv.livestore.helper.RealmController.with()
            io.realm.RealmResults r6 = r0.getSeriesByKey(r6)
            r5.seriesModels = r6
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r6 = r5.epgChannels
            r0 = 8
            r1 = 0
            if (r6 == 0) goto L5f
            int r6 = r6.size()
            if (r6 <= 0) goto L5f
            android.widget.TextView r6 = r5.str_live
            r6.setVisibility(r1)
            com.flextv.livestore.view.LiveHorizontalGridView r6 = r5.recyclerChannels
            r6.setVisibility(r1)
            com.flextv.livestore.adapter.RecyclerLiveHomeAdapter r6 = new com.flextv.livestore.adapter.RecyclerLiveHomeAdapter
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.flextv.livestore.activities.SearchActivity$$ExternalSyntheticLambda1 r3 = new com.flextv.livestore.activities.SearchActivity$$ExternalSyntheticLambda1
            r3.<init>(r5, r1)
            r6.<init>(r5, r2, r3)
            r5.liveAdapter = r6
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r2 = r5.epgChannels
            r6.setEpgChannels(r2)
            com.flextv.livestore.view.LiveHorizontalGridView r6 = r5.recyclerChannels
            com.flextv.livestore.adapter.RecyclerLiveHomeAdapter r2 = r5.liveAdapter
            r6.setAdapter(r2)
            goto L69
        L5f:
            android.widget.TextView r6 = r5.str_live
            r6.setVisibility(r0)
            com.flextv.livestore.view.LiveHorizontalGridView r6 = r5.recyclerChannels
            r6.setVisibility(r0)
        L69:
            io.realm.RealmResults<com.flextv.livestore.models.MovieModel> r6 = r5.movieModels
            if (r6 == 0) goto L9c
            int r6 = r6.size()
            if (r6 <= 0) goto L9c
            android.widget.TextView r6 = r5.str_movies
            r6.setVisibility(r1)
            com.flextv.livestore.view.LiveHorizontalGridView r6 = r5.recyclerMovies
            r6.setVisibility(r1)
            com.flextv.livestore.adapter.RecyclerVodHomeAdapter r6 = new com.flextv.livestore.adapter.RecyclerVodHomeAdapter
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.flextv.livestore.activities.SearchActivity$$ExternalSyntheticLambda1 r3 = new com.flextv.livestore.activities.SearchActivity$$ExternalSyntheticLambda1
            r4 = 1
            r3.<init>(r5, r4)
            r6.<init>(r5, r2, r3)
            r5.vodAdapter = r6
            io.realm.RealmResults<com.flextv.livestore.models.MovieModel> r2 = r5.movieModels
            r6.setModels(r2)
            com.flextv.livestore.view.LiveHorizontalGridView r6 = r5.recyclerMovies
            com.flextv.livestore.adapter.RecyclerVodHomeAdapter r2 = r5.vodAdapter
            r6.setAdapter(r2)
            goto La6
        L9c:
            android.widget.TextView r6 = r5.str_movies
            r6.setVisibility(r0)
            com.flextv.livestore.view.LiveHorizontalGridView r6 = r5.recyclerMovies
            r6.setVisibility(r0)
        La6:
            io.realm.RealmResults<com.flextv.livestore.models.SeriesModel> r6 = r5.seriesModels
            if (r6 == 0) goto Lcd
            int r6 = r6.size()
            if (r6 <= 0) goto Lcd
            android.widget.TextView r6 = r5.str_series
            r6.setVisibility(r1)
            com.flextv.livestore.view.LiveHorizontalGridView r6 = r5.recyclerSeries
            r6.setVisibility(r1)
            com.flextv.livestore.adapter.RecyclerSeriesHomeAdapter r6 = new com.flextv.livestore.adapter.RecyclerSeriesHomeAdapter
            io.realm.RealmResults<com.flextv.livestore.models.SeriesModel> r0 = r5.seriesModels
            com.flextv.livestore.activities.SearchActivity$$ExternalSyntheticLambda1 r1 = new com.flextv.livestore.activities.SearchActivity$$ExternalSyntheticLambda1
            r2 = 2
            r1.<init>(r5, r2)
            r6.<init>(r5, r0, r1)
            com.flextv.livestore.view.LiveHorizontalGridView r0 = r5.recyclerSeries
            r0.setAdapter(r6)
            goto Ld7
        Lcd:
            android.widget.TextView r6 = r5.str_series
            r6.setVisibility(r0)
            com.flextv.livestore.view.LiveHorizontalGridView r6 = r5.recyclerSeries
            r6.setVisibility(r0)
        Ld7:
            return
    }

    private void showLockDlgFragment(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            androidx.fragment.app.FragmentManager r0 = r4.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r1 = r0.beginTransaction()
            java.lang.String r2 = "fragment_lock"
            androidx.fragment.app.Fragment r3 = r0.findFragmentByTag(r2)
            if (r3 == 0) goto L15
            r5 = 0
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r5)
            return
        L15:
            com.flextv.livestore.helper.PreferenceHelper r1 = r4.preferenceHelper
            java.lang.String r1 = r1.getSharedPreferenceParentPassword()
            com.flextv.livestore.dlgfragment.LockDlgFragment r1 = com.flextv.livestore.dlgfragment.LockDlgFragment.newInstance(r1)
            r4.lockDlgFragment = r1
            com.flextv.livestore.activities.SearchActivity$2 r3 = new com.flextv.livestore.activities.SearchActivity$2
            r3.<init>(r4, r5, r6)
            r1.setOnPinEventListener(r3)
            com.flextv.livestore.dlgfragment.LockDlgFragment r5 = r4.lockDlgFragment
            r5.show(r0, r2)
            return
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent r4) {
            r3 = this;
            int r0 = r4.getAction()
            if (r0 != 0) goto L63
            int r0 = r4.getKeyCode()
            r1 = 4
            if (r0 == r1) goto L50
            r1 = 19
            r2 = 1
            if (r0 == r1) goto L42
            r1 = 21
            if (r0 == r1) goto L2f
            r1 = 22
            if (r0 == r1) goto L1b
            goto L63
        L1b:
            android.widget.ImageButton r0 = r3.btn_back
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L63
            android.widget.ImageButton r4 = r3.btn_back
            r0 = 0
            r4.setFocusable(r0)
            android.widget.EditText r4 = r3.et_search
            r4.requestFocus()
            return r2
        L2f:
            android.widget.EditText r0 = r3.et_search
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L63
            android.widget.ImageButton r4 = r3.btn_back
            r4.setFocusable(r2)
            android.widget.ImageButton r4 = r3.btn_back
            r4.requestFocus()
            return r2
        L42:
            com.flextv.livestore.view.LiveHorizontalGridView r0 = r3.recyclerChannels
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L63
            android.widget.EditText r4 = r3.et_search
            r4.requestFocus()
            return r2
        L50:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "is_changed"
            java.lang.String r2 = ""
            r0.putExtra(r1, r2)
            r1 = -1
            r3.setResult(r1, r0)
            r3.finish()
        L63:
            boolean r4 = super.dispatchKeyEvent(r4)
            return r4
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle r3) {
            r2 = this;
            super.onCreate(r3)
            r3 = 2131623982(0x7f0e002e, float:1.887513E38)
            r2.setContentView(r3)
            com.flextv.livestore.utils.Utils.FullScreenCall(r2)
            com.flextv.livestore.helper.PreferenceHelper r3 = new com.flextv.livestore.helper.PreferenceHelper
            r3.<init>(r2)
            r2.preferenceHelper = r3
            com.flextv.livestore.models.WordModels r3 = com.flextv.livestore.helper.GetSharedInfo.getWordModel(r2)
            r2.wordModels = r3
            r2.initView()
            android.content.Intent r3 = r2.getIntent()
            java.lang.String r0 = "is_live"
            r1 = 0
            boolean r3 = r3.getBooleanExtra(r0, r1)
            r2.is_live = r3
            android.content.Intent r3 = r2.getIntent()
            java.lang.String r0 = "search_key"
            java.lang.String r3 = r3.getStringExtra(r0)
            r2.vod_search_key = r3
            android.widget.TextView r3 = r2.str_live
            com.flextv.livestore.models.WordModels r0 = r2.wordModels
            java.lang.String r0 = r0.getLive_tv()
            r3.setText(r0)
            android.widget.TextView r3 = r2.str_movies
            com.flextv.livestore.models.WordModels r0 = r2.wordModels
            java.lang.String r0 = r0.getMovies()
            r3.setText(r0)
            android.widget.TextView r3 = r2.str_series
            com.flextv.livestore.models.WordModels r0 = r2.wordModels
            java.lang.String r0 = r0.getSeries()
            r3.setText(r0)
            android.widget.EditText r3 = r2.et_search
            com.flextv.livestore.models.WordModels r0 = r2.wordModels
            java.lang.String r0 = r0.getSearch_by_title()
            r3.setHint(r0)
            android.widget.EditText r3 = r2.et_search
            com.flextv.livestore.activities.SearchActivity$1 r0 = new com.flextv.livestore.activities.SearchActivity$1
            r0.<init>(r2)
            r3.addTextChangedListener(r0)
            android.widget.ImageButton r3 = r2.btn_back
            r3.setFocusable(r1)
            java.lang.String r3 = r2.vod_search_key
            if (r3 == 0) goto L8d
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L8d
            android.widget.EditText r3 = r2.et_search
            java.lang.String r0 = r2.vod_search_key
            r3.setText(r0)
            com.flextv.livestore.view.LiveHorizontalGridView r3 = r2.recyclerMovies
            r3.requestFocus()
            android.widget.EditText r3 = r2.et_search
            r3.setFocusable(r1)
            goto L92
        L8d:
            android.widget.EditText r3 = r2.et_search
            r3.requestFocus()
        L92:
            return
    }
}
