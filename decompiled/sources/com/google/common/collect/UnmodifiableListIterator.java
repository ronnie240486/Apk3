package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class UnmodifiableListIterator<E> extends com.google.common.collect.UnmodifiableIterator<E> implements java.util.ListIterator<E> {
    public UnmodifiableListIterator() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.ListIterator
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public final void add(@com.google.common.collect.ParametricNullness E r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.ListIterator
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public final void set(@com.google.common.collect.ParametricNullness E r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }
}
