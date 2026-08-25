package com.bumptech.glide.load;

/* JADX INFO: loaded from: classes2.dex */
public final enum DataSource extends java.lang.Enum<com.bumptech.glide.load.DataSource> {
    private static final /* synthetic */ com.bumptech.glide.load.DataSource[] $VALUES = null;
    public static final com.bumptech.glide.load.DataSource DATA_DISK_CACHE = null;
    public static final com.bumptech.glide.load.DataSource LOCAL = null;
    public static final com.bumptech.glide.load.DataSource MEMORY_CACHE = null;
    public static final com.bumptech.glide.load.DataSource REMOTE = null;
    public static final com.bumptech.glide.load.DataSource RESOURCE_DISK_CACHE = null;

    static {
            com.bumptech.glide.load.DataSource r0 = new com.bumptech.glide.load.DataSource
            java.lang.String r1 = "LOCAL"
            r2 = 0
            r0.<init>(r1, r2)
            com.bumptech.glide.load.DataSource.LOCAL = r0
            com.bumptech.glide.load.DataSource r1 = new com.bumptech.glide.load.DataSource
            java.lang.String r3 = "REMOTE"
            r4 = 1
            r1.<init>(r3, r4)
            com.bumptech.glide.load.DataSource.REMOTE = r1
            com.bumptech.glide.load.DataSource r3 = new com.bumptech.glide.load.DataSource
            java.lang.String r5 = "DATA_DISK_CACHE"
            r6 = 2
            r3.<init>(r5, r6)
            com.bumptech.glide.load.DataSource.DATA_DISK_CACHE = r3
            com.bumptech.glide.load.DataSource r5 = new com.bumptech.glide.load.DataSource
            java.lang.String r7 = "RESOURCE_DISK_CACHE"
            r8 = 3
            r5.<init>(r7, r8)
            com.bumptech.glide.load.DataSource.RESOURCE_DISK_CACHE = r5
            com.bumptech.glide.load.DataSource r7 = new com.bumptech.glide.load.DataSource
            java.lang.String r9 = "MEMORY_CACHE"
            r10 = 4
            r7.<init>(r9, r10)
            com.bumptech.glide.load.DataSource.MEMORY_CACHE = r7
            r9 = 5
            com.bumptech.glide.load.DataSource[] r9 = new com.bumptech.glide.load.DataSource[r9]
            r9[r2] = r0
            r9[r4] = r1
            r9[r6] = r3
            r9[r8] = r5
            r9[r10] = r7
            com.bumptech.glide.load.DataSource.$VALUES = r9
            return
    }

    private DataSource(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.bumptech.glide.load.DataSource valueOf(java.lang.String r1) {
            java.lang.Class<com.bumptech.glide.load.DataSource> r0 = com.bumptech.glide.load.DataSource.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.bumptech.glide.load.DataSource r1 = (com.bumptech.glide.load.DataSource) r1
            return r1
    }

    public static com.bumptech.glide.load.DataSource[] values() {
            com.bumptech.glide.load.DataSource[] r0 = com.bumptech.glide.load.DataSource.$VALUES
            java.lang.Object r0 = r0.clone()
            com.bumptech.glide.load.DataSource[] r0 = (com.bumptech.glide.load.DataSource[]) r0
            return r0
    }
}
