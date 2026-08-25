package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtCompatible(emulated = true)
public final class Uninterruptibles {
    private Uninterruptibles() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.common.annotations.Beta
    @com.google.common.annotations.GwtIncompatible
    public static void awaitTerminationUninterruptibly(java.util.concurrent.ExecutorService r3) {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            boolean r3 = awaitTerminationUninterruptibly(r3, r1, r0)
            com.google.common.base.Verify.verify(r3)
            return
    }

    @com.google.common.annotations.Beta
    @com.google.common.annotations.GwtIncompatible
    public static boolean awaitTerminationUninterruptibly(java.util.concurrent.ExecutorService r3, long r4, java.util.concurrent.TimeUnit r6) {
            r0 = 0
            long r4 = r6.toNanos(r4)     // Catch: java.lang.Throwable -> L22
            long r1 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L22
            long r1 = r1 + r4
        La:
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.InterruptedException -> L1a java.lang.Throwable -> L22
            boolean r3 = r3.awaitTermination(r4, r6)     // Catch: java.lang.InterruptedException -> L1a java.lang.Throwable -> L22
            if (r0 == 0) goto L19
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r4.interrupt()
        L19:
            return r3
        L1a:
            r0 = 1
            long r4 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L22
            long r4 = r1 - r4
            goto La
        L22:
            r3 = move-exception
            if (r0 == 0) goto L2c
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r4.interrupt()
        L2c:
            throw r3
    }

    @com.google.common.annotations.GwtIncompatible
    public static void awaitUninterruptibly(java.util.concurrent.CountDownLatch r1) {
            r0 = 0
        L1:
            r1.await()     // Catch: java.lang.Throwable -> Le java.lang.InterruptedException -> L19
            if (r0 == 0) goto Ld
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        Ld:
            return
        Le:
            r1 = move-exception
            if (r0 == 0) goto L18
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L18:
            throw r1
        L19:
            r0 = 1
            goto L1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.common.annotations.GwtIncompatible
    public static boolean awaitUninterruptibly(java.util.concurrent.CountDownLatch r3, long r4, java.util.concurrent.TimeUnit r6) {
            r0 = 0
            long r4 = r6.toNanos(r4)     // Catch: java.lang.Throwable -> L22
            long r1 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L22
            long r1 = r1 + r4
        La:
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.InterruptedException -> L1a java.lang.Throwable -> L22
            boolean r3 = r3.await(r4, r6)     // Catch: java.lang.InterruptedException -> L1a java.lang.Throwable -> L22
            if (r0 == 0) goto L19
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r4.interrupt()
        L19:
            return r3
        L1a:
            r0 = 1
            long r4 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L22
            long r4 = r1 - r4
            goto La
        L22:
            r3 = move-exception
            if (r0 == 0) goto L2c
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r4.interrupt()
        L2c:
            throw r3
    }

    @com.google.common.annotations.GwtIncompatible
    public static boolean awaitUninterruptibly(java.util.concurrent.locks.Condition r3, long r4, java.util.concurrent.TimeUnit r6) {
            r0 = 0
            long r4 = r6.toNanos(r4)     // Catch: java.lang.Throwable -> L22
            long r1 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L22
            long r1 = r1 + r4
        La:
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.InterruptedException -> L1a java.lang.Throwable -> L22
            boolean r3 = r3.await(r4, r6)     // Catch: java.lang.InterruptedException -> L1a java.lang.Throwable -> L22
            if (r0 == 0) goto L19
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r4.interrupt()
        L19:
            return r3
        L1a:
            r0 = 1
            long r4 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L22
            long r4 = r1 - r4
            goto La
        L22:
            r3 = move-exception
            if (r0 == 0) goto L2c
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r4.interrupt()
        L2c:
            throw r3
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.common.util.concurrent.ParametricNullness
    public static <V> V getUninterruptibly(java.util.concurrent.Future<V> r1) throws java.util.concurrent.ExecutionException {
            r0 = 0
        L1:
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> Lf java.lang.InterruptedException -> L1a
            if (r0 == 0) goto Le
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        Le:
            return r1
        Lf:
            r1 = move-exception
            if (r0 == 0) goto L19
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L19:
            throw r1
        L1a:
            r0 = 1
            goto L1
    }

    @com.google.common.annotations.GwtIncompatible
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.common.util.concurrent.ParametricNullness
    public static <V> V getUninterruptibly(java.util.concurrent.Future<V> r3, long r4, java.util.concurrent.TimeUnit r6) throws java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
            r0 = 0
            long r4 = r6.toNanos(r4)     // Catch: java.lang.Throwable -> L22
            long r1 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L22
            long r1 = r1 + r4
        La:
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.InterruptedException -> L1a java.lang.Throwable -> L22
            java.lang.Object r3 = r3.get(r4, r6)     // Catch: java.lang.InterruptedException -> L1a java.lang.Throwable -> L22
            if (r0 == 0) goto L19
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r4.interrupt()
        L19:
            return r3
        L1a:
            r0 = 1
            long r4 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L22
            long r4 = r1 - r4
            goto La
        L22:
            r3 = move-exception
            if (r0 == 0) goto L2c
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r4.interrupt()
        L2c:
            throw r3
    }

    @com.google.common.annotations.GwtIncompatible
    public static void joinUninterruptibly(java.lang.Thread r1) {
            r0 = 0
        L1:
            r1.join()     // Catch: java.lang.Throwable -> Le java.lang.InterruptedException -> L19
            if (r0 == 0) goto Ld
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        Ld:
            return
        Le:
            r1 = move-exception
            if (r0 == 0) goto L18
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L18:
            throw r1
        L19:
            r0 = 1
            goto L1
    }

    @com.google.common.annotations.GwtIncompatible
    public static void joinUninterruptibly(java.lang.Thread r3, long r4, java.util.concurrent.TimeUnit r6) {
            com.google.common.base.Preconditions.checkNotNull(r3)
            r0 = 0
            long r4 = r6.toNanos(r4)     // Catch: java.lang.Throwable -> L24
            long r1 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L24
            long r1 = r1 + r4
        Ld:
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.InterruptedException -> L1c java.lang.Throwable -> L24
            r6.timedJoin(r3, r4)     // Catch: java.lang.InterruptedException -> L1c java.lang.Throwable -> L24
            if (r0 == 0) goto L1b
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            r3.interrupt()
        L1b:
            return
        L1c:
            r0 = 1
            long r4 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L24
            long r4 = r1 - r4
            goto Ld
        L24:
            r3 = move-exception
            if (r0 == 0) goto L2e
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r4.interrupt()
        L2e:
            throw r3
    }

    @com.google.common.annotations.GwtIncompatible
    public static <E> void putUninterruptibly(java.util.concurrent.BlockingQueue<E> r1, E r2) {
            r0 = 0
        L1:
            r1.put(r2)     // Catch: java.lang.Throwable -> Le java.lang.InterruptedException -> L19
            if (r0 == 0) goto Ld
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        Ld:
            return
        Le:
            r1 = move-exception
            if (r0 == 0) goto L18
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r2.interrupt()
        L18:
            throw r1
        L19:
            r0 = 1
            goto L1
    }

    @com.google.common.annotations.GwtIncompatible
    public static void sleepUninterruptibly(long r3, java.util.concurrent.TimeUnit r5) {
            r0 = 0
            long r3 = r5.toNanos(r3)     // Catch: java.lang.Throwable -> L21
            long r1 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L21
            long r1 = r1 + r3
        La:
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.InterruptedException -> L19 java.lang.Throwable -> L21
            r5.sleep(r3)     // Catch: java.lang.InterruptedException -> L19 java.lang.Throwable -> L21
            if (r0 == 0) goto L18
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            r3.interrupt()
        L18:
            return
        L19:
            r0 = 1
            long r3 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L21
            long r3 = r1 - r3
            goto La
        L21:
            r3 = move-exception
            if (r0 == 0) goto L2b
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r4.interrupt()
        L2b:
            throw r3
    }

    @com.google.common.annotations.GwtIncompatible
    public static <E> E takeUninterruptibly(java.util.concurrent.BlockingQueue<E> r1) {
            r0 = 0
        L1:
            java.lang.Object r1 = r1.take()     // Catch: java.lang.Throwable -> Lf java.lang.InterruptedException -> L1a
            if (r0 == 0) goto Le
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        Le:
            return r1
        Lf:
            r1 = move-exception
            if (r0 == 0) goto L19
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L19:
            throw r1
        L1a:
            r0 = 1
            goto L1
    }

    @com.google.common.annotations.GwtIncompatible
    public static boolean tryAcquireUninterruptibly(java.util.concurrent.Semaphore r3, int r4, long r5, java.util.concurrent.TimeUnit r7) {
            r0 = 0
            long r5 = r7.toNanos(r5)     // Catch: java.lang.Throwable -> L22
            long r1 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L22
            long r1 = r1 + r5
        La:
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.InterruptedException -> L1a java.lang.Throwable -> L22
            boolean r3 = r3.tryAcquire(r4, r5, r7)     // Catch: java.lang.InterruptedException -> L1a java.lang.Throwable -> L22
            if (r0 == 0) goto L19
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r4.interrupt()
        L19:
            return r3
        L1a:
            r0 = 1
            long r5 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L22
            long r5 = r1 - r5
            goto La
        L22:
            r3 = move-exception
            if (r0 == 0) goto L2c
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r4.interrupt()
        L2c:
            throw r3
    }

    @com.google.common.annotations.GwtIncompatible
    public static boolean tryAcquireUninterruptibly(java.util.concurrent.Semaphore r1, long r2, java.util.concurrent.TimeUnit r4) {
            r0 = 1
            boolean r1 = tryAcquireUninterruptibly(r1, r0, r2, r4)
            return r1
    }

    @com.google.common.annotations.GwtIncompatible
    public static boolean tryLockUninterruptibly(java.util.concurrent.locks.Lock r3, long r4, java.util.concurrent.TimeUnit r6) {
            r0 = 0
            long r4 = r6.toNanos(r4)     // Catch: java.lang.Throwable -> L22
            long r1 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L22
            long r1 = r1 + r4
        La:
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.InterruptedException -> L1a java.lang.Throwable -> L22
            boolean r3 = r3.tryLock(r4, r6)     // Catch: java.lang.InterruptedException -> L1a java.lang.Throwable -> L22
            if (r0 == 0) goto L19
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r4.interrupt()
        L19:
            return r3
        L1a:
            r0 = 1
            long r4 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L22
            long r4 = r1 - r4
            goto La
        L22:
            r3 = move-exception
            if (r0 == 0) goto L2c
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r4.interrupt()
        L2c:
            throw r3
    }
}
