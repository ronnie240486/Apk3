package org.bson;

/* JADX INFO: loaded from: classes3.dex */
public final enum BsonType extends java.lang.Enum<org.bson.BsonType> {
    private static final /* synthetic */ org.bson.BsonType[] $VALUES = null;
    public static final org.bson.BsonType ARRAY = null;
    public static final org.bson.BsonType BINARY = null;
    public static final org.bson.BsonType BOOLEAN = null;
    public static final org.bson.BsonType DATE_TIME = null;
    public static final org.bson.BsonType DB_POINTER = null;
    public static final org.bson.BsonType DECIMAL128 = null;
    public static final org.bson.BsonType DOCUMENT = null;
    public static final org.bson.BsonType DOUBLE = null;
    public static final org.bson.BsonType END_OF_DOCUMENT = null;
    public static final org.bson.BsonType INT32 = null;
    public static final org.bson.BsonType INT64 = null;
    public static final org.bson.BsonType JAVASCRIPT = null;
    public static final org.bson.BsonType JAVASCRIPT_WITH_SCOPE = null;
    private static final org.bson.BsonType[] LOOKUP_TABLE = null;
    public static final org.bson.BsonType MAX_KEY = null;
    public static final org.bson.BsonType MIN_KEY = null;
    public static final org.bson.BsonType NULL = null;
    public static final org.bson.BsonType OBJECT_ID = null;
    public static final org.bson.BsonType REGULAR_EXPRESSION = null;
    public static final org.bson.BsonType STRING = null;
    public static final org.bson.BsonType SYMBOL = null;
    public static final org.bson.BsonType TIMESTAMP = null;
    public static final org.bson.BsonType UNDEFINED = null;
    private final int value;

    static {
            org.bson.BsonType r0 = new org.bson.BsonType
            java.lang.String r1 = "END_OF_DOCUMENT"
            r2 = 0
            r0.<init>(r1, r2, r2)
            org.bson.BsonType.END_OF_DOCUMENT = r0
            org.bson.BsonType r1 = new org.bson.BsonType
            java.lang.String r3 = "DOUBLE"
            r4 = 1
            r1.<init>(r3, r4, r4)
            org.bson.BsonType.DOUBLE = r1
            org.bson.BsonType r3 = new org.bson.BsonType
            java.lang.String r5 = "STRING"
            r6 = 2
            r3.<init>(r5, r6, r6)
            org.bson.BsonType.STRING = r3
            org.bson.BsonType r5 = new org.bson.BsonType
            java.lang.String r7 = "DOCUMENT"
            r8 = 3
            r5.<init>(r7, r8, r8)
            org.bson.BsonType.DOCUMENT = r5
            org.bson.BsonType r7 = new org.bson.BsonType
            java.lang.String r9 = "ARRAY"
            r10 = 4
            r7.<init>(r9, r10, r10)
            org.bson.BsonType.ARRAY = r7
            org.bson.BsonType r9 = new org.bson.BsonType
            java.lang.String r11 = "BINARY"
            r12 = 5
            r9.<init>(r11, r12, r12)
            org.bson.BsonType.BINARY = r9
            org.bson.BsonType r11 = new org.bson.BsonType
            java.lang.String r13 = "UNDEFINED"
            r14 = 6
            r11.<init>(r13, r14, r14)
            org.bson.BsonType.UNDEFINED = r11
            org.bson.BsonType r13 = new org.bson.BsonType
            java.lang.String r15 = "OBJECT_ID"
            r14 = 7
            r13.<init>(r15, r14, r14)
            org.bson.BsonType.OBJECT_ID = r13
            org.bson.BsonType r15 = new org.bson.BsonType
            java.lang.String r14 = "BOOLEAN"
            r12 = 8
            r15.<init>(r14, r12, r12)
            org.bson.BsonType.BOOLEAN = r15
            org.bson.BsonType r14 = new org.bson.BsonType
            java.lang.String r12 = "DATE_TIME"
            r10 = 9
            r14.<init>(r12, r10, r10)
            org.bson.BsonType.DATE_TIME = r14
            org.bson.BsonType r12 = new org.bson.BsonType
            java.lang.String r10 = "NULL"
            r8 = 10
            r12.<init>(r10, r8, r8)
            org.bson.BsonType.NULL = r12
            org.bson.BsonType r10 = new org.bson.BsonType
            java.lang.String r8 = "REGULAR_EXPRESSION"
            r6 = 11
            r10.<init>(r8, r6, r6)
            org.bson.BsonType.REGULAR_EXPRESSION = r10
            org.bson.BsonType r8 = new org.bson.BsonType
            java.lang.String r6 = "DB_POINTER"
            r4 = 12
            r8.<init>(r6, r4, r4)
            org.bson.BsonType.DB_POINTER = r8
            org.bson.BsonType r6 = new org.bson.BsonType
            java.lang.String r4 = "JAVASCRIPT"
            r2 = 13
            r6.<init>(r4, r2, r2)
            org.bson.BsonType.JAVASCRIPT = r6
            org.bson.BsonType r4 = new org.bson.BsonType
            java.lang.String r2 = "SYMBOL"
            r16 = r6
            r6 = 14
            r4.<init>(r2, r6, r6)
            org.bson.BsonType.SYMBOL = r4
            org.bson.BsonType r2 = new org.bson.BsonType
            java.lang.String r6 = "JAVASCRIPT_WITH_SCOPE"
            r17 = r4
            r4 = 15
            r2.<init>(r6, r4, r4)
            org.bson.BsonType.JAVASCRIPT_WITH_SCOPE = r2
            org.bson.BsonType r6 = new org.bson.BsonType
            java.lang.String r4 = "INT32"
            r18 = r2
            r2 = 16
            r6.<init>(r4, r2, r2)
            org.bson.BsonType.INT32 = r6
            org.bson.BsonType r4 = new org.bson.BsonType
            java.lang.String r2 = "TIMESTAMP"
            r19 = r6
            r6 = 17
            r4.<init>(r2, r6, r6)
            org.bson.BsonType.TIMESTAMP = r4
            org.bson.BsonType r2 = new org.bson.BsonType
            java.lang.String r6 = "INT64"
            r20 = r4
            r4 = 18
            r2.<init>(r6, r4, r4)
            org.bson.BsonType.INT64 = r2
            org.bson.BsonType r6 = new org.bson.BsonType
            java.lang.String r4 = "DECIMAL128"
            r21 = r2
            r2 = 19
            r6.<init>(r4, r2, r2)
            org.bson.BsonType.DECIMAL128 = r6
            org.bson.BsonType r4 = new org.bson.BsonType
            java.lang.String r2 = "MIN_KEY"
            r22 = r6
            r6 = 20
            r23 = r8
            r8 = 255(0xff, float:3.57E-43)
            r4.<init>(r2, r6, r8)
            org.bson.BsonType.MIN_KEY = r4
            org.bson.BsonType r2 = new org.bson.BsonType
            java.lang.String r8 = "MAX_KEY"
            r6 = 21
            r24 = r4
            r4 = 127(0x7f, float:1.78E-43)
            r2.<init>(r8, r6, r4)
            org.bson.BsonType.MAX_KEY = r2
            r4 = 22
            org.bson.BsonType[] r4 = new org.bson.BsonType[r4]
            r8 = 0
            r4[r8] = r0
            r0 = 1
            r4[r0] = r1
            r0 = 2
            r4[r0] = r3
            r0 = 3
            r4[r0] = r5
            r0 = 4
            r4[r0] = r7
            r0 = 5
            r4[r0] = r9
            r0 = 6
            r4[r0] = r11
            r0 = 7
            r4[r0] = r13
            r0 = 8
            r4[r0] = r15
            r0 = 9
            r4[r0] = r14
            r0 = 10
            r4[r0] = r12
            r0 = 11
            r4[r0] = r10
            r0 = 12
            r4[r0] = r23
            r0 = 13
            r4[r0] = r16
            r0 = 14
            r4[r0] = r17
            r0 = 15
            r4[r0] = r18
            r0 = 16
            r4[r0] = r19
            r0 = 17
            r4[r0] = r20
            r0 = 18
            r4[r0] = r21
            r0 = 19
            r4[r0] = r22
            r0 = 20
            r4[r0] = r24
            r4[r6] = r2
            org.bson.BsonType.$VALUES = r4
            int r0 = r24.getValue()
            r1 = 1
            int r0 = r0 + r1
            org.bson.BsonType[] r0 = new org.bson.BsonType[r0]
            org.bson.BsonType.LOOKUP_TABLE = r0
            org.bson.BsonType[] r0 = values()
            int r1 = r0.length
            r2 = 0
        L164:
            if (r2 >= r1) goto L173
            r3 = r0[r2]
            org.bson.BsonType[] r4 = org.bson.BsonType.LOOKUP_TABLE
            int r5 = r3.getValue()
            r4[r5] = r3
            int r2 = r2 + 1
            goto L164
        L173:
            return
    }

    private BsonType(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    public static org.bson.BsonType findByValue(int r1) {
            org.bson.BsonType[] r0 = org.bson.BsonType.LOOKUP_TABLE
            r1 = r1 & 255(0xff, float:3.57E-43)
            r1 = r0[r1]
            return r1
    }

    public static org.bson.BsonType valueOf(java.lang.String r1) {
            java.lang.Class<org.bson.BsonType> r0 = org.bson.BsonType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            org.bson.BsonType r1 = (org.bson.BsonType) r1
            return r1
    }

    public static org.bson.BsonType[] values() {
            org.bson.BsonType[] r0 = org.bson.BsonType.$VALUES
            java.lang.Object r0 = r0.clone()
            org.bson.BsonType[] r0 = (org.bson.BsonType[]) r0
            return r0
    }

    public int getValue() {
            r1 = this;
            int r0 = r1.value
            return r0
    }

    public boolean isContainer() {
            r1 = this;
            org.bson.BsonType r0 = org.bson.BsonType.DOCUMENT
            if (r1 == r0) goto Lb
            org.bson.BsonType r0 = org.bson.BsonType.ARRAY
            if (r1 != r0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }
}
