package org.bson;

/* JADX INFO: loaded from: classes3.dex */
public final enum UuidRepresentation extends java.lang.Enum<org.bson.UuidRepresentation> {
    private static final /* synthetic */ org.bson.UuidRepresentation[] $VALUES = null;
    public static final org.bson.UuidRepresentation C_SHARP_LEGACY = null;
    public static final org.bson.UuidRepresentation JAVA_LEGACY = null;
    public static final org.bson.UuidRepresentation PYTHON_LEGACY = null;
    public static final org.bson.UuidRepresentation STANDARD = null;
    public static final org.bson.UuidRepresentation UNSPECIFIED = null;

    static {
            org.bson.UuidRepresentation r0 = new org.bson.UuidRepresentation
            java.lang.String r1 = "UNSPECIFIED"
            r2 = 0
            r0.<init>(r1, r2)
            org.bson.UuidRepresentation.UNSPECIFIED = r0
            org.bson.UuidRepresentation r1 = new org.bson.UuidRepresentation
            java.lang.String r3 = "STANDARD"
            r4 = 1
            r1.<init>(r3, r4)
            org.bson.UuidRepresentation.STANDARD = r1
            org.bson.UuidRepresentation r3 = new org.bson.UuidRepresentation
            java.lang.String r5 = "C_SHARP_LEGACY"
            r6 = 2
            r3.<init>(r5, r6)
            org.bson.UuidRepresentation.C_SHARP_LEGACY = r3
            org.bson.UuidRepresentation r5 = new org.bson.UuidRepresentation
            java.lang.String r7 = "JAVA_LEGACY"
            r8 = 3
            r5.<init>(r7, r8)
            org.bson.UuidRepresentation.JAVA_LEGACY = r5
            org.bson.UuidRepresentation r7 = new org.bson.UuidRepresentation
            java.lang.String r9 = "PYTHON_LEGACY"
            r10 = 4
            r7.<init>(r9, r10)
            org.bson.UuidRepresentation.PYTHON_LEGACY = r7
            r9 = 5
            org.bson.UuidRepresentation[] r9 = new org.bson.UuidRepresentation[r9]
            r9[r2] = r0
            r9[r4] = r1
            r9[r6] = r3
            r9[r8] = r5
            r9[r10] = r7
            org.bson.UuidRepresentation.$VALUES = r9
            return
    }

    private UuidRepresentation(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static org.bson.UuidRepresentation valueOf(java.lang.String r1) {
            java.lang.Class<org.bson.UuidRepresentation> r0 = org.bson.UuidRepresentation.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            org.bson.UuidRepresentation r1 = (org.bson.UuidRepresentation) r1
            return r1
    }

    public static org.bson.UuidRepresentation[] values() {
            org.bson.UuidRepresentation[] r0 = org.bson.UuidRepresentation.$VALUES
            java.lang.Object r0 = r0.clone()
            org.bson.UuidRepresentation[] r0 = (org.bson.UuidRepresentation[]) r0
            return r0
    }
}
