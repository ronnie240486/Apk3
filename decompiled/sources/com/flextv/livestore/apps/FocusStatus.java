package com.flextv.livestore.apps;

/* JADX INFO: loaded from: classes.dex */
public final enum FocusStatus extends java.lang.Enum<com.flextv.livestore.apps.FocusStatus> {
    private static final /* synthetic */ com.flextv.livestore.apps.FocusStatus[] $VALUES = null;
    public static final com.flextv.livestore.apps.FocusStatus first = null;
    public static final com.flextv.livestore.apps.FocusStatus fourth = null;
    public static final com.flextv.livestore.apps.FocusStatus second = null;
    public static final com.flextv.livestore.apps.FocusStatus third = null;

    static {
            com.flextv.livestore.apps.FocusStatus r0 = new com.flextv.livestore.apps.FocusStatus
            java.lang.String r1 = "first"
            r2 = 0
            r0.<init>(r1, r2)
            com.flextv.livestore.apps.FocusStatus.first = r0
            com.flextv.livestore.apps.FocusStatus r1 = new com.flextv.livestore.apps.FocusStatus
            java.lang.String r3 = "second"
            r4 = 1
            r1.<init>(r3, r4)
            com.flextv.livestore.apps.FocusStatus.second = r1
            com.flextv.livestore.apps.FocusStatus r3 = new com.flextv.livestore.apps.FocusStatus
            java.lang.String r5 = "third"
            r6 = 2
            r3.<init>(r5, r6)
            com.flextv.livestore.apps.FocusStatus.third = r3
            com.flextv.livestore.apps.FocusStatus r5 = new com.flextv.livestore.apps.FocusStatus
            java.lang.String r7 = "fourth"
            r8 = 3
            r5.<init>(r7, r8)
            com.flextv.livestore.apps.FocusStatus.fourth = r5
            r7 = 4
            com.flextv.livestore.apps.FocusStatus[] r7 = new com.flextv.livestore.apps.FocusStatus[r7]
            r7[r2] = r0
            r7[r4] = r1
            r7[r6] = r3
            r7[r8] = r5
            com.flextv.livestore.apps.FocusStatus.$VALUES = r7
            return
    }

    private FocusStatus(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.flextv.livestore.apps.FocusStatus valueOf(java.lang.String r1) {
            java.lang.Class<com.flextv.livestore.apps.FocusStatus> r0 = com.flextv.livestore.apps.FocusStatus.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.flextv.livestore.apps.FocusStatus r1 = (com.flextv.livestore.apps.FocusStatus) r1
            return r1
    }

    public static com.flextv.livestore.apps.FocusStatus[] values() {
            com.flextv.livestore.apps.FocusStatus[] r0 = com.flextv.livestore.apps.FocusStatus.$VALUES
            java.lang.Object r0 = r0.clone()
            com.flextv.livestore.apps.FocusStatus[] r0 = (com.flextv.livestore.apps.FocusStatus[]) r0
            return r0
    }
}
