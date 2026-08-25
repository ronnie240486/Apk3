package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtCompatible
final enum DirectExecutor extends java.lang.Enum<com.google.common.util.concurrent.DirectExecutor> implements java.util.concurrent.Executor {
    private static final /* synthetic */ com.google.common.util.concurrent.DirectExecutor[] $VALUES = null;
    public static final com.google.common.util.concurrent.DirectExecutor INSTANCE = null;

    private static /* synthetic */ com.google.common.util.concurrent.DirectExecutor[] $values() {
            r0 = 1
            com.google.common.util.concurrent.DirectExecutor[] r0 = new com.google.common.util.concurrent.DirectExecutor[r0]
            com.google.common.util.concurrent.DirectExecutor r1 = com.google.common.util.concurrent.DirectExecutor.INSTANCE
            r2 = 0
            r0[r2] = r1
            return r0
    }

    static {
            com.google.common.util.concurrent.DirectExecutor r0 = new com.google.common.util.concurrent.DirectExecutor
            java.lang.String r1 = "INSTANCE"
            r2 = 0
            r0.<init>(r1, r2)
            com.google.common.util.concurrent.DirectExecutor.INSTANCE = r0
            com.google.common.util.concurrent.DirectExecutor[] r0 = $values()
            com.google.common.util.concurrent.DirectExecutor.$VALUES = r0
            return
    }

    private DirectExecutor(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.google.common.util.concurrent.DirectExecutor valueOf(java.lang.String r1) {
            java.lang.Class<com.google.common.util.concurrent.DirectExecutor> r0 = com.google.common.util.concurrent.DirectExecutor.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.common.util.concurrent.DirectExecutor r1 = (com.google.common.util.concurrent.DirectExecutor) r1
            return r1
    }

    public static com.google.common.util.concurrent.DirectExecutor[] values() {
            com.google.common.util.concurrent.DirectExecutor[] r0 = com.google.common.util.concurrent.DirectExecutor.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.common.util.concurrent.DirectExecutor[] r0 = (com.google.common.util.concurrent.DirectExecutor[]) r0
            return r0
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable r1) {
            r0 = this;
            r1.run()
            return
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "MoreExecutors.directExecutor()"
            return r0
    }
}
