package io.realm;

/* JADX INFO: compiled from: TypeSelectorForMap.java */
/* JADX INFO: loaded from: classes3.dex */
class DynamicSelectorForMap<K> extends io.realm.TypeSelectorForMap<K, io.realm.DynamicRealmObject> {
    private final java.lang.String className;

    public DynamicSelectorForMap(io.realm.BaseRealm r1, io.realm.internal.OsMap r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.className = r3
            return
    }

    private <T> io.realm.RealmResults<T> produceResults(io.realm.BaseRealm r4, io.realm.internal.util.Pair<io.realm.internal.Table, java.lang.Long> r5, java.lang.String r6) {
            r3 = this;
            S r5 = r5.second
            java.lang.Long r5 = (java.lang.Long) r5
            io.realm.internal.OsSharedRealm r0 = r4.sharedRealm
            long r1 = r5.longValue()
            io.realm.internal.OsResults r5 = io.realm.internal.OsResults.createFromMap(r0, r1)
            io.realm.RealmResults r0 = new io.realm.RealmResults
            r1 = 0
            r0.<init>(r4, r5, r6, r1)
            return r0
    }

    @Override // io.realm.TypeSelectorForMap
    public io.realm.RealmDictionary<io.realm.DynamicRealmObject> freeze(io.realm.BaseRealm r4) {
            r3 = this;
            io.realm.RealmDictionary r0 = new io.realm.RealmDictionary
            io.realm.internal.OsMap r1 = r3.osMap
            java.lang.String r2 = r3.className
            r0.<init>(r4, r1, r2)
            return r0
    }

    @Override // io.realm.TypeSelectorForMap
    public java.util.Map.Entry<K, io.realm.DynamicRealmObject> getModelEntry(io.realm.BaseRealm r3, long r4, K r6) {
            r2 = this;
            java.lang.Class<io.realm.DynamicRealmObject> r0 = io.realm.DynamicRealmObject.class
            java.lang.String r1 = r2.className
            io.realm.RealmModel r3 = r3.get(r0, r1, r4)
            io.realm.DynamicRealmObject r3 = (io.realm.DynamicRealmObject) r3
            java.util.AbstractMap$SimpleImmutableEntry r4 = new java.util.AbstractMap$SimpleImmutableEntry
            r4.<init>(r6, r3)
            return r4
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.realm.TypeSelectorForMap
    public io.realm.DynamicRealmObject getRealmModel(io.realm.BaseRealm r3, long r4) {
            r2 = this;
            java.lang.Class<io.realm.DynamicRealmObject> r0 = io.realm.DynamicRealmObject.class
            java.lang.String r1 = r2.className
            io.realm.RealmModel r3 = r3.get(r0, r1, r4)
            io.realm.DynamicRealmObject r3 = (io.realm.DynamicRealmObject) r3
            return r3
    }

    @Override // io.realm.TypeSelectorForMap
    public /* bridge */ /* synthetic */ io.realm.DynamicRealmObject getRealmModel(io.realm.BaseRealm r1, long r2) {
            r0 = this;
            io.realm.DynamicRealmObject r1 = r0.getRealmModel(r1, r2)
            return r1
    }

    @Override // io.realm.TypeSelectorForMap
    public final java.lang.Class<io.realm.DynamicRealmObject> getValueClass() {
            r1 = this;
            java.lang.Class<io.realm.DynamicRealmObject> r0 = io.realm.DynamicRealmObject.class
            return r0
    }

    @Override // io.realm.TypeSelectorForMap
    public final java.lang.String getValueClassName() {
            r1 = this;
            java.lang.String r0 = r1.className
            return r0
    }

    @Override // io.realm.TypeSelectorForMap
    public java.util.Collection<io.realm.DynamicRealmObject> getValues() {
            r3 = this;
            io.realm.BaseRealm r0 = r3.baseRealm
            io.realm.internal.OsMap r1 = r3.osMap
            io.realm.internal.util.Pair r1 = r1.tableAndValuePtrs()
            java.lang.String r2 = r3.className
            io.realm.RealmResults r0 = r3.produceResults(r0, r1, r2)
            return r0
    }

    @Override // io.realm.TypeSelectorForMap
    public java.util.Set<K> keySet() {
            r4 = this;
            java.util.HashSet r0 = new java.util.HashSet
            io.realm.BaseRealm r1 = r4.baseRealm
            io.realm.internal.OsMap r2 = r4.osMap
            io.realm.internal.util.Pair r2 = r2.tableAndKeyPtrs()
            java.lang.String r3 = r4.className
            io.realm.RealmResults r1 = r4.produceResults(r1, r2, r3)
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: putRealmModel, reason: avoid collision after fix types in other method */
    public io.realm.DynamicRealmObject putRealmModel2(io.realm.BaseRealm r6, io.realm.internal.OsMap r7, K r8, @javax.annotation.Nullable io.realm.DynamicRealmObject r9) {
            r5 = this;
            long r0 = r7.getModelRowKey(r8)
            r2 = 0
            if (r9 != 0) goto Lb
            r7.put(r8, r2)
            goto L45
        Lb:
            io.realm.RealmSchema r3 = r6.getSchema()
            java.lang.String r4 = r5.className
            io.realm.RealmObjectSchema r3 = r3.getSchemaForClass(r4)
            boolean r3 = r3.isEmbedded()
            if (r3 == 0) goto L26
            long r7 = r7.createAndPutEmbeddedObject(r8)
            r3 = r6
            io.realm.Realm r3 = (io.realm.Realm) r3
            io.realm.CollectionUtils.updateEmbeddedObject(r3, r9, r7)
            goto L45
        L26:
            java.lang.String r3 = r5.className
            java.lang.String r4 = "dictionary"
            boolean r3 = io.realm.CollectionUtils.checkCanObjectBeCopied(r6, r9, r3, r4)
            if (r3 == 0) goto L36
            io.realm.RealmModel r9 = io.realm.CollectionUtils.copyToRealm(r6, r9)
            io.realm.DynamicRealmObject r9 = (io.realm.DynamicRealmObject) r9
        L36:
            io.realm.ProxyState r9 = r9.realmGet$proxyState()
            io.realm.internal.Row r9 = r9.getRow$realm()
            long r3 = r9.getObjectKey()
            r7.putRow(r8, r3)
        L45:
            r7 = -1
            int r9 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r9 != 0) goto L4c
            return r2
        L4c:
            java.lang.Class<io.realm.DynamicRealmObject> r7 = io.realm.DynamicRealmObject.class
            java.lang.String r8 = r5.className
            io.realm.RealmModel r6 = r6.get(r7, r8, r0)
            io.realm.DynamicRealmObject r6 = (io.realm.DynamicRealmObject) r6
            return r6
    }

    @Override // io.realm.TypeSelectorForMap
    public /* bridge */ /* synthetic */ io.realm.DynamicRealmObject putRealmModel(io.realm.BaseRealm r1, io.realm.internal.OsMap r2, java.lang.Object r3, @javax.annotation.Nullable io.realm.DynamicRealmObject r4) {
            r0 = this;
            io.realm.DynamicRealmObject r4 = (io.realm.DynamicRealmObject) r4
            io.realm.DynamicRealmObject r1 = r0.putRealmModel2(r1, r2, r3, r4)
            return r1
    }
}
