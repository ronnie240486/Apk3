package io.realm;

/* JADX INFO: loaded from: classes2.dex */
public class RealmAny {

    @javax.annotation.Nonnull
    private final io.realm.RealmAnyOperator operator;

    /* JADX INFO: loaded from: classes.dex */
    public static final enum Type extends java.lang.Enum<io.realm.RealmAny.Type> {
        private static final /* synthetic */ io.realm.RealmAny.Type[] $VALUES = null;
        public static final io.realm.RealmAny.Type BINARY = null;
        public static final io.realm.RealmAny.Type BOOLEAN = null;
        public static final io.realm.RealmAny.Type DATE = null;
        public static final io.realm.RealmAny.Type DECIMAL128 = null;
        public static final io.realm.RealmAny.Type DOUBLE = null;
        public static final io.realm.RealmAny.Type FLOAT = null;
        public static final io.realm.RealmAny.Type INTEGER = null;
        public static final io.realm.RealmAny.Type NULL = null;
        public static final io.realm.RealmAny.Type OBJECT = null;
        public static final io.realm.RealmAny.Type OBJECT_ID = null;
        public static final io.realm.RealmAny.Type STRING = null;
        public static final io.realm.RealmAny.Type UUID = null;
        private static final io.realm.RealmAny.Type[] realmFieldToRealmAnyTypeMap = null;
        private final java.lang.Class<?> clazz;
        private final io.realm.RealmFieldType realmFieldType;

        static {
                io.realm.RealmAny$Type r0 = new io.realm.RealmAny$Type
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.INTEGER
                java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
                java.lang.String r3 = "INTEGER"
                r4 = 0
                r0.<init>(r3, r4, r1, r2)
                io.realm.RealmAny.Type.INTEGER = r0
                io.realm.RealmAny$Type r1 = new io.realm.RealmAny$Type
                io.realm.RealmFieldType r2 = io.realm.RealmFieldType.BOOLEAN
                java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
                java.lang.String r5 = "BOOLEAN"
                r6 = 1
                r1.<init>(r5, r6, r2, r3)
                io.realm.RealmAny.Type.BOOLEAN = r1
                io.realm.RealmAny$Type r2 = new io.realm.RealmAny$Type
                io.realm.RealmFieldType r3 = io.realm.RealmFieldType.STRING
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                java.lang.String r7 = "STRING"
                r8 = 2
                r2.<init>(r7, r8, r3, r5)
                io.realm.RealmAny.Type.STRING = r2
                io.realm.RealmAny$Type r3 = new io.realm.RealmAny$Type
                io.realm.RealmFieldType r5 = io.realm.RealmFieldType.BINARY
                java.lang.Class<java.lang.Byte[]> r7 = java.lang.Byte[].class
                java.lang.String r9 = "BINARY"
                r10 = 3
                r3.<init>(r9, r10, r5, r7)
                io.realm.RealmAny.Type.BINARY = r3
                io.realm.RealmAny$Type r5 = new io.realm.RealmAny$Type
                io.realm.RealmFieldType r7 = io.realm.RealmFieldType.DATE
                java.lang.Class<java.util.Date> r9 = java.util.Date.class
                java.lang.String r11 = "DATE"
                r12 = 4
                r5.<init>(r11, r12, r7, r9)
                io.realm.RealmAny.Type.DATE = r5
                io.realm.RealmAny$Type r7 = new io.realm.RealmAny$Type
                io.realm.RealmFieldType r9 = io.realm.RealmFieldType.FLOAT
                java.lang.Class<java.lang.Float> r11 = java.lang.Float.class
                java.lang.String r13 = "FLOAT"
                r14 = 5
                r7.<init>(r13, r14, r9, r11)
                io.realm.RealmAny.Type.FLOAT = r7
                io.realm.RealmAny$Type r9 = new io.realm.RealmAny$Type
                io.realm.RealmFieldType r11 = io.realm.RealmFieldType.DOUBLE
                java.lang.Class<java.lang.Double> r13 = java.lang.Double.class
                java.lang.String r15 = "DOUBLE"
                r14 = 6
                r9.<init>(r15, r14, r11, r13)
                io.realm.RealmAny.Type.DOUBLE = r9
                io.realm.RealmAny$Type r11 = new io.realm.RealmAny$Type
                io.realm.RealmFieldType r13 = io.realm.RealmFieldType.DECIMAL128
                java.lang.Class<org.bson.types.Decimal128> r15 = org.bson.types.Decimal128.class
                java.lang.String r14 = "DECIMAL128"
                r12 = 7
                r11.<init>(r14, r12, r13, r15)
                io.realm.RealmAny.Type.DECIMAL128 = r11
                io.realm.RealmAny$Type r13 = new io.realm.RealmAny$Type
                io.realm.RealmFieldType r14 = io.realm.RealmFieldType.OBJECT_ID
                java.lang.Class<org.bson.types.ObjectId> r15 = org.bson.types.ObjectId.class
                java.lang.String r12 = "OBJECT_ID"
                r10 = 8
                r13.<init>(r12, r10, r14, r15)
                io.realm.RealmAny.Type.OBJECT_ID = r13
                io.realm.RealmAny$Type r12 = new io.realm.RealmAny$Type
                io.realm.RealmFieldType r14 = io.realm.RealmFieldType.TYPED_LINK
                java.lang.Class<io.realm.RealmModel> r15 = io.realm.RealmModel.class
                java.lang.String r10 = "OBJECT"
                r8 = 9
                r12.<init>(r10, r8, r14, r15)
                io.realm.RealmAny.Type.OBJECT = r12
                io.realm.RealmAny$Type r10 = new io.realm.RealmAny$Type
                io.realm.RealmFieldType r14 = io.realm.RealmFieldType.UUID
                java.lang.Class<java.util.UUID> r15 = java.util.UUID.class
                java.lang.String r8 = "UUID"
                r6 = 10
                r10.<init>(r8, r6, r14, r15)
                io.realm.RealmAny.Type.UUID = r10
                io.realm.RealmAny$Type r8 = new io.realm.RealmAny$Type
                java.lang.String r14 = "NULL"
                r15 = 11
                r6 = 0
                r8.<init>(r14, r15, r6, r6)
                io.realm.RealmAny.Type.NULL = r8
                r6 = 12
                io.realm.RealmAny$Type[] r6 = new io.realm.RealmAny.Type[r6]
                r6[r4] = r0
                r0 = 1
                r6[r0] = r1
                r0 = 2
                r6[r0] = r2
                r0 = 3
                r6[r0] = r3
                r0 = 4
                r6[r0] = r5
                r0 = 5
                r6[r0] = r7
                r0 = 6
                r6[r0] = r9
                r0 = 7
                r6[r0] = r11
                r0 = 8
                r6[r0] = r13
                r0 = 9
                r6[r0] = r12
                r0 = 10
                r6[r0] = r10
                r6[r15] = r8
                io.realm.RealmAny.Type.$VALUES = r6
                r0 = 19
                io.realm.RealmAny$Type[] r0 = new io.realm.RealmAny.Type[r0]
                io.realm.RealmAny.Type.realmFieldToRealmAnyTypeMap = r0
                io.realm.RealmAny$Type[] r0 = values()
                int r1 = r0.length
            Ldf:
                if (r4 >= r1) goto Lf5
                r2 = r0[r4]
                io.realm.RealmAny$Type r3 = io.realm.RealmAny.Type.NULL
                if (r2 != r3) goto Le8
                goto Lf2
            Le8:
                io.realm.RealmFieldType r3 = r2.realmFieldType
                int r3 = r3.getNativeValue()
                io.realm.RealmAny$Type[] r5 = io.realm.RealmAny.Type.realmFieldToRealmAnyTypeMap
                r5[r3] = r2
            Lf2:
                int r4 = r4 + 1
                goto Ldf
            Lf5:
                io.realm.RealmAny$Type[] r0 = io.realm.RealmAny.Type.realmFieldToRealmAnyTypeMap
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.OBJECT
                int r1 = r1.getNativeValue()
                io.realm.RealmAny$Type r2 = io.realm.RealmAny.Type.OBJECT
                r0[r1] = r2
                return
        }

        private Type(@javax.annotation.Nullable java.lang.String r1, @javax.annotation.Nullable int r2, io.realm.RealmFieldType r3, java.lang.Class r4) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.realmFieldType = r3
                r0.clazz = r4
                return
        }

        public static io.realm.RealmAny.Type fromNativeValue(int r1) {
                r0 = -1
                if (r1 != r0) goto L6
                io.realm.RealmAny$Type r1 = io.realm.RealmAny.Type.NULL
                return r1
            L6:
                io.realm.RealmAny$Type[] r0 = io.realm.RealmAny.Type.realmFieldToRealmAnyTypeMap
                r1 = r0[r1]
                return r1
        }

        public static io.realm.RealmAny.Type valueOf(java.lang.String r1) {
                java.lang.Class<io.realm.RealmAny$Type> r0 = io.realm.RealmAny.Type.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.realm.RealmAny$Type r1 = (io.realm.RealmAny.Type) r1
                return r1
        }

        public static io.realm.RealmAny.Type[] values() {
                io.realm.RealmAny$Type[] r0 = io.realm.RealmAny.Type.$VALUES
                java.lang.Object r0 = r0.clone()
                io.realm.RealmAny$Type[] r0 = (io.realm.RealmAny.Type[]) r0
                return r0
        }

        public java.lang.Class<?> getTypedClass() {
                r1 = this;
                java.lang.Class<?> r0 = r1.clazz
                return r0
        }
    }

    public RealmAny(@javax.annotation.Nonnull io.realm.RealmAnyOperator r1) {
            r0 = this;
            r0.<init>()
            r0.operator = r1
            return
    }

    public static io.realm.RealmAny nullValue() {
            io.realm.RealmAny r0 = new io.realm.RealmAny
            io.realm.NullRealmAnyOperator r1 = new io.realm.NullRealmAnyOperator
            r1.<init>()
            r0.<init>(r1)
            return r0
    }

    public static io.realm.RealmAny valueOf(@javax.annotation.Nullable io.realm.RealmModel r2) {
            io.realm.RealmAny r0 = new io.realm.RealmAny
            if (r2 != 0) goto La
            io.realm.NullRealmAnyOperator r2 = new io.realm.NullRealmAnyOperator
            r2.<init>()
            goto L10
        La:
            io.realm.RealmModelOperator r1 = new io.realm.RealmModelOperator
            r1.<init>(r2)
            r2 = r1
        L10:
            r0.<init>(r2)
            return r0
    }

    public static io.realm.RealmAny valueOf(@javax.annotation.Nullable java.lang.Boolean r2) {
            io.realm.RealmAny r0 = new io.realm.RealmAny
            if (r2 != 0) goto La
            io.realm.NullRealmAnyOperator r2 = new io.realm.NullRealmAnyOperator
            r2.<init>()
            goto L10
        La:
            io.realm.BooleanRealmAnyOperator r1 = new io.realm.BooleanRealmAnyOperator
            r1.<init>(r2)
            r2 = r1
        L10:
            r0.<init>(r2)
            return r0
    }

    public static io.realm.RealmAny valueOf(@javax.annotation.Nullable java.lang.Byte r2) {
            io.realm.RealmAny r0 = new io.realm.RealmAny
            if (r2 != 0) goto La
            io.realm.NullRealmAnyOperator r2 = new io.realm.NullRealmAnyOperator
            r2.<init>()
            goto L10
        La:
            io.realm.IntegerRealmAnyOperator r1 = new io.realm.IntegerRealmAnyOperator
            r1.<init>(r2)
            r2 = r1
        L10:
            r0.<init>(r2)
            return r0
    }

    public static io.realm.RealmAny valueOf(@javax.annotation.Nullable java.lang.Double r2) {
            io.realm.RealmAny r0 = new io.realm.RealmAny
            if (r2 != 0) goto La
            io.realm.NullRealmAnyOperator r2 = new io.realm.NullRealmAnyOperator
            r2.<init>()
            goto L10
        La:
            io.realm.DoubleRealmAnyOperator r1 = new io.realm.DoubleRealmAnyOperator
            r1.<init>(r2)
            r2 = r1
        L10:
            r0.<init>(r2)
            return r0
    }

    public static io.realm.RealmAny valueOf(@javax.annotation.Nullable java.lang.Float r2) {
            io.realm.RealmAny r0 = new io.realm.RealmAny
            if (r2 != 0) goto La
            io.realm.NullRealmAnyOperator r2 = new io.realm.NullRealmAnyOperator
            r2.<init>()
            goto L10
        La:
            io.realm.FloatRealmAnyOperator r1 = new io.realm.FloatRealmAnyOperator
            r1.<init>(r2)
            r2 = r1
        L10:
            r0.<init>(r2)
            return r0
    }

    public static io.realm.RealmAny valueOf(@javax.annotation.Nullable java.lang.Integer r2) {
            io.realm.RealmAny r0 = new io.realm.RealmAny
            if (r2 != 0) goto La
            io.realm.NullRealmAnyOperator r2 = new io.realm.NullRealmAnyOperator
            r2.<init>()
            goto L10
        La:
            io.realm.IntegerRealmAnyOperator r1 = new io.realm.IntegerRealmAnyOperator
            r1.<init>(r2)
            r2 = r1
        L10:
            r0.<init>(r2)
            return r0
    }

    public static io.realm.RealmAny valueOf(@javax.annotation.Nullable java.lang.Long r2) {
            io.realm.RealmAny r0 = new io.realm.RealmAny
            if (r2 != 0) goto La
            io.realm.NullRealmAnyOperator r2 = new io.realm.NullRealmAnyOperator
            r2.<init>()
            goto L10
        La:
            io.realm.IntegerRealmAnyOperator r1 = new io.realm.IntegerRealmAnyOperator
            r1.<init>(r2)
            r2 = r1
        L10:
            r0.<init>(r2)
            return r0
    }

    public static io.realm.RealmAny valueOf(@javax.annotation.Nullable java.lang.Object r2) {
            if (r2 != 0) goto L7
            io.realm.RealmAny r2 = nullValue()
            return r2
        L7:
            boolean r0 = r2 instanceof java.lang.Boolean
            if (r0 == 0) goto L12
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            io.realm.RealmAny r2 = valueOf(r2)
            return r2
        L12:
            boolean r0 = r2 instanceof java.lang.Byte
            if (r0 == 0) goto L1d
            java.lang.Byte r2 = (java.lang.Byte) r2
            io.realm.RealmAny r2 = valueOf(r2)
            return r2
        L1d:
            boolean r0 = r2 instanceof java.lang.Short
            if (r0 == 0) goto L28
            java.lang.Short r2 = (java.lang.Short) r2
            io.realm.RealmAny r2 = valueOf(r2)
            return r2
        L28:
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 == 0) goto L33
            java.lang.Integer r2 = (java.lang.Integer) r2
            io.realm.RealmAny r2 = valueOf(r2)
            return r2
        L33:
            boolean r0 = r2 instanceof java.lang.Long
            if (r0 == 0) goto L3e
            java.lang.Long r2 = (java.lang.Long) r2
            io.realm.RealmAny r2 = valueOf(r2)
            return r2
        L3e:
            boolean r0 = r2 instanceof java.lang.Float
            if (r0 == 0) goto L49
            java.lang.Float r2 = (java.lang.Float) r2
            io.realm.RealmAny r2 = valueOf(r2)
            return r2
        L49:
            boolean r0 = r2 instanceof java.lang.Double
            if (r0 == 0) goto L54
            java.lang.Double r2 = (java.lang.Double) r2
            io.realm.RealmAny r2 = valueOf(r2)
            return r2
        L54:
            boolean r0 = r2 instanceof org.bson.types.Decimal128
            if (r0 == 0) goto L5f
            org.bson.types.Decimal128 r2 = (org.bson.types.Decimal128) r2
            io.realm.RealmAny r2 = valueOf(r2)
            return r2
        L5f:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L6a
            java.lang.String r2 = (java.lang.String) r2
            io.realm.RealmAny r2 = valueOf(r2)
            return r2
        L6a:
            boolean r0 = r2 instanceof byte[]
            if (r0 == 0) goto L75
            byte[] r2 = (byte[]) r2
            io.realm.RealmAny r2 = valueOf(r2)
            return r2
        L75:
            boolean r0 = r2 instanceof java.util.Date
            if (r0 == 0) goto L80
            java.util.Date r2 = (java.util.Date) r2
            io.realm.RealmAny r2 = valueOf(r2)
            return r2
        L80:
            boolean r0 = r2 instanceof org.bson.types.ObjectId
            if (r0 == 0) goto L8b
            org.bson.types.ObjectId r2 = (org.bson.types.ObjectId) r2
            io.realm.RealmAny r2 = valueOf(r2)
            return r2
        L8b:
            boolean r0 = r2 instanceof java.util.UUID
            if (r0 == 0) goto L96
            java.util.UUID r2 = (java.util.UUID) r2
            io.realm.RealmAny r2 = valueOf(r2)
            return r2
        L96:
            boolean r0 = r2 instanceof io.realm.RealmAny
            if (r0 == 0) goto L9d
            io.realm.RealmAny r2 = (io.realm.RealmAny) r2
            return r2
        L9d:
            java.lang.Class<io.realm.RealmModel> r0 = io.realm.RealmModel.class
            java.lang.Class r1 = r2.getClass()
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto Lc4
            io.realm.RealmModel r2 = (io.realm.RealmModel) r2
            boolean r0 = io.realm.RealmObject.isValid(r2)
            if (r0 == 0) goto Lbc
            boolean r0 = io.realm.RealmObject.isManaged(r2)
            if (r0 == 0) goto Lbc
            io.realm.RealmAny r2 = valueOf(r2)
            return r2
        Lbc:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "RealmObject is not a valid managed object."
            r2.<init>(r0)
            throw r2
        Lc4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Type not supported on RealmAny: "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
    }

    public static io.realm.RealmAny valueOf(@javax.annotation.Nullable java.lang.Short r2) {
            io.realm.RealmAny r0 = new io.realm.RealmAny
            if (r2 != 0) goto La
            io.realm.NullRealmAnyOperator r2 = new io.realm.NullRealmAnyOperator
            r2.<init>()
            goto L10
        La:
            io.realm.IntegerRealmAnyOperator r1 = new io.realm.IntegerRealmAnyOperator
            r1.<init>(r2)
            r2 = r1
        L10:
            r0.<init>(r2)
            return r0
    }

    public static io.realm.RealmAny valueOf(@javax.annotation.Nullable java.lang.String r2) {
            io.realm.RealmAny r0 = new io.realm.RealmAny
            if (r2 != 0) goto La
            io.realm.NullRealmAnyOperator r2 = new io.realm.NullRealmAnyOperator
            r2.<init>()
            goto L10
        La:
            io.realm.StringRealmAnyOperator r1 = new io.realm.StringRealmAnyOperator
            r1.<init>(r2)
            r2 = r1
        L10:
            r0.<init>(r2)
            return r0
    }

    public static io.realm.RealmAny valueOf(@javax.annotation.Nullable java.util.Date r2) {
            io.realm.RealmAny r0 = new io.realm.RealmAny
            if (r2 != 0) goto La
            io.realm.NullRealmAnyOperator r2 = new io.realm.NullRealmAnyOperator
            r2.<init>()
            goto L10
        La:
            io.realm.DateRealmAnyOperator r1 = new io.realm.DateRealmAnyOperator
            r1.<init>(r2)
            r2 = r1
        L10:
            r0.<init>(r2)
            return r0
    }

    public static io.realm.RealmAny valueOf(@javax.annotation.Nullable java.util.UUID r2) {
            io.realm.RealmAny r0 = new io.realm.RealmAny
            if (r2 != 0) goto La
            io.realm.NullRealmAnyOperator r2 = new io.realm.NullRealmAnyOperator
            r2.<init>()
            goto L10
        La:
            io.realm.UUIDRealmAnyOperator r1 = new io.realm.UUIDRealmAnyOperator
            r1.<init>(r2)
            r2 = r1
        L10:
            r0.<init>(r2)
            return r0
    }

    public static io.realm.RealmAny valueOf(@javax.annotation.Nullable org.bson.types.Decimal128 r2) {
            io.realm.RealmAny r0 = new io.realm.RealmAny
            if (r2 != 0) goto La
            io.realm.NullRealmAnyOperator r2 = new io.realm.NullRealmAnyOperator
            r2.<init>()
            goto L10
        La:
            io.realm.Decimal128RealmAnyOperator r1 = new io.realm.Decimal128RealmAnyOperator
            r1.<init>(r2)
            r2 = r1
        L10:
            r0.<init>(r2)
            return r0
    }

    public static io.realm.RealmAny valueOf(@javax.annotation.Nullable org.bson.types.ObjectId r2) {
            io.realm.RealmAny r0 = new io.realm.RealmAny
            if (r2 != 0) goto La
            io.realm.NullRealmAnyOperator r2 = new io.realm.NullRealmAnyOperator
            r2.<init>()
            goto L10
        La:
            io.realm.ObjectIdRealmAnyOperator r1 = new io.realm.ObjectIdRealmAnyOperator
            r1.<init>(r2)
            r2 = r1
        L10:
            r0.<init>(r2)
            return r0
    }

    public static io.realm.RealmAny valueOf(@javax.annotation.Nullable byte[] r2) {
            io.realm.RealmAny r0 = new io.realm.RealmAny
            if (r2 != 0) goto La
            io.realm.NullRealmAnyOperator r2 = new io.realm.NullRealmAnyOperator
            r2.<init>()
            goto L10
        La:
            io.realm.BinaryRealmAnyOperator r1 = new io.realm.BinaryRealmAnyOperator
            r1.<init>(r2)
            r2 = r1
        L10:
            r0.<init>(r2)
            return r0
    }

    public byte[] asBinary() {
            r2 = this;
            io.realm.RealmAnyOperator r0 = r2.operator
            java.lang.Class<byte[]> r1 = byte[].class
            java.lang.Object r0 = r0.getValue(r1)
            byte[] r0 = (byte[]) r0
            return r0
    }

    public java.lang.Boolean asBoolean() {
            r2 = this;
            io.realm.RealmAnyOperator r0 = r2.operator
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            java.lang.Object r0 = r0.getValue(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            return r0
    }

    public java.lang.Byte asByte() {
            r2 = this;
            io.realm.RealmAnyOperator r0 = r2.operator
            java.lang.Class<java.lang.Number> r1 = java.lang.Number.class
            java.lang.Object r0 = r0.getValue(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 != 0) goto Le
            r0 = 0
            goto L16
        Le:
            byte r0 = r0.byteValue()
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
        L16:
            return r0
    }

    public java.util.Date asDate() {
            r2 = this;
            io.realm.RealmAnyOperator r0 = r2.operator
            java.lang.Class<java.util.Date> r1 = java.util.Date.class
            java.lang.Object r0 = r0.getValue(r1)
            java.util.Date r0 = (java.util.Date) r0
            return r0
    }

    public org.bson.types.Decimal128 asDecimal128() {
            r2 = this;
            io.realm.RealmAnyOperator r0 = r2.operator
            java.lang.Class<org.bson.types.Decimal128> r1 = org.bson.types.Decimal128.class
            java.lang.Object r0 = r0.getValue(r1)
            org.bson.types.Decimal128 r0 = (org.bson.types.Decimal128) r0
            return r0
    }

    public java.lang.Double asDouble() {
            r2 = this;
            io.realm.RealmAnyOperator r0 = r2.operator
            java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
            java.lang.Object r0 = r0.getValue(r1)
            java.lang.Double r0 = (java.lang.Double) r0
            return r0
    }

    public java.lang.Float asFloat() {
            r2 = this;
            io.realm.RealmAnyOperator r0 = r2.operator
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            java.lang.Object r0 = r0.getValue(r1)
            java.lang.Float r0 = (java.lang.Float) r0
            return r0
    }

    public java.lang.Integer asInteger() {
            r2 = this;
            io.realm.RealmAnyOperator r0 = r2.operator
            java.lang.Class<java.lang.Number> r1 = java.lang.Number.class
            java.lang.Object r0 = r0.getValue(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 != 0) goto Le
            r0 = 0
            goto L16
        Le:
            int r0 = r0.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L16:
            return r0
    }

    public java.lang.Long asLong() {
            r2 = this;
            io.realm.RealmAnyOperator r0 = r2.operator
            java.lang.Class<java.lang.Number> r1 = java.lang.Number.class
            java.lang.Object r0 = r0.getValue(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 != 0) goto Le
            r0 = 0
            goto L16
        Le:
            long r0 = r0.longValue()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L16:
            return r0
    }

    public org.bson.types.ObjectId asObjectId() {
            r2 = this;
            io.realm.RealmAnyOperator r0 = r2.operator
            java.lang.Class<org.bson.types.ObjectId> r1 = org.bson.types.ObjectId.class
            java.lang.Object r0 = r0.getValue(r1)
            org.bson.types.ObjectId r0 = (org.bson.types.ObjectId) r0
            return r0
    }

    public <T extends io.realm.RealmModel> T asRealmModel(java.lang.Class<T> r2) {
            r1 = this;
            io.realm.RealmAnyOperator r0 = r1.operator
            java.lang.Object r2 = r0.getValue(r2)
            io.realm.RealmModel r2 = (io.realm.RealmModel) r2
            return r2
    }

    public java.lang.Short asShort() {
            r2 = this;
            io.realm.RealmAnyOperator r0 = r2.operator
            java.lang.Class<java.lang.Number> r1 = java.lang.Number.class
            java.lang.Object r0 = r0.getValue(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 != 0) goto Le
            r0 = 0
            goto L16
        Le:
            short r0 = r0.shortValue()
            java.lang.Short r0 = java.lang.Short.valueOf(r0)
        L16:
            return r0
    }

    public java.lang.String asString() {
            r2 = this;
            io.realm.RealmAnyOperator r0 = r2.operator
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.Object r0 = r0.getValue(r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public java.util.UUID asUUID() {
            r2 = this;
            io.realm.RealmAnyOperator r0 = r2.operator
            java.lang.Class<java.util.UUID> r1 = java.util.UUID.class
            java.lang.Object r0 = r0.getValue(r1)
            java.util.UUID r0 = (java.util.UUID) r0
            return r0
    }

    public final void checkValidObject(io.realm.BaseRealm r2) {
            r1 = this;
            io.realm.RealmAnyOperator r0 = r1.operator
            r0.checkValidObject(r2)
            return
    }

    public final boolean coercedEquals(@javax.annotation.Nullable io.realm.RealmAny r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            io.realm.RealmAnyOperator r0 = r1.operator
            io.realm.RealmAnyOperator r2 = r2.operator
            boolean r2 = r0.coercedEquals(r2)
            return r2
    }

    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings({"NP_METHOD_PARAMETER_TIGHTENS_ANNOTATION"})
    public final boolean equals(@javax.annotation.Nullable java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof io.realm.RealmAny
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            io.realm.RealmAny r2 = (io.realm.RealmAny) r2
            io.realm.RealmAnyOperator r0 = r1.operator
            io.realm.RealmAnyOperator r2 = r2.operator
            boolean r2 = r0.equals(r2)
            return r2
    }

    public final long getNativePtr() {
            r2 = this;
            io.realm.RealmAnyOperator r0 = r2.operator
            long r0 = r0.getNativePtr()
            return r0
    }

    public io.realm.RealmAny.Type getType() {
            r1 = this;
            io.realm.RealmAnyOperator r0 = r1.operator
            io.realm.RealmAny$Type r0 = r0.getType()
            return r0
    }

    @javax.annotation.Nullable
    public java.lang.Class<?> getValueClass() {
            r1 = this;
            io.realm.RealmAnyOperator r0 = r1.operator
            java.lang.Class r0 = r0.getTypedClass()
            return r0
    }

    public final int hashCode() {
            r1 = this;
            io.realm.RealmAnyOperator r0 = r1.operator
            int r0 = r0.hashCode()
            return r0
    }

    public boolean isNull() {
            r2 = this;
            io.realm.RealmAny$Type r0 = r2.getType()
            io.realm.RealmAny$Type r1 = io.realm.RealmAny.Type.NULL
            if (r0 != r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            io.realm.RealmAnyOperator r0 = r1.operator
            java.lang.String r0 = r0.toString()
            return r0
    }
}
