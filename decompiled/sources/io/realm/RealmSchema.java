package io.realm;

/* JADX INFO: loaded from: classes3.dex */
public abstract class RealmSchema {
    private final java.util.Map<java.lang.Class<? extends io.realm.RealmModel>, io.realm.RealmObjectSchema> classToSchema;
    private final java.util.Map<java.lang.Class<? extends io.realm.RealmModel>, io.realm.internal.Table> classToTable;
    private final io.realm.internal.ColumnIndices columnIndices;
    private final java.util.Map<java.lang.String, io.realm.RealmObjectSchema> dynamicClassToSchema;
    private final java.util.Map<java.lang.String, io.realm.internal.Table> dynamicClassToTable;
    private io.realm.internal.objectstore.OsKeyPathMapping keyPathMapping;
    public final io.realm.BaseRealm realm;

    public RealmSchema(io.realm.BaseRealm r2, @javax.annotation.Nullable io.realm.internal.ColumnIndices r3) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.dynamicClassToTable = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.classToTable = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.classToSchema = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.dynamicClassToSchema = r0
            r0 = 0
            r1.keyPathMapping = r0
            r1.realm = r2
            r1.columnIndices = r3
            return
    }

    private void checkColumnKeys() {
            r2 = this;
            io.realm.internal.ColumnIndices r0 = r2.columnIndices
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            return
        La:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Attempt to use column key before set."
            r0.<init>(r1)
            throw r0
    }

    private boolean isProxyClass(java.lang.Class<? extends io.realm.RealmModel> r1, java.lang.Class<? extends io.realm.RealmModel> r2) {
            r0 = this;
            boolean r1 = r1.equals(r2)
            return r1
    }

    public final void checkNotEmpty(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            if (r1 == 0) goto L9
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L9
            return
        L9:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r2)
            throw r1
    }

    public boolean contains(java.lang.String r2) {
            r1 = this;
            io.realm.BaseRealm r0 = r1.realm
            io.realm.internal.OsSharedRealm r0 = r0.sharedRealm
            java.lang.String r2 = io.realm.internal.Table.getTableNameForClass(r2)
            boolean r2 = r0.hasTable(r2)
            return r2
    }

    public abstract io.realm.RealmObjectSchema create(java.lang.String r1);

    public void createKeyPathMapping() {
            r3 = this;
            io.realm.internal.objectstore.OsKeyPathMapping r0 = new io.realm.internal.objectstore.OsKeyPathMapping
            io.realm.BaseRealm r1 = r3.realm
            io.realm.internal.OsSharedRealm r1 = r1.sharedRealm
            long r1 = r1.getNativePtr()
            r0.<init>(r1)
            r3.keyPathMapping = r0
            return
    }

    public abstract io.realm.RealmObjectSchema createWithPrimaryKeyField(java.lang.String r1, java.lang.String r2, java.lang.Class<?> r3, io.realm.FieldAttribute... r4);

    @javax.annotation.Nullable
    public abstract io.realm.RealmObjectSchema get(java.lang.String r1);

    public abstract java.util.Set<io.realm.RealmObjectSchema> getAll();

    public final io.realm.internal.ColumnInfo getColumnInfo(java.lang.Class<? extends io.realm.RealmModel> r2) {
            r1 = this;
            r1.checkColumnKeys()
            io.realm.internal.ColumnIndices r0 = r1.columnIndices
            io.realm.internal.ColumnInfo r2 = r0.getColumnInfo(r2)
            return r2
    }

    public final io.realm.internal.ColumnInfo getColumnInfo(java.lang.String r2) {
            r1 = this;
            r1.checkColumnKeys()
            io.realm.internal.ColumnIndices r0 = r1.columnIndices
            io.realm.internal.ColumnInfo r2 = r0.getColumnInfo(r2)
            return r2
    }

    public final io.realm.internal.objectstore.OsKeyPathMapping getKeyPathMapping() {
            r1 = this;
            io.realm.internal.objectstore.OsKeyPathMapping r0 = r1.keyPathMapping
            return r0
    }

    public final io.realm.RealmObjectSchema getSchemaForClass(java.lang.Class<? extends io.realm.RealmModel> r6) {
            r5 = this;
            java.util.Map<java.lang.Class<? extends io.realm.RealmModel>, io.realm.RealmObjectSchema> r0 = r5.classToSchema
            java.lang.Object r0 = r0.get(r6)
            io.realm.RealmObjectSchema r0 = (io.realm.RealmObjectSchema) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            java.lang.Class r1 = io.realm.internal.Util.getOriginalModelClass(r6)
            boolean r2 = r5.isProxyClass(r1, r6)
            if (r2 == 0) goto L1d
            java.util.Map<java.lang.Class<? extends io.realm.RealmModel>, io.realm.RealmObjectSchema> r0 = r5.classToSchema
            java.lang.Object r0 = r0.get(r1)
            io.realm.RealmObjectSchema r0 = (io.realm.RealmObjectSchema) r0
        L1d:
            if (r0 != 0) goto L34
            io.realm.internal.Table r0 = r5.getTable(r6)
            io.realm.ImmutableRealmObjectSchema r2 = new io.realm.ImmutableRealmObjectSchema
            io.realm.BaseRealm r3 = r5.realm
            io.realm.internal.ColumnInfo r4 = r5.getColumnInfo(r1)
            r2.<init>(r3, r5, r0, r4)
            java.util.Map<java.lang.Class<? extends io.realm.RealmModel>, io.realm.RealmObjectSchema> r0 = r5.classToSchema
            r0.put(r1, r2)
            r0 = r2
        L34:
            boolean r1 = r5.isProxyClass(r1, r6)
            if (r1 == 0) goto L3f
            java.util.Map<java.lang.Class<? extends io.realm.RealmModel>, io.realm.RealmObjectSchema> r1 = r5.classToSchema
            r1.put(r6, r0)
        L3f:
            return r0
    }

    public final io.realm.RealmObjectSchema getSchemaForClass(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = io.realm.internal.Table.getTableNameForClass(r4)
            java.util.Map<java.lang.String, io.realm.RealmObjectSchema> r1 = r3.dynamicClassToSchema
            java.lang.Object r1 = r1.get(r0)
            io.realm.RealmObjectSchema r1 = (io.realm.RealmObjectSchema) r1
            if (r1 == 0) goto L20
            io.realm.internal.Table r2 = r1.table
            boolean r2 = r2.isValid()
            if (r2 == 0) goto L20
            java.lang.String r2 = r1.getClassName()
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L3c
        L20:
            io.realm.BaseRealm r1 = r3.realm
            io.realm.internal.OsSharedRealm r1 = r1.sharedRealm
            boolean r1 = r1.hasTable(r0)
            if (r1 == 0) goto L3d
            io.realm.ImmutableRealmObjectSchema r1 = new io.realm.ImmutableRealmObjectSchema
            io.realm.BaseRealm r4 = r3.realm
            io.realm.internal.OsSharedRealm r2 = r4.sharedRealm
            io.realm.internal.Table r2 = r2.getTable(r0)
            r1.<init>(r4, r3, r2)
            java.util.Map<java.lang.String, io.realm.RealmObjectSchema> r4 = r3.dynamicClassToSchema
            r4.put(r0, r1)
        L3c:
            return r1
        L3d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The class "
            java.lang.String r2 = " doesn't exist in this Realm."
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r4, r2)
            r0.<init>(r4)
            throw r0
    }

    public final io.realm.internal.Table getTable(java.lang.Class<? extends io.realm.RealmModel> r4) {
            r3 = this;
            java.util.Map<java.lang.Class<? extends io.realm.RealmModel>, io.realm.internal.Table> r0 = r3.classToTable
            java.lang.Object r0 = r0.get(r4)
            io.realm.internal.Table r0 = (io.realm.internal.Table) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            java.lang.Class r1 = io.realm.internal.Util.getOriginalModelClass(r4)
            boolean r2 = r3.isProxyClass(r1, r4)
            if (r2 == 0) goto L1d
            java.util.Map<java.lang.Class<? extends io.realm.RealmModel>, io.realm.internal.Table> r0 = r3.classToTable
            java.lang.Object r0 = r0.get(r1)
            io.realm.internal.Table r0 = (io.realm.internal.Table) r0
        L1d:
            if (r0 != 0) goto L3e
            io.realm.BaseRealm r0 = r3.realm
            io.realm.RealmConfiguration r0 = r0.getConfiguration()
            io.realm.internal.RealmProxyMediator r0 = r0.getSchemaMediator()
            java.lang.String r0 = r0.getSimpleClassName(r1)
            java.lang.String r0 = io.realm.internal.Table.getTableNameForClass(r0)
            io.realm.BaseRealm r2 = r3.realm
            io.realm.internal.OsSharedRealm r2 = r2.sharedRealm
            io.realm.internal.Table r0 = r2.getTable(r0)
            java.util.Map<java.lang.Class<? extends io.realm.RealmModel>, io.realm.internal.Table> r2 = r3.classToTable
            r2.put(r1, r0)
        L3e:
            boolean r1 = r3.isProxyClass(r1, r4)
            if (r1 == 0) goto L49
            java.util.Map<java.lang.Class<? extends io.realm.RealmModel>, io.realm.internal.Table> r1 = r3.classToTable
            r1.put(r4, r0)
        L49:
            return r0
    }

    public final io.realm.internal.Table getTable(java.lang.String r3) {
            r2 = this;
            java.lang.String r3 = io.realm.internal.Table.getTableNameForClass(r3)
            java.util.Map<java.lang.String, io.realm.internal.Table> r0 = r2.dynamicClassToTable
            java.lang.Object r0 = r0.get(r3)
            io.realm.internal.Table r0 = (io.realm.internal.Table) r0
            if (r0 == 0) goto Lf
            return r0
        Lf:
            io.realm.BaseRealm r0 = r2.realm
            io.realm.internal.OsSharedRealm r0 = r0.sharedRealm
            io.realm.internal.Table r0 = r0.getTable(r3)
            java.util.Map<java.lang.String, io.realm.internal.Table> r1 = r2.dynamicClassToTable
            r1.put(r3, r0)
            return r0
    }

    public final void putToClassNameToSchemaMap(java.lang.String r2, io.realm.RealmObjectSchema r3) {
            r1 = this;
            java.util.Map<java.lang.String, io.realm.RealmObjectSchema> r0 = r1.dynamicClassToSchema
            r0.put(r2, r3)
            return
    }

    public final void refresh() {
            r1 = this;
            io.realm.internal.ColumnIndices r0 = r1.columnIndices
            if (r0 == 0) goto L7
            r0.refresh()
        L7:
            java.util.Map<java.lang.String, io.realm.internal.Table> r0 = r1.dynamicClassToTable
            r0.clear()
            java.util.Map<java.lang.Class<? extends io.realm.RealmModel>, io.realm.internal.Table> r0 = r1.classToTable
            r0.clear()
            java.util.Map<java.lang.Class<? extends io.realm.RealmModel>, io.realm.RealmObjectSchema> r0 = r1.classToSchema
            r0.clear()
            java.util.Map<java.lang.String, io.realm.RealmObjectSchema> r0 = r1.dynamicClassToSchema
            r0.clear()
            return
    }

    public abstract void remove(java.lang.String r1);

    public final io.realm.RealmObjectSchema removeFromClassNameToSchemaMap(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, io.realm.RealmObjectSchema> r0 = r1.dynamicClassToSchema
            java.lang.Object r2 = r0.remove(r2)
            io.realm.RealmObjectSchema r2 = (io.realm.RealmObjectSchema) r2
            return r2
    }

    public abstract io.realm.RealmObjectSchema rename(java.lang.String r1, java.lang.String r2);
}
