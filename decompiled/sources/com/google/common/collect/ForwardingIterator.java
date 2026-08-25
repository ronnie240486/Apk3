package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ForwardingIterator<T> extends com.google.common.collect.ForwardingObject implements java.util.Iterator<T> {
    public ForwardingIterator() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            java.util.Iterator r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingObject
    public abstract java.util.Iterator<T> delegate();

    @Override // java.util.Iterator
    public boolean hasNext() {
            r1 = this;
            java.util.Iterator r0 = r1.delegate()
            boolean r0 = r0.hasNext()
            return r0
    }

    @com.google.common.collect.ParametricNullness
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public T next() {
            r1 = this;
            java.util.Iterator r0 = r1.delegate()
            java.lang.Object r0 = r0.next()
            return r0
    }

    public void remove() {
            r1 = this;
            java.util.Iterator r0 = r1.delegate()
            r0.remove()
            return
    }
}
