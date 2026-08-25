package org.bson.json;

/* JADX INFO: loaded from: classes2.dex */
public final enum JsonMode extends java.lang.Enum<org.bson.json.JsonMode> {
    private static final /* synthetic */ org.bson.json.JsonMode[] $VALUES = null;
    public static final org.bson.json.JsonMode EXTENDED = null;
    public static final org.bson.json.JsonMode RELAXED = null;
    public static final org.bson.json.JsonMode SHELL = null;

    @java.lang.Deprecated
    public static final org.bson.json.JsonMode STRICT = null;

    static {
            org.bson.json.JsonMode r0 = new org.bson.json.JsonMode
            java.lang.String r1 = "STRICT"
            r2 = 0
            r0.<init>(r1, r2)
            org.bson.json.JsonMode.STRICT = r0
            org.bson.json.JsonMode r1 = new org.bson.json.JsonMode
            java.lang.String r3 = "SHELL"
            r4 = 1
            r1.<init>(r3, r4)
            org.bson.json.JsonMode.SHELL = r1
            org.bson.json.JsonMode r3 = new org.bson.json.JsonMode
            java.lang.String r5 = "EXTENDED"
            r6 = 2
            r3.<init>(r5, r6)
            org.bson.json.JsonMode.EXTENDED = r3
            org.bson.json.JsonMode r5 = new org.bson.json.JsonMode
            java.lang.String r7 = "RELAXED"
            r8 = 3
            r5.<init>(r7, r8)
            org.bson.json.JsonMode.RELAXED = r5
            r7 = 4
            org.bson.json.JsonMode[] r7 = new org.bson.json.JsonMode[r7]
            r7[r2] = r0
            r7[r4] = r1
            r7[r6] = r3
            r7[r8] = r5
            org.bson.json.JsonMode.$VALUES = r7
            return
    }

    private JsonMode(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static org.bson.json.JsonMode valueOf(java.lang.String r1) {
            java.lang.Class<org.bson.json.JsonMode> r0 = org.bson.json.JsonMode.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            org.bson.json.JsonMode r1 = (org.bson.json.JsonMode) r1
            return r1
    }

    public static org.bson.json.JsonMode[] values() {
            org.bson.json.JsonMode[] r0 = org.bson.json.JsonMode.$VALUES
            java.lang.Object r0 = r0.clone()
            org.bson.json.JsonMode[] r0 = (org.bson.json.JsonMode[]) r0
            return r0
    }
}
