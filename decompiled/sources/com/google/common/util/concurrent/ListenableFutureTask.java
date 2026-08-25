package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
public class ListenableFutureTask<V> extends java.util.concurrent.FutureTask<V> implements com.google.common.util.concurrent.ListenableFuture<V> {
    private final com.google.common.util.concurrent.ExecutionList executionList;

    public ListenableFutureTask(java.lang.Runnable r1, @com.google.common.util.concurrent.ParametricNullness V r2) {
            r0 = this;
            r0.<init>(r1, r2)
            com.google.common.util.concurrent.ExecutionList r1 = new com.google.common.util.concurrent.ExecutionList
            r1.<init>()
            r0.executionList = r1
            return
    }

    public ListenableFutureTask(java.util.concurrent.Callable<V> r1) {
            r0 = this;
            r0.<init>(r1)
            com.google.common.util.concurrent.ExecutionList r1 = new com.google.common.util.concurrent.ExecutionList
            r1.<init>()
            r0.executionList = r1
            return
    }

    public static <V> com.google.common.util.concurrent.ListenableFutureTask<V> create(java.lang.Runnable r1, @com.google.common.util.concurrent.ParametricNullness V r2) {
            com.google.common.util.concurrent.ListenableFutureTask r0 = new com.google.common.util.concurrent.ListenableFutureTask
            r0.<init>(r1, r2)
            return r0
    }

    public static <V> com.google.common.util.concurrent.ListenableFutureTask<V> create(java.util.concurrent.Callable<V> r1) {
            com.google.common.util.concurrent.ListenableFutureTask r0 = new com.google.common.util.concurrent.ListenableFutureTask
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(java.lang.Runnable r2, java.util.concurrent.Executor r3) {
            r1 = this;
            com.google.common.util.concurrent.ExecutionList r0 = r1.executionList
            r0.add(r2, r3)
            return
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
            r1 = this;
            com.google.common.util.concurrent.ExecutionList r0 = r1.executionList
            r0.execute()
            return
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.common.util.concurrent.ParametricNullness
    public V get(long r6, java.util.concurrent.TimeUnit r8) throws java.util.concurrent.TimeoutException, java.lang.InterruptedException, java.util.concurrent.ExecutionException {
            r5 = this;
            long r0 = r8.toNanos(r6)
            r2 = 2147483647999999999(0x1dcd64ffffffffff, double:3.98785104510193E-165)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L12
            java.lang.Object r6 = super.get(r6, r8)
            return r6
        L12:
            long r6 = java.lang.Math.min(r0, r2)
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.NANOSECONDS
            java.lang.Object r6 = super.get(r6, r8)
            return r6
    }
}
