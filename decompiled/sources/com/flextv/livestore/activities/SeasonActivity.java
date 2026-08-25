package com.flextv.livestore.activities;

/* JADX INFO: loaded from: classes2.dex */
public class SeasonActivity extends androidx.appcompat.app.AppCompatActivity {
    public eightbitlab.com.blurview.BlurView blurView;
    public com.flextv.livestore.models.SeriesModel currentSeries;
    public com.flextv.livestore.adapter.EpisodeRecyclerAdapter episodeAdapter;
    public java.util.List<com.flextv.livestore.models.EpisodeModel> episodeModels;
    public com.flextv.livestore.view.LiveVerticalGridView episode_list;
    public int episode_pos;
    public android.widget.ImageView image_back;
    public android.widget.ImageView image_bg;
    public java.lang.String image_url;
    public int pre_season_pos;
    public com.flextv.livestore.helper.PreferenceHelper preferenceHelper;
    public com.flextv.livestore.adapter.SeasonRecyclerAdapter seasonAdapter;
    public java.util.List<com.flextv.livestore.models.Season> seasonModelList;
    public com.flextv.livestore.view.LiveVerticalGridView season_list;
    public java.lang.String season_name;
    public int season_pos;
    public java.lang.String series_id;
    public java.lang.String series_name;
    public android.widget.TextView txt_name;
    public java.lang.String vod_url;
    public com.flextv.livestore.models.WordModels wordModels;





    public static /* synthetic */ void $r8$lambda$8BTb_Ig74XJF7zL3QBIdwK_KY4g(com.flextv.livestore.activities.SeasonActivity r0, int r1, android.content.DialogInterface r2, int r3) {
            r0.lambda$showExternalPlayerDialog$6(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$IwpMj6DEeXMJ4j2-LpdVuHwqlVo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m66$r8$lambda$IwpMj6DEeXMJ4j2LpdVuHwqlVo(com.flextv.livestore.activities.SeasonActivity r0, com.flextv.livestore.models.Season r1, java.lang.Integer r2, java.lang.Boolean r3) {
            kotlin.Unit r0 = r0.lambda$onCreate$0(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$MxPtSlIzzLPkLyt9jAKW6C7eloQ(com.flextv.livestore.activities.SeasonActivity r0) {
            r0.lambda$onCreate$1()
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$SJt6mEFfieBR19in-DTFq3vk9P4, reason: not valid java name */
    public static /* synthetic */ void m67$r8$lambda$SJt6mEFfieBR19inDTFq3vk9P4(android.content.DialogInterface r0, int r1) {
            lambda$showExternalPlayerDialog$7(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$ZtLBSp9aDo9dzIsgYHnAblD8qA8(com.flextv.livestore.activities.SeasonActivity r0, com.android.volley.VolleyError r1) {
            r0.lambda$getSomeSeriesInfo$4(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$b5TR-nthxv5-50Sdl-hBaMlCt78, reason: not valid java name */
    public static /* synthetic */ void m68$r8$lambda$b5TRnthxv550SdlhBaMlCt78(com.flextv.livestore.activities.SeasonActivity r0, android.view.View r1) {
            r0.lambda$initView$5(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$h7mlFB8GDjOdqC-R1bdK44mK818, reason: not valid java name */
    public static /* synthetic */ void m69$r8$lambda$h7mlFB8GDjOdqCR1bdK44mK818(com.flextv.livestore.activities.SeasonActivity r0, java.lang.String r1) {
            r0.lambda$getSomeSeriesInfo$3(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$m-4S_wM65A-WgelooXt1Yrn_DXM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m70$r8$lambda$m4S_wM65AWgelooXt1Yrn_DXM(com.flextv.livestore.activities.SeasonActivity r0, com.flextv.livestore.models.EpisodeModel r1, java.lang.Integer r2, java.lang.Boolean r3) {
            kotlin.Unit r0 = r0.lambda$onCreate$2(r1, r2, r3)
            return r0
    }

    public SeasonActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.seasonModelList = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.episodeModels = r0
            java.lang.String r0 = ""
            r1.series_id = r0
            r1.vod_url = r0
            com.flextv.livestore.models.WordModels r0 = new com.flextv.livestore.models.WordModels
            r0.<init>()
            r1.wordModels = r0
            r0 = 0
            r1.season_pos = r0
            r1.episode_pos = r0
            r1.pre_season_pos = r0
            return
    }

    public static /* synthetic */ void access$000(com.flextv.livestore.activities.SeasonActivity r0, com.flextv.livestore.models.InfoSerie r1) {
            r0.getSeasonFromInfoSerie(r1)
            return
    }

    public static /* synthetic */ void access$100(com.flextv.livestore.activities.SeasonActivity r0) {
            r0.getSomeSeriesInfo()
            return
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

    private java.util.List<com.flextv.livestore.models.EpisodeModel> getEpisodesFromInfoSerie(com.flextv.livestore.models.InfoSerie r7, int r8) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.flextv.livestore.models.ListEpisode r7 = r7.getEpisodes()
            java.util.List r7 = r7.getEpisodesBySaison(r8)
            r8 = 0
        Le:
            int r1 = r7.size()
            if (r8 >= r1) goto L84
            java.lang.Object r1 = r7.get(r8)
            com.flextv.livestore.models.Episode r1 = (com.flextv.livestore.models.Episode) r1
            com.flextv.livestore.models.EpisodeModel r2 = new com.flextv.livestore.models.EpisodeModel
            r2.<init>()
            java.lang.String r3 = r1.getTitle()
            r2.setTitle(r3)
            int r3 = r1.getSeason()
            r2.setSeason(r3)
            java.lang.String r3 = r1.getEpisode_num()
            r2.setEpisode_num(r3)
            java.lang.String r3 = r1.getId()
            r2.setId(r3)
            java.lang.String r3 = r1.getContainer_extension()
            r2.setContainer_extension(r3)
            com.flextv.livestore.models.EpisodeInfoModel r3 = new com.flextv.livestore.models.EpisodeInfoModel
            r3.<init>()
            com.google.gson.GsonBuilder r4 = new com.google.gson.GsonBuilder
            r4.<init>()
            com.google.gson.Gson r4 = r4.create()
            java.lang.Object r5 = r1.getInfo()
            if (r5 == 0) goto L7b
            java.lang.Object r1 = r1.getInfo()     // Catch: java.lang.Exception -> L7b
            java.lang.String r1 = r4.toJson(r1)     // Catch: java.lang.Exception -> L7b
            java.lang.Class<com.flextv.livestore.models.Info> r5 = com.flextv.livestore.models.Info.class
            java.lang.Object r1 = r4.fromJson(r1, r5)     // Catch: java.lang.Exception -> L7b
            com.flextv.livestore.models.Info r1 = (com.flextv.livestore.models.Info) r1     // Catch: java.lang.Exception -> L7b
            java.lang.String r4 = r1.getTmdb_id()     // Catch: java.lang.Exception -> L7b
            r3.setTmdb_id(r4)     // Catch: java.lang.Exception -> L7b
            java.lang.String r4 = r1.getMovie_image()     // Catch: java.lang.Exception -> L7b
            r3.setMovie_image(r4)     // Catch: java.lang.Exception -> L7b
            java.lang.String r1 = r1.getPlot()     // Catch: java.lang.Exception -> L7b
            r3.setPlot(r1)     // Catch: java.lang.Exception -> L7b
        L7b:
            r2.setInfo(r3)
            r0.add(r2)
            int r8 = r8 + 1
            goto Le
        L84:
            return r0
    }

    private com.flextv.livestore.models.Season getSeasonByKey(java.util.List<com.flextv.livestore.models.Season> r3, java.lang.String r4) {
            r2 = this;
            java.util.Iterator r3 = r3.iterator()
        L4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r3.next()
            com.flextv.livestore.models.Season r0 = (com.flextv.livestore.models.Season) r0
            int r1 = r0.getSeason_number()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L4
            return r0
        L1f:
            com.flextv.livestore.models.Season r3 = new com.flextv.livestore.models.Season
            java.lang.String r0 = "Season  "
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r4)
            int r4 = java.lang.Integer.parseInt(r4)
            java.lang.String r1 = ""
            r3.<init>(r0, r4, r1)
            return r3
    }

    private void getSeasonFromInfoSerie(com.flextv.livestore.models.InfoSerie r6) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.seasonModelList = r0
            com.flextv.livestore.models.ListEpisode r0 = r6.getEpisodes()
            java.util.List r1 = r6.getSeasons()
            java.util.List r0 = r0.getListSerieDisp(r1)
            if (r0 == 0) goto Lae
            int r1 = r0.size()
            if (r1 <= 0) goto Lae
            r1 = 0
            r2 = 0
        L1d:
            int r3 = r0.size()
            if (r2 >= r3) goto L42
            java.lang.Object r3 = r0.get(r2)
            com.flextv.livestore.models.Season r3 = (com.flextv.livestore.models.Season) r3
            java.lang.Object r4 = r0.get(r2)
            com.flextv.livestore.models.Season r4 = (com.flextv.livestore.models.Season) r4
            int r4 = r4.getSeason_number()
            java.util.List r4 = r5.getEpisodesFromInfoSerie(r6, r4)
            r3.setEpisodeModels(r4)
            java.util.List<com.flextv.livestore.models.Season> r4 = r5.seasonModelList
            r4.add(r3)
            int r2 = r2 + 1
            goto L1d
        L42:
            com.flextv.livestore.adapter.SeasonRecyclerAdapter r6 = r5.seasonAdapter
            java.util.List<com.flextv.livestore.models.Season> r0 = r5.seasonModelList
            r6.setSeasonList(r0)
            com.flextv.livestore.models.SeriesModel r6 = r5.currentSeries
            int r6 = r6.getSeason_pos()
            r5.pre_season_pos = r6
            java.util.List<com.flextv.livestore.models.Season> r0 = r5.seasonModelList
            int r0 = r0.size()
            int r0 = r0 + (-1)
            if (r6 <= r0) goto L5d
            r5.pre_season_pos = r1
        L5d:
            java.util.List<com.flextv.livestore.models.Season> r6 = r5.seasonModelList
            int r0 = r5.pre_season_pos
            java.lang.Object r6 = r6.get(r0)
            com.flextv.livestore.models.Season r6 = (com.flextv.livestore.models.Season) r6
            java.util.List r6 = r6.getEpisodeModels()
            r5.episodeModels = r6
            com.flextv.livestore.adapter.EpisodeRecyclerAdapter r0 = r5.episodeAdapter
            java.util.List<com.flextv.livestore.models.Season> r2 = r5.seasonModelList
            int r3 = r5.pre_season_pos
            java.lang.Object r2 = r2.get(r3)
            com.flextv.livestore.models.Season r2 = (com.flextv.livestore.models.Season) r2
            java.lang.String r2 = r2.getName()
            r0.setEpisodeModels(r6, r2)
            com.flextv.livestore.models.SeriesModel r6 = r5.currentSeries
            int r6 = r6.getEpisode_pos()
            r5.episode_pos = r6
            java.util.List<com.flextv.livestore.models.EpisodeModel> r0 = r5.episodeModels
            int r0 = r0.size()
            int r0 = r0 + (-1)
            if (r6 <= r0) goto L94
            r5.episode_pos = r1
        L94:
            com.flextv.livestore.view.LiveVerticalGridView r6 = r5.episode_list
            int r0 = r5.episode_pos
            r6.scrollToPosition(r0)
            com.flextv.livestore.adapter.SeasonRecyclerAdapter r6 = r5.seasonAdapter
            int r0 = r5.pre_season_pos
            r6.setSelectedItem(r0)
            com.flextv.livestore.view.LiveVerticalGridView r6 = r5.season_list
            int r0 = r5.pre_season_pos
            r6.setSelectedPosition(r0)
            com.flextv.livestore.view.LiveVerticalGridView r6 = r5.season_list
            r6.requestFocus()
        Lae:
            return
    }

    private void getSeriesInfo() {
            r4 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = r4.preferenceHelper
            java.lang.String r0 = r0.getSharedPreferenceServerUrl()
            com.flextv.livestore.remote.APIService r0 = com.flextv.livestore.remote.RetroClass.getAPIService(r0)
            com.flextv.livestore.helper.PreferenceHelper r1 = r4.preferenceHelper
            java.lang.String r1 = r1.getSharedPreferenceUsername()
            com.flextv.livestore.helper.PreferenceHelper r2 = r4.preferenceHelper
            java.lang.String r2 = r2.getSharedPreferencePassword()
            java.lang.String r3 = r4.series_id
            retrofit2.Call r0 = r0.get_series_info(r1, r2, r3)
            com.flextv.livestore.activities.SeasonActivity$1 r1 = new com.flextv.livestore.activities.SeasonActivity$1
            r1.<init>(r4)
            r0.enqueue(r1)
            return
    }

    private void getSomeSeriesInfo() {
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
            java.lang.String r2 = r6.series_id
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.android.volley.toolbox.StringRequest r2 = new com.android.volley.toolbox.StringRequest
            com.flextv.livestore.activities.SeasonActivity$$ExternalSyntheticLambda0 r3 = new com.flextv.livestore.activities.SeasonActivity$$ExternalSyntheticLambda0
            r3.<init>(r6)
            com.flextv.livestore.activities.SeasonActivity$$ExternalSyntheticLambda0 r4 = new com.flextv.livestore.activities.SeasonActivity$$ExternalSyntheticLambda0
            r4.<init>(r6)
            r5 = 0
            r2.<init>(r5, r1, r3, r4)
            r0.add(r2)
            return
    }

    private void initView() {
            r6 = this;
            r0 = 2131427781(0x7f0b01c5, float:1.8477188E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r6.image_back = r0
            r0 = 2131427783(0x7f0b01c7, float:1.8477192E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r6.image_bg = r0
            r0 = 2131427442(0x7f0b0072, float:1.84765E38)
            android.view.View r0 = r6.findViewById(r0)
            eightbitlab.com.blurview.BlurView r0 = (eightbitlab.com.blurview.BlurView) r0
            r6.blurView = r0
            android.view.Window r0 = r6.getWindow()
            android.view.View r0 = r0.getDecorView()
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r0.findViewById(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            eightbitlab.com.blurview.BlurView r2 = r6.blurView
            eightbitlab.com.blurview.BlurViewFacade r1 = r2.setupWith(r1)
            eightbitlab.com.blurview.BlurViewFacade r0 = r1.setFrameClearDrawable(r0)
            eightbitlab.com.blurview.RenderScriptBlur r1 = new eightbitlab.com.blurview.RenderScriptBlur
            r1.<init>(r6)
            eightbitlab.com.blurview.BlurViewFacade r0 = r0.setBlurAlgorithm(r1)
            r1 = 1101004800(0x41a00000, float:20.0)
            eightbitlab.com.blurview.BlurViewFacade r0 = r0.setBlurRadius(r1)
            r1 = 1
            eightbitlab.com.blurview.BlurViewFacade r0 = r0.setBlurAutoUpdate(r1)
            android.content.res.Resources r2 = r6.getResources()
            r3 = 2131099684(0x7f060024, float:1.7811728E38)
            int r2 = r2.getColor(r3)
            eightbitlab.com.blurview.BlurViewFacade r0 = r0.setOverlayColor(r2)
            r0.setHasFixedTransformationMatrix(r1)
            r0 = 2131428133(0x7f0b0325, float:1.8477902E38)
            android.view.View r0 = r6.findViewById(r0)
            com.flextv.livestore.view.LiveVerticalGridView r0 = (com.flextv.livestore.view.LiveVerticalGridView) r0
            r6.season_list = r0
            r0 = 2131427621(0x7f0b0125, float:1.8476863E38)
            android.view.View r0 = r6.findViewById(r0)
            com.flextv.livestore.view.LiveVerticalGridView r0 = (com.flextv.livestore.view.LiveVerticalGridView) r0
            r6.episode_list = r0
            r0 = 2131428324(0x7f0b03e4, float:1.847829E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.txt_name = r0
            r0 = 2131428066(0x7f0b02e2, float:1.8477766E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            boolean r0 = com.flextv.livestore.helper.GetSharedInfo.isTVDevice(r6)
            r2 = 0
            if (r0 == 0) goto Lce
            com.flextv.livestore.view.LiveVerticalGridView r0 = r6.season_list
            r0.setNumColumns(r1)
            com.flextv.livestore.view.LiveVerticalGridView r0 = r6.season_list
            r0.setPreserveFocusAfterLayout(r1)
            android.view.View[] r0 = new android.view.View[r1]
            r3 = 0
            r0[r2] = r3
            com.flextv.livestore.view.LiveVerticalGridView r4 = r6.season_list
            com.flextv.livestore.activities.SeasonActivity$3 r5 = new com.flextv.livestore.activities.SeasonActivity$3
            r5.<init>(r0)
            r4.setOnChildViewHolderSelectedListener(r5)
            com.flextv.livestore.view.LiveVerticalGridView r0 = r6.episode_list
            r0.setLoop(r2)
            com.flextv.livestore.view.LiveVerticalGridView r0 = r6.episode_list
            r0.setNumColumns(r1)
            com.flextv.livestore.view.LiveVerticalGridView r0 = r6.episode_list
            r0.setPreserveFocusAfterLayout(r1)
            android.view.View[] r0 = new android.view.View[r1]
            r0[r2] = r3
            com.flextv.livestore.view.LiveVerticalGridView r1 = r6.episode_list
            com.flextv.livestore.activities.SeasonActivity$4 r3 = new com.flextv.livestore.activities.SeasonActivity$4
            r3.<init>(r0)
            r1.setOnChildViewHolderSelectedListener(r3)
            goto Lec
        Lce:
            com.flextv.livestore.view.LiveVerticalGridView r0 = r6.season_list
            androidx.recyclerview.widget.LinearLayoutManager r3 = new androidx.recyclerview.widget.LinearLayoutManager
            r3.<init>(r6)
            r0.setLayoutManager(r3)
            com.flextv.livestore.view.LiveVerticalGridView r0 = r6.season_list
            r0.setHasFixedSize(r1)
            com.flextv.livestore.view.LiveVerticalGridView r0 = r6.episode_list
            androidx.recyclerview.widget.LinearLayoutManager r3 = new androidx.recyclerview.widget.LinearLayoutManager
            r3.<init>(r6)
            r0.setLayoutManager(r3)
            com.flextv.livestore.view.LiveVerticalGridView r0 = r6.episode_list
            r0.setHasFixedSize(r1)
        Lec:
            android.widget.ImageView r0 = r6.image_back
            com.flextv.livestore.activities.SearchActivity$$ExternalSyntheticLambda0 r1 = new com.flextv.livestore.activities.SearchActivity$$ExternalSyntheticLambda0
            r3 = 4
            r1.<init>(r6, r3)
            r0.setOnClickListener(r1)
            android.widget.ImageView r0 = r6.image_back
            r0.setFocusable(r2)
            return
    }

    private /* synthetic */ void lambda$getSomeSeriesInfo$3(java.lang.String r17) {
            r16 = this;
            r1 = r16
            java.lang.String r2 = "info"
            java.lang.String r3 = "episode error"
            r4 = 1
            com.google.gson.Gson r6 = new com.google.gson.Gson     // Catch: java.lang.Exception -> L143
            r6.<init>()     // Catch: java.lang.Exception -> L143
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L143
            r7 = r17
            r0.<init>(r7)     // Catch: java.lang.Exception -> L143
            java.lang.String r7 = "seasons"
            org.json.JSONArray r7 = r0.getJSONArray(r7)     // Catch: java.lang.Exception -> L143
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Exception -> L143
            r8.<init>()     // Catch: java.lang.Exception -> L143
            r1.seasonModelList = r8     // Catch: java.lang.Exception -> L143
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Exception -> L143
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L143
            com.flextv.livestore.activities.SeasonActivity$2 r9 = new com.flextv.livestore.activities.SeasonActivity$2     // Catch: java.lang.Exception -> L143
            r9.<init>()     // Catch: java.lang.Exception -> L143
            java.lang.reflect.Type r9 = r9.getType()     // Catch: java.lang.Exception -> L143
            java.lang.Object r7 = r6.fromJson(r7, r9)     // Catch: java.lang.Exception -> L143
            java.util.Collection r7 = (java.util.Collection) r7     // Catch: java.lang.Exception -> L143
            r8.<init>(r7)     // Catch: java.lang.Exception -> L143
            java.lang.String r7 = "episodes"
            org.json.JSONArray r7 = r0.getJSONArray(r7)     // Catch: java.lang.Exception -> L143
            r0 = 0
        L40:
            int r9 = r7.length()     // Catch: java.lang.Exception -> L143
            if (r0 >= r9) goto Lce
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Exception -> L143
            r9.<init>(r8)     // Catch: java.lang.Exception -> L143
            int r10 = r0 + 1
            java.lang.String r11 = java.lang.String.valueOf(r10)     // Catch: java.lang.Exception -> L143
            com.flextv.livestore.models.Season r9 = r1.getSeasonByKey(r9, r11)     // Catch: java.lang.Exception -> L143
            org.json.JSONArray r0 = r7.getJSONArray(r0)     // Catch: org.json.JSONException -> Lc2 java.lang.Exception -> L143
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: org.json.JSONException -> Lc2 java.lang.Exception -> L143
            r11.<init>()     // Catch: org.json.JSONException -> Lc2 java.lang.Exception -> L143
            r12 = 0
        L5f:
            int r13 = r0.length()     // Catch: org.json.JSONException -> Lc2 java.lang.Exception -> L143
            if (r12 >= r13) goto Lbe
            org.json.JSONObject r13 = r0.getJSONObject(r12)     // Catch: org.json.JSONException -> Lb8 java.lang.Exception -> L143
            java.lang.String r14 = r13.toString()     // Catch: org.json.JSONException -> Lb8 java.lang.Exception -> L143
            java.lang.Class<com.flextv.livestore.models.EpisodeModel> r15 = com.flextv.livestore.models.EpisodeModel.class
            java.lang.Object r14 = r6.fromJson(r14, r15)     // Catch: org.json.JSONException -> Lb8 java.lang.Exception -> L143
            com.flextv.livestore.models.EpisodeModel r14 = (com.flextv.livestore.models.EpisodeModel) r14     // Catch: org.json.JSONException -> Lb8 java.lang.Exception -> L143
            boolean r15 = r13.has(r2)     // Catch: org.json.JSONException -> Lb8 java.lang.Exception -> L143
            if (r15 == 0) goto Lb4
            org.json.JSONObject r13 = r13.getJSONObject(r2)     // Catch: org.json.JSONException -> Lad java.lang.Exception -> L143
            java.lang.String r13 = r13.toString()     // Catch: org.json.JSONException -> Lad java.lang.Exception -> L143
            java.lang.String r13 = r6.toJson(r13)     // Catch: org.json.JSONException -> Lad java.lang.Exception -> L143
            java.lang.Class<com.flextv.livestore.models.Info> r15 = com.flextv.livestore.models.Info.class
            java.lang.Object r13 = r6.fromJson(r13, r15)     // Catch: org.json.JSONException -> Lad java.lang.Exception -> L143
            com.flextv.livestore.models.Info r13 = (com.flextv.livestore.models.Info) r13     // Catch: org.json.JSONException -> Lad java.lang.Exception -> L143
            com.flextv.livestore.models.EpisodeInfoModel r15 = new com.flextv.livestore.models.EpisodeInfoModel     // Catch: org.json.JSONException -> Lad java.lang.Exception -> L143
            r15.<init>()     // Catch: org.json.JSONException -> Lad java.lang.Exception -> L143
            java.lang.String r5 = r13.getMovie_image()     // Catch: org.json.JSONException -> Lad java.lang.Exception -> L143
            r15.setMovie_image(r5)     // Catch: org.json.JSONException -> Lad java.lang.Exception -> L143
            java.lang.String r5 = r13.getPlot()     // Catch: org.json.JSONException -> Lad java.lang.Exception -> L143
            r15.setPlot(r5)     // Catch: org.json.JSONException -> Lad java.lang.Exception -> L143
            java.lang.String r5 = r13.getTmdb_id()     // Catch: org.json.JSONException -> Lad java.lang.Exception -> L143
            r15.setTmdb_id(r5)     // Catch: org.json.JSONException -> Lad java.lang.Exception -> L143
            r14.setInfo(r15)     // Catch: org.json.JSONException -> Lad java.lang.Exception -> L143
            goto Lb4
        Lad:
            java.lang.String r5 = "info error"
            java.lang.String r13 = "info _error"
            android.util.Log.e(r5, r13)     // Catch: org.json.JSONException -> Lb8 java.lang.Exception -> L143
        Lb4:
            r11.add(r14)     // Catch: org.json.JSONException -> Lb8 java.lang.Exception -> L143
            goto Lbb
        Lb8:
            android.util.Log.e(r3, r3)     // Catch: org.json.JSONException -> Lc2 java.lang.Exception -> L143
        Lbb:
            int r12 = r12 + 1
            goto L5f
        Lbe:
            r9.setEpisodeModels(r11)     // Catch: org.json.JSONException -> Lc2 java.lang.Exception -> L143
            goto Lc6
        Lc2:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Exception -> L143
        Lc6:
            java.util.List<com.flextv.livestore.models.Season> r0 = r1.seasonModelList     // Catch: java.lang.Exception -> L143
            r0.add(r9)     // Catch: java.lang.Exception -> L143
            r0 = r10
            goto L40
        Lce:
            java.util.List<com.flextv.livestore.models.Season> r0 = r1.seasonModelList     // Catch: java.lang.Exception -> L143
            int r0 = r0.size()     // Catch: java.lang.Exception -> L143
            if (r0 <= 0) goto L15b
            com.flextv.livestore.adapter.SeasonRecyclerAdapter r0 = r1.seasonAdapter     // Catch: java.lang.Exception -> L143
            java.util.List<com.flextv.livestore.models.Season> r2 = r1.seasonModelList     // Catch: java.lang.Exception -> L143
            r0.setSeasonList(r2)     // Catch: java.lang.Exception -> L143
            com.flextv.livestore.models.SeriesModel r0 = r1.currentSeries     // Catch: java.lang.Exception -> L143
            int r0 = r0.getSeason_pos()     // Catch: java.lang.Exception -> L143
            r1.pre_season_pos = r0     // Catch: java.lang.Exception -> L143
            java.util.List<com.flextv.livestore.models.Season> r2 = r1.seasonModelList     // Catch: java.lang.Exception -> L143
            int r2 = r2.size()     // Catch: java.lang.Exception -> L143
            int r2 = r2 - r4
            if (r0 <= r2) goto Lf1
            r2 = 0
            r1.pre_season_pos = r2     // Catch: java.lang.Exception -> L143
        Lf1:
            java.util.List<com.flextv.livestore.models.Season> r0 = r1.seasonModelList     // Catch: java.lang.Exception -> L143
            int r2 = r1.pre_season_pos     // Catch: java.lang.Exception -> L143
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Exception -> L143
            com.flextv.livestore.models.Season r0 = (com.flextv.livestore.models.Season) r0     // Catch: java.lang.Exception -> L143
            java.util.List r0 = r0.getEpisodeModels()     // Catch: java.lang.Exception -> L143
            r1.episodeModels = r0     // Catch: java.lang.Exception -> L143
            com.flextv.livestore.adapter.EpisodeRecyclerAdapter r2 = r1.episodeAdapter     // Catch: java.lang.Exception -> L143
            java.util.List<com.flextv.livestore.models.Season> r3 = r1.seasonModelList     // Catch: java.lang.Exception -> L143
            int r5 = r1.pre_season_pos     // Catch: java.lang.Exception -> L143
            java.lang.Object r3 = r3.get(r5)     // Catch: java.lang.Exception -> L143
            com.flextv.livestore.models.Season r3 = (com.flextv.livestore.models.Season) r3     // Catch: java.lang.Exception -> L143
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Exception -> L143
            r2.setEpisodeModels(r0, r3)     // Catch: java.lang.Exception -> L143
            com.flextv.livestore.models.SeriesModel r0 = r1.currentSeries     // Catch: java.lang.Exception -> L143
            int r0 = r0.getEpisode_pos()     // Catch: java.lang.Exception -> L143
            r1.episode_pos = r0     // Catch: java.lang.Exception -> L143
            java.util.List<com.flextv.livestore.models.EpisodeModel> r2 = r1.episodeModels     // Catch: java.lang.Exception -> L143
            int r2 = r2.size()     // Catch: java.lang.Exception -> L143
            int r2 = r2 - r4
            if (r0 <= r2) goto L128
            r2 = 0
            r1.episode_pos = r2     // Catch: java.lang.Exception -> L143
        L128:
            com.flextv.livestore.view.LiveVerticalGridView r0 = r1.episode_list     // Catch: java.lang.Exception -> L143
            int r2 = r1.episode_pos     // Catch: java.lang.Exception -> L143
            r0.scrollToPosition(r2)     // Catch: java.lang.Exception -> L143
            com.flextv.livestore.adapter.SeasonRecyclerAdapter r0 = r1.seasonAdapter     // Catch: java.lang.Exception -> L143
            int r2 = r1.pre_season_pos     // Catch: java.lang.Exception -> L143
            r0.setSelectedItem(r2)     // Catch: java.lang.Exception -> L143
            com.flextv.livestore.view.LiveVerticalGridView r0 = r1.season_list     // Catch: java.lang.Exception -> L143
            int r2 = r1.pre_season_pos     // Catch: java.lang.Exception -> L143
            r0.setSelectedPosition(r2)     // Catch: java.lang.Exception -> L143
            com.flextv.livestore.view.LiveVerticalGridView r0 = r1.season_list     // Catch: java.lang.Exception -> L143
            r0.requestFocus()     // Catch: java.lang.Exception -> L143
            goto L15b
        L143:
            android.widget.ImageView r0 = r1.image_back
            r0.setFocusable(r4)
            android.widget.ImageView r0 = r1.image_back
            r0.requestFocus()
            com.flextv.livestore.models.WordModels r0 = r1.wordModels
            java.lang.String r0 = r0.getNo_episode()
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r2)
            r0.show()
        L15b:
            return
    }

    private /* synthetic */ void lambda$getSomeSeriesInfo$4(com.android.volley.VolleyError r2) {
            r1 = this;
            android.widget.ImageView r2 = r1.image_back
            r0 = 1
            r2.setFocusable(r0)
            android.widget.ImageView r2 = r1.image_back
            r2.requestFocus()
            com.flextv.livestore.models.WordModels r2 = r1.wordModels
            java.lang.String r2 = r2.getNo_episode()
            r0 = 0
            android.widget.Toast r2 = android.widget.Toast.makeText(r1, r2, r0)
            r2.show()
            return
    }

    private /* synthetic */ void lambda$initView$5(android.view.View r1) {
            r0 = this;
            r0.finish()
            return
    }

    private /* synthetic */ kotlin.Unit lambda$onCreate$0(com.flextv.livestore.models.Season r3, java.lang.Integer r4, java.lang.Boolean r5) {
            r2 = this;
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L31
            int r5 = r4.intValue()
            r2.pre_season_pos = r5
            java.lang.String r5 = r3.getName()
            r2.season_name = r5
            com.flextv.livestore.adapter.SeasonRecyclerAdapter r5 = r2.seasonAdapter
            int r0 = r2.pre_season_pos
            r1 = 0
            r5.setFocusDisable(r0, r1)
            java.util.List r3 = r3.getEpisodeModels()
            r2.episodeModels = r3
            com.flextv.livestore.adapter.EpisodeRecyclerAdapter r5 = r2.episodeAdapter
            java.lang.String r0 = r2.season_name
            r5.setEpisodeModels(r3, r0)
            com.flextv.livestore.view.LiveVerticalGridView r3 = r2.episode_list
            r3.setSelectedPosition(r1)
            com.flextv.livestore.view.LiveVerticalGridView r3 = r2.episode_list
            r3.scrollToPosition(r1)
        L31:
            int r3 = r4.intValue()
            r2.season_pos = r3
            r3 = 0
            return r3
    }

    private /* synthetic */ void lambda$onCreate$1() {
            r2 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = r2.preferenceHelper
            com.flextv.livestore.helper.RealmController r1 = com.flextv.livestore.helper.RealmController.with()
            java.util.List r1 = r1.getResentSeriesNames()
            r0.setSharedPreferenceRecentSeriesNames(r1)
            return
    }

    private /* synthetic */ kotlin.Unit lambda$onCreate$2(com.flextv.livestore.models.EpisodeModel r7, java.lang.Integer r8, java.lang.Boolean r9) {
            r6 = this;
            int r0 = r8.intValue()
            r6.episode_pos = r0
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Le4
            com.flextv.livestore.helper.RealmController r0 = com.flextv.livestore.helper.RealmController.with()
            java.lang.String r1 = r6.series_name
            r2 = 1
            int r3 = r6.pre_season_pos
            int r4 = r8.intValue()
            com.flextv.livestore.activities.SeasonActivity$$ExternalSyntheticLambda0 r5 = new com.flextv.livestore.activities.SeasonActivity$$ExternalSyntheticLambda0
            r5.<init>(r6)
            r0.addToRecentSeries(r1, r2, r3, r4, r5)
            com.flextv.livestore.helper.PreferenceHelper r9 = r6.preferenceHelper
            int r9 = r9.getSharedPreferenceExternalPlayer()
            com.flextv.livestore.helper.PreferenceHelper r0 = r6.preferenceHelper
            boolean r0 = r0.getSharedPreferenceISM3U()
            if (r0 == 0) goto L36
            java.lang.String r0 = r7.getUrl()
            r6.vod_url = r0
            goto L56
        L36:
            com.flextv.livestore.helper.PreferenceHelper r0 = r6.preferenceHelper
            java.lang.String r0 = r0.getSharedPreferenceServerUrl()
            com.flextv.livestore.helper.PreferenceHelper r1 = r6.preferenceHelper
            java.lang.String r1 = r1.getSharedPreferenceUsername()
            com.flextv.livestore.helper.PreferenceHelper r2 = r6.preferenceHelper
            java.lang.String r2 = r2.getSharedPreferencePassword()
            java.lang.String r3 = r7.getId()
            java.lang.String r4 = r7.getContainer_extension()
            java.lang.String r0 = com.flextv.livestore.helper.GetSharedInfo.getEpisodeUrl(r0, r1, r2, r3, r4)
            r6.vod_url = r0
        L56:
            if (r9 == 0) goto L88
            r8 = 1
            if (r9 == r8) goto L74
            r7 = 2
            if (r9 == r7) goto L60
            goto Le4
        L60:
            com.flextv.livestore.utils.Utils$MXPackageInfo r8 = com.flextv.livestore.utils.Utils.getMXPackageInfo(r6)
            if (r8 == 0) goto L70
            java.lang.String r7 = r8.packageName
            java.lang.String r8 = r8.activityName
            java.lang.String r9 = r6.vod_url
            r6.externalMXplayer(r7, r8, r9)
            goto Le4
        L70:
            r6.showExternalPlayerDialog(r7)
            goto Le4
        L74:
            com.flextv.livestore.utils.Utils$VLCPackageInfo r9 = com.flextv.livestore.utils.Utils.getVlcPackageInfo(r6)
            if (r9 == 0) goto L84
            java.lang.String r8 = r6.vod_url
            java.lang.String r7 = r7.getTitle()
            r6.externalvlcplayer(r8, r7)
            goto Le4
        L84:
            r6.showExternalPlayerDialog(r8)
            goto Le4
        L88:
            com.flextv.livestore.helper.PreferenceHelper r7 = r6.preferenceHelper
            boolean r7 = r7.getSharedPreferenceISM3U()
            if (r7 != 0) goto L97
            com.flextv.livestore.helper.PreferenceHelper r7 = r6.preferenceHelper
            java.util.List<com.flextv.livestore.models.EpisodeModel> r9 = r6.episodeModels
            r7.setSharedPreferenceEpisodeModels(r9)
        L97:
            boolean r7 = com.flextv.livestore.helper.GetSharedInfo.isTVDevice(r6)
            if (r7 == 0) goto La5
            android.content.Intent r7 = new android.content.Intent
            java.lang.Class<com.flextv.livestore.activities.SeriesPlayerActivity> r9 = com.flextv.livestore.activities.SeriesPlayerActivity.class
            r7.<init>(r6, r9)
            goto Lac
        La5:
            android.content.Intent r7 = new android.content.Intent
            java.lang.Class<com.flextv.livestore.activities.mobile.SeriesMobilePlayer> r9 = com.flextv.livestore.activities.mobile.SeriesMobilePlayer.class
            r7.<init>(r6, r9)
        Lac:
            int r9 = r6.pre_season_pos
            java.lang.String r0 = "season_pos"
            r7.putExtra(r0, r9)
            java.lang.String r9 = "position"
            r7.putExtra(r9, r8)
            java.lang.String r8 = r6.series_name
            java.lang.String r9 = "series_name"
            r7.putExtra(r9, r8)
            java.util.List<com.flextv.livestore.models.Season> r8 = r6.seasonModelList
            int r9 = r6.pre_season_pos
            java.lang.Object r8 = r8.get(r9)
            com.flextv.livestore.models.Season r8 = (com.flextv.livestore.models.Season) r8
            java.lang.String r8 = r8.getName()
            java.lang.String r9 = "season_name"
            r7.putExtra(r9, r8)
            com.flextv.livestore.models.SeriesModel r8 = r6.currentSeries
            java.lang.String r8 = r8.getTmdb()
            java.lang.String r9 = "tmdb_id"
            r7.putExtra(r9, r8)
            r6.startActivity(r7)
        Le4:
            r7 = 0
            return r7
    }

    private /* synthetic */ void lambda$showExternalPlayerDialog$6(int r1, android.content.DialogInterface r2, int r3) {
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

    private static /* synthetic */ void lambda$showExternalPlayerDialog$7(android.content.DialogInterface r0, int r1) {
            r0.cancel()
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
            r4 = 3
            r3.<init>(r5, r6, r4)
            androidx.appcompat.app.AlertDialog$Builder r6 = r1.setPositiveButton(r2, r3)
            com.flextv.livestore.models.WordModels r1 = r5.wordModels
            java.lang.String r1 = r1.getCancel()
            com.flextv.livestore.activities.MovieActivity$$ExternalSyntheticLambda1 r2 = com.flextv.livestore.activities.MovieActivity$$ExternalSyntheticLambda1.INSTANCE$3
            r6.setNegativeButton(r1, r2)
            androidx.appcompat.app.AlertDialog r6 = r0.create()
            r6.show()
            return
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent r4) {
            r3 = this;
            int r0 = r4.getAction()
            if (r0 != 0) goto L96
            int r0 = r4.getKeyCode()
            r1 = 0
            r2 = 1
            switch(r0) {
                case 19: goto L68;
                case 20: goto L55;
                case 21: goto L40;
                case 22: goto L11;
                default: goto Lf;
            }
        Lf:
            goto L96
        L11:
            com.flextv.livestore.view.LiveVerticalGridView r0 = r3.season_list
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L2d
            com.flextv.livestore.adapter.SeasonRecyclerAdapter r4 = r3.seasonAdapter
            int r0 = r3.pre_season_pos
            r4.setSelectedItem(r0)
            com.flextv.livestore.adapter.SeasonRecyclerAdapter r4 = r3.seasonAdapter
            int r0 = r3.pre_season_pos
            r4.setFocusDisable(r0, r2)
            com.flextv.livestore.view.LiveVerticalGridView r4 = r3.episode_list
            r4.requestFocus()
            return r2
        L2d:
            android.widget.ImageView r0 = r3.image_back
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L96
            android.widget.ImageView r4 = r3.image_back
            r4.setFocusable(r1)
            com.flextv.livestore.view.LiveVerticalGridView r4 = r3.episode_list
            r4.requestFocus()
            return r2
        L40:
            com.flextv.livestore.view.LiveVerticalGridView r0 = r3.episode_list
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L96
            com.flextv.livestore.adapter.SeasonRecyclerAdapter r4 = r3.seasonAdapter
            int r0 = r3.pre_season_pos
            r4.setSelectedItem(r0)
            com.flextv.livestore.view.LiveVerticalGridView r4 = r3.season_list
            r4.requestFocus()
            return r2
        L55:
            android.widget.ImageView r0 = r3.image_back
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L96
            android.widget.ImageView r4 = r3.image_back
            r4.setFocusable(r1)
            com.flextv.livestore.view.LiveVerticalGridView r4 = r3.season_list
            r4.requestFocus()
            return r2
        L68:
            com.flextv.livestore.view.LiveVerticalGridView r0 = r3.season_list
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L7f
            int r0 = r3.season_pos
            if (r0 != 0) goto L7f
            android.widget.ImageView r4 = r3.image_back
            r4.setFocusable(r2)
            android.widget.ImageView r4 = r3.image_back
            r4.requestFocus()
            return r2
        L7f:
            com.flextv.livestore.view.LiveVerticalGridView r0 = r3.episode_list
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L96
            int r0 = r3.episode_pos
            if (r0 != 0) goto L96
            android.widget.ImageView r4 = r3.image_back
            r4.setFocusable(r2)
            android.widget.ImageView r4 = r3.image_back
            r4.requestFocus()
            return r2
        L96:
            boolean r4 = super.dispatchKeyEvent(r4)
            return r4
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle r10) {
            r9 = this;
            super.onCreate(r10)
            r10 = 2131623983(0x7f0e002f, float:1.8875133E38)
            r9.setContentView(r10)
            com.flextv.livestore.utils.Utils.FullScreenCall(r9)
            com.flextv.livestore.helper.PreferenceHelper r10 = new com.flextv.livestore.helper.PreferenceHelper
            r10.<init>(r9)
            r9.preferenceHelper = r10
            com.flextv.livestore.models.WordModels r10 = com.flextv.livestore.helper.GetSharedInfo.getWordModel(r9)
            r9.wordModels = r10
            r9.initView()
            android.content.Intent r10 = r9.getIntent()
            java.lang.String r0 = "image_url"
            java.lang.String r10 = r10.getStringExtra(r0)
            r9.image_url = r10
            android.content.Intent r10 = r9.getIntent()
            java.lang.String r0 = "series_name"
            java.lang.String r10 = r10.getStringExtra(r0)
            r9.series_name = r10
            android.content.Intent r10 = r9.getIntent()
            java.lang.String r0 = "series_id"
            java.lang.String r10 = r10.getStringExtra(r0)
            r9.series_id = r10
            com.flextv.livestore.helper.PreferenceHelper r10 = r9.preferenceHelper
            boolean r10 = r10.getSharedPreferenceISM3U()
            if (r10 == 0) goto L57
            com.flextv.livestore.helper.RealmController r10 = com.flextv.livestore.helper.RealmController.with()
            java.lang.String r0 = r9.series_name
            com.flextv.livestore.models.SeriesModel r10 = r10.getSeriesByName(r0)
            r9.currentSeries = r10
            goto L78
        L57:
            java.lang.String r10 = r9.series_id
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L6c
            com.flextv.livestore.helper.RealmController r10 = com.flextv.livestore.helper.RealmController.with()
            java.lang.String r0 = r9.series_name
            com.flextv.livestore.models.SeriesModel r10 = r10.getSeriesByName(r0)
            r9.currentSeries = r10
            goto L78
        L6c:
            com.flextv.livestore.helper.RealmController r10 = com.flextv.livestore.helper.RealmController.with()
            java.lang.String r0 = r9.series_id
            com.flextv.livestore.models.SeriesModel r10 = r10.getSeriesById(r0)
            r9.currentSeries = r10
        L78:
            com.flextv.livestore.models.SeriesModel r10 = r9.currentSeries
            java.lang.String r10 = r10.getSeries_id()
            r9.series_id = r10
            android.widget.TextView r10 = r9.txt_name
            java.lang.String r0 = r9.series_name
            r10.setText(r0)
            com.flextv.livestore.adapter.SeasonRecyclerAdapter r10 = new com.flextv.livestore.adapter.SeasonRecyclerAdapter
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.flextv.livestore.activities.SeasonActivity$$ExternalSyntheticLambda1 r1 = new com.flextv.livestore.activities.SeasonActivity$$ExternalSyntheticLambda1
            r2 = 0
            r1.<init>(r9, r2)
            r10.<init>(r9, r0, r1)
            r9.seasonAdapter = r10
            com.flextv.livestore.view.LiveVerticalGridView r0 = r9.season_list
            r0.setAdapter(r10)
            com.flextv.livestore.adapter.EpisodeRecyclerAdapter r10 = new com.flextv.livestore.adapter.EpisodeRecyclerAdapter
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.String r6 = r9.series_name
            java.lang.String r7 = r9.season_name
            com.flextv.livestore.activities.SeasonActivity$$ExternalSyntheticLambda1 r8 = new com.flextv.livestore.activities.SeasonActivity$$ExternalSyntheticLambda1
            r0 = 1
            r8.<init>(r9, r0)
            r3 = r10
            r4 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            r9.episodeAdapter = r10
            com.flextv.livestore.view.LiveVerticalGridView r1 = r9.episode_list
            r1.setAdapter(r10)
            com.flextv.livestore.helper.PreferenceHelper r10 = r9.preferenceHelper
            boolean r10 = r10.getSharedPreferenceISM3U()
            if (r10 == 0) goto L142
            com.flextv.livestore.helper.RealmController r10 = com.flextv.livestore.helper.RealmController.with()
            java.lang.String r1 = r9.series_name
            java.util.List r10 = r10.getSeasonBySeriesName(r1)
            r9.seasonModelList = r10
            if (r10 == 0) goto L145
            int r10 = r10.size()
            if (r10 <= 0) goto L145
            com.flextv.livestore.models.SeriesModel r10 = r9.currentSeries
            int r10 = r10.getSeason_pos()
            r9.pre_season_pos = r10
            java.util.List<com.flextv.livestore.models.Season> r1 = r9.seasonModelList
            int r1 = r1.size()
            int r1 = r1 - r0
            if (r10 <= r1) goto Lea
            r9.pre_season_pos = r2
        Lea:
            com.flextv.livestore.adapter.SeasonRecyclerAdapter r10 = r9.seasonAdapter
            java.util.List<com.flextv.livestore.models.Season> r1 = r9.seasonModelList
            r10.setSeasonList(r1)
            java.util.List<com.flextv.livestore.models.Season> r10 = r9.seasonModelList
            int r1 = r9.pre_season_pos
            java.lang.Object r10 = r10.get(r1)
            com.flextv.livestore.models.Season r10 = (com.flextv.livestore.models.Season) r10
            java.util.List r10 = r10.getEpisodeModels()
            r9.episodeModels = r10
            com.flextv.livestore.adapter.EpisodeRecyclerAdapter r1 = r9.episodeAdapter
            java.util.List<com.flextv.livestore.models.Season> r3 = r9.seasonModelList
            int r4 = r9.pre_season_pos
            java.lang.Object r3 = r3.get(r4)
            com.flextv.livestore.models.Season r3 = (com.flextv.livestore.models.Season) r3
            java.lang.String r3 = r3.getName()
            r1.setEpisodeModels(r10, r3)
            com.flextv.livestore.models.SeriesModel r10 = r9.currentSeries
            int r10 = r10.getEpisode_pos()
            r9.episode_pos = r10
            java.util.List<com.flextv.livestore.models.EpisodeModel> r1 = r9.episodeModels
            int r1 = r1.size()
            int r1 = r1 - r0
            if (r10 <= r1) goto L127
            r9.episode_pos = r2
        L127:
            com.flextv.livestore.view.LiveVerticalGridView r10 = r9.episode_list
            int r0 = r9.episode_pos
            r10.scrollToPosition(r0)
            com.flextv.livestore.adapter.SeasonRecyclerAdapter r10 = r9.seasonAdapter
            int r0 = r9.pre_season_pos
            r10.setSelectedItem(r0)
            com.flextv.livestore.view.LiveVerticalGridView r10 = r9.season_list
            int r0 = r9.pre_season_pos
            r10.setSelectedPosition(r0)
            com.flextv.livestore.view.LiveVerticalGridView r10 = r9.season_list
            r10.requestFocus()
            goto L145
        L142:
            r9.getSeriesInfo()
        L145:
            java.lang.String r10 = r9.image_url
            if (r10 == 0) goto L15e
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L15e
            com.bumptech.glide.RequestManager r10 = com.bumptech.glide.Glide.with(r9)
            java.lang.String r0 = r9.image_url
            com.bumptech.glide.RequestBuilder r10 = r10.load(r0)
            android.widget.ImageView r0 = r9.image_bg
            r10.into(r0)
        L15e:
            return
    }
}
