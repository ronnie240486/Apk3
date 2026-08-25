package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtCompatible(emulated = true)
@com.google.j2objc.annotations.ReflectionSupport(com.google.j2objc.annotations.ReflectionSupport.Level.FULL)
abstract class InterruptibleTask<T> extends java.util.concurrent.atomic.AtomicReference<java.lang.Runnable> implements java.lang.Runnable {
    private static final java.lang.Runnable DONE = null;
    private static final int MAX_BUSY_WAIT_SPINS = 1000;
    private static final java.lang.Runnable PARKED = null;

    /* JADX INFO: renamed from: com.google.common.util.concurrent.InterruptibleTask$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    @com.google.common.annotations.VisibleForTesting
    public static final class Blocker extends java.util.concurrent.locks.AbstractOwnableSynchronizer implements java.lang.Runnable {
        private final com.google.common.util.concurrent.InterruptibleTask<?> task;

        private Blocker(com.google.common.util.concurrent.InterruptibleTask<?> r1) {
                r0 = this;
                r0.<init>()
                r0.task = r1
                return
        }

        public /* synthetic */ Blocker(com.google.common.util.concurrent.InterruptibleTask r1, com.google.common.util.concurrent.InterruptibleTask.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public static /* synthetic */ void access$200(com.google.common.util.concurrent.InterruptibleTask.Blocker r0, java.lang.Thread r1) {
                r0.setOwner(r1)
                return
        }

        private void setOwner(java.lang.Thread r1) {
                r0 = this;
                r0.setExclusiveOwnerThread(r1)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r0 = this;
                return
        }

        public java.lang.String toString() {
                r1 = this;
                com.google.common.util.concurrent.InterruptibleTask<?> r0 = r1.task
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class DoNothingRunnable implements java.lang.Runnable {
        private DoNothingRunnable() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ DoNothingRunnable(com.google.common.util.concurrent.InterruptibleTask.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r0 = this;
                return
        }
    }

    static {
            java.lang.Class<java.util.concurrent.locks.LockSupport> r0 = java.util.concurrent.locks.LockSupport.class
            com.google.common.util.concurrent.InterruptibleTask$DoNothingRunnable r0 = new com.google.common.util.concurrent.InterruptibleTask$DoNothingRunnable
            r1 = 0
            r0.<init>(r1)
            com.google.common.util.concurrent.InterruptibleTask.DONE = r0
            com.google.common.util.concurrent.InterruptibleTask$DoNothingRunnable r0 = new com.google.common.util.concurrent.InterruptibleTask$DoNothingRunnable
            r0.<init>(r1)
            com.google.common.util.concurrent.InterruptibleTask.PARKED = r0
            return
    }

    public InterruptibleTask() {
            r0 = this;
            r0.<init>()
            return
    }

    private void waitForInterrupt(java.lang.Thread r8) {
            r7 = this;
            java.lang.Object r0 = r7.get()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
        La:
            boolean r5 = r0 instanceof com.google.common.util.concurrent.InterruptibleTask.Blocker
            if (r5 != 0) goto L19
            java.lang.Runnable r6 = com.google.common.util.concurrent.InterruptibleTask.PARKED
            if (r0 != r6) goto L13
            goto L19
        L13:
            if (r3 == 0) goto L18
            r8.interrupt()
        L18:
            return
        L19:
            if (r5 == 0) goto L1e
            r2 = r0
            com.google.common.util.concurrent.InterruptibleTask$Blocker r2 = (com.google.common.util.concurrent.InterruptibleTask.Blocker) r2
        L1e:
            r5 = 1
            int r4 = r4 + r5
            r6 = 1000(0x3e8, float:1.401E-42)
            if (r4 <= r6) goto L3e
            java.lang.Runnable r6 = com.google.common.util.concurrent.InterruptibleTask.PARKED
            if (r0 == r6) goto L2e
            boolean r0 = r7.compareAndSet(r0, r6)
            if (r0 == 0) goto L41
        L2e:
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L39
            if (r3 == 0) goto L37
            goto L39
        L37:
            r3 = 0
            goto L3a
        L39:
            r3 = 1
        L3a:
            java.util.concurrent.locks.LockSupport.park(r2)
            goto L41
        L3e:
            java.lang.Thread.yield()
        L41:
            java.lang.Object r0 = r7.get()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            goto La
    }

    public abstract void afterRanInterruptiblyFailure(java.lang.Throwable r1);

    public abstract void afterRanInterruptiblySuccess(@com.google.common.util.concurrent.ParametricNullness T r1);

    public final void interruptTask() {
            r4 = this;
            java.lang.Object r0 = r4.get()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            boolean r1 = r0 instanceof java.lang.Thread
            if (r1 == 0) goto L48
            com.google.common.util.concurrent.InterruptibleTask$Blocker r1 = new com.google.common.util.concurrent.InterruptibleTask$Blocker
            r2 = 0
            r1.<init>(r4, r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            com.google.common.util.concurrent.InterruptibleTask.Blocker.access$200(r1, r2)
            boolean r1 = r4.compareAndSet(r0, r1)
            if (r1 == 0) goto L48
            r1 = r0
            java.lang.Thread r1 = (java.lang.Thread) r1     // Catch: java.lang.Throwable -> L35
            r1.interrupt()     // Catch: java.lang.Throwable -> L35
            java.lang.Runnable r1 = com.google.common.util.concurrent.InterruptibleTask.DONE
            java.lang.Object r1 = r4.getAndSet(r1)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            java.lang.Runnable r2 = com.google.common.util.concurrent.InterruptibleTask.PARKED
            if (r1 != r2) goto L48
            java.lang.Thread r0 = (java.lang.Thread) r0
            java.util.concurrent.locks.LockSupport.unpark(r0)
            goto L48
        L35:
            r1 = move-exception
            java.lang.Runnable r2 = com.google.common.util.concurrent.InterruptibleTask.DONE
            java.lang.Object r2 = r4.getAndSet(r2)
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            java.lang.Runnable r3 = com.google.common.util.concurrent.InterruptibleTask.PARKED
            if (r2 != r3) goto L47
            java.lang.Thread r0 = (java.lang.Thread) r0
            java.util.concurrent.locks.LockSupport.unpark(r0)
        L47:
            throw r1
        L48:
            return
    }

    public abstract boolean isDone();

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r1 = 0
            boolean r2 = r4.compareAndSet(r1, r0)
            if (r2 != 0) goto Lc
            return
        Lc:
            boolean r2 = r4.isDone()
            r2 = r2 ^ 1
            if (r2 == 0) goto L2b
            java.lang.Object r1 = r4.runInterruptibly()     // Catch: java.lang.Throwable -> L19
            goto L2b
        L19:
            r1 = move-exception
            java.lang.Runnable r3 = com.google.common.util.concurrent.InterruptibleTask.DONE
            boolean r3 = r4.compareAndSet(r0, r3)
            if (r3 != 0) goto L25
            r4.waitForInterrupt(r0)
        L25:
            if (r2 == 0) goto L3b
            r4.afterRanInterruptiblyFailure(r1)
            goto L3b
        L2b:
            java.lang.Runnable r3 = com.google.common.util.concurrent.InterruptibleTask.DONE
            boolean r3 = r4.compareAndSet(r0, r3)
            if (r3 != 0) goto L36
            r4.waitForInterrupt(r0)
        L36:
            if (r2 == 0) goto L3b
            r4.afterRanInterruptiblySuccess(r1)
        L3b:
            return
    }

    @com.google.common.util.concurrent.ParametricNullness
    public abstract T runInterruptibly() throws java.lang.Exception;

    public abstract java.lang.String toPendingString();

    @Override // java.util.concurrent.atomic.AtomicReference
    public final java.lang.String toString() {
            r4 = this;
            java.lang.Object r0 = r4.get()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            java.lang.Runnable r1 = com.google.common.util.concurrent.InterruptibleTask.DONE
            if (r0 != r1) goto Le
            java.lang.String r0 = "running=[DONE]"
            goto L33
        Le:
            boolean r1 = r0 instanceof com.google.common.util.concurrent.InterruptibleTask.Blocker
            if (r1 == 0) goto L16
            java.lang.String r0 = "running=[INTERRUPTED]"
            goto L33
        L16:
            boolean r1 = r0 instanceof java.lang.Thread
            if (r1 == 0) goto L30
            java.lang.Thread r0 = (java.lang.Thread) r0
            java.lang.String r0 = r0.getName()
            r1 = 21
            int r1 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r1)
            java.lang.String r2 = "running=[RUNNING ON "
            java.lang.String r3 = "]"
            java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r0, r3)
            goto L33
        L30:
            java.lang.String r0 = "running=[NOT STARTED YET]"
        L33:
            java.lang.String r1 = r4.toPendingString()
            r2 = 2
            int r2 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r2)
            int r2 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2)
            java.lang.String r3 = ", "
            java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r2, r0, r3, r1)
            return r0
    }
}
