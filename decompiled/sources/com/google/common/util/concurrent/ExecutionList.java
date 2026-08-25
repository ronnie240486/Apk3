package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
public final class ExecutionList {
    private static final java.util.logging.Logger log = null;

    @com.google.errorprone.annotations.concurrent.GuardedBy("this")
    private boolean executed;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.GuardedBy("this")
    private com.google.common.util.concurrent.ExecutionList.RunnableExecutorPair runnables;

    /* JADX INFO: loaded from: classes3.dex */
    public static final class RunnableExecutorPair {
        public final java.util.concurrent.Executor executor;

        @javax.annotation.CheckForNull
        public com.google.common.util.concurrent.ExecutionList.RunnableExecutorPair next;
        public final java.lang.Runnable runnable;

        public RunnableExecutorPair(java.lang.Runnable r1, java.util.concurrent.Executor r2, @javax.annotation.CheckForNull com.google.common.util.concurrent.ExecutionList.RunnableExecutorPair r3) {
                r0 = this;
                r0.<init>()
                r0.runnable = r1
                r0.executor = r2
                r0.next = r3
                return
        }
    }

    static {
            java.lang.Class<com.google.common.util.concurrent.ExecutionList> r0 = com.google.common.util.concurrent.ExecutionList.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.common.util.concurrent.ExecutionList.log = r0
            return
    }

    public ExecutionList() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void executeListener(java.lang.Runnable r6, java.util.concurrent.Executor r7) {
            r7.execute(r6)     // Catch: java.lang.RuntimeException -> L4
            goto L27
        L4:
            r0 = move-exception
            java.util.logging.Logger r1 = com.google.common.util.concurrent.ExecutionList.log
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            int r3 = r6.length()
            int r3 = r3 + 57
            int r4 = r7.length()
            int r4 = r4 + r3
            java.lang.String r3 = "RuntimeException while executing runnable "
            java.lang.String r5 = " with executor "
            java.lang.String r6 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r4, r3, r6, r5, r7)
            r1.log(r2, r6, r0)
        L27:
            return
    }

    public void add(java.lang.Runnable r3, java.util.concurrent.Executor r4) {
            r2 = this;
            java.lang.String r0 = "Runnable was null."
            com.google.common.base.Preconditions.checkNotNull(r3, r0)
            java.lang.String r0 = "Executor was null."
            com.google.common.base.Preconditions.checkNotNull(r4, r0)
            monitor-enter(r2)
            boolean r0 = r2.executed     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto L1a
            com.google.common.util.concurrent.ExecutionList$RunnableExecutorPair r0 = new com.google.common.util.concurrent.ExecutionList$RunnableExecutorPair     // Catch: java.lang.Throwable -> L1f
            com.google.common.util.concurrent.ExecutionList$RunnableExecutorPair r1 = r2.runnables     // Catch: java.lang.Throwable -> L1f
            r0.<init>(r3, r4, r1)     // Catch: java.lang.Throwable -> L1f
            r2.runnables = r0     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1f
            return
        L1a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1f
            executeListener(r3, r4)
            return
        L1f:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1f
            throw r3
    }

    public void execute() {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.executed     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L7
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L26
            return
        L7:
            r0 = 1
            r3.executed = r0     // Catch: java.lang.Throwable -> L26
            com.google.common.util.concurrent.ExecutionList$RunnableExecutorPair r0 = r3.runnables     // Catch: java.lang.Throwable -> L26
            r1 = 0
            r3.runnables = r1     // Catch: java.lang.Throwable -> L26
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L26
        L10:
            if (r0 == 0) goto L19
            com.google.common.util.concurrent.ExecutionList$RunnableExecutorPair r2 = r0.next
            r0.next = r1
            r1 = r0
            r0 = r2
            goto L10
        L19:
            if (r1 == 0) goto L25
            java.lang.Runnable r0 = r1.runnable
            java.util.concurrent.Executor r2 = r1.executor
            executeListener(r0, r2)
            com.google.common.util.concurrent.ExecutionList$RunnableExecutorPair r1 = r1.next
            goto L19
        L25:
            return
        L26:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L26
            throw r0
    }
}
