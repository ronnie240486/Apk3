package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ForwardingList<E> extends com.google.common.collect.ForwardingCollection<E> implements java.util.List<E> {
    public ForwardingList() {
            r0 = this;
            r0.<init>()
            return
    }

    public void add(int r2, @com.google.common.collect.ParametricNullness E r3) {
            r1 = this;
            java.util.List r0 = r1.delegate()
            r0.add(r2, r3)
            return
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean addAll(int r2, java.util.Collection<? extends E> r3) {
            r1 = this;
            java.util.List r0 = r1.delegate()
            boolean r2 = r0.addAll(r2, r3)
            return r2
    }

    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            java.util.List r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ java.util.Collection delegate() {
            r1 = this;
            java.util.List r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public abstract java.util.List<E> delegate();

    @Override // java.util.Collection, java.util.List
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            if (r2 == r1) goto Lf
            java.util.List r0 = r1.delegate()
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            goto L10
        Lf:
            r2 = 1
        L10:
            return r2
    }

    @Override // java.util.List
    @com.google.common.collect.ParametricNullness
    public E get(int r2) {
            r1 = this;
            java.util.List r0 = r1.delegate()
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
            r1 = this;
            java.util.List r0 = r1.delegate()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.util.List
    public int indexOf(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            java.util.List r0 = r1.delegate()
            int r2 = r0.indexOf(r2)
            return r2
    }

    @Override // java.util.List
    public int lastIndexOf(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            java.util.List r0 = r1.delegate()
            int r2 = r0.lastIndexOf(r2)
            return r2
    }

    @Override // java.util.List
    public java.util.ListIterator<E> listIterator() {
            r1 = this;
            java.util.List r0 = r1.delegate()
            java.util.ListIterator r0 = r0.listIterator()
            return r0
    }

    @Override // java.util.List
    public java.util.ListIterator<E> listIterator(int r2) {
            r1 = this;
            java.util.List r0 = r1.delegate()
            java.util.ListIterator r2 = r0.listIterator(r2)
            return r2
    }

    @Override // java.util.List
    @com.google.common.collect.ParametricNullness
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public E remove(int r2) {
            r1 = this;
            java.util.List r0 = r1.delegate()
            java.lang.Object r2 = r0.remove(r2)
            return r2
    }

    @Override // java.util.List
    @com.google.common.collect.ParametricNullness
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public E set(int r2, @com.google.common.collect.ParametricNullness E r3) {
            r1 = this;
            java.util.List r0 = r1.delegate()
            java.lang.Object r2 = r0.set(r2, r3)
            return r2
    }

    @Override // java.util.List
    public java.util.List<E> subList(int r2, int r3) {
            r1 = this;
            java.util.List r0 = r1.delegate()
            java.util.List r2 = r0.subList(r2, r3)
            return r2
    }
}
