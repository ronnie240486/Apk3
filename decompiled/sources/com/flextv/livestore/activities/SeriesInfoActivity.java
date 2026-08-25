package com.flextv.livestore.activities;

/* JADX INFO: loaded from: classes3.dex */
public class SeriesInfoActivity extends androidx.appcompat.app.AppCompatActivity implements android.view.View.OnClickListener {
    public android.widget.ImageButton btn_back;
    public android.widget.RelativeLayout btn_favorite;
    public android.widget.RelativeLayout btn_play;
    public android.widget.RelativeLayout btn_trailer;
    public com.flextv.livestore.models.SeriesModel currentSeries;
    public android.widget.ImageView image_fav;
    public boolean is_fav;
    public android.widget.ImageView movie_logo;
    public com.flextv.livestore.helper.PreferenceHelper preferenceHelper;
    public com.iarcuschin.simpleratingbar.SimpleRatingBar ratingBar;
    public java.lang.String series_background;
    public android.widget.ImageView series_bg;
    public android.widget.TextView str_added;
    public android.widget.TextView str_cast;
    public java.lang.String stream_id;
    public android.widget.TextView txt_added;
    public android.widget.TextView txt_cast;
    public android.widget.TextView txt_description;
    public android.widget.TextView txt_duration;
    public android.widget.TextView txt_genre;
    public android.widget.TextView txt_name;
    public android.widget.TextView txt_play;
    public android.widget.TextView txt_rating;
    public android.widget.TextView txt_trailer;
    public android.widget.TextView txt_year;
    public com.flextv.livestore.models.WordModels wordModels;

    public static /* synthetic */ void $r8$lambda$Rrt_A_pHfY6wxbz_2df8DkCtWQ0(com.flextv.livestore.activities.SeriesInfoActivity r0, java.lang.String r1) {
            r0.lambda$getSeriesInfo$0(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$iqm5ONRYf_IxrSAEixANLLjDZmk(com.android.volley.VolleyError r0) {
            lambda$getSeriesInfo$1(r0)
            return
    }

    public static /* synthetic */ void $r8$lambda$sfrPvRd1nN75cKsFvLmVyVWwNQs(com.flextv.livestore.activities.SeriesInfoActivity r0) {
            r0.lambda$onClick$3()
            return
    }

    public static /* synthetic */ void $r8$lambda$xsJq6Gthy1jov2ZxFJp4h_PyZyg(com.flextv.livestore.activities.SeriesInfoActivity r0) {
            r0.lambda$onClick$2()
            return
    }

    public SeriesInfoActivity() {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = ""
            r2.stream_id = r0
            r1 = 0
            r2.is_fav = r1
            r2.series_background = r0
            com.flextv.livestore.models.WordModels r0 = new com.flextv.livestore.models.WordModels
            r0.<init>()
            r2.wordModels = r0
            return
    }

    private void getSeriesInfo() {
            r6 = this;
            com.android.volley.RequestQueue r0 = com.android.volley.toolbox.Volley.newRequestQueue(r6)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.flextv.livestore.helper.PreferenceHelper r2 = r6.preferenceHelper
            java.lang.String r2 = r2.getSharedPreferenceServerUrl()
            r1.append(r2)
            java.lang.String r2 = "/player_api.php?action=get_series_info&username="
            r1.append(r2)
            com.flextv.livestore.helper.PreferenceHelper r2 = r6.preferenceHelper
            java.lang.String r2 = r2.getSharedPreferenceUsername()
            r1.append(r2)
            java.lang.String r2 = "&password="
            r1.append(r2)
            com.flextv.livestore.helper.PreferenceHelper r2 = r6.preferenceHelper
            java.lang.String r2 = r2.getSharedPreferencePassword()
            r1.append(r2)
            java.lang.String r2 = "&series_id="
            r1.append(r2)
            java.lang.String r2 = r6.stream_id
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.android.volley.toolbox.StringRequest r2 = new com.android.volley.toolbox.StringRequest
            com.flextv.livestore.activities.SeriesInfoActivity$$ExternalSyntheticLambda0 r3 = new com.flextv.livestore.activities.SeriesInfoActivity$$ExternalSyntheticLambda0
            r4 = 0
            r3.<init>(r6, r4)
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda0 r5 = com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda0.INSTANCE$11
            r2.<init>(r4, r1, r3, r5)
            r0.add(r2)
            return
    }

    private void goToSeason() {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.flextv.livestore.activities.SeasonActivity> r1 = com.flextv.livestore.activities.SeasonActivity.class
            r0.<init>(r3, r1)
            com.flextv.livestore.models.SeriesModel r1 = r3.currentSeries
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "series_name"
            r0.putExtra(r2, r1)
            com.flextv.livestore.helper.PreferenceHelper r1 = r3.preferenceHelper
            boolean r1 = r1.getSharedPreferenceISM3U()
            if (r1 != 0) goto L27
            com.flextv.livestore.models.SeriesModel r1 = r3.currentSeries
            java.lang.String r1 = r1.getSeries_id()
            java.lang.String r2 = "series_id"
            r0.putExtra(r2, r1)
        L27:
            java.lang.String r1 = r3.series_background
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L36
            java.lang.String r1 = r3.series_background
            java.lang.String r2 = "image_url"
            r0.putExtra(r2, r1)
        L36:
            r3.startActivity(r0)
            return
    }

    private void initView() {
            r2 = this;
            r0 = 2131428142(0x7f0b032e, float:1.847792E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2.series_bg = r0
            r0 = 2131427805(0x7f0b01dd, float:1.8477237E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2.movie_logo = r0
            r0 = 2131427798(0x7f0b01d6, float:1.8477222E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2.image_fav = r0
            r0 = 2131428324(0x7f0b03e4, float:1.847829E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.txt_name = r0
            r0 = 2131428357(0x7f0b0405, float:1.8478356E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.txt_year = r0
            r0 = 2131428336(0x7f0b03f0, float:1.8478314E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.txt_rating = r0
            r0 = 2131428301(0x7f0b03cd, float:1.8478243E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.txt_duration = r0
            r0 = 2131428282(0x7f0b03ba, float:1.8478204E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.txt_added = r0
            r0 = 2131428299(0x7f0b03cb, float:1.8478239E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.txt_description = r0
            r0 = 2131428330(0x7f0b03ea, float:1.8478301E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.txt_play = r0
            r0 = 2131428351(0x7f0b03ff, float:1.8478344E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.txt_trailer = r0
            r0 = 2131427480(0x7f0b0098, float:1.8476577E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r2.btn_play = r0
            r0 = 2131427469(0x7f0b008d, float:1.8476555E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r2.btn_favorite = r0
            r0 = 2131427491(0x7f0b00a3, float:1.84766E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r2.btn_trailer = r0
            r0 = 2131427464(0x7f0b0088, float:1.8476545E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r2.btn_back = r0
            android.widget.RelativeLayout r0 = r2.btn_play
            r0.setOnClickListener(r2)
            android.widget.RelativeLayout r0 = r2.btn_favorite
            r0.setOnClickListener(r2)
            android.widget.RelativeLayout r0 = r2.btn_trailer
            r0.setOnClickListener(r2)
            android.widget.ImageButton r0 = r2.btn_back
            r0.setOnClickListener(r2)
            r0 = 2131428070(0x7f0b02e6, float:1.8477774E38)
            android.view.View r0 = r2.findViewById(r0)
            com.iarcuschin.simpleratingbar.SimpleRatingBar r0 = (com.iarcuschin.simpleratingbar.SimpleRatingBar) r0
            r2.ratingBar = r0
            r0 = 2131428309(0x7f0b03d5, float:1.8478259E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.txt_genre = r0
            r0 = 2131428184(0x7f0b0358, float:1.8478005E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.str_cast = r0
            r0 = 2131428286(0x7f0b03be, float:1.8478212E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.txt_cast = r0
            r0 = 2131428182(0x7f0b0356, float:1.8478001E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.str_added = r0
            r0 = 2131428066(0x7f0b02e2, float:1.8477766E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            android.widget.TextView r0 = r2.txt_play
            com.flextv.livestore.models.WordModels r1 = r2.wordModels
            java.lang.String r1 = r1.getWatch_season()
            r0.setText(r1)
            android.widget.TextView r0 = r2.txt_trailer
            com.flextv.livestore.models.WordModels r1 = r2.wordModels
            java.lang.String r1 = r1.getTrailer()
            r0.setText(r1)
            android.widget.TextView r0 = r2.str_cast
            com.flextv.livestore.models.WordModels r1 = r2.wordModels
            java.lang.String r1 = r1.getCast()
            r0.setText(r1)
            android.widget.TextView r0 = r2.str_added
            com.flextv.livestore.models.WordModels r1 = r2.wordModels
            java.lang.String r1 = r1.getDate_added()
            r0.setText(r1)
            return
    }

    private /* synthetic */ void lambda$getSeriesInfo$0(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "backdrop_path"
            java.lang.String r1 = "info"
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L3c
            r2.<init>(r4)     // Catch: java.lang.Exception -> L3c
            boolean r4 = r2.has(r1)     // Catch: java.lang.Exception -> L3c
            if (r4 == 0) goto L3c
            org.json.JSONObject r4 = r2.getJSONObject(r1)     // Catch: java.lang.Exception -> L3c
            boolean r1 = r4.has(r0)     // Catch: java.lang.Exception -> L3c
            if (r1 == 0) goto L3c
            org.json.JSONArray r4 = r4.getJSONArray(r0)     // Catch: java.lang.Exception -> L38
            r0 = 0
            java.lang.String r4 = r4.getString(r0)     // Catch: java.lang.Exception -> L38
            r3.series_background = r4     // Catch: java.lang.Exception -> L38
            android.content.Context r4 = r3.getApplicationContext()     // Catch: java.lang.Exception -> L38
            com.bumptech.glide.RequestManager r4 = com.bumptech.glide.Glide.with(r4)     // Catch: java.lang.Exception -> L38
            java.lang.String r0 = r3.series_background     // Catch: java.lang.Exception -> L38
            com.bumptech.glide.RequestBuilder r4 = r4.load(r0)     // Catch: java.lang.Exception -> L38
            android.widget.ImageView r0 = r3.series_bg     // Catch: java.lang.Exception -> L38
            r4.into(r0)     // Catch: java.lang.Exception -> L38
            goto L3c
        L38:
            java.lang.String r4 = ""
            r3.series_background = r4     // Catch: java.lang.Exception -> L3c
        L3c:
            return
    }

    private static /* synthetic */ void lambda$getSeriesInfo$1(com.android.volley.VolleyError r0) {
            return
    }

    private /* synthetic */ void lambda$onClick$2() {
            r2 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = r2.preferenceHelper
            com.flextv.livestore.helper.RealmController r1 = com.flextv.livestore.helper.RealmController.with()
            java.util.List r1 = r1.getFavSeriesNames()
            r0.setSharedPreferenceSeriesFavNames(r1)
            return
    }

    private /* synthetic */ void lambda$onClick$3() {
            r2 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = r2.preferenceHelper
            com.flextv.livestore.helper.RealmController r1 = com.flextv.livestore.helper.RealmController.with()
            java.util.List r1 = r1.getFavSeriesNames()
            r0.setSharedPreferenceSeriesFavNames(r1)
            return
    }

    private void setSeriesInfo() {
            r3 = this;
            android.widget.TextView r0 = r3.txt_description
            com.flextv.livestore.models.SeriesModel r1 = r3.currentSeries
            java.lang.String r1 = r1.getPlot()
            r0.setText(r1)
            android.widget.TextView r0 = r3.txt_genre
            com.flextv.livestore.models.SeriesModel r1 = r3.currentSeries
            java.lang.String r1 = r1.getGenre()
            r0.setText(r1)
            android.widget.TextView r0 = r3.txt_cast
            com.flextv.livestore.models.SeriesModel r1 = r3.currentSeries
            java.lang.String r1 = r1.getCast()
            r0.setText(r1)
            android.widget.TextView r0 = r3.txt_rating     // Catch: java.lang.Exception -> L40
            com.flextv.livestore.models.SeriesModel r1 = r3.currentSeries     // Catch: java.lang.Exception -> L40
            float r1 = r1.getRating()     // Catch: java.lang.Exception -> L40
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Exception -> L40
            r0.setText(r1)     // Catch: java.lang.Exception -> L40
            com.iarcuschin.simpleratingbar.SimpleRatingBar r0 = r3.ratingBar     // Catch: java.lang.Exception -> L40
            com.flextv.livestore.models.SeriesModel r1 = r3.currentSeries     // Catch: java.lang.Exception -> L40
            float r1 = r1.getRating()     // Catch: java.lang.Exception -> L40
            float r1 = r1 / r2
            r0.setRating(r1)     // Catch: java.lang.Exception -> L40
            goto L4d
        L40:
            android.widget.TextView r0 = r3.txt_rating
            java.lang.String r1 = "0.0"
            r0.setText(r1)
            com.iarcuschin.simpleratingbar.SimpleRatingBar r0 = r3.ratingBar
            r1 = 0
            r0.setRating(r1)
        L4d:
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
    public boolean dispatchKeyEvent(android.view.KeyEvent r3) {
            r2 = this;
            int r0 = r3.getAction()
            if (r0 != 0) goto L59
            int r0 = r3.getKeyCode()
            r1 = 1
            switch(r0) {
                case 19: goto L36;
                case 20: goto L22;
                case 21: goto Lf;
                case 22: goto L22;
                default: goto Le;
            }
        Le:
            goto L59
        Lf:
            android.widget.RelativeLayout r0 = r2.btn_play
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L59
            android.widget.ImageButton r3 = r2.btn_back
            r3.setFocusable(r1)
            android.widget.ImageButton r3 = r2.btn_back
            r3.requestFocus()
            return r1
        L22:
            android.widget.ImageButton r0 = r2.btn_back
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L59
            android.widget.ImageButton r3 = r2.btn_back
            r0 = 0
            r3.setFocusable(r0)
            android.widget.RelativeLayout r3 = r2.btn_play
            r3.requestFocus()
            return r1
        L36:
            android.widget.RelativeLayout r0 = r2.btn_play
            boolean r0 = r0.hasFocus()
            if (r0 != 0) goto L4e
            android.widget.RelativeLayout r0 = r2.btn_trailer
            boolean r0 = r0.hasFocus()
            if (r0 != 0) goto L4e
            android.widget.RelativeLayout r0 = r2.btn_favorite
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L59
        L4e:
            android.widget.ImageButton r3 = r2.btn_back
            r3.setFocusable(r1)
            android.widget.ImageButton r3 = r2.btn_back
            r3.requestFocus()
            return r1
        L59:
            boolean r3 = super.dispatchKeyEvent(r3)
            return r3
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r5) {
            r4 = this;
            int r5 = r5.getId()
            r0 = 0
            switch(r5) {
                case 2131427464: goto L90;
                case 2131427469: goto L30;
                case 2131427480: goto L2c;
                case 2131427491: goto La;
                default: goto L8;
            }
        L8:
            goto L93
        La:
            com.flextv.livestore.models.SeriesModel r5 = r4.currentSeries
            java.lang.String r5 = r5.getYoutube()
            if (r5 == 0) goto L1e
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L19
            goto L1e
        L19:
            r4.watchYoutubeVideo(r5)
            goto L93
        L1e:
            com.flextv.livestore.models.WordModels r5 = r4.wordModels
            java.lang.String r5 = r5.getNo_trailer()
            android.widget.Toast r5 = android.widget.Toast.makeText(r4, r5, r0)
            r5.show()
            goto L93
        L2c:
            r4.goToSeason()
            goto L93
        L30:
            boolean r5 = r4.is_fav
            r1 = 1
            if (r5 == 0) goto L62
            r4.is_fav = r0
            android.widget.ImageView r5 = r4.image_fav
            r2 = 2131231038(0x7f08013e, float:1.8078146E38)
            r5.setImageResource(r2)
            android.widget.ImageView r5 = r4.image_fav
            android.content.res.Resources r2 = r4.getResources()
            r3 = 2131100407(0x7f0602f7, float:1.7813195E38)
            int r2 = r2.getColor(r3)
            r5.setColorFilter(r2)
            com.flextv.livestore.helper.RealmController r5 = com.flextv.livestore.helper.RealmController.with()
            com.flextv.livestore.models.SeriesModel r2 = r4.currentSeries
            java.lang.String r2 = r2.getName()
            com.flextv.livestore.activities.SeriesInfoActivity$$ExternalSyntheticLambda0 r3 = new com.flextv.livestore.activities.SeriesInfoActivity$$ExternalSyntheticLambda0
            r3.<init>(r4, r1)
            r5.addToFavSeries(r2, r0, r3)
            goto L93
        L62:
            r4.is_fav = r1
            android.widget.ImageView r5 = r4.image_fav
            r0 = 2131231039(0x7f08013f, float:1.8078148E38)
            r5.setImageResource(r0)
            android.widget.ImageView r5 = r4.image_fav
            android.content.res.Resources r0 = r4.getResources()
            r2 = 2131100408(0x7f0602f8, float:1.7813197E38)
            int r0 = r0.getColor(r2)
            r5.setColorFilter(r0)
            com.flextv.livestore.helper.RealmController r5 = com.flextv.livestore.helper.RealmController.with()
            com.flextv.livestore.models.SeriesModel r0 = r4.currentSeries
            java.lang.String r0 = r0.getName()
            com.flextv.livestore.activities.SeriesInfoActivity$$ExternalSyntheticLambda0 r2 = new com.flextv.livestore.activities.SeriesInfoActivity$$ExternalSyntheticLambda0
            r3 = 2
            r2.<init>(r4, r3)
            r5.addToFavSeries(r0, r1, r2)
            goto L93
        L90:
            r4.finish()
        L93:
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle r6) {
            r5 = this;
            super.onCreate(r6)
            r6 = 2131623985(0x7f0e0031, float:1.8875137E38)
            r5.setContentView(r6)
            com.flextv.livestore.utils.Utils.FullScreenCall(r5)
            com.flextv.livestore.helper.PreferenceHelper r6 = new com.flextv.livestore.helper.PreferenceHelper
            r6.<init>(r5)
            r5.preferenceHelper = r6
            com.flextv.livestore.models.WordModels r6 = com.flextv.livestore.helper.GetSharedInfo.getWordModel(r5)
            r5.wordModels = r6
            r5.initView()
            android.content.Intent r6 = r5.getIntent()
            java.lang.String r0 = "series_id"
            java.lang.String r6 = r6.getStringExtra(r0)
            r5.stream_id = r6
            com.flextv.livestore.helper.PreferenceHelper r6 = r5.preferenceHelper
            boolean r6 = r6.getSharedPreferenceISM3U()
            java.lang.String r0 = "name"
            if (r6 == 0) goto L46
            com.flextv.livestore.helper.RealmController r6 = com.flextv.livestore.helper.RealmController.with()
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = r1.getStringExtra(r0)
            com.flextv.livestore.models.SeriesModel r6 = r6.getSeriesByName(r0)
            r5.currentSeries = r6
            goto L6d
        L46:
            java.lang.String r6 = r5.stream_id
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L61
            com.flextv.livestore.helper.RealmController r6 = com.flextv.livestore.helper.RealmController.with()
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = r1.getStringExtra(r0)
            com.flextv.livestore.models.SeriesModel r6 = r6.getSeriesByName(r0)
            r5.currentSeries = r6
            goto L6d
        L61:
            com.flextv.livestore.helper.RealmController r6 = com.flextv.livestore.helper.RealmController.with()
            java.lang.String r0 = r5.stream_id
            com.flextv.livestore.models.SeriesModel r6 = r6.getSeriesById(r0)
            r5.currentSeries = r6
        L6d:
            android.content.Intent r6 = r5.getIntent()
            java.lang.String r0 = "category_id"
            r6.getStringExtra(r0)
            com.flextv.livestore.models.SeriesModel r6 = r5.currentSeries
            java.lang.String r6 = r6.getSeries_id()
            r5.stream_id = r6
            com.flextv.livestore.models.SeriesModel r6 = r5.currentSeries
            boolean r6 = r6.isIs_favorite()
            r0 = 0
            if (r6 == 0) goto La3
            r6 = 1
            r5.is_fav = r6
            android.widget.ImageView r6 = r5.image_fav
            r1 = 2131231039(0x7f08013f, float:1.8078148E38)
            r6.setImageResource(r1)
            android.widget.ImageView r6 = r5.image_fav
            android.content.res.Resources r1 = r5.getResources()
            r2 = 2131100408(0x7f0602f8, float:1.7813197E38)
            int r1 = r1.getColor(r2)
            r6.setColorFilter(r1)
            goto Lbd
        La3:
            r5.is_fav = r0
            android.widget.ImageView r6 = r5.image_fav
            r1 = 2131231038(0x7f08013e, float:1.8078146E38)
            r6.setImageResource(r1)
            android.widget.ImageView r6 = r5.image_fav
            android.content.res.Resources r1 = r5.getResources()
            r2 = 2131100407(0x7f0602f7, float:1.7813195E38)
            int r1 = r1.getColor(r2)
            r6.setColorFilter(r1)
        Lbd:
            android.widget.TextView r6 = r5.txt_name
            com.flextv.livestore.models.SeriesModel r1 = r5.currentSeries
            java.lang.String r1 = r1.getName()
            r6.setText(r1)
            android.widget.TextView r6 = r5.txt_year
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.flextv.livestore.models.SeriesModel r2 = r5.currentSeries
            java.lang.String r2 = r2.getReleaseDate()
            java.lang.String r3 = "yyyy-MM-dd"
            java.lang.String r4 = "yyyy"
            java.lang.String r2 = com.flextv.livestore.utils.Utils.formateDateFromstring(r3, r4, r2)
            r1.append(r2)
            com.flextv.livestore.models.SeriesModel r2 = r5.currentSeries
            java.lang.String r2 = r2.getGenre()
            boolean r2 = r2.isEmpty()
            java.lang.String r3 = ""
            if (r2 == 0) goto Lf2
            r2 = r3
            goto L105
        Lf2:
            java.lang.String r2 = ", "
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            com.flextv.livestore.models.SeriesModel r4 = r5.currentSeries
            java.lang.String r4 = r4.getGenre()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
        L105:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r6.setText(r1)
            android.widget.TextView r6 = r5.txt_added     // Catch: java.lang.Exception -> L123
            com.flextv.livestore.models.SeriesModel r1 = r5.currentSeries     // Catch: java.lang.Exception -> L123
            java.lang.String r1 = r1.getLast_modified()     // Catch: java.lang.Exception -> L123
            long r1 = java.lang.Long.parseLong(r1)     // Catch: java.lang.Exception -> L123
            java.lang.String r1 = com.flextv.livestore.utils.Utils.getDate(r1)     // Catch: java.lang.Exception -> L123
            r6.setText(r1)     // Catch: java.lang.Exception -> L123
            goto L12e
        L123:
            android.widget.TextView r6 = r5.txt_added
            com.flextv.livestore.models.SeriesModel r1 = r5.currentSeries
            java.lang.String r1 = r1.getLast_modified()
            r6.setText(r1)
        L12e:
            android.widget.TextView r6 = r5.txt_duration
            r6.setText(r3)
            r6 = 2131230890(0x7f0800aa, float:1.8077846E38)
            com.bumptech.glide.RequestManager r1 = com.bumptech.glide.Glide.with(r5)     // Catch: java.lang.Exception -> L150
            com.flextv.livestore.models.SeriesModel r2 = r5.currentSeries     // Catch: java.lang.Exception -> L150
            java.lang.String r2 = r2.getStream_icon()     // Catch: java.lang.Exception -> L150
            com.bumptech.glide.RequestBuilder r1 = r1.load(r2)     // Catch: java.lang.Exception -> L150
            com.bumptech.glide.request.BaseRequestOptions r1 = r1.error(r6)     // Catch: java.lang.Exception -> L150
            com.bumptech.glide.RequestBuilder r1 = (com.bumptech.glide.RequestBuilder) r1     // Catch: java.lang.Exception -> L150
            android.widget.ImageView r2 = r5.movie_logo     // Catch: java.lang.Exception -> L150
            r1.into(r2)     // Catch: java.lang.Exception -> L150
            goto L167
        L150:
            com.bumptech.glide.RequestManager r1 = com.bumptech.glide.Glide.with(r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            com.bumptech.glide.RequestBuilder r1 = r1.load(r2)
            com.bumptech.glide.request.BaseRequestOptions r6 = r1.error(r6)
            com.bumptech.glide.RequestBuilder r6 = (com.bumptech.glide.RequestBuilder) r6
            android.widget.ImageView r1 = r5.movie_logo
            r6.into(r1)
        L167:
            r5.setSeriesInfo()
            com.flextv.livestore.helper.PreferenceHelper r6 = r5.preferenceHelper
            boolean r6 = r6.getSharedPreferenceISM3U()
            if (r6 != 0) goto L175
            r5.getSeriesInfo()
        L175:
            com.flextv.livestore.models.SeriesModel r6 = r5.currentSeries
            java.lang.String r6 = r6.getYoutube()
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L187
            android.widget.RelativeLayout r6 = r5.btn_trailer
            r6.setVisibility(r0)
            goto L19e
        L187:
            android.widget.RelativeLayout r6 = r5.btn_trailer
            r1 = 8
            r6.setVisibility(r1)
            android.widget.RelativeLayout r6 = r5.btn_play
            r1 = 2131427469(0x7f0b008d, float:1.8476555E38)
            r6.setNextFocusRightId(r1)
            android.widget.RelativeLayout r6 = r5.btn_favorite
            r1 = 2131427480(0x7f0b0098, float:1.8476577E38)
            r6.setNextFocusLeftId(r1)
        L19e:
            android.widget.ImageButton r6 = r5.btn_back
            r6.setFocusable(r0)
            android.widget.RelativeLayout r6 = r5.btn_play
            r6.requestFocus()
            return
    }
}
