package com.google.gson;

/* JADX INFO: loaded from: classes.dex */
public abstract enum ToNumberPolicy extends java.lang.Enum<com.google.gson.ToNumberPolicy> implements com.google.gson.ToNumberStrategy {
    private static final /* synthetic */ com.google.gson.ToNumberPolicy[] $VALUES = null;
    public static final com.google.gson.ToNumberPolicy BIG_DECIMAL = null;
    public static final com.google.gson.ToNumberPolicy DOUBLE = null;
    public static final com.google.gson.ToNumberPolicy LAZILY_PARSED_NUMBER = null;
    public static final com.google.gson.ToNumberPolicy LONG_OR_DOUBLE = null;





    static {
            com.google.gson.ToNumberPolicy$1 r0 = new com.google.gson.ToNumberPolicy$1
            r0.<init>()
            com.google.gson.ToNumberPolicy.DOUBLE = r0
            com.google.gson.ToNumberPolicy$2 r1 = new com.google.gson.ToNumberPolicy$2
            r1.<init>()
            com.google.gson.ToNumberPolicy.LAZILY_PARSED_NUMBER = r1
            com.google.gson.ToNumberPolicy$3 r2 = new com.google.gson.ToNumberPolicy$3
            r2.<init>()
            com.google.gson.ToNumberPolicy.LONG_OR_DOUBLE = r2
            com.google.gson.ToNumberPolicy$4 r3 = new com.google.gson.ToNumberPolicy$4
            r3.<init>()
            com.google.gson.ToNumberPolicy.BIG_DECIMAL = r3
            r4 = 4
            com.google.gson.ToNumberPolicy[] r4 = new com.google.gson.ToNumberPolicy[r4]
            r5 = 0
            r4[r5] = r0
            r0 = 1
            r4[r0] = r1
            r0 = 2
            r4[r0] = r2
            r0 = 3
            r4[r0] = r3
            com.google.gson.ToNumberPolicy.$VALUES = r4
            return
    }

    private ToNumberPolicy(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public /* synthetic */ ToNumberPolicy(java.lang.String r1, int r2, com.google.gson.ToNumberPolicy.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.google.gson.ToNumberPolicy valueOf(java.lang.String r1) {
            java.lang.Class<com.google.gson.ToNumberPolicy> r0 = com.google.gson.ToNumberPolicy.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.gson.ToNumberPolicy r1 = (com.google.gson.ToNumberPolicy) r1
            return r1
    }

    public static com.google.gson.ToNumberPolicy[] values() {
            com.google.gson.ToNumberPolicy[] r0 = com.google.gson.ToNumberPolicy.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.gson.ToNumberPolicy[] r0 = (com.google.gson.ToNumberPolicy[]) r0
            return r0
    }
}
