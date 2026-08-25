package io.realm;

/* JADX INFO: loaded from: classes.dex */
abstract class TypeSelectorForMap<K, V> {
    public final io.realm.BaseRealm baseRealm;
    public final io.realm.internal.OsMap osMap;

    public TypeSelectorForMap(io.realm.BaseRealm r1, io.realm.internal.OsMap r2) {
            r0 = this;
            r0.<init>()
            r0.baseRealm = r1
            r0.osMap = r2
            return
    }

    public abstract io.realm.RealmDictionary<V> freeze(io.realm.BaseRealm r1);

    public java.util.Map.Entry<K, V> getModelEntry(io.realm.BaseRealm r1, long r2, K r4) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Function 'getModelEntry' can only be called from 'LinkSelectorForMap' instances."
            r1.<init>(r2)
            throw r1
    }

    public V getRealmModel(io.realm.BaseRealm r1, long r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Function 'getRealmModel' can only be called from 'LinkSelectorForMap' instances."
            r1.<init>(r2)
            throw r1
    }

    public abstract java.lang.Class<V> getValueClass();

    public abstract java.lang.String getValueClassName();

    public abstract java.util.Collection<V> getValues();

    public abstract java.util.Set<K> keySet();

    public V putRealmModel(io.realm.BaseRealm r1, io.realm.internal.OsMap r2, K r3, @javax.annotation.Nullable V r4) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Function 'putRealmModel' can only be called from 'LinkSelectorForMap' instances."
            r1.<init>(r2)
            throw r1
    }
}
