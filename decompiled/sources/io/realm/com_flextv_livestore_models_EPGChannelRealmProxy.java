package io.realm;

/* JADX INFO: loaded from: classes2.dex */
public class com_flextv_livestore_models_EPGChannelRealmProxy extends com.flextv.livestore.models.EPGChannel implements io.realm.internal.RealmObjectProxy {
    private static final java.lang.String NO_ALIAS = "";
    private static final io.realm.internal.OsObjectSchemaInfo expectedObjectSchemaInfo = null;
    private io.realm.com_flextv_livestore_models_EPGChannelRealmProxy.EPGChannelColumnInfo columnInfo;
    private io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> proxyState;

    /* JADX INFO: loaded from: classes3.dex */
    public static final class ClassNameHelper {
        public static final java.lang.String INTERNAL_CLASS_NAME = "EPGChannel";

        public ClassNameHelper() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public static final class EPGChannelColumnInfo extends io.realm.internal.ColumnInfo {
        public long IdColKey;
        public long addedColKey;
        public long category_idColKey;
        public long category_nameColKey;
        public long cellColKey;
        public long channelIDColKey;
        public long custom_sidColKey;
        public long direct_sourceColKey;
        public long is_favoriteColKey;
        public long is_lockedColKey;
        public long is_recentColKey;
        public long nameColKey;
        public long numColKey;
        public long recent_posColKey;
        public long selectedColKey;
        public long stream_iconColKey;
        public long stream_idColKey;
        public long stream_typeColKey;
        public long tv_archiveColKey;
        public long tv_archive_durationColKey;
        public long urlColKey;

        public EPGChannelColumnInfo(io.realm.internal.OsSchemaInfo r3) {
                r2 = this;
                r0 = 21
                r2.<init>(r0)
                java.lang.String r0 = "EPGChannel"
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
                java.lang.String r0 = "Id"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.IdColKey = r0
                java.lang.String r0 = "added"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.addedColKey = r0
                java.lang.String r0 = "category_id"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.category_idColKey = r0
                java.lang.String r0 = "custom_sid"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.custom_sidColKey = r0
                java.lang.String r0 = "tv_archive"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.tv_archiveColKey = r0
                java.lang.String r0 = "direct_source"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.direct_sourceColKey = r0
                java.lang.String r0 = "tv_archive_duration"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.tv_archive_durationColKey = r0
                java.lang.String r0 = "url"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.urlColKey = r0
                java.lang.String r0 = "category_name"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.category_nameColKey = r0
                java.lang.String r0 = "is_locked"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.is_lockedColKey = r0
                java.lang.String r0 = "is_favorite"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.is_favoriteColKey = r0
                java.lang.String r0 = "is_recent"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.is_recentColKey = r0
                java.lang.String r0 = "recent_pos"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.recent_posColKey = r0
                java.lang.String r0 = "cell"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.cellColKey = r0
                java.lang.String r0 = "channelID"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.channelIDColKey = r0
                java.lang.String r0 = "selected"
                long r0 = r2.addColumnDetails(r0, r0, r3)
                r2.selectedColKey = r0
                return
        }

        @Override // io.realm.internal.ColumnInfo
        public final void copy(io.realm.internal.ColumnInfo r3, io.realm.internal.ColumnInfo r4) {
                r2 = this;
                io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r3 = (io.realm.com_flextv_livestore_models_EPGChannelRealmProxy.EPGChannelColumnInfo) r3
                io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r4 = (io.realm.com_flextv_livestore_models_EPGChannelRealmProxy.EPGChannelColumnInfo) r4
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
                long r0 = r3.IdColKey
                r4.IdColKey = r0
                long r0 = r3.addedColKey
                r4.addedColKey = r0
                long r0 = r3.category_idColKey
                r4.category_idColKey = r0
                long r0 = r3.custom_sidColKey
                r4.custom_sidColKey = r0
                long r0 = r3.tv_archiveColKey
                r4.tv_archiveColKey = r0
                long r0 = r3.direct_sourceColKey
                r4.direct_sourceColKey = r0
                long r0 = r3.tv_archive_durationColKey
                r4.tv_archive_durationColKey = r0
                long r0 = r3.urlColKey
                r4.urlColKey = r0
                long r0 = r3.category_nameColKey
                r4.category_nameColKey = r0
                long r0 = r3.is_lockedColKey
                r4.is_lockedColKey = r0
                long r0 = r3.is_favoriteColKey
                r4.is_favoriteColKey = r0
                long r0 = r3.is_recentColKey
                r4.is_recentColKey = r0
                long r0 = r3.recent_posColKey
                r4.recent_posColKey = r0
                long r0 = r3.cellColKey
                r4.cellColKey = r0
                long r0 = r3.channelIDColKey
                r4.channelIDColKey = r0
                long r0 = r3.selectedColKey
                r4.selectedColKey = r0
                return
        }
    }

    static {
            io.realm.internal.OsObjectSchemaInfo r0 = createExpectedObjectSchemaInfo()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy.expectedObjectSchemaInfo = r0
            return
    }

    public com_flextv_livestore_models_EPGChannelRealmProxy() {
            r1 = this;
            r1.<init>()
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r1.proxyState
            r0.setConstructionFinished()
            return
    }

    public static com.flextv.livestore.models.EPGChannel copy(io.realm.Realm r9, io.realm.com_flextv_livestore_models_EPGChannelRealmProxy.EPGChannelColumnInfo r10, com.flextv.livestore.models.EPGChannel r11, boolean r12, java.util.Map<io.realm.RealmModel, io.realm.internal.RealmObjectProxy> r13, java.util.Set<io.realm.ImportFlag> r14) {
            java.lang.Object r12 = r13.get(r11)
            io.realm.internal.RealmObjectProxy r12 = (io.realm.internal.RealmObjectProxy) r12
            if (r12 == 0) goto Lb
            com.flextv.livestore.models.EPGChannel r12 = (com.flextv.livestore.models.EPGChannel) r12
            return r12
        Lb:
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r12 = com.flextv.livestore.models.EPGChannel.class
            io.realm.internal.Table r12 = r9.getTable(r12)
            io.realm.internal.objectstore.OsObjectBuilder r0 = new io.realm.internal.objectstore.OsObjectBuilder
            r0.<init>(r12, r14)
            long r1 = r10.numColKey
            java.lang.String r12 = r11.realmGet$num()
            r0.addString(r1, r12)
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
            long r1 = r10.IdColKey
            java.lang.String r12 = r11.realmGet$Id()
            r0.addString(r1, r12)
            long r1 = r10.addedColKey
            java.lang.String r12 = r11.realmGet$added()
            r0.addString(r1, r12)
            long r1 = r10.category_idColKey
            java.lang.String r12 = r11.realmGet$category_id()
            r0.addString(r1, r12)
            long r1 = r10.custom_sidColKey
            java.lang.String r12 = r11.realmGet$custom_sid()
            r0.addString(r1, r12)
            long r1 = r10.tv_archiveColKey
            java.lang.String r12 = r11.realmGet$tv_archive()
            r0.addString(r1, r12)
            long r1 = r10.direct_sourceColKey
            java.lang.String r12 = r11.realmGet$direct_source()
            r0.addString(r1, r12)
            long r1 = r10.tv_archive_durationColKey
            java.lang.String r12 = r11.realmGet$tv_archive_duration()
            r0.addString(r1, r12)
            long r1 = r10.urlColKey
            java.lang.String r12 = r11.realmGet$url()
            r0.addString(r1, r12)
            long r1 = r10.category_nameColKey
            java.lang.String r12 = r11.realmGet$category_name()
            r0.addString(r1, r12)
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
            long r1 = r10.recent_posColKey
            long r3 = r11.realmGet$recent_pos()
            java.lang.Long r12 = java.lang.Long.valueOf(r3)
            r0.addInteger(r1, r12)
            long r1 = r10.cellColKey
            int r12 = r11.realmGet$cell()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r0.addInteger(r1, r12)
            long r1 = r10.channelIDColKey
            int r12 = r11.realmGet$channelID()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r0.addInteger(r1, r12)
            long r1 = r10.selectedColKey
            boolean r10 = r11.realmGet$selected()
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r0.addBoolean(r1, r10)
            io.realm.internal.UncheckedRow r5 = r0.createNewObject()
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r10 = io.realm.BaseRealm.objectContext
            java.lang.Object r10 = r10.get()
            io.realm.BaseRealm$RealmObjectContext r10 = (io.realm.BaseRealm.RealmObjectContext) r10
            io.realm.RealmSchema r12 = r9.getSchema()
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r14 = com.flextv.livestore.models.EPGChannel.class
            io.realm.internal.ColumnInfo r6 = r12.getColumnInfo(r14)
            java.util.List r8 = java.util.Collections.emptyList()
            r7 = 0
            r3 = r10
            r4 = r9
            r3.set(r4, r5, r6, r7, r8)
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy r9 = new io.realm.com_flextv_livestore_models_EPGChannelRealmProxy
            r9.<init>()
            r10.clear()
            r13.put(r11, r9)
            return r9
    }

    public static com.flextv.livestore.models.EPGChannel copyOrUpdate(io.realm.Realm r6, io.realm.com_flextv_livestore_models_EPGChannelRealmProxy.EPGChannelColumnInfo r7, com.flextv.livestore.models.EPGChannel r8, boolean r9, java.util.Map<io.realm.RealmModel, io.realm.internal.RealmObjectProxy> r10, java.util.Set<io.realm.ImportFlag> r11) {
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
            com.flextv.livestore.models.EPGChannel r0 = (com.flextv.livestore.models.EPGChannel) r0
            return r0
        L51:
            com.flextv.livestore.models.EPGChannel r6 = copy(r6, r7, r8, r9, r10, r11)
            return r6
    }

    public static io.realm.com_flextv_livestore_models_EPGChannelRealmProxy.EPGChannelColumnInfo createColumnInfo(io.realm.internal.OsSchemaInfo r1) {
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r0 = new io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo
            r0.<init>(r1)
            return r0
    }

    public static com.flextv.livestore.models.EPGChannel createDetachedCopy(com.flextv.livestore.models.EPGChannel r2, int r3, int r4, java.util.Map<io.realm.RealmModel, io.realm.internal.RealmObjectProxy.CacheData<io.realm.RealmModel>> r5) {
            if (r3 > r4) goto Lcd
            if (r2 != 0) goto L6
            goto Lcd
        L6:
            java.lang.Object r4 = r5.get(r2)
            io.realm.internal.RealmObjectProxy$CacheData r4 = (io.realm.internal.RealmObjectProxy.CacheData) r4
            if (r4 != 0) goto L1c
            com.flextv.livestore.models.EPGChannel r4 = new com.flextv.livestore.models.EPGChannel
            r4.<init>()
            io.realm.internal.RealmObjectProxy$CacheData r0 = new io.realm.internal.RealmObjectProxy$CacheData
            r0.<init>(r3, r4)
            r5.put(r2, r0)
            goto L2c
        L1c:
            int r5 = r4.minDepth
            if (r3 < r5) goto L25
            E extends io.realm.RealmModel r2 = r4.object
            com.flextv.livestore.models.EPGChannel r2 = (com.flextv.livestore.models.EPGChannel) r2
            return r2
        L25:
            E extends io.realm.RealmModel r5 = r4.object
            com.flextv.livestore.models.EPGChannel r5 = (com.flextv.livestore.models.EPGChannel) r5
            r4.minDepth = r3
            r4 = r5
        L2c:
            r3 = r2
            io.realm.internal.RealmObjectProxy r3 = (io.realm.internal.RealmObjectProxy) r3
            io.realm.ProxyState r3 = r3.realmGet$proxyState()
            io.realm.BaseRealm r3 = r3.getRealm$realm()
            io.realm.Realm r3 = (io.realm.Realm) r3
            java.lang.String r3 = r2.realmGet$num()
            r4.realmSet$num(r3)
            java.lang.String r3 = r2.realmGet$name()
            r4.realmSet$name(r3)
            java.lang.String r3 = r2.realmGet$stream_type()
            r4.realmSet$stream_type(r3)
            java.lang.String r3 = r2.realmGet$stream_id()
            r4.realmSet$stream_id(r3)
            java.lang.String r3 = r2.realmGet$stream_icon()
            r4.realmSet$stream_icon(r3)
            java.lang.String r3 = r2.realmGet$Id()
            r4.realmSet$Id(r3)
            java.lang.String r3 = r2.realmGet$added()
            r4.realmSet$added(r3)
            java.lang.String r3 = r2.realmGet$category_id()
            r4.realmSet$category_id(r3)
            java.lang.String r3 = r2.realmGet$custom_sid()
            r4.realmSet$custom_sid(r3)
            java.lang.String r3 = r2.realmGet$tv_archive()
            r4.realmSet$tv_archive(r3)
            java.lang.String r3 = r2.realmGet$direct_source()
            r4.realmSet$direct_source(r3)
            java.lang.String r3 = r2.realmGet$tv_archive_duration()
            r4.realmSet$tv_archive_duration(r3)
            java.lang.String r3 = r2.realmGet$url()
            r4.realmSet$url(r3)
            java.lang.String r3 = r2.realmGet$category_name()
            r4.realmSet$category_name(r3)
            boolean r3 = r2.realmGet$is_locked()
            r4.realmSet$is_locked(r3)
            boolean r3 = r2.realmGet$is_favorite()
            r4.realmSet$is_favorite(r3)
            boolean r3 = r2.realmGet$is_recent()
            r4.realmSet$is_recent(r3)
            long r0 = r2.realmGet$recent_pos()
            r4.realmSet$recent_pos(r0)
            int r3 = r2.realmGet$cell()
            r4.realmSet$cell(r3)
            int r3 = r2.realmGet$channelID()
            r4.realmSet$channelID(r3)
            boolean r2 = r2.realmGet$selected()
            r4.realmSet$selected(r2)
            return r4
        Lcd:
            r2 = 0
            return r2
    }

    private static io.realm.internal.OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
            io.realm.internal.OsObjectSchemaInfo$Builder r7 = new io.realm.internal.OsObjectSchemaInfo$Builder
            java.lang.String r1 = ""
            java.lang.String r2 = "EPGChannel"
            r3 = 0
            r4 = 21
            r5 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            io.realm.RealmFieldType r8 = io.realm.RealmFieldType.STRING
            java.lang.String r1 = ""
            java.lang.String r2 = "num"
            r4 = 0
            r6 = 0
            r3 = r8
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "name"
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
            java.lang.String r2 = "Id"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "added"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "category_id"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "custom_sid"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "tv_archive"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "direct_source"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "tv_archive_duration"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "url"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "category_name"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            io.realm.RealmFieldType r8 = io.realm.RealmFieldType.BOOLEAN
            java.lang.String r1 = ""
            java.lang.String r2 = "is_locked"
            r6 = 1
            r3 = r8
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "is_favorite"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "is_recent"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            io.realm.RealmFieldType r9 = io.realm.RealmFieldType.INTEGER
            java.lang.String r1 = ""
            java.lang.String r2 = "recent_pos"
            r3 = r9
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "cell"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "channelID"
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = ""
            java.lang.String r2 = "selected"
            r3 = r8
            r0.addPersistedProperty(r1, r2, r3, r4, r5, r6)
            io.realm.internal.OsObjectSchemaInfo r0 = r7.build()
            return r0
    }

    public static com.flextv.livestore.models.EPGChannel createOrUpdateUsingJsonObject(io.realm.Realm r2, org.json.JSONObject r3, boolean r4) throws org.json.JSONException {
            java.util.List r4 = java.util.Collections.emptyList()
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r0 = com.flextv.livestore.models.EPGChannel.class
            io.realm.RealmModel r2 = r2.createObjectInternal(r0, r4)
            com.flextv.livestore.models.EPGChannel r2 = (com.flextv.livestore.models.EPGChannel) r2
            java.lang.String r4 = "num"
            boolean r0 = r3.has(r4)
            r1 = 0
            if (r0 == 0) goto L26
            boolean r0 = r3.isNull(r4)
            if (r0 == 0) goto L1f
            r2.realmSet$num(r1)
            goto L26
        L1f:
            java.lang.String r4 = r3.getString(r4)
            r2.realmSet$num(r4)
        L26:
            java.lang.String r4 = "name"
            boolean r0 = r3.has(r4)
            if (r0 == 0) goto L3f
            boolean r0 = r3.isNull(r4)
            if (r0 == 0) goto L38
            r2.realmSet$name(r1)
            goto L3f
        L38:
            java.lang.String r4 = r3.getString(r4)
            r2.realmSet$name(r4)
        L3f:
            java.lang.String r4 = "stream_type"
            boolean r0 = r3.has(r4)
            if (r0 == 0) goto L59
            boolean r0 = r3.isNull(r4)
            if (r0 == 0) goto L52
            r2.realmSet$stream_type(r1)
            goto L59
        L52:
            java.lang.String r4 = r3.getString(r4)
            r2.realmSet$stream_type(r4)
        L59:
            java.lang.String r4 = "stream_id"
            boolean r0 = r3.has(r4)
            if (r0 == 0) goto L73
            boolean r0 = r3.isNull(r4)
            if (r0 == 0) goto L6c
            r2.realmSet$stream_id(r1)
            goto L73
        L6c:
            java.lang.String r4 = r3.getString(r4)
            r2.realmSet$stream_id(r4)
        L73:
            java.lang.String r4 = "stream_icon"
            boolean r0 = r3.has(r4)
            if (r0 == 0) goto L8d
            boolean r0 = r3.isNull(r4)
            if (r0 == 0) goto L86
            r2.realmSet$stream_icon(r1)
            goto L8d
        L86:
            java.lang.String r4 = r3.getString(r4)
            r2.realmSet$stream_icon(r4)
        L8d:
            java.lang.String r4 = "Id"
            boolean r0 = r3.has(r4)
            if (r0 == 0) goto La6
            boolean r0 = r3.isNull(r4)
            if (r0 == 0) goto L9f
            r2.realmSet$Id(r1)
            goto La6
        L9f:
            java.lang.String r4 = r3.getString(r4)
            r2.realmSet$Id(r4)
        La6:
            java.lang.String r4 = "added"
            boolean r0 = r3.has(r4)
            if (r0 == 0) goto Lbf
            boolean r0 = r3.isNull(r4)
            if (r0 == 0) goto Lb8
            r2.realmSet$added(r1)
            goto Lbf
        Lb8:
            java.lang.String r4 = r3.getString(r4)
            r2.realmSet$added(r4)
        Lbf:
            java.lang.String r4 = "category_id"
            boolean r0 = r3.has(r4)
            if (r0 == 0) goto Ld8
            boolean r0 = r3.isNull(r4)
            if (r0 == 0) goto Ld1
            r2.realmSet$category_id(r1)
            goto Ld8
        Ld1:
            java.lang.String r4 = r3.getString(r4)
            r2.realmSet$category_id(r4)
        Ld8:
            java.lang.String r4 = "custom_sid"
            boolean r0 = r3.has(r4)
            if (r0 == 0) goto Lf1
            boolean r0 = r3.isNull(r4)
            if (r0 == 0) goto Lea
            r2.realmSet$custom_sid(r1)
            goto Lf1
        Lea:
            java.lang.String r4 = r3.getString(r4)
            r2.realmSet$custom_sid(r4)
        Lf1:
            java.lang.String r4 = "tv_archive"
            boolean r0 = r3.has(r4)
            if (r0 == 0) goto L10b
            boolean r0 = r3.isNull(r4)
            if (r0 == 0) goto L104
            r2.realmSet$tv_archive(r1)
            goto L10b
        L104:
            java.lang.String r4 = r3.getString(r4)
            r2.realmSet$tv_archive(r4)
        L10b:
            java.lang.String r4 = "direct_source"
            boolean r0 = r3.has(r4)
            if (r0 == 0) goto L124
            boolean r0 = r3.isNull(r4)
            if (r0 == 0) goto L11d
            r2.realmSet$direct_source(r1)
            goto L124
        L11d:
            java.lang.String r4 = r3.getString(r4)
            r2.realmSet$direct_source(r4)
        L124:
            java.lang.String r4 = "tv_archive_duration"
            boolean r0 = r3.has(r4)
            if (r0 == 0) goto L13e
            boolean r0 = r3.isNull(r4)
            if (r0 == 0) goto L137
            r2.realmSet$tv_archive_duration(r1)
            goto L13e
        L137:
            java.lang.String r4 = r3.getString(r4)
            r2.realmSet$tv_archive_duration(r4)
        L13e:
            java.lang.String r4 = "url"
            boolean r0 = r3.has(r4)
            if (r0 == 0) goto L158
            boolean r0 = r3.isNull(r4)
            if (r0 == 0) goto L151
            r2.realmSet$url(r1)
            goto L158
        L151:
            java.lang.String r4 = r3.getString(r4)
            r2.realmSet$url(r4)
        L158:
            java.lang.String r4 = "category_name"
            boolean r0 = r3.has(r4)
            if (r0 == 0) goto L171
            boolean r0 = r3.isNull(r4)
            if (r0 == 0) goto L16a
            r2.realmSet$category_name(r1)
            goto L171
        L16a:
            java.lang.String r4 = r3.getString(r4)
            r2.realmSet$category_name(r4)
        L171:
            java.lang.String r4 = "is_locked"
            boolean r0 = r3.has(r4)
            if (r0 == 0) goto L18f
            boolean r0 = r3.isNull(r4)
            if (r0 != 0) goto L187
            boolean r4 = r3.getBoolean(r4)
            r2.realmSet$is_locked(r4)
            goto L18f
        L187:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Trying to set non-nullable field 'is_locked' to null."
            r2.<init>(r3)
            throw r2
        L18f:
            java.lang.String r4 = "is_favorite"
            boolean r0 = r3.has(r4)
            if (r0 == 0) goto L1ad
            boolean r0 = r3.isNull(r4)
            if (r0 != 0) goto L1a5
            boolean r4 = r3.getBoolean(r4)
            r2.realmSet$is_favorite(r4)
            goto L1ad
        L1a5:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Trying to set non-nullable field 'is_favorite' to null."
            r2.<init>(r3)
            throw r2
        L1ad:
            java.lang.String r4 = "is_recent"
            boolean r0 = r3.has(r4)
            if (r0 == 0) goto L1cb
            boolean r0 = r3.isNull(r4)
            if (r0 != 0) goto L1c3
            boolean r4 = r3.getBoolean(r4)
            r2.realmSet$is_recent(r4)
            goto L1cb
        L1c3:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Trying to set non-nullable field 'is_recent' to null."
            r2.<init>(r3)
            throw r2
        L1cb:
            java.lang.String r4 = "recent_pos"
            boolean r0 = r3.has(r4)
            if (r0 == 0) goto L1e9
            boolean r0 = r3.isNull(r4)
            if (r0 != 0) goto L1e1
            long r0 = r3.getLong(r4)
            r2.realmSet$recent_pos(r0)
            goto L1e9
        L1e1:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Trying to set non-nullable field 'recent_pos' to null."
            r2.<init>(r3)
            throw r2
        L1e9:
            java.lang.String r4 = "cell"
            boolean r0 = r3.has(r4)
            if (r0 == 0) goto L207
            boolean r0 = r3.isNull(r4)
            if (r0 != 0) goto L1ff
            int r4 = r3.getInt(r4)
            r2.realmSet$cell(r4)
            goto L207
        L1ff:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Trying to set non-nullable field 'cell' to null."
            r2.<init>(r3)
            throw r2
        L207:
            java.lang.String r4 = "channelID"
            boolean r0 = r3.has(r4)
            if (r0 == 0) goto L225
            boolean r0 = r3.isNull(r4)
            if (r0 != 0) goto L21d
            int r4 = r3.getInt(r4)
            r2.realmSet$channelID(r4)
            goto L225
        L21d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Trying to set non-nullable field 'channelID' to null."
            r2.<init>(r3)
            throw r2
        L225:
            java.lang.String r4 = "selected"
            boolean r0 = r3.has(r4)
            if (r0 == 0) goto L244
            boolean r0 = r3.isNull(r4)
            if (r0 != 0) goto L23c
            boolean r3 = r3.getBoolean(r4)
            r2.realmSet$selected(r3)
            goto L244
        L23c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Trying to set non-nullable field 'selected' to null."
            r2.<init>(r3)
            throw r2
        L244:
            return r2
    }

    @android.annotation.TargetApi(11)
    public static com.flextv.livestore.models.EPGChannel createUsingJsonStream(io.realm.Realm r4, android.util.JsonReader r5) throws java.io.IOException {
            com.flextv.livestore.models.EPGChannel r0 = new com.flextv.livestore.models.EPGChannel
            r0.<init>()
            r5.beginObject()
        L8:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L2c7
            java.lang.String r1 = r5.nextName()
            java.lang.String r2 = "num"
            boolean r2 = r1.equals(r2)
            r3 = 0
            if (r2 == 0) goto L32
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L2b
            java.lang.String r1 = r5.nextString()
            r0.realmSet$num(r1)
            goto L8
        L2b:
            r5.skipValue()
            r0.realmSet$num(r3)
            goto L8
        L32:
            java.lang.String r2 = "name"
            boolean r2 = r1.equals(r2)
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
            java.lang.String r2 = "Id"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto Ld6
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto Lce
            java.lang.String r1 = r5.nextString()
            r0.realmSet$Id(r1)
            goto L8
        Lce:
            r5.skipValue()
            r0.realmSet$Id(r3)
            goto L8
        Ld6:
            java.lang.String r2 = "added"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto Lf7
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto Lef
            java.lang.String r1 = r5.nextString()
            r0.realmSet$added(r1)
            goto L8
        Lef:
            r5.skipValue()
            r0.realmSet$added(r3)
            goto L8
        Lf7:
            java.lang.String r2 = "category_id"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L118
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L110
            java.lang.String r1 = r5.nextString()
            r0.realmSet$category_id(r1)
            goto L8
        L110:
            r5.skipValue()
            r0.realmSet$category_id(r3)
            goto L8
        L118:
            java.lang.String r2 = "custom_sid"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L139
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L131
            java.lang.String r1 = r5.nextString()
            r0.realmSet$custom_sid(r1)
            goto L8
        L131:
            r5.skipValue()
            r0.realmSet$custom_sid(r3)
            goto L8
        L139:
            java.lang.String r2 = "tv_archive"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L15b
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L153
            java.lang.String r1 = r5.nextString()
            r0.realmSet$tv_archive(r1)
            goto L8
        L153:
            r5.skipValue()
            r0.realmSet$tv_archive(r3)
            goto L8
        L15b:
            java.lang.String r2 = "direct_source"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L17c
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L174
            java.lang.String r1 = r5.nextString()
            r0.realmSet$direct_source(r1)
            goto L8
        L174:
            r5.skipValue()
            r0.realmSet$direct_source(r3)
            goto L8
        L17c:
            java.lang.String r2 = "tv_archive_duration"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L19e
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L196
            java.lang.String r1 = r5.nextString()
            r0.realmSet$tv_archive_duration(r1)
            goto L8
        L196:
            r5.skipValue()
            r0.realmSet$tv_archive_duration(r3)
            goto L8
        L19e:
            java.lang.String r2 = "url"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L1c0
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L1b8
            java.lang.String r1 = r5.nextString()
            r0.realmSet$url(r1)
            goto L8
        L1b8:
            r5.skipValue()
            r0.realmSet$url(r3)
            goto L8
        L1c0:
            java.lang.String r2 = "category_name"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L1e1
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L1d9
            java.lang.String r1 = r5.nextString()
            r0.realmSet$category_name(r1)
            goto L8
        L1d9:
            r5.skipValue()
            r0.realmSet$category_name(r3)
            goto L8
        L1e1:
            java.lang.String r2 = "is_locked"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L201
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L1fa
            boolean r1 = r5.nextBoolean()
            r0.realmSet$is_locked(r1)
            goto L8
        L1fa:
            java.lang.String r4 = "Trying to set non-nullable field 'is_locked' to null."
            java.lang.IllegalArgumentException r4 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r5, r4)
            throw r4
        L201:
            java.lang.String r2 = "is_favorite"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L221
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L21a
            boolean r1 = r5.nextBoolean()
            r0.realmSet$is_favorite(r1)
            goto L8
        L21a:
            java.lang.String r4 = "Trying to set non-nullable field 'is_favorite' to null."
            java.lang.IllegalArgumentException r4 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r5, r4)
            throw r4
        L221:
            java.lang.String r2 = "is_recent"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L241
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L23a
            boolean r1 = r5.nextBoolean()
            r0.realmSet$is_recent(r1)
            goto L8
        L23a:
            java.lang.String r4 = "Trying to set non-nullable field 'is_recent' to null."
            java.lang.IllegalArgumentException r4 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r5, r4)
            throw r4
        L241:
            java.lang.String r2 = "recent_pos"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L261
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L25a
            long r1 = r5.nextLong()
            r0.realmSet$recent_pos(r1)
            goto L8
        L25a:
            java.lang.String r4 = "Trying to set non-nullable field 'recent_pos' to null."
            java.lang.IllegalArgumentException r4 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r5, r4)
            throw r4
        L261:
            java.lang.String r2 = "cell"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L281
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L27a
            int r1 = r5.nextInt()
            r0.realmSet$cell(r1)
            goto L8
        L27a:
            java.lang.String r4 = "Trying to set non-nullable field 'cell' to null."
            java.lang.IllegalArgumentException r4 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r5, r4)
            throw r4
        L281:
            java.lang.String r2 = "channelID"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L2a1
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L29a
            int r1 = r5.nextInt()
            r0.realmSet$channelID(r1)
            goto L8
        L29a:
            java.lang.String r4 = "Trying to set non-nullable field 'channelID' to null."
            java.lang.IllegalArgumentException r4 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r5, r4)
            throw r4
        L2a1:
            java.lang.String r2 = "selected"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L2c2
            android.util.JsonToken r1 = r5.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NULL
            if (r1 == r2) goto L2bb
            boolean r1 = r5.nextBoolean()
            r0.realmSet$selected(r1)
            goto L8
        L2bb:
            java.lang.String r4 = "Trying to set non-nullable field 'selected' to null."
            java.lang.IllegalArgumentException r4 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r5, r4)
            throw r4
        L2c2:
            r5.skipValue()
            goto L8
        L2c7:
            r5.endObject()
            r5 = 0
            io.realm.ImportFlag[] r5 = new io.realm.ImportFlag[r5]
            io.realm.RealmModel r4 = r4.copyToRealm(r0, r5)
            com.flextv.livestore.models.EPGChannel r4 = (com.flextv.livestore.models.EPGChannel) r4
            return r4
    }

    public static io.realm.internal.OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
            io.realm.internal.OsObjectSchemaInfo r0 = io.realm.com_flextv_livestore_models_EPGChannelRealmProxy.expectedObjectSchemaInfo
            return r0
    }

    public static java.lang.String getSimpleClassName() {
            java.lang.String r0 = "EPGChannel"
            return r0
    }

    public static long insert(io.realm.Realm r16, com.flextv.livestore.models.EPGChannel r17, java.util.Map<io.realm.RealmModel, java.lang.Long> r18) {
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
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r1 = com.flextv.livestore.models.EPGChannel.class
            r2 = r16
            io.realm.internal.Table r1 = r2.getTable(r1)
            long r11 = r1.getNativePtr()
            io.realm.RealmSchema r2 = r16.getSchema()
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r3 = com.flextv.livestore.models.EPGChannel.class
            io.realm.internal.ColumnInfo r2 = r2.getColumnInfo(r3)
            r13 = r2
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r13 = (io.realm.com_flextv_livestore_models_EPGChannelRealmProxy.EPGChannelColumnInfo) r13
            long r14 = io.realm.internal.OsObject.createRow(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r14)
            r2 = r18
            r2.put(r0, r1)
            java.lang.String r8 = r17.realmGet$num()
            if (r8 == 0) goto L70
            long r4 = r13.numColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
        L70:
            java.lang.String r8 = r17.realmGet$name()
            if (r8 == 0) goto L7e
            long r4 = r13.nameColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
        L7e:
            java.lang.String r8 = r17.realmGet$stream_type()
            if (r8 == 0) goto L8c
            long r4 = r13.stream_typeColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
        L8c:
            java.lang.String r8 = r17.realmGet$stream_id()
            if (r8 == 0) goto L9a
            long r4 = r13.stream_idColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
        L9a:
            java.lang.String r8 = r17.realmGet$stream_icon()
            if (r8 == 0) goto La8
            long r4 = r13.stream_iconColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
        La8:
            java.lang.String r8 = r17.realmGet$Id()
            if (r8 == 0) goto Lb6
            long r4 = r13.IdColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
        Lb6:
            java.lang.String r8 = r17.realmGet$added()
            if (r8 == 0) goto Lc4
            long r4 = r13.addedColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
        Lc4:
            java.lang.String r8 = r17.realmGet$category_id()
            if (r8 == 0) goto Ld2
            long r4 = r13.category_idColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
        Ld2:
            java.lang.String r8 = r17.realmGet$custom_sid()
            if (r8 == 0) goto Le0
            long r4 = r13.custom_sidColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
        Le0:
            java.lang.String r8 = r17.realmGet$tv_archive()
            if (r8 == 0) goto Lee
            long r4 = r13.tv_archiveColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
        Lee:
            java.lang.String r8 = r17.realmGet$direct_source()
            if (r8 == 0) goto Lfc
            long r4 = r13.direct_sourceColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
        Lfc:
            java.lang.String r8 = r17.realmGet$tv_archive_duration()
            if (r8 == 0) goto L10a
            long r4 = r13.tv_archive_durationColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
        L10a:
            java.lang.String r8 = r17.realmGet$url()
            if (r8 == 0) goto L118
            long r4 = r13.urlColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
        L118:
            java.lang.String r8 = r17.realmGet$category_name()
            if (r8 == 0) goto L126
            long r4 = r13.category_nameColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
        L126:
            long r4 = r13.is_lockedColKey
            boolean r8 = r17.realmGet$is_locked()
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetBoolean(r2, r4, r6, r8, r9)
            long r4 = r13.is_favoriteColKey
            boolean r8 = r17.realmGet$is_favorite()
            io.realm.internal.Table.nativeSetBoolean(r2, r4, r6, r8, r9)
            long r4 = r13.is_recentColKey
            boolean r8 = r17.realmGet$is_recent()
            io.realm.internal.Table.nativeSetBoolean(r2, r4, r6, r8, r9)
            long r4 = r13.recent_posColKey
            long r8 = r17.realmGet$recent_pos()
            r10 = 0
            io.realm.internal.Table.nativeSetLong(r2, r4, r6, r8, r10)
            long r4 = r13.cellColKey
            int r1 = r17.realmGet$cell()
            long r8 = (long) r1
            io.realm.internal.Table.nativeSetLong(r2, r4, r6, r8, r10)
            long r4 = r13.channelIDColKey
            int r1 = r17.realmGet$channelID()
            long r8 = (long) r1
            io.realm.internal.Table.nativeSetLong(r2, r4, r6, r8, r10)
            long r4 = r13.selectedColKey
            boolean r8 = r17.realmGet$selected()
            r9 = 0
            io.realm.internal.Table.nativeSetBoolean(r2, r4, r6, r8, r9)
            return r14
    }

    public static void insert(io.realm.Realm r18, java.util.Iterator<? extends io.realm.RealmModel> r19, java.util.Map<io.realm.RealmModel, java.lang.Long> r20) {
            r0 = r20
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r1 = com.flextv.livestore.models.EPGChannel.class
            r2 = r18
            io.realm.internal.Table r1 = r2.getTable(r1)
            long r12 = r1.getNativePtr()
            io.realm.RealmSchema r3 = r18.getSchema()
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r4 = com.flextv.livestore.models.EPGChannel.class
            io.realm.internal.ColumnInfo r3 = r3.getColumnInfo(r4)
            r14 = r3
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r14 = (io.realm.com_flextv_livestore_models_EPGChannelRealmProxy.EPGChannelColumnInfo) r14
        L1b:
            boolean r3 = r19.hasNext()
            if (r3 == 0) goto L198
            java.lang.Object r3 = r19.next()
            r15 = r3
            com.flextv.livestore.models.EPGChannel r15 = (com.flextv.livestore.models.EPGChannel) r15
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
            java.lang.String r9 = r15.realmGet$num()
            if (r9 == 0) goto L8a
            long r5 = r14.numColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
        L8a:
            java.lang.String r9 = r15.realmGet$name()
            if (r9 == 0) goto L99
            long r5 = r14.nameColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
        L99:
            java.lang.String r9 = r15.realmGet$stream_type()
            if (r9 == 0) goto La8
            long r5 = r14.stream_typeColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
        La8:
            java.lang.String r9 = r15.realmGet$stream_id()
            if (r9 == 0) goto Lb7
            long r5 = r14.stream_idColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
        Lb7:
            java.lang.String r9 = r15.realmGet$stream_icon()
            if (r9 == 0) goto Lc6
            long r5 = r14.stream_iconColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
        Lc6:
            java.lang.String r9 = r15.realmGet$Id()
            if (r9 == 0) goto Ld5
            long r5 = r14.IdColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
        Ld5:
            java.lang.String r9 = r15.realmGet$added()
            if (r9 == 0) goto Le4
            long r5 = r14.addedColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
        Le4:
            java.lang.String r9 = r15.realmGet$category_id()
            if (r9 == 0) goto Lf3
            long r5 = r14.category_idColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
        Lf3:
            java.lang.String r9 = r15.realmGet$custom_sid()
            if (r9 == 0) goto L102
            long r5 = r14.custom_sidColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
        L102:
            java.lang.String r9 = r15.realmGet$tv_archive()
            if (r9 == 0) goto L111
            long r5 = r14.tv_archiveColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
        L111:
            java.lang.String r9 = r15.realmGet$direct_source()
            if (r9 == 0) goto L120
            long r5 = r14.direct_sourceColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
        L120:
            java.lang.String r9 = r15.realmGet$tv_archive_duration()
            if (r9 == 0) goto L12f
            long r5 = r14.tv_archive_durationColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
        L12f:
            java.lang.String r9 = r15.realmGet$url()
            if (r9 == 0) goto L13e
            long r5 = r14.urlColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
        L13e:
            java.lang.String r9 = r15.realmGet$category_name()
            if (r9 == 0) goto L14d
            long r5 = r14.category_nameColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
        L14d:
            long r5 = r14.is_lockedColKey
            boolean r9 = r15.realmGet$is_locked()
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetBoolean(r3, r5, r7, r9, r10)
            long r5 = r14.is_favoriteColKey
            boolean r9 = r15.realmGet$is_favorite()
            io.realm.internal.Table.nativeSetBoolean(r3, r5, r7, r9, r10)
            long r5 = r14.is_recentColKey
            boolean r9 = r15.realmGet$is_recent()
            io.realm.internal.Table.nativeSetBoolean(r3, r5, r7, r9, r10)
            long r5 = r14.recent_posColKey
            long r9 = r15.realmGet$recent_pos()
            r11 = 0
            io.realm.internal.Table.nativeSetLong(r3, r5, r7, r9, r11)
            long r5 = r14.cellColKey
            int r3 = r15.realmGet$cell()
            long r9 = (long) r3
            r3 = r12
            io.realm.internal.Table.nativeSetLong(r3, r5, r7, r9, r11)
            long r5 = r14.channelIDColKey
            int r3 = r15.realmGet$channelID()
            long r9 = (long) r3
            r3 = r12
            io.realm.internal.Table.nativeSetLong(r3, r5, r7, r9, r11)
            long r5 = r14.selectedColKey
            boolean r9 = r15.realmGet$selected()
            r10 = 0
            io.realm.internal.Table.nativeSetBoolean(r3, r5, r7, r9, r10)
            goto L1b
        L198:
            return
    }

    public static long insertOrUpdate(io.realm.Realm r16, com.flextv.livestore.models.EPGChannel r17, java.util.Map<io.realm.RealmModel, java.lang.Long> r18) {
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
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r1 = com.flextv.livestore.models.EPGChannel.class
            r2 = r16
            io.realm.internal.Table r1 = r2.getTable(r1)
            long r11 = r1.getNativePtr()
            io.realm.RealmSchema r2 = r16.getSchema()
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r3 = com.flextv.livestore.models.EPGChannel.class
            io.realm.internal.ColumnInfo r2 = r2.getColumnInfo(r3)
            r13 = r2
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r13 = (io.realm.com_flextv_livestore_models_EPGChannelRealmProxy.EPGChannelColumnInfo) r13
            long r14 = io.realm.internal.OsObject.createRow(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r14)
            r2 = r18
            r2.put(r0, r1)
            java.lang.String r8 = r17.realmGet$num()
            if (r8 == 0) goto L71
            long r4 = r13.numColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
            goto L79
        L71:
            long r4 = r13.numColKey
            r8 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetNull(r2, r4, r6, r8)
        L79:
            java.lang.String r8 = r17.realmGet$name()
            if (r8 == 0) goto L88
            long r4 = r13.nameColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
            goto L90
        L88:
            long r4 = r13.nameColKey
            r8 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetNull(r2, r4, r6, r8)
        L90:
            java.lang.String r8 = r17.realmGet$stream_type()
            if (r8 == 0) goto L9f
            long r4 = r13.stream_typeColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
            goto La7
        L9f:
            long r4 = r13.stream_typeColKey
            r8 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetNull(r2, r4, r6, r8)
        La7:
            java.lang.String r8 = r17.realmGet$stream_id()
            if (r8 == 0) goto Lb6
            long r4 = r13.stream_idColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
            goto Lbe
        Lb6:
            long r4 = r13.stream_idColKey
            r8 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetNull(r2, r4, r6, r8)
        Lbe:
            java.lang.String r8 = r17.realmGet$stream_icon()
            if (r8 == 0) goto Lcd
            long r4 = r13.stream_iconColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
            goto Ld5
        Lcd:
            long r4 = r13.stream_iconColKey
            r8 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetNull(r2, r4, r6, r8)
        Ld5:
            java.lang.String r8 = r17.realmGet$Id()
            if (r8 == 0) goto Le4
            long r4 = r13.IdColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
            goto Lec
        Le4:
            long r4 = r13.IdColKey
            r8 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetNull(r2, r4, r6, r8)
        Lec:
            java.lang.String r8 = r17.realmGet$added()
            if (r8 == 0) goto Lfb
            long r4 = r13.addedColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
            goto L103
        Lfb:
            long r4 = r13.addedColKey
            r8 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetNull(r2, r4, r6, r8)
        L103:
            java.lang.String r8 = r17.realmGet$category_id()
            if (r8 == 0) goto L112
            long r4 = r13.category_idColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
            goto L11a
        L112:
            long r4 = r13.category_idColKey
            r8 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetNull(r2, r4, r6, r8)
        L11a:
            java.lang.String r8 = r17.realmGet$custom_sid()
            if (r8 == 0) goto L129
            long r4 = r13.custom_sidColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
            goto L131
        L129:
            long r4 = r13.custom_sidColKey
            r8 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetNull(r2, r4, r6, r8)
        L131:
            java.lang.String r8 = r17.realmGet$tv_archive()
            if (r8 == 0) goto L140
            long r4 = r13.tv_archiveColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
            goto L148
        L140:
            long r4 = r13.tv_archiveColKey
            r8 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetNull(r2, r4, r6, r8)
        L148:
            java.lang.String r8 = r17.realmGet$direct_source()
            if (r8 == 0) goto L157
            long r4 = r13.direct_sourceColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
            goto L15f
        L157:
            long r4 = r13.direct_sourceColKey
            r8 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetNull(r2, r4, r6, r8)
        L15f:
            java.lang.String r8 = r17.realmGet$tv_archive_duration()
            if (r8 == 0) goto L16e
            long r4 = r13.tv_archive_durationColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
            goto L176
        L16e:
            long r4 = r13.tv_archive_durationColKey
            r8 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetNull(r2, r4, r6, r8)
        L176:
            java.lang.String r8 = r17.realmGet$url()
            if (r8 == 0) goto L185
            long r4 = r13.urlColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
            goto L18d
        L185:
            long r4 = r13.urlColKey
            r8 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetNull(r2, r4, r6, r8)
        L18d:
            java.lang.String r8 = r17.realmGet$category_name()
            if (r8 == 0) goto L19c
            long r4 = r13.category_nameColKey
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetString(r2, r4, r6, r8, r9)
            goto L1a4
        L19c:
            long r4 = r13.category_nameColKey
            r8 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetNull(r2, r4, r6, r8)
        L1a4:
            long r4 = r13.is_lockedColKey
            boolean r8 = r17.realmGet$is_locked()
            r9 = 0
            r2 = r11
            r6 = r14
            io.realm.internal.Table.nativeSetBoolean(r2, r4, r6, r8, r9)
            long r4 = r13.is_favoriteColKey
            boolean r8 = r17.realmGet$is_favorite()
            io.realm.internal.Table.nativeSetBoolean(r2, r4, r6, r8, r9)
            long r4 = r13.is_recentColKey
            boolean r8 = r17.realmGet$is_recent()
            io.realm.internal.Table.nativeSetBoolean(r2, r4, r6, r8, r9)
            long r4 = r13.recent_posColKey
            long r8 = r17.realmGet$recent_pos()
            r10 = 0
            io.realm.internal.Table.nativeSetLong(r2, r4, r6, r8, r10)
            long r4 = r13.cellColKey
            int r1 = r17.realmGet$cell()
            long r8 = (long) r1
            io.realm.internal.Table.nativeSetLong(r2, r4, r6, r8, r10)
            long r4 = r13.channelIDColKey
            int r1 = r17.realmGet$channelID()
            long r8 = (long) r1
            io.realm.internal.Table.nativeSetLong(r2, r4, r6, r8, r10)
            long r4 = r13.selectedColKey
            boolean r8 = r17.realmGet$selected()
            r9 = 0
            io.realm.internal.Table.nativeSetBoolean(r2, r4, r6, r8, r9)
            return r14
    }

    public static void insertOrUpdate(io.realm.Realm r18, java.util.Iterator<? extends io.realm.RealmModel> r19, java.util.Map<io.realm.RealmModel, java.lang.Long> r20) {
            r0 = r20
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r1 = com.flextv.livestore.models.EPGChannel.class
            r2 = r18
            io.realm.internal.Table r1 = r2.getTable(r1)
            long r12 = r1.getNativePtr()
            io.realm.RealmSchema r3 = r18.getSchema()
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r4 = com.flextv.livestore.models.EPGChannel.class
            io.realm.internal.ColumnInfo r3 = r3.getColumnInfo(r4)
            r14 = r3
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r14 = (io.realm.com_flextv_livestore_models_EPGChannelRealmProxy.EPGChannelColumnInfo) r14
        L1b:
            boolean r3 = r19.hasNext()
            if (r3 == 0) goto L224
            java.lang.Object r3 = r19.next()
            r15 = r3
            com.flextv.livestore.models.EPGChannel r15 = (com.flextv.livestore.models.EPGChannel) r15
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
            java.lang.String r9 = r15.realmGet$num()
            if (r9 == 0) goto L8b
            long r5 = r14.numColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto L94
        L8b:
            long r5 = r14.numColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
        L94:
            java.lang.String r9 = r15.realmGet$name()
            if (r9 == 0) goto La4
            long r5 = r14.nameColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto Lad
        La4:
            long r5 = r14.nameColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
        Lad:
            java.lang.String r9 = r15.realmGet$stream_type()
            if (r9 == 0) goto Lbd
            long r5 = r14.stream_typeColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto Lc6
        Lbd:
            long r5 = r14.stream_typeColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
        Lc6:
            java.lang.String r9 = r15.realmGet$stream_id()
            if (r9 == 0) goto Ld6
            long r5 = r14.stream_idColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto Ldf
        Ld6:
            long r5 = r14.stream_idColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
        Ldf:
            java.lang.String r9 = r15.realmGet$stream_icon()
            if (r9 == 0) goto Lef
            long r5 = r14.stream_iconColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto Lf8
        Lef:
            long r5 = r14.stream_iconColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
        Lf8:
            java.lang.String r9 = r15.realmGet$Id()
            if (r9 == 0) goto L108
            long r5 = r14.IdColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto L111
        L108:
            long r5 = r14.IdColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
        L111:
            java.lang.String r9 = r15.realmGet$added()
            if (r9 == 0) goto L121
            long r5 = r14.addedColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto L12a
        L121:
            long r5 = r14.addedColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
        L12a:
            java.lang.String r9 = r15.realmGet$category_id()
            if (r9 == 0) goto L13a
            long r5 = r14.category_idColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto L143
        L13a:
            long r5 = r14.category_idColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
        L143:
            java.lang.String r9 = r15.realmGet$custom_sid()
            if (r9 == 0) goto L153
            long r5 = r14.custom_sidColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto L15c
        L153:
            long r5 = r14.custom_sidColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
        L15c:
            java.lang.String r9 = r15.realmGet$tv_archive()
            if (r9 == 0) goto L16c
            long r5 = r14.tv_archiveColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto L175
        L16c:
            long r5 = r14.tv_archiveColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
        L175:
            java.lang.String r9 = r15.realmGet$direct_source()
            if (r9 == 0) goto L185
            long r5 = r14.direct_sourceColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto L18e
        L185:
            long r5 = r14.direct_sourceColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
        L18e:
            java.lang.String r9 = r15.realmGet$tv_archive_duration()
            if (r9 == 0) goto L19e
            long r5 = r14.tv_archive_durationColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto L1a7
        L19e:
            long r5 = r14.tv_archive_durationColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
        L1a7:
            java.lang.String r9 = r15.realmGet$url()
            if (r9 == 0) goto L1b7
            long r5 = r14.urlColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto L1c0
        L1b7:
            long r5 = r14.urlColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
        L1c0:
            java.lang.String r9 = r15.realmGet$category_name()
            if (r9 == 0) goto L1d0
            long r5 = r14.category_nameColKey
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetString(r3, r5, r7, r9, r10)
            goto L1d9
        L1d0:
            long r5 = r14.category_nameColKey
            r9 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetNull(r3, r5, r7, r9)
        L1d9:
            long r5 = r14.is_lockedColKey
            boolean r9 = r15.realmGet$is_locked()
            r10 = 0
            r3 = r12
            r7 = r16
            io.realm.internal.Table.nativeSetBoolean(r3, r5, r7, r9, r10)
            long r5 = r14.is_favoriteColKey
            boolean r9 = r15.realmGet$is_favorite()
            io.realm.internal.Table.nativeSetBoolean(r3, r5, r7, r9, r10)
            long r5 = r14.is_recentColKey
            boolean r9 = r15.realmGet$is_recent()
            io.realm.internal.Table.nativeSetBoolean(r3, r5, r7, r9, r10)
            long r5 = r14.recent_posColKey
            long r9 = r15.realmGet$recent_pos()
            r11 = 0
            io.realm.internal.Table.nativeSetLong(r3, r5, r7, r9, r11)
            long r5 = r14.cellColKey
            int r3 = r15.realmGet$cell()
            long r9 = (long) r3
            r3 = r12
            io.realm.internal.Table.nativeSetLong(r3, r5, r7, r9, r11)
            long r5 = r14.channelIDColKey
            int r3 = r15.realmGet$channelID()
            long r9 = (long) r3
            r3 = r12
            io.realm.internal.Table.nativeSetLong(r3, r5, r7, r9, r11)
            long r5 = r14.selectedColKey
            boolean r9 = r15.realmGet$selected()
            r10 = 0
            io.realm.internal.Table.nativeSetBoolean(r3, r5, r7, r9, r10)
            goto L1b
        L224:
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
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy r7 = (io.realm.com_flextv_livestore_models_EPGChannelRealmProxy) r7
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r2 = r6.proxyState
            io.realm.BaseRealm r2 = r2.getRealm$realm()
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r3 = r7.proxyState
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
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r2 = r6.proxyState
            io.realm.internal.Row r2 = r2.getRow$realm()
            io.realm.internal.Table r2 = r2.getTable()
            java.lang.String r2 = r2.getName()
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r3 = r7.proxyState
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
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r2 = r6.proxyState
            io.realm.internal.Row r2 = r2.getRow$realm()
            long r2 = r2.getObjectKey()
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r7 = r7.proxyState
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
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r6.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            java.lang.String r0 = r0.getPath()
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r1 = r6.proxyState
            io.realm.internal.Row r1 = r1.getRow$realm()
            io.realm.internal.Table r1 = r1.getTable()
            java.lang.String r1 = r1.getName()
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r2 = r6.proxyState
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
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r3.proxyState
            if (r0 == 0) goto L5
            return
        L5:
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r0 = io.realm.BaseRealm.objectContext
            java.lang.Object r0 = r0.get()
            io.realm.BaseRealm$RealmObjectContext r0 = (io.realm.BaseRealm.RealmObjectContext) r0
            io.realm.internal.ColumnInfo r1 = r0.getColumnInfo()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = (io.realm.com_flextv_livestore_models_EPGChannelRealmProxy.EPGChannelColumnInfo) r1
            r3.columnInfo = r1
            io.realm.ProxyState r1 = new io.realm.ProxyState
            r1.<init>(r3)
            r3.proxyState = r1
            io.realm.BaseRealm r2 = r0.getRealm()
            r1.setRealm$realm(r2)
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r1 = r3.proxyState
            io.realm.internal.Row r2 = r0.getRow()
            r1.setRow$realm(r2)
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r1 = r3.proxyState
            boolean r2 = r0.getAcceptDefaultValue()
            r1.setAcceptDefaultValue$realm(r2)
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r1 = r3.proxyState
            java.util.List r0 = r0.getExcludeFields()
            r1.setExcludeFields$realm(r0)
            return
    }

    @Override // com.flextv.livestore.models.EPGChannel, io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public java.lang.String realmGet$Id() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r3.columnInfo
            long r1 = r1.IdColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.EPGChannel, io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public java.lang.String realmGet$added() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r3.columnInfo
            long r1 = r1.addedColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.EPGChannel, io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public java.lang.String realmGet$category_id() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r3.columnInfo
            long r1 = r1.category_idColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.EPGChannel, io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public java.lang.String realmGet$category_name() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r3.columnInfo
            long r1 = r1.category_nameColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.EPGChannel, io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public int realmGet$cell() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r3.columnInfo
            long r1 = r1.cellColKey
            long r0 = r0.getLong(r1)
            int r1 = (int) r0
            return r1
    }

    @Override // com.flextv.livestore.models.EPGChannel, io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public int realmGet$channelID() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r3.columnInfo
            long r1 = r1.channelIDColKey
            long r0 = r0.getLong(r1)
            int r1 = (int) r0
            return r1
    }

    @Override // com.flextv.livestore.models.EPGChannel, io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public java.lang.String realmGet$custom_sid() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r3.columnInfo
            long r1 = r1.custom_sidColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.EPGChannel, io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public java.lang.String realmGet$direct_source() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r3.columnInfo
            long r1 = r1.direct_sourceColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.EPGChannel, io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public boolean realmGet$is_favorite() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r3.columnInfo
            long r1 = r1.is_favoriteColKey
            boolean r0 = r0.getBoolean(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.EPGChannel, io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public boolean realmGet$is_locked() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r3.columnInfo
            long r1 = r1.is_lockedColKey
            boolean r0 = r0.getBoolean(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.EPGChannel, io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public boolean realmGet$is_recent() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r3.columnInfo
            long r1 = r1.is_recentColKey
            boolean r0 = r0.getBoolean(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.EPGChannel, io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public java.lang.String realmGet$name() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r3.columnInfo
            long r1 = r1.nameColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.EPGChannel, io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public java.lang.String realmGet$num() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r3.columnInfo
            long r1 = r1.numColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // io.realm.internal.RealmObjectProxy
    public io.realm.ProxyState<?> realmGet$proxyState() {
            r1 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r1.proxyState
            return r0
    }

    @Override // com.flextv.livestore.models.EPGChannel, io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public long realmGet$recent_pos() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r3.columnInfo
            long r1 = r1.recent_posColKey
            long r0 = r0.getLong(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.EPGChannel, io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public boolean realmGet$selected() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r3.columnInfo
            long r1 = r1.selectedColKey
            boolean r0 = r0.getBoolean(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.EPGChannel, io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public java.lang.String realmGet$stream_icon() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r3.columnInfo
            long r1 = r1.stream_iconColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.EPGChannel, io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public java.lang.String realmGet$stream_id() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r3.columnInfo
            long r1 = r1.stream_idColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.EPGChannel, io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public java.lang.String realmGet$stream_type() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r3.columnInfo
            long r1 = r1.stream_typeColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.EPGChannel, io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public java.lang.String realmGet$tv_archive() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r3.columnInfo
            long r1 = r1.tv_archiveColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.EPGChannel, io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public java.lang.String realmGet$tv_archive_duration() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r3.columnInfo
            long r1 = r1.tv_archive_durationColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.EPGChannel, io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public java.lang.String realmGet$url() {
            r3 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r3.columnInfo
            long r1 = r1.urlColKey
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // com.flextv.livestore.models.EPGChannel, io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public void realmSet$Id(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r15 = r14.columnInfo
            long r2 = r15.IdColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r14.columnInfo
            long r8 = r1.IdColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r0 = r14.columnInfo
            long r0 = r0.IdColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r14.columnInfo
            long r1 = r1.IdColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.EPGChannel, io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public void realmSet$added(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r15 = r14.columnInfo
            long r2 = r15.addedColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r14.columnInfo
            long r8 = r1.addedColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r0 = r14.columnInfo
            long r0 = r0.addedColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r14.columnInfo
            long r1 = r1.addedColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.EPGChannel, io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public void realmSet$category_id(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r15 = r14.columnInfo
            long r2 = r15.category_idColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r14.columnInfo
            long r8 = r1.category_idColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r0 = r14.columnInfo
            long r0 = r0.category_idColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r14.columnInfo
            long r1 = r1.category_idColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.EPGChannel, io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public void realmSet$category_name(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r15 = r14.columnInfo
            long r2 = r15.category_nameColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r14.columnInfo
            long r8 = r1.category_nameColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r0 = r14.columnInfo
            long r0 = r0.category_nameColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r14.columnInfo
            long r1 = r1.category_nameColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.EPGChannel, io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public void realmSet$cell(int r10) {
            r9 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r9.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L29
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r9.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r9.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r2 = r9.columnInfo
            long r2 = r2.cellColKey
            long r4 = r0.getObjectKey()
            long r6 = (long) r10
            r8 = 1
            r1.setLong(r2, r4, r6, r8)
            return
        L29:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r9.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r9.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r9.columnInfo
            long r1 = r1.cellColKey
            long r3 = (long) r10
            r0.setLong(r1, r3)
            return
    }

    @Override // com.flextv.livestore.models.EPGChannel, io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public void realmSet$channelID(int r10) {
            r9 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r9.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L29
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r9.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r9.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r2 = r9.columnInfo
            long r2 = r2.channelIDColKey
            long r4 = r0.getObjectKey()
            long r6 = (long) r10
            r8 = 1
            r1.setLong(r2, r4, r6, r8)
            return
        L29:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r9.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r9.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r9.columnInfo
            long r1 = r1.channelIDColKey
            long r3 = (long) r10
            r0.setLong(r1, r3)
            return
    }

    @Override // com.flextv.livestore.models.EPGChannel, io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public void realmSet$custom_sid(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r15 = r14.columnInfo
            long r2 = r15.custom_sidColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r14.columnInfo
            long r8 = r1.custom_sidColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r0 = r14.columnInfo
            long r0 = r0.custom_sidColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r14.columnInfo
            long r1 = r1.custom_sidColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.EPGChannel, io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public void realmSet$direct_source(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r15 = r14.columnInfo
            long r2 = r15.direct_sourceColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r14.columnInfo
            long r8 = r1.direct_sourceColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r0 = r14.columnInfo
            long r0 = r0.direct_sourceColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r14.columnInfo
            long r1 = r1.direct_sourceColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.EPGChannel, io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public void realmSet$is_favorite(boolean r9) {
            r8 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r8.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L29
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r8.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r8.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r2 = r8.columnInfo
            long r2 = r2.is_favoriteColKey
            long r4 = r0.getObjectKey()
            r7 = 1
            r6 = r9
            r1.setBoolean(r2, r4, r6, r7)
            return
        L29:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r8.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r8.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r8.columnInfo
            long r1 = r1.is_favoriteColKey
            r0.setBoolean(r1, r9)
            return
    }

    @Override // com.flextv.livestore.models.EPGChannel, io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public void realmSet$is_locked(boolean r9) {
            r8 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r8.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L29
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r8.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r8.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r2 = r8.columnInfo
            long r2 = r2.is_lockedColKey
            long r4 = r0.getObjectKey()
            r7 = 1
            r6 = r9
            r1.setBoolean(r2, r4, r6, r7)
            return
        L29:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r8.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r8.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r8.columnInfo
            long r1 = r1.is_lockedColKey
            r0.setBoolean(r1, r9)
            return
    }

    @Override // com.flextv.livestore.models.EPGChannel, io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public void realmSet$is_recent(boolean r9) {
            r8 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r8.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L29
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r8.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r8.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r2 = r8.columnInfo
            long r2 = r2.is_recentColKey
            long r4 = r0.getObjectKey()
            r7 = 1
            r6 = r9
            r1.setBoolean(r2, r4, r6, r7)
            return
        L29:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r8.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r8.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r8.columnInfo
            long r1 = r1.is_recentColKey
            r0.setBoolean(r1, r9)
            return
    }

    @Override // com.flextv.livestore.models.EPGChannel, io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public void realmSet$name(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r15 = r14.columnInfo
            long r2 = r15.nameColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r14.columnInfo
            long r8 = r1.nameColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r0 = r14.columnInfo
            long r0 = r0.nameColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r14.columnInfo
            long r1 = r1.nameColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.EPGChannel, io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public void realmSet$num(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r15 = r14.columnInfo
            long r2 = r15.numColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r14.columnInfo
            long r8 = r1.numColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r0 = r14.columnInfo
            long r0 = r0.numColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r14.columnInfo
            long r1 = r1.numColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.EPGChannel, io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public void realmSet$recent_pos(long r10) {
            r9 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r9.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L29
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r9.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r9.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r2 = r9.columnInfo
            long r2 = r2.recent_posColKey
            long r4 = r0.getObjectKey()
            r8 = 1
            r6 = r10
            r1.setLong(r2, r4, r6, r8)
            return
        L29:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r9.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r9.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r9.columnInfo
            long r1 = r1.recent_posColKey
            r0.setLong(r1, r10)
            return
    }

    @Override // com.flextv.livestore.models.EPGChannel, io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public void realmSet$selected(boolean r9) {
            r8 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r8.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L29
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r8.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r8.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r2 = r8.columnInfo
            long r2 = r2.selectedColKey
            long r4 = r0.getObjectKey()
            r7 = 1
            r6 = r9
            r1.setBoolean(r2, r4, r6, r7)
            return
        L29:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r8.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r8.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r8.columnInfo
            long r1 = r1.selectedColKey
            r0.setBoolean(r1, r9)
            return
    }

    @Override // com.flextv.livestore.models.EPGChannel, io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public void realmSet$stream_icon(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r15 = r14.columnInfo
            long r2 = r15.stream_iconColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r14.columnInfo
            long r8 = r1.stream_iconColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r0 = r14.columnInfo
            long r0 = r0.stream_iconColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r14.columnInfo
            long r1 = r1.stream_iconColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.EPGChannel, io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public void realmSet$stream_id(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r15 = r14.columnInfo
            long r2 = r15.stream_idColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r14.columnInfo
            long r8 = r1.stream_idColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r0 = r14.columnInfo
            long r0 = r0.stream_idColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r14.columnInfo
            long r1 = r1.stream_idColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.EPGChannel, io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public void realmSet$stream_type(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r15 = r14.columnInfo
            long r2 = r15.stream_typeColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r14.columnInfo
            long r8 = r1.stream_typeColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r0 = r14.columnInfo
            long r0 = r0.stream_typeColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r14.columnInfo
            long r1 = r1.stream_typeColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.EPGChannel, io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public void realmSet$tv_archive(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r15 = r14.columnInfo
            long r2 = r15.tv_archiveColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r14.columnInfo
            long r8 = r1.tv_archiveColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r0 = r14.columnInfo
            long r0 = r0.tv_archiveColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r14.columnInfo
            long r1 = r1.tv_archiveColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.EPGChannel, io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public void realmSet$tv_archive_duration(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r15 = r14.columnInfo
            long r2 = r15.tv_archive_durationColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r14.columnInfo
            long r8 = r1.tv_archive_durationColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r0 = r14.columnInfo
            long r0 = r0.tv_archive_durationColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r14.columnInfo
            long r1 = r1.tv_archive_durationColKey
            r0.setString(r1, r15)
            return
    }

    @Override // com.flextv.livestore.models.EPGChannel, io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public void realmSet$url(java.lang.String r15) {
            r14 = this;
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            boolean r0 = r0.isUnderConstruction()
            if (r0 == 0) goto L3c
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            boolean r0 = r0.getAcceptDefaultValue$realm()
            if (r0 != 0) goto L11
            return
        L11:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r15 != 0) goto L2a
            io.realm.internal.Table r1 = r0.getTable()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r15 = r14.columnInfo
            long r2 = r15.urlColKey
            long r4 = r0.getObjectKey()
            r6 = 1
            r1.setNull(r2, r4, r6)
            return
        L2a:
            io.realm.internal.Table r7 = r0.getTable()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r14.columnInfo
            long r8 = r1.urlColKey
            long r10 = r0.getObjectKey()
            r13 = 1
            r12 = r15
            r7.setString(r8, r10, r12, r13)
            return
        L3c:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r15 != 0) goto L55
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r15 = r14.proxyState
            io.realm.internal.Row r15 = r15.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r0 = r14.columnInfo
            long r0 = r0.urlColKey
            r15.setNull(r0)
            return
        L55:
            io.realm.ProxyState<com.flextv.livestore.models.EPGChannel> r0 = r14.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r1 = r14.columnInfo
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
            java.lang.String r1 = "EPGChannel = proxy["
            r0.<init>(r1)
            java.lang.String r1 = "{num:"
            r0.append(r1)
            java.lang.String r1 = r6.realmGet$num()
            java.lang.String r2 = "null"
            if (r1 == 0) goto L23
            java.lang.String r1 = r6.realmGet$num()
            goto L24
        L23:
            r1 = r2
        L24:
            java.lang.String r3 = "}"
            java.lang.String r4 = ","
            java.lang.String r5 = "{name:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r1, r3, r4, r5)
            java.lang.String r1 = r6.realmGet$name()
            if (r1 == 0) goto L3a
            java.lang.String r1 = r6.realmGet$name()
            goto L3b
        L3a:
            r1 = r2
        L3b:
            java.lang.String r5 = "{stream_type:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r1, r3, r4, r5)
            java.lang.String r1 = r6.realmGet$stream_type()
            if (r1 == 0) goto L4c
            java.lang.String r1 = r6.realmGet$stream_type()
            goto L4d
        L4c:
            r1 = r2
        L4d:
            java.lang.String r5 = "{stream_id:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r1, r3, r4, r5)
            java.lang.String r1 = r6.realmGet$stream_id()
            if (r1 == 0) goto L5e
            java.lang.String r1 = r6.realmGet$stream_id()
            goto L5f
        L5e:
            r1 = r2
        L5f:
            java.lang.String r5 = "{stream_icon:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r1, r3, r4, r5)
            java.lang.String r1 = r6.realmGet$stream_icon()
            if (r1 == 0) goto L70
            java.lang.String r1 = r6.realmGet$stream_icon()
            goto L71
        L70:
            r1 = r2
        L71:
            java.lang.String r5 = "{Id:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r1, r3, r4, r5)
            java.lang.String r1 = r6.realmGet$Id()
            if (r1 == 0) goto L82
            java.lang.String r1 = r6.realmGet$Id()
            goto L83
        L82:
            r1 = r2
        L83:
            java.lang.String r5 = "{added:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r1, r3, r4, r5)
            java.lang.String r1 = r6.realmGet$added()
            if (r1 == 0) goto L94
            java.lang.String r1 = r6.realmGet$added()
            goto L95
        L94:
            r1 = r2
        L95:
            java.lang.String r5 = "{category_id:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r1, r3, r4, r5)
            java.lang.String r1 = r6.realmGet$category_id()
            if (r1 == 0) goto La6
            java.lang.String r1 = r6.realmGet$category_id()
            goto La7
        La6:
            r1 = r2
        La7:
            java.lang.String r5 = "{custom_sid:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r1, r3, r4, r5)
            java.lang.String r1 = r6.realmGet$custom_sid()
            if (r1 == 0) goto Lb8
            java.lang.String r1 = r6.realmGet$custom_sid()
            goto Lb9
        Lb8:
            r1 = r2
        Lb9:
            java.lang.String r5 = "{tv_archive:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r1, r3, r4, r5)
            java.lang.String r1 = r6.realmGet$tv_archive()
            if (r1 == 0) goto Lca
            java.lang.String r1 = r6.realmGet$tv_archive()
            goto Lcb
        Lca:
            r1 = r2
        Lcb:
            java.lang.String r5 = "{direct_source:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r1, r3, r4, r5)
            java.lang.String r1 = r6.realmGet$direct_source()
            if (r1 == 0) goto Ldc
            java.lang.String r1 = r6.realmGet$direct_source()
            goto Ldd
        Ldc:
            r1 = r2
        Ldd:
            java.lang.String r5 = "{tv_archive_duration:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r1, r3, r4, r5)
            java.lang.String r1 = r6.realmGet$tv_archive_duration()
            if (r1 == 0) goto Lee
            java.lang.String r1 = r6.realmGet$tv_archive_duration()
            goto Lef
        Lee:
            r1 = r2
        Lef:
            java.lang.String r5 = "{url:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r1, r3, r4, r5)
            java.lang.String r1 = r6.realmGet$url()
            if (r1 == 0) goto L100
            java.lang.String r1 = r6.realmGet$url()
            goto L101
        L100:
            r1 = r2
        L101:
            java.lang.String r5 = "{category_name:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r1, r3, r4, r5)
            java.lang.String r1 = r6.realmGet$category_name()
            if (r1 == 0) goto L111
            java.lang.String r2 = r6.realmGet$category_name()
        L111:
            java.lang.String r1 = "{is_locked:"
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r2, r3, r4, r1)
            boolean r1 = r6.realmGet$is_locked()
            r0.append(r1)
            r0.append(r3)
            r0.append(r4)
            java.lang.String r1 = "{is_favorite:"
            r0.append(r1)
            boolean r1 = r6.realmGet$is_favorite()
            r0.append(r1)
            r0.append(r3)
            r0.append(r4)
            java.lang.String r1 = "{is_recent:"
            r0.append(r1)
            boolean r1 = r6.realmGet$is_recent()
            r0.append(r1)
            r0.append(r3)
            r0.append(r4)
            java.lang.String r1 = "{recent_pos:"
            r0.append(r1)
            long r1 = r6.realmGet$recent_pos()
            r0.append(r1)
            r0.append(r3)
            r0.append(r4)
            java.lang.String r1 = "{cell:"
            r0.append(r1)
            int r1 = r6.realmGet$cell()
            r0.append(r1)
            r0.append(r3)
            r0.append(r4)
            java.lang.String r1 = "{channelID:"
            r0.append(r1)
            int r1 = r6.realmGet$channelID()
            r0.append(r1)
            r0.append(r3)
            r0.append(r4)
            java.lang.String r1 = "{selected:"
            r0.append(r1)
            boolean r1 = r6.realmGet$selected()
            r0.append(r1)
            java.lang.String r1 = "]"
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r3, r1)
            return r0
    }
}
