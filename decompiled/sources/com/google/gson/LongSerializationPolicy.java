package com.google.gson;

/* JADX INFO: loaded from: classes.dex */
public abstract enum LongSerializationPolicy extends java.lang.Enum<com.google.gson.LongSerializationPolicy> {
    private static final /* synthetic */ com.google.gson.LongSerializationPolicy[] $VALUES = null;
    public static final com.google.gson.LongSerializationPolicy DEFAULT = null;
    public static final com.google.gson.LongSerializationPolicy STRING = null;



    static {
            com.google.gson.LongSerializationPolicy$1 r0 = new com.google.gson.LongSerializationPolicy$1
            r0.<init>()
            com.google.gson.LongSerializationPolicy.DEFAULT = r0
            com.google.gson.LongSerializationPolicy$2 r1 = new com.google.gson.LongSerializationPolicy$2
            r1.<init>()
            com.google.gson.LongSerializationPolicy.STRING = r1
            r2 = 2
            com.google.gson.LongSerializationPolicy[] r2 = new com.google.gson.LongSerializationPolicy[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            com.google.gson.LongSerializationPolicy.$VALUES = r2
            return
    }

    private LongSerializationPolicy(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public /* synthetic */ LongSerializationPolicy(java.lang.String r1, int r2, com.google.gson.LongSerializationPolicy.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.google.gson.LongSerializationPolicy valueOf(java.lang.String r1) {
            java.lang.Class<com.google.gson.LongSerializationPolicy> r0 = com.google.gson.LongSerializationPolicy.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.gson.LongSerializationPolicy r1 = (com.google.gson.LongSerializationPolicy) r1
            return r1
    }

    public static com.google.gson.LongSerializationPolicy[] values() {
            com.google.gson.LongSerializationPolicy[] r0 = com.google.gson.LongSerializationPolicy.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.gson.LongSerializationPolicy[] r0 = (com.google.gson.LongSerializationPolicy[]) r0
            return r0
    }

    public abstract com.google.gson.JsonElement serialize(java.lang.Long r1);
}
