package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.Beta
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
public final class Monitor {

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.GuardedBy("lock")
    private com.google.common.util.concurrent.Monitor.Guard activeGuards;
    private final boolean fair;
    private final java.util.concurrent.locks.ReentrantLock lock;

    /* JADX INFO: loaded from: classes3.dex */
    @com.google.common.annotations.Beta
    public static abstract class Guard {
        public final java.util.concurrent.locks.Condition condition;

        @com.google.j2objc.annotations.Weak
        public final com.google.common.util.concurrent.Monitor monitor;

        @javax.annotation.CheckForNull
        @com.google.errorprone.annotations.concurrent.GuardedBy("monitor.lock")
        public com.google.common.util.concurrent.Monitor.Guard next;

        @com.google.errorprone.annotations.concurrent.GuardedBy("monitor.lock")
        public int waiterCount;

        public Guard(com.google.common.util.concurrent.Monitor r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.waiterCount = r0
                java.lang.String r0 = "monitor"
                java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r2, r0)
                com.google.common.util.concurrent.Monitor r0 = (com.google.common.util.concurrent.Monitor) r0
                r1.monitor = r0
                java.util.concurrent.locks.ReentrantLock r2 = com.google.common.util.concurrent.Monitor.access$000(r2)
                java.util.concurrent.locks.Condition r2 = r2.newCondition()
                r1.condition = r2
                return
        }

        public abstract boolean isSatisfied();
    }

    public Monitor() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public Monitor(boolean r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.activeGuards = r0
            r1.fair = r2
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>(r2)
            r1.lock = r0
            return
    }

    public static /* synthetic */ java.util.concurrent.locks.ReentrantLock access$000(com.google.common.util.concurrent.Monitor r0) {
            java.util.concurrent.locks.ReentrantLock r0 = r0.lock
            return r0
    }

    @com.google.errorprone.annotations.concurrent.GuardedBy("lock")
    private void await(com.google.common.util.concurrent.Monitor.Guard r1, boolean r2) throws java.lang.InterruptedException {
            r0 = this;
            if (r2 == 0) goto L5
            r0.signalNextWaiter()
        L5:
            r0.beginWaitingFor(r1)
        L8:
            java.util.concurrent.locks.Condition r2 = r1.condition     // Catch: java.lang.Throwable -> L17
            r2.await()     // Catch: java.lang.Throwable -> L17
            boolean r2 = r1.isSatisfied()     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L8
            r0.endWaitingFor(r1)
            return
        L17:
            r2 = move-exception
            r0.endWaitingFor(r1)
            throw r2
    }

    @com.google.errorprone.annotations.concurrent.GuardedBy("lock")
    private boolean awaitNanos(com.google.common.util.concurrent.Monitor.Guard r7, long r8, boolean r10) throws java.lang.InterruptedException {
            r6 = this;
            r0 = 1
            r1 = 1
        L2:
            r2 = 0
            r4 = 0
            int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r5 > 0) goto Lf
            if (r1 != 0) goto Le
            r6.endWaitingFor(r7)
        Le:
            return r4
        Lf:
            if (r1 == 0) goto L1a
            if (r10 == 0) goto L16
            r6.signalNextWaiter()     // Catch: java.lang.Throwable -> L2c
        L16:
            r6.beginWaitingFor(r7)     // Catch: java.lang.Throwable -> L2c
            r1 = 0
        L1a:
            java.util.concurrent.locks.Condition r2 = r7.condition     // Catch: java.lang.Throwable -> L2c
            long r8 = r2.awaitNanos(r8)     // Catch: java.lang.Throwable -> L2c
            boolean r2 = r7.isSatisfied()     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L2
            if (r1 != 0) goto L2b
            r6.endWaitingFor(r7)
        L2b:
            return r0
        L2c:
            r8 = move-exception
            if (r1 != 0) goto L32
            r6.endWaitingFor(r7)
        L32:
            throw r8
    }

    @com.google.errorprone.annotations.concurrent.GuardedBy("lock")
    private void awaitUninterruptibly(com.google.common.util.concurrent.Monitor.Guard r1, boolean r2) {
            r0 = this;
            if (r2 == 0) goto L5
            r0.signalNextWaiter()
        L5:
            r0.beginWaitingFor(r1)
        L8:
            java.util.concurrent.locks.Condition r2 = r1.condition     // Catch: java.lang.Throwable -> L17
            r2.awaitUninterruptibly()     // Catch: java.lang.Throwable -> L17
            boolean r2 = r1.isSatisfied()     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L8
            r0.endWaitingFor(r1)
            return
        L17:
            r2 = move-exception
            r0.endWaitingFor(r1)
            throw r2
    }

    @com.google.errorprone.annotations.concurrent.GuardedBy("lock")
    private void beginWaitingFor(com.google.common.util.concurrent.Monitor.Guard r3) {
            r2 = this;
            int r0 = r3.waiterCount
            int r1 = r0 + 1
            r3.waiterCount = r1
            if (r0 != 0) goto Le
            com.google.common.util.concurrent.Monitor$Guard r0 = r2.activeGuards
            r3.next = r0
            r2.activeGuards = r3
        Le:
            return
    }

    @com.google.errorprone.annotations.concurrent.GuardedBy("lock")
    private void endWaitingFor(com.google.common.util.concurrent.Monitor.Guard r5) {
            r4 = this;
            int r0 = r5.waiterCount
            int r0 = r0 + (-1)
            r5.waiterCount = r0
            if (r0 != 0) goto L22
            com.google.common.util.concurrent.Monitor$Guard r0 = r4.activeGuards
            r1 = 0
            r2 = r1
        Lc:
            if (r0 != r5) goto L1c
            if (r2 != 0) goto L15
            com.google.common.util.concurrent.Monitor$Guard r5 = r0.next
            r4.activeGuards = r5
            goto L19
        L15:
            com.google.common.util.concurrent.Monitor$Guard r5 = r0.next
            r2.next = r5
        L19:
            r0.next = r1
            goto L22
        L1c:
            com.google.common.util.concurrent.Monitor$Guard r2 = r0.next
            r3 = r2
            r2 = r0
            r0 = r3
            goto Lc
        L22:
            return
    }

    private static long initNanoTime(long r3) {
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 > 0) goto L7
            return r0
        L7:
            long r3 = java.lang.System.nanoTime()
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto L11
            r3 = 1
        L11:
            return r3
    }

    @com.google.errorprone.annotations.concurrent.GuardedBy("lock")
    private boolean isSatisfied(com.google.common.util.concurrent.Monitor.Guard r1) {
            r0 = this;
            boolean r1 = r1.isSatisfied()     // Catch: java.lang.Throwable -> L5
            return r1
        L5:
            r1 = move-exception
            r0.signalAllWaiters()
            throw r1
    }

    private static long remainingNanos(long r3, long r5) {
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 > 0) goto L7
            goto Le
        L7:
            long r0 = java.lang.System.nanoTime()
            long r0 = r0 - r3
            long r0 = r5 - r0
        Le:
            return r0
    }

    @com.google.errorprone.annotations.concurrent.GuardedBy("lock")
    private void signalAllWaiters() {
            r2 = this;
            com.google.common.util.concurrent.Monitor$Guard r0 = r2.activeGuards
        L2:
            if (r0 == 0) goto Lc
            java.util.concurrent.locks.Condition r1 = r0.condition
            r1.signalAll()
            com.google.common.util.concurrent.Monitor$Guard r0 = r0.next
            goto L2
        Lc:
            return
    }

    @com.google.errorprone.annotations.concurrent.GuardedBy("lock")
    private void signalNextWaiter() {
            r2 = this;
            com.google.common.util.concurrent.Monitor$Guard r0 = r2.activeGuards
        L2:
            if (r0 == 0) goto L13
            boolean r1 = r2.isSatisfied(r0)
            if (r1 == 0) goto L10
            java.util.concurrent.locks.Condition r0 = r0.condition
            r0.signal()
            goto L13
        L10:
            com.google.common.util.concurrent.Monitor$Guard r0 = r0.next
            goto L2
        L13:
            return
    }

    private static long toSafeNanos(long r6, java.util.concurrent.TimeUnit r8) {
            long r0 = r8.toNanos(r6)
            r2 = 0
            r4 = 6917529027641081853(0x5ffffffffffffffd, double:2.6815615859885185E154)
            long r6 = com.google.common.primitives.Longs.constrainToRange(r0, r2, r4)
            return r6
    }

    public void enter() {
            r1 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r1.lock
            r0.lock()
            return
    }

    public boolean enter(long r8, java.util.concurrent.TimeUnit r10) {
            r7 = this;
            long r8 = toSafeNanos(r8, r10)
            java.util.concurrent.locks.ReentrantLock r10 = r7.lock
            boolean r0 = r7.fair
            r1 = 1
            if (r0 != 0) goto L12
            boolean r0 = r10.tryLock()
            if (r0 == 0) goto L12
            return r1
        L12:
            boolean r0 = java.lang.Thread.interrupted()
            long r2 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L33
            r4 = r8
        L1b:
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.InterruptedException -> L2b java.lang.Throwable -> L33
            boolean r8 = r10.tryLock(r4, r6)     // Catch: java.lang.InterruptedException -> L2b java.lang.Throwable -> L33
            if (r0 == 0) goto L2a
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            r9.interrupt()
        L2a:
            return r8
        L2b:
            long r4 = remainingNanos(r2, r8)     // Catch: java.lang.Throwable -> L31
            r0 = 1
            goto L1b
        L31:
            r8 = move-exception
            goto L35
        L33:
            r8 = move-exception
            r1 = r0
        L35:
            if (r1 == 0) goto L3e
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            r9.interrupt()
        L3e:
            throw r8
    }

    public boolean enterIf(com.google.common.util.concurrent.Monitor.Guard r2) {
            r1 = this;
            com.google.common.util.concurrent.Monitor r0 = r2.monitor
            if (r0 != r1) goto L18
            java.util.concurrent.locks.ReentrantLock r0 = r1.lock
            r0.lock()
            boolean r2 = r2.isSatisfied()     // Catch: java.lang.Throwable -> L13
            if (r2 != 0) goto L12
            r0.unlock()
        L12:
            return r2
        L13:
            r2 = move-exception
            r0.unlock()
            throw r2
        L18:
            java.lang.IllegalMonitorStateException r2 = new java.lang.IllegalMonitorStateException
            r2.<init>()
            throw r2
    }

    public boolean enterIf(com.google.common.util.concurrent.Monitor.Guard r2, long r3, java.util.concurrent.TimeUnit r5) {
            r1 = this;
            com.google.common.util.concurrent.Monitor r0 = r2.monitor
            if (r0 != r1) goto L1f
            boolean r3 = r1.enter(r3, r5)
            if (r3 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            boolean r2 = r2.isSatisfied()     // Catch: java.lang.Throwable -> L18
            if (r2 != 0) goto L17
            java.util.concurrent.locks.ReentrantLock r3 = r1.lock
            r3.unlock()
        L17:
            return r2
        L18:
            r2 = move-exception
            java.util.concurrent.locks.ReentrantLock r3 = r1.lock
            r3.unlock()
            throw r2
        L1f:
            java.lang.IllegalMonitorStateException r2 = new java.lang.IllegalMonitorStateException
            r2.<init>()
            throw r2
    }

    public boolean enterIfInterruptibly(com.google.common.util.concurrent.Monitor.Guard r2) throws java.lang.InterruptedException {
            r1 = this;
            com.google.common.util.concurrent.Monitor r0 = r2.monitor
            if (r0 != r1) goto L18
            java.util.concurrent.locks.ReentrantLock r0 = r1.lock
            r0.lockInterruptibly()
            boolean r2 = r2.isSatisfied()     // Catch: java.lang.Throwable -> L13
            if (r2 != 0) goto L12
            r0.unlock()
        L12:
            return r2
        L13:
            r2 = move-exception
            r0.unlock()
            throw r2
        L18:
            java.lang.IllegalMonitorStateException r2 = new java.lang.IllegalMonitorStateException
            r2.<init>()
            throw r2
    }

    public boolean enterIfInterruptibly(com.google.common.util.concurrent.Monitor.Guard r2, long r3, java.util.concurrent.TimeUnit r5) throws java.lang.InterruptedException {
            r1 = this;
            com.google.common.util.concurrent.Monitor r0 = r2.monitor
            if (r0 != r1) goto L1d
            java.util.concurrent.locks.ReentrantLock r0 = r1.lock
            boolean r3 = r0.tryLock(r3, r5)
            if (r3 != 0) goto Le
            r2 = 0
            return r2
        Le:
            boolean r2 = r2.isSatisfied()     // Catch: java.lang.Throwable -> L18
            if (r2 != 0) goto L17
            r0.unlock()
        L17:
            return r2
        L18:
            r2 = move-exception
            r0.unlock()
            throw r2
        L1d:
            java.lang.IllegalMonitorStateException r2 = new java.lang.IllegalMonitorStateException
            r2.<init>()
            throw r2
    }

    public void enterInterruptibly() throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r1.lock
            r0.lockInterruptibly()
            return
    }

    public boolean enterInterruptibly(long r2, java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r1.lock
            boolean r2 = r0.tryLock(r2, r4)
            return r2
    }

    public void enterWhen(com.google.common.util.concurrent.Monitor.Guard r3) throws java.lang.InterruptedException {
            r2 = this;
            com.google.common.util.concurrent.Monitor r0 = r3.monitor
            if (r0 != r2) goto L1c
            java.util.concurrent.locks.ReentrantLock r0 = r2.lock
            boolean r1 = r0.isHeldByCurrentThread()
            r0.lockInterruptibly()
            boolean r0 = r3.isSatisfied()     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L16
            r2.await(r3, r1)     // Catch: java.lang.Throwable -> L17
        L16:
            return
        L17:
            r3 = move-exception
            r2.leave()
            throw r3
        L1c:
            java.lang.IllegalMonitorStateException r3 = new java.lang.IllegalMonitorStateException
            r3.<init>()
            throw r3
    }

    public boolean enterWhen(com.google.common.util.concurrent.Monitor.Guard r11, long r12, java.util.concurrent.TimeUnit r14) throws java.lang.InterruptedException {
            r10 = this;
            long r0 = toSafeNanos(r12, r14)
            com.google.common.util.concurrent.Monitor r2 = r11.monitor
            if (r2 != r10) goto L60
            java.util.concurrent.locks.ReentrantLock r2 = r10.lock
            boolean r3 = r2.isHeldByCurrentThread()
            boolean r4 = r10.fair
            r5 = 0
            r6 = 0
            if (r4 != 0) goto L29
            boolean r4 = java.lang.Thread.interrupted()
            if (r4 != 0) goto L23
            boolean r4 = r2.tryLock()
            if (r4 == 0) goto L29
            r8 = r6
            goto L34
        L23:
            java.lang.InterruptedException r11 = new java.lang.InterruptedException
            r11.<init>()
            throw r11
        L29:
            long r8 = initNanoTime(r0)
            boolean r12 = r2.tryLock(r12, r14)
            if (r12 != 0) goto L34
            return r5
        L34:
            boolean r12 = r11.isSatisfied()     // Catch: java.lang.Throwable -> L50
            if (r12 != 0) goto L49
            int r12 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r12 != 0) goto L3f
            goto L43
        L3f:
            long r0 = remainingNanos(r8, r0)     // Catch: java.lang.Throwable -> L50
        L43:
            boolean r11 = r10.awaitNanos(r11, r0, r3)     // Catch: java.lang.Throwable -> L50
            if (r11 == 0) goto L4a
        L49:
            r5 = 1
        L4a:
            if (r5 != 0) goto L4f
            r2.unlock()
        L4f:
            return r5
        L50:
            r11 = move-exception
            if (r3 != 0) goto L5c
            r10.signalNextWaiter()     // Catch: java.lang.Throwable -> L57
            goto L5c
        L57:
            r11 = move-exception
            r2.unlock()
            throw r11
        L5c:
            r2.unlock()
            throw r11
        L60:
            java.lang.IllegalMonitorStateException r11 = new java.lang.IllegalMonitorStateException
            r11.<init>()
            throw r11
    }

    public void enterWhenUninterruptibly(com.google.common.util.concurrent.Monitor.Guard r3) {
            r2 = this;
            com.google.common.util.concurrent.Monitor r0 = r3.monitor
            if (r0 != r2) goto L1c
            java.util.concurrent.locks.ReentrantLock r0 = r2.lock
            boolean r1 = r0.isHeldByCurrentThread()
            r0.lock()
            boolean r0 = r3.isSatisfied()     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L16
            r2.awaitUninterruptibly(r3, r1)     // Catch: java.lang.Throwable -> L17
        L16:
            return
        L17:
            r3 = move-exception
            r2.leave()
            throw r3
        L1c:
            java.lang.IllegalMonitorStateException r3 = new java.lang.IllegalMonitorStateException
            r3.<init>()
            throw r3
    }

    public boolean enterWhenUninterruptibly(com.google.common.util.concurrent.Monitor.Guard r12, long r13, java.util.concurrent.TimeUnit r15) {
            r11 = this;
            long r13 = toSafeNanos(r13, r15)
            com.google.common.util.concurrent.Monitor r15 = r12.monitor
            if (r15 != r11) goto L7e
            java.util.concurrent.locks.ReentrantLock r15 = r11.lock
            boolean r0 = r15.isHeldByCurrentThread()
            boolean r1 = java.lang.Thread.interrupted()
            r2 = 1
            boolean r3 = r11.fair     // Catch: java.lang.Throwable -> L73
            r4 = 0
            r5 = 0
            if (r3 != 0) goto L23
            boolean r3 = r15.tryLock()     // Catch: java.lang.Throwable -> L73
            if (r3 != 0) goto L21
            goto L23
        L21:
            r7 = r5
            goto L30
        L23:
            long r7 = initNanoTime(r13)     // Catch: java.lang.Throwable -> L73
            r9 = r13
        L28:
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.InterruptedException -> L6a java.lang.Throwable -> L73
            boolean r3 = r15.tryLock(r9, r3)     // Catch: java.lang.InterruptedException -> L6a java.lang.Throwable -> L73
            if (r3 == 0) goto L60
        L30:
            boolean r3 = r12.isSatisfied()     // Catch: java.lang.Throwable -> L58 java.lang.InterruptedException -> L5d
            if (r3 == 0) goto L37
            goto L49
        L37:
            int r3 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r3 != 0) goto L41
            long r7 = initNanoTime(r13)     // Catch: java.lang.Throwable -> L58 java.lang.InterruptedException -> L5d
            r9 = r13
            goto L45
        L41:
            long r9 = remainingNanos(r7, r13)     // Catch: java.lang.Throwable -> L58 java.lang.InterruptedException -> L5d
        L45:
            boolean r2 = r11.awaitNanos(r12, r9, r0)     // Catch: java.lang.Throwable -> L58 java.lang.InterruptedException -> L5d
        L49:
            if (r2 != 0) goto L4e
            r15.unlock()     // Catch: java.lang.Throwable -> L73
        L4e:
            if (r1 == 0) goto L57
            java.lang.Thread r12 = java.lang.Thread.currentThread()
            r12.interrupt()
        L57:
            return r2
        L58:
            r12 = move-exception
            r15.unlock()     // Catch: java.lang.Throwable -> L73
            throw r12     // Catch: java.lang.Throwable -> L73
        L5d:
            r0 = 0
            r1 = 1
            goto L30
        L60:
            if (r1 == 0) goto L69
            java.lang.Thread r12 = java.lang.Thread.currentThread()
            r12.interrupt()
        L69:
            return r4
        L6a:
            long r9 = remainingNanos(r7, r13)     // Catch: java.lang.Throwable -> L70
            r1 = 1
            goto L28
        L70:
            r12 = move-exception
            r1 = 1
            goto L74
        L73:
            r12 = move-exception
        L74:
            if (r1 == 0) goto L7d
            java.lang.Thread r13 = java.lang.Thread.currentThread()
            r13.interrupt()
        L7d:
            throw r12
        L7e:
            java.lang.IllegalMonitorStateException r12 = new java.lang.IllegalMonitorStateException
            r12.<init>()
            throw r12
    }

    public int getOccupiedDepth() {
            r1 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r1.lock
            int r0 = r0.getHoldCount()
            return r0
    }

    public int getQueueLength() {
            r1 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r1.lock
            int r0 = r0.getQueueLength()
            return r0
    }

    public int getWaitQueueLength(com.google.common.util.concurrent.Monitor.Guard r2) {
            r1 = this;
            com.google.common.util.concurrent.Monitor r0 = r2.monitor
            if (r0 != r1) goto L18
            java.util.concurrent.locks.ReentrantLock r0 = r1.lock
            r0.lock()
            int r2 = r2.waiterCount     // Catch: java.lang.Throwable -> L11
            java.util.concurrent.locks.ReentrantLock r0 = r1.lock
            r0.unlock()
            return r2
        L11:
            r2 = move-exception
            java.util.concurrent.locks.ReentrantLock r0 = r1.lock
            r0.unlock()
            throw r2
        L18:
            java.lang.IllegalMonitorStateException r2 = new java.lang.IllegalMonitorStateException
            r2.<init>()
            throw r2
    }

    public boolean hasQueuedThread(java.lang.Thread r2) {
            r1 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r1.lock
            boolean r2 = r0.hasQueuedThread(r2)
            return r2
    }

    public boolean hasQueuedThreads() {
            r1 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r1.lock
            boolean r0 = r0.hasQueuedThreads()
            return r0
    }

    public boolean hasWaiters(com.google.common.util.concurrent.Monitor.Guard r1) {
            r0 = this;
            int r1 = r0.getWaitQueueLength(r1)
            if (r1 <= 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    public boolean isFair() {
            r1 = this;
            boolean r0 = r1.fair
            return r0
    }

    public boolean isOccupied() {
            r1 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r1.lock
            boolean r0 = r0.isLocked()
            return r0
    }

    public boolean isOccupiedByCurrentThread() {
            r1 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r1.lock
            boolean r0 = r0.isHeldByCurrentThread()
            return r0
    }

    public void leave() {
            r3 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r3.lock
            int r1 = r0.getHoldCount()     // Catch: java.lang.Throwable -> L10
            r2 = 1
            if (r1 != r2) goto Lc
            r3.signalNextWaiter()     // Catch: java.lang.Throwable -> L10
        Lc:
            r0.unlock()
            return
        L10:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    public boolean tryEnter() {
            r1 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r1.lock
            boolean r0 = r0.tryLock()
            return r0
    }

    public boolean tryEnterIf(com.google.common.util.concurrent.Monitor.Guard r3) {
            r2 = this;
            com.google.common.util.concurrent.Monitor r0 = r3.monitor
            if (r0 != r2) goto L1d
            java.util.concurrent.locks.ReentrantLock r0 = r2.lock
            boolean r1 = r0.tryLock()
            if (r1 != 0) goto Le
            r3 = 0
            return r3
        Le:
            boolean r3 = r3.isSatisfied()     // Catch: java.lang.Throwable -> L18
            if (r3 != 0) goto L17
            r0.unlock()
        L17:
            return r3
        L18:
            r3 = move-exception
            r0.unlock()
            throw r3
        L1d:
            java.lang.IllegalMonitorStateException r3 = new java.lang.IllegalMonitorStateException
            r3.<init>()
            throw r3
    }

    public void waitFor(com.google.common.util.concurrent.Monitor.Guard r4) throws java.lang.InterruptedException {
            r3 = this;
            com.google.common.util.concurrent.Monitor r0 = r4.monitor
            r1 = 1
            if (r0 != r3) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            java.util.concurrent.locks.ReentrantLock r2 = r3.lock
            boolean r2 = r2.isHeldByCurrentThread()
            r0 = r0 & r2
            if (r0 == 0) goto L1b
            boolean r0 = r4.isSatisfied()
            if (r0 != 0) goto L1a
            r3.await(r4, r1)
        L1a:
            return
        L1b:
            java.lang.IllegalMonitorStateException r4 = new java.lang.IllegalMonitorStateException
            r4.<init>()
            throw r4
    }

    public boolean waitFor(com.google.common.util.concurrent.Monitor.Guard r3, long r4, java.util.concurrent.TimeUnit r6) throws java.lang.InterruptedException {
            r2 = this;
            long r4 = toSafeNanos(r4, r6)
            com.google.common.util.concurrent.Monitor r6 = r3.monitor
            r0 = 1
            if (r6 != r2) goto Lb
            r6 = 1
            goto Lc
        Lb:
            r6 = 0
        Lc:
            java.util.concurrent.locks.ReentrantLock r1 = r2.lock
            boolean r1 = r1.isHeldByCurrentThread()
            r6 = r6 & r1
            if (r6 == 0) goto L2d
            boolean r6 = r3.isSatisfied()
            if (r6 == 0) goto L1c
            return r0
        L1c:
            boolean r6 = java.lang.Thread.interrupted()
            if (r6 != 0) goto L27
            boolean r3 = r2.awaitNanos(r3, r4, r0)
            return r3
        L27:
            java.lang.InterruptedException r3 = new java.lang.InterruptedException
            r3.<init>()
            throw r3
        L2d:
            java.lang.IllegalMonitorStateException r3 = new java.lang.IllegalMonitorStateException
            r3.<init>()
            throw r3
    }

    public void waitForUninterruptibly(com.google.common.util.concurrent.Monitor.Guard r4) {
            r3 = this;
            com.google.common.util.concurrent.Monitor r0 = r4.monitor
            r1 = 1
            if (r0 != r3) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            java.util.concurrent.locks.ReentrantLock r2 = r3.lock
            boolean r2 = r2.isHeldByCurrentThread()
            r0 = r0 & r2
            if (r0 == 0) goto L1b
            boolean r0 = r4.isSatisfied()
            if (r0 != 0) goto L1a
            r3.awaitUninterruptibly(r4, r1)
        L1a:
            return
        L1b:
            java.lang.IllegalMonitorStateException r4 = new java.lang.IllegalMonitorStateException
            r4.<init>()
            throw r4
    }

    public boolean waitForUninterruptibly(com.google.common.util.concurrent.Monitor.Guard r8, long r9, java.util.concurrent.TimeUnit r11) {
            r7 = this;
            long r9 = toSafeNanos(r9, r11)
            com.google.common.util.concurrent.Monitor r11 = r8.monitor
            r0 = 0
            r1 = 1
            if (r11 != r7) goto Lc
            r11 = 1
            goto Ld
        Lc:
            r11 = 0
        Ld:
            java.util.concurrent.locks.ReentrantLock r2 = r7.lock
            boolean r2 = r2.isHeldByCurrentThread()
            r11 = r11 & r2
            if (r11 == 0) goto L58
            boolean r11 = r8.isSatisfied()
            if (r11 == 0) goto L1d
            return r1
        L1d:
            long r2 = initNanoTime(r9)
            boolean r11 = java.lang.Thread.interrupted()
            r4 = r9
            r6 = 1
        L27:
            boolean r8 = r7.awaitNanos(r8, r4, r6)     // Catch: java.lang.Throwable -> L35 java.lang.InterruptedException -> L38
            if (r11 == 0) goto L34
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            r9.interrupt()
        L34:
            return r8
        L35:
            r8 = move-exception
            r1 = r11
            goto L4e
        L38:
            boolean r11 = r8.isSatisfied()     // Catch: java.lang.Throwable -> L4d
            if (r11 == 0) goto L46
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            r8.interrupt()
            return r1
        L46:
            long r4 = remainingNanos(r2, r9)     // Catch: java.lang.Throwable -> L4d
            r11 = 1
            r6 = 0
            goto L27
        L4d:
            r8 = move-exception
        L4e:
            if (r1 == 0) goto L57
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            r9.interrupt()
        L57:
            throw r8
        L58:
            java.lang.IllegalMonitorStateException r8 = new java.lang.IllegalMonitorStateException
            r8.<init>()
            throw r8
    }
}
