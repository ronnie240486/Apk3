package org.checkerframework.framework.qual;

/* JADX INFO: loaded from: classes3.dex */
public final enum LiteralKind extends java.lang.Enum<org.checkerframework.framework.qual.LiteralKind> {
    private static final /* synthetic */ org.checkerframework.framework.qual.LiteralKind[] $VALUES = null;
    public static final org.checkerframework.framework.qual.LiteralKind ALL = null;
    public static final org.checkerframework.framework.qual.LiteralKind BOOLEAN = null;
    public static final org.checkerframework.framework.qual.LiteralKind CHAR = null;
    public static final org.checkerframework.framework.qual.LiteralKind DOUBLE = null;
    public static final org.checkerframework.framework.qual.LiteralKind FLOAT = null;
    public static final org.checkerframework.framework.qual.LiteralKind INT = null;
    public static final org.checkerframework.framework.qual.LiteralKind LONG = null;
    public static final org.checkerframework.framework.qual.LiteralKind NULL = null;
    public static final org.checkerframework.framework.qual.LiteralKind PRIMITIVE = null;
    public static final org.checkerframework.framework.qual.LiteralKind STRING = null;

    static {
            org.checkerframework.framework.qual.LiteralKind r0 = new org.checkerframework.framework.qual.LiteralKind
            java.lang.String r1 = "NULL"
            r2 = 0
            r0.<init>(r1, r2)
            org.checkerframework.framework.qual.LiteralKind.NULL = r0
            org.checkerframework.framework.qual.LiteralKind r1 = new org.checkerframework.framework.qual.LiteralKind
            java.lang.String r3 = "INT"
            r4 = 1
            r1.<init>(r3, r4)
            org.checkerframework.framework.qual.LiteralKind.INT = r1
            org.checkerframework.framework.qual.LiteralKind r3 = new org.checkerframework.framework.qual.LiteralKind
            java.lang.String r5 = "LONG"
            r6 = 2
            r3.<init>(r5, r6)
            org.checkerframework.framework.qual.LiteralKind.LONG = r3
            org.checkerframework.framework.qual.LiteralKind r5 = new org.checkerframework.framework.qual.LiteralKind
            java.lang.String r7 = "FLOAT"
            r8 = 3
            r5.<init>(r7, r8)
            org.checkerframework.framework.qual.LiteralKind.FLOAT = r5
            org.checkerframework.framework.qual.LiteralKind r7 = new org.checkerframework.framework.qual.LiteralKind
            java.lang.String r9 = "DOUBLE"
            r10 = 4
            r7.<init>(r9, r10)
            org.checkerframework.framework.qual.LiteralKind.DOUBLE = r7
            org.checkerframework.framework.qual.LiteralKind r9 = new org.checkerframework.framework.qual.LiteralKind
            java.lang.String r11 = "BOOLEAN"
            r12 = 5
            r9.<init>(r11, r12)
            org.checkerframework.framework.qual.LiteralKind.BOOLEAN = r9
            org.checkerframework.framework.qual.LiteralKind r11 = new org.checkerframework.framework.qual.LiteralKind
            java.lang.String r13 = "CHAR"
            r14 = 6
            r11.<init>(r13, r14)
            org.checkerframework.framework.qual.LiteralKind.CHAR = r11
            org.checkerframework.framework.qual.LiteralKind r13 = new org.checkerframework.framework.qual.LiteralKind
            java.lang.String r15 = "STRING"
            r14 = 7
            r13.<init>(r15, r14)
            org.checkerframework.framework.qual.LiteralKind.STRING = r13
            org.checkerframework.framework.qual.LiteralKind r15 = new org.checkerframework.framework.qual.LiteralKind
            java.lang.String r14 = "ALL"
            r12 = 8
            r15.<init>(r14, r12)
            org.checkerframework.framework.qual.LiteralKind.ALL = r15
            org.checkerframework.framework.qual.LiteralKind r14 = new org.checkerframework.framework.qual.LiteralKind
            java.lang.String r12 = "PRIMITIVE"
            r10 = 9
            r14.<init>(r12, r10)
            org.checkerframework.framework.qual.LiteralKind.PRIMITIVE = r14
            r12 = 10
            org.checkerframework.framework.qual.LiteralKind[] r12 = new org.checkerframework.framework.qual.LiteralKind[r12]
            r12[r2] = r0
            r12[r4] = r1
            r12[r6] = r3
            r12[r8] = r5
            r0 = 4
            r12[r0] = r7
            r0 = 5
            r12[r0] = r9
            r0 = 6
            r12[r0] = r11
            r0 = 7
            r12[r0] = r13
            r0 = 8
            r12[r0] = r15
            r12[r10] = r14
            org.checkerframework.framework.qual.LiteralKind.$VALUES = r12
            return
    }

    private LiteralKind(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static java.util.List<org.checkerframework.framework.qual.LiteralKind> allLiteralKinds() {
            java.util.ArrayList r0 = new java.util.ArrayList
            org.checkerframework.framework.qual.LiteralKind[] r1 = values()
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            org.checkerframework.framework.qual.LiteralKind r1 = org.checkerframework.framework.qual.LiteralKind.ALL
            r0.remove(r1)
            org.checkerframework.framework.qual.LiteralKind r1 = org.checkerframework.framework.qual.LiteralKind.PRIMITIVE
            r0.remove(r1)
            return r0
    }

    public static java.util.List<org.checkerframework.framework.qual.LiteralKind> primitiveLiteralKinds() {
            r0 = 6
            org.checkerframework.framework.qual.LiteralKind[] r0 = new org.checkerframework.framework.qual.LiteralKind[r0]
            org.checkerframework.framework.qual.LiteralKind r1 = org.checkerframework.framework.qual.LiteralKind.INT
            r2 = 0
            r0[r2] = r1
            org.checkerframework.framework.qual.LiteralKind r1 = org.checkerframework.framework.qual.LiteralKind.LONG
            r2 = 1
            r0[r2] = r1
            org.checkerframework.framework.qual.LiteralKind r1 = org.checkerframework.framework.qual.LiteralKind.FLOAT
            r2 = 2
            r0[r2] = r1
            org.checkerframework.framework.qual.LiteralKind r1 = org.checkerframework.framework.qual.LiteralKind.DOUBLE
            r2 = 3
            r0[r2] = r1
            org.checkerframework.framework.qual.LiteralKind r1 = org.checkerframework.framework.qual.LiteralKind.BOOLEAN
            r2 = 4
            r0[r2] = r1
            org.checkerframework.framework.qual.LiteralKind r1 = org.checkerframework.framework.qual.LiteralKind.CHAR
            r2 = 5
            r0[r2] = r1
            java.util.List r0 = java.util.Arrays.asList(r0)
            return r0
    }

    public static org.checkerframework.framework.qual.LiteralKind valueOf(java.lang.String r1) {
            java.lang.Class<org.checkerframework.framework.qual.LiteralKind> r0 = org.checkerframework.framework.qual.LiteralKind.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            org.checkerframework.framework.qual.LiteralKind r1 = (org.checkerframework.framework.qual.LiteralKind) r1
            return r1
    }

    public static org.checkerframework.framework.qual.LiteralKind[] values() {
            org.checkerframework.framework.qual.LiteralKind[] r0 = org.checkerframework.framework.qual.LiteralKind.$VALUES
            java.lang.Object r0 = r0.clone()
            org.checkerframework.framework.qual.LiteralKind[] r0 = (org.checkerframework.framework.qual.LiteralKind[]) r0
            return r0
    }
}
