package com.google.errorprone.annotations;

/* JADX INFO: loaded from: classes.dex */
public final enum Modifier extends java.lang.Enum<com.google.errorprone.annotations.Modifier> {
    private static final /* synthetic */ com.google.errorprone.annotations.Modifier[] $VALUES = null;
    public static final com.google.errorprone.annotations.Modifier ABSTRACT = null;
    public static final com.google.errorprone.annotations.Modifier DEFAULT = null;
    public static final com.google.errorprone.annotations.Modifier FINAL = null;
    public static final com.google.errorprone.annotations.Modifier NATIVE = null;
    public static final com.google.errorprone.annotations.Modifier PRIVATE = null;
    public static final com.google.errorprone.annotations.Modifier PROTECTED = null;
    public static final com.google.errorprone.annotations.Modifier PUBLIC = null;
    public static final com.google.errorprone.annotations.Modifier STATIC = null;
    public static final com.google.errorprone.annotations.Modifier STRICTFP = null;
    public static final com.google.errorprone.annotations.Modifier SYNCHRONIZED = null;
    public static final com.google.errorprone.annotations.Modifier TRANSIENT = null;
    public static final com.google.errorprone.annotations.Modifier VOLATILE = null;

    static {
            com.google.errorprone.annotations.Modifier r0 = new com.google.errorprone.annotations.Modifier
            java.lang.String r1 = "PUBLIC"
            r2 = 0
            r0.<init>(r1, r2)
            com.google.errorprone.annotations.Modifier.PUBLIC = r0
            com.google.errorprone.annotations.Modifier r1 = new com.google.errorprone.annotations.Modifier
            java.lang.String r3 = "PROTECTED"
            r4 = 1
            r1.<init>(r3, r4)
            com.google.errorprone.annotations.Modifier.PROTECTED = r1
            com.google.errorprone.annotations.Modifier r3 = new com.google.errorprone.annotations.Modifier
            java.lang.String r5 = "PRIVATE"
            r6 = 2
            r3.<init>(r5, r6)
            com.google.errorprone.annotations.Modifier.PRIVATE = r3
            com.google.errorprone.annotations.Modifier r5 = new com.google.errorprone.annotations.Modifier
            java.lang.String r7 = "ABSTRACT"
            r8 = 3
            r5.<init>(r7, r8)
            com.google.errorprone.annotations.Modifier.ABSTRACT = r5
            com.google.errorprone.annotations.Modifier r7 = new com.google.errorprone.annotations.Modifier
            java.lang.String r9 = "DEFAULT"
            r10 = 4
            r7.<init>(r9, r10)
            com.google.errorprone.annotations.Modifier.DEFAULT = r7
            com.google.errorprone.annotations.Modifier r9 = new com.google.errorprone.annotations.Modifier
            java.lang.String r11 = "STATIC"
            r12 = 5
            r9.<init>(r11, r12)
            com.google.errorprone.annotations.Modifier.STATIC = r9
            com.google.errorprone.annotations.Modifier r11 = new com.google.errorprone.annotations.Modifier
            java.lang.String r13 = "FINAL"
            r14 = 6
            r11.<init>(r13, r14)
            com.google.errorprone.annotations.Modifier.FINAL = r11
            com.google.errorprone.annotations.Modifier r13 = new com.google.errorprone.annotations.Modifier
            java.lang.String r15 = "TRANSIENT"
            r14 = 7
            r13.<init>(r15, r14)
            com.google.errorprone.annotations.Modifier.TRANSIENT = r13
            com.google.errorprone.annotations.Modifier r15 = new com.google.errorprone.annotations.Modifier
            java.lang.String r14 = "VOLATILE"
            r12 = 8
            r15.<init>(r14, r12)
            com.google.errorprone.annotations.Modifier.VOLATILE = r15
            com.google.errorprone.annotations.Modifier r14 = new com.google.errorprone.annotations.Modifier
            java.lang.String r12 = "SYNCHRONIZED"
            r10 = 9
            r14.<init>(r12, r10)
            com.google.errorprone.annotations.Modifier.SYNCHRONIZED = r14
            com.google.errorprone.annotations.Modifier r12 = new com.google.errorprone.annotations.Modifier
            java.lang.String r10 = "NATIVE"
            r8 = 10
            r12.<init>(r10, r8)
            com.google.errorprone.annotations.Modifier.NATIVE = r12
            com.google.errorprone.annotations.Modifier r10 = new com.google.errorprone.annotations.Modifier
            java.lang.String r8 = "STRICTFP"
            r6 = 11
            r10.<init>(r8, r6)
            com.google.errorprone.annotations.Modifier.STRICTFP = r10
            r8 = 12
            com.google.errorprone.annotations.Modifier[] r8 = new com.google.errorprone.annotations.Modifier[r8]
            r8[r2] = r0
            r8[r4] = r1
            r0 = 2
            r8[r0] = r3
            r0 = 3
            r8[r0] = r5
            r0 = 4
            r8[r0] = r7
            r0 = 5
            r8[r0] = r9
            r0 = 6
            r8[r0] = r11
            r0 = 7
            r8[r0] = r13
            r0 = 8
            r8[r0] = r15
            r0 = 9
            r8[r0] = r14
            r0 = 10
            r8[r0] = r12
            r8[r6] = r10
            com.google.errorprone.annotations.Modifier.$VALUES = r8
            return
    }

    private Modifier(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.google.errorprone.annotations.Modifier valueOf(java.lang.String r1) {
            java.lang.Class<com.google.errorprone.annotations.Modifier> r0 = com.google.errorprone.annotations.Modifier.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.errorprone.annotations.Modifier r1 = (com.google.errorprone.annotations.Modifier) r1
            return r1
    }

    public static com.google.errorprone.annotations.Modifier[] values() {
            com.google.errorprone.annotations.Modifier[] r0 = com.google.errorprone.annotations.Modifier.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.errorprone.annotations.Modifier[] r0 = (com.google.errorprone.annotations.Modifier[]) r0
            return r0
    }
}
