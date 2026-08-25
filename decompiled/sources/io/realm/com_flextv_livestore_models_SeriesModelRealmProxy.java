package io.realm;

/* JADX INFO: loaded from: classes2.dex */
public class com_flextv_livestore_models_SeriesModelRealmProxy extends com.flextv.livestore.models.SeriesModel implements io.realm.internal.RealmObjectProxy {
    private static final java.lang.String NO_ALIAS = "";
    private static final io.realm.internal.OsObjectSchemaInfo expectedObjectSchemaInfo = null;
    private io.realm.com_flextv_livestore_models_SeriesModelRealmProxy.SeriesModelColumnInfo columnInfo;
    private io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> proxyState;

    /* JADX INFO: loaded from: classes.dex */
    public static final class ClassNameHelper {
        public static final java.lang.String INTERNAL_CLASS_NAME = "SeriesModel";

        public ClassNameHelper() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class SeriesModelColumnInfo extends io.realm.internal.ColumnInfo {
        public long castColKey;
        public long category_idColKey;
        public long category_nameColKey;
        public long directorColKey;
        public long episode_posColKey;
        public long genreColKey;
        public long is_favoriteColKey;
        public long is_recentColKey;
        public long is_watchedColKey;
        public long last_modifiedColKey;
        public long nameColKey;
        public long numColKey;
        public long plotColKey;
        public long ratingColKey;
        public long rating_5basedColKey;
        public long releaseDateColKey;
        public long season_posColKey;
        public long series_idColKey;
        public long stream_iconColKey;
        public long stream_typeColKey;
        public long tmdbColKey;
        public long urlColKey;
        public long youtubeColKey;

        public SeriesModelColumnInfo(io.realm.internal.OsSchemaInfo r3) {
                r2 = this;
                r0 = 23
                r2.<init>(r0)
                java.lang.String r0 = "SeriesModel"
                io.realm.internal.OsObjectSchemaInfo r3 = r3.getObjectSchemaInfo(r0)
                java.lang.String r0 = "num"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.numColKey = r0
                java.lang.String r0 = "name"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.nameColKey = r0
                java.lang.String r0 = "stream_type"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.stream_typeColKey = r0
                java.lang.String r0 = "series_id"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.series_idColKey = r0
                java.lang.String r0 = "stream_icon"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.stream_iconColKey = r0
                java.lang.String r0 = "youtube"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.youtubeColKey = r0
                java.lang.String r0 = "plot"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.plotColKey = r0
                java.lang.String r0 = "cast"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.castColKey = r0
                java.lang.String r0 = "director"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.directorColKey = r0
                java.lang.String r0 = "genre"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.genreColKey = r0
                java.lang.String r0 = "releaseDate"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.releaseDateColKey = r0
                java.lang.String r0 = "rating"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.ratingColKey = r0
                java.lang.String r0 = "rating_5based"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.rating_5basedColKey = r0
                java.lang.String r0 = "category_id"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.category_idColKey = r0
                java.lang.String r0 = "last_modified"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.last_modifiedColKey = r0
                java.lang.String r0 = "tmdb"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.tmdbColKey = r0
                java.lang.String r0 = "season_pos"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.season_posColKey = r0
                java.lang.String r0 = "episode_pos"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.episode_posColKey = r0
                java.lang.String r0 = "is_watched"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.is_watchedColKey = r0
                java.lang.String r0 = "is_favorite"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.is_favoriteColKey = r0
                java.lang.String r0 = "is_recent"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.is_recentColKey = r0
                java.lang.String r0 = "category_name"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.category_nameColKey = r0
                java.lang.String r0 = "url"
                java.lang.String r1 = "url"
                long r0 = r2.addColumnDetails(r0, r1, r3)
                r2.urlColKey = r0
                return
        }

        @Override // io.realm.internal.ColumnInfo
        public final void copy(io.realm.internal.ColumnInfo r3, io.realm.internal.ColumnInfo r4) {
                r2 = this;
                io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r3 = (io.realm.com_flextv_livestore_models_SeriesModelRealmProxy.SeriesModelColumnInfo) r3
                io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r4 = (io.realm.com_flextv_livestore_models_SeriesModelRealmProxy.SeriesModelColumnInfo) r4
                long r0 = r3.numColKey
                r4.numColKey = r0
                long r0 = r3.nameColKey
                r4.nameColKey = r0
                long r0 = r3.stream_typeColKey
                r4.stream_typeColKey = r0
                long r0 = r3.series_idColKey
                r4.series_idColKey = r0
                long r0 = r3.stream_iconColKey
                r4.stream_iconColKey = r0
                long r0 = r3.youtubeColKey
                r4.youtubeColKey = r0
                long r0 = r3.plotColKey
                r4.plotColKey = r0
                long r0 = r3.castColKey
                r4.castColKey = r0
                long r0 = r3.directorColKey
                r4.directorColKey = r0
                long r0 = r3.genreColKey
                r4.genreColKey = r0
                long r0 = r3.releaseDateColKey
                r4.releaseDateColKey = r0
                long r0 = r3.ratingColKey
                r4.ratingColKey = r0
                long r0 = r3.rating_5basedColKey
                r4.rating_5basedColKey = r0
                long r0 = r3.category_idColKey
                r4.category_idColKey = r0
                long r0 = r3.last_modifiedColKey
                r4.last_modifiedColKey = r0
                long r0 = r3.tmdbColKey
                r4.tmdbColKey = r0
                long r0 = r3.season_posColKey
                r4.season_posColKey = r0
                long r0 = r3.episode_posColKey
                r4.episode_posColKey = r0
                long r0 = r3.is_watchedColKey
                r4.is_watchedColKey = r0
                long r0 = r3.is_favoriteColKey
                r4.is_favoriteColKey = r0
                long r0 = r3.is_recentColKey
                r4.is_recentColKey = r0
                long r0 = r3.category_nameColKey
                r4.category_nameColKey = r0
                long r0 = r3.urlColKey
                r4.urlColKey = r0
                return
        }
    }

    static {
            io.realm.internal.OsObjectSchemaInfo r0 = createExpectedObjectSchemaInfo()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy.expectedObjectSchemaInfo = r0
            return
    }

    public com_flextv_livestore_models_SeriesModelRealmProxy() {
            r1 = this;
            r1.<init>()
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r1.proxyState
            r0.setConstructionFinished()
            return
    }

    public static com.flextv.livestore.models.SeriesModel copy(io.realm.Realm r9, io.realm.com_flextv_livestore_models_SeriesModelRealmProxy.SeriesModelColumnInfo r10, com.flextv.livestore.models.SeriesModel r11, boolean r12, java.util.Map<io.realm.RealmModel, io.realm.internal.RealmObjectProxy> r13, java.util.Set<io.realm.ImportFlag> r14) {
            java.lang.Object r12 = r13.get(r11)
            io.realm.internal.RealmObjectProxy r12 = (io.realm.internal.RealmObjectProxy) r12
            if (r12 == 0) goto Lb
            com.flextv.livestore.models.SeriesModel r12 = (com.flextv.livestore.models.SeriesModel) r12
            return r12
        Lb:
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r12 = com.flextv.livestore.models.SeriesModel.class
            io.realm.internal.Table r12 = r9.getTable(r12)
            io.realm.internal.objectstore.OsObjectBuilder r0 = new io.realm.internal.objectstore.OsObjectBuilder
            r0.<init>(r12, r14)
            long r1 = r10.numColKey
            int r12 = r11.realmGet$num()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r0.addInteger(r1, r12)
            long r1 = r10.nameColKey
            java.lang.String r12 = r11.realmGet$name()
            r0.addString(r1, r12)
            long r1 = r10.stream_typeColKey
            java.lang.String r12 = r11.realmGet$stream_type()
            r0.addString(r1, r12)
            long r1 = r10.series_idColKey
            java.lang.String r12 = r11.realmGet$series_id()
            r0.addString(r1, r12)
            long r1 = r10.stream_iconColKey
            java.lang.String r12 = r11.realmGet$stream_icon()
            r0.addString(r1, r12)
            long r1 = r10.youtubeColKey
            java.lang.String r12 = r11.realmGet$youtube()
            r0.addString(r1, r12)
            long r1 = r10.plotColKey
            java.lang.String r12 = r11.realmGet$plot()
            r0.addString(r1, r12)
            long r1 = r10.castColKey
            java.lang.String r12 = r11.realmGet$cast()
            r0.addString(r1, r12)
            long r1 = r10.directorColKey
            java.lang.String r12 = r11.realmGet$director()
            r0.addString(r1, r12)
            long r1 = r10.genreColKey
            java.lang.String r12 = r11.realmGet$genre()
            r0.addString(r1, r12)
            long r1 = r10.releaseDateColKey
            java.lang.String r12 = r11.realmGet$releaseDate()
            r0.addString(r1, r12)
            long r1 = r10.ratingColKey
            java.lang.String r12 = r11.realmGet$rating()
            r0.addString(r1, r12)
            long r1 = r10.rating_5basedColKey
            float r12 = r11.realmGet$rating_5based()
            java.lang.Float r12 = java.lang.Float.valueOf(r12)
            r0.addFloat(r1, r12)
            long r1 = r10.category_idColKey
            java.lang.String r12 = r11.realmGet$category_id()
            r0.addString(r1, r12)
            long r1 = r10.last_modifiedColKey
            java.lang.String r12 = r11.realmGet$last_modified()
            r0.addString(r1, r12)
            long r1 = r10.tmdbColKey
            java.lang.String r12 = r11.realmGet$tmdb()
            r0.addString(r1, r12)
            long r1 = r10.season_posColKey
            int r12 = r11.realmGet$season_pos()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r0.addInteger(r1, r12)
            long r1 = r10.episode_posColKey
            int r12 = r11.realmGet$episode_pos()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r0.addInteger(r1, r12)
            long r1 = r10.is_watchedColKey
            boolean r12 = r11.realmGet$is_watched()
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            r0.addBoolean(r1, r12)
            long r1 = r10.is_favoriteColKey
            boolean r12 = r11.realmGet$is_favorite()
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            r0.addBoolean(r1, r12)
            long r1 = r10.is_recentColKey
            boolean r12 = r11.realmGet$is_recent()
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            r0.addBoolean(r1, r12)
            long r1 = r10.category_nameColKey
            java.lang.String r12 = r11.realmGet$category_name()
            r0.addString(r1, r12)
            long r1 = r10.urlColKey
            java.lang.String r10 = r11.realmGet$url()
            r0.addString(r1, r10)
            io.realm.internal.UncheckedRow r5 = r0.createNewObject()
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r10 = io.realm.BaseRealm.objectContext
            java.lang.Object r10 = r10.get()
            io.realm.BaseRealm$RealmObjectContext r10 = (io.realm.BaseRealm.RealmObjectContext) r10
            io.realm.RealmSchema r12 = r9.getSchema()
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r14 = com.flextv.livestore.models.SeriesModel.class
            io.realm.internal.ColumnInfo r6 = r12.getColumnInfo(r14)
            java.util.List r8 = java.util.Collections.emptyList()
            r7 = 0
            r3 = r10
            r4 = r9
            r3.set(r4, r5, r6, r7, r8)
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy r9 = new io.realm.com_flextv_livestore_models_SeriesModelRealmProxy
            r9.<init>()
            r10.clear()
            r13.put(r11, r9)
            return r9
    }

    public static com.flextv.livestore.models.SeriesModel copyOrUpdate(io.realm.Realm r6, io.realm.com_flextv_livestore_models_SeriesModelRealmProxy.SeriesModelColumnInfo r7, com.flextv.livestore.models.SeriesModel r8, boolean r9, java.util.Map<io.realm.RealmModel, io.realm.internal.RealmObjectProxy> r10, java.util.Set<io.realm.ImportFlag> r11) {
            boolean r0 = r8 instanceof io.realm.internal.RealmObjectProxy
            if (r0 == 0) goto L3e
            boolean r0 = io.realm.RealmObject.isFrozen(r8)
            if (r0 != 0) goto L3e
            r0 = r8
            io.realm.internal.RealmObjectProxy r0 = (io.realm.internal.RealmObjectProxy) r0
            io.realm.ProxyState r1 = r0.realmGet$proxyState()
            io.realm.BaseRealm r1 = r1.getRealm$realm()
            if (r1 == 0) goto L3e
            io.realm.ProxyState r0 = r0.realmGet$proxyState()
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            long r1 = r0.threadId
            long r3 = r6.threadId
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L36
            java.lang.String r0 = r0.getPath()
            java.lang.String r1 = r6.getPath()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3e
            return r8
        L36:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Objects which belong to Realm instances in other threads cannot be copied into this Realm instance."
            r6.<init>(r7)
            throw r6
        L3e:
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r0 = io.realm.BaseRealm.objectContext
            java.lang.Object r0 = r0.get()
            io.realm.BaseRealm$RealmObjectContext r0 = (io.realm.BaseRealm.RealmObjectContext) r0
            java.lang.Object r0 = r10.get(r8)
            io.realm.internal.RealmObjectProxy r0 = (io.realm.internal.RealmObjectProxy) r0
            if (r0 == 0) goto L51
            com.flextv.livestore.models.SeriesModel r0 = (com.flextv.livestore.models.SeriesModel) r0
            return r0
        L51:
            com.flextv.livestore.models.SeriesModel r6 = copy(r6, r7, r8, r9, r10, r11)
            return r6
    }

    public static io.realm.com_flextv_livestore_models_SeriesModelRealmProxy.SeriesModelColumnInfo createColumnInfo(io.realm.internal.OsSchemaInfo r1) {
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r0 = new io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo
            r0.<init>(r1)
            return r0
    }

    public static com.flextv.livestore.models.SeriesModel createDetachedCopy(com.flextv.livestore.models.SeriesModel r1, int r2, int r3, java.util.Map<io.realm.RealmModel, io.realm.internal.RealmObjectProxy.CacheData<io.realm.RealmModel>> r4) {
            if (r2 > r3) goto Ldb
            if (r1 != 0) goto L6
            goto Ldb
        L6:
            java.lang.Object r3 = r4.get(r1)
            io.realm.internal.RealmObjectProxy$CacheData r3 = (io.realm.internal.RealmObjectProxy.CacheData) r3
            if (r3 != 0) goto L1c
            com.flextv.livestore.models.SeriesModel r3 = new com.flextv.livestore.models.SeriesModel
            r3.<init>()
            io.realm.internal.RealmObjectProxy$CacheData r0 = new io.realm.internal.RealmObjectProxy$CacheData
            r0.<init>(r2, r3)
            r4.put(r1, r0)
            goto L2c
        L1c:
            int r4 = r3.minDepth
            if (r2 < r4) goto L25
            E extends io.realm.RealmModel r1 = r3.object
            com.flextv.livestore.models.SeriesModel r1 = (com.flextv.livestore.models.SeriesModel) r1
            return r1
        L25:
            E extends io.realm.RealmModel r4 = r3.object
            com.flextv.livestore.models.SeriesModel r4 = (com.flextv.livestore.models.SeriesModel) r4
            r3.minDepth = r2
            r3 = r4
        L2c:
            r2 = r1
            io.realm.internal.RealmObjectProxy r2 = (io.realm.internal.RealmObjectProxy) r2
            io.realm.ProxyState r2 = r2.realmGet$proxyState()
            io.realm.BaseRealm r2 = r2.getRealm$realm()
            io.realm.Realm r2 = (io.realm.Realm) r2
            int r2 = r1.realmGet$num()
            r3.realmSet$num(r2)
            java.lang.String r2 = r1.realmGet$name()
            r3.realmSet$name(r2)
            java.lang.String r2 = r1.realmGet$stream_type()
            r3.realmSet$stream_type(r2)
            java.lang.String r2 = r1.realmGet$series_id()
            r3.realmSet$series_id(r2)
            java.lang.String r2 = r1.realmGet$stream_icon()
            r3.realmSet$stream_icon(r2)
            java.lang.String r2 = r1.realmGet$youtube()
            r3.realmSet$youtube(r2)
            java.lang.String r2 = r1.realmGet$plot()
            r3.realmSet$plot(r2)
            java.lang.String r2 = r1.realmGet$cast()
            r3.realmSet$cast(r2)
            java.lang.String r2 = r1.realmGet$director()
            r3.realmSet$director(r2)
            java.lang.String r2 = r1.realmGet$genre()
            r3.realmSet$genre(r2)
            java.lang.String r2 = r1.realmGet$releaseDate()
            r3.realmSet$releaseDate(r2)
            java.lang.String r2 = r1.realmGet$rating()
            r3.realmSet$rating(r2)
            float r2 = r1.realmGet$rating_5based()
            r3.realmSet$rating_5based(r2)
            java.lang.String r2 = r1.realmGet$category_id()
            r3.realmSet$category_id(r2)
            java.lang.String r2 = r1.realmGet$last_modified()
            r3.realmSet$last_modified(r2)
            java.lang.String r2 = r1.realmGet$tmdb()
            r3.realmSet$tmdb(r2)
            int r2 = r1.realmGet$season_pos()
            r3.realmSet$season_pos(r2)
            int r2 = r1.realmGet$episode_pos()
            r3.realmSet$episode_pos(r2)
            boolean r2 = r1.realmGet$is_watched()
            r3.realmSet$is_watched(r2)
            boolean r2 = r1.realmGet$is_favorite()
            r3.realmSet$is_favorite(r2)
            boolean r2 = r1.realmGet$is_recent()
            r3.realmSet$is_recent(r2)
            java.lang.String r2 = r1.realmGet$category_name()
            r3.realmSet$category_name(r2)
            java.lang.String r1 = r1.realmGet$url()
            r3.realmSet$url(r1)
            return r3
        Ldb:
            r1 = 0
            return r1
    }

    private static io.realm.internal.OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
            io.realm.internal.OsObjectSchemaInfo$Builder r7 = new io.realm.internal.OsObjectSchemaInfo$Builder
            java.lang.String r1 = ""
            java.lang.String r2 = "SeriesModel"
            r3 = 0
            r4 = 23
            r5 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            io.realm.RealmFieldType r8 = io.realm.RealmFieldType.INTEGER
            java.lang.String r1 = ""
            java.lang.String r2 = "num"
            r4 = 0
            r6 = 1
            r3 = r8
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            io.realm.RealmFieldType r9 = io.realm.RealmFieldType.STRING
            java.lang.String r1 = ""
            java.lang.String r2 = "name"
            r6 = 0
            r3 = r9
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "stream_type"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "series_id"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "stream_icon"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "youtube"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "plot"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "cast"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "director"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "genre"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "releaseDate"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "rating"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            io.realm.RealmFieldType r3 = io.realm.RealmFieldType.FLOAT
            java.lang.String r1 = ""
            java.lang.String r2 = "rating_5based"
            r6 = 1
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "category_id"
            r6 = 0
            r3 = r9
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "last_modified"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "tmdb"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "season_pos"
            r6 = 1
            r3 = r8
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "episode_pos"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            io.realm.RealmFieldType r8 = io.realm.RealmFieldType.BOOLEAN
            java.lang.String r1 = ""
            java.lang.String r2 = "is_watched"
            r3 = r8
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "is_favorite"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "is_recent"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "category_name"
            r6 = 0
            r3 = r9
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "url"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            io.realm.internal.OsObjectSchemaInfo r0 = r7.build()
            return r0
    }

    public static com.flextv.livestore.models.SeriesModel createOrUpdateUsingJsonObject(io.realm.Realm r4, org.json.JSONObject r5, boolean r6) throws org.json.JSONException {
            java.util.List r6 = java.util.Collections.emptyList()
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r0 = com.flextv.livestore.models.SeriesModel.class
            io.realm.RealmModel r4 = r4.createObjectInternal(r0, r6)
            com.flextv.livestore.models.SeriesModel r4 = (com.flextv.livestore.models.SeriesModel) r4
            java.lang.String r6 = "num"
            boolean r0 = r5.has(r6)
            if (r0 == 0) goto L2a
            boolean r0 = r5.isNull(r6)
            if (r0 != 0) goto L22
            int r6 = r5.getInt(r6)
            r4.realmSet$num(r6)
            goto L2a
        L22:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Trying to set non-nullable field 'num' to null."
            r4.<init>(r5)
            throw r4
        L2a:
            java.lang.String r6 = "name"
            boolean r0 = r5.has(r6)
            r1 = 0
            if (r0 == 0) goto L44
            boolean r0 = r5.isNull(r6)
            if (r0 == 0) goto L3d
            r4.realmSet$name(r1)
            goto L44
        L3d:
            java.lang.String r6 = r5.getString(r6)
            r4.realmSet$name(r6)
        L44:
            java.lang.String r6 = "stream_type"
            boolean r0 = r5.has(r6)
            if (r0 == 0) goto L5e
            boolean r0 = r5.isNull(r6)
            if (r0 == 0) goto L57
            r4.realmSet$stream_type(r1)
            goto L5e
        L57:
            java.lang.String r6 = r5.getString(r6)
            r4.realmSet$stream_type(r6)
        L5e:
            java.lang.String r6 = "series_id"
            boolean r0 = r5.has(r6)
            if (r0 == 0) goto L78
            boolean r0 = r5.isNull(r6)
            if (r0 == 0) goto L71
            r4.realmSet$series_id(r1)
            goto L78
        L71:
            java.lang.String r6 = r5.getString(r6)
            r4.realmSet$series_id(r6)
        L78:
            java.lang.String r6 = "stream_icon"
            boolean r0 = r5.has(r6)
            if (r0 == 0) goto L92
            boolean r0 = r5.isNull(r6)
            if (r0 == 0) goto L8b
            r4.realmSet$stream_icon(r1)
            goto L92
        L8b:
            java.lang.String r6 = r5.getString(r6)
            r4.realmSet$stream_icon(r6)
        L92:
            java.lang.String r6 = "youtube"
            boolean r0 = r5.has(r6)
            if (r0 == 0) goto Lac
            boolean r0 = r5.isNull(r6)
            if (r0 == 0) goto La5
            r4.realmSet$youtube(r1)
            goto Lac
        La5:
            java.lang.String r6 = r5.getString(r6)
            r4.realmSet$youtube(r6)
        Lac:
            java.lang.String r6 = "plot"
            boolean r0 = r5.has(r6)
            if (r0 == 0) goto Lc5
            boolean r0 = r5.isNull(r6)
            if (r0 == 0) goto Lbe
            r4.realmSet$plot(r1)
            goto Lc5
        Lbe:
            java.lang.String r6 = r5.getString(r6)
            r4.realmSet$plot(r6)
        Lc5:
            java.lang.String r6 = "cast"
            boolean r0 = r5.has(r6)
            if (r0 == 0) goto Lde
            boolean r0 = r5.isNull(r6)
            if (r0 == 0) goto Ld7
            r4.realmSet$cast(r1)
            goto Lde
        Ld7:
            java.lang.String r6 = r5.getString(r6)
            r4.realmSet$cast(r6)
        Lde:
            java.lang.String r6 = "director"
            boolean r0 = r5.has(r6)
            if (r0 == 0) goto Lf7
            boolean r0 = r5.isNull(r6)
            if (r0 == 0) goto Lf0
            r4.realmSet$director(r1)
            goto Lf7
        Lf0:
            java.lang.String r6 = r5.getString(r6)
            r4.realmSet$director(r6)
        Lf7:
            java.lang.String r6 = "genre"
            boolean r0 = r5.has(r6)
            if (r0 == 0) goto L110
            boolean r0 = r5.isNull(r6)
            if (r0 == 0) goto L109
            r4.realmSet$genre(r1)
            goto L110
        L109:
            java.lang.String r6 = r5.getString(r6)
            r4.realmSet$genre(r6)
        L110:
            java.lang.String r6 = "releaseDate"
            boolean r0 = r5.has(r6)
            if (r0 == 0) goto L129
            boolean r0 = r5.isNull(r6)
            if (r0 == 0) goto L122
            r4.realmSet$releaseDate(r1)
            goto L129
        L122:
            java.lang.String r6 = r5.getString(r6)
            r4.realmSet$releaseDate(r6)
        L129:
            java.lang.String r6 = "rating"
            boolean r0 = r5.has(r6)
            if (r0 == 0) goto L142
            boolean r0 = r5.isNull(r6)
            if (r0 == 0) goto L13b
            r4.realmSet$rating(r1)
            goto L142
        L13b:
            java.lang.String r6 = r5.getString(r6)
            r4.realmSet$rating(r6)
        L142:
            java.lang.String r6 = "rating_5based"
            boolean r0 = r5.has(r6)
            if (r0 == 0) goto L161
            boolean r0 = r5.isNull(r6)
            if (r0 != 0) goto L159
            double r2 = r5.getDouble(r6)
            float r6 = (float) r2
            r4.realmSet$rating_5based(r6)
            goto L161
        L159:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Trying to set non-nullable field 'rating_5based' to null."
            r4.<init>(r5)
            throw r4
        L161:
            java.lang.String r6 = "category_id"
            boolean r0 = r5.has(r6)
            if (r0 == 0) goto L17a
            boolean r0 = r5.isNull(r6)
            if (r0 == 0) goto L173
            r4.realmSet$category_id(r1)
            goto L17a
        L173:
            java.lang.String r6 = r5.getString(r6)
            r4.realmSet$category_id(r6)
        L17a:
            java.lang.String r6 = "last_modified"
            boolean r0 = r5.has(r6)
            if (r0 == 0) goto L193
            boolean r0 = r5.isNull(r6)
            if (r0 == 0) goto L18c
            r4.realmSet$last_modified(r1)
            goto L193
        L18c:
            java.lang.String r6 = r5.getString(r6)
            r4.realmSet$last_modified(r6)
        L193:
            java.lang.String r6 = "tmdb"
            boolean r0 = r5.has(r6)
            if (r0 == 0) goto L1ad
            boolean r0 = r5.isNull(r6)
            if (r0 == 0) goto L1a6
            r4.realmSet$tmdb(r1)
            goto L1ad
        L1a6:
            java.lang.String r6 = r5.getString(r6)
            r4.realmSet$tmdb(r6)
        L1ad:
            java.lang.String r6 = "season_pos"
            boolean r0 = r5.has(r6)
            if (r0 == 0) goto L1cc
            boolean r0 = r5.isNull(r6)
            if (r0 != 0) goto L1c4
            int r6 = r5.getInt(r6)
            r4.realmSet$season_pos(r6)
            goto L1cc
        L1c4:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Trying to set non-nullable field 'season_pos' to null."
            r4.<init>(r5)
            throw r4
        L1cc:
            java.lang.String r6 = "episode_pos"
            boolean r0 = r5.has(r6)
            if (r0 == 0) goto L1ea
            boolean r0 = r5.isNull(r6)
            if (r0 != 0) goto L1e2
            int r6 = r5.getInt(r6)
            r4.realmSet$episode_pos(r6)
            goto L1ea
        L1e2:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Trying to set non-nullable field 'episode_pos' to null."
            r4.<init>(r5)
            throw r4
        L1ea:
            java.lang.String r6 = "is_watched"
            boolean r0 = r5.has(r6)
            if (r0 == 0) goto L208
            boolean r0 = r5.isNull(r6)
            if (r0 != 0) goto L200
            boolean r6 = r5.getBoolean(r6)
            r4.realmSet$is_watched(r6)
            goto L208
        L200:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Trying to set non-nullable field 'is_watched' to null."
            r4.<init>(r5)
            throw r4
        L208:
            java.lang.String r6 = "is_favorite"
            boolean r0 = r5.has(r6)
            if (r0 == 0) goto L226
            boolean r0 = r5.isNull(r6)
            if (r0 != 0) goto L21e
            boolean r6 = r5.getBoolean(r6)
            r4.realmSet$is_favorite(r6)
            goto L226
        L21e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Trying to set non-nullable field 'is_favorite' to null."
            r4.<init>(r5)
            throw r4
        L226:
            java.lang.String r6 = "is_recent"
            boolean r0 = r5.has(r6)
            if (r0 == 0) goto L244
            boolean r0 = r5.isNull(r6)
            if (r0 != 0) goto L23c
            boolean r6 = r5.getBoolean(r6)
            r4.realmSet$is_recent(r6)
            goto L244
        L23c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Trying to set non-nullable field 'is_recent' to null."
            r4.<init>(r5)
            throw r4
        L244:
            java.lang.String r6 = "category_name"
            boolean r0 = r5.has(r6)
            if (r0 == 0) goto L25d
            boolean r0 = r5.isNull(r6)
            if (r0 == 0) goto L256
            r4.realmSet$category_name(r1)
            goto L25d
        L256:
            java.lang.String r6 = r5.getString(r6)
            r4.realmSet$category_name(r6)
        L25d:
            java.lang.String r6 = "url"
            boolean r0 = r5.has(r6)
            if (r0 == 0) goto L277
            boolean r0 = r5.isNull(r6)
            if (r0 == 0) goto L270
            r4.realmSet$url(r1)
            goto L277
        L270:
            java.lang.String r5 = r5.getString(r6)
            r4.realmSet$url(r5)
        L277:
            return r4
    }

    @android.annotation.TargetApi(11)
    public static com.flextv.livestore.models.SeriesModel createUsingJsonStream(io.realm.Realm r4, android.util.JsonReader r5) throws java.io.IOException {
            com.flextv.livestore.models.SeriesModel r0 = new com.flextv.livestore.models.SeriesModel
            r0.<init>()
            r5.beginObject()
        L8:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L30b
            java.lang.String r1 = r5.nextName()
            java.lang.String r2 = "num"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L31
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L2a
            int r1 = r5.nextInt()
            r0.realmSet$num(r1)
            goto L8
        L2a:
            java.lang.String r4 = "Trying to set non-nullable field 'num' to null."
            java.lang.IllegalArgumentException r4 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r5, r4)
            throw r4
        L31:
            java.lang.String r2 = "name"
            boolean r2 = r1.equals(r2)
            r3 = 0
            if (r2 == 0) goto L51
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L4a
            java.lang.String r1 = r5.nextString()
            r0.realmSet$name(r1)
            goto L8
        L4a:
            r5.skipValue()
            r0.realmSet$name(r3)
            goto L8
        L51:
            java.lang.String r2 = "stream_type"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L71
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L6a
            java.lang.String r1 = r5.nextString()
            r0.realmSet$stream_type(r1)
            goto L8
        L6a:
            r5.skipValue()
            r0.realmSet$stream_type(r3)
            goto L8
        L71:
            java.lang.String r2 = "series_id"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L93
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L8b
            java.lang.String r1 = r5.nextString()
            r0.realmSet$series_id(r1)
            goto L8
        L8b:
            r5.skipValue()
            r0.realmSet$series_id(r3)
            goto L8
        L93:
            java.lang.String r2 = "stream_icon"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto Lb5
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto Lad
            java.lang.String r1 = r5.nextString()
            r0.realmSet$stream_icon(r1)
            goto L8
        Lad:
            r5.skipValue()
            r0.realmSet$stream_icon(r3)
            goto L8
        Lb5:
            java.lang.String r2 = "youtube"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto Ld7
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto Lcf
            java.lang.String r1 = r5.nextString()
            r0.realmSet$youtube(r1)
            goto L8
        Lcf:
            r5.skipValue()
            r0.realmSet$youtube(r3)
            goto L8
        Ld7:
            java.lang.String r2 = "plot"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto Lf8
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto Lf0
            java.lang.String r1 = r5.nextString()
            r0.realmSet$plot(r1)
            goto L8
        Lf0:
            r5.skipValue()
            r0.realmSet$plot(r3)
            goto L8
        Lf8:
            java.lang.String r2 = "cast"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L119
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L111
            java.lang.String r1 = r5.nextString()
            r0.realmSet$cast(r1)
            goto L8
        L111:
            r5.skipValue()
            r0.realmSet$cast(r3)
            goto L8
        L119:
            java.lang.String r2 = "director"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L13a
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L132
            java.lang.String r1 = r5.nextString()
            r0.realmSet$director(r1)
            goto L8
        L132:
            r5.skipValue()
            r0.realmSet$director(r3)
            goto L8
        L13a:
            java.lang.String r2 = "genre"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L15b
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L153
            java.lang.String r1 = r5.nextString()
            r0.realmSet$genre(r1)
            goto L8
        L153:
            r5.skipValue()
            r0.realmSet$genre(r3)
            goto L8
        L15b:
            java.lang.String r2 = "releaseDate"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L17c
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L174
            java.lang.String r1 = r5.nextString()
            r0.realmSet$releaseDate(r1)
            goto L8
        L174:
            r5.skipValue()
            r0.realmSet$releaseDate(r3)
            goto L8
        L17c:
            java.lang.String r2 = "rating"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L19d
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L195
            java.lang.String r1 = r5.nextString()
            r0.realmSet$rating(r1)
            goto L8
        L195:
            r5.skipValue()
            r0.realmSet$rating(r3)
            goto L8
        L19d:
            java.lang.String r2 = "rating_5based"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L1be
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L1b7
            double r1 = r5.nextDouble()
            float r1 = (float) r1
            r0.realmSet$rating_5based(r1)
            goto L8
        L1b7:
            java.lang.String r4 = "Trying to set non-nullable field 'rating_5based' to null."
            java.lang.IllegalArgumentException r4 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r5, r4)
            throw r4
        L1be:
            java.lang.String r2 = "category_id"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L1df
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L1d7
            java.lang.String r1 = r5.nextString()
            r0.realmSet$category_id(r1)
            goto L8
        L1d7:
            r5.skipValue()
            r0.realmSet$category_id(r3)
            goto L8
        L1df:
            java.lang.String r2 = "last_modified"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L200
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L1f8
            java.lang.String r1 = r5.nextString()
            r0.realmSet$last_modified(r1)
            goto L8
        L1f8:
            r5.skipValue()
            r0.realmSet$last_modified(r3)
            goto L8
        L200:
            java.lang.String r2 = "tmdb"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L222
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L21a
            java.lang.String r1 = r5.nextString()
            r0.realmSet$tmdb(r1)
            goto L8
        L21a:
            r5.skipValue()
            r0.realmSet$tmdb(r3)
            goto L8
        L222:
            java.lang.String r2 = "season_pos"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L243
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L23c
            int r1 = r5.nextInt()
            r0.realmSet$season_pos(r1)
            goto L8
        L23c:
            java.lang.String r4 = "Trying to set non-nullable field 'season_pos' to null."
            java.lang.IllegalArgumentException r4 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r5, r4)
            throw r4
        L243:
            java.lang.String r2 = "episode_pos"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L263
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L25c
            int r1 = r5.nextInt()
            r0.realmSet$episode_pos(r1)
            goto L8
        L25c:
            java.lang.String r4 = "Trying to set non-nullable field 'episode_pos' to null."
            java.lang.IllegalArgumentException r4 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r5, r4)
            throw r4
        L263:
            java.lang.String r2 = "is_watched"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L283
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L27c
            boolean r1 = r5.nextBoolean()
            r0.realmSet$is_watched(r1)
            goto L8
        L27c:
            java.lang.String r4 = "Trying to set non-nullable field 'is_watched' to null."
            java.lang.IllegalArgumentException r4 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r5, r4)
            throw r4
        L283:
            java.lang.String r2 = "is_favorite"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L2a3
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L29c
            boolean r1 = r5.nextBoolean()
            r0.realmSet$is_favorite(r1)
            goto L8
        L29c:
            java.lang.String r4 = "Trying to set non-nullable field 'is_favorite' to null."
            java.lang.IllegalArgumentException r4 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r5, r4)
            throw r4
        L2a3:
            java.lang.String r2 = "is_recent"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L2c3
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L2bc
            boolean r1 = r5.nextBoolean()
            r0.realmSet$is_recent(r1)
            goto L8
        L2bc:
            java.lang.String r4 = "Trying to set non-nullable field 'is_recent' to null."
            java.lang.IllegalArgumentException r4 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r5, r4)
            throw r4
        L2c3:
            java.lang.String r2 = "category_name"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L2e4
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L2dc
            java.lang.String r1 = r5.nextString()
            r0.realmSet$category_name(r1)
            goto L8
        L2dc:
            r5.skipValue()
            r0.realmSet$category_name(r3)
            goto L8
        L2e4:
            java.lang.String r2 = "url"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L306
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L2fe
            java.lang.String r1 = r5.nextString()
            r0.realmSet$url(r1)
            goto L8
        L2fe:
            r5.skipValue()
            r0.realmSet$url(r3)
            goto L8
        L306:
            r5.skipValue()
            goto L8
        L30b:
            r5.endObject()
            r5 = 0
            io.realm.ImportFlag[] r5 = new io.realm.ImportFlag[r5]
            io.realm.RealmModel r4 = r4.copyToRealm(r0, r5)
            com.flextv.livestore.models.SeriesModel r4 = (com.flextv.livestore.models.SeriesModel) r4
            return r4
    }

    public static io.realm.internal.OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
            io.realm.internal.OsObjectSchemaInfo r0 = io.realm.com_flextv_livestore_models_SeriesModelRealmProxy.expectedObjectSchemaInfo
            return r0
    }

    public static java.lang.String getSimpleClassName() {
            java.lang.String r0 = "SeriesModel"
            return r0
    }

    public static long insert(io.realm.Realm r16, com.flextv.livestore.models.SeriesModel r17, java.util.Map<io.realm.RealmModel, java.lang.Long> r18) {
            r0 = r17
            boolean r1 = r0 instanceof io.realm.internal.RealmObjectProxy
            if (r1 == 0) goto L3c
            boolean r1 = io.realm.RealmObject.isFrozen(r17)
            if (r1 != 0) goto L3c
            r1 = r0
            io.realm.internal.RealmObjectProxy r1 = (io.realm.internal.RealmObjectProxy) r1
            io.realm.ProxyState r2 = r1.realmGet$proxyState()
            io.realm.BaseRealm r2 = r2.getRealm$realm()
            if (r2 == 0) goto L3c
            io.realm.ProxyState r2 = r1.realmGet$proxyState()
            io.realm.BaseRealm r2 = r2.getRealm$realm()
            java.lang.String r2 = r2.getPath()
            java.lang.String r3 = r16.getPath()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L3c
            io.realm.ProxyState r0 = r1.realmGet$proxyState()
            io.realm.internal.Row r0 = r0.getRow$realm()
            long r0 = r0.getObjectKey()
            return r0
        L3c:
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r1 = com.flextv.livestore.models.SeriesModel.class
            r2 = r16
            io.realm.internal.Table r1 = r2.getTable(r1)
            long r11 = r1.getNativePtr()
            io.realm.RealmSchema r2 = r16.getSchema()
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r3 = com.flextv.livestore.models.SeriesModel.class
            io.realm.internal.ColumnInfo r2 = r2.getColumnInfo(r3)
            r13 = r2
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r13 = (io.realm.com_flextv_livestore_models_SeriesModelRealmProxy.SeriesModelColumnInfo) r13
            long r14 = io.realm.internal.OsObject.createRow(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r14)
            r2 = r18
            r2.put(r0, r1)
            long r4 = r13.numColKey
            int r1 = r17.realmGet$num()
            long r8 = (long) r1
            r10 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetLong(r2, r4, r6, r8, r10)
            java.lang.String r8 = r17.realmGet$name()
            if (r8 == 0) goto L7d
            long r4 = r13.nameColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
        L7d:
            java.lang.String r8 = r17.realmGet$stream_type()
            if (r8 == 0) goto L8b
            long r4 = r13.stream_typeColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
        L8b:
            java.lang.String r8 = r17.realmGet$series_id()
            if (r8 == 0) goto L99
            long r4 = r13.series_idColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
        L99:
            java.lang.String r8 = r17.realmGet$stream_icon()
            if (r8 == 0) goto La7
            long r4 = r13.stream_iconColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
        La7:
            java.lang.String r8 = r17.realmGet$youtube()
            if (r8 == 0) goto Lb5
            long r4 = r13.youtubeColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
        Lb5:
            java.lang.String r8 = r17.realmGet$plot()
            if (r8 == 0) goto Lc3
            long r4 = r13.plotColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
        Lc3:
            java.lang.String r8 = r17.realmGet$cast()
            if (r8 == 0) goto Ld1
            long r4 = r13.castColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
        Ld1:
            java.lang.String r8 = r17.realmGet$director()
            if (r8 == 0) goto Ldf
            long r4 = r13.directorColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
        Ldf:
            java.lang.String r8 = r17.realmGet$genre()
            if (r8 == 0) goto Led
            long r4 = r13.genreColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
        Led:
            java.lang.String r8 = r17.realmGet$releaseDate()
            if (r8 == 0) goto Lfb
            long r4 = r13.releaseDateColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
        Lfb:
            java.lang.String r8 = r17.realmGet$rating()
            if (r8 == 0) goto L109
            long r4 = r13.ratingColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
        L109:
            long r4 = r13.rating_5basedColKey
            float r8 = r17.realmGet$rating_5based()
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetFloat(r2, r4, r6, r8, r9)
            java.lang.String r8 = r17.realmGet$category_id()
            if (r8 == 0) goto L123
            long r4 = r13.category_idColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
        L123:
            java.lang.String r8 = r17.realmGet$last_modified()
            if (r8 == 0) goto L131
            long r4 = r13.last_modifiedColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
        L131:
            java.lang.String r8 = r17.realmGet$tmdb()
            if (r8 == 0) goto L13f
            long r4 = r13.tmdbColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
        L13f:
            long r4 = r13.season_posColKey
            int r1 = r17.realmGet$season_pos()
            long r8 = (long) r1
            r10 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetLong(r2, r4, r6, r8, r10)
            long r4 = r13.episode_posColKey
            int r1 = r17.realmGet$episode_pos()
            long r8 = (long) r1
            io.realm.internal.Table.nativeSetLong(r2, r4, r6, r8, r10)
            long r4 = r13.is_watchedColKey
            boolean r8 = r17.realmGet$is_watched()
            r9 = 0
            io.realm.internal.Table.nativeSetBoolean(r2, r4, r6, r8, r9)
            long r4 = r13.is_favoriteColKey
            boolean r8 = r17.realmGet$is_favorite()
            io.realm.internal.Table.nativeSetBoolean(r2, r4, r6, r8, r9)
            long r4 = r13.is_recentColKey
            boolean r8 = r17.realmGet$is_recent()
            io.realm.internal.Table.nativeSetBoolean(r2, r4, r6, r8, r9)
            java.lang.String r8 = r17.realmGet$category_name()
            if (r8 == 0) goto L180
            long r4 = r13.category_nameColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
        L180:
            java.lang.String r8 = r17.realmGet$url()
            if (r8 == 0) goto L18e
            long r4 = r13.urlColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
        L18e:
            return r14
    }

    public static void insert(io.realm.Realm r18, java.util.Iterator<? extends io.realm.RealmModel> r19, java.util.Map<io.realm.RealmModel, java.lang.Long> r20) {
            r0 = r20
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r1 = com.flextv.livestore.models.SeriesModel.class
            r2 = r18
            io.realm.internal.Table r1 = r2.getTable(r1)
            long r12 = r1.getNativePtr()
            io.realm.RealmSchema r3 = r18.getSchema()
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r4 = com.flextv.livestore.models.SeriesModel.class
            io.realm.internal.ColumnInfo r3 = r3.getColumnInfo(r4)
            r14 = r3
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r14 = (io.realm.com_flextv_livestore_models_SeriesModelRealmProxy.SeriesModelColumnInfo) r14
        L1b:
            boolean r3 = r19.hasNext()
            if (r3 == 0) goto L1bd
            java.lang.Object r3 = r19.next()
            r15 = r3
            com.flextv.livestore.models.SeriesModel r15 = (com.flextv.livestore.models.SeriesModel) r15
            boolean r3 = r0.containsKey(r15)
            if (r3 == 0) goto L2f
            goto L1b
        L2f:
            boolean r3 = r15 instanceof io.realm.internal.RealmObjectProxy
            if (r3 == 0) goto L70
            boolean r3 = io.realm.RealmObject.isFrozen(r15)
            if (r3 != 0) goto L70
            r3 = r15
            io.realm.internal.RealmObjectProxy r3 = (io.realm.internal.RealmObjectProxy) r3
            io.realm.ProxyState r4 = r3.realmGet$proxyState()
            io.realm.BaseRealm r4 = r4.getRealm$realm()
            if (r4 == 0) goto L70
            io.realm.ProxyState r4 = r3.realmGet$proxyState()
            io.realm.BaseRealm r4 = r4.getRealm$realm()
            java.lang.String r4 = r4.getPath()
            java.lang.String r5 = r18.getPath()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L70
            io.realm.ProxyState r3 = r3.realmGet$proxyState()
            io.realm.internal.Row r3 = r3.getRow$realm()
            long r3 = r3.getObjectKey()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0.put(r15, r3)
            goto L1b
        L70:
            long r16 = io.realm.internal.OsObject.createRow(r1)
            java.lang.Long r3 = java.lang.Long.valueOf(r16)
            r0.put(r15, r3)
            long r5 = r14.numColKey
            int r3 = r15.realmGet$num()
            long r9 = (long) r3
            r11 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetLong(r3, r5, r7, r9, r11)
            java.lang.String r9 = r15.realmGet$name()
            if (r9 == 0) goto L98
            long r5 = r14.nameColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
        L98:
            java.lang.String r9 = r15.realmGet$stream_type()
            if (r9 == 0) goto La7
            long r5 = r14.stream_typeColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
        La7:
            java.lang.String r9 = r15.realmGet$series_id()
            if (r9 == 0) goto Lb6
            long r5 = r14.series_idColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
        Lb6:
            java.lang.String r9 = r15.realmGet$stream_icon()
            if (r9 == 0) goto Lc5
            long r5 = r14.stream_iconColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
        Lc5:
            java.lang.String r9 = r15.realmGet$youtube()
            if (r9 == 0) goto Ld4
            long r5 = r14.youtubeColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
        Ld4:
            java.lang.String r9 = r15.realmGet$plot()
            if (r9 == 0) goto Le3
            long r5 = r14.plotColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
        Le3:
            java.lang.String r9 = r15.realmGet$cast()
            if (r9 == 0) goto Lf2
            long r5 = r14.castColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
        Lf2:
            java.lang.String r9 = r15.realmGet$director()
            if (r9 == 0) goto L101
            long r5 = r14.directorColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
        L101:
            java.lang.String r9 = r15.realmGet$genre()
            if (r9 == 0) goto L110
            long r5 = r14.genreColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
        L110:
            java.lang.String r9 = r15.realmGet$releaseDate()
            if (r9 == 0) goto L11f
            long r5 = r14.releaseDateColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
        L11f:
            java.lang.String r9 = r15.realmGet$rating()
            if (r9 == 0) goto L12e
            long r5 = r14.ratingColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
        L12e:
            long r5 = r14.rating_5basedColKey
            float r9 = r15.realmGet$rating_5based()
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetFloat(r3, r5, r7, r9, r10)
            java.lang.String r9 = r15.realmGet$category_id()
            if (r9 == 0) goto L14a
            long r5 = r14.category_idColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
        L14a:
            java.lang.String r9 = r15.realmGet$last_modified()
            if (r9 == 0) goto L159
            long r5 = r14.last_modifiedColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
        L159:
            java.lang.String r9 = r15.realmGet$tmdb()
            if (r9 == 0) goto L168
            long r5 = r14.tmdbColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
        L168:
            long r5 = r14.season_posColKey
            int r3 = r15.realmGet$season_pos()
            long r9 = (long) r3
            r11 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetLong(r3, r5, r7, r9, r11)
            long r5 = r14.episode_posColKey
            int r3 = r15.realmGet$episode_pos()
            long r9 = (long) r3
            r3 = r12
            io.realm.internal.Table.nativeSetLong(r3, r5, r7, r9, r11)
            long r5 = r14.is_watchedColKey
            boolean r9 = r15.realmGet$is_watched()
            r10 = 0
            io.realm.internal.Table.nativeSetBoolean(r3, r5, r7, r9, r10)
            long r5 = r14.is_favoriteColKey
            boolean r9 = r15.realmGet$is_favorite()
            io.realm.internal.Table.nativeSetBoolean(r3, r5, r7, r9, r10)
            long r5 = r14.is_recentColKey
            boolean r9 = r15.realmGet$is_recent()
            io.realm.internal.Table.nativeSetBoolean(r3, r5, r7, r9, r10)
            java.lang.String r9 = r15.realmGet$category_name()
            if (r9 == 0) goto L1ac
            long r5 = r14.category_nameColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
        L1ac:
            java.lang.String r9 = r15.realmGet$url()
            if (r9 == 0) goto L1b
            long r5 = r14.urlColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto L1b
        L1bd:
            return
    }

    public static long insertOrUpdate(io.realm.Realm r16, com.flextv.livestore.models.SeriesModel r17, java.util.Map<io.realm.RealmModel, java.lang.Long> r18) {
            r0 = r17
            boolean r1 = r0 instanceof io.realm.internal.RealmObjectProxy
            if (r1 == 0) goto L3c
            boolean r1 = io.realm.RealmObject.isFrozen(r17)
            if (r1 != 0) goto L3c
            r1 = r0
            io.realm.internal.RealmObjectProxy r1 = (io.realm.internal.RealmObjectProxy) r1
            io.realm.ProxyState r2 = r1.realmGet$proxyState()
            io.realm.BaseRealm r2 = r2.getRealm$realm()
            if (r2 == 0) goto L3c
            io.realm.ProxyState r2 = r1.realmGet$proxyState()
            io.realm.BaseRealm r2 = r2.getRealm$realm()
            java.lang.String r2 = r2.getPath()
            java.lang.String r3 = r16.getPath()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L3c
            io.realm.ProxyState r0 = r1.realmGet$proxyState()
            io.realm.internal.Row r0 = r0.getRow$realm()
            long r0 = r0.getObjectKey()
            return r0
        L3c:
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r1 = com.flextv.livestore.models.SeriesModel.class
            r2 = r16
            io.realm.internal.Table r1 = r2.getTable(r1)
            long r11 = r1.getNativePtr()
            io.realm.RealmSchema r2 = r16.getSchema()
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r3 = com.flextv.livestore.models.SeriesModel.class
            io.realm.internal.ColumnInfo r2 = r2.getColumnInfo(r3)
            r13 = r2
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r13 = (io.realm.com_flextv_livestore_models_SeriesModelRealmProxy.SeriesModelColumnInfo) r13
            long r14 = io.realm.internal.OsObject.createRow(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r14)
            r2 = r18
            r2.put(r0, r1)
            long r4 = r13.numColKey
            int r1 = r17.realmGet$num()
            long r8 = (long) r1
            r10 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetLong(r2, r4, r6, r8, r10)
            java.lang.String r8 = r17.realmGet$name()
            if (r8 == 0) goto L7e
            long r4 = r13.nameColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
            goto L86
        L7e:
            long r4 = r13.nameColKey
            r8 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetNull(r2, r4, r6, r8)
        L86:
            java.lang.String r8 = r17.realmGet$stream_type()
            if (r8 == 0) goto L95
            long r4 = r13.stream_typeColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
            goto L9d
        L95:
            long r4 = r13.stream_typeColKey
            r8 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetNull(r2, r4, r6, r8)
        L9d:
            java.lang.String r8 = r17.realmGet$series_id()
            if (r8 == 0) goto Lac
            long r4 = r13.series_idColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
            goto Lb4
        Lac:
            long r4 = r13.series_idColKey
            r8 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetNull(r2, r4, r6, r8)
        Lb4:
            java.lang.String r8 = r17.realmGet$stream_icon()
            if (r8 == 0) goto Lc3
            long r4 = r13.stream_iconColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
            goto Lcb
        Lc3:
            long r4 = r13.stream_iconColKey
            r8 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetNull(r2, r4, r6, r8)
        Lcb:
            java.lang.String r8 = r17.realmGet$youtube()
            if (r8 == 0) goto Lda
            long r4 = r13.youtubeColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
            goto Le2
        Lda:
            long r4 = r13.youtubeColKey
            r8 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetNull(r2, r4, r6, r8)
        Le2:
            java.lang.String r8 = r17.realmGet$plot()
            if (r8 == 0) goto Lf1
            long r4 = r13.plotColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
            goto Lf9
        Lf1:
            long r4 = r13.plotColKey
            r8 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetNull(r2, r4, r6, r8)
        Lf9:
            java.lang.String r8 = r17.realmGet$cast()
            if (r8 == 0) goto L108
            long r4 = r13.castColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
            goto L110
        L108:
            long r4 = r13.castColKey
            r8 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetNull(r2, r4, r6, r8)
        L110:
            java.lang.String r8 = r17.realmGet$director()
            if (r8 == 0) goto L11f
            long r4 = r13.directorColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
            goto L127
        L11f:
            long r4 = r13.directorColKey
            r8 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetNull(r2, r4, r6, r8)
        L127:
            java.lang.String r8 = r17.realmGet$genre()
            if (r8 == 0) goto L136
            long r4 = r13.genreColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
            goto L13e
        L136:
            long r4 = r13.genreColKey
            r8 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetNull(r2, r4, r6, r8)
        L13e:
            java.lang.String r8 = r17.realmGet$releaseDate()
            if (r8 == 0) goto L14d
            long r4 = r13.releaseDateColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
            goto L155
        L14d:
            long r4 = r13.releaseDateColKey
            r8 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetNull(r2, r4, r6, r8)
        L155:
            java.lang.String r8 = r17.realmGet$rating()
            if (r8 == 0) goto L164
            long r4 = r13.ratingColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
            goto L16c
        L164:
            long r4 = r13.ratingColKey
            r8 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetNull(r2, r4, r6, r8)
        L16c:
            long r4 = r13.rating_5basedColKey
            float r8 = r17.realmGet$rating_5based()
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetFloat(r2, r4, r6, r8, r9)
            java.lang.String r8 = r17.realmGet$category_id()
            if (r8 == 0) goto L187
            long r4 = r13.category_idColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
            goto L18f
        L187:
            long r4 = r13.category_idColKey
            r8 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetNull(r2, r4, r6, r8)
        L18f:
            java.lang.String r8 = r17.realmGet$last_modified()
            if (r8 == 0) goto L19e
            long r4 = r13.last_modifiedColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
            goto L1a6
        L19e:
            long r4 = r13.last_modifiedColKey
            r8 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetNull(r2, r4, r6, r8)
        L1a6:
            java.lang.String r8 = r17.realmGet$tmdb()
            if (r8 == 0) goto L1b5
            long r4 = r13.tmdbColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
            goto L1bd
        L1b5:
            long r4 = r13.tmdbColKey
            r8 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetNull(r2, r4, r6, r8)
        L1bd:
            long r4 = r13.season_posColKey
            int r1 = r17.realmGet$season_pos()
            long r8 = (long) r1
            r10 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetLong(r2, r4, r6, r8, r10)
            long r4 = r13.episode_posColKey
            int r1 = r17.realmGet$episode_pos()
            long r8 = (long) r1
            io.realm.internal.Table.nativeSetLong(r2, r4, r6, r8, r10)
            long r4 = r13.is_watchedColKey
            boolean r8 = r17.realmGet$is_watched()
            r9 = 0
            io.realm.internal.Table.nativeSetBoolean(r2, r4, r6, r8, r9)
            long r4 = r13.is_favoriteColKey
            boolean r8 = r17.realmGet$is_favorite()
            io.realm.internal.Table.nativeSetBoolean(r2, r4, r6, r8, r9)
            long r4 = r13.is_recentColKey
            boolean r8 = r17.realmGet$is_recent()
            io.realm.internal.Table.nativeSetBoolean(r2, r4, r6, r8, r9)
            java.lang.String r8 = r17.realmGet$category_name()
            if (r8 == 0) goto L1ff
            long r4 = r13.category_nameColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
            goto L207
        L1ff:
            long r4 = r13.category_nameColKey
            r8 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetNull(r2, r4, r6, r8)
        L207:
            java.lang.String r8 = r17.realmGet$url()
            if (r8 == 0) goto L216
            long r4 = r13.urlColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
            goto L21e
        L216:
            long r4 = r13.urlColKey
            r8 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetNull(r2, r4, r6, r8)
        L21e:
            return r14
    }

    public static void insertOrUpdate(io.realm.Realm r18, java.util.Iterator<? extends io.realm.RealmModel> r19, java.util.Map<io.realm.RealmModel, java.lang.Long> r20) {
            r0 = r20
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r1 = com.flextv.livestore.models.SeriesModel.class
            r2 = r18
            io.realm.internal.Table r1 = r2.getTable(r1)
            long r12 = r1.getNativePtr()
            io.realm.RealmSchema r3 = r18.getSchema()
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r4 = com.flextv.livestore.models.SeriesModel.class
            io.realm.internal.ColumnInfo r3 = r3.getColumnInfo(r4)
            r14 = r3
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r14 = (io.realm.com_flextv_livestore_models_SeriesModelRealmProxy.SeriesModelColumnInfo) r14
        L1b:
            boolean r3 = r19.hasNext()
            if (r3 == 0) goto L25e
            java.lang.Object r3 = r19.next()
            r15 = r3
            com.flextv.livestore.models.SeriesModel r15 = (com.flextv.livestore.models.SeriesModel) r15
            boolean r3 = r0.containsKey(r15)
            if (r3 == 0) goto L2f
            goto L1b
        L2f:
            boolean r3 = r15 instanceof io.realm.internal.RealmObjectProxy
            if (r3 == 0) goto L70
            boolean r3 = io.realm.RealmObject.isFrozen(r15)
            if (r3 != 0) goto L70
            r3 = r15
            io.realm.internal.RealmObjectProxy r3 = (io.realm.internal.RealmObjectProxy) r3
            io.realm.ProxyState r4 = r3.realmGet$proxyState()
            io.realm.BaseRealm r4 = r4.getRealm$realm()
            if (r4 == 0) goto L70
            io.realm.ProxyState r4 = r3.realmGet$proxyState()
            io.realm.BaseRealm r4 = r4.getRealm$realm()
            java.lang.String r4 = r4.getPath()
            java.lang.String r5 = r18.getPath()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L70
            io.realm.ProxyState r3 = r3.realmGet$proxyState()
            io.realm.internal.Row r3 = r3.getRow$realm()
            long r3 = r3.getObjectKey()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0.put(r15, r3)
            goto L1b
        L70:
            long r16 = io.realm.internal.OsObject.createRow(r1)
            java.lang.Long r3 = java.lang.Long.valueOf(r16)
            r0.put(r15, r3)
            long r5 = r14.numColKey
            int r3 = r15.realmGet$num()
            long r9 = (long) r3
            r11 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetLong(r3, r5, r7, r9, r11)
            java.lang.String r9 = r15.realmGet$name()
            if (r9 == 0) goto L99
            long r5 = r14.nameColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto La2
        L99:
            long r5 = r14.nameColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
        La2:
            java.lang.String r9 = r15.realmGet$stream_type()
            if (r9 == 0) goto Lb2
            long r5 = r14.stream_typeColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto Lbb
        Lb2:
            long r5 = r14.stream_typeColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
        Lbb:
            java.lang.String r9 = r15.realmGet$series_id()
            if (r9 == 0) goto Lcb
            long r5 = r14.series_idColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto Ld4
        Lcb:
            long r5 = r14.series_idColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
        Ld4:
            java.lang.String r9 = r15.realmGet$stream_icon()
            if (r9 == 0) goto Le4
            long r5 = r14.stream_iconColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto Led
        Le4:
            long r5 = r14.stream_iconColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
        Led:
            java.lang.String r9 = r15.realmGet$youtube()
            if (r9 == 0) goto Lfd
            long r5 = r14.youtubeColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto L106
        Lfd:
            long r5 = r14.youtubeColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
        L106:
            java.lang.String r9 = r15.realmGet$plot()
            if (r9 == 0) goto L116
            long r5 = r14.plotColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto L11f
        L116:
            long r5 = r14.plotColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
        L11f:
            java.lang.String r9 = r15.realmGet$cast()
            if (r9 == 0) goto L12f
            long r5 = r14.castColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto L138
        L12f:
            long r5 = r14.castColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
        L138:
            java.lang.String r9 = r15.realmGet$director()
            if (r9 == 0) goto L148
            long r5 = r14.directorColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto L151
        L148:
            long r5 = r14.directorColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
        L151:
            java.lang.String r9 = r15.realmGet$genre()
            if (r9 == 0) goto L161
            long r5 = r14.genreColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto L16a
        L161:
            long r5 = r14.genreColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
        L16a:
            java.lang.String r9 = r15.realmGet$releaseDate()
            if (r9 == 0) goto L17a
            long r5 = r14.releaseDateColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto L183
        L17a:
            long r5 = r14.releaseDateColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
        L183:
            java.lang.String r9 = r15.realmGet$rating()
            if (r9 == 0) goto L193
            long r5 = r14.ratingColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto L19c
        L193:
            long r5 = r14.ratingColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
        L19c:
            long r5 = r14.rating_5basedColKey
            float r9 = r15.realmGet$rating_5based()
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetFloat(r3, r5, r7, r9, r10)
            java.lang.String r9 = r15.realmGet$category_id()
            if (r9 == 0) goto L1b9
            long r5 = r14.category_idColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto L1c2
        L1b9:
            long r5 = r14.category_idColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
        L1c2:
            java.lang.String r9 = r15.realmGet$last_modified()
            if (r9 == 0) goto L1d2
            long r5 = r14.last_modifiedColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto L1db
        L1d2:
            long r5 = r14.last_modifiedColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
        L1db:
            java.lang.String r9 = r15.realmGet$tmdb()
            if (r9 == 0) goto L1eb
            long r5 = r14.tmdbColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto L1f4
        L1eb:
            long r5 = r14.tmdbColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
        L1f4:
            long r5 = r14.season_posColKey
            int r3 = r15.realmGet$season_pos()
            long r9 = (long) r3
            r11 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetLong(r3, r5, r7, r9, r11)
            long r5 = r14.episode_posColKey
            int r3 = r15.realmGet$episode_pos()
            long r9 = (long) r3
            r3 = r12
            io.realm.internal.Table.nativeSetLong(r3, r5, r7, r9, r11)
            long r5 = r14.is_watchedColKey
            boolean r9 = r15.realmGet$is_watched()
            r10 = 0
            io.realm.internal.Table.nativeSetBoolean(r3, r5, r7, r9, r10)
            long r5 = r14.is_favoriteColKey
            boolean r9 = r15.realmGet$is_favorite()
            io.realm.internal.Table.nativeSetBoolean(r3, r5, r7, r9, r10)
            long r5 = r14.is_recentColKey
            boolean r9 = r15.realmGet$is_recent()
            io.realm.internal.Table.nativeSetBoolean(r3, r5, r7, r9, r10)
            java.lang.String r9 = r15.realmGet$category_name()
            if (r9 == 0) goto L239
            long r5 = r14.category_nameColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto L242
        L239:
            long r5 = r14.category_nameColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
        L242:
            java.lang.String r9 = r15.realmGet$url()
            if (r9 == 0) goto L253
            long r5 = r14.urlColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto L1b
        L253:
            long r5 = r14.urlColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
            goto L1b
        L25e:
            return
    }

    public boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto L95
            java.lang.Class r2 = r6.getClass()
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L13
            goto L95
        L13:
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy r7 = (io.realm.com_flextv_livestore_models_SeriesModelRealmProxy) r7
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r2 = r6.proxyState
            io.realm.BaseRealm r2 = r2.getRealm$realm()
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r3 = r7.proxyState
            io.realm.BaseRealm r3 = r3.getRealm$realm()
            java.lang.String r4 = r2.getPath()
            java.lang.String r5 = r3.getPath()
            if (r4 == 0) goto L32
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L35
            goto L34
        L32:
            if (r5 == 0) goto L35
        L34:
            return r1
        L35:
            boolean r4 = r2.isFrozen()
            boolean r5 = r3.isFrozen()
            if (r4 == r5) goto L40
            return r1
        L40:
            io.realm.internal.OsSharedRealm r2 = r2.sharedRealm
            io.realm.internal.OsSharedRealm$VersionID r2 = r2.getVersionID()
            io.realm.internal.OsSharedRealm r3 = r3.sharedRealm
            io.realm.internal.OsSharedRealm$VersionID r3 = r3.getVersionID()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L53
            return r1
        L53:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r2 = r6.proxyState
            io.realm.internal.Row r2 = r2.getRow$realm()
            io.realm.internal.Table r2 = r2.getTable()
            java.lang.String r2 = r2.getName()
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r3 = r7.proxyState
            io.realm.internal.Row r3 = r3.getRow$realm()
            io.realm.internal.Table r3 = r3.getTable()
            java.lang.String r3 = r3.getName()
            if (r2 == 0) goto L78
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L7b
            goto L7a
        L78:
            if (r3 == 0) goto L7b
        L7a:
            return r1
        L7b:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r2 = r6.proxyState
            io.realm.internal.Row r2 = r2.getRow$realm()
            long r2 = r2.getObjectKey()
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r7 = r7.proxyState
            io.realm.internal.Row r7 = r7.getRow$realm()
            long r4 = r7.getObjectKey()
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 == 0) goto L94
            return r1
        L94:
            return r0
        L95:
            return r1
    }

    public int hashCode() {
            r6 = this;
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r6.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            java.lang.String r0 = r0.getPath()
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r1 = r6.proxyState
            io.realm.internal.Row r1 = r1.getRow$realm()
            io.realm.internal.Table r1 = r1.getTable()
            java.lang.String r1 = r1.getName()
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r2 = r6.proxyState
            io.realm.internal.Row r2 = r2.getRow$realm()
            long r2 = r2.getObjectKey()
            r4 = 0
            if (r0 == 0) goto L2a
            int r0 = r0.hashCode()
            goto L2b
        L2a:
            r0 = 0
        L2b:
            r5 = 527(0x20f, float:7.38E-43)
            int r5 = r5 + r0
            int r5 = r5 * 31
            if (r1 == 0) goto L36
            int r4 = r1.hashCode()
        L36:
            int r5 = r5 + r4
            int r5 = r5 * 31
            r0 = 32
            long r0 = r2 >>> r0
            long r0 = r0 ^ r2
            int r1 = (int) r0
            int r5 = r5 + r1
            return r5
    }

    @Override // io.realm.internal.RealmObjectProxy
    public void realm$injectObjectContext() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r3.proxyState
            if (r0 == 0) goto L5
            return
        L5:
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r0 = io.realm.BaseRealm.objectContext
            java.lang.Object r0 = r0.get()
            io.realm.BaseRealm$RealmObjectContext r0 = (io.realm.BaseRealm.RealmObjectContext) r0
            io.realm.internal.ColumnInfo r1 = r0.getColumnInfo()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = (io.realm.com_flextv_livestore_models_SeriesModelRealmProxy.SeriesModelColumnInfo) r1
            r3.columnInfo = r1
            io.realm.ProxyState r1 = new io.realm.ProxyState
            r1.<init>(r3)
            r3.proxyState = r1
            io.realm.BaseRealm r2 = r0.getRealm()
            r1.setRealm$realm(r2)
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r1 = r3.proxyState
            io.realm.internal.Row r2 = r0.getRow()
            r1.setRow$realm(r2)
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r1 = r3.proxyState
            boolean r2 = r0.getAcceptDefaultValue()
            r1.setAcceptDefaultValue$realm(r2)
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r1 = r3.proxyState
            java.util.List r0 = r0.getExcludeFields()
            r1.setExcludeFields$realm(r0)
            return
    }

    @Override // com.flextv.livestore.models.SeriesModel, io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public java.lang.String realmGet$cast() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.castColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.SeriesModel, io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public java.lang.String realmGet$category_id() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.category_idColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.SeriesModel, io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public java.lang.String realmGet$category_name() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.category_nameColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.SeriesModel, io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public java.lang.String realmGet$director() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.directorColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.SeriesModel, io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public int realmGet$episode_pos() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.episode_posColKey
            long r0 = r0.getLong(r1)
            int r1 = (int) r0
            return r1
    }

    @Override // com.flextv.livestore.models.SeriesModel, io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public java.lang.String realmGet$genre() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.genreColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.SeriesModel, io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public boolean realmGet$is_favorite() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.is_favoriteColKey
            boolean r0 = r0.getBoolean(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.SeriesModel, io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public boolean realmGet$is_recent() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.is_recentColKey
            boolean r0 = r0.getBoolean(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.SeriesModel, io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public boolean realmGet$is_watched() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.is_watchedColKey
            boolean r0 = r0.getBoolean(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.SeriesModel, io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public java.lang.String realmGet$last_modified() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.last_modifiedColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.SeriesModel, io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public java.lang.String realmGet$name() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.nameColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.SeriesModel, io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public int realmGet$num() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.numColKey
            long r0 = r0.getLong(r1)
            int r1 = (int) r0
            return r1
    }

    @Override // com.flextv.livestore.models.SeriesModel, io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public java.lang.String realmGet$plot() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.plotColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // io.realm.internal.RealmObjectProxy
    public io.realm.ProxyState<?> realmGet$proxyState() {
            r1 = this;
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r1.proxyState
            return r0
    }

    @Override // com.flextv.livestore.models.SeriesModel, io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public java.lang.String realmGet$rating() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.ratingColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.SeriesModel, io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public float realmGet$rating_5based() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.rating_5basedColKey
            float r0 = r0.getFloat(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.SeriesModel, io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public java.lang.String realmGet$releaseDate() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.releaseDateColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.SeriesModel, io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public int realmGet$season_pos() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.season_posColKey
            long r0 = r0.getLong(r1)
            int r1 = (int) r0
            return r1
    }

    @Override // com.flextv.livestore.models.SeriesModel, io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public java.lang.String realmGet$series_id() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.series_idColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.SeriesModel, io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public java.lang.String realmGet$stream_icon() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.stream_iconColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.SeriesModel, io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public java.lang.String realmGet$stream_type() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.stream_typeColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.SeriesModel, io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public java.lang.String realmGet$tmdb() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.tmdbColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.SeriesModel, io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public java.lang.String realmGet$url() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.urlColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.SeriesModel, io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public java.lang.String realmGet$youtube() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.youtubeColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.SeriesModel, io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public void realmSet$cast(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r15 = r14.columnInfo
            long r2 = r15.castColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r14.columnInfo
            long r8 = r1.castColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r0 = r14.columnInfo
            long r0 = r0.castColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r14.columnInfo
            long r1 = r1.castColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.SeriesModel, io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public void realmSet$category_id(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r15 = r14.columnInfo
            long r2 = r15.category_idColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r14.columnInfo
            long r8 = r1.category_idColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r0 = r14.columnInfo
            long r0 = r0.category_idColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r14.columnInfo
            long r1 = r1.category_idColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.SeriesModel, io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public void realmSet$category_name(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r15 = r14.columnInfo
            long r2 = r15.category_nameColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r14.columnInfo
            long r8 = r1.category_nameColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r0 = r14.columnInfo
            long r0 = r0.category_nameColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r14.columnInfo
            long r1 = r1.category_nameColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.SeriesModel, io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public void realmSet$director(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r15 = r14.columnInfo
            long r2 = r15.directorColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r14.columnInfo
            long r8 = r1.directorColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r0 = r14.columnInfo
            long r0 = r0.directorColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r14.columnInfo
            long r1 = r1.directorColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.SeriesModel, io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public void realmSet$episode_pos(int r10) {
            r9 = this;
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r9.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L29
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r9.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r9.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r2 = r9.columnInfo
            long r2 = r2.episode_posColKey
            long r4 = r0.getObjectKey()
            long r6 = (long) r10
            r8 = 1
            r1.setLong(r2, r4, r6, r8)
            return
        L29:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r9.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r9.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r9.columnInfo
            long r1 = r1.episode_posColKey
            long r3 = (long) r10
            r0.setLong(r1, r3)
            return
    }

    @Override // com.flextv.livestore.models.SeriesModel, io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public void realmSet$genre(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r15 = r14.columnInfo
            long r2 = r15.genreColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r14.columnInfo
            long r8 = r1.genreColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r0 = r14.columnInfo
            long r0 = r0.genreColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r14.columnInfo
            long r1 = r1.genreColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.SeriesModel, io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public void realmSet$is_favorite(boolean r9) {
            r8 = this;
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r8.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L29
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r8.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r8.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r2 = r8.columnInfo
            long r2 = r2.is_favoriteColKey
            long r4 = r0.getObjectKey()
            r7 = 1
            r6 = r9
            r1.setBoolean(r2, r4, r6, r7)
            return
        L29:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r8.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r8.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r8.columnInfo
            long r1 = r1.is_favoriteColKey
            r0.setBoolean(r1, r9)
            return
    }

    @Override // com.flextv.livestore.models.SeriesModel, io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public void realmSet$is_recent(boolean r9) {
            r8 = this;
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r8.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L29
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r8.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r8.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r2 = r8.columnInfo
            long r2 = r2.is_recentColKey
            long r4 = r0.getObjectKey()
            r7 = 1
            r6 = r9
            r1.setBoolean(r2, r4, r6, r7)
            return
        L29:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r8.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r8.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r8.columnInfo
            long r1 = r1.is_recentColKey
            r0.setBoolean(r1, r9)
            return
    }

    @Override // com.flextv.livestore.models.SeriesModel, io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public void realmSet$is_watched(boolean r9) {
            r8 = this;
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r8.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L29
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r8.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r8.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r2 = r8.columnInfo
            long r2 = r2.is_watchedColKey
            long r4 = r0.getObjectKey()
            r7 = 1
            r6 = r9
            r1.setBoolean(r2, r4, r6, r7)
            return
        L29:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r8.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r8.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r8.columnInfo
            long r1 = r1.is_watchedColKey
            r0.setBoolean(r1, r9)
            return
    }

    @Override // com.flextv.livestore.models.SeriesModel, io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public void realmSet$last_modified(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r15 = r14.columnInfo
            long r2 = r15.last_modifiedColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r14.columnInfo
            long r8 = r1.last_modifiedColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r0 = r14.columnInfo
            long r0 = r0.last_modifiedColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r14.columnInfo
            long r1 = r1.last_modifiedColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.SeriesModel, io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public void realmSet$name(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r15 = r14.columnInfo
            long r2 = r15.nameColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r14.columnInfo
            long r8 = r1.nameColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r0 = r14.columnInfo
            long r0 = r0.nameColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r14.columnInfo
            long r1 = r1.nameColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.SeriesModel, io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public void realmSet$num(int r10) {
            r9 = this;
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r9.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L29
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r9.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r9.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r2 = r9.columnInfo
            long r2 = r2.numColKey
            long r4 = r0.getObjectKey()
            long r6 = (long) r10
            r8 = 1
            r1.setLong(r2, r4, r6, r8)
            return
        L29:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r9.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r9.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r9.columnInfo
            long r1 = r1.numColKey
            long r3 = (long) r10
            r0.setLong(r1, r3)
            return
    }

    @Override // com.flextv.livestore.models.SeriesModel, io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public void realmSet$plot(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r15 = r14.columnInfo
            long r2 = r15.plotColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r14.columnInfo
            long r8 = r1.plotColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r0 = r14.columnInfo
            long r0 = r0.plotColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r14.columnInfo
            long r1 = r1.plotColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.SeriesModel, io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public void realmSet$rating(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r15 = r14.columnInfo
            long r2 = r15.ratingColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r14.columnInfo
            long r8 = r1.ratingColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r0 = r14.columnInfo
            long r0 = r0.ratingColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r14.columnInfo
            long r1 = r1.ratingColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.SeriesModel, io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public void realmSet$rating_5based(float r9) {
            r8 = this;
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r8.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L29
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r8.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r8.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r2 = r8.columnInfo
            long r2 = r2.rating_5basedColKey
            long r4 = r0.getObjectKey()
            r7 = 1
            r6 = r9
            r1.setFloat(r2, r4, r6, r7)
            return
        L29:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r8.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r8.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r8.columnInfo
            long r1 = r1.rating_5basedColKey
            r0.setFloat(r1, r9)
            return
    }

    @Override // com.flextv.livestore.models.SeriesModel, io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public void realmSet$releaseDate(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r15 = r14.columnInfo
            long r2 = r15.releaseDateColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r14.columnInfo
            long r8 = r1.releaseDateColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r0 = r14.columnInfo
            long r0 = r0.releaseDateColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r14.columnInfo
            long r1 = r1.releaseDateColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.SeriesModel, io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public void realmSet$season_pos(int r10) {
            r9 = this;
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r9.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L29
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r9.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r9.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r2 = r9.columnInfo
            long r2 = r2.season_posColKey
            long r4 = r0.getObjectKey()
            long r6 = (long) r10
            r8 = 1
            r1.setLong(r2, r4, r6, r8)
            return
        L29:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r9.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r9.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r9.columnInfo
            long r1 = r1.season_posColKey
            long r3 = (long) r10
            r0.setLong(r1, r3)
            return
    }

    @Override // com.flextv.livestore.models.SeriesModel, io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public void realmSet$series_id(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r15 = r14.columnInfo
            long r2 = r15.series_idColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r14.columnInfo
            long r8 = r1.series_idColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r0 = r14.columnInfo
            long r0 = r0.series_idColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r14.columnInfo
            long r1 = r1.series_idColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.SeriesModel, io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public void realmSet$stream_icon(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r15 = r14.columnInfo
            long r2 = r15.stream_iconColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r14.columnInfo
            long r8 = r1.stream_iconColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r0 = r14.columnInfo
            long r0 = r0.stream_iconColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r14.columnInfo
            long r1 = r1.stream_iconColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.SeriesModel, io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public void realmSet$stream_type(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r15 = r14.columnInfo
            long r2 = r15.stream_typeColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r14.columnInfo
            long r8 = r1.stream_typeColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r0 = r14.columnInfo
            long r0 = r0.stream_typeColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r14.columnInfo
            long r1 = r1.stream_typeColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.SeriesModel, io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public void realmSet$tmdb(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r15 = r14.columnInfo
            long r2 = r15.tmdbColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r14.columnInfo
            long r8 = r1.tmdbColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r0 = r14.columnInfo
            long r0 = r0.tmdbColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r14.columnInfo
            long r1 = r1.tmdbColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.SeriesModel, io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public void realmSet$url(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r15 = r14.columnInfo
            long r2 = r15.urlColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r14.columnInfo
            long r8 = r1.urlColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r0 = r14.columnInfo
            long r0 = r0.urlColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r14.columnInfo
            long r1 = r1.urlColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.SeriesModel, io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public void realmSet$youtube(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r15 = r14.columnInfo
            long r2 = r15.youtubeColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r14.columnInfo
            long r8 = r1.youtubeColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r0 = r14.columnInfo
            long r0 = r0.youtubeColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.SeriesModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r1 = r14.columnInfo
            long r1 = r1.youtubeColKey
            r0.setString(r1, r15)
            return
    }

    public java.lang.String toString() {
            r6 = this;
            boolean r0 = io.realm.RealmObject.isValid(r6)
            if (r0 != 0) goto L9
            java.lang.String r0 = "Invalid object"
            return r0
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SeriesModel = proxy["
            r0.<init>(r1)
            java.lang.String r1 = "{num:"
            r0.append(r1)
            int r1 = r6.realmGet$num()
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r2 = ","
            r0.append(r2)
            java.lang.String r3 = "{name:"
            r0.append(r3)
            java.lang.String r3 = r6.realmGet$name()
            java.lang.String r4 = "null"
            if (r3 == 0) goto L3b
            java.lang.String r3 = r6.realmGet$name()
            goto L3c
        L3b:
            r3 = r4
        L3c:
            java.lang.String r5 = "{stream_type:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r3, r1, r2, r5)
            java.lang.String r3 = r6.realmGet$stream_type()
            if (r3 == 0) goto L4d
            java.lang.String r3 = r6.realmGet$stream_type()
            goto L4e
        L4d:
            r3 = r4
        L4e:
            java.lang.String r5 = "{series_id:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r3, r1, r2, r5)
            java.lang.String r3 = r6.realmGet$series_id()
            if (r3 == 0) goto L5f
            java.lang.String r3 = r6.realmGet$series_id()
            goto L60
        L5f:
            r3 = r4
        L60:
            java.lang.String r5 = "{stream_icon:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r3, r1, r2, r5)
            java.lang.String r3 = r6.realmGet$stream_icon()
            if (r3 == 0) goto L71
            java.lang.String r3 = r6.realmGet$stream_icon()
            goto L72
        L71:
            r3 = r4
        L72:
            java.lang.String r5 = "{youtube:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r3, r1, r2, r5)
            java.lang.String r3 = r6.realmGet$youtube()
            if (r3 == 0) goto L83
            java.lang.String r3 = r6.realmGet$youtube()
            goto L84
        L83:
            r3 = r4
        L84:
            java.lang.String r5 = "{plot:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r3, r1, r2, r5)
            java.lang.String r3 = r6.realmGet$plot()
            if (r3 == 0) goto L95
            java.lang.String r3 = r6.realmGet$plot()
            goto L96
        L95:
            r3 = r4
        L96:
            java.lang.String r5 = "{cast:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r3, r1, r2, r5)
            java.lang.String r3 = r6.realmGet$cast()
            if (r3 == 0) goto La7
            java.lang.String r3 = r6.realmGet$cast()
            goto La8
        La7:
            r3 = r4
        La8:
            java.lang.String r5 = "{director:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r3, r1, r2, r5)
            java.lang.String r3 = r6.realmGet$director()
            if (r3 == 0) goto Lb9
            java.lang.String r3 = r6.realmGet$director()
            goto Lba
        Lb9:
            r3 = r4
        Lba:
            java.lang.String r5 = "{genre:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r3, r1, r2, r5)
            java.lang.String r3 = r6.realmGet$genre()
            if (r3 == 0) goto Lcb
            java.lang.String r3 = r6.realmGet$genre()
            goto Lcc
        Lcb:
            r3 = r4
        Lcc:
            java.lang.String r5 = "{releaseDate:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r3, r1, r2, r5)
            java.lang.String r3 = r6.realmGet$releaseDate()
            if (r3 == 0) goto Ldd
            java.lang.String r3 = r6.realmGet$releaseDate()
            goto Lde
        Ldd:
            r3 = r4
        Lde:
            java.lang.String r5 = "{rating:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r3, r1, r2, r5)
            java.lang.String r3 = r6.realmGet$rating()
            if (r3 == 0) goto Lef
            java.lang.String r3 = r6.realmGet$rating()
            goto Lf0
        Lef:
            r3 = r4
        Lf0:
            java.lang.String r5 = "{rating_5based:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r3, r1, r2, r5)
            float r3 = r6.realmGet$rating_5based()
            r0.append(r3)
            r0.append(r1)
            r0.append(r2)
            java.lang.String r3 = "{category_id:"
            r0.append(r3)
            java.lang.String r3 = r6.realmGet$category_id()
            if (r3 == 0) goto L114
            java.lang.String r3 = r6.realmGet$category_id()
            goto L115
        L114:
            r3 = r4
        L115:
            java.lang.String r5 = "{last_modified:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r3, r1, r2, r5)
            java.lang.String r3 = r6.realmGet$last_modified()
            if (r3 == 0) goto L126
            java.lang.String r3 = r6.realmGet$last_modified()
            goto L127
        L126:
            r3 = r4
        L127:
            java.lang.String r5 = "{tmdb:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r3, r1, r2, r5)
            java.lang.String r3 = r6.realmGet$tmdb()
            if (r3 == 0) goto L138
            java.lang.String r3 = r6.realmGet$tmdb()
            goto L139
        L138:
            r3 = r4
        L139:
            java.lang.String r5 = "{season_pos:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r3, r1, r2, r5)
            int r3 = r6.realmGet$season_pos()
            r0.append(r3)
            r0.append(r1)
            r0.append(r2)
            java.lang.String r3 = "{episode_pos:"
            r0.append(r3)
            int r3 = r6.realmGet$episode_pos()
            r0.append(r3)
            r0.append(r1)
            r0.append(r2)
            java.lang.String r3 = "{is_watched:"
            r0.append(r3)
            boolean r3 = r6.realmGet$is_watched()
            r0.append(r3)
            r0.append(r1)
            r0.append(r2)
            java.lang.String r3 = "{is_favorite:"
            r0.append(r3)
            boolean r3 = r6.realmGet$is_favorite()
            r0.append(r3)
            r0.append(r1)
            r0.append(r2)
            java.lang.String r3 = "{is_recent:"
            r0.append(r3)
            boolean r3 = r6.realmGet$is_recent()
            r0.append(r3)
            r0.append(r1)
            r0.append(r2)
            java.lang.String r3 = "{category_name:"
            r0.append(r3)
            java.lang.String r3 = r6.realmGet$category_name()
            if (r3 == 0) goto L1a9
            java.lang.String r3 = r6.realmGet$category_name()
            goto L1aa
        L1a9:
            r3 = r4
        L1aa:
            java.lang.String r5 = "{url:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r3, r1, r2, r5)
            java.lang.String r2 = r6.realmGet$url()
            if (r2 == 0) goto L1ba
            java.lang.String r4 = r6.realmGet$url()
        L1ba:
            java.lang.String r2 = "]"
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r4, r1, r2)
            return r0
    }
}
