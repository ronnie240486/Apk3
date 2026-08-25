package io.realm;

/* JADX INFO: loaded from: classes2.dex */
class ImmutableRealmSchema extends io.realm.RealmSchema {
    private static final java.lang.String SCHEMA_IMMUTABLE_EXCEPTION_MSG = "This 'RealmSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance.";

    public ImmutableRealmSchema(io.realm.BaseRealm r1, io.realm.internal.ColumnIndices r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // io.realm.RealmSchema
    public io.realm.RealmObjectSchema create(java.lang.String r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "This 'RealmSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance."
            r2.<init>(r0)
            throw r2
    }

    @Override // io.realm.RealmSchema
    public io.realm.RealmObjectSchema createWithPrimaryKeyField(java.lang.String r1, java.lang.String r2, java.lang.Class<?> r3, io.realm.FieldAttribute... r4) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "This 'RealmSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.RealmSchema
    public io.realm.RealmObjectSchema get(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "Null or empty class names are not allowed"
            r3.checkNotEmpty(r4, r0)
            java.lang.String r0 = io.realm.internal.Table.getTableNameForClass(r4)
            io.realm.BaseRealm r1 = r3.realm
            io.realm.internal.OsSharedRealm r1 = r1.sharedRealm
            boolean r1 = r1.hasTable(r0)
            if (r1 != 0) goto L15
            r4 = 0
            return r4
        L15:
            io.realm.BaseRealm r1 = r3.realm
            io.realm.internal.OsSharedRealm r1 = r1.sharedRealm
            io.realm.internal.Table r0 = r1.getTable(r0)
            io.realm.ImmutableRealmObjectSchema r1 = new io.realm.ImmutableRealmObjectSchema
            io.realm.BaseRealm r2 = r3.realm
            io.realm.internal.ColumnInfo r4 = r3.getColumnInfo(r4)
            r1.<init>(r2, r3, r0, r4)
            return r1
    }

    @Override // io.realm.RealmSchema
    public java.util.Set<io.realm.RealmObjectSchema> getAll() {
            r4 = this;
            io.realm.BaseRealm r0 = r4.realm
            io.realm.RealmConfiguration r0 = r0.getConfiguration()
            io.realm.internal.RealmProxyMediator r0 = r0.getSchemaMediator()
            java.util.Set r1 = r0.getModelClasses()
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            int r3 = r1.size()
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L1b:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L33
            java.lang.Object r3 = r1.next()
            java.lang.Class r3 = (java.lang.Class) r3
            java.lang.String r3 = r0.getSimpleClassName(r3)
            io.realm.RealmObjectSchema r3 = r4.get(r3)
            r2.add(r3)
            goto L1b
        L33:
            return r2
    }

    @Override // io.realm.RealmSchema
    public void remove(java.lang.String r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "This 'RealmSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance."
            r2.<init>(r0)
            throw r2
    }

    @Override // io.realm.RealmSchema
    public io.realm.RealmObjectSchema rename(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "This 'RealmSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance."
            r1.<init>(r2)
            throw r1
    }
}
