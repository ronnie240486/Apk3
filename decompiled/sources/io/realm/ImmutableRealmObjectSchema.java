package io.realm;

/* JADX INFO: loaded from: classes3.dex */
class ImmutableRealmObjectSchema extends io.realm.RealmObjectSchema {
    private static final java.lang.String SCHEMA_IMMUTABLE_EXCEPTION_MSG = "This 'RealmObjectSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance.";

    public ImmutableRealmObjectSchema(io.realm.BaseRealm r1, io.realm.RealmSchema r2, io.realm.internal.Table r3) {
            r0 = this;
            io.realm.RealmObjectSchema$DynamicColumnIndices r2 = new io.realm.RealmObjectSchema$DynamicColumnIndices
            r2.<init>(r3)
            r0.<init>(r1, r3, r2)
            return
    }

    public ImmutableRealmObjectSchema(io.realm.BaseRealm r1, io.realm.RealmSchema r2, io.realm.internal.Table r3, io.realm.internal.ColumnInfo r4) {
            r0 = this;
            r0.<init>(r1, r3, r4)
            return
    }

    @Override // io.realm.RealmObjectSchema
    public io.realm.RealmObjectSchema addField(java.lang.String r1, java.lang.Class<?> r2, io.realm.FieldAttribute... r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "This 'RealmObjectSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.RealmObjectSchema
    public io.realm.RealmObjectSchema addIndex(java.lang.String r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "This 'RealmObjectSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance."
            r2.<init>(r0)
            throw r2
    }

    @Override // io.realm.RealmObjectSchema
    public io.realm.RealmObjectSchema addPrimaryKey(java.lang.String r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "This 'RealmObjectSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance."
            r2.<init>(r0)
            throw r2
    }

    @Override // io.realm.RealmObjectSchema
    public io.realm.RealmObjectSchema addRealmDictionaryField(java.lang.String r1, io.realm.RealmObjectSchema r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "This 'RealmObjectSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.RealmObjectSchema
    public io.realm.RealmObjectSchema addRealmDictionaryField(java.lang.String r1, java.lang.Class<?> r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "This 'RealmObjectSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.RealmObjectSchema
    public io.realm.RealmObjectSchema addRealmListField(java.lang.String r1, io.realm.RealmObjectSchema r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "This 'RealmObjectSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.RealmObjectSchema
    public io.realm.RealmObjectSchema addRealmListField(java.lang.String r1, java.lang.Class<?> r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "This 'RealmObjectSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.RealmObjectSchema
    public io.realm.RealmObjectSchema addRealmObjectField(java.lang.String r1, io.realm.RealmObjectSchema r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "This 'RealmObjectSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.RealmObjectSchema
    public io.realm.RealmObjectSchema addRealmSetField(java.lang.String r1, io.realm.RealmObjectSchema r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "This 'RealmObjectSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.RealmObjectSchema
    public io.realm.RealmObjectSchema addRealmSetField(java.lang.String r1, java.lang.Class<?> r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "This 'RealmObjectSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.RealmObjectSchema
    public final java.lang.String getPropertyClassName(java.lang.String r4) {
            r3 = this;
            io.realm.internal.ColumnInfo r0 = r3.columnInfo
            io.realm.internal.ColumnInfo$ColumnDetails r0 = r0.getColumnDetails(r4)
            if (r0 == 0) goto Lb
            java.lang.String r4 = r0.linkedClassName
            return r4
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "Property '%s' not found."
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
    }

    @Override // io.realm.RealmObjectSchema
    public io.realm.RealmObjectSchema removeField(java.lang.String r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "This 'RealmObjectSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance."
            r2.<init>(r0)
            throw r2
    }

    @Override // io.realm.RealmObjectSchema
    public io.realm.RealmObjectSchema removeIndex(java.lang.String r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "This 'RealmObjectSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance."
            r2.<init>(r0)
            throw r2
    }

    @Override // io.realm.RealmObjectSchema
    public io.realm.RealmObjectSchema removePrimaryKey() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "This 'RealmObjectSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance."
            r0.<init>(r1)
            throw r0
    }

    @Override // io.realm.RealmObjectSchema
    public io.realm.RealmObjectSchema renameField(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "This 'RealmObjectSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.RealmObjectSchema
    public io.realm.RealmObjectSchema setClassName(java.lang.String r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "This 'RealmObjectSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance."
            r2.<init>(r0)
            throw r2
    }

    @Override // io.realm.RealmObjectSchema
    public io.realm.RealmObjectSchema setNullable(java.lang.String r1, boolean r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "This 'RealmObjectSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.RealmObjectSchema
    public io.realm.RealmObjectSchema setRequired(java.lang.String r1, boolean r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "This 'RealmObjectSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.RealmObjectSchema
    public io.realm.RealmObjectSchema transform(io.realm.RealmObjectSchema.Function r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "This 'RealmObjectSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance."
            r2.<init>(r0)
            throw r2
    }
}
