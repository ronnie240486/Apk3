package io.realm.internal.modules;

/* JADX INFO: loaded from: classes2.dex */
public class CompositeMediator extends io.realm.internal.RealmProxyMediator {
    private final java.util.Map<java.lang.String, java.lang.Class<? extends io.realm.RealmModel>> internalClassNames;
    private final java.util.Map<java.lang.Class<? extends io.realm.RealmModel>, io.realm.internal.RealmProxyMediator> mediators;

    public CompositeMediator(io.realm.internal.RealmProxyMediator... r11) {
            r10 = this;
            r10.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r10.internalClassNames = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            if (r11 == 0) goto L6e
            int r1 = r11.length
            r2 = 0
            r3 = 0
        L14:
            if (r3 >= r1) goto L6e
            r4 = r11[r3]
            java.util.Set r5 = r4.getModelClasses()
            java.util.Iterator r5 = r5.iterator()
        L20:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L6b
            java.lang.Object r6 = r5.next()
            java.lang.Class r6 = (java.lang.Class) r6
            java.lang.String r7 = r4.getSimpleClassName(r6)
            java.util.Map<java.lang.String, java.lang.Class<? extends io.realm.RealmModel>> r8 = r10.internalClassNames
            java.lang.Object r8 = r8.get(r7)
            java.lang.Class r8 = (java.lang.Class) r8
            if (r8 == 0) goto L62
            boolean r9 = r8.equals(r6)
            if (r9 == 0) goto L41
            goto L62
        L41:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r1 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r8
            r2 = 1
            r1[r2] = r6
            r2 = 2
            java.lang.Object r0 = r0.get(r8)
            r1[r2] = r0
            r0 = 3
            r1[r0] = r4
            r0 = 4
            r1[r0] = r7
            java.lang.String r0 = "It is not allowed for two different model classes to share the same internal name in Realm. The classes %s and %s are being included from the modules '%s' and '%s' and they share the same internal name '%s'."
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r11.<init>(r0)
            throw r11
        L62:
            r0.put(r6, r4)
            java.util.Map<java.lang.String, java.lang.Class<? extends io.realm.RealmModel>> r8 = r10.internalClassNames
            r8.put(r7, r6)
            goto L20
        L6b:
            int r3 = r3 + 1
            goto L14
        L6e:
            java.util.Map r11 = java.util.Collections.unmodifiableMap(r0)
            r10.mediators = r11
            return
    }

    private io.realm.internal.RealmProxyMediator getMediator(java.lang.Class<? extends io.realm.RealmModel> r3) {
            r2 = this;
            java.util.Map<java.lang.Class<? extends io.realm.RealmModel>, io.realm.internal.RealmProxyMediator> r0 = r2.mediators
            java.lang.Object r0 = r0.get(r3)
            io.realm.internal.RealmProxyMediator r0 = (io.realm.internal.RealmProxyMediator) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            io.realm.exceptions.RealmException r0 = new io.realm.exceptions.RealmException
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

    private io.realm.internal.RealmProxyMediator getMediator(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Class<? extends io.realm.RealmModel>> r0 = r1.internalClassNames
            java.lang.Object r2 = r0.get(r2)
            java.lang.Class r2 = (java.lang.Class) r2
            io.realm.internal.RealmProxyMediator r2 = r1.getMediator(r2)
            return r2
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends io.realm.RealmModel> E copyOrUpdate(io.realm.Realm r8, E r9, boolean r10, java.util.Map<io.realm.RealmModel, io.realm.internal.RealmObjectProxy> r11, java.util.Set<io.realm.ImportFlag> r12) {
            r7 = this;
            java.lang.Class r0 = r9.getClass()
            java.lang.Class r0 = io.realm.internal.Util.getOriginalModelClass(r0)
            io.realm.internal.RealmProxyMediator r1 = r7.getMediator(r0)
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
            io.realm.internal.RealmProxyMediator r0 = r1.getMediator(r2)
            io.realm.internal.ColumnInfo r2 = r0.createColumnInfo(r2, r3)
            return r2
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends io.realm.RealmModel> E createDetachedCopy(E r2, int r3, java.util.Map<io.realm.RealmModel, io.realm.internal.RealmObjectProxy.CacheData<io.realm.RealmModel>> r4) {
            r1 = this;
            java.lang.Class r0 = r2.getClass()
            java.lang.Class r0 = io.realm.internal.Util.getOriginalModelClass(r0)
            io.realm.internal.RealmProxyMediator r0 = r1.getMediator(r0)
            io.realm.RealmModel r2 = r0.createDetachedCopy(r2, r3, r4)
            return r2
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends io.realm.RealmModel> E createOrUpdateUsingJsonObject(java.lang.Class<E> r2, io.realm.Realm r3, org.json.JSONObject r4, boolean r5) throws org.json.JSONException {
            r1 = this;
            io.realm.internal.RealmProxyMediator r0 = r1.getMediator(r2)
            io.realm.RealmModel r2 = r0.createOrUpdateUsingJsonObject(r2, r3, r4, r5)
            return r2
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends io.realm.RealmModel> E createUsingJsonStream(java.lang.Class<E> r2, io.realm.Realm r3, android.util.JsonReader r4) throws java.io.IOException {
            r1 = this;
            io.realm.internal.RealmProxyMediator r0 = r1.getMediator(r2)
            io.realm.RealmModel r2 = r0.createUsingJsonStream(r2, r3, r4)
            return r2
    }

    @Override // io.realm.internal.RealmProxyMediator
    public final <T extends io.realm.RealmModel> java.lang.Class<T> getClazzImpl(java.lang.String r2) {
            r1 = this;
            io.realm.internal.RealmProxyMediator r0 = r1.getMediator(r2)
            java.lang.Class r2 = r0.getClazz(r2)
            return r2
    }

    @Override // io.realm.internal.RealmProxyMediator
    public java.util.Map<java.lang.Class<? extends io.realm.RealmModel>, io.realm.internal.OsObjectSchemaInfo> getExpectedObjectSchemaInfoMap() {
            r3 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map<java.lang.Class<? extends io.realm.RealmModel>, io.realm.internal.RealmProxyMediator> r1 = r3.mediators
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L23
            java.lang.Object r2 = r1.next()
            io.realm.internal.RealmProxyMediator r2 = (io.realm.internal.RealmProxyMediator) r2
            java.util.Map r2 = r2.getExpectedObjectSchemaInfoMap()
            r0.putAll(r2)
            goto Lf
        L23:
            return r0
    }

    @Override // io.realm.internal.RealmProxyMediator
    public java.util.Set<java.lang.Class<? extends io.realm.RealmModel>> getModelClasses() {
            r1 = this;
            java.util.Map<java.lang.Class<? extends io.realm.RealmModel>, io.realm.internal.RealmProxyMediator> r0 = r1.mediators
            java.util.Set r0 = r0.keySet()
            return r0
    }

    @Override // io.realm.internal.RealmProxyMediator
    public final java.lang.String getSimpleClassNameImpl(java.lang.Class<? extends io.realm.RealmModel> r2) {
            r1 = this;
            io.realm.internal.RealmProxyMediator r0 = r1.getMediator(r2)
            java.lang.String r2 = r0.getSimpleClassName(r2)
            return r2
    }

    @Override // io.realm.internal.RealmProxyMediator
    public final boolean hasPrimaryKeyImpl(java.lang.Class<? extends io.realm.RealmModel> r2) {
            r1 = this;
            io.realm.internal.RealmProxyMediator r0 = r1.getMediator(r2)
            boolean r2 = r0.hasPrimaryKey(r2)
            return r2
    }

    @Override // io.realm.internal.RealmProxyMediator
    public long insert(io.realm.Realm r2, io.realm.RealmModel r3, java.util.Map<io.realm.RealmModel, java.lang.Long> r4) {
            r1 = this;
            java.lang.Class r0 = r3.getClass()
            java.lang.Class r0 = io.realm.internal.Util.getOriginalModelClass(r0)
            io.realm.internal.RealmProxyMediator r0 = r1.getMediator(r0)
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
            java.lang.Class r0 = io.realm.internal.Util.getOriginalModelClass(r0)
            io.realm.internal.RealmProxyMediator r0 = r1.getMediator(r0)
            r0.insert(r2, r3)
            return
    }

    @Override // io.realm.internal.RealmProxyMediator
    public long insertOrUpdate(io.realm.Realm r2, io.realm.RealmModel r3, java.util.Map<io.realm.RealmModel, java.lang.Long> r4) {
            r1 = this;
            java.lang.Class r0 = r3.getClass()
            java.lang.Class r0 = io.realm.internal.Util.getOriginalModelClass(r0)
            io.realm.internal.RealmProxyMediator r0 = r1.getMediator(r0)
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
            java.lang.Class r0 = io.realm.internal.Util.getOriginalModelClass(r0)
            io.realm.internal.RealmProxyMediator r0 = r1.getMediator(r0)
            r0.insertOrUpdate(r2, r3)
            return
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends io.realm.RealmModel> boolean isEmbedded(java.lang.Class<E> r2) {
            r1 = this;
            java.lang.Class r0 = io.realm.internal.Util.getOriginalModelClass(r2)
            io.realm.internal.RealmProxyMediator r0 = r1.getMediator(r0)
            boolean r2 = r0.isEmbedded(r2)
            return r2
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends io.realm.RealmModel> E newInstance(java.lang.Class<E> r8, java.lang.Object r9, io.realm.internal.Row r10, io.realm.internal.ColumnInfo r11, boolean r12, java.util.List<java.lang.String> r13) {
            r7 = this;
            io.realm.internal.RealmProxyMediator r0 = r7.getMediator(r8)
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
            r2 = this;
            java.util.Map<java.lang.Class<? extends io.realm.RealmModel>, io.realm.internal.RealmProxyMediator> r0 = r2.mediators
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            io.realm.internal.RealmProxyMediator r1 = (io.realm.internal.RealmProxyMediator) r1
            boolean r1 = r1.transformerApplied()
            if (r1 != 0) goto La
            r0 = 0
            return r0
        L24:
            r0 = 1
            return r0
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends io.realm.RealmModel> void updateEmbeddedObject(io.realm.Realm r8, E r9, E r10, java.util.Map<io.realm.RealmModel, io.realm.internal.RealmObjectProxy> r11, java.util.Set<io.realm.ImportFlag> r12) {
            r7 = this;
            java.lang.Class r0 = r10.getClass()
            java.lang.Class r0 = io.realm.internal.Util.getOriginalModelClass(r0)
            io.realm.internal.RealmProxyMediator r1 = r7.getMediator(r0)
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r1.updateEmbeddedObject(r2, r3, r4, r5, r6)
            return
    }
}
