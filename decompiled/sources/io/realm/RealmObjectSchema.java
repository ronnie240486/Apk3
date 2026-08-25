package io.realm;

/* JADX INFO: loaded from: classes.dex */
public abstract class RealmObjectSchema {
    public static final java.util.Map<java.lang.Class<?>, io.realm.RealmObjectSchema.FieldMetaData> SUPPORTED_DICTIONARY_SIMPLE_FIELDS = null;
    public static final java.util.Map<java.lang.Class<?>, io.realm.RealmObjectSchema.FieldMetaData> SUPPORTED_LINKED_FIELDS = null;
    public static final java.util.Map<java.lang.Class<?>, io.realm.RealmObjectSchema.FieldMetaData> SUPPORTED_LIST_SIMPLE_FIELDS = null;
    public static final java.util.Map<java.lang.Class<?>, io.realm.RealmObjectSchema.FieldMetaData> SUPPORTED_SET_SIMPLE_FIELDS = null;
    public final io.realm.internal.ColumnInfo columnInfo;
    public final io.realm.BaseRealm realm;
    public final io.realm.internal.Table table;

    public static final class DynamicColumnIndices extends io.realm.internal.ColumnInfo {
        private final io.realm.internal.Table table;

        public DynamicColumnIndices(io.realm.internal.Table r1) {
                r0 = this;
                r0.<init>()
                r0.table = r1
                return
        }

        @Override // io.realm.internal.ColumnInfo
        public final void copy(io.realm.internal.ColumnInfo r1, io.realm.internal.ColumnInfo r2) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                java.lang.String r2 = "DynamicColumnIndices cannot copy"
                r1.<init>(r2)
                throw r1
        }

        @Override // io.realm.internal.ColumnInfo
        public void copyFrom(io.realm.internal.ColumnInfo r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "DynamicColumnIndices cannot be copied"
                r2.<init>(r0)
                throw r2
        }

        @Override // io.realm.internal.ColumnInfo
        public io.realm.internal.ColumnInfo.ColumnDetails getColumnDetails(java.lang.String r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "DynamicColumnIndices do not support 'getColumnDetails'"
                r2.<init>(r0)
                throw r2
        }

        @Override // io.realm.internal.ColumnInfo
        public long getColumnKey(java.lang.String r3) {
                r2 = this;
                io.realm.internal.Table r0 = r2.table
                long r0 = r0.getColumnKey(r3)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class FieldMetaData {
        public final io.realm.RealmFieldType collectionType;
        public final boolean defaultNullable;
        public final io.realm.RealmFieldType fieldType;

        public FieldMetaData(io.realm.RealmFieldType r1, @javax.annotation.Nullable io.realm.RealmFieldType r2, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.fieldType = r1
                r0.collectionType = r2
                r0.defaultNullable = r3
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface Function {
        void apply(io.realm.DynamicRealmObject r1);
    }

    static {
            java.lang.Class<io.realm.RealmAny> r0 = io.realm.RealmAny.class
            java.lang.Class<byte[]> r1 = byte[].class
            java.lang.Class<java.lang.Byte> r2 = java.lang.Byte.class
            java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
            java.lang.Class<java.lang.Double> r4 = java.lang.Double.class
            java.lang.Class<java.lang.Float> r5 = java.lang.Float.class
            java.lang.Class<java.lang.Long> r6 = java.lang.Long.class
            java.lang.Class<java.lang.Integer> r7 = java.lang.Integer.class
            java.lang.Class<java.lang.Short> r8 = java.lang.Short.class
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            io.realm.RealmObjectSchema$FieldMetaData r11 = new io.realm.RealmObjectSchema$FieldMetaData
            io.realm.RealmFieldType r12 = io.realm.RealmFieldType.STRING
            io.realm.RealmFieldType r13 = io.realm.RealmFieldType.STRING_LIST
            r14 = 1
            r11.<init>(r12, r13, r14)
            r10.put(r9, r11)
            java.lang.Class r11 = java.lang.Short.TYPE
            io.realm.RealmObjectSchema$FieldMetaData r13 = new io.realm.RealmObjectSchema$FieldMetaData
            io.realm.RealmFieldType r15 = io.realm.RealmFieldType.INTEGER
            io.realm.RealmFieldType r14 = io.realm.RealmFieldType.INTEGER_LIST
            r17 = r9
            r9 = 0
            r13.<init>(r15, r14, r9)
            r10.put(r11, r13)
            io.realm.RealmObjectSchema$FieldMetaData r11 = new io.realm.RealmObjectSchema$FieldMetaData
            r13 = 1
            r11.<init>(r15, r14, r13)
            r10.put(r8, r11)
            java.lang.Class r11 = java.lang.Integer.TYPE
            io.realm.RealmObjectSchema$FieldMetaData r13 = new io.realm.RealmObjectSchema$FieldMetaData
            r13.<init>(r15, r14, r9)
            r10.put(r11, r13)
            io.realm.RealmObjectSchema$FieldMetaData r13 = new io.realm.RealmObjectSchema$FieldMetaData
            r9 = 1
            r13.<init>(r15, r14, r9)
            r10.put(r7, r13)
            java.lang.Class r13 = java.lang.Long.TYPE
            io.realm.RealmObjectSchema$FieldMetaData r9 = new io.realm.RealmObjectSchema$FieldMetaData
            r18 = r7
            r7 = 0
            r9.<init>(r15, r14, r7)
            r10.put(r13, r9)
            io.realm.RealmObjectSchema$FieldMetaData r9 = new io.realm.RealmObjectSchema$FieldMetaData
            r7 = 1
            r9.<init>(r15, r14, r7)
            r10.put(r6, r9)
            java.lang.Class r9 = java.lang.Float.TYPE
            io.realm.RealmObjectSchema$FieldMetaData r7 = new io.realm.RealmObjectSchema$FieldMetaData
            r19 = r6
            io.realm.RealmFieldType r6 = io.realm.RealmFieldType.FLOAT
            r20 = r13
            io.realm.RealmFieldType r13 = io.realm.RealmFieldType.FLOAT_LIST
            r21 = r11
            r11 = 0
            r7.<init>(r6, r13, r11)
            r10.put(r9, r7)
            io.realm.RealmObjectSchema$FieldMetaData r7 = new io.realm.RealmObjectSchema$FieldMetaData
            r11 = 1
            r7.<init>(r6, r13, r11)
            r10.put(r5, r7)
            java.lang.Class r7 = java.lang.Double.TYPE
            io.realm.RealmObjectSchema$FieldMetaData r13 = new io.realm.RealmObjectSchema$FieldMetaData
            io.realm.RealmFieldType r11 = io.realm.RealmFieldType.DOUBLE
            r22 = r5
            io.realm.RealmFieldType r5 = io.realm.RealmFieldType.DOUBLE_LIST
            r23 = r9
            r9 = 0
            r13.<init>(r11, r5, r9)
            r10.put(r7, r13)
            io.realm.RealmObjectSchema$FieldMetaData r7 = new io.realm.RealmObjectSchema$FieldMetaData
            r13 = 1
            r7.<init>(r11, r5, r13)
            r10.put(r4, r7)
            java.lang.Class r5 = java.lang.Boolean.TYPE
            io.realm.RealmObjectSchema$FieldMetaData r7 = new io.realm.RealmObjectSchema$FieldMetaData
            io.realm.RealmFieldType r13 = io.realm.RealmFieldType.BOOLEAN
            r24 = r4
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.BOOLEAN_LIST
            r7.<init>(r13, r4, r9)
            r10.put(r5, r7)
            io.realm.RealmObjectSchema$FieldMetaData r7 = new io.realm.RealmObjectSchema$FieldMetaData
            r9 = 1
            r7.<init>(r13, r4, r9)
            r10.put(r3, r7)
            java.lang.Class r4 = java.lang.Byte.TYPE
            io.realm.RealmObjectSchema$FieldMetaData r7 = new io.realm.RealmObjectSchema$FieldMetaData
            r9 = 0
            r7.<init>(r15, r14, r9)
            r10.put(r4, r7)
            io.realm.RealmObjectSchema$FieldMetaData r4 = new io.realm.RealmObjectSchema$FieldMetaData
            r7 = 1
            r4.<init>(r15, r14, r7)
            r10.put(r2, r4)
            io.realm.RealmObjectSchema$FieldMetaData r4 = new io.realm.RealmObjectSchema$FieldMetaData
            io.realm.RealmFieldType r9 = io.realm.RealmFieldType.BINARY
            io.realm.RealmFieldType r14 = io.realm.RealmFieldType.BINARY_LIST
            r4.<init>(r9, r14, r7)
            r10.put(r1, r4)
            java.lang.Class<java.util.Date> r4 = java.util.Date.class
            io.realm.RealmObjectSchema$FieldMetaData r14 = new io.realm.RealmObjectSchema$FieldMetaData
            r16 = r1
            io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DATE
            r25 = r9
            io.realm.RealmFieldType r9 = io.realm.RealmFieldType.DATE_LIST
            r14.<init>(r1, r9, r7)
            r10.put(r4, r14)
            java.lang.Class<org.bson.types.ObjectId> r4 = org.bson.types.ObjectId.class
            io.realm.RealmObjectSchema$FieldMetaData r9 = new io.realm.RealmObjectSchema$FieldMetaData
            io.realm.RealmFieldType r14 = io.realm.RealmFieldType.OBJECT_ID
            r26 = r1
            io.realm.RealmFieldType r1 = io.realm.RealmFieldType.OBJECT_ID_LIST
            r9.<init>(r14, r1, r7)
            r10.put(r4, r9)
            java.lang.Class<org.bson.types.Decimal128> r1 = org.bson.types.Decimal128.class
            io.realm.RealmObjectSchema$FieldMetaData r4 = new io.realm.RealmObjectSchema$FieldMetaData
            io.realm.RealmFieldType r9 = io.realm.RealmFieldType.DECIMAL128
            r27 = r14
            io.realm.RealmFieldType r14 = io.realm.RealmFieldType.DECIMAL128_LIST
            r4.<init>(r9, r14, r7)
            r10.put(r1, r4)
            java.lang.Class<java.util.UUID> r1 = java.util.UUID.class
            io.realm.RealmObjectSchema$FieldMetaData r4 = new io.realm.RealmObjectSchema$FieldMetaData
            io.realm.RealmFieldType r14 = io.realm.RealmFieldType.UUID
            r28 = r9
            io.realm.RealmFieldType r9 = io.realm.RealmFieldType.UUID_LIST
            r4.<init>(r14, r9, r7)
            r10.put(r1, r4)
            io.realm.RealmObjectSchema$FieldMetaData r1 = new io.realm.RealmObjectSchema$FieldMetaData
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.MIXED
            io.realm.RealmFieldType r9 = io.realm.RealmFieldType.MIXED_LIST
            r1.<init>(r4, r9, r7)
            r10.put(r0, r1)
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r10)
            io.realm.RealmObjectSchema.SUPPORTED_LIST_SIMPLE_FIELDS = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            io.realm.RealmObjectSchema$FieldMetaData r9 = new io.realm.RealmObjectSchema$FieldMetaData
            io.realm.RealmFieldType r10 = io.realm.RealmFieldType.STRING_TO_STRING_MAP
            r9.<init>(r12, r10, r7)
            r10 = r17
            r1.put(r10, r9)
            java.lang.Class r9 = java.lang.Short.TYPE
            io.realm.RealmObjectSchema$FieldMetaData r7 = new io.realm.RealmObjectSchema$FieldMetaData
            r29 = r10
            io.realm.RealmFieldType r10 = io.realm.RealmFieldType.STRING_TO_INTEGER_MAP
            r30 = r12
            r12 = 0
            r7.<init>(r15, r10, r12)
            r1.put(r9, r7)
            io.realm.RealmObjectSchema$FieldMetaData r7 = new io.realm.RealmObjectSchema$FieldMetaData
            r9 = 1
            r7.<init>(r15, r10, r9)
            r1.put(r8, r7)
            io.realm.RealmObjectSchema$FieldMetaData r7 = new io.realm.RealmObjectSchema$FieldMetaData
            r7.<init>(r15, r10, r12)
            r12 = r21
            r1.put(r12, r7)
            io.realm.RealmObjectSchema$FieldMetaData r7 = new io.realm.RealmObjectSchema$FieldMetaData
            r7.<init>(r15, r10, r9)
            r9 = r18
            r1.put(r9, r7)
            io.realm.RealmObjectSchema$FieldMetaData r7 = new io.realm.RealmObjectSchema$FieldMetaData
            r9 = 0
            r7.<init>(r15, r10, r9)
            r9 = r20
            r1.put(r9, r7)
            io.realm.RealmObjectSchema$FieldMetaData r7 = new io.realm.RealmObjectSchema$FieldMetaData
            r9 = 1
            r7.<init>(r15, r10, r9)
            r9 = r19
            r1.put(r9, r7)
            io.realm.RealmObjectSchema$FieldMetaData r7 = new io.realm.RealmObjectSchema$FieldMetaData
            io.realm.RealmFieldType r9 = io.realm.RealmFieldType.STRING_TO_FLOAT_MAP
            r12 = 0
            r7.<init>(r6, r9, r12)
            r12 = r23
            r1.put(r12, r7)
            io.realm.RealmObjectSchema$FieldMetaData r7 = new io.realm.RealmObjectSchema$FieldMetaData
            r12 = 1
            r7.<init>(r6, r9, r12)
            r9 = r22
            r1.put(r9, r7)
            java.lang.Class r7 = java.lang.Double.TYPE
            io.realm.RealmObjectSchema$FieldMetaData r12 = new io.realm.RealmObjectSchema$FieldMetaData
            io.realm.RealmFieldType r9 = io.realm.RealmFieldType.STRING_TO_DOUBLE_MAP
            r31 = r6
            r6 = 0
            r12.<init>(r11, r9, r6)
            r1.put(r7, r12)
            io.realm.RealmObjectSchema$FieldMetaData r7 = new io.realm.RealmObjectSchema$FieldMetaData
            r12 = 1
            r7.<init>(r11, r9, r12)
            r9 = r24
            r1.put(r9, r7)
            io.realm.RealmObjectSchema$FieldMetaData r7 = new io.realm.RealmObjectSchema$FieldMetaData
            io.realm.RealmFieldType r12 = io.realm.RealmFieldType.STRING_TO_BOOLEAN_MAP
            r7.<init>(r13, r12, r6)
            r1.put(r5, r7)
            io.realm.RealmObjectSchema$FieldMetaData r7 = new io.realm.RealmObjectSchema$FieldMetaData
            r6 = 1
            r7.<init>(r13, r12, r6)
            r1.put(r3, r7)
            java.lang.Class r7 = java.lang.Byte.TYPE
            io.realm.RealmObjectSchema$FieldMetaData r12 = new io.realm.RealmObjectSchema$FieldMetaData
            r6 = 0
            r12.<init>(r15, r10, r6)
            r1.put(r7, r12)
            io.realm.RealmObjectSchema$FieldMetaData r6 = new io.realm.RealmObjectSchema$FieldMetaData
            r7 = 1
            r6.<init>(r15, r10, r7)
            r1.put(r2, r6)
            io.realm.RealmObjectSchema$FieldMetaData r6 = new io.realm.RealmObjectSchema$FieldMetaData
            io.realm.RealmFieldType r10 = io.realm.RealmFieldType.STRING_TO_BINARY_MAP
            r12 = r25
            r6.<init>(r12, r10, r7)
            r10 = r16
            r1.put(r10, r6)
            java.lang.Class<java.util.Date> r6 = java.util.Date.class
            io.realm.RealmObjectSchema$FieldMetaData r10 = new io.realm.RealmObjectSchema$FieldMetaData
            io.realm.RealmFieldType r12 = io.realm.RealmFieldType.STRING_TO_DATE_MAP
            r17 = r2
            r2 = r26
            r10.<init>(r2, r12, r7)
            r1.put(r6, r10)
            java.lang.Class<org.bson.types.ObjectId> r6 = org.bson.types.ObjectId.class
            io.realm.RealmObjectSchema$FieldMetaData r10 = new io.realm.RealmObjectSchema$FieldMetaData
            io.realm.RealmFieldType r12 = io.realm.RealmFieldType.STRING_TO_OBJECT_ID_MAP
            r2 = r27
            r10.<init>(r2, r12, r7)
            r1.put(r6, r10)
            java.lang.Class<org.bson.types.Decimal128> r6 = org.bson.types.Decimal128.class
            io.realm.RealmObjectSchema$FieldMetaData r10 = new io.realm.RealmObjectSchema$FieldMetaData
            io.realm.RealmFieldType r12 = io.realm.RealmFieldType.STRING_TO_DECIMAL128_MAP
            r2 = r28
            r10.<init>(r2, r12, r7)
            r1.put(r6, r10)
            java.lang.Class<java.util.UUID> r6 = java.util.UUID.class
            io.realm.RealmObjectSchema$FieldMetaData r10 = new io.realm.RealmObjectSchema$FieldMetaData
            io.realm.RealmFieldType r12 = io.realm.RealmFieldType.STRING_TO_UUID_MAP
            r10.<init>(r14, r12, r7)
            r1.put(r6, r10)
            io.realm.RealmObjectSchema$FieldMetaData r6 = new io.realm.RealmObjectSchema$FieldMetaData
            io.realm.RealmFieldType r10 = io.realm.RealmFieldType.STRING_TO_MIXED_MAP
            r6.<init>(r4, r10, r7)
            r1.put(r0, r6)
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)
            io.realm.RealmObjectSchema.SUPPORTED_DICTIONARY_SIMPLE_FIELDS = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            io.realm.RealmObjectSchema$FieldMetaData r6 = new io.realm.RealmObjectSchema$FieldMetaData
            io.realm.RealmFieldType r10 = io.realm.RealmFieldType.STRING_SET
            r12 = r30
            r6.<init>(r12, r10, r7)
            r10 = r29
            r1.put(r10, r6)
            java.lang.Class r6 = java.lang.Short.TYPE
            io.realm.RealmObjectSchema$FieldMetaData r10 = new io.realm.RealmObjectSchema$FieldMetaData
            io.realm.RealmFieldType r12 = io.realm.RealmFieldType.INTEGER_SET
            r7 = 0
            r10.<init>(r15, r12, r7)
            r1.put(r6, r10)
            io.realm.RealmObjectSchema$FieldMetaData r6 = new io.realm.RealmObjectSchema$FieldMetaData
            r10 = 1
            r6.<init>(r15, r12, r10)
            r1.put(r8, r6)
            io.realm.RealmObjectSchema$FieldMetaData r6 = new io.realm.RealmObjectSchema$FieldMetaData
            r6.<init>(r15, r12, r7)
            r8 = r21
            r1.put(r8, r6)
            io.realm.RealmObjectSchema$FieldMetaData r6 = new io.realm.RealmObjectSchema$FieldMetaData
            r6.<init>(r15, r12, r10)
            r8 = r18
            r1.put(r8, r6)
            io.realm.RealmObjectSchema$FieldMetaData r6 = new io.realm.RealmObjectSchema$FieldMetaData
            r6.<init>(r15, r12, r7)
            r8 = r20
            r1.put(r8, r6)
            io.realm.RealmObjectSchema$FieldMetaData r6 = new io.realm.RealmObjectSchema$FieldMetaData
            r6.<init>(r15, r12, r10)
            r8 = r19
            r1.put(r8, r6)
            io.realm.RealmObjectSchema$FieldMetaData r6 = new io.realm.RealmObjectSchema$FieldMetaData
            io.realm.RealmFieldType r8 = io.realm.RealmFieldType.FLOAT_SET
            r10 = r31
            r6.<init>(r10, r8, r7)
            r7 = r23
            r1.put(r7, r6)
            io.realm.RealmObjectSchema$FieldMetaData r6 = new io.realm.RealmObjectSchema$FieldMetaData
            r7 = 1
            r6.<init>(r10, r8, r7)
            r8 = r22
            r1.put(r8, r6)
            java.lang.Class r6 = java.lang.Double.TYPE
            io.realm.RealmObjectSchema$FieldMetaData r8 = new io.realm.RealmObjectSchema$FieldMetaData
            io.realm.RealmFieldType r10 = io.realm.RealmFieldType.DOUBLE_SET
            r7 = 0
            r8.<init>(r11, r10, r7)
            r1.put(r6, r8)
            io.realm.RealmObjectSchema$FieldMetaData r6 = new io.realm.RealmObjectSchema$FieldMetaData
            r8 = 1
            r6.<init>(r11, r10, r8)
            r1.put(r9, r6)
            io.realm.RealmObjectSchema$FieldMetaData r6 = new io.realm.RealmObjectSchema$FieldMetaData
            io.realm.RealmFieldType r9 = io.realm.RealmFieldType.BOOLEAN_SET
            r6.<init>(r13, r9, r7)
            r1.put(r5, r6)
            io.realm.RealmObjectSchema$FieldMetaData r5 = new io.realm.RealmObjectSchema$FieldMetaData
            r5.<init>(r13, r9, r8)
            r1.put(r3, r5)
            java.lang.Class r3 = java.lang.Byte.TYPE
            io.realm.RealmObjectSchema$FieldMetaData r5 = new io.realm.RealmObjectSchema$FieldMetaData
            r5.<init>(r15, r12, r7)
            r1.put(r3, r5)
            io.realm.RealmObjectSchema$FieldMetaData r3 = new io.realm.RealmObjectSchema$FieldMetaData
            r3.<init>(r15, r12, r8)
            r5 = r17
            r1.put(r5, r3)
            io.realm.RealmObjectSchema$FieldMetaData r3 = new io.realm.RealmObjectSchema$FieldMetaData
            io.realm.RealmFieldType r5 = io.realm.RealmFieldType.BINARY_SET
            r6 = r25
            r3.<init>(r6, r5, r8)
            r5 = r16
            r1.put(r5, r3)
            java.lang.Class<java.util.Date> r3 = java.util.Date.class
            io.realm.RealmObjectSchema$FieldMetaData r5 = new io.realm.RealmObjectSchema$FieldMetaData
            io.realm.RealmFieldType r6 = io.realm.RealmFieldType.DATE_SET
            r7 = r26
            r5.<init>(r7, r6, r8)
            r1.put(r3, r5)
            java.lang.Class<org.bson.types.ObjectId> r3 = org.bson.types.ObjectId.class
            io.realm.RealmObjectSchema$FieldMetaData r5 = new io.realm.RealmObjectSchema$FieldMetaData
            io.realm.RealmFieldType r6 = io.realm.RealmFieldType.OBJECT_ID_SET
            r7 = r27
            r5.<init>(r7, r6, r8)
            r1.put(r3, r5)
            java.lang.Class<org.bson.types.Decimal128> r3 = org.bson.types.Decimal128.class
            io.realm.RealmObjectSchema$FieldMetaData r5 = new io.realm.RealmObjectSchema$FieldMetaData
            io.realm.RealmFieldType r6 = io.realm.RealmFieldType.DECIMAL128_SET
            r5.<init>(r2, r6, r8)
            r1.put(r3, r5)
            java.lang.Class<java.util.UUID> r2 = java.util.UUID.class
            io.realm.RealmObjectSchema$FieldMetaData r3 = new io.realm.RealmObjectSchema$FieldMetaData
            io.realm.RealmFieldType r5 = io.realm.RealmFieldType.UUID_SET
            r3.<init>(r14, r5, r8)
            r1.put(r2, r3)
            io.realm.RealmObjectSchema$FieldMetaData r2 = new io.realm.RealmObjectSchema$FieldMetaData
            io.realm.RealmFieldType r3 = io.realm.RealmFieldType.MIXED_SET
            r2.<init>(r4, r3, r8)
            r1.put(r0, r2)
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r1)
            io.realm.RealmObjectSchema.SUPPORTED_SET_SIMPLE_FIELDS = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.Class<io.realm.RealmObject> r1 = io.realm.RealmObject.class
            io.realm.RealmObjectSchema$FieldMetaData r2 = new io.realm.RealmObjectSchema$FieldMetaData
            io.realm.RealmFieldType r3 = io.realm.RealmFieldType.OBJECT
            r4 = 0
            r5 = 0
            r2.<init>(r3, r4, r5)
            r0.put(r1, r2)
            java.lang.Class<io.realm.RealmList> r1 = io.realm.RealmList.class
            io.realm.RealmObjectSchema$FieldMetaData r2 = new io.realm.RealmObjectSchema$FieldMetaData
            io.realm.RealmFieldType r3 = io.realm.RealmFieldType.LIST
            r2.<init>(r3, r4, r5)
            r0.put(r1, r2)
            java.lang.Class<io.realm.RealmDictionary> r1 = io.realm.RealmDictionary.class
            io.realm.RealmObjectSchema$FieldMetaData r2 = new io.realm.RealmObjectSchema$FieldMetaData
            io.realm.RealmFieldType r3 = io.realm.RealmFieldType.STRING_TO_LINK_MAP
            r2.<init>(r3, r4, r5)
            r0.put(r1, r2)
            java.lang.Class<io.realm.RealmSet> r1 = io.realm.RealmSet.class
            io.realm.RealmObjectSchema$FieldMetaData r2 = new io.realm.RealmObjectSchema$FieldMetaData
            io.realm.RealmFieldType r3 = io.realm.RealmFieldType.LINK_SET
            r2.<init>(r3, r4, r5)
            r0.put(r1, r2)
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            io.realm.RealmObjectSchema.SUPPORTED_LINKED_FIELDS = r0
            return
    }

    public RealmObjectSchema(io.realm.BaseRealm r1, io.realm.internal.Table r2, io.realm.internal.ColumnInfo r3) {
            r0 = this;
            r0.<init>()
            r0.realm = r1
            r0.table = r2
            r0.columnInfo = r3
            return
    }

    public static void checkLegalName(java.lang.String r1) {
            if (r1 == 0) goto L29
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L29
            java.lang.String r0 = "."
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L21
            int r1 = r1.length()
            r0 = 63
            if (r1 > r0) goto L19
            return
        L19:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Field name is currently limited to max 63 characters."
            r1.<init>(r0)
            throw r1
        L21:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Field name can not contain '.'"
            r1.<init>(r0)
            throw r1
        L29:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Field name can not be null or empty"
            r1.<init>(r0)
            throw r1
    }

    public abstract io.realm.RealmObjectSchema addField(java.lang.String r1, java.lang.Class<?> r2, io.realm.FieldAttribute... r3);

    public abstract io.realm.RealmObjectSchema addIndex(java.lang.String r1);

    public abstract io.realm.RealmObjectSchema addPrimaryKey(java.lang.String r1);

    public abstract io.realm.RealmObjectSchema addRealmDictionaryField(java.lang.String r1, io.realm.RealmObjectSchema r2);

    public abstract io.realm.RealmObjectSchema addRealmDictionaryField(java.lang.String r1, java.lang.Class<?> r2);

    public abstract io.realm.RealmObjectSchema addRealmListField(java.lang.String r1, io.realm.RealmObjectSchema r2);

    public abstract io.realm.RealmObjectSchema addRealmListField(java.lang.String r1, java.lang.Class<?> r2);

    public abstract io.realm.RealmObjectSchema addRealmObjectField(java.lang.String r1, io.realm.RealmObjectSchema r2);

    public abstract io.realm.RealmObjectSchema addRealmSetField(java.lang.String r1, io.realm.RealmObjectSchema r2);

    public abstract io.realm.RealmObjectSchema addRealmSetField(java.lang.String r1, java.lang.Class<?> r2);

    public final void checkFieldExists(java.lang.String r6) {
            r5 = this;
            io.realm.internal.Table r0 = r5.table
            long r0 = r0.getColumnKey(r6)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Ld
            return
        Ld:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Field name doesn't exist on object '"
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

    public final long getAndCheckFieldColumnKey(java.lang.String r6) {
            r5 = this;
            io.realm.internal.ColumnInfo r0 = r5.columnInfo
            long r0 = r0.getColumnKey(r6)
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto Ld
            return r0
        Ld:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Field does not exist: "
            java.lang.String r6 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r6)
            r0.<init>(r6)
            throw r0
    }

    public java.lang.String getClassName() {
            r1 = this;
            io.realm.internal.Table r0 = r1.table
            java.lang.String r0 = r0.getClassName()
            return r0
    }

    public final long getColumnKey(java.lang.String r6) {
            r5 = this;
            io.realm.internal.Table r0 = r5.table
            long r0 = r0.getColumnKey(r6)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Ld
            return r0
        Ld:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.util.Locale r1 = java.util.Locale.US
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r6
            r6 = 1
            java.lang.String r3 = r5.getClassName()
            r2[r6] = r3
            java.lang.String r6 = "Field name '%s' does not exist on schema for '%s'"
            java.lang.String r6 = java.lang.String.format(r1, r6, r2)
            r0.<init>(r6)
            throw r0
    }

    public java.util.Set<java.lang.String> getFieldNames() {
            r5 = this;
            io.realm.internal.Table r0 = r5.table
            long r0 = r0.getColumnCount()
            int r1 = (int) r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>(r1)
            io.realm.internal.Table r1 = r5.table
            java.lang.String[] r1 = r1.getColumnNames()
            int r2 = r1.length
            r3 = 0
        L14:
            if (r3 >= r2) goto L1e
            r4 = r1[r3]
            r0.add(r4)
            int r3 = r3 + 1
            goto L14
        L1e:
            return r0
    }

    public io.realm.RealmFieldType getFieldType(java.lang.String r3) {
            r2 = this;
            long r0 = r2.getColumnKey(r3)
            io.realm.internal.Table r3 = r2.table
            io.realm.RealmFieldType r3 = r3.getColumnType(r0)
            return r3
    }

    public java.lang.String getPrimaryKey() {
            r3 = this;
            io.realm.BaseRealm r0 = r3.realm
            io.realm.internal.OsSharedRealm r0 = r0.sharedRealm
            java.lang.String r1 = r3.getClassName()
            java.lang.String r0 = io.realm.internal.OsObjectStore.getPrimaryKeyForObject(r0, r1)
            if (r0 == 0) goto Lf
            return r0
        Lf:
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

    public abstract java.lang.String getPropertyClassName(java.lang.String r1);

    public boolean hasField(java.lang.String r5) {
            r4 = this;
            io.realm.internal.Table r0 = r4.table
            long r0 = r0.getColumnKey(r5)
            r2 = -1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto Le
            r5 = 1
            goto Lf
        Le:
            r5 = 0
        Lf:
            return r5
    }

    public boolean hasIndex(java.lang.String r4) {
            r3 = this;
            checkLegalName(r4)
            r3.checkFieldExists(r4)
            io.realm.internal.Table r0 = r3.table
            long r1 = r0.getColumnKey(r4)
            boolean r4 = r0.hasSearchIndex(r1)
            return r4
    }

    public boolean hasPrimaryKey() {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            io.realm.internal.OsSharedRealm r0 = r0.sharedRealm
            java.lang.String r1 = r2.getClassName()
            java.lang.String r0 = io.realm.internal.OsObjectStore.getPrimaryKeyForObject(r0, r1)
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    public boolean isEmbedded() {
            r1 = this;
            io.realm.internal.Table r0 = r1.table
            boolean r0 = r0.isEmbedded()
            return r0
    }

    public boolean isNullable(java.lang.String r3) {
            r2 = this;
            long r0 = r2.getColumnKey(r3)
            io.realm.internal.Table r3 = r2.table
            boolean r3 = r3.isColumnNullable(r0)
            return r3
    }

    public boolean isPrimaryKey(java.lang.String r3) {
            r2 = this;
            r2.checkFieldExists(r3)
            io.realm.BaseRealm r0 = r2.realm
            io.realm.internal.OsSharedRealm r0 = r0.sharedRealm
            java.lang.String r1 = r2.getClassName()
            java.lang.String r0 = io.realm.internal.OsObjectStore.getPrimaryKeyForObject(r0, r1)
            boolean r3 = r3.equals(r0)
            return r3
    }

    public boolean isRequired(java.lang.String r3) {
            r2 = this;
            long r0 = r2.getColumnKey(r3)
            io.realm.internal.Table r3 = r2.table
            boolean r3 = r3.isColumnNullable(r0)
            r3 = r3 ^ 1
            return r3
    }

    public abstract io.realm.RealmObjectSchema removeField(java.lang.String r1);

    public abstract io.realm.RealmObjectSchema removeIndex(java.lang.String r1);

    public abstract io.realm.RealmObjectSchema removePrimaryKey();

    public abstract io.realm.RealmObjectSchema renameField(java.lang.String r1, java.lang.String r2);

    public abstract io.realm.RealmObjectSchema setClassName(java.lang.String r1);

    public void setEmbedded(boolean r3) {
            r2 = this;
            boolean r0 = r2.hasPrimaryKey()
            if (r0 != 0) goto L1a
            io.realm.internal.Table r0 = r2.table
            boolean r0 = r0.setEmbedded(r3)
            if (r0 != 0) goto L19
            if (r3 != 0) goto L11
            goto L19
        L11:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "The class could not be marked as embedded as some objects of this type break some of the Embedded Objects invariants. In order to convert all objects to be embedded, they must have one and exactly one parent objectpointing to them."
            r3.<init>(r0)
            throw r3
        L19:
            return
        L1a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Embedded classes cannot have primary keys. This class has a primary key defined so cannot be marked as embedded: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = r2.getClassName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    public abstract io.realm.RealmObjectSchema setNullable(java.lang.String r1, boolean r2);

    public abstract io.realm.RealmObjectSchema setRequired(java.lang.String r1, boolean r2);

    public abstract io.realm.RealmObjectSchema transform(io.realm.RealmObjectSchema.Function r1);
}
