package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ForwardingQueue<E> extends com.google.common.collect.ForwardingCollection<E> implements java.util.Queue<E> {
    public ForwardingQueue() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            java.util.Queue r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ java.util.Collection delegate() {
            r1 = this;
            java.util.Queue r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public abstract java.util.Queue<E> delegate();

    @Override // java.util.Queue
    @com.google.common.collect.ParametricNullness
    public E element() {
            r1 = this;
            java.util.Queue r0 = r1.delegate()
            java.lang.Object r0 = r0.element()
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean offer(@com.google.common.collect.ParametricNullness E r2) {
            r1 = this;
            java.util.Queue r0 = r1.delegate()
            boolean r2 = r0.offer(r2)
            return r2
    }

    @Override // java.util.Queue
    @javax.annotation.CheckForNull
    public E peek() {
            r1 = this;
            java.util.Queue r0 = r1.delegate()
            java.lang.Object r0 = r0.peek()
            return r0
    }

    @Override // java.util.Queue
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    public E poll() {
            r1 = this;
            java.util.Queue r0 = r1.delegate()
            java.lang.Object r0 = r0.poll()
            return r0
    }

    @Override // java.util.Queue
    @com.google.common.collect.ParametricNullness
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public E remove() {
            r1 = this;
            java.util.Queue r0 = r1.delegate()
            java.lang.Object r0 = r0.remove()
            return r0
    }
}
