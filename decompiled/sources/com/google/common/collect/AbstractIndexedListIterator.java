package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
abstract class AbstractIndexedListIterator<E> extends com.google.common.collect.UnmodifiableListIterator<E> {
    private int position;
    private final int size;

    public AbstractIndexedListIterator(int r1, int r2) {
            r0 = this;
            r0.<init>()
            com.google.common.base.Preconditions.checkPositionIndex(r2, r1)
            r0.size = r1
            r0.position = r2
            return
    }

    @com.google.common.collect.ParametricNullness
    public abstract E get(int r1);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.position
            int r1 = r2.size
            if (r0 >= r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
            r1 = this;
            int r0 = r1.position
            if (r0 <= 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // java.util.Iterator, java.util.ListIterator
    @com.google.common.collect.ParametricNullness
    public final E next() {
            r2 = this;
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L11
            int r0 = r2.position
            int r1 = r0 + 1
            r2.position = r1
            java.lang.Object r0 = r2.get(r0)
            return r0
        L11:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
            r1 = this;
            int r0 = r1.position
            return r0
    }

    @Override // java.util.ListIterator
    @com.google.common.collect.ParametricNullness
    public final E previous() {
            r1 = this;
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L11
            int r0 = r1.position
            int r0 = r0 + (-1)
            r1.position = r0
            java.lang.Object r0 = r1.get(r0)
            return r0
        L11:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
            r1 = this;
            int r0 = r1.position
            int r0 = r0 + (-1)
            return r0
    }
}
