package com.bumptech.glide;

/* JADX INFO: loaded from: classes2.dex */
public final enum Priority extends java.lang.Enum<com.bumptech.glide.Priority> {
    private static final /* synthetic */ com.bumptech.glide.Priority[] $VALUES = null;
    public static final com.bumptech.glide.Priority HIGH = null;
    public static final com.bumptech.glide.Priority IMMEDIATE = null;
    public static final com.bumptech.glide.Priority LOW = null;
    public static final com.bumptech.glide.Priority NORMAL = null;

    static {
            com.bumptech.glide.Priority r0 = new com.bumptech.glide.Priority
            java.lang.String r1 = "IMMEDIATE"
            r2 = 0
            r0.<init>(r1, r2)
            com.bumptech.glide.Priority.IMMEDIATE = r0
            com.bumptech.glide.Priority r1 = new com.bumptech.glide.Priority
            java.lang.String r3 = "HIGH"
            r4 = 1
            r1.<init>(r3, r4)
            com.bumptech.glide.Priority.HIGH = r1
            com.bumptech.glide.Priority r3 = new com.bumptech.glide.Priority
            java.lang.String r5 = "NORMAL"
            r6 = 2
            r3.<init>(r5, r6)
            com.bumptech.glide.Priority.NORMAL = r3
            com.bumptech.glide.Priority r5 = new com.bumptech.glide.Priority
            java.lang.String r7 = "LOW"
            r8 = 3
            r5.<init>(r7, r8)
            com.bumptech.glide.Priority.LOW = r5
            r7 = 4
            com.bumptech.glide.Priority[] r7 = new com.bumptech.glide.Priority[r7]
            r7[r2] = r0
            r7[r4] = r1
            r7[r6] = r3
            r7[r8] = r5
            com.bumptech.glide.Priority.$VALUES = r7
            return
    }

    private Priority(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.bumptech.glide.Priority valueOf(java.lang.String r1) {
            java.lang.Class<com.bumptech.glide.Priority> r0 = com.bumptech.glide.Priority.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.bumptech.glide.Priority r1 = (com.bumptech.glide.Priority) r1
            return r1
    }

    public static com.bumptech.glide.Priority[] values() {
            com.bumptech.glide.Priority[] r0 = com.bumptech.glide.Priority.$VALUES
            java.lang.Object r0 = r0.clone()
            com.bumptech.glide.Priority[] r0 = (com.bumptech.glide.Priority[]) r0
            return r0
    }
}
