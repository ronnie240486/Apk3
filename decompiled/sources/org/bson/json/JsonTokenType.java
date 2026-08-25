package org.bson.json;

/* JADX INFO: loaded from: classes3.dex */
final enum JsonTokenType extends java.lang.Enum<org.bson.json.JsonTokenType> {
    private static final /* synthetic */ org.bson.json.JsonTokenType[] $VALUES = null;
    public static final org.bson.json.JsonTokenType BEGIN_ARRAY = null;
    public static final org.bson.json.JsonTokenType BEGIN_OBJECT = null;
    public static final org.bson.json.JsonTokenType COLON = null;
    public static final org.bson.json.JsonTokenType COMMA = null;
    public static final org.bson.json.JsonTokenType DOUBLE = null;
    public static final org.bson.json.JsonTokenType END_ARRAY = null;
    public static final org.bson.json.JsonTokenType END_OBJECT = null;
    public static final org.bson.json.JsonTokenType END_OF_FILE = null;
    public static final org.bson.json.JsonTokenType INT32 = null;
    public static final org.bson.json.JsonTokenType INT64 = null;
    public static final org.bson.json.JsonTokenType INVALID = null;
    public static final org.bson.json.JsonTokenType LEFT_PAREN = null;
    public static final org.bson.json.JsonTokenType REGULAR_EXPRESSION = null;
    public static final org.bson.json.JsonTokenType RIGHT_PAREN = null;
    public static final org.bson.json.JsonTokenType STRING = null;
    public static final org.bson.json.JsonTokenType UNQUOTED_STRING = null;

    static {
            org.bson.json.JsonTokenType r0 = new org.bson.json.JsonTokenType
            java.lang.String r1 = "INVALID"
            r2 = 0
            r0.<init>(r1, r2)
            org.bson.json.JsonTokenType.INVALID = r0
            org.bson.json.JsonTokenType r1 = new org.bson.json.JsonTokenType
            java.lang.String r3 = "BEGIN_ARRAY"
            r4 = 1
            r1.<init>(r3, r4)
            org.bson.json.JsonTokenType.BEGIN_ARRAY = r1
            org.bson.json.JsonTokenType r3 = new org.bson.json.JsonTokenType
            java.lang.String r5 = "BEGIN_OBJECT"
            r6 = 2
            r3.<init>(r5, r6)
            org.bson.json.JsonTokenType.BEGIN_OBJECT = r3
            org.bson.json.JsonTokenType r5 = new org.bson.json.JsonTokenType
            java.lang.String r7 = "END_ARRAY"
            r8 = 3
            r5.<init>(r7, r8)
            org.bson.json.JsonTokenType.END_ARRAY = r5
            org.bson.json.JsonTokenType r7 = new org.bson.json.JsonTokenType
            java.lang.String r9 = "LEFT_PAREN"
            r10 = 4
            r7.<init>(r9, r10)
            org.bson.json.JsonTokenType.LEFT_PAREN = r7
            org.bson.json.JsonTokenType r9 = new org.bson.json.JsonTokenType
            java.lang.String r11 = "RIGHT_PAREN"
            r12 = 5
            r9.<init>(r11, r12)
            org.bson.json.JsonTokenType.RIGHT_PAREN = r9
            org.bson.json.JsonTokenType r11 = new org.bson.json.JsonTokenType
            java.lang.String r13 = "END_OBJECT"
            r14 = 6
            r11.<init>(r13, r14)
            org.bson.json.JsonTokenType.END_OBJECT = r11
            org.bson.json.JsonTokenType r13 = new org.bson.json.JsonTokenType
            java.lang.String r15 = "COLON"
            r14 = 7
            r13.<init>(r15, r14)
            org.bson.json.JsonTokenType.COLON = r13
            org.bson.json.JsonTokenType r15 = new org.bson.json.JsonTokenType
            java.lang.String r14 = "COMMA"
            r12 = 8
            r15.<init>(r14, r12)
            org.bson.json.JsonTokenType.COMMA = r15
            org.bson.json.JsonTokenType r14 = new org.bson.json.JsonTokenType
            java.lang.String r12 = "DOUBLE"
            r10 = 9
            r14.<init>(r12, r10)
            org.bson.json.JsonTokenType.DOUBLE = r14
            org.bson.json.JsonTokenType r12 = new org.bson.json.JsonTokenType
            java.lang.String r10 = "INT32"
            r8 = 10
            r12.<init>(r10, r8)
            org.bson.json.JsonTokenType.INT32 = r12
            org.bson.json.JsonTokenType r10 = new org.bson.json.JsonTokenType
            java.lang.String r8 = "INT64"
            r6 = 11
            r10.<init>(r8, r6)
            org.bson.json.JsonTokenType.INT64 = r10
            org.bson.json.JsonTokenType r8 = new org.bson.json.JsonTokenType
            java.lang.String r6 = "REGULAR_EXPRESSION"
            r4 = 12
            r8.<init>(r6, r4)
            org.bson.json.JsonTokenType.REGULAR_EXPRESSION = r8
            org.bson.json.JsonTokenType r6 = new org.bson.json.JsonTokenType
            java.lang.String r4 = "STRING"
            r2 = 13
            r6.<init>(r4, r2)
            org.bson.json.JsonTokenType.STRING = r6
            org.bson.json.JsonTokenType r4 = new org.bson.json.JsonTokenType
            java.lang.String r2 = "UNQUOTED_STRING"
            r17 = r6
            r6 = 14
            r4.<init>(r2, r6)
            org.bson.json.JsonTokenType.UNQUOTED_STRING = r4
            org.bson.json.JsonTokenType r2 = new org.bson.json.JsonTokenType
            java.lang.String r6 = "END_OF_FILE"
            r18 = r4
            r4 = 15
            r2.<init>(r6, r4)
            org.bson.json.JsonTokenType.END_OF_FILE = r2
            r6 = 16
            org.bson.json.JsonTokenType[] r6 = new org.bson.json.JsonTokenType[r6]
            r16 = 0
            r6[r16] = r0
            r0 = 1
            r6[r0] = r1
            r0 = 2
            r6[r0] = r3
            r0 = 3
            r6[r0] = r5
            r0 = 4
            r6[r0] = r7
            r0 = 5
            r6[r0] = r9
            r0 = 6
            r6[r0] = r11
            r0 = 7
            r6[r0] = r13
            r0 = 8
            r6[r0] = r15
            r0 = 9
            r6[r0] = r14
            r0 = 10
            r6[r0] = r12
            r0 = 11
            r6[r0] = r10
            r0 = 12
            r6[r0] = r8
            r0 = 13
            r6[r0] = r17
            r0 = 14
            r6[r0] = r18
            r6[r4] = r2
            org.bson.json.JsonTokenType.$VALUES = r6
            return
    }

    private JsonTokenType(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static org.bson.json.JsonTokenType valueOf(java.lang.String r1) {
            java.lang.Class<org.bson.json.JsonTokenType> r0 = org.bson.json.JsonTokenType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            org.bson.json.JsonTokenType r1 = (org.bson.json.JsonTokenType) r1
            return r1
    }

    public static org.bson.json.JsonTokenType[] values() {
            org.bson.json.JsonTokenType[] r0 = org.bson.json.JsonTokenType.$VALUES
            java.lang.Object r0 = r0.clone()
            org.bson.json.JsonTokenType[] r0 = (org.bson.json.JsonTokenType[]) r0
            return r0
    }
}
