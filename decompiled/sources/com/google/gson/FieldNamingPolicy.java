package com.google.gson;

/* JADX INFO: loaded from: classes.dex */
public abstract enum FieldNamingPolicy extends java.lang.Enum<com.google.gson.FieldNamingPolicy> implements com.google.gson.FieldNamingStrategy {
    private static final /* synthetic */ com.google.gson.FieldNamingPolicy[] $VALUES = null;
    public static final com.google.gson.FieldNamingPolicy IDENTITY = null;
    public static final com.google.gson.FieldNamingPolicy LOWER_CASE_WITH_DASHES = null;
    public static final com.google.gson.FieldNamingPolicy LOWER_CASE_WITH_DOTS = null;
    public static final com.google.gson.FieldNamingPolicy LOWER_CASE_WITH_UNDERSCORES = null;
    public static final com.google.gson.FieldNamingPolicy UPPER_CAMEL_CASE = null;
    public static final com.google.gson.FieldNamingPolicy UPPER_CAMEL_CASE_WITH_SPACES = null;







    static {
            com.google.gson.FieldNamingPolicy$1 r0 = new com.google.gson.FieldNamingPolicy$1
            r0.<init>()
            com.google.gson.FieldNamingPolicy.IDENTITY = r0
            com.google.gson.FieldNamingPolicy$2 r1 = new com.google.gson.FieldNamingPolicy$2
            r1.<init>()
            com.google.gson.FieldNamingPolicy.UPPER_CAMEL_CASE = r1
            com.google.gson.FieldNamingPolicy$3 r2 = new com.google.gson.FieldNamingPolicy$3
            r2.<init>()
            com.google.gson.FieldNamingPolicy.UPPER_CAMEL_CASE_WITH_SPACES = r2
            com.google.gson.FieldNamingPolicy$4 r3 = new com.google.gson.FieldNamingPolicy$4
            r3.<init>()
            com.google.gson.FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES = r3
            com.google.gson.FieldNamingPolicy$5 r4 = new com.google.gson.FieldNamingPolicy$5
            r4.<init>()
            com.google.gson.FieldNamingPolicy.LOWER_CASE_WITH_DASHES = r4
            com.google.gson.FieldNamingPolicy$6 r5 = new com.google.gson.FieldNamingPolicy$6
            r5.<init>()
            com.google.gson.FieldNamingPolicy.LOWER_CASE_WITH_DOTS = r5
            r6 = 6
            com.google.gson.FieldNamingPolicy[] r6 = new com.google.gson.FieldNamingPolicy[r6]
            r7 = 0
            r6[r7] = r0
            r0 = 1
            r6[r0] = r1
            r0 = 2
            r6[r0] = r2
            r0 = 3
            r6[r0] = r3
            r0 = 4
            r6[r0] = r4
            r0 = 5
            r6[r0] = r5
            com.google.gson.FieldNamingPolicy.$VALUES = r6
            return
    }

    private FieldNamingPolicy(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public /* synthetic */ FieldNamingPolicy(java.lang.String r1, int r2, com.google.gson.FieldNamingPolicy.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static java.lang.String separateCamelCase(java.lang.String r5, java.lang.String r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r5.length()
            r2 = 0
        La:
            if (r2 >= r1) goto L25
            char r3 = r5.charAt(r2)
            boolean r4 = java.lang.Character.isUpperCase(r3)
            if (r4 == 0) goto L1f
            int r4 = r0.length()
            if (r4 == 0) goto L1f
            r0.append(r6)
        L1f:
            r0.append(r3)
            int r2 = r2 + 1
            goto La
        L25:
            java.lang.String r5 = r0.toString()
            return r5
    }

    public static java.lang.String upperCaseFirstLetter(java.lang.String r5) {
            int r0 = r5.length()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = 0
        L8:
            char r4 = r5.charAt(r3)
            boolean r4 = java.lang.Character.isLetter(r4)
            if (r4 != 0) goto L17
            if (r3 >= r0) goto L17
            int r3 = r3 + 1
            goto L8
        L17:
            char r0 = r5.charAt(r3)
            boolean r4 = java.lang.Character.isUpperCase(r0)
            if (r4 == 0) goto L22
            return r5
        L22:
            char r0 = java.lang.Character.toUpperCase(r0)
            if (r3 != 0) goto L3c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r5 = r5.substring(r1)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            return r5
        L3c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r2 = r5.substring(r2, r3)
            r4.append(r2)
            r4.append(r0)
            int r3 = r3 + r1
            java.lang.String r5 = r5.substring(r3)
            r4.append(r5)
            java.lang.String r5 = r4.toString()
            return r5
    }

    public static com.google.gson.FieldNamingPolicy valueOf(java.lang.String r1) {
            java.lang.Class<com.google.gson.FieldNamingPolicy> r0 = com.google.gson.FieldNamingPolicy.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.gson.FieldNamingPolicy r1 = (com.google.gson.FieldNamingPolicy) r1
            return r1
    }

    public static com.google.gson.FieldNamingPolicy[] values() {
            com.google.gson.FieldNamingPolicy[] r0 = com.google.gson.FieldNamingPolicy.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.gson.FieldNamingPolicy[] r0 = (com.google.gson.FieldNamingPolicy[]) r0
            return r0
    }
}
