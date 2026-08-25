package com.google.common.collect;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final enum BoundType extends java.lang.Enum<com.google.common.collect.BoundType> {
    private static final /* synthetic */ com.google.common.collect.BoundType[] $VALUES = null;
    public static final com.google.common.collect.BoundType CLOSED = null;
    public static final com.google.common.collect.BoundType OPEN = null;

    private static /* synthetic */ com.google.common.collect.BoundType[] $values() {
            r0 = 2
            com.google.common.collect.BoundType[] r0 = new com.google.common.collect.BoundType[r0]
            com.google.common.collect.BoundType r1 = com.google.common.collect.BoundType.OPEN
            r2 = 0
            r0[r2] = r1
            com.google.common.collect.BoundType r1 = com.google.common.collect.BoundType.CLOSED
            r2 = 1
            r0[r2] = r1
            return r0
    }

    static {
            com.google.common.collect.BoundType r0 = new com.google.common.collect.BoundType
            java.lang.String r1 = "OPEN"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.google.common.collect.BoundType.OPEN = r0
            com.google.common.collect.BoundType r0 = new com.google.common.collect.BoundType
            java.lang.String r1 = "CLOSED"
            r2 = 1
            r0.<init>(r1, r2, r2)
            com.google.common.collect.BoundType.CLOSED = r0
            com.google.common.collect.BoundType[] r0 = $values()
            com.google.common.collect.BoundType.$VALUES = r0
            return
    }

    private BoundType(java.lang.String r1, int r2, boolean r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.google.common.collect.BoundType forBoolean(boolean r0) {
            if (r0 == 0) goto L5
            com.google.common.collect.BoundType r0 = com.google.common.collect.BoundType.CLOSED
            goto L7
        L5:
            com.google.common.collect.BoundType r0 = com.google.common.collect.BoundType.OPEN
        L7:
            return r0
    }

    public static com.google.common.collect.BoundType valueOf(java.lang.String r1) {
            java.lang.Class<com.google.common.collect.BoundType> r0 = com.google.common.collect.BoundType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.common.collect.BoundType r1 = (com.google.common.collect.BoundType) r1
            return r1
    }

    public static com.google.common.collect.BoundType[] values() {
            com.google.common.collect.BoundType[] r0 = com.google.common.collect.BoundType.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.common.collect.BoundType[] r0 = (com.google.common.collect.BoundType[]) r0
            return r0
    }
}
