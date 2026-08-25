package io.realm;

import io.realm.RealmModel;

/* JADX INFO: compiled from: TypeSelectorForMap.java */
/* JADX INFO: loaded from: classes3.dex */
class LinkSelectorForMap<K, V extends io.realm.RealmModel> extends io.realm.SelectorForMap<K, V> {
    public LinkSelectorForMap(io.realm.BaseRealm r1, io.realm.internal.OsMap r2, java.lang.Class r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // io.realm.TypeSelectorForMap
    public java.util.Map.Entry<K, V> getModelEntry(io.realm.BaseRealm r3, long r4, K r6) {
            r2 = this;
            java.lang.Class<V> r0 = r2.valueClass
            r1 = 0
            io.realm.RealmModel r3 = r3.get(r0, r1, r4)
            java.util.AbstractMap$SimpleImmutableEntry r4 = new java.util.AbstractMap$SimpleImmutableEntry
            r4.<init>(r6, r3)
            return r4
    }

    @Override // io.realm.TypeSelectorForMap
    public V getRealmModel(io.realm.BaseRealm r3, long r4) {
            r2 = this;
            java.lang.Class<V> r0 = r2.valueClass
            r1 = 0
            io.realm.RealmModel r3 = r3.get(r0, r1, r4)
            return r3
    }

    @Override // io.realm.TypeSelectorForMap
    public /* bridge */ /* synthetic */ java.lang.Object getRealmModel(io.realm.BaseRealm r1, long r2) {
            r0 = this;
            io.realm.RealmModel r1 = r0.getRealmModel(r1, r2)
            return r1
    }

    public V putRealmModel(io.realm.BaseRealm r6, io.realm.internal.OsMap r7, K r8, @javax.annotation.Nullable V r9) {
            r5 = this;
            long r0 = r7.getModelRowKey(r8)
            r2 = 0
            if (r9 != 0) goto Lb
            r7.put(r8, r2)
            goto L49
        Lb:
            io.realm.RealmSchema r3 = r6.getSchema()
            java.lang.Class<V> r4 = r5.valueClass
            io.realm.RealmObjectSchema r3 = r3.getSchemaForClass(r4)
            boolean r3 = r3.isEmbedded()
            if (r3 == 0) goto L26
            long r7 = r7.createAndPutEmbeddedObject(r8)
            r3 = r6
            io.realm.Realm r3 = (io.realm.Realm) r3
            io.realm.CollectionUtils.updateEmbeddedObject(r3, r9, r7)
            goto L49
        L26:
            java.lang.Class<V> r3 = r5.valueClass
            java.lang.String r3 = r3.getSimpleName()
            java.lang.String r4 = "dictionary"
            boolean r3 = io.realm.CollectionUtils.checkCanObjectBeCopied(r6, r9, r3, r4)
            if (r3 == 0) goto L38
            io.realm.RealmModel r9 = io.realm.CollectionUtils.copyToRealm(r6, r9)
        L38:
            io.realm.internal.RealmObjectProxy r9 = (io.realm.internal.RealmObjectProxy) r9
            io.realm.ProxyState r9 = r9.realmGet$proxyState()
            io.realm.internal.Row r9 = r9.getRow$realm()
            long r3 = r9.getObjectKey()
            r7.putRow(r8, r3)
        L49:
            r7 = -1
            int r9 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r9 != 0) goto L50
            return r2
        L50:
            java.lang.Class<V> r7 = r5.valueClass
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            io.realm.RealmModel r6 = r6.get(r7, r0, r8)
            return r6
    }

    @Override // io.realm.TypeSelectorForMap
    public /* bridge */ /* synthetic */ java.lang.Object putRealmModel(io.realm.BaseRealm r1, io.realm.internal.OsMap r2, java.lang.Object r3, @javax.annotation.Nullable java.lang.Object r4) {
            r0 = this;
            io.realm.RealmModel r4 = (io.realm.RealmModel) r4
            io.realm.RealmModel r1 = r0.putRealmModel(r1, r2, r3, r4)
            return r1
    }
}
