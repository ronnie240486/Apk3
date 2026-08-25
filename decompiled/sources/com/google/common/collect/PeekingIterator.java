package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.DoNotMock("Use Iterators.peekingIterator")
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
public interface PeekingIterator<E> extends java.util.Iterator<E> {
    @Override // java.util.Iterator
    @com.google.common.collect.ParametricNullness
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    E next();

    @com.google.common.collect.ParametricNullness
    E peek();

    @Override // java.util.Iterator
    void remove();
}
