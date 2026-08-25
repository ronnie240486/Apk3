package com.flextv.livestore.activities;

/* JADX INFO: loaded from: classes2.dex */
public class MovieSecondActivity extends androidx.appcompat.app.AppCompatActivity implements android.view.View.OnClickListener {
    public java.util.List<com.flextv.livestore.models.CategoryModel> categoryModels;
    public int category_pos;
    public android.widget.EditText et_search;
    public com.flextv.livestore.dlgfragment.LockDlgFragment lockDlgFragment;
    public io.realm.RealmResults<com.flextv.livestore.models.MovieModel> movieModels;
    public int pre_movie_pos;
    public com.flextv.livestore.helper.PreferenceHelper preferenceHelper;
    public com.flextv.livestore.view.LiveVerticalGridView recycler_movie;
    public java.util.List<java.lang.String> sortLists;
    public int sort_pos;
    public com.flextv.livestore.view.CustomSpinner sort_spinner;
    public android.widget.TextView txt_back;
    public android.widget.TextView txt_category;
    public android.widget.TextView txt_home;
    public android.widget.TextView txt_live;
    public android.widget.TextView txt_movie;
    public android.widget.TextView txt_series;
    public com.flextv.livestore.adapter.VodRecyclerAdapter vodAdapter;
    public com.flextv.livestore.models.WordModels wordModels;

    /* JADX INFO: renamed from: com.flextv.livestore.activities.MovieSecondActivity$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public class AnonymousClass1 implements com.flextv.livestore.adapter.VodRecyclerAdapter.ItemClickListener {
        public final /* synthetic */ com.flextv.livestore.activities.MovieSecondActivity this$0;

        public static /* synthetic */ void $r8$lambda$LZcxrUffqM_kqFDFVofFO6T1EKE(com.flextv.livestore.activities.MovieSecondActivity.AnonymousClass1 r0, int r1) {
                r0.lambda$onUnFavClick$1(r1)
                return
        }

        public static /* synthetic */ void $r8$lambda$zhDVwLdVPBxBf6sN1c3jq1HMEVs(com.flextv.livestore.activities.MovieSecondActivity.AnonymousClass1 r0, int r1) {
                r0.lambda$onFavClick$0(r1)
                return
        }

        public AnonymousClass1(com.flextv.livestore.activities.MovieSecondActivity r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        private /* synthetic */ void lambda$onFavClick$0(int r2) {
                r1 = this;
                com.flextv.livestore.activities.MovieSecondActivity r0 = r1.this$0
                com.flextv.livestore.adapter.VodRecyclerAdapter r0 = r0.vodAdapter
                r0.notifyItemChanged(r2)
                com.flextv.livestore.activities.MovieSecondActivity r2 = r1.this$0
                com.flextv.livestore.helper.PreferenceHelper r2 = r2.preferenceHelper
                com.flextv.livestore.helper.RealmController r0 = com.flextv.livestore.helper.RealmController.with()
                java.util.List r0 = r0.getFavMovieNames()
                r2.setSharedPreferenceVodFavNames(r0)
                return
        }

        private /* synthetic */ void lambda$onUnFavClick$1(int r2) {
                r1 = this;
                com.flextv.livestore.activities.MovieSecondActivity r0 = r1.this$0
                com.flextv.livestore.adapter.VodRecyclerAdapter r0 = r0.vodAdapter
                r0.notifyItemChanged(r2)
                com.flextv.livestore.activities.MovieSecondActivity r2 = r1.this$0
                com.flextv.livestore.helper.PreferenceHelper r2 = r2.preferenceHelper
                com.flextv.livestore.helper.RealmController r0 = com.flextv.livestore.helper.RealmController.with()
                java.util.List r0 = r0.getFavMovieNames()
                r2.setSharedPreferenceVodFavNames(r0)
                return
        }

        @Override // com.flextv.livestore.adapter.VodRecyclerAdapter.ItemClickListener
        public void onFavClick(com.flextv.livestore.models.MovieModel r5, int r6) {
                r4 = this;
                java.util.List<java.lang.String> r0 = com.flextv.livestore.apps.Constants.xxx_vod_categories
                com.flextv.livestore.activities.MovieSecondActivity r1 = r4.this$0
                java.util.List<com.flextv.livestore.models.CategoryModel> r2 = r1.categoryModels
                int r1 = r1.category_pos
                java.lang.Object r1 = r2.get(r1)
                com.flextv.livestore.models.CategoryModel r1 = (com.flextv.livestore.models.CategoryModel) r1
                java.lang.String r1 = r1.getId()
                boolean r0 = r0.contains(r1)
                if (r0 != 0) goto L2a
                com.flextv.livestore.helper.RealmController r0 = com.flextv.livestore.helper.RealmController.with()
                java.lang.String r5 = r5.getName()
                r1 = 1
                com.flextv.livestore.activities.MovieSecondActivity$1$$ExternalSyntheticLambda0 r2 = new com.flextv.livestore.activities.MovieSecondActivity$1$$ExternalSyntheticLambda0
                r3 = 0
                r2.<init>(r4, r6, r3)
                r0.addToFavMovie(r5, r1, r2)
            L2a:
                return
        }

        @Override // com.flextv.livestore.adapter.VodRecyclerAdapter.ItemClickListener
        public void onFocusPosition(int r2) {
                r1 = this;
                com.flextv.livestore.activities.MovieSecondActivity r0 = r1.this$0
                r0.pre_movie_pos = r2
                return
        }

        @Override // com.flextv.livestore.adapter.VodRecyclerAdapter.ItemClickListener
        public void onItemClick(com.flextv.livestore.models.MovieModel r4, int r5) {
                r3 = this;
                com.flextv.livestore.activities.MovieSecondActivity r0 = r3.this$0
                int r1 = r0.category_pos
                r2 = 1
                if (r1 > r2) goto L1f
                java.lang.String r1 = r4.getCategory_name()
                java.lang.String r1 = r1.toLowerCase()
                java.lang.String r2 = r4.getCategory_id()
                boolean r0 = com.flextv.livestore.activities.MovieSecondActivity.access$000(r0, r1, r2)
                if (r0 == 0) goto L1f
                com.flextv.livestore.activities.MovieSecondActivity r0 = r3.this$0
                com.flextv.livestore.activities.MovieSecondActivity.access$100(r0, r4, r5)
                goto L85
            L1f:
                com.flextv.livestore.activities.MovieSecondActivity r5 = r3.this$0
                java.util.Objects.requireNonNull(r5)
                com.flextv.livestore.activities.MovieSecondActivity r5 = r3.this$0
                java.util.List<com.flextv.livestore.models.CategoryModel> r0 = r5.categoryModels
                int r5 = r5.category_pos
                java.lang.Object r5 = r0.get(r5)
                com.flextv.livestore.models.CategoryModel r5 = (com.flextv.livestore.models.CategoryModel) r5
                java.lang.String r5 = r5.getId()
                java.lang.String r0 = "resume_id"
                boolean r5 = r5.equalsIgnoreCase(r0)
                if (r5 == 0) goto L43
                com.flextv.livestore.activities.MovieSecondActivity r5 = r3.this$0
                com.flextv.livestore.activities.MovieSecondActivity.access$200(r5, r4)
                goto L85
            L43:
                android.content.Intent r5 = new android.content.Intent
                com.flextv.livestore.activities.MovieSecondActivity r0 = r3.this$0
                java.lang.Class<com.flextv.livestore.activities.MovieInfoActivity> r1 = com.flextv.livestore.activities.MovieInfoActivity.class
                r5.<init>(r0, r1)
                java.lang.String r0 = r4.getName()
                java.lang.String r1 = "name"
                r5.putExtra(r1, r0)
                java.lang.String r0 = r4.getStream_id()
                java.lang.String r1 = "stream_id"
                r5.putExtra(r1, r0)
                com.flextv.livestore.activities.MovieSecondActivity r0 = r3.this$0
                com.flextv.livestore.helper.PreferenceHelper r0 = r0.preferenceHelper
                boolean r0 = r0.getSharedPreferenceISM3U()
                java.lang.String r1 = "category_name"
                if (r0 == 0) goto L73
                java.lang.String r4 = r4.getCategory_name()
                r5.putExtra(r1, r4)
                goto L80
            L73:
                com.flextv.livestore.activities.MovieSecondActivity r0 = r3.this$0
                java.lang.String r4 = r4.getCategory_id()
                java.lang.String r4 = com.flextv.livestore.activities.MovieSecondActivity.access$300(r0, r4)
                r5.putExtra(r1, r4)
            L80:
                com.flextv.livestore.activities.MovieSecondActivity r4 = r3.this$0
                r4.startActivity(r5)
            L85:
                return
        }

        @Override // com.flextv.livestore.adapter.VodRecyclerAdapter.ItemClickListener
        public void onUnFavClick(com.flextv.livestore.models.MovieModel r4, int r5) {
                r3 = this;
                com.flextv.livestore.helper.RealmController r0 = com.flextv.livestore.helper.RealmController.with()
                java.lang.String r4 = r4.getName()
                com.flextv.livestore.activities.MovieSecondActivity$1$$ExternalSyntheticLambda0 r1 = new com.flextv.livestore.activities.MovieSecondActivity$1$$ExternalSyntheticLambda0
                r2 = 1
                r1.<init>(r3, r5, r2)
                r5 = 0
                r0.addToFavMovie(r4, r5, r1)
                return
        }
    }





    public static /* synthetic */ void $r8$lambda$Etr2qbMIUxmkYeUWDMrhgSdLeZw(com.flextv.livestore.activities.MovieSecondActivity r0, int r1, android.content.DialogInterface r2, int r3) {
            r0.lambda$showExternalPlayerDialog$0(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$a-Tbt9RYgzU5H-vomdtk9xOUPcw, reason: not valid java name */
    public static /* synthetic */ void m65$r8$lambda$aTbt9RYgzU5Hvomdtk9xOUPcw(android.content.DialogInterface r0, int r1) {
            lambda$showExternalPlayerDialog$1(r0, r1)
            return
    }

    static {
            java.lang.Class<com.flextv.livestore.activities.MovieSecondActivity> r0 = com.flextv.livestore.activities.MovieSecondActivity.class
            return
    }

    public MovieSecondActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.sortLists = r0
            r0 = 0
            r1.category_pos = r0
            r1.sort_pos = r0
            r1.pre_movie_pos = r0
            return
    }

    public static /* synthetic */ boolean access$000(com.flextv.livestore.activities.MovieSecondActivity r0, java.lang.String r1, java.lang.String r2) {
            boolean r0 = r0.checkAdultMovie(r1, r2)
            return r0
    }

    public static /* synthetic */ void access$100(com.flextv.livestore.activities.MovieSecondActivity r0, com.flextv.livestore.models.MovieModel r1, int r2) {
            r0.showMovieLockDlgFragment(r1, r2)
            return
    }

    public static /* synthetic */ void access$200(com.flextv.livestore.activities.MovieSecondActivity r0, com.flextv.livestore.models.MovieModel r1) {
            r0.playRecentMovie(r1)
            return
    }

    public static /* synthetic */ java.lang.String access$300(com.flextv.livestore.activities.MovieSecondActivity r0, java.lang.String r1) {
            java.lang.String r0 = r0.getMovieCategoryName(r1)
            return r0
    }

    public static /* synthetic */ void access$400(com.flextv.livestore.activities.MovieSecondActivity r0, java.lang.String r1) {
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

    private void externalMXplayer(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch: android.content.ActivityNotFoundException -> L19
            android.content.Intent r0 = new android.content.Intent     // Catch: android.content.ActivityNotFoundException -> L19
            java.lang.String r1 = "android.intent.action.VIEW"
            r0.<init>(r1)     // Catch: android.content.ActivityNotFoundException -> L19
            r0.setPackage(r3)     // Catch: android.content.ActivityNotFoundException -> L19
            r0.setClassName(r3, r4)     // Catch: android.content.ActivityNotFoundException -> L19
            java.lang.String r3 = "application/x-mpegURL"
            r0.setDataAndType(r5, r3)     // Catch: android.content.ActivityNotFoundException -> L19
            r2.startActivity(r0)     // Catch: android.content.ActivityNotFoundException -> L19
        L19:
            return
    }

    private void externalvlcplayer(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            android.net.Uri r5 = android.net.Uri.parse(r5)
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.VIEW"
            r0.<init>(r1)
            java.lang.String r1 = "org.videolan.vlc"
            r0.setPackage(r1)
            java.lang.String r2 = "video/*"
            r0.setDataAndTypeAndNormalize(r5, r2)
            java.lang.String r5 = "title"
            r0.putExtra(r5, r6)
            java.lang.String r5 = "from_start"
            r6 = 1
            r0.putExtra(r5, r6)
            java.lang.String r5 = "position"
            r2 = 90000(0x15f90, double:4.4466E-319)
            r0.putExtra(r5, r2)
            android.content.ComponentName r5 = new android.content.ComponentName
            java.lang.String r6 = "org.videolan.vlc.gui.video.VideoPlayerActivity"
            r5.<init>(r1, r6)
            r0.setComponent(r5)
            r4.startActivity(r0)
            return
    }

    private java.lang.String getMovieCategoryName(java.lang.String r4) {
            r3 = this;
            java.util.List<com.flextv.livestore.models.CategoryModel> r0 = com.flextv.livestore.apps.LTVApp.vod_categories_filter
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

    private void goToLiveActivity() {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "is_changed"
            java.lang.String r2 = "live"
            r0.putExtra(r1, r2)
            r1 = -1
            r3.setResult(r1, r0)
            r3.finish()
            return
    }

    private void goToSeriesActivity() {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "is_changed"
            java.lang.String r2 = "series"
            r0.putExtra(r1, r2)
            r1 = -1
            r3.setResult(r1, r0)
            r3.finish()
            return
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
            r0 = 2131428284(0x7f0b03bc, float:1.8478208E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.txt_back = r0
            r0 = 2131428288(0x7f0b03c0, float:1.8478216E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.txt_category = r0
            r0 = 2131427629(0x7f0b012d, float:1.847688E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            r4.et_search = r0
            r0 = 2131428080(0x7f0b02f0, float:1.8477794E38)
            android.view.View r0 = r4.findViewById(r0)
            com.flextv.livestore.view.LiveVerticalGridView r0 = (com.flextv.livestore.view.LiveVerticalGridView) r0
            r4.recycler_movie = r0
            r0 = 2131428157(0x7f0b033d, float:1.847795E38)
            android.view.View r0 = r4.findViewById(r0)
            com.flextv.livestore.view.CustomSpinner r0 = (com.flextv.livestore.view.CustomSpinner) r0
            r4.sort_spinner = r0
            boolean r0 = com.flextv.livestore.helper.GetSharedInfo.isTVDevice(r4)
            r1 = 6
            r2 = 1
            if (r0 == 0) goto L8b
            com.flextv.livestore.view.LiveVerticalGridView r0 = r4.recycler_movie
            r0.setNumColumns(r1)
            com.flextv.livestore.view.LiveVerticalGridView r0 = r4.recycler_movie
            r1 = 0
            r0.setLoop(r1)
            com.flextv.livestore.view.LiveVerticalGridView r0 = r4.recycler_movie
            r0.setPreserveFocusAfterLayout(r2)
            android.view.View[] r0 = new android.view.View[r2]
            r2 = 0
            r0[r1] = r2
            com.flextv.livestore.view.LiveVerticalGridView r1 = r4.recycler_movie
            com.flextv.livestore.activities.MovieSecondActivity$4 r2 = new com.flextv.livestore.activities.MovieSecondActivity$4
            r2.<init>(r0)
            r1.setOnChildViewHolderSelectedListener(r2)
            goto L9a
        L8b:
            com.flextv.livestore.view.LiveVerticalGridView r0 = r4.recycler_movie
            androidx.recyclerview.widget.GridLayoutManager r3 = new androidx.recyclerview.widget.GridLayoutManager
            r3.<init>(r4, r1)
            r0.setLayoutManager(r3)
            com.flextv.livestore.view.LiveVerticalGridView r0 = r4.recycler_movie
            r0.setHasFixedSize(r2)
        L9a:
            android.widget.TextView r0 = r4.txt_home
            com.flextv.livestore.models.WordModels r1 = r4.wordModels
            java.lang.String r1 = r1.getHome()
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
            android.widget.TextView r0 = r4.txt_back
            com.flextv.livestore.models.WordModels r1 = r4.wordModels
            java.lang.String r1 = r1.getBack()
            r0.setText(r1)
            android.widget.TextView r0 = r4.txt_back
            r0.setOnClickListener(r4)
            android.widget.TextView r0 = r4.txt_home
            r0.setOnClickListener(r4)
            android.widget.TextView r0 = r4.txt_movie
            r0.setOnClickListener(r4)
            android.widget.TextView r0 = r4.txt_live
            r0.setOnClickListener(r4)
            android.widget.TextView r0 = r4.txt_series
            r0.setOnClickListener(r4)
            return
    }

    private /* synthetic */ void lambda$showExternalPlayerDialog$0(int r1, android.content.DialogInterface r2, int r3) {
            r0 = this;
            r2 = 1
            java.lang.String r3 = "android.intent.action.VIEW"
            if (r1 == r2) goto L1a
            r2 = 2
            if (r1 == r2) goto La
            r1 = 0
            goto L29
        La:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r3)
            java.lang.String r2 = "https://play.google.com/store/apps/details?id=com.mxtech.videoplayer.ad"
            android.net.Uri r2 = android.net.Uri.parse(r2)
            android.content.Intent r1 = r1.setData(r2)
            goto L29
        L1a:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r3)
            java.lang.String r2 = "https://play.google.com/store/apps/details?id=org.videolan.vlc&hl=en_US"
            android.net.Uri r2 = android.net.Uri.parse(r2)
            android.content.Intent r1 = r1.setData(r2)
        L29:
            r0.startActivity(r1)
            return
    }

    private static /* synthetic */ void lambda$showExternalPlayerDialog$1(android.content.DialogInterface r0, int r1) {
            r0.cancel()
            return
    }

    private void playRecentMovie(com.flextv.livestore.models.MovieModel r7) {
            r6 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = r6.preferenceHelper
            int r0 = r0.getSharedPreferenceExternalPlayer()
            com.flextv.livestore.helper.PreferenceHelper r1 = r6.preferenceHelper
            boolean r1 = r1.getSharedPreferenceISM3U()
            if (r1 == 0) goto L13
            java.lang.String r1 = r7.getUrl()
            goto L31
        L13:
            com.flextv.livestore.helper.PreferenceHelper r1 = r6.preferenceHelper
            java.lang.String r1 = r1.getSharedPreferenceServerUrl()
            com.flextv.livestore.helper.PreferenceHelper r2 = r6.preferenceHelper
            java.lang.String r2 = r2.getSharedPreferenceUsername()
            com.flextv.livestore.helper.PreferenceHelper r3 = r6.preferenceHelper
            java.lang.String r3 = r3.getSharedPreferencePassword()
            java.lang.String r4 = r7.getStream_id()
            java.lang.String r5 = r7.getExtension()
            java.lang.String r1 = com.flextv.livestore.helper.GetSharedInfo.getMovieUrl(r1, r2, r3, r4, r5)
        L31:
            if (r0 == 0) goto L5f
            r2 = 1
            if (r0 == r2) goto L4d
            r7 = 2
            if (r0 == r7) goto L3b
            goto Lab
        L3b:
            com.flextv.livestore.utils.Utils$MXPackageInfo r0 = com.flextv.livestore.utils.Utils.getMXPackageInfo(r6)
            if (r0 == 0) goto L49
            java.lang.String r7 = r0.packageName
            java.lang.String r0 = r0.activityName
            r6.externalMXplayer(r7, r0, r1)
            goto Lab
        L49:
            r6.showExternalPlayerDialog(r7)
            goto Lab
        L4d:
            com.flextv.livestore.utils.Utils$VLCPackageInfo r0 = com.flextv.livestore.utils.Utils.getVlcPackageInfo(r6)
            if (r0 == 0) goto L5b
            java.lang.String r7 = r7.getName()
            r6.externalvlcplayer(r1, r7)
            goto Lab
        L5b:
            r6.showExternalPlayerDialog(r2)
            goto Lab
        L5f:
            boolean r0 = com.flextv.livestore.helper.GetSharedInfo.isTVDevice(r6)
            if (r0 == 0) goto L6d
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.flextv.livestore.activities.MoviePlayerActivity> r1 = com.flextv.livestore.activities.MoviePlayerActivity.class
            r0.<init>(r6, r1)
            goto L74
        L6d:
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.flextv.livestore.activities.mobile.MovieMobilePlayer> r1 = com.flextv.livestore.activities.mobile.MovieMobilePlayer.class
            r0.<init>(r6, r1)
        L74:
            java.lang.String r1 = r7.getName()
            java.lang.String r2 = "name"
            r0.putExtra(r2, r1)
            java.lang.String r1 = r7.getStream_id()
            java.lang.String r2 = "stream_id"
            r0.putExtra(r2, r1)
            java.lang.String r1 = "description"
            java.lang.String r2 = ""
            r0.putExtra(r1, r2)
            com.flextv.livestore.helper.PreferenceHelper r1 = r6.preferenceHelper
            boolean r1 = r1.getSharedPreferenceISM3U()
            if (r1 == 0) goto L9b
            java.lang.String r7 = r7.getCategory_name()
            goto La3
        L9b:
            java.lang.String r7 = r7.getCategory_id()
            java.lang.String r7 = r6.getMovieCategoryName(r7)
        La3:
            java.lang.String r1 = "category_name"
            r0.putExtra(r1, r7)
            r6.startActivity(r0)
        Lab:
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
            io.realm.RealmResults r5 = r0.getMovieModelsByCategory(r1, r5, r2, r3)
            r4.movieModels = r5
            com.flextv.livestore.adapter.VodRecyclerAdapter r0 = r4.vodAdapter
            r0.updateData(r5)
            com.flextv.livestore.view.LiveVerticalGridView r5 = r4.recycler_movie
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
            android.widget.TextView r0 = r1.txt_back
            r0.setFocusable(r2)
            com.flextv.livestore.view.CustomSpinner r0 = r1.sort_spinner
            r0.setFocusable(r2)
            return
    }

    private void showExternalPlayerDialog(int r6) {
            r5 = this;
            androidx.appcompat.app.AlertDialog$Builder r0 = new androidx.appcompat.app.AlertDialog$Builder
            r0.<init>(r5)
            com.flextv.livestore.models.WordModels r1 = r5.wordModels
            java.lang.String r1 = r1.getInstall_external_player()
            r0.setTitle(r1)
            com.flextv.livestore.models.WordModels r1 = r5.wordModels
            java.lang.String r1 = r1.getWant_external_player()
            androidx.appcompat.app.AlertDialog$Builder r1 = r0.setMessage(r1)
            r2 = 0
            androidx.appcompat.app.AlertDialog$Builder r1 = r1.setCancelable(r2)
            com.flextv.livestore.models.WordModels r2 = r5.wordModels
            java.lang.String r2 = r2.getOk()
            com.flextv.livestore.activities.MovieActivity$$ExternalSyntheticLambda0 r3 = new com.flextv.livestore.activities.MovieActivity$$ExternalSyntheticLambda0
            r4 = 2
            r3.<init>(r5, r6, r4)
            androidx.appcompat.app.AlertDialog$Builder r6 = r1.setPositiveButton(r2, r3)
            com.flextv.livestore.models.WordModels r1 = r5.wordModels
            java.lang.String r1 = r1.getCancel()
            com.flextv.livestore.activities.MovieActivity$$ExternalSyntheticLambda1 r2 = com.flextv.livestore.activities.MovieActivity$$ExternalSyntheticLambda1.INSTANCE$2
            r6.setNegativeButton(r1, r2)
            androidx.appcompat.app.AlertDialog r6 = r0.create()
            r6.show()
            return
    }

    private void showMovieLockDlgFragment(com.flextv.livestore.models.MovieModel r5, int r6) {
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
            com.flextv.livestore.activities.MovieSecondActivity$5 r3 = new com.flextv.livestore.activities.MovieSecondActivity$5
            r3.<init>(r4, r6, r5)
            r1.setOnPinEventListener(r3)
            com.flextv.livestore.dlgfragment.LockDlgFragment r5 = r4.lockDlgFragment
            r5.show(r0, r2)
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
            com.flextv.livestore.view.LiveVerticalGridView r4 = r3.recycler_movie
            r4.requestFocus()
            return r1
        L51:
            com.flextv.livestore.view.LiveVerticalGridView r0 = r3.recycler_movie
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L9e
            int r0 = r3.pre_movie_pos
            r2 = 6
            if (r0 >= r2) goto L9e
            r3.setFocusTopView(r1)
            com.flextv.livestore.view.CustomSpinner r4 = r3.sort_spinner
            r4.requestFocus()
            return r1
        L67:
            com.flextv.livestore.view.LiveVerticalGridView r0 = r3.recycler_movie
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L9e
            int r0 = r3.pre_movie_pos
            io.realm.RealmResults<com.flextv.livestore.models.MovieModel> r1 = r3.movieModels
            int r1 = r1.size()
            int r1 = r1 + (-13)
            if (r0 >= r1) goto L9e
            int r0 = r3.pre_movie_pos
            int r0 = r0 + r2
            r3.pre_movie_pos = r0
            com.flextv.livestore.view.LiveVerticalGridView r1 = r3.recycler_movie
            r1.setSelectedPosition(r0)
            goto L9e
        L86:
            com.flextv.livestore.view.LiveVerticalGridView r0 = r3.recycler_movie
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L9e
            int r0 = r3.pre_movie_pos
            if (r0 <= r2) goto L9e
            int r0 = r0 - r2
            r3.pre_movie_pos = r0
            com.flextv.livestore.view.LiveVerticalGridView r1 = r3.recycler_movie
            r1.setSelectedPosition(r0)
            goto L9e
        L9b:
            r3.finish()
        L9e:
            boolean r4 = super.dispatchKeyEvent(r4)
            return r4
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r3) {
            r2 = this;
            int r3 = r3.getId()
            switch(r3) {
                case 2131428284: goto L28;
                case 2131428313: goto L14;
                case 2131428316: goto L10;
                case 2131428322: goto Lc;
                case 2131428343: goto L8;
                default: goto L7;
            }
        L7:
            goto L2b
        L8:
            r2.goToSeriesActivity()
            goto L2b
        Lc:
            r2.finish()
            goto L2b
        L10:
            r2.goToLiveActivity()
            goto L2b
        L14:
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r0 = "is_changed"
            java.lang.String r1 = "home"
            r3.putExtra(r0, r1)
            r0 = -1
            r2.setResult(r0, r3)
            r2.finish()
            goto L2b
        L28:
            r2.finish()
        L2b:
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle r6) {
            r5 = this;
            super.onCreate(r6)
            r6 = 2131623981(0x7f0e002d, float:1.8875129E38)
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
            java.util.List r6 = r6.getSharedPreferenceInvisibleVodCategories()
            com.flextv.livestore.apps.Constants.getVodGroupModels(r6, r5)
            java.util.List<com.flextv.livestore.models.CategoryModel> r6 = com.flextv.livestore.apps.LTVApp.vod_categories_filter
            r5.categoryModels = r6
            android.content.Intent r6 = r5.getIntent()
            java.lang.String r0 = "category_pos"
            r1 = 0
            int r6 = r6.getIntExtra(r0, r1)
            r5.category_pos = r6
            com.flextv.livestore.helper.PreferenceHelper r6 = r5.preferenceHelper
            int r6 = r6.getSharedPreferenceVodOrder()
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
            io.realm.RealmResults r6 = r6.getMovieModelsByCategory(r0, r4, r2, r3)
            r5.movieModels = r6
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
            io.realm.RealmResults<com.flextv.livestore.models.MovieModel> r2 = r5.movieModels
            int r2 = r2.size()
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r6.setText(r0)
            com.flextv.livestore.adapter.VodRecyclerAdapter r6 = new com.flextv.livestore.adapter.VodRecyclerAdapter
            io.realm.RealmResults<com.flextv.livestore.models.MovieModel> r0 = r5.movieModels
            r2 = 1
            r6.<init>(r5, r0, r2)
            r5.vodAdapter = r6
            com.flextv.livestore.activities.MovieSecondActivity$1 r0 = new com.flextv.livestore.activities.MovieSecondActivity$1
            r0.<init>(r5)
            r6.setItemClickListener(r0)
            com.flextv.livestore.view.LiveVerticalGridView r6 = r5.recycler_movie
            com.flextv.livestore.adapter.VodRecyclerAdapter r0 = r5.vodAdapter
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
            com.flextv.livestore.activities.MovieSecondActivity$2 r0 = new com.flextv.livestore.activities.MovieSecondActivity$2
            r0.<init>(r5)
            r6.setOnItemSelectedListener(r0)
            android.widget.EditText r6 = r5.et_search
            com.flextv.livestore.activities.MovieSecondActivity$3 r0 = new com.flextv.livestore.activities.MovieSecondActivity$3
            r0.<init>(r5)
            r6.addTextChangedListener(r0)
            boolean r6 = com.flextv.livestore.helper.GetSharedInfo.isTVDevice(r5)
            if (r6 == 0) goto Ldf
            r5.setFocusTopView(r1)
        Ldf:
            return
    }
}
