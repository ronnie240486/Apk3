package io.realm;

/* JADX INFO: loaded from: classes2.dex */
public class com_flextv_livestore_models_MovieModelRealmProxy extends com.flextv.livestore.models.MovieModel implements io.realm.internal.RealmObjectProxy {
    private static final java.lang.String NO_ALIAS = "";
    private static final io.realm.internal.OsObjectSchemaInfo expectedObjectSchemaInfo = null;
    private io.realm.com_flextv_livestore_models_MovieModelRealmProxy.MovieModelColumnInfo columnInfo;
    private io.realm.ProxyState<com.flextv.livestore.models.MovieModel> proxyState;

    /* JADX INFO: loaded from: classes.dex */
    public static final class ClassNameHelper {
        public static final java.lang.String INTERNAL_CLASS_NAME = "MovieModel";

        public ClassNameHelper() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class MovieModelColumnInfo extends io.realm.internal.ColumnInfo {
        public long addedColKey;
        public long category_idColKey;
        public long category_nameColKey;
        public long custom_sidColKey;
        public long extensionColKey;
        public long is_favoriteColKey;
        public long is_lockedColKey;
        public long is_recentColKey;
        public long nameColKey;
        public long numColKey;
        public long proColKey;
        public long ratingColKey;
        public long recent_milColKey;
        public long stream_iconColKey;
        public long stream_idColKey;
        public long stream_typeColKey;
        public long timeColKey;
        public long tmdb_idColKey;
        public long typeColKey;
        public long urlColKey;

        public MovieModelColumnInfo(io.realm.internal.OsSchemaInfo r3) {
                r2 = this;
                r0 = 20
                r2.<init>(r0)
                java.lang.String r0 = "MovieModel"
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
                java.lang.String r0 = "stream_id"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.stream_idColKey = r0
                java.lang.String r0 = "stream_icon"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.stream_iconColKey = r0
                java.lang.String r0 = "extension"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.extensionColKey = r0
                java.lang.String r0 = "type"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.typeColKey = r0
                java.lang.String r0 = "rating"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.ratingColKey = r0
                java.lang.String r0 = "category_id"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.category_idColKey = r0
                java.lang.String r0 = "custom_sid"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.custom_sidColKey = r0
                java.lang.String r0 = "added"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.addedColKey = r0
                java.lang.String r0 = "tmdb_id"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.tmdb_idColKey = r0
                java.lang.String r0 = "pro"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.proColKey = r0
                java.lang.String r0 = "time"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.timeColKey = r0
                java.lang.String r0 = "recent_mil"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.recent_milColKey = r0
                java.lang.String r0 = "is_locked"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.is_lockedColKey = r0
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
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.urlColKey = r0
                return
        }

        @Override // io.realm.internal.ColumnInfo
        public final void copy(io.realm.internal.ColumnInfo r3, io.realm.internal.ColumnInfo r4) {
                r2 = this;
                io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r3 = (io.realm.com_flextv_livestore_models_MovieModelRealmProxy.MovieModelColumnInfo) r3
                io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r4 = (io.realm.com_flextv_livestore_models_MovieModelRealmProxy.MovieModelColumnInfo) r4
                long r0 = r3.numColKey
                r4.numColKey = r0
                long r0 = r3.nameColKey
                r4.nameColKey = r0
                long r0 = r3.stream_typeColKey
                r4.stream_typeColKey = r0
                long r0 = r3.stream_idColKey
                r4.stream_idColKey = r0
                long r0 = r3.stream_iconColKey
                r4.stream_iconColKey = r0
                long r0 = r3.extensionColKey
                r4.extensionColKey = r0
                long r0 = r3.typeColKey
                r4.typeColKey = r0
                long r0 = r3.ratingColKey
                r4.ratingColKey = r0
                long r0 = r3.category_idColKey
                r4.category_idColKey = r0
                long r0 = r3.custom_sidColKey
                r4.custom_sidColKey = r0
                long r0 = r3.addedColKey
                r4.addedColKey = r0
                long r0 = r3.tmdb_idColKey
                r4.tmdb_idColKey = r0
                long r0 = r3.proColKey
                r4.proColKey = r0
                long r0 = r3.timeColKey
                r4.timeColKey = r0
                long r0 = r3.recent_milColKey
                r4.recent_milColKey = r0
                long r0 = r3.is_lockedColKey
                r4.is_lockedColKey = r0
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
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy.expectedObjectSchemaInfo = r0
            return
    }

    public com_flextv_livestore_models_MovieModelRealmProxy() {
            r1 = this;
            r1.<init>()
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r1.proxyState
            r0.setConstructionFinished()
            return
    }

    public static com.flextv.livestore.models.MovieModel copy(io.realm.Realm r9, io.realm.com_flextv_livestore_models_MovieModelRealmProxy.MovieModelColumnInfo r10, com.flextv.livestore.models.MovieModel r11, boolean r12, java.util.Map<io.realm.RealmModel, io.realm.internal.RealmObjectProxy> r13, java.util.Set<io.realm.ImportFlag> r14) {
            java.lang.Object r12 = r13.get(r11)
            io.realm.internal.RealmObjectProxy r12 = (io.realm.internal.RealmObjectProxy) r12
            if (r12 == 0) goto Lb
            com.flextv.livestore.models.MovieModel r12 = (com.flextv.livestore.models.MovieModel) r12
            return r12
        Lb:
            java.lang.Class<com.flextv.livestore.models.MovieModel> r12 = com.flextv.livestore.models.MovieModel.class
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
            long r1 = r10.stream_idColKey
            java.lang.String r12 = r11.realmGet$stream_id()
            r0.addString(r1, r12)
            long r1 = r10.stream_iconColKey
            java.lang.String r12 = r11.realmGet$stream_icon()
            r0.addString(r1, r12)
            long r1 = r10.extensionColKey
            java.lang.String r12 = r11.realmGet$extension()
            r0.addString(r1, r12)
            long r1 = r10.typeColKey
            java.lang.String r12 = r11.realmGet$type()
            r0.addString(r1, r12)
            long r1 = r10.ratingColKey
            java.lang.String r12 = r11.realmGet$rating()
            r0.addString(r1, r12)
            long r1 = r10.category_idColKey
            java.lang.String r12 = r11.realmGet$category_id()
            r0.addString(r1, r12)
            long r1 = r10.custom_sidColKey
            java.lang.String r12 = r11.realmGet$custom_sid()
            r0.addString(r1, r12)
            long r1 = r10.addedColKey
            java.lang.String r12 = r11.realmGet$added()
            r0.addString(r1, r12)
            long r1 = r10.tmdb_idColKey
            java.lang.String r12 = r11.realmGet$tmdb_id()
            r0.addString(r1, r12)
            long r1 = r10.proColKey
            int r12 = r11.realmGet$pro()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r0.addInteger(r1, r12)
            long r1 = r10.timeColKey
            long r3 = r11.realmGet$time()
            java.lang.Long r12 = java.lang.Long.valueOf(r3)
            r0.addInteger(r1, r12)
            long r1 = r10.recent_milColKey
            long r3 = r11.realmGet$recent_mil()
            java.lang.Long r12 = java.lang.Long.valueOf(r3)
            r0.addInteger(r1, r12)
            long r1 = r10.is_lockedColKey
            boolean r12 = r11.realmGet$is_locked()
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
            java.lang.Class<com.flextv.livestore.models.MovieModel> r14 = com.flextv.livestore.models.MovieModel.class
            io.realm.internal.ColumnInfo r6 = r12.getColumnInfo(r14)
            java.util.List r8 = java.util.Collections.emptyList()
            r7 = 0
            r3 = r10
            r4 = r9
            r3.set(r4, r5, r6, r7, r8)
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy r9 = new io.realm.com_flextv_livestore_models_MovieModelRealmProxy
            r9.<init>()
            r10.clear()
            r13.put(r11, r9)
            return r9
    }

    public static com.flextv.livestore.models.MovieModel copyOrUpdate(io.realm.Realm r6, io.realm.com_flextv_livestore_models_MovieModelRealmProxy.MovieModelColumnInfo r7, com.flextv.livestore.models.MovieModel r8, boolean r9, java.util.Map<io.realm.RealmModel, io.realm.internal.RealmObjectProxy> r10, java.util.Set<io.realm.ImportFlag> r11) {
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
            com.flextv.livestore.models.MovieModel r0 = (com.flextv.livestore.models.MovieModel) r0
            return r0
        L51:
            com.flextv.livestore.models.MovieModel r6 = copy(r6, r7, r8, r9, r10, r11)
            return r6
    }

    public static io.realm.com_flextv_livestore_models_MovieModelRealmProxy.MovieModelColumnInfo createColumnInfo(io.realm.internal.OsSchemaInfo r1) {
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r0 = new io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo
            r0.<init>(r1)
            return r0
    }

    public static com.flextv.livestore.models.MovieModel createDetachedCopy(com.flextv.livestore.models.MovieModel r2, int r3, int r4, java.util.Map<io.realm.RealmModel, io.realm.internal.RealmObjectProxy.CacheData<io.realm.RealmModel>> r5) {
            if (r3 > r4) goto Lc6
            if (r2 != 0) goto L6
            goto Lc6
        L6:
            java.lang.Object r4 = r5.get(r2)
            io.realm.internal.RealmObjectProxy$CacheData r4 = (io.realm.internal.RealmObjectProxy.CacheData) r4
            if (r4 != 0) goto L1c
            com.flextv.livestore.models.MovieModel r4 = new com.flextv.livestore.models.MovieModel
            r4.<init>()
            io.realm.internal.RealmObjectProxy$CacheData r0 = new io.realm.internal.RealmObjectProxy$CacheData
            r0.<init>(r3, r4)
            r5.put(r2, r0)
            goto L2c
        L1c:
            int r5 = r4.minDepth
            if (r3 < r5) goto L25
            E extends io.realm.RealmModel r2 = r4.object
            com.flextv.livestore.models.MovieModel r2 = (com.flextv.livestore.models.MovieModel) r2
            return r2
        L25:
            E extends io.realm.RealmModel r5 = r4.object
            com.flextv.livestore.models.MovieModel r5 = (com.flextv.livestore.models.MovieModel) r5
            r4.minDepth = r3
            r4 = r5
        L2c:
            r3 = r2
            io.realm.internal.RealmObjectProxy r3 = (io.realm.internal.RealmObjectProxy) r3
            io.realm.ProxyState r3 = r3.realmGet$proxyState()
            io.realm.BaseRealm r3 = r3.getRealm$realm()
            io.realm.Realm r3 = (io.realm.Realm) r3
            int r3 = r2.realmGet$num()
            r4.realmSet$num(r3)
            java.lang.String r3 = r2.realmGet$name()
            r4.realmSet$name(r3)
            java.lang.String r3 = r2.realmGet$stream_type()
            r4.realmSet$stream_type(r3)
            java.lang.String r3 = r2.realmGet$stream_id()
            r4.realmSet$stream_id(r3)
            java.lang.String r3 = r2.realmGet$stream_icon()
            r4.realmSet$stream_icon(r3)
            java.lang.String r3 = r2.realmGet$extension()
            r4.realmSet$extension(r3)
            java.lang.String r3 = r2.realmGet$type()
            r4.realmSet$type(r3)
            java.lang.String r3 = r2.realmGet$rating()
            r4.realmSet$rating(r3)
            java.lang.String r3 = r2.realmGet$category_id()
            r4.realmSet$category_id(r3)
            java.lang.String r3 = r2.realmGet$custom_sid()
            r4.realmSet$custom_sid(r3)
            java.lang.String r3 = r2.realmGet$added()
            r4.realmSet$added(r3)
            java.lang.String r3 = r2.realmGet$tmdb_id()
            r4.realmSet$tmdb_id(r3)
            int r3 = r2.realmGet$pro()
            r4.realmSet$pro(r3)
            long r0 = r2.realmGet$time()
            r4.realmSet$time(r0)
            long r0 = r2.realmGet$recent_mil()
            r4.realmSet$recent_mil(r0)
            boolean r3 = r2.realmGet$is_locked()
            r4.realmSet$is_locked(r3)
            boolean r3 = r2.realmGet$is_favorite()
            r4.realmSet$is_favorite(r3)
            boolean r3 = r2.realmGet$is_recent()
            r4.realmSet$is_recent(r3)
            java.lang.String r3 = r2.realmGet$category_name()
            r4.realmSet$category_name(r3)
            java.lang.String r2 = r2.realmGet$url()
            r4.realmSet$url(r2)
            return r4
        Lc6:
            r2 = 0
            return r2
    }

    private static io.realm.internal.OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
            io.realm.internal.OsObjectSchemaInfo$Builder r7 = new io.realm.internal.OsObjectSchemaInfo$Builder
            java.lang.String r1 = ""
            java.lang.String r2 = "MovieModel"
            r3 = 0
            r4 = 20
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
            java.lang.String r2 = "stream_id"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "stream_icon"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "extension"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "type"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "rating"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "category_id"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "custom_sid"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "added"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "tmdb_id"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "pro"
            r6 = 1
            r3 = r8
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "time"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "recent_mil"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            io.realm.RealmFieldType r8 = io.realm.RealmFieldType.BOOLEAN
            java.lang.String r1 = ""
            java.lang.String r2 = "is_locked"
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

    public static com.flextv.livestore.models.MovieModel createOrUpdateUsingJsonObject(io.realm.Realm r4, org.json.JSONObject r5, boolean r6) throws org.json.JSONException {
            java.util.List r6 = java.util.Collections.emptyList()
            java.lang.Class<com.flextv.livestore.models.MovieModel> r0 = com.flextv.livestore.models.MovieModel.class
            io.realm.RealmModel r4 = r4.createObjectInternal(r0, r6)
            com.flextv.livestore.models.MovieModel r4 = (com.flextv.livestore.models.MovieModel) r4
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
            java.lang.String r6 = "stream_id"
            boolean r0 = r5.has(r6)
            if (r0 == 0) goto L78
            boolean r0 = r5.isNull(r6)
            if (r0 == 0) goto L71
            r4.realmSet$stream_id(r1)
            goto L78
        L71:
            java.lang.String r6 = r5.getString(r6)
            r4.realmSet$stream_id(r6)
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
            java.lang.String r6 = "extension"
            boolean r0 = r5.has(r6)
            if (r0 == 0) goto Lab
            boolean r0 = r5.isNull(r6)
            if (r0 == 0) goto La4
            r4.realmSet$extension(r1)
            goto Lab
        La4:
            java.lang.String r6 = r5.getString(r6)
            r4.realmSet$extension(r6)
        Lab:
            java.lang.String r6 = "type"
            boolean r0 = r5.has(r6)
            if (r0 == 0) goto Lc5
            boolean r0 = r5.isNull(r6)
            if (r0 == 0) goto Lbe
            r4.realmSet$type(r1)
            goto Lc5
        Lbe:
            java.lang.String r6 = r5.getString(r6)
            r4.realmSet$type(r6)
        Lc5:
            java.lang.String r6 = "rating"
            boolean r0 = r5.has(r6)
            if (r0 == 0) goto Lde
            boolean r0 = r5.isNull(r6)
            if (r0 == 0) goto Ld7
            r4.realmSet$rating(r1)
            goto Lde
        Ld7:
            java.lang.String r6 = r5.getString(r6)
            r4.realmSet$rating(r6)
        Lde:
            java.lang.String r6 = "category_id"
            boolean r0 = r5.has(r6)
            if (r0 == 0) goto Lf7
            boolean r0 = r5.isNull(r6)
            if (r0 == 0) goto Lf0
            r4.realmSet$category_id(r1)
            goto Lf7
        Lf0:
            java.lang.String r6 = r5.getString(r6)
            r4.realmSet$category_id(r6)
        Lf7:
            java.lang.String r6 = "custom_sid"
            boolean r0 = r5.has(r6)
            if (r0 == 0) goto L110
            boolean r0 = r5.isNull(r6)
            if (r0 == 0) goto L109
            r4.realmSet$custom_sid(r1)
            goto L110
        L109:
            java.lang.String r6 = r5.getString(r6)
            r4.realmSet$custom_sid(r6)
        L110:
            java.lang.String r6 = "added"
            boolean r0 = r5.has(r6)
            if (r0 == 0) goto L129
            boolean r0 = r5.isNull(r6)
            if (r0 == 0) goto L122
            r4.realmSet$added(r1)
            goto L129
        L122:
            java.lang.String r6 = r5.getString(r6)
            r4.realmSet$added(r6)
        L129:
            java.lang.String r6 = "tmdb_id"
            boolean r0 = r5.has(r6)
            if (r0 == 0) goto L143
            boolean r0 = r5.isNull(r6)
            if (r0 == 0) goto L13c
            r4.realmSet$tmdb_id(r1)
            goto L143
        L13c:
            java.lang.String r6 = r5.getString(r6)
            r4.realmSet$tmdb_id(r6)
        L143:
            java.lang.String r6 = "pro"
            boolean r0 = r5.has(r6)
            if (r0 == 0) goto L161
            boolean r0 = r5.isNull(r6)
            if (r0 != 0) goto L159
            int r6 = r5.getInt(r6)
            r4.realmSet$pro(r6)
            goto L161
        L159:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Trying to set non-nullable field 'pro' to null."
            r4.<init>(r5)
            throw r4
        L161:
            java.lang.String r6 = "time"
            boolean r0 = r5.has(r6)
            if (r0 == 0) goto L180
            boolean r0 = r5.isNull(r6)
            if (r0 != 0) goto L178
            long r2 = r5.getLong(r6)
            r4.realmSet$time(r2)
            goto L180
        L178:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Trying to set non-nullable field 'time' to null."
            r4.<init>(r5)
            throw r4
        L180:
            java.lang.String r6 = "recent_mil"
            boolean r0 = r5.has(r6)
            if (r0 == 0) goto L19e
            boolean r0 = r5.isNull(r6)
            if (r0 != 0) goto L196
            long r2 = r5.getLong(r6)
            r4.realmSet$recent_mil(r2)
            goto L19e
        L196:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Trying to set non-nullable field 'recent_mil' to null."
            r4.<init>(r5)
            throw r4
        L19e:
            java.lang.String r6 = "is_locked"
            boolean r0 = r5.has(r6)
            if (r0 == 0) goto L1bc
            boolean r0 = r5.isNull(r6)
            if (r0 != 0) goto L1b4
            boolean r6 = r5.getBoolean(r6)
            r4.realmSet$is_locked(r6)
            goto L1bc
        L1b4:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Trying to set non-nullable field 'is_locked' to null."
            r4.<init>(r5)
            throw r4
        L1bc:
            java.lang.String r6 = "is_favorite"
            boolean r0 = r5.has(r6)
            if (r0 == 0) goto L1da
            boolean r0 = r5.isNull(r6)
            if (r0 != 0) goto L1d2
            boolean r6 = r5.getBoolean(r6)
            r4.realmSet$is_favorite(r6)
            goto L1da
        L1d2:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Trying to set non-nullable field 'is_favorite' to null."
            r4.<init>(r5)
            throw r4
        L1da:
            java.lang.String r6 = "is_recent"
            boolean r0 = r5.has(r6)
            if (r0 == 0) goto L1f8
            boolean r0 = r5.isNull(r6)
            if (r0 != 0) goto L1f0
            boolean r6 = r5.getBoolean(r6)
            r4.realmSet$is_recent(r6)
            goto L1f8
        L1f0:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Trying to set non-nullable field 'is_recent' to null."
            r4.<init>(r5)
            throw r4
        L1f8:
            java.lang.String r6 = "category_name"
            boolean r0 = r5.has(r6)
            if (r0 == 0) goto L211
            boolean r0 = r5.isNull(r6)
            if (r0 == 0) goto L20a
            r4.realmSet$category_name(r1)
            goto L211
        L20a:
            java.lang.String r6 = r5.getString(r6)
            r4.realmSet$category_name(r6)
        L211:
            java.lang.String r6 = "url"
            boolean r0 = r5.has(r6)
            if (r0 == 0) goto L22b
            boolean r0 = r5.isNull(r6)
            if (r0 == 0) goto L224
            r4.realmSet$url(r1)
            goto L22b
        L224:
            java.lang.String r5 = r5.getString(r6)
            r4.realmSet$url(r5)
        L22b:
            return r4
    }

    @android.annotation.TargetApi(11)
    public static com.flextv.livestore.models.MovieModel createUsingJsonStream(io.realm.Realm r4, android.util.JsonReader r5) throws java.io.IOException {
            com.flextv.livestore.models.MovieModel r0 = new com.flextv.livestore.models.MovieModel
            r0.<init>()
            r5.beginObject()
        L8:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L2a7
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
            java.lang.String r2 = "stream_id"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L93
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L8b
            java.lang.String r1 = r5.nextString()
            r0.realmSet$stream_id(r1)
            goto L8
        L8b:
            r5.skipValue()
            r0.realmSet$stream_id(r3)
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
            java.lang.String r2 = "extension"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto Ld6
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto Lce
            java.lang.String r1 = r5.nextString()
            r0.realmSet$extension(r1)
            goto L8
        Lce:
            r5.skipValue()
            r0.realmSet$extension(r3)
            goto L8
        Ld6:
            java.lang.String r2 = "type"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto Lf8
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto Lf0
            java.lang.String r1 = r5.nextString()
            r0.realmSet$type(r1)
            goto L8
        Lf0:
            r5.skipValue()
            r0.realmSet$type(r3)
            goto L8
        Lf8:
            java.lang.String r2 = "rating"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L119
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L111
            java.lang.String r1 = r5.nextString()
            r0.realmSet$rating(r1)
            goto L8
        L111:
            r5.skipValue()
            r0.realmSet$rating(r3)
            goto L8
        L119:
            java.lang.String r2 = "category_id"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L13a
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L132
            java.lang.String r1 = r5.nextString()
            r0.realmSet$category_id(r1)
            goto L8
        L132:
            r5.skipValue()
            r0.realmSet$category_id(r3)
            goto L8
        L13a:
            java.lang.String r2 = "custom_sid"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L15b
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L153
            java.lang.String r1 = r5.nextString()
            r0.realmSet$custom_sid(r1)
            goto L8
        L153:
            r5.skipValue()
            r0.realmSet$custom_sid(r3)
            goto L8
        L15b:
            java.lang.String r2 = "added"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L17c
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L174
            java.lang.String r1 = r5.nextString()
            r0.realmSet$added(r1)
            goto L8
        L174:
            r5.skipValue()
            r0.realmSet$added(r3)
            goto L8
        L17c:
            java.lang.String r2 = "tmdb_id"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L19e
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L196
            java.lang.String r1 = r5.nextString()
            r0.realmSet$tmdb_id(r1)
            goto L8
        L196:
            r5.skipValue()
            r0.realmSet$tmdb_id(r3)
            goto L8
        L19e:
            java.lang.String r2 = "pro"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L1be
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L1b7
            int r1 = r5.nextInt()
            r0.realmSet$pro(r1)
            goto L8
        L1b7:
            java.lang.String r4 = "Trying to set non-nullable field 'pro' to null."
            java.lang.IllegalArgumentException r4 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r5, r4)
            throw r4
        L1be:
            java.lang.String r2 = "time"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L1df
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L1d8
            long r1 = r5.nextLong()
            r0.realmSet$time(r1)
            goto L8
        L1d8:
            java.lang.String r4 = "Trying to set non-nullable field 'time' to null."
            java.lang.IllegalArgumentException r4 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r5, r4)
            throw r4
        L1df:
            java.lang.String r2 = "recent_mil"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L1ff
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L1f8
            long r1 = r5.nextLong()
            r0.realmSet$recent_mil(r1)
            goto L8
        L1f8:
            java.lang.String r4 = "Trying to set non-nullable field 'recent_mil' to null."
            java.lang.IllegalArgumentException r4 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r5, r4)
            throw r4
        L1ff:
            java.lang.String r2 = "is_locked"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L21f
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L218
            boolean r1 = r5.nextBoolean()
            r0.realmSet$is_locked(r1)
            goto L8
        L218:
            java.lang.String r4 = "Trying to set non-nullable field 'is_locked' to null."
            java.lang.IllegalArgumentException r4 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r5, r4)
            throw r4
        L21f:
            java.lang.String r2 = "is_favorite"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L23f
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L238
            boolean r1 = r5.nextBoolean()
            r0.realmSet$is_favorite(r1)
            goto L8
        L238:
            java.lang.String r4 = "Trying to set non-nullable field 'is_favorite' to null."
            java.lang.IllegalArgumentException r4 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r5, r4)
            throw r4
        L23f:
            java.lang.String r2 = "is_recent"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L25f
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L258
            boolean r1 = r5.nextBoolean()
            r0.realmSet$is_recent(r1)
            goto L8
        L258:
            java.lang.String r4 = "Trying to set non-nullable field 'is_recent' to null."
            java.lang.IllegalArgumentException r4 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r5, r4)
            throw r4
        L25f:
            java.lang.String r2 = "category_name"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L280
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L278
            java.lang.String r1 = r5.nextString()
            r0.realmSet$category_name(r1)
            goto L8
        L278:
            r5.skipValue()
            r0.realmSet$category_name(r3)
            goto L8
        L280:
            java.lang.String r2 = "url"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L2a2
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L29a
            java.lang.String r1 = r5.nextString()
            r0.realmSet$url(r1)
            goto L8
        L29a:
            r5.skipValue()
            r0.realmSet$url(r3)
            goto L8
        L2a2:
            r5.skipValue()
            goto L8
        L2a7:
            r5.endObject()
            r5 = 0
            io.realm.ImportFlag[] r5 = new io.realm.ImportFlag[r5]
            io.realm.RealmModel r4 = r4.copyToRealm(r0, r5)
            com.flextv.livestore.models.MovieModel r4 = (com.flextv.livestore.models.MovieModel) r4
            return r4
    }

    public static io.realm.internal.OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
            io.realm.internal.OsObjectSchemaInfo r0 = io.realm.com_flextv_livestore_models_MovieModelRealmProxy.expectedObjectSchemaInfo
            return r0
    }

    public static java.lang.String getSimpleClassName() {
            java.lang.String r0 = "MovieModel"
            return r0
    }

    public static long insert(io.realm.Realm r16, com.flextv.livestore.models.MovieModel r17, java.util.Map<io.realm.RealmModel, java.lang.Long> r18) {
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
            java.lang.Class<com.flextv.livestore.models.MovieModel> r1 = com.flextv.livestore.models.MovieModel.class
            r2 = r16
            io.realm.internal.Table r1 = r2.getTable(r1)
            long r11 = r1.getNativePtr()
            io.realm.RealmSchema r2 = r16.getSchema()
            java.lang.Class<com.flextv.livestore.models.MovieModel> r3 = com.flextv.livestore.models.MovieModel.class
            io.realm.internal.ColumnInfo r2 = r2.getColumnInfo(r3)
            r13 = r2
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r13 = (io.realm.com_flextv_livestore_models_MovieModelRealmProxy.MovieModelColumnInfo) r13
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
            java.lang.String r8 = r17.realmGet$stream_id()
            if (r8 == 0) goto L99
            long r4 = r13.stream_idColKey
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
            java.lang.String r8 = r17.realmGet$extension()
            if (r8 == 0) goto Lb5
            long r4 = r13.extensionColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
        Lb5:
            java.lang.String r8 = r17.realmGet$type()
            if (r8 == 0) goto Lc3
            long r4 = r13.typeColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
        Lc3:
            java.lang.String r8 = r17.realmGet$rating()
            if (r8 == 0) goto Ld1
            long r4 = r13.ratingColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
        Ld1:
            java.lang.String r8 = r17.realmGet$category_id()
            if (r8 == 0) goto Ldf
            long r4 = r13.category_idColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
        Ldf:
            java.lang.String r8 = r17.realmGet$custom_sid()
            if (r8 == 0) goto Led
            long r4 = r13.custom_sidColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
        Led:
            java.lang.String r8 = r17.realmGet$added()
            if (r8 == 0) goto Lfb
            long r4 = r13.addedColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
        Lfb:
            java.lang.String r8 = r17.realmGet$tmdb_id()
            if (r8 == 0) goto L109
            long r4 = r13.tmdb_idColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
        L109:
            long r4 = r13.proColKey
            int r1 = r17.realmGet$pro()
            long r8 = (long) r1
            r10 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetLong(r2, r4, r6, r8, r10)
            long r4 = r13.timeColKey
            long r8 = r17.realmGet$time()
            io.realm.internal.Table.nativeSetLong(r2, r4, r6, r8, r10)
            long r4 = r13.recent_milColKey
            long r8 = r17.realmGet$recent_mil()
            io.realm.internal.Table.nativeSetLong(r2, r4, r6, r8, r10)
            long r4 = r13.is_lockedColKey
            boolean r8 = r17.realmGet$is_locked()
            r9 = 0
            io.realm.internal.Table.nativeSetBoolean(r2, r4, r6, r8, r9)
            long r4 = r13.is_favoriteColKey
            boolean r8 = r17.realmGet$is_favorite()
            io.realm.internal.Table.nativeSetBoolean(r2, r4, r6, r8, r9)
            long r4 = r13.is_recentColKey
            boolean r8 = r17.realmGet$is_recent()
            io.realm.internal.Table.nativeSetBoolean(r2, r4, r6, r8, r9)
            java.lang.String r8 = r17.realmGet$category_name()
            if (r8 == 0) goto L152
            long r4 = r13.category_nameColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
        L152:
            java.lang.String r8 = r17.realmGet$url()
            if (r8 == 0) goto L160
            long r4 = r13.urlColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
        L160:
            return r14
    }

    public static void insert(io.realm.Realm r18, java.util.Iterator<? extends io.realm.RealmModel> r19, java.util.Map<io.realm.RealmModel, java.lang.Long> r20) {
            r0 = r20
            java.lang.Class<com.flextv.livestore.models.MovieModel> r1 = com.flextv.livestore.models.MovieModel.class
            r2 = r18
            io.realm.internal.Table r1 = r2.getTable(r1)
            long r12 = r1.getNativePtr()
            io.realm.RealmSchema r3 = r18.getSchema()
            java.lang.Class<com.flextv.livestore.models.MovieModel> r4 = com.flextv.livestore.models.MovieModel.class
            io.realm.internal.ColumnInfo r3 = r3.getColumnInfo(r4)
            r14 = r3
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r14 = (io.realm.com_flextv_livestore_models_MovieModelRealmProxy.MovieModelColumnInfo) r14
        L1b:
            boolean r3 = r19.hasNext()
            if (r3 == 0) goto L18a
            java.lang.Object r3 = r19.next()
            r15 = r3
            com.flextv.livestore.models.MovieModel r15 = (com.flextv.livestore.models.MovieModel) r15
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
            java.lang.String r9 = r15.realmGet$stream_id()
            if (r9 == 0) goto Lb6
            long r5 = r14.stream_idColKey
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
            java.lang.String r9 = r15.realmGet$extension()
            if (r9 == 0) goto Ld4
            long r5 = r14.extensionColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
        Ld4:
            java.lang.String r9 = r15.realmGet$type()
            if (r9 == 0) goto Le3
            long r5 = r14.typeColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
        Le3:
            java.lang.String r9 = r15.realmGet$rating()
            if (r9 == 0) goto Lf2
            long r5 = r14.ratingColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
        Lf2:
            java.lang.String r9 = r15.realmGet$category_id()
            if (r9 == 0) goto L101
            long r5 = r14.category_idColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
        L101:
            java.lang.String r9 = r15.realmGet$custom_sid()
            if (r9 == 0) goto L110
            long r5 = r14.custom_sidColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
        L110:
            java.lang.String r9 = r15.realmGet$added()
            if (r9 == 0) goto L11f
            long r5 = r14.addedColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
        L11f:
            java.lang.String r9 = r15.realmGet$tmdb_id()
            if (r9 == 0) goto L12e
            long r5 = r14.tmdb_idColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
        L12e:
            long r5 = r14.proColKey
            int r3 = r15.realmGet$pro()
            long r9 = (long) r3
            r11 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetLong(r3, r5, r7, r9, r11)
            long r5 = r14.timeColKey
            long r9 = r15.realmGet$time()
            io.realm.internal.Table.nativeSetLong(r3, r5, r7, r9, r11)
            long r5 = r14.recent_milColKey
            long r9 = r15.realmGet$recent_mil()
            io.realm.internal.Table.nativeSetLong(r3, r5, r7, r9, r11)
            long r5 = r14.is_lockedColKey
            boolean r9 = r15.realmGet$is_locked()
            r10 = 0
            io.realm.internal.Table.nativeSetBoolean(r3, r5, r7, r9, r10)
            long r5 = r14.is_favoriteColKey
            boolean r9 = r15.realmGet$is_favorite()
            io.realm.internal.Table.nativeSetBoolean(r3, r5, r7, r9, r10)
            long r5 = r14.is_recentColKey
            boolean r9 = r15.realmGet$is_recent()
            io.realm.internal.Table.nativeSetBoolean(r3, r5, r7, r9, r10)
            java.lang.String r9 = r15.realmGet$category_name()
            if (r9 == 0) goto L179
            long r5 = r14.category_nameColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
        L179:
            java.lang.String r9 = r15.realmGet$url()
            if (r9 == 0) goto L1b
            long r5 = r14.urlColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto L1b
        L18a:
            return
    }

    public static long insertOrUpdate(io.realm.Realm r16, com.flextv.livestore.models.MovieModel r17, java.util.Map<io.realm.RealmModel, java.lang.Long> r18) {
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
            java.lang.Class<com.flextv.livestore.models.MovieModel> r1 = com.flextv.livestore.models.MovieModel.class
            r2 = r16
            io.realm.internal.Table r1 = r2.getTable(r1)
            long r11 = r1.getNativePtr()
            io.realm.RealmSchema r2 = r16.getSchema()
            java.lang.Class<com.flextv.livestore.models.MovieModel> r3 = com.flextv.livestore.models.MovieModel.class
            io.realm.internal.ColumnInfo r2 = r2.getColumnInfo(r3)
            r13 = r2
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r13 = (io.realm.com_flextv_livestore_models_MovieModelRealmProxy.MovieModelColumnInfo) r13
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
            java.lang.String r8 = r17.realmGet$stream_id()
            if (r8 == 0) goto Lac
            long r4 = r13.stream_idColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
            goto Lb4
        Lac:
            long r4 = r13.stream_idColKey
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
            java.lang.String r8 = r17.realmGet$extension()
            if (r8 == 0) goto Lda
            long r4 = r13.extensionColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
            goto Le2
        Lda:
            long r4 = r13.extensionColKey
            r8 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetNull(r2, r4, r6, r8)
        Le2:
            java.lang.String r8 = r17.realmGet$type()
            if (r8 == 0) goto Lf1
            long r4 = r13.typeColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
            goto Lf9
        Lf1:
            long r4 = r13.typeColKey
            r8 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetNull(r2, r4, r6, r8)
        Lf9:
            java.lang.String r8 = r17.realmGet$rating()
            if (r8 == 0) goto L108
            long r4 = r13.ratingColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
            goto L110
        L108:
            long r4 = r13.ratingColKey
            r8 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetNull(r2, r4, r6, r8)
        L110:
            java.lang.String r8 = r17.realmGet$category_id()
            if (r8 == 0) goto L11f
            long r4 = r13.category_idColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
            goto L127
        L11f:
            long r4 = r13.category_idColKey
            r8 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetNull(r2, r4, r6, r8)
        L127:
            java.lang.String r8 = r17.realmGet$custom_sid()
            if (r8 == 0) goto L136
            long r4 = r13.custom_sidColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
            goto L13e
        L136:
            long r4 = r13.custom_sidColKey
            r8 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetNull(r2, r4, r6, r8)
        L13e:
            java.lang.String r8 = r17.realmGet$added()
            if (r8 == 0) goto L14d
            long r4 = r13.addedColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
            goto L155
        L14d:
            long r4 = r13.addedColKey
            r8 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetNull(r2, r4, r6, r8)
        L155:
            java.lang.String r8 = r17.realmGet$tmdb_id()
            if (r8 == 0) goto L164
            long r4 = r13.tmdb_idColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
            goto L16c
        L164:
            long r4 = r13.tmdb_idColKey
            r8 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetNull(r2, r4, r6, r8)
        L16c:
            long r4 = r13.proColKey
            int r1 = r17.realmGet$pro()
            long r8 = (long) r1
            r10 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetLong(r2, r4, r6, r8, r10)
            long r4 = r13.timeColKey
            long r8 = r17.realmGet$time()
            io.realm.internal.Table.nativeSetLong(r2, r4, r6, r8, r10)
            long r4 = r13.recent_milColKey
            long r8 = r17.realmGet$recent_mil()
            io.realm.internal.Table.nativeSetLong(r2, r4, r6, r8, r10)
            long r4 = r13.is_lockedColKey
            boolean r8 = r17.realmGet$is_locked()
            r9 = 0
            io.realm.internal.Table.nativeSetBoolean(r2, r4, r6, r8, r9)
            long r4 = r13.is_favoriteColKey
            boolean r8 = r17.realmGet$is_favorite()
            io.realm.internal.Table.nativeSetBoolean(r2, r4, r6, r8, r9)
            long r4 = r13.is_recentColKey
            boolean r8 = r17.realmGet$is_recent()
            io.realm.internal.Table.nativeSetBoolean(r2, r4, r6, r8, r9)
            java.lang.String r8 = r17.realmGet$category_name()
            if (r8 == 0) goto L1b6
            long r4 = r13.category_nameColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
            goto L1be
        L1b6:
            long r4 = r13.category_nameColKey
            r8 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetNull(r2, r4, r6, r8)
        L1be:
            java.lang.String r8 = r17.realmGet$url()
            if (r8 == 0) goto L1cd
            long r4 = r13.urlColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
            goto L1d5
        L1cd:
            long r4 = r13.urlColKey
            r8 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetNull(r2, r4, r6, r8)
        L1d5:
            return r14
    }

    public static void insertOrUpdate(io.realm.Realm r18, java.util.Iterator<? extends io.realm.RealmModel> r19, java.util.Map<io.realm.RealmModel, java.lang.Long> r20) {
            r0 = r20
            java.lang.Class<com.flextv.livestore.models.MovieModel> r1 = com.flextv.livestore.models.MovieModel.class
            r2 = r18
            io.realm.internal.Table r1 = r2.getTable(r1)
            long r12 = r1.getNativePtr()
            io.realm.RealmSchema r3 = r18.getSchema()
            java.lang.Class<com.flextv.livestore.models.MovieModel> r4 = com.flextv.livestore.models.MovieModel.class
            io.realm.internal.ColumnInfo r3 = r3.getColumnInfo(r4)
            r14 = r3
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r14 = (io.realm.com_flextv_livestore_models_MovieModelRealmProxy.MovieModelColumnInfo) r14
        L1b:
            boolean r3 = r19.hasNext()
            if (r3 == 0) goto L20d
            java.lang.Object r3 = r19.next()
            r15 = r3
            com.flextv.livestore.models.MovieModel r15 = (com.flextv.livestore.models.MovieModel) r15
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
            java.lang.String r9 = r15.realmGet$stream_id()
            if (r9 == 0) goto Lcb
            long r5 = r14.stream_idColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto Ld4
        Lcb:
            long r5 = r14.stream_idColKey
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
            java.lang.String r9 = r15.realmGet$extension()
            if (r9 == 0) goto Lfd
            long r5 = r14.extensionColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto L106
        Lfd:
            long r5 = r14.extensionColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
        L106:
            java.lang.String r9 = r15.realmGet$type()
            if (r9 == 0) goto L116
            long r5 = r14.typeColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto L11f
        L116:
            long r5 = r14.typeColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
        L11f:
            java.lang.String r9 = r15.realmGet$rating()
            if (r9 == 0) goto L12f
            long r5 = r14.ratingColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto L138
        L12f:
            long r5 = r14.ratingColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
        L138:
            java.lang.String r9 = r15.realmGet$category_id()
            if (r9 == 0) goto L148
            long r5 = r14.category_idColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto L151
        L148:
            long r5 = r14.category_idColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
        L151:
            java.lang.String r9 = r15.realmGet$custom_sid()
            if (r9 == 0) goto L161
            long r5 = r14.custom_sidColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto L16a
        L161:
            long r5 = r14.custom_sidColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
        L16a:
            java.lang.String r9 = r15.realmGet$added()
            if (r9 == 0) goto L17a
            long r5 = r14.addedColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto L183
        L17a:
            long r5 = r14.addedColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
        L183:
            java.lang.String r9 = r15.realmGet$tmdb_id()
            if (r9 == 0) goto L193
            long r5 = r14.tmdb_idColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto L19c
        L193:
            long r5 = r14.tmdb_idColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
        L19c:
            long r5 = r14.proColKey
            int r3 = r15.realmGet$pro()
            long r9 = (long) r3
            r11 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetLong(r3, r5, r7, r9, r11)
            long r5 = r14.timeColKey
            long r9 = r15.realmGet$time()
            io.realm.internal.Table.nativeSetLong(r3, r5, r7, r9, r11)
            long r5 = r14.recent_milColKey
            long r9 = r15.realmGet$recent_mil()
            io.realm.internal.Table.nativeSetLong(r3, r5, r7, r9, r11)
            long r5 = r14.is_lockedColKey
            boolean r9 = r15.realmGet$is_locked()
            r10 = 0
            io.realm.internal.Table.nativeSetBoolean(r3, r5, r7, r9, r10)
            long r5 = r14.is_favoriteColKey
            boolean r9 = r15.realmGet$is_favorite()
            io.realm.internal.Table.nativeSetBoolean(r3, r5, r7, r9, r10)
            long r5 = r14.is_recentColKey
            boolean r9 = r15.realmGet$is_recent()
            io.realm.internal.Table.nativeSetBoolean(r3, r5, r7, r9, r10)
            java.lang.String r9 = r15.realmGet$category_name()
            if (r9 == 0) goto L1e8
            long r5 = r14.category_nameColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto L1f1
        L1e8:
            long r5 = r14.category_nameColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
        L1f1:
            java.lang.String r9 = r15.realmGet$url()
            if (r9 == 0) goto L202
            long r5 = r14.urlColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto L1b
        L202:
            long r5 = r14.urlColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
            goto L1b
        L20d:
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
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy r7 = (io.realm.com_flextv_livestore_models_MovieModelRealmProxy) r7
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r2 = r6.proxyState
            io.realm.BaseRealm r2 = r2.getRealm$realm()
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r3 = r7.proxyState
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
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r2 = r6.proxyState
            io.realm.internal.Row r2 = r2.getRow$realm()
            io.realm.internal.Table r2 = r2.getTable()
            java.lang.String r2 = r2.getName()
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r3 = r7.proxyState
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
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r2 = r6.proxyState
            io.realm.internal.Row r2 = r2.getRow$realm()
            long r2 = r2.getObjectKey()
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r7 = r7.proxyState
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
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r6.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            java.lang.String r0 = r0.getPath()
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r1 = r6.proxyState
            io.realm.internal.Row r1 = r1.getRow$realm()
            io.realm.internal.Table r1 = r1.getTable()
            java.lang.String r1 = r1.getName()
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r2 = r6.proxyState
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
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r3.proxyState
            if (r0 == 0) goto L5
            return
        L5:
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r0 = io.realm.BaseRealm.objectContext
            java.lang.Object r0 = r0.get()
            io.realm.BaseRealm$RealmObjectContext r0 = (io.realm.BaseRealm.RealmObjectContext) r0
            io.realm.internal.ColumnInfo r1 = r0.getColumnInfo()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = (io.realm.com_flextv_livestore_models_MovieModelRealmProxy.MovieModelColumnInfo) r1
            r3.columnInfo = r1
            io.realm.ProxyState r1 = new io.realm.ProxyState
            r1.<init>(r3)
            r3.proxyState = r1
            io.realm.BaseRealm r2 = r0.getRealm()
            r1.setRealm$realm(r2)
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r1 = r3.proxyState
            io.realm.internal.Row r2 = r0.getRow()
            r1.setRow$realm(r2)
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r1 = r3.proxyState
            boolean r2 = r0.getAcceptDefaultValue()
            r1.setAcceptDefaultValue$realm(r2)
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r1 = r3.proxyState
            java.util.List r0 = r0.getExcludeFields()
            r1.setExcludeFields$realm(r0)
            return
    }

    @Override // com.flextv.livestore.models.MovieModel, io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public java.lang.String realmGet$added() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.addedColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.MovieModel, io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public java.lang.String realmGet$category_id() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.category_idColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.MovieModel, io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public java.lang.String realmGet$category_name() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.category_nameColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.MovieModel, io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public java.lang.String realmGet$custom_sid() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.custom_sidColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.MovieModel, io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public java.lang.String realmGet$extension() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.extensionColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.MovieModel, io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public boolean realmGet$is_favorite() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.is_favoriteColKey
            boolean r0 = r0.getBoolean(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.MovieModel, io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public boolean realmGet$is_locked() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.is_lockedColKey
            boolean r0 = r0.getBoolean(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.MovieModel, io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public boolean realmGet$is_recent() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.is_recentColKey
            boolean r0 = r0.getBoolean(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.MovieModel, io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public java.lang.String realmGet$name() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.nameColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.MovieModel, io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public int realmGet$num() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.numColKey
            long r0 = r0.getLong(r1)
            int r1 = (int) r0
            return r1
    }

    @Override // com.flextv.livestore.models.MovieModel, io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public int realmGet$pro() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.proColKey
            long r0 = r0.getLong(r1)
            int r1 = (int) r0
            return r1
    }

    @Override // io.realm.internal.RealmObjectProxy
    public io.realm.ProxyState<?> realmGet$proxyState() {
            r1 = this;
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r1.proxyState
            return r0
    }

    @Override // com.flextv.livestore.models.MovieModel, io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public java.lang.String realmGet$rating() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.ratingColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.MovieModel, io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public long realmGet$recent_mil() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.recent_milColKey
            long r0 = r0.getLong(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.MovieModel, io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public java.lang.String realmGet$stream_icon() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.stream_iconColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.MovieModel, io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public java.lang.String realmGet$stream_id() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.stream_idColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.MovieModel, io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public java.lang.String realmGet$stream_type() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.stream_typeColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.MovieModel, io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public long realmGet$time() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.timeColKey
            long r0 = r0.getLong(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.MovieModel, io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public java.lang.String realmGet$tmdb_id() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.tmdb_idColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.MovieModel, io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public java.lang.String realmGet$type() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.typeColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.MovieModel, io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public java.lang.String realmGet$url() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.urlColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.MovieModel, io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public void realmSet$added(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r15 = r14.columnInfo
            long r2 = r15.addedColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r14.columnInfo
            long r8 = r1.addedColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r0 = r14.columnInfo
            long r0 = r0.addedColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r14.columnInfo
            long r1 = r1.addedColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.MovieModel, io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public void realmSet$category_id(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r15 = r14.columnInfo
            long r2 = r15.category_idColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r14.columnInfo
            long r8 = r1.category_idColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r0 = r14.columnInfo
            long r0 = r0.category_idColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r14.columnInfo
            long r1 = r1.category_idColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.MovieModel, io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public void realmSet$category_name(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r15 = r14.columnInfo
            long r2 = r15.category_nameColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r14.columnInfo
            long r8 = r1.category_nameColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r0 = r14.columnInfo
            long r0 = r0.category_nameColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r14.columnInfo
            long r1 = r1.category_nameColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.MovieModel, io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public void realmSet$custom_sid(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r15 = r14.columnInfo
            long r2 = r15.custom_sidColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r14.columnInfo
            long r8 = r1.custom_sidColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r0 = r14.columnInfo
            long r0 = r0.custom_sidColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r14.columnInfo
            long r1 = r1.custom_sidColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.MovieModel, io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public void realmSet$extension(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r15 = r14.columnInfo
            long r2 = r15.extensionColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r14.columnInfo
            long r8 = r1.extensionColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r0 = r14.columnInfo
            long r0 = r0.extensionColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r14.columnInfo
            long r1 = r1.extensionColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.MovieModel, io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public void realmSet$is_favorite(boolean r9) {
            r8 = this;
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r8.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L29
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r8.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r8.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r2 = r8.columnInfo
            long r2 = r2.is_favoriteColKey
            long r4 = r0.getObjectKey()
            r7 = 1
            r6 = r9
            r1.setBoolean(r2, r4, r6, r7)
            return
        L29:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r8.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r8.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r8.columnInfo
            long r1 = r1.is_favoriteColKey
            r0.setBoolean(r1, r9)
            return
    }

    @Override // com.flextv.livestore.models.MovieModel, io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public void realmSet$is_locked(boolean r9) {
            r8 = this;
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r8.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L29
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r8.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r8.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r2 = r8.columnInfo
            long r2 = r2.is_lockedColKey
            long r4 = r0.getObjectKey()
            r7 = 1
            r6 = r9
            r1.setBoolean(r2, r4, r6, r7)
            return
        L29:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r8.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r8.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r8.columnInfo
            long r1 = r1.is_lockedColKey
            r0.setBoolean(r1, r9)
            return
    }

    @Override // com.flextv.livestore.models.MovieModel, io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public void realmSet$is_recent(boolean r9) {
            r8 = this;
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r8.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L29
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r8.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r8.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r2 = r8.columnInfo
            long r2 = r2.is_recentColKey
            long r4 = r0.getObjectKey()
            r7 = 1
            r6 = r9
            r1.setBoolean(r2, r4, r6, r7)
            return
        L29:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r8.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r8.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r8.columnInfo
            long r1 = r1.is_recentColKey
            r0.setBoolean(r1, r9)
            return
    }

    @Override // com.flextv.livestore.models.MovieModel, io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public void realmSet$name(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r15 = r14.columnInfo
            long r2 = r15.nameColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r14.columnInfo
            long r8 = r1.nameColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r0 = r14.columnInfo
            long r0 = r0.nameColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r14.columnInfo
            long r1 = r1.nameColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.MovieModel, io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public void realmSet$num(int r10) {
            r9 = this;
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r9.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L29
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r9.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r9.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r2 = r9.columnInfo
            long r2 = r2.numColKey
            long r4 = r0.getObjectKey()
            long r6 = (long) r10
            r8 = 1
            r1.setLong(r2, r4, r6, r8)
            return
        L29:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r9.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r9.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r9.columnInfo
            long r1 = r1.numColKey
            long r3 = (long) r10
            r0.setLong(r1, r3)
            return
    }

    @Override // com.flextv.livestore.models.MovieModel, io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public void realmSet$pro(int r10) {
            r9 = this;
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r9.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L29
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r9.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r9.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r2 = r9.columnInfo
            long r2 = r2.proColKey
            long r4 = r0.getObjectKey()
            long r6 = (long) r10
            r8 = 1
            r1.setLong(r2, r4, r6, r8)
            return
        L29:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r9.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r9.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r9.columnInfo
            long r1 = r1.proColKey
            long r3 = (long) r10
            r0.setLong(r1, r3)
            return
    }

    @Override // com.flextv.livestore.models.MovieModel, io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public void realmSet$rating(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r15 = r14.columnInfo
            long r2 = r15.ratingColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r14.columnInfo
            long r8 = r1.ratingColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r0 = r14.columnInfo
            long r0 = r0.ratingColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r14.columnInfo
            long r1 = r1.ratingColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.MovieModel, io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public void realmSet$recent_mil(long r10) {
            r9 = this;
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r9.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L29
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r9.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r9.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r2 = r9.columnInfo
            long r2 = r2.recent_milColKey
            long r4 = r0.getObjectKey()
            r8 = 1
            r6 = r10
            r1.setLong(r2, r4, r6, r8)
            return
        L29:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r9.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r9.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r9.columnInfo
            long r1 = r1.recent_milColKey
            r0.setLong(r1, r10)
            return
    }

    @Override // com.flextv.livestore.models.MovieModel, io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public void realmSet$stream_icon(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r15 = r14.columnInfo
            long r2 = r15.stream_iconColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r14.columnInfo
            long r8 = r1.stream_iconColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r0 = r14.columnInfo
            long r0 = r0.stream_iconColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r14.columnInfo
            long r1 = r1.stream_iconColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.MovieModel, io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public void realmSet$stream_id(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r15 = r14.columnInfo
            long r2 = r15.stream_idColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r14.columnInfo
            long r8 = r1.stream_idColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r0 = r14.columnInfo
            long r0 = r0.stream_idColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r14.columnInfo
            long r1 = r1.stream_idColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.MovieModel, io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public void realmSet$stream_type(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r15 = r14.columnInfo
            long r2 = r15.stream_typeColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r14.columnInfo
            long r8 = r1.stream_typeColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r0 = r14.columnInfo
            long r0 = r0.stream_typeColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r14.columnInfo
            long r1 = r1.stream_typeColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.MovieModel, io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public void realmSet$time(long r10) {
            r9 = this;
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r9.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L29
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r9.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r9.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r2 = r9.columnInfo
            long r2 = r2.timeColKey
            long r4 = r0.getObjectKey()
            r8 = 1
            r6 = r10
            r1.setLong(r2, r4, r6, r8)
            return
        L29:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r9.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r9.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r9.columnInfo
            long r1 = r1.timeColKey
            r0.setLong(r1, r10)
            return
    }

    @Override // com.flextv.livestore.models.MovieModel, io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public void realmSet$tmdb_id(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r15 = r14.columnInfo
            long r2 = r15.tmdb_idColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r14.columnInfo
            long r8 = r1.tmdb_idColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r0 = r14.columnInfo
            long r0 = r0.tmdb_idColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r14.columnInfo
            long r1 = r1.tmdb_idColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.MovieModel, io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public void realmSet$type(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r15 = r14.columnInfo
            long r2 = r15.typeColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r14.columnInfo
            long r8 = r1.typeColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r0 = r14.columnInfo
            long r0 = r0.typeColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r14.columnInfo
            long r1 = r1.typeColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.MovieModel, io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public void realmSet$url(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r15 = r14.columnInfo
            long r2 = r15.urlColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r14.columnInfo
            long r8 = r1.urlColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r0 = r14.columnInfo
            long r0 = r0.urlColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.MovieModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r1 = r14.columnInfo
            long r1 = r1.urlColKey
            r0.setString(r1, r15)
            return
    }

    public java.lang.String toString() {
            r7 = this;
            boolean r0 = io.realm.RealmObject.isValid(r7)
            if (r0 != 0) goto L9
            java.lang.String r0 = "Invalid object"
            return r0
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MovieModel = proxy["
            r0.<init>(r1)
            java.lang.String r1 = "{num:"
            r0.append(r1)
            int r1 = r7.realmGet$num()
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r2 = ","
            r0.append(r2)
            java.lang.String r3 = "{name:"
            r0.append(r3)
            java.lang.String r3 = r7.realmGet$name()
            java.lang.String r4 = "null"
            if (r3 == 0) goto L3b
            java.lang.String r3 = r7.realmGet$name()
            goto L3c
        L3b:
            r3 = r4
        L3c:
            java.lang.String r5 = "{stream_type:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r3, r1, r2, r5)
            java.lang.String r3 = r7.realmGet$stream_type()
            if (r3 == 0) goto L4d
            java.lang.String r3 = r7.realmGet$stream_type()
            goto L4e
        L4d:
            r3 = r4
        L4e:
            java.lang.String r5 = "{stream_id:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r3, r1, r2, r5)
            java.lang.String r3 = r7.realmGet$stream_id()
            if (r3 == 0) goto L5f
            java.lang.String r3 = r7.realmGet$stream_id()
            goto L60
        L5f:
            r3 = r4
        L60:
            java.lang.String r5 = "{stream_icon:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r3, r1, r2, r5)
            java.lang.String r3 = r7.realmGet$stream_icon()
            if (r3 == 0) goto L71
            java.lang.String r3 = r7.realmGet$stream_icon()
            goto L72
        L71:
            r3 = r4
        L72:
            java.lang.String r5 = "{extension:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r3, r1, r2, r5)
            java.lang.String r3 = r7.realmGet$extension()
            if (r3 == 0) goto L83
            java.lang.String r3 = r7.realmGet$extension()
            goto L84
        L83:
            r3 = r4
        L84:
            java.lang.String r5 = "{type:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r3, r1, r2, r5)
            java.lang.String r3 = r7.realmGet$type()
            if (r3 == 0) goto L95
            java.lang.String r3 = r7.realmGet$type()
            goto L96
        L95:
            r3 = r4
        L96:
            java.lang.String r5 = "{rating:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r3, r1, r2, r5)
            java.lang.String r3 = r7.realmGet$rating()
            if (r3 == 0) goto La7
            java.lang.String r3 = r7.realmGet$rating()
            goto La8
        La7:
            r3 = r4
        La8:
            java.lang.String r5 = "{category_id:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r3, r1, r2, r5)
            java.lang.String r3 = r7.realmGet$category_id()
            if (r3 == 0) goto Lb9
            java.lang.String r3 = r7.realmGet$category_id()
            goto Lba
        Lb9:
            r3 = r4
        Lba:
            java.lang.String r5 = "{custom_sid:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r3, r1, r2, r5)
            java.lang.String r3 = r7.realmGet$custom_sid()
            if (r3 == 0) goto Lcb
            java.lang.String r3 = r7.realmGet$custom_sid()
            goto Lcc
        Lcb:
            r3 = r4
        Lcc:
            java.lang.String r5 = "{added:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r3, r1, r2, r5)
            java.lang.String r3 = r7.realmGet$added()
            if (r3 == 0) goto Ldd
            java.lang.String r3 = r7.realmGet$added()
            goto Lde
        Ldd:
            r3 = r4
        Lde:
            java.lang.String r5 = "{tmdb_id:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r3, r1, r2, r5)
            java.lang.String r3 = r7.realmGet$tmdb_id()
            if (r3 == 0) goto Lef
            java.lang.String r3 = r7.realmGet$tmdb_id()
            goto Lf0
        Lef:
            r3 = r4
        Lf0:
            java.lang.String r5 = "{pro:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r3, r1, r2, r5)
            int r3 = r7.realmGet$pro()
            r0.append(r3)
            r0.append(r1)
            r0.append(r2)
            java.lang.String r3 = "{time:"
            r0.append(r3)
            long r5 = r7.realmGet$time()
            r0.append(r5)
            r0.append(r1)
            r0.append(r2)
            java.lang.String r3 = "{recent_mil:"
            r0.append(r3)
            long r5 = r7.realmGet$recent_mil()
            r0.append(r5)
            r0.append(r1)
            r0.append(r2)
            java.lang.String r3 = "{is_locked:"
            r0.append(r3)
            boolean r3 = r7.realmGet$is_locked()
            r0.append(r3)
            r0.append(r1)
            r0.append(r2)
            java.lang.String r3 = "{is_favorite:"
            r0.append(r3)
            boolean r3 = r7.realmGet$is_favorite()
            r0.append(r3)
            r0.append(r1)
            r0.append(r2)
            java.lang.String r3 = "{is_recent:"
            r0.append(r3)
            boolean r3 = r7.realmGet$is_recent()
            r0.append(r3)
            r0.append(r1)
            r0.append(r2)
            java.lang.String r3 = "{category_name:"
            r0.append(r3)
            java.lang.String r3 = r7.realmGet$category_name()
            if (r3 == 0) goto L173
            java.lang.String r3 = r7.realmGet$category_name()
            goto L174
        L173:
            r3 = r4
        L174:
            java.lang.String r5 = "{url:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r3, r1, r2, r5)
            java.lang.String r2 = r7.realmGet$url()
            if (r2 == 0) goto L184
            java.lang.String r4 = r7.realmGet$url()
        L184:
            java.lang.String r2 = "]"
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r4, r1, r2)
            return r0
    }
}
