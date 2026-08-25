package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtIncompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ForwardingDeque<E> extends com.google.common.collect.ForwardingQueue<E> implements java.util.Deque<E> {
    public ForwardingDeque() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Deque
    public void addFirst(@com.google.common.collect.ParametricNullness E r2) {
            r1 = this;
            java.util.Deque r0 = r1.delegate()
            r0.addFirst(r2)
            return
    }

    @Override // java.util.Deque
    public void addLast(@com.google.common.collect.ParametricNullness E r2) {
            r1 = this;
            java.util.Deque r0 = r1.delegate()
            r0.addLast(r2)
            return
    }

    @Override // com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            java.util.Deque r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ java.util.Collection delegate() {
            r1 = this;
            java.util.Deque r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public abstract java.util.Deque<E> delegate();

    @Override // com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ java.util.Queue delegate() {
            r1 = this;
            java.util.Deque r0 = r1.delegate()
            return r0
    }

    @Override // java.util.Deque
    public java.util.Iterator<E> descendingIterator() {
            r1 = this;
            java.util.Deque r0 = r1.delegate()
            java.util.Iterator r0 = r0.descendingIterator()
            return r0
    }

    @Override // java.util.Deque
    @com.google.common.collect.ParametricNullness
    public E getFirst() {
            r1 = this;
            java.util.Deque r0 = r1.delegate()
            java.lang.Object r0 = r0.getFirst()
            return r0
    }

    @Override // java.util.Deque
    @com.google.common.collect.ParametricNullness
    public E getLast() {
            r1 = this;
            java.util.Deque r0 = r1.delegate()
            java.lang.Object r0 = r0.getLast()
            return r0
    }

    @Override // java.util.Deque
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean offerFirst(@com.google.common.collect.ParametricNullness E r2) {
            r1 = this;
            java.util.Deque r0 = r1.delegate()
            boolean r2 = r0.offerFirst(r2)
            return r2
    }

    @Override // java.util.Deque
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean offerLast(@com.google.common.collect.ParametricNullness E r2) {
            r1 = this;
            java.util.Deque r0 = r1.delegate()
            boolean r2 = r0.offerLast(r2)
            return r2
    }

    @Override // java.util.Deque
    @javax.annotation.CheckForNull
    public E peekFirst() {
            r1 = this;
            java.util.Deque r0 = r1.delegate()
            java.lang.Object r0 = r0.peekFirst()
            return r0
    }

    @Override // java.util.Deque
    @javax.annotation.CheckForNull
    public E peekLast() {
            r1 = this;
            java.util.Deque r0 = r1.delegate()
            java.lang.Object r0 = r0.peekLast()
            return r0
    }

    @Override // java.util.Deque
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    public E pollFirst() {
            r1 = this;
            java.util.Deque r0 = r1.delegate()
            java.lang.Object r0 = r0.pollFirst()
            return r0
    }

    @Override // java.util.Deque
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    public E pollLast() {
            r1 = this;
            java.util.Deque r0 = r1.delegate()
            java.lang.Object r0 = r0.pollLast()
            return r0
    }

    @Override // java.util.Deque
    @com.google.common.collect.ParametricNullness
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public E pop() {
            r1 = this;
            java.util.Deque r0 = r1.delegate()
            java.lang.Object r0 = r0.pop()
            return r0
    }

    @Override // java.util.Deque
    public void push(@com.google.common.collect.ParametricNullness E r2) {
            r1 = this;
            java.util.Deque r0 = r1.delegate()
            r0.push(r2)
            return
    }

    @Override // java.util.Deque
    @com.google.common.collect.ParametricNullness
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public E removeFirst() {
            r1 = this;
            java.util.Deque r0 = r1.delegate()
            java.lang.Object r0 = r0.removeFirst()
            return r0
    }

    @Override // java.util.Deque
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean removeFirstOccurrence(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            java.util.Deque r0 = r1.delegate()
            boolean r2 = r0.removeFirstOccurrence(r2)
            return r2
    }

    @Override // java.util.Deque
    @com.google.common.collect.ParametricNullness
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public E removeLast() {
            r1 = this;
            java.util.Deque r0 = r1.delegate()
            java.lang.Object r0 = r0.removeLast()
            return r0
    }

    @Override // java.util.Deque
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean removeLastOccurrence(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            java.util.Deque r0 = r1.delegate()
            boolean r2 = r0.removeLastOccurrence(r2)
            return r2
    }
}
