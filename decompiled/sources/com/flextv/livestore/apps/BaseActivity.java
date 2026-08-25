package com.flextv.livestore.apps;

/* JADX INFO: loaded from: classes.dex */
public class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    public static boolean busy;
    private java.util.HashMap<java.lang.String, java.lang.String> categoryHashMap;
    private java.util.HashMap<java.lang.String, java.util.List<com.flextv.livestore.models.EpisodeModel>> episodeModelHashMap;
    public int error_account;
    private com.flextv.livestore.net.NetworkTask<java.lang.Void, java.lang.Void, java.util.List<com.flextv.livestore.models.EPGChannel>> fetchChannelsTask;
    private com.flextv.livestore.net.NetworkTask<java.lang.Void, java.lang.Void, java.util.List<com.flextv.livestore.models.EpisodeModel>> fetchEpisodesTask;
    private com.flextv.livestore.net.NetworkTask<java.lang.Void, java.lang.Void, java.util.List<iptv.m3u.parser.M3UItem>> fetchM3uItemsTask;
    private com.flextv.livestore.net.NetworkTask<java.lang.Void, java.lang.Void, java.util.List<com.flextv.livestore.models.MovieModel>> fetchVideosTask;
    public boolean is_stop;
    private final com.flextv.livestore.apps.LTVApp model;
    public java.lang.String password;
    public com.flextv.livestore.helper.PreferenceHelper preferenceHelper;
    public io.realm.Realm realm;
    public java.lang.String user;
    public java.lang.String user_id;
    public com.flextv.livestore.models.WordModels wordModels;


    /* JADX INFO: renamed from: com.flextv.livestore.apps.BaseActivity$10, reason: invalid class name */
    public class AnonymousClass10 implements retrofit2.Callback<java.util.List<com.flextv.livestore.models.SeriesModel>> {
        public final /* synthetic */ com.flextv.livestore.apps.BaseActivity this$0;
        public final /* synthetic */ java.util.List val$series_favorites;
        public final /* synthetic */ java.util.List val$series_recent;

        /* JADX INFO: renamed from: $r8$lambda$8Q-5oyIJubj3NUKfJoyH-0oAK_s, reason: not valid java name */
        public static /* synthetic */ void m113$r8$lambda$8Q5oyIJubj3NUKfJoyH0oAK_s(java.lang.String r0, io.realm.Realm r1) {
                lambda$onResponse$1(r0, r1)
                return
        }

        public static /* synthetic */ void $r8$lambda$N_NXfgpRu3Bo_c6lQBUcA08cwa8(retrofit2.Response r0, io.realm.Realm r1) {
                lambda$onResponse$0(r0, r1)
                return
        }

        /* JADX INFO: renamed from: $r8$lambda$eC23BVk3YGPrueuE-zU6PVxehyo, reason: not valid java name */
        public static /* synthetic */ void m114$r8$lambda$eC23BVk3YGPrueuEzU6PVxehyo(com.flextv.livestore.models.ResumeSeriesModel r0, io.realm.Realm r1) {
                lambda$onResponse$2(r0, r1)
                return
        }

        public AnonymousClass10(com.flextv.livestore.apps.BaseActivity r1, java.util.List r2, java.util.List r3) {
                r0 = this;
                r0.this$0 = r1
                r0.val$series_favorites = r2
                r0.val$series_recent = r3
                r0.<init>()
                return
        }

        private static /* synthetic */ void lambda$onResponse$0(retrofit2.Response r1, io.realm.Realm r2) {
                java.lang.Class<com.flextv.livestore.models.SeriesModel> r0 = com.flextv.livestore.models.SeriesModel.class
                io.realm.RealmQuery r0 = r2.where(r0)
                io.realm.RealmResults r0 = r0.findAll()
                r0.deleteAllFromRealm()
                java.lang.Object r1 = r1.body()
                java.util.Collection r1 = (java.util.Collection) r1
                r2.insertOrUpdate(r1)
                return
        }

        private static /* synthetic */ void lambda$onResponse$1(java.lang.String r2, io.realm.Realm r3) {
                java.lang.Class<com.flextv.livestore.models.SeriesModel> r0 = com.flextv.livestore.models.SeriesModel.class
                java.lang.String r1 = "name"
                java.lang.Object r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r0, r1, r2)
                com.flextv.livestore.models.SeriesModel r2 = (com.flextv.livestore.models.SeriesModel) r2
                if (r2 == 0) goto L10
                r3 = 1
                r2.setIs_favorite(r3)
            L10:
                return
        }

        private static /* synthetic */ void lambda$onResponse$2(com.flextv.livestore.models.ResumeSeriesModel r2, io.realm.Realm r3) {
                java.lang.Class<com.flextv.livestore.models.SeriesModel> r0 = com.flextv.livestore.models.SeriesModel.class
                io.realm.RealmQuery r3 = r3.where(r0)
                java.lang.String r0 = r2.getName()
                java.lang.String r1 = "name"
                io.realm.RealmQuery r3 = r3.equalTo(r1, r0)
                java.lang.Object r3 = r3.findFirst()
                com.flextv.livestore.models.SeriesModel r3 = (com.flextv.livestore.models.SeriesModel) r3
                if (r3 == 0) goto L2a
                r0 = 1
                r3.setIs_recent(r0)
                int r0 = r2.getSeason_pos()
                r3.setSeason_pos(r0)
                int r2 = r2.getEpisode_pos()
                r3.setEpisode_pos(r2)
            L2a:
                return
        }

        @Override // retrofit2.Callback
        public void onFailure(@androidx.annotation.NonNull retrofit2.Call<java.util.List<com.flextv.livestore.models.SeriesModel>> r3, @androidx.annotation.NonNull java.lang.Throwable r4) {
                r2 = this;
                com.flextv.livestore.apps.BaseActivity r3 = r2.this$0
                boolean r4 = r3.is_stop
                if (r4 != 0) goto L16
                int r4 = r3.error_account
                r0 = 2
                r1 = 1
                if (r4 >= r0) goto L13
                int r4 = r4 + r1
                r3.error_account = r4
                com.flextv.livestore.apps.BaseActivity.access$900(r3)
                goto L16
            L13:
                r3.doNextTask(r1)
            L16:
                return
        }

        @Override // retrofit2.Callback
        public void onResponse(@androidx.annotation.NonNull retrofit2.Call<java.util.List<com.flextv.livestore.models.SeriesModel>> r4, @androidx.annotation.NonNull retrofit2.Response<java.util.List<com.flextv.livestore.models.SeriesModel>> r5) {
                r3 = this;
                java.lang.Object r4 = r5.body()
                r0 = 1
                if (r4 == 0) goto L61
                com.flextv.livestore.apps.BaseActivity r4 = r3.this$0
                io.realm.Realm r4 = r4.realm
                com.flextv.livestore.apps.BaseActivity$5$$ExternalSyntheticLambda0 r1 = new com.flextv.livestore.apps.BaseActivity$5$$ExternalSyntheticLambda0
                r1.<init>(r5, r0)
                r4.executeTransaction(r1)
                java.util.List r4 = r3.val$series_favorites
                int r4 = r4.size()
                if (r4 <= 0) goto L3a
                java.util.List r4 = r3.val$series_favorites
                java.util.Iterator r4 = r4.iterator()
            L21:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L3a
                java.lang.Object r5 = r4.next()
                java.lang.String r5 = (java.lang.String) r5
                com.flextv.livestore.apps.BaseActivity r1 = r3.this$0
                io.realm.Realm r1 = r1.realm
                com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda6 r2 = new com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda6
                r2.<init>(r5, r0)
                r1.executeTransaction(r2)
                goto L21
            L3a:
                java.util.List r4 = r3.val$series_recent
                int r4 = r4.size()
                if (r4 <= 0) goto L61
                java.util.List r4 = r3.val$series_recent
                java.util.Iterator r4 = r4.iterator()
            L48:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L61
                java.lang.Object r5 = r4.next()
                com.flextv.livestore.models.ResumeSeriesModel r5 = (com.flextv.livestore.models.ResumeSeriesModel) r5
                com.flextv.livestore.apps.BaseActivity r1 = r3.this$0
                io.realm.Realm r1 = r1.realm
                com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda5 r2 = new com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda5
                r2.<init>(r5, r0)
                r1.executeTransactionAsync(r2)
                goto L48
            L61:
                com.flextv.livestore.apps.BaseActivity r4 = r3.this$0
                boolean r5 = r4.is_stop
                if (r5 != 0) goto L6a
                r4.doNextTask(r0)
            L6a:
                return
        }
    }




    /* JADX INFO: renamed from: com.flextv.livestore.apps.BaseActivity$5, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    public class AnonymousClass5 implements retrofit2.Callback<java.util.List<com.flextv.livestore.models.EPGChannel>> {
        public final /* synthetic */ com.flextv.livestore.apps.BaseActivity this$0;
        public final /* synthetic */ java.util.List val$live_favorites;
        public final /* synthetic */ java.util.List val$lock_channels;

        /* JADX INFO: renamed from: $r8$lambda$CXUcw8IzlamCruF1u_DRsZm-WP0, reason: not valid java name */
        public static /* synthetic */ void m115$r8$lambda$CXUcw8IzlamCruF1u_DRsZmWP0(java.lang.String r0, io.realm.Realm r1) {
                lambda$onResponse$1(r0, r1)
                return
        }

        /* JADX INFO: renamed from: $r8$lambda$G-MtAzXamlvCU3XHaYDHQvCkHLo, reason: not valid java name */
        public static /* synthetic */ void m116$r8$lambda$GMtAzXamlvCU3XHaYDHQvCkHLo(retrofit2.Response r0, io.realm.Realm r1) {
                lambda$onResponse$0(r0, r1)
                return
        }

        public static /* synthetic */ void $r8$lambda$t0qUL2eBfiav751GCSzLVBZ0Tvw(java.lang.String r0, io.realm.Realm r1) {
                lambda$onResponse$2(r0, r1)
                return
        }

        public AnonymousClass5(com.flextv.livestore.apps.BaseActivity r1, java.util.List r2, java.util.List r3) {
                r0 = this;
                r0.this$0 = r1
                r0.val$live_favorites = r2
                r0.val$lock_channels = r3
                r0.<init>()
                return
        }

        private static /* synthetic */ void lambda$onResponse$0(retrofit2.Response r1, io.realm.Realm r2) {
                java.lang.Class<com.flextv.livestore.models.EPGChannel> r0 = com.flextv.livestore.models.EPGChannel.class
                io.realm.RealmQuery r0 = r2.where(r0)
                io.realm.RealmResults r0 = r0.findAll()
                r0.deleteAllFromRealm()
                java.lang.Object r1 = r1.body()
                java.util.Collection r1 = (java.util.Collection) r1
                r2.insertOrUpdate(r1)
                return
        }

        private static /* synthetic */ void lambda$onResponse$1(java.lang.String r2, io.realm.Realm r3) {
                java.lang.Class<com.flextv.livestore.models.EPGChannel> r0 = com.flextv.livestore.models.EPGChannel.class
                java.lang.String r1 = "name"
                java.lang.Object r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r0, r1, r2)
                com.flextv.livestore.models.EPGChannel r2 = (com.flextv.livestore.models.EPGChannel) r2
                if (r2 == 0) goto L10
                r3 = 1
                r2.setIs_favorite(r3)
            L10:
                return
        }

        private static /* synthetic */ void lambda$onResponse$2(java.lang.String r2, io.realm.Realm r3) {
                java.lang.Class<com.flextv.livestore.models.EPGChannel> r0 = com.flextv.livestore.models.EPGChannel.class
                java.lang.String r1 = "name"
                java.lang.Object r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r0, r1, r2)
                com.flextv.livestore.models.EPGChannel r2 = (com.flextv.livestore.models.EPGChannel) r2
                if (r2 == 0) goto L10
                r3 = 1
                r2.setIs_locked(r3)
            L10:
                return
        }

        @Override // retrofit2.Callback
        public void onFailure(@androidx.annotation.NonNull retrofit2.Call<java.util.List<com.flextv.livestore.models.EPGChannel>> r2, @androidx.annotation.NonNull java.lang.Throwable r3) {
                r1 = this;
                com.flextv.livestore.apps.BaseActivity r2 = r1.this$0
                boolean r3 = r2.is_stop
                if (r3 != 0) goto L16
                int r3 = r2.error_account
                r0 = 2
                if (r3 >= r0) goto L13
                int r3 = r3 + 1
                r2.error_account = r3
                com.flextv.livestore.apps.BaseActivity.access$400(r2)
                goto L16
            L13:
                com.flextv.livestore.apps.BaseActivity.access$600(r2)
            L16:
                return
        }

        @Override // retrofit2.Callback
        public void onResponse(@androidx.annotation.NonNull retrofit2.Call<java.util.List<com.flextv.livestore.models.EPGChannel>> r4, @androidx.annotation.NonNull retrofit2.Response<java.util.List<com.flextv.livestore.models.EPGChannel>> r5) {
                r3 = this;
                java.lang.Object r4 = r5.body()
                if (r4 == 0) goto L83
                com.flextv.livestore.apps.BaseActivity r4 = r3.this$0
                r0 = 0
                r4.error_account = r0
                java.lang.Object r4 = r5.body()
                java.util.List r4 = (java.util.List) r4
                int r4 = r4.size()
                if (r4 <= 0) goto L7d
                com.flextv.livestore.apps.BaseActivity r4 = r3.this$0
                io.realm.Realm r4 = r4.realm
                com.flextv.livestore.apps.BaseActivity$5$$ExternalSyntheticLambda0 r1 = new com.flextv.livestore.apps.BaseActivity$5$$ExternalSyntheticLambda0
                r1.<init>(r5, r0)
                r4.executeTransaction(r1)
                java.util.List r4 = r3.val$live_favorites
                int r4 = r4.size()
                if (r4 <= 0) goto L4b
                java.util.List r4 = r3.val$live_favorites
                java.util.Iterator r4 = r4.iterator()
            L31:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L4b
                java.lang.Object r5 = r4.next()
                java.lang.String r5 = (java.lang.String) r5
                com.flextv.livestore.apps.BaseActivity r0 = r3.this$0
                io.realm.Realm r0 = r0.realm
                com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda6 r1 = new com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda6
                r2 = 2
                r1.<init>(r5, r2)
                r0.executeTransaction(r1)
                goto L31
            L4b:
                java.util.List r4 = r3.val$lock_channels
                int r4 = r4.size()
                if (r4 <= 0) goto L73
                java.util.List r4 = r3.val$lock_channels
                java.util.Iterator r4 = r4.iterator()
            L59:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L73
                java.lang.Object r5 = r4.next()
                java.lang.String r5 = (java.lang.String) r5
                com.flextv.livestore.apps.BaseActivity r0 = r3.this$0
                io.realm.Realm r0 = r0.realm
                com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda6 r1 = new com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda6
                r2 = 3
                r1.<init>(r5, r2)
                r0.executeTransaction(r1)
                goto L59
            L73:
                com.flextv.livestore.apps.BaseActivity r4 = r3.this$0
                boolean r5 = r4.is_stop
                if (r5 != 0) goto L8c
                com.flextv.livestore.apps.BaseActivity.access$500(r4)
                goto L8c
            L7d:
                com.flextv.livestore.apps.BaseActivity r4 = r3.this$0
                com.flextv.livestore.apps.BaseActivity.access$600(r4)
                goto L8c
            L83:
                com.flextv.livestore.apps.BaseActivity r4 = r3.this$0
                boolean r5 = r4.is_stop
                if (r5 != 0) goto L8c
                com.flextv.livestore.apps.BaseActivity.access$600(r4)
            L8c:
                return
        }
    }

    /* JADX INFO: renamed from: com.flextv.livestore.apps.BaseActivity$6, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    public class AnonymousClass6 implements retrofit2.Callback<java.util.List<com.flextv.livestore.models.EPGChannel>> {
        public final /* synthetic */ com.flextv.livestore.apps.BaseActivity this$0;
        public final /* synthetic */ java.util.List val$live_favorites;
        public final /* synthetic */ java.util.List val$lock_channels;

        /* JADX INFO: renamed from: $r8$lambda$E5KbDLFBOiIqpoa8YQmF-34L0Bc, reason: not valid java name */
        public static /* synthetic */ void m117$r8$lambda$E5KbDLFBOiIqpoa8YQmF34L0Bc(retrofit2.Response r0, io.realm.Realm r1) {
                lambda$onResponse$0(r0, r1)
                return
        }

        /* JADX INFO: renamed from: $r8$lambda$YJ-DsJdxmepe8GjQHck7JYZSbHQ, reason: not valid java name */
        public static /* synthetic */ void m118$r8$lambda$YJDsJdxmepe8GjQHck7JYZSbHQ(java.lang.String r0, io.realm.Realm r1) {
                lambda$onResponse$2(r0, r1)
                return
        }

        public static /* synthetic */ void $r8$lambda$_yBsq0VBwyd5imYNCkCYNojCEjY(java.lang.String r0, io.realm.Realm r1) {
                lambda$onResponse$1(r0, r1)
                return
        }

        public AnonymousClass6(com.flextv.livestore.apps.BaseActivity r1, java.util.List r2, java.util.List r3) {
                r0 = this;
                r0.this$0 = r1
                r0.val$live_favorites = r2
                r0.val$lock_channels = r3
                r0.<init>()
                return
        }

        private static /* synthetic */ void lambda$onResponse$0(retrofit2.Response r1, io.realm.Realm r2) {
                java.lang.Class<com.flextv.livestore.models.EPGChannel> r0 = com.flextv.livestore.models.EPGChannel.class
                io.realm.RealmQuery r0 = r2.where(r0)
                io.realm.RealmResults r0 = r0.findAll()
                r0.deleteAllFromRealm()
                java.lang.Object r1 = r1.body()
                java.util.Collection r1 = (java.util.Collection) r1
                r2.insertOrUpdate(r1)
                return
        }

        private static /* synthetic */ void lambda$onResponse$1(java.lang.String r2, io.realm.Realm r3) {
                java.lang.Class<com.flextv.livestore.models.EPGChannel> r0 = com.flextv.livestore.models.EPGChannel.class
                java.lang.String r1 = "name"
                java.lang.Object r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r0, r1, r2)
                com.flextv.livestore.models.EPGChannel r2 = (com.flextv.livestore.models.EPGChannel) r2
                if (r2 == 0) goto L10
                r3 = 1
                r2.setIs_favorite(r3)
            L10:
                return
        }

        private static /* synthetic */ void lambda$onResponse$2(java.lang.String r2, io.realm.Realm r3) {
                java.lang.Class<com.flextv.livestore.models.EPGChannel> r0 = com.flextv.livestore.models.EPGChannel.class
                java.lang.String r1 = "name"
                java.lang.Object r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r0, r1, r2)
                com.flextv.livestore.models.EPGChannel r2 = (com.flextv.livestore.models.EPGChannel) r2
                if (r2 == 0) goto L10
                r3 = 1
                r2.setIs_locked(r3)
            L10:
                return
        }

        @Override // retrofit2.Callback
        public void onFailure(@androidx.annotation.NonNull retrofit2.Call<java.util.List<com.flextv.livestore.models.EPGChannel>> r2, @androidx.annotation.NonNull java.lang.Throwable r3) {
                r1 = this;
                com.flextv.livestore.apps.BaseActivity r2 = r1.this$0
                boolean r3 = r2.is_stop
                if (r3 != 0) goto L16
                int r3 = r2.error_account
                r0 = 2
                if (r3 >= r0) goto L13
                int r3 = r3 + 1
                r2.error_account = r3
                com.flextv.livestore.apps.BaseActivity.access$600(r2)
                goto L16
            L13:
                com.flextv.livestore.apps.BaseActivity.access$700(r2)
            L16:
                return
        }

        @Override // retrofit2.Callback
        public void onResponse(@androidx.annotation.NonNull retrofit2.Call<java.util.List<com.flextv.livestore.models.EPGChannel>> r4, @androidx.annotation.NonNull retrofit2.Response<java.util.List<com.flextv.livestore.models.EPGChannel>> r5) {
                r3 = this;
                java.lang.Object r4 = r5.body()
                if (r4 == 0) goto L66
                com.flextv.livestore.apps.BaseActivity r4 = r3.this$0
                r0 = 0
                r4.error_account = r0
                io.realm.Realm r4 = r4.realm
                com.flextv.livestore.apps.BaseActivity$5$$ExternalSyntheticLambda0 r0 = new com.flextv.livestore.apps.BaseActivity$5$$ExternalSyntheticLambda0
                r1 = 2
                r0.<init>(r5, r1)
                r4.executeTransaction(r0)
                java.util.List r4 = r3.val$live_favorites
                int r4 = r4.size()
                if (r4 <= 0) goto L3e
                java.util.List r4 = r3.val$live_favorites
                java.util.Iterator r4 = r4.iterator()
            L24:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L3e
                java.lang.Object r5 = r4.next()
                java.lang.String r5 = (java.lang.String) r5
                com.flextv.livestore.apps.BaseActivity r0 = r3.this$0
                io.realm.Realm r0 = r0.realm
                com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda6 r1 = new com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda6
                r2 = 4
                r1.<init>(r5, r2)
                r0.executeTransaction(r1)
                goto L24
            L3e:
                java.util.List r4 = r3.val$lock_channels
                int r4 = r4.size()
                if (r4 <= 0) goto L66
                java.util.List r4 = r3.val$lock_channels
                java.util.Iterator r4 = r4.iterator()
            L4c:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L66
                java.lang.Object r5 = r4.next()
                java.lang.String r5 = (java.lang.String) r5
                com.flextv.livestore.apps.BaseActivity r0 = r3.this$0
                io.realm.Realm r0 = r0.realm
                com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda6 r1 = new com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda6
                r2 = 5
                r1.<init>(r5, r2)
                r0.executeTransaction(r1)
                goto L4c
            L66:
                com.flextv.livestore.apps.BaseActivity r4 = r3.this$0
                boolean r5 = r4.is_stop
                if (r5 != 0) goto L6f
                com.flextv.livestore.apps.BaseActivity.access$700(r4)
            L6f:
                return
        }
    }

    /* JADX INFO: renamed from: com.flextv.livestore.apps.BaseActivity$7, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    public class AnonymousClass7 implements retrofit2.Callback<java.util.List<com.flextv.livestore.models.MovieModel>> {
        public final /* synthetic */ com.flextv.livestore.apps.BaseActivity this$0;
        public final /* synthetic */ java.util.List val$resumeModels;
        public final /* synthetic */ java.util.List val$vod_favorites;

        public static /* synthetic */ void $r8$lambda$B23yn060MK8f1JlX8jIHUN052is(com.flextv.livestore.models.ResumeModel r0, io.realm.Realm r1) {
                lambda$onResponse$2(r0, r1)
                return
        }

        public static /* synthetic */ void $r8$lambda$ZXK06SHs1RAmeoVoTggxkK3igqc(java.lang.String r0, io.realm.Realm r1) {
                lambda$onResponse$1(r0, r1)
                return
        }

        public static /* synthetic */ void $r8$lambda$kquz6gmu1mi4IBdrpNBJobtQa7M(retrofit2.Response r0, io.realm.Realm r1) {
                lambda$onResponse$0(r0, r1)
                return
        }

        public AnonymousClass7(com.flextv.livestore.apps.BaseActivity r1, java.util.List r2, java.util.List r3) {
                r0 = this;
                r0.this$0 = r1
                r0.val$vod_favorites = r2
                r0.val$resumeModels = r3
                r0.<init>()
                return
        }

        private static /* synthetic */ void lambda$onResponse$0(retrofit2.Response r1, io.realm.Realm r2) {
                java.lang.Class<com.flextv.livestore.models.MovieModel> r0 = com.flextv.livestore.models.MovieModel.class
                io.realm.RealmQuery r0 = r2.where(r0)
                io.realm.RealmResults r0 = r0.findAll()
                r0.deleteAllFromRealm()
                java.lang.Object r1 = r1.body()
                java.util.Collection r1 = (java.util.Collection) r1
                r2.insertOrUpdate(r1)
                return
        }

        private static /* synthetic */ void lambda$onResponse$1(java.lang.String r2, io.realm.Realm r3) {
                java.lang.Class<com.flextv.livestore.models.MovieModel> r0 = com.flextv.livestore.models.MovieModel.class
                java.lang.String r1 = "name"
                java.lang.Object r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r0, r1, r2)
                com.flextv.livestore.models.MovieModel r2 = (com.flextv.livestore.models.MovieModel) r2
                if (r2 == 0) goto L10
                r3 = 1
                r2.setIs_favorite(r3)
            L10:
                return
        }

        private static /* synthetic */ void lambda$onResponse$2(com.flextv.livestore.models.ResumeModel r2, io.realm.Realm r3) {
                java.lang.Class<com.flextv.livestore.models.MovieModel> r0 = com.flextv.livestore.models.MovieModel.class
                io.realm.RealmQuery r3 = r3.where(r0)
                java.lang.String r0 = r2.getName()
                java.lang.String r1 = "name"
                io.realm.RealmQuery r3 = r3.equalTo(r1, r0)
                java.lang.Object r3 = r3.findFirst()
                com.flextv.livestore.models.MovieModel r3 = (com.flextv.livestore.models.MovieModel) r3
                if (r3 == 0) goto L31
                r0 = 1
                r3.setIs_recent(r0)
                int r0 = r2.getPro()
                r3.setPro(r0)
                long r0 = r2.getLast_position()
                r3.setTime(r0)
                java.lang.String r2 = r2.getTmdb_id()
                r3.setTmdb_id(r2)
            L31:
                return
        }

        @Override // retrofit2.Callback
        public void onFailure(@androidx.annotation.NonNull retrofit2.Call<java.util.List<com.flextv.livestore.models.MovieModel>> r2, @androidx.annotation.NonNull java.lang.Throwable r3) {
                r1 = this;
                com.flextv.livestore.apps.BaseActivity r2 = r1.this$0
                boolean r3 = r2.is_stop
                if (r3 != 0) goto L16
                int r3 = r2.error_account
                r0 = 2
                if (r3 >= r0) goto L13
                int r3 = r3 + 1
                r2.error_account = r3
                com.flextv.livestore.apps.BaseActivity.access$500(r2)
                goto L16
            L13:
                com.flextv.livestore.apps.BaseActivity.access$800(r2)
            L16:
                return
        }

        @Override // retrofit2.Callback
        public void onResponse(@androidx.annotation.NonNull retrofit2.Call<java.util.List<com.flextv.livestore.models.MovieModel>> r4, @androidx.annotation.NonNull retrofit2.Response<java.util.List<com.flextv.livestore.models.MovieModel>> r5) {
                r3 = this;
                java.lang.Object r4 = r5.body()
                if (r4 == 0) goto L66
                com.flextv.livestore.apps.BaseActivity r4 = r3.this$0
                r0 = 0
                r4.error_account = r0
                io.realm.Realm r4 = r4.realm
                com.flextv.livestore.apps.BaseActivity$5$$ExternalSyntheticLambda0 r0 = new com.flextv.livestore.apps.BaseActivity$5$$ExternalSyntheticLambda0
                r1 = 3
                r0.<init>(r5, r1)
                r4.executeTransaction(r0)
                java.util.List r4 = r3.val$vod_favorites
                int r4 = r4.size()
                if (r4 <= 0) goto L3e
                java.util.List r4 = r3.val$vod_favorites
                java.util.Iterator r4 = r4.iterator()
            L24:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L3e
                java.lang.Object r5 = r4.next()
                java.lang.String r5 = (java.lang.String) r5
                com.flextv.livestore.apps.BaseActivity r0 = r3.this$0
                io.realm.Realm r0 = r0.realm
                com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda6 r1 = new com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda6
                r2 = 6
                r1.<init>(r5, r2)
                r0.executeTransaction(r1)
                goto L24
            L3e:
                java.util.List r4 = r3.val$resumeModels
                int r4 = r4.size()
                if (r4 <= 0) goto L66
                java.util.List r4 = r3.val$resumeModels
                java.util.Iterator r4 = r4.iterator()
            L4c:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L66
                java.lang.Object r5 = r4.next()
                com.flextv.livestore.models.ResumeModel r5 = (com.flextv.livestore.models.ResumeModel) r5
                com.flextv.livestore.apps.BaseActivity r0 = r3.this$0
                io.realm.Realm r0 = r0.realm
                com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda4 r1 = new com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda4
                r2 = 1
                r1.<init>(r5, r2)
                r0.executeTransaction(r1)
                goto L4c
            L66:
                com.flextv.livestore.apps.BaseActivity r4 = r3.this$0
                boolean r5 = r4.is_stop
                if (r5 != 0) goto L6f
                com.flextv.livestore.apps.BaseActivity.access$800(r4)
            L6f:
                return
        }
    }

    /* JADX INFO: renamed from: com.flextv.livestore.apps.BaseActivity$8, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    public class AnonymousClass8 implements retrofit2.Callback<java.util.List<com.flextv.livestore.models.MovieModel>> {
        public final /* synthetic */ com.flextv.livestore.apps.BaseActivity this$0;
        public final /* synthetic */ java.util.List val$resumeModels;
        public final /* synthetic */ java.util.List val$vod_favorites;

        public static /* synthetic */ void $r8$lambda$WLj6bJK9fcf_llBohE5kpXbdU2E(retrofit2.Response r0, io.realm.Realm r1) {
                lambda$onResponse$0(r0, r1)
                return
        }

        public static /* synthetic */ void $r8$lambda$jlfERvHMgb6pThX6w7JCtlzpn7A(java.lang.String r0, io.realm.Realm r1) {
                lambda$onResponse$1(r0, r1)
                return
        }

        public static /* synthetic */ void $r8$lambda$y4fbgeoPUgOjTWTkjNnltO7Neqs(com.flextv.livestore.models.ResumeModel r0, io.realm.Realm r1) {
                lambda$onResponse$2(r0, r1)
                return
        }

        public AnonymousClass8(com.flextv.livestore.apps.BaseActivity r1, java.util.List r2, java.util.List r3) {
                r0 = this;
                r0.this$0 = r1
                r0.val$vod_favorites = r2
                r0.val$resumeModels = r3
                r0.<init>()
                return
        }

        private static /* synthetic */ void lambda$onResponse$0(retrofit2.Response r1, io.realm.Realm r2) {
                java.lang.Class<com.flextv.livestore.models.MovieModel> r0 = com.flextv.livestore.models.MovieModel.class
                io.realm.RealmQuery r0 = r2.where(r0)
                io.realm.RealmResults r0 = r0.findAll()
                r0.deleteAllFromRealm()
                java.lang.Object r1 = r1.body()
                java.util.Collection r1 = (java.util.Collection) r1
                r2.insertOrUpdate(r1)
                return
        }

        private static /* synthetic */ void lambda$onResponse$1(java.lang.String r2, io.realm.Realm r3) {
                java.lang.Class<com.flextv.livestore.models.MovieModel> r0 = com.flextv.livestore.models.MovieModel.class
                java.lang.String r1 = "name"
                java.lang.Object r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r0, r1, r2)
                com.flextv.livestore.models.MovieModel r2 = (com.flextv.livestore.models.MovieModel) r2
                if (r2 == 0) goto L10
                r3 = 1
                r2.setIs_favorite(r3)
            L10:
                return
        }

        private static /* synthetic */ void lambda$onResponse$2(com.flextv.livestore.models.ResumeModel r2, io.realm.Realm r3) {
                java.lang.Class<com.flextv.livestore.models.MovieModel> r0 = com.flextv.livestore.models.MovieModel.class
                io.realm.RealmQuery r3 = r3.where(r0)
                java.lang.String r0 = r2.getName()
                java.lang.String r1 = "name"
                io.realm.RealmQuery r3 = r3.equalTo(r1, r0)
                java.lang.Object r3 = r3.findFirst()
                com.flextv.livestore.models.MovieModel r3 = (com.flextv.livestore.models.MovieModel) r3
                if (r3 == 0) goto L31
                r0 = 1
                r3.setIs_recent(r0)
                int r0 = r2.getPro()
                r3.setPro(r0)
                long r0 = r2.getLast_position()
                r3.setTime(r0)
                java.lang.String r2 = r2.getTmdb_id()
                r3.setTmdb_id(r2)
            L31:
                return
        }

        @Override // retrofit2.Callback
        public void onFailure(@androidx.annotation.NonNull retrofit2.Call<java.util.List<com.flextv.livestore.models.MovieModel>> r2, @androidx.annotation.NonNull java.lang.Throwable r3) {
                r1 = this;
                com.flextv.livestore.apps.BaseActivity r2 = r1.this$0
                boolean r3 = r2.is_stop
                if (r3 != 0) goto L16
                int r3 = r2.error_account
                r0 = 2
                if (r3 >= r0) goto L13
                int r3 = r3 + 1
                r2.error_account = r3
                com.flextv.livestore.apps.BaseActivity.access$700(r2)
                goto L16
            L13:
                com.flextv.livestore.apps.BaseActivity.access$900(r2)
            L16:
                return
        }

        @Override // retrofit2.Callback
        public void onResponse(@androidx.annotation.NonNull retrofit2.Call<java.util.List<com.flextv.livestore.models.MovieModel>> r4, @androidx.annotation.NonNull retrofit2.Response<java.util.List<com.flextv.livestore.models.MovieModel>> r5) {
                r3 = this;
                java.lang.Object r4 = r5.body()
                if (r4 == 0) goto L66
                com.flextv.livestore.apps.BaseActivity r4 = r3.this$0
                r0 = 0
                r4.error_account = r0
                io.realm.Realm r4 = r4.realm
                com.flextv.livestore.apps.BaseActivity$5$$ExternalSyntheticLambda0 r0 = new com.flextv.livestore.apps.BaseActivity$5$$ExternalSyntheticLambda0
                r1 = 4
                r0.<init>(r5, r1)
                r4.executeTransaction(r0)
                java.util.List r4 = r3.val$vod_favorites
                int r4 = r4.size()
                if (r4 <= 0) goto L3e
                java.util.List r4 = r3.val$vod_favorites
                java.util.Iterator r4 = r4.iterator()
            L24:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L3e
                java.lang.Object r5 = r4.next()
                java.lang.String r5 = (java.lang.String) r5
                com.flextv.livestore.apps.BaseActivity r0 = r3.this$0
                io.realm.Realm r0 = r0.realm
                com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda6 r1 = new com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda6
                r2 = 7
                r1.<init>(r5, r2)
                r0.executeTransaction(r1)
                goto L24
            L3e:
                java.util.List r4 = r3.val$resumeModels
                int r4 = r4.size()
                if (r4 <= 0) goto L66
                java.util.List r4 = r3.val$resumeModels
                java.util.Iterator r4 = r4.iterator()
            L4c:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L66
                java.lang.Object r5 = r4.next()
                com.flextv.livestore.models.ResumeModel r5 = (com.flextv.livestore.models.ResumeModel) r5
                com.flextv.livestore.apps.BaseActivity r0 = r3.this$0
                io.realm.Realm r0 = r0.realm
                com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda4 r1 = new com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda4
                r2 = 2
                r1.<init>(r5, r2)
                r0.executeTransaction(r1)
                goto L4c
            L66:
                com.flextv.livestore.apps.BaseActivity r4 = r3.this$0
                boolean r5 = r4.is_stop
                if (r5 != 0) goto L6f
                com.flextv.livestore.apps.BaseActivity.access$900(r4)
            L6f:
                return
        }
    }

    /* JADX INFO: renamed from: com.flextv.livestore.apps.BaseActivity$9, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    public class AnonymousClass9 implements retrofit2.Callback<java.util.List<com.flextv.livestore.models.SeriesModel>> {
        public final /* synthetic */ com.flextv.livestore.apps.BaseActivity this$0;
        public final /* synthetic */ java.util.List val$series_favorites;
        public final /* synthetic */ java.util.List val$series_recent;

        public static /* synthetic */ void $r8$lambda$MZ8sKnoeWz3omd27il_VuMQEuCI(com.flextv.livestore.models.ResumeSeriesModel r0, io.realm.Realm r1) {
                lambda$onResponse$2(r0, r1)
                return
        }

        /* JADX INFO: renamed from: $r8$lambda$MpO0L3odzQnIsIz9u6gD7upc-8E, reason: not valid java name */
        public static /* synthetic */ void m119$r8$lambda$MpO0L3odzQnIsIz9u6gD7upc8E(retrofit2.Response r0, io.realm.Realm r1) {
                lambda$onResponse$0(r0, r1)
                return
        }

        public static /* synthetic */ void $r8$lambda$uRJyGlxFuGU2F3CS4YtvtZSsaUI(java.lang.String r0, io.realm.Realm r1) {
                lambda$onResponse$1(r0, r1)
                return
        }

        public AnonymousClass9(com.flextv.livestore.apps.BaseActivity r1, java.util.List r2, java.util.List r3) {
                r0 = this;
                r0.this$0 = r1
                r0.val$series_favorites = r2
                r0.val$series_recent = r3
                r0.<init>()
                return
        }

        private static /* synthetic */ void lambda$onResponse$0(retrofit2.Response r1, io.realm.Realm r2) {
                java.lang.Class<com.flextv.livestore.models.SeriesModel> r0 = com.flextv.livestore.models.SeriesModel.class
                io.realm.RealmQuery r0 = r2.where(r0)
                io.realm.RealmResults r0 = r0.findAll()
                r0.deleteAllFromRealm()
                java.lang.Object r1 = r1.body()
                java.util.Collection r1 = (java.util.Collection) r1
                r2.insertOrUpdate(r1)
                return
        }

        private static /* synthetic */ void lambda$onResponse$1(java.lang.String r2, io.realm.Realm r3) {
                java.lang.Class<com.flextv.livestore.models.SeriesModel> r0 = com.flextv.livestore.models.SeriesModel.class
                java.lang.String r1 = "name"
                java.lang.Object r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r0, r1, r2)
                com.flextv.livestore.models.SeriesModel r2 = (com.flextv.livestore.models.SeriesModel) r2
                if (r2 == 0) goto L10
                r3 = 1
                r2.setIs_favorite(r3)
            L10:
                return
        }

        private static /* synthetic */ void lambda$onResponse$2(com.flextv.livestore.models.ResumeSeriesModel r2, io.realm.Realm r3) {
                java.lang.Class<com.flextv.livestore.models.SeriesModel> r0 = com.flextv.livestore.models.SeriesModel.class
                io.realm.RealmQuery r3 = r3.where(r0)
                java.lang.String r0 = r2.getName()
                java.lang.String r1 = "name"
                io.realm.RealmQuery r3 = r3.equalTo(r1, r0)
                java.lang.Object r3 = r3.findFirst()
                com.flextv.livestore.models.SeriesModel r3 = (com.flextv.livestore.models.SeriesModel) r3
                if (r3 == 0) goto L2a
                r0 = 1
                r3.setIs_recent(r0)
                int r0 = r2.getSeason_pos()
                r3.setSeason_pos(r0)
                int r2 = r2.getEpisode_pos()
                r3.setEpisode_pos(r2)
            L2a:
                return
        }

        @Override // retrofit2.Callback
        public void onFailure(@androidx.annotation.NonNull retrofit2.Call<java.util.List<com.flextv.livestore.models.SeriesModel>> r3, @androidx.annotation.NonNull java.lang.Throwable r4) {
                r2 = this;
                com.flextv.livestore.apps.BaseActivity r3 = r2.this$0
                boolean r4 = r3.is_stop
                if (r4 != 0) goto L16
                int r4 = r3.error_account
                r0 = 2
                r1 = 1
                if (r4 >= r0) goto L13
                int r4 = r4 + r1
                r3.error_account = r4
                com.flextv.livestore.apps.BaseActivity.access$800(r3)
                goto L16
            L13:
                r3.doNextTask(r1)
            L16:
                return
        }

        @Override // retrofit2.Callback
        public void onResponse(@androidx.annotation.NonNull retrofit2.Call<java.util.List<com.flextv.livestore.models.SeriesModel>> r4, @androidx.annotation.NonNull retrofit2.Response<java.util.List<com.flextv.livestore.models.SeriesModel>> r5) {
                r3 = this;
                java.lang.Object r4 = r5.body()
                if (r4 == 0) goto L64
                com.flextv.livestore.apps.BaseActivity r4 = r3.this$0
                io.realm.Realm r4 = r4.realm
                com.flextv.livestore.apps.BaseActivity$5$$ExternalSyntheticLambda0 r0 = new com.flextv.livestore.apps.BaseActivity$5$$ExternalSyntheticLambda0
                r1 = 5
                r0.<init>(r5, r1)
                r4.executeTransaction(r0)
                java.util.List r4 = r3.val$series_favorites
                int r4 = r4.size()
                if (r4 <= 0) goto L3c
                java.util.List r4 = r3.val$series_favorites
                java.util.Iterator r4 = r4.iterator()
            L21:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L3c
                java.lang.Object r5 = r4.next()
                java.lang.String r5 = (java.lang.String) r5
                com.flextv.livestore.apps.BaseActivity r0 = r3.this$0
                io.realm.Realm r0 = r0.realm
                com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda6 r1 = new com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda6
                r2 = 8
                r1.<init>(r5, r2)
                r0.executeTransaction(r1)
                goto L21
            L3c:
                java.util.List r4 = r3.val$series_recent
                int r4 = r4.size()
                if (r4 <= 0) goto L64
                java.util.List r4 = r3.val$series_recent
                java.util.Iterator r4 = r4.iterator()
            L4a:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L64
                java.lang.Object r5 = r4.next()
                com.flextv.livestore.models.ResumeSeriesModel r5 = (com.flextv.livestore.models.ResumeSeriesModel) r5
                com.flextv.livestore.apps.BaseActivity r0 = r3.this$0
                io.realm.Realm r0 = r0.realm
                com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda5 r1 = new com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda5
                r2 = 2
                r1.<init>(r5, r2)
                r0.executeTransactionAsync(r1)
                goto L4a
            L64:
                com.flextv.livestore.apps.BaseActivity r4 = r3.this$0
                boolean r5 = r4.is_stop
                if (r5 != 0) goto L6e
                r5 = 1
                r4.doNextTask(r5)
            L6e:
                return
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$-7CMOPc2PoOrvW8mAooiPpQ6ldg, reason: not valid java name */
    public static /* synthetic */ void m104$r8$lambda$7CMOPc2PoOrvW8mAooiPpQ6ldg(io.realm.Realm r0) {
            lambda$goToLogin$0(r0)
            return
    }

    public static /* synthetic */ void $r8$lambda$0XCo166mUUBrVIex60Oh0SFpkP4(com.flextv.livestore.apps.BaseActivity r0, java.lang.Exception r1) {
            r0.lambda$getMovieModels$15(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$1mOWkWt0xodvBJhzrGsm4zj7TWM(java.lang.String r0, io.realm.Realm r1) {
            lambda$getSeriesFromEpisodes$20(r0, r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$7h-EuTESPZ60-1OCx-6sw4AzjLY, reason: not valid java name */
    public static /* synthetic */ void m105$r8$lambda$7hEuTESPZ601OCx6sw4AzjLY(com.flextv.livestore.apps.BaseActivity r0, java.lang.Exception r1) {
            r0.lambda$fetchM3UItems$4(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$837cPBuv3ZXpo2DqO_99MtDbeUM(java.util.List r0, io.realm.Realm r1) {
            lambda$getMovieModels$11(r0, r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$8iXwlvuOTeOLmgyp5zAu7z8Wy-I, reason: not valid java name */
    public static /* synthetic */ void m106$r8$lambda$8iXwlvuOTeOLmgyp5zAu7z8WyI(java.util.List r0, io.realm.Realm r1) {
            lambda$getEpisodeModels$16(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$9Xg9hmuOBNsuItI_OIxOoabF0Uw(com.flextv.livestore.apps.BaseActivity r0, io.realm.RealmResults r1, java.util.List r2) {
            r0.lambda$getEpisodeModels$17(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$AhzrLo0VFf-WN9XRPpjzYS5d8Es, reason: not valid java name */
    public static /* synthetic */ void m107$r8$lambda$AhzrLo0VFfWN9XRPpjzYS5d8Es(com.flextv.livestore.models.ResumeSeriesModel r0, io.realm.Realm r1) {
            lambda$getSeriesFromEpisodes$21(r0, r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$BZWMRqXgll-EU7-maNcyp619BT4, reason: not valid java name */
    public static /* synthetic */ void m108$r8$lambda$BZWMRqXgllEU7maNcyp619BT4(com.flextv.livestore.apps.BaseActivity r0, java.util.List r1) {
            r0.lambda$fetchM3UItems$3(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$Kbd9sxWUbfTs9W6COiEjEJXIo3U(java.lang.String r0, io.realm.Realm r1) {
            lambda$getChannelModels$8(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$LvJSvfB25ofRpyl21c3Q63ZMziQ(io.realm.Realm r0) {
            lambda$goToXUILogin$1(r0)
            return
    }

    public static /* synthetic */ void $r8$lambda$NAjSG1uOyLQAcvxSR3FTOM6eEpg(java.util.List r0, io.realm.Realm r1) {
            lambda$getChannelModels$6(r0, r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$YzwjBnprNGF-JkCxzQ4vn3kO51M, reason: not valid java name */
    public static /* synthetic */ void m109$r8$lambda$YzwjBnprNGFJkCxzQ4vn3kO51M(com.flextv.livestore.apps.BaseActivity r0, android.accounts.NetworkErrorException r1) {
            r0.lambda$fetchM3UItems$5(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$ZPG5QH7WfGP1a0aa_7ws3WWHyto(io.realm.Realm r0) {
            lambda$reloadM3UData$2(r0)
            return
    }

    public static /* synthetic */ void $r8$lambda$brdQWpWOjg4DFTsOj8EQQYaD_W8(com.flextv.livestore.models.ResumeModel r0, io.realm.Realm r1) {
            lambda$getMovieModels$13(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$euu7KY1XtZF18CBsYSjxe6AdNS4(java.util.List r0, io.realm.Realm r1) {
            lambda$getSeriesFromEpisodes$19(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$jYJq0LQLolOuhmaSUQxp1bqLLeM(com.flextv.livestore.apps.BaseActivity r0, java.lang.Exception r1) {
            r0.lambda$getChannelModels$10(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$l7nnitKLMtp31n48eqZnX8eby-s, reason: not valid java name */
    public static /* synthetic */ void m110$r8$lambda$l7nnitKLMtp31n48eqZnX8ebys(com.flextv.livestore.apps.BaseActivity r0, java.lang.Exception r1) {
            r0.lambda$getEpisodeModels$18(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$qsRsxx2uUV31gFuUam8--ORtFFQ, reason: not valid java name */
    public static /* synthetic */ void m111$r8$lambda$qsRsxx2uUV31gFuUam8ORtFFQ(java.lang.String r0, io.realm.Realm r1) {
            lambda$getChannelModels$7(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$sMNlwohdF2JebPpyWzbwoIATYY4(com.flextv.livestore.apps.BaseActivity r0, io.realm.RealmResults r1, java.util.List r2, java.util.List r3, java.util.List r4) {
            r0.lambda$getChannelModels$9(r1, r2, r3, r4)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$vGsMKwosR0x9t58Y5ghrJaE-okg, reason: not valid java name */
    public static /* synthetic */ void m112$r8$lambda$vGsMKwosR0x9t58Y5ghrJaEokg(com.flextv.livestore.apps.BaseActivity r0, io.realm.RealmResults r1, java.util.List r2, java.util.List r3, java.util.List r4) {
            r0.lambda$getMovieModels$14(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ void $r8$lambda$yUgC2TIrm9I5cZxO6KTL5ulRaRw(java.lang.String r0, io.realm.Realm r1) {
            lambda$getMovieModels$12(r0, r1)
            return
    }

    public BaseActivity() {
            r1 = this;
            r1.<init>()
            com.flextv.livestore.models.WordModels r0 = new com.flextv.livestore.models.WordModels
            r0.<init>()
            r1.wordModels = r0
            r0 = 0
            r1.is_stop = r0
            r1.error_account = r0
            com.flextv.livestore.apps.LTVApp r0 = com.flextv.livestore.apps.LTVApp.getInstance()
            r1.model = r0
            return
    }

    public static /* synthetic */ void access$000(com.flextv.livestore.apps.BaseActivity r0) {
            r0.getLiveCategory()
            return
    }

    public static /* synthetic */ void access$100(com.flextv.livestore.apps.BaseActivity r0, java.lang.String r1) {
            r0.authentication(r1)
            return
    }

    public static /* synthetic */ void access$200(com.flextv.livestore.apps.BaseActivity r0) {
            r0.getVodCategory()
            return
    }

    public static /* synthetic */ void access$300(com.flextv.livestore.apps.BaseActivity r0) {
            r0.getSeriesCategory()
            return
    }

    public static /* synthetic */ void access$400(com.flextv.livestore.apps.BaseActivity r0) {
            r0.getLiveStreams()
            return
    }

    public static /* synthetic */ void access$500(com.flextv.livestore.apps.BaseActivity r0) {
            r0.getVodStreams()
            return
    }

    public static /* synthetic */ void access$600(com.flextv.livestore.apps.BaseActivity r0) {
            r0.getSecondLiveStreams()
            return
    }

    public static /* synthetic */ void access$700(com.flextv.livestore.apps.BaseActivity r0) {
            r0.getSecondVodStreams()
            return
    }

    public static /* synthetic */ void access$800(com.flextv.livestore.apps.BaseActivity r0) {
            r0.getSeriesStreams()
            return
    }

    public static /* synthetic */ void access$900(com.flextv.livestore.apps.BaseActivity r0) {
            r0.getSecondSeriesStreams()
            return
    }

    private void addChannelToCategory(com.flextv.livestore.models.EPGChannel r4) {
            r3 = this;
            java.lang.String r0 = r4.getCategory_name()
            java.lang.String r0 = r3.getKeyFromCategoryName(r0)
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r3.categoryHashMap
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L33
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            long r1 = r1.getTime()
            r0.append(r1)
            java.lang.String r1 = "!@#%"
            r0.append(r1)
            java.lang.String r1 = r4.getCategory_name()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L33:
            java.lang.String r4 = r4.getCategory_name()
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r3.categoryHashMap
            r1.put(r0, r4)
            return
    }

    private void addEpisodeToSeries(com.flextv.livestore.models.EpisodeModel r3) {
            r2 = this;
            java.lang.String r0 = r3.getSeries_name()
            if (r0 == 0) goto Le
            java.lang.String r1 = "null"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L10
        Le:
            java.lang.String r0 = "All"
        L10:
            java.util.HashMap<java.lang.String, java.util.List<com.flextv.livestore.models.EpisodeModel>> r1 = r2.episodeModelHashMap
            java.lang.Object r1 = r1.get(r0)
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L1f
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L1f:
            r1.add(r3)
            java.util.HashMap<java.lang.String, java.util.List<com.flextv.livestore.models.EpisodeModel>> r3 = r2.episodeModelHashMap
            r3.put(r0, r1)
            return
    }

    private void addMovieToCategory(com.flextv.livestore.models.MovieModel r4) {
            r3 = this;
            java.lang.String r0 = r4.getCategory_name()
            java.lang.String r0 = r3.getKeyFromCategoryName(r0)
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r3.categoryHashMap
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L33
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            long r1 = r1.getTime()
            r0.append(r1)
            java.lang.String r1 = "!@#%"
            r0.append(r1)
            java.lang.String r1 = r4.getCategory_name()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L33:
            java.lang.String r4 = r4.getCategory_name()
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r3.categoryHashMap
            r1.put(r0, r4)
            return
    }

    private void addSeriesToCategory(com.flextv.livestore.models.SeriesModel r4) {
            r3 = this;
            java.lang.String r0 = r4.getCategory_name()
            java.lang.String r0 = r3.getKeyFromCategoryName(r0)
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r3.categoryHashMap
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L33
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            long r1 = r1.getTime()
            r0.append(r1)
            java.lang.String r1 = "!@#%"
            r0.append(r1)
            java.lang.String r1 = r4.getCategory_name()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L33:
            java.lang.String r4 = r4.getCategory_name()
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r3.categoryHashMap
            r1.put(r0, r4)
            return
    }

    private void authentication(java.lang.String r4) {
            r3 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = r3.preferenceHelper     // Catch: java.lang.Exception -> L1b
            java.lang.String r0 = r0.getSharedPreferenceServerUrl()     // Catch: java.lang.Exception -> L1b
            com.flextv.livestore.remote.APIService r0 = com.flextv.livestore.remote.RetroClass.getAPIService(r0)     // Catch: java.lang.Exception -> L1b
            java.lang.String r1 = r3.user     // Catch: java.lang.Exception -> L1b
            java.lang.String r2 = r3.password     // Catch: java.lang.Exception -> L1b
            retrofit2.Call r0 = r0.authentication(r1, r2)     // Catch: java.lang.Exception -> L1b
            com.flextv.livestore.apps.BaseActivity$1 r1 = new com.flextv.livestore.apps.BaseActivity$1     // Catch: java.lang.Exception -> L1b
            r1.<init>(r3, r4)     // Catch: java.lang.Exception -> L1b
            r0.enqueue(r1)     // Catch: java.lang.Exception -> L1b
            goto L2b
        L1b:
            boolean r0 = r3.is_stop
            if (r0 != 0) goto L2b
            com.flextv.livestore.helper.PreferenceHelper r0 = r3.preferenceHelper
            r1 = 1
            r0.setSharedPreferenceISM3U(r1)
            com.flextv.livestore.models.WordModels r0 = r3.wordModels
            r3.reloadM3UData(r4, r0)
        L2b:
            return
    }

    private void fetchM3UItems(java.lang.String r3) {
            r2 = this;
            com.flextv.livestore.net.NetworkTask<java.lang.Void, java.lang.Void, java.util.List<iptv.m3u.parser.M3UItem>> r0 = r2.fetchM3uItemsTask
            if (r0 == 0) goto Lf
            boolean r0 = r0.isComplete()
            if (r0 != 0) goto Lf
            com.flextv.livestore.net.NetworkTask<java.lang.Void, java.lang.Void, java.util.List<iptv.m3u.parser.M3UItem>> r0 = r2.fetchM3uItemsTask
            r0.abort()
        Lf:
            com.flextv.livestore.net.FetchM3uItemsTask r0 = new com.flextv.livestore.net.FetchM3uItemsTask
            r1 = 0
            r0.<init>(r3, r1)
            r2.fetchM3uItemsTask = r0
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda3 r3 = new com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda3
            r1 = 2
            r3.<init>(r2, r1)
            r0.setOnCompleteListener(r3)
            com.flextv.livestore.net.NetworkTask<java.lang.Void, java.lang.Void, java.util.List<iptv.m3u.parser.M3UItem>> r3 = r2.fetchM3uItemsTask
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda3 r0 = new com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda3
            r1 = 3
            r0.<init>(r2, r1)
            r3.setOnGenericExceptionListener(r0)
            com.flextv.livestore.net.NetworkTask<java.lang.Void, java.lang.Void, java.util.List<iptv.m3u.parser.M3UItem>> r3 = r2.fetchM3uItemsTask
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda3 r0 = new com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda3
            r1 = 4
            r0.<init>(r2, r1)
            r3.setOnNetworkUnavailableListener(r0)
            com.flextv.livestore.net.NetworkTask<java.lang.Void, java.lang.Void, java.util.List<iptv.m3u.parser.M3UItem>> r3 = r2.fetchM3uItemsTask
            r3.execute()
            return
    }

    private java.lang.String getCategoryNameFromKey(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "!@#%"
            boolean r1 = r3.contains(r0)
            if (r1 == 0) goto L10
            java.lang.String[] r3 = r3.split(r0)
            r0 = 1
            r3 = r3[r0]
            return r3
        L10:
            java.lang.String r3 = "All"
            return r3
    }

    private void getChannelModels() {
            r12 = this;
            io.realm.Realm r0 = r12.realm
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r1 = com.flextv.livestore.models.EPGChannel.class
            io.realm.RealmQuery r0 = r0.where(r1)
            io.realm.RealmResults r3 = r0.findAll()
            com.flextv.livestore.helper.PreferenceHelper r0 = r12.preferenceHelper
            java.util.List r4 = r0.getSharedPreferenceLiveFavChannels()
            com.flextv.livestore.helper.PreferenceHelper r0 = r12.preferenceHelper
            java.util.List r5 = r0.getSharedPreferenceLiveLockChannels()
            int r0 = r3.size()
            if (r0 == 0) goto L4a
            long r0 = java.lang.System.currentTimeMillis()
            r6 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r6
            com.flextv.livestore.helper.PreferenceHelper r2 = r12.preferenceHelper
            long r6 = r2.getSharedPreferenceLastPlaylistDate()
            com.flextv.livestore.helper.PreferenceHelper r2 = r12.preferenceHelper
            int r2 = r2.getSharedPreferenceUpdatePeriod()
            long r8 = (long) r2
            r10 = 72000(0x11940, double:3.55727E-319)
            long r8 = r8 * r10
            long r8 = r8 + r6
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 <= 0) goto L3d
            goto L4a
        L3d:
            boolean r0 = r12.is_stop
            if (r0 != 0) goto L7b
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            r12.getLiveCategoryModels(r0)
            goto L7b
        L4a:
            com.flextv.livestore.net.NetworkTask<java.lang.Void, java.lang.Void, java.util.List<com.flextv.livestore.models.EPGChannel>> r0 = r12.fetchChannelsTask
            if (r0 == 0) goto L59
            boolean r0 = r0.isComplete()
            if (r0 != 0) goto L59
            com.flextv.livestore.net.NetworkTask<java.lang.Void, java.lang.Void, java.util.List<com.flextv.livestore.models.EPGChannel>> r0 = r12.fetchChannelsTask
            r0.abort()
        L59:
            com.flextv.livestore.net.FetchChannelsTask r0 = new com.flextv.livestore.net.FetchChannelsTask
            r0.<init>()
            r12.fetchChannelsTask = r0
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda2 r7 = new com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda2
            r6 = 1
            r1 = r7
            r2 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r0.setOnCompleteListener(r7)
            com.flextv.livestore.net.NetworkTask<java.lang.Void, java.lang.Void, java.util.List<com.flextv.livestore.models.EPGChannel>> r0 = r12.fetchChannelsTask
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda3 r1 = new com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda3
            r2 = 1
            r1.<init>(r12, r2)
            r0.setOnGenericExceptionListener(r1)
            com.flextv.livestore.net.NetworkTask<java.lang.Void, java.lang.Void, java.util.List<com.flextv.livestore.models.EPGChannel>> r0 = r12.fetchChannelsTask
            r0.execute()
        L7b:
            return
    }

    private void getEpisodeModels() {
            r9 = this;
            io.realm.Realm r0 = r9.realm
            java.lang.Class<com.flextv.livestore.models.EpisodeModel> r1 = com.flextv.livestore.models.EpisodeModel.class
            io.realm.RealmQuery r0 = r0.where(r1)
            io.realm.RealmResults r0 = r0.findAll()
            int r1 = r0.size()
            if (r1 == 0) goto L3e
            long r1 = java.lang.System.currentTimeMillis()
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            com.flextv.livestore.helper.PreferenceHelper r3 = r9.preferenceHelper
            long r3 = r3.getSharedPreferenceLastPlaylistDate()
            com.flextv.livestore.helper.PreferenceHelper r5 = r9.preferenceHelper
            int r5 = r5.getSharedPreferenceUpdatePeriod()
            long r5 = (long) r5
            r7 = 72000(0x11940, double:3.55727E-319)
            long r5 = r5 * r7
            long r5 = r5 + r3
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 <= 0) goto L31
            goto L3e
        L31:
            boolean r1 = r9.is_stop
            if (r1 != 0) goto L6d
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r9.getSeriesFromEpisodes(r1)
            goto L6d
        L3e:
            com.flextv.livestore.net.NetworkTask<java.lang.Void, java.lang.Void, java.util.List<com.flextv.livestore.models.EpisodeModel>> r1 = r9.fetchEpisodesTask
            if (r1 == 0) goto L4d
            boolean r1 = r1.isComplete()
            if (r1 != 0) goto L4d
            com.flextv.livestore.net.NetworkTask<java.lang.Void, java.lang.Void, java.util.List<com.flextv.livestore.models.EpisodeModel>> r1 = r9.fetchEpisodesTask
            r1.abort()
        L4d:
            com.flextv.livestore.net.FetchEpisodeTask r1 = new com.flextv.livestore.net.FetchEpisodeTask
            r1.<init>()
            r9.fetchEpisodesTask = r1
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda1 r2 = new com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda1
            r3 = 0
            r2.<init>(r9, r0, r3)
            r1.setOnCompleteListener(r2)
            com.flextv.livestore.net.NetworkTask<java.lang.Void, java.lang.Void, java.util.List<com.flextv.livestore.models.EpisodeModel>> r0 = r9.fetchEpisodesTask
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda3 r1 = new com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda3
            r2 = 5
            r1.<init>(r9, r2)
            r0.setOnGenericExceptionListener(r1)
            com.flextv.livestore.net.NetworkTask<java.lang.Void, java.lang.Void, java.util.List<com.flextv.livestore.models.EpisodeModel>> r0 = r9.fetchEpisodesTask
            r0.execute()
        L6d:
            return
    }

    private java.lang.String getKeyFromCategoryName(java.lang.String r4) {
            r3 = this;
            java.util.TreeSet r0 = new java.util.TreeSet
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r3.categoryHashMap
            java.util.Set r1 = r1.keySet()
            r0.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = r3.getCategoryNameFromKey(r1)
            boolean r2 = r2.equalsIgnoreCase(r4)
            if (r2 == 0) goto Lf
            return r1
        L26:
            r4 = 0
            return r4
    }

    private void getLiveCategory() {
            r3 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = r3.preferenceHelper     // Catch: java.lang.Exception -> L1b
            java.lang.String r0 = r0.getSharedPreferenceServerUrl()     // Catch: java.lang.Exception -> L1b
            com.flextv.livestore.remote.APIService r0 = com.flextv.livestore.remote.RetroClass.getAPIService(r0)     // Catch: java.lang.Exception -> L1b
            java.lang.String r1 = r3.user     // Catch: java.lang.Exception -> L1b
            java.lang.String r2 = r3.password     // Catch: java.lang.Exception -> L1b
            retrofit2.Call r0 = r0.get_live_categories(r1, r2)     // Catch: java.lang.Exception -> L1b
            com.flextv.livestore.apps.BaseActivity$2 r1 = new com.flextv.livestore.apps.BaseActivity$2     // Catch: java.lang.Exception -> L1b
            r1.<init>(r3)     // Catch: java.lang.Exception -> L1b
            r0.enqueue(r1)     // Catch: java.lang.Exception -> L1b
            goto L23
        L1b:
            boolean r0 = r3.is_stop
            if (r0 != 0) goto L23
            r3.getVodCategory()
        L23:
            return
    }

    private void getLiveCategoryModels(java.util.List<com.flextv.livestore.models.EPGChannel> r9) {
            r8 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r8.categoryHashMap = r0
            java.util.Iterator r9 = r9.iterator()
        Lb:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L1b
            java.lang.Object r0 = r9.next()
            com.flextv.livestore.models.EPGChannel r0 = (com.flextv.livestore.models.EPGChannel) r0
            r8.addChannelToCategory(r0)
            goto Lb
        L1b:
            java.util.TreeSet r9 = new java.util.TreeSet
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r8.categoryHashMap
            java.util.Set r0 = r0.keySet()
            r9.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.flextv.livestore.models.CategoryModel r1 = new com.flextv.livestore.models.CategoryModel
            com.flextv.livestore.models.WordModels r2 = r8.wordModels
            java.lang.String r2 = r2.getAdd_group()
            java.lang.String r3 = "add_group"
            r1.<init>(r3, r2)
            r0.add(r1)
            com.flextv.livestore.models.CategoryModel r1 = new com.flextv.livestore.models.CategoryModel
            com.flextv.livestore.models.WordModels r2 = r8.wordModels
            java.lang.String r2 = r2.getRecently_viewed()
            java.lang.String r3 = "resume_id"
            r1.<init>(r3, r2)
            r0.add(r1)
            com.flextv.livestore.models.CategoryModel r1 = new com.flextv.livestore.models.CategoryModel
            com.flextv.livestore.models.WordModels r2 = r8.wordModels
            java.lang.String r2 = r2.getAll()
            java.lang.String r3 = "all_id"
            r1.<init>(r3, r2)
            r0.add(r1)
            com.flextv.livestore.models.CategoryModel r1 = new com.flextv.livestore.models.CategoryModel
            com.flextv.livestore.models.WordModels r2 = r8.wordModels
            java.lang.String r2 = r2.getFavorite()
            java.lang.String r3 = "fav_id"
            r1.<init>(r3, r2)
            r0.add(r1)
            com.flextv.livestore.models.CategoryModel r1 = new com.flextv.livestore.models.CategoryModel
            com.flextv.livestore.models.WordModels r2 = r8.wordModels
            java.lang.String r2 = r2.getLock()
            java.lang.String r3 = "lock_id"
            r1.<init>(r3, r2)
            r0.add(r1)
            r1 = 6000(0x1770, float:8.408E-42)
            com.flextv.livestore.helper.PreferenceHelper r2 = r8.preferenceHelper
            java.util.List r2 = r2.getSharedPreferenceMyGroupCategory()
            r3 = 0
            r4 = 0
        L86:
            int r5 = r2.size()
            if (r4 >= r5) goto La3
            com.flextv.livestore.models.CategoryModel r5 = new com.flextv.livestore.models.CategoryModel
            java.lang.String r6 = java.lang.String.valueOf(r1)
            java.lang.Object r7 = r2.get(r4)
            java.lang.String r7 = (java.lang.String) r7
            r5.<init>(r6, r7)
            r0.add(r5)
            int r1 = r1 + 1000
            int r4 = r4 + 1
            goto L86
        La3:
            java.util.Iterator r9 = r9.iterator()
        La7:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto Lc2
            java.lang.Object r1 = r9.next()
            java.lang.String r1 = (java.lang.String) r1
            com.flextv.livestore.models.CategoryModel r2 = new com.flextv.livestore.models.CategoryModel
            java.lang.String r4 = java.lang.String.valueOf(r3)
            r2.<init>(r4, r1)
            r0.add(r2)
            int r3 = r3 + 1
            goto La7
        Lc2:
            com.flextv.livestore.helper.PreferenceHelper r9 = r8.preferenceHelper
            r9.setSharedPreferenceLiveCategory(r0)
            boolean r9 = r8.is_stop
            if (r9 != 0) goto Lce
            r8.getMovieModels()
        Lce:
            return
    }

    private void getLiveStreams() {
            r8 = this;
            io.realm.Realm r0 = r8.realm
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r1 = com.flextv.livestore.models.EPGChannel.class
            io.realm.RealmQuery r0 = r0.where(r1)
            io.realm.RealmResults r0 = r0.findAll()
            int r0 = r0.size()
            if (r0 == 0) goto L39
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            com.flextv.livestore.helper.PreferenceHelper r2 = r8.preferenceHelper
            long r2 = r2.getSharedPreferenceLastPlaylistDate()
            com.flextv.livestore.helper.PreferenceHelper r4 = r8.preferenceHelper
            int r4 = r4.getSharedPreferenceUpdatePeriod()
            long r4 = (long) r4
            r6 = 72000(0x11940, double:3.55727E-319)
            long r4 = r4 * r6
            long r4 = r4 + r2
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 <= 0) goto L31
            goto L39
        L31:
            boolean r0 = r8.is_stop
            if (r0 != 0) goto L68
            r8.getVodStreams()
            goto L68
        L39:
            com.flextv.livestore.helper.PreferenceHelper r0 = r8.preferenceHelper
            java.util.List r0 = r0.getSharedPreferenceLiveFavChannels()
            com.flextv.livestore.helper.PreferenceHelper r1 = r8.preferenceHelper
            java.util.List r1 = r1.getSharedPreferenceLiveLockChannels()
            com.flextv.livestore.helper.PreferenceHelper r2 = r8.preferenceHelper     // Catch: java.lang.Exception -> L60
            java.lang.String r2 = r2.getSharedPreferenceServerUrl()     // Catch: java.lang.Exception -> L60
            com.flextv.livestore.remote.APIService r2 = com.flextv.livestore.remote.RetroClass.getAPIService(r2)     // Catch: java.lang.Exception -> L60
            java.lang.String r3 = r8.user     // Catch: java.lang.Exception -> L60
            java.lang.String r4 = r8.password     // Catch: java.lang.Exception -> L60
            retrofit2.Call r2 = r2.get_live_streams(r3, r4)     // Catch: java.lang.Exception -> L60
            com.flextv.livestore.apps.BaseActivity$5 r3 = new com.flextv.livestore.apps.BaseActivity$5     // Catch: java.lang.Exception -> L60
            r3.<init>(r8, r0, r1)     // Catch: java.lang.Exception -> L60
            r2.enqueue(r3)     // Catch: java.lang.Exception -> L60
            goto L68
        L60:
            boolean r0 = r8.is_stop
            if (r0 != 0) goto L68
            r8.getSecondLiveStreams()
        L68:
            return
    }

    private int getMediaType(iptv.m3u.parser.M3UItem r2) {
            r1 = this;
            java.lang.String r2 = r2.getStreamURL()
            if (r2 == 0) goto L4e
            int r0 = r2.length()
            if (r0 <= 0) goto L4e
            java.lang.String r0 = "movie/"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L4c
            java.lang.String r0 = "=movie"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L4c
            java.lang.String r0 = "==movie"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L4c
            java.lang.String r0 = "movies/"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L4c
            java.lang.String r0 = "vod/"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L4c
            java.lang.String r0 = "video/"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L3f
            goto L4c
        L3f:
            java.lang.String r0 = "series/"
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L4a
            r2 = 2
            goto L4f
        L4a:
            r2 = 0
            goto L4f
        L4c:
            r2 = 1
            goto L4f
        L4e:
            r2 = -1
        L4f:
            return r2
    }

    private void getMovieCategoryModels(java.util.List<com.flextv.livestore.models.MovieModel> r6) {
            r5 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r5.categoryHashMap = r0
            java.util.Iterator r6 = r6.iterator()
        Lb:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L1b
            java.lang.Object r0 = r6.next()
            com.flextv.livestore.models.MovieModel r0 = (com.flextv.livestore.models.MovieModel) r0
            r5.addMovieToCategory(r0)
            goto Lb
        L1b:
            java.util.TreeSet r6 = new java.util.TreeSet
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r5.categoryHashMap
            java.util.Set r0 = r0.keySet()
            r6.<init>(r0)
            r0 = 0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.flextv.livestore.models.CategoryModel r2 = new com.flextv.livestore.models.CategoryModel
            com.flextv.livestore.models.WordModels r3 = r5.wordModels
            java.lang.String r3 = r3.getResume_to_watch()
            java.lang.String r4 = "resume_id"
            r2.<init>(r4, r3)
            r1.add(r2)
            com.flextv.livestore.models.CategoryModel r2 = new com.flextv.livestore.models.CategoryModel
            com.flextv.livestore.models.WordModels r3 = r5.wordModels
            java.lang.String r3 = r3.getAll()
            java.lang.String r4 = "all_id"
            r2.<init>(r4, r3)
            r1.add(r2)
            com.flextv.livestore.models.CategoryModel r2 = new com.flextv.livestore.models.CategoryModel
            com.flextv.livestore.models.WordModels r3 = r5.wordModels
            java.lang.String r3 = r3.getFavorite()
            java.lang.String r4 = "fav_id"
            r2.<init>(r4, r3)
            r1.add(r2)
            java.util.Iterator r6 = r6.iterator()
        L61:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L7c
            java.lang.Object r2 = r6.next()
            java.lang.String r2 = (java.lang.String) r2
            com.flextv.livestore.models.CategoryModel r3 = new com.flextv.livestore.models.CategoryModel
            java.lang.String r4 = java.lang.String.valueOf(r0)
            r3.<init>(r4, r2)
            r1.add(r3)
            int r0 = r0 + 1
            goto L61
        L7c:
            com.flextv.livestore.helper.PreferenceHelper r6 = r5.preferenceHelper
            r6.setSharedPreferenceVodCategory(r1)
            boolean r6 = r5.is_stop
            if (r6 != 0) goto L88
            r5.getEpisodeModels()
        L88:
            return
    }

    private void getMovieModels() {
            r12 = this;
            io.realm.Realm r0 = r12.realm
            java.lang.Class<com.flextv.livestore.models.MovieModel> r1 = com.flextv.livestore.models.MovieModel.class
            io.realm.RealmQuery r0 = r0.where(r1)
            io.realm.RealmResults r3 = r0.findAll()
            com.flextv.livestore.helper.PreferenceHelper r0 = r12.preferenceHelper
            java.util.List r4 = r0.getSharedPreferenceVodFavNames()
            com.flextv.livestore.helper.PreferenceHelper r0 = r12.preferenceHelper
            java.util.List r5 = r0.getSharedPreferenceResumeModel()
            int r0 = r3.size()
            if (r0 == 0) goto L4a
            long r0 = java.lang.System.currentTimeMillis()
            r6 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r6
            com.flextv.livestore.helper.PreferenceHelper r2 = r12.preferenceHelper
            long r6 = r2.getSharedPreferenceLastPlaylistDate()
            com.flextv.livestore.helper.PreferenceHelper r2 = r12.preferenceHelper
            int r2 = r2.getSharedPreferenceUpdatePeriod()
            long r8 = (long) r2
            r10 = 72000(0x11940, double:3.55727E-319)
            long r8 = r8 * r10
            long r8 = r8 + r6
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 <= 0) goto L3d
            goto L4a
        L3d:
            boolean r0 = r12.is_stop
            if (r0 != 0) goto L7b
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            r12.getMovieCategoryModels(r0)
            goto L7b
        L4a:
            com.flextv.livestore.net.NetworkTask<java.lang.Void, java.lang.Void, java.util.List<com.flextv.livestore.models.MovieModel>> r0 = r12.fetchVideosTask
            if (r0 == 0) goto L59
            boolean r0 = r0.isComplete()
            if (r0 != 0) goto L59
            com.flextv.livestore.net.NetworkTask<java.lang.Void, java.lang.Void, java.util.List<com.flextv.livestore.models.MovieModel>> r0 = r12.fetchVideosTask
            r0.abort()
        L59:
            com.flextv.livestore.net.FetchVideosTask r0 = new com.flextv.livestore.net.FetchVideosTask
            r0.<init>()
            r12.fetchVideosTask = r0
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda2 r7 = new com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda2
            r6 = 0
            r1 = r7
            r2 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r0.setOnCompleteListener(r7)
            com.flextv.livestore.net.NetworkTask<java.lang.Void, java.lang.Void, java.util.List<com.flextv.livestore.models.MovieModel>> r0 = r12.fetchVideosTask
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda3 r1 = new com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda3
            r2 = 0
            r1.<init>(r12, r2)
            r0.setOnGenericExceptionListener(r1)
            com.flextv.livestore.net.NetworkTask<java.lang.Void, java.lang.Void, java.util.List<com.flextv.livestore.models.MovieModel>> r0 = r12.fetchVideosTask
            r0.execute()
        L7b:
            return
    }

    private void getSecondLiveStreams() {
            r5 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = r5.preferenceHelper
            java.util.List r0 = r0.getSharedPreferenceLiveFavChannels()
            com.flextv.livestore.helper.PreferenceHelper r1 = r5.preferenceHelper
            java.util.List r1 = r1.getSharedPreferenceLiveLockChannels()
            com.flextv.livestore.helper.PreferenceHelper r2 = r5.preferenceHelper     // Catch: java.lang.Exception -> L27
            java.lang.String r2 = r2.getSharedPreferenceServerUrl()     // Catch: java.lang.Exception -> L27
            com.flextv.livestore.remote.APIService r2 = com.flextv.livestore.remote.RetroClass.getAPIService(r2)     // Catch: java.lang.Exception -> L27
            java.lang.String r3 = r5.user     // Catch: java.lang.Exception -> L27
            java.lang.String r4 = r5.password     // Catch: java.lang.Exception -> L27
            retrofit2.Call r2 = r2.get_second_live_streams(r3, r4)     // Catch: java.lang.Exception -> L27
            com.flextv.livestore.apps.BaseActivity$6 r3 = new com.flextv.livestore.apps.BaseActivity$6     // Catch: java.lang.Exception -> L27
            r3.<init>(r5, r0, r1)     // Catch: java.lang.Exception -> L27
            r2.enqueue(r3)     // Catch: java.lang.Exception -> L27
            goto L2f
        L27:
            boolean r0 = r5.is_stop
            if (r0 != 0) goto L2f
            r5.getSecondVodStreams()
        L2f:
            return
    }

    private void getSecondSeriesStreams() {
            r5 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = r5.preferenceHelper
            java.util.List r0 = r0.getSharedPreferenceSeriesFavNames()
            com.flextv.livestore.helper.PreferenceHelper r1 = r5.preferenceHelper
            java.util.List r1 = r1.getSharedPreferenceRecentSeriesNames()
            com.flextv.livestore.helper.PreferenceHelper r2 = r5.preferenceHelper     // Catch: java.lang.Exception -> L27
            java.lang.String r2 = r2.getSharedPreferenceServerUrl()     // Catch: java.lang.Exception -> L27
            com.flextv.livestore.remote.APIService r2 = com.flextv.livestore.remote.RetroClass.getAPIService(r2)     // Catch: java.lang.Exception -> L27
            java.lang.String r3 = r5.user     // Catch: java.lang.Exception -> L27
            java.lang.String r4 = r5.password     // Catch: java.lang.Exception -> L27
            retrofit2.Call r2 = r2.get_second_series(r3, r4)     // Catch: java.lang.Exception -> L27
            com.flextv.livestore.apps.BaseActivity$10 r3 = new com.flextv.livestore.apps.BaseActivity$10     // Catch: java.lang.Exception -> L27
            r3.<init>(r5, r0, r1)     // Catch: java.lang.Exception -> L27
            r2.enqueue(r3)     // Catch: java.lang.Exception -> L27
            goto L30
        L27:
            boolean r0 = r5.is_stop
            if (r0 != 0) goto L30
            r0 = 1
            r5.doNextTask(r0)
        L30:
            return
    }

    private void getSecondVodStreams() {
            r5 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = r5.preferenceHelper
            java.util.List r0 = r0.getSharedPreferenceVodFavNames()
            com.flextv.livestore.helper.PreferenceHelper r1 = r5.preferenceHelper
            java.util.List r1 = r1.getSharedPreferenceResumeModel()
            com.flextv.livestore.helper.PreferenceHelper r2 = r5.preferenceHelper     // Catch: java.lang.Exception -> L27
            java.lang.String r2 = r2.getSharedPreferenceServerUrl()     // Catch: java.lang.Exception -> L27
            com.flextv.livestore.remote.APIService r2 = com.flextv.livestore.remote.RetroClass.getAPIService(r2)     // Catch: java.lang.Exception -> L27
            java.lang.String r3 = r5.user     // Catch: java.lang.Exception -> L27
            java.lang.String r4 = r5.password     // Catch: java.lang.Exception -> L27
            retrofit2.Call r2 = r2.get_second_vod_streams(r3, r4)     // Catch: java.lang.Exception -> L27
            com.flextv.livestore.apps.BaseActivity$8 r3 = new com.flextv.livestore.apps.BaseActivity$8     // Catch: java.lang.Exception -> L27
            r3.<init>(r5, r0, r1)     // Catch: java.lang.Exception -> L27
            r2.enqueue(r3)     // Catch: java.lang.Exception -> L27
            goto L2f
        L27:
            boolean r0 = r5.is_stop
            if (r0 != 0) goto L2f
            r5.getSecondSeriesStreams()
        L2f:
            return
    }

    private void getSeriesCategory() {
            r3 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = r3.preferenceHelper     // Catch: java.lang.Exception -> L1b
            java.lang.String r0 = r0.getSharedPreferenceServerUrl()     // Catch: java.lang.Exception -> L1b
            com.flextv.livestore.remote.APIService r0 = com.flextv.livestore.remote.RetroClass.getAPIService(r0)     // Catch: java.lang.Exception -> L1b
            java.lang.String r1 = r3.user     // Catch: java.lang.Exception -> L1b
            java.lang.String r2 = r3.password     // Catch: java.lang.Exception -> L1b
            retrofit2.Call r0 = r0.get_series_categories(r1, r2)     // Catch: java.lang.Exception -> L1b
            com.flextv.livestore.apps.BaseActivity$4 r1 = new com.flextv.livestore.apps.BaseActivity$4     // Catch: java.lang.Exception -> L1b
            r1.<init>(r3)     // Catch: java.lang.Exception -> L1b
            r0.enqueue(r1)     // Catch: java.lang.Exception -> L1b
            goto L23
        L1b:
            boolean r0 = r3.is_stop
            if (r0 != 0) goto L23
            r3.getLiveStreams()
        L23:
            return
    }

    private void getSeriesCategoryModels(java.util.List<com.flextv.livestore.models.SeriesModel> r7) {
            r6 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r6.categoryHashMap = r0
            java.util.Iterator r7 = r7.iterator()
        Lb:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L1b
            java.lang.Object r0 = r7.next()
            com.flextv.livestore.models.SeriesModel r0 = (com.flextv.livestore.models.SeriesModel) r0
            r6.addSeriesToCategory(r0)
            goto Lb
        L1b:
            java.util.HashMap<java.lang.String, java.lang.String> r7 = r6.categoryHashMap
            r7.keySet()
            java.util.TreeSet r7 = new java.util.TreeSet
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r6.categoryHashMap
            java.util.Set r0 = r0.keySet()
            r7.<init>(r0)
            r0 = 0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.flextv.livestore.models.CategoryModel r2 = new com.flextv.livestore.models.CategoryModel
            com.flextv.livestore.models.WordModels r3 = r6.wordModels
            java.lang.String r3 = r3.getRecently_viewed()
            java.lang.String r4 = "resume_id"
            r2.<init>(r4, r3)
            r1.add(r2)
            com.flextv.livestore.models.CategoryModel r2 = new com.flextv.livestore.models.CategoryModel
            com.flextv.livestore.models.WordModels r3 = r6.wordModels
            java.lang.String r3 = r3.getAll()
            java.lang.String r4 = "all_id"
            r2.<init>(r4, r3)
            r1.add(r2)
            com.flextv.livestore.models.CategoryModel r2 = new com.flextv.livestore.models.CategoryModel
            com.flextv.livestore.models.WordModels r3 = r6.wordModels
            java.lang.String r3 = r3.getFavorite()
            java.lang.String r4 = "fav_id"
            r2.<init>(r4, r3)
            r1.add(r2)
            java.util.Iterator r7 = r7.iterator()
        L66:
            boolean r2 = r7.hasNext()
            r3 = 1
            if (r2 == 0) goto L81
            java.lang.Object r2 = r7.next()
            java.lang.String r2 = (java.lang.String) r2
            com.flextv.livestore.models.CategoryModel r4 = new com.flextv.livestore.models.CategoryModel
            java.lang.String r5 = java.lang.String.valueOf(r0)
            r4.<init>(r5, r2)
            r1.add(r4)
            int r0 = r0 + r3
            goto L66
        L81:
            com.flextv.livestore.helper.PreferenceHelper r7 = r6.preferenceHelper
            r7.setSharedPreferenceSeriesCategory(r1)
            com.flextv.livestore.helper.PreferenceHelper r7 = r6.preferenceHelper
            long r0 = java.lang.System.currentTimeMillis()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r4
            r7.setSharedPreferenceLastPlaylistDate(r0)
            boolean r7 = r6.is_stop
            if (r7 != 0) goto L99
            r6.doNextTask(r3)
        L99:
            return
    }

    private void getSeriesFromEpisodes(java.util.List<com.flextv.livestore.models.EpisodeModel> r8) {
            r7 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = r7.preferenceHelper
            java.util.List r0 = r0.getSharedPreferenceSeriesFavNames()
            com.flextv.livestore.helper.PreferenceHelper r1 = r7.preferenceHelper
            java.util.List r1 = r1.getSharedPreferenceRecentSeriesNames()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r7.episodeModelHashMap = r2
            java.util.Iterator r8 = r8.iterator()
        L17:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L27
            java.lang.Object r2 = r8.next()
            com.flextv.livestore.models.EpisodeModel r2 = (com.flextv.livestore.models.EpisodeModel) r2
            r7.addEpisodeToSeries(r2)
            goto L17
        L27:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.HashMap<java.lang.String, java.util.List<com.flextv.livestore.models.EpisodeModel>> r2 = r7.episodeModelHashMap
            r2.keySet()
            java.util.TreeSet r2 = new java.util.TreeSet
            java.util.HashMap<java.lang.String, java.util.List<com.flextv.livestore.models.EpisodeModel>> r3 = r7.episodeModelHashMap
            java.util.Set r3 = r3.keySet()
            r2.<init>(r3)
            java.util.Iterator r2 = r2.iterator()
        L40:
            boolean r3 = r2.hasNext()
            r4 = 0
            if (r3 == 0) goto L85
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L40
            java.util.HashMap<java.lang.String, java.util.List<com.flextv.livestore.models.EpisodeModel>> r5 = r7.episodeModelHashMap
            java.lang.Object r5 = r5.get(r3)
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L40
            int r6 = r5.size()
            if (r6 <= 0) goto L40
            com.flextv.livestore.models.SeriesModel r6 = new com.flextv.livestore.models.SeriesModel
            r6.<init>()
            r6.setName(r3)
            java.lang.Object r3 = r5.get(r4)
            com.flextv.livestore.models.EpisodeModel r3 = (com.flextv.livestore.models.EpisodeModel) r3
            java.lang.String r3 = r3.getCategory_name()
            r6.setCategory_name(r3)
            java.lang.Object r3 = r5.get(r4)
            com.flextv.livestore.models.EpisodeModel r3 = (com.flextv.livestore.models.EpisodeModel) r3
            java.lang.String r3 = r3.getStream_icon()
            r6.setStream_icon(r3)
            r8.add(r6)
            goto L40
        L85:
            io.realm.Realm r2 = r7.realm
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda7 r3 = new com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda7
            r5 = 3
            r3.<init>(r8, r5)
            r2.executeTransaction(r3)
            int r2 = r0.size()
            if (r2 <= 0) goto Lb3
            java.util.Iterator r0 = r0.iterator()
        L9a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lb3
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            io.realm.Realm r3 = r7.realm
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda6 r5 = new com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda6
            r6 = 11
            r5.<init>(r2, r6)
            r3.executeTransaction(r5)
            goto L9a
        Lb3:
            int r0 = r1.size()
            if (r0 <= 0) goto Ld4
            java.util.Iterator r0 = r1.iterator()
        Lbd:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Ld4
            java.lang.Object r1 = r0.next()
            com.flextv.livestore.models.ResumeSeriesModel r1 = (com.flextv.livestore.models.ResumeSeriesModel) r1
            io.realm.Realm r2 = r7.realm
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda5 r3 = new com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda5
            r3.<init>(r1, r4)
            r2.executeTransaction(r3)
            goto Lbd
        Ld4:
            r7.getSeriesCategoryModels(r8)
            return
    }

    private void getSeriesStreams() {
            r10 = this;
            io.realm.Realm r0 = r10.realm
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r1 = com.flextv.livestore.models.SeriesModel.class
            io.realm.RealmQuery r0 = r0.where(r1)
            io.realm.RealmResults r0 = r0.findAll()
            int r0 = r0.size()
            r1 = 1
            if (r0 == 0) goto L3a
            long r2 = java.lang.System.currentTimeMillis()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            com.flextv.livestore.helper.PreferenceHelper r0 = r10.preferenceHelper
            long r4 = r0.getSharedPreferenceLastPlaylistDate()
            com.flextv.livestore.helper.PreferenceHelper r0 = r10.preferenceHelper
            int r0 = r0.getSharedPreferenceUpdatePeriod()
            long r6 = (long) r0
            r8 = 72000(0x11940, double:3.55727E-319)
            long r6 = r6 * r8
            long r6 = r6 + r4
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 <= 0) goto L32
            goto L3a
        L32:
            boolean r0 = r10.is_stop
            if (r0 != 0) goto L69
            r10.doNextTask(r1)
            goto L69
        L3a:
            com.flextv.livestore.helper.PreferenceHelper r0 = r10.preferenceHelper
            java.util.List r0 = r0.getSharedPreferenceSeriesFavNames()
            com.flextv.livestore.helper.PreferenceHelper r2 = r10.preferenceHelper
            java.util.List r2 = r2.getSharedPreferenceRecentSeriesNames()
            com.flextv.livestore.helper.PreferenceHelper r3 = r10.preferenceHelper     // Catch: java.lang.Exception -> L61
            java.lang.String r3 = r3.getSharedPreferenceServerUrl()     // Catch: java.lang.Exception -> L61
            com.flextv.livestore.remote.APIService r3 = com.flextv.livestore.remote.RetroClass.getAPIService(r3)     // Catch: java.lang.Exception -> L61
            java.lang.String r4 = r10.user     // Catch: java.lang.Exception -> L61
            java.lang.String r5 = r10.password     // Catch: java.lang.Exception -> L61
            retrofit2.Call r3 = r3.get_series(r4, r5)     // Catch: java.lang.Exception -> L61
            com.flextv.livestore.apps.BaseActivity$9 r4 = new com.flextv.livestore.apps.BaseActivity$9     // Catch: java.lang.Exception -> L61
            r4.<init>(r10, r0, r2)     // Catch: java.lang.Exception -> L61
            r3.enqueue(r4)     // Catch: java.lang.Exception -> L61
            goto L69
        L61:
            boolean r0 = r10.is_stop
            if (r0 != 0) goto L69
            r10.doNextTask(r1)
        L69:
            return
    }

    private void getVodCategory() {
            r3 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = r3.preferenceHelper     // Catch: java.lang.Exception -> L1b
            java.lang.String r0 = r0.getSharedPreferenceServerUrl()     // Catch: java.lang.Exception -> L1b
            com.flextv.livestore.remote.APIService r0 = com.flextv.livestore.remote.RetroClass.getAPIService(r0)     // Catch: java.lang.Exception -> L1b
            java.lang.String r1 = r3.user     // Catch: java.lang.Exception -> L1b
            java.lang.String r2 = r3.password     // Catch: java.lang.Exception -> L1b
            retrofit2.Call r0 = r0.get_vod_categories(r1, r2)     // Catch: java.lang.Exception -> L1b
            com.flextv.livestore.apps.BaseActivity$3 r1 = new com.flextv.livestore.apps.BaseActivity$3     // Catch: java.lang.Exception -> L1b
            r1.<init>(r3)     // Catch: java.lang.Exception -> L1b
            r0.enqueue(r1)     // Catch: java.lang.Exception -> L1b
            goto L23
        L1b:
            boolean r0 = r3.is_stop
            if (r0 != 0) goto L23
            r3.getSeriesCategory()
        L23:
            return
    }

    private void getVodStreams() {
            r8 = this;
            io.realm.Realm r0 = r8.realm
            java.lang.Class<com.flextv.livestore.models.MovieModel> r1 = com.flextv.livestore.models.MovieModel.class
            io.realm.RealmQuery r0 = r0.where(r1)
            io.realm.RealmResults r0 = r0.findAll()
            int r0 = r0.size()
            if (r0 == 0) goto L39
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            com.flextv.livestore.helper.PreferenceHelper r2 = r8.preferenceHelper
            long r2 = r2.getSharedPreferenceLastPlaylistDate()
            com.flextv.livestore.helper.PreferenceHelper r4 = r8.preferenceHelper
            int r4 = r4.getSharedPreferenceUpdatePeriod()
            long r4 = (long) r4
            r6 = 72000(0x11940, double:3.55727E-319)
            long r4 = r4 * r6
            long r4 = r4 + r2
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 <= 0) goto L31
            goto L39
        L31:
            boolean r0 = r8.is_stop
            if (r0 != 0) goto L68
            r8.getSeriesStreams()
            goto L68
        L39:
            com.flextv.livestore.helper.PreferenceHelper r0 = r8.preferenceHelper
            java.util.List r0 = r0.getSharedPreferenceVodFavNames()
            com.flextv.livestore.helper.PreferenceHelper r1 = r8.preferenceHelper
            java.util.List r1 = r1.getSharedPreferenceResumeModel()
            com.flextv.livestore.helper.PreferenceHelper r2 = r8.preferenceHelper     // Catch: java.lang.Exception -> L60
            java.lang.String r2 = r2.getSharedPreferenceServerUrl()     // Catch: java.lang.Exception -> L60
            com.flextv.livestore.remote.APIService r2 = com.flextv.livestore.remote.RetroClass.getAPIService(r2)     // Catch: java.lang.Exception -> L60
            java.lang.String r3 = r8.user     // Catch: java.lang.Exception -> L60
            java.lang.String r4 = r8.password     // Catch: java.lang.Exception -> L60
            retrofit2.Call r2 = r2.get_vod_streams(r3, r4)     // Catch: java.lang.Exception -> L60
            com.flextv.livestore.apps.BaseActivity$7 r3 = new com.flextv.livestore.apps.BaseActivity$7     // Catch: java.lang.Exception -> L60
            r3.<init>(r8, r0, r1)     // Catch: java.lang.Exception -> L60
            r2.enqueue(r3)     // Catch: java.lang.Exception -> L60
            goto L68
        L60:
            boolean r0 = r8.is_stop
            if (r0 != 0) goto L68
            r8.getSeriesStreams()
        L68:
            return
    }

    public static synchronized boolean isBusy() {
            java.lang.Class<com.flextv.livestore.apps.BaseActivity> r0 = com.flextv.livestore.apps.BaseActivity.class
            monitor-enter(r0)
            boolean r1 = com.flextv.livestore.apps.BaseActivity.busy     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    private /* synthetic */ void lambda$fetchM3UItems$3(java.util.List r3) {
            r2 = this;
            int r0 = r3.size()
            r1 = 0
            if (r0 != 0) goto L2b
            android.content.Context r3 = r2.getApplicationContext()
            com.flextv.livestore.models.WordModels r0 = r2.wordModels
            java.lang.String r0 = r0.getUser_incorrect()
            android.widget.Toast r3 = android.widget.Toast.makeText(r3, r0, r1)
            r3.show()
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<com.flextv.livestore.activities.ChangePlaylistActivity> r0 = com.flextv.livestore.activities.ChangePlaylistActivity.class
            r3.<init>(r2, r0)
            java.lang.String r0 = "is_home"
            r3.putExtra(r0, r1)
            r2.startActivity(r3)
            r2.finish()
            goto L35
        L2b:
            boolean r0 = r2.is_stop
            if (r0 != 0) goto L35
            r2.prepareData(r3)
            r2.getChannelModels()
        L35:
            setBusy(r1)
            return
    }

    private /* synthetic */ void lambda$fetchM3UItems$4(java.lang.Exception r3) {
            r2 = this;
            boolean r3 = r2.is_stop
            r0 = 0
            if (r3 != 0) goto L28
            android.content.Context r3 = r2.getApplicationContext()
            com.flextv.livestore.models.WordModels r1 = r2.wordModels
            java.lang.String r1 = r1.getUser_incorrect()
            android.widget.Toast r3 = android.widget.Toast.makeText(r3, r1, r0)
            r3.show()
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<com.flextv.livestore.activities.ChangePlaylistActivity> r1 = com.flextv.livestore.activities.ChangePlaylistActivity.class
            r3.<init>(r2, r1)
            java.lang.String r1 = "is_home"
            r3.putExtra(r1, r0)
            r2.startActivity(r3)
            r2.finish()
        L28:
            setBusy(r0)
            return
    }

    private /* synthetic */ void lambda$fetchM3UItems$5(android.accounts.NetworkErrorException r3) {
            r2 = this;
            boolean r3 = r2.is_stop
            r0 = 0
            if (r3 != 0) goto L28
            android.content.Context r3 = r2.getApplicationContext()
            com.flextv.livestore.models.WordModels r1 = r2.wordModels
            java.lang.String r1 = r1.getUser_incorrect()
            android.widget.Toast r3 = android.widget.Toast.makeText(r3, r1, r0)
            r3.show()
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<com.flextv.livestore.activities.ChangePlaylistActivity> r1 = com.flextv.livestore.activities.ChangePlaylistActivity.class
            r3.<init>(r2, r1)
            java.lang.String r1 = "is_home"
            r3.putExtra(r1, r0)
            r2.startActivity(r3)
            r2.finish()
        L28:
            setBusy(r0)
            return
    }

    private /* synthetic */ void lambda$getChannelModels$10(java.lang.Exception r1) {
            r0 = this;
            r0.getMovieModels()
            return
    }

    private static /* synthetic */ void lambda$getChannelModels$6(java.util.List r1, io.realm.Realm r2) {
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r0 = com.flextv.livestore.models.EPGChannel.class
            io.realm.RealmQuery r0 = r2.where(r0)
            io.realm.RealmResults r0 = r0.findAll()
            r0.deleteAllFromRealm()
            r2.insertOrUpdate(r1)
            return
    }

    private static /* synthetic */ void lambda$getChannelModels$7(java.lang.String r2, io.realm.Realm r3) {
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r0 = com.flextv.livestore.models.EPGChannel.class
            java.lang.String r1 = "name"
            java.lang.Object r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r0, r1, r2)
            com.flextv.livestore.models.EPGChannel r2 = (com.flextv.livestore.models.EPGChannel) r2
            if (r2 == 0) goto L10
            r3 = 1
            r2.setIs_favorite(r3)
        L10:
            return
    }

    private static /* synthetic */ void lambda$getChannelModels$8(java.lang.String r2, io.realm.Realm r3) {
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r0 = com.flextv.livestore.models.EPGChannel.class
            java.lang.String r1 = "name"
            java.lang.Object r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r0, r1, r2)
            com.flextv.livestore.models.EPGChannel r2 = (com.flextv.livestore.models.EPGChannel) r2
            if (r2 == 0) goto L10
            r3 = 1
            r2.setIs_locked(r3)
        L10:
            return
    }

    private /* synthetic */ void lambda$getChannelModels$9(io.realm.RealmResults r4, java.util.List r5, java.util.List r6, java.util.List r7) {
            r3 = this;
            int r4 = r4.size()
            int r0 = r7.size()
            if (r4 == r0) goto L59
            io.realm.Realm r4 = r3.realm
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda7 r0 = new com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda7
            r1 = 0
            r0.<init>(r7, r1)
            r4.executeTransaction(r0)
            int r4 = r5.size()
            if (r4 <= 0) goto L36
            java.util.Iterator r4 = r5.iterator()
        L1f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L36
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            io.realm.Realm r0 = r3.realm
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda6 r2 = new com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda6
            r2.<init>(r5, r1)
            r0.executeTransaction(r2)
            goto L1f
        L36:
            int r4 = r6.size()
            if (r4 <= 0) goto L59
            java.util.Iterator r4 = r6.iterator()
        L40:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L59
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            io.realm.Realm r6 = r3.realm
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda6 r0 = new com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda6
            r1 = 9
            r0.<init>(r5, r1)
            r6.executeTransaction(r0)
            goto L40
        L59:
            boolean r4 = r3.is_stop
            if (r4 != 0) goto L60
            r3.getLiveCategoryModels(r7)
        L60:
            return
    }

    private static /* synthetic */ void lambda$getEpisodeModels$16(java.util.List r1, io.realm.Realm r2) {
            java.lang.Class<com.flextv.livestore.models.EpisodeModel> r0 = com.flextv.livestore.models.EpisodeModel.class
            io.realm.RealmQuery r0 = r2.where(r0)
            io.realm.RealmResults r0 = r0.findAll()
            r0.deleteAllFromRealm()
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r0 = com.flextv.livestore.models.SeriesModel.class
            io.realm.RealmQuery r0 = r2.where(r0)
            io.realm.RealmResults r0 = r0.findAll()
            r0.deleteAllFromRealm()
            r2.insertOrUpdate(r1)
            return
    }

    private /* synthetic */ void lambda$getEpisodeModels$17(io.realm.RealmResults r3, java.util.List r4) {
            r2 = this;
            int r3 = r3.size()
            int r0 = r4.size()
            if (r3 == r0) goto L15
            io.realm.Realm r3 = r2.realm
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda7 r0 = new com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda7
            r1 = 2
            r0.<init>(r4, r1)
            r3.executeTransaction(r0)
        L15:
            boolean r3 = r2.is_stop
            if (r3 != 0) goto L1c
            r2.getSeriesFromEpisodes(r4)
        L1c:
            return
    }

    private /* synthetic */ void lambda$getEpisodeModels$18(java.lang.Exception r1) {
            r0 = this;
            r1 = 0
            setBusy(r1)
            boolean r1 = r0.is_stop
            if (r1 != 0) goto Lc
            r1 = 1
            r0.doNextTask(r1)
        Lc:
            return
    }

    private static /* synthetic */ void lambda$getMovieModels$11(java.util.List r1, io.realm.Realm r2) {
            java.lang.Class<com.flextv.livestore.models.MovieModel> r0 = com.flextv.livestore.models.MovieModel.class
            io.realm.RealmQuery r0 = r2.where(r0)
            io.realm.RealmResults r0 = r0.findAll()
            r0.deleteAllFromRealm()
            r2.insertOrUpdate(r1)
            return
    }

    private static /* synthetic */ void lambda$getMovieModels$12(java.lang.String r2, io.realm.Realm r3) {
            java.lang.Class<com.flextv.livestore.models.MovieModel> r0 = com.flextv.livestore.models.MovieModel.class
            java.lang.String r1 = "name"
            java.lang.Object r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r0, r1, r2)
            com.flextv.livestore.models.MovieModel r2 = (com.flextv.livestore.models.MovieModel) r2
            if (r2 == 0) goto L10
            r3 = 1
            r2.setIs_favorite(r3)
        L10:
            return
    }

    private static /* synthetic */ void lambda$getMovieModels$13(com.flextv.livestore.models.ResumeModel r2, io.realm.Realm r3) {
            java.lang.Class<com.flextv.livestore.models.MovieModel> r0 = com.flextv.livestore.models.MovieModel.class
            io.realm.RealmQuery r3 = r3.where(r0)
            java.lang.String r0 = r2.getName()
            java.lang.String r1 = "name"
            io.realm.RealmQuery r3 = r3.equalTo(r1, r0)
            java.lang.Object r3 = r3.findFirst()
            com.flextv.livestore.models.MovieModel r3 = (com.flextv.livestore.models.MovieModel) r3
            if (r3 == 0) goto L2a
            r0 = 1
            r3.setIs_recent(r0)
            int r0 = r2.getPro()
            r3.setPro(r0)
            long r0 = r2.getLast_position()
            r3.setTime(r0)
        L2a:
            return
    }

    private /* synthetic */ void lambda$getMovieModels$14(io.realm.RealmResults r4, java.util.List r5, java.util.List r6, java.util.List r7) {
            r3 = this;
            int r4 = r4.size()
            int r0 = r7.size()
            if (r4 == r0) goto L5a
            io.realm.Realm r4 = r3.realm
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda7 r0 = new com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda7
            r1 = 1
            r0.<init>(r7, r1)
            r4.executeTransaction(r0)
            int r4 = r5.size()
            if (r4 <= 0) goto L38
            java.util.Iterator r4 = r5.iterator()
        L1f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L38
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            io.realm.Realm r0 = r3.realm
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda6 r1 = new com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda6
            r2 = 10
            r1.<init>(r5, r2)
            r0.executeTransaction(r1)
            goto L1f
        L38:
            int r4 = r6.size()
            if (r4 <= 0) goto L5a
            java.util.Iterator r4 = r6.iterator()
        L42:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L5a
            java.lang.Object r5 = r4.next()
            com.flextv.livestore.models.ResumeModel r5 = (com.flextv.livestore.models.ResumeModel) r5
            io.realm.Realm r6 = r3.realm
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda4 r0 = new com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda4
            r1 = 0
            r0.<init>(r5, r1)
            r6.executeTransaction(r0)
            goto L42
        L5a:
            boolean r4 = r3.is_stop
            if (r4 != 0) goto L61
            r3.getMovieCategoryModels(r7)
        L61:
            return
    }

    private /* synthetic */ void lambda$getMovieModels$15(java.lang.Exception r1) {
            r0 = this;
            r0.getEpisodeModels()
            return
    }

    private static /* synthetic */ void lambda$getSeriesFromEpisodes$19(java.util.List r1, io.realm.Realm r2) {
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r0 = com.flextv.livestore.models.SeriesModel.class
            io.realm.RealmQuery r0 = r2.where(r0)
            io.realm.RealmResults r0 = r0.findAll()
            r0.deleteAllFromRealm()
            r2.insertOrUpdate(r1)
            return
    }

    private static /* synthetic */ void lambda$getSeriesFromEpisodes$20(java.lang.String r2, io.realm.Realm r3) {
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r0 = com.flextv.livestore.models.SeriesModel.class
            java.lang.String r1 = "name"
            java.lang.Object r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r0, r1, r2)
            com.flextv.livestore.models.SeriesModel r2 = (com.flextv.livestore.models.SeriesModel) r2
            if (r2 == 0) goto L10
            r3 = 1
            r2.setIs_favorite(r3)
        L10:
            return
    }

    private static /* synthetic */ void lambda$getSeriesFromEpisodes$21(com.flextv.livestore.models.ResumeSeriesModel r2, io.realm.Realm r3) {
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r0 = com.flextv.livestore.models.SeriesModel.class
            io.realm.RealmQuery r3 = r3.where(r0)
            java.lang.String r0 = r2.getName()
            java.lang.String r1 = "name"
            io.realm.RealmQuery r3 = r3.equalTo(r1, r0)
            java.lang.Object r3 = r3.findFirst()
            com.flextv.livestore.models.SeriesModel r3 = (com.flextv.livestore.models.SeriesModel) r3
            if (r3 == 0) goto L2a
            r0 = 1
            r3.setIs_recent(r0)
            int r0 = r2.getSeason_pos()
            r3.setSeason_pos(r0)
            int r2 = r2.getEpisode_pos()
            r3.setEpisode_pos(r2)
        L2a:
            return
    }

    private static /* synthetic */ void lambda$goToLogin$0(io.realm.Realm r0) {
            r0.deleteAll()
            return
    }

    private static /* synthetic */ void lambda$goToXUILogin$1(io.realm.Realm r0) {
            r0.deleteAll()
            return
    }

    private static /* synthetic */ void lambda$reloadM3UData$2(io.realm.Realm r0) {
            r0.deleteAll()
            return
    }

    private void prepareData(java.util.List<iptv.m3u.parser.M3UItem> r7) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r7 = r7.iterator()
        L13:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L37
            java.lang.Object r3 = r7.next()
            iptv.m3u.parser.M3UItem r3 = (iptv.m3u.parser.M3UItem) r3
            int r4 = r6.getMediaType(r3)
            r5 = -1
            if (r4 == r5) goto L13
            if (r4 != 0) goto L2c
            r0.add(r3)
            goto L13
        L2c:
            r5 = 1
            if (r4 != r5) goto L33
            r1.add(r3)
            goto L13
        L33:
            r2.add(r3)
            goto L13
        L37:
            com.flextv.livestore.apps.LTVApp r7 = r6.model
            r7.setM3UChannelsItems(r0)
            com.flextv.livestore.apps.LTVApp r7 = r6.model
            r7.setM3UVideosItems(r1)
            com.flextv.livestore.apps.LTVApp r7 = r6.model
            r7.setM3USeriesItems(r2)
            return
    }

    public static synchronized void setBusy(boolean r1) {
            java.lang.Class<com.flextv.livestore.apps.BaseActivity> r0 = com.flextv.livestore.apps.BaseActivity.class
            monitor-enter(r0)
            com.flextv.livestore.apps.BaseActivity.busy = r1     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return
        L7:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public void doNextTask(boolean r1) {
            r0 = this;
            return
    }

    public void goToLogin(java.lang.String r7, com.flextv.livestore.models.WordModels r8) {
            r6 = this;
            java.lang.String r0 = "="
            com.flextv.livestore.helper.PreferenceHelper r1 = new com.flextv.livestore.helper.PreferenceHelper
            r1.<init>(r6)
            r6.preferenceHelper = r1
            boolean r1 = r6.is_stop
            if (r1 != 0) goto Lc3
            r1 = 0
            r6.wordModels = r8     // Catch: java.lang.Exception -> La2
            java.lang.String r2 = " "
            java.lang.String r3 = ""
            java.lang.String r7 = r7.replaceAll(r2, r3)     // Catch: java.lang.Exception -> La2
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Exception -> La2
            java.lang.String r3 = r7.trim()     // Catch: java.lang.Exception -> La2
            r2.<init>(r3)     // Catch: java.lang.Exception -> La2
            com.flextv.livestore.helper.PreferenceHelper r3 = r6.preferenceHelper     // Catch: java.lang.Exception -> La2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La2
            r4.<init>()     // Catch: java.lang.Exception -> La2
            java.lang.String r5 = r2.getProtocol()     // Catch: java.lang.Exception -> La2
            r4.append(r5)     // Catch: java.lang.Exception -> La2
            java.lang.String r5 = "://"
            r4.append(r5)     // Catch: java.lang.Exception -> La2
            java.lang.String r5 = r2.getAuthority()     // Catch: java.lang.Exception -> La2
            r4.append(r5)     // Catch: java.lang.Exception -> La2
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> La2
            r3.setSharedPreferenceServerUrl(r4)     // Catch: java.lang.Exception -> La2
            java.lang.String r2 = r2.getQuery()     // Catch: java.lang.Exception -> La2
            java.lang.String r3 = "&"
            java.lang.String[] r2 = r2.split(r3)     // Catch: java.lang.Exception -> La2
            r3 = r2[r1]     // Catch: java.lang.Exception -> La2
            java.lang.String[] r3 = r3.split(r0)     // Catch: java.lang.Exception -> La2
            r4 = 1
            r3 = r3[r4]     // Catch: java.lang.Exception -> La2
            r6.user = r3     // Catch: java.lang.Exception -> La2
            r2 = r2[r4]     // Catch: java.lang.Exception -> La2
            java.lang.String[] r0 = r2.split(r0)     // Catch: java.lang.Exception -> La2
            r0 = r0[r4]     // Catch: java.lang.Exception -> La2
            r6.password = r0     // Catch: java.lang.Exception -> La2
            java.lang.String r0 = com.flextv.livestore.utils.Utils.getUserId(r7)     // Catch: java.lang.Exception -> La2
            r6.user_id = r0     // Catch: java.lang.Exception -> La2
            com.flextv.livestore.helper.PreferenceHelper r0 = r6.preferenceHelper     // Catch: java.lang.Exception -> La2
            java.lang.String r0 = r0.getSharedPreferenceUserId()     // Catch: java.lang.Exception -> La2
            java.lang.String r2 = r6.user_id     // Catch: java.lang.Exception -> La2
            boolean r0 = r0.equalsIgnoreCase(r2)     // Catch: java.lang.Exception -> La2
            if (r0 != 0) goto L9e
            io.realm.Realm r0 = r6.realm     // Catch: java.lang.Exception -> La2
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda0 r2 = com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda0.INSTANCE$15     // Catch: java.lang.Exception -> La2
            r0.executeTransaction(r2)     // Catch: java.lang.Exception -> La2
            com.flextv.livestore.helper.PreferenceHelper r0 = r6.preferenceHelper     // Catch: java.lang.Exception -> La2
            java.lang.String r2 = r6.user_id     // Catch: java.lang.Exception -> La2
            r0.setSharedPreferenceUserId(r2)     // Catch: java.lang.Exception -> La2
            com.flextv.livestore.helper.PreferenceHelper r0 = r6.preferenceHelper     // Catch: java.lang.Exception -> La2
            java.util.List r2 = com.flextv.livestore.helper.GetSharedInfo.getDefaultLiveCategory()     // Catch: java.lang.Exception -> La2
            r0.setSharedPreferenceLiveCategory(r2)     // Catch: java.lang.Exception -> La2
            com.flextv.livestore.helper.PreferenceHelper r0 = r6.preferenceHelper     // Catch: java.lang.Exception -> La2
            java.util.List r2 = com.flextv.livestore.helper.GetSharedInfo.getDefaultVodCategory()     // Catch: java.lang.Exception -> La2
            r0.setSharedPreferenceVodCategory(r2)     // Catch: java.lang.Exception -> La2
            com.flextv.livestore.helper.PreferenceHelper r0 = r6.preferenceHelper     // Catch: java.lang.Exception -> La2
            java.util.List r2 = com.flextv.livestore.helper.GetSharedInfo.getDefaultLiveCategory()     // Catch: java.lang.Exception -> La2
            r0.setSharedPreferenceSeriesCategory(r2)     // Catch: java.lang.Exception -> La2
        L9e:
            r6.authentication(r7)     // Catch: java.lang.Exception -> La2
            goto Lc3
        La2:
            r7 = move-exception
            r7.printStackTrace()
            java.lang.String r7 = r8.getAdd_correct_alert()
            android.widget.Toast r7 = android.widget.Toast.makeText(r6, r7, r1)
            r7.show()
            android.content.Intent r7 = new android.content.Intent
            java.lang.Class<com.flextv.livestore.activities.ChangePlaylistActivity> r8 = com.flextv.livestore.activities.ChangePlaylistActivity.class
            r7.<init>(r6, r8)
            java.lang.String r8 = "is_home"
            r7.putExtra(r8, r1)
            r6.startActivity(r7)
            r6.finish()
        Lc3:
            return
    }

    public void goToXUILogin(java.lang.String r4, com.flextv.livestore.models.WordModels r5) {
            r3 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = new com.flextv.livestore.helper.PreferenceHelper
            r0.<init>(r3)
            r3.preferenceHelper = r0
            boolean r0 = r3.is_stop
            if (r0 != 0) goto L85
            r3.wordModels = r5     // Catch: java.lang.Exception -> L85
            java.lang.String r5 = " "
            java.lang.String r0 = ""
            java.lang.String r4 = r4.replaceAll(r5, r0)     // Catch: java.lang.Exception -> L85
            java.net.URL r5 = new java.net.URL     // Catch: java.lang.Exception -> L85
            java.lang.String r0 = r4.trim()     // Catch: java.lang.Exception -> L85
            r5.<init>(r0)     // Catch: java.lang.Exception -> L85
            com.flextv.livestore.helper.PreferenceHelper r0 = r3.preferenceHelper     // Catch: java.lang.Exception -> L85
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L85
            r1.<init>()     // Catch: java.lang.Exception -> L85
            java.lang.String r2 = r5.getProtocol()     // Catch: java.lang.Exception -> L85
            r1.append(r2)     // Catch: java.lang.Exception -> L85
            java.lang.String r2 = "://"
            r1.append(r2)     // Catch: java.lang.Exception -> L85
            java.lang.String r5 = r5.getAuthority()     // Catch: java.lang.Exception -> L85
            r1.append(r5)     // Catch: java.lang.Exception -> L85
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Exception -> L85
            r0.setSharedPreferenceServerUrl(r5)     // Catch: java.lang.Exception -> L85
            java.lang.String r5 = com.flextv.livestore.helper.GetSharedInfo.getXUIUsername(r4)     // Catch: java.lang.Exception -> L85
            r3.user = r5     // Catch: java.lang.Exception -> L85
            java.lang.String r5 = com.flextv.livestore.helper.GetSharedInfo.getXUIPassword(r4)     // Catch: java.lang.Exception -> L85
            r3.password = r5     // Catch: java.lang.Exception -> L85
            com.flextv.livestore.helper.PreferenceHelper r5 = r3.preferenceHelper     // Catch: java.lang.Exception -> L85
            java.lang.String r5 = r5.getSharedPreferenceUserId()     // Catch: java.lang.Exception -> L85
            java.lang.String r0 = r3.user_id     // Catch: java.lang.Exception -> L85
            boolean r5 = r5.equalsIgnoreCase(r0)     // Catch: java.lang.Exception -> L85
            if (r5 != 0) goto L82
            io.realm.Realm r5 = r3.realm     // Catch: java.lang.Exception -> L85
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda0 r0 = com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda0.INSTANCE     // Catch: java.lang.Exception -> L85
            r5.executeTransaction(r0)     // Catch: java.lang.Exception -> L85
            com.flextv.livestore.helper.PreferenceHelper r5 = r3.preferenceHelper     // Catch: java.lang.Exception -> L85
            java.lang.String r0 = r3.user_id     // Catch: java.lang.Exception -> L85
            r5.setSharedPreferenceUserId(r0)     // Catch: java.lang.Exception -> L85
            com.flextv.livestore.helper.PreferenceHelper r5 = r3.preferenceHelper     // Catch: java.lang.Exception -> L85
            java.util.List r0 = com.flextv.livestore.helper.GetSharedInfo.getDefaultLiveCategory()     // Catch: java.lang.Exception -> L85
            r5.setSharedPreferenceLiveCategory(r0)     // Catch: java.lang.Exception -> L85
            com.flextv.livestore.helper.PreferenceHelper r5 = r3.preferenceHelper     // Catch: java.lang.Exception -> L85
            java.util.List r0 = com.flextv.livestore.helper.GetSharedInfo.getDefaultVodCategory()     // Catch: java.lang.Exception -> L85
            r5.setSharedPreferenceVodCategory(r0)     // Catch: java.lang.Exception -> L85
            com.flextv.livestore.helper.PreferenceHelper r5 = r3.preferenceHelper     // Catch: java.lang.Exception -> L85
            java.util.List r0 = com.flextv.livestore.helper.GetSharedInfo.getDefaultLiveCategory()     // Catch: java.lang.Exception -> L85
            r5.setSharedPreferenceSeriesCategory(r0)     // Catch: java.lang.Exception -> L85
        L82:
            r3.authentication(r4)     // Catch: java.lang.Exception -> L85
        L85:
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle r3) {
            r2 = this;
            super.onCreate(r3)
            io.realm.Realm.init(r2)
            io.realm.RealmConfiguration$Builder r3 = new io.realm.RealmConfiguration$Builder
            r3.<init>()
            java.lang.String r0 = "MTV.realm"
            io.realm.RealmConfiguration$Builder r3 = r3.name(r0)
            r0 = 1
            io.realm.RealmConfiguration$Builder r3 = r3.schemaVersion(r0)
            io.realm.RealmConfiguration$Builder r3 = r3.deleteRealmIfMigrationNeeded()
            r0 = 1
            io.realm.RealmConfiguration$Builder r3 = r3.allowWritesOnUiThread(r0)
            io.realm.RealmConfiguration r3 = r3.build()
            io.realm.Realm.setDefaultConfiguration(r3)
            io.realm.Realm r3 = io.realm.Realm.getInstance(r3)
            r2.realm = r3
            return
    }

    public void reloadM3UData(java.lang.String r2, com.flextv.livestore.models.WordModels r3) {
            r1 = this;
            r1.wordModels = r3
            com.flextv.livestore.helper.PreferenceHelper r3 = new com.flextv.livestore.helper.PreferenceHelper
            r3.<init>(r1)
            r1.preferenceHelper = r3
            boolean r3 = isBusy()
            if (r3 != 0) goto L4d
            r3 = 1
            setBusy(r3)
            java.lang.String r3 = " "
            java.lang.String r0 = ""
            java.lang.String r2 = r2.replaceAll(r3, r0)
            java.lang.String r2 = r2.trim()
            java.lang.String r3 = com.flextv.livestore.utils.Utils.getUserId(r2)
            r1.user_id = r3
            com.flextv.livestore.helper.PreferenceHelper r3 = r1.preferenceHelper
            r3.setSharedPreferenceServerUrl(r2)
            com.flextv.livestore.helper.PreferenceHelper r3 = r1.preferenceHelper
            java.lang.String r3 = r3.getSharedPreferenceUserId()
            java.lang.String r0 = r1.user_id
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 != 0) goto L46
            io.realm.Realm r3 = r1.realm
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda0 r0 = com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda0.INSTANCE$14
            r3.executeTransaction(r0)
            com.flextv.livestore.helper.PreferenceHelper r3 = r1.preferenceHelper
            java.lang.String r0 = r1.user_id
            r3.setSharedPreferenceUserId(r0)
        L46:
            boolean r3 = r1.is_stop
            if (r3 != 0) goto L4d
            r1.fetchM3UItems(r2)
        L4d:
            return
    }

    public void setStop(boolean r1) {
            r0 = this;
            r0.is_stop = r1
            return
    }
}
