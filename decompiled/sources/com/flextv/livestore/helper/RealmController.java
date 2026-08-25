package com.flextv.livestore.helper;

/* JADX INFO: loaded from: classes.dex */
public class RealmController {
    private static java.util.HashMap<java.lang.String, java.util.List<com.flextv.livestore.models.EpisodeModel>> episodeModelHashMap;
    public static com.flextv.livestore.helper.RealmController instance;
    public io.realm.Realm realm;

    public static /* synthetic */ void $r8$lambda$A09waiktlXubTOdz7EE7TgVfSbk(java.lang.String r0, boolean r1, io.realm.Realm r2) {
            lambda$addToFavMovie$3(r0, r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$D8OUgsEKrAeWBYInTc3JlY7NJ78(java.lang.String r0, boolean r1, io.realm.Realm r2) {
            lambda$addToFavChannels$0(r0, r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$VakvmmiHjMOAdV6CKQP4XX3qtmM(java.lang.String r0, boolean r1, io.realm.Realm r2) {
            lambda$addToRecentChannels$2(r0, r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$Y6vYme_cbBpUbBme5GX6grOGBP0(java.lang.String r0, boolean r1, long r2, int r4, java.lang.String r5, io.realm.Realm r6) {
            lambda$addPositionToMovies$4(r0, r1, r2, r4, r5, r6)
            return
    }

    public static /* synthetic */ void $r8$lambda$j8hrajF0dKN2UMeA4jqMZOMhuh4(java.lang.String r0, boolean r1, io.realm.Realm r2) {
            lambda$addToFavSeries$5(r0, r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$nDP1dTYfjN6HcThqC_czloMeu4E(java.lang.String r0, boolean r1, int r2, int r3, io.realm.Realm r4) {
            lambda$addToRecentSeries$6(r0, r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ void $r8$lambda$swkimK8M8tpG9vgO_jI0k94JPrA(java.lang.String r0, boolean r1, io.realm.Realm r2) {
            lambda$addToLockChannels$1(r0, r1, r2)
            return
    }

    public RealmController() {
            r3 = this;
            r3.<init>()
            io.realm.RealmConfiguration$Builder r0 = new io.realm.RealmConfiguration$Builder
            r0.<init>()
            java.lang.String r1 = "MTV.realm"
            io.realm.RealmConfiguration$Builder r0 = r0.name(r1)
            r1 = 1
            io.realm.RealmConfiguration$Builder r0 = r0.schemaVersion(r1)
            io.realm.RealmConfiguration$Builder r0 = r0.deleteRealmIfMigrationNeeded()
            r1 = 1
            io.realm.RealmConfiguration$Builder r0 = r0.allowWritesOnUiThread(r1)
            io.realm.RealmConfiguration r0 = r0.build()
            io.realm.Realm r0 = io.realm.Realm.getInstance(r0)
            r3.realm = r0
            return
    }

    private static void addEpisodeToSeason(com.flextv.livestore.models.EpisodeModel r2) {
            java.lang.String r0 = r2.getSeason_name()
            java.util.HashMap<java.lang.String, java.util.List<com.flextv.livestore.models.EpisodeModel>> r1 = com.flextv.livestore.helper.RealmController.episodeModelHashMap
            java.lang.Object r1 = r1.get(r0)
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L13
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L13:
            r1.add(r2)
            java.util.HashMap<java.lang.String, java.util.List<com.flextv.livestore.models.EpisodeModel>> r2 = com.flextv.livestore.helper.RealmController.episodeModelHashMap
            r2.put(r0, r1)
            return
    }

    private static java.util.List<com.flextv.livestore.models.Season> getSeasonFromEpisodes(java.util.List<com.flextv.livestore.models.EpisodeModel> r4) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.flextv.livestore.helper.RealmController.episodeModelHashMap = r0
            java.util.Iterator r4 = r4.iterator()
        Lb:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L1b
            java.lang.Object r0 = r4.next()
            com.flextv.livestore.models.EpisodeModel r0 = (com.flextv.livestore.models.EpisodeModel) r0
            addEpisodeToSeason(r0)
            goto Lb
        L1b:
            java.util.TreeSet r4 = new java.util.TreeSet
            java.util.HashMap<java.lang.String, java.util.List<com.flextv.livestore.models.EpisodeModel>> r0 = com.flextv.livestore.helper.RealmController.episodeModelHashMap
            java.util.Set r0 = r0.keySet()
            r4.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L2f:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L68
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.HashMap<java.lang.String, java.util.List<com.flextv.livestore.models.EpisodeModel>> r2 = com.flextv.livestore.helper.RealmController.episodeModelHashMap
            java.lang.Object r2 = r2.get(r1)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L2f
            int r3 = r2.size()
            if (r3 <= 0) goto L2f
            com.flextv.livestore.models.Season r3 = new com.flextv.livestore.models.Season
            r3.<init>()
            r3.setName(r1)
            r1 = 0
            java.lang.Object r1 = r2.get(r1)
            com.flextv.livestore.models.EpisodeModel r1 = (com.flextv.livestore.models.EpisodeModel) r1
            java.lang.String r1 = r1.getCategory_name()
            r3.setCategory_name(r1)
            r3.setEpisodeModels(r2)
            r0.add(r3)
            goto L2f
        L68:
            return r0
    }

    private static /* synthetic */ void lambda$addPositionToMovies$4(java.lang.String r2, boolean r3, long r4, int r6, java.lang.String r7, io.realm.Realm r8) {
            java.lang.Class<com.flextv.livestore.models.MovieModel> r0 = com.flextv.livestore.models.MovieModel.class
            java.lang.String r1 = "name"
            java.lang.Object r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r8, r0, r1, r2)
            com.flextv.livestore.models.MovieModel r2 = (com.flextv.livestore.models.MovieModel) r2
            if (r2 == 0) goto L18
            r2.setIs_recent(r3)
            r2.setTime(r4)
            r2.setPro(r6)
            r2.setTmdb_id(r7)
        L18:
            return
    }

    private static /* synthetic */ void lambda$addToFavChannels$0(java.lang.String r2, boolean r3, io.realm.Realm r4) {
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r0 = com.flextv.livestore.models.EPGChannel.class
            java.lang.String r1 = "name"
            java.lang.Object r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4, r0, r1, r2)
            com.flextv.livestore.models.EPGChannel r2 = (com.flextv.livestore.models.EPGChannel) r2
            if (r2 == 0) goto Lf
            r2.setIs_favorite(r3)
        Lf:
            return
    }

    private static /* synthetic */ void lambda$addToFavMovie$3(java.lang.String r2, boolean r3, io.realm.Realm r4) {
            java.lang.Class<com.flextv.livestore.models.MovieModel> r0 = com.flextv.livestore.models.MovieModel.class
            java.lang.String r1 = "name"
            java.lang.Object r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4, r0, r1, r2)
            com.flextv.livestore.models.MovieModel r2 = (com.flextv.livestore.models.MovieModel) r2
            if (r2 == 0) goto Lf
            r2.setIs_favorite(r3)
        Lf:
            return
    }

    private static /* synthetic */ void lambda$addToFavSeries$5(java.lang.String r2, boolean r3, io.realm.Realm r4) {
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r0 = com.flextv.livestore.models.SeriesModel.class
            java.lang.String r1 = "name"
            java.lang.Object r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4, r0, r1, r2)
            com.flextv.livestore.models.SeriesModel r2 = (com.flextv.livestore.models.SeriesModel) r2
            if (r2 == 0) goto Lf
            r2.setIs_favorite(r3)
        Lf:
            return
    }

    private static /* synthetic */ void lambda$addToLockChannels$1(java.lang.String r2, boolean r3, io.realm.Realm r4) {
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r0 = com.flextv.livestore.models.EPGChannel.class
            java.lang.String r1 = "name"
            java.lang.Object r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4, r0, r1, r2)
            com.flextv.livestore.models.EPGChannel r2 = (com.flextv.livestore.models.EPGChannel) r2
            if (r2 == 0) goto Lf
            r2.setIs_locked(r3)
        Lf:
            return
    }

    private static /* synthetic */ void lambda$addToRecentChannels$2(java.lang.String r2, boolean r3, io.realm.Realm r4) {
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r0 = com.flextv.livestore.models.EPGChannel.class
            java.lang.String r1 = "name"
            java.lang.Object r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4, r0, r1, r2)
            com.flextv.livestore.models.EPGChannel r2 = (com.flextv.livestore.models.EPGChannel) r2
            if (r2 == 0) goto L19
            r2.setIs_recent(r3)
            long r3 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r0
            r2.setRecent_pos(r3)
        L19:
            return
    }

    private static /* synthetic */ void lambda$addToRecentSeries$6(java.lang.String r2, boolean r3, int r4, int r5, io.realm.Realm r6) {
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r0 = com.flextv.livestore.models.SeriesModel.class
            java.lang.String r1 = "name"
            java.lang.Object r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6, r0, r1, r2)
            com.flextv.livestore.models.SeriesModel r2 = (com.flextv.livestore.models.SeriesModel) r2
            if (r2 == 0) goto L15
            r2.setIs_recent(r3)
            r2.setSeason_pos(r4)
            r2.setEpisode_pos(r5)
        L15:
            return
    }

    public static com.flextv.livestore.helper.RealmController with() {
            com.flextv.livestore.helper.RealmController r0 = com.flextv.livestore.helper.RealmController.instance
            if (r0 != 0) goto L12
            com.flextv.livestore.apps.LTVApp r0 = com.flextv.livestore.apps.LTVApp.getInstance()
            io.realm.Realm.init(r0)
            com.flextv.livestore.helper.RealmController r0 = new com.flextv.livestore.helper.RealmController
            r0.<init>()
            com.flextv.livestore.helper.RealmController.instance = r0
        L12:
            com.flextv.livestore.helper.RealmController r0 = com.flextv.livestore.helper.RealmController.instance
            return r0
    }

    public void addPositionToMovies(java.lang.String r11, java.lang.String r12, boolean r13, long r14, int r16, com.flextv.livestore.helper.RealmChangeItemListener r17) {
            r10 = this;
            r0 = r10
            io.realm.Realm r1 = r0.realm
            com.flextv.livestore.helper.RealmController$$ExternalSyntheticLambda3 r9 = new com.flextv.livestore.helper.RealmController$$ExternalSyntheticLambda3
            r2 = r9
            r3 = r11
            r4 = r13
            r5 = r14
            r7 = r16
            r8 = r12
            r2.<init>(r3, r4, r5, r7, r8)
            java.util.Objects.requireNonNull(r17)
            com.flextv.livestore.helper.RealmController$$ExternalSyntheticLambda0 r2 = new com.flextv.livestore.helper.RealmController$$ExternalSyntheticLambda0
            r3 = 1
            r4 = r17
            r2.<init>(r4, r3)
            r1.executeTransactionAsync(r9, r2)
            return
    }

    public void addToFavChannels(java.lang.String r4, boolean r5, com.flextv.livestore.helper.RealmChangeItemListener r6) {
            r3 = this;
            io.realm.Realm r0 = r3.realm
            com.flextv.livestore.helper.RealmController$$ExternalSyntheticLambda1 r1 = new com.flextv.livestore.helper.RealmController$$ExternalSyntheticLambda1
            r2 = 0
            r1.<init>(r4, r5, r2)
            java.util.Objects.requireNonNull(r6)
            com.flextv.livestore.helper.RealmController$$ExternalSyntheticLambda0 r4 = new com.flextv.livestore.helper.RealmController$$ExternalSyntheticLambda0
            r4.<init>(r6, r2)
            r0.executeTransactionAsync(r1, r4)
            return
    }

    public void addToFavMovie(java.lang.String r4, boolean r5, com.flextv.livestore.helper.RealmChangeItemListener r6) {
            r3 = this;
            io.realm.Realm r0 = r3.realm
            com.flextv.livestore.helper.RealmController$$ExternalSyntheticLambda1 r1 = new com.flextv.livestore.helper.RealmController$$ExternalSyntheticLambda1
            r2 = 1
            r1.<init>(r4, r5, r2)
            java.util.Objects.requireNonNull(r6)
            com.flextv.livestore.helper.RealmController$$ExternalSyntheticLambda0 r4 = new com.flextv.livestore.helper.RealmController$$ExternalSyntheticLambda0
            r5 = 3
            r4.<init>(r6, r5)
            r0.executeTransactionAsync(r1, r4)
            return
    }

    public void addToFavSeries(java.lang.String r4, boolean r5, com.flextv.livestore.helper.RealmChangeItemListener r6) {
            r3 = this;
            io.realm.Realm r0 = r3.realm
            com.flextv.livestore.helper.RealmController$$ExternalSyntheticLambda1 r1 = new com.flextv.livestore.helper.RealmController$$ExternalSyntheticLambda1
            r2 = 3
            r1.<init>(r4, r5, r2)
            java.util.Objects.requireNonNull(r6)
            com.flextv.livestore.helper.RealmController$$ExternalSyntheticLambda0 r4 = new com.flextv.livestore.helper.RealmController$$ExternalSyntheticLambda0
            r5 = 5
            r4.<init>(r6, r5)
            r0.executeTransactionAsync(r1, r4)
            return
    }

    public void addToLockChannels(java.lang.String r4, boolean r5, com.flextv.livestore.helper.RealmChangeItemListener r6) {
            r3 = this;
            io.realm.Realm r0 = r3.realm
            com.flextv.livestore.helper.RealmController$$ExternalSyntheticLambda1 r1 = new com.flextv.livestore.helper.RealmController$$ExternalSyntheticLambda1
            r2 = 2
            r1.<init>(r4, r5, r2)
            java.util.Objects.requireNonNull(r6)
            com.flextv.livestore.helper.RealmController$$ExternalSyntheticLambda0 r4 = new com.flextv.livestore.helper.RealmController$$ExternalSyntheticLambda0
            r5 = 4
            r4.<init>(r6, r5)
            r0.executeTransactionAsync(r1, r4)
            return
    }

    public void addToRecentChannels(java.lang.String r4, boolean r5, com.flextv.livestore.helper.RealmChangeItemListener r6) {
            r3 = this;
            io.realm.Realm r0 = r3.realm
            com.flextv.livestore.helper.RealmController$$ExternalSyntheticLambda1 r1 = new com.flextv.livestore.helper.RealmController$$ExternalSyntheticLambda1
            r2 = 4
            r1.<init>(r4, r5, r2)
            java.util.Objects.requireNonNull(r6)
            com.flextv.livestore.helper.RealmController$$ExternalSyntheticLambda0 r4 = new com.flextv.livestore.helper.RealmController$$ExternalSyntheticLambda0
            r5 = 6
            r4.<init>(r6, r5)
            r0.executeTransactionAsync(r1, r4)
            return
    }

    public void addToRecentSeries(java.lang.String r3, boolean r4, int r5, int r6, com.flextv.livestore.helper.RealmChangeItemListener r7) {
            r2 = this;
            io.realm.Realm r0 = r2.realm
            com.flextv.livestore.helper.RealmController$$ExternalSyntheticLambda2 r1 = new com.flextv.livestore.helper.RealmController$$ExternalSyntheticLambda2
            r1.<init>(r3, r4, r5, r6)
            java.util.Objects.requireNonNull(r7)
            com.flextv.livestore.helper.RealmController$$ExternalSyntheticLambda0 r3 = new com.flextv.livestore.helper.RealmController$$ExternalSyntheticLambda0
            r4 = 2
            r3.<init>(r7, r4)
            r0.executeTransactionAsync(r1, r3)
            return
    }

    public int getAllEpgChannelSize() {
            r2 = this;
            io.realm.Realm r0 = r2.realm
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r1 = com.flextv.livestore.models.EPGChannel.class
            io.realm.RealmQuery r0 = r0.where(r1)
            io.realm.RealmResults r0 = r0.findAll()
            int r0 = r0.size()
            return r0
    }

    public com.flextv.livestore.models.EPGChannel getChannelByNumber(int r3) {
            r2 = this;
            io.realm.Realm r0 = r2.realm
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r1 = com.flextv.livestore.models.EPGChannel.class
            io.realm.RealmQuery r0 = r0.where(r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r1 = "num"
            io.realm.RealmQuery r3 = r0.equalTo(r1, r3)
            java.lang.Object r3 = r3.findFirst()
            com.flextv.livestore.models.EPGChannel r3 = (com.flextv.livestore.models.EPGChannel) r3
            return r3
    }

    public com.flextv.livestore.models.MovieModel getContainMoviesByTitle(java.lang.String r3) {
            r2 = this;
            io.realm.Realm r0 = r2.realm
            java.lang.Class<com.flextv.livestore.models.MovieModel> r1 = com.flextv.livestore.models.MovieModel.class
            io.realm.RealmQuery r0 = r0.where(r1)
            java.lang.String r1 = "name"
            io.realm.RealmQuery r3 = r0.contains(r1, r3)
            java.lang.Object r3 = r3.findFirst()
            com.flextv.livestore.models.MovieModel r3 = (com.flextv.livestore.models.MovieModel) r3
            return r3
    }

    public com.flextv.livestore.models.EPGChannel getEpgChannelByName(java.lang.String r4) {
            r3 = this;
            io.realm.Realm r0 = r3.realm
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r1 = com.flextv.livestore.models.EPGChannel.class
            java.lang.String r2 = "name"
            java.lang.Object r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r4)
            com.flextv.livestore.models.EPGChannel r4 = (com.flextv.livestore.models.EPGChannel) r4
            return r4
    }

    public io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> getEpgChannelsByNameArray(java.util.List<java.lang.String> r3, java.lang.String r4) {
            r2 = this;
            int r0 = r3.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r3 = r3.toArray(r0)
            java.lang.String[] r3 = (java.lang.String[]) r3
            io.realm.Realm r0 = r2.realm
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r1 = com.flextv.livestore.models.EPGChannel.class
            io.realm.RealmQuery r0 = r0.where(r1)
            java.lang.String r1 = "name"
            io.realm.RealmQuery r3 = r0.in(r1, r3)
            java.lang.String r4 = r4.toLowerCase()
            io.realm.Case r0 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r3 = r3.contains(r1, r4, r0)
            io.realm.RealmResults r3 = r3.findAll()
            return r3
    }

    public java.util.List<com.flextv.livestore.models.EpisodeModel> getEpisodesBySeason(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            io.realm.Realm r0 = r2.realm
            java.lang.Class<com.flextv.livestore.models.EpisodeModel> r1 = com.flextv.livestore.models.EpisodeModel.class
            io.realm.RealmQuery r0 = r0.where(r1)
            java.lang.String r1 = "series_name"
            io.realm.RealmQuery r3 = r0.equalTo(r1, r3)
            java.lang.String r0 = "season_name"
            io.realm.RealmQuery r3 = r3.equalTo(r0, r4)
            io.realm.RealmResults r3 = r3.findAll()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
            return r4
    }

    public java.util.List<java.lang.String> getFavChannelNames() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            io.realm.Realm r1 = r4.realm
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r2 = com.flextv.livestore.models.EPGChannel.class
            io.realm.RealmQuery r1 = r1.where(r2)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.String r3 = "is_favorite"
            io.realm.RealmQuery r1 = r1.equalTo(r3, r2)
            io.realm.RealmResults r1 = r1.findAll()
            java.util.Iterator r1 = r1.iterator()
        L1d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L31
            java.lang.Object r2 = r1.next()
            com.flextv.livestore.models.EPGChannel r2 = (com.flextv.livestore.models.EPGChannel) r2
            java.lang.String r2 = r2.getName()
            r0.add(r2)
            goto L1d
        L31:
            return r0
    }

    public java.util.List<java.lang.String> getFavMovieNames() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            io.realm.Realm r1 = r4.realm
            java.lang.Class<com.flextv.livestore.models.MovieModel> r2 = com.flextv.livestore.models.MovieModel.class
            io.realm.RealmQuery r1 = r1.where(r2)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.String r3 = "is_favorite"
            io.realm.RealmQuery r1 = r1.equalTo(r3, r2)
            io.realm.RealmResults r1 = r1.findAll()
            java.util.Iterator r1 = r1.iterator()
        L1d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L31
            java.lang.Object r2 = r1.next()
            com.flextv.livestore.models.MovieModel r2 = (com.flextv.livestore.models.MovieModel) r2
            java.lang.String r2 = r2.getName()
            r0.add(r2)
            goto L1d
        L31:
            return r0
    }

    public java.util.List<java.lang.String> getFavSeriesNames() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            io.realm.Realm r1 = r4.realm
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r2 = com.flextv.livestore.models.SeriesModel.class
            io.realm.RealmQuery r1 = r1.where(r2)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.String r3 = "is_favorite"
            io.realm.RealmQuery r1 = r1.equalTo(r3, r2)
            io.realm.RealmResults r1 = r1.findAll()
            java.util.Iterator r1 = r1.iterator()
        L1d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L31
            java.lang.Object r2 = r1.next()
            com.flextv.livestore.models.SeriesModel r2 = (com.flextv.livestore.models.SeriesModel) r2
            java.lang.String r2 = r2.getName()
            r0.add(r2)
            goto L1d
        L31:
            return r0
    }

    public io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> getLiveChannelsByCategory(com.flextv.livestore.models.CategoryModel r7, java.lang.String r8, boolean r9, int r10) {
            r6 = this;
            if (r9 == 0) goto L5
            java.lang.String r0 = "category_name"
            goto L7
        L5:
            java.lang.String r0 = "category_id"
        L7:
            r1 = 1
            if (r9 == 0) goto L26
            java.lang.String r9 = r7.getName()
            java.lang.String r2 = "!@#%"
            boolean r9 = r9.contains(r2)
            if (r9 == 0) goto L21
            java.lang.String r9 = r7.getName()
            java.lang.String[] r9 = r9.split(r2)
            r9 = r9[r1]
            goto L2a
        L21:
            java.lang.String r9 = r7.getName()
            goto L2a
        L26:
            java.lang.String r9 = r7.getId()
        L2a:
            java.lang.String r2 = r7.getId()
            java.lang.String r3 = "fav_id"
            boolean r2 = r2.equalsIgnoreCase(r3)
            r3 = 2
            java.lang.String r4 = "name"
            if (r2 == 0) goto La2
            java.lang.String r7 = "is_favorite"
            if (r10 == r1) goto L7f
            if (r10 == r3) goto L5c
            io.realm.Realm r9 = r6.realm
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r10 = com.flextv.livestore.models.EPGChannel.class
            io.realm.RealmQuery r9 = r9.where(r10)
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            io.realm.RealmQuery r7 = r9.equalTo(r7, r10)
            java.lang.String r8 = r8.toLowerCase()
            io.realm.Case r9 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r7 = r7.contains(r4, r8, r9)
            io.realm.RealmResults r7 = r7.findAll()
            return r7
        L5c:
            io.realm.Realm r9 = r6.realm
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r10 = com.flextv.livestore.models.EPGChannel.class
            io.realm.RealmQuery r9 = r9.where(r10)
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            io.realm.RealmQuery r7 = r9.equalTo(r7, r10)
            java.lang.String r8 = r8.toLowerCase()
            io.realm.Case r9 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r7 = r7.contains(r4, r8, r9)
            io.realm.Sort r8 = io.realm.Sort.DESCENDING
            io.realm.RealmQuery r7 = r7.sort(r4, r8)
            io.realm.RealmResults r7 = r7.findAll()
            return r7
        L7f:
            io.realm.Realm r9 = r6.realm
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r10 = com.flextv.livestore.models.EPGChannel.class
            io.realm.RealmQuery r9 = r9.where(r10)
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            io.realm.RealmQuery r7 = r9.equalTo(r7, r10)
            java.lang.String r8 = r8.toLowerCase()
            io.realm.Case r9 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r7 = r7.contains(r4, r8, r9)
            io.realm.Sort r8 = io.realm.Sort.ASCENDING
            io.realm.RealmQuery r7 = r7.sort(r4, r8)
            io.realm.RealmResults r7 = r7.findAll()
            return r7
        La2:
            java.lang.String r2 = r7.getId()
            java.lang.String r5 = "resume_id"
            boolean r2 = r2.equalsIgnoreCase(r5)
            if (r2 == 0) goto Ld7
            io.realm.Realm r7 = r6.realm
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r9 = com.flextv.livestore.models.EPGChannel.class
            io.realm.RealmQuery r7 = r7.where(r9)
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            java.lang.String r10 = "is_recent"
            io.realm.RealmQuery r7 = r7.equalTo(r10, r9)
            java.lang.String r8 = r8.toLowerCase()
            io.realm.Case r9 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r7 = r7.contains(r4, r8, r9)
            io.realm.Sort r8 = io.realm.Sort.DESCENDING
            java.lang.String r9 = "recent_pos"
            io.realm.RealmQuery r7 = r7.sort(r9, r8)
            io.realm.RealmResults r7 = r7.findAll()
            return r7
        Ld7:
            java.lang.String r2 = r7.getId()
            java.lang.String r5 = "all_id"
            boolean r2 = r2.equalsIgnoreCase(r5)
            if (r2 == 0) goto L138
            if (r10 == r1) goto L11b
            if (r10 == r3) goto Lfe
            io.realm.Realm r7 = r6.realm
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r9 = com.flextv.livestore.models.EPGChannel.class
            io.realm.RealmQuery r7 = r7.where(r9)
            java.lang.String r8 = r8.toLowerCase()
            io.realm.Case r9 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r7 = r7.contains(r4, r8, r9)
            io.realm.RealmResults r7 = r7.findAll()
            return r7
        Lfe:
            io.realm.Realm r7 = r6.realm
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r9 = com.flextv.livestore.models.EPGChannel.class
            io.realm.RealmQuery r7 = r7.where(r9)
            java.lang.String r8 = r8.toLowerCase()
            io.realm.Case r9 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r7 = r7.contains(r4, r8, r9)
            io.realm.Sort r8 = io.realm.Sort.DESCENDING
            io.realm.RealmQuery r7 = r7.sort(r4, r8)
            io.realm.RealmResults r7 = r7.findAll()
            return r7
        L11b:
            io.realm.Realm r7 = r6.realm
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r9 = com.flextv.livestore.models.EPGChannel.class
            io.realm.RealmQuery r7 = r7.where(r9)
            java.lang.String r8 = r8.toLowerCase()
            io.realm.Case r9 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r7 = r7.contains(r4, r8, r9)
            io.realm.Sort r8 = io.realm.Sort.ASCENDING
            io.realm.RealmQuery r7 = r7.sort(r4, r8)
            io.realm.RealmResults r7 = r7.findAll()
            return r7
        L138:
            java.lang.String r7 = r7.getId()
            java.lang.String r2 = "lock_id"
            boolean r7 = r7.equalsIgnoreCase(r2)
            if (r7 == 0) goto L1ad
            java.lang.String r7 = "is_locked"
            if (r10 == r1) goto L18a
            if (r10 == r3) goto L167
            io.realm.Realm r9 = r6.realm
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r10 = com.flextv.livestore.models.EPGChannel.class
            io.realm.RealmQuery r9 = r9.where(r10)
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            io.realm.RealmQuery r7 = r9.equalTo(r7, r10)
            java.lang.String r8 = r8.toLowerCase()
            io.realm.Case r9 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r7 = r7.contains(r4, r8, r9)
            io.realm.RealmResults r7 = r7.findAll()
            return r7
        L167:
            io.realm.Realm r9 = r6.realm
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r10 = com.flextv.livestore.models.EPGChannel.class
            io.realm.RealmQuery r9 = r9.where(r10)
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            io.realm.RealmQuery r7 = r9.equalTo(r7, r10)
            java.lang.String r8 = r8.toLowerCase()
            io.realm.Case r9 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r7 = r7.contains(r4, r8, r9)
            io.realm.Sort r8 = io.realm.Sort.DESCENDING
            io.realm.RealmQuery r7 = r7.sort(r4, r8)
            io.realm.RealmResults r7 = r7.findAll()
            return r7
        L18a:
            io.realm.Realm r9 = r6.realm
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r10 = com.flextv.livestore.models.EPGChannel.class
            io.realm.RealmQuery r9 = r9.where(r10)
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            io.realm.RealmQuery r7 = r9.equalTo(r7, r10)
            java.lang.String r8 = r8.toLowerCase()
            io.realm.Case r9 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r7 = r7.contains(r4, r8, r9)
            io.realm.Sort r8 = io.realm.Sort.ASCENDING
            io.realm.RealmQuery r7 = r7.sort(r4, r8)
            io.realm.RealmResults r7 = r7.findAll()
            return r7
        L1ad:
            if (r10 == r1) goto L1ed
            if (r10 == r3) goto L1cc
            io.realm.Realm r7 = r6.realm
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r10 = com.flextv.livestore.models.EPGChannel.class
            io.realm.RealmQuery r7 = r7.where(r10)
            io.realm.RealmQuery r7 = r7.equalTo(r0, r9)
            java.lang.String r8 = r8.toLowerCase()
            io.realm.Case r9 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r7 = r7.contains(r4, r8, r9)
            io.realm.RealmResults r7 = r7.findAll()
            return r7
        L1cc:
            io.realm.Realm r7 = r6.realm
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r10 = com.flextv.livestore.models.EPGChannel.class
            io.realm.RealmQuery r7 = r7.where(r10)
            io.realm.RealmQuery r7 = r7.equalTo(r0, r9)
            java.lang.String r8 = r8.toLowerCase()
            io.realm.Case r9 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r7 = r7.contains(r4, r8, r9)
            io.realm.Sort r8 = io.realm.Sort.DESCENDING
            io.realm.RealmQuery r7 = r7.sort(r4, r8)
            io.realm.RealmResults r7 = r7.findAll()
            return r7
        L1ed:
            io.realm.Realm r7 = r6.realm
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r10 = com.flextv.livestore.models.EPGChannel.class
            io.realm.RealmQuery r7 = r7.where(r10)
            io.realm.RealmQuery r7 = r7.equalTo(r0, r9)
            java.lang.String r8 = r8.toLowerCase()
            io.realm.Case r9 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r7 = r7.contains(r4, r8, r9)
            io.realm.Sort r8 = io.realm.Sort.ASCENDING
            io.realm.RealmQuery r7 = r7.sort(r4, r8)
            io.realm.RealmResults r7 = r7.findAll()
            return r7
    }

    public io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> getLiveChannelsByKey(java.lang.String r3, boolean r4) {
            r2 = this;
            java.lang.String r0 = "name"
            if (r4 == 0) goto L3e
            io.realm.Realm r4 = r2.realm
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r1 = com.flextv.livestore.models.EPGChannel.class
            io.realm.RealmQuery r4 = r4.where(r1)
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r1)
            io.realm.RealmQuery r3 = r4.contains(r0, r3)
            io.realm.RealmQuery r3 = r3.not()
            io.realm.Case r4 = io.realm.Case.INSENSITIVE
            java.lang.String r0 = "category_name"
            java.lang.String r1 = "xxx"
            io.realm.RealmQuery r3 = r3.contains(r0, r1, r4)
            io.realm.RealmQuery r3 = r3.not()
            java.lang.String r1 = "adult"
            io.realm.RealmQuery r3 = r3.contains(r0, r1, r4)
            io.realm.RealmQuery r3 = r3.not()
            java.lang.String r1 = "porn"
            io.realm.RealmQuery r3 = r3.contains(r0, r1, r4)
            io.realm.RealmResults r3 = r3.findAll()
            return r3
        L3e:
            io.realm.Realm r4 = r2.realm
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r1 = com.flextv.livestore.models.EPGChannel.class
            io.realm.RealmQuery r4 = r4.where(r1)
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r1)
            io.realm.Case r1 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r3 = r4.contains(r0, r3, r1)
            java.util.List<java.lang.String> r4 = com.flextv.livestore.apps.Constants.xxx_live_categories
            int r4 = r4.size()
            if (r4 <= 0) goto L64
            java.util.List<java.lang.String> r4 = com.flextv.livestore.apps.Constants.xxx_live_categories
            r0 = 0
            java.lang.Object r4 = r4.get(r0)
            java.lang.String r4 = (java.lang.String) r4
            goto L66
        L64:
            java.lang.String r4 = ""
        L66:
            java.lang.String r0 = "category_id"
            io.realm.RealmQuery r3 = r3.notEqualTo(r0, r4)
            io.realm.RealmResults r3 = r3.findAll()
            return r3
    }

    public java.util.List<java.lang.String> getLockChannelNames() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            io.realm.Realm r1 = r4.realm
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r2 = com.flextv.livestore.models.EPGChannel.class
            io.realm.RealmQuery r1 = r1.where(r2)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.String r3 = "is_locked"
            io.realm.RealmQuery r1 = r1.equalTo(r3, r2)
            io.realm.RealmResults r1 = r1.findAll()
            java.util.Iterator r1 = r1.iterator()
        L1d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L31
            java.lang.Object r2 = r1.next()
            com.flextv.livestore.models.EPGChannel r2 = (com.flextv.livestore.models.EPGChannel) r2
            java.lang.String r2 = r2.getName()
            r0.add(r2)
            goto L1d
        L31:
            return r0
    }

    public com.flextv.livestore.models.MovieModel getMovieById(java.lang.String r4) {
            r3 = this;
            io.realm.Realm r0 = r3.realm
            java.lang.Class<com.flextv.livestore.models.MovieModel> r1 = com.flextv.livestore.models.MovieModel.class
            java.lang.String r2 = "stream_id"
            java.lang.Object r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r4)
            com.flextv.livestore.models.MovieModel r4 = (com.flextv.livestore.models.MovieModel) r4
            return r4
    }

    public com.flextv.livestore.models.MovieModel getMovieByName(java.lang.String r4) {
            r3 = this;
            io.realm.Realm r0 = r3.realm
            java.lang.Class<com.flextv.livestore.models.MovieModel> r1 = com.flextv.livestore.models.MovieModel.class
            java.lang.String r2 = "name"
            java.lang.Object r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r4)
            com.flextv.livestore.models.MovieModel r4 = (com.flextv.livestore.models.MovieModel) r4
            return r4
    }

    public io.realm.RealmResults<com.flextv.livestore.models.MovieModel> getMovieModelsByCategory(com.flextv.livestore.models.CategoryModel r12, java.lang.String r13, boolean r14, int r15) {
            r11 = this;
            if (r14 == 0) goto L5
            java.lang.String r0 = "category_name"
            goto L7
        L5:
            java.lang.String r0 = "category_id"
        L7:
            r1 = 1
            if (r14 == 0) goto L26
            java.lang.String r14 = r12.getName()
            java.lang.String r2 = "!@#%"
            boolean r14 = r14.contains(r2)
            if (r14 == 0) goto L21
            java.lang.String r14 = r12.getName()
            java.lang.String[] r14 = r14.split(r2)
            r14 = r14[r1]
            goto L2a
        L21:
            java.lang.String r14 = r12.getName()
            goto L2a
        L26:
            java.lang.String r14 = r12.getId()
        L2a:
            java.lang.String r2 = r12.getId()
            java.lang.String r3 = "resume_id"
            boolean r2 = r2.equalsIgnoreCase(r3)
            java.lang.String r3 = "num"
            java.lang.String r4 = "rating"
            java.lang.String r5 = "added"
            r6 = 4
            r7 = 3
            r8 = 2
            java.lang.String r9 = "name"
            if (r2 == 0) goto Lf8
            java.lang.String r12 = "is_recent"
            if (r15 == r1) goto Ld5
            if (r15 == r8) goto Lb2
            if (r15 == r7) goto L91
            if (r15 == r6) goto L6e
            io.realm.Realm r14 = r11.realm
            java.lang.Class<com.flextv.livestore.models.MovieModel> r15 = com.flextv.livestore.models.MovieModel.class
            io.realm.RealmQuery r14 = r14.where(r15)
            java.lang.Boolean r15 = java.lang.Boolean.TRUE
            io.realm.RealmQuery r12 = r14.equalTo(r12, r15)
            java.lang.String r13 = r13.toLowerCase()
            io.realm.Case r14 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r12 = r12.contains(r9, r13, r14)
            io.realm.RealmQuery r12 = r12.sort(r3)
            io.realm.RealmResults r12 = r12.findAll()
            return r12
        L6e:
            io.realm.Realm r14 = r11.realm
            java.lang.Class<com.flextv.livestore.models.MovieModel> r15 = com.flextv.livestore.models.MovieModel.class
            io.realm.RealmQuery r14 = r14.where(r15)
            java.lang.Boolean r15 = java.lang.Boolean.TRUE
            io.realm.RealmQuery r12 = r14.equalTo(r12, r15)
            java.lang.String r13 = r13.toLowerCase()
            io.realm.Case r14 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r12 = r12.contains(r9, r13, r14)
            io.realm.Sort r13 = io.realm.Sort.DESCENDING
            io.realm.RealmQuery r12 = r12.sort(r9, r13)
            io.realm.RealmResults r12 = r12.findAll()
            return r12
        L91:
            io.realm.Realm r14 = r11.realm
            java.lang.Class<com.flextv.livestore.models.MovieModel> r15 = com.flextv.livestore.models.MovieModel.class
            io.realm.RealmQuery r14 = r14.where(r15)
            java.lang.Boolean r15 = java.lang.Boolean.TRUE
            io.realm.RealmQuery r12 = r14.equalTo(r12, r15)
            java.lang.String r13 = r13.toLowerCase()
            io.realm.Case r14 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r12 = r12.contains(r9, r13, r14)
            io.realm.RealmQuery r12 = r12.sort(r9)
            io.realm.RealmResults r12 = r12.findAll()
            return r12
        Lb2:
            io.realm.Realm r14 = r11.realm
            java.lang.Class<com.flextv.livestore.models.MovieModel> r15 = com.flextv.livestore.models.MovieModel.class
            io.realm.RealmQuery r14 = r14.where(r15)
            java.lang.Boolean r15 = java.lang.Boolean.TRUE
            io.realm.RealmQuery r12 = r14.equalTo(r12, r15)
            java.lang.String r13 = r13.toLowerCase()
            io.realm.Case r14 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r12 = r12.contains(r9, r13, r14)
            io.realm.Sort r13 = io.realm.Sort.DESCENDING
            io.realm.RealmQuery r12 = r12.sort(r4, r13)
            io.realm.RealmResults r12 = r12.findAll()
            return r12
        Ld5:
            io.realm.Realm r14 = r11.realm
            java.lang.Class<com.flextv.livestore.models.MovieModel> r15 = com.flextv.livestore.models.MovieModel.class
            io.realm.RealmQuery r14 = r14.where(r15)
            java.lang.Boolean r15 = java.lang.Boolean.TRUE
            io.realm.RealmQuery r12 = r14.equalTo(r12, r15)
            java.lang.String r13 = r13.toLowerCase()
            io.realm.Case r14 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r12 = r12.contains(r9, r13, r14)
            io.realm.Sort r13 = io.realm.Sort.DESCENDING
            io.realm.RealmQuery r12 = r12.sort(r5, r13)
            io.realm.RealmResults r12 = r12.findAll()
            return r12
        Lf8:
            java.lang.String r2 = r12.getId()
            java.lang.String r10 = "all_id"
            boolean r2 = r2.equalsIgnoreCase(r10)
            if (r2 == 0) goto L199
            if (r15 == r1) goto L17c
            if (r15 == r8) goto L15f
            if (r15 == r7) goto L144
            if (r15 == r6) goto L127
            io.realm.Realm r12 = r11.realm
            java.lang.Class<com.flextv.livestore.models.MovieModel> r14 = com.flextv.livestore.models.MovieModel.class
            io.realm.RealmQuery r12 = r12.where(r14)
            java.lang.String r13 = r13.toLowerCase()
            io.realm.Case r14 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r12 = r12.contains(r9, r13, r14)
            io.realm.RealmQuery r12 = r12.sort(r3)
            io.realm.RealmResults r12 = r12.findAll()
            return r12
        L127:
            io.realm.Realm r12 = r11.realm
            java.lang.Class<com.flextv.livestore.models.MovieModel> r14 = com.flextv.livestore.models.MovieModel.class
            io.realm.RealmQuery r12 = r12.where(r14)
            java.lang.String r13 = r13.toLowerCase()
            io.realm.Case r14 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r12 = r12.contains(r9, r13, r14)
            io.realm.Sort r13 = io.realm.Sort.DESCENDING
            io.realm.RealmQuery r12 = r12.sort(r9, r13)
            io.realm.RealmResults r12 = r12.findAll()
            return r12
        L144:
            io.realm.Realm r12 = r11.realm
            java.lang.Class<com.flextv.livestore.models.MovieModel> r14 = com.flextv.livestore.models.MovieModel.class
            io.realm.RealmQuery r12 = r12.where(r14)
            java.lang.String r13 = r13.toLowerCase()
            io.realm.Case r14 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r12 = r12.contains(r9, r13, r14)
            io.realm.RealmQuery r12 = r12.sort(r9)
            io.realm.RealmResults r12 = r12.findAll()
            return r12
        L15f:
            io.realm.Realm r12 = r11.realm
            java.lang.Class<com.flextv.livestore.models.MovieModel> r14 = com.flextv.livestore.models.MovieModel.class
            io.realm.RealmQuery r12 = r12.where(r14)
            java.lang.String r13 = r13.toLowerCase()
            io.realm.Case r14 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r12 = r12.contains(r9, r13, r14)
            io.realm.Sort r13 = io.realm.Sort.DESCENDING
            io.realm.RealmQuery r12 = r12.sort(r4, r13)
            io.realm.RealmResults r12 = r12.findAll()
            return r12
        L17c:
            io.realm.Realm r12 = r11.realm
            java.lang.Class<com.flextv.livestore.models.MovieModel> r14 = com.flextv.livestore.models.MovieModel.class
            io.realm.RealmQuery r12 = r12.where(r14)
            java.lang.String r13 = r13.toLowerCase()
            io.realm.Case r14 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r12 = r12.contains(r9, r13, r14)
            io.realm.Sort r13 = io.realm.Sort.DESCENDING
            io.realm.RealmQuery r12 = r12.sort(r5, r13)
            io.realm.RealmResults r12 = r12.findAll()
            return r12
        L199:
            java.lang.String r12 = r12.getId()
            java.lang.String r2 = "fav_id"
            boolean r12 = r12.equalsIgnoreCase(r2)
            if (r12 == 0) goto L25a
            java.lang.String r12 = "is_favorite"
            if (r15 == r1) goto L237
            if (r15 == r8) goto L214
            if (r15 == r7) goto L1f3
            if (r15 == r6) goto L1d0
            io.realm.Realm r14 = r11.realm
            java.lang.Class<com.flextv.livestore.models.MovieModel> r15 = com.flextv.livestore.models.MovieModel.class
            io.realm.RealmQuery r14 = r14.where(r15)
            java.lang.Boolean r15 = java.lang.Boolean.TRUE
            io.realm.RealmQuery r12 = r14.equalTo(r12, r15)
            java.lang.String r13 = r13.toLowerCase()
            io.realm.Case r14 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r12 = r12.contains(r9, r13, r14)
            io.realm.RealmQuery r12 = r12.sort(r3)
            io.realm.RealmResults r12 = r12.findAll()
            return r12
        L1d0:
            io.realm.Realm r14 = r11.realm
            java.lang.Class<com.flextv.livestore.models.MovieModel> r15 = com.flextv.livestore.models.MovieModel.class
            io.realm.RealmQuery r14 = r14.where(r15)
            java.lang.Boolean r15 = java.lang.Boolean.TRUE
            io.realm.RealmQuery r12 = r14.equalTo(r12, r15)
            java.lang.String r13 = r13.toLowerCase()
            io.realm.Case r14 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r12 = r12.contains(r9, r13, r14)
            io.realm.Sort r13 = io.realm.Sort.DESCENDING
            io.realm.RealmQuery r12 = r12.sort(r9, r13)
            io.realm.RealmResults r12 = r12.findAll()
            return r12
        L1f3:
            io.realm.Realm r14 = r11.realm
            java.lang.Class<com.flextv.livestore.models.MovieModel> r15 = com.flextv.livestore.models.MovieModel.class
            io.realm.RealmQuery r14 = r14.where(r15)
            java.lang.Boolean r15 = java.lang.Boolean.TRUE
            io.realm.RealmQuery r12 = r14.equalTo(r12, r15)
            java.lang.String r13 = r13.toLowerCase()
            io.realm.Case r14 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r12 = r12.contains(r9, r13, r14)
            io.realm.RealmQuery r12 = r12.sort(r9)
            io.realm.RealmResults r12 = r12.findAll()
            return r12
        L214:
            io.realm.Realm r14 = r11.realm
            java.lang.Class<com.flextv.livestore.models.MovieModel> r15 = com.flextv.livestore.models.MovieModel.class
            io.realm.RealmQuery r14 = r14.where(r15)
            java.lang.Boolean r15 = java.lang.Boolean.TRUE
            io.realm.RealmQuery r12 = r14.equalTo(r12, r15)
            java.lang.String r13 = r13.toLowerCase()
            io.realm.Case r14 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r12 = r12.contains(r9, r13, r14)
            io.realm.Sort r13 = io.realm.Sort.DESCENDING
            io.realm.RealmQuery r12 = r12.sort(r4, r13)
            io.realm.RealmResults r12 = r12.findAll()
            return r12
        L237:
            io.realm.Realm r14 = r11.realm
            java.lang.Class<com.flextv.livestore.models.MovieModel> r15 = com.flextv.livestore.models.MovieModel.class
            io.realm.RealmQuery r14 = r14.where(r15)
            java.lang.Boolean r15 = java.lang.Boolean.TRUE
            io.realm.RealmQuery r12 = r14.equalTo(r12, r15)
            java.lang.String r13 = r13.toLowerCase()
            io.realm.Case r14 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r12 = r12.contains(r9, r13, r14)
            io.realm.Sort r13 = io.realm.Sort.DESCENDING
            io.realm.RealmQuery r12 = r12.sort(r5, r13)
            io.realm.RealmResults r12 = r12.findAll()
            return r12
        L25a:
            if (r15 == r1) goto L2e2
            if (r15 == r8) goto L2c1
            if (r15 == r7) goto L2a2
            if (r15 == r6) goto L281
            io.realm.Realm r12 = r11.realm
            java.lang.Class<com.flextv.livestore.models.MovieModel> r15 = com.flextv.livestore.models.MovieModel.class
            io.realm.RealmQuery r12 = r12.where(r15)
            io.realm.RealmQuery r12 = r12.equalTo(r0, r14)
            java.lang.String r13 = r13.toLowerCase()
            io.realm.Case r14 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r12 = r12.contains(r9, r13, r14)
            io.realm.RealmQuery r12 = r12.sort(r3)
            io.realm.RealmResults r12 = r12.findAll()
            return r12
        L281:
            io.realm.Realm r12 = r11.realm
            java.lang.Class<com.flextv.livestore.models.MovieModel> r15 = com.flextv.livestore.models.MovieModel.class
            io.realm.RealmQuery r12 = r12.where(r15)
            io.realm.RealmQuery r12 = r12.equalTo(r0, r14)
            java.lang.String r13 = r13.toLowerCase()
            io.realm.Case r14 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r12 = r12.contains(r9, r13, r14)
            io.realm.Sort r13 = io.realm.Sort.DESCENDING
            io.realm.RealmQuery r12 = r12.sort(r9, r13)
            io.realm.RealmResults r12 = r12.findAll()
            return r12
        L2a2:
            io.realm.Realm r12 = r11.realm
            java.lang.Class<com.flextv.livestore.models.MovieModel> r15 = com.flextv.livestore.models.MovieModel.class
            io.realm.RealmQuery r12 = r12.where(r15)
            io.realm.RealmQuery r12 = r12.equalTo(r0, r14)
            java.lang.String r13 = r13.toLowerCase()
            io.realm.Case r14 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r12 = r12.contains(r9, r13, r14)
            io.realm.RealmQuery r12 = r12.sort(r9)
            io.realm.RealmResults r12 = r12.findAll()
            return r12
        L2c1:
            io.realm.Realm r12 = r11.realm
            java.lang.Class<com.flextv.livestore.models.MovieModel> r15 = com.flextv.livestore.models.MovieModel.class
            io.realm.RealmQuery r12 = r12.where(r15)
            io.realm.RealmQuery r12 = r12.equalTo(r0, r14)
            java.lang.String r13 = r13.toLowerCase()
            io.realm.Case r14 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r12 = r12.contains(r9, r13, r14)
            io.realm.Sort r13 = io.realm.Sort.DESCENDING
            io.realm.RealmQuery r12 = r12.sort(r4, r13)
            io.realm.RealmResults r12 = r12.findAll()
            return r12
        L2e2:
            io.realm.Realm r12 = r11.realm
            java.lang.Class<com.flextv.livestore.models.MovieModel> r15 = com.flextv.livestore.models.MovieModel.class
            io.realm.RealmQuery r12 = r12.where(r15)
            io.realm.RealmQuery r12 = r12.equalTo(r0, r14)
            java.lang.String r13 = r13.toLowerCase()
            io.realm.Case r14 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r12 = r12.contains(r9, r13, r14)
            io.realm.Sort r13 = io.realm.Sort.DESCENDING
            io.realm.RealmQuery r12 = r12.sort(r5, r13)
            io.realm.RealmResults r12 = r12.findAll()
            return r12
    }

    public io.realm.RealmResults<com.flextv.livestore.models.MovieModel> getMoviesByKey(java.lang.String r4, boolean r5) {
            r3 = this;
            java.lang.String r0 = "category_id"
            if (r5 == 0) goto L7
            java.lang.String r1 = "category_name"
            goto L8
        L7:
            r1 = r0
        L8:
            java.lang.String r2 = "name"
            if (r5 == 0) goto L44
            io.realm.Realm r5 = r3.realm
            java.lang.Class<com.flextv.livestore.models.MovieModel> r0 = com.flextv.livestore.models.MovieModel.class
            io.realm.RealmQuery r5 = r5.where(r0)
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r0)
            io.realm.RealmQuery r4 = r5.contains(r2, r4)
            io.realm.RealmQuery r4 = r4.not()
            io.realm.Case r5 = io.realm.Case.INSENSITIVE
            java.lang.String r0 = "xxx"
            io.realm.RealmQuery r4 = r4.contains(r1, r0, r5)
            io.realm.RealmQuery r4 = r4.not()
            java.lang.String r0 = "adult"
            io.realm.RealmQuery r4 = r4.contains(r1, r0, r5)
            io.realm.RealmQuery r4 = r4.not()
            java.lang.String r0 = "porn"
            io.realm.RealmQuery r4 = r4.contains(r1, r0, r5)
            io.realm.RealmResults r4 = r4.findAll()
            return r4
        L44:
            io.realm.Realm r5 = r3.realm
            java.lang.Class<com.flextv.livestore.models.MovieModel> r1 = com.flextv.livestore.models.MovieModel.class
            io.realm.RealmQuery r5 = r5.where(r1)
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r1)
            io.realm.Case r1 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r4 = r5.contains(r2, r4, r1)
            java.util.List<java.lang.String> r5 = com.flextv.livestore.apps.Constants.xxx_vod_categories
            int r5 = r5.size()
            if (r5 <= 0) goto L6a
            java.util.List<java.lang.String> r5 = com.flextv.livestore.apps.Constants.xxx_vod_categories
            r1 = 0
            java.lang.Object r5 = r5.get(r1)
            java.lang.String r5 = (java.lang.String) r5
            goto L6c
        L6a:
            java.lang.String r5 = ""
        L6c:
            io.realm.RealmQuery r4 = r4.notEqualTo(r0, r5)
            io.realm.RealmResults r4 = r4.findAll()
            return r4
    }

    public java.util.List<java.lang.String> getRecentChannelNames() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            io.realm.Realm r1 = r4.realm
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r2 = com.flextv.livestore.models.EPGChannel.class
            io.realm.RealmQuery r1 = r1.where(r2)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.String r3 = "is_recent"
            io.realm.RealmQuery r1 = r1.equalTo(r3, r2)
            io.realm.RealmResults r1 = r1.findAll()
            java.util.Iterator r1 = r1.iterator()
        L1d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L31
            java.lang.Object r2 = r1.next()
            com.flextv.livestore.models.EPGChannel r2 = (com.flextv.livestore.models.EPGChannel) r2
            java.lang.String r2 = r2.getName()
            r0.add(r2)
            goto L1d
        L31:
            return r0
    }

    public java.util.List<com.flextv.livestore.models.ResumeSeriesModel> getResentSeriesNames() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            io.realm.Realm r1 = r5.realm
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r2 = com.flextv.livestore.models.SeriesModel.class
            io.realm.RealmQuery r1 = r1.where(r2)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.String r3 = "is_recent"
            io.realm.RealmQuery r1 = r1.equalTo(r3, r2)
            io.realm.RealmResults r1 = r1.findAll()
            java.util.Iterator r1 = r1.iterator()
        L1d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L47
            java.lang.Object r2 = r1.next()
            com.flextv.livestore.models.SeriesModel r2 = (com.flextv.livestore.models.SeriesModel) r2
            com.flextv.livestore.models.ResumeSeriesModel r3 = new com.flextv.livestore.models.ResumeSeriesModel
            r3.<init>()
            java.lang.String r4 = r2.getName()
            r3.setName(r4)
            int r4 = r2.getSeason_pos()
            r3.setSeason_pos(r4)
            int r2 = r2.getEpisode_pos()
            r3.setEpisode_pos(r2)
            r0.add(r3)
            goto L1d
        L47:
            return r0
    }

    public java.util.List<com.flextv.livestore.models.ResumeModel> getResumeMovies() {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            io.realm.Realm r1 = r6.realm
            java.lang.Class<com.flextv.livestore.models.MovieModel> r2 = com.flextv.livestore.models.MovieModel.class
            io.realm.RealmQuery r1 = r1.where(r2)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.String r3 = "is_recent"
            io.realm.RealmQuery r1 = r1.equalTo(r3, r2)
            io.realm.RealmResults r1 = r1.findAll()
            java.util.Iterator r1 = r1.iterator()
        L1d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4e
            java.lang.Object r2 = r1.next()
            com.flextv.livestore.models.MovieModel r2 = (com.flextv.livestore.models.MovieModel) r2
            com.flextv.livestore.models.ResumeModel r3 = new com.flextv.livestore.models.ResumeModel
            r3.<init>()
            java.lang.String r4 = r2.getName()
            r3.setName(r4)
            int r4 = r2.getPro()
            r3.setPro(r4)
            long r4 = r2.getTime()
            r3.setLast_position(r4)
            java.lang.String r2 = r2.getTmdb_id()
            r3.setTmdb_id(r2)
            r0.add(r3)
            goto L1d
        L4e:
            return r0
    }

    public java.util.List<com.flextv.livestore.models.Season> getSeasonBySeriesName(java.lang.String r3) {
            r2 = this;
            io.realm.Realm r0 = r2.realm
            java.lang.Class<com.flextv.livestore.models.EpisodeModel> r1 = com.flextv.livestore.models.EpisodeModel.class
            io.realm.RealmQuery r0 = r0.where(r1)
            java.lang.String r1 = "series_name"
            io.realm.RealmQuery r3 = r0.equalTo(r1, r3)
            io.realm.RealmResults r3 = r3.findAll()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            java.util.List r3 = getSeasonFromEpisodes(r0)
            return r3
    }

    public com.flextv.livestore.models.SeriesModel getSeriesById(java.lang.String r4) {
            r3 = this;
            io.realm.Realm r0 = r3.realm
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r1 = com.flextv.livestore.models.SeriesModel.class
            java.lang.String r2 = "series_id"
            java.lang.Object r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r4)
            com.flextv.livestore.models.SeriesModel r4 = (com.flextv.livestore.models.SeriesModel) r4
            return r4
    }

    public io.realm.RealmResults<com.flextv.livestore.models.SeriesModel> getSeriesByKey(java.lang.String r4) {
            r3 = this;
            io.realm.Realm r0 = r3.realm
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r1 = com.flextv.livestore.models.SeriesModel.class
            io.realm.RealmQuery r0 = r0.where(r1)
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r1)
            io.realm.Case r1 = io.realm.Case.INSENSITIVE
            java.lang.String r2 = "name"
            io.realm.RealmQuery r4 = r0.contains(r2, r4, r1)
            io.realm.RealmResults r4 = r4.findAll()
            return r4
    }

    public com.flextv.livestore.models.SeriesModel getSeriesByName(java.lang.String r4) {
            r3 = this;
            io.realm.Realm r0 = r3.realm
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r1 = com.flextv.livestore.models.SeriesModel.class
            java.lang.String r2 = "name"
            java.lang.Object r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r4)
            com.flextv.livestore.models.SeriesModel r4 = (com.flextv.livestore.models.SeriesModel) r4
            return r4
    }

    public io.realm.RealmResults<com.flextv.livestore.models.SeriesModel> getSeriesModelsByCategory(com.flextv.livestore.models.CategoryModel r12, java.lang.String r13, boolean r14, int r15) {
            r11 = this;
            if (r14 == 0) goto L5
            java.lang.String r0 = "category_name"
            goto L7
        L5:
            java.lang.String r0 = "category_id"
        L7:
            r1 = 1
            if (r14 == 0) goto L26
            java.lang.String r14 = r12.getName()
            java.lang.String r2 = "!@#%"
            boolean r14 = r14.contains(r2)
            if (r14 == 0) goto L21
            java.lang.String r14 = r12.getName()
            java.lang.String[] r14 = r14.split(r2)
            r14 = r14[r1]
            goto L2a
        L21:
            java.lang.String r14 = r12.getName()
            goto L2a
        L26:
            java.lang.String r14 = r12.getId()
        L2a:
            java.lang.String r2 = r12.getId()
            java.lang.String r3 = "all_id"
            boolean r2 = r2.equalsIgnoreCase(r3)
            java.lang.String r3 = "num"
            java.lang.String r4 = "rating"
            java.lang.String r5 = "last_modified"
            r6 = 4
            r7 = 3
            r8 = 2
            java.lang.String r9 = "name"
            if (r2 == 0) goto Ld7
            if (r15 == r1) goto Lba
            if (r15 == r8) goto L9d
            if (r15 == r7) goto L82
            if (r15 == r6) goto L65
            io.realm.Realm r12 = r11.realm
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r14 = com.flextv.livestore.models.SeriesModel.class
            io.realm.RealmQuery r12 = r12.where(r14)
            java.lang.String r13 = r13.toLowerCase()
            io.realm.Case r14 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r12 = r12.contains(r9, r13, r14)
            io.realm.RealmQuery r12 = r12.sort(r3)
            io.realm.RealmResults r12 = r12.findAll()
            return r12
        L65:
            io.realm.Realm r12 = r11.realm
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r14 = com.flextv.livestore.models.SeriesModel.class
            io.realm.RealmQuery r12 = r12.where(r14)
            java.lang.String r13 = r13.toLowerCase()
            io.realm.Case r14 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r12 = r12.contains(r9, r13, r14)
            io.realm.Sort r13 = io.realm.Sort.DESCENDING
            io.realm.RealmQuery r12 = r12.sort(r9, r13)
            io.realm.RealmResults r12 = r12.findAll()
            return r12
        L82:
            io.realm.Realm r12 = r11.realm
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r14 = com.flextv.livestore.models.SeriesModel.class
            io.realm.RealmQuery r12 = r12.where(r14)
            java.lang.String r13 = r13.toLowerCase()
            io.realm.Case r14 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r12 = r12.contains(r9, r13, r14)
            io.realm.RealmQuery r12 = r12.sort(r9)
            io.realm.RealmResults r12 = r12.findAll()
            return r12
        L9d:
            io.realm.Realm r12 = r11.realm
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r14 = com.flextv.livestore.models.SeriesModel.class
            io.realm.RealmQuery r12 = r12.where(r14)
            java.lang.String r13 = r13.toLowerCase()
            io.realm.Case r14 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r12 = r12.contains(r9, r13, r14)
            io.realm.Sort r13 = io.realm.Sort.DESCENDING
            io.realm.RealmQuery r12 = r12.sort(r4, r13)
            io.realm.RealmResults r12 = r12.findAll()
            return r12
        Lba:
            io.realm.Realm r12 = r11.realm
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r14 = com.flextv.livestore.models.SeriesModel.class
            io.realm.RealmQuery r12 = r12.where(r14)
            java.lang.String r13 = r13.toLowerCase()
            io.realm.Case r14 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r12 = r12.contains(r9, r13, r14)
            io.realm.Sort r13 = io.realm.Sort.DESCENDING
            io.realm.RealmQuery r12 = r12.sort(r5, r13)
            io.realm.RealmResults r12 = r12.findAll()
            return r12
        Ld7:
            java.lang.String r2 = r12.getId()
            java.lang.String r10 = "fav_id"
            boolean r2 = r2.equalsIgnoreCase(r10)
            if (r2 == 0) goto L198
            java.lang.String r12 = "is_favorite"
            if (r15 == r1) goto L175
            if (r15 == r8) goto L152
            if (r15 == r7) goto L131
            if (r15 == r6) goto L10e
            io.realm.Realm r14 = r11.realm
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r15 = com.flextv.livestore.models.SeriesModel.class
            io.realm.RealmQuery r14 = r14.where(r15)
            java.lang.Boolean r15 = java.lang.Boolean.TRUE
            io.realm.RealmQuery r12 = r14.equalTo(r12, r15)
            java.lang.String r13 = r13.toLowerCase()
            io.realm.Case r14 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r12 = r12.contains(r9, r13, r14)
            io.realm.RealmQuery r12 = r12.sort(r3)
            io.realm.RealmResults r12 = r12.findAll()
            return r12
        L10e:
            io.realm.Realm r14 = r11.realm
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r15 = com.flextv.livestore.models.SeriesModel.class
            io.realm.RealmQuery r14 = r14.where(r15)
            java.lang.Boolean r15 = java.lang.Boolean.TRUE
            io.realm.RealmQuery r12 = r14.equalTo(r12, r15)
            java.lang.String r13 = r13.toLowerCase()
            io.realm.Case r14 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r12 = r12.contains(r9, r13, r14)
            io.realm.Sort r13 = io.realm.Sort.DESCENDING
            io.realm.RealmQuery r12 = r12.sort(r9, r13)
            io.realm.RealmResults r12 = r12.findAll()
            return r12
        L131:
            io.realm.Realm r14 = r11.realm
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r15 = com.flextv.livestore.models.SeriesModel.class
            io.realm.RealmQuery r14 = r14.where(r15)
            java.lang.Boolean r15 = java.lang.Boolean.TRUE
            io.realm.RealmQuery r12 = r14.equalTo(r12, r15)
            java.lang.String r13 = r13.toLowerCase()
            io.realm.Case r14 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r12 = r12.contains(r9, r13, r14)
            io.realm.RealmQuery r12 = r12.sort(r9)
            io.realm.RealmResults r12 = r12.findAll()
            return r12
        L152:
            io.realm.Realm r14 = r11.realm
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r15 = com.flextv.livestore.models.SeriesModel.class
            io.realm.RealmQuery r14 = r14.where(r15)
            java.lang.Boolean r15 = java.lang.Boolean.TRUE
            io.realm.RealmQuery r12 = r14.equalTo(r12, r15)
            java.lang.String r13 = r13.toLowerCase()
            io.realm.Case r14 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r12 = r12.contains(r9, r13, r14)
            io.realm.Sort r13 = io.realm.Sort.DESCENDING
            io.realm.RealmQuery r12 = r12.sort(r4, r13)
            io.realm.RealmResults r12 = r12.findAll()
            return r12
        L175:
            io.realm.Realm r14 = r11.realm
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r15 = com.flextv.livestore.models.SeriesModel.class
            io.realm.RealmQuery r14 = r14.where(r15)
            java.lang.Boolean r15 = java.lang.Boolean.TRUE
            io.realm.RealmQuery r12 = r14.equalTo(r12, r15)
            java.lang.String r13 = r13.toLowerCase()
            io.realm.Case r14 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r12 = r12.contains(r9, r13, r14)
            io.realm.Sort r13 = io.realm.Sort.DESCENDING
            io.realm.RealmQuery r12 = r12.sort(r5, r13)
            io.realm.RealmResults r12 = r12.findAll()
            return r12
        L198:
            java.lang.String r12 = r12.getId()
            java.lang.String r2 = "resume_id"
            boolean r12 = r12.equalsIgnoreCase(r2)
            if (r12 == 0) goto L25a
            java.lang.String r12 = "is_recent"
            if (r15 == r1) goto L237
            if (r15 == r8) goto L214
            if (r15 == r7) goto L1f3
            if (r15 == r6) goto L1d0
            io.realm.Realm r14 = r11.realm
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r15 = com.flextv.livestore.models.SeriesModel.class
            io.realm.RealmQuery r14 = r14.where(r15)
            java.lang.Boolean r15 = java.lang.Boolean.TRUE
            io.realm.RealmQuery r12 = r14.equalTo(r12, r15)
            java.lang.String r13 = r13.toLowerCase()
            io.realm.Case r14 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r12 = r12.contains(r9, r13, r14)
            io.realm.RealmQuery r12 = r12.sort(r3)
            io.realm.RealmResults r12 = r12.findAll()
            return r12
        L1d0:
            io.realm.Realm r14 = r11.realm
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r15 = com.flextv.livestore.models.SeriesModel.class
            io.realm.RealmQuery r14 = r14.where(r15)
            java.lang.Boolean r15 = java.lang.Boolean.TRUE
            io.realm.RealmQuery r12 = r14.equalTo(r12, r15)
            java.lang.String r13 = r13.toLowerCase()
            io.realm.Case r14 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r12 = r12.contains(r9, r13, r14)
            io.realm.Sort r13 = io.realm.Sort.DESCENDING
            io.realm.RealmQuery r12 = r12.sort(r9, r13)
            io.realm.RealmResults r12 = r12.findAll()
            return r12
        L1f3:
            io.realm.Realm r14 = r11.realm
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r15 = com.flextv.livestore.models.SeriesModel.class
            io.realm.RealmQuery r14 = r14.where(r15)
            java.lang.Boolean r15 = java.lang.Boolean.TRUE
            io.realm.RealmQuery r12 = r14.equalTo(r12, r15)
            java.lang.String r13 = r13.toLowerCase()
            io.realm.Case r14 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r12 = r12.contains(r9, r13, r14)
            io.realm.RealmQuery r12 = r12.sort(r9)
            io.realm.RealmResults r12 = r12.findAll()
            return r12
        L214:
            io.realm.Realm r14 = r11.realm
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r15 = com.flextv.livestore.models.SeriesModel.class
            io.realm.RealmQuery r14 = r14.where(r15)
            java.lang.Boolean r15 = java.lang.Boolean.TRUE
            io.realm.RealmQuery r12 = r14.equalTo(r12, r15)
            java.lang.String r13 = r13.toLowerCase()
            io.realm.Case r14 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r12 = r12.contains(r9, r13, r14)
            io.realm.Sort r13 = io.realm.Sort.DESCENDING
            io.realm.RealmQuery r12 = r12.sort(r4, r13)
            io.realm.RealmResults r12 = r12.findAll()
            return r12
        L237:
            io.realm.Realm r14 = r11.realm
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r15 = com.flextv.livestore.models.SeriesModel.class
            io.realm.RealmQuery r14 = r14.where(r15)
            java.lang.Boolean r15 = java.lang.Boolean.TRUE
            io.realm.RealmQuery r12 = r14.equalTo(r12, r15)
            java.lang.String r13 = r13.toLowerCase()
            io.realm.Case r14 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r12 = r12.contains(r9, r13, r14)
            io.realm.Sort r13 = io.realm.Sort.DESCENDING
            io.realm.RealmQuery r12 = r12.sort(r5, r13)
            io.realm.RealmResults r12 = r12.findAll()
            return r12
        L25a:
            if (r15 == r1) goto L2e2
            if (r15 == r8) goto L2c1
            if (r15 == r7) goto L2a2
            if (r15 == r6) goto L281
            io.realm.Realm r12 = r11.realm
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r15 = com.flextv.livestore.models.SeriesModel.class
            io.realm.RealmQuery r12 = r12.where(r15)
            io.realm.RealmQuery r12 = r12.equalTo(r0, r14)
            java.lang.String r13 = r13.toLowerCase()
            io.realm.Case r14 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r12 = r12.contains(r9, r13, r14)
            io.realm.RealmQuery r12 = r12.sort(r3)
            io.realm.RealmResults r12 = r12.findAll()
            return r12
        L281:
            io.realm.Realm r12 = r11.realm
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r15 = com.flextv.livestore.models.SeriesModel.class
            io.realm.RealmQuery r12 = r12.where(r15)
            io.realm.RealmQuery r12 = r12.equalTo(r0, r14)
            java.lang.String r13 = r13.toLowerCase()
            io.realm.Case r14 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r12 = r12.contains(r9, r13, r14)
            io.realm.Sort r13 = io.realm.Sort.DESCENDING
            io.realm.RealmQuery r12 = r12.sort(r9, r13)
            io.realm.RealmResults r12 = r12.findAll()
            return r12
        L2a2:
            io.realm.Realm r12 = r11.realm
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r15 = com.flextv.livestore.models.SeriesModel.class
            io.realm.RealmQuery r12 = r12.where(r15)
            io.realm.RealmQuery r12 = r12.equalTo(r0, r14)
            java.lang.String r13 = r13.toLowerCase()
            io.realm.Case r14 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r12 = r12.contains(r9, r13, r14)
            io.realm.RealmQuery r12 = r12.sort(r9)
            io.realm.RealmResults r12 = r12.findAll()
            return r12
        L2c1:
            io.realm.Realm r12 = r11.realm
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r15 = com.flextv.livestore.models.SeriesModel.class
            io.realm.RealmQuery r12 = r12.where(r15)
            io.realm.RealmQuery r12 = r12.equalTo(r0, r14)
            java.lang.String r13 = r13.toLowerCase()
            io.realm.Case r14 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r12 = r12.contains(r9, r13, r14)
            io.realm.Sort r13 = io.realm.Sort.DESCENDING
            io.realm.RealmQuery r12 = r12.sort(r4, r13)
            io.realm.RealmResults r12 = r12.findAll()
            return r12
        L2e2:
            io.realm.Realm r12 = r11.realm
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r15 = com.flextv.livestore.models.SeriesModel.class
            io.realm.RealmQuery r12 = r12.where(r15)
            io.realm.RealmQuery r12 = r12.equalTo(r0, r14)
            java.lang.String r13 = r13.toLowerCase()
            io.realm.Case r14 = io.realm.Case.INSENSITIVE
            io.realm.RealmQuery r12 = r12.contains(r9, r13, r14)
            io.realm.Sort r13 = io.realm.Sort.DESCENDING
            io.realm.RealmQuery r12 = r12.sort(r5, r13)
            io.realm.RealmResults r12 = r12.findAll()
            return r12
    }
}
