package io.realm;

/* JADX INFO: loaded from: classes3.dex */
class MutableRealmSchema extends io.realm.RealmSchema {
    public MutableRealmSchema(io.realm.BaseRealm r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    private java.lang.String checkAndGetTableNameFromClassName(java.lang.String r6) {
            r5 = this;
            int r0 = r6.length()
            int r1 = io.realm.internal.Table.CLASS_NAME_MAX_LENGTH
            if (r0 > r1) goto Ld
            java.lang.String r6 = io.realm.internal.Table.getTableNameForClass(r6)
            return r6
        Ld:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.util.Locale r2 = java.util.Locale.US
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3[r4] = r1
            r1 = 1
            int r6 = r6.length()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3[r1] = r6
            java.lang.String r6 = "Class name is too long. Limit is %1$d characters: %2$s"
            java.lang.String r6 = java.lang.String.format(r2, r6, r3)
            r0.<init>(r6)
            throw r0
    }

    @Override // io.realm.RealmSchema
    public io.realm.RealmObjectSchema create(java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = "Null or empty class names are not allowed"
            r5.checkNotEmpty(r6, r0)
            java.lang.String r0 = io.realm.internal.Table.getTableNameForClass(r6)
            int r1 = r6.length()
            int r2 = io.realm.internal.Table.CLASS_NAME_MAX_LENGTH
            if (r1 > r2) goto L1f
            io.realm.MutableRealmObjectSchema r6 = new io.realm.MutableRealmObjectSchema
            io.realm.BaseRealm r1 = r5.realm
            io.realm.internal.OsSharedRealm r2 = r1.sharedRealm
            io.realm.internal.Table r0 = r2.createTable(r0)
            r6.<init>(r1, r5, r0)
            return r6
        L1f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.util.Locale r1 = java.util.Locale.US
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3[r4] = r2
            r2 = 1
            int r6 = r6.length()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3[r2] = r6
            java.lang.String r6 = "Class name is too long. Limit is %1$d characters: %2$s"
            java.lang.String r6 = java.lang.String.format(r1, r6, r3)
            r0.<init>(r6)
            throw r0
    }

    @Override // io.realm.RealmSchema
    public io.realm.RealmObjectSchema createWithPrimaryKeyField(java.lang.String r5, java.lang.String r6, java.lang.Class<?> r7, io.realm.FieldAttribute... r8) {
            r4 = this;
            java.lang.String r0 = "Null or empty class names are not allowed"
            r4.checkNotEmpty(r5, r0)
            io.realm.RealmObjectSchema.checkLegalName(r6)
            java.lang.String r5 = r4.checkAndGetTableNameFromClassName(r5)
            java.util.Map<java.lang.Class<?>, io.realm.RealmObjectSchema$FieldMetaData> r0 = io.realm.RealmObjectSchema.SUPPORTED_LIST_SIMPLE_FIELDS
            java.lang.Object r0 = r0.get(r7)
            io.realm.RealmObjectSchema$FieldMetaData r0 = (io.realm.RealmObjectSchema.FieldMetaData) r0
            r1 = 0
            if (r0 == 0) goto L41
            io.realm.RealmFieldType r2 = r0.fieldType
            io.realm.RealmFieldType r3 = io.realm.RealmFieldType.STRING
            if (r2 == r3) goto L25
            io.realm.RealmFieldType r3 = io.realm.RealmFieldType.INTEGER
            if (r2 == r3) goto L25
            io.realm.RealmFieldType r3 = io.realm.RealmFieldType.OBJECT_ID
            if (r2 != r3) goto L41
        L25:
            boolean r7 = r0.defaultNullable
            io.realm.FieldAttribute r2 = io.realm.FieldAttribute.REQUIRED
            boolean r8 = io.realm.MutableRealmObjectSchema.containsAttribute(r8, r2)
            if (r8 == 0) goto L30
            goto L31
        L30:
            r1 = r7
        L31:
            io.realm.MutableRealmObjectSchema r7 = new io.realm.MutableRealmObjectSchema
            io.realm.BaseRealm r8 = r4.realm
            io.realm.internal.OsSharedRealm r2 = r8.sharedRealm
            io.realm.RealmFieldType r0 = r0.fieldType
            io.realm.internal.Table r5 = r2.createTableWithPrimaryKey(r5, r6, r0, r1)
            r7.<init>(r8, r4, r5)
            return r7
        L41:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r1] = r7
            java.lang.String r7 = "Realm doesn't support primary key field type '%s'."
            java.lang.String r6 = java.lang.String.format(r7, r6)
            r5.<init>(r6)
            throw r5
    }

    @Override // io.realm.RealmSchema
    public io.realm.RealmObjectSchema get(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "Null or empty class names are not allowed"
            r2.checkNotEmpty(r3, r0)
            java.lang.String r3 = io.realm.internal.Table.getTableNameForClass(r3)
            io.realm.BaseRealm r0 = r2.realm
            io.realm.internal.OsSharedRealm r0 = r0.sharedRealm
            boolean r0 = r0.hasTable(r3)
            if (r0 != 0) goto L15
            r3 = 0
            return r3
        L15:
            io.realm.BaseRealm r0 = r2.realm
            io.realm.internal.OsSharedRealm r0 = r0.sharedRealm
            io.realm.internal.Table r3 = r0.getTable(r3)
            io.realm.MutableRealmObjectSchema r0 = new io.realm.MutableRealmObjectSchema
            io.realm.BaseRealm r1 = r2.realm
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // io.realm.RealmSchema
    public java.util.Set<io.realm.RealmObjectSchema> getAll() {
            r5 = this;
            io.realm.BaseRealm r0 = r5.realm
            io.realm.internal.OsSharedRealm r0 = r0.sharedRealm
            java.lang.String[] r0 = r0.getTablesNames()
            int r1 = r0.length
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>(r1)
            r3 = 0
        Lf:
            if (r3 >= r1) goto L23
            r4 = r0[r3]
            java.lang.String r4 = io.realm.internal.Table.getClassNameForTable(r4)
            io.realm.RealmObjectSchema r4 = r5.get(r4)
            if (r4 == 0) goto L20
            r2.add(r4)
        L20:
            int r3 = r3 + 1
            goto Lf
        L23:
            return r2
    }

    @Override // io.realm.RealmSchema
    public void remove(java.lang.String r3) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkNotInSync()
            java.lang.String r0 = "Null or empty class names are not allowed"
            r2.checkNotEmpty(r3, r0)
            java.lang.String r0 = io.realm.internal.Table.getTableNameForClass(r3)
            io.realm.BaseRealm r1 = r2.realm
            io.realm.internal.OsSharedRealm r1 = r1.sharedRealm
            boolean r1 = io.realm.internal.OsObjectStore.deleteTableForObject(r1, r3)
            if (r1 == 0) goto L1c
            r2.removeFromClassNameToSchemaMap(r0)
            return
        L1c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot remove class because it is not in this Realm: "
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3)
            r0.<init>(r3)
            throw r0
    }

    @Override // io.realm.RealmSchema
    public io.realm.RealmObjectSchema rename(java.lang.String r6, java.lang.String r7) {
            r5 = this;
            io.realm.BaseRealm r0 = r5.realm
            r0.checkNotInSync()
            java.lang.String r0 = "Class names cannot be empty or null"
            r5.checkNotEmpty(r6, r0)
            r5.checkNotEmpty(r7, r0)
            java.lang.String r0 = io.realm.internal.Table.getTableNameForClass(r6)
            java.lang.String r1 = io.realm.internal.Table.getTableNameForClass(r7)
            java.lang.String r2 = "Cannot rename class because it doesn't exist in this Realm: "
            java.lang.String r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r6)
            java.lang.String r3 = io.realm.internal.Table.getTableNameForClass(r6)
            io.realm.BaseRealm r4 = r5.realm
            io.realm.internal.OsSharedRealm r4 = r4.sharedRealm
            boolean r3 = r4.hasTable(r3)
            if (r3 == 0) goto L71
            io.realm.BaseRealm r2 = r5.realm
            io.realm.internal.OsSharedRealm r2 = r2.sharedRealm
            boolean r2 = r2.hasTable(r1)
            if (r2 != 0) goto L65
            io.realm.BaseRealm r6 = r5.realm
            io.realm.internal.OsSharedRealm r6 = r6.sharedRealm
            r6.renameTable(r0, r1)
            io.realm.BaseRealm r6 = r5.realm
            io.realm.internal.OsSharedRealm r6 = r6.sharedRealm
            io.realm.internal.Table r6 = r6.getTable(r1)
            io.realm.RealmObjectSchema r0 = r5.removeFromClassNameToSchemaMap(r0)
            if (r0 == 0) goto L5a
            io.realm.internal.Table r2 = r0.table
            boolean r2 = r2.isValid()
            if (r2 == 0) goto L5a
            java.lang.String r2 = r0.getClassName()
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L61
        L5a:
            io.realm.MutableRealmObjectSchema r0 = new io.realm.MutableRealmObjectSchema
            io.realm.BaseRealm r7 = r5.realm
            r0.<init>(r7, r5, r6)
        L61:
            r5.putToClassNameToSchemaMap(r1, r0)
            return r0
        L65:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = " cannot be renamed because the new class already exists: "
            java.lang.String r6 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6, r1, r7)
            r0.<init>(r6)
            throw r0
        L71:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>(r2)
            throw r6
    }
}
