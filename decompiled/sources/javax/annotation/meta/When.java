package javax.annotation.meta;

/* JADX INFO: loaded from: classes.dex */
public final enum When extends java.lang.Enum<javax.annotation.meta.When> {
    private static final /* synthetic */ javax.annotation.meta.When[] $VALUES = null;
    public static final javax.annotation.meta.When ALWAYS = null;
    public static final javax.annotation.meta.When MAYBE = null;
    public static final javax.annotation.meta.When NEVER = null;
    public static final javax.annotation.meta.When UNKNOWN = null;

    static {
            javax.annotation.meta.When r0 = new javax.annotation.meta.When
            java.lang.String r1 = "ALWAYS"
            r2 = 0
            r0.<init>(r1, r2)
            javax.annotation.meta.When.ALWAYS = r0
            javax.annotation.meta.When r1 = new javax.annotation.meta.When
            java.lang.String r3 = "UNKNOWN"
            r4 = 1
            r1.<init>(r3, r4)
            javax.annotation.meta.When.UNKNOWN = r1
            javax.annotation.meta.When r3 = new javax.annotation.meta.When
            java.lang.String r5 = "MAYBE"
            r6 = 2
            r3.<init>(r5, r6)
            javax.annotation.meta.When.MAYBE = r3
            javax.annotation.meta.When r5 = new javax.annotation.meta.When
            java.lang.String r7 = "NEVER"
            r8 = 3
            r5.<init>(r7, r8)
            javax.annotation.meta.When.NEVER = r5
            r7 = 4
            javax.annotation.meta.When[] r7 = new javax.annotation.meta.When[r7]
            r7[r2] = r0
            r7[r4] = r1
            r7[r6] = r3
            r7[r8] = r5
            javax.annotation.meta.When.$VALUES = r7
            return
    }

    private When(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static javax.annotation.meta.When valueOf(java.lang.String r1) {
            java.lang.Class<javax.annotation.meta.When> r0 = javax.annotation.meta.When.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            javax.annotation.meta.When r1 = (javax.annotation.meta.When) r1
            return r1
    }

    public static javax.annotation.meta.When[] values() {
            javax.annotation.meta.When[] r0 = javax.annotation.meta.When.$VALUES
            java.lang.Object r0 = r0.clone()
            javax.annotation.meta.When[] r0 = (javax.annotation.meta.When[]) r0
            return r0
    }
}
