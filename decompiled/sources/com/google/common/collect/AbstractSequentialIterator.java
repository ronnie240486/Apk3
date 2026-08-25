package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class AbstractSequentialIterator<T> extends com.google.common.collect.UnmodifiableIterator<T> {

    @javax.annotation.CheckForNull
    private T nextOrNull;

    public AbstractSequentialIterator(@javax.annotation.CheckForNull T r1) {
            r0 = this;
            r0.<init>()
            r0.nextOrNull = r1
            return
    }

    @javax.annotation.CheckForNull
    public abstract T computeNext(T r1);

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            T r0 = r1.nextOrNull
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // java.util.Iterator
    public final T next() {
            r2 = this;
            T r0 = r2.nextOrNull
            if (r0 == 0) goto Lb
            java.lang.Object r1 = r2.computeNext(r0)
            r2.nextOrNull = r1
            return r0
        Lb:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }
}
