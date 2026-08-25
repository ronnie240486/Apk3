package com.flextv.livestore.activities;

/* JADX INFO: loaded from: classes.dex */
public class MovieInfoActivity extends androidx.appcompat.app.AppCompatActivity implements android.view.View.OnClickListener {
    public com.flextv.livestore.adapter.CastRecyclerAdapter adapter;
    public android.widget.ImageButton btn_back;
    public android.widget.RelativeLayout btn_favorite;
    public android.widget.RelativeLayout btn_play;
    public android.widget.Button btn_show_cast;
    public android.widget.RelativeLayout btn_trailer;
    public java.util.List<com.flextv.livestore.models.CastModel> castModels;
    public com.flextv.livestore.view.LiveHorizontalGridView cast_list;
    public java.lang.String category_name;
    public com.flextv.livestore.models.MovieModel currentMovie;
    public com.flextv.livestore.apps.FocusStatus focusStatus;
    public android.widget.ImageView image_fav;
    public boolean is_fav;
    public androidx.constraintlayout.widget.ConstraintLayout main_lay;
    public com.flextv.livestore.models.MovieInfoResponse movieInfoResponse;
    public android.widget.ImageView movie_bg;
    public android.widget.ImageView movie_logo;
    public com.flextv.livestore.helper.PreferenceHelper preferenceHelper;
    public com.iarcuschin.simpleratingbar.SimpleRatingBar ratingBar;
    public android.widget.TextView str_added;
    public android.widget.TextView str_cast;
    public java.lang.String stream_id;
    public java.lang.String tmdb_id;
    public android.widget.TextView txt_added;
    public android.widget.TextView txt_description;
    public android.widget.TextView txt_duration;
    public android.widget.TextView txt_genre;
    public android.widget.TextView txt_name;
    public android.widget.TextView txt_play;
    public android.widget.TextView txt_rating;
    public android.widget.TextView txt_trailer;
    public android.widget.TextView txt_year;
    public java.lang.String vod_url;
    public com.flextv.livestore.models.WordModels wordModels;




    /* JADX INFO: renamed from: com.flextv.livestore.activities.MovieInfoActivity$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] $SwitchMap$com$flextv$livestore$apps$FocusStatus = null;

        static {
                com.flextv.livestore.apps.FocusStatus[] r0 = com.flextv.livestore.apps.FocusStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.flextv.livestore.activities.MovieInfoActivity.AnonymousClass4.$SwitchMap$com$flextv$livestore$apps$FocusStatus = r0
                com.flextv.livestore.apps.FocusStatus r1 = com.flextv.livestore.apps.FocusStatus.second     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.flextv.livestore.activities.MovieInfoActivity.AnonymousClass4.$SwitchMap$com$flextv$livestore$apps$FocusStatus     // Catch: java.lang.NoSuchFieldError -> L1d
                com.flextv.livestore.apps.FocusStatus r1 = com.flextv.livestore.apps.FocusStatus.third     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.flextv.livestore.activities.MovieInfoActivity.AnonymousClass4.$SwitchMap$com$flextv$livestore$apps$FocusStatus     // Catch: java.lang.NoSuchFieldError -> L28
                com.flextv.livestore.apps.FocusStatus r1 = com.flextv.livestore.apps.FocusStatus.first     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    public static /* synthetic */ void $r8$lambda$BepH0bivchT9XGmvLaIz0g3Qz6w(com.flextv.livestore.activities.MovieInfoActivity r0) {
            r0.lambda$onClick$1()
            return
    }

    public static /* synthetic */ void $r8$lambda$OApFFMGRpz6B8SHpti3kWpqM3EI(com.flextv.livestore.activities.MovieInfoActivity r0) {
            r0.lambda$onClick$2()
            return
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$a71c1lJ8nopVBKizll0oN3LGYrk(com.flextv.livestore.activities.MovieInfoActivity r0, com.flextv.livestore.models.CastModel r1, java.lang.Integer r2, java.lang.Boolean r3) {
            kotlin.Unit r0 = r0.lambda$initView$0(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$n87hTRKUK59tXglv2jm7mrK6rbQ(android.content.DialogInterface r0, int r1) {
            lambda$showExternalPlayerDialog$4(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$wZhf3ft5l1iKh_woXj0gbttRewg(com.flextv.livestore.activities.MovieInfoActivity r0, int r1, android.content.DialogInterface r2, int r3) {
            r0.lambda$showExternalPlayerDialog$3(r1, r2, r3)
            return
    }

    public MovieInfoActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.castModels = r0
            java.lang.String r0 = ""
            r1.tmdb_id = r0
            r1.category_name = r0
            r1.stream_id = r0
            r1.vod_url = r0
            com.flextv.livestore.apps.FocusStatus r0 = com.flextv.livestore.apps.FocusStatus.second
            r1.focusStatus = r0
            r0 = 0
            r1.is_fav = r0
            com.flextv.livestore.models.WordModels r0 = new com.flextv.livestore.models.WordModels
            r0.<init>()
            r1.wordModels = r0
            return
    }

    public static /* synthetic */ void access$000(com.flextv.livestore.activities.MovieInfoActivity r0) {
            r0.setModelInfo()
            return
    }

    public static /* synthetic */ void access$100(com.flextv.livestore.activities.MovieInfoActivity r0) {
            r0.setNoDescriptionData()
            return
    }

    public static /* synthetic */ void access$200(com.flextv.livestore.activities.MovieInfoActivity r0, java.util.List r1) {
            r0.setCastAdapter(r1)
            return
    }

    private boolean checkAdultMovies(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "xxx"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L1c
            java.lang.String r0 = "porn"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L1c
            java.lang.String r0 = "adult"
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L1a
            goto L1c
        L1a:
            r2 = 0
            goto L1d
        L1c:
            r2 = 1
        L1d:
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

    private void externalvlcplayer(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: java.lang.Exception -> L1e
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Exception -> L1e
            java.lang.String r0 = "android.intent.action.VIEW"
            r3.<init>(r0)     // Catch: java.lang.Exception -> L1e
            java.lang.String r0 = "org.videolan.vlc"
            r3.setPackage(r0)     // Catch: java.lang.Exception -> L1e
            java.lang.String r0 = "video/*"
            r3.setDataAndTypeAndNormalize(r2, r0)     // Catch: java.lang.Exception -> L1e
            r2 = 268435456(0x10000000, float:2.524355E-29)
            r3.setFlags(r2)     // Catch: java.lang.Exception -> L1e
            r1.startActivity(r3)     // Catch: java.lang.Exception -> L1e
        L1e:
            return
    }

    private void getCastModels() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r4.tmdb_id
            java.lang.String r2 = "/credits?api_key="
            java.lang.String r3 = "<REDACTED_API_KEY_FROM_ORIGINAL_APK>"
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = com.flextv.livestore.apps.Constants.IMDB_API
            com.flextv.livestore.remote.APIService r1 = com.flextv.livestore.remote.RetroClass.getAPIService(r1)
            retrofit2.Call r0 = r1.getCastModels(r0)
            com.flextv.livestore.activities.MovieInfoActivity$2 r1 = new com.flextv.livestore.activities.MovieInfoActivity$2
            r1.<init>(r4)
            r0.enqueue(r1)
            return
    }

    private void getMovieInfo() {
            r4 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = r4.preferenceHelper
            java.lang.String r0 = r0.getSharedPreferenceServerUrl()
            com.flextv.livestore.remote.APIService r0 = com.flextv.livestore.remote.RetroClass.getAPIService(r0)
            com.flextv.livestore.helper.PreferenceHelper r1 = r4.preferenceHelper
            java.lang.String r1 = r1.getSharedPreferenceUsername()
            com.flextv.livestore.helper.PreferenceHelper r2 = r4.preferenceHelper
            java.lang.String r2 = r2.getSharedPreferencePassword()
            java.lang.String r3 = r4.stream_id
            retrofit2.Call r0 = r0.get_vod_info(r1, r2, r3)
            com.flextv.livestore.activities.MovieInfoActivity$1 r1 = new com.flextv.livestore.activities.MovieInfoActivity$1
            r1.<init>(r4)
            r0.enqueue(r1)
            return
    }

    private void initView() {
            r4 = this;
            r0 = 2131427707(0x7f0b017b, float:1.8477038E38)
            android.view.View r0 = r4.findViewById(r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r4.main_lay = r0
            r0 = 2131427985(0x7f0b0291, float:1.8477602E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r4.movie_bg = r0
            r0 = 2131427805(0x7f0b01dd, float:1.8477237E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r4.movie_logo = r0
            r0 = 2131427798(0x7f0b01d6, float:1.8477222E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r4.image_fav = r0
            r0 = 2131428324(0x7f0b03e4, float:1.847829E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.txt_name = r0
            r0 = 2131428357(0x7f0b0405, float:1.8478356E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.txt_year = r0
            r0 = 2131428336(0x7f0b03f0, float:1.8478314E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.txt_rating = r0
            r0 = 2131428301(0x7f0b03cd, float:1.8478243E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.txt_duration = r0
            r0 = 2131428282(0x7f0b03ba, float:1.8478204E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.txt_added = r0
            r0 = 2131428299(0x7f0b03cb, float:1.8478239E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.txt_description = r0
            r0 = 2131428330(0x7f0b03ea, float:1.8478301E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.txt_play = r0
            r0 = 2131428351(0x7f0b03ff, float:1.8478344E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.txt_trailer = r0
            r0 = 2131427480(0x7f0b0098, float:1.8476577E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r4.btn_play = r0
            r0 = 2131427469(0x7f0b008d, float:1.8476555E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r4.btn_favorite = r0
            r0 = 2131427491(0x7f0b00a3, float:1.84766E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r4.btn_trailer = r0
            r0 = 2131427464(0x7f0b0088, float:1.8476545E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r4.btn_back = r0
            r0 = 2131427488(0x7f0b00a0, float:1.8476594E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r4.btn_show_cast = r0
            r0 = 2131428182(0x7f0b0356, float:1.8478001E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.str_added = r0
            android.widget.Button r0 = r4.btn_show_cast
            r0.setOnClickListener(r4)
            android.widget.ImageButton r0 = r4.btn_back
            r0.setOnClickListener(r4)
            android.widget.RelativeLayout r0 = r4.btn_play
            r0.setOnClickListener(r4)
            android.widget.RelativeLayout r0 = r4.btn_favorite
            r0.setOnClickListener(r4)
            android.widget.RelativeLayout r0 = r4.btn_trailer
            r0.setOnClickListener(r4)
            r0 = 2131428070(0x7f0b02e6, float:1.8477774E38)
            android.view.View r0 = r4.findViewById(r0)
            com.iarcuschin.simpleratingbar.SimpleRatingBar r0 = (com.iarcuschin.simpleratingbar.SimpleRatingBar) r0
            r4.ratingBar = r0
            r0 = 2131428309(0x7f0b03d5, float:1.8478259E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.txt_genre = r0
            r0 = 2131428184(0x7f0b0358, float:1.8478005E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.str_cast = r0
            r0 = 2131428066(0x7f0b02e2, float:1.8477766E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r0 = 2131427503(0x7f0b00af, float:1.8476624E38)
            android.view.View r0 = r4.findViewById(r0)
            com.flextv.livestore.view.LiveHorizontalGridView r0 = (com.flextv.livestore.view.LiveHorizontalGridView) r0
            r4.cast_list = r0
            com.flextv.livestore.adapter.CastRecyclerAdapter r0 = new com.flextv.livestore.adapter.CastRecyclerAdapter
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.flextv.livestore.activities.LiveActivity$$ExternalSyntheticLambda3 r2 = new com.flextv.livestore.activities.LiveActivity$$ExternalSyntheticLambda3
            r3 = 4
            r2.<init>(r4, r3)
            r0.<init>(r4, r1, r2)
            r4.adapter = r0
            com.flextv.livestore.view.LiveHorizontalGridView r1 = r4.cast_list
            r1.setAdapter(r0)
            boolean r0 = com.flextv.livestore.helper.GetSharedInfo.isTVDevice(r4)
            r1 = 0
            if (r0 == 0) goto L154
            com.flextv.livestore.view.LiveHorizontalGridView r0 = r4.cast_list
            r0.setLoop(r1)
            com.flextv.livestore.view.LiveHorizontalGridView r0 = r4.cast_list
            r2 = 1
            r0.setPreserveFocusAfterLayout(r2)
            android.view.View[] r0 = new android.view.View[r2]
            r2 = 0
            r0[r1] = r2
            com.flextv.livestore.view.LiveHorizontalGridView r2 = r4.cast_list
            com.flextv.livestore.activities.MovieInfoActivity$3 r3 = new com.flextv.livestore.activities.MovieInfoActivity$3
            r3.<init>(r0)
            r2.setOnChildViewHolderSelectedListener(r3)
            android.widget.Button r0 = r4.btn_show_cast
            r2 = 8
            r0.setVisibility(r2)
            goto L15e
        L154:
            com.flextv.livestore.view.LiveHorizontalGridView r0 = r4.cast_list
            androidx.recyclerview.widget.LinearLayoutManager r2 = new androidx.recyclerview.widget.LinearLayoutManager
            r2.<init>(r4, r1, r1)
            r0.setLayoutManager(r2)
        L15e:
            android.widget.TextView r0 = r4.str_added
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.flextv.livestore.models.WordModels r3 = r4.wordModels
            java.lang.String r3 = r3.getDate_added()
            r2.append(r3)
            java.lang.String r3 = ":"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.setText(r2)
            android.widget.TextView r0 = r4.txt_play
            com.flextv.livestore.models.WordModels r2 = r4.wordModels
            java.lang.String r2 = r2.getPlay()
            r0.setText(r2)
            android.widget.TextView r0 = r4.txt_trailer
            com.flextv.livestore.models.WordModels r2 = r4.wordModels
            java.lang.String r2 = r2.getTrailer()
            r0.setText(r2)
            android.widget.TextView r0 = r4.str_cast
            com.flextv.livestore.models.WordModels r2 = r4.wordModels
            java.lang.String r2 = r2.getCast()
            r0.setText(r2)
            android.widget.ImageButton r0 = r4.btn_back
            r0.setFocusable(r1)
            return
    }

    private /* synthetic */ kotlin.Unit lambda$initView$0(com.flextv.livestore.models.CastModel r1, java.lang.Integer r2, java.lang.Boolean r3) {
            r0 = this;
            boolean r2 = r3.booleanValue()
            if (r2 == 0) goto L2a
            int r2 = r1.getId()
            if (r2 <= 0) goto L2a
            android.content.Intent r2 = new android.content.Intent
            java.lang.Class<com.flextv.livestore.activities.MovieCreditActivity> r3 = com.flextv.livestore.activities.MovieCreditActivity.class
            r2.<init>(r0, r3)
            int r1 = r1.getId()
            java.lang.String r3 = "person_id"
            r2.putExtra(r3, r1)
            com.flextv.livestore.models.MovieModel r1 = r0.currentMovie
            java.lang.String r1 = r1.getName()
            java.lang.String r3 = "name"
            r2.putExtra(r3, r1)
            r0.startActivity(r2)
        L2a:
            r1 = 0
            return r1
    }

    private /* synthetic */ void lambda$onClick$1() {
            r2 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = r2.preferenceHelper
            com.flextv.livestore.helper.RealmController r1 = com.flextv.livestore.helper.RealmController.with()
            java.util.List r1 = r1.getFavMovieNames()
            r0.setSharedPreferenceVodFavNames(r1)
            return
    }

    private /* synthetic */ void lambda$onClick$2() {
            r2 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = r2.preferenceHelper
            com.flextv.livestore.helper.RealmController r1 = com.flextv.livestore.helper.RealmController.with()
            java.util.List r1 = r1.getFavMovieNames()
            r0.setSharedPreferenceVodFavNames(r1)
            return
    }

    private /* synthetic */ void lambda$showExternalPlayerDialog$3(int r1, android.content.DialogInterface r2, int r3) {
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

    private static /* synthetic */ void lambda$showExternalPlayerDialog$4(android.content.DialogInterface r0, int r1) {
            r0.cancel()
            return
    }

    private void playMovie() {
            r3 = this;
            boolean r0 = com.flextv.livestore.helper.GetSharedInfo.isTVDevice(r3)
            if (r0 == 0) goto Le
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.flextv.livestore.activities.MoviePlayerActivity> r1 = com.flextv.livestore.activities.MoviePlayerActivity.class
            r0.<init>(r3, r1)
            goto L15
        Le:
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.flextv.livestore.activities.mobile.MovieMobilePlayer> r1 = com.flextv.livestore.activities.mobile.MovieMobilePlayer.class
            r0.<init>(r3, r1)
        L15:
            com.flextv.livestore.models.MovieModel r1 = r3.currentMovie
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "name"
            r0.putExtra(r2, r1)
            com.flextv.livestore.models.MovieModel r1 = r3.currentMovie
            java.lang.String r1 = r1.getStream_id()
            java.lang.String r2 = "stream_id"
            r0.putExtra(r2, r1)
            android.widget.TextView r1 = r3.txt_description
            java.lang.CharSequence r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "description"
            r0.putExtra(r2, r1)
            java.lang.String r1 = r3.category_name
            java.lang.String r2 = "category_name"
            r0.putExtra(r2, r1)
            java.lang.String r1 = r3.tmdb_id
            java.lang.String r2 = "tmdb_id"
            r0.putExtra(r2, r1)
            r3.startActivity(r0)
            return
    }

    private void setCastAdapter(java.util.List<com.flextv.livestore.models.CastModel> r3) {
            r2 = this;
            r2.castModels = r3
            int r0 = r3.size()
            if (r0 <= 0) goto L24
            boolean r0 = com.flextv.livestore.helper.GetSharedInfo.isTVDevice(r2)
            r1 = 0
            if (r0 != 0) goto L14
            android.widget.Button r0 = r2.btn_show_cast
            r0.setVisibility(r1)
        L14:
            com.flextv.livestore.view.LiveHorizontalGridView r0 = r2.cast_list
            r0.setVisibility(r1)
            android.widget.TextView r0 = r2.str_cast
            r0.setVisibility(r1)
            com.flextv.livestore.adapter.CastRecyclerAdapter r0 = r2.adapter
            r0.setMovieData(r3)
            goto L3f
        L24:
            android.widget.Button r3 = r2.btn_show_cast
            r0 = 8
            r3.setVisibility(r0)
            com.flextv.livestore.view.LiveHorizontalGridView r3 = r2.cast_list
            r3.setVisibility(r0)
            android.widget.TextView r3 = r2.str_cast
            r3.setVisibility(r0)
            com.flextv.livestore.adapter.CastRecyclerAdapter r3 = r2.adapter
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.setMovieData(r0)
        L3f:
            return
    }

    private void setFull() {
            r7 = this;
            androidx.constraintlayout.widget.ConstraintSet r6 = new androidx.constraintlayout.widget.ConstraintSet
            r6.<init>()
            androidx.constraintlayout.widget.ConstraintLayout r0 = r7.main_lay
            r6.clone(r0)
            int[] r0 = com.flextv.livestore.activities.MovieInfoActivity.AnonymousClass4.$SwitchMap$com$flextv$livestore$apps$FocusStatus
            com.flextv.livestore.apps.FocusStatus r1 = r7.getFocusStatus()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            r2 = 2131427731(0x7f0b0193, float:1.8477087E38)
            r3 = 2131427730(0x7f0b0192, float:1.8477084E38)
            r4 = 2131427729(0x7f0b0191, float:1.8477082E38)
            if (r0 == r1) goto L52
            r1 = 2
            if (r0 == r1) goto L26
            goto L75
        L26:
            r0 = 0
            r6.setGuidelinePercent(r4, r0)
            r0 = 1058642330(0x3f19999a, float:0.6)
            r6.setGuidelinePercent(r3, r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r6.setGuidelinePercent(r2, r0)
            r1 = 2131427805(0x7f0b01dd, float:1.8477237E38)
            r2 = 3
            r3 = 2131427493(0x7f0b00a5, float:1.8476604E38)
            r4 = 4
            r5 = 0
            r0 = r6
            r0.connect(r1, r2, r3, r4, r5)
            r2 = 4
            r3 = 2131427730(0x7f0b0192, float:1.8477084E38)
            r0.connect(r1, r2, r3, r4, r5)
            r1 = 2131428184(0x7f0b0358, float:1.8478005E38)
            r2 = 3
            r4 = 3
            r0.connect(r1, r2, r3, r4, r5)
            goto L75
        L52:
            r0 = 1052938076(0x3ec28f5c, float:0.38)
            r6.setGuidelinePercent(r4, r0)
            r0 = 1062836634(0x3f59999a, float:0.85)
            r6.setGuidelinePercent(r3, r0)
            r0 = 1067450368(0x3fa00000, float:1.25)
            r6.setGuidelinePercent(r2, r0)
            r1 = 2131427805(0x7f0b01dd, float:1.8477237E38)
            r2 = 4
            r3 = 2131427729(0x7f0b0191, float:1.8477082E38)
            r4 = 4
            r5 = 0
            r0 = r6
            r0.connect(r1, r2, r3, r4, r5)
            r2 = 3
            r4 = 3
            r0.connect(r1, r2, r3, r4, r5)
        L75:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r7.main_lay
            r6.applyTo(r0)
            return
    }

    private void setModelInfo() {
            r4 = this;
            android.widget.TextView r0 = r4.txt_added
            com.flextv.livestore.models.MovieModel r1 = r4.currentMovie
            java.lang.String r1 = r1.getAdded()
            long r1 = java.lang.Long.parseLong(r1)
            java.lang.String r1 = com.flextv.livestore.utils.Utils.getDate(r1)
            r0.setText(r1)
            android.widget.TextView r0 = r4.txt_description
            com.flextv.livestore.models.MovieInfoResponse r1 = r4.movieInfoResponse
            com.flextv.livestore.models.MovieInfo r1 = r1.getInfo()
            java.lang.String r1 = r1.getDescription()
            r0.setText(r1)
            android.widget.TextView r0 = r4.txt_rating     // Catch: java.lang.Exception -> L56
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L56
            r1.<init>()     // Catch: java.lang.Exception -> L56
            java.lang.String r2 = ""
            r1.append(r2)     // Catch: java.lang.Exception -> L56
            com.flextv.livestore.models.MovieModel r2 = r4.currentMovie     // Catch: java.lang.Exception -> L56
            java.lang.String r2 = r2.getRating()     // Catch: java.lang.Exception -> L56
            float r2 = java.lang.Float.parseFloat(r2)     // Catch: java.lang.Exception -> L56
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            r1.append(r2)     // Catch: java.lang.Exception -> L56
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L56
            r0.setText(r1)     // Catch: java.lang.Exception -> L56
            com.iarcuschin.simpleratingbar.SimpleRatingBar r0 = r4.ratingBar     // Catch: java.lang.Exception -> L56
            com.flextv.livestore.models.MovieModel r1 = r4.currentMovie     // Catch: java.lang.Exception -> L56
            java.lang.String r1 = r1.getRating()     // Catch: java.lang.Exception -> L56
            float r1 = java.lang.Float.parseFloat(r1)     // Catch: java.lang.Exception -> L56
            float r1 = r1 / r3
            r0.setRating(r1)     // Catch: java.lang.Exception -> L56
            goto L63
        L56:
            android.widget.TextView r0 = r4.txt_rating
            java.lang.String r1 = "N/A"
            r0.setText(r1)
            com.iarcuschin.simpleratingbar.SimpleRatingBar r0 = r4.ratingBar
            r1 = 0
            r0.setRating(r1)
        L63:
            android.widget.TextView r0 = r4.txt_year
            com.flextv.livestore.models.MovieInfoResponse r1 = r4.movieInfoResponse
            com.flextv.livestore.models.MovieInfo r1 = r1.getInfo()
            java.lang.String r1 = r1.getReleasedate()
            java.lang.String r2 = "yyyy-MM-dd"
            java.lang.String r3 = "yyyy"
            java.lang.String r1 = com.flextv.livestore.utils.Utils.formateDateFromstring(r2, r3, r1)
            r0.setText(r1)
            android.widget.TextView r0 = r4.txt_duration
            com.flextv.livestore.models.MovieInfoResponse r1 = r4.movieInfoResponse
            com.flextv.livestore.models.MovieInfo r1 = r1.getInfo()
            java.lang.String r1 = r1.getDuration()
            r0.setText(r1)
            android.widget.TextView r0 = r4.txt_genre
            com.flextv.livestore.models.MovieInfoResponse r1 = r4.movieInfoResponse
            com.flextv.livestore.models.MovieInfo r1 = r1.getInfo()
            java.lang.String r1 = r1.getGenre()
            r0.setText(r1)
            com.flextv.livestore.models.MovieInfoResponse r0 = r4.movieInfoResponse
            com.flextv.livestore.models.MovieInfo r0 = r0.getInfo()
            java.lang.String r0 = r0.getCover_big()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lc5
            android.content.Context r0 = r4.getApplicationContext()
            com.bumptech.glide.RequestManager r0 = com.bumptech.glide.Glide.with(r0)
            com.flextv.livestore.models.MovieInfoResponse r1 = r4.movieInfoResponse
            com.flextv.livestore.models.MovieInfo r1 = r1.getInfo()
            java.lang.String r1 = r1.getCover_big()
            com.bumptech.glide.RequestBuilder r0 = r0.load(r1)
            android.widget.ImageView r1 = r4.movie_bg
            r0.into(r1)
        Lc5:
            com.flextv.livestore.models.MovieInfoResponse r0 = r4.movieInfoResponse
            com.flextv.livestore.models.MovieInfo r0 = r0.getInfo()
            java.lang.String r0 = r0.getYoutube_trailer()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Ldc
            android.widget.RelativeLayout r0 = r4.btn_trailer
            r1 = 0
            r0.setVisibility(r1)
            goto Lf3
        Ldc:
            android.widget.RelativeLayout r0 = r4.btn_trailer
            r1 = 8
            r0.setVisibility(r1)
            android.widget.RelativeLayout r0 = r4.btn_favorite
            r1 = 2131427480(0x7f0b0098, float:1.8476577E38)
            r0.setNextFocusLeftId(r1)
            android.widget.RelativeLayout r0 = r4.btn_play
            r1 = 2131427469(0x7f0b008d, float:1.8476555E38)
            r0.setNextFocusRightId(r1)
        Lf3:
            com.flextv.livestore.models.MovieInfoResponse r0 = r4.movieInfoResponse
            com.flextv.livestore.models.MovieInfo r0 = r0.getInfo()
            java.lang.String r0 = r0.getTmdb_id()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L112
            com.flextv.livestore.models.MovieInfoResponse r0 = r4.movieInfoResponse
            com.flextv.livestore.models.MovieInfo r0 = r0.getInfo()
            java.lang.String r0 = r0.getTmdb_id()
            r4.tmdb_id = r0
            r4.getCastModels()
        L112:
            return
    }

    private void setNoDescriptionData() {
            r3 = this;
            android.widget.TextView r0 = r3.txt_rating
            java.lang.String r1 = "N/A"
            r0.setText(r1)
            android.widget.TextView r0 = r3.txt_genre
            r0.setText(r1)
            com.iarcuschin.simpleratingbar.SimpleRatingBar r0 = r3.ratingBar
            r2 = 0
            r0.setRating(r2)
            android.widget.TextView r0 = r3.txt_year
            r0.setText(r1)
            android.widget.TextView r0 = r3.txt_duration
            r0.setText(r1)
            android.widget.TextView r0 = r3.txt_description
            com.flextv.livestore.models.WordModels r2 = r3.wordModels
            java.lang.String r2 = r2.getNo_information()
            r0.setText(r2)
            android.widget.TextView r0 = r3.txt_added
            r0.setText(r1)
            android.widget.RelativeLayout r0 = r3.btn_trailer
            r1 = 8
            r0.setVisibility(r1)
            android.widget.RelativeLayout r0 = r3.btn_play
            r1 = 2131427469(0x7f0b008d, float:1.8476555E38)
            r0.setNextFocusRightId(r1)
            android.widget.RelativeLayout r0 = r3.btn_favorite
            r1 = 2131427480(0x7f0b0098, float:1.8476577E38)
            r0.setNextFocusLeftId(r1)
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
            r4 = 1
            r3.<init>(r5, r6, r4)
            androidx.appcompat.app.AlertDialog$Builder r6 = r1.setPositiveButton(r2, r3)
            com.flextv.livestore.models.WordModels r1 = r5.wordModels
            java.lang.String r1 = r1.getCancel()
            com.flextv.livestore.activities.MovieActivity$$ExternalSyntheticLambda1 r2 = com.flextv.livestore.activities.MovieActivity$$ExternalSyntheticLambda1.INSTANCE$1
            r6.setNegativeButton(r1, r2)
            androidx.appcompat.app.AlertDialog r6 = r0.create()
            r6.show()
            return
    }

    private void watchYoutubeVideo(java.lang.String r6) {
            r5 = this;
            boolean r0 = com.flextv.livestore.helper.GetSharedInfo.isTVDevice(r5)
            java.lang.String r1 = "android.intent.action.VIEW"
            if (r0 == 0) goto L3c
            com.flextv.livestore.utils.Utils$YoutubePackageInfo r0 = com.flextv.livestore.utils.Utils.getYoutubePackageInfo(r5)
            if (r0 == 0) goto L31
            android.content.Intent r2 = new android.content.Intent
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "http://www.youtube.com/watch?v="
            r3.append(r4)
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            android.net.Uri r6 = android.net.Uri.parse(r6)
            r2.<init>(r1, r6)
            java.lang.String r6 = r0.packageName
            r2.setPackage(r6)
            r5.startActivity(r2)
            goto L60
        L31:
            r6 = 0
            java.lang.String r0 = "Please install youtube App."
            android.widget.Toast r6 = android.widget.Toast.makeText(r5, r0, r6)
            r6.show()
            goto L60
        L3c:
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Exception -> L60
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L60
            r2.<init>()     // Catch: java.lang.Exception -> L60
            java.lang.String r3 = "vnd.youtube:"
            r2.append(r3)     // Catch: java.lang.Exception -> L60
            r2.append(r6)     // Catch: java.lang.Exception -> L60
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Exception -> L60
            android.net.Uri r6 = android.net.Uri.parse(r6)     // Catch: java.lang.Exception -> L60
            r0.<init>(r1, r6)     // Catch: java.lang.Exception -> L60
            r6 = 276856832(0x10808000, float:5.0684313E-29)
            r0.addFlags(r6)     // Catch: java.lang.Exception -> L60
            r5.startActivity(r0)     // Catch: java.lang.Exception -> L60
        L60:
            return
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent r7) {
            r6 = this;
            int r0 = r7.getAction()
            if (r0 != 0) goto Lf2
            int r0 = r7.getKeyCode()
            r1 = 2
            r2 = 3
            r3 = 0
            r4 = 1
            switch(r0) {
                case 19: goto Lb1;
                case 20: goto L66;
                case 21: goto L3b;
                case 22: goto L13;
                default: goto L11;
            }
        L11:
            goto Lf2
        L13:
            int[] r0 = com.flextv.livestore.activities.MovieInfoActivity.AnonymousClass4.$SwitchMap$com$flextv$livestore$apps$FocusStatus
            com.flextv.livestore.apps.FocusStatus r1 = r6.getFocusStatus()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            if (r0 == r2) goto L23
            goto Lf2
        L23:
            android.widget.ImageButton r0 = r6.btn_back
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto Lf2
            com.flextv.livestore.apps.FocusStatus r7 = com.flextv.livestore.apps.FocusStatus.second
            r6.setFocusStatus(r7)
            android.widget.ImageButton r7 = r6.btn_back
            r7.setFocusable(r3)
            android.widget.RelativeLayout r7 = r6.btn_play
            r7.requestFocus()
            return r4
        L3b:
            int[] r0 = com.flextv.livestore.activities.MovieInfoActivity.AnonymousClass4.$SwitchMap$com$flextv$livestore$apps$FocusStatus
            com.flextv.livestore.apps.FocusStatus r1 = r6.getFocusStatus()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            if (r0 == r4) goto L4e
            if (r0 == r2) goto L4d
            goto Lf2
        L4d:
            return r4
        L4e:
            android.widget.RelativeLayout r0 = r6.btn_play
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto Lf2
            com.flextv.livestore.apps.FocusStatus r7 = com.flextv.livestore.apps.FocusStatus.first
            r6.setFocusStatus(r7)
            android.widget.ImageButton r7 = r6.btn_back
            r7.setFocusable(r4)
            android.widget.ImageButton r7 = r6.btn_back
            r7.requestFocus()
            return r4
        L66:
            int[] r0 = com.flextv.livestore.activities.MovieInfoActivity.AnonymousClass4.$SwitchMap$com$flextv$livestore$apps$FocusStatus
            com.flextv.livestore.apps.FocusStatus r5 = r6.getFocusStatus()
            int r5 = r5.ordinal()
            r0 = r0[r5]
            if (r0 == r4) goto L8a
            if (r0 == r1) goto L89
            if (r0 == r2) goto L7a
            goto Lf2
        L7a:
            com.flextv.livestore.apps.FocusStatus r7 = com.flextv.livestore.apps.FocusStatus.second
            r6.setFocusStatus(r7)
            android.widget.ImageButton r7 = r6.btn_back
            r7.setFocusable(r3)
            android.widget.RelativeLayout r7 = r6.btn_play
            r7.requestFocus()
        L89:
            return r4
        L8a:
            java.util.List<com.flextv.livestore.models.CastModel> r7 = r6.castModels
            if (r7 == 0) goto Lb0
            int r7 = r7.size()
            if (r7 <= 0) goto Lb0
            com.flextv.livestore.apps.FocusStatus r7 = com.flextv.livestore.apps.FocusStatus.third
            r6.setFocusStatus(r7)
            android.widget.RelativeLayout r7 = r6.btn_play
            r7.setFocusable(r3)
            android.widget.RelativeLayout r7 = r6.btn_favorite
            r7.setFocusable(r3)
            android.widget.RelativeLayout r7 = r6.btn_trailer
            r7.setFocusable(r3)
            r6.setFull()
            com.flextv.livestore.view.LiveHorizontalGridView r7 = r6.cast_list
            r7.requestFocus()
        Lb0:
            return r4
        Lb1:
            int[] r0 = com.flextv.livestore.activities.MovieInfoActivity.AnonymousClass4.$SwitchMap$com$flextv$livestore$apps$FocusStatus
            com.flextv.livestore.apps.FocusStatus r3 = r6.getFocusStatus()
            int r3 = r3.ordinal()
            r0 = r0[r3]
            if (r0 == r4) goto Le2
            if (r0 == r1) goto Lc5
            if (r0 == r2) goto Lc4
            goto Lf2
        Lc4:
            return r4
        Lc5:
            com.flextv.livestore.apps.FocusStatus r7 = com.flextv.livestore.apps.FocusStatus.second
            r6.setFocusStatus(r7)
            android.widget.RelativeLayout r7 = r6.btn_play
            r7.setFocusable(r4)
            android.widget.RelativeLayout r7 = r6.btn_favorite
            r7.setFocusable(r4)
            android.widget.RelativeLayout r7 = r6.btn_trailer
            r7.setFocusable(r4)
            android.widget.RelativeLayout r7 = r6.btn_play
            r7.requestFocus()
            r6.setFull()
            return r4
        Le2:
            com.flextv.livestore.apps.FocusStatus r7 = com.flextv.livestore.apps.FocusStatus.first
            r6.setFocusStatus(r7)
            android.widget.ImageButton r7 = r6.btn_back
            r7.setFocusable(r4)
            android.widget.ImageButton r7 = r6.btn_back
            r7.requestFocus()
            return r4
        Lf2:
            boolean r7 = super.dispatchKeyEvent(r7)
            return r7
    }

    public com.flextv.livestore.apps.FocusStatus getFocusStatus() {
            r1 = this;
            com.flextv.livestore.apps.FocusStatus r0 = r1.focusStatus
            return r0
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r8) {
            r7 = this;
            int r8 = r8.getId()
            r0 = 2
            r1 = 0
            r2 = 1
            switch(r8) {
                case 2131427464: goto L192;
                case 2131427469: goto L11e;
                case 2131427480: goto La8;
                case 2131427488: goto L44;
                case 2131427491: goto Lc;
                default: goto La;
            }
        La:
            goto L195
        Lc:
            com.flextv.livestore.models.MovieInfoResponse r8 = r7.movieInfoResponse
            if (r8 == 0) goto L35
            com.flextv.livestore.models.MovieInfo r8 = r8.getInfo()
            java.lang.String r8 = r8.getYoutube_trailer()
            if (r8 == 0) goto L26
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L21
            goto L26
        L21:
            r7.watchYoutubeVideo(r8)
            goto L195
        L26:
            com.flextv.livestore.models.WordModels r8 = r7.wordModels
            java.lang.String r8 = r8.getNo_trailer()
            android.widget.Toast r8 = android.widget.Toast.makeText(r7, r8, r1)
            r8.show()
            goto L195
        L35:
            com.flextv.livestore.models.WordModels r8 = r7.wordModels
            java.lang.String r8 = r8.getNo_trailer()
            android.widget.Toast r8 = android.widget.Toast.makeText(r7, r8, r1)
            r8.show()
            goto L195
        L44:
            int[] r8 = com.flextv.livestore.activities.MovieInfoActivity.AnonymousClass4.$SwitchMap$com$flextv$livestore$apps$FocusStatus
            com.flextv.livestore.apps.FocusStatus r3 = r7.getFocusStatus()
            int r3 = r3.ordinal()
            r8 = r8[r3]
            if (r8 == r2) goto L7a
            if (r8 == r0) goto L56
            goto L195
        L56:
            com.flextv.livestore.apps.FocusStatus r8 = com.flextv.livestore.apps.FocusStatus.second
            r7.setFocusStatus(r8)
            android.widget.RelativeLayout r8 = r7.btn_play
            r8.setFocusable(r2)
            android.widget.RelativeLayout r8 = r7.btn_favorite
            r8.setFocusable(r2)
            android.widget.RelativeLayout r8 = r7.btn_trailer
            r8.setFocusable(r2)
            android.widget.RelativeLayout r8 = r7.btn_play
            r8.requestFocus()
            android.widget.Button r8 = r7.btn_show_cast
            java.lang.String r0 = "Show Cast"
            r8.setText(r0)
            r7.setFull()
            return
        L7a:
            java.util.List<com.flextv.livestore.models.CastModel> r8 = r7.castModels
            if (r8 == 0) goto La7
            int r8 = r8.size()
            if (r8 <= 0) goto La7
            com.flextv.livestore.apps.FocusStatus r8 = com.flextv.livestore.apps.FocusStatus.third
            r7.setFocusStatus(r8)
            android.widget.RelativeLayout r8 = r7.btn_play
            r8.setFocusable(r1)
            android.widget.RelativeLayout r8 = r7.btn_favorite
            r8.setFocusable(r1)
            android.widget.RelativeLayout r8 = r7.btn_trailer
            r8.setFocusable(r1)
            r7.setFull()
            android.widget.Button r8 = r7.btn_show_cast
            java.lang.String r0 = "Hide Cast"
            r8.setText(r0)
            com.flextv.livestore.view.LiveHorizontalGridView r8 = r7.cast_list
            r8.requestFocus()
        La7:
            return
        La8:
            com.flextv.livestore.helper.PreferenceHelper r8 = r7.preferenceHelper
            int r8 = r8.getSharedPreferenceExternalPlayer()
            com.flextv.livestore.helper.PreferenceHelper r1 = r7.preferenceHelper
            boolean r1 = r1.getSharedPreferenceISM3U()
            if (r1 == 0) goto Lbf
            com.flextv.livestore.models.MovieModel r1 = r7.currentMovie
            java.lang.String r1 = r1.getUrl()
            r7.vod_url = r1
            goto Le3
        Lbf:
            com.flextv.livestore.helper.PreferenceHelper r1 = r7.preferenceHelper
            java.lang.String r1 = r1.getSharedPreferenceServerUrl()
            com.flextv.livestore.helper.PreferenceHelper r3 = r7.preferenceHelper
            java.lang.String r3 = r3.getSharedPreferenceUsername()
            com.flextv.livestore.helper.PreferenceHelper r4 = r7.preferenceHelper
            java.lang.String r4 = r4.getSharedPreferencePassword()
            com.flextv.livestore.models.MovieModel r5 = r7.currentMovie
            java.lang.String r5 = r5.getStream_id()
            com.flextv.livestore.models.MovieModel r6 = r7.currentMovie
            java.lang.String r6 = r6.getExtension()
            java.lang.String r1 = com.flextv.livestore.helper.GetSharedInfo.getMovieUrl(r1, r3, r4, r5, r6)
            r7.vod_url = r1
        Le3:
            if (r8 == 0) goto L119
            if (r8 == r2) goto L101
            if (r8 == r0) goto Leb
            goto L195
        Leb:
            com.flextv.livestore.utils.Utils$MXPackageInfo r8 = com.flextv.livestore.utils.Utils.getMXPackageInfo(r7)
            if (r8 == 0) goto Lfc
            java.lang.String r0 = r8.packageName
            java.lang.String r8 = r8.activityName
            java.lang.String r1 = r7.vod_url
            r7.externalMXplayer(r0, r8, r1)
            goto L195
        Lfc:
            r7.showExternalPlayerDialog(r0)
            goto L195
        L101:
            com.flextv.livestore.utils.Utils$VLCPackageInfo r8 = com.flextv.livestore.utils.Utils.getVlcPackageInfo(r7)
            if (r8 == 0) goto L114
            java.lang.String r8 = r7.vod_url
            com.flextv.livestore.models.MovieModel r0 = r7.currentMovie
            java.lang.String r0 = r0.getName()
            r7.externalvlcplayer(r8, r0)
            goto L195
        L114:
            r7.showExternalPlayerDialog(r2)
            goto L195
        L119:
            r7.playMovie()
            goto L195
        L11e:
            java.lang.String r8 = r7.category_name
            boolean r8 = r7.checkAdultMovies(r8)
            if (r8 == 0) goto L134
            com.flextv.livestore.models.WordModels r8 = r7.wordModels
            java.lang.String r8 = r8.getCant_add_this_movie()
            android.widget.Toast r8 = android.widget.Toast.makeText(r7, r8, r1)
            r8.show()
            goto L195
        L134:
            boolean r8 = r7.is_fav
            if (r8 == 0) goto L165
            r7.is_fav = r1
            android.widget.ImageView r8 = r7.image_fav
            r0 = 2131231038(0x7f08013e, float:1.8078146E38)
            r8.setImageResource(r0)
            android.widget.ImageView r8 = r7.image_fav
            android.content.res.Resources r0 = r7.getResources()
            r2 = 2131100407(0x7f0602f7, float:1.7813195E38)
            int r0 = r0.getColor(r2)
            r8.setColorFilter(r0)
            com.flextv.livestore.helper.RealmController r8 = com.flextv.livestore.helper.RealmController.with()
            com.flextv.livestore.models.MovieModel r0 = r7.currentMovie
            java.lang.String r0 = r0.getName()
            com.flextv.livestore.activities.MovieInfoActivity$$ExternalSyntheticLambda0 r2 = new com.flextv.livestore.activities.MovieInfoActivity$$ExternalSyntheticLambda0
            r2.<init>(r7, r1)
            r8.addToFavMovie(r0, r1, r2)
            goto L195
        L165:
            r7.is_fav = r2
            android.widget.ImageView r8 = r7.image_fav
            r0 = 2131231039(0x7f08013f, float:1.8078148E38)
            r8.setImageResource(r0)
            android.widget.ImageView r8 = r7.image_fav
            android.content.res.Resources r0 = r7.getResources()
            r1 = 2131100408(0x7f0602f8, float:1.7813197E38)
            int r0 = r0.getColor(r1)
            r8.setColorFilter(r0)
            com.flextv.livestore.helper.RealmController r8 = com.flextv.livestore.helper.RealmController.with()
            com.flextv.livestore.models.MovieModel r0 = r7.currentMovie
            java.lang.String r0 = r0.getName()
            com.flextv.livestore.activities.MovieInfoActivity$$ExternalSyntheticLambda0 r1 = new com.flextv.livestore.activities.MovieInfoActivity$$ExternalSyntheticLambda0
            r1.<init>(r7, r2)
            r8.addToFavMovie(r0, r2, r1)
            goto L195
        L192:
            r7.finish()
        L195:
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle r3) {
            r2 = this;
            super.onCreate(r3)
            r3 = 2131623978(0x7f0e002a, float:1.8875123E38)
            r2.setContentView(r3)
            com.flextv.livestore.utils.Utils.FullScreenCall(r2)
            com.flextv.livestore.helper.PreferenceHelper r3 = new com.flextv.livestore.helper.PreferenceHelper
            r3.<init>(r2)
            r2.preferenceHelper = r3
            com.flextv.livestore.models.WordModels r3 = com.flextv.livestore.helper.GetSharedInfo.getWordModel(r2)
            r2.wordModels = r3
            r2.initView()
            android.content.Intent r3 = r2.getIntent()
            java.lang.String r0 = "stream_id"
            java.lang.String r3 = r3.getStringExtra(r0)
            r2.stream_id = r3
            com.flextv.livestore.helper.PreferenceHelper r3 = r2.preferenceHelper
            boolean r3 = r3.getSharedPreferenceISM3U()
            java.lang.String r0 = "name"
            if (r3 == 0) goto L46
            com.flextv.livestore.helper.RealmController r3 = com.flextv.livestore.helper.RealmController.with()
            android.content.Intent r1 = r2.getIntent()
            java.lang.String r0 = r1.getStringExtra(r0)
            com.flextv.livestore.models.MovieModel r3 = r3.getMovieByName(r0)
            r2.currentMovie = r3
            goto L6d
        L46:
            java.lang.String r3 = r2.stream_id
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L61
            com.flextv.livestore.helper.RealmController r3 = com.flextv.livestore.helper.RealmController.with()
            android.content.Intent r1 = r2.getIntent()
            java.lang.String r0 = r1.getStringExtra(r0)
            com.flextv.livestore.models.MovieModel r3 = r3.getMovieByName(r0)
            r2.currentMovie = r3
            goto L6d
        L61:
            com.flextv.livestore.helper.RealmController r3 = com.flextv.livestore.helper.RealmController.with()
            java.lang.String r0 = r2.stream_id
            com.flextv.livestore.models.MovieModel r3 = r3.getMovieById(r0)
            r2.currentMovie = r3
        L6d:
            android.content.Intent r3 = r2.getIntent()
            java.lang.String r0 = "category_name"
            java.lang.String r3 = r3.getStringExtra(r0)
            r2.category_name = r3
            com.flextv.livestore.models.MovieModel r3 = r2.currentMovie
            java.lang.String r3 = r3.getStream_id()
            r2.stream_id = r3
            com.flextv.livestore.models.MovieModel r3 = r2.currentMovie
            boolean r3 = r3.isIs_favorite()
            r2.is_fav = r3
            if (r3 == 0) goto La4
            android.widget.ImageView r3 = r2.image_fav
            r0 = 2131231039(0x7f08013f, float:1.8078148E38)
            r3.setImageResource(r0)
            android.widget.ImageView r3 = r2.image_fav
            android.content.res.Resources r0 = r2.getResources()
            r1 = 2131100408(0x7f0602f8, float:1.7813197E38)
            int r0 = r0.getColor(r1)
            r3.setColorFilter(r0)
            goto Lbc
        La4:
            android.widget.ImageView r3 = r2.image_fav
            r0 = 2131231038(0x7f08013e, float:1.8078146E38)
            r3.setImageResource(r0)
            android.widget.ImageView r3 = r2.image_fav
            android.content.res.Resources r0 = r2.getResources()
            r1 = 2131100407(0x7f0602f7, float:1.7813195E38)
            int r0 = r0.getColor(r1)
            r3.setColorFilter(r0)
        Lbc:
            android.widget.TextView r3 = r2.txt_name
            com.flextv.livestore.models.MovieModel r0 = r2.currentMovie
            java.lang.String r0 = r0.getName()
            r3.setText(r0)
            r3 = 2131230889(0x7f0800a9, float:1.8077844E38)
            com.bumptech.glide.RequestManager r0 = com.bumptech.glide.Glide.with(r2)     // Catch: java.lang.Exception -> Le4
            com.flextv.livestore.models.MovieModel r1 = r2.currentMovie     // Catch: java.lang.Exception -> Le4
            java.lang.String r1 = r1.getStream_icon()     // Catch: java.lang.Exception -> Le4
            com.bumptech.glide.RequestBuilder r0 = r0.load(r1)     // Catch: java.lang.Exception -> Le4
            com.bumptech.glide.request.BaseRequestOptions r0 = r0.error(r3)     // Catch: java.lang.Exception -> Le4
            com.bumptech.glide.RequestBuilder r0 = (com.bumptech.glide.RequestBuilder) r0     // Catch: java.lang.Exception -> Le4
            android.widget.ImageView r1 = r2.movie_logo     // Catch: java.lang.Exception -> Le4
            r0.into(r1)     // Catch: java.lang.Exception -> Le4
            goto Lff
        Le4:
            android.content.Context r0 = r2.getApplicationContext()
            com.bumptech.glide.RequestManager r0 = com.bumptech.glide.Glide.with(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            com.bumptech.glide.RequestBuilder r0 = r0.load(r1)
            com.bumptech.glide.request.BaseRequestOptions r3 = r0.error(r3)
            com.bumptech.glide.RequestBuilder r3 = (com.bumptech.glide.RequestBuilder) r3
            android.widget.ImageView r0 = r2.movie_logo
            r3.into(r0)
        Lff:
            com.flextv.livestore.helper.PreferenceHelper r3 = r2.preferenceHelper
            boolean r3 = r3.getSharedPreferenceISM3U()
            if (r3 != 0) goto L10b
            r2.getMovieInfo()
            goto L10e
        L10b:
            r2.setNoDescriptionData()
        L10e:
            android.widget.RelativeLayout r3 = r2.btn_play
            r3.requestFocus()
            return
    }

    public void setFocusStatus(com.flextv.livestore.apps.FocusStatus r1) {
            r0 = this;
            r0.focusStatus = r1
            return
    }
}
