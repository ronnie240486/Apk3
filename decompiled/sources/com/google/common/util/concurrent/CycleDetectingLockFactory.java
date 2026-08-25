package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.annotations.Beta
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
@com.google.errorprone.annotations.CanIgnoreReturnValue
public class CycleDetectingLockFactory {
    private static final java.lang.ThreadLocal<java.util.ArrayList<com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode>> acquiredLocks = null;
    private static final java.util.concurrent.ConcurrentMap<java.lang.Class<? extends java.lang.Enum<?>>, java.util.Map<? extends java.lang.Enum<?>, com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode>> lockGraphNodesPerType = null;
    private static final java.util.logging.Logger logger = null;
    public final com.google.common.util.concurrent.CycleDetectingLockFactory.Policy policy;


    /* JADX INFO: loaded from: classes.dex */
    public interface CycleDetectingLock {
        com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode getLockGraphNode();

        boolean isAcquiredByCurrentThread();
    }

    public final class CycleDetectingReentrantLock extends java.util.concurrent.locks.ReentrantLock implements com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingLock {
        private final com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode lockGraphNode;
        public final /* synthetic */ com.google.common.util.concurrent.CycleDetectingLockFactory this$0;

        private CycleDetectingReentrantLock(com.google.common.util.concurrent.CycleDetectingLockFactory r1, com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode r2, boolean r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r3)
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                com.google.common.util.concurrent.CycleDetectingLockFactory$LockGraphNode r1 = (com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode) r1
                r0.lockGraphNode = r1
                return
        }

        public /* synthetic */ CycleDetectingReentrantLock(com.google.common.util.concurrent.CycleDetectingLockFactory r1, com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode r2, boolean r3, com.google.common.util.concurrent.CycleDetectingLockFactory.AnonymousClass1 r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingLock
        public com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode getLockGraphNode() {
                r1 = this;
                com.google.common.util.concurrent.CycleDetectingLockFactory$LockGraphNode r0 = r1.lockGraphNode
                return r0
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingLock
        public boolean isAcquiredByCurrentThread() {
                r1 = this;
                boolean r0 = r1.isHeldByCurrentThread()
                return r0
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void lock() {
                r1 = this;
                com.google.common.util.concurrent.CycleDetectingLockFactory r0 = r1.this$0
                com.google.common.util.concurrent.CycleDetectingLockFactory.access$600(r0, r1)
                super.lock()     // Catch: java.lang.Throwable -> Lc
                com.google.common.util.concurrent.CycleDetectingLockFactory.access$700(r1)
                return
            Lc:
                r0 = move-exception
                com.google.common.util.concurrent.CycleDetectingLockFactory.access$700(r1)
                throw r0
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws java.lang.InterruptedException {
                r1 = this;
                com.google.common.util.concurrent.CycleDetectingLockFactory r0 = r1.this$0
                com.google.common.util.concurrent.CycleDetectingLockFactory.access$600(r0, r1)
                super.lockInterruptibly()     // Catch: java.lang.Throwable -> Lc
                com.google.common.util.concurrent.CycleDetectingLockFactory.access$700(r1)
                return
            Lc:
                r0 = move-exception
                com.google.common.util.concurrent.CycleDetectingLockFactory.access$700(r1)
                throw r0
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
                r1 = this;
                com.google.common.util.concurrent.CycleDetectingLockFactory r0 = r1.this$0
                com.google.common.util.concurrent.CycleDetectingLockFactory.access$600(r0, r1)
                boolean r0 = super.tryLock()     // Catch: java.lang.Throwable -> Ld
                com.google.common.util.concurrent.CycleDetectingLockFactory.access$700(r1)
                return r0
            Ld:
                r0 = move-exception
                com.google.common.util.concurrent.CycleDetectingLockFactory.access$700(r1)
                throw r0
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long r2, java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException {
                r1 = this;
                com.google.common.util.concurrent.CycleDetectingLockFactory r0 = r1.this$0
                com.google.common.util.concurrent.CycleDetectingLockFactory.access$600(r0, r1)
                boolean r2 = super.tryLock(r2, r4)     // Catch: java.lang.Throwable -> Ld
                com.google.common.util.concurrent.CycleDetectingLockFactory.access$700(r1)
                return r2
            Ld:
                r2 = move-exception
                com.google.common.util.concurrent.CycleDetectingLockFactory.access$700(r1)
                throw r2
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void unlock() {
                r1 = this;
                super.unlock()     // Catch: java.lang.Throwable -> L7
                com.google.common.util.concurrent.CycleDetectingLockFactory.access$700(r1)
                return
            L7:
                r0 = move-exception
                com.google.common.util.concurrent.CycleDetectingLockFactory.access$700(r1)
                throw r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CycleDetectingReentrantReadLock extends java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock {

        @com.google.j2objc.annotations.Weak
        public final com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingReentrantReadWriteLock readWriteLock;
        public final /* synthetic */ com.google.common.util.concurrent.CycleDetectingLockFactory this$0;

        public CycleDetectingReentrantReadLock(com.google.common.util.concurrent.CycleDetectingLockFactory r1, com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingReentrantReadWriteLock r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                r0.readWriteLock = r2
                return
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void lock() {
                r2 = this;
                com.google.common.util.concurrent.CycleDetectingLockFactory r0 = r2.this$0
                com.google.common.util.concurrent.CycleDetectingLockFactory$CycleDetectingReentrantReadWriteLock r1 = r2.readWriteLock
                com.google.common.util.concurrent.CycleDetectingLockFactory.access$600(r0, r1)
                super.lock()     // Catch: java.lang.Throwable -> L10
                com.google.common.util.concurrent.CycleDetectingLockFactory$CycleDetectingReentrantReadWriteLock r0 = r2.readWriteLock
                com.google.common.util.concurrent.CycleDetectingLockFactory.access$700(r0)
                return
            L10:
                r0 = move-exception
                com.google.common.util.concurrent.CycleDetectingLockFactory$CycleDetectingReentrantReadWriteLock r1 = r2.readWriteLock
                com.google.common.util.concurrent.CycleDetectingLockFactory.access$700(r1)
                throw r0
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws java.lang.InterruptedException {
                r2 = this;
                com.google.common.util.concurrent.CycleDetectingLockFactory r0 = r2.this$0
                com.google.common.util.concurrent.CycleDetectingLockFactory$CycleDetectingReentrantReadWriteLock r1 = r2.readWriteLock
                com.google.common.util.concurrent.CycleDetectingLockFactory.access$600(r0, r1)
                super.lockInterruptibly()     // Catch: java.lang.Throwable -> L10
                com.google.common.util.concurrent.CycleDetectingLockFactory$CycleDetectingReentrantReadWriteLock r0 = r2.readWriteLock
                com.google.common.util.concurrent.CycleDetectingLockFactory.access$700(r0)
                return
            L10:
                r0 = move-exception
                com.google.common.util.concurrent.CycleDetectingLockFactory$CycleDetectingReentrantReadWriteLock r1 = r2.readWriteLock
                com.google.common.util.concurrent.CycleDetectingLockFactory.access$700(r1)
                throw r0
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
                r2 = this;
                com.google.common.util.concurrent.CycleDetectingLockFactory r0 = r2.this$0
                com.google.common.util.concurrent.CycleDetectingLockFactory$CycleDetectingReentrantReadWriteLock r1 = r2.readWriteLock
                com.google.common.util.concurrent.CycleDetectingLockFactory.access$600(r0, r1)
                boolean r0 = super.tryLock()     // Catch: java.lang.Throwable -> L11
                com.google.common.util.concurrent.CycleDetectingLockFactory$CycleDetectingReentrantReadWriteLock r1 = r2.readWriteLock
                com.google.common.util.concurrent.CycleDetectingLockFactory.access$700(r1)
                return r0
            L11:
                r0 = move-exception
                com.google.common.util.concurrent.CycleDetectingLockFactory$CycleDetectingReentrantReadWriteLock r1 = r2.readWriteLock
                com.google.common.util.concurrent.CycleDetectingLockFactory.access$700(r1)
                throw r0
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long r3, java.util.concurrent.TimeUnit r5) throws java.lang.InterruptedException {
                r2 = this;
                com.google.common.util.concurrent.CycleDetectingLockFactory r0 = r2.this$0
                com.google.common.util.concurrent.CycleDetectingLockFactory$CycleDetectingReentrantReadWriteLock r1 = r2.readWriteLock
                com.google.common.util.concurrent.CycleDetectingLockFactory.access$600(r0, r1)
                boolean r3 = super.tryLock(r3, r5)     // Catch: java.lang.Throwable -> L11
                com.google.common.util.concurrent.CycleDetectingLockFactory$CycleDetectingReentrantReadWriteLock r4 = r2.readWriteLock
                com.google.common.util.concurrent.CycleDetectingLockFactory.access$700(r4)
                return r3
            L11:
                r3 = move-exception
                com.google.common.util.concurrent.CycleDetectingLockFactory$CycleDetectingReentrantReadWriteLock r4 = r2.readWriteLock
                com.google.common.util.concurrent.CycleDetectingLockFactory.access$700(r4)
                throw r3
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void unlock() {
                r2 = this;
                super.unlock()     // Catch: java.lang.Throwable -> L9
                com.google.common.util.concurrent.CycleDetectingLockFactory$CycleDetectingReentrantReadWriteLock r0 = r2.readWriteLock
                com.google.common.util.concurrent.CycleDetectingLockFactory.access$700(r0)
                return
            L9:
                r0 = move-exception
                com.google.common.util.concurrent.CycleDetectingLockFactory$CycleDetectingReentrantReadWriteLock r1 = r2.readWriteLock
                com.google.common.util.concurrent.CycleDetectingLockFactory.access$700(r1)
                throw r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public final class CycleDetectingReentrantReadWriteLock extends java.util.concurrent.locks.ReentrantReadWriteLock implements com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingLock {
        private final com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode lockGraphNode;
        private final com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingReentrantReadLock readLock;
        private final com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingReentrantWriteLock writeLock;

        private CycleDetectingReentrantReadWriteLock(com.google.common.util.concurrent.CycleDetectingLockFactory r1, com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode r2, boolean r3) {
                r0 = this;
                r0.<init>(r3)
                com.google.common.util.concurrent.CycleDetectingLockFactory$CycleDetectingReentrantReadLock r3 = new com.google.common.util.concurrent.CycleDetectingLockFactory$CycleDetectingReentrantReadLock
                r3.<init>(r1, r0)
                r0.readLock = r3
                com.google.common.util.concurrent.CycleDetectingLockFactory$CycleDetectingReentrantWriteLock r3 = new com.google.common.util.concurrent.CycleDetectingLockFactory$CycleDetectingReentrantWriteLock
                r3.<init>(r1, r0)
                r0.writeLock = r3
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                com.google.common.util.concurrent.CycleDetectingLockFactory$LockGraphNode r1 = (com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode) r1
                r0.lockGraphNode = r1
                return
        }

        public /* synthetic */ CycleDetectingReentrantReadWriteLock(com.google.common.util.concurrent.CycleDetectingLockFactory r1, com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode r2, boolean r3, com.google.common.util.concurrent.CycleDetectingLockFactory.AnonymousClass1 r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingLock
        public com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode getLockGraphNode() {
                r1 = this;
                com.google.common.util.concurrent.CycleDetectingLockFactory$LockGraphNode r0 = r1.lockGraphNode
                return r0
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingLock
        public boolean isAcquiredByCurrentThread() {
                r1 = this;
                boolean r0 = r1.isWriteLockedByCurrentThread()
                if (r0 != 0) goto Lf
                int r0 = r1.getReadHoldCount()
                if (r0 <= 0) goto Ld
                goto Lf
            Ld:
                r0 = 0
                goto L10
            Lf:
                r0 = 1
            L10:
                return r0
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public /* bridge */ /* synthetic */ java.util.concurrent.locks.Lock readLock() {
                r1 = this;
                java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r1.readLock()
                return r0
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock() {
                r1 = this;
                com.google.common.util.concurrent.CycleDetectingLockFactory$CycleDetectingReentrantReadLock r0 = r1.readLock
                return r0
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public /* bridge */ /* synthetic */ java.util.concurrent.locks.Lock writeLock() {
                r1 = this;
                java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r1.writeLock()
                return r0
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock() {
                r1 = this;
                com.google.common.util.concurrent.CycleDetectingLockFactory$CycleDetectingReentrantWriteLock r0 = r1.writeLock
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public class CycleDetectingReentrantWriteLock extends java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock {

        @com.google.j2objc.annotations.Weak
        public final com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingReentrantReadWriteLock readWriteLock;
        public final /* synthetic */ com.google.common.util.concurrent.CycleDetectingLockFactory this$0;

        public CycleDetectingReentrantWriteLock(com.google.common.util.concurrent.CycleDetectingLockFactory r1, com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingReentrantReadWriteLock r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                r0.readWriteLock = r2
                return
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void lock() {
                r2 = this;
                com.google.common.util.concurrent.CycleDetectingLockFactory r0 = r2.this$0
                com.google.common.util.concurrent.CycleDetectingLockFactory$CycleDetectingReentrantReadWriteLock r1 = r2.readWriteLock
                com.google.common.util.concurrent.CycleDetectingLockFactory.access$600(r0, r1)
                super.lock()     // Catch: java.lang.Throwable -> L10
                com.google.common.util.concurrent.CycleDetectingLockFactory$CycleDetectingReentrantReadWriteLock r0 = r2.readWriteLock
                com.google.common.util.concurrent.CycleDetectingLockFactory.access$700(r0)
                return
            L10:
                r0 = move-exception
                com.google.common.util.concurrent.CycleDetectingLockFactory$CycleDetectingReentrantReadWriteLock r1 = r2.readWriteLock
                com.google.common.util.concurrent.CycleDetectingLockFactory.access$700(r1)
                throw r0
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws java.lang.InterruptedException {
                r2 = this;
                com.google.common.util.concurrent.CycleDetectingLockFactory r0 = r2.this$0
                com.google.common.util.concurrent.CycleDetectingLockFactory$CycleDetectingReentrantReadWriteLock r1 = r2.readWriteLock
                com.google.common.util.concurrent.CycleDetectingLockFactory.access$600(r0, r1)
                super.lockInterruptibly()     // Catch: java.lang.Throwable -> L10
                com.google.common.util.concurrent.CycleDetectingLockFactory$CycleDetectingReentrantReadWriteLock r0 = r2.readWriteLock
                com.google.common.util.concurrent.CycleDetectingLockFactory.access$700(r0)
                return
            L10:
                r0 = move-exception
                com.google.common.util.concurrent.CycleDetectingLockFactory$CycleDetectingReentrantReadWriteLock r1 = r2.readWriteLock
                com.google.common.util.concurrent.CycleDetectingLockFactory.access$700(r1)
                throw r0
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
                r2 = this;
                com.google.common.util.concurrent.CycleDetectingLockFactory r0 = r2.this$0
                com.google.common.util.concurrent.CycleDetectingLockFactory$CycleDetectingReentrantReadWriteLock r1 = r2.readWriteLock
                com.google.common.util.concurrent.CycleDetectingLockFactory.access$600(r0, r1)
                boolean r0 = super.tryLock()     // Catch: java.lang.Throwable -> L11
                com.google.common.util.concurrent.CycleDetectingLockFactory$CycleDetectingReentrantReadWriteLock r1 = r2.readWriteLock
                com.google.common.util.concurrent.CycleDetectingLockFactory.access$700(r1)
                return r0
            L11:
                r0 = move-exception
                com.google.common.util.concurrent.CycleDetectingLockFactory$CycleDetectingReentrantReadWriteLock r1 = r2.readWriteLock
                com.google.common.util.concurrent.CycleDetectingLockFactory.access$700(r1)
                throw r0
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long r3, java.util.concurrent.TimeUnit r5) throws java.lang.InterruptedException {
                r2 = this;
                com.google.common.util.concurrent.CycleDetectingLockFactory r0 = r2.this$0
                com.google.common.util.concurrent.CycleDetectingLockFactory$CycleDetectingReentrantReadWriteLock r1 = r2.readWriteLock
                com.google.common.util.concurrent.CycleDetectingLockFactory.access$600(r0, r1)
                boolean r3 = super.tryLock(r3, r5)     // Catch: java.lang.Throwable -> L11
                com.google.common.util.concurrent.CycleDetectingLockFactory$CycleDetectingReentrantReadWriteLock r4 = r2.readWriteLock
                com.google.common.util.concurrent.CycleDetectingLockFactory.access$700(r4)
                return r3
            L11:
                r3 = move-exception
                com.google.common.util.concurrent.CycleDetectingLockFactory$CycleDetectingReentrantReadWriteLock r4 = r2.readWriteLock
                com.google.common.util.concurrent.CycleDetectingLockFactory.access$700(r4)
                throw r3
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void unlock() {
                r2 = this;
                super.unlock()     // Catch: java.lang.Throwable -> L9
                com.google.common.util.concurrent.CycleDetectingLockFactory$CycleDetectingReentrantReadWriteLock r0 = r2.readWriteLock
                com.google.common.util.concurrent.CycleDetectingLockFactory.access$700(r0)
                return
            L9:
                r0 = move-exception
                com.google.common.util.concurrent.CycleDetectingLockFactory$CycleDetectingReentrantReadWriteLock r1 = r2.readWriteLock
                com.google.common.util.concurrent.CycleDetectingLockFactory.access$700(r1)
                throw r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class ExampleStackTrace extends java.lang.IllegalStateException {
        public static final java.lang.StackTraceElement[] EMPTY_STACK_TRACE = null;
        public static final com.google.common.collect.ImmutableSet<java.lang.String> EXCLUDED_CLASS_NAMES = null;

        static {
                r0 = 0
                java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r0]
                com.google.common.util.concurrent.CycleDetectingLockFactory.ExampleStackTrace.EMPTY_STACK_TRACE = r0
                java.lang.Class<com.google.common.util.concurrent.CycleDetectingLockFactory> r0 = com.google.common.util.concurrent.CycleDetectingLockFactory.class
                java.lang.String r0 = r0.getName()
                java.lang.Class<com.google.common.util.concurrent.CycleDetectingLockFactory$ExampleStackTrace> r1 = com.google.common.util.concurrent.CycleDetectingLockFactory.ExampleStackTrace.class
                java.lang.String r1 = r1.getName()
                java.lang.Class<com.google.common.util.concurrent.CycleDetectingLockFactory$LockGraphNode> r2 = com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode.class
                java.lang.String r2 = r2.getName()
                com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.of(r0, r1, r2)
                com.google.common.util.concurrent.CycleDetectingLockFactory.ExampleStackTrace.EXCLUDED_CLASS_NAMES = r0
                return
        }

        public ExampleStackTrace(com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode r4, com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode r5) {
                r3 = this;
                java.lang.String r4 = r4.lockName
                java.lang.String r5 = r5.lockName
                r0 = 4
                int r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r4, r0)
                int r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r5, r0)
                java.lang.String r1 = " -> "
                java.lang.String r4 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r4, r1, r5)
                r3.<init>(r4)
                java.lang.StackTraceElement[] r4 = r3.getStackTrace()
                r5 = 0
                int r0 = r4.length
            L1c:
                if (r5 >= r0) goto L51
                java.lang.Class<com.google.common.util.concurrent.CycleDetectingLockFactory$WithExplicitOrdering> r1 = com.google.common.util.concurrent.CycleDetectingLockFactory.WithExplicitOrdering.class
                java.lang.String r1 = r1.getName()
                r2 = r4[r5]
                java.lang.String r2 = r2.getClassName()
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L36
                java.lang.StackTraceElement[] r4 = com.google.common.util.concurrent.CycleDetectingLockFactory.ExampleStackTrace.EMPTY_STACK_TRACE
                r3.setStackTrace(r4)
                goto L51
            L36:
                com.google.common.collect.ImmutableSet<java.lang.String> r1 = com.google.common.util.concurrent.CycleDetectingLockFactory.ExampleStackTrace.EXCLUDED_CLASS_NAMES
                r2 = r4[r5]
                java.lang.String r2 = r2.getClassName()
                boolean r1 = r1.contains(r2)
                if (r1 != 0) goto L4e
                java.lang.Object[] r4 = java.util.Arrays.copyOfRange(r4, r5, r0)
                java.lang.StackTraceElement[] r4 = (java.lang.StackTraceElement[]) r4
                r3.setStackTrace(r4)
                goto L51
            L4e:
                int r5 = r5 + 1
                goto L1c
            L51:
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class LockGraphNode {
        public final java.util.Map<com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode, com.google.common.util.concurrent.CycleDetectingLockFactory.ExampleStackTrace> allowedPriorLocks;
        public final java.util.Map<com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode, com.google.common.util.concurrent.CycleDetectingLockFactory.PotentialDeadlockException> disallowedPriorLocks;
        public final java.lang.String lockName;

        public LockGraphNode(java.lang.String r2) {
                r1 = this;
                r1.<init>()
                com.google.common.collect.MapMaker r0 = new com.google.common.collect.MapMaker
                r0.<init>()
                com.google.common.collect.MapMaker r0 = r0.weakKeys()
                java.util.concurrent.ConcurrentMap r0 = r0.makeMap()
                r1.allowedPriorLocks = r0
                com.google.common.collect.MapMaker r0 = new com.google.common.collect.MapMaker
                r0.<init>()
                com.google.common.collect.MapMaker r0 = r0.weakKeys()
                java.util.concurrent.ConcurrentMap r0 = r0.makeMap()
                r1.disallowedPriorLocks = r0
                java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
                java.lang.String r2 = (java.lang.String) r2
                r1.lockName = r2
                return
        }

        @javax.annotation.CheckForNull
        private com.google.common.util.concurrent.CycleDetectingLockFactory.ExampleStackTrace findPathTo(com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode r6, java.util.Set<com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode> r7) {
                r5 = this;
                boolean r0 = r7.add(r5)
                r1 = 0
                if (r0 != 0) goto L8
                return r1
            L8:
                java.util.Map<com.google.common.util.concurrent.CycleDetectingLockFactory$LockGraphNode, com.google.common.util.concurrent.CycleDetectingLockFactory$ExampleStackTrace> r0 = r5.allowedPriorLocks
                java.lang.Object r0 = r0.get(r6)
                com.google.common.util.concurrent.CycleDetectingLockFactory$ExampleStackTrace r0 = (com.google.common.util.concurrent.CycleDetectingLockFactory.ExampleStackTrace) r0
                if (r0 == 0) goto L13
                return r0
            L13:
                java.util.Map<com.google.common.util.concurrent.CycleDetectingLockFactory$LockGraphNode, com.google.common.util.concurrent.CycleDetectingLockFactory$ExampleStackTrace> r0 = r5.allowedPriorLocks
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
            L1d:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L4b
                java.lang.Object r2 = r0.next()
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                java.lang.Object r3 = r2.getKey()
                com.google.common.util.concurrent.CycleDetectingLockFactory$LockGraphNode r3 = (com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode) r3
                com.google.common.util.concurrent.CycleDetectingLockFactory$ExampleStackTrace r4 = r3.findPathTo(r6, r7)
                if (r4 == 0) goto L1d
                com.google.common.util.concurrent.CycleDetectingLockFactory$ExampleStackTrace r6 = new com.google.common.util.concurrent.CycleDetectingLockFactory$ExampleStackTrace
                r6.<init>(r3, r5)
                java.lang.Object r7 = r2.getValue()
                com.google.common.util.concurrent.CycleDetectingLockFactory$ExampleStackTrace r7 = (com.google.common.util.concurrent.CycleDetectingLockFactory.ExampleStackTrace) r7
                java.lang.StackTraceElement[] r7 = r7.getStackTrace()
                r6.setStackTrace(r7)
                r6.initCause(r4)
                return r6
            L4b:
                return r1
        }

        public final void checkAcquiredLocks(com.google.common.util.concurrent.CycleDetectingLockFactory.Policy r5, java.util.List<com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode> r6) {
                r4 = this;
                java.util.Iterator r6 = r6.iterator()
            L4:
                boolean r0 = r6.hasNext()
                if (r0 == 0) goto L60
                java.lang.Object r0 = r6.next()
                com.google.common.util.concurrent.CycleDetectingLockFactory$LockGraphNode r0 = (com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode) r0
                if (r4 == r0) goto L14
                r1 = 1
                goto L15
            L14:
                r1 = 0
            L15:
                java.lang.String r2 = r0.lockName
                java.lang.String r3 = "Attempted to acquire multiple locks with the same rank %s"
                com.google.common.base.Preconditions.checkState(r1, r3, r2)
                java.util.Map<com.google.common.util.concurrent.CycleDetectingLockFactory$LockGraphNode, com.google.common.util.concurrent.CycleDetectingLockFactory$ExampleStackTrace> r1 = r4.allowedPriorLocks
                boolean r1 = r1.containsKey(r0)
                if (r1 == 0) goto L25
                goto L4
            L25:
                java.util.Map<com.google.common.util.concurrent.CycleDetectingLockFactory$LockGraphNode, com.google.common.util.concurrent.CycleDetectingLockFactory$PotentialDeadlockException> r1 = r4.disallowedPriorLocks
                java.lang.Object r1 = r1.get(r0)
                com.google.common.util.concurrent.CycleDetectingLockFactory$PotentialDeadlockException r1 = (com.google.common.util.concurrent.CycleDetectingLockFactory.PotentialDeadlockException) r1
                r2 = 0
                if (r1 == 0) goto L3d
                com.google.common.util.concurrent.CycleDetectingLockFactory$PotentialDeadlockException r3 = new com.google.common.util.concurrent.CycleDetectingLockFactory$PotentialDeadlockException
                com.google.common.util.concurrent.CycleDetectingLockFactory$ExampleStackTrace r1 = r1.getConflictingStackTrace()
                r3.<init>(r0, r4, r1, r2)
                r5.handlePotentialDeadlock(r3)
                goto L4
            L3d:
                java.util.Set r1 = com.google.common.collect.Sets.newIdentityHashSet()
                com.google.common.util.concurrent.CycleDetectingLockFactory$ExampleStackTrace r1 = r0.findPathTo(r4, r1)
                if (r1 != 0) goto L52
                java.util.Map<com.google.common.util.concurrent.CycleDetectingLockFactory$LockGraphNode, com.google.common.util.concurrent.CycleDetectingLockFactory$ExampleStackTrace> r1 = r4.allowedPriorLocks
                com.google.common.util.concurrent.CycleDetectingLockFactory$ExampleStackTrace r2 = new com.google.common.util.concurrent.CycleDetectingLockFactory$ExampleStackTrace
                r2.<init>(r0, r4)
                r1.put(r0, r2)
                goto L4
            L52:
                com.google.common.util.concurrent.CycleDetectingLockFactory$PotentialDeadlockException r3 = new com.google.common.util.concurrent.CycleDetectingLockFactory$PotentialDeadlockException
                r3.<init>(r0, r4, r1, r2)
                java.util.Map<com.google.common.util.concurrent.CycleDetectingLockFactory$LockGraphNode, com.google.common.util.concurrent.CycleDetectingLockFactory$PotentialDeadlockException> r1 = r4.disallowedPriorLocks
                r1.put(r0, r3)
                r5.handlePotentialDeadlock(r3)
                goto L4
            L60:
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @com.google.common.annotations.Beta
    public static abstract enum Policies extends java.lang.Enum<com.google.common.util.concurrent.CycleDetectingLockFactory.Policies> implements com.google.common.util.concurrent.CycleDetectingLockFactory.Policy {
        private static final /* synthetic */ com.google.common.util.concurrent.CycleDetectingLockFactory.Policies[] $VALUES = null;
        public static final com.google.common.util.concurrent.CycleDetectingLockFactory.Policies DISABLED = null;
        public static final com.google.common.util.concurrent.CycleDetectingLockFactory.Policies THROW = null;
        public static final com.google.common.util.concurrent.CycleDetectingLockFactory.Policies WARN = null;




        private static /* synthetic */ com.google.common.util.concurrent.CycleDetectingLockFactory.Policies[] $values() {
                r0 = 3
                com.google.common.util.concurrent.CycleDetectingLockFactory$Policies[] r0 = new com.google.common.util.concurrent.CycleDetectingLockFactory.Policies[r0]
                com.google.common.util.concurrent.CycleDetectingLockFactory$Policies r1 = com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.THROW
                r2 = 0
                r0[r2] = r1
                com.google.common.util.concurrent.CycleDetectingLockFactory$Policies r1 = com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.WARN
                r2 = 1
                r0[r2] = r1
                com.google.common.util.concurrent.CycleDetectingLockFactory$Policies r1 = com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.DISABLED
                r2 = 2
                r0[r2] = r1
                return r0
        }

        static {
                com.google.common.util.concurrent.CycleDetectingLockFactory$Policies$1 r0 = new com.google.common.util.concurrent.CycleDetectingLockFactory$Policies$1
                r0.<init>()
                com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.THROW = r0
                com.google.common.util.concurrent.CycleDetectingLockFactory$Policies$2 r0 = new com.google.common.util.concurrent.CycleDetectingLockFactory$Policies$2
                r0.<init>()
                com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.WARN = r0
                com.google.common.util.concurrent.CycleDetectingLockFactory$Policies$3 r0 = new com.google.common.util.concurrent.CycleDetectingLockFactory$Policies$3
                r0.<init>()
                com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.DISABLED = r0
                com.google.common.util.concurrent.CycleDetectingLockFactory$Policies[] r0 = $values()
                com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.$VALUES = r0
                return
        }

        private Policies(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public /* synthetic */ Policies(java.lang.String r1, int r2, com.google.common.util.concurrent.CycleDetectingLockFactory.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.util.concurrent.CycleDetectingLockFactory.Policies valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.util.concurrent.CycleDetectingLockFactory$Policies> r0 = com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.util.concurrent.CycleDetectingLockFactory$Policies r1 = (com.google.common.util.concurrent.CycleDetectingLockFactory.Policies) r1
                return r1
        }

        public static com.google.common.util.concurrent.CycleDetectingLockFactory.Policies[] values() {
                com.google.common.util.concurrent.CycleDetectingLockFactory$Policies[] r0 = com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.util.concurrent.CycleDetectingLockFactory$Policies[] r0 = (com.google.common.util.concurrent.CycleDetectingLockFactory.Policies[]) r0
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @com.google.common.annotations.Beta
    public interface Policy {
        void handlePotentialDeadlock(com.google.common.util.concurrent.CycleDetectingLockFactory.PotentialDeadlockException r1);
    }

    /* JADX INFO: loaded from: classes2.dex */
    @com.google.common.annotations.Beta
    public static final class PotentialDeadlockException extends com.google.common.util.concurrent.CycleDetectingLockFactory.ExampleStackTrace {
        private final com.google.common.util.concurrent.CycleDetectingLockFactory.ExampleStackTrace conflictingStackTrace;

        private PotentialDeadlockException(com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode r1, com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode r2, com.google.common.util.concurrent.CycleDetectingLockFactory.ExampleStackTrace r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.conflictingStackTrace = r3
                r0.initCause(r3)
                return
        }

        public /* synthetic */ PotentialDeadlockException(com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode r1, com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode r2, com.google.common.util.concurrent.CycleDetectingLockFactory.ExampleStackTrace r3, com.google.common.util.concurrent.CycleDetectingLockFactory.AnonymousClass1 r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        public com.google.common.util.concurrent.CycleDetectingLockFactory.ExampleStackTrace getConflictingStackTrace() {
                r1 = this;
                com.google.common.util.concurrent.CycleDetectingLockFactory$ExampleStackTrace r0 = r1.conflictingStackTrace
                return r0
        }

        @Override // java.lang.Throwable
        public java.lang.String getMessage() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = super.getMessage()
                java.util.Objects.requireNonNull(r1)
                r0.<init>(r1)
                com.google.common.util.concurrent.CycleDetectingLockFactory$ExampleStackTrace r1 = r3.conflictingStackTrace
            Le:
                if (r1 == 0) goto L21
                java.lang.String r2 = ", "
                r0.append(r2)
                java.lang.String r2 = r1.getMessage()
                r0.append(r2)
                java.lang.Throwable r1 = r1.getCause()
                goto Le
            L21:
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @com.google.common.annotations.Beta
    public static final class WithExplicitOrdering<E extends java.lang.Enum<E>> extends com.google.common.util.concurrent.CycleDetectingLockFactory {
        private final java.util.Map<E, com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode> lockGraphNodes;

        @com.google.common.annotations.VisibleForTesting
        public WithExplicitOrdering(com.google.common.util.concurrent.CycleDetectingLockFactory.Policy r2, java.util.Map<E, com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode> r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                r1.lockGraphNodes = r3
                return
        }

        public java.util.concurrent.locks.ReentrantLock newReentrantLock(E r2) {
                r1 = this;
                r0 = 0
                java.util.concurrent.locks.ReentrantLock r2 = r1.newReentrantLock(r2, r0)
                return r2
        }

        public java.util.concurrent.locks.ReentrantLock newReentrantLock(E r3, boolean r4) {
                r2 = this;
                com.google.common.util.concurrent.CycleDetectingLockFactory$Policy r0 = r2.policy
                com.google.common.util.concurrent.CycleDetectingLockFactory$Policies r1 = com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.DISABLED
                if (r0 != r1) goto Lc
                java.util.concurrent.locks.ReentrantLock r3 = new java.util.concurrent.locks.ReentrantLock
                r3.<init>(r4)
                goto L1e
            Lc:
                com.google.common.util.concurrent.CycleDetectingLockFactory$CycleDetectingReentrantLock r0 = new com.google.common.util.concurrent.CycleDetectingLockFactory$CycleDetectingReentrantLock
                java.util.Map<E extends java.lang.Enum<E>, com.google.common.util.concurrent.CycleDetectingLockFactory$LockGraphNode> r1 = r2.lockGraphNodes
                java.lang.Object r3 = r1.get(r3)
                com.google.common.util.concurrent.CycleDetectingLockFactory$LockGraphNode r3 = (com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode) r3
                java.util.Objects.requireNonNull(r3)
                r1 = 0
                r0.<init>(r2, r3, r4, r1)
                r3 = r0
            L1e:
                return r3
        }

        public java.util.concurrent.locks.ReentrantReadWriteLock newReentrantReadWriteLock(E r2) {
                r1 = this;
                r0 = 0
                java.util.concurrent.locks.ReentrantReadWriteLock r2 = r1.newReentrantReadWriteLock(r2, r0)
                return r2
        }

        public java.util.concurrent.locks.ReentrantReadWriteLock newReentrantReadWriteLock(E r3, boolean r4) {
                r2 = this;
                com.google.common.util.concurrent.CycleDetectingLockFactory$Policy r0 = r2.policy
                com.google.common.util.concurrent.CycleDetectingLockFactory$Policies r1 = com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.DISABLED
                if (r0 != r1) goto Lc
                java.util.concurrent.locks.ReentrantReadWriteLock r3 = new java.util.concurrent.locks.ReentrantReadWriteLock
                r3.<init>(r4)
                goto L1e
            Lc:
                com.google.common.util.concurrent.CycleDetectingLockFactory$CycleDetectingReentrantReadWriteLock r0 = new com.google.common.util.concurrent.CycleDetectingLockFactory$CycleDetectingReentrantReadWriteLock
                java.util.Map<E extends java.lang.Enum<E>, com.google.common.util.concurrent.CycleDetectingLockFactory$LockGraphNode> r1 = r2.lockGraphNodes
                java.lang.Object r3 = r1.get(r3)
                com.google.common.util.concurrent.CycleDetectingLockFactory$LockGraphNode r3 = (com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode) r3
                java.util.Objects.requireNonNull(r3)
                r1 = 0
                r0.<init>(r2, r3, r4, r1)
                r3 = r0
            L1e:
                return r3
        }
    }

    static {
            com.google.common.collect.MapMaker r0 = new com.google.common.collect.MapMaker
            r0.<init>()
            com.google.common.collect.MapMaker r0 = r0.weakKeys()
            java.util.concurrent.ConcurrentMap r0 = r0.makeMap()
            com.google.common.util.concurrent.CycleDetectingLockFactory.lockGraphNodesPerType = r0
            java.lang.Class<com.google.common.util.concurrent.CycleDetectingLockFactory> r0 = com.google.common.util.concurrent.CycleDetectingLockFactory.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.common.util.concurrent.CycleDetectingLockFactory.logger = r0
            com.google.common.util.concurrent.CycleDetectingLockFactory$1 r0 = new com.google.common.util.concurrent.CycleDetectingLockFactory$1
            r0.<init>()
            com.google.common.util.concurrent.CycleDetectingLockFactory.acquiredLocks = r0
            return
    }

    private CycleDetectingLockFactory(com.google.common.util.concurrent.CycleDetectingLockFactory.Policy r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.util.concurrent.CycleDetectingLockFactory$Policy r1 = (com.google.common.util.concurrent.CycleDetectingLockFactory.Policy) r1
            r0.policy = r1
            return
    }

    public /* synthetic */ CycleDetectingLockFactory(com.google.common.util.concurrent.CycleDetectingLockFactory.Policy r1, com.google.common.util.concurrent.CycleDetectingLockFactory.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private void aboutToAcquire(com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingLock r3) {
            r2 = this;
            boolean r0 = r3.isAcquiredByCurrentThread()
            if (r0 != 0) goto L1a
            java.lang.ThreadLocal<java.util.ArrayList<com.google.common.util.concurrent.CycleDetectingLockFactory$LockGraphNode>> r0 = com.google.common.util.concurrent.CycleDetectingLockFactory.acquiredLocks
            java.lang.Object r0 = r0.get()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            com.google.common.util.concurrent.CycleDetectingLockFactory$LockGraphNode r3 = r3.getLockGraphNode()
            com.google.common.util.concurrent.CycleDetectingLockFactory$Policy r1 = r2.policy
            r3.checkAcquiredLocks(r1, r0)
            r0.add(r3)
        L1a:
            return
    }

    public static /* synthetic */ java.util.logging.Logger access$100() {
            java.util.logging.Logger r0 = com.google.common.util.concurrent.CycleDetectingLockFactory.logger
            return r0
    }

    public static /* synthetic */ void access$600(com.google.common.util.concurrent.CycleDetectingLockFactory r0, com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingLock r1) {
            r0.aboutToAcquire(r1)
            return
    }

    public static /* synthetic */ void access$700(com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingLock r0) {
            lockStateChanged(r0)
            return
    }

    private static java.lang.String getLockName(java.lang.Enum<?> r3) {
            java.lang.Class r0 = r3.getDeclaringClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r3 = r3.name()
            int r1 = r0.length()
            int r1 = r1 + 1
            int r1 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r3, r1)
            java.lang.String r2 = "."
            java.lang.String r3 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r0, r2, r3)
            return r3
    }

    private static <E extends java.lang.Enum<E>> java.util.Map<? extends E, com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode> getOrCreateNodes(java.lang.Class<E> r10) {
            java.util.concurrent.ConcurrentMap<java.lang.Class<? extends java.lang.Enum<?>>, java.util.Map<? extends java.lang.Enum<?>, com.google.common.util.concurrent.CycleDetectingLockFactory$LockGraphNode>> r0 = com.google.common.util.concurrent.CycleDetectingLockFactory.lockGraphNodesPerType
            java.lang.Object r0 = r0.get(r10)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            java.util.EnumMap r0 = com.google.common.collect.Maps.newEnumMap(r10)
            java.lang.Object[] r1 = r10.getEnumConstants()
            java.lang.Enum[] r1 = (java.lang.Enum[]) r1
            int r2 = r1.length
            java.util.ArrayList r3 = com.google.common.collect.Lists.newArrayListWithCapacity(r2)
            int r4 = r1.length
            r5 = 0
            r6 = 0
        L1d:
            if (r6 >= r4) goto L33
            r7 = r1[r6]
            com.google.common.util.concurrent.CycleDetectingLockFactory$LockGraphNode r8 = new com.google.common.util.concurrent.CycleDetectingLockFactory$LockGraphNode
            java.lang.String r9 = getLockName(r7)
            r8.<init>(r9)
            r3.add(r8)
            r0.put(r7, r8)
            int r6 = r6 + 1
            goto L1d
        L33:
            r1 = 1
        L34:
            if (r1 >= r2) goto L48
            java.lang.Object r4 = r3.get(r1)
            com.google.common.util.concurrent.CycleDetectingLockFactory$LockGraphNode r4 = (com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode) r4
            com.google.common.util.concurrent.CycleDetectingLockFactory$Policies r6 = com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.THROW
            java.util.List r7 = r3.subList(r5, r1)
            r4.checkAcquiredLocks(r6, r7)
            int r1 = r1 + 1
            goto L34
        L48:
            int r1 = r2 + (-1)
            if (r5 >= r1) goto L5e
            java.lang.Object r1 = r3.get(r5)
            com.google.common.util.concurrent.CycleDetectingLockFactory$LockGraphNode r1 = (com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode) r1
            com.google.common.util.concurrent.CycleDetectingLockFactory$Policies r4 = com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.DISABLED
            int r5 = r5 + 1
            java.util.List r6 = r3.subList(r5, r2)
            r1.checkAcquiredLocks(r4, r6)
            goto L48
        L5e:
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            java.util.concurrent.ConcurrentMap<java.lang.Class<? extends java.lang.Enum<?>>, java.util.Map<? extends java.lang.Enum<?>, com.google.common.util.concurrent.CycleDetectingLockFactory$LockGraphNode>> r1 = com.google.common.util.concurrent.CycleDetectingLockFactory.lockGraphNodesPerType
            java.lang.Object r10 = r1.putIfAbsent(r10, r0)
            java.util.Map r10 = (java.util.Map) r10
            java.lang.Object r10 = com.google.common.base.MoreObjects.firstNonNull(r10, r0)
            java.util.Map r10 = (java.util.Map) r10
            return r10
    }

    private static void lockStateChanged(com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingLock r3) {
            boolean r0 = r3.isAcquiredByCurrentThread()
            if (r0 != 0) goto L27
            java.lang.ThreadLocal<java.util.ArrayList<com.google.common.util.concurrent.CycleDetectingLockFactory$LockGraphNode>> r0 = com.google.common.util.concurrent.CycleDetectingLockFactory.acquiredLocks
            java.lang.Object r0 = r0.get()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            com.google.common.util.concurrent.CycleDetectingLockFactory$LockGraphNode r3 = r3.getLockGraphNode()
            int r1 = r0.size()
            int r1 = r1 + (-1)
        L18:
            if (r1 < 0) goto L27
            java.lang.Object r2 = r0.get(r1)
            if (r2 != r3) goto L24
            r0.remove(r1)
            goto L27
        L24:
            int r1 = r1 + (-1)
            goto L18
        L27:
            return
    }

    public static com.google.common.util.concurrent.CycleDetectingLockFactory newInstance(com.google.common.util.concurrent.CycleDetectingLockFactory.Policy r1) {
            com.google.common.util.concurrent.CycleDetectingLockFactory r0 = new com.google.common.util.concurrent.CycleDetectingLockFactory
            r0.<init>(r1)
            return r0
    }

    public static <E extends java.lang.Enum<E>> com.google.common.util.concurrent.CycleDetectingLockFactory.WithExplicitOrdering<E> newInstanceWithExplicitOrdering(java.lang.Class<E> r1, com.google.common.util.concurrent.CycleDetectingLockFactory.Policy r2) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Preconditions.checkNotNull(r2)
            java.util.Map r1 = getOrCreateNodes(r1)
            com.google.common.util.concurrent.CycleDetectingLockFactory$WithExplicitOrdering r0 = new com.google.common.util.concurrent.CycleDetectingLockFactory$WithExplicitOrdering
            r0.<init>(r2, r1)
            return r0
    }

    public java.util.concurrent.locks.ReentrantLock newReentrantLock(java.lang.String r2) {
            r1 = this;
            r0 = 0
            java.util.concurrent.locks.ReentrantLock r2 = r1.newReentrantLock(r2, r0)
            return r2
    }

    public java.util.concurrent.locks.ReentrantLock newReentrantLock(java.lang.String r3, boolean r4) {
            r2 = this;
            com.google.common.util.concurrent.CycleDetectingLockFactory$Policy r0 = r2.policy
            com.google.common.util.concurrent.CycleDetectingLockFactory$Policies r1 = com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.DISABLED
            if (r0 != r1) goto Lc
            java.util.concurrent.locks.ReentrantLock r3 = new java.util.concurrent.locks.ReentrantLock
            r3.<init>(r4)
            goto L18
        Lc:
            com.google.common.util.concurrent.CycleDetectingLockFactory$CycleDetectingReentrantLock r0 = new com.google.common.util.concurrent.CycleDetectingLockFactory$CycleDetectingReentrantLock
            com.google.common.util.concurrent.CycleDetectingLockFactory$LockGraphNode r1 = new com.google.common.util.concurrent.CycleDetectingLockFactory$LockGraphNode
            r1.<init>(r3)
            r3 = 0
            r0.<init>(r2, r1, r4, r3)
            r3 = r0
        L18:
            return r3
    }

    public java.util.concurrent.locks.ReentrantReadWriteLock newReentrantReadWriteLock(java.lang.String r2) {
            r1 = this;
            r0 = 0
            java.util.concurrent.locks.ReentrantReadWriteLock r2 = r1.newReentrantReadWriteLock(r2, r0)
            return r2
    }

    public java.util.concurrent.locks.ReentrantReadWriteLock newReentrantReadWriteLock(java.lang.String r3, boolean r4) {
            r2 = this;
            com.google.common.util.concurrent.CycleDetectingLockFactory$Policy r0 = r2.policy
            com.google.common.util.concurrent.CycleDetectingLockFactory$Policies r1 = com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.DISABLED
            if (r0 != r1) goto Lc
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r3.<init>(r4)
            goto L18
        Lc:
            com.google.common.util.concurrent.CycleDetectingLockFactory$CycleDetectingReentrantReadWriteLock r0 = new com.google.common.util.concurrent.CycleDetectingLockFactory$CycleDetectingReentrantReadWriteLock
            com.google.common.util.concurrent.CycleDetectingLockFactory$LockGraphNode r1 = new com.google.common.util.concurrent.CycleDetectingLockFactory$LockGraphNode
            r1.<init>(r3)
            r3 = 0
            r0.<init>(r2, r1, r4, r3)
            r3 = r0
        L18:
            return r3
    }
}
