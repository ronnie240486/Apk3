package io.realm.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class RealmProxyMediator {
    public RealmProxyMediator() {
            r0 = this;
            r0.<init>()
            return
    }

    public static io.realm.exceptions.RealmException getMissingProxyClassException(java.lang.Class<? extends io.realm.RealmModel> r3) {
            io.realm.exceptions.RealmException r0 = new io.realm.exceptions.RealmException
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = r3.toString()
            r2 = 0
            r1[r2] = r3
            java.lang.String r3 = "'%s' is not part of the schema for this Realm."
            java.lang.String r3 = java.lang.String.format(r3, r1)
            r0.<init>(r3)
            return r0
    }

    public static java.lang.IllegalStateException getNotEmbeddedClassException(java.lang.String r2) {
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This class is not marked embedded: "
            java.lang.String r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2)
            r0.<init>(r2)
            return r0
    }

    public abstract <E extends io.realm.RealmModel> E copyOrUpdate(io.realm.Realm r1, E r2, boolean r3, java.util.Map<io.realm.RealmModel, io.realm.internal.RealmObjectProxy> r4, java.util.Set<io.realm.ImportFlag> r5);

    public abstract io.realm.internal.ColumnInfo createColumnInfo(java.lang.Class<? extends io.realm.RealmModel> r1, io.realm.internal.OsSchemaInfo r2);

    public abstract <E extends io.realm.RealmModel> E createDetachedCopy(E r1, int r2, java.util.Map<io.realm.RealmModel, io.realm.internal.RealmObjectProxy.CacheData<io.realm.RealmModel>> r3);

    public abstract <E extends io.realm.RealmModel> E createOrUpdateUsingJsonObject(java.lang.Class<E> r1, io.realm.Realm r2, org.json.JSONObject r3, boolean r4) throws org.json.JSONException;

    public abstract <E extends io.realm.RealmModel> E createUsingJsonStream(java.lang.Class<E> r1, io.realm.Realm r2, android.util.JsonReader r3) throws java.io.IOException;

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof io.realm.internal.RealmProxyMediator
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            io.realm.internal.RealmProxyMediator r2 = (io.realm.internal.RealmProxyMediator) r2
            java.util.Set r0 = r1.getModelClasses()
            java.util.Set r2 = r2.getModelClasses()
            boolean r2 = r0.equals(r2)
            return r2
    }

    public final <T extends io.realm.RealmModel> java.lang.Class<T> getClazz(java.lang.String r1) {
            r0 = this;
            java.lang.Class r1 = r0.getClazzImpl(r1)
            return r1
    }

    public abstract <T extends io.realm.RealmModel> java.lang.Class<T> getClazzImpl(java.lang.String r1);

    public abstract java.util.Map<java.lang.Class<? extends io.realm.RealmModel>, io.realm.internal.OsObjectSchemaInfo> getExpectedObjectSchemaInfoMap();

    public abstract java.util.Set<java.lang.Class<? extends io.realm.RealmModel>> getModelClasses();

    public final java.lang.String getSimpleClassName(java.lang.Class<? extends io.realm.RealmModel> r1) {
            r0 = this;
            java.lang.Class r1 = io.realm.internal.Util.getOriginalModelClass(r1)
            java.lang.String r1 = r0.getSimpleClassNameImpl(r1)
            return r1
    }

    public abstract java.lang.String getSimpleClassNameImpl(java.lang.Class<? extends io.realm.RealmModel> r1);

    public boolean hasPrimaryKey(java.lang.Class<? extends io.realm.RealmModel> r1) {
            r0 = this;
            boolean r1 = r0.hasPrimaryKeyImpl(r1)
            return r1
    }

    public abstract boolean hasPrimaryKeyImpl(java.lang.Class<? extends io.realm.RealmModel> r1);

    public int hashCode() {
            r1 = this;
            java.util.Set r0 = r1.getModelClasses()
            int r0 = r0.hashCode()
            return r0
    }

    public abstract long insert(io.realm.Realm r1, io.realm.RealmModel r2, java.util.Map<io.realm.RealmModel, java.lang.Long> r3);

    public abstract void insert(io.realm.Realm r1, java.util.Collection<? extends io.realm.RealmModel> r2);

    public abstract long insertOrUpdate(io.realm.Realm r1, io.realm.RealmModel r2, java.util.Map<io.realm.RealmModel, java.lang.Long> r3);

    public abstract void insertOrUpdate(io.realm.Realm r1, java.util.Collection<? extends io.realm.RealmModel> r2);

    public abstract <E extends io.realm.RealmModel> boolean isEmbedded(java.lang.Class<E> r1);

    public abstract <E extends io.realm.RealmModel> E newInstance(java.lang.Class<E> r1, java.lang.Object r2, io.realm.internal.Row r3, io.realm.internal.ColumnInfo r4, boolean r5, java.util.List<java.lang.String> r6);

    public boolean transformerApplied() {
            r1 = this;
            r0 = 0
            return r0
    }

    public abstract <E extends io.realm.RealmModel> void updateEmbeddedObject(io.realm.Realm r1, E r2, E r3, java.util.Map<io.realm.RealmModel, io.realm.internal.RealmObjectProxy> r4, java.util.Set<io.realm.ImportFlag> r5);
}
