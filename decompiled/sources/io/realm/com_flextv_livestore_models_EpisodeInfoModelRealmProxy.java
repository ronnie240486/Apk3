package io.realm;

/* JADX INFO: loaded from: classes2.dex */
public class com_flextv_livestore_models_EpisodeInfoModelRealmProxy extends com.flextv.livestore.models.EpisodeInfoModel implements io.realm.internal.RealmObjectProxy {
    private static final java.lang.String NO_ALIAS = "";
    private static final io.realm.internal.OsObjectSchemaInfo expectedObjectSchemaInfo = null;
    private io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy.EpisodeInfoModelColumnInfo columnInfo;
    private io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> proxyState;

    /* JADX INFO: loaded from: classes.dex */
    public static final class ClassNameHelper {
        public static final java.lang.String INTERNAL_CLASS_NAME = "EpisodeInfoModel";

        public ClassNameHelper() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class EpisodeInfoModelColumnInfo extends io.realm.internal.ColumnInfo {
        public long bitrateColKey;
        public long durationColKey;
        public long duration_secsColKey;
        public long movie_imageColKey;
        public long nameColKey;
        public long plotColKey;
        public long ratingColKey;
        public long releasedateColKey;
        public long tmdb_idColKey;

        public EpisodeInfoModelColumnInfo(io.realm.internal.OsSchemaInfo r3) {
                r2 = this;
                r0 = 9
                r2.<init>(r0)
                java.lang.String r0 = "EpisodeInfoModel"
                io.realm.internal.OsObjectSchemaInfo r3 = r3.getObjectSchemaInfo(r0)
                java.lang.String r0 = "bitrate"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.bitrateColKey = r0
                java.lang.String r0 = "duration"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.durationColKey = r0
                java.lang.String r0 = "duration_secs"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.duration_secsColKey = r0
                java.lang.String r0 = "name"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.nameColKey = r0
                java.lang.String r0 = "rating"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.ratingColKey = r0
                java.lang.String r0 = "releasedate"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.releasedateColKey = r0
                java.lang.String r0 = "plot"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.plotColKey = r0
                java.lang.String r0 = "movie_image"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.movie_imageColKey = r0
                java.lang.String r0 = "tmdb_id"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.tmdb_idColKey = r0
                return
        }

        @Override // io.realm.internal.ColumnInfo
        public final void copy(io.realm.internal.ColumnInfo r3, io.realm.internal.ColumnInfo r4) {
                r2 = this;
                io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r3 = (io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy.EpisodeInfoModelColumnInfo) r3
                io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r4 = (io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy.EpisodeInfoModelColumnInfo) r4
                long r0 = r3.bitrateColKey
                r4.bitrateColKey = r0
                long r0 = r3.durationColKey
                r4.durationColKey = r0
                long r0 = r3.duration_secsColKey
                r4.duration_secsColKey = r0
                long r0 = r3.nameColKey
                r4.nameColKey = r0
                long r0 = r3.ratingColKey
                r4.ratingColKey = r0
                long r0 = r3.releasedateColKey
                r4.releasedateColKey = r0
                long r0 = r3.plotColKey
                r4.plotColKey = r0
                long r0 = r3.movie_imageColKey
                r4.movie_imageColKey = r0
                long r0 = r3.tmdb_idColKey
                r4.tmdb_idColKey = r0
                return
        }
    }

    static {
            io.realm.internal.OsObjectSchemaInfo r0 = createExpectedObjectSchemaInfo()
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy.expectedObjectSchemaInfo = r0
            return
    }

    public com_flextv_livestore_models_EpisodeInfoModelRealmProxy() {
            r1 = this;
            r1.<init>()
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r1.proxyState
            r0.setConstructionFinished()
            return
    }

    public static com.flextv.livestore.models.EpisodeInfoModel copy(io.realm.Realm r9, io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy.EpisodeInfoModelColumnInfo r10, com.flextv.livestore.models.EpisodeInfoModel r11, boolean r12, java.util.Map<io.realm.RealmModel, io.realm.internal.RealmObjectProxy> r13, java.util.Set<io.realm.ImportFlag> r14) {
            java.lang.Object r12 = r13.get(r11)
            io.realm.internal.RealmObjectProxy r12 = (io.realm.internal.RealmObjectProxy) r12
            if (r12 == 0) goto Lb
            com.flextv.livestore.models.EpisodeInfoModel r12 = (com.flextv.livestore.models.EpisodeInfoModel) r12
            return r12
        Lb:
            java.lang.Class<com.flextv.livestore.models.EpisodeInfoModel> r12 = com.flextv.livestore.models.EpisodeInfoModel.class
            io.realm.internal.Table r12 = r9.getTable(r12)
            io.realm.internal.objectstore.OsObjectBuilder r0 = new io.realm.internal.objectstore.OsObjectBuilder
            r0.<init>(r12, r14)
            long r1 = r10.bitrateColKey
            int r12 = r11.realmGet$bitrate()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r0.addInteger(r1, r12)
            long r1 = r10.durationColKey
            java.lang.String r12 = r11.realmGet$duration()
            r0.addString(r1, r12)
            long r1 = r10.duration_secsColKey
            int r12 = r11.realmGet$duration_secs()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r0.addInteger(r1, r12)
            long r1 = r10.nameColKey
            java.lang.String r12 = r11.realmGet$name()
            r0.addString(r1, r12)
            long r1 = r10.ratingColKey
            java.lang.String r12 = r11.realmGet$rating()
            r0.addString(r1, r12)
            long r1 = r10.releasedateColKey
            java.lang.String r12 = r11.realmGet$releasedate()
            r0.addString(r1, r12)
            long r1 = r10.plotColKey
            java.lang.String r12 = r11.realmGet$plot()
            r0.addString(r1, r12)
            long r1 = r10.movie_imageColKey
            java.lang.String r12 = r11.realmGet$movie_image()
            r0.addString(r1, r12)
            long r1 = r10.tmdb_idColKey
            java.lang.String r10 = r11.realmGet$tmdb_id()
            r0.addString(r1, r10)
            io.realm.internal.UncheckedRow r5 = r0.createNewObject()
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r10 = io.realm.BaseRealm.objectContext
            java.lang.Object r10 = r10.get()
            io.realm.BaseRealm$RealmObjectContext r10 = (io.realm.BaseRealm.RealmObjectContext) r10
            io.realm.RealmSchema r12 = r9.getSchema()
            java.lang.Class<com.flextv.livestore.models.EpisodeInfoModel> r14 = com.flextv.livestore.models.EpisodeInfoModel.class
            io.realm.internal.ColumnInfo r6 = r12.getColumnInfo(r14)
            java.util.List r8 = java.util.Collections.emptyList()
            r7 = 0
            r3 = r10
            r4 = r9
            r3.set(r4, r5, r6, r7, r8)
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy r9 = new io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy
            r9.<init>()
            r10.clear()
            r13.put(r11, r9)
            return r9
    }

    public static com.flextv.livestore.models.EpisodeInfoModel copyOrUpdate(io.realm.Realm r6, io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy.EpisodeInfoModelColumnInfo r7, com.flextv.livestore.models.EpisodeInfoModel r8, boolean r9, java.util.Map<io.realm.RealmModel, io.realm.internal.RealmObjectProxy> r10, java.util.Set<io.realm.ImportFlag> r11) {
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
            com.flextv.livestore.models.EpisodeInfoModel r0 = (com.flextv.livestore.models.EpisodeInfoModel) r0
            return r0
        L51:
            com.flextv.livestore.models.EpisodeInfoModel r6 = copy(r6, r7, r8, r9, r10, r11)
            return r6
    }

    public static io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy.EpisodeInfoModelColumnInfo createColumnInfo(io.realm.internal.OsSchemaInfo r1) {
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r0 = new io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo
            r0.<init>(r1)
            return r0
    }

    public static com.flextv.livestore.models.EpisodeInfoModel createDetachedCopy(com.flextv.livestore.models.EpisodeInfoModel r1, int r2, int r3, java.util.Map<io.realm.RealmModel, io.realm.internal.RealmObjectProxy.CacheData<io.realm.RealmModel>> r4) {
            if (r2 > r3) goto L78
            if (r1 != 0) goto L5
            goto L78
        L5:
            java.lang.Object r3 = r4.get(r1)
            io.realm.internal.RealmObjectProxy$CacheData r3 = (io.realm.internal.RealmObjectProxy.CacheData) r3
            if (r3 != 0) goto L1b
            com.flextv.livestore.models.EpisodeInfoModel r3 = new com.flextv.livestore.models.EpisodeInfoModel
            r3.<init>()
            io.realm.internal.RealmObjectProxy$CacheData r0 = new io.realm.internal.RealmObjectProxy$CacheData
            r0.<init>(r2, r3)
            r4.put(r1, r0)
            goto L2b
        L1b:
            int r4 = r3.minDepth
            if (r2 < r4) goto L24
            E extends io.realm.RealmModel r1 = r3.object
            com.flextv.livestore.models.EpisodeInfoModel r1 = (com.flextv.livestore.models.EpisodeInfoModel) r1
            return r1
        L24:
            E extends io.realm.RealmModel r4 = r3.object
            com.flextv.livestore.models.EpisodeInfoModel r4 = (com.flextv.livestore.models.EpisodeInfoModel) r4
            r3.minDepth = r2
            r3 = r4
        L2b:
            r2 = r1
            io.realm.internal.RealmObjectProxy r2 = (io.realm.internal.RealmObjectProxy) r2
            io.realm.ProxyState r2 = r2.realmGet$proxyState()
            io.realm.BaseRealm r2 = r2.getRealm$realm()
            io.realm.Realm r2 = (io.realm.Realm) r2
            int r2 = r1.realmGet$bitrate()
            r3.realmSet$bitrate(r2)
            java.lang.String r2 = r1.realmGet$duration()
            r3.realmSet$duration(r2)
            int r2 = r1.realmGet$duration_secs()
            r3.realmSet$duration_secs(r2)
            java.lang.String r2 = r1.realmGet$name()
            r3.realmSet$name(r2)
            java.lang.String r2 = r1.realmGet$rating()
            r3.realmSet$rating(r2)
            java.lang.String r2 = r1.realmGet$releasedate()
            r3.realmSet$releasedate(r2)
            java.lang.String r2 = r1.realmGet$plot()
            r3.realmSet$plot(r2)
            java.lang.String r2 = r1.realmGet$movie_image()
            r3.realmSet$movie_image(r2)
            java.lang.String r1 = r1.realmGet$tmdb_id()
            r3.realmSet$tmdb_id(r1)
            return r3
        L78:
            r1 = 0
            return r1
    }

    private static io.realm.internal.OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
            io.realm.internal.OsObjectSchemaInfo$Builder r7 = new io.realm.internal.OsObjectSchemaInfo$Builder
            java.lang.String r1 = ""
            java.lang.String r2 = "EpisodeInfoModel"
            r3 = 0
            r4 = 9
            r5 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            io.realm.RealmFieldType r8 = io.realm.RealmFieldType.INTEGER
            java.lang.String r1 = ""
            java.lang.String r2 = "bitrate"
            r4 = 0
            r6 = 1
            r3 = r8
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            io.realm.RealmFieldType r9 = io.realm.RealmFieldType.STRING
            java.lang.String r1 = ""
            java.lang.String r2 = "duration"
            r6 = 0
            r3 = r9
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "duration_secs"
            r6 = 1
            r3 = r8
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "name"
            r6 = 0
            r3 = r9
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "rating"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "releasedate"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "plot"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "movie_image"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "tmdb_id"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            io.realm.internal.OsObjectSchemaInfo r0 = r7.build()
            return r0
    }

    public static com.flextv.livestore.models.EpisodeInfoModel createOrUpdateUsingJsonObject(io.realm.Realm r2, org.json.JSONObject r3, boolean r4) throws org.json.JSONException {
            java.util.List r4 = java.util.Collections.emptyList()
            java.lang.Class<com.flextv.livestore.models.EpisodeInfoModel> r0 = com.flextv.livestore.models.EpisodeInfoModel.class
            io.realm.RealmModel r2 = r2.createObjectInternal(r0, r4)
            com.flextv.livestore.models.EpisodeInfoModel r2 = (com.flextv.livestore.models.EpisodeInfoModel) r2
            java.lang.String r4 = "bitrate"
            boolean r0 = r3.has(r4)
            if (r0 == 0) goto L2a
            boolean r0 = r3.isNull(r4)
            if (r0 != 0) goto L22
            int r4 = r3.getInt(r4)
            r2.realmSet$bitrate(r4)
            goto L2a
        L22:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Trying to set non-nullable field 'bitrate' to null."
            r2.<init>(r3)
            throw r2
        L2a:
            java.lang.String r4 = "duration"
            boolean r0 = r3.has(r4)
            r1 = 0
            if (r0 == 0) goto L44
            boolean r0 = r3.isNull(r4)
            if (r0 == 0) goto L3d
            r2.realmSet$duration(r1)
            goto L44
        L3d:
            java.lang.String r4 = r3.getString(r4)
            r2.realmSet$duration(r4)
        L44:
            java.lang.String r4 = "duration_secs"
            boolean r0 = r3.has(r4)
            if (r0 == 0) goto L62
            boolean r0 = r3.isNull(r4)
            if (r0 != 0) goto L5a
            int r4 = r3.getInt(r4)
            r2.realmSet$duration_secs(r4)
            goto L62
        L5a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Trying to set non-nullable field 'duration_secs' to null."
            r2.<init>(r3)
            throw r2
        L62:
            java.lang.String r4 = "name"
            boolean r0 = r3.has(r4)
            if (r0 == 0) goto L7b
            boolean r0 = r3.isNull(r4)
            if (r0 == 0) goto L74
            r2.realmSet$name(r1)
            goto L7b
        L74:
            java.lang.String r4 = r3.getString(r4)
            r2.realmSet$name(r4)
        L7b:
            java.lang.String r4 = "rating"
            boolean r0 = r3.has(r4)
            if (r0 == 0) goto L94
            boolean r0 = r3.isNull(r4)
            if (r0 == 0) goto L8d
            r2.realmSet$rating(r1)
            goto L94
        L8d:
            java.lang.String r4 = r3.getString(r4)
            r2.realmSet$rating(r4)
        L94:
            java.lang.String r4 = "releasedate"
            boolean r0 = r3.has(r4)
            if (r0 == 0) goto Lad
            boolean r0 = r3.isNull(r4)
            if (r0 == 0) goto La6
            r2.realmSet$releasedate(r1)
            goto Lad
        La6:
            java.lang.String r4 = r3.getString(r4)
            r2.realmSet$releasedate(r4)
        Lad:
            java.lang.String r4 = "plot"
            boolean r0 = r3.has(r4)
            if (r0 == 0) goto Lc6
            boolean r0 = r3.isNull(r4)
            if (r0 == 0) goto Lbf
            r2.realmSet$plot(r1)
            goto Lc6
        Lbf:
            java.lang.String r4 = r3.getString(r4)
            r2.realmSet$plot(r4)
        Lc6:
            java.lang.String r4 = "movie_image"
            boolean r0 = r3.has(r4)
            if (r0 == 0) goto Ldf
            boolean r0 = r3.isNull(r4)
            if (r0 == 0) goto Ld8
            r2.realmSet$movie_image(r1)
            goto Ldf
        Ld8:
            java.lang.String r4 = r3.getString(r4)
            r2.realmSet$movie_image(r4)
        Ldf:
            java.lang.String r4 = "tmdb_id"
            boolean r0 = r3.has(r4)
            if (r0 == 0) goto Lf9
            boolean r0 = r3.isNull(r4)
            if (r0 == 0) goto Lf2
            r2.realmSet$tmdb_id(r1)
            goto Lf9
        Lf2:
            java.lang.String r3 = r3.getString(r4)
            r2.realmSet$tmdb_id(r3)
        Lf9:
            return r2
    }

    @android.annotation.TargetApi(11)
    public static com.flextv.livestore.models.EpisodeInfoModel createUsingJsonStream(io.realm.Realm r4, android.util.JsonReader r5) throws java.io.IOException {
            com.flextv.livestore.models.EpisodeInfoModel r0 = new com.flextv.livestore.models.EpisodeInfoModel
            r0.<init>()
            r5.beginObject()
        L8:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L13b
            java.lang.String r1 = r5.nextName()
            java.lang.String r2 = "bitrate"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L31
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L2a
            int r1 = r5.nextInt()
            r0.realmSet$bitrate(r1)
            goto L8
        L2a:
            java.lang.String r4 = "Trying to set non-nullable field 'bitrate' to null."
            java.lang.IllegalArgumentException r4 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r5, r4)
            throw r4
        L31:
            java.lang.String r2 = "duration"
            boolean r2 = r1.equals(r2)
            r3 = 0
            if (r2 == 0) goto L51
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L4a
            java.lang.String r1 = r5.nextString()
            r0.realmSet$duration(r1)
            goto L8
        L4a:
            r5.skipValue()
            r0.realmSet$duration(r3)
            goto L8
        L51:
            java.lang.String r2 = "duration_secs"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L70
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L69
            int r1 = r5.nextInt()
            r0.realmSet$duration_secs(r1)
            goto L8
        L69:
            java.lang.String r4 = "Trying to set non-nullable field 'duration_secs' to null."
            java.lang.IllegalArgumentException r4 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r5, r4)
            throw r4
        L70:
            java.lang.String r2 = "name"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L90
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L88
            java.lang.String r1 = r5.nextString()
            r0.realmSet$name(r1)
            goto L8
        L88:
            r5.skipValue()
            r0.realmSet$name(r3)
            goto L8
        L90:
            java.lang.String r2 = "rating"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto Lb1
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto La9
            java.lang.String r1 = r5.nextString()
            r0.realmSet$rating(r1)
            goto L8
        La9:
            r5.skipValue()
            r0.realmSet$rating(r3)
            goto L8
        Lb1:
            java.lang.String r2 = "releasedate"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto Ld2
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto Lca
            java.lang.String r1 = r5.nextString()
            r0.realmSet$releasedate(r1)
            goto L8
        Lca:
            r5.skipValue()
            r0.realmSet$releasedate(r3)
            goto L8
        Ld2:
            java.lang.String r2 = "plot"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto Lf3
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto Leb
            java.lang.String r1 = r5.nextString()
            r0.realmSet$plot(r1)
            goto L8
        Leb:
            r5.skipValue()
            r0.realmSet$plot(r3)
            goto L8
        Lf3:
            java.lang.String r2 = "movie_image"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L114
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L10c
            java.lang.String r1 = r5.nextString()
            r0.realmSet$movie_image(r1)
            goto L8
        L10c:
            r5.skipValue()
            r0.realmSet$movie_image(r3)
            goto L8
        L114:
            java.lang.String r2 = "tmdb_id"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L136
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L12e
            java.lang.String r1 = r5.nextString()
            r0.realmSet$tmdb_id(r1)
            goto L8
        L12e:
            r5.skipValue()
            r0.realmSet$tmdb_id(r3)
            goto L8
        L136:
            r5.skipValue()
            goto L8
        L13b:
            r5.endObject()
            r5 = 0
            io.realm.ImportFlag[] r5 = new io.realm.ImportFlag[r5]
            io.realm.RealmModel r4 = r4.copyToRealm(r0, r5)
            com.flextv.livestore.models.EpisodeInfoModel r4 = (com.flextv.livestore.models.EpisodeInfoModel) r4
            return r4
    }

    public static io.realm.internal.OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
            io.realm.internal.OsObjectSchemaInfo r0 = io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy.expectedObjectSchemaInfo
            return r0
    }

    public static java.lang.String getSimpleClassName() {
            java.lang.String r0 = "EpisodeInfoModel"
            return r0
    }

    public static long insert(io.realm.Realm r16, com.flextv.livestore.models.EpisodeInfoModel r17, java.util.Map<io.realm.RealmModel, java.lang.Long> r18) {
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
            java.lang.Class<com.flextv.livestore.models.EpisodeInfoModel> r1 = com.flextv.livestore.models.EpisodeInfoModel.class
            r2 = r16
            io.realm.internal.Table r1 = r2.getTable(r1)
            long r11 = r1.getNativePtr()
            io.realm.RealmSchema r2 = r16.getSchema()
            java.lang.Class<com.flextv.livestore.models.EpisodeInfoModel> r3 = com.flextv.livestore.models.EpisodeInfoModel.class
            io.realm.internal.ColumnInfo r2 = r2.getColumnInfo(r3)
            r13 = r2
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r13 = (io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy.EpisodeInfoModelColumnInfo) r13
            long r14 = io.realm.internal.OsObject.createRow(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r14)
            r2 = r18
            r2.put(r0, r1)
            long r4 = r13.bitrateColKey
            int r1 = r17.realmGet$bitrate()
            long r8 = (long) r1
            r10 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetLong(r2, r4, r6, r8, r10)
            java.lang.String r8 = r17.realmGet$duration()
            if (r8 == 0) goto L7d
            long r4 = r13.durationColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
        L7d:
            long r4 = r13.duration_secsColKey
            int r1 = r17.realmGet$duration_secs()
            long r8 = (long) r1
            r10 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetLong(r2, r4, r6, r8, r10)
            java.lang.String r8 = r17.realmGet$name()
            if (r8 == 0) goto L98
            long r4 = r13.nameColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
        L98:
            java.lang.String r8 = r17.realmGet$rating()
            if (r8 == 0) goto La6
            long r4 = r13.ratingColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
        La6:
            java.lang.String r8 = r17.realmGet$releasedate()
            if (r8 == 0) goto Lb4
            long r4 = r13.releasedateColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
        Lb4:
            java.lang.String r8 = r17.realmGet$plot()
            if (r8 == 0) goto Lc2
            long r4 = r13.plotColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
        Lc2:
            java.lang.String r8 = r17.realmGet$movie_image()
            if (r8 == 0) goto Ld0
            long r4 = r13.movie_imageColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
        Ld0:
            java.lang.String r8 = r17.realmGet$tmdb_id()
            if (r8 == 0) goto Lde
            long r4 = r13.tmdb_idColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
        Lde:
            return r14
    }

    public static void insert(io.realm.Realm r18, java.util.Iterator<? extends io.realm.RealmModel> r19, java.util.Map<io.realm.RealmModel, java.lang.Long> r20) {
            r0 = r20
            java.lang.Class<com.flextv.livestore.models.EpisodeInfoModel> r1 = com.flextv.livestore.models.EpisodeInfoModel.class
            r2 = r18
            io.realm.internal.Table r1 = r2.getTable(r1)
            long r12 = r1.getNativePtr()
            io.realm.RealmSchema r3 = r18.getSchema()
            java.lang.Class<com.flextv.livestore.models.EpisodeInfoModel> r4 = com.flextv.livestore.models.EpisodeInfoModel.class
            io.realm.internal.ColumnInfo r3 = r3.getColumnInfo(r4)
            r14 = r3
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r14 = (io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy.EpisodeInfoModelColumnInfo) r14
        L1b:
            boolean r3 = r19.hasNext()
            if (r3 == 0) goto L102
            java.lang.Object r3 = r19.next()
            r15 = r3
            com.flextv.livestore.models.EpisodeInfoModel r15 = (com.flextv.livestore.models.EpisodeInfoModel) r15
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
            long r5 = r14.bitrateColKey
            int r3 = r15.realmGet$bitrate()
            long r9 = (long) r3
            r11 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetLong(r3, r5, r7, r9, r11)
            java.lang.String r9 = r15.realmGet$duration()
            if (r9 == 0) goto L98
            long r5 = r14.durationColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
        L98:
            long r5 = r14.duration_secsColKey
            int r3 = r15.realmGet$duration_secs()
            long r9 = (long) r3
            r11 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetLong(r3, r5, r7, r9, r11)
            java.lang.String r9 = r15.realmGet$name()
            if (r9 == 0) goto Lb5
            long r5 = r14.nameColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
        Lb5:
            java.lang.String r9 = r15.realmGet$rating()
            if (r9 == 0) goto Lc4
            long r5 = r14.ratingColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
        Lc4:
            java.lang.String r9 = r15.realmGet$releasedate()
            if (r9 == 0) goto Ld3
            long r5 = r14.releasedateColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
        Ld3:
            java.lang.String r9 = r15.realmGet$plot()
            if (r9 == 0) goto Le2
            long r5 = r14.plotColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
        Le2:
            java.lang.String r9 = r15.realmGet$movie_image()
            if (r9 == 0) goto Lf1
            long r5 = r14.movie_imageColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
        Lf1:
            java.lang.String r9 = r15.realmGet$tmdb_id()
            if (r9 == 0) goto L1b
            long r5 = r14.tmdb_idColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto L1b
        L102:
            return
    }

    public static long insertOrUpdate(io.realm.Realm r16, com.flextv.livestore.models.EpisodeInfoModel r17, java.util.Map<io.realm.RealmModel, java.lang.Long> r18) {
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
            java.lang.Class<com.flextv.livestore.models.EpisodeInfoModel> r1 = com.flextv.livestore.models.EpisodeInfoModel.class
            r2 = r16
            io.realm.internal.Table r1 = r2.getTable(r1)
            long r11 = r1.getNativePtr()
            io.realm.RealmSchema r2 = r16.getSchema()
            java.lang.Class<com.flextv.livestore.models.EpisodeInfoModel> r3 = com.flextv.livestore.models.EpisodeInfoModel.class
            io.realm.internal.ColumnInfo r2 = r2.getColumnInfo(r3)
            r13 = r2
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r13 = (io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy.EpisodeInfoModelColumnInfo) r13
            long r14 = io.realm.internal.OsObject.createRow(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r14)
            r2 = r18
            r2.put(r0, r1)
            long r4 = r13.bitrateColKey
            int r1 = r17.realmGet$bitrate()
            long r8 = (long) r1
            r10 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetLong(r2, r4, r6, r8, r10)
            java.lang.String r8 = r17.realmGet$duration()
            if (r8 == 0) goto L7e
            long r4 = r13.durationColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
            goto L86
        L7e:
            long r4 = r13.durationColKey
            r8 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetNull(r2, r4, r6, r8)
        L86:
            long r4 = r13.duration_secsColKey
            int r1 = r17.realmGet$duration_secs()
            long r8 = (long) r1
            r10 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetLong(r2, r4, r6, r8, r10)
            java.lang.String r8 = r17.realmGet$name()
            if (r8 == 0) goto La2
            long r4 = r13.nameColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
            goto Laa
        La2:
            long r4 = r13.nameColKey
            r8 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetNull(r2, r4, r6, r8)
        Laa:
            java.lang.String r8 = r17.realmGet$rating()
            if (r8 == 0) goto Lb9
            long r4 = r13.ratingColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
            goto Lc1
        Lb9:
            long r4 = r13.ratingColKey
            r8 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetNull(r2, r4, r6, r8)
        Lc1:
            java.lang.String r8 = r17.realmGet$releasedate()
            if (r8 == 0) goto Ld0
            long r4 = r13.releasedateColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
            goto Ld8
        Ld0:
            long r4 = r13.releasedateColKey
            r8 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetNull(r2, r4, r6, r8)
        Ld8:
            java.lang.String r8 = r17.realmGet$plot()
            if (r8 == 0) goto Le7
            long r4 = r13.plotColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
            goto Lef
        Le7:
            long r4 = r13.plotColKey
            r8 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetNull(r2, r4, r6, r8)
        Lef:
            java.lang.String r8 = r17.realmGet$movie_image()
            if (r8 == 0) goto Lfe
            long r4 = r13.movie_imageColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
            goto L106
        Lfe:
            long r4 = r13.movie_imageColKey
            r8 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetNull(r2, r4, r6, r8)
        L106:
            java.lang.String r8 = r17.realmGet$tmdb_id()
            if (r8 == 0) goto L115
            long r4 = r13.tmdb_idColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
            goto L11d
        L115:
            long r4 = r13.tmdb_idColKey
            r8 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetNull(r2, r4, r6, r8)
        L11d:
            return r14
    }

    public static void insertOrUpdate(io.realm.Realm r18, java.util.Iterator<? extends io.realm.RealmModel> r19, java.util.Map<io.realm.RealmModel, java.lang.Long> r20) {
            r0 = r20
            java.lang.Class<com.flextv.livestore.models.EpisodeInfoModel> r1 = com.flextv.livestore.models.EpisodeInfoModel.class
            r2 = r18
            io.realm.internal.Table r1 = r2.getTable(r1)
            long r12 = r1.getNativePtr()
            io.realm.RealmSchema r3 = r18.getSchema()
            java.lang.Class<com.flextv.livestore.models.EpisodeInfoModel> r4 = com.flextv.livestore.models.EpisodeInfoModel.class
            io.realm.internal.ColumnInfo r3 = r3.getColumnInfo(r4)
            r14 = r3
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r14 = (io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy.EpisodeInfoModelColumnInfo) r14
        L1b:
            boolean r3 = r19.hasNext()
            if (r3 == 0) goto L149
            java.lang.Object r3 = r19.next()
            r15 = r3
            com.flextv.livestore.models.EpisodeInfoModel r15 = (com.flextv.livestore.models.EpisodeInfoModel) r15
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
            long r5 = r14.bitrateColKey
            int r3 = r15.realmGet$bitrate()
            long r9 = (long) r3
            r11 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetLong(r3, r5, r7, r9, r11)
            java.lang.String r9 = r15.realmGet$duration()
            if (r9 == 0) goto L99
            long r5 = r14.durationColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto La2
        L99:
            long r5 = r14.durationColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
        La2:
            long r5 = r14.duration_secsColKey
            int r3 = r15.realmGet$duration_secs()
            long r9 = (long) r3
            r11 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetLong(r3, r5, r7, r9, r11)
            java.lang.String r9 = r15.realmGet$name()
            if (r9 == 0) goto Lc0
            long r5 = r14.nameColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto Lc9
        Lc0:
            long r5 = r14.nameColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
        Lc9:
            java.lang.String r9 = r15.realmGet$rating()
            if (r9 == 0) goto Ld9
            long r5 = r14.ratingColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto Le2
        Ld9:
            long r5 = r14.ratingColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
        Le2:
            java.lang.String r9 = r15.realmGet$releasedate()
            if (r9 == 0) goto Lf2
            long r5 = r14.releasedateColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto Lfb
        Lf2:
            long r5 = r14.releasedateColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
        Lfb:
            java.lang.String r9 = r15.realmGet$plot()
            if (r9 == 0) goto L10b
            long r5 = r14.plotColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto L114
        L10b:
            long r5 = r14.plotColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
        L114:
            java.lang.String r9 = r15.realmGet$movie_image()
            if (r9 == 0) goto L124
            long r5 = r14.movie_imageColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto L12d
        L124:
            long r5 = r14.movie_imageColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
        L12d:
            java.lang.String r9 = r15.realmGet$tmdb_id()
            if (r9 == 0) goto L13e
            long r5 = r14.tmdb_idColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto L1b
        L13e:
            long r5 = r14.tmdb_idColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
            goto L1b
        L149:
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
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy r7 = (io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy) r7
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r2 = r6.proxyState
            io.realm.BaseRealm r2 = r2.getRealm$realm()
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r3 = r7.proxyState
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
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r2 = r6.proxyState
            io.realm.internal.Row r2 = r2.getRow$realm()
            io.realm.internal.Table r2 = r2.getTable()
            java.lang.String r2 = r2.getName()
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r3 = r7.proxyState
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
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r2 = r6.proxyState
            io.realm.internal.Row r2 = r2.getRow$realm()
            long r2 = r2.getObjectKey()
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r7 = r7.proxyState
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
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r6.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            java.lang.String r0 = r0.getPath()
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r1 = r6.proxyState
            io.realm.internal.Row r1 = r1.getRow$realm()
            io.realm.internal.Table r1 = r1.getTable()
            java.lang.String r1 = r1.getName()
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r2 = r6.proxyState
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
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r3.proxyState
            if (r0 == 0) goto L5
            return
        L5:
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r0 = io.realm.BaseRealm.objectContext
            java.lang.Object r0 = r0.get()
            io.realm.BaseRealm$RealmObjectContext r0 = (io.realm.BaseRealm.RealmObjectContext) r0
            io.realm.internal.ColumnInfo r1 = r0.getColumnInfo()
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r1 = (io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy.EpisodeInfoModelColumnInfo) r1
            r3.columnInfo = r1
            io.realm.ProxyState r1 = new io.realm.ProxyState
            r1.<init>(r3)
            r3.proxyState = r1
            io.realm.BaseRealm r2 = r0.getRealm()
            r1.setRealm$realm(r2)
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r1 = r3.proxyState
            io.realm.internal.Row r2 = r0.getRow()
            r1.setRow$realm(r2)
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r1 = r3.proxyState
            boolean r2 = r0.getAcceptDefaultValue()
            r1.setAcceptDefaultValue$realm(r2)
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r1 = r3.proxyState
            java.util.List r0 = r0.getExcludeFields()
            r1.setExcludeFields$realm(r0)
            return
    }

    @Override // com.flextv.livestore.models.EpisodeInfoModel, io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxyInterface
    public int realmGet$bitrate() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.bitrateColKey
            long r0 = r0.getLong(r1)
            int r1 = (int) r0
            return r1
    }

    @Override // com.flextv.livestore.models.EpisodeInfoModel, io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxyInterface
    public java.lang.String realmGet$duration() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.durationColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.EpisodeInfoModel, io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxyInterface
    public int realmGet$duration_secs() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.duration_secsColKey
            long r0 = r0.getLong(r1)
            int r1 = (int) r0
            return r1
    }

    @Override // com.flextv.livestore.models.EpisodeInfoModel, io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxyInterface
    public java.lang.String realmGet$movie_image() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.movie_imageColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.EpisodeInfoModel, io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxyInterface
    public java.lang.String realmGet$name() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.nameColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.EpisodeInfoModel, io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxyInterface
    public java.lang.String realmGet$plot() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.plotColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // io.realm.internal.RealmObjectProxy
    public io.realm.ProxyState<?> realmGet$proxyState() {
            r1 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r1.proxyState
            return r0
    }

    @Override // com.flextv.livestore.models.EpisodeInfoModel, io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxyInterface
    public java.lang.String realmGet$rating() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.ratingColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.EpisodeInfoModel, io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxyInterface
    public java.lang.String realmGet$releasedate() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.releasedateColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.EpisodeInfoModel, io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxyInterface
    public java.lang.String realmGet$tmdb_id() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r1 = r3.columnInfo
            long r1 = r1.tmdb_idColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.EpisodeInfoModel, io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxyInterface
    public void realmSet$bitrate(int r10) {
            r9 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r9.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L29
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r9.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r9.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r2 = r9.columnInfo
            long r2 = r2.bitrateColKey
            long r4 = r0.getObjectKey()
            long r6 = (long) r10
            r8 = 1
            r1.setLong(r2, r4, r6, r8)
            return
        L29:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r9.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r9.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r1 = r9.columnInfo
            long r1 = r1.bitrateColKey
            long r3 = (long) r10
            r0.setLong(r1, r3)
            return
    }

    @Override // com.flextv.livestore.models.EpisodeInfoModel, io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxyInterface
    public void realmSet$duration(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r15 = r14.columnInfo
            long r2 = r15.durationColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r1 = r14.columnInfo
            long r8 = r1.durationColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r0 = r14.columnInfo
            long r0 = r0.durationColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r1 = r14.columnInfo
            long r1 = r1.durationColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.EpisodeInfoModel, io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxyInterface
    public void realmSet$duration_secs(int r10) {
            r9 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r9.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L29
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r9.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r9.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r2 = r9.columnInfo
            long r2 = r2.duration_secsColKey
            long r4 = r0.getObjectKey()
            long r6 = (long) r10
            r8 = 1
            r1.setLong(r2, r4, r6, r8)
            return
        L29:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r9.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r9.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r1 = r9.columnInfo
            long r1 = r1.duration_secsColKey
            long r3 = (long) r10
            r0.setLong(r1, r3)
            return
    }

    @Override // com.flextv.livestore.models.EpisodeInfoModel, io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxyInterface
    public void realmSet$movie_image(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r15 = r14.columnInfo
            long r2 = r15.movie_imageColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r1 = r14.columnInfo
            long r8 = r1.movie_imageColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r0 = r14.columnInfo
            long r0 = r0.movie_imageColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r1 = r14.columnInfo
            long r1 = r1.movie_imageColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.EpisodeInfoModel, io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxyInterface
    public void realmSet$name(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r15 = r14.columnInfo
            long r2 = r15.nameColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r1 = r14.columnInfo
            long r8 = r1.nameColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r0 = r14.columnInfo
            long r0 = r0.nameColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r1 = r14.columnInfo
            long r1 = r1.nameColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.EpisodeInfoModel, io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxyInterface
    public void realmSet$plot(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r15 = r14.columnInfo
            long r2 = r15.plotColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r1 = r14.columnInfo
            long r8 = r1.plotColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r0 = r14.columnInfo
            long r0 = r0.plotColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r1 = r14.columnInfo
            long r1 = r1.plotColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.EpisodeInfoModel, io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxyInterface
    public void realmSet$rating(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r15 = r14.columnInfo
            long r2 = r15.ratingColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r1 = r14.columnInfo
            long r8 = r1.ratingColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r0 = r14.columnInfo
            long r0 = r0.ratingColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r1 = r14.columnInfo
            long r1 = r1.ratingColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.EpisodeInfoModel, io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxyInterface
    public void realmSet$releasedate(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r15 = r14.columnInfo
            long r2 = r15.releasedateColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r1 = r14.columnInfo
            long r8 = r1.releasedateColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r0 = r14.columnInfo
            long r0 = r0.releasedateColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r1 = r14.columnInfo
            long r1 = r1.releasedateColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.EpisodeInfoModel, io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxyInterface
    public void realmSet$tmdb_id(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r15 = r14.columnInfo
            long r2 = r15.tmdb_idColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r1 = r14.columnInfo
            long r8 = r1.tmdb_idColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r0 = r14.columnInfo
            long r0 = r0.tmdb_idColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.EpisodeInfoModel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r1 = r14.columnInfo
            long r1 = r1.tmdb_idColKey
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
            java.lang.String r1 = "EpisodeInfoModel = proxy["
            r0.<init>(r1)
            java.lang.String r1 = "{bitrate:"
            r0.append(r1)
            int r1 = r6.realmGet$bitrate()
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r2 = ","
            r0.append(r2)
            java.lang.String r3 = "{duration:"
            r0.append(r3)
            java.lang.String r3 = r6.realmGet$duration()
            java.lang.String r4 = "null"
            if (r3 == 0) goto L3b
            java.lang.String r3 = r6.realmGet$duration()
            goto L3c
        L3b:
            r3 = r4
        L3c:
            java.lang.String r5 = "{duration_secs:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r3, r1, r2, r5)
            int r3 = r6.realmGet$duration_secs()
            r0.append(r3)
            r0.append(r1)
            r0.append(r2)
            java.lang.String r3 = "{name:"
            r0.append(r3)
            java.lang.String r3 = r6.realmGet$name()
            if (r3 == 0) goto L60
            java.lang.String r3 = r6.realmGet$name()
            goto L61
        L60:
            r3 = r4
        L61:
            java.lang.String r5 = "{rating:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r3, r1, r2, r5)
            java.lang.String r3 = r6.realmGet$rating()
            if (r3 == 0) goto L72
            java.lang.String r3 = r6.realmGet$rating()
            goto L73
        L72:
            r3 = r4
        L73:
            java.lang.String r5 = "{releasedate:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r3, r1, r2, r5)
            java.lang.String r3 = r6.realmGet$releasedate()
            if (r3 == 0) goto L84
            java.lang.String r3 = r6.realmGet$releasedate()
            goto L85
        L84:
            r3 = r4
        L85:
            java.lang.String r5 = "{plot:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r3, r1, r2, r5)
            java.lang.String r3 = r6.realmGet$plot()
            if (r3 == 0) goto L96
            java.lang.String r3 = r6.realmGet$plot()
            goto L97
        L96:
            r3 = r4
        L97:
            java.lang.String r5 = "{movie_image:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r3, r1, r2, r5)
            java.lang.String r3 = r6.realmGet$movie_image()
            if (r3 == 0) goto La8
            java.lang.String r3 = r6.realmGet$movie_image()
            goto La9
        La8:
            r3 = r4
        La9:
            java.lang.String r5 = "{tmdb_id:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r3, r1, r2, r5)
            java.lang.String r2 = r6.realmGet$tmdb_id()
            if (r2 == 0) goto Lb9
            java.lang.String r4 = r6.realmGet$tmdb_id()
        Lb9:
            java.lang.String r2 = "]"
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r4, r1, r2)
            return r0
    }
}
