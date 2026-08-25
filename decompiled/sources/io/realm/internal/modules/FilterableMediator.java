package io.realm.internal.modules;

/* JADX INFO: loaded from: classes2.dex */
public class FilterableMediator extends io.realm.internal.RealmProxyMediator {
    private final java.util.Set<java.lang.Class<? extends io.realm.RealmModel>> classes;
    private final io.realm.internal.RealmProxyMediator originalMediator;

    public FilterableMediator(io.realm.internal.RealmProxyMediator r2, java.util.Collection<java.lang.Class<? extends io.realm.RealmModel>> r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public FilterableMediator(io.realm.internal.RealmProxyMediator r3, java.util.Collection<java.lang.Class<? extends io.realm.RealmModel>> r4, boolean r5) {
            r2 = this;
            r2.<init>()
            r2.originalMediator = r3
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            if (r3 == 0) goto L46
            java.util.Set r3 = r3.getModelClasses()
            if (r5 != 0) goto L2c
            java.util.Iterator r4 = r4.iterator()
        L16:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L46
            java.lang.Object r5 = r4.next()
            java.lang.Class r5 = (java.lang.Class) r5
            boolean r1 = r3.contains(r5)
            if (r1 == 0) goto L16
            r0.add(r5)
            goto L16
        L2c:
            java.util.Iterator r3 = r3.iterator()
        L30:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L46
            java.lang.Object r5 = r3.next()
            java.lang.Class r5 = (java.lang.Class) r5
            boolean r1 = r4.contains(r5)
            if (r1 != 0) goto L30
            r0.add(r5)
            goto L30
        L46:
            java.util.Set r3 = java.util.Collections.unmodifiableSet(r0)
            r2.classes = r3
            return
    }

    private void checkSchemaHasClass(java.lang.Class<? extends io.realm.RealmModel> r3) {
            r2 = this;
            java.util.Set<java.lang.Class<? extends io.realm.RealmModel>> r0 = r2.classes
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L9
            return
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r3.getSimpleName()
            r1.append(r3)
            java.lang.String r3 = " is not part of the schema for this Realm"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends io.realm.RealmModel> E copyOrUpdate(io.realm.Realm r8, E r9, boolean r10, java.util.Map<io.realm.RealmModel, io.realm.internal.RealmObjectProxy> r11, java.util.Set<io.realm.ImportFlag> r12) {
            r7 = this;
            java.lang.Class r0 = r9.getClass()
            java.lang.Class r0 = io.realm.internal.Util.getOriginalModelClass(r0)
            r7.checkSchemaHasClass(r0)
            io.realm.internal.RealmProxyMediator r1 = r7.originalMediator
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            io.realm.RealmModel r8 = r1.copyOrUpdate(r2, r3, r4, r5, r6)
            return r8
    }

    @Override // io.realm.internal.RealmProxyMediator
    public io.realm.internal.ColumnInfo createColumnInfo(java.lang.Class<? extends io.realm.RealmModel> r2, io.realm.internal.OsSchemaInfo r3) {
            r1 = this;
            r1.checkSchemaHasClass(r2)
            io.realm.internal.RealmProxyMediator r0 = r1.originalMediator
            io.realm.internal.ColumnInfo r2 = r0.createColumnInfo(r2, r3)
            return r2
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends io.realm.RealmModel> E createDetachedCopy(E r2, int r3, java.util.Map<io.realm.RealmModel, io.realm.internal.RealmObjectProxy.CacheData<io.realm.RealmModel>> r4) {
            r1 = this;
            java.lang.Class r0 = r2.getClass()
            java.lang.Class r0 = io.realm.internal.Util.getOriginalModelClass(r0)
            r1.checkSchemaHasClass(r0)
            io.realm.internal.RealmProxyMediator r0 = r1.originalMediator
            io.realm.RealmModel r2 = r0.createDetachedCopy(r2, r3, r4)
            return r2
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends io.realm.RealmModel> E createOrUpdateUsingJsonObject(java.lang.Class<E> r2, io.realm.Realm r3, org.json.JSONObject r4, boolean r5) throws org.json.JSONException {
            r1 = this;
            r1.checkSchemaHasClass(r2)
            io.realm.internal.RealmProxyMediator r0 = r1.originalMediator
            io.realm.RealmModel r2 = r0.createOrUpdateUsingJsonObject(r2, r3, r4, r5)
            return r2
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends io.realm.RealmModel> E createUsingJsonStream(java.lang.Class<E> r2, io.realm.Realm r3, android.util.JsonReader r4) throws java.io.IOException {
            r1 = this;
            r1.checkSchemaHasClass(r2)
            io.realm.internal.RealmProxyMediator r0 = r1.originalMediator
            io.realm.RealmModel r2 = r0.createUsingJsonStream(r2, r3, r4)
            return r2
    }

    @Override // io.realm.internal.RealmProxyMediator
    public final <T extends io.realm.RealmModel> java.lang.Class<T> getClazzImpl(java.lang.String r2) {
            r1 = this;
            io.realm.internal.RealmProxyMediator r0 = r1.originalMediator
            java.lang.Class r2 = r0.getClazz(r2)
            return r2
    }

    @Override // io.realm.internal.RealmProxyMediator
    public java.util.Map<java.lang.Class<? extends io.realm.RealmModel>, io.realm.internal.OsObjectSchemaInfo> getExpectedObjectSchemaInfoMap() {
            r5 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            io.realm.internal.RealmProxyMediator r1 = r5.originalMediator
            java.util.Map r1 = r1.getExpectedObjectSchemaInfoMap()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L13:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.util.Set<java.lang.Class<? extends io.realm.RealmModel>> r3 = r5.classes
            java.lang.Object r4 = r2.getKey()
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L13
            java.lang.Object r3 = r2.getKey()
            java.lang.Class r3 = (java.lang.Class) r3
            java.lang.Object r2 = r2.getValue()
            io.realm.internal.OsObjectSchemaInfo r2 = (io.realm.internal.OsObjectSchemaInfo) r2
            r0.put(r3, r2)
            goto L13
        L3b:
            return r0
    }

    @Override // io.realm.internal.RealmProxyMediator
    public java.util.Set<java.lang.Class<? extends io.realm.RealmModel>> getModelClasses() {
            r1 = this;
            java.util.Set<java.lang.Class<? extends io.realm.RealmModel>> r0 = r1.classes
            return r0
    }

    @Override // io.realm.internal.RealmProxyMediator
    public final java.lang.String getSimpleClassNameImpl(java.lang.Class<? extends io.realm.RealmModel> r2) {
            r1 = this;
            r1.checkSchemaHasClass(r2)
            io.realm.internal.RealmProxyMediator r0 = r1.originalMediator
            java.lang.String r2 = r0.getSimpleClassName(r2)
            return r2
    }

    @Override // io.realm.internal.RealmProxyMediator
    public final boolean hasPrimaryKeyImpl(java.lang.Class<? extends io.realm.RealmModel> r2) {
            r1 = this;
            io.realm.internal.RealmProxyMediator r0 = r1.originalMediator
            boolean r2 = r0.hasPrimaryKey(r2)
            return r2
    }

    @Override // io.realm.internal.RealmProxyMediator
    public long insert(io.realm.Realm r2, io.realm.RealmModel r3, java.util.Map<io.realm.RealmModel, java.lang.Long> r4) {
            r1 = this;
            java.lang.Class r0 = r3.getClass()
            java.lang.Class r0 = io.realm.internal.Util.getOriginalModelClass(r0)
            r1.checkSchemaHasClass(r0)
            io.realm.internal.RealmProxyMediator r0 = r1.originalMediator
            long r2 = r0.insert(r2, r3, r4)
            return r2
    }

    @Override // io.realm.internal.RealmProxyMediator
    public void insert(io.realm.Realm r2, java.util.Collection<? extends io.realm.RealmModel> r3) {
            r1 = this;
            java.util.Iterator r0 = r3.iterator()
            java.lang.Object r0 = r0.next()
            io.realm.RealmModel r0 = (io.realm.RealmModel) r0
            java.lang.Class r0 = r0.getClass()
            java.lang.Class r0 = io.realm.internal.Util.getOriginalModelClass(r0)
            r1.checkSchemaHasClass(r0)
            io.realm.internal.RealmProxyMediator r0 = r1.originalMediator
            r0.insert(r2, r3)
            return
    }

    @Override // io.realm.internal.RealmProxyMediator
    public long insertOrUpdate(io.realm.Realm r2, io.realm.RealmModel r3, java.util.Map<io.realm.RealmModel, java.lang.Long> r4) {
            r1 = this;
            java.lang.Class r0 = r3.getClass()
            java.lang.Class r0 = io.realm.internal.Util.getOriginalModelClass(r0)
            r1.checkSchemaHasClass(r0)
            io.realm.internal.RealmProxyMediator r0 = r1.originalMediator
            long r2 = r0.insertOrUpdate(r2, r3, r4)
            return r2
    }

    @Override // io.realm.internal.RealmProxyMediator
    public void insertOrUpdate(io.realm.Realm r2, java.util.Collection<? extends io.realm.RealmModel> r3) {
            r1 = this;
            java.util.Iterator r0 = r3.iterator()
            java.lang.Object r0 = r0.next()
            io.realm.RealmModel r0 = (io.realm.RealmModel) r0
            java.lang.Class r0 = r0.getClass()
            java.lang.Class r0 = io.realm.internal.Util.getOriginalModelClass(r0)
            r1.checkSchemaHasClass(r0)
            io.realm.internal.RealmProxyMediator r0 = r1.originalMediator
            r0.insertOrUpdate(r2, r3)
            return
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends io.realm.RealmModel> boolean isEmbedded(java.lang.Class<E> r2) {
            r1 = this;
            java.lang.Class r0 = io.realm.internal.Util.getOriginalModelClass(r2)
            r1.checkSchemaHasClass(r0)
            io.realm.internal.RealmProxyMediator r0 = r1.originalMediator
            boolean r2 = r0.isEmbedded(r2)
            return r2
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends io.realm.RealmModel> E newInstance(java.lang.Class<E> r8, java.lang.Object r9, io.realm.internal.Row r10, io.realm.internal.ColumnInfo r11, boolean r12, java.util.List<java.lang.String> r13) {
            r7 = this;
            r7.checkSchemaHasClass(r8)
            io.realm.internal.RealmProxyMediator r0 = r7.originalMediator
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            io.realm.RealmModel r8 = r0.newInstance(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Override // io.realm.internal.RealmProxyMediator
    public boolean transformerApplied() {
            r1 = this;
            io.realm.internal.RealmProxyMediator r0 = r1.originalMediator
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            boolean r0 = r0.transformerApplied()
            return r0
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends io.realm.RealmModel> void updateEmbeddedObject(io.realm.Realm r8, E r9, E r10, java.util.Map<io.realm.RealmModel, io.realm.internal.RealmObjectProxy> r11, java.util.Set<io.realm.ImportFlag> r12) {
            r7 = this;
            java.lang.Class r0 = r10.getClass()
            java.lang.Class r0 = io.realm.internal.Util.getOriginalModelClass(r0)
            r7.checkSchemaHasClass(r0)
            io.realm.internal.RealmProxyMediator r1 = r7.originalMediator
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r1.updateEmbeddedObject(r2, r3, r4, r5, r6)
            return
    }
}
