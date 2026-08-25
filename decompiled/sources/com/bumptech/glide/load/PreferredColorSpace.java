package com.bumptech.glide.load;

/* JADX INFO: loaded from: classes.dex */
public final enum PreferredColorSpace extends java.lang.Enum<com.bumptech.glide.load.PreferredColorSpace> {
    private static final /* synthetic */ com.bumptech.glide.load.PreferredColorSpace[] $VALUES = null;
    public static final com.bumptech.glide.load.PreferredColorSpace DISPLAY_P3 = null;
    public static final com.bumptech.glide.load.PreferredColorSpace SRGB = null;

    static {
            com.bumptech.glide.load.PreferredColorSpace r0 = new com.bumptech.glide.load.PreferredColorSpace
            java.lang.String r1 = "SRGB"
            r2 = 0
            r0.<init>(r1, r2)
            com.bumptech.glide.load.PreferredColorSpace.SRGB = r0
            com.bumptech.glide.load.PreferredColorSpace r1 = new com.bumptech.glide.load.PreferredColorSpace
            java.lang.String r3 = "DISPLAY_P3"
            r4 = 1
            r1.<init>(r3, r4)
            com.bumptech.glide.load.PreferredColorSpace.DISPLAY_P3 = r1
            r3 = 2
            com.bumptech.glide.load.PreferredColorSpace[] r3 = new com.bumptech.glide.load.PreferredColorSpace[r3]
            r3[r2] = r0
            r3[r4] = r1
            com.bumptech.glide.load.PreferredColorSpace.$VALUES = r3
            return
    }

    private PreferredColorSpace(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.bumptech.glide.load.PreferredColorSpace valueOf(java.lang.String r1) {
            java.lang.Class<com.bumptech.glide.load.PreferredColorSpace> r0 = com.bumptech.glide.load.PreferredColorSpace.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.bumptech.glide.load.PreferredColorSpace r1 = (com.bumptech.glide.load.PreferredColorSpace) r1
            return r1
    }

    public static com.bumptech.glide.load.PreferredColorSpace[] values() {
            com.bumptech.glide.load.PreferredColorSpace[] r0 = com.bumptech.glide.load.PreferredColorSpace.$VALUES
            java.lang.Object r0 = r0.clone()
            com.bumptech.glide.load.PreferredColorSpace[] r0 = (com.bumptech.glide.load.PreferredColorSpace[]) r0
            return r0
    }
}
