package io.realm;

/* JADX INFO: loaded from: classes3.dex */
public final enum FieldAttribute extends java.lang.Enum<io.realm.FieldAttribute> {
    private static final /* synthetic */ io.realm.FieldAttribute[] $VALUES = null;
    public static final io.realm.FieldAttribute INDEXED = null;
    public static final io.realm.FieldAttribute PRIMARY_KEY = null;
    public static final io.realm.FieldAttribute REQUIRED = null;

    static {
            io.realm.FieldAttribute r0 = new io.realm.FieldAttribute
            java.lang.String r1 = "INDEXED"
            r2 = 0
            r0.<init>(r1, r2)
            io.realm.FieldAttribute.INDEXED = r0
            io.realm.FieldAttribute r1 = new io.realm.FieldAttribute
            java.lang.String r3 = "PRIMARY_KEY"
            r4 = 1
            r1.<init>(r3, r4)
            io.realm.FieldAttribute.PRIMARY_KEY = r1
            io.realm.FieldAttribute r3 = new io.realm.FieldAttribute
            java.lang.String r5 = "REQUIRED"
            r6 = 2
            r3.<init>(r5, r6)
            io.realm.FieldAttribute.REQUIRED = r3
            r5 = 3
            io.realm.FieldAttribute[] r5 = new io.realm.FieldAttribute[r5]
            r5[r2] = r0
            r5[r4] = r1
            r5[r6] = r3
            io.realm.FieldAttribute.$VALUES = r5
            return
    }

    private FieldAttribute(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static io.realm.FieldAttribute valueOf(java.lang.String r1) {
            java.lang.Class<io.realm.FieldAttribute> r0 = io.realm.FieldAttribute.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.realm.FieldAttribute r1 = (io.realm.FieldAttribute) r1
            return r1
    }

    public static io.realm.FieldAttribute[] values() {
            io.realm.FieldAttribute[] r0 = io.realm.FieldAttribute.$VALUES
            java.lang.Object r0 = r0.clone()
            io.realm.FieldAttribute[] r0 = (io.realm.FieldAttribute[]) r0
            return r0
    }
}
