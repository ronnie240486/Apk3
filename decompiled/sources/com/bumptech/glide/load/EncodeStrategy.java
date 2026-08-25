package com.bumptech.glide.load;

/* JADX INFO: loaded from: classes.dex */
public final enum EncodeStrategy extends java.lang.Enum<com.bumptech.glide.load.EncodeStrategy> {
    private static final /* synthetic */ com.bumptech.glide.load.EncodeStrategy[] $VALUES = null;
    public static final com.bumptech.glide.load.EncodeStrategy NONE = null;
    public static final com.bumptech.glide.load.EncodeStrategy SOURCE = null;
    public static final com.bumptech.glide.load.EncodeStrategy TRANSFORMED = null;

    static {
            com.bumptech.glide.load.EncodeStrategy r0 = new com.bumptech.glide.load.EncodeStrategy
            java.lang.String r1 = "SOURCE"
            r2 = 0
            r0.<init>(r1, r2)
            com.bumptech.glide.load.EncodeStrategy.SOURCE = r0
            com.bumptech.glide.load.EncodeStrategy r1 = new com.bumptech.glide.load.EncodeStrategy
            java.lang.String r3 = "TRANSFORMED"
            r4 = 1
            r1.<init>(r3, r4)
            com.bumptech.glide.load.EncodeStrategy.TRANSFORMED = r1
            com.bumptech.glide.load.EncodeStrategy r3 = new com.bumptech.glide.load.EncodeStrategy
            java.lang.String r5 = "NONE"
            r6 = 2
            r3.<init>(r5, r6)
            com.bumptech.glide.load.EncodeStrategy.NONE = r3
            r5 = 3
            com.bumptech.glide.load.EncodeStrategy[] r5 = new com.bumptech.glide.load.EncodeStrategy[r5]
            r5[r2] = r0
            r5[r4] = r1
            r5[r6] = r3
            com.bumptech.glide.load.EncodeStrategy.$VALUES = r5
            return
    }

    private EncodeStrategy(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.bumptech.glide.load.EncodeStrategy valueOf(java.lang.String r1) {
            java.lang.Class<com.bumptech.glide.load.EncodeStrategy> r0 = com.bumptech.glide.load.EncodeStrategy.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.bumptech.glide.load.EncodeStrategy r1 = (com.bumptech.glide.load.EncodeStrategy) r1
            return r1
    }

    public static com.bumptech.glide.load.EncodeStrategy[] values() {
            com.bumptech.glide.load.EncodeStrategy[] r0 = com.bumptech.glide.load.EncodeStrategy.$VALUES
            java.lang.Object r0 = r0.clone()
            com.bumptech.glide.load.EncodeStrategy[] r0 = (com.bumptech.glide.load.EncodeStrategy[]) r0
            return r0
    }
}
