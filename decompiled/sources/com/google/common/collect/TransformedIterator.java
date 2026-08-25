package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
abstract class TransformedIterator<F, T> implements java.util.Iterator<T> {
    public final java.util.Iterator<? extends F> backingIterator;

    public TransformedIterator(java.util.Iterator<? extends F> r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.util.Iterator r1 = (java.util.Iterator) r1
            r0.backingIterator = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            java.util.Iterator<? extends F> r0 = r1.backingIterator
            boolean r0 = r0.hasNext()
            return r0
    }

    @Override // java.util.Iterator
    @com.google.common.collect.ParametricNullness
    public final T next() {
            r1 = this;
            java.util.Iterator<? extends F> r0 = r1.backingIterator
            java.lang.Object r0 = r0.next()
            java.lang.Object r0 = r1.transform(r0)
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            java.util.Iterator<? extends F> r0 = r1.backingIterator
            r0.remove()
            return
    }

    @com.google.common.collect.ParametricNullness
    public abstract T transform(@com.google.common.collect.ParametricNullness F r1);
}
