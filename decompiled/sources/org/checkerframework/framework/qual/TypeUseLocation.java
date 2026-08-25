package org.checkerframework.framework.qual;

/* JADX INFO: loaded from: classes2.dex */
public final enum TypeUseLocation extends java.lang.Enum<org.checkerframework.framework.qual.TypeUseLocation> {
    private static final /* synthetic */ org.checkerframework.framework.qual.TypeUseLocation[] $VALUES = null;
    public static final org.checkerframework.framework.qual.TypeUseLocation ALL = null;
    public static final org.checkerframework.framework.qual.TypeUseLocation CONSTRUCTOR_RESULT = null;
    public static final org.checkerframework.framework.qual.TypeUseLocation EXCEPTION_PARAMETER = null;
    public static final org.checkerframework.framework.qual.TypeUseLocation EXPLICIT_LOWER_BOUND = null;
    public static final org.checkerframework.framework.qual.TypeUseLocation EXPLICIT_UPPER_BOUND = null;
    public static final org.checkerframework.framework.qual.TypeUseLocation FIELD = null;
    public static final org.checkerframework.framework.qual.TypeUseLocation IMPLICIT_LOWER_BOUND = null;
    public static final org.checkerframework.framework.qual.TypeUseLocation IMPLICIT_UPPER_BOUND = null;
    public static final org.checkerframework.framework.qual.TypeUseLocation LOCAL_VARIABLE = null;
    public static final org.checkerframework.framework.qual.TypeUseLocation LOWER_BOUND = null;
    public static final org.checkerframework.framework.qual.TypeUseLocation OTHERWISE = null;
    public static final org.checkerframework.framework.qual.TypeUseLocation PARAMETER = null;
    public static final org.checkerframework.framework.qual.TypeUseLocation RECEIVER = null;
    public static final org.checkerframework.framework.qual.TypeUseLocation RESOURCE_VARIABLE = null;
    public static final org.checkerframework.framework.qual.TypeUseLocation RETURN = null;
    public static final org.checkerframework.framework.qual.TypeUseLocation UPPER_BOUND = null;

    static {
            org.checkerframework.framework.qual.TypeUseLocation r0 = new org.checkerframework.framework.qual.TypeUseLocation
            java.lang.String r1 = "FIELD"
            r2 = 0
            r0.<init>(r1, r2)
            org.checkerframework.framework.qual.TypeUseLocation.FIELD = r0
            org.checkerframework.framework.qual.TypeUseLocation r1 = new org.checkerframework.framework.qual.TypeUseLocation
            java.lang.String r3 = "LOCAL_VARIABLE"
            r4 = 1
            r1.<init>(r3, r4)
            org.checkerframework.framework.qual.TypeUseLocation.LOCAL_VARIABLE = r1
            org.checkerframework.framework.qual.TypeUseLocation r3 = new org.checkerframework.framework.qual.TypeUseLocation
            java.lang.String r5 = "RESOURCE_VARIABLE"
            r6 = 2
            r3.<init>(r5, r6)
            org.checkerframework.framework.qual.TypeUseLocation.RESOURCE_VARIABLE = r3
            org.checkerframework.framework.qual.TypeUseLocation r5 = new org.checkerframework.framework.qual.TypeUseLocation
            java.lang.String r7 = "EXCEPTION_PARAMETER"
            r8 = 3
            r5.<init>(r7, r8)
            org.checkerframework.framework.qual.TypeUseLocation.EXCEPTION_PARAMETER = r5
            org.checkerframework.framework.qual.TypeUseLocation r7 = new org.checkerframework.framework.qual.TypeUseLocation
            java.lang.String r9 = "RECEIVER"
            r10 = 4
            r7.<init>(r9, r10)
            org.checkerframework.framework.qual.TypeUseLocation.RECEIVER = r7
            org.checkerframework.framework.qual.TypeUseLocation r9 = new org.checkerframework.framework.qual.TypeUseLocation
            java.lang.String r11 = "PARAMETER"
            r12 = 5
            r9.<init>(r11, r12)
            org.checkerframework.framework.qual.TypeUseLocation.PARAMETER = r9
            org.checkerframework.framework.qual.TypeUseLocation r11 = new org.checkerframework.framework.qual.TypeUseLocation
            java.lang.String r13 = "RETURN"
            r14 = 6
            r11.<init>(r13, r14)
            org.checkerframework.framework.qual.TypeUseLocation.RETURN = r11
            org.checkerframework.framework.qual.TypeUseLocation r13 = new org.checkerframework.framework.qual.TypeUseLocation
            java.lang.String r15 = "CONSTRUCTOR_RESULT"
            r14 = 7
            r13.<init>(r15, r14)
            org.checkerframework.framework.qual.TypeUseLocation.CONSTRUCTOR_RESULT = r13
            org.checkerframework.framework.qual.TypeUseLocation r15 = new org.checkerframework.framework.qual.TypeUseLocation
            java.lang.String r14 = "LOWER_BOUND"
            r12 = 8
            r15.<init>(r14, r12)
            org.checkerframework.framework.qual.TypeUseLocation.LOWER_BOUND = r15
            org.checkerframework.framework.qual.TypeUseLocation r14 = new org.checkerframework.framework.qual.TypeUseLocation
            java.lang.String r12 = "EXPLICIT_LOWER_BOUND"
            r10 = 9
            r14.<init>(r12, r10)
            org.checkerframework.framework.qual.TypeUseLocation.EXPLICIT_LOWER_BOUND = r14
            org.checkerframework.framework.qual.TypeUseLocation r12 = new org.checkerframework.framework.qual.TypeUseLocation
            java.lang.String r10 = "IMPLICIT_LOWER_BOUND"
            r8 = 10
            r12.<init>(r10, r8)
            org.checkerframework.framework.qual.TypeUseLocation.IMPLICIT_LOWER_BOUND = r12
            org.checkerframework.framework.qual.TypeUseLocation r10 = new org.checkerframework.framework.qual.TypeUseLocation
            java.lang.String r8 = "UPPER_BOUND"
            r6 = 11
            r10.<init>(r8, r6)
            org.checkerframework.framework.qual.TypeUseLocation.UPPER_BOUND = r10
            org.checkerframework.framework.qual.TypeUseLocation r8 = new org.checkerframework.framework.qual.TypeUseLocation
            java.lang.String r6 = "EXPLICIT_UPPER_BOUND"
            r4 = 12
            r8.<init>(r6, r4)
            org.checkerframework.framework.qual.TypeUseLocation.EXPLICIT_UPPER_BOUND = r8
            org.checkerframework.framework.qual.TypeUseLocation r6 = new org.checkerframework.framework.qual.TypeUseLocation
            java.lang.String r4 = "IMPLICIT_UPPER_BOUND"
            r2 = 13
            r6.<init>(r4, r2)
            org.checkerframework.framework.qual.TypeUseLocation.IMPLICIT_UPPER_BOUND = r6
            org.checkerframework.framework.qual.TypeUseLocation r4 = new org.checkerframework.framework.qual.TypeUseLocation
            java.lang.String r2 = "OTHERWISE"
            r17 = r6
            r6 = 14
            r4.<init>(r2, r6)
            org.checkerframework.framework.qual.TypeUseLocation.OTHERWISE = r4
            org.checkerframework.framework.qual.TypeUseLocation r2 = new org.checkerframework.framework.qual.TypeUseLocation
            java.lang.String r6 = "ALL"
            r18 = r4
            r4 = 15
            r2.<init>(r6, r4)
            org.checkerframework.framework.qual.TypeUseLocation.ALL = r2
            r6 = 16
            org.checkerframework.framework.qual.TypeUseLocation[] r6 = new org.checkerframework.framework.qual.TypeUseLocation[r6]
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
            org.checkerframework.framework.qual.TypeUseLocation.$VALUES = r6
            return
    }

    private TypeUseLocation(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static org.checkerframework.framework.qual.TypeUseLocation valueOf(java.lang.String r1) {
            java.lang.Class<org.checkerframework.framework.qual.TypeUseLocation> r0 = org.checkerframework.framework.qual.TypeUseLocation.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            org.checkerframework.framework.qual.TypeUseLocation r1 = (org.checkerframework.framework.qual.TypeUseLocation) r1
            return r1
    }

    public static org.checkerframework.framework.qual.TypeUseLocation[] values() {
            org.checkerframework.framework.qual.TypeUseLocation[] r0 = org.checkerframework.framework.qual.TypeUseLocation.$VALUES
            java.lang.Object r0 = r0.clone()
            org.checkerframework.framework.qual.TypeUseLocation[] r0 = (org.checkerframework.framework.qual.TypeUseLocation[]) r0
            return r0
    }
}
