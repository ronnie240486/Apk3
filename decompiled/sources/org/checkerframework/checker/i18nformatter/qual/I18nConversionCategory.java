package org.checkerframework.checker.i18nformatter.qual;

/* JADX INFO: loaded from: classes2.dex */
public final enum I18nConversionCategory extends java.lang.Enum<org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory> {
    private static final /* synthetic */ org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory[] $VALUES = null;
    public static final org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory DATE = null;
    public static final org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory GENERAL = null;
    public static final org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory NUMBER = null;
    public static final org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory UNUSED = null;
    public static org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory[] namedCategories;
    public final java.lang.String[] strings;
    public final java.lang.Class<?>[] types;

    static {
            org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory r0 = new org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory
            java.lang.String r1 = "UNUSED"
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r3)
            org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory.UNUSED = r0
            org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory r1 = new org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory
            java.lang.String r4 = "GENERAL"
            r5 = 1
            r1.<init>(r4, r5, r3, r3)
            org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory.GENERAL = r1
            org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory r3 = new org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory
            r4 = 2
            java.lang.Class[] r6 = new java.lang.Class[r4]
            java.lang.Class<java.util.Date> r7 = java.util.Date.class
            r6[r2] = r7
            java.lang.Class<java.lang.Number> r7 = java.lang.Number.class
            r6[r5] = r7
            java.lang.String r7 = "date"
            java.lang.String r8 = "time"
            java.lang.String[] r7 = new java.lang.String[]{r7, r8}
            java.lang.String r8 = "DATE"
            r3.<init>(r8, r4, r6, r7)
            org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory.DATE = r3
            org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory r6 = new org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory
            java.lang.Class[] r7 = new java.lang.Class[r5]
            java.lang.Class<java.lang.Number> r8 = java.lang.Number.class
            r7[r2] = r8
            java.lang.String r8 = "number"
            java.lang.String r9 = "choice"
            java.lang.String[] r8 = new java.lang.String[]{r8, r9}
            java.lang.String r9 = "NUMBER"
            r10 = 3
            r6.<init>(r9, r10, r7, r8)
            org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory.NUMBER = r6
            r7 = 4
            org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory[] r7 = new org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory[r7]
            r7[r2] = r0
            r7[r5] = r1
            r7[r4] = r3
            r7[r10] = r6
            org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory.$VALUES = r7
            org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory[] r0 = new org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory[r4]
            r0[r2] = r3
            r0[r5] = r6
            org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory.namedCategories = r0
            return
    }

    private I18nConversionCategory(java.lang.String r1, int r2, java.lang.Class[] r3, java.lang.String[] r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.types = r3
            r0.strings = r4
            return
    }

    private static <E> java.util.Set<E> arrayToSet(E[] r1) {
            java.util.HashSet r0 = new java.util.HashSet
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            return r0
    }

    public static org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory intersect(org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory r4, org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory r5) {
            org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory r0 = org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory.UNUSED
            if (r4 != r0) goto L5
            return r5
        L5:
            if (r5 != r0) goto L8
            return r4
        L8:
            org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory r0 = org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory.GENERAL
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
            r5 = 2
            org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory[] r0 = new org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory[r5]
            org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory r1 = org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory.DATE
            r2 = 0
            r0[r2] = r1
            org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory r1 = org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory.NUMBER
            r3 = 1
            r0[r3] = r1
        L2c:
            if (r2 >= r5) goto L40
            r1 = r0[r2]
            java.lang.Class<?>[] r3 = r1.types
            java.util.Set r3 = arrayToSet(r3)
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L3d
            return r1
        L3d:
            int r2 = r2 + 1
            goto L2c
        L40:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>()
            throw r4
    }

    public static boolean isSubsetOf(org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory r0, org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory r1) {
            org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory r1 = intersect(r0, r1)
            if (r1 != r0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory stringToI18nConversionCategory(java.lang.String r8) {
            java.lang.String r8 = r8.toLowerCase()
            org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory[] r0 = org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory.namedCategories
            int r1 = r0.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L21
            r3 = r0[r2]
            java.lang.String[] r4 = r3.strings
            int r5 = r4.length
            r6 = 0
        L10:
            if (r6 >= r5) goto L1e
            r7 = r4[r6]
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L1b
            return r3
        L1b:
            int r6 = r6 + 1
            goto L10
        L1e:
            int r2 = r2 + 1
            goto L8
        L21:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid format type "
            java.lang.String r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r8)
            r0.<init>(r8)
            throw r0
    }

    public static org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory union(org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory r1, org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory r2) {
            org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory r0 = org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory.UNUSED
            if (r1 == r0) goto L18
            if (r2 != r0) goto L7
            goto L18
        L7:
            org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory r0 = org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory.GENERAL
            if (r1 == r0) goto L18
            if (r2 != r0) goto Le
            goto L18
        Le:
            org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory r0 = org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory.DATE
            if (r1 == r0) goto L18
            if (r2 != r0) goto L15
            goto L18
        L15:
            org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory r1 = org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory.NUMBER
            return r1
        L18:
            return r0
    }

    public static org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory valueOf(java.lang.String r1) {
            java.lang.Class<org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory> r0 = org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory r1 = (org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory) r1
            return r1
    }

    public static org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory[] values() {
            org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory[] r0 = org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory.$VALUES
            java.lang.Object r0 = r0.clone()
            org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory[] r0 = (org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory[]) r0
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
    public java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = r6.name()
            r0.<init>(r1)
            java.lang.Class<?>[] r1 = r6.types
            if (r1 != 0) goto L13
            java.lang.String r1 = " conversion category (all types)"
            r0.append(r1)
            goto L33
        L13:
            java.util.StringJoiner r1 = new java.util.StringJoiner
            java.lang.String r2 = ", "
            java.lang.String r3 = " conversion category (one of: "
            java.lang.String r4 = ")"
            r1.<init>(r2, r3, r4)
            java.lang.Class<?>[] r2 = r6.types
            int r3 = r2.length
            r4 = 0
        L22:
            if (r4 >= r3) goto L30
            r5 = r2[r4]
            java.lang.String r5 = r5.getCanonicalName()
            r1.add(r5)
            int r4 = r4 + 1
            goto L22
        L30:
            r0.append(r1)
        L33:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
