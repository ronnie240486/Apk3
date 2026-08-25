package io.realm;

/* JADX INFO: loaded from: classes.dex */
public class com_flextv_livestore_models_EpisodeModelRealmProxy extends com.flextv.livestore.models.EpisodeModel implements io.realm.internal.RealmObjectProxy {
    private static final java.lang.String NO_ALIAS = "";
    private static final io.realm.internal.OsObjectSchemaInfo expectedObjectSchemaInfo = null;
    private io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy.EpisodeModelColumnInfo columnInfo;
    private io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> proxyState;

    public static final class ClassNameHelper {
        public static final java.lang.String INTERNAL_CLASS_NAME = "EpisodeModel";

        public ClassNameHelper() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class EpisodeModelColumnInfo extends io.realm.internal.ColumnInfo {
        public long category_nameColKey;
        public long container_extensionColKey;
        public long episode_numColKey;
        public long idColKey;
        public long infoColKey;
        public long seasonColKey;
        public long season_nameColKey;
        public long series_nameColKey;
        public long stream_iconColKey;
        public long titleColKey;
        public long urlColKey;

        public EpisodeModelColumnInfo(io.realm.internal.OsSchemaInfo r3) {
                r2 = this;
                r0 = 11
                r2.<init>(r0)
                java.lang.String r0 = "EpisodeModel"
                io.realm.internal.OsObjectSchemaInfo r3 = r3.getObjectSchemaInfo(r0)
                java.lang.String r0 = "id"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.idColKey = r0
                java.lang.String r0 = "episode_num"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.episode_numColKey = r0
                java.lang.String r0 = "title"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.titleColKey = r0
                java.lang.String r0 = "container_extension"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.container_extensionColKey = r0
                java.lang.String r0 = "season"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.seasonColKey = r0
                java.lang.String r0 = "info"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.infoColKey = r0
                java.lang.String r0 = "category_name"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.category_nameColKey = r0
                java.lang.String r0 = "stream_icon"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.stream_iconColKey = r0
                java.lang.String r0 = "season_name"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.season_nameColKey = r0
                java.lang.String r0 = "series_name"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.series_nameColKey = r0
                java.lang.String r0 = "url"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.urlColKey = r0
                return
        }

        @Override // io.realm.internal.ColumnInfo
        public final void copy(io.realm.internal.ColumnInfo r3, io.realm.internal.ColumnInfo r4) {
                r2 = this;
                io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r3 = (io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy.EpisodeModelColumnInfo) r3
                io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r4 = (io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy.EpisodeModelColumnInfo) r4
                long r0 = r3.idColKey
                r4.idColKey = r0
                long r0 = r3.episode_numColKey
                r4.episode_numColKey = r0
                long r0 = r3.titleColKey
                r4.titleColKey = r0
                long r0 = r3.container_extensionColKey
                r4.container_extensionColKey = r0
                long r0 = r3.seasonColKey
                r4.seasonColKey = r0
                long r0 = r3.infoColKey
                r4.infoColKey = r0
                long r0 = r3.category_nameColKey
                r4.category_nameColKey = r0
                long r0 = r3.stream_iconColKey
                r4.stream_iconColKey = r0
                long r0 = r3.season_nameColKey
                r4.season_nameColKey = r0
                long r0 = r3.series_nameColKey
                r4.series_nameColKey = r0
                long r0 = r3.urlColKey
                r4.urlColKey = r0
                return
        }
    }

    static {
            io.realm.internal.OsObjectSchemaInfo r0 = createExpectedObjectSchemaInfo()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy.expectedObjectSchemaInfo = r0
            return
    }

    public com_flextv_livestore_models_EpisodeModelRealmProxy() {
            r1 = this;
            r1.<init>()
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r1.proxyState
            r0.setConstructionFinished()
            return
    }

    public static com.flextv.livestore.models.EpisodeModel copy(io.realm.Realm r10, io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy.EpisodeModelColumnInfo r11, com.flextv.livestore.models.EpisodeModel r12, boolean r13, java.util.Map<io.realm.RealmModel, io.realm.internal.RealmObjectProxy> r14, java.util.Set<io.realm.ImportFlag> r15) {
            java.lang.Object r0 = r14.get(r12)
            io.realm.internal.RealmObjectProxy r0 = (io.realm.internal.RealmObjectProxy) r0
            if (r0 == 0) goto Lb
            com.flextv.livestore.models.EpisodeModel r0 = (com.flextv.livestore.models.EpisodeModel) r0
            return r0
        Lb:
            java.lang.Class<com.flextv.livestore.models.EpisodeModel> r0 = com.flextv.livestore.models.EpisodeModel.class
            io.realm.internal.Table r0 = r10.getTable(r0)
            io.realm.internal.objectstore.OsObjectBuilder r1 = new io.realm.internal.objectstore.OsObjectBuilder
            r1.<init>(r0, r15)
            long r2 = r11.idColKey
            java.lang.String r0 = r12.realmGet$id()
            r1.addString(r2, r0)
            long r2 = r11.episode_numColKey
            java.lang.String r0 = r12.realmGet$episode_num()
            r1.addString(r2, r0)
            long r2 = r11.titleColKey
            java.lang.String r0 = r12.realmGet$title()
            r1.addString(r2, r0)
            long r2 = r11.container_extensionColKey
            java.lang.String r0 = r12.realmGet$container_extension()
            r1.addString(r2, r0)
            long r2 = r11.seasonColKey
            int r0 = r12.realmGet$season()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.addInteger(r2, r0)
            long r2 = r11.category_nameColKey
            java.lang.String r0 = r12.realmGet$category_name()
            r1.addString(r2, r0)
            long r2 = r11.stream_iconColKey
            java.lang.String r0 = r12.realmGet$stream_icon()
            r1.addString(r2, r0)
            long r2 = r11.season_nameColKey
            java.lang.String r0 = r12.realmGet$season_name()
            r1.addString(r2, r0)
            long r2 = r11.series_nameColKey
            java.lang.String r0 = r12.realmGet$series_name()
            r1.addString(r2, r0)
            long r2 = r11.urlColKey
            java.lang.String r11 = r12.realmGet$url()
            r1.addString(r2, r11)
            io.realm.internal.UncheckedRow r6 = r1.createNewObject()
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r11 = io.realm.BaseRealm.objectContext
            java.lang.Object r11 = r11.get()
            io.realm.BaseRealm$RealmObjectContext r11 = (io.realm.BaseRealm.RealmObjectContext) r11
            io.realm.RealmSchema r0 = r10.getSchema()
            java.lang.Class<com.flextv.livestore.models.EpisodeModel> r1 = com.flextv.livestore.models.EpisodeModel.class
            io.realm.internal.ColumnInfo r7 = r0.getColumnInfo(r1)
            java.util.List r9 = java.util.Collections.emptyList()
            r8 = 0
            r4 = r11
            r5 = r10
            r4.set(r5, r6, r7, r8, r9)
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy r0 = new io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy
            r0.<init>()
            r11.clear()
            r14.put(r12, r0)
            com.flextv.livestore.models.EpisodeInfoModel r3 = r12.realmGet$info()
            if (r3 != 0) goto Laa
            r10 = 0
            r0.realmSet$info(r10)
            goto Lce
        Laa:
            java.lang.Object r11 = r14.get(r3)
            com.flextv.livestore.models.EpisodeInfoModel r11 = (com.flextv.livestore.models.EpisodeInfoModel) r11
            if (r11 == 0) goto Lb6
            r0.realmSet$info(r11)
            goto Lce
        Lb6:
            io.realm.RealmSchema r11 = r10.getSchema()
            java.lang.Class<com.flextv.livestore.models.EpisodeInfoModel> r12 = com.flextv.livestore.models.EpisodeInfoModel.class
            io.realm.internal.ColumnInfo r11 = r11.getColumnInfo(r12)
            r2 = r11
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r2 = (io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy.EpisodeInfoModelColumnInfo) r2
            r1 = r10
            r4 = r13
            r5 = r14
            r6 = r15
            com.flextv.livestore.models.EpisodeInfoModel r10 = io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy.copyOrUpdate(r1, r2, r3, r4, r5, r6)
            r0.realmSet$info(r10)
        Lce:
            return r0
    }

    public static com.flextv.livestore.models.EpisodeModel copyOrUpdate(io.realm.Realm r6, io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy.EpisodeModelColumnInfo r7, com.flextv.livestore.models.EpisodeModel r8, boolean r9, java.util.Map<io.realm.RealmModel, io.realm.internal.RealmObjectProxy> r10, java.util.Set<io.realm.ImportFlag> r11) {
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
            com.flextv.livestore.models.EpisodeModel r0 = (com.flextv.livestore.models.EpisodeModel) r0
            return r0
        L51:
            com.flextv.livestore.models.EpisodeModel r6 = copy(r6, r7, r8, r9, r10, r11)
            return r6
    }

    public static io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy.EpisodeModelColumnInfo createColumnInfo(io.realm.internal.OsSchemaInfo r1) {
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r0 = new io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo
            r0.<init>(r1)
            return r0
    }

    public static com.flextv.livestore.models.EpisodeModel createDetachedCopy(com.flextv.livestore.models.EpisodeModel r2, int r3, int r4, java.util.Map<io.realm.RealmModel, io.realm.internal.RealmObjectProxy.CacheData<io.realm.RealmModel>> r5) {
            if (r3 > r4) goto L8d
            if (r2 != 0) goto L6
            goto L8d
        L6:
            java.lang.Object r0 = r5.get(r2)
            io.realm.internal.RealmObjectProxy$CacheData r0 = (io.realm.internal.RealmObjectProxy.CacheData) r0
            if (r0 != 0) goto L1c
            com.flextv.livestore.models.EpisodeModel r0 = new com.flextv.livestore.models.EpisodeModel
            r0.<init>()
            io.realm.internal.RealmObjectProxy$CacheData r1 = new io.realm.internal.RealmObjectProxy$CacheData
            r1.<init>(r3, r0)
            r5.put(r2, r1)
            goto L2c
        L1c:
            int r1 = r0.minDepth
            if (r3 < r1) goto L25
            E extends io.realm.RealmModel r2 = r0.object
            com.flextv.livestore.models.EpisodeModel r2 = (com.flextv.livestore.models.EpisodeModel) r2
            return r2
        L25:
            E extends io.realm.RealmModel r1 = r0.object
            com.flextv.livestore.models.EpisodeModel r1 = (com.flextv.livestore.models.EpisodeModel) r1
            r0.minDepth = r3
            r0 = r1
        L2c:
            r1 = r2
            io.realm.internal.RealmObjectProxy r1 = (io.realm.internal.RealmObjectProxy) r1
            io.realm.ProxyState r1 = r1.realmGet$proxyState()
            io.realm.BaseRealm r1 = r1.getRealm$realm()
            io.realm.Realm r1 = (io.realm.Realm) r1
            java.lang.String r1 = r2.realmGet$id()
            r0.realmSet$id(r1)
            java.lang.String r1 = r2.realmGet$episode_num()
            r0.realmSet$episode_num(r1)
            java.lang.String r1 = r2.realmGet$title()
            r0.realmSet$title(r1)
            java.lang.String r1 = r2.realmGet$container_extension()
            r0.realmSet$container_extension(r1)
            int r1 = r2.realmGet$season()
            r0.realmSet$season(r1)
            com.flextv.livestore.models.EpisodeInfoModel r1 = r2.realmGet$info()
            int r3 = r3 + 1
            com.flextv.livestore.models.EpisodeInfoModel r3 = io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy.createDetachedCopy(r1, r3, r4, r5)
            r0.realmSet$info(r3)
            java.lang.String r3 = r2.realmGet$category_name()
            r0.realmSet$category_name(r3)
            java.lang.String r3 = r2.realmGet$stream_icon()
            r0.realmSet$stream_icon(r3)
            java.lang.String r3 = r2.realmGet$season_name()
            r0.realmSet$season_name(r3)
            java.lang.String r3 = r2.realmGet$series_name()
            r0.realmSet$series_name(r3)
            java.lang.String r2 = r2.realmGet$url()
            r0.realmSet$url(r2)
            return r0
        L8d:
            r2 = 0
            return r2
    }

    private static io.realm.internal.OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
            io.realm.internal.OsObjectSchemaInfo$Builder r7 = new io.realm.internal.OsObjectSchemaInfo$Builder
            java.lang.String r1 = ""
            java.lang.String r2 = "EpisodeModel"
            r3 = 0
            r4 = 11
            r5 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            io.realm.RealmFieldType r8 = io.realm.RealmFieldType.STRING
            java.lang.String r1 = ""
            java.lang.String r2 = "id"
            r4 = 0
            r6 = 0
            r3 = r8
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "episode_num"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "title"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "container_extension"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            io.realm.RealmFieldType r3 = io.realm.RealmFieldType.INTEGER
            java.lang.String r1 = ""
            java.lang.String r2 = "season"
            r6 = 1
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            io.realm.RealmFieldType r0 = io.realm.RealmFieldType.OBJECT
            java.lang.String r1 = ""
            java.lang.String r2 = "info"
            java.lang.String r3 = "EpisodeInfoModel"
            r7.addPersistedLinkProperty(r1, r2, r0, r3)
            java.lang.String r1 = ""
            java.lang.String r2 = "category_name"
            r6 = 0
            r0 = r7
            r3 = r8
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "stream_icon"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "season_name"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "series_name"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "url"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            io.realm.internal.OsObjectSchemaInfo r0 = r7.build()
            return r0
    }

    public static com.flextv.livestore.models.EpisodeModel createOrUpdateUsingJsonObject(io.realm.Realm r5, org.json.JSONObject r6, boolean r7) throws org.json.JSONException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 1
            r0.<init>(r1)
            java.lang.String r1 = "info"
            boolean r2 = r6.has(r1)
            if (r2 == 0) goto L11
            r0.add(r1)
        L11:
            java.lang.Class<com.flextv.livestore.models.EpisodeModel> r2 = com.flextv.livestore.models.EpisodeModel.class
            io.realm.RealmModel r0 = r5.createObjectInternal(r2, r0)
            com.flextv.livestore.models.EpisodeModel r0 = (com.flextv.livestore.models.EpisodeModel) r0
            java.lang.String r2 = "id"
            boolean r3 = r6.has(r2)
            r4 = 0
            if (r3 == 0) goto L33
            boolean r3 = r6.isNull(r2)
            if (r3 == 0) goto L2c
            r0.realmSet$id(r4)
            goto L33
        L2c:
            java.lang.String r2 = r6.getString(r2)
            r0.realmSet$id(r2)
        L33:
            java.lang.String r2 = "episode_num"
            boolean r3 = r6.has(r2)
            if (r3 == 0) goto L4c
            boolean r3 = r6.isNull(r2)
            if (r3 == 0) goto L45
            r0.realmSet$episode_num(r4)
            goto L4c
        L45:
            java.lang.String r2 = r6.getString(r2)
            r0.realmSet$episode_num(r2)
        L4c:
            java.lang.String r2 = "title"
            boolean r3 = r6.has(r2)
            if (r3 == 0) goto L66
            boolean r3 = r6.isNull(r2)
            if (r3 == 0) goto L5f
            r0.realmSet$title(r4)
            goto L66
        L5f:
            java.lang.String r2 = r6.getString(r2)
            r0.realmSet$title(r2)
        L66:
            java.lang.String r2 = "container_extension"
            boolean r3 = r6.has(r2)
            if (r3 == 0) goto L7f
            boolean r3 = r6.isNull(r2)
            if (r3 == 0) goto L78
            r0.realmSet$container_extension(r4)
            goto L7f
        L78:
            java.lang.String r2 = r6.getString(r2)
            r0.realmSet$container_extension(r2)
        L7f:
            java.lang.String r2 = "season"
            boolean r3 = r6.has(r2)
            if (r3 == 0) goto L9e
            boolean r3 = r6.isNull(r2)
            if (r3 != 0) goto L96
            int r2 = r6.getInt(r2)
            r0.realmSet$season(r2)
            goto L9e
        L96:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Trying to set non-nullable field 'season' to null."
            r5.<init>(r6)
            throw r5
        L9e:
            boolean r2 = r6.has(r1)
            if (r2 == 0) goto Lb9
            boolean r2 = r6.isNull(r1)
            if (r2 == 0) goto Lae
            r0.realmSet$info(r4)
            goto Lb9
        Lae:
            org.json.JSONObject r1 = r6.getJSONObject(r1)
            com.flextv.livestore.models.EpisodeInfoModel r5 = io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy.createOrUpdateUsingJsonObject(r5, r1, r7)
            r0.realmSet$info(r5)
        Lb9:
            java.lang.String r5 = "category_name"
            boolean r7 = r6.has(r5)
            if (r7 == 0) goto Ld2
            boolean r7 = r6.isNull(r5)
            if (r7 == 0) goto Lcb
            r0.realmSet$category_name(r4)
            goto Ld2
        Lcb:
            java.lang.String r5 = r6.getString(r5)
            r0.realmSet$category_name(r5)
        Ld2:
            java.lang.String r5 = "stream_icon"
            boolean r7 = r6.has(r5)
            if (r7 == 0) goto Lec
            boolean r7 = r6.isNull(r5)
            if (r7 == 0) goto Le5
            r0.realmSet$stream_icon(r4)
            goto Lec
        Le5:
            java.lang.String r5 = r6.getString(r5)
            r0.realmSet$stream_icon(r5)
        Lec:
            java.lang.String r5 = "season_name"
            boolean r7 = r6.has(r5)
            if (r7 == 0) goto L106
            boolean r7 = r6.isNull(r5)
            if (r7 == 0) goto Lff
            r0.realmSet$season_name(r4)
            goto L106
        Lff:
            java.lang.String r5 = r6.getString(r5)
            r0.realmSet$season_name(r5)
        L106:
            java.lang.String r5 = "series_name"
            boolean r7 = r6.has(r5)
            if (r7 == 0) goto L120
            boolean r7 = r6.isNull(r5)
            if (r7 == 0) goto L119
            r0.realmSet$series_name(r4)
            goto L120
        L119:
            java.lang.String r5 = r6.getString(r5)
            r0.realmSet$series_name(r5)
        L120:
            java.lang.String r5 = "url"
            boolean r7 = r6.has(r5)
            if (r7 == 0) goto L13a
            boolean r7 = r6.isNull(r5)
            if (r7 == 0) goto L133
            r0.realmSet$url(r4)
            goto L13a
        L133:
            java.lang.String r5 = r6.getString(r5)
            r0.realmSet$url(r5)
        L13a:
            return r0
    }

    @android.annotation.TargetApi(11)
    public static com.flextv.livestore.models.EpisodeModel createUsingJsonStream(io.realm.Realm r4, android.util.JsonReader r5) throws java.io.IOException {
            com.flextv.livestore.models.EpisodeModel r0 = new com.flextv.livestore.models.EpisodeModel
            r0.<init>()
            r5.beginObject()
        L8:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L181
            java.lang.String r1 = r5.nextName()
            java.lang.String r2 = "id"
            boolean r2 = r1.equals(r2)
            r3 = 0
            if (r2 == 0) goto L32
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L2b
            java.lang.String r1 = r5.nextString()
            r0.realmSet$id(r1)
            goto L8
        L2b:
            r5.skipValue()
            r0.realmSet$id(r3)
            goto L8
        L32:
            java.lang.String r2 = "episode_num"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L51
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L4a
            java.lang.String r1 = r5.nextString()
            r0.realmSet$episode_num(r1)
            goto L8
        L4a:
            r5.skipValue()
            r0.realmSet$episode_num(r3)
            goto L8
        L51:
            java.lang.String r2 = "title"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L71
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L6a
            java.lang.String r1 = r5.nextString()
            r0.realmSet$title(r1)
            goto L8
        L6a:
            r5.skipValue()
            r0.realmSet$title(r3)
            goto L8
        L71:
            java.lang.String r2 = "container_extension"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L91
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L89
            java.lang.String r1 = r5.nextString()
            r0.realmSet$container_extension(r1)
            goto L8
        L89:
            r5.skipValue()
            r0.realmSet$container_extension(r3)
            goto L8
        L91:
            java.lang.String r2 = "season"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto Lb2
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto Lab
            int r1 = r5.nextInt()
            r0.realmSet$season(r1)
            goto L8
        Lab:
            java.lang.String r4 = "Trying to set non-nullable field 'season' to null."
            java.lang.IllegalArgumentException r4 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r5, r4)
            throw r4
        Lb2:
            java.lang.String r2 = "info"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto Ld3
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 != r2) goto Lca
            r5.skipValue()
            r0.realmSet$info(r3)
            goto L8
        Lca:
            com.flextv.livestore.models.EpisodeInfoModel r1 = io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy.createUsingJsonStream(r4, r5)
            r0.realmSet$info(r1)
            goto L8
        Ld3:
            java.lang.String r2 = "category_name"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto Lf4
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto Lec
            java.lang.String r1 = r5.nextString()
            r0.realmSet$category_name(r1)
            goto L8
        Lec:
            r5.skipValue()
            r0.realmSet$category_name(r3)
            goto L8
        Lf4:
            java.lang.String r2 = "stream_icon"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L116
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L10e
            java.lang.String r1 = r5.nextString()
            r0.realmSet$stream_icon(r1)
            goto L8
        L10e:
            r5.skipValue()
            r0.realmSet$stream_icon(r3)
            goto L8
        L116:
            java.lang.String r2 = "season_name"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L138
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L130
            java.lang.String r1 = r5.nextString()
            r0.realmSet$season_name(r1)
            goto L8
        L130:
            r5.skipValue()
            r0.realmSet$season_name(r3)
            goto L8
        L138:
            java.lang.String r2 = "series_name"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L15a
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L152
            java.lang.String r1 = r5.nextString()
            r0.realmSet$series_name(r1)
            goto L8
        L152:
            r5.skipValue()
            r0.realmSet$series_name(r3)
            goto L8
        L15a:
            java.lang.String r2 = "url"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L17c
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L174
            java.lang.String r1 = r5.nextString()
            r0.realmSet$url(r1)
            goto L8
        L174:
            r5.skipValue()
            r0.realmSet$url(r3)
            goto L8
        L17c:
            r5.skipValue()
            goto L8
        L181:
            r5.endObject()
            r5 = 0
            io.realm.ImportFlag[] r5 = new io.realm.ImportFlag[r5]
            io.realm.RealmModel r4 = r4.copyToRealm(r0, r5)
            com.flextv.livestore.models.EpisodeModel r4 = (com.flextv.livestore.models.EpisodeModel) r4
            return r4
    }

    public static io.realm.internal.OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
            io.realm.internal.OsObjectSchemaInfo r0 = io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy.expectedObjectSchemaInfo
            return r0
    }

    public static java.lang.String getSimpleClassName() {
            java.lang.String r0 = "EpisodeModel"
            return r0
    }

    public static long insert(io.realm.Realm r18, com.flextv.livestore.models.EpisodeModel r19, java.util.Map<io.realm.RealmModel, java.lang.Long> r20) {
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r1 instanceof io.realm.internal.RealmObjectProxy
            if (r3 == 0) goto L40
            boolean r3 = io.realm.RealmObject.isFrozen(r19)
            if (r3 != 0) goto L40
            r3 = r1
            io.realm.internal.RealmObjectProxy r3 = (io.realm.internal.RealmObjectProxy) r3
            io.realm.ProxyState r4 = r3.realmGet$proxyState()
            io.realm.BaseRealm r4 = r4.getRealm$realm()
            if (r4 == 0) goto L40
            io.realm.ProxyState r4 = r3.realmGet$proxyState()
            io.realm.BaseRealm r4 = r4.getRealm$realm()
            java.lang.String r4 = r4.getPath()
            java.lang.String r5 = r18.getPath()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L40
            io.realm.ProxyState r0 = r3.realmGet$proxyState()
            io.realm.internal.Row r0 = r0.getRow$realm()
            long r0 = r0.getObjectKey()
            return r0
        L40:
            java.lang.Class<com.flextv.livestore.models.EpisodeModel> r3 = com.flextv.livestore.models.EpisodeModel.class
            io.realm.internal.Table r3 = r0.getTable(r3)
            long r13 = r3.getNativePtr()
            io.realm.RealmSchema r4 = r18.getSchema()
            java.lang.Class<com.flextv.livestore.models.EpisodeModel> r5 = com.flextv.livestore.models.EpisodeModel.class
            io.realm.internal.ColumnInfo r4 = r4.getColumnInfo(r5)
            r15 = r4
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r15 = (io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy.EpisodeModelColumnInfo) r15
            long r16 = io.realm.internal.OsObject.createRow(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r16)
            r2.put(r1, r3)
            java.lang.String r10 = r19.realmGet$id()
            if (r10 == 0) goto L71
            long r6 = r15.idColKey
            r11 = 0
            r4 = r13
            r8 = r16
            io.realm.internal.Table.nativeSetString(r4, r6, r8, r10, r11)
        L71:
            java.lang.String r10 = r19.realmGet$episode_num()
            if (r10 == 0) goto L80
            long r6 = r15.episode_numColKey
            r11 = 0
            r4 = r13
            r8 = r16
            io.realm.internal.Table.nativeSetString(r4, r6, r8, r10, r11)
        L80:
            java.lang.String r10 = r19.realmGet$title()
            if (r10 == 0) goto L8f
            long r6 = r15.titleColKey
            r11 = 0
            r4 = r13
            r8 = r16
            io.realm.internal.Table.nativeSetString(r4, r6, r8, r10, r11)
        L8f:
            java.lang.String r10 = r19.realmGet$container_extension()
            if (r10 == 0) goto L9e
            long r6 = r15.container_extensionColKey
            r11 = 0
            r4 = r13
            r8 = r16
            io.realm.internal.Table.nativeSetString(r4, r6, r8, r10, r11)
        L9e:
            long r6 = r15.seasonColKey
            int r3 = r19.realmGet$season()
            long r10 = (long) r3
            r12 = 0
            r4 = r13
            r8 = r16
            io.realm.internal.Table.nativeSetLong(r4, r6, r8, r10, r12)
            com.flextv.livestore.models.EpisodeInfoModel r3 = r19.realmGet$info()
            if (r3 == 0) goto Lcf
            java.lang.Object r4 = r2.get(r3)
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 != 0) goto Lc2
            long r2 = io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy.insert(r0, r3, r2)
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
        Lc2:
            long r6 = r15.infoColKey
            long r10 = r4.longValue()
            r12 = 0
            r4 = r13
            r8 = r16
            io.realm.internal.Table.nativeSetLink(r4, r6, r8, r10, r12)
        Lcf:
            java.lang.String r10 = r19.realmGet$category_name()
            if (r10 == 0) goto Lde
            long r6 = r15.category_nameColKey
            r11 = 0
            r4 = r13
            r8 = r16
            io.realm.internal.Table.nativeSetString(r4, r6, r8, r10, r11)
        Lde:
            java.lang.String r10 = r19.realmGet$stream_icon()
            if (r10 == 0) goto Led
            long r6 = r15.stream_iconColKey
            r11 = 0
            r4 = r13
            r8 = r16
            io.realm.internal.Table.nativeSetString(r4, r6, r8, r10, r11)
        Led:
            java.lang.String r10 = r19.realmGet$season_name()
            if (r10 == 0) goto Lfc
            long r6 = r15.season_nameColKey
            r11 = 0
            r4 = r13
            r8 = r16
            io.realm.internal.Table.nativeSetString(r4, r6, r8, r10, r11)
        Lfc:
            java.lang.String r10 = r19.realmGet$series_name()
            if (r10 == 0) goto L10b
            long r6 = r15.series_nameColKey
            r11 = 0
            r4 = r13
            r8 = r16
            io.realm.internal.Table.nativeSetString(r4, r6, r8, r10, r11)
        L10b:
            java.lang.String r10 = r19.realmGet$url()
            if (r10 == 0) goto L11a
            long r6 = r15.urlColKey
            r11 = 0
            r4 = r13
            r8 = r16
            io.realm.internal.Table.nativeSetString(r4, r6, r8, r10, r11)
        L11a:
            return r16
    }

    public static void insert(io.realm.Realm r18, java.util.Iterator<? extends io.realm.RealmModel> r19, java.util.Map<io.realm.RealmModel, java.lang.Long> r20) {
            r0 = r18
            r1 = r20
            java.lang.Class<com.flextv.livestore.models.EpisodeModel> r2 = com.flextv.livestore.models.EpisodeModel.class
            io.realm.internal.Table r2 = r0.getTable(r2)
            long r12 = r2.getNativePtr()
            io.realm.RealmSchema r3 = r18.getSchema()
            java.lang.Class<com.flextv.livestore.models.EpisodeModel> r4 = com.flextv.livestore.models.EpisodeModel.class
            io.realm.internal.ColumnInfo r3 = r3.getColumnInfo(r4)
            r14 = r3
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r14 = (io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy.EpisodeModelColumnInfo) r14
        L1b:
            boolean r3 = r19.hasNext()
            if (r3 == 0) goto L135
            java.lang.Object r3 = r19.next()
            r15 = r3
            com.flextv.livestore.models.EpisodeModel r15 = (com.flextv.livestore.models.EpisodeModel) r15
            boolean r3 = r1.containsKey(r15)
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
            r1.put(r15, r3)
            goto L1b
        L70:
            long r16 = io.realm.internal.OsObject.createRow(r2)
            java.lang.Long r3 = java.lang.Long.valueOf(r16)
            r1.put(r15, r3)
            java.lang.String r9 = r15.realmGet$id()
            if (r9 == 0) goto L8a
            long r5 = r14.idColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
        L8a:
            java.lang.String r9 = r15.realmGet$episode_num()
            if (r9 == 0) goto L99
            long r5 = r14.episode_numColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
        L99:
            java.lang.String r9 = r15.realmGet$title()
            if (r9 == 0) goto La8
            long r5 = r14.titleColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
        La8:
            java.lang.String r9 = r15.realmGet$container_extension()
            if (r9 == 0) goto Lb7
            long r5 = r14.container_extensionColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
        Lb7:
            long r5 = r14.seasonColKey
            int r3 = r15.realmGet$season()
            long r9 = (long) r3
            r11 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetLong(r3, r5, r7, r9, r11)
            com.flextv.livestore.models.EpisodeInfoModel r3 = r15.realmGet$info()
            if (r3 == 0) goto Le8
            java.lang.Object r4 = r1.get(r3)
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 != 0) goto Ldb
            long r3 = io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy.insert(r0, r3, r1)
            java.lang.Long r4 = java.lang.Long.valueOf(r3)
        Ldb:
            long r5 = r14.infoColKey
            long r9 = r4.longValue()
            r11 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetLink(r3, r5, r7, r9, r11)
        Le8:
            java.lang.String r9 = r15.realmGet$category_name()
            if (r9 == 0) goto Lf7
            long r5 = r14.category_nameColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
        Lf7:
            java.lang.String r9 = r15.realmGet$stream_icon()
            if (r9 == 0) goto L106
            long r5 = r14.stream_iconColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
        L106:
            java.lang.String r9 = r15.realmGet$season_name()
            if (r9 == 0) goto L115
            long r5 = r14.season_nameColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
        L115:
            java.lang.String r9 = r15.realmGet$series_name()
            if (r9 == 0) goto L124
            long r5 = r14.series_nameColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
        L124:
            java.lang.String r9 = r15.realmGet$url()
            if (r9 == 0) goto L1b
            long r5 = r14.urlColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto L1b
        L135:
            return
    }

    public static long insertOrUpdate(io.realm.Realm r18, com.flextv.livestore.models.EpisodeModel r19, java.util.Map<io.realm.RealmModel, java.lang.Long> r20) {
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r1 instanceof io.realm.internal.RealmObjectProxy
            if (r3 == 0) goto L40
            boolean r3 = io.realm.RealmObject.isFrozen(r19)
            if (r3 != 0) goto L40
            r3 = r1
            io.realm.internal.RealmObjectProxy r3 = (io.realm.internal.RealmObjectProxy) r3
            io.realm.ProxyState r4 = r3.realmGet$proxyState()
            io.realm.BaseRealm r4 = r4.getRealm$realm()
            if (r4 == 0) goto L40
            io.realm.ProxyState r4 = r3.realmGet$proxyState()
            io.realm.BaseRealm r4 = r4.getRealm$realm()
            java.lang.String r4 = r4.getPath()
            java.lang.String r5 = r18.getPath()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L40
            io.realm.ProxyState r0 = r3.realmGet$proxyState()
            io.realm.internal.Row r0 = r0.getRow$realm()
            long r0 = r0.getObjectKey()
            return r0
        L40:
            java.lang.Class<com.flextv.livestore.models.EpisodeModel> r3 = com.flextv.livestore.models.EpisodeModel.class
            io.realm.internal.Table r3 = r0.getTable(r3)
            long r13 = r3.getNativePtr()
            io.realm.RealmSchema r4 = r18.getSchema()
            java.lang.Class<com.flextv.livestore.models.EpisodeModel> r5 = com.flextv.livestore.models.EpisodeModel.class
            io.realm.internal.ColumnInfo r4 = r4.getColumnInfo(r5)
            r15 = r4
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r15 = (io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy.EpisodeModelColumnInfo) r15
            long r16 = io.realm.internal.OsObject.createRow(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r16)
            r2.put(r1, r3)
            java.lang.String r10 = r19.realmGet$id()
            if (r10 == 0) goto L72
            long r6 = r15.idColKey
            r11 = 0
            r4 = r13
            r8 = r16
            io.realm.internal.Table.nativeSetString(r4, r6, r8, r10, r11)
            goto L7b
        L72:
            long r6 = r15.idColKey
            r10 = 0
            r4 = r13
            r8 = r16
            io.realm.internal.Table.nativeSetNull(r4, r6, r8, r10)
        L7b:
            java.lang.String r10 = r19.realmGet$episode_num()
            if (r10 == 0) goto L8b
            long r6 = r15.episode_numColKey
            r11 = 0
            r4 = r13
            r8 = r16
            io.realm.internal.Table.nativeSetString(r4, r6, r8, r10, r11)
            goto L94
        L8b:
            long r6 = r15.episode_numColKey
            r10 = 0
            r4 = r13
            r8 = r16
            io.realm.internal.Table.nativeSetNull(r4, r6, r8, r10)
        L94:
            java.lang.String r10 = r19.realmGet$title()
            if (r10 == 0) goto La4
            long r6 = r15.titleColKey
            r11 = 0
            r4 = r13
            r8 = r16
            io.realm.internal.Table.nativeSetString(r4, r6, r8, r10, r11)
            goto Lad
        La4:
            long r6 = r15.titleColKey
            r10 = 0
            r4 = r13
            r8 = r16
            io.realm.internal.Table.nativeSetNull(r4, r6, r8, r10)
        Lad:
            java.lang.String r10 = r19.realmGet$container_extension()
            if (r10 == 0) goto Lbd
            long r6 = r15.container_extensionColKey
            r11 = 0
            r4 = r13
            r8 = r16
            io.realm.internal.Table.nativeSetString(r4, r6, r8, r10, r11)
            goto Lc6
        Lbd:
            long r6 = r15.container_extensionColKey
            r10 = 0
            r4 = r13
            r8 = r16
            io.realm.internal.Table.nativeSetNull(r4, r6, r8, r10)
        Lc6:
            long r6 = r15.seasonColKey
            int r3 = r19.realmGet$season()
            long r10 = (long) r3
            r12 = 0
            r4 = r13
            r8 = r16
            io.realm.internal.Table.nativeSetLong(r4, r6, r8, r10, r12)
            com.flextv.livestore.models.EpisodeInfoModel r3 = r19.realmGet$info()
            if (r3 == 0) goto Lf8
            java.lang.Object r4 = r2.get(r3)
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 != 0) goto Lea
            long r2 = io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy.insertOrUpdate(r0, r3, r2)
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
        Lea:
            long r6 = r15.infoColKey
            long r10 = r4.longValue()
            r12 = 0
            r4 = r13
            r8 = r16
            io.realm.internal.Table.nativeSetLink(r4, r6, r8, r10, r12)
            goto L100
        Lf8:
            long r6 = r15.infoColKey
            r4 = r13
            r8 = r16
            io.realm.internal.Table.nativeNullifyLink(r4, r6, r8)
        L100:
            java.lang.String r10 = r19.realmGet$category_name()
            if (r10 == 0) goto L110
            long r6 = r15.category_nameColKey
            r11 = 0
            r4 = r13
            r8 = r16
            io.realm.internal.Table.nativeSetString(r4, r6, r8, r10, r11)
            goto L119
        L110:
            long r6 = r15.category_nameColKey
            r10 = 0
            r4 = r13
            r8 = r16
            io.realm.internal.Table.nativeSetNull(r4, r6, r8, r10)
        L119:
            java.lang.String r10 = r19.realmGet$stream_icon()
            if (r10 == 0) goto L129
            long r6 = r15.stream_iconColKey
            r11 = 0
            r4 = r13
            r8 = r16
            io.realm.internal.Table.nativeSetString(r4, r6, r8, r10, r11)
            goto L132
        L129:
            long r6 = r15.stream_iconColKey
            r10 = 0
            r4 = r13
            r8 = r16
            io.realm.internal.Table.nativeSetNull(r4, r6, r8, r10)
        L132:
            java.lang.String r10 = r19.realmGet$season_name()
            if (r10 == 0) goto L142
            long r6 = r15.season_nameColKey
            r11 = 0
            r4 = r13
            r8 = r16
            io.realm.internal.Table.nativeSetString(r4, r6, r8, r10, r11)
            goto L14b
        L142:
            long r6 = r15.season_nameColKey
            r10 = 0
            r4 = r13
            r8 = r16
            io.realm.internal.Table.nativeSetNull(r4, r6, r8, r10)
        L14b:
            java.lang.String r10 = r19.realmGet$series_name()
            if (r10 == 0) goto L15b
            long r6 = r15.series_nameColKey
            r11 = 0
            r4 = r13
            r8 = r16
            io.realm.internal.Table.nativeSetString(r4, r6, r8, r10, r11)
            goto L164
        L15b:
            long r6 = r15.series_nameColKey
            r10 = 0
            r4 = r13
            r8 = r16
            io.realm.internal.Table.nativeSetNull(r4, r6, r8, r10)
        L164:
            java.lang.String r10 = r19.realmGet$url()
            if (r10 == 0) goto L174
            long r6 = r15.urlColKey
            r11 = 0
            r4 = r13
            r8 = r16
            io.realm.internal.Table.nativeSetString(r4, r6, r8, r10, r11)
            goto L17d
        L174:
            long r6 = r15.urlColKey
            r10 = 0
            r4 = r13
            r8 = r16
            io.realm.internal.Table.nativeSetNull(r4, r6, r8, r10)
        L17d:
            return r16
    }

    public static void insertOrUpdate(io.realm.Realm r18, java.util.Iterator<? extends io.realm.RealmModel> r19, java.util.Map<io.realm.RealmModel, java.lang.Long> r20) {
            r0 = r18
            r1 = r20
            java.lang.Class<com.flextv.livestore.models.EpisodeModel> r2 = com.flextv.livestore.models.EpisodeModel.class
            io.realm.internal.Table r2 = r0.getTable(r2)
            long r12 = r2.getNativePtr()
            io.realm.RealmSchema r3 = r18.getSchema()
            java.lang.Class<com.flextv.livestore.models.EpisodeModel> r4 = com.flextv.livestore.models.EpisodeModel.class
            io.realm.internal.ColumnInfo r3 = r3.getColumnInfo(r4)
            r14 = r3
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r14 = (io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy.EpisodeModelColumnInfo) r14
        L1b:
            boolean r3 = r19.hasNext()
            if (r3 == 0) goto L199
            java.lang.Object r3 = r19.next()
            r15 = r3
            com.flextv.livestore.models.EpisodeModel r15 = (com.flextv.livestore.models.EpisodeModel) r15
            boolean r3 = r1.containsKey(r15)
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
            r1.put(r15, r3)
            goto L1b
        L70:
            long r16 = io.realm.internal.OsObject.createRow(r2)
            java.lang.Long r3 = java.lang.Long.valueOf(r16)
            r1.put(r15, r3)
            java.lang.String r9 = r15.realmGet$id()
            if (r9 == 0) goto L8b
            long r5 = r14.idColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto L94
        L8b:
            long r5 = r14.idColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
        L94:
            java.lang.String r9 = r15.realmGet$episode_num()
            if (r9 == 0) goto La4
            long r5 = r14.episode_numColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto Lad
        La4:
            long r5 = r14.episode_numColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
        Lad:
            java.lang.String r9 = r15.realmGet$title()
            if (r9 == 0) goto Lbd
            long r5 = r14.titleColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto Lc6
        Lbd:
            long r5 = r14.titleColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
        Lc6:
            java.lang.String r9 = r15.realmGet$container_extension()
            if (r9 == 0) goto Ld6
            long r5 = r14.container_extensionColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto Ldf
        Ld6:
            long r5 = r14.container_extensionColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
        Ldf:
            long r5 = r14.seasonColKey
            int r3 = r15.realmGet$season()
            long r9 = (long) r3
            r11 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetLong(r3, r5, r7, r9, r11)
            com.flextv.livestore.models.EpisodeInfoModel r3 = r15.realmGet$info()
            if (r3 == 0) goto L111
            java.lang.Object r4 = r1.get(r3)
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 != 0) goto L103
            long r3 = io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy.insertOrUpdate(r0, r3, r1)
            java.lang.Long r4 = java.lang.Long.valueOf(r3)
        L103:
            long r5 = r14.infoColKey
            long r9 = r4.longValue()
            r11 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetLink(r3, r5, r7, r9, r11)
            goto L119
        L111:
            long r5 = r14.infoColKey
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeNullifyLink(r3, r5, r7)
        L119:
            java.lang.String r9 = r15.realmGet$category_name()
            if (r9 == 0) goto L129
            long r5 = r14.category_nameColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto L132
        L129:
            long r5 = r14.category_nameColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
        L132:
            java.lang.String r9 = r15.realmGet$stream_icon()
            if (r9 == 0) goto L142
            long r5 = r14.stream_iconColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto L14b
        L142:
            long r5 = r14.stream_iconColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
        L14b:
            java.lang.String r9 = r15.realmGet$season_name()
            if (r9 == 0) goto L15b
            long r5 = r14.season_nameColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto L164
        L15b:
            long r5 = r14.season_nameColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
        L164:
            java.lang.String r9 = r15.realmGet$series_name()
            if (r9 == 0) goto L174
            long r5 = r14.series_nameColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto L17d
        L174:
            long r5 = r14.series_nameColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
        L17d:
            java.lang.String r9 = r15.realmGet$url()
            if (r9 == 0) goto L18e
            long r5 = r14.urlColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto L1b
        L18e:
            long r5 = r14.urlColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
            goto L1b
        L199:
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
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy r7 = (io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy) r7
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r2 = r6.proxyState
            io.realm.BaseRealm r2 = r2.getRealm$realm()
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r3 = r7.proxyState
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
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r2 = r6.proxyState
            io.realm.internal.Row r2 = r2.getRow$realm()
            io.realm.internal.Table r2 = r2.getTable()
            java.lang.String r2 = r2.getName()
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r3 = r7.proxyState
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
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r2 = r6.proxyState
            io.realm.internal.Row r2 = r2.getRow$realm()
            long r2 = r2.getObjectKey()
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r7 = r7.proxyState
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
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r6.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            java.lang.String r0 = r0.getPath()
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r1 = r6.proxyState
            io.realm.internal.Row r1 = r1.getRow$realm()
            io.realm.internal.Table r1 = r1.getTable()
            java.lang.String r1 = r1.getName()
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r2 = r6.proxyState
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
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r3.proxyState
            if (r0 == 0) goto L5
            return
        L5:
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r0 = io.realm.BaseRealm.objectContext
            java.lang.Object r0 = r0.get()
            io.realm.BaseRealm$RealmObjectContext r0 = (io.realm.BaseRealm.RealmObjectContext) r0
            io.realm.internal.ColumnInfo r1 = r0.getColumnInfo()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r1 = (io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy.EpisodeModelColumnInfo) r1
            r3.columnInfo = r1
            io.realm.ProxyState r1 = new io.realm.ProxyState
            r1.<init>(r3)
            r3.proxyState = r1
            io.realm.BaseRealm r2 = r0.getRealm()
            r1.setRealm$realm(r2)
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r1 = r3.proxyState
            io.realm.internal.Row r2 = r0.getRow()
            r1.setRow$realm(r2)
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r1 = r3.proxyState
            boolean r2 = r0.getAcceptDefaultValue()
            r1.setAcceptDefaultValue$realm(r2)
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r1 = r3.proxyState
            java.util.List r0 = r0.getExcludeFields()
            r1.setExcludeFields$realm(r0)
            return
    }

    @Override // com.flextv.livestore.models.EpisodeModel, io.realm.com_flextv_livestore_models_EpisodeModelRealmProxyInterface
    public java.lang.String realmGet$category_name() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.category_nameColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.EpisodeModel, io.realm.com_flextv_livestore_models_EpisodeModelRealmProxyInterface
    public java.lang.String realmGet$container_extension() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.container_extensionColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.EpisodeModel, io.realm.com_flextv_livestore_models_EpisodeModelRealmProxyInterface
    public java.lang.String realmGet$episode_num() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.episode_numColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.EpisodeModel, io.realm.com_flextv_livestore_models_EpisodeModelRealmProxyInterface
    public java.lang.String realmGet$id() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.idColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.EpisodeModel, io.realm.com_flextv_livestore_models_EpisodeModelRealmProxyInterface
    public com.flextv.livestore.models.EpisodeInfoModel realmGet$info() {
            r5 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r5.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r5.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r1 = r5.columnInfo
            long r1 = r1.infoColKey
            boolean r0 = r0.isNullLink(r1)
            if (r0 == 0) goto L1b
            r0 = 0
            return r0
        L1b:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r5.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            java.lang.Class<com.flextv.livestore.models.EpisodeInfoModel> r1 = com.flextv.livestore.models.EpisodeInfoModel.class
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r2 = r5.proxyState
            io.realm.internal.Row r2 = r2.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r3 = r5.columnInfo
            long r3 = r3.infoColKey
            long r2 = r2.getLink(r3)
            java.util.List r4 = java.util.Collections.emptyList()
            io.realm.RealmModel r0 = r0.get(r1, r2, r4)
            com.flextv.livestore.models.EpisodeInfoModel r0 = (com.flextv.livestore.models.EpisodeInfoModel) r0
            return r0
    }

    @Override // io.realm.internal.RealmObjectProxy
    public io.realm.ProxyState<?> realmGet$proxyState() {
            r1 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r1.proxyState
            return r0
    }

    @Override // com.flextv.livestore.models.EpisodeModel, io.realm.com_flextv_livestore_models_EpisodeModelRealmProxyInterface
    public int realmGet$season() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.seasonColKey
            long r0 = r0.getLong(r1)
            int r1 = (int) r0
            return r1
    }

    @Override // com.flextv.livestore.models.EpisodeModel, io.realm.com_flextv_livestore_models_EpisodeModelRealmProxyInterface
    public java.lang.String realmGet$season_name() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.season_nameColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.EpisodeModel, io.realm.com_flextv_livestore_models_EpisodeModelRealmProxyInterface
    public java.lang.String realmGet$series_name() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.series_nameColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.EpisodeModel, io.realm.com_flextv_livestore_models_EpisodeModelRealmProxyInterface
    public java.lang.String realmGet$stream_icon() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.stream_iconColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.EpisodeModel, io.realm.com_flextv_livestore_models_EpisodeModelRealmProxyInterface
    public java.lang.String realmGet$title() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.titleColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.EpisodeModel, io.realm.com_flextv_livestore_models_EpisodeModelRealmProxyInterface
    public java.lang.String realmGet$url() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.urlColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.EpisodeModel, io.realm.com_flextv_livestore_models_EpisodeModelRealmProxyInterface
    public void realmSet$category_name(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r15 = r14.columnInfo
            long r2 = r15.category_nameColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r1 = r14.columnInfo
            long r8 = r1.category_nameColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r0 = r14.columnInfo
            long r0 = r0.category_nameColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r1 = r14.columnInfo
            long r1 = r1.category_nameColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.EpisodeModel, io.realm.com_flextv_livestore_models_EpisodeModelRealmProxyInterface
    public void realmSet$container_extension(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r15 = r14.columnInfo
            long r2 = r15.container_extensionColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r1 = r14.columnInfo
            long r8 = r1.container_extensionColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r0 = r14.columnInfo
            long r0 = r0.container_extensionColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r1 = r14.columnInfo
            long r1 = r1.container_extensionColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.EpisodeModel, io.realm.com_flextv_livestore_models_EpisodeModelRealmProxyInterface
    public void realmSet$episode_num(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r15 = r14.columnInfo
            long r2 = r15.episode_numColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r1 = r14.columnInfo
            long r8 = r1.episode_numColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r0 = r14.columnInfo
            long r0 = r0.episode_numColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r1 = r14.columnInfo
            long r1 = r1.episode_numColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.EpisodeModel, io.realm.com_flextv_livestore_models_EpisodeModelRealmProxyInterface
    public void realmSet$id(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r15 = r14.columnInfo
            long r2 = r15.idColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r1 = r14.columnInfo
            long r8 = r1.idColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r0 = r14.columnInfo
            long r0 = r0.idColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r1 = r14.columnInfo
            long r1 = r1.idColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.EpisodeModel, io.realm.com_flextv_livestore_models_EpisodeModelRealmProxyInterface
    public void realmSet$info(com.flextv.livestore.models.EpisodeInfoModel r11) {
            r10 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r10.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            io.realm.Realm r0 = (io.realm.Realm) r0
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r1 = r10.proxyState
            boolean r1 = r1.isUnderConstruction()
            if (r1 == 0) goto L6d
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r1 = r10.proxyState
            boolean r1 = r1.getAcceptDefaultValue$realm()
            if (r1 != 0) goto L19
            return
        L19:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r1 = r10.proxyState
            java.util.List r1 = r1.getExcludeFields$realm()
            java.lang.String r2 = "info"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L28
            return
        L28:
            if (r11 == 0) goto L39
            boolean r1 = io.realm.RealmObject.isManaged(r11)
            if (r1 != 0) goto L39
            r1 = 0
            io.realm.ImportFlag[] r1 = new io.realm.ImportFlag[r1]
            io.realm.RealmModel r11 = r0.copyToRealm(r11, r1)
            com.flextv.livestore.models.EpisodeInfoModel r11 = (com.flextv.livestore.models.EpisodeInfoModel) r11
        L39:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r10.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r11 != 0) goto L49
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r11 = r10.columnInfo
            long r1 = r11.infoColKey
            r0.nullifyLink(r1)
            return
        L49:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r1 = r10.proxyState
            r1.checkValidObject(r11)
            io.realm.internal.Table r2 = r0.getTable()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r1 = r10.columnInfo
            long r3 = r1.infoColKey
            long r5 = r0.getObjectKey()
            io.realm.internal.RealmObjectProxy r11 = (io.realm.internal.RealmObjectProxy) r11
            io.realm.ProxyState r11 = r11.realmGet$proxyState()
            io.realm.internal.Row r11 = r11.getRow$realm()
            long r7 = r11.getObjectKey()
            r9 = 1
            r2.setLink(r3, r5, r7, r9)
            return
        L6d:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r10.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r11 != 0) goto L86
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r11 = r10.proxyState
            io.realm.internal.Row r11 = r11.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r0 = r10.columnInfo
            long r0 = r0.infoColKey
            r11.nullifyLink(r0)
            return
        L86:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r10.proxyState
            r0.checkValidObject(r11)
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r10.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r1 = r10.columnInfo
            long r1 = r1.infoColKey
            io.realm.internal.RealmObjectProxy r11 = (io.realm.internal.RealmObjectProxy) r11
            io.realm.ProxyState r11 = r11.realmGet$proxyState()
            io.realm.internal.Row r11 = r11.getRow$realm()
            long r3 = r11.getObjectKey()
            r0.setLink(r1, r3)
            return
    }

    @Override // com.flextv.livestore.models.EpisodeModel, io.realm.com_flextv_livestore_models_EpisodeModelRealmProxyInterface
    public void realmSet$season(int r10) {
            r9 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r9.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L29
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r9.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r9.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r2 = r9.columnInfo
            long r2 = r2.seasonColKey
            long r4 = r0.getObjectKey()
            long r6 = (long) r10
            r8 = 1
            r1.setLong(r2, r4, r6, r8)
            return
        L29:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r9.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r9.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r1 = r9.columnInfo
            long r1 = r1.seasonColKey
            long r3 = (long) r10
            r0.setLong(r1, r3)
            return
    }

    @Override // com.flextv.livestore.models.EpisodeModel, io.realm.com_flextv_livestore_models_EpisodeModelRealmProxyInterface
    public void realmSet$season_name(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r15 = r14.columnInfo
            long r2 = r15.season_nameColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r1 = r14.columnInfo
            long r8 = r1.season_nameColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r0 = r14.columnInfo
            long r0 = r0.season_nameColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r1 = r14.columnInfo
            long r1 = r1.season_nameColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.EpisodeModel, io.realm.com_flextv_livestore_models_EpisodeModelRealmProxyInterface
    public void realmSet$series_name(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r15 = r14.columnInfo
            long r2 = r15.series_nameColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r1 = r14.columnInfo
            long r8 = r1.series_nameColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r0 = r14.columnInfo
            long r0 = r0.series_nameColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r1 = r14.columnInfo
            long r1 = r1.series_nameColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.EpisodeModel, io.realm.com_flextv_livestore_models_EpisodeModelRealmProxyInterface
    public void realmSet$stream_icon(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r15 = r14.columnInfo
            long r2 = r15.stream_iconColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r1 = r14.columnInfo
            long r8 = r1.stream_iconColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r0 = r14.columnInfo
            long r0 = r0.stream_iconColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r1 = r14.columnInfo
            long r1 = r1.stream_iconColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.EpisodeModel, io.realm.com_flextv_livestore_models_EpisodeModelRealmProxyInterface
    public void realmSet$title(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r15 = r14.columnInfo
            long r2 = r15.titleColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r1 = r14.columnInfo
            long r8 = r1.titleColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r0 = r14.columnInfo
            long r0 = r0.titleColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r1 = r14.columnInfo
            long r1 = r1.titleColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.EpisodeModel, io.realm.com_flextv_livestore_models_EpisodeModelRealmProxyInterface
    public void realmSet$url(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r15 = r14.columnInfo
            long r2 = r15.urlColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r1 = r14.columnInfo
            long r8 = r1.urlColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r0 = r14.columnInfo
            long r0 = r0.urlColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r1 = r14.columnInfo
            long r1 = r1.urlColKey
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
            java.lang.String r1 = "EpisodeModel = proxy["
            r0.<init>(r1)
            java.lang.String r1 = "{id:"
            r0.append(r1)
            java.lang.String r1 = r6.realmGet$id()
            java.lang.String r2 = "null"
            if (r1 == 0) goto L23
            java.lang.String r1 = r6.realmGet$id()
            goto L24
        L23:
            r1 = r2
        L24:
            java.lang.String r3 = "}"
            java.lang.String r4 = ","
            java.lang.String r5 = "{episode_num:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r1, r3, r4, r5)
            java.lang.String r1 = r6.realmGet$episode_num()
            if (r1 == 0) goto L3a
            java.lang.String r1 = r6.realmGet$episode_num()
            goto L3b
        L3a:
            r1 = r2
        L3b:
            java.lang.String r5 = "{title:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r1, r3, r4, r5)
            java.lang.String r1 = r6.realmGet$title()
            if (r1 == 0) goto L4c
            java.lang.String r1 = r6.realmGet$title()
            goto L4d
        L4c:
            r1 = r2
        L4d:
            java.lang.String r5 = "{container_extension:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r1, r3, r4, r5)
            java.lang.String r1 = r6.realmGet$container_extension()
            if (r1 == 0) goto L5e
            java.lang.String r1 = r6.realmGet$container_extension()
            goto L5f
        L5e:
            r1 = r2
        L5f:
            java.lang.String r5 = "{season:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r1, r3, r4, r5)
            int r1 = r6.realmGet$season()
            r0.append(r1)
            r0.append(r3)
            r0.append(r4)
            java.lang.String r1 = "{info:"
            r0.append(r1)
            com.flextv.livestore.models.EpisodeInfoModel r1 = r6.realmGet$info()
            if (r1 == 0) goto L81
            java.lang.String r1 = "EpisodeInfoModel"
            goto L82
        L81:
            r1 = r2
        L82:
            java.lang.String r5 = "{category_name:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r1, r3, r4, r5)
            java.lang.String r1 = r6.realmGet$category_name()
            if (r1 == 0) goto L93
            java.lang.String r1 = r6.realmGet$category_name()
            goto L94
        L93:
            r1 = r2
        L94:
            java.lang.String r5 = "{stream_icon:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r1, r3, r4, r5)
            java.lang.String r1 = r6.realmGet$stream_icon()
            if (r1 == 0) goto La5
            java.lang.String r1 = r6.realmGet$stream_icon()
            goto La6
        La5:
            r1 = r2
        La6:
            java.lang.String r5 = "{season_name:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r1, r3, r4, r5)
            java.lang.String r1 = r6.realmGet$season_name()
            if (r1 == 0) goto Lb7
            java.lang.String r1 = r6.realmGet$season_name()
            goto Lb8
        Lb7:
            r1 = r2
        Lb8:
            java.lang.String r5 = "{series_name:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r1, r3, r4, r5)
            java.lang.String r1 = r6.realmGet$series_name()
            if (r1 == 0) goto Lc9
            java.lang.String r1 = r6.realmGet$series_name()
            goto Lca
        Lc9:
            r1 = r2
        Lca:
            java.lang.String r5 = "{url:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r1, r3, r4, r5)
            java.lang.String r1 = r6.realmGet$url()
            if (r1 == 0) goto Lda
            java.lang.String r2 = r6.realmGet$url()
        Lda:
            java.lang.String r1 = "]"
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r2, r3, r1)
            return r0
    }
}
