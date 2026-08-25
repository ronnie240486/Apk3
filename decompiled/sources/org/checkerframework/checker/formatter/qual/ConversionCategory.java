package org.checkerframework.checker.formatter.qual;

/* JADX INFO: loaded from: classes3.dex */
public final enum ConversionCategory extends java.lang.Enum<org.checkerframework.checker.formatter.qual.ConversionCategory> {
    private static final /* synthetic */ org.checkerframework.checker.formatter.qual.ConversionCategory[] $VALUES = null;
    public static final org.checkerframework.checker.formatter.qual.ConversionCategory CHAR = null;
    public static final org.checkerframework.checker.formatter.qual.ConversionCategory CHAR_AND_INT = null;
    public static final org.checkerframework.checker.formatter.qual.ConversionCategory FLOAT = null;
    public static final org.checkerframework.checker.formatter.qual.ConversionCategory GENERAL = null;
    public static final org.checkerframework.checker.formatter.qual.ConversionCategory INT = null;
    public static final org.checkerframework.checker.formatter.qual.ConversionCategory INT_AND_TIME = null;
    public static final org.checkerframework.checker.formatter.qual.ConversionCategory NULL = null;
    public static final org.checkerframework.checker.formatter.qual.ConversionCategory TIME = null;
    public static final org.checkerframework.checker.formatter.qual.ConversionCategory UNUSED = null;
    public final java.lang.String chars;
    public final java.lang.Class<?>[] types;

    static {
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            java.lang.Class<java.lang.Short> r2 = java.lang.Short.class
            java.lang.Class<java.lang.Byte> r3 = java.lang.Byte.class
            org.checkerframework.checker.formatter.qual.ConversionCategory r4 = new org.checkerframework.checker.formatter.qual.ConversionCategory
            java.lang.String r5 = "GENERAL"
            r6 = 0
            java.lang.String r7 = "bBhHsS"
            r8 = 0
            r4.<init>(r5, r6, r7, r8)
            org.checkerframework.checker.formatter.qual.ConversionCategory.GENERAL = r4
            org.checkerframework.checker.formatter.qual.ConversionCategory r5 = new org.checkerframework.checker.formatter.qual.ConversionCategory
            r7 = 4
            java.lang.Class[] r9 = new java.lang.Class[r7]
            java.lang.Class<java.lang.Character> r10 = java.lang.Character.class
            r9[r6] = r10
            r10 = 1
            r9[r10] = r3
            r11 = 2
            r9[r11] = r2
            r12 = 3
            r9[r12] = r1
            java.lang.String r13 = "CHAR"
            java.lang.String r14 = "cC"
            r5.<init>(r13, r10, r14, r9)
            org.checkerframework.checker.formatter.qual.ConversionCategory.CHAR = r5
            org.checkerframework.checker.formatter.qual.ConversionCategory r9 = new org.checkerframework.checker.formatter.qual.ConversionCategory
            r13 = 5
            java.lang.Class[] r14 = new java.lang.Class[r13]
            r14[r6] = r3
            r14[r10] = r2
            r14[r11] = r1
            r14[r12] = r0
            java.lang.Class<java.math.BigInteger> r15 = java.math.BigInteger.class
            r14[r7] = r15
            java.lang.String r15 = "INT"
            java.lang.String r8 = "doxX"
            r9.<init>(r15, r11, r8, r14)
            org.checkerframework.checker.formatter.qual.ConversionCategory.INT = r9
            org.checkerframework.checker.formatter.qual.ConversionCategory r8 = new org.checkerframework.checker.formatter.qual.ConversionCategory
            java.lang.Class[] r14 = new java.lang.Class[r12]
            java.lang.Class<java.lang.Float> r15 = java.lang.Float.class
            r14[r6] = r15
            java.lang.Class<java.lang.Double> r15 = java.lang.Double.class
            r14[r10] = r15
            java.lang.Class<java.math.BigDecimal> r15 = java.math.BigDecimal.class
            r14[r11] = r15
            java.lang.String r15 = "FLOAT"
            java.lang.String r13 = "eEfgGaA"
            r8.<init>(r15, r12, r13, r14)
            org.checkerframework.checker.formatter.qual.ConversionCategory.FLOAT = r8
            org.checkerframework.checker.formatter.qual.ConversionCategory r13 = new org.checkerframework.checker.formatter.qual.ConversionCategory
            java.lang.Class[] r14 = new java.lang.Class[r12]
            r14[r6] = r0
            java.lang.Class<java.util.Calendar> r15 = java.util.Calendar.class
            r14[r10] = r15
            java.lang.Class<java.util.Date> r15 = java.util.Date.class
            r14[r11] = r15
            java.lang.String r15 = "TIME"
            java.lang.String r11 = "tT"
            r13.<init>(r15, r7, r11, r14)
            org.checkerframework.checker.formatter.qual.ConversionCategory.TIME = r13
            org.checkerframework.checker.formatter.qual.ConversionCategory r11 = new org.checkerframework.checker.formatter.qual.ConversionCategory
            java.lang.Class[] r14 = new java.lang.Class[r12]
            r14[r6] = r3
            r14[r10] = r2
            r2 = 2
            r14[r2] = r1
            java.lang.String r1 = "CHAR_AND_INT"
            r2 = 5
            r3 = 0
            r11.<init>(r1, r2, r3, r14)
            org.checkerframework.checker.formatter.qual.ConversionCategory.CHAR_AND_INT = r11
            org.checkerframework.checker.formatter.qual.ConversionCategory r1 = new org.checkerframework.checker.formatter.qual.ConversionCategory
            java.lang.Class[] r2 = new java.lang.Class[r10]
            r2[r6] = r0
            java.lang.String r0 = "INT_AND_TIME"
            r14 = 6
            r1.<init>(r0, r14, r3, r2)
            org.checkerframework.checker.formatter.qual.ConversionCategory.INT_AND_TIME = r1
            org.checkerframework.checker.formatter.qual.ConversionCategory r0 = new org.checkerframework.checker.formatter.qual.ConversionCategory
            java.lang.Class[] r2 = new java.lang.Class[r6]
            java.lang.String r15 = "NULL"
            r14 = 7
            r0.<init>(r15, r14, r3, r2)
            org.checkerframework.checker.formatter.qual.ConversionCategory.NULL = r0
            org.checkerframework.checker.formatter.qual.ConversionCategory r2 = new org.checkerframework.checker.formatter.qual.ConversionCategory
            java.lang.String r15 = "UNUSED"
            r14 = 8
            r2.<init>(r15, r14, r3, r3)
            org.checkerframework.checker.formatter.qual.ConversionCategory.UNUSED = r2
            r3 = 9
            org.checkerframework.checker.formatter.qual.ConversionCategory[] r3 = new org.checkerframework.checker.formatter.qual.ConversionCategory[r3]
            r3[r6] = r4
            r3[r10] = r5
            r4 = 2
            r3[r4] = r9
            r3[r12] = r8
            r3[r7] = r13
            r4 = 5
            r3[r4] = r11
            r4 = 6
            r3[r4] = r1
            r1 = 7
            r3[r1] = r0
            r3[r14] = r2
            org.checkerframework.checker.formatter.qual.ConversionCategory.$VALUES = r3
            return
    }

    private ConversionCategory(java.lang.String r2, int r3, java.lang.String r4, java.lang.Class... r5) {
            r1 = this;
            r1.<init>(r2, r3)
            r1.chars = r4
            if (r5 != 0) goto La
            r1.types = r5
            goto L33
        La:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r5.length
            r2.<init>(r3)
            int r3 = r5.length
            r4 = 0
        L12:
            if (r4 >= r3) goto L25
            r0 = r5[r4]
            r2.add(r0)
            java.lang.Class r0 = unwrapPrimitive(r0)
            if (r0 == 0) goto L22
            r2.add(r0)
        L22:
            int r4 = r4 + 1
            goto L12
        L25:
            int r3 = r2.size()
            java.lang.Class[] r3 = new java.lang.Class[r3]
            java.lang.Object[] r2 = r2.toArray(r3)
            java.lang.Class[] r2 = (java.lang.Class[]) r2
            r1.types = r2
        L33:
            return
    }

    private static <E> java.util.Set<E> arrayToSet(E[] r1) {
            java.util.HashSet r0 = new java.util.HashSet
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            return r0
    }

    public static org.checkerframework.checker.formatter.qual.ConversionCategory fromConversionChar(char r6) {
            r0 = 5
            org.checkerframework.checker.formatter.qual.ConversionCategory[] r1 = new org.checkerframework.checker.formatter.qual.ConversionCategory[r0]
            org.checkerframework.checker.formatter.qual.ConversionCategory r2 = org.checkerframework.checker.formatter.qual.ConversionCategory.GENERAL
            r3 = 0
            r1[r3] = r2
            org.checkerframework.checker.formatter.qual.ConversionCategory r2 = org.checkerframework.checker.formatter.qual.ConversionCategory.CHAR
            r4 = 1
            r1[r4] = r2
            org.checkerframework.checker.formatter.qual.ConversionCategory r2 = org.checkerframework.checker.formatter.qual.ConversionCategory.INT
            r4 = 2
            r1[r4] = r2
            org.checkerframework.checker.formatter.qual.ConversionCategory r2 = org.checkerframework.checker.formatter.qual.ConversionCategory.FLOAT
            r4 = 3
            r1[r4] = r2
            org.checkerframework.checker.formatter.qual.ConversionCategory r2 = org.checkerframework.checker.formatter.qual.ConversionCategory.TIME
            r4 = 4
            r1[r4] = r2
        L1c:
            if (r3 >= r0) goto L30
            r2 = r1[r3]
            java.lang.String r4 = r2.chars
            java.lang.String r5 = java.lang.String.valueOf(r6)
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L2d
            return r2
        L2d:
            int r3 = r3 + 1
            goto L1c
        L30:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Bad conversion character "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
    }

    public static org.checkerframework.checker.formatter.qual.ConversionCategory intersect(org.checkerframework.checker.formatter.qual.ConversionCategory r4, org.checkerframework.checker.formatter.qual.ConversionCategory r5) {
            org.checkerframework.checker.formatter.qual.ConversionCategory r0 = org.checkerframework.checker.formatter.qual.ConversionCategory.UNUSED
            if (r4 != r0) goto L5
            return r5
        L5:
            if (r5 != r0) goto L8
            return r4
        L8:
            org.checkerframework.checker.formatter.qual.ConversionCategory r0 = org.checkerframework.checker.formatter.qual.ConversionCategory.GENERAL
            if (r4 != r0) goto Ld
            return r5
        Ld:
            if (r5 != r0) goto L10
            return r4
        L10:
            java.lang.Class<?>[] r4 = r4.types
            java.util.Set r4 = arrayToSet(r4)
            java.lang.Class<?>[] r5 = r5.types
            java.util.Set r5 = arrayToSet(r5)
            r4.retainAll(r5)
            r5 = 7
            org.checkerframework.checker.formatter.qual.ConversionCategory[] r0 = new org.checkerframework.checker.formatter.qual.ConversionCategory[r5]
            org.checkerframework.checker.formatter.qual.ConversionCategory r1 = org.checkerframework.checker.formatter.qual.ConversionCategory.CHAR
            r2 = 0
            r0[r2] = r1
            org.checkerframework.checker.formatter.qual.ConversionCategory r1 = org.checkerframework.checker.formatter.qual.ConversionCategory.INT
            r3 = 1
            r0[r3] = r1
            r1 = 2
            org.checkerframework.checker.formatter.qual.ConversionCategory r3 = org.checkerframework.checker.formatter.qual.ConversionCategory.FLOAT
            r0[r1] = r3
            r1 = 3
            org.checkerframework.checker.formatter.qual.ConversionCategory r3 = org.checkerframework.checker.formatter.qual.ConversionCategory.TIME
            r0[r1] = r3
            r1 = 4
            org.checkerframework.checker.formatter.qual.ConversionCategory r3 = org.checkerframework.checker.formatter.qual.ConversionCategory.CHAR_AND_INT
            r0[r1] = r3
            r1 = 5
            org.checkerframework.checker.formatter.qual.ConversionCategory r3 = org.checkerframework.checker.formatter.qual.ConversionCategory.INT_AND_TIME
            r0[r1] = r3
            r1 = 6
            org.checkerframework.checker.formatter.qual.ConversionCategory r3 = org.checkerframework.checker.formatter.qual.ConversionCategory.NULL
            r0[r1] = r3
        L45:
            if (r2 >= r5) goto L59
            r1 = r0[r2]
            java.lang.Class<?>[] r3 = r1.types
            java.util.Set r3 = arrayToSet(r3)
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L56
            return r1
        L56:
            int r2 = r2 + 1
            goto L45
        L59:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>()
            throw r4
    }

    public static boolean isSubsetOf(org.checkerframework.checker.formatter.qual.ConversionCategory r0, org.checkerframework.checker.formatter.qual.ConversionCategory r1) {
            org.checkerframework.checker.formatter.qual.ConversionCategory r1 = intersect(r0, r1)
            if (r1 != r0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static org.checkerframework.checker.formatter.qual.ConversionCategory union(org.checkerframework.checker.formatter.qual.ConversionCategory r5, org.checkerframework.checker.formatter.qual.ConversionCategory r6) {
            org.checkerframework.checker.formatter.qual.ConversionCategory r0 = org.checkerframework.checker.formatter.qual.ConversionCategory.UNUSED
            if (r5 == r0) goto L67
            if (r6 != r0) goto L7
            goto L67
        L7:
            org.checkerframework.checker.formatter.qual.ConversionCategory r0 = org.checkerframework.checker.formatter.qual.ConversionCategory.GENERAL
            if (r5 == r0) goto L67
            if (r6 != r0) goto Le
            goto L67
        Le:
            org.checkerframework.checker.formatter.qual.ConversionCategory r0 = org.checkerframework.checker.formatter.qual.ConversionCategory.CHAR_AND_INT
            if (r5 != r0) goto L16
            org.checkerframework.checker.formatter.qual.ConversionCategory r1 = org.checkerframework.checker.formatter.qual.ConversionCategory.INT_AND_TIME
            if (r6 == r1) goto L1c
        L16:
            org.checkerframework.checker.formatter.qual.ConversionCategory r1 = org.checkerframework.checker.formatter.qual.ConversionCategory.INT_AND_TIME
            if (r5 != r1) goto L1f
            if (r6 != r0) goto L1f
        L1c:
            org.checkerframework.checker.formatter.qual.ConversionCategory r5 = org.checkerframework.checker.formatter.qual.ConversionCategory.INT
            return r5
        L1f:
            java.lang.Class<?>[] r5 = r5.types
            java.util.Set r5 = arrayToSet(r5)
            java.lang.Class<?>[] r6 = r6.types
            java.util.Set r6 = arrayToSet(r6)
            r5.addAll(r6)
            r6 = 7
            org.checkerframework.checker.formatter.qual.ConversionCategory[] r2 = new org.checkerframework.checker.formatter.qual.ConversionCategory[r6]
            org.checkerframework.checker.formatter.qual.ConversionCategory r3 = org.checkerframework.checker.formatter.qual.ConversionCategory.NULL
            r4 = 0
            r2[r4] = r3
            r3 = 1
            r2[r3] = r0
            r0 = 2
            r2[r0] = r1
            r0 = 3
            org.checkerframework.checker.formatter.qual.ConversionCategory r1 = org.checkerframework.checker.formatter.qual.ConversionCategory.CHAR
            r2[r0] = r1
            r0 = 4
            org.checkerframework.checker.formatter.qual.ConversionCategory r1 = org.checkerframework.checker.formatter.qual.ConversionCategory.INT
            r2[r0] = r1
            r0 = 5
            org.checkerframework.checker.formatter.qual.ConversionCategory r1 = org.checkerframework.checker.formatter.qual.ConversionCategory.FLOAT
            r2[r0] = r1
            r0 = 6
            org.checkerframework.checker.formatter.qual.ConversionCategory r1 = org.checkerframework.checker.formatter.qual.ConversionCategory.TIME
            r2[r0] = r1
        L50:
            if (r4 >= r6) goto L64
            r0 = r2[r4]
            java.lang.Class<?>[] r1 = r0.types
            java.util.Set r1 = arrayToSet(r1)
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L61
            return r0
        L61:
            int r4 = r4 + 1
            goto L50
        L64:
            org.checkerframework.checker.formatter.qual.ConversionCategory r5 = org.checkerframework.checker.formatter.qual.ConversionCategory.GENERAL
            return r5
        L67:
            return r0
    }

    private static java.lang.Class<? extends java.lang.Object> unwrapPrimitive(java.lang.Class<?> r1) {
            java.lang.Class<java.lang.Byte> r0 = java.lang.Byte.class
            if (r1 != r0) goto L7
            java.lang.Class r1 = java.lang.Byte.TYPE
            return r1
        L7:
            java.lang.Class<java.lang.Character> r0 = java.lang.Character.class
            if (r1 != r0) goto Le
            java.lang.Class r1 = java.lang.Character.TYPE
            return r1
        Le:
            java.lang.Class<java.lang.Short> r0 = java.lang.Short.class
            if (r1 != r0) goto L15
            java.lang.Class r1 = java.lang.Short.TYPE
            return r1
        L15:
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r1 != r0) goto L1c
            java.lang.Class r1 = java.lang.Integer.TYPE
            return r1
        L1c:
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            if (r1 != r0) goto L23
            java.lang.Class r1 = java.lang.Long.TYPE
            return r1
        L23:
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            if (r1 != r0) goto L2a
            java.lang.Class r1 = java.lang.Float.TYPE
            return r1
        L2a:
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            if (r1 != r0) goto L31
            java.lang.Class r1 = java.lang.Double.TYPE
            return r1
        L31:
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            if (r1 != r0) goto L38
            java.lang.Class r1 = java.lang.Boolean.TYPE
            return r1
        L38:
            r1 = 0
            return r1
    }

    public static org.checkerframework.checker.formatter.qual.ConversionCategory valueOf(java.lang.String r1) {
            java.lang.Class<org.checkerframework.checker.formatter.qual.ConversionCategory> r0 = org.checkerframework.checker.formatter.qual.ConversionCategory.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            org.checkerframework.checker.formatter.qual.ConversionCategory r1 = (org.checkerframework.checker.formatter.qual.ConversionCategory) r1
            return r1
    }

    public static org.checkerframework.checker.formatter.qual.ConversionCategory[] values() {
            org.checkerframework.checker.formatter.qual.ConversionCategory[] r0 = org.checkerframework.checker.formatter.qual.ConversionCategory.$VALUES
            java.lang.Object r0 = r0.clone()
            org.checkerframework.checker.formatter.qual.ConversionCategory[] r0 = (org.checkerframework.checker.formatter.qual.ConversionCategory[]) r0
            return r0
    }

    public boolean isAssignableFrom(java.lang.Class<?> r7) {
            r6 = this;
            java.lang.Class<?>[] r0 = r6.types
            r1 = 1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Class r2 = java.lang.Void.TYPE
            if (r7 != r2) goto Lb
            return r1
        Lb:
            int r2 = r0.length
            r3 = 0
            r4 = 0
        Le:
            if (r4 >= r2) goto L1c
            r5 = r0[r4]
            boolean r5 = r5.isAssignableFrom(r7)
            if (r5 == 0) goto L19
            return r1
        L19:
            int r4 = r4 + 1
            goto Le
        L1c:
            return r3
    }

    @Override // java.lang.Enum
    @org.checkerframework.dataflow.qual.Pure
    public java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r6.name()
            r0.append(r1)
            java.lang.String r1 = " conversion category"
            r0.append(r1)
            java.lang.Class<?>[] r1 = r6.types
            if (r1 == 0) goto L43
            int r1 = r1.length
            if (r1 != 0) goto L19
            goto L43
        L19:
            java.util.StringJoiner r1 = new java.util.StringJoiner
            java.lang.String r2 = ", "
            java.lang.String r3 = "(one of: "
            java.lang.String r4 = ")"
            r1.<init>(r2, r3, r4)
            java.lang.Class<?>[] r2 = r6.types
            int r3 = r2.length
            r4 = 0
        L28:
            if (r4 >= r3) goto L36
            r5 = r2[r4]
            java.lang.String r5 = r5.getSimpleName()
            r1.add(r5)
            int r4 = r4 + 1
            goto L28
        L36:
            java.lang.String r2 = " "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L43:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
