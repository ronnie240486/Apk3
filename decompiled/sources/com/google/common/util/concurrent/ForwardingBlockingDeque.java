package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
public abstract class ForwardingBlockingDeque<E> extends com.google.common.collect.ForwardingDeque<E> implements java.util.concurrent.BlockingDeque<E> {
    public ForwardingBlockingDeque() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.common.collect.ForwardingDeque, com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public final /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            java.util.concurrent.BlockingDeque r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingDeque, com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public final /* bridge */ /* synthetic */ java.util.Collection delegate() {
            r1 = this;
            java.util.concurrent.BlockingDeque r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingDeque, com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public final /* bridge */ /* synthetic */ java.util.Deque delegate() {
            r1 = this;
            java.util.concurrent.BlockingDeque r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingDeque, com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public final /* bridge */ /* synthetic */ java.util.Queue delegate() {
            r1 = this;
            java.util.concurrent.BlockingDeque r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingDeque, com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public abstract java.util.concurrent.BlockingDeque<E> delegate();

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(java.util.Collection<? super E> r2) {
            r1 = this;
            java.util.concurrent.BlockingDeque r0 = r1.delegate()
            int r2 = r0.drainTo(r2)
            return r2
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(java.util.Collection<? super E> r2, int r3) {
            r1 = this;
            java.util.concurrent.BlockingDeque r0 = r1.delegate()
            int r2 = r0.drainTo(r2, r3)
            return r2
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public boolean offer(E r2, long r3, java.util.concurrent.TimeUnit r5) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.BlockingDeque r0 = r1.delegate()
            boolean r2 = r0.offer(r2, r3, r5)
            return r2
    }

    @Override // java.util.concurrent.BlockingDeque
    public boolean offerFirst(E r2, long r3, java.util.concurrent.TimeUnit r5) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.BlockingDeque r0 = r1.delegate()
            boolean r2 = r0.offerFirst(r2, r3, r5)
            return r2
    }

    @Override // java.util.concurrent.BlockingDeque
    public boolean offerLast(E r2, long r3, java.util.concurrent.TimeUnit r5) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.BlockingDeque r0 = r1.delegate()
            boolean r2 = r0.offerLast(r2, r3, r5)
            return r2
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    @javax.annotation.CheckForNull
    public E poll(long r2, java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.BlockingDeque r0 = r1.delegate()
            java.lang.Object r2 = r0.poll(r2, r4)
            return r2
    }

    @Override // java.util.concurrent.BlockingDeque
    @javax.annotation.CheckForNull
    public E pollFirst(long r2, java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.BlockingDeque r0 = r1.delegate()
            java.lang.Object r2 = r0.pollFirst(r2, r4)
            return r2
    }

    @Override // java.util.concurrent.BlockingDeque
    @javax.annotation.CheckForNull
    public E pollLast(long r2, java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.BlockingDeque r0 = r1.delegate()
            java.lang.Object r2 = r0.pollLast(r2, r4)
            return r2
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public void put(E r2) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.BlockingDeque r0 = r1.delegate()
            r0.put(r2)
            return
    }

    @Override // java.util.concurrent.BlockingDeque
    public void putFirst(E r2) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.BlockingDeque r0 = r1.delegate()
            r0.putFirst(r2)
            return
    }

    @Override // java.util.concurrent.BlockingDeque
    public void putLast(E r2) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.BlockingDeque r0 = r1.delegate()
            r0.putLast(r2)
            return
    }

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
            r1 = this;
            java.util.concurrent.BlockingDeque r0 = r1.delegate()
            int r0 = r0.remainingCapacity()
            return r0
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public E take() throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.BlockingDeque r0 = r1.delegate()
            java.lang.Object r0 = r0.take()
            return r0
    }

    @Override // java.util.concurrent.BlockingDeque
    public E takeFirst() throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.BlockingDeque r0 = r1.delegate()
            java.lang.Object r0 = r0.takeFirst()
            return r0
    }

    @Override // java.util.concurrent.BlockingDeque
    public E takeLast() throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.BlockingDeque r0 = r1.delegate()
            java.lang.Object r0 = r0.takeLast()
            return r0
    }
}
