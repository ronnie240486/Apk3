package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible(emulated = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class Queues {
    private Queues() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.common.annotations.Beta
    @com.google.common.annotations.GwtIncompatible
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static <E> int drain(java.util.concurrent.BlockingQueue<E> r3, java.util.Collection<? super E> r4, int r5, long r6, java.util.concurrent.TimeUnit r8) throws java.lang.InterruptedException {
            com.google.common.base.Preconditions.checkNotNull(r4)
            long r0 = java.lang.System.nanoTime()
            long r6 = r8.toNanos(r6)
            long r6 = r6 + r0
            r8 = 0
        Ld:
            if (r8 >= r5) goto L2d
            int r0 = r5 - r8
            int r0 = r3.drainTo(r4, r0)
            int r8 = r8 + r0
            if (r8 >= r5) goto Ld
            long r0 = java.lang.System.nanoTime()
            long r0 = r6 - r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            java.lang.Object r0 = r3.poll(r0, r2)
            if (r0 != 0) goto L27
            goto L2d
        L27:
            r4.add(r0)
            int r8 = r8 + 1
            goto Ld
        L2d:
            return r8
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.common.annotations.Beta
    @com.google.common.annotations.GwtIncompatible
    public static <E> int drainUninterruptibly(java.util.concurrent.BlockingQueue<E> r4, java.util.Collection<? super E> r5, int r6, long r7, java.util.concurrent.TimeUnit r9) {
            com.google.common.base.Preconditions.checkNotNull(r5)
            long r0 = java.lang.System.nanoTime()
            long r7 = r9.toNanos(r7)
            long r7 = r7 + r0
            r9 = 0
            r0 = 0
        Le:
            if (r9 >= r6) goto L3b
            int r1 = r6 - r9
            int r1 = r4.drainTo(r5, r1)     // Catch: java.lang.Throwable -> L30
            int r9 = r9 + r1
            if (r9 >= r6) goto Le
        L19:
            long r1 = java.lang.System.nanoTime()     // Catch: java.lang.InterruptedException -> L2e java.lang.Throwable -> L30
            long r1 = r7 - r1
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.InterruptedException -> L2e java.lang.Throwable -> L30
            java.lang.Object r1 = r4.poll(r1, r3)     // Catch: java.lang.InterruptedException -> L2e java.lang.Throwable -> L30
            if (r1 != 0) goto L28
            goto L3b
        L28:
            r5.add(r1)     // Catch: java.lang.Throwable -> L30
            int r9 = r9 + 1
            goto Le
        L2e:
            r0 = 1
            goto L19
        L30:
            r4 = move-exception
            if (r0 == 0) goto L3a
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            r5.interrupt()
        L3a:
            throw r4
        L3b:
            if (r0 == 0) goto L44
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r4.interrupt()
        L44:
            return r9
    }

    @com.google.common.annotations.GwtIncompatible
    public static <E> java.util.concurrent.ArrayBlockingQueue<E> newArrayBlockingQueue(int r1) {
            java.util.concurrent.ArrayBlockingQueue r0 = new java.util.concurrent.ArrayBlockingQueue
            r0.<init>(r1)
            return r0
    }

    public static <E> java.util.ArrayDeque<E> newArrayDeque() {
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            return r0
    }

    public static <E> java.util.ArrayDeque<E> newArrayDeque(java.lang.Iterable<? extends E> r1) {
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto Lc
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            java.util.Collection r1 = (java.util.Collection) r1
            r0.<init>(r1)
            return r0
        Lc:
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            com.google.common.collect.Iterables.addAll(r0, r1)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static <E> java.util.concurrent.ConcurrentLinkedQueue<E> newConcurrentLinkedQueue() {
            java.util.concurrent.ConcurrentLinkedQueue r0 = new java.util.concurrent.ConcurrentLinkedQueue
            r0.<init>()
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static <E> java.util.concurrent.ConcurrentLinkedQueue<E> newConcurrentLinkedQueue(java.lang.Iterable<? extends E> r1) {
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto Lc
            java.util.concurrent.ConcurrentLinkedQueue r0 = new java.util.concurrent.ConcurrentLinkedQueue
            java.util.Collection r1 = (java.util.Collection) r1
            r0.<init>(r1)
            return r0
        Lc:
            java.util.concurrent.ConcurrentLinkedQueue r0 = new java.util.concurrent.ConcurrentLinkedQueue
            r0.<init>()
            com.google.common.collect.Iterables.addAll(r0, r1)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static <E> java.util.concurrent.LinkedBlockingDeque<E> newLinkedBlockingDeque() {
            java.util.concurrent.LinkedBlockingDeque r0 = new java.util.concurrent.LinkedBlockingDeque
            r0.<init>()
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static <E> java.util.concurrent.LinkedBlockingDeque<E> newLinkedBlockingDeque(int r1) {
            java.util.concurrent.LinkedBlockingDeque r0 = new java.util.concurrent.LinkedBlockingDeque
            r0.<init>(r1)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static <E> java.util.concurrent.LinkedBlockingDeque<E> newLinkedBlockingDeque(java.lang.Iterable<? extends E> r1) {
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto Lc
            java.util.concurrent.LinkedBlockingDeque r0 = new java.util.concurrent.LinkedBlockingDeque
            java.util.Collection r1 = (java.util.Collection) r1
            r0.<init>(r1)
            return r0
        Lc:
            java.util.concurrent.LinkedBlockingDeque r0 = new java.util.concurrent.LinkedBlockingDeque
            r0.<init>()
            com.google.common.collect.Iterables.addAll(r0, r1)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static <E> java.util.concurrent.LinkedBlockingQueue<E> newLinkedBlockingQueue() {
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r0.<init>()
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static <E> java.util.concurrent.LinkedBlockingQueue<E> newLinkedBlockingQueue(int r1) {
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r0.<init>(r1)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static <E> java.util.concurrent.LinkedBlockingQueue<E> newLinkedBlockingQueue(java.lang.Iterable<? extends E> r1) {
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto Lc
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            java.util.Collection r1 = (java.util.Collection) r1
            r0.<init>(r1)
            return r0
        Lc:
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r0.<init>()
            com.google.common.collect.Iterables.addAll(r0, r1)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static <E extends java.lang.Comparable> java.util.concurrent.PriorityBlockingQueue<E> newPriorityBlockingQueue() {
            java.util.concurrent.PriorityBlockingQueue r0 = new java.util.concurrent.PriorityBlockingQueue
            r0.<init>()
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static <E extends java.lang.Comparable> java.util.concurrent.PriorityBlockingQueue<E> newPriorityBlockingQueue(java.lang.Iterable<? extends E> r1) {
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto Lc
            java.util.concurrent.PriorityBlockingQueue r0 = new java.util.concurrent.PriorityBlockingQueue
            java.util.Collection r1 = (java.util.Collection) r1
            r0.<init>(r1)
            return r0
        Lc:
            java.util.concurrent.PriorityBlockingQueue r0 = new java.util.concurrent.PriorityBlockingQueue
            r0.<init>()
            com.google.common.collect.Iterables.addAll(r0, r1)
            return r0
    }

    public static <E extends java.lang.Comparable> java.util.PriorityQueue<E> newPriorityQueue() {
            java.util.PriorityQueue r0 = new java.util.PriorityQueue
            r0.<init>()
            return r0
    }

    public static <E extends java.lang.Comparable> java.util.PriorityQueue<E> newPriorityQueue(java.lang.Iterable<? extends E> r1) {
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto Lc
            java.util.PriorityQueue r0 = new java.util.PriorityQueue
            java.util.Collection r1 = (java.util.Collection) r1
            r0.<init>(r1)
            return r0
        Lc:
            java.util.PriorityQueue r0 = new java.util.PriorityQueue
            r0.<init>()
            com.google.common.collect.Iterables.addAll(r0, r1)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static <E> java.util.concurrent.SynchronousQueue<E> newSynchronousQueue() {
            java.util.concurrent.SynchronousQueue r0 = new java.util.concurrent.SynchronousQueue
            r0.<init>()
            return r0
    }

    public static <E> java.util.Deque<E> synchronizedDeque(java.util.Deque<E> r1) {
            com.google.common.collect.Synchronized$SynchronizedDeque r0 = new com.google.common.collect.Synchronized$SynchronizedDeque
            r0.<init>(r1)
            return r0
    }

    public static <E> java.util.Queue<E> synchronizedQueue(java.util.Queue<E> r1) {
            boolean r0 = r1 instanceof com.google.common.collect.Synchronized.SynchronizedQueue
            if (r0 == 0) goto L5
            goto Lb
        L5:
            com.google.common.collect.Synchronized$SynchronizedQueue r0 = new com.google.common.collect.Synchronized$SynchronizedQueue
            r0.<init>(r1)
            r1 = r0
        Lb:
            return r1
    }
}
