package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class UnmodifiableIterator<E> implements java.util.Iterator<E> {
    public UnmodifiableIterator() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Iterator
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public final void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }
}
