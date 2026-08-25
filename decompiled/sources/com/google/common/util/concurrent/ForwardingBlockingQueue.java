package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.CanIgnoreReturnValue
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
public abstract class ForwardingBlockingQueue<E> extends com.google.common.collect.ForwardingQueue<E> implements java.util.concurrent.BlockingQueue<E> {
    public ForwardingBlockingQueue() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public final /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            java.util.concurrent.BlockingQueue r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public final /* bridge */ /* synthetic */ java.util.Collection delegate() {
            r1 = this;
            java.util.concurrent.BlockingQueue r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public final /* bridge */ /* synthetic */ java.util.Queue delegate() {
            r1 = this;
            java.util.concurrent.BlockingQueue r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public abstract java.util.concurrent.BlockingQueue<E> delegate();

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(java.util.Collection<? super E> r2) {
            r1 = this;
            java.util.concurrent.BlockingQueue r0 = r1.delegate()
            int r2 = r0.drainTo(r2)
            return r2
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(java.util.Collection<? super E> r2, int r3) {
            r1 = this;
            java.util.concurrent.BlockingQueue r0 = r1.delegate()
            int r2 = r0.drainTo(r2, r3)
            return r2
    }

    @Override // java.util.concurrent.BlockingQueue
    public boolean offer(E r2, long r3, java.util.concurrent.TimeUnit r5) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.BlockingQueue r0 = r1.delegate()
            boolean r2 = r0.offer(r2, r3, r5)
            return r2
    }

    @Override // java.util.concurrent.BlockingQueue
    @javax.annotation.CheckForNull
    public E poll(long r2, java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.BlockingQueue r0 = r1.delegate()
            java.lang.Object r2 = r0.poll(r2, r4)
            return r2
    }

    @Override // java.util.concurrent.BlockingQueue
    public void put(E r2) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.BlockingQueue r0 = r1.delegate()
            r0.put(r2)
            return
    }

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
            r1 = this;
            java.util.concurrent.BlockingQueue r0 = r1.delegate()
            int r0 = r0.remainingCapacity()
            return r0
    }

    @Override // java.util.concurrent.BlockingQueue
    public E take() throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.BlockingQueue r0 = r1.delegate()
            java.lang.Object r0 = r0.take()
            return r0
    }
}
