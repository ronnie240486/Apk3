package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ForwardingListIterator<E> extends com.google.common.collect.ForwardingIterator<E> implements java.util.ListIterator<E> {
    public ForwardingListIterator() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.ListIterator
    public void add(@com.google.common.collect.ParametricNullness E r2) {
            r1 = this;
            java.util.ListIterator r0 = r1.delegate()
            r0.add(r2)
            return
    }

    @Override // com.google.common.collect.ForwardingIterator, com.google.common.collect.ForwardingObject
    public final /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            java.util.ListIterator r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingIterator, com.google.common.collect.ForwardingObject
    public final /* bridge */ /* synthetic */ java.util.Iterator delegate() {
            r1 = this;
            java.util.ListIterator r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingIterator, com.google.common.collect.ForwardingObject
    public abstract java.util.ListIterator<E> delegate();

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
            r1 = this;
            java.util.ListIterator r0 = r1.delegate()
            boolean r0 = r0.hasPrevious()
            return r0
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
            r1 = this;
            java.util.ListIterator r0 = r1.delegate()
            int r0 = r0.nextIndex()
            return r0
    }

    @Override // java.util.ListIterator
    @com.google.common.collect.ParametricNullness
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public E previous() {
            r1 = this;
            java.util.ListIterator r0 = r1.delegate()
            java.lang.Object r0 = r0.previous()
            return r0
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
            r1 = this;
            java.util.ListIterator r0 = r1.delegate()
            int r0 = r0.previousIndex()
            return r0
    }

    @Override // java.util.ListIterator
    public void set(@com.google.common.collect.ParametricNullness E r2) {
            r1 = this;
            java.util.ListIterator r0 = r1.delegate()
            r0.set(r2)
            return
    }
}
