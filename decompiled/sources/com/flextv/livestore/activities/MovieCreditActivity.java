package com.flextv.livestore.activities;

/* JADX INFO: loaded from: classes.dex */
public class MovieCreditActivity extends androidx.appcompat.app.AppCompatActivity implements android.view.View.OnClickListener {
    public com.flextv.livestore.adapter.MovieCreditRecyclerAdapter adapter;
    public android.widget.ImageButton btn_back;
    public android.widget.Button btn_play;
    public android.widget.Button btn_trailer;
    public com.flextv.livestore.models.MovieCreditModel currentMovieModel;
    public java.util.List<com.flextv.livestore.models.MovieCreditModel> modelList;
    public android.widget.ImageView movie_bg;
    public android.widget.ImageView movie_logo;
    public int person_id;
    public com.iarcuschin.simpleratingbar.SimpleRatingBar ratingBar;
    public com.flextv.livestore.view.LiveHorizontalGridView recycler_vod;
    public android.widget.TextView txt_description;
    public android.widget.TextView txt_name;
    public android.widget.TextView txt_rating;
    public android.widget.TextView txt_year;
    public com.flextv.livestore.models.WordModels wordModels;





    public MovieCreditActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.modelList = r0
            com.flextv.livestore.models.WordModels r0 = new com.flextv.livestore.models.WordModels
            r0.<init>()
            r1.wordModels = r0
            return
    }

    public static /* synthetic */ void access$000(com.flextv.livestore.activities.MovieCreditActivity r0, java.util.List r1) {
            r0.getNewModelList(r1)
            return
    }

    public static /* synthetic */ void access$100(com.flextv.livestore.activities.MovieCreditActivity r0, com.flextv.livestore.models.MovieCreditModel r1) {
            r0.setMovieInfo(r1)
            return
    }

    private void getMovieCredit() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r2.person_id
            r0.append(r1)
            java.lang.String r1 = "/movie_credits?api_key="
            r0.append(r1)
            java.lang.String r1 = "<REDACTED_API_KEY_FROM_ORIGINAL_APK>"
            r0.append(r1)
            java.lang.String r1 = "&language=en-US"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = com.flextv.livestore.apps.Constants.PERSON_API
            com.flextv.livestore.remote.APIService r1 = com.flextv.livestore.remote.RetroClass.getAPIService(r1)
            retrofit2.Call r0 = r1.getMovieCreditModels(r0)
            com.flextv.livestore.activities.MovieCreditActivity$1 r1 = new com.flextv.livestore.activities.MovieCreditActivity$1
            r1.<init>(r2)
            r0.enqueue(r1)
            return
    }

    private void getNewModelList(java.util.List<com.flextv.livestore.models.MovieCreditModel> r4) {
            r3 = this;
            if (r4 == 0) goto L47
            int r0 = r4.size()
            if (r0 <= 0) goto L47
            java.util.Iterator r4 = r4.iterator()
        Lc:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r4.next()
            com.flextv.livestore.models.MovieCreditModel r0 = (com.flextv.livestore.models.MovieCreditModel) r0
            com.flextv.livestore.helper.RealmController r1 = com.flextv.livestore.helper.RealmController.with()
            java.lang.String r2 = r0.getTitle()
            com.flextv.livestore.models.MovieModel r1 = r1.getContainMoviesByTitle(r2)
            if (r1 != 0) goto Lc
            java.util.List<com.flextv.livestore.models.MovieCreditModel> r1 = r3.modelList
            r1.remove(r0)
            goto Lc
        L2c:
            com.flextv.livestore.adapter.MovieCreditRecyclerAdapter r4 = r3.adapter
            java.util.List<com.flextv.livestore.models.MovieCreditModel> r0 = r3.modelList
            r4.setMovieCreditModels(r0)
            java.util.List<com.flextv.livestore.models.MovieCreditModel> r4 = r3.modelList
            int r4 = r4.size()
            if (r4 <= 0) goto L47
            java.util.List<com.flextv.livestore.models.MovieCreditModel> r4 = r3.modelList
            r0 = 0
            java.lang.Object r4 = r4.get(r0)
            com.flextv.livestore.models.MovieCreditModel r4 = (com.flextv.livestore.models.MovieCreditModel) r4
            r3.setMovieInfo(r4)
        L47:
            return
    }

    private void getTrailerVideoId() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.flextv.livestore.models.MovieCreditModel r1 = r2.currentMovieModel
            int r1 = r1.getId()
            r0.append(r1)
            java.lang.String r1 = "/videos?api_key="
            r0.append(r1)
            java.lang.String r1 = "<REDACTED_API_KEY_FROM_ORIGINAL_APK>"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = com.flextv.livestore.apps.Constants.IMDB_API
            com.flextv.livestore.remote.APIService r1 = com.flextv.livestore.remote.RetroClass.getAPIService(r1)
            retrofit2.Call r0 = r1.getTmdbVideoModels(r0)
            com.flextv.livestore.activities.MovieCreditActivity$2 r1 = new com.flextv.livestore.activities.MovieCreditActivity$2
            r1.<init>(r2)
            r0.enqueue(r1)
            return
    }

    private void initView() {
            r4 = this;
            r0 = 2131427985(0x7f0b0291, float:1.8477602E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r4.movie_bg = r0
            r0 = 2131427805(0x7f0b01dd, float:1.8477237E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r4.movie_logo = r0
            r0 = 2131427464(0x7f0b0088, float:1.8476545E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r4.btn_back = r0
            r0 = 2131428085(0x7f0b02f5, float:1.8477805E38)
            android.view.View r0 = r4.findViewById(r0)
            com.flextv.livestore.view.LiveHorizontalGridView r0 = (com.flextv.livestore.view.LiveHorizontalGridView) r0
            r4.recycler_vod = r0
            r0 = 2131428324(0x7f0b03e4, float:1.847829E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.txt_name = r0
            r0 = 2131428357(0x7f0b0405, float:1.8478356E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.txt_year = r0
            r0 = 2131428309(0x7f0b03d5, float:1.8478259E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 2131428336(0x7f0b03f0, float:1.8478314E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.txt_rating = r0
            r0 = 2131428301(0x7f0b03cd, float:1.8478243E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 2131428282(0x7f0b03ba, float:1.8478204E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 2131428299(0x7f0b03cb, float:1.8478239E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.txt_description = r0
            r0 = 2131428070(0x7f0b02e6, float:1.8477774E38)
            android.view.View r0 = r4.findViewById(r0)
            com.iarcuschin.simpleratingbar.SimpleRatingBar r0 = (com.iarcuschin.simpleratingbar.SimpleRatingBar) r0
            r4.ratingBar = r0
            r0 = 2131427469(0x7f0b008d, float:1.8476555E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r0 = 2131427480(0x7f0b0098, float:1.8476577E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r4.btn_play = r0
            r0 = 2131427491(0x7f0b00a3, float:1.84766E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r4.btn_trailer = r0
            android.widget.ImageButton r0 = r4.btn_back
            r0.setOnClickListener(r4)
            android.widget.Button r0 = r4.btn_play
            r0.setOnClickListener(r4)
            android.widget.Button r0 = r4.btn_trailer
            r0.setOnClickListener(r4)
            com.flextv.livestore.adapter.MovieCreditRecyclerAdapter r0 = new com.flextv.livestore.adapter.MovieCreditRecyclerAdapter
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.<init>(r4, r1)
            r4.adapter = r0
            com.flextv.livestore.activities.MovieCreditActivity$3 r1 = new com.flextv.livestore.activities.MovieCreditActivity$3
            r1.<init>(r4)
            r0.setItemClickListener(r1)
            com.flextv.livestore.view.LiveHorizontalGridView r0 = r4.recycler_vod
            com.flextv.livestore.adapter.MovieCreditRecyclerAdapter r1 = r4.adapter
            r0.setAdapter(r1)
            boolean r0 = com.flextv.livestore.helper.GetSharedInfo.isTVDevice(r4)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Le9
            com.flextv.livestore.view.LiveHorizontalGridView r0 = r4.recycler_vod
            r0.setLoop(r2)
            com.flextv.livestore.view.LiveHorizontalGridView r0 = r4.recycler_vod
            r0.setPreserveFocusAfterLayout(r1)
            android.view.View[] r0 = new android.view.View[r1]
            r1 = 0
            r0[r2] = r1
            com.flextv.livestore.view.LiveHorizontalGridView r1 = r4.recycler_vod
            com.flextv.livestore.activities.MovieCreditActivity$4 r2 = new com.flextv.livestore.activities.MovieCreditActivity$4
            r2.<init>(r0)
            r1.setOnChildViewHolderSelectedListener(r2)
            goto Lf8
        Le9:
            com.flextv.livestore.view.LiveHorizontalGridView r0 = r4.recycler_vod
            androidx.recyclerview.widget.LinearLayoutManager r3 = new androidx.recyclerview.widget.LinearLayoutManager
            r3.<init>(r4, r2, r2)
            r0.setLayoutManager(r3)
            com.flextv.livestore.view.LiveHorizontalGridView r0 = r4.recycler_vod
            r0.setHasFixedSize(r1)
        Lf8:
            android.widget.Button r0 = r4.btn_play
            com.flextv.livestore.models.WordModels r1 = r4.wordModels
            java.lang.String r1 = r1.getFind_movie()
            r0.setText(r1)
            android.widget.Button r0 = r4.btn_trailer
            com.flextv.livestore.models.WordModels r1 = r4.wordModels
            java.lang.String r1 = r1.getWatch_trailer()
            r0.setText(r1)
            return
    }

    private void setMovieInfo(com.flextv.livestore.models.MovieCreditModel r5) {
            r4 = this;
            r4.currentMovieModel = r5
            android.widget.TextView r0 = r4.txt_name
            java.lang.String r1 = r5.getTitle()
            r0.setText(r1)
            android.widget.TextView r0 = r4.txt_description
            java.lang.String r1 = r5.getOverview()
            r0.setText(r1)
            android.widget.TextView r0 = r4.txt_year
            java.lang.String r1 = r5.getRelease_date()
            r0.setText(r1)
            android.widget.TextView r0 = r4.txt_rating     // Catch: java.lang.Exception -> L45
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L45
            r1.<init>()     // Catch: java.lang.Exception -> L45
            java.lang.String r2 = ""
            r1.append(r2)     // Catch: java.lang.Exception -> L45
            float r2 = r5.getVote_average()     // Catch: java.lang.Exception -> L45
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            r1.append(r2)     // Catch: java.lang.Exception -> L45
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L45
            r0.setText(r1)     // Catch: java.lang.Exception -> L45
            com.iarcuschin.simpleratingbar.SimpleRatingBar r0 = r4.ratingBar     // Catch: java.lang.Exception -> L45
            float r1 = r5.getVote_average()     // Catch: java.lang.Exception -> L45
            float r1 = r1 / r3
            r0.setRating(r1)     // Catch: java.lang.Exception -> L45
            goto L52
        L45:
            android.widget.TextView r0 = r4.txt_rating
            java.lang.String r1 = "N/A"
            r0.setText(r1)
            com.iarcuschin.simpleratingbar.SimpleRatingBar r0 = r4.ratingBar
            r1 = 0
            r0.setRating(r1)
        L52:
            java.lang.String r0 = r5.getBackdrop_path()
            if (r0 == 0) goto L89
            java.lang.String r0 = r5.getBackdrop_path()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L89
            android.content.Context r0 = r4.getApplicationContext()
            com.bumptech.glide.RequestManager r0 = com.bumptech.glide.Glide.with(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = com.flextv.livestore.apps.Constants.IMDB_IMAGE_PREF
            r1.append(r2)
            java.lang.String r2 = r5.getBackdrop_path()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.bumptech.glide.RequestBuilder r0 = r0.load(r1)
            android.widget.ImageView r1 = r4.movie_bg
            r0.into(r1)
            goto La1
        L89:
            android.content.Context r0 = r4.getApplicationContext()
            com.bumptech.glide.RequestManager r0 = com.bumptech.glide.Glide.with(r0)
            r1 = 2131230842(0x7f08007a, float:1.8077748E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.bumptech.glide.RequestBuilder r0 = r0.load(r1)
            android.widget.ImageView r1 = r4.movie_bg
            r0.into(r1)
        La1:
            java.lang.String r0 = r5.getPoster_path()
            if (r0 == 0) goto Ld8
            java.lang.String r0 = r5.getPoster_path()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Ld8
            android.content.Context r0 = r4.getApplicationContext()
            com.bumptech.glide.RequestManager r0 = com.bumptech.glide.Glide.with(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = com.flextv.livestore.apps.Constants.IMDB_IMAGE_PREF
            r1.append(r2)
            java.lang.String r5 = r5.getPoster_path()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            com.bumptech.glide.RequestBuilder r5 = r0.load(r5)
            android.widget.ImageView r0 = r4.movie_logo
            r5.into(r0)
            goto Lf0
        Ld8:
            android.content.Context r5 = r4.getApplicationContext()
            com.bumptech.glide.RequestManager r5 = com.bumptech.glide.Glide.with(r5)
            r0 = 2131230889(0x7f0800a9, float:1.8077844E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.bumptech.glide.RequestBuilder r5 = r5.load(r0)
            android.widget.ImageView r0 = r4.movie_logo
            r5.into(r0)
        Lf0:
            return
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent r4) {
            r3 = this;
            int r0 = r4.getAction()
            if (r0 != 0) goto L43
            int r0 = r4.getKeyCode()
            r1 = 19
            r2 = 1
            if (r0 == r1) goto L28
            r1 = 20
            if (r0 == r1) goto L14
            goto L43
        L14:
            android.widget.ImageButton r0 = r3.btn_back
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L43
            android.widget.ImageButton r4 = r3.btn_back
            r0 = 0
            r4.setFocusable(r0)
            android.widget.Button r4 = r3.btn_play
            r4.requestFocus()
            return r2
        L28:
            android.widget.Button r0 = r3.btn_play
            boolean r0 = r0.hasFocus()
            if (r0 != 0) goto L38
            android.widget.Button r0 = r3.btn_trailer
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L43
        L38:
            android.widget.ImageButton r4 = r3.btn_back
            r4.setFocusable(r2)
            android.widget.ImageButton r4 = r3.btn_back
            r4.requestFocus()
            return r2
        L43:
            boolean r4 = super.dispatchKeyEvent(r4)
            return r4
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r3) {
            r2 = this;
            int r3 = r3.getId()
            r0 = 2131427464(0x7f0b0088, float:1.8476545E38)
            if (r3 == r0) goto L33
            r0 = 2131427480(0x7f0b0098, float:1.8476577E38)
            if (r3 == r0) goto L18
            r0 = 2131427491(0x7f0b00a3, float:1.84766E38)
            if (r3 == r0) goto L14
            goto L36
        L14:
            r2.getTrailerVideoId()
            goto L36
        L18:
            com.flextv.livestore.models.MovieCreditModel r3 = r2.currentMovieModel
            if (r3 == 0) goto L36
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<com.flextv.livestore.activities.SearchActivity> r0 = com.flextv.livestore.activities.SearchActivity.class
            r3.<init>(r2, r0)
            com.flextv.livestore.models.MovieCreditModel r0 = r2.currentMovieModel
            java.lang.String r0 = r0.getTitle()
            java.lang.String r1 = "search_key"
            r3.putExtra(r1, r0)
            r2.startActivity(r3)
            goto L36
        L33:
            r2.finish()
        L36:
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle r3) {
            r2 = this;
            super.onCreate(r3)
            r3 = 2131623977(0x7f0e0029, float:1.887512E38)
            r2.setContentView(r3)
            com.flextv.livestore.utils.Utils.FullScreenCall(r2)
            com.flextv.livestore.models.WordModels r3 = com.flextv.livestore.helper.GetSharedInfo.getWordModel(r2)
            r2.wordModels = r3
            r2.initView()
            android.content.Intent r3 = r2.getIntent()
            java.lang.String r0 = "person_id"
            r1 = 0
            int r3 = r3.getIntExtra(r0, r1)
            r2.person_id = r3
            android.content.Intent r3 = r2.getIntent()
            java.lang.String r0 = "name"
            r3.getStringExtra(r0)
            int r3 = r2.person_id
            if (r3 <= 0) goto L32
            r2.getMovieCredit()
        L32:
            android.widget.ImageButton r3 = r2.btn_back
            r3.setFocusable(r1)
            android.widget.Button r3 = r2.btn_play
            r3.requestFocus()
            return
    }
}
