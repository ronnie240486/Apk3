package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
abstract class TransformedListIterator<F, T> extends com.google.common.collect.TransformedIterator<F, T> implements java.util.ListIterator<T> {
    public TransformedListIterator(java.util.ListIterator<? extends F> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private java.util.ListIterator<? extends F> backingIterator() {
            r1 = this;
            java.util.Iterator<? extends F> r0 = r1.backingIterator
            java.util.ListIterator r0 = (java.util.ListIterator) r0
            return r0
    }

    @Override // java.util.ListIterator
    public void add(@com.google.common.collect.ParametricNullness T r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
            r1 = this;
            java.util.ListIterator r0 = r1.backingIterator()
            boolean r0 = r0.hasPrevious()
            return r0
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
            r1 = this;
            java.util.ListIterator r0 = r1.backingIterator()
            int r0 = r0.nextIndex()
            return r0
    }

    @Override // java.util.ListIterator
    @com.google.common.collect.ParametricNullness
    public final T previous() {
            r1 = this;
            java.util.ListIterator r0 = r1.backingIterator()
            java.lang.Object r0 = r0.previous()
            java.lang.Object r0 = r1.transform(r0)
            return r0
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
            r1 = this;
            java.util.ListIterator r0 = r1.backingIterator()
            int r0 = r0.previousIndex()
            return r0
    }

    public void set(@com.google.common.collect.ParametricNullness T r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }
}
