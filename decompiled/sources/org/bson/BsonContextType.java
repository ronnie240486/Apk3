package org.bson;

/* JADX INFO: loaded from: classes.dex */
public final enum BsonContextType extends java.lang.Enum<org.bson.BsonContextType> {
    private static final /* synthetic */ org.bson.BsonContextType[] $VALUES = null;
    public static final org.bson.BsonContextType ARRAY = null;
    public static final org.bson.BsonContextType DOCUMENT = null;
    public static final org.bson.BsonContextType JAVASCRIPT_WITH_SCOPE = null;
    public static final org.bson.BsonContextType SCOPE_DOCUMENT = null;
    public static final org.bson.BsonContextType TOP_LEVEL = null;

    static {
            org.bson.BsonContextType r0 = new org.bson.BsonContextType
            java.lang.String r1 = "TOP_LEVEL"
            r2 = 0
            r0.<init>(r1, r2)
            org.bson.BsonContextType.TOP_LEVEL = r0
            org.bson.BsonContextType r1 = new org.bson.BsonContextType
            java.lang.String r3 = "DOCUMENT"
            r4 = 1
            r1.<init>(r3, r4)
            org.bson.BsonContextType.DOCUMENT = r1
            org.bson.BsonContextType r3 = new org.bson.BsonContextType
            java.lang.String r5 = "ARRAY"
            r6 = 2
            r3.<init>(r5, r6)
            org.bson.BsonContextType.ARRAY = r3
            org.bson.BsonContextType r5 = new org.bson.BsonContextType
            java.lang.String r7 = "JAVASCRIPT_WITH_SCOPE"
            r8 = 3
            r5.<init>(r7, r8)
            org.bson.BsonContextType.JAVASCRIPT_WITH_SCOPE = r5
            org.bson.BsonContextType r7 = new org.bson.BsonContextType
            java.lang.String r9 = "SCOPE_DOCUMENT"
            r10 = 4
            r7.<init>(r9, r10)
            org.bson.BsonContextType.SCOPE_DOCUMENT = r7
            r9 = 5
            org.bson.BsonContextType[] r9 = new org.bson.BsonContextType[r9]
            r9[r2] = r0
            r9[r4] = r1
            r9[r6] = r3
            r9[r8] = r5
            r9[r10] = r7
            org.bson.BsonContextType.$VALUES = r9
            return
    }

    private BsonContextType(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static org.bson.BsonContextType valueOf(java.lang.String r1) {
            java.lang.Class<org.bson.BsonContextType> r0 = org.bson.BsonContextType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            org.bson.BsonContextType r1 = (org.bson.BsonContextType) r1
            return r1
    }

    public static org.bson.BsonContextType[] values() {
            org.bson.BsonContextType[] r0 = org.bson.BsonContextType.$VALUES
            java.lang.Object r0 = r0.clone()
            org.bson.BsonContextType[] r0 = (org.bson.BsonContextType[]) r0
            return r0
    }
}
