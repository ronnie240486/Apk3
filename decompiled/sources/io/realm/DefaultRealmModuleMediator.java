package io.realm;

/* JADX INFO: loaded from: classes2.dex */
@io.realm.annotations.RealmModule
class DefaultRealmModuleMediator extends io.realm.internal.RealmProxyMediator {
    private static final java.util.Set<java.lang.Class<? extends io.realm.RealmModel>> MODEL_CLASSES = null;

    static {
            java.util.HashSet r0 = new java.util.HashSet
            r1 = 5
            r0.<init>(r1)
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r1 = com.flextv.livestore.models.SeriesModel.class
            r0.add(r1)
            java.lang.Class<com.flextv.livestore.models.MovieModel> r1 = com.flextv.livestore.models.MovieModel.class
            r0.add(r1)
            java.lang.Class<com.flextv.livestore.models.EpisodeModel> r1 = com.flextv.livestore.models.EpisodeModel.class
            r0.add(r1)
            java.lang.Class<com.flextv.livestore.models.EpisodeInfoModel> r1 = com.flextv.livestore.models.EpisodeInfoModel.class
            r0.add(r1)
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r1 = com.flextv.livestore.models.EPGChannel.class
            r0.add(r1)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            io.realm.DefaultRealmModuleMediator.MODEL_CLASSES = r0
            return
    }

    public DefaultRealmModuleMediator() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends io.realm.RealmModel> E copyOrUpdate(io.realm.Realm r9, E r10, boolean r11, java.util.Map<io.realm.RealmModel, io.realm.internal.RealmObjectProxy> r12, java.util.Set<io.realm.ImportFlag> r13) {
            r8 = this;
            boolean r0 = r10 instanceof io.realm.internal.RealmObjectProxy
            if (r0 == 0) goto Ld
            java.lang.Class r0 = r10.getClass()
            java.lang.Class r0 = r0.getSuperclass()
            goto L11
        Ld:
            java.lang.Class r0 = r10.getClass()
        L11:
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r1 = com.flextv.livestore.models.SeriesModel.class
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L38
            io.realm.RealmSchema r1 = r9.getSchema()
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r2 = com.flextv.livestore.models.SeriesModel.class
            io.realm.internal.ColumnInfo r1 = r1.getColumnInfo(r2)
            r3 = r1
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r3 = (io.realm.com_flextv_livestore_models_SeriesModelRealmProxy.SeriesModelColumnInfo) r3
            r4 = r10
            com.flextv.livestore.models.SeriesModel r4 = (com.flextv.livestore.models.SeriesModel) r4
            r2 = r9
            r5 = r11
            r6 = r12
            r7 = r13
            com.flextv.livestore.models.SeriesModel r9 = io.realm.com_flextv_livestore_models_SeriesModelRealmProxy.copyOrUpdate(r2, r3, r4, r5, r6, r7)
            java.lang.Object r9 = r0.cast(r9)
            io.realm.RealmModel r9 = (io.realm.RealmModel) r9
            return r9
        L38:
            java.lang.Class<com.flextv.livestore.models.MovieModel> r1 = com.flextv.livestore.models.MovieModel.class
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L5f
            io.realm.RealmSchema r1 = r9.getSchema()
            java.lang.Class<com.flextv.livestore.models.MovieModel> r2 = com.flextv.livestore.models.MovieModel.class
            io.realm.internal.ColumnInfo r1 = r1.getColumnInfo(r2)
            r3 = r1
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r3 = (io.realm.com_flextv_livestore_models_MovieModelRealmProxy.MovieModelColumnInfo) r3
            r4 = r10
            com.flextv.livestore.models.MovieModel r4 = (com.flextv.livestore.models.MovieModel) r4
            r2 = r9
            r5 = r11
            r6 = r12
            r7 = r13
            com.flextv.livestore.models.MovieModel r9 = io.realm.com_flextv_livestore_models_MovieModelRealmProxy.copyOrUpdate(r2, r3, r4, r5, r6, r7)
            java.lang.Object r9 = r0.cast(r9)
            io.realm.RealmModel r9 = (io.realm.RealmModel) r9
            return r9
        L5f:
            java.lang.Class<com.flextv.livestore.models.EpisodeModel> r1 = com.flextv.livestore.models.EpisodeModel.class
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L86
            io.realm.RealmSchema r1 = r9.getSchema()
            java.lang.Class<com.flextv.livestore.models.EpisodeModel> r2 = com.flextv.livestore.models.EpisodeModel.class
            io.realm.internal.ColumnInfo r1 = r1.getColumnInfo(r2)
            r3 = r1
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r3 = (io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy.EpisodeModelColumnInfo) r3
            r4 = r10
            com.flextv.livestore.models.EpisodeModel r4 = (com.flextv.livestore.models.EpisodeModel) r4
            r2 = r9
            r5 = r11
            r6 = r12
            r7 = r13
            com.flextv.livestore.models.EpisodeModel r9 = io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy.copyOrUpdate(r2, r3, r4, r5, r6, r7)
            java.lang.Object r9 = r0.cast(r9)
            io.realm.RealmModel r9 = (io.realm.RealmModel) r9
            return r9
        L86:
            java.lang.Class<com.flextv.livestore.models.EpisodeInfoModel> r1 = com.flextv.livestore.models.EpisodeInfoModel.class
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto Lad
            io.realm.RealmSchema r1 = r9.getSchema()
            java.lang.Class<com.flextv.livestore.models.EpisodeInfoModel> r2 = com.flextv.livestore.models.EpisodeInfoModel.class
            io.realm.internal.ColumnInfo r1 = r1.getColumnInfo(r2)
            r3 = r1
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r3 = (io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy.EpisodeInfoModelColumnInfo) r3
            r4 = r10
            com.flextv.livestore.models.EpisodeInfoModel r4 = (com.flextv.livestore.models.EpisodeInfoModel) r4
            r2 = r9
            r5 = r11
            r6 = r12
            r7 = r13
            com.flextv.livestore.models.EpisodeInfoModel r9 = io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy.copyOrUpdate(r2, r3, r4, r5, r6, r7)
            java.lang.Object r9 = r0.cast(r9)
            io.realm.RealmModel r9 = (io.realm.RealmModel) r9
            return r9
        Lad:
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r1 = com.flextv.livestore.models.EPGChannel.class
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto Ld4
            io.realm.RealmSchema r1 = r9.getSchema()
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r2 = com.flextv.livestore.models.EPGChannel.class
            io.realm.internal.ColumnInfo r1 = r1.getColumnInfo(r2)
            r3 = r1
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r3 = (io.realm.com_flextv_livestore_models_EPGChannelRealmProxy.EPGChannelColumnInfo) r3
            r4 = r10
            com.flextv.livestore.models.EPGChannel r4 = (com.flextv.livestore.models.EPGChannel) r4
            r2 = r9
            r5 = r11
            r6 = r12
            r7 = r13
            com.flextv.livestore.models.EPGChannel r9 = io.realm.com_flextv_livestore_models_EPGChannelRealmProxy.copyOrUpdate(r2, r3, r4, r5, r6, r7)
            java.lang.Object r9 = r0.cast(r9)
            io.realm.RealmModel r9 = (io.realm.RealmModel) r9
            return r9
        Ld4:
            io.realm.exceptions.RealmException r9 = io.realm.internal.RealmProxyMediator.getMissingProxyClassException(r0)
            throw r9
    }

    @Override // io.realm.internal.RealmProxyMediator
    public io.realm.internal.ColumnInfo createColumnInfo(java.lang.Class<? extends io.realm.RealmModel> r2, io.realm.internal.OsSchemaInfo r3) {
            r1 = this;
            java.lang.String r0 = "A class extending RealmObject must be provided"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r0 = com.flextv.livestore.models.SeriesModel.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L12
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy$SeriesModelColumnInfo r2 = io.realm.com_flextv_livestore_models_SeriesModelRealmProxy.createColumnInfo(r3)
            return r2
        L12:
            java.lang.Class<com.flextv.livestore.models.MovieModel> r0 = com.flextv.livestore.models.MovieModel.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L1f
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy$MovieModelColumnInfo r2 = io.realm.com_flextv_livestore_models_MovieModelRealmProxy.createColumnInfo(r3)
            return r2
        L1f:
            java.lang.Class<com.flextv.livestore.models.EpisodeModel> r0 = com.flextv.livestore.models.EpisodeModel.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L2c
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy$EpisodeModelColumnInfo r2 = io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy.createColumnInfo(r3)
            return r2
        L2c:
            java.lang.Class<com.flextv.livestore.models.EpisodeInfoModel> r0 = com.flextv.livestore.models.EpisodeInfoModel.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L39
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy$EpisodeInfoModelColumnInfo r2 = io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy.createColumnInfo(r3)
            return r2
        L39:
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r0 = com.flextv.livestore.models.EPGChannel.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L46
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy$EPGChannelColumnInfo r2 = io.realm.com_flextv_livestore_models_EPGChannelRealmProxy.createColumnInfo(r3)
            return r2
        L46:
            io.realm.exceptions.RealmException r2 = io.realm.internal.RealmProxyMediator.getMissingProxyClassException(r2)
            throw r2
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends io.realm.RealmModel> E createDetachedCopy(E r4, int r5, java.util.Map<io.realm.RealmModel, io.realm.internal.RealmObjectProxy.CacheData<io.realm.RealmModel>> r6) {
            r3 = this;
            java.lang.Class r0 = r4.getClass()
            java.lang.Class r0 = r0.getSuperclass()
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r1 = com.flextv.livestore.models.SeriesModel.class
            boolean r1 = r0.equals(r1)
            r2 = 0
            if (r1 == 0) goto L1e
            com.flextv.livestore.models.SeriesModel r4 = (com.flextv.livestore.models.SeriesModel) r4
            com.flextv.livestore.models.SeriesModel r4 = io.realm.com_flextv_livestore_models_SeriesModelRealmProxy.createDetachedCopy(r4, r2, r5, r6)
            java.lang.Object r4 = r0.cast(r4)
            io.realm.RealmModel r4 = (io.realm.RealmModel) r4
            return r4
        L1e:
            java.lang.Class<com.flextv.livestore.models.MovieModel> r1 = com.flextv.livestore.models.MovieModel.class
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L33
            com.flextv.livestore.models.MovieModel r4 = (com.flextv.livestore.models.MovieModel) r4
            com.flextv.livestore.models.MovieModel r4 = io.realm.com_flextv_livestore_models_MovieModelRealmProxy.createDetachedCopy(r4, r2, r5, r6)
            java.lang.Object r4 = r0.cast(r4)
            io.realm.RealmModel r4 = (io.realm.RealmModel) r4
            return r4
        L33:
            java.lang.Class<com.flextv.livestore.models.EpisodeModel> r1 = com.flextv.livestore.models.EpisodeModel.class
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L48
            com.flextv.livestore.models.EpisodeModel r4 = (com.flextv.livestore.models.EpisodeModel) r4
            com.flextv.livestore.models.EpisodeModel r4 = io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy.createDetachedCopy(r4, r2, r5, r6)
            java.lang.Object r4 = r0.cast(r4)
            io.realm.RealmModel r4 = (io.realm.RealmModel) r4
            return r4
        L48:
            java.lang.Class<com.flextv.livestore.models.EpisodeInfoModel> r1 = com.flextv.livestore.models.EpisodeInfoModel.class
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L5d
            com.flextv.livestore.models.EpisodeInfoModel r4 = (com.flextv.livestore.models.EpisodeInfoModel) r4
            com.flextv.livestore.models.EpisodeInfoModel r4 = io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy.createDetachedCopy(r4, r2, r5, r6)
            java.lang.Object r4 = r0.cast(r4)
            io.realm.RealmModel r4 = (io.realm.RealmModel) r4
            return r4
        L5d:
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r1 = com.flextv.livestore.models.EPGChannel.class
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L72
            com.flextv.livestore.models.EPGChannel r4 = (com.flextv.livestore.models.EPGChannel) r4
            com.flextv.livestore.models.EPGChannel r4 = io.realm.com_flextv_livestore_models_EPGChannelRealmProxy.createDetachedCopy(r4, r2, r5, r6)
            java.lang.Object r4 = r0.cast(r4)
            io.realm.RealmModel r4 = (io.realm.RealmModel) r4
            return r4
        L72:
            io.realm.exceptions.RealmException r4 = io.realm.internal.RealmProxyMediator.getMissingProxyClassException(r0)
            throw r4
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends io.realm.RealmModel> E createOrUpdateUsingJsonObject(java.lang.Class<E> r2, io.realm.Realm r3, org.json.JSONObject r4, boolean r5) throws org.json.JSONException {
            r1 = this;
            java.lang.String r0 = "A class extending RealmObject must be provided"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r0 = com.flextv.livestore.models.SeriesModel.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L18
            com.flextv.livestore.models.SeriesModel r3 = io.realm.com_flextv_livestore_models_SeriesModelRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (io.realm.RealmModel) r2
            return r2
        L18:
            java.lang.Class<com.flextv.livestore.models.MovieModel> r0 = com.flextv.livestore.models.MovieModel.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L2b
            com.flextv.livestore.models.MovieModel r3 = io.realm.com_flextv_livestore_models_MovieModelRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (io.realm.RealmModel) r2
            return r2
        L2b:
            java.lang.Class<com.flextv.livestore.models.EpisodeModel> r0 = com.flextv.livestore.models.EpisodeModel.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L3e
            com.flextv.livestore.models.EpisodeModel r3 = io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (io.realm.RealmModel) r2
            return r2
        L3e:
            java.lang.Class<com.flextv.livestore.models.EpisodeInfoModel> r0 = com.flextv.livestore.models.EpisodeInfoModel.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L51
            com.flextv.livestore.models.EpisodeInfoModel r3 = io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (io.realm.RealmModel) r2
            return r2
        L51:
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r0 = com.flextv.livestore.models.EPGChannel.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L64
            com.flextv.livestore.models.EPGChannel r3 = io.realm.com_flextv_livestore_models_EPGChannelRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (io.realm.RealmModel) r2
            return r2
        L64:
            io.realm.exceptions.RealmException r2 = io.realm.internal.RealmProxyMediator.getMissingProxyClassException(r2)
            throw r2
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends io.realm.RealmModel> E createUsingJsonStream(java.lang.Class<E> r2, io.realm.Realm r3, android.util.JsonReader r4) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "A class extending RealmObject must be provided"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r0 = com.flextv.livestore.models.SeriesModel.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L18
            com.flextv.livestore.models.SeriesModel r3 = io.realm.com_flextv_livestore_models_SeriesModelRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (io.realm.RealmModel) r2
            return r2
        L18:
            java.lang.Class<com.flextv.livestore.models.MovieModel> r0 = com.flextv.livestore.models.MovieModel.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L2b
            com.flextv.livestore.models.MovieModel r3 = io.realm.com_flextv_livestore_models_MovieModelRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (io.realm.RealmModel) r2
            return r2
        L2b:
            java.lang.Class<com.flextv.livestore.models.EpisodeModel> r0 = com.flextv.livestore.models.EpisodeModel.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L3e
            com.flextv.livestore.models.EpisodeModel r3 = io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (io.realm.RealmModel) r2
            return r2
        L3e:
            java.lang.Class<com.flextv.livestore.models.EpisodeInfoModel> r0 = com.flextv.livestore.models.EpisodeInfoModel.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L51
            com.flextv.livestore.models.EpisodeInfoModel r3 = io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (io.realm.RealmModel) r2
            return r2
        L51:
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r0 = com.flextv.livestore.models.EPGChannel.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L64
            com.flextv.livestore.models.EPGChannel r3 = io.realm.com_flextv_livestore_models_EPGChannelRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (io.realm.RealmModel) r2
            return r2
        L64:
            io.realm.exceptions.RealmException r2 = io.realm.internal.RealmProxyMediator.getMissingProxyClassException(r2)
            throw r2
    }

    @Override // io.realm.internal.RealmProxyMediator
    public java.lang.Class<? extends io.realm.RealmModel> getClazzImpl(java.lang.String r4) {
            r3 = this;
            if (r4 == 0) goto L51
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L51
            java.lang.String r0 = "SeriesModel"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L13
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r4 = com.flextv.livestore.models.SeriesModel.class
            return r4
        L13:
            java.lang.String r0 = "MovieModel"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1e
            java.lang.Class<com.flextv.livestore.models.MovieModel> r4 = com.flextv.livestore.models.MovieModel.class
            return r4
        L1e:
            java.lang.String r0 = "EpisodeModel"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L29
            java.lang.Class<com.flextv.livestore.models.EpisodeModel> r4 = com.flextv.livestore.models.EpisodeModel.class
            return r4
        L29:
            java.lang.String r0 = "EpisodeInfoModel"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L34
            java.lang.Class<com.flextv.livestore.models.EpisodeInfoModel> r4 = com.flextv.livestore.models.EpisodeInfoModel.class
            return r4
        L34:
            java.lang.String r0 = "EPGChannel"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L3f
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r4 = com.flextv.livestore.models.EPGChannel.class
            return r4
        L3f:
            io.realm.exceptions.RealmException r0 = new io.realm.exceptions.RealmException
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "'%s' is not part of the schema for this Realm."
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
        L51:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r0 = "A class extending RealmObject must be provided"
            r4.<init>(r0)
            throw r4
    }

    @Override // io.realm.internal.RealmProxyMediator
    public java.util.Map<java.lang.Class<? extends io.realm.RealmModel>, io.realm.internal.OsObjectSchemaInfo> getExpectedObjectSchemaInfoMap() {
            r3 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 5
            r0.<init>(r1)
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r1 = com.flextv.livestore.models.SeriesModel.class
            io.realm.internal.OsObjectSchemaInfo r2 = io.realm.com_flextv_livestore_models_SeriesModelRealmProxy.getExpectedObjectSchemaInfo()
            r0.put(r1, r2)
            java.lang.Class<com.flextv.livestore.models.MovieModel> r1 = com.flextv.livestore.models.MovieModel.class
            io.realm.internal.OsObjectSchemaInfo r2 = io.realm.com_flextv_livestore_models_MovieModelRealmProxy.getExpectedObjectSchemaInfo()
            r0.put(r1, r2)
            java.lang.Class<com.flextv.livestore.models.EpisodeModel> r1 = com.flextv.livestore.models.EpisodeModel.class
            io.realm.internal.OsObjectSchemaInfo r2 = io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy.getExpectedObjectSchemaInfo()
            r0.put(r1, r2)
            java.lang.Class<com.flextv.livestore.models.EpisodeInfoModel> r1 = com.flextv.livestore.models.EpisodeInfoModel.class
            io.realm.internal.OsObjectSchemaInfo r2 = io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy.getExpectedObjectSchemaInfo()
            r0.put(r1, r2)
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r1 = com.flextv.livestore.models.EPGChannel.class
            io.realm.internal.OsObjectSchemaInfo r2 = io.realm.com_flextv_livestore_models_EPGChannelRealmProxy.getExpectedObjectSchemaInfo()
            r0.put(r1, r2)
            return r0
    }

    @Override // io.realm.internal.RealmProxyMediator
    public java.util.Set<java.lang.Class<? extends io.realm.RealmModel>> getModelClasses() {
            r1 = this;
            java.util.Set<java.lang.Class<? extends io.realm.RealmModel>> r0 = io.realm.DefaultRealmModuleMediator.MODEL_CLASSES
            return r0
    }

    @Override // io.realm.internal.RealmProxyMediator
    public java.lang.String getSimpleClassNameImpl(java.lang.Class<? extends io.realm.RealmModel> r2) {
            r1 = this;
            java.lang.String r0 = "A class extending RealmObject must be provided"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r0 = com.flextv.livestore.models.SeriesModel.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L10
            java.lang.String r2 = "SeriesModel"
            return r2
        L10:
            java.lang.Class<com.flextv.livestore.models.MovieModel> r0 = com.flextv.livestore.models.MovieModel.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L1b
            java.lang.String r2 = "MovieModel"
            return r2
        L1b:
            java.lang.Class<com.flextv.livestore.models.EpisodeModel> r0 = com.flextv.livestore.models.EpisodeModel.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L26
            java.lang.String r2 = "EpisodeModel"
            return r2
        L26:
            java.lang.Class<com.flextv.livestore.models.EpisodeInfoModel> r0 = com.flextv.livestore.models.EpisodeInfoModel.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L31
            java.lang.String r2 = "EpisodeInfoModel"
            return r2
        L31:
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r0 = com.flextv.livestore.models.EPGChannel.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L3c
            java.lang.String r2 = "EPGChannel"
            return r2
        L3c:
            io.realm.exceptions.RealmException r2 = io.realm.internal.RealmProxyMediator.getMissingProxyClassException(r2)
            throw r2
    }

    @Override // io.realm.internal.RealmProxyMediator
    public boolean hasPrimaryKeyImpl(java.lang.Class<? extends io.realm.RealmModel> r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // io.realm.internal.RealmProxyMediator
    public long insert(io.realm.Realm r3, io.realm.RealmModel r4, java.util.Map<io.realm.RealmModel, java.lang.Long> r5) {
            r2 = this;
            boolean r0 = r4 instanceof io.realm.internal.RealmObjectProxy
            if (r0 == 0) goto Ld
            java.lang.Class r0 = r4.getClass()
            java.lang.Class r0 = r0.getSuperclass()
            goto L11
        Ld:
            java.lang.Class r0 = r4.getClass()
        L11:
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r1 = com.flextv.livestore.models.SeriesModel.class
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L20
            com.flextv.livestore.models.SeriesModel r4 = (com.flextv.livestore.models.SeriesModel) r4
            long r3 = io.realm.com_flextv_livestore_models_SeriesModelRealmProxy.insert(r3, r4, r5)
            return r3
        L20:
            java.lang.Class<com.flextv.livestore.models.MovieModel> r1 = com.flextv.livestore.models.MovieModel.class
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L2f
            com.flextv.livestore.models.MovieModel r4 = (com.flextv.livestore.models.MovieModel) r4
            long r3 = io.realm.com_flextv_livestore_models_MovieModelRealmProxy.insert(r3, r4, r5)
            return r3
        L2f:
            java.lang.Class<com.flextv.livestore.models.EpisodeModel> r1 = com.flextv.livestore.models.EpisodeModel.class
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L3e
            com.flextv.livestore.models.EpisodeModel r4 = (com.flextv.livestore.models.EpisodeModel) r4
            long r3 = io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy.insert(r3, r4, r5)
            return r3
        L3e:
            java.lang.Class<com.flextv.livestore.models.EpisodeInfoModel> r1 = com.flextv.livestore.models.EpisodeInfoModel.class
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L4d
            com.flextv.livestore.models.EpisodeInfoModel r4 = (com.flextv.livestore.models.EpisodeInfoModel) r4
            long r3 = io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy.insert(r3, r4, r5)
            return r3
        L4d:
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r1 = com.flextv.livestore.models.EPGChannel.class
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L5c
            com.flextv.livestore.models.EPGChannel r4 = (com.flextv.livestore.models.EPGChannel) r4
            long r3 = io.realm.com_flextv_livestore_models_EPGChannelRealmProxy.insert(r3, r4, r5)
            return r3
        L5c:
            io.realm.exceptions.RealmException r3 = io.realm.internal.RealmProxyMediator.getMissingProxyClassException(r0)
            throw r3
    }

    @Override // io.realm.internal.RealmProxyMediator
    public void insert(io.realm.Realm r5, java.util.Collection<? extends io.realm.RealmModel> r6) {
            r4 = this;
            java.util.Iterator r0 = r6.iterator()
            java.util.HashMap r1 = new java.util.HashMap
            int r6 = r6.size()
            r1.<init>(r6)
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto Lbb
            java.lang.Object r6 = r0.next()
            io.realm.RealmModel r6 = (io.realm.RealmModel) r6
            boolean r2 = r6 instanceof io.realm.internal.RealmObjectProxy
            if (r2 == 0) goto L26
            java.lang.Class r2 = r6.getClass()
            java.lang.Class r2 = r2.getSuperclass()
            goto L2a
        L26:
            java.lang.Class r2 = r6.getClass()
        L2a:
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r3 = com.flextv.livestore.models.SeriesModel.class
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L38
            com.flextv.livestore.models.SeriesModel r6 = (com.flextv.livestore.models.SeriesModel) r6
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy.insert(r5, r6, r1)
            goto L6f
        L38:
            java.lang.Class<com.flextv.livestore.models.MovieModel> r3 = com.flextv.livestore.models.MovieModel.class
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L46
            com.flextv.livestore.models.MovieModel r6 = (com.flextv.livestore.models.MovieModel) r6
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy.insert(r5, r6, r1)
            goto L6f
        L46:
            java.lang.Class<com.flextv.livestore.models.EpisodeModel> r3 = com.flextv.livestore.models.EpisodeModel.class
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L54
            com.flextv.livestore.models.EpisodeModel r6 = (com.flextv.livestore.models.EpisodeModel) r6
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy.insert(r5, r6, r1)
            goto L6f
        L54:
            java.lang.Class<com.flextv.livestore.models.EpisodeInfoModel> r3 = com.flextv.livestore.models.EpisodeInfoModel.class
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L62
            com.flextv.livestore.models.EpisodeInfoModel r6 = (com.flextv.livestore.models.EpisodeInfoModel) r6
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy.insert(r5, r6, r1)
            goto L6f
        L62:
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r3 = com.flextv.livestore.models.EPGChannel.class
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto Lb6
            com.flextv.livestore.models.EPGChannel r6 = (com.flextv.livestore.models.EPGChannel) r6
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy.insert(r5, r6, r1)
        L6f:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto Lbb
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r6 = com.flextv.livestore.models.SeriesModel.class
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L81
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy.insert(r5, r0, r1)
            goto Lbb
        L81:
            java.lang.Class<com.flextv.livestore.models.MovieModel> r6 = com.flextv.livestore.models.MovieModel.class
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L8d
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy.insert(r5, r0, r1)
            goto Lbb
        L8d:
            java.lang.Class<com.flextv.livestore.models.EpisodeModel> r6 = com.flextv.livestore.models.EpisodeModel.class
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L99
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy.insert(r5, r0, r1)
            goto Lbb
        L99:
            java.lang.Class<com.flextv.livestore.models.EpisodeInfoModel> r6 = com.flextv.livestore.models.EpisodeInfoModel.class
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto La5
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy.insert(r5, r0, r1)
            goto Lbb
        La5:
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r6 = com.flextv.livestore.models.EPGChannel.class
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto Lb1
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy.insert(r5, r0, r1)
            goto Lbb
        Lb1:
            io.realm.exceptions.RealmException r5 = io.realm.internal.RealmProxyMediator.getMissingProxyClassException(r2)
            throw r5
        Lb6:
            io.realm.exceptions.RealmException r5 = io.realm.internal.RealmProxyMediator.getMissingProxyClassException(r2)
            throw r5
        Lbb:
            return
    }

    @Override // io.realm.internal.RealmProxyMediator
    public long insertOrUpdate(io.realm.Realm r3, io.realm.RealmModel r4, java.util.Map<io.realm.RealmModel, java.lang.Long> r5) {
            r2 = this;
            boolean r0 = r4 instanceof io.realm.internal.RealmObjectProxy
            if (r0 == 0) goto Ld
            java.lang.Class r0 = r4.getClass()
            java.lang.Class r0 = r0.getSuperclass()
            goto L11
        Ld:
            java.lang.Class r0 = r4.getClass()
        L11:
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r1 = com.flextv.livestore.models.SeriesModel.class
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L20
            com.flextv.livestore.models.SeriesModel r4 = (com.flextv.livestore.models.SeriesModel) r4
            long r3 = io.realm.com_flextv_livestore_models_SeriesModelRealmProxy.insertOrUpdate(r3, r4, r5)
            return r3
        L20:
            java.lang.Class<com.flextv.livestore.models.MovieModel> r1 = com.flextv.livestore.models.MovieModel.class
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L2f
            com.flextv.livestore.models.MovieModel r4 = (com.flextv.livestore.models.MovieModel) r4
            long r3 = io.realm.com_flextv_livestore_models_MovieModelRealmProxy.insertOrUpdate(r3, r4, r5)
            return r3
        L2f:
            java.lang.Class<com.flextv.livestore.models.EpisodeModel> r1 = com.flextv.livestore.models.EpisodeModel.class
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L3e
            com.flextv.livestore.models.EpisodeModel r4 = (com.flextv.livestore.models.EpisodeModel) r4
            long r3 = io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy.insertOrUpdate(r3, r4, r5)
            return r3
        L3e:
            java.lang.Class<com.flextv.livestore.models.EpisodeInfoModel> r1 = com.flextv.livestore.models.EpisodeInfoModel.class
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L4d
            com.flextv.livestore.models.EpisodeInfoModel r4 = (com.flextv.livestore.models.EpisodeInfoModel) r4
            long r3 = io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy.insertOrUpdate(r3, r4, r5)
            return r3
        L4d:
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r1 = com.flextv.livestore.models.EPGChannel.class
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L5c
            com.flextv.livestore.models.EPGChannel r4 = (com.flextv.livestore.models.EPGChannel) r4
            long r3 = io.realm.com_flextv_livestore_models_EPGChannelRealmProxy.insertOrUpdate(r3, r4, r5)
            return r3
        L5c:
            io.realm.exceptions.RealmException r3 = io.realm.internal.RealmProxyMediator.getMissingProxyClassException(r0)
            throw r3
    }

    @Override // io.realm.internal.RealmProxyMediator
    public void insertOrUpdate(io.realm.Realm r5, java.util.Collection<? extends io.realm.RealmModel> r6) {
            r4 = this;
            java.util.Iterator r0 = r6.iterator()
            java.util.HashMap r1 = new java.util.HashMap
            int r6 = r6.size()
            r1.<init>(r6)
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto Lbb
            java.lang.Object r6 = r0.next()
            io.realm.RealmModel r6 = (io.realm.RealmModel) r6
            boolean r2 = r6 instanceof io.realm.internal.RealmObjectProxy
            if (r2 == 0) goto L26
            java.lang.Class r2 = r6.getClass()
            java.lang.Class r2 = r2.getSuperclass()
            goto L2a
        L26:
            java.lang.Class r2 = r6.getClass()
        L2a:
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r3 = com.flextv.livestore.models.SeriesModel.class
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L38
            com.flextv.livestore.models.SeriesModel r6 = (com.flextv.livestore.models.SeriesModel) r6
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy.insertOrUpdate(r5, r6, r1)
            goto L6f
        L38:
            java.lang.Class<com.flextv.livestore.models.MovieModel> r3 = com.flextv.livestore.models.MovieModel.class
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L46
            com.flextv.livestore.models.MovieModel r6 = (com.flextv.livestore.models.MovieModel) r6
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy.insertOrUpdate(r5, r6, r1)
            goto L6f
        L46:
            java.lang.Class<com.flextv.livestore.models.EpisodeModel> r3 = com.flextv.livestore.models.EpisodeModel.class
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L54
            com.flextv.livestore.models.EpisodeModel r6 = (com.flextv.livestore.models.EpisodeModel) r6
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy.insertOrUpdate(r5, r6, r1)
            goto L6f
        L54:
            java.lang.Class<com.flextv.livestore.models.EpisodeInfoModel> r3 = com.flextv.livestore.models.EpisodeInfoModel.class
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L62
            com.flextv.livestore.models.EpisodeInfoModel r6 = (com.flextv.livestore.models.EpisodeInfoModel) r6
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy.insertOrUpdate(r5, r6, r1)
            goto L6f
        L62:
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r3 = com.flextv.livestore.models.EPGChannel.class
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto Lb6
            com.flextv.livestore.models.EPGChannel r6 = (com.flextv.livestore.models.EPGChannel) r6
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy.insertOrUpdate(r5, r6, r1)
        L6f:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto Lbb
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r6 = com.flextv.livestore.models.SeriesModel.class
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L81
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy.insertOrUpdate(r5, r0, r1)
            goto Lbb
        L81:
            java.lang.Class<com.flextv.livestore.models.MovieModel> r6 = com.flextv.livestore.models.MovieModel.class
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L8d
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy.insertOrUpdate(r5, r0, r1)
            goto Lbb
        L8d:
            java.lang.Class<com.flextv.livestore.models.EpisodeModel> r6 = com.flextv.livestore.models.EpisodeModel.class
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L99
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy.insertOrUpdate(r5, r0, r1)
            goto Lbb
        L99:
            java.lang.Class<com.flextv.livestore.models.EpisodeInfoModel> r6 = com.flextv.livestore.models.EpisodeInfoModel.class
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto La5
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy.insertOrUpdate(r5, r0, r1)
            goto Lbb
        La5:
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r6 = com.flextv.livestore.models.EPGChannel.class
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto Lb1
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy.insertOrUpdate(r5, r0, r1)
            goto Lbb
        Lb1:
            io.realm.exceptions.RealmException r5 = io.realm.internal.RealmProxyMediator.getMissingProxyClassException(r2)
            throw r5
        Lb6:
            io.realm.exceptions.RealmException r5 = io.realm.internal.RealmProxyMediator.getMissingProxyClassException(r2)
            throw r5
        Lbb:
            return
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends io.realm.RealmModel> boolean isEmbedded(java.lang.Class<E> r3) {
            r2 = this;
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r0 = com.flextv.livestore.models.SeriesModel.class
            boolean r0 = r3.equals(r0)
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            java.lang.Class<com.flextv.livestore.models.MovieModel> r0 = com.flextv.livestore.models.MovieModel.class
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L13
            return r1
        L13:
            java.lang.Class<com.flextv.livestore.models.EpisodeModel> r0 = com.flextv.livestore.models.EpisodeModel.class
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L1c
            return r1
        L1c:
            java.lang.Class<com.flextv.livestore.models.EpisodeInfoModel> r0 = com.flextv.livestore.models.EpisodeInfoModel.class
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L25
            return r1
        L25:
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r0 = com.flextv.livestore.models.EPGChannel.class
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L2e
            return r1
        L2e:
            io.realm.exceptions.RealmException r3 = io.realm.internal.RealmProxyMediator.getMissingProxyClassException(r3)
            throw r3
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends io.realm.RealmModel> E newInstance(java.lang.Class<E> r8, java.lang.Object r9, io.realm.internal.Row r10, io.realm.internal.ColumnInfo r11, boolean r12, java.util.List<java.lang.String> r13) {
            r7 = this;
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r0 = io.realm.BaseRealm.objectContext
            java.lang.Object r0 = r0.get()
            io.realm.BaseRealm$RealmObjectContext r0 = (io.realm.BaseRealm.RealmObjectContext) r0
            r2 = r9
            io.realm.BaseRealm r2 = (io.realm.BaseRealm) r2     // Catch: java.lang.Throwable -> L90
            r1 = r0
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r1.set(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L90
            java.lang.String r9 = "A class extending RealmObject must be provided"
            java.util.Objects.requireNonNull(r8, r9)     // Catch: java.lang.Throwable -> L90
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r9 = com.flextv.livestore.models.SeriesModel.class
            boolean r9 = r8.equals(r9)     // Catch: java.lang.Throwable -> L90
            if (r9 == 0) goto L2f
            io.realm.com_flextv_livestore_models_SeriesModelRealmProxy r9 = new io.realm.com_flextv_livestore_models_SeriesModelRealmProxy     // Catch: java.lang.Throwable -> L90
            r9.<init>()     // Catch: java.lang.Throwable -> L90
            java.lang.Object r8 = r8.cast(r9)     // Catch: java.lang.Throwable -> L90
            io.realm.RealmModel r8 = (io.realm.RealmModel) r8     // Catch: java.lang.Throwable -> L90
            r0.clear()
            return r8
        L2f:
            java.lang.Class<com.flextv.livestore.models.MovieModel> r9 = com.flextv.livestore.models.MovieModel.class
            boolean r9 = r8.equals(r9)     // Catch: java.lang.Throwable -> L90
            if (r9 == 0) goto L46
            io.realm.com_flextv_livestore_models_MovieModelRealmProxy r9 = new io.realm.com_flextv_livestore_models_MovieModelRealmProxy     // Catch: java.lang.Throwable -> L90
            r9.<init>()     // Catch: java.lang.Throwable -> L90
            java.lang.Object r8 = r8.cast(r9)     // Catch: java.lang.Throwable -> L90
            io.realm.RealmModel r8 = (io.realm.RealmModel) r8     // Catch: java.lang.Throwable -> L90
            r0.clear()
            return r8
        L46:
            java.lang.Class<com.flextv.livestore.models.EpisodeModel> r9 = com.flextv.livestore.models.EpisodeModel.class
            boolean r9 = r8.equals(r9)     // Catch: java.lang.Throwable -> L90
            if (r9 == 0) goto L5d
            io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy r9 = new io.realm.com_flextv_livestore_models_EpisodeModelRealmProxy     // Catch: java.lang.Throwable -> L90
            r9.<init>()     // Catch: java.lang.Throwable -> L90
            java.lang.Object r8 = r8.cast(r9)     // Catch: java.lang.Throwable -> L90
            io.realm.RealmModel r8 = (io.realm.RealmModel) r8     // Catch: java.lang.Throwable -> L90
            r0.clear()
            return r8
        L5d:
            java.lang.Class<com.flextv.livestore.models.EpisodeInfoModel> r9 = com.flextv.livestore.models.EpisodeInfoModel.class
            boolean r9 = r8.equals(r9)     // Catch: java.lang.Throwable -> L90
            if (r9 == 0) goto L74
            io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy r9 = new io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxy     // Catch: java.lang.Throwable -> L90
            r9.<init>()     // Catch: java.lang.Throwable -> L90
            java.lang.Object r8 = r8.cast(r9)     // Catch: java.lang.Throwable -> L90
            io.realm.RealmModel r8 = (io.realm.RealmModel) r8     // Catch: java.lang.Throwable -> L90
            r0.clear()
            return r8
        L74:
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r9 = com.flextv.livestore.models.EPGChannel.class
            boolean r9 = r8.equals(r9)     // Catch: java.lang.Throwable -> L90
            if (r9 == 0) goto L8b
            io.realm.com_flextv_livestore_models_EPGChannelRealmProxy r9 = new io.realm.com_flextv_livestore_models_EPGChannelRealmProxy     // Catch: java.lang.Throwable -> L90
            r9.<init>()     // Catch: java.lang.Throwable -> L90
            java.lang.Object r8 = r8.cast(r9)     // Catch: java.lang.Throwable -> L90
            io.realm.RealmModel r8 = (io.realm.RealmModel) r8     // Catch: java.lang.Throwable -> L90
            r0.clear()
            return r8
        L8b:
            io.realm.exceptions.RealmException r8 = io.realm.internal.RealmProxyMediator.getMissingProxyClassException(r8)     // Catch: java.lang.Throwable -> L90
            throw r8     // Catch: java.lang.Throwable -> L90
        L90:
            r8 = move-exception
            r0.clear()
            throw r8
    }

    @Override // io.realm.internal.RealmProxyMediator
    public boolean transformerApplied() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends io.realm.RealmModel> void updateEmbeddedObject(io.realm.Realm r1, E r2, E r3, java.util.Map<io.realm.RealmModel, io.realm.internal.RealmObjectProxy> r4, java.util.Set<io.realm.ImportFlag> r5) {
            r0 = this;
            java.lang.Class r1 = r3.getClass()
            java.lang.Class r1 = r1.getSuperclass()
            java.lang.Class<com.flextv.livestore.models.SeriesModel> r2 = com.flextv.livestore.models.SeriesModel.class
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L51
            java.lang.Class<com.flextv.livestore.models.MovieModel> r2 = com.flextv.livestore.models.MovieModel.class
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L4a
            java.lang.Class<com.flextv.livestore.models.EpisodeModel> r2 = com.flextv.livestore.models.EpisodeModel.class
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L43
            java.lang.Class<com.flextv.livestore.models.EpisodeInfoModel> r2 = com.flextv.livestore.models.EpisodeInfoModel.class
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L3c
            java.lang.Class<com.flextv.livestore.models.EPGChannel> r2 = com.flextv.livestore.models.EPGChannel.class
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L37
            java.lang.String r1 = "com.flextv.livestore.models.EPGChannel"
            java.lang.IllegalStateException r1 = io.realm.internal.RealmProxyMediator.getNotEmbeddedClassException(r1)
            throw r1
        L37:
            io.realm.exceptions.RealmException r1 = io.realm.internal.RealmProxyMediator.getMissingProxyClassException(r1)
            throw r1
        L3c:
            java.lang.String r1 = "com.flextv.livestore.models.EpisodeInfoModel"
            java.lang.IllegalStateException r1 = io.realm.internal.RealmProxyMediator.getNotEmbeddedClassException(r1)
            throw r1
        L43:
            java.lang.String r1 = "com.flextv.livestore.models.EpisodeModel"
            java.lang.IllegalStateException r1 = io.realm.internal.RealmProxyMediator.getNotEmbeddedClassException(r1)
            throw r1
        L4a:
            java.lang.String r1 = "com.flextv.livestore.models.MovieModel"
            java.lang.IllegalStateException r1 = io.realm.internal.RealmProxyMediator.getNotEmbeddedClassException(r1)
            throw r1
        L51:
            java.lang.String r1 = "com.flextv.livestore.models.SeriesModel"
            java.lang.IllegalStateException r1 = io.realm.internal.RealmProxyMediator.getNotEmbeddedClassException(r1)
            throw r1
    }
}
