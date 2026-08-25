package io.realm;

/* JADX INFO: loaded from: classes.dex */
class MutableRealmObjectSchema extends io.realm.RealmObjectSchema {

    /* JADX INFO: renamed from: io.realm.MutableRealmObjectSchema$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$io$realm$RealmFieldType = null;

        static {
                io.realm.RealmFieldType[] r0 = io.realm.RealmFieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.realm.MutableRealmObjectSchema.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType = r0
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.BOOLEAN     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.realm.MutableRealmObjectSchema.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L1d
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DATE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }
    }

    public MutableRealmObjectSchema(io.realm.BaseRealm r1, io.realm.RealmSchema r2, io.realm.internal.Table r3) {
            r0 = this;
            io.realm.RealmObjectSchema$DynamicColumnIndices r2 = new io.realm.RealmObjectSchema$DynamicColumnIndices
            r2.<init>(r3)
            r0.<init>(r1, r3, r2)
            return
    }

    private void addModifiers(java.lang.String r4, io.realm.FieldAttribute[] r5) {
            r3 = this;
            if (r5 == 0) goto L2d
            r0 = 0
            int r1 = r5.length     // Catch: java.lang.Exception -> L1e
            if (r1 <= 0) goto L2d
            io.realm.FieldAttribute r1 = io.realm.FieldAttribute.INDEXED     // Catch: java.lang.Exception -> L1e
            boolean r1 = containsAttribute(r5, r1)     // Catch: java.lang.Exception -> L1e
            if (r1 == 0) goto L12
            r3.addIndex(r4)     // Catch: java.lang.Exception -> L1e
            r0 = 1
        L12:
            io.realm.FieldAttribute r1 = io.realm.FieldAttribute.PRIMARY_KEY     // Catch: java.lang.Exception -> L1e
            boolean r5 = containsAttribute(r5, r1)     // Catch: java.lang.Exception -> L1e
            if (r5 == 0) goto L2d
            r3.addPrimaryKey(r4)     // Catch: java.lang.Exception -> L1e
            goto L2d
        L1e:
            r5 = move-exception
            long r1 = r3.getColumnKey(r4)
            if (r0 == 0) goto L2a
            io.realm.internal.Table r4 = r3.table
            r4.removeSearchIndex(r1)
        L2a:
            java.lang.RuntimeException r5 = (java.lang.RuntimeException) r5
            throw r5
        L2d:
            return
    }

    private void checkAddPrimaryKeyForSync() {
            r1 = this;
            io.realm.BaseRealm r0 = r1.realm
            io.realm.RealmConfiguration r0 = r0.configuration
            java.util.Objects.requireNonNull(r0)
            return
    }

    private void checkEmpty(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto L9
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L9
            return
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Null or empty class names are not allowed"
            r2.<init>(r0)
            throw r2
    }

    private void checkFieldNameIsAvailable(java.lang.String r6) {
            r5 = this;
            io.realm.internal.Table r0 = r5.table
            long r0 = r0.getColumnKey(r6)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Ld
            return
        Ld:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Field already exists in '"
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r2 = r5.getClassName()
            r1.append(r2)
            java.lang.String r2 = "': "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
    }

    private void checkForObjectStoreInvalidPrimaryKeyTypes(java.lang.String r2, io.realm.RealmFieldType r3) {
            r1 = this;
            int[] r0 = io.realm.MutableRealmObjectSchema.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType
            int r3 = r3.ordinal()
            r3 = r0[r3]
            r0 = 1
            if (r3 == r0) goto L1b
            r0 = 2
            if (r3 == r0) goto Lf
            return
        Lf:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Date fields cannot be marked as primary keys: "
            java.lang.String r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r2)
            r3.<init>(r2)
            throw r3
        L1b:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Boolean fields cannot be marked as primary keys: "
            java.lang.String r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r2)
            r3.<init>(r2)
            throw r3
    }

    private void checkForObjectStoreInvalidPrimaryKeyTypes(java.lang.String r2, java.lang.Class<?> r3) {
            r1 = this;
            java.lang.Class r0 = java.lang.Boolean.TYPE
            if (r3 == r0) goto L8
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            if (r3 != r0) goto Ld
        L8:
            io.realm.RealmFieldType r0 = io.realm.RealmFieldType.BOOLEAN
            r1.checkForObjectStoreInvalidPrimaryKeyTypes(r2, r0)
        Ld:
            java.lang.Class<java.util.Date> r0 = java.util.Date.class
            if (r3 != r0) goto L16
            io.realm.RealmFieldType r3 = io.realm.RealmFieldType.DATE
            r1.checkForObjectStoreInvalidPrimaryKeyTypes(r2, r3)
        L16:
            return
    }

    private void checkNewFieldName(java.lang.String r1) {
            r0 = this;
            io.realm.RealmObjectSchema.checkLegalName(r1)
            r0.checkFieldNameIsAvailable(r1)
            return
    }

    public static boolean containsAttribute(io.realm.FieldAttribute[] r4, io.realm.FieldAttribute r5) {
            r0 = 0
            if (r4 == 0) goto L14
            int r1 = r4.length
            if (r1 != 0) goto L7
            goto L14
        L7:
            int r1 = r4.length
            r2 = 0
        L9:
            if (r2 >= r1) goto L14
            r3 = r4[r2]
            if (r3 != r5) goto L11
            r4 = 1
            return r4
        L11:
            int r2 = r2 + 1
            goto L9
        L14:
            return r0
    }

    @Override // io.realm.RealmObjectSchema
    public io.realm.RealmObjectSchema addField(java.lang.String r5, java.lang.Class<?> r6, io.realm.FieldAttribute... r7) {
            r4 = this;
            java.util.Map<java.lang.Class<?>, io.realm.RealmObjectSchema$FieldMetaData> r0 = io.realm.RealmObjectSchema.SUPPORTED_LIST_SIMPLE_FIELDS
            java.lang.Object r0 = r0.get(r6)
            io.realm.RealmObjectSchema$FieldMetaData r0 = (io.realm.RealmObjectSchema.FieldMetaData) r0
            r1 = 0
            if (r0 != 0) goto L51
            java.util.Map<java.lang.Class<?>, io.realm.RealmObjectSchema$FieldMetaData> r7 = io.realm.RealmObjectSchema.SUPPORTED_LINKED_FIELDS
            boolean r7 = r7.containsKey(r6)
            if (r7 != 0) goto L45
            java.lang.Class<io.realm.RealmModel> r7 = io.realm.RealmModel.class
            boolean r7 = r7.isAssignableFrom(r6)
            r0 = 1
            r2 = 2
            if (r7 == 0) goto L31
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.util.Locale r3 = java.util.Locale.US
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r5
            r2[r0] = r6
            java.lang.String r5 = "Use 'addRealmObjectField()' instead to add fields that link to other RealmObjects: %s(%s)"
            java.lang.String r5 = java.lang.String.format(r3, r5, r2)
            r7.<init>(r5)
            throw r7
        L31:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.util.Locale r3 = java.util.Locale.US
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r5
            r2[r0] = r6
            java.lang.String r5 = "Realm doesn't support this field type: %s(%s)"
            java.lang.String r5 = java.lang.String.format(r3, r5, r2)
            r7.<init>(r5)
            throw r7
        L45:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Use addRealmObjectField() instead to add fields that link to other RealmObjects: "
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r7, r5)
            r6.<init>(r5)
            throw r6
        L51:
            io.realm.FieldAttribute r2 = io.realm.FieldAttribute.PRIMARY_KEY
            boolean r2 = containsAttribute(r7, r2)
            if (r2 == 0) goto L5f
            r4.checkAddPrimaryKeyForSync()
            r4.checkForObjectStoreInvalidPrimaryKeyTypes(r5, r6)
        L5f:
            r4.checkNewFieldName(r5)
            boolean r6 = r0.defaultNullable
            io.realm.FieldAttribute r2 = io.realm.FieldAttribute.REQUIRED
            boolean r2 = containsAttribute(r7, r2)
            if (r2 == 0) goto L6d
            goto L6e
        L6d:
            r1 = r6
        L6e:
            io.realm.internal.Table r6 = r4.table
            io.realm.RealmFieldType r0 = r0.fieldType
            long r0 = r6.addColumn(r0, r5, r1)
            r4.addModifiers(r5, r7)     // Catch: java.lang.Exception -> L7a
            return r4
        L7a:
            r5 = move-exception
            io.realm.internal.Table r6 = r4.table
            r6.removeColumn(r0)
            throw r5
    }

    @Override // io.realm.RealmObjectSchema
    public io.realm.RealmObjectSchema addIndex(java.lang.String r4) {
            r3 = this;
            io.realm.RealmObjectSchema.checkLegalName(r4)
            r3.checkFieldExists(r4)
            long r0 = r3.getColumnKey(r4)
            io.realm.internal.Table r2 = r3.table
            boolean r2 = r2.hasSearchIndex(r0)
            if (r2 != 0) goto L18
            io.realm.internal.Table r4 = r3.table
            r4.addSearchIndex(r0)
            return r3
        L18:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = " already has an index."
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4, r1)
            r0.<init>(r4)
            throw r0
    }

    @Override // io.realm.RealmObjectSchema
    public io.realm.RealmObjectSchema addPrimaryKey(java.lang.String r5) {
            r4 = this;
            r4.checkAddPrimaryKeyForSync()
            io.realm.RealmObjectSchema.checkLegalName(r5)
            r4.checkFieldExists(r5)
            io.realm.BaseRealm r0 = r4.realm
            io.realm.internal.OsSharedRealm r0 = r0.sharedRealm
            java.lang.String r1 = r4.getClassName()
            java.lang.String r0 = io.realm.internal.OsObjectStore.getPrimaryKeyForObject(r0, r1)
            if (r0 != 0) goto L3f
            long r0 = r4.getColumnKey(r5)
            io.realm.RealmFieldType r2 = r4.getFieldType(r5)
            r4.checkForObjectStoreInvalidPrimaryKeyTypes(r5, r2)
            io.realm.RealmFieldType r3 = io.realm.RealmFieldType.STRING
            if (r2 == r3) goto L33
            io.realm.internal.Table r2 = r4.table
            boolean r2 = r2.hasSearchIndex(r0)
            if (r2 != 0) goto L33
            io.realm.internal.Table r2 = r4.table
            r2.addSearchIndex(r0)
        L33:
            io.realm.BaseRealm r0 = r4.realm
            io.realm.internal.OsSharedRealm r0 = r0.sharedRealm
            java.lang.String r1 = r4.getClassName()
            io.realm.internal.OsObjectStore.setPrimaryKeyForObject(r0, r1, r5)
            return r4
        L3f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.util.Locale r1 = java.util.Locale.ENGLISH
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            java.lang.String r0 = "Field '%s' has been already defined as primary key."
            java.lang.String r0 = java.lang.String.format(r1, r0, r2)
            r5.<init>(r0)
            throw r5
    }

    @Override // io.realm.RealmObjectSchema
    public io.realm.RealmObjectSchema addRealmDictionaryField(java.lang.String r4, io.realm.RealmObjectSchema r5) {
            r3 = this;
            io.realm.RealmObjectSchema.checkLegalName(r4)
            r3.checkFieldNameIsAvailable(r4)
            io.realm.internal.Table r0 = r3.table
            io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_LINK_MAP
            io.realm.BaseRealm r2 = r3.realm
            io.realm.internal.OsSharedRealm r2 = r2.sharedRealm
            java.lang.String r5 = r5.getClassName()
            java.lang.String r5 = io.realm.internal.Table.getTableNameForClass(r5)
            io.realm.internal.Table r5 = r2.getTable(r5)
            r0.addColumnDictionaryLink(r1, r4, r5)
            return r3
    }

    @Override // io.realm.RealmObjectSchema
    public io.realm.RealmObjectSchema addRealmDictionaryField(java.lang.String r5, java.lang.Class<?> r6) {
            r4 = this;
            io.realm.RealmObjectSchema.checkLegalName(r5)
            r4.checkFieldNameIsAvailable(r5)
            java.util.Map<java.lang.Class<?>, io.realm.RealmObjectSchema$FieldMetaData> r0 = io.realm.RealmObjectSchema.SUPPORTED_DICTIONARY_SIMPLE_FIELDS
            java.lang.Object r0 = r0.get(r6)
            io.realm.RealmObjectSchema$FieldMetaData r0 = (io.realm.RealmObjectSchema.FieldMetaData) r0
            if (r0 != 0) goto L44
            java.lang.Class<io.realm.RealmObjectSchema> r0 = io.realm.RealmObjectSchema.class
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L38
            java.lang.Class<io.realm.RealmModel> r0 = io.realm.RealmModel.class
            boolean r0 = r0.isAssignableFrom(r6)
            if (r0 == 0) goto L21
            goto L38
        L21:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.util.Locale r1 = java.util.Locale.US
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r6
            java.lang.String r5 = "RealmDictionary does not support dictionaries with this type: %s(%s)"
            java.lang.String r5 = java.lang.String.format(r1, r5, r2)
            r0.<init>(r5)
            throw r0
        L38:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Use 'addRealmDictionaryField(String name, RealmObjectSchema schema)' instead to add dictionaries that link to other RealmObjects: "
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r5)
            r6.<init>(r5)
            throw r6
        L44:
            io.realm.internal.Table r6 = r4.table
            io.realm.RealmFieldType r1 = r0.collectionType
            boolean r0 = r0.defaultNullable
            r6.addColumn(r1, r5, r0)
            return r4
    }

    @Override // io.realm.RealmObjectSchema
    public io.realm.RealmObjectSchema addRealmListField(java.lang.String r4, io.realm.RealmObjectSchema r5) {
            r3 = this;
            io.realm.RealmObjectSchema.checkLegalName(r4)
            r3.checkFieldNameIsAvailable(r4)
            io.realm.internal.Table r0 = r3.table
            io.realm.RealmFieldType r1 = io.realm.RealmFieldType.LIST
            io.realm.BaseRealm r2 = r3.realm
            io.realm.internal.OsSharedRealm r2 = r2.sharedRealm
            java.lang.String r5 = r5.getClassName()
            java.lang.String r5 = io.realm.internal.Table.getTableNameForClass(r5)
            io.realm.internal.Table r5 = r2.getTable(r5)
            r0.addColumnLink(r1, r4, r5)
            return r3
    }

    @Override // io.realm.RealmObjectSchema
    public io.realm.RealmObjectSchema addRealmListField(java.lang.String r5, java.lang.Class<?> r6) {
            r4 = this;
            io.realm.RealmObjectSchema.checkLegalName(r5)
            r4.checkFieldNameIsAvailable(r5)
            java.util.Map<java.lang.Class<?>, io.realm.RealmObjectSchema$FieldMetaData> r0 = io.realm.RealmObjectSchema.SUPPORTED_LIST_SIMPLE_FIELDS
            java.lang.Object r0 = r0.get(r6)
            io.realm.RealmObjectSchema$FieldMetaData r0 = (io.realm.RealmObjectSchema.FieldMetaData) r0
            if (r0 != 0) goto L44
            java.lang.Class<io.realm.RealmObjectSchema> r0 = io.realm.RealmObjectSchema.class
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L38
            java.lang.Class<io.realm.RealmModel> r0 = io.realm.RealmModel.class
            boolean r0 = r0.isAssignableFrom(r6)
            if (r0 == 0) goto L21
            goto L38
        L21:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.util.Locale r1 = java.util.Locale.US
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r6
            java.lang.String r5 = "RealmList does not support lists with this type: %s(%s)"
            java.lang.String r5 = java.lang.String.format(r1, r5, r2)
            r0.<init>(r5)
            throw r0
        L38:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Use 'addRealmListField(String name, RealmObjectSchema schema)' instead to add lists that link to other RealmObjects: "
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r5)
            r6.<init>(r5)
            throw r6
        L44:
            io.realm.internal.Table r6 = r4.table
            io.realm.RealmFieldType r1 = r0.collectionType
            boolean r0 = r0.defaultNullable
            r6.addColumn(r1, r5, r0)
            return r4
    }

    @Override // io.realm.RealmObjectSchema
    public io.realm.RealmObjectSchema addRealmObjectField(java.lang.String r4, io.realm.RealmObjectSchema r5) {
            r3 = this;
            io.realm.RealmObjectSchema.checkLegalName(r4)
            r3.checkFieldNameIsAvailable(r4)
            io.realm.internal.Table r0 = r3.table
            io.realm.RealmFieldType r1 = io.realm.RealmFieldType.OBJECT
            io.realm.BaseRealm r2 = r3.realm
            io.realm.internal.OsSharedRealm r2 = r2.sharedRealm
            java.lang.String r5 = r5.getClassName()
            java.lang.String r5 = io.realm.internal.Table.getTableNameForClass(r5)
            io.realm.internal.Table r5 = r2.getTable(r5)
            r0.addColumnLink(r1, r4, r5)
            return r3
    }

    @Override // io.realm.RealmObjectSchema
    public io.realm.RealmObjectSchema addRealmSetField(java.lang.String r4, io.realm.RealmObjectSchema r5) {
            r3 = this;
            io.realm.RealmObjectSchema.checkLegalName(r4)
            r3.checkFieldNameIsAvailable(r4)
            io.realm.internal.Table r0 = r3.table
            io.realm.RealmFieldType r1 = io.realm.RealmFieldType.LINK_SET
            io.realm.BaseRealm r2 = r3.realm
            io.realm.internal.OsSharedRealm r2 = r2.sharedRealm
            java.lang.String r5 = r5.getClassName()
            java.lang.String r5 = io.realm.internal.Table.getTableNameForClass(r5)
            io.realm.internal.Table r5 = r2.getTable(r5)
            r0.addColumnSetLink(r1, r4, r5)
            return r3
    }

    @Override // io.realm.RealmObjectSchema
    public io.realm.RealmObjectSchema addRealmSetField(java.lang.String r5, java.lang.Class<?> r6) {
            r4 = this;
            io.realm.RealmObjectSchema.checkLegalName(r5)
            r4.checkFieldNameIsAvailable(r5)
            java.util.Map<java.lang.Class<?>, io.realm.RealmObjectSchema$FieldMetaData> r0 = io.realm.RealmObjectSchema.SUPPORTED_SET_SIMPLE_FIELDS
            java.lang.Object r0 = r0.get(r6)
            io.realm.RealmObjectSchema$FieldMetaData r0 = (io.realm.RealmObjectSchema.FieldMetaData) r0
            if (r0 != 0) goto L44
            java.lang.Class<io.realm.RealmObjectSchema> r0 = io.realm.RealmObjectSchema.class
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L38
            java.lang.Class<io.realm.RealmModel> r0 = io.realm.RealmModel.class
            boolean r0 = r0.isAssignableFrom(r6)
            if (r0 == 0) goto L21
            goto L38
        L21:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.util.Locale r1 = java.util.Locale.US
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r6
            java.lang.String r5 = "RealmSet does not support sets with this type: %s(%s)"
            java.lang.String r5 = java.lang.String.format(r1, r5, r2)
            r0.<init>(r5)
            throw r0
        L38:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Use 'addRealmSetField(String name, RealmObjectSchema schema)' instead to add sets that link to other RealmObjects: "
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r5)
            r6.<init>(r5)
            throw r6
        L44:
            io.realm.internal.Table r6 = r4.table
            io.realm.RealmFieldType r1 = r0.collectionType
            boolean r0 = r0.defaultNullable
            r6.addColumn(r1, r5, r0)
            return r4
    }

    @Override // io.realm.RealmObjectSchema
    public final java.lang.String getPropertyClassName(java.lang.String r4) {
            r3 = this;
            io.realm.internal.Table r0 = r3.table
            long r1 = r3.getColumnKey(r4)
            io.realm.internal.Table r0 = r0.getLinkTarget(r1)
            java.lang.String r0 = r0.getClassName()
            boolean r1 = io.realm.internal.Util.isEmptyString(r0)
            if (r1 != 0) goto L15
            return r0
        L15:
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
    public io.realm.RealmObjectSchema removeField(java.lang.String r5) {
            r4 = this;
            io.realm.BaseRealm r0 = r4.realm
            r0.checkNotInSync()
            io.realm.RealmObjectSchema.checkLegalName(r5)
            boolean r0 = r4.hasField(r5)
            if (r0 == 0) goto L31
            long r0 = r4.getColumnKey(r5)
            java.lang.String r2 = r4.getClassName()
            io.realm.BaseRealm r3 = r4.realm
            io.realm.internal.OsSharedRealm r3 = r3.sharedRealm
            java.lang.String r3 = io.realm.internal.OsObjectStore.getPrimaryKeyForObject(r3, r2)
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L2b
            io.realm.BaseRealm r3 = r4.realm
            io.realm.internal.OsSharedRealm r3 = r3.sharedRealm
            io.realm.internal.OsObjectStore.setPrimaryKeyForObject(r3, r2, r5)
        L2b:
            io.realm.internal.Table r5 = r4.table
            r5.removeColumn(r0)
            return r4
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = " does not exist."
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5, r1)
            r0.<init>(r5)
            throw r0
    }

    @Override // io.realm.RealmObjectSchema
    public io.realm.RealmObjectSchema removeIndex(java.lang.String r4) {
            r3 = this;
            io.realm.BaseRealm r0 = r3.realm
            r0.checkNotInSync()
            io.realm.RealmObjectSchema.checkLegalName(r4)
            r3.checkFieldExists(r4)
            long r0 = r3.getColumnKey(r4)
            io.realm.internal.Table r2 = r3.table
            boolean r2 = r2.hasSearchIndex(r0)
            if (r2 == 0) goto L1d
            io.realm.internal.Table r4 = r3.table
            r4.removeSearchIndex(r0)
            return r3
        L1d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Field is not indexed: "
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r4)
            r0.<init>(r4)
            throw r0
    }

    @Override // io.realm.RealmObjectSchema
    public io.realm.RealmObjectSchema removePrimaryKey() {
            r3 = this;
            io.realm.BaseRealm r0 = r3.realm
            r0.checkNotInSync()
            io.realm.BaseRealm r0 = r3.realm
            io.realm.internal.OsSharedRealm r0 = r0.sharedRealm
            java.lang.String r1 = r3.getClassName()
            java.lang.String r0 = io.realm.internal.OsObjectStore.getPrimaryKeyForObject(r0, r1)
            if (r0 == 0) goto L33
            io.realm.internal.Table r1 = r3.table
            long r0 = r1.getColumnKey(r0)
            io.realm.internal.Table r2 = r3.table
            boolean r2 = r2.hasSearchIndex(r0)
            if (r2 == 0) goto L26
            io.realm.internal.Table r2 = r3.table
            r2.removeSearchIndex(r0)
        L26:
            io.realm.BaseRealm r0 = r3.realm
            io.realm.internal.OsSharedRealm r0 = r0.sharedRealm
            java.lang.String r1 = r3.getClassName()
            r2 = 0
            io.realm.internal.OsObjectStore.setPrimaryKeyForObject(r0, r1, r2)
            return r3
        L33:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.getClassName()
            r1.append(r2)
            java.lang.String r2 = " doesn't have a primary key."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // io.realm.RealmObjectSchema
    public io.realm.RealmObjectSchema renameField(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkNotInSync()
            io.realm.RealmObjectSchema.checkLegalName(r3)
            r2.checkFieldExists(r3)
            io.realm.RealmObjectSchema.checkLegalName(r4)
            r2.checkFieldNameIsAvailable(r4)
            long r0 = r2.getColumnKey(r3)
            io.realm.internal.Table r3 = r2.table
            r3.renameColumn(r0, r4)
            return r2
    }

    @Override // io.realm.RealmObjectSchema
    public io.realm.RealmObjectSchema setClassName(java.lang.String r7) {
            r6 = this;
            io.realm.BaseRealm r0 = r6.realm
            r0.checkNotInSync()
            r6.checkEmpty(r7)
            java.lang.String r0 = io.realm.internal.Table.getTableNameForClass(r7)
            int r1 = r7.length()
            int r2 = io.realm.internal.Table.CLASS_NAME_MAX_LENGTH
            if (r1 > r2) goto L69
            io.realm.BaseRealm r1 = r6.realm
            io.realm.internal.OsSharedRealm r1 = r1.sharedRealm
            boolean r1 = r1.hasTable(r0)
            if (r1 != 0) goto L5d
            io.realm.internal.Table r1 = r6.table
            java.lang.String r1 = r1.getName()
            io.realm.internal.Table r2 = r6.table
            java.lang.String r2 = r2.getClassName()
            io.realm.BaseRealm r3 = r6.realm
            io.realm.internal.OsSharedRealm r3 = r3.sharedRealm
            java.lang.String r3 = io.realm.internal.OsObjectStore.getPrimaryKeyForObject(r3, r2)
            if (r3 == 0) goto L3c
            io.realm.BaseRealm r4 = r6.realm
            io.realm.internal.OsSharedRealm r4 = r4.sharedRealm
            r5 = 0
            io.realm.internal.OsObjectStore.setPrimaryKeyForObject(r4, r2, r5)
        L3c:
            io.realm.BaseRealm r2 = r6.realm
            io.realm.internal.OsSharedRealm r2 = r2.sharedRealm
            r2.renameTable(r1, r0)
            if (r3 == 0) goto L5c
            io.realm.BaseRealm r0 = r6.realm     // Catch: java.lang.Exception -> L4d
            io.realm.internal.OsSharedRealm r0 = r0.sharedRealm     // Catch: java.lang.Exception -> L4d
            io.realm.internal.OsObjectStore.setPrimaryKeyForObject(r0, r7, r3)     // Catch: java.lang.Exception -> L4d
            goto L5c
        L4d:
            r7 = move-exception
            io.realm.BaseRealm r0 = r6.realm
            io.realm.internal.OsSharedRealm r0 = r0.sharedRealm
            io.realm.internal.Table r2 = r6.table
            java.lang.String r2 = r2.getName()
            r0.renameTable(r2, r1)
            throw r7
        L5c:
            return r6
        L5d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Class already exists: "
            java.lang.String r7 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r7)
            r0.<init>(r7)
            throw r0
        L69:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.util.Locale r1 = java.util.Locale.US
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3[r4] = r2
            r2 = 1
            r3[r2] = r7
            r2 = 2
            int r7 = r7.length()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r3[r2] = r7
            java.lang.String r7 = "Class name is too long. Limit is %1$d characters: '%2$s' (%3$d)"
            java.lang.String r7 = java.lang.String.format(r1, r7, r3)
            r0.<init>(r7)
            throw r0
    }

    @Override // io.realm.RealmObjectSchema
    public io.realm.RealmObjectSchema setNullable(java.lang.String r1, boolean r2) {
            r0 = this;
            r2 = r2 ^ 1
            r0.setRequired(r1, r2)
            return r0
    }

    @Override // io.realm.RealmObjectSchema
    public io.realm.RealmObjectSchema setRequired(java.lang.String r6, boolean r7) {
            r5 = this;
            io.realm.internal.Table r0 = r5.table
            long r0 = r0.getColumnKey(r6)
            boolean r2 = r5.isRequired(r6)
            io.realm.internal.Table r3 = r5.table
            io.realm.RealmFieldType r3 = r3.getColumnType(r0)
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.OBJECT
            if (r3 == r4) goto L6c
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.LIST
            if (r3 == r4) goto L60
            if (r7 == 0) goto L29
            if (r2 != 0) goto L1d
            goto L29
        L1d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Field is already required: "
            java.lang.String r6 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r6)
            r7.<init>(r6)
            throw r7
        L29:
            if (r7 != 0) goto L3a
            if (r2 == 0) goto L2e
            goto L3a
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Field is already nullable: "
            java.lang.String r6 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r6)
            r7.<init>(r6)
            throw r7
        L3a:
            if (r7 == 0) goto L5a
            io.realm.internal.Table r6 = r5.table     // Catch: java.lang.RuntimeException -> L42
            r6.convertColumnToNotNullable(r0)     // Catch: java.lang.RuntimeException -> L42
            goto L5f
        L42:
            r6 = move-exception
            java.lang.String r7 = r6.getMessage()
            java.lang.String r0 = "has null value(s) in property"
            boolean r7 = r7.contains(r0)
            if (r7 == 0) goto L59
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.getMessage()
            r7.<init>(r6)
            throw r7
        L59:
            throw r6
        L5a:
            io.realm.internal.Table r6 = r5.table
            r6.convertColumnToNullable(r0)
        L5f:
            return r5
        L60:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Cannot modify the required state for RealmList references: "
            java.lang.String r6 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r6)
            r7.<init>(r6)
            throw r7
        L6c:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Cannot modify the required state for RealmObject references: "
            java.lang.String r6 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r6)
            r7.<init>(r6)
            throw r7
    }

    @Override // io.realm.RealmObjectSchema
    public io.realm.RealmObjectSchema transform(io.realm.RealmObjectSchema.Function r8) {
            r7 = this;
            if (r8 == 0) goto L4f
            io.realm.BaseRealm r0 = r7.realm
            io.realm.internal.OsSharedRealm r0 = r0.sharedRealm
            io.realm.internal.Table r1 = r7.table
            io.realm.internal.TableQuery r1 = r1.where()
            io.realm.internal.OsResults r0 = io.realm.internal.OsResults.createFromQuery(r0, r1)
            io.realm.internal.OsResults r0 = r0.createSnapshot()
            long r1 = r0.size()
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L43
            long r1 = r0.size()
            int r2 = (int) r1
            r1 = 0
        L25:
            if (r1 >= r2) goto L4f
            io.realm.DynamicRealmObject r3 = new io.realm.DynamicRealmObject
            io.realm.BaseRealm r4 = r7.realm
            io.realm.internal.CheckedRow r5 = new io.realm.internal.CheckedRow
            io.realm.internal.UncheckedRow r6 = r0.getUncheckedRow(r1)
            r5.<init>(r6)
            r3.<init>(r4, r5)
            boolean r4 = r3.isValid()
            if (r4 == 0) goto L40
            r8.apply(r3)
        L40:
            int r1 = r1 + 1
            goto L25
        L43:
            java.lang.UnsupportedOperationException r8 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Too many results to iterate: "
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1)
            r8.<init>(r0)
            throw r8
        L4f:
            return r7
    }
}
