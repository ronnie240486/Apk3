package org.bson;

/* JADX INFO: loaded from: classes3.dex */
public final enum BsonBinarySubType extends java.lang.Enum<org.bson.BsonBinarySubType> {
    private static final /* synthetic */ org.bson.BsonBinarySubType[] $VALUES = null;
    public static final org.bson.BsonBinarySubType BINARY = null;
    public static final org.bson.BsonBinarySubType FUNCTION = null;
    public static final org.bson.BsonBinarySubType MD5 = null;
    public static final org.bson.BsonBinarySubType OLD_BINARY = null;
    public static final org.bson.BsonBinarySubType USER_DEFINED = null;
    public static final org.bson.BsonBinarySubType UUID_LEGACY = null;
    public static final org.bson.BsonBinarySubType UUID_STANDARD = null;
    private final byte value;

    static {
            org.bson.BsonBinarySubType r0 = new org.bson.BsonBinarySubType
            java.lang.String r1 = "BINARY"
            r2 = 0
            r0.<init>(r1, r2, r2)
            org.bson.BsonBinarySubType.BINARY = r0
            org.bson.BsonBinarySubType r1 = new org.bson.BsonBinarySubType
            java.lang.String r3 = "FUNCTION"
            r4 = 1
            r1.<init>(r3, r4, r4)
            org.bson.BsonBinarySubType.FUNCTION = r1
            org.bson.BsonBinarySubType r3 = new org.bson.BsonBinarySubType
            java.lang.String r5 = "OLD_BINARY"
            r6 = 2
            r3.<init>(r5, r6, r6)
            org.bson.BsonBinarySubType.OLD_BINARY = r3
            org.bson.BsonBinarySubType r5 = new org.bson.BsonBinarySubType
            java.lang.String r7 = "UUID_LEGACY"
            r8 = 3
            r5.<init>(r7, r8, r8)
            org.bson.BsonBinarySubType.UUID_LEGACY = r5
            org.bson.BsonBinarySubType r7 = new org.bson.BsonBinarySubType
            java.lang.String r9 = "UUID_STANDARD"
            r10 = 4
            r7.<init>(r9, r10, r10)
            org.bson.BsonBinarySubType.UUID_STANDARD = r7
            org.bson.BsonBinarySubType r9 = new org.bson.BsonBinarySubType
            java.lang.String r11 = "MD5"
            r12 = 5
            r9.<init>(r11, r12, r12)
            org.bson.BsonBinarySubType.MD5 = r9
            org.bson.BsonBinarySubType r11 = new org.bson.BsonBinarySubType
            java.lang.String r13 = "USER_DEFINED"
            r14 = 6
            r15 = -128(0xffffffffffffff80, float:NaN)
            r11.<init>(r13, r14, r15)
            org.bson.BsonBinarySubType.USER_DEFINED = r11
            r13 = 7
            org.bson.BsonBinarySubType[] r13 = new org.bson.BsonBinarySubType[r13]
            r13[r2] = r0
            r13[r4] = r1
            r13[r6] = r3
            r13[r8] = r5
            r13[r10] = r7
            r13[r12] = r9
            r13[r14] = r11
            org.bson.BsonBinarySubType.$VALUES = r13
            return
    }

    private BsonBinarySubType(java.lang.String r1, int r2, byte r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    public static boolean isUuid(byte r1) {
            org.bson.BsonBinarySubType r0 = org.bson.BsonBinarySubType.UUID_LEGACY
            byte r0 = r0.getValue()
            if (r1 == r0) goto L13
            org.bson.BsonBinarySubType r0 = org.bson.BsonBinarySubType.UUID_STANDARD
            byte r0 = r0.getValue()
            if (r1 != r0) goto L11
            goto L13
        L11:
            r1 = 0
            goto L14
        L13:
            r1 = 1
        L14:
            return r1
    }

    public static org.bson.BsonBinarySubType valueOf(java.lang.String r1) {
            java.lang.Class<org.bson.BsonBinarySubType> r0 = org.bson.BsonBinarySubType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            org.bson.BsonBinarySubType r1 = (org.bson.BsonBinarySubType) r1
            return r1
    }

    public static org.bson.BsonBinarySubType[] values() {
            org.bson.BsonBinarySubType[] r0 = org.bson.BsonBinarySubType.$VALUES
            java.lang.Object r0 = r0.clone()
            org.bson.BsonBinarySubType[] r0 = (org.bson.BsonBinarySubType[]) r0
            return r0
    }

    public byte getValue() {
            r1 = this;
            byte r0 = r1.value
            return r0
    }
}
