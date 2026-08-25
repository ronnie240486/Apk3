package com.google.common.cache;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.cache.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtCompatible
public abstract enum RemovalCause extends java.lang.Enum<com.google.common.cache.RemovalCause> {
    private static final /* synthetic */ com.google.common.cache.RemovalCause[] $VALUES = null;
    public static final com.google.common.cache.RemovalCause COLLECTED = null;
    public static final com.google.common.cache.RemovalCause EXPIRED = null;
    public static final com.google.common.cache.RemovalCause EXPLICIT = null;
    public static final com.google.common.cache.RemovalCause REPLACED = null;
    public static final com.google.common.cache.RemovalCause SIZE = null;






    private static /* synthetic */ com.google.common.cache.RemovalCause[] $values() {
            r0 = 5
            com.google.common.cache.RemovalCause[] r0 = new com.google.common.cache.RemovalCause[r0]
            com.google.common.cache.RemovalCause r1 = com.google.common.cache.RemovalCause.EXPLICIT
            r2 = 0
            r0[r2] = r1
            com.google.common.cache.RemovalCause r1 = com.google.common.cache.RemovalCause.REPLACED
            r2 = 1
            r0[r2] = r1
            com.google.common.cache.RemovalCause r1 = com.google.common.cache.RemovalCause.COLLECTED
            r2 = 2
            r0[r2] = r1
            com.google.common.cache.RemovalCause r1 = com.google.common.cache.RemovalCause.EXPIRED
            r2 = 3
            r0[r2] = r1
            com.google.common.cache.RemovalCause r1 = com.google.common.cache.RemovalCause.SIZE
            r2 = 4
            r0[r2] = r1
            return r0
    }

    static {
            com.google.common.cache.RemovalCause$1 r0 = new com.google.common.cache.RemovalCause$1
            r0.<init>()
            com.google.common.cache.RemovalCause.EXPLICIT = r0
            com.google.common.cache.RemovalCause$2 r0 = new com.google.common.cache.RemovalCause$2
            r0.<init>()
            com.google.common.cache.RemovalCause.REPLACED = r0
            com.google.common.cache.RemovalCause$3 r0 = new com.google.common.cache.RemovalCause$3
            r0.<init>()
            com.google.common.cache.RemovalCause.COLLECTED = r0
            com.google.common.cache.RemovalCause$4 r0 = new com.google.common.cache.RemovalCause$4
            r0.<init>()
            com.google.common.cache.RemovalCause.EXPIRED = r0
            com.google.common.cache.RemovalCause$5 r0 = new com.google.common.cache.RemovalCause$5
            r0.<init>()
            com.google.common.cache.RemovalCause.SIZE = r0
            com.google.common.cache.RemovalCause[] r0 = $values()
            com.google.common.cache.RemovalCause.$VALUES = r0
            return
    }

    private RemovalCause(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public /* synthetic */ RemovalCause(java.lang.String r1, int r2, com.google.common.cache.RemovalCause.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.google.common.cache.RemovalCause valueOf(java.lang.String r1) {
            java.lang.Class<com.google.common.cache.RemovalCause> r0 = com.google.common.cache.RemovalCause.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.common.cache.RemovalCause r1 = (com.google.common.cache.RemovalCause) r1
            return r1
    }

    public static com.google.common.cache.RemovalCause[] values() {
            com.google.common.cache.RemovalCause[] r0 = com.google.common.cache.RemovalCause.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.common.cache.RemovalCause[] r0 = (com.google.common.cache.RemovalCause[]) r0
            return r0
    }

    public abstract boolean wasEvicted();
}
