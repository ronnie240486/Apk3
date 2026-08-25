package com.flextv.livestore.apps;

/* JADX INFO: loaded from: classes2.dex */
public final enum HomeType extends java.lang.Enum<com.flextv.livestore.apps.HomeType> {
    private static final /* synthetic */ com.flextv.livestore.apps.HomeType[] $VALUES = null;
    public static final com.flextv.livestore.apps.HomeType live = null;
    public static final com.flextv.livestore.apps.HomeType movies = null;
    public static final com.flextv.livestore.apps.HomeType series = null;
    public static final com.flextv.livestore.apps.HomeType setting = null;

    static {
            com.flextv.livestore.apps.HomeType r0 = new com.flextv.livestore.apps.HomeType
            java.lang.String r1 = "live"
            r2 = 0
            r0.<init>(r1, r2)
            com.flextv.livestore.apps.HomeType.live = r0
            com.flextv.livestore.apps.HomeType r1 = new com.flextv.livestore.apps.HomeType
            java.lang.String r3 = "movies"
            r4 = 1
            r1.<init>(r3, r4)
            com.flextv.livestore.apps.HomeType.movies = r1
            com.flextv.livestore.apps.HomeType r3 = new com.flextv.livestore.apps.HomeType
            java.lang.String r5 = "series"
            r6 = 2
            r3.<init>(r5, r6)
            com.flextv.livestore.apps.HomeType.series = r3
            com.flextv.livestore.apps.HomeType r5 = new com.flextv.livestore.apps.HomeType
            java.lang.String r7 = "setting"
            r8 = 3
            r5.<init>(r7, r8)
            com.flextv.livestore.apps.HomeType.setting = r5
            r7 = 4
            com.flextv.livestore.apps.HomeType[] r7 = new com.flextv.livestore.apps.HomeType[r7]
            r7[r2] = r0
            r7[r4] = r1
            r7[r6] = r3
            r7[r8] = r5
            com.flextv.livestore.apps.HomeType.$VALUES = r7
            return
    }

    private HomeType(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.flextv.livestore.apps.HomeType valueOf(java.lang.String r1) {
            java.lang.Class<com.flextv.livestore.apps.HomeType> r0 = com.flextv.livestore.apps.HomeType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.flextv.livestore.apps.HomeType r1 = (com.flextv.livestore.apps.HomeType) r1
            return r1
    }

    public static com.flextv.livestore.apps.HomeType[] values() {
            com.flextv.livestore.apps.HomeType[] r0 = com.flextv.livestore.apps.HomeType.$VALUES
            java.lang.Object r0 = r0.clone()
            com.flextv.livestore.apps.HomeType[] r0 = (com.flextv.livestore.apps.HomeType[]) r0
            return r0
    }
}
