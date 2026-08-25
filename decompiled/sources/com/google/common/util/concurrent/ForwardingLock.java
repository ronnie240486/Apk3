package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
abstract class ForwardingLock implements java.util.concurrent.locks.Lock {
    public ForwardingLock() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract java.util.concurrent.locks.Lock delegate();

    @Override // java.util.concurrent.locks.Lock
    public void lock() {
            r1 = this;
            java.util.concurrent.locks.Lock r0 = r1.delegate()
            r0.lock()
            return
    }

    @Override // java.util.concurrent.locks.Lock
    public void lockInterruptibly() throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.locks.Lock r0 = r1.delegate()
            r0.lockInterruptibly()
            return
    }

    @Override // java.util.concurrent.locks.Lock
    public java.util.concurrent.locks.Condition newCondition() {
            r1 = this;
            java.util.concurrent.locks.Lock r0 = r1.delegate()
            java.util.concurrent.locks.Condition r0 = r0.newCondition()
            return r0
    }

    @Override // java.util.concurrent.locks.Lock
    public boolean tryLock() {
            r1 = this;
            java.util.concurrent.locks.Lock r0 = r1.delegate()
            boolean r0 = r0.tryLock()
            return r0
    }

    @Override // java.util.concurrent.locks.Lock
    public boolean tryLock(long r2, java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.locks.Lock r0 = r1.delegate()
            boolean r2 = r0.tryLock(r2, r4)
            return r2
    }

    @Override // java.util.concurrent.locks.Lock
    public void unlock() {
            r1 = this;
            java.util.concurrent.locks.Lock r0 = r1.delegate()
            r0.unlock()
            return
    }
}
